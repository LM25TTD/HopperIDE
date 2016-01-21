/*
 * generated by Xtext 2.9.0
 */
package org.hopper.language.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.hopper.language.portugol.BinaryOperation;
import org.hopper.language.portugol.BlockCommand;
import org.hopper.language.portugol.BlockFunction;
import org.hopper.language.portugol.BlockProcedure;
import org.hopper.language.portugol.BreakStatement;
import org.hopper.language.portugol.CaseList;
import org.hopper.language.portugol.DeclarationsBlock;
import org.hopper.language.portugol.DeclaredVar;
import org.hopper.language.portugol.DeclaredVarList;
import org.hopper.language.portugol.Expression;
import org.hopper.language.portugol.ForStatement;
import org.hopper.language.portugol.FunctionName;
import org.hopper.language.portugol.HeaderBlock;
import org.hopper.language.portugol.IfStatement;
import org.hopper.language.portugol.Literal;
import org.hopper.language.portugol.Model;
import org.hopper.language.portugol.NumericLiteral;
import org.hopper.language.portugol.OptDecimalPrecision;
import org.hopper.language.portugol.OtherCase;
import org.hopper.language.portugol.PortugolPackage;
import org.hopper.language.portugol.ProcedureName;
import org.hopper.language.portugol.ReadCommand;
import org.hopper.language.portugol.RepeatStatement;
import org.hopper.language.portugol.ReturnExpression;
import org.hopper.language.portugol.StringExpression;
import org.hopper.language.portugol.SubprogramParam;
import org.hopper.language.portugol.Subprograms;
import org.hopper.language.portugol.SwitchCaseStatement;
import org.hopper.language.portugol.UnaryExpression;
import org.hopper.language.portugol.VarDeclaration;
import org.hopper.language.portugol.VarName;
import org.hopper.language.portugol.VarType;
import org.hopper.language.portugol.Variable;
import org.hopper.language.portugol.WhileStatement;
import org.hopper.language.portugol.WriteCommand;
import org.hopper.language.portugol.WriteParam;
import org.hopper.language.services.PortugolGrammarAccess;

@SuppressWarnings("all")
public class PortugolSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PortugolGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PortugolPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PortugolPackage.BINARY_OPERATION:
				sequence_AddExpression_AndExpression_Assignment_Comparison_EquExpression_MultiplicativeExpression_OrExpression_PowerExpression_XorExpression(context, (BinaryOperation) semanticObject); 
				return; 
			case PortugolPackage.BLOCK_COMMAND:
				sequence_BlockCommand(context, (BlockCommand) semanticObject); 
				return; 
			case PortugolPackage.BLOCK_FUNCTION:
				sequence_BlockFunction(context, (BlockFunction) semanticObject); 
				return; 
			case PortugolPackage.BLOCK_PROCEDURE:
				sequence_BlockProcedure(context, (BlockProcedure) semanticObject); 
				return; 
			case PortugolPackage.BREAK_STATEMENT:
				sequence_BreakStatement(context, (BreakStatement) semanticObject); 
				return; 
			case PortugolPackage.CASE_LIST:
				sequence_CaseList(context, (CaseList) semanticObject); 
				return; 
			case PortugolPackage.DECLARATIONS_BLOCK:
				sequence_DeclarationsBlock(context, (DeclarationsBlock) semanticObject); 
				return; 
			case PortugolPackage.DECLARED_VAR:
				sequence_DeclaredVar(context, (DeclaredVar) semanticObject); 
				return; 
			case PortugolPackage.DECLARED_VAR_LIST:
				sequence_DeclaredVarList(context, (DeclaredVarList) semanticObject); 
				return; 
			case PortugolPackage.EXPRESSION:
				if (rule == grammarAccess.getFunctionCallRule()) {
					sequence_FunctionCall(context, (Expression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAbstractCommandRule()
						|| rule == grammarAccess.getExpressionRule()
						|| rule == grammarAccess.getAssignmentRule()
						|| action == grammarAccess.getAssignmentAccess().getBinaryOperationLeftAction_1_0_0_0()
						|| rule == grammarAccess.getOrExpressionRule()
						|| action == grammarAccess.getOrExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()
						|| rule == grammarAccess.getXorExpressionRule()
						|| action == grammarAccess.getXorExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()
						|| rule == grammarAccess.getAndExpressionRule()
						|| action == grammarAccess.getAndExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()
						|| rule == grammarAccess.getComparisonRule()
						|| action == grammarAccess.getComparisonAccess().getBinaryOperationLeftAction_1_0_0_0()
						|| rule == grammarAccess.getEquExpressionRule()
						|| action == grammarAccess.getEquExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()
						|| rule == grammarAccess.getAddExpressionRule()
						|| action == grammarAccess.getAddExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()
						|| rule == grammarAccess.getMultiplicativeExpressionRule()
						|| action == grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()
						|| rule == grammarAccess.getPowerExpressionRule()
						|| action == grammarAccess.getPowerExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()
						|| rule == grammarAccess.getUnaryExpressionRule()
						|| rule == grammarAccess.getPrimaryExpressionRule()) {
					sequence_FunctionCall_PreDefinedFunctionCall(context, (Expression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPreDefinedFunctionCallRule()) {
					sequence_PreDefinedFunctionCall(context, (Expression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getProcedureCallRule()) {
					sequence_ProcedureCall(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case PortugolPackage.FOR_STATEMENT:
				sequence_ForStatement(context, (ForStatement) semanticObject); 
				return; 
			case PortugolPackage.FUNCTION_NAME:
				sequence_FunctionName(context, (FunctionName) semanticObject); 
				return; 
			case PortugolPackage.HEADER_BLOCK:
				sequence_HeaderBlock(context, (HeaderBlock) semanticObject); 
				return; 
			case PortugolPackage.IF_STATEMENT:
				sequence_IfStatement(context, (IfStatement) semanticObject); 
				return; 
			case PortugolPackage.LITERAL:
				sequence_Literal(context, (Literal) semanticObject); 
				return; 
			case PortugolPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case PortugolPackage.NUMERIC_LITERAL:
				sequence_NumericLiteral(context, (NumericLiteral) semanticObject); 
				return; 
			case PortugolPackage.OPT_DECIMAL_PRECISION:
				sequence_OptDecimalPrecision(context, (OptDecimalPrecision) semanticObject); 
				return; 
			case PortugolPackage.OTHER_CASE:
				sequence_OtherCase(context, (OtherCase) semanticObject); 
				return; 
			case PortugolPackage.PROCEDURE_NAME:
				sequence_ProcedureName(context, (ProcedureName) semanticObject); 
				return; 
			case PortugolPackage.READ_COMMAND:
				sequence_ReadCommand(context, (ReadCommand) semanticObject); 
				return; 
			case PortugolPackage.REPEAT_STATEMENT:
				sequence_RepeatStatement(context, (RepeatStatement) semanticObject); 
				return; 
			case PortugolPackage.RETURN_EXPRESSION:
				sequence_ReturnStatement(context, (ReturnExpression) semanticObject); 
				return; 
			case PortugolPackage.STRING_EXPRESSION:
				sequence_StringExpression(context, (StringExpression) semanticObject); 
				return; 
			case PortugolPackage.SUBPROGRAM_PARAM:
				sequence_SubprogramParam(context, (SubprogramParam) semanticObject); 
				return; 
			case PortugolPackage.SUBPROGRAMS:
				sequence_Subprograms(context, (Subprograms) semanticObject); 
				return; 
			case PortugolPackage.SWITCH_CASE_STATEMENT:
				sequence_SwitchCaseStatement(context, (SwitchCaseStatement) semanticObject); 
				return; 
			case PortugolPackage.UNARY_EXPRESSION:
				sequence_UnaryExpression(context, (UnaryExpression) semanticObject); 
				return; 
			case PortugolPackage.VAR_DECLARATION:
				sequence_VarDeclaration(context, (VarDeclaration) semanticObject); 
				return; 
			case PortugolPackage.VAR_NAME:
				sequence_VarName(context, (VarName) semanticObject); 
				return; 
			case PortugolPackage.VAR_TYPE:
				sequence_VarType(context, (VarType) semanticObject); 
				return; 
			case PortugolPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			case PortugolPackage.WHILE_STATEMENT:
				sequence_WhileStatement(context, (WhileStatement) semanticObject); 
				return; 
			case PortugolPackage.WRITE_COMMAND:
				sequence_WriteCommand(context, (WriteCommand) semanticObject); 
				return; 
			case PortugolPackage.WRITE_PARAM:
				sequence_WriteParam(context, (WriteParam) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AbstractCommand returns BinaryOperation
	 *     Expression returns BinaryOperation
	 *     Assignment returns BinaryOperation
	 *     Assignment.BinaryOperation_1_0_0_0 returns BinaryOperation
	 *     OrExpression returns BinaryOperation
	 *     OrExpression.BinaryOperation_1_0_0_0 returns BinaryOperation
	 *     XorExpression returns BinaryOperation
	 *     XorExpression.BinaryOperation_1_0_0_0 returns BinaryOperation
	 *     AndExpression returns BinaryOperation
	 *     AndExpression.BinaryOperation_1_0_0_0 returns BinaryOperation
	 *     Comparison returns BinaryOperation
	 *     Comparison.BinaryOperation_1_0_0_0 returns BinaryOperation
	 *     EquExpression returns BinaryOperation
	 *     EquExpression.BinaryOperation_1_0_0_0 returns BinaryOperation
	 *     AddExpression returns BinaryOperation
	 *     AddExpression.BinaryOperation_1_0_0_0 returns BinaryOperation
	 *     MultiplicativeExpression returns BinaryOperation
	 *     MultiplicativeExpression.BinaryOperation_1_0_0_0 returns BinaryOperation
	 *     PowerExpression returns BinaryOperation
	 *     PowerExpression.BinaryOperation_1_0_0_0 returns BinaryOperation
	 *     UnaryExpression returns BinaryOperation
	 *     PrimaryExpression returns BinaryOperation
	 *
	 * Constraint:
	 *     (
	 *         (left=Assignment_BinaryOperation_1_0_0_0 op='<-' right=Assignment) | 
	 *         (left=OrExpression_BinaryOperation_1_0_0_0 op='OU' right=XorExpression) | 
	 *         (left=XorExpression_BinaryOperation_1_0_0_0 op='XOU' right=AndExpression) | 
	 *         (left=AndExpression_BinaryOperation_1_0_0_0 (op='&' | op='E') right=Comparison) | 
	 *         (left=Comparison_BinaryOperation_1_0_0_0 (op='=' | op='<>') right=EquExpression) | 
	 *         (left=EquExpression_BinaryOperation_1_0_0_0 (op='<' | op='>' | op='<=' | op='>=') right=AddExpression) | 
	 *         (left=AddExpression_BinaryOperation_1_0_0_0 (op='+' | op='-') right=MultiplicativeExpression) | 
	 *         (left=MultiplicativeExpression_BinaryOperation_1_0_0_0 (op='*' | op='/' | op='MOD' | op='%') right=PowerExpression) | 
	 *         (left=PowerExpression_BinaryOperation_1_0_0_0 op='^' right=UnaryExpression)
	 *     )
	 */
	protected void sequence_AddExpression_AndExpression_Assignment_Comparison_EquExpression_MultiplicativeExpression_OrExpression_PowerExpression_XorExpression(ISerializationContext context, BinaryOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BlockCommand returns BlockCommand
	 *
	 * Constraint:
	 *     commands+=AbstractCommand+
	 */
	protected void sequence_BlockCommand(ISerializationContext context, BlockCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BlockSubPrograms returns BlockFunction
	 *     BlockFunction returns BlockFunction
	 *
	 * Constraint:
	 *     (
	 *         functionName=FunctionName 
	 *         (paramList+=Variable paramList+=Variable*)? 
	 *         returnType=VarType 
	 *         declarations=DeclarationsBlock? 
	 *         commands+=AbstractCommand+
	 *     )
	 */
	protected void sequence_BlockFunction(ISerializationContext context, BlockFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BlockSubPrograms returns BlockProcedure
	 *     BlockProcedure returns BlockProcedure
	 *
	 * Constraint:
	 *     (procedureName=ProcedureName (paramList+=Variable paramList+=Variable*)? declarations=DeclarationsBlock? commands+=AbstractCommand+)
	 */
	protected void sequence_BlockProcedure(ISerializationContext context, BlockProcedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCommand returns BreakStatement
	 *     BreakStatement returns BreakStatement
	 *
	 * Constraint:
	 *     {BreakStatement}
	 */
	protected void sequence_BreakStatement(ISerializationContext context, BreakStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CaseList returns CaseList
	 *
	 * Constraint:
	 *     (expr=Expression commands+=AbstractCommand+)
	 */
	protected void sequence_CaseList(ISerializationContext context, CaseList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DeclarationsBlock returns DeclarationsBlock
	 *
	 * Constraint:
	 *     vars+=Variable+
	 */
	protected void sequence_DeclarationsBlock(ISerializationContext context, DeclarationsBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DeclaredVarList returns DeclaredVarList
	 *
	 * Constraint:
	 *     (vars+=[VarName|ID] vars+=[VarName|ID]*)
	 */
	protected void sequence_DeclaredVarList(ISerializationContext context, DeclaredVarList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCommand returns DeclaredVar
	 *     Expression returns DeclaredVar
	 *     Assignment returns DeclaredVar
	 *     Assignment.BinaryOperation_1_0_0_0 returns DeclaredVar
	 *     OrExpression returns DeclaredVar
	 *     OrExpression.BinaryOperation_1_0_0_0 returns DeclaredVar
	 *     XorExpression returns DeclaredVar
	 *     XorExpression.BinaryOperation_1_0_0_0 returns DeclaredVar
	 *     AndExpression returns DeclaredVar
	 *     AndExpression.BinaryOperation_1_0_0_0 returns DeclaredVar
	 *     Comparison returns DeclaredVar
	 *     Comparison.BinaryOperation_1_0_0_0 returns DeclaredVar
	 *     EquExpression returns DeclaredVar
	 *     EquExpression.BinaryOperation_1_0_0_0 returns DeclaredVar
	 *     AddExpression returns DeclaredVar
	 *     AddExpression.BinaryOperation_1_0_0_0 returns DeclaredVar
	 *     MultiplicativeExpression returns DeclaredVar
	 *     MultiplicativeExpression.BinaryOperation_1_0_0_0 returns DeclaredVar
	 *     PowerExpression returns DeclaredVar
	 *     PowerExpression.BinaryOperation_1_0_0_0 returns DeclaredVar
	 *     UnaryExpression returns DeclaredVar
	 *     PrimaryExpression returns DeclaredVar
	 *     DeclaredVar returns DeclaredVar
	 *
	 * Constraint:
	 *     varName=[VarName|ID]
	 */
	protected void sequence_DeclaredVar(ISerializationContext context, DeclaredVar semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PortugolPackage.Literals.DECLARED_VAR__VAR_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PortugolPackage.Literals.DECLARED_VAR__VAR_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeclaredVarAccess().getVarNameVarNameIDTerminalRuleCall_0_1(), semanticObject.getVarName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCommand returns ForStatement
	 *     ForStatement returns ForStatement
	 *
	 * Constraint:
	 *     (operatorExpr=Expression startExpr=Expression endExpr=Expression stepExpe=Expression? commands+=AbstractCommand+)
	 */
	protected void sequence_ForStatement(ISerializationContext context, ForStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FunctionCall returns Expression
	 *
	 * Constraint:
	 *     (fbName=[FunctionName|ID] param=SubprogramParam)
	 */
	protected void sequence_FunctionCall(ISerializationContext context, Expression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PortugolPackage.Literals.EXPRESSION__FB_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PortugolPackage.Literals.EXPRESSION__FB_NAME));
			if (transientValues.isValueTransient(semanticObject, PortugolPackage.Literals.EXPRESSION__PARAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PortugolPackage.Literals.EXPRESSION__PARAM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFunctionCallAccess().getFbNameFunctionNameIDTerminalRuleCall_0_0_1(), semanticObject.getFbName());
		feeder.accept(grammarAccess.getFunctionCallAccess().getParamSubprogramParamParserRuleCall_2_0(), semanticObject.getParam());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCommand returns Expression
	 *     Expression returns Expression
	 *     Assignment returns Expression
	 *     Assignment.BinaryOperation_1_0_0_0 returns Expression
	 *     OrExpression returns Expression
	 *     OrExpression.BinaryOperation_1_0_0_0 returns Expression
	 *     XorExpression returns Expression
	 *     XorExpression.BinaryOperation_1_0_0_0 returns Expression
	 *     AndExpression returns Expression
	 *     AndExpression.BinaryOperation_1_0_0_0 returns Expression
	 *     Comparison returns Expression
	 *     Comparison.BinaryOperation_1_0_0_0 returns Expression
	 *     EquExpression returns Expression
	 *     EquExpression.BinaryOperation_1_0_0_0 returns Expression
	 *     AddExpression returns Expression
	 *     AddExpression.BinaryOperation_1_0_0_0 returns Expression
	 *     MultiplicativeExpression returns Expression
	 *     MultiplicativeExpression.BinaryOperation_1_0_0_0 returns Expression
	 *     PowerExpression returns Expression
	 *     PowerExpression.BinaryOperation_1_0_0_0 returns Expression
	 *     UnaryExpression returns Expression
	 *     PrimaryExpression returns Expression
	 *
	 * Constraint:
	 *     ((preDefFunctionName=PredefineFunctions param=SubprogramParam) | (fbName=[FunctionName|ID] param=SubprogramParam))
	 */
	protected void sequence_FunctionCall_PreDefinedFunctionCall(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FunctionName returns FunctionName
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_FunctionName(ISerializationContext context, FunctionName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PortugolPackage.Literals.FUNCTION_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PortugolPackage.Literals.FUNCTION_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFunctionNameAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     HeaderBlock returns HeaderBlock
	 *
	 * Constraint:
	 *     algorithmName=STRING
	 */
	protected void sequence_HeaderBlock(ISerializationContext context, HeaderBlock semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PortugolPackage.Literals.HEADER_BLOCK__ALGORITHM_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PortugolPackage.Literals.HEADER_BLOCK__ALGORITHM_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHeaderBlockAccess().getAlgorithmNameSTRINGTerminalRuleCall_1_0(), semanticObject.getAlgorithmName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCommand returns IfStatement
	 *     IfStatement returns IfStatement
	 *
	 * Constraint:
	 *     (expr=Expression commands+=AbstractCommand+ elseCommands+=AbstractCommand*)
	 */
	protected void sequence_IfStatement(ISerializationContext context, IfStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCommand returns Literal
	 *     Expression returns Literal
	 *     Assignment returns Literal
	 *     Assignment.BinaryOperation_1_0_0_0 returns Literal
	 *     OrExpression returns Literal
	 *     OrExpression.BinaryOperation_1_0_0_0 returns Literal
	 *     XorExpression returns Literal
	 *     XorExpression.BinaryOperation_1_0_0_0 returns Literal
	 *     AndExpression returns Literal
	 *     AndExpression.BinaryOperation_1_0_0_0 returns Literal
	 *     Comparison returns Literal
	 *     Comparison.BinaryOperation_1_0_0_0 returns Literal
	 *     EquExpression returns Literal
	 *     EquExpression.BinaryOperation_1_0_0_0 returns Literal
	 *     AddExpression returns Literal
	 *     AddExpression.BinaryOperation_1_0_0_0 returns Literal
	 *     MultiplicativeExpression returns Literal
	 *     MultiplicativeExpression.BinaryOperation_1_0_0_0 returns Literal
	 *     PowerExpression returns Literal
	 *     PowerExpression.BinaryOperation_1_0_0_0 returns Literal
	 *     UnaryExpression returns Literal
	 *     PrimaryExpression returns Literal
	 *     Literal returns Literal
	 *
	 * Constraint:
	 *     {Literal}
	 */
	protected void sequence_Literal(ISerializationContext context, Literal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (header=HeaderBlock globalDeclarations=DeclarationsBlock? subprograms=Subprograms? commands=BlockCommand)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCommand returns NumericLiteral
	 *     Expression returns NumericLiteral
	 *     Assignment returns NumericLiteral
	 *     Assignment.BinaryOperation_1_0_0_0 returns NumericLiteral
	 *     OrExpression returns NumericLiteral
	 *     OrExpression.BinaryOperation_1_0_0_0 returns NumericLiteral
	 *     XorExpression returns NumericLiteral
	 *     XorExpression.BinaryOperation_1_0_0_0 returns NumericLiteral
	 *     AndExpression returns NumericLiteral
	 *     AndExpression.BinaryOperation_1_0_0_0 returns NumericLiteral
	 *     Comparison returns NumericLiteral
	 *     Comparison.BinaryOperation_1_0_0_0 returns NumericLiteral
	 *     EquExpression returns NumericLiteral
	 *     EquExpression.BinaryOperation_1_0_0_0 returns NumericLiteral
	 *     AddExpression returns NumericLiteral
	 *     AddExpression.BinaryOperation_1_0_0_0 returns NumericLiteral
	 *     MultiplicativeExpression returns NumericLiteral
	 *     MultiplicativeExpression.BinaryOperation_1_0_0_0 returns NumericLiteral
	 *     PowerExpression returns NumericLiteral
	 *     PowerExpression.BinaryOperation_1_0_0_0 returns NumericLiteral
	 *     UnaryExpression returns NumericLiteral
	 *     PrimaryExpression returns NumericLiteral
	 *     Literal returns NumericLiteral
	 *     NumericLiteral returns NumericLiteral
	 *
	 * Constraint:
	 *     (intValue?=INT | floatValue?=FLOAT)
	 */
	protected void sequence_NumericLiteral(ISerializationContext context, NumericLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OptDecimalPrecision returns OptDecimalPrecision
	 *
	 * Constraint:
	 *     (firstPrecision=INT secondPrecision=INT?)
	 */
	protected void sequence_OptDecimalPrecision(ISerializationContext context, OptDecimalPrecision semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OtherCase returns OtherCase
	 *
	 * Constraint:
	 *     otherCaseCommands+=AbstractCommand+
	 */
	protected void sequence_OtherCase(ISerializationContext context, OtherCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PreDefinedFunctionCall returns Expression
	 *
	 * Constraint:
	 *     (preDefFunctionName=PredefineFunctions param=SubprogramParam)
	 */
	protected void sequence_PreDefinedFunctionCall(ISerializationContext context, Expression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PortugolPackage.Literals.EXPRESSION__PRE_DEF_FUNCTION_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PortugolPackage.Literals.EXPRESSION__PRE_DEF_FUNCTION_NAME));
			if (transientValues.isValueTransient(semanticObject, PortugolPackage.Literals.EXPRESSION__PARAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PortugolPackage.Literals.EXPRESSION__PARAM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPreDefinedFunctionCallAccess().getPreDefFunctionNamePredefineFunctionsParserRuleCall_0_0(), semanticObject.getPreDefFunctionName());
		feeder.accept(grammarAccess.getPreDefinedFunctionCallAccess().getParamSubprogramParamParserRuleCall_2_0(), semanticObject.getParam());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ProcedureCall returns Expression
	 *
	 * Constraint:
	 *     (fbName=[ProcedureName|ID] param=SubprogramParam)
	 */
	protected void sequence_ProcedureCall(ISerializationContext context, Expression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PortugolPackage.Literals.EXPRESSION__FB_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PortugolPackage.Literals.EXPRESSION__FB_NAME));
			if (transientValues.isValueTransient(semanticObject, PortugolPackage.Literals.EXPRESSION__PARAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PortugolPackage.Literals.EXPRESSION__PARAM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProcedureCallAccess().getFbNameProcedureNameIDTerminalRuleCall_0_0_1(), semanticObject.getFbName());
		feeder.accept(grammarAccess.getProcedureCallAccess().getParamSubprogramParamParserRuleCall_2_0(), semanticObject.getParam());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ProcedureName returns ProcedureName
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ProcedureName(ISerializationContext context, ProcedureName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PortugolPackage.Literals.PROCEDURE_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PortugolPackage.Literals.PROCEDURE_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProcedureNameAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCommand returns ReadCommand
	 *     ReadCommand returns ReadCommand
	 *
	 * Constraint:
	 *     paramList=DeclaredVarList
	 */
	protected void sequence_ReadCommand(ISerializationContext context, ReadCommand semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PortugolPackage.Literals.READ_COMMAND__PARAM_LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PortugolPackage.Literals.READ_COMMAND__PARAM_LIST));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReadCommandAccess().getParamListDeclaredVarListParserRuleCall_2_0(), semanticObject.getParamList());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCommand returns RepeatStatement
	 *     RepeatStatement returns RepeatStatement
	 *
	 * Constraint:
	 *     (commands+=AbstractCommand+ untilExpr=Expression)
	 */
	protected void sequence_RepeatStatement(ISerializationContext context, RepeatStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCommand returns ReturnExpression
	 *     ReturnStatement returns ReturnExpression
	 *
	 * Constraint:
	 *     expr=Expression
	 */
	protected void sequence_ReturnStatement(ISerializationContext context, ReturnExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PortugolPackage.Literals.RETURN_EXPRESSION__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PortugolPackage.Literals.RETURN_EXPRESSION__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReturnStatementAccess().getExprExpressionParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCommand returns StringExpression
	 *     Expression returns StringExpression
	 *     Assignment returns StringExpression
	 *     Assignment.BinaryOperation_1_0_0_0 returns StringExpression
	 *     OrExpression returns StringExpression
	 *     OrExpression.BinaryOperation_1_0_0_0 returns StringExpression
	 *     XorExpression returns StringExpression
	 *     XorExpression.BinaryOperation_1_0_0_0 returns StringExpression
	 *     AndExpression returns StringExpression
	 *     AndExpression.BinaryOperation_1_0_0_0 returns StringExpression
	 *     Comparison returns StringExpression
	 *     Comparison.BinaryOperation_1_0_0_0 returns StringExpression
	 *     EquExpression returns StringExpression
	 *     EquExpression.BinaryOperation_1_0_0_0 returns StringExpression
	 *     AddExpression returns StringExpression
	 *     AddExpression.BinaryOperation_1_0_0_0 returns StringExpression
	 *     MultiplicativeExpression returns StringExpression
	 *     MultiplicativeExpression.BinaryOperation_1_0_0_0 returns StringExpression
	 *     PowerExpression returns StringExpression
	 *     PowerExpression.BinaryOperation_1_0_0_0 returns StringExpression
	 *     UnaryExpression returns StringExpression
	 *     PrimaryExpression returns StringExpression
	 *     Literal returns StringExpression
	 *     StringExpression returns StringExpression
	 *
	 * Constraint:
	 *     literalString=STRING
	 */
	protected void sequence_StringExpression(ISerializationContext context, StringExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PortugolPackage.Literals.STRING_EXPRESSION__LITERAL_STRING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PortugolPackage.Literals.STRING_EXPRESSION__LITERAL_STRING));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringExpressionAccess().getLiteralStringSTRINGTerminalRuleCall_0(), semanticObject.getLiteralString());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SubprogramParam returns SubprogramParam
	 *
	 * Constraint:
	 *     (expression+=Expression expression+=Expression*)
	 */
	protected void sequence_SubprogramParam(ISerializationContext context, SubprogramParam semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Subprograms returns Subprograms
	 *
	 * Constraint:
	 *     blockSubPrograms+=BlockSubPrograms+
	 */
	protected void sequence_Subprograms(ISerializationContext context, Subprograms semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCommand returns SwitchCaseStatement
	 *     SwitchCaseStatement returns SwitchCaseStatement
	 *
	 * Constraint:
	 *     (variable=[VarName|ID] caseList+=CaseList+ otherCase=OtherCase?)
	 */
	protected void sequence_SwitchCaseStatement(ISerializationContext context, SwitchCaseStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCommand returns UnaryExpression
	 *     Expression returns UnaryExpression
	 *     Assignment returns UnaryExpression
	 *     Assignment.BinaryOperation_1_0_0_0 returns UnaryExpression
	 *     OrExpression returns UnaryExpression
	 *     OrExpression.BinaryOperation_1_0_0_0 returns UnaryExpression
	 *     XorExpression returns UnaryExpression
	 *     XorExpression.BinaryOperation_1_0_0_0 returns UnaryExpression
	 *     AndExpression returns UnaryExpression
	 *     AndExpression.BinaryOperation_1_0_0_0 returns UnaryExpression
	 *     Comparison returns UnaryExpression
	 *     Comparison.BinaryOperation_1_0_0_0 returns UnaryExpression
	 *     EquExpression returns UnaryExpression
	 *     EquExpression.BinaryOperation_1_0_0_0 returns UnaryExpression
	 *     AddExpression returns UnaryExpression
	 *     AddExpression.BinaryOperation_1_0_0_0 returns UnaryExpression
	 *     MultiplicativeExpression returns UnaryExpression
	 *     MultiplicativeExpression.BinaryOperation_1_0_0_0 returns UnaryExpression
	 *     PowerExpression returns UnaryExpression
	 *     PowerExpression.BinaryOperation_1_0_0_0 returns UnaryExpression
	 *     UnaryExpression returns UnaryExpression
	 *     PrimaryExpression returns UnaryExpression
	 *
	 * Constraint:
	 *     ((op='NOT' | op='-') operand=UnaryExpression)
	 */
	protected void sequence_UnaryExpression(ISerializationContext context, UnaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VarDeclaration returns VarDeclaration
	 *
	 * Constraint:
	 *     (vars+=VarName vars+=VarName*)
	 */
	protected void sequence_VarDeclaration(ISerializationContext context, VarDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VarName returns VarName
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_VarName(ISerializationContext context, VarName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PortugolPackage.Literals.VAR_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PortugolPackage.Literals.VAR_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarNameAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VarType returns VarType
	 *
	 * Constraint:
	 *     (typeName='real' | typeName='inteiro' | typeName='caractere' | typeName='caracter')
	 */
	protected void sequence_VarType(ISerializationContext context, VarType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     (varDeclaration=VarDeclaration type=VarType)
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PortugolPackage.Literals.VARIABLE__VAR_DECLARATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PortugolPackage.Literals.VARIABLE__VAR_DECLARATION));
			if (transientValues.isValueTransient(semanticObject, PortugolPackage.Literals.VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PortugolPackage.Literals.VARIABLE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getVarDeclarationVarDeclarationParserRuleCall_0_0(), semanticObject.getVarDeclaration());
		feeder.accept(grammarAccess.getVariableAccess().getTypeVarTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCommand returns WhileStatement
	 *     WhileStatement returns WhileStatement
	 *
	 * Constraint:
	 *     (whileExpr=Expression commands+=AbstractCommand+)
	 */
	protected void sequence_WhileStatement(ISerializationContext context, WhileStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractCommand returns WriteCommand
	 *     WriteCommand returns WriteCommand
	 *
	 * Constraint:
	 *     ((writeCommand='escreva' | writeCommand='escreval') writeParam=WriteParam)
	 */
	protected void sequence_WriteCommand(ISerializationContext context, WriteCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WriteParam returns WriteParam
	 *
	 * Constraint:
	 *     (params=SubprogramParam precision=OptDecimalPrecision?)
	 */
	protected void sequence_WriteParam(ISerializationContext context, WriteParam semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
