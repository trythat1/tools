/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbonstudio.eclipse.greg.manager.remote.views;

import java.text.SimpleDateFormat;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.part.ViewPart;
import org.wso2.carbon.registry.core.Resource;
import org.wso2.carbonstudio.eclipse.greg.base.core.Registry;
import org.wso2.carbonstudio.eclipse.greg.base.editor.input.ResourceEditorInput;
import org.wso2.carbonstudio.eclipse.greg.base.interfaces.IRegistryFormEditorPage;
import org.wso2.carbonstudio.eclipse.greg.base.interfaces.RegistryInformationEditorObservable;
import org.wso2.carbonstudio.eclipse.greg.base.interfaces.RegistryItemSelectionListener;
import org.wso2.carbonstudio.eclipse.greg.base.managers.RemoteContentManager;
import org.wso2.carbonstudio.eclipse.greg.base.model.RegistryResourceNode;
import org.wso2.carbonstudio.eclipse.greg.base.model.RegistryResourceType;
import org.wso2.carbonstudio.eclipse.greg.base.ui.editor.RegistryResourceEditor;
import org.wso2.carbonstudio.eclipse.greg.base.ui.util.ImageUtils;
import org.wso2.carbonstudio.eclipse.greg.base.ui.util.SWTControlUtils;
import org.wso2.carbonstudio.eclipse.greg.core.exception.InvalidRegistryURLException;
import org.wso2.carbonstudio.eclipse.greg.core.exception.UnknownRegistryException;
import org.wso2.carbonstudio.eclipse.greg.manager.remote.Activator;
import org.wso2.carbonstudio.eclipse.logging.core.ICarbonStudioLog;
import org.wso2.carbonstudio.eclipse.logging.core.Logger;
import org.wso2.carbonstudio.eclipse.platform.ui.utils.MessageDialogUtils;

public class ResourceInfoViewer extends ViewPart implements
		RegistryItemSelectionListener, Observer {
	private static ICarbonStudioLog log=Logger.getLog(Activator.PLUGIN_ID);

	TabFolder tabFolder;
	private RegistryResourceNode registryResourcePathData;
	TabItem tabPageGeneralInfo;
	private Action actionRefresh;
	private Action modifyInfo;
	private Label lblNoData;
	
	private Label lblValue1;
	private Label lblValue2;
	private Label lblValue3;
	private Label lblValue4;
	private Label lblValue5;
	private Label lblValue6;
	private Label lblValue7;
	private Label lblValue8;
	private Label lblValue9;
	private Label lblValue10;
	private Label lblValue11;

	public void createPartControl(Composite parent) {
		tabFolder = new TabFolder(parent, SWT.BORDER);
		RegistryBrowserView.setResourceInfoViewer(this);
		tabFolder.setBackground(tabFolder.getDisplay().getSystemColor(
				SWT.COLOR_WHITE));
		createTabPages();
		createToolbar();
		tabFolder.addSelectionListener(new SelectionListener() {

			public void widgetDefaultSelected(SelectionEvent arg0) {
				decideToolBarButtons();
			}

			public void widgetSelected(SelectionEvent arg0) {
				decideToolBarButtons();
			}

		});
		lblNoData = new Label(tabFolder, SWT.CENTER);
		lblNoData.setBackground(tabFolder.getBackground());
//		lblNoData
//				.setText("Please double click on a registry resource/collection in registry browser viewer");
		decideToolBarButtons();
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		composite.setBackground(tabFolder.getBackground());
		GridLayout gridLayout = new GridLayout(2, false);
		gridLayout.marginWidth = 20;
		composite.setLayout(gridLayout);
		
		String[] names = new String[] { "Url: ", "Path: ","Media Type: ","Description: ", "Created Date: ",
		                				"Last Modified Date: ","Current Version: ","Current Life Cycle:", "Life Cycle State:","My Rating: ", "Average Rating: " };

		generateControls(composite, names);
		
		try {
			updateMe();
		} catch (Exception e) {
			log.error(e);
			MessageDialogUtils.error(getSite().getShell(), e);
		}
	}
	
	private GridData getGridData(){
		GridData gd=new GridData();
		gd.minimumWidth=50;
		gd.widthHint=GridData.FILL_HORIZONTAL;
		gd.grabExcessHorizontalSpace=true;
		return gd;
	}

	protected void generateControls(Composite composite, String[] names) {
	    SWTControlUtils.createLabel(composite, SWT.NONE, names[0],
		        					new GridData(), composite.getBackground(), new Font(null,
		        							"", 8, SWT.BOLD));
		lblValue1=SWTControlUtils.createLabel(composite, SWT.NONE, "",
		                  					getGridData(), composite.getBackground(), null);
		
	    SWTControlUtils.createLabel(composite, SWT.NONE, names[1],
		        					new GridData(), composite.getBackground(), new Font(null,
		        							"", 8, SWT.BOLD));
		lblValue2=SWTControlUtils.createLabel(composite, SWT.NONE, "",
		                                      getGridData(), composite.getBackground(), null);
		
	    SWTControlUtils.createLabel(composite, SWT.NONE, names[2],
		        					new GridData(), composite.getBackground(), new Font(null,
		        							"", 8, SWT.BOLD));
		lblValue3=SWTControlUtils.createLabel(composite, SWT.NONE, "",
		                                      getGridData(), composite.getBackground(), null);
		
	    SWTControlUtils.createLabel(composite, SWT.NONE, names[3],
		        					new GridData(), composite.getBackground(), new Font(null,
		        							"", 8, SWT.BOLD));
		lblValue4=SWTControlUtils.createLabel(composite, SWT.NONE, "",
		                                      getGridData(), composite.getBackground(), null);
		
	    SWTControlUtils.createLabel(composite, SWT.NONE, names[4],
		        					new GridData(), composite.getBackground(), new Font(null,
		        							"", 8, SWT.BOLD));
		lblValue5=SWTControlUtils.createLabel(composite, SWT.NONE, "",
		                                      getGridData(), composite.getBackground(), null);
		
	    SWTControlUtils.createLabel(composite, SWT.NONE, names[5],
		        					new GridData(), composite.getBackground(), new Font(null,
		        							"", 8, SWT.BOLD));
		lblValue6=SWTControlUtils.createLabel(composite, SWT.NONE, "",
		                                      getGridData(), composite.getBackground(), null);
		
	    SWTControlUtils.createLabel(composite, SWT.NONE, names[6],
		        					new GridData(), composite.getBackground(), new Font(null,
		        							"", 8, SWT.BOLD));
		lblValue7=SWTControlUtils.createLabel(composite, SWT.NONE, "",
		                                      getGridData(), composite.getBackground(), null);
		
	    SWTControlUtils.createLabel(composite, SWT.NONE, names[7],
		        					new GridData(), composite.getBackground(), new Font(null,
		        							"", 8, SWT.BOLD));
		lblValue8=SWTControlUtils.createLabel(composite, SWT.NONE, "",
		                                      getGridData(), composite.getBackground(), null);
		
	    SWTControlUtils.createLabel(composite, SWT.NONE, names[8],
		        					new GridData(), composite.getBackground(), new Font(null,
		        							"", 8, SWT.BOLD));
		lblValue9=SWTControlUtils.createLabel(composite, SWT.NONE, "",
		                                      getGridData(), composite.getBackground(), null);
		
		SWTControlUtils.createLabel(composite, SWT.NONE, names[9], new GridData(),
		                            composite.getBackground(), new Font(null, "", 8, SWT.BOLD));
		lblValue10 =
		             SWTControlUtils.createLabel(composite, SWT.NONE, "", getGridData(),
		                                         composite.getBackground(), null);

		SWTControlUtils.createLabel(composite, SWT.NONE, names[10], new GridData(),
		                            composite.getBackground(), new Font(null, "", 8, SWT.BOLD));
		lblValue11 =
		             SWTControlUtils.createLabel(composite, SWT.NONE, "", getGridData(),
		                                         composite.getBackground(), null);
			       
		tabPageGeneralInfo.setControl(composite);
			        					        		
    }

	private void createTabPages() {
		tabPageGeneralInfo = new TabItem(tabFolder, SWT.NULL);
		tabPageGeneralInfo.setText("Information");
	}

	public void setFocus() {
	}

	public void setSelectionChanged(
			RegistryResourceNode selectedRegistryResourcePathData) {
		setRegistryResourcePathData(selectedRegistryResourcePathData);
	}

	private void updateInfo() throws InvalidRegistryURLException, UnknownRegistryException{
		updateGeneralInfo();
	}


	private void setBlankPage(TabItem tabpage) {
		tabpage.setControl(lblNoData);
	}
	
	private String getVersion(RegistryResourceNode regResourceNode){
		String version = "";
		try {
//			Format of a version result is "/_system/registry-info.xml;version:72". Hence decoded in the following manner.
            version =
            	regResourceNode.getConnectionInfo().getRegistry()
                                     .getVersions(regResourceNode.getRegistryResourcePath())[0].split(";")[1].split(":")[1];
        } catch (Exception e) {
        	//This is removed since it is expected if the collection/resource does not have versions.
//        	log.error(e);
        }
        
		if (version == "") {
			return "No Versions available for this resource";
		} else {
			return version;
		}
	
	}

	private void updateGeneralInfo() throws InvalidRegistryURLException, UnknownRegistryException{
		if (getRegistryResourcePathData() != null) {
			SimpleDateFormat formatter = new SimpleDateFormat("d MMM yyyy H:mm:ss");
			String path = getRegistryResourcePathData().getRegistryResourcePath();
			Registry registry = getRegistryResourcePathData().getConnectionInfo().getRegistry();
			int rating =
			             registry.getRating(path, getRegistryResourcePathData().getConnectionInfo()
			                                                                   .getUsername());
			float averageRating = registry.getAverageRating(path);
			Resource resource = registry.get(path);
			String[] values =
			                  new String[] {
			                                getRegistryResourcePathData().getConnectionInfo()
			                                                             .getUrl().toString(),
			                                path,
			                                resource.getMediaType() == null
			                                                               ? "Not Specified"
			                                                               : resource.getMediaType(),
			                                resource.getDescription(),
			                                "By " + resource.getAuthorUserName() + " " +
			                                        formatter.format(resource.getCreatedTime()),
			                                "By " + resource.getLastUpdaterUserName() + " " +
			                                        formatter.format(resource.getLastModified()),
			                                getVersion(getRegistryResourcePathData()),
			                                registry.getLifeCycleName(resource),
			                                registry.getLifeCycleState(resource),
			                                Integer.toString(rating), Float.toString(averageRating) };

			updateViewValues(values);
		}

	}

	private void updateViewValues(String[] values) {
	    lblValue1.setText(values[0]);
	    lblValue2.setText(values[1]);
	    lblValue3.setText(values[2]);
	    lblValue4.setText(values[3]);
	    lblValue5.setText(values[4]);
	    lblValue6.setText(values[5]);
	    lblValue7.setText(values[6]);
	    lblValue8.setText(values[7]);
	    lblValue9.setText(values[8]);
	    lblValue10.setText(values[9]);
	    lblValue11.setText(values[10]);
    }

	public void updateMe() throws InvalidRegistryURLException, UnknownRegistryException {
		updateInfo();
		decideToolBarButtons();
	}

	private void createToolbar() {
		actionRefresh = new Action("Refresh") {
			public void run() {
				try {
					updateMe();
				} catch (Exception e) {
					log.error(e);
				}
			}
		};
		actionRefresh.setImageDescriptor(ImageUtils
				.getImageDescriptor(ImageUtils.ACTION_REFERESH));
		
		modifyInfo = new Action("Modify Info") {
			public void run(){
				RegistryResourceNode r = getRegistryResourcePathData();
				RegistryResourceEditor openFormEditor = getRegistryResourceEditor(r);
				// RemoteContentManager.openFormEditor(ei);
//				RegistryResourceEditor openFormEditor = RemoteContentManager.openFormEditor(ei);
				if(r.getResourceType()==RegistryResourceType.RESOURCE){
					openFormEditor.performAction(IRegistryFormEditorPage.PAGE_RESOURCE,
					                             IRegistryFormEditorPage.ACTION_VIEW_INFORMATION, 
					                             null);
				}else{
					openFormEditor.performAction(IRegistryFormEditorPage.PAGE_COLLECTION,
					                             IRegistryFormEditorPage.ACTION_VIEW_INFORMATION, 
					                             null);
				}
			}
		};
		modifyInfo.setImageDescriptor(ImageUtils.getImageDescriptor(ImageUtils.ICON_INFORMATION));
		

	}
	
	private RegistryResourceEditor getRegistryResourceEditor(RegistryResourceNode r) {
		ResourceEditorInput ei = RemoteContentManager.getEditorInput(r);
		RegistryResourceEditor openFormEditor = RemoteContentManager.openFormEditor(ei);
		openFormEditor.getRegInforChangeObservable().addObserver(this);
		return openFormEditor;
	}

	private void showToolBarButtons(Action[] actions) {
		IToolBarManager mgr = getViewSite().getActionBars().getToolBarManager();
		mgr.removeAll();
		for (Action action : actions) {
			mgr.add(action);
		}
		mgr.update(true);
	}

	private void decideToolBarButtons() {
		int selectionIndex = tabFolder.getSelectionIndex();
		TabItem item = tabFolder.getItem(selectionIndex);
		if (getRegistryResourcePathData() == null)
			showToolBarButtons(new Action[] {});
		else if (item == tabPageGeneralInfo){
			showToolBarButtons(new Action[] { actionRefresh , modifyInfo});
		}

	}

	public void setRegistryResourcePathData(
			RegistryResourceNode registryResourcePathData) {
		this.registryResourcePathData = registryResourcePathData;
	}

	public RegistryResourceNode getRegistryResourcePathData() {
		return registryResourcePathData;
	}

	public void update(Observable o, Object arg) {
		if (o instanceof RegistryInformationEditorObservable) {
			RegistryInformationEditorObservable r = (RegistryInformationEditorObservable) o;
			setRegistryResourcePathData(r.getRegResourceNode());
			Display.getDefault().asyncExec(new Runnable(){
				public void run() {
					try {
						updateMe();
					} catch (InvalidRegistryURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (UnknownRegistryException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}});
				
		} 
		
	
		
	}

}
