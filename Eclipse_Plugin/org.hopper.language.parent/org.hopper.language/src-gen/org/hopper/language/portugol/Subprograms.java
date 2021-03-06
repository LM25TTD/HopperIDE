/**
 * generated by Xtext 2.9.0
 */
package org.hopper.language.portugol;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprograms</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hopper.language.portugol.Subprograms#getBlockSubPrograms <em>Block Sub Programs</em>}</li>
 * </ul>
 *
 * @see org.hopper.language.portugol.PortugolPackage#getSubprograms()
 * @model
 * @generated
 */
public interface Subprograms extends EObject
{
  /**
   * Returns the value of the '<em><b>Block Sub Programs</b></em>' containment reference list.
   * The list contents are of type {@link org.hopper.language.portugol.BlockSubPrograms}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block Sub Programs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block Sub Programs</em>' containment reference list.
   * @see org.hopper.language.portugol.PortugolPackage#getSubprograms_BlockSubPrograms()
   * @model containment="true"
   * @generated
   */
  EList<BlockSubPrograms> getBlockSubPrograms();

} // Subprograms
