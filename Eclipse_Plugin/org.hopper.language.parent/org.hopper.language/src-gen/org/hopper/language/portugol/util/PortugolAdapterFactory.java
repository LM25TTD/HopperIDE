/**
 * generated by Xtext 2.9.0
 */
package org.hopper.language.portugol.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.hopper.language.portugol.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.hopper.language.portugol.PortugolPackage
 * @generated
 */
public class PortugolAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PortugolPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortugolAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PortugolPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PortugolSwitch<Adapter> modelSwitch =
    new PortugolSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseHeaderBlock(HeaderBlock object)
      {
        return createHeaderBlockAdapter();
      }
      @Override
      public Adapter caseDeclarationsBlock(DeclarationsBlock object)
      {
        return createDeclarationsBlockAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseVarDeclaration(VarDeclaration object)
      {
        return createVarDeclarationAdapter();
      }
      @Override
      public Adapter caseDeclaredVar(DeclaredVar object)
      {
        return createDeclaredVarAdapter();
      }
      @Override
      public Adapter caseVarName(VarName object)
      {
        return createVarNameAdapter();
      }
      @Override
      public Adapter caseVarType(VarType object)
      {
        return createVarTypeAdapter();
      }
      @Override
      public Adapter caseSubprograms(Subprograms object)
      {
        return createSubprogramsAdapter();
      }
      @Override
      public Adapter caseBlockSubPrograms(BlockSubPrograms object)
      {
        return createBlockSubProgramsAdapter();
      }
      @Override
      public Adapter caseFunctionName(FunctionName object)
      {
        return createFunctionNameAdapter();
      }
      @Override
      public Adapter caseProcedureName(ProcedureName object)
      {
        return createProcedureNameAdapter();
      }
      @Override
      public Adapter caseBlockFunction(BlockFunction object)
      {
        return createBlockFunctionAdapter();
      }
      @Override
      public Adapter caseBlockProcedure(BlockProcedure object)
      {
        return createBlockProcedureAdapter();
      }
      @Override
      public Adapter caseBlockCommand(BlockCommand object)
      {
        return createBlockCommandAdapter();
      }
      @Override
      public Adapter caseAbstractCommand(AbstractCommand object)
      {
        return createAbstractCommandAdapter();
      }
      @Override
      public Adapter caseReadCommand(ReadCommand object)
      {
        return createReadCommandAdapter();
      }
      @Override
      public Adapter caseWriteCommand(WriteCommand object)
      {
        return createWriteCommandAdapter();
      }
      @Override
      public Adapter caseWriteParam(WriteParam object)
      {
        return createWriteParamAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseFunctionCall(FunctionCall object)
      {
        return createFunctionCallAdapter();
      }
      @Override
      public Adapter caseOptDecimalPrecision(OptDecimalPrecision object)
      {
        return createOptDecimalPrecisionAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseNumericLiteral(NumericLiteral object)
      {
        return createNumericLiteralAdapter();
      }
      @Override
      public Adapter caseStringExpression(StringExpression object)
      {
        return createStringExpressionAdapter();
      }
      @Override
      public Adapter caseXorExpression(XorExpression object)
      {
        return createXorExpressionAdapter();
      }
      @Override
      public Adapter caseAndExpression(AndExpression object)
      {
        return createAndExpressionAdapter();
      }
      @Override
      public Adapter caseCompExpression(CompExpression object)
      {
        return createCompExpressionAdapter();
      }
      @Override
      public Adapter caseEquExpression(EquExpression object)
      {
        return createEquExpressionAdapter();
      }
      @Override
      public Adapter caseAddExpression(AddExpression object)
      {
        return createAddExpressionAdapter();
      }
      @Override
      public Adapter caseSubExpression(SubExpression object)
      {
        return createSubExpressionAdapter();
      }
      @Override
      public Adapter caseMultiply(Multiply object)
      {
        return createMultiplyAdapter();
      }
      @Override
      public Adapter caseDivision(Division object)
      {
        return createDivisionAdapter();
      }
      @Override
      public Adapter caseMod(Mod object)
      {
        return createModAdapter();
      }
      @Override
      public Adapter casePowerExpression(PowerExpression object)
      {
        return createPowerExpressionAdapter();
      }
      @Override
      public Adapter caseBooleanNegation(BooleanNegation object)
      {
        return createBooleanNegationAdapter();
      }
      @Override
      public Adapter caseArithmeticSigned(ArithmeticSigned object)
      {
        return createArithmeticSignedAdapter();
      }
      @Override
      public Adapter caseExpressionConstant(ExpressionConstant object)
      {
        return createExpressionConstantAdapter();
      }
      @Override
      public Adapter caseExpressionVariable(ExpressionVariable object)
      {
        return createExpressionVariableAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.HeaderBlock <em>Header Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.HeaderBlock
   * @generated
   */
  public Adapter createHeaderBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.DeclarationsBlock <em>Declarations Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.DeclarationsBlock
   * @generated
   */
  public Adapter createDeclarationsBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.VarDeclaration <em>Var Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.VarDeclaration
   * @generated
   */
  public Adapter createVarDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.DeclaredVar <em>Declared Var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.DeclaredVar
   * @generated
   */
  public Adapter createDeclaredVarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.VarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.VarName
   * @generated
   */
  public Adapter createVarNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.VarType <em>Var Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.VarType
   * @generated
   */
  public Adapter createVarTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.Subprograms <em>Subprograms</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.Subprograms
   * @generated
   */
  public Adapter createSubprogramsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.BlockSubPrograms <em>Block Sub Programs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.BlockSubPrograms
   * @generated
   */
  public Adapter createBlockSubProgramsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.FunctionName <em>Function Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.FunctionName
   * @generated
   */
  public Adapter createFunctionNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.ProcedureName <em>Procedure Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.ProcedureName
   * @generated
   */
  public Adapter createProcedureNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.BlockFunction <em>Block Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.BlockFunction
   * @generated
   */
  public Adapter createBlockFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.BlockProcedure <em>Block Procedure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.BlockProcedure
   * @generated
   */
  public Adapter createBlockProcedureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.BlockCommand <em>Block Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.BlockCommand
   * @generated
   */
  public Adapter createBlockCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.AbstractCommand <em>Abstract Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.AbstractCommand
   * @generated
   */
  public Adapter createAbstractCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.ReadCommand <em>Read Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.ReadCommand
   * @generated
   */
  public Adapter createReadCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.WriteCommand <em>Write Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.WriteCommand
   * @generated
   */
  public Adapter createWriteCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.WriteParam <em>Write Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.WriteParam
   * @generated
   */
  public Adapter createWriteParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.FunctionCall
   * @generated
   */
  public Adapter createFunctionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.OptDecimalPrecision <em>Opt Decimal Precision</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.OptDecimalPrecision
   * @generated
   */
  public Adapter createOptDecimalPrecisionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.NumericLiteral <em>Numeric Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.NumericLiteral
   * @generated
   */
  public Adapter createNumericLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.StringExpression <em>String Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.StringExpression
   * @generated
   */
  public Adapter createStringExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.XorExpression <em>Xor Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.XorExpression
   * @generated
   */
  public Adapter createXorExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.AndExpression
   * @generated
   */
  public Adapter createAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.CompExpression <em>Comp Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.CompExpression
   * @generated
   */
  public Adapter createCompExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.EquExpression <em>Equ Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.EquExpression
   * @generated
   */
  public Adapter createEquExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.AddExpression <em>Add Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.AddExpression
   * @generated
   */
  public Adapter createAddExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.SubExpression <em>Sub Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.SubExpression
   * @generated
   */
  public Adapter createSubExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.Multiply <em>Multiply</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.Multiply
   * @generated
   */
  public Adapter createMultiplyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.Division <em>Division</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.Division
   * @generated
   */
  public Adapter createDivisionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.Mod <em>Mod</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.Mod
   * @generated
   */
  public Adapter createModAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.PowerExpression <em>Power Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.PowerExpression
   * @generated
   */
  public Adapter createPowerExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.BooleanNegation <em>Boolean Negation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.BooleanNegation
   * @generated
   */
  public Adapter createBooleanNegationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.ArithmeticSigned <em>Arithmetic Signed</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.ArithmeticSigned
   * @generated
   */
  public Adapter createArithmeticSignedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.ExpressionConstant <em>Expression Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.ExpressionConstant
   * @generated
   */
  public Adapter createExpressionConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.hopper.language.portugol.ExpressionVariable <em>Expression Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.hopper.language.portugol.ExpressionVariable
   * @generated
   */
  public Adapter createExpressionVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PortugolAdapterFactory