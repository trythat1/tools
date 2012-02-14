/*
 * Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
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
package org.wso2.carbonstudio.eclipse.gmf.esb.internal.persistence;

import java.util.List;

import org.apache.synapse.SynapseArtifact;
import org.apache.synapse.config.xml.XMLConfigConstants;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.util.xpath.SynapseXPath;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.carbonstudio.eclipse.gmf.esb.PropertyMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.persistence.EsbNodeTransformer;
import org.wso2.carbonstudio.eclipse.gmf.esb.persistence.TransformationInfo;

/**
 * {@link EsbNodeTransformer} responsible for transforming
 * {@link org.wso2.carbonstudio.eclipse.gmf.esb.LogMediator} model objects into
 * corresponding synapse artifact(s).
 */
public class PropertyMediatorTransformer extends AbstractEsbNodeTransformer {
	/**
	 * {@inheritDoc}
	 */
	public void transform(TransformationInfo info, EsbNode subject)
			throws Exception {	
		info.getParentSequence().addChild(createPropertyMediator(subject));
		// Transform the property mediator output data flow path.
		doTransform(info,
				((PropertyMediator) subject).getOutputConnector());
	}

	public void createSynapseObject(TransformationInfo info, EObject subject,
			List<Endpoint> endPoints) {
		// TODO Auto-generated method stub
		
	}
	
	public void transformWithinSequence(TransformationInfo information,
			EsbNode subject, SequenceMediator sequence) throws Exception {
		// TODO Auto-generated method stub		
		sequence.addChild(createPropertyMediator(subject));
		doTransformWithinSequence(information,((PropertyMediator) subject).getOutputConnector().getOutgoingLink(),sequence);
		
	}
	
	private org.apache.synapse.mediators.builtin.PropertyMediator createPropertyMediator(EsbNode subject) throws Exception{
		// Check subject.
		Assert.isTrue(subject instanceof PropertyMediator, "Invalid subject.");
		PropertyMediator visualProp = (PropertyMediator) subject;

		// Configure property mediator.
		org.apache.synapse.mediators.builtin.PropertyMediator propMediator = new org.apache.synapse.mediators.builtin.PropertyMediator();
		{			
			String pName = visualProp.getPropertyName();
			if (pName != null && !pName.equals("")) {
				propMediator.setName(visualProp.getPropertyName());
			}
			// Action.
			switch (visualProp.getPropertyAction()) {
			case SET:
				propMediator
						.setAction(org.apache.synapse.mediators.builtin.PropertyMediator.ACTION_SET);
				break;
			case REMOVE:
				propMediator
						.setAction(org.apache.synapse.mediators.builtin.PropertyMediator.ACTION_REMOVE);
				break;

			}
			// propMediator.setValue(visualProp.getValueLiteral());
			
			if(visualProp.getValueType().getName().equals("EXPRESSION")){
				if(visualProp.getExpression()!=null&&!visualProp.getExpression().equals("")){
				SynapseXPath XPath=new SynapseXPath(visualProp.getExpression());
				if(visualProp.getNamespace()==null){
					XPath.addNamespace(visualProp.getNamespacePrefix(), "Default");	
				}else{
					XPath.addNamespace(visualProp.getNamespacePrefix(), visualProp.getNamespace());
				}
				
				propMediator.setExpression(XPath);
				}//new SynapseXPath(visualProp.getExpression()));}
				else{
					propMediator.setExpression(new SynapseXPath("Default:"));
				}
				
			}
			
			
			if(visualProp.getValueType().getName().equals("LITERAL")){
			switch (visualProp.getPropertyDataType()) {
			case BOOLEAN:
				propMediator.setValue(visualProp.getValueLiteral(),
						XMLConfigConstants.DATA_TYPES.BOOLEAN.toString());
				break;
			case FLOAT:
				propMediator.setValue(visualProp.getValueLiteral(),
						XMLConfigConstants.DATA_TYPES.FLOAT.toString());
				break;
			case DOUBLE:
				propMediator.setValue(visualProp.getValueLiteral(),
						XMLConfigConstants.DATA_TYPES.DOUBLE.toString());
				break;
			case INTEGER:
				propMediator.setValue(visualProp.getValueLiteral(),
						XMLConfigConstants.DATA_TYPES.INTEGER.toString());
				break;
			case LONG:
				propMediator.setValue(visualProp.getValueLiteral(),
						XMLConfigConstants.DATA_TYPES.LONG.toString());
				break;
			case OM:
				propMediator.setValue(visualProp.getValueLiteral(),
						XMLConfigConstants.DATA_TYPES.OM.toString());
				break;
			case SHORT:
				propMediator.setValue(visualProp.getValueLiteral(),
						XMLConfigConstants.DATA_TYPES.SHORT.toString());
				break;
			case STRING:
				propMediator.setValue(visualProp.getValueLiteral(),
						XMLConfigConstants.DATA_TYPES.STRING.toString());
				break;
			}
			}

			switch (visualProp.getPropertyScope()) {
			case AXIS2:
				propMediator.setScope(XMLConfigConstants.SCOPE_AXIS2);
				break;
			case AXIS2_CLIENT:
				propMediator.setScope(XMLConfigConstants.SCOPE_CLIENT);
				break;
			case SYNAPSE:
				propMediator.setScope(XMLConfigConstants.SCOPE_DEFAULT);
				break;
			case TRANSPORT:
				propMediator.setScope(XMLConfigConstants.SCOPE_TRANSPORT);
				break;
			}

		}
		return propMediator;
	} 


}
