/*
* generated by Xtext
*/
grammar InternalPortugol;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package com.hopper.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.hopper.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.hopper.services.PortugolGrammarAccess;

}

@parser::members {

 	private PortugolGrammarAccess grammarAccess;
 	
    public InternalPortugolParser(TokenStream input, PortugolGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected PortugolGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getMainProgramaParserRuleCall_0()); 
	    }
		lv_main_0_0=rulePrograma		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		set(
       			$current, 
       			"main",
        		lv_main_0_0, 
        		"Programa");
	        afterParserOrEnumRuleCall();
	    }

)
)
;









// Entry rule entryRuleALGORITMO
entryRuleALGORITMO returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getALGORITMORule()); } 
	 iv_ruleALGORITMO=ruleALGORITMO 
	 { $current=$iv_ruleALGORITMO.current.getText(); }  
	 EOF 
;

// Rule ALGORITMO
ruleALGORITMO returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

	kw='algoritmo' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getALGORITMOAccess().getAlgoritmoKeyword()); 
    }

    ;











































































































































































































// Entry rule entryRulePrograma
entryRulePrograma returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProgramaRule()); }
	 iv_rulePrograma=rulePrograma 
	 { $current=$iv_rulePrograma.current; } 
	 EOF 
;

// Rule Programa
rulePrograma returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((this_WS_0=RULE_WS
    { 
    newLeafNode(this_WS_0, grammarAccess.getProgramaAccess().getWSTerminalRuleCall_0()); 
    }
)*
    { 
        newCompositeNode(grammarAccess.getProgramaAccess().getHEADERParserRuleCall_1()); 
    }
    this_HEADER_1=ruleHEADER
    { 
        $current = $this_HEADER_1.current; 
        afterParserOrEnumRuleCall();
    }
(this_WS_2=RULE_WS
    { 
    newLeafNode(this_WS_2, grammarAccess.getProgramaAccess().getWSTerminalRuleCall_2()); 
    }
)*)
;





// Entry rule entryRuleHEADER
entryRuleHEADER returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getHEADERRule()); }
	 iv_ruleHEADER=ruleHEADER 
	 { $current=$iv_ruleHEADER.current; } 
	 EOF 
;

// Rule HEADER
ruleHEADER returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getHEADERAccess().getALGORITMOParserRuleCall_0()); 
    }
ruleALGORITMO
    { 
        afterParserOrEnumRuleCall();
    }
(this_WS_1=RULE_WS
    { 
    newLeafNode(this_WS_1, grammarAccess.getHEADERAccess().getWSTerminalRuleCall_1()); 
    }
)*(
(
		lv_nameOfProgram_2_0=RULE_STRING
		{
			newLeafNode(lv_nameOfProgram_2_0, grammarAccess.getHEADERAccess().getNameOfProgramSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getHEADERRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"nameOfProgram",
        		lv_nameOfProgram_2_0, 
        		"STRING");
	    }

)
)(this_WS_3=RULE_WS
    { 
    newLeafNode(this_WS_3, grammarAccess.getHEADERAccess().getWSTerminalRuleCall_3()); 
    }
)*)
;





RULE_ML_COMMENT : '{' ( options {greedy=false;} : . )*'}';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


