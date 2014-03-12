package com.hopper.serializer;

import com.google.inject.Inject;
import com.hopper.services.PortugolGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class PortugolSyntacticSequencer extends AbstractSyntacticSequencer {

	protected PortugolGrammarAccess grammarAccess;
	protected AbstractElementAlias match_HEADER_WSTerminalRuleCall_1_a;
	protected AbstractElementAlias match_HEADER_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_Programa_WSTerminalRuleCall_0_a;
	protected AbstractElementAlias match_Programa_WSTerminalRuleCall_2_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PortugolGrammarAccess) access;
		match_HEADER_WSTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getHEADERAccess().getWSTerminalRuleCall_1());
		match_HEADER_WSTerminalRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getHEADERAccess().getWSTerminalRuleCall_3());
		match_Programa_WSTerminalRuleCall_0_a = new TokenAlias(true, true, grammarAccess.getProgramaAccess().getWSTerminalRuleCall_0());
		match_Programa_WSTerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getProgramaAccess().getWSTerminalRuleCall_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getALGORITMORule())
			return getALGORITMOToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * ALGORITMO:
	 * 	'algoritmo';
	 */
	protected String getALGORITMOToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "algoritmo";
	}
	
	/**
	 * terminal WS			: (' '|'\t'|'\r'|'\n')+;
	 */
	protected String getWSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_HEADER_WSTerminalRuleCall_1_a.equals(syntax))
				emit_HEADER_WSTerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_HEADER_WSTerminalRuleCall_3_a.equals(syntax))
				emit_HEADER_WSTerminalRuleCall_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Programa_WSTerminalRuleCall_0_a.equals(syntax))
				emit_Programa_WSTerminalRuleCall_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Programa_WSTerminalRuleCall_2_a.equals(syntax))
				emit_Programa_WSTerminalRuleCall_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_HEADER_WSTerminalRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_HEADER_WSTerminalRuleCall_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Programa_WSTerminalRuleCall_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Programa_WSTerminalRuleCall_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
