/**
 * generated by Xtext 2.9.0
 */
package org.hopper.language.portugol.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hopper.language.portugol.Expression;
import org.hopper.language.portugol.OptDecimalPrecision;
import org.hopper.language.portugol.PortugolPackage;
import org.hopper.language.portugol.WriteParam;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Write Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hopper.language.portugol.impl.WriteParamImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.hopper.language.portugol.impl.WriteParamImpl#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WriteParamImpl extends MinimalEObjectImpl.Container implements WriteParam
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected EList<Expression> expression;

  /**
   * The cached value of the '{@link #getPrecision() <em>Precision</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrecision()
   * @generated
   * @ordered
   */
  protected OptDecimalPrecision precision;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WriteParamImpl()
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
    return PortugolPackage.Literals.WRITE_PARAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getExpression()
  {
    if (expression == null)
    {
      expression = new EObjectContainmentEList<Expression>(Expression.class, this, PortugolPackage.WRITE_PARAM__EXPRESSION);
    }
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptDecimalPrecision getPrecision()
  {
    return precision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrecision(OptDecimalPrecision newPrecision, NotificationChain msgs)
  {
    OptDecimalPrecision oldPrecision = precision;
    precision = newPrecision;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PortugolPackage.WRITE_PARAM__PRECISION, oldPrecision, newPrecision);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrecision(OptDecimalPrecision newPrecision)
  {
    if (newPrecision != precision)
    {
      NotificationChain msgs = null;
      if (precision != null)
        msgs = ((InternalEObject)precision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PortugolPackage.WRITE_PARAM__PRECISION, null, msgs);
      if (newPrecision != null)
        msgs = ((InternalEObject)newPrecision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PortugolPackage.WRITE_PARAM__PRECISION, null, msgs);
      msgs = basicSetPrecision(newPrecision, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PortugolPackage.WRITE_PARAM__PRECISION, newPrecision, newPrecision));
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
      case PortugolPackage.WRITE_PARAM__EXPRESSION:
        return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
      case PortugolPackage.WRITE_PARAM__PRECISION:
        return basicSetPrecision(null, msgs);
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
      case PortugolPackage.WRITE_PARAM__EXPRESSION:
        return getExpression();
      case PortugolPackage.WRITE_PARAM__PRECISION:
        return getPrecision();
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
      case PortugolPackage.WRITE_PARAM__EXPRESSION:
        getExpression().clear();
        getExpression().addAll((Collection<? extends Expression>)newValue);
        return;
      case PortugolPackage.WRITE_PARAM__PRECISION:
        setPrecision((OptDecimalPrecision)newValue);
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
      case PortugolPackage.WRITE_PARAM__EXPRESSION:
        getExpression().clear();
        return;
      case PortugolPackage.WRITE_PARAM__PRECISION:
        setPrecision((OptDecimalPrecision)null);
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
      case PortugolPackage.WRITE_PARAM__EXPRESSION:
        return expression != null && !expression.isEmpty();
      case PortugolPackage.WRITE_PARAM__PRECISION:
        return precision != null;
    }
    return super.eIsSet(featureID);
  }

} //WriteParamImpl