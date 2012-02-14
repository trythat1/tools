/* Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbonstudio.eclipse.ds;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Double Range Validator</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.DoubleRangeValidator#getMinValue
 * <em>Min Value</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.DoubleRangeValidator#getMaxValue
 * <em>Max Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDoubleRangeValidator()
 * @model extendedMetaData="name='validateDoubleRange_._type' kind='empty'"
 * @generated
 */
public interface DoubleRangeValidator extends EObject {
	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #isSetMinValue()
	 * @see #unsetMinValue()
	 * @see #setMinValue(double)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDoubleRangeValidator_MinValue()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData
	 *        ="kind='attribute' name='minimum' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMinValue();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DoubleRangeValidator#getMinValue
	 * <em>Min Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Min Value</em>' attribute.
	 * @see #isSetMinValue()
	 * @see #unsetMinValue()
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(double value);

	/**
	 * Unsets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DoubleRangeValidator#getMinValue
	 * <em>Min Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #isSetMinValue()
	 * @see #getMinValue()
	 * @see #setMinValue(double)
	 * @generated
	 */
	void unsetMinValue();

	/**
	 * Returns whether the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DoubleRangeValidator#getMinValue
	 * <em>Min Value</em>}' attribute is set. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Min Value</em>' attribute is set.
	 * @see #unsetMinValue()
	 * @see #getMinValue()
	 * @see #setMinValue(double)
	 * @generated
	 */
	boolean isSetMinValue();

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #isSetMaxValue()
	 * @see #unsetMaxValue()
	 * @see #setMaxValue(double)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getDoubleRangeValidator_MaxValue()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData
	 *        ="kind='attribute' name='maximum' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMaxValue();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DoubleRangeValidator#getMaxValue
	 * <em>Max Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Max Value</em>' attribute.
	 * @see #isSetMaxValue()
	 * @see #unsetMaxValue()
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(double value);

	/**
	 * Unsets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DoubleRangeValidator#getMaxValue
	 * <em>Max Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #isSetMaxValue()
	 * @see #getMaxValue()
	 * @see #setMaxValue(double)
	 * @generated
	 */
	void unsetMaxValue();

	/**
	 * Returns whether the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.DoubleRangeValidator#getMaxValue
	 * <em>Max Value</em>}' attribute is set. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Max Value</em>' attribute is set.
	 * @see #unsetMaxValue()
	 * @see #getMaxValue()
	 * @see #setMaxValue(double)
	 * @generated
	 */
	boolean isSetMaxValue();

} // DoubleRangeValidator
