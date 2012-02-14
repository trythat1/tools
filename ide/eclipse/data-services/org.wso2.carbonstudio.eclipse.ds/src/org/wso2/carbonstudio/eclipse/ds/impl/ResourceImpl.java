/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.ds.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.wso2.carbonstudio.eclipse.ds.CallQuery;
import org.wso2.carbonstudio.eclipse.ds.DsPackage;
import org.wso2.carbonstudio.eclipse.ds.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.ResourceImpl#getCallQuery <em>Call Query</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.ResourceImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.ResourceImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.ResourceImpl#isReturnRequestStatus <em>Return Request Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceImpl extends EObjectImpl implements Resource {
	/**
	 * The cached value of the '{@link #getCallQuery() <em>Call Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallQuery()
	 * @generated
	 * @ordered
	 */
	protected CallQuery callQuery;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected String method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #isReturnRequestStatus() <em>Return Request Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnRequestStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETURN_REQUEST_STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReturnRequestStatus() <em>Return Request Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnRequestStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean returnRequestStatus = RETURN_REQUEST_STATUS_EDEFAULT;

	/**
	 * This is true if the Return Request Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean returnRequestStatusESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallQuery getCallQuery() {
		return callQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallQuery(CallQuery newCallQuery, NotificationChain msgs) {
		CallQuery oldCallQuery = callQuery;
		callQuery = newCallQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsPackage.RESOURCE__CALL_QUERY, oldCallQuery, newCallQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallQuery(CallQuery newCallQuery) {
		if (newCallQuery != callQuery) {
			NotificationChain msgs = null;
			if (callQuery != null)
				msgs = ((InternalEObject)callQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsPackage.RESOURCE__CALL_QUERY, null, msgs);
			if (newCallQuery != null)
				msgs = ((InternalEObject)newCallQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsPackage.RESOURCE__CALL_QUERY, null, msgs);
			msgs = basicSetCallQuery(newCallQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.RESOURCE__CALL_QUERY, newCallQuery, newCallQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(String newMethod) {
		String oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.RESOURCE__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.RESOURCE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReturnRequestStatus() {
		return returnRequestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnRequestStatus(boolean newReturnRequestStatus) {
		boolean oldReturnRequestStatus = returnRequestStatus;
		returnRequestStatus = newReturnRequestStatus;
		boolean oldReturnRequestStatusESet = returnRequestStatusESet;
		returnRequestStatusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.RESOURCE__RETURN_REQUEST_STATUS, oldReturnRequestStatus, returnRequestStatus, !oldReturnRequestStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReturnRequestStatus() {
		boolean oldReturnRequestStatus = returnRequestStatus;
		boolean oldReturnRequestStatusESet = returnRequestStatusESet;
		returnRequestStatus = RETURN_REQUEST_STATUS_EDEFAULT;
		returnRequestStatusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DsPackage.RESOURCE__RETURN_REQUEST_STATUS, oldReturnRequestStatus, RETURN_REQUEST_STATUS_EDEFAULT, oldReturnRequestStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReturnRequestStatus() {
		return returnRequestStatusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsPackage.RESOURCE__CALL_QUERY:
				return basicSetCallQuery(null, msgs);
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
			case DsPackage.RESOURCE__CALL_QUERY:
				return getCallQuery();
			case DsPackage.RESOURCE__METHOD:
				return getMethod();
			case DsPackage.RESOURCE__PATH:
				return getPath();
			case DsPackage.RESOURCE__RETURN_REQUEST_STATUS:
				return isReturnRequestStatus();
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
			case DsPackage.RESOURCE__CALL_QUERY:
				setCallQuery((CallQuery)newValue);
				return;
			case DsPackage.RESOURCE__METHOD:
				setMethod((String)newValue);
				return;
			case DsPackage.RESOURCE__PATH:
				setPath((String)newValue);
				return;
			case DsPackage.RESOURCE__RETURN_REQUEST_STATUS:
				setReturnRequestStatus((Boolean)newValue);
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
			case DsPackage.RESOURCE__CALL_QUERY:
				setCallQuery((CallQuery)null);
				return;
			case DsPackage.RESOURCE__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case DsPackage.RESOURCE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case DsPackage.RESOURCE__RETURN_REQUEST_STATUS:
				unsetReturnRequestStatus();
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
			case DsPackage.RESOURCE__CALL_QUERY:
				return callQuery != null;
			case DsPackage.RESOURCE__METHOD:
				return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
			case DsPackage.RESOURCE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case DsPackage.RESOURCE__RETURN_REQUEST_STATUS:
				return isSetReturnRequestStatus();
		}
		return super.eIsSet(featureID);
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
		result.append(" (method: ");
		result.append(method);
		result.append(", path: ");
		result.append(path);
		result.append(", returnRequestStatus: ");
		if (returnRequestStatusESet) result.append(returnRequestStatus); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
