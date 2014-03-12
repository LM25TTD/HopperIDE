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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPortugolParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_STRING", "RULE_ML_COMMENT", "RULE_ID", "RULE_INT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'algoritmo'"
    };
    public static final int RULE_ID=7;
    public static final int RULE_STRING=5;
    public static final int T__11=11;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=8;
    public static final int RULE_WS=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=6;

    // delegates
    // delegators


        public InternalPortugolParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPortugolParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPortugolParser.tokenNames; }
    public String getGrammarFileName() { return "../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g"; }



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
    // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

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
    // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:76:1: ruleModel returns [EObject current=null] : ( (lv_main_0_0= rulePrograma ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_main_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:79:28: ( ( (lv_main_0_0= rulePrograma ) ) )
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:80:1: ( (lv_main_0_0= rulePrograma ) )
            {
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:80:1: ( (lv_main_0_0= rulePrograma ) )
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:81:1: (lv_main_0_0= rulePrograma )
            {
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:81:1: (lv_main_0_0= rulePrograma )
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:82:3: lv_main_0_0= rulePrograma
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getMainProgramaParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_rulePrograma_in_ruleModel130);
            lv_main_0_0=rulePrograma();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"main",
                    		lv_main_0_0, 
                    		"Programa");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleALGORITMO"
    // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:110:1: entryRuleALGORITMO returns [String current=null] : iv_ruleALGORITMO= ruleALGORITMO EOF ;
    public final String entryRuleALGORITMO() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleALGORITMO = null;


        try {
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:111:2: (iv_ruleALGORITMO= ruleALGORITMO EOF )
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:112:2: iv_ruleALGORITMO= ruleALGORITMO EOF
            {
             newCompositeNode(grammarAccess.getALGORITMORule()); 
            pushFollow(FOLLOW_ruleALGORITMO_in_entryRuleALGORITMO170);
            iv_ruleALGORITMO=ruleALGORITMO();

            state._fsp--;

             current =iv_ruleALGORITMO.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleALGORITMO181); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleALGORITMO"


    // $ANTLR start "ruleALGORITMO"
    // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:119:1: ruleALGORITMO returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'algoritmo' ;
    public final AntlrDatatypeRuleToken ruleALGORITMO() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:122:28: (kw= 'algoritmo' )
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:124:2: kw= 'algoritmo'
            {
            kw=(Token)match(input,11,FOLLOW_11_in_ruleALGORITMO218); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getALGORITMOAccess().getAlgoritmoKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleALGORITMO"


    // $ANTLR start "entryRulePrograma"
    // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:335:1: entryRulePrograma returns [EObject current=null] : iv_rulePrograma= rulePrograma EOF ;
    public final EObject entryRulePrograma() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrograma = null;


        try {
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:336:2: (iv_rulePrograma= rulePrograma EOF )
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:337:2: iv_rulePrograma= rulePrograma EOF
            {
             newCompositeNode(grammarAccess.getProgramaRule()); 
            pushFollow(FOLLOW_rulePrograma_in_entryRulePrograma455);
            iv_rulePrograma=rulePrograma();

            state._fsp--;

             current =iv_rulePrograma; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrograma465); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrograma"


    // $ANTLR start "rulePrograma"
    // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:344:1: rulePrograma returns [EObject current=null] : ( (this_WS_0= RULE_WS )* this_HEADER_1= ruleHEADER (this_WS_2= RULE_WS )* ) ;
    public final EObject rulePrograma() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        EObject this_HEADER_1 = null;


         enterRule(); 
            
        try {
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:347:28: ( ( (this_WS_0= RULE_WS )* this_HEADER_1= ruleHEADER (this_WS_2= RULE_WS )* ) )
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:348:1: ( (this_WS_0= RULE_WS )* this_HEADER_1= ruleHEADER (this_WS_2= RULE_WS )* )
            {
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:348:1: ( (this_WS_0= RULE_WS )* this_HEADER_1= ruleHEADER (this_WS_2= RULE_WS )* )
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:348:2: (this_WS_0= RULE_WS )* this_HEADER_1= ruleHEADER (this_WS_2= RULE_WS )*
            {
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:348:2: (this_WS_0= RULE_WS )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_WS) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:348:3: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulePrograma502); 
            	     
            	        newLeafNode(this_WS_0, grammarAccess.getProgramaAccess().getWSTerminalRuleCall_0()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             
                    newCompositeNode(grammarAccess.getProgramaAccess().getHEADERParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleHEADER_in_rulePrograma525);
            this_HEADER_1=ruleHEADER();

            state._fsp--;

             
                    current = this_HEADER_1; 
                    afterParserOrEnumRuleCall();
                
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:361:1: (this_WS_2= RULE_WS )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_WS) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:361:2: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulePrograma536); 
            	     
            	        newLeafNode(this_WS_2, grammarAccess.getProgramaAccess().getWSTerminalRuleCall_2()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrograma"


    // $ANTLR start "entryRuleHEADER"
    // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:373:1: entryRuleHEADER returns [EObject current=null] : iv_ruleHEADER= ruleHEADER EOF ;
    public final EObject entryRuleHEADER() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHEADER = null;


        try {
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:374:2: (iv_ruleHEADER= ruleHEADER EOF )
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:375:2: iv_ruleHEADER= ruleHEADER EOF
            {
             newCompositeNode(grammarAccess.getHEADERRule()); 
            pushFollow(FOLLOW_ruleHEADER_in_entryRuleHEADER573);
            iv_ruleHEADER=ruleHEADER();

            state._fsp--;

             current =iv_ruleHEADER; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHEADER583); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHEADER"


    // $ANTLR start "ruleHEADER"
    // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:382:1: ruleHEADER returns [EObject current=null] : ( ruleALGORITMO (this_WS_1= RULE_WS )* ( (lv_nameOfProgram_2_0= RULE_STRING ) ) (this_WS_3= RULE_WS )* ) ;
    public final EObject ruleHEADER() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;
        Token lv_nameOfProgram_2_0=null;
        Token this_WS_3=null;

         enterRule(); 
            
        try {
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:385:28: ( ( ruleALGORITMO (this_WS_1= RULE_WS )* ( (lv_nameOfProgram_2_0= RULE_STRING ) ) (this_WS_3= RULE_WS )* ) )
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:386:1: ( ruleALGORITMO (this_WS_1= RULE_WS )* ( (lv_nameOfProgram_2_0= RULE_STRING ) ) (this_WS_3= RULE_WS )* )
            {
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:386:1: ( ruleALGORITMO (this_WS_1= RULE_WS )* ( (lv_nameOfProgram_2_0= RULE_STRING ) ) (this_WS_3= RULE_WS )* )
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:387:5: ruleALGORITMO (this_WS_1= RULE_WS )* ( (lv_nameOfProgram_2_0= RULE_STRING ) ) (this_WS_3= RULE_WS )*
            {
             
                    newCompositeNode(grammarAccess.getHEADERAccess().getALGORITMOParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleALGORITMO_in_ruleHEADER624);
            ruleALGORITMO();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:394:1: (this_WS_1= RULE_WS )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_WS) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:394:2: this_WS_1= RULE_WS
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleHEADER635); 
            	     
            	        newLeafNode(this_WS_1, grammarAccess.getHEADERAccess().getWSTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:398:3: ( (lv_nameOfProgram_2_0= RULE_STRING ) )
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:399:1: (lv_nameOfProgram_2_0= RULE_STRING )
            {
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:399:1: (lv_nameOfProgram_2_0= RULE_STRING )
            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:400:3: lv_nameOfProgram_2_0= RULE_STRING
            {
            lv_nameOfProgram_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHEADER653); 

            			newLeafNode(lv_nameOfProgram_2_0, grammarAccess.getHEADERAccess().getNameOfProgramSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHEADERRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nameOfProgram",
                    		lv_nameOfProgram_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:416:2: (this_WS_3= RULE_WS )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_WS) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.hopper.hopperide/src-gen/com/hopper/parser/antlr/internal/InternalPortugol.g:416:3: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleHEADER670); 
            	     
            	        newLeafNode(this_WS_3, grammarAccess.getHEADERAccess().getWSTerminalRuleCall_3()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHEADER"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrograma_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleALGORITMO_in_entryRuleALGORITMO170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleALGORITMO181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleALGORITMO218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrograma_in_entryRulePrograma455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrograma465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulePrograma502 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_ruleHEADER_in_rulePrograma525 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_WS_in_rulePrograma536 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleHEADER_in_entryRuleHEADER573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHEADER583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleALGORITMO_in_ruleHEADER624 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleHEADER635 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHEADER653 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleHEADER670 = new BitSet(new long[]{0x0000000000000012L});

}