/**
 * generated by Xtext 2.9.0
 */
package org.hopper.language.portugol;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hopper.language.portugol.Expression#getFbName <em>Fb Name</em>}</li>
 *   <li>{@link org.hopper.language.portugol.Expression#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @see org.hopper.language.portugol.PortugolPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends AbstractCommand
{
  /**
   * Returns the value of the '<em><b>Fb Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fb Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fb Name</em>' reference.
   * @see #setFbName(EObject)
   * @see org.hopper.language.portugol.PortugolPackage#getExpression_FbName()
   * @model
   * @generated
   */
  EObject getFbName();

  /**
   * Sets the value of the '{@link org.hopper.language.portugol.Expression#getFbName <em>Fb Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fb Name</em>' reference.
   * @see #getFbName()
   * @generated
   */
  void setFbName(EObject value);

  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference.
   * @see #setParam(WriteParam)
   * @see org.hopper.language.portugol.PortugolPackage#getExpression_Param()
   * @model containment="true"
   * @generated
   */
  WriteParam getParam();

  /**
   * Sets the value of the '{@link org.hopper.language.portugol.Expression#getParam <em>Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' containment reference.
   * @see #getParam()
   * @generated
   */
  void setParam(WriteParam value);

} // Expression
