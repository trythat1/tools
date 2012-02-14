/*
 * Copyright (c) 2011, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbonstudio.eclipse.distribution.project.util;

import java.util.HashMap;

public class ServerRoleMapping {

	private static HashMap<String, String> serverRole = new HashMap<String, String>();

	static {
		serverRole.put("service/axis2", "ApplicationServer");
		serverRole.put("service/jaxws", "ApplicationServer");
		serverRole.put("service/dataservice", "DataServicesServer");
		serverRole.put("synapse/sequence", "EnterpriseServiceBus");
		serverRole.put("synapse/endpoint", "EnterpriseServiceBus");
		serverRole.put("synapse/proxy-service", "EnterpriseServiceBus");
		serverRole.put("synapse/configuration", "EnterpriseServiceBus");
		serverRole.put("registry/resource", "GovernanceRegistry");
		serverRole.put("bpel/workflow", "BusinessProcessServer");
		serverRole.put("wso2/gadget", "GadgetServer");
		serverRole.put("web/application", "ApplicationServer");
		serverRole.put("war", "ApplicationServer");
		serverRole.put("jar", "ApplicationServer");
		serverRole.put("lib/carbon/ui", "ApplicationServer");
		serverRole.put("lib/synapse/mediator", "EnterpriseServiceBus");
		serverRole.put("lib/dataservice/validator", "DataServicesServer");
		serverRole.put("lib/registry/handlers", "GovernanceRegistry");
		serverRole.put("lib/registry/filter", "GovernanceRegistry");
		serverRole.put("lib/library/bundle", "ApplicationServer");
		serverRole.put("synapse/local-entry", "EnterpriseServiceBus");
		serverRole.put("synapse/event-source", "EnterpriseServiceBus");
		serverRole.put("synapse/task", "EnterpriseServiceBus");
	}

	public static String getServerRole(String packaging) {
		String value = new String();
		if (serverRole.containsKey(packaging)) {
			value = serverRole.get(packaging);
		}
		return value;
	}

}
