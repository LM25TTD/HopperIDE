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


    // $ANTLR start "entryRuleSubprogramParamDeclaration"
    // InternalPortugolParser.g:476:1: entryRuleSubprogramParamDeclaration : ruleSubprogramParamDeclaration EOF ;
    public final void entryRuleSubprogramParamDeclaration() throws RecognitionException {
        try {
            // InternalPortugolParser.g:477:1: ( ruleSubprogramParamDeclaration EOF )
            // InternalPortugolParser.g:478:1: ruleSubprogramParamDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSubprogramParamDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubprogramParamDeclarationRule()); 
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
    // $ANTLR end "entryRuleSubprogramParamDeclaration"


    // $ANTLR start "ruleSubprogramParamDeclaration"
    // InternalPortugolParser.g:485:1: ruleSubprogramParamDeclaration : ( ( rule__SubprogramParamDeclaration__Group__0 ) ) ;
    public final void ruleSubprogramParamDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:489:2: ( ( ( rule__SubprogramParamDeclaration__Group__0 ) ) )
            // InternalPortugolParser.g:490:2: ( ( rule__SubprogramParamDeclaration__Group__0 ) )
            {
            // InternalPortugolParser.g:490:2: ( ( rule__SubprogramParamDeclaration__Group__0 ) )
            // InternalPortugolParser.g:491:3: ( rule__SubprogramParamDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamDeclarationAccess().getGroup()); 
            }
            // InternalPortugolParser.g:492:3: ( rule__SubprogramParamDeclaration__Group__0 )
            // InternalPortugolParser.g:492:4: rule__SubprogramParamDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubprogramParamDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubprogramParamDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubprogramParamDeclaration"


    // $ANTLR start "entryRuleBlockCommand"
    // InternalPortugolParser.g:501:1: entryRuleBlockCommand : ruleBlockCommand EOF ;
    public final void entryRuleBlockCommand() throws RecognitionException {
        try {
            // InternalPortugolParser.g:502:1: ( ruleBlockCommand EOF )
            // InternalPortugolParser.g:503:1: ruleBlockCommand EOF
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
    // InternalPortugolParser.g:510:1: ruleBlockCommand : ( ( rule__BlockCommand__Group__0 ) ) ;
    public final void ruleBlockCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:514:2: ( ( ( rule__BlockCommand__Group__0 ) ) )
            // InternalPortugolParser.g:515:2: ( ( rule__BlockCommand__Group__0 ) )
            {
            // InternalPortugolParser.g:515:2: ( ( rule__BlockCommand__Group__0 ) )
            // InternalPortugolParser.g:516:3: ( rule__BlockCommand__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getGroup()); 
            }
            // InternalPortugolParser.g:517:3: ( rule__BlockCommand__Group__0 )
            // InternalPortugolParser.g:517:4: rule__BlockCommand__Group__0
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
    // InternalPortugolParser.g:526:1: entryRuleAbstractCommand : ruleAbstractCommand EOF ;
    public final void entryRuleAbstractCommand() throws RecognitionException {
        try {
            // InternalPortugolParser.g:527:1: ( ruleAbstractCommand EOF )
            // InternalPortugolParser.g:528:1: ruleAbstractCommand EOF
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
    // InternalPortugolParser.g:535:1: ruleAbstractCommand : ( ( rule__AbstractCommand__Alternatives ) ) ;
    public final void ruleAbstractCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:539:2: ( ( ( rule__AbstractCommand__Alternatives ) ) )
            // InternalPortugolParser.g:540:2: ( ( rule__AbstractCommand__Alternatives ) )
            {
            // InternalPortugolParser.g:540:2: ( ( rule__AbstractCommand__Alternatives ) )
            // InternalPortugolParser.g:541:3: ( rule__AbstractCommand__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractCommandAccess().getAlternatives()); 
            }
            // InternalPortugolParser.g:542:3: ( rule__AbstractCommand__Alternatives )
            // InternalPortugolParser.g:542:4: rule__AbstractCommand__Alternatives
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
    // InternalPortugolParser.g:551:1: entryRuleBreakStatement : ruleBreakStatement EOF ;
    public final void entryRuleBreakStatement() throws RecognitionException {
        try {
            // InternalPortugolParser.g:552:1: ( ruleBreakStatement EOF )
            // InternalPortugolParser.g:553:1: ruleBreakStatement EOF
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
    // InternalPortugolParser.g:560:1: ruleBreakStatement : ( ( rule__BreakStatement__Group__0 ) ) ;
    public final void ruleBreakStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:564:2: ( ( ( rule__BreakStatement__Group__0 ) ) )
            // InternalPortugolParser.g:565:2: ( ( rule__BreakStatement__Group__0 ) )
            {
            // InternalPortugolParser.g:565:2: ( ( rule__BreakStatement__Group__0 ) )
            // InternalPortugolParser.g:566:3: ( rule__BreakStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakStatementAccess().getGroup()); 
            }
            // InternalPortugolParser.g:567:3: ( rule__BreakStatement__Group__0 )
            // InternalPortugolParser.g:567:4: rule__BreakStatement__Group__0
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
    // InternalPortugolParser.g:576:1: entryRuleReturnStatement : ruleReturnStatement EOF ;
    public final void entryRuleReturnStatement() throws RecognitionException {
        try {
            // InternalPortugolParser.g:577:1: ( ruleReturnStatement EOF )
            // InternalPortugolParser.g:578:1: ruleReturnStatement EOF
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
    // InternalPortugolParser.g:585:1: ruleReturnStatement : ( ( rule__ReturnStatement__Group__0 ) ) ;
    public final void ruleReturnStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:589:2: ( ( ( rule__ReturnStatement__Group__0 ) ) )
            // InternalPortugolParser.g:590:2: ( ( rule__ReturnStatement__Group__0 ) )
            {
            // InternalPortugolParser.g:590:2: ( ( rule__ReturnStatement__Group__0 ) )
            // InternalPortugolParser.g:591:3: ( rule__ReturnStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getGroup()); 
            }
            // InternalPortugolParser.g:592:3: ( rule__ReturnStatement__Group__0 )
            // InternalPortugolParser.g:592:4: rule__ReturnStatement__Group__0
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
    // InternalPortugolParser.g:601:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalPortugolParser.g:602:1: ( ruleIfStatement EOF )
            // InternalPortugolParser.g:603:1: ruleIfStatement EOF
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
    // InternalPortugolParser.g:610:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:614:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalPortugolParser.g:615:2: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalPortugolParser.g:615:2: ( ( rule__IfStatement__Group__0 ) )
            // InternalPortugolParser.g:616:3: ( rule__IfStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup()); 
            }
            // InternalPortugolParser.g:617:3: ( rule__IfStatement__Group__0 )
            // InternalPortugolParser.g:617:4: rule__IfStatement__Group__0
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
    // InternalPortugolParser.g:626:1: entryRuleSwitchCaseStatement : ruleSwitchCaseStatement EOF ;
    public final void entryRuleSwitchCaseStatement() throws RecognitionException {
        try {
            // InternalPortugolParser.g:627:1: ( ruleSwitchCaseStatement EOF )
            // InternalPortugolParser.g:628:1: ruleSwitchCaseStatement EOF
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
    // InternalPortugolParser.g:635:1: ruleSwitchCaseStatement : ( ( rule__SwitchCaseStatement__Group__0 ) ) ;
    public final void ruleSwitchCaseStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:639:2: ( ( ( rule__SwitchCaseStatement__Group__0 ) ) )
            // InternalPortugolParser.g:640:2: ( ( rule__SwitchCaseStatement__Group__0 ) )
            {
            // InternalPortugolParser.g:640:2: ( ( rule__SwitchCaseStatement__Group__0 ) )
            // InternalPortugolParser.g:641:3: ( rule__SwitchCaseStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getGroup()); 
            }
            // InternalPortugolParser.g:642:3: ( rule__SwitchCaseStatement__Group__0 )
            // InternalPortugolParser.g:642:4: rule__SwitchCaseStatement__Group__0
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
    // InternalPortugolParser.g:651:1: entryRuleCaseList : ruleCaseList EOF ;
    public final void entryRuleCaseList() throws RecognitionException {
        try {
            // InternalPortugolParser.g:652:1: ( ruleCaseList EOF )
            // InternalPortugolParser.g:653:1: ruleCaseList EOF
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
    // InternalPortugolParser.g:660:1: ruleCaseList : ( ( rule__CaseList__Group__0 ) ) ;
    public final void ruleCaseList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:664:2: ( ( ( rule__CaseList__Group__0 ) ) )
            // InternalPortugolParser.g:665:2: ( ( rule__CaseList__Group__0 ) )
            {
            // InternalPortugolParser.g:665:2: ( ( rule__CaseList__Group__0 ) )
            // InternalPortugolParser.g:666:3: ( rule__CaseList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getGroup()); 
            }
            // InternalPortugolParser.g:667:3: ( rule__CaseList__Group__0 )
            // InternalPortugolParser.g:667:4: rule__CaseList__Group__0
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
    // InternalPortugolParser.g:676:1: entryRuleOtherCase : ruleOtherCase EOF ;
    public final void entryRuleOtherCase() throws RecognitionException {
        try {
            // InternalPortugolParser.g:677:1: ( ruleOtherCase EOF )
            // InternalPortugolParser.g:678:1: ruleOtherCase EOF
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
    // InternalPortugolParser.g:685:1: ruleOtherCase : ( ( rule__OtherCase__Group__0 ) ) ;
    public final void ruleOtherCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:689:2: ( ( ( rule__OtherCase__Group__0 ) ) )
            // InternalPortugolParser.g:690:2: ( ( rule__OtherCase__Group__0 ) )
            {
            // InternalPortugolParser.g:690:2: ( ( rule__OtherCase__Group__0 ) )
            // InternalPortugolParser.g:691:3: ( rule__OtherCase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getGroup()); 
            }
            // InternalPortugolParser.g:692:3: ( rule__OtherCase__Group__0 )
            // InternalPortugolParser.g:692:4: rule__OtherCase__Group__0
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
    // InternalPortugolParser.g:701:1: entryRuleForStatement : ruleForStatement EOF ;
    public final void entryRuleForStatement() throws RecognitionException {
        try {
            // InternalPortugolParser.g:702:1: ( ruleForStatement EOF )
            // InternalPortugolParser.g:703:1: ruleForStatement EOF
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
    // InternalPortugolParser.g:710:1: ruleForStatement : ( ( rule__ForStatement__Group__0 ) ) ;
    public final void ruleForStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:714:2: ( ( ( rule__ForStatement__Group__0 ) ) )
            // InternalPortugolParser.g:715:2: ( ( rule__ForStatement__Group__0 ) )
            {
            // InternalPortugolParser.g:715:2: ( ( rule__ForStatement__Group__0 ) )
            // InternalPortugolParser.g:716:3: ( rule__ForStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getGroup()); 
            }
            // InternalPortugolParser.g:717:3: ( rule__ForStatement__Group__0 )
            // InternalPortugolParser.g:717:4: rule__ForStatement__Group__0
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
    // InternalPortugolParser.g:726:1: entryRuleWhileStatement : ruleWhileStatement EOF ;
    public final void entryRuleWhileStatement() throws RecognitionException {
        try {
            // InternalPortugolParser.g:727:1: ( ruleWhileStatement EOF )
            // InternalPortugolParser.g:728:1: ruleWhileStatement EOF
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
    // InternalPortugolParser.g:735:1: ruleWhileStatement : ( ( rule__WhileStatement__Group__0 ) ) ;
    public final void ruleWhileStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:739:2: ( ( ( rule__WhileStatement__Group__0 ) ) )
            // InternalPortugolParser.g:740:2: ( ( rule__WhileStatement__Group__0 ) )
            {
            // InternalPortugolParser.g:740:2: ( ( rule__WhileStatement__Group__0 ) )
            // InternalPortugolParser.g:741:3: ( rule__WhileStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getGroup()); 
            }
            // InternalPortugolParser.g:742:3: ( rule__WhileStatement__Group__0 )
            // InternalPortugolParser.g:742:4: rule__WhileStatement__Group__0
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
    // InternalPortugolParser.g:751:1: entryRuleRepeatStatement : ruleRepeatStatement EOF ;
    public final void entryRuleRepeatStatement() throws RecognitionException {
        try {
            // InternalPortugolParser.g:752:1: ( ruleRepeatStatement EOF )
            // InternalPortugolParser.g:753:1: ruleRepeatStatement EOF
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
    // InternalPortugolParser.g:760:1: ruleRepeatStatement : ( ( rule__RepeatStatement__Group__0 ) ) ;
    public final void ruleRepeatStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:764:2: ( ( ( rule__RepeatStatement__Group__0 ) ) )
            // InternalPortugolParser.g:765:2: ( ( rule__RepeatStatement__Group__0 ) )
            {
            // InternalPortugolParser.g:765:2: ( ( rule__RepeatStatement__Group__0 ) )
            // InternalPortugolParser.g:766:3: ( rule__RepeatStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatStatementAccess().getGroup()); 
            }
            // InternalPortugolParser.g:767:3: ( rule__RepeatStatement__Group__0 )
            // InternalPortugolParser.g:767:4: rule__RepeatStatement__Group__0
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
    // InternalPortugolParser.g:776:1: entryRuleSubprogramParam : ruleSubprogramParam EOF ;
    public final void entryRuleSubprogramParam() throws RecognitionException {
        try {
            // InternalPortugolParser.g:777:1: ( ruleSubprogramParam EOF )
            // InternalPortugolParser.g:778:1: ruleSubprogramParam EOF
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
    // InternalPortugolParser.g:785:1: ruleSubprogramParam : ( ( rule__SubprogramParam__Group__0 ) ) ;
    public final void ruleSubprogramParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:789:2: ( ( ( rule__SubprogramParam__Group__0 ) ) )
            // InternalPortugolParser.g:790:2: ( ( rule__SubprogramParam__Group__0 ) )
            {
            // InternalPortugolParser.g:790:2: ( ( rule__SubprogramParam__Group__0 ) )
            // InternalPortugolParser.g:791:3: ( rule__SubprogramParam__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamAccess().getGroup()); 
            }
            // InternalPortugolParser.g:792:3: ( rule__SubprogramParam__Group__0 )
            // InternalPortugolParser.g:792:4: rule__SubprogramParam__Group__0
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
    // InternalPortugolParser.g:801:1: entryRuleReadCommand : ruleReadCommand EOF ;
    public final void entryRuleReadCommand() throws RecognitionException {
        try {
            // InternalPortugolParser.g:802:1: ( ruleReadCommand EOF )
            // InternalPortugolParser.g:803:1: ruleReadCommand EOF
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
    // InternalPortugolParser.g:810:1: ruleReadCommand : ( ( rule__ReadCommand__Group__0 ) ) ;
    public final void ruleReadCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:814:2: ( ( ( rule__ReadCommand__Group__0 ) ) )
            // InternalPortugolParser.g:815:2: ( ( rule__ReadCommand__Group__0 ) )
            {
            // InternalPortugolParser.g:815:2: ( ( rule__ReadCommand__Group__0 ) )
            // InternalPortugolParser.g:816:3: ( rule__ReadCommand__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getGroup()); 
            }
            // InternalPortugolParser.g:817:3: ( rule__ReadCommand__Group__0 )
            // InternalPortugolParser.g:817:4: rule__ReadCommand__Group__0
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
    // InternalPortugolParser.g:826:1: entryRuleWriteCommand : ruleWriteCommand EOF ;
    public final void entryRuleWriteCommand() throws RecognitionException {
        try {
            // InternalPortugolParser.g:827:1: ( ruleWriteCommand EOF )
            // InternalPortugolParser.g:828:1: ruleWriteCommand EOF
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
    // InternalPortugolParser.g:835:1: ruleWriteCommand : ( ( rule__WriteCommand__Group__0 ) ) ;
    public final void ruleWriteCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:839:2: ( ( ( rule__WriteCommand__Group__0 ) ) )
            // InternalPortugolParser.g:840:2: ( ( rule__WriteCommand__Group__0 ) )
            {
            // InternalPortugolParser.g:840:2: ( ( rule__WriteCommand__Group__0 ) )
            // InternalPortugolParser.g:841:3: ( rule__WriteCommand__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getGroup()); 
            }
            // InternalPortugolParser.g:842:3: ( rule__WriteCommand__Group__0 )
            // InternalPortugolParser.g:842:4: rule__WriteCommand__Group__0
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
    // InternalPortugolParser.g:851:1: entryRuleWriteParam : ruleWriteParam EOF ;
    public final void entryRuleWriteParam() throws RecognitionException {
        try {
            // InternalPortugolParser.g:852:1: ( ruleWriteParam EOF )
            // InternalPortugolParser.g:853:1: ruleWriteParam EOF
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
    // InternalPortugolParser.g:860:1: ruleWriteParam : ( ( rule__WriteParam__Group__0 ) ) ;
    public final void ruleWriteParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:864:2: ( ( ( rule__WriteParam__Group__0 ) ) )
            // InternalPortugolParser.g:865:2: ( ( rule__WriteParam__Group__0 ) )
            {
            // InternalPortugolParser.g:865:2: ( ( rule__WriteParam__Group__0 ) )
            // InternalPortugolParser.g:866:3: ( rule__WriteParam__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getGroup()); 
            }
            // InternalPortugolParser.g:867:3: ( rule__WriteParam__Group__0 )
            // InternalPortugolParser.g:867:4: rule__WriteParam__Group__0
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
    // InternalPortugolParser.g:876:1: entryRuleOptDecimalPrecision : ruleOptDecimalPrecision EOF ;
    public final void entryRuleOptDecimalPrecision() throws RecognitionException {
        try {
            // InternalPortugolParser.g:877:1: ( ruleOptDecimalPrecision EOF )
            // InternalPortugolParser.g:878:1: ruleOptDecimalPrecision EOF
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
    // InternalPortugolParser.g:885:1: ruleOptDecimalPrecision : ( ( rule__OptDecimalPrecision__Group__0 ) ) ;
    public final void ruleOptDecimalPrecision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:889:2: ( ( ( rule__OptDecimalPrecision__Group__0 ) ) )
            // InternalPortugolParser.g:890:2: ( ( rule__OptDecimalPrecision__Group__0 ) )
            {
            // InternalPortugolParser.g:890:2: ( ( rule__OptDecimalPrecision__Group__0 ) )
            // InternalPortugolParser.g:891:3: ( rule__OptDecimalPrecision__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:892:3: ( rule__OptDecimalPrecision__Group__0 )
            // InternalPortugolParser.g:892:4: rule__OptDecimalPrecision__Group__0
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
    // InternalPortugolParser.g:901:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:902:1: ( ruleExpression EOF )
            // InternalPortugolParser.g:903:1: ruleExpression EOF
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
    // InternalPortugolParser.g:910:1: ruleExpression : ( ruleAssignment ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:914:2: ( ( ruleAssignment ) )
            // InternalPortugolParser.g:915:2: ( ruleAssignment )
            {
            // InternalPortugolParser.g:915:2: ( ruleAssignment )
            // InternalPortugolParser.g:916:3: ruleAssignment
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
    // InternalPortugolParser.g:926:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalPortugolParser.g:927:1: ( ruleAssignment EOF )
            // InternalPortugolParser.g:928:1: ruleAssignment EOF
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
    // InternalPortugolParser.g:935:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:939:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalPortugolParser.g:940:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalPortugolParser.g:940:2: ( ( rule__Assignment__Group__0 ) )
            // InternalPortugolParser.g:941:3: ( rule__Assignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // InternalPortugolParser.g:942:3: ( rule__Assignment__Group__0 )
            // InternalPortugolParser.g:942:4: rule__Assignment__Group__0
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
    // InternalPortugolParser.g:951:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:952:1: ( ruleOrExpression EOF )
            // InternalPortugolParser.g:953:1: ruleOrExpression EOF
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
    // InternalPortugolParser.g:960:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:964:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalPortugolParser.g:965:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalPortugolParser.g:965:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalPortugolParser.g:966:3: ( rule__OrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:967:3: ( rule__OrExpression__Group__0 )
            // InternalPortugolParser.g:967:4: rule__OrExpression__Group__0
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
    // InternalPortugolParser.g:976:1: entryRuleXorExpression : ruleXorExpression EOF ;
    public final void entryRuleXorExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:977:1: ( ruleXorExpression EOF )
            // InternalPortugolParser.g:978:1: ruleXorExpression EOF
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
    // InternalPortugolParser.g:985:1: ruleXorExpression : ( ( rule__XorExpression__Group__0 ) ) ;
    public final void ruleXorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:989:2: ( ( ( rule__XorExpression__Group__0 ) ) )
            // InternalPortugolParser.g:990:2: ( ( rule__XorExpression__Group__0 ) )
            {
            // InternalPortugolParser.g:990:2: ( ( rule__XorExpression__Group__0 ) )
            // InternalPortugolParser.g:991:3: ( rule__XorExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:992:3: ( rule__XorExpression__Group__0 )
            // InternalPortugolParser.g:992:4: rule__XorExpression__Group__0
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
    // InternalPortugolParser.g:1001:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1002:1: ( ruleAndExpression EOF )
            // InternalPortugolParser.g:1003:1: ruleAndExpression EOF
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
    // InternalPortugolParser.g:1010:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1014:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalPortugolParser.g:1015:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalPortugolParser.g:1015:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalPortugolParser.g:1016:3: ( rule__AndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:1017:3: ( rule__AndExpression__Group__0 )
            // InternalPortugolParser.g:1017:4: rule__AndExpression__Group__0
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
    // InternalPortugolParser.g:1026:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1027:1: ( ruleComparison EOF )
            // InternalPortugolParser.g:1028:1: ruleComparison EOF
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
    // InternalPortugolParser.g:1035:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1039:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalPortugolParser.g:1040:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalPortugolParser.g:1040:2: ( ( rule__Comparison__Group__0 ) )
            // InternalPortugolParser.g:1041:3: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // InternalPortugolParser.g:1042:3: ( rule__Comparison__Group__0 )
            // InternalPortugolParser.g:1042:4: rule__Comparison__Group__0
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
    // InternalPortugolParser.g:1051:1: entryRuleEquExpression : ruleEquExpression EOF ;
    public final void entryRuleEquExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1052:1: ( ruleEquExpression EOF )
            // InternalPortugolParser.g:1053:1: ruleEquExpression EOF
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
    // InternalPortugolParser.g:1060:1: ruleEquExpression : ( ( rule__EquExpression__Group__0 ) ) ;
    public final void ruleEquExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1064:2: ( ( ( rule__EquExpression__Group__0 ) ) )
            // InternalPortugolParser.g:1065:2: ( ( rule__EquExpression__Group__0 ) )
            {
            // InternalPortugolParser.g:1065:2: ( ( rule__EquExpression__Group__0 ) )
            // InternalPortugolParser.g:1066:3: ( rule__EquExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:1067:3: ( rule__EquExpression__Group__0 )
            // InternalPortugolParser.g:1067:4: rule__EquExpression__Group__0
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
    // InternalPortugolParser.g:1076:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1077:1: ( ruleAddExpression EOF )
            // InternalPortugolParser.g:1078:1: ruleAddExpression EOF
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
    // InternalPortugolParser.g:1085:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1089:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // InternalPortugolParser.g:1090:2: ( ( rule__AddExpression__Group__0 ) )
            {
            // InternalPortugolParser.g:1090:2: ( ( rule__AddExpression__Group__0 ) )
            // InternalPortugolParser.g:1091:3: ( rule__AddExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:1092:3: ( rule__AddExpression__Group__0 )
            // InternalPortugolParser.g:1092:4: rule__AddExpression__Group__0
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
    // InternalPortugolParser.g:1101:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1102:1: ( ruleMultiplicativeExpression EOF )
            // InternalPortugolParser.g:1103:1: ruleMultiplicativeExpression EOF
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
    // InternalPortugolParser.g:1110:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1114:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // InternalPortugolParser.g:1115:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // InternalPortugolParser.g:1115:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // InternalPortugolParser.g:1116:3: ( rule__MultiplicativeExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:1117:3: ( rule__MultiplicativeExpression__Group__0 )
            // InternalPortugolParser.g:1117:4: rule__MultiplicativeExpression__Group__0
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
    // InternalPortugolParser.g:1126:1: entryRulePowerExpression : rulePowerExpression EOF ;
    public final void entryRulePowerExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1127:1: ( rulePowerExpression EOF )
            // InternalPortugolParser.g:1128:1: rulePowerExpression EOF
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
    // InternalPortugolParser.g:1135:1: rulePowerExpression : ( ( rule__PowerExpression__Group__0 ) ) ;
    public final void rulePowerExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1139:2: ( ( ( rule__PowerExpression__Group__0 ) ) )
            // InternalPortugolParser.g:1140:2: ( ( rule__PowerExpression__Group__0 ) )
            {
            // InternalPortugolParser.g:1140:2: ( ( rule__PowerExpression__Group__0 ) )
            // InternalPortugolParser.g:1141:3: ( rule__PowerExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:1142:3: ( rule__PowerExpression__Group__0 )
            // InternalPortugolParser.g:1142:4: rule__PowerExpression__Group__0
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
    // InternalPortugolParser.g:1151:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1152:1: ( ruleUnaryExpression EOF )
            // InternalPortugolParser.g:1153:1: ruleUnaryExpression EOF
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
    // InternalPortugolParser.g:1160:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1164:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // InternalPortugolParser.g:1165:2: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // InternalPortugolParser.g:1165:2: ( ( rule__UnaryExpression__Alternatives ) )
            // InternalPortugolParser.g:1166:3: ( rule__UnaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            }
            // InternalPortugolParser.g:1167:3: ( rule__UnaryExpression__Alternatives )
            // InternalPortugolParser.g:1167:4: rule__UnaryExpression__Alternatives
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
    // InternalPortugolParser.g:1176:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1177:1: ( rulePrimaryExpression EOF )
            // InternalPortugolParser.g:1178:1: rulePrimaryExpression EOF
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
    // InternalPortugolParser.g:1185:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1189:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalPortugolParser.g:1190:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalPortugolParser.g:1190:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalPortugolParser.g:1191:3: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // InternalPortugolParser.g:1192:3: ( rule__PrimaryExpression__Alternatives )
            // InternalPortugolParser.g:1192:4: rule__PrimaryExpression__Alternatives
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
    // InternalPortugolParser.g:1201:1: entryRulePreDefinedFunctionCall : rulePreDefinedFunctionCall EOF ;
    public final void entryRulePreDefinedFunctionCall() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1202:1: ( rulePreDefinedFunctionCall EOF )
            // InternalPortugolParser.g:1203:1: rulePreDefinedFunctionCall EOF
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
    // InternalPortugolParser.g:1210:1: rulePreDefinedFunctionCall : ( ( rule__PreDefinedFunctionCall__Group__0 ) ) ;
    public final void rulePreDefinedFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1214:2: ( ( ( rule__PreDefinedFunctionCall__Group__0 ) ) )
            // InternalPortugolParser.g:1215:2: ( ( rule__PreDefinedFunctionCall__Group__0 ) )
            {
            // InternalPortugolParser.g:1215:2: ( ( rule__PreDefinedFunctionCall__Group__0 ) )
            // InternalPortugolParser.g:1216:3: ( rule__PreDefinedFunctionCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreDefinedFunctionCallAccess().getGroup()); 
            }
            // InternalPortugolParser.g:1217:3: ( rule__PreDefinedFunctionCall__Group__0 )
            // InternalPortugolParser.g:1217:4: rule__PreDefinedFunctionCall__Group__0
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
    // InternalPortugolParser.g:1226:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1227:1: ( ruleFunctionCall EOF )
            // InternalPortugolParser.g:1228:1: ruleFunctionCall EOF
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
    // InternalPortugolParser.g:1235:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1239:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalPortugolParser.g:1240:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalPortugolParser.g:1240:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalPortugolParser.g:1241:3: ( rule__FunctionCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup()); 
            }
            // InternalPortugolParser.g:1242:3: ( rule__FunctionCall__Group__0 )
            // InternalPortugolParser.g:1242:4: rule__FunctionCall__Group__0
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
    // InternalPortugolParser.g:1251:1: entryRulePredefineFunctions : rulePredefineFunctions EOF ;
    public final void entryRulePredefineFunctions() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1252:1: ( rulePredefineFunctions EOF )
            // InternalPortugolParser.g:1253:1: rulePredefineFunctions EOF
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
    // InternalPortugolParser.g:1260:1: rulePredefineFunctions : ( ( rule__PredefineFunctions__Alternatives ) ) ;
    public final void rulePredefineFunctions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1264:2: ( ( ( rule__PredefineFunctions__Alternatives ) ) )
            // InternalPortugolParser.g:1265:2: ( ( rule__PredefineFunctions__Alternatives ) )
            {
            // InternalPortugolParser.g:1265:2: ( ( rule__PredefineFunctions__Alternatives ) )
            // InternalPortugolParser.g:1266:3: ( rule__PredefineFunctions__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredefineFunctionsAccess().getAlternatives()); 
            }
            // InternalPortugolParser.g:1267:3: ( rule__PredefineFunctions__Alternatives )
            // InternalPortugolParser.g:1267:4: rule__PredefineFunctions__Alternatives
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
    // InternalPortugolParser.g:1276:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1277:1: ( ruleLiteral EOF )
            // InternalPortugolParser.g:1278:1: ruleLiteral EOF
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
    // InternalPortugolParser.g:1285:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1289:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalPortugolParser.g:1290:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalPortugolParser.g:1290:2: ( ( rule__Literal__Alternatives ) )
            // InternalPortugolParser.g:1291:3: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalPortugolParser.g:1292:3: ( rule__Literal__Alternatives )
            // InternalPortugolParser.g:1292:4: rule__Literal__Alternatives
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
    // InternalPortugolParser.g:1301:1: entryRuleDeclaredVar : ruleDeclaredVar EOF ;
    public final void entryRuleDeclaredVar() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1302:1: ( ruleDeclaredVar EOF )
            // InternalPortugolParser.g:1303:1: ruleDeclaredVar EOF
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
    // InternalPortugolParser.g:1310:1: ruleDeclaredVar : ( ( rule__DeclaredVar__VarNameAssignment ) ) ;
    public final void ruleDeclaredVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1314:2: ( ( ( rule__DeclaredVar__VarNameAssignment ) ) )
            // InternalPortugolParser.g:1315:2: ( ( rule__DeclaredVar__VarNameAssignment ) )
            {
            // InternalPortugolParser.g:1315:2: ( ( rule__DeclaredVar__VarNameAssignment ) )
            // InternalPortugolParser.g:1316:3: ( rule__DeclaredVar__VarNameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getVarNameAssignment()); 
            }
            // InternalPortugolParser.g:1317:3: ( rule__DeclaredVar__VarNameAssignment )
            // InternalPortugolParser.g:1317:4: rule__DeclaredVar__VarNameAssignment
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
    // InternalPortugolParser.g:1326:1: entryRuleNumericLiteral : ruleNumericLiteral EOF ;
    public final void entryRuleNumericLiteral() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1327:1: ( ruleNumericLiteral EOF )
            // InternalPortugolParser.g:1328:1: ruleNumericLiteral EOF
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
    // InternalPortugolParser.g:1335:1: ruleNumericLiteral : ( ( rule__NumericLiteral__Alternatives ) ) ;
    public final void ruleNumericLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1339:2: ( ( ( rule__NumericLiteral__Alternatives ) ) )
            // InternalPortugolParser.g:1340:2: ( ( rule__NumericLiteral__Alternatives ) )
            {
            // InternalPortugolParser.g:1340:2: ( ( rule__NumericLiteral__Alternatives ) )
            // InternalPortugolParser.g:1341:3: ( rule__NumericLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericLiteralAccess().getAlternatives()); 
            }
            // InternalPortugolParser.g:1342:3: ( rule__NumericLiteral__Alternatives )
            // InternalPortugolParser.g:1342:4: rule__NumericLiteral__Alternatives
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
    // InternalPortugolParser.g:1351:1: entryRuleStringExpression : ruleStringExpression EOF ;
    public final void entryRuleStringExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1352:1: ( ruleStringExpression EOF )
            // InternalPortugolParser.g:1353:1: ruleStringExpression EOF
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
    // InternalPortugolParser.g:1360:1: ruleStringExpression : ( ( rule__StringExpression__LiteralStringAssignment ) ) ;
    public final void ruleStringExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1364:2: ( ( ( rule__StringExpression__LiteralStringAssignment ) ) )
            // InternalPortugolParser.g:1365:2: ( ( rule__StringExpression__LiteralStringAssignment ) )
            {
            // InternalPortugolParser.g:1365:2: ( ( rule__StringExpression__LiteralStringAssignment ) )
            // InternalPortugolParser.g:1366:3: ( rule__StringExpression__LiteralStringAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringExpressionAccess().getLiteralStringAssignment()); 
            }
            // InternalPortugolParser.g:1367:3: ( rule__StringExpression__LiteralStringAssignment )
            // InternalPortugolParser.g:1367:4: rule__StringExpression__LiteralStringAssignment
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
    // InternalPortugolParser.g:1376:1: entryRulePiLiteral : rulePiLiteral EOF ;
    public final void entryRulePiLiteral() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1377:1: ( rulePiLiteral EOF )
            // InternalPortugolParser.g:1378:1: rulePiLiteral EOF
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
    // InternalPortugolParser.g:1385:1: rulePiLiteral : ( Pi ) ;
    public final void rulePiLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1389:2: ( ( Pi ) )
            // InternalPortugolParser.g:1390:2: ( Pi )
            {
            // InternalPortugolParser.g:1390:2: ( Pi )
            // InternalPortugolParser.g:1391:3: Pi
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
    // InternalPortugolParser.g:1401:1: entryRuleEND_COMMAND : ruleEND_COMMAND EOF ;
    public final void entryRuleEND_COMMAND() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1402:1: ( ruleEND_COMMAND EOF )
            // InternalPortugolParser.g:1403:1: ruleEND_COMMAND EOF
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
    // InternalPortugolParser.g:1410:1: ruleEND_COMMAND : ( Semicolon ) ;
    public final void ruleEND_COMMAND() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1414:2: ( ( Semicolon ) )
            // InternalPortugolParser.g:1415:2: ( Semicolon )
            {
            // InternalPortugolParser.g:1415:2: ( Semicolon )
            // InternalPortugolParser.g:1416:3: Semicolon
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
    // InternalPortugolParser.g:1425:1: rule__VarType__TypeNameAlternatives_0 : ( ( Real ) | ( Inteiro ) | ( Caractere ) | ( Caracter ) );
    public final void rule__VarType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1429:1: ( ( Real ) | ( Inteiro ) | ( Caractere ) | ( Caracter ) )
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
                    // InternalPortugolParser.g:1430:2: ( Real )
                    {
                    // InternalPortugolParser.g:1430:2: ( Real )
                    // InternalPortugolParser.g:1431:3: Real
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
                    // InternalPortugolParser.g:1436:2: ( Inteiro )
                    {
                    // InternalPortugolParser.g:1436:2: ( Inteiro )
                    // InternalPortugolParser.g:1437:3: Inteiro
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
                    // InternalPortugolParser.g:1442:2: ( Caractere )
                    {
                    // InternalPortugolParser.g:1442:2: ( Caractere )
                    // InternalPortugolParser.g:1443:3: Caractere
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
                    // InternalPortugolParser.g:1448:2: ( Caracter )
                    {
                    // InternalPortugolParser.g:1448:2: ( Caracter )
                    // InternalPortugolParser.g:1449:3: Caracter
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
    // InternalPortugolParser.g:1458:1: rule__BlockSubPrograms__Alternatives : ( ( ruleBlockFunction ) | ( ruleBlockProcedure ) );
    public final void rule__BlockSubPrograms__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1462:1: ( ( ruleBlockFunction ) | ( ruleBlockProcedure ) )
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
                    // InternalPortugolParser.g:1463:2: ( ruleBlockFunction )
                    {
                    // InternalPortugolParser.g:1463:2: ( ruleBlockFunction )
                    // InternalPortugolParser.g:1464:3: ruleBlockFunction
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
                    // InternalPortugolParser.g:1469:2: ( ruleBlockProcedure )
                    {
                    // InternalPortugolParser.g:1469:2: ( ruleBlockProcedure )
                    // InternalPortugolParser.g:1470:3: ruleBlockProcedure
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
    // InternalPortugolParser.g:1479:1: rule__AbstractCommand__Alternatives : ( ( ( rule__AbstractCommand__Group_0__0 ) ) | ( ( rule__AbstractCommand__Group_1__0 ) ) | ( ( rule__AbstractCommand__Group_2__0 ) ) | ( ruleIfStatement ) | ( ruleSwitchCaseStatement ) | ( ruleForStatement ) | ( ruleRepeatStatement ) | ( ruleWhileStatement ) | ( ( rule__AbstractCommand__Group_8__0 ) ) | ( ( rule__AbstractCommand__Group_9__0 ) ) );
    public final void rule__AbstractCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1483:1: ( ( ( rule__AbstractCommand__Group_0__0 ) ) | ( ( rule__AbstractCommand__Group_1__0 ) ) | ( ( rule__AbstractCommand__Group_2__0 ) ) | ( ruleIfStatement ) | ( ruleSwitchCaseStatement ) | ( ruleForStatement ) | ( ruleRepeatStatement ) | ( ruleWhileStatement ) | ( ( rule__AbstractCommand__Group_8__0 ) ) | ( ( rule__AbstractCommand__Group_9__0 ) ) )
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
                    // InternalPortugolParser.g:1484:2: ( ( rule__AbstractCommand__Group_0__0 ) )
                    {
                    // InternalPortugolParser.g:1484:2: ( ( rule__AbstractCommand__Group_0__0 ) )
                    // InternalPortugolParser.g:1485:3: ( rule__AbstractCommand__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_0()); 
                    }
                    // InternalPortugolParser.g:1486:3: ( rule__AbstractCommand__Group_0__0 )
                    // InternalPortugolParser.g:1486:4: rule__AbstractCommand__Group_0__0
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
                    // InternalPortugolParser.g:1490:2: ( ( rule__AbstractCommand__Group_1__0 ) )
                    {
                    // InternalPortugolParser.g:1490:2: ( ( rule__AbstractCommand__Group_1__0 ) )
                    // InternalPortugolParser.g:1491:3: ( rule__AbstractCommand__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_1()); 
                    }
                    // InternalPortugolParser.g:1492:3: ( rule__AbstractCommand__Group_1__0 )
                    // InternalPortugolParser.g:1492:4: rule__AbstractCommand__Group_1__0
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
                    // InternalPortugolParser.g:1496:2: ( ( rule__AbstractCommand__Group_2__0 ) )
                    {
                    // InternalPortugolParser.g:1496:2: ( ( rule__AbstractCommand__Group_2__0 ) )
                    // InternalPortugolParser.g:1497:3: ( rule__AbstractCommand__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_2()); 
                    }
                    // InternalPortugolParser.g:1498:3: ( rule__AbstractCommand__Group_2__0 )
                    // InternalPortugolParser.g:1498:4: rule__AbstractCommand__Group_2__0
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
                    // InternalPortugolParser.g:1502:2: ( ruleIfStatement )
                    {
                    // InternalPortugolParser.g:1502:2: ( ruleIfStatement )
                    // InternalPortugolParser.g:1503:3: ruleIfStatement
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
                    // InternalPortugolParser.g:1508:2: ( ruleSwitchCaseStatement )
                    {
                    // InternalPortugolParser.g:1508:2: ( ruleSwitchCaseStatement )
                    // InternalPortugolParser.g:1509:3: ruleSwitchCaseStatement
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
                    // InternalPortugolParser.g:1514:2: ( ruleForStatement )
                    {
                    // InternalPortugolParser.g:1514:2: ( ruleForStatement )
                    // InternalPortugolParser.g:1515:3: ruleForStatement
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
                    // InternalPortugolParser.g:1520:2: ( ruleRepeatStatement )
                    {
                    // InternalPortugolParser.g:1520:2: ( ruleRepeatStatement )
                    // InternalPortugolParser.g:1521:3: ruleRepeatStatement
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
                    // InternalPortugolParser.g:1526:2: ( ruleWhileStatement )
                    {
                    // InternalPortugolParser.g:1526:2: ( ruleWhileStatement )
                    // InternalPortugolParser.g:1527:3: ruleWhileStatement
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
                    // InternalPortugolParser.g:1532:2: ( ( rule__AbstractCommand__Group_8__0 ) )
                    {
                    // InternalPortugolParser.g:1532:2: ( ( rule__AbstractCommand__Group_8__0 ) )
                    // InternalPortugolParser.g:1533:3: ( rule__AbstractCommand__Group_8__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_8()); 
                    }
                    // InternalPortugolParser.g:1534:3: ( rule__AbstractCommand__Group_8__0 )
                    // InternalPortugolParser.g:1534:4: rule__AbstractCommand__Group_8__0
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
                    // InternalPortugolParser.g:1538:2: ( ( rule__AbstractCommand__Group_9__0 ) )
                    {
                    // InternalPortugolParser.g:1538:2: ( ( rule__AbstractCommand__Group_9__0 ) )
                    // InternalPortugolParser.g:1539:3: ( rule__AbstractCommand__Group_9__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_9()); 
                    }
                    // InternalPortugolParser.g:1540:3: ( rule__AbstractCommand__Group_9__0 )
                    // InternalPortugolParser.g:1540:4: rule__AbstractCommand__Group_9__0
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
    // InternalPortugolParser.g:1548:1: rule__WriteCommand__WriteCommandAlternatives_0_0 : ( ( Escreva ) | ( Escreval ) );
    public final void rule__WriteCommand__WriteCommandAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1552:1: ( ( Escreva ) | ( Escreval ) )
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
                    // InternalPortugolParser.g:1553:2: ( Escreva )
                    {
                    // InternalPortugolParser.g:1553:2: ( Escreva )
                    // InternalPortugolParser.g:1554:3: Escreva
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
                    // InternalPortugolParser.g:1559:2: ( Escreval )
                    {
                    // InternalPortugolParser.g:1559:2: ( Escreval )
                    // InternalPortugolParser.g:1560:3: Escreval
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
    // InternalPortugolParser.g:1569:1: rule__AndExpression__OpAlternatives_1_0_0_1_0 : ( ( Ampersand ) | ( E ) );
    public final void rule__AndExpression__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1573:1: ( ( Ampersand ) | ( E ) )
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
                    // InternalPortugolParser.g:1574:2: ( Ampersand )
                    {
                    // InternalPortugolParser.g:1574:2: ( Ampersand )
                    // InternalPortugolParser.g:1575:3: Ampersand
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
                    // InternalPortugolParser.g:1580:2: ( E )
                    {
                    // InternalPortugolParser.g:1580:2: ( E )
                    // InternalPortugolParser.g:1581:3: E
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
    // InternalPortugolParser.g:1590:1: rule__Comparison__OpAlternatives_1_0_0_1_0 : ( ( EqualsSign ) | ( LessThanSignGreaterThanSign ) );
    public final void rule__Comparison__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1594:1: ( ( EqualsSign ) | ( LessThanSignGreaterThanSign ) )
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
                    // InternalPortugolParser.g:1595:2: ( EqualsSign )
                    {
                    // InternalPortugolParser.g:1595:2: ( EqualsSign )
                    // InternalPortugolParser.g:1596:3: EqualsSign
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
                    // InternalPortugolParser.g:1601:2: ( LessThanSignGreaterThanSign )
                    {
                    // InternalPortugolParser.g:1601:2: ( LessThanSignGreaterThanSign )
                    // InternalPortugolParser.g:1602:3: LessThanSignGreaterThanSign
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
    // InternalPortugolParser.g:1611:1: rule__EquExpression__OpAlternatives_1_0_0_1_0 : ( ( LessThanSign ) | ( GreaterThanSign ) | ( LessThanSignEqualsSign ) | ( GreaterThanSignEqualsSign ) );
    public final void rule__EquExpression__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1615:1: ( ( LessThanSign ) | ( GreaterThanSign ) | ( LessThanSignEqualsSign ) | ( GreaterThanSignEqualsSign ) )
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
                    // InternalPortugolParser.g:1616:2: ( LessThanSign )
                    {
                    // InternalPortugolParser.g:1616:2: ( LessThanSign )
                    // InternalPortugolParser.g:1617:3: LessThanSign
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
                    // InternalPortugolParser.g:1622:2: ( GreaterThanSign )
                    {
                    // InternalPortugolParser.g:1622:2: ( GreaterThanSign )
                    // InternalPortugolParser.g:1623:3: GreaterThanSign
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
                    // InternalPortugolParser.g:1628:2: ( LessThanSignEqualsSign )
                    {
                    // InternalPortugolParser.g:1628:2: ( LessThanSignEqualsSign )
                    // InternalPortugolParser.g:1629:3: LessThanSignEqualsSign
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
                    // InternalPortugolParser.g:1634:2: ( GreaterThanSignEqualsSign )
                    {
                    // InternalPortugolParser.g:1634:2: ( GreaterThanSignEqualsSign )
                    // InternalPortugolParser.g:1635:3: GreaterThanSignEqualsSign
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
    // InternalPortugolParser.g:1644:1: rule__AddExpression__OpAlternatives_1_0_0_1_0 : ( ( PlusSign ) | ( HyphenMinus ) );
    public final void rule__AddExpression__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1648:1: ( ( PlusSign ) | ( HyphenMinus ) )
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
                    // InternalPortugolParser.g:1649:2: ( PlusSign )
                    {
                    // InternalPortugolParser.g:1649:2: ( PlusSign )
                    // InternalPortugolParser.g:1650:3: PlusSign
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
                    // InternalPortugolParser.g:1655:2: ( HyphenMinus )
                    {
                    // InternalPortugolParser.g:1655:2: ( HyphenMinus )
                    // InternalPortugolParser.g:1656:3: HyphenMinus
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
    // InternalPortugolParser.g:1665:1: rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 : ( ( Asterisk ) | ( Solidus ) | ( MOD ) | ( PercentSign ) );
    public final void rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1669:1: ( ( Asterisk ) | ( Solidus ) | ( MOD ) | ( PercentSign ) )
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
                    // InternalPortugolParser.g:1670:2: ( Asterisk )
                    {
                    // InternalPortugolParser.g:1670:2: ( Asterisk )
                    // InternalPortugolParser.g:1671:3: Asterisk
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
                    // InternalPortugolParser.g:1676:2: ( Solidus )
                    {
                    // InternalPortugolParser.g:1676:2: ( Solidus )
                    // InternalPortugolParser.g:1677:3: Solidus
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
                    // InternalPortugolParser.g:1682:2: ( MOD )
                    {
                    // InternalPortugolParser.g:1682:2: ( MOD )
                    // InternalPortugolParser.g:1683:3: MOD
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
                    // InternalPortugolParser.g:1688:2: ( PercentSign )
                    {
                    // InternalPortugolParser.g:1688:2: ( PercentSign )
                    // InternalPortugolParser.g:1689:3: PercentSign
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
    // InternalPortugolParser.g:1698:1: rule__UnaryExpression__Alternatives : ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( rulePrimaryExpression ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1702:1: ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( rulePrimaryExpression ) )
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
                    // InternalPortugolParser.g:1703:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    {
                    // InternalPortugolParser.g:1703:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    // InternalPortugolParser.g:1704:3: ( rule__UnaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    }
                    // InternalPortugolParser.g:1705:3: ( rule__UnaryExpression__Group_0__0 )
                    // InternalPortugolParser.g:1705:4: rule__UnaryExpression__Group_0__0
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
                    // InternalPortugolParser.g:1709:2: ( rulePrimaryExpression )
                    {
                    // InternalPortugolParser.g:1709:2: ( rulePrimaryExpression )
                    // InternalPortugolParser.g:1710:3: rulePrimaryExpression
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
    // InternalPortugolParser.g:1719:1: rule__UnaryExpression__OpAlternatives_0_1_0 : ( ( NOT ) | ( HyphenMinus ) );
    public final void rule__UnaryExpression__OpAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1723:1: ( ( NOT ) | ( HyphenMinus ) )
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
                    // InternalPortugolParser.g:1724:2: ( NOT )
                    {
                    // InternalPortugolParser.g:1724:2: ( NOT )
                    // InternalPortugolParser.g:1725:3: NOT
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
                    // InternalPortugolParser.g:1730:2: ( HyphenMinus )
                    {
                    // InternalPortugolParser.g:1730:2: ( HyphenMinus )
                    // InternalPortugolParser.g:1731:3: HyphenMinus
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
    // InternalPortugolParser.g:1740:1: rule__PrimaryExpression__Alternatives : ( ( ruleLiteral ) | ( rulePreDefinedFunctionCall ) | ( ruleFunctionCall ) | ( ruleDeclaredVar ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1744:1: ( ( ruleLiteral ) | ( rulePreDefinedFunctionCall ) | ( ruleFunctionCall ) | ( ruleDeclaredVar ) | ( ( rule__PrimaryExpression__Group_4__0 ) ) )
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

                if ( (LA13_3==EOF||LA13_3==Entao||LA13_3==Passo||LA13_3==Faca||LA13_3==MOD||(LA13_3>=XOU && LA13_3<=Ate)||(LA13_3>=LessThanSignHyphenMinus && LA13_3<=De)||(LA13_3>=PercentSign && LA13_3<=Ampersand)||(LA13_3>=RightParenthesis && LA13_3<=CircumflexAccent)) ) {
                    alt13=4;
                }
                else if ( (LA13_3==LeftParenthesis) ) {
                    alt13=3;
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
                    // InternalPortugolParser.g:1745:2: ( ruleLiteral )
                    {
                    // InternalPortugolParser.g:1745:2: ( ruleLiteral )
                    // InternalPortugolParser.g:1746:3: ruleLiteral
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
                    // InternalPortugolParser.g:1751:2: ( rulePreDefinedFunctionCall )
                    {
                    // InternalPortugolParser.g:1751:2: ( rulePreDefinedFunctionCall )
                    // InternalPortugolParser.g:1752:3: rulePreDefinedFunctionCall
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
                    // InternalPortugolParser.g:1757:2: ( ruleFunctionCall )
                    {
                    // InternalPortugolParser.g:1757:2: ( ruleFunctionCall )
                    // InternalPortugolParser.g:1758:3: ruleFunctionCall
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
                    // InternalPortugolParser.g:1763:2: ( ruleDeclaredVar )
                    {
                    // InternalPortugolParser.g:1763:2: ( ruleDeclaredVar )
                    // InternalPortugolParser.g:1764:3: ruleDeclaredVar
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
                    // InternalPortugolParser.g:1769:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    {
                    // InternalPortugolParser.g:1769:2: ( ( rule__PrimaryExpression__Group_4__0 ) )
                    // InternalPortugolParser.g:1770:3: ( rule__PrimaryExpression__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_4()); 
                    }
                    // InternalPortugolParser.g:1771:3: ( rule__PrimaryExpression__Group_4__0 )
                    // InternalPortugolParser.g:1771:4: rule__PrimaryExpression__Group_4__0
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
    // InternalPortugolParser.g:1779:1: rule__PredefineFunctions__Alternatives : ( ( Maiusc ) | ( Compr ) | ( Raizq ) | ( Copia ) );
    public final void rule__PredefineFunctions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1783:1: ( ( Maiusc ) | ( Compr ) | ( Raizq ) | ( Copia ) )
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
                    // InternalPortugolParser.g:1784:2: ( Maiusc )
                    {
                    // InternalPortugolParser.g:1784:2: ( Maiusc )
                    // InternalPortugolParser.g:1785:3: Maiusc
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
                    // InternalPortugolParser.g:1790:2: ( Compr )
                    {
                    // InternalPortugolParser.g:1790:2: ( Compr )
                    // InternalPortugolParser.g:1791:3: Compr
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
                    // InternalPortugolParser.g:1796:2: ( Raizq )
                    {
                    // InternalPortugolParser.g:1796:2: ( Raizq )
                    // InternalPortugolParser.g:1797:3: Raizq
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
                    // InternalPortugolParser.g:1802:2: ( Copia )
                    {
                    // InternalPortugolParser.g:1802:2: ( Copia )
                    // InternalPortugolParser.g:1803:3: Copia
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
    // InternalPortugolParser.g:1812:1: rule__Literal__Alternatives : ( ( ( rule__Literal__Group_0__0 ) ) | ( ruleNumericLiteral ) | ( ruleStringExpression ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1816:1: ( ( ( rule__Literal__Group_0__0 ) ) | ( ruleNumericLiteral ) | ( ruleStringExpression ) )
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
                    // InternalPortugolParser.g:1817:2: ( ( rule__Literal__Group_0__0 ) )
                    {
                    // InternalPortugolParser.g:1817:2: ( ( rule__Literal__Group_0__0 ) )
                    // InternalPortugolParser.g:1818:3: ( rule__Literal__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getGroup_0()); 
                    }
                    // InternalPortugolParser.g:1819:3: ( rule__Literal__Group_0__0 )
                    // InternalPortugolParser.g:1819:4: rule__Literal__Group_0__0
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
                    // InternalPortugolParser.g:1823:2: ( ruleNumericLiteral )
                    {
                    // InternalPortugolParser.g:1823:2: ( ruleNumericLiteral )
                    // InternalPortugolParser.g:1824:3: ruleNumericLiteral
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
                    // InternalPortugolParser.g:1829:2: ( ruleStringExpression )
                    {
                    // InternalPortugolParser.g:1829:2: ( ruleStringExpression )
                    // InternalPortugolParser.g:1830:3: ruleStringExpression
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
    // InternalPortugolParser.g:1839:1: rule__NumericLiteral__Alternatives : ( ( ( rule__NumericLiteral__IntValueAssignment_0 ) ) | ( ( rule__NumericLiteral__FloatValueAssignment_1 ) ) );
    public final void rule__NumericLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1843:1: ( ( ( rule__NumericLiteral__IntValueAssignment_0 ) ) | ( ( rule__NumericLiteral__FloatValueAssignment_1 ) ) )
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
                    // InternalPortugolParser.g:1844:2: ( ( rule__NumericLiteral__IntValueAssignment_0 ) )
                    {
                    // InternalPortugolParser.g:1844:2: ( ( rule__NumericLiteral__IntValueAssignment_0 ) )
                    // InternalPortugolParser.g:1845:3: ( rule__NumericLiteral__IntValueAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericLiteralAccess().getIntValueAssignment_0()); 
                    }
                    // InternalPortugolParser.g:1846:3: ( rule__NumericLiteral__IntValueAssignment_0 )
                    // InternalPortugolParser.g:1846:4: rule__NumericLiteral__IntValueAssignment_0
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
                    // InternalPortugolParser.g:1850:2: ( ( rule__NumericLiteral__FloatValueAssignment_1 ) )
                    {
                    // InternalPortugolParser.g:1850:2: ( ( rule__NumericLiteral__FloatValueAssignment_1 ) )
                    // InternalPortugolParser.g:1851:3: ( rule__NumericLiteral__FloatValueAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericLiteralAccess().getFloatValueAssignment_1()); 
                    }
                    // InternalPortugolParser.g:1852:3: ( rule__NumericLiteral__FloatValueAssignment_1 )
                    // InternalPortugolParser.g:1852:4: rule__NumericLiteral__FloatValueAssignment_1
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
    // InternalPortugolParser.g:1860:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1864:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalPortugolParser.g:1865:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalPortugolParser.g:1872:1: rule__Model__Group__0__Impl : ( ( rule__Model__HeaderAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1876:1: ( ( ( rule__Model__HeaderAssignment_0 ) ) )
            // InternalPortugolParser.g:1877:1: ( ( rule__Model__HeaderAssignment_0 ) )
            {
            // InternalPortugolParser.g:1877:1: ( ( rule__Model__HeaderAssignment_0 ) )
            // InternalPortugolParser.g:1878:2: ( rule__Model__HeaderAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getHeaderAssignment_0()); 
            }
            // InternalPortugolParser.g:1879:2: ( rule__Model__HeaderAssignment_0 )
            // InternalPortugolParser.g:1879:3: rule__Model__HeaderAssignment_0
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
    // InternalPortugolParser.g:1887:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1891:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalPortugolParser.g:1892:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalPortugolParser.g:1899:1: rule__Model__Group__1__Impl : ( ( rule__Model__GlobalDeclarationsAssignment_1 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1903:1: ( ( ( rule__Model__GlobalDeclarationsAssignment_1 )? ) )
            // InternalPortugolParser.g:1904:1: ( ( rule__Model__GlobalDeclarationsAssignment_1 )? )
            {
            // InternalPortugolParser.g:1904:1: ( ( rule__Model__GlobalDeclarationsAssignment_1 )? )
            // InternalPortugolParser.g:1905:2: ( rule__Model__GlobalDeclarationsAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGlobalDeclarationsAssignment_1()); 
            }
            // InternalPortugolParser.g:1906:2: ( rule__Model__GlobalDeclarationsAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Var) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPortugolParser.g:1906:3: rule__Model__GlobalDeclarationsAssignment_1
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
    // InternalPortugolParser.g:1914:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1918:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalPortugolParser.g:1919:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalPortugolParser.g:1926:1: rule__Model__Group__2__Impl : ( ( rule__Model__SubprogramsAssignment_2 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1930:1: ( ( ( rule__Model__SubprogramsAssignment_2 )? ) )
            // InternalPortugolParser.g:1931:1: ( ( rule__Model__SubprogramsAssignment_2 )? )
            {
            // InternalPortugolParser.g:1931:1: ( ( rule__Model__SubprogramsAssignment_2 )? )
            // InternalPortugolParser.g:1932:2: ( rule__Model__SubprogramsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSubprogramsAssignment_2()); 
            }
            // InternalPortugolParser.g:1933:2: ( rule__Model__SubprogramsAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Procedimento||LA18_0==Funcao) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPortugolParser.g:1933:3: rule__Model__SubprogramsAssignment_2
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
    // InternalPortugolParser.g:1941:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1945:1: ( rule__Model__Group__3__Impl )
            // InternalPortugolParser.g:1946:2: rule__Model__Group__3__Impl
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
    // InternalPortugolParser.g:1952:1: rule__Model__Group__3__Impl : ( ( rule__Model__CommandsAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1956:1: ( ( ( rule__Model__CommandsAssignment_3 ) ) )
            // InternalPortugolParser.g:1957:1: ( ( rule__Model__CommandsAssignment_3 ) )
            {
            // InternalPortugolParser.g:1957:1: ( ( rule__Model__CommandsAssignment_3 ) )
            // InternalPortugolParser.g:1958:2: ( rule__Model__CommandsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugolParser.g:1959:2: ( rule__Model__CommandsAssignment_3 )
            // InternalPortugolParser.g:1959:3: rule__Model__CommandsAssignment_3
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
    // InternalPortugolParser.g:1968:1: rule__HeaderBlock__Group__0 : rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1 ;
    public final void rule__HeaderBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1972:1: ( rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1 )
            // InternalPortugolParser.g:1973:2: rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1
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
    // InternalPortugolParser.g:1980:1: rule__HeaderBlock__Group__0__Impl : ( Algoritmo ) ;
    public final void rule__HeaderBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1984:1: ( ( Algoritmo ) )
            // InternalPortugolParser.g:1985:1: ( Algoritmo )
            {
            // InternalPortugolParser.g:1985:1: ( Algoritmo )
            // InternalPortugolParser.g:1986:2: Algoritmo
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
    // InternalPortugolParser.g:1995:1: rule__HeaderBlock__Group__1 : rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2 ;
    public final void rule__HeaderBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1999:1: ( rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2 )
            // InternalPortugolParser.g:2000:2: rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2
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
    // InternalPortugolParser.g:2007:1: rule__HeaderBlock__Group__1__Impl : ( ( rule__HeaderBlock__AlgorithmNameAssignment_1 ) ) ;
    public final void rule__HeaderBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2011:1: ( ( ( rule__HeaderBlock__AlgorithmNameAssignment_1 ) ) )
            // InternalPortugolParser.g:2012:1: ( ( rule__HeaderBlock__AlgorithmNameAssignment_1 ) )
            {
            // InternalPortugolParser.g:2012:1: ( ( rule__HeaderBlock__AlgorithmNameAssignment_1 ) )
            // InternalPortugolParser.g:2013:2: ( rule__HeaderBlock__AlgorithmNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderBlockAccess().getAlgorithmNameAssignment_1()); 
            }
            // InternalPortugolParser.g:2014:2: ( rule__HeaderBlock__AlgorithmNameAssignment_1 )
            // InternalPortugolParser.g:2014:3: rule__HeaderBlock__AlgorithmNameAssignment_1
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
    // InternalPortugolParser.g:2022:1: rule__HeaderBlock__Group__2 : rule__HeaderBlock__Group__2__Impl ;
    public final void rule__HeaderBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2026:1: ( rule__HeaderBlock__Group__2__Impl )
            // InternalPortugolParser.g:2027:2: rule__HeaderBlock__Group__2__Impl
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
    // InternalPortugolParser.g:2033:1: rule__HeaderBlock__Group__2__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__HeaderBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2037:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugolParser.g:2038:1: ( ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:2038:1: ( ruleEND_COMMAND )
            // InternalPortugolParser.g:2039:2: ruleEND_COMMAND
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
    // InternalPortugolParser.g:2049:1: rule__DeclarationsBlock__Group__0 : rule__DeclarationsBlock__Group__0__Impl rule__DeclarationsBlock__Group__1 ;
    public final void rule__DeclarationsBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2053:1: ( rule__DeclarationsBlock__Group__0__Impl rule__DeclarationsBlock__Group__1 )
            // InternalPortugolParser.g:2054:2: rule__DeclarationsBlock__Group__0__Impl rule__DeclarationsBlock__Group__1
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
    // InternalPortugolParser.g:2061:1: rule__DeclarationsBlock__Group__0__Impl : ( Var ) ;
    public final void rule__DeclarationsBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2065:1: ( ( Var ) )
            // InternalPortugolParser.g:2066:1: ( Var )
            {
            // InternalPortugolParser.g:2066:1: ( Var )
            // InternalPortugolParser.g:2067:2: Var
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
    // InternalPortugolParser.g:2076:1: rule__DeclarationsBlock__Group__1 : rule__DeclarationsBlock__Group__1__Impl ;
    public final void rule__DeclarationsBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2080:1: ( rule__DeclarationsBlock__Group__1__Impl )
            // InternalPortugolParser.g:2081:2: rule__DeclarationsBlock__Group__1__Impl
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
    // InternalPortugolParser.g:2087:1: rule__DeclarationsBlock__Group__1__Impl : ( ( ( rule__DeclarationsBlock__Group_1__0 ) ) ( ( rule__DeclarationsBlock__Group_1__0 )* ) ) ;
    public final void rule__DeclarationsBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2091:1: ( ( ( ( rule__DeclarationsBlock__Group_1__0 ) ) ( ( rule__DeclarationsBlock__Group_1__0 )* ) ) )
            // InternalPortugolParser.g:2092:1: ( ( ( rule__DeclarationsBlock__Group_1__0 ) ) ( ( rule__DeclarationsBlock__Group_1__0 )* ) )
            {
            // InternalPortugolParser.g:2092:1: ( ( ( rule__DeclarationsBlock__Group_1__0 ) ) ( ( rule__DeclarationsBlock__Group_1__0 )* ) )
            // InternalPortugolParser.g:2093:2: ( ( rule__DeclarationsBlock__Group_1__0 ) ) ( ( rule__DeclarationsBlock__Group_1__0 )* )
            {
            // InternalPortugolParser.g:2093:2: ( ( rule__DeclarationsBlock__Group_1__0 ) )
            // InternalPortugolParser.g:2094:3: ( rule__DeclarationsBlock__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:2095:3: ( rule__DeclarationsBlock__Group_1__0 )
            // InternalPortugolParser.g:2095:4: rule__DeclarationsBlock__Group_1__0
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

            // InternalPortugolParser.g:2098:2: ( ( rule__DeclarationsBlock__Group_1__0 )* )
            // InternalPortugolParser.g:2099:3: ( rule__DeclarationsBlock__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:2100:3: ( rule__DeclarationsBlock__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPortugolParser.g:2100:4: rule__DeclarationsBlock__Group_1__0
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
    // InternalPortugolParser.g:2110:1: rule__DeclarationsBlock__Group_1__0 : rule__DeclarationsBlock__Group_1__0__Impl rule__DeclarationsBlock__Group_1__1 ;
    public final void rule__DeclarationsBlock__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2114:1: ( rule__DeclarationsBlock__Group_1__0__Impl rule__DeclarationsBlock__Group_1__1 )
            // InternalPortugolParser.g:2115:2: rule__DeclarationsBlock__Group_1__0__Impl rule__DeclarationsBlock__Group_1__1
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
    // InternalPortugolParser.g:2122:1: rule__DeclarationsBlock__Group_1__0__Impl : ( ( rule__DeclarationsBlock__VarsAssignment_1_0 ) ) ;
    public final void rule__DeclarationsBlock__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2126:1: ( ( ( rule__DeclarationsBlock__VarsAssignment_1_0 ) ) )
            // InternalPortugolParser.g:2127:1: ( ( rule__DeclarationsBlock__VarsAssignment_1_0 ) )
            {
            // InternalPortugolParser.g:2127:1: ( ( rule__DeclarationsBlock__VarsAssignment_1_0 ) )
            // InternalPortugolParser.g:2128:2: ( rule__DeclarationsBlock__VarsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getVarsAssignment_1_0()); 
            }
            // InternalPortugolParser.g:2129:2: ( rule__DeclarationsBlock__VarsAssignment_1_0 )
            // InternalPortugolParser.g:2129:3: rule__DeclarationsBlock__VarsAssignment_1_0
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
    // InternalPortugolParser.g:2137:1: rule__DeclarationsBlock__Group_1__1 : rule__DeclarationsBlock__Group_1__1__Impl ;
    public final void rule__DeclarationsBlock__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2141:1: ( rule__DeclarationsBlock__Group_1__1__Impl )
            // InternalPortugolParser.g:2142:2: rule__DeclarationsBlock__Group_1__1__Impl
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
    // InternalPortugolParser.g:2148:1: rule__DeclarationsBlock__Group_1__1__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__DeclarationsBlock__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2152:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugolParser.g:2153:1: ( ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:2153:1: ( ruleEND_COMMAND )
            // InternalPortugolParser.g:2154:2: ruleEND_COMMAND
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
    // InternalPortugolParser.g:2164:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2168:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalPortugolParser.g:2169:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalPortugolParser.g:2176:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__VarDeclarationAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2180:1: ( ( ( rule__Variable__VarDeclarationAssignment_0 ) ) )
            // InternalPortugolParser.g:2181:1: ( ( rule__Variable__VarDeclarationAssignment_0 ) )
            {
            // InternalPortugolParser.g:2181:1: ( ( rule__Variable__VarDeclarationAssignment_0 ) )
            // InternalPortugolParser.g:2182:2: ( rule__Variable__VarDeclarationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getVarDeclarationAssignment_0()); 
            }
            // InternalPortugolParser.g:2183:2: ( rule__Variable__VarDeclarationAssignment_0 )
            // InternalPortugolParser.g:2183:3: rule__Variable__VarDeclarationAssignment_0
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
    // InternalPortugolParser.g:2191:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2195:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalPortugolParser.g:2196:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
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
    // InternalPortugolParser.g:2203:1: rule__Variable__Group__1__Impl : ( Colon ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2207:1: ( ( Colon ) )
            // InternalPortugolParser.g:2208:1: ( Colon )
            {
            // InternalPortugolParser.g:2208:1: ( Colon )
            // InternalPortugolParser.g:2209:2: Colon
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
    // InternalPortugolParser.g:2218:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2222:1: ( rule__Variable__Group__2__Impl )
            // InternalPortugolParser.g:2223:2: rule__Variable__Group__2__Impl
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
    // InternalPortugolParser.g:2229:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__TypeAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2233:1: ( ( ( rule__Variable__TypeAssignment_2 ) ) )
            // InternalPortugolParser.g:2234:1: ( ( rule__Variable__TypeAssignment_2 ) )
            {
            // InternalPortugolParser.g:2234:1: ( ( rule__Variable__TypeAssignment_2 ) )
            // InternalPortugolParser.g:2235:2: ( rule__Variable__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getTypeAssignment_2()); 
            }
            // InternalPortugolParser.g:2236:2: ( rule__Variable__TypeAssignment_2 )
            // InternalPortugolParser.g:2236:3: rule__Variable__TypeAssignment_2
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
    // InternalPortugolParser.g:2245:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2249:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // InternalPortugolParser.g:2250:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
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
    // InternalPortugolParser.g:2257:1: rule__VarDeclaration__Group__0__Impl : ( ( rule__VarDeclaration__VarsAssignment_0 ) ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2261:1: ( ( ( rule__VarDeclaration__VarsAssignment_0 ) ) )
            // InternalPortugolParser.g:2262:1: ( ( rule__VarDeclaration__VarsAssignment_0 ) )
            {
            // InternalPortugolParser.g:2262:1: ( ( rule__VarDeclaration__VarsAssignment_0 ) )
            // InternalPortugolParser.g:2263:2: ( rule__VarDeclaration__VarsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getVarsAssignment_0()); 
            }
            // InternalPortugolParser.g:2264:2: ( rule__VarDeclaration__VarsAssignment_0 )
            // InternalPortugolParser.g:2264:3: rule__VarDeclaration__VarsAssignment_0
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
    // InternalPortugolParser.g:2272:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2276:1: ( rule__VarDeclaration__Group__1__Impl )
            // InternalPortugolParser.g:2277:2: rule__VarDeclaration__Group__1__Impl
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
    // InternalPortugolParser.g:2283:1: rule__VarDeclaration__Group__1__Impl : ( ( rule__VarDeclaration__Group_1__0 )* ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2287:1: ( ( ( rule__VarDeclaration__Group_1__0 )* ) )
            // InternalPortugolParser.g:2288:1: ( ( rule__VarDeclaration__Group_1__0 )* )
            {
            // InternalPortugolParser.g:2288:1: ( ( rule__VarDeclaration__Group_1__0 )* )
            // InternalPortugolParser.g:2289:2: ( rule__VarDeclaration__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:2290:2: ( rule__VarDeclaration__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Comma) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPortugolParser.g:2290:3: rule__VarDeclaration__Group_1__0
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
    // InternalPortugolParser.g:2299:1: rule__VarDeclaration__Group_1__0 : rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1 ;
    public final void rule__VarDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2303:1: ( rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1 )
            // InternalPortugolParser.g:2304:2: rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1
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
    // InternalPortugolParser.g:2311:1: rule__VarDeclaration__Group_1__0__Impl : ( Comma ) ;
    public final void rule__VarDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2315:1: ( ( Comma ) )
            // InternalPortugolParser.g:2316:1: ( Comma )
            {
            // InternalPortugolParser.g:2316:1: ( Comma )
            // InternalPortugolParser.g:2317:2: Comma
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
    // InternalPortugolParser.g:2326:1: rule__VarDeclaration__Group_1__1 : rule__VarDeclaration__Group_1__1__Impl ;
    public final void rule__VarDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2330:1: ( rule__VarDeclaration__Group_1__1__Impl )
            // InternalPortugolParser.g:2331:2: rule__VarDeclaration__Group_1__1__Impl
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
    // InternalPortugolParser.g:2337:1: rule__VarDeclaration__Group_1__1__Impl : ( ( rule__VarDeclaration__VarsAssignment_1_1 ) ) ;
    public final void rule__VarDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2341:1: ( ( ( rule__VarDeclaration__VarsAssignment_1_1 ) ) )
            // InternalPortugolParser.g:2342:1: ( ( rule__VarDeclaration__VarsAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:2342:1: ( ( rule__VarDeclaration__VarsAssignment_1_1 ) )
            // InternalPortugolParser.g:2343:2: ( rule__VarDeclaration__VarsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getVarsAssignment_1_1()); 
            }
            // InternalPortugolParser.g:2344:2: ( rule__VarDeclaration__VarsAssignment_1_1 )
            // InternalPortugolParser.g:2344:3: rule__VarDeclaration__VarsAssignment_1_1
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
    // InternalPortugolParser.g:2353:1: rule__DeclaredVarList__Group__0 : rule__DeclaredVarList__Group__0__Impl rule__DeclaredVarList__Group__1 ;
    public final void rule__DeclaredVarList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2357:1: ( rule__DeclaredVarList__Group__0__Impl rule__DeclaredVarList__Group__1 )
            // InternalPortugolParser.g:2358:2: rule__DeclaredVarList__Group__0__Impl rule__DeclaredVarList__Group__1
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
    // InternalPortugolParser.g:2365:1: rule__DeclaredVarList__Group__0__Impl : ( ( rule__DeclaredVarList__VarsAssignment_0 ) ) ;
    public final void rule__DeclaredVarList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2369:1: ( ( ( rule__DeclaredVarList__VarsAssignment_0 ) ) )
            // InternalPortugolParser.g:2370:1: ( ( rule__DeclaredVarList__VarsAssignment_0 ) )
            {
            // InternalPortugolParser.g:2370:1: ( ( rule__DeclaredVarList__VarsAssignment_0 ) )
            // InternalPortugolParser.g:2371:2: ( rule__DeclaredVarList__VarsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getVarsAssignment_0()); 
            }
            // InternalPortugolParser.g:2372:2: ( rule__DeclaredVarList__VarsAssignment_0 )
            // InternalPortugolParser.g:2372:3: rule__DeclaredVarList__VarsAssignment_0
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
    // InternalPortugolParser.g:2380:1: rule__DeclaredVarList__Group__1 : rule__DeclaredVarList__Group__1__Impl ;
    public final void rule__DeclaredVarList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2384:1: ( rule__DeclaredVarList__Group__1__Impl )
            // InternalPortugolParser.g:2385:2: rule__DeclaredVarList__Group__1__Impl
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
    // InternalPortugolParser.g:2391:1: rule__DeclaredVarList__Group__1__Impl : ( ( rule__DeclaredVarList__Group_1__0 )* ) ;
    public final void rule__DeclaredVarList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2395:1: ( ( ( rule__DeclaredVarList__Group_1__0 )* ) )
            // InternalPortugolParser.g:2396:1: ( ( rule__DeclaredVarList__Group_1__0 )* )
            {
            // InternalPortugolParser.g:2396:1: ( ( rule__DeclaredVarList__Group_1__0 )* )
            // InternalPortugolParser.g:2397:2: ( rule__DeclaredVarList__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:2398:2: ( rule__DeclaredVarList__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Comma) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPortugolParser.g:2398:3: rule__DeclaredVarList__Group_1__0
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
    // InternalPortugolParser.g:2407:1: rule__DeclaredVarList__Group_1__0 : rule__DeclaredVarList__Group_1__0__Impl rule__DeclaredVarList__Group_1__1 ;
    public final void rule__DeclaredVarList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2411:1: ( rule__DeclaredVarList__Group_1__0__Impl rule__DeclaredVarList__Group_1__1 )
            // InternalPortugolParser.g:2412:2: rule__DeclaredVarList__Group_1__0__Impl rule__DeclaredVarList__Group_1__1
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
    // InternalPortugolParser.g:2419:1: rule__DeclaredVarList__Group_1__0__Impl : ( Comma ) ;
    public final void rule__DeclaredVarList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2423:1: ( ( Comma ) )
            // InternalPortugolParser.g:2424:1: ( Comma )
            {
            // InternalPortugolParser.g:2424:1: ( Comma )
            // InternalPortugolParser.g:2425:2: Comma
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
    // InternalPortugolParser.g:2434:1: rule__DeclaredVarList__Group_1__1 : rule__DeclaredVarList__Group_1__1__Impl ;
    public final void rule__DeclaredVarList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2438:1: ( rule__DeclaredVarList__Group_1__1__Impl )
            // InternalPortugolParser.g:2439:2: rule__DeclaredVarList__Group_1__1__Impl
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
    // InternalPortugolParser.g:2445:1: rule__DeclaredVarList__Group_1__1__Impl : ( ( rule__DeclaredVarList__VarsAssignment_1_1 ) ) ;
    public final void rule__DeclaredVarList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2449:1: ( ( ( rule__DeclaredVarList__VarsAssignment_1_1 ) ) )
            // InternalPortugolParser.g:2450:1: ( ( rule__DeclaredVarList__VarsAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:2450:1: ( ( rule__DeclaredVarList__VarsAssignment_1_1 ) )
            // InternalPortugolParser.g:2451:2: ( rule__DeclaredVarList__VarsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getVarsAssignment_1_1()); 
            }
            // InternalPortugolParser.g:2452:2: ( rule__DeclaredVarList__VarsAssignment_1_1 )
            // InternalPortugolParser.g:2452:3: rule__DeclaredVarList__VarsAssignment_1_1
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
    // InternalPortugolParser.g:2461:1: rule__BlockFunction__Group__0 : rule__BlockFunction__Group__0__Impl rule__BlockFunction__Group__1 ;
    public final void rule__BlockFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2465:1: ( rule__BlockFunction__Group__0__Impl rule__BlockFunction__Group__1 )
            // InternalPortugolParser.g:2466:2: rule__BlockFunction__Group__0__Impl rule__BlockFunction__Group__1
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
    // InternalPortugolParser.g:2473:1: rule__BlockFunction__Group__0__Impl : ( Funcao ) ;
    public final void rule__BlockFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2477:1: ( ( Funcao ) )
            // InternalPortugolParser.g:2478:1: ( Funcao )
            {
            // InternalPortugolParser.g:2478:1: ( Funcao )
            // InternalPortugolParser.g:2479:2: Funcao
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
    // InternalPortugolParser.g:2488:1: rule__BlockFunction__Group__1 : rule__BlockFunction__Group__1__Impl rule__BlockFunction__Group__2 ;
    public final void rule__BlockFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2492:1: ( rule__BlockFunction__Group__1__Impl rule__BlockFunction__Group__2 )
            // InternalPortugolParser.g:2493:2: rule__BlockFunction__Group__1__Impl rule__BlockFunction__Group__2
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
    // InternalPortugolParser.g:2500:1: rule__BlockFunction__Group__1__Impl : ( ( rule__BlockFunction__FunctionNameAssignment_1 ) ) ;
    public final void rule__BlockFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2504:1: ( ( ( rule__BlockFunction__FunctionNameAssignment_1 ) ) )
            // InternalPortugolParser.g:2505:1: ( ( rule__BlockFunction__FunctionNameAssignment_1 ) )
            {
            // InternalPortugolParser.g:2505:1: ( ( rule__BlockFunction__FunctionNameAssignment_1 ) )
            // InternalPortugolParser.g:2506:2: ( rule__BlockFunction__FunctionNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getFunctionNameAssignment_1()); 
            }
            // InternalPortugolParser.g:2507:2: ( rule__BlockFunction__FunctionNameAssignment_1 )
            // InternalPortugolParser.g:2507:3: rule__BlockFunction__FunctionNameAssignment_1
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
    // InternalPortugolParser.g:2515:1: rule__BlockFunction__Group__2 : rule__BlockFunction__Group__2__Impl rule__BlockFunction__Group__3 ;
    public final void rule__BlockFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2519:1: ( rule__BlockFunction__Group__2__Impl rule__BlockFunction__Group__3 )
            // InternalPortugolParser.g:2520:2: rule__BlockFunction__Group__2__Impl rule__BlockFunction__Group__3
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
    // InternalPortugolParser.g:2527:1: rule__BlockFunction__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__BlockFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2531:1: ( ( LeftParenthesis ) )
            // InternalPortugolParser.g:2532:1: ( LeftParenthesis )
            {
            // InternalPortugolParser.g:2532:1: ( LeftParenthesis )
            // InternalPortugolParser.g:2533:2: LeftParenthesis
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
    // InternalPortugolParser.g:2542:1: rule__BlockFunction__Group__3 : rule__BlockFunction__Group__3__Impl rule__BlockFunction__Group__4 ;
    public final void rule__BlockFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2546:1: ( rule__BlockFunction__Group__3__Impl rule__BlockFunction__Group__4 )
            // InternalPortugolParser.g:2547:2: rule__BlockFunction__Group__3__Impl rule__BlockFunction__Group__4
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
    // InternalPortugolParser.g:2554:1: rule__BlockFunction__Group__3__Impl : ( ( rule__BlockFunction__ParamsAssignment_3 )? ) ;
    public final void rule__BlockFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2558:1: ( ( ( rule__BlockFunction__ParamsAssignment_3 )? ) )
            // InternalPortugolParser.g:2559:1: ( ( rule__BlockFunction__ParamsAssignment_3 )? )
            {
            // InternalPortugolParser.g:2559:1: ( ( rule__BlockFunction__ParamsAssignment_3 )? )
            // InternalPortugolParser.g:2560:2: ( rule__BlockFunction__ParamsAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getParamsAssignment_3()); 
            }
            // InternalPortugolParser.g:2561:2: ( rule__BlockFunction__ParamsAssignment_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPortugolParser.g:2561:3: rule__BlockFunction__ParamsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__BlockFunction__ParamsAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getParamsAssignment_3()); 
            }

            }


            }

        }
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
    // InternalPortugolParser.g:2569:1: rule__BlockFunction__Group__4 : rule__BlockFunction__Group__4__Impl rule__BlockFunction__Group__5 ;
    public final void rule__BlockFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2573:1: ( rule__BlockFunction__Group__4__Impl rule__BlockFunction__Group__5 )
            // InternalPortugolParser.g:2574:2: rule__BlockFunction__Group__4__Impl rule__BlockFunction__Group__5
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
    // InternalPortugolParser.g:2581:1: rule__BlockFunction__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__BlockFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2585:1: ( ( RightParenthesis ) )
            // InternalPortugolParser.g:2586:1: ( RightParenthesis )
            {
            // InternalPortugolParser.g:2586:1: ( RightParenthesis )
            // InternalPortugolParser.g:2587:2: RightParenthesis
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
    // InternalPortugolParser.g:2596:1: rule__BlockFunction__Group__5 : rule__BlockFunction__Group__5__Impl rule__BlockFunction__Group__6 ;
    public final void rule__BlockFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2600:1: ( rule__BlockFunction__Group__5__Impl rule__BlockFunction__Group__6 )
            // InternalPortugolParser.g:2601:2: rule__BlockFunction__Group__5__Impl rule__BlockFunction__Group__6
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
    // InternalPortugolParser.g:2608:1: rule__BlockFunction__Group__5__Impl : ( Colon ) ;
    public final void rule__BlockFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2612:1: ( ( Colon ) )
            // InternalPortugolParser.g:2613:1: ( Colon )
            {
            // InternalPortugolParser.g:2613:1: ( Colon )
            // InternalPortugolParser.g:2614:2: Colon
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
    // InternalPortugolParser.g:2623:1: rule__BlockFunction__Group__6 : rule__BlockFunction__Group__6__Impl rule__BlockFunction__Group__7 ;
    public final void rule__BlockFunction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2627:1: ( rule__BlockFunction__Group__6__Impl rule__BlockFunction__Group__7 )
            // InternalPortugolParser.g:2628:2: rule__BlockFunction__Group__6__Impl rule__BlockFunction__Group__7
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
    // InternalPortugolParser.g:2635:1: rule__BlockFunction__Group__6__Impl : ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) ) ;
    public final void rule__BlockFunction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2639:1: ( ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) ) )
            // InternalPortugolParser.g:2640:1: ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) )
            {
            // InternalPortugolParser.g:2640:1: ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) )
            // InternalPortugolParser.g:2641:2: ( rule__BlockFunction__ReturnTypeAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getReturnTypeAssignment_6()); 
            }
            // InternalPortugolParser.g:2642:2: ( rule__BlockFunction__ReturnTypeAssignment_6 )
            // InternalPortugolParser.g:2642:3: rule__BlockFunction__ReturnTypeAssignment_6
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
    // InternalPortugolParser.g:2650:1: rule__BlockFunction__Group__7 : rule__BlockFunction__Group__7__Impl rule__BlockFunction__Group__8 ;
    public final void rule__BlockFunction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2654:1: ( rule__BlockFunction__Group__7__Impl rule__BlockFunction__Group__8 )
            // InternalPortugolParser.g:2655:2: rule__BlockFunction__Group__7__Impl rule__BlockFunction__Group__8
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
    // InternalPortugolParser.g:2662:1: rule__BlockFunction__Group__7__Impl : ( ( rule__BlockFunction__DeclarationsAssignment_7 )? ) ;
    public final void rule__BlockFunction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2666:1: ( ( ( rule__BlockFunction__DeclarationsAssignment_7 )? ) )
            // InternalPortugolParser.g:2667:1: ( ( rule__BlockFunction__DeclarationsAssignment_7 )? )
            {
            // InternalPortugolParser.g:2667:1: ( ( rule__BlockFunction__DeclarationsAssignment_7 )? )
            // InternalPortugolParser.g:2668:2: ( rule__BlockFunction__DeclarationsAssignment_7 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getDeclarationsAssignment_7()); 
            }
            // InternalPortugolParser.g:2669:2: ( rule__BlockFunction__DeclarationsAssignment_7 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Var) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPortugolParser.g:2669:3: rule__BlockFunction__DeclarationsAssignment_7
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
    // InternalPortugolParser.g:2677:1: rule__BlockFunction__Group__8 : rule__BlockFunction__Group__8__Impl rule__BlockFunction__Group__9 ;
    public final void rule__BlockFunction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2681:1: ( rule__BlockFunction__Group__8__Impl rule__BlockFunction__Group__9 )
            // InternalPortugolParser.g:2682:2: rule__BlockFunction__Group__8__Impl rule__BlockFunction__Group__9
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
    // InternalPortugolParser.g:2689:1: rule__BlockFunction__Group__8__Impl : ( Inicio ) ;
    public final void rule__BlockFunction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2693:1: ( ( Inicio ) )
            // InternalPortugolParser.g:2694:1: ( Inicio )
            {
            // InternalPortugolParser.g:2694:1: ( Inicio )
            // InternalPortugolParser.g:2695:2: Inicio
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
    // InternalPortugolParser.g:2704:1: rule__BlockFunction__Group__9 : rule__BlockFunction__Group__9__Impl rule__BlockFunction__Group__10 ;
    public final void rule__BlockFunction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2708:1: ( rule__BlockFunction__Group__9__Impl rule__BlockFunction__Group__10 )
            // InternalPortugolParser.g:2709:2: rule__BlockFunction__Group__9__Impl rule__BlockFunction__Group__10
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
    // InternalPortugolParser.g:2716:1: rule__BlockFunction__Group__9__Impl : ( ( ( rule__BlockFunction__CommandsAssignment_9 ) ) ( ( rule__BlockFunction__CommandsAssignment_9 )* ) ) ;
    public final void rule__BlockFunction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2720:1: ( ( ( ( rule__BlockFunction__CommandsAssignment_9 ) ) ( ( rule__BlockFunction__CommandsAssignment_9 )* ) ) )
            // InternalPortugolParser.g:2721:1: ( ( ( rule__BlockFunction__CommandsAssignment_9 ) ) ( ( rule__BlockFunction__CommandsAssignment_9 )* ) )
            {
            // InternalPortugolParser.g:2721:1: ( ( ( rule__BlockFunction__CommandsAssignment_9 ) ) ( ( rule__BlockFunction__CommandsAssignment_9 )* ) )
            // InternalPortugolParser.g:2722:2: ( ( rule__BlockFunction__CommandsAssignment_9 ) ) ( ( rule__BlockFunction__CommandsAssignment_9 )* )
            {
            // InternalPortugolParser.g:2722:2: ( ( rule__BlockFunction__CommandsAssignment_9 ) )
            // InternalPortugolParser.g:2723:3: ( rule__BlockFunction__CommandsAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getCommandsAssignment_9()); 
            }
            // InternalPortugolParser.g:2724:3: ( rule__BlockFunction__CommandsAssignment_9 )
            // InternalPortugolParser.g:2724:4: rule__BlockFunction__CommandsAssignment_9
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

            // InternalPortugolParser.g:2727:2: ( ( rule__BlockFunction__CommandsAssignment_9 )* )
            // InternalPortugolParser.g:2728:3: ( rule__BlockFunction__CommandsAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getCommandsAssignment_9()); 
            }
            // InternalPortugolParser.g:2729:3: ( rule__BlockFunction__CommandsAssignment_9 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Interrompa||(LA24_0>=Enquanto && LA24_0<=Escreva)||LA24_0==Retorne||(LA24_0>=Maiusc && LA24_0<=Copia)||LA24_0==Raizq||(LA24_0>=Leia && LA24_0<=Para)||LA24_0==NOT||(LA24_0>=Pi && LA24_0<=Se)||LA24_0==LeftParenthesis||LA24_0==HyphenMinus||(LA24_0>=RULE_INT && LA24_0<=RULE_STRING)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPortugolParser.g:2729:4: rule__BlockFunction__CommandsAssignment_9
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
    // InternalPortugolParser.g:2738:1: rule__BlockFunction__Group__10 : rule__BlockFunction__Group__10__Impl ;
    public final void rule__BlockFunction__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2742:1: ( rule__BlockFunction__Group__10__Impl )
            // InternalPortugolParser.g:2743:2: rule__BlockFunction__Group__10__Impl
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
    // InternalPortugolParser.g:2749:1: rule__BlockFunction__Group__10__Impl : ( Fimfuncao ) ;
    public final void rule__BlockFunction__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2753:1: ( ( Fimfuncao ) )
            // InternalPortugolParser.g:2754:1: ( Fimfuncao )
            {
            // InternalPortugolParser.g:2754:1: ( Fimfuncao )
            // InternalPortugolParser.g:2755:2: Fimfuncao
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


    // $ANTLR start "rule__BlockProcedure__Group__0"
    // InternalPortugolParser.g:2765:1: rule__BlockProcedure__Group__0 : rule__BlockProcedure__Group__0__Impl rule__BlockProcedure__Group__1 ;
    public final void rule__BlockProcedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2769:1: ( rule__BlockProcedure__Group__0__Impl rule__BlockProcedure__Group__1 )
            // InternalPortugolParser.g:2770:2: rule__BlockProcedure__Group__0__Impl rule__BlockProcedure__Group__1
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
    // InternalPortugolParser.g:2777:1: rule__BlockProcedure__Group__0__Impl : ( Procedimento ) ;
    public final void rule__BlockProcedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2781:1: ( ( Procedimento ) )
            // InternalPortugolParser.g:2782:1: ( Procedimento )
            {
            // InternalPortugolParser.g:2782:1: ( Procedimento )
            // InternalPortugolParser.g:2783:2: Procedimento
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
    // InternalPortugolParser.g:2792:1: rule__BlockProcedure__Group__1 : rule__BlockProcedure__Group__1__Impl rule__BlockProcedure__Group__2 ;
    public final void rule__BlockProcedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2796:1: ( rule__BlockProcedure__Group__1__Impl rule__BlockProcedure__Group__2 )
            // InternalPortugolParser.g:2797:2: rule__BlockProcedure__Group__1__Impl rule__BlockProcedure__Group__2
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
    // InternalPortugolParser.g:2804:1: rule__BlockProcedure__Group__1__Impl : ( ( rule__BlockProcedure__ProcedureNameAssignment_1 ) ) ;
    public final void rule__BlockProcedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2808:1: ( ( ( rule__BlockProcedure__ProcedureNameAssignment_1 ) ) )
            // InternalPortugolParser.g:2809:1: ( ( rule__BlockProcedure__ProcedureNameAssignment_1 ) )
            {
            // InternalPortugolParser.g:2809:1: ( ( rule__BlockProcedure__ProcedureNameAssignment_1 ) )
            // InternalPortugolParser.g:2810:2: ( rule__BlockProcedure__ProcedureNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getProcedureNameAssignment_1()); 
            }
            // InternalPortugolParser.g:2811:2: ( rule__BlockProcedure__ProcedureNameAssignment_1 )
            // InternalPortugolParser.g:2811:3: rule__BlockProcedure__ProcedureNameAssignment_1
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
    // InternalPortugolParser.g:2819:1: rule__BlockProcedure__Group__2 : rule__BlockProcedure__Group__2__Impl rule__BlockProcedure__Group__3 ;
    public final void rule__BlockProcedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2823:1: ( rule__BlockProcedure__Group__2__Impl rule__BlockProcedure__Group__3 )
            // InternalPortugolParser.g:2824:2: rule__BlockProcedure__Group__2__Impl rule__BlockProcedure__Group__3
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
    // InternalPortugolParser.g:2831:1: rule__BlockProcedure__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__BlockProcedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2835:1: ( ( LeftParenthesis ) )
            // InternalPortugolParser.g:2836:1: ( LeftParenthesis )
            {
            // InternalPortugolParser.g:2836:1: ( LeftParenthesis )
            // InternalPortugolParser.g:2837:2: LeftParenthesis
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
    // InternalPortugolParser.g:2846:1: rule__BlockProcedure__Group__3 : rule__BlockProcedure__Group__3__Impl rule__BlockProcedure__Group__4 ;
    public final void rule__BlockProcedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2850:1: ( rule__BlockProcedure__Group__3__Impl rule__BlockProcedure__Group__4 )
            // InternalPortugolParser.g:2851:2: rule__BlockProcedure__Group__3__Impl rule__BlockProcedure__Group__4
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
    // InternalPortugolParser.g:2858:1: rule__BlockProcedure__Group__3__Impl : ( ( rule__BlockProcedure__ParamsAssignment_3 )? ) ;
    public final void rule__BlockProcedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2862:1: ( ( ( rule__BlockProcedure__ParamsAssignment_3 )? ) )
            // InternalPortugolParser.g:2863:1: ( ( rule__BlockProcedure__ParamsAssignment_3 )? )
            {
            // InternalPortugolParser.g:2863:1: ( ( rule__BlockProcedure__ParamsAssignment_3 )? )
            // InternalPortugolParser.g:2864:2: ( rule__BlockProcedure__ParamsAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getParamsAssignment_3()); 
            }
            // InternalPortugolParser.g:2865:2: ( rule__BlockProcedure__ParamsAssignment_3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPortugolParser.g:2865:3: rule__BlockProcedure__ParamsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__BlockProcedure__ParamsAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getParamsAssignment_3()); 
            }

            }


            }

        }
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
    // InternalPortugolParser.g:2873:1: rule__BlockProcedure__Group__4 : rule__BlockProcedure__Group__4__Impl rule__BlockProcedure__Group__5 ;
    public final void rule__BlockProcedure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2877:1: ( rule__BlockProcedure__Group__4__Impl rule__BlockProcedure__Group__5 )
            // InternalPortugolParser.g:2878:2: rule__BlockProcedure__Group__4__Impl rule__BlockProcedure__Group__5
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
    // InternalPortugolParser.g:2885:1: rule__BlockProcedure__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__BlockProcedure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2889:1: ( ( RightParenthesis ) )
            // InternalPortugolParser.g:2890:1: ( RightParenthesis )
            {
            // InternalPortugolParser.g:2890:1: ( RightParenthesis )
            // InternalPortugolParser.g:2891:2: RightParenthesis
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
    // InternalPortugolParser.g:2900:1: rule__BlockProcedure__Group__5 : rule__BlockProcedure__Group__5__Impl rule__BlockProcedure__Group__6 ;
    public final void rule__BlockProcedure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2904:1: ( rule__BlockProcedure__Group__5__Impl rule__BlockProcedure__Group__6 )
            // InternalPortugolParser.g:2905:2: rule__BlockProcedure__Group__5__Impl rule__BlockProcedure__Group__6
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
    // InternalPortugolParser.g:2912:1: rule__BlockProcedure__Group__5__Impl : ( ( rule__BlockProcedure__DeclarationsAssignment_5 )? ) ;
    public final void rule__BlockProcedure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2916:1: ( ( ( rule__BlockProcedure__DeclarationsAssignment_5 )? ) )
            // InternalPortugolParser.g:2917:1: ( ( rule__BlockProcedure__DeclarationsAssignment_5 )? )
            {
            // InternalPortugolParser.g:2917:1: ( ( rule__BlockProcedure__DeclarationsAssignment_5 )? )
            // InternalPortugolParser.g:2918:2: ( rule__BlockProcedure__DeclarationsAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getDeclarationsAssignment_5()); 
            }
            // InternalPortugolParser.g:2919:2: ( rule__BlockProcedure__DeclarationsAssignment_5 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Var) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPortugolParser.g:2919:3: rule__BlockProcedure__DeclarationsAssignment_5
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
    // InternalPortugolParser.g:2927:1: rule__BlockProcedure__Group__6 : rule__BlockProcedure__Group__6__Impl rule__BlockProcedure__Group__7 ;
    public final void rule__BlockProcedure__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2931:1: ( rule__BlockProcedure__Group__6__Impl rule__BlockProcedure__Group__7 )
            // InternalPortugolParser.g:2932:2: rule__BlockProcedure__Group__6__Impl rule__BlockProcedure__Group__7
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
    // InternalPortugolParser.g:2939:1: rule__BlockProcedure__Group__6__Impl : ( Inicio ) ;
    public final void rule__BlockProcedure__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2943:1: ( ( Inicio ) )
            // InternalPortugolParser.g:2944:1: ( Inicio )
            {
            // InternalPortugolParser.g:2944:1: ( Inicio )
            // InternalPortugolParser.g:2945:2: Inicio
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
    // InternalPortugolParser.g:2954:1: rule__BlockProcedure__Group__7 : rule__BlockProcedure__Group__7__Impl rule__BlockProcedure__Group__8 ;
    public final void rule__BlockProcedure__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2958:1: ( rule__BlockProcedure__Group__7__Impl rule__BlockProcedure__Group__8 )
            // InternalPortugolParser.g:2959:2: rule__BlockProcedure__Group__7__Impl rule__BlockProcedure__Group__8
            {
            pushFollow(FOLLOW_19);
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
    // InternalPortugolParser.g:2966:1: rule__BlockProcedure__Group__7__Impl : ( ( ( rule__BlockProcedure__CommandsAssignment_7 ) ) ( ( rule__BlockProcedure__CommandsAssignment_7 )* ) ) ;
    public final void rule__BlockProcedure__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2970:1: ( ( ( ( rule__BlockProcedure__CommandsAssignment_7 ) ) ( ( rule__BlockProcedure__CommandsAssignment_7 )* ) ) )
            // InternalPortugolParser.g:2971:1: ( ( ( rule__BlockProcedure__CommandsAssignment_7 ) ) ( ( rule__BlockProcedure__CommandsAssignment_7 )* ) )
            {
            // InternalPortugolParser.g:2971:1: ( ( ( rule__BlockProcedure__CommandsAssignment_7 ) ) ( ( rule__BlockProcedure__CommandsAssignment_7 )* ) )
            // InternalPortugolParser.g:2972:2: ( ( rule__BlockProcedure__CommandsAssignment_7 ) ) ( ( rule__BlockProcedure__CommandsAssignment_7 )* )
            {
            // InternalPortugolParser.g:2972:2: ( ( rule__BlockProcedure__CommandsAssignment_7 ) )
            // InternalPortugolParser.g:2973:3: ( rule__BlockProcedure__CommandsAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getCommandsAssignment_7()); 
            }
            // InternalPortugolParser.g:2974:3: ( rule__BlockProcedure__CommandsAssignment_7 )
            // InternalPortugolParser.g:2974:4: rule__BlockProcedure__CommandsAssignment_7
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

            // InternalPortugolParser.g:2977:2: ( ( rule__BlockProcedure__CommandsAssignment_7 )* )
            // InternalPortugolParser.g:2978:3: ( rule__BlockProcedure__CommandsAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getCommandsAssignment_7()); 
            }
            // InternalPortugolParser.g:2979:3: ( rule__BlockProcedure__CommandsAssignment_7 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Interrompa||(LA27_0>=Enquanto && LA27_0<=Escreva)||LA27_0==Retorne||(LA27_0>=Maiusc && LA27_0<=Copia)||LA27_0==Raizq||(LA27_0>=Leia && LA27_0<=Para)||LA27_0==NOT||(LA27_0>=Pi && LA27_0<=Se)||LA27_0==LeftParenthesis||LA27_0==HyphenMinus||(LA27_0>=RULE_INT && LA27_0<=RULE_STRING)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPortugolParser.g:2979:4: rule__BlockProcedure__CommandsAssignment_7
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__BlockProcedure__CommandsAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalPortugolParser.g:2988:1: rule__BlockProcedure__Group__8 : rule__BlockProcedure__Group__8__Impl ;
    public final void rule__BlockProcedure__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2992:1: ( rule__BlockProcedure__Group__8__Impl )
            // InternalPortugolParser.g:2993:2: rule__BlockProcedure__Group__8__Impl
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
    // InternalPortugolParser.g:2999:1: rule__BlockProcedure__Group__8__Impl : ( Fimprocedimento ) ;
    public final void rule__BlockProcedure__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3003:1: ( ( Fimprocedimento ) )
            // InternalPortugolParser.g:3004:1: ( Fimprocedimento )
            {
            // InternalPortugolParser.g:3004:1: ( Fimprocedimento )
            // InternalPortugolParser.g:3005:2: Fimprocedimento
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


    // $ANTLR start "rule__SubprogramParamDeclaration__Group__0"
    // InternalPortugolParser.g:3015:1: rule__SubprogramParamDeclaration__Group__0 : rule__SubprogramParamDeclaration__Group__0__Impl rule__SubprogramParamDeclaration__Group__1 ;
    public final void rule__SubprogramParamDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3019:1: ( rule__SubprogramParamDeclaration__Group__0__Impl rule__SubprogramParamDeclaration__Group__1 )
            // InternalPortugolParser.g:3020:2: rule__SubprogramParamDeclaration__Group__0__Impl rule__SubprogramParamDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SubprogramParamDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubprogramParamDeclaration__Group__1();

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
    // $ANTLR end "rule__SubprogramParamDeclaration__Group__0"


    // $ANTLR start "rule__SubprogramParamDeclaration__Group__0__Impl"
    // InternalPortugolParser.g:3027:1: rule__SubprogramParamDeclaration__Group__0__Impl : ( ( rule__SubprogramParamDeclaration__ParamListAssignment_0 ) ) ;
    public final void rule__SubprogramParamDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3031:1: ( ( ( rule__SubprogramParamDeclaration__ParamListAssignment_0 ) ) )
            // InternalPortugolParser.g:3032:1: ( ( rule__SubprogramParamDeclaration__ParamListAssignment_0 ) )
            {
            // InternalPortugolParser.g:3032:1: ( ( rule__SubprogramParamDeclaration__ParamListAssignment_0 ) )
            // InternalPortugolParser.g:3033:2: ( rule__SubprogramParamDeclaration__ParamListAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamDeclarationAccess().getParamListAssignment_0()); 
            }
            // InternalPortugolParser.g:3034:2: ( rule__SubprogramParamDeclaration__ParamListAssignment_0 )
            // InternalPortugolParser.g:3034:3: rule__SubprogramParamDeclaration__ParamListAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SubprogramParamDeclaration__ParamListAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubprogramParamDeclarationAccess().getParamListAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubprogramParamDeclaration__Group__0__Impl"


    // $ANTLR start "rule__SubprogramParamDeclaration__Group__1"
    // InternalPortugolParser.g:3042:1: rule__SubprogramParamDeclaration__Group__1 : rule__SubprogramParamDeclaration__Group__1__Impl ;
    public final void rule__SubprogramParamDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3046:1: ( rule__SubprogramParamDeclaration__Group__1__Impl )
            // InternalPortugolParser.g:3047:2: rule__SubprogramParamDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubprogramParamDeclaration__Group__1__Impl();

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
    // $ANTLR end "rule__SubprogramParamDeclaration__Group__1"


    // $ANTLR start "rule__SubprogramParamDeclaration__Group__1__Impl"
    // InternalPortugolParser.g:3053:1: rule__SubprogramParamDeclaration__Group__1__Impl : ( ( rule__SubprogramParamDeclaration__Group_1__0 )* ) ;
    public final void rule__SubprogramParamDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3057:1: ( ( ( rule__SubprogramParamDeclaration__Group_1__0 )* ) )
            // InternalPortugolParser.g:3058:1: ( ( rule__SubprogramParamDeclaration__Group_1__0 )* )
            {
            // InternalPortugolParser.g:3058:1: ( ( rule__SubprogramParamDeclaration__Group_1__0 )* )
            // InternalPortugolParser.g:3059:2: ( rule__SubprogramParamDeclaration__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamDeclarationAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:3060:2: ( rule__SubprogramParamDeclaration__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==Semicolon) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalPortugolParser.g:3060:3: rule__SubprogramParamDeclaration__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__SubprogramParamDeclaration__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubprogramParamDeclarationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubprogramParamDeclaration__Group__1__Impl"


    // $ANTLR start "rule__SubprogramParamDeclaration__Group_1__0"
    // InternalPortugolParser.g:3069:1: rule__SubprogramParamDeclaration__Group_1__0 : rule__SubprogramParamDeclaration__Group_1__0__Impl rule__SubprogramParamDeclaration__Group_1__1 ;
    public final void rule__SubprogramParamDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3073:1: ( rule__SubprogramParamDeclaration__Group_1__0__Impl rule__SubprogramParamDeclaration__Group_1__1 )
            // InternalPortugolParser.g:3074:2: rule__SubprogramParamDeclaration__Group_1__0__Impl rule__SubprogramParamDeclaration__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__SubprogramParamDeclaration__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubprogramParamDeclaration__Group_1__1();

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
    // $ANTLR end "rule__SubprogramParamDeclaration__Group_1__0"


    // $ANTLR start "rule__SubprogramParamDeclaration__Group_1__0__Impl"
    // InternalPortugolParser.g:3081:1: rule__SubprogramParamDeclaration__Group_1__0__Impl : ( Semicolon ) ;
    public final void rule__SubprogramParamDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3085:1: ( ( Semicolon ) )
            // InternalPortugolParser.g:3086:1: ( Semicolon )
            {
            // InternalPortugolParser.g:3086:1: ( Semicolon )
            // InternalPortugolParser.g:3087:2: Semicolon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamDeclarationAccess().getSemicolonKeyword_1_0()); 
            }
            match(input,Semicolon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubprogramParamDeclarationAccess().getSemicolonKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubprogramParamDeclaration__Group_1__0__Impl"


    // $ANTLR start "rule__SubprogramParamDeclaration__Group_1__1"
    // InternalPortugolParser.g:3096:1: rule__SubprogramParamDeclaration__Group_1__1 : rule__SubprogramParamDeclaration__Group_1__1__Impl ;
    public final void rule__SubprogramParamDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3100:1: ( rule__SubprogramParamDeclaration__Group_1__1__Impl )
            // InternalPortugolParser.g:3101:2: rule__SubprogramParamDeclaration__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubprogramParamDeclaration__Group_1__1__Impl();

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
    // $ANTLR end "rule__SubprogramParamDeclaration__Group_1__1"


    // $ANTLR start "rule__SubprogramParamDeclaration__Group_1__1__Impl"
    // InternalPortugolParser.g:3107:1: rule__SubprogramParamDeclaration__Group_1__1__Impl : ( ( rule__SubprogramParamDeclaration__ParamListAssignment_1_1 ) ) ;
    public final void rule__SubprogramParamDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3111:1: ( ( ( rule__SubprogramParamDeclaration__ParamListAssignment_1_1 ) ) )
            // InternalPortugolParser.g:3112:1: ( ( rule__SubprogramParamDeclaration__ParamListAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:3112:1: ( ( rule__SubprogramParamDeclaration__ParamListAssignment_1_1 ) )
            // InternalPortugolParser.g:3113:2: ( rule__SubprogramParamDeclaration__ParamListAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamDeclarationAccess().getParamListAssignment_1_1()); 
            }
            // InternalPortugolParser.g:3114:2: ( rule__SubprogramParamDeclaration__ParamListAssignment_1_1 )
            // InternalPortugolParser.g:3114:3: rule__SubprogramParamDeclaration__ParamListAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SubprogramParamDeclaration__ParamListAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubprogramParamDeclarationAccess().getParamListAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubprogramParamDeclaration__Group_1__1__Impl"


    // $ANTLR start "rule__BlockCommand__Group__0"
    // InternalPortugolParser.g:3123:1: rule__BlockCommand__Group__0 : rule__BlockCommand__Group__0__Impl rule__BlockCommand__Group__1 ;
    public final void rule__BlockCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3127:1: ( rule__BlockCommand__Group__0__Impl rule__BlockCommand__Group__1 )
            // InternalPortugolParser.g:3128:2: rule__BlockCommand__Group__0__Impl rule__BlockCommand__Group__1
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
    // InternalPortugolParser.g:3135:1: rule__BlockCommand__Group__0__Impl : ( Inicio ) ;
    public final void rule__BlockCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3139:1: ( ( Inicio ) )
            // InternalPortugolParser.g:3140:1: ( Inicio )
            {
            // InternalPortugolParser.g:3140:1: ( Inicio )
            // InternalPortugolParser.g:3141:2: Inicio
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
    // InternalPortugolParser.g:3150:1: rule__BlockCommand__Group__1 : rule__BlockCommand__Group__1__Impl rule__BlockCommand__Group__2 ;
    public final void rule__BlockCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3154:1: ( rule__BlockCommand__Group__1__Impl rule__BlockCommand__Group__2 )
            // InternalPortugolParser.g:3155:2: rule__BlockCommand__Group__1__Impl rule__BlockCommand__Group__2
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
    // InternalPortugolParser.g:3162:1: rule__BlockCommand__Group__1__Impl : ( ( ( rule__BlockCommand__CommandsAssignment_1 ) ) ( ( rule__BlockCommand__CommandsAssignment_1 )* ) ) ;
    public final void rule__BlockCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3166:1: ( ( ( ( rule__BlockCommand__CommandsAssignment_1 ) ) ( ( rule__BlockCommand__CommandsAssignment_1 )* ) ) )
            // InternalPortugolParser.g:3167:1: ( ( ( rule__BlockCommand__CommandsAssignment_1 ) ) ( ( rule__BlockCommand__CommandsAssignment_1 )* ) )
            {
            // InternalPortugolParser.g:3167:1: ( ( ( rule__BlockCommand__CommandsAssignment_1 ) ) ( ( rule__BlockCommand__CommandsAssignment_1 )* ) )
            // InternalPortugolParser.g:3168:2: ( ( rule__BlockCommand__CommandsAssignment_1 ) ) ( ( rule__BlockCommand__CommandsAssignment_1 )* )
            {
            // InternalPortugolParser.g:3168:2: ( ( rule__BlockCommand__CommandsAssignment_1 ) )
            // InternalPortugolParser.g:3169:3: ( rule__BlockCommand__CommandsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getCommandsAssignment_1()); 
            }
            // InternalPortugolParser.g:3170:3: ( rule__BlockCommand__CommandsAssignment_1 )
            // InternalPortugolParser.g:3170:4: rule__BlockCommand__CommandsAssignment_1
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

            // InternalPortugolParser.g:3173:2: ( ( rule__BlockCommand__CommandsAssignment_1 )* )
            // InternalPortugolParser.g:3174:3: ( rule__BlockCommand__CommandsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getCommandsAssignment_1()); 
            }
            // InternalPortugolParser.g:3175:3: ( rule__BlockCommand__CommandsAssignment_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Interrompa||(LA29_0>=Enquanto && LA29_0<=Escreva)||LA29_0==Retorne||(LA29_0>=Maiusc && LA29_0<=Copia)||LA29_0==Raizq||(LA29_0>=Leia && LA29_0<=Para)||LA29_0==NOT||(LA29_0>=Pi && LA29_0<=Se)||LA29_0==LeftParenthesis||LA29_0==HyphenMinus||(LA29_0>=RULE_INT && LA29_0<=RULE_STRING)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPortugolParser.g:3175:4: rule__BlockCommand__CommandsAssignment_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__BlockCommand__CommandsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalPortugolParser.g:3184:1: rule__BlockCommand__Group__2 : rule__BlockCommand__Group__2__Impl ;
    public final void rule__BlockCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3188:1: ( rule__BlockCommand__Group__2__Impl )
            // InternalPortugolParser.g:3189:2: rule__BlockCommand__Group__2__Impl
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
    // InternalPortugolParser.g:3195:1: rule__BlockCommand__Group__2__Impl : ( Fimalgoritmo ) ;
    public final void rule__BlockCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3199:1: ( ( Fimalgoritmo ) )
            // InternalPortugolParser.g:3200:1: ( Fimalgoritmo )
            {
            // InternalPortugolParser.g:3200:1: ( Fimalgoritmo )
            // InternalPortugolParser.g:3201:2: Fimalgoritmo
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
    // InternalPortugolParser.g:3211:1: rule__AbstractCommand__Group_0__0 : rule__AbstractCommand__Group_0__0__Impl rule__AbstractCommand__Group_0__1 ;
    public final void rule__AbstractCommand__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3215:1: ( rule__AbstractCommand__Group_0__0__Impl rule__AbstractCommand__Group_0__1 )
            // InternalPortugolParser.g:3216:2: rule__AbstractCommand__Group_0__0__Impl rule__AbstractCommand__Group_0__1
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
    // InternalPortugolParser.g:3223:1: rule__AbstractCommand__Group_0__0__Impl : ( ruleReadCommand ) ;
    public final void rule__AbstractCommand__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3227:1: ( ( ruleReadCommand ) )
            // InternalPortugolParser.g:3228:1: ( ruleReadCommand )
            {
            // InternalPortugolParser.g:3228:1: ( ruleReadCommand )
            // InternalPortugolParser.g:3229:2: ruleReadCommand
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
    // InternalPortugolParser.g:3238:1: rule__AbstractCommand__Group_0__1 : rule__AbstractCommand__Group_0__1__Impl ;
    public final void rule__AbstractCommand__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3242:1: ( rule__AbstractCommand__Group_0__1__Impl )
            // InternalPortugolParser.g:3243:2: rule__AbstractCommand__Group_0__1__Impl
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
    // InternalPortugolParser.g:3249:1: rule__AbstractCommand__Group_0__1__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__AbstractCommand__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3253:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugolParser.g:3254:1: ( ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:3254:1: ( ruleEND_COMMAND )
            // InternalPortugolParser.g:3255:2: ruleEND_COMMAND
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
    // InternalPortugolParser.g:3265:1: rule__AbstractCommand__Group_1__0 : rule__AbstractCommand__Group_1__0__Impl rule__AbstractCommand__Group_1__1 ;
    public final void rule__AbstractCommand__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3269:1: ( rule__AbstractCommand__Group_1__0__Impl rule__AbstractCommand__Group_1__1 )
            // InternalPortugolParser.g:3270:2: rule__AbstractCommand__Group_1__0__Impl rule__AbstractCommand__Group_1__1
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
    // InternalPortugolParser.g:3277:1: rule__AbstractCommand__Group_1__0__Impl : ( ruleWriteCommand ) ;
    public final void rule__AbstractCommand__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3281:1: ( ( ruleWriteCommand ) )
            // InternalPortugolParser.g:3282:1: ( ruleWriteCommand )
            {
            // InternalPortugolParser.g:3282:1: ( ruleWriteCommand )
            // InternalPortugolParser.g:3283:2: ruleWriteCommand
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
    // InternalPortugolParser.g:3292:1: rule__AbstractCommand__Group_1__1 : rule__AbstractCommand__Group_1__1__Impl ;
    public final void rule__AbstractCommand__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3296:1: ( rule__AbstractCommand__Group_1__1__Impl )
            // InternalPortugolParser.g:3297:2: rule__AbstractCommand__Group_1__1__Impl
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
    // InternalPortugolParser.g:3303:1: rule__AbstractCommand__Group_1__1__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__AbstractCommand__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3307:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugolParser.g:3308:1: ( ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:3308:1: ( ruleEND_COMMAND )
            // InternalPortugolParser.g:3309:2: ruleEND_COMMAND
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
    // InternalPortugolParser.g:3319:1: rule__AbstractCommand__Group_2__0 : rule__AbstractCommand__Group_2__0__Impl rule__AbstractCommand__Group_2__1 ;
    public final void rule__AbstractCommand__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3323:1: ( rule__AbstractCommand__Group_2__0__Impl rule__AbstractCommand__Group_2__1 )
            // InternalPortugolParser.g:3324:2: rule__AbstractCommand__Group_2__0__Impl rule__AbstractCommand__Group_2__1
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
    // InternalPortugolParser.g:3331:1: rule__AbstractCommand__Group_2__0__Impl : ( ruleExpression ) ;
    public final void rule__AbstractCommand__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3335:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:3336:1: ( ruleExpression )
            {
            // InternalPortugolParser.g:3336:1: ( ruleExpression )
            // InternalPortugolParser.g:3337:2: ruleExpression
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
    // InternalPortugolParser.g:3346:1: rule__AbstractCommand__Group_2__1 : rule__AbstractCommand__Group_2__1__Impl ;
    public final void rule__AbstractCommand__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3350:1: ( rule__AbstractCommand__Group_2__1__Impl )
            // InternalPortugolParser.g:3351:2: rule__AbstractCommand__Group_2__1__Impl
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
    // InternalPortugolParser.g:3357:1: rule__AbstractCommand__Group_2__1__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__AbstractCommand__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3361:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugolParser.g:3362:1: ( ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:3362:1: ( ruleEND_COMMAND )
            // InternalPortugolParser.g:3363:2: ruleEND_COMMAND
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
    // InternalPortugolParser.g:3373:1: rule__AbstractCommand__Group_8__0 : rule__AbstractCommand__Group_8__0__Impl rule__AbstractCommand__Group_8__1 ;
    public final void rule__AbstractCommand__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3377:1: ( rule__AbstractCommand__Group_8__0__Impl rule__AbstractCommand__Group_8__1 )
            // InternalPortugolParser.g:3378:2: rule__AbstractCommand__Group_8__0__Impl rule__AbstractCommand__Group_8__1
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
    // InternalPortugolParser.g:3385:1: rule__AbstractCommand__Group_8__0__Impl : ( ruleBreakStatement ) ;
    public final void rule__AbstractCommand__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3389:1: ( ( ruleBreakStatement ) )
            // InternalPortugolParser.g:3390:1: ( ruleBreakStatement )
            {
            // InternalPortugolParser.g:3390:1: ( ruleBreakStatement )
            // InternalPortugolParser.g:3391:2: ruleBreakStatement
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
    // InternalPortugolParser.g:3400:1: rule__AbstractCommand__Group_8__1 : rule__AbstractCommand__Group_8__1__Impl ;
    public final void rule__AbstractCommand__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3404:1: ( rule__AbstractCommand__Group_8__1__Impl )
            // InternalPortugolParser.g:3405:2: rule__AbstractCommand__Group_8__1__Impl
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
    // InternalPortugolParser.g:3411:1: rule__AbstractCommand__Group_8__1__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__AbstractCommand__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3415:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugolParser.g:3416:1: ( ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:3416:1: ( ruleEND_COMMAND )
            // InternalPortugolParser.g:3417:2: ruleEND_COMMAND
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
    // InternalPortugolParser.g:3427:1: rule__AbstractCommand__Group_9__0 : rule__AbstractCommand__Group_9__0__Impl rule__AbstractCommand__Group_9__1 ;
    public final void rule__AbstractCommand__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3431:1: ( rule__AbstractCommand__Group_9__0__Impl rule__AbstractCommand__Group_9__1 )
            // InternalPortugolParser.g:3432:2: rule__AbstractCommand__Group_9__0__Impl rule__AbstractCommand__Group_9__1
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
    // InternalPortugolParser.g:3439:1: rule__AbstractCommand__Group_9__0__Impl : ( ruleReturnStatement ) ;
    public final void rule__AbstractCommand__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3443:1: ( ( ruleReturnStatement ) )
            // InternalPortugolParser.g:3444:1: ( ruleReturnStatement )
            {
            // InternalPortugolParser.g:3444:1: ( ruleReturnStatement )
            // InternalPortugolParser.g:3445:2: ruleReturnStatement
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
    // InternalPortugolParser.g:3454:1: rule__AbstractCommand__Group_9__1 : rule__AbstractCommand__Group_9__1__Impl ;
    public final void rule__AbstractCommand__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3458:1: ( rule__AbstractCommand__Group_9__1__Impl )
            // InternalPortugolParser.g:3459:2: rule__AbstractCommand__Group_9__1__Impl
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
    // InternalPortugolParser.g:3465:1: rule__AbstractCommand__Group_9__1__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__AbstractCommand__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3469:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugolParser.g:3470:1: ( ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:3470:1: ( ruleEND_COMMAND )
            // InternalPortugolParser.g:3471:2: ruleEND_COMMAND
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
    // InternalPortugolParser.g:3481:1: rule__BreakStatement__Group__0 : rule__BreakStatement__Group__0__Impl rule__BreakStatement__Group__1 ;
    public final void rule__BreakStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3485:1: ( rule__BreakStatement__Group__0__Impl rule__BreakStatement__Group__1 )
            // InternalPortugolParser.g:3486:2: rule__BreakStatement__Group__0__Impl rule__BreakStatement__Group__1
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
    // InternalPortugolParser.g:3493:1: rule__BreakStatement__Group__0__Impl : ( () ) ;
    public final void rule__BreakStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3497:1: ( ( () ) )
            // InternalPortugolParser.g:3498:1: ( () )
            {
            // InternalPortugolParser.g:3498:1: ( () )
            // InternalPortugolParser.g:3499:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakStatementAccess().getBreakStatementAction_0()); 
            }
            // InternalPortugolParser.g:3500:2: ()
            // InternalPortugolParser.g:3500:3: 
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
    // InternalPortugolParser.g:3508:1: rule__BreakStatement__Group__1 : rule__BreakStatement__Group__1__Impl ;
    public final void rule__BreakStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3512:1: ( rule__BreakStatement__Group__1__Impl )
            // InternalPortugolParser.g:3513:2: rule__BreakStatement__Group__1__Impl
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
    // InternalPortugolParser.g:3519:1: rule__BreakStatement__Group__1__Impl : ( Interrompa ) ;
    public final void rule__BreakStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3523:1: ( ( Interrompa ) )
            // InternalPortugolParser.g:3524:1: ( Interrompa )
            {
            // InternalPortugolParser.g:3524:1: ( Interrompa )
            // InternalPortugolParser.g:3525:2: Interrompa
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
    // InternalPortugolParser.g:3535:1: rule__ReturnStatement__Group__0 : rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1 ;
    public final void rule__ReturnStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3539:1: ( rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1 )
            // InternalPortugolParser.g:3540:2: rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1
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
    // InternalPortugolParser.g:3547:1: rule__ReturnStatement__Group__0__Impl : ( () ) ;
    public final void rule__ReturnStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3551:1: ( ( () ) )
            // InternalPortugolParser.g:3552:1: ( () )
            {
            // InternalPortugolParser.g:3552:1: ( () )
            // InternalPortugolParser.g:3553:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getReturnStatementAction_0()); 
            }
            // InternalPortugolParser.g:3554:2: ()
            // InternalPortugolParser.g:3554:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnStatementAccess().getReturnStatementAction_0()); 
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
    // InternalPortugolParser.g:3562:1: rule__ReturnStatement__Group__1 : rule__ReturnStatement__Group__1__Impl rule__ReturnStatement__Group__2 ;
    public final void rule__ReturnStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3566:1: ( rule__ReturnStatement__Group__1__Impl rule__ReturnStatement__Group__2 )
            // InternalPortugolParser.g:3567:2: rule__ReturnStatement__Group__1__Impl rule__ReturnStatement__Group__2
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
    // InternalPortugolParser.g:3574:1: rule__ReturnStatement__Group__1__Impl : ( Retorne ) ;
    public final void rule__ReturnStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3578:1: ( ( Retorne ) )
            // InternalPortugolParser.g:3579:1: ( Retorne )
            {
            // InternalPortugolParser.g:3579:1: ( Retorne )
            // InternalPortugolParser.g:3580:2: Retorne
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
    // InternalPortugolParser.g:3589:1: rule__ReturnStatement__Group__2 : rule__ReturnStatement__Group__2__Impl ;
    public final void rule__ReturnStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3593:1: ( rule__ReturnStatement__Group__2__Impl )
            // InternalPortugolParser.g:3594:2: rule__ReturnStatement__Group__2__Impl
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
    // InternalPortugolParser.g:3600:1: rule__ReturnStatement__Group__2__Impl : ( ( rule__ReturnStatement__ExprAssignment_2 ) ) ;
    public final void rule__ReturnStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3604:1: ( ( ( rule__ReturnStatement__ExprAssignment_2 ) ) )
            // InternalPortugolParser.g:3605:1: ( ( rule__ReturnStatement__ExprAssignment_2 ) )
            {
            // InternalPortugolParser.g:3605:1: ( ( rule__ReturnStatement__ExprAssignment_2 ) )
            // InternalPortugolParser.g:3606:2: ( rule__ReturnStatement__ExprAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getExprAssignment_2()); 
            }
            // InternalPortugolParser.g:3607:2: ( rule__ReturnStatement__ExprAssignment_2 )
            // InternalPortugolParser.g:3607:3: rule__ReturnStatement__ExprAssignment_2
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
    // InternalPortugolParser.g:3616:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3620:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalPortugolParser.g:3621:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
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
    // InternalPortugolParser.g:3628:1: rule__IfStatement__Group__0__Impl : ( Se ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3632:1: ( ( Se ) )
            // InternalPortugolParser.g:3633:1: ( Se )
            {
            // InternalPortugolParser.g:3633:1: ( Se )
            // InternalPortugolParser.g:3634:2: Se
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
    // InternalPortugolParser.g:3643:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3647:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalPortugolParser.g:3648:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
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
    // InternalPortugolParser.g:3655:1: rule__IfStatement__Group__1__Impl : ( ( rule__IfStatement__ExprAssignment_1 ) ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3659:1: ( ( ( rule__IfStatement__ExprAssignment_1 ) ) )
            // InternalPortugolParser.g:3660:1: ( ( rule__IfStatement__ExprAssignment_1 ) )
            {
            // InternalPortugolParser.g:3660:1: ( ( rule__IfStatement__ExprAssignment_1 ) )
            // InternalPortugolParser.g:3661:2: ( rule__IfStatement__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getExprAssignment_1()); 
            }
            // InternalPortugolParser.g:3662:2: ( rule__IfStatement__ExprAssignment_1 )
            // InternalPortugolParser.g:3662:3: rule__IfStatement__ExprAssignment_1
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
    // InternalPortugolParser.g:3670:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3674:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalPortugolParser.g:3675:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
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
    // InternalPortugolParser.g:3682:1: rule__IfStatement__Group__2__Impl : ( Entao ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3686:1: ( ( Entao ) )
            // InternalPortugolParser.g:3687:1: ( Entao )
            {
            // InternalPortugolParser.g:3687:1: ( Entao )
            // InternalPortugolParser.g:3688:2: Entao
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
    // InternalPortugolParser.g:3697:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3701:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalPortugolParser.g:3702:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
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
    // InternalPortugolParser.g:3709:1: rule__IfStatement__Group__3__Impl : ( ( ( rule__IfStatement__CommandsAssignment_3 ) ) ( ( rule__IfStatement__CommandsAssignment_3 )* ) ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3713:1: ( ( ( ( rule__IfStatement__CommandsAssignment_3 ) ) ( ( rule__IfStatement__CommandsAssignment_3 )* ) ) )
            // InternalPortugolParser.g:3714:1: ( ( ( rule__IfStatement__CommandsAssignment_3 ) ) ( ( rule__IfStatement__CommandsAssignment_3 )* ) )
            {
            // InternalPortugolParser.g:3714:1: ( ( ( rule__IfStatement__CommandsAssignment_3 ) ) ( ( rule__IfStatement__CommandsAssignment_3 )* ) )
            // InternalPortugolParser.g:3715:2: ( ( rule__IfStatement__CommandsAssignment_3 ) ) ( ( rule__IfStatement__CommandsAssignment_3 )* )
            {
            // InternalPortugolParser.g:3715:2: ( ( rule__IfStatement__CommandsAssignment_3 ) )
            // InternalPortugolParser.g:3716:3: ( rule__IfStatement__CommandsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugolParser.g:3717:3: ( rule__IfStatement__CommandsAssignment_3 )
            // InternalPortugolParser.g:3717:4: rule__IfStatement__CommandsAssignment_3
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

            // InternalPortugolParser.g:3720:2: ( ( rule__IfStatement__CommandsAssignment_3 )* )
            // InternalPortugolParser.g:3721:3: ( rule__IfStatement__CommandsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugolParser.g:3722:3: ( rule__IfStatement__CommandsAssignment_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==Interrompa||(LA30_0>=Enquanto && LA30_0<=Escreva)||LA30_0==Retorne||(LA30_0>=Maiusc && LA30_0<=Copia)||LA30_0==Raizq||(LA30_0>=Leia && LA30_0<=Para)||LA30_0==NOT||(LA30_0>=Pi && LA30_0<=Se)||LA30_0==LeftParenthesis||LA30_0==HyphenMinus||(LA30_0>=RULE_INT && LA30_0<=RULE_STRING)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPortugolParser.g:3722:4: rule__IfStatement__CommandsAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__IfStatement__CommandsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalPortugolParser.g:3731:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3735:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalPortugolParser.g:3736:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
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
    // InternalPortugolParser.g:3743:1: rule__IfStatement__Group__4__Impl : ( ( rule__IfStatement__Group_4__0 )? ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3747:1: ( ( ( rule__IfStatement__Group_4__0 )? ) )
            // InternalPortugolParser.g:3748:1: ( ( rule__IfStatement__Group_4__0 )? )
            {
            // InternalPortugolParser.g:3748:1: ( ( rule__IfStatement__Group_4__0 )? )
            // InternalPortugolParser.g:3749:2: ( rule__IfStatement__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup_4()); 
            }
            // InternalPortugolParser.g:3750:2: ( rule__IfStatement__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Senao) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPortugolParser.g:3750:3: rule__IfStatement__Group_4__0
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
    // InternalPortugolParser.g:3758:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3762:1: ( rule__IfStatement__Group__5__Impl )
            // InternalPortugolParser.g:3763:2: rule__IfStatement__Group__5__Impl
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
    // InternalPortugolParser.g:3769:1: rule__IfStatement__Group__5__Impl : ( Fimse ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3773:1: ( ( Fimse ) )
            // InternalPortugolParser.g:3774:1: ( Fimse )
            {
            // InternalPortugolParser.g:3774:1: ( Fimse )
            // InternalPortugolParser.g:3775:2: Fimse
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
    // InternalPortugolParser.g:3785:1: rule__IfStatement__Group_4__0 : rule__IfStatement__Group_4__0__Impl rule__IfStatement__Group_4__1 ;
    public final void rule__IfStatement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3789:1: ( rule__IfStatement__Group_4__0__Impl rule__IfStatement__Group_4__1 )
            // InternalPortugolParser.g:3790:2: rule__IfStatement__Group_4__0__Impl rule__IfStatement__Group_4__1
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
    // InternalPortugolParser.g:3797:1: rule__IfStatement__Group_4__0__Impl : ( Senao ) ;
    public final void rule__IfStatement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3801:1: ( ( Senao ) )
            // InternalPortugolParser.g:3802:1: ( Senao )
            {
            // InternalPortugolParser.g:3802:1: ( Senao )
            // InternalPortugolParser.g:3803:2: Senao
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
    // InternalPortugolParser.g:3812:1: rule__IfStatement__Group_4__1 : rule__IfStatement__Group_4__1__Impl ;
    public final void rule__IfStatement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3816:1: ( rule__IfStatement__Group_4__1__Impl )
            // InternalPortugolParser.g:3817:2: rule__IfStatement__Group_4__1__Impl
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
    // InternalPortugolParser.g:3823:1: rule__IfStatement__Group_4__1__Impl : ( ( ( rule__IfStatement__ElseCommandsAssignment_4_1 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_4_1 )* ) ) ;
    public final void rule__IfStatement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3827:1: ( ( ( ( rule__IfStatement__ElseCommandsAssignment_4_1 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_4_1 )* ) ) )
            // InternalPortugolParser.g:3828:1: ( ( ( rule__IfStatement__ElseCommandsAssignment_4_1 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_4_1 )* ) )
            {
            // InternalPortugolParser.g:3828:1: ( ( ( rule__IfStatement__ElseCommandsAssignment_4_1 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_4_1 )* ) )
            // InternalPortugolParser.g:3829:2: ( ( rule__IfStatement__ElseCommandsAssignment_4_1 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_4_1 )* )
            {
            // InternalPortugolParser.g:3829:2: ( ( rule__IfStatement__ElseCommandsAssignment_4_1 ) )
            // InternalPortugolParser.g:3830:3: ( rule__IfStatement__ElseCommandsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseCommandsAssignment_4_1()); 
            }
            // InternalPortugolParser.g:3831:3: ( rule__IfStatement__ElseCommandsAssignment_4_1 )
            // InternalPortugolParser.g:3831:4: rule__IfStatement__ElseCommandsAssignment_4_1
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

            // InternalPortugolParser.g:3834:2: ( ( rule__IfStatement__ElseCommandsAssignment_4_1 )* )
            // InternalPortugolParser.g:3835:3: ( rule__IfStatement__ElseCommandsAssignment_4_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseCommandsAssignment_4_1()); 
            }
            // InternalPortugolParser.g:3836:3: ( rule__IfStatement__ElseCommandsAssignment_4_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==Interrompa||(LA32_0>=Enquanto && LA32_0<=Escreva)||LA32_0==Retorne||(LA32_0>=Maiusc && LA32_0<=Copia)||LA32_0==Raizq||(LA32_0>=Leia && LA32_0<=Para)||LA32_0==NOT||(LA32_0>=Pi && LA32_0<=Se)||LA32_0==LeftParenthesis||LA32_0==HyphenMinus||(LA32_0>=RULE_INT && LA32_0<=RULE_STRING)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPortugolParser.g:3836:4: rule__IfStatement__ElseCommandsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__IfStatement__ElseCommandsAssignment_4_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalPortugolParser.g:3846:1: rule__SwitchCaseStatement__Group__0 : rule__SwitchCaseStatement__Group__0__Impl rule__SwitchCaseStatement__Group__1 ;
    public final void rule__SwitchCaseStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3850:1: ( rule__SwitchCaseStatement__Group__0__Impl rule__SwitchCaseStatement__Group__1 )
            // InternalPortugolParser.g:3851:2: rule__SwitchCaseStatement__Group__0__Impl rule__SwitchCaseStatement__Group__1
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
    // InternalPortugolParser.g:3858:1: rule__SwitchCaseStatement__Group__0__Impl : ( Escolha ) ;
    public final void rule__SwitchCaseStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3862:1: ( ( Escolha ) )
            // InternalPortugolParser.g:3863:1: ( Escolha )
            {
            // InternalPortugolParser.g:3863:1: ( Escolha )
            // InternalPortugolParser.g:3864:2: Escolha
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
    // InternalPortugolParser.g:3873:1: rule__SwitchCaseStatement__Group__1 : rule__SwitchCaseStatement__Group__1__Impl rule__SwitchCaseStatement__Group__2 ;
    public final void rule__SwitchCaseStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3877:1: ( rule__SwitchCaseStatement__Group__1__Impl rule__SwitchCaseStatement__Group__2 )
            // InternalPortugolParser.g:3878:2: rule__SwitchCaseStatement__Group__1__Impl rule__SwitchCaseStatement__Group__2
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
    // InternalPortugolParser.g:3885:1: rule__SwitchCaseStatement__Group__1__Impl : ( ( rule__SwitchCaseStatement__VariableAssignment_1 ) ) ;
    public final void rule__SwitchCaseStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3889:1: ( ( ( rule__SwitchCaseStatement__VariableAssignment_1 ) ) )
            // InternalPortugolParser.g:3890:1: ( ( rule__SwitchCaseStatement__VariableAssignment_1 ) )
            {
            // InternalPortugolParser.g:3890:1: ( ( rule__SwitchCaseStatement__VariableAssignment_1 ) )
            // InternalPortugolParser.g:3891:2: ( rule__SwitchCaseStatement__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getVariableAssignment_1()); 
            }
            // InternalPortugolParser.g:3892:2: ( rule__SwitchCaseStatement__VariableAssignment_1 )
            // InternalPortugolParser.g:3892:3: rule__SwitchCaseStatement__VariableAssignment_1
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
    // InternalPortugolParser.g:3900:1: rule__SwitchCaseStatement__Group__2 : rule__SwitchCaseStatement__Group__2__Impl rule__SwitchCaseStatement__Group__3 ;
    public final void rule__SwitchCaseStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3904:1: ( rule__SwitchCaseStatement__Group__2__Impl rule__SwitchCaseStatement__Group__3 )
            // InternalPortugolParser.g:3905:2: rule__SwitchCaseStatement__Group__2__Impl rule__SwitchCaseStatement__Group__3
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
    // InternalPortugolParser.g:3912:1: rule__SwitchCaseStatement__Group__2__Impl : ( ( ( rule__SwitchCaseStatement__CaseListAssignment_2 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_2 )* ) ) ;
    public final void rule__SwitchCaseStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3916:1: ( ( ( ( rule__SwitchCaseStatement__CaseListAssignment_2 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_2 )* ) ) )
            // InternalPortugolParser.g:3917:1: ( ( ( rule__SwitchCaseStatement__CaseListAssignment_2 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_2 )* ) )
            {
            // InternalPortugolParser.g:3917:1: ( ( ( rule__SwitchCaseStatement__CaseListAssignment_2 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_2 )* ) )
            // InternalPortugolParser.g:3918:2: ( ( rule__SwitchCaseStatement__CaseListAssignment_2 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_2 )* )
            {
            // InternalPortugolParser.g:3918:2: ( ( rule__SwitchCaseStatement__CaseListAssignment_2 ) )
            // InternalPortugolParser.g:3919:3: ( rule__SwitchCaseStatement__CaseListAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getCaseListAssignment_2()); 
            }
            // InternalPortugolParser.g:3920:3: ( rule__SwitchCaseStatement__CaseListAssignment_2 )
            // InternalPortugolParser.g:3920:4: rule__SwitchCaseStatement__CaseListAssignment_2
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

            // InternalPortugolParser.g:3923:2: ( ( rule__SwitchCaseStatement__CaseListAssignment_2 )* )
            // InternalPortugolParser.g:3924:3: ( rule__SwitchCaseStatement__CaseListAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getCaseListAssignment_2()); 
            }
            // InternalPortugolParser.g:3925:3: ( rule__SwitchCaseStatement__CaseListAssignment_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==Caso) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPortugolParser.g:3925:4: rule__SwitchCaseStatement__CaseListAssignment_2
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__SwitchCaseStatement__CaseListAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalPortugolParser.g:3934:1: rule__SwitchCaseStatement__Group__3 : rule__SwitchCaseStatement__Group__3__Impl rule__SwitchCaseStatement__Group__4 ;
    public final void rule__SwitchCaseStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3938:1: ( rule__SwitchCaseStatement__Group__3__Impl rule__SwitchCaseStatement__Group__4 )
            // InternalPortugolParser.g:3939:2: rule__SwitchCaseStatement__Group__3__Impl rule__SwitchCaseStatement__Group__4
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
    // InternalPortugolParser.g:3946:1: rule__SwitchCaseStatement__Group__3__Impl : ( ( rule__SwitchCaseStatement__OtherCaseAssignment_3 )? ) ;
    public final void rule__SwitchCaseStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3950:1: ( ( ( rule__SwitchCaseStatement__OtherCaseAssignment_3 )? ) )
            // InternalPortugolParser.g:3951:1: ( ( rule__SwitchCaseStatement__OtherCaseAssignment_3 )? )
            {
            // InternalPortugolParser.g:3951:1: ( ( rule__SwitchCaseStatement__OtherCaseAssignment_3 )? )
            // InternalPortugolParser.g:3952:2: ( rule__SwitchCaseStatement__OtherCaseAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getOtherCaseAssignment_3()); 
            }
            // InternalPortugolParser.g:3953:2: ( rule__SwitchCaseStatement__OtherCaseAssignment_3 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Outrocaso) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPortugolParser.g:3953:3: rule__SwitchCaseStatement__OtherCaseAssignment_3
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
    // InternalPortugolParser.g:3961:1: rule__SwitchCaseStatement__Group__4 : rule__SwitchCaseStatement__Group__4__Impl ;
    public final void rule__SwitchCaseStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3965:1: ( rule__SwitchCaseStatement__Group__4__Impl )
            // InternalPortugolParser.g:3966:2: rule__SwitchCaseStatement__Group__4__Impl
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
    // InternalPortugolParser.g:3972:1: rule__SwitchCaseStatement__Group__4__Impl : ( Fimescolha ) ;
    public final void rule__SwitchCaseStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3976:1: ( ( Fimescolha ) )
            // InternalPortugolParser.g:3977:1: ( Fimescolha )
            {
            // InternalPortugolParser.g:3977:1: ( Fimescolha )
            // InternalPortugolParser.g:3978:2: Fimescolha
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
    // InternalPortugolParser.g:3988:1: rule__CaseList__Group__0 : rule__CaseList__Group__0__Impl rule__CaseList__Group__1 ;
    public final void rule__CaseList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3992:1: ( rule__CaseList__Group__0__Impl rule__CaseList__Group__1 )
            // InternalPortugolParser.g:3993:2: rule__CaseList__Group__0__Impl rule__CaseList__Group__1
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
    // InternalPortugolParser.g:4000:1: rule__CaseList__Group__0__Impl : ( Caso ) ;
    public final void rule__CaseList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4004:1: ( ( Caso ) )
            // InternalPortugolParser.g:4005:1: ( Caso )
            {
            // InternalPortugolParser.g:4005:1: ( Caso )
            // InternalPortugolParser.g:4006:2: Caso
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
    // InternalPortugolParser.g:4015:1: rule__CaseList__Group__1 : rule__CaseList__Group__1__Impl rule__CaseList__Group__2 ;
    public final void rule__CaseList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4019:1: ( rule__CaseList__Group__1__Impl rule__CaseList__Group__2 )
            // InternalPortugolParser.g:4020:2: rule__CaseList__Group__1__Impl rule__CaseList__Group__2
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
    // InternalPortugolParser.g:4027:1: rule__CaseList__Group__1__Impl : ( ( rule__CaseList__ExprAssignment_1 ) ) ;
    public final void rule__CaseList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4031:1: ( ( ( rule__CaseList__ExprAssignment_1 ) ) )
            // InternalPortugolParser.g:4032:1: ( ( rule__CaseList__ExprAssignment_1 ) )
            {
            // InternalPortugolParser.g:4032:1: ( ( rule__CaseList__ExprAssignment_1 ) )
            // InternalPortugolParser.g:4033:2: ( rule__CaseList__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getExprAssignment_1()); 
            }
            // InternalPortugolParser.g:4034:2: ( rule__CaseList__ExprAssignment_1 )
            // InternalPortugolParser.g:4034:3: rule__CaseList__ExprAssignment_1
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
    // InternalPortugolParser.g:4042:1: rule__CaseList__Group__2 : rule__CaseList__Group__2__Impl rule__CaseList__Group__3 ;
    public final void rule__CaseList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4046:1: ( rule__CaseList__Group__2__Impl rule__CaseList__Group__3 )
            // InternalPortugolParser.g:4047:2: rule__CaseList__Group__2__Impl rule__CaseList__Group__3
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
    // InternalPortugolParser.g:4054:1: rule__CaseList__Group__2__Impl : ( Colon ) ;
    public final void rule__CaseList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4058:1: ( ( Colon ) )
            // InternalPortugolParser.g:4059:1: ( Colon )
            {
            // InternalPortugolParser.g:4059:1: ( Colon )
            // InternalPortugolParser.g:4060:2: Colon
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
    // InternalPortugolParser.g:4069:1: rule__CaseList__Group__3 : rule__CaseList__Group__3__Impl ;
    public final void rule__CaseList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4073:1: ( rule__CaseList__Group__3__Impl )
            // InternalPortugolParser.g:4074:2: rule__CaseList__Group__3__Impl
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
    // InternalPortugolParser.g:4080:1: rule__CaseList__Group__3__Impl : ( ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* ) ) ;
    public final void rule__CaseList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4084:1: ( ( ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* ) ) )
            // InternalPortugolParser.g:4085:1: ( ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* ) )
            {
            // InternalPortugolParser.g:4085:1: ( ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* ) )
            // InternalPortugolParser.g:4086:2: ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* )
            {
            // InternalPortugolParser.g:4086:2: ( ( rule__CaseList__CommandsAssignment_3 ) )
            // InternalPortugolParser.g:4087:3: ( rule__CaseList__CommandsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugolParser.g:4088:3: ( rule__CaseList__CommandsAssignment_3 )
            // InternalPortugolParser.g:4088:4: rule__CaseList__CommandsAssignment_3
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

            // InternalPortugolParser.g:4091:2: ( ( rule__CaseList__CommandsAssignment_3 )* )
            // InternalPortugolParser.g:4092:3: ( rule__CaseList__CommandsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugolParser.g:4093:3: ( rule__CaseList__CommandsAssignment_3 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==Interrompa||(LA35_0>=Enquanto && LA35_0<=Escreva)||LA35_0==Retorne||(LA35_0>=Maiusc && LA35_0<=Copia)||LA35_0==Raizq||(LA35_0>=Leia && LA35_0<=Para)||LA35_0==NOT||(LA35_0>=Pi && LA35_0<=Se)||LA35_0==LeftParenthesis||LA35_0==HyphenMinus||(LA35_0>=RULE_INT && LA35_0<=RULE_STRING)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalPortugolParser.g:4093:4: rule__CaseList__CommandsAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__CaseList__CommandsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalPortugolParser.g:4103:1: rule__OtherCase__Group__0 : rule__OtherCase__Group__0__Impl rule__OtherCase__Group__1 ;
    public final void rule__OtherCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4107:1: ( rule__OtherCase__Group__0__Impl rule__OtherCase__Group__1 )
            // InternalPortugolParser.g:4108:2: rule__OtherCase__Group__0__Impl rule__OtherCase__Group__1
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
    // InternalPortugolParser.g:4115:1: rule__OtherCase__Group__0__Impl : ( Outrocaso ) ;
    public final void rule__OtherCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4119:1: ( ( Outrocaso ) )
            // InternalPortugolParser.g:4120:1: ( Outrocaso )
            {
            // InternalPortugolParser.g:4120:1: ( Outrocaso )
            // InternalPortugolParser.g:4121:2: Outrocaso
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
    // InternalPortugolParser.g:4130:1: rule__OtherCase__Group__1 : rule__OtherCase__Group__1__Impl rule__OtherCase__Group__2 ;
    public final void rule__OtherCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4134:1: ( rule__OtherCase__Group__1__Impl rule__OtherCase__Group__2 )
            // InternalPortugolParser.g:4135:2: rule__OtherCase__Group__1__Impl rule__OtherCase__Group__2
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
    // InternalPortugolParser.g:4142:1: rule__OtherCase__Group__1__Impl : ( Colon ) ;
    public final void rule__OtherCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4146:1: ( ( Colon ) )
            // InternalPortugolParser.g:4147:1: ( Colon )
            {
            // InternalPortugolParser.g:4147:1: ( Colon )
            // InternalPortugolParser.g:4148:2: Colon
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
    // InternalPortugolParser.g:4157:1: rule__OtherCase__Group__2 : rule__OtherCase__Group__2__Impl ;
    public final void rule__OtherCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4161:1: ( rule__OtherCase__Group__2__Impl )
            // InternalPortugolParser.g:4162:2: rule__OtherCase__Group__2__Impl
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
    // InternalPortugolParser.g:4168:1: rule__OtherCase__Group__2__Impl : ( ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* ) ) ;
    public final void rule__OtherCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4172:1: ( ( ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* ) ) )
            // InternalPortugolParser.g:4173:1: ( ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* ) )
            {
            // InternalPortugolParser.g:4173:1: ( ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* ) )
            // InternalPortugolParser.g:4174:2: ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* )
            {
            // InternalPortugolParser.g:4174:2: ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) )
            // InternalPortugolParser.g:4175:3: ( rule__OtherCase__OtherCaseCommandsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getOtherCaseCommandsAssignment_2()); 
            }
            // InternalPortugolParser.g:4176:3: ( rule__OtherCase__OtherCaseCommandsAssignment_2 )
            // InternalPortugolParser.g:4176:4: rule__OtherCase__OtherCaseCommandsAssignment_2
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

            // InternalPortugolParser.g:4179:2: ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* )
            // InternalPortugolParser.g:4180:3: ( rule__OtherCase__OtherCaseCommandsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getOtherCaseCommandsAssignment_2()); 
            }
            // InternalPortugolParser.g:4181:3: ( rule__OtherCase__OtherCaseCommandsAssignment_2 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==Interrompa||(LA36_0>=Enquanto && LA36_0<=Escreva)||LA36_0==Retorne||(LA36_0>=Maiusc && LA36_0<=Copia)||LA36_0==Raizq||(LA36_0>=Leia && LA36_0<=Para)||LA36_0==NOT||(LA36_0>=Pi && LA36_0<=Se)||LA36_0==LeftParenthesis||LA36_0==HyphenMinus||(LA36_0>=RULE_INT && LA36_0<=RULE_STRING)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalPortugolParser.g:4181:4: rule__OtherCase__OtherCaseCommandsAssignment_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__OtherCase__OtherCaseCommandsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalPortugolParser.g:4191:1: rule__ForStatement__Group__0 : rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1 ;
    public final void rule__ForStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4195:1: ( rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1 )
            // InternalPortugolParser.g:4196:2: rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1
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
    // InternalPortugolParser.g:4203:1: rule__ForStatement__Group__0__Impl : ( Para ) ;
    public final void rule__ForStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4207:1: ( ( Para ) )
            // InternalPortugolParser.g:4208:1: ( Para )
            {
            // InternalPortugolParser.g:4208:1: ( Para )
            // InternalPortugolParser.g:4209:2: Para
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
    // InternalPortugolParser.g:4218:1: rule__ForStatement__Group__1 : rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2 ;
    public final void rule__ForStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4222:1: ( rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2 )
            // InternalPortugolParser.g:4223:2: rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2
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
    // InternalPortugolParser.g:4230:1: rule__ForStatement__Group__1__Impl : ( ( rule__ForStatement__OperatorExprAssignment_1 ) ) ;
    public final void rule__ForStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4234:1: ( ( ( rule__ForStatement__OperatorExprAssignment_1 ) ) )
            // InternalPortugolParser.g:4235:1: ( ( rule__ForStatement__OperatorExprAssignment_1 ) )
            {
            // InternalPortugolParser.g:4235:1: ( ( rule__ForStatement__OperatorExprAssignment_1 ) )
            // InternalPortugolParser.g:4236:2: ( rule__ForStatement__OperatorExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getOperatorExprAssignment_1()); 
            }
            // InternalPortugolParser.g:4237:2: ( rule__ForStatement__OperatorExprAssignment_1 )
            // InternalPortugolParser.g:4237:3: rule__ForStatement__OperatorExprAssignment_1
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
    // InternalPortugolParser.g:4245:1: rule__ForStatement__Group__2 : rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3 ;
    public final void rule__ForStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4249:1: ( rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3 )
            // InternalPortugolParser.g:4250:2: rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3
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
    // InternalPortugolParser.g:4257:1: rule__ForStatement__Group__2__Impl : ( De ) ;
    public final void rule__ForStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4261:1: ( ( De ) )
            // InternalPortugolParser.g:4262:1: ( De )
            {
            // InternalPortugolParser.g:4262:1: ( De )
            // InternalPortugolParser.g:4263:2: De
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
    // InternalPortugolParser.g:4272:1: rule__ForStatement__Group__3 : rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4 ;
    public final void rule__ForStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4276:1: ( rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4 )
            // InternalPortugolParser.g:4277:2: rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4
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
    // InternalPortugolParser.g:4284:1: rule__ForStatement__Group__3__Impl : ( ( rule__ForStatement__StartExprAssignment_3 ) ) ;
    public final void rule__ForStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4288:1: ( ( ( rule__ForStatement__StartExprAssignment_3 ) ) )
            // InternalPortugolParser.g:4289:1: ( ( rule__ForStatement__StartExprAssignment_3 ) )
            {
            // InternalPortugolParser.g:4289:1: ( ( rule__ForStatement__StartExprAssignment_3 ) )
            // InternalPortugolParser.g:4290:2: ( rule__ForStatement__StartExprAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getStartExprAssignment_3()); 
            }
            // InternalPortugolParser.g:4291:2: ( rule__ForStatement__StartExprAssignment_3 )
            // InternalPortugolParser.g:4291:3: rule__ForStatement__StartExprAssignment_3
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
    // InternalPortugolParser.g:4299:1: rule__ForStatement__Group__4 : rule__ForStatement__Group__4__Impl rule__ForStatement__Group__5 ;
    public final void rule__ForStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4303:1: ( rule__ForStatement__Group__4__Impl rule__ForStatement__Group__5 )
            // InternalPortugolParser.g:4304:2: rule__ForStatement__Group__4__Impl rule__ForStatement__Group__5
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
    // InternalPortugolParser.g:4311:1: rule__ForStatement__Group__4__Impl : ( Ate ) ;
    public final void rule__ForStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4315:1: ( ( Ate ) )
            // InternalPortugolParser.g:4316:1: ( Ate )
            {
            // InternalPortugolParser.g:4316:1: ( Ate )
            // InternalPortugolParser.g:4317:2: Ate
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
    // InternalPortugolParser.g:4326:1: rule__ForStatement__Group__5 : rule__ForStatement__Group__5__Impl rule__ForStatement__Group__6 ;
    public final void rule__ForStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4330:1: ( rule__ForStatement__Group__5__Impl rule__ForStatement__Group__6 )
            // InternalPortugolParser.g:4331:2: rule__ForStatement__Group__5__Impl rule__ForStatement__Group__6
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
    // InternalPortugolParser.g:4338:1: rule__ForStatement__Group__5__Impl : ( ( rule__ForStatement__EndExprAssignment_5 ) ) ;
    public final void rule__ForStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4342:1: ( ( ( rule__ForStatement__EndExprAssignment_5 ) ) )
            // InternalPortugolParser.g:4343:1: ( ( rule__ForStatement__EndExprAssignment_5 ) )
            {
            // InternalPortugolParser.g:4343:1: ( ( rule__ForStatement__EndExprAssignment_5 ) )
            // InternalPortugolParser.g:4344:2: ( rule__ForStatement__EndExprAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getEndExprAssignment_5()); 
            }
            // InternalPortugolParser.g:4345:2: ( rule__ForStatement__EndExprAssignment_5 )
            // InternalPortugolParser.g:4345:3: rule__ForStatement__EndExprAssignment_5
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
    // InternalPortugolParser.g:4353:1: rule__ForStatement__Group__6 : rule__ForStatement__Group__6__Impl rule__ForStatement__Group__7 ;
    public final void rule__ForStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4357:1: ( rule__ForStatement__Group__6__Impl rule__ForStatement__Group__7 )
            // InternalPortugolParser.g:4358:2: rule__ForStatement__Group__6__Impl rule__ForStatement__Group__7
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
    // InternalPortugolParser.g:4365:1: rule__ForStatement__Group__6__Impl : ( ( rule__ForStatement__Group_6__0 )? ) ;
    public final void rule__ForStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4369:1: ( ( ( rule__ForStatement__Group_6__0 )? ) )
            // InternalPortugolParser.g:4370:1: ( ( rule__ForStatement__Group_6__0 )? )
            {
            // InternalPortugolParser.g:4370:1: ( ( rule__ForStatement__Group_6__0 )? )
            // InternalPortugolParser.g:4371:2: ( rule__ForStatement__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getGroup_6()); 
            }
            // InternalPortugolParser.g:4372:2: ( rule__ForStatement__Group_6__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Passo) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPortugolParser.g:4372:3: rule__ForStatement__Group_6__0
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
    // InternalPortugolParser.g:4380:1: rule__ForStatement__Group__7 : rule__ForStatement__Group__7__Impl rule__ForStatement__Group__8 ;
    public final void rule__ForStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4384:1: ( rule__ForStatement__Group__7__Impl rule__ForStatement__Group__8 )
            // InternalPortugolParser.g:4385:2: rule__ForStatement__Group__7__Impl rule__ForStatement__Group__8
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
    // InternalPortugolParser.g:4392:1: rule__ForStatement__Group__7__Impl : ( Faca ) ;
    public final void rule__ForStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4396:1: ( ( Faca ) )
            // InternalPortugolParser.g:4397:1: ( Faca )
            {
            // InternalPortugolParser.g:4397:1: ( Faca )
            // InternalPortugolParser.g:4398:2: Faca
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
    // InternalPortugolParser.g:4407:1: rule__ForStatement__Group__8 : rule__ForStatement__Group__8__Impl rule__ForStatement__Group__9 ;
    public final void rule__ForStatement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4411:1: ( rule__ForStatement__Group__8__Impl rule__ForStatement__Group__9 )
            // InternalPortugolParser.g:4412:2: rule__ForStatement__Group__8__Impl rule__ForStatement__Group__9
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
    // InternalPortugolParser.g:4419:1: rule__ForStatement__Group__8__Impl : ( ( ( rule__ForStatement__CommandsAssignment_8 ) ) ( ( rule__ForStatement__CommandsAssignment_8 )* ) ) ;
    public final void rule__ForStatement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4423:1: ( ( ( ( rule__ForStatement__CommandsAssignment_8 ) ) ( ( rule__ForStatement__CommandsAssignment_8 )* ) ) )
            // InternalPortugolParser.g:4424:1: ( ( ( rule__ForStatement__CommandsAssignment_8 ) ) ( ( rule__ForStatement__CommandsAssignment_8 )* ) )
            {
            // InternalPortugolParser.g:4424:1: ( ( ( rule__ForStatement__CommandsAssignment_8 ) ) ( ( rule__ForStatement__CommandsAssignment_8 )* ) )
            // InternalPortugolParser.g:4425:2: ( ( rule__ForStatement__CommandsAssignment_8 ) ) ( ( rule__ForStatement__CommandsAssignment_8 )* )
            {
            // InternalPortugolParser.g:4425:2: ( ( rule__ForStatement__CommandsAssignment_8 ) )
            // InternalPortugolParser.g:4426:3: ( rule__ForStatement__CommandsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getCommandsAssignment_8()); 
            }
            // InternalPortugolParser.g:4427:3: ( rule__ForStatement__CommandsAssignment_8 )
            // InternalPortugolParser.g:4427:4: rule__ForStatement__CommandsAssignment_8
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

            // InternalPortugolParser.g:4430:2: ( ( rule__ForStatement__CommandsAssignment_8 )* )
            // InternalPortugolParser.g:4431:3: ( rule__ForStatement__CommandsAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getCommandsAssignment_8()); 
            }
            // InternalPortugolParser.g:4432:3: ( rule__ForStatement__CommandsAssignment_8 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==Interrompa||(LA38_0>=Enquanto && LA38_0<=Escreva)||LA38_0==Retorne||(LA38_0>=Maiusc && LA38_0<=Copia)||LA38_0==Raizq||(LA38_0>=Leia && LA38_0<=Para)||LA38_0==NOT||(LA38_0>=Pi && LA38_0<=Se)||LA38_0==LeftParenthesis||LA38_0==HyphenMinus||(LA38_0>=RULE_INT && LA38_0<=RULE_STRING)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalPortugolParser.g:4432:4: rule__ForStatement__CommandsAssignment_8
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ForStatement__CommandsAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalPortugolParser.g:4441:1: rule__ForStatement__Group__9 : rule__ForStatement__Group__9__Impl ;
    public final void rule__ForStatement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4445:1: ( rule__ForStatement__Group__9__Impl )
            // InternalPortugolParser.g:4446:2: rule__ForStatement__Group__9__Impl
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
    // InternalPortugolParser.g:4452:1: rule__ForStatement__Group__9__Impl : ( Fimpara ) ;
    public final void rule__ForStatement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4456:1: ( ( Fimpara ) )
            // InternalPortugolParser.g:4457:1: ( Fimpara )
            {
            // InternalPortugolParser.g:4457:1: ( Fimpara )
            // InternalPortugolParser.g:4458:2: Fimpara
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
    // InternalPortugolParser.g:4468:1: rule__ForStatement__Group_6__0 : rule__ForStatement__Group_6__0__Impl rule__ForStatement__Group_6__1 ;
    public final void rule__ForStatement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4472:1: ( rule__ForStatement__Group_6__0__Impl rule__ForStatement__Group_6__1 )
            // InternalPortugolParser.g:4473:2: rule__ForStatement__Group_6__0__Impl rule__ForStatement__Group_6__1
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
    // InternalPortugolParser.g:4480:1: rule__ForStatement__Group_6__0__Impl : ( Passo ) ;
    public final void rule__ForStatement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4484:1: ( ( Passo ) )
            // InternalPortugolParser.g:4485:1: ( Passo )
            {
            // InternalPortugolParser.g:4485:1: ( Passo )
            // InternalPortugolParser.g:4486:2: Passo
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
    // InternalPortugolParser.g:4495:1: rule__ForStatement__Group_6__1 : rule__ForStatement__Group_6__1__Impl ;
    public final void rule__ForStatement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4499:1: ( rule__ForStatement__Group_6__1__Impl )
            // InternalPortugolParser.g:4500:2: rule__ForStatement__Group_6__1__Impl
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
    // InternalPortugolParser.g:4506:1: rule__ForStatement__Group_6__1__Impl : ( ( rule__ForStatement__StepExpeAssignment_6_1 ) ) ;
    public final void rule__ForStatement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4510:1: ( ( ( rule__ForStatement__StepExpeAssignment_6_1 ) ) )
            // InternalPortugolParser.g:4511:1: ( ( rule__ForStatement__StepExpeAssignment_6_1 ) )
            {
            // InternalPortugolParser.g:4511:1: ( ( rule__ForStatement__StepExpeAssignment_6_1 ) )
            // InternalPortugolParser.g:4512:2: ( rule__ForStatement__StepExpeAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getStepExpeAssignment_6_1()); 
            }
            // InternalPortugolParser.g:4513:2: ( rule__ForStatement__StepExpeAssignment_6_1 )
            // InternalPortugolParser.g:4513:3: rule__ForStatement__StepExpeAssignment_6_1
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
    // InternalPortugolParser.g:4522:1: rule__WhileStatement__Group__0 : rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 ;
    public final void rule__WhileStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4526:1: ( rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 )
            // InternalPortugolParser.g:4527:2: rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1
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
    // InternalPortugolParser.g:4534:1: rule__WhileStatement__Group__0__Impl : ( Enquanto ) ;
    public final void rule__WhileStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4538:1: ( ( Enquanto ) )
            // InternalPortugolParser.g:4539:1: ( Enquanto )
            {
            // InternalPortugolParser.g:4539:1: ( Enquanto )
            // InternalPortugolParser.g:4540:2: Enquanto
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
    // InternalPortugolParser.g:4549:1: rule__WhileStatement__Group__1 : rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 ;
    public final void rule__WhileStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4553:1: ( rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 )
            // InternalPortugolParser.g:4554:2: rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2
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
    // InternalPortugolParser.g:4561:1: rule__WhileStatement__Group__1__Impl : ( ( rule__WhileStatement__WhileExprAssignment_1 ) ) ;
    public final void rule__WhileStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4565:1: ( ( ( rule__WhileStatement__WhileExprAssignment_1 ) ) )
            // InternalPortugolParser.g:4566:1: ( ( rule__WhileStatement__WhileExprAssignment_1 ) )
            {
            // InternalPortugolParser.g:4566:1: ( ( rule__WhileStatement__WhileExprAssignment_1 ) )
            // InternalPortugolParser.g:4567:2: ( rule__WhileStatement__WhileExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getWhileExprAssignment_1()); 
            }
            // InternalPortugolParser.g:4568:2: ( rule__WhileStatement__WhileExprAssignment_1 )
            // InternalPortugolParser.g:4568:3: rule__WhileStatement__WhileExprAssignment_1
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
    // InternalPortugolParser.g:4576:1: rule__WhileStatement__Group__2 : rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 ;
    public final void rule__WhileStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4580:1: ( rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 )
            // InternalPortugolParser.g:4581:2: rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3
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
    // InternalPortugolParser.g:4588:1: rule__WhileStatement__Group__2__Impl : ( Faca ) ;
    public final void rule__WhileStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4592:1: ( ( Faca ) )
            // InternalPortugolParser.g:4593:1: ( Faca )
            {
            // InternalPortugolParser.g:4593:1: ( Faca )
            // InternalPortugolParser.g:4594:2: Faca
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
    // InternalPortugolParser.g:4603:1: rule__WhileStatement__Group__3 : rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 ;
    public final void rule__WhileStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4607:1: ( rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 )
            // InternalPortugolParser.g:4608:2: rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4
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
    // InternalPortugolParser.g:4615:1: rule__WhileStatement__Group__3__Impl : ( ( ( rule__WhileStatement__CommandsAssignment_3 ) ) ( ( rule__WhileStatement__CommandsAssignment_3 )* ) ) ;
    public final void rule__WhileStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4619:1: ( ( ( ( rule__WhileStatement__CommandsAssignment_3 ) ) ( ( rule__WhileStatement__CommandsAssignment_3 )* ) ) )
            // InternalPortugolParser.g:4620:1: ( ( ( rule__WhileStatement__CommandsAssignment_3 ) ) ( ( rule__WhileStatement__CommandsAssignment_3 )* ) )
            {
            // InternalPortugolParser.g:4620:1: ( ( ( rule__WhileStatement__CommandsAssignment_3 ) ) ( ( rule__WhileStatement__CommandsAssignment_3 )* ) )
            // InternalPortugolParser.g:4621:2: ( ( rule__WhileStatement__CommandsAssignment_3 ) ) ( ( rule__WhileStatement__CommandsAssignment_3 )* )
            {
            // InternalPortugolParser.g:4621:2: ( ( rule__WhileStatement__CommandsAssignment_3 ) )
            // InternalPortugolParser.g:4622:3: ( rule__WhileStatement__CommandsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugolParser.g:4623:3: ( rule__WhileStatement__CommandsAssignment_3 )
            // InternalPortugolParser.g:4623:4: rule__WhileStatement__CommandsAssignment_3
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

            // InternalPortugolParser.g:4626:2: ( ( rule__WhileStatement__CommandsAssignment_3 )* )
            // InternalPortugolParser.g:4627:3: ( rule__WhileStatement__CommandsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugolParser.g:4628:3: ( rule__WhileStatement__CommandsAssignment_3 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==Interrompa||(LA39_0>=Enquanto && LA39_0<=Escreva)||LA39_0==Retorne||(LA39_0>=Maiusc && LA39_0<=Copia)||LA39_0==Raizq||(LA39_0>=Leia && LA39_0<=Para)||LA39_0==NOT||(LA39_0>=Pi && LA39_0<=Se)||LA39_0==LeftParenthesis||LA39_0==HyphenMinus||(LA39_0>=RULE_INT && LA39_0<=RULE_STRING)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalPortugolParser.g:4628:4: rule__WhileStatement__CommandsAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__WhileStatement__CommandsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalPortugolParser.g:4637:1: rule__WhileStatement__Group__4 : rule__WhileStatement__Group__4__Impl ;
    public final void rule__WhileStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4641:1: ( rule__WhileStatement__Group__4__Impl )
            // InternalPortugolParser.g:4642:2: rule__WhileStatement__Group__4__Impl
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
    // InternalPortugolParser.g:4648:1: rule__WhileStatement__Group__4__Impl : ( Fimenquanto ) ;
    public final void rule__WhileStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4652:1: ( ( Fimenquanto ) )
            // InternalPortugolParser.g:4653:1: ( Fimenquanto )
            {
            // InternalPortugolParser.g:4653:1: ( Fimenquanto )
            // InternalPortugolParser.g:4654:2: Fimenquanto
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
    // InternalPortugolParser.g:4664:1: rule__RepeatStatement__Group__0 : rule__RepeatStatement__Group__0__Impl rule__RepeatStatement__Group__1 ;
    public final void rule__RepeatStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4668:1: ( rule__RepeatStatement__Group__0__Impl rule__RepeatStatement__Group__1 )
            // InternalPortugolParser.g:4669:2: rule__RepeatStatement__Group__0__Impl rule__RepeatStatement__Group__1
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
    // InternalPortugolParser.g:4676:1: rule__RepeatStatement__Group__0__Impl : ( Repita ) ;
    public final void rule__RepeatStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4680:1: ( ( Repita ) )
            // InternalPortugolParser.g:4681:1: ( Repita )
            {
            // InternalPortugolParser.g:4681:1: ( Repita )
            // InternalPortugolParser.g:4682:2: Repita
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
    // InternalPortugolParser.g:4691:1: rule__RepeatStatement__Group__1 : rule__RepeatStatement__Group__1__Impl rule__RepeatStatement__Group__2 ;
    public final void rule__RepeatStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4695:1: ( rule__RepeatStatement__Group__1__Impl rule__RepeatStatement__Group__2 )
            // InternalPortugolParser.g:4696:2: rule__RepeatStatement__Group__1__Impl rule__RepeatStatement__Group__2
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
    // InternalPortugolParser.g:4703:1: rule__RepeatStatement__Group__1__Impl : ( ( ( rule__RepeatStatement__CommandsAssignment_1 ) ) ( ( rule__RepeatStatement__CommandsAssignment_1 )* ) ) ;
    public final void rule__RepeatStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4707:1: ( ( ( ( rule__RepeatStatement__CommandsAssignment_1 ) ) ( ( rule__RepeatStatement__CommandsAssignment_1 )* ) ) )
            // InternalPortugolParser.g:4708:1: ( ( ( rule__RepeatStatement__CommandsAssignment_1 ) ) ( ( rule__RepeatStatement__CommandsAssignment_1 )* ) )
            {
            // InternalPortugolParser.g:4708:1: ( ( ( rule__RepeatStatement__CommandsAssignment_1 ) ) ( ( rule__RepeatStatement__CommandsAssignment_1 )* ) )
            // InternalPortugolParser.g:4709:2: ( ( rule__RepeatStatement__CommandsAssignment_1 ) ) ( ( rule__RepeatStatement__CommandsAssignment_1 )* )
            {
            // InternalPortugolParser.g:4709:2: ( ( rule__RepeatStatement__CommandsAssignment_1 ) )
            // InternalPortugolParser.g:4710:3: ( rule__RepeatStatement__CommandsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatStatementAccess().getCommandsAssignment_1()); 
            }
            // InternalPortugolParser.g:4711:3: ( rule__RepeatStatement__CommandsAssignment_1 )
            // InternalPortugolParser.g:4711:4: rule__RepeatStatement__CommandsAssignment_1
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

            // InternalPortugolParser.g:4714:2: ( ( rule__RepeatStatement__CommandsAssignment_1 )* )
            // InternalPortugolParser.g:4715:3: ( rule__RepeatStatement__CommandsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatStatementAccess().getCommandsAssignment_1()); 
            }
            // InternalPortugolParser.g:4716:3: ( rule__RepeatStatement__CommandsAssignment_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==Interrompa||(LA40_0>=Enquanto && LA40_0<=Escreva)||LA40_0==Retorne||(LA40_0>=Maiusc && LA40_0<=Copia)||LA40_0==Raizq||(LA40_0>=Leia && LA40_0<=Para)||LA40_0==NOT||(LA40_0>=Pi && LA40_0<=Se)||LA40_0==LeftParenthesis||LA40_0==HyphenMinus||(LA40_0>=RULE_INT && LA40_0<=RULE_STRING)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPortugolParser.g:4716:4: rule__RepeatStatement__CommandsAssignment_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__RepeatStatement__CommandsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalPortugolParser.g:4725:1: rule__RepeatStatement__Group__2 : rule__RepeatStatement__Group__2__Impl rule__RepeatStatement__Group__3 ;
    public final void rule__RepeatStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4729:1: ( rule__RepeatStatement__Group__2__Impl rule__RepeatStatement__Group__3 )
            // InternalPortugolParser.g:4730:2: rule__RepeatStatement__Group__2__Impl rule__RepeatStatement__Group__3
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
    // InternalPortugolParser.g:4737:1: rule__RepeatStatement__Group__2__Impl : ( Ate ) ;
    public final void rule__RepeatStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4741:1: ( ( Ate ) )
            // InternalPortugolParser.g:4742:1: ( Ate )
            {
            // InternalPortugolParser.g:4742:1: ( Ate )
            // InternalPortugolParser.g:4743:2: Ate
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
    // InternalPortugolParser.g:4752:1: rule__RepeatStatement__Group__3 : rule__RepeatStatement__Group__3__Impl rule__RepeatStatement__Group__4 ;
    public final void rule__RepeatStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4756:1: ( rule__RepeatStatement__Group__3__Impl rule__RepeatStatement__Group__4 )
            // InternalPortugolParser.g:4757:2: rule__RepeatStatement__Group__3__Impl rule__RepeatStatement__Group__4
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
    // InternalPortugolParser.g:4764:1: rule__RepeatStatement__Group__3__Impl : ( ( rule__RepeatStatement__UntilExprAssignment_3 ) ) ;
    public final void rule__RepeatStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4768:1: ( ( ( rule__RepeatStatement__UntilExprAssignment_3 ) ) )
            // InternalPortugolParser.g:4769:1: ( ( rule__RepeatStatement__UntilExprAssignment_3 ) )
            {
            // InternalPortugolParser.g:4769:1: ( ( rule__RepeatStatement__UntilExprAssignment_3 ) )
            // InternalPortugolParser.g:4770:2: ( rule__RepeatStatement__UntilExprAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatStatementAccess().getUntilExprAssignment_3()); 
            }
            // InternalPortugolParser.g:4771:2: ( rule__RepeatStatement__UntilExprAssignment_3 )
            // InternalPortugolParser.g:4771:3: rule__RepeatStatement__UntilExprAssignment_3
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
    // InternalPortugolParser.g:4779:1: rule__RepeatStatement__Group__4 : rule__RepeatStatement__Group__4__Impl ;
    public final void rule__RepeatStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4783:1: ( rule__RepeatStatement__Group__4__Impl )
            // InternalPortugolParser.g:4784:2: rule__RepeatStatement__Group__4__Impl
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
    // InternalPortugolParser.g:4790:1: rule__RepeatStatement__Group__4__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__RepeatStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4794:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugolParser.g:4795:1: ( ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:4795:1: ( ruleEND_COMMAND )
            // InternalPortugolParser.g:4796:2: ruleEND_COMMAND
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
    // InternalPortugolParser.g:4806:1: rule__SubprogramParam__Group__0 : rule__SubprogramParam__Group__0__Impl rule__SubprogramParam__Group__1 ;
    public final void rule__SubprogramParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4810:1: ( rule__SubprogramParam__Group__0__Impl rule__SubprogramParam__Group__1 )
            // InternalPortugolParser.g:4811:2: rule__SubprogramParam__Group__0__Impl rule__SubprogramParam__Group__1
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
    // InternalPortugolParser.g:4818:1: rule__SubprogramParam__Group__0__Impl : ( ( rule__SubprogramParam__ExpressionAssignment_0 ) ) ;
    public final void rule__SubprogramParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4822:1: ( ( ( rule__SubprogramParam__ExpressionAssignment_0 ) ) )
            // InternalPortugolParser.g:4823:1: ( ( rule__SubprogramParam__ExpressionAssignment_0 ) )
            {
            // InternalPortugolParser.g:4823:1: ( ( rule__SubprogramParam__ExpressionAssignment_0 ) )
            // InternalPortugolParser.g:4824:2: ( rule__SubprogramParam__ExpressionAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamAccess().getExpressionAssignment_0()); 
            }
            // InternalPortugolParser.g:4825:2: ( rule__SubprogramParam__ExpressionAssignment_0 )
            // InternalPortugolParser.g:4825:3: rule__SubprogramParam__ExpressionAssignment_0
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
    // InternalPortugolParser.g:4833:1: rule__SubprogramParam__Group__1 : rule__SubprogramParam__Group__1__Impl ;
    public final void rule__SubprogramParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4837:1: ( rule__SubprogramParam__Group__1__Impl )
            // InternalPortugolParser.g:4838:2: rule__SubprogramParam__Group__1__Impl
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
    // InternalPortugolParser.g:4844:1: rule__SubprogramParam__Group__1__Impl : ( ( rule__SubprogramParam__Group_1__0 )* ) ;
    public final void rule__SubprogramParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4848:1: ( ( ( rule__SubprogramParam__Group_1__0 )* ) )
            // InternalPortugolParser.g:4849:1: ( ( rule__SubprogramParam__Group_1__0 )* )
            {
            // InternalPortugolParser.g:4849:1: ( ( rule__SubprogramParam__Group_1__0 )* )
            // InternalPortugolParser.g:4850:2: ( rule__SubprogramParam__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:4851:2: ( rule__SubprogramParam__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==Comma) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPortugolParser.g:4851:3: rule__SubprogramParam__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__SubprogramParam__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalPortugolParser.g:4860:1: rule__SubprogramParam__Group_1__0 : rule__SubprogramParam__Group_1__0__Impl rule__SubprogramParam__Group_1__1 ;
    public final void rule__SubprogramParam__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4864:1: ( rule__SubprogramParam__Group_1__0__Impl rule__SubprogramParam__Group_1__1 )
            // InternalPortugolParser.g:4865:2: rule__SubprogramParam__Group_1__0__Impl rule__SubprogramParam__Group_1__1
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
    // InternalPortugolParser.g:4872:1: rule__SubprogramParam__Group_1__0__Impl : ( Comma ) ;
    public final void rule__SubprogramParam__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4876:1: ( ( Comma ) )
            // InternalPortugolParser.g:4877:1: ( Comma )
            {
            // InternalPortugolParser.g:4877:1: ( Comma )
            // InternalPortugolParser.g:4878:2: Comma
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
    // InternalPortugolParser.g:4887:1: rule__SubprogramParam__Group_1__1 : rule__SubprogramParam__Group_1__1__Impl ;
    public final void rule__SubprogramParam__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4891:1: ( rule__SubprogramParam__Group_1__1__Impl )
            // InternalPortugolParser.g:4892:2: rule__SubprogramParam__Group_1__1__Impl
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
    // InternalPortugolParser.g:4898:1: rule__SubprogramParam__Group_1__1__Impl : ( ( rule__SubprogramParam__ExpressionAssignment_1_1 ) ) ;
    public final void rule__SubprogramParam__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4902:1: ( ( ( rule__SubprogramParam__ExpressionAssignment_1_1 ) ) )
            // InternalPortugolParser.g:4903:1: ( ( rule__SubprogramParam__ExpressionAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:4903:1: ( ( rule__SubprogramParam__ExpressionAssignment_1_1 ) )
            // InternalPortugolParser.g:4904:2: ( rule__SubprogramParam__ExpressionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamAccess().getExpressionAssignment_1_1()); 
            }
            // InternalPortugolParser.g:4905:2: ( rule__SubprogramParam__ExpressionAssignment_1_1 )
            // InternalPortugolParser.g:4905:3: rule__SubprogramParam__ExpressionAssignment_1_1
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
    // InternalPortugolParser.g:4914:1: rule__ReadCommand__Group__0 : rule__ReadCommand__Group__0__Impl rule__ReadCommand__Group__1 ;
    public final void rule__ReadCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4918:1: ( rule__ReadCommand__Group__0__Impl rule__ReadCommand__Group__1 )
            // InternalPortugolParser.g:4919:2: rule__ReadCommand__Group__0__Impl rule__ReadCommand__Group__1
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
    // InternalPortugolParser.g:4926:1: rule__ReadCommand__Group__0__Impl : ( Leia ) ;
    public final void rule__ReadCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4930:1: ( ( Leia ) )
            // InternalPortugolParser.g:4931:1: ( Leia )
            {
            // InternalPortugolParser.g:4931:1: ( Leia )
            // InternalPortugolParser.g:4932:2: Leia
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
    // InternalPortugolParser.g:4941:1: rule__ReadCommand__Group__1 : rule__ReadCommand__Group__1__Impl rule__ReadCommand__Group__2 ;
    public final void rule__ReadCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4945:1: ( rule__ReadCommand__Group__1__Impl rule__ReadCommand__Group__2 )
            // InternalPortugolParser.g:4946:2: rule__ReadCommand__Group__1__Impl rule__ReadCommand__Group__2
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
    // InternalPortugolParser.g:4953:1: rule__ReadCommand__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__ReadCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4957:1: ( ( LeftParenthesis ) )
            // InternalPortugolParser.g:4958:1: ( LeftParenthesis )
            {
            // InternalPortugolParser.g:4958:1: ( LeftParenthesis )
            // InternalPortugolParser.g:4959:2: LeftParenthesis
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
    // InternalPortugolParser.g:4968:1: rule__ReadCommand__Group__2 : rule__ReadCommand__Group__2__Impl rule__ReadCommand__Group__3 ;
    public final void rule__ReadCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4972:1: ( rule__ReadCommand__Group__2__Impl rule__ReadCommand__Group__3 )
            // InternalPortugolParser.g:4973:2: rule__ReadCommand__Group__2__Impl rule__ReadCommand__Group__3
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
    // InternalPortugolParser.g:4980:1: rule__ReadCommand__Group__2__Impl : ( ( rule__ReadCommand__ParamListAssignment_2 ) ) ;
    public final void rule__ReadCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4984:1: ( ( ( rule__ReadCommand__ParamListAssignment_2 ) ) )
            // InternalPortugolParser.g:4985:1: ( ( rule__ReadCommand__ParamListAssignment_2 ) )
            {
            // InternalPortugolParser.g:4985:1: ( ( rule__ReadCommand__ParamListAssignment_2 ) )
            // InternalPortugolParser.g:4986:2: ( rule__ReadCommand__ParamListAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getParamListAssignment_2()); 
            }
            // InternalPortugolParser.g:4987:2: ( rule__ReadCommand__ParamListAssignment_2 )
            // InternalPortugolParser.g:4987:3: rule__ReadCommand__ParamListAssignment_2
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
    // InternalPortugolParser.g:4995:1: rule__ReadCommand__Group__3 : rule__ReadCommand__Group__3__Impl ;
    public final void rule__ReadCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4999:1: ( rule__ReadCommand__Group__3__Impl )
            // InternalPortugolParser.g:5000:2: rule__ReadCommand__Group__3__Impl
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
    // InternalPortugolParser.g:5006:1: rule__ReadCommand__Group__3__Impl : ( RightParenthesis ) ;
    public final void rule__ReadCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5010:1: ( ( RightParenthesis ) )
            // InternalPortugolParser.g:5011:1: ( RightParenthesis )
            {
            // InternalPortugolParser.g:5011:1: ( RightParenthesis )
            // InternalPortugolParser.g:5012:2: RightParenthesis
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
    // InternalPortugolParser.g:5022:1: rule__WriteCommand__Group__0 : rule__WriteCommand__Group__0__Impl rule__WriteCommand__Group__1 ;
    public final void rule__WriteCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5026:1: ( rule__WriteCommand__Group__0__Impl rule__WriteCommand__Group__1 )
            // InternalPortugolParser.g:5027:2: rule__WriteCommand__Group__0__Impl rule__WriteCommand__Group__1
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
    // InternalPortugolParser.g:5034:1: rule__WriteCommand__Group__0__Impl : ( ( rule__WriteCommand__WriteCommandAssignment_0 ) ) ;
    public final void rule__WriteCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5038:1: ( ( ( rule__WriteCommand__WriteCommandAssignment_0 ) ) )
            // InternalPortugolParser.g:5039:1: ( ( rule__WriteCommand__WriteCommandAssignment_0 ) )
            {
            // InternalPortugolParser.g:5039:1: ( ( rule__WriteCommand__WriteCommandAssignment_0 ) )
            // InternalPortugolParser.g:5040:2: ( rule__WriteCommand__WriteCommandAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getWriteCommandAssignment_0()); 
            }
            // InternalPortugolParser.g:5041:2: ( rule__WriteCommand__WriteCommandAssignment_0 )
            // InternalPortugolParser.g:5041:3: rule__WriteCommand__WriteCommandAssignment_0
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
    // InternalPortugolParser.g:5049:1: rule__WriteCommand__Group__1 : rule__WriteCommand__Group__1__Impl rule__WriteCommand__Group__2 ;
    public final void rule__WriteCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5053:1: ( rule__WriteCommand__Group__1__Impl rule__WriteCommand__Group__2 )
            // InternalPortugolParser.g:5054:2: rule__WriteCommand__Group__1__Impl rule__WriteCommand__Group__2
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
    // InternalPortugolParser.g:5061:1: rule__WriteCommand__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__WriteCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5065:1: ( ( LeftParenthesis ) )
            // InternalPortugolParser.g:5066:1: ( LeftParenthesis )
            {
            // InternalPortugolParser.g:5066:1: ( LeftParenthesis )
            // InternalPortugolParser.g:5067:2: LeftParenthesis
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
    // InternalPortugolParser.g:5076:1: rule__WriteCommand__Group__2 : rule__WriteCommand__Group__2__Impl rule__WriteCommand__Group__3 ;
    public final void rule__WriteCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5080:1: ( rule__WriteCommand__Group__2__Impl rule__WriteCommand__Group__3 )
            // InternalPortugolParser.g:5081:2: rule__WriteCommand__Group__2__Impl rule__WriteCommand__Group__3
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
    // InternalPortugolParser.g:5088:1: rule__WriteCommand__Group__2__Impl : ( ( rule__WriteCommand__WriteParamAssignment_2 ) ) ;
    public final void rule__WriteCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5092:1: ( ( ( rule__WriteCommand__WriteParamAssignment_2 ) ) )
            // InternalPortugolParser.g:5093:1: ( ( rule__WriteCommand__WriteParamAssignment_2 ) )
            {
            // InternalPortugolParser.g:5093:1: ( ( rule__WriteCommand__WriteParamAssignment_2 ) )
            // InternalPortugolParser.g:5094:2: ( rule__WriteCommand__WriteParamAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getWriteParamAssignment_2()); 
            }
            // InternalPortugolParser.g:5095:2: ( rule__WriteCommand__WriteParamAssignment_2 )
            // InternalPortugolParser.g:5095:3: rule__WriteCommand__WriteParamAssignment_2
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
    // InternalPortugolParser.g:5103:1: rule__WriteCommand__Group__3 : rule__WriteCommand__Group__3__Impl ;
    public final void rule__WriteCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5107:1: ( rule__WriteCommand__Group__3__Impl )
            // InternalPortugolParser.g:5108:2: rule__WriteCommand__Group__3__Impl
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
    // InternalPortugolParser.g:5114:1: rule__WriteCommand__Group__3__Impl : ( RightParenthesis ) ;
    public final void rule__WriteCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5118:1: ( ( RightParenthesis ) )
            // InternalPortugolParser.g:5119:1: ( RightParenthesis )
            {
            // InternalPortugolParser.g:5119:1: ( RightParenthesis )
            // InternalPortugolParser.g:5120:2: RightParenthesis
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
    // InternalPortugolParser.g:5130:1: rule__WriteParam__Group__0 : rule__WriteParam__Group__0__Impl rule__WriteParam__Group__1 ;
    public final void rule__WriteParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5134:1: ( rule__WriteParam__Group__0__Impl rule__WriteParam__Group__1 )
            // InternalPortugolParser.g:5135:2: rule__WriteParam__Group__0__Impl rule__WriteParam__Group__1
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
    // InternalPortugolParser.g:5142:1: rule__WriteParam__Group__0__Impl : ( ( rule__WriteParam__ParamsAssignment_0 ) ) ;
    public final void rule__WriteParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5146:1: ( ( ( rule__WriteParam__ParamsAssignment_0 ) ) )
            // InternalPortugolParser.g:5147:1: ( ( rule__WriteParam__ParamsAssignment_0 ) )
            {
            // InternalPortugolParser.g:5147:1: ( ( rule__WriteParam__ParamsAssignment_0 ) )
            // InternalPortugolParser.g:5148:2: ( rule__WriteParam__ParamsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getParamsAssignment_0()); 
            }
            // InternalPortugolParser.g:5149:2: ( rule__WriteParam__ParamsAssignment_0 )
            // InternalPortugolParser.g:5149:3: rule__WriteParam__ParamsAssignment_0
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
    // InternalPortugolParser.g:5157:1: rule__WriteParam__Group__1 : rule__WriteParam__Group__1__Impl ;
    public final void rule__WriteParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5161:1: ( rule__WriteParam__Group__1__Impl )
            // InternalPortugolParser.g:5162:2: rule__WriteParam__Group__1__Impl
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
    // InternalPortugolParser.g:5168:1: rule__WriteParam__Group__1__Impl : ( ( rule__WriteParam__PrecisionAssignment_1 )? ) ;
    public final void rule__WriteParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5172:1: ( ( ( rule__WriteParam__PrecisionAssignment_1 )? ) )
            // InternalPortugolParser.g:5173:1: ( ( rule__WriteParam__PrecisionAssignment_1 )? )
            {
            // InternalPortugolParser.g:5173:1: ( ( rule__WriteParam__PrecisionAssignment_1 )? )
            // InternalPortugolParser.g:5174:2: ( rule__WriteParam__PrecisionAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getPrecisionAssignment_1()); 
            }
            // InternalPortugolParser.g:5175:2: ( rule__WriteParam__PrecisionAssignment_1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Colon) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalPortugolParser.g:5175:3: rule__WriteParam__PrecisionAssignment_1
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
    // InternalPortugolParser.g:5184:1: rule__OptDecimalPrecision__Group__0 : rule__OptDecimalPrecision__Group__0__Impl rule__OptDecimalPrecision__Group__1 ;
    public final void rule__OptDecimalPrecision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5188:1: ( rule__OptDecimalPrecision__Group__0__Impl rule__OptDecimalPrecision__Group__1 )
            // InternalPortugolParser.g:5189:2: rule__OptDecimalPrecision__Group__0__Impl rule__OptDecimalPrecision__Group__1
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
    // InternalPortugolParser.g:5196:1: rule__OptDecimalPrecision__Group__0__Impl : ( Colon ) ;
    public final void rule__OptDecimalPrecision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5200:1: ( ( Colon ) )
            // InternalPortugolParser.g:5201:1: ( Colon )
            {
            // InternalPortugolParser.g:5201:1: ( Colon )
            // InternalPortugolParser.g:5202:2: Colon
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
    // InternalPortugolParser.g:5211:1: rule__OptDecimalPrecision__Group__1 : rule__OptDecimalPrecision__Group__1__Impl rule__OptDecimalPrecision__Group__2 ;
    public final void rule__OptDecimalPrecision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5215:1: ( rule__OptDecimalPrecision__Group__1__Impl rule__OptDecimalPrecision__Group__2 )
            // InternalPortugolParser.g:5216:2: rule__OptDecimalPrecision__Group__1__Impl rule__OptDecimalPrecision__Group__2
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
    // InternalPortugolParser.g:5223:1: rule__OptDecimalPrecision__Group__1__Impl : ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) ) ;
    public final void rule__OptDecimalPrecision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5227:1: ( ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) ) )
            // InternalPortugolParser.g:5228:1: ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) )
            {
            // InternalPortugolParser.g:5228:1: ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) )
            // InternalPortugolParser.g:5229:2: ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getFirstPrecisionAssignment_1()); 
            }
            // InternalPortugolParser.g:5230:2: ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 )
            // InternalPortugolParser.g:5230:3: rule__OptDecimalPrecision__FirstPrecisionAssignment_1
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
    // InternalPortugolParser.g:5238:1: rule__OptDecimalPrecision__Group__2 : rule__OptDecimalPrecision__Group__2__Impl ;
    public final void rule__OptDecimalPrecision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5242:1: ( rule__OptDecimalPrecision__Group__2__Impl )
            // InternalPortugolParser.g:5243:2: rule__OptDecimalPrecision__Group__2__Impl
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
    // InternalPortugolParser.g:5249:1: rule__OptDecimalPrecision__Group__2__Impl : ( ( rule__OptDecimalPrecision__Group_2__0 )? ) ;
    public final void rule__OptDecimalPrecision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5253:1: ( ( ( rule__OptDecimalPrecision__Group_2__0 )? ) )
            // InternalPortugolParser.g:5254:1: ( ( rule__OptDecimalPrecision__Group_2__0 )? )
            {
            // InternalPortugolParser.g:5254:1: ( ( rule__OptDecimalPrecision__Group_2__0 )? )
            // InternalPortugolParser.g:5255:2: ( rule__OptDecimalPrecision__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getGroup_2()); 
            }
            // InternalPortugolParser.g:5256:2: ( rule__OptDecimalPrecision__Group_2__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Colon) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPortugolParser.g:5256:3: rule__OptDecimalPrecision__Group_2__0
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
    // InternalPortugolParser.g:5265:1: rule__OptDecimalPrecision__Group_2__0 : rule__OptDecimalPrecision__Group_2__0__Impl rule__OptDecimalPrecision__Group_2__1 ;
    public final void rule__OptDecimalPrecision__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5269:1: ( rule__OptDecimalPrecision__Group_2__0__Impl rule__OptDecimalPrecision__Group_2__1 )
            // InternalPortugolParser.g:5270:2: rule__OptDecimalPrecision__Group_2__0__Impl rule__OptDecimalPrecision__Group_2__1
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
    // InternalPortugolParser.g:5277:1: rule__OptDecimalPrecision__Group_2__0__Impl : ( Colon ) ;
    public final void rule__OptDecimalPrecision__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5281:1: ( ( Colon ) )
            // InternalPortugolParser.g:5282:1: ( Colon )
            {
            // InternalPortugolParser.g:5282:1: ( Colon )
            // InternalPortugolParser.g:5283:2: Colon
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
    // InternalPortugolParser.g:5292:1: rule__OptDecimalPrecision__Group_2__1 : rule__OptDecimalPrecision__Group_2__1__Impl ;
    public final void rule__OptDecimalPrecision__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5296:1: ( rule__OptDecimalPrecision__Group_2__1__Impl )
            // InternalPortugolParser.g:5297:2: rule__OptDecimalPrecision__Group_2__1__Impl
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
    // InternalPortugolParser.g:5303:1: rule__OptDecimalPrecision__Group_2__1__Impl : ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) ) ;
    public final void rule__OptDecimalPrecision__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5307:1: ( ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) ) )
            // InternalPortugolParser.g:5308:1: ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) )
            {
            // InternalPortugolParser.g:5308:1: ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) )
            // InternalPortugolParser.g:5309:2: ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getSecondPrecisionAssignment_2_1()); 
            }
            // InternalPortugolParser.g:5310:2: ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 )
            // InternalPortugolParser.g:5310:3: rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1
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
    // InternalPortugolParser.g:5319:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5323:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalPortugolParser.g:5324:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
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
    // InternalPortugolParser.g:5331:1: rule__Assignment__Group__0__Impl : ( ruleOrExpression ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5335:1: ( ( ruleOrExpression ) )
            // InternalPortugolParser.g:5336:1: ( ruleOrExpression )
            {
            // InternalPortugolParser.g:5336:1: ( ruleOrExpression )
            // InternalPortugolParser.g:5337:2: ruleOrExpression
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
    // InternalPortugolParser.g:5346:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5350:1: ( rule__Assignment__Group__1__Impl )
            // InternalPortugolParser.g:5351:2: rule__Assignment__Group__1__Impl
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
    // InternalPortugolParser.g:5357:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__Group_1__0 )* ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5361:1: ( ( ( rule__Assignment__Group_1__0 )* ) )
            // InternalPortugolParser.g:5362:1: ( ( rule__Assignment__Group_1__0 )* )
            {
            // InternalPortugolParser.g:5362:1: ( ( rule__Assignment__Group_1__0 )* )
            // InternalPortugolParser.g:5363:2: ( rule__Assignment__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:5364:2: ( rule__Assignment__Group_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==LessThanSignHyphenMinus) ) {
                    int LA44_2 = input.LA(2);

                    if ( (synpred64_InternalPortugolParser()) ) {
                        alt44=1;
                    }


                }


                switch (alt44) {
            	case 1 :
            	    // InternalPortugolParser.g:5364:3: rule__Assignment__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Assignment__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalPortugolParser.g:5373:1: rule__Assignment__Group_1__0 : rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 ;
    public final void rule__Assignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5377:1: ( rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 )
            // InternalPortugolParser.g:5378:2: rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1
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
    // InternalPortugolParser.g:5385:1: rule__Assignment__Group_1__0__Impl : ( ( rule__Assignment__Group_1_0__0 ) ) ;
    public final void rule__Assignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5389:1: ( ( ( rule__Assignment__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:5390:1: ( ( rule__Assignment__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:5390:1: ( ( rule__Assignment__Group_1_0__0 ) )
            // InternalPortugolParser.g:5391:2: ( rule__Assignment__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:5392:2: ( rule__Assignment__Group_1_0__0 )
            // InternalPortugolParser.g:5392:3: rule__Assignment__Group_1_0__0
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
    // InternalPortugolParser.g:5400:1: rule__Assignment__Group_1__1 : rule__Assignment__Group_1__1__Impl ;
    public final void rule__Assignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5404:1: ( rule__Assignment__Group_1__1__Impl )
            // InternalPortugolParser.g:5405:2: rule__Assignment__Group_1__1__Impl
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
    // InternalPortugolParser.g:5411:1: rule__Assignment__Group_1__1__Impl : ( ( rule__Assignment__RightAssignment_1_1 ) ) ;
    public final void rule__Assignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5415:1: ( ( ( rule__Assignment__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:5416:1: ( ( rule__Assignment__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:5416:1: ( ( rule__Assignment__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:5417:2: ( rule__Assignment__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:5418:2: ( rule__Assignment__RightAssignment_1_1 )
            // InternalPortugolParser.g:5418:3: rule__Assignment__RightAssignment_1_1
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
    // InternalPortugolParser.g:5427:1: rule__Assignment__Group_1_0__0 : rule__Assignment__Group_1_0__0__Impl ;
    public final void rule__Assignment__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5431:1: ( rule__Assignment__Group_1_0__0__Impl )
            // InternalPortugolParser.g:5432:2: rule__Assignment__Group_1_0__0__Impl
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
    // InternalPortugolParser.g:5438:1: rule__Assignment__Group_1_0__0__Impl : ( ( rule__Assignment__Group_1_0_0__0 ) ) ;
    public final void rule__Assignment__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5442:1: ( ( ( rule__Assignment__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:5443:1: ( ( rule__Assignment__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:5443:1: ( ( rule__Assignment__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:5444:2: ( rule__Assignment__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:5445:2: ( rule__Assignment__Group_1_0_0__0 )
            // InternalPortugolParser.g:5445:3: rule__Assignment__Group_1_0_0__0
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
    // InternalPortugolParser.g:5454:1: rule__Assignment__Group_1_0_0__0 : rule__Assignment__Group_1_0_0__0__Impl rule__Assignment__Group_1_0_0__1 ;
    public final void rule__Assignment__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5458:1: ( rule__Assignment__Group_1_0_0__0__Impl rule__Assignment__Group_1_0_0__1 )
            // InternalPortugolParser.g:5459:2: rule__Assignment__Group_1_0_0__0__Impl rule__Assignment__Group_1_0_0__1
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
    // InternalPortugolParser.g:5466:1: rule__Assignment__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Assignment__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5470:1: ( ( () ) )
            // InternalPortugolParser.g:5471:1: ( () )
            {
            // InternalPortugolParser.g:5471:1: ( () )
            // InternalPortugolParser.g:5472:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:5473:2: ()
            // InternalPortugolParser.g:5473:3: 
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
    // InternalPortugolParser.g:5481:1: rule__Assignment__Group_1_0_0__1 : rule__Assignment__Group_1_0_0__1__Impl ;
    public final void rule__Assignment__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5485:1: ( rule__Assignment__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:5486:2: rule__Assignment__Group_1_0_0__1__Impl
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
    // InternalPortugolParser.g:5492:1: rule__Assignment__Group_1_0_0__1__Impl : ( ( rule__Assignment__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__Assignment__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5496:1: ( ( ( rule__Assignment__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:5497:1: ( ( rule__Assignment__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:5497:1: ( ( rule__Assignment__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:5498:2: ( rule__Assignment__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:5499:2: ( rule__Assignment__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:5499:3: rule__Assignment__OpAssignment_1_0_0_1
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
    // InternalPortugolParser.g:5508:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5512:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalPortugolParser.g:5513:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
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
    // InternalPortugolParser.g:5520:1: rule__OrExpression__Group__0__Impl : ( ruleXorExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5524:1: ( ( ruleXorExpression ) )
            // InternalPortugolParser.g:5525:1: ( ruleXorExpression )
            {
            // InternalPortugolParser.g:5525:1: ( ruleXorExpression )
            // InternalPortugolParser.g:5526:2: ruleXorExpression
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
    // InternalPortugolParser.g:5535:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5539:1: ( rule__OrExpression__Group__1__Impl )
            // InternalPortugolParser.g:5540:2: rule__OrExpression__Group__1__Impl
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
    // InternalPortugolParser.g:5546:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5550:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalPortugolParser.g:5551:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalPortugolParser.g:5551:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalPortugolParser.g:5552:2: ( rule__OrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:5553:2: ( rule__OrExpression__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==OU) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalPortugolParser.g:5553:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalPortugolParser.g:5562:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5566:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalPortugolParser.g:5567:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
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
    // InternalPortugolParser.g:5574:1: rule__OrExpression__Group_1__0__Impl : ( ( rule__OrExpression__Group_1_0__0 ) ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5578:1: ( ( ( rule__OrExpression__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:5579:1: ( ( rule__OrExpression__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:5579:1: ( ( rule__OrExpression__Group_1_0__0 ) )
            // InternalPortugolParser.g:5580:2: ( rule__OrExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:5581:2: ( rule__OrExpression__Group_1_0__0 )
            // InternalPortugolParser.g:5581:3: rule__OrExpression__Group_1_0__0
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
    // InternalPortugolParser.g:5589:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5593:1: ( rule__OrExpression__Group_1__1__Impl )
            // InternalPortugolParser.g:5594:2: rule__OrExpression__Group_1__1__Impl
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
    // InternalPortugolParser.g:5600:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__RightAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5604:1: ( ( ( rule__OrExpression__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:5605:1: ( ( rule__OrExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:5605:1: ( ( rule__OrExpression__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:5606:2: ( rule__OrExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:5607:2: ( rule__OrExpression__RightAssignment_1_1 )
            // InternalPortugolParser.g:5607:3: rule__OrExpression__RightAssignment_1_1
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
    // InternalPortugolParser.g:5616:1: rule__OrExpression__Group_1_0__0 : rule__OrExpression__Group_1_0__0__Impl ;
    public final void rule__OrExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5620:1: ( rule__OrExpression__Group_1_0__0__Impl )
            // InternalPortugolParser.g:5621:2: rule__OrExpression__Group_1_0__0__Impl
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
    // InternalPortugolParser.g:5627:1: rule__OrExpression__Group_1_0__0__Impl : ( ( rule__OrExpression__Group_1_0_0__0 ) ) ;
    public final void rule__OrExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5631:1: ( ( ( rule__OrExpression__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:5632:1: ( ( rule__OrExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:5632:1: ( ( rule__OrExpression__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:5633:2: ( rule__OrExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:5634:2: ( rule__OrExpression__Group_1_0_0__0 )
            // InternalPortugolParser.g:5634:3: rule__OrExpression__Group_1_0_0__0
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
    // InternalPortugolParser.g:5643:1: rule__OrExpression__Group_1_0_0__0 : rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1 ;
    public final void rule__OrExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5647:1: ( rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1 )
            // InternalPortugolParser.g:5648:2: rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1
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
    // InternalPortugolParser.g:5655:1: rule__OrExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5659:1: ( ( () ) )
            // InternalPortugolParser.g:5660:1: ( () )
            {
            // InternalPortugolParser.g:5660:1: ( () )
            // InternalPortugolParser.g:5661:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:5662:2: ()
            // InternalPortugolParser.g:5662:3: 
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
    // InternalPortugolParser.g:5670:1: rule__OrExpression__Group_1_0_0__1 : rule__OrExpression__Group_1_0_0__1__Impl ;
    public final void rule__OrExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5674:1: ( rule__OrExpression__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:5675:2: rule__OrExpression__Group_1_0_0__1__Impl
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
    // InternalPortugolParser.g:5681:1: rule__OrExpression__Group_1_0_0__1__Impl : ( ( rule__OrExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__OrExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5685:1: ( ( ( rule__OrExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:5686:1: ( ( rule__OrExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:5686:1: ( ( rule__OrExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:5687:2: ( rule__OrExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:5688:2: ( rule__OrExpression__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:5688:3: rule__OrExpression__OpAssignment_1_0_0_1
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
    // InternalPortugolParser.g:5697:1: rule__XorExpression__Group__0 : rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 ;
    public final void rule__XorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5701:1: ( rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 )
            // InternalPortugolParser.g:5702:2: rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1
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
    // InternalPortugolParser.g:5709:1: rule__XorExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__XorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5713:1: ( ( ruleAndExpression ) )
            // InternalPortugolParser.g:5714:1: ( ruleAndExpression )
            {
            // InternalPortugolParser.g:5714:1: ( ruleAndExpression )
            // InternalPortugolParser.g:5715:2: ruleAndExpression
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
    // InternalPortugolParser.g:5724:1: rule__XorExpression__Group__1 : rule__XorExpression__Group__1__Impl ;
    public final void rule__XorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5728:1: ( rule__XorExpression__Group__1__Impl )
            // InternalPortugolParser.g:5729:2: rule__XorExpression__Group__1__Impl
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
    // InternalPortugolParser.g:5735:1: rule__XorExpression__Group__1__Impl : ( ( rule__XorExpression__Group_1__0 )* ) ;
    public final void rule__XorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5739:1: ( ( ( rule__XorExpression__Group_1__0 )* ) )
            // InternalPortugolParser.g:5740:1: ( ( rule__XorExpression__Group_1__0 )* )
            {
            // InternalPortugolParser.g:5740:1: ( ( rule__XorExpression__Group_1__0 )* )
            // InternalPortugolParser.g:5741:2: ( rule__XorExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:5742:2: ( rule__XorExpression__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==XOU) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalPortugolParser.g:5742:3: rule__XorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__XorExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalPortugolParser.g:5751:1: rule__XorExpression__Group_1__0 : rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 ;
    public final void rule__XorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5755:1: ( rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 )
            // InternalPortugolParser.g:5756:2: rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1
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
    // InternalPortugolParser.g:5763:1: rule__XorExpression__Group_1__0__Impl : ( ( rule__XorExpression__Group_1_0__0 ) ) ;
    public final void rule__XorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5767:1: ( ( ( rule__XorExpression__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:5768:1: ( ( rule__XorExpression__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:5768:1: ( ( rule__XorExpression__Group_1_0__0 ) )
            // InternalPortugolParser.g:5769:2: ( rule__XorExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:5770:2: ( rule__XorExpression__Group_1_0__0 )
            // InternalPortugolParser.g:5770:3: rule__XorExpression__Group_1_0__0
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
    // InternalPortugolParser.g:5778:1: rule__XorExpression__Group_1__1 : rule__XorExpression__Group_1__1__Impl ;
    public final void rule__XorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5782:1: ( rule__XorExpression__Group_1__1__Impl )
            // InternalPortugolParser.g:5783:2: rule__XorExpression__Group_1__1__Impl
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
    // InternalPortugolParser.g:5789:1: rule__XorExpression__Group_1__1__Impl : ( ( rule__XorExpression__RightAssignment_1_1 ) ) ;
    public final void rule__XorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5793:1: ( ( ( rule__XorExpression__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:5794:1: ( ( rule__XorExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:5794:1: ( ( rule__XorExpression__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:5795:2: ( rule__XorExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:5796:2: ( rule__XorExpression__RightAssignment_1_1 )
            // InternalPortugolParser.g:5796:3: rule__XorExpression__RightAssignment_1_1
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
    // InternalPortugolParser.g:5805:1: rule__XorExpression__Group_1_0__0 : rule__XorExpression__Group_1_0__0__Impl ;
    public final void rule__XorExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5809:1: ( rule__XorExpression__Group_1_0__0__Impl )
            // InternalPortugolParser.g:5810:2: rule__XorExpression__Group_1_0__0__Impl
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
    // InternalPortugolParser.g:5816:1: rule__XorExpression__Group_1_0__0__Impl : ( ( rule__XorExpression__Group_1_0_0__0 ) ) ;
    public final void rule__XorExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5820:1: ( ( ( rule__XorExpression__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:5821:1: ( ( rule__XorExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:5821:1: ( ( rule__XorExpression__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:5822:2: ( rule__XorExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:5823:2: ( rule__XorExpression__Group_1_0_0__0 )
            // InternalPortugolParser.g:5823:3: rule__XorExpression__Group_1_0_0__0
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
    // InternalPortugolParser.g:5832:1: rule__XorExpression__Group_1_0_0__0 : rule__XorExpression__Group_1_0_0__0__Impl rule__XorExpression__Group_1_0_0__1 ;
    public final void rule__XorExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5836:1: ( rule__XorExpression__Group_1_0_0__0__Impl rule__XorExpression__Group_1_0_0__1 )
            // InternalPortugolParser.g:5837:2: rule__XorExpression__Group_1_0_0__0__Impl rule__XorExpression__Group_1_0_0__1
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
    // InternalPortugolParser.g:5844:1: rule__XorExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__XorExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5848:1: ( ( () ) )
            // InternalPortugolParser.g:5849:1: ( () )
            {
            // InternalPortugolParser.g:5849:1: ( () )
            // InternalPortugolParser.g:5850:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:5851:2: ()
            // InternalPortugolParser.g:5851:3: 
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
    // InternalPortugolParser.g:5859:1: rule__XorExpression__Group_1_0_0__1 : rule__XorExpression__Group_1_0_0__1__Impl ;
    public final void rule__XorExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5863:1: ( rule__XorExpression__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:5864:2: rule__XorExpression__Group_1_0_0__1__Impl
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
    // InternalPortugolParser.g:5870:1: rule__XorExpression__Group_1_0_0__1__Impl : ( ( rule__XorExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__XorExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5874:1: ( ( ( rule__XorExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:5875:1: ( ( rule__XorExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:5875:1: ( ( rule__XorExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:5876:2: ( rule__XorExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:5877:2: ( rule__XorExpression__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:5877:3: rule__XorExpression__OpAssignment_1_0_0_1
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
    // InternalPortugolParser.g:5886:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5890:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalPortugolParser.g:5891:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
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
    // InternalPortugolParser.g:5898:1: rule__AndExpression__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5902:1: ( ( ruleComparison ) )
            // InternalPortugolParser.g:5903:1: ( ruleComparison )
            {
            // InternalPortugolParser.g:5903:1: ( ruleComparison )
            // InternalPortugolParser.g:5904:2: ruleComparison
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
    // InternalPortugolParser.g:5913:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5917:1: ( rule__AndExpression__Group__1__Impl )
            // InternalPortugolParser.g:5918:2: rule__AndExpression__Group__1__Impl
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
    // InternalPortugolParser.g:5924:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5928:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalPortugolParser.g:5929:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalPortugolParser.g:5929:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalPortugolParser.g:5930:2: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:5931:2: ( rule__AndExpression__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==Ampersand||LA47_0==E) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalPortugolParser.g:5931:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalPortugolParser.g:5940:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5944:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalPortugolParser.g:5945:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
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
    // InternalPortugolParser.g:5952:1: rule__AndExpression__Group_1__0__Impl : ( ( rule__AndExpression__Group_1_0__0 ) ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5956:1: ( ( ( rule__AndExpression__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:5957:1: ( ( rule__AndExpression__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:5957:1: ( ( rule__AndExpression__Group_1_0__0 ) )
            // InternalPortugolParser.g:5958:2: ( rule__AndExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:5959:2: ( rule__AndExpression__Group_1_0__0 )
            // InternalPortugolParser.g:5959:3: rule__AndExpression__Group_1_0__0
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
    // InternalPortugolParser.g:5967:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5971:1: ( rule__AndExpression__Group_1__1__Impl )
            // InternalPortugolParser.g:5972:2: rule__AndExpression__Group_1__1__Impl
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
    // InternalPortugolParser.g:5978:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__RightAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5982:1: ( ( ( rule__AndExpression__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:5983:1: ( ( rule__AndExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:5983:1: ( ( rule__AndExpression__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:5984:2: ( rule__AndExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:5985:2: ( rule__AndExpression__RightAssignment_1_1 )
            // InternalPortugolParser.g:5985:3: rule__AndExpression__RightAssignment_1_1
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
    // InternalPortugolParser.g:5994:1: rule__AndExpression__Group_1_0__0 : rule__AndExpression__Group_1_0__0__Impl ;
    public final void rule__AndExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5998:1: ( rule__AndExpression__Group_1_0__0__Impl )
            // InternalPortugolParser.g:5999:2: rule__AndExpression__Group_1_0__0__Impl
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
    // InternalPortugolParser.g:6005:1: rule__AndExpression__Group_1_0__0__Impl : ( ( rule__AndExpression__Group_1_0_0__0 ) ) ;
    public final void rule__AndExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6009:1: ( ( ( rule__AndExpression__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:6010:1: ( ( rule__AndExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:6010:1: ( ( rule__AndExpression__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:6011:2: ( rule__AndExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:6012:2: ( rule__AndExpression__Group_1_0_0__0 )
            // InternalPortugolParser.g:6012:3: rule__AndExpression__Group_1_0_0__0
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
    // InternalPortugolParser.g:6021:1: rule__AndExpression__Group_1_0_0__0 : rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1 ;
    public final void rule__AndExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6025:1: ( rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1 )
            // InternalPortugolParser.g:6026:2: rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1
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
    // InternalPortugolParser.g:6033:1: rule__AndExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6037:1: ( ( () ) )
            // InternalPortugolParser.g:6038:1: ( () )
            {
            // InternalPortugolParser.g:6038:1: ( () )
            // InternalPortugolParser.g:6039:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:6040:2: ()
            // InternalPortugolParser.g:6040:3: 
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
    // InternalPortugolParser.g:6048:1: rule__AndExpression__Group_1_0_0__1 : rule__AndExpression__Group_1_0_0__1__Impl ;
    public final void rule__AndExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6052:1: ( rule__AndExpression__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:6053:2: rule__AndExpression__Group_1_0_0__1__Impl
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
    // InternalPortugolParser.g:6059:1: rule__AndExpression__Group_1_0_0__1__Impl : ( ( rule__AndExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__AndExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6063:1: ( ( ( rule__AndExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:6064:1: ( ( rule__AndExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:6064:1: ( ( rule__AndExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:6065:2: ( rule__AndExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:6066:2: ( rule__AndExpression__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:6066:3: rule__AndExpression__OpAssignment_1_0_0_1
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
    // InternalPortugolParser.g:6075:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6079:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalPortugolParser.g:6080:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
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
    // InternalPortugolParser.g:6087:1: rule__Comparison__Group__0__Impl : ( ruleEquExpression ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6091:1: ( ( ruleEquExpression ) )
            // InternalPortugolParser.g:6092:1: ( ruleEquExpression )
            {
            // InternalPortugolParser.g:6092:1: ( ruleEquExpression )
            // InternalPortugolParser.g:6093:2: ruleEquExpression
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
    // InternalPortugolParser.g:6102:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6106:1: ( rule__Comparison__Group__1__Impl )
            // InternalPortugolParser.g:6107:2: rule__Comparison__Group__1__Impl
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
    // InternalPortugolParser.g:6113:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6117:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalPortugolParser.g:6118:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalPortugolParser.g:6118:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalPortugolParser.g:6119:2: ( rule__Comparison__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:6120:2: ( rule__Comparison__Group_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==LessThanSignGreaterThanSign||LA48_0==EqualsSign) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalPortugolParser.g:6120:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalPortugolParser.g:6129:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6133:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalPortugolParser.g:6134:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
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
    // InternalPortugolParser.g:6141:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Group_1_0__0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6145:1: ( ( ( rule__Comparison__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:6146:1: ( ( rule__Comparison__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:6146:1: ( ( rule__Comparison__Group_1_0__0 ) )
            // InternalPortugolParser.g:6147:2: ( rule__Comparison__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:6148:2: ( rule__Comparison__Group_1_0__0 )
            // InternalPortugolParser.g:6148:3: rule__Comparison__Group_1_0__0
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
    // InternalPortugolParser.g:6156:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6160:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalPortugolParser.g:6161:2: rule__Comparison__Group_1__1__Impl
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
    // InternalPortugolParser.g:6167:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6171:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:6172:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:6172:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:6173:2: ( rule__Comparison__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:6174:2: ( rule__Comparison__RightAssignment_1_1 )
            // InternalPortugolParser.g:6174:3: rule__Comparison__RightAssignment_1_1
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
    // InternalPortugolParser.g:6183:1: rule__Comparison__Group_1_0__0 : rule__Comparison__Group_1_0__0__Impl ;
    public final void rule__Comparison__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6187:1: ( rule__Comparison__Group_1_0__0__Impl )
            // InternalPortugolParser.g:6188:2: rule__Comparison__Group_1_0__0__Impl
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
    // InternalPortugolParser.g:6194:1: rule__Comparison__Group_1_0__0__Impl : ( ( rule__Comparison__Group_1_0_0__0 ) ) ;
    public final void rule__Comparison__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6198:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:6199:1: ( ( rule__Comparison__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:6199:1: ( ( rule__Comparison__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:6200:2: ( rule__Comparison__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:6201:2: ( rule__Comparison__Group_1_0_0__0 )
            // InternalPortugolParser.g:6201:3: rule__Comparison__Group_1_0_0__0
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
    // InternalPortugolParser.g:6210:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6214:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalPortugolParser.g:6215:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
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
    // InternalPortugolParser.g:6222:1: rule__Comparison__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6226:1: ( ( () ) )
            // InternalPortugolParser.g:6227:1: ( () )
            {
            // InternalPortugolParser.g:6227:1: ( () )
            // InternalPortugolParser.g:6228:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:6229:2: ()
            // InternalPortugolParser.g:6229:3: 
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
    // InternalPortugolParser.g:6237:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6241:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:6242:2: rule__Comparison__Group_1_0_0__1__Impl
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
    // InternalPortugolParser.g:6248:1: rule__Comparison__Group_1_0_0__1__Impl : ( ( rule__Comparison__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6252:1: ( ( ( rule__Comparison__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:6253:1: ( ( rule__Comparison__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:6253:1: ( ( rule__Comparison__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:6254:2: ( rule__Comparison__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:6255:2: ( rule__Comparison__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:6255:3: rule__Comparison__OpAssignment_1_0_0_1
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
    // InternalPortugolParser.g:6264:1: rule__EquExpression__Group__0 : rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1 ;
    public final void rule__EquExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6268:1: ( rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1 )
            // InternalPortugolParser.g:6269:2: rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1
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
    // InternalPortugolParser.g:6276:1: rule__EquExpression__Group__0__Impl : ( ruleAddExpression ) ;
    public final void rule__EquExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6280:1: ( ( ruleAddExpression ) )
            // InternalPortugolParser.g:6281:1: ( ruleAddExpression )
            {
            // InternalPortugolParser.g:6281:1: ( ruleAddExpression )
            // InternalPortugolParser.g:6282:2: ruleAddExpression
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
    // InternalPortugolParser.g:6291:1: rule__EquExpression__Group__1 : rule__EquExpression__Group__1__Impl ;
    public final void rule__EquExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6295:1: ( rule__EquExpression__Group__1__Impl )
            // InternalPortugolParser.g:6296:2: rule__EquExpression__Group__1__Impl
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
    // InternalPortugolParser.g:6302:1: rule__EquExpression__Group__1__Impl : ( ( rule__EquExpression__Group_1__0 )* ) ;
    public final void rule__EquExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6306:1: ( ( ( rule__EquExpression__Group_1__0 )* ) )
            // InternalPortugolParser.g:6307:1: ( ( rule__EquExpression__Group_1__0 )* )
            {
            // InternalPortugolParser.g:6307:1: ( ( rule__EquExpression__Group_1__0 )* )
            // InternalPortugolParser.g:6308:2: ( rule__EquExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:6309:2: ( rule__EquExpression__Group_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==LessThanSignEqualsSign||LA49_0==GreaterThanSignEqualsSign||LA49_0==LessThanSign||LA49_0==GreaterThanSign) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalPortugolParser.g:6309:3: rule__EquExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__EquExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalPortugolParser.g:6318:1: rule__EquExpression__Group_1__0 : rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1 ;
    public final void rule__EquExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6322:1: ( rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1 )
            // InternalPortugolParser.g:6323:2: rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1
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
    // InternalPortugolParser.g:6330:1: rule__EquExpression__Group_1__0__Impl : ( ( rule__EquExpression__Group_1_0__0 ) ) ;
    public final void rule__EquExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6334:1: ( ( ( rule__EquExpression__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:6335:1: ( ( rule__EquExpression__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:6335:1: ( ( rule__EquExpression__Group_1_0__0 ) )
            // InternalPortugolParser.g:6336:2: ( rule__EquExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:6337:2: ( rule__EquExpression__Group_1_0__0 )
            // InternalPortugolParser.g:6337:3: rule__EquExpression__Group_1_0__0
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
    // InternalPortugolParser.g:6345:1: rule__EquExpression__Group_1__1 : rule__EquExpression__Group_1__1__Impl ;
    public final void rule__EquExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6349:1: ( rule__EquExpression__Group_1__1__Impl )
            // InternalPortugolParser.g:6350:2: rule__EquExpression__Group_1__1__Impl
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
    // InternalPortugolParser.g:6356:1: rule__EquExpression__Group_1__1__Impl : ( ( rule__EquExpression__RightAssignment_1_1 ) ) ;
    public final void rule__EquExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6360:1: ( ( ( rule__EquExpression__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:6361:1: ( ( rule__EquExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:6361:1: ( ( rule__EquExpression__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:6362:2: ( rule__EquExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:6363:2: ( rule__EquExpression__RightAssignment_1_1 )
            // InternalPortugolParser.g:6363:3: rule__EquExpression__RightAssignment_1_1
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
    // InternalPortugolParser.g:6372:1: rule__EquExpression__Group_1_0__0 : rule__EquExpression__Group_1_0__0__Impl ;
    public final void rule__EquExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6376:1: ( rule__EquExpression__Group_1_0__0__Impl )
            // InternalPortugolParser.g:6377:2: rule__EquExpression__Group_1_0__0__Impl
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
    // InternalPortugolParser.g:6383:1: rule__EquExpression__Group_1_0__0__Impl : ( ( rule__EquExpression__Group_1_0_0__0 ) ) ;
    public final void rule__EquExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6387:1: ( ( ( rule__EquExpression__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:6388:1: ( ( rule__EquExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:6388:1: ( ( rule__EquExpression__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:6389:2: ( rule__EquExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:6390:2: ( rule__EquExpression__Group_1_0_0__0 )
            // InternalPortugolParser.g:6390:3: rule__EquExpression__Group_1_0_0__0
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
    // InternalPortugolParser.g:6399:1: rule__EquExpression__Group_1_0_0__0 : rule__EquExpression__Group_1_0_0__0__Impl rule__EquExpression__Group_1_0_0__1 ;
    public final void rule__EquExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6403:1: ( rule__EquExpression__Group_1_0_0__0__Impl rule__EquExpression__Group_1_0_0__1 )
            // InternalPortugolParser.g:6404:2: rule__EquExpression__Group_1_0_0__0__Impl rule__EquExpression__Group_1_0_0__1
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
    // InternalPortugolParser.g:6411:1: rule__EquExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__EquExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6415:1: ( ( () ) )
            // InternalPortugolParser.g:6416:1: ( () )
            {
            // InternalPortugolParser.g:6416:1: ( () )
            // InternalPortugolParser.g:6417:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:6418:2: ()
            // InternalPortugolParser.g:6418:3: 
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
    // InternalPortugolParser.g:6426:1: rule__EquExpression__Group_1_0_0__1 : rule__EquExpression__Group_1_0_0__1__Impl ;
    public final void rule__EquExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6430:1: ( rule__EquExpression__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:6431:2: rule__EquExpression__Group_1_0_0__1__Impl
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
    // InternalPortugolParser.g:6437:1: rule__EquExpression__Group_1_0_0__1__Impl : ( ( rule__EquExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__EquExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6441:1: ( ( ( rule__EquExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:6442:1: ( ( rule__EquExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:6442:1: ( ( rule__EquExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:6443:2: ( rule__EquExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:6444:2: ( rule__EquExpression__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:6444:3: rule__EquExpression__OpAssignment_1_0_0_1
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
    // InternalPortugolParser.g:6453:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6457:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // InternalPortugolParser.g:6458:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
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
    // InternalPortugolParser.g:6465:1: rule__AddExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6469:1: ( ( ruleMultiplicativeExpression ) )
            // InternalPortugolParser.g:6470:1: ( ruleMultiplicativeExpression )
            {
            // InternalPortugolParser.g:6470:1: ( ruleMultiplicativeExpression )
            // InternalPortugolParser.g:6471:2: ruleMultiplicativeExpression
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
    // InternalPortugolParser.g:6480:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6484:1: ( rule__AddExpression__Group__1__Impl )
            // InternalPortugolParser.g:6485:2: rule__AddExpression__Group__1__Impl
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
    // InternalPortugolParser.g:6491:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6495:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // InternalPortugolParser.g:6496:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // InternalPortugolParser.g:6496:1: ( ( rule__AddExpression__Group_1__0 )* )
            // InternalPortugolParser.g:6497:2: ( rule__AddExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:6498:2: ( rule__AddExpression__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==PlusSign||LA50_0==HyphenMinus) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalPortugolParser.g:6498:3: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_50);
            	    rule__AddExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalPortugolParser.g:6507:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6511:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // InternalPortugolParser.g:6512:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
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
    // InternalPortugolParser.g:6519:1: rule__AddExpression__Group_1__0__Impl : ( ( rule__AddExpression__Group_1_0__0 ) ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6523:1: ( ( ( rule__AddExpression__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:6524:1: ( ( rule__AddExpression__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:6524:1: ( ( rule__AddExpression__Group_1_0__0 ) )
            // InternalPortugolParser.g:6525:2: ( rule__AddExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:6526:2: ( rule__AddExpression__Group_1_0__0 )
            // InternalPortugolParser.g:6526:3: rule__AddExpression__Group_1_0__0
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
    // InternalPortugolParser.g:6534:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6538:1: ( rule__AddExpression__Group_1__1__Impl )
            // InternalPortugolParser.g:6539:2: rule__AddExpression__Group_1__1__Impl
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
    // InternalPortugolParser.g:6545:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__RightAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6549:1: ( ( ( rule__AddExpression__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:6550:1: ( ( rule__AddExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:6550:1: ( ( rule__AddExpression__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:6551:2: ( rule__AddExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:6552:2: ( rule__AddExpression__RightAssignment_1_1 )
            // InternalPortugolParser.g:6552:3: rule__AddExpression__RightAssignment_1_1
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
    // InternalPortugolParser.g:6561:1: rule__AddExpression__Group_1_0__0 : rule__AddExpression__Group_1_0__0__Impl ;
    public final void rule__AddExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6565:1: ( rule__AddExpression__Group_1_0__0__Impl )
            // InternalPortugolParser.g:6566:2: rule__AddExpression__Group_1_0__0__Impl
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
    // InternalPortugolParser.g:6572:1: rule__AddExpression__Group_1_0__0__Impl : ( ( rule__AddExpression__Group_1_0_0__0 ) ) ;
    public final void rule__AddExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6576:1: ( ( ( rule__AddExpression__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:6577:1: ( ( rule__AddExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:6577:1: ( ( rule__AddExpression__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:6578:2: ( rule__AddExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:6579:2: ( rule__AddExpression__Group_1_0_0__0 )
            // InternalPortugolParser.g:6579:3: rule__AddExpression__Group_1_0_0__0
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
    // InternalPortugolParser.g:6588:1: rule__AddExpression__Group_1_0_0__0 : rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1 ;
    public final void rule__AddExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6592:1: ( rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1 )
            // InternalPortugolParser.g:6593:2: rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1
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
    // InternalPortugolParser.g:6600:1: rule__AddExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6604:1: ( ( () ) )
            // InternalPortugolParser.g:6605:1: ( () )
            {
            // InternalPortugolParser.g:6605:1: ( () )
            // InternalPortugolParser.g:6606:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:6607:2: ()
            // InternalPortugolParser.g:6607:3: 
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
    // InternalPortugolParser.g:6615:1: rule__AddExpression__Group_1_0_0__1 : rule__AddExpression__Group_1_0_0__1__Impl ;
    public final void rule__AddExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6619:1: ( rule__AddExpression__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:6620:2: rule__AddExpression__Group_1_0_0__1__Impl
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
    // InternalPortugolParser.g:6626:1: rule__AddExpression__Group_1_0_0__1__Impl : ( ( rule__AddExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__AddExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6630:1: ( ( ( rule__AddExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:6631:1: ( ( rule__AddExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:6631:1: ( ( rule__AddExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:6632:2: ( rule__AddExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:6633:2: ( rule__AddExpression__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:6633:3: rule__AddExpression__OpAssignment_1_0_0_1
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
    // InternalPortugolParser.g:6642:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6646:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalPortugolParser.g:6647:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
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
    // InternalPortugolParser.g:6654:1: rule__MultiplicativeExpression__Group__0__Impl : ( rulePowerExpression ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6658:1: ( ( rulePowerExpression ) )
            // InternalPortugolParser.g:6659:1: ( rulePowerExpression )
            {
            // InternalPortugolParser.g:6659:1: ( rulePowerExpression )
            // InternalPortugolParser.g:6660:2: rulePowerExpression
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
    // InternalPortugolParser.g:6669:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6673:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalPortugolParser.g:6674:2: rule__MultiplicativeExpression__Group__1__Impl
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
    // InternalPortugolParser.g:6680:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6684:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalPortugolParser.g:6685:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalPortugolParser.g:6685:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalPortugolParser.g:6686:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:6687:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==MOD||LA51_0==PercentSign||LA51_0==Asterisk||LA51_0==Solidus) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalPortugolParser.g:6687:3: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalPortugolParser.g:6696:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6700:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalPortugolParser.g:6701:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
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
    // InternalPortugolParser.g:6708:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( ( rule__MultiplicativeExpression__Group_1_0__0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6712:1: ( ( ( rule__MultiplicativeExpression__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:6713:1: ( ( rule__MultiplicativeExpression__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:6713:1: ( ( rule__MultiplicativeExpression__Group_1_0__0 ) )
            // InternalPortugolParser.g:6714:2: ( rule__MultiplicativeExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:6715:2: ( rule__MultiplicativeExpression__Group_1_0__0 )
            // InternalPortugolParser.g:6715:3: rule__MultiplicativeExpression__Group_1_0__0
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
    // InternalPortugolParser.g:6723:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6727:1: ( rule__MultiplicativeExpression__Group_1__1__Impl )
            // InternalPortugolParser.g:6728:2: rule__MultiplicativeExpression__Group_1__1__Impl
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
    // InternalPortugolParser.g:6734:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6738:1: ( ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:6739:1: ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:6739:1: ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:6740:2: ( rule__MultiplicativeExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:6741:2: ( rule__MultiplicativeExpression__RightAssignment_1_1 )
            // InternalPortugolParser.g:6741:3: rule__MultiplicativeExpression__RightAssignment_1_1
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
    // InternalPortugolParser.g:6750:1: rule__MultiplicativeExpression__Group_1_0__0 : rule__MultiplicativeExpression__Group_1_0__0__Impl ;
    public final void rule__MultiplicativeExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6754:1: ( rule__MultiplicativeExpression__Group_1_0__0__Impl )
            // InternalPortugolParser.g:6755:2: rule__MultiplicativeExpression__Group_1_0__0__Impl
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
    // InternalPortugolParser.g:6761:1: rule__MultiplicativeExpression__Group_1_0__0__Impl : ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6765:1: ( ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:6766:1: ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:6766:1: ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:6767:2: ( rule__MultiplicativeExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:6768:2: ( rule__MultiplicativeExpression__Group_1_0_0__0 )
            // InternalPortugolParser.g:6768:3: rule__MultiplicativeExpression__Group_1_0_0__0
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
    // InternalPortugolParser.g:6777:1: rule__MultiplicativeExpression__Group_1_0_0__0 : rule__MultiplicativeExpression__Group_1_0_0__0__Impl rule__MultiplicativeExpression__Group_1_0_0__1 ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6781:1: ( rule__MultiplicativeExpression__Group_1_0_0__0__Impl rule__MultiplicativeExpression__Group_1_0_0__1 )
            // InternalPortugolParser.g:6782:2: rule__MultiplicativeExpression__Group_1_0_0__0__Impl rule__MultiplicativeExpression__Group_1_0_0__1
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
    // InternalPortugolParser.g:6789:1: rule__MultiplicativeExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6793:1: ( ( () ) )
            // InternalPortugolParser.g:6794:1: ( () )
            {
            // InternalPortugolParser.g:6794:1: ( () )
            // InternalPortugolParser.g:6795:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:6796:2: ()
            // InternalPortugolParser.g:6796:3: 
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
    // InternalPortugolParser.g:6804:1: rule__MultiplicativeExpression__Group_1_0_0__1 : rule__MultiplicativeExpression__Group_1_0_0__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6808:1: ( rule__MultiplicativeExpression__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:6809:2: rule__MultiplicativeExpression__Group_1_0_0__1__Impl
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
    // InternalPortugolParser.g:6815:1: rule__MultiplicativeExpression__Group_1_0_0__1__Impl : ( ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6819:1: ( ( ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:6820:1: ( ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:6820:1: ( ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:6821:2: ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:6822:2: ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:6822:3: rule__MultiplicativeExpression__OpAssignment_1_0_0_1
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
    // InternalPortugolParser.g:6831:1: rule__PowerExpression__Group__0 : rule__PowerExpression__Group__0__Impl rule__PowerExpression__Group__1 ;
    public final void rule__PowerExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6835:1: ( rule__PowerExpression__Group__0__Impl rule__PowerExpression__Group__1 )
            // InternalPortugolParser.g:6836:2: rule__PowerExpression__Group__0__Impl rule__PowerExpression__Group__1
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
    // InternalPortugolParser.g:6843:1: rule__PowerExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__PowerExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6847:1: ( ( ruleUnaryExpression ) )
            // InternalPortugolParser.g:6848:1: ( ruleUnaryExpression )
            {
            // InternalPortugolParser.g:6848:1: ( ruleUnaryExpression )
            // InternalPortugolParser.g:6849:2: ruleUnaryExpression
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
    // InternalPortugolParser.g:6858:1: rule__PowerExpression__Group__1 : rule__PowerExpression__Group__1__Impl ;
    public final void rule__PowerExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6862:1: ( rule__PowerExpression__Group__1__Impl )
            // InternalPortugolParser.g:6863:2: rule__PowerExpression__Group__1__Impl
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
    // InternalPortugolParser.g:6869:1: rule__PowerExpression__Group__1__Impl : ( ( rule__PowerExpression__Group_1__0 )* ) ;
    public final void rule__PowerExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6873:1: ( ( ( rule__PowerExpression__Group_1__0 )* ) )
            // InternalPortugolParser.g:6874:1: ( ( rule__PowerExpression__Group_1__0 )* )
            {
            // InternalPortugolParser.g:6874:1: ( ( rule__PowerExpression__Group_1__0 )* )
            // InternalPortugolParser.g:6875:2: ( rule__PowerExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:6876:2: ( rule__PowerExpression__Group_1__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==CircumflexAccent) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalPortugolParser.g:6876:3: rule__PowerExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_54);
            	    rule__PowerExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalPortugolParser.g:6885:1: rule__PowerExpression__Group_1__0 : rule__PowerExpression__Group_1__0__Impl rule__PowerExpression__Group_1__1 ;
    public final void rule__PowerExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6889:1: ( rule__PowerExpression__Group_1__0__Impl rule__PowerExpression__Group_1__1 )
            // InternalPortugolParser.g:6890:2: rule__PowerExpression__Group_1__0__Impl rule__PowerExpression__Group_1__1
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
    // InternalPortugolParser.g:6897:1: rule__PowerExpression__Group_1__0__Impl : ( ( rule__PowerExpression__Group_1_0__0 ) ) ;
    public final void rule__PowerExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6901:1: ( ( ( rule__PowerExpression__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:6902:1: ( ( rule__PowerExpression__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:6902:1: ( ( rule__PowerExpression__Group_1_0__0 ) )
            // InternalPortugolParser.g:6903:2: ( rule__PowerExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:6904:2: ( rule__PowerExpression__Group_1_0__0 )
            // InternalPortugolParser.g:6904:3: rule__PowerExpression__Group_1_0__0
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
    // InternalPortugolParser.g:6912:1: rule__PowerExpression__Group_1__1 : rule__PowerExpression__Group_1__1__Impl ;
    public final void rule__PowerExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6916:1: ( rule__PowerExpression__Group_1__1__Impl )
            // InternalPortugolParser.g:6917:2: rule__PowerExpression__Group_1__1__Impl
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
    // InternalPortugolParser.g:6923:1: rule__PowerExpression__Group_1__1__Impl : ( ( rule__PowerExpression__RightAssignment_1_1 ) ) ;
    public final void rule__PowerExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6927:1: ( ( ( rule__PowerExpression__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:6928:1: ( ( rule__PowerExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:6928:1: ( ( rule__PowerExpression__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:6929:2: ( rule__PowerExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:6930:2: ( rule__PowerExpression__RightAssignment_1_1 )
            // InternalPortugolParser.g:6930:3: rule__PowerExpression__RightAssignment_1_1
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
    // InternalPortugolParser.g:6939:1: rule__PowerExpression__Group_1_0__0 : rule__PowerExpression__Group_1_0__0__Impl ;
    public final void rule__PowerExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6943:1: ( rule__PowerExpression__Group_1_0__0__Impl )
            // InternalPortugolParser.g:6944:2: rule__PowerExpression__Group_1_0__0__Impl
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
    // InternalPortugolParser.g:6950:1: rule__PowerExpression__Group_1_0__0__Impl : ( ( rule__PowerExpression__Group_1_0_0__0 ) ) ;
    public final void rule__PowerExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6954:1: ( ( ( rule__PowerExpression__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:6955:1: ( ( rule__PowerExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:6955:1: ( ( rule__PowerExpression__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:6956:2: ( rule__PowerExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:6957:2: ( rule__PowerExpression__Group_1_0_0__0 )
            // InternalPortugolParser.g:6957:3: rule__PowerExpression__Group_1_0_0__0
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
    // InternalPortugolParser.g:6966:1: rule__PowerExpression__Group_1_0_0__0 : rule__PowerExpression__Group_1_0_0__0__Impl rule__PowerExpression__Group_1_0_0__1 ;
    public final void rule__PowerExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6970:1: ( rule__PowerExpression__Group_1_0_0__0__Impl rule__PowerExpression__Group_1_0_0__1 )
            // InternalPortugolParser.g:6971:2: rule__PowerExpression__Group_1_0_0__0__Impl rule__PowerExpression__Group_1_0_0__1
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
    // InternalPortugolParser.g:6978:1: rule__PowerExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PowerExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6982:1: ( ( () ) )
            // InternalPortugolParser.g:6983:1: ( () )
            {
            // InternalPortugolParser.g:6983:1: ( () )
            // InternalPortugolParser.g:6984:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:6985:2: ()
            // InternalPortugolParser.g:6985:3: 
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
    // InternalPortugolParser.g:6993:1: rule__PowerExpression__Group_1_0_0__1 : rule__PowerExpression__Group_1_0_0__1__Impl ;
    public final void rule__PowerExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6997:1: ( rule__PowerExpression__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:6998:2: rule__PowerExpression__Group_1_0_0__1__Impl
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
    // InternalPortugolParser.g:7004:1: rule__PowerExpression__Group_1_0_0__1__Impl : ( ( rule__PowerExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__PowerExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7008:1: ( ( ( rule__PowerExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:7009:1: ( ( rule__PowerExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:7009:1: ( ( rule__PowerExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:7010:2: ( rule__PowerExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:7011:2: ( rule__PowerExpression__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:7011:3: rule__PowerExpression__OpAssignment_1_0_0_1
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
    // InternalPortugolParser.g:7020:1: rule__UnaryExpression__Group_0__0 : rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 ;
    public final void rule__UnaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7024:1: ( rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 )
            // InternalPortugolParser.g:7025:2: rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1
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
    // InternalPortugolParser.g:7032:1: rule__UnaryExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7036:1: ( ( () ) )
            // InternalPortugolParser.g:7037:1: ( () )
            {
            // InternalPortugolParser.g:7037:1: ( () )
            // InternalPortugolParser.g:7038:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_0_0()); 
            }
            // InternalPortugolParser.g:7039:2: ()
            // InternalPortugolParser.g:7039:3: 
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
    // InternalPortugolParser.g:7047:1: rule__UnaryExpression__Group_0__1 : rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 ;
    public final void rule__UnaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7051:1: ( rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 )
            // InternalPortugolParser.g:7052:2: rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2
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
    // InternalPortugolParser.g:7059:1: rule__UnaryExpression__Group_0__1__Impl : ( ( rule__UnaryExpression__OpAssignment_0_1 ) ) ;
    public final void rule__UnaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7063:1: ( ( ( rule__UnaryExpression__OpAssignment_0_1 ) ) )
            // InternalPortugolParser.g:7064:1: ( ( rule__UnaryExpression__OpAssignment_0_1 ) )
            {
            // InternalPortugolParser.g:7064:1: ( ( rule__UnaryExpression__OpAssignment_0_1 ) )
            // InternalPortugolParser.g:7065:2: ( rule__UnaryExpression__OpAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOpAssignment_0_1()); 
            }
            // InternalPortugolParser.g:7066:2: ( rule__UnaryExpression__OpAssignment_0_1 )
            // InternalPortugolParser.g:7066:3: rule__UnaryExpression__OpAssignment_0_1
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
    // InternalPortugolParser.g:7074:1: rule__UnaryExpression__Group_0__2 : rule__UnaryExpression__Group_0__2__Impl ;
    public final void rule__UnaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7078:1: ( rule__UnaryExpression__Group_0__2__Impl )
            // InternalPortugolParser.g:7079:2: rule__UnaryExpression__Group_0__2__Impl
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
    // InternalPortugolParser.g:7085:1: rule__UnaryExpression__Group_0__2__Impl : ( ( rule__UnaryExpression__OperandAssignment_0_2 ) ) ;
    public final void rule__UnaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7089:1: ( ( ( rule__UnaryExpression__OperandAssignment_0_2 ) ) )
            // InternalPortugolParser.g:7090:1: ( ( rule__UnaryExpression__OperandAssignment_0_2 ) )
            {
            // InternalPortugolParser.g:7090:1: ( ( rule__UnaryExpression__OperandAssignment_0_2 ) )
            // InternalPortugolParser.g:7091:2: ( rule__UnaryExpression__OperandAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_0_2()); 
            }
            // InternalPortugolParser.g:7092:2: ( rule__UnaryExpression__OperandAssignment_0_2 )
            // InternalPortugolParser.g:7092:3: rule__UnaryExpression__OperandAssignment_0_2
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
    // InternalPortugolParser.g:7101:1: rule__PrimaryExpression__Group_4__0 : rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 ;
    public final void rule__PrimaryExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7105:1: ( rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1 )
            // InternalPortugolParser.g:7106:2: rule__PrimaryExpression__Group_4__0__Impl rule__PrimaryExpression__Group_4__1
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
    // InternalPortugolParser.g:7113:1: rule__PrimaryExpression__Group_4__0__Impl : ( LeftParenthesis ) ;
    public final void rule__PrimaryExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7117:1: ( ( LeftParenthesis ) )
            // InternalPortugolParser.g:7118:1: ( LeftParenthesis )
            {
            // InternalPortugolParser.g:7118:1: ( LeftParenthesis )
            // InternalPortugolParser.g:7119:2: LeftParenthesis
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
    // InternalPortugolParser.g:7128:1: rule__PrimaryExpression__Group_4__1 : rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2 ;
    public final void rule__PrimaryExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7132:1: ( rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2 )
            // InternalPortugolParser.g:7133:2: rule__PrimaryExpression__Group_4__1__Impl rule__PrimaryExpression__Group_4__2
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
    // InternalPortugolParser.g:7140:1: rule__PrimaryExpression__Group_4__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7144:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:7145:1: ( ruleExpression )
            {
            // InternalPortugolParser.g:7145:1: ( ruleExpression )
            // InternalPortugolParser.g:7146:2: ruleExpression
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
    // InternalPortugolParser.g:7155:1: rule__PrimaryExpression__Group_4__2 : rule__PrimaryExpression__Group_4__2__Impl ;
    public final void rule__PrimaryExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7159:1: ( rule__PrimaryExpression__Group_4__2__Impl )
            // InternalPortugolParser.g:7160:2: rule__PrimaryExpression__Group_4__2__Impl
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
    // InternalPortugolParser.g:7166:1: rule__PrimaryExpression__Group_4__2__Impl : ( RightParenthesis ) ;
    public final void rule__PrimaryExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7170:1: ( ( RightParenthesis ) )
            // InternalPortugolParser.g:7171:1: ( RightParenthesis )
            {
            // InternalPortugolParser.g:7171:1: ( RightParenthesis )
            // InternalPortugolParser.g:7172:2: RightParenthesis
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
    // InternalPortugolParser.g:7182:1: rule__PreDefinedFunctionCall__Group__0 : rule__PreDefinedFunctionCall__Group__0__Impl rule__PreDefinedFunctionCall__Group__1 ;
    public final void rule__PreDefinedFunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7186:1: ( rule__PreDefinedFunctionCall__Group__0__Impl rule__PreDefinedFunctionCall__Group__1 )
            // InternalPortugolParser.g:7187:2: rule__PreDefinedFunctionCall__Group__0__Impl rule__PreDefinedFunctionCall__Group__1
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
    // InternalPortugolParser.g:7194:1: rule__PreDefinedFunctionCall__Group__0__Impl : ( ( rule__PreDefinedFunctionCall__PreDefFunctionNameAssignment_0 ) ) ;
    public final void rule__PreDefinedFunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7198:1: ( ( ( rule__PreDefinedFunctionCall__PreDefFunctionNameAssignment_0 ) ) )
            // InternalPortugolParser.g:7199:1: ( ( rule__PreDefinedFunctionCall__PreDefFunctionNameAssignment_0 ) )
            {
            // InternalPortugolParser.g:7199:1: ( ( rule__PreDefinedFunctionCall__PreDefFunctionNameAssignment_0 ) )
            // InternalPortugolParser.g:7200:2: ( rule__PreDefinedFunctionCall__PreDefFunctionNameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreDefinedFunctionCallAccess().getPreDefFunctionNameAssignment_0()); 
            }
            // InternalPortugolParser.g:7201:2: ( rule__PreDefinedFunctionCall__PreDefFunctionNameAssignment_0 )
            // InternalPortugolParser.g:7201:3: rule__PreDefinedFunctionCall__PreDefFunctionNameAssignment_0
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
    // InternalPortugolParser.g:7209:1: rule__PreDefinedFunctionCall__Group__1 : rule__PreDefinedFunctionCall__Group__1__Impl rule__PreDefinedFunctionCall__Group__2 ;
    public final void rule__PreDefinedFunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7213:1: ( rule__PreDefinedFunctionCall__Group__1__Impl rule__PreDefinedFunctionCall__Group__2 )
            // InternalPortugolParser.g:7214:2: rule__PreDefinedFunctionCall__Group__1__Impl rule__PreDefinedFunctionCall__Group__2
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
    // InternalPortugolParser.g:7221:1: rule__PreDefinedFunctionCall__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__PreDefinedFunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7225:1: ( ( LeftParenthesis ) )
            // InternalPortugolParser.g:7226:1: ( LeftParenthesis )
            {
            // InternalPortugolParser.g:7226:1: ( LeftParenthesis )
            // InternalPortugolParser.g:7227:2: LeftParenthesis
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
    // InternalPortugolParser.g:7236:1: rule__PreDefinedFunctionCall__Group__2 : rule__PreDefinedFunctionCall__Group__2__Impl rule__PreDefinedFunctionCall__Group__3 ;
    public final void rule__PreDefinedFunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7240:1: ( rule__PreDefinedFunctionCall__Group__2__Impl rule__PreDefinedFunctionCall__Group__3 )
            // InternalPortugolParser.g:7241:2: rule__PreDefinedFunctionCall__Group__2__Impl rule__PreDefinedFunctionCall__Group__3
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
    // InternalPortugolParser.g:7248:1: rule__PreDefinedFunctionCall__Group__2__Impl : ( ( rule__PreDefinedFunctionCall__ParamAssignment_2 ) ) ;
    public final void rule__PreDefinedFunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7252:1: ( ( ( rule__PreDefinedFunctionCall__ParamAssignment_2 ) ) )
            // InternalPortugolParser.g:7253:1: ( ( rule__PreDefinedFunctionCall__ParamAssignment_2 ) )
            {
            // InternalPortugolParser.g:7253:1: ( ( rule__PreDefinedFunctionCall__ParamAssignment_2 ) )
            // InternalPortugolParser.g:7254:2: ( rule__PreDefinedFunctionCall__ParamAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreDefinedFunctionCallAccess().getParamAssignment_2()); 
            }
            // InternalPortugolParser.g:7255:2: ( rule__PreDefinedFunctionCall__ParamAssignment_2 )
            // InternalPortugolParser.g:7255:3: rule__PreDefinedFunctionCall__ParamAssignment_2
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
    // InternalPortugolParser.g:7263:1: rule__PreDefinedFunctionCall__Group__3 : rule__PreDefinedFunctionCall__Group__3__Impl ;
    public final void rule__PreDefinedFunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7267:1: ( rule__PreDefinedFunctionCall__Group__3__Impl )
            // InternalPortugolParser.g:7268:2: rule__PreDefinedFunctionCall__Group__3__Impl
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
    // InternalPortugolParser.g:7274:1: rule__PreDefinedFunctionCall__Group__3__Impl : ( RightParenthesis ) ;
    public final void rule__PreDefinedFunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7278:1: ( ( RightParenthesis ) )
            // InternalPortugolParser.g:7279:1: ( RightParenthesis )
            {
            // InternalPortugolParser.g:7279:1: ( RightParenthesis )
            // InternalPortugolParser.g:7280:2: RightParenthesis
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
    // InternalPortugolParser.g:7290:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7294:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalPortugolParser.g:7295:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
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
    // InternalPortugolParser.g:7302:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__FbNameAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7306:1: ( ( ( rule__FunctionCall__FbNameAssignment_0 ) ) )
            // InternalPortugolParser.g:7307:1: ( ( rule__FunctionCall__FbNameAssignment_0 ) )
            {
            // InternalPortugolParser.g:7307:1: ( ( rule__FunctionCall__FbNameAssignment_0 ) )
            // InternalPortugolParser.g:7308:2: ( rule__FunctionCall__FbNameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFbNameAssignment_0()); 
            }
            // InternalPortugolParser.g:7309:2: ( rule__FunctionCall__FbNameAssignment_0 )
            // InternalPortugolParser.g:7309:3: rule__FunctionCall__FbNameAssignment_0
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
    // InternalPortugolParser.g:7317:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7321:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // InternalPortugolParser.g:7322:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
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
    // InternalPortugolParser.g:7329:1: rule__FunctionCall__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7333:1: ( ( LeftParenthesis ) )
            // InternalPortugolParser.g:7334:1: ( LeftParenthesis )
            {
            // InternalPortugolParser.g:7334:1: ( LeftParenthesis )
            // InternalPortugolParser.g:7335:2: LeftParenthesis
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
    // InternalPortugolParser.g:7344:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7348:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // InternalPortugolParser.g:7349:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
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
    // InternalPortugolParser.g:7356:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__ParamAssignment_2 ) ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7360:1: ( ( ( rule__FunctionCall__ParamAssignment_2 ) ) )
            // InternalPortugolParser.g:7361:1: ( ( rule__FunctionCall__ParamAssignment_2 ) )
            {
            // InternalPortugolParser.g:7361:1: ( ( rule__FunctionCall__ParamAssignment_2 ) )
            // InternalPortugolParser.g:7362:2: ( rule__FunctionCall__ParamAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParamAssignment_2()); 
            }
            // InternalPortugolParser.g:7363:2: ( rule__FunctionCall__ParamAssignment_2 )
            // InternalPortugolParser.g:7363:3: rule__FunctionCall__ParamAssignment_2
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
    // InternalPortugolParser.g:7371:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7375:1: ( rule__FunctionCall__Group__3__Impl )
            // InternalPortugolParser.g:7376:2: rule__FunctionCall__Group__3__Impl
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
    // InternalPortugolParser.g:7382:1: rule__FunctionCall__Group__3__Impl : ( RightParenthesis ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7386:1: ( ( RightParenthesis ) )
            // InternalPortugolParser.g:7387:1: ( RightParenthesis )
            {
            // InternalPortugolParser.g:7387:1: ( RightParenthesis )
            // InternalPortugolParser.g:7388:2: RightParenthesis
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
    // InternalPortugolParser.g:7398:1: rule__Literal__Group_0__0 : rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 ;
    public final void rule__Literal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7402:1: ( rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 )
            // InternalPortugolParser.g:7403:2: rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1
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
    // InternalPortugolParser.g:7410:1: rule__Literal__Group_0__0__Impl : ( () ) ;
    public final void rule__Literal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7414:1: ( ( () ) )
            // InternalPortugolParser.g:7415:1: ( () )
            {
            // InternalPortugolParser.g:7415:1: ( () )
            // InternalPortugolParser.g:7416:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getLiteralAction_0_0()); 
            }
            // InternalPortugolParser.g:7417:2: ()
            // InternalPortugolParser.g:7417:3: 
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
    // InternalPortugolParser.g:7425:1: rule__Literal__Group_0__1 : rule__Literal__Group_0__1__Impl ;
    public final void rule__Literal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7429:1: ( rule__Literal__Group_0__1__Impl )
            // InternalPortugolParser.g:7430:2: rule__Literal__Group_0__1__Impl
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
    // InternalPortugolParser.g:7436:1: rule__Literal__Group_0__1__Impl : ( rulePiLiteral ) ;
    public final void rule__Literal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7440:1: ( ( rulePiLiteral ) )
            // InternalPortugolParser.g:7441:1: ( rulePiLiteral )
            {
            // InternalPortugolParser.g:7441:1: ( rulePiLiteral )
            // InternalPortugolParser.g:7442:2: rulePiLiteral
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
    // InternalPortugolParser.g:7452:1: rule__Model__HeaderAssignment_0 : ( ruleHeaderBlock ) ;
    public final void rule__Model__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7456:1: ( ( ruleHeaderBlock ) )
            // InternalPortugolParser.g:7457:2: ( ruleHeaderBlock )
            {
            // InternalPortugolParser.g:7457:2: ( ruleHeaderBlock )
            // InternalPortugolParser.g:7458:3: ruleHeaderBlock
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
    // InternalPortugolParser.g:7467:1: rule__Model__GlobalDeclarationsAssignment_1 : ( ruleDeclarationsBlock ) ;
    public final void rule__Model__GlobalDeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7471:1: ( ( ruleDeclarationsBlock ) )
            // InternalPortugolParser.g:7472:2: ( ruleDeclarationsBlock )
            {
            // InternalPortugolParser.g:7472:2: ( ruleDeclarationsBlock )
            // InternalPortugolParser.g:7473:3: ruleDeclarationsBlock
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
    // InternalPortugolParser.g:7482:1: rule__Model__SubprogramsAssignment_2 : ( ruleSubprograms ) ;
    public final void rule__Model__SubprogramsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7486:1: ( ( ruleSubprograms ) )
            // InternalPortugolParser.g:7487:2: ( ruleSubprograms )
            {
            // InternalPortugolParser.g:7487:2: ( ruleSubprograms )
            // InternalPortugolParser.g:7488:3: ruleSubprograms
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
    // InternalPortugolParser.g:7497:1: rule__Model__CommandsAssignment_3 : ( ruleBlockCommand ) ;
    public final void rule__Model__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7501:1: ( ( ruleBlockCommand ) )
            // InternalPortugolParser.g:7502:2: ( ruleBlockCommand )
            {
            // InternalPortugolParser.g:7502:2: ( ruleBlockCommand )
            // InternalPortugolParser.g:7503:3: ruleBlockCommand
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
    // InternalPortugolParser.g:7512:1: rule__HeaderBlock__AlgorithmNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__HeaderBlock__AlgorithmNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7516:1: ( ( RULE_STRING ) )
            // InternalPortugolParser.g:7517:2: ( RULE_STRING )
            {
            // InternalPortugolParser.g:7517:2: ( RULE_STRING )
            // InternalPortugolParser.g:7518:3: RULE_STRING
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
    // InternalPortugolParser.g:7527:1: rule__DeclarationsBlock__VarsAssignment_1_0 : ( ruleVariable ) ;
    public final void rule__DeclarationsBlock__VarsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7531:1: ( ( ruleVariable ) )
            // InternalPortugolParser.g:7532:2: ( ruleVariable )
            {
            // InternalPortugolParser.g:7532:2: ( ruleVariable )
            // InternalPortugolParser.g:7533:3: ruleVariable
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
    // InternalPortugolParser.g:7542:1: rule__Variable__VarDeclarationAssignment_0 : ( ruleVarDeclaration ) ;
    public final void rule__Variable__VarDeclarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7546:1: ( ( ruleVarDeclaration ) )
            // InternalPortugolParser.g:7547:2: ( ruleVarDeclaration )
            {
            // InternalPortugolParser.g:7547:2: ( ruleVarDeclaration )
            // InternalPortugolParser.g:7548:3: ruleVarDeclaration
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
    // InternalPortugolParser.g:7557:1: rule__Variable__TypeAssignment_2 : ( ruleVarType ) ;
    public final void rule__Variable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7561:1: ( ( ruleVarType ) )
            // InternalPortugolParser.g:7562:2: ( ruleVarType )
            {
            // InternalPortugolParser.g:7562:2: ( ruleVarType )
            // InternalPortugolParser.g:7563:3: ruleVarType
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
    // InternalPortugolParser.g:7572:1: rule__VarDeclaration__VarsAssignment_0 : ( ruleVarName ) ;
    public final void rule__VarDeclaration__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7576:1: ( ( ruleVarName ) )
            // InternalPortugolParser.g:7577:2: ( ruleVarName )
            {
            // InternalPortugolParser.g:7577:2: ( ruleVarName )
            // InternalPortugolParser.g:7578:3: ruleVarName
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
    // InternalPortugolParser.g:7587:1: rule__VarDeclaration__VarsAssignment_1_1 : ( ruleVarName ) ;
    public final void rule__VarDeclaration__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7591:1: ( ( ruleVarName ) )
            // InternalPortugolParser.g:7592:2: ( ruleVarName )
            {
            // InternalPortugolParser.g:7592:2: ( ruleVarName )
            // InternalPortugolParser.g:7593:3: ruleVarName
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
    // InternalPortugolParser.g:7602:1: rule__DeclaredVarList__VarsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredVarList__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7606:1: ( ( ( RULE_ID ) ) )
            // InternalPortugolParser.g:7607:2: ( ( RULE_ID ) )
            {
            // InternalPortugolParser.g:7607:2: ( ( RULE_ID ) )
            // InternalPortugolParser.g:7608:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getVarsVarNameCrossReference_0_0()); 
            }
            // InternalPortugolParser.g:7609:3: ( RULE_ID )
            // InternalPortugolParser.g:7610:4: RULE_ID
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
    // InternalPortugolParser.g:7621:1: rule__DeclaredVarList__VarsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredVarList__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7625:1: ( ( ( RULE_ID ) ) )
            // InternalPortugolParser.g:7626:2: ( ( RULE_ID ) )
            {
            // InternalPortugolParser.g:7626:2: ( ( RULE_ID ) )
            // InternalPortugolParser.g:7627:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getVarsVarNameCrossReference_1_1_0()); 
            }
            // InternalPortugolParser.g:7628:3: ( RULE_ID )
            // InternalPortugolParser.g:7629:4: RULE_ID
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
    // InternalPortugolParser.g:7640:1: rule__VarName__NameAssignment : ( RULE_ID ) ;
    public final void rule__VarName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7644:1: ( ( RULE_ID ) )
            // InternalPortugolParser.g:7645:2: ( RULE_ID )
            {
            // InternalPortugolParser.g:7645:2: ( RULE_ID )
            // InternalPortugolParser.g:7646:3: RULE_ID
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
    // InternalPortugolParser.g:7655:1: rule__VarType__TypeNameAssignment : ( ( rule__VarType__TypeNameAlternatives_0 ) ) ;
    public final void rule__VarType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7659:1: ( ( ( rule__VarType__TypeNameAlternatives_0 ) ) )
            // InternalPortugolParser.g:7660:2: ( ( rule__VarType__TypeNameAlternatives_0 ) )
            {
            // InternalPortugolParser.g:7660:2: ( ( rule__VarType__TypeNameAlternatives_0 ) )
            // InternalPortugolParser.g:7661:3: ( rule__VarType__TypeNameAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarTypeAccess().getTypeNameAlternatives_0()); 
            }
            // InternalPortugolParser.g:7662:3: ( rule__VarType__TypeNameAlternatives_0 )
            // InternalPortugolParser.g:7662:4: rule__VarType__TypeNameAlternatives_0
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
    // InternalPortugolParser.g:7670:1: rule__Subprograms__BlockSubProgramsAssignment : ( ruleBlockSubPrograms ) ;
    public final void rule__Subprograms__BlockSubProgramsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7674:1: ( ( ruleBlockSubPrograms ) )
            // InternalPortugolParser.g:7675:2: ( ruleBlockSubPrograms )
            {
            // InternalPortugolParser.g:7675:2: ( ruleBlockSubPrograms )
            // InternalPortugolParser.g:7676:3: ruleBlockSubPrograms
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
    // InternalPortugolParser.g:7685:1: rule__ProcedureName__NameAssignment : ( RULE_ID ) ;
    public final void rule__ProcedureName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7689:1: ( ( RULE_ID ) )
            // InternalPortugolParser.g:7690:2: ( RULE_ID )
            {
            // InternalPortugolParser.g:7690:2: ( RULE_ID )
            // InternalPortugolParser.g:7691:3: RULE_ID
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
    // InternalPortugolParser.g:7700:1: rule__FunctionName__NameAssignment : ( RULE_ID ) ;
    public final void rule__FunctionName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7704:1: ( ( RULE_ID ) )
            // InternalPortugolParser.g:7705:2: ( RULE_ID )
            {
            // InternalPortugolParser.g:7705:2: ( RULE_ID )
            // InternalPortugolParser.g:7706:3: RULE_ID
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
    // InternalPortugolParser.g:7715:1: rule__BlockFunction__FunctionNameAssignment_1 : ( ruleFunctionName ) ;
    public final void rule__BlockFunction__FunctionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7719:1: ( ( ruleFunctionName ) )
            // InternalPortugolParser.g:7720:2: ( ruleFunctionName )
            {
            // InternalPortugolParser.g:7720:2: ( ruleFunctionName )
            // InternalPortugolParser.g:7721:3: ruleFunctionName
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


    // $ANTLR start "rule__BlockFunction__ParamsAssignment_3"
    // InternalPortugolParser.g:7730:1: rule__BlockFunction__ParamsAssignment_3 : ( ruleSubprogramParamDeclaration ) ;
    public final void rule__BlockFunction__ParamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7734:1: ( ( ruleSubprogramParamDeclaration ) )
            // InternalPortugolParser.g:7735:2: ( ruleSubprogramParamDeclaration )
            {
            // InternalPortugolParser.g:7735:2: ( ruleSubprogramParamDeclaration )
            // InternalPortugolParser.g:7736:3: ruleSubprogramParamDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getParamsSubprogramParamDeclarationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSubprogramParamDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getParamsSubprogramParamDeclarationParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockFunction__ParamsAssignment_3"


    // $ANTLR start "rule__BlockFunction__ReturnTypeAssignment_6"
    // InternalPortugolParser.g:7745:1: rule__BlockFunction__ReturnTypeAssignment_6 : ( ruleVarType ) ;
    public final void rule__BlockFunction__ReturnTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7749:1: ( ( ruleVarType ) )
            // InternalPortugolParser.g:7750:2: ( ruleVarType )
            {
            // InternalPortugolParser.g:7750:2: ( ruleVarType )
            // InternalPortugolParser.g:7751:3: ruleVarType
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
    // InternalPortugolParser.g:7760:1: rule__BlockFunction__DeclarationsAssignment_7 : ( ruleDeclarationsBlock ) ;
    public final void rule__BlockFunction__DeclarationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7764:1: ( ( ruleDeclarationsBlock ) )
            // InternalPortugolParser.g:7765:2: ( ruleDeclarationsBlock )
            {
            // InternalPortugolParser.g:7765:2: ( ruleDeclarationsBlock )
            // InternalPortugolParser.g:7766:3: ruleDeclarationsBlock
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
    // InternalPortugolParser.g:7775:1: rule__BlockFunction__CommandsAssignment_9 : ( ruleAbstractCommand ) ;
    public final void rule__BlockFunction__CommandsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7779:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:7780:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:7780:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:7781:3: ruleAbstractCommand
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
    // InternalPortugolParser.g:7790:1: rule__BlockProcedure__ProcedureNameAssignment_1 : ( ruleProcedureName ) ;
    public final void rule__BlockProcedure__ProcedureNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7794:1: ( ( ruleProcedureName ) )
            // InternalPortugolParser.g:7795:2: ( ruleProcedureName )
            {
            // InternalPortugolParser.g:7795:2: ( ruleProcedureName )
            // InternalPortugolParser.g:7796:3: ruleProcedureName
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


    // $ANTLR start "rule__BlockProcedure__ParamsAssignment_3"
    // InternalPortugolParser.g:7805:1: rule__BlockProcedure__ParamsAssignment_3 : ( ruleSubprogramParamDeclaration ) ;
    public final void rule__BlockProcedure__ParamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7809:1: ( ( ruleSubprogramParamDeclaration ) )
            // InternalPortugolParser.g:7810:2: ( ruleSubprogramParamDeclaration )
            {
            // InternalPortugolParser.g:7810:2: ( ruleSubprogramParamDeclaration )
            // InternalPortugolParser.g:7811:3: ruleSubprogramParamDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getParamsSubprogramParamDeclarationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSubprogramParamDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getParamsSubprogramParamDeclarationParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockProcedure__ParamsAssignment_3"


    // $ANTLR start "rule__BlockProcedure__DeclarationsAssignment_5"
    // InternalPortugolParser.g:7820:1: rule__BlockProcedure__DeclarationsAssignment_5 : ( ruleDeclarationsBlock ) ;
    public final void rule__BlockProcedure__DeclarationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7824:1: ( ( ruleDeclarationsBlock ) )
            // InternalPortugolParser.g:7825:2: ( ruleDeclarationsBlock )
            {
            // InternalPortugolParser.g:7825:2: ( ruleDeclarationsBlock )
            // InternalPortugolParser.g:7826:3: ruleDeclarationsBlock
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
    // InternalPortugolParser.g:7835:1: rule__BlockProcedure__CommandsAssignment_7 : ( ruleAbstractCommand ) ;
    public final void rule__BlockProcedure__CommandsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7839:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:7840:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:7840:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:7841:3: ruleAbstractCommand
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


    // $ANTLR start "rule__SubprogramParamDeclaration__ParamListAssignment_0"
    // InternalPortugolParser.g:7850:1: rule__SubprogramParamDeclaration__ParamListAssignment_0 : ( ruleVariable ) ;
    public final void rule__SubprogramParamDeclaration__ParamListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7854:1: ( ( ruleVariable ) )
            // InternalPortugolParser.g:7855:2: ( ruleVariable )
            {
            // InternalPortugolParser.g:7855:2: ( ruleVariable )
            // InternalPortugolParser.g:7856:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamDeclarationAccess().getParamListVariableParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubprogramParamDeclarationAccess().getParamListVariableParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubprogramParamDeclaration__ParamListAssignment_0"


    // $ANTLR start "rule__SubprogramParamDeclaration__ParamListAssignment_1_1"
    // InternalPortugolParser.g:7865:1: rule__SubprogramParamDeclaration__ParamListAssignment_1_1 : ( ruleVariable ) ;
    public final void rule__SubprogramParamDeclaration__ParamListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7869:1: ( ( ruleVariable ) )
            // InternalPortugolParser.g:7870:2: ( ruleVariable )
            {
            // InternalPortugolParser.g:7870:2: ( ruleVariable )
            // InternalPortugolParser.g:7871:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamDeclarationAccess().getParamListVariableParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubprogramParamDeclarationAccess().getParamListVariableParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubprogramParamDeclaration__ParamListAssignment_1_1"


    // $ANTLR start "rule__BlockCommand__CommandsAssignment_1"
    // InternalPortugolParser.g:7880:1: rule__BlockCommand__CommandsAssignment_1 : ( ruleAbstractCommand ) ;
    public final void rule__BlockCommand__CommandsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7884:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:7885:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:7885:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:7886:3: ruleAbstractCommand
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
    // InternalPortugolParser.g:7895:1: rule__ReturnStatement__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__ReturnStatement__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7899:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:7900:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:7900:2: ( ruleExpression )
            // InternalPortugolParser.g:7901:3: ruleExpression
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
    // InternalPortugolParser.g:7910:1: rule__IfStatement__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__IfStatement__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7914:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:7915:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:7915:2: ( ruleExpression )
            // InternalPortugolParser.g:7916:3: ruleExpression
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
    // InternalPortugolParser.g:7925:1: rule__IfStatement__CommandsAssignment_3 : ( ruleAbstractCommand ) ;
    public final void rule__IfStatement__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7929:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:7930:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:7930:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:7931:3: ruleAbstractCommand
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
    // InternalPortugolParser.g:7940:1: rule__IfStatement__ElseCommandsAssignment_4_1 : ( ruleAbstractCommand ) ;
    public final void rule__IfStatement__ElseCommandsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7944:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:7945:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:7945:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:7946:3: ruleAbstractCommand
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
    // InternalPortugolParser.g:7955:1: rule__SwitchCaseStatement__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SwitchCaseStatement__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7959:1: ( ( ( RULE_ID ) ) )
            // InternalPortugolParser.g:7960:2: ( ( RULE_ID ) )
            {
            // InternalPortugolParser.g:7960:2: ( ( RULE_ID ) )
            // InternalPortugolParser.g:7961:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getVariableVarNameCrossReference_1_0()); 
            }
            // InternalPortugolParser.g:7962:3: ( RULE_ID )
            // InternalPortugolParser.g:7963:4: RULE_ID
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
    // InternalPortugolParser.g:7974:1: rule__SwitchCaseStatement__CaseListAssignment_2 : ( ruleCaseList ) ;
    public final void rule__SwitchCaseStatement__CaseListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7978:1: ( ( ruleCaseList ) )
            // InternalPortugolParser.g:7979:2: ( ruleCaseList )
            {
            // InternalPortugolParser.g:7979:2: ( ruleCaseList )
            // InternalPortugolParser.g:7980:3: ruleCaseList
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
    // InternalPortugolParser.g:7989:1: rule__SwitchCaseStatement__OtherCaseAssignment_3 : ( ruleOtherCase ) ;
    public final void rule__SwitchCaseStatement__OtherCaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7993:1: ( ( ruleOtherCase ) )
            // InternalPortugolParser.g:7994:2: ( ruleOtherCase )
            {
            // InternalPortugolParser.g:7994:2: ( ruleOtherCase )
            // InternalPortugolParser.g:7995:3: ruleOtherCase
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
    // InternalPortugolParser.g:8004:1: rule__CaseList__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__CaseList__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8008:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:8009:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:8009:2: ( ruleExpression )
            // InternalPortugolParser.g:8010:3: ruleExpression
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
    // InternalPortugolParser.g:8019:1: rule__CaseList__CommandsAssignment_3 : ( ruleAbstractCommand ) ;
    public final void rule__CaseList__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8023:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:8024:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:8024:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:8025:3: ruleAbstractCommand
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
    // InternalPortugolParser.g:8034:1: rule__OtherCase__OtherCaseCommandsAssignment_2 : ( ruleAbstractCommand ) ;
    public final void rule__OtherCase__OtherCaseCommandsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8038:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:8039:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:8039:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:8040:3: ruleAbstractCommand
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
    // InternalPortugolParser.g:8049:1: rule__ForStatement__OperatorExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__ForStatement__OperatorExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8053:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:8054:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:8054:2: ( ruleExpression )
            // InternalPortugolParser.g:8055:3: ruleExpression
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
    // InternalPortugolParser.g:8064:1: rule__ForStatement__StartExprAssignment_3 : ( ruleExpression ) ;
    public final void rule__ForStatement__StartExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8068:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:8069:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:8069:2: ( ruleExpression )
            // InternalPortugolParser.g:8070:3: ruleExpression
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
    // InternalPortugolParser.g:8079:1: rule__ForStatement__EndExprAssignment_5 : ( ruleExpression ) ;
    public final void rule__ForStatement__EndExprAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8083:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:8084:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:8084:2: ( ruleExpression )
            // InternalPortugolParser.g:8085:3: ruleExpression
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
    // InternalPortugolParser.g:8094:1: rule__ForStatement__StepExpeAssignment_6_1 : ( ruleExpression ) ;
    public final void rule__ForStatement__StepExpeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8098:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:8099:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:8099:2: ( ruleExpression )
            // InternalPortugolParser.g:8100:3: ruleExpression
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
    // InternalPortugolParser.g:8109:1: rule__ForStatement__CommandsAssignment_8 : ( ruleAbstractCommand ) ;
    public final void rule__ForStatement__CommandsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8113:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:8114:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:8114:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:8115:3: ruleAbstractCommand
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
    // InternalPortugolParser.g:8124:1: rule__WhileStatement__WhileExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__WhileStatement__WhileExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8128:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:8129:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:8129:2: ( ruleExpression )
            // InternalPortugolParser.g:8130:3: ruleExpression
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
    // InternalPortugolParser.g:8139:1: rule__WhileStatement__CommandsAssignment_3 : ( ruleAbstractCommand ) ;
    public final void rule__WhileStatement__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8143:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:8144:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:8144:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:8145:3: ruleAbstractCommand
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
    // InternalPortugolParser.g:8154:1: rule__RepeatStatement__CommandsAssignment_1 : ( ruleAbstractCommand ) ;
    public final void rule__RepeatStatement__CommandsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8158:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:8159:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:8159:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:8160:3: ruleAbstractCommand
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
    // InternalPortugolParser.g:8169:1: rule__RepeatStatement__UntilExprAssignment_3 : ( ruleExpression ) ;
    public final void rule__RepeatStatement__UntilExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8173:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:8174:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:8174:2: ( ruleExpression )
            // InternalPortugolParser.g:8175:3: ruleExpression
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
    // InternalPortugolParser.g:8184:1: rule__SubprogramParam__ExpressionAssignment_0 : ( ruleExpression ) ;
    public final void rule__SubprogramParam__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8188:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:8189:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:8189:2: ( ruleExpression )
            // InternalPortugolParser.g:8190:3: ruleExpression
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
    // InternalPortugolParser.g:8199:1: rule__SubprogramParam__ExpressionAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__SubprogramParam__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8203:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:8204:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:8204:2: ( ruleExpression )
            // InternalPortugolParser.g:8205:3: ruleExpression
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
    // InternalPortugolParser.g:8214:1: rule__ReadCommand__ParamListAssignment_2 : ( ruleDeclaredVarList ) ;
    public final void rule__ReadCommand__ParamListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8218:1: ( ( ruleDeclaredVarList ) )
            // InternalPortugolParser.g:8219:2: ( ruleDeclaredVarList )
            {
            // InternalPortugolParser.g:8219:2: ( ruleDeclaredVarList )
            // InternalPortugolParser.g:8220:3: ruleDeclaredVarList
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
    // InternalPortugolParser.g:8229:1: rule__WriteCommand__WriteCommandAssignment_0 : ( ( rule__WriteCommand__WriteCommandAlternatives_0_0 ) ) ;
    public final void rule__WriteCommand__WriteCommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8233:1: ( ( ( rule__WriteCommand__WriteCommandAlternatives_0_0 ) ) )
            // InternalPortugolParser.g:8234:2: ( ( rule__WriteCommand__WriteCommandAlternatives_0_0 ) )
            {
            // InternalPortugolParser.g:8234:2: ( ( rule__WriteCommand__WriteCommandAlternatives_0_0 ) )
            // InternalPortugolParser.g:8235:3: ( rule__WriteCommand__WriteCommandAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getWriteCommandAlternatives_0_0()); 
            }
            // InternalPortugolParser.g:8236:3: ( rule__WriteCommand__WriteCommandAlternatives_0_0 )
            // InternalPortugolParser.g:8236:4: rule__WriteCommand__WriteCommandAlternatives_0_0
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
    // InternalPortugolParser.g:8244:1: rule__WriteCommand__WriteParamAssignment_2 : ( ruleWriteParam ) ;
    public final void rule__WriteCommand__WriteParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8248:1: ( ( ruleWriteParam ) )
            // InternalPortugolParser.g:8249:2: ( ruleWriteParam )
            {
            // InternalPortugolParser.g:8249:2: ( ruleWriteParam )
            // InternalPortugolParser.g:8250:3: ruleWriteParam
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
    // InternalPortugolParser.g:8259:1: rule__WriteParam__ParamsAssignment_0 : ( ruleSubprogramParam ) ;
    public final void rule__WriteParam__ParamsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8263:1: ( ( ruleSubprogramParam ) )
            // InternalPortugolParser.g:8264:2: ( ruleSubprogramParam )
            {
            // InternalPortugolParser.g:8264:2: ( ruleSubprogramParam )
            // InternalPortugolParser.g:8265:3: ruleSubprogramParam
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
    // InternalPortugolParser.g:8274:1: rule__WriteParam__PrecisionAssignment_1 : ( ruleOptDecimalPrecision ) ;
    public final void rule__WriteParam__PrecisionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8278:1: ( ( ruleOptDecimalPrecision ) )
            // InternalPortugolParser.g:8279:2: ( ruleOptDecimalPrecision )
            {
            // InternalPortugolParser.g:8279:2: ( ruleOptDecimalPrecision )
            // InternalPortugolParser.g:8280:3: ruleOptDecimalPrecision
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
    // InternalPortugolParser.g:8289:1: rule__OptDecimalPrecision__FirstPrecisionAssignment_1 : ( RULE_INT ) ;
    public final void rule__OptDecimalPrecision__FirstPrecisionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8293:1: ( ( RULE_INT ) )
            // InternalPortugolParser.g:8294:2: ( RULE_INT )
            {
            // InternalPortugolParser.g:8294:2: ( RULE_INT )
            // InternalPortugolParser.g:8295:3: RULE_INT
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
    // InternalPortugolParser.g:8304:1: rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8308:1: ( ( RULE_INT ) )
            // InternalPortugolParser.g:8309:2: ( RULE_INT )
            {
            // InternalPortugolParser.g:8309:2: ( RULE_INT )
            // InternalPortugolParser.g:8310:3: RULE_INT
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
    // InternalPortugolParser.g:8319:1: rule__Assignment__OpAssignment_1_0_0_1 : ( ( LessThanSignHyphenMinus ) ) ;
    public final void rule__Assignment__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8323:1: ( ( ( LessThanSignHyphenMinus ) ) )
            // InternalPortugolParser.g:8324:2: ( ( LessThanSignHyphenMinus ) )
            {
            // InternalPortugolParser.g:8324:2: ( ( LessThanSignHyphenMinus ) )
            // InternalPortugolParser.g:8325:3: ( LessThanSignHyphenMinus )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOpLessThanSignHyphenMinusKeyword_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:8326:3: ( LessThanSignHyphenMinus )
            // InternalPortugolParser.g:8327:4: LessThanSignHyphenMinus
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
    // InternalPortugolParser.g:8338:1: rule__Assignment__RightAssignment_1_1 : ( ruleAssignment ) ;
    public final void rule__Assignment__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8342:1: ( ( ruleAssignment ) )
            // InternalPortugolParser.g:8343:2: ( ruleAssignment )
            {
            // InternalPortugolParser.g:8343:2: ( ruleAssignment )
            // InternalPortugolParser.g:8344:3: ruleAssignment
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
    // InternalPortugolParser.g:8353:1: rule__OrExpression__OpAssignment_1_0_0_1 : ( ( OU ) ) ;
    public final void rule__OrExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8357:1: ( ( ( OU ) ) )
            // InternalPortugolParser.g:8358:2: ( ( OU ) )
            {
            // InternalPortugolParser.g:8358:2: ( ( OU ) )
            // InternalPortugolParser.g:8359:3: ( OU )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpOUKeyword_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:8360:3: ( OU )
            // InternalPortugolParser.g:8361:4: OU
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
    // InternalPortugolParser.g:8372:1: rule__OrExpression__RightAssignment_1_1 : ( ruleXorExpression ) ;
    public final void rule__OrExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8376:1: ( ( ruleXorExpression ) )
            // InternalPortugolParser.g:8377:2: ( ruleXorExpression )
            {
            // InternalPortugolParser.g:8377:2: ( ruleXorExpression )
            // InternalPortugolParser.g:8378:3: ruleXorExpression
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
    // InternalPortugolParser.g:8387:1: rule__XorExpression__OpAssignment_1_0_0_1 : ( ( XOU ) ) ;
    public final void rule__XorExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8391:1: ( ( ( XOU ) ) )
            // InternalPortugolParser.g:8392:2: ( ( XOU ) )
            {
            // InternalPortugolParser.g:8392:2: ( ( XOU ) )
            // InternalPortugolParser.g:8393:3: ( XOU )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOpXOUKeyword_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:8394:3: ( XOU )
            // InternalPortugolParser.g:8395:4: XOU
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
    // InternalPortugolParser.g:8406:1: rule__XorExpression__RightAssignment_1_1 : ( ruleAndExpression ) ;
    public final void rule__XorExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8410:1: ( ( ruleAndExpression ) )
            // InternalPortugolParser.g:8411:2: ( ruleAndExpression )
            {
            // InternalPortugolParser.g:8411:2: ( ruleAndExpression )
            // InternalPortugolParser.g:8412:3: ruleAndExpression
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
    // InternalPortugolParser.g:8421:1: rule__AndExpression__OpAssignment_1_0_0_1 : ( ( rule__AndExpression__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__AndExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8425:1: ( ( ( rule__AndExpression__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugolParser.g:8426:2: ( ( rule__AndExpression__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugolParser.g:8426:2: ( ( rule__AndExpression__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugolParser.g:8427:3: ( rule__AndExpression__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:8428:3: ( rule__AndExpression__OpAlternatives_1_0_0_1_0 )
            // InternalPortugolParser.g:8428:4: rule__AndExpression__OpAlternatives_1_0_0_1_0
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
    // InternalPortugolParser.g:8436:1: rule__AndExpression__RightAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__AndExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8440:1: ( ( ruleComparison ) )
            // InternalPortugolParser.g:8441:2: ( ruleComparison )
            {
            // InternalPortugolParser.g:8441:2: ( ruleComparison )
            // InternalPortugolParser.g:8442:3: ruleComparison
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
    // InternalPortugolParser.g:8451:1: rule__Comparison__OpAssignment_1_0_0_1 : ( ( rule__Comparison__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8455:1: ( ( ( rule__Comparison__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugolParser.g:8456:2: ( ( rule__Comparison__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugolParser.g:8456:2: ( ( rule__Comparison__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugolParser.g:8457:3: ( rule__Comparison__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:8458:3: ( rule__Comparison__OpAlternatives_1_0_0_1_0 )
            // InternalPortugolParser.g:8458:4: rule__Comparison__OpAlternatives_1_0_0_1_0
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
    // InternalPortugolParser.g:8466:1: rule__Comparison__RightAssignment_1_1 : ( ruleEquExpression ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8470:1: ( ( ruleEquExpression ) )
            // InternalPortugolParser.g:8471:2: ( ruleEquExpression )
            {
            // InternalPortugolParser.g:8471:2: ( ruleEquExpression )
            // InternalPortugolParser.g:8472:3: ruleEquExpression
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
    // InternalPortugolParser.g:8481:1: rule__EquExpression__OpAssignment_1_0_0_1 : ( ( rule__EquExpression__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__EquExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8485:1: ( ( ( rule__EquExpression__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugolParser.g:8486:2: ( ( rule__EquExpression__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugolParser.g:8486:2: ( ( rule__EquExpression__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugolParser.g:8487:3: ( rule__EquExpression__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:8488:3: ( rule__EquExpression__OpAlternatives_1_0_0_1_0 )
            // InternalPortugolParser.g:8488:4: rule__EquExpression__OpAlternatives_1_0_0_1_0
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
    // InternalPortugolParser.g:8496:1: rule__EquExpression__RightAssignment_1_1 : ( ruleAddExpression ) ;
    public final void rule__EquExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8500:1: ( ( ruleAddExpression ) )
            // InternalPortugolParser.g:8501:2: ( ruleAddExpression )
            {
            // InternalPortugolParser.g:8501:2: ( ruleAddExpression )
            // InternalPortugolParser.g:8502:3: ruleAddExpression
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
    // InternalPortugolParser.g:8511:1: rule__AddExpression__OpAssignment_1_0_0_1 : ( ( rule__AddExpression__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__AddExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8515:1: ( ( ( rule__AddExpression__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugolParser.g:8516:2: ( ( rule__AddExpression__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugolParser.g:8516:2: ( ( rule__AddExpression__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugolParser.g:8517:3: ( rule__AddExpression__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:8518:3: ( rule__AddExpression__OpAlternatives_1_0_0_1_0 )
            // InternalPortugolParser.g:8518:4: rule__AddExpression__OpAlternatives_1_0_0_1_0
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
    // InternalPortugolParser.g:8526:1: rule__AddExpression__RightAssignment_1_1 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AddExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8530:1: ( ( ruleMultiplicativeExpression ) )
            // InternalPortugolParser.g:8531:2: ( ruleMultiplicativeExpression )
            {
            // InternalPortugolParser.g:8531:2: ( ruleMultiplicativeExpression )
            // InternalPortugolParser.g:8532:3: ruleMultiplicativeExpression
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
    // InternalPortugolParser.g:8541:1: rule__MultiplicativeExpression__OpAssignment_1_0_0_1 : ( ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__MultiplicativeExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8545:1: ( ( ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugolParser.g:8546:2: ( ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugolParser.g:8546:2: ( ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugolParser.g:8547:3: ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:8548:3: ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 )
            // InternalPortugolParser.g:8548:4: rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0
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
    // InternalPortugolParser.g:8556:1: rule__MultiplicativeExpression__RightAssignment_1_1 : ( rulePowerExpression ) ;
    public final void rule__MultiplicativeExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8560:1: ( ( rulePowerExpression ) )
            // InternalPortugolParser.g:8561:2: ( rulePowerExpression )
            {
            // InternalPortugolParser.g:8561:2: ( rulePowerExpression )
            // InternalPortugolParser.g:8562:3: rulePowerExpression
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
    // InternalPortugolParser.g:8571:1: rule__PowerExpression__OpAssignment_1_0_0_1 : ( ( CircumflexAccent ) ) ;
    public final void rule__PowerExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8575:1: ( ( ( CircumflexAccent ) ) )
            // InternalPortugolParser.g:8576:2: ( ( CircumflexAccent ) )
            {
            // InternalPortugolParser.g:8576:2: ( ( CircumflexAccent ) )
            // InternalPortugolParser.g:8577:3: ( CircumflexAccent )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getOpCircumflexAccentKeyword_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:8578:3: ( CircumflexAccent )
            // InternalPortugolParser.g:8579:4: CircumflexAccent
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
    // InternalPortugolParser.g:8590:1: rule__PowerExpression__RightAssignment_1_1 : ( ruleUnaryExpression ) ;
    public final void rule__PowerExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8594:1: ( ( ruleUnaryExpression ) )
            // InternalPortugolParser.g:8595:2: ( ruleUnaryExpression )
            {
            // InternalPortugolParser.g:8595:2: ( ruleUnaryExpression )
            // InternalPortugolParser.g:8596:3: ruleUnaryExpression
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
    // InternalPortugolParser.g:8605:1: rule__UnaryExpression__OpAssignment_0_1 : ( ( rule__UnaryExpression__OpAlternatives_0_1_0 ) ) ;
    public final void rule__UnaryExpression__OpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8609:1: ( ( ( rule__UnaryExpression__OpAlternatives_0_1_0 ) ) )
            // InternalPortugolParser.g:8610:2: ( ( rule__UnaryExpression__OpAlternatives_0_1_0 ) )
            {
            // InternalPortugolParser.g:8610:2: ( ( rule__UnaryExpression__OpAlternatives_0_1_0 ) )
            // InternalPortugolParser.g:8611:3: ( rule__UnaryExpression__OpAlternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOpAlternatives_0_1_0()); 
            }
            // InternalPortugolParser.g:8612:3: ( rule__UnaryExpression__OpAlternatives_0_1_0 )
            // InternalPortugolParser.g:8612:4: rule__UnaryExpression__OpAlternatives_0_1_0
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
    // InternalPortugolParser.g:8620:1: rule__UnaryExpression__OperandAssignment_0_2 : ( ruleUnaryExpression ) ;
    public final void rule__UnaryExpression__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8624:1: ( ( ruleUnaryExpression ) )
            // InternalPortugolParser.g:8625:2: ( ruleUnaryExpression )
            {
            // InternalPortugolParser.g:8625:2: ( ruleUnaryExpression )
            // InternalPortugolParser.g:8626:3: ruleUnaryExpression
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
    // InternalPortugolParser.g:8635:1: rule__PreDefinedFunctionCall__PreDefFunctionNameAssignment_0 : ( rulePredefineFunctions ) ;
    public final void rule__PreDefinedFunctionCall__PreDefFunctionNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8639:1: ( ( rulePredefineFunctions ) )
            // InternalPortugolParser.g:8640:2: ( rulePredefineFunctions )
            {
            // InternalPortugolParser.g:8640:2: ( rulePredefineFunctions )
            // InternalPortugolParser.g:8641:3: rulePredefineFunctions
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
    // InternalPortugolParser.g:8650:1: rule__PreDefinedFunctionCall__ParamAssignment_2 : ( ruleSubprogramParam ) ;
    public final void rule__PreDefinedFunctionCall__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8654:1: ( ( ruleSubprogramParam ) )
            // InternalPortugolParser.g:8655:2: ( ruleSubprogramParam )
            {
            // InternalPortugolParser.g:8655:2: ( ruleSubprogramParam )
            // InternalPortugolParser.g:8656:3: ruleSubprogramParam
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
    // InternalPortugolParser.g:8665:1: rule__FunctionCall__FbNameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__FbNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8669:1: ( ( ( RULE_ID ) ) )
            // InternalPortugolParser.g:8670:2: ( ( RULE_ID ) )
            {
            // InternalPortugolParser.g:8670:2: ( ( RULE_ID ) )
            // InternalPortugolParser.g:8671:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFbNameFunctionNameCrossReference_0_0()); 
            }
            // InternalPortugolParser.g:8672:3: ( RULE_ID )
            // InternalPortugolParser.g:8673:4: RULE_ID
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
    // InternalPortugolParser.g:8684:1: rule__FunctionCall__ParamAssignment_2 : ( ruleSubprogramParam ) ;
    public final void rule__FunctionCall__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8688:1: ( ( ruleSubprogramParam ) )
            // InternalPortugolParser.g:8689:2: ( ruleSubprogramParam )
            {
            // InternalPortugolParser.g:8689:2: ( ruleSubprogramParam )
            // InternalPortugolParser.g:8690:3: ruleSubprogramParam
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
    // InternalPortugolParser.g:8699:1: rule__DeclaredVar__VarNameAssignment : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredVar__VarNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8703:1: ( ( ( RULE_ID ) ) )
            // InternalPortugolParser.g:8704:2: ( ( RULE_ID ) )
            {
            // InternalPortugolParser.g:8704:2: ( ( RULE_ID ) )
            // InternalPortugolParser.g:8705:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getVarNameVarNameCrossReference_0()); 
            }
            // InternalPortugolParser.g:8706:3: ( RULE_ID )
            // InternalPortugolParser.g:8707:4: RULE_ID
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
    // InternalPortugolParser.g:8718:1: rule__NumericLiteral__IntValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__NumericLiteral__IntValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8722:1: ( ( RULE_INT ) )
            // InternalPortugolParser.g:8723:2: ( RULE_INT )
            {
            // InternalPortugolParser.g:8723:2: ( RULE_INT )
            // InternalPortugolParser.g:8724:3: RULE_INT
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
    // InternalPortugolParser.g:8733:1: rule__NumericLiteral__FloatValueAssignment_1 : ( RULE_FLOAT ) ;
    public final void rule__NumericLiteral__FloatValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8737:1: ( ( RULE_FLOAT ) )
            // InternalPortugolParser.g:8738:2: ( RULE_FLOAT )
            {
            // InternalPortugolParser.g:8738:2: ( RULE_FLOAT )
            // InternalPortugolParser.g:8739:3: RULE_FLOAT
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
    // InternalPortugolParser.g:8748:1: rule__StringExpression__LiteralStringAssignment : ( RULE_STRING ) ;
    public final void rule__StringExpression__LiteralStringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8752:1: ( ( RULE_STRING ) )
            // InternalPortugolParser.g:8753:2: ( RULE_STRING )
            {
            // InternalPortugolParser.g:8753:2: ( RULE_STRING )
            // InternalPortugolParser.g:8754:3: RULE_STRING
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

    // $ANTLR start synpred64_InternalPortugolParser
    public final void synpred64_InternalPortugolParser_fragment() throws RecognitionException {   
        // InternalPortugolParser.g:5364:3: ( rule__Assignment__Group_1__0 )
        // InternalPortugolParser.g:5364:3: rule__Assignment__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Assignment__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_InternalPortugolParser

    // Delegated rules

    public final boolean synpred64_InternalPortugolParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_InternalPortugolParser_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x2000000000000002L});
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