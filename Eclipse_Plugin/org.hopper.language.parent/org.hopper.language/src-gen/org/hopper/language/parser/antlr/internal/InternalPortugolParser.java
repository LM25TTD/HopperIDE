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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'algoritmo'", "'var'", "':'", "','", "'real'", "'inteiro'", "'caractere'", "'caracter'", "'funcao'", "'('", "')'", "'inicio'", "'fimfuncao'", "'procedimento'", "'fimprocedimento'", "'fimalgoritmo'", "'se'", "'entao'", "'senao'", "'fimse'", "'escolha'", "'fimescolha'", "'caso'", "'interrompa'", "'outrocaso'", "'para'", "'de'", "'ate'", "'passo'", "'faca'", "'fimpara'", "'enquanto'", "'fimenquanto'", "'repita'", "'leia'", "'escreva'", "'escreval'", "'<-'", "'OU'", "'XOU'", "'&'", "'E'", "'='", "'<>'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'MOD'", "'%'", "'^'", "'NOT'", "';'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=7;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPortugolParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPortugolParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPortugolParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPortugol.g"; }



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
    // InternalPortugol.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalPortugol.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalPortugol.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalPortugol.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_header_0_0= ruleHeaderBlock ) ) ( (lv_globalDeclarations_1_0= ruleDeclarationsBlock ) ) ( (lv_subprograms_2_0= ruleSubprograms ) )? ( (lv_commands_3_0= ruleBlockCommand ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_header_0_0 = null;

        EObject lv_globalDeclarations_1_0 = null;

        EObject lv_subprograms_2_0 = null;

        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:77:2: ( ( ( (lv_header_0_0= ruleHeaderBlock ) ) ( (lv_globalDeclarations_1_0= ruleDeclarationsBlock ) ) ( (lv_subprograms_2_0= ruleSubprograms ) )? ( (lv_commands_3_0= ruleBlockCommand ) ) ) )
            // InternalPortugol.g:78:2: ( ( (lv_header_0_0= ruleHeaderBlock ) ) ( (lv_globalDeclarations_1_0= ruleDeclarationsBlock ) ) ( (lv_subprograms_2_0= ruleSubprograms ) )? ( (lv_commands_3_0= ruleBlockCommand ) ) )
            {
            // InternalPortugol.g:78:2: ( ( (lv_header_0_0= ruleHeaderBlock ) ) ( (lv_globalDeclarations_1_0= ruleDeclarationsBlock ) ) ( (lv_subprograms_2_0= ruleSubprograms ) )? ( (lv_commands_3_0= ruleBlockCommand ) ) )
            // InternalPortugol.g:79:3: ( (lv_header_0_0= ruleHeaderBlock ) ) ( (lv_globalDeclarations_1_0= ruleDeclarationsBlock ) ) ( (lv_subprograms_2_0= ruleSubprograms ) )? ( (lv_commands_3_0= ruleBlockCommand ) )
            {
            // InternalPortugol.g:79:3: ( (lv_header_0_0= ruleHeaderBlock ) )
            // InternalPortugol.g:80:4: (lv_header_0_0= ruleHeaderBlock )
            {
            // InternalPortugol.g:80:4: (lv_header_0_0= ruleHeaderBlock )
            // InternalPortugol.g:81:5: lv_header_0_0= ruleHeaderBlock
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

            // InternalPortugol.g:98:3: ( (lv_globalDeclarations_1_0= ruleDeclarationsBlock ) )
            // InternalPortugol.g:99:4: (lv_globalDeclarations_1_0= ruleDeclarationsBlock )
            {
            // InternalPortugol.g:99:4: (lv_globalDeclarations_1_0= ruleDeclarationsBlock )
            // InternalPortugol.g:100:5: lv_globalDeclarations_1_0= ruleDeclarationsBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelAccess().getGlobalDeclarationsDeclarationsBlockParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
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

            // InternalPortugol.g:117:3: ( (lv_subprograms_2_0= ruleSubprograms ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20||LA1_0==25) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPortugol.g:118:4: (lv_subprograms_2_0= ruleSubprograms )
                    {
                    // InternalPortugol.g:118:4: (lv_subprograms_2_0= ruleSubprograms )
                    // InternalPortugol.g:119:5: lv_subprograms_2_0= ruleSubprograms
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getModelAccess().getSubprogramsSubprogramsParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_4);
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

            // InternalPortugol.g:136:3: ( (lv_commands_3_0= ruleBlockCommand ) )
            // InternalPortugol.g:137:4: (lv_commands_3_0= ruleBlockCommand )
            {
            // InternalPortugol.g:137:4: (lv_commands_3_0= ruleBlockCommand )
            // InternalPortugol.g:138:5: lv_commands_3_0= ruleBlockCommand
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
    // InternalPortugol.g:159:1: entryRuleHeaderBlock returns [EObject current=null] : iv_ruleHeaderBlock= ruleHeaderBlock EOF ;
    public final EObject entryRuleHeaderBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderBlock = null;


        try {
            // InternalPortugol.g:159:52: (iv_ruleHeaderBlock= ruleHeaderBlock EOF )
            // InternalPortugol.g:160:2: iv_ruleHeaderBlock= ruleHeaderBlock EOF
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
    // InternalPortugol.g:166:1: ruleHeaderBlock returns [EObject current=null] : (otherlv_0= 'algoritmo' ( (lv_algorithmName_1_0= RULE_STRING ) ) ruleEND_COMMAND ) ;
    public final EObject ruleHeaderBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_algorithmName_1_0=null;


        	enterRule();

        try {
            // InternalPortugol.g:172:2: ( (otherlv_0= 'algoritmo' ( (lv_algorithmName_1_0= RULE_STRING ) ) ruleEND_COMMAND ) )
            // InternalPortugol.g:173:2: (otherlv_0= 'algoritmo' ( (lv_algorithmName_1_0= RULE_STRING ) ) ruleEND_COMMAND )
            {
            // InternalPortugol.g:173:2: (otherlv_0= 'algoritmo' ( (lv_algorithmName_1_0= RULE_STRING ) ) ruleEND_COMMAND )
            // InternalPortugol.g:174:3: otherlv_0= 'algoritmo' ( (lv_algorithmName_1_0= RULE_STRING ) ) ruleEND_COMMAND
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getHeaderBlockAccess().getAlgoritmoKeyword_0());
              		
            }
            // InternalPortugol.g:178:3: ( (lv_algorithmName_1_0= RULE_STRING ) )
            // InternalPortugol.g:179:4: (lv_algorithmName_1_0= RULE_STRING )
            {
            // InternalPortugol.g:179:4: (lv_algorithmName_1_0= RULE_STRING )
            // InternalPortugol.g:180:5: lv_algorithmName_1_0= RULE_STRING
            {
            lv_algorithmName_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); if (state.failed) return current;
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
    // InternalPortugol.g:207:1: entryRuleDeclarationsBlock returns [EObject current=null] : iv_ruleDeclarationsBlock= ruleDeclarationsBlock EOF ;
    public final EObject entryRuleDeclarationsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarationsBlock = null;


        try {
            // InternalPortugol.g:207:58: (iv_ruleDeclarationsBlock= ruleDeclarationsBlock EOF )
            // InternalPortugol.g:208:2: iv_ruleDeclarationsBlock= ruleDeclarationsBlock EOF
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
    // InternalPortugol.g:214:1: ruleDeclarationsBlock returns [EObject current=null] : (otherlv_0= 'var' ( ( (lv_vars_1_0= ruleVariable ) ) ruleEND_COMMAND )+ ) ;
    public final EObject ruleDeclarationsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_vars_1_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:220:2: ( (otherlv_0= 'var' ( ( (lv_vars_1_0= ruleVariable ) ) ruleEND_COMMAND )+ ) )
            // InternalPortugol.g:221:2: (otherlv_0= 'var' ( ( (lv_vars_1_0= ruleVariable ) ) ruleEND_COMMAND )+ )
            {
            // InternalPortugol.g:221:2: (otherlv_0= 'var' ( ( (lv_vars_1_0= ruleVariable ) ) ruleEND_COMMAND )+ )
            // InternalPortugol.g:222:3: otherlv_0= 'var' ( ( (lv_vars_1_0= ruleVariable ) ) ruleEND_COMMAND )+
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDeclarationsBlockAccess().getVarKeyword_0());
              		
            }
            // InternalPortugol.g:226:3: ( ( (lv_vars_1_0= ruleVariable ) ) ruleEND_COMMAND )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPortugol.g:227:4: ( (lv_vars_1_0= ruleVariable ) ) ruleEND_COMMAND
            	    {
            	    // InternalPortugol.g:227:4: ( (lv_vars_1_0= ruleVariable ) )
            	    // InternalPortugol.g:228:5: (lv_vars_1_0= ruleVariable )
            	    {
            	    // InternalPortugol.g:228:5: (lv_vars_1_0= ruleVariable )
            	    // InternalPortugol.g:229:6: lv_vars_1_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDeclarationsBlockAccess().getVarsVariableParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
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
            	    pushFollow(FOLLOW_8);
            	    ruleEND_COMMAND();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // InternalPortugol.g:258:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalPortugol.g:258:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalPortugol.g:259:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalPortugol.g:265:1: ruleVariable returns [EObject current=null] : ( ( (lv_varDeclaration_0_0= ruleVarDeclaration ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_varDeclaration_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:271:2: ( ( ( (lv_varDeclaration_0_0= ruleVarDeclaration ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) ) )
            // InternalPortugol.g:272:2: ( ( (lv_varDeclaration_0_0= ruleVarDeclaration ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) )
            {
            // InternalPortugol.g:272:2: ( ( (lv_varDeclaration_0_0= ruleVarDeclaration ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) )
            // InternalPortugol.g:273:3: ( (lv_varDeclaration_0_0= ruleVarDeclaration ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) )
            {
            // InternalPortugol.g:273:3: ( (lv_varDeclaration_0_0= ruleVarDeclaration ) )
            // InternalPortugol.g:274:4: (lv_varDeclaration_0_0= ruleVarDeclaration )
            {
            // InternalPortugol.g:274:4: (lv_varDeclaration_0_0= ruleVarDeclaration )
            // InternalPortugol.g:275:5: lv_varDeclaration_0_0= ruleVarDeclaration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableAccess().getVarDeclarationVarDeclarationParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_9);
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

            otherlv_1=(Token)match(input,14,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getColonKeyword_1());
              		
            }
            // InternalPortugol.g:296:3: ( (lv_type_2_0= ruleVarType ) )
            // InternalPortugol.g:297:4: (lv_type_2_0= ruleVarType )
            {
            // InternalPortugol.g:297:4: (lv_type_2_0= ruleVarType )
            // InternalPortugol.g:298:5: lv_type_2_0= ruleVarType
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
    // InternalPortugol.g:319:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalPortugol.g:319:55: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalPortugol.g:320:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
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
    // InternalPortugol.g:326:1: ruleVarDeclaration returns [EObject current=null] : ( ( (lv_vars_0_0= ruleVarName ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVarName ) ) )* ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_vars_0_0 = null;

        EObject lv_vars_2_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:332:2: ( ( ( (lv_vars_0_0= ruleVarName ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVarName ) ) )* ) )
            // InternalPortugol.g:333:2: ( ( (lv_vars_0_0= ruleVarName ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVarName ) ) )* )
            {
            // InternalPortugol.g:333:2: ( ( (lv_vars_0_0= ruleVarName ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVarName ) ) )* )
            // InternalPortugol.g:334:3: ( (lv_vars_0_0= ruleVarName ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVarName ) ) )*
            {
            // InternalPortugol.g:334:3: ( (lv_vars_0_0= ruleVarName ) )
            // InternalPortugol.g:335:4: (lv_vars_0_0= ruleVarName )
            {
            // InternalPortugol.g:335:4: (lv_vars_0_0= ruleVarName )
            // InternalPortugol.g:336:5: lv_vars_0_0= ruleVarName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarDeclarationAccess().getVarsVarNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_11);
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

            // InternalPortugol.g:353:3: (otherlv_1= ',' ( (lv_vars_2_0= ruleVarName ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPortugol.g:354:4: otherlv_1= ',' ( (lv_vars_2_0= ruleVarName ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getVarDeclarationAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPortugol.g:358:4: ( (lv_vars_2_0= ruleVarName ) )
            	    // InternalPortugol.g:359:5: (lv_vars_2_0= ruleVarName )
            	    {
            	    // InternalPortugol.g:359:5: (lv_vars_2_0= ruleVarName )
            	    // InternalPortugol.g:360:6: lv_vars_2_0= ruleVarName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getVarDeclarationAccess().getVarsVarNameParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
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
            	    break loop3;
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
    // InternalPortugol.g:382:1: entryRuleDeclaredVarList returns [EObject current=null] : iv_ruleDeclaredVarList= ruleDeclaredVarList EOF ;
    public final EObject entryRuleDeclaredVarList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredVarList = null;


        try {
            // InternalPortugol.g:382:56: (iv_ruleDeclaredVarList= ruleDeclaredVarList EOF )
            // InternalPortugol.g:383:2: iv_ruleDeclaredVarList= ruleDeclaredVarList EOF
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
    // InternalPortugol.g:389:1: ruleDeclaredVarList returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleDeclaredVarList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPortugol.g:395:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalPortugol.g:396:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalPortugol.g:396:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // InternalPortugol.g:397:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalPortugol.g:397:3: ( (otherlv_0= RULE_ID ) )
            // InternalPortugol.g:398:4: (otherlv_0= RULE_ID )
            {
            // InternalPortugol.g:398:4: (otherlv_0= RULE_ID )
            // InternalPortugol.g:399:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDeclaredVarListRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDeclaredVarListAccess().getVarsVarNameCrossReference_0_0());
              				
            }

            }


            }

            // InternalPortugol.g:410:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPortugol.g:411:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDeclaredVarListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPortugol.g:415:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalPortugol.g:416:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalPortugol.g:416:5: (otherlv_2= RULE_ID )
            	    // InternalPortugol.g:417:6: otherlv_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDeclaredVarListRule());
            	      						}
            	      					
            	    }
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getDeclaredVarListAccess().getVarsVarNameCrossReference_1_1_0());
            	      					
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
    // $ANTLR end "ruleDeclaredVarList"


    // $ANTLR start "entryRuleVarName"
    // InternalPortugol.g:433:1: entryRuleVarName returns [EObject current=null] : iv_ruleVarName= ruleVarName EOF ;
    public final EObject entryRuleVarName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarName = null;


        try {
            // InternalPortugol.g:433:48: (iv_ruleVarName= ruleVarName EOF )
            // InternalPortugol.g:434:2: iv_ruleVarName= ruleVarName EOF
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
    // InternalPortugol.g:440:1: ruleVarName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVarName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPortugol.g:446:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPortugol.g:447:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPortugol.g:447:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPortugol.g:448:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPortugol.g:448:3: (lv_name_0_0= RULE_ID )
            // InternalPortugol.g:449:4: lv_name_0_0= RULE_ID
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
    // InternalPortugol.g:468:1: entryRuleVarType returns [EObject current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final EObject entryRuleVarType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarType = null;


        try {
            // InternalPortugol.g:468:48: (iv_ruleVarType= ruleVarType EOF )
            // InternalPortugol.g:469:2: iv_ruleVarType= ruleVarType EOF
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
    // InternalPortugol.g:475:1: ruleVarType returns [EObject current=null] : ( ( (lv_typeName_0_1= 'real' | lv_typeName_0_2= 'inteiro' | lv_typeName_0_3= 'caractere' | lv_typeName_0_4= 'caracter' ) ) ) ;
    public final EObject ruleVarType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;
        Token lv_typeName_0_4=null;


        	enterRule();

        try {
            // InternalPortugol.g:481:2: ( ( ( (lv_typeName_0_1= 'real' | lv_typeName_0_2= 'inteiro' | lv_typeName_0_3= 'caractere' | lv_typeName_0_4= 'caracter' ) ) ) )
            // InternalPortugol.g:482:2: ( ( (lv_typeName_0_1= 'real' | lv_typeName_0_2= 'inteiro' | lv_typeName_0_3= 'caractere' | lv_typeName_0_4= 'caracter' ) ) )
            {
            // InternalPortugol.g:482:2: ( ( (lv_typeName_0_1= 'real' | lv_typeName_0_2= 'inteiro' | lv_typeName_0_3= 'caractere' | lv_typeName_0_4= 'caracter' ) ) )
            // InternalPortugol.g:483:3: ( (lv_typeName_0_1= 'real' | lv_typeName_0_2= 'inteiro' | lv_typeName_0_3= 'caractere' | lv_typeName_0_4= 'caracter' ) )
            {
            // InternalPortugol.g:483:3: ( (lv_typeName_0_1= 'real' | lv_typeName_0_2= 'inteiro' | lv_typeName_0_3= 'caractere' | lv_typeName_0_4= 'caracter' ) )
            // InternalPortugol.g:484:4: (lv_typeName_0_1= 'real' | lv_typeName_0_2= 'inteiro' | lv_typeName_0_3= 'caractere' | lv_typeName_0_4= 'caracter' )
            {
            // InternalPortugol.g:484:4: (lv_typeName_0_1= 'real' | lv_typeName_0_2= 'inteiro' | lv_typeName_0_3= 'caractere' | lv_typeName_0_4= 'caracter' )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 19:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalPortugol.g:485:5: lv_typeName_0_1= 'real'
                    {
                    lv_typeName_0_1=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
                    // InternalPortugol.g:496:5: lv_typeName_0_2= 'inteiro'
                    {
                    lv_typeName_0_2=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
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
                    // InternalPortugol.g:507:5: lv_typeName_0_3= 'caractere'
                    {
                    lv_typeName_0_3=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
                    // InternalPortugol.g:518:5: lv_typeName_0_4= 'caracter'
                    {
                    lv_typeName_0_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
    // InternalPortugol.g:534:1: entryRuleSubprograms returns [EObject current=null] : iv_ruleSubprograms= ruleSubprograms EOF ;
    public final EObject entryRuleSubprograms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubprograms = null;


        try {
            // InternalPortugol.g:534:52: (iv_ruleSubprograms= ruleSubprograms EOF )
            // InternalPortugol.g:535:2: iv_ruleSubprograms= ruleSubprograms EOF
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
    // InternalPortugol.g:541:1: ruleSubprograms returns [EObject current=null] : ( (lv_blockSubPrograms_0_0= ruleBlockSubPrograms ) )+ ;
    public final EObject ruleSubprograms() throws RecognitionException {
        EObject current = null;

        EObject lv_blockSubPrograms_0_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:547:2: ( ( (lv_blockSubPrograms_0_0= ruleBlockSubPrograms ) )+ )
            // InternalPortugol.g:548:2: ( (lv_blockSubPrograms_0_0= ruleBlockSubPrograms ) )+
            {
            // InternalPortugol.g:548:2: ( (lv_blockSubPrograms_0_0= ruleBlockSubPrograms ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20||LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPortugol.g:549:3: (lv_blockSubPrograms_0_0= ruleBlockSubPrograms )
            	    {
            	    // InternalPortugol.g:549:3: (lv_blockSubPrograms_0_0= ruleBlockSubPrograms )
            	    // InternalPortugol.g:550:4: lv_blockSubPrograms_0_0= ruleBlockSubPrograms
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSubprogramsAccess().getBlockSubProgramsBlockSubProgramsParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_12);
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
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // InternalPortugol.g:570:1: entryRuleBlockSubPrograms returns [EObject current=null] : iv_ruleBlockSubPrograms= ruleBlockSubPrograms EOF ;
    public final EObject entryRuleBlockSubPrograms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockSubPrograms = null;


        try {
            // InternalPortugol.g:570:57: (iv_ruleBlockSubPrograms= ruleBlockSubPrograms EOF )
            // InternalPortugol.g:571:2: iv_ruleBlockSubPrograms= ruleBlockSubPrograms EOF
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
    // InternalPortugol.g:577:1: ruleBlockSubPrograms returns [EObject current=null] : (this_BlockFunction_0= ruleBlockFunction | this_BlockProcedure_1= ruleBlockProcedure ) ;
    public final EObject ruleBlockSubPrograms() throws RecognitionException {
        EObject current = null;

        EObject this_BlockFunction_0 = null;

        EObject this_BlockProcedure_1 = null;



        	enterRule();

        try {
            // InternalPortugol.g:583:2: ( (this_BlockFunction_0= ruleBlockFunction | this_BlockProcedure_1= ruleBlockProcedure ) )
            // InternalPortugol.g:584:2: (this_BlockFunction_0= ruleBlockFunction | this_BlockProcedure_1= ruleBlockProcedure )
            {
            // InternalPortugol.g:584:2: (this_BlockFunction_0= ruleBlockFunction | this_BlockProcedure_1= ruleBlockProcedure )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPortugol.g:585:3: this_BlockFunction_0= ruleBlockFunction
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
                    // InternalPortugol.g:594:3: this_BlockProcedure_1= ruleBlockProcedure
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
    // InternalPortugol.g:606:1: entryRuleProcedureName returns [EObject current=null] : iv_ruleProcedureName= ruleProcedureName EOF ;
    public final EObject entryRuleProcedureName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedureName = null;


        try {
            // InternalPortugol.g:606:54: (iv_ruleProcedureName= ruleProcedureName EOF )
            // InternalPortugol.g:607:2: iv_ruleProcedureName= ruleProcedureName EOF
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
    // InternalPortugol.g:613:1: ruleProcedureName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleProcedureName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPortugol.g:619:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPortugol.g:620:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPortugol.g:620:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPortugol.g:621:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPortugol.g:621:3: (lv_name_0_0= RULE_ID )
            // InternalPortugol.g:622:4: lv_name_0_0= RULE_ID
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
    // InternalPortugol.g:641:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // InternalPortugol.g:641:53: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalPortugol.g:642:2: iv_ruleFunctionName= ruleFunctionName EOF
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
    // InternalPortugol.g:648:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPortugol.g:654:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPortugol.g:655:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPortugol.g:655:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPortugol.g:656:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPortugol.g:656:3: (lv_name_0_0= RULE_ID )
            // InternalPortugol.g:657:4: lv_name_0_0= RULE_ID
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
    // InternalPortugol.g:676:1: entryRuleBlockFunction returns [EObject current=null] : iv_ruleBlockFunction= ruleBlockFunction EOF ;
    public final EObject entryRuleBlockFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockFunction = null;


        try {
            // InternalPortugol.g:676:54: (iv_ruleBlockFunction= ruleBlockFunction EOF )
            // InternalPortugol.g:677:2: iv_ruleBlockFunction= ruleBlockFunction EOF
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
    // InternalPortugol.g:683:1: ruleBlockFunction returns [EObject current=null] : (otherlv_0= 'funcao' ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleVarType ) ) ( (lv_declarations_7_0= ruleDeclarationsBlock ) )? otherlv_8= 'inicio' ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= 'fimfuncao' ) ;
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
            // InternalPortugol.g:689:2: ( (otherlv_0= 'funcao' ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleVarType ) ) ( (lv_declarations_7_0= ruleDeclarationsBlock ) )? otherlv_8= 'inicio' ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= 'fimfuncao' ) )
            // InternalPortugol.g:690:2: (otherlv_0= 'funcao' ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleVarType ) ) ( (lv_declarations_7_0= ruleDeclarationsBlock ) )? otherlv_8= 'inicio' ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= 'fimfuncao' )
            {
            // InternalPortugol.g:690:2: (otherlv_0= 'funcao' ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleVarType ) ) ( (lv_declarations_7_0= ruleDeclarationsBlock ) )? otherlv_8= 'inicio' ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= 'fimfuncao' )
            // InternalPortugol.g:691:3: otherlv_0= 'funcao' ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleVarType ) ) ( (lv_declarations_7_0= ruleDeclarationsBlock ) )? otherlv_8= 'inicio' ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= 'fimfuncao'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlockFunctionAccess().getFuncaoKeyword_0());
              		
            }
            // InternalPortugol.g:695:3: ( (lv_functionName_1_0= ruleFunctionName ) )
            // InternalPortugol.g:696:4: (lv_functionName_1_0= ruleFunctionName )
            {
            // InternalPortugol.g:696:4: (lv_functionName_1_0= ruleFunctionName )
            // InternalPortugol.g:697:5: lv_functionName_1_0= ruleFunctionName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBlockFunctionAccess().getFunctionNameFunctionNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,21,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBlockFunctionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPortugol.g:718:3: ( (lv_paramList_3_0= ruleVariable ) )
            // InternalPortugol.g:719:4: (lv_paramList_3_0= ruleVariable )
            {
            // InternalPortugol.g:719:4: (lv_paramList_3_0= ruleVariable )
            // InternalPortugol.g:720:5: lv_paramList_3_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBlockFunctionAccess().getParamListVariableParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_14);
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

            otherlv_4=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBlockFunctionAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,14,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getBlockFunctionAccess().getColonKeyword_5());
              		
            }
            // InternalPortugol.g:745:3: ( (lv_returnType_6_0= ruleVarType ) )
            // InternalPortugol.g:746:4: (lv_returnType_6_0= ruleVarType )
            {
            // InternalPortugol.g:746:4: (lv_returnType_6_0= ruleVarType )
            // InternalPortugol.g:747:5: lv_returnType_6_0= ruleVarType
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

            // InternalPortugol.g:764:3: ( (lv_declarations_7_0= ruleDeclarationsBlock ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPortugol.g:765:4: (lv_declarations_7_0= ruleDeclarationsBlock )
                    {
                    // InternalPortugol.g:765:4: (lv_declarations_7_0= ruleDeclarationsBlock )
                    // InternalPortugol.g:766:5: lv_declarations_7_0= ruleDeclarationsBlock
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

            otherlv_8=(Token)match(input,23,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getBlockFunctionAccess().getInicioKeyword_8());
              		
            }
            // InternalPortugol.g:787:3: ( (lv_commands_9_0= ruleAbstractCommand ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_FLOAT)||LA9_0==21||LA9_0==28||LA9_0==32||LA9_0==37||LA9_0==43||(LA9_0>=45 && LA9_0<=48)||LA9_0==61||LA9_0==67) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPortugol.g:788:4: (lv_commands_9_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugol.g:788:4: (lv_commands_9_0= ruleAbstractCommand )
            	    // InternalPortugol.g:789:5: lv_commands_9_0= ruleAbstractCommand
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
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_10=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalPortugol.g:814:1: entryRuleBlockProcedure returns [EObject current=null] : iv_ruleBlockProcedure= ruleBlockProcedure EOF ;
    public final EObject entryRuleBlockProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockProcedure = null;


        try {
            // InternalPortugol.g:814:55: (iv_ruleBlockProcedure= ruleBlockProcedure EOF )
            // InternalPortugol.g:815:2: iv_ruleBlockProcedure= ruleBlockProcedure EOF
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
    // InternalPortugol.g:821:1: ruleBlockProcedure returns [EObject current=null] : (otherlv_0= 'procedimento' ( (lv_procedure_1_0= ruleProcedureName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' ( (lv_declarations_5_0= ruleDeclarationsBlock ) )? otherlv_6= 'inicio' ( (lv_commands_7_0= ruleAbstractCommand ) )+ otherlv_8= 'fimprocedimento' ) ;
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
            // InternalPortugol.g:827:2: ( (otherlv_0= 'procedimento' ( (lv_procedure_1_0= ruleProcedureName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' ( (lv_declarations_5_0= ruleDeclarationsBlock ) )? otherlv_6= 'inicio' ( (lv_commands_7_0= ruleAbstractCommand ) )+ otherlv_8= 'fimprocedimento' ) )
            // InternalPortugol.g:828:2: (otherlv_0= 'procedimento' ( (lv_procedure_1_0= ruleProcedureName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' ( (lv_declarations_5_0= ruleDeclarationsBlock ) )? otherlv_6= 'inicio' ( (lv_commands_7_0= ruleAbstractCommand ) )+ otherlv_8= 'fimprocedimento' )
            {
            // InternalPortugol.g:828:2: (otherlv_0= 'procedimento' ( (lv_procedure_1_0= ruleProcedureName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' ( (lv_declarations_5_0= ruleDeclarationsBlock ) )? otherlv_6= 'inicio' ( (lv_commands_7_0= ruleAbstractCommand ) )+ otherlv_8= 'fimprocedimento' )
            // InternalPortugol.g:829:3: otherlv_0= 'procedimento' ( (lv_procedure_1_0= ruleProcedureName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' ( (lv_declarations_5_0= ruleDeclarationsBlock ) )? otherlv_6= 'inicio' ( (lv_commands_7_0= ruleAbstractCommand ) )+ otherlv_8= 'fimprocedimento'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlockProcedureAccess().getProcedimentoKeyword_0());
              		
            }
            // InternalPortugol.g:833:3: ( (lv_procedure_1_0= ruleProcedureName ) )
            // InternalPortugol.g:834:4: (lv_procedure_1_0= ruleProcedureName )
            {
            // InternalPortugol.g:834:4: (lv_procedure_1_0= ruleProcedureName )
            // InternalPortugol.g:835:5: lv_procedure_1_0= ruleProcedureName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBlockProcedureAccess().getProcedureProcedureNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,21,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBlockProcedureAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPortugol.g:856:3: ( (lv_paramList_3_0= ruleVariable ) )
            // InternalPortugol.g:857:4: (lv_paramList_3_0= ruleVariable )
            {
            // InternalPortugol.g:857:4: (lv_paramList_3_0= ruleVariable )
            // InternalPortugol.g:858:5: lv_paramList_3_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBlockProcedureAccess().getParamListVariableParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_14);
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

            otherlv_4=(Token)match(input,22,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBlockProcedureAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalPortugol.g:879:3: ( (lv_declarations_5_0= ruleDeclarationsBlock ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPortugol.g:880:4: (lv_declarations_5_0= ruleDeclarationsBlock )
                    {
                    // InternalPortugol.g:880:4: (lv_declarations_5_0= ruleDeclarationsBlock )
                    // InternalPortugol.g:881:5: lv_declarations_5_0= ruleDeclarationsBlock
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

            otherlv_6=(Token)match(input,23,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getBlockProcedureAccess().getInicioKeyword_6());
              		
            }
            // InternalPortugol.g:902:3: ( (lv_commands_7_0= ruleAbstractCommand ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_FLOAT)||LA11_0==21||LA11_0==28||LA11_0==32||LA11_0==37||LA11_0==43||(LA11_0>=45 && LA11_0<=48)||LA11_0==61||LA11_0==67) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPortugol.g:903:4: (lv_commands_7_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugol.g:903:4: (lv_commands_7_0= ruleAbstractCommand )
            	    // InternalPortugol.g:904:5: lv_commands_7_0= ruleAbstractCommand
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
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_8=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalPortugol.g:929:1: entryRuleBlockCommand returns [EObject current=null] : iv_ruleBlockCommand= ruleBlockCommand EOF ;
    public final EObject entryRuleBlockCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockCommand = null;


        try {
            // InternalPortugol.g:929:53: (iv_ruleBlockCommand= ruleBlockCommand EOF )
            // InternalPortugol.g:930:2: iv_ruleBlockCommand= ruleBlockCommand EOF
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
    // InternalPortugol.g:936:1: ruleBlockCommand returns [EObject current=null] : (otherlv_0= 'inicio' ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= 'fimalgoritmo' ) ;
    public final EObject ruleBlockCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_commands_1_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:942:2: ( (otherlv_0= 'inicio' ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= 'fimalgoritmo' ) )
            // InternalPortugol.g:943:2: (otherlv_0= 'inicio' ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= 'fimalgoritmo' )
            {
            // InternalPortugol.g:943:2: (otherlv_0= 'inicio' ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= 'fimalgoritmo' )
            // InternalPortugol.g:944:3: otherlv_0= 'inicio' ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= 'fimalgoritmo'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlockCommandAccess().getInicioKeyword_0());
              		
            }
            // InternalPortugol.g:948:3: ( (lv_commands_1_0= ruleAbstractCommand ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_FLOAT)||LA12_0==21||LA12_0==28||LA12_0==32||LA12_0==37||LA12_0==43||(LA12_0>=45 && LA12_0<=48)||LA12_0==61||LA12_0==67) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPortugol.g:949:4: (lv_commands_1_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugol.g:949:4: (lv_commands_1_0= ruleAbstractCommand )
            	    // InternalPortugol.g:950:5: lv_commands_1_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockCommandAccess().getCommandsAbstractCommandParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_20);
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
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_2=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
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
    // InternalPortugol.g:975:1: entryRuleAbstractCommand returns [EObject current=null] : iv_ruleAbstractCommand= ruleAbstractCommand EOF ;
    public final EObject entryRuleAbstractCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractCommand = null;


        try {
            // InternalPortugol.g:975:56: (iv_ruleAbstractCommand= ruleAbstractCommand EOF )
            // InternalPortugol.g:976:2: iv_ruleAbstractCommand= ruleAbstractCommand EOF
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
    // InternalPortugol.g:982:1: ruleAbstractCommand returns [EObject current=null] : ( (this_ReadCommand_0= ruleReadCommand ruleEND_COMMAND ) | (this_WriteCommand_2= ruleWriteCommand ruleEND_COMMAND ) | (this_Expression_4= ruleExpression ruleEND_COMMAND ) | this_IfStatement_6= ruleIfStatement | this_SwitchCaseStatement_7= ruleSwitchCaseStatement | this_ForStatement_8= ruleForStatement | this_RepeatStatement_9= ruleRepeatStatement | this_WhileStatement_10= ruleWhileStatement ) ;
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



        	enterRule();

        try {
            // InternalPortugol.g:988:2: ( ( (this_ReadCommand_0= ruleReadCommand ruleEND_COMMAND ) | (this_WriteCommand_2= ruleWriteCommand ruleEND_COMMAND ) | (this_Expression_4= ruleExpression ruleEND_COMMAND ) | this_IfStatement_6= ruleIfStatement | this_SwitchCaseStatement_7= ruleSwitchCaseStatement | this_ForStatement_8= ruleForStatement | this_RepeatStatement_9= ruleRepeatStatement | this_WhileStatement_10= ruleWhileStatement ) )
            // InternalPortugol.g:989:2: ( (this_ReadCommand_0= ruleReadCommand ruleEND_COMMAND ) | (this_WriteCommand_2= ruleWriteCommand ruleEND_COMMAND ) | (this_Expression_4= ruleExpression ruleEND_COMMAND ) | this_IfStatement_6= ruleIfStatement | this_SwitchCaseStatement_7= ruleSwitchCaseStatement | this_ForStatement_8= ruleForStatement | this_RepeatStatement_9= ruleRepeatStatement | this_WhileStatement_10= ruleWhileStatement )
            {
            // InternalPortugol.g:989:2: ( (this_ReadCommand_0= ruleReadCommand ruleEND_COMMAND ) | (this_WriteCommand_2= ruleWriteCommand ruleEND_COMMAND ) | (this_Expression_4= ruleExpression ruleEND_COMMAND ) | this_IfStatement_6= ruleIfStatement | this_SwitchCaseStatement_7= ruleSwitchCaseStatement | this_ForStatement_8= ruleForStatement | this_RepeatStatement_9= ruleRepeatStatement | this_WhileStatement_10= ruleWhileStatement )
            int alt13=8;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt13=1;
                }
                break;
            case 47:
            case 48:
                {
                alt13=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case RULE_FLOAT:
            case 21:
            case 61:
            case 67:
                {
                alt13=3;
                }
                break;
            case 28:
                {
                alt13=4;
                }
                break;
            case 32:
                {
                alt13=5;
                }
                break;
            case 37:
                {
                alt13=6;
                }
                break;
            case 45:
                {
                alt13=7;
                }
                break;
            case 43:
                {
                alt13=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalPortugol.g:990:3: (this_ReadCommand_0= ruleReadCommand ruleEND_COMMAND )
                    {
                    // InternalPortugol.g:990:3: (this_ReadCommand_0= ruleReadCommand ruleEND_COMMAND )
                    // InternalPortugol.g:991:4: this_ReadCommand_0= ruleReadCommand ruleEND_COMMAND
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAbstractCommandAccess().getReadCommandParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_6);
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
                    // InternalPortugol.g:1008:3: (this_WriteCommand_2= ruleWriteCommand ruleEND_COMMAND )
                    {
                    // InternalPortugol.g:1008:3: (this_WriteCommand_2= ruleWriteCommand ruleEND_COMMAND )
                    // InternalPortugol.g:1009:4: this_WriteCommand_2= ruleWriteCommand ruleEND_COMMAND
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAbstractCommandAccess().getWriteCommandParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_6);
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
                    // InternalPortugol.g:1026:3: (this_Expression_4= ruleExpression ruleEND_COMMAND )
                    {
                    // InternalPortugol.g:1026:3: (this_Expression_4= ruleExpression ruleEND_COMMAND )
                    // InternalPortugol.g:1027:4: this_Expression_4= ruleExpression ruleEND_COMMAND
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAbstractCommandAccess().getExpressionParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_6);
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
                    // InternalPortugol.g:1044:3: this_IfStatement_6= ruleIfStatement
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
                    // InternalPortugol.g:1053:3: this_SwitchCaseStatement_7= ruleSwitchCaseStatement
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
                    // InternalPortugol.g:1062:3: this_ForStatement_8= ruleForStatement
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
                    // InternalPortugol.g:1071:3: this_RepeatStatement_9= ruleRepeatStatement
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
                    // InternalPortugol.g:1080:3: this_WhileStatement_10= ruleWhileStatement
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


    // $ANTLR start "entryRuleIfStatement"
    // InternalPortugol.g:1092:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalPortugol.g:1092:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalPortugol.g:1093:2: iv_ruleIfStatement= ruleIfStatement EOF
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
    // InternalPortugol.g:1099:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'se' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= 'entao' ( (lv_commands_3_0= ruleAbstractCommand ) )+ (otherlv_4= 'senao' ( (lv_elseCommands_5_0= ruleAbstractCommand ) )+ )? otherlv_6= 'fimse' ) ;
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
            // InternalPortugol.g:1105:2: ( (otherlv_0= 'se' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= 'entao' ( (lv_commands_3_0= ruleAbstractCommand ) )+ (otherlv_4= 'senao' ( (lv_elseCommands_5_0= ruleAbstractCommand ) )+ )? otherlv_6= 'fimse' ) )
            // InternalPortugol.g:1106:2: (otherlv_0= 'se' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= 'entao' ( (lv_commands_3_0= ruleAbstractCommand ) )+ (otherlv_4= 'senao' ( (lv_elseCommands_5_0= ruleAbstractCommand ) )+ )? otherlv_6= 'fimse' )
            {
            // InternalPortugol.g:1106:2: (otherlv_0= 'se' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= 'entao' ( (lv_commands_3_0= ruleAbstractCommand ) )+ (otherlv_4= 'senao' ( (lv_elseCommands_5_0= ruleAbstractCommand ) )+ )? otherlv_6= 'fimse' )
            // InternalPortugol.g:1107:3: otherlv_0= 'se' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= 'entao' ( (lv_commands_3_0= ruleAbstractCommand ) )+ (otherlv_4= 'senao' ( (lv_elseCommands_5_0= ruleAbstractCommand ) )+ )? otherlv_6= 'fimse'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getSeKeyword_0());
              		
            }
            // InternalPortugol.g:1111:3: ( (lv_expr_1_0= ruleExpression ) )
            // InternalPortugol.g:1112:4: (lv_expr_1_0= ruleExpression )
            {
            // InternalPortugol.g:1112:4: (lv_expr_1_0= ruleExpression )
            // InternalPortugol.g:1113:5: lv_expr_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getExprExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_22);
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

            otherlv_2=(Token)match(input,29,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getEntaoKeyword_2());
              		
            }
            // InternalPortugol.g:1134:3: ( (lv_commands_3_0= ruleAbstractCommand ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_FLOAT)||LA14_0==21||LA14_0==28||LA14_0==32||LA14_0==37||LA14_0==43||(LA14_0>=45 && LA14_0<=48)||LA14_0==61||LA14_0==67) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPortugol.g:1135:4: (lv_commands_3_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugol.g:1135:4: (lv_commands_3_0= ruleAbstractCommand )
            	    // InternalPortugol.g:1136:5: lv_commands_3_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfStatementAccess().getCommandsAbstractCommandParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_23);
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
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            // InternalPortugol.g:1153:3: (otherlv_4= 'senao' ( (lv_elseCommands_5_0= ruleAbstractCommand ) )+ )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPortugol.g:1154:4: otherlv_4= 'senao' ( (lv_elseCommands_5_0= ruleAbstractCommand ) )+
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getSenaoKeyword_4_0());
                      			
                    }
                    // InternalPortugol.g:1158:4: ( (lv_elseCommands_5_0= ruleAbstractCommand ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_FLOAT)||LA15_0==21||LA15_0==28||LA15_0==32||LA15_0==37||LA15_0==43||(LA15_0>=45 && LA15_0<=48)||LA15_0==61||LA15_0==67) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalPortugol.g:1159:5: (lv_elseCommands_5_0= ruleAbstractCommand )
                    	    {
                    	    // InternalPortugol.g:1159:5: (lv_elseCommands_5_0= ruleAbstractCommand )
                    	    // InternalPortugol.g:1160:6: lv_elseCommands_5_0= ruleAbstractCommand
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getIfStatementAccess().getElseCommandsAbstractCommandParserRuleCall_4_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_24);
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
                    	    if ( cnt15 >= 1 ) break loop15;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
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
    // InternalPortugol.g:1186:1: entryRuleSwitchCaseStatement returns [EObject current=null] : iv_ruleSwitchCaseStatement= ruleSwitchCaseStatement EOF ;
    public final EObject entryRuleSwitchCaseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCaseStatement = null;


        try {
            // InternalPortugol.g:1186:60: (iv_ruleSwitchCaseStatement= ruleSwitchCaseStatement EOF )
            // InternalPortugol.g:1187:2: iv_ruleSwitchCaseStatement= ruleSwitchCaseStatement EOF
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
    // InternalPortugol.g:1193:1: ruleSwitchCaseStatement returns [EObject current=null] : (otherlv_0= 'escolha' ( (otherlv_1= RULE_ID ) ) ( (lv_caseList_2_0= ruleCaseList ) )+ ( (lv_otherCase_3_0= ruleOtherCase ) )? otherlv_4= 'fimescolha' ) ;
    public final EObject ruleSwitchCaseStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_caseList_2_0 = null;

        EObject lv_otherCase_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1199:2: ( (otherlv_0= 'escolha' ( (otherlv_1= RULE_ID ) ) ( (lv_caseList_2_0= ruleCaseList ) )+ ( (lv_otherCase_3_0= ruleOtherCase ) )? otherlv_4= 'fimescolha' ) )
            // InternalPortugol.g:1200:2: (otherlv_0= 'escolha' ( (otherlv_1= RULE_ID ) ) ( (lv_caseList_2_0= ruleCaseList ) )+ ( (lv_otherCase_3_0= ruleOtherCase ) )? otherlv_4= 'fimescolha' )
            {
            // InternalPortugol.g:1200:2: (otherlv_0= 'escolha' ( (otherlv_1= RULE_ID ) ) ( (lv_caseList_2_0= ruleCaseList ) )+ ( (lv_otherCase_3_0= ruleOtherCase ) )? otherlv_4= 'fimescolha' )
            // InternalPortugol.g:1201:3: otherlv_0= 'escolha' ( (otherlv_1= RULE_ID ) ) ( (lv_caseList_2_0= ruleCaseList ) )+ ( (lv_otherCase_3_0= ruleOtherCase ) )? otherlv_4= 'fimescolha'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSwitchCaseStatementAccess().getEscolhaKeyword_0());
              		
            }
            // InternalPortugol.g:1205:3: ( (otherlv_1= RULE_ID ) )
            // InternalPortugol.g:1206:4: (otherlv_1= RULE_ID )
            {
            // InternalPortugol.g:1206:4: (otherlv_1= RULE_ID )
            // InternalPortugol.g:1207:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSwitchCaseStatementRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getSwitchCaseStatementAccess().getVariableVarNameCrossReference_1_0());
              				
            }

            }


            }

            // InternalPortugol.g:1218:3: ( (lv_caseList_2_0= ruleCaseList ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPortugol.g:1219:4: (lv_caseList_2_0= ruleCaseList )
            	    {
            	    // InternalPortugol.g:1219:4: (lv_caseList_2_0= ruleCaseList )
            	    // InternalPortugol.g:1220:5: lv_caseList_2_0= ruleCaseList
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSwitchCaseStatementAccess().getCaseListCaseListParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_26);
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
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            // InternalPortugol.g:1237:3: ( (lv_otherCase_3_0= ruleOtherCase ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPortugol.g:1238:4: (lv_otherCase_3_0= ruleOtherCase )
                    {
                    // InternalPortugol.g:1238:4: (lv_otherCase_3_0= ruleOtherCase )
                    // InternalPortugol.g:1239:5: lv_otherCase_3_0= ruleOtherCase
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSwitchCaseStatementAccess().getOtherCaseOtherCaseParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_27);
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

            otherlv_4=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
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
    // InternalPortugol.g:1264:1: entryRuleCaseList returns [EObject current=null] : iv_ruleCaseList= ruleCaseList EOF ;
    public final EObject entryRuleCaseList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseList = null;


        try {
            // InternalPortugol.g:1264:49: (iv_ruleCaseList= ruleCaseList EOF )
            // InternalPortugol.g:1265:2: iv_ruleCaseList= ruleCaseList EOF
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
    // InternalPortugol.g:1271:1: ruleCaseList returns [EObject current=null] : (otherlv_0= 'caso' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleAbstractCommand ) )+ ( ( (lv_breakStatement_4_0= 'interrompa' ) ) ruleEND_COMMAND )? ) ;
    public final EObject ruleCaseList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_breakStatement_4_0=null;
        EObject lv_expr_1_0 = null;

        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1277:2: ( (otherlv_0= 'caso' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleAbstractCommand ) )+ ( ( (lv_breakStatement_4_0= 'interrompa' ) ) ruleEND_COMMAND )? ) )
            // InternalPortugol.g:1278:2: (otherlv_0= 'caso' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleAbstractCommand ) )+ ( ( (lv_breakStatement_4_0= 'interrompa' ) ) ruleEND_COMMAND )? )
            {
            // InternalPortugol.g:1278:2: (otherlv_0= 'caso' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleAbstractCommand ) )+ ( ( (lv_breakStatement_4_0= 'interrompa' ) ) ruleEND_COMMAND )? )
            // InternalPortugol.g:1279:3: otherlv_0= 'caso' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= ':' ( (lv_commands_3_0= ruleAbstractCommand ) )+ ( ( (lv_breakStatement_4_0= 'interrompa' ) ) ruleEND_COMMAND )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCaseListAccess().getCasoKeyword_0());
              		
            }
            // InternalPortugol.g:1283:3: ( (lv_expr_1_0= ruleExpression ) )
            // InternalPortugol.g:1284:4: (lv_expr_1_0= ruleExpression )
            {
            // InternalPortugol.g:1284:4: (lv_expr_1_0= ruleExpression )
            // InternalPortugol.g:1285:5: lv_expr_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseListAccess().getExprExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_9);
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

            otherlv_2=(Token)match(input,14,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCaseListAccess().getColonKeyword_2());
              		
            }
            // InternalPortugol.g:1306:3: ( (lv_commands_3_0= ruleAbstractCommand ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_FLOAT)||LA19_0==21||LA19_0==28||LA19_0==32||LA19_0==37||LA19_0==43||(LA19_0>=45 && LA19_0<=48)||LA19_0==61||LA19_0==67) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPortugol.g:1307:4: (lv_commands_3_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugol.g:1307:4: (lv_commands_3_0= ruleAbstractCommand )
            	    // InternalPortugol.g:1308:5: lv_commands_3_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCaseListAccess().getCommandsAbstractCommandParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_28);
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
            	    if ( cnt19 >= 1 ) break loop19;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            // InternalPortugol.g:1325:3: ( ( (lv_breakStatement_4_0= 'interrompa' ) ) ruleEND_COMMAND )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPortugol.g:1326:4: ( (lv_breakStatement_4_0= 'interrompa' ) ) ruleEND_COMMAND
                    {
                    // InternalPortugol.g:1326:4: ( (lv_breakStatement_4_0= 'interrompa' ) )
                    // InternalPortugol.g:1327:5: (lv_breakStatement_4_0= 'interrompa' )
                    {
                    // InternalPortugol.g:1327:5: (lv_breakStatement_4_0= 'interrompa' )
                    // InternalPortugol.g:1328:6: lv_breakStatement_4_0= 'interrompa'
                    {
                    lv_breakStatement_4_0=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_breakStatement_4_0, grammarAccess.getCaseListAccess().getBreakStatementInterrompaKeyword_4_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCaseListRule());
                      						}
                      						setWithLastConsumed(current, "breakStatement", true, "interrompa");
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCaseListAccess().getEND_COMMANDParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleEND_COMMAND();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
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
    // $ANTLR end "ruleCaseList"


    // $ANTLR start "entryRuleOtherCase"
    // InternalPortugol.g:1352:1: entryRuleOtherCase returns [EObject current=null] : iv_ruleOtherCase= ruleOtherCase EOF ;
    public final EObject entryRuleOtherCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherCase = null;


        try {
            // InternalPortugol.g:1352:50: (iv_ruleOtherCase= ruleOtherCase EOF )
            // InternalPortugol.g:1353:2: iv_ruleOtherCase= ruleOtherCase EOF
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
    // InternalPortugol.g:1359:1: ruleOtherCase returns [EObject current=null] : (otherlv_0= 'outrocaso' otherlv_1= ':' ( (lv_otherCaseCommands_2_0= ruleAbstractCommand ) )+ ( ( (lv_breakStatement_3_0= 'interrompa' ) ) ruleEND_COMMAND )? ) ;
    public final EObject ruleOtherCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_breakStatement_3_0=null;
        EObject lv_otherCaseCommands_2_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1365:2: ( (otherlv_0= 'outrocaso' otherlv_1= ':' ( (lv_otherCaseCommands_2_0= ruleAbstractCommand ) )+ ( ( (lv_breakStatement_3_0= 'interrompa' ) ) ruleEND_COMMAND )? ) )
            // InternalPortugol.g:1366:2: (otherlv_0= 'outrocaso' otherlv_1= ':' ( (lv_otherCaseCommands_2_0= ruleAbstractCommand ) )+ ( ( (lv_breakStatement_3_0= 'interrompa' ) ) ruleEND_COMMAND )? )
            {
            // InternalPortugol.g:1366:2: (otherlv_0= 'outrocaso' otherlv_1= ':' ( (lv_otherCaseCommands_2_0= ruleAbstractCommand ) )+ ( ( (lv_breakStatement_3_0= 'interrompa' ) ) ruleEND_COMMAND )? )
            // InternalPortugol.g:1367:3: otherlv_0= 'outrocaso' otherlv_1= ':' ( (lv_otherCaseCommands_2_0= ruleAbstractCommand ) )+ ( ( (lv_breakStatement_3_0= 'interrompa' ) ) ruleEND_COMMAND )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOtherCaseAccess().getOutrocasoKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOtherCaseAccess().getColonKeyword_1());
              		
            }
            // InternalPortugol.g:1375:3: ( (lv_otherCaseCommands_2_0= ruleAbstractCommand ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_FLOAT)||LA21_0==21||LA21_0==28||LA21_0==32||LA21_0==37||LA21_0==43||(LA21_0>=45 && LA21_0<=48)||LA21_0==61||LA21_0==67) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPortugol.g:1376:4: (lv_otherCaseCommands_2_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugol.g:1376:4: (lv_otherCaseCommands_2_0= ruleAbstractCommand )
            	    // InternalPortugol.g:1377:5: lv_otherCaseCommands_2_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getOtherCaseAccess().getOtherCaseCommandsAbstractCommandParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_28);
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

            // InternalPortugol.g:1394:3: ( ( (lv_breakStatement_3_0= 'interrompa' ) ) ruleEND_COMMAND )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPortugol.g:1395:4: ( (lv_breakStatement_3_0= 'interrompa' ) ) ruleEND_COMMAND
                    {
                    // InternalPortugol.g:1395:4: ( (lv_breakStatement_3_0= 'interrompa' ) )
                    // InternalPortugol.g:1396:5: (lv_breakStatement_3_0= 'interrompa' )
                    {
                    // InternalPortugol.g:1396:5: (lv_breakStatement_3_0= 'interrompa' )
                    // InternalPortugol.g:1397:6: lv_breakStatement_3_0= 'interrompa'
                    {
                    lv_breakStatement_3_0=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_breakStatement_3_0, grammarAccess.getOtherCaseAccess().getBreakStatementInterrompaKeyword_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOtherCaseRule());
                      						}
                      						setWithLastConsumed(current, "breakStatement", true, "interrompa");
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOtherCaseAccess().getEND_COMMANDParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleEND_COMMAND();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
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
    // $ANTLR end "ruleOtherCase"


    // $ANTLR start "entryRuleForStatement"
    // InternalPortugol.g:1421:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalPortugol.g:1421:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalPortugol.g:1422:2: iv_ruleForStatement= ruleForStatement EOF
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
    // InternalPortugol.g:1428:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'para' ( (lv_operatorExpr_1_0= ruleExpression ) ) otherlv_2= 'de' ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= 'ate' ( (lv_endExpr_5_0= ruleExpression ) ) (otherlv_6= 'passo' ( (lv_stepExpe_7_0= ruleExpression ) ) )? otherlv_8= 'faca' ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= 'fimpara' ) ;
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
            // InternalPortugol.g:1434:2: ( (otherlv_0= 'para' ( (lv_operatorExpr_1_0= ruleExpression ) ) otherlv_2= 'de' ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= 'ate' ( (lv_endExpr_5_0= ruleExpression ) ) (otherlv_6= 'passo' ( (lv_stepExpe_7_0= ruleExpression ) ) )? otherlv_8= 'faca' ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= 'fimpara' ) )
            // InternalPortugol.g:1435:2: (otherlv_0= 'para' ( (lv_operatorExpr_1_0= ruleExpression ) ) otherlv_2= 'de' ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= 'ate' ( (lv_endExpr_5_0= ruleExpression ) ) (otherlv_6= 'passo' ( (lv_stepExpe_7_0= ruleExpression ) ) )? otherlv_8= 'faca' ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= 'fimpara' )
            {
            // InternalPortugol.g:1435:2: (otherlv_0= 'para' ( (lv_operatorExpr_1_0= ruleExpression ) ) otherlv_2= 'de' ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= 'ate' ( (lv_endExpr_5_0= ruleExpression ) ) (otherlv_6= 'passo' ( (lv_stepExpe_7_0= ruleExpression ) ) )? otherlv_8= 'faca' ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= 'fimpara' )
            // InternalPortugol.g:1436:3: otherlv_0= 'para' ( (lv_operatorExpr_1_0= ruleExpression ) ) otherlv_2= 'de' ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= 'ate' ( (lv_endExpr_5_0= ruleExpression ) ) (otherlv_6= 'passo' ( (lv_stepExpe_7_0= ruleExpression ) ) )? otherlv_8= 'faca' ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= 'fimpara'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getParaKeyword_0());
              		
            }
            // InternalPortugol.g:1440:3: ( (lv_operatorExpr_1_0= ruleExpression ) )
            // InternalPortugol.g:1441:4: (lv_operatorExpr_1_0= ruleExpression )
            {
            // InternalPortugol.g:1441:4: (lv_operatorExpr_1_0= ruleExpression )
            // InternalPortugol.g:1442:5: lv_operatorExpr_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getOperatorExprExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_29);
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

            otherlv_2=(Token)match(input,38,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForStatementAccess().getDeKeyword_2());
              		
            }
            // InternalPortugol.g:1463:3: ( (lv_startExpr_3_0= ruleExpression ) )
            // InternalPortugol.g:1464:4: (lv_startExpr_3_0= ruleExpression )
            {
            // InternalPortugol.g:1464:4: (lv_startExpr_3_0= ruleExpression )
            // InternalPortugol.g:1465:5: lv_startExpr_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getStartExprExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_30);
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

            otherlv_4=(Token)match(input,39,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForStatementAccess().getAteKeyword_4());
              		
            }
            // InternalPortugol.g:1486:3: ( (lv_endExpr_5_0= ruleExpression ) )
            // InternalPortugol.g:1487:4: (lv_endExpr_5_0= ruleExpression )
            {
            // InternalPortugol.g:1487:4: (lv_endExpr_5_0= ruleExpression )
            // InternalPortugol.g:1488:5: lv_endExpr_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getEndExprExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            // InternalPortugol.g:1505:3: (otherlv_6= 'passo' ( (lv_stepExpe_7_0= ruleExpression ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPortugol.g:1506:4: otherlv_6= 'passo' ( (lv_stepExpe_7_0= ruleExpression ) )
                    {
                    otherlv_6=(Token)match(input,40,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getForStatementAccess().getPassoKeyword_6_0());
                      			
                    }
                    // InternalPortugol.g:1510:4: ( (lv_stepExpe_7_0= ruleExpression ) )
                    // InternalPortugol.g:1511:5: (lv_stepExpe_7_0= ruleExpression )
                    {
                    // InternalPortugol.g:1511:5: (lv_stepExpe_7_0= ruleExpression )
                    // InternalPortugol.g:1512:6: lv_stepExpe_7_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getForStatementAccess().getStepExpeExpressionParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
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

            otherlv_8=(Token)match(input,41,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getForStatementAccess().getFacaKeyword_7());
              		
            }
            // InternalPortugol.g:1534:3: ( (lv_commands_9_0= ruleAbstractCommand ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_FLOAT)||LA24_0==21||LA24_0==28||LA24_0==32||LA24_0==37||LA24_0==43||(LA24_0>=45 && LA24_0<=48)||LA24_0==61||LA24_0==67) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPortugol.g:1535:4: (lv_commands_9_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugol.g:1535:4: (lv_commands_9_0= ruleAbstractCommand )
            	    // InternalPortugol.g:1536:5: lv_commands_9_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getForStatementAccess().getCommandsAbstractCommandParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_33);
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
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_10=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
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
    // InternalPortugol.g:1561:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalPortugol.g:1561:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalPortugol.g:1562:2: iv_ruleWhileStatement= ruleWhileStatement EOF
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
    // InternalPortugol.g:1568:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'enquanto' ( (lv_whileExpr_1_0= ruleExpression ) ) otherlv_2= 'faca' ( (lv_commands_3_0= ruleAbstractCommand ) )+ otherlv_4= 'fimenquanto' ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_whileExpr_1_0 = null;

        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1574:2: ( (otherlv_0= 'enquanto' ( (lv_whileExpr_1_0= ruleExpression ) ) otherlv_2= 'faca' ( (lv_commands_3_0= ruleAbstractCommand ) )+ otherlv_4= 'fimenquanto' ) )
            // InternalPortugol.g:1575:2: (otherlv_0= 'enquanto' ( (lv_whileExpr_1_0= ruleExpression ) ) otherlv_2= 'faca' ( (lv_commands_3_0= ruleAbstractCommand ) )+ otherlv_4= 'fimenquanto' )
            {
            // InternalPortugol.g:1575:2: (otherlv_0= 'enquanto' ( (lv_whileExpr_1_0= ruleExpression ) ) otherlv_2= 'faca' ( (lv_commands_3_0= ruleAbstractCommand ) )+ otherlv_4= 'fimenquanto' )
            // InternalPortugol.g:1576:3: otherlv_0= 'enquanto' ( (lv_whileExpr_1_0= ruleExpression ) ) otherlv_2= 'faca' ( (lv_commands_3_0= ruleAbstractCommand ) )+ otherlv_4= 'fimenquanto'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getEnquantoKeyword_0());
              		
            }
            // InternalPortugol.g:1580:3: ( (lv_whileExpr_1_0= ruleExpression ) )
            // InternalPortugol.g:1581:4: (lv_whileExpr_1_0= ruleExpression )
            {
            // InternalPortugol.g:1581:4: (lv_whileExpr_1_0= ruleExpression )
            // InternalPortugol.g:1582:5: lv_whileExpr_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileStatementAccess().getWhileExprExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_32);
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

            otherlv_2=(Token)match(input,41,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileStatementAccess().getFacaKeyword_2());
              		
            }
            // InternalPortugol.g:1603:3: ( (lv_commands_3_0= ruleAbstractCommand ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_FLOAT)||LA25_0==21||LA25_0==28||LA25_0==32||LA25_0==37||LA25_0==43||(LA25_0>=45 && LA25_0<=48)||LA25_0==61||LA25_0==67) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPortugol.g:1604:4: (lv_commands_3_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugol.g:1604:4: (lv_commands_3_0= ruleAbstractCommand )
            	    // InternalPortugol.g:1605:5: lv_commands_3_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWhileStatementAccess().getCommandsAbstractCommandParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_34);
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
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_4=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
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
    // InternalPortugol.g:1630:1: entryRuleRepeatStatement returns [EObject current=null] : iv_ruleRepeatStatement= ruleRepeatStatement EOF ;
    public final EObject entryRuleRepeatStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatStatement = null;


        try {
            // InternalPortugol.g:1630:56: (iv_ruleRepeatStatement= ruleRepeatStatement EOF )
            // InternalPortugol.g:1631:2: iv_ruleRepeatStatement= ruleRepeatStatement EOF
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
    // InternalPortugol.g:1637:1: ruleRepeatStatement returns [EObject current=null] : (otherlv_0= 'repita' ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= 'ate' ( (lv_untilExpr_3_0= ruleExpression ) ) ruleEND_COMMAND ) ;
    public final EObject ruleRepeatStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_commands_1_0 = null;

        EObject lv_untilExpr_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1643:2: ( (otherlv_0= 'repita' ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= 'ate' ( (lv_untilExpr_3_0= ruleExpression ) ) ruleEND_COMMAND ) )
            // InternalPortugol.g:1644:2: (otherlv_0= 'repita' ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= 'ate' ( (lv_untilExpr_3_0= ruleExpression ) ) ruleEND_COMMAND )
            {
            // InternalPortugol.g:1644:2: (otherlv_0= 'repita' ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= 'ate' ( (lv_untilExpr_3_0= ruleExpression ) ) ruleEND_COMMAND )
            // InternalPortugol.g:1645:3: otherlv_0= 'repita' ( (lv_commands_1_0= ruleAbstractCommand ) )+ otherlv_2= 'ate' ( (lv_untilExpr_3_0= ruleExpression ) ) ruleEND_COMMAND
            {
            otherlv_0=(Token)match(input,45,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRepeatStatementAccess().getRepitaKeyword_0());
              		
            }
            // InternalPortugol.g:1649:3: ( (lv_commands_1_0= ruleAbstractCommand ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_FLOAT)||LA26_0==21||LA26_0==28||LA26_0==32||LA26_0==37||LA26_0==43||(LA26_0>=45 && LA26_0<=48)||LA26_0==61||LA26_0==67) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPortugol.g:1650:4: (lv_commands_1_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugol.g:1650:4: (lv_commands_1_0= ruleAbstractCommand )
            	    // InternalPortugol.g:1651:5: lv_commands_1_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRepeatStatementAccess().getCommandsAbstractCommandParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_35);
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
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_2=(Token)match(input,39,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRepeatStatementAccess().getAteKeyword_2());
              		
            }
            // InternalPortugol.g:1672:3: ( (lv_untilExpr_3_0= ruleExpression ) )
            // InternalPortugol.g:1673:4: (lv_untilExpr_3_0= ruleExpression )
            {
            // InternalPortugol.g:1673:4: (lv_untilExpr_3_0= ruleExpression )
            // InternalPortugol.g:1674:5: lv_untilExpr_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRepeatStatementAccess().getUntilExprExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_6);
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
    // InternalPortugol.g:1702:1: entryRuleSubprogramParam returns [EObject current=null] : iv_ruleSubprogramParam= ruleSubprogramParam EOF ;
    public final EObject entryRuleSubprogramParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubprogramParam = null;


        try {
            // InternalPortugol.g:1702:56: (iv_ruleSubprogramParam= ruleSubprogramParam EOF )
            // InternalPortugol.g:1703:2: iv_ruleSubprogramParam= ruleSubprogramParam EOF
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
    // InternalPortugol.g:1709:1: ruleSubprogramParam returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleSubprogramParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1715:2: ( ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) ) )* ) )
            // InternalPortugol.g:1716:2: ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) ) )* )
            {
            // InternalPortugol.g:1716:2: ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) ) )* )
            // InternalPortugol.g:1717:3: ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) ) )*
            {
            // InternalPortugol.g:1717:3: ( (lv_expression_0_0= ruleExpression ) )
            // InternalPortugol.g:1718:4: (lv_expression_0_0= ruleExpression )
            {
            // InternalPortugol.g:1718:4: (lv_expression_0_0= ruleExpression )
            // InternalPortugol.g:1719:5: lv_expression_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubprogramParamAccess().getExpressionExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_11);
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

            // InternalPortugol.g:1736:3: (otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==15) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPortugol.g:1737:4: otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getSubprogramParamAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPortugol.g:1741:4: ( (lv_expression_2_0= ruleExpression ) )
            	    // InternalPortugol.g:1742:5: (lv_expression_2_0= ruleExpression )
            	    {
            	    // InternalPortugol.g:1742:5: (lv_expression_2_0= ruleExpression )
            	    // InternalPortugol.g:1743:6: lv_expression_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSubprogramParamAccess().getExpressionExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
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
            	    break loop27;
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
    // InternalPortugol.g:1765:1: entryRuleReadCommand returns [EObject current=null] : iv_ruleReadCommand= ruleReadCommand EOF ;
    public final EObject entryRuleReadCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadCommand = null;


        try {
            // InternalPortugol.g:1765:52: (iv_ruleReadCommand= ruleReadCommand EOF )
            // InternalPortugol.g:1766:2: iv_ruleReadCommand= ruleReadCommand EOF
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
    // InternalPortugol.g:1772:1: ruleReadCommand returns [EObject current=null] : (otherlv_0= 'leia' otherlv_1= '(' ( (lv_paramList_2_0= ruleDeclaredVarList ) ) otherlv_3= ')' ) ;
    public final EObject ruleReadCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_paramList_2_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1778:2: ( (otherlv_0= 'leia' otherlv_1= '(' ( (lv_paramList_2_0= ruleDeclaredVarList ) ) otherlv_3= ')' ) )
            // InternalPortugol.g:1779:2: (otherlv_0= 'leia' otherlv_1= '(' ( (lv_paramList_2_0= ruleDeclaredVarList ) ) otherlv_3= ')' )
            {
            // InternalPortugol.g:1779:2: (otherlv_0= 'leia' otherlv_1= '(' ( (lv_paramList_2_0= ruleDeclaredVarList ) ) otherlv_3= ')' )
            // InternalPortugol.g:1780:3: otherlv_0= 'leia' otherlv_1= '(' ( (lv_paramList_2_0= ruleDeclaredVarList ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReadCommandAccess().getLeiaKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,21,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReadCommandAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalPortugol.g:1788:3: ( (lv_paramList_2_0= ruleDeclaredVarList ) )
            // InternalPortugol.g:1789:4: (lv_paramList_2_0= ruleDeclaredVarList )
            {
            // InternalPortugol.g:1789:4: (lv_paramList_2_0= ruleDeclaredVarList )
            // InternalPortugol.g:1790:5: lv_paramList_2_0= ruleDeclaredVarList
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

            otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalPortugol.g:1815:1: entryRuleWriteCommand returns [EObject current=null] : iv_ruleWriteCommand= ruleWriteCommand EOF ;
    public final EObject entryRuleWriteCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteCommand = null;


        try {
            // InternalPortugol.g:1815:53: (iv_ruleWriteCommand= ruleWriteCommand EOF )
            // InternalPortugol.g:1816:2: iv_ruleWriteCommand= ruleWriteCommand EOF
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
    // InternalPortugol.g:1822:1: ruleWriteCommand returns [EObject current=null] : ( ( ( (lv_writeCommand_0_1= 'escreva' | lv_writeCommand_0_2= 'escreval' ) ) ) otherlv_1= '(' ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= ')' ) ;
    public final EObject ruleWriteCommand() throws RecognitionException {
        EObject current = null;

        Token lv_writeCommand_0_1=null;
        Token lv_writeCommand_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_writeParam_2_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1828:2: ( ( ( ( (lv_writeCommand_0_1= 'escreva' | lv_writeCommand_0_2= 'escreval' ) ) ) otherlv_1= '(' ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= ')' ) )
            // InternalPortugol.g:1829:2: ( ( ( (lv_writeCommand_0_1= 'escreva' | lv_writeCommand_0_2= 'escreval' ) ) ) otherlv_1= '(' ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= ')' )
            {
            // InternalPortugol.g:1829:2: ( ( ( (lv_writeCommand_0_1= 'escreva' | lv_writeCommand_0_2= 'escreval' ) ) ) otherlv_1= '(' ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= ')' )
            // InternalPortugol.g:1830:3: ( ( (lv_writeCommand_0_1= 'escreva' | lv_writeCommand_0_2= 'escreval' ) ) ) otherlv_1= '(' ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= ')'
            {
            // InternalPortugol.g:1830:3: ( ( (lv_writeCommand_0_1= 'escreva' | lv_writeCommand_0_2= 'escreval' ) ) )
            // InternalPortugol.g:1831:4: ( (lv_writeCommand_0_1= 'escreva' | lv_writeCommand_0_2= 'escreval' ) )
            {
            // InternalPortugol.g:1831:4: ( (lv_writeCommand_0_1= 'escreva' | lv_writeCommand_0_2= 'escreval' ) )
            // InternalPortugol.g:1832:5: (lv_writeCommand_0_1= 'escreva' | lv_writeCommand_0_2= 'escreval' )
            {
            // InternalPortugol.g:1832:5: (lv_writeCommand_0_1= 'escreva' | lv_writeCommand_0_2= 'escreval' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==47) ) {
                alt28=1;
            }
            else if ( (LA28_0==48) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalPortugol.g:1833:6: lv_writeCommand_0_1= 'escreva'
                    {
                    lv_writeCommand_0_1=(Token)match(input,47,FOLLOW_13); if (state.failed) return current;
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
                    // InternalPortugol.g:1844:6: lv_writeCommand_0_2= 'escreval'
                    {
                    lv_writeCommand_0_2=(Token)match(input,48,FOLLOW_13); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,21,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWriteCommandAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalPortugol.g:1861:3: ( (lv_writeParam_2_0= ruleWriteParam ) )
            // InternalPortugol.g:1862:4: (lv_writeParam_2_0= ruleWriteParam )
            {
            // InternalPortugol.g:1862:4: (lv_writeParam_2_0= ruleWriteParam )
            // InternalPortugol.g:1863:5: lv_writeParam_2_0= ruleWriteParam
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

            otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalPortugol.g:1888:1: entryRuleWriteParam returns [EObject current=null] : iv_ruleWriteParam= ruleWriteParam EOF ;
    public final EObject entryRuleWriteParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteParam = null;


        try {
            // InternalPortugol.g:1888:51: (iv_ruleWriteParam= ruleWriteParam EOF )
            // InternalPortugol.g:1889:2: iv_ruleWriteParam= ruleWriteParam EOF
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
    // InternalPortugol.g:1895:1: ruleWriteParam returns [EObject current=null] : ( ( (lv_params_0_0= ruleSubprogramParam ) ) ( (lv_precision_1_0= ruleOptDecimalPrecision ) )? ) ;
    public final EObject ruleWriteParam() throws RecognitionException {
        EObject current = null;

        EObject lv_params_0_0 = null;

        EObject lv_precision_1_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1901:2: ( ( ( (lv_params_0_0= ruleSubprogramParam ) ) ( (lv_precision_1_0= ruleOptDecimalPrecision ) )? ) )
            // InternalPortugol.g:1902:2: ( ( (lv_params_0_0= ruleSubprogramParam ) ) ( (lv_precision_1_0= ruleOptDecimalPrecision ) )? )
            {
            // InternalPortugol.g:1902:2: ( ( (lv_params_0_0= ruleSubprogramParam ) ) ( (lv_precision_1_0= ruleOptDecimalPrecision ) )? )
            // InternalPortugol.g:1903:3: ( (lv_params_0_0= ruleSubprogramParam ) ) ( (lv_precision_1_0= ruleOptDecimalPrecision ) )?
            {
            // InternalPortugol.g:1903:3: ( (lv_params_0_0= ruleSubprogramParam ) )
            // InternalPortugol.g:1904:4: (lv_params_0_0= ruleSubprogramParam )
            {
            // InternalPortugol.g:1904:4: (lv_params_0_0= ruleSubprogramParam )
            // InternalPortugol.g:1905:5: lv_params_0_0= ruleSubprogramParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWriteParamAccess().getParamsSubprogramParamParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_36);
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

            // InternalPortugol.g:1922:3: ( (lv_precision_1_0= ruleOptDecimalPrecision ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==14) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPortugol.g:1923:4: (lv_precision_1_0= ruleOptDecimalPrecision )
                    {
                    // InternalPortugol.g:1923:4: (lv_precision_1_0= ruleOptDecimalPrecision )
                    // InternalPortugol.g:1924:5: lv_precision_1_0= ruleOptDecimalPrecision
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
    // InternalPortugol.g:1945:1: entryRuleOptDecimalPrecision returns [EObject current=null] : iv_ruleOptDecimalPrecision= ruleOptDecimalPrecision EOF ;
    public final EObject entryRuleOptDecimalPrecision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptDecimalPrecision = null;


        try {
            // InternalPortugol.g:1945:60: (iv_ruleOptDecimalPrecision= ruleOptDecimalPrecision EOF )
            // InternalPortugol.g:1946:2: iv_ruleOptDecimalPrecision= ruleOptDecimalPrecision EOF
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
    // InternalPortugol.g:1952:1: ruleOptDecimalPrecision returns [EObject current=null] : (otherlv_0= ':' ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= ':' ( (lv_secondPrecision_3_0= RULE_INT ) ) )? ) ;
    public final EObject ruleOptDecimalPrecision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_firstPrecision_1_0=null;
        Token otherlv_2=null;
        Token lv_secondPrecision_3_0=null;


        	enterRule();

        try {
            // InternalPortugol.g:1958:2: ( (otherlv_0= ':' ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= ':' ( (lv_secondPrecision_3_0= RULE_INT ) ) )? ) )
            // InternalPortugol.g:1959:2: (otherlv_0= ':' ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= ':' ( (lv_secondPrecision_3_0= RULE_INT ) ) )? )
            {
            // InternalPortugol.g:1959:2: (otherlv_0= ':' ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= ':' ( (lv_secondPrecision_3_0= RULE_INT ) ) )? )
            // InternalPortugol.g:1960:3: otherlv_0= ':' ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= ':' ( (lv_secondPrecision_3_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOptDecimalPrecisionAccess().getColonKeyword_0());
              		
            }
            // InternalPortugol.g:1964:3: ( (lv_firstPrecision_1_0= RULE_INT ) )
            // InternalPortugol.g:1965:4: (lv_firstPrecision_1_0= RULE_INT )
            {
            // InternalPortugol.g:1965:4: (lv_firstPrecision_1_0= RULE_INT )
            // InternalPortugol.g:1966:5: lv_firstPrecision_1_0= RULE_INT
            {
            lv_firstPrecision_1_0=(Token)match(input,RULE_INT,FOLLOW_36); if (state.failed) return current;
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

            // InternalPortugol.g:1982:3: (otherlv_2= ':' ( (lv_secondPrecision_3_0= RULE_INT ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==14) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPortugol.g:1983:4: otherlv_2= ':' ( (lv_secondPrecision_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOptDecimalPrecisionAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalPortugol.g:1987:4: ( (lv_secondPrecision_3_0= RULE_INT ) )
                    // InternalPortugol.g:1988:5: (lv_secondPrecision_3_0= RULE_INT )
                    {
                    // InternalPortugol.g:1988:5: (lv_secondPrecision_3_0= RULE_INT )
                    // InternalPortugol.g:1989:6: lv_secondPrecision_3_0= RULE_INT
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
    // InternalPortugol.g:2010:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalPortugol.g:2010:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalPortugol.g:2011:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalPortugol.g:2017:1: ruleExpression returns [EObject current=null] : this_Assignment_0= ruleAssignment ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:2023:2: (this_Assignment_0= ruleAssignment )
            // InternalPortugol.g:2024:2: this_Assignment_0= ruleAssignment
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
    // InternalPortugol.g:2035:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalPortugol.g:2035:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalPortugol.g:2036:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalPortugol.g:2042:1: ruleAssignment returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression ( ( ( ( () ( ( '<-' ) ) ) )=> ( () ( (lv_op_2_0= '<-' ) ) ) ) ( (lv_right_3_0= ruleAssignment ) ) )* ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_OrExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:2048:2: ( (this_OrExpression_0= ruleOrExpression ( ( ( ( () ( ( '<-' ) ) ) )=> ( () ( (lv_op_2_0= '<-' ) ) ) ) ( (lv_right_3_0= ruleAssignment ) ) )* ) )
            // InternalPortugol.g:2049:2: (this_OrExpression_0= ruleOrExpression ( ( ( ( () ( ( '<-' ) ) ) )=> ( () ( (lv_op_2_0= '<-' ) ) ) ) ( (lv_right_3_0= ruleAssignment ) ) )* )
            {
            // InternalPortugol.g:2049:2: (this_OrExpression_0= ruleOrExpression ( ( ( ( () ( ( '<-' ) ) ) )=> ( () ( (lv_op_2_0= '<-' ) ) ) ) ( (lv_right_3_0= ruleAssignment ) ) )* )
            // InternalPortugol.g:2050:3: this_OrExpression_0= ruleOrExpression ( ( ( ( () ( ( '<-' ) ) ) )=> ( () ( (lv_op_2_0= '<-' ) ) ) ) ( (lv_right_3_0= ruleAssignment ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssignmentAccess().getOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_OrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugol.g:2058:3: ( ( ( ( () ( ( '<-' ) ) ) )=> ( () ( (lv_op_2_0= '<-' ) ) ) ) ( (lv_right_3_0= ruleAssignment ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==49) ) {
                    int LA31_2 = input.LA(2);

                    if ( (synpred1_InternalPortugol()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalPortugol.g:2059:4: ( ( ( () ( ( '<-' ) ) ) )=> ( () ( (lv_op_2_0= '<-' ) ) ) ) ( (lv_right_3_0= ruleAssignment ) )
            	    {
            	    // InternalPortugol.g:2059:4: ( ( ( () ( ( '<-' ) ) ) )=> ( () ( (lv_op_2_0= '<-' ) ) ) )
            	    // InternalPortugol.g:2060:5: ( ( () ( ( '<-' ) ) ) )=> ( () ( (lv_op_2_0= '<-' ) ) )
            	    {
            	    // InternalPortugol.g:2070:5: ( () ( (lv_op_2_0= '<-' ) ) )
            	    // InternalPortugol.g:2071:6: () ( (lv_op_2_0= '<-' ) )
            	    {
            	    // InternalPortugol.g:2071:6: ()
            	    // InternalPortugol.g:2072:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAssignmentAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugol.g:2078:6: ( (lv_op_2_0= '<-' ) )
            	    // InternalPortugol.g:2079:7: (lv_op_2_0= '<-' )
            	    {
            	    // InternalPortugol.g:2079:7: (lv_op_2_0= '<-' )
            	    // InternalPortugol.g:2080:8: lv_op_2_0= '<-'
            	    {
            	    lv_op_2_0=(Token)match(input,49,FOLLOW_21); if (state.failed) return current;
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

            	    // InternalPortugol.g:2094:4: ( (lv_right_3_0= ruleAssignment ) )
            	    // InternalPortugol.g:2095:5: (lv_right_3_0= ruleAssignment )
            	    {
            	    // InternalPortugol.g:2095:5: (lv_right_3_0= ruleAssignment )
            	    // InternalPortugol.g:2096:6: lv_right_3_0= ruleAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAssignmentAccess().getRightAssignmentParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleOrExpression"
    // InternalPortugol.g:2118:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalPortugol.g:2118:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalPortugol.g:2119:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalPortugol.g:2125:1: ruleOrExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( ( ( ( () ( ( 'OU' ) ) ) )=> ( () ( (lv_op_2_0= 'OU' ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_XorExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:2131:2: ( (this_XorExpression_0= ruleXorExpression ( ( ( ( () ( ( 'OU' ) ) ) )=> ( () ( (lv_op_2_0= 'OU' ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) )
            // InternalPortugol.g:2132:2: (this_XorExpression_0= ruleXorExpression ( ( ( ( () ( ( 'OU' ) ) ) )=> ( () ( (lv_op_2_0= 'OU' ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            {
            // InternalPortugol.g:2132:2: (this_XorExpression_0= ruleXorExpression ( ( ( ( () ( ( 'OU' ) ) ) )=> ( () ( (lv_op_2_0= 'OU' ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            // InternalPortugol.g:2133:3: this_XorExpression_0= ruleXorExpression ( ( ( ( () ( ( 'OU' ) ) ) )=> ( () ( (lv_op_2_0= 'OU' ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugol.g:2141:3: ( ( ( ( () ( ( 'OU' ) ) ) )=> ( () ( (lv_op_2_0= 'OU' ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==50) && (synpred2_InternalPortugol())) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPortugol.g:2142:4: ( ( ( () ( ( 'OU' ) ) ) )=> ( () ( (lv_op_2_0= 'OU' ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) )
            	    {
            	    // InternalPortugol.g:2142:4: ( ( ( () ( ( 'OU' ) ) ) )=> ( () ( (lv_op_2_0= 'OU' ) ) ) )
            	    // InternalPortugol.g:2143:5: ( ( () ( ( 'OU' ) ) ) )=> ( () ( (lv_op_2_0= 'OU' ) ) )
            	    {
            	    // InternalPortugol.g:2153:5: ( () ( (lv_op_2_0= 'OU' ) ) )
            	    // InternalPortugol.g:2154:6: () ( (lv_op_2_0= 'OU' ) )
            	    {
            	    // InternalPortugol.g:2154:6: ()
            	    // InternalPortugol.g:2155:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getOrExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugol.g:2161:6: ( (lv_op_2_0= 'OU' ) )
            	    // InternalPortugol.g:2162:7: (lv_op_2_0= 'OU' )
            	    {
            	    // InternalPortugol.g:2162:7: (lv_op_2_0= 'OU' )
            	    // InternalPortugol.g:2163:8: lv_op_2_0= 'OU'
            	    {
            	    lv_op_2_0=(Token)match(input,50,FOLLOW_21); if (state.failed) return current;
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

            	    // InternalPortugol.g:2177:4: ( (lv_right_3_0= ruleXorExpression ) )
            	    // InternalPortugol.g:2178:5: (lv_right_3_0= ruleXorExpression )
            	    {
            	    // InternalPortugol.g:2178:5: (lv_right_3_0= ruleXorExpression )
            	    // InternalPortugol.g:2179:6: lv_right_3_0= ruleXorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightXorExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleXorExpression"
    // InternalPortugol.g:2201:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalPortugol.g:2201:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalPortugol.g:2202:2: iv_ruleXorExpression= ruleXorExpression EOF
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
    // InternalPortugol.g:2208:1: ruleXorExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( 'XOU' ) ) ) )=> ( () ( (lv_op_2_0= 'XOU' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:2214:2: ( (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( 'XOU' ) ) ) )=> ( () ( (lv_op_2_0= 'XOU' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalPortugol.g:2215:2: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( 'XOU' ) ) ) )=> ( () ( (lv_op_2_0= 'XOU' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalPortugol.g:2215:2: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( 'XOU' ) ) ) )=> ( () ( (lv_op_2_0= 'XOU' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalPortugol.g:2216:3: this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( 'XOU' ) ) ) )=> ( () ( (lv_op_2_0= 'XOU' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_40);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugol.g:2224:3: ( ( ( ( () ( ( 'XOU' ) ) ) )=> ( () ( (lv_op_2_0= 'XOU' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==51) && (synpred3_InternalPortugol())) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPortugol.g:2225:4: ( ( ( () ( ( 'XOU' ) ) ) )=> ( () ( (lv_op_2_0= 'XOU' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalPortugol.g:2225:4: ( ( ( () ( ( 'XOU' ) ) ) )=> ( () ( (lv_op_2_0= 'XOU' ) ) ) )
            	    // InternalPortugol.g:2226:5: ( ( () ( ( 'XOU' ) ) ) )=> ( () ( (lv_op_2_0= 'XOU' ) ) )
            	    {
            	    // InternalPortugol.g:2236:5: ( () ( (lv_op_2_0= 'XOU' ) ) )
            	    // InternalPortugol.g:2237:6: () ( (lv_op_2_0= 'XOU' ) )
            	    {
            	    // InternalPortugol.g:2237:6: ()
            	    // InternalPortugol.g:2238:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getXorExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugol.g:2244:6: ( (lv_op_2_0= 'XOU' ) )
            	    // InternalPortugol.g:2245:7: (lv_op_2_0= 'XOU' )
            	    {
            	    // InternalPortugol.g:2245:7: (lv_op_2_0= 'XOU' )
            	    // InternalPortugol.g:2246:8: lv_op_2_0= 'XOU'
            	    {
            	    lv_op_2_0=(Token)match(input,51,FOLLOW_21); if (state.failed) return current;
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

            	    // InternalPortugol.g:2260:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalPortugol.g:2261:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalPortugol.g:2261:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalPortugol.g:2262:6: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXorExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
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
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalPortugol.g:2284:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalPortugol.g:2284:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalPortugol.g:2285:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalPortugol.g:2291:1: ruleAndExpression returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( ( ( () ( ( ( '&' | 'E' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:2297:2: ( (this_Comparison_0= ruleComparison ( ( ( ( () ( ( ( '&' | 'E' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalPortugol.g:2298:2: (this_Comparison_0= ruleComparison ( ( ( ( () ( ( ( '&' | 'E' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalPortugol.g:2298:2: (this_Comparison_0= ruleComparison ( ( ( ( () ( ( ( '&' | 'E' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalPortugol.g:2299:3: this_Comparison_0= ruleComparison ( ( ( ( () ( ( ( '&' | 'E' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_41);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugol.g:2307:3: ( ( ( ( () ( ( ( '&' | 'E' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==52) && (synpred4_InternalPortugol())) {
                    alt35=1;
                }
                else if ( (LA35_0==53) && (synpred4_InternalPortugol())) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalPortugol.g:2308:4: ( ( ( () ( ( ( '&' | 'E' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) ) ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalPortugol.g:2308:4: ( ( ( () ( ( ( '&' | 'E' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) ) ) ) )
            	    // InternalPortugol.g:2309:5: ( ( () ( ( ( '&' | 'E' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) ) ) )
            	    {
            	    // InternalPortugol.g:2323:5: ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) ) ) )
            	    // InternalPortugol.g:2324:6: () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) ) )
            	    {
            	    // InternalPortugol.g:2324:6: ()
            	    // InternalPortugol.g:2325:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAndExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugol.g:2331:6: ( ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) ) )
            	    // InternalPortugol.g:2332:7: ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) )
            	    {
            	    // InternalPortugol.g:2332:7: ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) )
            	    // InternalPortugol.g:2333:8: (lv_op_2_1= '&' | lv_op_2_2= 'E' )
            	    {
            	    // InternalPortugol.g:2333:8: (lv_op_2_1= '&' | lv_op_2_2= 'E' )
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==52) ) {
            	        alt34=1;
            	    }
            	    else if ( (LA34_0==53) ) {
            	        alt34=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // InternalPortugol.g:2334:9: lv_op_2_1= '&'
            	            {
            	            lv_op_2_1=(Token)match(input,52,FOLLOW_21); if (state.failed) return current;
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
            	            // InternalPortugol.g:2345:9: lv_op_2_2= 'E'
            	            {
            	            lv_op_2_2=(Token)match(input,53,FOLLOW_21); if (state.failed) return current;
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

            	    // InternalPortugol.g:2360:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalPortugol.g:2361:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalPortugol.g:2361:5: (lv_right_3_0= ruleComparison )
            	    // InternalPortugol.g:2362:6: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleComparison"
    // InternalPortugol.g:2384:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalPortugol.g:2384:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalPortugol.g:2385:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalPortugol.g:2391:1: ruleComparison returns [EObject current=null] : (this_EquExpression_0= ruleEquExpression ( ( ( ( () ( ( ( '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_EquExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:2397:2: ( (this_EquExpression_0= ruleEquExpression ( ( ( ( () ( ( ( '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )* ) )
            // InternalPortugol.g:2398:2: (this_EquExpression_0= ruleEquExpression ( ( ( ( () ( ( ( '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )* )
            {
            // InternalPortugol.g:2398:2: (this_EquExpression_0= ruleEquExpression ( ( ( ( () ( ( ( '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )* )
            // InternalPortugol.g:2399:3: this_EquExpression_0= ruleEquExpression ( ( ( ( () ( ( ( '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getEquExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_42);
            this_EquExpression_0=ruleEquExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EquExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugol.g:2407:3: ( ( ( ( () ( ( ( '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==54) && (synpred5_InternalPortugol())) {
                    alt37=1;
                }
                else if ( (LA37_0==55) && (synpred5_InternalPortugol())) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalPortugol.g:2408:4: ( ( ( () ( ( ( '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) )
            	    {
            	    // InternalPortugol.g:2408:4: ( ( ( () ( ( ( '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ) )
            	    // InternalPortugol.g:2409:5: ( ( () ( ( ( '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) )
            	    {
            	    // InternalPortugol.g:2423:5: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) )
            	    // InternalPortugol.g:2424:6: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) )
            	    {
            	    // InternalPortugol.g:2424:6: ()
            	    // InternalPortugol.g:2425:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getComparisonAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugol.g:2431:6: ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) )
            	    // InternalPortugol.g:2432:7: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
            	    {
            	    // InternalPortugol.g:2432:7: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
            	    // InternalPortugol.g:2433:8: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
            	    {
            	    // InternalPortugol.g:2433:8: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==54) ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0==55) ) {
            	        alt36=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalPortugol.g:2434:9: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,54,FOLLOW_21); if (state.failed) return current;
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
            	            // InternalPortugol.g:2445:9: lv_op_2_2= '<>'
            	            {
            	            lv_op_2_2=(Token)match(input,55,FOLLOW_21); if (state.failed) return current;
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

            	    // InternalPortugol.g:2460:4: ( (lv_right_3_0= ruleEquExpression ) )
            	    // InternalPortugol.g:2461:5: (lv_right_3_0= ruleEquExpression )
            	    {
            	    // InternalPortugol.g:2461:5: (lv_right_3_0= ruleEquExpression )
            	    // InternalPortugol.g:2462:6: lv_right_3_0= ruleEquExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightEquExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
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
    // InternalPortugol.g:2484:1: entryRuleEquExpression returns [EObject current=null] : iv_ruleEquExpression= ruleEquExpression EOF ;
    public final EObject entryRuleEquExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquExpression = null;


        try {
            // InternalPortugol.g:2484:54: (iv_ruleEquExpression= ruleEquExpression EOF )
            // InternalPortugol.g:2485:2: iv_ruleEquExpression= ruleEquExpression EOF
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
    // InternalPortugol.g:2491:1: ruleEquExpression returns [EObject current=null] : (this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ( '<' | '>' | '<=' | '>=' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* ) ;
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
            // InternalPortugol.g:2497:2: ( (this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ( '<' | '>' | '<=' | '>=' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* ) )
            // InternalPortugol.g:2498:2: (this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ( '<' | '>' | '<=' | '>=' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* )
            {
            // InternalPortugol.g:2498:2: (this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ( '<' | '>' | '<=' | '>=' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* )
            // InternalPortugol.g:2499:3: this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ( '<' | '>' | '<=' | '>=' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEquExpressionAccess().getAddExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_43);
            this_AddExpression_0=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AddExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugol.g:2507:3: ( ( ( ( () ( ( ( '<' | '>' | '<=' | '>=' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==56) && (synpred6_InternalPortugol())) {
                    alt39=1;
                }
                else if ( (LA39_0==57) && (synpred6_InternalPortugol())) {
                    alt39=1;
                }
                else if ( (LA39_0==58) && (synpred6_InternalPortugol())) {
                    alt39=1;
                }
                else if ( (LA39_0==59) && (synpred6_InternalPortugol())) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalPortugol.g:2508:4: ( ( ( () ( ( ( '<' | '>' | '<=' | '>=' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) )
            	    {
            	    // InternalPortugol.g:2508:4: ( ( ( () ( ( ( '<' | '>' | '<=' | '>=' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ) )
            	    // InternalPortugol.g:2509:5: ( ( () ( ( ( '<' | '>' | '<=' | '>=' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) )
            	    {
            	    // InternalPortugol.g:2527:5: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) )
            	    // InternalPortugol.g:2528:6: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) )
            	    {
            	    // InternalPortugol.g:2528:6: ()
            	    // InternalPortugol.g:2529:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getEquExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugol.g:2535:6: ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) )
            	    // InternalPortugol.g:2536:7: ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) )
            	    {
            	    // InternalPortugol.g:2536:7: ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) )
            	    // InternalPortugol.g:2537:8: (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' )
            	    {
            	    // InternalPortugol.g:2537:8: (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' )
            	    int alt38=4;
            	    switch ( input.LA(1) ) {
            	    case 56:
            	        {
            	        alt38=1;
            	        }
            	        break;
            	    case 57:
            	        {
            	        alt38=2;
            	        }
            	        break;
            	    case 58:
            	        {
            	        alt38=3;
            	        }
            	        break;
            	    case 59:
            	        {
            	        alt38=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt38) {
            	        case 1 :
            	            // InternalPortugol.g:2538:9: lv_op_2_1= '<'
            	            {
            	            lv_op_2_1=(Token)match(input,56,FOLLOW_21); if (state.failed) return current;
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
            	            // InternalPortugol.g:2549:9: lv_op_2_2= '>'
            	            {
            	            lv_op_2_2=(Token)match(input,57,FOLLOW_21); if (state.failed) return current;
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
            	            // InternalPortugol.g:2560:9: lv_op_2_3= '<='
            	            {
            	            lv_op_2_3=(Token)match(input,58,FOLLOW_21); if (state.failed) return current;
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
            	            // InternalPortugol.g:2571:9: lv_op_2_4= '>='
            	            {
            	            lv_op_2_4=(Token)match(input,59,FOLLOW_21); if (state.failed) return current;
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

            	    // InternalPortugol.g:2586:4: ( (lv_right_3_0= ruleAddExpression ) )
            	    // InternalPortugol.g:2587:5: (lv_right_3_0= ruleAddExpression )
            	    {
            	    // InternalPortugol.g:2587:5: (lv_right_3_0= ruleAddExpression )
            	    // InternalPortugol.g:2588:6: lv_right_3_0= ruleAddExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEquExpressionAccess().getRightAddExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_43);
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
    // $ANTLR end "ruleEquExpression"


    // $ANTLR start "entryRuleAddExpression"
    // InternalPortugol.g:2610:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalPortugol.g:2610:54: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalPortugol.g:2611:2: iv_ruleAddExpression= ruleAddExpression EOF
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
    // InternalPortugol.g:2617:1: ruleAddExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:2623:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalPortugol.g:2624:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalPortugol.g:2624:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalPortugol.g:2625:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAddExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_44);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugol.g:2633:3: ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==60) && (synpred7_InternalPortugol())) {
                    alt41=1;
                }
                else if ( (LA41_0==61) && (synpred7_InternalPortugol())) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPortugol.g:2634:4: ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalPortugol.g:2634:4: ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) )
            	    // InternalPortugol.g:2635:5: ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) )
            	    {
            	    // InternalPortugol.g:2649:5: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) )
            	    // InternalPortugol.g:2650:6: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    {
            	    // InternalPortugol.g:2650:6: ()
            	    // InternalPortugol.g:2651:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAddExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugol.g:2657:6: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // InternalPortugol.g:2658:7: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // InternalPortugol.g:2658:7: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // InternalPortugol.g:2659:8: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // InternalPortugol.g:2659:8: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==60) ) {
            	        alt40=1;
            	    }
            	    else if ( (LA40_0==61) ) {
            	        alt40=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 40, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalPortugol.g:2660:9: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,60,FOLLOW_21); if (state.failed) return current;
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
            	            // InternalPortugol.g:2671:9: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,61,FOLLOW_21); if (state.failed) return current;
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

            	    // InternalPortugol.g:2686:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalPortugol.g:2687:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalPortugol.g:2687:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalPortugol.g:2688:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAddExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
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
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalPortugol.g:2710:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalPortugol.g:2710:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalPortugol.g:2711:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalPortugol.g:2717:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_PowerExpression_0= rulePowerExpression ( ( ( ( () ( ( ( '*' | '/' | 'MOD' | '%' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )* ) ;
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
            // InternalPortugol.g:2723:2: ( (this_PowerExpression_0= rulePowerExpression ( ( ( ( () ( ( ( '*' | '/' | 'MOD' | '%' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )* ) )
            // InternalPortugol.g:2724:2: (this_PowerExpression_0= rulePowerExpression ( ( ( ( () ( ( ( '*' | '/' | 'MOD' | '%' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )* )
            {
            // InternalPortugol.g:2724:2: (this_PowerExpression_0= rulePowerExpression ( ( ( ( () ( ( ( '*' | '/' | 'MOD' | '%' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )* )
            // InternalPortugol.g:2725:3: this_PowerExpression_0= rulePowerExpression ( ( ( ( () ( ( ( '*' | '/' | 'MOD' | '%' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getPowerExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_45);
            this_PowerExpression_0=rulePowerExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PowerExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugol.g:2733:3: ( ( ( ( () ( ( ( '*' | '/' | 'MOD' | '%' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==62) && (synpred8_InternalPortugol())) {
                    alt43=1;
                }
                else if ( (LA43_0==63) && (synpred8_InternalPortugol())) {
                    alt43=1;
                }
                else if ( (LA43_0==64) && (synpred8_InternalPortugol())) {
                    alt43=1;
                }
                else if ( (LA43_0==65) && (synpred8_InternalPortugol())) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalPortugol.g:2734:4: ( ( ( () ( ( ( '*' | '/' | 'MOD' | '%' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) )
            	    {
            	    // InternalPortugol.g:2734:4: ( ( ( () ( ( ( '*' | '/' | 'MOD' | '%' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) ) ) ) )
            	    // InternalPortugol.g:2735:5: ( ( () ( ( ( '*' | '/' | 'MOD' | '%' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) ) ) )
            	    {
            	    // InternalPortugol.g:2753:5: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) ) ) )
            	    // InternalPortugol.g:2754:6: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) ) )
            	    {
            	    // InternalPortugol.g:2754:6: ()
            	    // InternalPortugol.g:2755:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugol.g:2761:6: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) ) )
            	    // InternalPortugol.g:2762:7: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) )
            	    {
            	    // InternalPortugol.g:2762:7: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) )
            	    // InternalPortugol.g:2763:8: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' )
            	    {
            	    // InternalPortugol.g:2763:8: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' )
            	    int alt42=4;
            	    switch ( input.LA(1) ) {
            	    case 62:
            	        {
            	        alt42=1;
            	        }
            	        break;
            	    case 63:
            	        {
            	        alt42=2;
            	        }
            	        break;
            	    case 64:
            	        {
            	        alt42=3;
            	        }
            	        break;
            	    case 65:
            	        {
            	        alt42=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt42) {
            	        case 1 :
            	            // InternalPortugol.g:2764:9: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,62,FOLLOW_21); if (state.failed) return current;
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
            	            // InternalPortugol.g:2775:9: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,63,FOLLOW_21); if (state.failed) return current;
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
            	            // InternalPortugol.g:2786:9: lv_op_2_3= 'MOD'
            	            {
            	            lv_op_2_3=(Token)match(input,64,FOLLOW_21); if (state.failed) return current;
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
            	            // InternalPortugol.g:2797:9: lv_op_2_4= '%'
            	            {
            	            lv_op_2_4=(Token)match(input,65,FOLLOW_21); if (state.failed) return current;
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

            	    // InternalPortugol.g:2812:4: ( (lv_right_3_0= rulePowerExpression ) )
            	    // InternalPortugol.g:2813:5: (lv_right_3_0= rulePowerExpression )
            	    {
            	    // InternalPortugol.g:2813:5: (lv_right_3_0= rulePowerExpression )
            	    // InternalPortugol.g:2814:6: lv_right_3_0= rulePowerExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightPowerExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_45);
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRulePowerExpression"
    // InternalPortugol.g:2836:1: entryRulePowerExpression returns [EObject current=null] : iv_rulePowerExpression= rulePowerExpression EOF ;
    public final EObject entryRulePowerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerExpression = null;


        try {
            // InternalPortugol.g:2836:56: (iv_rulePowerExpression= rulePowerExpression EOF )
            // InternalPortugol.g:2837:2: iv_rulePowerExpression= rulePowerExpression EOF
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
    // InternalPortugol.g:2843:1: rulePowerExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( ( ( ( () ( ( '^' ) ) ) )=> ( () ( (lv_op_2_0= '^' ) ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject rulePowerExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:2849:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( ( ( ( () ( ( '^' ) ) ) )=> ( () ( (lv_op_2_0= '^' ) ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) )
            // InternalPortugol.g:2850:2: (this_UnaryExpression_0= ruleUnaryExpression ( ( ( ( () ( ( '^' ) ) ) )=> ( () ( (lv_op_2_0= '^' ) ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            {
            // InternalPortugol.g:2850:2: (this_UnaryExpression_0= ruleUnaryExpression ( ( ( ( () ( ( '^' ) ) ) )=> ( () ( (lv_op_2_0= '^' ) ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            // InternalPortugol.g:2851:3: this_UnaryExpression_0= ruleUnaryExpression ( ( ( ( () ( ( '^' ) ) ) )=> ( () ( (lv_op_2_0= '^' ) ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPowerExpressionAccess().getUnaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_46);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugol.g:2859:3: ( ( ( ( () ( ( '^' ) ) ) )=> ( () ( (lv_op_2_0= '^' ) ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==66) && (synpred9_InternalPortugol())) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalPortugol.g:2860:4: ( ( ( () ( ( '^' ) ) ) )=> ( () ( (lv_op_2_0= '^' ) ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) )
            	    {
            	    // InternalPortugol.g:2860:4: ( ( ( () ( ( '^' ) ) ) )=> ( () ( (lv_op_2_0= '^' ) ) ) )
            	    // InternalPortugol.g:2861:5: ( ( () ( ( '^' ) ) ) )=> ( () ( (lv_op_2_0= '^' ) ) )
            	    {
            	    // InternalPortugol.g:2871:5: ( () ( (lv_op_2_0= '^' ) ) )
            	    // InternalPortugol.g:2872:6: () ( (lv_op_2_0= '^' ) )
            	    {
            	    // InternalPortugol.g:2872:6: ()
            	    // InternalPortugol.g:2873:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getPowerExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugol.g:2879:6: ( (lv_op_2_0= '^' ) )
            	    // InternalPortugol.g:2880:7: (lv_op_2_0= '^' )
            	    {
            	    // InternalPortugol.g:2880:7: (lv_op_2_0= '^' )
            	    // InternalPortugol.g:2881:8: lv_op_2_0= '^'
            	    {
            	    lv_op_2_0=(Token)match(input,66,FOLLOW_21); if (state.failed) return current;
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

            	    // InternalPortugol.g:2895:4: ( (lv_right_3_0= ruleUnaryExpression ) )
            	    // InternalPortugol.g:2896:5: (lv_right_3_0= ruleUnaryExpression )
            	    {
            	    // InternalPortugol.g:2896:5: (lv_right_3_0= ruleUnaryExpression )
            	    // InternalPortugol.g:2897:6: lv_right_3_0= ruleUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPowerExpressionAccess().getRightUnaryExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_46);
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
            	    break loop44;
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
    // InternalPortugol.g:2919:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalPortugol.g:2919:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalPortugol.g:2920:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalPortugol.g:2926:1: ruleUnaryExpression returns [EObject current=null] : ( ( () ( ( (lv_op_1_1= 'NOT' | lv_op_1_2= '-' ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        EObject lv_operand_2_0 = null;

        EObject this_PrimaryExpression_3 = null;



        	enterRule();

        try {
            // InternalPortugol.g:2932:2: ( ( ( () ( ( (lv_op_1_1= 'NOT' | lv_op_1_2= '-' ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) )
            // InternalPortugol.g:2933:2: ( ( () ( ( (lv_op_1_1= 'NOT' | lv_op_1_2= '-' ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            {
            // InternalPortugol.g:2933:2: ( ( () ( ( (lv_op_1_1= 'NOT' | lv_op_1_2= '-' ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==61||LA46_0==67) ) {
                alt46=1;
            }
            else if ( ((LA46_0>=RULE_STRING && LA46_0<=RULE_FLOAT)||LA46_0==21) ) {
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
                    // InternalPortugol.g:2934:3: ( () ( ( (lv_op_1_1= 'NOT' | lv_op_1_2= '-' ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) )
                    {
                    // InternalPortugol.g:2934:3: ( () ( ( (lv_op_1_1= 'NOT' | lv_op_1_2= '-' ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) )
                    // InternalPortugol.g:2935:4: () ( ( (lv_op_1_1= 'NOT' | lv_op_1_2= '-' ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) )
                    {
                    // InternalPortugol.g:2935:4: ()
                    // InternalPortugol.g:2936:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPortugol.g:2942:4: ( ( (lv_op_1_1= 'NOT' | lv_op_1_2= '-' ) ) )
                    // InternalPortugol.g:2943:5: ( (lv_op_1_1= 'NOT' | lv_op_1_2= '-' ) )
                    {
                    // InternalPortugol.g:2943:5: ( (lv_op_1_1= 'NOT' | lv_op_1_2= '-' ) )
                    // InternalPortugol.g:2944:6: (lv_op_1_1= 'NOT' | lv_op_1_2= '-' )
                    {
                    // InternalPortugol.g:2944:6: (lv_op_1_1= 'NOT' | lv_op_1_2= '-' )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==67) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==61) ) {
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
                            // InternalPortugol.g:2945:7: lv_op_1_1= 'NOT'
                            {
                            lv_op_1_1=(Token)match(input,67,FOLLOW_21); if (state.failed) return current;
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
                            // InternalPortugol.g:2956:7: lv_op_1_2= '-'
                            {
                            lv_op_1_2=(Token)match(input,61,FOLLOW_21); if (state.failed) return current;
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

                    // InternalPortugol.g:2969:4: ( (lv_operand_2_0= ruleUnaryExpression ) )
                    // InternalPortugol.g:2970:5: (lv_operand_2_0= ruleUnaryExpression )
                    {
                    // InternalPortugol.g:2970:5: (lv_operand_2_0= ruleUnaryExpression )
                    // InternalPortugol.g:2971:6: lv_operand_2_0= ruleUnaryExpression
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
                    // InternalPortugol.g:2990:3: this_PrimaryExpression_3= rulePrimaryExpression
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
    // InternalPortugol.g:3002:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalPortugol.g:3002:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalPortugol.g:3003:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalPortugol.g:3009:1: rulePrimaryExpression returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_FunctionCall_1= ruleFunctionCall | this_DeclaredVar_2= ruleDeclaredVar | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_Literal_0 = null;

        EObject this_FunctionCall_1 = null;

        EObject this_DeclaredVar_2 = null;

        EObject this_Expression_4 = null;



        	enterRule();

        try {
            // InternalPortugol.g:3015:2: ( (this_Literal_0= ruleLiteral | this_FunctionCall_1= ruleFunctionCall | this_DeclaredVar_2= ruleDeclaredVar | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) ) )
            // InternalPortugol.g:3016:2: (this_Literal_0= ruleLiteral | this_FunctionCall_1= ruleFunctionCall | this_DeclaredVar_2= ruleDeclaredVar | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) )
            {
            // InternalPortugol.g:3016:2: (this_Literal_0= ruleLiteral | this_FunctionCall_1= ruleFunctionCall | this_DeclaredVar_2= ruleDeclaredVar | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) )
            int alt47=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_FLOAT:
                {
                alt47=1;
                }
                break;
            case RULE_ID:
                {
                int LA47_2 = input.LA(2);

                if ( (LA47_2==21) ) {
                    alt47=2;
                }
                else if ( (LA47_2==EOF||(LA47_2>=14 && LA47_2<=15)||LA47_2==22||LA47_2==29||(LA47_2>=38 && LA47_2<=41)||(LA47_2>=49 && LA47_2<=66)||LA47_2==68) ) {
                    alt47=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 2, input);

                    throw nvae;
                }
                }
                break;
            case 21:
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
                    // InternalPortugol.g:3017:3: this_Literal_0= ruleLiteral
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
                    // InternalPortugol.g:3026:3: this_FunctionCall_1= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_1=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunctionCall_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPortugol.g:3035:3: this_DeclaredVar_2= ruleDeclaredVar
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getDeclaredVarParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DeclaredVar_2=ruleDeclaredVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DeclaredVar_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPortugol.g:3044:3: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    {
                    // InternalPortugol.g:3044:3: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    // InternalPortugol.g:3045:4: otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_14);
                    this_Expression_4=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_4;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_5=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_2());
                      			
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


    // $ANTLR start "entryRuleFunctionCall"
    // InternalPortugol.g:3066:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalPortugol.g:3066:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalPortugol.g:3067:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalPortugol.g:3073:1: ruleFunctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_param_2_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:3079:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= ')' ) )
            // InternalPortugol.g:3080:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= ')' )
            {
            // InternalPortugol.g:3080:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= ')' )
            // InternalPortugol.g:3081:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= ')'
            {
            // InternalPortugol.g:3081:3: ( (otherlv_0= RULE_ID ) )
            // InternalPortugol.g:3082:4: (otherlv_0= RULE_ID )
            {
            // InternalPortugol.g:3082:4: (otherlv_0= RULE_ID )
            // InternalPortugol.g:3083:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionCallRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getFbNameFunctionNameCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalPortugol.g:3098:3: ( (lv_param_2_0= ruleSubprogramParam ) )
            // InternalPortugol.g:3099:4: (lv_param_2_0= ruleSubprogramParam )
            {
            // InternalPortugol.g:3099:4: (lv_param_2_0= ruleSubprogramParam )
            // InternalPortugol.g:3100:5: lv_param_2_0= ruleSubprogramParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionCallAccess().getParamSubprogramParamParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_14);
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

            otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleLiteral"
    // InternalPortugol.g:3125:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalPortugol.g:3125:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalPortugol.g:3126:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalPortugol.g:3132:1: ruleLiteral returns [EObject current=null] : (this_NumericLiteral_0= ruleNumericLiteral | this_StringExpression_1= ruleStringExpression ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NumericLiteral_0 = null;

        EObject this_StringExpression_1 = null;



        	enterRule();

        try {
            // InternalPortugol.g:3138:2: ( (this_NumericLiteral_0= ruleNumericLiteral | this_StringExpression_1= ruleStringExpression ) )
            // InternalPortugol.g:3139:2: (this_NumericLiteral_0= ruleNumericLiteral | this_StringExpression_1= ruleStringExpression )
            {
            // InternalPortugol.g:3139:2: (this_NumericLiteral_0= ruleNumericLiteral | this_StringExpression_1= ruleStringExpression )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_INT && LA48_0<=RULE_FLOAT)) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_STRING) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalPortugol.g:3140:3: this_NumericLiteral_0= ruleNumericLiteral
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
                    // InternalPortugol.g:3149:3: this_StringExpression_1= ruleStringExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getStringExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringExpression_1=ruleStringExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringExpression_1;
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
    // InternalPortugol.g:3161:1: entryRuleDeclaredVar returns [EObject current=null] : iv_ruleDeclaredVar= ruleDeclaredVar EOF ;
    public final EObject entryRuleDeclaredVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredVar = null;


        try {
            // InternalPortugol.g:3161:52: (iv_ruleDeclaredVar= ruleDeclaredVar EOF )
            // InternalPortugol.g:3162:2: iv_ruleDeclaredVar= ruleDeclaredVar EOF
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
    // InternalPortugol.g:3168:1: ruleDeclaredVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDeclaredVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalPortugol.g:3174:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalPortugol.g:3175:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalPortugol.g:3175:2: ( (otherlv_0= RULE_ID ) )
            // InternalPortugol.g:3176:3: (otherlv_0= RULE_ID )
            {
            // InternalPortugol.g:3176:3: (otherlv_0= RULE_ID )
            // InternalPortugol.g:3177:4: otherlv_0= RULE_ID
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
    // InternalPortugol.g:3191:1: entryRuleNumericLiteral returns [EObject current=null] : iv_ruleNumericLiteral= ruleNumericLiteral EOF ;
    public final EObject entryRuleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteral = null;


        try {
            // InternalPortugol.g:3191:55: (iv_ruleNumericLiteral= ruleNumericLiteral EOF )
            // InternalPortugol.g:3192:2: iv_ruleNumericLiteral= ruleNumericLiteral EOF
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
    // InternalPortugol.g:3198:1: ruleNumericLiteral returns [EObject current=null] : ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleNumericLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_intValue_0_0=null;
        Token lv_floatValue_1_0=null;


        	enterRule();

        try {
            // InternalPortugol.g:3204:2: ( ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= RULE_FLOAT ) ) ) )
            // InternalPortugol.g:3205:2: ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= RULE_FLOAT ) ) )
            {
            // InternalPortugol.g:3205:2: ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= RULE_FLOAT ) ) )
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
                    // InternalPortugol.g:3206:3: ( (lv_intValue_0_0= RULE_INT ) )
                    {
                    // InternalPortugol.g:3206:3: ( (lv_intValue_0_0= RULE_INT ) )
                    // InternalPortugol.g:3207:4: (lv_intValue_0_0= RULE_INT )
                    {
                    // InternalPortugol.g:3207:4: (lv_intValue_0_0= RULE_INT )
                    // InternalPortugol.g:3208:5: lv_intValue_0_0= RULE_INT
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
                    // InternalPortugol.g:3225:3: ( (lv_floatValue_1_0= RULE_FLOAT ) )
                    {
                    // InternalPortugol.g:3225:3: ( (lv_floatValue_1_0= RULE_FLOAT ) )
                    // InternalPortugol.g:3226:4: (lv_floatValue_1_0= RULE_FLOAT )
                    {
                    // InternalPortugol.g:3226:4: (lv_floatValue_1_0= RULE_FLOAT )
                    // InternalPortugol.g:3227:5: lv_floatValue_1_0= RULE_FLOAT
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
    // InternalPortugol.g:3247:1: entryRuleStringExpression returns [EObject current=null] : iv_ruleStringExpression= ruleStringExpression EOF ;
    public final EObject entryRuleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpression = null;


        try {
            // InternalPortugol.g:3247:57: (iv_ruleStringExpression= ruleStringExpression EOF )
            // InternalPortugol.g:3248:2: iv_ruleStringExpression= ruleStringExpression EOF
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
    // InternalPortugol.g:3254:1: ruleStringExpression returns [EObject current=null] : ( (lv_literalString_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringExpression() throws RecognitionException {
        EObject current = null;

        Token lv_literalString_0_0=null;


        	enterRule();

        try {
            // InternalPortugol.g:3260:2: ( ( (lv_literalString_0_0= RULE_STRING ) ) )
            // InternalPortugol.g:3261:2: ( (lv_literalString_0_0= RULE_STRING ) )
            {
            // InternalPortugol.g:3261:2: ( (lv_literalString_0_0= RULE_STRING ) )
            // InternalPortugol.g:3262:3: (lv_literalString_0_0= RULE_STRING )
            {
            // InternalPortugol.g:3262:3: (lv_literalString_0_0= RULE_STRING )
            // InternalPortugol.g:3263:4: lv_literalString_0_0= RULE_STRING
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


    // $ANTLR start "entryRuleEND_COMMAND"
    // InternalPortugol.g:3282:1: entryRuleEND_COMMAND returns [String current=null] : iv_ruleEND_COMMAND= ruleEND_COMMAND EOF ;
    public final String entryRuleEND_COMMAND() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEND_COMMAND = null;


        try {
            // InternalPortugol.g:3282:51: (iv_ruleEND_COMMAND= ruleEND_COMMAND EOF )
            // InternalPortugol.g:3283:2: iv_ruleEND_COMMAND= ruleEND_COMMAND EOF
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
    // InternalPortugol.g:3289:1: ruleEND_COMMAND returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ';' ;
    public final AntlrDatatypeRuleToken ruleEND_COMMAND() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPortugol.g:3295:2: (kw= ';' )
            // InternalPortugol.g:3296:2: kw= ';'
            {
            kw=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalPortugol
    public final void synpred1_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:2060:5: ( ( () ( ( '<-' ) ) ) )
        // InternalPortugol.g:2060:6: ( () ( ( '<-' ) ) )
        {
        // InternalPortugol.g:2060:6: ( () ( ( '<-' ) ) )
        // InternalPortugol.g:2061:6: () ( ( '<-' ) )
        {
        // InternalPortugol.g:2061:6: ()
        // InternalPortugol.g:2062:6: 
        {
        }

        // InternalPortugol.g:2063:6: ( ( '<-' ) )
        // InternalPortugol.g:2064:7: ( '<-' )
        {
        // InternalPortugol.g:2064:7: ( '<-' )
        // InternalPortugol.g:2065:8: '<-'
        {
        match(input,49,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalPortugol

    // $ANTLR start synpred2_InternalPortugol
    public final void synpred2_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:2143:5: ( ( () ( ( 'OU' ) ) ) )
        // InternalPortugol.g:2143:6: ( () ( ( 'OU' ) ) )
        {
        // InternalPortugol.g:2143:6: ( () ( ( 'OU' ) ) )
        // InternalPortugol.g:2144:6: () ( ( 'OU' ) )
        {
        // InternalPortugol.g:2144:6: ()
        // InternalPortugol.g:2145:6: 
        {
        }

        // InternalPortugol.g:2146:6: ( ( 'OU' ) )
        // InternalPortugol.g:2147:7: ( 'OU' )
        {
        // InternalPortugol.g:2147:7: ( 'OU' )
        // InternalPortugol.g:2148:8: 'OU'
        {
        match(input,50,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalPortugol

    // $ANTLR start synpred3_InternalPortugol
    public final void synpred3_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:2226:5: ( ( () ( ( 'XOU' ) ) ) )
        // InternalPortugol.g:2226:6: ( () ( ( 'XOU' ) ) )
        {
        // InternalPortugol.g:2226:6: ( () ( ( 'XOU' ) ) )
        // InternalPortugol.g:2227:6: () ( ( 'XOU' ) )
        {
        // InternalPortugol.g:2227:6: ()
        // InternalPortugol.g:2228:6: 
        {
        }

        // InternalPortugol.g:2229:6: ( ( 'XOU' ) )
        // InternalPortugol.g:2230:7: ( 'XOU' )
        {
        // InternalPortugol.g:2230:7: ( 'XOU' )
        // InternalPortugol.g:2231:8: 'XOU'
        {
        match(input,51,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalPortugol

    // $ANTLR start synpred4_InternalPortugol
    public final void synpred4_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:2309:5: ( ( () ( ( ( '&' | 'E' ) ) ) ) )
        // InternalPortugol.g:2309:6: ( () ( ( ( '&' | 'E' ) ) ) )
        {
        // InternalPortugol.g:2309:6: ( () ( ( ( '&' | 'E' ) ) ) )
        // InternalPortugol.g:2310:6: () ( ( ( '&' | 'E' ) ) )
        {
        // InternalPortugol.g:2310:6: ()
        // InternalPortugol.g:2311:6: 
        {
        }

        // InternalPortugol.g:2312:6: ( ( ( '&' | 'E' ) ) )
        // InternalPortugol.g:2313:7: ( ( '&' | 'E' ) )
        {
        // InternalPortugol.g:2313:7: ( ( '&' | 'E' ) )
        // InternalPortugol.g:2314:8: ( '&' | 'E' )
        {
        if ( (input.LA(1)>=52 && input.LA(1)<=53) ) {
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
    // $ANTLR end synpred4_InternalPortugol

    // $ANTLR start synpred5_InternalPortugol
    public final void synpred5_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:2409:5: ( ( () ( ( ( '=' | '<>' ) ) ) ) )
        // InternalPortugol.g:2409:6: ( () ( ( ( '=' | '<>' ) ) ) )
        {
        // InternalPortugol.g:2409:6: ( () ( ( ( '=' | '<>' ) ) ) )
        // InternalPortugol.g:2410:6: () ( ( ( '=' | '<>' ) ) )
        {
        // InternalPortugol.g:2410:6: ()
        // InternalPortugol.g:2411:6: 
        {
        }

        // InternalPortugol.g:2412:6: ( ( ( '=' | '<>' ) ) )
        // InternalPortugol.g:2413:7: ( ( '=' | '<>' ) )
        {
        // InternalPortugol.g:2413:7: ( ( '=' | '<>' ) )
        // InternalPortugol.g:2414:8: ( '=' | '<>' )
        {
        if ( (input.LA(1)>=54 && input.LA(1)<=55) ) {
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
    // $ANTLR end synpred5_InternalPortugol

    // $ANTLR start synpred6_InternalPortugol
    public final void synpred6_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:2509:5: ( ( () ( ( ( '<' | '>' | '<=' | '>=' ) ) ) ) )
        // InternalPortugol.g:2509:6: ( () ( ( ( '<' | '>' | '<=' | '>=' ) ) ) )
        {
        // InternalPortugol.g:2509:6: ( () ( ( ( '<' | '>' | '<=' | '>=' ) ) ) )
        // InternalPortugol.g:2510:6: () ( ( ( '<' | '>' | '<=' | '>=' ) ) )
        {
        // InternalPortugol.g:2510:6: ()
        // InternalPortugol.g:2511:6: 
        {
        }

        // InternalPortugol.g:2512:6: ( ( ( '<' | '>' | '<=' | '>=' ) ) )
        // InternalPortugol.g:2513:7: ( ( '<' | '>' | '<=' | '>=' ) )
        {
        // InternalPortugol.g:2513:7: ( ( '<' | '>' | '<=' | '>=' ) )
        // InternalPortugol.g:2514:8: ( '<' | '>' | '<=' | '>=' )
        {
        if ( (input.LA(1)>=56 && input.LA(1)<=59) ) {
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
    // $ANTLR end synpred6_InternalPortugol

    // $ANTLR start synpred7_InternalPortugol
    public final void synpred7_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:2635:5: ( ( () ( ( ( '+' | '-' ) ) ) ) )
        // InternalPortugol.g:2635:6: ( () ( ( ( '+' | '-' ) ) ) )
        {
        // InternalPortugol.g:2635:6: ( () ( ( ( '+' | '-' ) ) ) )
        // InternalPortugol.g:2636:6: () ( ( ( '+' | '-' ) ) )
        {
        // InternalPortugol.g:2636:6: ()
        // InternalPortugol.g:2637:6: 
        {
        }

        // InternalPortugol.g:2638:6: ( ( ( '+' | '-' ) ) )
        // InternalPortugol.g:2639:7: ( ( '+' | '-' ) )
        {
        // InternalPortugol.g:2639:7: ( ( '+' | '-' ) )
        // InternalPortugol.g:2640:8: ( '+' | '-' )
        {
        if ( (input.LA(1)>=60 && input.LA(1)<=61) ) {
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
    // $ANTLR end synpred7_InternalPortugol

    // $ANTLR start synpred8_InternalPortugol
    public final void synpred8_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:2735:5: ( ( () ( ( ( '*' | '/' | 'MOD' | '%' ) ) ) ) )
        // InternalPortugol.g:2735:6: ( () ( ( ( '*' | '/' | 'MOD' | '%' ) ) ) )
        {
        // InternalPortugol.g:2735:6: ( () ( ( ( '*' | '/' | 'MOD' | '%' ) ) ) )
        // InternalPortugol.g:2736:6: () ( ( ( '*' | '/' | 'MOD' | '%' ) ) )
        {
        // InternalPortugol.g:2736:6: ()
        // InternalPortugol.g:2737:6: 
        {
        }

        // InternalPortugol.g:2738:6: ( ( ( '*' | '/' | 'MOD' | '%' ) ) )
        // InternalPortugol.g:2739:7: ( ( '*' | '/' | 'MOD' | '%' ) )
        {
        // InternalPortugol.g:2739:7: ( ( '*' | '/' | 'MOD' | '%' ) )
        // InternalPortugol.g:2740:8: ( '*' | '/' | 'MOD' | '%' )
        {
        if ( (input.LA(1)>=62 && input.LA(1)<=65) ) {
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
    // $ANTLR end synpred8_InternalPortugol

    // $ANTLR start synpred9_InternalPortugol
    public final void synpred9_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:2861:5: ( ( () ( ( '^' ) ) ) )
        // InternalPortugol.g:2861:6: ( () ( ( '^' ) ) )
        {
        // InternalPortugol.g:2861:6: ( () ( ( '^' ) ) )
        // InternalPortugol.g:2862:6: () ( ( '^' ) )
        {
        // InternalPortugol.g:2862:6: ()
        // InternalPortugol.g:2863:6: 
        {
        }

        // InternalPortugol.g:2864:6: ( ( '^' ) )
        // InternalPortugol.g:2865:7: ( '^' )
        {
        // InternalPortugol.g:2865:7: ( '^' )
        // InternalPortugol.g:2866:8: '^'
        {
        match(input,66,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalPortugol

    // Delegated rules

    public final boolean synpred7_InternalPortugol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalPortugol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalPortugol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalPortugol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalPortugol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalPortugol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalPortugol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalPortugol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalPortugol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalPortugol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalPortugol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalPortugol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalPortugol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalPortugol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalPortugol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalPortugol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalPortugol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalPortugol_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002900000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x2001E821102000F0L,0x0000000000000008L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x2001E821112000F0L,0x0000000000000008L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x2001E821142000F0L,0x0000000000000008L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x2001E821182000F0L,0x0000000000000008L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x20000000002000F0L,0x0000000000000008L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x2001E821D02000F0L,0x0000000000000008L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x2001E821902000F0L,0x0000000000000008L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001600000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x2001E829102000F2L,0x0000000000000008L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x2001EC21102000F0L,0x0000000000000008L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x2001F821102000F0L,0x0000000000000008L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x2001E8A1102000F0L,0x0000000000000008L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0F00000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});

}