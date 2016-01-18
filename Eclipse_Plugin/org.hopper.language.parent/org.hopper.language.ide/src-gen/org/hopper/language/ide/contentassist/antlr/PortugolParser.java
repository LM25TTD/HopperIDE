/*
 * generated by Xtext 2.9.0
 */
package org.hopper.language.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.hopper.language.ide.contentassist.antlr.internal.InternalPortugolParser;
import org.hopper.language.services.PortugolGrammarAccess;

public class PortugolParser extends AbstractContentAssistParser {

	@Inject
	private PortugolGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalPortugolParser createParser() {
		InternalPortugolParser result = new InternalPortugolParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getVarTypeAccess().getTypeNameAlternatives_0(), "rule__VarType__TypeNameAlternatives_0");
					put(grammarAccess.getBlockSubProgramsAccess().getAlternatives(), "rule__BlockSubPrograms__Alternatives");
					put(grammarAccess.getAbstractCommandAccess().getAlternatives(), "rule__AbstractCommand__Alternatives");
					put(grammarAccess.getWriteCommandAccess().getWriteCommandAlternatives_0_0(), "rule__WriteCommand__WriteCommandAlternatives_0_0");
					put(grammarAccess.getAndExpressionAccess().getOpAlternatives_1_0_0_1_0(), "rule__AndExpression__OpAlternatives_1_0_0_1_0");
					put(grammarAccess.getComparisonAccess().getOpAlternatives_1_0_0_1_0(), "rule__Comparison__OpAlternatives_1_0_0_1_0");
					put(grammarAccess.getEquExpressionAccess().getOpAlternatives_1_0_0_1_0(), "rule__EquExpression__OpAlternatives_1_0_0_1_0");
					put(grammarAccess.getAddExpressionAccess().getOpAlternatives_1_0_0_1_0(), "rule__AddExpression__OpAlternatives_1_0_0_1_0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getOpAlternatives_1_0_0_1_0(), "rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0");
					put(grammarAccess.getUnaryExpressionAccess().getAlternatives(), "rule__UnaryExpression__Alternatives");
					put(grammarAccess.getUnaryExpressionAccess().getOpAlternatives_0_1_0(), "rule__UnaryExpression__OpAlternatives_0_1_0");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getNumericLiteralAccess().getAlternatives(), "rule__NumericLiteral__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getHeaderBlockAccess().getGroup(), "rule__HeaderBlock__Group__0");
					put(grammarAccess.getDeclarationsBlockAccess().getGroup(), "rule__DeclarationsBlock__Group__0");
					put(grammarAccess.getDeclarationsBlockAccess().getGroup_2(), "rule__DeclarationsBlock__Group_2__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getVarDeclarationAccess().getGroup(), "rule__VarDeclaration__Group__0");
					put(grammarAccess.getVarDeclarationAccess().getGroup_1(), "rule__VarDeclaration__Group_1__0");
					put(grammarAccess.getDeclaredVarListAccess().getGroup(), "rule__DeclaredVarList__Group__0");
					put(grammarAccess.getDeclaredVarListAccess().getGroup_1(), "rule__DeclaredVarList__Group_1__0");
					put(grammarAccess.getBlockFunctionAccess().getGroup(), "rule__BlockFunction__Group__0");
					put(grammarAccess.getBlockProcedureAccess().getGroup(), "rule__BlockProcedure__Group__0");
					put(grammarAccess.getBlockCommandAccess().getGroup(), "rule__BlockCommand__Group__0");
					put(grammarAccess.getAbstractCommandAccess().getGroup_0(), "rule__AbstractCommand__Group_0__0");
					put(grammarAccess.getAbstractCommandAccess().getGroup_1(), "rule__AbstractCommand__Group_1__0");
					put(grammarAccess.getAbstractCommandAccess().getGroup_2(), "rule__AbstractCommand__Group_2__0");
					put(grammarAccess.getAbstractCommandAccess().getGroup_3(), "rule__AbstractCommand__Group_3__0");
					put(grammarAccess.getAbstractCommandAccess().getGroup_4(), "rule__AbstractCommand__Group_4__0");
					put(grammarAccess.getAbstractCommandAccess().getGroup_5(), "rule__AbstractCommand__Group_5__0");
					put(grammarAccess.getAbstractCommandAccess().getGroup_6(), "rule__AbstractCommand__Group_6__0");
					put(grammarAccess.getAbstractCommandAccess().getGroup_7(), "rule__AbstractCommand__Group_7__0");
					put(grammarAccess.getIfStatementAccess().getGroup(), "rule__IfStatement__Group__0");
					put(grammarAccess.getIfStatementAccess().getGroup_5(), "rule__IfStatement__Group_5__0");
					put(grammarAccess.getSwitchCaseStatementAccess().getGroup(), "rule__SwitchCaseStatement__Group__0");
					put(grammarAccess.getCaseListAccess().getGroup(), "rule__CaseList__Group__0");
					put(grammarAccess.getCaseListAccess().getGroup_4(), "rule__CaseList__Group_4__0");
					put(grammarAccess.getOtherCaseAccess().getGroup(), "rule__OtherCase__Group__0");
					put(grammarAccess.getOtherCaseAccess().getGroup_3(), "rule__OtherCase__Group_3__0");
					put(grammarAccess.getForStatementAccess().getGroup(), "rule__ForStatement__Group__0");
					put(grammarAccess.getForStatementAccess().getGroup_6(), "rule__ForStatement__Group_6__0");
					put(grammarAccess.getWhileStatementAccess().getGroup(), "rule__WhileStatement__Group__0");
					put(grammarAccess.getRepeatStatementAccess().getGroup(), "rule__RepeatStatement__Group__0");
					put(grammarAccess.getSubprogramParamAccess().getGroup(), "rule__SubprogramParam__Group__0");
					put(grammarAccess.getSubprogramParamAccess().getGroup_1(), "rule__SubprogramParam__Group_1__0");
					put(grammarAccess.getReadCommandAccess().getGroup(), "rule__ReadCommand__Group__0");
					put(grammarAccess.getWriteCommandAccess().getGroup(), "rule__WriteCommand__Group__0");
					put(grammarAccess.getWriteParamAccess().getGroup(), "rule__WriteParam__Group__0");
					put(grammarAccess.getOptDecimalPrecisionAccess().getGroup(), "rule__OptDecimalPrecision__Group__0");
					put(grammarAccess.getOptDecimalPrecisionAccess().getGroup_2(), "rule__OptDecimalPrecision__Group_2__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getAssignmentAccess().getGroup_1(), "rule__Assignment__Group_1__0");
					put(grammarAccess.getAssignmentAccess().getGroup_1_0(), "rule__Assignment__Group_1_0__0");
					put(grammarAccess.getAssignmentAccess().getGroup_1_0_0(), "rule__Assignment__Group_1_0_0__0");
					put(grammarAccess.getOrExpressionAccess().getGroup(), "rule__OrExpression__Group__0");
					put(grammarAccess.getOrExpressionAccess().getGroup_1(), "rule__OrExpression__Group_1__0");
					put(grammarAccess.getOrExpressionAccess().getGroup_1_0(), "rule__OrExpression__Group_1_0__0");
					put(grammarAccess.getOrExpressionAccess().getGroup_1_0_0(), "rule__OrExpression__Group_1_0_0__0");
					put(grammarAccess.getXorExpressionAccess().getGroup(), "rule__XorExpression__Group__0");
					put(grammarAccess.getXorExpressionAccess().getGroup_1(), "rule__XorExpression__Group_1__0");
					put(grammarAccess.getXorExpressionAccess().getGroup_1_0(), "rule__XorExpression__Group_1_0__0");
					put(grammarAccess.getXorExpressionAccess().getGroup_1_0_0(), "rule__XorExpression__Group_1_0_0__0");
					put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1(), "rule__AndExpression__Group_1__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1_0(), "rule__AndExpression__Group_1_0__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1_0_0(), "rule__AndExpression__Group_1_0_0__0");
					put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
					put(grammarAccess.getComparisonAccess().getGroup_1(), "rule__Comparison__Group_1__0");
					put(grammarAccess.getComparisonAccess().getGroup_1_0(), "rule__Comparison__Group_1_0__0");
					put(grammarAccess.getComparisonAccess().getGroup_1_0_0(), "rule__Comparison__Group_1_0_0__0");
					put(grammarAccess.getEquExpressionAccess().getGroup(), "rule__EquExpression__Group__0");
					put(grammarAccess.getEquExpressionAccess().getGroup_1(), "rule__EquExpression__Group_1__0");
					put(grammarAccess.getEquExpressionAccess().getGroup_1_0(), "rule__EquExpression__Group_1_0__0");
					put(grammarAccess.getEquExpressionAccess().getGroup_1_0_0(), "rule__EquExpression__Group_1_0_0__0");
					put(grammarAccess.getAddExpressionAccess().getGroup(), "rule__AddExpression__Group__0");
					put(grammarAccess.getAddExpressionAccess().getGroup_1(), "rule__AddExpression__Group_1__0");
					put(grammarAccess.getAddExpressionAccess().getGroup_1_0(), "rule__AddExpression__Group_1_0__0");
					put(grammarAccess.getAddExpressionAccess().getGroup_1_0_0(), "rule__AddExpression__Group_1_0_0__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup(), "rule__MultiplicativeExpression__Group__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1(), "rule__MultiplicativeExpression__Group_1__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0(), "rule__MultiplicativeExpression__Group_1_0__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0_0(), "rule__MultiplicativeExpression__Group_1_0_0__0");
					put(grammarAccess.getPowerExpressionAccess().getGroup(), "rule__PowerExpression__Group__0");
					put(grammarAccess.getPowerExpressionAccess().getGroup_1(), "rule__PowerExpression__Group_1__0");
					put(grammarAccess.getPowerExpressionAccess().getGroup_1_0(), "rule__PowerExpression__Group_1_0__0");
					put(grammarAccess.getPowerExpressionAccess().getGroup_1_0_0(), "rule__PowerExpression__Group_1_0_0__0");
					put(grammarAccess.getUnaryExpressionAccess().getGroup_0(), "rule__UnaryExpression__Group_0__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_3(), "rule__PrimaryExpression__Group_3__0");
					put(grammarAccess.getFunctionCallAccess().getGroup(), "rule__FunctionCall__Group__0");
					put(grammarAccess.getProcedureCallAccess().getGroup(), "rule__ProcedureCall__Group__0");
					put(grammarAccess.getModelAccess().getHeaderAssignment_0(), "rule__Model__HeaderAssignment_0");
					put(grammarAccess.getModelAccess().getGlobalDeclarationsAssignment_1(), "rule__Model__GlobalDeclarationsAssignment_1");
					put(grammarAccess.getModelAccess().getSubprogramsAssignment_2(), "rule__Model__SubprogramsAssignment_2");
					put(grammarAccess.getModelAccess().getCommandsAssignment_3(), "rule__Model__CommandsAssignment_3");
					put(grammarAccess.getHeaderBlockAccess().getAlgorithmNameAssignment_1(), "rule__HeaderBlock__AlgorithmNameAssignment_1");
					put(grammarAccess.getDeclarationsBlockAccess().getVarsAssignment_2_0(), "rule__DeclarationsBlock__VarsAssignment_2_0");
					put(grammarAccess.getVariableAccess().getVarDeclarationAssignment_0(), "rule__Variable__VarDeclarationAssignment_0");
					put(grammarAccess.getVariableAccess().getTypeAssignment_2(), "rule__Variable__TypeAssignment_2");
					put(grammarAccess.getVarDeclarationAccess().getVarsAssignment_0(), "rule__VarDeclaration__VarsAssignment_0");
					put(grammarAccess.getVarDeclarationAccess().getVarsAssignment_1_1(), "rule__VarDeclaration__VarsAssignment_1_1");
					put(grammarAccess.getDeclaredVarListAccess().getVarsAssignment_0(), "rule__DeclaredVarList__VarsAssignment_0");
					put(grammarAccess.getDeclaredVarListAccess().getVarsAssignment_1_1(), "rule__DeclaredVarList__VarsAssignment_1_1");
					put(grammarAccess.getVarNameAccess().getNameAssignment(), "rule__VarName__NameAssignment");
					put(grammarAccess.getVarTypeAccess().getTypeNameAssignment(), "rule__VarType__TypeNameAssignment");
					put(grammarAccess.getSubprogramsAccess().getBlockSubProgramsAssignment(), "rule__Subprograms__BlockSubProgramsAssignment");
					put(grammarAccess.getProcedureNameAccess().getNameAssignment(), "rule__ProcedureName__NameAssignment");
					put(grammarAccess.getFunctionNameAccess().getNameAssignment(), "rule__FunctionName__NameAssignment");
					put(grammarAccess.getBlockFunctionAccess().getFunctionNameAssignment_1(), "rule__BlockFunction__FunctionNameAssignment_1");
					put(grammarAccess.getBlockFunctionAccess().getParamListAssignment_3(), "rule__BlockFunction__ParamListAssignment_3");
					put(grammarAccess.getBlockFunctionAccess().getReturnTypeAssignment_6(), "rule__BlockFunction__ReturnTypeAssignment_6");
					put(grammarAccess.getBlockFunctionAccess().getDeclarationsAssignment_8(), "rule__BlockFunction__DeclarationsAssignment_8");
					put(grammarAccess.getBlockFunctionAccess().getCommandsAssignment_11(), "rule__BlockFunction__CommandsAssignment_11");
					put(grammarAccess.getBlockProcedureAccess().getProcedureAssignment_1(), "rule__BlockProcedure__ProcedureAssignment_1");
					put(grammarAccess.getBlockProcedureAccess().getParamListAssignment_3(), "rule__BlockProcedure__ParamListAssignment_3");
					put(grammarAccess.getBlockProcedureAccess().getDeclarationsAssignment_6(), "rule__BlockProcedure__DeclarationsAssignment_6");
					put(grammarAccess.getBlockProcedureAccess().getCommandsAssignment_9(), "rule__BlockProcedure__CommandsAssignment_9");
					put(grammarAccess.getBlockCommandAccess().getCommandsAssignment_2(), "rule__BlockCommand__CommandsAssignment_2");
					put(grammarAccess.getIfStatementAccess().getExprAssignment_1(), "rule__IfStatement__ExprAssignment_1");
					put(grammarAccess.getIfStatementAccess().getCommandsAssignment_4(), "rule__IfStatement__CommandsAssignment_4");
					put(grammarAccess.getIfStatementAccess().getElseCommandsAssignment_5_2(), "rule__IfStatement__ElseCommandsAssignment_5_2");
					put(grammarAccess.getSwitchCaseStatementAccess().getVariableAssignment_1(), "rule__SwitchCaseStatement__VariableAssignment_1");
					put(grammarAccess.getSwitchCaseStatementAccess().getCaseListAssignment_3(), "rule__SwitchCaseStatement__CaseListAssignment_3");
					put(grammarAccess.getSwitchCaseStatementAccess().getOtherCaseAssignment_4(), "rule__SwitchCaseStatement__OtherCaseAssignment_4");
					put(grammarAccess.getCaseListAccess().getExprAssignment_1(), "rule__CaseList__ExprAssignment_1");
					put(grammarAccess.getCaseListAccess().getCommandsAssignment_3(), "rule__CaseList__CommandsAssignment_3");
					put(grammarAccess.getCaseListAccess().getBreakStatementAssignment_4_0(), "rule__CaseList__BreakStatementAssignment_4_0");
					put(grammarAccess.getOtherCaseAccess().getOtherCaseCommandsAssignment_2(), "rule__OtherCase__OtherCaseCommandsAssignment_2");
					put(grammarAccess.getOtherCaseAccess().getBreakStatementAssignment_3_0(), "rule__OtherCase__BreakStatementAssignment_3_0");
					put(grammarAccess.getForStatementAccess().getOperatorExprAssignment_1(), "rule__ForStatement__OperatorExprAssignment_1");
					put(grammarAccess.getForStatementAccess().getStartExprAssignment_3(), "rule__ForStatement__StartExprAssignment_3");
					put(grammarAccess.getForStatementAccess().getEndExprAssignment_5(), "rule__ForStatement__EndExprAssignment_5");
					put(grammarAccess.getForStatementAccess().getStepExpeAssignment_6_1(), "rule__ForStatement__StepExpeAssignment_6_1");
					put(grammarAccess.getForStatementAccess().getCommandsAssignment_9(), "rule__ForStatement__CommandsAssignment_9");
					put(grammarAccess.getWhileStatementAccess().getWhileExprAssignment_1(), "rule__WhileStatement__WhileExprAssignment_1");
					put(grammarAccess.getWhileStatementAccess().getCommandsAssignment_4(), "rule__WhileStatement__CommandsAssignment_4");
					put(grammarAccess.getRepeatStatementAccess().getCommandsAssignment_2(), "rule__RepeatStatement__CommandsAssignment_2");
					put(grammarAccess.getRepeatStatementAccess().getUntilExprAssignment_4(), "rule__RepeatStatement__UntilExprAssignment_4");
					put(grammarAccess.getSubprogramParamAccess().getExpressionAssignment_0(), "rule__SubprogramParam__ExpressionAssignment_0");
					put(grammarAccess.getSubprogramParamAccess().getExpressionAssignment_1_1(), "rule__SubprogramParam__ExpressionAssignment_1_1");
					put(grammarAccess.getReadCommandAccess().getParamListAssignment_2(), "rule__ReadCommand__ParamListAssignment_2");
					put(grammarAccess.getWriteCommandAccess().getWriteCommandAssignment_0(), "rule__WriteCommand__WriteCommandAssignment_0");
					put(grammarAccess.getWriteCommandAccess().getWriteParamAssignment_2(), "rule__WriteCommand__WriteParamAssignment_2");
					put(grammarAccess.getWriteParamAccess().getParamsAssignment_0(), "rule__WriteParam__ParamsAssignment_0");
					put(grammarAccess.getWriteParamAccess().getPrecisionAssignment_1(), "rule__WriteParam__PrecisionAssignment_1");
					put(grammarAccess.getOptDecimalPrecisionAccess().getFirstPrecisionAssignment_1(), "rule__OptDecimalPrecision__FirstPrecisionAssignment_1");
					put(grammarAccess.getOptDecimalPrecisionAccess().getSecondPrecisionAssignment_2_1(), "rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1");
					put(grammarAccess.getAssignmentAccess().getOpAssignment_1_0_0_1(), "rule__Assignment__OpAssignment_1_0_0_1");
					put(grammarAccess.getAssignmentAccess().getRightAssignment_1_1(), "rule__Assignment__RightAssignment_1_1");
					put(grammarAccess.getOrExpressionAccess().getOpAssignment_1_0_0_1(), "rule__OrExpression__OpAssignment_1_0_0_1");
					put(grammarAccess.getOrExpressionAccess().getRightAssignment_1_1(), "rule__OrExpression__RightAssignment_1_1");
					put(grammarAccess.getXorExpressionAccess().getOpAssignment_1_0_0_1(), "rule__XorExpression__OpAssignment_1_0_0_1");
					put(grammarAccess.getXorExpressionAccess().getRightAssignment_1_1(), "rule__XorExpression__RightAssignment_1_1");
					put(grammarAccess.getAndExpressionAccess().getOpAssignment_1_0_0_1(), "rule__AndExpression__OpAssignment_1_0_0_1");
					put(grammarAccess.getAndExpressionAccess().getRightAssignment_1_1(), "rule__AndExpression__RightAssignment_1_1");
					put(grammarAccess.getComparisonAccess().getOpAssignment_1_0_0_1(), "rule__Comparison__OpAssignment_1_0_0_1");
					put(grammarAccess.getComparisonAccess().getRightAssignment_1_1(), "rule__Comparison__RightAssignment_1_1");
					put(grammarAccess.getEquExpressionAccess().getOpAssignment_1_0_0_1(), "rule__EquExpression__OpAssignment_1_0_0_1");
					put(grammarAccess.getEquExpressionAccess().getRightAssignment_1_1(), "rule__EquExpression__RightAssignment_1_1");
					put(grammarAccess.getAddExpressionAccess().getOpAssignment_1_0_0_1(), "rule__AddExpression__OpAssignment_1_0_0_1");
					put(grammarAccess.getAddExpressionAccess().getRightAssignment_1_1(), "rule__AddExpression__RightAssignment_1_1");
					put(grammarAccess.getMultiplicativeExpressionAccess().getOpAssignment_1_0_0_1(), "rule__MultiplicativeExpression__OpAssignment_1_0_0_1");
					put(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_1(), "rule__MultiplicativeExpression__RightAssignment_1_1");
					put(grammarAccess.getPowerExpressionAccess().getOpAssignment_1_0_0_1(), "rule__PowerExpression__OpAssignment_1_0_0_1");
					put(grammarAccess.getPowerExpressionAccess().getRightAssignment_1_1(), "rule__PowerExpression__RightAssignment_1_1");
					put(grammarAccess.getUnaryExpressionAccess().getOpAssignment_0_1(), "rule__UnaryExpression__OpAssignment_0_1");
					put(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_0_2(), "rule__UnaryExpression__OperandAssignment_0_2");
					put(grammarAccess.getFunctionCallAccess().getFbNameAssignment_0(), "rule__FunctionCall__FbNameAssignment_0");
					put(grammarAccess.getFunctionCallAccess().getParamAssignment_2(), "rule__FunctionCall__ParamAssignment_2");
					put(grammarAccess.getProcedureCallAccess().getFbNameAssignment_0(), "rule__ProcedureCall__FbNameAssignment_0");
					put(grammarAccess.getProcedureCallAccess().getParamAssignment_2(), "rule__ProcedureCall__ParamAssignment_2");
					put(grammarAccess.getDeclaredVarAccess().getVarNameAssignment(), "rule__DeclaredVar__VarNameAssignment");
					put(grammarAccess.getNumericLiteralAccess().getIntValueAssignment_0(), "rule__NumericLiteral__IntValueAssignment_0");
					put(grammarAccess.getNumericLiteralAccess().getFloatValueAssignment_1(), "rule__NumericLiteral__FloatValueAssignment_1");
					put(grammarAccess.getStringExpressionAccess().getLiteralStringAssignment(), "rule__StringExpression__LiteralStringAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalPortugolParser typedParser = (InternalPortugolParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PortugolGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PortugolGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
