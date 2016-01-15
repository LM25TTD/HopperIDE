/**
 * generated by Xtext 2.9.0
 */
package org.hopper.language.portugol;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hopper.language.portugol.ReadCommand#getParamList <em>Param List</em>}</li>
 * </ul>
 *
 * @see org.hopper.language.portugol.PortugolPackage#getReadCommand()
 * @model
 * @generated
 */
public interface ReadCommand extends AbstractCommand
{
  /**
   * Returns the value of the '<em><b>Param List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param List</em>' containment reference.
   * @see #setParamList(DeclaredVar)
   * @see org.hopper.language.portugol.PortugolPackage#getReadCommand_ParamList()
   * @model containment="true"
   * @generated
   */
  DeclaredVar getParamList();

  /**
   * Sets the value of the '{@link org.hopper.language.portugol.ReadCommand#getParamList <em>Param List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param List</em>' containment reference.
   * @see #getParamList()
   * @generated
   */
  void setParamList(DeclaredVar value);

} // ReadCommand