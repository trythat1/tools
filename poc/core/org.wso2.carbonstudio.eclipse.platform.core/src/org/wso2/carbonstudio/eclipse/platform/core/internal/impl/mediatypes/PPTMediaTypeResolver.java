package org.wso2.carbonstudio.eclipse.platform.core.internal.impl.mediatypes;

import org.wso2.carbonstudio.eclipse.platform.core.mediatype.AbstractFileNameExtensionMediaTypeResolver;

public class PPTMediaTypeResolver extends AbstractFileNameExtensionMediaTypeResolver {

	public boolean isMediaType(String fileName) {
		return hasExtension(fileName,"ppt");
	}

}
