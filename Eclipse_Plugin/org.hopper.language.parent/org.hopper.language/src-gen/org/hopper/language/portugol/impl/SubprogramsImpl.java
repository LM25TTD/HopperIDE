/**
 * generated by Xtext 2.9.0
 */
package org.hopper.language.portugol.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hopper.language.portugol.BlockSubPrograms;
import org.hopper.language.portugol.PortugolPackage;
import org.hopper.language.portugol.Subprograms;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprograms</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hopper.language.portugol.impl.SubprogramsImpl#getBlockSubPrograms <em>Block Sub Programs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprogramsImpl extends MinimalEObjectImpl.Container implements Subprograms
{
  /**
   * The cached value of the '{@link #getBlockSubPrograms() <em>Block Sub Programs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlockSubPrograms()
   * @generated
   * @ordered
   */
  protected EList<BlockSubPrograms> blockSubPrograms;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubprogramsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PortugolPackage.Literals.SUBPROGRAMS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BlockSubPrograms> getBlockSubPrograms()
  {
    if (blockSubPrograms == null)
    {
      blockSubPrograms = new EObjectContainmentEList<BlockSubPrograms>(BlockSubPrograms.class, this, PortugolPackage.SUBPROGRAMS__BLOCK_SUB_PROGRAMS);
    }
    return blockSubPrograms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PortugolPackage.SUBPROGRAMS__BLOCK_SUB_PROGRAMS:
        return ((InternalEList<?>)getBlockSubPrograms()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PortugolPackage.SUBPROGRAMS__BLOCK_SUB_PROGRAMS:
        return getBlockSubPrograms();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PortugolPackage.SUBPROGRAMS__BLOCK_SUB_PROGRAMS:
        getBlockSubPrograms().clear();
        getBlockSubPrograms().addAll((Collection<? extends BlockSubPrograms>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PortugolPackage.SUBPROGRAMS__BLOCK_SUB_PROGRAMS:
        getBlockSubPrograms().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PortugolPackage.SUBPROGRAMS__BLOCK_SUB_PROGRAMS:
        return blockSubPrograms != null && !blockSubPrograms.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SubprogramsImpl
