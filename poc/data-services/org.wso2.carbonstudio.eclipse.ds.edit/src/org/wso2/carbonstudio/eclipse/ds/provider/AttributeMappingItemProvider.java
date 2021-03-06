/* Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
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
package org.wso2.carbonstudio.eclipse.ds.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.wso2.carbonstudio.eclipse.ds.AttributeMapping;
import org.wso2.carbonstudio.eclipse.ds.DsPackage;
import org.wso2.carbonstudio.eclipse.ds.provider.choiceListProvider.DSPropertyDescriptor;

/**
 * This is the item provider adapter for a
 * {@link org.wso2.carbonstudio.eclipse.ds.AttributeMapping} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class AttributeMappingItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AttributeMappingItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAttributeNamePropertyDescriptor(object);
			addColumnNamePropertyDescriptor(object);
			addQueryParamPropertyDescriptor(object);
			addRequiredRolesPropertyDescriptor(object);
			addXsdTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Attribute Name feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	protected void addAttributeNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_AttributeMapping_attributeName_feature_display"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AttributeMapping_attributeName_feature", "_UI_AttributeMapping_type"),
				DsPackage.Literals.ATTRIBUTE_MAPPING__ATTRIBUTE_NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Column Name feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	protected void addColumnNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_AttributeMapping_columnName_feature_display"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AttributeMapping_columnName_feature", "_UI_AttributeMapping_type"),
				DsPackage.Literals.ATTRIBUTE_MAPPING__COLUMN_NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Query Param feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addQueryParamPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_AttributeMapping_queryParam_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AttributeMapping_queryParam_feature", "_UI_AttributeMapping_type"),
				DsPackage.Literals.ATTRIBUTE_MAPPING__QUERY_PARAM, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Required Roles feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	protected void addRequiredRolesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_AttributeMapping_requiredRoles_feature_display"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AttributeMapping_requiredRoles_feature", "_UI_AttributeMapping_type"),
				DsPackage.Literals.ATTRIBUTE_MAPPING__REQUIRED_ROLES, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Xsd Type feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	protected void addXsdTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new DSPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_AttributeMapping_xsdType_feature_display"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AttributeMapping_xsdType_feature", "_UI_AttributeMapping_type"),
				DsPackage.Literals.ATTRIBUTE_MAPPING__XSD_TYPE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null,
				DSPropertyDescriptor.xsdType));
	}

	/**
	 * This returns AttributeMapping.gif. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated_not
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AttributeMapping"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated_not
	 */
	@Override
	public String getText(Object object) {
		String label = ((AttributeMapping) object).getAttributeName();
		String type = " (" + getString("_UI_AttributeMapping_type") + ")";
		return label != null ? label.toString() + type : type;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AttributeMapping.class)) {
		case DsPackage.ATTRIBUTE_MAPPING__ATTRIBUTE_NAME:
		case DsPackage.ATTRIBUTE_MAPPING__COLUMN_NAME:
		case DsPackage.ATTRIBUTE_MAPPING__QUERY_PARAM:
		case DsPackage.ATTRIBUTE_MAPPING__REQUIRED_ROLES:
		case DsPackage.ATTRIBUTE_MAPPING__XSD_TYPE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
					false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DsEditPlugin.INSTANCE;
	}

}
