package org.wso2.carbonstudio.eclipse.artifact.bpel.utils;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.wso2.carbonstudio.eclipse.utils.template.TemplateUtil;

public class BPELTemplateUtils extends TemplateUtil{

	private static BPELTemplateUtils INSTANCE;
	protected Bundle getBundle() {
		return Platform.getBundle(org.wso2.carbonstudio.eclipse.artifact.bpel.Activator.PLUGIN_ID);
	}
	
	public static BPELTemplateUtils getInstance(){
		if (INSTANCE==null){
			INSTANCE=new BPELTemplateUtils();
		}
		return INSTANCE;
	}

}
