package org.wso2.carbonstudio.eclipse.libraries.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.wso2.carbonstudio.eclipse.libraries.Activator;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.utils.ide.EclipseUtils;


public class LibraryUtils {
	private static ICarbonStudioLog log = Logger.getLog(Activator.PLUGIN_ID);
	
	public static File getDependencyPath(String dependencyName, boolean isRelativePath){
		String dependencyPath = getLibLocation() + dependencyName;  
		URL resource = getResourceURL(dependencyPath);
		return getDependencyPath(resource,isRelativePath);
	}

	public static File getDependencyPath(String dependencyName){
		return getDependencyPath(dependencyName,true);
	}
	
	public static URL getResourceURL(String dependencyPath) {
		return Platform.getBundle(Activator.PLUGIN_ID).getResource(dependencyPath);
	}

	public static File getDependencyPath(URL resource) {
		return getDependencyPath(resource,true);
	}
	
	public static File getDependencyPath(URL resource, boolean isRelativePath) {
		IPath path = Activator.getDefault().getStateLocation();
		IPath libFolder = path.append("lib");
		String[] paths = resource.getFile().split("/");
		IPath library = libFolder.append(paths[paths.length-1]);
		File libraryFile = library.toFile();
		if (!libraryFile.exists()) {
			try {
				writeToFile(libraryFile, resource.openStream());
			} catch (IOException e) {
				log.error(e);
				return null;
			}
		}
		if (isRelativePath) {
			IPath relativePath = EclipseUtils.getWorkspaceRelativePath(library);
			relativePath = new Path(Constants.ECLIPSE_WORKSPACE_PATH)
					.append(relativePath);
			return relativePath.toFile();
		}else{
			return library.toFile();
		}
	}

	private static String getLibLocation() {
		return "lib/";
	} 
	
	private static void writeToFile(File file, InputStream stream) throws IOException{
		file.getParentFile().mkdirs();
	    OutputStream out=new FileOutputStream(file);
	    byte buf[]=new byte[1024];
	    int len;
	    while((len=stream.read(buf))>0)
	    	out.write(buf,0,len);
	    out.close();
	    stream.close();
	}

}
