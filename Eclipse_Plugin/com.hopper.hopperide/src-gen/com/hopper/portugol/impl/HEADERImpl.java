/**
 */
package com.hopper.portugol.impl;

import com.hopper.portugol.HEADER;
import com.hopper.portugol.PortugolPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HEADER</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.hopper.portugol.impl.HEADERImpl#getNameOfProgram <em>Name Of Program</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HEADERImpl extends ProgramaImpl implements HEADER
{
  /**
   * The default value of the '{@link #getNameOfProgram() <em>Name Of Program</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameOfProgram()
   * @generated
   * @ordered
   */
  protected static final String NAME_OF_PROGRAM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameOfProgram() <em>Name Of Program</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameOfProgram()
   * @generated
   * @ordered
   */
  protected String nameOfProgram = NAME_OF_PROGRAM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HEADERImpl()
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
    return PortugolPackage.Literals.HEADER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameOfProgram()
  {
    return nameOfProgram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameOfProgram(String newNameOfProgram)
  {
    String oldNameOfProgram = nameOfProgram;
    nameOfProgram = newNameOfProgram;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PortugolPackage.HEADER__NAME_OF_PROGRAM, oldNameOfProgram, nameOfProgram));
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
      case PortugolPackage.HEADER__NAME_OF_PROGRAM:
        return getNameOfProgram();
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
      case PortugolPackage.HEADER__NAME_OF_PROGRAM:
        setNameOfProgram((String)newValue);
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
      case PortugolPackage.HEADER__NAME_OF_PROGRAM:
        setNameOfProgram(NAME_OF_PROGRAM_EDEFAULT);
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
      case PortugolPackage.HEADER__NAME_OF_PROGRAM:
        return NAME_OF_PROGRAM_EDEFAULT == null ? nameOfProgram != null : !NAME_OF_PROGRAM_EDEFAULT.equals(nameOfProgram);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (nameOfProgram: ");
    result.append(nameOfProgram);
    result.append(')');
    return result.toString();
  }

} //HEADERImpl
