/**
 * generated by Xtext 2.9.0
 */
package org.hopper.language.portugol.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hopper.language.portugol.FunctionCall;
import org.hopper.language.portugol.FunctionName;
import org.hopper.language.portugol.PortugolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hopper.language.portugol.impl.FunctionCallImpl#getFbName <em>Fb Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionCallImpl extends ExpressionImpl implements FunctionCall
{
  /**
   * The cached value of the '{@link #getFbName() <em>Fb Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFbName()
   * @generated
   * @ordered
   */
  protected FunctionName fbName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionCallImpl()
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
    return PortugolPackage.Literals.FUNCTION_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionName getFbName()
  {
    if (fbName != null && fbName.eIsProxy())
    {
      InternalEObject oldFbName = (InternalEObject)fbName;
      fbName = (FunctionName)eResolveProxy(oldFbName);
      if (fbName != oldFbName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PortugolPackage.FUNCTION_CALL__FB_NAME, oldFbName, fbName));
      }
    }
    return fbName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionName basicGetFbName()
  {
    return fbName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFbName(FunctionName newFbName)
  {
    FunctionName oldFbName = fbName;
    fbName = newFbName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PortugolPackage.FUNCTION_CALL__FB_NAME, oldFbName, fbName));
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
      case PortugolPackage.FUNCTION_CALL__FB_NAME:
        if (resolve) return getFbName();
        return basicGetFbName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PortugolPackage.FUNCTION_CALL__FB_NAME:
        setFbName((FunctionName)newValue);
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
      case PortugolPackage.FUNCTION_CALL__FB_NAME:
        setFbName((FunctionName)null);
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
      case PortugolPackage.FUNCTION_CALL__FB_NAME:
        return fbName != null;
    }
    return super.eIsSet(featureID);
  }

} //FunctionCallImpl