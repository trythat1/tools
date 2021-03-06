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

package org.wso2.carbonstudio.eclipse.ui.cnf.provider;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

public class EmptyNavigatorContentProvider implements ICommonContentProvider, IResourceChangeListener{

	public void init(ICommonContentExtensionSite arg0) {
		
	}
	public EmptyNavigatorContentProvider() {
		 ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
    }
	
	public Object[] getChildren(Object obj) {
	    return new Object[]{};
	}
	
	public Object getParent(Object arg0) {
		return null;
	}

	public boolean hasChildren(Object obj) {
    	return false;
	}

	public Object[] getElements(Object obj) {
		return getChildren(obj);
	}

	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
	}

	public void inputChanged(Viewer viewer, Object arg1, Object arg2) {
	}

	public void restoreState(IMemento arg0) {
		
	}

	public void saveState(IMemento arg0) {
		
	}
	
    public void resourceChanged(IResourceChangeEvent arg0) {
    }

}
