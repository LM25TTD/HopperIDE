/**
 */
package com.hopper.portugol;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.hopper.portugol.Model#getMain <em>Main</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.hopper.portugol.PortugolPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main</em>' containment reference.
   * @see #setMain(Programa)
   * @see com.hopper.portugol.PortugolPackage#getModel_Main()
   * @model containment="true"
   * @generated
   */
  Programa getMain();

  /**
   * Sets the value of the '{@link com.hopper.portugol.Model#getMain <em>Main</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main</em>' containment reference.
   * @see #getMain()
   * @generated
   */
  void setMain(Programa value);

} // Model
