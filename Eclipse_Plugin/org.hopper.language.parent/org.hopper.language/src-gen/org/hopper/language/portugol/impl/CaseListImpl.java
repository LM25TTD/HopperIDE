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

import org.hopper.language.portugol.AbstractCommand;
import org.hopper.language.portugol.CaseList;
import org.hopper.language.portugol.Expression;
import org.hopper.language.portugol.PortugolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hopper.language.portugol.impl.CaseListImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.hopper.language.portugol.impl.CaseListImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.hopper.language.portugol.impl.CaseListImpl#isBreakStatement <em>Break Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseListImpl extends MinimalEObjectImpl.Container implements CaseList
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expression expr;

  /**
   * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommands()
   * @generated
   * @ordered
   */
  protected EList<AbstractCommand> commands;

  /**
   * The default value of the '{@link #isBreakStatement() <em>Break Statement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBreakStatement()
   * @generated
   * @ordered
   */
  protected static final boolean BREAK_STATEMENT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBreakStatement() <em>Break Statement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBreakStatement()
   * @generated
   * @ordered
   */
  protected boolean breakStatement = BREAK_STATEMENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CaseListImpl()
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
    return PortugolPackage.Literals.CASE_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expression newExpr, NotificationChain msgs)
  {
    Expression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PortugolPackage.CASE_LIST__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PortugolPackage.CASE_LIST__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PortugolPackage.CASE_LIST__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PortugolPackage.CASE_LIST__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractCommand> getCommands()
  {
    if (commands == null)
    {
      commands = new EObjectContainmentEList<AbstractCommand>(AbstractCommand.class, this, PortugolPackage.CASE_LIST__COMMANDS);
    }
    return commands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBreakStatement()
  {
    return breakStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBreakStatement(boolean newBreakStatement)
  {
    boolean oldBreakStatement = breakStatement;
    breakStatement = newBreakStatement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PortugolPackage.CASE_LIST__BREAK_STATEMENT, oldBreakStatement, breakStatement));
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
      case PortugolPackage.CASE_LIST__EXPR:
        return basicSetExpr(null, msgs);
      case PortugolPackage.CASE_LIST__COMMANDS:
        return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
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
      case PortugolPackage.CASE_LIST__EXPR:
        return getExpr();
      case PortugolPackage.CASE_LIST__COMMANDS:
        return getCommands();
      case PortugolPackage.CASE_LIST__BREAK_STATEMENT:
        return isBreakStatement();
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
      case PortugolPackage.CASE_LIST__EXPR:
        setExpr((Expression)newValue);
        return;
      case PortugolPackage.CASE_LIST__COMMANDS:
        getCommands().clear();
        getCommands().addAll((Collection<? extends AbstractCommand>)newValue);
        return;
      case PortugolPackage.CASE_LIST__BREAK_STATEMENT:
        setBreakStatement((Boolean)newValue);
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
      case PortugolPackage.CASE_LIST__EXPR:
        setExpr((Expression)null);
        return;
      case PortugolPackage.CASE_LIST__COMMANDS:
        getCommands().clear();
        return;
      case PortugolPackage.CASE_LIST__BREAK_STATEMENT:
        setBreakStatement(BREAK_STATEMENT_EDEFAULT);
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
      case PortugolPackage.CASE_LIST__EXPR:
        return expr != null;
      case PortugolPackage.CASE_LIST__COMMANDS:
        return commands != null && !commands.isEmpty();
      case PortugolPackage.CASE_LIST__BREAK_STATEMENT:
        return breakStatement != BREAK_STATEMENT_EDEFAULT;
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
    result.append(" (breakStatement: ");
    result.append(breakStatement);
    result.append(')');
    return result.toString();
  }

} //CaseListImpl
