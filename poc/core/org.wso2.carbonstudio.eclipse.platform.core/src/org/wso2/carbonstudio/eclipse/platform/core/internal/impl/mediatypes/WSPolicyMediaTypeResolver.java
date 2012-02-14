package org.wso2.carbonstudio.eclipse.platform.core.internal.impl.mediatypes;

import org.wso2.carbonstudio.eclipse.platform.core.interfaces.IMediaTypeResolver;
import org.wso2.carbonstudio.eclipse.platform.core.mediatype.AbstractFileNameExtensionMediaTypeResolver;

public class WSPolicyMediaTypeResolver extends
		AbstractFileNameExtensionMediaTypeResolver implements
		IMediaTypeResolver {

	public boolean isMediaType(String fileName) {
		return hasExtension(fileName, "wspolicy");
	}

}
