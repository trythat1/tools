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

package org.wso2.carbonstudio.eclipse.capp.project.provider;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.wso2.carbonstudio.eclipse.capp.core.manifest.Artifact;
import org.wso2.carbonstudio.eclipse.capp.project.manager.CAppArtifactManager;

public class ArtifactsForProjectContentProvider implements ITreeContentProvider {
	
	private Artifact ignoreArtifact;

	public ArtifactsForProjectContentProvider(Artifact ignoreArtifact) {
		this.ignoreArtifact=ignoreArtifact;
    }
	
    public Object[] getChildren(Object o) {
        // Collect all the projects in the workspace except the given project
    	if (o instanceof IProject){
    		List<Artifact> artifacts = CAppArtifactManager.getInstance().getArtifacts((IProject)o);
    		if (ignoreArtifact!=null && !ignoreArtifact.isSuperArtifact()){
        		for(Artifact artifact:artifacts){
        			if (artifact.getName().equals(ignoreArtifact.getName())){
        				artifacts.remove(artifact);
        				break;
        			}
        		}
    		}
    		return artifacts.toArray();
    	}
    	return new Object[]{};
    }

    public Object getParent(Object arg0) {
        return null;
    }

    public boolean hasChildren(Object arg0) {
        return false;
    }

    public Object[] getElements(Object arg0) {
        return getChildren(arg0);
    }

    public void dispose() {
    }

    public void inputChanged(Viewer arg0, Object arg1, Object arg2) {
    }

}
