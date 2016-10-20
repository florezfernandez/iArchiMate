package co.edu.uniandes.iArchimate.transformation.archi;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;

import co.edu.uniandes.iArchimate.utilities.emf.MetaModelUtilities;
import co.edu.uniandes.iArchimate.utilities.emf.ModelingUtilities;
import co.edu.uniandes.iArchimate.utilities.persistance.FileLoader;
import co.edu.uniandes.iArchimate.utilities.persistance.ModelLoader;

public class Archi2iArchimateTransformation {
	private Namespace namespace_xsi = Namespace.getNamespace("xsi", "http://www.w3.org/2001/XMLSchema-instance");
	private Namespace namespace_notation = Namespace.getNamespace("notation", "http://www.eclipse.org/gmf/runtime/1.0.2/notation");
	private Namespace namespace_xmi = Namespace.getNamespace("xmi", "http://www.omg.org/XMI");
	private Namespace namespace_iArchimate = Namespace.getNamespace("co.edu.uniandes.iArchimate", "http://co/edu/uniandes/iArchimate");
	
	private Map <String, ArchiElement>collectedArchiElements = new HashMap<String, ArchiElement>();
	private Map <String, ArchiRelation>collectedArchiRelations = new HashMap<String, ArchiRelation>();
	private ArrayList<ArchiDiagram>collectedArchiDiagrams = new ArrayList<ArchiDiagram>();
	
	private ArrayList<ArchiRelation> archiRelationsOfView;
	private Map<String, EObject> relationsOfView;
	private Map<String, EObject> elementsOfView;
	
	private String []archimateLayerTypes = {"business", "application", "technology", "motivation", "implementation_migration"};
	private EPackage intermediateMetaModel;
	private EObject iArchimateModel = null;
	private String iArchimateModelName="";
	private int id=1000;
	
	
	public String transformArchiModel(String archiModelPath, String iArchimateModelPath) {
		try {
			this.intermediateMetaModel = ModelLoader.loadMetaModel(URI.createURI(ModelingUtilities.EiMM_URI));		
			this.readArchiModel(ModelingUtilities.getAbsoluteWorkspacePath()+archiModelPath);
			this.buildiArchimateModelsAndDiagrams(iArchimateModelPath);
			return "Archi model imported succesfuly";
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
		
	}

	private void buildiArchimateModelsAndDiagrams(String iArchimateModelPath) throws Exception {
		EClass eClassModel = MetaModelUtilities.findEClass(this.intermediateMetaModel, "Model");
		Element iArchimateDiagramRootElement;
		Document iArchimateDiagram;
		for(ArchiDiagram archiDiagram : this.collectedArchiDiagrams){
			System.out.println("Building View: "+archiDiagram.getName());
			ArrayList<Integer> levels = new ArrayList<Integer>();
			levels.add(new Integer(0));
			this.archiRelationsOfView = new ArrayList<ArchiRelation>();
			this.relationsOfView = new HashMap<String, EObject>();
			this.elementsOfView = new HashMap<String, EObject>();
			this.iArchimateModel = this.intermediateMetaModel.getEFactoryInstance().create(eClassModel);
			this.iArchimateModelName = archiDiagram.getName().replace(" ", "_")+".iarchimate";
			
			iArchimateDiagramRootElement = new Element("Diagram", this.namespace_notation);
			iArchimateDiagramRootElement.setAttribute(new Attribute("version", "2.0", this.namespace_xmi));
			iArchimateDiagramRootElement.setAttribute(new Attribute("type", "IArchimate"));
			iArchimateDiagramRootElement.setAttribute(new Attribute("measurementUnit", "Pixel"));
			iArchimateDiagramRootElement.addNamespaceDeclaration(namespace_iArchimate);
			iArchimateDiagram = new Document(iArchimateDiagramRootElement);
			iArchimateDiagram.setRootElement(iArchimateDiagramRootElement);
			
			if(archiDiagram.getArchiGroups().size()>0){				
				this.buildGroups(eClassModel, this.iArchimateModel, archiDiagram.getArchiGroups(), iArchimateDiagramRootElement, levels);
			}
			if(archiDiagram.getArchiDiagramObjects().size()>0){
				this.buildDiagramObjects(eClassModel, this.iArchimateModel, archiDiagram.getArchiDiagramObjects(), iArchimateDiagramRootElement, levels);				
			}
			this.connectRelationsToElements();
			String modelPath = iArchimateModelPath+"/models/"+archiDiagram.getName().replace(" ", "_")+".iarchimate";
			String diagramPath = iArchimateModelPath+"/diagrams/"+archiDiagram.getName().replace(" ", "_")+".iarchimate_diagram";
			FileLoader.createFolderInProject(ModelingUtilities.getAbsoluteWorkspacePath()+iArchimateModelPath+"/diagrams");
		
			ModelLoader.saveModel(this.iArchimateModel, modelPath);
			
			Element diagramStyle = new Element("styles");
			diagramStyle.setAttribute(new Attribute("type", "notation:DiagramStyle", this.namespace_xmi));
			diagramStyle.setAttribute(new Attribute("id", "_"+this.id++, this.namespace_xmi));
			iArchimateDiagramRootElement.addContent(diagramStyle);

			Element model = new Element("element");
			model.setAttribute(new Attribute("type", "co.edu.uniandes.iArchimate:Model", this.namespace_xmi));
			model.setAttribute(new Attribute("href", "../models/"+archiDiagram.getName().replace(" ", "_")+".iarchimate#/"));
			iArchimateDiagramRootElement.addContent(model);
			FileLoader.saveXMLFile(iArchimateDiagram, ModelingUtilities.getAbsoluteWorkspacePath()+diagramPath);
			//FileLoader.saveXMLFile(iArchimateDiagram, diagramPath);
			
		}
	}
	
	@SuppressWarnings("unchecked")
	private void buildGroups(EClass eClassModelOrGroupOrElement, EObject newModelOrGroupOrElement, ArrayList<ArchiGroup> archiGroups, Element newDiagramRootOrGroupOrElement, ArrayList<Integer>levels) throws Exception {
		EClass eClassGroup = MetaModelUtilities.findEClass(this.intermediateMetaModel, "Group");
		EAttribute eAttributeNameInGroup = MetaModelUtilities.findEAttribute(eClassGroup, "name");
		EReference eReferenceComponentsInModelOrGroupOrElement = MetaModelUtilities.findEReference(eClassModelOrGroupOrElement, "components");				
		for(ArchiGroup archiGroup : archiGroups){
			//Group in the model
			EObject newGroup = this.intermediateMetaModel.getEFactoryInstance().create(eClassGroup);
			newGroup.eSet(eAttributeNameInGroup, archiGroup.getName());			
			((List<EObject>)newModelOrGroupOrElement.eGet(eReferenceComponentsInModelOrGroupOrElement)).add(newGroup);
			
			//Group in the Diagram
			Element newDiagramGroup = new Element("children");
			newDiagramGroup.setAttribute(new Attribute("type", "notation:Shape", this.namespace_xmi));
			newDiagramGroup.setAttribute(new Attribute("id", "_"+this.id++, this.namespace_xmi));
			newDiagramGroup.setAttribute(new Attribute("type", "2009"));
			Element decorationNode = new Element("children");
			decorationNode.setAttribute(new Attribute("type", "notation:DecorationNode", this.namespace_xmi));
			decorationNode.setAttribute(new Attribute("id", "_"+this.id++, this.namespace_xmi));
			decorationNode.setAttribute(new Attribute("type", "5029"));
			newDiagramGroup.addContent(decorationNode);
			Element basicCompartment = new Element("children");
			basicCompartment.setAttribute(new Attribute("type", "notation:BasicCompartment", this.namespace_xmi));
			basicCompartment.setAttribute(new Attribute("id", "_"+this.id++, this.namespace_xmi));
			basicCompartment.setAttribute(new Attribute("type", "7019"));
			newDiagramGroup.addContent(basicCompartment);

			//Recursive call to groups and objects
			levels.add(new Integer(0));
			if(archiGroup.getArchiGroups().size()>0){
				this.buildGroups(eClassGroup, newGroup, archiGroup.getArchiGroups(), basicCompartment, levels);
			}
			if(archiGroup.getArchiDiagramObjects().size()>0){
				this.buildDiagramObjects(eClassGroup, newGroup, archiGroup.getArchiDiagramObjects(), basicCompartment, levels);
			}
			levels.remove(levels.size()-1);
			Element hintedDiagramLinkStyle = new Element("styles");
			hintedDiagramLinkStyle.setAttribute(new Attribute("type", "notation:HintedDiagramLinkStyle", this.namespace_xmi));
			newDiagramGroup.addContent(hintedDiagramLinkStyle);
			Element iArchimateGroup = new Element("element");
			iArchimateGroup .setAttribute(new Attribute("type", "co.edu.uniandes.iArchimate:Group", this.namespace_xmi));
			String href = calculateHref(levels);
			iArchimateGroup .setAttribute(new Attribute("href", href));			
			newDiagramGroup.addContent(iArchimateGroup);			
			Element bounds = new Element("layoutConstraint");
			bounds.setAttribute(new Attribute("type", "notation:Bounds", this.namespace_xmi));
			bounds.setAttribute(new Attribute("id", "_"+this.id++, this.namespace_xmi));
			bounds.setAttribute(new Attribute("x", String.valueOf(archiGroup.getArchiBounds().getX())));
			bounds.setAttribute(new Attribute("y", String.valueOf(archiGroup.getArchiBounds().getY())));
			bounds.setAttribute(new Attribute("width", String.valueOf(archiGroup.getArchiBounds().getWidth())));				
			bounds.setAttribute(new Attribute("height", String.valueOf(archiGroup.getArchiBounds().getHeight())));				
			newDiagramGroup.addContent(bounds);
			newDiagramRootOrGroupOrElement.addContent(newDiagramGroup);
			
			levels.add(new Integer(levels.remove(levels.size()-1).intValue()+1));
		}
	}

	private String calculateHref(ArrayList<Integer> levels) {
		String href = "../models/"+this.iArchimateModelName+"#/";
		for(Integer level : levels){
			href+="/@components."+level;
		}		
		return href;
	}

	@SuppressWarnings({ "unchecked" })
	private void buildDiagramObjects(EClass eClassModelOrGroupOrElement, EObject newModelOrGroupOrElement, ArrayList<ArchiDiagramObject> archiDiagramObjects, Element newDiagramRootOrGroupOrElement, ArrayList<Integer>levels) throws Exception{
		EClass eClassElement = MetaModelUtilities.findEClass(this.intermediateMetaModel, "Element");
		EClass eClassAbsentElement = MetaModelUtilities.findEClass(this.intermediateMetaModel, "AbsentElement");
		EEnum eEnumElementTypeName = MetaModelUtilities.findEEnum(this.intermediateMetaModel, "ElementTypeName");
		EAttribute eAttributeTypeNameInElement = MetaModelUtilities.findEAttribute(eClassElement, "typeName");
		EAttribute eAttributeNameInElement = MetaModelUtilities.findEAttribute(eClassElement, "name");
		EReference eReferenceComponentsInModelOrGroupOrElement = MetaModelUtilities.findEReference(eClassModelOrGroupOrElement, "components");				
		for(ArchiDiagramObject archiDiagramObject : archiDiagramObjects){
			EObject newElementOrAbsentElement = null;
			String elementName="";
			boolean isAbsentElement=false;
			//Object in model
			if(!archiDiagramObject.getArchiElement().getName().substring(0, 1).equals("&")){
				newElementOrAbsentElement = this.intermediateMetaModel.getEFactoryInstance().create(eClassElement);
				elementName = archiDiagramObject.getArchiElement().getName();
			}else{
				newElementOrAbsentElement = this.intermediateMetaModel.getEFactoryInstance().create(eClassAbsentElement);				
				elementName = archiDiagramObject.getArchiElement().getName().substring(1);
				isAbsentElement=true;
			}
			
			this.elementsOfView.put(archiDiagramObject.getArchiElement().getId(), newElementOrAbsentElement);
			EEnumLiteral eEnumLiteralTypeName = MetaModelUtilities.findEEnumLiteral(eEnumElementTypeName, archiDiagramObject.getArchiElement().getArchimateConcept());
			newElementOrAbsentElement.eSet(eAttributeTypeNameInElement, eEnumLiteralTypeName);			
			newElementOrAbsentElement.eSet(eAttributeNameInElement, elementName);			
			this.addAttributesToElementOrRelation(eClassElement, newElementOrAbsentElement, archiDiagramObject.getArchiElement().getArchiProperties());
			this.buildRelations(eClassElement, newElementOrAbsentElement, archiDiagramObject);
			((List<EObject>)newModelOrGroupOrElement.eGet(eReferenceComponentsInModelOrGroupOrElement)).add(newElementOrAbsentElement);								
			
			//Object in the Diagram
			boolean isIntoComparment = levels.size()>1; 
			Element newDiagramElement = new Element("children");
			newDiagramElement.setAttribute(new Attribute("type", "notation:Node", this.namespace_xmi));
			newDiagramElement.setAttribute(new Attribute("id", "_"+this.id++, this.namespace_xmi));
			if(!isAbsentElement){
				if (isIntoComparment){
					newDiagramElement.setAttribute(new Attribute("type", "3025"));
				}else{
					newDiagramElement.setAttribute(new Attribute("type", "2010"));
				}	
			}else{
				if (isIntoComparment){
					newDiagramElement.setAttribute(new Attribute("type", "3023"));
				}else{
					newDiagramElement.setAttribute(new Attribute("type", "2008"));
				}				
			}

			Element decorationNode = new Element("children");
			decorationNode.setAttribute(new Attribute("type", "notation:DecorationNode", this.namespace_xmi));
			decorationNode.setAttribute(new Attribute("id", "_"+this.id++, this.namespace_xmi));
			if(!isAbsentElement){
				if (isIntoComparment){
					decorationNode.setAttribute(new Attribute("type", "5033"));
				}else{
					decorationNode.setAttribute(new Attribute("type", "5030"));
				}				
			}else{
				if (isIntoComparment){
					decorationNode.setAttribute(new Attribute("type", "5035"));
				}else{
					decorationNode.setAttribute(new Attribute("type", "5025"));
				}
			}
			newDiagramElement.addContent(decorationNode);
			Element basicCompartment = new Element("children");
			basicCompartment.setAttribute(new Attribute("type", "notation:BasicCompartment", this.namespace_xmi));
			basicCompartment.setAttribute(new Attribute("id", "_"+this.id++, this.namespace_xmi));
			if(!isAbsentElement){
				if (isIntoComparment){
					basicCompartment.setAttribute(new Attribute("type", "7035"));
				}else{
					basicCompartment.setAttribute(new Attribute("type", "7023"));
				}				
			}else{
				if (isIntoComparment){
					basicCompartment.setAttribute(new Attribute("type", "7032"));
				}else{
					basicCompartment.setAttribute(new Attribute("type", "7018"));
				}

			}
			newDiagramElement.addContent(basicCompartment);

			levels.add(new Integer(0));
			if(archiDiagramObject.getArchiGroups().size()>0){
				this.buildGroups(eClassElement, newElementOrAbsentElement, archiDiagramObject.getArchiGroups(), basicCompartment, levels);
			}
			if(archiDiagramObject.getArchiDiagramObjects().size()>0){
				this.buildDiagramObjects(eClassElement, newElementOrAbsentElement, archiDiagramObject.getArchiDiagramObjects(), basicCompartment, levels);
			}
			levels.remove(levels.size()-1);

			Element descriptionStyle = new Element("styles");
			descriptionStyle.setAttribute(new Attribute("type", "notation:DescriptionStyle", this.namespace_xmi));
			descriptionStyle.setAttribute(new Attribute("id", "_"+this.id++, this.namespace_xmi));
			newDiagramElement.addContent(descriptionStyle);

			Element fontStyle = new Element("styles");
			fontStyle.setAttribute(new Attribute("type", "notation:FontStyle", this.namespace_xmi));
			fontStyle.setAttribute(new Attribute("id", "_"+this.id++, this.namespace_xmi));
			fontStyle.setAttribute(new Attribute("fontName", "Segoe UI"));
			newDiagramElement.addContent(fontStyle);
				
			Element fillStyle = new Element("styles");
			fillStyle.setAttribute(new Attribute("type", "notation:FillStyle", this.namespace_xmi));
			if(archiDiagramObject.getFillColor10()!=-1){
				fillStyle.setAttribute(new Attribute("fillColor", String.valueOf(archiDiagramObject.getFillColor10())));
			}			
			fillStyle.setAttribute(new Attribute("id", "_"+this.id++, this.namespace_xmi));
			newDiagramElement.addContent(fillStyle);

			Element hintedDiagramLinkStyle = new Element("styles");
			hintedDiagramLinkStyle.setAttribute(new Attribute("type", "notation:HintedDiagramLinkStyle", this.namespace_xmi));
			hintedDiagramLinkStyle.setAttribute(new Attribute("id", "_"+this.id++, this.namespace_xmi));
			newDiagramElement.addContent(hintedDiagramLinkStyle);

			Element iArchimateGroup = new Element("element");
			iArchimateGroup .setAttribute(new Attribute("type", "co.edu.uniandes.iArchimate:Element", this.namespace_xmi));
			String href = calculateHref(levels);
			iArchimateGroup .setAttribute(new Attribute("href", href));			
			newDiagramElement.addContent(iArchimateGroup);
			
			Element bounds = new Element("layoutConstraint");
			bounds.setAttribute(new Attribute("type", "notation:Bounds", this.namespace_xmi));
			bounds.setAttribute(new Attribute("id", "_"+this.id++, this.namespace_xmi));
			if(eClassModelOrGroupOrElement.getName().equals("Element")){
				bounds.setAttribute(new Attribute("y", String.valueOf((archiDiagramObject.getArchiBounds().getY()-25))));				
			}else{
				bounds.setAttribute(new Attribute("y", String.valueOf((archiDiagramObject.getArchiBounds().getY()-18))));	
			}			
			bounds.setAttribute(new Attribute("x", String.valueOf((archiDiagramObject.getArchiBounds().getX())-10)));
			bounds.setAttribute(new Attribute("width", String.valueOf(archiDiagramObject.getArchiBounds().getWidth())));				
			bounds.setAttribute(new Attribute("height", String.valueOf(archiDiagramObject.getArchiBounds().getHeight())));				
			newDiagramElement.addContent(bounds);
			newDiagramRootOrGroupOrElement.addContent(newDiagramElement);			
			levels.add(new Integer(levels.remove(levels.size()-1).intValue()+1));
		}
	}

	@SuppressWarnings("unchecked")
	private void buildRelations(EClass eClassElement, EObject newElement, ArchiDiagramObject archiDiagramObject) throws Exception {
		EClass eClassModel = MetaModelUtilities.findEClass(this.intermediateMetaModel, "Model");
		EReference eReferenceRelationsInModel = MetaModelUtilities.findEReference(eClassModel, "relations");
		EClass eClassRelation = MetaModelUtilities.findEClass(this.intermediateMetaModel, "Relation");
		EAttribute eAttributeTypeNameInRelation = MetaModelUtilities.findEAttribute(eClassRelation, "typeName");
		EAttribute eAttributeNameInRelation = MetaModelUtilities.findEAttribute(eClassRelation, "name");
		for(ArchiRelation archiRelation : archiDiagramObject.getArchiRelations()){
			if(archiRelation.getName()==null || !archiRelation.getName().startsWith("&")){
				EObject newRelation = this.intermediateMetaModel.getEFactoryInstance().create(eClassRelation);
				this.relationsOfView.put(archiRelation.getId(), newRelation);
				this.archiRelationsOfView.add(archiRelation);
				EEnum eEnumRelationTypeName = MetaModelUtilities.findEEnum(this.intermediateMetaModel, "RelationTypeName");
				EEnumLiteral eEnumLiteralTypeName = MetaModelUtilities.findEEnumLiteral(eEnumRelationTypeName, archiRelation.getArchimateRelation());
				newRelation.eSet(eAttributeTypeNameInRelation, eEnumLiteralTypeName);
				newRelation.eSet(eAttributeNameInRelation, archiRelation.getName());
				this.addAttributesToElementOrRelation(eClassRelation, newRelation, archiRelation.getArchiProperties());
				((List<EObject>)this.iArchimateModel.eGet(eReferenceRelationsInModel)).add(newRelation);							
			}else{
				EClass eClassImperfectRelation = MetaModelUtilities.findEClass(this.intermediateMetaModel, "ImperfectRelation");
				EAttribute eAttributeImperfectionTypeInRelation = MetaModelUtilities.findEAttribute(eClassImperfectRelation, "imperfectionType");
				EAttribute eAttributeCertaintyDegreeInRelation = MetaModelUtilities.findEAttribute(eClassImperfectRelation, "certaintyDegree");
				EObject newImperfectRelation = this.intermediateMetaModel.getEFactoryInstance().create(eClassImperfectRelation);
				this.relationsOfView.put(archiRelation.getId(), newImperfectRelation);
				this.archiRelationsOfView.add(archiRelation);
				EEnum eEnumRelationTypeName = MetaModelUtilities.findEEnum(this.intermediateMetaModel, "RelationTypeName");
				EEnumLiteral eEnumLiteralTypeName = MetaModelUtilities.findEEnumLiteral(eEnumRelationTypeName, archiRelation.getArchimateRelation());
				newImperfectRelation.eSet(eAttributeTypeNameInRelation, eEnumLiteralTypeName);
				if(archiRelation.getName().contains(",")){
					newImperfectRelation.eSet(eAttributeNameInRelation, archiRelation.getName().lastIndexOf(","));					
				}else{
					newImperfectRelation.eSet(eAttributeNameInRelation, null);
				}
				
				int imperfectionType = Integer.parseInt(archiRelation.getName().substring(1,2));
				EEnum eEnumImperfectRelationType = MetaModelUtilities.findEEnum(this.intermediateMetaModel, "ImperfectRelationType");		 
				EEnumLiteral eEnumLiteralImperfectType = MetaModelUtilities.findEEnumLiteral(eEnumImperfectRelationType, imperfectionType);
				newImperfectRelation.eSet(eAttributeImperfectionTypeInRelation, eEnumLiteralImperfectType);
				
				double certaintyDegree = 0.0;
				if(imperfectionType==0){
					certaintyDegree=Double.parseDouble(archiRelation.getName().substring(2));
				}				
				newImperfectRelation.eSet(eAttributeCertaintyDegreeInRelation, certaintyDegree);
				this.addAttributesToElementOrRelation(eClassRelation, newImperfectRelation, archiRelation.getArchiProperties());
				((List<EObject>)this.iArchimateModel.eGet(eReferenceRelationsInModel)).add(newImperfectRelation);											
			}
		}
	}

	@SuppressWarnings("unchecked")
	private void connectRelationsToElements() throws Exception {
		EClass eClassRelation = MetaModelUtilities.findEClass(this.intermediateMetaModel, "Relation");
		EReference eReferenceSourceInRelation = MetaModelUtilities.findEReference(eClassRelation, "source");
		EReference eReferenceTargetInRelation = MetaModelUtilities.findEReference(eClassRelation, "target");
		EClass eClassElement = MetaModelUtilities.findEClass(this.intermediateMetaModel, "Element");
		EReference eReferenceRelationsInElement = MetaModelUtilities.findEReference(eClassElement, "relations");				
		for(ArchiRelation archiRelation: this.archiRelationsOfView){
			EObject relation = this.relationsOfView.get(archiRelation.getId());
			EObject relationSource = this.elementsOfView.get(archiRelation.getSource().getId());
			EObject relationTarget = this.elementsOfView.get(archiRelation.getTarget().getId());
			relation.eSet(eReferenceSourceInRelation, relationSource);
			relation.eSet(eReferenceTargetInRelation, relationTarget);
			((List<EObject>)relationSource.eGet(eReferenceRelationsInElement)).add(relation);			
		}		
	}
	
	@SuppressWarnings("unchecked")
	private void addAttributesToElementOrRelation(EClass eClassElementOrRelation, EObject newElementOrRelation, ArrayList<ArchiProperty> archiProperties) throws Exception {
		EClass eClassAttribute = MetaModelUtilities.findEClass(this.intermediateMetaModel, "Attribute");
		EAttribute eAttributeNameInAttribute = MetaModelUtilities.findEAttribute(eClassAttribute, "name");
		EAttribute eAttributeTypeInAttribute = MetaModelUtilities.findEAttribute(eClassAttribute, "type");
		EAttribute eAttributeValueInAttribute = MetaModelUtilities.findEAttribute(eClassAttribute, "value");
		EReference eReferenceAttributesInElement = MetaModelUtilities.findEReference(eClassElementOrRelation, "attributes");						
		for(ArchiProperty archiProperty : archiProperties){
			if(!archiProperty.getKey().startsWith("&")){
				EObject newAttribute = this.intermediateMetaModel.getEFactoryInstance().create(eClassAttribute);
				int attributeType = 2;
				String attributeName = archiProperty.getKey();
				if(attributeName.contains(":")){
					attributeType=Integer.valueOf(attributeName.substring(attributeName.length()-1));
					attributeName=attributeName.substring(0,attributeName.indexOf(":"));
				}				
				newAttribute.eSet(eAttributeNameInAttribute, attributeName);			
				EEnum eEnumAttributeType = MetaModelUtilities.findEEnum(this.intermediateMetaModel, "AttributeTypeValue");
				EEnumLiteral eEnumLiteralType = MetaModelUtilities.findEEnumLiteral(eEnumAttributeType, attributeType);			
				newAttribute.eSet(eAttributeTypeInAttribute, eEnumLiteralType);	
				newAttribute.eSet(eAttributeValueInAttribute, archiProperty.getValue());
				((List<EObject>)newElementOrRelation.eGet(eReferenceAttributesInElement)).add(newAttribute);			
				
			}else{
				EClass eClassImperfectAttribute = MetaModelUtilities.findEClass(this.intermediateMetaModel, "ImperfectAttribute");
				EAttribute eAttributeImperfectionTypeInImperfectAttribute = MetaModelUtilities.findEAttribute(eClassImperfectAttribute, "imperfectionType");
				EObject newImperfectAttribute = this.intermediateMetaModel.getEFactoryInstance().create(eClassImperfectAttribute);
				newImperfectAttribute.eSet(eAttributeNameInAttribute, archiProperty.getKey().substring(2));			
				EEnum eEnumAttributeType = MetaModelUtilities.findEEnum(this.intermediateMetaModel, "AttributeTypeValue");
				EEnumLiteral eEnumLiteralType = MetaModelUtilities.findEEnumLiteral(eEnumAttributeType, "EString");			
				newImperfectAttribute.eSet(eAttributeTypeInAttribute, eEnumLiteralType);	
				newImperfectAttribute.eSet(eAttributeValueInAttribute, archiProperty.getValue());
			
				int imperfectionType = Integer.parseInt(archiProperty.getKey().substring(1,2));
				EEnum eEnumImperfectAttributeType = MetaModelUtilities.findEEnum(this.intermediateMetaModel, "ImperfectAttributeTypeValue");
				EEnumLiteral eEnumLiteralImperfectType = MetaModelUtilities.findEEnumLiteral(eEnumImperfectAttributeType, imperfectionType);			
				newImperfectAttribute.eSet(eAttributeImperfectionTypeInImperfectAttribute, eEnumLiteralImperfectType);
				((List<EObject>)newElementOrRelation.eGet(eReferenceAttributesInElement)).add(newImperfectAttribute);			
			}
		}		
	}

	@SuppressWarnings({ "unchecked" })
	private void readArchiModel(String archiModelPath) throws Exception{
		SAXBuilder builder = new SAXBuilder();
		File xmlFile = new File(archiModelPath);
		Document document = (Document) builder.build(xmlFile);
		Element rootNode = document.getRootElement();
		List <Element>folders = new ArrayList<Element>();
		folders = rootNode.getChildren("folder");
		for (Element folder : folders) {
			if(isArchimateLayerType(folder.getAttributeValue("type"))){
				this.collectElements(folder, folder.getAttributeValue("type"));
			}else if(folder.getAttributeValue("type").equals("relations")){
				this.collectRelations(folder);				
			}else if(folder.getAttributeValue("type").equals("diagrams")){
				this.collectDiagrams(folder);								
			}
		}
	}		

	private boolean isArchimateLayerType(String type){
		for(int i=0; i<archimateLayerTypes.length; i++){
			if(archimateLayerTypes[i].equals(type)){
				return true;
			}
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	private void collectElements(Element folder, String layer){
		List <Element>subFolders = new ArrayList<Element>();
		subFolders = folder.getChildren("folder");
		for (Element subFolder : subFolders) {
			this.collectElements(subFolder, layer);
		}
		
		List <Element>archiElements = new ArrayList<Element>();
		archiElements = folder.getChildren("element");
		for (Element archiElement : archiElements) {
			String type = archiElement.getAttributeValue("type",this.namespace_xsi);
			type = type.substring(type.lastIndexOf(":")+1);
			ArchiElement createdArchiElement = new ArchiElement(archiElement.getAttributeValue("id"), layer, type, archiElement.getAttributeValue("name")); 
			createdArchiElement.setArchiProperties(this.collectProperties(archiElement));
			this.collectedArchiElements.put(archiElement.getAttributeValue("id"), createdArchiElement);
		}
	}
	
	@SuppressWarnings("unchecked")
	private void collectRelations(Element folder) {
		List <Element>subFolders = new ArrayList<Element>();
		subFolders = folder.getChildren("folder");
		for (Element subFolder : subFolders) {
			this.collectRelations(subFolder);
		}
		
		List <Element>archiRelations = new ArrayList<Element>();
		archiRelations = folder.getChildren("element");
		for (Element archiRelation : archiRelations) {
			ArchiElement source = this.collectedArchiElements.get(archiRelation.getAttributeValue("source"));
			ArchiElement target = this.collectedArchiElements.get(archiRelation.getAttributeValue("target"));
			String type = archiRelation.getAttributeValue("type",this.namespace_xsi);
			type = type.substring(type.lastIndexOf(":")+1);
			type = type.substring(0,type.lastIndexOf("Relation"));
			if(type.equals("Realisation")){
				type="Realization";
			}
			ArchiRelation createdArchiRelation = new ArchiRelation(archiRelation.getAttributeValue("id"), archiRelation.getAttributeValue("name"), type, source, target);
			createdArchiRelation.setArchiProperties(this.collectProperties(archiRelation));
			this.collectedArchiRelations.put(archiRelation.getAttributeValue("id"), createdArchiRelation);
		}		
	}
	
	@SuppressWarnings("unchecked")
	private ArrayList<ArchiProperty> collectProperties(Element archiElementOrRelation){
		ArrayList<ArchiProperty> createdArchiProperties = new ArrayList<ArchiProperty>();
		List <Element> archiProperties = new ArrayList<Element>();
		archiProperties = archiElementOrRelation.getChildren("property");
		for(Element archiProperty : archiProperties){
			ArchiProperty createdArchiProperty = new ArchiProperty(archiProperty.getAttributeValue("key"), archiProperty.getAttributeValue("value"));
			createdArchiProperties.add(createdArchiProperty);
		}
		return createdArchiProperties;		
	}

	@SuppressWarnings("unchecked")
	private void collectDiagrams(Element folder) {
		List <Element>archiDiagrams = new ArrayList<Element>();
		archiDiagrams = folder.getChildren("element");
		for (Element archiDiagram : archiDiagrams) {
			ArchiDiagram createdArchiDiagram = new ArchiDiagram(archiDiagram.getAttributeValue("id"), archiDiagram.getAttributeValue("name"), archiDiagram.getAttributeValue("viewpoint"));
			List <Element>archiGroupsOrDiagramObjects = new ArrayList<Element>();
			archiGroupsOrDiagramObjects = archiDiagram.getChildren("child");
			for (Element archiGroupOrDiagramObject : archiGroupsOrDiagramObjects) {
				if(archiGroupOrDiagramObject.getAttributeValue("type",this.namespace_xsi).equals("archimate:Group")){
					createdArchiDiagram.addArchiGroups(this.collectGroup(archiGroupOrDiagramObject));				
				}else if(archiGroupOrDiagramObject.getAttributeValue("type",this.namespace_xsi).equals("archimate:DiagramObject")){
					createdArchiDiagram.addArchiDiagramObject(this.collectDiagramObject(archiGroupOrDiagramObject));
				}
			}		
			this.collectedArchiDiagrams.add(createdArchiDiagram);
		}		
		
	}

	@SuppressWarnings("unchecked")
	private ArchiGroup collectGroup(Element archiGroup) {
		List <Element>archiGroupsOrDiagramObjects = new ArrayList<Element>();
		archiGroupsOrDiagramObjects = archiGroup.getChildren("child");
		ArchiGroup createdArchiGroup = new ArchiGroup(archiGroup.getAttributeValue("id"), archiGroup.getAttributeValue("name"));
		createdArchiGroup.setArchiBounds(this.collectBounds(archiGroup));
		for (Element archiGroupOrDiagramObject : archiGroupsOrDiagramObjects) {
			if(archiGroupOrDiagramObject.getAttributeValue("type",this.namespace_xsi).equals("archimate:Group")){
				createdArchiGroup.addArchiGroups(this.collectGroup(archiGroupOrDiagramObject));				
			}else if(archiGroupOrDiagramObject.getAttributeValue("type",this.namespace_xsi).equals("archimate:DiagramObject")){
				createdArchiGroup.addArchiDiagramObject(this.collectDiagramObject(archiGroupOrDiagramObject));
			}
		}		
		return createdArchiGroup;		
	}

	@SuppressWarnings("unchecked")
	private ArchiDiagramObject collectDiagramObject(Element archiDiagramObject) {
		ArchiDiagramObject createdArchiDiagramObject = new ArchiDiagramObject(archiDiagramObject.getAttributeValue("id"), archiDiagramObject.getAttributeValue("fillColor"), this.collectedArchiElements.get(archiDiagramObject.getAttributeValue("archimateElement")));
		createdArchiDiagramObject.setArchiBounds(this.collectBounds(archiDiagramObject));
		createdArchiDiagramObject.setArchiRelations(this.collectAssociatedRelations(archiDiagramObject));									

		List <Element>archiDiagramObjects = new ArrayList<Element>();
		archiDiagramObjects = archiDiagramObject.getChildren("child");
		if(archiDiagramObjects.size()>0){
			for (Element archiSubDiagramObject : archiDiagramObjects) {
				createdArchiDiagramObject.addArchiDiagramObject(this.collectDiagramObject(archiSubDiagramObject));
			}
		}
		return createdArchiDiagramObject;
	}

	private ArchiBounds collectBounds(Element archiElement) {
		Element archiBounds = archiElement.getChild("bounds");
		int x = 0;
		if(archiBounds.getAttributeValue("x")!=null){
			x = Integer.parseInt(archiBounds.getAttributeValue("x"));
		}
		int y = 0;
		if(archiBounds.getAttributeValue("y")!=null){
			y = Integer.parseInt(archiBounds.getAttributeValue("y"));			
		}
		int width = 120;
		if(archiBounds.getAttributeValue("width")!=null){
			width = Integer.parseInt(archiBounds.getAttributeValue("width"));
		}
		int height = 55;
		if(archiBounds.getAttributeValue("height")!=null){
			height = Integer.parseInt(archiBounds.getAttributeValue("height"));
		}
		return new ArchiBounds(x, y, width, height);
	}

	@SuppressWarnings({ "unchecked" })
	private ArrayList<ArchiRelation> collectAssociatedRelations(Element archiDiagramObject) {
		ArrayList<ArchiRelation> associatedRelations = new ArrayList<ArchiRelation>();
		List <Element>archiSourceConnections = new ArrayList<Element>();
		archiSourceConnections = archiDiagramObject.getChildren("sourceConnection");
		for (Element archiSourceConnection : archiSourceConnections) {
			associatedRelations.add(this.collectedArchiRelations.get(archiSourceConnection.getAttributeValue("relationship")));
		}		
		return associatedRelations;		
	}

	public void initTest() throws Exception{
		this.intermediateMetaModel = ModelLoader.loadMetaModel("C:/Users/HectorFlorez/Dropbox/workspace iArchimate/co.edu.uniandes.iArchimate/model/iArchimate.ecore");				
	}

	public static void main(String[] args) {
		Archi2iArchimateTransformation archi2iArchimateTransformation = new Archi2iArchimateTransformation();
		try {
			archi2iArchimateTransformation.initTest();
			archi2iArchimateTransformation.readArchiModel("C:/Users/HectorFlorez/Dropbox/runtime-EclipseApplication/test3/Archisurance.archimate");
			archi2iArchimateTransformation.buildiArchimateModelsAndDiagrams("results");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}	
}
