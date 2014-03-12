/**
 */
package com.hopper.portugol.impl;

import com.hopper.portugol.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PortugolFactoryImpl extends EFactoryImpl implements PortugolFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PortugolFactory init()
  {
    try
    {
      PortugolFactory thePortugolFactory = (PortugolFactory)EPackage.Registry.INSTANCE.getEFactory(PortugolPackage.eNS_URI);
      if (thePortugolFactory != null)
      {
        return thePortugolFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PortugolFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortugolFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PortugolPackage.MODEL: return createModel();
      case PortugolPackage.PROGRAMA: return createPrograma();
      case PortugolPackage.HEADER: return createHEADER();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Programa createPrograma()
  {
    ProgramaImpl programa = new ProgramaImpl();
    return programa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HEADER createHEADER()
  {
    HEADERImpl header = new HEADERImpl();
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortugolPackage getPortugolPackage()
  {
    return (PortugolPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PortugolPackage getPackage()
  {
    return PortugolPackage.eINSTANCE;
  }

} //PortugolFactoryImpl
