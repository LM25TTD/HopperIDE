package com.hopper.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.hopper.services.PortugolGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPortugolParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g"; }


     
     	private PortugolGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PortugolGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:61:1: ( ruleModel EOF )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:69:1: ruleModel : ( ( rule__Model__MainAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:73:2: ( ( ( rule__Model__MainAssignment ) ) )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:74:1: ( ( rule__Model__MainAssignment ) )
            {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:74:1: ( ( rule__Model__MainAssignment ) )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:75:1: ( rule__Model__MainAssignment )
            {
             before(grammarAccess.getModelAccess().getMainAssignment()); 
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:76:1: ( rule__Model__MainAssignment )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:76:2: rule__Model__MainAssignment
            {
            pushFollow(FOLLOW_rule__Model__MainAssignment_in_ruleModel94);
            rule__Model__MainAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getMainAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleALGORITMO"
    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:92:1: entryRuleALGORITMO : ruleALGORITMO EOF ;
    public final void entryRuleALGORITMO() throws RecognitionException {
        try {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:93:1: ( ruleALGORITMO EOF )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:94:1: ruleALGORITMO EOF
            {
             before(grammarAccess.getALGORITMORule()); 
            pushFollow(FOLLOW_ruleALGORITMO_in_entryRuleALGORITMO125);
            ruleALGORITMO();

            state._fsp--;

             after(grammarAccess.getALGORITMORule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleALGORITMO132); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALGORITMO"


    // $ANTLR start "ruleALGORITMO"
    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:101:1: ruleALGORITMO : ( 'algoritmo' ) ;
    public final void ruleALGORITMO() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:105:2: ( ( 'algoritmo' ) )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:106:1: ( 'algoritmo' )
            {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:106:1: ( 'algoritmo' )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:107:1: 'algoritmo'
            {
             before(grammarAccess.getALGORITMOAccess().getAlgoritmoKeyword()); 
            match(input,11,FOLLOW_11_in_ruleALGORITMO159); 
             after(grammarAccess.getALGORITMOAccess().getAlgoritmoKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALGORITMO"


    // $ANTLR start "entryRulePrograma"
    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:320:1: entryRulePrograma : rulePrograma EOF ;
    public final void entryRulePrograma() throws RecognitionException {
        try {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:321:1: ( rulePrograma EOF )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:322:1: rulePrograma EOF
            {
             before(grammarAccess.getProgramaRule()); 
            pushFollow(FOLLOW_rulePrograma_in_entryRulePrograma385);
            rulePrograma();

            state._fsp--;

             after(grammarAccess.getProgramaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrograma392); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrograma"


    // $ANTLR start "rulePrograma"
    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:329:1: rulePrograma : ( ( rule__Programa__Group__0 ) ) ;
    public final void rulePrograma() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:333:2: ( ( ( rule__Programa__Group__0 ) ) )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:334:1: ( ( rule__Programa__Group__0 ) )
            {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:334:1: ( ( rule__Programa__Group__0 ) )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:335:1: ( rule__Programa__Group__0 )
            {
             before(grammarAccess.getProgramaAccess().getGroup()); 
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:336:1: ( rule__Programa__Group__0 )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:336:2: rule__Programa__Group__0
            {
            pushFollow(FOLLOW_rule__Programa__Group__0_in_rulePrograma418);
            rule__Programa__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrograma"


    // $ANTLR start "entryRuleHEADER"
    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:348:1: entryRuleHEADER : ruleHEADER EOF ;
    public final void entryRuleHEADER() throws RecognitionException {
        try {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:349:1: ( ruleHEADER EOF )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:350:1: ruleHEADER EOF
            {
             before(grammarAccess.getHEADERRule()); 
            pushFollow(FOLLOW_ruleHEADER_in_entryRuleHEADER445);
            ruleHEADER();

            state._fsp--;

             after(grammarAccess.getHEADERRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHEADER452); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHEADER"


    // $ANTLR start "ruleHEADER"
    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:357:1: ruleHEADER : ( ( rule__HEADER__Group__0 ) ) ;
    public final void ruleHEADER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:361:2: ( ( ( rule__HEADER__Group__0 ) ) )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:362:1: ( ( rule__HEADER__Group__0 ) )
            {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:362:1: ( ( rule__HEADER__Group__0 ) )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:363:1: ( rule__HEADER__Group__0 )
            {
             before(grammarAccess.getHEADERAccess().getGroup()); 
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:364:1: ( rule__HEADER__Group__0 )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:364:2: rule__HEADER__Group__0
            {
            pushFollow(FOLLOW_rule__HEADER__Group__0_in_ruleHEADER478);
            rule__HEADER__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHEADERAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHEADER"


    // $ANTLR start "rule__Programa__Group__0"
    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:378:1: rule__Programa__Group__0 : rule__Programa__Group__0__Impl rule__Programa__Group__1 ;
    public final void rule__Programa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:382:1: ( rule__Programa__Group__0__Impl rule__Programa__Group__1 )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:383:2: rule__Programa__Group__0__Impl rule__Programa__Group__1
            {
            pushFollow(FOLLOW_rule__Programa__Group__0__Impl_in_rule__Programa__Group__0512);
            rule__Programa__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Programa__Group__1_in_rule__Programa__Group__0515);
            rule__Programa__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__0"


    // $ANTLR start "rule__Programa__Group__0__Impl"
    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:390:1: rule__Programa__Group__0__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Programa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:394:1: ( ( ( RULE_WS )* ) )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:395:1: ( ( RULE_WS )* )
            {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:395:1: ( ( RULE_WS )* )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:396:1: ( RULE_WS )*
            {
             before(grammarAccess.getProgramaAccess().getWSTerminalRuleCall_0()); 
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:397:1: ( RULE_WS )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_WS) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:397:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Programa__Group__0__Impl543); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramaAccess().getWSTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__0__Impl"


    // $ANTLR start "rule__Programa__Group__1"
    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:407:1: rule__Programa__Group__1 : rule__Programa__Group__1__Impl rule__Programa__Group__2 ;
    public final void rule__Programa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:411:1: ( rule__Programa__Group__1__Impl rule__Programa__Group__2 )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:412:2: rule__Programa__Group__1__Impl rule__Programa__Group__2
            {
            pushFollow(FOLLOW_rule__Programa__Group__1__Impl_in_rule__Programa__Group__1574);
            rule__Programa__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Programa__Group__2_in_rule__Programa__Group__1577);
            rule__Programa__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__1"


    // $ANTLR start "rule__Programa__Group__1__Impl"
    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:419:1: rule__Programa__Group__1__Impl : ( ruleHEADER ) ;
    public final void rule__Programa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:423:1: ( ( ruleHEADER ) )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:424:1: ( ruleHEADER )
            {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:424:1: ( ruleHEADER )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:425:1: ruleHEADER
            {
             before(grammarAccess.getProgramaAccess().getHEADERParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleHEADER_in_rule__Programa__Group__1__Impl604);
            ruleHEADER();

            state._fsp--;

             after(grammarAccess.getProgramaAccess().getHEADERParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__1__Impl"


    // $ANTLR start "rule__Programa__Group__2"
    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:436:1: rule__Programa__Group__2 : rule__Programa__Group__2__Impl ;
    public final void rule__Programa__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:440:1: ( rule__Programa__Group__2__Impl )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:441:2: rule__Programa__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Programa__Group__2__Impl_in_rule__Programa__Group__2633);
            rule__Programa__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__2"


    // $ANTLR start "rule__Programa__Group__2__Impl"
    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:447:1: rule__Programa__Group__2__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Programa__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:451:1: ( ( ( RULE_WS )* ) )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:452:1: ( ( RULE_WS )* )
            {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:452:1: ( ( RULE_WS )* )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:453:1: ( RULE_WS )*
            {
             before(grammarAccess.getProgramaAccess().getWSTerminalRuleCall_2()); 
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:454:1: ( RULE_WS )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_WS) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:454:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Programa__Group__2__Impl661); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getProgramaAccess().getWSTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__2__Impl"


    // $ANTLR start "rule__HEADER__Group__0"
    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:470:1: rule__HEADER__Group__0 : rule__HEADER__Group__0__Impl rule__HEADER__Group__1 ;
    public final void rule__HEADER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:474:1: ( rule__HEADER__Group__0__Impl rule__HEADER__Group__1 )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:475:2: rule__HEADER__Group__0__Impl rule__HEADER__Group__1
            {
            pushFollow(FOLLOW_rule__HEADER__Group__0__Impl_in_rule__HEADER__Group__0698);
            rule__HEADER__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HEADER__Group__1_in_rule__HEADER__Group__0701);
            rule__HEADER__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HEADER__Group__0"


    // $ANTLR start "rule__HEADER__Group__0__Impl"
    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:482:1: rule__HEADER__Group__0__Impl : ( ruleALGORITMO ) ;
    public final void rule__HEADER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:486:1: ( ( ruleALGORITMO ) )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:487:1: ( ruleALGORITMO )
            {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:487:1: ( ruleALGORITMO )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:488:1: ruleALGORITMO
            {
             before(grammarAccess.getHEADERAccess().getALGORITMOParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleALGORITMO_in_rule__HEADER__Group__0__Impl728);
            ruleALGORITMO();

            state._fsp--;

             after(grammarAccess.getHEADERAccess().getALGORITMOParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HEADER__Group__0__Impl"


    // $ANTLR start "rule__HEADER__Group__1"
    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:499:1: rule__HEADER__Group__1 : rule__HEADER__Group__1__Impl rule__HEADER__Group__2 ;
    public final void rule__HEADER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:503:1: ( rule__HEADER__Group__1__Impl rule__HEADER__Group__2 )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:504:2: rule__HEADER__Group__1__Impl rule__HEADER__Group__2
            {
            pushFollow(FOLLOW_rule__HEADER__Group__1__Impl_in_rule__HEADER__Group__1757);
            rule__HEADER__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HEADER__Group__2_in_rule__HEADER__Group__1760);
            rule__HEADER__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HEADER__Group__1"


    // $ANTLR start "rule__HEADER__Group__1__Impl"
    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:511:1: rule__HEADER__Group__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__HEADER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:515:1: ( ( ( RULE_WS )* ) )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:516:1: ( ( RULE_WS )* )
            {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:516:1: ( ( RULE_WS )* )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:517:1: ( RULE_WS )*
            {
             before(grammarAccess.getHEADERAccess().getWSTerminalRuleCall_1()); 
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:518:1: ( RULE_WS )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_WS) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:518:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__HEADER__Group__1__Impl788); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getHEADERAccess().getWSTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HEADER__Group__1__Impl"


    // $ANTLR start "rule__HEADER__Group__2"
    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:528:1: rule__HEADER__Group__2 : rule__HEADER__Group__2__Impl rule__HEADER__Group__3 ;
    public final void rule__HEADER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:532:1: ( rule__HEADER__Group__2__Impl rule__HEADER__Group__3 )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:533:2: rule__HEADER__Group__2__Impl rule__HEADER__Group__3
            {
            pushFollow(FOLLOW_rule__HEADER__Group__2__Impl_in_rule__HEADER__Group__2819);
            rule__HEADER__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HEADER__Group__3_in_rule__HEADER__Group__2822);
            rule__HEADER__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HEADER__Group__2"


    // $ANTLR start "rule__HEADER__Group__2__Impl"
    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:540:1: rule__HEADER__Group__2__Impl : ( ( rule__HEADER__NameOfProgramAssignment_2 ) ) ;
    public final void rule__HEADER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:544:1: ( ( ( rule__HEADER__NameOfProgramAssignment_2 ) ) )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:545:1: ( ( rule__HEADER__NameOfProgramAssignment_2 ) )
            {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:545:1: ( ( rule__HEADER__NameOfProgramAssignment_2 ) )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:546:1: ( rule__HEADER__NameOfProgramAssignment_2 )
            {
             before(grammarAccess.getHEADERAccess().getNameOfProgramAssignment_2()); 
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:547:1: ( rule__HEADER__NameOfProgramAssignment_2 )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:547:2: rule__HEADER__NameOfProgramAssignment_2
            {
            pushFollow(FOLLOW_rule__HEADER__NameOfProgramAssignment_2_in_rule__HEADER__Group__2__Impl849);
            rule__HEADER__NameOfProgramAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHEADERAccess().getNameOfProgramAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HEADER__Group__2__Impl"


    // $ANTLR start "rule__HEADER__Group__3"
    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:557:1: rule__HEADER__Group__3 : rule__HEADER__Group__3__Impl ;
    public final void rule__HEADER__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:561:1: ( rule__HEADER__Group__3__Impl )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:562:2: rule__HEADER__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__HEADER__Group__3__Impl_in_rule__HEADER__Group__3879);
            rule__HEADER__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HEADER__Group__3"


    // $ANTLR start "rule__HEADER__Group__3__Impl"
    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:568:1: rule__HEADER__Group__3__Impl : ( ( RULE_WS )* ) ;
    public final void rule__HEADER__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:572:1: ( ( ( RULE_WS )* ) )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:573:1: ( ( RULE_WS )* )
            {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:573:1: ( ( RULE_WS )* )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:574:1: ( RULE_WS )*
            {
             before(grammarAccess.getHEADERAccess().getWSTerminalRuleCall_3()); 
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:575:1: ( RULE_WS )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_WS) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:575:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__HEADER__Group__3__Impl907); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getHEADERAccess().getWSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HEADER__Group__3__Impl"


    // $ANTLR start "rule__Model__MainAssignment"
    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:594:1: rule__Model__MainAssignment : ( rulePrograma ) ;
    public final void rule__Model__MainAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:598:1: ( ( rulePrograma ) )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:599:1: ( rulePrograma )
            {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:599:1: ( rulePrograma )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:600:1: rulePrograma
            {
             before(grammarAccess.getModelAccess().getMainProgramaParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrograma_in_rule__Model__MainAssignment951);
            rulePrograma();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMainProgramaParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MainAssignment"


    // $ANTLR start "rule__HEADER__NameOfProgramAssignment_2"
    // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:609:1: rule__HEADER__NameOfProgramAssignment_2 : ( RULE_STRING ) ;
    public final void rule__HEADER__NameOfProgramAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:613:1: ( ( RULE_STRING ) )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:614:1: ( RULE_STRING )
            {
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:614:1: ( RULE_STRING )
            // ../com.hopper.hopperide.ui/src-gen/com/hopper/ui/contentassist/antlr/internal/InternalPortugol.g:615:1: RULE_STRING
            {
             before(grammarAccess.getHEADERAccess().getNameOfProgramSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HEADER__NameOfProgramAssignment_2982); 
             after(grammarAccess.getHEADERAccess().getNameOfProgramSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HEADER__NameOfProgramAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MainAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleALGORITMO_in_entryRuleALGORITMO125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleALGORITMO132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleALGORITMO159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrograma_in_entryRulePrograma385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrograma392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Programa__Group__0_in_rulePrograma418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHEADER_in_entryRuleHEADER445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHEADER452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HEADER__Group__0_in_ruleHEADER478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Programa__Group__0__Impl_in_rule__Programa__Group__0512 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Programa__Group__1_in_rule__Programa__Group__0515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Programa__Group__0__Impl543 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Programa__Group__1__Impl_in_rule__Programa__Group__1574 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Programa__Group__2_in_rule__Programa__Group__1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHEADER_in_rule__Programa__Group__1__Impl604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Programa__Group__2__Impl_in_rule__Programa__Group__2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Programa__Group__2__Impl661 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__HEADER__Group__0__Impl_in_rule__HEADER__Group__0698 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__HEADER__Group__1_in_rule__HEADER__Group__0701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleALGORITMO_in_rule__HEADER__Group__0__Impl728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HEADER__Group__1__Impl_in_rule__HEADER__Group__1757 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__HEADER__Group__2_in_rule__HEADER__Group__1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__HEADER__Group__1__Impl788 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__HEADER__Group__2__Impl_in_rule__HEADER__Group__2819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HEADER__Group__3_in_rule__HEADER__Group__2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HEADER__NameOfProgramAssignment_2_in_rule__HEADER__Group__2__Impl849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HEADER__Group__3__Impl_in_rule__HEADER__Group__3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__HEADER__Group__3__Impl907 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulePrograma_in_rule__Model__MainAssignment951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HEADER__NameOfProgramAssignment_2982 = new BitSet(new long[]{0x0000000000000002L});

}