/**
 * generated by Xtext 2.9.0
 */
package org.hopper.language.portugol;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hopper.language.portugol.BlockFunction#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link org.hopper.language.portugol.BlockFunction#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see org.hopper.language.portugol.PortugolPackage#getBlockFunction()
 * @model
 * @generated
 */
public interface BlockFunction extends BlockSubPrograms
{
  /**
   * Returns the value of the '<em><b>Function Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Name</em>' containment reference.
   * @see #setFunctionName(FunctionName)
   * @see org.hopper.language.portugol.PortugolPackage#getBlockFunction_FunctionName()
   * @model containment="true"
   * @generated
   */
  FunctionName getFunctionName();

  /**
   * Sets the value of the '{@link org.hopper.language.portugol.BlockFunction#getFunctionName <em>Function Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Name</em>' containment reference.
   * @see #getFunctionName()
   * @generated
   */
  void setFunctionName(FunctionName value);

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(VarType)
   * @see org.hopper.language.portugol.PortugolPackage#getBlockFunction_ReturnType()
   * @model containment="true"
   * @generated
   */
  VarType getReturnType();

  /**
   * Sets the value of the '{@link org.hopper.language.portugol.BlockFunction#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(VarType value);

} // BlockFunction