/**
 * generated by Xtext 2.9.0
 */
package org.hopper.language.portugol;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Case Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hopper.language.portugol.SwitchCaseStatement#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.hopper.language.portugol.SwitchCaseStatement#getCaseList <em>Case List</em>}</li>
 *   <li>{@link org.hopper.language.portugol.SwitchCaseStatement#getOtherCase <em>Other Case</em>}</li>
 * </ul>
 *
 * @see org.hopper.language.portugol.PortugolPackage#getSwitchCaseStatement()
 * @model
 * @generated
 */
public interface SwitchCaseStatement extends AbstractCommand
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(VarName)
   * @see org.hopper.language.portugol.PortugolPackage#getSwitchCaseStatement_Variable()
   * @model
   * @generated
   */
  VarName getVariable();

  /**
   * Sets the value of the '{@link org.hopper.language.portugol.SwitchCaseStatement#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VarName value);

  /**
   * Returns the value of the '<em><b>Case List</b></em>' containment reference list.
   * The list contents are of type {@link org.hopper.language.portugol.CaseList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case List</em>' containment reference list.
   * @see org.hopper.language.portugol.PortugolPackage#getSwitchCaseStatement_CaseList()
   * @model containment="true"
   * @generated
   */
  EList<CaseList> getCaseList();

  /**
   * Returns the value of the '<em><b>Other Case</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Other Case</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Other Case</em>' containment reference.
   * @see #setOtherCase(OtherCase)
   * @see org.hopper.language.portugol.PortugolPackage#getSwitchCaseStatement_OtherCase()
   * @model containment="true"
   * @generated
   */
  OtherCase getOtherCase();

  /**
   * Sets the value of the '{@link org.hopper.language.portugol.SwitchCaseStatement#getOtherCase <em>Other Case</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Other Case</em>' containment reference.
   * @see #getOtherCase()
   * @generated
   */
  void setOtherCase(OtherCase value);

} // SwitchCaseStatement