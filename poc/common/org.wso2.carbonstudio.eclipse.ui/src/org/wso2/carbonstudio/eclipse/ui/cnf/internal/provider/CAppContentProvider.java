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

package org.wso2.carbonstudio.eclipse.ui.cnf.internal.provider;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;
import org.wso2.carbonstudio.eclipse.ui.cnf.provider.EmptyNavigatorContentProvider;

public class CAppContentProvider extends EmptyNavigatorContentProvider {

    private Viewer viewer;
    

    public Object[] getChildren(Object obj) {
    	File location=null;
    	if (obj instanceof IProject){
    		location=((IProject)obj).getLocation().toFile();
    	}else if (obj instanceof IFolder){
    		location=((IFolder)obj).getLocation().toFile();
    	}
    	if (location!=null){
    		File[] children = location.listFiles();
    		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
    		List<IProject> projectsToAdd = new ArrayList<IProject>();
    		for (IProject project : projects) {
    			if (isProjectLocationContained(project, children)){
    				projectsToAdd.add(project);
    			}
			}
    		return projectsToAdd.toArray();
    	}
	    return new Object[]{};
    }

    private boolean isProjectLocationContained(IProject project, File[] locations){
    	for (File location : locations) {
			if (project.getLocation().toOSString().equals(location.toString())){
				return true;
			}
		}
    	return false;
    }
    public boolean hasChildren(Object obj) {
    	if (obj instanceof IProject){
            return true;
    	}
    	return false;
    }

    public void dispose() {
    	ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
    }

    public void inputChanged(Viewer viewer, Object arg1, Object arg2) {
    	this.viewer = viewer;
	}
    

    public void resourceChanged(IResourceChangeEvent arg0) {
    	Display.getDefault().asyncExec(new Runnable(){
            public void run() {
                viewer.refresh();	    
            }
    	});
    }
}
