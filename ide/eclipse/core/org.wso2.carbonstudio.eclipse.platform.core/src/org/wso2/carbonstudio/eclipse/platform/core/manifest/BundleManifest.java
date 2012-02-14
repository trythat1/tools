package org.wso2.carbonstudio.eclipse.platform.core.manifest;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class BundleManifest extends SimpleJarManifest {
	private String bundleSymbolicName;
	private String bundleName;
	private String bundleVersion;
	private String bundleDescription;
	private String bundleActivatorName;
	private List<String> exportPackagesList;
	private List<String> importPackagesList;
	private List<String> bundleClassPath;
	private boolean dynamicImports=true;
	private String fragmentHost = null;
	
	/**
     * @return the bundleSymbolicName
     */
    public String getBundleSymbolicName() {
    	return bundleSymbolicName;
    }
	/**
     * @param bundleSymbolicName the bundleSymbolicName to set
     */
    public void setBundleSymbolicName(String bundleSymbolicName) {
    	this.bundleSymbolicName = bundleSymbolicName;
    }
	/**
     * @return the bundleName
     */
    public String getBundleName() {
    	return bundleName;
    }
	/**
     * @param bundleName the bundleName to set
     */
    public void setBundleName(String bundleName) {
    	this.bundleName = bundleName;
    }
	/**
     * @return the bundleVersion
     */
    public String getBundleVersion() {
    	return bundleVersion;
    }
	/**
     * @param bundleVersion the bundleVersion to set
     */
    public void setBundleVersion(String bundleVersion) {
    	this.bundleVersion = bundleVersion;
    }
	/**
     * @return the bundleDescription
     */
    public String getBundleDescription() {
    	return bundleDescription;
    }
	/**
     * @param bundleDescription the bundleDescription to set
     */
    public void setBundleDescription(String bundleDescription) {
    	this.bundleDescription = bundleDescription;
    }

	public List<String> getExportPackagesList() {
		if (exportPackagesList==null){
			exportPackagesList=new ArrayList<String>();
		}
		return exportPackagesList;
	}
	
	public void setExportPackagesList(List<String> exportPackagesList) {
		this.exportPackagesList = exportPackagesList;
	}
	private String getExportPackageListString(){
		String packages=null;
		for (String packageName : getExportPackagesList()) {
			if (packages==null){
				packages=packageName;
			}else{
				packages+= ","+packageName;
			}
		}
		return packages;
	}
	
	private String getImportPackageListString(){
		String imports=null;
		for (String packageName : getImportPackagesList()) {
			if (imports==null){
				imports=packageName;
			}else{
				imports+= ","+packageName;
			}
		}
		return imports;
	}
	
	private String getBundleClassPathListString(){
		String classPaths=null;
		for (String bundleClassPath : getBundleClassPath()) {
			String osgiCompatibleBundlePath = bundleClassPath.replace(File.separatorChar, '/');
			if (classPaths==null){
				classPaths=osgiCompatibleBundlePath;
			}else{
				classPaths+= ","+osgiCompatibleBundlePath;
			}
		}
		return classPaths;
	}
	
	public String toString() {
		String manifest = null;
		List<String> headerLines = getHeaderLines();
		for (String line : headerLines) {
			manifest=appendLine(manifest, line);    
        }
		manifest=appendLine(manifest, "\n\n");
		return manifest;
	}

	private List<String> getHeaderLines() {
		List<String> list=new ArrayList<String>();
		
		list.add(getManifestHeaderLine("Manifest-Version",getManifestVersion()));
		list.add(getManifestHeaderLine("Bundle-SymbolicName",getBundleSymbolicName()));
		list.add(getManifestHeaderLine("Bundle-Name",getBundleName()));
		list.add(getManifestHeaderLine("Bundle-Version",getEffectiveBundleVersion()));
		list.add(getManifestHeaderLine("Bundle-Description",getBundleDescription()));
		if (getBundleActivatorName()!=null){
			list.add(getManifestHeaderLine("Bundle-Activator",getBundleActivatorName()));
		}
		String exportPackageListString = getExportPackageListString();
		if (exportPackageListString!=null){
			list.add(getManifestHeaderLine("Export-Package",exportPackageListString));
		}
		String importPackageListString = getImportPackageListString();
		if (importPackageListString!=null){
			list.add(getManifestHeaderLine("Import-Package",importPackageListString));
		}
		String bundleClassPathListString = getBundleClassPathListString();
		if (bundleClassPathListString!=null){
			list.add(getManifestHeaderLine("Bundle-ClassPath",bundleClassPathListString));
		}
		if (getFragmentHost()!=null && !getFragmentHost().trim().equals("")){
			list.add(getManifestHeaderLine("Fragment-Host",getFragmentHost().trim()));			
		}
		if (isDynamicImports()){
			list.add(getManifestHeaderLine("DynamicImport-Package","*"));
		}
		list.addAll(getAdditionalHeaders());
		return list;
	}

	protected List<String> getAdditionalHeaders(){return new ArrayList<String>();}
	
	public String getTimestampedBundleVersion() {
	    return null;
    }
	
	public String getEffectiveBundleVersion(){
		if (getTimestampedBundleVersion()==null){
			return getBundleVersion();
		}else{
			return getTimestampedBundleVersion();
		}
	}
	
    protected String getDefaultName() {
	    return "MANIFEST.MF";
    }

	public List<String> getBundleClassPath() {
		if (bundleClassPath==null){
			bundleClassPath=new ArrayList<String>();
		}
	    return bundleClassPath;
    }

	public List<String> getImportPackagesList() {
		if (importPackagesList==null){
			importPackagesList=new ArrayList<String>();
		}
	    return importPackagesList;
    }

	public void setBundleActivatorName(String bundleActivatorName) {
	    this.bundleActivatorName = bundleActivatorName;
    }

	public String getBundleActivatorName() {
	    return bundleActivatorName;
    }
	public void setDynamicImports(boolean dynamicImports) {
		this.dynamicImports = dynamicImports;
	}
	public boolean isDynamicImports() {
		return dynamicImports;
	}
	public void setFragmentHost(String fragmentHost) {
		this.fragmentHost = fragmentHost;
	}
	public String getFragmentHost() {
		return fragmentHost;
	}
}