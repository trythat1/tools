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

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>GSpread Query</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#getWorksheetNumber
 * <em>Worksheet Number</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#getStartingRow <em>
 * Starting Row</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#getMaxRowCount <em>
 * Max Row Count</em>}</li>
 * <li>{@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#isHasHeader <em>Has
 * Header</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getGSpreadQuery()
 * @model extendedMetaData="name='gspread_._type' kind='elementOnly'"
 * @generated
 */
public interface GSpreadQuery extends EObject {
	/**
	 * Returns the value of the '<em><b>Worksheet Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worksheet Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Worksheet Number</em>' attribute.
	 * @see #setWorksheetNumber(BigInteger)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getGSpreadQuery_WorksheetNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        required="true" extendedMetaData=
	 *        "kind='element' name='worksheetnumber' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getWorksheetNumber();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#getWorksheetNumber
	 * <em>Worksheet Number</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Worksheet Number</em>' attribute.
	 * @see #getWorksheetNumber()
	 * @generated
	 */
	void setWorksheetNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Starting Row</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Starting Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Starting Row</em>' attribute.
	 * @see #setStartingRow(BigInteger)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getGSpreadQuery_StartingRow()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        required="true" extendedMetaData=
	 *        "kind='element' name='startingrow' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStartingRow();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#getStartingRow
	 * <em>Starting Row</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Starting Row</em>' attribute.
	 * @see #getStartingRow()
	 * @generated
	 */
	void setStartingRow(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Max Row Count</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Row Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Max Row Count</em>' attribute.
	 * @see #setMaxRowCount(BigInteger)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getGSpreadQuery_MaxRowCount()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        required="true" extendedMetaData=
	 *        "kind='element' name='maxrowcount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaxRowCount();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#getMaxRowCount
	 * <em>Max Row Count</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Max Row Count</em>' attribute.
	 * @see #getMaxRowCount()
	 * @generated
	 */
	void setMaxRowCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Has Header</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Header</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Has Header</em>' attribute.
	 * @see #isSetHasHeader()
	 * @see #unsetHasHeader()
	 * @see #setHasHeader(boolean)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getGSpreadQuery_HasHeader()
	 * @model unsettable="true"
	 *        dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData
	 *        ="kind='element' name='hasheader' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHasHeader();

	/**
	 * Sets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#isHasHeader
	 * <em>Has Header</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Has Header</em>' attribute.
	 * @see #isSetHasHeader()
	 * @see #unsetHasHeader()
	 * @see #isHasHeader()
	 * @generated
	 */
	void setHasHeader(boolean value);

	/**
	 * Unsets the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#isHasHeader
	 * <em>Has Header</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isSetHasHeader()
	 * @see #isHasHeader()
	 * @see #setHasHeader(boolean)
	 * @generated
	 */
	void unsetHasHeader();

	/**
	 * Returns whether the value of the '
	 * {@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery#isHasHeader
	 * <em>Has Header</em>}' attribute is set. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Has Header</em>' attribute is set.
	 * @see #unsetHasHeader()
	 * @see #isHasHeader()
	 * @see #setHasHeader(boolean)
	 * @generated
	 */
	boolean isSetHasHeader();

} // GSpreadQuery
