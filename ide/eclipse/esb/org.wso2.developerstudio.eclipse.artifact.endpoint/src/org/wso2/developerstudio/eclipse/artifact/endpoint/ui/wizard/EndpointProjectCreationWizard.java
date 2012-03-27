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

package org.wso2.developerstudio.eclipse.artifact.endpoint.ui.wizard;

import static org.wso2.developerstudio.eclipse.platform.core.registry.util.Constants.REGISTRY_RESOURCE;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMElement;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.PluginExecution;
import org.apache.maven.model.Repository;
import org.apache.maven.model.RepositoryPolicy;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.wso2.developerstudio.eclipse.artifact.endpoint.Activator;
import org.wso2.developerstudio.eclipse.artifact.endpoint.model.EndpointModel;
import org.wso2.developerstudio.eclipse.artifact.endpoint.utils.EndPointImageUtils;
import org.wso2.developerstudio.eclipse.artifact.endpoint.utils.EpArtifactConstants;
import org.wso2.developerstudio.eclipse.esb.project.artifact.ESBArtifact;
import org.wso2.developerstudio.eclipse.esb.project.artifact.ESBProjectArtifact;
import org.wso2.developerstudio.eclipse.general.project.artifact.GeneralProjectArtifact;
import org.wso2.developerstudio.eclipse.general.project.artifact.RegistryArtifact;
import org.wso2.developerstudio.eclipse.general.project.artifact.bean.RegistryElement;
import org.wso2.developerstudio.eclipse.general.project.artifact.bean.RegistryItem;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.platform.core.registry.util.RegistryResourceInfo;
import org.wso2.developerstudio.eclipse.platform.core.registry.util.RegistryResourceInfoDoc;
import org.wso2.developerstudio.eclipse.platform.core.registry.util.RegistryResourceUtils;
import org.wso2.developerstudio.eclipse.platform.core.templates.ArtifactTemplate;
import org.wso2.developerstudio.eclipse.platform.ui.wizard.AbstractWSO2ProjectCreationWizard;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;

public class EndpointProjectCreationWizard extends AbstractWSO2ProjectCreationWizard {
	
	private static IDeveloperStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
	
	private EndpointModel epModel;
	private IFile endpointFile;
	private ESBProjectArtifact esbProjectArtifact;
	private List<File> fileLst = new ArrayList<File>();
	private IProject project;

	public EndpointProjectCreationWizard() {
		this.epModel = new EndpointModel();
		setModel(this.epModel);
		setWindowTitle(EpArtifactConstants.EP_WIZARD_WINDOW_TITLE);
		setDefaultPageImageDescriptor(EndPointImageUtils.getInstance().getImageDescriptor("endpoint-wizard.png"));
	}

	
	protected boolean isRequireProjectLocationSection() {
		return false;
	}

	protected boolean isRequiredWorkingSet() {
		 return false;
	}

	public boolean performFinish() {
		try {
			epModel = (EndpointModel) getModel();
			project = epModel.getEndpointSaveLocation().getProject();
	
			if(epModel.isSaveAsDynamic()){
				createDynamicEndpointArtifact(project,epModel);
			} else{
				createEndpointArtifact(project,epModel);
			}
			
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			
			if(fileLst.size()>0){
				openEditor(fileLst.get(0));
			}
			
		} catch (CoreException e) {
			log.error("CoreException has occurred", e);
		} catch (Exception e) {
			log.error("An unexpected error has occurred", e);
		}

		return true;
	}
	
	private void createEndpointArtifact(IProject prj, EndpointModel model)
			throws Exception {
		String templateContent = "";
		String template = "";
		IContainer location = project.getFolder("src" + File.separator
				+ "main" + File.separator + "synapse-config" + File.separator
				+ "endpoints");

		// Adding the metadata about the endpoint to the metadata store.
		esbProjectArtifact = new ESBProjectArtifact();
		esbProjectArtifact.fromFile(project.getFile("artifact.xml")
				.getLocation().toFile());

		if (getModel().getSelectedOption().equals(
				EpArtifactConstants.WIZARD_OPTION_IMPORT_OPTION)) {
			copyImportFile(location);
		} else {
			ArtifactTemplate selectedTemplate = epModel.getSelectedTemplate();
			templateContent = FileUtils.getContentAsString(selectedTemplate
					.getTemplateDataStream());
			if (selectedTemplate.getName().equals(
					EpArtifactConstants.ADDRESS_EP)) {
				template = createEPTemplate(templateContent,
						EpArtifactConstants.ADDRESS_EP);
			} else if (selectedTemplate.getName().equals(
					EpArtifactConstants.WSDL_EP)) {
				template = createEPTemplate(templateContent,
						EpArtifactConstants.WSDL_EP);
			} else if (selectedTemplate.getName().equals(
					EpArtifactConstants.TEMPLATE_EP)) {
				template = createEPTemplate(templateContent,
						EpArtifactConstants.TEMPLATE_EP);
			} else {
				template = createEPTemplate(templateContent, "");
			}

			endpointFile = location.getFile(new Path(epModel.getEpName()
					+ ".xml"));
			File destFile = endpointFile.getLocation().toFile();
			FileUtils.createFile(destFile, template);
			fileLst.add(destFile);
			ESBArtifact artifact = new ESBArtifact();
			artifact.setName(epModel.getEpName());
			artifact.setVersion("1.0.0");
			artifact.setType("synapse/endpoint");
			artifact.setServerRole("EnterpriseServiceBus");
			artifact.setFile(FileUtils.getRelativePath(project.getLocation()
					.toFile(), new File(location.getLocation().toFile(),
					epModel.getEpName() + ".xml")));
			esbProjectArtifact.addESBArtifact(artifact);
		}

		File pomfile = project.getFile("pom.xml").getLocation().toFile();
		getModel().getMavenInfo().setPackageName("synapse/endpoint");
		if (!pomfile.exists()) {
			createPOM(pomfile);
		}
		// ProjectUtils.addNatureToProject(esbProject,
		// false,
		// EpArtifactConstants.ESB_PROJECT_NATURE,
		// "org.wso2.developerstudio.eclipse.endpoint.project.nature" );
		updatePom();
		project.refreshLocal(IResource.DEPTH_INFINITE,
				new NullProgressMonitor());

		esbProjectArtifact.toFile();
	}
	
	private void createDynamicEndpointArtifact(IContainer location,EndpointModel model) throws Exception{
		String registryPath = model.getDynamicEpRegistryPath()
				.replaceAll("^conf:", "/_system/config")
				.replaceAll("^gov:", "/_system/governance")
				.replaceAll("^local:", "/_system/local");
		String templateContent = "";
		String template = "";
		RegistryResourceInfoDoc regResInfoDoc = new RegistryResourceInfoDoc();

		ArtifactTemplate selectedTemplate = epModel.getSelectedTemplate();
		templateContent = FileUtils.getContentAsString(selectedTemplate
				.getTemplateDataStream());
		if (selectedTemplate.getName().equals(
				EpArtifactConstants.ADDRESS_EP)) {
			template = createEPTemplate(templateContent,
					EpArtifactConstants.ADDRESS_EP);
		} else if (selectedTemplate.getName().equals(
				EpArtifactConstants.WSDL_EP)) {
			template = createEPTemplate(templateContent,
					EpArtifactConstants.WSDL_EP);
		} else if (selectedTemplate.getName().equals(
				EpArtifactConstants.TEMPLATE_EP)) {
			template = createEPTemplate(templateContent,
					EpArtifactConstants.TEMPLATE_EP);
		} else {
			template = createEPTemplate(templateContent, "");
		}

		endpointFile = location.getFile(new Path(epModel.getEpName()
				+ ".xml"));
		File destFile = endpointFile.getLocation().toFile();
		FileUtils.createFile(destFile, template);
		fileLst.add(destFile);
		
		
		RegistryResourceUtils.createMetaDataForFolder(registryPath, location
				.getLocation().toFile());
		RegistryResourceUtils.addRegistryResourceInfo(destFile, regResInfoDoc,
				project.getLocation().toFile(), registryPath);

		GeneralProjectArtifact generalProjectArtifact = new GeneralProjectArtifact();
		generalProjectArtifact.fromFile(project.getFile("artifact.xml")
				.getLocation().toFile());

		RegistryArtifact artifact = new RegistryArtifact();
		artifact.setName(epModel.getEpName());
		artifact.setVersion("1.0.0");
		artifact.setType("registry/resource");
		artifact.setServerRole("EnterpriseServiceBus");
		List<RegistryResourceInfo> registryResources = regResInfoDoc
				.getRegistryResources();
		for (RegistryResourceInfo registryResourceInfo : registryResources) {
			RegistryElement item = null;
			if (registryResourceInfo.getType() == REGISTRY_RESOURCE) {
				item = new RegistryItem();
				((RegistryItem) item).setFile(registryResourceInfo
						.getResourceBaseRelativePath());
			}
			item.setPath(registryResourceInfo.getDeployPath().replaceAll("/$",
					""));
			artifact.addRegistryElement(item);
		}
		generalProjectArtifact.addArtifact(artifact);
		generalProjectArtifact.toFile();
		
		addGeneralProjectPlugin(project);
	}
	
	private void addGeneralProjectPlugin(IProject project) throws Exception{
		MavenProject mavenProject;
		
		File mavenProjectPomLocation = project.getFile("pom.xml").getLocation().toFile();
		if(!mavenProjectPomLocation.exists()){
			mavenProject = MavenUtils.createMavenProject("org.wso2.carbon", project.getName(), "1.0.0","pom");
		} else {
			mavenProject = MavenUtils.getMavenProject(mavenProjectPomLocation);
		}
		
		List<Plugin> plugins = mavenProject.getBuild().getPlugins();
		
		for(Plugin plg:plugins){
			if(plg.getArtifactId().equals("wso2-general-project-plugin")){
				return ;
			}
		}
		
		mavenProject = MavenUtils.getMavenProject(mavenProjectPomLocation);
		Plugin plugin = MavenUtils.createPluginEntry(mavenProject, "org.wso2.maven", "wso2-general-project-plugin", "1.0.5", true);
		
		PluginExecution pluginExecution;
		
		pluginExecution = new PluginExecution();
		pluginExecution.addGoal("pom-gen");
		pluginExecution.setPhase("process-resources");
		pluginExecution.setId("registry");
		plugin.addExecution(pluginExecution);
		
		Xpp3Dom configurationNode = MavenUtils.createMainConfigurationNode();
		Xpp3Dom artifactLocationNode = MavenUtils.createXpp3Node(configurationNode, "artifactLocation");
		artifactLocationNode.setValue(".");
		Xpp3Dom typeListNode = MavenUtils.createXpp3Node(configurationNode, "typeList");
		typeListNode.setValue("${artifact.types}");
		pluginExecution.setConfiguration(configurationNode);
		
		Repository repo = new Repository();
		repo.setUrl("http://dist.wso2.org/maven2");
		repo.setId("wso2-maven2-repository-1");
		
		Repository repo1 = new Repository();
		repo1.setUrl("http://maven.wso2.org/nexus/content/groups/wso2-public/");
		repo1.setId("wso2-nexus-maven2-repository-1");
		
		if (!mavenProject.getRepositories().contains(repo)) {
	        mavenProject.getModel().addRepository(repo);
	        mavenProject.getModel().addPluginRepository(repo);
        }

		if (!mavenProject.getRepositories().contains(repo1)) {
	        mavenProject.getModel().addRepository(repo1);
	        mavenProject.getModel().addPluginRepository(repo1);
        }
		
		MavenUtils.saveMavenProject(mavenProject, mavenProjectPomLocation);
	}
	
	public void updatePom() throws Exception{
		File mavenProjectPomLocation = project.getFile("pom.xml").getLocation().toFile();
		MavenProject mavenProject = MavenUtils.getMavenProject(mavenProjectPomLocation);

		List<Plugin> plugins = mavenProject.getBuild().getPlugins();
		
		for(Plugin plg:plugins){
			if(plg.getId().equals("wso2-esb-endpoint-plugin")){
				return ;
			}
		}
		
		Plugin plugin = MavenUtils.createPluginEntry(mavenProject, "org.wso2.maven", "wso2-esb-endpoint-plugin", "1.0.5", true);
		
		PluginExecution pluginExecution = new PluginExecution();
		pluginExecution.addGoal("pom-gen");
		pluginExecution.setPhase("process-resources");
		pluginExecution.setId("endpoint");
		
		Xpp3Dom configurationNode = MavenUtils.createMainConfigurationNode();
		Xpp3Dom artifactLocationNode = MavenUtils.createXpp3Node(configurationNode, "artifactLocation");
		artifactLocationNode.setValue(".");
		Xpp3Dom typeListNode = MavenUtils.createXpp3Node(configurationNode, "typeList");
		typeListNode.setValue("${artifact.types}");
		pluginExecution.setConfiguration(configurationNode);
		
		plugin.addExecution(pluginExecution);
		Repository repo = new Repository();
		repo.setUrl("http://maven.wso2.org/nexus/content/groups/wso2-public/");
		repo.setId("wso2-nexus");
		
		RepositoryPolicy releasePolicy=new RepositoryPolicy();
		releasePolicy.setEnabled(true);
		releasePolicy.setUpdatePolicy("daily");
		releasePolicy.setChecksumPolicy("ignore");
		
		repo.setReleases(releasePolicy);
		
		if (!mavenProject.getRepositories().contains(repo)) {
	        mavenProject.getModel().addRepository(repo);
	        mavenProject.getModel().addPluginRepository(repo);
        }

		MavenUtils.saveMavenProject(mavenProject, mavenProjectPomLocation);
	}

	public void copyImportFile(IContainer importLocation) throws IOException {
		File importFile = getModel().getImportFile();
		EndpointModel endpointModel = (EndpointModel) getModel();
		List<OMElement> selectedEPList = endpointModel.getSelectedEPList();
		File destFile = null;
		if(selectedEPList != null && selectedEPList.size() >0 ){
			for (OMElement element : selectedEPList) {
				String name = element.getAttributeValue(new QName("name"));
				destFile  = new File(importLocation.getLocation().toFile(), name + ".xml");
				FileUtils.createFile(destFile, element.toString());
				fileLst.add(destFile);
				ESBArtifact artifact=new ESBArtifact();
				artifact.setName(name);
				artifact.setVersion("1.0.0");
				artifact.setType("synapse/endpoint");
				artifact.setServerRole("EnterpriseServiceBus");
				artifact.setFile(FileUtils.getRelativePath(importLocation.getProject().getLocation().toFile(), new File(importLocation.getLocation().toFile(),name+".xml")));
				esbProjectArtifact.addESBArtifact(artifact);		
			}
			
		}else{
			destFile = new File(importLocation.getLocation().toFile(), importFile.getName());
			FileUtils.copy(importFile, destFile);
			fileLst.add(destFile);
			String name = importFile.getName().replaceAll(".xml$", "");
			ESBArtifact artifact=new ESBArtifact();
			artifact.setName(name);
			artifact.setVersion("1.0.0");
			artifact.setType("synapse/endpoint");
			artifact.setServerRole("EnterpriseServiceBus");
			artifact.setFile(FileUtils.getRelativePath(importLocation.getProject().getLocation().toFile(), new File(importLocation.getLocation().toFile(),name+".xml")));
			esbProjectArtifact.addESBArtifact(artifact);
		}
	}

	
	public IResource getCreatedResource() {
		return endpointFile;
	}
	
	public String createEPTemplate(String templateContent, String type) throws IOException{
//		String defaultNS = ESBPreferenceData.getDefaultNamesapce();
//		if(defaultNS.equals("") || defaultNS == null){
//			defaultNS = SynapseConstants.NS_1_4;
//		}
		templateContent = templateContent.replaceAll("\\{", "<");
		templateContent = templateContent.replaceAll("\\}", ">");
		String newContent = templateContent.replaceAll("<ep.name>", epModel.getEpName());
		if(type.equals(EpArtifactConstants.ADDRESS_EP)){
			newContent = newContent.replaceAll("<address.uri>", epModel.getAddressEPURI());
		}else if(type.equals(EpArtifactConstants.WSDL_EP)){
			newContent = newContent.replaceAll("<wsdl.uri>", epModel.getWsdlEPURI());
			newContent = newContent.replaceAll("<service.name>", epModel.getWsdlEPService());
			newContent = newContent.replaceAll("<service.port>", epModel.getWsdlEPPort());
		}else if(type.equals(EpArtifactConstants.TEMPLATE_EP)){
			newContent = newContent.replaceAll("<ep.uri>", epModel.getTemplateEPURI());
			newContent = newContent.replaceAll("<ep.template>", epModel.getTemplateEPTargetTemp());
		}
        return newContent;
	}
	
	public void openEditor(File file){
		try {
			IFile dbsFile  = ResourcesPlugin
			.getWorkspace()
			.getRoot()
			.getFileForLocation(
					Path.fromOSString(file.getAbsolutePath()));
			IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(),dbsFile);
		} catch (Exception e) { /* ignore */}
	}

}
