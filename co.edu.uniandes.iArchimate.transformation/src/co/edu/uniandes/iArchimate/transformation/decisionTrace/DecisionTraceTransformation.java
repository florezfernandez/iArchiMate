package co.edu.uniandes.iArchimate.transformation.decisionTrace;

import iArchimate.AttributeFact;
import iArchimate.Decision;
import iArchimate.DecisionTrace;
import iArchimate.Fact;
import iArchimate.IArchimateFactory;
import iArchimate.InstanceFact;
import iArchimate.Meeting;
import iArchimate.Observation;
import iArchimate.Person;
import iArchimate.RelationFact;
import iArchimate.Source;
import iArchimate.diagram.edit.parts.DecisionTraceEditPart;
import iArchimate.diagram.edit.parts.Element2EditPart;
import iArchimate.diagram.edit.parts.ElementEditPart;
import iArchimate.diagram.edit.parts.GroupEditPart;
import iArchimate.diagram.edit.parts.ModelEditPart;
import iArchimate.diagram.part.IArchimateDiagramEditor;
import iArchimate.impl.AttributeFactImpl;
import iArchimate.impl.DecisionImpl;
import iArchimate.impl.DecisionTraceImpl;
import iArchimate.impl.DocumentImpl;
import iArchimate.impl.ElementImpl;
import iArchimate.impl.FactImpl;
import iArchimate.impl.InstanceFactImpl;
import iArchimate.impl.MeetingImpl;
import iArchimate.impl.ModelImpl;
import iArchimate.impl.ObservationImpl;
import iArchimate.impl.PersonImpl;
import iArchimate.impl.RelationFactImpl;
import iArchimate.impl.SourceImpl;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

import co.edu.uniandes.iArchimate.utilities.emf.ModelingUtilities;
import co.edu.uniandes.iArchimate.utilities.persistance.FileLoader;

public class DecisionTraceTransformation {

	
	private ModelEditPart modelEditPart;
	@SuppressWarnings("rawtypes")
	protected List editParts;
	private ModelImpl modelImpl;
	private Map<String, Source> addedSources;
	private Map<String, Observation> addedObservations;
	private Map<String, Fact> addedFacts;
	private Map<String, Decision> addedDecisions;
	private ArrayList<DTRelation> meetingToPersons;
	private ArrayList<DTRelation> observationToFacts;
	private ArrayList<DTRelation> decisionToFacts;

	public DecisionTraceTransformation() {
		IArchimateDiagramEditor iArchimateEditor = (IArchimateDiagramEditor)ModelingUtilities.getModelEditorPart();
		modelEditPart = (ModelEditPart)iArchimateEditor.getDiagramEditPart();
		editParts = modelEditPart.getChildren();
	}

	public String exportDecisionTrace(){
		try {
			String message="";
			Element iArchiMateDecisionTraceRootElementXML = new Element("iArchimate");
			Document iArchiMateDecisionTraceXML = new Document(iArchiMateDecisionTraceRootElementXML);
			ArrayList<DecisionTraceImpl> decisionTracesImpls = findArrayOfDecisionTraceImpl();
			if(decisionTracesImpls.size()==0){
				return "There are 0 decision traces";
			}else{
				for (DecisionTraceImpl decisionTraceImpl : decisionTracesImpls){
					ElementImpl decisionTraceSource = findDecisionTraceImplSource(decisionTraceImpl);			
					if(decisionTraceSource!=null){
						Element decisionTraceXML = new Element("decisionTrace");
						decisionTraceXML.setAttribute("idDecisionTrace", decisionTraceImpl.getIdDecisionTrace());
						decisionTraceXML.setAttribute("relatedElement", decisionTraceSource.getName());
						iArchiMateDecisionTraceRootElementXML.addContent(decisionTraceXML);
						
						for(Source source : decisionTraceImpl.getSources()){
							SourceImpl sourceImpl = (SourceImpl)source;
							Element sourceXML = new Element("source");
							sourceXML.setAttribute("name",sourceImpl.getName());
							sourceXML.setAttribute("reliability",String.valueOf(sourceImpl.getReliability()));
							sourceXML.setAttribute("certaintyDegree",String.valueOf(sourceImpl.getCertaintyDegree()));
							if(sourceImpl instanceof PersonImpl){
								PersonImpl personImpl = (PersonImpl)sourceImpl;
								sourceXML.setAttribute("type","Person");
								sourceXML.setAttribute("organizationalUnit", personImpl.getOrganizationalUnit());
								sourceXML.setAttribute("rol", personImpl.getRol());
							}else if(sourceImpl instanceof MeetingImpl){
								MeetingImpl meetingImpl = (MeetingImpl)sourceImpl;
								sourceXML.setAttribute("type","Meeting");
								sourceXML.setAttribute("minuteNumber",String.valueOf((meetingImpl.getMinuteNumber())));
								for(Source participant : meetingImpl.getMeetingParticipants()){
									PersonImpl participantImpl = (PersonImpl)participant;
									Element participantsXML = new Element("meetingParticipants");
									participantsXML.setAttribute("name", participantImpl.getName());
									sourceXML.addContent(participantsXML);
								}
							}else if(sourceImpl instanceof DocumentImpl){
								DocumentImpl documentImpl = (DocumentImpl)sourceImpl;
								sourceXML.setAttribute("type","Document");
								sourceXML.setAttribute("version",String.valueOf(documentImpl.getVersion()));							
								sourceXML.setAttribute("description", documentImpl.getDescription());							
							}
							for(Observation observation : source.getSourceObservations()){
								ObservationImpl observationImpl = (ObservationImpl)observation;
								Element observationXML = new Element("sourceObservations");
								observationXML.setAttribute("idObservation", observationImpl.getIdObservation());
								sourceXML.addContent(observationXML);
							}
							decisionTraceXML.addContent(sourceXML);
						}
						
						for(Observation observation : decisionTraceImpl.getObservations()){
							ObservationImpl observationImpl = (ObservationImpl)observation;
							Element observationXML = new Element("observation");
							observationXML.setAttribute("idObservation", observationImpl.getIdObservation());
							try {
								SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
								String dateInString = formatter.format(observationImpl.getReferenceDate());							
								observationXML.setAttribute("referenceDate", dateInString);
							} catch (Exception e) {
								return e.getMessage();
							}
							observationXML.setAttribute("belongsTo", observationImpl.getBelongsTo().getName());
							for(Fact fact : observationImpl.getObservationFacts()){
								FactImpl factImpl = (FactImpl)fact;
								Element factXML = new Element("observationFacts");
								factXML.setAttribute("idFact", factImpl.getIdFact());
								observationXML.addContent(factXML);
							}
							decisionTraceXML.addContent(observationXML);
						}
						
						for(Fact fact : decisionTraceImpl.getFacts()){
							FactImpl factImpl = (FactImpl)fact;
							Element factXML = new Element("fact");
							factXML.setAttribute("idFact", factImpl.getIdFact());
							factXML.setAttribute("element", factImpl.getElement());
							if(factImpl instanceof InstanceFactImpl){
								InstanceFactImpl instanceFactImpl = (InstanceFactImpl)factImpl;
								factXML.setAttribute("type","InstanceFact");
								factXML.setAttribute("exist",String.valueOf(instanceFactImpl.isExist()));
							}else if(factImpl instanceof AttributeFactImpl){
								AttributeFactImpl attributeFactImpl = (AttributeFactImpl)factImpl;
								factXML.setAttribute("type","AttributeFact");
								factXML.setAttribute("attrName", attributeFactImpl.getAttName());
								for(String value : attributeFactImpl.getAttValue()){
									Element valueXML = new Element("attrValue");
									valueXML.setAttribute("value", value);
									factXML.addContent(valueXML);
								}
							}else if(factImpl instanceof RelationFactImpl){
								RelationFactImpl relationFactImpl = (RelationFactImpl)factImpl;
								factXML.setAttribute("type","RelationFact");
								factXML.setAttribute("relName", relationFactImpl.getRelName());
								for(String value : relationFactImpl.getRelValue()){
									Element valueXML = new Element("relValue");
									valueXML.setAttribute("value", value);
									factXML.addContent(valueXML);
								}
							}
							
							for(Observation observation : fact.getIsFactOf()){
								ObservationImpl observationImpl = (ObservationImpl)observation;
								Element observationXML = new Element("isFactOf");
								observationXML.setAttribute("idObservation", observationImpl.getIdObservation());
								factXML.addContent(observationXML);
							}
							decisionTraceXML.addContent(factXML);
						}
						
						for(Decision decision : decisionTraceImpl.getDecisions()){
							DecisionImpl decisionImpl = (DecisionImpl)decision;
							Element decisionXML = new Element("decision");
							decisionXML.setAttribute("idDecision", decisionImpl.getIdDecision());
							for(String result : decisionImpl.getResult()){
								Element resultXML = new Element("result");
								resultXML.setAttribute("value", result);
								decisionXML.addContent(resultXML);
							}
							for(Fact fact : decisionImpl.getDecisionFacts()){
								FactImpl factImpl = (FactImpl)fact;
								Element factXML = new Element("decisionFacts");
								factXML.setAttribute("idFact", factImpl.getIdFact());
								decisionXML.addContent(factXML);
							}
							decisionTraceXML.addContent(decisionXML);
						}
						
						message+="- The desicion Trace: "+decisionTraceImpl.getIdDecisionTrace()+" has been exported\n";				
					}else{
						message+="- The desicion Trace: "+decisionTraceImpl.getIdDecisionTrace()+" does not have any related element\n";
					}
				}
				try {
					FileLoader.saveXMLFile(iArchiMateDecisionTraceXML, ModelingUtilities.getAbsolutProjectPath()+"/"+ModelingUtilities.getActiveModelName()+".iarchimate_dt");
				} catch (IOException e) {
					return "Error saving XML file";
				}
				return message;			
			}
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	private ArrayList<DecisionTraceImpl> findArrayOfDecisionTraceImpl(){
		ArrayList<DecisionTraceImpl> decisionTracesImpls=new ArrayList<DecisionTraceImpl>();
		for(Object editPart : editParts){
			if(editPart instanceof DecisionTraceEditPart){
				DecisionTraceEditPart decisionTraceEditPart = (DecisionTraceEditPart)editPart;
				DecisionTraceImpl decisionTraceImpl = (DecisionTraceImpl)((NodeImpl)decisionTraceEditPart.getModel()).getElement();
				decisionTracesImpls.add(decisionTraceImpl);
			}
		}
		return decisionTracesImpls;
	}
	
	private ElementImpl findDecisionTraceImplSource(DecisionTraceImpl decisionTraceImpl){		
		for(Object editPart : editParts){
			if(editPart instanceof ElementEditPart){
				ElementEditPart elementEditPart = (ElementEditPart)editPart;
				ElementImpl elementImpl = (ElementImpl)((NodeImpl)elementEditPart.getModel()).getElement();
				if(elementImpl.getElementDecisionTrace()==decisionTraceImpl){
					return elementImpl;
				}
				ShapeCompartmentEditPart compartment = (ShapeCompartmentEditPart)elementEditPart.getChildren().get(1);
				ElementImpl subElementImpl = findDecisionTraceImplSourceInCompartmentEditPart(compartment,decisionTraceImpl);
				if(subElementImpl!=null){
					return subElementImpl;
				}
			}else if(editPart instanceof GroupEditPart) {
				GroupEditPart groupEditPart = (GroupEditPart)editPart;
				ShapeCompartmentEditPart compartment = (ShapeCompartmentEditPart)groupEditPart.getChildren().get(1);
				ElementImpl subElementImpl = findDecisionTraceImplSourceInCompartmentEditPart(compartment,decisionTraceImpl);
				if(subElementImpl!=null){
					return subElementImpl;
				}
			}
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	private ElementImpl findDecisionTraceImplSourceInCompartmentEditPart(ShapeCompartmentEditPart compartment, DecisionTraceImpl decisionTraceImpl) {
		if(compartment.getChildren().size()>0){
			List editPartsInCompartment = compartment.getChildren();
			for(Object editPartInCompartment : editPartsInCompartment){
				ShapeNodeEditPart elementEditPart;
				if(editPartInCompartment instanceof ElementEditPart){
					elementEditPart = (ElementEditPart)editPartInCompartment;
				}else{
					elementEditPart = (Element2EditPart)editPartInCompartment;
				}
				ElementImpl elementImpl = (ElementImpl)((NodeImpl)elementEditPart.getModel()).getElement();		
				if(elementImpl.getElementDecisionTrace()==decisionTraceImpl){
					return elementImpl;
				}
				ShapeCompartmentEditPart subCompartment = (ShapeCompartmentEditPart)elementEditPart.getChildren().get(1);
				ElementImpl subElementImpl = findDecisionTraceImplSourceInCompartmentEditPart(subCompartment,decisionTraceImpl);
				if(subElementImpl!=null){
					return subElementImpl;
				}
			}
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public String importDecisionTrace(String filePath){
		try {
			SAXBuilder builder = new SAXBuilder();
			File xmlFile = new File(ModelingUtilities.getAbsoluteWorkspacePath()+filePath);
			Document document;
			document = (Document) builder.build(xmlFile);
			Element rootNode = document.getRootElement();
			List <Element>decisionTraces = new ArrayList<Element>();
			decisionTraces = rootNode.getChildren("decisionTrace");
			String message="";
			modelImpl = (ModelImpl)((DiagramImpl)modelEditPart.getModel()).getElement();
			for(Element decisionTrace : decisionTraces){
				String id = decisionTrace.getAttributeValue("idDecisionTrace");
				String source = decisionTrace.getAttributeValue("relatedElement");
				if(createDecisionTrace(decisionTrace, source)){
					message+="- DecisionTrace: "+id+" created successfully\n";
				}else{
					message+="- DecisionTrace: "+id+" not created because the element: "+source+" does not exist\n";
				}
			}
			return message;
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	@SuppressWarnings("unchecked")
	private boolean createDecisionTrace(Element decisionTrace, String relatedElementName) throws Exception{
		this.addedSources = new HashMap<String, Source>();
		this.addedObservations = new HashMap<String, Observation>();
		this.addedFacts = new HashMap<String, Fact>();
		this.addedDecisions = new HashMap<String, Decision>();
		this.meetingToPersons = new ArrayList<DTRelation>();
		this.observationToFacts = new ArrayList<DTRelation>();
		this.decisionToFacts = new ArrayList<DTRelation>();
		ElementImpl relatedElement = findElementImplByName(relatedElementName);
		if(relatedElement!=null){
			DecisionTrace newDecisionTrace = IArchimateFactory.eINSTANCE.createDecisionTrace();
			newDecisionTrace.setIdDecisionTrace(decisionTrace.getAttributeValue("idDecisionTrace"));
			List <Element> sources = new ArrayList<Element>();
			sources = decisionTrace.getChildren("source");
			for(Element source : sources){
				String sourceType = source.getAttributeValue("type"); 
				if(sourceType.equals("Person")){
					Person newPerson = IArchimateFactory.eINSTANCE.createPerson();
					newPerson.setName(source.getAttributeValue("name"));
					newPerson.setReliability(Double.parseDouble(source.getAttributeValue("reliability")));
					newPerson.setCertaintyDegree(Double.parseDouble(source.getAttributeValue("certaintyDegree")));
					newPerson.setOrganizationalUnit(source.getAttributeValue("organizationalUnit"));
					newPerson.setRol(source.getAttributeValue("rol"));
					this.addedSources.put(source.getAttributeValue("name"), newPerson);
					try {
						newDecisionTrace.getSources().add(newPerson);
					} catch (Exception e) {
					}
				}else if(sourceType.equals("Meeting")){
					Meeting newMeeting = IArchimateFactory.eINSTANCE.createMeeting();
					newMeeting.setName(source.getAttributeValue("name"));
					newMeeting.setReliability(Double.parseDouble(source.getAttributeValue("reliability")));
					newMeeting.setCertaintyDegree(Double.parseDouble(source.getAttributeValue("certaintyDegree")));
					newMeeting.setMinuteNumber(Integer.parseInt(source.getAttributeValue("minuteNumber")));
					this.addedSources.put(source.getAttributeValue("name"), newMeeting);
					List <Element> participants = new ArrayList<Element>();
					participants = source.getChildren("meetingParticipants");
					for(Element participant : participants){
						this.meetingToPersons.add(new DTRelation(source.getAttributeValue("name"), participant.getAttributeValue("name")));
					}
					try {
						newDecisionTrace.getSources().add(newMeeting);
					} catch (Exception e) {
					}
				}else if(sourceType.equals("Document")){
					iArchimate.Document newDocument = IArchimateFactory.eINSTANCE.createDocument();
					newDocument.setName(source.getAttributeValue("name"));
					newDocument.setReliability(Double.parseDouble(source.getAttributeValue("reliability")));
					newDocument.setCertaintyDegree(Double.parseDouble(source.getAttributeValue("certaintyDegree")));
					newDocument.setVersion(Double.parseDouble(source.getAttributeValue("version")));
					newDocument.setDescription(source.getAttributeValue("description"));
					this.addedSources.put(source.getAttributeValue("name"), newDocument);
					try {
						newDecisionTrace.getSources().add(newDocument);
					} catch (Exception e) {
					}					
				}
			}
			
			List <Element> observations = new ArrayList<Element>();
			observations = decisionTrace.getChildren("observation");
			for(Element observation : observations){
				Observation newObservation = IArchimateFactory.eINSTANCE.createObservation();
				newObservation.setIdObservation(observation.getAttributeValue("idObservation"));
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				String dateInString = observation.getAttributeValue("referenceDate");
				newObservation.setReferenceDate(formatter.parse(dateInString));
				newObservation.setBelongsTo(this.addedSources.get(observation.getAttributeValue("belongsTo")));
				this.addedObservations.put(observation.getAttributeValue("idObservation"), newObservation);
				List <Element> observationFacts = new ArrayList<Element>();
				observationFacts = observation.getChildren("observationFacts");
				for(Element observationFact : observationFacts){
					this.observationToFacts.add(new DTRelation(observation.getAttributeValue("idObservation"), observationFact.getAttributeValue("idFact")));
				}
				try {
					newDecisionTrace.getObservations().add(newObservation);
				} catch (Exception e) {
				}
			}
			
			List <Element> facts = new ArrayList<Element>();
			facts = decisionTrace.getChildren("fact");
			for(Element fact : facts){
				String factType = fact.getAttributeValue("type"); 
				if(factType.equals("InstanceFact")){
					InstanceFact newInstanceFact = IArchimateFactory.eINSTANCE.createInstanceFact();
					newInstanceFact.setIdFact(fact.getAttributeValue("idFact"));
					newInstanceFact.setElement(fact.getAttributeValue("element"));
					newInstanceFact.setExist(new Boolean(fact.getAttributeValue("exist")));
					this.addedFacts.put(fact.getAttributeValue("idFact"), newInstanceFact);
					try {
						newDecisionTrace.getFacts().add(newInstanceFact);
					} catch (Exception e) {
					}
				}else if(factType.equals("AttributeFact")){
					AttributeFact newAttributeFact = IArchimateFactory.eINSTANCE.createAttributeFact();
					newAttributeFact.setIdFact(fact.getAttributeValue("idFact"));
					newAttributeFact.setElement(fact.getAttributeValue("element"));
					newAttributeFact.setAttName(fact.getAttributeValue("attrName"));
					
					List <Element> factValues = new ArrayList<Element>();
					factValues = fact.getChildren("attrValue");
					for(Element factValue : factValues){
						try {
							newAttributeFact.getAttValue().add(factValue.getAttributeValue("value"));
						} catch (Exception e) {
						}
					}
					this.addedFacts.put(fact.getAttributeValue("idFact"), newAttributeFact);
					try {
						newDecisionTrace.getFacts().add(newAttributeFact);
					} catch (Exception e) {
					}
				}else if(factType.equals("RelationFact")){
					RelationFact newRelationFact = IArchimateFactory.eINSTANCE.createRelationFact();
					newRelationFact.setIdFact(fact.getAttributeValue("idFact"));
					newRelationFact.setElement(fact.getAttributeValue("element"));
					newRelationFact.setRelName(fact.getAttributeValue("relName"));
					
					List <Element> factValues = new ArrayList<Element>();
					factValues = fact.getChildren("relValue");
					for(Element factValue : factValues){
						try {
							newRelationFact.getRelValue().add(factValue.getAttributeValue("value"));
						} catch (Exception e) {
						}
					}
					this.addedFacts.put(fact.getAttributeValue("idFact"), newRelationFact);
					try {
						newDecisionTrace.getFacts().add(newRelationFact);
					} catch (Exception e) {
					}
				}

			}
			
			List <Element> decisions = new ArrayList<Element>();
			decisions = decisionTrace.getChildren("decision");
			for(Element decision : decisions){
				Decision newDecision = IArchimateFactory.eINSTANCE.createDecision();
				newDecision.setIdDecision(decision.getAttributeValue("idDecision"));
				List <Element> decisionResults = new ArrayList<Element>();
				decisionResults = decision.getChildren("result");
				for(Element decisionResult : decisionResults){
					try {
						newDecision.getResult().add(decisionResult.getAttributeValue("value"));
					} catch (Exception e) {
					}
				}
				this.addedDecisions.put(decision.getAttributeValue("idDecision"), newDecision);
				List <Element> decisionFacts = new ArrayList<Element>();
				decisionFacts = decision.getChildren("decisionFacts");
				for(Element decisionFact : decisionFacts){
					this.decisionToFacts.add(new DTRelation(decision.getAttributeValue("idDecision"), decisionFact.getAttributeValue("idFact")));
				}

				try {
					newDecisionTrace.getDecisions().add(newDecision);
				} catch (Exception e) {
				}
			}
			
			try {
				modelImpl.getDecisionTraces().add(newDecisionTrace);				
			} catch (Exception e) {
			}
			
			try {
				relatedElement.setElementDecisionTrace(newDecisionTrace);				
			} catch (Exception e) {
			}
			
			createRelations();
			
			return true;
		}else{
			return false;
		}
	}
	
	private void createRelations() {
		for(DTRelation meetingToPerson : this.meetingToPersons){
			Meeting meeting = (Meeting)this.addedSources.get(meetingToPerson.getFrom());
			Person person = (Person)this.addedSources.get(meetingToPerson.getTo());
			try {
				meeting.getMeetingParticipants().add(person);				
			} catch (Exception e) {
			}
		}

		for(DTRelation observationToFact : this.observationToFacts){
			Observation observation = this.addedObservations.get(observationToFact.getFrom());
			Fact fact = this.addedFacts.get(observationToFact.getTo());
			try {
				observation.getObservationFacts().add(fact);				
			} catch (Exception e) {
			}
		}

		for(DTRelation decisionToFact : this.decisionToFacts){
			Decision decision = this.addedDecisions.get(decisionToFact.getFrom());
			Fact fact = this.addedFacts.get(decisionToFact.getTo());
			try {
				decision.getDecisionFacts().add(fact);				
			} catch (Exception e) {
			}
		}
	}

	protected ElementImpl findElementImplByName(String name){
		for(Object editPart : editParts){
			if(editPart instanceof ElementEditPart){
				ElementEditPart elementEditPart = (ElementEditPart)editPart;
				ElementImpl elementImpl = (ElementImpl)((NodeImpl)elementEditPart.getModel()).getElement();
				if(elementImpl.getName().toString().equals(name)){
					return elementImpl;
				}
				ShapeCompartmentEditPart compartment = (ShapeCompartmentEditPart)elementEditPart.getChildren().get(1);
				ElementImpl subElementImpl = findElementImplByNameInCompartmentEditPart(compartment,name);
				if(subElementImpl!=null){
					return subElementImpl;
				}		
			}else if(editPart instanceof GroupEditPart) {
				GroupEditPart groupEditPart = (GroupEditPart)editPart;
				ShapeCompartmentEditPart compartment = (ShapeCompartmentEditPart)groupEditPart.getChildren().get(1);
				ElementImpl subElementImpl = findElementImplByNameInCompartmentEditPart(compartment,name);
				if(subElementImpl!=null){
					return subElementImpl;
				}									
			}
		}
		return null;
	}
	
	@SuppressWarnings("rawtypes")
	protected ElementImpl findElementImplByNameInCompartmentEditPart(ShapeCompartmentEditPart compartment, String name) {
		if(compartment.getChildren().size()>0){
			List editPartsInCompartment = compartment.getChildren();
			for(Object editPartInCompartment : editPartsInCompartment){
				ShapeNodeEditPart elementEditPart;
				if(editPartInCompartment instanceof ElementEditPart){
					elementEditPart = (ElementEditPart)editPartInCompartment;
				}else{
					elementEditPart = (Element2EditPart)editPartInCompartment;
				}
				ElementImpl elementImpl = (ElementImpl)((NodeImpl)elementEditPart.getModel()).getElement();		
				if(elementImpl.getName().toString().equals(name)){
					return elementImpl;
				}
				ShapeCompartmentEditPart subCompartment = (ShapeCompartmentEditPart)elementEditPart.getChildren().get(1);
				ElementImpl subElementImpl = findElementImplByNameInCompartmentEditPart(subCompartment,name);
				if(subElementImpl!=null){
					return subElementImpl;
				}
			}
		}
		return null;
	}

}
