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
package org.wso2.carbonstudio.eclipse.esb.mediator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Rule Result Value Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.wso2.carbonstudio.eclipse.esb.mediator.MediatorPackage#getRuleResultValueType()
 * @model
 * @generated
 */
public enum RuleResultValueType implements Enumerator {
	/**
	 * The '<em><b>LITERAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITERAL_VALUE
	 * @generated
	 * @ordered
	 */
	LITERAL(0, "LITERAL", "LITERAL"),

	/**
	 * The '<em><b>EXPRESSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	EXPRESSION(1, "EXPRESSION", "EXPRESSION"),

	/**
	 * The '<em><b>REGISTRY REFERENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGISTRY_REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	REGISTRY_REFERENCE(3, "REGISTRY_REFERENCE", "REGISTRY_REFERENCE");

	/**
	 * The '<em><b>LITERAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LITERAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LITERAL_VALUE = 0;

	/**
	 * The '<em><b>EXPRESSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXPRESSION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPRESSION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPRESSION_VALUE = 1;

	/**
	 * The '<em><b>REGISTRY REFERENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REGISTRY REFERENCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGISTRY_REFERENCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRY_REFERENCE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Rule Result Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RuleResultValueType[] VALUES_ARRAY =
		new RuleResultValueType[] {
			LITERAL,
			EXPRESSION,
			REGISTRY_REFERENCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Rule Result Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RuleResultValueType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Rule Result Value Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RuleResultValueType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RuleResultValueType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rule Result Value Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RuleResultValueType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RuleResultValueType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rule Result Value Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RuleResultValueType get(int value) {
		switch (value) {
			case LITERAL_VALUE: return LITERAL;
			case EXPRESSION_VALUE: return EXPRESSION;
			case REGISTRY_REFERENCE_VALUE: return REGISTRY_REFERENCE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RuleResultValueType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RuleResultValueType
