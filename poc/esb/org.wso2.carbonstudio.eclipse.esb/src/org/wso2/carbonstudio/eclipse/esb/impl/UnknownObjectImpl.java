/*
 * Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
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
package org.wso2.carbonstudio.eclipse.esb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.w3c.dom.Element;
import org.wso2.carbonstudio.eclipse.esb.EndPoint;
import org.wso2.carbonstudio.eclipse.esb.EsbPackage;
import org.wso2.carbonstudio.eclipse.esb.Mediator;
import org.wso2.carbonstudio.eclipse.esb.UnknownObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unknown Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.impl.UnknownObjectImpl#isAnonymous <em>Anonymous</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.impl.UnknownObjectImpl#getEndpointName <em>Endpoint Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnknownObjectImpl extends ConfigurationElementImpl implements UnknownObject {
	/**
	 * The default value of the '{@link #isAnonymous() <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnonymous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANONYMOUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnonymous() <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnonymous()
	 * @generated
	 * @ordered
	 */
	protected boolean anonymous = ANONYMOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndpointName() <em>Endpoint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_NAME_EDEFAULT = "endpoint_name";

	/**
	 * The cached value of the '{@link #getEndpointName() <em>Endpoint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointName()
	 * @generated
	 * @ordered
	 */
	protected String endpointName = ENDPOINT_NAME_EDEFAULT;

	/**
	 * Serialized content.
	 */
	private Element serializedForm;
	
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected UnknownObjectImpl() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	public void doLoad(Element self) throws Exception {
		this.serializedForm = (Element) self.cloneNode(true);
	}

	/**
	 * {@inheritDoc}
	 */
	public Element doSave(Element parent) throws Exception {
		Element self = null;
		if (null != serializedForm) {
			self = (Element) parent.getOwnerDocument().importNode(serializedForm, true);
			
			// This is required to make it possible to work with
			// unknown elements declared with an explicit namespace.  
			String prefix = self.getPrefix();
			if (null != prefix && prefix.equals(DEFAULT_SYNAPSE_NAMESPACE_PREFIX)) {
				self.setAttribute(String.format("xmlns:%s", prefix), DEFAULT_SYNAPSE_NAMESPACE_URI);
			}
			
			parent.appendChild(self);
		}
		return (self != null) ? self : null;
	}
    
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return EsbPackage.Literals.UNKNOWN_OBJECT;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnonymous() {
		return anonymous;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymous(boolean newAnonymous) {
		boolean oldAnonymous = anonymous;
		anonymous = newAnonymous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.UNKNOWN_OBJECT__ANONYMOUS, oldAnonymous, anonymous));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndpointName() {
		return endpointName;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointName(String newEndpointName) {
		String oldEndpointName = endpointName;
		endpointName = newEndpointName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.UNKNOWN_OBJECT__ENDPOINT_NAME, oldEndpointName, endpointName));
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsbPackage.UNKNOWN_OBJECT__ANONYMOUS:
				return isAnonymous();
			case EsbPackage.UNKNOWN_OBJECT__ENDPOINT_NAME:
				return getEndpointName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EsbPackage.UNKNOWN_OBJECT__ANONYMOUS:
				setAnonymous((Boolean)newValue);
				return;
			case EsbPackage.UNKNOWN_OBJECT__ENDPOINT_NAME:
				setEndpointName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eUnset(int featureID) {
		switch (featureID) {
			case EsbPackage.UNKNOWN_OBJECT__ANONYMOUS:
				setAnonymous(ANONYMOUS_EDEFAULT);
				return;
			case EsbPackage.UNKNOWN_OBJECT__ENDPOINT_NAME:
				setEndpointName(ENDPOINT_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EsbPackage.UNKNOWN_OBJECT__ANONYMOUS:
				return anonymous != ANONYMOUS_EDEFAULT;
			case EsbPackage.UNKNOWN_OBJECT__ENDPOINT_NAME:
				return ENDPOINT_NAME_EDEFAULT == null ? endpointName != null : !ENDPOINT_NAME_EDEFAULT.equals(endpointName);
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EndPoint.class) {
			switch (derivedFeatureID) {
				case EsbPackage.UNKNOWN_OBJECT__ANONYMOUS: return EsbPackage.END_POINT__ANONYMOUS;
				case EsbPackage.UNKNOWN_OBJECT__ENDPOINT_NAME: return EsbPackage.END_POINT__ENDPOINT_NAME;
				default: return -1;
			}
		}
		if (baseClass == Mediator.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EndPoint.class) {
			switch (baseFeatureID) {
				case EsbPackage.END_POINT__ANONYMOUS: return EsbPackage.UNKNOWN_OBJECT__ANONYMOUS;
				case EsbPackage.END_POINT__ENDPOINT_NAME: return EsbPackage.UNKNOWN_OBJECT__ENDPOINT_NAME;
				default: return -1;
			}
		}
		if (baseClass == Mediator.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (anonymous: ");
		result.append(anonymous);
		result.append(", endpointName: ");
		result.append(endpointName);
		result.append(')');
		return result.toString();
	}

} //UnknownObjectImpl
