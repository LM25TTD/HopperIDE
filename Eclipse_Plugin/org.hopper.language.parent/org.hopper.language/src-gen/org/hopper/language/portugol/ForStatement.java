/**
 * generated by Xtext 2.9.0
 */
package org.hopper.language.portugol;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hopper.language.portugol.ForStatement#getOperatorExpr <em>Operator Expr</em>}</li>
 *   <li>{@link org.hopper.language.portugol.ForStatement#getStartExpr <em>Start Expr</em>}</li>
 *   <li>{@link org.hopper.language.portugol.ForStatement#getEndExpr <em>End Expr</em>}</li>
 *   <li>{@link org.hopper.language.portugol.ForStatement#getStepExpe <em>Step Expe</em>}</li>
 *   <li>{@link org.hopper.language.portugol.ForStatement#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see org.hopper.language.portugol.PortugolPackage#getForStatement()
 * @model
 * @generated
 */
public interface ForStatement extends AbstractCommand
{
  /**
   * Returns the value of the '<em><b>Operator Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator Expr</em>' containment reference.
   * @see #setOperatorExpr(Expression)
   * @see org.hopper.language.portugol.PortugolPackage#getForStatement_OperatorExpr()
   * @model containment="true"
   * @generated
   */
  Expression getOperatorExpr();

  /**
   * Sets the value of the '{@link org.hopper.language.portugol.ForStatement#getOperatorExpr <em>Operator Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator Expr</em>' containment reference.
   * @see #getOperatorExpr()
   * @generated
   */
  void setOperatorExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Start Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start Expr</em>' containment reference.
   * @see #setStartExpr(Expression)
   * @see org.hopper.language.portugol.PortugolPackage#getForStatement_StartExpr()
   * @model containment="true"
   * @generated
   */
  Expression getStartExpr();

  /**
   * Sets the value of the '{@link org.hopper.language.portugol.ForStatement#getStartExpr <em>Start Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Expr</em>' containment reference.
   * @see #getStartExpr()
   * @generated
   */
  void setStartExpr(Expression value);

  /**
   * Returns the value of the '<em><b>End Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Expr</em>' containment reference.
   * @see #setEndExpr(Expression)
   * @see org.hopper.language.portugol.PortugolPackage#getForStatement_EndExpr()
   * @model containment="true"
   * @generated
   */
  Expression getEndExpr();

  /**
   * Sets the value of the '{@link org.hopper.language.portugol.ForStatement#getEndExpr <em>End Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Expr</em>' containment reference.
   * @see #getEndExpr()
   * @generated
   */
  void setEndExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Step Expe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Step Expe</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Step Expe</em>' containment reference.
   * @see #setStepExpe(Expression)
   * @see org.hopper.language.portugol.PortugolPackage#getForStatement_StepExpe()
   * @model containment="true"
   * @generated
   */
  Expression getStepExpe();

  /**
   * Sets the value of the '{@link org.hopper.language.portugol.ForStatement#getStepExpe <em>Step Expe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Step Expe</em>' containment reference.
   * @see #getStepExpe()
   * @generated
   */
  void setStepExpe(Expression value);

  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link org.hopper.language.portugol.AbstractCommand}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see org.hopper.language.portugol.PortugolPackage#getForStatement_Commands()
   * @model containment="true"
   * @generated
   */
  EList<AbstractCommand> getCommands();

} // ForStatement
