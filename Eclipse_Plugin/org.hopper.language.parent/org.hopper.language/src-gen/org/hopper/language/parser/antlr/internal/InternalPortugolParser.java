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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_END_COMMAND", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'algoritmo'", "'var'", "':'", "','", "'real'", "'inteiro'", "'caractere'", "'funcao'", "'('", "')'", "'inicio'", "'fimfuncao'", "'procedimento'", "'fimprocedimento'", "'fimalgoritmo'", "'leia'", "'escreva'", "'OR'", "'XOR'", "'&'", "'AND'", "'='", "'<>'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'MOD'", "'^'", "'NOT'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
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
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=8;
    public static final int T__46=46;
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
    // InternalPortugol.g:166:1: ruleHeaderBlock returns [EObject current=null] : (otherlv_0= 'algoritmo' ( (lv_name_1_0= RULE_STRING ) ) this_END_COMMAND_2= RULE_END_COMMAND ) ;
    public final EObject ruleHeaderBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_END_COMMAND_2=null;


        	enterRule();

        try {
            // InternalPortugol.g:172:2: ( (otherlv_0= 'algoritmo' ( (lv_name_1_0= RULE_STRING ) ) this_END_COMMAND_2= RULE_END_COMMAND ) )
            // InternalPortugol.g:173:2: (otherlv_0= 'algoritmo' ( (lv_name_1_0= RULE_STRING ) ) this_END_COMMAND_2= RULE_END_COMMAND )
            {
            // InternalPortugol.g:173:2: (otherlv_0= 'algoritmo' ( (lv_name_1_0= RULE_STRING ) ) this_END_COMMAND_2= RULE_END_COMMAND )
            // InternalPortugol.g:174:3: otherlv_0= 'algoritmo' ( (lv_name_1_0= RULE_STRING ) ) this_END_COMMAND_2= RULE_END_COMMAND
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getHeaderBlockAccess().getAlgoritmoKeyword_0());
              		
            }
            // InternalPortugol.g:178:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalPortugol.g:179:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalPortugol.g:179:4: (lv_name_1_0= RULE_STRING )
            // InternalPortugol.g:180:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getHeaderBlockAccess().getNameSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getHeaderBlockRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
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


    // $ANTLR start "entryRuleDeclaredVar"
    // InternalPortugol.g:380:1: entryRuleDeclaredVar returns [EObject current=null] : iv_ruleDeclaredVar= ruleDeclaredVar EOF ;
    public final EObject entryRuleDeclaredVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredVar = null;


        try {
            // InternalPortugol.g:380:52: (iv_ruleDeclaredVar= ruleDeclaredVar EOF )
            // InternalPortugol.g:381:2: iv_ruleDeclaredVar= ruleDeclaredVar EOF
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
    // InternalPortugol.g:387:1: ruleDeclaredVar returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleDeclaredVar() throws RecognitionException {
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
              						current = createModelElement(grammarAccess.getDeclaredVarRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDeclaredVarAccess().getVarsVarNameCrossReference_0_0());
              				
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

            	      				newLeafNode(otherlv_1, grammarAccess.getDeclaredVarAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPortugol.g:413:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalPortugol.g:414:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalPortugol.g:414:5: (otherlv_2= RULE_ID )
            	    // InternalPortugol.g:415:6: otherlv_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDeclaredVarRule());
            	      						}
            	      					
            	    }
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getDeclaredVarAccess().getVarsVarNameCrossReference_1_1_0());
            	      					
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
    // $ANTLR end "ruleDeclaredVar"


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
    // InternalPortugol.g:473:1: ruleVarType returns [EObject current=null] : ( ( (lv_typeName_0_1= 'real' | lv_typeName_0_2= 'inteiro' | lv_typeName_0_3= 'caractere' ) ) ) ;
    public final EObject ruleVarType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;


        	enterRule();

        try {
            // InternalPortugol.g:479:2: ( ( ( (lv_typeName_0_1= 'real' | lv_typeName_0_2= 'inteiro' | lv_typeName_0_3= 'caractere' ) ) ) )
            // InternalPortugol.g:480:2: ( ( (lv_typeName_0_1= 'real' | lv_typeName_0_2= 'inteiro' | lv_typeName_0_3= 'caractere' ) ) )
            {
            // InternalPortugol.g:480:2: ( ( (lv_typeName_0_1= 'real' | lv_typeName_0_2= 'inteiro' | lv_typeName_0_3= 'caractere' ) ) )
            // InternalPortugol.g:481:3: ( (lv_typeName_0_1= 'real' | lv_typeName_0_2= 'inteiro' | lv_typeName_0_3= 'caractere' ) )
            {
            // InternalPortugol.g:481:3: ( (lv_typeName_0_1= 'real' | lv_typeName_0_2= 'inteiro' | lv_typeName_0_3= 'caractere' ) )
            // InternalPortugol.g:482:4: (lv_typeName_0_1= 'real' | lv_typeName_0_2= 'inteiro' | lv_typeName_0_3= 'caractere' )
            {
            // InternalPortugol.g:482:4: (lv_typeName_0_1= 'real' | lv_typeName_0_2= 'inteiro' | lv_typeName_0_3= 'caractere' )
            int alt5=3;
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
    // InternalPortugol.g:521:1: entryRuleSubprograms returns [EObject current=null] : iv_ruleSubprograms= ruleSubprograms EOF ;
    public final EObject entryRuleSubprograms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubprograms = null;


        try {
            // InternalPortugol.g:521:52: (iv_ruleSubprograms= ruleSubprograms EOF )
            // InternalPortugol.g:522:2: iv_ruleSubprograms= ruleSubprograms EOF
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
    // InternalPortugol.g:528:1: ruleSubprograms returns [EObject current=null] : ( (lv_blockSubPrograms_0_0= ruleBlockSubPrograms ) )+ ;
    public final EObject ruleSubprograms() throws RecognitionException {
        EObject current = null;

        EObject lv_blockSubPrograms_0_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:534:2: ( ( (lv_blockSubPrograms_0_0= ruleBlockSubPrograms ) )+ )
            // InternalPortugol.g:535:2: ( (lv_blockSubPrograms_0_0= ruleBlockSubPrograms ) )+
            {
            // InternalPortugol.g:535:2: ( (lv_blockSubPrograms_0_0= ruleBlockSubPrograms ) )+
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
            	    // InternalPortugol.g:536:3: (lv_blockSubPrograms_0_0= ruleBlockSubPrograms )
            	    {
            	    // InternalPortugol.g:536:3: (lv_blockSubPrograms_0_0= ruleBlockSubPrograms )
            	    // InternalPortugol.g:537:4: lv_blockSubPrograms_0_0= ruleBlockSubPrograms
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
    // InternalPortugol.g:557:1: entryRuleBlockSubPrograms returns [EObject current=null] : iv_ruleBlockSubPrograms= ruleBlockSubPrograms EOF ;
    public final EObject entryRuleBlockSubPrograms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockSubPrograms = null;


        try {
            // InternalPortugol.g:557:57: (iv_ruleBlockSubPrograms= ruleBlockSubPrograms EOF )
            // InternalPortugol.g:558:2: iv_ruleBlockSubPrograms= ruleBlockSubPrograms EOF
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
    // InternalPortugol.g:564:1: ruleBlockSubPrograms returns [EObject current=null] : (this_BlockFunction_0= ruleBlockFunction | this_BlockProcedure_1= ruleBlockProcedure ) ;
    public final EObject ruleBlockSubPrograms() throws RecognitionException {
        EObject current = null;

        EObject this_BlockFunction_0 = null;

        EObject this_BlockProcedure_1 = null;



        	enterRule();

        try {
            // InternalPortugol.g:570:2: ( (this_BlockFunction_0= ruleBlockFunction | this_BlockProcedure_1= ruleBlockProcedure ) )
            // InternalPortugol.g:571:2: (this_BlockFunction_0= ruleBlockFunction | this_BlockProcedure_1= ruleBlockProcedure )
            {
            // InternalPortugol.g:571:2: (this_BlockFunction_0= ruleBlockFunction | this_BlockProcedure_1= ruleBlockProcedure )
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
                    // InternalPortugol.g:572:3: this_BlockFunction_0= ruleBlockFunction
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
                    // InternalPortugol.g:581:3: this_BlockProcedure_1= ruleBlockProcedure
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


    // $ANTLR start "entryRuleFunctionName"
    // InternalPortugol.g:593:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // InternalPortugol.g:593:53: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalPortugol.g:594:2: iv_ruleFunctionName= ruleFunctionName EOF
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
    // InternalPortugol.g:600:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPortugol.g:606:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPortugol.g:607:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPortugol.g:607:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPortugol.g:608:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPortugol.g:608:3: (lv_name_0_0= RULE_ID )
            // InternalPortugol.g:609:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleProcedureName"
    // InternalPortugol.g:628:1: entryRuleProcedureName returns [EObject current=null] : iv_ruleProcedureName= ruleProcedureName EOF ;
    public final EObject entryRuleProcedureName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedureName = null;


        try {
            // InternalPortugol.g:628:54: (iv_ruleProcedureName= ruleProcedureName EOF )
            // InternalPortugol.g:629:2: iv_ruleProcedureName= ruleProcedureName EOF
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
    // InternalPortugol.g:635:1: ruleProcedureName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleProcedureName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPortugol.g:641:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPortugol.g:642:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPortugol.g:642:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPortugol.g:643:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPortugol.g:643:3: (lv_name_0_0= RULE_ID )
            // InternalPortugol.g:644:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleBlockFunction"
    // InternalPortugol.g:663:1: entryRuleBlockFunction returns [EObject current=null] : iv_ruleBlockFunction= ruleBlockFunction EOF ;
    public final EObject entryRuleBlockFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockFunction = null;


        try {
            // InternalPortugol.g:663:54: (iv_ruleBlockFunction= ruleBlockFunction EOF )
            // InternalPortugol.g:664:2: iv_ruleBlockFunction= ruleBlockFunction EOF
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
    // InternalPortugol.g:670:1: ruleBlockFunction returns [EObject current=null] : (otherlv_0= 'funcao' ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleVarType ) ) this_END_COMMAND_7= RULE_END_COMMAND ( (lv_declarations_8_0= ruleDeclarationsBlock ) )? otherlv_9= 'inicio' this_END_COMMAND_10= RULE_END_COMMAND ( (lv_commands_11_0= ruleAbstractCommand ) )+ otherlv_12= 'fimfuncao' this_END_COMMAND_13= RULE_END_COMMAND ) ;
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
            // InternalPortugol.g:676:2: ( (otherlv_0= 'funcao' ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleVarType ) ) this_END_COMMAND_7= RULE_END_COMMAND ( (lv_declarations_8_0= ruleDeclarationsBlock ) )? otherlv_9= 'inicio' this_END_COMMAND_10= RULE_END_COMMAND ( (lv_commands_11_0= ruleAbstractCommand ) )+ otherlv_12= 'fimfuncao' this_END_COMMAND_13= RULE_END_COMMAND ) )
            // InternalPortugol.g:677:2: (otherlv_0= 'funcao' ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleVarType ) ) this_END_COMMAND_7= RULE_END_COMMAND ( (lv_declarations_8_0= ruleDeclarationsBlock ) )? otherlv_9= 'inicio' this_END_COMMAND_10= RULE_END_COMMAND ( (lv_commands_11_0= ruleAbstractCommand ) )+ otherlv_12= 'fimfuncao' this_END_COMMAND_13= RULE_END_COMMAND )
            {
            // InternalPortugol.g:677:2: (otherlv_0= 'funcao' ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleVarType ) ) this_END_COMMAND_7= RULE_END_COMMAND ( (lv_declarations_8_0= ruleDeclarationsBlock ) )? otherlv_9= 'inicio' this_END_COMMAND_10= RULE_END_COMMAND ( (lv_commands_11_0= ruleAbstractCommand ) )+ otherlv_12= 'fimfuncao' this_END_COMMAND_13= RULE_END_COMMAND )
            // InternalPortugol.g:678:3: otherlv_0= 'funcao' ( (lv_functionName_1_0= ruleFunctionName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_returnType_6_0= ruleVarType ) ) this_END_COMMAND_7= RULE_END_COMMAND ( (lv_declarations_8_0= ruleDeclarationsBlock ) )? otherlv_9= 'inicio' this_END_COMMAND_10= RULE_END_COMMAND ( (lv_commands_11_0= ruleAbstractCommand ) )+ otherlv_12= 'fimfuncao' this_END_COMMAND_13= RULE_END_COMMAND
            {
            otherlv_0=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlockFunctionAccess().getFuncaoKeyword_0());
              		
            }
            // InternalPortugol.g:682:3: ( (lv_functionName_1_0= ruleFunctionName ) )
            // InternalPortugol.g:683:4: (lv_functionName_1_0= ruleFunctionName )
            {
            // InternalPortugol.g:683:4: (lv_functionName_1_0= ruleFunctionName )
            // InternalPortugol.g:684:5: lv_functionName_1_0= ruleFunctionName
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
            // InternalPortugol.g:705:3: ( (lv_paramList_3_0= ruleVariable ) )
            // InternalPortugol.g:706:4: (lv_paramList_3_0= ruleVariable )
            {
            // InternalPortugol.g:706:4: (lv_paramList_3_0= ruleVariable )
            // InternalPortugol.g:707:5: lv_paramList_3_0= ruleVariable
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
            otherlv_5=(Token)match(input,15,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getBlockFunctionAccess().getColonKeyword_5());
              		
            }
            // InternalPortugol.g:732:3: ( (lv_returnType_6_0= ruleVarType ) )
            // InternalPortugol.g:733:4: (lv_returnType_6_0= ruleVarType )
            {
            // InternalPortugol.g:733:4: (lv_returnType_6_0= ruleVarType )
            // InternalPortugol.g:734:5: lv_returnType_6_0= ruleVarType
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
            // InternalPortugol.g:755:3: ( (lv_declarations_8_0= ruleDeclarationsBlock ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPortugol.g:756:4: (lv_declarations_8_0= ruleDeclarationsBlock )
                    {
                    // InternalPortugol.g:756:4: (lv_declarations_8_0= ruleDeclarationsBlock )
                    // InternalPortugol.g:757:5: lv_declarations_8_0= ruleDeclarationsBlock
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

            otherlv_9=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getBlockFunctionAccess().getInicioKeyword_9());
              		
            }
            this_END_COMMAND_10=(Token)match(input,RULE_END_COMMAND,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_COMMAND_10, grammarAccess.getBlockFunctionAccess().getEND_COMMANDTerminalRuleCall_10());
              		
            }
            // InternalPortugol.g:782:3: ( (lv_commands_11_0= ruleAbstractCommand ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=28 && LA9_0<=29)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPortugol.g:783:4: (lv_commands_11_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugol.g:783:4: (lv_commands_11_0= ruleAbstractCommand )
            	    // InternalPortugol.g:784:5: lv_commands_11_0= ruleAbstractCommand
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

            otherlv_12=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
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
    // InternalPortugol.g:813:1: entryRuleBlockProcedure returns [EObject current=null] : iv_ruleBlockProcedure= ruleBlockProcedure EOF ;
    public final EObject entryRuleBlockProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockProcedure = null;


        try {
            // InternalPortugol.g:813:55: (iv_ruleBlockProcedure= ruleBlockProcedure EOF )
            // InternalPortugol.g:814:2: iv_ruleBlockProcedure= ruleBlockProcedure EOF
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
    // InternalPortugol.g:820:1: ruleBlockProcedure returns [EObject current=null] : (otherlv_0= 'procedimento' ( (lv_procedure_1_0= ruleProcedureName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' this_END_COMMAND_5= RULE_END_COMMAND ( (lv_declarations_6_0= ruleDeclarationsBlock ) )? otherlv_7= 'inicio' this_END_COMMAND_8= RULE_END_COMMAND ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= 'fimprocedimento' this_END_COMMAND_11= RULE_END_COMMAND ) ;
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
            // InternalPortugol.g:826:2: ( (otherlv_0= 'procedimento' ( (lv_procedure_1_0= ruleProcedureName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' this_END_COMMAND_5= RULE_END_COMMAND ( (lv_declarations_6_0= ruleDeclarationsBlock ) )? otherlv_7= 'inicio' this_END_COMMAND_8= RULE_END_COMMAND ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= 'fimprocedimento' this_END_COMMAND_11= RULE_END_COMMAND ) )
            // InternalPortugol.g:827:2: (otherlv_0= 'procedimento' ( (lv_procedure_1_0= ruleProcedureName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' this_END_COMMAND_5= RULE_END_COMMAND ( (lv_declarations_6_0= ruleDeclarationsBlock ) )? otherlv_7= 'inicio' this_END_COMMAND_8= RULE_END_COMMAND ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= 'fimprocedimento' this_END_COMMAND_11= RULE_END_COMMAND )
            {
            // InternalPortugol.g:827:2: (otherlv_0= 'procedimento' ( (lv_procedure_1_0= ruleProcedureName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' this_END_COMMAND_5= RULE_END_COMMAND ( (lv_declarations_6_0= ruleDeclarationsBlock ) )? otherlv_7= 'inicio' this_END_COMMAND_8= RULE_END_COMMAND ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= 'fimprocedimento' this_END_COMMAND_11= RULE_END_COMMAND )
            // InternalPortugol.g:828:3: otherlv_0= 'procedimento' ( (lv_procedure_1_0= ruleProcedureName ) ) otherlv_2= '(' ( (lv_paramList_3_0= ruleVariable ) ) otherlv_4= ')' this_END_COMMAND_5= RULE_END_COMMAND ( (lv_declarations_6_0= ruleDeclarationsBlock ) )? otherlv_7= 'inicio' this_END_COMMAND_8= RULE_END_COMMAND ( (lv_commands_9_0= ruleAbstractCommand ) )+ otherlv_10= 'fimprocedimento' this_END_COMMAND_11= RULE_END_COMMAND
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlockProcedureAccess().getProcedimentoKeyword_0());
              		
            }
            // InternalPortugol.g:832:3: ( (lv_procedure_1_0= ruleProcedureName ) )
            // InternalPortugol.g:833:4: (lv_procedure_1_0= ruleProcedureName )
            {
            // InternalPortugol.g:833:4: (lv_procedure_1_0= ruleProcedureName )
            // InternalPortugol.g:834:5: lv_procedure_1_0= ruleProcedureName
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
            // InternalPortugol.g:855:3: ( (lv_paramList_3_0= ruleVariable ) )
            // InternalPortugol.g:856:4: (lv_paramList_3_0= ruleVariable )
            {
            // InternalPortugol.g:856:4: (lv_paramList_3_0= ruleVariable )
            // InternalPortugol.g:857:5: lv_paramList_3_0= ruleVariable
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

            otherlv_4=(Token)match(input,22,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBlockProcedureAccess().getRightParenthesisKeyword_4());
              		
            }
            this_END_COMMAND_5=(Token)match(input,RULE_END_COMMAND,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_COMMAND_5, grammarAccess.getBlockProcedureAccess().getEND_COMMANDTerminalRuleCall_5());
              		
            }
            // InternalPortugol.g:882:3: ( (lv_declarations_6_0= ruleDeclarationsBlock ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPortugol.g:883:4: (lv_declarations_6_0= ruleDeclarationsBlock )
                    {
                    // InternalPortugol.g:883:4: (lv_declarations_6_0= ruleDeclarationsBlock )
                    // InternalPortugol.g:884:5: lv_declarations_6_0= ruleDeclarationsBlock
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

            otherlv_7=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getBlockProcedureAccess().getInicioKeyword_7());
              		
            }
            this_END_COMMAND_8=(Token)match(input,RULE_END_COMMAND,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_COMMAND_8, grammarAccess.getBlockProcedureAccess().getEND_COMMANDTerminalRuleCall_8());
              		
            }
            // InternalPortugol.g:909:3: ( (lv_commands_9_0= ruleAbstractCommand ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=28 && LA11_0<=29)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPortugol.g:910:4: (lv_commands_9_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugol.g:910:4: (lv_commands_9_0= ruleAbstractCommand )
            	    // InternalPortugol.g:911:5: lv_commands_9_0= ruleAbstractCommand
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

            otherlv_10=(Token)match(input,26,FOLLOW_6); if (state.failed) return current;
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
    // InternalPortugol.g:940:1: entryRuleBlockCommand returns [EObject current=null] : iv_ruleBlockCommand= ruleBlockCommand EOF ;
    public final EObject entryRuleBlockCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockCommand = null;


        try {
            // InternalPortugol.g:940:53: (iv_ruleBlockCommand= ruleBlockCommand EOF )
            // InternalPortugol.g:941:2: iv_ruleBlockCommand= ruleBlockCommand EOF
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
    // InternalPortugol.g:947:1: ruleBlockCommand returns [EObject current=null] : (otherlv_0= 'inicio' this_END_COMMAND_1= RULE_END_COMMAND ( (lv_commands_2_0= ruleAbstractCommand ) )+ otherlv_3= 'fimalgoritmo' this_END_COMMAND_4= RULE_END_COMMAND ) ;
    public final EObject ruleBlockCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_END_COMMAND_1=null;
        Token otherlv_3=null;
        Token this_END_COMMAND_4=null;
        EObject lv_commands_2_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:953:2: ( (otherlv_0= 'inicio' this_END_COMMAND_1= RULE_END_COMMAND ( (lv_commands_2_0= ruleAbstractCommand ) )+ otherlv_3= 'fimalgoritmo' this_END_COMMAND_4= RULE_END_COMMAND ) )
            // InternalPortugol.g:954:2: (otherlv_0= 'inicio' this_END_COMMAND_1= RULE_END_COMMAND ( (lv_commands_2_0= ruleAbstractCommand ) )+ otherlv_3= 'fimalgoritmo' this_END_COMMAND_4= RULE_END_COMMAND )
            {
            // InternalPortugol.g:954:2: (otherlv_0= 'inicio' this_END_COMMAND_1= RULE_END_COMMAND ( (lv_commands_2_0= ruleAbstractCommand ) )+ otherlv_3= 'fimalgoritmo' this_END_COMMAND_4= RULE_END_COMMAND )
            // InternalPortugol.g:955:3: otherlv_0= 'inicio' this_END_COMMAND_1= RULE_END_COMMAND ( (lv_commands_2_0= ruleAbstractCommand ) )+ otherlv_3= 'fimalgoritmo' this_END_COMMAND_4= RULE_END_COMMAND
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlockCommandAccess().getInicioKeyword_0());
              		
            }
            this_END_COMMAND_1=(Token)match(input,RULE_END_COMMAND,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_COMMAND_1, grammarAccess.getBlockCommandAccess().getEND_COMMANDTerminalRuleCall_1());
              		
            }
            // InternalPortugol.g:963:3: ( (lv_commands_2_0= ruleAbstractCommand ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=28 && LA12_0<=29)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPortugol.g:964:4: (lv_commands_2_0= ruleAbstractCommand )
            	    {
            	    // InternalPortugol.g:964:4: (lv_commands_2_0= ruleAbstractCommand )
            	    // InternalPortugol.g:965:5: lv_commands_2_0= ruleAbstractCommand
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

            otherlv_3=(Token)match(input,27,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBlockCommandAccess().getFimalgoritmoKeyword_3());
              		
            }
            this_END_COMMAND_4=(Token)match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_COMMAND_4, grammarAccess.getBlockCommandAccess().getEND_COMMANDTerminalRuleCall_4());
              		
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
    // InternalPortugol.g:994:1: entryRuleAbstractCommand returns [EObject current=null] : iv_ruleAbstractCommand= ruleAbstractCommand EOF ;
    public final EObject entryRuleAbstractCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractCommand = null;


        try {
            // InternalPortugol.g:994:56: (iv_ruleAbstractCommand= ruleAbstractCommand EOF )
            // InternalPortugol.g:995:2: iv_ruleAbstractCommand= ruleAbstractCommand EOF
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
    // InternalPortugol.g:1001:1: ruleAbstractCommand returns [EObject current=null] : (this_ReadCommand_0= ruleReadCommand | this_WriteCommand_1= ruleWriteCommand ) ;
    public final EObject ruleAbstractCommand() throws RecognitionException {
        EObject current = null;

        EObject this_ReadCommand_0 = null;

        EObject this_WriteCommand_1 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1007:2: ( (this_ReadCommand_0= ruleReadCommand | this_WriteCommand_1= ruleWriteCommand ) )
            // InternalPortugol.g:1008:2: (this_ReadCommand_0= ruleReadCommand | this_WriteCommand_1= ruleWriteCommand )
            {
            // InternalPortugol.g:1008:2: (this_ReadCommand_0= ruleReadCommand | this_WriteCommand_1= ruleWriteCommand )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            else if ( (LA13_0==29) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalPortugol.g:1009:3: this_ReadCommand_0= ruleReadCommand
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractCommandAccess().getReadCommandParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReadCommand_0=ruleReadCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReadCommand_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPortugol.g:1018:3: this_WriteCommand_1= ruleWriteCommand
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractCommandAccess().getWriteCommandParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_WriteCommand_1=ruleWriteCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WriteCommand_1;
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


    // $ANTLR start "entryRuleReadCommand"
    // InternalPortugol.g:1030:1: entryRuleReadCommand returns [EObject current=null] : iv_ruleReadCommand= ruleReadCommand EOF ;
    public final EObject entryRuleReadCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadCommand = null;


        try {
            // InternalPortugol.g:1030:52: (iv_ruleReadCommand= ruleReadCommand EOF )
            // InternalPortugol.g:1031:2: iv_ruleReadCommand= ruleReadCommand EOF
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
    // InternalPortugol.g:1037:1: ruleReadCommand returns [EObject current=null] : (otherlv_0= 'leia' otherlv_1= '(' ( (lv_paramList_2_0= ruleDeclaredVar ) ) otherlv_3= ')' this_END_COMMAND_4= RULE_END_COMMAND ) ;
    public final EObject ruleReadCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_END_COMMAND_4=null;
        EObject lv_paramList_2_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1043:2: ( (otherlv_0= 'leia' otherlv_1= '(' ( (lv_paramList_2_0= ruleDeclaredVar ) ) otherlv_3= ')' this_END_COMMAND_4= RULE_END_COMMAND ) )
            // InternalPortugol.g:1044:2: (otherlv_0= 'leia' otherlv_1= '(' ( (lv_paramList_2_0= ruleDeclaredVar ) ) otherlv_3= ')' this_END_COMMAND_4= RULE_END_COMMAND )
            {
            // InternalPortugol.g:1044:2: (otherlv_0= 'leia' otherlv_1= '(' ( (lv_paramList_2_0= ruleDeclaredVar ) ) otherlv_3= ')' this_END_COMMAND_4= RULE_END_COMMAND )
            // InternalPortugol.g:1045:3: otherlv_0= 'leia' otherlv_1= '(' ( (lv_paramList_2_0= ruleDeclaredVar ) ) otherlv_3= ')' this_END_COMMAND_4= RULE_END_COMMAND
            {
            otherlv_0=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReadCommandAccess().getLeiaKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,21,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReadCommandAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalPortugol.g:1053:3: ( (lv_paramList_2_0= ruleDeclaredVar ) )
            // InternalPortugol.g:1054:4: (lv_paramList_2_0= ruleDeclaredVar )
            {
            // InternalPortugol.g:1054:4: (lv_paramList_2_0= ruleDeclaredVar )
            // InternalPortugol.g:1055:5: lv_paramList_2_0= ruleDeclaredVar
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReadCommandAccess().getParamListDeclaredVarParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_paramList_2_0=ruleDeclaredVar();

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
              						"org.hopper.language.Portugol.DeclaredVar");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getReadCommandAccess().getRightParenthesisKeyword_3());
              		
            }
            this_END_COMMAND_4=(Token)match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_COMMAND_4, grammarAccess.getReadCommandAccess().getEND_COMMANDTerminalRuleCall_4());
              		
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
    // InternalPortugol.g:1084:1: entryRuleWriteCommand returns [EObject current=null] : iv_ruleWriteCommand= ruleWriteCommand EOF ;
    public final EObject entryRuleWriteCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteCommand = null;


        try {
            // InternalPortugol.g:1084:53: (iv_ruleWriteCommand= ruleWriteCommand EOF )
            // InternalPortugol.g:1085:2: iv_ruleWriteCommand= ruleWriteCommand EOF
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
    // InternalPortugol.g:1091:1: ruleWriteCommand returns [EObject current=null] : (otherlv_0= 'escreva' otherlv_1= '(' ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= ')' this_END_COMMAND_4= RULE_END_COMMAND ) ;
    public final EObject ruleWriteCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_END_COMMAND_4=null;
        EObject lv_writeParam_2_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1097:2: ( (otherlv_0= 'escreva' otherlv_1= '(' ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= ')' this_END_COMMAND_4= RULE_END_COMMAND ) )
            // InternalPortugol.g:1098:2: (otherlv_0= 'escreva' otherlv_1= '(' ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= ')' this_END_COMMAND_4= RULE_END_COMMAND )
            {
            // InternalPortugol.g:1098:2: (otherlv_0= 'escreva' otherlv_1= '(' ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= ')' this_END_COMMAND_4= RULE_END_COMMAND )
            // InternalPortugol.g:1099:3: otherlv_0= 'escreva' otherlv_1= '(' ( (lv_writeParam_2_0= ruleWriteParam ) ) otherlv_3= ')' this_END_COMMAND_4= RULE_END_COMMAND
            {
            otherlv_0=(Token)match(input,29,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWriteCommandAccess().getEscrevaKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWriteCommandAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalPortugol.g:1107:3: ( (lv_writeParam_2_0= ruleWriteParam ) )
            // InternalPortugol.g:1108:4: (lv_writeParam_2_0= ruleWriteParam )
            {
            // InternalPortugol.g:1108:4: (lv_writeParam_2_0= ruleWriteParam )
            // InternalPortugol.g:1109:5: lv_writeParam_2_0= ruleWriteParam
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

            otherlv_3=(Token)match(input,22,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWriteCommandAccess().getRightParenthesisKeyword_3());
              		
            }
            this_END_COMMAND_4=(Token)match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_COMMAND_4, grammarAccess.getWriteCommandAccess().getEND_COMMANDTerminalRuleCall_4());
              		
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
    // InternalPortugol.g:1138:1: entryRuleWriteParam returns [EObject current=null] : iv_ruleWriteParam= ruleWriteParam EOF ;
    public final EObject entryRuleWriteParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteParam = null;


        try {
            // InternalPortugol.g:1138:51: (iv_ruleWriteParam= ruleWriteParam EOF )
            // InternalPortugol.g:1139:2: iv_ruleWriteParam= ruleWriteParam EOF
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
    // InternalPortugol.g:1145:1: ruleWriteParam returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) ) )* ( (lv_precision_3_0= ruleOptDecimalPrecision ) )? ) ;
    public final EObject ruleWriteParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;

        EObject lv_expression_2_0 = null;

        EObject lv_precision_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1151:2: ( ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) ) )* ( (lv_precision_3_0= ruleOptDecimalPrecision ) )? ) )
            // InternalPortugol.g:1152:2: ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) ) )* ( (lv_precision_3_0= ruleOptDecimalPrecision ) )? )
            {
            // InternalPortugol.g:1152:2: ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) ) )* ( (lv_precision_3_0= ruleOptDecimalPrecision ) )? )
            // InternalPortugol.g:1153:3: ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) ) )* ( (lv_precision_3_0= ruleOptDecimalPrecision ) )?
            {
            // InternalPortugol.g:1153:3: ( (lv_expression_0_0= ruleExpression ) )
            // InternalPortugol.g:1154:4: (lv_expression_0_0= ruleExpression )
            {
            // InternalPortugol.g:1154:4: (lv_expression_0_0= ruleExpression )
            // InternalPortugol.g:1155:5: lv_expression_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWriteParamAccess().getExpressionExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_expression_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWriteParamRule());
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

            // InternalPortugol.g:1172:3: (otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPortugol.g:1173:4: otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getWriteParamAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalPortugol.g:1177:4: ( (lv_expression_2_0= ruleExpression ) )
            	    // InternalPortugol.g:1178:5: (lv_expression_2_0= ruleExpression )
            	    {
            	    // InternalPortugol.g:1178:5: (lv_expression_2_0= ruleExpression )
            	    // InternalPortugol.g:1179:6: lv_expression_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getWriteParamAccess().getExpressionExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_expression_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getWriteParamRule());
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
            	    break loop14;
                }
            } while (true);

            // InternalPortugol.g:1197:3: ( (lv_precision_3_0= ruleOptDecimalPrecision ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPortugol.g:1198:4: (lv_precision_3_0= ruleOptDecimalPrecision )
                    {
                    // InternalPortugol.g:1198:4: (lv_precision_3_0= ruleOptDecimalPrecision )
                    // InternalPortugol.g:1199:5: lv_precision_3_0= ruleOptDecimalPrecision
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getWriteParamAccess().getPrecisionOptDecimalPrecisionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_precision_3_0=ruleOptDecimalPrecision();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getWriteParamRule());
                      					}
                      					set(
                      						current,
                      						"precision",
                      						lv_precision_3_0,
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


    // $ANTLR start "entryRuleExpression"
    // InternalPortugol.g:1220:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalPortugol.g:1220:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalPortugol.g:1221:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalPortugol.g:1227:1: ruleExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( ( () ( (lv_op_2_0= 'OR' ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_XorExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1233:2: ( (this_XorExpression_0= ruleXorExpression ( ( () ( (lv_op_2_0= 'OR' ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) )
            // InternalPortugol.g:1234:2: (this_XorExpression_0= ruleXorExpression ( ( () ( (lv_op_2_0= 'OR' ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            {
            // InternalPortugol.g:1234:2: (this_XorExpression_0= ruleXorExpression ( ( () ( (lv_op_2_0= 'OR' ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            // InternalPortugol.g:1235:3: this_XorExpression_0= ruleXorExpression ( ( () ( (lv_op_2_0= 'OR' ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionAccess().getXorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_23);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugol.g:1243:3: ( ( () ( (lv_op_2_0= 'OR' ) ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPortugol.g:1244:4: ( () ( (lv_op_2_0= 'OR' ) ) ) ( (lv_right_3_0= ruleXorExpression ) )
            	    {
            	    // InternalPortugol.g:1244:4: ( () ( (lv_op_2_0= 'OR' ) ) )
            	    // InternalPortugol.g:1245:5: () ( (lv_op_2_0= 'OR' ) )
            	    {
            	    // InternalPortugol.g:1245:5: ()
            	    // InternalPortugol.g:1246:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalPortugol.g:1252:5: ( (lv_op_2_0= 'OR' ) )
            	    // InternalPortugol.g:1253:6: (lv_op_2_0= 'OR' )
            	    {
            	    // InternalPortugol.g:1253:6: (lv_op_2_0= 'OR' )
            	    // InternalPortugol.g:1254:7: lv_op_2_0= 'OR'
            	    {
            	    lv_op_2_0=(Token)match(input,30,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_op_2_0, grammarAccess.getExpressionAccess().getOpORKeyword_1_0_1_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getExpressionRule());
            	      							}
            	      							setWithLastConsumed(current, "op", lv_op_2_0, "OR");
            	      						
            	    }

            	    }


            	    }


            	    }

            	    // InternalPortugol.g:1267:4: ( (lv_right_3_0= ruleXorExpression ) )
            	    // InternalPortugol.g:1268:5: (lv_right_3_0= ruleXorExpression )
            	    {
            	    // InternalPortugol.g:1268:5: (lv_right_3_0= ruleXorExpression )
            	    // InternalPortugol.g:1269:6: lv_right_3_0= ruleXorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpressionAccess().getRightXorExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=ruleXorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExpressionRule());
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
            	    break loop16;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleXorExpression"
    // InternalPortugol.g:1291:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalPortugol.g:1291:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalPortugol.g:1292:2: iv_ruleXorExpression= ruleXorExpression EOF
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
    // InternalPortugol.g:1298:1: ruleXorExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( ( () ( (lv_op_2_0= 'XOR' ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1304:2: ( (this_AndExpression_0= ruleAndExpression ( ( () ( (lv_op_2_0= 'XOR' ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalPortugol.g:1305:2: (this_AndExpression_0= ruleAndExpression ( ( () ( (lv_op_2_0= 'XOR' ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalPortugol.g:1305:2: (this_AndExpression_0= ruleAndExpression ( ( () ( (lv_op_2_0= 'XOR' ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalPortugol.g:1306:3: this_AndExpression_0= ruleAndExpression ( ( () ( (lv_op_2_0= 'XOR' ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugol.g:1314:3: ( ( () ( (lv_op_2_0= 'XOR' ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==31) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPortugol.g:1315:4: ( () ( (lv_op_2_0= 'XOR' ) ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalPortugol.g:1315:4: ( () ( (lv_op_2_0= 'XOR' ) ) )
            	    // InternalPortugol.g:1316:5: () ( (lv_op_2_0= 'XOR' ) )
            	    {
            	    // InternalPortugol.g:1316:5: ()
            	    // InternalPortugol.g:1317:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalPortugol.g:1323:5: ( (lv_op_2_0= 'XOR' ) )
            	    // InternalPortugol.g:1324:6: (lv_op_2_0= 'XOR' )
            	    {
            	    // InternalPortugol.g:1324:6: (lv_op_2_0= 'XOR' )
            	    // InternalPortugol.g:1325:7: lv_op_2_0= 'XOR'
            	    {
            	    lv_op_2_0=(Token)match(input,31,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_op_2_0, grammarAccess.getXorExpressionAccess().getOpXORKeyword_1_0_1_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getXorExpressionRule());
            	      							}
            	      							setWithLastConsumed(current, "op", lv_op_2_0, "XOR");
            	      						
            	    }

            	    }


            	    }


            	    }

            	    // InternalPortugol.g:1338:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalPortugol.g:1339:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalPortugol.g:1339:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalPortugol.g:1340:6: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXorExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_24);
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
            	    break loop17;
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
    // InternalPortugol.g:1362:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalPortugol.g:1362:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalPortugol.g:1363:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalPortugol.g:1369:1: ruleAndExpression returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'AND' ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1375:2: ( (this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'AND' ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalPortugol.g:1376:2: (this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'AND' ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalPortugol.g:1376:2: (this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'AND' ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalPortugol.g:1377:3: this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'AND' ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_25);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugol.g:1385:3: ( ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'AND' ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=32 && LA19_0<=33)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPortugol.g:1386:4: ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'AND' ) ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalPortugol.g:1386:4: ( () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'AND' ) ) ) )
            	    // InternalPortugol.g:1387:5: () ( ( (lv_op_2_1= '&' | lv_op_2_2= 'AND' ) ) )
            	    {
            	    // InternalPortugol.g:1387:5: ()
            	    // InternalPortugol.g:1388:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalPortugol.g:1394:5: ( ( (lv_op_2_1= '&' | lv_op_2_2= 'AND' ) ) )
            	    // InternalPortugol.g:1395:6: ( (lv_op_2_1= '&' | lv_op_2_2= 'AND' ) )
            	    {
            	    // InternalPortugol.g:1395:6: ( (lv_op_2_1= '&' | lv_op_2_2= 'AND' ) )
            	    // InternalPortugol.g:1396:7: (lv_op_2_1= '&' | lv_op_2_2= 'AND' )
            	    {
            	    // InternalPortugol.g:1396:7: (lv_op_2_1= '&' | lv_op_2_2= 'AND' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==32) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==33) ) {
            	        alt18=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalPortugol.g:1397:8: lv_op_2_1= '&'
            	            {
            	            lv_op_2_1=(Token)match(input,32,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_1, grammarAccess.getAndExpressionAccess().getOpAmpersandKeyword_1_0_1_0_0());
            	              							
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
            	            // InternalPortugol.g:1408:8: lv_op_2_2= 'AND'
            	            {
            	            lv_op_2_2=(Token)match(input,33,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_2, grammarAccess.getAndExpressionAccess().getOpANDKeyword_1_0_1_0_1());
            	              							
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

            	    // InternalPortugol.g:1422:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalPortugol.g:1423:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalPortugol.g:1423:5: (lv_right_3_0= ruleComparison )
            	    // InternalPortugol.g:1424:6: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_25);
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
            	    break loop19;
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
    // InternalPortugol.g:1446:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalPortugol.g:1446:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalPortugol.g:1447:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalPortugol.g:1453:1: ruleComparison returns [EObject current=null] : (this_EquExpression_0= ruleEquExpression ( ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_EquExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1459:2: ( (this_EquExpression_0= ruleEquExpression ( ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )* ) )
            // InternalPortugol.g:1460:2: (this_EquExpression_0= ruleEquExpression ( ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )* )
            {
            // InternalPortugol.g:1460:2: (this_EquExpression_0= ruleEquExpression ( ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )* )
            // InternalPortugol.g:1461:3: this_EquExpression_0= ruleEquExpression ( ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getEquExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_26);
            this_EquExpression_0=ruleEquExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EquExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugol.g:1469:3: ( ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=34 && LA21_0<=35)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPortugol.g:1470:4: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ) ( (lv_right_3_0= ruleEquExpression ) )
            	    {
            	    // InternalPortugol.g:1470:4: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) )
            	    // InternalPortugol.g:1471:5: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) )
            	    {
            	    // InternalPortugol.g:1471:5: ()
            	    // InternalPortugol.g:1472:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getComparisonAccess().getCompExpressionLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalPortugol.g:1478:5: ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) )
            	    // InternalPortugol.g:1479:6: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
            	    {
            	    // InternalPortugol.g:1479:6: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
            	    // InternalPortugol.g:1480:7: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
            	    {
            	    // InternalPortugol.g:1480:7: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==34) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==35) ) {
            	        alt20=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalPortugol.g:1481:8: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,34,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpEqualsSignKeyword_1_0_1_0_0());
            	              							
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
            	            // InternalPortugol.g:1492:8: lv_op_2_2= '<>'
            	            {
            	            lv_op_2_2=(Token)match(input,35,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignGreaterThanSignKeyword_1_0_1_0_1());
            	              							
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

            	    // InternalPortugol.g:1506:4: ( (lv_right_3_0= ruleEquExpression ) )
            	    // InternalPortugol.g:1507:5: (lv_right_3_0= ruleEquExpression )
            	    {
            	    // InternalPortugol.g:1507:5: (lv_right_3_0= ruleEquExpression )
            	    // InternalPortugol.g:1508:6: lv_right_3_0= ruleEquExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightEquExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
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
            	    break loop21;
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
    // InternalPortugol.g:1530:1: entryRuleEquExpression returns [EObject current=null] : iv_ruleEquExpression= ruleEquExpression EOF ;
    public final EObject entryRuleEquExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquExpression = null;


        try {
            // InternalPortugol.g:1530:54: (iv_ruleEquExpression= ruleEquExpression EOF )
            // InternalPortugol.g:1531:2: iv_ruleEquExpression= ruleEquExpression EOF
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
    // InternalPortugol.g:1537:1: ruleEquExpression returns [EObject current=null] : (this_AddExpression_0= ruleAddExpression ( ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* ) ;
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
            // InternalPortugol.g:1543:2: ( (this_AddExpression_0= ruleAddExpression ( ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* ) )
            // InternalPortugol.g:1544:2: (this_AddExpression_0= ruleAddExpression ( ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* )
            {
            // InternalPortugol.g:1544:2: (this_AddExpression_0= ruleAddExpression ( ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* )
            // InternalPortugol.g:1545:3: this_AddExpression_0= ruleAddExpression ( ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEquExpressionAccess().getAddExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_27);
            this_AddExpression_0=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AddExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugol.g:1553:3: ( ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=36 && LA23_0<=39)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalPortugol.g:1554:4: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ) ( (lv_right_3_0= ruleAddExpression ) )
            	    {
            	    // InternalPortugol.g:1554:4: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) )
            	    // InternalPortugol.g:1555:5: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) )
            	    {
            	    // InternalPortugol.g:1555:5: ()
            	    // InternalPortugol.g:1556:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getEquExpressionAccess().getEquExpressionLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalPortugol.g:1562:5: ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) )
            	    // InternalPortugol.g:1563:6: ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) )
            	    {
            	    // InternalPortugol.g:1563:6: ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) )
            	    // InternalPortugol.g:1564:7: (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' )
            	    {
            	    // InternalPortugol.g:1564:7: (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' )
            	    int alt22=4;
            	    switch ( input.LA(1) ) {
            	    case 36:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt22=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // InternalPortugol.g:1565:8: lv_op_2_1= '<'
            	            {
            	            lv_op_2_1=(Token)match(input,36,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_1, grammarAccess.getEquExpressionAccess().getOpLessThanSignKeyword_1_0_1_0_0());
            	              							
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
            	            // InternalPortugol.g:1576:8: lv_op_2_2= '>'
            	            {
            	            lv_op_2_2=(Token)match(input,37,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_2, grammarAccess.getEquExpressionAccess().getOpGreaterThanSignKeyword_1_0_1_0_1());
            	              							
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
            	            // InternalPortugol.g:1587:8: lv_op_2_3= '<='
            	            {
            	            lv_op_2_3=(Token)match(input,38,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_3, grammarAccess.getEquExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_2());
            	              							
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
            	            // InternalPortugol.g:1598:8: lv_op_2_4= '>='
            	            {
            	            lv_op_2_4=(Token)match(input,39,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_4, grammarAccess.getEquExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_3());
            	              							
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

            	    // InternalPortugol.g:1612:4: ( (lv_right_3_0= ruleAddExpression ) )
            	    // InternalPortugol.g:1613:5: (lv_right_3_0= ruleAddExpression )
            	    {
            	    // InternalPortugol.g:1613:5: (lv_right_3_0= ruleAddExpression )
            	    // InternalPortugol.g:1614:6: lv_right_3_0= ruleAddExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEquExpressionAccess().getRightAddExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
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
            	    break loop23;
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
    // InternalPortugol.g:1636:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalPortugol.g:1636:54: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalPortugol.g:1637:2: iv_ruleAddExpression= ruleAddExpression EOF
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
    // InternalPortugol.g:1643:1: ruleAddExpression returns [EObject current=null] : (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Term_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1649:2: ( (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* ) )
            // InternalPortugol.g:1650:2: (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* )
            {
            // InternalPortugol.g:1650:2: (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* )
            // InternalPortugol.g:1651:3: this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAddExpressionAccess().getTermParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_28);
            this_Term_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Term_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugol.g:1659:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=40 && LA25_0<=41)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPortugol.g:1660:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) )
            	    {
            	    // InternalPortugol.g:1660:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==40) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==41) ) {
            	        alt24=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalPortugol.g:1661:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalPortugol.g:1661:5: ( () otherlv_2= '+' )
            	            // InternalPortugol.g:1662:6: () otherlv_2= '+'
            	            {
            	            // InternalPortugol.g:1662:6: ()
            	            // InternalPortugol.g:1663:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getAddExpressionAccess().getAddExpressionLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,40,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPortugol.g:1675:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalPortugol.g:1675:5: ( () otherlv_4= '-' )
            	            // InternalPortugol.g:1676:6: () otherlv_4= '-'
            	            {
            	            // InternalPortugol.g:1676:6: ()
            	            // InternalPortugol.g:1677:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getAddExpressionAccess().getSubExpressionLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,41,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getAddExpressionAccess().getHyphenMinusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalPortugol.g:1689:4: ( (lv_right_5_0= ruleTerm ) )
            	    // InternalPortugol.g:1690:5: (lv_right_5_0= ruleTerm )
            	    {
            	    // InternalPortugol.g:1690:5: (lv_right_5_0= ruleTerm )
            	    // InternalPortugol.g:1691:6: lv_right_5_0= ruleTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAddExpressionAccess().getRightTermParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_right_5_0=ruleTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAddExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"org.hopper.language.Portugol.Term");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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


    // $ANTLR start "entryRuleTerm"
    // InternalPortugol.g:1713:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalPortugol.g:1713:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalPortugol.g:1714:2: iv_ruleTerm= ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerm; 
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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalPortugol.g:1720:1: ruleTerm returns [EObject current=null] : (this_PowerExpression_0= rulePowerExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= 'MOD' ) ) ( (lv_right_7_0= rulePowerExpression ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_PowerExpression_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1726:2: ( (this_PowerExpression_0= rulePowerExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= 'MOD' ) ) ( (lv_right_7_0= rulePowerExpression ) ) )* ) )
            // InternalPortugol.g:1727:2: (this_PowerExpression_0= rulePowerExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= 'MOD' ) ) ( (lv_right_7_0= rulePowerExpression ) ) )* )
            {
            // InternalPortugol.g:1727:2: (this_PowerExpression_0= rulePowerExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= 'MOD' ) ) ( (lv_right_7_0= rulePowerExpression ) ) )* )
            // InternalPortugol.g:1728:3: this_PowerExpression_0= rulePowerExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= 'MOD' ) ) ( (lv_right_7_0= rulePowerExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTermAccess().getPowerExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_29);
            this_PowerExpression_0=rulePowerExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PowerExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugol.g:1736:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= 'MOD' ) ) ( (lv_right_7_0= rulePowerExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=42 && LA27_0<=44)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPortugol.g:1737:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= 'MOD' ) ) ( (lv_right_7_0= rulePowerExpression ) )
            	    {
            	    // InternalPortugol.g:1737:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= 'MOD' ) )
            	    int alt26=3;
            	    switch ( input.LA(1) ) {
            	    case 42:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // InternalPortugol.g:1738:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalPortugol.g:1738:5: ( () otherlv_2= '*' )
            	            // InternalPortugol.g:1739:6: () otherlv_2= '*'
            	            {
            	            // InternalPortugol.g:1739:6: ()
            	            // InternalPortugol.g:1740:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getTermAccess().getMultiplyLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,42,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getTermAccess().getAsteriskKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPortugol.g:1752:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalPortugol.g:1752:5: ( () otherlv_4= '/' )
            	            // InternalPortugol.g:1753:6: () otherlv_4= '/'
            	            {
            	            // InternalPortugol.g:1753:6: ()
            	            // InternalPortugol.g:1754:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getTermAccess().getDivisionLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,43,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getTermAccess().getSolidusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalPortugol.g:1766:5: ( () otherlv_6= 'MOD' )
            	            {
            	            // InternalPortugol.g:1766:5: ( () otherlv_6= 'MOD' )
            	            // InternalPortugol.g:1767:6: () otherlv_6= 'MOD'
            	            {
            	            // InternalPortugol.g:1767:6: ()
            	            // InternalPortugol.g:1768:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getTermAccess().getModLeftAction_1_0_2_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_6=(Token)match(input,44,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_6, grammarAccess.getTermAccess().getMODKeyword_1_0_2_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalPortugol.g:1780:4: ( (lv_right_7_0= rulePowerExpression ) )
            	    // InternalPortugol.g:1781:5: (lv_right_7_0= rulePowerExpression )
            	    {
            	    // InternalPortugol.g:1781:5: (lv_right_7_0= rulePowerExpression )
            	    // InternalPortugol.g:1782:6: lv_right_7_0= rulePowerExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTermAccess().getRightPowerExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_29);
            	    lv_right_7_0=rulePowerExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTermRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_7_0,
            	      							"org.hopper.language.Portugol.PowerExpression");
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRulePowerExpression"
    // InternalPortugol.g:1804:1: entryRulePowerExpression returns [EObject current=null] : iv_rulePowerExpression= rulePowerExpression EOF ;
    public final EObject entryRulePowerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerExpression = null;


        try {
            // InternalPortugol.g:1804:56: (iv_rulePowerExpression= rulePowerExpression EOF )
            // InternalPortugol.g:1805:2: iv_rulePowerExpression= rulePowerExpression EOF
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
    // InternalPortugol.g:1811:1: rulePowerExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject rulePowerExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1817:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) )
            // InternalPortugol.g:1818:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            {
            // InternalPortugol.g:1818:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            // InternalPortugol.g:1819:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPowerExpressionAccess().getUnaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_30);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPortugol.g:1827:3: ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==45) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalPortugol.g:1828:4: () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= ruleUnaryExpression ) )
            	    {
            	    // InternalPortugol.g:1828:4: ()
            	    // InternalPortugol.g:1829:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getPowerExpressionAccess().getPowerExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalPortugol.g:1835:4: ( (lv_op_2_0= '^' ) )
            	    // InternalPortugol.g:1836:5: (lv_op_2_0= '^' )
            	    {
            	    // InternalPortugol.g:1836:5: (lv_op_2_0= '^' )
            	    // InternalPortugol.g:1837:6: lv_op_2_0= '^'
            	    {
            	    lv_op_2_0=(Token)match(input,45,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getPowerExpressionAccess().getOpCircumflexAccentKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getPowerExpressionRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "^");
            	      					
            	    }

            	    }


            	    }

            	    // InternalPortugol.g:1849:4: ( (lv_right_3_0= ruleUnaryExpression ) )
            	    // InternalPortugol.g:1850:5: (lv_right_3_0= ruleUnaryExpression )
            	    {
            	    // InternalPortugol.g:1850:5: (lv_right_3_0= ruleUnaryExpression )
            	    // InternalPortugol.g:1851:6: lv_right_3_0= ruleUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPowerExpressionAccess().getRightUnaryExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_30);
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
    // $ANTLR end "rulePowerExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalPortugol.g:1873:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalPortugol.g:1873:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalPortugol.g:1874:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalPortugol.g:1880:1: ruleUnaryExpression returns [EObject current=null] : ( ( () ( ( 'NOT' )=>otherlv_1= 'NOT' ) ( (lv_expression_2_0= rulePrimaryExpression ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_6= rulePrimaryExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_5_0 = null;

        EObject this_PrimaryExpression_6 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1886:2: ( ( ( () ( ( 'NOT' )=>otherlv_1= 'NOT' ) ( (lv_expression_2_0= rulePrimaryExpression ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_6= rulePrimaryExpression ) )
            // InternalPortugol.g:1887:2: ( ( () ( ( 'NOT' )=>otherlv_1= 'NOT' ) ( (lv_expression_2_0= rulePrimaryExpression ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_6= rulePrimaryExpression )
            {
            // InternalPortugol.g:1887:2: ( ( () ( ( 'NOT' )=>otherlv_1= 'NOT' ) ( (lv_expression_2_0= rulePrimaryExpression ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_6= rulePrimaryExpression )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt29=1;
                }
                break;
            case 41:
                {
                alt29=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case RULE_FLOAT:
            case 21:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalPortugol.g:1888:3: ( () ( ( 'NOT' )=>otherlv_1= 'NOT' ) ( (lv_expression_2_0= rulePrimaryExpression ) ) )
                    {
                    // InternalPortugol.g:1888:3: ( () ( ( 'NOT' )=>otherlv_1= 'NOT' ) ( (lv_expression_2_0= rulePrimaryExpression ) ) )
                    // InternalPortugol.g:1889:4: () ( ( 'NOT' )=>otherlv_1= 'NOT' ) ( (lv_expression_2_0= rulePrimaryExpression ) )
                    {
                    // InternalPortugol.g:1889:4: ()
                    // InternalPortugol.g:1890:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryExpressionAccess().getBooleanNegationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPortugol.g:1896:4: ( ( 'NOT' )=>otherlv_1= 'NOT' )
                    // InternalPortugol.g:1897:5: ( 'NOT' )=>otherlv_1= 'NOT'
                    {
                    otherlv_1=(Token)match(input,46,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getUnaryExpressionAccess().getNOTKeyword_0_1());
                      				
                    }

                    }

                    // InternalPortugol.g:1903:4: ( (lv_expression_2_0= rulePrimaryExpression ) )
                    // InternalPortugol.g:1904:5: (lv_expression_2_0= rulePrimaryExpression )
                    {
                    // InternalPortugol.g:1904:5: (lv_expression_2_0= rulePrimaryExpression )
                    // InternalPortugol.g:1905:6: lv_expression_2_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_2_0,
                      							"org.hopper.language.Portugol.PrimaryExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:1924:3: ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= rulePrimaryExpression ) ) )
                    {
                    // InternalPortugol.g:1924:3: ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= rulePrimaryExpression ) ) )
                    // InternalPortugol.g:1925:4: () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= rulePrimaryExpression ) )
                    {
                    // InternalPortugol.g:1925:4: ()
                    // InternalPortugol.g:1926:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryExpressionAccess().getArithmeticSignedAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPortugol.g:1932:4: ( ( '-' )=>otherlv_4= '-' )
                    // InternalPortugol.g:1933:5: ( '-' )=>otherlv_4= '-'
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_1_1());
                      				
                    }

                    }

                    // InternalPortugol.g:1939:4: ( (lv_expression_5_0= rulePrimaryExpression ) )
                    // InternalPortugol.g:1940:5: (lv_expression_5_0= rulePrimaryExpression )
                    {
                    // InternalPortugol.g:1940:5: (lv_expression_5_0= rulePrimaryExpression )
                    // InternalPortugol.g:1941:6: lv_expression_5_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_5_0,
                      							"org.hopper.language.Portugol.PrimaryExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPortugol.g:1960:3: this_PrimaryExpression_6= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpression_6=rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimaryExpression_6;
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
    // InternalPortugol.g:1972:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalPortugol.g:1972:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalPortugol.g:1973:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalPortugol.g:1979:1: rulePrimaryExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleConstant ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) | this_FunctionCall_7= ruleFunctionCall ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_value_1_0 = null;

        EObject this_Expression_5 = null;

        EObject this_FunctionCall_7 = null;



        	enterRule();

        try {
            // InternalPortugol.g:1985:2: ( ( ( () ( (lv_value_1_0= ruleConstant ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) | this_FunctionCall_7= ruleFunctionCall ) )
            // InternalPortugol.g:1986:2: ( ( () ( (lv_value_1_0= ruleConstant ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) | this_FunctionCall_7= ruleFunctionCall )
            {
            // InternalPortugol.g:1986:2: ( ( () ( (lv_value_1_0= ruleConstant ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) | this_FunctionCall_7= ruleFunctionCall )
            int alt30=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_FLOAT:
                {
                alt30=1;
                }
                break;
            case RULE_ID:
                {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==21) ) {
                    alt30=4;
                }
                else if ( (LA30_2==EOF||(LA30_2>=15 && LA30_2<=16)||LA30_2==22||(LA30_2>=30 && LA30_2<=45)) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalPortugol.g:1987:3: ( () ( (lv_value_1_0= ruleConstant ) ) )
                    {
                    // InternalPortugol.g:1987:3: ( () ( (lv_value_1_0= ruleConstant ) ) )
                    // InternalPortugol.g:1988:4: () ( (lv_value_1_0= ruleConstant ) )
                    {
                    // InternalPortugol.g:1988:4: ()
                    // InternalPortugol.g:1989:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryExpressionAccess().getExpressionConstantAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPortugol.g:1995:4: ( (lv_value_1_0= ruleConstant ) )
                    // InternalPortugol.g:1996:5: (lv_value_1_0= ruleConstant )
                    {
                    // InternalPortugol.g:1996:5: (lv_value_1_0= ruleConstant )
                    // InternalPortugol.g:1997:6: lv_value_1_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValueConstantParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"org.hopper.language.Portugol.Constant");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:2016:3: ( () ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalPortugol.g:2016:3: ( () ( (otherlv_3= RULE_ID ) ) )
                    // InternalPortugol.g:2017:4: () ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalPortugol.g:2017:4: ()
                    // InternalPortugol.g:2018:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryExpressionAccess().getExpressionVariableAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPortugol.g:2024:4: ( (otherlv_3= RULE_ID ) )
                    // InternalPortugol.g:2025:5: (otherlv_3= RULE_ID )
                    {
                    // InternalPortugol.g:2025:5: (otherlv_3= RULE_ID )
                    // InternalPortugol.g:2026:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getValueVarNameCrossReference_1_1_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPortugol.g:2039:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // InternalPortugol.g:2039:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // InternalPortugol.g:2040:4: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_14);
                    this_Expression_5=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_6=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPortugol.g:2058:3: this_FunctionCall_7= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_7=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunctionCall_7;
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalPortugol.g:2070:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalPortugol.g:2070:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalPortugol.g:2071:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalPortugol.g:2077:1: ruleFunctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_param_2_0= ruleWriteParam ) ) otherlv_3= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_param_2_0 = null;



        	enterRule();

        try {
            // InternalPortugol.g:2083:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_param_2_0= ruleWriteParam ) ) otherlv_3= ')' ) )
            // InternalPortugol.g:2084:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_param_2_0= ruleWriteParam ) ) otherlv_3= ')' )
            {
            // InternalPortugol.g:2084:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_param_2_0= ruleWriteParam ) ) otherlv_3= ')' )
            // InternalPortugol.g:2085:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_param_2_0= ruleWriteParam ) ) otherlv_3= ')'
            {
            // InternalPortugol.g:2085:3: ( (otherlv_0= RULE_ID ) )
            // InternalPortugol.g:2086:4: (otherlv_0= RULE_ID )
            {
            // InternalPortugol.g:2086:4: (otherlv_0= RULE_ID )
            // InternalPortugol.g:2087:5: otherlv_0= RULE_ID
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
            // InternalPortugol.g:2102:3: ( (lv_param_2_0= ruleWriteParam ) )
            // InternalPortugol.g:2103:4: (lv_param_2_0= ruleWriteParam )
            {
            // InternalPortugol.g:2103:4: (lv_param_2_0= ruleWriteParam )
            // InternalPortugol.g:2104:5: lv_param_2_0= ruleWriteParam
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionCallAccess().getParamWriteParamParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_param_2_0=ruleWriteParam();

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
              						"org.hopper.language.Portugol.WriteParam");
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


    // $ANTLR start "entryRuleOptDecimalPrecision"
    // InternalPortugol.g:2129:1: entryRuleOptDecimalPrecision returns [EObject current=null] : iv_ruleOptDecimalPrecision= ruleOptDecimalPrecision EOF ;
    public final EObject entryRuleOptDecimalPrecision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptDecimalPrecision = null;


        try {
            // InternalPortugol.g:2129:60: (iv_ruleOptDecimalPrecision= ruleOptDecimalPrecision EOF )
            // InternalPortugol.g:2130:2: iv_ruleOptDecimalPrecision= ruleOptDecimalPrecision EOF
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
    // InternalPortugol.g:2136:1: ruleOptDecimalPrecision returns [EObject current=null] : (otherlv_0= ':' ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= ':' ( (lv_secondPrecision_3_0= RULE_INT ) ) )? ) ;
    public final EObject ruleOptDecimalPrecision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_firstPrecision_1_0=null;
        Token otherlv_2=null;
        Token lv_secondPrecision_3_0=null;


        	enterRule();

        try {
            // InternalPortugol.g:2142:2: ( (otherlv_0= ':' ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= ':' ( (lv_secondPrecision_3_0= RULE_INT ) ) )? ) )
            // InternalPortugol.g:2143:2: (otherlv_0= ':' ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= ':' ( (lv_secondPrecision_3_0= RULE_INT ) ) )? )
            {
            // InternalPortugol.g:2143:2: (otherlv_0= ':' ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= ':' ( (lv_secondPrecision_3_0= RULE_INT ) ) )? )
            // InternalPortugol.g:2144:3: otherlv_0= ':' ( (lv_firstPrecision_1_0= RULE_INT ) ) (otherlv_2= ':' ( (lv_secondPrecision_3_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOptDecimalPrecisionAccess().getColonKeyword_0());
              		
            }
            // InternalPortugol.g:2148:3: ( (lv_firstPrecision_1_0= RULE_INT ) )
            // InternalPortugol.g:2149:4: (lv_firstPrecision_1_0= RULE_INT )
            {
            // InternalPortugol.g:2149:4: (lv_firstPrecision_1_0= RULE_INT )
            // InternalPortugol.g:2150:5: lv_firstPrecision_1_0= RULE_INT
            {
            lv_firstPrecision_1_0=(Token)match(input,RULE_INT,FOLLOW_32); if (state.failed) return current;
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

            // InternalPortugol.g:2166:3: (otherlv_2= ':' ( (lv_secondPrecision_3_0= RULE_INT ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==15) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPortugol.g:2167:4: otherlv_2= ':' ( (lv_secondPrecision_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOptDecimalPrecisionAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalPortugol.g:2171:4: ( (lv_secondPrecision_3_0= RULE_INT ) )
                    // InternalPortugol.g:2172:5: (lv_secondPrecision_3_0= RULE_INT )
                    {
                    // InternalPortugol.g:2172:5: (lv_secondPrecision_3_0= RULE_INT )
                    // InternalPortugol.g:2173:6: lv_secondPrecision_3_0= RULE_INT
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


    // $ANTLR start "entryRuleConstant"
    // InternalPortugol.g:2194:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalPortugol.g:2194:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalPortugol.g:2195:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalPortugol.g:2201:1: ruleConstant returns [EObject current=null] : (this_NumericLiteral_0= ruleNumericLiteral | this_StringExpression_1= ruleStringExpression ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        EObject this_NumericLiteral_0 = null;

        EObject this_StringExpression_1 = null;



        	enterRule();

        try {
            // InternalPortugol.g:2207:2: ( (this_NumericLiteral_0= ruleNumericLiteral | this_StringExpression_1= ruleStringExpression ) )
            // InternalPortugol.g:2208:2: (this_NumericLiteral_0= ruleNumericLiteral | this_StringExpression_1= ruleStringExpression )
            {
            // InternalPortugol.g:2208:2: (this_NumericLiteral_0= ruleNumericLiteral | this_StringExpression_1= ruleStringExpression )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_INT && LA32_0<=RULE_FLOAT)) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_STRING) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalPortugol.g:2209:3: this_NumericLiteral_0= ruleNumericLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConstantAccess().getNumericLiteralParserRuleCall_0());
                      		
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
                    // InternalPortugol.g:2218:3: this_StringExpression_1= ruleStringExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConstantAccess().getStringExpressionParserRuleCall_1());
                      		
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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleNumericLiteral"
    // InternalPortugol.g:2230:1: entryRuleNumericLiteral returns [EObject current=null] : iv_ruleNumericLiteral= ruleNumericLiteral EOF ;
    public final EObject entryRuleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteral = null;


        try {
            // InternalPortugol.g:2230:55: (iv_ruleNumericLiteral= ruleNumericLiteral EOF )
            // InternalPortugol.g:2231:2: iv_ruleNumericLiteral= ruleNumericLiteral EOF
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
    // InternalPortugol.g:2237:1: ruleNumericLiteral returns [EObject current=null] : ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleNumericLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_intValue_0_0=null;
        Token lv_floatValue_1_0=null;


        	enterRule();

        try {
            // InternalPortugol.g:2243:2: ( ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= RULE_FLOAT ) ) ) )
            // InternalPortugol.g:2244:2: ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= RULE_FLOAT ) ) )
            {
            // InternalPortugol.g:2244:2: ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= RULE_FLOAT ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_FLOAT) ) {
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
                    // InternalPortugol.g:2245:3: ( (lv_intValue_0_0= RULE_INT ) )
                    {
                    // InternalPortugol.g:2245:3: ( (lv_intValue_0_0= RULE_INT ) )
                    // InternalPortugol.g:2246:4: (lv_intValue_0_0= RULE_INT )
                    {
                    // InternalPortugol.g:2246:4: (lv_intValue_0_0= RULE_INT )
                    // InternalPortugol.g:2247:5: lv_intValue_0_0= RULE_INT
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
                    // InternalPortugol.g:2264:3: ( (lv_floatValue_1_0= RULE_FLOAT ) )
                    {
                    // InternalPortugol.g:2264:3: ( (lv_floatValue_1_0= RULE_FLOAT ) )
                    // InternalPortugol.g:2265:4: (lv_floatValue_1_0= RULE_FLOAT )
                    {
                    // InternalPortugol.g:2265:4: (lv_floatValue_1_0= RULE_FLOAT )
                    // InternalPortugol.g:2266:5: lv_floatValue_1_0= RULE_FLOAT
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
    // InternalPortugol.g:2286:1: entryRuleStringExpression returns [EObject current=null] : iv_ruleStringExpression= ruleStringExpression EOF ;
    public final EObject entryRuleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpression = null;


        try {
            // InternalPortugol.g:2286:57: (iv_ruleStringExpression= ruleStringExpression EOF )
            // InternalPortugol.g:2287:2: iv_ruleStringExpression= ruleStringExpression EOF
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
    // InternalPortugol.g:2293:1: ruleStringExpression returns [EObject current=null] : ( (lv_literalString_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringExpression() throws RecognitionException {
        EObject current = null;

        Token lv_literalString_0_0=null;


        	enterRule();

        try {
            // InternalPortugol.g:2299:2: ( ( (lv_literalString_0_0= RULE_STRING ) ) )
            // InternalPortugol.g:2300:2: ( (lv_literalString_0_0= RULE_STRING ) )
            {
            // InternalPortugol.g:2300:2: ( (lv_literalString_0_0= RULE_STRING ) )
            // InternalPortugol.g:2301:3: (lv_literalString_0_0= RULE_STRING )
            {
            // InternalPortugol.g:2301:3: (lv_literalString_0_0= RULE_STRING )
            // InternalPortugol.g:2302:4: lv_literalString_0_0= RULE_STRING
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002900000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000031000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000034000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00004200002001D0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000008002L});

}