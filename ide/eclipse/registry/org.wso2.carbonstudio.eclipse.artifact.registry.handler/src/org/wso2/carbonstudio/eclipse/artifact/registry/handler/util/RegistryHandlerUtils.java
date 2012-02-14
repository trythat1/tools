package org.wso2.carbonstudio.eclipse.artifact.registry.handler.util;

import java.io.File;
import java.io.IOException;
import java.text.CharacterIterator;
import java.text.MessageFormat;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.wso2.carbonstudio.eclipse.artifact.registry.handler.util.HandlerInfo.DataType;
import org.wso2.carbonstudio.eclipse.artifact.registry.handler.util.HandlerInfo.PropertyData;
import org.wso2.carbonstudio.eclipse.utils.jdt.ClassUtils;
import org.wso2.carbonstudio.eclipse.utils.jdt.JavaUtils;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

public class RegistryHandlerUtils {
	
	private static final String HANDLER_VAR_NAME="handler";
	private static final String FILTER_VAR_NAME="filter";
	
	public static File getActivatorJavaClass(File bundleContentLocation, HandlerInfo handlerInfo) throws IOException {
		String handlerFileContent = HandlerTemplateUtil.getInstance().getTemplateString("Activator.java");
		List<String> propertySetMethodCallList = getPropertySetMethodCallList(handlerInfo);
		String methodCallListString="\n";
		for (String methodCall : propertySetMethodCallList) {
			methodCallListString+=methodCall+"\n";
		}
		handlerFileContent = MessageFormat.format(handlerFileContent,
								new Object[] {
								handlerInfo.getHandlerClass(),
								ClassUtils.getClassName(handlerInfo.getHandlerClass()),
								handlerInfo.getFilterClass(),
								ClassUtils.getClassName(handlerInfo.getFilterClass()),
								filterMethodList((String[]) handlerInfo.getSelectedMethods().toArray(new String[] {})),
								methodCallListString,
								"{",
								"}",
								HANDLER_VAR_NAME,
								FILTER_VAR_NAME});
		File activatorClass = new File(bundleContentLocation, "Activator.java");
		FileUtils.writeContent(activatorClass, JavaCodeFormatter.format(handlerFileContent));
		return activatorClass;
	}
	
	public static List<String> getPropertySetMethodCallList(HandlerInfo handlerInfo) {
		List<String> propertySetMethodCallList=new ArrayList<String>();
		
		String objectVarName = FILTER_VAR_NAME;
		Map<String, PropertyData> filterProperties = handlerInfo.getFilterProperties();
		addPropertySetMethods(propertySetMethodCallList, objectVarName,
				filterProperties);
		objectVarName = HANDLER_VAR_NAME;
		Map<String, PropertyData> handlerProperties = handlerInfo.getHandlerProperties();
		addPropertySetMethods(propertySetMethodCallList, objectVarName,
				handlerProperties);
		return propertySetMethodCallList;
	}
	
	public static void addPropertySetMethods(List<String> propertySetMethodCallList,
			String objectVarName, Map<String, PropertyData> filterProperties) {
		boolean omVarCreated=false;
		boolean varCreated=false;
		for (String propertyName : filterProperties.keySet()) {
			PropertyData propertyData = filterProperties.get(propertyName);

			String methodCall = objectVarName + "." + JavaUtils.getSetMethod(propertyName);
			String dataVar;
			String data = backlashDoubler(propertyData.data).replaceAll("\"", "\\\\\"").replaceAll("\\n", "\\\\n\"+\n\t\t\"");
			if (propertyData.type==DataType.STRING){
				dataVar = objectVarName+"PropertyData";
				String variableToAssign=(!varCreated? "String ":"")+dataVar;
				propertySetMethodCallList.add(variableToAssign+" = \""+data+"\";");
				varCreated=true;
			}else{
				dataVar = objectVarName+"PropertyDataOMElement";
				String variableToAssign=(!omVarCreated? "OMElement ":"")+dataVar;
				propertySetMethodCallList.add(variableToAssign+" = getElement(\""+data+"\");");
				omVarCreated=true;
			}
			propertySetMethodCallList.add(methodCall + "(" + dataVar + ");");
		}
	}
	
	private static String backlashDoubler(String myStr){
	    final StringBuilder result = new StringBuilder();
	    final StringCharacterIterator iterator = new StringCharacterIterator(myStr);
	    char character =  iterator.current();
	    while (character != CharacterIterator.DONE ){
	     
	      if (character == '\\') {
	         result.append("\\\\");
	      }
	       else {
	        result.append(character);
	      }

	      
	      character = iterator.next();
	    }
	    return result.toString();
	  }
	
	private static String filterMethodList(String[] methodsList) {
		if (methodsList.length>0){
			String filterMethodsListString = " Filter." + methodsList[0];
			for (int i = 1; i < methodsList.length; i++) {
				filterMethodsListString += ", Filter." + methodsList[i];
			}
			return filterMethodsListString;
		}else{
			return "";
		}
	}

}

