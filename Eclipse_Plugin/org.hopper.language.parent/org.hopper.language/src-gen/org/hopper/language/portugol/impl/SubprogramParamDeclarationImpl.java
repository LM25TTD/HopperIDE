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

import org.hopper.language.portugol.PortugolPackage;
import org.hopper.language.portugol.SubprogramParamDeclaration;
import org.hopper.language.portugol.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprogram Param Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hopper.language.portugol.impl.SubprogramParamDeclarationImpl#getParamList <em>Param List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprogramParamDeclarationImpl extends MinimalEObjectImpl.Container implements SubprogramParamDeclaration
{
  /**
   * The cached value of the '{@link #getParamList() <em>Param List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamList()
   * @generated
   * @ordered
   */
  protected EList<Variable> paramList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubprogramParamDeclarationImpl()
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
    return PortugolPackage.Literals.SUBPROGRAM_PARAM_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getParamList()
  {
    if (paramList == null)
    {
      paramList = new EObjectContainmentEList<Variable>(Variable.class, this, PortugolPackage.SUBPROGRAM_PARAM_DECLARATION__PARAM_LIST);
    }
    return paramList;
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
      case PortugolPackage.SUBPROGRAM_PARAM_DECLARATION__PARAM_LIST:
        return ((InternalEList<?>)getParamList()).basicRemove(otherEnd, msgs);
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
      case PortugolPackage.SUBPROGRAM_PARAM_DECLARATION__PARAM_LIST:
        return getParamList();
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
      case PortugolPackage.SUBPROGRAM_PARAM_DECLARATION__PARAM_LIST:
        getParamList().clear();
        getParamList().addAll((Collection<? extends Variable>)newValue);
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
      case PortugolPackage.SUBPROGRAM_PARAM_DECLARATION__PARAM_LIST:
        getParamList().clear();
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
      case PortugolPackage.SUBPROGRAM_PARAM_DECLARATION__PARAM_LIST:
        return paramList != null && !paramList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SubprogramParamDeclarationImpl
