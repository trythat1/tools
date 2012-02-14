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

package org.wso2.carbonstudio.eclipse.samples.menu;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.Shell;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.samples.Activator;
import org.wso2.carbonstudio.eclipse.samples.contributor.ICarbonStudioSampleContributor;
import org.wso2.carbonstudio.eclipse.utils.data.ITemporaryFileTag;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

public abstract class SampleAction extends Action {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	private ICarbonStudioSampleContributor contributor;
	private Shell shell;
	
	public SampleAction(Shell shell,ICarbonStudioSampleContributor contributor) {
		super(contributor.getCaption(),contributor.getImage());
		setToolTipText(contributor.getToolTip());
		setContributor(contributor);
		setShell(shell);
    }

	public void setContributor(ICarbonStudioSampleContributor contributor) {
	    this.contributor = contributor;
    }

	public ICarbonStudioSampleContributor getContributor() {
	    return contributor;
    }
	
	public void run() {
		ITemporaryFileTag tempTag = FileUtils.createNewTempTag();
	    if (getContributor().isCustomCreateSample()){
	    	try {
	            getContributor().createSample(getShell());
            } catch (Exception e) {
	            log.error(e);
            }
	    }else{
	    	execute();
	    }
	    tempTag.clearAndEnd();
	}
	
	public abstract void execute();

	public void setShell(Shell shell) {
	    this.shell = shell;
    }

	public Shell getShell() {
	    return shell;
    }
}
