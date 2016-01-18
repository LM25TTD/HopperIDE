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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hopper.language.portugol.AbstractCommand;
import org.hopper.language.portugol.Expression;
import org.hopper.language.portugol.IfStatement;
import org.hopper.language.portugol.PortugolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hopper.language.portugol.impl.IfStatementImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.hopper.language.portugol.impl.IfStatementImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.hopper.language.portugol.impl.IfStatementImpl#getElseCommands <em>Else Commands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStatementImpl extends AbstractCommandImpl implements IfStatement
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
   * The cached value of the '{@link #getElseCommands() <em>Else Commands</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseCommands()
   * @generated
   * @ordered
   */
  protected EList<AbstractCommand> elseCommands;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfStatementImpl()
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
    return PortugolPackage.Literals.IF_STATEMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PortugolPackage.IF_STATEMENT__EXPR, oldExpr, newExpr);
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
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PortugolPackage.IF_STATEMENT__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PortugolPackage.IF_STATEMENT__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PortugolPackage.IF_STATEMENT__EXPR, newExpr, newExpr));
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
      commands = new EObjectContainmentEList<AbstractCommand>(AbstractCommand.class, this, PortugolPackage.IF_STATEMENT__COMMANDS);
    }
    return commands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractCommand> getElseCommands()
  {
    if (elseCommands == null)
    {
      elseCommands = new EObjectContainmentEList<AbstractCommand>(AbstractCommand.class, this, PortugolPackage.IF_STATEMENT__ELSE_COMMANDS);
    }
    return elseCommands;
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
      case PortugolPackage.IF_STATEMENT__EXPR:
        return basicSetExpr(null, msgs);
      case PortugolPackage.IF_STATEMENT__COMMANDS:
        return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
      case PortugolPackage.IF_STATEMENT__ELSE_COMMANDS:
        return ((InternalEList<?>)getElseCommands()).basicRemove(otherEnd, msgs);
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
      case PortugolPackage.IF_STATEMENT__EXPR:
        return getExpr();
      case PortugolPackage.IF_STATEMENT__COMMANDS:
        return getCommands();
      case PortugolPackage.IF_STATEMENT__ELSE_COMMANDS:
        return getElseCommands();
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
      case PortugolPackage.IF_STATEMENT__EXPR:
        setExpr((Expression)newValue);
        return;
      case PortugolPackage.IF_STATEMENT__COMMANDS:
        getCommands().clear();
        getCommands().addAll((Collection<? extends AbstractCommand>)newValue);
        return;
      case PortugolPackage.IF_STATEMENT__ELSE_COMMANDS:
        getElseCommands().clear();
        getElseCommands().addAll((Collection<? extends AbstractCommand>)newValue);
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
      case PortugolPackage.IF_STATEMENT__EXPR:
        setExpr((Expression)null);
        return;
      case PortugolPackage.IF_STATEMENT__COMMANDS:
        getCommands().clear();
        return;
      case PortugolPackage.IF_STATEMENT__ELSE_COMMANDS:
        getElseCommands().clear();
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
      case PortugolPackage.IF_STATEMENT__EXPR:
        return expr != null;
      case PortugolPackage.IF_STATEMENT__COMMANDS:
        return commands != null && !commands.isEmpty();
      case PortugolPackage.IF_STATEMENT__ELSE_COMMANDS:
        return elseCommands != null && !elseCommands.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IfStatementImpl