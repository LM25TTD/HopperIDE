package org.hopper.language.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.hopper.language.services.PortugolGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPortugolParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Fimprocedimento", "Fimalgoritmo", "Procedimento", "Fimenquanto", "Fimescolha", "Interrompa", "Algoritmo", "Caractere", "Fimfuncao", "Outrocaso", "Caracter", "Enquanto", "Escreval", "Escolha", "Escreva", "Fimpara", "Inteiro", "Retorne", "Funcao", "Inicio", "Maiusc", "Repita", "Compr", "Copia", "Entao", "Fimse", "Passo", "Raizq", "Senao", "Caso", "Faca", "Leia", "Para", "Real", "MOD", "NOT", "XOU", "Ate", "Var", "LessThanSignHyphenMinus", "LessThanSignEqualsSign", "LessThanSignGreaterThanSign", "GreaterThanSignEqualsSign", "OU", "De", "Pi", "Se", "PercentSign", "Ampersand", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "Solidus", "Colon", "Semicolon", "LessThanSign", "EqualsSign", "GreaterThanSign", "E", "CircumflexAccent", "RULE_INT", "RULE_FLOAT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Escreva=18;
    public static final int Raizq=31;
    public static final int LessThanSignGreaterThanSign=45;
    public static final int Enquanto=15;
    public static final int Funcao=22;
    public static final int Var=42;
    public static final int Outrocaso=13;
    public static final int Algoritmo=10;
    public static final int LessThanSign=62;
    public static final int Procedimento=6;
    public static final int PercentSign=51;
    public static final int LeftParenthesis=53;
    public static final int Fimfuncao=12;
    public static final int Copia=27;
    public static final int Real=37;
    public static final int Escolha=17;
    public static final int Pi=49;
    public static final int Ampersand=52;
    public static final int Fimpara=19;
    public static final int Fimescolha=8;
    public static final int De=48;
    public static final int GreaterThanSign=64;
    public static final int RULE_ID=69;
    public static final int Para=36;
    public static final int RightParenthesis=54;
    public static final int Senao=32;
    public static final int GreaterThanSignEqualsSign=46;
    public static final int Caracter=14;
    public static final int NOT=39;
    public static final int PlusSign=56;
    public static final int RULE_INT=67;
    public static final int Fimse=29;
    public static final int LessThanSignHyphenMinus=43;
    public static final int RULE_ML_COMMENT=71;
    public static final int Entao=28;
    public static final int Interrompa=9;
    public static final int XOU=40;
    public static final int Caso=33;
    public static final int E=65;
    public static final int Compr=26;
    public static final int Repita=25;
    public static final int Caractere=11;
    public static final int RULE_STRING=70;
    public static final int Passo=30;
    public static final int RULE_SL_COMMENT=72;
    public static final int Comma=57;
    public static final int EqualsSign=63;
    public static final int HyphenMinus=58;
    public static final int Inicio=23;
    public static final int Leia=35;
    public static final int Faca=34;
    public static final int Escreval=16;
    public static final int LessThanSignEqualsSign=44;
    public static final int Solidus=59;
    public static final int Colon=60;
    public static final int EOF=-1;
    public static final int Maiusc=24;
    public static final int Asterisk=55;
    public static final int Fimenquanto=7;
    public static final int Inteiro=20;
    public static final int MOD=38;
    public static final int RULE_WS=73;
    public static final int Fimprocedimento=4;
    public static final int OU=47;
    public static final int RULE_ANY_OTHER=74;
    public static final int CircumflexAccent=66;
    public static final int Semicolon=61;
    public static final int Se=50;
    public static final int Ate=41;
    public static final int Fimalgoritmo=5;
    public static final int Retorne=21;
    public static final int RULE_FLOAT=68;

    // delegates
    // delegators


        public InternalPortugolParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPortugolParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPortugolParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPortugolParser.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalPortugolParser.g:57:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalPortugolParser.g:57:46: (iv_ruleModel= ruleModel EOF )
            // InternalPortugolParser.g:58:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalPortugolParser.g:64:1: ruleModel returns [EObject current=null] : ( ( (lv_header_0_0= ruleHeaderBlock ) ) ( (lv_globalDeclarations_1_0= ruleDeclarationsBlock ) )? ( (lv_subprograms_2_0= ruleSubprograms ) )? ( (lv_commands_3_0= ruleBlockCommand ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_header_0_0 = null;

        EObject lv_globalDeclarations_1_0 = null;

        EObject lv_subprograms_2_0 = null;

        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:70:2: ( ( ( (lv_header_0_0= ruleHeaderBlock ) ) ( (lv_globalDeclarations_1_0= ruleDeclarationsBlock ) )? ( (lv_subprograms_2_0= ruleSubprograms ) )? ( (lv_commands_3_0= ruleBlockCommand ) ) ) )
            // InternalPortugolParser.g:71:2: ( ( (lv_header_0_0= ruleHeaderBlock ) ) ( (lv_globalDeclarations_1_0= ruleDeclarationsBlock ) )? ( (lv_subprograms_2_0= ruleSubprograms ) )? ( (lv_commands_3_0= ruleBlockCommand ) ) )
            {
            // InternalPortugolParser.g:71:2: ( ( (lv_header_0_0= ruleHeaderBlock ) ) ( (lv_globalDeclarations_1_0= ruleDeclarationsBlock ) )? ( (lv_subprograms_2_0= ruleSubprograms ) )? ( (lv_commands_3_0= ruleBlockCommand ) ) )
            // InternalPortugolParser.g:72:3: ( (lv_header_0_0= ruleHeaderBlock ) ) ( (lv_globalDeclarations_1_0= ruleDeclarationsBlock ) )? ( (lv_subprograms_2_0= ruleSubprograms ) )? ( (lv_commands_3_0= ruleBlockCommand ) )
            {
            // InternalPortugolParser.g:72:3: ( (lv_header_0_0= ruleHeaderBlock ) )
            // InternalPortugolParser.g:73:4: (lv_header_0_0= ruleHeaderBlock )
            {
            // InternalPortugolParser.g:73:4: (lv_header_0_0= ruleHeaderBlock )
            // InternalPortugolParser.g:74:5: lv_header_0_0= ruleHeaderBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelAccess().getHeaderHeaderBlockParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_header_0_0=ruleHeaderBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelRule());
              					}
              					set(
              						current,
              						"header",
              						lv_header_0_0,
              						"org.hopper.language.Portugol.HeaderBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPortugolParser.g:91:3: ( (lv_globalDeclarations_1_0= ruleDeclarationsBlock ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Var) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPortugolParser.g:92:4: (lv_globalDeclarations_1_0= ruleDeclarationsBlock )
                    {
                    // InternalPortugolParser.g:92:4: (lv_globalDeclarations_1_0= ruleDeclarationsBlock )
                    // InternalPortugolParser.g:93:5: lv_globalDeclarations_1_0= ruleDeclarationsBlock
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getModelAccess().getGlobalDeclarationsDeclarationsBlockParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_3);
                    lv_globalDeclarations_1_0=ruleDeclarationsBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getModelRule());
                      					}
                      					set(
                      						current,
                      						"globalDeclarations",
                      						lv_globalDeclarations_1_0,
                      						"org.hopper.language.Portugol.DeclarationsBlock");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPortugolParser.g:110:3: ( (lv_subprograms_2_0= ruleSubprograms ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Procedimento||LA2_0==Funcao) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPortugolParser.g:111:4: (lv_subprograms_2_0= ruleSubprograms )
                    {
                    // InternalPortugolParser.g:111:4: (lv_subprograms_2_0= ruleSubprograms )
                    // InternalPortugolParser.g:112:5: lv_subprograms_2_0= ruleSubprograms
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getModelAccess().getSubprogramsSubprogramsParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_3);
                    lv_subprograms_2_0=ruleSubprograms();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getModelRule());
                      					}
                      					set(
                      						current,
                      						"subprograms",
                      						lv_subprograms_2_0,
                      						"org.hopper.language.Portugol.Subprograms");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPortugolParser.g:129:3: ( (lv_commands_3_0= ruleBlockCommand ) )
            // InternalPortugolParser.g:130:4: (lv_commands_3_0= ruleBlockCommand )
            {
            // InternalPortugolParser.g:130:4: (lv_commands_3_0= ruleBlockCommand )
            // InternalPortugolParser.g:131:5: lv_commands_3_0= ruleBlockCommand
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelAccess().getCommandsBlockCommandParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_commands_3_0=ruleBlockCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelRule());
              					}
              					set(
              						current,
              						"commands",
              						lv_commands_3_0,
              						"org.hopper.language.Portugol.BlockCommand");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleHeaderBlock"
    // InternalPortugolParser.g:152:1: entryRuleHeaderBlock returns [EObject current=null] : iv_ruleHeaderBlock= ruleHeaderBlock EOF ;
    public final EObject entryRuleHeaderBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderBlock = null;


        try {
            // InternalPortugolParser.g:152:52: (iv_ruleHeaderBlock= ruleHeaderBlock EOF )
            // InternalPortugolParser.g:153:2: iv_ruleHeaderBlock= ruleHeaderBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHeaderBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHeaderBlock=ruleHeaderBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHeaderBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderBlock"


    // $ANTLR start "ruleHeaderBlock"
    // InternalPortugolParser.g:159:1: ruleHeaderBlock returns [EObject current=null] : (otherlv_0= Algoritmo ( (lv_algorithmName_1_0= RULE_STRING ) ) ruleEND_COMMAND ) ;
    public final EObject ruleHeaderBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_algorithmName_1_0=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:165:2: ( (otherlv_0= Algoritmo ( (lv_algorithmName_1_0= RULE_STRING ) ) ruleEND_COMMAND ) )
            // InternalPortugolParser.g:166:2: (otherlv_0= Algoritmo ( (lv_algorithmName_1_0= RULE_STRING ) ) ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:166:2: (otherlv_0= Algoritmo ( (lv_algorithmName_1_0= RULE_STRING ) ) ruleEND_COMMAND )
            // InternalPortugolParser.g:167:3: otherlv_0= Algoritmo ( (lv_algorithmName_1_0= RULE_STRING ) ) ruleEND_COMMAND
            {
            otherlv_0=(Token)match(input,Algoritmo,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getHeaderBlockAccess().getAlgoritmoKeyword_0());
              		
            }
            // InternalPortugolParser.g:171:3: ( (lv_algorithmName_1_0= RULE_STRING ) )
            // InternalPortugolParser.g:172:4: (lv_algorithmName_1_0= RULE_STRING )
            {
            // InternalPortugolParser.g:172:4: (lv_algorithmName_1_0= RULE_STRING )
            // InternalPortugolParser.g:173:5: lv_algorithmName_1_0= RULE_STRING
            {
            lv_algorithmName_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_algorithmName_1_0, grammarAccess.getHeaderBlockAccess().getAlgorithmNameSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getHeaderBlockRule());
              					}
              					setWithLastConsumed(
              						current,
              						"algorithmName",
              						lv_algorithmName_1_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getHeaderBlockAccess().getEND_COMMANDParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            ruleEND_COMMAND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderBlock"


    // $ANTLR start "entryRuleDeclarationsBlock"
    // InternalPortugolParser.g:200:1: entryRuleDeclarationsBlock returns [EObject current=null] : iv_ruleDeclarationsBlock= ruleDeclarationsBlock EOF ;
    public final EObject entryRuleDeclarationsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarationsBlock = null;


        try {
            // InternalPortugolParser.g:200:58: (iv_ruleDeclarationsBlock= ruleDeclarationsBlock EOF )
            // InternalPortugolParser.g:201:2: iv_ruleDeclarationsBlock= ruleDeclarationsBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationsBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclarationsBlock=ruleDeclarationsBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclarationsBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarationsBlock"


    // $ANTLR start "ruleDeclarationsBlock"
    // InternalPortugolParser.g:207:1: ruleDeclarationsBlock returns [EObject current=null] : (otherlv_0= Var ( ( (lv_vars_1_0= ruleVariable ) ) ruleEND_COMMAND )+ ) ;
    public final EObject ruleDeclarationsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_vars_1_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:213:2: ( (otherlv_0= Var ( ( (lv_vars_1_0= ruleVariable ) ) ruleEND_COMMAND )+ ) )
            // InternalPortugolParser.g:214:2: (otherlv_0= Var ( ( (lv_vars_1_0= ruleVariable ) ) ruleEND_COMMAND )+ )
            {
            // InternalPortugolParser.g:214:2: (otherlv_0= Var ( ( (lv_vars_1_0= ruleVariable ) ) ruleEND_COMMAND )+ )
            // InternalPortugolParser.g:215:3: otherlv_0= Var ( ( (lv_vars_1_0= ruleVariable ) ) ruleEND_COMMAND )+
            {
            otherlv_0=(Token)match(input,Var,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDeclarationsBlockAccess().getVarKeyword_0());
              		
            }
            // InternalPortugolParser.g:219:3: ( ( (lv_vars_1_0= ruleVariable ) ) ruleEND_COMMAND )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPortugolParser.g:220:4: ( (lv_vars_1_0= ruleVariable ) ) ruleEND_COMMAND
            	    {
            	    // InternalPortugolParser.g:220:4: ( (lv_vars_1_0= ruleVariable ) )
            	    // InternalPortugolParser.g:221:5: (lv_vars_1_0= ruleVariable )
            	    {
            	    // InternalPortugolParser.g:221:5: (lv_vars_1_0= ruleVariable )
            	    // InternalPortugolParser.g:222:6: lv_vars_1_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDeclarationsBlockAccess().getVarsVariableParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_vars_1_0=ruleVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDeclarationsBlockRule());
            	      						}
            	      						add(
            	      							current,
            	      							"vars",
            	      							lv_vars_1_0,
            	      							"org.hopper.language.Portugol.Variable");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getDeclarationsBlockAccess().getEND_COMMANDParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_7);
            	    ruleEND_COMMAND();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarationsBlock"


    // $ANTLR start "entryRuleVariable"
    // InternalPortugolParser.g:251:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalPortugolParser.g:251:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalPortugolParser.g:252:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalPortugolParser.g:258:1: ruleVariable returns [EObject current=null] : ( ( (lv_varDeclaration_0_0= ruleVarDeclaration ) ) otherlv_1= Colon ( (lv_type_2_0= ruleVarType ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_varDeclaration_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:264:2: ( ( ( (lv_varDeclaration_0_0= ruleVarDeclaration ) ) otherlv_1= Colon ( (lv_type_2_0= ruleVarType ) ) ) )
            // InternalPortugolParser.g:265:2: ( ( (lv_varDeclaration_0_0= ruleVarDeclaration ) ) otherlv_1= Colon ( (lv_type_2_0= ruleVarType ) ) )
            {
            // InternalPortugolParser.g:265:2: ( ( (lv_varDeclaration_0_0= ruleVarDeclaration ) ) otherlv_1= Colon ( (lv_type_2_0= ruleVarType ) ) )
            // InternalPortugolParser.g:266:3: ( (lv_varDeclaration_0_0= ruleVarDeclaration ) ) otherlv_1= Colon ( (lv_type_2_0= ruleVarType ) )
            {
            // InternalPortugolParser.g:266:3: ( (lv_varDeclaration_0_0= ruleVarDeclaration ) )
            // InternalPortugolParser.g:267:4: (lv_varDeclaration_0_0= ruleVarDeclaration )
            {
            // InternalPortugolParser.g:267:4: (lv_varDeclaration_0_0= ruleVarDeclaration )
            // InternalPortugolParser.g:268:5: lv_varDeclaration_0_0= ruleVarDeclaration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableAccess().getVarDeclarationVarDeclarationParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_varDeclaration_0_0=ruleVarDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariableRule());
              					}
              					set(
              						current,
              						"varDeclaration",
              						lv_varDeclaration_0_0,
              						"org.hopper.language.Portugol.VarDeclaration");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getColonKeyword_1());
              		
            }
            // InternalPortugolParser.g:289:3: ( (lv_type_2_0= ruleVarType ) )
            // InternalPortugolParser.g:290:4: (lv_type_2_0= ruleVarType )
            {
            // InternalPortugolParser.g:290:4: (lv_type_2_0= ruleVarType )
            // InternalPortugolParser.g:291:5: lv_type_2_0= ruleVarType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableAccess().getTypeVarTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleVarType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariableRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.hopper.language.Portugol.VarType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalPortugolParser.g:312:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalPortugolParser.g:312:55: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalPortugolParser.g:313:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarDeclaration=ruleVarDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalPortugolParser.g:319:1: ruleVarDeclaration returns [EObject current=null] : ( ( (lv_vars_0_0= ruleVarName ) ) (otherlv_1= Comma ( (lv_vars_2_0= ruleVarName ) ) )* ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_vars_0_0 = null;

        EObject lv_vars_2_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:325:2: ( ( ( (lv_vars_0_0= ruleVarName ) ) (otherlv_1= Comma ( (lv_vars_2_0= ruleVarName ) ) )* ) )
            // InternalPortugolParser.g:326:2: ( ( (lv_vars_0_0= ruleVarName ) ) (otherlv_1= Comma ( (lv_vars_2_0= ruleVarName ) ) )* )
            {
            // InternalPortugolParser.g:326:2: ( ( (lv_vars_0_0= ruleVarName ) ) (otherlv_1= Comma ( (lv_vars_2_0= ruleVarName ) ) )* )
            // InternalPortugolParser.g:327:3: ( (lv_vars_0_0= ruleVarName ) ) (otherlv_1= Comma ( (lv_vars_2_0= ruleVarName ) ) )*
            {
            // InternalPortugolParser.g:327:3: ( (lv_vars_0_0= ruleVarName ) )
            // InternalPortugolParser.g:328:4: (lv_vars_0_0= ruleVarName )
            {
            // InternalPortugolParser.g:328:4: (lv_vars_0_0= ruleVarName )
            // InternalPortugolParser.g:329:5: lv_vars_0_0= ruleVarName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarDeclarationAccess().getVarsVarNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_vars_0_0=ruleVarName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
              					}
              					add(
              						current,
              						"vars",
              						lv_vars_0_0,
              						"org.hopper.language.Portugol.VarName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPortugolParser.g:346:3: (otherlv_1= Comma ( (lv_vars_2_0= ruleVarName ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==Comma) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPortugolParser.g:347:4: otherlv_1= Comma ( (lv_vars_2_0= ruleVarName ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getVarDeclarationAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPortugolParser.g:351:4: ( (lv_vars_2_0= ruleVarName ) )
            	    // InternalPortugolParser.g:352:5: (lv_vars_2_0= ruleVarName )
            	    {
            	    // InternalPortugolParser.g:352:5: (lv_vars_2_0= ruleVarName )
            	    // InternalPortugolParser.g:353:6: lv_vars_2_0= ruleVarName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getVarDeclarationAccess().getVarsVarNameParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_vars_2_0=ruleVarName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"vars",
            	      							lv_vars_2_0,
            	      							"org.hopper.language.Portugol.VarName");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleDeclaredVarList"
    // InternalPortugolParser.g:375:1: entryRuleDeclaredVarList returns [EObject current=null] : iv_ruleDeclaredVarList= ruleDeclaredVarList EOF ;
    public final EObject entryRuleDeclaredVarList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredVarList = null;


        try {
            // InternalPortugolParser.g:375:56: (iv_ruleDeclaredVarList= ruleDeclaredVarList EOF )
            // InternalPortugolParser.g:376:2: iv_ruleDeclaredVarList= ruleDeclaredVarList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaredVarListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclaredVarList=ruleDeclaredVarList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaredVarList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaredVarList"


    // $ANTLR start "ruleDeclaredVarList"
    // InternalPortugolParser.g:382:1: ruleDeclaredVarList returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= Comma ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleDeclaredVarList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:388:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= Comma ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalPortugolParser.g:389:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= Comma ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalPortugolParser.g:389:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= Comma ( (otherlv_2= RULE_ID ) ) )* )
            // InternalPortugolParser.g:390:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= Comma ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalPortugolParser.g:390:3: ( (otherlv_0= RULE_ID ) )
            // InternalPortugolParser.g:391:4: (otherlv_0= RULE_ID )
            {
            // InternalPortugolParser.g:391:4: (otherlv_0= RULE_ID )
            // InternalPortugolParser.g:392:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDeclaredVarListRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDeclaredVarListAccess().getVarsVarNameCrossReference_0_0());
              				
            }

            }


            }

            // InternalPortugolParser.g:403:3: (otherlv_1= Comma ( (otherlv_2= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Comma) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPortugolParser.g:404:4: otherlv_1= Comma ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDeclaredVarListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPortugolParser.g:408:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalPortugolParser.g:409:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalPortugolParser.g:409:5: (otherlv_2= RULE_ID )
            	    // InternalPortugolParser.g:410:6: otherlv_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDeclaredVarListRule());
            	      						}
            	      					
            	    }
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getDeclaredVarListAccess().getVarsVarNameCrossReference_1_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaredVarList"


    // $ANTLR start "entryRuleVarName"
    // InternalPortugolParser.g:426:1: entryRuleVarName returns [EObject current=null] : iv_ruleVarName= ruleVarName EOF ;
    public final EObject entryRuleVarName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarName = null;


        try {
            // InternalPortugolParser.g:426:48: (iv_ruleVarName= ruleVarName EOF )
            // InternalPortugolParser.g:427:2: iv_ruleVarName= ruleVarName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarName=ruleVarName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarName"


    // $ANTLR start "ruleVarName"
    // InternalPortugolParser.g:433:1: ruleVarName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVarName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:439:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPortugolParser.g:440:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPortugolParser.g:440:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPortugolParser.g:441:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPortugolParser.g:441:3: (lv_name_0_0= RULE_ID )
            // InternalPortugolParser.g:442:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getVarNameAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getVarNameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarName"


    // $ANTLR start "entryRuleVarType"
    // InternalPortugolParser.g:461:1: entryRuleVarType returns [EObject current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final EObject entryRuleVarType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarType = null;


        try {
            // InternalPortugolParser.g:461:48: (iv_ruleVarType= ruleVarType EOF )
            // InternalPortugolParser.g:462:2: iv_ruleVarType= ruleVarType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarType=ruleVarType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarType"


    // $ANTLR start "ruleVarType"
    // InternalPortugolParser.g:468:1: ruleVarType returns [EObject current=null] : ( ( (lv_typeName_0_1= Real | lv_typeName_0_2= Inteiro | lv_typeName_0_3= Caractere | lv_typeName_0_4= Caracter ) ) ) ;
    public final EObject ruleVarType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;
        Token lv_typeName_0_4=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:474:2: ( ( ( (lv_typeName_0_1= Real | lv_typeName_0_2= Inteiro | lv_typeName_0_3= Caractere | lv_typeName_0_4= Caracter ) ) ) )
            // InternalPortugolParser.g:475:2: ( ( (lv_typeName_0_1= Real | lv_typeName_0_2= Inteiro | lv_typeName_0_3= Caractere | lv_typeName_0_4= Caracter ) ) )
            {
            // InternalPortugolParser.g:475:2: ( ( (lv_typeName_0_1= Real | lv_typeName_0_2= Inteiro | lv_typeName_0_3= Caractere | lv_typeName_0_4= Caracter ) ) )
            // InternalPortugolParser.g:476:3: ( (lv_typeName_0_1= Real | lv_typeName_0_2= Inteiro | lv_typeName_0_3= Caractere | lv_typeName_0_4= Caracter ) )
            {
            // InternalPortugolParser.g:476:3: ( (lv_typeName_0_1= Real | lv_typeName_0_2= Inteiro | lv_typeName_0_3= Caractere | lv_typeName_0_4= Caracter ) )
            // InternalPortugolParser.g:477:4: (lv_typeName_0_1= Real | lv_typeName_0_2= Inteiro | lv_typeName_0_3= Caractere | lv_typeName_0_4= Caracter )
            {
            // InternalPortugolParser.g:477:4: (lv_typeName_0_1= Real | lv_typeName_0_2= Inteiro | lv_typeName_0_3= Caractere | lv_typeName_0_4= Caracter )
            int alt6=4;
            switch ( input.LA(1) ) {
            case Real:
                {
                alt6=1;
                }
                break;
            case Inteiro:
                {
                alt6=2;
                }
                break;
            case Caractere:
                {
                alt6=3;
                }
                break;
            case Caracter:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPortugolParser.g:478:5: lv_typeName_0_1= Real
                    {
                    lv_typeName_0_1=(Token)match(input,Real,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_typeName_0_1, grammarAccess.getVarTypeAccess().getTypeNameRealKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVarTypeRule());
                      					}
                      					setWithLastConsumed(current, "typeName", lv_typeName_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:489:5: lv_typeName_0_2= Inteiro
                    {
                    lv_typeName_0_2=(Token)match(input,Inteiro,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_typeName_0_2, grammarAccess.getVarTypeAccess().getTypeNameInteiroKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVarTypeRule());
                      					}
                      					setWithLastConsumed(current, "typeName", lv_typeName_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalPortugolParser.g:500:5: lv_typeName_0_3= Caractere
                    {
                    lv_typeName_0_3=(Token)match(input,Caractere,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_typeName_0_3, grammarAccess.getVarTypeAccess().getTypeNameCaractereKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVarTypeRule());
                      					}
                      					setWithLastConsumed(current, "typeName", lv_typeName_0_3, null);
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalPortugolParser.g:511:5: lv_typeName_0_4= Caracter
                    {
                    lv_typeName_0_4=(Token)match(input,Caracter,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_typeName_0_4, grammarAccess.getVarTypeAccess().getTypeNameCaracterKeyword_0_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVarTypeRule());
                      					}
                      					setWithLastConsumed(current, "typeName", lv_typeName_0_4, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarType"


    // $ANTLR start "entryRuleSubprograms"
    // InternalPortugolParser.g:527:1: entryRuleSubprograms returns [EObject current=null] : iv_ruleSubprograms= ruleSubprograms EOF ;
    public final EObject entryRuleSubprograms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubprograms = null;


        try {
            // InternalPortugolParser.g:527:52: (iv_ruleSubprograms= ruleSubprograms EOF )
            // InternalPortugolParser.g:528:2: iv_ruleSubprograms= ruleSubprograms EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubprogramsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubprograms=ruleSubprograms();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubprograms; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubprograms"


    // $ANTLR start "ruleSubprograms"
    // InternalPortugolParser.g:534:1: ruleSubprograms returns [EObject current=null] : ( (lv_blockSubPrograms_0_0= ruleBlockSubPrograms ) )+ ;
    public final EObject ruleSubprograms() throws RecognitionException {
        EObject current = null;

        EObject lv_blockSubPrograms_0_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:540:2: ( ( (lv_blockSubPrograms_0_0= ruleBlockSubPrograms ) )+ )
            // InternalPortugolParser.g:541:2: ( (lv_blockSubPrograms_0_0= ruleBlockSubPrograms ) )+
            {
            // InternalPortugolParser.g:541:2: ( (lv_blockSubPrograms_0_0= ruleBlockSubPrograms ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Procedimento||LA7_0==Funcao) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPortugolParser.g:542:3: (lv_blockSubPrograms_0_0= ruleBlockSubPrograms )
            	    {
            	    // InternalPortugolParser.g:542:3: (lv_blockSubPrograms_0_0= ruleBlockSubPrograms )
            	    // InternalPortugolParser.g:543:4: lv_blockSubPrograms_0_0= ruleBlockSubPrograms
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSubprogramsAccess().getBlockSubProgramsBlockSubProgramsParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_blockSubPrograms_0_0=ruleBlockSubPrograms();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getSubprogramsRule());
            	      				}
            	      				add(
            	      					current,
            	      					"blockSubPrograms",
            	      					lv_blockSubPrograms_0_0,
            	      					"org.hopper.language.Portugol.BlockSubPrograms");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubprograms"


    // $ANTLR start "entryRuleBlockSubPrograms"
    // InternalPortugolParser.g:563:1: entryRuleBlockSubPrograms returns [EObject current=null] : iv_ruleBlockSubPrograms= ruleBlockSubPrograms EOF ;
    public final EObject entryRuleBlockSubPrograms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockSubPrograms = null;


        try {
            // InternalPortugolParser.g:563:57: (iv_ruleBlockSubPrograms= ruleBlockSubPrograms EOF )
            // InternalPortugolParser.g:564:2: iv_ruleBlockSubPrograms= ruleBlockSubPrograms EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockSubProgramsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlockSubPrograms=ruleBlockSubPrograms();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockSubPrograms; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlockSubPrograms"


    // $ANTLR start "ruleBlockSubPrograms"
    // InternalPortugolParser.g:570:1: ruleBlockSubPrograms returns [EObject current=null] : (this_BlockFunction_0= ruleBlockFunction | this_BlockProcedure_1= ruleBlockProcedure ) ;
    public final EObject ruleBlockSubPrograms() throws RecognitionException {
        EObject current = null;

        EObject this_BlockFunction_0 = null;

        EObject this_BlockProcedure_1 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:576:2: ( (this_BlockFunction_0= ruleBlockFunction | this_BlockProcedure_1= ruleBlockProcedure ) )
            // InternalPortugolParser.g:577:2: (this_BlockFunction_0= ruleBlockFunction | this_BlockProcedure_1= ruleBlockProcedure )
            {
            // InternalPortugolParser.g:577:2: (this_BlockFunction_0= ruleBlockFunction | this_BlockProcedure_1= ruleBlockProcedure )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Funcao) ) {
                alt8=1;
            }
            else if ( (LA8_0==Procedimento) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPortugolParser.g:578:3: this_BlockFunction_0= ruleBlockFunction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBlockSubProgramsAccess().getBlockFunctionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BlockFunction_0=ruleBlockFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BlockFunction_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:587:3: this_BlockProcedure_1= ruleBlockProcedure
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBlockSubProgramsAccess().getBlockProcedureParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BlockProcedure_1=ruleBlockProcedure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BlockProcedure_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlockSubPrograms"


    // $ANTLR start "entryRuleProcedureName"
    // InternalPortugolParser.g:599:1: entryRuleProcedureName returns [EObject current=null] : iv_ruleProcedureName= ruleProcedureName EOF ;
    public final EObject entryRuleProcedureName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedureName = null;


        try {
            // InternalPortugolParser.g:599:54: (iv_ruleProcedureName= ruleProcedureName EOF )
            // InternalPortugolParser.g:600:2: iv_ruleProcedureName= ruleProcedureName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcedureNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProcedureName=ruleProcedureName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcedureName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcedureName"


    // $ANTLR start "ruleProcedureName"
    // InternalPortugolParser.g:606:1: ruleProcedureName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleProcedureName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:612:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPortugolParser.g:613:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPortugolParser.g:613:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPortugolParser.g:614:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPortugolParser.g:614:3: (lv_name_0_0= RULE_ID )
            // InternalPortugolParser.g:615:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getProcedureNameAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getProcedureNameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcedureName"


    // $ANTLR start "entryRuleFunctionName"
    // InternalPortugolParser.g:634:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // InternalPortugolParser.g:634:53: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalPortugolParser.g:635:2: iv_ruleFunctionName= ruleFunctionName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionName=ruleFunctionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionName"


    // $ANTLR start "ruleFunctionName"
    // InternalPortugolParser.g:641:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:647:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPortugolParser.g:648:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPortugolParser.g:648:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPortugolParser.g:649:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPortugolParser.g:649:3: (lv_name_0_0= RULE_ID )
            // InternalPortugolParser.g:650:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getFunctionNameAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getFunctionNameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionName"


    // $ANTLR start "entryRuleBlockFunction"
    // InternalPortugolParser.g:669:1: entryRuleBlockFunction returns [EObject current=null] : iv_ruleBlockFunction= ruleBlockFunction EOF ;
    public final EObject entryRuleBlockFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockFunction = null;


        try {
            // InternalPortugolParser.g:669:54: (iv_ruleBlockFunction= ruleBlockFunction EOF )
            // InternalPortugolParser.g:670:2: iv_ruleBlockFunction= ruleBlockFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlockFunction=ruleBlockFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlockFunction"


    // $ANTLR start "ruleBlockFunction"
    // InternalPortugolParser.g:676:1: ruleBlockFunction returns [EObject current=null] : (otherlv_0= Funcao ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= LeftParenthesis ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= RightParenthesis otherlv_5= Colon ( (lv_returnType_6_0= ruleVarType ) ) ( (lv_declarations_7_0= ruleDeclarationsBlock ) )? otherlv_8= Inicio ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= Fimfuncao ) ;
    public final EObject ruleBlockFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_functionName_1_0 = null;

        EObject lv_paramList_3_0 = null;

        EObject lv_returnType_6_0 = null;

        EObject lv_declarations_7_0 = null;

        EObject lv_commands_9_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:682:2: ( (otherlv_0= Funcao ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= LeftParenthesis ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= RightParenthesis otherlv_5= Colon ( (lv_returnType_6_0= ruleVarType ) ) ( (lv_declarations_7_0= ruleDeclarationsBlock ) )? otherlv_8= Inicio ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= Fimfuncao ) )
            // InternalPortugolParser.g:683:2: (otherlv_0= Funcao ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= LeftParenthesis ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= RightParenthesis otherlv_5= Colon ( (lv_returnType_6_0= ruleVarType ) ) ( (lv_declarations_7_0= ruleDeclarationsBlock ) )? otherlv_8= Inicio ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= Fimfuncao )
            {
            // InternalPortugolParser.g:683:2: (otherlv_0= Funcao ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= LeftParenthesis ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= RightParenthesis otherlv_5= Colon ( (lv_returnType_6_0= ruleVarType ) ) ( (lv_declarations_7_0= ruleDeclarationsBlock ) )? otherlv_8= Inicio ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= Fimfuncao )
            // InternalPortugolParser.g:684:3: otherlv_0= Funcao ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= LeftParenthesis ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= RightParenthesis otherlv_5= Colon ( (lv_returnType_6_0= ruleVarType ) ) ( (lv_declarations_7_0= ruleDeclarationsBlock ) )? otherlv_8= Inicio ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= Fimfuncao
            {
            otherlv_0=(Token)match(input,Funcao,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlockFunctionAccess().getFuncaoKeyword_0());
              		
            }
            // InternalPortugolParser.g:688:3: ( (lv_functionName_1_0= ruleFunctionName ) )
            // InternalPortugolParser.g:689:4: (lv_functionName_1_0= ruleFunctionName )
            {
            // InternalPortugolParser.g:689:4: (lv_functionName_1_0= ruleFunctionName )
            // InternalPortugolParser.g:690:5: lv_functionName_1_0= ruleFunctionName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBlockFunctionAccess().getFunctionNameFunctionNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_functionName_1_0=ruleFunctionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBlockFunctionRule());
              					}
              					set(
              						current,
              						"functionName",
              						lv_functionName_1_0,
              						"org.hopper.language.Portugol.FunctionName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBlockFunctionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPortugolParser.g:711:3: ( (lv_paramList_3_0= ruleVariable ) )
            // InternalPortugolParser.g:712:4: (lv_paramList_3_0= ruleVariable )
            {
            // InternalPortugolParser.g:712:4: (lv_paramList_3_0= ruleVariable )
            // InternalPortugolParser.g:713:5: lv_paramList_3_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBlockFunctionAccess().getParamListVariableParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_paramList_3_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBlockFunctionRule());
              					}
              					set(
              						current,
              						"paramList",
              						lv_paramList_3_0,
              						"org.hopper.language.Portugol.Variable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBlockFunctionAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,Colon,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getBlockFunctionAccess().getColonKeyword_5());
              		
            }
            // InternalPortugolParser.g:738:3: ( (lv_returnType_6_0= ruleVarType ) )
            // InternalPortugolParser.g:739:4: (lv_returnType_6_0= ruleVarType )
            {
            // InternalPortugolParser.g:739:4: (lv_returnType_6_0= ruleVarType )
            // InternalPortugolParser.g:740:5: lv_returnType_6_0= ruleVarType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBlockFunctionAccess().getReturnTypeVarTypeParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_returnType_6_0=ruleVarType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBlockFunctionRule());
              					}
              					set(
              						current,
              						"returnType",
              						lv_returnType_6_0,
              						"org.hopper.language.Portugol.VarType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPortugolParser.g:757:3: ( (lv_declarations_7_0= ruleDeclarationsBlock ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Var) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPortugolParser.g:758:4: (lv_declarations_7_0= ruleDeclarationsBlock )
                    {
                    // InternalPortugolParser.g:758:4: (lv_declarations_7_0= ruleDeclarationsBlock )
                    // InternalPortugolParser.g:759:5: lv_declarations_7_0= ruleDeclarationsBlock
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBlockFunctionAccess().getDeclarationsDeclarationsBlockParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_15);
                    lv_declarations_7_0=ruleDeclarationsBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBlockFunctionRule());
                      					}
                      					set(
                      						current,
                      						"declarations",
                      						lv_declarations_7_0,
                      						"org.hopper.language.Portugol.DeclarationsBlock");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,Inicio,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getBlockFunctionAccess().getInicioKeyword_8());
              		
            }
            // InternalPortugolParser.g:780:3: ( (lv_commands_9_0= ruleAbstractCommand ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Interrompa||(LA10_0>=Enquanto && LA10_0<=Escreva)||LA10_0==Retorne||(LA10_0>=Maiusc && LA10_0<=Copia)||LA10_0==Raizq||(LA10_0>=Leia && LA10_0<=Para)||LA10_0==NOT||(LA10_0>=Pi && LA10_0<=Se)||LA10_0==LeftParenthesis||LA10_0==HyphenMinus||(LA10_0>=RULE_INT && LA10_0<=RULE_STRING)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPortugolParser.g:781:4: (lv_commands_9_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugolParser.g:781:4: (lv_commands_9_0= ruleAbstractCommand )
            	    // InternalPortugolParser.g:782:5: lv_commands_9_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockFunctionAccess().getCommandsAbstractCommandParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_commands_9_0=ruleAbstractCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBlockFunctionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"commands",
            	      						lv_commands_9_0,
            	      						"org.hopper.language.Portugol.AbstractCommand");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_10=(Token)match(input,Fimfuncao,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getBlockFunctionAccess().getFimfuncaoKeyword_10());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlockFunction"


    // $ANTLR start "entryRuleBlockProcedure"
    // InternalPortugolParser.g:807:1: entryRuleBlockProcedure returns [EObject current=null] : iv_ruleBlockProcedure= ruleBlockProcedure EOF ;
    public final EObject entryRuleBlockProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockProcedure = null;


        try {
            // InternalPortugolParser.g:807:55: (iv_ruleBlockProcedure= ruleBlockProcedure EOF )
            // InternalPortugolParser.g:808:2: iv_ruleBlockProcedure= ruleBlockProcedure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockProcedureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlockProcedure=ruleBlockProcedure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockProcedure; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlockProcedure"


    // $ANTLR start "ruleBlockProcedure"
    // InternalPortugolParser.g:814:1: ruleBlockProcedure returns [EObject current=null] : (otherlv_0= Procedimento ( (lv_procedure_1_0= ruleProcedureName ) ) otherlv_2= LeftParenthesis ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= RightParenthesis ( (lv_declarations_5_0= ruleDeclarationsBlock ) )? otherlv_6= Inicio ( (lv_commands_7_0= ruleAbstractCommand ) )+ otherlv_8= Fimprocedimento ) ;
    public final EObject ruleBlockProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_procedure_1_0 = null;

        EObject lv_paramList_3_0 = null;

        EObject lv_declarations_5_0 = null;

        EObject lv_commands_7_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:820:2: ( (otherlv_0= Procedimento ( (lv_procedure_1_0= ruleProcedureName ) ) otherlv_2= LeftParenthesis ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= RightParenthesis ( (lv_declarations_5_0= ruleDeclarationsBlock ) )? otherlv_6= Inicio ( (lv_commands_7_0= ruleAbstractCommand ) )+ otherlv_8= Fimprocedimento ) )
            // InternalPortugolParser.g:821:2: (otherlv_0= Procedimento ( (lv_procedure_1_0= ruleProcedureName ) ) otherlv_2= LeftParenthesis ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= RightParenthesis ( (lv_declarations_5_0= ruleDeclarationsBlock ) )? otherlv_6= Inicio ( (lv_commands_7_0= ruleAbstractCommand ) )+ otherlv_8= Fimprocedimento )
            {
            // InternalPortugolParser.g:821:2: (otherlv_0= Procedimento ( (lv_procedure_1_0= ruleProcedureName ) ) otherlv_2= LeftParenthesis ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= RightParenthesis ( (lv_declarations_5_0= ruleDeclarationsBlock ) )? otherlv_6= Inicio ( (lv_commands_7_0= ruleAbstractCommand ) )+ otherlv_8= Fimprocedimento )
            // InternalPortugolParser.g:822:3: otherlv_0= Procedimento ( (lv_procedure_1_0= ruleProcedureName ) ) otherlv_2= LeftParenthesis ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= RightParenthesis ( (lv_declarations_5_0= ruleDeclarationsBlock ) )? otherlv_6= Inicio ( (lv_commands_7_0= ruleAbstractCommand ) )+ otherlv_8= Fimprocedimento
            {
            otherlv_0=(Token)match(input,Procedimento,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlockProcedureAccess().getProcedimentoKeyword_0());
              		
            }
            // InternalPortugolParser.g:826:3: ( (lv_procedure_1_0= ruleProcedureName ) )
            // InternalPortugolParser.g:827:4: (lv_procedure_1_0= ruleProcedureName )
            {
            // InternalPortugolParser.g:827:4: (lv_procedure_1_0= ruleProcedureName )
            // InternalPortugolParser.g:828:5: lv_procedure_1_0= ruleProcedureName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBlockProcedureAccess().getProcedureProcedureNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_procedure_1_0=ruleProcedureName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBlockProcedureRule());
              					}
              					set(
              						current,
              						"procedure",
              						lv_procedure_1_0,
              						"org.hopper.language.Portugol.ProcedureName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBlockProcedureAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPortugolParser.g:849:3: ( (lv_paramList_3_0= ruleVariable ) )
            // InternalPortugolParser.g:850:4: (lv_paramList_3_0= ruleVariable )
            {
            // InternalPortugolParser.g:850:4: (lv_paramList_3_0= ruleVariable )
            // InternalPortugolParser.g:851:5: lv_paramList_3_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBlockProcedureAccess().getParamListVariableParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_paramList_3_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBlockProcedureRule());
              					}
              					set(
              						current,
              						"paramList",
              						lv_paramList_3_0,
              						"org.hopper.language.Portugol.Variable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBlockProcedureAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalPortugolParser.g:872:3: ( (lv_declarations_5_0= ruleDeclarationsBlock ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Var) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPortugolParser.g:873:4: (lv_declarations_5_0= ruleDeclarationsBlock )
                    {
                    // InternalPortugolParser.g:873:4: (lv_declarations_5_0= ruleDeclarationsBlock )
                    // InternalPortugolParser.g:874:5: lv_declarations_5_0= ruleDeclarationsBlock
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBlockProcedureAccess().getDeclarationsDeclarationsBlockParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_15);
                    lv_declarations_5_0=ruleDeclarationsBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBlockProcedureRule());
                      					}
                      					set(
                      						current,
                      						"declarations",
                      						lv_declarations_5_0,
                      						"org.hopper.language.Portugol.DeclarationsBlock");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,Inicio,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getBlockProcedureAccess().getInicioKeyword_6());
              		
            }
            // InternalPortugolParser.g:895:3: ( (lv_commands_7_0= ruleAbstractCommand ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Interrompa||(LA12_0>=Enquanto && LA12_0<=Escreva)||LA12_0==Retorne||(LA12_0>=Maiusc && LA12_0<=Copia)||LA12_0==Raizq||(LA12_0>=Leia && LA12_0<=Para)||LA12_0==NOT||(LA12_0>=Pi && LA12_0<=Se)||LA12_0==LeftParenthesis||LA12_0==HyphenMinus||(LA12_0>=RULE_INT && LA12_0<=RULE_STRING)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPortugolParser.g:896:4: (lv_commands_7_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugolParser.g:896:4: (lv_commands_7_0= ruleAbstractCommand )
            	    // InternalPortugolParser.g:897:5: lv_commands_7_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockProcedureAccess().getCommandsAbstractCommandParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_commands_7_0=ruleAbstractCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBlockProcedureRule());
            	      					}
            	      					add(
            	      						current,
            	      						"commands",
            	      						lv_commands_7_0,
            	      						"org.hopper.language.Portugol.AbstractCommand");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_8=(Token)match(input,Fimprocedimento,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getBlockProcedureAccess().getFimprocedimentoKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlockProcedure"


    // $ANTLR start "entryRuleBlockCommand"
    // InternalPortugolParser.g:922:1: entryRuleBlockCommand returns [EObject current=null] : iv_ruleBlockCommand= ruleBlockCommand EOF ;
    public final EObject entryRuleBlockCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockCommand = null;


        try {
            // InternalPortugolParser.g:922:53: (iv_ruleBlockCommand= ruleBlockCommand EOF )
            // InternalPortugolParser.g:923:2: iv_ruleBlockCommand= ruleBlockCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlockCommand=ruleBlockCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlockCommand"


    // $ANTLR start "ruleBlockCommand"
    // InternalPortugolParser.g:929:1: ruleBlockCommand returns [EObject current=null] : (otherlv_0= Inicio ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= Fimalgoritmo ) ;
    public final EObject ruleBlockCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_commands_1_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:935:2: ( (otherlv_0= Inicio ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= Fimalgoritmo ) )
            // InternalPortugolParser.g:936:2: (otherlv_0= Inicio ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= Fimalgoritmo )
            {
            // InternalPortugolParser.g:936:2: (otherlv_0= Inicio ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= Fimalgoritmo )
            // InternalPortugolParser.g:937:3: otherlv_0= Inicio ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= Fimalgoritmo
            {
            otherlv_0=(Token)match(input,Inicio,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlockCommandAccess().getInicioKeyword_0());
              		
            }
            // InternalPortugolParser.g:941:3: ( (lv_commands_1_0= ruleAbstractCommand ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Interrompa||(LA13_0>=Enquanto && LA13_0<=Escreva)||LA13_0==Retorne||(LA13_0>=Maiusc && LA13_0<=Copia)||LA13_0==Raizq||(LA13_0>=Leia && LA13_0<=Para)||LA13_0==NOT||(LA13_0>=Pi && LA13_0<=Se)||LA13_0==LeftParenthesis||LA13_0==HyphenMinus||(LA13_0>=RULE_INT && LA13_0<=RULE_STRING)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPortugolParser.g:942:4: (lv_commands_1_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugolParser.g:942:4: (lv_commands_1_0= ruleAbstractCommand )
            	    // InternalPortugolParser.g:943:5: lv_commands_1_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockCommandAccess().getCommandsAbstractCommandParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_commands_1_0=ruleAbstractCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBlockCommandRule());
            	      					}
            	      					add(
            	      						current,
            	      						"commands",
            	      						lv_commands_1_0,
            	      						"org.hopper.language.Portugol.AbstractCommand");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_2=(Token)match(input,Fimalgoritmo,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBlockCommandAccess().getFimalgoritmoKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlockCommand"


    // $ANTLR start "entryRuleAbstractCommand"
    // InternalPortugolParser.g:968:1: entryRuleAbstractCommand returns [EObject current=null] : iv_ruleAbstractCommand= ruleAbstractCommand EOF ;
    public final EObject entryRuleAbstractCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractCommand = null;


        try {
            // InternalPortugolParser.g:968:56: (iv_ruleAbstractCommand= ruleAbstractCommand EOF )
            // InternalPortugolParser.g:969:2: iv_ruleAbstractCommand= ruleAbstractCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAbstractCommand=ruleAbstractCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractCommand"


    // $ANTLR start "ruleAbstractCommand"
    // InternalPortugolParser.g:975:1: ruleAbstractCommand returns [EObject current=null] : ( (this_ReadCommand_0= ruleReadCommand ruleEND_COMMAND ) | (this_WriteCommand_2= ruleWriteCommand ruleEND_COMMAND ) | (this_Expression_4= ruleExpression ruleEND_COMMAND ) | this_IfStatement_6= ruleIfStatement | this_SwitchCaseStatement_7= ruleSwitchCaseStatement | this_ForStatement_8= ruleForStatement | this_RepeatStatement_9= ruleRepeatStatement | this_WhileStatement_10= ruleWhileStatement | (this_BreakStatement_11= ruleBreakStatement ruleEND_COMMAND ) | (this_ReturnStatement_13= ruleReturnStatement ruleEND_COMMAND ) ) ;
    public final EObject ruleAbstractCommand() throws RecognitionException {
        EObject current = null;

        EObject this_ReadCommand_0 = null;

        EObject this_WriteCommand_2 = null;

        EObject this_Expression_4 = null;

        EObject this_IfStatement_6 = null;

        EObject this_SwitchCaseStatement_7 = null;

        EObject this_ForStatement_8 = null;

        EObject this_RepeatStatement_9 = null;

        EObject this_WhileStatement_10 = null;

        EObject this_BreakStatement_11 = null;

        EObject this_ReturnStatement_13 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:981:2: ( ( (this_ReadCommand_0= ruleReadCommand ruleEND_COMMAND ) | (this_WriteCommand_2= ruleWriteCommand ruleEND_COMMAND ) | (this_Expression_4= ruleExpression ruleEND_COMMAND ) | this_IfStatement_6= ruleIfStatement | this_SwitchCaseStatement_7= ruleSwitchCaseStatement | this_ForStatement_8= ruleForStatement | this_RepeatStatement_9= ruleRepeatStatement | this_WhileStatement_10= ruleWhileStatement | (this_BreakStatement_11= ruleBreakStatement ruleEND_COMMAND ) | (this_ReturnStatement_13= ruleReturnStatement ruleEND_COMMAND ) ) )
            // InternalPortugolParser.g:982:2: ( (this_ReadCommand_0= ruleReadCommand ruleEND_COMMAND ) | (this_WriteCommand_2= ruleWriteCommand ruleEND_COMMAND ) | (this_Expression_4= ruleExpression ruleEND_COMMAND ) | this_IfStatement_6= ruleIfStatement | this_SwitchCaseStatement_7= ruleSwitchCaseStatement | this_ForStatement_8= ruleForStatement | this_RepeatStatement_9= ruleRepeatStatement | this_WhileStatement_10= ruleWhileStatement | (this_BreakStatement_11= ruleBreakStatement ruleEND_COMMAND ) | (this_ReturnStatement_13= ruleReturnStatement ruleEND_COMMAND ) )
            {
            // InternalPortugolParser.g:982:2: ( (this_ReadCommand_0= ruleReadCommand ruleEND_COMMAND ) | (this_WriteCommand_2= ruleWriteCommand ruleEND_COMMAND ) | (this_Expression_4= ruleExpression ruleEND_COMMAND ) | this_IfStatement_6= ruleIfStatement | this_SwitchCaseStatement_7= ruleSwitchCaseStatement | this_ForStatement_8= ruleForStatement | this_RepeatStatement_9= ruleRepeatStatement | this_WhileStatement_10= ruleWhileStatement | (this_BreakStatement_11= ruleBreakStatement ruleEND_COMMAND ) | (this_ReturnStatement_13= ruleReturnStatement ruleEND_COMMAND ) )
            int alt14=10;
            switch ( input.LA(1) ) {
            case Leia:
                {
                alt14=1;
                }
                break;
            case Escreval:
            case Escreva:
                {
                alt14=2;
                }
                break;
            case Maiusc:
            case Compr:
            case Copia:
            case Raizq:
            case NOT:
            case Pi:
            case LeftParenthesis:
            case HyphenMinus:
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_ID:
            case RULE_STRING:
                {
                alt14=3;
                }
                break;
            case Se:
                {
                alt14=4;
                }
                break;
            case Escolha:
                {
                alt14=5;
                }
                break;
            case Para:
                {
                alt14=6;
                }
                break;
            case Repita:
                {
                alt14=7;
                }
                break;
            case Enquanto:
                {
                alt14=8;
                }
                break;
            case Interrompa:
                {
                alt14=9;
                }
                break;
            case Retorne:
                {
                alt14=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalPortugolParser.g:983:3: (this_ReadCommand_0= ruleReadCommand ruleEND_COMMAND )
                    {
                    // InternalPortugolParser.g:983:3: (this_ReadCommand_0= ruleReadCommand ruleEND_COMMAND )
                    // InternalPortugolParser.g:984:4: this_ReadCommand_0= ruleReadCommand ruleEND_COMMAND
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAbstractCommandAccess().getReadCommandParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_5);
                    this_ReadCommand_0=ruleReadCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ReadCommand_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAbstractCommandAccess().getEND_COMMANDParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleEND_COMMAND();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:1001:3: (this_WriteCommand_2= ruleWriteCommand ruleEND_COMMAND )
                    {
                    // InternalPortugolParser.g:1001:3: (this_WriteCommand_2= ruleWriteCommand ruleEND_COMMAND )
                    // InternalPortugolParser.g:1002:4: this_WriteCommand_2= ruleWriteCommand ruleEND_COMMAND
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAbstractCommandAccess().getWriteCommandParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_5);
                    this_WriteCommand_2=ruleWriteCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_WriteCommand_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAbstractCommandAccess().getEND_COMMANDParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleEND_COMMAND();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPortugolParser.g:1019:3: (this_Expression_4= ruleExpression ruleEND_COMMAND )
                    {
                    // InternalPortugolParser.g:1019:3: (this_Expression_4= ruleExpression ruleEND_COMMAND )
                    // InternalPortugolParser.g:1020:4: this_Expression_4= ruleExpression ruleEND_COMMAND
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAbstractCommandAccess().getExpressionParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_5);
                    this_Expression_4=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_4;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAbstractCommandAccess().getEND_COMMANDParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleEND_COMMAND();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPortugolParser.g:1037:3: this_IfStatement_6= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractCommandAccess().getIfStatementParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfStatement_6=ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfStatement_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalPortugolParser.g:1046:3: this_SwitchCaseStatement_7= ruleSwitchCaseStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractCommandAccess().getSwitchCaseStatementParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SwitchCaseStatement_7=ruleSwitchCaseStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SwitchCaseStatement_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalPortugolParser.g:1055:3: this_ForStatement_8= ruleForStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractCommandAccess().getForStatementParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForStatement_8=ruleForStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForStatement_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalPortugolParser.g:1064:3: this_RepeatStatement_9= ruleRepeatStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractCommandAccess().getRepeatStatementParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RepeatStatement_9=ruleRepeatStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RepeatStatement_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalPortugolParser.g:1073:3: this_WhileStatement_10= ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractCommandAccess().getWhileStatementParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_WhileStatement_10=ruleWhileStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WhileStatement_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalPortugolParser.g:1082:3: (this_BreakStatement_11= ruleBreakStatement ruleEND_COMMAND )
                    {
                    // InternalPortugolParser.g:1082:3: (this_BreakStatement_11= ruleBreakStatement ruleEND_COMMAND )
                    // InternalPortugolParser.g:1083:4: this_BreakStatement_11= ruleBreakStatement ruleEND_COMMAND
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAbstractCommandAccess().getBreakStatementParserRuleCall_8_0());
                      			
                    }
                    pushFollow(FOLLOW_5);
                    this_BreakStatement_11=ruleBreakStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_BreakStatement_11;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAbstractCommandAccess().getEND_COMMANDParserRuleCall_8_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleEND_COMMAND();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalPortugolParser.g:1100:3: (this_ReturnStatement_13= ruleReturnStatement ruleEND_COMMAND )
                    {
                    // InternalPortugolParser.g:1100:3: (this_ReturnStatement_13= ruleReturnStatement ruleEND_COMMAND )
                    // InternalPortugolParser.g:1101:4: this_ReturnStatement_13= ruleReturnStatement ruleEND_COMMAND
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAbstractCommandAccess().getReturnStatementParserRuleCall_9_0());
                      			
                    }
                    pushFollow(FOLLOW_5);
                    this_ReturnStatement_13=ruleReturnStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ReturnStatement_13;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAbstractCommandAccess().getEND_COMMANDParserRuleCall_9_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleEND_COMMAND();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractCommand"


    // $ANTLR start "entryRuleBreakStatement"
    // InternalPortugolParser.g:1121:1: entryRuleBreakStatement returns [EObject current=null] : iv_ruleBreakStatement= ruleBreakStatement EOF ;
    public final EObject entryRuleBreakStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakStatement = null;


        try {
            // InternalPortugolParser.g:1121:55: (iv_ruleBreakStatement= ruleBreakStatement EOF )
            // InternalPortugolParser.g:1122:2: iv_ruleBreakStatement= ruleBreakStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBreakStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBreakStatement=ruleBreakStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBreakStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBreakStatement"


    // $ANTLR start "ruleBreakStatement"
    // InternalPortugolParser.g:1128:1: ruleBreakStatement returns [EObject current=null] : ( () otherlv_1= Interrompa ) ;
    public final EObject ruleBreakStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:1134:2: ( ( () otherlv_1= Interrompa ) )
            // InternalPortugolParser.g:1135:2: ( () otherlv_1= Interrompa )
            {
            // InternalPortugolParser.g:1135:2: ( () otherlv_1= Interrompa )
            // InternalPortugolParser.g:1136:3: () otherlv_1= Interrompa
            {
            // InternalPortugolParser.g:1136:3: ()
            // InternalPortugolParser.g:1137:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBreakStatementAccess().getBreakStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Interrompa,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBreakStatementAccess().getInterrompaKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBreakStatement"


    // $ANTLR start "entryRuleReturnStatement"
    // InternalPortugolParser.g:1151:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // InternalPortugolParser.g:1151:56: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalPortugolParser.g:1152:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // InternalPortugolParser.g:1158:1: ruleReturnStatement returns [EObject current=null] : ( () otherlv_1= Retorne ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:1164:2: ( ( () otherlv_1= Retorne ( (lv_expr_2_0= ruleExpression ) ) ) )
            // InternalPortugolParser.g:1165:2: ( () otherlv_1= Retorne ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // InternalPortugolParser.g:1165:2: ( () otherlv_1= Retorne ( (lv_expr_2_0= ruleExpression ) ) )
            // InternalPortugolParser.g:1166:3: () otherlv_1= Retorne ( (lv_expr_2_0= ruleExpression ) )
            {
            // InternalPortugolParser.g:1166:3: ()
            // InternalPortugolParser.g:1167:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnStatementAccess().getReturnExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Retorne,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReturnStatementAccess().getRetorneKeyword_1());
              		
            }
            // InternalPortugolParser.g:1177:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalPortugolParser.g:1178:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalPortugolParser.g:1178:4: (lv_expr_2_0= ruleExpression )
            // InternalPortugolParser.g:1179:5: lv_expr_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReturnStatementAccess().getExprExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReturnStatementRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_2_0,
              						"org.hopper.language.Portugol.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleIfStatement"
    // InternalPortugolParser.g:1200:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalPortugolParser.g:1200:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalPortugolParser.g:1201:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalPortugolParser.g:1207:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= Se ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= Entao ( (lv_commands_3_0= ruleAbstractCommand ) )+ (otherlv_4= Senao ( (lv_elseCommands_5_0= ruleAbstractCommand ) )+ )? otherlv_6= Fimse ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expr_1_0 = null;

        EObject lv_commands_3_0 = null;

        EObject lv_elseCommands_5_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:1213:2: ( (otherlv_0= Se ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= Entao ( (lv_commands_3_0= ruleAbstractCommand ) )+ (otherlv_4= Senao ( (lv_elseCommands_5_0= ruleAbstractCommand ) )+ )? otherlv_6= Fimse ) )
            // InternalPortugolParser.g:1214:2: (otherlv_0= Se ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= Entao ( (lv_commands_3_0= ruleAbstractCommand ) )+ (otherlv_4= Senao ( (lv_elseCommands_5_0= ruleAbstractCommand ) )+ )? otherlv_6= Fimse )
            {
            // InternalPortugolParser.g:1214:2: (otherlv_0= Se ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= Entao ( (lv_commands_3_0= ruleAbstractCommand ) )+ (otherlv_4= Senao ( (lv_elseCommands_5_0= ruleAbstractCommand ) )+ )? otherlv_6= Fimse )
            // InternalPortugolParser.g:1215:3: otherlv_0= Se ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= Entao ( (lv_commands_3_0= ruleAbstractCommand ) )+ (otherlv_4= Senao ( (lv_elseCommands_5_0= ruleAbstractCommand ) )+ )? otherlv_6= Fimse
            {
            otherlv_0=(Token)match(input,Se,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getSeKeyword_0());
              		
            }
            // InternalPortugolParser.g:1219:3: ( (lv_expr_1_0= ruleExpression ) )
            // InternalPortugolParser.g:1220:4: (lv_expr_1_0= ruleExpression )
            {
            // InternalPortugolParser.g:1220:4: (lv_expr_1_0= ruleExpression )
            // InternalPortugolParser.g:1221:5: lv_expr_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getExprExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_expr_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStatementRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_1_0,
              						"org.hopper.language.Portugol.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Entao,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getEntaoKeyword_2());
              		
            }
            // InternalPortugolParser.g:1242:3: ( (lv_commands_3_0= ruleAbstractCommand ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Interrompa||(LA15_0>=Enquanto && LA15_0<=Escreva)||LA15_0==Retorne||(LA15_0>=Maiusc && LA15_0<=Copia)||LA15_0==Raizq||(LA15_0>=Leia && LA15_0<=Para)||LA15_0==NOT||(LA15_0>=Pi && LA15_0<=Se)||LA15_0==LeftParenthesis||LA15_0==HyphenMinus||(LA15_0>=RULE_INT && LA15_0<=RULE_STRING)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPortugolParser.g:1243:4: (lv_commands_3_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugolParser.g:1243:4: (lv_commands_3_0= ruleAbstractCommand )
            	    // InternalPortugolParser.g:1244:5: lv_commands_3_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfStatementAccess().getCommandsAbstractCommandParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_commands_3_0=ruleAbstractCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	      					}
            	      					add(
            	      						current,
            	      						"commands",
            	      						lv_commands_3_0,
            	      						"org.hopper.language.Portugol.AbstractCommand");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            // InternalPortugolParser.g:1261:3: (otherlv_4= Senao ( (lv_elseCommands_5_0= ruleAbstractCommand ) )+ )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Senao) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPortugolParser.g:1262:4: otherlv_4= Senao ( (lv_elseCommands_5_0= ruleAbstractCommand ) )+
                    {
                    otherlv_4=(Token)match(input,Senao,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getSenaoKeyword_4_0());
                      			
                    }
                    // InternalPortugolParser.g:1266:4: ( (lv_elseCommands_5_0= ruleAbstractCommand ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==Interrompa||(LA16_0>=Enquanto && LA16_0<=Escreva)||LA16_0==Retorne||(LA16_0>=Maiusc && LA16_0<=Copia)||LA16_0==Raizq||(LA16_0>=Leia && LA16_0<=Para)||LA16_0==NOT||(LA16_0>=Pi && LA16_0<=Se)||LA16_0==LeftParenthesis||LA16_0==HyphenMinus||(LA16_0>=RULE_INT && LA16_0<=RULE_STRING)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalPortugolParser.g:1267:5: (lv_elseCommands_5_0= ruleAbstractCommand )
                    	    {
                    	    // InternalPortugolParser.g:1267:5: (lv_elseCommands_5_0= ruleAbstractCommand )
                    	    // InternalPortugolParser.g:1268:6: lv_elseCommands_5_0= ruleAbstractCommand
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getIfStatementAccess().getElseCommandsAbstractCommandParserRuleCall_4_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_23);
                    	    lv_elseCommands_5_0=ruleAbstractCommand();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"elseCommands",
                    	      							lv_elseCommands_5_0,
                    	      							"org.hopper.language.Portugol.AbstractCommand");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,Fimse,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getFimseKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleSwitchCaseStatement"
    // InternalPortugolParser.g:1294:1: entryRuleSwitchCaseStatement returns [EObject current=null] : iv_ruleSwitchCaseStatement= ruleSwitchCaseStatement EOF ;
    public final EObject entryRuleSwitchCaseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCaseStatement = null;


        try {
            // InternalPortugolParser.g:1294:60: (iv_ruleSwitchCaseStatement= ruleSwitchCaseStatement EOF )
            // InternalPortugolParser.g:1295:2: iv_ruleSwitchCaseStatement= ruleSwitchCaseStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchCaseStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSwitchCaseStatement=ruleSwitchCaseStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchCaseStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitchCaseStatement"


    // $ANTLR start "ruleSwitchCaseStatement"
    // InternalPortugolParser.g:1301:1: ruleSwitchCaseStatement returns [EObject current=null] : (otherlv_0= Escolha ( (otherlv_1= RULE_ID ) ) ( (lv_caseList_2_0= ruleCaseList ) )+ ( (lv_otherCase_3_0= ruleOtherCase ) )? otherlv_4= Fimescolha ) ;
    public final EObject ruleSwitchCaseStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_caseList_2_0 = null;

        EObject lv_otherCase_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:1307:2: ( (otherlv_0= Escolha ( (otherlv_1= RULE_ID ) ) ( (lv_caseList_2_0= ruleCaseList ) )+ ( (lv_otherCase_3_0= ruleOtherCase ) )? otherlv_4= Fimescolha ) )
            // InternalPortugolParser.g:1308:2: (otherlv_0= Escolha ( (otherlv_1= RULE_ID ) ) ( (lv_caseList_2_0= ruleCaseList ) )+ ( (lv_otherCase_3_0= ruleOtherCase ) )? otherlv_4= Fimescolha )
            {
            // InternalPortugolParser.g:1308:2: (otherlv_0= Escolha ( (otherlv_1= RULE_ID ) ) ( (lv_caseList_2_0= ruleCaseList ) )+ ( (lv_otherCase_3_0= ruleOtherCase ) )? otherlv_4= Fimescolha )
            // InternalPortugolParser.g:1309:3: otherlv_0= Escolha ( (otherlv_1= RULE_ID ) ) ( (lv_caseList_2_0= ruleCaseList ) )+ ( (lv_otherCase_3_0= ruleOtherCase ) )? otherlv_4= Fimescolha
            {
            otherlv_0=(Token)match(input,Escolha,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSwitchCaseStatementAccess().getEscolhaKeyword_0());
              		
            }
            // InternalPortugolParser.g:1313:3: ( (otherlv_1= RULE_ID ) )
            // InternalPortugolParser.g:1314:4: (otherlv_1= RULE_ID )
            {
            // InternalPortugolParser.g:1314:4: (otherlv_1= RULE_ID )
            // InternalPortugolParser.g:1315:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSwitchCaseStatementRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getSwitchCaseStatementAccess().getVariableVarNameCrossReference_1_0());
              				
            }

            }


            }

            // InternalPortugolParser.g:1326:3: ( (lv_caseList_2_0= ruleCaseList ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Caso) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPortugolParser.g:1327:4: (lv_caseList_2_0= ruleCaseList )
            	    {
            	    // InternalPortugolParser.g:1327:4: (lv_caseList_2_0= ruleCaseList )
            	    // InternalPortugolParser.g:1328:5: lv_caseList_2_0= ruleCaseList
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSwitchCaseStatementAccess().getCaseListCaseListParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_caseList_2_0=ruleCaseList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSwitchCaseStatementRule());
            	      					}
            	      					add(
            	      						current,
            	      						"caseList",
            	      						lv_caseList_2_0,
            	      						"org.hopper.language.Portugol.CaseList");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            // InternalPortugolParser.g:1345:3: ( (lv_otherCase_3_0= ruleOtherCase ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Outrocaso) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPortugolParser.g:1346:4: (lv_otherCase_3_0= ruleOtherCase )
                    {
                    // InternalPortugolParser.g:1346:4: (lv_otherCase_3_0= ruleOtherCase )
                    // InternalPortugolParser.g:1347:5: lv_otherCase_3_0= ruleOtherCase
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSwitchCaseStatementAccess().getOtherCaseOtherCaseParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_26);
                    lv_otherCase_3_0=ruleOtherCase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSwitchCaseStatementRule());
                      					}
                      					set(
                      						current,
                      						"otherCase",
                      						lv_otherCase_3_0,
                      						"org.hopper.language.Portugol.OtherCase");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,Fimescolha,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSwitchCaseStatementAccess().getFimescolhaKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitchCaseStatement"


    // $ANTLR start "entryRuleCaseList"
    // InternalPortugolParser.g:1372:1: entryRuleCaseList returns [EObject current=null] : iv_ruleCaseList= ruleCaseList EOF ;
    public final EObject entryRuleCaseList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseList = null;


        try {
            // InternalPortugolParser.g:1372:49: (iv_ruleCaseList= ruleCaseList EOF )
            // InternalPortugolParser.g:1373:2: iv_ruleCaseList= ruleCaseList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCaseList=ruleCaseList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCaseList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCaseList"


    // $ANTLR start "ruleCaseList"
    // InternalPortugolParser.g:1379:1: ruleCaseList returns [EObject current=null] : (otherlv_0= Caso ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= Colon ( (lv_commands_3_0= ruleAbstractCommand ) )+ ) ;
    public final EObject ruleCaseList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;

        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:1385:2: ( (otherlv_0= Caso ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= Colon ( (lv_commands_3_0= ruleAbstractCommand ) )+ ) )
            // InternalPortugolParser.g:1386:2: (otherlv_0= Caso ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= Colon ( (lv_commands_3_0= ruleAbstractCommand ) )+ )
            {
            // InternalPortugolParser.g:1386:2: (otherlv_0= Caso ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= Colon ( (lv_commands_3_0= ruleAbstractCommand ) )+ )
            // InternalPortugolParser.g:1387:3: otherlv_0= Caso ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= Colon ( (lv_commands_3_0= ruleAbstractCommand ) )+
            {
            otherlv_0=(Token)match(input,Caso,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCaseListAccess().getCasoKeyword_0());
              		
            }
            // InternalPortugolParser.g:1391:3: ( (lv_expr_1_0= ruleExpression ) )
            // InternalPortugolParser.g:1392:4: (lv_expr_1_0= ruleExpression )
            {
            // InternalPortugolParser.g:1392:4: (lv_expr_1_0= ruleExpression )
            // InternalPortugolParser.g:1393:5: lv_expr_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseListAccess().getExprExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_expr_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCaseListRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_1_0,
              						"org.hopper.language.Portugol.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCaseListAccess().getColonKeyword_2());
              		
            }
            // InternalPortugolParser.g:1414:3: ( (lv_commands_3_0= ruleAbstractCommand ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Interrompa||(LA20_0>=Enquanto && LA20_0<=Escreva)||LA20_0==Retorne||(LA20_0>=Maiusc && LA20_0<=Copia)||LA20_0==Raizq||(LA20_0>=Leia && LA20_0<=Para)||LA20_0==NOT||(LA20_0>=Pi && LA20_0<=Se)||LA20_0==LeftParenthesis||LA20_0==HyphenMinus||(LA20_0>=RULE_INT && LA20_0<=RULE_STRING)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPortugolParser.g:1415:4: (lv_commands_3_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugolParser.g:1415:4: (lv_commands_3_0= ruleAbstractCommand )
            	    // InternalPortugolParser.g:1416:5: lv_commands_3_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCaseListAccess().getCommandsAbstractCommandParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_commands_3_0=ruleAbstractCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCaseListRule());
            	      					}
            	      					add(
            	      						current,
            	      						"commands",
            	      						lv_commands_3_0,
            	      						"org.hopper.language.Portugol.AbstractCommand");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCaseList"


    // $ANTLR start "entryRuleOtherCase"
    // InternalPortugolParser.g:1437:1: entryRuleOtherCase returns [EObject current=null] : iv_ruleOtherCase= ruleOtherCase EOF ;
    public final EObject entryRuleOtherCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherCase = null;


        try {
            // InternalPortugolParser.g:1437:50: (iv_ruleOtherCase= ruleOtherCase EOF )
            // InternalPortugolParser.g:1438:2: iv_ruleOtherCase= ruleOtherCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOtherCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOtherCase=ruleOtherCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOtherCase; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOtherCase"


    // $ANTLR start "ruleOtherCase"
    // InternalPortugolParser.g:1444:1: ruleOtherCase returns [EObject current=null] : (otherlv_0= Outrocaso otherlv_1= Colon ( (lv_otherCaseCommands_2_0= ruleAbstractCommand ) )+ ) ;
    public final EObject ruleOtherCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_otherCaseCommands_2_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:1450:2: ( (otherlv_0= Outrocaso otherlv_1= Colon ( (lv_otherCaseCommands_2_0= ruleAbstractCommand ) )+ ) )
            // InternalPortugolParser.g:1451:2: (otherlv_0= Outrocaso otherlv_1= Colon ( (lv_otherCaseCommands_2_0= ruleAbstractCommand ) )+ )
            {
            // InternalPortugolParser.g:1451:2: (otherlv_0= Outrocaso otherlv_1= Colon ( (lv_otherCaseCommands_2_0= ruleAbstractCommand ) )+ )
            // InternalPortugolParser.g:1452:3: otherlv_0= Outrocaso otherlv_1= Colon ( (lv_otherCaseCommands_2_0= ruleAbstractCommand ) )+
            {
            otherlv_0=(Token)match(input,Outrocaso,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOtherCaseAccess().getOutrocasoKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOtherCaseAccess().getColonKeyword_1());
              		
            }
            // InternalPortugolParser.g:1460:3: ( (lv_otherCaseCommands_2_0= ruleAbstractCommand ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Interrompa||(LA21_0>=Enquanto && LA21_0<=Escreva)||LA21_0==Retorne||(LA21_0>=Maiusc && LA21_0<=Copia)||LA21_0==Raizq||(LA21_0>=Leia && LA21_0<=Para)||LA21_0==NOT||(LA21_0>=Pi && LA21_0<=Se)||LA21_0==LeftParenthesis||LA21_0==HyphenMinus||(LA21_0>=RULE_INT && LA21_0<=RULE_STRING)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPortugolParser.g:1461:4: (lv_otherCaseCommands_2_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugolParser.g:1461:4: (lv_otherCaseCommands_2_0= ruleAbstractCommand )
            	    // InternalPortugolParser.g:1462:5: lv_otherCaseCommands_2_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getOtherCaseAccess().getOtherCaseCommandsAbstractCommandParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_otherCaseCommands_2_0=ruleAbstractCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getOtherCaseRule());
            	      					}
            	      					add(
            	      						current,
            	      						"otherCaseCommands",
            	      						lv_otherCaseCommands_2_0,
            	      						"org.hopper.language.Portugol.AbstractCommand");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOtherCase"


    // $ANTLR start "entryRuleForStatement"
    // InternalPortugolParser.g:1483:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalPortugolParser.g:1483:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalPortugolParser.g:1484:2: iv_ruleForStatement= ruleForStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForStatement=ruleForStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForStatement"


    // $ANTLR start "ruleForStatement"
    // InternalPortugolParser.g:1490:1: ruleForStatement returns [EObject current=null] : (otherlv_0= Para ( (lv_operatorExpr_1_0= ruleExpression ) ) otherlv_2= De ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= Ate ( (lv_endExpr_5_0= ruleExpression ) ) (otherlv_6= Passo ( (lv_stepExpe_7_0= ruleExpression ) ) )? otherlv_8= Faca ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= Fimpara ) ;
    public final EObject ruleForStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_operatorExpr_1_0 = null;

        EObject lv_startExpr_3_0 = null;

        EObject lv_endExpr_5_0 = null;

        EObject lv_stepExpe_7_0 = null;

        EObject lv_commands_9_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:1496:2: ( (otherlv_0= Para ( (lv_operatorExpr_1_0= ruleExpression ) ) otherlv_2= De ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= Ate ( (lv_endExpr_5_0= ruleExpression ) ) (otherlv_6= Passo ( (lv_stepExpe_7_0= ruleExpression ) ) )? otherlv_8= Faca ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= Fimpara ) )
            // InternalPortugolParser.g:1497:2: (otherlv_0= Para ( (lv_operatorExpr_1_0= ruleExpression ) ) otherlv_2= De ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= Ate ( (lv_endExpr_5_0= ruleExpression ) ) (otherlv_6= Passo ( (lv_stepExpe_7_0= ruleExpression ) ) )? otherlv_8= Faca ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= Fimpara )
            {
            // InternalPortugolParser.g:1497:2: (otherlv_0= Para ( (lv_operatorExpr_1_0= ruleExpression ) ) otherlv_2= De ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= Ate ( (lv_endExpr_5_0= ruleExpression ) ) (otherlv_6= Passo ( (lv_stepExpe_7_0= ruleExpression ) ) )? otherlv_8= Faca ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= Fimpara )
            // InternalPortugolParser.g:1498:3: otherlv_0= Para ( (lv_operatorExpr_1_0= ruleExpression ) ) otherlv_2= De ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= Ate ( (lv_endExpr_5_0= ruleExpression ) ) (otherlv_6= Passo ( (lv_stepExpe_7_0= ruleExpression ) ) )? otherlv_8= Faca ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= Fimpara
            {
            otherlv_0=(Token)match(input,Para,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getParaKeyword_0());
              		
            }
            // InternalPortugolParser.g:1502:3: ( (lv_operatorExpr_1_0= ruleExpression ) )
            // InternalPortugolParser.g:1503:4: (lv_operatorExpr_1_0= ruleExpression )
            {
            // InternalPortugolParser.g:1503:4: (lv_operatorExpr_1_0= ruleExpression )
            // InternalPortugolParser.g:1504:5: lv_operatorExpr_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getOperatorExprExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_operatorExpr_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForStatementRule());
              					}
              					set(
              						current,
              						"operatorExpr",
              						lv_operatorExpr_1_0,
              						"org.hopper.language.Portugol.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,De,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForStatementAccess().getDeKeyword_2());
              		
            }
            // InternalPortugolParser.g:1525:3: ( (lv_startExpr_3_0= ruleExpression ) )
            // InternalPortugolParser.g:1526:4: (lv_startExpr_3_0= ruleExpression )
            {
            // InternalPortugolParser.g:1526:4: (lv_startExpr_3_0= ruleExpression )
            // InternalPortugolParser.g:1527:5: lv_startExpr_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getStartExprExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_startExpr_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForStatementRule());
              					}
              					set(
              						current,
              						"startExpr",
              						lv_startExpr_3_0,
              						"org.hopper.language.Portugol.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,Ate,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForStatementAccess().getAteKeyword_4());
              		
            }
            // InternalPortugolParser.g:1548:3: ( (lv_endExpr_5_0= ruleExpression ) )
            // InternalPortugolParser.g:1549:4: (lv_endExpr_5_0= ruleExpression )
            {
            // InternalPortugolParser.g:1549:4: (lv_endExpr_5_0= ruleExpression )
            // InternalPortugolParser.g:1550:5: lv_endExpr_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getEndExprExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_endExpr_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForStatementRule());
              					}
              					set(
              						current,
              						"endExpr",
              						lv_endExpr_5_0,
              						"org.hopper.language.Portugol.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPortugolParser.g:1567:3: (otherlv_6= Passo ( (lv_stepExpe_7_0= ruleExpression ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Passo) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPortugolParser.g:1568:4: otherlv_6= Passo ( (lv_stepExpe_7_0= ruleExpression ) )
                    {
                    otherlv_6=(Token)match(input,Passo,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getForStatementAccess().getPassoKeyword_6_0());
                      			
                    }
                    // InternalPortugolParser.g:1572:4: ( (lv_stepExpe_7_0= ruleExpression ) )
                    // InternalPortugolParser.g:1573:5: (lv_stepExpe_7_0= ruleExpression )
                    {
                    // InternalPortugolParser.g:1573:5: (lv_stepExpe_7_0= ruleExpression )
                    // InternalPortugolParser.g:1574:6: lv_stepExpe_7_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getForStatementAccess().getStepExpeExpressionParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_31);
                    lv_stepExpe_7_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getForStatementRule());
                      						}
                      						set(
                      							current,
                      							"stepExpe",
                      							lv_stepExpe_7_0,
                      							"org.hopper.language.Portugol.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,Faca,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getForStatementAccess().getFacaKeyword_7());
              		
            }
            // InternalPortugolParser.g:1596:3: ( (lv_commands_9_0= ruleAbstractCommand ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==Interrompa||(LA23_0>=Enquanto && LA23_0<=Escreva)||LA23_0==Retorne||(LA23_0>=Maiusc && LA23_0<=Copia)||LA23_0==Raizq||(LA23_0>=Leia && LA23_0<=Para)||LA23_0==NOT||(LA23_0>=Pi && LA23_0<=Se)||LA23_0==LeftParenthesis||LA23_0==HyphenMinus||(LA23_0>=RULE_INT && LA23_0<=RULE_STRING)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalPortugolParser.g:1597:4: (lv_commands_9_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugolParser.g:1597:4: (lv_commands_9_0= ruleAbstractCommand )
            	    // InternalPortugolParser.g:1598:5: lv_commands_9_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getForStatementAccess().getCommandsAbstractCommandParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_32);
            	    lv_commands_9_0=ruleAbstractCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getForStatementRule());
            	      					}
            	      					add(
            	      						current,
            	      						"commands",
            	      						lv_commands_9_0,
            	      						"org.hopper.language.Portugol.AbstractCommand");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            otherlv_10=(Token)match(input,Fimpara,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getForStatementAccess().getFimparaKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalPortugolParser.g:1623:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalPortugolParser.g:1623:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalPortugolParser.g:1624:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalPortugolParser.g:1630:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= Enquanto ( (lv_whileExpr_1_0= ruleExpression ) ) otherlv_2= Faca ( (lv_commands_3_0= ruleAbstractCommand ) )+ otherlv_4= Fimenquanto ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_whileExpr_1_0 = null;

        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:1636:2: ( (otherlv_0= Enquanto ( (lv_whileExpr_1_0= ruleExpression ) ) otherlv_2= Faca ( (lv_commands_3_0= ruleAbstractCommand ) )+ otherlv_4= Fimenquanto ) )
            // InternalPortugolParser.g:1637:2: (otherlv_0= Enquanto ( (lv_whileExpr_1_0= ruleExpression ) ) otherlv_2= Faca ( (lv_commands_3_0= ruleAbstractCommand ) )+ otherlv_4= Fimenquanto )
            {
            // InternalPortugolParser.g:1637:2: (otherlv_0= Enquanto ( (lv_whileExpr_1_0= ruleExpression ) ) otherlv_2= Faca ( (lv_commands_3_0= ruleAbstractCommand ) )+ otherlv_4= Fimenquanto )
            // InternalPortugolParser.g:1638:3: otherlv_0= Enquanto ( (lv_whileExpr_1_0= ruleExpression ) ) otherlv_2= Faca ( (lv_commands_3_0= ruleAbstractCommand ) )+ otherlv_4= Fimenquanto
            {
            otherlv_0=(Token)match(input,Enquanto,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getEnquantoKeyword_0());
              		
            }
            // InternalPortugolParser.g:1642:3: ( (lv_whileExpr_1_0= ruleExpression ) )
            // InternalPortugolParser.g:1643:4: (lv_whileExpr_1_0= ruleExpression )
            {
            // InternalPortugolParser.g:1643:4: (lv_whileExpr_1_0= ruleExpression )
            // InternalPortugolParser.g:1644:5: lv_whileExpr_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileStatementAccess().getWhileExprExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_whileExpr_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
              					}
              					set(
              						current,
              						"whileExpr",
              						lv_whileExpr_1_0,
              						"org.hopper.language.Portugol.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Faca,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileStatementAccess().getFacaKeyword_2());
              		
            }
            // InternalPortugolParser.g:1665:3: ( (lv_commands_3_0= ruleAbstractCommand ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Interrompa||(LA24_0>=Enquanto && LA24_0<=Escreva)||LA24_0==Retorne||(LA24_0>=Maiusc && LA24_0<=Copia)||LA24_0==Raizq||(LA24_0>=Leia && LA24_0<=Para)||LA24_0==NOT||(LA24_0>=Pi && LA24_0<=Se)||LA24_0==LeftParenthesis||LA24_0==HyphenMinus||(LA24_0>=RULE_INT && LA24_0<=RULE_STRING)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPortugolParser.g:1666:4: (lv_commands_3_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugolParser.g:1666:4: (lv_commands_3_0= ruleAbstractCommand )
            	    // InternalPortugolParser.g:1667:5: lv_commands_3_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWhileStatementAccess().getCommandsAbstractCommandParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_33);
            	    lv_commands_3_0=ruleAbstractCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            	      					}
            	      					add(
            	      						current,
            	      						"commands",
            	      						lv_commands_3_0,
            	      						"org.hopper.language.Portugol.AbstractCommand");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_4=(Token)match(input,Fimenquanto,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWhileStatementAccess().getFimenquantoKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleRepeatStatement"
    // InternalPortugolParser.g:1692:1: entryRuleRepeatStatement returns [EObject current=null] : iv_ruleRepeatStatement= ruleRepeatStatement EOF ;
    public final EObject entryRuleRepeatStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatStatement = null;


        try {
            // InternalPortugolParser.g:1692:56: (iv_ruleRepeatStatement= ruleRepeatStatement EOF )
            // InternalPortugolParser.g:1693:2: iv_ruleRepeatStatement= ruleRepeatStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRepeatStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRepeatStatement=ruleRepeatStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRepeatStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepeatStatement"


    // $ANTLR start "ruleRepeatStatement"
    // InternalPortugolParser.g:1699:1: ruleRepeatStatement returns [EObject current=null] : (otherlv_0= Repita ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= Ate ( (lv_untilExpr_3_0= ruleExpression ) ) ruleEND_COMMAND ) ;
    public final EObject ruleRepeatStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_commands_1_0 = null;

        EObject lv_untilExpr_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:1705:2: ( (otherlv_0= Repita ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= Ate ( (lv_untilExpr_3_0= ruleExpression ) ) ruleEND_COMMAND ) )
            // InternalPortugolParser.g:1706:2: (otherlv_0= Repita ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= Ate ( (lv_untilExpr_3_0= ruleExpression ) ) ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:1706:2: (otherlv_0= Repita ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= Ate ( (lv_untilExpr_3_0= ruleExpression ) ) ruleEND_COMMAND )
            // InternalPortugolParser.g:1707:3: otherlv_0= Repita ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= Ate ( (lv_untilExpr_3_0= ruleExpression ) ) ruleEND_COMMAND
            {
            otherlv_0=(Token)match(input,Repita,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRepeatStatementAccess().getRepitaKeyword_0());
              		
            }
            // InternalPortugolParser.g:1711:3: ( (lv_commands_1_0= ruleAbstractCommand ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==Interrompa||(LA25_0>=Enquanto && LA25_0<=Escreva)||LA25_0==Retorne||(LA25_0>=Maiusc && LA25_0<=Copia)||LA25_0==Raizq||(LA25_0>=Leia && LA25_0<=Para)||LA25_0==NOT||(LA25_0>=Pi && LA25_0<=Se)||LA25_0==LeftParenthesis||LA25_0==HyphenMinus||(LA25_0>=RULE_INT && LA25_0<=RULE_STRING)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPortugolParser.g:1712:4: (lv_commands_1_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugolParser.g:1712:4: (lv_commands_1_0= ruleAbstractCommand )
            	    // InternalPortugolParser.g:1713:5: lv_commands_1_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRepeatStatementAccess().getCommandsAbstractCommandParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_34);
            	    lv_commands_1_0=ruleAbstractCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRepeatStatementRule());
            	      					}
            	      					add(
            	      						current,
            	      						"commands",
            	      						lv_commands_1_0,
            	      						"org.hopper.language.Portugol.AbstractCommand");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_2=(Token)match(input,Ate,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRepeatStatementAccess().getAteKeyword_2());
              		
            }
            // InternalPortugolParser.g:1734:3: ( (lv_untilExpr_3_0= ruleExpression ) )
            // InternalPortugolParser.g:1735:4: (lv_untilExpr_3_0= ruleExpression )
            {
            // InternalPortugolParser.g:1735:4: (lv_untilExpr_3_0= ruleExpression )
            // InternalPortugolParser.g:1736:5: lv_untilExpr_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRepeatStatementAccess().getUntilExprExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_untilExpr_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRepeatStatementRule());
              					}
              					set(
              						current,
              						"untilExpr",
              						lv_untilExpr_3_0,
              						"org.hopper.language.Portugol.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRepeatStatementAccess().getEND_COMMANDParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_2);
            ruleEND_COMMAND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepeatStatement"


    // $ANTLR start "entryRuleSubprogramParam"
    // InternalPortugolParser.g:1764:1: entryRuleSubprogramParam returns [EObject current=null] : iv_ruleSubprogramParam= ruleSubprogramParam EOF ;
    public final EObject entryRuleSubprogramParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubprogramParam = null;


        try {
            // InternalPortugolParser.g:1764:56: (iv_ruleSubprogramParam= ruleSubprogramParam EOF )
            // InternalPortugolParser.g:1765:2: iv_ruleSubprogramParam= ruleSubprogramParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubprogramParamRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubprogramParam=ruleSubprogramParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubprogramParam; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubprogramParam"


    // $ANTLR start "ruleSubprogramParam"
    // InternalPortugolParser.g:1771:1: ruleSubprogramParam returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= Comma ( (lv_expression_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleSubprogramParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:1777:2: ( ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= Comma ( (lv_expression_2_0= ruleExpression ) ) )* ) )
            // InternalPortugolParser.g:1778:2: ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= Comma ( (lv_expression_2_0= ruleExpression ) ) )* )
            {
            // InternalPortugolParser.g:1778:2: ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= Comma ( (lv_expression_2_0= ruleExpression ) ) )* )
            // InternalPortugolParser.g:1779:3: ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= Comma ( (lv_expression_2_0= ruleExpression ) ) )*
            {
            // InternalPortugolParser.g:1779:3: ( (lv_expression_0_0= ruleExpression ) )
            // InternalPortugolParser.g:1780:4: (lv_expression_0_0= ruleExpression )
            {
            // InternalPortugolParser.g:1780:4: (lv_expression_0_0= ruleExpression )
            // InternalPortugolParser.g:1781:5: lv_expression_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubprogramParamAccess().getExpressionExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_expression_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSubprogramParamRule());
              					}
              					add(
              						current,
              						"expression",
              						lv_expression_0_0,
              						"org.hopper.language.Portugol.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPortugolParser.g:1798:3: (otherlv_1= Comma ( (lv_expression_2_0= ruleExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==Comma) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPortugolParser.g:1799:4: otherlv_1= Comma ( (lv_expression_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getSubprogramParamAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPortugolParser.g:1803:4: ( (lv_expression_2_0= ruleExpression ) )
            	    // InternalPortugolParser.g:1804:5: (lv_expression_2_0= ruleExpression )
            	    {
            	    // InternalPortugolParser.g:1804:5: (lv_expression_2_0= ruleExpression )
            	    // InternalPortugolParser.g:1805:6: lv_expression_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSubprogramParamAccess().getExpressionExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_expression_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSubprogramParamRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expression",
            	      							lv_expression_2_0,
            	      							"org.hopper.language.Portugol.Expression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubprogramParam"


    // $ANTLR start "entryRuleReadCommand"
    // InternalPortugolParser.g:1827:1: entryRuleReadCommand returns [EObject current=null] : iv_ruleReadCommand= ruleReadCommand EOF ;
    public final EObject entryRuleReadCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadCommand = null;


        try {
            // InternalPortugolParser.g:1827:52: (iv_ruleReadCommand= ruleReadCommand EOF )
            // InternalPortugolParser.g:1828:2: iv_ruleReadCommand= ruleReadCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReadCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReadCommand=ruleReadCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReadCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReadCommand"


    // $ANTLR start "ruleReadCommand"
    // InternalPortugolParser.g:1834:1: ruleReadCommand returns [EObject current=null] : (otherlv_0= Leia otherlv_1= LeftParenthesis ( (lv_paramList_2_0= ruleDeclaredVarList ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleReadCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_paramList_2_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:1840:2: ( (otherlv_0= Leia otherlv_1= LeftParenthesis ( (lv_paramList_2_0= ruleDeclaredVarList ) ) otherlv_3= RightParenthesis ) )
            // InternalPortugolParser.g:1841:2: (otherlv_0= Leia otherlv_1= LeftParenthesis ( (lv_paramList_2_0= ruleDeclaredVarList ) ) otherlv_3= RightParenthesis )
            {
            // InternalPortugolParser.g:1841:2: (otherlv_0= Leia otherlv_1= LeftParenthesis ( (lv_paramList_2_0= ruleDeclaredVarList ) ) otherlv_3= RightParenthesis )
            // InternalPortugolParser.g:1842:3: otherlv_0= Leia otherlv_1= LeftParenthesis ( (lv_paramList_2_0= ruleDeclaredVarList ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Leia,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReadCommandAccess().getLeiaKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReadCommandAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalPortugolParser.g:1850:3: ( (lv_paramList_2_0= ruleDeclaredVarList ) )
            // InternalPortugolParser.g:1851:4: (lv_paramList_2_0= ruleDeclaredVarList )
            {
            // InternalPortugolParser.g:1851:4: (lv_paramList_2_0= ruleDeclaredVarList )
            // InternalPortugolParser.g:1852:5: lv_paramList_2_0= ruleDeclaredVarList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReadCommandAccess().getParamListDeclaredVarListParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_paramList_2_0=ruleDeclaredVarList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReadCommandRule());
              					}
              					set(
              						current,
              						"paramList",
              						lv_paramList_2_0,
              						"org.hopper.language.Portugol.DeclaredVarList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getReadCommandAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReadCommand"


    // $ANTLR start "entryRuleWriteCommand"
    // InternalPortugolParser.g:1877:1: entryRuleWriteCommand returns [EObject current=null] : iv_ruleWriteCommand= ruleWriteCommand EOF ;
    public final EObject entryRuleWriteCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteCommand = null;


        try {
            // InternalPortugolParser.g:1877:53: (iv_ruleWriteCommand= ruleWriteCommand EOF )
            // InternalPortugolParser.g:1878:2: iv_ruleWriteCommand= ruleWriteCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWriteCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWriteCommand=ruleWriteCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWriteCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWriteCommand"


    // $ANTLR start "ruleWriteCommand"
    // InternalPortugolParser.g:1884:1: ruleWriteCommand returns [EObject current=null] : ( ( ( (lv_writeCommand_0_1= Escreva | lv_writeCommand_0_2= Escreval ) ) ) otherlv_1= LeftParenthesis ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleWriteCommand() throws RecognitionException {
        EObject current = null;

        Token lv_writeCommand_0_1=null;
        Token lv_writeCommand_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_writeParam_2_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:1890:2: ( ( ( ( (lv_writeCommand_0_1= Escreva | lv_writeCommand_0_2= Escreval ) ) ) otherlv_1= LeftParenthesis ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= RightParenthesis ) )
            // InternalPortugolParser.g:1891:2: ( ( ( (lv_writeCommand_0_1= Escreva | lv_writeCommand_0_2= Escreval ) ) ) otherlv_1= LeftParenthesis ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= RightParenthesis )
            {
            // InternalPortugolParser.g:1891:2: ( ( ( (lv_writeCommand_0_1= Escreva | lv_writeCommand_0_2= Escreval ) ) ) otherlv_1= LeftParenthesis ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= RightParenthesis )
            // InternalPortugolParser.g:1892:3: ( ( (lv_writeCommand_0_1= Escreva | lv_writeCommand_0_2= Escreval ) ) ) otherlv_1= LeftParenthesis ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= RightParenthesis
            {
            // InternalPortugolParser.g:1892:3: ( ( (lv_writeCommand_0_1= Escreva | lv_writeCommand_0_2= Escreval ) ) )
            // InternalPortugolParser.g:1893:4: ( (lv_writeCommand_0_1= Escreva | lv_writeCommand_0_2= Escreval ) )
            {
            // InternalPortugolParser.g:1893:4: ( (lv_writeCommand_0_1= Escreva | lv_writeCommand_0_2= Escreval ) )
            // InternalPortugolParser.g:1894:5: (lv_writeCommand_0_1= Escreva | lv_writeCommand_0_2= Escreval )
            {
            // InternalPortugolParser.g:1894:5: (lv_writeCommand_0_1= Escreva | lv_writeCommand_0_2= Escreval )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Escreva) ) {
                alt27=1;
            }
            else if ( (LA27_0==Escreval) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalPortugolParser.g:1895:6: lv_writeCommand_0_1= Escreva
                    {
                    lv_writeCommand_0_1=(Token)match(input,Escreva,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_writeCommand_0_1, grammarAccess.getWriteCommandAccess().getWriteCommandEscrevaKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getWriteCommandRule());
                      						}
                      						setWithLastConsumed(current, "writeCommand", lv_writeCommand_0_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:1906:6: lv_writeCommand_0_2= Escreval
                    {
                    lv_writeCommand_0_2=(Token)match(input,Escreval,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_writeCommand_0_2, grammarAccess.getWriteCommandAccess().getWriteCommandEscrevalKeyword_0_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getWriteCommandRule());
                      						}
                      						setWithLastConsumed(current, "writeCommand", lv_writeCommand_0_2, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWriteCommandAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalPortugolParser.g:1923:3: ( (lv_writeParam_2_0= ruleWriteParam ) )
            // InternalPortugolParser.g:1924:4: (lv_writeParam_2_0= ruleWriteParam )
            {
            // InternalPortugolParser.g:1924:4: (lv_writeParam_2_0= ruleWriteParam )
            // InternalPortugolParser.g:1925:5: lv_writeParam_2_0= ruleWriteParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWriteCommandAccess().getWriteParamWriteParamParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_writeParam_2_0=ruleWriteParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWriteCommandRule());
              					}
              					set(
              						current,
              						"writeParam",
              						lv_writeParam_2_0,
              						"org.hopper.language.Portugol.WriteParam");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWriteCommandAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWriteCommand"


    // $ANTLR start "entryRuleWriteParam"
    // InternalPortugolParser.g:1950:1: entryRuleWriteParam returns [EObject current=null] : iv_ruleWriteParam= ruleWriteParam EOF ;
    public final EObject entryRuleWriteParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteParam = null;


        try {
            // InternalPortugolParser.g:1950:51: (iv_ruleWriteParam= ruleWriteParam EOF )
            // InternalPortugolParser.g:1951:2: iv_ruleWriteParam= ruleWriteParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWriteParamRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWriteParam=ruleWriteParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWriteParam; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWriteParam"


    // $ANTLR start "ruleWriteParam"
    // InternalPortugolParser.g:1957:1: ruleWriteParam returns [EObject current=null] : ( ( (lv_params_0_0= ruleSubprogramParam ) ) ( (lv_precision_1_0= ruleOptDecimalPrecision ) )? ) ;
    public final EObject ruleWriteParam() throws RecognitionException {
        EObject current = null;

        EObject lv_params_0_0 = null;

        EObject lv_precision_1_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:1963:2: ( ( ( (lv_params_0_0= ruleSubprogramParam ) ) ( (lv_precision_1_0= ruleOptDecimalPrecision ) )? ) )
            // InternalPortugolParser.g:1964:2: ( ( (lv_params_0_0= ruleSubprogramParam ) ) ( (lv_precision_1_0= ruleOptDecimalPrecision ) )? )
            {
            // InternalPortugolParser.g:1964:2: ( ( (lv_params_0_0= ruleSubprogramParam ) ) ( (lv_precision_1_0= ruleOptDecimalPrecision ) )? )
            // InternalPortugolParser.g:1965:3: ( (lv_params_0_0= ruleSubprogramParam ) ) ( (lv_precision_1_0= ruleOptDecimalPrecision ) )?
            {
            // InternalPortugolParser.g:1965:3: ( (lv_params_0_0= ruleSubprogramParam ) )
            // InternalPortugolParser.g:1966:4: (lv_params_0_0= ruleSubprogramParam )
            {
            // InternalPortugolParser.g:1966:4: (lv_params_0_0= ruleSubprogramParam )
            // InternalPortugolParser.g:1967:5: lv_params_0_0= ruleSubprogramParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWriteParamAccess().getParamsSubprogramParamParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_params_0_0=ruleSubprogramParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWriteParamRule());
              					}
              					set(
              						current,
              						"params",
              						lv_params_0_0,
              						"org.hopper.language.Portugol.SubprogramParam");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPortugolParser.g:1984:3: ( (lv_precision_1_0= ruleOptDecimalPrecision ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Colon) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPortugolParser.g:1985:4: (lv_precision_1_0= ruleOptDecimalPrecision )
                    {
                    // InternalPortugolParser.g:1985:4: (lv_precision_1_0= ruleOptDecimalPrecision )
                    // InternalPortugolParser.g:1986:5: lv_precision_1_0= ruleOptDecimalPrecision
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getWriteParamAccess().getPrecisionOptDecimalPrecisionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_precision_1_0=ruleOptDecimalPrecision();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getWriteParamRule());
                      					}
                      					set(
                      						current,
                      						"precision",
                      						lv_precision_1_0,
                      						"org.hopper.language.Portugol.OptDecimalPrecision");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWriteParam"


    // $ANTLR start "entryRuleOptDecimalPrecision"
    // InternalPortugolParser.g:2007:1: entryRuleOptDecimalPrecision returns [EObject current=null] : iv_ruleOptDecimalPrecision= ruleOptDecimalPrecision EOF ;
    public final EObject entryRuleOptDecimalPrecision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptDecimalPrecision = null;


        try {
            // InternalPortugolParser.g:2007:60: (iv_ruleOptDecimalPrecision= ruleOptDecimalPrecision EOF )
            // InternalPortugolParser.g:2008:2: iv_ruleOptDecimalPrecision= ruleOptDecimalPrecision EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptDecimalPrecisionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOptDecimalPrecision=ruleOptDecimalPrecision();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOptDecimalPrecision; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptDecimalPrecision"


    // $ANTLR start "ruleOptDecimalPrecision"
    // InternalPortugolParser.g:2014:1: ruleOptDecimalPrecision returns [EObject current=null] : (otherlv_0= Colon ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= Colon ( (lv_secondPrecision_3_0= RULE_INT ) ) )? ) ;
    public final EObject ruleOptDecimalPrecision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_firstPrecision_1_0=null;
        Token otherlv_2=null;
        Token lv_secondPrecision_3_0=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:2020:2: ( (otherlv_0= Colon ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= Colon ( (lv_secondPrecision_3_0= RULE_INT ) ) )? ) )
            // InternalPortugolParser.g:2021:2: (otherlv_0= Colon ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= Colon ( (lv_secondPrecision_3_0= RULE_INT ) ) )? )
            {
            // InternalPortugolParser.g:2021:2: (otherlv_0= Colon ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= Colon ( (lv_secondPrecision_3_0= RULE_INT ) ) )? )
            // InternalPortugolParser.g:2022:3: otherlv_0= Colon ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= Colon ( (lv_secondPrecision_3_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,Colon,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOptDecimalPrecisionAccess().getColonKeyword_0());
              		
            }
            // InternalPortugolParser.g:2026:3: ( (lv_firstPrecision_1_0= RULE_INT ) )
            // InternalPortugolParser.g:2027:4: (lv_firstPrecision_1_0= RULE_INT )
            {
            // InternalPortugolParser.g:2027:4: (lv_firstPrecision_1_0= RULE_INT )
            // InternalPortugolParser.g:2028:5: lv_firstPrecision_1_0= RULE_INT
            {
            lv_firstPrecision_1_0=(Token)match(input,RULE_INT,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_firstPrecision_1_0, grammarAccess.getOptDecimalPrecisionAccess().getFirstPrecisionINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOptDecimalPrecisionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"firstPrecision",
              						lv_firstPrecision_1_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            // InternalPortugolParser.g:2044:3: (otherlv_2= Colon ( (lv_secondPrecision_3_0= RULE_INT ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Colon) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPortugolParser.g:2045:4: otherlv_2= Colon ( (lv_secondPrecision_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,Colon,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOptDecimalPrecisionAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalPortugolParser.g:2049:4: ( (lv_secondPrecision_3_0= RULE_INT ) )
                    // InternalPortugolParser.g:2050:5: (lv_secondPrecision_3_0= RULE_INT )
                    {
                    // InternalPortugolParser.g:2050:5: (lv_secondPrecision_3_0= RULE_INT )
                    // InternalPortugolParser.g:2051:6: lv_secondPrecision_3_0= RULE_INT
                    {
                    lv_secondPrecision_3_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_secondPrecision_3_0, grammarAccess.getOptDecimalPrecisionAccess().getSecondPrecisionINTTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOptDecimalPrecisionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"secondPrecision",
                      							lv_secondPrecision_3_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptDecimalPrecision"


    // $ANTLR start "entryRuleExpression"
    // InternalPortugolParser.g:2072:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalPortugolParser.g:2072:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalPortugolParser.g:2073:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalPortugolParser.g:2079:1: ruleExpression returns [EObject current=null] : this_Assignment_0= ruleAssignment ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:2085:2: (this_Assignment_0= ruleAssignment )
            // InternalPortugolParser.g:2086:2: this_Assignment_0= ruleAssignment
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Assignment_0=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Assignment_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssignment"
    // InternalPortugolParser.g:2097:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalPortugolParser.g:2097:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalPortugolParser.g:2098:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalPortugolParser.g:2104:1: ruleAssignment returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression ( ( ( ( () ( ( LessThanSignHyphenMinus ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignHyphenMinus ) ) ) ) ( (lv_right_3_0= ruleAssignment ) ) )* ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_OrExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:2110:2: ( (this_OrExpression_0= ruleOrExpression ( ( ( ( () ( ( LessThanSignHyphenMinus ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignHyphenMinus ) ) ) ) ( (lv_right_3_0= ruleAssignment ) ) )* ) )
            // InternalPortugolParser.g:2111:2: (this_OrExpression_0= ruleOrExpression ( ( ( ( () ( ( LessThanSignHyphenMinus ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignHyphenMinus ) ) ) ) ( (lv_right_3_0= ruleAssignment ) ) )* )
            {
            // InternalPortugolParser.g:2111:2: (this_OrExpression_0= ruleOrExpression ( ( ( ( () ( ( LessThanSignHyphenMinus ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignHyphenMinus ) ) ) ) ( (lv_right_3_0= ruleAssignment ) ) )* )
            // InternalPortugolParser.g:2112:3: this_OrExpression_0= ruleOrExpression ( ( ( ( () ( ( LessThanSignHyphenMinus ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignHyphenMinus ) ) ) ) ( (lv_right_3_0= ruleAssignment ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssignmentAccess().getOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugolParser.g:2120:3: ( ( ( ( () ( ( LessThanSignHyphenMinus ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignHyphenMinus ) ) ) ) ( (lv_right_3_0= ruleAssignment ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==LessThanSignHyphenMinus) ) {
                    int LA30_2 = input.LA(2);

                    if ( (synpred1_InternalPortugolParser()) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // InternalPortugolParser.g:2121:4: ( ( ( () ( ( LessThanSignHyphenMinus ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignHyphenMinus ) ) ) ) ( (lv_right_3_0= ruleAssignment ) )
            	    {
            	    // InternalPortugolParser.g:2121:4: ( ( ( () ( ( LessThanSignHyphenMinus ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignHyphenMinus ) ) ) )
            	    // InternalPortugolParser.g:2122:5: ( ( () ( ( LessThanSignHyphenMinus ) ) ) )=> ( () ( (lv_op_2_0= LessThanSignHyphenMinus ) ) )
            	    {
            	    // InternalPortugolParser.g:2132:5: ( () ( (lv_op_2_0= LessThanSignHyphenMinus ) ) )
            	    // InternalPortugolParser.g:2133:6: () ( (lv_op_2_0= LessThanSignHyphenMinus ) )
            	    {
            	    // InternalPortugolParser.g:2133:6: ()
            	    // InternalPortugolParser.g:2134:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAssignmentAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugolParser.g:2140:6: ( (lv_op_2_0= LessThanSignHyphenMinus ) )
            	    // InternalPortugolParser.g:2141:7: (lv_op_2_0= LessThanSignHyphenMinus )
            	    {
            	    // InternalPortugolParser.g:2141:7: (lv_op_2_0= LessThanSignHyphenMinus )
            	    // InternalPortugolParser.g:2142:8: lv_op_2_0= LessThanSignHyphenMinus
            	    {
            	    lv_op_2_0=(Token)match(input,LessThanSignHyphenMinus,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(lv_op_2_0, grammarAccess.getAssignmentAccess().getOpLessThanSignHyphenMinusKeyword_1_0_0_1_0());
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getAssignmentRule());
            	      								}
            	      								setWithLastConsumed(current, "op", lv_op_2_0, "<-");
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalPortugolParser.g:2156:4: ( (lv_right_3_0= ruleAssignment ) )
            	    // InternalPortugolParser.g:2157:5: (lv_right_3_0= ruleAssignment )
            	    {
            	    // InternalPortugolParser.g:2157:5: (lv_right_3_0= ruleAssignment )
            	    // InternalPortugolParser.g:2158:6: lv_right_3_0= ruleAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAssignmentAccess().getRightAssignmentParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_37);
            	    lv_right_3_0=ruleAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.hopper.language.Portugol.Assignment");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleOrExpression"
    // InternalPortugolParser.g:2180:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalPortugolParser.g:2180:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalPortugolParser.g:2181:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalPortugolParser.g:2187:1: ruleOrExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( ( ( ( () ( ( OU ) ) ) )=> ( () ( (lv_op_2_0= OU ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_XorExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:2193:2: ( (this_XorExpression_0= ruleXorExpression ( ( ( ( () ( ( OU ) ) ) )=> ( () ( (lv_op_2_0= OU ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) )
            // InternalPortugolParser.g:2194:2: (this_XorExpression_0= ruleXorExpression ( ( ( ( () ( ( OU ) ) ) )=> ( () ( (lv_op_2_0= OU ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            {
            // InternalPortugolParser.g:2194:2: (this_XorExpression_0= ruleXorExpression ( ( ( ( () ( ( OU ) ) ) )=> ( () ( (lv_op_2_0= OU ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            // InternalPortugolParser.g:2195:3: this_XorExpression_0= ruleXorExpression ( ( ( ( () ( ( OU ) ) ) )=> ( () ( (lv_op_2_0= OU ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugolParser.g:2203:3: ( ( ( ( () ( ( OU ) ) ) )=> ( () ( (lv_op_2_0= OU ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==OU) && (synpred2_InternalPortugolParser())) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalPortugolParser.g:2204:4: ( ( ( () ( ( OU ) ) ) )=> ( () ( (lv_op_2_0= OU ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) )
            	    {
            	    // InternalPortugolParser.g:2204:4: ( ( ( () ( ( OU ) ) ) )=> ( () ( (lv_op_2_0= OU ) ) ) )
            	    // InternalPortugolParser.g:2205:5: ( ( () ( ( OU ) ) ) )=> ( () ( (lv_op_2_0= OU ) ) )
            	    {
            	    // InternalPortugolParser.g:2215:5: ( () ( (lv_op_2_0= OU ) ) )
            	    // InternalPortugolParser.g:2216:6: () ( (lv_op_2_0= OU ) )
            	    {
            	    // InternalPortugolParser.g:2216:6: ()
            	    // InternalPortugolParser.g:2217:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getOrExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugolParser.g:2223:6: ( (lv_op_2_0= OU ) )
            	    // InternalPortugolParser.g:2224:7: (lv_op_2_0= OU )
            	    {
            	    // InternalPortugolParser.g:2224:7: (lv_op_2_0= OU )
            	    // InternalPortugolParser.g:2225:8: lv_op_2_0= OU
            	    {
            	    lv_op_2_0=(Token)match(input,OU,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(lv_op_2_0, grammarAccess.getOrExpressionAccess().getOpOUKeyword_1_0_0_1_0());
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getOrExpressionRule());
            	      								}
            	      								setWithLastConsumed(current, "op", lv_op_2_0, "OU");
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalPortugolParser.g:2239:4: ( (lv_right_3_0= ruleXorExpression ) )
            	    // InternalPortugolParser.g:2240:5: (lv_right_3_0= ruleXorExpression )
            	    {
            	    // InternalPortugolParser.g:2240:5: (lv_right_3_0= ruleXorExpression )
            	    // InternalPortugolParser.g:2241:6: lv_right_3_0= ruleXorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightXorExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
            	    lv_right_3_0=ruleXorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.hopper.language.Portugol.XorExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleXorExpression"
    // InternalPortugolParser.g:2263:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalPortugolParser.g:2263:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalPortugolParser.g:2264:2: iv_ruleXorExpression= ruleXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXorExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXorExpression=ruleXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXorExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXorExpression"


    // $ANTLR start "ruleXorExpression"
    // InternalPortugolParser.g:2270:1: ruleXorExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( XOU ) ) ) )=> ( () ( (lv_op_2_0= XOU ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:2276:2: ( (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( XOU ) ) ) )=> ( () ( (lv_op_2_0= XOU ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalPortugolParser.g:2277:2: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( XOU ) ) ) )=> ( () ( (lv_op_2_0= XOU ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalPortugolParser.g:2277:2: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( XOU ) ) ) )=> ( () ( (lv_op_2_0= XOU ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalPortugolParser.g:2278:3: this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( XOU ) ) ) )=> ( () ( (lv_op_2_0= XOU ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugolParser.g:2286:3: ( ( ( ( () ( ( XOU ) ) ) )=> ( () ( (lv_op_2_0= XOU ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==XOU) && (synpred3_InternalPortugolParser())) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPortugolParser.g:2287:4: ( ( ( () ( ( XOU ) ) ) )=> ( () ( (lv_op_2_0= XOU ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalPortugolParser.g:2287:4: ( ( ( () ( ( XOU ) ) ) )=> ( () ( (lv_op_2_0= XOU ) ) ) )
            	    // InternalPortugolParser.g:2288:5: ( ( () ( ( XOU ) ) ) )=> ( () ( (lv_op_2_0= XOU ) ) )
            	    {
            	    // InternalPortugolParser.g:2298:5: ( () ( (lv_op_2_0= XOU ) ) )
            	    // InternalPortugolParser.g:2299:6: () ( (lv_op_2_0= XOU ) )
            	    {
            	    // InternalPortugolParser.g:2299:6: ()
            	    // InternalPortugolParser.g:2300:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getXorExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugolParser.g:2306:6: ( (lv_op_2_0= XOU ) )
            	    // InternalPortugolParser.g:2307:7: (lv_op_2_0= XOU )
            	    {
            	    // InternalPortugolParser.g:2307:7: (lv_op_2_0= XOU )
            	    // InternalPortugolParser.g:2308:8: lv_op_2_0= XOU
            	    {
            	    lv_op_2_0=(Token)match(input,XOU,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(lv_op_2_0, grammarAccess.getXorExpressionAccess().getOpXOUKeyword_1_0_0_1_0());
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getXorExpressionRule());
            	      								}
            	      								setWithLastConsumed(current, "op", lv_op_2_0, "XOU");
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalPortugolParser.g:2322:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalPortugolParser.g:2323:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalPortugolParser.g:2323:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalPortugolParser.g:2324:6: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXorExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getXorExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.hopper.language.Portugol.AndExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalPortugolParser.g:2346:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalPortugolParser.g:2346:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalPortugolParser.g:2347:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalPortugolParser.g:2353:1: ruleAndExpression returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( ( ( () ( ( ( Ampersand | E ) ) ) ) )=> ( () ( ( (lv_op_2_1= Ampersand | lv_op_2_2= E ) ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:2359:2: ( (this_Comparison_0= ruleComparison ( ( ( ( () ( ( ( Ampersand | E ) ) ) ) )=> ( () ( ( (lv_op_2_1= Ampersand | lv_op_2_2= E ) ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalPortugolParser.g:2360:2: (this_Comparison_0= ruleComparison ( ( ( ( () ( ( ( Ampersand | E ) ) ) ) )=> ( () ( ( (lv_op_2_1= Ampersand | lv_op_2_2= E ) ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalPortugolParser.g:2360:2: (this_Comparison_0= ruleComparison ( ( ( ( () ( ( ( Ampersand | E ) ) ) ) )=> ( () ( ( (lv_op_2_1= Ampersand | lv_op_2_2= E ) ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalPortugolParser.g:2361:3: this_Comparison_0= ruleComparison ( ( ( ( () ( ( ( Ampersand | E ) ) ) ) )=> ( () ( ( (lv_op_2_1= Ampersand | lv_op_2_2= E ) ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_40);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugolParser.g:2369:3: ( ( ( ( () ( ( ( Ampersand | E ) ) ) ) )=> ( () ( ( (lv_op_2_1= Ampersand | lv_op_2_2= E ) ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Ampersand) && (synpred4_InternalPortugolParser())) {
                    alt34=1;
                }
                else if ( (LA34_0==E) && (synpred4_InternalPortugolParser())) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalPortugolParser.g:2370:4: ( ( ( () ( ( ( Ampersand | E ) ) ) ) )=> ( () ( ( (lv_op_2_1= Ampersand | lv_op_2_2= E ) ) ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalPortugolParser.g:2370:4: ( ( ( () ( ( ( Ampersand | E ) ) ) ) )=> ( () ( ( (lv_op_2_1= Ampersand | lv_op_2_2= E ) ) ) ) )
            	    // InternalPortugolParser.g:2371:5: ( ( () ( ( ( Ampersand | E ) ) ) ) )=> ( () ( ( (lv_op_2_1= Ampersand | lv_op_2_2= E ) ) ) )
            	    {
            	    // InternalPortugolParser.g:2385:5: ( () ( ( (lv_op_2_1= Ampersand | lv_op_2_2= E ) ) ) )
            	    // InternalPortugolParser.g:2386:6: () ( ( (lv_op_2_1= Ampersand | lv_op_2_2= E ) ) )
            	    {
            	    // InternalPortugolParser.g:2386:6: ()
            	    // InternalPortugolParser.g:2387:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAndExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugolParser.g:2393:6: ( ( (lv_op_2_1= Ampersand | lv_op_2_2= E ) ) )
            	    // InternalPortugolParser.g:2394:7: ( (lv_op_2_1= Ampersand | lv_op_2_2= E ) )
            	    {
            	    // InternalPortugolParser.g:2394:7: ( (lv_op_2_1= Ampersand | lv_op_2_2= E ) )
            	    // InternalPortugolParser.g:2395:8: (lv_op_2_1= Ampersand | lv_op_2_2= E )
            	    {
            	    // InternalPortugolParser.g:2395:8: (lv_op_2_1= Ampersand | lv_op_2_2= E )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==Ampersand) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==E) ) {
            	        alt33=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalPortugolParser.g:2396:9: lv_op_2_1= Ampersand
            	            {
            	            lv_op_2_1=(Token)match(input,Ampersand,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_op_2_1, grammarAccess.getAndExpressionAccess().getOpAmpersandKeyword_1_0_0_1_0_0());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getAndExpressionRule());
            	              									}
            	              									setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              								
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalPortugolParser.g:2407:9: lv_op_2_2= E
            	            {
            	            lv_op_2_2=(Token)match(input,E,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_op_2_2, grammarAccess.getAndExpressionAccess().getOpEKeyword_1_0_0_1_0_1());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getAndExpressionRule());
            	              									}
            	              									setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              								
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // InternalPortugolParser.g:2422:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalPortugolParser.g:2423:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalPortugolParser.g:2423:5: (lv_right_3_0= ruleComparison )
            	    // InternalPortugolParser.g:2424:6: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.hopper.language.Portugol.Comparison");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleComparison"
    // InternalPortugolParser.g:2446:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalPortugolParser.g:2446:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalPortugolParser.g:2447:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalPortugolParser.g:2453:1: ruleComparison returns [EObject current=null] : (this_EquExpression_0= ruleEquExpression ( ( ( ( () ( ( ( EqualsSign | LessThanSignGreaterThanSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= LessThanSignGreaterThanSign ) ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_EquExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:2459:2: ( (this_EquExpression_0= ruleEquExpression ( ( ( ( () ( ( ( EqualsSign | LessThanSignGreaterThanSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= LessThanSignGreaterThanSign ) ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )* ) )
            // InternalPortugolParser.g:2460:2: (this_EquExpression_0= ruleEquExpression ( ( ( ( () ( ( ( EqualsSign | LessThanSignGreaterThanSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= LessThanSignGreaterThanSign ) ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )* )
            {
            // InternalPortugolParser.g:2460:2: (this_EquExpression_0= ruleEquExpression ( ( ( ( () ( ( ( EqualsSign | LessThanSignGreaterThanSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= LessThanSignGreaterThanSign ) ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )* )
            // InternalPortugolParser.g:2461:3: this_EquExpression_0= ruleEquExpression ( ( ( ( () ( ( ( EqualsSign | LessThanSignGreaterThanSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= LessThanSignGreaterThanSign ) ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getEquExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_41);
            this_EquExpression_0=ruleEquExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EquExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugolParser.g:2469:3: ( ( ( ( () ( ( ( EqualsSign | LessThanSignGreaterThanSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= LessThanSignGreaterThanSign ) ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==EqualsSign) && (synpred5_InternalPortugolParser())) {
                    alt36=1;
                }
                else if ( (LA36_0==LessThanSignGreaterThanSign) && (synpred5_InternalPortugolParser())) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalPortugolParser.g:2470:4: ( ( ( () ( ( ( EqualsSign | LessThanSignGreaterThanSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= LessThanSignGreaterThanSign ) ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) )
            	    {
            	    // InternalPortugolParser.g:2470:4: ( ( ( () ( ( ( EqualsSign | LessThanSignGreaterThanSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= LessThanSignGreaterThanSign ) ) ) ) )
            	    // InternalPortugolParser.g:2471:5: ( ( () ( ( ( EqualsSign | LessThanSignGreaterThanSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= LessThanSignGreaterThanSign ) ) ) )
            	    {
            	    // InternalPortugolParser.g:2485:5: ( () ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= LessThanSignGreaterThanSign ) ) ) )
            	    // InternalPortugolParser.g:2486:6: () ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= LessThanSignGreaterThanSign ) ) )
            	    {
            	    // InternalPortugolParser.g:2486:6: ()
            	    // InternalPortugolParser.g:2487:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getComparisonAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugolParser.g:2493:6: ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= LessThanSignGreaterThanSign ) ) )
            	    // InternalPortugolParser.g:2494:7: ( (lv_op_2_1= EqualsSign | lv_op_2_2= LessThanSignGreaterThanSign ) )
            	    {
            	    // InternalPortugolParser.g:2494:7: ( (lv_op_2_1= EqualsSign | lv_op_2_2= LessThanSignGreaterThanSign ) )
            	    // InternalPortugolParser.g:2495:8: (lv_op_2_1= EqualsSign | lv_op_2_2= LessThanSignGreaterThanSign )
            	    {
            	    // InternalPortugolParser.g:2495:8: (lv_op_2_1= EqualsSign | lv_op_2_2= LessThanSignGreaterThanSign )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==EqualsSign) ) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==LessThanSignGreaterThanSign) ) {
            	        alt35=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalPortugolParser.g:2496:9: lv_op_2_1= EqualsSign
            	            {
            	            lv_op_2_1=(Token)match(input,EqualsSign,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpEqualsSignKeyword_1_0_0_1_0_0());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getComparisonRule());
            	              									}
            	              									setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              								
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalPortugolParser.g:2507:9: lv_op_2_2= LessThanSignGreaterThanSign
            	            {
            	            lv_op_2_2=(Token)match(input,LessThanSignGreaterThanSign,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignGreaterThanSignKeyword_1_0_0_1_0_1());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getComparisonRule());
            	              									}
            	              									setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              								
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // InternalPortugolParser.g:2522:4: ( (lv_right_3_0= ruleEquExpression ) )
            	    // InternalPortugolParser.g:2523:5: (lv_right_3_0= ruleEquExpression )
            	    {
            	    // InternalPortugolParser.g:2523:5: (lv_right_3_0= ruleEquExpression )
            	    // InternalPortugolParser.g:2524:6: lv_right_3_0= ruleEquExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightEquExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
            	    lv_right_3_0=ruleEquExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.hopper.language.Portugol.EquExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleEquExpression"
    // InternalPortugolParser.g:2546:1: entryRuleEquExpression returns [EObject current=null] : iv_ruleEquExpression= ruleEquExpression EOF ;
    public final EObject entryRuleEquExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquExpression = null;


        try {
            // InternalPortugolParser.g:2546:54: (iv_ruleEquExpression= ruleEquExpression EOF )
            // InternalPortugolParser.g:2547:2: iv_ruleEquExpression= ruleEquExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEquExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEquExpression=ruleEquExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquExpression"


    // $ANTLR start "ruleEquExpression"
    // InternalPortugolParser.g:2553:1: ruleEquExpression returns [EObject current=null] : (this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ( LessThanSign | GreaterThanSign | LessThanSignEqualsSign | GreaterThanSignEqualsSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign | lv_op_2_3= LessThanSignEqualsSign | lv_op_2_4= GreaterThanSignEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* ) ;
    public final EObject ruleEquExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_AddExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:2559:2: ( (this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ( LessThanSign | GreaterThanSign | LessThanSignEqualsSign | GreaterThanSignEqualsSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign | lv_op_2_3= LessThanSignEqualsSign | lv_op_2_4= GreaterThanSignEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* ) )
            // InternalPortugolParser.g:2560:2: (this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ( LessThanSign | GreaterThanSign | LessThanSignEqualsSign | GreaterThanSignEqualsSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign | lv_op_2_3= LessThanSignEqualsSign | lv_op_2_4= GreaterThanSignEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* )
            {
            // InternalPortugolParser.g:2560:2: (this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ( LessThanSign | GreaterThanSign | LessThanSignEqualsSign | GreaterThanSignEqualsSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign | lv_op_2_3= LessThanSignEqualsSign | lv_op_2_4= GreaterThanSignEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* )
            // InternalPortugolParser.g:2561:3: this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ( LessThanSign | GreaterThanSign | LessThanSignEqualsSign | GreaterThanSignEqualsSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign | lv_op_2_3= LessThanSignEqualsSign | lv_op_2_4= GreaterThanSignEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEquExpressionAccess().getAddExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_42);
            this_AddExpression_0=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AddExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugolParser.g:2569:3: ( ( ( ( () ( ( ( LessThanSign | GreaterThanSign | LessThanSignEqualsSign | GreaterThanSignEqualsSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign | lv_op_2_3= LessThanSignEqualsSign | lv_op_2_4= GreaterThanSignEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==LessThanSign) && (synpred6_InternalPortugolParser())) {
                    alt38=1;
                }
                else if ( (LA38_0==GreaterThanSign) && (synpred6_InternalPortugolParser())) {
                    alt38=1;
                }
                else if ( (LA38_0==LessThanSignEqualsSign) && (synpred6_InternalPortugolParser())) {
                    alt38=1;
                }
                else if ( (LA38_0==GreaterThanSignEqualsSign) && (synpred6_InternalPortugolParser())) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalPortugolParser.g:2570:4: ( ( ( () ( ( ( LessThanSign | GreaterThanSign | LessThanSignEqualsSign | GreaterThanSignEqualsSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign | lv_op_2_3= LessThanSignEqualsSign | lv_op_2_4= GreaterThanSignEqualsSign ) ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) )
            	    {
            	    // InternalPortugolParser.g:2570:4: ( ( ( () ( ( ( LessThanSign | GreaterThanSign | LessThanSignEqualsSign | GreaterThanSignEqualsSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign | lv_op_2_3= LessThanSignEqualsSign | lv_op_2_4= GreaterThanSignEqualsSign ) ) ) ) )
            	    // InternalPortugolParser.g:2571:5: ( ( () ( ( ( LessThanSign | GreaterThanSign | LessThanSignEqualsSign | GreaterThanSignEqualsSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign | lv_op_2_3= LessThanSignEqualsSign | lv_op_2_4= GreaterThanSignEqualsSign ) ) ) )
            	    {
            	    // InternalPortugolParser.g:2589:5: ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign | lv_op_2_3= LessThanSignEqualsSign | lv_op_2_4= GreaterThanSignEqualsSign ) ) ) )
            	    // InternalPortugolParser.g:2590:6: () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign | lv_op_2_3= LessThanSignEqualsSign | lv_op_2_4= GreaterThanSignEqualsSign ) ) )
            	    {
            	    // InternalPortugolParser.g:2590:6: ()
            	    // InternalPortugolParser.g:2591:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getEquExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugolParser.g:2597:6: ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign | lv_op_2_3= LessThanSignEqualsSign | lv_op_2_4= GreaterThanSignEqualsSign ) ) )
            	    // InternalPortugolParser.g:2598:7: ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign | lv_op_2_3= LessThanSignEqualsSign | lv_op_2_4= GreaterThanSignEqualsSign ) )
            	    {
            	    // InternalPortugolParser.g:2598:7: ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign | lv_op_2_3= LessThanSignEqualsSign | lv_op_2_4= GreaterThanSignEqualsSign ) )
            	    // InternalPortugolParser.g:2599:8: (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign | lv_op_2_3= LessThanSignEqualsSign | lv_op_2_4= GreaterThanSignEqualsSign )
            	    {
            	    // InternalPortugolParser.g:2599:8: (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign | lv_op_2_3= LessThanSignEqualsSign | lv_op_2_4= GreaterThanSignEqualsSign )
            	    int alt37=4;
            	    switch ( input.LA(1) ) {
            	    case LessThanSign:
            	        {
            	        alt37=1;
            	        }
            	        break;
            	    case GreaterThanSign:
            	        {
            	        alt37=2;
            	        }
            	        break;
            	    case LessThanSignEqualsSign:
            	        {
            	        alt37=3;
            	        }
            	        break;
            	    case GreaterThanSignEqualsSign:
            	        {
            	        alt37=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt37) {
            	        case 1 :
            	            // InternalPortugolParser.g:2600:9: lv_op_2_1= LessThanSign
            	            {
            	            lv_op_2_1=(Token)match(input,LessThanSign,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_op_2_1, grammarAccess.getEquExpressionAccess().getOpLessThanSignKeyword_1_0_0_1_0_0());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getEquExpressionRule());
            	              									}
            	              									setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              								
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalPortugolParser.g:2611:9: lv_op_2_2= GreaterThanSign
            	            {
            	            lv_op_2_2=(Token)match(input,GreaterThanSign,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_op_2_2, grammarAccess.getEquExpressionAccess().getOpGreaterThanSignKeyword_1_0_0_1_0_1());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getEquExpressionRule());
            	              									}
            	              									setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              								
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalPortugolParser.g:2622:9: lv_op_2_3= LessThanSignEqualsSign
            	            {
            	            lv_op_2_3=(Token)match(input,LessThanSignEqualsSign,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_op_2_3, grammarAccess.getEquExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_0_0_1_0_2());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getEquExpressionRule());
            	              									}
            	              									setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              								
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalPortugolParser.g:2633:9: lv_op_2_4= GreaterThanSignEqualsSign
            	            {
            	            lv_op_2_4=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_op_2_4, grammarAccess.getEquExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_0_1_0_3());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getEquExpressionRule());
            	              									}
            	              									setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              								
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // InternalPortugolParser.g:2648:4: ( (lv_right_3_0= ruleAddExpression ) )
            	    // InternalPortugolParser.g:2649:5: (lv_right_3_0= ruleAddExpression )
            	    {
            	    // InternalPortugolParser.g:2649:5: (lv_right_3_0= ruleAddExpression )
            	    // InternalPortugolParser.g:2650:6: lv_right_3_0= ruleAddExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEquExpressionAccess().getRightAddExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_right_3_0=ruleAddExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEquExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.hopper.language.Portugol.AddExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquExpression"


    // $ANTLR start "entryRuleAddExpression"
    // InternalPortugolParser.g:2672:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalPortugolParser.g:2672:54: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalPortugolParser.g:2673:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // InternalPortugolParser.g:2679:1: ruleAddExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:2685:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalPortugolParser.g:2686:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalPortugolParser.g:2686:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalPortugolParser.g:2687:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAddExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_43);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugolParser.g:2695:3: ( ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==PlusSign) && (synpred7_InternalPortugolParser())) {
                    alt40=1;
                }
                else if ( (LA40_0==HyphenMinus) && (synpred7_InternalPortugolParser())) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPortugolParser.g:2696:4: ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalPortugolParser.g:2696:4: ( ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ) )
            	    // InternalPortugolParser.g:2697:5: ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )=> ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) )
            	    {
            	    // InternalPortugolParser.g:2711:5: ( () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) )
            	    // InternalPortugolParser.g:2712:6: () ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) )
            	    {
            	    // InternalPortugolParser.g:2712:6: ()
            	    // InternalPortugolParser.g:2713:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAddExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugolParser.g:2719:6: ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) )
            	    // InternalPortugolParser.g:2720:7: ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) )
            	    {
            	    // InternalPortugolParser.g:2720:7: ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) )
            	    // InternalPortugolParser.g:2721:8: (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus )
            	    {
            	    // InternalPortugolParser.g:2721:8: (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus )
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==PlusSign) ) {
            	        alt39=1;
            	    }
            	    else if ( (LA39_0==HyphenMinus) ) {
            	        alt39=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // InternalPortugolParser.g:2722:9: lv_op_2_1= PlusSign
            	            {
            	            lv_op_2_1=(Token)match(input,PlusSign,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_op_2_1, grammarAccess.getAddExpressionAccess().getOpPlusSignKeyword_1_0_0_1_0_0());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getAddExpressionRule());
            	              									}
            	              									setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              								
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalPortugolParser.g:2733:9: lv_op_2_2= HyphenMinus
            	            {
            	            lv_op_2_2=(Token)match(input,HyphenMinus,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_op_2_2, grammarAccess.getAddExpressionAccess().getOpHyphenMinusKeyword_1_0_0_1_0_1());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getAddExpressionRule());
            	              									}
            	              									setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              								
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // InternalPortugolParser.g:2748:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalPortugolParser.g:2749:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalPortugolParser.g:2749:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalPortugolParser.g:2750:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAddExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_43);
            	    lv_right_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAddExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.hopper.language.Portugol.MultiplicativeExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalPortugolParser.g:2772:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalPortugolParser.g:2772:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalPortugolParser.g:2773:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalPortugolParser.g:2779:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_PowerExpression_0= rulePowerExpression ( ( ( ( () ( ( ( Asterisk | Solidus | MOD | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= MOD | lv_op_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PowerExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:2785:2: ( (this_PowerExpression_0= rulePowerExpression ( ( ( ( () ( ( ( Asterisk | Solidus | MOD | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= MOD | lv_op_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )* ) )
            // InternalPortugolParser.g:2786:2: (this_PowerExpression_0= rulePowerExpression ( ( ( ( () ( ( ( Asterisk | Solidus | MOD | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= MOD | lv_op_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )* )
            {
            // InternalPortugolParser.g:2786:2: (this_PowerExpression_0= rulePowerExpression ( ( ( ( () ( ( ( Asterisk | Solidus | MOD | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= MOD | lv_op_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )* )
            // InternalPortugolParser.g:2787:3: this_PowerExpression_0= rulePowerExpression ( ( ( ( () ( ( ( Asterisk | Solidus | MOD | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= MOD | lv_op_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getPowerExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_44);
            this_PowerExpression_0=rulePowerExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PowerExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugolParser.g:2795:3: ( ( ( ( () ( ( ( Asterisk | Solidus | MOD | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= MOD | lv_op_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==Asterisk) && (synpred8_InternalPortugolParser())) {
                    alt42=1;
                }
                else if ( (LA42_0==Solidus) && (synpred8_InternalPortugolParser())) {
                    alt42=1;
                }
                else if ( (LA42_0==MOD) && (synpred8_InternalPortugolParser())) {
                    alt42=1;
                }
                else if ( (LA42_0==PercentSign) && (synpred8_InternalPortugolParser())) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalPortugolParser.g:2796:4: ( ( ( () ( ( ( Asterisk | Solidus | MOD | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= MOD | lv_op_2_4= PercentSign ) ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) )
            	    {
            	    // InternalPortugolParser.g:2796:4: ( ( ( () ( ( ( Asterisk | Solidus | MOD | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= MOD | lv_op_2_4= PercentSign ) ) ) ) )
            	    // InternalPortugolParser.g:2797:5: ( ( () ( ( ( Asterisk | Solidus | MOD | PercentSign ) ) ) ) )=> ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= MOD | lv_op_2_4= PercentSign ) ) ) )
            	    {
            	    // InternalPortugolParser.g:2815:5: ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= MOD | lv_op_2_4= PercentSign ) ) ) )
            	    // InternalPortugolParser.g:2816:6: () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= MOD | lv_op_2_4= PercentSign ) ) )
            	    {
            	    // InternalPortugolParser.g:2816:6: ()
            	    // InternalPortugolParser.g:2817:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugolParser.g:2823:6: ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= MOD | lv_op_2_4= PercentSign ) ) )
            	    // InternalPortugolParser.g:2824:7: ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= MOD | lv_op_2_4= PercentSign ) )
            	    {
            	    // InternalPortugolParser.g:2824:7: ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= MOD | lv_op_2_4= PercentSign ) )
            	    // InternalPortugolParser.g:2825:8: (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= MOD | lv_op_2_4= PercentSign )
            	    {
            	    // InternalPortugolParser.g:2825:8: (lv_op_2_1= Asterisk | lv_op_2_2= Solidus | lv_op_2_3= MOD | lv_op_2_4= PercentSign )
            	    int alt41=4;
            	    switch ( input.LA(1) ) {
            	    case Asterisk:
            	        {
            	        alt41=1;
            	        }
            	        break;
            	    case Solidus:
            	        {
            	        alt41=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt41=3;
            	        }
            	        break;
            	    case PercentSign:
            	        {
            	        alt41=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt41) {
            	        case 1 :
            	            // InternalPortugolParser.g:2826:9: lv_op_2_1= Asterisk
            	            {
            	            lv_op_2_1=(Token)match(input,Asterisk,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_op_2_1, grammarAccess.getMultiplicativeExpressionAccess().getOpAsteriskKeyword_1_0_0_1_0_0());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	              									}
            	              									setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              								
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalPortugolParser.g:2837:9: lv_op_2_2= Solidus
            	            {
            	            lv_op_2_2=(Token)match(input,Solidus,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_op_2_2, grammarAccess.getMultiplicativeExpressionAccess().getOpSolidusKeyword_1_0_0_1_0_1());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	              									}
            	              									setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              								
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalPortugolParser.g:2848:9: lv_op_2_3= MOD
            	            {
            	            lv_op_2_3=(Token)match(input,MOD,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_op_2_3, grammarAccess.getMultiplicativeExpressionAccess().getOpMODKeyword_1_0_0_1_0_2());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	              									}
            	              									setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              								
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalPortugolParser.g:2859:9: lv_op_2_4= PercentSign
            	            {
            	            lv_op_2_4=(Token)match(input,PercentSign,FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_op_2_4, grammarAccess.getMultiplicativeExpressionAccess().getOpPercentSignKeyword_1_0_0_1_0_3());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	              									}
            	              									setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              								
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // InternalPortugolParser.g:2874:4: ( (lv_right_3_0= rulePowerExpression ) )
            	    // InternalPortugolParser.g:2875:5: (lv_right_3_0= rulePowerExpression )
            	    {
            	    // InternalPortugolParser.g:2875:5: (lv_right_3_0= rulePowerExpression )
            	    // InternalPortugolParser.g:2876:6: lv_right_3_0= rulePowerExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightPowerExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
            	    lv_right_3_0=rulePowerExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.hopper.language.Portugol.PowerExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRulePowerExpression"
    // InternalPortugolParser.g:2898:1: entryRulePowerExpression returns [EObject current=null] : iv_rulePowerExpression= rulePowerExpression EOF ;
    public final EObject entryRulePowerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerExpression = null;


        try {
            // InternalPortugolParser.g:2898:56: (iv_rulePowerExpression= rulePowerExpression EOF )
            // InternalPortugolParser.g:2899:2: iv_rulePowerExpression= rulePowerExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPowerExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePowerExpression=rulePowerExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePowerExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePowerExpression"


    // $ANTLR start "rulePowerExpression"
    // InternalPortugolParser.g:2905:1: rulePowerExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject rulePowerExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:2911:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) )
            // InternalPortugolParser.g:2912:2: (this_UnaryExpression_0= ruleUnaryExpression ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            {
            // InternalPortugolParser.g:2912:2: (this_UnaryExpression_0= ruleUnaryExpression ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            // InternalPortugolParser.g:2913:3: this_UnaryExpression_0= ruleUnaryExpression ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPowerExpressionAccess().getUnaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_45);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugolParser.g:2921:3: ( ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==CircumflexAccent) && (synpred9_InternalPortugolParser())) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalPortugolParser.g:2922:4: ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) )
            	    {
            	    // InternalPortugolParser.g:2922:4: ( ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) ) )
            	    // InternalPortugolParser.g:2923:5: ( ( () ( ( CircumflexAccent ) ) ) )=> ( () ( (lv_op_2_0= CircumflexAccent ) ) )
            	    {
            	    // InternalPortugolParser.g:2933:5: ( () ( (lv_op_2_0= CircumflexAccent ) ) )
            	    // InternalPortugolParser.g:2934:6: () ( (lv_op_2_0= CircumflexAccent ) )
            	    {
            	    // InternalPortugolParser.g:2934:6: ()
            	    // InternalPortugolParser.g:2935:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getPowerExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugolParser.g:2941:6: ( (lv_op_2_0= CircumflexAccent ) )
            	    // InternalPortugolParser.g:2942:7: (lv_op_2_0= CircumflexAccent )
            	    {
            	    // InternalPortugolParser.g:2942:7: (lv_op_2_0= CircumflexAccent )
            	    // InternalPortugolParser.g:2943:8: lv_op_2_0= CircumflexAccent
            	    {
            	    lv_op_2_0=(Token)match(input,CircumflexAccent,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(lv_op_2_0, grammarAccess.getPowerExpressionAccess().getOpCircumflexAccentKeyword_1_0_0_1_0());
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getPowerExpressionRule());
            	      								}
            	      								setWithLastConsumed(current, "op", lv_op_2_0, "^");
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalPortugolParser.g:2957:4: ( (lv_right_3_0= ruleUnaryExpression ) )
            	    // InternalPortugolParser.g:2958:5: (lv_right_3_0= ruleUnaryExpression )
            	    {
            	    // InternalPortugolParser.g:2958:5: (lv_right_3_0= ruleUnaryExpression )
            	    // InternalPortugolParser.g:2959:6: lv_right_3_0= ruleUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPowerExpressionAccess().getRightUnaryExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_right_3_0=ruleUnaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPowerExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.hopper.language.Portugol.UnaryExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePowerExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalPortugolParser.g:2981:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalPortugolParser.g:2981:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalPortugolParser.g:2982:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalPortugolParser.g:2988:1: ruleUnaryExpression returns [EObject current=null] : ( ( () ( ( (lv_op_1_1= NOT | lv_op_1_2= HyphenMinus ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        EObject lv_operand_2_0 = null;

        EObject this_PrimaryExpression_3 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:2994:2: ( ( ( () ( ( (lv_op_1_1= NOT | lv_op_1_2= HyphenMinus ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) )
            // InternalPortugolParser.g:2995:2: ( ( () ( ( (lv_op_1_1= NOT | lv_op_1_2= HyphenMinus ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            {
            // InternalPortugolParser.g:2995:2: ( ( () ( ( (lv_op_1_1= NOT | lv_op_1_2= HyphenMinus ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==NOT||LA45_0==HyphenMinus) ) {
                alt45=1;
            }
            else if ( (LA45_0==Maiusc||(LA45_0>=Compr && LA45_0<=Copia)||LA45_0==Raizq||LA45_0==Pi||LA45_0==LeftParenthesis||(LA45_0>=RULE_INT && LA45_0<=RULE_STRING)) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalPortugolParser.g:2996:3: ( () ( ( (lv_op_1_1= NOT | lv_op_1_2= HyphenMinus ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) )
                    {
                    // InternalPortugolParser.g:2996:3: ( () ( ( (lv_op_1_1= NOT | lv_op_1_2= HyphenMinus ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) )
                    // InternalPortugolParser.g:2997:4: () ( ( (lv_op_1_1= NOT | lv_op_1_2= HyphenMinus ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) )
                    {
                    // InternalPortugolParser.g:2997:4: ()
                    // InternalPortugolParser.g:2998:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPortugolParser.g:3004:4: ( ( (lv_op_1_1= NOT | lv_op_1_2= HyphenMinus ) ) )
                    // InternalPortugolParser.g:3005:5: ( (lv_op_1_1= NOT | lv_op_1_2= HyphenMinus ) )
                    {
                    // InternalPortugolParser.g:3005:5: ( (lv_op_1_1= NOT | lv_op_1_2= HyphenMinus ) )
                    // InternalPortugolParser.g:3006:6: (lv_op_1_1= NOT | lv_op_1_2= HyphenMinus )
                    {
                    // InternalPortugolParser.g:3006:6: (lv_op_1_1= NOT | lv_op_1_2= HyphenMinus )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==NOT) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==HyphenMinus) ) {
                        alt44=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalPortugolParser.g:3007:7: lv_op_1_1= NOT
                            {
                            lv_op_1_1=(Token)match(input,NOT,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_1_1, grammarAccess.getUnaryExpressionAccess().getOpNOTKeyword_0_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getUnaryExpressionRule());
                              							}
                              							setWithLastConsumed(current, "op", lv_op_1_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalPortugolParser.g:3018:7: lv_op_1_2= HyphenMinus
                            {
                            lv_op_1_2=(Token)match(input,HyphenMinus,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_1_2, grammarAccess.getUnaryExpressionAccess().getOpHyphenMinusKeyword_0_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getUnaryExpressionRule());
                              							}
                              							setWithLastConsumed(current, "op", lv_op_1_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalPortugolParser.g:3031:4: ( (lv_operand_2_0= ruleUnaryExpression ) )
                    // InternalPortugolParser.g:3032:5: (lv_operand_2_0= ruleUnaryExpression )
                    {
                    // InternalPortugolParser.g:3032:5: (lv_operand_2_0= ruleUnaryExpression )
                    // InternalPortugolParser.g:3033:6: lv_operand_2_0= ruleUnaryExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperandUnaryExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_2_0=ruleUnaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"operand",
                      							lv_operand_2_0,
                      							"org.hopper.language.Portugol.UnaryExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:3052:3: this_PrimaryExpression_3= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpression_3=rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimaryExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalPortugolParser.g:3064:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalPortugolParser.g:3064:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalPortugolParser.g:3065:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalPortugolParser.g:3071:1: rulePrimaryExpression returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_PreDefinedFunctionCall_1= rulePreDefinedFunctionCall | this_FunctionCall_2= ruleFunctionCall | this_DeclaredVar_3= ruleDeclaredVar | (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Literal_0 = null;

        EObject this_PreDefinedFunctionCall_1 = null;

        EObject this_FunctionCall_2 = null;

        EObject this_DeclaredVar_3 = null;

        EObject this_Expression_5 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:3077:2: ( (this_Literal_0= ruleLiteral | this_PreDefinedFunctionCall_1= rulePreDefinedFunctionCall | this_FunctionCall_2= ruleFunctionCall | this_DeclaredVar_3= ruleDeclaredVar | (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis ) ) )
            // InternalPortugolParser.g:3078:2: (this_Literal_0= ruleLiteral | this_PreDefinedFunctionCall_1= rulePreDefinedFunctionCall | this_FunctionCall_2= ruleFunctionCall | this_DeclaredVar_3= ruleDeclaredVar | (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis ) )
            {
            // InternalPortugolParser.g:3078:2: (this_Literal_0= ruleLiteral | this_PreDefinedFunctionCall_1= rulePreDefinedFunctionCall | this_FunctionCall_2= ruleFunctionCall | this_DeclaredVar_3= ruleDeclaredVar | (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis ) )
            int alt46=5;
            switch ( input.LA(1) ) {
            case Pi:
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_STRING:
                {
                alt46=1;
                }
                break;
            case Maiusc:
            case Compr:
            case Copia:
            case Raizq:
                {
                alt46=2;
                }
                break;
            case RULE_ID:
                {
                int LA46_3 = input.LA(2);

                if ( (LA46_3==LeftParenthesis) ) {
                    alt46=3;
                }
                else if ( (LA46_3==EOF||LA46_3==Entao||LA46_3==Passo||LA46_3==Faca||LA46_3==MOD||(LA46_3>=XOU && LA46_3<=Ate)||(LA46_3>=LessThanSignHyphenMinus && LA46_3<=De)||(LA46_3>=PercentSign && LA46_3<=Ampersand)||(LA46_3>=RightParenthesis && LA46_3<=CircumflexAccent)) ) {
                    alt46=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 3, input);

                    throw nvae;
                }
                }
                break;
            case LeftParenthesis:
                {
                alt46=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalPortugolParser.g:3079:3: this_Literal_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Literal_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:3088:3: this_PreDefinedFunctionCall_1= rulePreDefinedFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPreDefinedFunctionCallParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PreDefinedFunctionCall_1=rulePreDefinedFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PreDefinedFunctionCall_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPortugolParser.g:3097:3: this_FunctionCall_2= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_2=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunctionCall_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPortugolParser.g:3106:3: this_DeclaredVar_3= ruleDeclaredVar
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getDeclaredVarParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DeclaredVar_3=ruleDeclaredVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DeclaredVar_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalPortugolParser.g:3115:3: (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis )
                    {
                    // InternalPortugolParser.g:3115:3: (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis )
                    // InternalPortugolParser.g:3116:4: otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis
                    {
                    otherlv_4=(Token)match(input,LeftParenthesis,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_13);
                    this_Expression_5=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRulePreDefinedFunctionCall"
    // InternalPortugolParser.g:3137:1: entryRulePreDefinedFunctionCall returns [EObject current=null] : iv_rulePreDefinedFunctionCall= rulePreDefinedFunctionCall EOF ;
    public final EObject entryRulePreDefinedFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreDefinedFunctionCall = null;


        try {
            // InternalPortugolParser.g:3137:63: (iv_rulePreDefinedFunctionCall= rulePreDefinedFunctionCall EOF )
            // InternalPortugolParser.g:3138:2: iv_rulePreDefinedFunctionCall= rulePreDefinedFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreDefinedFunctionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePreDefinedFunctionCall=rulePreDefinedFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreDefinedFunctionCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreDefinedFunctionCall"


    // $ANTLR start "rulePreDefinedFunctionCall"
    // InternalPortugolParser.g:3144:1: rulePreDefinedFunctionCall returns [EObject current=null] : ( ( (lv_preDefFunctionName_0_0= rulePredefineFunctions ) ) otherlv_1= LeftParenthesis ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= RightParenthesis ) ;
    public final EObject rulePreDefinedFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_preDefFunctionName_0_0 = null;

        EObject lv_param_2_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:3150:2: ( ( ( (lv_preDefFunctionName_0_0= rulePredefineFunctions ) ) otherlv_1= LeftParenthesis ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= RightParenthesis ) )
            // InternalPortugolParser.g:3151:2: ( ( (lv_preDefFunctionName_0_0= rulePredefineFunctions ) ) otherlv_1= LeftParenthesis ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= RightParenthesis )
            {
            // InternalPortugolParser.g:3151:2: ( ( (lv_preDefFunctionName_0_0= rulePredefineFunctions ) ) otherlv_1= LeftParenthesis ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= RightParenthesis )
            // InternalPortugolParser.g:3152:3: ( (lv_preDefFunctionName_0_0= rulePredefineFunctions ) ) otherlv_1= LeftParenthesis ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= RightParenthesis
            {
            // InternalPortugolParser.g:3152:3: ( (lv_preDefFunctionName_0_0= rulePredefineFunctions ) )
            // InternalPortugolParser.g:3153:4: (lv_preDefFunctionName_0_0= rulePredefineFunctions )
            {
            // InternalPortugolParser.g:3153:4: (lv_preDefFunctionName_0_0= rulePredefineFunctions )
            // InternalPortugolParser.g:3154:5: lv_preDefFunctionName_0_0= rulePredefineFunctions
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPreDefinedFunctionCallAccess().getPreDefFunctionNamePredefineFunctionsParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_preDefFunctionName_0_0=rulePredefineFunctions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPreDefinedFunctionCallRule());
              					}
              					set(
              						current,
              						"preDefFunctionName",
              						lv_preDefFunctionName_0_0,
              						"org.hopper.language.Portugol.PredefineFunctions");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPreDefinedFunctionCallAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalPortugolParser.g:3175:3: ( (lv_param_2_0= ruleSubprogramParam ) )
            // InternalPortugolParser.g:3176:4: (lv_param_2_0= ruleSubprogramParam )
            {
            // InternalPortugolParser.g:3176:4: (lv_param_2_0= ruleSubprogramParam )
            // InternalPortugolParser.g:3177:5: lv_param_2_0= ruleSubprogramParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPreDefinedFunctionCallAccess().getParamSubprogramParamParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_param_2_0=ruleSubprogramParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPreDefinedFunctionCallRule());
              					}
              					set(
              						current,
              						"param",
              						lv_param_2_0,
              						"org.hopper.language.Portugol.SubprogramParam");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPreDefinedFunctionCallAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreDefinedFunctionCall"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalPortugolParser.g:3202:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalPortugolParser.g:3202:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalPortugolParser.g:3203:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalPortugolParser.g:3209:1: ruleFunctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_param_2_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:3215:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= RightParenthesis ) )
            // InternalPortugolParser.g:3216:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= RightParenthesis )
            {
            // InternalPortugolParser.g:3216:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= RightParenthesis )
            // InternalPortugolParser.g:3217:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= RightParenthesis
            {
            // InternalPortugolParser.g:3217:3: ( (otherlv_0= RULE_ID ) )
            // InternalPortugolParser.g:3218:4: (otherlv_0= RULE_ID )
            {
            // InternalPortugolParser.g:3218:4: (otherlv_0= RULE_ID )
            // InternalPortugolParser.g:3219:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionCallRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getFbNameFunctionNameCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalPortugolParser.g:3234:3: ( (lv_param_2_0= ruleSubprogramParam ) )
            // InternalPortugolParser.g:3235:4: (lv_param_2_0= ruleSubprogramParam )
            {
            // InternalPortugolParser.g:3235:4: (lv_param_2_0= ruleSubprogramParam )
            // InternalPortugolParser.g:3236:5: lv_param_2_0= ruleSubprogramParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionCallAccess().getParamSubprogramParamParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_param_2_0=ruleSubprogramParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionCallRule());
              					}
              					set(
              						current,
              						"param",
              						lv_param_2_0,
              						"org.hopper.language.Portugol.SubprogramParam");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRulePredefineFunctions"
    // InternalPortugolParser.g:3261:1: entryRulePredefineFunctions returns [String current=null] : iv_rulePredefineFunctions= rulePredefineFunctions EOF ;
    public final String entryRulePredefineFunctions() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePredefineFunctions = null;


        try {
            // InternalPortugolParser.g:3261:58: (iv_rulePredefineFunctions= rulePredefineFunctions EOF )
            // InternalPortugolParser.g:3262:2: iv_rulePredefineFunctions= rulePredefineFunctions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredefineFunctionsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePredefineFunctions=rulePredefineFunctions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredefineFunctions.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredefineFunctions"


    // $ANTLR start "rulePredefineFunctions"
    // InternalPortugolParser.g:3268:1: rulePredefineFunctions returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Maiusc | kw= Compr | kw= Raizq | kw= Copia ) ;
    public final AntlrDatatypeRuleToken rulePredefineFunctions() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:3274:2: ( (kw= Maiusc | kw= Compr | kw= Raizq | kw= Copia ) )
            // InternalPortugolParser.g:3275:2: (kw= Maiusc | kw= Compr | kw= Raizq | kw= Copia )
            {
            // InternalPortugolParser.g:3275:2: (kw= Maiusc | kw= Compr | kw= Raizq | kw= Copia )
            int alt47=4;
            switch ( input.LA(1) ) {
            case Maiusc:
                {
                alt47=1;
                }
                break;
            case Compr:
                {
                alt47=2;
                }
                break;
            case Raizq:
                {
                alt47=3;
                }
                break;
            case Copia:
                {
                alt47=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalPortugolParser.g:3276:3: kw= Maiusc
                    {
                    kw=(Token)match(input,Maiusc,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPredefineFunctionsAccess().getMaiuscKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:3282:3: kw= Compr
                    {
                    kw=(Token)match(input,Compr,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPredefineFunctionsAccess().getComprKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPortugolParser.g:3288:3: kw= Raizq
                    {
                    kw=(Token)match(input,Raizq,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPredefineFunctionsAccess().getRaizqKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPortugolParser.g:3294:3: kw= Copia
                    {
                    kw=(Token)match(input,Copia,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPredefineFunctionsAccess().getCopiaKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredefineFunctions"


    // $ANTLR start "entryRuleLiteral"
    // InternalPortugolParser.g:3303:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalPortugolParser.g:3303:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalPortugolParser.g:3304:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalPortugolParser.g:3310:1: ruleLiteral returns [EObject current=null] : ( ( () rulePiLiteral ) | this_NumericLiteral_2= ruleNumericLiteral | this_StringExpression_3= ruleStringExpression ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NumericLiteral_2 = null;

        EObject this_StringExpression_3 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:3316:2: ( ( ( () rulePiLiteral ) | this_NumericLiteral_2= ruleNumericLiteral | this_StringExpression_3= ruleStringExpression ) )
            // InternalPortugolParser.g:3317:2: ( ( () rulePiLiteral ) | this_NumericLiteral_2= ruleNumericLiteral | this_StringExpression_3= ruleStringExpression )
            {
            // InternalPortugolParser.g:3317:2: ( ( () rulePiLiteral ) | this_NumericLiteral_2= ruleNumericLiteral | this_StringExpression_3= ruleStringExpression )
            int alt48=3;
            switch ( input.LA(1) ) {
            case Pi:
                {
                alt48=1;
                }
                break;
            case RULE_INT:
            case RULE_FLOAT:
                {
                alt48=2;
                }
                break;
            case RULE_STRING:
                {
                alt48=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalPortugolParser.g:3318:3: ( () rulePiLiteral )
                    {
                    // InternalPortugolParser.g:3318:3: ( () rulePiLiteral )
                    // InternalPortugolParser.g:3319:4: () rulePiLiteral
                    {
                    // InternalPortugolParser.g:3319:4: ()
                    // InternalPortugolParser.g:3320:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLiteralAccess().getLiteralAction_0_0(),
                      						current);
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getLiteralAccess().getPiLiteralParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    rulePiLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:3335:3: this_NumericLiteral_2= ruleNumericLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getNumericLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumericLiteral_2=ruleNumericLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumericLiteral_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPortugolParser.g:3344:3: this_StringExpression_3= ruleStringExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getStringExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringExpression_3=ruleStringExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleDeclaredVar"
    // InternalPortugolParser.g:3356:1: entryRuleDeclaredVar returns [EObject current=null] : iv_ruleDeclaredVar= ruleDeclaredVar EOF ;
    public final EObject entryRuleDeclaredVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredVar = null;


        try {
            // InternalPortugolParser.g:3356:52: (iv_ruleDeclaredVar= ruleDeclaredVar EOF )
            // InternalPortugolParser.g:3357:2: iv_ruleDeclaredVar= ruleDeclaredVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaredVarRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclaredVar=ruleDeclaredVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaredVar; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaredVar"


    // $ANTLR start "ruleDeclaredVar"
    // InternalPortugolParser.g:3363:1: ruleDeclaredVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDeclaredVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:3369:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalPortugolParser.g:3370:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalPortugolParser.g:3370:2: ( (otherlv_0= RULE_ID ) )
            // InternalPortugolParser.g:3371:3: (otherlv_0= RULE_ID )
            {
            // InternalPortugolParser.g:3371:3: (otherlv_0= RULE_ID )
            // InternalPortugolParser.g:3372:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDeclaredVarRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getDeclaredVarAccess().getVarNameVarNameCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaredVar"


    // $ANTLR start "entryRuleNumericLiteral"
    // InternalPortugolParser.g:3386:1: entryRuleNumericLiteral returns [EObject current=null] : iv_ruleNumericLiteral= ruleNumericLiteral EOF ;
    public final EObject entryRuleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteral = null;


        try {
            // InternalPortugolParser.g:3386:55: (iv_ruleNumericLiteral= ruleNumericLiteral EOF )
            // InternalPortugolParser.g:3387:2: iv_ruleNumericLiteral= ruleNumericLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumericLiteral=ruleNumericLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericLiteral"


    // $ANTLR start "ruleNumericLiteral"
    // InternalPortugolParser.g:3393:1: ruleNumericLiteral returns [EObject current=null] : ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleNumericLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_intValue_0_0=null;
        Token lv_floatValue_1_0=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:3399:2: ( ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= RULE_FLOAT ) ) ) )
            // InternalPortugolParser.g:3400:2: ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= RULE_FLOAT ) ) )
            {
            // InternalPortugolParser.g:3400:2: ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= RULE_FLOAT ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_INT) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_FLOAT) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalPortugolParser.g:3401:3: ( (lv_intValue_0_0= RULE_INT ) )
                    {
                    // InternalPortugolParser.g:3401:3: ( (lv_intValue_0_0= RULE_INT ) )
                    // InternalPortugolParser.g:3402:4: (lv_intValue_0_0= RULE_INT )
                    {
                    // InternalPortugolParser.g:3402:4: (lv_intValue_0_0= RULE_INT )
                    // InternalPortugolParser.g:3403:5: lv_intValue_0_0= RULE_INT
                    {
                    lv_intValue_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_intValue_0_0, grammarAccess.getNumericLiteralAccess().getIntValueINTTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getNumericLiteralRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"intValue",
                      						true,
                      						"org.eclipse.xtext.common.Terminals.INT");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:3420:3: ( (lv_floatValue_1_0= RULE_FLOAT ) )
                    {
                    // InternalPortugolParser.g:3420:3: ( (lv_floatValue_1_0= RULE_FLOAT ) )
                    // InternalPortugolParser.g:3421:4: (lv_floatValue_1_0= RULE_FLOAT )
                    {
                    // InternalPortugolParser.g:3421:4: (lv_floatValue_1_0= RULE_FLOAT )
                    // InternalPortugolParser.g:3422:5: lv_floatValue_1_0= RULE_FLOAT
                    {
                    lv_floatValue_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_floatValue_1_0, grammarAccess.getNumericLiteralAccess().getFloatValueFLOATTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getNumericLiteralRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"floatValue",
                      						true,
                      						"org.hopper.language.Portugol.FLOAT");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericLiteral"


    // $ANTLR start "entryRuleStringExpression"
    // InternalPortugolParser.g:3442:1: entryRuleStringExpression returns [EObject current=null] : iv_ruleStringExpression= ruleStringExpression EOF ;
    public final EObject entryRuleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpression = null;


        try {
            // InternalPortugolParser.g:3442:57: (iv_ruleStringExpression= ruleStringExpression EOF )
            // InternalPortugolParser.g:3443:2: iv_ruleStringExpression= ruleStringExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringExpression=ruleStringExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringExpression"


    // $ANTLR start "ruleStringExpression"
    // InternalPortugolParser.g:3449:1: ruleStringExpression returns [EObject current=null] : ( (lv_literalString_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringExpression() throws RecognitionException {
        EObject current = null;

        Token lv_literalString_0_0=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:3455:2: ( ( (lv_literalString_0_0= RULE_STRING ) ) )
            // InternalPortugolParser.g:3456:2: ( (lv_literalString_0_0= RULE_STRING ) )
            {
            // InternalPortugolParser.g:3456:2: ( (lv_literalString_0_0= RULE_STRING ) )
            // InternalPortugolParser.g:3457:3: (lv_literalString_0_0= RULE_STRING )
            {
            // InternalPortugolParser.g:3457:3: (lv_literalString_0_0= RULE_STRING )
            // InternalPortugolParser.g:3458:4: lv_literalString_0_0= RULE_STRING
            {
            lv_literalString_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_literalString_0_0, grammarAccess.getStringExpressionAccess().getLiteralStringSTRINGTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getStringExpressionRule());
              				}
              				setWithLastConsumed(
              					current,
              					"literalString",
              					lv_literalString_0_0,
              					"org.eclipse.xtext.common.Terminals.STRING");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringExpression"


    // $ANTLR start "entryRulePiLiteral"
    // InternalPortugolParser.g:3477:1: entryRulePiLiteral returns [String current=null] : iv_rulePiLiteral= rulePiLiteral EOF ;
    public final String entryRulePiLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePiLiteral = null;


        try {
            // InternalPortugolParser.g:3477:49: (iv_rulePiLiteral= rulePiLiteral EOF )
            // InternalPortugolParser.g:3478:2: iv_rulePiLiteral= rulePiLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPiLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePiLiteral=rulePiLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePiLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePiLiteral"


    // $ANTLR start "rulePiLiteral"
    // InternalPortugolParser.g:3484:1: rulePiLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Pi ;
    public final AntlrDatatypeRuleToken rulePiLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:3490:2: (kw= Pi )
            // InternalPortugolParser.g:3491:2: kw= Pi
            {
            kw=(Token)match(input,Pi,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getPiLiteralAccess().getPiKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePiLiteral"


    // $ANTLR start "entryRuleEND_COMMAND"
    // InternalPortugolParser.g:3499:1: entryRuleEND_COMMAND returns [String current=null] : iv_ruleEND_COMMAND= ruleEND_COMMAND EOF ;
    public final String entryRuleEND_COMMAND() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEND_COMMAND = null;


        try {
            // InternalPortugolParser.g:3499:51: (iv_ruleEND_COMMAND= ruleEND_COMMAND EOF )
            // InternalPortugolParser.g:3500:2: iv_ruleEND_COMMAND= ruleEND_COMMAND EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEND_COMMANDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEND_COMMAND=ruleEND_COMMAND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEND_COMMAND.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEND_COMMAND"


    // $ANTLR start "ruleEND_COMMAND"
    // InternalPortugolParser.g:3506:1: ruleEND_COMMAND returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Semicolon ;
    public final AntlrDatatypeRuleToken ruleEND_COMMAND() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:3512:2: (kw= Semicolon )
            // InternalPortugolParser.g:3513:2: kw= Semicolon
            {
            kw=(Token)match(input,Semicolon,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getEND_COMMANDAccess().getSemicolonKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEND_COMMAND"

    // $ANTLR start synpred1_InternalPortugolParser
    public final void synpred1_InternalPortugolParser_fragment() throws RecognitionException {   
        // InternalPortugolParser.g:2122:5: ( ( () ( ( LessThanSignHyphenMinus ) ) ) )
        // InternalPortugolParser.g:2122:6: ( () ( ( LessThanSignHyphenMinus ) ) )
        {
        // InternalPortugolParser.g:2122:6: ( () ( ( LessThanSignHyphenMinus ) ) )
        // InternalPortugolParser.g:2123:6: () ( ( LessThanSignHyphenMinus ) )
        {
        // InternalPortugolParser.g:2123:6: ()
        // InternalPortugolParser.g:2124:6: 
        {
        }

        // InternalPortugolParser.g:2125:6: ( ( LessThanSignHyphenMinus ) )
        // InternalPortugolParser.g:2126:7: ( LessThanSignHyphenMinus )
        {
        // InternalPortugolParser.g:2126:7: ( LessThanSignHyphenMinus )
        // InternalPortugolParser.g:2127:8: LessThanSignHyphenMinus
        {
        match(input,LessThanSignHyphenMinus,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalPortugolParser

    // $ANTLR start synpred2_InternalPortugolParser
    public final void synpred2_InternalPortugolParser_fragment() throws RecognitionException {   
        // InternalPortugolParser.g:2205:5: ( ( () ( ( OU ) ) ) )
        // InternalPortugolParser.g:2205:6: ( () ( ( OU ) ) )
        {
        // InternalPortugolParser.g:2205:6: ( () ( ( OU ) ) )
        // InternalPortugolParser.g:2206:6: () ( ( OU ) )
        {
        // InternalPortugolParser.g:2206:6: ()
        // InternalPortugolParser.g:2207:6: 
        {
        }

        // InternalPortugolParser.g:2208:6: ( ( OU ) )
        // InternalPortugolParser.g:2209:7: ( OU )
        {
        // InternalPortugolParser.g:2209:7: ( OU )
        // InternalPortugolParser.g:2210:8: OU
        {
        match(input,OU,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalPortugolParser

    // $ANTLR start synpred3_InternalPortugolParser
    public final void synpred3_InternalPortugolParser_fragment() throws RecognitionException {   
        // InternalPortugolParser.g:2288:5: ( ( () ( ( XOU ) ) ) )
        // InternalPortugolParser.g:2288:6: ( () ( ( XOU ) ) )
        {
        // InternalPortugolParser.g:2288:6: ( () ( ( XOU ) ) )
        // InternalPortugolParser.g:2289:6: () ( ( XOU ) )
        {
        // InternalPortugolParser.g:2289:6: ()
        // InternalPortugolParser.g:2290:6: 
        {
        }

        // InternalPortugolParser.g:2291:6: ( ( XOU ) )
        // InternalPortugolParser.g:2292:7: ( XOU )
        {
        // InternalPortugolParser.g:2292:7: ( XOU )
        // InternalPortugolParser.g:2293:8: XOU
        {
        match(input,XOU,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalPortugolParser

    // $ANTLR start synpred4_InternalPortugolParser
    public final void synpred4_InternalPortugolParser_fragment() throws RecognitionException {   
        // InternalPortugolParser.g:2371:5: ( ( () ( ( ( Ampersand | E ) ) ) ) )
        // InternalPortugolParser.g:2371:6: ( () ( ( ( Ampersand | E ) ) ) )
        {
        // InternalPortugolParser.g:2371:6: ( () ( ( ( Ampersand | E ) ) ) )
        // InternalPortugolParser.g:2372:6: () ( ( ( Ampersand | E ) ) )
        {
        // InternalPortugolParser.g:2372:6: ()
        // InternalPortugolParser.g:2373:6: 
        {
        }

        // InternalPortugolParser.g:2374:6: ( ( ( Ampersand | E ) ) )
        // InternalPortugolParser.g:2375:7: ( ( Ampersand | E ) )
        {
        // InternalPortugolParser.g:2375:7: ( ( Ampersand | E ) )
        // InternalPortugolParser.g:2376:8: ( Ampersand | E )
        {
        if ( input.LA(1)==Ampersand||input.LA(1)==E ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalPortugolParser

    // $ANTLR start synpred5_InternalPortugolParser
    public final void synpred5_InternalPortugolParser_fragment() throws RecognitionException {   
        // InternalPortugolParser.g:2471:5: ( ( () ( ( ( EqualsSign | LessThanSignGreaterThanSign ) ) ) ) )
        // InternalPortugolParser.g:2471:6: ( () ( ( ( EqualsSign | LessThanSignGreaterThanSign ) ) ) )
        {
        // InternalPortugolParser.g:2471:6: ( () ( ( ( EqualsSign | LessThanSignGreaterThanSign ) ) ) )
        // InternalPortugolParser.g:2472:6: () ( ( ( EqualsSign | LessThanSignGreaterThanSign ) ) )
        {
        // InternalPortugolParser.g:2472:6: ()
        // InternalPortugolParser.g:2473:6: 
        {
        }

        // InternalPortugolParser.g:2474:6: ( ( ( EqualsSign | LessThanSignGreaterThanSign ) ) )
        // InternalPortugolParser.g:2475:7: ( ( EqualsSign | LessThanSignGreaterThanSign ) )
        {
        // InternalPortugolParser.g:2475:7: ( ( EqualsSign | LessThanSignGreaterThanSign ) )
        // InternalPortugolParser.g:2476:8: ( EqualsSign | LessThanSignGreaterThanSign )
        {
        if ( input.LA(1)==LessThanSignGreaterThanSign||input.LA(1)==EqualsSign ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalPortugolParser

    // $ANTLR start synpred6_InternalPortugolParser
    public final void synpred6_InternalPortugolParser_fragment() throws RecognitionException {   
        // InternalPortugolParser.g:2571:5: ( ( () ( ( ( LessThanSign | GreaterThanSign | LessThanSignEqualsSign | GreaterThanSignEqualsSign ) ) ) ) )
        // InternalPortugolParser.g:2571:6: ( () ( ( ( LessThanSign | GreaterThanSign | LessThanSignEqualsSign | GreaterThanSignEqualsSign ) ) ) )
        {
        // InternalPortugolParser.g:2571:6: ( () ( ( ( LessThanSign | GreaterThanSign | LessThanSignEqualsSign | GreaterThanSignEqualsSign ) ) ) )
        // InternalPortugolParser.g:2572:6: () ( ( ( LessThanSign | GreaterThanSign | LessThanSignEqualsSign | GreaterThanSignEqualsSign ) ) )
        {
        // InternalPortugolParser.g:2572:6: ()
        // InternalPortugolParser.g:2573:6: 
        {
        }

        // InternalPortugolParser.g:2574:6: ( ( ( LessThanSign | GreaterThanSign | LessThanSignEqualsSign | GreaterThanSignEqualsSign ) ) )
        // InternalPortugolParser.g:2575:7: ( ( LessThanSign | GreaterThanSign | LessThanSignEqualsSign | GreaterThanSignEqualsSign ) )
        {
        // InternalPortugolParser.g:2575:7: ( ( LessThanSign | GreaterThanSign | LessThanSignEqualsSign | GreaterThanSignEqualsSign ) )
        // InternalPortugolParser.g:2576:8: ( LessThanSign | GreaterThanSign | LessThanSignEqualsSign | GreaterThanSignEqualsSign )
        {
        if ( input.LA(1)==LessThanSignEqualsSign||input.LA(1)==GreaterThanSignEqualsSign||input.LA(1)==LessThanSign||input.LA(1)==GreaterThanSign ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalPortugolParser

    // $ANTLR start synpred7_InternalPortugolParser
    public final void synpred7_InternalPortugolParser_fragment() throws RecognitionException {   
        // InternalPortugolParser.g:2697:5: ( ( () ( ( ( PlusSign | HyphenMinus ) ) ) ) )
        // InternalPortugolParser.g:2697:6: ( () ( ( ( PlusSign | HyphenMinus ) ) ) )
        {
        // InternalPortugolParser.g:2697:6: ( () ( ( ( PlusSign | HyphenMinus ) ) ) )
        // InternalPortugolParser.g:2698:6: () ( ( ( PlusSign | HyphenMinus ) ) )
        {
        // InternalPortugolParser.g:2698:6: ()
        // InternalPortugolParser.g:2699:6: 
        {
        }

        // InternalPortugolParser.g:2700:6: ( ( ( PlusSign | HyphenMinus ) ) )
        // InternalPortugolParser.g:2701:7: ( ( PlusSign | HyphenMinus ) )
        {
        // InternalPortugolParser.g:2701:7: ( ( PlusSign | HyphenMinus ) )
        // InternalPortugolParser.g:2702:8: ( PlusSign | HyphenMinus )
        {
        if ( input.LA(1)==PlusSign||input.LA(1)==HyphenMinus ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalPortugolParser

    // $ANTLR start synpred8_InternalPortugolParser
    public final void synpred8_InternalPortugolParser_fragment() throws RecognitionException {   
        // InternalPortugolParser.g:2797:5: ( ( () ( ( ( Asterisk | Solidus | MOD | PercentSign ) ) ) ) )
        // InternalPortugolParser.g:2797:6: ( () ( ( ( Asterisk | Solidus | MOD | PercentSign ) ) ) )
        {
        // InternalPortugolParser.g:2797:6: ( () ( ( ( Asterisk | Solidus | MOD | PercentSign ) ) ) )
        // InternalPortugolParser.g:2798:6: () ( ( ( Asterisk | Solidus | MOD | PercentSign ) ) )
        {
        // InternalPortugolParser.g:2798:6: ()
        // InternalPortugolParser.g:2799:6: 
        {
        }

        // InternalPortugolParser.g:2800:6: ( ( ( Asterisk | Solidus | MOD | PercentSign ) ) )
        // InternalPortugolParser.g:2801:7: ( ( Asterisk | Solidus | MOD | PercentSign ) )
        {
        // InternalPortugolParser.g:2801:7: ( ( Asterisk | Solidus | MOD | PercentSign ) )
        // InternalPortugolParser.g:2802:8: ( Asterisk | Solidus | MOD | PercentSign )
        {
        if ( input.LA(1)==MOD||input.LA(1)==PercentSign||input.LA(1)==Asterisk||input.LA(1)==Solidus ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalPortugolParser

    // $ANTLR start synpred9_InternalPortugolParser
    public final void synpred9_InternalPortugolParser_fragment() throws RecognitionException {   
        // InternalPortugolParser.g:2923:5: ( ( () ( ( CircumflexAccent ) ) ) )
        // InternalPortugolParser.g:2923:6: ( () ( ( CircumflexAccent ) ) )
        {
        // InternalPortugolParser.g:2923:6: ( () ( ( CircumflexAccent ) ) )
        // InternalPortugolParser.g:2924:6: () ( ( CircumflexAccent ) )
        {
        // InternalPortugolParser.g:2924:6: ()
        // InternalPortugolParser.g:2925:6: 
        {
        }

        // InternalPortugolParser.g:2926:6: ( ( CircumflexAccent ) )
        // InternalPortugolParser.g:2927:7: ( CircumflexAccent )
        {
        // InternalPortugolParser.g:2927:7: ( CircumflexAccent )
        // InternalPortugolParser.g:2928:8: CircumflexAccent
        {
        match(input,CircumflexAccent,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalPortugolParser

    // Delegated rules

    public final boolean synpred4_InternalPortugolParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalPortugolParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalPortugolParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalPortugolParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalPortugolParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalPortugolParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalPortugolParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalPortugolParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalPortugolParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalPortugolParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalPortugolParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalPortugolParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalPortugolParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalPortugolParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalPortugolParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalPortugolParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalPortugolParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalPortugolParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000040000C00040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002000104800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000040000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x042600988F278200L,0x0000000000000078L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x042600988F279200L,0x0000000000000078L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x042600988F278210L,0x0000000000000078L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x042600988F278220L,0x0000000000000078L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x042200808D000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x04260099AF278200L,0x0000000000000078L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x04260098AF278200L,0x0000000000000078L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200002100L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x042600988F278202L,0x0000000000000078L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x042600988F2F8200L,0x0000000000000078L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x042600988F278280L,0x0000000000000078L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x042602988F278200L,0x0000000000000078L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x8000200000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x4000500000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0500000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0888004000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});

}