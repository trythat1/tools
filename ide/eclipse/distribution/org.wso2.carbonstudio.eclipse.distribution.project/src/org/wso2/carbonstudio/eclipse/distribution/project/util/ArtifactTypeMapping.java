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

public class ArtifactTypeMapping {
	private static HashMap<String, String> type = new HashMap<String, String>();
	private static HashMap<String, String> subType = new HashMap<String, String>();
	
	static {
		type.put("bpel/workflow","zip");
		type.put("lib/registry/filter","jar");
		type.put("service/jaxws","jar");
		type.put("lib/library/bundle","jar");
		type.put("service/dataservice","dbs");
		type.put("synapse/local-entry","xml");
		type.put("synapse/proxy-service","xml");
		type.put("carbon/application","car");
		type.put("registry/resource","zip");
		type.put("lib/dataservice/validator","jar");
		type.put("synapse/endpoint","xml");
		type.put("web/application","war");
		type.put("lib/carbon/ui","jar");
		type.put("service/axis2","aar");
		type.put("synapse/sequence","xml");
		type.put("synapse/configuration","xml");
		type.put("wso2/gadget","dar");
		type.put("lib/registry/handlers","jar");
		type.put("lib/synapse/mediator","jar");
		
		subType.put("jar","jar");
		subType.put("bundle","jar");
	}
	
	public static boolean isValidArtifactType(String str) {
		return type.containsKey(str);
	}
	
	public static String getType(String packaging) {
		String value = new String();
		if (type.containsKey(packaging)) {
			value = type.get(packaging);
		} else {
			if (subType.containsKey(packaging)) {
				value = subType.get(packaging);
			} else {
				value = packaging;
			}
		}
		return value;
	}
	
	public static String getArtifactTypes(){
		String artifactTypes= new String();
		for(String key: type.keySet()){
			artifactTypes += (key + "=" + type.get(key) +",");
		}
		artifactTypes = artifactTypes.replaceAll(",$","");
		return artifactTypes;
	}
	
}
