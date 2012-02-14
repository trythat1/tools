/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.ds;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.Query#getSql <em>Sql</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.Query#getSparql <em>Sparql</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.Query#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.Query#getResult <em>Result</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.Query#getExcel <em>Excel</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.Query#getGspread <em>Gspread</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.Query#getParam <em>Param</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.Query#getId <em>Id</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.Query#getInputEventTrigger <em>Input Event Trigger</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.Query#getKeyColumns <em>Key Columns</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.Query#getOutputEventTrigger <em>Output Event Trigger</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.Query#isReturnGeneratedKeys <em>Return Generated Keys</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.Query#getUseConfig <em>Use Config</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery()
 * @model extendedMetaData="name='query_._type' kind='elementOnly'"
 * @generated
 */
public interface Query extends EObject {
	/**
	 * Returns the value of the '<em><b>Sql</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.ds.Sql}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery_Sql()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sql' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Sql> getSql();

	/**
	 * Returns the value of the '<em><b>Sparql</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sparql</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sparql</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery_Sparql()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sparql' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EObject> getSparql();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.ds.QueryPropertyList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QueryPropertyList> getProperties();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.ds.ResultMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery_Result()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='result' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResultMapping> getResult();

	/**
	 * Returns the value of the '<em><b>Excel</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.ds.ExcelQuery}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Excel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excel</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery_Excel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='excel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExcelQuery> getExcel();

	/**
	 * Returns the value of the '<em><b>Gspread</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.ds.GSpreadQuery}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gspread</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gspread</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery_Gspread()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gspread' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GSpreadQuery> getGspread();

	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.carbonstudio.eclipse.ds.QueryParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' containment reference list.
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery_Param()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QueryParameter> getParam();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.Query#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Input Event Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Event Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Event Trigger</em>' attribute.
	 * @see #setInputEventTrigger(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery_InputEventTrigger()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='input-event-trigger' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInputEventTrigger();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.Query#getInputEventTrigger <em>Input Event Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Event Trigger</em>' attribute.
	 * @see #getInputEventTrigger()
	 * @generated
	 */
	void setInputEventTrigger(String value);

	/**
	 * Returns the value of the '<em><b>Key Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Columns</em>' attribute.
	 * @see #setKeyColumns(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery_KeyColumns()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='keyColumns' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKeyColumns();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.Query#getKeyColumns <em>Key Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Columns</em>' attribute.
	 * @see #getKeyColumns()
	 * @generated
	 */
	void setKeyColumns(String value);

	/**
	 * Returns the value of the '<em><b>Output Event Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Event Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Event Trigger</em>' attribute.
	 * @see #setOutputEventTrigger(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery_OutputEventTrigger()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='output-event-trigger' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOutputEventTrigger();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.Query#getOutputEventTrigger <em>Output Event Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Event Trigger</em>' attribute.
	 * @see #getOutputEventTrigger()
	 * @generated
	 */
	void setOutputEventTrigger(String value);

	/**
	 * Returns the value of the '<em><b>Return Generated Keys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Generated Keys</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Generated Keys</em>' attribute.
	 * @see #isSetReturnGeneratedKeys()
	 * @see #unsetReturnGeneratedKeys()
	 * @see #setReturnGeneratedKeys(boolean)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery_ReturnGeneratedKeys()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='returnGeneratedKeys' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isReturnGeneratedKeys();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.Query#isReturnGeneratedKeys <em>Return Generated Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Generated Keys</em>' attribute.
	 * @see #isSetReturnGeneratedKeys()
	 * @see #unsetReturnGeneratedKeys()
	 * @see #isReturnGeneratedKeys()
	 * @generated
	 */
	void setReturnGeneratedKeys(boolean value);

	/**
	 * Unsets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.Query#isReturnGeneratedKeys <em>Return Generated Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReturnGeneratedKeys()
	 * @see #isReturnGeneratedKeys()
	 * @see #setReturnGeneratedKeys(boolean)
	 * @generated
	 */
	void unsetReturnGeneratedKeys();

	/**
	 * Returns whether the value of the '{@link org.wso2.carbonstudio.eclipse.ds.Query#isReturnGeneratedKeys <em>Return Generated Keys</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Return Generated Keys</em>' attribute is set.
	 * @see #unsetReturnGeneratedKeys()
	 * @see #isReturnGeneratedKeys()
	 * @see #setReturnGeneratedKeys(boolean)
	 * @generated
	 */
	boolean isSetReturnGeneratedKeys();

	/**
	 * Returns the value of the '<em><b>Use Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Config</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Config</em>' attribute.
	 * @see #setUseConfig(String)
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#getQuery_UseConfig()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='useConfig' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUseConfig();

	/**
	 * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.ds.Query#getUseConfig <em>Use Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Config</em>' attribute.
	 * @see #getUseConfig()
	 * @generated
	 */
	void setUseConfig(String value);

} // Query
