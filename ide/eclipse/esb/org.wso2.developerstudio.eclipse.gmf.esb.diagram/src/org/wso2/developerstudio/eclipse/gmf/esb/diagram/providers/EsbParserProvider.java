package org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.AddressEndPointEndPointName2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.AddressEndPointEndPointNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.AggregateMediatorAggregateIDEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.BAMMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.BeanMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.BuilderMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CacheMediatorCacheIdEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CallTemplateMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CalloutMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CalloutMediatorSoapActionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ClassMediatorClassNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ClassMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CloneMediatorCloneIDEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CloudConnectorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CloudConnectorOperationDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CommandMediatorClassNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.CommandMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DBLookupMediatorConnectionURLEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DBLookupMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DBReportMediatorConnectionURLEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DBReportMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DefaultEndPointEndPointName2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DefaultEndPointEndPointNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.DropMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EJBMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EnqueueMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EnrichMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EnrichMediatorSourceTypeEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EntitlementMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EntitlementMediatorServerURLEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EventMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.EventMediatorTopicTypeEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FailoverEndPointEndPointName2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FailoverEndPointEndPointNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FaultMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FaultMediatorFaultStringTypeEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorConditionTypeEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.HeaderMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.HeaderMediatorValueLiteralEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.IterateMediatorIterateIDEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.LoadBalanceEndPointEndPointName2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.LoadBalanceEndPointEndPointNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.LogMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.LogMediatorLogCategoryEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.NamedEndpointNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.OAuthMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.OAuthMediatorRemoteServiceUrlEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.PayloadFactoryMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.PropertyMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.PropertyMediatorPropertyNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyServiceNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.RMSequenceMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ScriptMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ScriptMediatorScriptLanguageEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SendMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SmooksMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SpringMediatorBeanNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SpringMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.StoreMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.ThrottleMediatorGroupIdEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.TransactionMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.URLRewriteMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.WSDLEndPointEndPointName2EditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.WSDLEndPointEndPointNameEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.XQueryMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.XQueryMediatorScriptKeyTypeEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.XSLTMediatorDescriptionEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.parsers.MessageFormatParser;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry;

/**
 * @generated
 */
public class EsbParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser proxyServiceName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getProxyServiceName_5003Parser() {
		if (proxyServiceName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE.getProxyService_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			proxyServiceName_5003Parser = parser;
		}
		return proxyServiceName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser dropMediatorDescription_5166Parser;

	/**
	 * @generated
	 */
	private IParser getDropMediatorDescription_5166Parser() {
		if (dropMediatorDescription_5166Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dropMediatorDescription_5166Parser = parser;
		}
		return dropMediatorDescription_5166Parser;
	}

	/**
	 * @generated
	 */
	private IParser propertyMediatorPropertyName_5127Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyMediatorPropertyName_5127Parser() {
		if (propertyMediatorPropertyName_5127Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getPropertyMediator_PropertyName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			propertyMediatorPropertyName_5127Parser = parser;
		}
		return propertyMediatorPropertyName_5127Parser;
	}

	/**
	 * @generated
	 */
	private IParser propertyMediatorDescription_5167Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyMediatorDescription_5167Parser() {
		if (propertyMediatorDescription_5167Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			propertyMediatorDescription_5167Parser = parser;
		}
		return propertyMediatorDescription_5167Parser;
	}

	/**
	 * @generated
	 */
	private IParser throttleMediatorGroupId_5128Parser;

	/**
	 * @generated
	 */
	private IParser getThrottleMediatorGroupId_5128Parser() {
		if (throttleMediatorGroupId_5128Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getThrottleMediator_GroupId() };
			MessageFormatParser parser = new MessageFormatParser(features);
			throttleMediatorGroupId_5128Parser = parser;
		}
		return throttleMediatorGroupId_5128Parser;
	}

	/**
	 * @generated
	 */
	private IParser filterMediatorConditionType_5129Parser;

	/**
	 * @generated
	 */
	private IParser getFilterMediatorConditionType_5129Parser() {
		if (filterMediatorConditionType_5129Parser == null) {
			EAttribute editableFeature = EsbPackage.eINSTANCE.getFilterMediator_ConditionType();
			EnumParser parser = new EnumParser(editableFeature);
			filterMediatorConditionType_5129Parser = parser;
		}
		return filterMediatorConditionType_5129Parser;
	}

	/**
	 * @generated
	 */
	private IParser logMediatorLogCategory_5130Parser;

	/**
	 * @generated
	 */
	private IParser getLogMediatorLogCategory_5130Parser() {
		if (logMediatorLogCategory_5130Parser == null) {
			EAttribute editableFeature = EsbPackage.eINSTANCE.getLogMediator_LogCategory();
			EnumParser parser = new EnumParser(editableFeature);
			logMediatorLogCategory_5130Parser = parser;
		}
		return logMediatorLogCategory_5130Parser;
	}

	/**
	 * @generated
	 */
	private IParser logMediatorDescription_5168Parser;

	/**
	 * @generated
	 */
	private IParser getLogMediatorDescription_5168Parser() {
		if (logMediatorDescription_5168Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			logMediatorDescription_5168Parser = parser;
		}
		return logMediatorDescription_5168Parser;
	}

	/**
	 * @generated
	 */
	private IParser enrichMediatorSourceType_5131Parser;

	/**
	 * @generated
	 */
	private IParser getEnrichMediatorSourceType_5131Parser() {
		if (enrichMediatorSourceType_5131Parser == null) {
			EAttribute editableFeature = EsbPackage.eINSTANCE.getEnrichMediator_SourceType();
			EnumParser parser = new EnumParser(editableFeature);
			enrichMediatorSourceType_5131Parser = parser;
		}
		return enrichMediatorSourceType_5131Parser;
	}

	/**
	 * @generated
	 */
	private IParser enrichMediatorDescription_5169Parser;

	/**
	 * @generated
	 */
	private IParser getEnrichMediatorDescription_5169Parser() {
		if (enrichMediatorDescription_5169Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enrichMediatorDescription_5169Parser = parser;
		}
		return enrichMediatorDescription_5169Parser;
	}

	/**
	 * @generated
	 */
	private IParser xSLTMediatorDescription_5170Parser;

	/**
	 * @generated
	 */
	private IParser getXSLTMediatorDescription_5170Parser() {
		if (xSLTMediatorDescription_5170Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			xSLTMediatorDescription_5170Parser = parser;
		}
		return xSLTMediatorDescription_5170Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequenceName_5132Parser;

	/**
	 * @generated
	 */
	private IParser getSequenceName_5132Parser() {
		if (sequenceName_5132Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE.getSequence_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sequenceName_5132Parser = parser;
		}
		return sequenceName_5132Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventMediatorTopicType_5133Parser;

	/**
	 * @generated
	 */
	private IParser getEventMediatorTopicType_5133Parser() {
		if (eventMediatorTopicType_5133Parser == null) {
			EAttribute editableFeature = EsbPackage.eINSTANCE.getEventMediator_TopicType();
			EnumParser parser = new EnumParser(editableFeature);
			eventMediatorTopicType_5133Parser = parser;
		}
		return eventMediatorTopicType_5133Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventMediatorDescription_5171Parser;

	/**
	 * @generated
	 */
	private IParser getEventMediatorDescription_5171Parser() {
		if (eventMediatorDescription_5171Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventMediatorDescription_5171Parser = parser;
		}
		return eventMediatorDescription_5171Parser;
	}

	/**
	 * @generated
	 */
	private IParser entitlementMediatorServerURL_5134Parser;

	/**
	 * @generated
	 */
	private IParser getEntitlementMediatorServerURL_5134Parser() {
		if (entitlementMediatorServerURL_5134Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEntitlementMediator_ServerURL() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entitlementMediatorServerURL_5134Parser = parser;
		}
		return entitlementMediatorServerURL_5134Parser;
	}

	/**
	 * @generated
	 */
	private IParser entitlementMediatorDescription_5172Parser;

	/**
	 * @generated
	 */
	private IParser getEntitlementMediatorDescription_5172Parser() {
		if (entitlementMediatorDescription_5172Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entitlementMediatorDescription_5172Parser = parser;
		}
		return entitlementMediatorDescription_5172Parser;
	}

	/**
	 * @generated
	 */
	private IParser classMediatorClassName_5135Parser;

	/**
	 * @generated
	 */
	private IParser getClassMediatorClassName_5135Parser() {
		if (classMediatorClassName_5135Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getClassMediator_ClassName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			classMediatorClassName_5135Parser = parser;
		}
		return classMediatorClassName_5135Parser;
	}

	/**
	 * @generated
	 */
	private IParser classMediatorDescription_5173Parser;

	/**
	 * @generated
	 */
	private IParser getClassMediatorDescription_5173Parser() {
		if (classMediatorDescription_5173Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			classMediatorDescription_5173Parser = parser;
		}
		return classMediatorDescription_5173Parser;
	}

	/**
	 * @generated
	 */
	private IParser springMediatorBeanName_5136Parser;

	/**
	 * @generated
	 */
	private IParser getSpringMediatorBeanName_5136Parser() {
		if (springMediatorBeanName_5136Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getSpringMediator_BeanName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			springMediatorBeanName_5136Parser = parser;
		}
		return springMediatorBeanName_5136Parser;
	}

	/**
	 * @generated
	 */
	private IParser springMediatorDescription_5174Parser;

	/**
	 * @generated
	 */
	private IParser getSpringMediatorDescription_5174Parser() {
		if (springMediatorDescription_5174Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			springMediatorDescription_5174Parser = parser;
		}
		return springMediatorDescription_5174Parser;
	}

	/**
	 * @generated
	 */
	private IParser scriptMediatorScriptLanguage_5137Parser;

	/**
	 * @generated
	 */
	private IParser getScriptMediatorScriptLanguage_5137Parser() {
		if (scriptMediatorScriptLanguage_5137Parser == null) {
			EAttribute editableFeature = EsbPackage.eINSTANCE.getScriptMediator_ScriptLanguage();
			EnumParser parser = new EnumParser(editableFeature);
			scriptMediatorScriptLanguage_5137Parser = parser;
		}
		return scriptMediatorScriptLanguage_5137Parser;
	}

	/**
	 * @generated
	 */
	private IParser scriptMediatorDescription_5175Parser;

	/**
	 * @generated
	 */
	private IParser getScriptMediatorDescription_5175Parser() {
		if (scriptMediatorDescription_5175Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			scriptMediatorDescription_5175Parser = parser;
		}
		return scriptMediatorDescription_5175Parser;
	}

	/**
	 * @generated
	 */
	private IParser faultMediatorFaultStringType_5138Parser;

	/**
	 * @generated
	 */
	private IParser getFaultMediatorFaultStringType_5138Parser() {
		if (faultMediatorFaultStringType_5138Parser == null) {
			EAttribute editableFeature = EsbPackage.eINSTANCE.getFaultMediator_FaultStringType();
			EnumParser parser = new EnumParser(editableFeature);
			faultMediatorFaultStringType_5138Parser = parser;
		}
		return faultMediatorFaultStringType_5138Parser;
	}

	/**
	 * @generated
	 */
	private IParser faultMediatorDescription_5176Parser;

	/**
	 * @generated
	 */
	private IParser getFaultMediatorDescription_5176Parser() {
		if (faultMediatorDescription_5176Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			faultMediatorDescription_5176Parser = parser;
		}
		return faultMediatorDescription_5176Parser;
	}

	/**
	 * @generated
	 */
	private IParser xQueryMediatorScriptKeyType_5139Parser;

	/**
	 * @generated
	 */
	private IParser getXQueryMediatorScriptKeyType_5139Parser() {
		if (xQueryMediatorScriptKeyType_5139Parser == null) {
			EAttribute editableFeature = EsbPackage.eINSTANCE.getXQueryMediator_ScriptKeyType();
			EnumParser parser = new EnumParser(editableFeature);
			xQueryMediatorScriptKeyType_5139Parser = parser;
		}
		return xQueryMediatorScriptKeyType_5139Parser;
	}

	/**
	 * @generated
	 */
	private IParser xQueryMediatorDescription_5177Parser;

	/**
	 * @generated
	 */
	private IParser getXQueryMediatorDescription_5177Parser() {
		if (xQueryMediatorDescription_5177Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			xQueryMediatorDescription_5177Parser = parser;
		}
		return xQueryMediatorDescription_5177Parser;
	}

	/**
	 * @generated
	 */
	private IParser commandMediatorClassName_5140Parser;

	/**
	 * @generated
	 */
	private IParser getCommandMediatorClassName_5140Parser() {
		if (commandMediatorClassName_5140Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCommandMediator_ClassName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			commandMediatorClassName_5140Parser = parser;
		}
		return commandMediatorClassName_5140Parser;
	}

	/**
	 * @generated
	 */
	private IParser commandMediatorDescription_5178Parser;

	/**
	 * @generated
	 */
	private IParser getCommandMediatorDescription_5178Parser() {
		if (commandMediatorDescription_5178Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			commandMediatorDescription_5178Parser = parser;
		}
		return commandMediatorDescription_5178Parser;
	}

	/**
	 * @generated
	 */
	private IParser dBLookupMediatorConnectionURL_5141Parser;

	/**
	 * @generated
	 */
	private IParser getDBLookupMediatorConnectionURL_5141Parser() {
		if (dBLookupMediatorConnectionURL_5141Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getAbstractSqlExecutorMediator_ConnectionURL() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dBLookupMediatorConnectionURL_5141Parser = parser;
		}
		return dBLookupMediatorConnectionURL_5141Parser;
	}

	/**
	 * @generated
	 */
	private IParser dBLookupMediatorDescription_5179Parser;

	/**
	 * @generated
	 */
	private IParser getDBLookupMediatorDescription_5179Parser() {
		if (dBLookupMediatorDescription_5179Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dBLookupMediatorDescription_5179Parser = parser;
		}
		return dBLookupMediatorDescription_5179Parser;
	}

	/**
	 * @generated
	 */
	private IParser dBReportMediatorConnectionURL_5142Parser;

	/**
	 * @generated
	 */
	private IParser getDBReportMediatorConnectionURL_5142Parser() {
		if (dBReportMediatorConnectionURL_5142Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getAbstractSqlExecutorMediator_ConnectionURL() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dBReportMediatorConnectionURL_5142Parser = parser;
		}
		return dBReportMediatorConnectionURL_5142Parser;
	}

	/**
	 * @generated
	 */
	private IParser dBReportMediatorDescription_5180Parser;

	/**
	 * @generated
	 */
	private IParser getDBReportMediatorDescription_5180Parser() {
		if (dBReportMediatorDescription_5180Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dBReportMediatorDescription_5180Parser = parser;
		}
		return dBReportMediatorDescription_5180Parser;
	}

	/**
	 * @generated
	 */
	private IParser smooksMediatorDescription_5181Parser;

	/**
	 * @generated
	 */
	private IParser getSmooksMediatorDescription_5181Parser() {
		if (smooksMediatorDescription_5181Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			smooksMediatorDescription_5181Parser = parser;
		}
		return smooksMediatorDescription_5181Parser;
	}

	/**
	 * @generated
	 */
	private IParser headerMediatorValueLiteral_5143Parser;

	/**
	 * @generated
	 */
	private IParser getHeaderMediatorValueLiteral_5143Parser() {
		if (headerMediatorValueLiteral_5143Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getHeaderMediator_ValueLiteral() };
			MessageFormatParser parser = new MessageFormatParser(features);
			headerMediatorValueLiteral_5143Parser = parser;
		}
		return headerMediatorValueLiteral_5143Parser;
	}

	/**
	 * @generated
	 */
	private IParser headerMediatorDescription_5183Parser;

	/**
	 * @generated
	 */
	private IParser getHeaderMediatorDescription_5183Parser() {
		if (headerMediatorDescription_5183Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			headerMediatorDescription_5183Parser = parser;
		}
		return headerMediatorDescription_5183Parser;
	}

	/**
	 * @generated
	 */
	private IParser cloneMediatorCloneID_5144Parser;

	/**
	 * @generated
	 */
	private IParser getCloneMediatorCloneID_5144Parser() {
		if (cloneMediatorCloneID_5144Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCloneMediator_CloneID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cloneMediatorCloneID_5144Parser = parser;
		}
		return cloneMediatorCloneID_5144Parser;
	}

	/**
	 * @generated
	 */
	private IParser cacheMediatorCacheId_5145Parser;

	/**
	 * @generated
	 */
	private IParser getCacheMediatorCacheId_5145Parser() {
		if (cacheMediatorCacheId_5145Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCacheMediator_CacheId() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cacheMediatorCacheId_5145Parser = parser;
		}
		return cacheMediatorCacheId_5145Parser;
	}

	/**
	 * @generated
	 */
	private IParser iterateMediatorIterateID_5146Parser;

	/**
	 * @generated
	 */
	private IParser getIterateMediatorIterateID_5146Parser() {
		if (iterateMediatorIterateID_5146Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getIterateMediator_IterateID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			iterateMediatorIterateID_5146Parser = parser;
		}
		return iterateMediatorIterateID_5146Parser;
	}

	/**
	 * @generated
	 */
	private IParser calloutMediatorSoapAction_5147Parser;

	/**
	 * @generated
	 */
	private IParser getCalloutMediatorSoapAction_5147Parser() {
		if (calloutMediatorSoapAction_5147Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getCalloutMediator_SoapAction() };
			MessageFormatParser parser = new MessageFormatParser(features);
			calloutMediatorSoapAction_5147Parser = parser;
		}
		return calloutMediatorSoapAction_5147Parser;
	}

	/**
	 * @generated
	 */
	private IParser calloutMediatorDescription_5184Parser;

	/**
	 * @generated
	 */
	private IParser getCalloutMediatorDescription_5184Parser() {
		if (calloutMediatorDescription_5184Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			calloutMediatorDescription_5184Parser = parser;
		}
		return calloutMediatorDescription_5184Parser;
	}

	/**
	 * @generated
	 */
	private IParser transactionMediatorDescription_5185Parser;

	/**
	 * @generated
	 */
	private IParser getTransactionMediatorDescription_5185Parser() {
		if (transactionMediatorDescription_5185Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			transactionMediatorDescription_5185Parser = parser;
		}
		return transactionMediatorDescription_5185Parser;
	}

	/**
	 * @generated
	 */
	private IParser rMSequenceMediatorDescription_5186Parser;

	/**
	 * @generated
	 */
	private IParser getRMSequenceMediatorDescription_5186Parser() {
		if (rMSequenceMediatorDescription_5186Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			rMSequenceMediatorDescription_5186Parser = parser;
		}
		return rMSequenceMediatorDescription_5186Parser;
	}

	/**
	 * @generated
	 */
	private IParser oAuthMediatorRemoteServiceUrl_5148Parser;

	/**
	 * @generated
	 */
	private IParser getOAuthMediatorRemoteServiceUrl_5148Parser() {
		if (oAuthMediatorRemoteServiceUrl_5148Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getOAuthMediator_RemoteServiceUrl() };
			MessageFormatParser parser = new MessageFormatParser(features);
			oAuthMediatorRemoteServiceUrl_5148Parser = parser;
		}
		return oAuthMediatorRemoteServiceUrl_5148Parser;
	}

	/**
	 * @generated
	 */
	private IParser oAuthMediatorDescription_5187Parser;

	/**
	 * @generated
	 */
	private IParser getOAuthMediatorDescription_5187Parser() {
		if (oAuthMediatorDescription_5187Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			oAuthMediatorDescription_5187Parser = parser;
		}
		return oAuthMediatorDescription_5187Parser;
	}

	/**
	 * @generated
	 */
	private IParser aggregateMediatorAggregateID_5149Parser;

	/**
	 * @generated
	 */
	private IParser getAggregateMediatorAggregateID_5149Parser() {
		if (aggregateMediatorAggregateID_5149Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getAggregateMediator_AggregateID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			aggregateMediatorAggregateID_5149Parser = parser;
		}
		return aggregateMediatorAggregateID_5149Parser;
	}

	/**
	 * @generated
	 */
	private IParser storeMediatorDescription_5188Parser;

	/**
	 * @generated
	 */
	private IParser getStoreMediatorDescription_5188Parser() {
		if (storeMediatorDescription_5188Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			storeMediatorDescription_5188Parser = parser;
		}
		return storeMediatorDescription_5188Parser;
	}

	/**
	 * @generated
	 */
	private IParser builderMediatorDescription_5189Parser;

	/**
	 * @generated
	 */
	private IParser getBuilderMediatorDescription_5189Parser() {
		if (builderMediatorDescription_5189Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			builderMediatorDescription_5189Parser = parser;
		}
		return builderMediatorDescription_5189Parser;
	}

	/**
	 * @generated
	 */
	private IParser callTemplateMediatorDescription_5190Parser;

	/**
	 * @generated
	 */
	private IParser getCallTemplateMediatorDescription_5190Parser() {
		if (callTemplateMediatorDescription_5190Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callTemplateMediatorDescription_5190Parser = parser;
		}
		return callTemplateMediatorDescription_5190Parser;
	}

	/**
	 * @generated
	 */
	private IParser payloadFactoryMediatorDescription_5191Parser;

	/**
	 * @generated
	 */
	private IParser getPayloadFactoryMediatorDescription_5191Parser() {
		if (payloadFactoryMediatorDescription_5191Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			payloadFactoryMediatorDescription_5191Parser = parser;
		}
		return payloadFactoryMediatorDescription_5191Parser;
	}

	/**
	 * @generated
	 */
	private IParser enqueueMediatorDescription_5192Parser;

	/**
	 * @generated
	 */
	private IParser getEnqueueMediatorDescription_5192Parser() {
		if (enqueueMediatorDescription_5192Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enqueueMediatorDescription_5192Parser = parser;
		}
		return enqueueMediatorDescription_5192Parser;
	}

	/**
	 * @generated
	 */
	private IParser uRLRewriteMediatorDescription_5193Parser;

	/**
	 * @generated
	 */
	private IParser getURLRewriteMediatorDescription_5193Parser() {
		if (uRLRewriteMediatorDescription_5193Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			uRLRewriteMediatorDescription_5193Parser = parser;
		}
		return uRLRewriteMediatorDescription_5193Parser;
	}

	/**
	 * @generated
	 */
	private IParser bAMMediatorDescription_5194Parser;

	/**
	 * @generated
	 */
	private IParser getBAMMediatorDescription_5194Parser() {
		if (bAMMediatorDescription_5194Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			bAMMediatorDescription_5194Parser = parser;
		}
		return bAMMediatorDescription_5194Parser;
	}

	/**
	 * @generated
	 */
	private IParser beanMediatorDescription_5195Parser;

	/**
	 * @generated
	 */
	private IParser getBeanMediatorDescription_5195Parser() {
		if (beanMediatorDescription_5195Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			beanMediatorDescription_5195Parser = parser;
		}
		return beanMediatorDescription_5195Parser;
	}

	/**
	 * @generated
	 */
	private IParser eJBMediatorDescription_5196Parser;

	/**
	 * @generated
	 */
	private IParser getEJBMediatorDescription_5196Parser() {
		if (eJBMediatorDescription_5196Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eJBMediatorDescription_5196Parser = parser;
		}
		return eJBMediatorDescription_5196Parser;
	}

	/**
	 * @generated
	 */
	private IParser defaultEndPointEndPointName_5155Parser;

	/**
	 * @generated
	 */
	private IParser getDefaultEndPointEndPointName_5155Parser() {
		if (defaultEndPointEndPointName_5155Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			defaultEndPointEndPointName_5155Parser = parser;
		}
		return defaultEndPointEndPointName_5155Parser;
	}

	/**
	 * @generated
	 */
	private IParser addressEndPointEndPointName_5156Parser;

	/**
	 * @generated
	 */
	private IParser getAddressEndPointEndPointName_5156Parser() {
		if (addressEndPointEndPointName_5156Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			addressEndPointEndPointName_5156Parser = parser;
		}
		return addressEndPointEndPointName_5156Parser;
	}

	/**
	 * @generated
	 */
	private IParser failoverEndPointEndPointName_5157Parser;

	/**
	 * @generated
	 */
	private IParser getFailoverEndPointEndPointName_5157Parser() {
		if (failoverEndPointEndPointName_5157Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			failoverEndPointEndPointName_5157Parser = parser;
		}
		return failoverEndPointEndPointName_5157Parser;
	}

	/**
	 * @generated
	 */
	private IParser wSDLEndPointEndPointName_5158Parser;

	/**
	 * @generated
	 */
	private IParser getWSDLEndPointEndPointName_5158Parser() {
		if (wSDLEndPointEndPointName_5158Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			wSDLEndPointEndPointName_5158Parser = parser;
		}
		return wSDLEndPointEndPointName_5158Parser;
	}

	/**
	 * @generated
	 */
	private IParser namedEndpointName_5165Parser;

	/**
	 * @generated
	 */
	private IParser getNamedEndpointName_5165Parser() {
		if (namedEndpointName_5165Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE.getNamedEndpoint_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { EsbPackage.eINSTANCE
					.getNamedEndpoint_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			namedEndpointName_5165Parser = parser;
		}
		return namedEndpointName_5165Parser;
	}

	/**
	 * @generated
	 */
	private IParser loadBalanceEndPointEndPointName_5159Parser;

	/**
	 * @generated
	 */
	private IParser getLoadBalanceEndPointEndPointName_5159Parser() {
		if (loadBalanceEndPointEndPointName_5159Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			loadBalanceEndPointEndPointName_5159Parser = parser;
		}
		return loadBalanceEndPointEndPointName_5159Parser;
	}

	/**
	 * @generated
	 */
	private IParser cloudConnectorDescription_5197Parser;

	/**
	 * @generated
	 */
	private IParser getCloudConnectorDescription_5197Parser() {
		if (cloudConnectorDescription_5197Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cloudConnectorDescription_5197Parser = parser;
		}
		return cloudConnectorDescription_5197Parser;
	}

	/**
	 * @generated
	 */
	private IParser cloudConnectorOperationDescription_5198Parser;

	/**
	 * @generated
	 */
	private IParser getCloudConnectorOperationDescription_5198Parser() {
		if (cloudConnectorOperationDescription_5198Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEsbElement_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cloudConnectorOperationDescription_5198Parser = parser;
		}
		return cloudConnectorOperationDescription_5198Parser;
	}

	/**
	 * @generated
	 */
	private IParser defaultEndPointEndPointName_5160Parser;

	/**
	 * @generated
	 */
	private IParser getDefaultEndPointEndPointName_5160Parser() {
		if (defaultEndPointEndPointName_5160Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			defaultEndPointEndPointName_5160Parser = parser;
		}
		return defaultEndPointEndPointName_5160Parser;
	}

	/**
	 * @generated
	 */
	private IParser addressEndPointEndPointName_5161Parser;

	/**
	 * @generated
	 */
	private IParser getAddressEndPointEndPointName_5161Parser() {
		if (addressEndPointEndPointName_5161Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			addressEndPointEndPointName_5161Parser = parser;
		}
		return addressEndPointEndPointName_5161Parser;
	}

	/**
	 * @generated
	 */
	private IParser failoverEndPointEndPointName_5162Parser;

	/**
	 * @generated
	 */
	private IParser getFailoverEndPointEndPointName_5162Parser() {
		if (failoverEndPointEndPointName_5162Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			failoverEndPointEndPointName_5162Parser = parser;
		}
		return failoverEndPointEndPointName_5162Parser;
	}

	/**
	 * @generated
	 */
	private IParser wSDLEndPointEndPointName_5163Parser;

	/**
	 * @generated
	 */
	private IParser getWSDLEndPointEndPointName_5163Parser() {
		if (wSDLEndPointEndPointName_5163Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			wSDLEndPointEndPointName_5163Parser = parser;
		}
		return wSDLEndPointEndPointName_5163Parser;
	}

	/**
	 * @generated
	 */
	private IParser loadBalanceEndPointEndPointName_5164Parser;

	/**
	 * @generated
	 */
	private IParser getLoadBalanceEndPointEndPointName_5164Parser() {
		if (loadBalanceEndPointEndPointName_5164Parser == null) {
			EAttribute[] features = new EAttribute[] { EsbPackage.eINSTANCE
					.getEndPoint_EndPointName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			loadBalanceEndPointEndPointName_5164Parser = parser;
		}
		return loadBalanceEndPointEndPointName_5164Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ProxyServiceNameEditPart.VISUAL_ID:
			return getProxyServiceName_5003Parser();
		case DropMediatorDescriptionEditPart.VISUAL_ID:
			return getDropMediatorDescription_5166Parser();
		case PropertyMediatorPropertyNameEditPart.VISUAL_ID:
			return getPropertyMediatorPropertyName_5127Parser();
		case PropertyMediatorDescriptionEditPart.VISUAL_ID:
			return getPropertyMediatorDescription_5167Parser();
		case ThrottleMediatorGroupIdEditPart.VISUAL_ID:
			return getThrottleMediatorGroupId_5128Parser();

		case FilterMediatorConditionTypeEditPart.VISUAL_ID:
			return getFilterMediatorConditionType_5129Parser();

		case LogMediatorLogCategoryEditPart.VISUAL_ID:
			return getLogMediatorLogCategory_5130Parser();
		case LogMediatorDescriptionEditPart.VISUAL_ID:
			return getLogMediatorDescription_5168Parser();

		case EnrichMediatorSourceTypeEditPart.VISUAL_ID:
			return getEnrichMediatorSourceType_5131Parser();
		case EnrichMediatorDescriptionEditPart.VISUAL_ID:
			return getEnrichMediatorDescription_5169Parser();
		case XSLTMediatorDescriptionEditPart.VISUAL_ID:
			return getXSLTMediatorDescription_5170Parser();
		case SequenceNameEditPart.VISUAL_ID:
			return getSequenceName_5132Parser();

		case EventMediatorTopicTypeEditPart.VISUAL_ID:
			return getEventMediatorTopicType_5133Parser();
		case EventMediatorDescriptionEditPart.VISUAL_ID:
			return getEventMediatorDescription_5171Parser();
		case EntitlementMediatorServerURLEditPart.VISUAL_ID:
			return getEntitlementMediatorServerURL_5134Parser();
		case EntitlementMediatorDescriptionEditPart.VISUAL_ID:
			return getEntitlementMediatorDescription_5172Parser();
		case ClassMediatorClassNameEditPart.VISUAL_ID:
			return getClassMediatorClassName_5135Parser();
		case ClassMediatorDescriptionEditPart.VISUAL_ID:
			return getClassMediatorDescription_5173Parser();
		case SpringMediatorBeanNameEditPart.VISUAL_ID:
			return getSpringMediatorBeanName_5136Parser();
		case SpringMediatorDescriptionEditPart.VISUAL_ID:
			return getSpringMediatorDescription_5174Parser();

		case ScriptMediatorScriptLanguageEditPart.VISUAL_ID:
			return getScriptMediatorScriptLanguage_5137Parser();
		case ScriptMediatorDescriptionEditPart.VISUAL_ID:
			return getScriptMediatorDescription_5175Parser();

		case FaultMediatorFaultStringTypeEditPart.VISUAL_ID:
			return getFaultMediatorFaultStringType_5138Parser();
		case FaultMediatorDescriptionEditPart.VISUAL_ID:
			return getFaultMediatorDescription_5176Parser();

		case XQueryMediatorScriptKeyTypeEditPart.VISUAL_ID:
			return getXQueryMediatorScriptKeyType_5139Parser();
		case XQueryMediatorDescriptionEditPart.VISUAL_ID:
			return getXQueryMediatorDescription_5177Parser();
		case CommandMediatorClassNameEditPart.VISUAL_ID:
			return getCommandMediatorClassName_5140Parser();
		case CommandMediatorDescriptionEditPart.VISUAL_ID:
			return getCommandMediatorDescription_5178Parser();
		case DBLookupMediatorConnectionURLEditPart.VISUAL_ID:
			return getDBLookupMediatorConnectionURL_5141Parser();
		case DBLookupMediatorDescriptionEditPart.VISUAL_ID:
			return getDBLookupMediatorDescription_5179Parser();
		case DBReportMediatorConnectionURLEditPart.VISUAL_ID:
			return getDBReportMediatorConnectionURL_5142Parser();
		case DBReportMediatorDescriptionEditPart.VISUAL_ID:
			return getDBReportMediatorDescription_5180Parser();
		case SmooksMediatorDescriptionEditPart.VISUAL_ID:
			return getSmooksMediatorDescription_5181Parser();
		case HeaderMediatorValueLiteralEditPart.VISUAL_ID:
			return getHeaderMediatorValueLiteral_5143Parser();
		case HeaderMediatorDescriptionEditPart.VISUAL_ID:
			return getHeaderMediatorDescription_5183Parser();
		case CloneMediatorCloneIDEditPart.VISUAL_ID:
			return getCloneMediatorCloneID_5144Parser();
		case CacheMediatorCacheIdEditPart.VISUAL_ID:
			return getCacheMediatorCacheId_5145Parser();
		case IterateMediatorIterateIDEditPart.VISUAL_ID:
			return getIterateMediatorIterateID_5146Parser();
		case CalloutMediatorSoapActionEditPart.VISUAL_ID:
			return getCalloutMediatorSoapAction_5147Parser();
		case CalloutMediatorDescriptionEditPart.VISUAL_ID:
			return getCalloutMediatorDescription_5184Parser();
		case TransactionMediatorDescriptionEditPart.VISUAL_ID:
			return getTransactionMediatorDescription_5185Parser();
		case RMSequenceMediatorDescriptionEditPart.VISUAL_ID:
			return getRMSequenceMediatorDescription_5186Parser();
		case OAuthMediatorRemoteServiceUrlEditPart.VISUAL_ID:
			return getOAuthMediatorRemoteServiceUrl_5148Parser();
		case OAuthMediatorDescriptionEditPart.VISUAL_ID:
			return getOAuthMediatorDescription_5187Parser();
		case AggregateMediatorAggregateIDEditPart.VISUAL_ID:
			return getAggregateMediatorAggregateID_5149Parser();
		case StoreMediatorDescriptionEditPart.VISUAL_ID:
			return getStoreMediatorDescription_5188Parser();
		case BuilderMediatorDescriptionEditPart.VISUAL_ID:
			return getBuilderMediatorDescription_5189Parser();
		case CallTemplateMediatorDescriptionEditPart.VISUAL_ID:
			return getCallTemplateMediatorDescription_5190Parser();
		case PayloadFactoryMediatorDescriptionEditPart.VISUAL_ID:
			return getPayloadFactoryMediatorDescription_5191Parser();
		case EnqueueMediatorDescriptionEditPart.VISUAL_ID:
			return getEnqueueMediatorDescription_5192Parser();
		case URLRewriteMediatorDescriptionEditPart.VISUAL_ID:
			return getURLRewriteMediatorDescription_5193Parser();
		case BAMMediatorDescriptionEditPart.VISUAL_ID:
			return getBAMMediatorDescription_5194Parser();
		case BeanMediatorDescriptionEditPart.VISUAL_ID:
			return getBeanMediatorDescription_5195Parser();
		case EJBMediatorDescriptionEditPart.VISUAL_ID:
			return getEJBMediatorDescription_5196Parser();
		case DefaultEndPointEndPointNameEditPart.VISUAL_ID:
			return getDefaultEndPointEndPointName_5155Parser();
		case AddressEndPointEndPointNameEditPart.VISUAL_ID:
			return getAddressEndPointEndPointName_5156Parser();
		case FailoverEndPointEndPointNameEditPart.VISUAL_ID:
			return getFailoverEndPointEndPointName_5157Parser();
		case WSDLEndPointEndPointNameEditPart.VISUAL_ID:
			return getWSDLEndPointEndPointName_5158Parser();
		case NamedEndpointNameEditPart.VISUAL_ID:
			return getNamedEndpointName_5165Parser();
		case LoadBalanceEndPointEndPointNameEditPart.VISUAL_ID:
			return getLoadBalanceEndPointEndPointName_5159Parser();
		case CloudConnectorDescriptionEditPart.VISUAL_ID:
			return getCloudConnectorDescription_5197Parser();
		case CloudConnectorOperationDescriptionEditPart.VISUAL_ID:
			return getCloudConnectorOperationDescription_5198Parser();
		case DefaultEndPointEndPointName2EditPart.VISUAL_ID:
			return getDefaultEndPointEndPointName_5160Parser();
		case AddressEndPointEndPointName2EditPart.VISUAL_ID:
			return getAddressEndPointEndPointName_5161Parser();
		case FailoverEndPointEndPointName2EditPart.VISUAL_ID:
			return getFailoverEndPointEndPointName_5162Parser();
		case WSDLEndPointEndPointName2EditPart.VISUAL_ID:
			return getWSDLEndPointEndPointName_5163Parser();
		case LoadBalanceEndPointEndPointName2EditPart.VISUAL_ID:
			return getLoadBalanceEndPointEndPointName_5164Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(EsbVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(EsbVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (EsbElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
