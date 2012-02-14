/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.ds.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.wso2.carbonstudio.eclipse.ds.AttributeMapping;
import org.wso2.carbonstudio.eclipse.ds.CallQuery;
import org.wso2.carbonstudio.eclipse.ds.CallQueryList;
import org.wso2.carbonstudio.eclipse.ds.ConfigurationProperty;
import org.wso2.carbonstudio.eclipse.ds.CustomValidator;
import org.wso2.carbonstudio.eclipse.ds.DataService;
import org.wso2.carbonstudio.eclipse.ds.DataSourceConfiguration;
import org.wso2.carbonstudio.eclipse.ds.DocumentRoot;
import org.wso2.carbonstudio.eclipse.ds.DoubleRangeValidator;
import org.wso2.carbonstudio.eclipse.ds.DsFactory;
import org.wso2.carbonstudio.eclipse.ds.DsPackage;
import org.wso2.carbonstudio.eclipse.ds.ElementMapping;
import org.wso2.carbonstudio.eclipse.ds.EventSubscriptionList;
import org.wso2.carbonstudio.eclipse.ds.EventTrigger;
import org.wso2.carbonstudio.eclipse.ds.ExcelQuery;
import org.wso2.carbonstudio.eclipse.ds.GSpreadQuery;
import org.wso2.carbonstudio.eclipse.ds.LengthValidator;
import org.wso2.carbonstudio.eclipse.ds.LongRangeValidator;
import org.wso2.carbonstudio.eclipse.ds.Operation;
import org.wso2.carbonstudio.eclipse.ds.ParameterMapping;
import org.wso2.carbonstudio.eclipse.ds.PatternValidator;
import org.wso2.carbonstudio.eclipse.ds.Query;
import org.wso2.carbonstudio.eclipse.ds.QueryParameter;
import org.wso2.carbonstudio.eclipse.ds.QueryProperty;
import org.wso2.carbonstudio.eclipse.ds.QueryPropertyList;
import org.wso2.carbonstudio.eclipse.ds.Resource;
import org.wso2.carbonstudio.eclipse.ds.ResultMapping;
import org.wso2.carbonstudio.eclipse.ds.ServiceStatus;
import org.wso2.carbonstudio.eclipse.ds.Sql;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DsPackageImpl extends EPackageImpl implements DsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callQueryListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleRangeValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventSubscriptionListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excelQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gSpreadQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longRangeValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryPropertyListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType serviceStatusObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.wso2.carbonstudio.eclipse.ds.DsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DsPackageImpl() {
		super(eNS_URI, DsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DsPackage init() {
		if (isInited) return (DsPackage)EPackage.Registry.INSTANCE.getEPackage(DsPackage.eNS_URI);

		// Obtain or create and register package
		DsPackageImpl theDsPackage = (DsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDsPackage.createPackageContents();

		// Initialize created meta-data
		theDsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DsPackage.eNS_URI, theDsPackage);
		return theDsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeMapping() {
		return attributeMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeMapping_Column() {
		return (EAttribute)attributeMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeMapping_Name() {
		return (EAttribute)attributeMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeMapping_RequiredRoles() {
		return (EAttribute)attributeMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeMapping_XsdType() {
		return (EAttribute)attributeMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallQuery() {
		return callQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallQuery_WithParam() {
		return (EReference)callQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallQuery_Href() {
		return (EAttribute)callQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallQueryList() {
		return callQueryListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallQueryList_CallQuery() {
		return (EReference)callQueryListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationProperty() {
		return configurationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationProperty_Value() {
		return (EAttribute)configurationPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationProperty_Name() {
		return (EAttribute)configurationPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomValidator() {
		return customValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomValidator_Class() {
		return (EAttribute)customValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataService() {
		return dataServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataService_Description() {
		return (EReference)dataServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataService_Config() {
		return (EReference)dataServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataService_Query() {
		return (EReference)dataServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataService_EventTrigger() {
		return (EReference)dataServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataService_Operation() {
		return (EReference)dataServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataService_Resource() {
		return (EReference)dataServiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataService_BaseURI() {
		return (EAttribute)dataServiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataService_EnableBatchRequests() {
		return (EAttribute)dataServiceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataService_EnableBoxcarring() {
		return (EAttribute)dataServiceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataService_EnableDTP() {
		return (EAttribute)dataServiceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataService_Name() {
		return (EAttribute)dataServiceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataService_ServiceGroup() {
		return (EAttribute)dataServiceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataService_ServiceStatus() {
		return (EAttribute)dataServiceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataService_ServiceNamespace() {
		return (EAttribute)dataServiceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSourceConfiguration() {
		return dataSourceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSourceConfiguration_Property() {
		return (EReference)dataSourceConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceConfiguration_Id() {
		return (EAttribute)dataSourceConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CallQuery() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Data() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Property() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Sql() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleRangeValidator() {
		return doubleRangeValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleRangeValidator_Maximum() {
		return (EAttribute)doubleRangeValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleRangeValidator_Minimum() {
		return (EAttribute)doubleRangeValidatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementMapping() {
		return elementMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementMapping_Column() {
		return (EAttribute)elementMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementMapping_Export() {
		return (EAttribute)elementMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementMapping_Name() {
		return (EAttribute)elementMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementMapping_RequiredRoles() {
		return (EAttribute)elementMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementMapping_XsdType() {
		return (EAttribute)elementMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventSubscriptionList() {
		return eventSubscriptionListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventSubscriptionList_Subscription() {
		return (EReference)eventSubscriptionListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventTrigger() {
		return eventTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventTrigger_Expression() {
		return (EReference)eventTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventTrigger_TargetTopic() {
		return (EReference)eventTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventTrigger_Subscriptions() {
		return (EReference)eventTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventTrigger_Id() {
		return (EAttribute)eventTriggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventTrigger_Language() {
		return (EAttribute)eventTriggerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcelQuery() {
		return excelQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelQuery_Workbookname() {
		return (EAttribute)excelQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelQuery_Hasheader() {
		return (EAttribute)excelQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelQuery_Startingrow() {
		return (EAttribute)excelQueryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelQuery_Maxrowcount() {
		return (EAttribute)excelQueryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSpreadQuery() {
		return gSpreadQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSpreadQuery_Worksheetnumber() {
		return (EAttribute)gSpreadQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSpreadQuery_Startingrow() {
		return (EAttribute)gSpreadQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSpreadQuery_Maxrowcount() {
		return (EAttribute)gSpreadQueryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSpreadQuery_Hasheader() {
		return (EAttribute)gSpreadQueryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLengthValidator() {
		return lengthValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLengthValidator_Maximum() {
		return (EAttribute)lengthValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLengthValidator_Minimum() {
		return (EAttribute)lengthValidatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongRangeValidator() {
		return longRangeValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongRangeValidator_Maximum() {
		return (EAttribute)longRangeValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongRangeValidator_Minimum() {
		return (EAttribute)longRangeValidatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_CallQuery() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_CallQueryGroup() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_DisableStreaming() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Name() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterMapping() {
		return parameterMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterMapping_Column() {
		return (EAttribute)parameterMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterMapping_Name() {
		return (EAttribute)parameterMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterMapping_QueryParam() {
		return (EAttribute)parameterMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternValidator() {
		return patternValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternValidator_Pattern() {
		return (EAttribute)patternValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuery() {
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Sql() {
		return (EReference)queryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Sparql() {
		return (EReference)queryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Properties() {
		return (EReference)queryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Result() {
		return (EReference)queryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Excel() {
		return (EReference)queryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Gspread() {
		return (EReference)queryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Param() {
		return (EReference)queryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Id() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_InputEventTrigger() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_KeyColumns() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_OutputEventTrigger() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_ReturnGeneratedKeys() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_UseConfig() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryParameter() {
		return queryParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryParameter_ValidateLongRange() {
		return (EReference)queryParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryParameter_ValidateDoubleRange() {
		return (EReference)queryParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryParameter_ValidateLength() {
		return (EReference)queryParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryParameter_ValidatePattern() {
		return (EReference)queryParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryParameter_ValidateCustom() {
		return (EReference)queryParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParameter_DefaultValue() {
		return (EAttribute)queryParameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParameter_Name() {
		return (EAttribute)queryParameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParameter_Ordinal() {
		return (EAttribute)queryParameterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParameter_ParamType() {
		return (EAttribute)queryParameterEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParameter_SqlType() {
		return (EAttribute)queryParameterEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParameter_StructType() {
		return (EAttribute)queryParameterEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParameter_Type() {
		return (EAttribute)queryParameterEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryProperty() {
		return queryPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryProperty_Value() {
		return (EAttribute)queryPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryProperty_Name() {
		return (EAttribute)queryPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryPropertyList() {
		return queryPropertyListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryPropertyList_Property() {
		return (EReference)queryPropertyListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_CallQuery() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Method() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Path() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_ReturnRequestStatus() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultMapping() {
		return resultMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultMapping_ElementMappings() {
		return (EReference)resultMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultMapping_Attribute() {
		return (EReference)resultMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultMapping_CallQuery() {
		return (EReference)resultMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultMapping_DefaultNamespace() {
		return (EAttribute)resultMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultMapping_ElementName() {
		return (EAttribute)resultMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultMapping_RowName() {
		return (EAttribute)resultMappingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultMapping_UseColumnNumbers() {
		return (EAttribute)resultMappingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultMapping_XsltPath() {
		return (EAttribute)resultMappingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSql() {
		return sqlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSql_Value() {
		return (EAttribute)sqlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSql_Dialect() {
		return (EAttribute)sqlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServiceStatus() {
		return serviceStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getServiceStatusObject() {
		return serviceStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsFactory getDsFactory() {
		return (DsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		attributeMappingEClass = createEClass(ATTRIBUTE_MAPPING);
		createEAttribute(attributeMappingEClass, ATTRIBUTE_MAPPING__COLUMN);
		createEAttribute(attributeMappingEClass, ATTRIBUTE_MAPPING__NAME);
		createEAttribute(attributeMappingEClass, ATTRIBUTE_MAPPING__REQUIRED_ROLES);
		createEAttribute(attributeMappingEClass, ATTRIBUTE_MAPPING__XSD_TYPE);

		callQueryEClass = createEClass(CALL_QUERY);
		createEReference(callQueryEClass, CALL_QUERY__WITH_PARAM);
		createEAttribute(callQueryEClass, CALL_QUERY__HREF);

		callQueryListEClass = createEClass(CALL_QUERY_LIST);
		createEReference(callQueryListEClass, CALL_QUERY_LIST__CALL_QUERY);

		configurationPropertyEClass = createEClass(CONFIGURATION_PROPERTY);
		createEAttribute(configurationPropertyEClass, CONFIGURATION_PROPERTY__VALUE);
		createEAttribute(configurationPropertyEClass, CONFIGURATION_PROPERTY__NAME);

		customValidatorEClass = createEClass(CUSTOM_VALIDATOR);
		createEAttribute(customValidatorEClass, CUSTOM_VALIDATOR__CLASS);

		dataServiceEClass = createEClass(DATA_SERVICE);
		createEReference(dataServiceEClass, DATA_SERVICE__DESCRIPTION);
		createEReference(dataServiceEClass, DATA_SERVICE__CONFIG);
		createEReference(dataServiceEClass, DATA_SERVICE__QUERY);
		createEReference(dataServiceEClass, DATA_SERVICE__EVENT_TRIGGER);
		createEReference(dataServiceEClass, DATA_SERVICE__OPERATION);
		createEReference(dataServiceEClass, DATA_SERVICE__RESOURCE);
		createEAttribute(dataServiceEClass, DATA_SERVICE__BASE_URI);
		createEAttribute(dataServiceEClass, DATA_SERVICE__ENABLE_BATCH_REQUESTS);
		createEAttribute(dataServiceEClass, DATA_SERVICE__ENABLE_BOXCARRING);
		createEAttribute(dataServiceEClass, DATA_SERVICE__ENABLE_DTP);
		createEAttribute(dataServiceEClass, DATA_SERVICE__NAME);
		createEAttribute(dataServiceEClass, DATA_SERVICE__SERVICE_GROUP);
		createEAttribute(dataServiceEClass, DATA_SERVICE__SERVICE_STATUS);
		createEAttribute(dataServiceEClass, DATA_SERVICE__SERVICE_NAMESPACE);

		dataSourceConfigurationEClass = createEClass(DATA_SOURCE_CONFIGURATION);
		createEReference(dataSourceConfigurationEClass, DATA_SOURCE_CONFIGURATION__PROPERTY);
		createEAttribute(dataSourceConfigurationEClass, DATA_SOURCE_CONFIGURATION__ID);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CALL_QUERY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SQL);

		doubleRangeValidatorEClass = createEClass(DOUBLE_RANGE_VALIDATOR);
		createEAttribute(doubleRangeValidatorEClass, DOUBLE_RANGE_VALIDATOR__MAXIMUM);
		createEAttribute(doubleRangeValidatorEClass, DOUBLE_RANGE_VALIDATOR__MINIMUM);

		elementMappingEClass = createEClass(ELEMENT_MAPPING);
		createEAttribute(elementMappingEClass, ELEMENT_MAPPING__COLUMN);
		createEAttribute(elementMappingEClass, ELEMENT_MAPPING__EXPORT);
		createEAttribute(elementMappingEClass, ELEMENT_MAPPING__NAME);
		createEAttribute(elementMappingEClass, ELEMENT_MAPPING__REQUIRED_ROLES);
		createEAttribute(elementMappingEClass, ELEMENT_MAPPING__XSD_TYPE);

		eventSubscriptionListEClass = createEClass(EVENT_SUBSCRIPTION_LIST);
		createEReference(eventSubscriptionListEClass, EVENT_SUBSCRIPTION_LIST__SUBSCRIPTION);

		eventTriggerEClass = createEClass(EVENT_TRIGGER);
		createEReference(eventTriggerEClass, EVENT_TRIGGER__EXPRESSION);
		createEReference(eventTriggerEClass, EVENT_TRIGGER__TARGET_TOPIC);
		createEReference(eventTriggerEClass, EVENT_TRIGGER__SUBSCRIPTIONS);
		createEAttribute(eventTriggerEClass, EVENT_TRIGGER__ID);
		createEAttribute(eventTriggerEClass, EVENT_TRIGGER__LANGUAGE);

		excelQueryEClass = createEClass(EXCEL_QUERY);
		createEAttribute(excelQueryEClass, EXCEL_QUERY__WORKBOOKNAME);
		createEAttribute(excelQueryEClass, EXCEL_QUERY__HASHEADER);
		createEAttribute(excelQueryEClass, EXCEL_QUERY__STARTINGROW);
		createEAttribute(excelQueryEClass, EXCEL_QUERY__MAXROWCOUNT);

		gSpreadQueryEClass = createEClass(GSPREAD_QUERY);
		createEAttribute(gSpreadQueryEClass, GSPREAD_QUERY__WORKSHEETNUMBER);
		createEAttribute(gSpreadQueryEClass, GSPREAD_QUERY__STARTINGROW);
		createEAttribute(gSpreadQueryEClass, GSPREAD_QUERY__MAXROWCOUNT);
		createEAttribute(gSpreadQueryEClass, GSPREAD_QUERY__HASHEADER);

		lengthValidatorEClass = createEClass(LENGTH_VALIDATOR);
		createEAttribute(lengthValidatorEClass, LENGTH_VALIDATOR__MAXIMUM);
		createEAttribute(lengthValidatorEClass, LENGTH_VALIDATOR__MINIMUM);

		longRangeValidatorEClass = createEClass(LONG_RANGE_VALIDATOR);
		createEAttribute(longRangeValidatorEClass, LONG_RANGE_VALIDATOR__MAXIMUM);
		createEAttribute(longRangeValidatorEClass, LONG_RANGE_VALIDATOR__MINIMUM);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__CALL_QUERY);
		createEReference(operationEClass, OPERATION__CALL_QUERY_GROUP);
		createEAttribute(operationEClass, OPERATION__DISABLE_STREAMING);
		createEAttribute(operationEClass, OPERATION__NAME);

		parameterMappingEClass = createEClass(PARAMETER_MAPPING);
		createEAttribute(parameterMappingEClass, PARAMETER_MAPPING__COLUMN);
		createEAttribute(parameterMappingEClass, PARAMETER_MAPPING__NAME);
		createEAttribute(parameterMappingEClass, PARAMETER_MAPPING__QUERY_PARAM);

		patternValidatorEClass = createEClass(PATTERN_VALIDATOR);
		createEAttribute(patternValidatorEClass, PATTERN_VALIDATOR__PATTERN);

		queryEClass = createEClass(QUERY);
		createEReference(queryEClass, QUERY__SQL);
		createEReference(queryEClass, QUERY__SPARQL);
		createEReference(queryEClass, QUERY__PROPERTIES);
		createEReference(queryEClass, QUERY__RESULT);
		createEReference(queryEClass, QUERY__EXCEL);
		createEReference(queryEClass, QUERY__GSPREAD);
		createEReference(queryEClass, QUERY__PARAM);
		createEAttribute(queryEClass, QUERY__ID);
		createEAttribute(queryEClass, QUERY__INPUT_EVENT_TRIGGER);
		createEAttribute(queryEClass, QUERY__KEY_COLUMNS);
		createEAttribute(queryEClass, QUERY__OUTPUT_EVENT_TRIGGER);
		createEAttribute(queryEClass, QUERY__RETURN_GENERATED_KEYS);
		createEAttribute(queryEClass, QUERY__USE_CONFIG);

		queryParameterEClass = createEClass(QUERY_PARAMETER);
		createEReference(queryParameterEClass, QUERY_PARAMETER__VALIDATE_LONG_RANGE);
		createEReference(queryParameterEClass, QUERY_PARAMETER__VALIDATE_DOUBLE_RANGE);
		createEReference(queryParameterEClass, QUERY_PARAMETER__VALIDATE_LENGTH);
		createEReference(queryParameterEClass, QUERY_PARAMETER__VALIDATE_PATTERN);
		createEReference(queryParameterEClass, QUERY_PARAMETER__VALIDATE_CUSTOM);
		createEAttribute(queryParameterEClass, QUERY_PARAMETER__DEFAULT_VALUE);
		createEAttribute(queryParameterEClass, QUERY_PARAMETER__NAME);
		createEAttribute(queryParameterEClass, QUERY_PARAMETER__ORDINAL);
		createEAttribute(queryParameterEClass, QUERY_PARAMETER__PARAM_TYPE);
		createEAttribute(queryParameterEClass, QUERY_PARAMETER__SQL_TYPE);
		createEAttribute(queryParameterEClass, QUERY_PARAMETER__STRUCT_TYPE);
		createEAttribute(queryParameterEClass, QUERY_PARAMETER__TYPE);

		queryPropertyEClass = createEClass(QUERY_PROPERTY);
		createEAttribute(queryPropertyEClass, QUERY_PROPERTY__VALUE);
		createEAttribute(queryPropertyEClass, QUERY_PROPERTY__NAME);

		queryPropertyListEClass = createEClass(QUERY_PROPERTY_LIST);
		createEReference(queryPropertyListEClass, QUERY_PROPERTY_LIST__PROPERTY);

		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__CALL_QUERY);
		createEAttribute(resourceEClass, RESOURCE__METHOD);
		createEAttribute(resourceEClass, RESOURCE__PATH);
		createEAttribute(resourceEClass, RESOURCE__RETURN_REQUEST_STATUS);

		resultMappingEClass = createEClass(RESULT_MAPPING);
		createEReference(resultMappingEClass, RESULT_MAPPING__ELEMENT_MAPPINGS);
		createEReference(resultMappingEClass, RESULT_MAPPING__ATTRIBUTE);
		createEReference(resultMappingEClass, RESULT_MAPPING__CALL_QUERY);
		createEAttribute(resultMappingEClass, RESULT_MAPPING__DEFAULT_NAMESPACE);
		createEAttribute(resultMappingEClass, RESULT_MAPPING__ELEMENT_NAME);
		createEAttribute(resultMappingEClass, RESULT_MAPPING__ROW_NAME);
		createEAttribute(resultMappingEClass, RESULT_MAPPING__USE_COLUMN_NUMBERS);
		createEAttribute(resultMappingEClass, RESULT_MAPPING__XSLT_PATH);

		sqlEClass = createEClass(SQL);
		createEAttribute(sqlEClass, SQL__VALUE);
		createEAttribute(sqlEClass, SQL__DIALECT);

		// Create enums
		serviceStatusEEnum = createEEnum(SERVICE_STATUS);

		// Create data types
		serviceStatusObjectEDataType = createEDataType(SERVICE_STATUS_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(attributeMappingEClass, AttributeMapping.class, "AttributeMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeMapping_Column(), theXMLTypePackage.getString(), "column", null, 1, 1, AttributeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeMapping_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AttributeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeMapping_RequiredRoles(), theXMLTypePackage.getString(), "requiredRoles", null, 0, 1, AttributeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeMapping_XsdType(), theXMLTypePackage.getString(), "xsdType", null, 0, 1, AttributeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callQueryEClass, CallQuery.class, "CallQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallQuery_WithParam(), this.getParameterMapping(), null, "withParam", null, 0, -1, CallQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallQuery_Href(), theXMLTypePackage.getString(), "href", null, 1, 1, CallQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callQueryListEClass, CallQueryList.class, "CallQueryList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallQueryList_CallQuery(), this.getCallQuery(), null, "callQuery", null, 1, -1, CallQueryList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationPropertyEClass, ConfigurationProperty.class, "ConfigurationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationProperty_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, ConfigurationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationProperty_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ConfigurationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customValidatorEClass, CustomValidator.class, "CustomValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomValidator_Class(), theXMLTypePackage.getString(), "class", null, 1, 1, CustomValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataServiceEClass, DataService.class, "DataService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataService_Description(), ecorePackage.getEObject(), null, "description", null, 0, -1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataService_Config(), this.getDataSourceConfiguration(), null, "config", null, 0, -1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataService_Query(), this.getQuery(), null, "query", null, 0, -1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataService_EventTrigger(), this.getEventTrigger(), null, "eventTrigger", null, 0, -1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataService_Operation(), this.getOperation(), null, "operation", null, 0, -1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataService_Resource(), this.getResource(), null, "resource", null, 0, -1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataService_BaseURI(), theXMLTypePackage.getString(), "baseURI", null, 0, 1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataService_EnableBatchRequests(), theXMLTypePackage.getBoolean(), "enableBatchRequests", null, 0, 1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataService_EnableBoxcarring(), theXMLTypePackage.getBoolean(), "enableBoxcarring", null, 0, 1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataService_EnableDTP(), theXMLTypePackage.getBoolean(), "enableDTP", null, 0, 1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataService_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataService_ServiceGroup(), theXMLTypePackage.getString(), "serviceGroup", null, 0, 1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataService_ServiceStatus(), this.getServiceStatus(), "serviceStatus", null, 0, 1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataService_ServiceNamespace(), theXMLTypePackage.getString(), "serviceNamespace", "", 0, 1, DataService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceConfigurationEClass, DataSourceConfiguration.class, "DataSourceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSourceConfiguration_Property(), this.getConfigurationProperty(), null, "property", null, 1, -1, DataSourceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceConfiguration_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, DataSourceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CallQuery(), this.getCallQuery(), null, "callQuery", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Data(), this.getDataService(), null, "data", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Property(), this.getConfigurationProperty(), null, "property", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Sql(), this.getSql(), null, "sql", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(doubleRangeValidatorEClass, DoubleRangeValidator.class, "DoubleRangeValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubleRangeValidator_Maximum(), theXMLTypePackage.getDouble(), "maximum", null, 0, 1, DoubleRangeValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubleRangeValidator_Minimum(), theXMLTypePackage.getDouble(), "minimum", null, 0, 1, DoubleRangeValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementMappingEClass, ElementMapping.class, "ElementMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementMapping_Column(), theXMLTypePackage.getString(), "column", null, 1, 1, ElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementMapping_Export(), theXMLTypePackage.getString(), "export", null, 0, 1, ElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementMapping_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementMapping_RequiredRoles(), theXMLTypePackage.getString(), "requiredRoles", null, 0, 1, ElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementMapping_XsdType(), theXMLTypePackage.getString(), "xsdType", null, 0, 1, ElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventSubscriptionListEClass, EventSubscriptionList.class, "EventSubscriptionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventSubscriptionList_Subscription(), ecorePackage.getEObject(), null, "subscription", null, 1, -1, EventSubscriptionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventTriggerEClass, EventTrigger.class, "EventTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventTrigger_Expression(), ecorePackage.getEObject(), null, "expression", null, 1, 1, EventTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventTrigger_TargetTopic(), ecorePackage.getEObject(), null, "targetTopic", null, 1, 1, EventTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventTrigger_Subscriptions(), this.getEventSubscriptionList(), null, "subscriptions", null, 1, 1, EventTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventTrigger_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, EventTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventTrigger_Language(), theXMLTypePackage.getString(), "language", null, 0, 1, EventTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(excelQueryEClass, ExcelQuery.class, "ExcelQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExcelQuery_Workbookname(), theXMLTypePackage.getString(), "workbookname", null, 1, 1, ExcelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelQuery_Hasheader(), theXMLTypePackage.getBoolean(), "hasheader", null, 1, 1, ExcelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelQuery_Startingrow(), theXMLTypePackage.getUnsignedLong(), "startingrow", null, 1, 1, ExcelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelQuery_Maxrowcount(), theXMLTypePackage.getUnsignedLong(), "maxrowcount", null, 1, 1, ExcelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gSpreadQueryEClass, GSpreadQuery.class, "GSpreadQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSpreadQuery_Worksheetnumber(), theXMLTypePackage.getUnsignedLong(), "worksheetnumber", null, 1, 1, GSpreadQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSpreadQuery_Startingrow(), theXMLTypePackage.getUnsignedLong(), "startingrow", null, 1, 1, GSpreadQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSpreadQuery_Maxrowcount(), theXMLTypePackage.getUnsignedLong(), "maxrowcount", null, 1, 1, GSpreadQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSpreadQuery_Hasheader(), theXMLTypePackage.getBoolean(), "hasheader", null, 1, 1, GSpreadQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lengthValidatorEClass, LengthValidator.class, "LengthValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLengthValidator_Maximum(), theXMLTypePackage.getUnsignedLong(), "maximum", null, 0, 1, LengthValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLengthValidator_Minimum(), theXMLTypePackage.getUnsignedLong(), "minimum", null, 0, 1, LengthValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(longRangeValidatorEClass, LongRangeValidator.class, "LongRangeValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLongRangeValidator_Maximum(), theXMLTypePackage.getLong(), "maximum", null, 0, 1, LongRangeValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongRangeValidator_Minimum(), theXMLTypePackage.getLong(), "minimum", null, 0, 1, LongRangeValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_CallQuery(), this.getCallQuery(), null, "callQuery", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_CallQueryGroup(), this.getCallQueryList(), null, "callQueryGroup", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_DisableStreaming(), theXMLTypePackage.getBoolean(), "disableStreaming", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterMappingEClass, ParameterMapping.class, "ParameterMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterMapping_Column(), theXMLTypePackage.getString(), "column", null, 0, 1, ParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterMapping_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterMapping_QueryParam(), theXMLTypePackage.getString(), "queryParam", null, 0, 1, ParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternValidatorEClass, PatternValidator.class, "PatternValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatternValidator_Pattern(), theXMLTypePackage.getString(), "pattern", null, 1, 1, PatternValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuery_Sql(), this.getSql(), null, "sql", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_Sparql(), ecorePackage.getEObject(), null, "sparql", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_Properties(), this.getQueryPropertyList(), null, "properties", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_Result(), this.getResultMapping(), null, "result", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_Excel(), this.getExcelQuery(), null, "excel", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_Gspread(), this.getGSpreadQuery(), null, "gspread", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_Param(), this.getQueryParameter(), null, "param", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_InputEventTrigger(), theXMLTypePackage.getString(), "inputEventTrigger", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_KeyColumns(), theXMLTypePackage.getString(), "keyColumns", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_OutputEventTrigger(), theXMLTypePackage.getString(), "outputEventTrigger", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_ReturnGeneratedKeys(), theXMLTypePackage.getBoolean(), "returnGeneratedKeys", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_UseConfig(), theXMLTypePackage.getString(), "useConfig", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryParameterEClass, QueryParameter.class, "QueryParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryParameter_ValidateLongRange(), this.getLongRangeValidator(), null, "validateLongRange", null, 0, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryParameter_ValidateDoubleRange(), this.getDoubleRangeValidator(), null, "validateDoubleRange", null, 0, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryParameter_ValidateLength(), this.getLengthValidator(), null, "validateLength", null, 0, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryParameter_ValidatePattern(), this.getPatternValidator(), null, "validatePattern", null, 0, -1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryParameter_ValidateCustom(), this.getCustomValidator(), null, "validateCustom", null, 0, -1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParameter_DefaultValue(), theXMLTypePackage.getString(), "defaultValue", null, 0, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParameter_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParameter_Ordinal(), theXMLTypePackage.getUnsignedInt(), "ordinal", null, 0, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParameter_ParamType(), theXMLTypePackage.getString(), "paramType", null, 0, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParameter_SqlType(), theXMLTypePackage.getString(), "sqlType", null, 1, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParameter_StructType(), theXMLTypePackage.getString(), "structType", null, 0, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParameter_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryPropertyEClass, QueryProperty.class, "QueryProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryProperty_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, QueryProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryProperty_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, QueryProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryPropertyListEClass, QueryPropertyList.class, "QueryPropertyList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryPropertyList_Property(), this.getQueryProperty(), null, "property", null, 0, 5, QueryPropertyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_CallQuery(), this.getCallQuery(), null, "callQuery", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Method(), theXMLTypePackage.getString(), "method", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Path(), theXMLTypePackage.getString(), "path", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_ReturnRequestStatus(), theXMLTypePackage.getBoolean(), "returnRequestStatus", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultMappingEClass, ResultMapping.class, "ResultMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultMapping_ElementMappings(), this.getElementMapping(), null, "elementMappings", null, 0, -1, ResultMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultMapping_Attribute(), this.getAttributeMapping(), null, "attribute", null, 0, -1, ResultMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultMapping_CallQuery(), this.getCallQuery(), null, "callQuery", null, 0, -1, ResultMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultMapping_DefaultNamespace(), theXMLTypePackage.getString(), "defaultNamespace", null, 0, 1, ResultMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultMapping_ElementName(), theXMLTypePackage.getString(), "elementName", null, 1, 1, ResultMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultMapping_RowName(), theXMLTypePackage.getString(), "rowName", null, 1, 1, ResultMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultMapping_UseColumnNumbers(), theXMLTypePackage.getString(), "useColumnNumbers", null, 0, 1, ResultMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultMapping_XsltPath(), theXMLTypePackage.getString(), "xsltPath", null, 0, 1, ResultMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqlEClass, Sql.class, "Sql", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSql_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Sql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSql_Dialect(), theXMLTypePackage.getString(), "dialect", null, 0, 1, Sql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(serviceStatusEEnum, ServiceStatus.class, "ServiceStatus");
		addEEnumLiteral(serviceStatusEEnum, ServiceStatus.ACTIVE);
		addEEnumLiteral(serviceStatusEEnum, ServiceStatus.INACTIVE);

		// Initialize data types
		initEDataType(serviceStatusObjectEDataType, ServiceStatus.class, "ServiceStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });		
		addAnnotation
		  (attributeMappingEClass, 
		   source, 
		   new String[] {
			 "name", "attribute_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getAttributeMapping_Column(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "column",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributeMapping_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributeMapping_RequiredRoles(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "requiredRoles",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributeMapping_XsdType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsdType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (callQueryEClass, 
		   source, 
		   new String[] {
			 "name", "call-query_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCallQuery_WithParam(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "with-param",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCallQuery_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (callQueryListEClass, 
		   source, 
		   new String[] {
			 "name", "call-query-group_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCallQueryList_CallQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "call-query",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (configurationPropertyEClass, 
		   source, 
		   new String[] {
			 "name", "property_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getConfigurationProperty_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getConfigurationProperty_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (customValidatorEClass, 
		   source, 
		   new String[] {
			 "name", "validateCustom_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getCustomValidator_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (dataServiceEClass, 
		   source, 
		   new String[] {
			 "name", "data_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDataService_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataService_Config(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "config",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataService_Query(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "query",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataService_EventTrigger(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "event-trigger",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataService_Operation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "operation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataService_Resource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "resource",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataService_BaseURI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "baseURI",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataService_EnableBatchRequests(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "enableBatchRequests",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataService_EnableBoxcarring(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "enableBoxcarring",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataService_EnableDTP(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "enableDTP",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataService_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataService_ServiceGroup(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "serviceGroup",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataService_ServiceStatus(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "serviceStatus",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (dataSourceConfigurationEClass, 
		   source, 
		   new String[] {
			 "name", "config_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDataSourceConfiguration_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataSourceConfiguration_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_CallQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "call-query",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Data(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "data",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Sql(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sql",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (doubleRangeValidatorEClass, 
		   source, 
		   new String[] {
			 "name", "validateDoubleRange_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getDoubleRangeValidator_Maximum(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "maximum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDoubleRangeValidator_Minimum(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "minimum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (elementMappingEClass, 
		   source, 
		   new String[] {
			 "name", "element_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getElementMapping_Column(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "column",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getElementMapping_Export(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "export",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getElementMapping_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getElementMapping_RequiredRoles(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "requiredRoles",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getElementMapping_XsdType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsdType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (eventSubscriptionListEClass, 
		   source, 
		   new String[] {
			 "name", "subscriptions_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEventSubscriptionList_Subscription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "subscription",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (eventTriggerEClass, 
		   source, 
		   new String[] {
			 "name", "event-trigger_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEventTrigger_Expression(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "expression",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEventTrigger_TargetTopic(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "target-topic",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEventTrigger_Subscriptions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "subscriptions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEventTrigger_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEventTrigger_Language(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "language",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (excelQueryEClass, 
		   source, 
		   new String[] {
			 "name", "excel_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getExcelQuery_Workbookname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "workbookname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getExcelQuery_Hasheader(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hasheader",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getExcelQuery_Startingrow(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "startingrow",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getExcelQuery_Maxrowcount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "maxrowcount",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (gSpreadQueryEClass, 
		   source, 
		   new String[] {
			 "name", "gspread_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getGSpreadQuery_Worksheetnumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "worksheetnumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGSpreadQuery_Startingrow(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "startingrow",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGSpreadQuery_Maxrowcount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "maxrowcount",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGSpreadQuery_Hasheader(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hasheader",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (lengthValidatorEClass, 
		   source, 
		   new String[] {
			 "name", "validateLength_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getLengthValidator_Maximum(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "maximum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLengthValidator_Minimum(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "minimum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (longRangeValidatorEClass, 
		   source, 
		   new String[] {
			 "name", "validateLongRange_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getLongRangeValidator_Maximum(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "maximum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLongRangeValidator_Minimum(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "minimum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (operationEClass, 
		   source, 
		   new String[] {
			 "name", "operation_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOperation_CallQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "call-query",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOperation_CallQueryGroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "call-query-group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOperation_DisableStreaming(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "disableStreaming",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOperation_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (parameterMappingEClass, 
		   source, 
		   new String[] {
			 "name", "with-param_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getParameterMapping_Column(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "column",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getParameterMapping_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getParameterMapping_QueryParam(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "query-param",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (patternValidatorEClass, 
		   source, 
		   new String[] {
			 "name", "validatePattern_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPatternValidator_Pattern(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pattern",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (queryEClass, 
		   source, 
		   new String[] {
			 "name", "query_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getQuery_Sql(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sql",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQuery_Sparql(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sparql",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQuery_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQuery_Result(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "result",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQuery_Excel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "excel",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQuery_Gspread(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "gspread",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQuery_Param(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "param",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQuery_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQuery_InputEventTrigger(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "input-event-trigger",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQuery_KeyColumns(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "keyColumns",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQuery_OutputEventTrigger(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "output-event-trigger",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQuery_ReturnGeneratedKeys(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "returnGeneratedKeys",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQuery_UseConfig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "useConfig",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (queryParameterEClass, 
		   source, 
		   new String[] {
			 "name", "param_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getQueryParameter_ValidateLongRange(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "validateLongRange",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQueryParameter_ValidateDoubleRange(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "validateDoubleRange",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQueryParameter_ValidateLength(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "validateLength",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQueryParameter_ValidatePattern(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "validatePattern",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQueryParameter_ValidateCustom(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "validateCustom",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQueryParameter_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "defaultValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQueryParameter_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQueryParameter_Ordinal(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ordinal",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQueryParameter_ParamType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "paramType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQueryParameter_SqlType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sqlType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQueryParameter_StructType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "structType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQueryParameter_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (queryPropertyEClass, 
		   source, 
		   new String[] {
			 "name", "property_._1_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getQueryProperty_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getQueryProperty_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (queryPropertyListEClass, 
		   source, 
		   new String[] {
			 "name", "properties_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getQueryPropertyList_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (resourceEClass, 
		   source, 
		   new String[] {
			 "name", "resource_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getResource_CallQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "call-query",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResource_Method(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "method",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResource_Path(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResource_ReturnRequestStatus(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "returnRequestStatus",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (resultMappingEClass, 
		   source, 
		   new String[] {
			 "name", "result_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getResultMapping_ElementMappings(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResultMapping_Attribute(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "attribute",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResultMapping_CallQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "call-query",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResultMapping_DefaultNamespace(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "defaultNamespace",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResultMapping_ElementName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResultMapping_RowName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rowName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResultMapping_UseColumnNumbers(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "useColumnNumbers",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResultMapping_XsltPath(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsltPath",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (serviceStatusEEnum, 
		   source, 
		   new String[] {
			 "name", "serviceStatus_._type"
		   });		
		addAnnotation
		  (serviceStatusObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "serviceStatus_._type:Object",
			 "baseType", "serviceStatus_._type"
		   });		
		addAnnotation
		  (sqlEClass, 
		   source, 
		   new String[] {
			 "name", "sql_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getSql_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getSql_Dialect(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dialect",
			 "namespace", "##targetNamespace"
		   });
	}

} //DsPackageImpl
