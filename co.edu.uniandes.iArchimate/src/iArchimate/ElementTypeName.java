/**
 */
package iArchimate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Element Type Name</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see iArchimate.IArchimatePackage#getElementTypeName()
 * @model
 * @generated
 */
public enum ElementTypeName implements Enumerator
{
  /**
   * The '<em><b>Not Selected</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT_SELECTED_VALUE
   * @generated
   * @ordered
   */
  NOT_SELECTED(100, "NotSelected", "NotSelected"),

  /**
   * The '<em><b>Business Actor</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUSINESS_ACTOR_VALUE
   * @generated
   * @ordered
   */
  BUSINESS_ACTOR(0, "BusinessActor", "BusinessActor"),

  /**
   * The '<em><b>Business Role</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUSINESS_ROLE_VALUE
   * @generated
   * @ordered
   */
  BUSINESS_ROLE(1, "BusinessRole", "BusinessRole"),

  /**
   * The '<em><b>Business Collaboration</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUSINESS_COLLABORATION_VALUE
   * @generated
   * @ordered
   */
  BUSINESS_COLLABORATION(2, "BusinessCollaboration", "BusinessCollaboration"),

  /**
   * The '<em><b>Business Interface</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUSINESS_INTERFACE_VALUE
   * @generated
   * @ordered
   */
  BUSINESS_INTERFACE(3, "BusinessInterface", "BusinessInterface"),

  /**
   * The '<em><b>Location</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LOCATION_VALUE
   * @generated
   * @ordered
   */
  LOCATION(4, "Location", "Location"),

  /**
   * The '<em><b>Business Object</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUSINESS_OBJECT_VALUE
   * @generated
   * @ordered
   */
  BUSINESS_OBJECT(5, "BusinessObject", "BusinessObject"),

  /**
   * The '<em><b>Business Process</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUSINESS_PROCESS_VALUE
   * @generated
   * @ordered
   */
  BUSINESS_PROCESS(6, "BusinessProcess", "BusinessProcess"),

  /**
   * The '<em><b>Business Function</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUSINESS_FUNCTION_VALUE
   * @generated
   * @ordered
   */
  BUSINESS_FUNCTION(7, "BusinessFunction", "BusinessFunction"),

  /**
   * The '<em><b>Business Interaction</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUSINESS_INTERACTION_VALUE
   * @generated
   * @ordered
   */
  BUSINESS_INTERACTION(8, "BusinessInteraction", "BusinessInteraction"),

  /**
   * The '<em><b>Business Event</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUSINESS_EVENT_VALUE
   * @generated
   * @ordered
   */
  BUSINESS_EVENT(9, "BusinessEvent", "BusinessEvent"),

  /**
   * The '<em><b>Business Service</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BUSINESS_SERVICE_VALUE
   * @generated
   * @ordered
   */
  BUSINESS_SERVICE(10, "BusinessService", "BusinessService"),

  /**
   * The '<em><b>Representation</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REPRESENTATION_VALUE
   * @generated
   * @ordered
   */
  REPRESENTATION(11, "Representation", "Representation"),

  /**
   * The '<em><b>Meaning</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MEANING_VALUE
   * @generated
   * @ordered
   */
  MEANING(12, "Meaning", "Meaning"),

  /**
   * The '<em><b>Value</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VALUE_VALUE
   * @generated
   * @ordered
   */
  VALUE(13, "Value", "Value"),

  /**
   * The '<em><b>Product</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PRODUCT_VALUE
   * @generated
   * @ordered
   */
  PRODUCT(14, "Product", "Product"),

  /**
   * The '<em><b>Contract</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONTRACT_VALUE
   * @generated
   * @ordered
   */
  CONTRACT(15, "Contract", "Contract"),

  /**
   * The '<em><b>Application Component</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #APPLICATION_COMPONENT_VALUE
   * @generated
   * @ordered
   */
  APPLICATION_COMPONENT(16, "ApplicationComponent", "ApplicationComponent"),

  /**
   * The '<em><b>Application Collaboration</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #APPLICATION_COLLABORATION_VALUE
   * @generated
   * @ordered
   */
  APPLICATION_COLLABORATION(17, "ApplicationCollaboration", "ApplicationCollaboration"),

  /**
   * The '<em><b>Application Interface</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #APPLICATION_INTERFACE_VALUE
   * @generated
   * @ordered
   */
  APPLICATION_INTERFACE(18, "ApplicationInterface", "ApplicationInterface"),

  /**
   * The '<em><b>Data Object</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATA_OBJECT_VALUE
   * @generated
   * @ordered
   */
  DATA_OBJECT(19, "DataObject", "DataObject"),

  /**
   * The '<em><b>Application Function</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #APPLICATION_FUNCTION_VALUE
   * @generated
   * @ordered
   */
  APPLICATION_FUNCTION(20, "ApplicationFunction", "ApplicationFunction"),

  /**
   * The '<em><b>Application Interaction</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #APPLICATION_INTERACTION_VALUE
   * @generated
   * @ordered
   */
  APPLICATION_INTERACTION(21, "ApplicationInteraction", "ApplicationInteraction"),

  /**
   * The '<em><b>Application Service</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #APPLICATION_SERVICE_VALUE
   * @generated
   * @ordered
   */
  APPLICATION_SERVICE(22, "ApplicationService", "ApplicationService"),

  /**
   * The '<em><b>Node</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NODE_VALUE
   * @generated
   * @ordered
   */
  NODE(23, "Node", "Node"),

  /**
   * The '<em><b>Device</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEVICE_VALUE
   * @generated
   * @ordered
   */
  DEVICE(24, "Device", "Device"),

  /**
   * The '<em><b>System Software</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SYSTEM_SOFTWARE_VALUE
   * @generated
   * @ordered
   */
  SYSTEM_SOFTWARE(25, "SystemSoftware", "SystemSoftware"),

  /**
   * The '<em><b>Infrastructure Interface</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INFRASTRUCTURE_INTERFACE_VALUE
   * @generated
   * @ordered
   */
  INFRASTRUCTURE_INTERFACE(26, "InfrastructureInterface", "InfrastructureInterface"),

  /**
   * The '<em><b>Network</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NETWORK_VALUE
   * @generated
   * @ordered
   */
  NETWORK(27, "Network", "Network"),

  /**
   * The '<em><b>Communication Path</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMMUNICATION_PATH_VALUE
   * @generated
   * @ordered
   */
  COMMUNICATION_PATH(28, "CommunicationPath", "CommunicationPath"),

  /**
   * The '<em><b>Infrastructure Function</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INFRASTRUCTURE_FUNCTION_VALUE
   * @generated
   * @ordered
   */
  INFRASTRUCTURE_FUNCTION(29, "InfrastructureFunction", "InfrastructureFunction"),

  /**
   * The '<em><b>Infrastructure Service</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INFRASTRUCTURE_SERVICE_VALUE
   * @generated
   * @ordered
   */
  INFRASTRUCTURE_SERVICE(30, "InfrastructureService", "InfrastructureService"),

  /**
   * The '<em><b>Artifact</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ARTIFACT_VALUE
   * @generated
   * @ordered
   */
  ARTIFACT(31, "Artifact", "Artifact"),

  /**
   * The '<em><b>Stakeholder</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STAKEHOLDER_VALUE
   * @generated
   * @ordered
   */
  STAKEHOLDER(32, "Stakeholder", "Stakeholder"),

  /**
   * The '<em><b>Driver</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DRIVER_VALUE
   * @generated
   * @ordered
   */
  DRIVER(33, "Driver", "Driver"),

  /**
   * The '<em><b>Assessment</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ASSESSMENT_VALUE
   * @generated
   * @ordered
   */
  ASSESSMENT(34, "Assessment", "Assessment"),

  /**
   * The '<em><b>Goal</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GOAL_VALUE
   * @generated
   * @ordered
   */
  GOAL(35, "Goal", "Goal"),

  /**
   * The '<em><b>Requirement</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REQUIREMENT_VALUE
   * @generated
   * @ordered
   */
  REQUIREMENT(36, "Requirement", "Requirement"),

  /**
   * The '<em><b>Constraint</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONSTRAINT_VALUE
   * @generated
   * @ordered
   */
  CONSTRAINT(37, "Constraint", "Constraint"),

  /**
   * The '<em><b>Principle</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PRINCIPLE_VALUE
   * @generated
   * @ordered
   */
  PRINCIPLE(38, "Principle", "Principle"),

  /**
   * The '<em><b>Work Package</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WORK_PACKAGE_VALUE
   * @generated
   * @ordered
   */
  WORK_PACKAGE(39, "WorkPackage", "WorkPackage"),

  /**
   * The '<em><b>Deliverable</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DELIVERABLE_VALUE
   * @generated
   * @ordered
   */
  DELIVERABLE(40, "Deliverable", "Deliverable"),

  /**
   * The '<em><b>Plateau</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PLATEAU_VALUE
   * @generated
   * @ordered
   */
  PLATEAU(41, "Plateau", "Plateau"),

  /**
   * The '<em><b>Gap</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GAP_VALUE
   * @generated
   * @ordered
   */
  GAP(42, "Gap", "Gap");

  /**
   * The '<em><b>Not Selected</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Not Selected</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NOT_SELECTED
   * @model name="NotSelected"
   * @generated
   * @ordered
   */
  public static final int NOT_SELECTED_VALUE = 100;

  /**
   * The '<em><b>Business Actor</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Business Actor</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUSINESS_ACTOR
   * @model name="BusinessActor"
   * @generated
   * @ordered
   */
  public static final int BUSINESS_ACTOR_VALUE = 0;

  /**
   * The '<em><b>Business Role</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Business Role</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUSINESS_ROLE
   * @model name="BusinessRole"
   * @generated
   * @ordered
   */
  public static final int BUSINESS_ROLE_VALUE = 1;

  /**
   * The '<em><b>Business Collaboration</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Business Collaboration</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUSINESS_COLLABORATION
   * @model name="BusinessCollaboration"
   * @generated
   * @ordered
   */
  public static final int BUSINESS_COLLABORATION_VALUE = 2;

  /**
   * The '<em><b>Business Interface</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Business Interface</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUSINESS_INTERFACE
   * @model name="BusinessInterface"
   * @generated
   * @ordered
   */
  public static final int BUSINESS_INTERFACE_VALUE = 3;

  /**
   * The '<em><b>Location</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Location</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LOCATION
   * @model name="Location"
   * @generated
   * @ordered
   */
  public static final int LOCATION_VALUE = 4;

  /**
   * The '<em><b>Business Object</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Business Object</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUSINESS_OBJECT
   * @model name="BusinessObject"
   * @generated
   * @ordered
   */
  public static final int BUSINESS_OBJECT_VALUE = 5;

  /**
   * The '<em><b>Business Process</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Business Process</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUSINESS_PROCESS
   * @model name="BusinessProcess"
   * @generated
   * @ordered
   */
  public static final int BUSINESS_PROCESS_VALUE = 6;

  /**
   * The '<em><b>Business Function</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Business Function</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUSINESS_FUNCTION
   * @model name="BusinessFunction"
   * @generated
   * @ordered
   */
  public static final int BUSINESS_FUNCTION_VALUE = 7;

  /**
   * The '<em><b>Business Interaction</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Business Interaction</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUSINESS_INTERACTION
   * @model name="BusinessInteraction"
   * @generated
   * @ordered
   */
  public static final int BUSINESS_INTERACTION_VALUE = 8;

  /**
   * The '<em><b>Business Event</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Business Event</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUSINESS_EVENT
   * @model name="BusinessEvent"
   * @generated
   * @ordered
   */
  public static final int BUSINESS_EVENT_VALUE = 9;

  /**
   * The '<em><b>Business Service</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Business Service</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BUSINESS_SERVICE
   * @model name="BusinessService"
   * @generated
   * @ordered
   */
  public static final int BUSINESS_SERVICE_VALUE = 10;

  /**
   * The '<em><b>Representation</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Representation</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REPRESENTATION
   * @model name="Representation"
   * @generated
   * @ordered
   */
  public static final int REPRESENTATION_VALUE = 11;

  /**
   * The '<em><b>Meaning</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Meaning</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MEANING
   * @model name="Meaning"
   * @generated
   * @ordered
   */
  public static final int MEANING_VALUE = 12;

  /**
   * The '<em><b>Value</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Value</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VALUE
   * @model name="Value"
   * @generated
   * @ordered
   */
  public static final int VALUE_VALUE = 13;

  /**
   * The '<em><b>Product</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Product</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PRODUCT
   * @model name="Product"
   * @generated
   * @ordered
   */
  public static final int PRODUCT_VALUE = 14;

  /**
   * The '<em><b>Contract</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Contract</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONTRACT
   * @model name="Contract"
   * @generated
   * @ordered
   */
  public static final int CONTRACT_VALUE = 15;

  /**
   * The '<em><b>Application Component</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Application Component</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #APPLICATION_COMPONENT
   * @model name="ApplicationComponent"
   * @generated
   * @ordered
   */
  public static final int APPLICATION_COMPONENT_VALUE = 16;

  /**
   * The '<em><b>Application Collaboration</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Application Collaboration</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #APPLICATION_COLLABORATION
   * @model name="ApplicationCollaboration"
   * @generated
   * @ordered
   */
  public static final int APPLICATION_COLLABORATION_VALUE = 17;

  /**
   * The '<em><b>Application Interface</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Application Interface</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #APPLICATION_INTERFACE
   * @model name="ApplicationInterface"
   * @generated
   * @ordered
   */
  public static final int APPLICATION_INTERFACE_VALUE = 18;

  /**
   * The '<em><b>Data Object</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Data Object</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATA_OBJECT
   * @model name="DataObject"
   * @generated
   * @ordered
   */
  public static final int DATA_OBJECT_VALUE = 19;

  /**
   * The '<em><b>Application Function</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Application Function</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #APPLICATION_FUNCTION
   * @model name="ApplicationFunction"
   * @generated
   * @ordered
   */
  public static final int APPLICATION_FUNCTION_VALUE = 20;

  /**
   * The '<em><b>Application Interaction</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Application Interaction</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #APPLICATION_INTERACTION
   * @model name="ApplicationInteraction"
   * @generated
   * @ordered
   */
  public static final int APPLICATION_INTERACTION_VALUE = 21;

  /**
   * The '<em><b>Application Service</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Application Service</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #APPLICATION_SERVICE
   * @model name="ApplicationService"
   * @generated
   * @ordered
   */
  public static final int APPLICATION_SERVICE_VALUE = 22;

  /**
   * The '<em><b>Node</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Node</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NODE
   * @model name="Node"
   * @generated
   * @ordered
   */
  public static final int NODE_VALUE = 23;

  /**
   * The '<em><b>Device</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Device</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEVICE
   * @model name="Device"
   * @generated
   * @ordered
   */
  public static final int DEVICE_VALUE = 24;

  /**
   * The '<em><b>System Software</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>System Software</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SYSTEM_SOFTWARE
   * @model name="SystemSoftware"
   * @generated
   * @ordered
   */
  public static final int SYSTEM_SOFTWARE_VALUE = 25;

  /**
   * The '<em><b>Infrastructure Interface</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Infrastructure Interface</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INFRASTRUCTURE_INTERFACE
   * @model name="InfrastructureInterface"
   * @generated
   * @ordered
   */
  public static final int INFRASTRUCTURE_INTERFACE_VALUE = 26;

  /**
   * The '<em><b>Network</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Network</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NETWORK
   * @model name="Network"
   * @generated
   * @ordered
   */
  public static final int NETWORK_VALUE = 27;

  /**
   * The '<em><b>Communication Path</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Communication Path</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMMUNICATION_PATH
   * @model name="CommunicationPath"
   * @generated
   * @ordered
   */
  public static final int COMMUNICATION_PATH_VALUE = 28;

  /**
   * The '<em><b>Infrastructure Function</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Infrastructure Function</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INFRASTRUCTURE_FUNCTION
   * @model name="InfrastructureFunction"
   * @generated
   * @ordered
   */
  public static final int INFRASTRUCTURE_FUNCTION_VALUE = 29;

  /**
   * The '<em><b>Infrastructure Service</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Infrastructure Service</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INFRASTRUCTURE_SERVICE
   * @model name="InfrastructureService"
   * @generated
   * @ordered
   */
  public static final int INFRASTRUCTURE_SERVICE_VALUE = 30;

  /**
   * The '<em><b>Artifact</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Artifact</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ARTIFACT
   * @model name="Artifact"
   * @generated
   * @ordered
   */
  public static final int ARTIFACT_VALUE = 31;

  /**
   * The '<em><b>Stakeholder</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Stakeholder</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STAKEHOLDER
   * @model name="Stakeholder"
   * @generated
   * @ordered
   */
  public static final int STAKEHOLDER_VALUE = 32;

  /**
   * The '<em><b>Driver</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Driver</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DRIVER
   * @model name="Driver"
   * @generated
   * @ordered
   */
  public static final int DRIVER_VALUE = 33;

  /**
   * The '<em><b>Assessment</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Assessment</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ASSESSMENT
   * @model name="Assessment"
   * @generated
   * @ordered
   */
  public static final int ASSESSMENT_VALUE = 34;

  /**
   * The '<em><b>Goal</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Goal</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GOAL
   * @model name="Goal"
   * @generated
   * @ordered
   */
  public static final int GOAL_VALUE = 35;

  /**
   * The '<em><b>Requirement</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Requirement</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REQUIREMENT
   * @model name="Requirement"
   * @generated
   * @ordered
   */
  public static final int REQUIREMENT_VALUE = 36;

  /**
   * The '<em><b>Constraint</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Constraint</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONSTRAINT
   * @model name="Constraint"
   * @generated
   * @ordered
   */
  public static final int CONSTRAINT_VALUE = 37;

  /**
   * The '<em><b>Principle</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Principle</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PRINCIPLE
   * @model name="Principle"
   * @generated
   * @ordered
   */
  public static final int PRINCIPLE_VALUE = 38;

  /**
   * The '<em><b>Work Package</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Work Package</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WORK_PACKAGE
   * @model name="WorkPackage"
   * @generated
   * @ordered
   */
  public static final int WORK_PACKAGE_VALUE = 39;

  /**
   * The '<em><b>Deliverable</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Deliverable</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DELIVERABLE
   * @model name="Deliverable"
   * @generated
   * @ordered
   */
  public static final int DELIVERABLE_VALUE = 40;

  /**
   * The '<em><b>Plateau</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Plateau</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PLATEAU
   * @model name="Plateau"
   * @generated
   * @ordered
   */
  public static final int PLATEAU_VALUE = 41;

  /**
   * The '<em><b>Gap</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Gap</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GAP
   * @model name="Gap"
   * @generated
   * @ordered
   */
  public static final int GAP_VALUE = 42;

  /**
   * An array of all the '<em><b>Element Type Name</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ElementTypeName[] VALUES_ARRAY =
    new ElementTypeName[]
    {
      NOT_SELECTED,
      BUSINESS_ACTOR,
      BUSINESS_ROLE,
      BUSINESS_COLLABORATION,
      BUSINESS_INTERFACE,
      LOCATION,
      BUSINESS_OBJECT,
      BUSINESS_PROCESS,
      BUSINESS_FUNCTION,
      BUSINESS_INTERACTION,
      BUSINESS_EVENT,
      BUSINESS_SERVICE,
      REPRESENTATION,
      MEANING,
      VALUE,
      PRODUCT,
      CONTRACT,
      APPLICATION_COMPONENT,
      APPLICATION_COLLABORATION,
      APPLICATION_INTERFACE,
      DATA_OBJECT,
      APPLICATION_FUNCTION,
      APPLICATION_INTERACTION,
      APPLICATION_SERVICE,
      NODE,
      DEVICE,
      SYSTEM_SOFTWARE,
      INFRASTRUCTURE_INTERFACE,
      NETWORK,
      COMMUNICATION_PATH,
      INFRASTRUCTURE_FUNCTION,
      INFRASTRUCTURE_SERVICE,
      ARTIFACT,
      STAKEHOLDER,
      DRIVER,
      ASSESSMENT,
      GOAL,
      REQUIREMENT,
      CONSTRAINT,
      PRINCIPLE,
      WORK_PACKAGE,
      DELIVERABLE,
      PLATEAU,
      GAP,
    };

  /**
   * A public read-only list of all the '<em><b>Element Type Name</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ElementTypeName> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Element Type Name</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ElementTypeName get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ElementTypeName result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Element Type Name</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ElementTypeName getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ElementTypeName result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Element Type Name</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ElementTypeName get(int value)
  {
    switch (value)
    {
      case NOT_SELECTED_VALUE: return NOT_SELECTED;
      case BUSINESS_ACTOR_VALUE: return BUSINESS_ACTOR;
      case BUSINESS_ROLE_VALUE: return BUSINESS_ROLE;
      case BUSINESS_COLLABORATION_VALUE: return BUSINESS_COLLABORATION;
      case BUSINESS_INTERFACE_VALUE: return BUSINESS_INTERFACE;
      case LOCATION_VALUE: return LOCATION;
      case BUSINESS_OBJECT_VALUE: return BUSINESS_OBJECT;
      case BUSINESS_PROCESS_VALUE: return BUSINESS_PROCESS;
      case BUSINESS_FUNCTION_VALUE: return BUSINESS_FUNCTION;
      case BUSINESS_INTERACTION_VALUE: return BUSINESS_INTERACTION;
      case BUSINESS_EVENT_VALUE: return BUSINESS_EVENT;
      case BUSINESS_SERVICE_VALUE: return BUSINESS_SERVICE;
      case REPRESENTATION_VALUE: return REPRESENTATION;
      case MEANING_VALUE: return MEANING;
      case VALUE_VALUE: return VALUE;
      case PRODUCT_VALUE: return PRODUCT;
      case CONTRACT_VALUE: return CONTRACT;
      case APPLICATION_COMPONENT_VALUE: return APPLICATION_COMPONENT;
      case APPLICATION_COLLABORATION_VALUE: return APPLICATION_COLLABORATION;
      case APPLICATION_INTERFACE_VALUE: return APPLICATION_INTERFACE;
      case DATA_OBJECT_VALUE: return DATA_OBJECT;
      case APPLICATION_FUNCTION_VALUE: return APPLICATION_FUNCTION;
      case APPLICATION_INTERACTION_VALUE: return APPLICATION_INTERACTION;
      case APPLICATION_SERVICE_VALUE: return APPLICATION_SERVICE;
      case NODE_VALUE: return NODE;
      case DEVICE_VALUE: return DEVICE;
      case SYSTEM_SOFTWARE_VALUE: return SYSTEM_SOFTWARE;
      case INFRASTRUCTURE_INTERFACE_VALUE: return INFRASTRUCTURE_INTERFACE;
      case NETWORK_VALUE: return NETWORK;
      case COMMUNICATION_PATH_VALUE: return COMMUNICATION_PATH;
      case INFRASTRUCTURE_FUNCTION_VALUE: return INFRASTRUCTURE_FUNCTION;
      case INFRASTRUCTURE_SERVICE_VALUE: return INFRASTRUCTURE_SERVICE;
      case ARTIFACT_VALUE: return ARTIFACT;
      case STAKEHOLDER_VALUE: return STAKEHOLDER;
      case DRIVER_VALUE: return DRIVER;
      case ASSESSMENT_VALUE: return ASSESSMENT;
      case GOAL_VALUE: return GOAL;
      case REQUIREMENT_VALUE: return REQUIREMENT;
      case CONSTRAINT_VALUE: return CONSTRAINT;
      case PRINCIPLE_VALUE: return PRINCIPLE;
      case WORK_PACKAGE_VALUE: return WORK_PACKAGE;
      case DELIVERABLE_VALUE: return DELIVERABLE;
      case PLATEAU_VALUE: return PLATEAU;
      case GAP_VALUE: return GAP;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ElementTypeName(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ElementTypeName
