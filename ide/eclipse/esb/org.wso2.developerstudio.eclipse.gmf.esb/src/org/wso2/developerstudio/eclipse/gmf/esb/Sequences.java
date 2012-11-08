/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequences</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.Sequences#getOutputConnector <em>Output Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.Sequences#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.Sequences#getMediatorFlow <em>Mediator Flow</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.Sequences#getName <em>Name</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.Sequences#isRecieveSequence <em>Recieve Sequence</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.Sequences#getAssociatedProxy <em>Associated Proxy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getSequences()
 * @model
 * @generated
 */
public interface Sequences extends EsbElement {

	/**
	 * Returns the value of the '<em><b>Mediator Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mediator Flow</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediator Flow</em>' containment reference.
	 * @see #setMediatorFlow(MediatorFlow)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getSequences_MediatorFlow()
	 * @model containment="true"
	 * @generated
	 */
	MediatorFlow getMediatorFlow();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.Sequences#getMediatorFlow <em>Mediator Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mediator Flow</em>' containment reference.
	 * @see #getMediatorFlow()
	 * @generated
	 */
	void setMediatorFlow(MediatorFlow value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getSequences_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.Sequences#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Recieve Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recieve Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recieve Sequence</em>' attribute.
	 * @see #setRecieveSequence(boolean)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getSequences_RecieveSequence()
	 * @model
	 * @generated
	 */
	boolean isRecieveSequence();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.Sequences#isRecieveSequence <em>Recieve Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recieve Sequence</em>' attribute.
	 * @see #isRecieveSequence()
	 * @generated
	 */
	void setRecieveSequence(boolean value);

	/**
	 * Returns the value of the '<em><b>Associated Proxy</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Proxy</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Proxy</em>' attribute list.
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getSequences_AssociatedProxy()
	 * @model
	 * @generated
	 */
	EList<String> getAssociatedProxy();

	/**
	 * Returns the value of the '<em><b>Output Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Connector</em>' containment reference.
	 * @see #setOutputConnector(SequencesOutputConnector)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getSequences_OutputConnector()
	 * @model containment="true"
	 * @generated
	 */
	SequencesOutputConnector getOutputConnector();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.Sequences#getOutputConnector <em>Output Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Connector</em>' containment reference.
	 * @see #getOutputConnector()
	 * @generated
	 */
	void setOutputConnector(SequencesOutputConnector value);

	/**
	 * Returns the value of the '<em><b>Input Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Connector</em>' containment reference.
	 * @see #setInputConnector(SequencesInputConnector)
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getSequences_InputConnector()
	 * @model containment="true"
	 * @generated
	 */
	SequencesInputConnector getInputConnector();

	/**
	 * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.Sequences#getInputConnector <em>Input Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Connector</em>' containment reference.
	 * @see #getInputConnector()
	 * @generated
	 */
	void setInputConnector(SequencesInputConnector value);
} // Sequences
