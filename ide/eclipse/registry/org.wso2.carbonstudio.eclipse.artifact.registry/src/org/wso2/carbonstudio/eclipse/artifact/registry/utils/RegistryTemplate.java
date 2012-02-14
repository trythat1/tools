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

package org.wso2.carbonstudio.eclipse.artifact.registry.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.osgi.framework.Bundle;

public class RegistryTemplate {
	private String name;
	private String id;
	private String templateFileName;
	private Bundle templateBundle;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setTemplateBundle(Bundle templateBundle) {
		this.templateBundle = templateBundle;
	}
	public Bundle getTemplateBundle() {
		return templateBundle;
	}
	public void setTemplateFileName(String templateFileName) {
		this.templateFileName = templateFileName;
	}
	public String getTemplateFileName() {
		return templateFileName;
	}
	
	public InputStream getTemplateDataStream() throws IOException{
		URL resource = getTemplateUrl();
		return resource.openStream();
	}
	public URL getTemplateUrl() {
		return getTemplateBundle().getResource(getTemplateFileName());
	}
}
