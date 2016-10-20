package co.edu.uniandes.iArchimate.utilities.emf;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

public class MetaModelUtilities {

	public MetaModelUtilities(int x) {
		// TODO Auto-generated constructor stub
	}
	
	public static ArrayList<EClass> findRootEClass(EPackage metaModel) throws Exception {
		ArrayList<EClass> possibleRoots = new ArrayList<EClass>();
		for(EClassifier clazz : metaModel.getEClassifiers()){
			if(!MetaModelUtilities.isTargetOfAnyEClass(metaModel, (EClass)clazz) && !MetaModelUtilities.hasChildren(metaModel, (EClass)clazz)){
				possibleRoots.add((EClass)clazz);
			}		
		}							
		return possibleRoots;
	}
	
	public ArrayList<EClass> getAllEClasses(EPackage metaModel) {
		ArrayList<EClass> eClasses = new ArrayList<EClass>();
		for(EClassifier clazz : metaModel.getEClassifiers()){
			eClasses.add((EClass)clazz);
		}							
		return eClasses;
	}
	
	public static EClass findEClass(EPackage metaModel, String className) throws Exception {
		for(EClassifier clazz : metaModel.getEClassifiers()){
			if(clazz.getName().equals(className)){
				return (EClass)clazz;
			}		
		}							
		throw new Exception("The entity "+className+" does not exist");
	}

	public static EAttribute findEAttribute(EClass clazz, String attributeName) throws Exception {
		for(EAttribute attribute : clazz.getEAttributes()){
			if(attribute.getName().equals(attributeName)){
				return attribute;
			}
		}
		for(EClass superClazz : clazz.getESuperTypes()){
			for(EAttribute attribute : superClazz.getEAttributes()){
				if(attribute.getName().equals(attributeName)){
					return attribute;
				}
			}			
		}
		throw new Exception("The attribute "+attributeName+" does not exist in the class "+clazz.getName());
	}	

	public static EReference findEReference(EClass clazz, String referenceName) throws Exception {
		for(EReference reference : clazz.getEReferences()){
			if(reference.getName().equals(referenceName)){
				return reference;
			}
		}		
		for(EClass superClazz : clazz.getESuperTypes()){
			for(EReference reference : superClazz.getEReferences()){
				if(reference.getName().equals(referenceName)){
					return reference;
				}
			}
		}
		throw new Exception("The reference "+referenceName+" does not exist in the class "+clazz.getName());
	}	

	public static EEnum findEEnum(EPackage metaModel, String enumName) throws Exception {
		for(EClassifier enumeration: metaModel.getEClassifiers()){
			if(enumeration.getName().equals(enumName)){
				return (EEnum)enumeration;
			}		
		}							
		throw new Exception("The enum "+enumName+" does not exist");
	}

	public static EEnumLiteral findEEnumLiteral(EEnum enumeration, String literalName) {
		return enumeration.getEEnumLiteral(literalName);
	}	

	public static EEnumLiteral findEEnumLiteral(EEnum enumeration, int literalIndex) {
		return enumeration.getEEnumLiteral(literalIndex);
	}

	private static boolean isTargetOfAnyEClass(EPackage metaModel, EClass testedClazz) {
		for(EClassifier clazz : metaModel.getEClassifiers()){
			for(EReference reference : ((EClass)clazz).getEReferences()){
				if(reference.getEType() == testedClazz){
					return true;
				}
			}
		}							
		return false;
	}

	private static boolean hasChildren(EPackage metaModel, EClass testedClazz) {
		for(EClassifier clazz : metaModel.getEClassifiers()){
			for(EClassifier superType : ((EClass)clazz).getESuperTypes()){
				if(superType == testedClazz){
					return true;
				}
			}					
		}							
		return false;
	}

}
