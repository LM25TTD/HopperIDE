/**
 * generated by Xtext 2.9.0
 */
package org.hopper.language.portugol;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declarations Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hopper.language.portugol.DeclarationsBlock#getVars <em>Vars</em>}</li>
 * </ul>
 *
 * @see org.hopper.language.portugol.PortugolPackage#getDeclarationsBlock()
 * @model
 * @generated
 */
public interface DeclarationsBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
   * The list contents are of type {@link org.hopper.language.portugol.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference list.
   * @see org.hopper.language.portugol.PortugolPackage#getDeclarationsBlock_Vars()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getVars();

} // DeclarationsBlock