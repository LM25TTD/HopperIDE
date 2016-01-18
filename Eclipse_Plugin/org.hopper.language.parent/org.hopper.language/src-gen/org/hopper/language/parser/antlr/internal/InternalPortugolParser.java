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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_END_COMMAND", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'algoritmo'", "'var'", "':'", "','", "'real'", "'inteiro'", "'caractere'", "'caracter'", "'funcao'", "'('", "')'", "'inicio'", "'fimfuncao'", "'procedimento'", "'fimprocedimento'", "'fimalgoritmo'", "'se'", "'entao'", "'senao'", "'fimse'", "'escolha'", "'fimescolha'", "'caso'", "'interrompa'", "'outrocaso'", "'para'", "'de'", "'ate'", "'passo'", "'faca'", "'fimpara'", "'enquanto'", "'fimenquanto'", "'repita'", "'leia'", "'escreva'", "'escreval'", "'<-'", "'OU'", "'XOU'", "'&'", "'E'", "'='", "'<>'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'MOD'", "'%'", "'^'", "'NOT'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
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
    public static final int RULE_END_COMMAND=5;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=8;
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

            if ( (LA1_0==21||LA1_0==26) ) {
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
    // InternalPortugol.g:166:1: ruleHeaderBlock returns [EObject current=null] : (otherlv_0= 'algoritmo' ( (lv_algorithmName_1_0= RULE_STRING ) ) this_END_COMMAND_2= RULE_END_COMMAND ) ;
    public final EObject ruleHeaderBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_algorithmName_1_0=null;
        Token this_END_COMMAND_2=null;


        	enterRule();

        try {
            // InternalPortugol.g:172:2: ( (otherlv_0= 'algoritmo' ( (lv_algorithmName_1_0= RULE_STRING ) ) this_END_COMMAND_2= RULE_END_COMMAND ) )
            // InternalPortugol.g:173:2: (otherlv_0= 'algoritmo' ( (lv_algorithmName_1_0= RULE_STRING ) ) this_END_COMMAND_2= RULE_END_COMMAND )
            {
            // InternalPortugol.g:173:2: (otherlv_0= 'algoritmo' ( (lv_algorithmName_1_0= RULE_STRING ) ) this_END_COMMAND_2= RULE_END_COMMAND )
            // InternalPortugol.g:174:3: otherlv_0= 'algoritmo' ( (lv_algorithmName_1_0= RULE_STRING ) ) this_END_COMMAND_2= RULE_END_COMMAND
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
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

            this_END_COMMAND_2=(Token)match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_COMMAND_2, grammarAccess.getHeaderBlockAccess().getEND_COMMANDTerminalRuleCall_2());
              		
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
    // InternalPortugol.g:204:1: entryRuleDeclarationsBlock returns [EObject current=null] : iv_ruleDeclarationsBlock= ruleDeclarationsBlock EOF ;
    public final EObject entryRuleDeclarationsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarationsBlock = null;


        try {
            // InternalPortugol.g:204:58: (iv_ruleDeclarationsBlock= ruleDeclarationsBlock EOF )
            // InternalPortugol.g:205:2: iv_ruleDeclarationsBlock= ruleDeclarationsBlock EOF
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
    // InternalPortugol.g:211:1: ruleDeclarationsBlock returns [EObject current=null] : (otherlv_0= 'var' this_END_COMMAND_1= RULE_END_COMMAND ( ( (lv_vars_2_0= ruleVariable ) ) this_END_COMMAND_3= RULE_END_COMMAND )+ ) ;
    public final EObject ruleDeclarationsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_END_COMMAND_1=null;
        Token this_END_COMMAND_3=null;
        EObject lv_vars_2_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:217:2: ( (otherlv_0= 'var' this_END_COMMAND_1= RULE_END_COMMAND ( ( (lv_vars_2_0= ruleVariable ) ) this_END_COMMAND_3= RULE_END_COMMAND )+ ) )
            // InternalPortugol.g:218:2: (otherlv_0= 'var' this_END_COMMAND_1= RULE_END_COMMAND ( ( (lv_vars_2_0= ruleVariable ) ) this_END_COMMAND_3= RULE_END_COMMAND )+ )
            {
            // InternalPortugol.g:218:2: (otherlv_0= 'var' this_END_COMMAND_1= RULE_END_COMMAND ( ( (lv_vars_2_0= ruleVariable ) ) this_END_COMMAND_3= RULE_END_COMMAND )+ )
            // InternalPortugol.g:219:3: otherlv_0= 'var' this_END_COMMAND_1= RULE_END_COMMAND ( ( (lv_vars_2_0= ruleVariable ) ) this_END_COMMAND_3= RULE_END_COMMAND )+
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDeclarationsBlockAccess().getVarKeyword_0());
              		
            }
            this_END_COMMAND_1=(Token)match(input,RULE_END_COMMAND,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_COMMAND_1, grammarAccess.getDeclarationsBlockAccess().getEND_COMMANDTerminalRuleCall_1());
              		
            }
            // InternalPortugol.g:227:3: ( ( (lv_vars_2_0= ruleVariable ) ) this_END_COMMAND_3= RULE_END_COMMAND )+
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
            	    // InternalPortugol.g:228:4: ( (lv_vars_2_0= ruleVariable ) ) this_END_COMMAND_3= RULE_END_COMMAND
            	    {
            	    // InternalPortugol.g:228:4: ( (lv_vars_2_0= ruleVariable ) )
            	    // InternalPortugol.g:229:5: (lv_vars_2_0= ruleVariable )
            	    {
            	    // InternalPortugol.g:229:5: (lv_vars_2_0= ruleVariable )
            	    // InternalPortugol.g:230:6: lv_vars_2_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDeclarationsBlockAccess().getVarsVariableParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_vars_2_0=ruleVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDeclarationsBlockRule());
            	      						}
            	      						add(
            	      							current,
            	      							"vars",
            	      							lv_vars_2_0,
            	      							"org.hopper.language.Portugol.Variable");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    this_END_COMMAND_3=(Token)match(input,RULE_END_COMMAND,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_END_COMMAND_3, grammarAccess.getDeclarationsBlockAccess().getEND_COMMANDTerminalRuleCall_2_1());
            	      			
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
    // InternalPortugol.g:256:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalPortugol.g:256:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalPortugol.g:257:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalPortugol.g:263:1: ruleVariable returns [EObject current=null] : ( ( (lv_varDeclaration_0_0= ruleVarDeclaration ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_varDeclaration_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:269:2: ( ( ( (lv_varDeclaration_0_0= ruleVarDeclaration ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) ) )
            // InternalPortugol.g:270:2: ( ( (lv_varDeclaration_0_0= ruleVarDeclaration ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) )
            {
            // InternalPortugol.g:270:2: ( ( (lv_varDeclaration_0_0= ruleVarDeclaration ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) ) )
            // InternalPortugol.g:271:3: ( (lv_varDeclaration_0_0= ruleVarDeclaration ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVarType ) )
            {
            // InternalPortugol.g:271:3: ( (lv_varDeclaration_0_0= ruleVarDeclaration ) )
            // InternalPortugol.g:272:4: (lv_varDeclaration_0_0= ruleVarDeclaration )
            {
            // InternalPortugol.g:272:4: (lv_varDeclaration_0_0= ruleVarDeclaration )
            // InternalPortugol.g:273:5: lv_varDeclaration_0_0= ruleVarDeclaration
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

            otherlv_1=(Token)match(input,15,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getColonKeyword_1());
              		
            }
            // InternalPortugol.g:294:3: ( (lv_type_2_0= ruleVarType ) )
            // InternalPortugol.g:295:4: (lv_type_2_0= ruleVarType )
            {
            // InternalPortugol.g:295:4: (lv_type_2_0= ruleVarType )
            // InternalPortugol.g:296:5: lv_type_2_0= ruleVarType
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
    // InternalPortugol.g:317:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalPortugol.g:317:55: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalPortugol.g:318:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
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
    // InternalPortugol.g:324:1: ruleVarDeclaration returns [EObject current=null] : ( ( (lv_vars_0_0= ruleVarName ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVarName ) ) )* ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_vars_0_0 = null;

        EObject lv_vars_2_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:330:2: ( ( ( (lv_vars_0_0= ruleVarName ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVarName ) ) )* ) )
            // InternalPortugol.g:331:2: ( ( (lv_vars_0_0= ruleVarName ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVarName ) ) )* )
            {
            // InternalPortugol.g:331:2: ( ( (lv_vars_0_0= ruleVarName ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVarName ) ) )* )
            // InternalPortugol.g:332:3: ( (lv_vars_0_0= ruleVarName ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVarName ) ) )*
            {
            // InternalPortugol.g:332:3: ( (lv_vars_0_0= ruleVarName ) )
            // InternalPortugol.g:333:4: (lv_vars_0_0= ruleVarName )
            {
            // InternalPortugol.g:333:4: (lv_vars_0_0= ruleVarName )
            // InternalPortugol.g:334:5: lv_vars_0_0= ruleVarName
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

            // InternalPortugol.g:351:3: (otherlv_1= ',' ( (lv_vars_2_0= ruleVarName ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPortugol.g:352:4: otherlv_1= ',' ( (lv_vars_2_0= ruleVarName ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getVarDeclarationAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPortugol.g:356:4: ( (lv_vars_2_0= ruleVarName ) )
            	    // InternalPortugol.g:357:5: (lv_vars_2_0= ruleVarName )
            	    {
            	    // InternalPortugol.g:357:5: (lv_vars_2_0= ruleVarName )
            	    // InternalPortugol.g:358:6: lv_vars_2_0= ruleVarName
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
    // InternalPortugol.g:380:1: entryRuleDeclaredVarList returns [EObject current=null] : iv_ruleDeclaredVarList= ruleDeclaredVarList EOF ;
    public final EObject entryRuleDeclaredVarList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredVarList = null;


        try {
            // InternalPortugol.g:380:56: (iv_ruleDeclaredVarList= ruleDeclaredVarList EOF )
            // InternalPortugol.g:381:2: iv_ruleDeclaredVarList= ruleDeclaredVarList EOF
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
    // InternalPortugol.g:387:1: ruleDeclaredVarList returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleDeclaredVarList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPortugol.g:393:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalPortugol.g:394:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalPortugol.g:394:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // InternalPortugol.g:395:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalPortugol.g:395:3: ( (otherlv_0= RULE_ID ) )
            // InternalPortugol.g:396:4: (otherlv_0= RULE_ID )
            {
            // InternalPortugol.g:396:4: (otherlv_0= RULE_ID )
            // InternalPortugol.g:397:5: otherlv_0= RULE_ID
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

            // InternalPortugol.g:408:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPortugol.g:409:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDeclaredVarListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPortugol.g:413:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalPortugol.g:414:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalPortugol.g:414:5: (otherlv_2= RULE_ID )
            	    // InternalPortugol.g:415:6: otherlv_2= RULE_ID
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
    // InternalPortugol.g:431:1: entryRuleVarName returns [EObject current=null] : iv_ruleVarName= ruleVarName EOF ;
    public final EObject entryRuleVarName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarName = null;


        try {
            // InternalPortugol.g:431:48: (iv_ruleVarName= ruleVarName EOF )
            // InternalPortugol.g:432:2: iv_ruleVarName= ruleVarName EOF
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
    // InternalPortugol.g:438:1: ruleVarName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVarName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPortugol.g:444:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPortugol.g:445:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPortugol.g:445:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPortugol.g:446:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPortugol.g:446:3: (lv_name_0_0= RULE_ID )
            // InternalPortugol.g:447:4: lv_name_0_0= RULE_ID
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
    // InternalPortugol.g:466:1: entryRuleVarType returns [EObject current=null] : iv_ruleVarType= ruleVarType EOF ;
    public final EObject entryRuleVarType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarType = null;


        try {
            // InternalPortugol.g:466:48: (iv_ruleVarType= ruleVarType EOF )
            // InternalPortugol.g:467:2: iv_ruleVarType= ruleVarType EOF
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
    // InternalPortugol.g:473:1: ruleVarType returns [EObject current=null] : ( ( (lv_typeName_0_1= 'real' | lv_typeName_0_2= 'inteiro' | lv_typeName_0_3= 'caractere' | lv_typeName_0_4= 'caracter' ) ) ) ;
    public final EObject ruleVarType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;
        Token lv_typeName_0_4=null;


        	enterRule();

        try {
            // InternalPortugol.g:479:2: ( ( ( (lv_typeName_0_1= 'real' | lv_typeName_0_2= 'inteiro' | lv_typeName_0_3= 'caractere' | lv_typeName_0_4= 'caracter' ) ) ) )
            // InternalPortugol.g:480:2: ( ( (lv_typeName_0_1= 'real' | lv_typeName_0_2= 'inteiro' | lv_typeName_0_3= 'caractere' | lv_typeName_0_4= 'caracter' ) ) )
            {
            // InternalPortugol.g:480:2: ( ( (lv_typeName_0_1= 'real' | lv_typeName_0_2= 'inteiro' | lv_typeName_0_3= 'caractere' | lv_typeName_0_4= 'caracter' ) ) )
            // InternalPortugol.g:481:3: ( (lv_typeName_0_1= 'real' | lv_typeName_0_2= 'inteiro' | lv_typeName_0_3= 'caractere' | lv_typeName_0_4= 'caracter' ) )
            {
            // InternalPortugol.g:481:3: ( (lv_typeName_0_1= 'real' | lv_typeName_0_2= 'inteiro' | lv_typeName_0_3= 'caractere' | lv_typeName_0_4= 'caracter' ) )
            // InternalPortugol.g:482:4: (lv_typeName_0_1= 'real' | lv_typeName_0_2= 'inteiro' | lv_typeName_0_3= 'caractere' | lv_typeName_0_4= 'caracter' )
            {
            // InternalPortugol.g:482:4: (lv_typeName_0_1= 'real' | lv_typeName_0_2= 'inteiro' | lv_typeName_0_3= 'caractere' | lv_typeName_0_4= 'caracter' )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            case 20:
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
                    // InternalPortugol.g:483:5: lv_typeName_0_1= 'real'
                    {
                    lv_typeName_0_1=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
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
                    // InternalPortugol.g:494:5: lv_typeName_0_2= 'inteiro'
                    {
                    lv_typeName_0_2=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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
                    // InternalPortugol.g:505:5: lv_typeName_0_3= 'caractere'
                    {
                    lv_typeName_0_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
                    // InternalPortugol.g:516:5: lv_typeName_0_4= 'caracter'
                    {
                    lv_typeName_0_4=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalPortugol.g:532:1: entryRuleSubprograms returns [EObject current=null] : iv_ruleSubprograms= ruleSubprograms EOF ;
    public final EObject entryRuleSubprograms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubprograms = null;


        try {
            // InternalPortugol.g:532:52: (iv_ruleSubprograms= ruleSubprograms EOF )
            // InternalPortugol.g:533:2: iv_ruleSubprograms= ruleSubprograms EOF
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
    // InternalPortugol.g:539:1: ruleSubprograms returns [EObject current=null] : ( (lv_blockSubPrograms_0_0= ruleBlockSubPrograms ) )+ ;
    public final EObject ruleSubprograms() throws RecognitionException {
        EObject current = null;

        EObject lv_blockSubPrograms_0_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:545:2: ( ( (lv_blockSubPrograms_0_0= ruleBlockSubPrograms ) )+ )
            // InternalPortugol.g:546:2: ( (lv_blockSubPrograms_0_0= ruleBlockSubPrograms ) )+
            {
            // InternalPortugol.g:546:2: ( (lv_blockSubPrograms_0_0= ruleBlockSubPrograms ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21||LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPortugol.g:547:3: (lv_blockSubPrograms_0_0= ruleBlockSubPrograms )
            	    {
            	    // InternalPortugol.g:547:3: (lv_blockSubPrograms_0_0= ruleBlockSubPrograms )
            	    // InternalPortugol.g:548:4: lv_blockSubPrograms_0_0= ruleBlockSubPrograms
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
    // InternalPortugol.g:568:1: entryRuleBlockSubPrograms returns [EObject current=null] : iv_ruleBlockSubPrograms= ruleBlockSubPrograms EOF ;
    public final EObject entryRuleBlockSubPrograms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockSubPrograms = null;


        try {
            // InternalPortugol.g:568:57: (iv_ruleBlockSubPrograms= ruleBlockSubPrograms EOF )
            // InternalPortugol.g:569:2: iv_ruleBlockSubPrograms= ruleBlockSubPrograms EOF
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
    // InternalPortugol.g:575:1: ruleBlockSubPrograms returns [EObject current=null] : (this_BlockFunction_0= ruleBlockFunction | this_BlockProcedure_1= ruleBlockProcedure ) ;
    public final EObject ruleBlockSubPrograms() throws RecognitionException {
        EObject current = null;

        EObject this_BlockFunction_0 = null;

        EObject this_BlockProcedure_1 = null;



        	enterRule();

        try {
            // InternalPortugol.g:581:2: ( (this_BlockFunction_0= ruleBlockFunction | this_BlockProcedure_1= ruleBlockProcedure ) )
            // InternalPortugol.g:582:2: (this_BlockFunction_0= ruleBlockFunction | this_BlockProcedure_1= ruleBlockProcedure )
            {
            // InternalPortugol.g:582:2: (this_BlockFunction_0= ruleBlockFunction | this_BlockProcedure_1= ruleBlockProcedure )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==26) ) {
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
                    // InternalPortugol.g:583:3: this_BlockFunction_0= ruleBlockFunction
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
                    // InternalPortugol.g:592:3: this_BlockProcedure_1= ruleBlockProcedure
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
    // InternalPortugol.g:604:1: entryRuleProcedureName returns [EObject current=null] : iv_ruleProcedureName= ruleProcedureName EOF ;
    public final EObject entryRuleProcedureName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedureName = null;


        try {
            // InternalPortugol.g:604:54: (iv_ruleProcedureName= ruleProcedureName EOF )
            // InternalPortugol.g:605:2: iv_ruleProcedureName= ruleProcedureName EOF
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
    // InternalPortugol.g:611:1: ruleProcedureName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleProcedureName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPortugol.g:617:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPortugol.g:618:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPortugol.g:618:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPortugol.g:619:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPortugol.g:619:3: (lv_name_0_0= RULE_ID )
            // InternalPortugol.g:620:4: lv_name_0_0= RULE_ID
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
    // InternalPortugol.g:639:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // InternalPortugol.g:639:53: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalPortugol.g:640:2: iv_ruleFunctionName= ruleFunctionName EOF
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
    // InternalPortugol.g:646:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPortugol.g:652:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPortugol.g:653:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPortugol.g:653:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPortugol.g:654:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPortugol.g:654:3: (lv_name_0_0= RULE_ID )
            // InternalPortugol.g:655:4: lv_name_0_0= RULE_ID
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
    // InternalPortugol.g:674:1: entryRuleBlockFunction returns [EObject current=null] : iv_ruleBlockFunction= ruleBlockFunction EOF ;
    public final EObject entryRuleBlockFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockFunction = null;


        try {
            // InternalPortugol.g:674:54: (iv_ruleBlockFunction= ruleBlockFunction EOF )
            // InternalPortugol.g:675:2: iv_ruleBlockFunction= ruleBlockFunction EOF
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
    // InternalPortugol.g:681:1: ruleBlockFunction returns [EObject current=null] : (otherlv_0= 'funcao' ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleVarType ) ) this_END_COMMAND_7= RULE_END_COMMAND ( (lv_declarations_8_0= ruleDeclarationsBlock ) )? otherlv_9= 'inicio' this_END_COMMAND_10= RULE_END_COMMAND ( (lv_commands_11_0= ruleAbstractCommand ) )+ otherlv_12= 'fimfuncao' this_END_COMMAND_13= RULE_END_COMMAND ) ;
    public final EObject ruleBlockFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_END_COMMAND_7=null;
        Token otherlv_9=null;
        Token this_END_COMMAND_10=null;
        Token otherlv_12=null;
        Token this_END_COMMAND_13=null;
        EObject lv_functionName_1_0 = null;

        EObject lv_paramList_3_0 = null;

        EObject lv_returnType_6_0 = null;

        EObject lv_declarations_8_0 = null;

        EObject lv_commands_11_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:687:2: ( (otherlv_0= 'funcao' ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleVarType ) ) this_END_COMMAND_7= RULE_END_COMMAND ( (lv_declarations_8_0= ruleDeclarationsBlock ) )? otherlv_9= 'inicio' this_END_COMMAND_10= RULE_END_COMMAND ( (lv_commands_11_0= ruleAbstractCommand ) )+ otherlv_12= 'fimfuncao' this_END_COMMAND_13= RULE_END_COMMAND ) )
            // InternalPortugol.g:688:2: (otherlv_0= 'funcao' ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleVarType ) ) this_END_COMMAND_7= RULE_END_COMMAND ( (lv_declarations_8_0= ruleDeclarationsBlock ) )? otherlv_9= 'inicio' this_END_COMMAND_10= RULE_END_COMMAND ( (lv_commands_11_0= ruleAbstractCommand ) )+ otherlv_12= 'fimfuncao' this_END_COMMAND_13= RULE_END_COMMAND )
            {
            // InternalPortugol.g:688:2: (otherlv_0= 'funcao' ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleVarType ) ) this_END_COMMAND_7= RULE_END_COMMAND ( (lv_declarations_8_0= ruleDeclarationsBlock ) )? otherlv_9= 'inicio' this_END_COMMAND_10= RULE_END_COMMAND ( (lv_commands_11_0= ruleAbstractCommand ) )+ otherlv_12= 'fimfuncao' this_END_COMMAND_13= RULE_END_COMMAND )
            // InternalPortugol.g:689:3: otherlv_0= 'funcao' ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleVarType ) ) this_END_COMMAND_7= RULE_END_COMMAND ( (lv_declarations_8_0= ruleDeclarationsBlock ) )? otherlv_9= 'inicio' this_END_COMMAND_10= RULE_END_COMMAND ( (lv_commands_11_0= ruleAbstractCommand ) )+ otherlv_12= 'fimfuncao' this_END_COMMAND_13= RULE_END_COMMAND
            {
            otherlv_0=(Token)match(input,21,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlockFunctionAccess().getFuncaoKeyword_0());
              		
            }
            // InternalPortugol.g:693:3: ( (lv_functionName_1_0= ruleFunctionName ) )
            // InternalPortugol.g:694:4: (lv_functionName_1_0= ruleFunctionName )
            {
            // InternalPortugol.g:694:4: (lv_functionName_1_0= ruleFunctionName )
            // InternalPortugol.g:695:5: lv_functionName_1_0= ruleFunctionName
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

            otherlv_2=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBlockFunctionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPortugol.g:716:3: ( (lv_paramList_3_0= ruleVariable ) )
            // InternalPortugol.g:717:4: (lv_paramList_3_0= ruleVariable )
            {
            // InternalPortugol.g:717:4: (lv_paramList_3_0= ruleVariable )
            // InternalPortugol.g:718:5: lv_paramList_3_0= ruleVariable
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

            otherlv_4=(Token)match(input,23,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBlockFunctionAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,15,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getBlockFunctionAccess().getColonKeyword_5());
              		
            }
            // InternalPortugol.g:743:3: ( (lv_returnType_6_0= ruleVarType ) )
            // InternalPortugol.g:744:4: (lv_returnType_6_0= ruleVarType )
            {
            // InternalPortugol.g:744:4: (lv_returnType_6_0= ruleVarType )
            // InternalPortugol.g:745:5: lv_returnType_6_0= ruleVarType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBlockFunctionAccess().getReturnTypeVarTypeParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_6);
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

            this_END_COMMAND_7=(Token)match(input,RULE_END_COMMAND,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_COMMAND_7, grammarAccess.getBlockFunctionAccess().getEND_COMMANDTerminalRuleCall_7());
              		
            }
            // InternalPortugol.g:766:3: ( (lv_declarations_8_0= ruleDeclarationsBlock ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPortugol.g:767:4: (lv_declarations_8_0= ruleDeclarationsBlock )
                    {
                    // InternalPortugol.g:767:4: (lv_declarations_8_0= ruleDeclarationsBlock )
                    // InternalPortugol.g:768:5: lv_declarations_8_0= ruleDeclarationsBlock
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBlockFunctionAccess().getDeclarationsDeclarationsBlockParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
                    lv_declarations_8_0=ruleDeclarationsBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBlockFunctionRule());
                      					}
                      					set(
                      						current,
                      						"declarations",
                      						lv_declarations_8_0,
                      						"org.hopper.language.Portugol.DeclarationsBlock");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getBlockFunctionAccess().getInicioKeyword_9());
              		
            }
            this_END_COMMAND_10=(Token)match(input,RULE_END_COMMAND,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_COMMAND_10, grammarAccess.getBlockFunctionAccess().getEND_COMMANDTerminalRuleCall_10());
              		
            }
            // InternalPortugol.g:793:3: ( (lv_commands_11_0= ruleAbstractCommand ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING||(LA9_0>=RULE_ID && LA9_0<=RULE_FLOAT)||LA9_0==22||LA9_0==29||LA9_0==33||LA9_0==38||LA9_0==44||(LA9_0>=46 && LA9_0<=49)||LA9_0==62||LA9_0==68) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPortugol.g:794:4: (lv_commands_11_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugol.g:794:4: (lv_commands_11_0= ruleAbstractCommand )
            	    // InternalPortugol.g:795:5: lv_commands_11_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockFunctionAccess().getCommandsAbstractCommandParserRuleCall_11_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_commands_11_0=ruleAbstractCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBlockFunctionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"commands",
            	      						lv_commands_11_0,
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

            otherlv_12=(Token)match(input,25,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getBlockFunctionAccess().getFimfuncaoKeyword_12());
              		
            }
            this_END_COMMAND_13=(Token)match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_COMMAND_13, grammarAccess.getBlockFunctionAccess().getEND_COMMANDTerminalRuleCall_13());
              		
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
    // InternalPortugol.g:824:1: entryRuleBlockProcedure returns [EObject current=null] : iv_ruleBlockProcedure= ruleBlockProcedure EOF ;
    public final EObject entryRuleBlockProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockProcedure = null;


        try {
            // InternalPortugol.g:824:55: (iv_ruleBlockProcedure= ruleBlockProcedure EOF )
            // InternalPortugol.g:825:2: iv_ruleBlockProcedure= ruleBlockProcedure EOF
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
    // InternalPortugol.g:831:1: ruleBlockProcedure returns [EObject current=null] : (otherlv_0= 'procedimento' ( (lv_procedure_1_0= ruleProcedureName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' this_END_COMMAND_5= RULE_END_COMMAND ( (lv_declarations_6_0= ruleDeclarationsBlock ) )? otherlv_7= 'inicio' this_END_COMMAND_8= RULE_END_COMMAND ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= 'fimprocedimento' this_END_COMMAND_11= RULE_END_COMMAND ) ;
    public final EObject ruleBlockProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_END_COMMAND_5=null;
        Token otherlv_7=null;
        Token this_END_COMMAND_8=null;
        Token otherlv_10=null;
        Token this_END_COMMAND_11=null;
        EObject lv_procedure_1_0 = null;

        EObject lv_paramList_3_0 = null;

        EObject lv_declarations_6_0 = null;

        EObject lv_commands_9_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:837:2: ( (otherlv_0= 'procedimento' ( (lv_procedure_1_0= ruleProcedureName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' this_END_COMMAND_5= RULE_END_COMMAND ( (lv_declarations_6_0= ruleDeclarationsBlock ) )? otherlv_7= 'inicio' this_END_COMMAND_8= RULE_END_COMMAND ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= 'fimprocedimento' this_END_COMMAND_11= RULE_END_COMMAND ) )
            // InternalPortugol.g:838:2: (otherlv_0= 'procedimento' ( (lv_procedure_1_0= ruleProcedureName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' this_END_COMMAND_5= RULE_END_COMMAND ( (lv_declarations_6_0= ruleDeclarationsBlock ) )? otherlv_7= 'inicio' this_END_COMMAND_8= RULE_END_COMMAND ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= 'fimprocedimento' this_END_COMMAND_11= RULE_END_COMMAND )
            {
            // InternalPortugol.g:838:2: (otherlv_0= 'procedimento' ( (lv_procedure_1_0= ruleProcedureName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' this_END_COMMAND_5= RULE_END_COMMAND ( (lv_declarations_6_0= ruleDeclarationsBlock ) )? otherlv_7= 'inicio' this_END_COMMAND_8= RULE_END_COMMAND ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= 'fimprocedimento' this_END_COMMAND_11= RULE_END_COMMAND )
            // InternalPortugol.g:839:3: otherlv_0= 'procedimento' ( (lv_procedure_1_0= ruleProcedureName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' this_END_COMMAND_5= RULE_END_COMMAND ( (lv_declarations_6_0= ruleDeclarationsBlock ) )? otherlv_7= 'inicio' this_END_COMMAND_8= RULE_END_COMMAND ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= 'fimprocedimento' this_END_COMMAND_11= RULE_END_COMMAND
            {
            otherlv_0=(Token)match(input,26,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlockProcedureAccess().getProcedimentoKeyword_0());
              		
            }
            // InternalPortugol.g:843:3: ( (lv_procedure_1_0= ruleProcedureName ) )
            // InternalPortugol.g:844:4: (lv_procedure_1_0= ruleProcedureName )
            {
            // InternalPortugol.g:844:4: (lv_procedure_1_0= ruleProcedureName )
            // InternalPortugol.g:845:5: lv_procedure_1_0= ruleProcedureName
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

            otherlv_2=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBlockProcedureAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPortugol.g:866:3: ( (lv_paramList_3_0= ruleVariable ) )
            // InternalPortugol.g:867:4: (lv_paramList_3_0= ruleVariable )
            {
            // InternalPortugol.g:867:4: (lv_paramList_3_0= ruleVariable )
            // InternalPortugol.g:868:5: lv_paramList_3_0= ruleVariable
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

            otherlv_4=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBlockProcedureAccess().getRightParenthesisKeyword_4());
              		
            }
            this_END_COMMAND_5=(Token)match(input,RULE_END_COMMAND,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_COMMAND_5, grammarAccess.getBlockProcedureAccess().getEND_COMMANDTerminalRuleCall_5());
              		
            }
            // InternalPortugol.g:893:3: ( (lv_declarations_6_0= ruleDeclarationsBlock ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPortugol.g:894:4: (lv_declarations_6_0= ruleDeclarationsBlock )
                    {
                    // InternalPortugol.g:894:4: (lv_declarations_6_0= ruleDeclarationsBlock )
                    // InternalPortugol.g:895:5: lv_declarations_6_0= ruleDeclarationsBlock
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBlockProcedureAccess().getDeclarationsDeclarationsBlockParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
                    lv_declarations_6_0=ruleDeclarationsBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBlockProcedureRule());
                      					}
                      					set(
                      						current,
                      						"declarations",
                      						lv_declarations_6_0,
                      						"org.hopper.language.Portugol.DeclarationsBlock");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getBlockProcedureAccess().getInicioKeyword_7());
              		
            }
            this_END_COMMAND_8=(Token)match(input,RULE_END_COMMAND,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_COMMAND_8, grammarAccess.getBlockProcedureAccess().getEND_COMMANDTerminalRuleCall_8());
              		
            }
            // InternalPortugol.g:920:3: ( (lv_commands_9_0= ruleAbstractCommand ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING||(LA11_0>=RULE_ID && LA11_0<=RULE_FLOAT)||LA11_0==22||LA11_0==29||LA11_0==33||LA11_0==38||LA11_0==44||(LA11_0>=46 && LA11_0<=49)||LA11_0==62||LA11_0==68) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPortugol.g:921:4: (lv_commands_9_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugol.g:921:4: (lv_commands_9_0= ruleAbstractCommand )
            	    // InternalPortugol.g:922:5: lv_commands_9_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockProcedureAccess().getCommandsAbstractCommandParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_commands_9_0=ruleAbstractCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBlockProcedureRule());
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

            otherlv_10=(Token)match(input,27,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getBlockProcedureAccess().getFimprocedimentoKeyword_10());
              		
            }
            this_END_COMMAND_11=(Token)match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_COMMAND_11, grammarAccess.getBlockProcedureAccess().getEND_COMMANDTerminalRuleCall_11());
              		
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
    // InternalPortugol.g:951:1: entryRuleBlockCommand returns [EObject current=null] : iv_ruleBlockCommand= ruleBlockCommand EOF ;
    public final EObject entryRuleBlockCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockCommand = null;


        try {
            // InternalPortugol.g:951:53: (iv_ruleBlockCommand= ruleBlockCommand EOF )
            // InternalPortugol.g:952:2: iv_ruleBlockCommand= ruleBlockCommand EOF
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
    // InternalPortugol.g:958:1: ruleBlockCommand returns [EObject current=null] : (otherlv_0= 'inicio' this_END_COMMAND_1= RULE_END_COMMAND ( (lv_commands_2_0= ruleAbstractCommand ) )+ otherlv_3= 'fimalgoritmo' (this_END_COMMAND_4= RULE_END_COMMAND )? ) ;
    public final EObject ruleBlockCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_END_COMMAND_1=null;
        Token otherlv_3=null;
        Token this_END_COMMAND_4=null;
        EObject lv_commands_2_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:964:2: ( (otherlv_0= 'inicio' this_END_COMMAND_1= RULE_END_COMMAND ( (lv_commands_2_0= ruleAbstractCommand ) )+ otherlv_3= 'fimalgoritmo' (this_END_COMMAND_4= RULE_END_COMMAND )? ) )
            // InternalPortugol.g:965:2: (otherlv_0= 'inicio' this_END_COMMAND_1= RULE_END_COMMAND ( (lv_commands_2_0= ruleAbstractCommand ) )+ otherlv_3= 'fimalgoritmo' (this_END_COMMAND_4= RULE_END_COMMAND )? )
            {
            // InternalPortugol.g:965:2: (otherlv_0= 'inicio' this_END_COMMAND_1= RULE_END_COMMAND ( (lv_commands_2_0= ruleAbstractCommand ) )+ otherlv_3= 'fimalgoritmo' (this_END_COMMAND_4= RULE_END_COMMAND )? )
            // InternalPortugol.g:966:3: otherlv_0= 'inicio' this_END_COMMAND_1= RULE_END_COMMAND ( (lv_commands_2_0= ruleAbstractCommand ) )+ otherlv_3= 'fimalgoritmo' (this_END_COMMAND_4= RULE_END_COMMAND )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlockCommandAccess().getInicioKeyword_0());
              		
            }
            this_END_COMMAND_1=(Token)match(input,RULE_END_COMMAND,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_COMMAND_1, grammarAccess.getBlockCommandAccess().getEND_COMMANDTerminalRuleCall_1());
              		
            }
            // InternalPortugol.g:974:3: ( (lv_commands_2_0= ruleAbstractCommand ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING||(LA12_0>=RULE_ID && LA12_0<=RULE_FLOAT)||LA12_0==22||LA12_0==29||LA12_0==33||LA12_0==38||LA12_0==44||(LA12_0>=46 && LA12_0<=49)||LA12_0==62||LA12_0==68) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPortugol.g:975:4: (lv_commands_2_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugol.g:975:4: (lv_commands_2_0= ruleAbstractCommand )
            	    // InternalPortugol.g:976:5: lv_commands_2_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockCommandAccess().getCommandsAbstractCommandParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_commands_2_0=ruleAbstractCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBlockCommandRule());
            	      					}
            	      					add(
            	      						current,
            	      						"commands",
            	      						lv_commands_2_0,
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

            otherlv_3=(Token)match(input,28,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBlockCommandAccess().getFimalgoritmoKeyword_3());
              		
            }
            // InternalPortugol.g:997:3: (this_END_COMMAND_4= RULE_END_COMMAND )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_END_COMMAND) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPortugol.g:998:4: this_END_COMMAND_4= RULE_END_COMMAND
                    {
                    this_END_COMMAND_4=(Token)match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_COMMAND_4, grammarAccess.getBlockCommandAccess().getEND_COMMANDTerminalRuleCall_4());
                      			
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
    // $ANTLR end "ruleBlockCommand"


    // $ANTLR start "entryRuleAbstractCommand"
    // InternalPortugol.g:1007:1: entryRuleAbstractCommand returns [EObject current=null] : iv_ruleAbstractCommand= ruleAbstractCommand EOF ;
    public final EObject entryRuleAbstractCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractCommand = null;


        try {
            // InternalPortugol.g:1007:56: (iv_ruleAbstractCommand= ruleAbstractCommand EOF )
            // InternalPortugol.g:1008:2: iv_ruleAbstractCommand= ruleAbstractCommand EOF
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
    // InternalPortugol.g:1014:1: ruleAbstractCommand returns [EObject current=null] : ( (this_ReadCommand_0= ruleReadCommand this_END_COMMAND_1= RULE_END_COMMAND ) | (this_WriteCommand_2= ruleWriteCommand this_END_COMMAND_3= RULE_END_COMMAND ) | (this_Expression_4= ruleExpression this_END_COMMAND_5= RULE_END_COMMAND ) | (this_IfStatement_6= ruleIfStatement this_END_COMMAND_7= RULE_END_COMMAND ) | (this_SwitchCaseStatement_8= ruleSwitchCaseStatement this_END_COMMAND_9= RULE_END_COMMAND ) | (this_ForStatement_10= ruleForStatement this_END_COMMAND_11= RULE_END_COMMAND ) | (this_RepeatStatement_12= ruleRepeatStatement this_END_COMMAND_13= RULE_END_COMMAND ) | (this_WhileStatement_14= ruleWhileStatement this_END_COMMAND_15= RULE_END_COMMAND ) ) ;
    public final EObject ruleAbstractCommand() throws RecognitionException {
        EObject current = null;

        Token this_END_COMMAND_1=null;
        Token this_END_COMMAND_3=null;
        Token this_END_COMMAND_5=null;
        Token this_END_COMMAND_7=null;
        Token this_END_COMMAND_9=null;
        Token this_END_COMMAND_11=null;
        Token this_END_COMMAND_13=null;
        Token this_END_COMMAND_15=null;
        EObject this_ReadCommand_0 = null;

        EObject this_WriteCommand_2 = null;

        EObject this_Expression_4 = null;

        EObject this_IfStatement_6 = null;

        EObject this_SwitchCaseStatement_8 = null;

        EObject this_ForStatement_10 = null;

        EObject this_RepeatStatement_12 = null;

        EObject this_WhileStatement_14 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1020:2: ( ( (this_ReadCommand_0= ruleReadCommand this_END_COMMAND_1= RULE_END_COMMAND ) | (this_WriteCommand_2= ruleWriteCommand this_END_COMMAND_3= RULE_END_COMMAND ) | (this_Expression_4= ruleExpression this_END_COMMAND_5= RULE_END_COMMAND ) | (this_IfStatement_6= ruleIfStatement this_END_COMMAND_7= RULE_END_COMMAND ) | (this_SwitchCaseStatement_8= ruleSwitchCaseStatement this_END_COMMAND_9= RULE_END_COMMAND ) | (this_ForStatement_10= ruleForStatement this_END_COMMAND_11= RULE_END_COMMAND ) | (this_RepeatStatement_12= ruleRepeatStatement this_END_COMMAND_13= RULE_END_COMMAND ) | (this_WhileStatement_14= ruleWhileStatement this_END_COMMAND_15= RULE_END_COMMAND ) ) )
            // InternalPortugol.g:1021:2: ( (this_ReadCommand_0= ruleReadCommand this_END_COMMAND_1= RULE_END_COMMAND ) | (this_WriteCommand_2= ruleWriteCommand this_END_COMMAND_3= RULE_END_COMMAND ) | (this_Expression_4= ruleExpression this_END_COMMAND_5= RULE_END_COMMAND ) | (this_IfStatement_6= ruleIfStatement this_END_COMMAND_7= RULE_END_COMMAND ) | (this_SwitchCaseStatement_8= ruleSwitchCaseStatement this_END_COMMAND_9= RULE_END_COMMAND ) | (this_ForStatement_10= ruleForStatement this_END_COMMAND_11= RULE_END_COMMAND ) | (this_RepeatStatement_12= ruleRepeatStatement this_END_COMMAND_13= RULE_END_COMMAND ) | (this_WhileStatement_14= ruleWhileStatement this_END_COMMAND_15= RULE_END_COMMAND ) )
            {
            // InternalPortugol.g:1021:2: ( (this_ReadCommand_0= ruleReadCommand this_END_COMMAND_1= RULE_END_COMMAND ) | (this_WriteCommand_2= ruleWriteCommand this_END_COMMAND_3= RULE_END_COMMAND ) | (this_Expression_4= ruleExpression this_END_COMMAND_5= RULE_END_COMMAND ) | (this_IfStatement_6= ruleIfStatement this_END_COMMAND_7= RULE_END_COMMAND ) | (this_SwitchCaseStatement_8= ruleSwitchCaseStatement this_END_COMMAND_9= RULE_END_COMMAND ) | (this_ForStatement_10= ruleForStatement this_END_COMMAND_11= RULE_END_COMMAND ) | (this_RepeatStatement_12= ruleRepeatStatement this_END_COMMAND_13= RULE_END_COMMAND ) | (this_WhileStatement_14= ruleWhileStatement this_END_COMMAND_15= RULE_END_COMMAND ) )
            int alt14=8;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt14=1;
                }
                break;
            case 48:
            case 49:
                {
                alt14=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case RULE_FLOAT:
            case 22:
            case 62:
            case 68:
                {
                alt14=3;
                }
                break;
            case 29:
                {
                alt14=4;
                }
                break;
            case 33:
                {
                alt14=5;
                }
                break;
            case 38:
                {
                alt14=6;
                }
                break;
            case 46:
                {
                alt14=7;
                }
                break;
            case 44:
                {
                alt14=8;
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
                    // InternalPortugol.g:1022:3: (this_ReadCommand_0= ruleReadCommand this_END_COMMAND_1= RULE_END_COMMAND )
                    {
                    // InternalPortugol.g:1022:3: (this_ReadCommand_0= ruleReadCommand this_END_COMMAND_1= RULE_END_COMMAND )
                    // InternalPortugol.g:1023:4: this_ReadCommand_0= ruleReadCommand this_END_COMMAND_1= RULE_END_COMMAND
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
                    this_END_COMMAND_1=(Token)match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_COMMAND_1, grammarAccess.getAbstractCommandAccess().getEND_COMMANDTerminalRuleCall_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:1037:3: (this_WriteCommand_2= ruleWriteCommand this_END_COMMAND_3= RULE_END_COMMAND )
                    {
                    // InternalPortugol.g:1037:3: (this_WriteCommand_2= ruleWriteCommand this_END_COMMAND_3= RULE_END_COMMAND )
                    // InternalPortugol.g:1038:4: this_WriteCommand_2= ruleWriteCommand this_END_COMMAND_3= RULE_END_COMMAND
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
                    this_END_COMMAND_3=(Token)match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_COMMAND_3, grammarAccess.getAbstractCommandAccess().getEND_COMMANDTerminalRuleCall_1_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPortugol.g:1052:3: (this_Expression_4= ruleExpression this_END_COMMAND_5= RULE_END_COMMAND )
                    {
                    // InternalPortugol.g:1052:3: (this_Expression_4= ruleExpression this_END_COMMAND_5= RULE_END_COMMAND )
                    // InternalPortugol.g:1053:4: this_Expression_4= ruleExpression this_END_COMMAND_5= RULE_END_COMMAND
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
                    this_END_COMMAND_5=(Token)match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_COMMAND_5, grammarAccess.getAbstractCommandAccess().getEND_COMMANDTerminalRuleCall_2_1());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPortugol.g:1067:3: (this_IfStatement_6= ruleIfStatement this_END_COMMAND_7= RULE_END_COMMAND )
                    {
                    // InternalPortugol.g:1067:3: (this_IfStatement_6= ruleIfStatement this_END_COMMAND_7= RULE_END_COMMAND )
                    // InternalPortugol.g:1068:4: this_IfStatement_6= ruleIfStatement this_END_COMMAND_7= RULE_END_COMMAND
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAbstractCommandAccess().getIfStatementParserRuleCall_3_0());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    this_IfStatement_6=ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_IfStatement_6;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    this_END_COMMAND_7=(Token)match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_COMMAND_7, grammarAccess.getAbstractCommandAccess().getEND_COMMANDTerminalRuleCall_3_1());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPortugol.g:1082:3: (this_SwitchCaseStatement_8= ruleSwitchCaseStatement this_END_COMMAND_9= RULE_END_COMMAND )
                    {
                    // InternalPortugol.g:1082:3: (this_SwitchCaseStatement_8= ruleSwitchCaseStatement this_END_COMMAND_9= RULE_END_COMMAND )
                    // InternalPortugol.g:1083:4: this_SwitchCaseStatement_8= ruleSwitchCaseStatement this_END_COMMAND_9= RULE_END_COMMAND
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAbstractCommandAccess().getSwitchCaseStatementParserRuleCall_4_0());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    this_SwitchCaseStatement_8=ruleSwitchCaseStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SwitchCaseStatement_8;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    this_END_COMMAND_9=(Token)match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_COMMAND_9, grammarAccess.getAbstractCommandAccess().getEND_COMMANDTerminalRuleCall_4_1());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalPortugol.g:1097:3: (this_ForStatement_10= ruleForStatement this_END_COMMAND_11= RULE_END_COMMAND )
                    {
                    // InternalPortugol.g:1097:3: (this_ForStatement_10= ruleForStatement this_END_COMMAND_11= RULE_END_COMMAND )
                    // InternalPortugol.g:1098:4: this_ForStatement_10= ruleForStatement this_END_COMMAND_11= RULE_END_COMMAND
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAbstractCommandAccess().getForStatementParserRuleCall_5_0());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    this_ForStatement_10=ruleForStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ForStatement_10;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    this_END_COMMAND_11=(Token)match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_COMMAND_11, grammarAccess.getAbstractCommandAccess().getEND_COMMANDTerminalRuleCall_5_1());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalPortugol.g:1112:3: (this_RepeatStatement_12= ruleRepeatStatement this_END_COMMAND_13= RULE_END_COMMAND )
                    {
                    // InternalPortugol.g:1112:3: (this_RepeatStatement_12= ruleRepeatStatement this_END_COMMAND_13= RULE_END_COMMAND )
                    // InternalPortugol.g:1113:4: this_RepeatStatement_12= ruleRepeatStatement this_END_COMMAND_13= RULE_END_COMMAND
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAbstractCommandAccess().getRepeatStatementParserRuleCall_6_0());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    this_RepeatStatement_12=ruleRepeatStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_RepeatStatement_12;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    this_END_COMMAND_13=(Token)match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_COMMAND_13, grammarAccess.getAbstractCommandAccess().getEND_COMMANDTerminalRuleCall_6_1());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalPortugol.g:1127:3: (this_WhileStatement_14= ruleWhileStatement this_END_COMMAND_15= RULE_END_COMMAND )
                    {
                    // InternalPortugol.g:1127:3: (this_WhileStatement_14= ruleWhileStatement this_END_COMMAND_15= RULE_END_COMMAND )
                    // InternalPortugol.g:1128:4: this_WhileStatement_14= ruleWhileStatement this_END_COMMAND_15= RULE_END_COMMAND
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAbstractCommandAccess().getWhileStatementParserRuleCall_7_0());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    this_WhileStatement_14=ruleWhileStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_WhileStatement_14;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    this_END_COMMAND_15=(Token)match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_COMMAND_15, grammarAccess.getAbstractCommandAccess().getEND_COMMANDTerminalRuleCall_7_1());
                      			
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


    // $ANTLR start "entryRuleIfStatement"
    // InternalPortugol.g:1145:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalPortugol.g:1145:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalPortugol.g:1146:2: iv_ruleIfStatement= ruleIfStatement EOF
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
    // InternalPortugol.g:1152:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'se' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= 'entao' this_END_COMMAND_3= RULE_END_COMMAND ( (lv_commands_4_0= ruleAbstractCommand ) )+ (otherlv_5= 'senao' this_END_COMMAND_6= RULE_END_COMMAND ( (lv_elseCommands_7_0= ruleAbstractCommand ) )+ )? otherlv_8= 'fimse' ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_END_COMMAND_3=null;
        Token otherlv_5=null;
        Token this_END_COMMAND_6=null;
        Token otherlv_8=null;
        EObject lv_expr_1_0 = null;

        EObject lv_commands_4_0 = null;

        EObject lv_elseCommands_7_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1158:2: ( (otherlv_0= 'se' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= 'entao' this_END_COMMAND_3= RULE_END_COMMAND ( (lv_commands_4_0= ruleAbstractCommand ) )+ (otherlv_5= 'senao' this_END_COMMAND_6= RULE_END_COMMAND ( (lv_elseCommands_7_0= ruleAbstractCommand ) )+ )? otherlv_8= 'fimse' ) )
            // InternalPortugol.g:1159:2: (otherlv_0= 'se' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= 'entao' this_END_COMMAND_3= RULE_END_COMMAND ( (lv_commands_4_0= ruleAbstractCommand ) )+ (otherlv_5= 'senao' this_END_COMMAND_6= RULE_END_COMMAND ( (lv_elseCommands_7_0= ruleAbstractCommand ) )+ )? otherlv_8= 'fimse' )
            {
            // InternalPortugol.g:1159:2: (otherlv_0= 'se' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= 'entao' this_END_COMMAND_3= RULE_END_COMMAND ( (lv_commands_4_0= ruleAbstractCommand ) )+ (otherlv_5= 'senao' this_END_COMMAND_6= RULE_END_COMMAND ( (lv_elseCommands_7_0= ruleAbstractCommand ) )+ )? otherlv_8= 'fimse' )
            // InternalPortugol.g:1160:3: otherlv_0= 'se' ( (lv_expr_1_0= ruleExpression ) ) otherlv_2= 'entao' this_END_COMMAND_3= RULE_END_COMMAND ( (lv_commands_4_0= ruleAbstractCommand ) )+ (otherlv_5= 'senao' this_END_COMMAND_6= RULE_END_COMMAND ( (lv_elseCommands_7_0= ruleAbstractCommand ) )+ )? otherlv_8= 'fimse'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getSeKeyword_0());
              		
            }
            // InternalPortugol.g:1164:3: ( (lv_expr_1_0= ruleExpression ) )
            // InternalPortugol.g:1165:4: (lv_expr_1_0= ruleExpression )
            {
            // InternalPortugol.g:1165:4: (lv_expr_1_0= ruleExpression )
            // InternalPortugol.g:1166:5: lv_expr_1_0= ruleExpression
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

            otherlv_2=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getEntaoKeyword_2());
              		
            }
            this_END_COMMAND_3=(Token)match(input,RULE_END_COMMAND,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_COMMAND_3, grammarAccess.getIfStatementAccess().getEND_COMMANDTerminalRuleCall_3());
              		
            }
            // InternalPortugol.g:1191:3: ( (lv_commands_4_0= ruleAbstractCommand ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STRING||(LA15_0>=RULE_ID && LA15_0<=RULE_FLOAT)||LA15_0==22||LA15_0==29||LA15_0==33||LA15_0==38||LA15_0==44||(LA15_0>=46 && LA15_0<=49)||LA15_0==62||LA15_0==68) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPortugol.g:1192:4: (lv_commands_4_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugol.g:1192:4: (lv_commands_4_0= ruleAbstractCommand )
            	    // InternalPortugol.g:1193:5: lv_commands_4_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfStatementAccess().getCommandsAbstractCommandParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_commands_4_0=ruleAbstractCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	      					}
            	      					add(
            	      						current,
            	      						"commands",
            	      						lv_commands_4_0,
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

            // InternalPortugol.g:1210:3: (otherlv_5= 'senao' this_END_COMMAND_6= RULE_END_COMMAND ( (lv_elseCommands_7_0= ruleAbstractCommand ) )+ )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPortugol.g:1211:4: otherlv_5= 'senao' this_END_COMMAND_6= RULE_END_COMMAND ( (lv_elseCommands_7_0= ruleAbstractCommand ) )+
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getSenaoKeyword_5_0());
                      			
                    }
                    this_END_COMMAND_6=(Token)match(input,RULE_END_COMMAND,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_COMMAND_6, grammarAccess.getIfStatementAccess().getEND_COMMANDTerminalRuleCall_5_1());
                      			
                    }
                    // InternalPortugol.g:1219:4: ( (lv_elseCommands_7_0= ruleAbstractCommand ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_STRING||(LA16_0>=RULE_ID && LA16_0<=RULE_FLOAT)||LA16_0==22||LA16_0==29||LA16_0==33||LA16_0==38||LA16_0==44||(LA16_0>=46 && LA16_0<=49)||LA16_0==62||LA16_0==68) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalPortugol.g:1220:5: (lv_elseCommands_7_0= ruleAbstractCommand )
                    	    {
                    	    // InternalPortugol.g:1220:5: (lv_elseCommands_7_0= ruleAbstractCommand )
                    	    // InternalPortugol.g:1221:6: lv_elseCommands_7_0= ruleAbstractCommand
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getIfStatementAccess().getElseCommandsAbstractCommandParserRuleCall_5_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_25);
                    	    lv_elseCommands_7_0=ruleAbstractCommand();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"elseCommands",
                    	      							lv_elseCommands_7_0,
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

            otherlv_8=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getIfStatementAccess().getFimseKeyword_6());
              		
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
    // InternalPortugol.g:1247:1: entryRuleSwitchCaseStatement returns [EObject current=null] : iv_ruleSwitchCaseStatement= ruleSwitchCaseStatement EOF ;
    public final EObject entryRuleSwitchCaseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCaseStatement = null;


        try {
            // InternalPortugol.g:1247:60: (iv_ruleSwitchCaseStatement= ruleSwitchCaseStatement EOF )
            // InternalPortugol.g:1248:2: iv_ruleSwitchCaseStatement= ruleSwitchCaseStatement EOF
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
    // InternalPortugol.g:1254:1: ruleSwitchCaseStatement returns [EObject current=null] : (otherlv_0= 'escolha' ( (otherlv_1= RULE_ID ) ) this_END_COMMAND_2= RULE_END_COMMAND ( (lv_caseList_3_0= ruleCaseList ) )+ ( (lv_otherCase_4_0= ruleOtherCase ) )? otherlv_5= 'fimescolha' ) ;
    public final EObject ruleSwitchCaseStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_END_COMMAND_2=null;
        Token otherlv_5=null;
        EObject lv_caseList_3_0 = null;

        EObject lv_otherCase_4_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1260:2: ( (otherlv_0= 'escolha' ( (otherlv_1= RULE_ID ) ) this_END_COMMAND_2= RULE_END_COMMAND ( (lv_caseList_3_0= ruleCaseList ) )+ ( (lv_otherCase_4_0= ruleOtherCase ) )? otherlv_5= 'fimescolha' ) )
            // InternalPortugol.g:1261:2: (otherlv_0= 'escolha' ( (otherlv_1= RULE_ID ) ) this_END_COMMAND_2= RULE_END_COMMAND ( (lv_caseList_3_0= ruleCaseList ) )+ ( (lv_otherCase_4_0= ruleOtherCase ) )? otherlv_5= 'fimescolha' )
            {
            // InternalPortugol.g:1261:2: (otherlv_0= 'escolha' ( (otherlv_1= RULE_ID ) ) this_END_COMMAND_2= RULE_END_COMMAND ( (lv_caseList_3_0= ruleCaseList ) )+ ( (lv_otherCase_4_0= ruleOtherCase ) )? otherlv_5= 'fimescolha' )
            // InternalPortugol.g:1262:3: otherlv_0= 'escolha' ( (otherlv_1= RULE_ID ) ) this_END_COMMAND_2= RULE_END_COMMAND ( (lv_caseList_3_0= ruleCaseList ) )+ ( (lv_otherCase_4_0= ruleOtherCase ) )? otherlv_5= 'fimescolha'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSwitchCaseStatementAccess().getEscolhaKeyword_0());
              		
            }
            // InternalPortugol.g:1266:3: ( (otherlv_1= RULE_ID ) )
            // InternalPortugol.g:1267:4: (otherlv_1= RULE_ID )
            {
            // InternalPortugol.g:1267:4: (otherlv_1= RULE_ID )
            // InternalPortugol.g:1268:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSwitchCaseStatementRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getSwitchCaseStatementAccess().getVariableVarNameCrossReference_1_0());
              				
            }

            }


            }

            this_END_COMMAND_2=(Token)match(input,RULE_END_COMMAND,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_COMMAND_2, grammarAccess.getSwitchCaseStatementAccess().getEND_COMMANDTerminalRuleCall_2());
              		
            }
            // InternalPortugol.g:1283:3: ( (lv_caseList_3_0= ruleCaseList ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPortugol.g:1284:4: (lv_caseList_3_0= ruleCaseList )
            	    {
            	    // InternalPortugol.g:1284:4: (lv_caseList_3_0= ruleCaseList )
            	    // InternalPortugol.g:1285:5: lv_caseList_3_0= ruleCaseList
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSwitchCaseStatementAccess().getCaseListCaseListParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_caseList_3_0=ruleCaseList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSwitchCaseStatementRule());
            	      					}
            	      					add(
            	      						current,
            	      						"caseList",
            	      						lv_caseList_3_0,
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

            // InternalPortugol.g:1302:3: ( (lv_otherCase_4_0= ruleOtherCase ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPortugol.g:1303:4: (lv_otherCase_4_0= ruleOtherCase )
                    {
                    // InternalPortugol.g:1303:4: (lv_otherCase_4_0= ruleOtherCase )
                    // InternalPortugol.g:1304:5: lv_otherCase_4_0= ruleOtherCase
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSwitchCaseStatementAccess().getOtherCaseOtherCaseParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_28);
                    lv_otherCase_4_0=ruleOtherCase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSwitchCaseStatementRule());
                      					}
                      					set(
                      						current,
                      						"otherCase",
                      						lv_otherCase_4_0,
                      						"org.hopper.language.Portugol.OtherCase");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSwitchCaseStatementAccess().getFimescolhaKeyword_5());
              		
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
    // InternalPortugol.g:1329:1: entryRuleCaseList returns [EObject current=null] : iv_ruleCaseList= ruleCaseList EOF ;
    public final EObject entryRuleCaseList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseList = null;


        try {
            // InternalPortugol.g:1329:49: (iv_ruleCaseList= ruleCaseList EOF )
            // InternalPortugol.g:1330:2: iv_ruleCaseList= ruleCaseList EOF
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
    // InternalPortugol.g:1336:1: ruleCaseList returns [EObject current=null] : (otherlv_0= 'caso' ( (lv_expr_1_0= ruleExpression ) ) this_END_COMMAND_2= RULE_END_COMMAND ( (lv_commands_3_0= ruleAbstractCommand ) )+ ( ( (lv_breakStatement_4_0= 'interrompa' ) ) this_END_COMMAND_5= RULE_END_COMMAND )? ) ;
    public final EObject ruleCaseList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_END_COMMAND_2=null;
        Token lv_breakStatement_4_0=null;
        Token this_END_COMMAND_5=null;
        EObject lv_expr_1_0 = null;

        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1342:2: ( (otherlv_0= 'caso' ( (lv_expr_1_0= ruleExpression ) ) this_END_COMMAND_2= RULE_END_COMMAND ( (lv_commands_3_0= ruleAbstractCommand ) )+ ( ( (lv_breakStatement_4_0= 'interrompa' ) ) this_END_COMMAND_5= RULE_END_COMMAND )? ) )
            // InternalPortugol.g:1343:2: (otherlv_0= 'caso' ( (lv_expr_1_0= ruleExpression ) ) this_END_COMMAND_2= RULE_END_COMMAND ( (lv_commands_3_0= ruleAbstractCommand ) )+ ( ( (lv_breakStatement_4_0= 'interrompa' ) ) this_END_COMMAND_5= RULE_END_COMMAND )? )
            {
            // InternalPortugol.g:1343:2: (otherlv_0= 'caso' ( (lv_expr_1_0= ruleExpression ) ) this_END_COMMAND_2= RULE_END_COMMAND ( (lv_commands_3_0= ruleAbstractCommand ) )+ ( ( (lv_breakStatement_4_0= 'interrompa' ) ) this_END_COMMAND_5= RULE_END_COMMAND )? )
            // InternalPortugol.g:1344:3: otherlv_0= 'caso' ( (lv_expr_1_0= ruleExpression ) ) this_END_COMMAND_2= RULE_END_COMMAND ( (lv_commands_3_0= ruleAbstractCommand ) )+ ( ( (lv_breakStatement_4_0= 'interrompa' ) ) this_END_COMMAND_5= RULE_END_COMMAND )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCaseListAccess().getCasoKeyword_0());
              		
            }
            // InternalPortugol.g:1348:3: ( (lv_expr_1_0= ruleExpression ) )
            // InternalPortugol.g:1349:4: (lv_expr_1_0= ruleExpression )
            {
            // InternalPortugol.g:1349:4: (lv_expr_1_0= ruleExpression )
            // InternalPortugol.g:1350:5: lv_expr_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseListAccess().getExprExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_6);
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

            this_END_COMMAND_2=(Token)match(input,RULE_END_COMMAND,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_COMMAND_2, grammarAccess.getCaseListAccess().getEND_COMMANDTerminalRuleCall_2());
              		
            }
            // InternalPortugol.g:1371:3: ( (lv_commands_3_0= ruleAbstractCommand ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_STRING||(LA20_0>=RULE_ID && LA20_0<=RULE_FLOAT)||LA20_0==22||LA20_0==29||LA20_0==33||LA20_0==38||LA20_0==44||(LA20_0>=46 && LA20_0<=49)||LA20_0==62||LA20_0==68) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPortugol.g:1372:4: (lv_commands_3_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugol.g:1372:4: (lv_commands_3_0= ruleAbstractCommand )
            	    // InternalPortugol.g:1373:5: lv_commands_3_0= ruleAbstractCommand
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
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            // InternalPortugol.g:1390:3: ( ( (lv_breakStatement_4_0= 'interrompa' ) ) this_END_COMMAND_5= RULE_END_COMMAND )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPortugol.g:1391:4: ( (lv_breakStatement_4_0= 'interrompa' ) ) this_END_COMMAND_5= RULE_END_COMMAND
                    {
                    // InternalPortugol.g:1391:4: ( (lv_breakStatement_4_0= 'interrompa' ) )
                    // InternalPortugol.g:1392:5: (lv_breakStatement_4_0= 'interrompa' )
                    {
                    // InternalPortugol.g:1392:5: (lv_breakStatement_4_0= 'interrompa' )
                    // InternalPortugol.g:1393:6: lv_breakStatement_4_0= 'interrompa'
                    {
                    lv_breakStatement_4_0=(Token)match(input,36,FOLLOW_6); if (state.failed) return current;
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

                    this_END_COMMAND_5=(Token)match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_COMMAND_5, grammarAccess.getCaseListAccess().getEND_COMMANDTerminalRuleCall_4_1());
                      			
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
    // InternalPortugol.g:1414:1: entryRuleOtherCase returns [EObject current=null] : iv_ruleOtherCase= ruleOtherCase EOF ;
    public final EObject entryRuleOtherCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherCase = null;


        try {
            // InternalPortugol.g:1414:50: (iv_ruleOtherCase= ruleOtherCase EOF )
            // InternalPortugol.g:1415:2: iv_ruleOtherCase= ruleOtherCase EOF
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
    // InternalPortugol.g:1421:1: ruleOtherCase returns [EObject current=null] : (otherlv_0= 'outrocaso' this_END_COMMAND_1= RULE_END_COMMAND ( (lv_otherCaseCommands_2_0= ruleAbstractCommand ) )+ ( ( (lv_breakStatement_3_0= 'interrompa' ) ) this_END_COMMAND_4= RULE_END_COMMAND )? ) ;
    public final EObject ruleOtherCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_END_COMMAND_1=null;
        Token lv_breakStatement_3_0=null;
        Token this_END_COMMAND_4=null;
        EObject lv_otherCaseCommands_2_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1427:2: ( (otherlv_0= 'outrocaso' this_END_COMMAND_1= RULE_END_COMMAND ( (lv_otherCaseCommands_2_0= ruleAbstractCommand ) )+ ( ( (lv_breakStatement_3_0= 'interrompa' ) ) this_END_COMMAND_4= RULE_END_COMMAND )? ) )
            // InternalPortugol.g:1428:2: (otherlv_0= 'outrocaso' this_END_COMMAND_1= RULE_END_COMMAND ( (lv_otherCaseCommands_2_0= ruleAbstractCommand ) )+ ( ( (lv_breakStatement_3_0= 'interrompa' ) ) this_END_COMMAND_4= RULE_END_COMMAND )? )
            {
            // InternalPortugol.g:1428:2: (otherlv_0= 'outrocaso' this_END_COMMAND_1= RULE_END_COMMAND ( (lv_otherCaseCommands_2_0= ruleAbstractCommand ) )+ ( ( (lv_breakStatement_3_0= 'interrompa' ) ) this_END_COMMAND_4= RULE_END_COMMAND )? )
            // InternalPortugol.g:1429:3: otherlv_0= 'outrocaso' this_END_COMMAND_1= RULE_END_COMMAND ( (lv_otherCaseCommands_2_0= ruleAbstractCommand ) )+ ( ( (lv_breakStatement_3_0= 'interrompa' ) ) this_END_COMMAND_4= RULE_END_COMMAND )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOtherCaseAccess().getOutrocasoKeyword_0());
              		
            }
            this_END_COMMAND_1=(Token)match(input,RULE_END_COMMAND,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_COMMAND_1, grammarAccess.getOtherCaseAccess().getEND_COMMANDTerminalRuleCall_1());
              		
            }
            // InternalPortugol.g:1437:3: ( (lv_otherCaseCommands_2_0= ruleAbstractCommand ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STRING||(LA22_0>=RULE_ID && LA22_0<=RULE_FLOAT)||LA22_0==22||LA22_0==29||LA22_0==33||LA22_0==38||LA22_0==44||(LA22_0>=46 && LA22_0<=49)||LA22_0==62||LA22_0==68) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPortugol.g:1438:4: (lv_otherCaseCommands_2_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugol.g:1438:4: (lv_otherCaseCommands_2_0= ruleAbstractCommand )
            	    // InternalPortugol.g:1439:5: lv_otherCaseCommands_2_0= ruleAbstractCommand
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
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            // InternalPortugol.g:1456:3: ( ( (lv_breakStatement_3_0= 'interrompa' ) ) this_END_COMMAND_4= RULE_END_COMMAND )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPortugol.g:1457:4: ( (lv_breakStatement_3_0= 'interrompa' ) ) this_END_COMMAND_4= RULE_END_COMMAND
                    {
                    // InternalPortugol.g:1457:4: ( (lv_breakStatement_3_0= 'interrompa' ) )
                    // InternalPortugol.g:1458:5: (lv_breakStatement_3_0= 'interrompa' )
                    {
                    // InternalPortugol.g:1458:5: (lv_breakStatement_3_0= 'interrompa' )
                    // InternalPortugol.g:1459:6: lv_breakStatement_3_0= 'interrompa'
                    {
                    lv_breakStatement_3_0=(Token)match(input,36,FOLLOW_6); if (state.failed) return current;
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

                    this_END_COMMAND_4=(Token)match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_COMMAND_4, grammarAccess.getOtherCaseAccess().getEND_COMMANDTerminalRuleCall_3_1());
                      			
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
    // InternalPortugol.g:1480:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalPortugol.g:1480:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalPortugol.g:1481:2: iv_ruleForStatement= ruleForStatement EOF
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
    // InternalPortugol.g:1487:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'para' ( (lv_operatorExpr_1_0= ruleExpression ) ) otherlv_2= 'de' ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= 'ate' ( (lv_endExpr_5_0= ruleExpression ) ) (otherlv_6= 'passo' ( (lv_stepExpe_7_0= ruleExpression ) ) )? otherlv_8= 'faca' this_END_COMMAND_9= RULE_END_COMMAND ( (lv_commands_10_0= ruleAbstractCommand ) )+ otherlv_11= 'fimpara' ) ;
    public final EObject ruleForStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_END_COMMAND_9=null;
        Token otherlv_11=null;
        EObject lv_operatorExpr_1_0 = null;

        EObject lv_startExpr_3_0 = null;

        EObject lv_endExpr_5_0 = null;

        EObject lv_stepExpe_7_0 = null;

        EObject lv_commands_10_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1493:2: ( (otherlv_0= 'para' ( (lv_operatorExpr_1_0= ruleExpression ) ) otherlv_2= 'de' ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= 'ate' ( (lv_endExpr_5_0= ruleExpression ) ) (otherlv_6= 'passo' ( (lv_stepExpe_7_0= ruleExpression ) ) )? otherlv_8= 'faca' this_END_COMMAND_9= RULE_END_COMMAND ( (lv_commands_10_0= ruleAbstractCommand ) )+ otherlv_11= 'fimpara' ) )
            // InternalPortugol.g:1494:2: (otherlv_0= 'para' ( (lv_operatorExpr_1_0= ruleExpression ) ) otherlv_2= 'de' ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= 'ate' ( (lv_endExpr_5_0= ruleExpression ) ) (otherlv_6= 'passo' ( (lv_stepExpe_7_0= ruleExpression ) ) )? otherlv_8= 'faca' this_END_COMMAND_9= RULE_END_COMMAND ( (lv_commands_10_0= ruleAbstractCommand ) )+ otherlv_11= 'fimpara' )
            {
            // InternalPortugol.g:1494:2: (otherlv_0= 'para' ( (lv_operatorExpr_1_0= ruleExpression ) ) otherlv_2= 'de' ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= 'ate' ( (lv_endExpr_5_0= ruleExpression ) ) (otherlv_6= 'passo' ( (lv_stepExpe_7_0= ruleExpression ) ) )? otherlv_8= 'faca' this_END_COMMAND_9= RULE_END_COMMAND ( (lv_commands_10_0= ruleAbstractCommand ) )+ otherlv_11= 'fimpara' )
            // InternalPortugol.g:1495:3: otherlv_0= 'para' ( (lv_operatorExpr_1_0= ruleExpression ) ) otherlv_2= 'de' ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= 'ate' ( (lv_endExpr_5_0= ruleExpression ) ) (otherlv_6= 'passo' ( (lv_stepExpe_7_0= ruleExpression ) ) )? otherlv_8= 'faca' this_END_COMMAND_9= RULE_END_COMMAND ( (lv_commands_10_0= ruleAbstractCommand ) )+ otherlv_11= 'fimpara'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getParaKeyword_0());
              		
            }
            // InternalPortugol.g:1499:3: ( (lv_operatorExpr_1_0= ruleExpression ) )
            // InternalPortugol.g:1500:4: (lv_operatorExpr_1_0= ruleExpression )
            {
            // InternalPortugol.g:1500:4: (lv_operatorExpr_1_0= ruleExpression )
            // InternalPortugol.g:1501:5: lv_operatorExpr_1_0= ruleExpression
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

            otherlv_2=(Token)match(input,39,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForStatementAccess().getDeKeyword_2());
              		
            }
            // InternalPortugol.g:1522:3: ( (lv_startExpr_3_0= ruleExpression ) )
            // InternalPortugol.g:1523:4: (lv_startExpr_3_0= ruleExpression )
            {
            // InternalPortugol.g:1523:4: (lv_startExpr_3_0= ruleExpression )
            // InternalPortugol.g:1524:5: lv_startExpr_3_0= ruleExpression
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

            otherlv_4=(Token)match(input,40,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForStatementAccess().getAteKeyword_4());
              		
            }
            // InternalPortugol.g:1545:3: ( (lv_endExpr_5_0= ruleExpression ) )
            // InternalPortugol.g:1546:4: (lv_endExpr_5_0= ruleExpression )
            {
            // InternalPortugol.g:1546:4: (lv_endExpr_5_0= ruleExpression )
            // InternalPortugol.g:1547:5: lv_endExpr_5_0= ruleExpression
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

            // InternalPortugol.g:1564:3: (otherlv_6= 'passo' ( (lv_stepExpe_7_0= ruleExpression ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPortugol.g:1565:4: otherlv_6= 'passo' ( (lv_stepExpe_7_0= ruleExpression ) )
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getForStatementAccess().getPassoKeyword_6_0());
                      			
                    }
                    // InternalPortugol.g:1569:4: ( (lv_stepExpe_7_0= ruleExpression ) )
                    // InternalPortugol.g:1570:5: (lv_stepExpe_7_0= ruleExpression )
                    {
                    // InternalPortugol.g:1570:5: (lv_stepExpe_7_0= ruleExpression )
                    // InternalPortugol.g:1571:6: lv_stepExpe_7_0= ruleExpression
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

            otherlv_8=(Token)match(input,42,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getForStatementAccess().getFacaKeyword_7());
              		
            }
            this_END_COMMAND_9=(Token)match(input,RULE_END_COMMAND,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_COMMAND_9, grammarAccess.getForStatementAccess().getEND_COMMANDTerminalRuleCall_8());
              		
            }
            // InternalPortugol.g:1597:3: ( (lv_commands_10_0= ruleAbstractCommand ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_STRING||(LA25_0>=RULE_ID && LA25_0<=RULE_FLOAT)||LA25_0==22||LA25_0==29||LA25_0==33||LA25_0==38||LA25_0==44||(LA25_0>=46 && LA25_0<=49)||LA25_0==62||LA25_0==68) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPortugol.g:1598:4: (lv_commands_10_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugol.g:1598:4: (lv_commands_10_0= ruleAbstractCommand )
            	    // InternalPortugol.g:1599:5: lv_commands_10_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getForStatementAccess().getCommandsAbstractCommandParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_34);
            	    lv_commands_10_0=ruleAbstractCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getForStatementRule());
            	      					}
            	      					add(
            	      						current,
            	      						"commands",
            	      						lv_commands_10_0,
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

            otherlv_11=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getForStatementAccess().getFimparaKeyword_10());
              		
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
    // InternalPortugol.g:1624:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalPortugol.g:1624:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalPortugol.g:1625:2: iv_ruleWhileStatement= ruleWhileStatement EOF
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
    // InternalPortugol.g:1631:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'enquanto' ( (lv_whileExpr_1_0= ruleExpression ) ) otherlv_2= 'faca' this_END_COMMAND_3= RULE_END_COMMAND ( (lv_commands_4_0= ruleAbstractCommand ) )+ otherlv_5= 'fimenquanto' ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_END_COMMAND_3=null;
        Token otherlv_5=null;
        EObject lv_whileExpr_1_0 = null;

        EObject lv_commands_4_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1637:2: ( (otherlv_0= 'enquanto' ( (lv_whileExpr_1_0= ruleExpression ) ) otherlv_2= 'faca' this_END_COMMAND_3= RULE_END_COMMAND ( (lv_commands_4_0= ruleAbstractCommand ) )+ otherlv_5= 'fimenquanto' ) )
            // InternalPortugol.g:1638:2: (otherlv_0= 'enquanto' ( (lv_whileExpr_1_0= ruleExpression ) ) otherlv_2= 'faca' this_END_COMMAND_3= RULE_END_COMMAND ( (lv_commands_4_0= ruleAbstractCommand ) )+ otherlv_5= 'fimenquanto' )
            {
            // InternalPortugol.g:1638:2: (otherlv_0= 'enquanto' ( (lv_whileExpr_1_0= ruleExpression ) ) otherlv_2= 'faca' this_END_COMMAND_3= RULE_END_COMMAND ( (lv_commands_4_0= ruleAbstractCommand ) )+ otherlv_5= 'fimenquanto' )
            // InternalPortugol.g:1639:3: otherlv_0= 'enquanto' ( (lv_whileExpr_1_0= ruleExpression ) ) otherlv_2= 'faca' this_END_COMMAND_3= RULE_END_COMMAND ( (lv_commands_4_0= ruleAbstractCommand ) )+ otherlv_5= 'fimenquanto'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getEnquantoKeyword_0());
              		
            }
            // InternalPortugol.g:1643:3: ( (lv_whileExpr_1_0= ruleExpression ) )
            // InternalPortugol.g:1644:4: (lv_whileExpr_1_0= ruleExpression )
            {
            // InternalPortugol.g:1644:4: (lv_whileExpr_1_0= ruleExpression )
            // InternalPortugol.g:1645:5: lv_whileExpr_1_0= ruleExpression
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

            otherlv_2=(Token)match(input,42,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileStatementAccess().getFacaKeyword_2());
              		
            }
            this_END_COMMAND_3=(Token)match(input,RULE_END_COMMAND,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_COMMAND_3, grammarAccess.getWhileStatementAccess().getEND_COMMANDTerminalRuleCall_3());
              		
            }
            // InternalPortugol.g:1670:3: ( (lv_commands_4_0= ruleAbstractCommand ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_STRING||(LA26_0>=RULE_ID && LA26_0<=RULE_FLOAT)||LA26_0==22||LA26_0==29||LA26_0==33||LA26_0==38||LA26_0==44||(LA26_0>=46 && LA26_0<=49)||LA26_0==62||LA26_0==68) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPortugol.g:1671:4: (lv_commands_4_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugol.g:1671:4: (lv_commands_4_0= ruleAbstractCommand )
            	    // InternalPortugol.g:1672:5: lv_commands_4_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWhileStatementAccess().getCommandsAbstractCommandParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_35);
            	    lv_commands_4_0=ruleAbstractCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            	      					}
            	      					add(
            	      						current,
            	      						"commands",
            	      						lv_commands_4_0,
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

            otherlv_5=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getWhileStatementAccess().getFimenquantoKeyword_5());
              		
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
    // InternalPortugol.g:1697:1: entryRuleRepeatStatement returns [EObject current=null] : iv_ruleRepeatStatement= ruleRepeatStatement EOF ;
    public final EObject entryRuleRepeatStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatStatement = null;


        try {
            // InternalPortugol.g:1697:56: (iv_ruleRepeatStatement= ruleRepeatStatement EOF )
            // InternalPortugol.g:1698:2: iv_ruleRepeatStatement= ruleRepeatStatement EOF
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
    // InternalPortugol.g:1704:1: ruleRepeatStatement returns [EObject current=null] : (otherlv_0= 'repita' this_END_COMMAND_1= RULE_END_COMMAND ( (lv_commands_2_0= ruleAbstractCommand ) )+ otherlv_3= 'ate' ( (lv_untilExpr_4_0= ruleExpression ) ) ) ;
    public final EObject ruleRepeatStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_END_COMMAND_1=null;
        Token otherlv_3=null;
        EObject lv_commands_2_0 = null;

        EObject lv_untilExpr_4_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1710:2: ( (otherlv_0= 'repita' this_END_COMMAND_1= RULE_END_COMMAND ( (lv_commands_2_0= ruleAbstractCommand ) )+ otherlv_3= 'ate' ( (lv_untilExpr_4_0= ruleExpression ) ) ) )
            // InternalPortugol.g:1711:2: (otherlv_0= 'repita' this_END_COMMAND_1= RULE_END_COMMAND ( (lv_commands_2_0= ruleAbstractCommand ) )+ otherlv_3= 'ate' ( (lv_untilExpr_4_0= ruleExpression ) ) )
            {
            // InternalPortugol.g:1711:2: (otherlv_0= 'repita' this_END_COMMAND_1= RULE_END_COMMAND ( (lv_commands_2_0= ruleAbstractCommand ) )+ otherlv_3= 'ate' ( (lv_untilExpr_4_0= ruleExpression ) ) )
            // InternalPortugol.g:1712:3: otherlv_0= 'repita' this_END_COMMAND_1= RULE_END_COMMAND ( (lv_commands_2_0= ruleAbstractCommand ) )+ otherlv_3= 'ate' ( (lv_untilExpr_4_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRepeatStatementAccess().getRepitaKeyword_0());
              		
            }
            this_END_COMMAND_1=(Token)match(input,RULE_END_COMMAND,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_COMMAND_1, grammarAccess.getRepeatStatementAccess().getEND_COMMANDTerminalRuleCall_1());
              		
            }
            // InternalPortugol.g:1720:3: ( (lv_commands_2_0= ruleAbstractCommand ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_STRING||(LA27_0>=RULE_ID && LA27_0<=RULE_FLOAT)||LA27_0==22||LA27_0==29||LA27_0==33||LA27_0==38||LA27_0==44||(LA27_0>=46 && LA27_0<=49)||LA27_0==62||LA27_0==68) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPortugol.g:1721:4: (lv_commands_2_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugol.g:1721:4: (lv_commands_2_0= ruleAbstractCommand )
            	    // InternalPortugol.g:1722:5: lv_commands_2_0= ruleAbstractCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRepeatStatementAccess().getCommandsAbstractCommandParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_36);
            	    lv_commands_2_0=ruleAbstractCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRepeatStatementRule());
            	      					}
            	      					add(
            	      						current,
            	      						"commands",
            	      						lv_commands_2_0,
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

            otherlv_3=(Token)match(input,40,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRepeatStatementAccess().getAteKeyword_3());
              		
            }
            // InternalPortugol.g:1743:3: ( (lv_untilExpr_4_0= ruleExpression ) )
            // InternalPortugol.g:1744:4: (lv_untilExpr_4_0= ruleExpression )
            {
            // InternalPortugol.g:1744:4: (lv_untilExpr_4_0= ruleExpression )
            // InternalPortugol.g:1745:5: lv_untilExpr_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRepeatStatementAccess().getUntilExprExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_untilExpr_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRepeatStatementRule());
              					}
              					set(
              						current,
              						"untilExpr",
              						lv_untilExpr_4_0,
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
    // $ANTLR end "ruleRepeatStatement"


    // $ANTLR start "entryRuleSubprogramParam"
    // InternalPortugol.g:1766:1: entryRuleSubprogramParam returns [EObject current=null] : iv_ruleSubprogramParam= ruleSubprogramParam EOF ;
    public final EObject entryRuleSubprogramParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubprogramParam = null;


        try {
            // InternalPortugol.g:1766:56: (iv_ruleSubprogramParam= ruleSubprogramParam EOF )
            // InternalPortugol.g:1767:2: iv_ruleSubprogramParam= ruleSubprogramParam EOF
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
    // InternalPortugol.g:1773:1: ruleSubprogramParam returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleSubprogramParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1779:2: ( ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) ) )* ) )
            // InternalPortugol.g:1780:2: ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) ) )* )
            {
            // InternalPortugol.g:1780:2: ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) ) )* )
            // InternalPortugol.g:1781:3: ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) ) )*
            {
            // InternalPortugol.g:1781:3: ( (lv_expression_0_0= ruleExpression ) )
            // InternalPortugol.g:1782:4: (lv_expression_0_0= ruleExpression )
            {
            // InternalPortugol.g:1782:4: (lv_expression_0_0= ruleExpression )
            // InternalPortugol.g:1783:5: lv_expression_0_0= ruleExpression
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

            // InternalPortugol.g:1800:3: (otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==16) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalPortugol.g:1801:4: otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getSubprogramParamAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPortugol.g:1805:4: ( (lv_expression_2_0= ruleExpression ) )
            	    // InternalPortugol.g:1806:5: (lv_expression_2_0= ruleExpression )
            	    {
            	    // InternalPortugol.g:1806:5: (lv_expression_2_0= ruleExpression )
            	    // InternalPortugol.g:1807:6: lv_expression_2_0= ruleExpression
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
            	    break loop28;
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
    // InternalPortugol.g:1829:1: entryRuleReadCommand returns [EObject current=null] : iv_ruleReadCommand= ruleReadCommand EOF ;
    public final EObject entryRuleReadCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadCommand = null;


        try {
            // InternalPortugol.g:1829:52: (iv_ruleReadCommand= ruleReadCommand EOF )
            // InternalPortugol.g:1830:2: iv_ruleReadCommand= ruleReadCommand EOF
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
    // InternalPortugol.g:1836:1: ruleReadCommand returns [EObject current=null] : (otherlv_0= 'leia' otherlv_1= '(' ( (lv_paramList_2_0= ruleDeclaredVarList ) ) otherlv_3= ')' ) ;
    public final EObject ruleReadCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_paramList_2_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1842:2: ( (otherlv_0= 'leia' otherlv_1= '(' ( (lv_paramList_2_0= ruleDeclaredVarList ) ) otherlv_3= ')' ) )
            // InternalPortugol.g:1843:2: (otherlv_0= 'leia' otherlv_1= '(' ( (lv_paramList_2_0= ruleDeclaredVarList ) ) otherlv_3= ')' )
            {
            // InternalPortugol.g:1843:2: (otherlv_0= 'leia' otherlv_1= '(' ( (lv_paramList_2_0= ruleDeclaredVarList ) ) otherlv_3= ')' )
            // InternalPortugol.g:1844:3: otherlv_0= 'leia' otherlv_1= '(' ( (lv_paramList_2_0= ruleDeclaredVarList ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReadCommandAccess().getLeiaKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReadCommandAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalPortugol.g:1852:3: ( (lv_paramList_2_0= ruleDeclaredVarList ) )
            // InternalPortugol.g:1853:4: (lv_paramList_2_0= ruleDeclaredVarList )
            {
            // InternalPortugol.g:1853:4: (lv_paramList_2_0= ruleDeclaredVarList )
            // InternalPortugol.g:1854:5: lv_paramList_2_0= ruleDeclaredVarList
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

            otherlv_3=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalPortugol.g:1879:1: entryRuleWriteCommand returns [EObject current=null] : iv_ruleWriteCommand= ruleWriteCommand EOF ;
    public final EObject entryRuleWriteCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteCommand = null;


        try {
            // InternalPortugol.g:1879:53: (iv_ruleWriteCommand= ruleWriteCommand EOF )
            // InternalPortugol.g:1880:2: iv_ruleWriteCommand= ruleWriteCommand EOF
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
    // InternalPortugol.g:1886:1: ruleWriteCommand returns [EObject current=null] : ( ( ( (lv_writeCommand_0_1= 'escreva' | lv_writeCommand_0_2= 'escreval' ) ) ) otherlv_1= '(' ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= ')' ) ;
    public final EObject ruleWriteCommand() throws RecognitionException {
        EObject current = null;

        Token lv_writeCommand_0_1=null;
        Token lv_writeCommand_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_writeParam_2_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1892:2: ( ( ( ( (lv_writeCommand_0_1= 'escreva' | lv_writeCommand_0_2= 'escreval' ) ) ) otherlv_1= '(' ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= ')' ) )
            // InternalPortugol.g:1893:2: ( ( ( (lv_writeCommand_0_1= 'escreva' | lv_writeCommand_0_2= 'escreval' ) ) ) otherlv_1= '(' ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= ')' )
            {
            // InternalPortugol.g:1893:2: ( ( ( (lv_writeCommand_0_1= 'escreva' | lv_writeCommand_0_2= 'escreval' ) ) ) otherlv_1= '(' ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= ')' )
            // InternalPortugol.g:1894:3: ( ( (lv_writeCommand_0_1= 'escreva' | lv_writeCommand_0_2= 'escreval' ) ) ) otherlv_1= '(' ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= ')'
            {
            // InternalPortugol.g:1894:3: ( ( (lv_writeCommand_0_1= 'escreva' | lv_writeCommand_0_2= 'escreval' ) ) )
            // InternalPortugol.g:1895:4: ( (lv_writeCommand_0_1= 'escreva' | lv_writeCommand_0_2= 'escreval' ) )
            {
            // InternalPortugol.g:1895:4: ( (lv_writeCommand_0_1= 'escreva' | lv_writeCommand_0_2= 'escreval' ) )
            // InternalPortugol.g:1896:5: (lv_writeCommand_0_1= 'escreva' | lv_writeCommand_0_2= 'escreval' )
            {
            // InternalPortugol.g:1896:5: (lv_writeCommand_0_1= 'escreva' | lv_writeCommand_0_2= 'escreval' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==48) ) {
                alt29=1;
            }
            else if ( (LA29_0==49) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalPortugol.g:1897:6: lv_writeCommand_0_1= 'escreva'
                    {
                    lv_writeCommand_0_1=(Token)match(input,48,FOLLOW_13); if (state.failed) return current;
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
                    // InternalPortugol.g:1908:6: lv_writeCommand_0_2= 'escreval'
                    {
                    lv_writeCommand_0_2=(Token)match(input,49,FOLLOW_13); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,22,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWriteCommandAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalPortugol.g:1925:3: ( (lv_writeParam_2_0= ruleWriteParam ) )
            // InternalPortugol.g:1926:4: (lv_writeParam_2_0= ruleWriteParam )
            {
            // InternalPortugol.g:1926:4: (lv_writeParam_2_0= ruleWriteParam )
            // InternalPortugol.g:1927:5: lv_writeParam_2_0= ruleWriteParam
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

            otherlv_3=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalPortugol.g:1952:1: entryRuleWriteParam returns [EObject current=null] : iv_ruleWriteParam= ruleWriteParam EOF ;
    public final EObject entryRuleWriteParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteParam = null;


        try {
            // InternalPortugol.g:1952:51: (iv_ruleWriteParam= ruleWriteParam EOF )
            // InternalPortugol.g:1953:2: iv_ruleWriteParam= ruleWriteParam EOF
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
    // InternalPortugol.g:1959:1: ruleWriteParam returns [EObject current=null] : ( ( (lv_params_0_0= ruleSubprogramParam ) ) ( (lv_precision_1_0= ruleOptDecimalPrecision ) )? ) ;
    public final EObject ruleWriteParam() throws RecognitionException {
        EObject current = null;

        EObject lv_params_0_0 = null;

        EObject lv_precision_1_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1965:2: ( ( ( (lv_params_0_0= ruleSubprogramParam ) ) ( (lv_precision_1_0= ruleOptDecimalPrecision ) )? ) )
            // InternalPortugol.g:1966:2: ( ( (lv_params_0_0= ruleSubprogramParam ) ) ( (lv_precision_1_0= ruleOptDecimalPrecision ) )? )
            {
            // InternalPortugol.g:1966:2: ( ( (lv_params_0_0= ruleSubprogramParam ) ) ( (lv_precision_1_0= ruleOptDecimalPrecision ) )? )
            // InternalPortugol.g:1967:3: ( (lv_params_0_0= ruleSubprogramParam ) ) ( (lv_precision_1_0= ruleOptDecimalPrecision ) )?
            {
            // InternalPortugol.g:1967:3: ( (lv_params_0_0= ruleSubprogramParam ) )
            // InternalPortugol.g:1968:4: (lv_params_0_0= ruleSubprogramParam )
            {
            // InternalPortugol.g:1968:4: (lv_params_0_0= ruleSubprogramParam )
            // InternalPortugol.g:1969:5: lv_params_0_0= ruleSubprogramParam
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

            // InternalPortugol.g:1986:3: ( (lv_precision_1_0= ruleOptDecimalPrecision ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==15) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPortugol.g:1987:4: (lv_precision_1_0= ruleOptDecimalPrecision )
                    {
                    // InternalPortugol.g:1987:4: (lv_precision_1_0= ruleOptDecimalPrecision )
                    // InternalPortugol.g:1988:5: lv_precision_1_0= ruleOptDecimalPrecision
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
    // InternalPortugol.g:2009:1: entryRuleOptDecimalPrecision returns [EObject current=null] : iv_ruleOptDecimalPrecision= ruleOptDecimalPrecision EOF ;
    public final EObject entryRuleOptDecimalPrecision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptDecimalPrecision = null;


        try {
            // InternalPortugol.g:2009:60: (iv_ruleOptDecimalPrecision= ruleOptDecimalPrecision EOF )
            // InternalPortugol.g:2010:2: iv_ruleOptDecimalPrecision= ruleOptDecimalPrecision EOF
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
    // InternalPortugol.g:2016:1: ruleOptDecimalPrecision returns [EObject current=null] : (otherlv_0= ':' ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= ':' ( (lv_secondPrecision_3_0= RULE_INT ) ) )? ) ;
    public final EObject ruleOptDecimalPrecision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_firstPrecision_1_0=null;
        Token otherlv_2=null;
        Token lv_secondPrecision_3_0=null;


        	enterRule();

        try {
            // InternalPortugol.g:2022:2: ( (otherlv_0= ':' ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= ':' ( (lv_secondPrecision_3_0= RULE_INT ) ) )? ) )
            // InternalPortugol.g:2023:2: (otherlv_0= ':' ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= ':' ( (lv_secondPrecision_3_0= RULE_INT ) ) )? )
            {
            // InternalPortugol.g:2023:2: (otherlv_0= ':' ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= ':' ( (lv_secondPrecision_3_0= RULE_INT ) ) )? )
            // InternalPortugol.g:2024:3: otherlv_0= ':' ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= ':' ( (lv_secondPrecision_3_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOptDecimalPrecisionAccess().getColonKeyword_0());
              		
            }
            // InternalPortugol.g:2028:3: ( (lv_firstPrecision_1_0= RULE_INT ) )
            // InternalPortugol.g:2029:4: (lv_firstPrecision_1_0= RULE_INT )
            {
            // InternalPortugol.g:2029:4: (lv_firstPrecision_1_0= RULE_INT )
            // InternalPortugol.g:2030:5: lv_firstPrecision_1_0= RULE_INT
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

            // InternalPortugol.g:2046:3: (otherlv_2= ':' ( (lv_secondPrecision_3_0= RULE_INT ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==15) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPortugol.g:2047:4: otherlv_2= ':' ( (lv_secondPrecision_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOptDecimalPrecisionAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalPortugol.g:2051:4: ( (lv_secondPrecision_3_0= RULE_INT ) )
                    // InternalPortugol.g:2052:5: (lv_secondPrecision_3_0= RULE_INT )
                    {
                    // InternalPortugol.g:2052:5: (lv_secondPrecision_3_0= RULE_INT )
                    // InternalPortugol.g:2053:6: lv_secondPrecision_3_0= RULE_INT
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
    // InternalPortugol.g:2074:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalPortugol.g:2074:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalPortugol.g:2075:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalPortugol.g:2081:1: ruleExpression returns [EObject current=null] : this_Assignment_0= ruleAssignment ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:2087:2: (this_Assignment_0= ruleAssignment )
            // InternalPortugol.g:2088:2: this_Assignment_0= ruleAssignment
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
    // InternalPortugol.g:2099:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalPortugol.g:2099:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalPortugol.g:2100:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalPortugol.g:2106:1: ruleAssignment returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression ( ( ( ( () ( ( '<-' ) ) ) )=> ( () ( (lv_op_2_0= '<-' ) ) ) ) ( (lv_right_3_0= ruleAssignment ) ) )* ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_OrExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:2112:2: ( (this_OrExpression_0= ruleOrExpression ( ( ( ( () ( ( '<-' ) ) ) )=> ( () ( (lv_op_2_0= '<-' ) ) ) ) ( (lv_right_3_0= ruleAssignment ) ) )* ) )
            // InternalPortugol.g:2113:2: (this_OrExpression_0= ruleOrExpression ( ( ( ( () ( ( '<-' ) ) ) )=> ( () ( (lv_op_2_0= '<-' ) ) ) ) ( (lv_right_3_0= ruleAssignment ) ) )* )
            {
            // InternalPortugol.g:2113:2: (this_OrExpression_0= ruleOrExpression ( ( ( ( () ( ( '<-' ) ) ) )=> ( () ( (lv_op_2_0= '<-' ) ) ) ) ( (lv_right_3_0= ruleAssignment ) ) )* )
            // InternalPortugol.g:2114:3: this_OrExpression_0= ruleOrExpression ( ( ( ( () ( ( '<-' ) ) ) )=> ( () ( (lv_op_2_0= '<-' ) ) ) ) ( (lv_right_3_0= ruleAssignment ) ) )*
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
            // InternalPortugol.g:2122:3: ( ( ( ( () ( ( '<-' ) ) ) )=> ( () ( (lv_op_2_0= '<-' ) ) ) ) ( (lv_right_3_0= ruleAssignment ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==50) ) {
                    int LA32_2 = input.LA(2);

                    if ( (synpred1_InternalPortugol()) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // InternalPortugol.g:2123:4: ( ( ( () ( ( '<-' ) ) ) )=> ( () ( (lv_op_2_0= '<-' ) ) ) ) ( (lv_right_3_0= ruleAssignment ) )
            	    {
            	    // InternalPortugol.g:2123:4: ( ( ( () ( ( '<-' ) ) ) )=> ( () ( (lv_op_2_0= '<-' ) ) ) )
            	    // InternalPortugol.g:2124:5: ( ( () ( ( '<-' ) ) ) )=> ( () ( (lv_op_2_0= '<-' ) ) )
            	    {
            	    // InternalPortugol.g:2134:5: ( () ( (lv_op_2_0= '<-' ) ) )
            	    // InternalPortugol.g:2135:6: () ( (lv_op_2_0= '<-' ) )
            	    {
            	    // InternalPortugol.g:2135:6: ()
            	    // InternalPortugol.g:2136:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAssignmentAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugol.g:2142:6: ( (lv_op_2_0= '<-' ) )
            	    // InternalPortugol.g:2143:7: (lv_op_2_0= '<-' )
            	    {
            	    // InternalPortugol.g:2143:7: (lv_op_2_0= '<-' )
            	    // InternalPortugol.g:2144:8: lv_op_2_0= '<-'
            	    {
            	    lv_op_2_0=(Token)match(input,50,FOLLOW_22); if (state.failed) return current;
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

            	    // InternalPortugol.g:2158:4: ( (lv_right_3_0= ruleAssignment ) )
            	    // InternalPortugol.g:2159:5: (lv_right_3_0= ruleAssignment )
            	    {
            	    // InternalPortugol.g:2159:5: (lv_right_3_0= ruleAssignment )
            	    // InternalPortugol.g:2160:6: lv_right_3_0= ruleAssignment
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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleOrExpression"
    // InternalPortugol.g:2182:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalPortugol.g:2182:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalPortugol.g:2183:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalPortugol.g:2189:1: ruleOrExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( ( ( ( () ( ( 'OU' ) ) ) )=> ( () ( (lv_op_2_0= 'OU' ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_XorExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:2195:2: ( (this_XorExpression_0= ruleXorExpression ( ( ( ( () ( ( 'OU' ) ) ) )=> ( () ( (lv_op_2_0= 'OU' ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) )
            // InternalPortugol.g:2196:2: (this_XorExpression_0= ruleXorExpression ( ( ( ( () ( ( 'OU' ) ) ) )=> ( () ( (lv_op_2_0= 'OU' ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            {
            // InternalPortugol.g:2196:2: (this_XorExpression_0= ruleXorExpression ( ( ( ( () ( ( 'OU' ) ) ) )=> ( () ( (lv_op_2_0= 'OU' ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            // InternalPortugol.g:2197:3: this_XorExpression_0= ruleXorExpression ( ( ( ( () ( ( 'OU' ) ) ) )=> ( () ( (lv_op_2_0= 'OU' ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
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
            // InternalPortugol.g:2205:3: ( ( ( ( () ( ( 'OU' ) ) ) )=> ( () ( (lv_op_2_0= 'OU' ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==51) && (synpred2_InternalPortugol())) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPortugol.g:2206:4: ( ( ( () ( ( 'OU' ) ) ) )=> ( () ( (lv_op_2_0= 'OU' ) ) ) ) ( (lv_right_3_0= ruleXorExpression ) )
            	    {
            	    // InternalPortugol.g:2206:4: ( ( ( () ( ( 'OU' ) ) ) )=> ( () ( (lv_op_2_0= 'OU' ) ) ) )
            	    // InternalPortugol.g:2207:5: ( ( () ( ( 'OU' ) ) ) )=> ( () ( (lv_op_2_0= 'OU' ) ) )
            	    {
            	    // InternalPortugol.g:2217:5: ( () ( (lv_op_2_0= 'OU' ) ) )
            	    // InternalPortugol.g:2218:6: () ( (lv_op_2_0= 'OU' ) )
            	    {
            	    // InternalPortugol.g:2218:6: ()
            	    // InternalPortugol.g:2219:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getOrExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugol.g:2225:6: ( (lv_op_2_0= 'OU' ) )
            	    // InternalPortugol.g:2226:7: (lv_op_2_0= 'OU' )
            	    {
            	    // InternalPortugol.g:2226:7: (lv_op_2_0= 'OU' )
            	    // InternalPortugol.g:2227:8: lv_op_2_0= 'OU'
            	    {
            	    lv_op_2_0=(Token)match(input,51,FOLLOW_22); if (state.failed) return current;
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

            	    // InternalPortugol.g:2241:4: ( (lv_right_3_0= ruleXorExpression ) )
            	    // InternalPortugol.g:2242:5: (lv_right_3_0= ruleXorExpression )
            	    {
            	    // InternalPortugol.g:2242:5: (lv_right_3_0= ruleXorExpression )
            	    // InternalPortugol.g:2243:6: lv_right_3_0= ruleXorExpression
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleXorExpression"
    // InternalPortugol.g:2265:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalPortugol.g:2265:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalPortugol.g:2266:2: iv_ruleXorExpression= ruleXorExpression EOF
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
    // InternalPortugol.g:2272:1: ruleXorExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( 'XOU' ) ) ) )=> ( () ( (lv_op_2_0= 'XOU' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:2278:2: ( (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( 'XOU' ) ) ) )=> ( () ( (lv_op_2_0= 'XOU' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalPortugol.g:2279:2: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( 'XOU' ) ) ) )=> ( () ( (lv_op_2_0= 'XOU' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalPortugol.g:2279:2: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( 'XOU' ) ) ) )=> ( () ( (lv_op_2_0= 'XOU' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalPortugol.g:2280:3: this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( 'XOU' ) ) ) )=> ( () ( (lv_op_2_0= 'XOU' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
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
            // InternalPortugol.g:2288:3: ( ( ( ( () ( ( 'XOU' ) ) ) )=> ( () ( (lv_op_2_0= 'XOU' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==52) && (synpred3_InternalPortugol())) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalPortugol.g:2289:4: ( ( ( () ( ( 'XOU' ) ) ) )=> ( () ( (lv_op_2_0= 'XOU' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalPortugol.g:2289:4: ( ( ( () ( ( 'XOU' ) ) ) )=> ( () ( (lv_op_2_0= 'XOU' ) ) ) )
            	    // InternalPortugol.g:2290:5: ( ( () ( ( 'XOU' ) ) ) )=> ( () ( (lv_op_2_0= 'XOU' ) ) )
            	    {
            	    // InternalPortugol.g:2300:5: ( () ( (lv_op_2_0= 'XOU' ) ) )
            	    // InternalPortugol.g:2301:6: () ( (lv_op_2_0= 'XOU' ) )
            	    {
            	    // InternalPortugol.g:2301:6: ()
            	    // InternalPortugol.g:2302:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getXorExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugol.g:2308:6: ( (lv_op_2_0= 'XOU' ) )
            	    // InternalPortugol.g:2309:7: (lv_op_2_0= 'XOU' )
            	    {
            	    // InternalPortugol.g:2309:7: (lv_op_2_0= 'XOU' )
            	    // InternalPortugol.g:2310:8: lv_op_2_0= 'XOU'
            	    {
            	    lv_op_2_0=(Token)match(input,52,FOLLOW_22); if (state.failed) return current;
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

            	    // InternalPortugol.g:2324:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalPortugol.g:2325:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalPortugol.g:2325:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalPortugol.g:2326:6: lv_right_3_0= ruleAndExpression
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
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalPortugol.g:2348:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalPortugol.g:2348:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalPortugol.g:2349:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalPortugol.g:2355:1: ruleAndExpression returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( ( ( () ( ( ( '&' | 'E' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:2361:2: ( (this_Comparison_0= ruleComparison ( ( ( ( () ( ( ( '&' | 'E' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalPortugol.g:2362:2: (this_Comparison_0= ruleComparison ( ( ( ( () ( ( ( '&' | 'E' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalPortugol.g:2362:2: (this_Comparison_0= ruleComparison ( ( ( ( () ( ( ( '&' | 'E' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalPortugol.g:2363:3: this_Comparison_0= ruleComparison ( ( ( ( () ( ( ( '&' | 'E' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
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
            // InternalPortugol.g:2371:3: ( ( ( ( () ( ( ( '&' | 'E' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==53) && (synpred4_InternalPortugol())) {
                    alt36=1;
                }
                else if ( (LA36_0==54) && (synpred4_InternalPortugol())) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalPortugol.g:2372:4: ( ( ( () ( ( ( '&' | 'E' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) ) ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalPortugol.g:2372:4: ( ( ( () ( ( ( '&' | 'E' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) ) ) ) )
            	    // InternalPortugol.g:2373:5: ( ( () ( ( ( '&' | 'E' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) ) ) )
            	    {
            	    // InternalPortugol.g:2387:5: ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) ) ) )
            	    // InternalPortugol.g:2388:6: () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) ) )
            	    {
            	    // InternalPortugol.g:2388:6: ()
            	    // InternalPortugol.g:2389:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAndExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugol.g:2395:6: ( ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) ) )
            	    // InternalPortugol.g:2396:7: ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) )
            	    {
            	    // InternalPortugol.g:2396:7: ( (lv_op_2_1= '&' | lv_op_2_2= 'E' ) )
            	    // InternalPortugol.g:2397:8: (lv_op_2_1= '&' | lv_op_2_2= 'E' )
            	    {
            	    // InternalPortugol.g:2397:8: (lv_op_2_1= '&' | lv_op_2_2= 'E' )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==53) ) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==54) ) {
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
            	            // InternalPortugol.g:2398:9: lv_op_2_1= '&'
            	            {
            	            lv_op_2_1=(Token)match(input,53,FOLLOW_22); if (state.failed) return current;
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
            	            // InternalPortugol.g:2409:9: lv_op_2_2= 'E'
            	            {
            	            lv_op_2_2=(Token)match(input,54,FOLLOW_22); if (state.failed) return current;
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

            	    // InternalPortugol.g:2424:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalPortugol.g:2425:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalPortugol.g:2425:5: (lv_right_3_0= ruleComparison )
            	    // InternalPortugol.g:2426:6: lv_right_3_0= ruleComparison
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
    // InternalPortugol.g:2448:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalPortugol.g:2448:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalPortugol.g:2449:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalPortugol.g:2455:1: ruleComparison returns [EObject current=null] : (this_EquExpression_0= ruleEquExpression ( ( ( ( () ( ( ( '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_EquExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:2461:2: ( (this_EquExpression_0= ruleEquExpression ( ( ( ( () ( ( ( '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )* ) )
            // InternalPortugol.g:2462:2: (this_EquExpression_0= ruleEquExpression ( ( ( ( () ( ( ( '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )* )
            {
            // InternalPortugol.g:2462:2: (this_EquExpression_0= ruleEquExpression ( ( ( ( () ( ( ( '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )* )
            // InternalPortugol.g:2463:3: this_EquExpression_0= ruleEquExpression ( ( ( ( () ( ( ( '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )*
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
            // InternalPortugol.g:2471:3: ( ( ( ( () ( ( ( '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==55) && (synpred5_InternalPortugol())) {
                    alt38=1;
                }
                else if ( (LA38_0==56) && (synpred5_InternalPortugol())) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalPortugol.g:2472:4: ( ( ( () ( ( ( '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) )
            	    {
            	    // InternalPortugol.g:2472:4: ( ( ( () ( ( ( '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ) )
            	    // InternalPortugol.g:2473:5: ( ( () ( ( ( '=' | '<>' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) )
            	    {
            	    // InternalPortugol.g:2487:5: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) )
            	    // InternalPortugol.g:2488:6: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) )
            	    {
            	    // InternalPortugol.g:2488:6: ()
            	    // InternalPortugol.g:2489:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getComparisonAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugol.g:2495:6: ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) )
            	    // InternalPortugol.g:2496:7: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
            	    {
            	    // InternalPortugol.g:2496:7: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
            	    // InternalPortugol.g:2497:8: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
            	    {
            	    // InternalPortugol.g:2497:8: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==55) ) {
            	        alt37=1;
            	    }
            	    else if ( (LA37_0==56) ) {
            	        alt37=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // InternalPortugol.g:2498:9: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,55,FOLLOW_22); if (state.failed) return current;
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
            	            // InternalPortugol.g:2509:9: lv_op_2_2= '<>'
            	            {
            	            lv_op_2_2=(Token)match(input,56,FOLLOW_22); if (state.failed) return current;
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

            	    // InternalPortugol.g:2524:4: ( (lv_right_3_0= ruleEquExpression ) )
            	    // InternalPortugol.g:2525:5: (lv_right_3_0= ruleEquExpression )
            	    {
            	    // InternalPortugol.g:2525:5: (lv_right_3_0= ruleEquExpression )
            	    // InternalPortugol.g:2526:6: lv_right_3_0= ruleEquExpression
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleEquExpression"
    // InternalPortugol.g:2548:1: entryRuleEquExpression returns [EObject current=null] : iv_ruleEquExpression= ruleEquExpression EOF ;
    public final EObject entryRuleEquExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquExpression = null;


        try {
            // InternalPortugol.g:2548:54: (iv_ruleEquExpression= ruleEquExpression EOF )
            // InternalPortugol.g:2549:2: iv_ruleEquExpression= ruleEquExpression EOF
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
    // InternalPortugol.g:2555:1: ruleEquExpression returns [EObject current=null] : (this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ( '<' | '>' | '<=' | '>=' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* ) ;
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
            // InternalPortugol.g:2561:2: ( (this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ( '<' | '>' | '<=' | '>=' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* ) )
            // InternalPortugol.g:2562:2: (this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ( '<' | '>' | '<=' | '>=' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* )
            {
            // InternalPortugol.g:2562:2: (this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ( '<' | '>' | '<=' | '>=' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* )
            // InternalPortugol.g:2563:3: this_AddExpression_0= ruleAddExpression ( ( ( ( () ( ( ( '<' | '>' | '<=' | '>=' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )*
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
            // InternalPortugol.g:2571:3: ( ( ( ( () ( ( ( '<' | '>' | '<=' | '>=' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==57) && (synpred6_InternalPortugol())) {
                    alt40=1;
                }
                else if ( (LA40_0==58) && (synpred6_InternalPortugol())) {
                    alt40=1;
                }
                else if ( (LA40_0==59) && (synpred6_InternalPortugol())) {
                    alt40=1;
                }
                else if ( (LA40_0==60) && (synpred6_InternalPortugol())) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPortugol.g:2572:4: ( ( ( () ( ( ( '<' | '>' | '<=' | '>=' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) )
            	    {
            	    // InternalPortugol.g:2572:4: ( ( ( () ( ( ( '<' | '>' | '<=' | '>=' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ) )
            	    // InternalPortugol.g:2573:5: ( ( () ( ( ( '<' | '>' | '<=' | '>=' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) )
            	    {
            	    // InternalPortugol.g:2591:5: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) )
            	    // InternalPortugol.g:2592:6: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) )
            	    {
            	    // InternalPortugol.g:2592:6: ()
            	    // InternalPortugol.g:2593:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getEquExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugol.g:2599:6: ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) )
            	    // InternalPortugol.g:2600:7: ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) )
            	    {
            	    // InternalPortugol.g:2600:7: ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) )
            	    // InternalPortugol.g:2601:8: (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' )
            	    {
            	    // InternalPortugol.g:2601:8: (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' )
            	    int alt39=4;
            	    switch ( input.LA(1) ) {
            	    case 57:
            	        {
            	        alt39=1;
            	        }
            	        break;
            	    case 58:
            	        {
            	        alt39=2;
            	        }
            	        break;
            	    case 59:
            	        {
            	        alt39=3;
            	        }
            	        break;
            	    case 60:
            	        {
            	        alt39=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt39) {
            	        case 1 :
            	            // InternalPortugol.g:2602:9: lv_op_2_1= '<'
            	            {
            	            lv_op_2_1=(Token)match(input,57,FOLLOW_22); if (state.failed) return current;
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
            	            // InternalPortugol.g:2613:9: lv_op_2_2= '>'
            	            {
            	            lv_op_2_2=(Token)match(input,58,FOLLOW_22); if (state.failed) return current;
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
            	            // InternalPortugol.g:2624:9: lv_op_2_3= '<='
            	            {
            	            lv_op_2_3=(Token)match(input,59,FOLLOW_22); if (state.failed) return current;
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
            	            // InternalPortugol.g:2635:9: lv_op_2_4= '>='
            	            {
            	            lv_op_2_4=(Token)match(input,60,FOLLOW_22); if (state.failed) return current;
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

            	    // InternalPortugol.g:2650:4: ( (lv_right_3_0= ruleAddExpression ) )
            	    // InternalPortugol.g:2651:5: (lv_right_3_0= ruleAddExpression )
            	    {
            	    // InternalPortugol.g:2651:5: (lv_right_3_0= ruleAddExpression )
            	    // InternalPortugol.g:2652:6: lv_right_3_0= ruleAddExpression
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
    // $ANTLR end "ruleEquExpression"


    // $ANTLR start "entryRuleAddExpression"
    // InternalPortugol.g:2674:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalPortugol.g:2674:54: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalPortugol.g:2675:2: iv_ruleAddExpression= ruleAddExpression EOF
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
    // InternalPortugol.g:2681:1: ruleAddExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:2687:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalPortugol.g:2688:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalPortugol.g:2688:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalPortugol.g:2689:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
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
            // InternalPortugol.g:2697:3: ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==61) && (synpred7_InternalPortugol())) {
                    alt42=1;
                }
                else if ( (LA42_0==62) && (synpred7_InternalPortugol())) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalPortugol.g:2698:4: ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalPortugol.g:2698:4: ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ) )
            	    // InternalPortugol.g:2699:5: ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) )
            	    {
            	    // InternalPortugol.g:2713:5: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) )
            	    // InternalPortugol.g:2714:6: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    {
            	    // InternalPortugol.g:2714:6: ()
            	    // InternalPortugol.g:2715:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getAddExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugol.g:2721:6: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // InternalPortugol.g:2722:7: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // InternalPortugol.g:2722:7: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // InternalPortugol.g:2723:8: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // InternalPortugol.g:2723:8: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==61) ) {
            	        alt41=1;
            	    }
            	    else if ( (LA41_0==62) ) {
            	        alt41=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // InternalPortugol.g:2724:9: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,61,FOLLOW_22); if (state.failed) return current;
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
            	            // InternalPortugol.g:2735:9: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,62,FOLLOW_22); if (state.failed) return current;
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

            	    // InternalPortugol.g:2750:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalPortugol.g:2751:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalPortugol.g:2751:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalPortugol.g:2752:6: lv_right_3_0= ruleMultiplicativeExpression
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
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalPortugol.g:2774:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalPortugol.g:2774:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalPortugol.g:2775:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalPortugol.g:2781:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_PowerExpression_0= rulePowerExpression ( ( ( ( () ( ( ( '*' | '/' | 'MOD' | '%' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )* ) ;
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
            // InternalPortugol.g:2787:2: ( (this_PowerExpression_0= rulePowerExpression ( ( ( ( () ( ( ( '*' | '/' | 'MOD' | '%' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )* ) )
            // InternalPortugol.g:2788:2: (this_PowerExpression_0= rulePowerExpression ( ( ( ( () ( ( ( '*' | '/' | 'MOD' | '%' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )* )
            {
            // InternalPortugol.g:2788:2: (this_PowerExpression_0= rulePowerExpression ( ( ( ( () ( ( ( '*' | '/' | 'MOD' | '%' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )* )
            // InternalPortugol.g:2789:3: this_PowerExpression_0= rulePowerExpression ( ( ( ( () ( ( ( '*' | '/' | 'MOD' | '%' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )*
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
            // InternalPortugol.g:2797:3: ( ( ( ( () ( ( ( '*' | '/' | 'MOD' | '%' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==63) && (synpred8_InternalPortugol())) {
                    alt44=1;
                }
                else if ( (LA44_0==64) && (synpred8_InternalPortugol())) {
                    alt44=1;
                }
                else if ( (LA44_0==65) && (synpred8_InternalPortugol())) {
                    alt44=1;
                }
                else if ( (LA44_0==66) && (synpred8_InternalPortugol())) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalPortugol.g:2798:4: ( ( ( () ( ( ( '*' | '/' | 'MOD' | '%' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) ) ) ) ) ( (lv_right_3_0= rulePowerExpression ) )
            	    {
            	    // InternalPortugol.g:2798:4: ( ( ( () ( ( ( '*' | '/' | 'MOD' | '%' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) ) ) ) )
            	    // InternalPortugol.g:2799:5: ( ( () ( ( ( '*' | '/' | 'MOD' | '%' ) ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) ) ) )
            	    {
            	    // InternalPortugol.g:2817:5: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) ) ) )
            	    // InternalPortugol.g:2818:6: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) ) )
            	    {
            	    // InternalPortugol.g:2818:6: ()
            	    // InternalPortugol.g:2819:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugol.g:2825:6: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) ) )
            	    // InternalPortugol.g:2826:7: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) )
            	    {
            	    // InternalPortugol.g:2826:7: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' ) )
            	    // InternalPortugol.g:2827:8: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' )
            	    {
            	    // InternalPortugol.g:2827:8: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'MOD' | lv_op_2_4= '%' )
            	    int alt43=4;
            	    switch ( input.LA(1) ) {
            	    case 63:
            	        {
            	        alt43=1;
            	        }
            	        break;
            	    case 64:
            	        {
            	        alt43=2;
            	        }
            	        break;
            	    case 65:
            	        {
            	        alt43=3;
            	        }
            	        break;
            	    case 66:
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
            	            // InternalPortugol.g:2828:9: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,63,FOLLOW_22); if (state.failed) return current;
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
            	            // InternalPortugol.g:2839:9: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,64,FOLLOW_22); if (state.failed) return current;
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
            	            // InternalPortugol.g:2850:9: lv_op_2_3= 'MOD'
            	            {
            	            lv_op_2_3=(Token)match(input,65,FOLLOW_22); if (state.failed) return current;
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
            	            // InternalPortugol.g:2861:9: lv_op_2_4= '%'
            	            {
            	            lv_op_2_4=(Token)match(input,66,FOLLOW_22); if (state.failed) return current;
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

            	    // InternalPortugol.g:2876:4: ( (lv_right_3_0= rulePowerExpression ) )
            	    // InternalPortugol.g:2877:5: (lv_right_3_0= rulePowerExpression )
            	    {
            	    // InternalPortugol.g:2877:5: (lv_right_3_0= rulePowerExpression )
            	    // InternalPortugol.g:2878:6: lv_right_3_0= rulePowerExpression
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRulePowerExpression"
    // InternalPortugol.g:2900:1: entryRulePowerExpression returns [EObject current=null] : iv_rulePowerExpression= rulePowerExpression EOF ;
    public final EObject entryRulePowerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerExpression = null;


        try {
            // InternalPortugol.g:2900:56: (iv_rulePowerExpression= rulePowerExpression EOF )
            // InternalPortugol.g:2901:2: iv_rulePowerExpression= rulePowerExpression EOF
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
    // InternalPortugol.g:2907:1: rulePowerExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( ( ( ( () ( ( '^' ) ) ) )=> ( () ( (lv_op_2_0= '^' ) ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject rulePowerExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:2913:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( ( ( ( () ( ( '^' ) ) ) )=> ( () ( (lv_op_2_0= '^' ) ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) )
            // InternalPortugol.g:2914:2: (this_UnaryExpression_0= ruleUnaryExpression ( ( ( ( () ( ( '^' ) ) ) )=> ( () ( (lv_op_2_0= '^' ) ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            {
            // InternalPortugol.g:2914:2: (this_UnaryExpression_0= ruleUnaryExpression ( ( ( ( () ( ( '^' ) ) ) )=> ( () ( (lv_op_2_0= '^' ) ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            // InternalPortugol.g:2915:3: this_UnaryExpression_0= ruleUnaryExpression ( ( ( ( () ( ( '^' ) ) ) )=> ( () ( (lv_op_2_0= '^' ) ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPowerExpressionAccess().getUnaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_47);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugol.g:2923:3: ( ( ( ( () ( ( '^' ) ) ) )=> ( () ( (lv_op_2_0= '^' ) ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==67) && (synpred9_InternalPortugol())) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalPortugol.g:2924:4: ( ( ( () ( ( '^' ) ) ) )=> ( () ( (lv_op_2_0= '^' ) ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) )
            	    {
            	    // InternalPortugol.g:2924:4: ( ( ( () ( ( '^' ) ) ) )=> ( () ( (lv_op_2_0= '^' ) ) ) )
            	    // InternalPortugol.g:2925:5: ( ( () ( ( '^' ) ) ) )=> ( () ( (lv_op_2_0= '^' ) ) )
            	    {
            	    // InternalPortugol.g:2935:5: ( () ( (lv_op_2_0= '^' ) ) )
            	    // InternalPortugol.g:2936:6: () ( (lv_op_2_0= '^' ) )
            	    {
            	    // InternalPortugol.g:2936:6: ()
            	    // InternalPortugol.g:2937:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getPowerExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalPortugol.g:2943:6: ( (lv_op_2_0= '^' ) )
            	    // InternalPortugol.g:2944:7: (lv_op_2_0= '^' )
            	    {
            	    // InternalPortugol.g:2944:7: (lv_op_2_0= '^' )
            	    // InternalPortugol.g:2945:8: lv_op_2_0= '^'
            	    {
            	    lv_op_2_0=(Token)match(input,67,FOLLOW_22); if (state.failed) return current;
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

            	    // InternalPortugol.g:2959:4: ( (lv_right_3_0= ruleUnaryExpression ) )
            	    // InternalPortugol.g:2960:5: (lv_right_3_0= ruleUnaryExpression )
            	    {
            	    // InternalPortugol.g:2960:5: (lv_right_3_0= ruleUnaryExpression )
            	    // InternalPortugol.g:2961:6: lv_right_3_0= ruleUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPowerExpressionAccess().getRightUnaryExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_47);
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
            	    break loop45;
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
    // InternalPortugol.g:2983:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalPortugol.g:2983:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalPortugol.g:2984:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalPortugol.g:2990:1: ruleUnaryExpression returns [EObject current=null] : ( ( () ( ( (lv_op_1_1= 'NOT' | lv_op_1_2= '-' ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        EObject lv_operand_2_0 = null;

        EObject this_PrimaryExpression_3 = null;



        	enterRule();

        try {
            // InternalPortugol.g:2996:2: ( ( ( () ( ( (lv_op_1_1= 'NOT' | lv_op_1_2= '-' ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) )
            // InternalPortugol.g:2997:2: ( ( () ( ( (lv_op_1_1= 'NOT' | lv_op_1_2= '-' ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            {
            // InternalPortugol.g:2997:2: ( ( () ( ( (lv_op_1_1= 'NOT' | lv_op_1_2= '-' ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==62||LA47_0==68) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_STRING||(LA47_0>=RULE_ID && LA47_0<=RULE_FLOAT)||LA47_0==22) ) {
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
                    // InternalPortugol.g:2998:3: ( () ( ( (lv_op_1_1= 'NOT' | lv_op_1_2= '-' ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) )
                    {
                    // InternalPortugol.g:2998:3: ( () ( ( (lv_op_1_1= 'NOT' | lv_op_1_2= '-' ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) )
                    // InternalPortugol.g:2999:4: () ( ( (lv_op_1_1= 'NOT' | lv_op_1_2= '-' ) ) ) ( (lv_operand_2_0= ruleUnaryExpression ) )
                    {
                    // InternalPortugol.g:2999:4: ()
                    // InternalPortugol.g:3000:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPortugol.g:3006:4: ( ( (lv_op_1_1= 'NOT' | lv_op_1_2= '-' ) ) )
                    // InternalPortugol.g:3007:5: ( (lv_op_1_1= 'NOT' | lv_op_1_2= '-' ) )
                    {
                    // InternalPortugol.g:3007:5: ( (lv_op_1_1= 'NOT' | lv_op_1_2= '-' ) )
                    // InternalPortugol.g:3008:6: (lv_op_1_1= 'NOT' | lv_op_1_2= '-' )
                    {
                    // InternalPortugol.g:3008:6: (lv_op_1_1= 'NOT' | lv_op_1_2= '-' )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==68) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==62) ) {
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
                            // InternalPortugol.g:3009:7: lv_op_1_1= 'NOT'
                            {
                            lv_op_1_1=(Token)match(input,68,FOLLOW_22); if (state.failed) return current;
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
                            // InternalPortugol.g:3020:7: lv_op_1_2= '-'
                            {
                            lv_op_1_2=(Token)match(input,62,FOLLOW_22); if (state.failed) return current;
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

                    // InternalPortugol.g:3033:4: ( (lv_operand_2_0= ruleUnaryExpression ) )
                    // InternalPortugol.g:3034:5: (lv_operand_2_0= ruleUnaryExpression )
                    {
                    // InternalPortugol.g:3034:5: (lv_operand_2_0= ruleUnaryExpression )
                    // InternalPortugol.g:3035:6: lv_operand_2_0= ruleUnaryExpression
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
                    // InternalPortugol.g:3054:3: this_PrimaryExpression_3= rulePrimaryExpression
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
    // InternalPortugol.g:3066:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalPortugol.g:3066:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalPortugol.g:3067:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalPortugol.g:3073:1: rulePrimaryExpression returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_FunctionCall_1= ruleFunctionCall | this_DeclaredVar_2= ruleDeclaredVar | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) ) ;
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
            // InternalPortugol.g:3079:2: ( (this_Literal_0= ruleLiteral | this_FunctionCall_1= ruleFunctionCall | this_DeclaredVar_2= ruleDeclaredVar | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) ) )
            // InternalPortugol.g:3080:2: (this_Literal_0= ruleLiteral | this_FunctionCall_1= ruleFunctionCall | this_DeclaredVar_2= ruleDeclaredVar | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) )
            {
            // InternalPortugol.g:3080:2: (this_Literal_0= ruleLiteral | this_FunctionCall_1= ruleFunctionCall | this_DeclaredVar_2= ruleDeclaredVar | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) )
            int alt48=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_FLOAT:
                {
                alt48=1;
                }
                break;
            case RULE_ID:
                {
                int LA48_2 = input.LA(2);

                if ( (LA48_2==EOF||LA48_2==RULE_END_COMMAND||(LA48_2>=15 && LA48_2<=16)||LA48_2==23||LA48_2==30||(LA48_2>=39 && LA48_2<=42)||(LA48_2>=50 && LA48_2<=67)) ) {
                    alt48=3;
                }
                else if ( (LA48_2==22) ) {
                    alt48=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 2, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                alt48=4;
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
                    // InternalPortugol.g:3081:3: this_Literal_0= ruleLiteral
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
                    // InternalPortugol.g:3090:3: this_FunctionCall_1= ruleFunctionCall
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
                    // InternalPortugol.g:3099:3: this_DeclaredVar_2= ruleDeclaredVar
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
                    // InternalPortugol.g:3108:3: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    {
                    // InternalPortugol.g:3108:3: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    // InternalPortugol.g:3109:4: otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22); if (state.failed) return current;
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
                    otherlv_5=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalPortugol.g:3130:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalPortugol.g:3130:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalPortugol.g:3131:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalPortugol.g:3137:1: ruleFunctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_param_2_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:3143:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= ')' ) )
            // InternalPortugol.g:3144:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= ')' )
            {
            // InternalPortugol.g:3144:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= ')' )
            // InternalPortugol.g:3145:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_param_2_0= ruleSubprogramParam ) ) otherlv_3= ')'
            {
            // InternalPortugol.g:3145:3: ( (otherlv_0= RULE_ID ) )
            // InternalPortugol.g:3146:4: (otherlv_0= RULE_ID )
            {
            // InternalPortugol.g:3146:4: (otherlv_0= RULE_ID )
            // InternalPortugol.g:3147:5: otherlv_0= RULE_ID
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

            otherlv_1=(Token)match(input,22,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalPortugol.g:3162:3: ( (lv_param_2_0= ruleSubprogramParam ) )
            // InternalPortugol.g:3163:4: (lv_param_2_0= ruleSubprogramParam )
            {
            // InternalPortugol.g:3163:4: (lv_param_2_0= ruleSubprogramParam )
            // InternalPortugol.g:3164:5: lv_param_2_0= ruleSubprogramParam
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

            otherlv_3=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalPortugol.g:3189:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalPortugol.g:3189:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalPortugol.g:3190:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalPortugol.g:3196:1: ruleLiteral returns [EObject current=null] : (this_NumericLiteral_0= ruleNumericLiteral | this_StringExpression_1= ruleStringExpression ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NumericLiteral_0 = null;

        EObject this_StringExpression_1 = null;



        	enterRule();

        try {
            // InternalPortugol.g:3202:2: ( (this_NumericLiteral_0= ruleNumericLiteral | this_StringExpression_1= ruleStringExpression ) )
            // InternalPortugol.g:3203:2: (this_NumericLiteral_0= ruleNumericLiteral | this_StringExpression_1= ruleStringExpression )
            {
            // InternalPortugol.g:3203:2: (this_NumericLiteral_0= ruleNumericLiteral | this_StringExpression_1= ruleStringExpression )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_INT && LA49_0<=RULE_FLOAT)) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_STRING) ) {
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
                    // InternalPortugol.g:3204:3: this_NumericLiteral_0= ruleNumericLiteral
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
                    // InternalPortugol.g:3213:3: this_StringExpression_1= ruleStringExpression
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
    // InternalPortugol.g:3225:1: entryRuleDeclaredVar returns [EObject current=null] : iv_ruleDeclaredVar= ruleDeclaredVar EOF ;
    public final EObject entryRuleDeclaredVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredVar = null;


        try {
            // InternalPortugol.g:3225:52: (iv_ruleDeclaredVar= ruleDeclaredVar EOF )
            // InternalPortugol.g:3226:2: iv_ruleDeclaredVar= ruleDeclaredVar EOF
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
    // InternalPortugol.g:3232:1: ruleDeclaredVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDeclaredVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalPortugol.g:3238:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalPortugol.g:3239:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalPortugol.g:3239:2: ( (otherlv_0= RULE_ID ) )
            // InternalPortugol.g:3240:3: (otherlv_0= RULE_ID )
            {
            // InternalPortugol.g:3240:3: (otherlv_0= RULE_ID )
            // InternalPortugol.g:3241:4: otherlv_0= RULE_ID
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
    // InternalPortugol.g:3255:1: entryRuleNumericLiteral returns [EObject current=null] : iv_ruleNumericLiteral= ruleNumericLiteral EOF ;
    public final EObject entryRuleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteral = null;


        try {
            // InternalPortugol.g:3255:55: (iv_ruleNumericLiteral= ruleNumericLiteral EOF )
            // InternalPortugol.g:3256:2: iv_ruleNumericLiteral= ruleNumericLiteral EOF
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
    // InternalPortugol.g:3262:1: ruleNumericLiteral returns [EObject current=null] : ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleNumericLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_intValue_0_0=null;
        Token lv_floatValue_1_0=null;


        	enterRule();

        try {
            // InternalPortugol.g:3268:2: ( ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= RULE_FLOAT ) ) ) )
            // InternalPortugol.g:3269:2: ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= RULE_FLOAT ) ) )
            {
            // InternalPortugol.g:3269:2: ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= RULE_FLOAT ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_INT) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_FLOAT) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalPortugol.g:3270:3: ( (lv_intValue_0_0= RULE_INT ) )
                    {
                    // InternalPortugol.g:3270:3: ( (lv_intValue_0_0= RULE_INT ) )
                    // InternalPortugol.g:3271:4: (lv_intValue_0_0= RULE_INT )
                    {
                    // InternalPortugol.g:3271:4: (lv_intValue_0_0= RULE_INT )
                    // InternalPortugol.g:3272:5: lv_intValue_0_0= RULE_INT
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
                    // InternalPortugol.g:3289:3: ( (lv_floatValue_1_0= RULE_FLOAT ) )
                    {
                    // InternalPortugol.g:3289:3: ( (lv_floatValue_1_0= RULE_FLOAT ) )
                    // InternalPortugol.g:3290:4: (lv_floatValue_1_0= RULE_FLOAT )
                    {
                    // InternalPortugol.g:3290:4: (lv_floatValue_1_0= RULE_FLOAT )
                    // InternalPortugol.g:3291:5: lv_floatValue_1_0= RULE_FLOAT
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
    // InternalPortugol.g:3311:1: entryRuleStringExpression returns [EObject current=null] : iv_ruleStringExpression= ruleStringExpression EOF ;
    public final EObject entryRuleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpression = null;


        try {
            // InternalPortugol.g:3311:57: (iv_ruleStringExpression= ruleStringExpression EOF )
            // InternalPortugol.g:3312:2: iv_ruleStringExpression= ruleStringExpression EOF
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
    // InternalPortugol.g:3318:1: ruleStringExpression returns [EObject current=null] : ( (lv_literalString_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringExpression() throws RecognitionException {
        EObject current = null;

        Token lv_literalString_0_0=null;


        	enterRule();

        try {
            // InternalPortugol.g:3324:2: ( ( (lv_literalString_0_0= RULE_STRING ) ) )
            // InternalPortugol.g:3325:2: ( (lv_literalString_0_0= RULE_STRING ) )
            {
            // InternalPortugol.g:3325:2: ( (lv_literalString_0_0= RULE_STRING ) )
            // InternalPortugol.g:3326:3: (lv_literalString_0_0= RULE_STRING )
            {
            // InternalPortugol.g:3326:3: (lv_literalString_0_0= RULE_STRING )
            // InternalPortugol.g:3327:4: lv_literalString_0_0= RULE_STRING
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

    // $ANTLR start synpred1_InternalPortugol
    public final void synpred1_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:2124:5: ( ( () ( ( '<-' ) ) ) )
        // InternalPortugol.g:2124:6: ( () ( ( '<-' ) ) )
        {
        // InternalPortugol.g:2124:6: ( () ( ( '<-' ) ) )
        // InternalPortugol.g:2125:6: () ( ( '<-' ) )
        {
        // InternalPortugol.g:2125:6: ()
        // InternalPortugol.g:2126:6: 
        {
        }

        // InternalPortugol.g:2127:6: ( ( '<-' ) )
        // InternalPortugol.g:2128:7: ( '<-' )
        {
        // InternalPortugol.g:2128:7: ( '<-' )
        // InternalPortugol.g:2129:8: '<-'
        {
        match(input,50,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalPortugol

    // $ANTLR start synpred2_InternalPortugol
    public final void synpred2_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:2207:5: ( ( () ( ( 'OU' ) ) ) )
        // InternalPortugol.g:2207:6: ( () ( ( 'OU' ) ) )
        {
        // InternalPortugol.g:2207:6: ( () ( ( 'OU' ) ) )
        // InternalPortugol.g:2208:6: () ( ( 'OU' ) )
        {
        // InternalPortugol.g:2208:6: ()
        // InternalPortugol.g:2209:6: 
        {
        }

        // InternalPortugol.g:2210:6: ( ( 'OU' ) )
        // InternalPortugol.g:2211:7: ( 'OU' )
        {
        // InternalPortugol.g:2211:7: ( 'OU' )
        // InternalPortugol.g:2212:8: 'OU'
        {
        match(input,51,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalPortugol

    // $ANTLR start synpred3_InternalPortugol
    public final void synpred3_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:2290:5: ( ( () ( ( 'XOU' ) ) ) )
        // InternalPortugol.g:2290:6: ( () ( ( 'XOU' ) ) )
        {
        // InternalPortugol.g:2290:6: ( () ( ( 'XOU' ) ) )
        // InternalPortugol.g:2291:6: () ( ( 'XOU' ) )
        {
        // InternalPortugol.g:2291:6: ()
        // InternalPortugol.g:2292:6: 
        {
        }

        // InternalPortugol.g:2293:6: ( ( 'XOU' ) )
        // InternalPortugol.g:2294:7: ( 'XOU' )
        {
        // InternalPortugol.g:2294:7: ( 'XOU' )
        // InternalPortugol.g:2295:8: 'XOU'
        {
        match(input,52,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalPortugol

    // $ANTLR start synpred4_InternalPortugol
    public final void synpred4_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:2373:5: ( ( () ( ( ( '&' | 'E' ) ) ) ) )
        // InternalPortugol.g:2373:6: ( () ( ( ( '&' | 'E' ) ) ) )
        {
        // InternalPortugol.g:2373:6: ( () ( ( ( '&' | 'E' ) ) ) )
        // InternalPortugol.g:2374:6: () ( ( ( '&' | 'E' ) ) )
        {
        // InternalPortugol.g:2374:6: ()
        // InternalPortugol.g:2375:6: 
        {
        }

        // InternalPortugol.g:2376:6: ( ( ( '&' | 'E' ) ) )
        // InternalPortugol.g:2377:7: ( ( '&' | 'E' ) )
        {
        // InternalPortugol.g:2377:7: ( ( '&' | 'E' ) )
        // InternalPortugol.g:2378:8: ( '&' | 'E' )
        {
        if ( (input.LA(1)>=53 && input.LA(1)<=54) ) {
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
        // InternalPortugol.g:2473:5: ( ( () ( ( ( '=' | '<>' ) ) ) ) )
        // InternalPortugol.g:2473:6: ( () ( ( ( '=' | '<>' ) ) ) )
        {
        // InternalPortugol.g:2473:6: ( () ( ( ( '=' | '<>' ) ) ) )
        // InternalPortugol.g:2474:6: () ( ( ( '=' | '<>' ) ) )
        {
        // InternalPortugol.g:2474:6: ()
        // InternalPortugol.g:2475:6: 
        {
        }

        // InternalPortugol.g:2476:6: ( ( ( '=' | '<>' ) ) )
        // InternalPortugol.g:2477:7: ( ( '=' | '<>' ) )
        {
        // InternalPortugol.g:2477:7: ( ( '=' | '<>' ) )
        // InternalPortugol.g:2478:8: ( '=' | '<>' )
        {
        if ( (input.LA(1)>=55 && input.LA(1)<=56) ) {
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
        // InternalPortugol.g:2573:5: ( ( () ( ( ( '<' | '>' | '<=' | '>=' ) ) ) ) )
        // InternalPortugol.g:2573:6: ( () ( ( ( '<' | '>' | '<=' | '>=' ) ) ) )
        {
        // InternalPortugol.g:2573:6: ( () ( ( ( '<' | '>' | '<=' | '>=' ) ) ) )
        // InternalPortugol.g:2574:6: () ( ( ( '<' | '>' | '<=' | '>=' ) ) )
        {
        // InternalPortugol.g:2574:6: ()
        // InternalPortugol.g:2575:6: 
        {
        }

        // InternalPortugol.g:2576:6: ( ( ( '<' | '>' | '<=' | '>=' ) ) )
        // InternalPortugol.g:2577:7: ( ( '<' | '>' | '<=' | '>=' ) )
        {
        // InternalPortugol.g:2577:7: ( ( '<' | '>' | '<=' | '>=' ) )
        // InternalPortugol.g:2578:8: ( '<' | '>' | '<=' | '>=' )
        {
        if ( (input.LA(1)>=57 && input.LA(1)<=60) ) {
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
        // InternalPortugol.g:2699:5: ( ( () ( ( ( '+' | '-' ) ) ) ) )
        // InternalPortugol.g:2699:6: ( () ( ( ( '+' | '-' ) ) ) )
        {
        // InternalPortugol.g:2699:6: ( () ( ( ( '+' | '-' ) ) ) )
        // InternalPortugol.g:2700:6: () ( ( ( '+' | '-' ) ) )
        {
        // InternalPortugol.g:2700:6: ()
        // InternalPortugol.g:2701:6: 
        {
        }

        // InternalPortugol.g:2702:6: ( ( ( '+' | '-' ) ) )
        // InternalPortugol.g:2703:7: ( ( '+' | '-' ) )
        {
        // InternalPortugol.g:2703:7: ( ( '+' | '-' ) )
        // InternalPortugol.g:2704:8: ( '+' | '-' )
        {
        if ( (input.LA(1)>=61 && input.LA(1)<=62) ) {
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
        // InternalPortugol.g:2799:5: ( ( () ( ( ( '*' | '/' | 'MOD' | '%' ) ) ) ) )
        // InternalPortugol.g:2799:6: ( () ( ( ( '*' | '/' | 'MOD' | '%' ) ) ) )
        {
        // InternalPortugol.g:2799:6: ( () ( ( ( '*' | '/' | 'MOD' | '%' ) ) ) )
        // InternalPortugol.g:2800:6: () ( ( ( '*' | '/' | 'MOD' | '%' ) ) )
        {
        // InternalPortugol.g:2800:6: ()
        // InternalPortugol.g:2801:6: 
        {
        }

        // InternalPortugol.g:2802:6: ( ( ( '*' | '/' | 'MOD' | '%' ) ) )
        // InternalPortugol.g:2803:7: ( ( '*' | '/' | 'MOD' | '%' ) )
        {
        // InternalPortugol.g:2803:7: ( ( '*' | '/' | 'MOD' | '%' ) )
        // InternalPortugol.g:2804:8: ( '*' | '/' | 'MOD' | '%' )
        {
        if ( (input.LA(1)>=63 && input.LA(1)<=66) ) {
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
        // InternalPortugol.g:2925:5: ( ( () ( ( '^' ) ) ) )
        // InternalPortugol.g:2925:6: ( () ( ( '^' ) ) )
        {
        // InternalPortugol.g:2925:6: ( () ( ( '^' ) ) )
        // InternalPortugol.g:2926:6: () ( ( '^' ) )
        {
        // InternalPortugol.g:2926:6: ()
        // InternalPortugol.g:2927:6: 
        {
        }

        // InternalPortugol.g:2928:6: ( ( '^' ) )
        // InternalPortugol.g:2929:7: ( '^' )
        {
        // InternalPortugol.g:2929:7: ( '^' )
        // InternalPortugol.g:2930:8: '^'
        {
        match(input,67,FOLLOW_2); if (state.failed) return ;

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000005200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x4003D042204001D0L,0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x4003D042224001D0L,0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x4003D042284001D0L,0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x4003D042304001D0L,0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x40000000004001D0L,0x0000000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x4003D043A04001D0L,0x0000000000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x4003D043204001D0L,0x0000000000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002C00000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x4003D052204001D2L,0x0000000000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x4003D842204001D0L,0x0000000000000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x4003F042204001D0L,0x0000000000000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x4003D142204001D0L,0x0000000000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x1E00000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});

}