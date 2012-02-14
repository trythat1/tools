/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbonstudio.eclipse.greg.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class RegistryPerspectiveFactory implements IPerspectiveFactory {

	String browserViewID = "org.wso2.carbonstudio.registry.remote.registry.view";
	String metadataViewID = "org.wso2.carbonstudio.eclipse.registry.properties";

	public void createInitialLayout(IPageLayout layout) {
		defineAction(layout);
		defineLayout(layout);

	}

	public void defineAction(IPageLayout layout) {
		layout.addShowViewShortcut(browserViewID);
		layout.addShowViewShortcut(metadataViewID);
	}

	public void defineLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		IFolderLayout browserFolder = layout.createFolder(
				"browserFolder", IPageLayout.LEFT, (float) 0.25, //$NON-NLS-1$
				editorArea);
		browserFolder.addView(browserViewID);
//		browserFolder = layout.createFolder(
//				"metadataFolder", IPageLayout.BOTTOM, (float) 0.25, //$NON-NLS-1$
//				editorArea);
//		browserFolder.addView(metadataViewID);

	}

}
