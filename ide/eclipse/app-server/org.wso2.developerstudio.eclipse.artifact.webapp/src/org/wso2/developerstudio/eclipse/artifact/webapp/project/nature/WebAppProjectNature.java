package org.wso2.developerstudio.eclipse.artifact.webapp.project.nature;

import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.wso2.developerstudio.eclipse.artifact.webapp.utils.WebAppTemplateUtils;
import org.wso2.developerstudio.eclipse.maven.util.MavenUtils;
import org.wso2.developerstudio.eclipse.platform.core.nature.AbstractWSO2ProjectNature;
import org.wso2.developerstudio.eclipse.utils.data.ITemporaryFileTag;
import org.wso2.developerstudio.eclipse.utils.file.FileUtils;
import org.wso2.developerstudio.eclipse.utils.project.ProjectUtils;
import org.wso2.developerstudio.eclipse.utils.wst.WebUtils;

import java.io.File;
import java.io.IOException;

public class WebAppProjectNature extends AbstractWSO2ProjectNature {

	
	public void configure() throws CoreException {
		addJavaProjectNature();
		try {
			setupAsWebApp();
			updatePom();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void setupAsWebApp() throws CoreException, IOException {
		IFile webXmlLocation = WebUtils.getWEBXmlLocation(getProject());
		if (webXmlLocation == null) {
			IFolder webappFolder =
			        ProjectUtils.getWorkspaceFolder(getProject(), "src", "main", "webapp");
			ITemporaryFileTag warTempTag = FileUtils.createNewTempTag();
			File webappTemplateArchive =
			        new WebAppTemplateUtils().getResourceFile("webapp-template.war");
			WebUtils.extractWAR(webappFolder, webappTemplateArchive);
			warTempTag.clearAndEnd();
		}
	}

	
	public void deconfigure() throws CoreException {

	}

	public void updatePom() throws Exception {
		File mavenProjectPomLocation = getProject().getFile("pom.xml").getLocation().toFile();
		MavenProject mavenProject = MavenUtils.getMavenProject(mavenProjectPomLocation);
//		IFile webXmlLocation = WebUtils.getWEBXmlLocation(getProject());
		MavenUtils.updateMavenProjectWithWarBuilderPlugin(getProject(), mavenProject,
		                                                  mavenProjectPomLocation);
		MavenUtils.saveMavenProject(mavenProject, mavenProjectPomLocation);
	}

}
