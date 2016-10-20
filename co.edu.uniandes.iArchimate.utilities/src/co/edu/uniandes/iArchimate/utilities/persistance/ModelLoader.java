package co.edu.uniandes.iArchimate.utilities.persistance;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;


public class ModelLoader {

	public static EPackage loadMetaModel( String path ) throws Exception{
		Resource globalResource = new XMIResourceImpl();
		File source = new File(path);
		globalResource.load(new FileInputStream(source), new HashMap<Object,Object>());		
		return (EPackage) globalResource.getContents().get(0);
	}

	public static EPackage loadMetaModel(URI mmURI) {
		ResourceSet resourceSet = new ResourceSetImpl();								//create a resource set.  
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());	//register the default resource factory -- only needed for stand-alone! 
		EcorePackage.eINSTANCE.eClass();												//register the package -- only needed for stand-alone!		 
		Resource metaResource = resourceSet.getResource(mmURI, true);					//demand load the resource for this file.
		return (EPackage) metaResource.getContents().get(0);						//get root element
	}

	public static EObject loadModel(String path, EPackage conformantMetaModel) throws Exception{
		EPackage.Registry.INSTANCE.put(conformantMetaModel.getNsURI(), conformantMetaModel);
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("archimate", new XMIResourceFactoryImpl());		
		Resource resource = resourceSet.getResource(URI.createFileURI(path),true);
		return resource.getContents().get(0);
	}	

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void saveModel(EObject root, String file) throws IOException{
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMLResourceFactoryImpl());
		Resource resource = resourceSet.createResource(URI.createURI(file));
		resource.getContents().add(root);		
		Map options = new HashMap();
		options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		//resource.save(options);
		resource.save(Collections.EMPTY_MAP);
	}

	public static Resource getResourceForEditting(String path) throws Exception{
		AdapterFactory composedAdapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		AdapterFactoryEditingDomain editingDomain = new AdapterFactoryEditingDomain(composedAdapterFactory, new BasicCommandStack());
		Resource resource = editingDomain.createResource(path);
		resource.load(null);
		return resource;
	}	


	//	public static void saveXML(Document root, String file) throws IOException{
	//		ResourceSet resourceSet = new ResourceSetImpl();
	//		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMLResourceFactoryImpl());
	//		Resource resource = resourceSet.createResource(URI.createURI(file));
	//		resource.getContents().add(root);		
	//		Map options = new HashMap();
	//		options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
	//		resource.save(options);
	//		//resource.save(Collections.EMPTY_MAP);
	//	}

}
