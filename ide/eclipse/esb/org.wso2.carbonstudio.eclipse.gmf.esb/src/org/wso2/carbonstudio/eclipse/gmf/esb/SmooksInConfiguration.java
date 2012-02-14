/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.gmf.esb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smooks In Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.SmooksInConfiguration#getType <em>Type</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.gmf.esb.SmooksInConfiguration#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getSmooksInConfiguration()
 * @model
 * @generated
 */
public interface SmooksInConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.wso2.carbonstudio.eclipse.gmf.esb.SmooksIODataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.SmooksIODataType
	 * @see #setType(SmooksIODataType)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getSmooksInConfiguration_Type()
	 * @model
	 * @generated
	 */
	SmooksIODataType getType();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.SmooksInConfiguration#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.SmooksIODataType
	 * @see #getType()
	 * @generated
	 */
	void setType(SmooksIODataType value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(NamespacedProperty)
	 * @see org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage#getSmooksInConfiguration_Expression()
	 * @model
	 * @generated
	 */
	NamespacedProperty getExpression();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.gmf.esb.SmooksInConfiguration#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(NamespacedProperty value);

} // SmooksInConfiguration
