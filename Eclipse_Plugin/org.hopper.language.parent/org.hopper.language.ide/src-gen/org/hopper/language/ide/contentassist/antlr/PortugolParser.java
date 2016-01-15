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
					put(grammarAccess.getAndExpressionAccess().getOpAlternatives_1_0_1_0(), "rule__AndExpression__OpAlternatives_1_0_1_0");
					put(grammarAccess.getComparisonAccess().getOpAlternatives_1_0_1_0(), "rule__Comparison__OpAlternatives_1_0_1_0");
					put(grammarAccess.getEquExpressionAccess().getOpAlternatives_1_0_1_0(), "rule__EquExpression__OpAlternatives_1_0_1_0");
					put(grammarAccess.getAddExpressionAccess().getAlternatives_1_0(), "rule__AddExpression__Alternatives_1_0");
					put(grammarAccess.getTermAccess().getAlternatives_1_0(), "rule__Term__Alternatives_1_0");
					put(grammarAccess.getUnaryExpressionAccess().getAlternatives(), "rule__UnaryExpression__Alternatives");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getConstantAccess().getAlternatives(), "rule__Constant__Alternatives");
					put(grammarAccess.getNumericLiteralAccess().getAlternatives(), "rule__NumericLiteral__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getHeaderBlockAccess().getGroup(), "rule__HeaderBlock__Group__0");
					put(grammarAccess.getDeclarationsBlockAccess().getGroup(), "rule__DeclarationsBlock__Group__0");
					put(grammarAccess.getDeclarationsBlockAccess().getGroup_2(), "rule__DeclarationsBlock__Group_2__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getVarDeclarationAccess().getGroup(), "rule__VarDeclaration__Group__0");
					put(grammarAccess.getVarDeclarationAccess().getGroup_1(), "rule__VarDeclaration__Group_1__0");
					put(grammarAccess.getDeclaredVarAccess().getGroup(), "rule__DeclaredVar__Group__0");
					put(grammarAccess.getDeclaredVarAccess().getGroup_1(), "rule__DeclaredVar__Group_1__0");
					put(grammarAccess.getBlockFunctionAccess().getGroup(), "rule__BlockFunction__Group__0");
					put(grammarAccess.getBlockProcedureAccess().getGroup(), "rule__BlockProcedure__Group__0");
					put(grammarAccess.getBlockCommandAccess().getGroup(), "rule__BlockCommand__Group__0");
					put(grammarAccess.getReadCommandAccess().getGroup(), "rule__ReadCommand__Group__0");
					put(grammarAccess.getWriteCommandAccess().getGroup(), "rule__WriteCommand__Group__0");
					put(grammarAccess.getWriteParamAccess().getGroup(), "rule__WriteParam__Group__0");
					put(grammarAccess.getWriteParamAccess().getGroup_1(), "rule__WriteParam__Group_1__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
					put(grammarAccess.getExpressionAccess().getGroup_1_0(), "rule__Expression__Group_1_0__0");
					put(grammarAccess.getXorExpressionAccess().getGroup(), "rule__XorExpression__Group__0");
					put(grammarAccess.getXorExpressionAccess().getGroup_1(), "rule__XorExpression__Group_1__0");
					put(grammarAccess.getXorExpressionAccess().getGroup_1_0(), "rule__XorExpression__Group_1_0__0");
					put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1(), "rule__AndExpression__Group_1__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1_0(), "rule__AndExpression__Group_1_0__0");
					put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
					put(grammarAccess.getComparisonAccess().getGroup_1(), "rule__Comparison__Group_1__0");
					put(grammarAccess.getComparisonAccess().getGroup_1_0(), "rule__Comparison__Group_1_0__0");
					put(grammarAccess.getEquExpressionAccess().getGroup(), "rule__EquExpression__Group__0");
					put(grammarAccess.getEquExpressionAccess().getGroup_1(), "rule__EquExpression__Group_1__0");
					put(grammarAccess.getEquExpressionAccess().getGroup_1_0(), "rule__EquExpression__Group_1_0__0");
					put(grammarAccess.getAddExpressionAccess().getGroup(), "rule__AddExpression__Group__0");
					put(grammarAccess.getAddExpressionAccess().getGroup_1(), "rule__AddExpression__Group_1__0");
					put(grammarAccess.getAddExpressionAccess().getGroup_1_0_0(), "rule__AddExpression__Group_1_0_0__0");
					put(grammarAccess.getAddExpressionAccess().getGroup_1_0_1(), "rule__AddExpression__Group_1_0_1__0");
					put(grammarAccess.getTermAccess().getGroup(), "rule__Term__Group__0");
					put(grammarAccess.getTermAccess().getGroup_1(), "rule__Term__Group_1__0");
					put(grammarAccess.getTermAccess().getGroup_1_0_0(), "rule__Term__Group_1_0_0__0");
					put(grammarAccess.getTermAccess().getGroup_1_0_1(), "rule__Term__Group_1_0_1__0");
					put(grammarAccess.getTermAccess().getGroup_1_0_2(), "rule__Term__Group_1_0_2__0");
					put(grammarAccess.getPowerExpressionAccess().getGroup(), "rule__PowerExpression__Group__0");
					put(grammarAccess.getPowerExpressionAccess().getGroup_1(), "rule__PowerExpression__Group_1__0");
					put(grammarAccess.getUnaryExpressionAccess().getGroup_0(), "rule__UnaryExpression__Group_0__0");
					put(grammarAccess.getUnaryExpressionAccess().getGroup_1(), "rule__UnaryExpression__Group_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0(), "rule__PrimaryExpression__Group_0__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_1(), "rule__PrimaryExpression__Group_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_2(), "rule__PrimaryExpression__Group_2__0");
					put(grammarAccess.getFunctionCallAccess().getGroup(), "rule__FunctionCall__Group__0");
					put(grammarAccess.getOptDecimalPrecisionAccess().getGroup(), "rule__OptDecimalPrecision__Group__0");
					put(grammarAccess.getOptDecimalPrecisionAccess().getGroup_2(), "rule__OptDecimalPrecision__Group_2__0");
					put(grammarAccess.getModelAccess().getHeaderAssignment_0(), "rule__Model__HeaderAssignment_0");
					put(grammarAccess.getModelAccess().getGlobalDeclarationsAssignment_1(), "rule__Model__GlobalDeclarationsAssignment_1");
					put(grammarAccess.getModelAccess().getSubprogramsAssignment_2(), "rule__Model__SubprogramsAssignment_2");
					put(grammarAccess.getModelAccess().getCommandsAssignment_3(), "rule__Model__CommandsAssignment_3");
					put(grammarAccess.getHeaderBlockAccess().getNameAssignment_1(), "rule__HeaderBlock__NameAssignment_1");
					put(grammarAccess.getDeclarationsBlockAccess().getVarsAssignment_2_0(), "rule__DeclarationsBlock__VarsAssignment_2_0");
					put(grammarAccess.getVariableAccess().getVarDeclarationAssignment_0(), "rule__Variable__VarDeclarationAssignment_0");
					put(grammarAccess.getVariableAccess().getTypeAssignment_2(), "rule__Variable__TypeAssignment_2");
					put(grammarAccess.getVarDeclarationAccess().getVarsAssignment_0(), "rule__VarDeclaration__VarsAssignment_0");
					put(grammarAccess.getVarDeclarationAccess().getVarsAssignment_1_1(), "rule__VarDeclaration__VarsAssignment_1_1");
					put(grammarAccess.getDeclaredVarAccess().getVarsAssignment_0(), "rule__DeclaredVar__VarsAssignment_0");
					put(grammarAccess.getDeclaredVarAccess().getVarsAssignment_1_1(), "rule__DeclaredVar__VarsAssignment_1_1");
					put(grammarAccess.getVarNameAccess().getNameAssignment(), "rule__VarName__NameAssignment");
					put(grammarAccess.getVarTypeAccess().getTypeNameAssignment(), "rule__VarType__TypeNameAssignment");
					put(grammarAccess.getSubprogramsAccess().getBlockSubProgramsAssignment(), "rule__Subprograms__BlockSubProgramsAssignment");
					put(grammarAccess.getFunctionNameAccess().getNameAssignment(), "rule__FunctionName__NameAssignment");
					put(grammarAccess.getProcedureNameAccess().getNameAssignment(), "rule__ProcedureName__NameAssignment");
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
					put(grammarAccess.getReadCommandAccess().getParamListAssignment_2(), "rule__ReadCommand__ParamListAssignment_2");
					put(grammarAccess.getWriteCommandAccess().getWriteParamAssignment_2(), "rule__WriteCommand__WriteParamAssignment_2");
					put(grammarAccess.getWriteParamAccess().getExpressionAssignment_0(), "rule__WriteParam__ExpressionAssignment_0");
					put(grammarAccess.getWriteParamAccess().getExpressionAssignment_1_1(), "rule__WriteParam__ExpressionAssignment_1_1");
					put(grammarAccess.getWriteParamAccess().getPrecisionAssignment_2(), "rule__WriteParam__PrecisionAssignment_2");
					put(grammarAccess.getExpressionAccess().getOpAssignment_1_0_1(), "rule__Expression__OpAssignment_1_0_1");
					put(grammarAccess.getExpressionAccess().getRightAssignment_1_1(), "rule__Expression__RightAssignment_1_1");
					put(grammarAccess.getXorExpressionAccess().getOpAssignment_1_0_1(), "rule__XorExpression__OpAssignment_1_0_1");
					put(grammarAccess.getXorExpressionAccess().getRightAssignment_1_1(), "rule__XorExpression__RightAssignment_1_1");
					put(grammarAccess.getAndExpressionAccess().getOpAssignment_1_0_1(), "rule__AndExpression__OpAssignment_1_0_1");
					put(grammarAccess.getAndExpressionAccess().getRightAssignment_1_1(), "rule__AndExpression__RightAssignment_1_1");
					put(grammarAccess.getComparisonAccess().getOpAssignment_1_0_1(), "rule__Comparison__OpAssignment_1_0_1");
					put(grammarAccess.getComparisonAccess().getRightAssignment_1_1(), "rule__Comparison__RightAssignment_1_1");
					put(grammarAccess.getEquExpressionAccess().getOpAssignment_1_0_1(), "rule__EquExpression__OpAssignment_1_0_1");
					put(grammarAccess.getEquExpressionAccess().getRightAssignment_1_1(), "rule__EquExpression__RightAssignment_1_1");
					put(grammarAccess.getAddExpressionAccess().getRightAssignment_1_1(), "rule__AddExpression__RightAssignment_1_1");
					put(grammarAccess.getTermAccess().getRightAssignment_1_1(), "rule__Term__RightAssignment_1_1");
					put(grammarAccess.getPowerExpressionAccess().getOpAssignment_1_1(), "rule__PowerExpression__OpAssignment_1_1");
					put(grammarAccess.getPowerExpressionAccess().getRightAssignment_1_2(), "rule__PowerExpression__RightAssignment_1_2");
					put(grammarAccess.getUnaryExpressionAccess().getExpressionAssignment_0_2(), "rule__UnaryExpression__ExpressionAssignment_0_2");
					put(grammarAccess.getUnaryExpressionAccess().getExpressionAssignment_1_2(), "rule__UnaryExpression__ExpressionAssignment_1_2");
					put(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_0_1(), "rule__PrimaryExpression__ValueAssignment_0_1");
					put(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1(), "rule__PrimaryExpression__ValueAssignment_1_1");
					put(grammarAccess.getFunctionCallAccess().getFbNameAssignment_0(), "rule__FunctionCall__FbNameAssignment_0");
					put(grammarAccess.getFunctionCallAccess().getParamAssignment_2(), "rule__FunctionCall__ParamAssignment_2");
					put(grammarAccess.getOptDecimalPrecisionAccess().getFirstPrecisionAssignment_1(), "rule__OptDecimalPrecision__FirstPrecisionAssignment_1");
					put(grammarAccess.getOptDecimalPrecisionAccess().getSecondPrecisionAssignment_2_1(), "rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1");
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
