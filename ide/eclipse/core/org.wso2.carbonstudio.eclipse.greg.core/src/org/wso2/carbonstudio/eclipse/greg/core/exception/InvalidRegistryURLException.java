package org.wso2.carbonstudio.eclipse.greg.core.exception;

public class InvalidRegistryURLException extends CSRegistryException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidRegistryURLException(Throwable e) {
		super("Invalid registry url",e);
	}



}
