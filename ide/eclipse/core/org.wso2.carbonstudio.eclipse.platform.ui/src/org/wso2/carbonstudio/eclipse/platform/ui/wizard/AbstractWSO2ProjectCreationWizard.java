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

package org.wso2.carbonstudio.eclipse.platform.ui.wizard;

import java.io.File;
import java.net.URL;

import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.wso2.carbonstudio.eclipse.maven.util.MavenUtils;
import org.wso2.carbonstudio.eclipse.platform.core.model.MavenInfo;
import org.wso2.carbonstudio.eclipse.platform.core.project.model.ProjectDataModel;
import org.wso2.carbonstudio.eclipse.platform.core.project.model.ProjectWizardSettings;
import org.wso2.carbonstudio.eclipse.platform.ui.wizard.pages.MavenDetailsPage;
import org.wso2.carbonstudio.eclipse.platform.ui.wizard.pages.ProjectOptionsDataPage;
import org.wso2.carbonstudio.eclipse.platform.ui.wizard.pages.ProjectOptionsPage;

public abstract class AbstractWSO2ProjectCreationWizard extends Wizard implements INewWizard,
                                                                      IExecutableExtension {
	private ProjectDataModel model;
	private IConfigurationElement configElement;
	private ISelection currentSelection;

	
	public void addPages() {
		URL resource = getWizardManifest();
		try {
			ProjectWizardSettings settings =
			        new ProjectWizardSettings(resource.openStream(), configElement);
			if (settings.getProjectOptions().size() == 1) {
				getModel().setSelectedOption(settings.getProjectOptions().get(0).getId());
			} else {
				addPage(new ProjectOptionsPage(settings, getModel()));
			}
			addPage(new ProjectOptionsDataPage(settings, getModel(), getCurrentSelection(),
			        isRequireProjectLocationSection(), isRequiredWorkingSet()));
			if (isProjectWizard()){
				addPage(new MavenDetailsPage(getModel()));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected boolean isProjectWizard() {
		String projectAttr = configElement.getAttribute("project");
		return projectAttr!=null && projectAttr.equals("true");
	}

	protected boolean isRequireProjectLocationSection() {
		return true;
	}

	protected boolean isRequiredWorkingSet(){
		return true;
	}
	
	public void setInitializationData(IConfigurationElement configElement, String arg1, Object arg2)
	        throws CoreException {
		this.configElement = configElement;

	}

	protected URL getWizardManifest() {
		if(configElement != null){
			String wizardManifestPath = configElement.getAttribute("wizardManifest");
			return Platform.getBundle(configElement.getContributor().getName())
			        .getResource(wizardManifestPath);
		}
		return null;
	}

	
	public void init(IWorkbench arg0, IStructuredSelection selection) {
		setCurrentSelection(selection);
	}

	public void setModel(ProjectDataModel model) {
		this.model = model;
	}

	public ProjectDataModel getModel() {
		return model;
	}

	public IProject createNewProject() throws CoreException {
		String name = getModel().getProjectName();
		File location = getModel().getLocation();
		String rootWorkspaceLocation =
		        ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString() +
		                File.separator + name;
		IProgressMonitor progressMonitor = new NullProgressMonitor();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(name);
		if (rootWorkspaceLocation.equals(location.getPath())) {
			project.create(progressMonitor);
			project.open(progressMonitor);
		} else {
			IProjectDescription newProjectDescription =
			        project.getWorkspace().newProjectDescription(name);
			newProjectDescription.setLocationURI(location.toURI());
			project.create(newProjectDescription, null);
			project.open(null);
		}
		return project;
	}

	public void createPOM(File pomLocation) throws Exception {
		MavenInfo mavenInfo = getModel().getMavenInfo();
		MavenProject mavenProject =
		        MavenUtils.createMavenProject(mavenInfo.getGroupId(), mavenInfo.getArtifactId(),
		                                      mavenInfo.getVersion(), mavenInfo.getPackageName());
		MavenUtils.saveMavenProject(mavenProject, pomLocation);
	}
	
	public void createPOM(File pomLocation, String packagingType) throws Exception {
		MavenInfo mavenInfo = getModel().getMavenInfo();
		MavenProject mavenProject =
		        MavenUtils.createMavenProject(mavenInfo.getGroupId(), mavenInfo.getArtifactId(),
		                                      mavenInfo.getVersion(), packagingType);
		MavenUtils.saveMavenProject(mavenProject, pomLocation);
	}

	public void setCurrentSelection(ISelection currentSelection) {
		this.currentSelection = currentSelection;
	}

	public ISelection getCurrentSelection() {
		return currentSelection;
	}

	public abstract IResource getCreatedResource();
}
