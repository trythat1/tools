package org.wso2.carbonstudio.eclipse.platform.core.internal.impl.mediatypes;

import java.io.InputStream;

import org.wso2.carbonstudio.eclipse.platform.core.mediatype.AbstractXmlDocMediaTypeResolver;

public class HTMLMediaTypeResolver extends AbstractXmlDocMediaTypeResolver {

	public boolean isMediaType(InputStream dataStream) {
		return isDocumentTag(dataStream, "html");
	}

}
