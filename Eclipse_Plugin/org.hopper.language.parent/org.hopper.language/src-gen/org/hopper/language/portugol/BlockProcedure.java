/**
 * generated by Xtext 2.9.0
 */
package org.hopper.language.portugol;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hopper.language.portugol.BlockProcedure#getProcedureName <em>Procedure Name</em>}</li>
 * </ul>
 *
 * @see org.hopper.language.portugol.PortugolPackage#getBlockProcedure()
 * @model
 * @generated
 */
public interface BlockProcedure extends BlockSubPrograms
{
  /**
   * Returns the value of the '<em><b>Procedure Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedure Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedure Name</em>' containment reference.
   * @see #setProcedureName(ProcedureName)
   * @see org.hopper.language.portugol.PortugolPackage#getBlockProcedure_ProcedureName()
   * @model containment="true"
   * @generated
   */
  ProcedureName getProcedureName();

  /**
   * Sets the value of the '{@link org.hopper.language.portugol.BlockProcedure#getProcedureName <em>Procedure Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Procedure Name</em>' containment reference.
   * @see #getProcedureName()
   * @generated
   */
  void setProcedureName(ProcedureName value);

} // BlockProcedure
