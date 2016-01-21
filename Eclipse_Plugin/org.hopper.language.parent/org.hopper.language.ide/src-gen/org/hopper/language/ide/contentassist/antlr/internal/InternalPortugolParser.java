package org.hopper.language.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.hopper.language.services.PortugolGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPortugolParser extends AbstractInternalContentAssistParser {
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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("PercentSign", "'%'");
    		tokenNameToValue.put("Ampersand", "'&'");
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Asterisk", "'*'");
    		tokenNameToValue.put("PlusSign", "'+'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("HyphenMinus", "'-'");
    		tokenNameToValue.put("Solidus", "'/'");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("Semicolon", "';'");
    		tokenNameToValue.put("LessThanSign", "'<'");
    		tokenNameToValue.put("EqualsSign", "'='");
    		tokenNameToValue.put("GreaterThanSign", "'>'");
    		tokenNameToValue.put("E", "'E'");
    		tokenNameToValue.put("CircumflexAccent", "'^'");
    		tokenNameToValue.put("LessThanSignHyphenMinus", "'<-'");
    		tokenNameToValue.put("LessThanSignEqualsSign", "'<='");
    		tokenNameToValue.put("LessThanSignGreaterThanSign", "'<>'");
    		tokenNameToValue.put("GreaterThanSignEqualsSign", "'>='");
    		tokenNameToValue.put("OU", "'OU'");
    		tokenNameToValue.put("De", "'de'");
    		tokenNameToValue.put("Pi", "'pi'");
    		tokenNameToValue.put("Se", "'se'");
    		tokenNameToValue.put("MOD", "'MOD'");
    		tokenNameToValue.put("NOT", "'NOT'");
    		tokenNameToValue.put("XOU", "'XOU'");
    		tokenNameToValue.put("Ate", "'ate'");
    		tokenNameToValue.put("Var", "'var'");
    		tokenNameToValue.put("Caso", "'caso'");
    		tokenNameToValue.put("Faca", "'faca'");
    		tokenNameToValue.put("Leia", "'leia'");
    		tokenNameToValue.put("Para", "'para'");
    		tokenNameToValue.put("Real", "'real'");
    		tokenNameToValue.put("Compr", "'compr'");
    		tokenNameToValue.put("Copia", "'copia'");
    		tokenNameToValue.put("Entao", "'entao'");
    		tokenNameToValue.put("Fimse", "'fimse'");
    		tokenNameToValue.put("Passo", "'passo'");
    		tokenNameToValue.put("Raizq", "'raizq'");
    		tokenNameToValue.put("Senao", "'senao'");
    		tokenNameToValue.put("Funcao", "'funcao'");
    		tokenNameToValue.put("Inicio", "'inicio'");
    		tokenNameToValue.put("Maiusc", "'maiusc'");
    		tokenNameToValue.put("Repita", "'repita'");
    		tokenNameToValue.put("Escolha", "'escolha'");
    		tokenNameToValue.put("Escreva", "'escreva'");
    		tokenNameToValue.put("Fimpara", "'fimpara'");
    		tokenNameToValue.put("Inteiro", "'inteiro'");
    		tokenNameToValue.put("Retorne", "'retorne'");
    		tokenNameToValue.put("Caracter", "'caracter'");
    		tokenNameToValue.put("Enquanto", "'enquanto'");
    		tokenNameToValue.put("Escreval", "'escreval'");
    		tokenNameToValue.put("Algoritmo", "'algoritmo'");
    		tokenNameToValue.put("Caractere", "'caractere'");
    		tokenNameToValue.put("Fimfuncao", "'fimfuncao'");
    		tokenNameToValue.put("Outrocaso", "'outrocaso'");
    		tokenNameToValue.put("Fimescolha", "'fimescolha'");
    		tokenNameToValue.put("Interrompa", "'interrompa'");
    		tokenNameToValue.put("Fimenquanto", "'fimenquanto'");
    		tokenNameToValue.put("Fimalgoritmo", "'fimalgoritmo'");
    		tokenNameToValue.put("Procedimento", "'procedimento'");
    		tokenNameToValue.put("Fimprocedimento", "'fimprocedimento'");
    	}

    	public void setGrammarAccess(PortugolGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalPortugolParser.g:119:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalPortugolParser.g:120:1: ( ruleModel EOF )
            // InternalPortugolParser.g:121:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPortugolParser.g:128:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:132:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalPortugolParser.g:133:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalPortugolParser.g:133:2: ( ( rule__Model__Group__0 ) )
            // InternalPortugolParser.g:134:3: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // InternalPortugolParser.g:135:3: ( rule__Model__Group__0 )
            // InternalPortugolParser.g:135:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
            }

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


    // $ANTLR start "entryRuleHeaderBlock"
    // InternalPortugolParser.g:144:1: entryRuleHeaderBlock : ruleHeaderBlock EOF ;
    public final void entryRuleHeaderBlock() throws RecognitionException {
        try {
            // InternalPortugolParser.g:145:1: ( ruleHeaderBlock EOF )
            // InternalPortugolParser.g:146:1: ruleHeaderBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHeaderBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderBlockRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleHeaderBlock"


    // $ANTLR start "ruleHeaderBlock"
    // InternalPortugolParser.g:153:1: ruleHeaderBlock : ( ( rule__HeaderBlock__Group__0 ) ) ;
    public final void ruleHeaderBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:157:2: ( ( ( rule__HeaderBlock__Group__0 ) ) )
            // InternalPortugolParser.g:158:2: ( ( rule__HeaderBlock__Group__0 ) )
            {
            // InternalPortugolParser.g:158:2: ( ( rule__HeaderBlock__Group__0 ) )
            // InternalPortugolParser.g:159:3: ( rule__HeaderBlock__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderBlockAccess().getGroup()); 
            }
            // InternalPortugolParser.g:160:3: ( rule__HeaderBlock__Group__0 )
            // InternalPortugolParser.g:160:4: rule__HeaderBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HeaderBlock__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderBlockAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleHeaderBlock"


    // $ANTLR start "entryRuleDeclarationsBlock"
    // InternalPortugolParser.g:169:1: entryRuleDeclarationsBlock : ruleDeclarationsBlock EOF ;
    public final void entryRuleDeclarationsBlock() throws RecognitionException {
        try {
            // InternalPortugolParser.g:170:1: ( ruleDeclarationsBlock EOF )
            // InternalPortugolParser.g:171:1: ruleDeclarationsBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDeclarationsBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationsBlockRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDeclarationsBlock"


    // $ANTLR start "ruleDeclarationsBlock"
    // InternalPortugolParser.g:178:1: ruleDeclarationsBlock : ( ( rule__DeclarationsBlock__Group__0 ) ) ;
    public final void ruleDeclarationsBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:182:2: ( ( ( rule__DeclarationsBlock__Group__0 ) ) )
            // InternalPortugolParser.g:183:2: ( ( rule__DeclarationsBlock__Group__0 ) )
            {
            // InternalPortugolParser.g:183:2: ( ( rule__DeclarationsBlock__Group__0 ) )
            // InternalPortugolParser.g:184:3: ( rule__DeclarationsBlock__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getGroup()); 
            }
            // InternalPortugolParser.g:185:3: ( rule__DeclarationsBlock__Group__0 )
            // InternalPortugolParser.g:185:4: rule__DeclarationsBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeclarationsBlock__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationsBlockAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleDeclarationsBlock"


    // $ANTLR start "entryRuleVariable"
    // InternalPortugolParser.g:194:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalPortugolParser.g:195:1: ( ruleVariable EOF )
            // InternalPortugolParser.g:196:1: ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalPortugolParser.g:203:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:207:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalPortugolParser.g:208:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalPortugolParser.g:208:2: ( ( rule__Variable__Group__0 ) )
            // InternalPortugolParser.g:209:3: ( rule__Variable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getGroup()); 
            }
            // InternalPortugolParser.g:210:3: ( rule__Variable__Group__0 )
            // InternalPortugolParser.g:210:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalPortugolParser.g:219:1: entryRuleVarDeclaration : ruleVarDeclaration EOF ;
    public final void entryRuleVarDeclaration() throws RecognitionException {
        try {
            // InternalPortugolParser.g:220:1: ( ruleVarDeclaration EOF )
            // InternalPortugolParser.g:221:1: ruleVarDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVarDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalPortugolParser.g:228:1: ruleVarDeclaration : ( ( rule__VarDeclaration__Group__0 ) ) ;
    public final void ruleVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:232:2: ( ( ( rule__VarDeclaration__Group__0 ) ) )
            // InternalPortugolParser.g:233:2: ( ( rule__VarDeclaration__Group__0 ) )
            {
            // InternalPortugolParser.g:233:2: ( ( rule__VarDeclaration__Group__0 ) )
            // InternalPortugolParser.g:234:3: ( rule__VarDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getGroup()); 
            }
            // InternalPortugolParser.g:235:3: ( rule__VarDeclaration__Group__0 )
            // InternalPortugolParser.g:235:4: rule__VarDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleDeclaredVarList"
    // InternalPortugolParser.g:244:1: entryRuleDeclaredVarList : ruleDeclaredVarList EOF ;
    public final void entryRuleDeclaredVarList() throws RecognitionException {
        try {
            // InternalPortugolParser.g:245:1: ( ruleDeclaredVarList EOF )
            // InternalPortugolParser.g:246:1: ruleDeclaredVarList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDeclaredVarList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredVarListRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDeclaredVarList"


    // $ANTLR start "ruleDeclaredVarList"
    // InternalPortugolParser.g:253:1: ruleDeclaredVarList : ( ( rule__DeclaredVarList__Group__0 ) ) ;
    public final void ruleDeclaredVarList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:257:2: ( ( ( rule__DeclaredVarList__Group__0 ) ) )
            // InternalPortugolParser.g:258:2: ( ( rule__DeclaredVarList__Group__0 ) )
            {
            // InternalPortugolParser.g:258:2: ( ( rule__DeclaredVarList__Group__0 ) )
            // InternalPortugolParser.g:259:3: ( rule__DeclaredVarList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getGroup()); 
            }
            // InternalPortugolParser.g:260:3: ( rule__DeclaredVarList__Group__0 )
            // InternalPortugolParser.g:260:4: rule__DeclaredVarList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredVarList__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredVarListAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleDeclaredVarList"


    // $ANTLR start "entryRuleVarName"
    // InternalPortugolParser.g:269:1: entryRuleVarName : ruleVarName EOF ;
    public final void entryRuleVarName() throws RecognitionException {
        try {
            // InternalPortugolParser.g:270:1: ( ruleVarName EOF )
            // InternalPortugolParser.g:271:1: ruleVarName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVarName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVarName"


    // $ANTLR start "ruleVarName"
    // InternalPortugolParser.g:278:1: ruleVarName : ( ( rule__VarName__NameAssignment ) ) ;
    public final void ruleVarName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:282:2: ( ( ( rule__VarName__NameAssignment ) ) )
            // InternalPortugolParser.g:283:2: ( ( rule__VarName__NameAssignment ) )
            {
            // InternalPortugolParser.g:283:2: ( ( rule__VarName__NameAssignment ) )
            // InternalPortugolParser.g:284:3: ( rule__VarName__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNameAccess().getNameAssignment()); 
            }
            // InternalPortugolParser.g:285:3: ( rule__VarName__NameAssignment )
            // InternalPortugolParser.g:285:4: rule__VarName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VarName__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarNameAccess().getNameAssignment()); 
            }

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
    // $ANTLR end "ruleVarName"


    // $ANTLR start "entryRuleVarType"
    // InternalPortugolParser.g:294:1: entryRuleVarType : ruleVarType EOF ;
    public final void entryRuleVarType() throws RecognitionException {
        try {
            // InternalPortugolParser.g:295:1: ( ruleVarType EOF )
            // InternalPortugolParser.g:296:1: ruleVarType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVarType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVarType"


    // $ANTLR start "ruleVarType"
    // InternalPortugolParser.g:303:1: ruleVarType : ( ( rule__VarType__TypeNameAssignment ) ) ;
    public final void ruleVarType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:307:2: ( ( ( rule__VarType__TypeNameAssignment ) ) )
            // InternalPortugolParser.g:308:2: ( ( rule__VarType__TypeNameAssignment ) )
            {
            // InternalPortugolParser.g:308:2: ( ( rule__VarType__TypeNameAssignment ) )
            // InternalPortugolParser.g:309:3: ( rule__VarType__TypeNameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarTypeAccess().getTypeNameAssignment()); 
            }
            // InternalPortugolParser.g:310:3: ( rule__VarType__TypeNameAssignment )
            // InternalPortugolParser.g:310:4: rule__VarType__TypeNameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VarType__TypeNameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarTypeAccess().getTypeNameAssignment()); 
            }

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
    // $ANTLR end "ruleVarType"


    // $ANTLR start "entryRuleSubprograms"
    // InternalPortugolParser.g:319:1: entryRuleSubprograms : ruleSubprograms EOF ;
    public final void entryRuleSubprograms() throws RecognitionException {
        try {
            // InternalPortugolParser.g:320:1: ( ruleSubprograms EOF )
            // InternalPortugolParser.g:321:1: ruleSubprograms EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSubprograms();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubprogramsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSubprograms"


    // $ANTLR start "ruleSubprograms"
    // InternalPortugolParser.g:328:1: ruleSubprograms : ( ( ( rule__Subprograms__BlockSubProgramsAssignment ) ) ( ( rule__Subprograms__BlockSubProgramsAssignment )* ) ) ;
    public final void ruleSubprograms() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:332:2: ( ( ( ( rule__Subprograms__BlockSubProgramsAssignment ) ) ( ( rule__Subprograms__BlockSubProgramsAssignment )* ) ) )
            // InternalPortugolParser.g:333:2: ( ( ( rule__Subprograms__BlockSubProgramsAssignment ) ) ( ( rule__Subprograms__BlockSubProgramsAssignment )* ) )
            {
            // InternalPortugolParser.g:333:2: ( ( ( rule__Subprograms__BlockSubProgramsAssignment ) ) ( ( rule__Subprograms__BlockSubProgramsAssignment )* ) )
            // InternalPortugolParser.g:334:3: ( ( rule__Subprograms__BlockSubProgramsAssignment ) ) ( ( rule__Subprograms__BlockSubProgramsAssignment )* )
            {
            // InternalPortugolParser.g:334:3: ( ( rule__Subprograms__BlockSubProgramsAssignment ) )
            // InternalPortugolParser.g:335:4: ( rule__Subprograms__BlockSubProgramsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramsAccess().getBlockSubProgramsAssignment()); 
            }
            // InternalPortugolParser.g:336:4: ( rule__Subprograms__BlockSubProgramsAssignment )
            // InternalPortugolParser.g:336:5: rule__Subprograms__BlockSubProgramsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Subprograms__BlockSubProgramsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubprogramsAccess().getBlockSubProgramsAssignment()); 
            }

            }

            // InternalPortugolParser.g:339:3: ( ( rule__Subprograms__BlockSubProgramsAssignment )* )
            // InternalPortugolParser.g:340:4: ( rule__Subprograms__BlockSubProgramsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramsAccess().getBlockSubProgramsAssignment()); 
            }
            // InternalPortugolParser.g:341:4: ( rule__Subprograms__BlockSubProgramsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Procedimento||LA1_0==Funcao) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPortugolParser.g:341:5: rule__Subprograms__BlockSubProgramsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Subprograms__BlockSubProgramsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubprogramsAccess().getBlockSubProgramsAssignment()); 
            }

            }


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
    // $ANTLR end "ruleSubprograms"


    // $ANTLR start "entryRuleBlockSubPrograms"
    // InternalPortugolParser.g:351:1: entryRuleBlockSubPrograms : ruleBlockSubPrograms EOF ;
    public final void entryRuleBlockSubPrograms() throws RecognitionException {
        try {
            // InternalPortugolParser.g:352:1: ( ruleBlockSubPrograms EOF )
            // InternalPortugolParser.g:353:1: ruleBlockSubPrograms EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockSubProgramsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBlockSubPrograms();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockSubProgramsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBlockSubPrograms"


    // $ANTLR start "ruleBlockSubPrograms"
    // InternalPortugolParser.g:360:1: ruleBlockSubPrograms : ( ( rule__BlockSubPrograms__Alternatives ) ) ;
    public final void ruleBlockSubPrograms() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:364:2: ( ( ( rule__BlockSubPrograms__Alternatives ) ) )
            // InternalPortugolParser.g:365:2: ( ( rule__BlockSubPrograms__Alternatives ) )
            {
            // InternalPortugolParser.g:365:2: ( ( rule__BlockSubPrograms__Alternatives ) )
            // InternalPortugolParser.g:366:3: ( rule__BlockSubPrograms__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockSubProgramsAccess().getAlternatives()); 
            }
            // InternalPortugolParser.g:367:3: ( rule__BlockSubPrograms__Alternatives )
            // InternalPortugolParser.g:367:4: rule__BlockSubPrograms__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BlockSubPrograms__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockSubProgramsAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleBlockSubPrograms"


    // $ANTLR start "entryRuleProcedureName"
    // InternalPortugolParser.g:376:1: entryRuleProcedureName : ruleProcedureName EOF ;
    public final void entryRuleProcedureName() throws RecognitionException {
        try {
            // InternalPortugolParser.g:377:1: ( ruleProcedureName EOF )
            // InternalPortugolParser.g:378:1: ruleProcedureName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedureNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProcedureName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedureNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleProcedureName"


    // $ANTLR start "ruleProcedureName"
    // InternalPortugolParser.g:385:1: ruleProcedureName : ( ( rule__ProcedureName__NameAssignment ) ) ;
    public final void ruleProcedureName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:389:2: ( ( ( rule__ProcedureName__NameAssignment ) ) )
            // InternalPortugolParser.g:390:2: ( ( rule__ProcedureName__NameAssignment ) )
            {
            // InternalPortugolParser.g:390:2: ( ( rule__ProcedureName__NameAssignment ) )
            // InternalPortugolParser.g:391:3: ( rule__ProcedureName__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedureNameAccess().getNameAssignment()); 
            }
            // InternalPortugolParser.g:392:3: ( rule__ProcedureName__NameAssignment )
            // InternalPortugolParser.g:392:4: rule__ProcedureName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ProcedureName__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedureNameAccess().getNameAssignment()); 
            }

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
    // $ANTLR end "ruleProcedureName"


    // $ANTLR start "entryRuleFunctionName"
    // InternalPortugolParser.g:401:1: entryRuleFunctionName : ruleFunctionName EOF ;
    public final void entryRuleFunctionName() throws RecognitionException {
        try {
            // InternalPortugolParser.g:402:1: ( ruleFunctionName EOF )
            // InternalPortugolParser.g:403:1: ruleFunctionName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFunctionName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFunctionName"


    // $ANTLR start "ruleFunctionName"
    // InternalPortugolParser.g:410:1: ruleFunctionName : ( ( rule__FunctionName__NameAssignment ) ) ;
    public final void ruleFunctionName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:414:2: ( ( ( rule__FunctionName__NameAssignment ) ) )
            // InternalPortugolParser.g:415:2: ( ( rule__FunctionName__NameAssignment ) )
            {
            // InternalPortugolParser.g:415:2: ( ( rule__FunctionName__NameAssignment ) )
            // InternalPortugolParser.g:416:3: ( rule__FunctionName__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionNameAccess().getNameAssignment()); 
            }
            // InternalPortugolParser.g:417:3: ( rule__FunctionName__NameAssignment )
            // InternalPortugolParser.g:417:4: rule__FunctionName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FunctionName__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionNameAccess().getNameAssignment()); 
            }

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
    // $ANTLR end "ruleFunctionName"


    // $ANTLR start "entryRuleBlockFunction"
    // InternalPortugolParser.g:426:1: entryRuleBlockFunction : ruleBlockFunction EOF ;
    public final void entryRuleBlockFunction() throws RecognitionException {
        try {
            // InternalPortugolParser.g:427:1: ( ruleBlockFunction EOF )
            // InternalPortugolParser.g:428:1: ruleBlockFunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBlockFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBlockFunction"


    // $ANTLR start "ruleBlockFunction"
    // InternalPortugolParser.g:435:1: ruleBlockFunction : ( ( rule__BlockFunction__Group__0 ) ) ;
    public final void ruleBlockFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:439:2: ( ( ( rule__BlockFunction__Group__0 ) ) )
            // InternalPortugolParser.g:440:2: ( ( rule__BlockFunction__Group__0 ) )
            {
            // InternalPortugolParser.g:440:2: ( ( rule__BlockFunction__Group__0 ) )
            // InternalPortugolParser.g:441:3: ( rule__BlockFunction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:442:3: ( rule__BlockFunction__Group__0 )
            // InternalPortugolParser.g:442:4: rule__BlockFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BlockFunction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleBlockFunction"


    // $ANTLR start "entryRuleBlockProcedure"
    // InternalPortugolParser.g:451:1: entryRuleBlockProcedure : ruleBlockProcedure EOF ;
    public final void entryRuleBlockProcedure() throws RecognitionException {
        try {
            // InternalPortugolParser.g:452:1: ( ruleBlockProcedure EOF )
            // InternalPortugolParser.g:453:1: ruleBlockProcedure EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBlockProcedure();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBlockProcedure"


    // $ANTLR start "ruleBlockProcedure"
    // InternalPortugolParser.g:460:1: ruleBlockProcedure : ( ( rule__BlockProcedure__Group__0 ) ) ;
    public final void ruleBlockProcedure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:464:2: ( ( ( rule__BlockProcedure__Group__0 ) ) )
            // InternalPortugolParser.g:465:2: ( ( rule__BlockProcedure__Group__0 ) )
            {
            // InternalPortugolParser.g:465:2: ( ( rule__BlockProcedure__Group__0 ) )
            // InternalPortugolParser.g:466:3: ( rule__BlockProcedure__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getGroup()); 
            }
            // InternalPortugolParser.g:467:3: ( rule__BlockProcedure__Group__0 )
            // InternalPortugolParser.g:467:4: rule__BlockProcedure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BlockProcedure__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleBlockProcedure"


    // $ANTLR start "entryRuleBlockCommand"
    // InternalPortugolParser.g:476:1: entryRuleBlockCommand : ruleBlockCommand EOF ;
    public final void entryRuleBlockCommand() throws RecognitionException {
        try {
            // InternalPortugolParser.g:477:1: ( ruleBlockCommand EOF )
            // InternalPortugolParser.g:478:1: ruleBlockCommand EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBlockCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockCommandRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBlockCommand"


    // $ANTLR start "ruleBlockCommand"
    // InternalPortugolParser.g:485:1: ruleBlockCommand : ( ( rule__BlockCommand__Group__0 ) ) ;
    public final void ruleBlockCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:489:2: ( ( ( rule__BlockCommand__Group__0 ) ) )
            // InternalPortugolParser.g:490:2: ( ( rule__BlockCommand__Group__0 ) )
            {
            // InternalPortugolParser.g:490:2: ( ( rule__BlockCommand__Group__0 ) )
            // InternalPortugolParser.g:491:3: ( rule__BlockCommand__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getGroup()); 
            }
            // InternalPortugolParser.g:492:3: ( rule__BlockCommand__Group__0 )
            // InternalPortugolParser.g:492:4: rule__BlockCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BlockCommand__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockCommandAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleBlockCommand"


    // $ANTLR start "entryRuleAbstractCommand"
    // InternalPortugolParser.g:501:1: entryRuleAbstractCommand : ruleAbstractCommand EOF ;
    public final void entryRuleAbstractCommand() throws RecognitionException {
        try {
            // InternalPortugolParser.g:502:1: ( ruleAbstractCommand EOF )
            // InternalPortugolParser.g:503:1: ruleAbstractCommand EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAbstractCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractCommandRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAbstractCommand"


    // $ANTLR start "ruleAbstractCommand"
    // InternalPortugolParser.g:510:1: ruleAbstractCommand : ( ( rule__AbstractCommand__Alternatives ) ) ;
    public final void ruleAbstractCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:514:2: ( ( ( rule__AbstractCommand__Alternatives ) ) )
            // InternalPortugolParser.g:515:2: ( ( rule__AbstractCommand__Alternatives ) )
            {
            // InternalPortugolParser.g:515:2: ( ( rule__AbstractCommand__Alternatives ) )
            // InternalPortugolParser.g:516:3: ( rule__AbstractCommand__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractCommandAccess().getAlternatives()); 
            }
            // InternalPortugolParser.g:517:3: ( rule__AbstractCommand__Alternatives )
            // InternalPortugolParser.g:517:4: rule__AbstractCommand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractCommand__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractCommandAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleAbstractCommand"


    // $ANTLR start "entryRuleBreakStatement"
    // InternalPortugolParser.g:526:1: entryRuleBreakStatement : ruleBreakStatement EOF ;
    public final void entryRuleBreakStatement() throws RecognitionException {
        try {
            // InternalPortugolParser.g:527:1: ( ruleBreakStatement EOF )
            // InternalPortugolParser.g:528:1: ruleBreakStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBreakStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBreakStatement"


    // $ANTLR start "ruleBreakStatement"
    // InternalPortugolParser.g:535:1: ruleBreakStatement : ( ( rule__BreakStatement__Group__0 ) ) ;
    public final void ruleBreakStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:539:2: ( ( ( rule__BreakStatement__Group__0 ) ) )
            // InternalPortugolParser.g:540:2: ( ( rule__BreakStatement__Group__0 ) )
            {
            // InternalPortugolParser.g:540:2: ( ( rule__BreakStatement__Group__0 ) )
            // InternalPortugolParser.g:541:3: ( rule__BreakStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakStatementAccess().getGroup()); 
            }
            // InternalPortugolParser.g:542:3: ( rule__BreakStatement__Group__0 )
            // InternalPortugolParser.g:542:4: rule__BreakStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BreakStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakStatementAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleBreakStatement"


    // $ANTLR start "entryRuleReturnStatement"
    // InternalPortugolParser.g:551:1: entryRuleReturnStatement : ruleReturnStatement EOF ;
    public final void entryRuleReturnStatement() throws RecognitionException {
        try {
            // InternalPortugolParser.g:552:1: ( ruleReturnStatement EOF )
            // InternalPortugolParser.g:553:1: ruleReturnStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleReturnStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // InternalPortugolParser.g:560:1: ruleReturnStatement : ( ( rule__ReturnStatement__Group__0 ) ) ;
    public final void ruleReturnStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:564:2: ( ( ( rule__ReturnStatement__Group__0 ) ) )
            // InternalPortugolParser.g:565:2: ( ( rule__ReturnStatement__Group__0 ) )
            {
            // InternalPortugolParser.g:565:2: ( ( rule__ReturnStatement__Group__0 ) )
            // InternalPortugolParser.g:566:3: ( rule__ReturnStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getGroup()); 
            }
            // InternalPortugolParser.g:567:3: ( rule__ReturnStatement__Group__0 )
            // InternalPortugolParser.g:567:4: rule__ReturnStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReturnStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnStatementAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleIfStatement"
    // InternalPortugolParser.g:576:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalPortugolParser.g:577:1: ( ruleIfStatement EOF )
            // InternalPortugolParser.g:578:1: ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIfStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalPortugolParser.g:585:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:589:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalPortugolParser.g:590:2: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalPortugolParser.g:590:2: ( ( rule__IfStatement__Group__0 ) )
            // InternalPortugolParser.g:591:3: ( rule__IfStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup()); 
            }
            // InternalPortugolParser.g:592:3: ( rule__IfStatement__Group__0 )
            // InternalPortugolParser.g:592:4: rule__IfStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleSwitchCaseStatement"
    // InternalPortugolParser.g:601:1: entryRuleSwitchCaseStatement : ruleSwitchCaseStatement EOF ;
    public final void entryRuleSwitchCaseStatement() throws RecognitionException {
        try {
            // InternalPortugolParser.g:602:1: ( ruleSwitchCaseStatement EOF )
            // InternalPortugolParser.g:603:1: ruleSwitchCaseStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSwitchCaseStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSwitchCaseStatement"


    // $ANTLR start "ruleSwitchCaseStatement"
    // InternalPortugolParser.g:610:1: ruleSwitchCaseStatement : ( ( rule__SwitchCaseStatement__Group__0 ) ) ;
    public final void ruleSwitchCaseStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:614:2: ( ( ( rule__SwitchCaseStatement__Group__0 ) ) )
            // InternalPortugolParser.g:615:2: ( ( rule__SwitchCaseStatement__Group__0 ) )
            {
            // InternalPortugolParser.g:615:2: ( ( rule__SwitchCaseStatement__Group__0 ) )
            // InternalPortugolParser.g:616:3: ( rule__SwitchCaseStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getGroup()); 
            }
            // InternalPortugolParser.g:617:3: ( rule__SwitchCaseStatement__Group__0 )
            // InternalPortugolParser.g:617:4: rule__SwitchCaseStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SwitchCaseStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseStatementAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleSwitchCaseStatement"


    // $ANTLR start "entryRuleCaseList"
    // InternalPortugolParser.g:626:1: entryRuleCaseList : ruleCaseList EOF ;
    public final void entryRuleCaseList() throws RecognitionException {
        try {
            // InternalPortugolParser.g:627:1: ( ruleCaseList EOF )
            // InternalPortugolParser.g:628:1: ruleCaseList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCaseList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseListRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCaseList"


    // $ANTLR start "ruleCaseList"
    // InternalPortugolParser.g:635:1: ruleCaseList : ( ( rule__CaseList__Group__0 ) ) ;
    public final void ruleCaseList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:639:2: ( ( ( rule__CaseList__Group__0 ) ) )
            // InternalPortugolParser.g:640:2: ( ( rule__CaseList__Group__0 ) )
            {
            // InternalPortugolParser.g:640:2: ( ( rule__CaseList__Group__0 ) )
            // InternalPortugolParser.g:641:3: ( rule__CaseList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getGroup()); 
            }
            // InternalPortugolParser.g:642:3: ( rule__CaseList__Group__0 )
            // InternalPortugolParser.g:642:4: rule__CaseList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CaseList__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseListAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleCaseList"


    // $ANTLR start "entryRuleOtherCase"
    // InternalPortugolParser.g:651:1: entryRuleOtherCase : ruleOtherCase EOF ;
    public final void entryRuleOtherCase() throws RecognitionException {
        try {
            // InternalPortugolParser.g:652:1: ( ruleOtherCase EOF )
            // InternalPortugolParser.g:653:1: ruleOtherCase EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOtherCase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherCaseRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOtherCase"


    // $ANTLR start "ruleOtherCase"
    // InternalPortugolParser.g:660:1: ruleOtherCase : ( ( rule__OtherCase__Group__0 ) ) ;
    public final void ruleOtherCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:664:2: ( ( ( rule__OtherCase__Group__0 ) ) )
            // InternalPortugolParser.g:665:2: ( ( rule__OtherCase__Group__0 ) )
            {
            // InternalPortugolParser.g:665:2: ( ( rule__OtherCase__Group__0 ) )
            // InternalPortugolParser.g:666:3: ( rule__OtherCase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getGroup()); 
            }
            // InternalPortugolParser.g:667:3: ( rule__OtherCase__Group__0 )
            // InternalPortugolParser.g:667:4: rule__OtherCase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OtherCase__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherCaseAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleOtherCase"


    // $ANTLR start "entryRuleForStatement"
    // InternalPortugolParser.g:676:1: entryRuleForStatement : ruleForStatement EOF ;
    public final void entryRuleForStatement() throws RecognitionException {
        try {
            // InternalPortugolParser.g:677:1: ( ruleForStatement EOF )
            // InternalPortugolParser.g:678:1: ruleForStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleForStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleForStatement"


    // $ANTLR start "ruleForStatement"
    // InternalPortugolParser.g:685:1: ruleForStatement : ( ( rule__ForStatement__Group__0 ) ) ;
    public final void ruleForStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:689:2: ( ( ( rule__ForStatement__Group__0 ) ) )
            // InternalPortugolParser.g:690:2: ( ( rule__ForStatement__Group__0 ) )
            {
            // InternalPortugolParser.g:690:2: ( ( rule__ForStatement__Group__0 ) )
            // InternalPortugolParser.g:691:3: ( rule__ForStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getGroup()); 
            }
            // InternalPortugolParser.g:692:3: ( rule__ForStatement__Group__0 )
            // InternalPortugolParser.g:692:4: rule__ForStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleForStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalPortugolParser.g:701:1: entryRuleWhileStatement : ruleWhileStatement EOF ;
    public final void entryRuleWhileStatement() throws RecognitionException {
        try {
            // InternalPortugolParser.g:702:1: ( ruleWhileStatement EOF )
            // InternalPortugolParser.g:703:1: ruleWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWhileStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalPortugolParser.g:710:1: ruleWhileStatement : ( ( rule__WhileStatement__Group__0 ) ) ;
    public final void ruleWhileStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:714:2: ( ( ( rule__WhileStatement__Group__0 ) ) )
            // InternalPortugolParser.g:715:2: ( ( rule__WhileStatement__Group__0 ) )
            {
            // InternalPortugolParser.g:715:2: ( ( rule__WhileStatement__Group__0 ) )
            // InternalPortugolParser.g:716:3: ( rule__WhileStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getGroup()); 
            }
            // InternalPortugolParser.g:717:3: ( rule__WhileStatement__Group__0 )
            // InternalPortugolParser.g:717:4: rule__WhileStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleRepeatStatement"
    // InternalPortugolParser.g:726:1: entryRuleRepeatStatement : ruleRepeatStatement EOF ;
    public final void entryRuleRepeatStatement() throws RecognitionException {
        try {
            // InternalPortugolParser.g:727:1: ( ruleRepeatStatement EOF )
            // InternalPortugolParser.g:728:1: ruleRepeatStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRepeatStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRepeatStatement"


    // $ANTLR start "ruleRepeatStatement"
    // InternalPortugolParser.g:735:1: ruleRepeatStatement : ( ( rule__RepeatStatement__Group__0 ) ) ;
    public final void ruleRepeatStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:739:2: ( ( ( rule__RepeatStatement__Group__0 ) ) )
            // InternalPortugolParser.g:740:2: ( ( rule__RepeatStatement__Group__0 ) )
            {
            // InternalPortugolParser.g:740:2: ( ( rule__RepeatStatement__Group__0 ) )
            // InternalPortugolParser.g:741:3: ( rule__RepeatStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatStatementAccess().getGroup()); 
            }
            // InternalPortugolParser.g:742:3: ( rule__RepeatStatement__Group__0 )
            // InternalPortugolParser.g:742:4: rule__RepeatStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RepeatStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatStatementAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleRepeatStatement"


    // $ANTLR start "entryRuleSubprogramParam"
    // InternalPortugolParser.g:751:1: entryRuleSubprogramParam : ruleSubprogramParam EOF ;
    public final void entryRuleSubprogramParam() throws RecognitionException {
        try {
            // InternalPortugolParser.g:752:1: ( ruleSubprogramParam EOF )
            // InternalPortugolParser.g:753:1: ruleSubprogramParam EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSubprogramParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubprogramParamRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSubprogramParam"


    // $ANTLR start "ruleSubprogramParam"
    // InternalPortugolParser.g:760:1: ruleSubprogramParam : ( ( rule__SubprogramParam__Group__0 ) ) ;
    public final void ruleSubprogramParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:764:2: ( ( ( rule__SubprogramParam__Group__0 ) ) )
            // InternalPortugolParser.g:765:2: ( ( rule__SubprogramParam__Group__0 ) )
            {
            // InternalPortugolParser.g:765:2: ( ( rule__SubprogramParam__Group__0 ) )
            // InternalPortugolParser.g:766:3: ( rule__SubprogramParam__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamAccess().getGroup()); 
            }
            // InternalPortugolParser.g:767:3: ( rule__SubprogramParam__Group__0 )
            // InternalPortugolParser.g:767:4: rule__SubprogramParam__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubprogramParam__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubprogramParamAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleSubprogramParam"


    // $ANTLR start "entryRuleReadCommand"
    // InternalPortugolParser.g:776:1: entryRuleReadCommand : ruleReadCommand EOF ;
    public final void entryRuleReadCommand() throws RecognitionException {
        try {
            // InternalPortugolParser.g:777:1: ( ruleReadCommand EOF )
            // InternalPortugolParser.g:778:1: ruleReadCommand EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleReadCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReadCommandRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleReadCommand"


    // $ANTLR start "ruleReadCommand"
    // InternalPortugolParser.g:785:1: ruleReadCommand : ( ( rule__ReadCommand__Group__0 ) ) ;
    public final void ruleReadCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:789:2: ( ( ( rule__ReadCommand__Group__0 ) ) )
            // InternalPortugolParser.g:790:2: ( ( rule__ReadCommand__Group__0 ) )
            {
            // InternalPortugolParser.g:790:2: ( ( rule__ReadCommand__Group__0 ) )
            // InternalPortugolParser.g:791:3: ( rule__ReadCommand__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getGroup()); 
            }
            // InternalPortugolParser.g:792:3: ( rule__ReadCommand__Group__0 )
            // InternalPortugolParser.g:792:4: rule__ReadCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReadCommand__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReadCommandAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleReadCommand"


    // $ANTLR start "entryRuleWriteCommand"
    // InternalPortugolParser.g:801:1: entryRuleWriteCommand : ruleWriteCommand EOF ;
    public final void entryRuleWriteCommand() throws RecognitionException {
        try {
            // InternalPortugolParser.g:802:1: ( ruleWriteCommand EOF )
            // InternalPortugolParser.g:803:1: ruleWriteCommand EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWriteCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteCommandRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleWriteCommand"


    // $ANTLR start "ruleWriteCommand"
    // InternalPortugolParser.g:810:1: ruleWriteCommand : ( ( rule__WriteCommand__Group__0 ) ) ;
    public final void ruleWriteCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:814:2: ( ( ( rule__WriteCommand__Group__0 ) ) )
            // InternalPortugolParser.g:815:2: ( ( rule__WriteCommand__Group__0 ) )
            {
            // InternalPortugolParser.g:815:2: ( ( rule__WriteCommand__Group__0 ) )
            // InternalPortugolParser.g:816:3: ( rule__WriteCommand__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getGroup()); 
            }
            // InternalPortugolParser.g:817:3: ( rule__WriteCommand__Group__0 )
            // InternalPortugolParser.g:817:4: rule__WriteCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WriteCommand__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteCommandAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleWriteCommand"


    // $ANTLR start "entryRuleWriteParam"
    // InternalPortugolParser.g:826:1: entryRuleWriteParam : ruleWriteParam EOF ;
    public final void entryRuleWriteParam() throws RecognitionException {
        try {
            // InternalPortugolParser.g:827:1: ( ruleWriteParam EOF )
            // InternalPortugolParser.g:828:1: ruleWriteParam EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWriteParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteParamRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleWriteParam"


    // $ANTLR start "ruleWriteParam"
    // InternalPortugolParser.g:835:1: ruleWriteParam : ( ( rule__WriteParam__Group__0 ) ) ;
    public final void ruleWriteParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:839:2: ( ( ( rule__WriteParam__Group__0 ) ) )
            // InternalPortugolParser.g:840:2: ( ( rule__WriteParam__Group__0 ) )
            {
            // InternalPortugolParser.g:840:2: ( ( rule__WriteParam__Group__0 ) )
            // InternalPortugolParser.g:841:3: ( rule__WriteParam__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getGroup()); 
            }
            // InternalPortugolParser.g:842:3: ( rule__WriteParam__Group__0 )
            // InternalPortugolParser.g:842:4: rule__WriteParam__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WriteParam__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteParamAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleWriteParam"


    // $ANTLR start "entryRuleOptDecimalPrecision"
    // InternalPortugolParser.g:851:1: entryRuleOptDecimalPrecision : ruleOptDecimalPrecision EOF ;
    public final void entryRuleOptDecimalPrecision() throws RecognitionException {
        try {
            // InternalPortugolParser.g:852:1: ( ruleOptDecimalPrecision EOF )
            // InternalPortugolParser.g:853:1: ruleOptDecimalPrecision EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOptDecimalPrecision();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptDecimalPrecisionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOptDecimalPrecision"


    // $ANTLR start "ruleOptDecimalPrecision"
    // InternalPortugolParser.g:860:1: ruleOptDecimalPrecision : ( ( rule__OptDecimalPrecision__Group__0 ) ) ;
    public final void ruleOptDecimalPrecision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:864:2: ( ( ( rule__OptDecimalPrecision__Group__0 ) ) )
            // InternalPortugolParser.g:865:2: ( ( rule__OptDecimalPrecision__Group__0 ) )
            {
            // InternalPortugolParser.g:865:2: ( ( rule__OptDecimalPrecision__Group__0 ) )
            // InternalPortugolParser.g:866:3: ( rule__OptDecimalPrecision__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:867:3: ( rule__OptDecimalPrecision__Group__0 )
            // InternalPortugolParser.g:867:4: rule__OptDecimalPrecision__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OptDecimalPrecision__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptDecimalPrecisionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleOptDecimalPrecision"


    // $ANTLR start "entryRuleExpression"
    // InternalPortugolParser.g:876:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:877:1: ( ruleExpression EOF )
            // InternalPortugolParser.g:878:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalPortugolParser.g:885:1: ruleExpression : ( ruleAssignment ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:889:2: ( ( ruleAssignment ) )
            // InternalPortugolParser.g:890:2: ( ruleAssignment )
            {
            // InternalPortugolParser.g:890:2: ( ruleAssignment )
            // InternalPortugolParser.g:891:3: ruleAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAssignmentParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAssignmentParserRuleCall()); 
            }

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssignment"
    // InternalPortugolParser.g:901:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalPortugolParser.g:902:1: ( ruleAssignment EOF )
            // InternalPortugolParser.g:903:1: ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalPortugolParser.g:910:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:914:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalPortugolParser.g:915:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalPortugolParser.g:915:2: ( ( rule__Assignment__Group__0 ) )
            // InternalPortugolParser.g:916:3: ( rule__Assignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // InternalPortugolParser.g:917:3: ( rule__Assignment__Group__0 )
            // InternalPortugolParser.g:917:4: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleOrExpression"
    // InternalPortugolParser.g:926:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:927:1: ( ruleOrExpression EOF )
            // InternalPortugolParser.g:928:1: ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalPortugolParser.g:935:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:939:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalPortugolParser.g:940:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalPortugolParser.g:940:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalPortugolParser.g:941:3: ( rule__OrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:942:3: ( rule__OrExpression__Group__0 )
            // InternalPortugolParser.g:942:4: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleXorExpression"
    // InternalPortugolParser.g:951:1: entryRuleXorExpression : ruleXorExpression EOF ;
    public final void entryRuleXorExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:952:1: ( ruleXorExpression EOF )
            // InternalPortugolParser.g:953:1: ruleXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleXorExpression"


    // $ANTLR start "ruleXorExpression"
    // InternalPortugolParser.g:960:1: ruleXorExpression : ( ( rule__XorExpression__Group__0 ) ) ;
    public final void ruleXorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:964:2: ( ( ( rule__XorExpression__Group__0 ) ) )
            // InternalPortugolParser.g:965:2: ( ( rule__XorExpression__Group__0 ) )
            {
            // InternalPortugolParser.g:965:2: ( ( rule__XorExpression__Group__0 ) )
            // InternalPortugolParser.g:966:3: ( rule__XorExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:967:3: ( rule__XorExpression__Group__0 )
            // InternalPortugolParser.g:967:4: rule__XorExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalPortugolParser.g:976:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:977:1: ( ruleAndExpression EOF )
            // InternalPortugolParser.g:978:1: ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalPortugolParser.g:985:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:989:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalPortugolParser.g:990:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalPortugolParser.g:990:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalPortugolParser.g:991:3: ( rule__AndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:992:3: ( rule__AndExpression__Group__0 )
            // InternalPortugolParser.g:992:4: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleComparison"
    // InternalPortugolParser.g:1001:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1002:1: ( ruleComparison EOF )
            // InternalPortugolParser.g:1003:1: ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalPortugolParser.g:1010:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1014:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalPortugolParser.g:1015:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalPortugolParser.g:1015:2: ( ( rule__Comparison__Group__0 ) )
            // InternalPortugolParser.g:1016:3: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // InternalPortugolParser.g:1017:3: ( rule__Comparison__Group__0 )
            // InternalPortugolParser.g:1017:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleEquExpression"
    // InternalPortugolParser.g:1026:1: entryRuleEquExpression : ruleEquExpression EOF ;
    public final void entryRuleEquExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1027:1: ( ruleEquExpression EOF )
            // InternalPortugolParser.g:1028:1: ruleEquExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEquExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEquExpression"


    // $ANTLR start "ruleEquExpression"
    // InternalPortugolParser.g:1035:1: ruleEquExpression : ( ( rule__EquExpression__Group__0 ) ) ;
    public final void ruleEquExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1039:2: ( ( ( rule__EquExpression__Group__0 ) ) )
            // InternalPortugolParser.g:1040:2: ( ( rule__EquExpression__Group__0 ) )
            {
            // InternalPortugolParser.g:1040:2: ( ( rule__EquExpression__Group__0 ) )
            // InternalPortugolParser.g:1041:3: ( rule__EquExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:1042:3: ( rule__EquExpression__Group__0 )
            // InternalPortugolParser.g:1042:4: rule__EquExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EquExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleEquExpression"


    // $ANTLR start "entryRuleAddExpression"
    // InternalPortugolParser.g:1051:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1052:1: ( ruleAddExpression EOF )
            // InternalPortugolParser.g:1053:1: ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAddExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // InternalPortugolParser.g:1060:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1064:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // InternalPortugolParser.g:1065:2: ( ( rule__AddExpression__Group__0 ) )
            {
            // InternalPortugolParser.g:1065:2: ( ( rule__AddExpression__Group__0 ) )
            // InternalPortugolParser.g:1066:3: ( rule__AddExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:1067:3: ( rule__AddExpression__Group__0 )
            // InternalPortugolParser.g:1067:4: rule__AddExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalPortugolParser.g:1076:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1077:1: ( ruleMultiplicativeExpression EOF )
            // InternalPortugolParser.g:1078:1: ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalPortugolParser.g:1085:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1089:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // InternalPortugolParser.g:1090:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // InternalPortugolParser.g:1090:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // InternalPortugolParser.g:1091:3: ( rule__MultiplicativeExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:1092:3: ( rule__MultiplicativeExpression__Group__0 )
            // InternalPortugolParser.g:1092:4: rule__MultiplicativeExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRulePowerExpression"
    // InternalPortugolParser.g:1101:1: entryRulePowerExpression : rulePowerExpression EOF ;
    public final void entryRulePowerExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1102:1: ( rulePowerExpression EOF )
            // InternalPortugolParser.g:1103:1: rulePowerExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePowerExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePowerExpression"


    // $ANTLR start "rulePowerExpression"
    // InternalPortugolParser.g:1110:1: rulePowerExpression : ( ( rule__PowerExpression__Group__0 ) ) ;
    public final void rulePowerExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1114:2: ( ( ( rule__PowerExpression__Group__0 ) ) )
            // InternalPortugolParser.g:1115:2: ( ( rule__PowerExpression__Group__0 ) )
            {
            // InternalPortugolParser.g:1115:2: ( ( rule__PowerExpression__Group__0 ) )
            // InternalPortugolParser.g:1116:3: ( rule__PowerExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:1117:3: ( rule__PowerExpression__Group__0 )
            // InternalPortugolParser.g:1117:4: rule__PowerExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PowerExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "rulePowerExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalPortugolParser.g:1126:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1127:1: ( ruleUnaryExpression EOF )
            // InternalPortugolParser.g:1128:1: ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalPortugolParser.g:1135:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1139:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // InternalPortugolParser.g:1140:2: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // InternalPortugolParser.g:1140:2: ( ( rule__UnaryExpression__Alternatives ) )
            // InternalPortugolParser.g:1141:3: ( rule__UnaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            }
            // InternalPortugolParser.g:1142:3: ( rule__UnaryExpression__Alternatives )
            // InternalPortugolParser.g:1142:4: rule__UnaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalPortugolParser.g:1151:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1152:1: ( rulePrimaryExpression EOF )
            // InternalPortugolParser.g:1153:1: rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalPortugolParser.g:1160:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1164:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalPortugolParser.g:1165:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalPortugolParser.g:1165:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalPortugolParser.g:1166:3: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // InternalPortugolParser.g:1167:3: ( rule__PrimaryExpression__Alternatives )
            // InternalPortugolParser.g:1167:4: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRulePreDefinedFunctionCall"
    // InternalPortugolParser.g:1176:1: entryRulePreDefinedFunctionCall : rulePreDefinedFunctionCall EOF ;
    public final void entryRulePreDefinedFunctionCall() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1177:1: ( rulePreDefinedFunctionCall EOF )
            // InternalPortugolParser.g:1178:1: rulePreDefinedFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreDefinedFunctionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePreDefinedFunctionCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreDefinedFunctionCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePreDefinedFunctionCall"


    // $ANTLR start "rulePreDefinedFunctionCall"
    // InternalPortugolParser.g:1185:1: rulePreDefinedFunctionCall : ( ( rule__PreDefinedFunctionCall__Group__0 ) ) ;
    public final void rulePreDefinedFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1189:2: ( ( ( rule__PreDefinedFunctionCall__Group__0 ) ) )
            // InternalPortugolParser.g:1190:2: ( ( rule__PreDefinedFunctionCall__Group__0 ) )
            {
            // InternalPortugolParser.g:1190:2: ( ( rule__PreDefinedFunctionCall__Group__0 ) )
            // InternalPortugolParser.g:1191:3: ( rule__PreDefinedFunctionCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreDefinedFunctionCallAccess().getGroup()); 
            }
            // InternalPortugolParser.g:1192:3: ( rule__PreDefinedFunctionCall__Group__0 )
            // InternalPortugolParser.g:1192:4: rule__PreDefinedFunctionCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PreDefinedFunctionCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreDefinedFunctionCallAccess().getGroup()); 
            }

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
    // $ANTLR end "rulePreDefinedFunctionCall"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalPortugolParser.g:1201:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1202:1: ( ruleFunctionCall EOF )
            // InternalPortugolParser.g:1203:1: ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFunctionCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalPortugolParser.g:1210:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1214:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalPortugolParser.g:1215:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalPortugolParser.g:1215:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalPortugolParser.g:1216:3: ( rule__FunctionCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup()); 
            }
            // InternalPortugolParser.g:1217:3: ( rule__FunctionCall__Group__0 )
            // InternalPortugolParser.g:1217:4: rule__FunctionCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRulePredefineFunctions"
    // InternalPortugolParser.g:1226:1: entryRulePredefineFunctions : rulePredefineFunctions EOF ;
    public final void entryRulePredefineFunctions() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1227:1: ( rulePredefineFunctions EOF )
            // InternalPortugolParser.g:1228:1: rulePredefineFunctions EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredefineFunctionsRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePredefineFunctions();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredefineFunctionsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePredefineFunctions"


    // $ANTLR start "rulePredefineFunctions"
    // InternalPortugolParser.g:1235:1: rulePredefineFunctions : ( ( rule__PredefineFunctions__Alternatives ) ) ;
    public final void rulePredefineFunctions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1239:2: ( ( ( rule__PredefineFunctions__Alternatives ) ) )
            // InternalPortugolParser.g:1240:2: ( ( rule__PredefineFunctions__Alternatives ) )
            {
            // InternalPortugolParser.g:1240:2: ( ( rule__PredefineFunctions__Alternatives ) )
            // InternalPortugolParser.g:1241:3: ( rule__PredefineFunctions__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredefineFunctionsAccess().getAlternatives()); 
            }
            // InternalPortugolParser.g:1242:3: ( rule__PredefineFunctions__Alternatives )
            // InternalPortugolParser.g:1242:4: rule__PredefineFunctions__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PredefineFunctions__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredefineFunctionsAccess().getAlternatives()); 
            }

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
    // $ANTLR end "rulePredefineFunctions"


    // $ANTLR start "entryRuleLiteral"
    // InternalPortugolParser.g:1251:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1252:1: ( ruleLiteral EOF )
            // InternalPortugolParser.g:1253:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalPortugolParser.g:1260:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1264:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalPortugolParser.g:1265:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalPortugolParser.g:1265:2: ( ( rule__Literal__Alternatives ) )
            // InternalPortugolParser.g:1266:3: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalPortugolParser.g:1267:3: ( rule__Literal__Alternatives )
            // InternalPortugolParser.g:1267:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleDeclaredVar"
    // InternalPortugolParser.g:1276:1: entryRuleDeclaredVar : ruleDeclaredVar EOF ;
    public final void entryRuleDeclaredVar() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1277:1: ( ruleDeclaredVar EOF )
            // InternalPortugolParser.g:1278:1: ruleDeclaredVar EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDeclaredVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredVarRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDeclaredVar"


    // $ANTLR start "ruleDeclaredVar"
    // InternalPortugolParser.g:1285:1: ruleDeclaredVar : ( ( rule__DeclaredVar__VarNameAssignment ) ) ;
    public final void ruleDeclaredVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1289:2: ( ( ( rule__DeclaredVar__VarNameAssignment ) ) )
            // InternalPortugolParser.g:1290:2: ( ( rule__DeclaredVar__VarNameAssignment ) )
            {
            // InternalPortugolParser.g:1290:2: ( ( rule__DeclaredVar__VarNameAssignment ) )
            // InternalPortugolParser.g:1291:3: ( rule__DeclaredVar__VarNameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getVarNameAssignment()); 
            }
            // InternalPortugolParser.g:1292:3: ( rule__DeclaredVar__VarNameAssignment )
            // InternalPortugolParser.g:1292:4: rule__DeclaredVar__VarNameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredVar__VarNameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredVarAccess().getVarNameAssignment()); 
            }

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
    // $ANTLR end "ruleDeclaredVar"


    // $ANTLR start "entryRuleNumericLiteral"
    // InternalPortugolParser.g:1301:1: entryRuleNumericLiteral : ruleNumericLiteral EOF ;
    public final void entryRuleNumericLiteral() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1302:1: ( ruleNumericLiteral EOF )
            // InternalPortugolParser.g:1303:1: ruleNumericLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNumericLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNumericLiteral"


    // $ANTLR start "ruleNumericLiteral"
    // InternalPortugolParser.g:1310:1: ruleNumericLiteral : ( ( rule__NumericLiteral__Alternatives ) ) ;
    public final void ruleNumericLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1314:2: ( ( ( rule__NumericLiteral__Alternatives ) ) )
            // InternalPortugolParser.g:1315:2: ( ( rule__NumericLiteral__Alternatives ) )
            {
            // InternalPortugolParser.g:1315:2: ( ( rule__NumericLiteral__Alternatives ) )
            // InternalPortugolParser.g:1316:3: ( rule__NumericLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericLiteralAccess().getAlternatives()); 
            }
            // InternalPortugolParser.g:1317:3: ( rule__NumericLiteral__Alternatives )
            // InternalPortugolParser.g:1317:4: rule__NumericLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NumericLiteral__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericLiteralAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleNumericLiteral"


    // $ANTLR start "entryRuleStringExpression"
    // InternalPortugolParser.g:1326:1: entryRuleStringExpression : ruleStringExpression EOF ;
    public final void entryRuleStringExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1327:1: ( ruleStringExpression EOF )
            // InternalPortugolParser.g:1328:1: ruleStringExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStringExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStringExpression"


    // $ANTLR start "ruleStringExpression"
    // InternalPortugolParser.g:1335:1: ruleStringExpression : ( ( rule__StringExpression__LiteralStringAssignment ) ) ;
    public final void ruleStringExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1339:2: ( ( ( rule__StringExpression__LiteralStringAssignment ) ) )
            // InternalPortugolParser.g:1340:2: ( ( rule__StringExpression__LiteralStringAssignment ) )
            {
            // InternalPortugolParser.g:1340:2: ( ( rule__StringExpression__LiteralStringAssignment ) )
            // InternalPortugolParser.g:1341:3: ( rule__StringExpression__LiteralStringAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringExpressionAccess().getLiteralStringAssignment()); 
            }
            // InternalPortugolParser.g:1342:3: ( rule__StringExpression__LiteralStringAssignment )
            // InternalPortugolParser.g:1342:4: rule__StringExpression__LiteralStringAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringExpression__LiteralStringAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringExpressionAccess().getLiteralStringAssignment()); 
            }

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
    // $ANTLR end "ruleStringExpression"


    // $ANTLR start "entryRulePiLiteral"
    // InternalPortugolParser.g:1351:1: entryRulePiLiteral : rulePiLiteral EOF ;
    public final void entryRulePiLiteral() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1352:1: ( rulePiLiteral EOF )
            // InternalPortugolParser.g:1353:1: rulePiLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPiLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePiLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPiLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePiLiteral"


    // $ANTLR start "rulePiLiteral"
    // InternalPortugolParser.g:1360:1: rulePiLiteral : ( Pi ) ;
    public final void rulePiLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1364:2: ( ( Pi ) )
            // InternalPortugolParser.g:1365:2: ( Pi )
            {
            // InternalPortugolParser.g:1365:2: ( Pi )
            // InternalPortugolParser.g:1366:3: Pi
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPiLiteralAccess().getPiKeyword()); 
            }
            match(input,Pi,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPiLiteralAccess().getPiKeyword()); 
            }

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
    // $ANTLR end "rulePiLiteral"


    // $ANTLR start "entryRuleEND_COMMAND"
    // InternalPortugolParser.g:1376:1: entryRuleEND_COMMAND : ruleEND_COMMAND EOF ;
    public final void entryRuleEND_COMMAND() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1377:1: ( ruleEND_COMMAND EOF )
            // InternalPortugolParser.g:1378:1: ruleEND_COMMAND EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEND_COMMANDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEND_COMMAND();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEND_COMMANDRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEND_COMMAND"


    // $ANTLR start "ruleEND_COMMAND"
    // InternalPortugolParser.g:1385:1: ruleEND_COMMAND : ( Semicolon ) ;
    public final void ruleEND_COMMAND() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1389:2: ( ( Semicolon ) )
            // InternalPortugolParser.g:1390:2: ( Semicolon )
            {
            // InternalPortugolParser.g:1390:2: ( Semicolon )
            // InternalPortugolParser.g:1391:3: Semicolon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEND_COMMANDAccess().getSemicolonKeyword()); 
            }
            match(input,Semicolon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEND_COMMANDAccess().getSemicolonKeyword()); 
            }

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
    // $ANTLR end "ruleEND_COMMAND"


    // $ANTLR start "rule__VarType__TypeNameAlternatives_0"
    // InternalPortugolParser.g:1400:1: rule__VarType__TypeNameAlternatives_0 : ( ( Real ) | ( Inteiro ) | ( Caractere ) | ( Caracter ) );
    public final void rule__VarType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1404:1: ( ( Real ) | ( Inteiro ) | ( Caractere ) | ( Caracter ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case Real:
                {
                alt2=1;
                }
                break;
            case Inteiro:
                {
                alt2=2;
                }
                break;
            case Caractere:
                {
                alt2=3;
                }
                break;
            case Caracter:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPortugolParser.g:1405:2: ( Real )
                    {
                    // InternalPortugolParser.g:1405:2: ( Real )
                    // InternalPortugolParser.g:1406:3: Real
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarTypeAccess().getTypeNameRealKeyword_0_0()); 
                    }
                    match(input,Real,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarTypeAccess().getTypeNameRealKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:1411:2: ( Inteiro )
                    {
                    // InternalPortugolParser.g:1411:2: ( Inteiro )
                    // InternalPortugolParser.g:1412:3: Inteiro
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarTypeAccess().getTypeNameInteiroKeyword_0_1()); 
                    }
                    match(input,Inteiro,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarTypeAccess().getTypeNameInteiroKeyword_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPortugolParser.g:1417:2: ( Caractere )
                    {
                    // InternalPortugolParser.g:1417:2: ( Caractere )
                    // InternalPortugolParser.g:1418:3: Caractere
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarTypeAccess().getTypeNameCaractereKeyword_0_2()); 
                    }
                    match(input,Caractere,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarTypeAccess().getTypeNameCaractereKeyword_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPortugolParser.g:1423:2: ( Caracter )
                    {
                    // InternalPortugolParser.g:1423:2: ( Caracter )
                    // InternalPortugolParser.g:1424:3: Caracter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarTypeAccess().getTypeNameCaracterKeyword_0_3()); 
                    }
                    match(input,Caracter,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarTypeAccess().getTypeNameCaracterKeyword_0_3()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__VarType__TypeNameAlternatives_0"


    // $ANTLR start "rule__BlockSubPrograms__Alternatives"
    // InternalPortugolParser.g:1433:1: rule__BlockSubPrograms__Alternatives : ( ( ruleBlockFunction ) | ( ruleBlockProcedure ) );
    public final void rule__BlockSubPrograms__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1437:1: ( ( ruleBlockFunction ) | ( ruleBlockProcedure ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Funcao) ) {
                alt3=1;
            }
            else if ( (LA3_0==Procedimento) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPortugolParser.g:1438:2: ( ruleBlockFunction )
                    {
                    // InternalPortugolParser.g:1438:2: ( ruleBlockFunction )
                    // InternalPortugolParser.g:1439:3: ruleBlockFunction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockSubProgramsAccess().getBlockFunctionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBlockFunction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockSubProgramsAccess().getBlockFunctionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:1444:2: ( ruleBlockProcedure )
                    {
                    // InternalPortugolParser.g:1444:2: ( ruleBlockProcedure )
                    // InternalPortugolParser.g:1445:3: ruleBlockProcedure
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBlockSubProgramsAccess().getBlockProcedureParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBlockProcedure();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBlockSubProgramsAccess().getBlockProcedureParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__BlockSubPrograms__Alternatives"


    // $ANTLR start "rule__AbstractCommand__Alternatives"
    // InternalPortugolParser.g:1454:1: rule__AbstractCommand__Alternatives : ( ( ( rule__AbstractCommand__Group_0__0 ) ) | ( ( rule__AbstractCommand__Group_1__0 ) ) | ( ( rule__AbstractCommand__Group_2__0 ) ) | ( ruleIfStatement ) | ( ruleSwitchCaseStatement ) | ( ruleForStatement ) | ( ruleRepeatStatement ) | ( ruleWhileStatement ) | ( ( rule__AbstractCommand__Group_8__0 ) ) | ( ( rule__AbstractCommand__Group_9__0 ) ) );
    public final void rule__AbstractCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1458:1: ( ( ( rule__AbstractCommand__Group_0__0 ) ) | ( ( rule__AbstractCommand__Group_1__0 ) ) | ( ( rule__AbstractCommand__Group_2__0 ) ) | ( ruleIfStatement ) | ( ruleSwitchCaseStatement ) | ( ruleForStatement ) | ( ruleRepeatStatement ) | ( ruleWhileStatement ) | ( ( rule__AbstractCommand__Group_8__0 ) ) | ( ( rule__AbstractCommand__Group_9__0 ) ) )
            int alt4=10;
            switch ( input.LA(1) ) {
            case Leia:
                {
                alt4=1;
                }
                break;
            case Escreval:
            case Escreva:
                {
                alt4=2;
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
                alt4=3;
                }
                break;
            case Se:
                {
                alt4=4;
                }
                break;
            case Escolha:
                {
                alt4=5;
                }
                break;
            case Para:
                {
                alt4=6;
                }
                break;
            case Repita:
                {
                alt4=7;
                }
                break;
            case Enquanto:
                {
                alt4=8;
                }
                break;
            case Interrompa:
                {
                alt4=9;
                }
                break;
            case Retorne:
                {
                alt4=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalPortugolParser.g:1459:2: ( ( rule__AbstractCommand__Group_0__0 ) )
                    {
                    // InternalPortugolParser.g:1459:2: ( ( rule__AbstractCommand__Group_0__0 ) )
                    // InternalPortugolParser.g:1460:3: ( rule__AbstractCommand__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_0()); 
                    }
                    // InternalPortugolParser.g:1461:3: ( rule__AbstractCommand__Group_0__0 )
                    // InternalPortugolParser.g:1461:4: rule__AbstractCommand__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractCommand__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractCommandAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:1465:2: ( ( rule__AbstractCommand__Group_1__0 ) )
                    {
                    // InternalPortugolParser.g:1465:2: ( ( rule__AbstractCommand__Group_1__0 ) )
                    // InternalPortugolParser.g:1466:3: ( rule__AbstractCommand__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_1()); 
                    }
                    // InternalPortugolParser.g:1467:3: ( rule__AbstractCommand__Group_1__0 )
                    // InternalPortugolParser.g:1467:4: rule__AbstractCommand__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractCommand__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractCommandAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPortugolParser.g:1471:2: ( ( rule__AbstractCommand__Group_2__0 ) )
                    {
                    // InternalPortugolParser.g:1471:2: ( ( rule__AbstractCommand__Group_2__0 ) )
                    // InternalPortugolParser.g:1472:3: ( rule__AbstractCommand__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_2()); 
                    }
                    // InternalPortugolParser.g:1473:3: ( rule__AbstractCommand__Group_2__0 )
                    // InternalPortugolParser.g:1473:4: rule__AbstractCommand__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractCommand__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractCommandAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPortugolParser.g:1477:2: ( ruleIfStatement )
                    {
                    // InternalPortugolParser.g:1477:2: ( ruleIfStatement )
                    // InternalPortugolParser.g:1478:3: ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getIfStatementParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractCommandAccess().getIfStatementParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPortugolParser.g:1483:2: ( ruleSwitchCaseStatement )
                    {
                    // InternalPortugolParser.g:1483:2: ( ruleSwitchCaseStatement )
                    // InternalPortugolParser.g:1484:3: ruleSwitchCaseStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getSwitchCaseStatementParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSwitchCaseStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractCommandAccess().getSwitchCaseStatementParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalPortugolParser.g:1489:2: ( ruleForStatement )
                    {
                    // InternalPortugolParser.g:1489:2: ( ruleForStatement )
                    // InternalPortugolParser.g:1490:3: ruleForStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getForStatementParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleForStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractCommandAccess().getForStatementParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalPortugolParser.g:1495:2: ( ruleRepeatStatement )
                    {
                    // InternalPortugolParser.g:1495:2: ( ruleRepeatStatement )
                    // InternalPortugolParser.g:1496:3: ruleRepeatStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getRepeatStatementParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRepeatStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractCommandAccess().getRepeatStatementParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalPortugolParser.g:1501:2: ( ruleWhileStatement )
                    {
                    // InternalPortugolParser.g:1501:2: ( ruleWhileStatement )
                    // InternalPortugolParser.g:1502:3: ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getWhileStatementParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleWhileStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractCommandAccess().getWhileStatementParserRuleCall_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalPortugolParser.g:1507:2: ( ( rule__AbstractCommand__Group_8__0 ) )
                    {
                    // InternalPortugolParser.g:1507:2: ( ( rule__AbstractCommand__Group_8__0 ) )
                    // InternalPortugolParser.g:1508:3: ( rule__AbstractCommand__Group_8__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_8()); 
                    }
                    // InternalPortugolParser.g:1509:3: ( rule__AbstractCommand__Group_8__0 )
                    // InternalPortugolParser.g:1509:4: rule__AbstractCommand__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractCommand__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractCommandAccess().getGroup_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalPortugolParser.g:1513:2: ( ( rule__AbstractCommand__Group_9__0 ) )
                    {
                    // InternalPortugolParser.g:1513:2: ( ( rule__AbstractCommand__Group_9__0 ) )
                    // InternalPortugolParser.g:1514:3: ( rule__AbstractCommand__Group_9__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_9()); 
                    }
                    // InternalPortugolParser.g:1515:3: ( rule__AbstractCommand__Group_9__0 )
                    // InternalPortugolParser.g:1515:4: rule__AbstractCommand__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractCommand__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractCommandAccess().getGroup_9()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__AbstractCommand__Alternatives"


    // $ANTLR start "rule__WriteCommand__WriteCommandAlternatives_0_0"
    // InternalPortugolParser.g:1523:1: rule__WriteCommand__WriteCommandAlternatives_0_0 : ( ( Escreva ) | ( Escreval ) );
    public final void rule__WriteCommand__WriteCommandAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1527:1: ( ( Escreva ) | ( Escreval ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Escreva) ) {
                alt5=1;
            }
            else if ( (LA5_0==Escreval) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPortugolParser.g:1528:2: ( Escreva )
                    {
                    // InternalPortugolParser.g:1528:2: ( Escreva )
                    // InternalPortugolParser.g:1529:3: Escreva
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWriteCommandAccess().getWriteCommandEscrevaKeyword_0_0_0()); 
                    }
                    match(input,Escreva,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWriteCommandAccess().getWriteCommandEscrevaKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:1534:2: ( Escreval )
                    {
                    // InternalPortugolParser.g:1534:2: ( Escreval )
                    // InternalPortugolParser.g:1535:3: Escreval
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWriteCommandAccess().getWriteCommandEscrevalKeyword_0_0_1()); 
                    }
                    match(input,Escreval,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWriteCommandAccess().getWriteCommandEscrevalKeyword_0_0_1()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__WriteCommand__WriteCommandAlternatives_0_0"


    // $ANTLR start "rule__AndExpression__OpAlternatives_1_0_0_1_0"
    // InternalPortugolParser.g:1544:1: rule__AndExpression__OpAlternatives_1_0_0_1_0 : ( ( Ampersand ) | ( E ) );
    public final void rule__AndExpression__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1548:1: ( ( Ampersand ) | ( E ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Ampersand) ) {
                alt6=1;
            }
            else if ( (LA6_0==E) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPortugolParser.g:1549:2: ( Ampersand )
                    {
                    // InternalPortugolParser.g:1549:2: ( Ampersand )
                    // InternalPortugolParser.g:1550:3: Ampersand
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndExpressionAccess().getOpAmpersandKeyword_1_0_0_1_0_0()); 
                    }
                    match(input,Ampersand,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAndExpressionAccess().getOpAmpersandKeyword_1_0_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:1555:2: ( E )
                    {
                    // InternalPortugolParser.g:1555:2: ( E )
                    // InternalPortugolParser.g:1556:3: E
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndExpressionAccess().getOpEKeyword_1_0_0_1_0_1()); 
                    }
                    match(input,E,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAndExpressionAccess().getOpEKeyword_1_0_0_1_0_1()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__AndExpression__OpAlternatives_1_0_0_1_0"


    // $ANTLR start "rule__Comparison__OpAlternatives_1_0_0_1_0"
    // InternalPortugolParser.g:1565:1: rule__Comparison__OpAlternatives_1_0_0_1_0 : ( ( EqualsSign ) | ( LessThanSignGreaterThanSign ) );
    public final void rule__Comparison__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1569:1: ( ( EqualsSign ) | ( LessThanSignGreaterThanSign ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EqualsSign) ) {
                alt7=1;
            }
            else if ( (LA7_0==LessThanSignGreaterThanSign) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPortugolParser.g:1570:2: ( EqualsSign )
                    {
                    // InternalPortugolParser.g:1570:2: ( EqualsSign )
                    // InternalPortugolParser.g:1571:3: EqualsSign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getOpEqualsSignKeyword_1_0_0_1_0_0()); 
                    }
                    match(input,EqualsSign,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getOpEqualsSignKeyword_1_0_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:1576:2: ( LessThanSignGreaterThanSign )
                    {
                    // InternalPortugolParser.g:1576:2: ( LessThanSignGreaterThanSign )
                    // InternalPortugolParser.g:1577:3: LessThanSignGreaterThanSign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getOpLessThanSignGreaterThanSignKeyword_1_0_0_1_0_1()); 
                    }
                    match(input,LessThanSignGreaterThanSign,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getOpLessThanSignGreaterThanSignKeyword_1_0_0_1_0_1()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Comparison__OpAlternatives_1_0_0_1_0"


    // $ANTLR start "rule__EquExpression__OpAlternatives_1_0_0_1_0"
    // InternalPortugolParser.g:1586:1: rule__EquExpression__OpAlternatives_1_0_0_1_0 : ( ( LessThanSign ) | ( GreaterThanSign ) | ( LessThanSignEqualsSign ) | ( GreaterThanSignEqualsSign ) );
    public final void rule__EquExpression__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1590:1: ( ( LessThanSign ) | ( GreaterThanSign ) | ( LessThanSignEqualsSign ) | ( GreaterThanSignEqualsSign ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case LessThanSign:
                {
                alt8=1;
                }
                break;
            case GreaterThanSign:
                {
                alt8=2;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt8=3;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalPortugolParser.g:1591:2: ( LessThanSign )
                    {
                    // InternalPortugolParser.g:1591:2: ( LessThanSign )
                    // InternalPortugolParser.g:1592:3: LessThanSign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEquExpressionAccess().getOpLessThanSignKeyword_1_0_0_1_0_0()); 
                    }
                    match(input,LessThanSign,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEquExpressionAccess().getOpLessThanSignKeyword_1_0_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:1597:2: ( GreaterThanSign )
                    {
                    // InternalPortugolParser.g:1597:2: ( GreaterThanSign )
                    // InternalPortugolParser.g:1598:3: GreaterThanSign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEquExpressionAccess().getOpGreaterThanSignKeyword_1_0_0_1_0_1()); 
                    }
                    match(input,GreaterThanSign,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEquExpressionAccess().getOpGreaterThanSignKeyword_1_0_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPortugolParser.g:1603:2: ( LessThanSignEqualsSign )
                    {
                    // InternalPortugolParser.g:1603:2: ( LessThanSignEqualsSign )
                    // InternalPortugolParser.g:1604:3: LessThanSignEqualsSign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEquExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_0_0_1_0_2()); 
                    }
                    match(input,LessThanSignEqualsSign,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEquExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_0_0_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPortugolParser.g:1609:2: ( GreaterThanSignEqualsSign )
                    {
                    // InternalPortugolParser.g:1609:2: ( GreaterThanSignEqualsSign )
                    // InternalPortugolParser.g:1610:3: GreaterThanSignEqualsSign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEquExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_0_1_0_3()); 
                    }
                    match(input,GreaterThanSignEqualsSign,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEquExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_0_1_0_3()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__EquExpression__OpAlternatives_1_0_0_1_0"


    // $ANTLR start "rule__AddExpression__OpAlternatives_1_0_0_1_0"
    // InternalPortugolParser.g:1619:1: rule__AddExpression__OpAlternatives_1_0_0_1_0 : ( ( PlusSign ) | ( HyphenMinus ) );
    public final void rule__AddExpression__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1623:1: ( ( PlusSign ) | ( HyphenMinus ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==PlusSign) ) {
                alt9=1;
            }
            else if ( (LA9_0==HyphenMinus) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPortugolParser.g:1624:2: ( PlusSign )
                    {
                    // InternalPortugolParser.g:1624:2: ( PlusSign )
                    // InternalPortugolParser.g:1625:3: PlusSign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddExpressionAccess().getOpPlusSignKeyword_1_0_0_1_0_0()); 
                    }
                    match(input,PlusSign,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAddExpressionAccess().getOpPlusSignKeyword_1_0_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:1630:2: ( HyphenMinus )
                    {
                    // InternalPortugolParser.g:1630:2: ( HyphenMinus )
                    // InternalPortugolParser.g:1631:3: HyphenMinus
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddExpressionAccess().getOpHyphenMinusKeyword_1_0_0_1_0_1()); 
                    }
                    match(input,HyphenMinus,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAddExpressionAccess().getOpHyphenMinusKeyword_1_0_0_1_0_1()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__AddExpression__OpAlternatives_1_0_0_1_0"


    // $ANTLR start "rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0"
    // InternalPortugolParser.g:1640:1: rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 : ( ( Asterisk ) | ( Solidus ) | ( MOD ) | ( PercentSign ) );
    public final void rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1644:1: ( ( Asterisk ) | ( Solidus ) | ( MOD ) | ( PercentSign ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case Asterisk:
                {
                alt10=1;
                }
                break;
            case Solidus:
                {
                alt10=2;
                }
                break;
            case MOD:
                {
                alt10=3;
                }
                break;
            case PercentSign:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalPortugolParser.g:1645:2: ( Asterisk )
                    {
                    // InternalPortugolParser.g:1645:2: ( Asterisk )
                    // InternalPortugolParser.g:1646:3: Asterisk
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeExpressionAccess().getOpAsteriskKeyword_1_0_0_1_0_0()); 
                    }
                    match(input,Asterisk,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeExpressionAccess().getOpAsteriskKeyword_1_0_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:1651:2: ( Solidus )
                    {
                    // InternalPortugolParser.g:1651:2: ( Solidus )
                    // InternalPortugolParser.g:1652:3: Solidus
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeExpressionAccess().getOpSolidusKeyword_1_0_0_1_0_1()); 
                    }
                    match(input,Solidus,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeExpressionAccess().getOpSolidusKeyword_1_0_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPortugolParser.g:1657:2: ( MOD )
                    {
                    // InternalPortugolParser.g:1657:2: ( MOD )
                    // InternalPortugolParser.g:1658:3: MOD
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeExpressionAccess().getOpMODKeyword_1_0_0_1_0_2()); 
                    }
                    match(input,MOD,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeExpressionAccess().getOpMODKeyword_1_0_0_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPortugolParser.g:1663:2: ( PercentSign )
                    {
                    // InternalPortugolParser.g:1663:2: ( PercentSign )
                    // InternalPortugolParser.g:1664:3: PercentSign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeExpressionAccess().getOpPercentSignKeyword_1_0_0_1_0_3()); 
                    }
                    match(input,PercentSign,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeExpressionAccess().getOpPercentSignKeyword_1_0_0_1_0_3()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0"


    // $ANTLR start "rule__UnaryExpression__Alternatives"
    // InternalPortugolParser.g:1673:1: rule__UnaryExpression__Alternatives : ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( rulePrimaryExpression ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1677:1: ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( rulePrimaryExpression ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==NOT||LA11_0==HyphenMinus) ) {
                alt11=1;
            }
            else if ( (LA11_0==Maiusc||(LA11_0>=Compr && LA11_0<=Copia)||LA11_0==Raizq||LA11_0==Pi||LA11_0==LeftParenthesis||(LA11_0>=RULE_INT && LA11_0<=RULE_STRING)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalPortugolParser.g:1678:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    {
                    // InternalPortugolParser.g:1678:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    // InternalPortugolParser.g:1679:3: ( rule__UnaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    }
                    // InternalPortugolParser.g:1680:3: ( rule__UnaryExpression__Group_0__0 )
                    // InternalPortugolParser.g:1680:4: rule__UnaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:1684:2: ( rulePrimaryExpression )
                    {
                    // InternalPortugolParser.g:1684:2: ( rulePrimaryExpression )
                    // InternalPortugolParser.g:1685:3: rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__UnaryExpression__Alternatives"


    // $ANTLR start "rule__UnaryExpression__OpAlternatives_0_1_0"
    // InternalPortugolParser.g:1694:1: rule__UnaryExpression__OpAlternatives_0_1_0 : ( ( NOT ) | ( HyphenMinus ) );
    public final void rule__UnaryExpression__OpAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1698:1: ( ( NOT ) | ( HyphenMinus ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==NOT) ) {
                alt12=1;
            }
            else if ( (LA12_0==HyphenMinus) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalPortugolParser.g:1699:2: ( NOT )
                    {
                    // InternalPortugolParser.g:1699:2: ( NOT )
                    // InternalPortugolParser.g:1700:3: NOT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getOpNOTKeyword_0_1_0_0()); 
                    }
                    match(input,NOT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExpressionAccess().getOpNOTKeyword_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:1705:2: ( HyphenMinus )
                    {
                    // InternalPortugolParser.g:1705:2: ( HyphenMinus )
                    // InternalPortugolParser.g:1706:3: HyphenMinus
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getOpHyphenMinusKeyword_0_1_0_1()); 
                    }
                    match(input,HyphenMinus,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExpressionAccess().getOpHyphenMinusKeyword_0_1_0_1()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__UnaryExpression__OpAlternatives_0_1_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalPortugolParser.g:1715:1: rule__PrimaryExpression__Alternatives : ( ( ruleLiteral ) | ( rulePreDefinedFunctionCall ) | ( ruleFunctionCall ) | ( ruleDeclaredVar ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1719:1: ( ( ruleLiteral ) | ( rulePreDefinedFunctionCall ) | ( ruleFunctionCall ) | ( ruleDeclaredVar ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case Pi:
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_STRING:
                {
                alt13=1;
                }
                break;
            case Maiusc:
            case Compr:
            case Copia:
            case Raizq:
                {
                alt13=2;
                }
                break;
            case RULE_ID:
                {
                int LA13_3 = input.LA(2);

                if ( (LA13_3==LeftParenthesis) ) {
                    alt13=3;
                }
                else if ( (LA13_3==EOF||LA13_3==Entao||LA13_3==Passo||LA13_3==Faca||LA13_3==MOD||(LA13_3>=XOU && LA13_3<=Ate)||(LA13_3>=LessThanSignHyphenMinus && LA13_3<=De)||(LA13_3>=PercentSign && LA13_3<=Ampersand)||(LA13_3>=RightParenthesis && LA13_3<=CircumflexAccent)) ) {
                    alt13=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;
                }
                }
                break;
            case LeftParenthesis:
                {
                alt13=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalPortugolParser.g:1720:2: ( ruleLiteral )
                    {
                    // InternalPortugolParser.g:1720:2: ( ruleLiteral )
                    // InternalPortugolParser.g:1721:3: ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:1726:2: ( rulePreDefinedFunctionCall )
                    {
                    // InternalPortugolParser.g:1726:2: ( rulePreDefinedFunctionCall )
                    // InternalPortugolParser.g:1727:3: rulePreDefinedFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getPreDefinedFunctionCallParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePreDefinedFunctionCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getPreDefinedFunctionCallParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPortugolParser.g:1732:2: ( ruleFunctionCall )
                    {
                    // InternalPortugolParser.g:1732:2: ( ruleFunctionCall )
                    // InternalPortugolParser.g:1733:3: ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPortugolParser.g:1738:2: ( ruleDeclaredVar )
                    {
                    // InternalPortugolParser.g:1738:2: ( ruleDeclaredVar )
                    // InternalPortugolParser.g:1739:3: ruleDeclaredVar
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getDeclaredVarParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDeclaredVar();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getDeclaredVarParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPortugolParser.g:1744:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    {
                    // InternalPortugolParser.g:1744:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    // InternalPortugolParser.g:1745:3: ( rule__PrimaryExpression__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); 
                    }
                    // InternalPortugolParser.g:1746:3: ( rule__PrimaryExpression__Group_4__0 )
                    // InternalPortugolParser.g:1746:4: rule__PrimaryExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__PredefineFunctions__Alternatives"
    // InternalPortugolParser.g:1754:1: rule__PredefineFunctions__Alternatives : ( ( Maiusc ) | ( Compr ) | ( Raizq ) | ( Copia ) );
    public final void rule__PredefineFunctions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1758:1: ( ( Maiusc ) | ( Compr ) | ( Raizq ) | ( Copia ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case Maiusc:
                {
                alt14=1;
                }
                break;
            case Compr:
                {
                alt14=2;
                }
                break;
            case Raizq:
                {
                alt14=3;
                }
                break;
            case Copia:
                {
                alt14=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalPortugolParser.g:1759:2: ( Maiusc )
                    {
                    // InternalPortugolParser.g:1759:2: ( Maiusc )
                    // InternalPortugolParser.g:1760:3: Maiusc
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefineFunctionsAccess().getMaiuscKeyword_0()); 
                    }
                    match(input,Maiusc,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredefineFunctionsAccess().getMaiuscKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:1765:2: ( Compr )
                    {
                    // InternalPortugolParser.g:1765:2: ( Compr )
                    // InternalPortugolParser.g:1766:3: Compr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefineFunctionsAccess().getComprKeyword_1()); 
                    }
                    match(input,Compr,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredefineFunctionsAccess().getComprKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPortugolParser.g:1771:2: ( Raizq )
                    {
                    // InternalPortugolParser.g:1771:2: ( Raizq )
                    // InternalPortugolParser.g:1772:3: Raizq
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefineFunctionsAccess().getRaizqKeyword_2()); 
                    }
                    match(input,Raizq,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredefineFunctionsAccess().getRaizqKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPortugolParser.g:1777:2: ( Copia )
                    {
                    // InternalPortugolParser.g:1777:2: ( Copia )
                    // InternalPortugolParser.g:1778:3: Copia
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefineFunctionsAccess().getCopiaKeyword_3()); 
                    }
                    match(input,Copia,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredefineFunctionsAccess().getCopiaKeyword_3()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__PredefineFunctions__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalPortugolParser.g:1787:1: rule__Literal__Alternatives : ( ( ( rule__Literal__Group_0__0 ) ) | ( ruleNumericLiteral ) | ( ruleStringExpression ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1791:1: ( ( ( rule__Literal__Group_0__0 ) ) | ( ruleNumericLiteral ) | ( ruleStringExpression ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case Pi:
                {
                alt15=1;
                }
                break;
            case RULE_INT:
            case RULE_FLOAT:
                {
                alt15=2;
                }
                break;
            case RULE_STRING:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalPortugolParser.g:1792:2: ( ( rule__Literal__Group_0__0 ) )
                    {
                    // InternalPortugolParser.g:1792:2: ( ( rule__Literal__Group_0__0 ) )
                    // InternalPortugolParser.g:1793:3: ( rule__Literal__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getGroup_0()); 
                    }
                    // InternalPortugolParser.g:1794:3: ( rule__Literal__Group_0__0 )
                    // InternalPortugolParser.g:1794:4: rule__Literal__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:1798:2: ( ruleNumericLiteral )
                    {
                    // InternalPortugolParser.g:1798:2: ( ruleNumericLiteral )
                    // InternalPortugolParser.g:1799:3: ruleNumericLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getNumericLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNumericLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getNumericLiteralParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPortugolParser.g:1804:2: ( ruleStringExpression )
                    {
                    // InternalPortugolParser.g:1804:2: ( ruleStringExpression )
                    // InternalPortugolParser.g:1805:3: ruleStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getStringExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleStringExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getStringExpressionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__NumericLiteral__Alternatives"
    // InternalPortugolParser.g:1814:1: rule__NumericLiteral__Alternatives : ( ( ( rule__NumericLiteral__IntValueAssignment_0 ) ) | ( ( rule__NumericLiteral__FloatValueAssignment_1 ) ) );
    public final void rule__NumericLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1818:1: ( ( ( rule__NumericLiteral__IntValueAssignment_0 ) ) | ( ( rule__NumericLiteral__FloatValueAssignment_1 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_FLOAT) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalPortugolParser.g:1819:2: ( ( rule__NumericLiteral__IntValueAssignment_0 ) )
                    {
                    // InternalPortugolParser.g:1819:2: ( ( rule__NumericLiteral__IntValueAssignment_0 ) )
                    // InternalPortugolParser.g:1820:3: ( rule__NumericLiteral__IntValueAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericLiteralAccess().getIntValueAssignment_0()); 
                    }
                    // InternalPortugolParser.g:1821:3: ( rule__NumericLiteral__IntValueAssignment_0 )
                    // InternalPortugolParser.g:1821:4: rule__NumericLiteral__IntValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericLiteral__IntValueAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumericLiteralAccess().getIntValueAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:1825:2: ( ( rule__NumericLiteral__FloatValueAssignment_1 ) )
                    {
                    // InternalPortugolParser.g:1825:2: ( ( rule__NumericLiteral__FloatValueAssignment_1 ) )
                    // InternalPortugolParser.g:1826:3: ( rule__NumericLiteral__FloatValueAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericLiteralAccess().getFloatValueAssignment_1()); 
                    }
                    // InternalPortugolParser.g:1827:3: ( rule__NumericLiteral__FloatValueAssignment_1 )
                    // InternalPortugolParser.g:1827:4: rule__NumericLiteral__FloatValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericLiteral__FloatValueAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumericLiteralAccess().getFloatValueAssignment_1()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__NumericLiteral__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalPortugolParser.g:1835:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1839:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalPortugolParser.g:1840:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalPortugolParser.g:1847:1: rule__Model__Group__0__Impl : ( ( rule__Model__HeaderAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1851:1: ( ( ( rule__Model__HeaderAssignment_0 ) ) )
            // InternalPortugolParser.g:1852:1: ( ( rule__Model__HeaderAssignment_0 ) )
            {
            // InternalPortugolParser.g:1852:1: ( ( rule__Model__HeaderAssignment_0 ) )
            // InternalPortugolParser.g:1853:2: ( rule__Model__HeaderAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getHeaderAssignment_0()); 
            }
            // InternalPortugolParser.g:1854:2: ( rule__Model__HeaderAssignment_0 )
            // InternalPortugolParser.g:1854:3: rule__Model__HeaderAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__HeaderAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getHeaderAssignment_0()); 
            }

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalPortugolParser.g:1862:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1866:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalPortugolParser.g:1867:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalPortugolParser.g:1874:1: rule__Model__Group__1__Impl : ( ( rule__Model__GlobalDeclarationsAssignment_1 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1878:1: ( ( ( rule__Model__GlobalDeclarationsAssignment_1 )? ) )
            // InternalPortugolParser.g:1879:1: ( ( rule__Model__GlobalDeclarationsAssignment_1 )? )
            {
            // InternalPortugolParser.g:1879:1: ( ( rule__Model__GlobalDeclarationsAssignment_1 )? )
            // InternalPortugolParser.g:1880:2: ( rule__Model__GlobalDeclarationsAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGlobalDeclarationsAssignment_1()); 
            }
            // InternalPortugolParser.g:1881:2: ( rule__Model__GlobalDeclarationsAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Var) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPortugolParser.g:1881:3: rule__Model__GlobalDeclarationsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__GlobalDeclarationsAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGlobalDeclarationsAssignment_1()); 
            }

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalPortugolParser.g:1889:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1893:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalPortugolParser.g:1894:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalPortugolParser.g:1901:1: rule__Model__Group__2__Impl : ( ( rule__Model__SubprogramsAssignment_2 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1905:1: ( ( ( rule__Model__SubprogramsAssignment_2 )? ) )
            // InternalPortugolParser.g:1906:1: ( ( rule__Model__SubprogramsAssignment_2 )? )
            {
            // InternalPortugolParser.g:1906:1: ( ( rule__Model__SubprogramsAssignment_2 )? )
            // InternalPortugolParser.g:1907:2: ( rule__Model__SubprogramsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSubprogramsAssignment_2()); 
            }
            // InternalPortugolParser.g:1908:2: ( rule__Model__SubprogramsAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Procedimento||LA18_0==Funcao) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPortugolParser.g:1908:3: rule__Model__SubprogramsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__SubprogramsAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getSubprogramsAssignment_2()); 
            }

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalPortugolParser.g:1916:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1920:1: ( rule__Model__Group__3__Impl )
            // InternalPortugolParser.g:1921:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalPortugolParser.g:1927:1: rule__Model__Group__3__Impl : ( ( rule__Model__CommandsAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1931:1: ( ( ( rule__Model__CommandsAssignment_3 ) ) )
            // InternalPortugolParser.g:1932:1: ( ( rule__Model__CommandsAssignment_3 ) )
            {
            // InternalPortugolParser.g:1932:1: ( ( rule__Model__CommandsAssignment_3 ) )
            // InternalPortugolParser.g:1933:2: ( rule__Model__CommandsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugolParser.g:1934:2: ( rule__Model__CommandsAssignment_3 )
            // InternalPortugolParser.g:1934:3: rule__Model__CommandsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Model__CommandsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getCommandsAssignment_3()); 
            }

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__HeaderBlock__Group__0"
    // InternalPortugolParser.g:1943:1: rule__HeaderBlock__Group__0 : rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1 ;
    public final void rule__HeaderBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1947:1: ( rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1 )
            // InternalPortugolParser.g:1948:2: rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__HeaderBlock__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderBlock__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__HeaderBlock__Group__0"


    // $ANTLR start "rule__HeaderBlock__Group__0__Impl"
    // InternalPortugolParser.g:1955:1: rule__HeaderBlock__Group__0__Impl : ( Algoritmo ) ;
    public final void rule__HeaderBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1959:1: ( ( Algoritmo ) )
            // InternalPortugolParser.g:1960:1: ( Algoritmo )
            {
            // InternalPortugolParser.g:1960:1: ( Algoritmo )
            // InternalPortugolParser.g:1961:2: Algoritmo
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderBlockAccess().getAlgoritmoKeyword_0()); 
            }
            match(input,Algoritmo,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderBlockAccess().getAlgoritmoKeyword_0()); 
            }

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
    // $ANTLR end "rule__HeaderBlock__Group__0__Impl"


    // $ANTLR start "rule__HeaderBlock__Group__1"
    // InternalPortugolParser.g:1970:1: rule__HeaderBlock__Group__1 : rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2 ;
    public final void rule__HeaderBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1974:1: ( rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2 )
            // InternalPortugolParser.g:1975:2: rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__HeaderBlock__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HeaderBlock__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__HeaderBlock__Group__1"


    // $ANTLR start "rule__HeaderBlock__Group__1__Impl"
    // InternalPortugolParser.g:1982:1: rule__HeaderBlock__Group__1__Impl : ( ( rule__HeaderBlock__AlgorithmNameAssignment_1 ) ) ;
    public final void rule__HeaderBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1986:1: ( ( ( rule__HeaderBlock__AlgorithmNameAssignment_1 ) ) )
            // InternalPortugolParser.g:1987:1: ( ( rule__HeaderBlock__AlgorithmNameAssignment_1 ) )
            {
            // InternalPortugolParser.g:1987:1: ( ( rule__HeaderBlock__AlgorithmNameAssignment_1 ) )
            // InternalPortugolParser.g:1988:2: ( rule__HeaderBlock__AlgorithmNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderBlockAccess().getAlgorithmNameAssignment_1()); 
            }
            // InternalPortugolParser.g:1989:2: ( rule__HeaderBlock__AlgorithmNameAssignment_1 )
            // InternalPortugolParser.g:1989:3: rule__HeaderBlock__AlgorithmNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HeaderBlock__AlgorithmNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderBlockAccess().getAlgorithmNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__HeaderBlock__Group__1__Impl"


    // $ANTLR start "rule__HeaderBlock__Group__2"
    // InternalPortugolParser.g:1997:1: rule__HeaderBlock__Group__2 : rule__HeaderBlock__Group__2__Impl ;
    public final void rule__HeaderBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2001:1: ( rule__HeaderBlock__Group__2__Impl )
            // InternalPortugolParser.g:2002:2: rule__HeaderBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeaderBlock__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__HeaderBlock__Group__2"


    // $ANTLR start "rule__HeaderBlock__Group__2__Impl"
    // InternalPortugolParser.g:2008:1: rule__HeaderBlock__Group__2__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__HeaderBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2012:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugolParser.g:2013:1: ( ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:2013:1: ( ruleEND_COMMAND )
            // InternalPortugolParser.g:2014:2: ruleEND_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderBlockAccess().getEND_COMMANDParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleEND_COMMAND();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderBlockAccess().getEND_COMMANDParserRuleCall_2()); 
            }

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
    // $ANTLR end "rule__HeaderBlock__Group__2__Impl"


    // $ANTLR start "rule__DeclarationsBlock__Group__0"
    // InternalPortugolParser.g:2024:1: rule__DeclarationsBlock__Group__0 : rule__DeclarationsBlock__Group__0__Impl rule__DeclarationsBlock__Group__1 ;
    public final void rule__DeclarationsBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2028:1: ( rule__DeclarationsBlock__Group__0__Impl rule__DeclarationsBlock__Group__1 )
            // InternalPortugolParser.g:2029:2: rule__DeclarationsBlock__Group__0__Impl rule__DeclarationsBlock__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__DeclarationsBlock__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DeclarationsBlock__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DeclarationsBlock__Group__0"


    // $ANTLR start "rule__DeclarationsBlock__Group__0__Impl"
    // InternalPortugolParser.g:2036:1: rule__DeclarationsBlock__Group__0__Impl : ( Var ) ;
    public final void rule__DeclarationsBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2040:1: ( ( Var ) )
            // InternalPortugolParser.g:2041:1: ( Var )
            {
            // InternalPortugolParser.g:2041:1: ( Var )
            // InternalPortugolParser.g:2042:2: Var
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getVarKeyword_0()); 
            }
            match(input,Var,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationsBlockAccess().getVarKeyword_0()); 
            }

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
    // $ANTLR end "rule__DeclarationsBlock__Group__0__Impl"


    // $ANTLR start "rule__DeclarationsBlock__Group__1"
    // InternalPortugolParser.g:2051:1: rule__DeclarationsBlock__Group__1 : rule__DeclarationsBlock__Group__1__Impl ;
    public final void rule__DeclarationsBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2055:1: ( rule__DeclarationsBlock__Group__1__Impl )
            // InternalPortugolParser.g:2056:2: rule__DeclarationsBlock__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclarationsBlock__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DeclarationsBlock__Group__1"


    // $ANTLR start "rule__DeclarationsBlock__Group__1__Impl"
    // InternalPortugolParser.g:2062:1: rule__DeclarationsBlock__Group__1__Impl : ( ( ( rule__DeclarationsBlock__Group_1__0 ) ) ( ( rule__DeclarationsBlock__Group_1__0 )* ) ) ;
    public final void rule__DeclarationsBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2066:1: ( ( ( ( rule__DeclarationsBlock__Group_1__0 ) ) ( ( rule__DeclarationsBlock__Group_1__0 )* ) ) )
            // InternalPortugolParser.g:2067:1: ( ( ( rule__DeclarationsBlock__Group_1__0 ) ) ( ( rule__DeclarationsBlock__Group_1__0 )* ) )
            {
            // InternalPortugolParser.g:2067:1: ( ( ( rule__DeclarationsBlock__Group_1__0 ) ) ( ( rule__DeclarationsBlock__Group_1__0 )* ) )
            // InternalPortugolParser.g:2068:2: ( ( rule__DeclarationsBlock__Group_1__0 ) ) ( ( rule__DeclarationsBlock__Group_1__0 )* )
            {
            // InternalPortugolParser.g:2068:2: ( ( rule__DeclarationsBlock__Group_1__0 ) )
            // InternalPortugolParser.g:2069:3: ( rule__DeclarationsBlock__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:2070:3: ( rule__DeclarationsBlock__Group_1__0 )
            // InternalPortugolParser.g:2070:4: rule__DeclarationsBlock__Group_1__0
            {
            pushFollow(FOLLOW_8);
            rule__DeclarationsBlock__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationsBlockAccess().getGroup_1()); 
            }

            }

            // InternalPortugolParser.g:2073:2: ( ( rule__DeclarationsBlock__Group_1__0 )* )
            // InternalPortugolParser.g:2074:3: ( rule__DeclarationsBlock__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:2075:3: ( rule__DeclarationsBlock__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPortugolParser.g:2075:4: rule__DeclarationsBlock__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__DeclarationsBlock__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationsBlockAccess().getGroup_1()); 
            }

            }


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
    // $ANTLR end "rule__DeclarationsBlock__Group__1__Impl"


    // $ANTLR start "rule__DeclarationsBlock__Group_1__0"
    // InternalPortugolParser.g:2085:1: rule__DeclarationsBlock__Group_1__0 : rule__DeclarationsBlock__Group_1__0__Impl rule__DeclarationsBlock__Group_1__1 ;
    public final void rule__DeclarationsBlock__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2089:1: ( rule__DeclarationsBlock__Group_1__0__Impl rule__DeclarationsBlock__Group_1__1 )
            // InternalPortugolParser.g:2090:2: rule__DeclarationsBlock__Group_1__0__Impl rule__DeclarationsBlock__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__DeclarationsBlock__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DeclarationsBlock__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DeclarationsBlock__Group_1__0"


    // $ANTLR start "rule__DeclarationsBlock__Group_1__0__Impl"
    // InternalPortugolParser.g:2097:1: rule__DeclarationsBlock__Group_1__0__Impl : ( ( rule__DeclarationsBlock__VarsAssignment_1_0 ) ) ;
    public final void rule__DeclarationsBlock__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2101:1: ( ( ( rule__DeclarationsBlock__VarsAssignment_1_0 ) ) )
            // InternalPortugolParser.g:2102:1: ( ( rule__DeclarationsBlock__VarsAssignment_1_0 ) )
            {
            // InternalPortugolParser.g:2102:1: ( ( rule__DeclarationsBlock__VarsAssignment_1_0 ) )
            // InternalPortugolParser.g:2103:2: ( rule__DeclarationsBlock__VarsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getVarsAssignment_1_0()); 
            }
            // InternalPortugolParser.g:2104:2: ( rule__DeclarationsBlock__VarsAssignment_1_0 )
            // InternalPortugolParser.g:2104:3: rule__DeclarationsBlock__VarsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DeclarationsBlock__VarsAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationsBlockAccess().getVarsAssignment_1_0()); 
            }

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
    // $ANTLR end "rule__DeclarationsBlock__Group_1__0__Impl"


    // $ANTLR start "rule__DeclarationsBlock__Group_1__1"
    // InternalPortugolParser.g:2112:1: rule__DeclarationsBlock__Group_1__1 : rule__DeclarationsBlock__Group_1__1__Impl ;
    public final void rule__DeclarationsBlock__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2116:1: ( rule__DeclarationsBlock__Group_1__1__Impl )
            // InternalPortugolParser.g:2117:2: rule__DeclarationsBlock__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclarationsBlock__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DeclarationsBlock__Group_1__1"


    // $ANTLR start "rule__DeclarationsBlock__Group_1__1__Impl"
    // InternalPortugolParser.g:2123:1: rule__DeclarationsBlock__Group_1__1__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__DeclarationsBlock__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2127:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugolParser.g:2128:1: ( ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:2128:1: ( ruleEND_COMMAND )
            // InternalPortugolParser.g:2129:2: ruleEND_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getEND_COMMANDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleEND_COMMAND();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationsBlockAccess().getEND_COMMANDParserRuleCall_1_1()); 
            }

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
    // $ANTLR end "rule__DeclarationsBlock__Group_1__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalPortugolParser.g:2139:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2143:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalPortugolParser.g:2144:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Variable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalPortugolParser.g:2151:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__VarDeclarationAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2155:1: ( ( ( rule__Variable__VarDeclarationAssignment_0 ) ) )
            // InternalPortugolParser.g:2156:1: ( ( rule__Variable__VarDeclarationAssignment_0 ) )
            {
            // InternalPortugolParser.g:2156:1: ( ( rule__Variable__VarDeclarationAssignment_0 ) )
            // InternalPortugolParser.g:2157:2: ( rule__Variable__VarDeclarationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getVarDeclarationAssignment_0()); 
            }
            // InternalPortugolParser.g:2158:2: ( rule__Variable__VarDeclarationAssignment_0 )
            // InternalPortugolParser.g:2158:3: rule__Variable__VarDeclarationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__VarDeclarationAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getVarDeclarationAssignment_0()); 
            }

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
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalPortugolParser.g:2166:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2170:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalPortugolParser.g:2171:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Variable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalPortugolParser.g:2178:1: rule__Variable__Group__1__Impl : ( Colon ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2182:1: ( ( Colon ) )
            // InternalPortugolParser.g:2183:1: ( Colon )
            {
            // InternalPortugolParser.g:2183:1: ( Colon )
            // InternalPortugolParser.g:2184:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getColonKeyword_1()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getColonKeyword_1()); 
            }

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
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalPortugolParser.g:2193:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2197:1: ( rule__Variable__Group__2__Impl )
            // InternalPortugolParser.g:2198:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalPortugolParser.g:2204:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__TypeAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2208:1: ( ( ( rule__Variable__TypeAssignment_2 ) ) )
            // InternalPortugolParser.g:2209:1: ( ( rule__Variable__TypeAssignment_2 ) )
            {
            // InternalPortugolParser.g:2209:1: ( ( rule__Variable__TypeAssignment_2 ) )
            // InternalPortugolParser.g:2210:2: ( rule__Variable__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getTypeAssignment_2()); 
            }
            // InternalPortugolParser.g:2211:2: ( rule__Variable__TypeAssignment_2 )
            // InternalPortugolParser.g:2211:3: rule__Variable__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Variable__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getTypeAssignment_2()); 
            }

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
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__0"
    // InternalPortugolParser.g:2220:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2224:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // InternalPortugolParser.g:2225:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__VarDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__VarDeclaration__Group__0"


    // $ANTLR start "rule__VarDeclaration__Group__0__Impl"
    // InternalPortugolParser.g:2232:1: rule__VarDeclaration__Group__0__Impl : ( ( rule__VarDeclaration__VarsAssignment_0 ) ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2236:1: ( ( ( rule__VarDeclaration__VarsAssignment_0 ) ) )
            // InternalPortugolParser.g:2237:1: ( ( rule__VarDeclaration__VarsAssignment_0 ) )
            {
            // InternalPortugolParser.g:2237:1: ( ( rule__VarDeclaration__VarsAssignment_0 ) )
            // InternalPortugolParser.g:2238:2: ( rule__VarDeclaration__VarsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getVarsAssignment_0()); 
            }
            // InternalPortugolParser.g:2239:2: ( rule__VarDeclaration__VarsAssignment_0 )
            // InternalPortugolParser.g:2239:3: rule__VarDeclaration__VarsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__VarsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationAccess().getVarsAssignment_0()); 
            }

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
    // $ANTLR end "rule__VarDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__1"
    // InternalPortugolParser.g:2247:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2251:1: ( rule__VarDeclaration__Group__1__Impl )
            // InternalPortugolParser.g:2252:2: rule__VarDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__VarDeclaration__Group__1"


    // $ANTLR start "rule__VarDeclaration__Group__1__Impl"
    // InternalPortugolParser.g:2258:1: rule__VarDeclaration__Group__1__Impl : ( ( rule__VarDeclaration__Group_1__0 )* ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2262:1: ( ( ( rule__VarDeclaration__Group_1__0 )* ) )
            // InternalPortugolParser.g:2263:1: ( ( rule__VarDeclaration__Group_1__0 )* )
            {
            // InternalPortugolParser.g:2263:1: ( ( rule__VarDeclaration__Group_1__0 )* )
            // InternalPortugolParser.g:2264:2: ( rule__VarDeclaration__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:2265:2: ( rule__VarDeclaration__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Comma) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPortugolParser.g:2265:3: rule__VarDeclaration__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__VarDeclaration__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__VarDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VarDeclaration__Group_1__0"
    // InternalPortugolParser.g:2274:1: rule__VarDeclaration__Group_1__0 : rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1 ;
    public final void rule__VarDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2278:1: ( rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1 )
            // InternalPortugolParser.g:2279:2: rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__VarDeclaration__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__VarDeclaration__Group_1__0"


    // $ANTLR start "rule__VarDeclaration__Group_1__0__Impl"
    // InternalPortugolParser.g:2286:1: rule__VarDeclaration__Group_1__0__Impl : ( Comma ) ;
    public final void rule__VarDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2290:1: ( ( Comma ) )
            // InternalPortugolParser.g:2291:1: ( Comma )
            {
            // InternalPortugolParser.g:2291:1: ( Comma )
            // InternalPortugolParser.g:2292:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getCommaKeyword_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationAccess().getCommaKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__VarDeclaration__Group_1__0__Impl"


    // $ANTLR start "rule__VarDeclaration__Group_1__1"
    // InternalPortugolParser.g:2301:1: rule__VarDeclaration__Group_1__1 : rule__VarDeclaration__Group_1__1__Impl ;
    public final void rule__VarDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2305:1: ( rule__VarDeclaration__Group_1__1__Impl )
            // InternalPortugolParser.g:2306:2: rule__VarDeclaration__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__VarDeclaration__Group_1__1"


    // $ANTLR start "rule__VarDeclaration__Group_1__1__Impl"
    // InternalPortugolParser.g:2312:1: rule__VarDeclaration__Group_1__1__Impl : ( ( rule__VarDeclaration__VarsAssignment_1_1 ) ) ;
    public final void rule__VarDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2316:1: ( ( ( rule__VarDeclaration__VarsAssignment_1_1 ) ) )
            // InternalPortugolParser.g:2317:1: ( ( rule__VarDeclaration__VarsAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:2317:1: ( ( rule__VarDeclaration__VarsAssignment_1_1 ) )
            // InternalPortugolParser.g:2318:2: ( rule__VarDeclaration__VarsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getVarsAssignment_1_1()); 
            }
            // InternalPortugolParser.g:2319:2: ( rule__VarDeclaration__VarsAssignment_1_1 )
            // InternalPortugolParser.g:2319:3: rule__VarDeclaration__VarsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__VarsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationAccess().getVarsAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__VarDeclaration__Group_1__1__Impl"


    // $ANTLR start "rule__DeclaredVarList__Group__0"
    // InternalPortugolParser.g:2328:1: rule__DeclaredVarList__Group__0 : rule__DeclaredVarList__Group__0__Impl rule__DeclaredVarList__Group__1 ;
    public final void rule__DeclaredVarList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2332:1: ( rule__DeclaredVarList__Group__0__Impl rule__DeclaredVarList__Group__1 )
            // InternalPortugolParser.g:2333:2: rule__DeclaredVarList__Group__0__Impl rule__DeclaredVarList__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__DeclaredVarList__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DeclaredVarList__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DeclaredVarList__Group__0"


    // $ANTLR start "rule__DeclaredVarList__Group__0__Impl"
    // InternalPortugolParser.g:2340:1: rule__DeclaredVarList__Group__0__Impl : ( ( rule__DeclaredVarList__VarsAssignment_0 ) ) ;
    public final void rule__DeclaredVarList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2344:1: ( ( ( rule__DeclaredVarList__VarsAssignment_0 ) ) )
            // InternalPortugolParser.g:2345:1: ( ( rule__DeclaredVarList__VarsAssignment_0 ) )
            {
            // InternalPortugolParser.g:2345:1: ( ( rule__DeclaredVarList__VarsAssignment_0 ) )
            // InternalPortugolParser.g:2346:2: ( rule__DeclaredVarList__VarsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getVarsAssignment_0()); 
            }
            // InternalPortugolParser.g:2347:2: ( rule__DeclaredVarList__VarsAssignment_0 )
            // InternalPortugolParser.g:2347:3: rule__DeclaredVarList__VarsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredVarList__VarsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredVarListAccess().getVarsAssignment_0()); 
            }

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
    // $ANTLR end "rule__DeclaredVarList__Group__0__Impl"


    // $ANTLR start "rule__DeclaredVarList__Group__1"
    // InternalPortugolParser.g:2355:1: rule__DeclaredVarList__Group__1 : rule__DeclaredVarList__Group__1__Impl ;
    public final void rule__DeclaredVarList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2359:1: ( rule__DeclaredVarList__Group__1__Impl )
            // InternalPortugolParser.g:2360:2: rule__DeclaredVarList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredVarList__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DeclaredVarList__Group__1"


    // $ANTLR start "rule__DeclaredVarList__Group__1__Impl"
    // InternalPortugolParser.g:2366:1: rule__DeclaredVarList__Group__1__Impl : ( ( rule__DeclaredVarList__Group_1__0 )* ) ;
    public final void rule__DeclaredVarList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2370:1: ( ( ( rule__DeclaredVarList__Group_1__0 )* ) )
            // InternalPortugolParser.g:2371:1: ( ( rule__DeclaredVarList__Group_1__0 )* )
            {
            // InternalPortugolParser.g:2371:1: ( ( rule__DeclaredVarList__Group_1__0 )* )
            // InternalPortugolParser.g:2372:2: ( rule__DeclaredVarList__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:2373:2: ( rule__DeclaredVarList__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Comma) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPortugolParser.g:2373:3: rule__DeclaredVarList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__DeclaredVarList__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredVarListAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__DeclaredVarList__Group__1__Impl"


    // $ANTLR start "rule__DeclaredVarList__Group_1__0"
    // InternalPortugolParser.g:2382:1: rule__DeclaredVarList__Group_1__0 : rule__DeclaredVarList__Group_1__0__Impl rule__DeclaredVarList__Group_1__1 ;
    public final void rule__DeclaredVarList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2386:1: ( rule__DeclaredVarList__Group_1__0__Impl rule__DeclaredVarList__Group_1__1 )
            // InternalPortugolParser.g:2387:2: rule__DeclaredVarList__Group_1__0__Impl rule__DeclaredVarList__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__DeclaredVarList__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DeclaredVarList__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DeclaredVarList__Group_1__0"


    // $ANTLR start "rule__DeclaredVarList__Group_1__0__Impl"
    // InternalPortugolParser.g:2394:1: rule__DeclaredVarList__Group_1__0__Impl : ( Comma ) ;
    public final void rule__DeclaredVarList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2398:1: ( ( Comma ) )
            // InternalPortugolParser.g:2399:1: ( Comma )
            {
            // InternalPortugolParser.g:2399:1: ( Comma )
            // InternalPortugolParser.g:2400:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getCommaKeyword_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredVarListAccess().getCommaKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__DeclaredVarList__Group_1__0__Impl"


    // $ANTLR start "rule__DeclaredVarList__Group_1__1"
    // InternalPortugolParser.g:2409:1: rule__DeclaredVarList__Group_1__1 : rule__DeclaredVarList__Group_1__1__Impl ;
    public final void rule__DeclaredVarList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2413:1: ( rule__DeclaredVarList__Group_1__1__Impl )
            // InternalPortugolParser.g:2414:2: rule__DeclaredVarList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredVarList__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DeclaredVarList__Group_1__1"


    // $ANTLR start "rule__DeclaredVarList__Group_1__1__Impl"
    // InternalPortugolParser.g:2420:1: rule__DeclaredVarList__Group_1__1__Impl : ( ( rule__DeclaredVarList__VarsAssignment_1_1 ) ) ;
    public final void rule__DeclaredVarList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2424:1: ( ( ( rule__DeclaredVarList__VarsAssignment_1_1 ) ) )
            // InternalPortugolParser.g:2425:1: ( ( rule__DeclaredVarList__VarsAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:2425:1: ( ( rule__DeclaredVarList__VarsAssignment_1_1 ) )
            // InternalPortugolParser.g:2426:2: ( rule__DeclaredVarList__VarsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getVarsAssignment_1_1()); 
            }
            // InternalPortugolParser.g:2427:2: ( rule__DeclaredVarList__VarsAssignment_1_1 )
            // InternalPortugolParser.g:2427:3: rule__DeclaredVarList__VarsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredVarList__VarsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredVarListAccess().getVarsAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__DeclaredVarList__Group_1__1__Impl"


    // $ANTLR start "rule__BlockFunction__Group__0"
    // InternalPortugolParser.g:2436:1: rule__BlockFunction__Group__0 : rule__BlockFunction__Group__0__Impl rule__BlockFunction__Group__1 ;
    public final void rule__BlockFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2440:1: ( rule__BlockFunction__Group__0__Impl rule__BlockFunction__Group__1 )
            // InternalPortugolParser.g:2441:2: rule__BlockFunction__Group__0__Impl rule__BlockFunction__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__BlockFunction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockFunction__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockFunction__Group__0"


    // $ANTLR start "rule__BlockFunction__Group__0__Impl"
    // InternalPortugolParser.g:2448:1: rule__BlockFunction__Group__0__Impl : ( Funcao ) ;
    public final void rule__BlockFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2452:1: ( ( Funcao ) )
            // InternalPortugolParser.g:2453:1: ( Funcao )
            {
            // InternalPortugolParser.g:2453:1: ( Funcao )
            // InternalPortugolParser.g:2454:2: Funcao
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getFuncaoKeyword_0()); 
            }
            match(input,Funcao,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getFuncaoKeyword_0()); 
            }

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
    // $ANTLR end "rule__BlockFunction__Group__0__Impl"


    // $ANTLR start "rule__BlockFunction__Group__1"
    // InternalPortugolParser.g:2463:1: rule__BlockFunction__Group__1 : rule__BlockFunction__Group__1__Impl rule__BlockFunction__Group__2 ;
    public final void rule__BlockFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2467:1: ( rule__BlockFunction__Group__1__Impl rule__BlockFunction__Group__2 )
            // InternalPortugolParser.g:2468:2: rule__BlockFunction__Group__1__Impl rule__BlockFunction__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__BlockFunction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockFunction__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockFunction__Group__1"


    // $ANTLR start "rule__BlockFunction__Group__1__Impl"
    // InternalPortugolParser.g:2475:1: rule__BlockFunction__Group__1__Impl : ( ( rule__BlockFunction__FunctionNameAssignment_1 ) ) ;
    public final void rule__BlockFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2479:1: ( ( ( rule__BlockFunction__FunctionNameAssignment_1 ) ) )
            // InternalPortugolParser.g:2480:1: ( ( rule__BlockFunction__FunctionNameAssignment_1 ) )
            {
            // InternalPortugolParser.g:2480:1: ( ( rule__BlockFunction__FunctionNameAssignment_1 ) )
            // InternalPortugolParser.g:2481:2: ( rule__BlockFunction__FunctionNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getFunctionNameAssignment_1()); 
            }
            // InternalPortugolParser.g:2482:2: ( rule__BlockFunction__FunctionNameAssignment_1 )
            // InternalPortugolParser.g:2482:3: rule__BlockFunction__FunctionNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BlockFunction__FunctionNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getFunctionNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__BlockFunction__Group__1__Impl"


    // $ANTLR start "rule__BlockFunction__Group__2"
    // InternalPortugolParser.g:2490:1: rule__BlockFunction__Group__2 : rule__BlockFunction__Group__2__Impl rule__BlockFunction__Group__3 ;
    public final void rule__BlockFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2494:1: ( rule__BlockFunction__Group__2__Impl rule__BlockFunction__Group__3 )
            // InternalPortugolParser.g:2495:2: rule__BlockFunction__Group__2__Impl rule__BlockFunction__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__BlockFunction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockFunction__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockFunction__Group__2"


    // $ANTLR start "rule__BlockFunction__Group__2__Impl"
    // InternalPortugolParser.g:2502:1: rule__BlockFunction__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__BlockFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2506:1: ( ( LeftParenthesis ) )
            // InternalPortugolParser.g:2507:1: ( LeftParenthesis )
            {
            // InternalPortugolParser.g:2507:1: ( LeftParenthesis )
            // InternalPortugolParser.g:2508:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getLeftParenthesisKeyword_2()); 
            }

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
    // $ANTLR end "rule__BlockFunction__Group__2__Impl"


    // $ANTLR start "rule__BlockFunction__Group__3"
    // InternalPortugolParser.g:2517:1: rule__BlockFunction__Group__3 : rule__BlockFunction__Group__3__Impl rule__BlockFunction__Group__4 ;
    public final void rule__BlockFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2521:1: ( rule__BlockFunction__Group__3__Impl rule__BlockFunction__Group__4 )
            // InternalPortugolParser.g:2522:2: rule__BlockFunction__Group__3__Impl rule__BlockFunction__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__BlockFunction__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockFunction__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockFunction__Group__3"


    // $ANTLR start "rule__BlockFunction__Group__3__Impl"
    // InternalPortugolParser.g:2529:1: rule__BlockFunction__Group__3__Impl : ( ( rule__BlockFunction__Group_3__0 )? ) ;
    public final void rule__BlockFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2533:1: ( ( ( rule__BlockFunction__Group_3__0 )? ) )
            // InternalPortugolParser.g:2534:1: ( ( rule__BlockFunction__Group_3__0 )? )
            {
            // InternalPortugolParser.g:2534:1: ( ( rule__BlockFunction__Group_3__0 )? )
            // InternalPortugolParser.g:2535:2: ( rule__BlockFunction__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getGroup_3()); 
            }
            // InternalPortugolParser.g:2536:2: ( rule__BlockFunction__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPortugolParser.g:2536:3: rule__BlockFunction__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BlockFunction__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getGroup_3()); 
            }

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
    // $ANTLR end "rule__BlockFunction__Group__3__Impl"


    // $ANTLR start "rule__BlockFunction__Group__4"
    // InternalPortugolParser.g:2544:1: rule__BlockFunction__Group__4 : rule__BlockFunction__Group__4__Impl rule__BlockFunction__Group__5 ;
    public final void rule__BlockFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2548:1: ( rule__BlockFunction__Group__4__Impl rule__BlockFunction__Group__5 )
            // InternalPortugolParser.g:2549:2: rule__BlockFunction__Group__4__Impl rule__BlockFunction__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__BlockFunction__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockFunction__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockFunction__Group__4"


    // $ANTLR start "rule__BlockFunction__Group__4__Impl"
    // InternalPortugolParser.g:2556:1: rule__BlockFunction__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__BlockFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2560:1: ( ( RightParenthesis ) )
            // InternalPortugolParser.g:2561:1: ( RightParenthesis )
            {
            // InternalPortugolParser.g:2561:1: ( RightParenthesis )
            // InternalPortugolParser.g:2562:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getRightParenthesisKeyword_4()); 
            }

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
    // $ANTLR end "rule__BlockFunction__Group__4__Impl"


    // $ANTLR start "rule__BlockFunction__Group__5"
    // InternalPortugolParser.g:2571:1: rule__BlockFunction__Group__5 : rule__BlockFunction__Group__5__Impl rule__BlockFunction__Group__6 ;
    public final void rule__BlockFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2575:1: ( rule__BlockFunction__Group__5__Impl rule__BlockFunction__Group__6 )
            // InternalPortugolParser.g:2576:2: rule__BlockFunction__Group__5__Impl rule__BlockFunction__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__BlockFunction__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockFunction__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockFunction__Group__5"


    // $ANTLR start "rule__BlockFunction__Group__5__Impl"
    // InternalPortugolParser.g:2583:1: rule__BlockFunction__Group__5__Impl : ( Colon ) ;
    public final void rule__BlockFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2587:1: ( ( Colon ) )
            // InternalPortugolParser.g:2588:1: ( Colon )
            {
            // InternalPortugolParser.g:2588:1: ( Colon )
            // InternalPortugolParser.g:2589:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getColonKeyword_5()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getColonKeyword_5()); 
            }

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
    // $ANTLR end "rule__BlockFunction__Group__5__Impl"


    // $ANTLR start "rule__BlockFunction__Group__6"
    // InternalPortugolParser.g:2598:1: rule__BlockFunction__Group__6 : rule__BlockFunction__Group__6__Impl rule__BlockFunction__Group__7 ;
    public final void rule__BlockFunction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2602:1: ( rule__BlockFunction__Group__6__Impl rule__BlockFunction__Group__7 )
            // InternalPortugolParser.g:2603:2: rule__BlockFunction__Group__6__Impl rule__BlockFunction__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__BlockFunction__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockFunction__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockFunction__Group__6"


    // $ANTLR start "rule__BlockFunction__Group__6__Impl"
    // InternalPortugolParser.g:2610:1: rule__BlockFunction__Group__6__Impl : ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) ) ;
    public final void rule__BlockFunction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2614:1: ( ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) ) )
            // InternalPortugolParser.g:2615:1: ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) )
            {
            // InternalPortugolParser.g:2615:1: ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) )
            // InternalPortugolParser.g:2616:2: ( rule__BlockFunction__ReturnTypeAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getReturnTypeAssignment_6()); 
            }
            // InternalPortugolParser.g:2617:2: ( rule__BlockFunction__ReturnTypeAssignment_6 )
            // InternalPortugolParser.g:2617:3: rule__BlockFunction__ReturnTypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__BlockFunction__ReturnTypeAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getReturnTypeAssignment_6()); 
            }

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
    // $ANTLR end "rule__BlockFunction__Group__6__Impl"


    // $ANTLR start "rule__BlockFunction__Group__7"
    // InternalPortugolParser.g:2625:1: rule__BlockFunction__Group__7 : rule__BlockFunction__Group__7__Impl rule__BlockFunction__Group__8 ;
    public final void rule__BlockFunction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2629:1: ( rule__BlockFunction__Group__7__Impl rule__BlockFunction__Group__8 )
            // InternalPortugolParser.g:2630:2: rule__BlockFunction__Group__7__Impl rule__BlockFunction__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__BlockFunction__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockFunction__Group__8();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockFunction__Group__7"


    // $ANTLR start "rule__BlockFunction__Group__7__Impl"
    // InternalPortugolParser.g:2637:1: rule__BlockFunction__Group__7__Impl : ( ( rule__BlockFunction__DeclarationsAssignment_7 )? ) ;
    public final void rule__BlockFunction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2641:1: ( ( ( rule__BlockFunction__DeclarationsAssignment_7 )? ) )
            // InternalPortugolParser.g:2642:1: ( ( rule__BlockFunction__DeclarationsAssignment_7 )? )
            {
            // InternalPortugolParser.g:2642:1: ( ( rule__BlockFunction__DeclarationsAssignment_7 )? )
            // InternalPortugolParser.g:2643:2: ( rule__BlockFunction__DeclarationsAssignment_7 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getDeclarationsAssignment_7()); 
            }
            // InternalPortugolParser.g:2644:2: ( rule__BlockFunction__DeclarationsAssignment_7 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Var) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPortugolParser.g:2644:3: rule__BlockFunction__DeclarationsAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__BlockFunction__DeclarationsAssignment_7();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getDeclarationsAssignment_7()); 
            }

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
    // $ANTLR end "rule__BlockFunction__Group__7__Impl"


    // $ANTLR start "rule__BlockFunction__Group__8"
    // InternalPortugolParser.g:2652:1: rule__BlockFunction__Group__8 : rule__BlockFunction__Group__8__Impl rule__BlockFunction__Group__9 ;
    public final void rule__BlockFunction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2656:1: ( rule__BlockFunction__Group__8__Impl rule__BlockFunction__Group__9 )
            // InternalPortugolParser.g:2657:2: rule__BlockFunction__Group__8__Impl rule__BlockFunction__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__BlockFunction__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockFunction__Group__9();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockFunction__Group__8"


    // $ANTLR start "rule__BlockFunction__Group__8__Impl"
    // InternalPortugolParser.g:2664:1: rule__BlockFunction__Group__8__Impl : ( Inicio ) ;
    public final void rule__BlockFunction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2668:1: ( ( Inicio ) )
            // InternalPortugolParser.g:2669:1: ( Inicio )
            {
            // InternalPortugolParser.g:2669:1: ( Inicio )
            // InternalPortugolParser.g:2670:2: Inicio
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getInicioKeyword_8()); 
            }
            match(input,Inicio,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getInicioKeyword_8()); 
            }

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
    // $ANTLR end "rule__BlockFunction__Group__8__Impl"


    // $ANTLR start "rule__BlockFunction__Group__9"
    // InternalPortugolParser.g:2679:1: rule__BlockFunction__Group__9 : rule__BlockFunction__Group__9__Impl rule__BlockFunction__Group__10 ;
    public final void rule__BlockFunction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2683:1: ( rule__BlockFunction__Group__9__Impl rule__BlockFunction__Group__10 )
            // InternalPortugolParser.g:2684:2: rule__BlockFunction__Group__9__Impl rule__BlockFunction__Group__10
            {
            pushFollow(FOLLOW_17);
            rule__BlockFunction__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockFunction__Group__10();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockFunction__Group__9"


    // $ANTLR start "rule__BlockFunction__Group__9__Impl"
    // InternalPortugolParser.g:2691:1: rule__BlockFunction__Group__9__Impl : ( ( ( rule__BlockFunction__CommandsAssignment_9 ) ) ( ( rule__BlockFunction__CommandsAssignment_9 )* ) ) ;
    public final void rule__BlockFunction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2695:1: ( ( ( ( rule__BlockFunction__CommandsAssignment_9 ) ) ( ( rule__BlockFunction__CommandsAssignment_9 )* ) ) )
            // InternalPortugolParser.g:2696:1: ( ( ( rule__BlockFunction__CommandsAssignment_9 ) ) ( ( rule__BlockFunction__CommandsAssignment_9 )* ) )
            {
            // InternalPortugolParser.g:2696:1: ( ( ( rule__BlockFunction__CommandsAssignment_9 ) ) ( ( rule__BlockFunction__CommandsAssignment_9 )* ) )
            // InternalPortugolParser.g:2697:2: ( ( rule__BlockFunction__CommandsAssignment_9 ) ) ( ( rule__BlockFunction__CommandsAssignment_9 )* )
            {
            // InternalPortugolParser.g:2697:2: ( ( rule__BlockFunction__CommandsAssignment_9 ) )
            // InternalPortugolParser.g:2698:3: ( rule__BlockFunction__CommandsAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getCommandsAssignment_9()); 
            }
            // InternalPortugolParser.g:2699:3: ( rule__BlockFunction__CommandsAssignment_9 )
            // InternalPortugolParser.g:2699:4: rule__BlockFunction__CommandsAssignment_9
            {
            pushFollow(FOLLOW_18);
            rule__BlockFunction__CommandsAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getCommandsAssignment_9()); 
            }

            }

            // InternalPortugolParser.g:2702:2: ( ( rule__BlockFunction__CommandsAssignment_9 )* )
            // InternalPortugolParser.g:2703:3: ( rule__BlockFunction__CommandsAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getCommandsAssignment_9()); 
            }
            // InternalPortugolParser.g:2704:3: ( rule__BlockFunction__CommandsAssignment_9 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Interrompa||(LA24_0>=Enquanto && LA24_0<=Escreva)||LA24_0==Retorne||(LA24_0>=Maiusc && LA24_0<=Copia)||LA24_0==Raizq||(LA24_0>=Leia && LA24_0<=Para)||LA24_0==NOT||(LA24_0>=Pi && LA24_0<=Se)||LA24_0==LeftParenthesis||LA24_0==HyphenMinus||(LA24_0>=RULE_INT && LA24_0<=RULE_STRING)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPortugolParser.g:2704:4: rule__BlockFunction__CommandsAssignment_9
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__BlockFunction__CommandsAssignment_9();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getCommandsAssignment_9()); 
            }

            }


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
    // $ANTLR end "rule__BlockFunction__Group__9__Impl"


    // $ANTLR start "rule__BlockFunction__Group__10"
    // InternalPortugolParser.g:2713:1: rule__BlockFunction__Group__10 : rule__BlockFunction__Group__10__Impl ;
    public final void rule__BlockFunction__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2717:1: ( rule__BlockFunction__Group__10__Impl )
            // InternalPortugolParser.g:2718:2: rule__BlockFunction__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockFunction__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockFunction__Group__10"


    // $ANTLR start "rule__BlockFunction__Group__10__Impl"
    // InternalPortugolParser.g:2724:1: rule__BlockFunction__Group__10__Impl : ( Fimfuncao ) ;
    public final void rule__BlockFunction__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2728:1: ( ( Fimfuncao ) )
            // InternalPortugolParser.g:2729:1: ( Fimfuncao )
            {
            // InternalPortugolParser.g:2729:1: ( Fimfuncao )
            // InternalPortugolParser.g:2730:2: Fimfuncao
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getFimfuncaoKeyword_10()); 
            }
            match(input,Fimfuncao,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getFimfuncaoKeyword_10()); 
            }

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
    // $ANTLR end "rule__BlockFunction__Group__10__Impl"


    // $ANTLR start "rule__BlockFunction__Group_3__0"
    // InternalPortugolParser.g:2740:1: rule__BlockFunction__Group_3__0 : rule__BlockFunction__Group_3__0__Impl rule__BlockFunction__Group_3__1 ;
    public final void rule__BlockFunction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2744:1: ( rule__BlockFunction__Group_3__0__Impl rule__BlockFunction__Group_3__1 )
            // InternalPortugolParser.g:2745:2: rule__BlockFunction__Group_3__0__Impl rule__BlockFunction__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__BlockFunction__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockFunction__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockFunction__Group_3__0"


    // $ANTLR start "rule__BlockFunction__Group_3__0__Impl"
    // InternalPortugolParser.g:2752:1: rule__BlockFunction__Group_3__0__Impl : ( ( rule__BlockFunction__ParamListAssignment_3_0 ) ) ;
    public final void rule__BlockFunction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2756:1: ( ( ( rule__BlockFunction__ParamListAssignment_3_0 ) ) )
            // InternalPortugolParser.g:2757:1: ( ( rule__BlockFunction__ParamListAssignment_3_0 ) )
            {
            // InternalPortugolParser.g:2757:1: ( ( rule__BlockFunction__ParamListAssignment_3_0 ) )
            // InternalPortugolParser.g:2758:2: ( rule__BlockFunction__ParamListAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getParamListAssignment_3_0()); 
            }
            // InternalPortugolParser.g:2759:2: ( rule__BlockFunction__ParamListAssignment_3_0 )
            // InternalPortugolParser.g:2759:3: rule__BlockFunction__ParamListAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__BlockFunction__ParamListAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getParamListAssignment_3_0()); 
            }

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
    // $ANTLR end "rule__BlockFunction__Group_3__0__Impl"


    // $ANTLR start "rule__BlockFunction__Group_3__1"
    // InternalPortugolParser.g:2767:1: rule__BlockFunction__Group_3__1 : rule__BlockFunction__Group_3__1__Impl ;
    public final void rule__BlockFunction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2771:1: ( rule__BlockFunction__Group_3__1__Impl )
            // InternalPortugolParser.g:2772:2: rule__BlockFunction__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockFunction__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockFunction__Group_3__1"


    // $ANTLR start "rule__BlockFunction__Group_3__1__Impl"
    // InternalPortugolParser.g:2778:1: rule__BlockFunction__Group_3__1__Impl : ( ( rule__BlockFunction__Group_3_1__0 )* ) ;
    public final void rule__BlockFunction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2782:1: ( ( ( rule__BlockFunction__Group_3_1__0 )* ) )
            // InternalPortugolParser.g:2783:1: ( ( rule__BlockFunction__Group_3_1__0 )* )
            {
            // InternalPortugolParser.g:2783:1: ( ( rule__BlockFunction__Group_3_1__0 )* )
            // InternalPortugolParser.g:2784:2: ( rule__BlockFunction__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getGroup_3_1()); 
            }
            // InternalPortugolParser.g:2785:2: ( rule__BlockFunction__Group_3_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==Semicolon) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPortugolParser.g:2785:3: rule__BlockFunction__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__BlockFunction__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getGroup_3_1()); 
            }

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
    // $ANTLR end "rule__BlockFunction__Group_3__1__Impl"


    // $ANTLR start "rule__BlockFunction__Group_3_1__0"
    // InternalPortugolParser.g:2794:1: rule__BlockFunction__Group_3_1__0 : rule__BlockFunction__Group_3_1__0__Impl rule__BlockFunction__Group_3_1__1 ;
    public final void rule__BlockFunction__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2798:1: ( rule__BlockFunction__Group_3_1__0__Impl rule__BlockFunction__Group_3_1__1 )
            // InternalPortugolParser.g:2799:2: rule__BlockFunction__Group_3_1__0__Impl rule__BlockFunction__Group_3_1__1
            {
            pushFollow(FOLLOW_7);
            rule__BlockFunction__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockFunction__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockFunction__Group_3_1__0"


    // $ANTLR start "rule__BlockFunction__Group_3_1__0__Impl"
    // InternalPortugolParser.g:2806:1: rule__BlockFunction__Group_3_1__0__Impl : ( Semicolon ) ;
    public final void rule__BlockFunction__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2810:1: ( ( Semicolon ) )
            // InternalPortugolParser.g:2811:1: ( Semicolon )
            {
            // InternalPortugolParser.g:2811:1: ( Semicolon )
            // InternalPortugolParser.g:2812:2: Semicolon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getSemicolonKeyword_3_1_0()); 
            }
            match(input,Semicolon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getSemicolonKeyword_3_1_0()); 
            }

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
    // $ANTLR end "rule__BlockFunction__Group_3_1__0__Impl"


    // $ANTLR start "rule__BlockFunction__Group_3_1__1"
    // InternalPortugolParser.g:2821:1: rule__BlockFunction__Group_3_1__1 : rule__BlockFunction__Group_3_1__1__Impl ;
    public final void rule__BlockFunction__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2825:1: ( rule__BlockFunction__Group_3_1__1__Impl )
            // InternalPortugolParser.g:2826:2: rule__BlockFunction__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockFunction__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockFunction__Group_3_1__1"


    // $ANTLR start "rule__BlockFunction__Group_3_1__1__Impl"
    // InternalPortugolParser.g:2832:1: rule__BlockFunction__Group_3_1__1__Impl : ( ( rule__BlockFunction__ParamListAssignment_3_1_1 ) ) ;
    public final void rule__BlockFunction__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2836:1: ( ( ( rule__BlockFunction__ParamListAssignment_3_1_1 ) ) )
            // InternalPortugolParser.g:2837:1: ( ( rule__BlockFunction__ParamListAssignment_3_1_1 ) )
            {
            // InternalPortugolParser.g:2837:1: ( ( rule__BlockFunction__ParamListAssignment_3_1_1 ) )
            // InternalPortugolParser.g:2838:2: ( rule__BlockFunction__ParamListAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getParamListAssignment_3_1_1()); 
            }
            // InternalPortugolParser.g:2839:2: ( rule__BlockFunction__ParamListAssignment_3_1_1 )
            // InternalPortugolParser.g:2839:3: rule__BlockFunction__ParamListAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BlockFunction__ParamListAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getParamListAssignment_3_1_1()); 
            }

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
    // $ANTLR end "rule__BlockFunction__Group_3_1__1__Impl"


    // $ANTLR start "rule__BlockProcedure__Group__0"
    // InternalPortugolParser.g:2848:1: rule__BlockProcedure__Group__0 : rule__BlockProcedure__Group__0__Impl rule__BlockProcedure__Group__1 ;
    public final void rule__BlockProcedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2852:1: ( rule__BlockProcedure__Group__0__Impl rule__BlockProcedure__Group__1 )
            // InternalPortugolParser.g:2853:2: rule__BlockProcedure__Group__0__Impl rule__BlockProcedure__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__BlockProcedure__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockProcedure__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockProcedure__Group__0"


    // $ANTLR start "rule__BlockProcedure__Group__0__Impl"
    // InternalPortugolParser.g:2860:1: rule__BlockProcedure__Group__0__Impl : ( Procedimento ) ;
    public final void rule__BlockProcedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2864:1: ( ( Procedimento ) )
            // InternalPortugolParser.g:2865:1: ( Procedimento )
            {
            // InternalPortugolParser.g:2865:1: ( Procedimento )
            // InternalPortugolParser.g:2866:2: Procedimento
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getProcedimentoKeyword_0()); 
            }
            match(input,Procedimento,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getProcedimentoKeyword_0()); 
            }

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
    // $ANTLR end "rule__BlockProcedure__Group__0__Impl"


    // $ANTLR start "rule__BlockProcedure__Group__1"
    // InternalPortugolParser.g:2875:1: rule__BlockProcedure__Group__1 : rule__BlockProcedure__Group__1__Impl rule__BlockProcedure__Group__2 ;
    public final void rule__BlockProcedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2879:1: ( rule__BlockProcedure__Group__1__Impl rule__BlockProcedure__Group__2 )
            // InternalPortugolParser.g:2880:2: rule__BlockProcedure__Group__1__Impl rule__BlockProcedure__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__BlockProcedure__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockProcedure__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockProcedure__Group__1"


    // $ANTLR start "rule__BlockProcedure__Group__1__Impl"
    // InternalPortugolParser.g:2887:1: rule__BlockProcedure__Group__1__Impl : ( ( rule__BlockProcedure__ProcedureNameAssignment_1 ) ) ;
    public final void rule__BlockProcedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2891:1: ( ( ( rule__BlockProcedure__ProcedureNameAssignment_1 ) ) )
            // InternalPortugolParser.g:2892:1: ( ( rule__BlockProcedure__ProcedureNameAssignment_1 ) )
            {
            // InternalPortugolParser.g:2892:1: ( ( rule__BlockProcedure__ProcedureNameAssignment_1 ) )
            // InternalPortugolParser.g:2893:2: ( rule__BlockProcedure__ProcedureNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getProcedureNameAssignment_1()); 
            }
            // InternalPortugolParser.g:2894:2: ( rule__BlockProcedure__ProcedureNameAssignment_1 )
            // InternalPortugolParser.g:2894:3: rule__BlockProcedure__ProcedureNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BlockProcedure__ProcedureNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getProcedureNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__BlockProcedure__Group__1__Impl"


    // $ANTLR start "rule__BlockProcedure__Group__2"
    // InternalPortugolParser.g:2902:1: rule__BlockProcedure__Group__2 : rule__BlockProcedure__Group__2__Impl rule__BlockProcedure__Group__3 ;
    public final void rule__BlockProcedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2906:1: ( rule__BlockProcedure__Group__2__Impl rule__BlockProcedure__Group__3 )
            // InternalPortugolParser.g:2907:2: rule__BlockProcedure__Group__2__Impl rule__BlockProcedure__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__BlockProcedure__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockProcedure__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockProcedure__Group__2"


    // $ANTLR start "rule__BlockProcedure__Group__2__Impl"
    // InternalPortugolParser.g:2914:1: rule__BlockProcedure__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__BlockProcedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2918:1: ( ( LeftParenthesis ) )
            // InternalPortugolParser.g:2919:1: ( LeftParenthesis )
            {
            // InternalPortugolParser.g:2919:1: ( LeftParenthesis )
            // InternalPortugolParser.g:2920:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getLeftParenthesisKeyword_2()); 
            }

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
    // $ANTLR end "rule__BlockProcedure__Group__2__Impl"


    // $ANTLR start "rule__BlockProcedure__Group__3"
    // InternalPortugolParser.g:2929:1: rule__BlockProcedure__Group__3 : rule__BlockProcedure__Group__3__Impl rule__BlockProcedure__Group__4 ;
    public final void rule__BlockProcedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2933:1: ( rule__BlockProcedure__Group__3__Impl rule__BlockProcedure__Group__4 )
            // InternalPortugolParser.g:2934:2: rule__BlockProcedure__Group__3__Impl rule__BlockProcedure__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__BlockProcedure__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockProcedure__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockProcedure__Group__3"


    // $ANTLR start "rule__BlockProcedure__Group__3__Impl"
    // InternalPortugolParser.g:2941:1: rule__BlockProcedure__Group__3__Impl : ( ( rule__BlockProcedure__Group_3__0 )? ) ;
    public final void rule__BlockProcedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2945:1: ( ( ( rule__BlockProcedure__Group_3__0 )? ) )
            // InternalPortugolParser.g:2946:1: ( ( rule__BlockProcedure__Group_3__0 )? )
            {
            // InternalPortugolParser.g:2946:1: ( ( rule__BlockProcedure__Group_3__0 )? )
            // InternalPortugolParser.g:2947:2: ( rule__BlockProcedure__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getGroup_3()); 
            }
            // InternalPortugolParser.g:2948:2: ( rule__BlockProcedure__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPortugolParser.g:2948:3: rule__BlockProcedure__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BlockProcedure__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getGroup_3()); 
            }

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
    // $ANTLR end "rule__BlockProcedure__Group__3__Impl"


    // $ANTLR start "rule__BlockProcedure__Group__4"
    // InternalPortugolParser.g:2956:1: rule__BlockProcedure__Group__4 : rule__BlockProcedure__Group__4__Impl rule__BlockProcedure__Group__5 ;
    public final void rule__BlockProcedure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2960:1: ( rule__BlockProcedure__Group__4__Impl rule__BlockProcedure__Group__5 )
            // InternalPortugolParser.g:2961:2: rule__BlockProcedure__Group__4__Impl rule__BlockProcedure__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__BlockProcedure__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockProcedure__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockProcedure__Group__4"


    // $ANTLR start "rule__BlockProcedure__Group__4__Impl"
    // InternalPortugolParser.g:2968:1: rule__BlockProcedure__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__BlockProcedure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2972:1: ( ( RightParenthesis ) )
            // InternalPortugolParser.g:2973:1: ( RightParenthesis )
            {
            // InternalPortugolParser.g:2973:1: ( RightParenthesis )
            // InternalPortugolParser.g:2974:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getRightParenthesisKeyword_4()); 
            }

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
    // $ANTLR end "rule__BlockProcedure__Group__4__Impl"


    // $ANTLR start "rule__BlockProcedure__Group__5"
    // InternalPortugolParser.g:2983:1: rule__BlockProcedure__Group__5 : rule__BlockProcedure__Group__5__Impl rule__BlockProcedure__Group__6 ;
    public final void rule__BlockProcedure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2987:1: ( rule__BlockProcedure__Group__5__Impl rule__BlockProcedure__Group__6 )
            // InternalPortugolParser.g:2988:2: rule__BlockProcedure__Group__5__Impl rule__BlockProcedure__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__BlockProcedure__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockProcedure__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockProcedure__Group__5"


    // $ANTLR start "rule__BlockProcedure__Group__5__Impl"
    // InternalPortugolParser.g:2995:1: rule__BlockProcedure__Group__5__Impl : ( ( rule__BlockProcedure__DeclarationsAssignment_5 )? ) ;
    public final void rule__BlockProcedure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2999:1: ( ( ( rule__BlockProcedure__DeclarationsAssignment_5 )? ) )
            // InternalPortugolParser.g:3000:1: ( ( rule__BlockProcedure__DeclarationsAssignment_5 )? )
            {
            // InternalPortugolParser.g:3000:1: ( ( rule__BlockProcedure__DeclarationsAssignment_5 )? )
            // InternalPortugolParser.g:3001:2: ( rule__BlockProcedure__DeclarationsAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getDeclarationsAssignment_5()); 
            }
            // InternalPortugolParser.g:3002:2: ( rule__BlockProcedure__DeclarationsAssignment_5 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Var) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPortugolParser.g:3002:3: rule__BlockProcedure__DeclarationsAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__BlockProcedure__DeclarationsAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getDeclarationsAssignment_5()); 
            }

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
    // $ANTLR end "rule__BlockProcedure__Group__5__Impl"


    // $ANTLR start "rule__BlockProcedure__Group__6"
    // InternalPortugolParser.g:3010:1: rule__BlockProcedure__Group__6 : rule__BlockProcedure__Group__6__Impl rule__BlockProcedure__Group__7 ;
    public final void rule__BlockProcedure__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3014:1: ( rule__BlockProcedure__Group__6__Impl rule__BlockProcedure__Group__7 )
            // InternalPortugolParser.g:3015:2: rule__BlockProcedure__Group__6__Impl rule__BlockProcedure__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__BlockProcedure__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockProcedure__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockProcedure__Group__6"


    // $ANTLR start "rule__BlockProcedure__Group__6__Impl"
    // InternalPortugolParser.g:3022:1: rule__BlockProcedure__Group__6__Impl : ( Inicio ) ;
    public final void rule__BlockProcedure__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3026:1: ( ( Inicio ) )
            // InternalPortugolParser.g:3027:1: ( Inicio )
            {
            // InternalPortugolParser.g:3027:1: ( Inicio )
            // InternalPortugolParser.g:3028:2: Inicio
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getInicioKeyword_6()); 
            }
            match(input,Inicio,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getInicioKeyword_6()); 
            }

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
    // $ANTLR end "rule__BlockProcedure__Group__6__Impl"


    // $ANTLR start "rule__BlockProcedure__Group__7"
    // InternalPortugolParser.g:3037:1: rule__BlockProcedure__Group__7 : rule__BlockProcedure__Group__7__Impl rule__BlockProcedure__Group__8 ;
    public final void rule__BlockProcedure__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3041:1: ( rule__BlockProcedure__Group__7__Impl rule__BlockProcedure__Group__8 )
            // InternalPortugolParser.g:3042:2: rule__BlockProcedure__Group__7__Impl rule__BlockProcedure__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__BlockProcedure__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockProcedure__Group__8();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockProcedure__Group__7"


    // $ANTLR start "rule__BlockProcedure__Group__7__Impl"
    // InternalPortugolParser.g:3049:1: rule__BlockProcedure__Group__7__Impl : ( ( ( rule__BlockProcedure__CommandsAssignment_7 ) ) ( ( rule__BlockProcedure__CommandsAssignment_7 )* ) ) ;
    public final void rule__BlockProcedure__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3053:1: ( ( ( ( rule__BlockProcedure__CommandsAssignment_7 ) ) ( ( rule__BlockProcedure__CommandsAssignment_7 )* ) ) )
            // InternalPortugolParser.g:3054:1: ( ( ( rule__BlockProcedure__CommandsAssignment_7 ) ) ( ( rule__BlockProcedure__CommandsAssignment_7 )* ) )
            {
            // InternalPortugolParser.g:3054:1: ( ( ( rule__BlockProcedure__CommandsAssignment_7 ) ) ( ( rule__BlockProcedure__CommandsAssignment_7 )* ) )
            // InternalPortugolParser.g:3055:2: ( ( rule__BlockProcedure__CommandsAssignment_7 ) ) ( ( rule__BlockProcedure__CommandsAssignment_7 )* )
            {
            // InternalPortugolParser.g:3055:2: ( ( rule__BlockProcedure__CommandsAssignment_7 ) )
            // InternalPortugolParser.g:3056:3: ( rule__BlockProcedure__CommandsAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getCommandsAssignment_7()); 
            }
            // InternalPortugolParser.g:3057:3: ( rule__BlockProcedure__CommandsAssignment_7 )
            // InternalPortugolParser.g:3057:4: rule__BlockProcedure__CommandsAssignment_7
            {
            pushFollow(FOLLOW_18);
            rule__BlockProcedure__CommandsAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getCommandsAssignment_7()); 
            }

            }

            // InternalPortugolParser.g:3060:2: ( ( rule__BlockProcedure__CommandsAssignment_7 )* )
            // InternalPortugolParser.g:3061:3: ( rule__BlockProcedure__CommandsAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getCommandsAssignment_7()); 
            }
            // InternalPortugolParser.g:3062:3: ( rule__BlockProcedure__CommandsAssignment_7 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==Interrompa||(LA28_0>=Enquanto && LA28_0<=Escreva)||LA28_0==Retorne||(LA28_0>=Maiusc && LA28_0<=Copia)||LA28_0==Raizq||(LA28_0>=Leia && LA28_0<=Para)||LA28_0==NOT||(LA28_0>=Pi && LA28_0<=Se)||LA28_0==LeftParenthesis||LA28_0==HyphenMinus||(LA28_0>=RULE_INT && LA28_0<=RULE_STRING)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalPortugolParser.g:3062:4: rule__BlockProcedure__CommandsAssignment_7
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__BlockProcedure__CommandsAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getCommandsAssignment_7()); 
            }

            }


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
    // $ANTLR end "rule__BlockProcedure__Group__7__Impl"


    // $ANTLR start "rule__BlockProcedure__Group__8"
    // InternalPortugolParser.g:3071:1: rule__BlockProcedure__Group__8 : rule__BlockProcedure__Group__8__Impl ;
    public final void rule__BlockProcedure__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3075:1: ( rule__BlockProcedure__Group__8__Impl )
            // InternalPortugolParser.g:3076:2: rule__BlockProcedure__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockProcedure__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockProcedure__Group__8"


    // $ANTLR start "rule__BlockProcedure__Group__8__Impl"
    // InternalPortugolParser.g:3082:1: rule__BlockProcedure__Group__8__Impl : ( Fimprocedimento ) ;
    public final void rule__BlockProcedure__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3086:1: ( ( Fimprocedimento ) )
            // InternalPortugolParser.g:3087:1: ( Fimprocedimento )
            {
            // InternalPortugolParser.g:3087:1: ( Fimprocedimento )
            // InternalPortugolParser.g:3088:2: Fimprocedimento
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getFimprocedimentoKeyword_8()); 
            }
            match(input,Fimprocedimento,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getFimprocedimentoKeyword_8()); 
            }

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
    // $ANTLR end "rule__BlockProcedure__Group__8__Impl"


    // $ANTLR start "rule__BlockProcedure__Group_3__0"
    // InternalPortugolParser.g:3098:1: rule__BlockProcedure__Group_3__0 : rule__BlockProcedure__Group_3__0__Impl rule__BlockProcedure__Group_3__1 ;
    public final void rule__BlockProcedure__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3102:1: ( rule__BlockProcedure__Group_3__0__Impl rule__BlockProcedure__Group_3__1 )
            // InternalPortugolParser.g:3103:2: rule__BlockProcedure__Group_3__0__Impl rule__BlockProcedure__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__BlockProcedure__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockProcedure__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockProcedure__Group_3__0"


    // $ANTLR start "rule__BlockProcedure__Group_3__0__Impl"
    // InternalPortugolParser.g:3110:1: rule__BlockProcedure__Group_3__0__Impl : ( ( rule__BlockProcedure__ParamListAssignment_3_0 ) ) ;
    public final void rule__BlockProcedure__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3114:1: ( ( ( rule__BlockProcedure__ParamListAssignment_3_0 ) ) )
            // InternalPortugolParser.g:3115:1: ( ( rule__BlockProcedure__ParamListAssignment_3_0 ) )
            {
            // InternalPortugolParser.g:3115:1: ( ( rule__BlockProcedure__ParamListAssignment_3_0 ) )
            // InternalPortugolParser.g:3116:2: ( rule__BlockProcedure__ParamListAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getParamListAssignment_3_0()); 
            }
            // InternalPortugolParser.g:3117:2: ( rule__BlockProcedure__ParamListAssignment_3_0 )
            // InternalPortugolParser.g:3117:3: rule__BlockProcedure__ParamListAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__BlockProcedure__ParamListAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getParamListAssignment_3_0()); 
            }

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
    // $ANTLR end "rule__BlockProcedure__Group_3__0__Impl"


    // $ANTLR start "rule__BlockProcedure__Group_3__1"
    // InternalPortugolParser.g:3125:1: rule__BlockProcedure__Group_3__1 : rule__BlockProcedure__Group_3__1__Impl ;
    public final void rule__BlockProcedure__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3129:1: ( rule__BlockProcedure__Group_3__1__Impl )
            // InternalPortugolParser.g:3130:2: rule__BlockProcedure__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockProcedure__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockProcedure__Group_3__1"


    // $ANTLR start "rule__BlockProcedure__Group_3__1__Impl"
    // InternalPortugolParser.g:3136:1: rule__BlockProcedure__Group_3__1__Impl : ( ( rule__BlockProcedure__Group_3_1__0 )* ) ;
    public final void rule__BlockProcedure__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3140:1: ( ( ( rule__BlockProcedure__Group_3_1__0 )* ) )
            // InternalPortugolParser.g:3141:1: ( ( rule__BlockProcedure__Group_3_1__0 )* )
            {
            // InternalPortugolParser.g:3141:1: ( ( rule__BlockProcedure__Group_3_1__0 )* )
            // InternalPortugolParser.g:3142:2: ( rule__BlockProcedure__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getGroup_3_1()); 
            }
            // InternalPortugolParser.g:3143:2: ( rule__BlockProcedure__Group_3_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Semicolon) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPortugolParser.g:3143:3: rule__BlockProcedure__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__BlockProcedure__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getGroup_3_1()); 
            }

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
    // $ANTLR end "rule__BlockProcedure__Group_3__1__Impl"


    // $ANTLR start "rule__BlockProcedure__Group_3_1__0"
    // InternalPortugolParser.g:3152:1: rule__BlockProcedure__Group_3_1__0 : rule__BlockProcedure__Group_3_1__0__Impl rule__BlockProcedure__Group_3_1__1 ;
    public final void rule__BlockProcedure__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3156:1: ( rule__BlockProcedure__Group_3_1__0__Impl rule__BlockProcedure__Group_3_1__1 )
            // InternalPortugolParser.g:3157:2: rule__BlockProcedure__Group_3_1__0__Impl rule__BlockProcedure__Group_3_1__1
            {
            pushFollow(FOLLOW_7);
            rule__BlockProcedure__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockProcedure__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockProcedure__Group_3_1__0"


    // $ANTLR start "rule__BlockProcedure__Group_3_1__0__Impl"
    // InternalPortugolParser.g:3164:1: rule__BlockProcedure__Group_3_1__0__Impl : ( Semicolon ) ;
    public final void rule__BlockProcedure__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3168:1: ( ( Semicolon ) )
            // InternalPortugolParser.g:3169:1: ( Semicolon )
            {
            // InternalPortugolParser.g:3169:1: ( Semicolon )
            // InternalPortugolParser.g:3170:2: Semicolon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getSemicolonKeyword_3_1_0()); 
            }
            match(input,Semicolon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getSemicolonKeyword_3_1_0()); 
            }

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
    // $ANTLR end "rule__BlockProcedure__Group_3_1__0__Impl"


    // $ANTLR start "rule__BlockProcedure__Group_3_1__1"
    // InternalPortugolParser.g:3179:1: rule__BlockProcedure__Group_3_1__1 : rule__BlockProcedure__Group_3_1__1__Impl ;
    public final void rule__BlockProcedure__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3183:1: ( rule__BlockProcedure__Group_3_1__1__Impl )
            // InternalPortugolParser.g:3184:2: rule__BlockProcedure__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockProcedure__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockProcedure__Group_3_1__1"


    // $ANTLR start "rule__BlockProcedure__Group_3_1__1__Impl"
    // InternalPortugolParser.g:3190:1: rule__BlockProcedure__Group_3_1__1__Impl : ( ( rule__BlockProcedure__ParamListAssignment_3_1_1 ) ) ;
    public final void rule__BlockProcedure__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3194:1: ( ( ( rule__BlockProcedure__ParamListAssignment_3_1_1 ) ) )
            // InternalPortugolParser.g:3195:1: ( ( rule__BlockProcedure__ParamListAssignment_3_1_1 ) )
            {
            // InternalPortugolParser.g:3195:1: ( ( rule__BlockProcedure__ParamListAssignment_3_1_1 ) )
            // InternalPortugolParser.g:3196:2: ( rule__BlockProcedure__ParamListAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getParamListAssignment_3_1_1()); 
            }
            // InternalPortugolParser.g:3197:2: ( rule__BlockProcedure__ParamListAssignment_3_1_1 )
            // InternalPortugolParser.g:3197:3: rule__BlockProcedure__ParamListAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BlockProcedure__ParamListAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getParamListAssignment_3_1_1()); 
            }

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
    // $ANTLR end "rule__BlockProcedure__Group_3_1__1__Impl"


    // $ANTLR start "rule__BlockCommand__Group__0"
    // InternalPortugolParser.g:3206:1: rule__BlockCommand__Group__0 : rule__BlockCommand__Group__0__Impl rule__BlockCommand__Group__1 ;
    public final void rule__BlockCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3210:1: ( rule__BlockCommand__Group__0__Impl rule__BlockCommand__Group__1 )
            // InternalPortugolParser.g:3211:2: rule__BlockCommand__Group__0__Impl rule__BlockCommand__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__BlockCommand__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockCommand__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockCommand__Group__0"


    // $ANTLR start "rule__BlockCommand__Group__0__Impl"
    // InternalPortugolParser.g:3218:1: rule__BlockCommand__Group__0__Impl : ( Inicio ) ;
    public final void rule__BlockCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3222:1: ( ( Inicio ) )
            // InternalPortugolParser.g:3223:1: ( Inicio )
            {
            // InternalPortugolParser.g:3223:1: ( Inicio )
            // InternalPortugolParser.g:3224:2: Inicio
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getInicioKeyword_0()); 
            }
            match(input,Inicio,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockCommandAccess().getInicioKeyword_0()); 
            }

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
    // $ANTLR end "rule__BlockCommand__Group__0__Impl"


    // $ANTLR start "rule__BlockCommand__Group__1"
    // InternalPortugolParser.g:3233:1: rule__BlockCommand__Group__1 : rule__BlockCommand__Group__1__Impl rule__BlockCommand__Group__2 ;
    public final void rule__BlockCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3237:1: ( rule__BlockCommand__Group__1__Impl rule__BlockCommand__Group__2 )
            // InternalPortugolParser.g:3238:2: rule__BlockCommand__Group__1__Impl rule__BlockCommand__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__BlockCommand__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockCommand__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockCommand__Group__1"


    // $ANTLR start "rule__BlockCommand__Group__1__Impl"
    // InternalPortugolParser.g:3245:1: rule__BlockCommand__Group__1__Impl : ( ( ( rule__BlockCommand__CommandsAssignment_1 ) ) ( ( rule__BlockCommand__CommandsAssignment_1 )* ) ) ;
    public final void rule__BlockCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3249:1: ( ( ( ( rule__BlockCommand__CommandsAssignment_1 ) ) ( ( rule__BlockCommand__CommandsAssignment_1 )* ) ) )
            // InternalPortugolParser.g:3250:1: ( ( ( rule__BlockCommand__CommandsAssignment_1 ) ) ( ( rule__BlockCommand__CommandsAssignment_1 )* ) )
            {
            // InternalPortugolParser.g:3250:1: ( ( ( rule__BlockCommand__CommandsAssignment_1 ) ) ( ( rule__BlockCommand__CommandsAssignment_1 )* ) )
            // InternalPortugolParser.g:3251:2: ( ( rule__BlockCommand__CommandsAssignment_1 ) ) ( ( rule__BlockCommand__CommandsAssignment_1 )* )
            {
            // InternalPortugolParser.g:3251:2: ( ( rule__BlockCommand__CommandsAssignment_1 ) )
            // InternalPortugolParser.g:3252:3: ( rule__BlockCommand__CommandsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getCommandsAssignment_1()); 
            }
            // InternalPortugolParser.g:3253:3: ( rule__BlockCommand__CommandsAssignment_1 )
            // InternalPortugolParser.g:3253:4: rule__BlockCommand__CommandsAssignment_1
            {
            pushFollow(FOLLOW_18);
            rule__BlockCommand__CommandsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockCommandAccess().getCommandsAssignment_1()); 
            }

            }

            // InternalPortugolParser.g:3256:2: ( ( rule__BlockCommand__CommandsAssignment_1 )* )
            // InternalPortugolParser.g:3257:3: ( rule__BlockCommand__CommandsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getCommandsAssignment_1()); 
            }
            // InternalPortugolParser.g:3258:3: ( rule__BlockCommand__CommandsAssignment_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==Interrompa||(LA30_0>=Enquanto && LA30_0<=Escreva)||LA30_0==Retorne||(LA30_0>=Maiusc && LA30_0<=Copia)||LA30_0==Raizq||(LA30_0>=Leia && LA30_0<=Para)||LA30_0==NOT||(LA30_0>=Pi && LA30_0<=Se)||LA30_0==LeftParenthesis||LA30_0==HyphenMinus||(LA30_0>=RULE_INT && LA30_0<=RULE_STRING)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPortugolParser.g:3258:4: rule__BlockCommand__CommandsAssignment_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__BlockCommand__CommandsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockCommandAccess().getCommandsAssignment_1()); 
            }

            }


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
    // $ANTLR end "rule__BlockCommand__Group__1__Impl"


    // $ANTLR start "rule__BlockCommand__Group__2"
    // InternalPortugolParser.g:3267:1: rule__BlockCommand__Group__2 : rule__BlockCommand__Group__2__Impl ;
    public final void rule__BlockCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3271:1: ( rule__BlockCommand__Group__2__Impl )
            // InternalPortugolParser.g:3272:2: rule__BlockCommand__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockCommand__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BlockCommand__Group__2"


    // $ANTLR start "rule__BlockCommand__Group__2__Impl"
    // InternalPortugolParser.g:3278:1: rule__BlockCommand__Group__2__Impl : ( Fimalgoritmo ) ;
    public final void rule__BlockCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3282:1: ( ( Fimalgoritmo ) )
            // InternalPortugolParser.g:3283:1: ( Fimalgoritmo )
            {
            // InternalPortugolParser.g:3283:1: ( Fimalgoritmo )
            // InternalPortugolParser.g:3284:2: Fimalgoritmo
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getFimalgoritmoKeyword_2()); 
            }
            match(input,Fimalgoritmo,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockCommandAccess().getFimalgoritmoKeyword_2()); 
            }

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
    // $ANTLR end "rule__BlockCommand__Group__2__Impl"


    // $ANTLR start "rule__AbstractCommand__Group_0__0"
    // InternalPortugolParser.g:3294:1: rule__AbstractCommand__Group_0__0 : rule__AbstractCommand__Group_0__0__Impl rule__AbstractCommand__Group_0__1 ;
    public final void rule__AbstractCommand__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3298:1: ( rule__AbstractCommand__Group_0__0__Impl rule__AbstractCommand__Group_0__1 )
            // InternalPortugolParser.g:3299:2: rule__AbstractCommand__Group_0__0__Impl rule__AbstractCommand__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__AbstractCommand__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AbstractCommand__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AbstractCommand__Group_0__0"


    // $ANTLR start "rule__AbstractCommand__Group_0__0__Impl"
    // InternalPortugolParser.g:3306:1: rule__AbstractCommand__Group_0__0__Impl : ( ruleReadCommand ) ;
    public final void rule__AbstractCommand__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3310:1: ( ( ruleReadCommand ) )
            // InternalPortugolParser.g:3311:1: ( ruleReadCommand )
            {
            // InternalPortugolParser.g:3311:1: ( ruleReadCommand )
            // InternalPortugolParser.g:3312:2: ruleReadCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractCommandAccess().getReadCommandParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleReadCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractCommandAccess().getReadCommandParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__AbstractCommand__Group_0__0__Impl"


    // $ANTLR start "rule__AbstractCommand__Group_0__1"
    // InternalPortugolParser.g:3321:1: rule__AbstractCommand__Group_0__1 : rule__AbstractCommand__Group_0__1__Impl ;
    public final void rule__AbstractCommand__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3325:1: ( rule__AbstractCommand__Group_0__1__Impl )
            // InternalPortugolParser.g:3326:2: rule__AbstractCommand__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractCommand__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AbstractCommand__Group_0__1"


    // $ANTLR start "rule__AbstractCommand__Group_0__1__Impl"
    // InternalPortugolParser.g:3332:1: rule__AbstractCommand__Group_0__1__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__AbstractCommand__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3336:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugolParser.g:3337:1: ( ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:3337:1: ( ruleEND_COMMAND )
            // InternalPortugolParser.g:3338:2: ruleEND_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractCommandAccess().getEND_COMMANDParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleEND_COMMAND();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractCommandAccess().getEND_COMMANDParserRuleCall_0_1()); 
            }

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
    // $ANTLR end "rule__AbstractCommand__Group_0__1__Impl"


    // $ANTLR start "rule__AbstractCommand__Group_1__0"
    // InternalPortugolParser.g:3348:1: rule__AbstractCommand__Group_1__0 : rule__AbstractCommand__Group_1__0__Impl rule__AbstractCommand__Group_1__1 ;
    public final void rule__AbstractCommand__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3352:1: ( rule__AbstractCommand__Group_1__0__Impl rule__AbstractCommand__Group_1__1 )
            // InternalPortugolParser.g:3353:2: rule__AbstractCommand__Group_1__0__Impl rule__AbstractCommand__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__AbstractCommand__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AbstractCommand__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AbstractCommand__Group_1__0"


    // $ANTLR start "rule__AbstractCommand__Group_1__0__Impl"
    // InternalPortugolParser.g:3360:1: rule__AbstractCommand__Group_1__0__Impl : ( ruleWriteCommand ) ;
    public final void rule__AbstractCommand__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3364:1: ( ( ruleWriteCommand ) )
            // InternalPortugolParser.g:3365:1: ( ruleWriteCommand )
            {
            // InternalPortugolParser.g:3365:1: ( ruleWriteCommand )
            // InternalPortugolParser.g:3366:2: ruleWriteCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractCommandAccess().getWriteCommandParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleWriteCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractCommandAccess().getWriteCommandParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__AbstractCommand__Group_1__0__Impl"


    // $ANTLR start "rule__AbstractCommand__Group_1__1"
    // InternalPortugolParser.g:3375:1: rule__AbstractCommand__Group_1__1 : rule__AbstractCommand__Group_1__1__Impl ;
    public final void rule__AbstractCommand__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3379:1: ( rule__AbstractCommand__Group_1__1__Impl )
            // InternalPortugolParser.g:3380:2: rule__AbstractCommand__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractCommand__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AbstractCommand__Group_1__1"


    // $ANTLR start "rule__AbstractCommand__Group_1__1__Impl"
    // InternalPortugolParser.g:3386:1: rule__AbstractCommand__Group_1__1__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__AbstractCommand__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3390:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugolParser.g:3391:1: ( ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:3391:1: ( ruleEND_COMMAND )
            // InternalPortugolParser.g:3392:2: ruleEND_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractCommandAccess().getEND_COMMANDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleEND_COMMAND();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractCommandAccess().getEND_COMMANDParserRuleCall_1_1()); 
            }

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
    // $ANTLR end "rule__AbstractCommand__Group_1__1__Impl"


    // $ANTLR start "rule__AbstractCommand__Group_2__0"
    // InternalPortugolParser.g:3402:1: rule__AbstractCommand__Group_2__0 : rule__AbstractCommand__Group_2__0__Impl rule__AbstractCommand__Group_2__1 ;
    public final void rule__AbstractCommand__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3406:1: ( rule__AbstractCommand__Group_2__0__Impl rule__AbstractCommand__Group_2__1 )
            // InternalPortugolParser.g:3407:2: rule__AbstractCommand__Group_2__0__Impl rule__AbstractCommand__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__AbstractCommand__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AbstractCommand__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AbstractCommand__Group_2__0"


    // $ANTLR start "rule__AbstractCommand__Group_2__0__Impl"
    // InternalPortugolParser.g:3414:1: rule__AbstractCommand__Group_2__0__Impl : ( ruleExpression ) ;
    public final void rule__AbstractCommand__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3418:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:3419:1: ( ruleExpression )
            {
            // InternalPortugolParser.g:3419:1: ( ruleExpression )
            // InternalPortugolParser.g:3420:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractCommandAccess().getExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractCommandAccess().getExpressionParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__AbstractCommand__Group_2__0__Impl"


    // $ANTLR start "rule__AbstractCommand__Group_2__1"
    // InternalPortugolParser.g:3429:1: rule__AbstractCommand__Group_2__1 : rule__AbstractCommand__Group_2__1__Impl ;
    public final void rule__AbstractCommand__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3433:1: ( rule__AbstractCommand__Group_2__1__Impl )
            // InternalPortugolParser.g:3434:2: rule__AbstractCommand__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractCommand__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AbstractCommand__Group_2__1"


    // $ANTLR start "rule__AbstractCommand__Group_2__1__Impl"
    // InternalPortugolParser.g:3440:1: rule__AbstractCommand__Group_2__1__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__AbstractCommand__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3444:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugolParser.g:3445:1: ( ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:3445:1: ( ruleEND_COMMAND )
            // InternalPortugolParser.g:3446:2: ruleEND_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractCommandAccess().getEND_COMMANDParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleEND_COMMAND();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractCommandAccess().getEND_COMMANDParserRuleCall_2_1()); 
            }

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
    // $ANTLR end "rule__AbstractCommand__Group_2__1__Impl"


    // $ANTLR start "rule__AbstractCommand__Group_8__0"
    // InternalPortugolParser.g:3456:1: rule__AbstractCommand__Group_8__0 : rule__AbstractCommand__Group_8__0__Impl rule__AbstractCommand__Group_8__1 ;
    public final void rule__AbstractCommand__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3460:1: ( rule__AbstractCommand__Group_8__0__Impl rule__AbstractCommand__Group_8__1 )
            // InternalPortugolParser.g:3461:2: rule__AbstractCommand__Group_8__0__Impl rule__AbstractCommand__Group_8__1
            {
            pushFollow(FOLLOW_6);
            rule__AbstractCommand__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AbstractCommand__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AbstractCommand__Group_8__0"


    // $ANTLR start "rule__AbstractCommand__Group_8__0__Impl"
    // InternalPortugolParser.g:3468:1: rule__AbstractCommand__Group_8__0__Impl : ( ruleBreakStatement ) ;
    public final void rule__AbstractCommand__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3472:1: ( ( ruleBreakStatement ) )
            // InternalPortugolParser.g:3473:1: ( ruleBreakStatement )
            {
            // InternalPortugolParser.g:3473:1: ( ruleBreakStatement )
            // InternalPortugolParser.g:3474:2: ruleBreakStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractCommandAccess().getBreakStatementParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBreakStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractCommandAccess().getBreakStatementParserRuleCall_8_0()); 
            }

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
    // $ANTLR end "rule__AbstractCommand__Group_8__0__Impl"


    // $ANTLR start "rule__AbstractCommand__Group_8__1"
    // InternalPortugolParser.g:3483:1: rule__AbstractCommand__Group_8__1 : rule__AbstractCommand__Group_8__1__Impl ;
    public final void rule__AbstractCommand__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3487:1: ( rule__AbstractCommand__Group_8__1__Impl )
            // InternalPortugolParser.g:3488:2: rule__AbstractCommand__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractCommand__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AbstractCommand__Group_8__1"


    // $ANTLR start "rule__AbstractCommand__Group_8__1__Impl"
    // InternalPortugolParser.g:3494:1: rule__AbstractCommand__Group_8__1__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__AbstractCommand__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3498:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugolParser.g:3499:1: ( ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:3499:1: ( ruleEND_COMMAND )
            // InternalPortugolParser.g:3500:2: ruleEND_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractCommandAccess().getEND_COMMANDParserRuleCall_8_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleEND_COMMAND();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractCommandAccess().getEND_COMMANDParserRuleCall_8_1()); 
            }

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
    // $ANTLR end "rule__AbstractCommand__Group_8__1__Impl"


    // $ANTLR start "rule__AbstractCommand__Group_9__0"
    // InternalPortugolParser.g:3510:1: rule__AbstractCommand__Group_9__0 : rule__AbstractCommand__Group_9__0__Impl rule__AbstractCommand__Group_9__1 ;
    public final void rule__AbstractCommand__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3514:1: ( rule__AbstractCommand__Group_9__0__Impl rule__AbstractCommand__Group_9__1 )
            // InternalPortugolParser.g:3515:2: rule__AbstractCommand__Group_9__0__Impl rule__AbstractCommand__Group_9__1
            {
            pushFollow(FOLLOW_6);
            rule__AbstractCommand__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AbstractCommand__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AbstractCommand__Group_9__0"


    // $ANTLR start "rule__AbstractCommand__Group_9__0__Impl"
    // InternalPortugolParser.g:3522:1: rule__AbstractCommand__Group_9__0__Impl : ( ruleReturnStatement ) ;
    public final void rule__AbstractCommand__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3526:1: ( ( ruleReturnStatement ) )
            // InternalPortugolParser.g:3527:1: ( ruleReturnStatement )
            {
            // InternalPortugolParser.g:3527:1: ( ruleReturnStatement )
            // InternalPortugolParser.g:3528:2: ruleReturnStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractCommandAccess().getReturnStatementParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleReturnStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractCommandAccess().getReturnStatementParserRuleCall_9_0()); 
            }

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
    // $ANTLR end "rule__AbstractCommand__Group_9__0__Impl"


    // $ANTLR start "rule__AbstractCommand__Group_9__1"
    // InternalPortugolParser.g:3537:1: rule__AbstractCommand__Group_9__1 : rule__AbstractCommand__Group_9__1__Impl ;
    public final void rule__AbstractCommand__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3541:1: ( rule__AbstractCommand__Group_9__1__Impl )
            // InternalPortugolParser.g:3542:2: rule__AbstractCommand__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractCommand__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AbstractCommand__Group_9__1"


    // $ANTLR start "rule__AbstractCommand__Group_9__1__Impl"
    // InternalPortugolParser.g:3548:1: rule__AbstractCommand__Group_9__1__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__AbstractCommand__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3552:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugolParser.g:3553:1: ( ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:3553:1: ( ruleEND_COMMAND )
            // InternalPortugolParser.g:3554:2: ruleEND_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractCommandAccess().getEND_COMMANDParserRuleCall_9_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleEND_COMMAND();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractCommandAccess().getEND_COMMANDParserRuleCall_9_1()); 
            }

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
    // $ANTLR end "rule__AbstractCommand__Group_9__1__Impl"


    // $ANTLR start "rule__BreakStatement__Group__0"
    // InternalPortugolParser.g:3564:1: rule__BreakStatement__Group__0 : rule__BreakStatement__Group__0__Impl rule__BreakStatement__Group__1 ;
    public final void rule__BreakStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3568:1: ( rule__BreakStatement__Group__0__Impl rule__BreakStatement__Group__1 )
            // InternalPortugolParser.g:3569:2: rule__BreakStatement__Group__0__Impl rule__BreakStatement__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__BreakStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BreakStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BreakStatement__Group__0"


    // $ANTLR start "rule__BreakStatement__Group__0__Impl"
    // InternalPortugolParser.g:3576:1: rule__BreakStatement__Group__0__Impl : ( () ) ;
    public final void rule__BreakStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3580:1: ( ( () ) )
            // InternalPortugolParser.g:3581:1: ( () )
            {
            // InternalPortugolParser.g:3581:1: ( () )
            // InternalPortugolParser.g:3582:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakStatementAccess().getBreakStatementAction_0()); 
            }
            // InternalPortugolParser.g:3583:2: ()
            // InternalPortugolParser.g:3583:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakStatementAccess().getBreakStatementAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BreakStatement__Group__0__Impl"


    // $ANTLR start "rule__BreakStatement__Group__1"
    // InternalPortugolParser.g:3591:1: rule__BreakStatement__Group__1 : rule__BreakStatement__Group__1__Impl ;
    public final void rule__BreakStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3595:1: ( rule__BreakStatement__Group__1__Impl )
            // InternalPortugolParser.g:3596:2: rule__BreakStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BreakStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BreakStatement__Group__1"


    // $ANTLR start "rule__BreakStatement__Group__1__Impl"
    // InternalPortugolParser.g:3602:1: rule__BreakStatement__Group__1__Impl : ( Interrompa ) ;
    public final void rule__BreakStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3606:1: ( ( Interrompa ) )
            // InternalPortugolParser.g:3607:1: ( Interrompa )
            {
            // InternalPortugolParser.g:3607:1: ( Interrompa )
            // InternalPortugolParser.g:3608:2: Interrompa
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakStatementAccess().getInterrompaKeyword_1()); 
            }
            match(input,Interrompa,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakStatementAccess().getInterrompaKeyword_1()); 
            }

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
    // $ANTLR end "rule__BreakStatement__Group__1__Impl"


    // $ANTLR start "rule__ReturnStatement__Group__0"
    // InternalPortugolParser.g:3618:1: rule__ReturnStatement__Group__0 : rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1 ;
    public final void rule__ReturnStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3622:1: ( rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1 )
            // InternalPortugolParser.g:3623:2: rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ReturnStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReturnStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReturnStatement__Group__0"


    // $ANTLR start "rule__ReturnStatement__Group__0__Impl"
    // InternalPortugolParser.g:3630:1: rule__ReturnStatement__Group__0__Impl : ( () ) ;
    public final void rule__ReturnStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3634:1: ( ( () ) )
            // InternalPortugolParser.g:3635:1: ( () )
            {
            // InternalPortugolParser.g:3635:1: ( () )
            // InternalPortugolParser.g:3636:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getReturnExpressionAction_0()); 
            }
            // InternalPortugolParser.g:3637:2: ()
            // InternalPortugolParser.g:3637:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnStatementAccess().getReturnExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__0__Impl"


    // $ANTLR start "rule__ReturnStatement__Group__1"
    // InternalPortugolParser.g:3645:1: rule__ReturnStatement__Group__1 : rule__ReturnStatement__Group__1__Impl rule__ReturnStatement__Group__2 ;
    public final void rule__ReturnStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3649:1: ( rule__ReturnStatement__Group__1__Impl rule__ReturnStatement__Group__2 )
            // InternalPortugolParser.g:3650:2: rule__ReturnStatement__Group__1__Impl rule__ReturnStatement__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__ReturnStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReturnStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReturnStatement__Group__1"


    // $ANTLR start "rule__ReturnStatement__Group__1__Impl"
    // InternalPortugolParser.g:3657:1: rule__ReturnStatement__Group__1__Impl : ( Retorne ) ;
    public final void rule__ReturnStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3661:1: ( ( Retorne ) )
            // InternalPortugolParser.g:3662:1: ( Retorne )
            {
            // InternalPortugolParser.g:3662:1: ( Retorne )
            // InternalPortugolParser.g:3663:2: Retorne
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getRetorneKeyword_1()); 
            }
            match(input,Retorne,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnStatementAccess().getRetorneKeyword_1()); 
            }

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
    // $ANTLR end "rule__ReturnStatement__Group__1__Impl"


    // $ANTLR start "rule__ReturnStatement__Group__2"
    // InternalPortugolParser.g:3672:1: rule__ReturnStatement__Group__2 : rule__ReturnStatement__Group__2__Impl ;
    public final void rule__ReturnStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3676:1: ( rule__ReturnStatement__Group__2__Impl )
            // InternalPortugolParser.g:3677:2: rule__ReturnStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReturnStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReturnStatement__Group__2"


    // $ANTLR start "rule__ReturnStatement__Group__2__Impl"
    // InternalPortugolParser.g:3683:1: rule__ReturnStatement__Group__2__Impl : ( ( rule__ReturnStatement__ExprAssignment_2 ) ) ;
    public final void rule__ReturnStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3687:1: ( ( ( rule__ReturnStatement__ExprAssignment_2 ) ) )
            // InternalPortugolParser.g:3688:1: ( ( rule__ReturnStatement__ExprAssignment_2 ) )
            {
            // InternalPortugolParser.g:3688:1: ( ( rule__ReturnStatement__ExprAssignment_2 ) )
            // InternalPortugolParser.g:3689:2: ( rule__ReturnStatement__ExprAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getExprAssignment_2()); 
            }
            // InternalPortugolParser.g:3690:2: ( rule__ReturnStatement__ExprAssignment_2 )
            // InternalPortugolParser.g:3690:3: rule__ReturnStatement__ExprAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReturnStatement__ExprAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnStatementAccess().getExprAssignment_2()); 
            }

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
    // $ANTLR end "rule__ReturnStatement__Group__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__0"
    // InternalPortugolParser.g:3699:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3703:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalPortugolParser.g:3704:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__IfStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group__0"


    // $ANTLR start "rule__IfStatement__Group__0__Impl"
    // InternalPortugolParser.g:3711:1: rule__IfStatement__Group__0__Impl : ( Se ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3715:1: ( ( Se ) )
            // InternalPortugolParser.g:3716:1: ( Se )
            {
            // InternalPortugolParser.g:3716:1: ( Se )
            // InternalPortugolParser.g:3717:2: Se
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getSeKeyword_0()); 
            }
            match(input,Se,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getSeKeyword_0()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__0__Impl"


    // $ANTLR start "rule__IfStatement__Group__1"
    // InternalPortugolParser.g:3726:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3730:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalPortugolParser.g:3731:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__IfStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group__1"


    // $ANTLR start "rule__IfStatement__Group__1__Impl"
    // InternalPortugolParser.g:3738:1: rule__IfStatement__Group__1__Impl : ( ( rule__IfStatement__ExprAssignment_1 ) ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3742:1: ( ( ( rule__IfStatement__ExprAssignment_1 ) ) )
            // InternalPortugolParser.g:3743:1: ( ( rule__IfStatement__ExprAssignment_1 ) )
            {
            // InternalPortugolParser.g:3743:1: ( ( rule__IfStatement__ExprAssignment_1 ) )
            // InternalPortugolParser.g:3744:2: ( rule__IfStatement__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getExprAssignment_1()); 
            }
            // InternalPortugolParser.g:3745:2: ( rule__IfStatement__ExprAssignment_1 )
            // InternalPortugolParser.g:3745:3: rule__IfStatement__ExprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ExprAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getExprAssignment_1()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__2"
    // InternalPortugolParser.g:3753:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3757:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalPortugolParser.g:3758:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__IfStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group__2"


    // $ANTLR start "rule__IfStatement__Group__2__Impl"
    // InternalPortugolParser.g:3765:1: rule__IfStatement__Group__2__Impl : ( Entao ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3769:1: ( ( Entao ) )
            // InternalPortugolParser.g:3770:1: ( Entao )
            {
            // InternalPortugolParser.g:3770:1: ( Entao )
            // InternalPortugolParser.g:3771:2: Entao
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getEntaoKeyword_2()); 
            }
            match(input,Entao,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getEntaoKeyword_2()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__3"
    // InternalPortugolParser.g:3780:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3784:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalPortugolParser.g:3785:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__IfStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group__3"


    // $ANTLR start "rule__IfStatement__Group__3__Impl"
    // InternalPortugolParser.g:3792:1: rule__IfStatement__Group__3__Impl : ( ( ( rule__IfStatement__CommandsAssignment_3 ) ) ( ( rule__IfStatement__CommandsAssignment_3 )* ) ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3796:1: ( ( ( ( rule__IfStatement__CommandsAssignment_3 ) ) ( ( rule__IfStatement__CommandsAssignment_3 )* ) ) )
            // InternalPortugolParser.g:3797:1: ( ( ( rule__IfStatement__CommandsAssignment_3 ) ) ( ( rule__IfStatement__CommandsAssignment_3 )* ) )
            {
            // InternalPortugolParser.g:3797:1: ( ( ( rule__IfStatement__CommandsAssignment_3 ) ) ( ( rule__IfStatement__CommandsAssignment_3 )* ) )
            // InternalPortugolParser.g:3798:2: ( ( rule__IfStatement__CommandsAssignment_3 ) ) ( ( rule__IfStatement__CommandsAssignment_3 )* )
            {
            // InternalPortugolParser.g:3798:2: ( ( rule__IfStatement__CommandsAssignment_3 ) )
            // InternalPortugolParser.g:3799:3: ( rule__IfStatement__CommandsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugolParser.g:3800:3: ( rule__IfStatement__CommandsAssignment_3 )
            // InternalPortugolParser.g:3800:4: rule__IfStatement__CommandsAssignment_3
            {
            pushFollow(FOLLOW_18);
            rule__IfStatement__CommandsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getCommandsAssignment_3()); 
            }

            }

            // InternalPortugolParser.g:3803:2: ( ( rule__IfStatement__CommandsAssignment_3 )* )
            // InternalPortugolParser.g:3804:3: ( rule__IfStatement__CommandsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugolParser.g:3805:3: ( rule__IfStatement__CommandsAssignment_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==Interrompa||(LA31_0>=Enquanto && LA31_0<=Escreva)||LA31_0==Retorne||(LA31_0>=Maiusc && LA31_0<=Copia)||LA31_0==Raizq||(LA31_0>=Leia && LA31_0<=Para)||LA31_0==NOT||(LA31_0>=Pi && LA31_0<=Se)||LA31_0==LeftParenthesis||LA31_0==HyphenMinus||(LA31_0>=RULE_INT && LA31_0<=RULE_STRING)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalPortugolParser.g:3805:4: rule__IfStatement__CommandsAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__IfStatement__CommandsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getCommandsAssignment_3()); 
            }

            }


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
    // $ANTLR end "rule__IfStatement__Group__3__Impl"


    // $ANTLR start "rule__IfStatement__Group__4"
    // InternalPortugolParser.g:3814:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3818:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalPortugolParser.g:3819:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__IfStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group__4"


    // $ANTLR start "rule__IfStatement__Group__4__Impl"
    // InternalPortugolParser.g:3826:1: rule__IfStatement__Group__4__Impl : ( ( rule__IfStatement__Group_4__0 )? ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3830:1: ( ( ( rule__IfStatement__Group_4__0 )? ) )
            // InternalPortugolParser.g:3831:1: ( ( rule__IfStatement__Group_4__0 )? )
            {
            // InternalPortugolParser.g:3831:1: ( ( rule__IfStatement__Group_4__0 )? )
            // InternalPortugolParser.g:3832:2: ( rule__IfStatement__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup_4()); 
            }
            // InternalPortugolParser.g:3833:2: ( rule__IfStatement__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Senao) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPortugolParser.g:3833:3: rule__IfStatement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfStatement__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getGroup_4()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__4__Impl"


    // $ANTLR start "rule__IfStatement__Group__5"
    // InternalPortugolParser.g:3841:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3845:1: ( rule__IfStatement__Group__5__Impl )
            // InternalPortugolParser.g:3846:2: rule__IfStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group__5"


    // $ANTLR start "rule__IfStatement__Group__5__Impl"
    // InternalPortugolParser.g:3852:1: rule__IfStatement__Group__5__Impl : ( Fimse ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3856:1: ( ( Fimse ) )
            // InternalPortugolParser.g:3857:1: ( Fimse )
            {
            // InternalPortugolParser.g:3857:1: ( Fimse )
            // InternalPortugolParser.g:3858:2: Fimse
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getFimseKeyword_5()); 
            }
            match(input,Fimse,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getFimseKeyword_5()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__5__Impl"


    // $ANTLR start "rule__IfStatement__Group_4__0"
    // InternalPortugolParser.g:3868:1: rule__IfStatement__Group_4__0 : rule__IfStatement__Group_4__0__Impl rule__IfStatement__Group_4__1 ;
    public final void rule__IfStatement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3872:1: ( rule__IfStatement__Group_4__0__Impl rule__IfStatement__Group_4__1 )
            // InternalPortugolParser.g:3873:2: rule__IfStatement__Group_4__0__Impl rule__IfStatement__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__IfStatement__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group_4__0"


    // $ANTLR start "rule__IfStatement__Group_4__0__Impl"
    // InternalPortugolParser.g:3880:1: rule__IfStatement__Group_4__0__Impl : ( Senao ) ;
    public final void rule__IfStatement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3884:1: ( ( Senao ) )
            // InternalPortugolParser.g:3885:1: ( Senao )
            {
            // InternalPortugolParser.g:3885:1: ( Senao )
            // InternalPortugolParser.g:3886:2: Senao
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getSenaoKeyword_4_0()); 
            }
            match(input,Senao,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getSenaoKeyword_4_0()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group_4__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_4__1"
    // InternalPortugolParser.g:3895:1: rule__IfStatement__Group_4__1 : rule__IfStatement__Group_4__1__Impl ;
    public final void rule__IfStatement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3899:1: ( rule__IfStatement__Group_4__1__Impl )
            // InternalPortugolParser.g:3900:2: rule__IfStatement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group_4__1"


    // $ANTLR start "rule__IfStatement__Group_4__1__Impl"
    // InternalPortugolParser.g:3906:1: rule__IfStatement__Group_4__1__Impl : ( ( ( rule__IfStatement__ElseCommandsAssignment_4_1 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_4_1 )* ) ) ;
    public final void rule__IfStatement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3910:1: ( ( ( ( rule__IfStatement__ElseCommandsAssignment_4_1 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_4_1 )* ) ) )
            // InternalPortugolParser.g:3911:1: ( ( ( rule__IfStatement__ElseCommandsAssignment_4_1 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_4_1 )* ) )
            {
            // InternalPortugolParser.g:3911:1: ( ( ( rule__IfStatement__ElseCommandsAssignment_4_1 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_4_1 )* ) )
            // InternalPortugolParser.g:3912:2: ( ( rule__IfStatement__ElseCommandsAssignment_4_1 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_4_1 )* )
            {
            // InternalPortugolParser.g:3912:2: ( ( rule__IfStatement__ElseCommandsAssignment_4_1 ) )
            // InternalPortugolParser.g:3913:3: ( rule__IfStatement__ElseCommandsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseCommandsAssignment_4_1()); 
            }
            // InternalPortugolParser.g:3914:3: ( rule__IfStatement__ElseCommandsAssignment_4_1 )
            // InternalPortugolParser.g:3914:4: rule__IfStatement__ElseCommandsAssignment_4_1
            {
            pushFollow(FOLLOW_18);
            rule__IfStatement__ElseCommandsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseCommandsAssignment_4_1()); 
            }

            }

            // InternalPortugolParser.g:3917:2: ( ( rule__IfStatement__ElseCommandsAssignment_4_1 )* )
            // InternalPortugolParser.g:3918:3: ( rule__IfStatement__ElseCommandsAssignment_4_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseCommandsAssignment_4_1()); 
            }
            // InternalPortugolParser.g:3919:3: ( rule__IfStatement__ElseCommandsAssignment_4_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==Interrompa||(LA33_0>=Enquanto && LA33_0<=Escreva)||LA33_0==Retorne||(LA33_0>=Maiusc && LA33_0<=Copia)||LA33_0==Raizq||(LA33_0>=Leia && LA33_0<=Para)||LA33_0==NOT||(LA33_0>=Pi && LA33_0<=Se)||LA33_0==LeftParenthesis||LA33_0==HyphenMinus||(LA33_0>=RULE_INT && LA33_0<=RULE_STRING)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPortugolParser.g:3919:4: rule__IfStatement__ElseCommandsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__IfStatement__ElseCommandsAssignment_4_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseCommandsAssignment_4_1()); 
            }

            }


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
    // $ANTLR end "rule__IfStatement__Group_4__1__Impl"


    // $ANTLR start "rule__SwitchCaseStatement__Group__0"
    // InternalPortugolParser.g:3929:1: rule__SwitchCaseStatement__Group__0 : rule__SwitchCaseStatement__Group__0__Impl rule__SwitchCaseStatement__Group__1 ;
    public final void rule__SwitchCaseStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3933:1: ( rule__SwitchCaseStatement__Group__0__Impl rule__SwitchCaseStatement__Group__1 )
            // InternalPortugolParser.g:3934:2: rule__SwitchCaseStatement__Group__0__Impl rule__SwitchCaseStatement__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SwitchCaseStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchCaseStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchCaseStatement__Group__0"


    // $ANTLR start "rule__SwitchCaseStatement__Group__0__Impl"
    // InternalPortugolParser.g:3941:1: rule__SwitchCaseStatement__Group__0__Impl : ( Escolha ) ;
    public final void rule__SwitchCaseStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3945:1: ( ( Escolha ) )
            // InternalPortugolParser.g:3946:1: ( Escolha )
            {
            // InternalPortugolParser.g:3946:1: ( Escolha )
            // InternalPortugolParser.g:3947:2: Escolha
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getEscolhaKeyword_0()); 
            }
            match(input,Escolha,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseStatementAccess().getEscolhaKeyword_0()); 
            }

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
    // $ANTLR end "rule__SwitchCaseStatement__Group__0__Impl"


    // $ANTLR start "rule__SwitchCaseStatement__Group__1"
    // InternalPortugolParser.g:3956:1: rule__SwitchCaseStatement__Group__1 : rule__SwitchCaseStatement__Group__1__Impl rule__SwitchCaseStatement__Group__2 ;
    public final void rule__SwitchCaseStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3960:1: ( rule__SwitchCaseStatement__Group__1__Impl rule__SwitchCaseStatement__Group__2 )
            // InternalPortugolParser.g:3961:2: rule__SwitchCaseStatement__Group__1__Impl rule__SwitchCaseStatement__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__SwitchCaseStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchCaseStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchCaseStatement__Group__1"


    // $ANTLR start "rule__SwitchCaseStatement__Group__1__Impl"
    // InternalPortugolParser.g:3968:1: rule__SwitchCaseStatement__Group__1__Impl : ( ( rule__SwitchCaseStatement__VariableAssignment_1 ) ) ;
    public final void rule__SwitchCaseStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3972:1: ( ( ( rule__SwitchCaseStatement__VariableAssignment_1 ) ) )
            // InternalPortugolParser.g:3973:1: ( ( rule__SwitchCaseStatement__VariableAssignment_1 ) )
            {
            // InternalPortugolParser.g:3973:1: ( ( rule__SwitchCaseStatement__VariableAssignment_1 ) )
            // InternalPortugolParser.g:3974:2: ( rule__SwitchCaseStatement__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getVariableAssignment_1()); 
            }
            // InternalPortugolParser.g:3975:2: ( rule__SwitchCaseStatement__VariableAssignment_1 )
            // InternalPortugolParser.g:3975:3: rule__SwitchCaseStatement__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SwitchCaseStatement__VariableAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseStatementAccess().getVariableAssignment_1()); 
            }

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
    // $ANTLR end "rule__SwitchCaseStatement__Group__1__Impl"


    // $ANTLR start "rule__SwitchCaseStatement__Group__2"
    // InternalPortugolParser.g:3983:1: rule__SwitchCaseStatement__Group__2 : rule__SwitchCaseStatement__Group__2__Impl rule__SwitchCaseStatement__Group__3 ;
    public final void rule__SwitchCaseStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3987:1: ( rule__SwitchCaseStatement__Group__2__Impl rule__SwitchCaseStatement__Group__3 )
            // InternalPortugolParser.g:3988:2: rule__SwitchCaseStatement__Group__2__Impl rule__SwitchCaseStatement__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__SwitchCaseStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchCaseStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchCaseStatement__Group__2"


    // $ANTLR start "rule__SwitchCaseStatement__Group__2__Impl"
    // InternalPortugolParser.g:3995:1: rule__SwitchCaseStatement__Group__2__Impl : ( ( ( rule__SwitchCaseStatement__CaseListAssignment_2 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_2 )* ) ) ;
    public final void rule__SwitchCaseStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3999:1: ( ( ( ( rule__SwitchCaseStatement__CaseListAssignment_2 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_2 )* ) ) )
            // InternalPortugolParser.g:4000:1: ( ( ( rule__SwitchCaseStatement__CaseListAssignment_2 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_2 )* ) )
            {
            // InternalPortugolParser.g:4000:1: ( ( ( rule__SwitchCaseStatement__CaseListAssignment_2 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_2 )* ) )
            // InternalPortugolParser.g:4001:2: ( ( rule__SwitchCaseStatement__CaseListAssignment_2 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_2 )* )
            {
            // InternalPortugolParser.g:4001:2: ( ( rule__SwitchCaseStatement__CaseListAssignment_2 ) )
            // InternalPortugolParser.g:4002:3: ( rule__SwitchCaseStatement__CaseListAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getCaseListAssignment_2()); 
            }
            // InternalPortugolParser.g:4003:3: ( rule__SwitchCaseStatement__CaseListAssignment_2 )
            // InternalPortugolParser.g:4003:4: rule__SwitchCaseStatement__CaseListAssignment_2
            {
            pushFollow(FOLLOW_28);
            rule__SwitchCaseStatement__CaseListAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseStatementAccess().getCaseListAssignment_2()); 
            }

            }

            // InternalPortugolParser.g:4006:2: ( ( rule__SwitchCaseStatement__CaseListAssignment_2 )* )
            // InternalPortugolParser.g:4007:3: ( rule__SwitchCaseStatement__CaseListAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getCaseListAssignment_2()); 
            }
            // InternalPortugolParser.g:4008:3: ( rule__SwitchCaseStatement__CaseListAssignment_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Caso) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalPortugolParser.g:4008:4: rule__SwitchCaseStatement__CaseListAssignment_2
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__SwitchCaseStatement__CaseListAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseStatementAccess().getCaseListAssignment_2()); 
            }

            }


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
    // $ANTLR end "rule__SwitchCaseStatement__Group__2__Impl"


    // $ANTLR start "rule__SwitchCaseStatement__Group__3"
    // InternalPortugolParser.g:4017:1: rule__SwitchCaseStatement__Group__3 : rule__SwitchCaseStatement__Group__3__Impl rule__SwitchCaseStatement__Group__4 ;
    public final void rule__SwitchCaseStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4021:1: ( rule__SwitchCaseStatement__Group__3__Impl rule__SwitchCaseStatement__Group__4 )
            // InternalPortugolParser.g:4022:2: rule__SwitchCaseStatement__Group__3__Impl rule__SwitchCaseStatement__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__SwitchCaseStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchCaseStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchCaseStatement__Group__3"


    // $ANTLR start "rule__SwitchCaseStatement__Group__3__Impl"
    // InternalPortugolParser.g:4029:1: rule__SwitchCaseStatement__Group__3__Impl : ( ( rule__SwitchCaseStatement__OtherCaseAssignment_3 )? ) ;
    public final void rule__SwitchCaseStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4033:1: ( ( ( rule__SwitchCaseStatement__OtherCaseAssignment_3 )? ) )
            // InternalPortugolParser.g:4034:1: ( ( rule__SwitchCaseStatement__OtherCaseAssignment_3 )? )
            {
            // InternalPortugolParser.g:4034:1: ( ( rule__SwitchCaseStatement__OtherCaseAssignment_3 )? )
            // InternalPortugolParser.g:4035:2: ( rule__SwitchCaseStatement__OtherCaseAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getOtherCaseAssignment_3()); 
            }
            // InternalPortugolParser.g:4036:2: ( rule__SwitchCaseStatement__OtherCaseAssignment_3 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Outrocaso) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPortugolParser.g:4036:3: rule__SwitchCaseStatement__OtherCaseAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__SwitchCaseStatement__OtherCaseAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseStatementAccess().getOtherCaseAssignment_3()); 
            }

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
    // $ANTLR end "rule__SwitchCaseStatement__Group__3__Impl"


    // $ANTLR start "rule__SwitchCaseStatement__Group__4"
    // InternalPortugolParser.g:4044:1: rule__SwitchCaseStatement__Group__4 : rule__SwitchCaseStatement__Group__4__Impl ;
    public final void rule__SwitchCaseStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4048:1: ( rule__SwitchCaseStatement__Group__4__Impl )
            // InternalPortugolParser.g:4049:2: rule__SwitchCaseStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SwitchCaseStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SwitchCaseStatement__Group__4"


    // $ANTLR start "rule__SwitchCaseStatement__Group__4__Impl"
    // InternalPortugolParser.g:4055:1: rule__SwitchCaseStatement__Group__4__Impl : ( Fimescolha ) ;
    public final void rule__SwitchCaseStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4059:1: ( ( Fimescolha ) )
            // InternalPortugolParser.g:4060:1: ( Fimescolha )
            {
            // InternalPortugolParser.g:4060:1: ( Fimescolha )
            // InternalPortugolParser.g:4061:2: Fimescolha
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getFimescolhaKeyword_4()); 
            }
            match(input,Fimescolha,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseStatementAccess().getFimescolhaKeyword_4()); 
            }

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
    // $ANTLR end "rule__SwitchCaseStatement__Group__4__Impl"


    // $ANTLR start "rule__CaseList__Group__0"
    // InternalPortugolParser.g:4071:1: rule__CaseList__Group__0 : rule__CaseList__Group__0__Impl rule__CaseList__Group__1 ;
    public final void rule__CaseList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4075:1: ( rule__CaseList__Group__0__Impl rule__CaseList__Group__1 )
            // InternalPortugolParser.g:4076:2: rule__CaseList__Group__0__Impl rule__CaseList__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__CaseList__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CaseList__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CaseList__Group__0"


    // $ANTLR start "rule__CaseList__Group__0__Impl"
    // InternalPortugolParser.g:4083:1: rule__CaseList__Group__0__Impl : ( Caso ) ;
    public final void rule__CaseList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4087:1: ( ( Caso ) )
            // InternalPortugolParser.g:4088:1: ( Caso )
            {
            // InternalPortugolParser.g:4088:1: ( Caso )
            // InternalPortugolParser.g:4089:2: Caso
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getCasoKeyword_0()); 
            }
            match(input,Caso,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseListAccess().getCasoKeyword_0()); 
            }

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
    // $ANTLR end "rule__CaseList__Group__0__Impl"


    // $ANTLR start "rule__CaseList__Group__1"
    // InternalPortugolParser.g:4098:1: rule__CaseList__Group__1 : rule__CaseList__Group__1__Impl rule__CaseList__Group__2 ;
    public final void rule__CaseList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4102:1: ( rule__CaseList__Group__1__Impl rule__CaseList__Group__2 )
            // InternalPortugolParser.g:4103:2: rule__CaseList__Group__1__Impl rule__CaseList__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__CaseList__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CaseList__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CaseList__Group__1"


    // $ANTLR start "rule__CaseList__Group__1__Impl"
    // InternalPortugolParser.g:4110:1: rule__CaseList__Group__1__Impl : ( ( rule__CaseList__ExprAssignment_1 ) ) ;
    public final void rule__CaseList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4114:1: ( ( ( rule__CaseList__ExprAssignment_1 ) ) )
            // InternalPortugolParser.g:4115:1: ( ( rule__CaseList__ExprAssignment_1 ) )
            {
            // InternalPortugolParser.g:4115:1: ( ( rule__CaseList__ExprAssignment_1 ) )
            // InternalPortugolParser.g:4116:2: ( rule__CaseList__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getExprAssignment_1()); 
            }
            // InternalPortugolParser.g:4117:2: ( rule__CaseList__ExprAssignment_1 )
            // InternalPortugolParser.g:4117:3: rule__CaseList__ExprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CaseList__ExprAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseListAccess().getExprAssignment_1()); 
            }

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
    // $ANTLR end "rule__CaseList__Group__1__Impl"


    // $ANTLR start "rule__CaseList__Group__2"
    // InternalPortugolParser.g:4125:1: rule__CaseList__Group__2 : rule__CaseList__Group__2__Impl rule__CaseList__Group__3 ;
    public final void rule__CaseList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4129:1: ( rule__CaseList__Group__2__Impl rule__CaseList__Group__3 )
            // InternalPortugolParser.g:4130:2: rule__CaseList__Group__2__Impl rule__CaseList__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__CaseList__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CaseList__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CaseList__Group__2"


    // $ANTLR start "rule__CaseList__Group__2__Impl"
    // InternalPortugolParser.g:4137:1: rule__CaseList__Group__2__Impl : ( Colon ) ;
    public final void rule__CaseList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4141:1: ( ( Colon ) )
            // InternalPortugolParser.g:4142:1: ( Colon )
            {
            // InternalPortugolParser.g:4142:1: ( Colon )
            // InternalPortugolParser.g:4143:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getColonKeyword_2()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseListAccess().getColonKeyword_2()); 
            }

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
    // $ANTLR end "rule__CaseList__Group__2__Impl"


    // $ANTLR start "rule__CaseList__Group__3"
    // InternalPortugolParser.g:4152:1: rule__CaseList__Group__3 : rule__CaseList__Group__3__Impl ;
    public final void rule__CaseList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4156:1: ( rule__CaseList__Group__3__Impl )
            // InternalPortugolParser.g:4157:2: rule__CaseList__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CaseList__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CaseList__Group__3"


    // $ANTLR start "rule__CaseList__Group__3__Impl"
    // InternalPortugolParser.g:4163:1: rule__CaseList__Group__3__Impl : ( ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* ) ) ;
    public final void rule__CaseList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4167:1: ( ( ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* ) ) )
            // InternalPortugolParser.g:4168:1: ( ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* ) )
            {
            // InternalPortugolParser.g:4168:1: ( ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* ) )
            // InternalPortugolParser.g:4169:2: ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* )
            {
            // InternalPortugolParser.g:4169:2: ( ( rule__CaseList__CommandsAssignment_3 ) )
            // InternalPortugolParser.g:4170:3: ( rule__CaseList__CommandsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugolParser.g:4171:3: ( rule__CaseList__CommandsAssignment_3 )
            // InternalPortugolParser.g:4171:4: rule__CaseList__CommandsAssignment_3
            {
            pushFollow(FOLLOW_18);
            rule__CaseList__CommandsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseListAccess().getCommandsAssignment_3()); 
            }

            }

            // InternalPortugolParser.g:4174:2: ( ( rule__CaseList__CommandsAssignment_3 )* )
            // InternalPortugolParser.g:4175:3: ( rule__CaseList__CommandsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugolParser.g:4176:3: ( rule__CaseList__CommandsAssignment_3 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==Interrompa||(LA36_0>=Enquanto && LA36_0<=Escreva)||LA36_0==Retorne||(LA36_0>=Maiusc && LA36_0<=Copia)||LA36_0==Raizq||(LA36_0>=Leia && LA36_0<=Para)||LA36_0==NOT||(LA36_0>=Pi && LA36_0<=Se)||LA36_0==LeftParenthesis||LA36_0==HyphenMinus||(LA36_0>=RULE_INT && LA36_0<=RULE_STRING)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalPortugolParser.g:4176:4: rule__CaseList__CommandsAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__CaseList__CommandsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseListAccess().getCommandsAssignment_3()); 
            }

            }


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
    // $ANTLR end "rule__CaseList__Group__3__Impl"


    // $ANTLR start "rule__OtherCase__Group__0"
    // InternalPortugolParser.g:4186:1: rule__OtherCase__Group__0 : rule__OtherCase__Group__0__Impl rule__OtherCase__Group__1 ;
    public final void rule__OtherCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4190:1: ( rule__OtherCase__Group__0__Impl rule__OtherCase__Group__1 )
            // InternalPortugolParser.g:4191:2: rule__OtherCase__Group__0__Impl rule__OtherCase__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OtherCase__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OtherCase__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OtherCase__Group__0"


    // $ANTLR start "rule__OtherCase__Group__0__Impl"
    // InternalPortugolParser.g:4198:1: rule__OtherCase__Group__0__Impl : ( Outrocaso ) ;
    public final void rule__OtherCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4202:1: ( ( Outrocaso ) )
            // InternalPortugolParser.g:4203:1: ( Outrocaso )
            {
            // InternalPortugolParser.g:4203:1: ( Outrocaso )
            // InternalPortugolParser.g:4204:2: Outrocaso
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getOutrocasoKeyword_0()); 
            }
            match(input,Outrocaso,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherCaseAccess().getOutrocasoKeyword_0()); 
            }

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
    // $ANTLR end "rule__OtherCase__Group__0__Impl"


    // $ANTLR start "rule__OtherCase__Group__1"
    // InternalPortugolParser.g:4213:1: rule__OtherCase__Group__1 : rule__OtherCase__Group__1__Impl rule__OtherCase__Group__2 ;
    public final void rule__OtherCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4217:1: ( rule__OtherCase__Group__1__Impl rule__OtherCase__Group__2 )
            // InternalPortugolParser.g:4218:2: rule__OtherCase__Group__1__Impl rule__OtherCase__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__OtherCase__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OtherCase__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OtherCase__Group__1"


    // $ANTLR start "rule__OtherCase__Group__1__Impl"
    // InternalPortugolParser.g:4225:1: rule__OtherCase__Group__1__Impl : ( Colon ) ;
    public final void rule__OtherCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4229:1: ( ( Colon ) )
            // InternalPortugolParser.g:4230:1: ( Colon )
            {
            // InternalPortugolParser.g:4230:1: ( Colon )
            // InternalPortugolParser.g:4231:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getColonKeyword_1()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherCaseAccess().getColonKeyword_1()); 
            }

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
    // $ANTLR end "rule__OtherCase__Group__1__Impl"


    // $ANTLR start "rule__OtherCase__Group__2"
    // InternalPortugolParser.g:4240:1: rule__OtherCase__Group__2 : rule__OtherCase__Group__2__Impl ;
    public final void rule__OtherCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4244:1: ( rule__OtherCase__Group__2__Impl )
            // InternalPortugolParser.g:4245:2: rule__OtherCase__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherCase__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OtherCase__Group__2"


    // $ANTLR start "rule__OtherCase__Group__2__Impl"
    // InternalPortugolParser.g:4251:1: rule__OtherCase__Group__2__Impl : ( ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* ) ) ;
    public final void rule__OtherCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4255:1: ( ( ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* ) ) )
            // InternalPortugolParser.g:4256:1: ( ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* ) )
            {
            // InternalPortugolParser.g:4256:1: ( ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* ) )
            // InternalPortugolParser.g:4257:2: ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* )
            {
            // InternalPortugolParser.g:4257:2: ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) )
            // InternalPortugolParser.g:4258:3: ( rule__OtherCase__OtherCaseCommandsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getOtherCaseCommandsAssignment_2()); 
            }
            // InternalPortugolParser.g:4259:3: ( rule__OtherCase__OtherCaseCommandsAssignment_2 )
            // InternalPortugolParser.g:4259:4: rule__OtherCase__OtherCaseCommandsAssignment_2
            {
            pushFollow(FOLLOW_18);
            rule__OtherCase__OtherCaseCommandsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherCaseAccess().getOtherCaseCommandsAssignment_2()); 
            }

            }

            // InternalPortugolParser.g:4262:2: ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* )
            // InternalPortugolParser.g:4263:3: ( rule__OtherCase__OtherCaseCommandsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getOtherCaseCommandsAssignment_2()); 
            }
            // InternalPortugolParser.g:4264:3: ( rule__OtherCase__OtherCaseCommandsAssignment_2 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==Interrompa||(LA37_0>=Enquanto && LA37_0<=Escreva)||LA37_0==Retorne||(LA37_0>=Maiusc && LA37_0<=Copia)||LA37_0==Raizq||(LA37_0>=Leia && LA37_0<=Para)||LA37_0==NOT||(LA37_0>=Pi && LA37_0<=Se)||LA37_0==LeftParenthesis||LA37_0==HyphenMinus||(LA37_0>=RULE_INT && LA37_0<=RULE_STRING)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalPortugolParser.g:4264:4: rule__OtherCase__OtherCaseCommandsAssignment_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__OtherCase__OtherCaseCommandsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherCaseAccess().getOtherCaseCommandsAssignment_2()); 
            }

            }


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
    // $ANTLR end "rule__OtherCase__Group__2__Impl"


    // $ANTLR start "rule__ForStatement__Group__0"
    // InternalPortugolParser.g:4274:1: rule__ForStatement__Group__0 : rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1 ;
    public final void rule__ForStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4278:1: ( rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1 )
            // InternalPortugolParser.g:4279:2: rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ForStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ForStatement__Group__0"


    // $ANTLR start "rule__ForStatement__Group__0__Impl"
    // InternalPortugolParser.g:4286:1: rule__ForStatement__Group__0__Impl : ( Para ) ;
    public final void rule__ForStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4290:1: ( ( Para ) )
            // InternalPortugolParser.g:4291:1: ( Para )
            {
            // InternalPortugolParser.g:4291:1: ( Para )
            // InternalPortugolParser.g:4292:2: Para
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getParaKeyword_0()); 
            }
            match(input,Para,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getParaKeyword_0()); 
            }

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
    // $ANTLR end "rule__ForStatement__Group__0__Impl"


    // $ANTLR start "rule__ForStatement__Group__1"
    // InternalPortugolParser.g:4301:1: rule__ForStatement__Group__1 : rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2 ;
    public final void rule__ForStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4305:1: ( rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2 )
            // InternalPortugolParser.g:4306:2: rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__ForStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ForStatement__Group__1"


    // $ANTLR start "rule__ForStatement__Group__1__Impl"
    // InternalPortugolParser.g:4313:1: rule__ForStatement__Group__1__Impl : ( ( rule__ForStatement__OperatorExprAssignment_1 ) ) ;
    public final void rule__ForStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4317:1: ( ( ( rule__ForStatement__OperatorExprAssignment_1 ) ) )
            // InternalPortugolParser.g:4318:1: ( ( rule__ForStatement__OperatorExprAssignment_1 ) )
            {
            // InternalPortugolParser.g:4318:1: ( ( rule__ForStatement__OperatorExprAssignment_1 ) )
            // InternalPortugolParser.g:4319:2: ( rule__ForStatement__OperatorExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getOperatorExprAssignment_1()); 
            }
            // InternalPortugolParser.g:4320:2: ( rule__ForStatement__OperatorExprAssignment_1 )
            // InternalPortugolParser.g:4320:3: rule__ForStatement__OperatorExprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__OperatorExprAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getOperatorExprAssignment_1()); 
            }

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
    // $ANTLR end "rule__ForStatement__Group__1__Impl"


    // $ANTLR start "rule__ForStatement__Group__2"
    // InternalPortugolParser.g:4328:1: rule__ForStatement__Group__2 : rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3 ;
    public final void rule__ForStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4332:1: ( rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3 )
            // InternalPortugolParser.g:4333:2: rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__ForStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ForStatement__Group__2"


    // $ANTLR start "rule__ForStatement__Group__2__Impl"
    // InternalPortugolParser.g:4340:1: rule__ForStatement__Group__2__Impl : ( De ) ;
    public final void rule__ForStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4344:1: ( ( De ) )
            // InternalPortugolParser.g:4345:1: ( De )
            {
            // InternalPortugolParser.g:4345:1: ( De )
            // InternalPortugolParser.g:4346:2: De
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getDeKeyword_2()); 
            }
            match(input,De,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getDeKeyword_2()); 
            }

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
    // $ANTLR end "rule__ForStatement__Group__2__Impl"


    // $ANTLR start "rule__ForStatement__Group__3"
    // InternalPortugolParser.g:4355:1: rule__ForStatement__Group__3 : rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4 ;
    public final void rule__ForStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4359:1: ( rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4 )
            // InternalPortugolParser.g:4360:2: rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__ForStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ForStatement__Group__3"


    // $ANTLR start "rule__ForStatement__Group__3__Impl"
    // InternalPortugolParser.g:4367:1: rule__ForStatement__Group__3__Impl : ( ( rule__ForStatement__StartExprAssignment_3 ) ) ;
    public final void rule__ForStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4371:1: ( ( ( rule__ForStatement__StartExprAssignment_3 ) ) )
            // InternalPortugolParser.g:4372:1: ( ( rule__ForStatement__StartExprAssignment_3 ) )
            {
            // InternalPortugolParser.g:4372:1: ( ( rule__ForStatement__StartExprAssignment_3 ) )
            // InternalPortugolParser.g:4373:2: ( rule__ForStatement__StartExprAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getStartExprAssignment_3()); 
            }
            // InternalPortugolParser.g:4374:2: ( rule__ForStatement__StartExprAssignment_3 )
            // InternalPortugolParser.g:4374:3: rule__ForStatement__StartExprAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__StartExprAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getStartExprAssignment_3()); 
            }

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
    // $ANTLR end "rule__ForStatement__Group__3__Impl"


    // $ANTLR start "rule__ForStatement__Group__4"
    // InternalPortugolParser.g:4382:1: rule__ForStatement__Group__4 : rule__ForStatement__Group__4__Impl rule__ForStatement__Group__5 ;
    public final void rule__ForStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4386:1: ( rule__ForStatement__Group__4__Impl rule__ForStatement__Group__5 )
            // InternalPortugolParser.g:4387:2: rule__ForStatement__Group__4__Impl rule__ForStatement__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__ForStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ForStatement__Group__4"


    // $ANTLR start "rule__ForStatement__Group__4__Impl"
    // InternalPortugolParser.g:4394:1: rule__ForStatement__Group__4__Impl : ( Ate ) ;
    public final void rule__ForStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4398:1: ( ( Ate ) )
            // InternalPortugolParser.g:4399:1: ( Ate )
            {
            // InternalPortugolParser.g:4399:1: ( Ate )
            // InternalPortugolParser.g:4400:2: Ate
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getAteKeyword_4()); 
            }
            match(input,Ate,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getAteKeyword_4()); 
            }

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
    // $ANTLR end "rule__ForStatement__Group__4__Impl"


    // $ANTLR start "rule__ForStatement__Group__5"
    // InternalPortugolParser.g:4409:1: rule__ForStatement__Group__5 : rule__ForStatement__Group__5__Impl rule__ForStatement__Group__6 ;
    public final void rule__ForStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4413:1: ( rule__ForStatement__Group__5__Impl rule__ForStatement__Group__6 )
            // InternalPortugolParser.g:4414:2: rule__ForStatement__Group__5__Impl rule__ForStatement__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__ForStatement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ForStatement__Group__5"


    // $ANTLR start "rule__ForStatement__Group__5__Impl"
    // InternalPortugolParser.g:4421:1: rule__ForStatement__Group__5__Impl : ( ( rule__ForStatement__EndExprAssignment_5 ) ) ;
    public final void rule__ForStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4425:1: ( ( ( rule__ForStatement__EndExprAssignment_5 ) ) )
            // InternalPortugolParser.g:4426:1: ( ( rule__ForStatement__EndExprAssignment_5 ) )
            {
            // InternalPortugolParser.g:4426:1: ( ( rule__ForStatement__EndExprAssignment_5 ) )
            // InternalPortugolParser.g:4427:2: ( rule__ForStatement__EndExprAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getEndExprAssignment_5()); 
            }
            // InternalPortugolParser.g:4428:2: ( rule__ForStatement__EndExprAssignment_5 )
            // InternalPortugolParser.g:4428:3: rule__ForStatement__EndExprAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__EndExprAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getEndExprAssignment_5()); 
            }

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
    // $ANTLR end "rule__ForStatement__Group__5__Impl"


    // $ANTLR start "rule__ForStatement__Group__6"
    // InternalPortugolParser.g:4436:1: rule__ForStatement__Group__6 : rule__ForStatement__Group__6__Impl rule__ForStatement__Group__7 ;
    public final void rule__ForStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4440:1: ( rule__ForStatement__Group__6__Impl rule__ForStatement__Group__7 )
            // InternalPortugolParser.g:4441:2: rule__ForStatement__Group__6__Impl rule__ForStatement__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__ForStatement__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ForStatement__Group__6"


    // $ANTLR start "rule__ForStatement__Group__6__Impl"
    // InternalPortugolParser.g:4448:1: rule__ForStatement__Group__6__Impl : ( ( rule__ForStatement__Group_6__0 )? ) ;
    public final void rule__ForStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4452:1: ( ( ( rule__ForStatement__Group_6__0 )? ) )
            // InternalPortugolParser.g:4453:1: ( ( rule__ForStatement__Group_6__0 )? )
            {
            // InternalPortugolParser.g:4453:1: ( ( rule__ForStatement__Group_6__0 )? )
            // InternalPortugolParser.g:4454:2: ( rule__ForStatement__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getGroup_6()); 
            }
            // InternalPortugolParser.g:4455:2: ( rule__ForStatement__Group_6__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Passo) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPortugolParser.g:4455:3: rule__ForStatement__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ForStatement__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getGroup_6()); 
            }

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
    // $ANTLR end "rule__ForStatement__Group__6__Impl"


    // $ANTLR start "rule__ForStatement__Group__7"
    // InternalPortugolParser.g:4463:1: rule__ForStatement__Group__7 : rule__ForStatement__Group__7__Impl rule__ForStatement__Group__8 ;
    public final void rule__ForStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4467:1: ( rule__ForStatement__Group__7__Impl rule__ForStatement__Group__8 )
            // InternalPortugolParser.g:4468:2: rule__ForStatement__Group__7__Impl rule__ForStatement__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__ForStatement__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__8();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ForStatement__Group__7"


    // $ANTLR start "rule__ForStatement__Group__7__Impl"
    // InternalPortugolParser.g:4475:1: rule__ForStatement__Group__7__Impl : ( Faca ) ;
    public final void rule__ForStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4479:1: ( ( Faca ) )
            // InternalPortugolParser.g:4480:1: ( Faca )
            {
            // InternalPortugolParser.g:4480:1: ( Faca )
            // InternalPortugolParser.g:4481:2: Faca
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getFacaKeyword_7()); 
            }
            match(input,Faca,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getFacaKeyword_7()); 
            }

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
    // $ANTLR end "rule__ForStatement__Group__7__Impl"


    // $ANTLR start "rule__ForStatement__Group__8"
    // InternalPortugolParser.g:4490:1: rule__ForStatement__Group__8 : rule__ForStatement__Group__8__Impl rule__ForStatement__Group__9 ;
    public final void rule__ForStatement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4494:1: ( rule__ForStatement__Group__8__Impl rule__ForStatement__Group__9 )
            // InternalPortugolParser.g:4495:2: rule__ForStatement__Group__8__Impl rule__ForStatement__Group__9
            {
            pushFollow(FOLLOW_32);
            rule__ForStatement__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__9();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ForStatement__Group__8"


    // $ANTLR start "rule__ForStatement__Group__8__Impl"
    // InternalPortugolParser.g:4502:1: rule__ForStatement__Group__8__Impl : ( ( ( rule__ForStatement__CommandsAssignment_8 ) ) ( ( rule__ForStatement__CommandsAssignment_8 )* ) ) ;
    public final void rule__ForStatement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4506:1: ( ( ( ( rule__ForStatement__CommandsAssignment_8 ) ) ( ( rule__ForStatement__CommandsAssignment_8 )* ) ) )
            // InternalPortugolParser.g:4507:1: ( ( ( rule__ForStatement__CommandsAssignment_8 ) ) ( ( rule__ForStatement__CommandsAssignment_8 )* ) )
            {
            // InternalPortugolParser.g:4507:1: ( ( ( rule__ForStatement__CommandsAssignment_8 ) ) ( ( rule__ForStatement__CommandsAssignment_8 )* ) )
            // InternalPortugolParser.g:4508:2: ( ( rule__ForStatement__CommandsAssignment_8 ) ) ( ( rule__ForStatement__CommandsAssignment_8 )* )
            {
            // InternalPortugolParser.g:4508:2: ( ( rule__ForStatement__CommandsAssignment_8 ) )
            // InternalPortugolParser.g:4509:3: ( rule__ForStatement__CommandsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getCommandsAssignment_8()); 
            }
            // InternalPortugolParser.g:4510:3: ( rule__ForStatement__CommandsAssignment_8 )
            // InternalPortugolParser.g:4510:4: rule__ForStatement__CommandsAssignment_8
            {
            pushFollow(FOLLOW_18);
            rule__ForStatement__CommandsAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getCommandsAssignment_8()); 
            }

            }

            // InternalPortugolParser.g:4513:2: ( ( rule__ForStatement__CommandsAssignment_8 )* )
            // InternalPortugolParser.g:4514:3: ( rule__ForStatement__CommandsAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getCommandsAssignment_8()); 
            }
            // InternalPortugolParser.g:4515:3: ( rule__ForStatement__CommandsAssignment_8 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==Interrompa||(LA39_0>=Enquanto && LA39_0<=Escreva)||LA39_0==Retorne||(LA39_0>=Maiusc && LA39_0<=Copia)||LA39_0==Raizq||(LA39_0>=Leia && LA39_0<=Para)||LA39_0==NOT||(LA39_0>=Pi && LA39_0<=Se)||LA39_0==LeftParenthesis||LA39_0==HyphenMinus||(LA39_0>=RULE_INT && LA39_0<=RULE_STRING)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalPortugolParser.g:4515:4: rule__ForStatement__CommandsAssignment_8
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ForStatement__CommandsAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getCommandsAssignment_8()); 
            }

            }


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
    // $ANTLR end "rule__ForStatement__Group__8__Impl"


    // $ANTLR start "rule__ForStatement__Group__9"
    // InternalPortugolParser.g:4524:1: rule__ForStatement__Group__9 : rule__ForStatement__Group__9__Impl ;
    public final void rule__ForStatement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4528:1: ( rule__ForStatement__Group__9__Impl )
            // InternalPortugolParser.g:4529:2: rule__ForStatement__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ForStatement__Group__9"


    // $ANTLR start "rule__ForStatement__Group__9__Impl"
    // InternalPortugolParser.g:4535:1: rule__ForStatement__Group__9__Impl : ( Fimpara ) ;
    public final void rule__ForStatement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4539:1: ( ( Fimpara ) )
            // InternalPortugolParser.g:4540:1: ( Fimpara )
            {
            // InternalPortugolParser.g:4540:1: ( Fimpara )
            // InternalPortugolParser.g:4541:2: Fimpara
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getFimparaKeyword_9()); 
            }
            match(input,Fimpara,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getFimparaKeyword_9()); 
            }

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
    // $ANTLR end "rule__ForStatement__Group__9__Impl"


    // $ANTLR start "rule__ForStatement__Group_6__0"
    // InternalPortugolParser.g:4551:1: rule__ForStatement__Group_6__0 : rule__ForStatement__Group_6__0__Impl rule__ForStatement__Group_6__1 ;
    public final void rule__ForStatement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4555:1: ( rule__ForStatement__Group_6__0__Impl rule__ForStatement__Group_6__1 )
            // InternalPortugolParser.g:4556:2: rule__ForStatement__Group_6__0__Impl rule__ForStatement__Group_6__1
            {
            pushFollow(FOLLOW_23);
            rule__ForStatement__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ForStatement__Group_6__0"


    // $ANTLR start "rule__ForStatement__Group_6__0__Impl"
    // InternalPortugolParser.g:4563:1: rule__ForStatement__Group_6__0__Impl : ( Passo ) ;
    public final void rule__ForStatement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4567:1: ( ( Passo ) )
            // InternalPortugolParser.g:4568:1: ( Passo )
            {
            // InternalPortugolParser.g:4568:1: ( Passo )
            // InternalPortugolParser.g:4569:2: Passo
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getPassoKeyword_6_0()); 
            }
            match(input,Passo,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getPassoKeyword_6_0()); 
            }

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
    // $ANTLR end "rule__ForStatement__Group_6__0__Impl"


    // $ANTLR start "rule__ForStatement__Group_6__1"
    // InternalPortugolParser.g:4578:1: rule__ForStatement__Group_6__1 : rule__ForStatement__Group_6__1__Impl ;
    public final void rule__ForStatement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4582:1: ( rule__ForStatement__Group_6__1__Impl )
            // InternalPortugolParser.g:4583:2: rule__ForStatement__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ForStatement__Group_6__1"


    // $ANTLR start "rule__ForStatement__Group_6__1__Impl"
    // InternalPortugolParser.g:4589:1: rule__ForStatement__Group_6__1__Impl : ( ( rule__ForStatement__StepExpeAssignment_6_1 ) ) ;
    public final void rule__ForStatement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4593:1: ( ( ( rule__ForStatement__StepExpeAssignment_6_1 ) ) )
            // InternalPortugolParser.g:4594:1: ( ( rule__ForStatement__StepExpeAssignment_6_1 ) )
            {
            // InternalPortugolParser.g:4594:1: ( ( rule__ForStatement__StepExpeAssignment_6_1 ) )
            // InternalPortugolParser.g:4595:2: ( rule__ForStatement__StepExpeAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getStepExpeAssignment_6_1()); 
            }
            // InternalPortugolParser.g:4596:2: ( rule__ForStatement__StepExpeAssignment_6_1 )
            // InternalPortugolParser.g:4596:3: rule__ForStatement__StepExpeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__StepExpeAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getStepExpeAssignment_6_1()); 
            }

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
    // $ANTLR end "rule__ForStatement__Group_6__1__Impl"


    // $ANTLR start "rule__WhileStatement__Group__0"
    // InternalPortugolParser.g:4605:1: rule__WhileStatement__Group__0 : rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 ;
    public final void rule__WhileStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4609:1: ( rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 )
            // InternalPortugolParser.g:4610:2: rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__WhileStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WhileStatement__Group__0"


    // $ANTLR start "rule__WhileStatement__Group__0__Impl"
    // InternalPortugolParser.g:4617:1: rule__WhileStatement__Group__0__Impl : ( Enquanto ) ;
    public final void rule__WhileStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4621:1: ( ( Enquanto ) )
            // InternalPortugolParser.g:4622:1: ( Enquanto )
            {
            // InternalPortugolParser.g:4622:1: ( Enquanto )
            // InternalPortugolParser.g:4623:2: Enquanto
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getEnquantoKeyword_0()); 
            }
            match(input,Enquanto,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getEnquantoKeyword_0()); 
            }

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
    // $ANTLR end "rule__WhileStatement__Group__0__Impl"


    // $ANTLR start "rule__WhileStatement__Group__1"
    // InternalPortugolParser.g:4632:1: rule__WhileStatement__Group__1 : rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 ;
    public final void rule__WhileStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4636:1: ( rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 )
            // InternalPortugolParser.g:4637:2: rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__WhileStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WhileStatement__Group__1"


    // $ANTLR start "rule__WhileStatement__Group__1__Impl"
    // InternalPortugolParser.g:4644:1: rule__WhileStatement__Group__1__Impl : ( ( rule__WhileStatement__WhileExprAssignment_1 ) ) ;
    public final void rule__WhileStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4648:1: ( ( ( rule__WhileStatement__WhileExprAssignment_1 ) ) )
            // InternalPortugolParser.g:4649:1: ( ( rule__WhileStatement__WhileExprAssignment_1 ) )
            {
            // InternalPortugolParser.g:4649:1: ( ( rule__WhileStatement__WhileExprAssignment_1 ) )
            // InternalPortugolParser.g:4650:2: ( rule__WhileStatement__WhileExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getWhileExprAssignment_1()); 
            }
            // InternalPortugolParser.g:4651:2: ( rule__WhileStatement__WhileExprAssignment_1 )
            // InternalPortugolParser.g:4651:3: rule__WhileStatement__WhileExprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__WhileExprAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getWhileExprAssignment_1()); 
            }

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
    // $ANTLR end "rule__WhileStatement__Group__1__Impl"


    // $ANTLR start "rule__WhileStatement__Group__2"
    // InternalPortugolParser.g:4659:1: rule__WhileStatement__Group__2 : rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 ;
    public final void rule__WhileStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4663:1: ( rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 )
            // InternalPortugolParser.g:4664:2: rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__WhileStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WhileStatement__Group__2"


    // $ANTLR start "rule__WhileStatement__Group__2__Impl"
    // InternalPortugolParser.g:4671:1: rule__WhileStatement__Group__2__Impl : ( Faca ) ;
    public final void rule__WhileStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4675:1: ( ( Faca ) )
            // InternalPortugolParser.g:4676:1: ( Faca )
            {
            // InternalPortugolParser.g:4676:1: ( Faca )
            // InternalPortugolParser.g:4677:2: Faca
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getFacaKeyword_2()); 
            }
            match(input,Faca,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getFacaKeyword_2()); 
            }

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
    // $ANTLR end "rule__WhileStatement__Group__2__Impl"


    // $ANTLR start "rule__WhileStatement__Group__3"
    // InternalPortugolParser.g:4686:1: rule__WhileStatement__Group__3 : rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 ;
    public final void rule__WhileStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4690:1: ( rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 )
            // InternalPortugolParser.g:4691:2: rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__WhileStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WhileStatement__Group__3"


    // $ANTLR start "rule__WhileStatement__Group__3__Impl"
    // InternalPortugolParser.g:4698:1: rule__WhileStatement__Group__3__Impl : ( ( ( rule__WhileStatement__CommandsAssignment_3 ) ) ( ( rule__WhileStatement__CommandsAssignment_3 )* ) ) ;
    public final void rule__WhileStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4702:1: ( ( ( ( rule__WhileStatement__CommandsAssignment_3 ) ) ( ( rule__WhileStatement__CommandsAssignment_3 )* ) ) )
            // InternalPortugolParser.g:4703:1: ( ( ( rule__WhileStatement__CommandsAssignment_3 ) ) ( ( rule__WhileStatement__CommandsAssignment_3 )* ) )
            {
            // InternalPortugolParser.g:4703:1: ( ( ( rule__WhileStatement__CommandsAssignment_3 ) ) ( ( rule__WhileStatement__CommandsAssignment_3 )* ) )
            // InternalPortugolParser.g:4704:2: ( ( rule__WhileStatement__CommandsAssignment_3 ) ) ( ( rule__WhileStatement__CommandsAssignment_3 )* )
            {
            // InternalPortugolParser.g:4704:2: ( ( rule__WhileStatement__CommandsAssignment_3 ) )
            // InternalPortugolParser.g:4705:3: ( rule__WhileStatement__CommandsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugolParser.g:4706:3: ( rule__WhileStatement__CommandsAssignment_3 )
            // InternalPortugolParser.g:4706:4: rule__WhileStatement__CommandsAssignment_3
            {
            pushFollow(FOLLOW_18);
            rule__WhileStatement__CommandsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getCommandsAssignment_3()); 
            }

            }

            // InternalPortugolParser.g:4709:2: ( ( rule__WhileStatement__CommandsAssignment_3 )* )
            // InternalPortugolParser.g:4710:3: ( rule__WhileStatement__CommandsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugolParser.g:4711:3: ( rule__WhileStatement__CommandsAssignment_3 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==Interrompa||(LA40_0>=Enquanto && LA40_0<=Escreva)||LA40_0==Retorne||(LA40_0>=Maiusc && LA40_0<=Copia)||LA40_0==Raizq||(LA40_0>=Leia && LA40_0<=Para)||LA40_0==NOT||(LA40_0>=Pi && LA40_0<=Se)||LA40_0==LeftParenthesis||LA40_0==HyphenMinus||(LA40_0>=RULE_INT && LA40_0<=RULE_STRING)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPortugolParser.g:4711:4: rule__WhileStatement__CommandsAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__WhileStatement__CommandsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getCommandsAssignment_3()); 
            }

            }


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
    // $ANTLR end "rule__WhileStatement__Group__3__Impl"


    // $ANTLR start "rule__WhileStatement__Group__4"
    // InternalPortugolParser.g:4720:1: rule__WhileStatement__Group__4 : rule__WhileStatement__Group__4__Impl ;
    public final void rule__WhileStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4724:1: ( rule__WhileStatement__Group__4__Impl )
            // InternalPortugolParser.g:4725:2: rule__WhileStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WhileStatement__Group__4"


    // $ANTLR start "rule__WhileStatement__Group__4__Impl"
    // InternalPortugolParser.g:4731:1: rule__WhileStatement__Group__4__Impl : ( Fimenquanto ) ;
    public final void rule__WhileStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4735:1: ( ( Fimenquanto ) )
            // InternalPortugolParser.g:4736:1: ( Fimenquanto )
            {
            // InternalPortugolParser.g:4736:1: ( Fimenquanto )
            // InternalPortugolParser.g:4737:2: Fimenquanto
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getFimenquantoKeyword_4()); 
            }
            match(input,Fimenquanto,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getFimenquantoKeyword_4()); 
            }

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
    // $ANTLR end "rule__WhileStatement__Group__4__Impl"


    // $ANTLR start "rule__RepeatStatement__Group__0"
    // InternalPortugolParser.g:4747:1: rule__RepeatStatement__Group__0 : rule__RepeatStatement__Group__0__Impl rule__RepeatStatement__Group__1 ;
    public final void rule__RepeatStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4751:1: ( rule__RepeatStatement__Group__0__Impl rule__RepeatStatement__Group__1 )
            // InternalPortugolParser.g:4752:2: rule__RepeatStatement__Group__0__Impl rule__RepeatStatement__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__RepeatStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RepeatStatement__Group__0"


    // $ANTLR start "rule__RepeatStatement__Group__0__Impl"
    // InternalPortugolParser.g:4759:1: rule__RepeatStatement__Group__0__Impl : ( Repita ) ;
    public final void rule__RepeatStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4763:1: ( ( Repita ) )
            // InternalPortugolParser.g:4764:1: ( Repita )
            {
            // InternalPortugolParser.g:4764:1: ( Repita )
            // InternalPortugolParser.g:4765:2: Repita
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatStatementAccess().getRepitaKeyword_0()); 
            }
            match(input,Repita,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatStatementAccess().getRepitaKeyword_0()); 
            }

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
    // $ANTLR end "rule__RepeatStatement__Group__0__Impl"


    // $ANTLR start "rule__RepeatStatement__Group__1"
    // InternalPortugolParser.g:4774:1: rule__RepeatStatement__Group__1 : rule__RepeatStatement__Group__1__Impl rule__RepeatStatement__Group__2 ;
    public final void rule__RepeatStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4778:1: ( rule__RepeatStatement__Group__1__Impl rule__RepeatStatement__Group__2 )
            // InternalPortugolParser.g:4779:2: rule__RepeatStatement__Group__1__Impl rule__RepeatStatement__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__RepeatStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RepeatStatement__Group__1"


    // $ANTLR start "rule__RepeatStatement__Group__1__Impl"
    // InternalPortugolParser.g:4786:1: rule__RepeatStatement__Group__1__Impl : ( ( ( rule__RepeatStatement__CommandsAssignment_1 ) ) ( ( rule__RepeatStatement__CommandsAssignment_1 )* ) ) ;
    public final void rule__RepeatStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4790:1: ( ( ( ( rule__RepeatStatement__CommandsAssignment_1 ) ) ( ( rule__RepeatStatement__CommandsAssignment_1 )* ) ) )
            // InternalPortugolParser.g:4791:1: ( ( ( rule__RepeatStatement__CommandsAssignment_1 ) ) ( ( rule__RepeatStatement__CommandsAssignment_1 )* ) )
            {
            // InternalPortugolParser.g:4791:1: ( ( ( rule__RepeatStatement__CommandsAssignment_1 ) ) ( ( rule__RepeatStatement__CommandsAssignment_1 )* ) )
            // InternalPortugolParser.g:4792:2: ( ( rule__RepeatStatement__CommandsAssignment_1 ) ) ( ( rule__RepeatStatement__CommandsAssignment_1 )* )
            {
            // InternalPortugolParser.g:4792:2: ( ( rule__RepeatStatement__CommandsAssignment_1 ) )
            // InternalPortugolParser.g:4793:3: ( rule__RepeatStatement__CommandsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatStatementAccess().getCommandsAssignment_1()); 
            }
            // InternalPortugolParser.g:4794:3: ( rule__RepeatStatement__CommandsAssignment_1 )
            // InternalPortugolParser.g:4794:4: rule__RepeatStatement__CommandsAssignment_1
            {
            pushFollow(FOLLOW_18);
            rule__RepeatStatement__CommandsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatStatementAccess().getCommandsAssignment_1()); 
            }

            }

            // InternalPortugolParser.g:4797:2: ( ( rule__RepeatStatement__CommandsAssignment_1 )* )
            // InternalPortugolParser.g:4798:3: ( rule__RepeatStatement__CommandsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatStatementAccess().getCommandsAssignment_1()); 
            }
            // InternalPortugolParser.g:4799:3: ( rule__RepeatStatement__CommandsAssignment_1 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==Interrompa||(LA41_0>=Enquanto && LA41_0<=Escreva)||LA41_0==Retorne||(LA41_0>=Maiusc && LA41_0<=Copia)||LA41_0==Raizq||(LA41_0>=Leia && LA41_0<=Para)||LA41_0==NOT||(LA41_0>=Pi && LA41_0<=Se)||LA41_0==LeftParenthesis||LA41_0==HyphenMinus||(LA41_0>=RULE_INT && LA41_0<=RULE_STRING)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPortugolParser.g:4799:4: rule__RepeatStatement__CommandsAssignment_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__RepeatStatement__CommandsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatStatementAccess().getCommandsAssignment_1()); 
            }

            }


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
    // $ANTLR end "rule__RepeatStatement__Group__1__Impl"


    // $ANTLR start "rule__RepeatStatement__Group__2"
    // InternalPortugolParser.g:4808:1: rule__RepeatStatement__Group__2 : rule__RepeatStatement__Group__2__Impl rule__RepeatStatement__Group__3 ;
    public final void rule__RepeatStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4812:1: ( rule__RepeatStatement__Group__2__Impl rule__RepeatStatement__Group__3 )
            // InternalPortugolParser.g:4813:2: rule__RepeatStatement__Group__2__Impl rule__RepeatStatement__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__RepeatStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RepeatStatement__Group__2"


    // $ANTLR start "rule__RepeatStatement__Group__2__Impl"
    // InternalPortugolParser.g:4820:1: rule__RepeatStatement__Group__2__Impl : ( Ate ) ;
    public final void rule__RepeatStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4824:1: ( ( Ate ) )
            // InternalPortugolParser.g:4825:1: ( Ate )
            {
            // InternalPortugolParser.g:4825:1: ( Ate )
            // InternalPortugolParser.g:4826:2: Ate
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatStatementAccess().getAteKeyword_2()); 
            }
            match(input,Ate,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatStatementAccess().getAteKeyword_2()); 
            }

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
    // $ANTLR end "rule__RepeatStatement__Group__2__Impl"


    // $ANTLR start "rule__RepeatStatement__Group__3"
    // InternalPortugolParser.g:4835:1: rule__RepeatStatement__Group__3 : rule__RepeatStatement__Group__3__Impl rule__RepeatStatement__Group__4 ;
    public final void rule__RepeatStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4839:1: ( rule__RepeatStatement__Group__3__Impl rule__RepeatStatement__Group__4 )
            // InternalPortugolParser.g:4840:2: rule__RepeatStatement__Group__3__Impl rule__RepeatStatement__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__RepeatStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepeatStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RepeatStatement__Group__3"


    // $ANTLR start "rule__RepeatStatement__Group__3__Impl"
    // InternalPortugolParser.g:4847:1: rule__RepeatStatement__Group__3__Impl : ( ( rule__RepeatStatement__UntilExprAssignment_3 ) ) ;
    public final void rule__RepeatStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4851:1: ( ( ( rule__RepeatStatement__UntilExprAssignment_3 ) ) )
            // InternalPortugolParser.g:4852:1: ( ( rule__RepeatStatement__UntilExprAssignment_3 ) )
            {
            // InternalPortugolParser.g:4852:1: ( ( rule__RepeatStatement__UntilExprAssignment_3 ) )
            // InternalPortugolParser.g:4853:2: ( rule__RepeatStatement__UntilExprAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatStatementAccess().getUntilExprAssignment_3()); 
            }
            // InternalPortugolParser.g:4854:2: ( rule__RepeatStatement__UntilExprAssignment_3 )
            // InternalPortugolParser.g:4854:3: rule__RepeatStatement__UntilExprAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RepeatStatement__UntilExprAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatStatementAccess().getUntilExprAssignment_3()); 
            }

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
    // $ANTLR end "rule__RepeatStatement__Group__3__Impl"


    // $ANTLR start "rule__RepeatStatement__Group__4"
    // InternalPortugolParser.g:4862:1: rule__RepeatStatement__Group__4 : rule__RepeatStatement__Group__4__Impl ;
    public final void rule__RepeatStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4866:1: ( rule__RepeatStatement__Group__4__Impl )
            // InternalPortugolParser.g:4867:2: rule__RepeatStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepeatStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RepeatStatement__Group__4"


    // $ANTLR start "rule__RepeatStatement__Group__4__Impl"
    // InternalPortugolParser.g:4873:1: rule__RepeatStatement__Group__4__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__RepeatStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4877:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugolParser.g:4878:1: ( ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:4878:1: ( ruleEND_COMMAND )
            // InternalPortugolParser.g:4879:2: ruleEND_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatStatementAccess().getEND_COMMANDParserRuleCall_4()); 
            }
            pushFollow(FOLLOW_2);
            ruleEND_COMMAND();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatStatementAccess().getEND_COMMANDParserRuleCall_4()); 
            }

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
    // $ANTLR end "rule__RepeatStatement__Group__4__Impl"


    // $ANTLR start "rule__SubprogramParam__Group__0"
    // InternalPortugolParser.g:4889:1: rule__SubprogramParam__Group__0 : rule__SubprogramParam__Group__0__Impl rule__SubprogramParam__Group__1 ;
    public final void rule__SubprogramParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4893:1: ( rule__SubprogramParam__Group__0__Impl rule__SubprogramParam__Group__1 )
            // InternalPortugolParser.g:4894:2: rule__SubprogramParam__Group__0__Impl rule__SubprogramParam__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__SubprogramParam__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubprogramParam__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SubprogramParam__Group__0"


    // $ANTLR start "rule__SubprogramParam__Group__0__Impl"
    // InternalPortugolParser.g:4901:1: rule__SubprogramParam__Group__0__Impl : ( ( rule__SubprogramParam__ExpressionAssignment_0 ) ) ;
    public final void rule__SubprogramParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4905:1: ( ( ( rule__SubprogramParam__ExpressionAssignment_0 ) ) )
            // InternalPortugolParser.g:4906:1: ( ( rule__SubprogramParam__ExpressionAssignment_0 ) )
            {
            // InternalPortugolParser.g:4906:1: ( ( rule__SubprogramParam__ExpressionAssignment_0 ) )
            // InternalPortugolParser.g:4907:2: ( rule__SubprogramParam__ExpressionAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamAccess().getExpressionAssignment_0()); 
            }
            // InternalPortugolParser.g:4908:2: ( rule__SubprogramParam__ExpressionAssignment_0 )
            // InternalPortugolParser.g:4908:3: rule__SubprogramParam__ExpressionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SubprogramParam__ExpressionAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubprogramParamAccess().getExpressionAssignment_0()); 
            }

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
    // $ANTLR end "rule__SubprogramParam__Group__0__Impl"


    // $ANTLR start "rule__SubprogramParam__Group__1"
    // InternalPortugolParser.g:4916:1: rule__SubprogramParam__Group__1 : rule__SubprogramParam__Group__1__Impl ;
    public final void rule__SubprogramParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4920:1: ( rule__SubprogramParam__Group__1__Impl )
            // InternalPortugolParser.g:4921:2: rule__SubprogramParam__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubprogramParam__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SubprogramParam__Group__1"


    // $ANTLR start "rule__SubprogramParam__Group__1__Impl"
    // InternalPortugolParser.g:4927:1: rule__SubprogramParam__Group__1__Impl : ( ( rule__SubprogramParam__Group_1__0 )* ) ;
    public final void rule__SubprogramParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4931:1: ( ( ( rule__SubprogramParam__Group_1__0 )* ) )
            // InternalPortugolParser.g:4932:1: ( ( rule__SubprogramParam__Group_1__0 )* )
            {
            // InternalPortugolParser.g:4932:1: ( ( rule__SubprogramParam__Group_1__0 )* )
            // InternalPortugolParser.g:4933:2: ( rule__SubprogramParam__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:4934:2: ( rule__SubprogramParam__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==Comma) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalPortugolParser.g:4934:3: rule__SubprogramParam__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__SubprogramParam__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubprogramParamAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__SubprogramParam__Group__1__Impl"


    // $ANTLR start "rule__SubprogramParam__Group_1__0"
    // InternalPortugolParser.g:4943:1: rule__SubprogramParam__Group_1__0 : rule__SubprogramParam__Group_1__0__Impl rule__SubprogramParam__Group_1__1 ;
    public final void rule__SubprogramParam__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4947:1: ( rule__SubprogramParam__Group_1__0__Impl rule__SubprogramParam__Group_1__1 )
            // InternalPortugolParser.g:4948:2: rule__SubprogramParam__Group_1__0__Impl rule__SubprogramParam__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__SubprogramParam__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubprogramParam__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SubprogramParam__Group_1__0"


    // $ANTLR start "rule__SubprogramParam__Group_1__0__Impl"
    // InternalPortugolParser.g:4955:1: rule__SubprogramParam__Group_1__0__Impl : ( Comma ) ;
    public final void rule__SubprogramParam__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4959:1: ( ( Comma ) )
            // InternalPortugolParser.g:4960:1: ( Comma )
            {
            // InternalPortugolParser.g:4960:1: ( Comma )
            // InternalPortugolParser.g:4961:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamAccess().getCommaKeyword_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubprogramParamAccess().getCommaKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__SubprogramParam__Group_1__0__Impl"


    // $ANTLR start "rule__SubprogramParam__Group_1__1"
    // InternalPortugolParser.g:4970:1: rule__SubprogramParam__Group_1__1 : rule__SubprogramParam__Group_1__1__Impl ;
    public final void rule__SubprogramParam__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4974:1: ( rule__SubprogramParam__Group_1__1__Impl )
            // InternalPortugolParser.g:4975:2: rule__SubprogramParam__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubprogramParam__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SubprogramParam__Group_1__1"


    // $ANTLR start "rule__SubprogramParam__Group_1__1__Impl"
    // InternalPortugolParser.g:4981:1: rule__SubprogramParam__Group_1__1__Impl : ( ( rule__SubprogramParam__ExpressionAssignment_1_1 ) ) ;
    public final void rule__SubprogramParam__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4985:1: ( ( ( rule__SubprogramParam__ExpressionAssignment_1_1 ) ) )
            // InternalPortugolParser.g:4986:1: ( ( rule__SubprogramParam__ExpressionAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:4986:1: ( ( rule__SubprogramParam__ExpressionAssignment_1_1 ) )
            // InternalPortugolParser.g:4987:2: ( rule__SubprogramParam__ExpressionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamAccess().getExpressionAssignment_1_1()); 
            }
            // InternalPortugolParser.g:4988:2: ( rule__SubprogramParam__ExpressionAssignment_1_1 )
            // InternalPortugolParser.g:4988:3: rule__SubprogramParam__ExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SubprogramParam__ExpressionAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubprogramParamAccess().getExpressionAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__SubprogramParam__Group_1__1__Impl"


    // $ANTLR start "rule__ReadCommand__Group__0"
    // InternalPortugolParser.g:4997:1: rule__ReadCommand__Group__0 : rule__ReadCommand__Group__0__Impl rule__ReadCommand__Group__1 ;
    public final void rule__ReadCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5001:1: ( rule__ReadCommand__Group__0__Impl rule__ReadCommand__Group__1 )
            // InternalPortugolParser.g:5002:2: rule__ReadCommand__Group__0__Impl rule__ReadCommand__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ReadCommand__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReadCommand__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReadCommand__Group__0"


    // $ANTLR start "rule__ReadCommand__Group__0__Impl"
    // InternalPortugolParser.g:5009:1: rule__ReadCommand__Group__0__Impl : ( Leia ) ;
    public final void rule__ReadCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5013:1: ( ( Leia ) )
            // InternalPortugolParser.g:5014:1: ( Leia )
            {
            // InternalPortugolParser.g:5014:1: ( Leia )
            // InternalPortugolParser.g:5015:2: Leia
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getLeiaKeyword_0()); 
            }
            match(input,Leia,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReadCommandAccess().getLeiaKeyword_0()); 
            }

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
    // $ANTLR end "rule__ReadCommand__Group__0__Impl"


    // $ANTLR start "rule__ReadCommand__Group__1"
    // InternalPortugolParser.g:5024:1: rule__ReadCommand__Group__1 : rule__ReadCommand__Group__1__Impl rule__ReadCommand__Group__2 ;
    public final void rule__ReadCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5028:1: ( rule__ReadCommand__Group__1__Impl rule__ReadCommand__Group__2 )
            // InternalPortugolParser.g:5029:2: rule__ReadCommand__Group__1__Impl rule__ReadCommand__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ReadCommand__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReadCommand__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReadCommand__Group__1"


    // $ANTLR start "rule__ReadCommand__Group__1__Impl"
    // InternalPortugolParser.g:5036:1: rule__ReadCommand__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__ReadCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5040:1: ( ( LeftParenthesis ) )
            // InternalPortugolParser.g:5041:1: ( LeftParenthesis )
            {
            // InternalPortugolParser.g:5041:1: ( LeftParenthesis )
            // InternalPortugolParser.g:5042:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReadCommandAccess().getLeftParenthesisKeyword_1()); 
            }

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
    // $ANTLR end "rule__ReadCommand__Group__1__Impl"


    // $ANTLR start "rule__ReadCommand__Group__2"
    // InternalPortugolParser.g:5051:1: rule__ReadCommand__Group__2 : rule__ReadCommand__Group__2__Impl rule__ReadCommand__Group__3 ;
    public final void rule__ReadCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5055:1: ( rule__ReadCommand__Group__2__Impl rule__ReadCommand__Group__3 )
            // InternalPortugolParser.g:5056:2: rule__ReadCommand__Group__2__Impl rule__ReadCommand__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__ReadCommand__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReadCommand__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReadCommand__Group__2"


    // $ANTLR start "rule__ReadCommand__Group__2__Impl"
    // InternalPortugolParser.g:5063:1: rule__ReadCommand__Group__2__Impl : ( ( rule__ReadCommand__ParamListAssignment_2 ) ) ;
    public final void rule__ReadCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5067:1: ( ( ( rule__ReadCommand__ParamListAssignment_2 ) ) )
            // InternalPortugolParser.g:5068:1: ( ( rule__ReadCommand__ParamListAssignment_2 ) )
            {
            // InternalPortugolParser.g:5068:1: ( ( rule__ReadCommand__ParamListAssignment_2 ) )
            // InternalPortugolParser.g:5069:2: ( rule__ReadCommand__ParamListAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getParamListAssignment_2()); 
            }
            // InternalPortugolParser.g:5070:2: ( rule__ReadCommand__ParamListAssignment_2 )
            // InternalPortugolParser.g:5070:3: rule__ReadCommand__ParamListAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReadCommand__ParamListAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReadCommandAccess().getParamListAssignment_2()); 
            }

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
    // $ANTLR end "rule__ReadCommand__Group__2__Impl"


    // $ANTLR start "rule__ReadCommand__Group__3"
    // InternalPortugolParser.g:5078:1: rule__ReadCommand__Group__3 : rule__ReadCommand__Group__3__Impl ;
    public final void rule__ReadCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5082:1: ( rule__ReadCommand__Group__3__Impl )
            // InternalPortugolParser.g:5083:2: rule__ReadCommand__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReadCommand__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ReadCommand__Group__3"


    // $ANTLR start "rule__ReadCommand__Group__3__Impl"
    // InternalPortugolParser.g:5089:1: rule__ReadCommand__Group__3__Impl : ( RightParenthesis ) ;
    public final void rule__ReadCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5093:1: ( ( RightParenthesis ) )
            // InternalPortugolParser.g:5094:1: ( RightParenthesis )
            {
            // InternalPortugolParser.g:5094:1: ( RightParenthesis )
            // InternalPortugolParser.g:5095:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReadCommandAccess().getRightParenthesisKeyword_3()); 
            }

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
    // $ANTLR end "rule__ReadCommand__Group__3__Impl"


    // $ANTLR start "rule__WriteCommand__Group__0"
    // InternalPortugolParser.g:5105:1: rule__WriteCommand__Group__0 : rule__WriteCommand__Group__0__Impl rule__WriteCommand__Group__1 ;
    public final void rule__WriteCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5109:1: ( rule__WriteCommand__Group__0__Impl rule__WriteCommand__Group__1 )
            // InternalPortugolParser.g:5110:2: rule__WriteCommand__Group__0__Impl rule__WriteCommand__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__WriteCommand__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WriteCommand__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WriteCommand__Group__0"


    // $ANTLR start "rule__WriteCommand__Group__0__Impl"
    // InternalPortugolParser.g:5117:1: rule__WriteCommand__Group__0__Impl : ( ( rule__WriteCommand__WriteCommandAssignment_0 ) ) ;
    public final void rule__WriteCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5121:1: ( ( ( rule__WriteCommand__WriteCommandAssignment_0 ) ) )
            // InternalPortugolParser.g:5122:1: ( ( rule__WriteCommand__WriteCommandAssignment_0 ) )
            {
            // InternalPortugolParser.g:5122:1: ( ( rule__WriteCommand__WriteCommandAssignment_0 ) )
            // InternalPortugolParser.g:5123:2: ( rule__WriteCommand__WriteCommandAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getWriteCommandAssignment_0()); 
            }
            // InternalPortugolParser.g:5124:2: ( rule__WriteCommand__WriteCommandAssignment_0 )
            // InternalPortugolParser.g:5124:3: rule__WriteCommand__WriteCommandAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__WriteCommand__WriteCommandAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteCommandAccess().getWriteCommandAssignment_0()); 
            }

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
    // $ANTLR end "rule__WriteCommand__Group__0__Impl"


    // $ANTLR start "rule__WriteCommand__Group__1"
    // InternalPortugolParser.g:5132:1: rule__WriteCommand__Group__1 : rule__WriteCommand__Group__1__Impl rule__WriteCommand__Group__2 ;
    public final void rule__WriteCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5136:1: ( rule__WriteCommand__Group__1__Impl rule__WriteCommand__Group__2 )
            // InternalPortugolParser.g:5137:2: rule__WriteCommand__Group__1__Impl rule__WriteCommand__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__WriteCommand__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WriteCommand__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WriteCommand__Group__1"


    // $ANTLR start "rule__WriteCommand__Group__1__Impl"
    // InternalPortugolParser.g:5144:1: rule__WriteCommand__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__WriteCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5148:1: ( ( LeftParenthesis ) )
            // InternalPortugolParser.g:5149:1: ( LeftParenthesis )
            {
            // InternalPortugolParser.g:5149:1: ( LeftParenthesis )
            // InternalPortugolParser.g:5150:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteCommandAccess().getLeftParenthesisKeyword_1()); 
            }

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
    // $ANTLR end "rule__WriteCommand__Group__1__Impl"


    // $ANTLR start "rule__WriteCommand__Group__2"
    // InternalPortugolParser.g:5159:1: rule__WriteCommand__Group__2 : rule__WriteCommand__Group__2__Impl rule__WriteCommand__Group__3 ;
    public final void rule__WriteCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5163:1: ( rule__WriteCommand__Group__2__Impl rule__WriteCommand__Group__3 )
            // InternalPortugolParser.g:5164:2: rule__WriteCommand__Group__2__Impl rule__WriteCommand__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__WriteCommand__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WriteCommand__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WriteCommand__Group__2"


    // $ANTLR start "rule__WriteCommand__Group__2__Impl"
    // InternalPortugolParser.g:5171:1: rule__WriteCommand__Group__2__Impl : ( ( rule__WriteCommand__WriteParamAssignment_2 ) ) ;
    public final void rule__WriteCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5175:1: ( ( ( rule__WriteCommand__WriteParamAssignment_2 ) ) )
            // InternalPortugolParser.g:5176:1: ( ( rule__WriteCommand__WriteParamAssignment_2 ) )
            {
            // InternalPortugolParser.g:5176:1: ( ( rule__WriteCommand__WriteParamAssignment_2 ) )
            // InternalPortugolParser.g:5177:2: ( rule__WriteCommand__WriteParamAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getWriteParamAssignment_2()); 
            }
            // InternalPortugolParser.g:5178:2: ( rule__WriteCommand__WriteParamAssignment_2 )
            // InternalPortugolParser.g:5178:3: rule__WriteCommand__WriteParamAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WriteCommand__WriteParamAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteCommandAccess().getWriteParamAssignment_2()); 
            }

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
    // $ANTLR end "rule__WriteCommand__Group__2__Impl"


    // $ANTLR start "rule__WriteCommand__Group__3"
    // InternalPortugolParser.g:5186:1: rule__WriteCommand__Group__3 : rule__WriteCommand__Group__3__Impl ;
    public final void rule__WriteCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5190:1: ( rule__WriteCommand__Group__3__Impl )
            // InternalPortugolParser.g:5191:2: rule__WriteCommand__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WriteCommand__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WriteCommand__Group__3"


    // $ANTLR start "rule__WriteCommand__Group__3__Impl"
    // InternalPortugolParser.g:5197:1: rule__WriteCommand__Group__3__Impl : ( RightParenthesis ) ;
    public final void rule__WriteCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5201:1: ( ( RightParenthesis ) )
            // InternalPortugolParser.g:5202:1: ( RightParenthesis )
            {
            // InternalPortugolParser.g:5202:1: ( RightParenthesis )
            // InternalPortugolParser.g:5203:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteCommandAccess().getRightParenthesisKeyword_3()); 
            }

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
    // $ANTLR end "rule__WriteCommand__Group__3__Impl"


    // $ANTLR start "rule__WriteParam__Group__0"
    // InternalPortugolParser.g:5213:1: rule__WriteParam__Group__0 : rule__WriteParam__Group__0__Impl rule__WriteParam__Group__1 ;
    public final void rule__WriteParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5217:1: ( rule__WriteParam__Group__0__Impl rule__WriteParam__Group__1 )
            // InternalPortugolParser.g:5218:2: rule__WriteParam__Group__0__Impl rule__WriteParam__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__WriteParam__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WriteParam__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WriteParam__Group__0"


    // $ANTLR start "rule__WriteParam__Group__0__Impl"
    // InternalPortugolParser.g:5225:1: rule__WriteParam__Group__0__Impl : ( ( rule__WriteParam__ParamsAssignment_0 ) ) ;
    public final void rule__WriteParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5229:1: ( ( ( rule__WriteParam__ParamsAssignment_0 ) ) )
            // InternalPortugolParser.g:5230:1: ( ( rule__WriteParam__ParamsAssignment_0 ) )
            {
            // InternalPortugolParser.g:5230:1: ( ( rule__WriteParam__ParamsAssignment_0 ) )
            // InternalPortugolParser.g:5231:2: ( rule__WriteParam__ParamsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getParamsAssignment_0()); 
            }
            // InternalPortugolParser.g:5232:2: ( rule__WriteParam__ParamsAssignment_0 )
            // InternalPortugolParser.g:5232:3: rule__WriteParam__ParamsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__WriteParam__ParamsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteParamAccess().getParamsAssignment_0()); 
            }

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
    // $ANTLR end "rule__WriteParam__Group__0__Impl"


    // $ANTLR start "rule__WriteParam__Group__1"
    // InternalPortugolParser.g:5240:1: rule__WriteParam__Group__1 : rule__WriteParam__Group__1__Impl ;
    public final void rule__WriteParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5244:1: ( rule__WriteParam__Group__1__Impl )
            // InternalPortugolParser.g:5245:2: rule__WriteParam__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WriteParam__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WriteParam__Group__1"


    // $ANTLR start "rule__WriteParam__Group__1__Impl"
    // InternalPortugolParser.g:5251:1: rule__WriteParam__Group__1__Impl : ( ( rule__WriteParam__PrecisionAssignment_1 )? ) ;
    public final void rule__WriteParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5255:1: ( ( ( rule__WriteParam__PrecisionAssignment_1 )? ) )
            // InternalPortugolParser.g:5256:1: ( ( rule__WriteParam__PrecisionAssignment_1 )? )
            {
            // InternalPortugolParser.g:5256:1: ( ( rule__WriteParam__PrecisionAssignment_1 )? )
            // InternalPortugolParser.g:5257:2: ( rule__WriteParam__PrecisionAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getPrecisionAssignment_1()); 
            }
            // InternalPortugolParser.g:5258:2: ( rule__WriteParam__PrecisionAssignment_1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Colon) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPortugolParser.g:5258:3: rule__WriteParam__PrecisionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__WriteParam__PrecisionAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteParamAccess().getPrecisionAssignment_1()); 
            }

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
    // $ANTLR end "rule__WriteParam__Group__1__Impl"


    // $ANTLR start "rule__OptDecimalPrecision__Group__0"
    // InternalPortugolParser.g:5267:1: rule__OptDecimalPrecision__Group__0 : rule__OptDecimalPrecision__Group__0__Impl rule__OptDecimalPrecision__Group__1 ;
    public final void rule__OptDecimalPrecision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5271:1: ( rule__OptDecimalPrecision__Group__0__Impl rule__OptDecimalPrecision__Group__1 )
            // InternalPortugolParser.g:5272:2: rule__OptDecimalPrecision__Group__0__Impl rule__OptDecimalPrecision__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__OptDecimalPrecision__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OptDecimalPrecision__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OptDecimalPrecision__Group__0"


    // $ANTLR start "rule__OptDecimalPrecision__Group__0__Impl"
    // InternalPortugolParser.g:5279:1: rule__OptDecimalPrecision__Group__0__Impl : ( Colon ) ;
    public final void rule__OptDecimalPrecision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5283:1: ( ( Colon ) )
            // InternalPortugolParser.g:5284:1: ( Colon )
            {
            // InternalPortugolParser.g:5284:1: ( Colon )
            // InternalPortugolParser.g:5285:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getColonKeyword_0()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptDecimalPrecisionAccess().getColonKeyword_0()); 
            }

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
    // $ANTLR end "rule__OptDecimalPrecision__Group__0__Impl"


    // $ANTLR start "rule__OptDecimalPrecision__Group__1"
    // InternalPortugolParser.g:5294:1: rule__OptDecimalPrecision__Group__1 : rule__OptDecimalPrecision__Group__1__Impl rule__OptDecimalPrecision__Group__2 ;
    public final void rule__OptDecimalPrecision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5298:1: ( rule__OptDecimalPrecision__Group__1__Impl rule__OptDecimalPrecision__Group__2 )
            // InternalPortugolParser.g:5299:2: rule__OptDecimalPrecision__Group__1__Impl rule__OptDecimalPrecision__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__OptDecimalPrecision__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OptDecimalPrecision__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OptDecimalPrecision__Group__1"


    // $ANTLR start "rule__OptDecimalPrecision__Group__1__Impl"
    // InternalPortugolParser.g:5306:1: rule__OptDecimalPrecision__Group__1__Impl : ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) ) ;
    public final void rule__OptDecimalPrecision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5310:1: ( ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) ) )
            // InternalPortugolParser.g:5311:1: ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) )
            {
            // InternalPortugolParser.g:5311:1: ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) )
            // InternalPortugolParser.g:5312:2: ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getFirstPrecisionAssignment_1()); 
            }
            // InternalPortugolParser.g:5313:2: ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 )
            // InternalPortugolParser.g:5313:3: rule__OptDecimalPrecision__FirstPrecisionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OptDecimalPrecision__FirstPrecisionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptDecimalPrecisionAccess().getFirstPrecisionAssignment_1()); 
            }

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
    // $ANTLR end "rule__OptDecimalPrecision__Group__1__Impl"


    // $ANTLR start "rule__OptDecimalPrecision__Group__2"
    // InternalPortugolParser.g:5321:1: rule__OptDecimalPrecision__Group__2 : rule__OptDecimalPrecision__Group__2__Impl ;
    public final void rule__OptDecimalPrecision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5325:1: ( rule__OptDecimalPrecision__Group__2__Impl )
            // InternalPortugolParser.g:5326:2: rule__OptDecimalPrecision__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OptDecimalPrecision__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OptDecimalPrecision__Group__2"


    // $ANTLR start "rule__OptDecimalPrecision__Group__2__Impl"
    // InternalPortugolParser.g:5332:1: rule__OptDecimalPrecision__Group__2__Impl : ( ( rule__OptDecimalPrecision__Group_2__0 )? ) ;
    public final void rule__OptDecimalPrecision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5336:1: ( ( ( rule__OptDecimalPrecision__Group_2__0 )? ) )
            // InternalPortugolParser.g:5337:1: ( ( rule__OptDecimalPrecision__Group_2__0 )? )
            {
            // InternalPortugolParser.g:5337:1: ( ( rule__OptDecimalPrecision__Group_2__0 )? )
            // InternalPortugolParser.g:5338:2: ( rule__OptDecimalPrecision__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getGroup_2()); 
            }
            // InternalPortugolParser.g:5339:2: ( rule__OptDecimalPrecision__Group_2__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Colon) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalPortugolParser.g:5339:3: rule__OptDecimalPrecision__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OptDecimalPrecision__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptDecimalPrecisionAccess().getGroup_2()); 
            }

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
    // $ANTLR end "rule__OptDecimalPrecision__Group__2__Impl"


    // $ANTLR start "rule__OptDecimalPrecision__Group_2__0"
    // InternalPortugolParser.g:5348:1: rule__OptDecimalPrecision__Group_2__0 : rule__OptDecimalPrecision__Group_2__0__Impl rule__OptDecimalPrecision__Group_2__1 ;
    public final void rule__OptDecimalPrecision__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5352:1: ( rule__OptDecimalPrecision__Group_2__0__Impl rule__OptDecimalPrecision__Group_2__1 )
            // InternalPortugolParser.g:5353:2: rule__OptDecimalPrecision__Group_2__0__Impl rule__OptDecimalPrecision__Group_2__1
            {
            pushFollow(FOLLOW_36);
            rule__OptDecimalPrecision__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OptDecimalPrecision__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OptDecimalPrecision__Group_2__0"


    // $ANTLR start "rule__OptDecimalPrecision__Group_2__0__Impl"
    // InternalPortugolParser.g:5360:1: rule__OptDecimalPrecision__Group_2__0__Impl : ( Colon ) ;
    public final void rule__OptDecimalPrecision__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5364:1: ( ( Colon ) )
            // InternalPortugolParser.g:5365:1: ( Colon )
            {
            // InternalPortugolParser.g:5365:1: ( Colon )
            // InternalPortugolParser.g:5366:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getColonKeyword_2_0()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptDecimalPrecisionAccess().getColonKeyword_2_0()); 
            }

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
    // $ANTLR end "rule__OptDecimalPrecision__Group_2__0__Impl"


    // $ANTLR start "rule__OptDecimalPrecision__Group_2__1"
    // InternalPortugolParser.g:5375:1: rule__OptDecimalPrecision__Group_2__1 : rule__OptDecimalPrecision__Group_2__1__Impl ;
    public final void rule__OptDecimalPrecision__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5379:1: ( rule__OptDecimalPrecision__Group_2__1__Impl )
            // InternalPortugolParser.g:5380:2: rule__OptDecimalPrecision__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OptDecimalPrecision__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OptDecimalPrecision__Group_2__1"


    // $ANTLR start "rule__OptDecimalPrecision__Group_2__1__Impl"
    // InternalPortugolParser.g:5386:1: rule__OptDecimalPrecision__Group_2__1__Impl : ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) ) ;
    public final void rule__OptDecimalPrecision__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5390:1: ( ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) ) )
            // InternalPortugolParser.g:5391:1: ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) )
            {
            // InternalPortugolParser.g:5391:1: ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) )
            // InternalPortugolParser.g:5392:2: ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getSecondPrecisionAssignment_2_1()); 
            }
            // InternalPortugolParser.g:5393:2: ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 )
            // InternalPortugolParser.g:5393:3: rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptDecimalPrecisionAccess().getSecondPrecisionAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__OptDecimalPrecision__Group_2__1__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalPortugolParser.g:5402:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5406:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalPortugolParser.g:5407:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Assignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalPortugolParser.g:5414:1: rule__Assignment__Group__0__Impl : ( ruleOrExpression ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5418:1: ( ( ruleOrExpression ) )
            // InternalPortugolParser.g:5419:1: ( ruleOrExpression )
            {
            // InternalPortugolParser.g:5419:1: ( ruleOrExpression )
            // InternalPortugolParser.g:5420:2: ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOrExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getOrExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalPortugolParser.g:5429:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5433:1: ( rule__Assignment__Group__1__Impl )
            // InternalPortugolParser.g:5434:2: rule__Assignment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalPortugolParser.g:5440:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__Group_1__0 )* ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5444:1: ( ( ( rule__Assignment__Group_1__0 )* ) )
            // InternalPortugolParser.g:5445:1: ( ( rule__Assignment__Group_1__0 )* )
            {
            // InternalPortugolParser.g:5445:1: ( ( rule__Assignment__Group_1__0 )* )
            // InternalPortugolParser.g:5446:2: ( rule__Assignment__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:5447:2: ( rule__Assignment__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==LessThanSignHyphenMinus) ) {
                    int LA45_2 = input.LA(2);

                    if ( (synpred65_InternalPortugolParser()) ) {
                        alt45=1;
                    }


                }


                switch (alt45) {
            	case 1 :
            	    // InternalPortugolParser.g:5447:3: rule__Assignment__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Assignment__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group_1__0"
    // InternalPortugolParser.g:5456:1: rule__Assignment__Group_1__0 : rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 ;
    public final void rule__Assignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5460:1: ( rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 )
            // InternalPortugolParser.g:5461:2: rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Assignment__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Assignment__Group_1__0"


    // $ANTLR start "rule__Assignment__Group_1__0__Impl"
    // InternalPortugolParser.g:5468:1: rule__Assignment__Group_1__0__Impl : ( ( rule__Assignment__Group_1_0__0 ) ) ;
    public final void rule__Assignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5472:1: ( ( ( rule__Assignment__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:5473:1: ( ( rule__Assignment__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:5473:1: ( ( rule__Assignment__Group_1_0__0 ) )
            // InternalPortugolParser.g:5474:2: ( rule__Assignment__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:5475:2: ( rule__Assignment__Group_1_0__0 )
            // InternalPortugolParser.g:5475:3: rule__Assignment__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__Assignment__Group_1__0__Impl"


    // $ANTLR start "rule__Assignment__Group_1__1"
    // InternalPortugolParser.g:5483:1: rule__Assignment__Group_1__1 : rule__Assignment__Group_1__1__Impl ;
    public final void rule__Assignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5487:1: ( rule__Assignment__Group_1__1__Impl )
            // InternalPortugolParser.g:5488:2: rule__Assignment__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Assignment__Group_1__1"


    // $ANTLR start "rule__Assignment__Group_1__1__Impl"
    // InternalPortugolParser.g:5494:1: rule__Assignment__Group_1__1__Impl : ( ( rule__Assignment__RightAssignment_1_1 ) ) ;
    public final void rule__Assignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5498:1: ( ( ( rule__Assignment__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:5499:1: ( ( rule__Assignment__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:5499:1: ( ( rule__Assignment__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:5500:2: ( rule__Assignment__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:5501:2: ( rule__Assignment__RightAssignment_1_1 )
            // InternalPortugolParser.g:5501:3: rule__Assignment__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Assignment__Group_1__1__Impl"


    // $ANTLR start "rule__Assignment__Group_1_0__0"
    // InternalPortugolParser.g:5510:1: rule__Assignment__Group_1_0__0 : rule__Assignment__Group_1_0__0__Impl ;
    public final void rule__Assignment__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5514:1: ( rule__Assignment__Group_1_0__0__Impl )
            // InternalPortugolParser.g:5515:2: rule__Assignment__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Assignment__Group_1_0__0"


    // $ANTLR start "rule__Assignment__Group_1_0__0__Impl"
    // InternalPortugolParser.g:5521:1: rule__Assignment__Group_1_0__0__Impl : ( ( rule__Assignment__Group_1_0_0__0 ) ) ;
    public final void rule__Assignment__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5525:1: ( ( ( rule__Assignment__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:5526:1: ( ( rule__Assignment__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:5526:1: ( ( rule__Assignment__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:5527:2: ( rule__Assignment__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:5528:2: ( rule__Assignment__Group_1_0_0__0 )
            // InternalPortugolParser.g:5528:3: rule__Assignment__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__Assignment__Group_1_0__0__Impl"


    // $ANTLR start "rule__Assignment__Group_1_0_0__0"
    // InternalPortugolParser.g:5537:1: rule__Assignment__Group_1_0_0__0 : rule__Assignment__Group_1_0_0__0__Impl rule__Assignment__Group_1_0_0__1 ;
    public final void rule__Assignment__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5541:1: ( rule__Assignment__Group_1_0_0__0__Impl rule__Assignment__Group_1_0_0__1 )
            // InternalPortugolParser.g:5542:2: rule__Assignment__Group_1_0_0__0__Impl rule__Assignment__Group_1_0_0__1
            {
            pushFollow(FOLLOW_37);
            rule__Assignment__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Assignment__Group_1_0_0__0"


    // $ANTLR start "rule__Assignment__Group_1_0_0__0__Impl"
    // InternalPortugolParser.g:5549:1: rule__Assignment__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Assignment__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5553:1: ( ( () ) )
            // InternalPortugolParser.g:5554:1: ( () )
            {
            // InternalPortugolParser.g:5554:1: ( () )
            // InternalPortugolParser.g:5555:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:5556:2: ()
            // InternalPortugolParser.g:5556:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Assignment__Group_1_0_0__1"
    // InternalPortugolParser.g:5564:1: rule__Assignment__Group_1_0_0__1 : rule__Assignment__Group_1_0_0__1__Impl ;
    public final void rule__Assignment__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5568:1: ( rule__Assignment__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:5569:2: rule__Assignment__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Assignment__Group_1_0_0__1"


    // $ANTLR start "rule__Assignment__Group_1_0_0__1__Impl"
    // InternalPortugolParser.g:5575:1: rule__Assignment__Group_1_0_0__1__Impl : ( ( rule__Assignment__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__Assignment__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5579:1: ( ( ( rule__Assignment__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:5580:1: ( ( rule__Assignment__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:5580:1: ( ( rule__Assignment__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:5581:2: ( rule__Assignment__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:5582:2: ( rule__Assignment__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:5582:3: rule__Assignment__OpAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__OpAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getOpAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__Assignment__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // InternalPortugolParser.g:5591:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5595:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalPortugolParser.g:5596:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // InternalPortugolParser.g:5603:1: rule__OrExpression__Group__0__Impl : ( ruleXorExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5607:1: ( ( ruleXorExpression ) )
            // InternalPortugolParser.g:5608:1: ( ruleXorExpression )
            {
            // InternalPortugolParser.g:5608:1: ( ruleXorExpression )
            // InternalPortugolParser.g:5609:2: ruleXorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // InternalPortugolParser.g:5618:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5622:1: ( rule__OrExpression__Group__1__Impl )
            // InternalPortugolParser.g:5623:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // InternalPortugolParser.g:5629:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5633:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalPortugolParser.g:5634:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalPortugolParser.g:5634:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalPortugolParser.g:5635:2: ( rule__OrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:5636:2: ( rule__OrExpression__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==OU) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalPortugolParser.g:5636:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // InternalPortugolParser.g:5645:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5649:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalPortugolParser.g:5650:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // InternalPortugolParser.g:5657:1: rule__OrExpression__Group_1__0__Impl : ( ( rule__OrExpression__Group_1_0__0 ) ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5661:1: ( ( ( rule__OrExpression__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:5662:1: ( ( rule__OrExpression__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:5662:1: ( ( rule__OrExpression__Group_1_0__0 ) )
            // InternalPortugolParser.g:5663:2: ( rule__OrExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:5664:2: ( rule__OrExpression__Group_1_0__0 )
            // InternalPortugolParser.g:5664:3: rule__OrExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // InternalPortugolParser.g:5672:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5676:1: ( rule__OrExpression__Group_1__1__Impl )
            // InternalPortugolParser.g:5677:2: rule__OrExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // InternalPortugolParser.g:5683:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__RightAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5687:1: ( ( ( rule__OrExpression__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:5688:1: ( ( rule__OrExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:5688:1: ( ( rule__OrExpression__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:5689:2: ( rule__OrExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:5690:2: ( rule__OrExpression__RightAssignment_1_1 )
            // InternalPortugolParser.g:5690:3: rule__OrExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1_0__0"
    // InternalPortugolParser.g:5699:1: rule__OrExpression__Group_1_0__0 : rule__OrExpression__Group_1_0__0__Impl ;
    public final void rule__OrExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5703:1: ( rule__OrExpression__Group_1_0__0__Impl )
            // InternalPortugolParser.g:5704:2: rule__OrExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrExpression__Group_1_0__0"


    // $ANTLR start "rule__OrExpression__Group_1_0__0__Impl"
    // InternalPortugolParser.g:5710:1: rule__OrExpression__Group_1_0__0__Impl : ( ( rule__OrExpression__Group_1_0_0__0 ) ) ;
    public final void rule__OrExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5714:1: ( ( ( rule__OrExpression__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:5715:1: ( ( rule__OrExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:5715:1: ( ( rule__OrExpression__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:5716:2: ( rule__OrExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:5717:2: ( rule__OrExpression__Group_1_0_0__0 )
            // InternalPortugolParser.g:5717:3: rule__OrExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__OrExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1_0_0__0"
    // InternalPortugolParser.g:5726:1: rule__OrExpression__Group_1_0_0__0 : rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1 ;
    public final void rule__OrExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5730:1: ( rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1 )
            // InternalPortugolParser.g:5731:2: rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_39);
            rule__OrExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrExpression__Group_1_0_0__0"


    // $ANTLR start "rule__OrExpression__Group_1_0_0__0__Impl"
    // InternalPortugolParser.g:5738:1: rule__OrExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5742:1: ( ( () ) )
            // InternalPortugolParser.g:5743:1: ( () )
            {
            // InternalPortugolParser.g:5743:1: ( () )
            // InternalPortugolParser.g:5744:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:5745:2: ()
            // InternalPortugolParser.g:5745:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1_0_0__1"
    // InternalPortugolParser.g:5753:1: rule__OrExpression__Group_1_0_0__1 : rule__OrExpression__Group_1_0_0__1__Impl ;
    public final void rule__OrExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5757:1: ( rule__OrExpression__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:5758:2: rule__OrExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrExpression__Group_1_0_0__1"


    // $ANTLR start "rule__OrExpression__Group_1_0_0__1__Impl"
    // InternalPortugolParser.g:5764:1: rule__OrExpression__Group_1_0_0__1__Impl : ( ( rule__OrExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__OrExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5768:1: ( ( ( rule__OrExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:5769:1: ( ( rule__OrExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:5769:1: ( ( rule__OrExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:5770:2: ( rule__OrExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:5771:2: ( rule__OrExpression__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:5771:3: rule__OrExpression__OpAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__OpAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOpAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__OrExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__XorExpression__Group__0"
    // InternalPortugolParser.g:5780:1: rule__XorExpression__Group__0 : rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 ;
    public final void rule__XorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5784:1: ( rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 )
            // InternalPortugolParser.g:5785:2: rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__XorExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XorExpression__Group__0"


    // $ANTLR start "rule__XorExpression__Group__0__Impl"
    // InternalPortugolParser.g:5792:1: rule__XorExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__XorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5796:1: ( ( ruleAndExpression ) )
            // InternalPortugolParser.g:5797:1: ( ruleAndExpression )
            {
            // InternalPortugolParser.g:5797:1: ( ruleAndExpression )
            // InternalPortugolParser.g:5798:2: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__XorExpression__Group__0__Impl"


    // $ANTLR start "rule__XorExpression__Group__1"
    // InternalPortugolParser.g:5807:1: rule__XorExpression__Group__1 : rule__XorExpression__Group__1__Impl ;
    public final void rule__XorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5811:1: ( rule__XorExpression__Group__1__Impl )
            // InternalPortugolParser.g:5812:2: rule__XorExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XorExpression__Group__1"


    // $ANTLR start "rule__XorExpression__Group__1__Impl"
    // InternalPortugolParser.g:5818:1: rule__XorExpression__Group__1__Impl : ( ( rule__XorExpression__Group_1__0 )* ) ;
    public final void rule__XorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5822:1: ( ( ( rule__XorExpression__Group_1__0 )* ) )
            // InternalPortugolParser.g:5823:1: ( ( rule__XorExpression__Group_1__0 )* )
            {
            // InternalPortugolParser.g:5823:1: ( ( rule__XorExpression__Group_1__0 )* )
            // InternalPortugolParser.g:5824:2: ( rule__XorExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:5825:2: ( rule__XorExpression__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==XOU) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalPortugolParser.g:5825:3: rule__XorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__XorExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__XorExpression__Group__1__Impl"


    // $ANTLR start "rule__XorExpression__Group_1__0"
    // InternalPortugolParser.g:5834:1: rule__XorExpression__Group_1__0 : rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 ;
    public final void rule__XorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5838:1: ( rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 )
            // InternalPortugolParser.g:5839:2: rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__XorExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XorExpression__Group_1__0"


    // $ANTLR start "rule__XorExpression__Group_1__0__Impl"
    // InternalPortugolParser.g:5846:1: rule__XorExpression__Group_1__0__Impl : ( ( rule__XorExpression__Group_1_0__0 ) ) ;
    public final void rule__XorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5850:1: ( ( ( rule__XorExpression__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:5851:1: ( ( rule__XorExpression__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:5851:1: ( ( rule__XorExpression__Group_1_0__0 ) )
            // InternalPortugolParser.g:5852:2: ( rule__XorExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:5853:2: ( rule__XorExpression__Group_1_0__0 )
            // InternalPortugolParser.g:5853:3: rule__XorExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__XorExpression__Group_1__0__Impl"


    // $ANTLR start "rule__XorExpression__Group_1__1"
    // InternalPortugolParser.g:5861:1: rule__XorExpression__Group_1__1 : rule__XorExpression__Group_1__1__Impl ;
    public final void rule__XorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5865:1: ( rule__XorExpression__Group_1__1__Impl )
            // InternalPortugolParser.g:5866:2: rule__XorExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XorExpression__Group_1__1"


    // $ANTLR start "rule__XorExpression__Group_1__1__Impl"
    // InternalPortugolParser.g:5872:1: rule__XorExpression__Group_1__1__Impl : ( ( rule__XorExpression__RightAssignment_1_1 ) ) ;
    public final void rule__XorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5876:1: ( ( ( rule__XorExpression__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:5877:1: ( ( rule__XorExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:5877:1: ( ( rule__XorExpression__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:5878:2: ( rule__XorExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:5879:2: ( rule__XorExpression__RightAssignment_1_1 )
            // InternalPortugolParser.g:5879:3: rule__XorExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__XorExpression__Group_1__1__Impl"


    // $ANTLR start "rule__XorExpression__Group_1_0__0"
    // InternalPortugolParser.g:5888:1: rule__XorExpression__Group_1_0__0 : rule__XorExpression__Group_1_0__0__Impl ;
    public final void rule__XorExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5892:1: ( rule__XorExpression__Group_1_0__0__Impl )
            // InternalPortugolParser.g:5893:2: rule__XorExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XorExpression__Group_1_0__0"


    // $ANTLR start "rule__XorExpression__Group_1_0__0__Impl"
    // InternalPortugolParser.g:5899:1: rule__XorExpression__Group_1_0__0__Impl : ( ( rule__XorExpression__Group_1_0_0__0 ) ) ;
    public final void rule__XorExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5903:1: ( ( ( rule__XorExpression__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:5904:1: ( ( rule__XorExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:5904:1: ( ( rule__XorExpression__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:5905:2: ( rule__XorExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:5906:2: ( rule__XorExpression__Group_1_0_0__0 )
            // InternalPortugolParser.g:5906:3: rule__XorExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__XorExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__XorExpression__Group_1_0_0__0"
    // InternalPortugolParser.g:5915:1: rule__XorExpression__Group_1_0_0__0 : rule__XorExpression__Group_1_0_0__0__Impl rule__XorExpression__Group_1_0_0__1 ;
    public final void rule__XorExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5919:1: ( rule__XorExpression__Group_1_0_0__0__Impl rule__XorExpression__Group_1_0_0__1 )
            // InternalPortugolParser.g:5920:2: rule__XorExpression__Group_1_0_0__0__Impl rule__XorExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_41);
            rule__XorExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XorExpression__Group_1_0_0__0"


    // $ANTLR start "rule__XorExpression__Group_1_0_0__0__Impl"
    // InternalPortugolParser.g:5927:1: rule__XorExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__XorExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5931:1: ( ( () ) )
            // InternalPortugolParser.g:5932:1: ( () )
            {
            // InternalPortugolParser.g:5932:1: ( () )
            // InternalPortugolParser.g:5933:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:5934:2: ()
            // InternalPortugolParser.g:5934:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__XorExpression__Group_1_0_0__1"
    // InternalPortugolParser.g:5942:1: rule__XorExpression__Group_1_0_0__1 : rule__XorExpression__Group_1_0_0__1__Impl ;
    public final void rule__XorExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5946:1: ( rule__XorExpression__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:5947:2: rule__XorExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XorExpression__Group_1_0_0__1"


    // $ANTLR start "rule__XorExpression__Group_1_0_0__1__Impl"
    // InternalPortugolParser.g:5953:1: rule__XorExpression__Group_1_0_0__1__Impl : ( ( rule__XorExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__XorExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5957:1: ( ( ( rule__XorExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:5958:1: ( ( rule__XorExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:5958:1: ( ( rule__XorExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:5959:2: ( rule__XorExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:5960:2: ( rule__XorExpression__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:5960:3: rule__XorExpression__OpAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__OpAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getOpAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__XorExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalPortugolParser.g:5969:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5973:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalPortugolParser.g:5974:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // InternalPortugolParser.g:5981:1: rule__AndExpression__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5985:1: ( ( ruleComparison ) )
            // InternalPortugolParser.g:5986:1: ( ruleComparison )
            {
            // InternalPortugolParser.g:5986:1: ( ruleComparison )
            // InternalPortugolParser.g:5987:2: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getComparisonParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getComparisonParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // InternalPortugolParser.g:5996:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6000:1: ( rule__AndExpression__Group__1__Impl )
            // InternalPortugolParser.g:6001:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // InternalPortugolParser.g:6007:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6011:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalPortugolParser.g:6012:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalPortugolParser.g:6012:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalPortugolParser.g:6013:2: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:6014:2: ( rule__AndExpression__Group_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==Ampersand||LA48_0==E) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalPortugolParser.g:6014:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // InternalPortugolParser.g:6023:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6027:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalPortugolParser.g:6028:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // InternalPortugolParser.g:6035:1: rule__AndExpression__Group_1__0__Impl : ( ( rule__AndExpression__Group_1_0__0 ) ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6039:1: ( ( ( rule__AndExpression__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:6040:1: ( ( rule__AndExpression__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:6040:1: ( ( rule__AndExpression__Group_1_0__0 ) )
            // InternalPortugolParser.g:6041:2: ( rule__AndExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:6042:2: ( rule__AndExpression__Group_1_0__0 )
            // InternalPortugolParser.g:6042:3: rule__AndExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // InternalPortugolParser.g:6050:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6054:1: ( rule__AndExpression__Group_1__1__Impl )
            // InternalPortugolParser.g:6055:2: rule__AndExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // InternalPortugolParser.g:6061:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__RightAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6065:1: ( ( ( rule__AndExpression__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:6066:1: ( ( rule__AndExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:6066:1: ( ( rule__AndExpression__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:6067:2: ( rule__AndExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:6068:2: ( rule__AndExpression__RightAssignment_1_1 )
            // InternalPortugolParser.g:6068:3: rule__AndExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1_0__0"
    // InternalPortugolParser.g:6077:1: rule__AndExpression__Group_1_0__0 : rule__AndExpression__Group_1_0__0__Impl ;
    public final void rule__AndExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6081:1: ( rule__AndExpression__Group_1_0__0__Impl )
            // InternalPortugolParser.g:6082:2: rule__AndExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AndExpression__Group_1_0__0"


    // $ANTLR start "rule__AndExpression__Group_1_0__0__Impl"
    // InternalPortugolParser.g:6088:1: rule__AndExpression__Group_1_0__0__Impl : ( ( rule__AndExpression__Group_1_0_0__0 ) ) ;
    public final void rule__AndExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6092:1: ( ( ( rule__AndExpression__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:6093:1: ( ( rule__AndExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:6093:1: ( ( rule__AndExpression__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:6094:2: ( rule__AndExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:6095:2: ( rule__AndExpression__Group_1_0_0__0 )
            // InternalPortugolParser.g:6095:3: rule__AndExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1_0_0__0"
    // InternalPortugolParser.g:6104:1: rule__AndExpression__Group_1_0_0__0 : rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1 ;
    public final void rule__AndExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6108:1: ( rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1 )
            // InternalPortugolParser.g:6109:2: rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_43);
            rule__AndExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AndExpression__Group_1_0_0__0"


    // $ANTLR start "rule__AndExpression__Group_1_0_0__0__Impl"
    // InternalPortugolParser.g:6116:1: rule__AndExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6120:1: ( ( () ) )
            // InternalPortugolParser.g:6121:1: ( () )
            {
            // InternalPortugolParser.g:6121:1: ( () )
            // InternalPortugolParser.g:6122:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:6123:2: ()
            // InternalPortugolParser.g:6123:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1_0_0__1"
    // InternalPortugolParser.g:6131:1: rule__AndExpression__Group_1_0_0__1 : rule__AndExpression__Group_1_0_0__1__Impl ;
    public final void rule__AndExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6135:1: ( rule__AndExpression__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:6136:2: rule__AndExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AndExpression__Group_1_0_0__1"


    // $ANTLR start "rule__AndExpression__Group_1_0_0__1__Impl"
    // InternalPortugolParser.g:6142:1: rule__AndExpression__Group_1_0_0__1__Impl : ( ( rule__AndExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__AndExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6146:1: ( ( ( rule__AndExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:6147:1: ( ( rule__AndExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:6147:1: ( ( rule__AndExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:6148:2: ( rule__AndExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:6149:2: ( rule__AndExpression__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:6149:3: rule__AndExpression__OpAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__OpAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOpAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalPortugolParser.g:6158:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6162:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalPortugolParser.g:6163:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__Comparison__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalPortugolParser.g:6170:1: rule__Comparison__Group__0__Impl : ( ruleEquExpression ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6174:1: ( ( ruleEquExpression ) )
            // InternalPortugolParser.g:6175:1: ( ruleEquExpression )
            {
            // InternalPortugolParser.g:6175:1: ( ruleEquExpression )
            // InternalPortugolParser.g:6176:2: ruleEquExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getEquExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEquExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getEquExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalPortugolParser.g:6185:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6189:1: ( rule__Comparison__Group__1__Impl )
            // InternalPortugolParser.g:6190:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalPortugolParser.g:6196:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6200:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalPortugolParser.g:6201:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalPortugolParser.g:6201:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalPortugolParser.g:6202:2: ( rule__Comparison__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:6203:2: ( rule__Comparison__Group_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==LessThanSignGreaterThanSign||LA49_0==EqualsSign) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalPortugolParser.g:6203:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // InternalPortugolParser.g:6212:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6216:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalPortugolParser.g:6217:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // InternalPortugolParser.g:6224:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Group_1_0__0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6228:1: ( ( ( rule__Comparison__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:6229:1: ( ( rule__Comparison__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:6229:1: ( ( rule__Comparison__Group_1_0__0 ) )
            // InternalPortugolParser.g:6230:2: ( rule__Comparison__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:6231:2: ( rule__Comparison__Group_1_0__0 )
            // InternalPortugolParser.g:6231:3: rule__Comparison__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // InternalPortugolParser.g:6239:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6243:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalPortugolParser.g:6244:2: rule__Comparison__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // InternalPortugolParser.g:6250:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6254:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:6255:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:6255:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:6256:2: ( rule__Comparison__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:6257:2: ( rule__Comparison__RightAssignment_1_1 )
            // InternalPortugolParser.g:6257:3: rule__Comparison__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0__0"
    // InternalPortugolParser.g:6266:1: rule__Comparison__Group_1_0__0 : rule__Comparison__Group_1_0__0__Impl ;
    public final void rule__Comparison__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6270:1: ( rule__Comparison__Group_1_0__0__Impl )
            // InternalPortugolParser.g:6271:2: rule__Comparison__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Comparison__Group_1_0__0"


    // $ANTLR start "rule__Comparison__Group_1_0__0__Impl"
    // InternalPortugolParser.g:6277:1: rule__Comparison__Group_1_0__0__Impl : ( ( rule__Comparison__Group_1_0_0__0 ) ) ;
    public final void rule__Comparison__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6281:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:6282:1: ( ( rule__Comparison__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:6282:1: ( ( rule__Comparison__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:6283:2: ( rule__Comparison__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:6284:2: ( rule__Comparison__Group_1_0_0__0 )
            // InternalPortugolParser.g:6284:3: rule__Comparison__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__Comparison__Group_1_0__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_0__0"
    // InternalPortugolParser.g:6293:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6297:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalPortugolParser.g:6298:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
            {
            pushFollow(FOLLOW_45);
            rule__Comparison__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Comparison__Group_1_0_0__0"


    // $ANTLR start "rule__Comparison__Group_1_0_0__0__Impl"
    // InternalPortugolParser.g:6305:1: rule__Comparison__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6309:1: ( ( () ) )
            // InternalPortugolParser.g:6310:1: ( () )
            {
            // InternalPortugolParser.g:6310:1: ( () )
            // InternalPortugolParser.g:6311:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:6312:2: ()
            // InternalPortugolParser.g:6312:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_0__1"
    // InternalPortugolParser.g:6320:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6324:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:6325:2: rule__Comparison__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Comparison__Group_1_0_0__1"


    // $ANTLR start "rule__Comparison__Group_1_0_0__1__Impl"
    // InternalPortugolParser.g:6331:1: rule__Comparison__Group_1_0_0__1__Impl : ( ( rule__Comparison__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6335:1: ( ( ( rule__Comparison__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:6336:1: ( ( rule__Comparison__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:6336:1: ( ( rule__Comparison__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:6337:2: ( rule__Comparison__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:6338:2: ( rule__Comparison__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:6338:3: rule__Comparison__OpAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getOpAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__Comparison__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__EquExpression__Group__0"
    // InternalPortugolParser.g:6347:1: rule__EquExpression__Group__0 : rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1 ;
    public final void rule__EquExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6351:1: ( rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1 )
            // InternalPortugolParser.g:6352:2: rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__EquExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EquExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EquExpression__Group__0"


    // $ANTLR start "rule__EquExpression__Group__0__Impl"
    // InternalPortugolParser.g:6359:1: rule__EquExpression__Group__0__Impl : ( ruleAddExpression ) ;
    public final void rule__EquExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6363:1: ( ( ruleAddExpression ) )
            // InternalPortugolParser.g:6364:1: ( ruleAddExpression )
            {
            // InternalPortugolParser.g:6364:1: ( ruleAddExpression )
            // InternalPortugolParser.g:6365:2: ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getAddExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAddExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquExpressionAccess().getAddExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__EquExpression__Group__0__Impl"


    // $ANTLR start "rule__EquExpression__Group__1"
    // InternalPortugolParser.g:6374:1: rule__EquExpression__Group__1 : rule__EquExpression__Group__1__Impl ;
    public final void rule__EquExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6378:1: ( rule__EquExpression__Group__1__Impl )
            // InternalPortugolParser.g:6379:2: rule__EquExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EquExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EquExpression__Group__1"


    // $ANTLR start "rule__EquExpression__Group__1__Impl"
    // InternalPortugolParser.g:6385:1: rule__EquExpression__Group__1__Impl : ( ( rule__EquExpression__Group_1__0 )* ) ;
    public final void rule__EquExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6389:1: ( ( ( rule__EquExpression__Group_1__0 )* ) )
            // InternalPortugolParser.g:6390:1: ( ( rule__EquExpression__Group_1__0 )* )
            {
            // InternalPortugolParser.g:6390:1: ( ( rule__EquExpression__Group_1__0 )* )
            // InternalPortugolParser.g:6391:2: ( rule__EquExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:6392:2: ( rule__EquExpression__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==LessThanSignEqualsSign||LA50_0==GreaterThanSignEqualsSign||LA50_0==LessThanSign||LA50_0==GreaterThanSign) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalPortugolParser.g:6392:3: rule__EquExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__EquExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__EquExpression__Group__1__Impl"


    // $ANTLR start "rule__EquExpression__Group_1__0"
    // InternalPortugolParser.g:6401:1: rule__EquExpression__Group_1__0 : rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1 ;
    public final void rule__EquExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6405:1: ( rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1 )
            // InternalPortugolParser.g:6406:2: rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__EquExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EquExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EquExpression__Group_1__0"


    // $ANTLR start "rule__EquExpression__Group_1__0__Impl"
    // InternalPortugolParser.g:6413:1: rule__EquExpression__Group_1__0__Impl : ( ( rule__EquExpression__Group_1_0__0 ) ) ;
    public final void rule__EquExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6417:1: ( ( ( rule__EquExpression__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:6418:1: ( ( rule__EquExpression__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:6418:1: ( ( rule__EquExpression__Group_1_0__0 ) )
            // InternalPortugolParser.g:6419:2: ( rule__EquExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:6420:2: ( rule__EquExpression__Group_1_0__0 )
            // InternalPortugolParser.g:6420:3: rule__EquExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__EquExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquExpressionAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__EquExpression__Group_1__0__Impl"


    // $ANTLR start "rule__EquExpression__Group_1__1"
    // InternalPortugolParser.g:6428:1: rule__EquExpression__Group_1__1 : rule__EquExpression__Group_1__1__Impl ;
    public final void rule__EquExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6432:1: ( rule__EquExpression__Group_1__1__Impl )
            // InternalPortugolParser.g:6433:2: rule__EquExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EquExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EquExpression__Group_1__1"


    // $ANTLR start "rule__EquExpression__Group_1__1__Impl"
    // InternalPortugolParser.g:6439:1: rule__EquExpression__Group_1__1__Impl : ( ( rule__EquExpression__RightAssignment_1_1 ) ) ;
    public final void rule__EquExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6443:1: ( ( ( rule__EquExpression__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:6444:1: ( ( rule__EquExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:6444:1: ( ( rule__EquExpression__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:6445:2: ( rule__EquExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:6446:2: ( rule__EquExpression__RightAssignment_1_1 )
            // InternalPortugolParser.g:6446:3: rule__EquExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EquExpression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquExpressionAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__EquExpression__Group_1__1__Impl"


    // $ANTLR start "rule__EquExpression__Group_1_0__0"
    // InternalPortugolParser.g:6455:1: rule__EquExpression__Group_1_0__0 : rule__EquExpression__Group_1_0__0__Impl ;
    public final void rule__EquExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6459:1: ( rule__EquExpression__Group_1_0__0__Impl )
            // InternalPortugolParser.g:6460:2: rule__EquExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EquExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EquExpression__Group_1_0__0"


    // $ANTLR start "rule__EquExpression__Group_1_0__0__Impl"
    // InternalPortugolParser.g:6466:1: rule__EquExpression__Group_1_0__0__Impl : ( ( rule__EquExpression__Group_1_0_0__0 ) ) ;
    public final void rule__EquExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6470:1: ( ( ( rule__EquExpression__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:6471:1: ( ( rule__EquExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:6471:1: ( ( rule__EquExpression__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:6472:2: ( rule__EquExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:6473:2: ( rule__EquExpression__Group_1_0_0__0 )
            // InternalPortugolParser.g:6473:3: rule__EquExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__EquExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquExpressionAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__EquExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__EquExpression__Group_1_0_0__0"
    // InternalPortugolParser.g:6482:1: rule__EquExpression__Group_1_0_0__0 : rule__EquExpression__Group_1_0_0__0__Impl rule__EquExpression__Group_1_0_0__1 ;
    public final void rule__EquExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6486:1: ( rule__EquExpression__Group_1_0_0__0__Impl rule__EquExpression__Group_1_0_0__1 )
            // InternalPortugolParser.g:6487:2: rule__EquExpression__Group_1_0_0__0__Impl rule__EquExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_47);
            rule__EquExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EquExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EquExpression__Group_1_0_0__0"


    // $ANTLR start "rule__EquExpression__Group_1_0_0__0__Impl"
    // InternalPortugolParser.g:6494:1: rule__EquExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__EquExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6498:1: ( ( () ) )
            // InternalPortugolParser.g:6499:1: ( () )
            {
            // InternalPortugolParser.g:6499:1: ( () )
            // InternalPortugolParser.g:6500:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:6501:2: ()
            // InternalPortugolParser.g:6501:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EquExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__EquExpression__Group_1_0_0__1"
    // InternalPortugolParser.g:6509:1: rule__EquExpression__Group_1_0_0__1 : rule__EquExpression__Group_1_0_0__1__Impl ;
    public final void rule__EquExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6513:1: ( rule__EquExpression__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:6514:2: rule__EquExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EquExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EquExpression__Group_1_0_0__1"


    // $ANTLR start "rule__EquExpression__Group_1_0_0__1__Impl"
    // InternalPortugolParser.g:6520:1: rule__EquExpression__Group_1_0_0__1__Impl : ( ( rule__EquExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__EquExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6524:1: ( ( ( rule__EquExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:6525:1: ( ( rule__EquExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:6525:1: ( ( rule__EquExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:6526:2: ( rule__EquExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:6527:2: ( rule__EquExpression__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:6527:3: rule__EquExpression__OpAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__EquExpression__OpAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquExpressionAccess().getOpAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__EquExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__AddExpression__Group__0"
    // InternalPortugolParser.g:6536:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6540:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // InternalPortugolParser.g:6541:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__AddExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AddExpression__Group__0"


    // $ANTLR start "rule__AddExpression__Group__0__Impl"
    // InternalPortugolParser.g:6548:1: rule__AddExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6552:1: ( ( ruleMultiplicativeExpression ) )
            // InternalPortugolParser.g:6553:1: ( ruleMultiplicativeExpression )
            {
            // InternalPortugolParser.g:6553:1: ( ruleMultiplicativeExpression )
            // InternalPortugolParser.g:6554:2: ruleMultiplicativeExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__AddExpression__Group__0__Impl"


    // $ANTLR start "rule__AddExpression__Group__1"
    // InternalPortugolParser.g:6563:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6567:1: ( rule__AddExpression__Group__1__Impl )
            // InternalPortugolParser.g:6568:2: rule__AddExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AddExpression__Group__1"


    // $ANTLR start "rule__AddExpression__Group__1__Impl"
    // InternalPortugolParser.g:6574:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6578:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // InternalPortugolParser.g:6579:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // InternalPortugolParser.g:6579:1: ( ( rule__AddExpression__Group_1__0 )* )
            // InternalPortugolParser.g:6580:2: ( rule__AddExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:6581:2: ( rule__AddExpression__Group_1__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==PlusSign||LA51_0==HyphenMinus) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalPortugolParser.g:6581:3: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_50);
            	    rule__AddExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__AddExpression__Group__1__Impl"


    // $ANTLR start "rule__AddExpression__Group_1__0"
    // InternalPortugolParser.g:6590:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6594:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // InternalPortugolParser.g:6595:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__AddExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AddExpression__Group_1__0"


    // $ANTLR start "rule__AddExpression__Group_1__0__Impl"
    // InternalPortugolParser.g:6602:1: rule__AddExpression__Group_1__0__Impl : ( ( rule__AddExpression__Group_1_0__0 ) ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6606:1: ( ( ( rule__AddExpression__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:6607:1: ( ( rule__AddExpression__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:6607:1: ( ( rule__AddExpression__Group_1_0__0 ) )
            // InternalPortugolParser.g:6608:2: ( rule__AddExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:6609:2: ( rule__AddExpression__Group_1_0__0 )
            // InternalPortugolParser.g:6609:3: rule__AddExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__AddExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__AddExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AddExpression__Group_1__1"
    // InternalPortugolParser.g:6617:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6621:1: ( rule__AddExpression__Group_1__1__Impl )
            // InternalPortugolParser.g:6622:2: rule__AddExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AddExpression__Group_1__1"


    // $ANTLR start "rule__AddExpression__Group_1__1__Impl"
    // InternalPortugolParser.g:6628:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__RightAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6632:1: ( ( ( rule__AddExpression__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:6633:1: ( ( rule__AddExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:6633:1: ( ( rule__AddExpression__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:6634:2: ( rule__AddExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:6635:2: ( rule__AddExpression__RightAssignment_1_1 )
            // InternalPortugolParser.g:6635:3: rule__AddExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AddExpression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__AddExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AddExpression__Group_1_0__0"
    // InternalPortugolParser.g:6644:1: rule__AddExpression__Group_1_0__0 : rule__AddExpression__Group_1_0__0__Impl ;
    public final void rule__AddExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6648:1: ( rule__AddExpression__Group_1_0__0__Impl )
            // InternalPortugolParser.g:6649:2: rule__AddExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AddExpression__Group_1_0__0"


    // $ANTLR start "rule__AddExpression__Group_1_0__0__Impl"
    // InternalPortugolParser.g:6655:1: rule__AddExpression__Group_1_0__0__Impl : ( ( rule__AddExpression__Group_1_0_0__0 ) ) ;
    public final void rule__AddExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6659:1: ( ( ( rule__AddExpression__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:6660:1: ( ( rule__AddExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:6660:1: ( ( rule__AddExpression__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:6661:2: ( rule__AddExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:6662:2: ( rule__AddExpression__Group_1_0_0__0 )
            // InternalPortugolParser.g:6662:3: rule__AddExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__AddExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__AddExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__AddExpression__Group_1_0_0__0"
    // InternalPortugolParser.g:6671:1: rule__AddExpression__Group_1_0_0__0 : rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1 ;
    public final void rule__AddExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6675:1: ( rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1 )
            // InternalPortugolParser.g:6676:2: rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_49);
            rule__AddExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AddExpression__Group_1_0_0__0"


    // $ANTLR start "rule__AddExpression__Group_1_0_0__0__Impl"
    // InternalPortugolParser.g:6683:1: rule__AddExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6687:1: ( ( () ) )
            // InternalPortugolParser.g:6688:1: ( () )
            {
            // InternalPortugolParser.g:6688:1: ( () )
            // InternalPortugolParser.g:6689:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:6690:2: ()
            // InternalPortugolParser.g:6690:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__AddExpression__Group_1_0_0__1"
    // InternalPortugolParser.g:6698:1: rule__AddExpression__Group_1_0_0__1 : rule__AddExpression__Group_1_0_0__1__Impl ;
    public final void rule__AddExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6702:1: ( rule__AddExpression__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:6703:2: rule__AddExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AddExpression__Group_1_0_0__1"


    // $ANTLR start "rule__AddExpression__Group_1_0_0__1__Impl"
    // InternalPortugolParser.g:6709:1: rule__AddExpression__Group_1_0_0__1__Impl : ( ( rule__AddExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__AddExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6713:1: ( ( ( rule__AddExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:6714:1: ( ( rule__AddExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:6714:1: ( ( rule__AddExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:6715:2: ( rule__AddExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:6716:2: ( rule__AddExpression__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:6716:3: rule__AddExpression__OpAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__AddExpression__OpAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getOpAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__AddExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0"
    // InternalPortugolParser.g:6725:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6729:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalPortugolParser.g:6730:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__MultiplicativeExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultiplicativeExpression__Group__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0__Impl"
    // InternalPortugolParser.g:6737:1: rule__MultiplicativeExpression__Group__0__Impl : ( rulePowerExpression ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6741:1: ( ( rulePowerExpression ) )
            // InternalPortugolParser.g:6742:1: ( rulePowerExpression )
            {
            // InternalPortugolParser.g:6742:1: ( rulePowerExpression )
            // InternalPortugolParser.g:6743:2: rulePowerExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getPowerExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePowerExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getPowerExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1"
    // InternalPortugolParser.g:6752:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6756:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalPortugolParser.g:6757:2: rule__MultiplicativeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultiplicativeExpression__Group__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1__Impl"
    // InternalPortugolParser.g:6763:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6767:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalPortugolParser.g:6768:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalPortugolParser.g:6768:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalPortugolParser.g:6769:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:6770:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==MOD||LA52_0==PercentSign||LA52_0==Asterisk||LA52_0==Solidus) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalPortugolParser.g:6770:3: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__0"
    // InternalPortugolParser.g:6779:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6783:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalPortugolParser.g:6784:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__MultiplicativeExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__0__Impl"
    // InternalPortugolParser.g:6791:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( ( rule__MultiplicativeExpression__Group_1_0__0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6795:1: ( ( ( rule__MultiplicativeExpression__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:6796:1: ( ( rule__MultiplicativeExpression__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:6796:1: ( ( rule__MultiplicativeExpression__Group_1_0__0 ) )
            // InternalPortugolParser.g:6797:2: ( rule__MultiplicativeExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:6798:2: ( rule__MultiplicativeExpression__Group_1_0__0 )
            // InternalPortugolParser.g:6798:3: rule__MultiplicativeExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__1"
    // InternalPortugolParser.g:6806:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6810:1: ( rule__MultiplicativeExpression__Group_1__1__Impl )
            // InternalPortugolParser.g:6811:2: rule__MultiplicativeExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__1__Impl"
    // InternalPortugolParser.g:6817:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6821:1: ( ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:6822:1: ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:6822:1: ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:6823:2: ( rule__MultiplicativeExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:6824:2: ( rule__MultiplicativeExpression__RightAssignment_1_1 )
            // InternalPortugolParser.g:6824:3: rule__MultiplicativeExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_0__0"
    // InternalPortugolParser.g:6833:1: rule__MultiplicativeExpression__Group_1_0__0 : rule__MultiplicativeExpression__Group_1_0__0__Impl ;
    public final void rule__MultiplicativeExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6837:1: ( rule__MultiplicativeExpression__Group_1_0__0__Impl )
            // InternalPortugolParser.g:6838:2: rule__MultiplicativeExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_0__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_0__0__Impl"
    // InternalPortugolParser.g:6844:1: rule__MultiplicativeExpression__Group_1_0__0__Impl : ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6848:1: ( ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:6849:1: ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:6849:1: ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:6850:2: ( rule__MultiplicativeExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:6851:2: ( rule__MultiplicativeExpression__Group_1_0_0__0 )
            // InternalPortugolParser.g:6851:3: rule__MultiplicativeExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_0_0__0"
    // InternalPortugolParser.g:6860:1: rule__MultiplicativeExpression__Group_1_0_0__0 : rule__MultiplicativeExpression__Group_1_0_0__0__Impl rule__MultiplicativeExpression__Group_1_0_0__1 ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6864:1: ( rule__MultiplicativeExpression__Group_1_0_0__0__Impl rule__MultiplicativeExpression__Group_1_0_0__1 )
            // InternalPortugolParser.g:6865:2: rule__MultiplicativeExpression__Group_1_0_0__0__Impl rule__MultiplicativeExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_51);
            rule__MultiplicativeExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_0_0__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_0_0__0__Impl"
    // InternalPortugolParser.g:6872:1: rule__MultiplicativeExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6876:1: ( ( () ) )
            // InternalPortugolParser.g:6877:1: ( () )
            {
            // InternalPortugolParser.g:6877:1: ( () )
            // InternalPortugolParser.g:6878:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:6879:2: ()
            // InternalPortugolParser.g:6879:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_0_0__1"
    // InternalPortugolParser.g:6887:1: rule__MultiplicativeExpression__Group_1_0_0__1 : rule__MultiplicativeExpression__Group_1_0_0__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6891:1: ( rule__MultiplicativeExpression__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:6892:2: rule__MultiplicativeExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_0_0__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_0_0__1__Impl"
    // InternalPortugolParser.g:6898:1: rule__MultiplicativeExpression__Group_1_0_0__1__Impl : ( ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6902:1: ( ( ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:6903:1: ( ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:6903:1: ( ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:6904:2: ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:6905:2: ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:6905:3: rule__MultiplicativeExpression__OpAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__OpAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getOpAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__PowerExpression__Group__0"
    // InternalPortugolParser.g:6914:1: rule__PowerExpression__Group__0 : rule__PowerExpression__Group__0__Impl rule__PowerExpression__Group__1 ;
    public final void rule__PowerExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6918:1: ( rule__PowerExpression__Group__0__Impl rule__PowerExpression__Group__1 )
            // InternalPortugolParser.g:6919:2: rule__PowerExpression__Group__0__Impl rule__PowerExpression__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__PowerExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PowerExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PowerExpression__Group__0"


    // $ANTLR start "rule__PowerExpression__Group__0__Impl"
    // InternalPortugolParser.g:6926:1: rule__PowerExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__PowerExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6930:1: ( ( ruleUnaryExpression ) )
            // InternalPortugolParser.g:6931:1: ( ruleUnaryExpression )
            {
            // InternalPortugolParser.g:6931:1: ( ruleUnaryExpression )
            // InternalPortugolParser.g:6932:2: ruleUnaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__PowerExpression__Group__0__Impl"


    // $ANTLR start "rule__PowerExpression__Group__1"
    // InternalPortugolParser.g:6941:1: rule__PowerExpression__Group__1 : rule__PowerExpression__Group__1__Impl ;
    public final void rule__PowerExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6945:1: ( rule__PowerExpression__Group__1__Impl )
            // InternalPortugolParser.g:6946:2: rule__PowerExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PowerExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PowerExpression__Group__1"


    // $ANTLR start "rule__PowerExpression__Group__1__Impl"
    // InternalPortugolParser.g:6952:1: rule__PowerExpression__Group__1__Impl : ( ( rule__PowerExpression__Group_1__0 )* ) ;
    public final void rule__PowerExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6956:1: ( ( ( rule__PowerExpression__Group_1__0 )* ) )
            // InternalPortugolParser.g:6957:1: ( ( rule__PowerExpression__Group_1__0 )* )
            {
            // InternalPortugolParser.g:6957:1: ( ( rule__PowerExpression__Group_1__0 )* )
            // InternalPortugolParser.g:6958:2: ( rule__PowerExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:6959:2: ( rule__PowerExpression__Group_1__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==CircumflexAccent) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalPortugolParser.g:6959:3: rule__PowerExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_54);
            	    rule__PowerExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__PowerExpression__Group__1__Impl"


    // $ANTLR start "rule__PowerExpression__Group_1__0"
    // InternalPortugolParser.g:6968:1: rule__PowerExpression__Group_1__0 : rule__PowerExpression__Group_1__0__Impl rule__PowerExpression__Group_1__1 ;
    public final void rule__PowerExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6972:1: ( rule__PowerExpression__Group_1__0__Impl rule__PowerExpression__Group_1__1 )
            // InternalPortugolParser.g:6973:2: rule__PowerExpression__Group_1__0__Impl rule__PowerExpression__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__PowerExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PowerExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PowerExpression__Group_1__0"


    // $ANTLR start "rule__PowerExpression__Group_1__0__Impl"
    // InternalPortugolParser.g:6980:1: rule__PowerExpression__Group_1__0__Impl : ( ( rule__PowerExpression__Group_1_0__0 ) ) ;
    public final void rule__PowerExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6984:1: ( ( ( rule__PowerExpression__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:6985:1: ( ( rule__PowerExpression__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:6985:1: ( ( rule__PowerExpression__Group_1_0__0 ) )
            // InternalPortugolParser.g:6986:2: ( rule__PowerExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:6987:2: ( rule__PowerExpression__Group_1_0__0 )
            // InternalPortugolParser.g:6987:3: rule__PowerExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__PowerExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerExpressionAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__PowerExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PowerExpression__Group_1__1"
    // InternalPortugolParser.g:6995:1: rule__PowerExpression__Group_1__1 : rule__PowerExpression__Group_1__1__Impl ;
    public final void rule__PowerExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6999:1: ( rule__PowerExpression__Group_1__1__Impl )
            // InternalPortugolParser.g:7000:2: rule__PowerExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PowerExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PowerExpression__Group_1__1"


    // $ANTLR start "rule__PowerExpression__Group_1__1__Impl"
    // InternalPortugolParser.g:7006:1: rule__PowerExpression__Group_1__1__Impl : ( ( rule__PowerExpression__RightAssignment_1_1 ) ) ;
    public final void rule__PowerExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7010:1: ( ( ( rule__PowerExpression__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:7011:1: ( ( rule__PowerExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:7011:1: ( ( rule__PowerExpression__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:7012:2: ( rule__PowerExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:7013:2: ( rule__PowerExpression__RightAssignment_1_1 )
            // InternalPortugolParser.g:7013:3: rule__PowerExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PowerExpression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerExpressionAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__PowerExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PowerExpression__Group_1_0__0"
    // InternalPortugolParser.g:7022:1: rule__PowerExpression__Group_1_0__0 : rule__PowerExpression__Group_1_0__0__Impl ;
    public final void rule__PowerExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7026:1: ( rule__PowerExpression__Group_1_0__0__Impl )
            // InternalPortugolParser.g:7027:2: rule__PowerExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PowerExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PowerExpression__Group_1_0__0"


    // $ANTLR start "rule__PowerExpression__Group_1_0__0__Impl"
    // InternalPortugolParser.g:7033:1: rule__PowerExpression__Group_1_0__0__Impl : ( ( rule__PowerExpression__Group_1_0_0__0 ) ) ;
    public final void rule__PowerExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7037:1: ( ( ( rule__PowerExpression__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:7038:1: ( ( rule__PowerExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:7038:1: ( ( rule__PowerExpression__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:7039:2: ( rule__PowerExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:7040:2: ( rule__PowerExpression__Group_1_0_0__0 )
            // InternalPortugolParser.g:7040:3: rule__PowerExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__PowerExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerExpressionAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__PowerExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__PowerExpression__Group_1_0_0__0"
    // InternalPortugolParser.g:7049:1: rule__PowerExpression__Group_1_0_0__0 : rule__PowerExpression__Group_1_0_0__0__Impl rule__PowerExpression__Group_1_0_0__1 ;
    public final void rule__PowerExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7053:1: ( rule__PowerExpression__Group_1_0_0__0__Impl rule__PowerExpression__Group_1_0_0__1 )
            // InternalPortugolParser.g:7054:2: rule__PowerExpression__Group_1_0_0__0__Impl rule__PowerExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_53);
            rule__PowerExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PowerExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PowerExpression__Group_1_0_0__0"


    // $ANTLR start "rule__PowerExpression__Group_1_0_0__0__Impl"
    // InternalPortugolParser.g:7061:1: rule__PowerExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PowerExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7065:1: ( ( () ) )
            // InternalPortugolParser.g:7066:1: ( () )
            {
            // InternalPortugolParser.g:7066:1: ( () )
            // InternalPortugolParser.g:7067:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:7068:2: ()
            // InternalPortugolParser.g:7068:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__PowerExpression__Group_1_0_0__1"
    // InternalPortugolParser.g:7076:1: rule__PowerExpression__Group_1_0_0__1 : rule__PowerExpression__Group_1_0_0__1__Impl ;
    public final void rule__PowerExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7080:1: ( rule__PowerExpression__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:7081:2: rule__PowerExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PowerExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PowerExpression__Group_1_0_0__1"


    // $ANTLR start "rule__PowerExpression__Group_1_0_0__1__Impl"
    // InternalPortugolParser.g:7087:1: rule__PowerExpression__Group_1_0_0__1__Impl : ( ( rule__PowerExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__PowerExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7091:1: ( ( ( rule__PowerExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:7092:1: ( ( rule__PowerExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:7092:1: ( ( rule__PowerExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:7093:2: ( rule__PowerExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:7094:2: ( rule__PowerExpression__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:7094:3: rule__PowerExpression__OpAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PowerExpression__OpAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerExpressionAccess().getOpAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__PowerExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0__0"
    // InternalPortugolParser.g:7103:1: rule__UnaryExpression__Group_0__0 : rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 ;
    public final void rule__UnaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7107:1: ( rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 )
            // InternalPortugolParser.g:7108:2: rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_55);
            rule__UnaryExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__UnaryExpression__Group_0__0"


    // $ANTLR start "rule__UnaryExpression__Group_0__0__Impl"
    // InternalPortugolParser.g:7115:1: rule__UnaryExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7119:1: ( ( () ) )
            // InternalPortugolParser.g:7120:1: ( () )
            {
            // InternalPortugolParser.g:7120:1: ( () )
            // InternalPortugolParser.g:7121:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_0_0()); 
            }
            // InternalPortugolParser.g:7122:2: ()
            // InternalPortugolParser.g:7122:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0__1"
    // InternalPortugolParser.g:7130:1: rule__UnaryExpression__Group_0__1 : rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 ;
    public final void rule__UnaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7134:1: ( rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 )
            // InternalPortugolParser.g:7135:2: rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_23);
            rule__UnaryExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__UnaryExpression__Group_0__1"


    // $ANTLR start "rule__UnaryExpression__Group_0__1__Impl"
    // InternalPortugolParser.g:7142:1: rule__UnaryExpression__Group_0__1__Impl : ( ( rule__UnaryExpression__OpAssignment_0_1 ) ) ;
    public final void rule__UnaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7146:1: ( ( ( rule__UnaryExpression__OpAssignment_0_1 ) ) )
            // InternalPortugolParser.g:7147:1: ( ( rule__UnaryExpression__OpAssignment_0_1 ) )
            {
            // InternalPortugolParser.g:7147:1: ( ( rule__UnaryExpression__OpAssignment_0_1 ) )
            // InternalPortugolParser.g:7148:2: ( rule__UnaryExpression__OpAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOpAssignment_0_1()); 
            }
            // InternalPortugolParser.g:7149:2: ( rule__UnaryExpression__OpAssignment_0_1 )
            // InternalPortugolParser.g:7149:3: rule__UnaryExpression__OpAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__OpAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOpAssignment_0_1()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0__2"
    // InternalPortugolParser.g:7157:1: rule__UnaryExpression__Group_0__2 : rule__UnaryExpression__Group_0__2__Impl ;
    public final void rule__UnaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7161:1: ( rule__UnaryExpression__Group_0__2__Impl )
            // InternalPortugolParser.g:7162:2: rule__UnaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__UnaryExpression__Group_0__2"


    // $ANTLR start "rule__UnaryExpression__Group_0__2__Impl"
    // InternalPortugolParser.g:7168:1: rule__UnaryExpression__Group_0__2__Impl : ( ( rule__UnaryExpression__OperandAssignment_0_2 ) ) ;
    public final void rule__UnaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7172:1: ( ( ( rule__UnaryExpression__OperandAssignment_0_2 ) ) )
            // InternalPortugolParser.g:7173:1: ( ( rule__UnaryExpression__OperandAssignment_0_2 ) )
            {
            // InternalPortugolParser.g:7173:1: ( ( rule__UnaryExpression__OperandAssignment_0_2 ) )
            // InternalPortugolParser.g:7174:2: ( rule__UnaryExpression__OperandAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_0_2()); 
            }
            // InternalPortugolParser.g:7175:2: ( rule__UnaryExpression__OperandAssignment_0_2 )
            // InternalPortugolParser.g:7175:3: rule__UnaryExpression__OperandAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__OperandAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_0_2()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_4__0"
    // InternalPortugolParser.g:7184:1: rule__PrimaryExpression__Group_4__0 : rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 ;
    public final void rule__PrimaryExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7188:1: ( rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 )
            // InternalPortugolParser.g:7189:2: rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1
            {
            pushFollow(FOLLOW_23);
            rule__PrimaryExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimaryExpression__Group_4__0"


    // $ANTLR start "rule__PrimaryExpression__Group_4__0__Impl"
    // InternalPortugolParser.g:7196:1: rule__PrimaryExpression__Group_4__0__Impl : ( LeftParenthesis ) ;
    public final void rule__PrimaryExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7200:1: ( ( LeftParenthesis ) )
            // InternalPortugolParser.g:7201:1: ( LeftParenthesis )
            {
            // InternalPortugolParser.g:7201:1: ( LeftParenthesis )
            // InternalPortugolParser.g:7202:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0()); 
            }
            match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0()); 
            }

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
    // $ANTLR end "rule__PrimaryExpression__Group_4__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_4__1"
    // InternalPortugolParser.g:7211:1: rule__PrimaryExpression__Group_4__1 : rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2 ;
    public final void rule__PrimaryExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7215:1: ( rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2 )
            // InternalPortugolParser.g:7216:2: rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2
            {
            pushFollow(FOLLOW_35);
            rule__PrimaryExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimaryExpression__Group_4__1"


    // $ANTLR start "rule__PrimaryExpression__Group_4__1__Impl"
    // InternalPortugolParser.g:7223:1: rule__PrimaryExpression__Group_4__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7227:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:7228:1: ( ruleExpression )
            {
            // InternalPortugolParser.g:7228:1: ( ruleExpression )
            // InternalPortugolParser.g:7229:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1()); 
            }

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
    // $ANTLR end "rule__PrimaryExpression__Group_4__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_4__2"
    // InternalPortugolParser.g:7238:1: rule__PrimaryExpression__Group_4__2 : rule__PrimaryExpression__Group_4__2__Impl ;
    public final void rule__PrimaryExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7242:1: ( rule__PrimaryExpression__Group_4__2__Impl )
            // InternalPortugolParser.g:7243:2: rule__PrimaryExpression__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimaryExpression__Group_4__2"


    // $ANTLR start "rule__PrimaryExpression__Group_4__2__Impl"
    // InternalPortugolParser.g:7249:1: rule__PrimaryExpression__Group_4__2__Impl : ( RightParenthesis ) ;
    public final void rule__PrimaryExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7253:1: ( ( RightParenthesis ) )
            // InternalPortugolParser.g:7254:1: ( RightParenthesis )
            {
            // InternalPortugolParser.g:7254:1: ( RightParenthesis )
            // InternalPortugolParser.g:7255:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_2()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_2()); 
            }

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
    // $ANTLR end "rule__PrimaryExpression__Group_4__2__Impl"


    // $ANTLR start "rule__PreDefinedFunctionCall__Group__0"
    // InternalPortugolParser.g:7265:1: rule__PreDefinedFunctionCall__Group__0 : rule__PreDefinedFunctionCall__Group__0__Impl rule__PreDefinedFunctionCall__Group__1 ;
    public final void rule__PreDefinedFunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7269:1: ( rule__PreDefinedFunctionCall__Group__0__Impl rule__PreDefinedFunctionCall__Group__1 )
            // InternalPortugolParser.g:7270:2: rule__PreDefinedFunctionCall__Group__0__Impl rule__PreDefinedFunctionCall__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__PreDefinedFunctionCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PreDefinedFunctionCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PreDefinedFunctionCall__Group__0"


    // $ANTLR start "rule__PreDefinedFunctionCall__Group__0__Impl"
    // InternalPortugolParser.g:7277:1: rule__PreDefinedFunctionCall__Group__0__Impl : ( ( rule__PreDefinedFunctionCall__PreDefFunctionNameAssignment_0 ) ) ;
    public final void rule__PreDefinedFunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7281:1: ( ( ( rule__PreDefinedFunctionCall__PreDefFunctionNameAssignment_0 ) ) )
            // InternalPortugolParser.g:7282:1: ( ( rule__PreDefinedFunctionCall__PreDefFunctionNameAssignment_0 ) )
            {
            // InternalPortugolParser.g:7282:1: ( ( rule__PreDefinedFunctionCall__PreDefFunctionNameAssignment_0 ) )
            // InternalPortugolParser.g:7283:2: ( rule__PreDefinedFunctionCall__PreDefFunctionNameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreDefinedFunctionCallAccess().getPreDefFunctionNameAssignment_0()); 
            }
            // InternalPortugolParser.g:7284:2: ( rule__PreDefinedFunctionCall__PreDefFunctionNameAssignment_0 )
            // InternalPortugolParser.g:7284:3: rule__PreDefinedFunctionCall__PreDefFunctionNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PreDefinedFunctionCall__PreDefFunctionNameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreDefinedFunctionCallAccess().getPreDefFunctionNameAssignment_0()); 
            }

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
    // $ANTLR end "rule__PreDefinedFunctionCall__Group__0__Impl"


    // $ANTLR start "rule__PreDefinedFunctionCall__Group__1"
    // InternalPortugolParser.g:7292:1: rule__PreDefinedFunctionCall__Group__1 : rule__PreDefinedFunctionCall__Group__1__Impl rule__PreDefinedFunctionCall__Group__2 ;
    public final void rule__PreDefinedFunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7296:1: ( rule__PreDefinedFunctionCall__Group__1__Impl rule__PreDefinedFunctionCall__Group__2 )
            // InternalPortugolParser.g:7297:2: rule__PreDefinedFunctionCall__Group__1__Impl rule__PreDefinedFunctionCall__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__PreDefinedFunctionCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PreDefinedFunctionCall__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PreDefinedFunctionCall__Group__1"


    // $ANTLR start "rule__PreDefinedFunctionCall__Group__1__Impl"
    // InternalPortugolParser.g:7304:1: rule__PreDefinedFunctionCall__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__PreDefinedFunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7308:1: ( ( LeftParenthesis ) )
            // InternalPortugolParser.g:7309:1: ( LeftParenthesis )
            {
            // InternalPortugolParser.g:7309:1: ( LeftParenthesis )
            // InternalPortugolParser.g:7310:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreDefinedFunctionCallAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreDefinedFunctionCallAccess().getLeftParenthesisKeyword_1()); 
            }

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
    // $ANTLR end "rule__PreDefinedFunctionCall__Group__1__Impl"


    // $ANTLR start "rule__PreDefinedFunctionCall__Group__2"
    // InternalPortugolParser.g:7319:1: rule__PreDefinedFunctionCall__Group__2 : rule__PreDefinedFunctionCall__Group__2__Impl rule__PreDefinedFunctionCall__Group__3 ;
    public final void rule__PreDefinedFunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7323:1: ( rule__PreDefinedFunctionCall__Group__2__Impl rule__PreDefinedFunctionCall__Group__3 )
            // InternalPortugolParser.g:7324:2: rule__PreDefinedFunctionCall__Group__2__Impl rule__PreDefinedFunctionCall__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__PreDefinedFunctionCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PreDefinedFunctionCall__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PreDefinedFunctionCall__Group__2"


    // $ANTLR start "rule__PreDefinedFunctionCall__Group__2__Impl"
    // InternalPortugolParser.g:7331:1: rule__PreDefinedFunctionCall__Group__2__Impl : ( ( rule__PreDefinedFunctionCall__ParamAssignment_2 ) ) ;
    public final void rule__PreDefinedFunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7335:1: ( ( ( rule__PreDefinedFunctionCall__ParamAssignment_2 ) ) )
            // InternalPortugolParser.g:7336:1: ( ( rule__PreDefinedFunctionCall__ParamAssignment_2 ) )
            {
            // InternalPortugolParser.g:7336:1: ( ( rule__PreDefinedFunctionCall__ParamAssignment_2 ) )
            // InternalPortugolParser.g:7337:2: ( rule__PreDefinedFunctionCall__ParamAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreDefinedFunctionCallAccess().getParamAssignment_2()); 
            }
            // InternalPortugolParser.g:7338:2: ( rule__PreDefinedFunctionCall__ParamAssignment_2 )
            // InternalPortugolParser.g:7338:3: rule__PreDefinedFunctionCall__ParamAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PreDefinedFunctionCall__ParamAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreDefinedFunctionCallAccess().getParamAssignment_2()); 
            }

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
    // $ANTLR end "rule__PreDefinedFunctionCall__Group__2__Impl"


    // $ANTLR start "rule__PreDefinedFunctionCall__Group__3"
    // InternalPortugolParser.g:7346:1: rule__PreDefinedFunctionCall__Group__3 : rule__PreDefinedFunctionCall__Group__3__Impl ;
    public final void rule__PreDefinedFunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7350:1: ( rule__PreDefinedFunctionCall__Group__3__Impl )
            // InternalPortugolParser.g:7351:2: rule__PreDefinedFunctionCall__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PreDefinedFunctionCall__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PreDefinedFunctionCall__Group__3"


    // $ANTLR start "rule__PreDefinedFunctionCall__Group__3__Impl"
    // InternalPortugolParser.g:7357:1: rule__PreDefinedFunctionCall__Group__3__Impl : ( RightParenthesis ) ;
    public final void rule__PreDefinedFunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7361:1: ( ( RightParenthesis ) )
            // InternalPortugolParser.g:7362:1: ( RightParenthesis )
            {
            // InternalPortugolParser.g:7362:1: ( RightParenthesis )
            // InternalPortugolParser.g:7363:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreDefinedFunctionCallAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreDefinedFunctionCallAccess().getRightParenthesisKeyword_3()); 
            }

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
    // $ANTLR end "rule__PreDefinedFunctionCall__Group__3__Impl"


    // $ANTLR start "rule__FunctionCall__Group__0"
    // InternalPortugolParser.g:7373:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7377:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalPortugolParser.g:7378:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__FunctionCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FunctionCall__Group__0"


    // $ANTLR start "rule__FunctionCall__Group__0__Impl"
    // InternalPortugolParser.g:7385:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__FbNameAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7389:1: ( ( ( rule__FunctionCall__FbNameAssignment_0 ) ) )
            // InternalPortugolParser.g:7390:1: ( ( rule__FunctionCall__FbNameAssignment_0 ) )
            {
            // InternalPortugolParser.g:7390:1: ( ( rule__FunctionCall__FbNameAssignment_0 ) )
            // InternalPortugolParser.g:7391:2: ( rule__FunctionCall__FbNameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFbNameAssignment_0()); 
            }
            // InternalPortugolParser.g:7392:2: ( rule__FunctionCall__FbNameAssignment_0 )
            // InternalPortugolParser.g:7392:3: rule__FunctionCall__FbNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__FbNameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getFbNameAssignment_0()); 
            }

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
    // $ANTLR end "rule__FunctionCall__Group__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group__1"
    // InternalPortugolParser.g:7400:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7404:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // InternalPortugolParser.g:7405:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__FunctionCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FunctionCall__Group__1"


    // $ANTLR start "rule__FunctionCall__Group__1__Impl"
    // InternalPortugolParser.g:7412:1: rule__FunctionCall__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7416:1: ( ( LeftParenthesis ) )
            // InternalPortugolParser.g:7417:1: ( LeftParenthesis )
            {
            // InternalPortugolParser.g:7417:1: ( LeftParenthesis )
            // InternalPortugolParser.g:7418:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1()); 
            }

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
    // $ANTLR end "rule__FunctionCall__Group__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group__2"
    // InternalPortugolParser.g:7427:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7431:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // InternalPortugolParser.g:7432:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__FunctionCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FunctionCall__Group__2"


    // $ANTLR start "rule__FunctionCall__Group__2__Impl"
    // InternalPortugolParser.g:7439:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__ParamAssignment_2 ) ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7443:1: ( ( ( rule__FunctionCall__ParamAssignment_2 ) ) )
            // InternalPortugolParser.g:7444:1: ( ( rule__FunctionCall__ParamAssignment_2 ) )
            {
            // InternalPortugolParser.g:7444:1: ( ( rule__FunctionCall__ParamAssignment_2 ) )
            // InternalPortugolParser.g:7445:2: ( rule__FunctionCall__ParamAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParamAssignment_2()); 
            }
            // InternalPortugolParser.g:7446:2: ( rule__FunctionCall__ParamAssignment_2 )
            // InternalPortugolParser.g:7446:3: rule__FunctionCall__ParamAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__ParamAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParamAssignment_2()); 
            }

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
    // $ANTLR end "rule__FunctionCall__Group__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group__3"
    // InternalPortugolParser.g:7454:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7458:1: ( rule__FunctionCall__Group__3__Impl )
            // InternalPortugolParser.g:7459:2: rule__FunctionCall__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FunctionCall__Group__3"


    // $ANTLR start "rule__FunctionCall__Group__3__Impl"
    // InternalPortugolParser.g:7465:1: rule__FunctionCall__Group__3__Impl : ( RightParenthesis ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7469:1: ( ( RightParenthesis ) )
            // InternalPortugolParser.g:7470:1: ( RightParenthesis )
            {
            // InternalPortugolParser.g:7470:1: ( RightParenthesis )
            // InternalPortugolParser.g:7471:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3()); 
            }

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
    // $ANTLR end "rule__FunctionCall__Group__3__Impl"


    // $ANTLR start "rule__Literal__Group_0__0"
    // InternalPortugolParser.g:7481:1: rule__Literal__Group_0__0 : rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 ;
    public final void rule__Literal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7485:1: ( rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 )
            // InternalPortugolParser.g:7486:2: rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1
            {
            pushFollow(FOLLOW_56);
            rule__Literal__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Literal__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Literal__Group_0__0"


    // $ANTLR start "rule__Literal__Group_0__0__Impl"
    // InternalPortugolParser.g:7493:1: rule__Literal__Group_0__0__Impl : ( () ) ;
    public final void rule__Literal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7497:1: ( ( () ) )
            // InternalPortugolParser.g:7498:1: ( () )
            {
            // InternalPortugolParser.g:7498:1: ( () )
            // InternalPortugolParser.g:7499:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getLiteralAction_0_0()); 
            }
            // InternalPortugolParser.g:7500:2: ()
            // InternalPortugolParser.g:7500:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getLiteralAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__0__Impl"


    // $ANTLR start "rule__Literal__Group_0__1"
    // InternalPortugolParser.g:7508:1: rule__Literal__Group_0__1 : rule__Literal__Group_0__1__Impl ;
    public final void rule__Literal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7512:1: ( rule__Literal__Group_0__1__Impl )
            // InternalPortugolParser.g:7513:2: rule__Literal__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Literal__Group_0__1"


    // $ANTLR start "rule__Literal__Group_0__1__Impl"
    // InternalPortugolParser.g:7519:1: rule__Literal__Group_0__1__Impl : ( rulePiLiteral ) ;
    public final void rule__Literal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7523:1: ( ( rulePiLiteral ) )
            // InternalPortugolParser.g:7524:1: ( rulePiLiteral )
            {
            // InternalPortugolParser.g:7524:1: ( rulePiLiteral )
            // InternalPortugolParser.g:7525:2: rulePiLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getPiLiteralParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            rulePiLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getPiLiteralParserRuleCall_0_1()); 
            }

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
    // $ANTLR end "rule__Literal__Group_0__1__Impl"


    // $ANTLR start "rule__Model__HeaderAssignment_0"
    // InternalPortugolParser.g:7535:1: rule__Model__HeaderAssignment_0 : ( ruleHeaderBlock ) ;
    public final void rule__Model__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7539:1: ( ( ruleHeaderBlock ) )
            // InternalPortugolParser.g:7540:2: ( ruleHeaderBlock )
            {
            // InternalPortugolParser.g:7540:2: ( ruleHeaderBlock )
            // InternalPortugolParser.g:7541:3: ruleHeaderBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getHeaderHeaderBlockParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleHeaderBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getHeaderHeaderBlockParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__Model__HeaderAssignment_0"


    // $ANTLR start "rule__Model__GlobalDeclarationsAssignment_1"
    // InternalPortugolParser.g:7550:1: rule__Model__GlobalDeclarationsAssignment_1 : ( ruleDeclarationsBlock ) ;
    public final void rule__Model__GlobalDeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7554:1: ( ( ruleDeclarationsBlock ) )
            // InternalPortugolParser.g:7555:2: ( ruleDeclarationsBlock )
            {
            // InternalPortugolParser.g:7555:2: ( ruleDeclarationsBlock )
            // InternalPortugolParser.g:7556:3: ruleDeclarationsBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGlobalDeclarationsDeclarationsBlockParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDeclarationsBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGlobalDeclarationsDeclarationsBlockParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__Model__GlobalDeclarationsAssignment_1"


    // $ANTLR start "rule__Model__SubprogramsAssignment_2"
    // InternalPortugolParser.g:7565:1: rule__Model__SubprogramsAssignment_2 : ( ruleSubprograms ) ;
    public final void rule__Model__SubprogramsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7569:1: ( ( ruleSubprograms ) )
            // InternalPortugolParser.g:7570:2: ( ruleSubprograms )
            {
            // InternalPortugolParser.g:7570:2: ( ruleSubprograms )
            // InternalPortugolParser.g:7571:3: ruleSubprograms
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSubprogramsSubprogramsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSubprograms();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getSubprogramsSubprogramsParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__Model__SubprogramsAssignment_2"


    // $ANTLR start "rule__Model__CommandsAssignment_3"
    // InternalPortugolParser.g:7580:1: rule__Model__CommandsAssignment_3 : ( ruleBlockCommand ) ;
    public final void rule__Model__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7584:1: ( ( ruleBlockCommand ) )
            // InternalPortugolParser.g:7585:2: ( ruleBlockCommand )
            {
            // InternalPortugolParser.g:7585:2: ( ruleBlockCommand )
            // InternalPortugolParser.g:7586:3: ruleBlockCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getCommandsBlockCommandParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlockCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getCommandsBlockCommandParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__Model__CommandsAssignment_3"


    // $ANTLR start "rule__HeaderBlock__AlgorithmNameAssignment_1"
    // InternalPortugolParser.g:7595:1: rule__HeaderBlock__AlgorithmNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__HeaderBlock__AlgorithmNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7599:1: ( ( RULE_STRING ) )
            // InternalPortugolParser.g:7600:2: ( RULE_STRING )
            {
            // InternalPortugolParser.g:7600:2: ( RULE_STRING )
            // InternalPortugolParser.g:7601:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderBlockAccess().getAlgorithmNameSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderBlockAccess().getAlgorithmNameSTRINGTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__HeaderBlock__AlgorithmNameAssignment_1"


    // $ANTLR start "rule__DeclarationsBlock__VarsAssignment_1_0"
    // InternalPortugolParser.g:7610:1: rule__DeclarationsBlock__VarsAssignment_1_0 : ( ruleVariable ) ;
    public final void rule__DeclarationsBlock__VarsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7614:1: ( ( ruleVariable ) )
            // InternalPortugolParser.g:7615:2: ( ruleVariable )
            {
            // InternalPortugolParser.g:7615:2: ( ruleVariable )
            // InternalPortugolParser.g:7616:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getVarsVariableParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationsBlockAccess().getVarsVariableParserRuleCall_1_0_0()); 
            }

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
    // $ANTLR end "rule__DeclarationsBlock__VarsAssignment_1_0"


    // $ANTLR start "rule__Variable__VarDeclarationAssignment_0"
    // InternalPortugolParser.g:7625:1: rule__Variable__VarDeclarationAssignment_0 : ( ruleVarDeclaration ) ;
    public final void rule__Variable__VarDeclarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7629:1: ( ( ruleVarDeclaration ) )
            // InternalPortugolParser.g:7630:2: ( ruleVarDeclaration )
            {
            // InternalPortugolParser.g:7630:2: ( ruleVarDeclaration )
            // InternalPortugolParser.g:7631:3: ruleVarDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getVarDeclarationVarDeclarationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVarDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getVarDeclarationVarDeclarationParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__Variable__VarDeclarationAssignment_0"


    // $ANTLR start "rule__Variable__TypeAssignment_2"
    // InternalPortugolParser.g:7640:1: rule__Variable__TypeAssignment_2 : ( ruleVarType ) ;
    public final void rule__Variable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7644:1: ( ( ruleVarType ) )
            // InternalPortugolParser.g:7645:2: ( ruleVarType )
            {
            // InternalPortugolParser.g:7645:2: ( ruleVarType )
            // InternalPortugolParser.g:7646:3: ruleVarType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getTypeVarTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVarType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getTypeVarTypeParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__Variable__TypeAssignment_2"


    // $ANTLR start "rule__VarDeclaration__VarsAssignment_0"
    // InternalPortugolParser.g:7655:1: rule__VarDeclaration__VarsAssignment_0 : ( ruleVarName ) ;
    public final void rule__VarDeclaration__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7659:1: ( ( ruleVarName ) )
            // InternalPortugolParser.g:7660:2: ( ruleVarName )
            {
            // InternalPortugolParser.g:7660:2: ( ruleVarName )
            // InternalPortugolParser.g:7661:3: ruleVarName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getVarsVarNameParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVarName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationAccess().getVarsVarNameParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__VarDeclaration__VarsAssignment_0"


    // $ANTLR start "rule__VarDeclaration__VarsAssignment_1_1"
    // InternalPortugolParser.g:7670:1: rule__VarDeclaration__VarsAssignment_1_1 : ( ruleVarName ) ;
    public final void rule__VarDeclaration__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7674:1: ( ( ruleVarName ) )
            // InternalPortugolParser.g:7675:2: ( ruleVarName )
            {
            // InternalPortugolParser.g:7675:2: ( ruleVarName )
            // InternalPortugolParser.g:7676:3: ruleVarName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getVarsVarNameParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVarName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclarationAccess().getVarsVarNameParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__VarDeclaration__VarsAssignment_1_1"


    // $ANTLR start "rule__DeclaredVarList__VarsAssignment_0"
    // InternalPortugolParser.g:7685:1: rule__DeclaredVarList__VarsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredVarList__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7689:1: ( ( ( RULE_ID ) ) )
            // InternalPortugolParser.g:7690:2: ( ( RULE_ID ) )
            {
            // InternalPortugolParser.g:7690:2: ( ( RULE_ID ) )
            // InternalPortugolParser.g:7691:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getVarsVarNameCrossReference_0_0()); 
            }
            // InternalPortugolParser.g:7692:3: ( RULE_ID )
            // InternalPortugolParser.g:7693:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getVarsVarNameIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredVarListAccess().getVarsVarNameIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredVarListAccess().getVarsVarNameCrossReference_0_0()); 
            }

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
    // $ANTLR end "rule__DeclaredVarList__VarsAssignment_0"


    // $ANTLR start "rule__DeclaredVarList__VarsAssignment_1_1"
    // InternalPortugolParser.g:7704:1: rule__DeclaredVarList__VarsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredVarList__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7708:1: ( ( ( RULE_ID ) ) )
            // InternalPortugolParser.g:7709:2: ( ( RULE_ID ) )
            {
            // InternalPortugolParser.g:7709:2: ( ( RULE_ID ) )
            // InternalPortugolParser.g:7710:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getVarsVarNameCrossReference_1_1_0()); 
            }
            // InternalPortugolParser.g:7711:3: ( RULE_ID )
            // InternalPortugolParser.g:7712:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getVarsVarNameIDTerminalRuleCall_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredVarListAccess().getVarsVarNameIDTerminalRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredVarListAccess().getVarsVarNameCrossReference_1_1_0()); 
            }

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
    // $ANTLR end "rule__DeclaredVarList__VarsAssignment_1_1"


    // $ANTLR start "rule__VarName__NameAssignment"
    // InternalPortugolParser.g:7723:1: rule__VarName__NameAssignment : ( RULE_ID ) ;
    public final void rule__VarName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7727:1: ( ( RULE_ID ) )
            // InternalPortugolParser.g:7728:2: ( RULE_ID )
            {
            // InternalPortugolParser.g:7728:2: ( RULE_ID )
            // InternalPortugolParser.g:7729:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNameAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarNameAccess().getNameIDTerminalRuleCall_0()); 
            }

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
    // $ANTLR end "rule__VarName__NameAssignment"


    // $ANTLR start "rule__VarType__TypeNameAssignment"
    // InternalPortugolParser.g:7738:1: rule__VarType__TypeNameAssignment : ( ( rule__VarType__TypeNameAlternatives_0 ) ) ;
    public final void rule__VarType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7742:1: ( ( ( rule__VarType__TypeNameAlternatives_0 ) ) )
            // InternalPortugolParser.g:7743:2: ( ( rule__VarType__TypeNameAlternatives_0 ) )
            {
            // InternalPortugolParser.g:7743:2: ( ( rule__VarType__TypeNameAlternatives_0 ) )
            // InternalPortugolParser.g:7744:3: ( rule__VarType__TypeNameAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarTypeAccess().getTypeNameAlternatives_0()); 
            }
            // InternalPortugolParser.g:7745:3: ( rule__VarType__TypeNameAlternatives_0 )
            // InternalPortugolParser.g:7745:4: rule__VarType__TypeNameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__VarType__TypeNameAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarTypeAccess().getTypeNameAlternatives_0()); 
            }

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
    // $ANTLR end "rule__VarType__TypeNameAssignment"


    // $ANTLR start "rule__Subprograms__BlockSubProgramsAssignment"
    // InternalPortugolParser.g:7753:1: rule__Subprograms__BlockSubProgramsAssignment : ( ruleBlockSubPrograms ) ;
    public final void rule__Subprograms__BlockSubProgramsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7757:1: ( ( ruleBlockSubPrograms ) )
            // InternalPortugolParser.g:7758:2: ( ruleBlockSubPrograms )
            {
            // InternalPortugolParser.g:7758:2: ( ruleBlockSubPrograms )
            // InternalPortugolParser.g:7759:3: ruleBlockSubPrograms
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramsAccess().getBlockSubProgramsBlockSubProgramsParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlockSubPrograms();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubprogramsAccess().getBlockSubProgramsBlockSubProgramsParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Subprograms__BlockSubProgramsAssignment"


    // $ANTLR start "rule__ProcedureName__NameAssignment"
    // InternalPortugolParser.g:7768:1: rule__ProcedureName__NameAssignment : ( RULE_ID ) ;
    public final void rule__ProcedureName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7772:1: ( ( RULE_ID ) )
            // InternalPortugolParser.g:7773:2: ( RULE_ID )
            {
            // InternalPortugolParser.g:7773:2: ( RULE_ID )
            // InternalPortugolParser.g:7774:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedureNameAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedureNameAccess().getNameIDTerminalRuleCall_0()); 
            }

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
    // $ANTLR end "rule__ProcedureName__NameAssignment"


    // $ANTLR start "rule__FunctionName__NameAssignment"
    // InternalPortugolParser.g:7783:1: rule__FunctionName__NameAssignment : ( RULE_ID ) ;
    public final void rule__FunctionName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7787:1: ( ( RULE_ID ) )
            // InternalPortugolParser.g:7788:2: ( RULE_ID )
            {
            // InternalPortugolParser.g:7788:2: ( RULE_ID )
            // InternalPortugolParser.g:7789:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionNameAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionNameAccess().getNameIDTerminalRuleCall_0()); 
            }

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
    // $ANTLR end "rule__FunctionName__NameAssignment"


    // $ANTLR start "rule__BlockFunction__FunctionNameAssignment_1"
    // InternalPortugolParser.g:7798:1: rule__BlockFunction__FunctionNameAssignment_1 : ( ruleFunctionName ) ;
    public final void rule__BlockFunction__FunctionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7802:1: ( ( ruleFunctionName ) )
            // InternalPortugolParser.g:7803:2: ( ruleFunctionName )
            {
            // InternalPortugolParser.g:7803:2: ( ruleFunctionName )
            // InternalPortugolParser.g:7804:3: ruleFunctionName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getFunctionNameFunctionNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFunctionName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getFunctionNameFunctionNameParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__BlockFunction__FunctionNameAssignment_1"


    // $ANTLR start "rule__BlockFunction__ParamListAssignment_3_0"
    // InternalPortugolParser.g:7813:1: rule__BlockFunction__ParamListAssignment_3_0 : ( ruleVariable ) ;
    public final void rule__BlockFunction__ParamListAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7817:1: ( ( ruleVariable ) )
            // InternalPortugolParser.g:7818:2: ( ruleVariable )
            {
            // InternalPortugolParser.g:7818:2: ( ruleVariable )
            // InternalPortugolParser.g:7819:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getParamListVariableParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getParamListVariableParserRuleCall_3_0_0()); 
            }

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
    // $ANTLR end "rule__BlockFunction__ParamListAssignment_3_0"


    // $ANTLR start "rule__BlockFunction__ParamListAssignment_3_1_1"
    // InternalPortugolParser.g:7828:1: rule__BlockFunction__ParamListAssignment_3_1_1 : ( ruleVariable ) ;
    public final void rule__BlockFunction__ParamListAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7832:1: ( ( ruleVariable ) )
            // InternalPortugolParser.g:7833:2: ( ruleVariable )
            {
            // InternalPortugolParser.g:7833:2: ( ruleVariable )
            // InternalPortugolParser.g:7834:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getParamListVariableParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getParamListVariableParserRuleCall_3_1_1_0()); 
            }

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
    // $ANTLR end "rule__BlockFunction__ParamListAssignment_3_1_1"


    // $ANTLR start "rule__BlockFunction__ReturnTypeAssignment_6"
    // InternalPortugolParser.g:7843:1: rule__BlockFunction__ReturnTypeAssignment_6 : ( ruleVarType ) ;
    public final void rule__BlockFunction__ReturnTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7847:1: ( ( ruleVarType ) )
            // InternalPortugolParser.g:7848:2: ( ruleVarType )
            {
            // InternalPortugolParser.g:7848:2: ( ruleVarType )
            // InternalPortugolParser.g:7849:3: ruleVarType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getReturnTypeVarTypeParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVarType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getReturnTypeVarTypeParserRuleCall_6_0()); 
            }

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
    // $ANTLR end "rule__BlockFunction__ReturnTypeAssignment_6"


    // $ANTLR start "rule__BlockFunction__DeclarationsAssignment_7"
    // InternalPortugolParser.g:7858:1: rule__BlockFunction__DeclarationsAssignment_7 : ( ruleDeclarationsBlock ) ;
    public final void rule__BlockFunction__DeclarationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7862:1: ( ( ruleDeclarationsBlock ) )
            // InternalPortugolParser.g:7863:2: ( ruleDeclarationsBlock )
            {
            // InternalPortugolParser.g:7863:2: ( ruleDeclarationsBlock )
            // InternalPortugolParser.g:7864:3: ruleDeclarationsBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getDeclarationsDeclarationsBlockParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDeclarationsBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getDeclarationsDeclarationsBlockParserRuleCall_7_0()); 
            }

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
    // $ANTLR end "rule__BlockFunction__DeclarationsAssignment_7"


    // $ANTLR start "rule__BlockFunction__CommandsAssignment_9"
    // InternalPortugolParser.g:7873:1: rule__BlockFunction__CommandsAssignment_9 : ( ruleAbstractCommand ) ;
    public final void rule__BlockFunction__CommandsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7877:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:7878:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:7878:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:7879:3: ruleAbstractCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getCommandsAbstractCommandParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbstractCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getCommandsAbstractCommandParserRuleCall_9_0()); 
            }

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
    // $ANTLR end "rule__BlockFunction__CommandsAssignment_9"


    // $ANTLR start "rule__BlockProcedure__ProcedureNameAssignment_1"
    // InternalPortugolParser.g:7888:1: rule__BlockProcedure__ProcedureNameAssignment_1 : ( ruleProcedureName ) ;
    public final void rule__BlockProcedure__ProcedureNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7892:1: ( ( ruleProcedureName ) )
            // InternalPortugolParser.g:7893:2: ( ruleProcedureName )
            {
            // InternalPortugolParser.g:7893:2: ( ruleProcedureName )
            // InternalPortugolParser.g:7894:3: ruleProcedureName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getProcedureNameProcedureNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleProcedureName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getProcedureNameProcedureNameParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__BlockProcedure__ProcedureNameAssignment_1"


    // $ANTLR start "rule__BlockProcedure__ParamListAssignment_3_0"
    // InternalPortugolParser.g:7903:1: rule__BlockProcedure__ParamListAssignment_3_0 : ( ruleVariable ) ;
    public final void rule__BlockProcedure__ParamListAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7907:1: ( ( ruleVariable ) )
            // InternalPortugolParser.g:7908:2: ( ruleVariable )
            {
            // InternalPortugolParser.g:7908:2: ( ruleVariable )
            // InternalPortugolParser.g:7909:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getParamListVariableParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getParamListVariableParserRuleCall_3_0_0()); 
            }

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
    // $ANTLR end "rule__BlockProcedure__ParamListAssignment_3_0"


    // $ANTLR start "rule__BlockProcedure__ParamListAssignment_3_1_1"
    // InternalPortugolParser.g:7918:1: rule__BlockProcedure__ParamListAssignment_3_1_1 : ( ruleVariable ) ;
    public final void rule__BlockProcedure__ParamListAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7922:1: ( ( ruleVariable ) )
            // InternalPortugolParser.g:7923:2: ( ruleVariable )
            {
            // InternalPortugolParser.g:7923:2: ( ruleVariable )
            // InternalPortugolParser.g:7924:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getParamListVariableParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getParamListVariableParserRuleCall_3_1_1_0()); 
            }

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
    // $ANTLR end "rule__BlockProcedure__ParamListAssignment_3_1_1"


    // $ANTLR start "rule__BlockProcedure__DeclarationsAssignment_5"
    // InternalPortugolParser.g:7933:1: rule__BlockProcedure__DeclarationsAssignment_5 : ( ruleDeclarationsBlock ) ;
    public final void rule__BlockProcedure__DeclarationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7937:1: ( ( ruleDeclarationsBlock ) )
            // InternalPortugolParser.g:7938:2: ( ruleDeclarationsBlock )
            {
            // InternalPortugolParser.g:7938:2: ( ruleDeclarationsBlock )
            // InternalPortugolParser.g:7939:3: ruleDeclarationsBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getDeclarationsDeclarationsBlockParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDeclarationsBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getDeclarationsDeclarationsBlockParserRuleCall_5_0()); 
            }

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
    // $ANTLR end "rule__BlockProcedure__DeclarationsAssignment_5"


    // $ANTLR start "rule__BlockProcedure__CommandsAssignment_7"
    // InternalPortugolParser.g:7948:1: rule__BlockProcedure__CommandsAssignment_7 : ( ruleAbstractCommand ) ;
    public final void rule__BlockProcedure__CommandsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7952:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:7953:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:7953:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:7954:3: ruleAbstractCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getCommandsAbstractCommandParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbstractCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getCommandsAbstractCommandParserRuleCall_7_0()); 
            }

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
    // $ANTLR end "rule__BlockProcedure__CommandsAssignment_7"


    // $ANTLR start "rule__BlockCommand__CommandsAssignment_1"
    // InternalPortugolParser.g:7963:1: rule__BlockCommand__CommandsAssignment_1 : ( ruleAbstractCommand ) ;
    public final void rule__BlockCommand__CommandsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7967:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:7968:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:7968:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:7969:3: ruleAbstractCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getCommandsAbstractCommandParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbstractCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockCommandAccess().getCommandsAbstractCommandParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__BlockCommand__CommandsAssignment_1"


    // $ANTLR start "rule__ReturnStatement__ExprAssignment_2"
    // InternalPortugolParser.g:7978:1: rule__ReturnStatement__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__ReturnStatement__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7982:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:7983:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:7983:2: ( ruleExpression )
            // InternalPortugolParser.g:7984:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getExprExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnStatementAccess().getExprExpressionParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__ReturnStatement__ExprAssignment_2"


    // $ANTLR start "rule__IfStatement__ExprAssignment_1"
    // InternalPortugolParser.g:7993:1: rule__IfStatement__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__IfStatement__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7997:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:7998:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:7998:2: ( ruleExpression )
            // InternalPortugolParser.g:7999:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getExprExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getExprExpressionParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__IfStatement__ExprAssignment_1"


    // $ANTLR start "rule__IfStatement__CommandsAssignment_3"
    // InternalPortugolParser.g:8008:1: rule__IfStatement__CommandsAssignment_3 : ( ruleAbstractCommand ) ;
    public final void rule__IfStatement__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8012:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:8013:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:8013:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:8014:3: ruleAbstractCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getCommandsAbstractCommandParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbstractCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getCommandsAbstractCommandParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__IfStatement__CommandsAssignment_3"


    // $ANTLR start "rule__IfStatement__ElseCommandsAssignment_4_1"
    // InternalPortugolParser.g:8023:1: rule__IfStatement__ElseCommandsAssignment_4_1 : ( ruleAbstractCommand ) ;
    public final void rule__IfStatement__ElseCommandsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8027:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:8028:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:8028:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:8029:3: ruleAbstractCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseCommandsAbstractCommandParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbstractCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseCommandsAbstractCommandParserRuleCall_4_1_0()); 
            }

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
    // $ANTLR end "rule__IfStatement__ElseCommandsAssignment_4_1"


    // $ANTLR start "rule__SwitchCaseStatement__VariableAssignment_1"
    // InternalPortugolParser.g:8038:1: rule__SwitchCaseStatement__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SwitchCaseStatement__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8042:1: ( ( ( RULE_ID ) ) )
            // InternalPortugolParser.g:8043:2: ( ( RULE_ID ) )
            {
            // InternalPortugolParser.g:8043:2: ( ( RULE_ID ) )
            // InternalPortugolParser.g:8044:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getVariableVarNameCrossReference_1_0()); 
            }
            // InternalPortugolParser.g:8045:3: ( RULE_ID )
            // InternalPortugolParser.g:8046:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getVariableVarNameIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseStatementAccess().getVariableVarNameIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseStatementAccess().getVariableVarNameCrossReference_1_0()); 
            }

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
    // $ANTLR end "rule__SwitchCaseStatement__VariableAssignment_1"


    // $ANTLR start "rule__SwitchCaseStatement__CaseListAssignment_2"
    // InternalPortugolParser.g:8057:1: rule__SwitchCaseStatement__CaseListAssignment_2 : ( ruleCaseList ) ;
    public final void rule__SwitchCaseStatement__CaseListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8061:1: ( ( ruleCaseList ) )
            // InternalPortugolParser.g:8062:2: ( ruleCaseList )
            {
            // InternalPortugolParser.g:8062:2: ( ruleCaseList )
            // InternalPortugolParser.g:8063:3: ruleCaseList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getCaseListCaseListParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCaseList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseStatementAccess().getCaseListCaseListParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__SwitchCaseStatement__CaseListAssignment_2"


    // $ANTLR start "rule__SwitchCaseStatement__OtherCaseAssignment_3"
    // InternalPortugolParser.g:8072:1: rule__SwitchCaseStatement__OtherCaseAssignment_3 : ( ruleOtherCase ) ;
    public final void rule__SwitchCaseStatement__OtherCaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8076:1: ( ( ruleOtherCase ) )
            // InternalPortugolParser.g:8077:2: ( ruleOtherCase )
            {
            // InternalPortugolParser.g:8077:2: ( ruleOtherCase )
            // InternalPortugolParser.g:8078:3: ruleOtherCase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getOtherCaseOtherCaseParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOtherCase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseStatementAccess().getOtherCaseOtherCaseParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__SwitchCaseStatement__OtherCaseAssignment_3"


    // $ANTLR start "rule__CaseList__ExprAssignment_1"
    // InternalPortugolParser.g:8087:1: rule__CaseList__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__CaseList__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8091:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:8092:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:8092:2: ( ruleExpression )
            // InternalPortugolParser.g:8093:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getExprExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseListAccess().getExprExpressionParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__CaseList__ExprAssignment_1"


    // $ANTLR start "rule__CaseList__CommandsAssignment_3"
    // InternalPortugolParser.g:8102:1: rule__CaseList__CommandsAssignment_3 : ( ruleAbstractCommand ) ;
    public final void rule__CaseList__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8106:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:8107:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:8107:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:8108:3: ruleAbstractCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getCommandsAbstractCommandParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbstractCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseListAccess().getCommandsAbstractCommandParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__CaseList__CommandsAssignment_3"


    // $ANTLR start "rule__OtherCase__OtherCaseCommandsAssignment_2"
    // InternalPortugolParser.g:8117:1: rule__OtherCase__OtherCaseCommandsAssignment_2 : ( ruleAbstractCommand ) ;
    public final void rule__OtherCase__OtherCaseCommandsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8121:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:8122:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:8122:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:8123:3: ruleAbstractCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getOtherCaseCommandsAbstractCommandParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbstractCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherCaseAccess().getOtherCaseCommandsAbstractCommandParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__OtherCase__OtherCaseCommandsAssignment_2"


    // $ANTLR start "rule__ForStatement__OperatorExprAssignment_1"
    // InternalPortugolParser.g:8132:1: rule__ForStatement__OperatorExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__ForStatement__OperatorExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8136:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:8137:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:8137:2: ( ruleExpression )
            // InternalPortugolParser.g:8138:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getOperatorExprExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getOperatorExprExpressionParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__ForStatement__OperatorExprAssignment_1"


    // $ANTLR start "rule__ForStatement__StartExprAssignment_3"
    // InternalPortugolParser.g:8147:1: rule__ForStatement__StartExprAssignment_3 : ( ruleExpression ) ;
    public final void rule__ForStatement__StartExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8151:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:8152:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:8152:2: ( ruleExpression )
            // InternalPortugolParser.g:8153:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getStartExprExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getStartExprExpressionParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__ForStatement__StartExprAssignment_3"


    // $ANTLR start "rule__ForStatement__EndExprAssignment_5"
    // InternalPortugolParser.g:8162:1: rule__ForStatement__EndExprAssignment_5 : ( ruleExpression ) ;
    public final void rule__ForStatement__EndExprAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8166:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:8167:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:8167:2: ( ruleExpression )
            // InternalPortugolParser.g:8168:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getEndExprExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getEndExprExpressionParserRuleCall_5_0()); 
            }

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
    // $ANTLR end "rule__ForStatement__EndExprAssignment_5"


    // $ANTLR start "rule__ForStatement__StepExpeAssignment_6_1"
    // InternalPortugolParser.g:8177:1: rule__ForStatement__StepExpeAssignment_6_1 : ( ruleExpression ) ;
    public final void rule__ForStatement__StepExpeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8181:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:8182:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:8182:2: ( ruleExpression )
            // InternalPortugolParser.g:8183:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getStepExpeExpressionParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getStepExpeExpressionParserRuleCall_6_1_0()); 
            }

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
    // $ANTLR end "rule__ForStatement__StepExpeAssignment_6_1"


    // $ANTLR start "rule__ForStatement__CommandsAssignment_8"
    // InternalPortugolParser.g:8192:1: rule__ForStatement__CommandsAssignment_8 : ( ruleAbstractCommand ) ;
    public final void rule__ForStatement__CommandsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8196:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:8197:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:8197:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:8198:3: ruleAbstractCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getCommandsAbstractCommandParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbstractCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getCommandsAbstractCommandParserRuleCall_8_0()); 
            }

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
    // $ANTLR end "rule__ForStatement__CommandsAssignment_8"


    // $ANTLR start "rule__WhileStatement__WhileExprAssignment_1"
    // InternalPortugolParser.g:8207:1: rule__WhileStatement__WhileExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__WhileStatement__WhileExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8211:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:8212:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:8212:2: ( ruleExpression )
            // InternalPortugolParser.g:8213:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getWhileExprExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getWhileExprExpressionParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__WhileStatement__WhileExprAssignment_1"


    // $ANTLR start "rule__WhileStatement__CommandsAssignment_3"
    // InternalPortugolParser.g:8222:1: rule__WhileStatement__CommandsAssignment_3 : ( ruleAbstractCommand ) ;
    public final void rule__WhileStatement__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8226:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:8227:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:8227:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:8228:3: ruleAbstractCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getCommandsAbstractCommandParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbstractCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getCommandsAbstractCommandParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__WhileStatement__CommandsAssignment_3"


    // $ANTLR start "rule__RepeatStatement__CommandsAssignment_1"
    // InternalPortugolParser.g:8237:1: rule__RepeatStatement__CommandsAssignment_1 : ( ruleAbstractCommand ) ;
    public final void rule__RepeatStatement__CommandsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8241:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:8242:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:8242:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:8243:3: ruleAbstractCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatStatementAccess().getCommandsAbstractCommandParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbstractCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatStatementAccess().getCommandsAbstractCommandParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__RepeatStatement__CommandsAssignment_1"


    // $ANTLR start "rule__RepeatStatement__UntilExprAssignment_3"
    // InternalPortugolParser.g:8252:1: rule__RepeatStatement__UntilExprAssignment_3 : ( ruleExpression ) ;
    public final void rule__RepeatStatement__UntilExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8256:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:8257:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:8257:2: ( ruleExpression )
            // InternalPortugolParser.g:8258:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatStatementAccess().getUntilExprExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatStatementAccess().getUntilExprExpressionParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__RepeatStatement__UntilExprAssignment_3"


    // $ANTLR start "rule__SubprogramParam__ExpressionAssignment_0"
    // InternalPortugolParser.g:8267:1: rule__SubprogramParam__ExpressionAssignment_0 : ( ruleExpression ) ;
    public final void rule__SubprogramParam__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8271:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:8272:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:8272:2: ( ruleExpression )
            // InternalPortugolParser.g:8273:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamAccess().getExpressionExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubprogramParamAccess().getExpressionExpressionParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__SubprogramParam__ExpressionAssignment_0"


    // $ANTLR start "rule__SubprogramParam__ExpressionAssignment_1_1"
    // InternalPortugolParser.g:8282:1: rule__SubprogramParam__ExpressionAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__SubprogramParam__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8286:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:8287:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:8287:2: ( ruleExpression )
            // InternalPortugolParser.g:8288:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamAccess().getExpressionExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubprogramParamAccess().getExpressionExpressionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__SubprogramParam__ExpressionAssignment_1_1"


    // $ANTLR start "rule__ReadCommand__ParamListAssignment_2"
    // InternalPortugolParser.g:8297:1: rule__ReadCommand__ParamListAssignment_2 : ( ruleDeclaredVarList ) ;
    public final void rule__ReadCommand__ParamListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8301:1: ( ( ruleDeclaredVarList ) )
            // InternalPortugolParser.g:8302:2: ( ruleDeclaredVarList )
            {
            // InternalPortugolParser.g:8302:2: ( ruleDeclaredVarList )
            // InternalPortugolParser.g:8303:3: ruleDeclaredVarList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getParamListDeclaredVarListParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDeclaredVarList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReadCommandAccess().getParamListDeclaredVarListParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__ReadCommand__ParamListAssignment_2"


    // $ANTLR start "rule__WriteCommand__WriteCommandAssignment_0"
    // InternalPortugolParser.g:8312:1: rule__WriteCommand__WriteCommandAssignment_0 : ( ( rule__WriteCommand__WriteCommandAlternatives_0_0 ) ) ;
    public final void rule__WriteCommand__WriteCommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8316:1: ( ( ( rule__WriteCommand__WriteCommandAlternatives_0_0 ) ) )
            // InternalPortugolParser.g:8317:2: ( ( rule__WriteCommand__WriteCommandAlternatives_0_0 ) )
            {
            // InternalPortugolParser.g:8317:2: ( ( rule__WriteCommand__WriteCommandAlternatives_0_0 ) )
            // InternalPortugolParser.g:8318:3: ( rule__WriteCommand__WriteCommandAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getWriteCommandAlternatives_0_0()); 
            }
            // InternalPortugolParser.g:8319:3: ( rule__WriteCommand__WriteCommandAlternatives_0_0 )
            // InternalPortugolParser.g:8319:4: rule__WriteCommand__WriteCommandAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__WriteCommand__WriteCommandAlternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteCommandAccess().getWriteCommandAlternatives_0_0()); 
            }

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
    // $ANTLR end "rule__WriteCommand__WriteCommandAssignment_0"


    // $ANTLR start "rule__WriteCommand__WriteParamAssignment_2"
    // InternalPortugolParser.g:8327:1: rule__WriteCommand__WriteParamAssignment_2 : ( ruleWriteParam ) ;
    public final void rule__WriteCommand__WriteParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8331:1: ( ( ruleWriteParam ) )
            // InternalPortugolParser.g:8332:2: ( ruleWriteParam )
            {
            // InternalPortugolParser.g:8332:2: ( ruleWriteParam )
            // InternalPortugolParser.g:8333:3: ruleWriteParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getWriteParamWriteParamParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleWriteParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteCommandAccess().getWriteParamWriteParamParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__WriteCommand__WriteParamAssignment_2"


    // $ANTLR start "rule__WriteParam__ParamsAssignment_0"
    // InternalPortugolParser.g:8342:1: rule__WriteParam__ParamsAssignment_0 : ( ruleSubprogramParam ) ;
    public final void rule__WriteParam__ParamsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8346:1: ( ( ruleSubprogramParam ) )
            // InternalPortugolParser.g:8347:2: ( ruleSubprogramParam )
            {
            // InternalPortugolParser.g:8347:2: ( ruleSubprogramParam )
            // InternalPortugolParser.g:8348:3: ruleSubprogramParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getParamsSubprogramParamParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSubprogramParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteParamAccess().getParamsSubprogramParamParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__WriteParam__ParamsAssignment_0"


    // $ANTLR start "rule__WriteParam__PrecisionAssignment_1"
    // InternalPortugolParser.g:8357:1: rule__WriteParam__PrecisionAssignment_1 : ( ruleOptDecimalPrecision ) ;
    public final void rule__WriteParam__PrecisionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8361:1: ( ( ruleOptDecimalPrecision ) )
            // InternalPortugolParser.g:8362:2: ( ruleOptDecimalPrecision )
            {
            // InternalPortugolParser.g:8362:2: ( ruleOptDecimalPrecision )
            // InternalPortugolParser.g:8363:3: ruleOptDecimalPrecision
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getPrecisionOptDecimalPrecisionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOptDecimalPrecision();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteParamAccess().getPrecisionOptDecimalPrecisionParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__WriteParam__PrecisionAssignment_1"


    // $ANTLR start "rule__OptDecimalPrecision__FirstPrecisionAssignment_1"
    // InternalPortugolParser.g:8372:1: rule__OptDecimalPrecision__FirstPrecisionAssignment_1 : ( RULE_INT ) ;
    public final void rule__OptDecimalPrecision__FirstPrecisionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8376:1: ( ( RULE_INT ) )
            // InternalPortugolParser.g:8377:2: ( RULE_INT )
            {
            // InternalPortugolParser.g:8377:2: ( RULE_INT )
            // InternalPortugolParser.g:8378:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getFirstPrecisionINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptDecimalPrecisionAccess().getFirstPrecisionINTTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__OptDecimalPrecision__FirstPrecisionAssignment_1"


    // $ANTLR start "rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1"
    // InternalPortugolParser.g:8387:1: rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8391:1: ( ( RULE_INT ) )
            // InternalPortugolParser.g:8392:2: ( RULE_INT )
            {
            // InternalPortugolParser.g:8392:2: ( RULE_INT )
            // InternalPortugolParser.g:8393:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getSecondPrecisionINTTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptDecimalPrecisionAccess().getSecondPrecisionINTTerminalRuleCall_2_1_0()); 
            }

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
    // $ANTLR end "rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1"


    // $ANTLR start "rule__Assignment__OpAssignment_1_0_0_1"
    // InternalPortugolParser.g:8402:1: rule__Assignment__OpAssignment_1_0_0_1 : ( ( LessThanSignHyphenMinus ) ) ;
    public final void rule__Assignment__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8406:1: ( ( ( LessThanSignHyphenMinus ) ) )
            // InternalPortugolParser.g:8407:2: ( ( LessThanSignHyphenMinus ) )
            {
            // InternalPortugolParser.g:8407:2: ( ( LessThanSignHyphenMinus ) )
            // InternalPortugolParser.g:8408:3: ( LessThanSignHyphenMinus )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOpLessThanSignHyphenMinusKeyword_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:8409:3: ( LessThanSignHyphenMinus )
            // InternalPortugolParser.g:8410:4: LessThanSignHyphenMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOpLessThanSignHyphenMinusKeyword_1_0_0_1_0()); 
            }
            match(input,LessThanSignHyphenMinus,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getOpLessThanSignHyphenMinusKeyword_1_0_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getOpLessThanSignHyphenMinusKeyword_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__Assignment__OpAssignment_1_0_0_1"


    // $ANTLR start "rule__Assignment__RightAssignment_1_1"
    // InternalPortugolParser.g:8421:1: rule__Assignment__RightAssignment_1_1 : ( ruleAssignment ) ;
    public final void rule__Assignment__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8425:1: ( ( ruleAssignment ) )
            // InternalPortugolParser.g:8426:2: ( ruleAssignment )
            {
            // InternalPortugolParser.g:8426:2: ( ruleAssignment )
            // InternalPortugolParser.g:8427:3: ruleAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getRightAssignmentParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getRightAssignmentParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__Assignment__RightAssignment_1_1"


    // $ANTLR start "rule__OrExpression__OpAssignment_1_0_0_1"
    // InternalPortugolParser.g:8436:1: rule__OrExpression__OpAssignment_1_0_0_1 : ( ( OU ) ) ;
    public final void rule__OrExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8440:1: ( ( ( OU ) ) )
            // InternalPortugolParser.g:8441:2: ( ( OU ) )
            {
            // InternalPortugolParser.g:8441:2: ( ( OU ) )
            // InternalPortugolParser.g:8442:3: ( OU )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpOUKeyword_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:8443:3: ( OU )
            // InternalPortugolParser.g:8444:4: OU
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpOUKeyword_1_0_0_1_0()); 
            }
            match(input,OU,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOpOUKeyword_1_0_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOpOUKeyword_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__OrExpression__OpAssignment_1_0_0_1"


    // $ANTLR start "rule__OrExpression__RightAssignment_1_1"
    // InternalPortugolParser.g:8455:1: rule__OrExpression__RightAssignment_1_1 : ( ruleXorExpression ) ;
    public final void rule__OrExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8459:1: ( ( ruleXorExpression ) )
            // InternalPortugolParser.g:8460:2: ( ruleXorExpression )
            {
            // InternalPortugolParser.g:8460:2: ( ruleXorExpression )
            // InternalPortugolParser.g:8461:3: ruleXorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightXorExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getRightXorExpressionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__OrExpression__RightAssignment_1_1"


    // $ANTLR start "rule__XorExpression__OpAssignment_1_0_0_1"
    // InternalPortugolParser.g:8470:1: rule__XorExpression__OpAssignment_1_0_0_1 : ( ( XOU ) ) ;
    public final void rule__XorExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8474:1: ( ( ( XOU ) ) )
            // InternalPortugolParser.g:8475:2: ( ( XOU ) )
            {
            // InternalPortugolParser.g:8475:2: ( ( XOU ) )
            // InternalPortugolParser.g:8476:3: ( XOU )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOpXOUKeyword_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:8477:3: ( XOU )
            // InternalPortugolParser.g:8478:4: XOU
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOpXOUKeyword_1_0_0_1_0()); 
            }
            match(input,XOU,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getOpXOUKeyword_1_0_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getOpXOUKeyword_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__XorExpression__OpAssignment_1_0_0_1"


    // $ANTLR start "rule__XorExpression__RightAssignment_1_1"
    // InternalPortugolParser.g:8489:1: rule__XorExpression__RightAssignment_1_1 : ( ruleAndExpression ) ;
    public final void rule__XorExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8493:1: ( ( ruleAndExpression ) )
            // InternalPortugolParser.g:8494:2: ( ruleAndExpression )
            {
            // InternalPortugolParser.g:8494:2: ( ruleAndExpression )
            // InternalPortugolParser.g:8495:3: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__XorExpression__RightAssignment_1_1"


    // $ANTLR start "rule__AndExpression__OpAssignment_1_0_0_1"
    // InternalPortugolParser.g:8504:1: rule__AndExpression__OpAssignment_1_0_0_1 : ( ( rule__AndExpression__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__AndExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8508:1: ( ( ( rule__AndExpression__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugolParser.g:8509:2: ( ( rule__AndExpression__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugolParser.g:8509:2: ( ( rule__AndExpression__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugolParser.g:8510:3: ( rule__AndExpression__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:8511:3: ( rule__AndExpression__OpAlternatives_1_0_0_1_0 )
            // InternalPortugolParser.g:8511:4: rule__AndExpression__OpAlternatives_1_0_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__OpAlternatives_1_0_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__AndExpression__OpAssignment_1_0_0_1"


    // $ANTLR start "rule__AndExpression__RightAssignment_1_1"
    // InternalPortugolParser.g:8519:1: rule__AndExpression__RightAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__AndExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8523:1: ( ( ruleComparison ) )
            // InternalPortugolParser.g:8524:2: ( ruleComparison )
            {
            // InternalPortugolParser.g:8524:2: ( ruleComparison )
            // InternalPortugolParser.g:8525:3: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightComparisonParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getRightComparisonParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__AndExpression__RightAssignment_1_1"


    // $ANTLR start "rule__Comparison__OpAssignment_1_0_0_1"
    // InternalPortugolParser.g:8534:1: rule__Comparison__OpAssignment_1_0_0_1 : ( ( rule__Comparison__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8538:1: ( ( ( rule__Comparison__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugolParser.g:8539:2: ( ( rule__Comparison__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugolParser.g:8539:2: ( ( rule__Comparison__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugolParser.g:8540:3: ( rule__Comparison__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:8541:3: ( rule__Comparison__OpAlternatives_1_0_0_1_0 )
            // InternalPortugolParser.g:8541:4: rule__Comparison__OpAlternatives_1_0_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAlternatives_1_0_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getOpAlternatives_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__Comparison__OpAssignment_1_0_0_1"


    // $ANTLR start "rule__Comparison__RightAssignment_1_1"
    // InternalPortugolParser.g:8549:1: rule__Comparison__RightAssignment_1_1 : ( ruleEquExpression ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8553:1: ( ( ruleEquExpression ) )
            // InternalPortugolParser.g:8554:2: ( ruleEquExpression )
            {
            // InternalPortugolParser.g:8554:2: ( ruleEquExpression )
            // InternalPortugolParser.g:8555:3: ruleEquExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightEquExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEquExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRightEquExpressionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__Comparison__RightAssignment_1_1"


    // $ANTLR start "rule__EquExpression__OpAssignment_1_0_0_1"
    // InternalPortugolParser.g:8564:1: rule__EquExpression__OpAssignment_1_0_0_1 : ( ( rule__EquExpression__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__EquExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8568:1: ( ( ( rule__EquExpression__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugolParser.g:8569:2: ( ( rule__EquExpression__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugolParser.g:8569:2: ( ( rule__EquExpression__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugolParser.g:8570:3: ( rule__EquExpression__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:8571:3: ( rule__EquExpression__OpAlternatives_1_0_0_1_0 )
            // InternalPortugolParser.g:8571:4: rule__EquExpression__OpAlternatives_1_0_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__EquExpression__OpAlternatives_1_0_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__EquExpression__OpAssignment_1_0_0_1"


    // $ANTLR start "rule__EquExpression__RightAssignment_1_1"
    // InternalPortugolParser.g:8579:1: rule__EquExpression__RightAssignment_1_1 : ( ruleAddExpression ) ;
    public final void rule__EquExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8583:1: ( ( ruleAddExpression ) )
            // InternalPortugolParser.g:8584:2: ( ruleAddExpression )
            {
            // InternalPortugolParser.g:8584:2: ( ruleAddExpression )
            // InternalPortugolParser.g:8585:3: ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getRightAddExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAddExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquExpressionAccess().getRightAddExpressionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__EquExpression__RightAssignment_1_1"


    // $ANTLR start "rule__AddExpression__OpAssignment_1_0_0_1"
    // InternalPortugolParser.g:8594:1: rule__AddExpression__OpAssignment_1_0_0_1 : ( ( rule__AddExpression__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__AddExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8598:1: ( ( ( rule__AddExpression__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugolParser.g:8599:2: ( ( rule__AddExpression__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugolParser.g:8599:2: ( ( rule__AddExpression__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugolParser.g:8600:3: ( rule__AddExpression__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:8601:3: ( rule__AddExpression__OpAlternatives_1_0_0_1_0 )
            // InternalPortugolParser.g:8601:4: rule__AddExpression__OpAlternatives_1_0_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AddExpression__OpAlternatives_1_0_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__AddExpression__OpAssignment_1_0_0_1"


    // $ANTLR start "rule__AddExpression__RightAssignment_1_1"
    // InternalPortugolParser.g:8609:1: rule__AddExpression__RightAssignment_1_1 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AddExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8613:1: ( ( ruleMultiplicativeExpression ) )
            // InternalPortugolParser.g:8614:2: ( ruleMultiplicativeExpression )
            {
            // InternalPortugolParser.g:8614:2: ( ruleMultiplicativeExpression )
            // InternalPortugolParser.g:8615:3: ruleMultiplicativeExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__AddExpression__RightAssignment_1_1"


    // $ANTLR start "rule__MultiplicativeExpression__OpAssignment_1_0_0_1"
    // InternalPortugolParser.g:8624:1: rule__MultiplicativeExpression__OpAssignment_1_0_0_1 : ( ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__MultiplicativeExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8628:1: ( ( ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugolParser.g:8629:2: ( ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugolParser.g:8629:2: ( ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugolParser.g:8630:3: ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:8631:3: ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 )
            // InternalPortugolParser.g:8631:4: rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__OpAssignment_1_0_0_1"


    // $ANTLR start "rule__MultiplicativeExpression__RightAssignment_1_1"
    // InternalPortugolParser.g:8639:1: rule__MultiplicativeExpression__RightAssignment_1_1 : ( rulePowerExpression ) ;
    public final void rule__MultiplicativeExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8643:1: ( ( rulePowerExpression ) )
            // InternalPortugolParser.g:8644:2: ( rulePowerExpression )
            {
            // InternalPortugolParser.g:8644:2: ( rulePowerExpression )
            // InternalPortugolParser.g:8645:3: rulePowerExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getRightPowerExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePowerExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getRightPowerExpressionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__RightAssignment_1_1"


    // $ANTLR start "rule__PowerExpression__OpAssignment_1_0_0_1"
    // InternalPortugolParser.g:8654:1: rule__PowerExpression__OpAssignment_1_0_0_1 : ( ( CircumflexAccent ) ) ;
    public final void rule__PowerExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8658:1: ( ( ( CircumflexAccent ) ) )
            // InternalPortugolParser.g:8659:2: ( ( CircumflexAccent ) )
            {
            // InternalPortugolParser.g:8659:2: ( ( CircumflexAccent ) )
            // InternalPortugolParser.g:8660:3: ( CircumflexAccent )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getOpCircumflexAccentKeyword_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:8661:3: ( CircumflexAccent )
            // InternalPortugolParser.g:8662:4: CircumflexAccent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getOpCircumflexAccentKeyword_1_0_0_1_0()); 
            }
            match(input,CircumflexAccent,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerExpressionAccess().getOpCircumflexAccentKeyword_1_0_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerExpressionAccess().getOpCircumflexAccentKeyword_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__PowerExpression__OpAssignment_1_0_0_1"


    // $ANTLR start "rule__PowerExpression__RightAssignment_1_1"
    // InternalPortugolParser.g:8673:1: rule__PowerExpression__RightAssignment_1_1 : ( ruleUnaryExpression ) ;
    public final void rule__PowerExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8677:1: ( ( ruleUnaryExpression ) )
            // InternalPortugolParser.g:8678:2: ( ruleUnaryExpression )
            {
            // InternalPortugolParser.g:8678:2: ( ruleUnaryExpression )
            // InternalPortugolParser.g:8679:3: ruleUnaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getRightUnaryExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerExpressionAccess().getRightUnaryExpressionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__PowerExpression__RightAssignment_1_1"


    // $ANTLR start "rule__UnaryExpression__OpAssignment_0_1"
    // InternalPortugolParser.g:8688:1: rule__UnaryExpression__OpAssignment_0_1 : ( ( rule__UnaryExpression__OpAlternatives_0_1_0 ) ) ;
    public final void rule__UnaryExpression__OpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8692:1: ( ( ( rule__UnaryExpression__OpAlternatives_0_1_0 ) ) )
            // InternalPortugolParser.g:8693:2: ( ( rule__UnaryExpression__OpAlternatives_0_1_0 ) )
            {
            // InternalPortugolParser.g:8693:2: ( ( rule__UnaryExpression__OpAlternatives_0_1_0 ) )
            // InternalPortugolParser.g:8694:3: ( rule__UnaryExpression__OpAlternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOpAlternatives_0_1_0()); 
            }
            // InternalPortugolParser.g:8695:3: ( rule__UnaryExpression__OpAlternatives_0_1_0 )
            // InternalPortugolParser.g:8695:4: rule__UnaryExpression__OpAlternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__OpAlternatives_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOpAlternatives_0_1_0()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__OpAssignment_0_1"


    // $ANTLR start "rule__UnaryExpression__OperandAssignment_0_2"
    // InternalPortugolParser.g:8703:1: rule__UnaryExpression__OperandAssignment_0_2 : ( ruleUnaryExpression ) ;
    public final void rule__UnaryExpression__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8707:1: ( ( ruleUnaryExpression ) )
            // InternalPortugolParser.g:8708:2: ( ruleUnaryExpression )
            {
            // InternalPortugolParser.g:8708:2: ( ruleUnaryExpression )
            // InternalPortugolParser.g:8709:3: ruleUnaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperandUnaryExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOperandUnaryExpressionParserRuleCall_0_2_0()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__OperandAssignment_0_2"


    // $ANTLR start "rule__PreDefinedFunctionCall__PreDefFunctionNameAssignment_0"
    // InternalPortugolParser.g:8718:1: rule__PreDefinedFunctionCall__PreDefFunctionNameAssignment_0 : ( rulePredefineFunctions ) ;
    public final void rule__PreDefinedFunctionCall__PreDefFunctionNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8722:1: ( ( rulePredefineFunctions ) )
            // InternalPortugolParser.g:8723:2: ( rulePredefineFunctions )
            {
            // InternalPortugolParser.g:8723:2: ( rulePredefineFunctions )
            // InternalPortugolParser.g:8724:3: rulePredefineFunctions
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreDefinedFunctionCallAccess().getPreDefFunctionNamePredefineFunctionsParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePredefineFunctions();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreDefinedFunctionCallAccess().getPreDefFunctionNamePredefineFunctionsParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__PreDefinedFunctionCall__PreDefFunctionNameAssignment_0"


    // $ANTLR start "rule__PreDefinedFunctionCall__ParamAssignment_2"
    // InternalPortugolParser.g:8733:1: rule__PreDefinedFunctionCall__ParamAssignment_2 : ( ruleSubprogramParam ) ;
    public final void rule__PreDefinedFunctionCall__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8737:1: ( ( ruleSubprogramParam ) )
            // InternalPortugolParser.g:8738:2: ( ruleSubprogramParam )
            {
            // InternalPortugolParser.g:8738:2: ( ruleSubprogramParam )
            // InternalPortugolParser.g:8739:3: ruleSubprogramParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreDefinedFunctionCallAccess().getParamSubprogramParamParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSubprogramParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreDefinedFunctionCallAccess().getParamSubprogramParamParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__PreDefinedFunctionCall__ParamAssignment_2"


    // $ANTLR start "rule__FunctionCall__FbNameAssignment_0"
    // InternalPortugolParser.g:8748:1: rule__FunctionCall__FbNameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__FbNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8752:1: ( ( ( RULE_ID ) ) )
            // InternalPortugolParser.g:8753:2: ( ( RULE_ID ) )
            {
            // InternalPortugolParser.g:8753:2: ( ( RULE_ID ) )
            // InternalPortugolParser.g:8754:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFbNameFunctionNameCrossReference_0_0()); 
            }
            // InternalPortugolParser.g:8755:3: ( RULE_ID )
            // InternalPortugolParser.g:8756:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFbNameFunctionNameIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getFbNameFunctionNameIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getFbNameFunctionNameCrossReference_0_0()); 
            }

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
    // $ANTLR end "rule__FunctionCall__FbNameAssignment_0"


    // $ANTLR start "rule__FunctionCall__ParamAssignment_2"
    // InternalPortugolParser.g:8767:1: rule__FunctionCall__ParamAssignment_2 : ( ruleSubprogramParam ) ;
    public final void rule__FunctionCall__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8771:1: ( ( ruleSubprogramParam ) )
            // InternalPortugolParser.g:8772:2: ( ruleSubprogramParam )
            {
            // InternalPortugolParser.g:8772:2: ( ruleSubprogramParam )
            // InternalPortugolParser.g:8773:3: ruleSubprogramParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParamSubprogramParamParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSubprogramParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParamSubprogramParamParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__FunctionCall__ParamAssignment_2"


    // $ANTLR start "rule__DeclaredVar__VarNameAssignment"
    // InternalPortugolParser.g:8782:1: rule__DeclaredVar__VarNameAssignment : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredVar__VarNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8786:1: ( ( ( RULE_ID ) ) )
            // InternalPortugolParser.g:8787:2: ( ( RULE_ID ) )
            {
            // InternalPortugolParser.g:8787:2: ( ( RULE_ID ) )
            // InternalPortugolParser.g:8788:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getVarNameVarNameCrossReference_0()); 
            }
            // InternalPortugolParser.g:8789:3: ( RULE_ID )
            // InternalPortugolParser.g:8790:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getVarNameVarNameIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredVarAccess().getVarNameVarNameIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredVarAccess().getVarNameVarNameCrossReference_0()); 
            }

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
    // $ANTLR end "rule__DeclaredVar__VarNameAssignment"


    // $ANTLR start "rule__NumericLiteral__IntValueAssignment_0"
    // InternalPortugolParser.g:8801:1: rule__NumericLiteral__IntValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__NumericLiteral__IntValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8805:1: ( ( RULE_INT ) )
            // InternalPortugolParser.g:8806:2: ( RULE_INT )
            {
            // InternalPortugolParser.g:8806:2: ( RULE_INT )
            // InternalPortugolParser.g:8807:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericLiteralAccess().getIntValueINTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericLiteralAccess().getIntValueINTTerminalRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__NumericLiteral__IntValueAssignment_0"


    // $ANTLR start "rule__NumericLiteral__FloatValueAssignment_1"
    // InternalPortugolParser.g:8816:1: rule__NumericLiteral__FloatValueAssignment_1 : ( RULE_FLOAT ) ;
    public final void rule__NumericLiteral__FloatValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8820:1: ( ( RULE_FLOAT ) )
            // InternalPortugolParser.g:8821:2: ( RULE_FLOAT )
            {
            // InternalPortugolParser.g:8821:2: ( RULE_FLOAT )
            // InternalPortugolParser.g:8822:3: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericLiteralAccess().getFloatValueFLOATTerminalRuleCall_1_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericLiteralAccess().getFloatValueFLOATTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__NumericLiteral__FloatValueAssignment_1"


    // $ANTLR start "rule__StringExpression__LiteralStringAssignment"
    // InternalPortugolParser.g:8831:1: rule__StringExpression__LiteralStringAssignment : ( RULE_STRING ) ;
    public final void rule__StringExpression__LiteralStringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8835:1: ( ( RULE_STRING ) )
            // InternalPortugolParser.g:8836:2: ( RULE_STRING )
            {
            // InternalPortugolParser.g:8836:2: ( RULE_STRING )
            // InternalPortugolParser.g:8837:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringExpressionAccess().getLiteralStringSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringExpressionAccess().getLiteralStringSTRINGTerminalRuleCall_0()); 
            }

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
    // $ANTLR end "rule__StringExpression__LiteralStringAssignment"

    // $ANTLR start synpred65_InternalPortugolParser
    public final void synpred65_InternalPortugolParser_fragment() throws RecognitionException {   
        // InternalPortugolParser.g:5447:3: ( rule__Assignment__Group_1__0 )
        // InternalPortugolParser.g:5447:3: rule__Assignment__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Assignment__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_InternalPortugolParser

    // Delegated rules

    public final boolean synpred65_InternalPortugolParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_InternalPortugolParser_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000040000C00040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000002000104800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x042600988F278200L,0x0000000000000078L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x042600988F278202L,0x0000000000000078L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x042200808D000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0010000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x8000200000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x8000200000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x4000500000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x4000500000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0500000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0500000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0888004000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0888004000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0400008000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0002000000000000L});

}