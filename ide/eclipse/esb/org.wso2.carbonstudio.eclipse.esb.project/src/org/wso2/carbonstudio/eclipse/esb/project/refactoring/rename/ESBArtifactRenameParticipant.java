/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbonstudio.eclipse.esb.project.refactoring.rename;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.PerformChangeOperation;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.TextChange;
import org.eclipse.ltk.core.refactoring.TextEditBasedChange;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.RenameArguments;
import org.eclipse.ltk.core.refactoring.participants.RenameParticipant;
import org.eclipse.ltk.core.refactoring.resource.RenameResourceChange;
import org.wso2.carbonstudio.eclipse.utils.file.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ESBArtifactRenameParticipant extends RenameParticipant {
	private IFile originalFile;
	private String changedFileName;
	private IProject esbProject;
	private static List<String> skipList;

	@Override
	public RefactoringStatus checkConditions(IProgressMonitor arg0, CheckConditionsContext arg1)
	                                                                                            throws OperationCanceledException {
		// Conditions to check
		
		// 1. Newly renamed file cannot already exist in the project
		// 2. Renamed file cannot be equal to the project name itself (to avoid
		// maven build issues)

		if (originalFile != null) {
			List<String> matchinFilesList = new ArrayList<String>();			
			skipList=new ArrayList<String>();
			skipList.add("target");
			skipList.add("bin");
			skipList.add(".svn");
			
			FileUtils.getAllExactMatchingFiles(esbProject.getLocation().toOSString(),
			                                   changedFileName.substring(0,
			                                                             changedFileName.lastIndexOf(".")),
			                                   changedFileName.substring(changedFileName.lastIndexOf(".") + 1),
			                                   matchinFilesList,skipList);

			if (!matchinFilesList.isEmpty()) {
				return RefactoringStatus.createFatalErrorStatus("An ESB Artifact already exist with the same name " +
				                                                changedFileName +
				                                                " in the project " +
				                                                esbProject.getName());
			} else if (changedFileName.substring(0, changedFileName.lastIndexOf("."))
			                          .equalsIgnoreCase(esbProject.getName())) {
				return RefactoringStatus.createFatalErrorStatus("You are trying to rename your ESB Artifact to have the project name.");
			}

			return RefactoringStatus.createInfoStatus("You are about the rename your ESB Artifact " +
			                                          originalFile.getName() +
			                                          " to " +
			                                          changedFileName);
		}

		return RefactoringStatus.createFatalErrorStatus("You are trying to rename a different resource than a file");
	}
	
	

	@Override
	public Change createChange(IProgressMonitor arg0) throws CoreException,
	                                                 OperationCanceledException {
//		This has to be a composite change since we have several changes to be made with in the same change.
		
		// Change the meta data file
		// change the pom file
		// change/update all the references to this endpoint
		CompositeChange change=new CompositeChange("ESB Artifact Rename");
		String originalFileNamewithExtension = originalFile.getName();
//		change.add(new ESBMetaDataFileChange("Renaming ESB Artifact "+originalFile.getName().substring(0,originalFile.getName().length()-originalFile.getFileExtension().length()), originalFile, originalFileNamewithExtension.substring(0,originalFileNamewithExtension.length()-4),changedFileName.substring(0,changedFileName.length()-4)));
		change.add(new ESBMetaDataFileChange("Meta data file", esbProject.getFile("artifact.xml"),originalFileNamewithExtension.substring(0,originalFileNamewithExtension.length()-4),changedFileName.substring(0,changedFileName.length()-4)));
//		change.add(new ESBMetaDataFileChange("Meta data file", esbProject.getFile("pom.xml")));
		
//		change.add(new RenameResourceChange(originalFile.getLocation(), changedFileName));
		@SuppressWarnings("unused")
        Object[] affectedObjects = change.getAffectedObjects();
		
		return change;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean initialize(Object arg0) {
		// Similar to check initial conditions

		if (arg0 instanceof IFile) {
			originalFile = (IFile) arg0;
			esbProject = originalFile.getProject();
			RenameArguments arguments = getArguments();
			changedFileName = arguments.getNewName();
			return true;
		}
		return false;
	}

}
