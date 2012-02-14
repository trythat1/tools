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
package org.wso2.carbonstudio.eclipse.esb.mediators;

import org.wso2.carbonstudio.eclipse.esb.Mediator;
import org.wso2.carbonstudio.eclipse.esb.RegistryKeyProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spring Mediator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediators.SpringMediator#getBeanName <em>Bean Name</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.esb.mediators.SpringMediator#getConfigurationKey <em>Configuration Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.wso2.carbonstudio.eclipse.esb.mediators.MediatorsPackage#getSpringMediator()
 * @model
 * @generated
 */
public interface SpringMediator extends Mediator {
	/**
     * Returns the value of the '<em><b>Bean Name</b></em>' attribute.
     * The default value is <code>"bean_name"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bean Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Bean Name</em>' attribute.
     * @see #setBeanName(String)
     * @see org.wso2.carbonstudio.eclipse.esb.mediators.MediatorsPackage#getSpringMediator_BeanName()
     * @model default="bean_name"
     * @generated
     */
	String getBeanName();

	/**
     * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediators.SpringMediator#getBeanName <em>Bean Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bean Name</em>' attribute.
     * @see #getBeanName()
     * @generated
     */
	void setBeanName(String value);

	/**
     * Returns the value of the '<em><b>Configuration Key</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Configuration Key</em>' containment reference.
     * @see #setConfigurationKey(RegistryKeyProperty)
     * @see org.wso2.carbonstudio.eclipse.esb.mediators.MediatorsPackage#getSpringMediator_ConfigurationKey()
     * @model containment="true"
     * @generated
     */
	RegistryKeyProperty getConfigurationKey();

	/**
     * Sets the value of the '{@link org.wso2.carbonstudio.eclipse.esb.mediators.SpringMediator#getConfigurationKey <em>Configuration Key</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Configuration Key</em>' containment reference.
     * @see #getConfigurationKey()
     * @generated
     */
	void setConfigurationKey(RegistryKeyProperty value);

} // SpringMediator
