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

package org.wso2.carbonstudio.eclipse.distribution.project.ui.wizard;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.maven.model.Dependency;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.PluginExecution;
import org.apache.maven.model.Repository;
import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.maven.util.MavenUtils;
import org.wso2.carbonstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.carbonstudio.eclipse.distribution.project.Activator;
import org.wso2.carbonstudio.eclipse.distribution.project.model.DependencyData;
import org.wso2.carbonstudio.eclipse.distribution.project.model.DistributionProjectModel;
import org.wso2.carbonstudio.eclipse.distribution.project.util.ArtifactTypeMapping;
import org.wso2.carbonstudio.eclipse.utils.project.ProjectUtils;

public class DistributionProjectWizard extends
		AbstractWSO2ProjectCreationWizard {
	private IProject project;
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);


	public DistributionProjectWizard() {
		setModel(new DistributionProjectModel());
	}

	public IResource getCreatedResource() {
		return project;
	}

	public boolean performFinish() {
		try {
			DistributionProjectModel projectModel = (DistributionProjectModel) getModel();
			project = createNewProject();
			File pomfile = project.getFile("pom.xml").getLocation().toFile();
			createPOM(pomfile);
			ProjectUtils
					.addNatureToProject(project, false,
							"org.wso2.carbonstudio.eclipse.distribution.project.nature");
			project.refreshLocal(IResource.DEPTH_INFINITE,
					new NullProgressMonitor());

			MavenProject mavenProject = MavenUtils.getMavenProject(pomfile);
			mavenProject.getModel().setPackaging("carbon/application");
			Plugin plugin = MavenUtils.createPluginEntry(mavenProject,
					"org.wso2.maven", "maven-car-plugin", "1.0.6", true);
			PluginExecution pluginExecution;

			pluginExecution = new PluginExecution();
			pluginExecution.addGoal("car");
			pluginExecution.setPhase("package");
			pluginExecution.setId("car");
			plugin.addExecution(pluginExecution);

			Repository repo = new Repository();
			repo.setUrl("http://dist.wso2.org/maven2");
			repo.setId("wso2-maven2-repository-1");
			
			Repository repo1 = new Repository();
			repo1.setUrl("http://maven.wso2.org/nexus/content/groups/wso2-public/");
			repo1.setId("wso2-nexus-repository-1");

			mavenProject.getModel().addRepository(repo);
			mavenProject.getModel().addPluginRepository(repo);
			
			mavenProject.getModel().addRepository(repo1);
			mavenProject.getModel().addPluginRepository(repo1);

			List<Dependency> dependencyList = new ArrayList<Dependency>();
			Properties properties = mavenProject.getModel().getProperties();
			for (DependencyData dependencyData : projectModel.getSelectedProjects()) {
				Dependency dependency = dependencyData.getDependency();
				dependencyList.add(dependency);
			}	
			properties.put("artifact.types", ArtifactTypeMapping.getArtifactTypes());
			mavenProject.getModel().setProperties(properties);

			MavenUtils.addMavenDependency(mavenProject, dependencyList);
			MavenUtils.saveMavenProject(mavenProject, pomfile);
			project.refreshLocal(IResource.DEPTH_INFINITE,
					new NullProgressMonitor());
			openEditor();
		} catch (Exception e) {
			log.error("An error occurred generating a project: ", e);
			return false;
		}
		return true;
	}
	
	public void openEditor(){
		try {
			 IFile pom = project.getFile("pom.xml");
		     IWorkbenchWindow window=PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	         IWorkbenchPage page = window.getActivePage();
	      	 page.openEditor(new FileEditorInput(pom), "org.wso2.carbonstudio.eclipse.distribution.project.editor.DistProjectEditor"); 
		} catch (Exception e) { /* ignore */}
	}

}
