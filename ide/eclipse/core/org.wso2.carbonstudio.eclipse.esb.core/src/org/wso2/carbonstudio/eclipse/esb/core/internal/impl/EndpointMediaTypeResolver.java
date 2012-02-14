package org.wso2.carbonstudio.eclipse.esb.core.internal.impl;

import java.io.InputStream;

import org.wso2.carbonstudio.eclipse.platform.core.mediatype.AbstractXmlDocMediaTypeResolver;

public class EndpointMediaTypeResolver extends AbstractXmlDocMediaTypeResolver {

	public EndpointMediaTypeResolver() {
	}

	public boolean isMediaType(InputStream dataStream) {
		String tagName = "endpoint";
		return isDocumentTag(dataStream, tagName);
	}

}
