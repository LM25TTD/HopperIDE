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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Fimprocedimento", "Fimalgoritmo", "Procedimento", "Fimenquanto", "Fimescolha", "Interrompa", "Verdadeiro", "Algoritmo", "Caractere", "Fimfuncao", "Outrocaso", "Caracter", "Enquanto", "Escreval", "Escolha", "Escreva", "Fimpara", "Inteiro", "Retorne", "Funcao", "Inicio", "Logico", "Maiusc", "Repita", "Compr", "Copia", "Entao", "Falso", "Fimse", "Passo", "Raizq", "Senao", "Caso", "Faca", "Leia", "Para", "Real", "MOD", "NAO", "XOU", "Ate", "Var", "LessThanSignHyphenMinus", "LessThanSignEqualsSign", "LessThanSignGreaterThanSign", "GreaterThanSignEqualsSign", "OU", "De", "Pi", "Se", "PercentSign", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "Solidus", "Colon", "Semicolon", "LessThanSign", "EqualsSign", "GreaterThanSign", "E", "CircumflexAccent", "RULE_INT", "RULE_FLOAT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Escreva=19;
    public static final int Raizq=34;
    public static final int LessThanSignGreaterThanSign=48;
    public static final int Enquanto=16;
    public static final int Funcao=23;
    public static final int Falso=31;
    public static final int Var=45;
    public static final int Outrocaso=14;
    public static final int Logico=25;
    public static final int Algoritmo=11;
    public static final int LessThanSign=64;
    public static final int Procedimento=6;
    public static final int PercentSign=54;
    public static final int Verdadeiro=10;
    public static final int LeftParenthesis=55;
    public static final int Fimfuncao=13;
    public static final int Copia=29;
    public static final int Real=40;
    public static final int Escolha=18;
    public static final int Pi=52;
    public static final int Fimpara=20;
    public static final int Fimescolha=8;
    public static final int De=51;
    public static final int GreaterThanSign=66;
    public static final int RULE_ID=71;
    public static final int Para=39;
    public static final int RightParenthesis=56;
    public static final int Senao=35;
    public static final int GreaterThanSignEqualsSign=49;
    public static final int Caracter=15;
    public static final int PlusSign=58;
    public static final int RULE_INT=69;
    public static final int Fimse=32;
    public static final int LessThanSignHyphenMinus=46;
    public static final int RULE_ML_COMMENT=73;
    public static final int Entao=30;
    public static final int Interrompa=9;
    public static final int XOU=43;
    public static final int Caso=36;
    public static final int E=67;
    public static final int Compr=28;
    public static final int Repita=27;
    public static final int Caractere=12;
    public static final int RULE_STRING=72;
    public static final int Passo=33;
    public static final int RULE_SL_COMMENT=74;
    public static final int Comma=59;
    public static final int EqualsSign=65;
    public static final int HyphenMinus=60;
    public static final int Inicio=24;
    public static final int Leia=38;
    public static final int Faca=37;
    public static final int Escreval=17;
    public static final int LessThanSignEqualsSign=47;
    public static final int Solidus=61;
    public static final int Colon=62;
    public static final int EOF=-1;
    public static final int Maiusc=26;
    public static final int Asterisk=57;
    public static final int Fimenquanto=7;
    public static final int Inteiro=21;
    public static final int MOD=41;
    public static final int RULE_WS=75;
    public static final int Fimprocedimento=4;
    public static final int OU=50;
    public static final int RULE_ANY_OTHER=76;
    public static final int CircumflexAccent=68;
    public static final int Semicolon=63;
    public static final int Se=53;
    public static final int Ate=44;
    public static final int Fimalgoritmo=5;
    public static final int Retorne=22;
    public static final int RULE_FLOAT=70;
    public static final int NAO=42;

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
    // InternalPortugolParser.g:468:1: ruleVarType returns [EObject current=null] : ( ( (lv_typeName_0_1= Real | lv_typeName_0_2= Inteiro | lv_typeName_0_3= Caractere | lv_typeName_0_4= Caracter | lv_typeName_0_5= Logico ) ) ) ;
    public final EObject ruleVarType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;
        Token lv_typeName_0_4=null;
        Token lv_typeName_0_5=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:474:2: ( ( ( (lv_typeName_0_1= Real | lv_typeName_0_2= Inteiro | lv_typeName_0_3= Caractere | lv_typeName_0_4= Caracter | lv_typeName_0_5= Logico ) ) ) )
            // InternalPortugolParser.g:475:2: ( ( (lv_typeName_0_1= Real | lv_typeName_0_2= Inteiro | lv_typeName_0_3= Caractere | lv_typeName_0_4= Caracter | lv_typeName_0_5= Logico ) ) )
            {
            // InternalPortugolParser.g:475:2: ( ( (lv_typeName_0_1= Real | lv_typeName_0_2= Inteiro | lv_typeName_0_3= Caractere | lv_typeName_0_4= Caracter | lv_typeName_0_5= Logico ) ) )
            // InternalPortugolParser.g:476:3: ( (lv_typeName_0_1= Real | lv_typeName_0_2= Inteiro | lv_typeName_0_3= Caractere | lv_typeName_0_4= Caracter | lv_typeName_0_5= Logico ) )
            {
            // InternalPortugolParser.g:476:3: ( (lv_typeName_0_1= Real | lv_typeName_0_2= Inteiro | lv_typeName_0_3= Caractere | lv_typeName_0_4= Caracter | lv_typeName_0_5= Logico ) )
            // InternalPortugolParser.g:477:4: (lv_typeName_0_1= Real | lv_typeName_0_2= Inteiro | lv_typeName_0_3= Caractere | lv_typeName_0_4= Caracter | lv_typeName_0_5= Logico )
            {
            // InternalPortugolParser.g:477:4: (lv_typeName_0_1= Real | lv_typeName_0_2= Inteiro | lv_typeName_0_3= Caractere | lv_typeName_0_4= Caracter | lv_typeName_0_5= Logico )
            int alt6=5;
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
            case Logico:
                {
                alt6=5;
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
                case 5 :
                    // InternalPortugolParser.g:522:5: lv_typeName_0_5= Logico
                    {
                    lv_typeName_0_5=(Token)match(input,Logico,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_typeName_0_5, grammarAccess.getVarTypeAccess().getTypeNameLogicoKeyword_0_4());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getVarTypeRule());
                      					}
                      					setWithLastConsumed(current, "typeName", lv_typeName_0_5, null);
                      				
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
    // InternalPortugolParser.g:538:1: entryRuleSubprograms returns [EObject current=null] : iv_ruleSubprograms= ruleSubprograms EOF ;
    public final EObject entryRuleSubprograms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubprograms = null;


        try {
            // InternalPortugolParser.g:538:52: (iv_ruleSubprograms= ruleSubprograms EOF )
            // InternalPortugolParser.g:539:2: iv_ruleSubprograms= ruleSubprograms EOF
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
    // InternalPortugolParser.g:545:1: ruleSubprograms returns [EObject current=null] : ( (lv_blockSubPrograms_0_0= ruleBlockSubPrograms ) )+ ;
    public final EObject ruleSubprograms() throws RecognitionException {
        EObject current = null;

        EObject lv_blockSubPrograms_0_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:551:2: ( ( (lv_blockSubPrograms_0_0= ruleBlockSubPrograms ) )+ )
            // InternalPortugolParser.g:552:2: ( (lv_blockSubPrograms_0_0= ruleBlockSubPrograms ) )+
            {
            // InternalPortugolParser.g:552:2: ( (lv_blockSubPrograms_0_0= ruleBlockSubPrograms ) )+
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
            	    // InternalPortugolParser.g:553:3: (lv_blockSubPrograms_0_0= ruleBlockSubPrograms )
            	    {
            	    // InternalPortugolParser.g:553:3: (lv_blockSubPrograms_0_0= ruleBlockSubPrograms )
            	    // InternalPortugolParser.g:554:4: lv_blockSubPrograms_0_0= ruleBlockSubPrograms
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
    // InternalPortugolParser.g:574:1: entryRuleBlockSubPrograms returns [EObject current=null] : iv_ruleBlockSubPrograms= ruleBlockSubPrograms EOF ;
    public final EObject entryRuleBlockSubPrograms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockSubPrograms = null;


        try {
            // InternalPortugolParser.g:574:57: (iv_ruleBlockSubPrograms= ruleBlockSubPrograms EOF )
            // InternalPortugolParser.g:575:2: iv_ruleBlockSubPrograms= ruleBlockSubPrograms EOF
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
    // InternalPortugolParser.g:581:1: ruleBlockSubPrograms returns [EObject current=null] : (this_BlockFunction_0= ruleBlockFunction | this_BlockProcedure_1= ruleBlockProcedure ) ;
    public final EObject ruleBlockSubPrograms() throws RecognitionException {
        EObject current = null;

        EObject this_BlockFunction_0 = null;

        EObject this_BlockProcedure_1 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:587:2: ( (this_BlockFunction_0= ruleBlockFunction | this_BlockProcedure_1= ruleBlockProcedure ) )
            // InternalPortugolParser.g:588:2: (this_BlockFunction_0= ruleBlockFunction | this_BlockProcedure_1= ruleBlockProcedure )
            {
            // InternalPortugolParser.g:588:2: (this_BlockFunction_0= ruleBlockFunction | this_BlockProcedure_1= ruleBlockProcedure )
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
                    // InternalPortugolParser.g:589:3: this_BlockFunction_0= ruleBlockFunction
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
                    // InternalPortugolParser.g:598:3: this_BlockProcedure_1= ruleBlockProcedure
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
    // InternalPortugolParser.g:610:1: entryRuleProcedureName returns [EObject current=null] : iv_ruleProcedureName= ruleProcedureName EOF ;
    public final EObject entryRuleProcedureName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedureName = null;


        try {
            // InternalPortugolParser.g:610:54: (iv_ruleProcedureName= ruleProcedureName EOF )
            // InternalPortugolParser.g:611:2: iv_ruleProcedureName= ruleProcedureName EOF
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
    // InternalPortugolParser.g:617:1: ruleProcedureName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleProcedureName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:623:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPortugolParser.g:624:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPortugolParser.g:624:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPortugolParser.g:625:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPortugolParser.g:625:3: (lv_name_0_0= RULE_ID )
            // InternalPortugolParser.g:626:4: lv_name_0_0= RULE_ID
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
    // InternalPortugolParser.g:645:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // InternalPortugolParser.g:645:53: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalPortugolParser.g:646:2: iv_ruleFunctionName= ruleFunctionName EOF
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
    // InternalPortugolParser.g:652:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:658:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPortugolParser.g:659:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPortugolParser.g:659:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPortugolParser.g:660:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPortugolParser.g:660:3: (lv_name_0_0= RULE_ID )
            // InternalPortugolParser.g:661:4: lv_name_0_0= RULE_ID
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
    // InternalPortugolParser.g:680:1: entryRuleBlockFunction returns [EObject current=null] : iv_ruleBlockFunction= ruleBlockFunction EOF ;
    public final EObject entryRuleBlockFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockFunction = null;


        try {
            // InternalPortugolParser.g:680:54: (iv_ruleBlockFunction= ruleBlockFunction EOF )
            // InternalPortugolParser.g:681:2: iv_ruleBlockFunction= ruleBlockFunction EOF
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
    // InternalPortugolParser.g:687:1: ruleBlockFunction returns [EObject current=null] : (otherlv_0= Funcao ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleSubprogramParamDeclaration ) )? otherlv_4= RightParenthesis otherlv_5= Colon ( (lv_returnType_6_0= ruleVarType ) ) ( (lv_declarations_7_0= ruleDeclarationsBlock ) )? otherlv_8= Inicio ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= Fimfuncao ) ;
    public final EObject ruleBlockFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_functionName_1_0 = null;

        EObject lv_params_3_0 = null;

        EObject lv_returnType_6_0 = null;

        EObject lv_declarations_7_0 = null;

        EObject lv_commands_9_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:693:2: ( (otherlv_0= Funcao ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleSubprogramParamDeclaration ) )? otherlv_4= RightParenthesis otherlv_5= Colon ( (lv_returnType_6_0= ruleVarType ) ) ( (lv_declarations_7_0= ruleDeclarationsBlock ) )? otherlv_8= Inicio ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= Fimfuncao ) )
            // InternalPortugolParser.g:694:2: (otherlv_0= Funcao ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleSubprogramParamDeclaration ) )? otherlv_4= RightParenthesis otherlv_5= Colon ( (lv_returnType_6_0= ruleVarType ) ) ( (lv_declarations_7_0= ruleDeclarationsBlock ) )? otherlv_8= Inicio ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= Fimfuncao )
            {
            // InternalPortugolParser.g:694:2: (otherlv_0= Funcao ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleSubprogramParamDeclaration ) )? otherlv_4= RightParenthesis otherlv_5= Colon ( (lv_returnType_6_0= ruleVarType ) ) ( (lv_declarations_7_0= ruleDeclarationsBlock ) )? otherlv_8= Inicio ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= Fimfuncao )
            // InternalPortugolParser.g:695:3: otherlv_0= Funcao ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleSubprogramParamDeclaration ) )? otherlv_4= RightParenthesis otherlv_5= Colon ( (lv_returnType_6_0= ruleVarType ) ) ( (lv_declarations_7_0= ruleDeclarationsBlock ) )? otherlv_8= Inicio ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= Fimfuncao
            {
            otherlv_0=(Token)match(input,Funcao,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlockFunctionAccess().getFuncaoKeyword_0());
              		
            }
            // InternalPortugolParser.g:699:3: ( (lv_functionName_1_0= ruleFunctionName ) )
            // InternalPortugolParser.g:700:4: (lv_functionName_1_0= ruleFunctionName )
            {
            // InternalPortugolParser.g:700:4: (lv_functionName_1_0= ruleFunctionName )
            // InternalPortugolParser.g:701:5: lv_functionName_1_0= ruleFunctionName
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

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBlockFunctionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPortugolParser.g:722:3: ( (lv_params_3_0= ruleSubprogramParamDeclaration ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPortugolParser.g:723:4: (lv_params_3_0= ruleSubprogramParamDeclaration )
                    {
                    // InternalPortugolParser.g:723:4: (lv_params_3_0= ruleSubprogramParamDeclaration )
                    // InternalPortugolParser.g:724:5: lv_params_3_0= ruleSubprogramParamDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBlockFunctionAccess().getParamsSubprogramParamDeclarationParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_14);
                    lv_params_3_0=ruleSubprogramParamDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBlockFunctionRule());
                      					}
                      					set(
                      						current,
                      						"params",
                      						lv_params_3_0,
                      						"org.hopper.language.Portugol.SubprogramParamDeclaration");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBlockFunctionAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,Colon,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getBlockFunctionAccess().getColonKeyword_5());
              		
            }
            // InternalPortugolParser.g:749:3: ( (lv_returnType_6_0= ruleVarType ) )
            // InternalPortugolParser.g:750:4: (lv_returnType_6_0= ruleVarType )
            {
            // InternalPortugolParser.g:750:4: (lv_returnType_6_0= ruleVarType )
            // InternalPortugolParser.g:751:5: lv_returnType_6_0= ruleVarType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBlockFunctionAccess().getReturnTypeVarTypeParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_15);
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

            // InternalPortugolParser.g:768:3: ( (lv_declarations_7_0= ruleDeclarationsBlock ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Var) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPortugolParser.g:769:4: (lv_declarations_7_0= ruleDeclarationsBlock )
                    {
                    // InternalPortugolParser.g:769:4: (lv_declarations_7_0= ruleDeclarationsBlock )
                    // InternalPortugolParser.g:770:5: lv_declarations_7_0= ruleDeclarationsBlock
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBlockFunctionAccess().getDeclarationsDeclarationsBlockParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
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

            otherlv_8=(Token)match(input,Inicio,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getBlockFunctionAccess().getInicioKeyword_8());
              		
            }
            // InternalPortugolParser.g:791:3: ( (lv_commands_9_0= ruleAbstractCommand ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=Interrompa && LA11_0<=Verdadeiro)||(LA11_0>=Enquanto && LA11_0<=Escreva)||LA11_0==Retorne||(LA11_0>=Maiusc && LA11_0<=Copia)||LA11_0==Falso||LA11_0==Raizq||(LA11_0>=Leia && LA11_0<=Para)||LA11_0==NAO||(LA11_0>=Pi && LA11_0<=Se)||LA11_0==LeftParenthesis||LA11_0==HyphenMinus||(LA11_0>=RULE_INT && LA11_0<=RULE_STRING)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPortugolParser.g:792:4: (lv_commands_9_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugolParser.g:792:4: (lv_commands_9_0= ruleAbstractCommand )
            	    // InternalPortugolParser.g:793:5: lv_commands_9_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockFunctionAccess().getCommandsAbstractCommandParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
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
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // InternalPortugolParser.g:818:1: entryRuleBlockProcedure returns [EObject current=null] : iv_ruleBlockProcedure= ruleBlockProcedure EOF ;
    public final EObject entryRuleBlockProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockProcedure = null;


        try {
            // InternalPortugolParser.g:818:55: (iv_ruleBlockProcedure= ruleBlockProcedure EOF )
            // InternalPortugolParser.g:819:2: iv_ruleBlockProcedure= ruleBlockProcedure EOF
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
    // InternalPortugolParser.g:825:1: ruleBlockProcedure returns [EObject current=null] : (otherlv_0= Procedimento ( (lv_procedureName_1_0= ruleProcedureName ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleSubprogramParamDeclaration ) )? otherlv_4= RightParenthesis ( (lv_declarations_5_0= ruleDeclarationsBlock ) )? otherlv_6= Inicio ( (lv_commands_7_0= ruleAbstractCommand ) )+ otherlv_8= Fimprocedimento ) ;
    public final EObject ruleBlockProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_procedureName_1_0 = null;

        EObject lv_params_3_0 = null;

        EObject lv_declarations_5_0 = null;

        EObject lv_commands_7_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:831:2: ( (otherlv_0= Procedimento ( (lv_procedureName_1_0= ruleProcedureName ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleSubprogramParamDeclaration ) )? otherlv_4= RightParenthesis ( (lv_declarations_5_0= ruleDeclarationsBlock ) )? otherlv_6= Inicio ( (lv_commands_7_0= ruleAbstractCommand ) )+ otherlv_8= Fimprocedimento ) )
            // InternalPortugolParser.g:832:2: (otherlv_0= Procedimento ( (lv_procedureName_1_0= ruleProcedureName ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleSubprogramParamDeclaration ) )? otherlv_4= RightParenthesis ( (lv_declarations_5_0= ruleDeclarationsBlock ) )? otherlv_6= Inicio ( (lv_commands_7_0= ruleAbstractCommand ) )+ otherlv_8= Fimprocedimento )
            {
            // InternalPortugolParser.g:832:2: (otherlv_0= Procedimento ( (lv_procedureName_1_0= ruleProcedureName ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleSubprogramParamDeclaration ) )? otherlv_4= RightParenthesis ( (lv_declarations_5_0= ruleDeclarationsBlock ) )? otherlv_6= Inicio ( (lv_commands_7_0= ruleAbstractCommand ) )+ otherlv_8= Fimprocedimento )
            // InternalPortugolParser.g:833:3: otherlv_0= Procedimento ( (lv_procedureName_1_0= ruleProcedureName ) ) otherlv_2= LeftParenthesis ( (lv_params_3_0= ruleSubprogramParamDeclaration ) )? otherlv_4= RightParenthesis ( (lv_declarations_5_0= ruleDeclarationsBlock ) )? otherlv_6= Inicio ( (lv_commands_7_0= ruleAbstractCommand ) )+ otherlv_8= Fimprocedimento
            {
            otherlv_0=(Token)match(input,Procedimento,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlockProcedureAccess().getProcedimentoKeyword_0());
              		
            }
            // InternalPortugolParser.g:837:3: ( (lv_procedureName_1_0= ruleProcedureName ) )
            // InternalPortugolParser.g:838:4: (lv_procedureName_1_0= ruleProcedureName )
            {
            // InternalPortugolParser.g:838:4: (lv_procedureName_1_0= ruleProcedureName )
            // InternalPortugolParser.g:839:5: lv_procedureName_1_0= ruleProcedureName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBlockProcedureAccess().getProcedureNameProcedureNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_procedureName_1_0=ruleProcedureName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBlockProcedureRule());
              					}
              					set(
              						current,
              						"procedureName",
              						lv_procedureName_1_0,
              						"org.hopper.language.Portugol.ProcedureName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBlockProcedureAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPortugolParser.g:860:3: ( (lv_params_3_0= ruleSubprogramParamDeclaration ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPortugolParser.g:861:4: (lv_params_3_0= ruleSubprogramParamDeclaration )
                    {
                    // InternalPortugolParser.g:861:4: (lv_params_3_0= ruleSubprogramParamDeclaration )
                    // InternalPortugolParser.g:862:5: lv_params_3_0= ruleSubprogramParamDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBlockProcedureAccess().getParamsSubprogramParamDeclarationParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_14);
                    lv_params_3_0=ruleSubprogramParamDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBlockProcedureRule());
                      					}
                      					set(
                      						current,
                      						"params",
                      						lv_params_3_0,
                      						"org.hopper.language.Portugol.SubprogramParamDeclaration");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBlockProcedureAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalPortugolParser.g:883:3: ( (lv_declarations_5_0= ruleDeclarationsBlock ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Var) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPortugolParser.g:884:4: (lv_declarations_5_0= ruleDeclarationsBlock )
                    {
                    // InternalPortugolParser.g:884:4: (lv_declarations_5_0= ruleDeclarationsBlock )
                    // InternalPortugolParser.g:885:5: lv_declarations_5_0= ruleDeclarationsBlock
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBlockProcedureAccess().getDeclarationsDeclarationsBlockParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
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

            otherlv_6=(Token)match(input,Inicio,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getBlockProcedureAccess().getInicioKeyword_6());
              		
            }
            // InternalPortugolParser.g:906:3: ( (lv_commands_7_0= ruleAbstractCommand ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=Interrompa && LA14_0<=Verdadeiro)||(LA14_0>=Enquanto && LA14_0<=Escreva)||LA14_0==Retorne||(LA14_0>=Maiusc && LA14_0<=Copia)||LA14_0==Falso||LA14_0==Raizq||(LA14_0>=Leia && LA14_0<=Para)||LA14_0==NAO||(LA14_0>=Pi && LA14_0<=Se)||LA14_0==LeftParenthesis||LA14_0==HyphenMinus||(LA14_0>=RULE_INT && LA14_0<=RULE_STRING)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPortugolParser.g:907:4: (lv_commands_7_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugolParser.g:907:4: (lv_commands_7_0= ruleAbstractCommand )
            	    // InternalPortugolParser.g:908:5: lv_commands_7_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockProcedureAccess().getCommandsAbstractCommandParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_19);
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
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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


    // $ANTLR start "entryRuleSubprogramParamDeclaration"
    // InternalPortugolParser.g:933:1: entryRuleSubprogramParamDeclaration returns [EObject current=null] : iv_ruleSubprogramParamDeclaration= ruleSubprogramParamDeclaration EOF ;
    public final EObject entryRuleSubprogramParamDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubprogramParamDeclaration = null;


        try {
            // InternalPortugolParser.g:933:67: (iv_ruleSubprogramParamDeclaration= ruleSubprogramParamDeclaration EOF )
            // InternalPortugolParser.g:934:2: iv_ruleSubprogramParamDeclaration= ruleSubprogramParamDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubprogramParamDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubprogramParamDeclaration=ruleSubprogramParamDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubprogramParamDeclaration; 
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
    // $ANTLR end "entryRuleSubprogramParamDeclaration"


    // $ANTLR start "ruleSubprogramParamDeclaration"
    // InternalPortugolParser.g:940:1: ruleSubprogramParamDeclaration returns [EObject current=null] : ( ( (lv_paramList_0_0= ruleVariable ) ) (otherlv_1= Semicolon ( (lv_paramList_2_0= ruleVariable ) ) )* ) ;
    public final EObject ruleSubprogramParamDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_paramList_0_0 = null;

        EObject lv_paramList_2_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:946:2: ( ( ( (lv_paramList_0_0= ruleVariable ) ) (otherlv_1= Semicolon ( (lv_paramList_2_0= ruleVariable ) ) )* ) )
            // InternalPortugolParser.g:947:2: ( ( (lv_paramList_0_0= ruleVariable ) ) (otherlv_1= Semicolon ( (lv_paramList_2_0= ruleVariable ) ) )* )
            {
            // InternalPortugolParser.g:947:2: ( ( (lv_paramList_0_0= ruleVariable ) ) (otherlv_1= Semicolon ( (lv_paramList_2_0= ruleVariable ) ) )* )
            // InternalPortugolParser.g:948:3: ( (lv_paramList_0_0= ruleVariable ) ) (otherlv_1= Semicolon ( (lv_paramList_2_0= ruleVariable ) ) )*
            {
            // InternalPortugolParser.g:948:3: ( (lv_paramList_0_0= ruleVariable ) )
            // InternalPortugolParser.g:949:4: (lv_paramList_0_0= ruleVariable )
            {
            // InternalPortugolParser.g:949:4: (lv_paramList_0_0= ruleVariable )
            // InternalPortugolParser.g:950:5: lv_paramList_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubprogramParamDeclarationAccess().getParamListVariableParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_paramList_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSubprogramParamDeclarationRule());
              					}
              					add(
              						current,
              						"paramList",
              						lv_paramList_0_0,
              						"org.hopper.language.Portugol.Variable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPortugolParser.g:967:3: (otherlv_1= Semicolon ( (lv_paramList_2_0= ruleVariable ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Semicolon) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPortugolParser.g:968:4: otherlv_1= Semicolon ( (lv_paramList_2_0= ruleVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,Semicolon,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getSubprogramParamDeclarationAccess().getSemicolonKeyword_1_0());
            	      			
            	    }
            	    // InternalPortugolParser.g:972:4: ( (lv_paramList_2_0= ruleVariable ) )
            	    // InternalPortugolParser.g:973:5: (lv_paramList_2_0= ruleVariable )
            	    {
            	    // InternalPortugolParser.g:973:5: (lv_paramList_2_0= ruleVariable )
            	    // InternalPortugolParser.g:974:6: lv_paramList_2_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSubprogramParamDeclarationAccess().getParamListVariableParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_paramList_2_0=ruleVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSubprogramParamDeclarationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"paramList",
            	      							lv_paramList_2_0,
            	      							"org.hopper.language.Portugol.Variable");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleSubprogramParamDeclaration"


    // $ANTLR start "entryRuleBlockCommand"
    // InternalPortugolParser.g:996:1: entryRuleBlockCommand returns [EObject current=null] : iv_ruleBlockCommand= ruleBlockCommand EOF ;
    public final EObject entryRuleBlockCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockCommand = null;


        try {
            // InternalPortugolParser.g:996:53: (iv_ruleBlockCommand= ruleBlockCommand EOF )
            // InternalPortugolParser.g:997:2: iv_ruleBlockCommand= ruleBlockCommand EOF
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
    // InternalPortugolParser.g:1003:1: ruleBlockCommand returns [EObject current=null] : (otherlv_0= Inicio ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= Fimalgoritmo ) ;
    public final EObject ruleBlockCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_commands_1_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:1009:2: ( (otherlv_0= Inicio ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= Fimalgoritmo ) )
            // InternalPortugolParser.g:1010:2: (otherlv_0= Inicio ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= Fimalgoritmo )
            {
            // InternalPortugolParser.g:1010:2: (otherlv_0= Inicio ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= Fimalgoritmo )
            // InternalPortugolParser.g:1011:3: otherlv_0= Inicio ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= Fimalgoritmo
            {
            otherlv_0=(Token)match(input,Inicio,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlockCommandAccess().getInicioKeyword_0());
              		
            }
            // InternalPortugolParser.g:1015:3: ( (lv_commands_1_0= ruleAbstractCommand ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=Interrompa && LA16_0<=Verdadeiro)||(LA16_0>=Enquanto && LA16_0<=Escreva)||LA16_0==Retorne||(LA16_0>=Maiusc && LA16_0<=Copia)||LA16_0==Falso||LA16_0==Raizq||(LA16_0>=Leia && LA16_0<=Para)||LA16_0==NAO||(LA16_0>=Pi && LA16_0<=Se)||LA16_0==LeftParenthesis||LA16_0==HyphenMinus||(LA16_0>=RULE_INT && LA16_0<=RULE_STRING)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPortugolParser.g:1016:4: (lv_commands_1_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugolParser.g:1016:4: (lv_commands_1_0= ruleAbstractCommand )
            	    // InternalPortugolParser.g:1017:5: lv_commands_1_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockCommandAccess().getCommandsAbstractCommandParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_21);
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
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
    // InternalPortugolParser.g:1042:1: entryRuleAbstractCommand returns [EObject current=null] : iv_ruleAbstractCommand= ruleAbstractCommand EOF ;
    public final EObject entryRuleAbstractCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractCommand = null;


        try {
            // InternalPortugolParser.g:1042:56: (iv_ruleAbstractCommand= ruleAbstractCommand EOF )
            // InternalPortugolParser.g:1043:2: iv_ruleAbstractCommand= ruleAbstractCommand EOF
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
    // InternalPortugolParser.g:1049:1: ruleAbstractCommand returns [EObject current=null] : ( (this_ReadCommand_0= ruleReadCommand ruleEND_COMMAND ) | (this_WriteCommand_2= ruleWriteCommand ruleEND_COMMAND ) | (this_Expression_4= ruleExpression ruleEND_COMMAND ) | this_IfStatement_6= ruleIfStatement | this_SwitchCaseStatement_7= ruleSwitchCaseStatement | this_ForStatement_8= ruleForStatement | this_RepeatStatement_9= ruleRepeatStatement | this_WhileStatement_10= ruleWhileStatement | (this_BreakStatement_11= ruleBreakStatement ruleEND_COMMAND ) | (this_ReturnStatement_13= ruleReturnStatement ruleEND_COMMAND ) ) ;
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
            // InternalPortugolParser.g:1055:2: ( ( (this_ReadCommand_0= ruleReadCommand ruleEND_COMMAND ) | (this_WriteCommand_2= ruleWriteCommand ruleEND_COMMAND ) | (this_Expression_4= ruleExpression ruleEND_COMMAND ) | this_IfStatement_6= ruleIfStatement | this_SwitchCaseStatement_7= ruleSwitchCaseStatement | this_ForStatement_8= ruleForStatement | this_RepeatStatement_9= ruleRepeatStatement | this_WhileStatement_10= ruleWhileStatement | (this_BreakStatement_11= ruleBreakStatement ruleEND_COMMAND ) | (this_ReturnStatement_13= ruleReturnStatement ruleEND_COMMAND ) ) )
            // InternalPortugolParser.g:1056:2: ( (this_ReadCommand_0= ruleReadCommand ruleEND_COMMAND ) | (this_WriteCommand_2= ruleWriteCommand ruleEND_COMMAND ) | (this_Expression_4= ruleExpression ruleEND_COMMAND ) | this_IfStatement_6= ruleIfStatement | this_SwitchCaseStatement_7= ruleSwitchCaseStatement | this_ForStatement_8= ruleForStatement | this_RepeatStatement_9= ruleRepeatStatement | this_WhileStatement_10= ruleWhileStatement | (this_BreakStatement_11= ruleBreakStatement ruleEND_COMMAND ) | (this_ReturnStatement_13= ruleReturnStatement ruleEND_COMMAND ) )
            {
            // InternalPortugolParser.g:1056:2: ( (this_ReadCommand_0= ruleReadCommand ruleEND_COMMAND ) | (this_WriteCommand_2= ruleWriteCommand ruleEND_COMMAND ) | (this_Expression_4= ruleExpression ruleEND_COMMAND ) | this_IfStatement_6= ruleIfStatement | this_SwitchCaseStatement_7= ruleSwitchCaseStatement | this_ForStatement_8= ruleForStatement | this_RepeatStatement_9= ruleRepeatStatement | this_WhileStatement_10= ruleWhileStatement | (this_BreakStatement_11= ruleBreakStatement ruleEND_COMMAND ) | (this_ReturnStatement_13= ruleReturnStatement ruleEND_COMMAND ) )
            int alt17=10;
            switch ( input.LA(1) ) {
            case Leia:
                {
                alt17=1;
                }
                break;
            case Escreval:
            case Escreva:
                {
                alt17=2;
                }
                break;
            case Verdadeiro:
            case Maiusc:
            case Compr:
            case Copia:
            case Falso:
            case Raizq:
            case NAO:
            case Pi:
            case LeftParenthesis:
            case HyphenMinus:
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_ID:
            case RULE_STRING:
                {
                alt17=3;
                }
                break;
            case Se:
                {
                alt17=4;
                }
                break;
            case Escolha:
                {
                alt17=5;
                }
                break;
            case Para:
                {
                alt17=6;
                }
                break;
            case Repita:
                {
                alt17=7;
                }
                break;
            case Enquanto:
                {
                alt17=8;
                }
                break;
            case Interrompa:
                {
                alt17=9;
                }
                break;
            case Retorne:
                {
                alt17=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalPortugolParser.g:1057:3: (this_ReadCommand_0= ruleReadCommand ruleEND_COMMAND )
                    {
                    // InternalPortugolParser.g:1057:3: (this_ReadCommand_0= ruleReadCommand ruleEND_COMMAND )
                    // InternalPortugolParser.g:1058:4: this_ReadCommand_0= ruleReadCommand ruleEND_COMMAND
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
                    // InternalPortugolParser.g:1075:3: (this_WriteCommand_2= ruleWriteCommand ruleEND_COMMAND )
                    {
                    // InternalPortugolParser.g:1075:3: (this_WriteCommand_2= ruleWriteCommand ruleEND_COMMAND )
                    // InternalPortugolParser.g:1076:4: this_WriteCommand_2= ruleWriteCommand ruleEND_COMMAND
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
                    // InternalPortugolParser.g:1093:3: (this_Expression_4= ruleExpression ruleEND_COMMAND )
                    {
                    // InternalPortugolParser.g:1093:3: (this_Expression_4= ruleExpression ruleEND_COMMAND )
                    // InternalPortugolParser.g:1094:4: this_Expression_4= ruleExpression ruleEND_COMMAND
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
                    // InternalPortugolParser.g:1111:3: this_IfStatement_6= ruleIfStatement
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
                    // InternalPortugolParser.g:1120:3: this_SwitchCaseStatement_7= ruleSwitchCaseStatement
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
                    // InternalPortugolParser.g:1129:3: this_ForStatement_8= ruleForStatement
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
                    // InternalPortugolParser.g:1138:3: this_RepeatStatement_9= ruleRepeatStatement
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
                    // InternalPortugolParser.g:1147:3: this_WhileStatement_10= ruleWhileStatement
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
                    // InternalPortugolParser.g:1156:3: (this_BreakStatement_11= ruleBreakStatement ruleEND_COMMAND )
                    {
                    // InternalPortugolParser.g:1156:3: (this_BreakStatement_11= ruleBreakStatement ruleEND_COMMAND )
                    // InternalPortugolParser.g:1157:4: this_BreakStatement_11= ruleBreakStatement ruleEND_COMMAND
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
                    // InternalPortugolParser.g:1174:3: (this_ReturnStatement_13= ruleReturnStatement ruleEND_COMMAND )
                    {
                    // InternalPortugolParser.g:1174:3: (this_ReturnStatement_13= ruleReturnStatement ruleEND_COMMAND )
                    // InternalPortugolParser.g:1175:4: this_ReturnStatement_13= ruleReturnStatement ruleEND_COMMAND
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
    // InternalPortugolParser.g:1195:1: entryRuleBreakStatement returns [EObject current=null] : iv_ruleBreakStatement= ruleBreakStatement EOF ;
    public final EObject entryRuleBreakStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakStatement = null;


        try {
            // InternalPortugolParser.g:1195:55: (iv_ruleBreakStatement= ruleBreakStatement EOF )
            // InternalPortugolParser.g:1196:2: iv_ruleBreakStatement= ruleBreakStatement EOF
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
    // InternalPortugolParser.g:1202:1: ruleBreakStatement returns [EObject current=null] : ( () otherlv_1= Interrompa ) ;
    public final EObject ruleBreakStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:1208:2: ( ( () otherlv_1= Interrompa ) )
            // InternalPortugolParser.g:1209:2: ( () otherlv_1= Interrompa )
            {
            // InternalPortugolParser.g:1209:2: ( () otherlv_1= Interrompa )
            // InternalPortugolParser.g:1210:3: () otherlv_1= Interrompa
            {
            // InternalPortugolParser.g:1210:3: ()
            // InternalPortugolParser.g:1211:4: 
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
    // InternalPortugolParser.g:1225:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // InternalPortugolParser.g:1225:56: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalPortugolParser.g:1226:2: iv_ruleReturnStatement= ruleReturnStatement EOF
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
    // InternalPortugolParser.g:1232:1: ruleReturnStatement returns [EObject current=null] : ( () otherlv_1= Retorne ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:1238:2: ( ( () otherlv_1= Retorne ( (lv_expr_2_0= ruleExpression ) ) ) )
            // InternalPortugolParser.g:1239:2: ( () otherlv_1= Retorne ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // InternalPortugolParser.g:1239:2: ( () otherlv_1= Retorne ( (lv_expr_2_0= ruleExpression ) ) )
            // InternalPortugolParser.g:1240:3: () otherlv_1= Retorne ( (lv_expr_2_0= ruleExpression ) )
            {
            // InternalPortugolParser.g:1240:3: ()
            // InternalPortugolParser.g:1241:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnStatementAccess().getReturnStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Retorne,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReturnStatementAccess().getRetorneKeyword_1());
              		
            }
            // InternalPortugolParser.g:1251:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalPortugolParser.g:1252:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalPortugolParser.g:1252:4: (lv_expr_2_0= ruleExpression )
            // InternalPortugolParser.g:1253:5: lv_expr_2_0= ruleExpression
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
    // InternalPortugolParser.g:1274:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalPortugolParser.g:1274:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalPortugolParser.g:1275:2: iv_ruleIfStatement= ruleIfStatement EOF
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
    // InternalPortugolParser.g:1281:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= Se ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= Entao ( (lv_commands_3_0= ruleAbstractCommand ) )+ (otherlv_4= Senao ( (lv_elseCommands_5_0= ruleAbstractCommand ) )+ )? otherlv_6= Fimse ) ;
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
            // InternalPortugolParser.g:1287:2: ( (otherlv_0= Se ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= Entao ( (lv_commands_3_0= ruleAbstractCommand ) )+ (otherlv_4= Senao ( (lv_elseCommands_5_0= ruleAbstractCommand ) )+ )? otherlv_6= Fimse ) )
            // InternalPortugolParser.g:1288:2: (otherlv_0= Se ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= Entao ( (lv_commands_3_0= ruleAbstractCommand ) )+ (otherlv_4= Senao ( (lv_elseCommands_5_0= ruleAbstractCommand ) )+ )? otherlv_6= Fimse )
            {
            // InternalPortugolParser.g:1288:2: (otherlv_0= Se ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= Entao ( (lv_commands_3_0= ruleAbstractCommand ) )+ (otherlv_4= Senao ( (lv_elseCommands_5_0= ruleAbstractCommand ) )+ )? otherlv_6= Fimse )
            // InternalPortugolParser.g:1289:3: otherlv_0= Se ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= Entao ( (lv_commands_3_0= ruleAbstractCommand ) )+ (otherlv_4= Senao ( (lv_elseCommands_5_0= ruleAbstractCommand ) )+ )? otherlv_6= Fimse
            {
            otherlv_0=(Token)match(input,Se,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getSeKeyword_0());
              		
            }
            // InternalPortugolParser.g:1293:3: ( (lv_expr_1_0= ruleExpression ) )
            // InternalPortugolParser.g:1294:4: (lv_expr_1_0= ruleExpression )
            {
            // InternalPortugolParser.g:1294:4: (lv_expr_1_0= ruleExpression )
            // InternalPortugolParser.g:1295:5: lv_expr_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getExprExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_23);
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

            otherlv_2=(Token)match(input,Entao,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getEntaoKeyword_2());
              		
            }
            // InternalPortugolParser.g:1316:3: ( (lv_commands_3_0= ruleAbstractCommand ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=Interrompa && LA18_0<=Verdadeiro)||(LA18_0>=Enquanto && LA18_0<=Escreva)||LA18_0==Retorne||(LA18_0>=Maiusc && LA18_0<=Copia)||LA18_0==Falso||LA18_0==Raizq||(LA18_0>=Leia && LA18_0<=Para)||LA18_0==NAO||(LA18_0>=Pi && LA18_0<=Se)||LA18_0==LeftParenthesis||LA18_0==HyphenMinus||(LA18_0>=RULE_INT && LA18_0<=RULE_STRING)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPortugolParser.g:1317:4: (lv_commands_3_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugolParser.g:1317:4: (lv_commands_3_0= ruleAbstractCommand )
            	    // InternalPortugolParser.g:1318:5: lv_commands_3_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfStatementAccess().getCommandsAbstractCommandParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
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
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            // InternalPortugolParser.g:1335:3: (otherlv_4= Senao ( (lv_elseCommands_5_0= ruleAbstractCommand ) )+ )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Senao) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPortugolParser.g:1336:4: otherlv_4= Senao ( (lv_elseCommands_5_0= ruleAbstractCommand ) )+
                    {
                    otherlv_4=(Token)match(input,Senao,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getSenaoKeyword_4_0());
                      			
                    }
                    // InternalPortugolParser.g:1340:4: ( (lv_elseCommands_5_0= ruleAbstractCommand ) )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>=Interrompa && LA19_0<=Verdadeiro)||(LA19_0>=Enquanto && LA19_0<=Escreva)||LA19_0==Retorne||(LA19_0>=Maiusc && LA19_0<=Copia)||LA19_0==Falso||LA19_0==Raizq||(LA19_0>=Leia && LA19_0<=Para)||LA19_0==NAO||(LA19_0>=Pi && LA19_0<=Se)||LA19_0==LeftParenthesis||LA19_0==HyphenMinus||(LA19_0>=RULE_INT && LA19_0<=RULE_STRING)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalPortugolParser.g:1341:5: (lv_elseCommands_5_0= ruleAbstractCommand )
                    	    {
                    	    // InternalPortugolParser.g:1341:5: (lv_elseCommands_5_0= ruleAbstractCommand )
                    	    // InternalPortugolParser.g:1342:6: lv_elseCommands_5_0= ruleAbstractCommand
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getIfStatementAccess().getElseCommandsAbstractCommandParserRuleCall_4_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_25);
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
                    	    if ( cnt19 >= 1 ) break loop19;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
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
    // InternalPortugolParser.g:1368:1: entryRuleSwitchCaseStatement returns [EObject current=null] : iv_ruleSwitchCaseStatement= ruleSwitchCaseStatement EOF ;
    public final EObject entryRuleSwitchCaseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCaseStatement = null;


        try {
            // InternalPortugolParser.g:1368:60: (iv_ruleSwitchCaseStatement= ruleSwitchCaseStatement EOF )
            // InternalPortugolParser.g:1369:2: iv_ruleSwitchCaseStatement= ruleSwitchCaseStatement EOF
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
    // InternalPortugolParser.g:1375:1: ruleSwitchCaseStatement returns [EObject current=null] : (otherlv_0= Escolha ( (otherlv_1= RULE_ID ) ) ( (lv_caseList_2_0= ruleCaseList ) )+ ( (lv_otherCase_3_0= ruleOtherCase ) )? otherlv_4= Fimescolha ) ;
    public final EObject ruleSwitchCaseStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_caseList_2_0 = null;

        EObject lv_otherCase_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:1381:2: ( (otherlv_0= Escolha ( (otherlv_1= RULE_ID ) ) ( (lv_caseList_2_0= ruleCaseList ) )+ ( (lv_otherCase_3_0= ruleOtherCase ) )? otherlv_4= Fimescolha ) )
            // InternalPortugolParser.g:1382:2: (otherlv_0= Escolha ( (otherlv_1= RULE_ID ) ) ( (lv_caseList_2_0= ruleCaseList ) )+ ( (lv_otherCase_3_0= ruleOtherCase ) )? otherlv_4= Fimescolha )
            {
            // InternalPortugolParser.g:1382:2: (otherlv_0= Escolha ( (otherlv_1= RULE_ID ) ) ( (lv_caseList_2_0= ruleCaseList ) )+ ( (lv_otherCase_3_0= ruleOtherCase ) )? otherlv_4= Fimescolha )
            // InternalPortugolParser.g:1383:3: otherlv_0= Escolha ( (otherlv_1= RULE_ID ) ) ( (lv_caseList_2_0= ruleCaseList ) )+ ( (lv_otherCase_3_0= ruleOtherCase ) )? otherlv_4= Fimescolha
            {
            otherlv_0=(Token)match(input,Escolha,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSwitchCaseStatementAccess().getEscolhaKeyword_0());
              		
            }
            // InternalPortugolParser.g:1387:3: ( (otherlv_1= RULE_ID ) )
            // InternalPortugolParser.g:1388:4: (otherlv_1= RULE_ID )
            {
            // InternalPortugolParser.g:1388:4: (otherlv_1= RULE_ID )
            // InternalPortugolParser.g:1389:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSwitchCaseStatementRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getSwitchCaseStatementAccess().getVariableVarNameCrossReference_1_0());
              				
            }

            }


            }

            // InternalPortugolParser.g:1400:3: ( (lv_caseList_2_0= ruleCaseList ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Caso) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPortugolParser.g:1401:4: (lv_caseList_2_0= ruleCaseList )
            	    {
            	    // InternalPortugolParser.g:1401:4: (lv_caseList_2_0= ruleCaseList )
            	    // InternalPortugolParser.g:1402:5: lv_caseList_2_0= ruleCaseList
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSwitchCaseStatementAccess().getCaseListCaseListParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_27);
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
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            // InternalPortugolParser.g:1419:3: ( (lv_otherCase_3_0= ruleOtherCase ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Outrocaso) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPortugolParser.g:1420:4: (lv_otherCase_3_0= ruleOtherCase )
                    {
                    // InternalPortugolParser.g:1420:4: (lv_otherCase_3_0= ruleOtherCase )
                    // InternalPortugolParser.g:1421:5: lv_otherCase_3_0= ruleOtherCase
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSwitchCaseStatementAccess().getOtherCaseOtherCaseParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_28);
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
    // InternalPortugolParser.g:1446:1: entryRuleCaseList returns [EObject current=null] : iv_ruleCaseList= ruleCaseList EOF ;
    public final EObject entryRuleCaseList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseList = null;


        try {
            // InternalPortugolParser.g:1446:49: (iv_ruleCaseList= ruleCaseList EOF )
            // InternalPortugolParser.g:1447:2: iv_ruleCaseList= ruleCaseList EOF
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
    // InternalPortugolParser.g:1453:1: ruleCaseList returns [EObject current=null] : (otherlv_0= Caso ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= Colon ( (lv_commands_3_0= ruleAbstractCommand ) )+ ) ;
    public final EObject ruleCaseList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;

        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:1459:2: ( (otherlv_0= Caso ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= Colon ( (lv_commands_3_0= ruleAbstractCommand ) )+ ) )
            // InternalPortugolParser.g:1460:2: (otherlv_0= Caso ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= Colon ( (lv_commands_3_0= ruleAbstractCommand ) )+ )
            {
            // InternalPortugolParser.g:1460:2: (otherlv_0= Caso ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= Colon ( (lv_commands_3_0= ruleAbstractCommand ) )+ )
            // InternalPortugolParser.g:1461:3: otherlv_0= Caso ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= Colon ( (lv_commands_3_0= ruleAbstractCommand ) )+
            {
            otherlv_0=(Token)match(input,Caso,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCaseListAccess().getCasoKeyword_0());
              		
            }
            // InternalPortugolParser.g:1465:3: ( (lv_expr_1_0= ruleExpression ) )
            // InternalPortugolParser.g:1466:4: (lv_expr_1_0= ruleExpression )
            {
            // InternalPortugolParser.g:1466:4: (lv_expr_1_0= ruleExpression )
            // InternalPortugolParser.g:1467:5: lv_expr_1_0= ruleExpression
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

            otherlv_2=(Token)match(input,Colon,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCaseListAccess().getColonKeyword_2());
              		
            }
            // InternalPortugolParser.g:1488:3: ( (lv_commands_3_0= ruleAbstractCommand ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=Interrompa && LA23_0<=Verdadeiro)||(LA23_0>=Enquanto && LA23_0<=Escreva)||LA23_0==Retorne||(LA23_0>=Maiusc && LA23_0<=Copia)||LA23_0==Falso||LA23_0==Raizq||(LA23_0>=Leia && LA23_0<=Para)||LA23_0==NAO||(LA23_0>=Pi && LA23_0<=Se)||LA23_0==LeftParenthesis||LA23_0==HyphenMinus||(LA23_0>=RULE_INT && LA23_0<=RULE_STRING)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalPortugolParser.g:1489:4: (lv_commands_3_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugolParser.g:1489:4: (lv_commands_3_0= ruleAbstractCommand )
            	    // InternalPortugolParser.g:1490:5: lv_commands_3_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCaseListAccess().getCommandsAbstractCommandParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_29);
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
            	    if ( cnt23 >= 1 ) break loop23;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
    // InternalPortugolParser.g:1511:1: entryRuleOtherCase returns [EObject current=null] : iv_ruleOtherCase= ruleOtherCase EOF ;
    public final EObject entryRuleOtherCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherCase = null;


        try {
            // InternalPortugolParser.g:1511:50: (iv_ruleOtherCase= ruleOtherCase EOF )
            // InternalPortugolParser.g:1512:2: iv_ruleOtherCase= ruleOtherCase EOF
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
    // InternalPortugolParser.g:1518:1: ruleOtherCase returns [EObject current=null] : (otherlv_0= Outrocaso otherlv_1= Colon ( (lv_otherCaseCommands_2_0= ruleAbstractCommand ) )+ ) ;
    public final EObject ruleOtherCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_otherCaseCommands_2_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:1524:2: ( (otherlv_0= Outrocaso otherlv_1= Colon ( (lv_otherCaseCommands_2_0= ruleAbstractCommand ) )+ ) )
            // InternalPortugolParser.g:1525:2: (otherlv_0= Outrocaso otherlv_1= Colon ( (lv_otherCaseCommands_2_0= ruleAbstractCommand ) )+ )
            {
            // InternalPortugolParser.g:1525:2: (otherlv_0= Outrocaso otherlv_1= Colon ( (lv_otherCaseCommands_2_0= ruleAbstractCommand ) )+ )
            // InternalPortugolParser.g:1526:3: otherlv_0= Outrocaso otherlv_1= Colon ( (lv_otherCaseCommands_2_0= ruleAbstractCommand ) )+
            {
            otherlv_0=(Token)match(input,Outrocaso,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOtherCaseAccess().getOutrocasoKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOtherCaseAccess().getColonKeyword_1());
              		
            }
            // InternalPortugolParser.g:1534:3: ( (lv_otherCaseCommands_2_0= ruleAbstractCommand ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=Interrompa && LA24_0<=Verdadeiro)||(LA24_0>=Enquanto && LA24_0<=Escreva)||LA24_0==Retorne||(LA24_0>=Maiusc && LA24_0<=Copia)||LA24_0==Falso||LA24_0==Raizq||(LA24_0>=Leia && LA24_0<=Para)||LA24_0==NAO||(LA24_0>=Pi && LA24_0<=Se)||LA24_0==LeftParenthesis||LA24_0==HyphenMinus||(LA24_0>=RULE_INT && LA24_0<=RULE_STRING)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPortugolParser.g:1535:4: (lv_otherCaseCommands_2_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugolParser.g:1535:4: (lv_otherCaseCommands_2_0= ruleAbstractCommand )
            	    // InternalPortugolParser.g:1536:5: lv_otherCaseCommands_2_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getOtherCaseAccess().getOtherCaseCommandsAbstractCommandParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_29);
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
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
    // InternalPortugolParser.g:1557:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalPortugolParser.g:1557:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalPortugolParser.g:1558:2: iv_ruleForStatement= ruleForStatement EOF
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
    // InternalPortugolParser.g:1564:1: ruleForStatement returns [EObject current=null] : (otherlv_0= Para ( (lv_operatorExpr_1_0= ruleExpression ) ) otherlv_2= De ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= Ate ( (lv_endExpr_5_0= ruleExpression ) ) (otherlv_6= Passo ( (lv_stepExpe_7_0= ruleExpression ) ) )? otherlv_8= Faca ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= Fimpara ) ;
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
            // InternalPortugolParser.g:1570:2: ( (otherlv_0= Para ( (lv_operatorExpr_1_0= ruleExpression ) ) otherlv_2= De ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= Ate ( (lv_endExpr_5_0= ruleExpression ) ) (otherlv_6= Passo ( (lv_stepExpe_7_0= ruleExpression ) ) )? otherlv_8= Faca ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= Fimpara ) )
            // InternalPortugolParser.g:1571:2: (otherlv_0= Para ( (lv_operatorExpr_1_0= ruleExpression ) ) otherlv_2= De ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= Ate ( (lv_endExpr_5_0= ruleExpression ) ) (otherlv_6= Passo ( (lv_stepExpe_7_0= ruleExpression ) ) )? otherlv_8= Faca ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= Fimpara )
            {
            // InternalPortugolParser.g:1571:2: (otherlv_0= Para ( (lv_operatorExpr_1_0= ruleExpression ) ) otherlv_2= De ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= Ate ( (lv_endExpr_5_0= ruleExpression ) ) (otherlv_6= Passo ( (lv_stepExpe_7_0= ruleExpression ) ) )? otherlv_8= Faca ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= Fimpara )
            // InternalPortugolParser.g:1572:3: otherlv_0= Para ( (lv_operatorExpr_1_0= ruleExpression ) ) otherlv_2= De ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= Ate ( (lv_endExpr_5_0= ruleExpression ) ) (otherlv_6= Passo ( (lv_stepExpe_7_0= ruleExpression ) ) )? otherlv_8= Faca ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= Fimpara
            {
            otherlv_0=(Token)match(input,Para,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getParaKeyword_0());
              		
            }
            // InternalPortugolParser.g:1576:3: ( (lv_operatorExpr_1_0= ruleExpression ) )
            // InternalPortugolParser.g:1577:4: (lv_operatorExpr_1_0= ruleExpression )
            {
            // InternalPortugolParser.g:1577:4: (lv_operatorExpr_1_0= ruleExpression )
            // InternalPortugolParser.g:1578:5: lv_operatorExpr_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getOperatorExprExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_30);
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

            otherlv_2=(Token)match(input,De,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForStatementAccess().getDeKeyword_2());
              		
            }
            // InternalPortugolParser.g:1599:3: ( (lv_startExpr_3_0= ruleExpression ) )
            // InternalPortugolParser.g:1600:4: (lv_startExpr_3_0= ruleExpression )
            {
            // InternalPortugolParser.g:1600:4: (lv_startExpr_3_0= ruleExpression )
            // InternalPortugolParser.g:1601:5: lv_startExpr_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getStartExprExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            otherlv_4=(Token)match(input,Ate,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForStatementAccess().getAteKeyword_4());
              		
            }
            // InternalPortugolParser.g:1622:3: ( (lv_endExpr_5_0= ruleExpression ) )
            // InternalPortugolParser.g:1623:4: (lv_endExpr_5_0= ruleExpression )
            {
            // InternalPortugolParser.g:1623:4: (lv_endExpr_5_0= ruleExpression )
            // InternalPortugolParser.g:1624:5: lv_endExpr_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getEndExprExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_32);
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

            // InternalPortugolParser.g:1641:3: (otherlv_6= Passo ( (lv_stepExpe_7_0= ruleExpression ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Passo) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPortugolParser.g:1642:4: otherlv_6= Passo ( (lv_stepExpe_7_0= ruleExpression ) )
                    {
                    otherlv_6=(Token)match(input,Passo,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getForStatementAccess().getPassoKeyword_6_0());
                      			
                    }
                    // InternalPortugolParser.g:1646:4: ( (lv_stepExpe_7_0= ruleExpression ) )
                    // InternalPortugolParser.g:1647:5: (lv_stepExpe_7_0= ruleExpression )
                    {
                    // InternalPortugolParser.g:1647:5: (lv_stepExpe_7_0= ruleExpression )
                    // InternalPortugolParser.g:1648:6: lv_stepExpe_7_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getForStatementAccess().getStepExpeExpressionParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_33);
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

            otherlv_8=(Token)match(input,Faca,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getForStatementAccess().getFacaKeyword_7());
              		
            }
            // InternalPortugolParser.g:1670:3: ( (lv_commands_9_0= ruleAbstractCommand ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=Interrompa && LA26_0<=Verdadeiro)||(LA26_0>=Enquanto && LA26_0<=Escreva)||LA26_0==Retorne||(LA26_0>=Maiusc && LA26_0<=Copia)||LA26_0==Falso||LA26_0==Raizq||(LA26_0>=Leia && LA26_0<=Para)||LA26_0==NAO||(LA26_0>=Pi && LA26_0<=Se)||LA26_0==LeftParenthesis||LA26_0==HyphenMinus||(LA26_0>=RULE_INT && LA26_0<=RULE_STRING)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPortugolParser.g:1671:4: (lv_commands_9_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugolParser.g:1671:4: (lv_commands_9_0= ruleAbstractCommand )
            	    // InternalPortugolParser.g:1672:5: lv_commands_9_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getForStatementAccess().getCommandsAbstractCommandParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_34);
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
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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
    // InternalPortugolParser.g:1697:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalPortugolParser.g:1697:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalPortugolParser.g:1698:2: iv_ruleWhileStatement= ruleWhileStatement EOF
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
    // InternalPortugolParser.g:1704:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= Enquanto ( (lv_whileExpr_1_0= ruleExpression ) ) otherlv_2= Faca ( (lv_commands_3_0= ruleAbstractCommand ) )+ otherlv_4= Fimenquanto ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_whileExpr_1_0 = null;

        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:1710:2: ( (otherlv_0= Enquanto ( (lv_whileExpr_1_0= ruleExpression ) ) otherlv_2= Faca ( (lv_commands_3_0= ruleAbstractCommand ) )+ otherlv_4= Fimenquanto ) )
            // InternalPortugolParser.g:1711:2: (otherlv_0= Enquanto ( (lv_whileExpr_1_0= ruleExpression ) ) otherlv_2= Faca ( (lv_commands_3_0= ruleAbstractCommand ) )+ otherlv_4= Fimenquanto )
            {
            // InternalPortugolParser.g:1711:2: (otherlv_0= Enquanto ( (lv_whileExpr_1_0= ruleExpression ) ) otherlv_2= Faca ( (lv_commands_3_0= ruleAbstractCommand ) )+ otherlv_4= Fimenquanto )
            // InternalPortugolParser.g:1712:3: otherlv_0= Enquanto ( (lv_whileExpr_1_0= ruleExpression ) ) otherlv_2= Faca ( (lv_commands_3_0= ruleAbstractCommand ) )+ otherlv_4= Fimenquanto
            {
            otherlv_0=(Token)match(input,Enquanto,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getEnquantoKeyword_0());
              		
            }
            // InternalPortugolParser.g:1716:3: ( (lv_whileExpr_1_0= ruleExpression ) )
            // InternalPortugolParser.g:1717:4: (lv_whileExpr_1_0= ruleExpression )
            {
            // InternalPortugolParser.g:1717:4: (lv_whileExpr_1_0= ruleExpression )
            // InternalPortugolParser.g:1718:5: lv_whileExpr_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileStatementAccess().getWhileExprExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_33);
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

            otherlv_2=(Token)match(input,Faca,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileStatementAccess().getFacaKeyword_2());
              		
            }
            // InternalPortugolParser.g:1739:3: ( (lv_commands_3_0= ruleAbstractCommand ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=Interrompa && LA27_0<=Verdadeiro)||(LA27_0>=Enquanto && LA27_0<=Escreva)||LA27_0==Retorne||(LA27_0>=Maiusc && LA27_0<=Copia)||LA27_0==Falso||LA27_0==Raizq||(LA27_0>=Leia && LA27_0<=Para)||LA27_0==NAO||(LA27_0>=Pi && LA27_0<=Se)||LA27_0==LeftParenthesis||LA27_0==HyphenMinus||(LA27_0>=RULE_INT && LA27_0<=RULE_STRING)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPortugolParser.g:1740:4: (lv_commands_3_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugolParser.g:1740:4: (lv_commands_3_0= ruleAbstractCommand )
            	    // InternalPortugolParser.g:1741:5: lv_commands_3_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWhileStatementAccess().getCommandsAbstractCommandParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_35);
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
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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
    // InternalPortugolParser.g:1766:1: entryRuleRepeatStatement returns [EObject current=null] : iv_ruleRepeatStatement= ruleRepeatStatement EOF ;
    public final EObject entryRuleRepeatStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatStatement = null;


        try {
            // InternalPortugolParser.g:1766:56: (iv_ruleRepeatStatement= ruleRepeatStatement EOF )
            // InternalPortugolParser.g:1767:2: iv_ruleRepeatStatement= ruleRepeatStatement EOF
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
    // InternalPortugolParser.g:1773:1: ruleRepeatStatement returns [EObject current=null] : (otherlv_0= Repita ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= Ate ( (lv_untilExpr_3_0= ruleExpression ) ) ruleEND_COMMAND ) ;
    public final EObject ruleRepeatStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_commands_1_0 = null;

        EObject lv_untilExpr_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:1779:2: ( (otherlv_0= Repita ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= Ate ( (lv_untilExpr_3_0= ruleExpression ) ) ruleEND_COMMAND ) )
            // InternalPortugolParser.g:1780:2: (otherlv_0= Repita ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= Ate ( (lv_untilExpr_3_0= ruleExpression ) ) ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:1780:2: (otherlv_0= Repita ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= Ate ( (lv_untilExpr_3_0= ruleExpression ) ) ruleEND_COMMAND )
            // InternalPortugolParser.g:1781:3: otherlv_0= Repita ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= Ate ( (lv_untilExpr_3_0= ruleExpression ) ) ruleEND_COMMAND
            {
            otherlv_0=(Token)match(input,Repita,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRepeatStatementAccess().getRepitaKeyword_0());
              		
            }
            // InternalPortugolParser.g:1785:3: ( (lv_commands_1_0= ruleAbstractCommand ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=Interrompa && LA28_0<=Verdadeiro)||(LA28_0>=Enquanto && LA28_0<=Escreva)||LA28_0==Retorne||(LA28_0>=Maiusc && LA28_0<=Copia)||LA28_0==Falso||LA28_0==Raizq||(LA28_0>=Leia && LA28_0<=Para)||LA28_0==NAO||(LA28_0>=Pi && LA28_0<=Se)||LA28_0==LeftParenthesis||LA28_0==HyphenMinus||(LA28_0>=RULE_INT && LA28_0<=RULE_STRING)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalPortugolParser.g:1786:4: (lv_commands_1_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugolParser.g:1786:4: (lv_commands_1_0= ruleAbstractCommand )
            	    // InternalPortugolParser.g:1787:5: lv_commands_1_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRepeatStatementAccess().getCommandsAbstractCommandParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_36);
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
            	    if ( cnt28 >= 1 ) break loop28;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

            otherlv_2=(Token)match(input,Ate,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRepeatStatementAccess().getAteKeyword_2());
              		
            }
            // InternalPortugolParser.g:1808:3: ( (lv_untilExpr_3_0= ruleExpression ) )
            // InternalPortugolParser.g:1809:4: (lv_untilExpr_3_0= ruleExpression )
            {
            // InternalPortugolParser.g:1809:4: (lv_untilExpr_3_0= ruleExpression )
            // InternalPortugolParser.g:1810:5: lv_untilExpr_3_0= ruleExpression
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
    // InternalPortugolParser.g:1838:1: entryRuleSubprogramParam returns [EObject current=null] : iv_ruleSubprogramParam= ruleSubprogramParam EOF ;
    public final EObject entryRuleSubprogramParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubprogramParam = null;


        try {
            // InternalPortugolParser.g:1838:56: (iv_ruleSubprogramParam= ruleSubprogramParam EOF )
            // InternalPortugolParser.g:1839:2: iv_ruleSubprogramParam= ruleSubprogramParam EOF
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
    // InternalPortugolParser.g:1845:1: ruleSubprogramParam returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= Comma ( (lv_expression_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleSubprogramParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:1851:2: ( ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= Comma ( (lv_expression_2_0= ruleExpression ) ) )* ) )
            // InternalPortugolParser.g:1852:2: ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= Comma ( (lv_expression_2_0= ruleExpression ) ) )* )
            {
            // InternalPortugolParser.g:1852:2: ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= Comma ( (lv_expression_2_0= ruleExpression ) ) )* )
            // InternalPortugolParser.g:1853:3: ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= Comma ( (lv_expression_2_0= ruleExpression ) ) )*
            {
            // InternalPortugolParser.g:1853:3: ( (lv_expression_0_0= ruleExpression ) )
            // InternalPortugolParser.g:1854:4: (lv_expression_0_0= ruleExpression )
            {
            // InternalPortugolParser.g:1854:4: (lv_expression_0_0= ruleExpression )
            // InternalPortugolParser.g:1855:5: lv_expression_0_0= ruleExpression
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

            // InternalPortugolParser.g:1872:3: (otherlv_1= Comma ( (lv_expression_2_0= ruleExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Comma) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPortugolParser.g:1873:4: otherlv_1= Comma ( (lv_expression_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getSubprogramParamAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPortugolParser.g:1877:4: ( (lv_expression_2_0= ruleExpression ) )
            	    // InternalPortugolParser.g:1878:5: (lv_expression_2_0= ruleExpression )
            	    {
            	    // InternalPortugolParser.g:1878:5: (lv_expression_2_0= ruleExpression )
            	    // InternalPortugolParser.g:1879:6: lv_expression_2_0= ruleExpression
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
            	    break loop29;
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
    // InternalPortugolParser.g:1901:1: entryRuleReadCommand returns [EObject current=null] : iv_ruleReadCommand= ruleReadCommand EOF ;
    public final EObject entryRuleReadCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadCommand = null;


        try {
            // InternalPortugolParser.g:1901:52: (iv_ruleReadCommand= ruleReadCommand EOF )
            // InternalPortugolParser.g:1902:2: iv_ruleReadCommand= ruleReadCommand EOF
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
    // InternalPortugolParser.g:1908:1: ruleReadCommand returns [EObject current=null] : (otherlv_0= Leia otherlv_1= LeftParenthesis ( (lv_paramList_2_0= ruleDeclaredVarList ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleReadCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_paramList_2_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:1914:2: ( (otherlv_0= Leia otherlv_1= LeftParenthesis ( (lv_paramList_2_0= ruleDeclaredVarList ) ) otherlv_3= RightParenthesis ) )
            // InternalPortugolParser.g:1915:2: (otherlv_0= Leia otherlv_1= LeftParenthesis ( (lv_paramList_2_0= ruleDeclaredVarList ) ) otherlv_3= RightParenthesis )
            {
            // InternalPortugolParser.g:1915:2: (otherlv_0= Leia otherlv_1= LeftParenthesis ( (lv_paramList_2_0= ruleDeclaredVarList ) ) otherlv_3= RightParenthesis )
            // InternalPortugolParser.g:1916:3: otherlv_0= Leia otherlv_1= LeftParenthesis ( (lv_paramList_2_0= ruleDeclaredVarList ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Leia,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReadCommandAccess().getLeiaKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReadCommandAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalPortugolParser.g:1924:3: ( (lv_paramList_2_0= ruleDeclaredVarList ) )
            // InternalPortugolParser.g:1925:4: (lv_paramList_2_0= ruleDeclaredVarList )
            {
            // InternalPortugolParser.g:1925:4: (lv_paramList_2_0= ruleDeclaredVarList )
            // InternalPortugolParser.g:1926:5: lv_paramList_2_0= ruleDeclaredVarList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReadCommandAccess().getParamListDeclaredVarListParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_14);
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
    // InternalPortugolParser.g:1951:1: entryRuleWriteCommand returns [EObject current=null] : iv_ruleWriteCommand= ruleWriteCommand EOF ;
    public final EObject entryRuleWriteCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteCommand = null;


        try {
            // InternalPortugolParser.g:1951:53: (iv_ruleWriteCommand= ruleWriteCommand EOF )
            // InternalPortugolParser.g:1952:2: iv_ruleWriteCommand= ruleWriteCommand EOF
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
    // InternalPortugolParser.g:1958:1: ruleWriteCommand returns [EObject current=null] : ( ( ( (lv_writeCommand_0_1= Escreva | lv_writeCommand_0_2= Escreval ) ) ) otherlv_1= LeftParenthesis ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleWriteCommand() throws RecognitionException {
        EObject current = null;

        Token lv_writeCommand_0_1=null;
        Token lv_writeCommand_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_writeParam_2_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:1964:2: ( ( ( ( (lv_writeCommand_0_1= Escreva | lv_writeCommand_0_2= Escreval ) ) ) otherlv_1= LeftParenthesis ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= RightParenthesis ) )
            // InternalPortugolParser.g:1965:2: ( ( ( (lv_writeCommand_0_1= Escreva | lv_writeCommand_0_2= Escreval ) ) ) otherlv_1= LeftParenthesis ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= RightParenthesis )
            {
            // InternalPortugolParser.g:1965:2: ( ( ( (lv_writeCommand_0_1= Escreva | lv_writeCommand_0_2= Escreval ) ) ) otherlv_1= LeftParenthesis ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= RightParenthesis )
            // InternalPortugolParser.g:1966:3: ( ( (lv_writeCommand_0_1= Escreva | lv_writeCommand_0_2= Escreval ) ) ) otherlv_1= LeftParenthesis ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= RightParenthesis
            {
            // InternalPortugolParser.g:1966:3: ( ( (lv_writeCommand_0_1= Escreva | lv_writeCommand_0_2= Escreval ) ) )
            // InternalPortugolParser.g:1967:4: ( (lv_writeCommand_0_1= Escreva | lv_writeCommand_0_2= Escreval ) )
            {
            // InternalPortugolParser.g:1967:4: ( (lv_writeCommand_0_1= Escreva | lv_writeCommand_0_2= Escreval ) )
            // InternalPortugolParser.g:1968:5: (lv_writeCommand_0_1= Escreva | lv_writeCommand_0_2= Escreval )
            {
            // InternalPortugolParser.g:1968:5: (lv_writeCommand_0_1= Escreva | lv_writeCommand_0_2= Escreval )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Escreva) ) {
                alt30=1;
            }
            else if ( (LA30_0==Escreval) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalPortugolParser.g:1969:6: lv_writeCommand_0_1= Escreva
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
                    // InternalPortugolParser.g:1980:6: lv_writeCommand_0_2= Escreval
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

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWriteCommandAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalPortugolParser.g:1997:3: ( (lv_writeParam_2_0= ruleWriteParam ) )
            // InternalPortugolParser.g:1998:4: (lv_writeParam_2_0= ruleWriteParam )
            {
            // InternalPortugolParser.g:1998:4: (lv_writeParam_2_0= ruleWriteParam )
            // InternalPortugolParser.g:1999:5: lv_writeParam_2_0= ruleWriteParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWriteCommandAccess().getWriteParamWriteParamParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_14);
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
    // InternalPortugolParser.g:2024:1: entryRuleWriteParam returns [EObject current=null] : iv_ruleWriteParam= ruleWriteParam EOF ;
    public final EObject entryRuleWriteParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteParam = null;


        try {
            // InternalPortugolParser.g:2024:51: (iv_ruleWriteParam= ruleWriteParam EOF )
            // InternalPortugolParser.g:2025:2: iv_ruleWriteParam= ruleWriteParam EOF
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
    // InternalPortugolParser.g:2031:1: ruleWriteParam returns [EObject current=null] : ( ( (lv_params_0_0= ruleSubprogramParam ) ) ( (lv_precision_1_0= ruleOptDecimalPrecision ) )? ) ;
    public final EObject ruleWriteParam() throws RecognitionException {
        EObject current = null;

        EObject lv_params_0_0 = null;

        EObject lv_precision_1_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:2037:2: ( ( ( (lv_params_0_0= ruleSubprogramParam ) ) ( (lv_precision_1_0= ruleOptDecimalPrecision ) )? ) )
            // InternalPortugolParser.g:2038:2: ( ( (lv_params_0_0= ruleSubprogramParam ) ) ( (lv_precision_1_0= ruleOptDecimalPrecision ) )? )
            {
            // InternalPortugolParser.g:2038:2: ( ( (lv_params_0_0= ruleSubprogramParam ) ) ( (lv_precision_1_0= ruleOptDecimalPrecision ) )? )
            // InternalPortugolParser.g:2039:3: ( (lv_params_0_0= ruleSubprogramParam ) ) ( (lv_precision_1_0= ruleOptDecimalPrecision ) )?
            {
            // InternalPortugolParser.g:2039:3: ( (lv_params_0_0= ruleSubprogramParam ) )
            // InternalPortugolParser.g:2040:4: (lv_params_0_0= ruleSubprogramParam )
            {
            // InternalPortugolParser.g:2040:4: (lv_params_0_0= ruleSubprogramParam )
            // InternalPortugolParser.g:2041:5: lv_params_0_0= ruleSubprogramParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWriteParamAccess().getParamsSubprogramParamParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_37);
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

            // InternalPortugolParser.g:2058:3: ( (lv_precision_1_0= ruleOptDecimalPrecision ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Colon) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPortugolParser.g:2059:4: (lv_precision_1_0= ruleOptDecimalPrecision )
                    {
                    // InternalPortugolParser.g:2059:4: (lv_precision_1_0= ruleOptDecimalPrecision )
                    // InternalPortugolParser.g:2060:5: lv_precision_1_0= ruleOptDecimalPrecision
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
    // InternalPortugolParser.g:2081:1: entryRuleOptDecimalPrecision returns [EObject current=null] : iv_ruleOptDecimalPrecision= ruleOptDecimalPrecision EOF ;
    public final EObject entryRuleOptDecimalPrecision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptDecimalPrecision = null;


        try {
            // InternalPortugolParser.g:2081:60: (iv_ruleOptDecimalPrecision= ruleOptDecimalPrecision EOF )
            // InternalPortugolParser.g:2082:2: iv_ruleOptDecimalPrecision= ruleOptDecimalPrecision EOF
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
    // InternalPortugolParser.g:2088:1: ruleOptDecimalPrecision returns [EObject current=null] : (otherlv_0= Colon ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= Colon ( (lv_secondPrecision_3_0= RULE_INT ) ) )? ) ;
    public final EObject ruleOptDecimalPrecision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_firstPrecision_1_0=null;
        Token otherlv_2=null;
        Token lv_secondPrecision_3_0=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:2094:2: ( (otherlv_0= Colon ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= Colon ( (lv_secondPrecision_3_0= RULE_INT ) ) )? ) )
            // InternalPortugolParser.g:2095:2: (otherlv_0= Colon ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= Colon ( (lv_secondPrecision_3_0= RULE_INT ) ) )? )
            {
            // InternalPortugolParser.g:2095:2: (otherlv_0= Colon ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= Colon ( (lv_secondPrecision_3_0= RULE_INT ) ) )? )
            // InternalPortugolParser.g:2096:3: otherlv_0= Colon ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= Colon ( (lv_secondPrecision_3_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,Colon,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOptDecimalPrecisionAccess().getColonKeyword_0());
              		
            }
            // InternalPortugolParser.g:2100:3: ( (lv_firstPrecision_1_0= RULE_INT ) )
            // InternalPortugolParser.g:2101:4: (lv_firstPrecision_1_0= RULE_INT )
            {
            // InternalPortugolParser.g:2101:4: (lv_firstPrecision_1_0= RULE_INT )
            // InternalPortugolParser.g:2102:5: lv_firstPrecision_1_0= RULE_INT
            {
            lv_firstPrecision_1_0=(Token)match(input,RULE_INT,FOLLOW_37); if (state.failed) return current;
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

            // InternalPortugolParser.g:2118:3: (otherlv_2= Colon ( (lv_secondPrecision_3_0= RULE_INT ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Colon) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPortugolParser.g:2119:4: otherlv_2= Colon ( (lv_secondPrecision_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,Colon,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOptDecimalPrecisionAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalPortugolParser.g:2123:4: ( (lv_secondPrecision_3_0= RULE_INT ) )
                    // InternalPortugolParser.g:2124:5: (lv_secondPrecision_3_0= RULE_INT )
                    {
                    // InternalPortugolParser.g:2124:5: (lv_secondPrecision_3_0= RULE_INT )
                    // InternalPortugolParser.g:2125:6: lv_secondPrecision_3_0= RULE_INT
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
    // InternalPortugolParser.g:2146:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalPortugolParser.g:2146:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalPortugolParser.g:2147:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalPortugolParser.g:2153:1: ruleExpression returns [EObject current=null] : this_Assignment_0= ruleAssignment ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:2159:2: (this_Assignment_0= ruleAssignment )
            // InternalPortugolParser.g:2160:2: this_Assignment_0= ruleAssignment
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
    // InternalPortugolParser.g:2171:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalPortugolParser.g:2171:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalPortugolParser.g:2172:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalPortugolParser.g:2178:1: ruleAssignment returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression ( ( ( ( () ( ( ruleAssignmentOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAssignmentOperator ) ) ) ) ( (lv_right_3_0= ruleAssignment ) ) )* ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;

        EObject lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:2184:2: ( (this_OrExpression_0= ruleOrExpression ( ( ( ( () ( ( ruleAssignmentOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAssignmentOperator ) ) ) ) ( (lv_right_3_0= ruleAssignment ) ) )* ) )
            // InternalPortugolParser.g:2185:2: (this_OrExpression_0= ruleOrExpression ( ( ( ( () ( ( ruleAssignmentOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAssignmentOperator ) ) ) ) ( (lv_right_3_0= ruleAssignment ) ) )* )
            {
            // InternalPortugolParser.g:2185:2: (this_OrExpression_0= ruleOrExpression ( ( ( ( () ( ( ruleAssignmentOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAssignmentOperator ) ) ) ) ( (lv_right_3_0= ruleAssignment ) ) )* )
            // InternalPortugolParser.g:2186:3: this_OrExpression_0= ruleOrExpression ( ( ( ( () ( ( ruleAssignmentOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAssignmentOperator ) ) ) ) ( (lv_right_3_0= ruleAssignment ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssignmentAccess().getOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugolParser.g:2194:3: ( ( ( ( () ( ( ruleAssignmentOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAssignmentOperator ) ) ) ) ( (lv_right_3_0= ruleAssignment ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==LessThanSignHyphenMinus) ) {
                    int LA33_2 = input.LA(2);

                    if ( (synpred1_InternalPortugolParser()) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // InternalPortugolParser.g:2195:4: ( ( ( () ( ( ruleAssignmentOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAssignmentOperator ) ) ) ) ( (lv_right_3_0= ruleAssignment ) )
            	    {
            	    // InternalPortugolParser.g:2195:4: ( ( ( () ( ( ruleAssignmentOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAssignmentOperator ) ) ) )
            	    // InternalPortugolParser.g:2196:5: ( ( () ( ( ruleAssignmentOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAssignmentOperator ) ) )
            	    {
            	    // InternalPortugolParser.g:2206:5: ( () ( (lv_op_2_0= ruleAssignmentOperator ) ) )
            	    // InternalPortugolParser.g:2207:6: () ( (lv_op_2_0= ruleAssignmentOperator ) )
            	    {
            	    // InternalPortugolParser.g:2207:6: ()
            	    // InternalPortugolParser.g:2208:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAssignmentAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugolParser.g:2214:6: ( (lv_op_2_0= ruleAssignmentOperator ) )
            	    // InternalPortugolParser.g:2215:7: (lv_op_2_0= ruleAssignmentOperator )
            	    {
            	    // InternalPortugolParser.g:2215:7: (lv_op_2_0= ruleAssignmentOperator )
            	    // InternalPortugolParser.g:2216:8: lv_op_2_0= ruleAssignmentOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getAssignmentAccess().getOpAssignmentOperatorParserRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_op_2_0=ruleAssignmentOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	      								}
            	      								set(
            	      									current,
            	      									"op",
            	      									lv_op_2_0,
            	      									"org.hopper.language.Portugol.AssignmentOperator");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalPortugolParser.g:2235:4: ( (lv_right_3_0= ruleAssignment ) )
            	    // InternalPortugolParser.g:2236:5: (lv_right_3_0= ruleAssignment )
            	    {
            	    // InternalPortugolParser.g:2236:5: (lv_right_3_0= ruleAssignment )
            	    // InternalPortugolParser.g:2237:6: lv_right_3_0= ruleAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAssignmentAccess().getRightAssignmentParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
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
            	    break loop33;
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
    // InternalPortugolParser.g:2259:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalPortugolParser.g:2259:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalPortugolParser.g:2260:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalPortugolParser.g:2266:1: ruleOrExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( ( ( ( () ( ( ruleOrOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleOrOperator ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XorExpression_0 = null;

        EObject lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:2272:2: ( (this_XorExpression_0= ruleXorExpression ( ( ( ( () ( ( ruleOrOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleOrOperator ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) )
            // InternalPortugolParser.g:2273:2: (this_XorExpression_0= ruleXorExpression ( ( ( ( () ( ( ruleOrOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleOrOperator ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            {
            // InternalPortugolParser.g:2273:2: (this_XorExpression_0= ruleXorExpression ( ( ( ( () ( ( ruleOrOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleOrOperator ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            // InternalPortugolParser.g:2274:3: this_XorExpression_0= ruleXorExpression ( ( ( ( () ( ( ruleOrOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleOrOperator ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_40);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugolParser.g:2282:3: ( ( ( ( () ( ( ruleOrOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleOrOperator ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==OU) && (synpred2_InternalPortugolParser())) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalPortugolParser.g:2283:4: ( ( ( () ( ( ruleOrOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleOrOperator ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) )
            	    {
            	    // InternalPortugolParser.g:2283:4: ( ( ( () ( ( ruleOrOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleOrOperator ) ) ) )
            	    // InternalPortugolParser.g:2284:5: ( ( () ( ( ruleOrOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleOrOperator ) ) )
            	    {
            	    // InternalPortugolParser.g:2294:5: ( () ( (lv_op_2_0= ruleOrOperator ) ) )
            	    // InternalPortugolParser.g:2295:6: () ( (lv_op_2_0= ruleOrOperator ) )
            	    {
            	    // InternalPortugolParser.g:2295:6: ()
            	    // InternalPortugolParser.g:2296:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getOrExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugolParser.g:2302:6: ( (lv_op_2_0= ruleOrOperator ) )
            	    // InternalPortugolParser.g:2303:7: (lv_op_2_0= ruleOrOperator )
            	    {
            	    // InternalPortugolParser.g:2303:7: (lv_op_2_0= ruleOrOperator )
            	    // InternalPortugolParser.g:2304:8: lv_op_2_0= ruleOrOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getOrExpressionAccess().getOpOrOperatorParserRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_op_2_0=ruleOrOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	      								}
            	      								set(
            	      									current,
            	      									"op",
            	      									lv_op_2_0,
            	      									"org.hopper.language.Portugol.OrOperator");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalPortugolParser.g:2323:4: ( (lv_right_3_0= ruleXorExpression ) )
            	    // InternalPortugolParser.g:2324:5: (lv_right_3_0= ruleXorExpression )
            	    {
            	    // InternalPortugolParser.g:2324:5: (lv_right_3_0= ruleXorExpression )
            	    // InternalPortugolParser.g:2325:6: lv_right_3_0= ruleXorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightXorExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleXorExpression"
    // InternalPortugolParser.g:2347:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalPortugolParser.g:2347:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalPortugolParser.g:2348:2: iv_ruleXorExpression= ruleXorExpression EOF
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
    // InternalPortugolParser.g:2354:1: ruleXorExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( ruleXorOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleXorOperator ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        EObject lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:2360:2: ( (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( ruleXorOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleXorOperator ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalPortugolParser.g:2361:2: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( ruleXorOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleXorOperator ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalPortugolParser.g:2361:2: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( ruleXorOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleXorOperator ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalPortugolParser.g:2362:3: this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( ruleXorOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleXorOperator ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_41);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugolParser.g:2370:3: ( ( ( ( () ( ( ruleXorOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleXorOperator ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==XOU) && (synpred3_InternalPortugolParser())) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalPortugolParser.g:2371:4: ( ( ( () ( ( ruleXorOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleXorOperator ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalPortugolParser.g:2371:4: ( ( ( () ( ( ruleXorOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleXorOperator ) ) ) )
            	    // InternalPortugolParser.g:2372:5: ( ( () ( ( ruleXorOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleXorOperator ) ) )
            	    {
            	    // InternalPortugolParser.g:2382:5: ( () ( (lv_op_2_0= ruleXorOperator ) ) )
            	    // InternalPortugolParser.g:2383:6: () ( (lv_op_2_0= ruleXorOperator ) )
            	    {
            	    // InternalPortugolParser.g:2383:6: ()
            	    // InternalPortugolParser.g:2384:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getXorExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugolParser.g:2390:6: ( (lv_op_2_0= ruleXorOperator ) )
            	    // InternalPortugolParser.g:2391:7: (lv_op_2_0= ruleXorOperator )
            	    {
            	    // InternalPortugolParser.g:2391:7: (lv_op_2_0= ruleXorOperator )
            	    // InternalPortugolParser.g:2392:8: lv_op_2_0= ruleXorOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getXorExpressionAccess().getOpXorOperatorParserRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_op_2_0=ruleXorOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getXorExpressionRule());
            	      								}
            	      								set(
            	      									current,
            	      									"op",
            	      									lv_op_2_0,
            	      									"org.hopper.language.Portugol.XorOperator");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalPortugolParser.g:2411:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalPortugolParser.g:2412:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalPortugolParser.g:2412:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalPortugolParser.g:2413:6: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXorExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
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
            	    break loop35;
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
    // InternalPortugolParser.g:2435:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalPortugolParser.g:2435:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalPortugolParser.g:2436:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalPortugolParser.g:2442:1: ruleAndExpression returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( ( ( () ( ( ruleAndOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAndOperator ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        EObject lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:2448:2: ( (this_Comparison_0= ruleComparison ( ( ( ( () ( ( ruleAndOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAndOperator ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalPortugolParser.g:2449:2: (this_Comparison_0= ruleComparison ( ( ( ( () ( ( ruleAndOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAndOperator ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalPortugolParser.g:2449:2: (this_Comparison_0= ruleComparison ( ( ( ( () ( ( ruleAndOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAndOperator ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalPortugolParser.g:2450:3: this_Comparison_0= ruleComparison ( ( ( ( () ( ( ruleAndOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAndOperator ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_42);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugolParser.g:2458:3: ( ( ( ( () ( ( ruleAndOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAndOperator ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==E) && (synpred4_InternalPortugolParser())) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalPortugolParser.g:2459:4: ( ( ( () ( ( ruleAndOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAndOperator ) ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalPortugolParser.g:2459:4: ( ( ( () ( ( ruleAndOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAndOperator ) ) ) )
            	    // InternalPortugolParser.g:2460:5: ( ( () ( ( ruleAndOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAndOperator ) ) )
            	    {
            	    // InternalPortugolParser.g:2470:5: ( () ( (lv_op_2_0= ruleAndOperator ) ) )
            	    // InternalPortugolParser.g:2471:6: () ( (lv_op_2_0= ruleAndOperator ) )
            	    {
            	    // InternalPortugolParser.g:2471:6: ()
            	    // InternalPortugolParser.g:2472:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAndExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugolParser.g:2478:6: ( (lv_op_2_0= ruleAndOperator ) )
            	    // InternalPortugolParser.g:2479:7: (lv_op_2_0= ruleAndOperator )
            	    {
            	    // InternalPortugolParser.g:2479:7: (lv_op_2_0= ruleAndOperator )
            	    // InternalPortugolParser.g:2480:8: lv_op_2_0= ruleAndOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getAndExpressionAccess().getOpAndOperatorParserRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_op_2_0=ruleAndOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	      								}
            	      								set(
            	      									current,
            	      									"op",
            	      									lv_op_2_0,
            	      									"org.hopper.language.Portugol.AndOperator");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalPortugolParser.g:2499:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalPortugolParser.g:2500:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalPortugolParser.g:2500:5: (lv_right_3_0= ruleComparison )
            	    // InternalPortugolParser.g:2501:6: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleComparison"
    // InternalPortugolParser.g:2523:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalPortugolParser.g:2523:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalPortugolParser.g:2524:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalPortugolParser.g:2530:1: ruleComparison returns [EObject current=null] : (this_EquExpression_0= ruleEquExpression ( ( ( ( () ( ( ruleComparisonOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_EquExpression_0 = null;

        EObject lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:2536:2: ( (this_EquExpression_0= ruleEquExpression ( ( ( ( () ( ( ruleComparisonOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )* ) )
            // InternalPortugolParser.g:2537:2: (this_EquExpression_0= ruleEquExpression ( ( ( ( () ( ( ruleComparisonOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )* )
            {
            // InternalPortugolParser.g:2537:2: (this_EquExpression_0= ruleEquExpression ( ( ( ( () ( ( ruleComparisonOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )* )
            // InternalPortugolParser.g:2538:3: this_EquExpression_0= ruleEquExpression ( ( ( ( () ( ( ruleComparisonOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getEquExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_43);
            this_EquExpression_0=ruleEquExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EquExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugolParser.g:2546:3: ( ( ( ( () ( ( ruleComparisonOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==EqualsSign) && (synpred5_InternalPortugolParser())) {
                    alt37=1;
                }
                else if ( (LA37_0==LessThanSignGreaterThanSign) && (synpred5_InternalPortugolParser())) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalPortugolParser.g:2547:4: ( ( ( () ( ( ruleComparisonOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) )
            	    {
            	    // InternalPortugolParser.g:2547:4: ( ( ( () ( ( ruleComparisonOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ) )
            	    // InternalPortugolParser.g:2548:5: ( ( () ( ( ruleComparisonOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleComparisonOperator ) ) )
            	    {
            	    // InternalPortugolParser.g:2558:5: ( () ( (lv_op_2_0= ruleComparisonOperator ) ) )
            	    // InternalPortugolParser.g:2559:6: () ( (lv_op_2_0= ruleComparisonOperator ) )
            	    {
            	    // InternalPortugolParser.g:2559:6: ()
            	    // InternalPortugolParser.g:2560:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getComparisonAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugolParser.g:2566:6: ( (lv_op_2_0= ruleComparisonOperator ) )
            	    // InternalPortugolParser.g:2567:7: (lv_op_2_0= ruleComparisonOperator )
            	    {
            	    // InternalPortugolParser.g:2567:7: (lv_op_2_0= ruleComparisonOperator )
            	    // InternalPortugolParser.g:2568:8: lv_op_2_0= ruleComparisonOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getComparisonAccess().getOpComparisonOperatorParserRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_op_2_0=ruleComparisonOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      								}
            	      								set(
            	      									current,
            	      									"op",
            	      									lv_op_2_0,
            	      									"org.hopper.language.Portugol.ComparisonOperator");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalPortugolParser.g:2587:4: ( (lv_right_3_0= ruleEquExpression ) )
            	    // InternalPortugolParser.g:2588:5: (lv_right_3_0= ruleEquExpression )
            	    {
            	    // InternalPortugolParser.g:2588:5: (lv_right_3_0= ruleEquExpression )
            	    // InternalPortugolParser.g:2589:6: lv_right_3_0= ruleEquExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightEquExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_43);
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
            	    break loop37;
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
    // InternalPortugolParser.g:2611:1: entryRuleEquExpression returns [EObject current=null] : iv_ruleEquExpression= ruleEquExpression EOF ;
    public final EObject entryRuleEquExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquExpression = null;


        try {
            // InternalPortugolParser.g:2611:54: (iv_ruleEquExpression= ruleEquExpression EOF )
            // InternalPortugolParser.g:2612:2: iv_ruleEquExpression= ruleEquExpression EOF
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
    // InternalPortugolParser.g:2618:1: ruleEquExpression returns [EObject current=null] : (this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ruleEqualityOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleEqualityOperator ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* ) ;
    public final EObject ruleEquExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;

        EObject lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:2624:2: ( (this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ruleEqualityOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleEqualityOperator ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* ) )
            // InternalPortugolParser.g:2625:2: (this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ruleEqualityOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleEqualityOperator ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* )
            {
            // InternalPortugolParser.g:2625:2: (this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ruleEqualityOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleEqualityOperator ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* )
            // InternalPortugolParser.g:2626:3: this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ruleEqualityOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleEqualityOperator ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEquExpressionAccess().getAddExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_44);
            this_AddExpression_0=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AddExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugolParser.g:2634:3: ( ( ( ( () ( ( ruleEqualityOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleEqualityOperator ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )*
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
            	    // InternalPortugolParser.g:2635:4: ( ( ( () ( ( ruleEqualityOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleEqualityOperator ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) )
            	    {
            	    // InternalPortugolParser.g:2635:4: ( ( ( () ( ( ruleEqualityOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleEqualityOperator ) ) ) )
            	    // InternalPortugolParser.g:2636:5: ( ( () ( ( ruleEqualityOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleEqualityOperator ) ) )
            	    {
            	    // InternalPortugolParser.g:2646:5: ( () ( (lv_op_2_0= ruleEqualityOperator ) ) )
            	    // InternalPortugolParser.g:2647:6: () ( (lv_op_2_0= ruleEqualityOperator ) )
            	    {
            	    // InternalPortugolParser.g:2647:6: ()
            	    // InternalPortugolParser.g:2648:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getEquExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugolParser.g:2654:6: ( (lv_op_2_0= ruleEqualityOperator ) )
            	    // InternalPortugolParser.g:2655:7: (lv_op_2_0= ruleEqualityOperator )
            	    {
            	    // InternalPortugolParser.g:2655:7: (lv_op_2_0= ruleEqualityOperator )
            	    // InternalPortugolParser.g:2656:8: lv_op_2_0= ruleEqualityOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getEquExpressionAccess().getOpEqualityOperatorParserRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_op_2_0=ruleEqualityOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getEquExpressionRule());
            	      								}
            	      								set(
            	      									current,
            	      									"op",
            	      									lv_op_2_0,
            	      									"org.hopper.language.Portugol.EqualityOperator");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalPortugolParser.g:2675:4: ( (lv_right_3_0= ruleAddExpression ) )
            	    // InternalPortugolParser.g:2676:5: (lv_right_3_0= ruleAddExpression )
            	    {
            	    // InternalPortugolParser.g:2676:5: (lv_right_3_0= ruleAddExpression )
            	    // InternalPortugolParser.g:2677:6: lv_right_3_0= ruleAddExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEquExpressionAccess().getRightAddExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
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
    // InternalPortugolParser.g:2699:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalPortugolParser.g:2699:54: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalPortugolParser.g:2700:2: iv_ruleAddExpression= ruleAddExpression EOF
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
    // InternalPortugolParser.g:2706:1: ruleAddExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ruleAddOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAddOperator ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:2712:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ruleAddOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAddOperator ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalPortugolParser.g:2713:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ruleAddOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAddOperator ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalPortugolParser.g:2713:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ruleAddOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAddOperator ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalPortugolParser.g:2714:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ruleAddOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAddOperator ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAddExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_45);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugolParser.g:2722:3: ( ( ( ( () ( ( ruleAddOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAddOperator ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==PlusSign) && (synpred7_InternalPortugolParser())) {
                    alt39=1;
                }
                else if ( (LA39_0==HyphenMinus) && (synpred7_InternalPortugolParser())) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalPortugolParser.g:2723:4: ( ( ( () ( ( ruleAddOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAddOperator ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalPortugolParser.g:2723:4: ( ( ( () ( ( ruleAddOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAddOperator ) ) ) )
            	    // InternalPortugolParser.g:2724:5: ( ( () ( ( ruleAddOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleAddOperator ) ) )
            	    {
            	    // InternalPortugolParser.g:2734:5: ( () ( (lv_op_2_0= ruleAddOperator ) ) )
            	    // InternalPortugolParser.g:2735:6: () ( (lv_op_2_0= ruleAddOperator ) )
            	    {
            	    // InternalPortugolParser.g:2735:6: ()
            	    // InternalPortugolParser.g:2736:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAddExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugolParser.g:2742:6: ( (lv_op_2_0= ruleAddOperator ) )
            	    // InternalPortugolParser.g:2743:7: (lv_op_2_0= ruleAddOperator )
            	    {
            	    // InternalPortugolParser.g:2743:7: (lv_op_2_0= ruleAddOperator )
            	    // InternalPortugolParser.g:2744:8: lv_op_2_0= ruleAddOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getAddExpressionAccess().getOpAddOperatorParserRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_op_2_0=ruleAddOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getAddExpressionRule());
            	      								}
            	      								set(
            	      									current,
            	      									"op",
            	      									lv_op_2_0,
            	      									"org.hopper.language.Portugol.AddOperator");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalPortugolParser.g:2763:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalPortugolParser.g:2764:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalPortugolParser.g:2764:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalPortugolParser.g:2765:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAddExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_45);
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
            	    break loop39;
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
    // InternalPortugolParser.g:2787:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalPortugolParser.g:2787:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalPortugolParser.g:2788:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalPortugolParser.g:2794:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_PowerExpression_0= rulePowerExpression ( ( ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleMultiplicativeOperator ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PowerExpression_0 = null;

        EObject lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:2800:2: ( (this_PowerExpression_0= rulePowerExpression ( ( ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleMultiplicativeOperator ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )* ) )
            // InternalPortugolParser.g:2801:2: (this_PowerExpression_0= rulePowerExpression ( ( ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleMultiplicativeOperator ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )* )
            {
            // InternalPortugolParser.g:2801:2: (this_PowerExpression_0= rulePowerExpression ( ( ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleMultiplicativeOperator ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )* )
            // InternalPortugolParser.g:2802:3: this_PowerExpression_0= rulePowerExpression ( ( ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleMultiplicativeOperator ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getPowerExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_46);
            this_PowerExpression_0=rulePowerExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PowerExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugolParser.g:2810:3: ( ( ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleMultiplicativeOperator ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==Asterisk) && (synpred8_InternalPortugolParser())) {
                    alt40=1;
                }
                else if ( (LA40_0==Solidus) && (synpred8_InternalPortugolParser())) {
                    alt40=1;
                }
                else if ( (LA40_0==MOD) && (synpred8_InternalPortugolParser())) {
                    alt40=1;
                }
                else if ( (LA40_0==PercentSign) && (synpred8_InternalPortugolParser())) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPortugolParser.g:2811:4: ( ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleMultiplicativeOperator ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) )
            	    {
            	    // InternalPortugolParser.g:2811:4: ( ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleMultiplicativeOperator ) ) ) )
            	    // InternalPortugolParser.g:2812:5: ( ( () ( ( ruleMultiplicativeOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleMultiplicativeOperator ) ) )
            	    {
            	    // InternalPortugolParser.g:2822:5: ( () ( (lv_op_2_0= ruleMultiplicativeOperator ) ) )
            	    // InternalPortugolParser.g:2823:6: () ( (lv_op_2_0= ruleMultiplicativeOperator ) )
            	    {
            	    // InternalPortugolParser.g:2823:6: ()
            	    // InternalPortugolParser.g:2824:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugolParser.g:2830:6: ( (lv_op_2_0= ruleMultiplicativeOperator ) )
            	    // InternalPortugolParser.g:2831:7: (lv_op_2_0= ruleMultiplicativeOperator )
            	    {
            	    // InternalPortugolParser.g:2831:7: (lv_op_2_0= ruleMultiplicativeOperator )
            	    // InternalPortugolParser.g:2832:8: lv_op_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOpMultiplicativeOperatorParserRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_op_2_0=ruleMultiplicativeOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	      								}
            	      								set(
            	      									current,
            	      									"op",
            	      									lv_op_2_0,
            	      									"org.hopper.language.Portugol.MultiplicativeOperator");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalPortugolParser.g:2851:4: ( (lv_right_3_0= rulePowerExpression ) )
            	    // InternalPortugolParser.g:2852:5: (lv_right_3_0= rulePowerExpression )
            	    {
            	    // InternalPortugolParser.g:2852:5: (lv_right_3_0= rulePowerExpression )
            	    // InternalPortugolParser.g:2853:6: lv_right_3_0= rulePowerExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightPowerExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_46);
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRulePowerExpression"
    // InternalPortugolParser.g:2875:1: entryRulePowerExpression returns [EObject current=null] : iv_rulePowerExpression= rulePowerExpression EOF ;
    public final EObject entryRulePowerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerExpression = null;


        try {
            // InternalPortugolParser.g:2875:56: (iv_rulePowerExpression= rulePowerExpression EOF )
            // InternalPortugolParser.g:2876:2: iv_rulePowerExpression= rulePowerExpression EOF
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
    // InternalPortugolParser.g:2882:1: rulePowerExpression returns [EObject current=null] : (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( rulePowerOperator ) ) ) )=> ( () ( (lv_op_2_0= rulePowerOperator ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* ) ;
    public final EObject rulePowerExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOperation_0 = null;

        EObject lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:2888:2: ( (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( rulePowerOperator ) ) ) )=> ( () ( (lv_op_2_0= rulePowerOperator ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* ) )
            // InternalPortugolParser.g:2889:2: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( rulePowerOperator ) ) ) )=> ( () ( (lv_op_2_0= rulePowerOperator ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* )
            {
            // InternalPortugolParser.g:2889:2: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( rulePowerOperator ) ) ) )=> ( () ( (lv_op_2_0= rulePowerOperator ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* )
            // InternalPortugolParser.g:2890:3: this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( rulePowerOperator ) ) ) )=> ( () ( (lv_op_2_0= rulePowerOperator ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPowerExpressionAccess().getUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_47);
            this_UnaryOperation_0=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugolParser.g:2898:3: ( ( ( ( () ( ( rulePowerOperator ) ) ) )=> ( () ( (lv_op_2_0= rulePowerOperator ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==CircumflexAccent) && (synpred9_InternalPortugolParser())) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPortugolParser.g:2899:4: ( ( ( () ( ( rulePowerOperator ) ) ) )=> ( () ( (lv_op_2_0= rulePowerOperator ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) )
            	    {
            	    // InternalPortugolParser.g:2899:4: ( ( ( () ( ( rulePowerOperator ) ) ) )=> ( () ( (lv_op_2_0= rulePowerOperator ) ) ) )
            	    // InternalPortugolParser.g:2900:5: ( ( () ( ( rulePowerOperator ) ) ) )=> ( () ( (lv_op_2_0= rulePowerOperator ) ) )
            	    {
            	    // InternalPortugolParser.g:2910:5: ( () ( (lv_op_2_0= rulePowerOperator ) ) )
            	    // InternalPortugolParser.g:2911:6: () ( (lv_op_2_0= rulePowerOperator ) )
            	    {
            	    // InternalPortugolParser.g:2911:6: ()
            	    // InternalPortugolParser.g:2912:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getPowerExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugolParser.g:2918:6: ( (lv_op_2_0= rulePowerOperator ) )
            	    // InternalPortugolParser.g:2919:7: (lv_op_2_0= rulePowerOperator )
            	    {
            	    // InternalPortugolParser.g:2919:7: (lv_op_2_0= rulePowerOperator )
            	    // InternalPortugolParser.g:2920:8: lv_op_2_0= rulePowerOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getPowerExpressionAccess().getOpPowerOperatorParserRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_op_2_0=rulePowerOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getPowerExpressionRule());
            	      								}
            	      								set(
            	      									current,
            	      									"op",
            	      									lv_op_2_0,
            	      									"org.hopper.language.Portugol.PowerOperator");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalPortugolParser.g:2939:4: ( (lv_right_3_0= ruleUnaryOperation ) )
            	    // InternalPortugolParser.g:2940:5: (lv_right_3_0= ruleUnaryOperation )
            	    {
            	    // InternalPortugolParser.g:2940:5: (lv_right_3_0= ruleUnaryOperation )
            	    // InternalPortugolParser.g:2941:6: lv_right_3_0= ruleUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPowerExpressionAccess().getRightUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_47);
            	    lv_right_3_0=ruleUnaryOperation();

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
            	      							"org.hopper.language.Portugol.UnaryOperation");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
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


    // $ANTLR start "entryRuleAssignmentOperator"
    // InternalPortugolParser.g:2963:1: entryRuleAssignmentOperator returns [EObject current=null] : iv_ruleAssignmentOperator= ruleAssignmentOperator EOF ;
    public final EObject entryRuleAssignmentOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentOperator = null;


        try {
            // InternalPortugolParser.g:2963:59: (iv_ruleAssignmentOperator= ruleAssignmentOperator EOF )
            // InternalPortugolParser.g:2964:2: iv_ruleAssignmentOperator= ruleAssignmentOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignmentOperator=ruleAssignmentOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentOperator; 
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
    // $ANTLR end "entryRuleAssignmentOperator"


    // $ANTLR start "ruleAssignmentOperator"
    // InternalPortugolParser.g:2970:1: ruleAssignmentOperator returns [EObject current=null] : ( (lv_op_0_0= LessThanSignHyphenMinus ) ) ;
    public final EObject ruleAssignmentOperator() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:2976:2: ( ( (lv_op_0_0= LessThanSignHyphenMinus ) ) )
            // InternalPortugolParser.g:2977:2: ( (lv_op_0_0= LessThanSignHyphenMinus ) )
            {
            // InternalPortugolParser.g:2977:2: ( (lv_op_0_0= LessThanSignHyphenMinus ) )
            // InternalPortugolParser.g:2978:3: (lv_op_0_0= LessThanSignHyphenMinus )
            {
            // InternalPortugolParser.g:2978:3: (lv_op_0_0= LessThanSignHyphenMinus )
            // InternalPortugolParser.g:2979:4: lv_op_0_0= LessThanSignHyphenMinus
            {
            lv_op_0_0=(Token)match(input,LessThanSignHyphenMinus,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_op_0_0, grammarAccess.getAssignmentOperatorAccess().getOpLessThanSignHyphenMinusKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getAssignmentOperatorRule());
              				}
              				setWithLastConsumed(current, "op", lv_op_0_0, "<-");
              			
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
    // $ANTLR end "ruleAssignmentOperator"


    // $ANTLR start "entryRuleOrOperator"
    // InternalPortugolParser.g:2994:1: entryRuleOrOperator returns [EObject current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final EObject entryRuleOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrOperator = null;


        try {
            // InternalPortugolParser.g:2994:51: (iv_ruleOrOperator= ruleOrOperator EOF )
            // InternalPortugolParser.g:2995:2: iv_ruleOrOperator= ruleOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrOperator=ruleOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrOperator; 
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
    // $ANTLR end "entryRuleOrOperator"


    // $ANTLR start "ruleOrOperator"
    // InternalPortugolParser.g:3001:1: ruleOrOperator returns [EObject current=null] : ( (lv_op_0_0= OU ) ) ;
    public final EObject ruleOrOperator() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:3007:2: ( ( (lv_op_0_0= OU ) ) )
            // InternalPortugolParser.g:3008:2: ( (lv_op_0_0= OU ) )
            {
            // InternalPortugolParser.g:3008:2: ( (lv_op_0_0= OU ) )
            // InternalPortugolParser.g:3009:3: (lv_op_0_0= OU )
            {
            // InternalPortugolParser.g:3009:3: (lv_op_0_0= OU )
            // InternalPortugolParser.g:3010:4: lv_op_0_0= OU
            {
            lv_op_0_0=(Token)match(input,OU,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_op_0_0, grammarAccess.getOrOperatorAccess().getOpOUKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getOrOperatorRule());
              				}
              				setWithLastConsumed(current, "op", lv_op_0_0, "OU");
              			
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
    // $ANTLR end "ruleOrOperator"


    // $ANTLR start "entryRuleXorOperator"
    // InternalPortugolParser.g:3025:1: entryRuleXorOperator returns [EObject current=null] : iv_ruleXorOperator= ruleXorOperator EOF ;
    public final EObject entryRuleXorOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorOperator = null;


        try {
            // InternalPortugolParser.g:3025:52: (iv_ruleXorOperator= ruleXorOperator EOF )
            // InternalPortugolParser.g:3026:2: iv_ruleXorOperator= ruleXorOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXorOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXorOperator=ruleXorOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXorOperator; 
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
    // $ANTLR end "entryRuleXorOperator"


    // $ANTLR start "ruleXorOperator"
    // InternalPortugolParser.g:3032:1: ruleXorOperator returns [EObject current=null] : ( (lv_op_0_0= XOU ) ) ;
    public final EObject ruleXorOperator() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:3038:2: ( ( (lv_op_0_0= XOU ) ) )
            // InternalPortugolParser.g:3039:2: ( (lv_op_0_0= XOU ) )
            {
            // InternalPortugolParser.g:3039:2: ( (lv_op_0_0= XOU ) )
            // InternalPortugolParser.g:3040:3: (lv_op_0_0= XOU )
            {
            // InternalPortugolParser.g:3040:3: (lv_op_0_0= XOU )
            // InternalPortugolParser.g:3041:4: lv_op_0_0= XOU
            {
            lv_op_0_0=(Token)match(input,XOU,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_op_0_0, grammarAccess.getXorOperatorAccess().getOpXOUKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getXorOperatorRule());
              				}
              				setWithLastConsumed(current, "op", lv_op_0_0, "XOU");
              			
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
    // $ANTLR end "ruleXorOperator"


    // $ANTLR start "entryRuleAndOperator"
    // InternalPortugolParser.g:3056:1: entryRuleAndOperator returns [EObject current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final EObject entryRuleAndOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperator = null;


        try {
            // InternalPortugolParser.g:3056:52: (iv_ruleAndOperator= ruleAndOperator EOF )
            // InternalPortugolParser.g:3057:2: iv_ruleAndOperator= ruleAndOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndOperator=ruleAndOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndOperator; 
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
    // $ANTLR end "entryRuleAndOperator"


    // $ANTLR start "ruleAndOperator"
    // InternalPortugolParser.g:3063:1: ruleAndOperator returns [EObject current=null] : ( (lv_op_0_0= E ) ) ;
    public final EObject ruleAndOperator() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:3069:2: ( ( (lv_op_0_0= E ) ) )
            // InternalPortugolParser.g:3070:2: ( (lv_op_0_0= E ) )
            {
            // InternalPortugolParser.g:3070:2: ( (lv_op_0_0= E ) )
            // InternalPortugolParser.g:3071:3: (lv_op_0_0= E )
            {
            // InternalPortugolParser.g:3071:3: (lv_op_0_0= E )
            // InternalPortugolParser.g:3072:4: lv_op_0_0= E
            {
            lv_op_0_0=(Token)match(input,E,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_op_0_0, grammarAccess.getAndOperatorAccess().getOpEKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getAndOperatorRule());
              				}
              				setWithLastConsumed(current, "op", lv_op_0_0, "E");
              			
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
    // $ANTLR end "ruleAndOperator"


    // $ANTLR start "entryRuleComparisonOperator"
    // InternalPortugolParser.g:3087:1: entryRuleComparisonOperator returns [EObject current=null] : iv_ruleComparisonOperator= ruleComparisonOperator EOF ;
    public final EObject entryRuleComparisonOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonOperator = null;


        try {
            // InternalPortugolParser.g:3087:59: (iv_ruleComparisonOperator= ruleComparisonOperator EOF )
            // InternalPortugolParser.g:3088:2: iv_ruleComparisonOperator= ruleComparisonOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparisonOperator=ruleComparisonOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonOperator; 
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
    // $ANTLR end "entryRuleComparisonOperator"


    // $ANTLR start "ruleComparisonOperator"
    // InternalPortugolParser.g:3094:1: ruleComparisonOperator returns [EObject current=null] : ( ( (lv_op_0_1= EqualsSign | lv_op_0_2= LessThanSignGreaterThanSign ) ) ) ;
    public final EObject ruleComparisonOperator() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:3100:2: ( ( ( (lv_op_0_1= EqualsSign | lv_op_0_2= LessThanSignGreaterThanSign ) ) ) )
            // InternalPortugolParser.g:3101:2: ( ( (lv_op_0_1= EqualsSign | lv_op_0_2= LessThanSignGreaterThanSign ) ) )
            {
            // InternalPortugolParser.g:3101:2: ( ( (lv_op_0_1= EqualsSign | lv_op_0_2= LessThanSignGreaterThanSign ) ) )
            // InternalPortugolParser.g:3102:3: ( (lv_op_0_1= EqualsSign | lv_op_0_2= LessThanSignGreaterThanSign ) )
            {
            // InternalPortugolParser.g:3102:3: ( (lv_op_0_1= EqualsSign | lv_op_0_2= LessThanSignGreaterThanSign ) )
            // InternalPortugolParser.g:3103:4: (lv_op_0_1= EqualsSign | lv_op_0_2= LessThanSignGreaterThanSign )
            {
            // InternalPortugolParser.g:3103:4: (lv_op_0_1= EqualsSign | lv_op_0_2= LessThanSignGreaterThanSign )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==EqualsSign) ) {
                alt42=1;
            }
            else if ( (LA42_0==LessThanSignGreaterThanSign) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalPortugolParser.g:3104:5: lv_op_0_1= EqualsSign
                    {
                    lv_op_0_1=(Token)match(input,EqualsSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_op_0_1, grammarAccess.getComparisonOperatorAccess().getOpEqualsSignKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComparisonOperatorRule());
                      					}
                      					setWithLastConsumed(current, "op", lv_op_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:3115:5: lv_op_0_2= LessThanSignGreaterThanSign
                    {
                    lv_op_0_2=(Token)match(input,LessThanSignGreaterThanSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_op_0_2, grammarAccess.getComparisonOperatorAccess().getOpLessThanSignGreaterThanSignKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComparisonOperatorRule());
                      					}
                      					setWithLastConsumed(current, "op", lv_op_0_2, null);
                      				
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
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "entryRuleEqualityOperator"
    // InternalPortugolParser.g:3131:1: entryRuleEqualityOperator returns [EObject current=null] : iv_ruleEqualityOperator= ruleEqualityOperator EOF ;
    public final EObject entryRuleEqualityOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityOperator = null;


        try {
            // InternalPortugolParser.g:3131:57: (iv_ruleEqualityOperator= ruleEqualityOperator EOF )
            // InternalPortugolParser.g:3132:2: iv_ruleEqualityOperator= ruleEqualityOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEqualityOperator=ruleEqualityOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualityOperator; 
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
    // $ANTLR end "entryRuleEqualityOperator"


    // $ANTLR start "ruleEqualityOperator"
    // InternalPortugolParser.g:3138:1: ruleEqualityOperator returns [EObject current=null] : ( ( (lv_op_0_1= LessThanSign | lv_op_0_2= GreaterThanSign | lv_op_0_3= LessThanSignEqualsSign | lv_op_0_4= GreaterThanSignEqualsSign ) ) ) ;
    public final EObject ruleEqualityOperator() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;
        Token lv_op_0_3=null;
        Token lv_op_0_4=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:3144:2: ( ( ( (lv_op_0_1= LessThanSign | lv_op_0_2= GreaterThanSign | lv_op_0_3= LessThanSignEqualsSign | lv_op_0_4= GreaterThanSignEqualsSign ) ) ) )
            // InternalPortugolParser.g:3145:2: ( ( (lv_op_0_1= LessThanSign | lv_op_0_2= GreaterThanSign | lv_op_0_3= LessThanSignEqualsSign | lv_op_0_4= GreaterThanSignEqualsSign ) ) )
            {
            // InternalPortugolParser.g:3145:2: ( ( (lv_op_0_1= LessThanSign | lv_op_0_2= GreaterThanSign | lv_op_0_3= LessThanSignEqualsSign | lv_op_0_4= GreaterThanSignEqualsSign ) ) )
            // InternalPortugolParser.g:3146:3: ( (lv_op_0_1= LessThanSign | lv_op_0_2= GreaterThanSign | lv_op_0_3= LessThanSignEqualsSign | lv_op_0_4= GreaterThanSignEqualsSign ) )
            {
            // InternalPortugolParser.g:3146:3: ( (lv_op_0_1= LessThanSign | lv_op_0_2= GreaterThanSign | lv_op_0_3= LessThanSignEqualsSign | lv_op_0_4= GreaterThanSignEqualsSign ) )
            // InternalPortugolParser.g:3147:4: (lv_op_0_1= LessThanSign | lv_op_0_2= GreaterThanSign | lv_op_0_3= LessThanSignEqualsSign | lv_op_0_4= GreaterThanSignEqualsSign )
            {
            // InternalPortugolParser.g:3147:4: (lv_op_0_1= LessThanSign | lv_op_0_2= GreaterThanSign | lv_op_0_3= LessThanSignEqualsSign | lv_op_0_4= GreaterThanSignEqualsSign )
            int alt43=4;
            switch ( input.LA(1) ) {
            case LessThanSign:
                {
                alt43=1;
                }
                break;
            case GreaterThanSign:
                {
                alt43=2;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt43=3;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt43=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalPortugolParser.g:3148:5: lv_op_0_1= LessThanSign
                    {
                    lv_op_0_1=(Token)match(input,LessThanSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_op_0_1, grammarAccess.getEqualityOperatorAccess().getOpLessThanSignKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEqualityOperatorRule());
                      					}
                      					setWithLastConsumed(current, "op", lv_op_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:3159:5: lv_op_0_2= GreaterThanSign
                    {
                    lv_op_0_2=(Token)match(input,GreaterThanSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_op_0_2, grammarAccess.getEqualityOperatorAccess().getOpGreaterThanSignKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEqualityOperatorRule());
                      					}
                      					setWithLastConsumed(current, "op", lv_op_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalPortugolParser.g:3170:5: lv_op_0_3= LessThanSignEqualsSign
                    {
                    lv_op_0_3=(Token)match(input,LessThanSignEqualsSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_op_0_3, grammarAccess.getEqualityOperatorAccess().getOpLessThanSignEqualsSignKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEqualityOperatorRule());
                      					}
                      					setWithLastConsumed(current, "op", lv_op_0_3, null);
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalPortugolParser.g:3181:5: lv_op_0_4= GreaterThanSignEqualsSign
                    {
                    lv_op_0_4=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_op_0_4, grammarAccess.getEqualityOperatorAccess().getOpGreaterThanSignEqualsSignKeyword_0_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEqualityOperatorRule());
                      					}
                      					setWithLastConsumed(current, "op", lv_op_0_4, null);
                      				
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
    // $ANTLR end "ruleEqualityOperator"


    // $ANTLR start "entryRuleAddOperator"
    // InternalPortugolParser.g:3197:1: entryRuleAddOperator returns [EObject current=null] : iv_ruleAddOperator= ruleAddOperator EOF ;
    public final EObject entryRuleAddOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddOperator = null;


        try {
            // InternalPortugolParser.g:3197:52: (iv_ruleAddOperator= ruleAddOperator EOF )
            // InternalPortugolParser.g:3198:2: iv_ruleAddOperator= ruleAddOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddOperator=ruleAddOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddOperator; 
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
    // $ANTLR end "entryRuleAddOperator"


    // $ANTLR start "ruleAddOperator"
    // InternalPortugolParser.g:3204:1: ruleAddOperator returns [EObject current=null] : ( ( (lv_op_0_1= PlusSign | lv_op_0_2= HyphenMinus ) ) ) ;
    public final EObject ruleAddOperator() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:3210:2: ( ( ( (lv_op_0_1= PlusSign | lv_op_0_2= HyphenMinus ) ) ) )
            // InternalPortugolParser.g:3211:2: ( ( (lv_op_0_1= PlusSign | lv_op_0_2= HyphenMinus ) ) )
            {
            // InternalPortugolParser.g:3211:2: ( ( (lv_op_0_1= PlusSign | lv_op_0_2= HyphenMinus ) ) )
            // InternalPortugolParser.g:3212:3: ( (lv_op_0_1= PlusSign | lv_op_0_2= HyphenMinus ) )
            {
            // InternalPortugolParser.g:3212:3: ( (lv_op_0_1= PlusSign | lv_op_0_2= HyphenMinus ) )
            // InternalPortugolParser.g:3213:4: (lv_op_0_1= PlusSign | lv_op_0_2= HyphenMinus )
            {
            // InternalPortugolParser.g:3213:4: (lv_op_0_1= PlusSign | lv_op_0_2= HyphenMinus )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==PlusSign) ) {
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
                    // InternalPortugolParser.g:3214:5: lv_op_0_1= PlusSign
                    {
                    lv_op_0_1=(Token)match(input,PlusSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_op_0_1, grammarAccess.getAddOperatorAccess().getOpPlusSignKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAddOperatorRule());
                      					}
                      					setWithLastConsumed(current, "op", lv_op_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:3225:5: lv_op_0_2= HyphenMinus
                    {
                    lv_op_0_2=(Token)match(input,HyphenMinus,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_op_0_2, grammarAccess.getAddOperatorAccess().getOpHyphenMinusKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAddOperatorRule());
                      					}
                      					setWithLastConsumed(current, "op", lv_op_0_2, null);
                      				
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
    // $ANTLR end "ruleAddOperator"


    // $ANTLR start "entryRuleMultiplicativeOperator"
    // InternalPortugolParser.g:3241:1: entryRuleMultiplicativeOperator returns [EObject current=null] : iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF ;
    public final EObject entryRuleMultiplicativeOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeOperator = null;


        try {
            // InternalPortugolParser.g:3241:63: (iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF )
            // InternalPortugolParser.g:3242:2: iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeOperator=ruleMultiplicativeOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeOperator; 
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
    // $ANTLR end "entryRuleMultiplicativeOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // InternalPortugolParser.g:3248:1: ruleMultiplicativeOperator returns [EObject current=null] : ( ( (lv_op_0_1= Asterisk | lv_op_0_2= Solidus | lv_op_0_3= MOD | lv_op_0_4= PercentSign ) ) ) ;
    public final EObject ruleMultiplicativeOperator() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;
        Token lv_op_0_3=null;
        Token lv_op_0_4=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:3254:2: ( ( ( (lv_op_0_1= Asterisk | lv_op_0_2= Solidus | lv_op_0_3= MOD | lv_op_0_4= PercentSign ) ) ) )
            // InternalPortugolParser.g:3255:2: ( ( (lv_op_0_1= Asterisk | lv_op_0_2= Solidus | lv_op_0_3= MOD | lv_op_0_4= PercentSign ) ) )
            {
            // InternalPortugolParser.g:3255:2: ( ( (lv_op_0_1= Asterisk | lv_op_0_2= Solidus | lv_op_0_3= MOD | lv_op_0_4= PercentSign ) ) )
            // InternalPortugolParser.g:3256:3: ( (lv_op_0_1= Asterisk | lv_op_0_2= Solidus | lv_op_0_3= MOD | lv_op_0_4= PercentSign ) )
            {
            // InternalPortugolParser.g:3256:3: ( (lv_op_0_1= Asterisk | lv_op_0_2= Solidus | lv_op_0_3= MOD | lv_op_0_4= PercentSign ) )
            // InternalPortugolParser.g:3257:4: (lv_op_0_1= Asterisk | lv_op_0_2= Solidus | lv_op_0_3= MOD | lv_op_0_4= PercentSign )
            {
            // InternalPortugolParser.g:3257:4: (lv_op_0_1= Asterisk | lv_op_0_2= Solidus | lv_op_0_3= MOD | lv_op_0_4= PercentSign )
            int alt45=4;
            switch ( input.LA(1) ) {
            case Asterisk:
                {
                alt45=1;
                }
                break;
            case Solidus:
                {
                alt45=2;
                }
                break;
            case MOD:
                {
                alt45=3;
                }
                break;
            case PercentSign:
                {
                alt45=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalPortugolParser.g:3258:5: lv_op_0_1= Asterisk
                    {
                    lv_op_0_1=(Token)match(input,Asterisk,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_op_0_1, grammarAccess.getMultiplicativeOperatorAccess().getOpAsteriskKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMultiplicativeOperatorRule());
                      					}
                      					setWithLastConsumed(current, "op", lv_op_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:3269:5: lv_op_0_2= Solidus
                    {
                    lv_op_0_2=(Token)match(input,Solidus,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_op_0_2, grammarAccess.getMultiplicativeOperatorAccess().getOpSolidusKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMultiplicativeOperatorRule());
                      					}
                      					setWithLastConsumed(current, "op", lv_op_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalPortugolParser.g:3280:5: lv_op_0_3= MOD
                    {
                    lv_op_0_3=(Token)match(input,MOD,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_op_0_3, grammarAccess.getMultiplicativeOperatorAccess().getOpMODKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMultiplicativeOperatorRule());
                      					}
                      					setWithLastConsumed(current, "op", lv_op_0_3, null);
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalPortugolParser.g:3291:5: lv_op_0_4= PercentSign
                    {
                    lv_op_0_4=(Token)match(input,PercentSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_op_0_4, grammarAccess.getMultiplicativeOperatorAccess().getOpPercentSignKeyword_0_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMultiplicativeOperatorRule());
                      					}
                      					setWithLastConsumed(current, "op", lv_op_0_4, null);
                      				
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
    // $ANTLR end "ruleMultiplicativeOperator"


    // $ANTLR start "entryRulePowerOperator"
    // InternalPortugolParser.g:3307:1: entryRulePowerOperator returns [EObject current=null] : iv_rulePowerOperator= rulePowerOperator EOF ;
    public final EObject entryRulePowerOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerOperator = null;


        try {
            // InternalPortugolParser.g:3307:54: (iv_rulePowerOperator= rulePowerOperator EOF )
            // InternalPortugolParser.g:3308:2: iv_rulePowerOperator= rulePowerOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPowerOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePowerOperator=rulePowerOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePowerOperator; 
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
    // $ANTLR end "entryRulePowerOperator"


    // $ANTLR start "rulePowerOperator"
    // InternalPortugolParser.g:3314:1: rulePowerOperator returns [EObject current=null] : ( (lv_op_0_0= CircumflexAccent ) ) ;
    public final EObject rulePowerOperator() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:3320:2: ( ( (lv_op_0_0= CircumflexAccent ) ) )
            // InternalPortugolParser.g:3321:2: ( (lv_op_0_0= CircumflexAccent ) )
            {
            // InternalPortugolParser.g:3321:2: ( (lv_op_0_0= CircumflexAccent ) )
            // InternalPortugolParser.g:3322:3: (lv_op_0_0= CircumflexAccent )
            {
            // InternalPortugolParser.g:3322:3: (lv_op_0_0= CircumflexAccent )
            // InternalPortugolParser.g:3323:4: lv_op_0_0= CircumflexAccent
            {
            lv_op_0_0=(Token)match(input,CircumflexAccent,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_op_0_0, grammarAccess.getPowerOperatorAccess().getOpCircumflexAccentKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getPowerOperatorRule());
              				}
              				setWithLastConsumed(current, "op", lv_op_0_0, "^");
              			
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
    // $ANTLR end "rulePowerOperator"


    // $ANTLR start "entryRuleNotOperator"
    // InternalPortugolParser.g:3338:1: entryRuleNotOperator returns [EObject current=null] : iv_ruleNotOperator= ruleNotOperator EOF ;
    public final EObject entryRuleNotOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOperator = null;


        try {
            // InternalPortugolParser.g:3338:52: (iv_ruleNotOperator= ruleNotOperator EOF )
            // InternalPortugolParser.g:3339:2: iv_ruleNotOperator= ruleNotOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNotOperator=ruleNotOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOperator; 
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
    // $ANTLR end "entryRuleNotOperator"


    // $ANTLR start "ruleNotOperator"
    // InternalPortugolParser.g:3345:1: ruleNotOperator returns [EObject current=null] : ( ( (lv_op_0_1= NAO | lv_op_0_2= HyphenMinus ) ) ) ;
    public final EObject ruleNotOperator() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:3351:2: ( ( ( (lv_op_0_1= NAO | lv_op_0_2= HyphenMinus ) ) ) )
            // InternalPortugolParser.g:3352:2: ( ( (lv_op_0_1= NAO | lv_op_0_2= HyphenMinus ) ) )
            {
            // InternalPortugolParser.g:3352:2: ( ( (lv_op_0_1= NAO | lv_op_0_2= HyphenMinus ) ) )
            // InternalPortugolParser.g:3353:3: ( (lv_op_0_1= NAO | lv_op_0_2= HyphenMinus ) )
            {
            // InternalPortugolParser.g:3353:3: ( (lv_op_0_1= NAO | lv_op_0_2= HyphenMinus ) )
            // InternalPortugolParser.g:3354:4: (lv_op_0_1= NAO | lv_op_0_2= HyphenMinus )
            {
            // InternalPortugolParser.g:3354:4: (lv_op_0_1= NAO | lv_op_0_2= HyphenMinus )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==NAO) ) {
                alt46=1;
            }
            else if ( (LA46_0==HyphenMinus) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalPortugolParser.g:3355:5: lv_op_0_1= NAO
                    {
                    lv_op_0_1=(Token)match(input,NAO,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_op_0_1, grammarAccess.getNotOperatorAccess().getOpNAOKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getNotOperatorRule());
                      					}
                      					setWithLastConsumed(current, "op", lv_op_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:3366:5: lv_op_0_2= HyphenMinus
                    {
                    lv_op_0_2=(Token)match(input,HyphenMinus,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_op_0_2, grammarAccess.getNotOperatorAccess().getOpHyphenMinusKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getNotOperatorRule());
                      					}
                      					setWithLastConsumed(current, "op", lv_op_0_2, null);
                      				
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
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "entryRuleUnaryOperation"
    // InternalPortugolParser.g:3382:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // InternalPortugolParser.g:3382:55: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // InternalPortugolParser.g:3383:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryOperation=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperation; 
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
    // $ANTLR end "entryRuleUnaryOperation"


    // $ANTLR start "ruleUnaryOperation"
    // InternalPortugolParser.g:3389:1: ruleUnaryOperation returns [EObject current=null] : ( ( () ( (lv_op_1_0= ruleNotOperator ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_op_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_PrimaryExpression_3 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:3395:2: ( ( ( () ( (lv_op_1_0= ruleNotOperator ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) )
            // InternalPortugolParser.g:3396:2: ( ( () ( (lv_op_1_0= ruleNotOperator ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            {
            // InternalPortugolParser.g:3396:2: ( ( () ( (lv_op_1_0= ruleNotOperator ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==NAO||LA47_0==HyphenMinus) ) {
                alt47=1;
            }
            else if ( (LA47_0==Verdadeiro||LA47_0==Maiusc||(LA47_0>=Compr && LA47_0<=Copia)||LA47_0==Falso||LA47_0==Raizq||LA47_0==Pi||LA47_0==LeftParenthesis||(LA47_0>=RULE_INT && LA47_0<=RULE_STRING)) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalPortugolParser.g:3397:3: ( () ( (lv_op_1_0= ruleNotOperator ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) )
                    {
                    // InternalPortugolParser.g:3397:3: ( () ( (lv_op_1_0= ruleNotOperator ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) )
                    // InternalPortugolParser.g:3398:4: () ( (lv_op_1_0= ruleNotOperator ) ) ( (lv_operand_2_0= ruleUnaryOperation ) )
                    {
                    // InternalPortugolParser.g:3398:4: ()
                    // InternalPortugolParser.g:3399:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryOperationAccess().getUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPortugolParser.g:3405:4: ( (lv_op_1_0= ruleNotOperator ) )
                    // InternalPortugolParser.g:3406:5: (lv_op_1_0= ruleNotOperator )
                    {
                    // InternalPortugolParser.g:3406:5: (lv_op_1_0= ruleNotOperator )
                    // InternalPortugolParser.g:3407:6: lv_op_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryOperationAccess().getOpNotOperatorParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_op_1_0=ruleNotOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
                      						}
                      						set(
                      							current,
                      							"op",
                      							lv_op_1_0,
                      							"org.hopper.language.Portugol.NotOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalPortugolParser.g:3424:4: ( (lv_operand_2_0= ruleUnaryOperation ) )
                    // InternalPortugolParser.g:3425:5: (lv_operand_2_0= ruleUnaryOperation )
                    {
                    // InternalPortugolParser.g:3425:5: (lv_operand_2_0= ruleUnaryOperation )
                    // InternalPortugolParser.g:3426:6: lv_operand_2_0= ruleUnaryOperation
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryOperationAccess().getOperandUnaryOperationParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_2_0=ruleUnaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
                      						}
                      						set(
                      							current,
                      							"operand",
                      							lv_operand_2_0,
                      							"org.hopper.language.Portugol.UnaryOperation");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:3445:3: this_PrimaryExpression_3= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryOperationAccess().getPrimaryExpressionParserRuleCall_1());
                      		
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
    // $ANTLR end "ruleUnaryOperation"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalPortugolParser.g:3457:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalPortugolParser.g:3457:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalPortugolParser.g:3458:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalPortugolParser.g:3464:1: rulePrimaryExpression returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_PreDefinedFunctionCall_1= rulePreDefinedFunctionCall | this_FunctionCall_2= ruleFunctionCall | this_DeclaredVar_3= ruleDeclaredVar | (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis ) ) ;
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
            // InternalPortugolParser.g:3470:2: ( (this_Literal_0= ruleLiteral | this_PreDefinedFunctionCall_1= rulePreDefinedFunctionCall | this_FunctionCall_2= ruleFunctionCall | this_DeclaredVar_3= ruleDeclaredVar | (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis ) ) )
            // InternalPortugolParser.g:3471:2: (this_Literal_0= ruleLiteral | this_PreDefinedFunctionCall_1= rulePreDefinedFunctionCall | this_FunctionCall_2= ruleFunctionCall | this_DeclaredVar_3= ruleDeclaredVar | (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis ) )
            {
            // InternalPortugolParser.g:3471:2: (this_Literal_0= ruleLiteral | this_PreDefinedFunctionCall_1= rulePreDefinedFunctionCall | this_FunctionCall_2= ruleFunctionCall | this_DeclaredVar_3= ruleDeclaredVar | (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis ) )
            int alt48=5;
            switch ( input.LA(1) ) {
            case Verdadeiro:
            case Falso:
            case Pi:
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_STRING:
                {
                alt48=1;
                }
                break;
            case Maiusc:
            case Compr:
            case Copia:
            case Raizq:
                {
                alt48=2;
                }
                break;
            case RULE_ID:
                {
                int LA48_3 = input.LA(2);

                if ( (LA48_3==EOF||LA48_3==Entao||LA48_3==Passo||LA48_3==Faca||LA48_3==MOD||(LA48_3>=XOU && LA48_3<=Ate)||(LA48_3>=LessThanSignHyphenMinus && LA48_3<=De)||LA48_3==PercentSign||(LA48_3>=RightParenthesis && LA48_3<=CircumflexAccent)) ) {
                    alt48=4;
                }
                else if ( (LA48_3==LeftParenthesis) ) {
                    alt48=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 3, input);

                    throw nvae;
                }
                }
                break;
            case LeftParenthesis:
                {
                alt48=5;
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
                    // InternalPortugolParser.g:3472:3: this_Literal_0= ruleLiteral
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
                    // InternalPortugolParser.g:3481:3: this_PreDefinedFunctionCall_1= rulePreDefinedFunctionCall
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
                    // InternalPortugolParser.g:3490:3: this_FunctionCall_2= ruleFunctionCall
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
                    // InternalPortugolParser.g:3499:3: this_DeclaredVar_3= ruleDeclaredVar
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
                    // InternalPortugolParser.g:3508:3: (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis )
                    {
                    // InternalPortugolParser.g:3508:3: (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis )
                    // InternalPortugolParser.g:3509:4: otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis
                    {
                    otherlv_4=(Token)match(input,LeftParenthesis,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_14);
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
    // InternalPortugolParser.g:3530:1: entryRulePreDefinedFunctionCall returns [EObject current=null] : iv_rulePreDefinedFunctionCall= rulePreDefinedFunctionCall EOF ;
    public final EObject entryRulePreDefinedFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreDefinedFunctionCall = null;


        try {
            // InternalPortugolParser.g:3530:63: (iv_rulePreDefinedFunctionCall= rulePreDefinedFunctionCall EOF )
            // InternalPortugolParser.g:3531:2: iv_rulePreDefinedFunctionCall= rulePreDefinedFunctionCall EOF
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
    // InternalPortugolParser.g:3537:1: rulePreDefinedFunctionCall returns [EObject current=null] : ( ( (lv_preDefFunctionName_0_0= rulePredefineFunctions ) ) otherlv_1= LeftParenthesis ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= RightParenthesis ) ;
    public final EObject rulePreDefinedFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_preDefFunctionName_0_0 = null;

        EObject lv_param_2_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:3543:2: ( ( ( (lv_preDefFunctionName_0_0= rulePredefineFunctions ) ) otherlv_1= LeftParenthesis ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= RightParenthesis ) )
            // InternalPortugolParser.g:3544:2: ( ( (lv_preDefFunctionName_0_0= rulePredefineFunctions ) ) otherlv_1= LeftParenthesis ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= RightParenthesis )
            {
            // InternalPortugolParser.g:3544:2: ( ( (lv_preDefFunctionName_0_0= rulePredefineFunctions ) ) otherlv_1= LeftParenthesis ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= RightParenthesis )
            // InternalPortugolParser.g:3545:3: ( (lv_preDefFunctionName_0_0= rulePredefineFunctions ) ) otherlv_1= LeftParenthesis ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= RightParenthesis
            {
            // InternalPortugolParser.g:3545:3: ( (lv_preDefFunctionName_0_0= rulePredefineFunctions ) )
            // InternalPortugolParser.g:3546:4: (lv_preDefFunctionName_0_0= rulePredefineFunctions )
            {
            // InternalPortugolParser.g:3546:4: (lv_preDefFunctionName_0_0= rulePredefineFunctions )
            // InternalPortugolParser.g:3547:5: lv_preDefFunctionName_0_0= rulePredefineFunctions
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

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPreDefinedFunctionCallAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalPortugolParser.g:3568:3: ( (lv_param_2_0= ruleSubprogramParam ) )
            // InternalPortugolParser.g:3569:4: (lv_param_2_0= ruleSubprogramParam )
            {
            // InternalPortugolParser.g:3569:4: (lv_param_2_0= ruleSubprogramParam )
            // InternalPortugolParser.g:3570:5: lv_param_2_0= ruleSubprogramParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPreDefinedFunctionCallAccess().getParamSubprogramParamParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_14);
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
    // InternalPortugolParser.g:3595:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalPortugolParser.g:3595:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalPortugolParser.g:3596:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalPortugolParser.g:3602:1: ruleFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_param_3_0= ruleSubprogramParam ) ) otherlv_4= RightParenthesis ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_param_3_0 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:3608:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_param_3_0= ruleSubprogramParam ) ) otherlv_4= RightParenthesis ) )
            // InternalPortugolParser.g:3609:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_param_3_0= ruleSubprogramParam ) ) otherlv_4= RightParenthesis )
            {
            // InternalPortugolParser.g:3609:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_param_3_0= ruleSubprogramParam ) ) otherlv_4= RightParenthesis )
            // InternalPortugolParser.g:3610:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( (lv_param_3_0= ruleSubprogramParam ) ) otherlv_4= RightParenthesis
            {
            // InternalPortugolParser.g:3610:3: ()
            // InternalPortugolParser.g:3611:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFunctionCallAccess().getFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalPortugolParser.g:3617:3: ( (otherlv_1= RULE_ID ) )
            // InternalPortugolParser.g:3618:4: (otherlv_1= RULE_ID )
            {
            // InternalPortugolParser.g:3618:4: (otherlv_1= RULE_ID )
            // InternalPortugolParser.g:3619:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionCallRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getFbNameFunctionNameCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPortugolParser.g:3634:3: ( (lv_param_3_0= ruleSubprogramParam ) )
            // InternalPortugolParser.g:3635:4: (lv_param_3_0= ruleSubprogramParam )
            {
            // InternalPortugolParser.g:3635:4: (lv_param_3_0= ruleSubprogramParam )
            // InternalPortugolParser.g:3636:5: lv_param_3_0= ruleSubprogramParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionCallAccess().getParamSubprogramParamParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_param_3_0=ruleSubprogramParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionCallRule());
              					}
              					set(
              						current,
              						"param",
              						lv_param_3_0,
              						"org.hopper.language.Portugol.SubprogramParam");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_4());
              		
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
    // InternalPortugolParser.g:3661:1: entryRulePredefineFunctions returns [String current=null] : iv_rulePredefineFunctions= rulePredefineFunctions EOF ;
    public final String entryRulePredefineFunctions() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePredefineFunctions = null;


        try {
            // InternalPortugolParser.g:3661:58: (iv_rulePredefineFunctions= rulePredefineFunctions EOF )
            // InternalPortugolParser.g:3662:2: iv_rulePredefineFunctions= rulePredefineFunctions EOF
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
    // InternalPortugolParser.g:3668:1: rulePredefineFunctions returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Maiusc | kw= Compr | kw= Raizq | kw= Copia ) ;
    public final AntlrDatatypeRuleToken rulePredefineFunctions() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:3674:2: ( (kw= Maiusc | kw= Compr | kw= Raizq | kw= Copia ) )
            // InternalPortugolParser.g:3675:2: (kw= Maiusc | kw= Compr | kw= Raizq | kw= Copia )
            {
            // InternalPortugolParser.g:3675:2: (kw= Maiusc | kw= Compr | kw= Raizq | kw= Copia )
            int alt49=4;
            switch ( input.LA(1) ) {
            case Maiusc:
                {
                alt49=1;
                }
                break;
            case Compr:
                {
                alt49=2;
                }
                break;
            case Raizq:
                {
                alt49=3;
                }
                break;
            case Copia:
                {
                alt49=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalPortugolParser.g:3676:3: kw= Maiusc
                    {
                    kw=(Token)match(input,Maiusc,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPredefineFunctionsAccess().getMaiuscKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:3682:3: kw= Compr
                    {
                    kw=(Token)match(input,Compr,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPredefineFunctionsAccess().getComprKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPortugolParser.g:3688:3: kw= Raizq
                    {
                    kw=(Token)match(input,Raizq,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPredefineFunctionsAccess().getRaizqKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPortugolParser.g:3694:3: kw= Copia
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
    // InternalPortugolParser.g:3703:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalPortugolParser.g:3703:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalPortugolParser.g:3704:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalPortugolParser.g:3710:1: ruleLiteral returns [EObject current=null] : (this_NumericLiteral_0= ruleNumericLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NumericLiteral_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_BooleanLiteral_2 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:3716:2: ( (this_NumericLiteral_0= ruleNumericLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral ) )
            // InternalPortugolParser.g:3717:2: (this_NumericLiteral_0= ruleNumericLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral )
            {
            // InternalPortugolParser.g:3717:2: (this_NumericLiteral_0= ruleNumericLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral )
            int alt50=3;
            switch ( input.LA(1) ) {
            case Pi:
            case RULE_INT:
            case RULE_FLOAT:
                {
                alt50=1;
                }
                break;
            case RULE_STRING:
                {
                alt50=2;
                }
                break;
            case Verdadeiro:
            case Falso:
                {
                alt50=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalPortugolParser.g:3718:3: this_NumericLiteral_0= ruleNumericLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getNumericLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumericLiteral_0=ruleNumericLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumericLiteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:3727:3: this_StringLiteral_1= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringLiteral_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPortugolParser.g:3736:3: this_BooleanLiteral_2= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_2=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanLiteral_2;
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
    // InternalPortugolParser.g:3748:1: entryRuleDeclaredVar returns [EObject current=null] : iv_ruleDeclaredVar= ruleDeclaredVar EOF ;
    public final EObject entryRuleDeclaredVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredVar = null;


        try {
            // InternalPortugolParser.g:3748:52: (iv_ruleDeclaredVar= ruleDeclaredVar EOF )
            // InternalPortugolParser.g:3749:2: iv_ruleDeclaredVar= ruleDeclaredVar EOF
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
    // InternalPortugolParser.g:3755:1: ruleDeclaredVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDeclaredVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:3761:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalPortugolParser.g:3762:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalPortugolParser.g:3762:2: ( (otherlv_0= RULE_ID ) )
            // InternalPortugolParser.g:3763:3: (otherlv_0= RULE_ID )
            {
            // InternalPortugolParser.g:3763:3: (otherlv_0= RULE_ID )
            // InternalPortugolParser.g:3764:4: otherlv_0= RULE_ID
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


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalPortugolParser.g:3778:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalPortugolParser.g:3778:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalPortugolParser.g:3779:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalPortugolParser.g:3785:1: ruleBooleanLiteral returns [EObject current=null] : ( ( (lv_value_0_1= Verdadeiro | lv_value_0_2= Falso ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:3791:2: ( ( ( (lv_value_0_1= Verdadeiro | lv_value_0_2= Falso ) ) ) )
            // InternalPortugolParser.g:3792:2: ( ( (lv_value_0_1= Verdadeiro | lv_value_0_2= Falso ) ) )
            {
            // InternalPortugolParser.g:3792:2: ( ( (lv_value_0_1= Verdadeiro | lv_value_0_2= Falso ) ) )
            // InternalPortugolParser.g:3793:3: ( (lv_value_0_1= Verdadeiro | lv_value_0_2= Falso ) )
            {
            // InternalPortugolParser.g:3793:3: ( (lv_value_0_1= Verdadeiro | lv_value_0_2= Falso ) )
            // InternalPortugolParser.g:3794:4: (lv_value_0_1= Verdadeiro | lv_value_0_2= Falso )
            {
            // InternalPortugolParser.g:3794:4: (lv_value_0_1= Verdadeiro | lv_value_0_2= Falso )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==Verdadeiro) ) {
                alt51=1;
            }
            else if ( (LA51_0==Falso) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalPortugolParser.g:3795:5: lv_value_0_1= Verdadeiro
                    {
                    lv_value_0_1=(Token)match(input,Verdadeiro,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_value_0_1, grammarAccess.getBooleanLiteralAccess().getValueVerdadeiroKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBooleanLiteralRule());
                      					}
                      					setWithLastConsumed(current, "value", lv_value_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:3806:5: lv_value_0_2= Falso
                    {
                    lv_value_0_2=(Token)match(input,Falso,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_value_0_2, grammarAccess.getBooleanLiteralAccess().getValueFalsoKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBooleanLiteralRule());
                      					}
                      					setWithLastConsumed(current, "value", lv_value_0_2, null);
                      				
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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleNumericLiteral"
    // InternalPortugolParser.g:3822:1: entryRuleNumericLiteral returns [EObject current=null] : iv_ruleNumericLiteral= ruleNumericLiteral EOF ;
    public final EObject entryRuleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteral = null;


        try {
            // InternalPortugolParser.g:3822:55: (iv_ruleNumericLiteral= ruleNumericLiteral EOF )
            // InternalPortugolParser.g:3823:2: iv_ruleNumericLiteral= ruleNumericLiteral EOF
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
    // InternalPortugolParser.g:3829:1: ruleNumericLiteral returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_FloatLiteral_1= ruleFloatLiteral | this_PiLiteral_2= rulePiLiteral ) ;
    public final EObject ruleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteral_0 = null;

        EObject this_FloatLiteral_1 = null;

        EObject this_PiLiteral_2 = null;



        	enterRule();

        try {
            // InternalPortugolParser.g:3835:2: ( (this_IntLiteral_0= ruleIntLiteral | this_FloatLiteral_1= ruleFloatLiteral | this_PiLiteral_2= rulePiLiteral ) )
            // InternalPortugolParser.g:3836:2: (this_IntLiteral_0= ruleIntLiteral | this_FloatLiteral_1= ruleFloatLiteral | this_PiLiteral_2= rulePiLiteral )
            {
            // InternalPortugolParser.g:3836:2: (this_IntLiteral_0= ruleIntLiteral | this_FloatLiteral_1= ruleFloatLiteral | this_PiLiteral_2= rulePiLiteral )
            int alt52=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt52=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt52=2;
                }
                break;
            case Pi:
                {
                alt52=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalPortugolParser.g:3837:3: this_IntLiteral_0= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumericLiteralAccess().getIntLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntLiteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:3846:3: this_FloatLiteral_1= ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumericLiteralAccess().getFloatLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FloatLiteral_1=ruleFloatLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FloatLiteral_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPortugolParser.g:3855:3: this_PiLiteral_2= rulePiLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNumericLiteralAccess().getPiLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PiLiteral_2=rulePiLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PiLiteral_2;
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
    // $ANTLR end "ruleNumericLiteral"


    // $ANTLR start "entryRuleFloatLiteral"
    // InternalPortugolParser.g:3867:1: entryRuleFloatLiteral returns [EObject current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final EObject entryRuleFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatLiteral = null;


        try {
            // InternalPortugolParser.g:3867:53: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // InternalPortugolParser.g:3868:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFloatLiteral=ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatLiteral; 
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
    // $ANTLR end "entryRuleFloatLiteral"


    // $ANTLR start "ruleFloatLiteral"
    // InternalPortugolParser.g:3874:1: ruleFloatLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:3880:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalPortugolParser.g:3881:2: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalPortugolParser.g:3881:2: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalPortugolParser.g:3882:3: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalPortugolParser.g:3882:3: (lv_value_0_0= RULE_FLOAT )
            // InternalPortugolParser.g:3883:4: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getFloatLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.hopper.language.Portugol.FLOAT");
              			
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
    // $ANTLR end "ruleFloatLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalPortugolParser.g:3902:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalPortugolParser.g:3902:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalPortugolParser.g:3903:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalPortugolParser.g:3909:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:3915:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalPortugolParser.g:3916:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalPortugolParser.g:3916:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalPortugolParser.g:3917:3: (lv_value_0_0= RULE_INT )
            {
            // InternalPortugolParser.g:3917:3: (lv_value_0_0= RULE_INT )
            // InternalPortugolParser.g:3918:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getIntLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.eclipse.xtext.common.Terminals.INT");
              			
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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalPortugolParser.g:3937:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalPortugolParser.g:3937:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalPortugolParser.g:3938:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalPortugolParser.g:3944:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:3950:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalPortugolParser.g:3951:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalPortugolParser.g:3951:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalPortugolParser.g:3952:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalPortugolParser.g:3952:3: (lv_value_0_0= RULE_STRING )
            // InternalPortugolParser.g:3953:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getStringLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRulePiLiteral"
    // InternalPortugolParser.g:3972:1: entryRulePiLiteral returns [EObject current=null] : iv_rulePiLiteral= rulePiLiteral EOF ;
    public final EObject entryRulePiLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePiLiteral = null;


        try {
            // InternalPortugolParser.g:3972:50: (iv_rulePiLiteral= rulePiLiteral EOF )
            // InternalPortugolParser.g:3973:2: iv_rulePiLiteral= rulePiLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPiLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePiLiteral=rulePiLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePiLiteral; 
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
    // InternalPortugolParser.g:3979:1: rulePiLiteral returns [EObject current=null] : ( (lv_value_0_0= Pi ) ) ;
    public final EObject rulePiLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:3985:2: ( ( (lv_value_0_0= Pi ) ) )
            // InternalPortugolParser.g:3986:2: ( (lv_value_0_0= Pi ) )
            {
            // InternalPortugolParser.g:3986:2: ( (lv_value_0_0= Pi ) )
            // InternalPortugolParser.g:3987:3: (lv_value_0_0= Pi )
            {
            // InternalPortugolParser.g:3987:3: (lv_value_0_0= Pi )
            // InternalPortugolParser.g:3988:4: lv_value_0_0= Pi
            {
            lv_value_0_0=(Token)match(input,Pi,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getPiLiteralAccess().getValuePiKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getPiLiteralRule());
              				}
              				setWithLastConsumed(current, "value", lv_value_0_0, "pi");
              			
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
    // $ANTLR end "rulePiLiteral"


    // $ANTLR start "entryRuleEND_COMMAND"
    // InternalPortugolParser.g:4003:1: entryRuleEND_COMMAND returns [String current=null] : iv_ruleEND_COMMAND= ruleEND_COMMAND EOF ;
    public final String entryRuleEND_COMMAND() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEND_COMMAND = null;


        try {
            // InternalPortugolParser.g:4003:51: (iv_ruleEND_COMMAND= ruleEND_COMMAND EOF )
            // InternalPortugolParser.g:4004:2: iv_ruleEND_COMMAND= ruleEND_COMMAND EOF
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
    // InternalPortugolParser.g:4010:1: ruleEND_COMMAND returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Semicolon ;
    public final AntlrDatatypeRuleToken ruleEND_COMMAND() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPortugolParser.g:4016:2: (kw= Semicolon )
            // InternalPortugolParser.g:4017:2: kw= Semicolon
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
        // InternalPortugolParser.g:2196:5: ( ( () ( ( ruleAssignmentOperator ) ) ) )
        // InternalPortugolParser.g:2196:6: ( () ( ( ruleAssignmentOperator ) ) )
        {
        // InternalPortugolParser.g:2196:6: ( () ( ( ruleAssignmentOperator ) ) )
        // InternalPortugolParser.g:2197:6: () ( ( ruleAssignmentOperator ) )
        {
        // InternalPortugolParser.g:2197:6: ()
        // InternalPortugolParser.g:2198:6: 
        {
        }

        // InternalPortugolParser.g:2199:6: ( ( ruleAssignmentOperator ) )
        // InternalPortugolParser.g:2200:7: ( ruleAssignmentOperator )
        {
        // InternalPortugolParser.g:2200:7: ( ruleAssignmentOperator )
        // InternalPortugolParser.g:2201:8: ruleAssignmentOperator
        {
        pushFollow(FOLLOW_2);
        ruleAssignmentOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalPortugolParser

    // $ANTLR start synpred2_InternalPortugolParser
    public final void synpred2_InternalPortugolParser_fragment() throws RecognitionException {   
        // InternalPortugolParser.g:2284:5: ( ( () ( ( ruleOrOperator ) ) ) )
        // InternalPortugolParser.g:2284:6: ( () ( ( ruleOrOperator ) ) )
        {
        // InternalPortugolParser.g:2284:6: ( () ( ( ruleOrOperator ) ) )
        // InternalPortugolParser.g:2285:6: () ( ( ruleOrOperator ) )
        {
        // InternalPortugolParser.g:2285:6: ()
        // InternalPortugolParser.g:2286:6: 
        {
        }

        // InternalPortugolParser.g:2287:6: ( ( ruleOrOperator ) )
        // InternalPortugolParser.g:2288:7: ( ruleOrOperator )
        {
        // InternalPortugolParser.g:2288:7: ( ruleOrOperator )
        // InternalPortugolParser.g:2289:8: ruleOrOperator
        {
        pushFollow(FOLLOW_2);
        ruleOrOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalPortugolParser

    // $ANTLR start synpred3_InternalPortugolParser
    public final void synpred3_InternalPortugolParser_fragment() throws RecognitionException {   
        // InternalPortugolParser.g:2372:5: ( ( () ( ( ruleXorOperator ) ) ) )
        // InternalPortugolParser.g:2372:6: ( () ( ( ruleXorOperator ) ) )
        {
        // InternalPortugolParser.g:2372:6: ( () ( ( ruleXorOperator ) ) )
        // InternalPortugolParser.g:2373:6: () ( ( ruleXorOperator ) )
        {
        // InternalPortugolParser.g:2373:6: ()
        // InternalPortugolParser.g:2374:6: 
        {
        }

        // InternalPortugolParser.g:2375:6: ( ( ruleXorOperator ) )
        // InternalPortugolParser.g:2376:7: ( ruleXorOperator )
        {
        // InternalPortugolParser.g:2376:7: ( ruleXorOperator )
        // InternalPortugolParser.g:2377:8: ruleXorOperator
        {
        pushFollow(FOLLOW_2);
        ruleXorOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalPortugolParser

    // $ANTLR start synpred4_InternalPortugolParser
    public final void synpred4_InternalPortugolParser_fragment() throws RecognitionException {   
        // InternalPortugolParser.g:2460:5: ( ( () ( ( ruleAndOperator ) ) ) )
        // InternalPortugolParser.g:2460:6: ( () ( ( ruleAndOperator ) ) )
        {
        // InternalPortugolParser.g:2460:6: ( () ( ( ruleAndOperator ) ) )
        // InternalPortugolParser.g:2461:6: () ( ( ruleAndOperator ) )
        {
        // InternalPortugolParser.g:2461:6: ()
        // InternalPortugolParser.g:2462:6: 
        {
        }

        // InternalPortugolParser.g:2463:6: ( ( ruleAndOperator ) )
        // InternalPortugolParser.g:2464:7: ( ruleAndOperator )
        {
        // InternalPortugolParser.g:2464:7: ( ruleAndOperator )
        // InternalPortugolParser.g:2465:8: ruleAndOperator
        {
        pushFollow(FOLLOW_2);
        ruleAndOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalPortugolParser

    // $ANTLR start synpred5_InternalPortugolParser
    public final void synpred5_InternalPortugolParser_fragment() throws RecognitionException {   
        // InternalPortugolParser.g:2548:5: ( ( () ( ( ruleComparisonOperator ) ) ) )
        // InternalPortugolParser.g:2548:6: ( () ( ( ruleComparisonOperator ) ) )
        {
        // InternalPortugolParser.g:2548:6: ( () ( ( ruleComparisonOperator ) ) )
        // InternalPortugolParser.g:2549:6: () ( ( ruleComparisonOperator ) )
        {
        // InternalPortugolParser.g:2549:6: ()
        // InternalPortugolParser.g:2550:6: 
        {
        }

        // InternalPortugolParser.g:2551:6: ( ( ruleComparisonOperator ) )
        // InternalPortugolParser.g:2552:7: ( ruleComparisonOperator )
        {
        // InternalPortugolParser.g:2552:7: ( ruleComparisonOperator )
        // InternalPortugolParser.g:2553:8: ruleComparisonOperator
        {
        pushFollow(FOLLOW_2);
        ruleComparisonOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalPortugolParser

    // $ANTLR start synpred6_InternalPortugolParser
    public final void synpred6_InternalPortugolParser_fragment() throws RecognitionException {   
        // InternalPortugolParser.g:2636:5: ( ( () ( ( ruleEqualityOperator ) ) ) )
        // InternalPortugolParser.g:2636:6: ( () ( ( ruleEqualityOperator ) ) )
        {
        // InternalPortugolParser.g:2636:6: ( () ( ( ruleEqualityOperator ) ) )
        // InternalPortugolParser.g:2637:6: () ( ( ruleEqualityOperator ) )
        {
        // InternalPortugolParser.g:2637:6: ()
        // InternalPortugolParser.g:2638:6: 
        {
        }

        // InternalPortugolParser.g:2639:6: ( ( ruleEqualityOperator ) )
        // InternalPortugolParser.g:2640:7: ( ruleEqualityOperator )
        {
        // InternalPortugolParser.g:2640:7: ( ruleEqualityOperator )
        // InternalPortugolParser.g:2641:8: ruleEqualityOperator
        {
        pushFollow(FOLLOW_2);
        ruleEqualityOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalPortugolParser

    // $ANTLR start synpred7_InternalPortugolParser
    public final void synpred7_InternalPortugolParser_fragment() throws RecognitionException {   
        // InternalPortugolParser.g:2724:5: ( ( () ( ( ruleAddOperator ) ) ) )
        // InternalPortugolParser.g:2724:6: ( () ( ( ruleAddOperator ) ) )
        {
        // InternalPortugolParser.g:2724:6: ( () ( ( ruleAddOperator ) ) )
        // InternalPortugolParser.g:2725:6: () ( ( ruleAddOperator ) )
        {
        // InternalPortugolParser.g:2725:6: ()
        // InternalPortugolParser.g:2726:6: 
        {
        }

        // InternalPortugolParser.g:2727:6: ( ( ruleAddOperator ) )
        // InternalPortugolParser.g:2728:7: ( ruleAddOperator )
        {
        // InternalPortugolParser.g:2728:7: ( ruleAddOperator )
        // InternalPortugolParser.g:2729:8: ruleAddOperator
        {
        pushFollow(FOLLOW_2);
        ruleAddOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalPortugolParser

    // $ANTLR start synpred8_InternalPortugolParser
    public final void synpred8_InternalPortugolParser_fragment() throws RecognitionException {   
        // InternalPortugolParser.g:2812:5: ( ( () ( ( ruleMultiplicativeOperator ) ) ) )
        // InternalPortugolParser.g:2812:6: ( () ( ( ruleMultiplicativeOperator ) ) )
        {
        // InternalPortugolParser.g:2812:6: ( () ( ( ruleMultiplicativeOperator ) ) )
        // InternalPortugolParser.g:2813:6: () ( ( ruleMultiplicativeOperator ) )
        {
        // InternalPortugolParser.g:2813:6: ()
        // InternalPortugolParser.g:2814:6: 
        {
        }

        // InternalPortugolParser.g:2815:6: ( ( ruleMultiplicativeOperator ) )
        // InternalPortugolParser.g:2816:7: ( ruleMultiplicativeOperator )
        {
        // InternalPortugolParser.g:2816:7: ( ruleMultiplicativeOperator )
        // InternalPortugolParser.g:2817:8: ruleMultiplicativeOperator
        {
        pushFollow(FOLLOW_2);
        ruleMultiplicativeOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalPortugolParser

    // $ANTLR start synpred9_InternalPortugolParser
    public final void synpred9_InternalPortugolParser_fragment() throws RecognitionException {   
        // InternalPortugolParser.g:2900:5: ( ( () ( ( rulePowerOperator ) ) ) )
        // InternalPortugolParser.g:2900:6: ( () ( ( rulePowerOperator ) ) )
        {
        // InternalPortugolParser.g:2900:6: ( () ( ( rulePowerOperator ) ) )
        // InternalPortugolParser.g:2901:6: () ( ( rulePowerOperator ) )
        {
        // InternalPortugolParser.g:2901:6: ()
        // InternalPortugolParser.g:2902:6: 
        {
        }

        // InternalPortugolParser.g:2903:6: ( ( rulePowerOperator ) )
        // InternalPortugolParser.g:2904:7: ( rulePowerOperator )
        {
        // InternalPortugolParser.g:2904:7: ( rulePowerOperator )
        // InternalPortugolParser.g:2905:8: rulePowerOperator
        {
        pushFollow(FOLLOW_2);
        rulePowerOperator();

        state._fsp--;
        if (state.failed) return ;

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000200001800040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000010002209000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000200001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x10B004C4BC4F0600L,0x00000000000001E0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x10B004C4BC4F2600L,0x00000000000001E0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x10B004C4BC4F0610L,0x00000000000001E0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x10B004C4BC4F0620L,0x00000000000001E0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x10900404B4000400L,0x00000000000001E0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x10B004CDBC4F0600L,0x00000000000001E0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x10B004C5BC4F0600L,0x00000000000001E0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000004100L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x10B004C4BC4F0602L,0x00000000000001E0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x10B004C4BC5F0600L,0x00000000000001E0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x10B004C4BC4F0680L,0x00000000000001E0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x10B014C4BC4F0600L,0x00000000000001E0L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002800000000002L,0x0000000000000005L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1400000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x2240020000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});

}