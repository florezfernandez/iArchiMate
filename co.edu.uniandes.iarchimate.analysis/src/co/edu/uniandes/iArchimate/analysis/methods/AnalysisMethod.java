package co.edu.uniandes.iArchimate.analysis.methods;

import iArchimate.Attribute;
import iArchimate.AttributeTypeValue;
import iArchimate.IArchimateFactory;
import iArchimate.Relation;
import iArchimate.diagram.edit.parts.AbsentElement2EditPart;
import iArchimate.diagram.edit.parts.AbsentElementEditPart;
import iArchimate.diagram.edit.parts.Element2EditPart;
import iArchimate.diagram.edit.parts.ElementEditPart;
import iArchimate.diagram.edit.parts.GroupEditPart;
import iArchimate.diagram.edit.parts.ModelEditPart;
import iArchimate.diagram.part.IArchimateDiagramEditor;
import iArchimate.impl.ElementImpl;
import iArchimate.impl.ModelImpl;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;

import co.edu.uniandes.iArchimate.analysis.AffectedConcept;
import co.edu.uniandes.iArchimate.analysis.AnalysisMethodReport;
import co.edu.uniandes.iArchimate.utilities.emf.ModelingUtilities;
import co.edu.uniandes.iArchimate.utilities.persistance.PropertiesLoader;

public abstract class AnalysisMethod {
	protected ArrayList<AffectedConcept> affectedConcepts = new ArrayList<AffectedConcept>();
	protected AnalysisMethodReport analysisMethodReport;
	protected String concept;
	protected String analysisMethod;
	protected String validationFileName;
	protected ArrayList<String[]> chartDataReport = new ArrayList<String[]>();
	protected ArrayList<ArrayList<String[]>> multipleLineChartDataReport = new ArrayList<ArrayList<String[]>>();
	protected ArrayList<ArrayList<String[]>> multiplePolarChartDataReport = new ArrayList<ArrayList<String[]>>();
	protected ArrayList<String> multipleYLabels = new ArrayList<String>();
	protected ArrayList<ArrayList<String>> multipleTicks = new ArrayList<ArrayList<String>>();
	protected ArrayList<String[]> multipleSeries = new ArrayList<String[]>();
	protected ArrayList<String> multiplePolarTitles = new ArrayList<String>();
	protected ArrayList<String[]> stackedBarChartDataReport = new ArrayList<String[]>();

	@SuppressWarnings("rawtypes")
	protected List editParts;
	protected ModelEditPart modelEditPart;

	public AnalysisMethod() {
		IArchimateDiagramEditor iArchimateEditor = (IArchimateDiagramEditor)ModelingUtilities.getModelEditorPart();
		modelEditPart = (ModelEditPart)iArchimateEditor.getDiagramEditPart();
		editParts = modelEditPart.getChildren();
	}
	
	public ArrayList<AffectedConcept> getAffectedConcepts() {
		return affectedConcepts;
	}	
	
	public AnalysisMethodReport getAnalysisMethodReport() {
		return analysisMethodReport;
	}
	
	public String getConcept() {
		return concept;
	}

	public String getAnalysisMethod() {
		return analysisMethod;
	}

	public String getValidationFileName() {
		return validationFileName;
	}

	public ArrayList<String[]> getChartDataReport() {
		return chartDataReport;
	}

	
	public ArrayList<ArrayList<String[]>> getMultipleLineChartDataReport() {
		return multipleLineChartDataReport;
	}

	public ArrayList<ArrayList<String[]>> getMultiplePolarChartDataReport() {
		return multiplePolarChartDataReport;
	}

	public ArrayList<String> getMultipleYLabels() {
		return multipleYLabels;
	}

	public ArrayList<ArrayList<String>> getMultipleTicks() {
		return multipleTicks;
	}
	
	public ArrayList<String[]> getMultipleSeries() {
		return multipleSeries;
	}

	public ArrayList<String> getMultipleTitles() {
		return multiplePolarTitles;
	}

	public ArrayList<String[]> getStackedBarChartDataReport() {
		return stackedBarChartDataReport;
	}

	public String selectAnalysisMethod(){
		try {
			final URL urlSource = FileLocator.toFileURL(new URL("platform:/plugin/co.edu.uniandes.iArchimate.analysis/rulesFiles/"+this.validationFileName+".evl"));
			AnalysisMethodHelper.copyValidationFile(urlSource);
			String propertiesPath = ModelingUtilities.getAbsolutProjectPath()+"/analysis.properties";		
			String [][]propertiesValues = {{"concept", this.concept},{"analysisMethod", this.analysisMethod}};
			PropertiesLoader.storeProperty(propertiesPath, propertiesValues);
			return "Analysis Method Selected: "+this.concept+" -> "+this.analysisMethod;
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}		
	}
		
	protected ArrayList<ElementImpl> findArrayOfElementImpl(String elementTypeName){
		ArrayList<ElementImpl> elementsImpls=new ArrayList<ElementImpl>();
		for(Object editPart : editParts){
			if(editPart instanceof ElementEditPart){
				ElementEditPart elementEditPart = (ElementEditPart)editPart;
				ElementImpl elementImpl = (ElementImpl)((NodeImpl)elementEditPart.getModel()).getElement();
				if(elementImpl.getTypeName().toString().equals(elementTypeName)){
					elementsImpls.add(elementImpl);
				}
				ArrayList<ElementImpl> subElementsImpls=new ArrayList<ElementImpl>();
				ShapeCompartmentEditPart compartment = (ShapeCompartmentEditPart)elementEditPart.getChildren().get(1);
				subElementsImpls = findArrayOfElementImplInCompartmentEditPart(compartment,elementTypeName);
				elementsImpls.addAll(subElementsImpls);				
			}else if(editPart instanceof GroupEditPart) {
				GroupEditPart groupEditPart = (GroupEditPart)editPart;
				ArrayList<ElementImpl> subElementsImpls=new ArrayList<ElementImpl>();
				ShapeCompartmentEditPart compartment = (ShapeCompartmentEditPart)groupEditPart.getChildren().get(1);
				subElementsImpls = findArrayOfElementImplInCompartmentEditPart(compartment,elementTypeName);
				elementsImpls.addAll(subElementsImpls);												
			}
		}
		return elementsImpls;
	}
	
	protected ElementImpl findElementImpl(String elementTypeName, String elementName){
		ArrayList<ElementImpl> elements = findArrayOfElementImpl(elementTypeName);
		for(ElementImpl element : elements){
			if(element.getName().equals(elementName)){
				return element;
			}
		}
		return null;
	}

	protected ArrayList<ElementImpl> findArrayOfRootElementImpl(String elementTypeName){
		ArrayList<ElementImpl> elementsImpls=new ArrayList<ElementImpl>();
		for(Object editPart : editParts){
			if(editPart instanceof ElementEditPart){
				ElementEditPart elementEditPart = (ElementEditPart)editPart;
				ElementImpl elementImpl = (ElementImpl)((NodeImpl)elementEditPart.getModel()).getElement();
				if(elementImpl.getTypeName().toString().equals(elementTypeName)){
					elementsImpls.add(elementImpl);
				}				
			}
		}
		return elementsImpls;
	}

	@SuppressWarnings("rawtypes")
	protected ArrayList<ElementImpl> findArrayOfElementImplInCompartmentEditPart(ShapeCompartmentEditPart compartment, String elementTypeName) {
		ArrayList<ElementImpl> elementsImpls=new ArrayList<ElementImpl>();
		if(compartment.getChildren().size()>0){
			List editPartsInCompartment = compartment.getChildren();
			for(Object editPartInCompartment : editPartsInCompartment){
				ShapeNodeEditPart elementEditPart=null;
				if(editPartInCompartment instanceof ElementEditPart){
					elementEditPart = (ElementEditPart)editPartInCompartment;
				}else if(editPartInCompartment instanceof Element2EditPart){
					elementEditPart = (Element2EditPart)editPartInCompartment;
				}else if(editPartInCompartment instanceof AbsentElementEditPart){
					elementEditPart = (AbsentElementEditPart)editPartInCompartment;
				}else if(editPartInCompartment instanceof AbsentElement2EditPart){
					elementEditPart = (AbsentElement2EditPart)editPartInCompartment;
				}
				ElementImpl elementImpl = (ElementImpl)((NodeImpl)elementEditPart.getModel()).getElement();		
				if(elementImpl.getTypeName().toString().equals(elementTypeName)){
					elementsImpls.add(elementImpl);
				}
				ArrayList<ElementImpl> subElementsImpls=new ArrayList<ElementImpl>();
				ShapeCompartmentEditPart subCompartment = (ShapeCompartmentEditPart)elementEditPart.getChildren().get(1);
				subElementsImpls = findArrayOfElementImplInCompartmentEditPart(subCompartment,elementTypeName);
				elementsImpls.addAll(subElementsImpls);
			}
		}
		return elementsImpls;
	}

	protected ArrayList<ElementImpl> findArrayOfElementImplByTarget(String targetName){
		ArrayList<ElementImpl> elementsImpls=new ArrayList<ElementImpl>();
		for(Object editPart : editParts){
			if(editPart instanceof ElementEditPart){
				ElementEditPart elementEditPart = (ElementEditPart)editPart;
				ElementImpl elementImpl = (ElementImpl)((NodeImpl)elementEditPart.getModel()).getElement();
				EList<Relation> elementImplRelations = elementImpl.getRelations();
				for(Relation elementImplRelation : elementImplRelations){
					if(elementImplRelation.getTarget().getName().equals(targetName)) {
						elementsImpls.add((ElementImpl)elementImpl);							
					}
				}				
			}
		}
		return elementsImpls;
	}

	protected ArrayList<ElementImpl> findArrayOfElementImplByAttribute(String attributeName){
		ArrayList<ElementImpl> elementsImpls=new ArrayList<ElementImpl>();
		for(Object editPart : editParts){
			if(editPart instanceof ElementEditPart){
				ElementEditPart elementEditPart = (ElementEditPart)editPart;
				ElementImpl elementImpl = (ElementImpl)((NodeImpl)elementEditPart.getModel()).getElement();
				EList<Attribute> attributesInElementImpl = elementImpl.getAttributes();
				for(Attribute attributeInElementImpl : attributesInElementImpl){
					if(attributeInElementImpl.getName().equals(attributeName)){
						elementsImpls.add(elementImpl);
						break;
					}
				}				
			}
		}
		return elementsImpls;
	}

	protected String createOrUpdateAttributeInElementImpl(ElementImpl elementImpl, Attribute newAttribute){
		EList<Attribute> elementAttributes=elementImpl.getAttributes();
		for(Attribute attribute : elementAttributes){
			if(attribute.getName().equals(newAttribute.getName())){
				try {
					attribute.setType(newAttribute.getType());	
				} catch (Exception e) {
				}
				try {
					attribute.setValue(newAttribute.getValue());					
				} catch (Exception e) {
				}
				return AnalysisMethodHelper.UPDATED;
			}
		}
		try {
			elementAttributes.add(newAttribute);				
		} catch (Exception e) {	
		}
		return AnalysisMethodHelper.CREATED;
	}	

	protected boolean existAttribute(ElementImpl elementImpl, String attributeName){
		EList<Attribute> elementAttributes=elementImpl.getAttributes();
		for(Attribute attribute : elementAttributes){
			if(attribute.getName().equals(attributeName)){
				return true;
			}
		}
		return false;		
	}
	
	protected void createRelationBetweenElementImpl(ElementImpl elementImplSource, ElementImpl elementImplTarget, Relation newRelation){
		try { 
			ModelImpl modelImpl = (ModelImpl)((DiagramImpl)modelEditPart.getModel()).getElement();		
			modelImpl.getRelations().add(newRelation);
		} catch (Exception e) {	
		}
		try {
			elementImplSource.getRelations().add(newRelation);					
		} catch (Exception e) {
		}
	}	

	protected void deleteRelationBetweenElementImpl(ElementImpl elementImplSource, ElementImpl elementImplTarget, String relationName){
		try {
			for(Relation relation : elementImplSource.getRelations()){
				if(relation.getName().equals(relationName) && relation.getTarget()==elementImplTarget){ 
					elementImplSource.getRelations().remove(relation);										
				}
			}		
		} catch (Exception e) {
		}		
		try { 
			ModelImpl modelImpl = (ModelImpl)((DiagramImpl)modelEditPart.getModel()).getElement();		
			for(Relation relation : modelImpl.getRelations()){
				if(relation.getName().equals(relationName) && relation.getSource()==elementImplSource && relation.getTarget()==elementImplTarget){ 
					modelImpl.getRelations().remove(relation);
				}
			}					
		} catch (Exception e) {	
		}
	}

	protected void calculateAndCreateDoubleAttribute(ArrayList<ElementImpl> targets, ArrayList<ArrayList<ElementImpl>> collectionOfSources, String targetAttributeName, String sourceAttributeName){
		for(ElementImpl target : targets){
			if(!existAttribute(target, targetAttributeName)){
				double attributeValue = 1;
				int numberOfSources = 0;
				String associatedSources="";
				for(ArrayList<ElementImpl> sources : collectionOfSources){
					for(ElementImpl source : sources){
						EList<Relation> sourceRelations = source.getRelations();
						for(Relation sourceRelation : sourceRelations){
							if(sourceRelation.getTarget().getName().equals(target.getName())){
								EList<Attribute> attributesInSource = source.getAttributes();
								for(Attribute attributeInSource : attributesInSource){
									if(attributeInSource.getName().equals(sourceAttributeName)){
										double attributeInSourceValue = Double.parseDouble(attributeInSource.getValue());
										attributeValue*=attributeInSourceValue;	
										numberOfSources++;
										associatedSources+=source.getName()+":"+sourceAttributeName+"="+attributeInSourceValue+". ";
									}
								}	
							}						
						}
					}				
				}
				if(targetAttributeName.equals(AnalysisMethodHelper.ATT_AVAILABILITY) ||
				   targetAttributeName.equals(AnalysisMethodHelper.ATT_FAULT_SUCSEPTIBILITY) && attributeValue!=1){
					if(targetAttributeName.equals(AnalysisMethodHelper.ATT_FAULT_SUCSEPTIBILITY)){
						attributeValue=1-attributeValue;
					}
					attributeValue=(double)(Math.round(attributeValue*10000))/10000;
					Attribute newAttribute = IArchimateFactory.eINSTANCE.createAttribute();
					newAttribute.setName(targetAttributeName);
					newAttribute.setType(AttributeTypeValue.EDOUBLE);
					newAttribute.setValue(String.valueOf(attributeValue));			
					String []registry = new String[this.analysisMethodReport.getTitles().length];
					registry[0]=target.getTypeName().getName();
					registry[1]=target.getName();
					registry[2]=targetAttributeName+"="+String.valueOf(attributeValue);
					registry[3]="("+numberOfSources+") "+associatedSources;
					registry[4]=createOrUpdateAttributeInElementImpl(target, newAttribute);
					this.analysisMethodReport.addRegistry(registry);
					
				}				
			}
		}
	}

	public abstract String getDescription();
	public abstract void initAffectedConcepts();
	public abstract String performAnalysisMethod();
}
