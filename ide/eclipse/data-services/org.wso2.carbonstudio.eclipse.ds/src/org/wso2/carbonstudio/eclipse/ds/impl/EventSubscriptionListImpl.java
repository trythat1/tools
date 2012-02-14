/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.ds.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.wso2.carbonstudio.eclipse.ds.DsPackage;
import org.wso2.carbonstudio.eclipse.ds.EventSubscriptionList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Subscription List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.EventSubscriptionListImpl#getSubscription <em>Subscription</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventSubscriptionListImpl extends EObjectImpl implements EventSubscriptionList {
	/**
	 * The cached value of the '{@link #getSubscription() <em>Subscription</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscription()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> subscription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventSubscriptionListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsPackage.Literals.EVENT_SUBSCRIPTION_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getSubscription() {
		if (subscription == null) {
			subscription = new EObjectContainmentEList<EObject>(EObject.class, this, DsPackage.EVENT_SUBSCRIPTION_LIST__SUBSCRIPTION);
		}
		return subscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsPackage.EVENT_SUBSCRIPTION_LIST__SUBSCRIPTION:
				return ((InternalEList<?>)getSubscription()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsPackage.EVENT_SUBSCRIPTION_LIST__SUBSCRIPTION:
				return getSubscription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DsPackage.EVENT_SUBSCRIPTION_LIST__SUBSCRIPTION:
				getSubscription().clear();
				getSubscription().addAll((Collection<? extends EObject>)newValue);
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
			case DsPackage.EVENT_SUBSCRIPTION_LIST__SUBSCRIPTION:
				getSubscription().clear();
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
			case DsPackage.EVENT_SUBSCRIPTION_LIST__SUBSCRIPTION:
				return subscription != null && !subscription.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventSubscriptionListImpl
