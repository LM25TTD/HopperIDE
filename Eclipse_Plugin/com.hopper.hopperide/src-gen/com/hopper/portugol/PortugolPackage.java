/**
 */
package com.hopper.portugol;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.hopper.portugol.PortugolFactory
 * @model kind="package"
 * @generated
 */
public interface PortugolPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "portugol";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.hopper.com/Portugol";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "portugol";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PortugolPackage eINSTANCE = com.hopper.portugol.impl.PortugolPackageImpl.init();

  /**
   * The meta object id for the '{@link com.hopper.portugol.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.hopper.portugol.impl.ModelImpl
   * @see com.hopper.portugol.impl.PortugolPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MAIN = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.hopper.portugol.impl.ProgramaImpl <em>Programa</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.hopper.portugol.impl.ProgramaImpl
   * @see com.hopper.portugol.impl.PortugolPackageImpl#getPrograma()
   * @generated
   */
  int PROGRAMA = 1;

  /**
   * The number of structural features of the '<em>Programa</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAMA_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.hopper.portugol.impl.HEADERImpl <em>HEADER</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.hopper.portugol.impl.HEADERImpl
   * @see com.hopper.portugol.impl.PortugolPackageImpl#getHEADER()
   * @generated
   */
  int HEADER = 2;

  /**
   * The feature id for the '<em><b>Name Of Program</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__NAME_OF_PROGRAM = PROGRAMA_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>HEADER</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FEATURE_COUNT = PROGRAMA_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link com.hopper.portugol.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.hopper.portugol.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link com.hopper.portugol.Model#getMain <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main</em>'.
   * @see com.hopper.portugol.Model#getMain()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Main();

  /**
   * Returns the meta object for class '{@link com.hopper.portugol.Programa <em>Programa</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Programa</em>'.
   * @see com.hopper.portugol.Programa
   * @generated
   */
  EClass getPrograma();

  /**
   * Returns the meta object for class '{@link com.hopper.portugol.HEADER <em>HEADER</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>HEADER</em>'.
   * @see com.hopper.portugol.HEADER
   * @generated
   */
  EClass getHEADER();

  /**
   * Returns the meta object for the attribute '{@link com.hopper.portugol.HEADER#getNameOfProgram <em>Name Of Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Of Program</em>'.
   * @see com.hopper.portugol.HEADER#getNameOfProgram()
   * @see #getHEADER()
   * @generated
   */
  EAttribute getHEADER_NameOfProgram();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PortugolFactory getPortugolFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.hopper.portugol.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.hopper.portugol.impl.ModelImpl
     * @see com.hopper.portugol.impl.PortugolPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MAIN = eINSTANCE.getModel_Main();

    /**
     * The meta object literal for the '{@link com.hopper.portugol.impl.ProgramaImpl <em>Programa</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.hopper.portugol.impl.ProgramaImpl
     * @see com.hopper.portugol.impl.PortugolPackageImpl#getPrograma()
     * @generated
     */
    EClass PROGRAMA = eINSTANCE.getPrograma();

    /**
     * The meta object literal for the '{@link com.hopper.portugol.impl.HEADERImpl <em>HEADER</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.hopper.portugol.impl.HEADERImpl
     * @see com.hopper.portugol.impl.PortugolPackageImpl#getHEADER()
     * @generated
     */
    EClass HEADER = eINSTANCE.getHEADER();

    /**
     * The meta object literal for the '<em><b>Name Of Program</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER__NAME_OF_PROGRAM = eINSTANCE.getHEADER_NameOfProgram();

  }

} //PortugolPackage
