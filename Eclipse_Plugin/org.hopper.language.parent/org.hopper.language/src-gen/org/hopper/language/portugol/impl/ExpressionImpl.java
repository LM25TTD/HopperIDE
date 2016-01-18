/**
 * generated by Xtext 2.9.0
 */
package org.hopper.language.portugol.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hopper.language.portugol.Expression;
import org.hopper.language.portugol.PortugolPackage;
import org.hopper.language.portugol.SubprogramParam;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hopper.language.portugol.impl.ExpressionImpl#getFbName <em>Fb Name</em>}</li>
 *   <li>{@link org.hopper.language.portugol.impl.ExpressionImpl#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends AbstractCommandImpl implements Expression
{
  /**
   * The cached value of the '{@link #getFbName() <em>Fb Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFbName()
   * @generated
   * @ordered
   */
  protected EObject fbName;

  /**
   * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
  protected SubprogramParam param;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return PortugolPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getFbName()
  {
    if (fbName != null && fbName.eIsProxy())
    {
      InternalEObject oldFbName = (InternalEObject)fbName;
      fbName = eResolveProxy(oldFbName);
      if (fbName != oldFbName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PortugolPackage.EXPRESSION__FB_NAME, oldFbName, fbName));
      }
    }
    return fbName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject basicGetFbName()
  {
    return fbName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFbName(EObject newFbName)
  {
    EObject oldFbName = fbName;
    fbName = newFbName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PortugolPackage.EXPRESSION__FB_NAME, oldFbName, fbName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubprogramParam getParam()
  {
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParam(SubprogramParam newParam, NotificationChain msgs)
  {
    SubprogramParam oldParam = param;
    param = newParam;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PortugolPackage.EXPRESSION__PARAM, oldParam, newParam);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParam(SubprogramParam newParam)
  {
    if (newParam != param)
    {
      NotificationChain msgs = null;
      if (param != null)
        msgs = ((InternalEObject)param).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PortugolPackage.EXPRESSION__PARAM, null, msgs);
      if (newParam != null)
        msgs = ((InternalEObject)newParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PortugolPackage.EXPRESSION__PARAM, null, msgs);
      msgs = basicSetParam(newParam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PortugolPackage.EXPRESSION__PARAM, newParam, newParam));
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
      case PortugolPackage.EXPRESSION__PARAM:
        return basicSetParam(null, msgs);
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
      case PortugolPackage.EXPRESSION__FB_NAME:
        if (resolve) return getFbName();
        return basicGetFbName();
      case PortugolPackage.EXPRESSION__PARAM:
        return getParam();
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
      case PortugolPackage.EXPRESSION__FB_NAME:
        setFbName((EObject)newValue);
        return;
      case PortugolPackage.EXPRESSION__PARAM:
        setParam((SubprogramParam)newValue);
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
      case PortugolPackage.EXPRESSION__FB_NAME:
        setFbName((EObject)null);
        return;
      case PortugolPackage.EXPRESSION__PARAM:
        setParam((SubprogramParam)null);
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
      case PortugolPackage.EXPRESSION__FB_NAME:
        return fbName != null;
      case PortugolPackage.EXPRESSION__PARAM:
        return param != null;
    }
    return super.eIsSet(featureID);
  }

} //ExpressionImpl
