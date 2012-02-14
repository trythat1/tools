package org.wso2.carbonstudio.eclipse.artifact.sequence.validators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.wso2.carbonstudio.eclipse.platform.core.model.AbstractListDataProvider;
import org.wso2.carbonstudio.eclipse.platform.core.project.model.ProjectDataModel;
import org.wso2.carbonstudio.eclipse.platform.core.templates.ArtifactTemplate;
import org.wso2.carbonstudio.eclipse.platform.core.templates.ArtifactTemplateHandler;
import org.wso2.carbonstudio.eclipse.platform.core.utils.CSProviderConstants;
import org.wso2.carbonstudio.eclipse.platform.core.utils.CarbonStudioProviderUtils;
import org.wso2.carbonstudio.eclipse.esb.core.utils.ESBMediaTypeConstants;

public class SequenceTemplate extends AbstractListDataProvider{

	private static ArtifactTemplate[] artifactTemplates;
	
	static {
		Map<String,List<String>> filters=new HashMap<String,List<String>> ();
		CarbonStudioProviderUtils.addFilter(filters,CSProviderConstants.FILTER_MEDIA_TYPE,
				ESBMediaTypeConstants.MEDIA_TYPE_SEQUENCE);
		setArtifactTemplates(ArtifactTemplateHandler.getArtifactTemplates(filters));
	}
	
	public List<ListData> getListData(String modelProperty,
			ProjectDataModel model) {
		List<ListData> data = new ArrayList<ListData>();
		if (modelProperty.equals("ep.type")){
			for (ArtifactTemplate template : getArtifactTemplates()) {
				data.add(new EndpointListData(template.getName(), template));
			}
		}
		return data;
	}
	
	public static void setArtifactTemplates(ArtifactTemplate[] artifactTemplates) {
		SequenceTemplate.artifactTemplates = artifactTemplates;
	}

	public static ArtifactTemplate[] getArtifactTemplates() {
		return artifactTemplates;
	}

	public class EndpointListData extends ListData{

		public EndpointListData(String caption, Object data) {
			super(caption, data);
		}
		
		
		public boolean equals(Object data) {
			if (data==getData()){
				return true;
			}else if (data==null){
				return false;
			}else if (getData()==null){
				return false;
			}else{
				return ((ArtifactTemplate)data).getId().equals(((ArtifactTemplate)getArtifactTemplate()).getId());
			}
		}
		
		public ArtifactTemplate getArtifactTemplate(){
			return (ArtifactTemplate)getData();
		}
	}

}
