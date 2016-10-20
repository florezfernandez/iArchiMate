package co.edu.uniandes.iArchimate.utilities.emf;

import iArchimate.Attribute;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import co.edu.uniandes.iArchimate.utilities.ocl.OclHandler;
import co.edu.uniandes.iArchimate.utilities.persistance.ModelLoader;

public class ModelUtilities {
	
	@SuppressWarnings("unchecked")
	public ArrayList<EObject> getModelExtensions(EObject activeModel){
		ArrayList<EObject> modelExtensions = new ArrayList<EObject>();
		try {
			OclHandler oclHandler = new OclHandler(activeModel);			
			modelExtensions = (ArrayList<EObject>)oclHandler.evaluate("ModelExtension.allInstances()->asSequence()");			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelExtensions;
	}

	@SuppressWarnings("unchecked")
	public static EObject getElementByName(EObject activeModel, String elementName){
		ArrayList<EObject> elements = new ArrayList<EObject>();
		try {
			OclHandler oclHandler = new OclHandler(activeModel);			
			elements = (ArrayList<EObject>)oclHandler.evaluate("Element.allInstances()->asSequence()->select(e:Element | e.name='"+elementName+"')");			
			return (elements.size()>0) ? elements.get(0) : null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public static ArrayList<EObject> getElementsByTypeName(EObject activeModel, String elementTypeName){
		ArrayList<EObject> elements = new ArrayList<EObject>();
		try {
			OclHandler oclHandler = new OclHandler(activeModel);			
			elements = (ArrayList<EObject>)oclHandler.evaluate("Element.allInstances()->asSequence()->select(e:Element | e.typeName=ElementTypeName::"+elementTypeName+")");			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return elements;
	}

	@SuppressWarnings("unchecked")
	public static ArrayList<EObject> getElements(EObject activeModel){
		ArrayList<EObject> attributes = new ArrayList<EObject>();
		try {
			OclHandler oclHandler = new OclHandler(activeModel);			
			attributes = (ArrayList<EObject>)oclHandler.evaluate("Element.allInstances()->asSequence()");			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return attributes;
	}

	@SuppressWarnings("unchecked")
	public static ArrayList<EObject> getAbsentElements(EObject activeModel){
		ArrayList<EObject> attributes = new ArrayList<EObject>();
		try {
			OclHandler oclHandler = new OclHandler(activeModel);			
			attributes = (ArrayList<EObject>)oclHandler.evaluate("AbsentElement.allInstances()->asSequence()");			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return attributes;
	}

	@SuppressWarnings("unchecked")
	public static ArrayList<EObject> getAttributes(EObject activeModel){
		ArrayList<EObject> attributes = new ArrayList<EObject>();
		try {
			OclHandler oclHandler = new OclHandler(activeModel);			
			attributes = (ArrayList<EObject>)oclHandler.evaluate("Attribute.allInstances()->asSequence()");			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return attributes;
	}

	@SuppressWarnings("unchecked")
	public static ArrayList<EObject> getImperfectAttributes(EObject activeModel){
		ArrayList<EObject> imperfectAttributes = new ArrayList<EObject>();
		try {
			OclHandler oclHandler = new OclHandler(activeModel);			
			imperfectAttributes = (ArrayList<EObject>)oclHandler.evaluate("ImperfectAttribute.allInstances()->asSequence()");			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return imperfectAttributes;
	}

	@SuppressWarnings("unchecked")
	public static ArrayList<EObject> getRelations(EObject activeModel){
		ArrayList<EObject> relations = new ArrayList<EObject>();
		try {
			OclHandler oclHandler = new OclHandler(activeModel);			
			relations = (ArrayList<EObject>)oclHandler.evaluate("Relation.allInstances()->asSequence()");			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return relations;
	}

	@SuppressWarnings("unchecked")
	public static ArrayList<EObject> getImperfectRelations(EObject activeModel){
		ArrayList<EObject> imperfectRelations = new ArrayList<EObject>();
		try {
			OclHandler oclHandler = new OclHandler(activeModel);			
			imperfectRelations = (ArrayList<EObject>)oclHandler.evaluate("ImperfectRelation.allInstances()->asSequence()");			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return imperfectRelations;
	}

	public static ArrayList<Integer> numberOfImperfectComponentsByLevel(EPackage intermediateMetaModel, EPackage domainMetaModel, EClass domainMetaModelRoot, EObject activeModel) throws Exception{
		ArrayList<EObject> possibleRoots = ModelUtilities.getRootObject(intermediateMetaModel, domainMetaModelRoot, activeModel);
		if(possibleRoots.size()!=1){
			throw new Exception("The model must have just one root. (One instance of the class "+domainMetaModelRoot.getName()+")");
		}
		EObject modelRoot = possibleRoots.get(0);		
		ArrayList<Integer> results = new ArrayList<Integer>();
		ArrayList<EObject> elementsToVisit = new ArrayList<EObject>();
		ArrayList<EObject> children = new ArrayList<EObject>();
		elementsToVisit.add(modelRoot);
		int numberOfImperfectElements=0;
		while(elementsToVisit.size()>0){
			EObject tempElement = elementsToVisit.remove(0);
			numberOfImperfectElements += ModelUtilities.numOfImperfectElements(intermediateMetaModel, tempElement);
			children.addAll(ModelUtilities.childrenOfElement(intermediateMetaModel, tempElement));
			if(elementsToVisit.isEmpty()){
				results.add(new Integer(numberOfImperfectElements));
				numberOfImperfectElements=0;
				elementsToVisit.addAll(children);
				children.clear();
			}			
		}
		return results;
	}

	@SuppressWarnings("unchecked")
	private static ArrayList<EObject> childrenOfElement(EPackage intermediateMetaModel, EObject element) {
		ArrayList<EObject> children = new ArrayList<EObject>();
		try {
			EClass elementClass = MetaModelUtilities.findEClass(intermediateMetaModel, "Element");
			EReference referenceOfRelations = MetaModelUtilities.findEReference(elementClass, "relations");
			EList<EObject> referencesOfRelations = (EList<EObject>)element.eGet(referenceOfRelations);
			EClass relationClass = MetaModelUtilities.findEClass(intermediateMetaModel, "Relation");
			EReference targetOfRelations = MetaModelUtilities.findEReference(relationClass, "target");
			for(int i=0; i<referencesOfRelations.size(); i++){
				if(referencesOfRelations.get(i).eClass().getName().equals("ContainmentRelation") || referencesOfRelations.get(i).eClass().getName().equals("ImperfectContainmentRelation")){
					EObject obj = (EObject)referencesOfRelations.get(i).eGet(targetOfRelations);
					children.add(obj);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return children;
	}

	@SuppressWarnings("unchecked")
	private static int numOfImperfectElements(EPackage intermediateMetaModel, EObject element) {
		int num=0;
		EClass elementClass;
		try {
			elementClass = MetaModelUtilities.findEClass(intermediateMetaModel, "Element");
			EReference referenceOfAttributes = MetaModelUtilities.findEReference(elementClass, "attributes");
			EReference referenceOfRelations = MetaModelUtilities.findEReference(elementClass, "relations");
			EList<EObject> referencesOfAttributes = (EList<EObject>)element.eGet(referenceOfAttributes);
			EList<EObject> referencesOfRelations = (EList<EObject>)element.eGet(referenceOfRelations);
			for(int i=0; i<referencesOfAttributes.size(); i++){
				if(referencesOfAttributes.get(i).eClass().getName().equals("ImperfectAttribute")){
					num++;
				}
			}
			for(int i=0; i<referencesOfRelations.size(); i++){
				if(referencesOfRelations.get(i).eClass().getName().equals("ImperfectContainmentRelation") || referencesOfRelations.get(i).eClass().getName().equals("ImperfectCrossRelation")){
					num++;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return num;
	}

	@SuppressWarnings("unchecked")
	private static ArrayList<EObject> getRootObject(EPackage intermediateMetaModel, EClass domainMetaModelRoot, EObject activeModel){
		ArrayList<EObject> possibleRoots = new ArrayList<EObject>();
		ArrayList<EObject> elements = new ArrayList<EObject>();
		try {
			OclHandler oclHandler = new OclHandler(activeModel);			
			elements = (ArrayList<EObject>)oclHandler.evaluate("Element.allInstances()->asSequence()");
			EClass elementClass = MetaModelUtilities.findEClass(intermediateMetaModel, "Element"); 
			EAttribute typeNameAttribute = MetaModelUtilities.findEAttribute(elementClass, "typeName");
			for (EObject element : elements){
				String typeName = element.eGet(typeNameAttribute).toString();
				if(typeName.equals(domainMetaModelRoot.getName())){
					possibleRoots.add(element);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return possibleRoots;
	}	
	@SuppressWarnings("unchecked")
	public static int numberOfImperfectContainmentRelationsWithDecisionTrace(EPackage intermediateMetaModel, EObject activeModel) throws Exception {
		EClass clazz = MetaModelUtilities.findEClass(intermediateMetaModel, "ImperfectContainmentRelation");
		EReference reference = MetaModelUtilities.findEReference(clazz, "containmentRelationDecision");
		ArrayList<EObject> imperfectContainmentRelations = new ArrayList<EObject>();
		int numberOfTraces=0;
		try {
			OclHandler oclHandler = new OclHandler(activeModel);			
			imperfectContainmentRelations = (ArrayList<EObject>)oclHandler.evaluate("ImperfectContainmentRelation.allInstances()->asSequence()");
			for(EObject imperfectRelation : imperfectContainmentRelations){
				EObject obj = (EObject)imperfectRelation.eGet(reference);				
				if(obj!=null){
					numberOfTraces++;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return numberOfTraces;
	}

	@SuppressWarnings("unchecked")
	public int numberOfImperfectCrossRelationsWithDecisionTrace(EPackage intermediateMetaModel, EObject activeModel) throws Exception {
		EClass clazz = MetaModelUtilities.findEClass(intermediateMetaModel, "ImperfectCrossRelation");
		EReference reference = MetaModelUtilities.findEReference(clazz, "crossRelationDecision");
		ArrayList<EObject> imperfectCrossRelations = new ArrayList<EObject>();
		int numberOfTraces=0;
		try {
			OclHandler oclHandler = new OclHandler(activeModel);			
			imperfectCrossRelations = (ArrayList<EObject>)oclHandler.evaluate("ImperfectCrossRelation.allInstances()->asSequence()");
			for(EObject imperfectRelation : imperfectCrossRelations){
				EObject obj = (EObject)imperfectRelation.eGet(reference);				
				if(obj!=null){
					numberOfTraces++;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return numberOfTraces;
	}

	@SuppressWarnings("unchecked")
	public static int numberOfImperfectAttributesWithDecisionTrace(EPackage intermediateMetaModel, EObject activeModel) throws Exception {
		EClass clazz = MetaModelUtilities.findEClass(intermediateMetaModel, "ImperfectAttribute");
		EReference attribute = MetaModelUtilities.findEReference(clazz, "attributeDecision");
		ArrayList<EObject> imperfectAttributes = new ArrayList<EObject>();
		int numberOfTraces=0;
		try {
			OclHandler oclHandler = new OclHandler(activeModel);			
			imperfectAttributes = (ArrayList<EObject>)oclHandler.evaluate("ImperfectAttribute.allInstances()->asSequence()");
			for(EObject imperfectAttribute : imperfectAttributes){
				EObject obj = (EObject)imperfectAttribute.eGet(attribute);				
				if(obj!=null){
					numberOfTraces++;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return numberOfTraces;
	}
	
	@SuppressWarnings("unchecked")
	public static void createAttributeFromOtherModelDiagram(String elementTypeName, String elementName, Attribute newAttribute) {
		try {
			String currentModelPath = ModelingUtilities.getModelPath();
			String modelsFolderPath = currentModelPath.substring(0,currentModelPath.lastIndexOf("/")+1);
			String activeModelName = currentModelPath.substring(currentModelPath.lastIndexOf("/")+1,currentModelPath.length());
			String workspacePath = ModelingUtilities.getAbsoluteWorkspacePath();
			String relativeModelsFolderPath = modelsFolderPath.substring(workspacePath.length());
			System.out.println(relativeModelsFolderPath);
			EPackage intermediateMetaModel = ModelLoader.loadMetaModel(URI.createURI(ModelingUtilities.EiMM_URI));
			EClass eClassElement = MetaModelUtilities.findEClass(intermediateMetaModel, "Element");
			EReference eReferenceAttributesInElement = MetaModelUtilities.findEReference(eClassElement, "attributes");			
			EClass eClassAttribute = MetaModelUtilities.findEClass(intermediateMetaModel, "Attribute");
			EAttribute eAttributeNameInAttribute = MetaModelUtilities.findEAttribute(eClassAttribute, "name");
//			EAttribute eAttributeTypeInAttribute = MetaModelUtilities.findEAttribute(eClassAttribute, "type");
//			EAttribute eAttributeValueInAttribute = MetaModelUtilities.findEAttribute(eClassAttribute, "value");
			File modelsFolder = new File(modelsFolderPath);
			ArrayList<File> modelsFiles = new ArrayList<File>(Arrays.asList(modelsFolder.listFiles()));
			OclHandler oclHandler;			
			for(File modelFile : modelsFiles){
				if(!modelFile.getName().equals(activeModelName)){
					System.out.println(modelsFolderPath+modelFile.getName());
					EObject model = ModelLoader.loadModel(modelsFolderPath+modelFile.getName(), intermediateMetaModel); 
					oclHandler = new OclHandler(model);
					ArrayList<EObject> elements = (ArrayList<EObject>)oclHandler.evaluate("Element.allInstances()->asSequence()->select(e:Element | e.typeName=ElementTypeName::"+elementTypeName+")->select(e:Element | e.name='"+elementName+"')");
					for(EObject element : elements){
						EList<EObject> attributes = (EList<EObject>)element.eGet(eReferenceAttributesInElement);
						for(EObject attribute : attributes){
							if(attribute.eGet(eAttributeNameInAttribute).toString().equals(newAttribute.getName())){
								attributes.remove(attribute);
							}
						}
						try {
							attributes.add(newAttribute);							
						} catch (Exception e) {
						}
					}
					ModelLoader.saveModel(model, relativeModelsFolderPath+modelFile.getName());
				}
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
