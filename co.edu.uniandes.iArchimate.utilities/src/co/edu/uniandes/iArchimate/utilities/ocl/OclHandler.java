package co.edu.uniandes.iArchimate.utilities.ocl;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

public class OclHandler {

	// OCL Environment
	private OCL<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, Constraint, EClass, EObject> ocl = null;
	// OCL Helper (to parse and execute)
	private OCLHelper<EClassifier, ?, ?, Constraint> helper = null;
	private EObject object = null;
	private OCLExpression<EClassifier> query = null;

	public OclHandler (EObject contextObject ) {
		try {
		    // create an OCL instance for Ecore
		    ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		    // create an OCL helper object
		    helper = ocl.createOCLHelper();
		    // set the object context
		    object = contextObject;
		} catch (Exception e) {
		}
	}
	
	public OclHandler () {
		this( null );
	}
	
	public Object evaluate ( String oclQuery ) throws Exception {
		try {
		    // set the OCL context classifier
		    // searching on the University instance (the root)
		    helper.setContext( object.eClass() );
		    // parsing the query
		    query = helper.createQuery( oclQuery );
		    @SuppressWarnings("rawtypes")
			Query queryEval = ocl.createQuery( query );
			return queryEval.evaluate( object );
		} catch (ParserException e) {
		    System.err.println(e.getLocalizedMessage());
		    throw new Exception("Cannot run the query", e);
		}
	}
}
