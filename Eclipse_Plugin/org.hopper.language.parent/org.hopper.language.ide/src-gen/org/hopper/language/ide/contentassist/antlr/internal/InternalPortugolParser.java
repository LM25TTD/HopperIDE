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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Fimprocedimento", "Fimalgoritmo", "Procedimento", "Fimenquanto", "Fimescolha", "Interrompa", "Algoritmo", "Caractere", "Fimfuncao", "Outrocaso", "Caracter", "Enquanto", "Escreval", "Escolha", "Escreva", "Fimpara", "Inteiro", "Retorne", "Funcao", "Inicio", "Repita", "Entao", "Fimse", "Passo", "Senao", "Caso", "Faca", "Leia", "Para", "Real", "MOD", "NOT", "XOU", "Ate", "Var", "LessThanSignHyphenMinus", "LessThanSignEqualsSign", "LessThanSignGreaterThanSign", "GreaterThanSignEqualsSign", "OU", "De", "Se", "PercentSign", "Ampersand", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "Solidus", "Colon", "Semicolon", "LessThanSign", "EqualsSign", "GreaterThanSign", "E", "CircumflexAccent", "RULE_INT", "RULE_FLOAT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Escreva=18;
    public static final int LessThanSignGreaterThanSign=41;
    public static final int Enquanto=15;
    public static final int Funcao=22;
    public static final int Var=38;
    public static final int Outrocaso=13;
    public static final int Algoritmo=10;
    public static final int LessThanSign=57;
    public static final int Procedimento=6;
    public static final int PercentSign=46;
    public static final int LeftParenthesis=48;
    public static final int Fimfuncao=12;
    public static final int Real=33;
    public static final int Escolha=17;
    public static final int Ampersand=47;
    public static final int Fimpara=19;
    public static final int Fimescolha=8;
    public static final int De=44;
    public static final int GreaterThanSign=59;
    public static final int RULE_ID=64;
    public static final int Para=32;
    public static final int RightParenthesis=49;
    public static final int Senao=28;
    public static final int GreaterThanSignEqualsSign=42;
    public static final int Caracter=14;
    public static final int NOT=35;
    public static final int PlusSign=51;
    public static final int RULE_INT=62;
    public static final int Fimse=26;
    public static final int LessThanSignHyphenMinus=39;
    public static final int RULE_ML_COMMENT=66;
    public static final int Entao=25;
    public static final int Interrompa=9;
    public static final int XOU=36;
    public static final int Caso=29;
    public static final int E=60;
    public static final int Repita=24;
    public static final int Caractere=11;
    public static final int RULE_STRING=65;
    public static final int Passo=27;
    public static final int RULE_SL_COMMENT=67;
    public static final int Comma=52;
    public static final int EqualsSign=58;
    public static final int HyphenMinus=53;
    public static final int Inicio=23;
    public static final int Leia=31;
    public static final int Faca=30;
    public static final int Escreval=16;
    public static final int LessThanSignEqualsSign=40;
    public static final int Solidus=54;
    public static final int Colon=55;
    public static final int EOF=-1;
    public static final int Asterisk=50;
    public static final int Fimenquanto=7;
    public static final int Inteiro=20;
    public static final int MOD=34;
    public static final int RULE_WS=68;
    public static final int Fimprocedimento=4;
    public static final int OU=43;
    public static final int RULE_ANY_OTHER=69;
    public static final int CircumflexAccent=61;
    public static final int Semicolon=56;
    public static final int Se=45;
    public static final int Ate=37;
    public static final int Fimalgoritmo=5;
    public static final int Retorne=21;
    public static final int RULE_FLOAT=63;

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
    		tokenNameToValue.put("Entao", "'entao'");
    		tokenNameToValue.put("Fimse", "'fimse'");
    		tokenNameToValue.put("Passo", "'passo'");
    		tokenNameToValue.put("Senao", "'senao'");
    		tokenNameToValue.put("Funcao", "'funcao'");
    		tokenNameToValue.put("Inicio", "'inicio'");
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
    // InternalPortugolParser.g:114:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalPortugolParser.g:115:1: ( ruleModel EOF )
            // InternalPortugolParser.g:116:1: ruleModel EOF
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
    // InternalPortugolParser.g:123:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:127:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalPortugolParser.g:128:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalPortugolParser.g:128:2: ( ( rule__Model__Group__0 ) )
            // InternalPortugolParser.g:129:3: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // InternalPortugolParser.g:130:3: ( rule__Model__Group__0 )
            // InternalPortugolParser.g:130:4: rule__Model__Group__0
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
    // InternalPortugolParser.g:139:1: entryRuleHeaderBlock : ruleHeaderBlock EOF ;
    public final void entryRuleHeaderBlock() throws RecognitionException {
        try {
            // InternalPortugolParser.g:140:1: ( ruleHeaderBlock EOF )
            // InternalPortugolParser.g:141:1: ruleHeaderBlock EOF
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
    // InternalPortugolParser.g:148:1: ruleHeaderBlock : ( ( rule__HeaderBlock__Group__0 ) ) ;
    public final void ruleHeaderBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:152:2: ( ( ( rule__HeaderBlock__Group__0 ) ) )
            // InternalPortugolParser.g:153:2: ( ( rule__HeaderBlock__Group__0 ) )
            {
            // InternalPortugolParser.g:153:2: ( ( rule__HeaderBlock__Group__0 ) )
            // InternalPortugolParser.g:154:3: ( rule__HeaderBlock__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderBlockAccess().getGroup()); 
            }
            // InternalPortugolParser.g:155:3: ( rule__HeaderBlock__Group__0 )
            // InternalPortugolParser.g:155:4: rule__HeaderBlock__Group__0
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
    // InternalPortugolParser.g:164:1: entryRuleDeclarationsBlock : ruleDeclarationsBlock EOF ;
    public final void entryRuleDeclarationsBlock() throws RecognitionException {
        try {
            // InternalPortugolParser.g:165:1: ( ruleDeclarationsBlock EOF )
            // InternalPortugolParser.g:166:1: ruleDeclarationsBlock EOF
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
    // InternalPortugolParser.g:173:1: ruleDeclarationsBlock : ( ( rule__DeclarationsBlock__Group__0 ) ) ;
    public final void ruleDeclarationsBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:177:2: ( ( ( rule__DeclarationsBlock__Group__0 ) ) )
            // InternalPortugolParser.g:178:2: ( ( rule__DeclarationsBlock__Group__0 ) )
            {
            // InternalPortugolParser.g:178:2: ( ( rule__DeclarationsBlock__Group__0 ) )
            // InternalPortugolParser.g:179:3: ( rule__DeclarationsBlock__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getGroup()); 
            }
            // InternalPortugolParser.g:180:3: ( rule__DeclarationsBlock__Group__0 )
            // InternalPortugolParser.g:180:4: rule__DeclarationsBlock__Group__0
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
    // InternalPortugolParser.g:189:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalPortugolParser.g:190:1: ( ruleVariable EOF )
            // InternalPortugolParser.g:191:1: ruleVariable EOF
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
    // InternalPortugolParser.g:198:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:202:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalPortugolParser.g:203:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalPortugolParser.g:203:2: ( ( rule__Variable__Group__0 ) )
            // InternalPortugolParser.g:204:3: ( rule__Variable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getGroup()); 
            }
            // InternalPortugolParser.g:205:3: ( rule__Variable__Group__0 )
            // InternalPortugolParser.g:205:4: rule__Variable__Group__0
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
    // InternalPortugolParser.g:214:1: entryRuleVarDeclaration : ruleVarDeclaration EOF ;
    public final void entryRuleVarDeclaration() throws RecognitionException {
        try {
            // InternalPortugolParser.g:215:1: ( ruleVarDeclaration EOF )
            // InternalPortugolParser.g:216:1: ruleVarDeclaration EOF
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
    // InternalPortugolParser.g:223:1: ruleVarDeclaration : ( ( rule__VarDeclaration__Group__0 ) ) ;
    public final void ruleVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:227:2: ( ( ( rule__VarDeclaration__Group__0 ) ) )
            // InternalPortugolParser.g:228:2: ( ( rule__VarDeclaration__Group__0 ) )
            {
            // InternalPortugolParser.g:228:2: ( ( rule__VarDeclaration__Group__0 ) )
            // InternalPortugolParser.g:229:3: ( rule__VarDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getGroup()); 
            }
            // InternalPortugolParser.g:230:3: ( rule__VarDeclaration__Group__0 )
            // InternalPortugolParser.g:230:4: rule__VarDeclaration__Group__0
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
    // InternalPortugolParser.g:239:1: entryRuleDeclaredVarList : ruleDeclaredVarList EOF ;
    public final void entryRuleDeclaredVarList() throws RecognitionException {
        try {
            // InternalPortugolParser.g:240:1: ( ruleDeclaredVarList EOF )
            // InternalPortugolParser.g:241:1: ruleDeclaredVarList EOF
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
    // InternalPortugolParser.g:248:1: ruleDeclaredVarList : ( ( rule__DeclaredVarList__Group__0 ) ) ;
    public final void ruleDeclaredVarList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:252:2: ( ( ( rule__DeclaredVarList__Group__0 ) ) )
            // InternalPortugolParser.g:253:2: ( ( rule__DeclaredVarList__Group__0 ) )
            {
            // InternalPortugolParser.g:253:2: ( ( rule__DeclaredVarList__Group__0 ) )
            // InternalPortugolParser.g:254:3: ( rule__DeclaredVarList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getGroup()); 
            }
            // InternalPortugolParser.g:255:3: ( rule__DeclaredVarList__Group__0 )
            // InternalPortugolParser.g:255:4: rule__DeclaredVarList__Group__0
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
    // InternalPortugolParser.g:264:1: entryRuleVarName : ruleVarName EOF ;
    public final void entryRuleVarName() throws RecognitionException {
        try {
            // InternalPortugolParser.g:265:1: ( ruleVarName EOF )
            // InternalPortugolParser.g:266:1: ruleVarName EOF
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
    // InternalPortugolParser.g:273:1: ruleVarName : ( ( rule__VarName__NameAssignment ) ) ;
    public final void ruleVarName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:277:2: ( ( ( rule__VarName__NameAssignment ) ) )
            // InternalPortugolParser.g:278:2: ( ( rule__VarName__NameAssignment ) )
            {
            // InternalPortugolParser.g:278:2: ( ( rule__VarName__NameAssignment ) )
            // InternalPortugolParser.g:279:3: ( rule__VarName__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNameAccess().getNameAssignment()); 
            }
            // InternalPortugolParser.g:280:3: ( rule__VarName__NameAssignment )
            // InternalPortugolParser.g:280:4: rule__VarName__NameAssignment
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
    // InternalPortugolParser.g:289:1: entryRuleVarType : ruleVarType EOF ;
    public final void entryRuleVarType() throws RecognitionException {
        try {
            // InternalPortugolParser.g:290:1: ( ruleVarType EOF )
            // InternalPortugolParser.g:291:1: ruleVarType EOF
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
    // InternalPortugolParser.g:298:1: ruleVarType : ( ( rule__VarType__TypeNameAssignment ) ) ;
    public final void ruleVarType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:302:2: ( ( ( rule__VarType__TypeNameAssignment ) ) )
            // InternalPortugolParser.g:303:2: ( ( rule__VarType__TypeNameAssignment ) )
            {
            // InternalPortugolParser.g:303:2: ( ( rule__VarType__TypeNameAssignment ) )
            // InternalPortugolParser.g:304:3: ( rule__VarType__TypeNameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarTypeAccess().getTypeNameAssignment()); 
            }
            // InternalPortugolParser.g:305:3: ( rule__VarType__TypeNameAssignment )
            // InternalPortugolParser.g:305:4: rule__VarType__TypeNameAssignment
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
    // InternalPortugolParser.g:314:1: entryRuleSubprograms : ruleSubprograms EOF ;
    public final void entryRuleSubprograms() throws RecognitionException {
        try {
            // InternalPortugolParser.g:315:1: ( ruleSubprograms EOF )
            // InternalPortugolParser.g:316:1: ruleSubprograms EOF
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
    // InternalPortugolParser.g:323:1: ruleSubprograms : ( ( ( rule__Subprograms__BlockSubProgramsAssignment ) ) ( ( rule__Subprograms__BlockSubProgramsAssignment )* ) ) ;
    public final void ruleSubprograms() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:327:2: ( ( ( ( rule__Subprograms__BlockSubProgramsAssignment ) ) ( ( rule__Subprograms__BlockSubProgramsAssignment )* ) ) )
            // InternalPortugolParser.g:328:2: ( ( ( rule__Subprograms__BlockSubProgramsAssignment ) ) ( ( rule__Subprograms__BlockSubProgramsAssignment )* ) )
            {
            // InternalPortugolParser.g:328:2: ( ( ( rule__Subprograms__BlockSubProgramsAssignment ) ) ( ( rule__Subprograms__BlockSubProgramsAssignment )* ) )
            // InternalPortugolParser.g:329:3: ( ( rule__Subprograms__BlockSubProgramsAssignment ) ) ( ( rule__Subprograms__BlockSubProgramsAssignment )* )
            {
            // InternalPortugolParser.g:329:3: ( ( rule__Subprograms__BlockSubProgramsAssignment ) )
            // InternalPortugolParser.g:330:4: ( rule__Subprograms__BlockSubProgramsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramsAccess().getBlockSubProgramsAssignment()); 
            }
            // InternalPortugolParser.g:331:4: ( rule__Subprograms__BlockSubProgramsAssignment )
            // InternalPortugolParser.g:331:5: rule__Subprograms__BlockSubProgramsAssignment
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

            // InternalPortugolParser.g:334:3: ( ( rule__Subprograms__BlockSubProgramsAssignment )* )
            // InternalPortugolParser.g:335:4: ( rule__Subprograms__BlockSubProgramsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramsAccess().getBlockSubProgramsAssignment()); 
            }
            // InternalPortugolParser.g:336:4: ( rule__Subprograms__BlockSubProgramsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Procedimento||LA1_0==Funcao) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPortugolParser.g:336:5: rule__Subprograms__BlockSubProgramsAssignment
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
    // InternalPortugolParser.g:346:1: entryRuleBlockSubPrograms : ruleBlockSubPrograms EOF ;
    public final void entryRuleBlockSubPrograms() throws RecognitionException {
        try {
            // InternalPortugolParser.g:347:1: ( ruleBlockSubPrograms EOF )
            // InternalPortugolParser.g:348:1: ruleBlockSubPrograms EOF
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
    // InternalPortugolParser.g:355:1: ruleBlockSubPrograms : ( ( rule__BlockSubPrograms__Alternatives ) ) ;
    public final void ruleBlockSubPrograms() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:359:2: ( ( ( rule__BlockSubPrograms__Alternatives ) ) )
            // InternalPortugolParser.g:360:2: ( ( rule__BlockSubPrograms__Alternatives ) )
            {
            // InternalPortugolParser.g:360:2: ( ( rule__BlockSubPrograms__Alternatives ) )
            // InternalPortugolParser.g:361:3: ( rule__BlockSubPrograms__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockSubProgramsAccess().getAlternatives()); 
            }
            // InternalPortugolParser.g:362:3: ( rule__BlockSubPrograms__Alternatives )
            // InternalPortugolParser.g:362:4: rule__BlockSubPrograms__Alternatives
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
    // InternalPortugolParser.g:371:1: entryRuleProcedureName : ruleProcedureName EOF ;
    public final void entryRuleProcedureName() throws RecognitionException {
        try {
            // InternalPortugolParser.g:372:1: ( ruleProcedureName EOF )
            // InternalPortugolParser.g:373:1: ruleProcedureName EOF
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
    // InternalPortugolParser.g:380:1: ruleProcedureName : ( ( rule__ProcedureName__NameAssignment ) ) ;
    public final void ruleProcedureName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:384:2: ( ( ( rule__ProcedureName__NameAssignment ) ) )
            // InternalPortugolParser.g:385:2: ( ( rule__ProcedureName__NameAssignment ) )
            {
            // InternalPortugolParser.g:385:2: ( ( rule__ProcedureName__NameAssignment ) )
            // InternalPortugolParser.g:386:3: ( rule__ProcedureName__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedureNameAccess().getNameAssignment()); 
            }
            // InternalPortugolParser.g:387:3: ( rule__ProcedureName__NameAssignment )
            // InternalPortugolParser.g:387:4: rule__ProcedureName__NameAssignment
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
    // InternalPortugolParser.g:396:1: entryRuleFunctionName : ruleFunctionName EOF ;
    public final void entryRuleFunctionName() throws RecognitionException {
        try {
            // InternalPortugolParser.g:397:1: ( ruleFunctionName EOF )
            // InternalPortugolParser.g:398:1: ruleFunctionName EOF
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
    // InternalPortugolParser.g:405:1: ruleFunctionName : ( ( rule__FunctionName__NameAssignment ) ) ;
    public final void ruleFunctionName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:409:2: ( ( ( rule__FunctionName__NameAssignment ) ) )
            // InternalPortugolParser.g:410:2: ( ( rule__FunctionName__NameAssignment ) )
            {
            // InternalPortugolParser.g:410:2: ( ( rule__FunctionName__NameAssignment ) )
            // InternalPortugolParser.g:411:3: ( rule__FunctionName__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionNameAccess().getNameAssignment()); 
            }
            // InternalPortugolParser.g:412:3: ( rule__FunctionName__NameAssignment )
            // InternalPortugolParser.g:412:4: rule__FunctionName__NameAssignment
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
    // InternalPortugolParser.g:421:1: entryRuleBlockFunction : ruleBlockFunction EOF ;
    public final void entryRuleBlockFunction() throws RecognitionException {
        try {
            // InternalPortugolParser.g:422:1: ( ruleBlockFunction EOF )
            // InternalPortugolParser.g:423:1: ruleBlockFunction EOF
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
    // InternalPortugolParser.g:430:1: ruleBlockFunction : ( ( rule__BlockFunction__Group__0 ) ) ;
    public final void ruleBlockFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:434:2: ( ( ( rule__BlockFunction__Group__0 ) ) )
            // InternalPortugolParser.g:435:2: ( ( rule__BlockFunction__Group__0 ) )
            {
            // InternalPortugolParser.g:435:2: ( ( rule__BlockFunction__Group__0 ) )
            // InternalPortugolParser.g:436:3: ( rule__BlockFunction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:437:3: ( rule__BlockFunction__Group__0 )
            // InternalPortugolParser.g:437:4: rule__BlockFunction__Group__0
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
    // InternalPortugolParser.g:446:1: entryRuleBlockProcedure : ruleBlockProcedure EOF ;
    public final void entryRuleBlockProcedure() throws RecognitionException {
        try {
            // InternalPortugolParser.g:447:1: ( ruleBlockProcedure EOF )
            // InternalPortugolParser.g:448:1: ruleBlockProcedure EOF
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
    // InternalPortugolParser.g:455:1: ruleBlockProcedure : ( ( rule__BlockProcedure__Group__0 ) ) ;
    public final void ruleBlockProcedure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:459:2: ( ( ( rule__BlockProcedure__Group__0 ) ) )
            // InternalPortugolParser.g:460:2: ( ( rule__BlockProcedure__Group__0 ) )
            {
            // InternalPortugolParser.g:460:2: ( ( rule__BlockProcedure__Group__0 ) )
            // InternalPortugolParser.g:461:3: ( rule__BlockProcedure__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getGroup()); 
            }
            // InternalPortugolParser.g:462:3: ( rule__BlockProcedure__Group__0 )
            // InternalPortugolParser.g:462:4: rule__BlockProcedure__Group__0
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
    // InternalPortugolParser.g:471:1: entryRuleBlockCommand : ruleBlockCommand EOF ;
    public final void entryRuleBlockCommand() throws RecognitionException {
        try {
            // InternalPortugolParser.g:472:1: ( ruleBlockCommand EOF )
            // InternalPortugolParser.g:473:1: ruleBlockCommand EOF
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
    // InternalPortugolParser.g:480:1: ruleBlockCommand : ( ( rule__BlockCommand__Group__0 ) ) ;
    public final void ruleBlockCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:484:2: ( ( ( rule__BlockCommand__Group__0 ) ) )
            // InternalPortugolParser.g:485:2: ( ( rule__BlockCommand__Group__0 ) )
            {
            // InternalPortugolParser.g:485:2: ( ( rule__BlockCommand__Group__0 ) )
            // InternalPortugolParser.g:486:3: ( rule__BlockCommand__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getGroup()); 
            }
            // InternalPortugolParser.g:487:3: ( rule__BlockCommand__Group__0 )
            // InternalPortugolParser.g:487:4: rule__BlockCommand__Group__0
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
    // InternalPortugolParser.g:496:1: entryRuleAbstractCommand : ruleAbstractCommand EOF ;
    public final void entryRuleAbstractCommand() throws RecognitionException {
        try {
            // InternalPortugolParser.g:497:1: ( ruleAbstractCommand EOF )
            // InternalPortugolParser.g:498:1: ruleAbstractCommand EOF
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
    // InternalPortugolParser.g:505:1: ruleAbstractCommand : ( ( rule__AbstractCommand__Alternatives ) ) ;
    public final void ruleAbstractCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:509:2: ( ( ( rule__AbstractCommand__Alternatives ) ) )
            // InternalPortugolParser.g:510:2: ( ( rule__AbstractCommand__Alternatives ) )
            {
            // InternalPortugolParser.g:510:2: ( ( rule__AbstractCommand__Alternatives ) )
            // InternalPortugolParser.g:511:3: ( rule__AbstractCommand__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractCommandAccess().getAlternatives()); 
            }
            // InternalPortugolParser.g:512:3: ( rule__AbstractCommand__Alternatives )
            // InternalPortugolParser.g:512:4: rule__AbstractCommand__Alternatives
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
    // InternalPortugolParser.g:521:1: entryRuleBreakStatement : ruleBreakStatement EOF ;
    public final void entryRuleBreakStatement() throws RecognitionException {
        try {
            // InternalPortugolParser.g:522:1: ( ruleBreakStatement EOF )
            // InternalPortugolParser.g:523:1: ruleBreakStatement EOF
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
    // InternalPortugolParser.g:530:1: ruleBreakStatement : ( ( rule__BreakStatement__Group__0 ) ) ;
    public final void ruleBreakStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:534:2: ( ( ( rule__BreakStatement__Group__0 ) ) )
            // InternalPortugolParser.g:535:2: ( ( rule__BreakStatement__Group__0 ) )
            {
            // InternalPortugolParser.g:535:2: ( ( rule__BreakStatement__Group__0 ) )
            // InternalPortugolParser.g:536:3: ( rule__BreakStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakStatementAccess().getGroup()); 
            }
            // InternalPortugolParser.g:537:3: ( rule__BreakStatement__Group__0 )
            // InternalPortugolParser.g:537:4: rule__BreakStatement__Group__0
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
    // InternalPortugolParser.g:546:1: entryRuleReturnStatement : ruleReturnStatement EOF ;
    public final void entryRuleReturnStatement() throws RecognitionException {
        try {
            // InternalPortugolParser.g:547:1: ( ruleReturnStatement EOF )
            // InternalPortugolParser.g:548:1: ruleReturnStatement EOF
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
    // InternalPortugolParser.g:555:1: ruleReturnStatement : ( ( rule__ReturnStatement__Group__0 ) ) ;
    public final void ruleReturnStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:559:2: ( ( ( rule__ReturnStatement__Group__0 ) ) )
            // InternalPortugolParser.g:560:2: ( ( rule__ReturnStatement__Group__0 ) )
            {
            // InternalPortugolParser.g:560:2: ( ( rule__ReturnStatement__Group__0 ) )
            // InternalPortugolParser.g:561:3: ( rule__ReturnStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getGroup()); 
            }
            // InternalPortugolParser.g:562:3: ( rule__ReturnStatement__Group__0 )
            // InternalPortugolParser.g:562:4: rule__ReturnStatement__Group__0
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
    // InternalPortugolParser.g:571:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalPortugolParser.g:572:1: ( ruleIfStatement EOF )
            // InternalPortugolParser.g:573:1: ruleIfStatement EOF
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
    // InternalPortugolParser.g:580:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:584:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalPortugolParser.g:585:2: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalPortugolParser.g:585:2: ( ( rule__IfStatement__Group__0 ) )
            // InternalPortugolParser.g:586:3: ( rule__IfStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup()); 
            }
            // InternalPortugolParser.g:587:3: ( rule__IfStatement__Group__0 )
            // InternalPortugolParser.g:587:4: rule__IfStatement__Group__0
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
    // InternalPortugolParser.g:596:1: entryRuleSwitchCaseStatement : ruleSwitchCaseStatement EOF ;
    public final void entryRuleSwitchCaseStatement() throws RecognitionException {
        try {
            // InternalPortugolParser.g:597:1: ( ruleSwitchCaseStatement EOF )
            // InternalPortugolParser.g:598:1: ruleSwitchCaseStatement EOF
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
    // InternalPortugolParser.g:605:1: ruleSwitchCaseStatement : ( ( rule__SwitchCaseStatement__Group__0 ) ) ;
    public final void ruleSwitchCaseStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:609:2: ( ( ( rule__SwitchCaseStatement__Group__0 ) ) )
            // InternalPortugolParser.g:610:2: ( ( rule__SwitchCaseStatement__Group__0 ) )
            {
            // InternalPortugolParser.g:610:2: ( ( rule__SwitchCaseStatement__Group__0 ) )
            // InternalPortugolParser.g:611:3: ( rule__SwitchCaseStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getGroup()); 
            }
            // InternalPortugolParser.g:612:3: ( rule__SwitchCaseStatement__Group__0 )
            // InternalPortugolParser.g:612:4: rule__SwitchCaseStatement__Group__0
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
    // InternalPortugolParser.g:621:1: entryRuleCaseList : ruleCaseList EOF ;
    public final void entryRuleCaseList() throws RecognitionException {
        try {
            // InternalPortugolParser.g:622:1: ( ruleCaseList EOF )
            // InternalPortugolParser.g:623:1: ruleCaseList EOF
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
    // InternalPortugolParser.g:630:1: ruleCaseList : ( ( rule__CaseList__Group__0 ) ) ;
    public final void ruleCaseList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:634:2: ( ( ( rule__CaseList__Group__0 ) ) )
            // InternalPortugolParser.g:635:2: ( ( rule__CaseList__Group__0 ) )
            {
            // InternalPortugolParser.g:635:2: ( ( rule__CaseList__Group__0 ) )
            // InternalPortugolParser.g:636:3: ( rule__CaseList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getGroup()); 
            }
            // InternalPortugolParser.g:637:3: ( rule__CaseList__Group__0 )
            // InternalPortugolParser.g:637:4: rule__CaseList__Group__0
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
    // InternalPortugolParser.g:646:1: entryRuleOtherCase : ruleOtherCase EOF ;
    public final void entryRuleOtherCase() throws RecognitionException {
        try {
            // InternalPortugolParser.g:647:1: ( ruleOtherCase EOF )
            // InternalPortugolParser.g:648:1: ruleOtherCase EOF
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
    // InternalPortugolParser.g:655:1: ruleOtherCase : ( ( rule__OtherCase__Group__0 ) ) ;
    public final void ruleOtherCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:659:2: ( ( ( rule__OtherCase__Group__0 ) ) )
            // InternalPortugolParser.g:660:2: ( ( rule__OtherCase__Group__0 ) )
            {
            // InternalPortugolParser.g:660:2: ( ( rule__OtherCase__Group__0 ) )
            // InternalPortugolParser.g:661:3: ( rule__OtherCase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getGroup()); 
            }
            // InternalPortugolParser.g:662:3: ( rule__OtherCase__Group__0 )
            // InternalPortugolParser.g:662:4: rule__OtherCase__Group__0
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
    // InternalPortugolParser.g:671:1: entryRuleForStatement : ruleForStatement EOF ;
    public final void entryRuleForStatement() throws RecognitionException {
        try {
            // InternalPortugolParser.g:672:1: ( ruleForStatement EOF )
            // InternalPortugolParser.g:673:1: ruleForStatement EOF
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
    // InternalPortugolParser.g:680:1: ruleForStatement : ( ( rule__ForStatement__Group__0 ) ) ;
    public final void ruleForStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:684:2: ( ( ( rule__ForStatement__Group__0 ) ) )
            // InternalPortugolParser.g:685:2: ( ( rule__ForStatement__Group__0 ) )
            {
            // InternalPortugolParser.g:685:2: ( ( rule__ForStatement__Group__0 ) )
            // InternalPortugolParser.g:686:3: ( rule__ForStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getGroup()); 
            }
            // InternalPortugolParser.g:687:3: ( rule__ForStatement__Group__0 )
            // InternalPortugolParser.g:687:4: rule__ForStatement__Group__0
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
    // InternalPortugolParser.g:696:1: entryRuleWhileStatement : ruleWhileStatement EOF ;
    public final void entryRuleWhileStatement() throws RecognitionException {
        try {
            // InternalPortugolParser.g:697:1: ( ruleWhileStatement EOF )
            // InternalPortugolParser.g:698:1: ruleWhileStatement EOF
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
    // InternalPortugolParser.g:705:1: ruleWhileStatement : ( ( rule__WhileStatement__Group__0 ) ) ;
    public final void ruleWhileStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:709:2: ( ( ( rule__WhileStatement__Group__0 ) ) )
            // InternalPortugolParser.g:710:2: ( ( rule__WhileStatement__Group__0 ) )
            {
            // InternalPortugolParser.g:710:2: ( ( rule__WhileStatement__Group__0 ) )
            // InternalPortugolParser.g:711:3: ( rule__WhileStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getGroup()); 
            }
            // InternalPortugolParser.g:712:3: ( rule__WhileStatement__Group__0 )
            // InternalPortugolParser.g:712:4: rule__WhileStatement__Group__0
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
    // InternalPortugolParser.g:721:1: entryRuleRepeatStatement : ruleRepeatStatement EOF ;
    public final void entryRuleRepeatStatement() throws RecognitionException {
        try {
            // InternalPortugolParser.g:722:1: ( ruleRepeatStatement EOF )
            // InternalPortugolParser.g:723:1: ruleRepeatStatement EOF
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
    // InternalPortugolParser.g:730:1: ruleRepeatStatement : ( ( rule__RepeatStatement__Group__0 ) ) ;
    public final void ruleRepeatStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:734:2: ( ( ( rule__RepeatStatement__Group__0 ) ) )
            // InternalPortugolParser.g:735:2: ( ( rule__RepeatStatement__Group__0 ) )
            {
            // InternalPortugolParser.g:735:2: ( ( rule__RepeatStatement__Group__0 ) )
            // InternalPortugolParser.g:736:3: ( rule__RepeatStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatStatementAccess().getGroup()); 
            }
            // InternalPortugolParser.g:737:3: ( rule__RepeatStatement__Group__0 )
            // InternalPortugolParser.g:737:4: rule__RepeatStatement__Group__0
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
    // InternalPortugolParser.g:746:1: entryRuleSubprogramParam : ruleSubprogramParam EOF ;
    public final void entryRuleSubprogramParam() throws RecognitionException {
        try {
            // InternalPortugolParser.g:747:1: ( ruleSubprogramParam EOF )
            // InternalPortugolParser.g:748:1: ruleSubprogramParam EOF
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
    // InternalPortugolParser.g:755:1: ruleSubprogramParam : ( ( rule__SubprogramParam__Group__0 ) ) ;
    public final void ruleSubprogramParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:759:2: ( ( ( rule__SubprogramParam__Group__0 ) ) )
            // InternalPortugolParser.g:760:2: ( ( rule__SubprogramParam__Group__0 ) )
            {
            // InternalPortugolParser.g:760:2: ( ( rule__SubprogramParam__Group__0 ) )
            // InternalPortugolParser.g:761:3: ( rule__SubprogramParam__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamAccess().getGroup()); 
            }
            // InternalPortugolParser.g:762:3: ( rule__SubprogramParam__Group__0 )
            // InternalPortugolParser.g:762:4: rule__SubprogramParam__Group__0
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
    // InternalPortugolParser.g:771:1: entryRuleReadCommand : ruleReadCommand EOF ;
    public final void entryRuleReadCommand() throws RecognitionException {
        try {
            // InternalPortugolParser.g:772:1: ( ruleReadCommand EOF )
            // InternalPortugolParser.g:773:1: ruleReadCommand EOF
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
    // InternalPortugolParser.g:780:1: ruleReadCommand : ( ( rule__ReadCommand__Group__0 ) ) ;
    public final void ruleReadCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:784:2: ( ( ( rule__ReadCommand__Group__0 ) ) )
            // InternalPortugolParser.g:785:2: ( ( rule__ReadCommand__Group__0 ) )
            {
            // InternalPortugolParser.g:785:2: ( ( rule__ReadCommand__Group__0 ) )
            // InternalPortugolParser.g:786:3: ( rule__ReadCommand__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getGroup()); 
            }
            // InternalPortugolParser.g:787:3: ( rule__ReadCommand__Group__0 )
            // InternalPortugolParser.g:787:4: rule__ReadCommand__Group__0
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
    // InternalPortugolParser.g:796:1: entryRuleWriteCommand : ruleWriteCommand EOF ;
    public final void entryRuleWriteCommand() throws RecognitionException {
        try {
            // InternalPortugolParser.g:797:1: ( ruleWriteCommand EOF )
            // InternalPortugolParser.g:798:1: ruleWriteCommand EOF
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
    // InternalPortugolParser.g:805:1: ruleWriteCommand : ( ( rule__WriteCommand__Group__0 ) ) ;
    public final void ruleWriteCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:809:2: ( ( ( rule__WriteCommand__Group__0 ) ) )
            // InternalPortugolParser.g:810:2: ( ( rule__WriteCommand__Group__0 ) )
            {
            // InternalPortugolParser.g:810:2: ( ( rule__WriteCommand__Group__0 ) )
            // InternalPortugolParser.g:811:3: ( rule__WriteCommand__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getGroup()); 
            }
            // InternalPortugolParser.g:812:3: ( rule__WriteCommand__Group__0 )
            // InternalPortugolParser.g:812:4: rule__WriteCommand__Group__0
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
    // InternalPortugolParser.g:821:1: entryRuleWriteParam : ruleWriteParam EOF ;
    public final void entryRuleWriteParam() throws RecognitionException {
        try {
            // InternalPortugolParser.g:822:1: ( ruleWriteParam EOF )
            // InternalPortugolParser.g:823:1: ruleWriteParam EOF
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
    // InternalPortugolParser.g:830:1: ruleWriteParam : ( ( rule__WriteParam__Group__0 ) ) ;
    public final void ruleWriteParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:834:2: ( ( ( rule__WriteParam__Group__0 ) ) )
            // InternalPortugolParser.g:835:2: ( ( rule__WriteParam__Group__0 ) )
            {
            // InternalPortugolParser.g:835:2: ( ( rule__WriteParam__Group__0 ) )
            // InternalPortugolParser.g:836:3: ( rule__WriteParam__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getGroup()); 
            }
            // InternalPortugolParser.g:837:3: ( rule__WriteParam__Group__0 )
            // InternalPortugolParser.g:837:4: rule__WriteParam__Group__0
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
    // InternalPortugolParser.g:846:1: entryRuleOptDecimalPrecision : ruleOptDecimalPrecision EOF ;
    public final void entryRuleOptDecimalPrecision() throws RecognitionException {
        try {
            // InternalPortugolParser.g:847:1: ( ruleOptDecimalPrecision EOF )
            // InternalPortugolParser.g:848:1: ruleOptDecimalPrecision EOF
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
    // InternalPortugolParser.g:855:1: ruleOptDecimalPrecision : ( ( rule__OptDecimalPrecision__Group__0 ) ) ;
    public final void ruleOptDecimalPrecision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:859:2: ( ( ( rule__OptDecimalPrecision__Group__0 ) ) )
            // InternalPortugolParser.g:860:2: ( ( rule__OptDecimalPrecision__Group__0 ) )
            {
            // InternalPortugolParser.g:860:2: ( ( rule__OptDecimalPrecision__Group__0 ) )
            // InternalPortugolParser.g:861:3: ( rule__OptDecimalPrecision__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:862:3: ( rule__OptDecimalPrecision__Group__0 )
            // InternalPortugolParser.g:862:4: rule__OptDecimalPrecision__Group__0
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
    // InternalPortugolParser.g:871:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:872:1: ( ruleExpression EOF )
            // InternalPortugolParser.g:873:1: ruleExpression EOF
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
    // InternalPortugolParser.g:880:1: ruleExpression : ( ruleAssignment ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:884:2: ( ( ruleAssignment ) )
            // InternalPortugolParser.g:885:2: ( ruleAssignment )
            {
            // InternalPortugolParser.g:885:2: ( ruleAssignment )
            // InternalPortugolParser.g:886:3: ruleAssignment
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
    // InternalPortugolParser.g:896:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalPortugolParser.g:897:1: ( ruleAssignment EOF )
            // InternalPortugolParser.g:898:1: ruleAssignment EOF
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
    // InternalPortugolParser.g:905:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:909:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalPortugolParser.g:910:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalPortugolParser.g:910:2: ( ( rule__Assignment__Group__0 ) )
            // InternalPortugolParser.g:911:3: ( rule__Assignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // InternalPortugolParser.g:912:3: ( rule__Assignment__Group__0 )
            // InternalPortugolParser.g:912:4: rule__Assignment__Group__0
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
    // InternalPortugolParser.g:921:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:922:1: ( ruleOrExpression EOF )
            // InternalPortugolParser.g:923:1: ruleOrExpression EOF
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
    // InternalPortugolParser.g:930:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:934:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalPortugolParser.g:935:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalPortugolParser.g:935:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalPortugolParser.g:936:3: ( rule__OrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:937:3: ( rule__OrExpression__Group__0 )
            // InternalPortugolParser.g:937:4: rule__OrExpression__Group__0
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
    // InternalPortugolParser.g:946:1: entryRuleXorExpression : ruleXorExpression EOF ;
    public final void entryRuleXorExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:947:1: ( ruleXorExpression EOF )
            // InternalPortugolParser.g:948:1: ruleXorExpression EOF
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
    // InternalPortugolParser.g:955:1: ruleXorExpression : ( ( rule__XorExpression__Group__0 ) ) ;
    public final void ruleXorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:959:2: ( ( ( rule__XorExpression__Group__0 ) ) )
            // InternalPortugolParser.g:960:2: ( ( rule__XorExpression__Group__0 ) )
            {
            // InternalPortugolParser.g:960:2: ( ( rule__XorExpression__Group__0 ) )
            // InternalPortugolParser.g:961:3: ( rule__XorExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:962:3: ( rule__XorExpression__Group__0 )
            // InternalPortugolParser.g:962:4: rule__XorExpression__Group__0
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
    // InternalPortugolParser.g:971:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:972:1: ( ruleAndExpression EOF )
            // InternalPortugolParser.g:973:1: ruleAndExpression EOF
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
    // InternalPortugolParser.g:980:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:984:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalPortugolParser.g:985:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalPortugolParser.g:985:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalPortugolParser.g:986:3: ( rule__AndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:987:3: ( rule__AndExpression__Group__0 )
            // InternalPortugolParser.g:987:4: rule__AndExpression__Group__0
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
    // InternalPortugolParser.g:996:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalPortugolParser.g:997:1: ( ruleComparison EOF )
            // InternalPortugolParser.g:998:1: ruleComparison EOF
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
    // InternalPortugolParser.g:1005:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1009:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalPortugolParser.g:1010:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalPortugolParser.g:1010:2: ( ( rule__Comparison__Group__0 ) )
            // InternalPortugolParser.g:1011:3: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // InternalPortugolParser.g:1012:3: ( rule__Comparison__Group__0 )
            // InternalPortugolParser.g:1012:4: rule__Comparison__Group__0
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
    // InternalPortugolParser.g:1021:1: entryRuleEquExpression : ruleEquExpression EOF ;
    public final void entryRuleEquExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1022:1: ( ruleEquExpression EOF )
            // InternalPortugolParser.g:1023:1: ruleEquExpression EOF
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
    // InternalPortugolParser.g:1030:1: ruleEquExpression : ( ( rule__EquExpression__Group__0 ) ) ;
    public final void ruleEquExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1034:2: ( ( ( rule__EquExpression__Group__0 ) ) )
            // InternalPortugolParser.g:1035:2: ( ( rule__EquExpression__Group__0 ) )
            {
            // InternalPortugolParser.g:1035:2: ( ( rule__EquExpression__Group__0 ) )
            // InternalPortugolParser.g:1036:3: ( rule__EquExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:1037:3: ( rule__EquExpression__Group__0 )
            // InternalPortugolParser.g:1037:4: rule__EquExpression__Group__0
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
    // InternalPortugolParser.g:1046:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1047:1: ( ruleAddExpression EOF )
            // InternalPortugolParser.g:1048:1: ruleAddExpression EOF
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
    // InternalPortugolParser.g:1055:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1059:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // InternalPortugolParser.g:1060:2: ( ( rule__AddExpression__Group__0 ) )
            {
            // InternalPortugolParser.g:1060:2: ( ( rule__AddExpression__Group__0 ) )
            // InternalPortugolParser.g:1061:3: ( rule__AddExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:1062:3: ( rule__AddExpression__Group__0 )
            // InternalPortugolParser.g:1062:4: rule__AddExpression__Group__0
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
    // InternalPortugolParser.g:1071:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1072:1: ( ruleMultiplicativeExpression EOF )
            // InternalPortugolParser.g:1073:1: ruleMultiplicativeExpression EOF
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
    // InternalPortugolParser.g:1080:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1084:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // InternalPortugolParser.g:1085:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // InternalPortugolParser.g:1085:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // InternalPortugolParser.g:1086:3: ( rule__MultiplicativeExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:1087:3: ( rule__MultiplicativeExpression__Group__0 )
            // InternalPortugolParser.g:1087:4: rule__MultiplicativeExpression__Group__0
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
    // InternalPortugolParser.g:1096:1: entryRulePowerExpression : rulePowerExpression EOF ;
    public final void entryRulePowerExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1097:1: ( rulePowerExpression EOF )
            // InternalPortugolParser.g:1098:1: rulePowerExpression EOF
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
    // InternalPortugolParser.g:1105:1: rulePowerExpression : ( ( rule__PowerExpression__Group__0 ) ) ;
    public final void rulePowerExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1109:2: ( ( ( rule__PowerExpression__Group__0 ) ) )
            // InternalPortugolParser.g:1110:2: ( ( rule__PowerExpression__Group__0 ) )
            {
            // InternalPortugolParser.g:1110:2: ( ( rule__PowerExpression__Group__0 ) )
            // InternalPortugolParser.g:1111:3: ( rule__PowerExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup()); 
            }
            // InternalPortugolParser.g:1112:3: ( rule__PowerExpression__Group__0 )
            // InternalPortugolParser.g:1112:4: rule__PowerExpression__Group__0
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
    // InternalPortugolParser.g:1121:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1122:1: ( ruleUnaryExpression EOF )
            // InternalPortugolParser.g:1123:1: ruleUnaryExpression EOF
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
    // InternalPortugolParser.g:1130:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1134:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // InternalPortugolParser.g:1135:2: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // InternalPortugolParser.g:1135:2: ( ( rule__UnaryExpression__Alternatives ) )
            // InternalPortugolParser.g:1136:3: ( rule__UnaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            }
            // InternalPortugolParser.g:1137:3: ( rule__UnaryExpression__Alternatives )
            // InternalPortugolParser.g:1137:4: rule__UnaryExpression__Alternatives
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
    // InternalPortugolParser.g:1146:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1147:1: ( rulePrimaryExpression EOF )
            // InternalPortugolParser.g:1148:1: rulePrimaryExpression EOF
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
    // InternalPortugolParser.g:1155:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1159:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalPortugolParser.g:1160:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalPortugolParser.g:1160:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalPortugolParser.g:1161:3: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // InternalPortugolParser.g:1162:3: ( rule__PrimaryExpression__Alternatives )
            // InternalPortugolParser.g:1162:4: rule__PrimaryExpression__Alternatives
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


    // $ANTLR start "entryRuleFunctionCall"
    // InternalPortugolParser.g:1171:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1172:1: ( ruleFunctionCall EOF )
            // InternalPortugolParser.g:1173:1: ruleFunctionCall EOF
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
    // InternalPortugolParser.g:1180:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1184:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalPortugolParser.g:1185:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalPortugolParser.g:1185:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalPortugolParser.g:1186:3: ( rule__FunctionCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup()); 
            }
            // InternalPortugolParser.g:1187:3: ( rule__FunctionCall__Group__0 )
            // InternalPortugolParser.g:1187:4: rule__FunctionCall__Group__0
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


    // $ANTLR start "entryRuleLiteral"
    // InternalPortugolParser.g:1196:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1197:1: ( ruleLiteral EOF )
            // InternalPortugolParser.g:1198:1: ruleLiteral EOF
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
    // InternalPortugolParser.g:1205:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1209:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalPortugolParser.g:1210:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalPortugolParser.g:1210:2: ( ( rule__Literal__Alternatives ) )
            // InternalPortugolParser.g:1211:3: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalPortugolParser.g:1212:3: ( rule__Literal__Alternatives )
            // InternalPortugolParser.g:1212:4: rule__Literal__Alternatives
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
    // InternalPortugolParser.g:1221:1: entryRuleDeclaredVar : ruleDeclaredVar EOF ;
    public final void entryRuleDeclaredVar() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1222:1: ( ruleDeclaredVar EOF )
            // InternalPortugolParser.g:1223:1: ruleDeclaredVar EOF
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
    // InternalPortugolParser.g:1230:1: ruleDeclaredVar : ( ( rule__DeclaredVar__VarNameAssignment ) ) ;
    public final void ruleDeclaredVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1234:2: ( ( ( rule__DeclaredVar__VarNameAssignment ) ) )
            // InternalPortugolParser.g:1235:2: ( ( rule__DeclaredVar__VarNameAssignment ) )
            {
            // InternalPortugolParser.g:1235:2: ( ( rule__DeclaredVar__VarNameAssignment ) )
            // InternalPortugolParser.g:1236:3: ( rule__DeclaredVar__VarNameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getVarNameAssignment()); 
            }
            // InternalPortugolParser.g:1237:3: ( rule__DeclaredVar__VarNameAssignment )
            // InternalPortugolParser.g:1237:4: rule__DeclaredVar__VarNameAssignment
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
    // InternalPortugolParser.g:1246:1: entryRuleNumericLiteral : ruleNumericLiteral EOF ;
    public final void entryRuleNumericLiteral() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1247:1: ( ruleNumericLiteral EOF )
            // InternalPortugolParser.g:1248:1: ruleNumericLiteral EOF
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
    // InternalPortugolParser.g:1255:1: ruleNumericLiteral : ( ( rule__NumericLiteral__Alternatives ) ) ;
    public final void ruleNumericLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1259:2: ( ( ( rule__NumericLiteral__Alternatives ) ) )
            // InternalPortugolParser.g:1260:2: ( ( rule__NumericLiteral__Alternatives ) )
            {
            // InternalPortugolParser.g:1260:2: ( ( rule__NumericLiteral__Alternatives ) )
            // InternalPortugolParser.g:1261:3: ( rule__NumericLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericLiteralAccess().getAlternatives()); 
            }
            // InternalPortugolParser.g:1262:3: ( rule__NumericLiteral__Alternatives )
            // InternalPortugolParser.g:1262:4: rule__NumericLiteral__Alternatives
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
    // InternalPortugolParser.g:1271:1: entryRuleStringExpression : ruleStringExpression EOF ;
    public final void entryRuleStringExpression() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1272:1: ( ruleStringExpression EOF )
            // InternalPortugolParser.g:1273:1: ruleStringExpression EOF
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
    // InternalPortugolParser.g:1280:1: ruleStringExpression : ( ( rule__StringExpression__LiteralStringAssignment ) ) ;
    public final void ruleStringExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1284:2: ( ( ( rule__StringExpression__LiteralStringAssignment ) ) )
            // InternalPortugolParser.g:1285:2: ( ( rule__StringExpression__LiteralStringAssignment ) )
            {
            // InternalPortugolParser.g:1285:2: ( ( rule__StringExpression__LiteralStringAssignment ) )
            // InternalPortugolParser.g:1286:3: ( rule__StringExpression__LiteralStringAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringExpressionAccess().getLiteralStringAssignment()); 
            }
            // InternalPortugolParser.g:1287:3: ( rule__StringExpression__LiteralStringAssignment )
            // InternalPortugolParser.g:1287:4: rule__StringExpression__LiteralStringAssignment
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


    // $ANTLR start "entryRuleEND_COMMAND"
    // InternalPortugolParser.g:1296:1: entryRuleEND_COMMAND : ruleEND_COMMAND EOF ;
    public final void entryRuleEND_COMMAND() throws RecognitionException {
        try {
            // InternalPortugolParser.g:1297:1: ( ruleEND_COMMAND EOF )
            // InternalPortugolParser.g:1298:1: ruleEND_COMMAND EOF
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
    // InternalPortugolParser.g:1305:1: ruleEND_COMMAND : ( Semicolon ) ;
    public final void ruleEND_COMMAND() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1309:2: ( ( Semicolon ) )
            // InternalPortugolParser.g:1310:2: ( Semicolon )
            {
            // InternalPortugolParser.g:1310:2: ( Semicolon )
            // InternalPortugolParser.g:1311:3: Semicolon
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
    // InternalPortugolParser.g:1320:1: rule__VarType__TypeNameAlternatives_0 : ( ( Real ) | ( Inteiro ) | ( Caractere ) | ( Caracter ) );
    public final void rule__VarType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1324:1: ( ( Real ) | ( Inteiro ) | ( Caractere ) | ( Caracter ) )
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
                    // InternalPortugolParser.g:1325:2: ( Real )
                    {
                    // InternalPortugolParser.g:1325:2: ( Real )
                    // InternalPortugolParser.g:1326:3: Real
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
                    // InternalPortugolParser.g:1331:2: ( Inteiro )
                    {
                    // InternalPortugolParser.g:1331:2: ( Inteiro )
                    // InternalPortugolParser.g:1332:3: Inteiro
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
                    // InternalPortugolParser.g:1337:2: ( Caractere )
                    {
                    // InternalPortugolParser.g:1337:2: ( Caractere )
                    // InternalPortugolParser.g:1338:3: Caractere
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
                    // InternalPortugolParser.g:1343:2: ( Caracter )
                    {
                    // InternalPortugolParser.g:1343:2: ( Caracter )
                    // InternalPortugolParser.g:1344:3: Caracter
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
    // InternalPortugolParser.g:1353:1: rule__BlockSubPrograms__Alternatives : ( ( ruleBlockFunction ) | ( ruleBlockProcedure ) );
    public final void rule__BlockSubPrograms__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1357:1: ( ( ruleBlockFunction ) | ( ruleBlockProcedure ) )
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
                    // InternalPortugolParser.g:1358:2: ( ruleBlockFunction )
                    {
                    // InternalPortugolParser.g:1358:2: ( ruleBlockFunction )
                    // InternalPortugolParser.g:1359:3: ruleBlockFunction
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
                    // InternalPortugolParser.g:1364:2: ( ruleBlockProcedure )
                    {
                    // InternalPortugolParser.g:1364:2: ( ruleBlockProcedure )
                    // InternalPortugolParser.g:1365:3: ruleBlockProcedure
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
    // InternalPortugolParser.g:1374:1: rule__AbstractCommand__Alternatives : ( ( ( rule__AbstractCommand__Group_0__0 ) ) | ( ( rule__AbstractCommand__Group_1__0 ) ) | ( ( rule__AbstractCommand__Group_2__0 ) ) | ( ruleIfStatement ) | ( ruleSwitchCaseStatement ) | ( ruleForStatement ) | ( ruleRepeatStatement ) | ( ruleWhileStatement ) | ( ( rule__AbstractCommand__Group_8__0 ) ) | ( ( rule__AbstractCommand__Group_9__0 ) ) );
    public final void rule__AbstractCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1378:1: ( ( ( rule__AbstractCommand__Group_0__0 ) ) | ( ( rule__AbstractCommand__Group_1__0 ) ) | ( ( rule__AbstractCommand__Group_2__0 ) ) | ( ruleIfStatement ) | ( ruleSwitchCaseStatement ) | ( ruleForStatement ) | ( ruleRepeatStatement ) | ( ruleWhileStatement ) | ( ( rule__AbstractCommand__Group_8__0 ) ) | ( ( rule__AbstractCommand__Group_9__0 ) ) )
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
            case NOT:
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
                    // InternalPortugolParser.g:1379:2: ( ( rule__AbstractCommand__Group_0__0 ) )
                    {
                    // InternalPortugolParser.g:1379:2: ( ( rule__AbstractCommand__Group_0__0 ) )
                    // InternalPortugolParser.g:1380:3: ( rule__AbstractCommand__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_0()); 
                    }
                    // InternalPortugolParser.g:1381:3: ( rule__AbstractCommand__Group_0__0 )
                    // InternalPortugolParser.g:1381:4: rule__AbstractCommand__Group_0__0
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
                    // InternalPortugolParser.g:1385:2: ( ( rule__AbstractCommand__Group_1__0 ) )
                    {
                    // InternalPortugolParser.g:1385:2: ( ( rule__AbstractCommand__Group_1__0 ) )
                    // InternalPortugolParser.g:1386:3: ( rule__AbstractCommand__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_1()); 
                    }
                    // InternalPortugolParser.g:1387:3: ( rule__AbstractCommand__Group_1__0 )
                    // InternalPortugolParser.g:1387:4: rule__AbstractCommand__Group_1__0
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
                    // InternalPortugolParser.g:1391:2: ( ( rule__AbstractCommand__Group_2__0 ) )
                    {
                    // InternalPortugolParser.g:1391:2: ( ( rule__AbstractCommand__Group_2__0 ) )
                    // InternalPortugolParser.g:1392:3: ( rule__AbstractCommand__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_2()); 
                    }
                    // InternalPortugolParser.g:1393:3: ( rule__AbstractCommand__Group_2__0 )
                    // InternalPortugolParser.g:1393:4: rule__AbstractCommand__Group_2__0
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
                    // InternalPortugolParser.g:1397:2: ( ruleIfStatement )
                    {
                    // InternalPortugolParser.g:1397:2: ( ruleIfStatement )
                    // InternalPortugolParser.g:1398:3: ruleIfStatement
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
                    // InternalPortugolParser.g:1403:2: ( ruleSwitchCaseStatement )
                    {
                    // InternalPortugolParser.g:1403:2: ( ruleSwitchCaseStatement )
                    // InternalPortugolParser.g:1404:3: ruleSwitchCaseStatement
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
                    // InternalPortugolParser.g:1409:2: ( ruleForStatement )
                    {
                    // InternalPortugolParser.g:1409:2: ( ruleForStatement )
                    // InternalPortugolParser.g:1410:3: ruleForStatement
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
                    // InternalPortugolParser.g:1415:2: ( ruleRepeatStatement )
                    {
                    // InternalPortugolParser.g:1415:2: ( ruleRepeatStatement )
                    // InternalPortugolParser.g:1416:3: ruleRepeatStatement
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
                    // InternalPortugolParser.g:1421:2: ( ruleWhileStatement )
                    {
                    // InternalPortugolParser.g:1421:2: ( ruleWhileStatement )
                    // InternalPortugolParser.g:1422:3: ruleWhileStatement
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
                    // InternalPortugolParser.g:1427:2: ( ( rule__AbstractCommand__Group_8__0 ) )
                    {
                    // InternalPortugolParser.g:1427:2: ( ( rule__AbstractCommand__Group_8__0 ) )
                    // InternalPortugolParser.g:1428:3: ( rule__AbstractCommand__Group_8__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_8()); 
                    }
                    // InternalPortugolParser.g:1429:3: ( rule__AbstractCommand__Group_8__0 )
                    // InternalPortugolParser.g:1429:4: rule__AbstractCommand__Group_8__0
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
                    // InternalPortugolParser.g:1433:2: ( ( rule__AbstractCommand__Group_9__0 ) )
                    {
                    // InternalPortugolParser.g:1433:2: ( ( rule__AbstractCommand__Group_9__0 ) )
                    // InternalPortugolParser.g:1434:3: ( rule__AbstractCommand__Group_9__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_9()); 
                    }
                    // InternalPortugolParser.g:1435:3: ( rule__AbstractCommand__Group_9__0 )
                    // InternalPortugolParser.g:1435:4: rule__AbstractCommand__Group_9__0
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
    // InternalPortugolParser.g:1443:1: rule__WriteCommand__WriteCommandAlternatives_0_0 : ( ( Escreva ) | ( Escreval ) );
    public final void rule__WriteCommand__WriteCommandAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1447:1: ( ( Escreva ) | ( Escreval ) )
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
                    // InternalPortugolParser.g:1448:2: ( Escreva )
                    {
                    // InternalPortugolParser.g:1448:2: ( Escreva )
                    // InternalPortugolParser.g:1449:3: Escreva
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
                    // InternalPortugolParser.g:1454:2: ( Escreval )
                    {
                    // InternalPortugolParser.g:1454:2: ( Escreval )
                    // InternalPortugolParser.g:1455:3: Escreval
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
    // InternalPortugolParser.g:1464:1: rule__AndExpression__OpAlternatives_1_0_0_1_0 : ( ( Ampersand ) | ( E ) );
    public final void rule__AndExpression__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1468:1: ( ( Ampersand ) | ( E ) )
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
                    // InternalPortugolParser.g:1469:2: ( Ampersand )
                    {
                    // InternalPortugolParser.g:1469:2: ( Ampersand )
                    // InternalPortugolParser.g:1470:3: Ampersand
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
                    // InternalPortugolParser.g:1475:2: ( E )
                    {
                    // InternalPortugolParser.g:1475:2: ( E )
                    // InternalPortugolParser.g:1476:3: E
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
    // InternalPortugolParser.g:1485:1: rule__Comparison__OpAlternatives_1_0_0_1_0 : ( ( EqualsSign ) | ( LessThanSignGreaterThanSign ) );
    public final void rule__Comparison__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1489:1: ( ( EqualsSign ) | ( LessThanSignGreaterThanSign ) )
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
                    // InternalPortugolParser.g:1490:2: ( EqualsSign )
                    {
                    // InternalPortugolParser.g:1490:2: ( EqualsSign )
                    // InternalPortugolParser.g:1491:3: EqualsSign
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
                    // InternalPortugolParser.g:1496:2: ( LessThanSignGreaterThanSign )
                    {
                    // InternalPortugolParser.g:1496:2: ( LessThanSignGreaterThanSign )
                    // InternalPortugolParser.g:1497:3: LessThanSignGreaterThanSign
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
    // InternalPortugolParser.g:1506:1: rule__EquExpression__OpAlternatives_1_0_0_1_0 : ( ( LessThanSign ) | ( GreaterThanSign ) | ( LessThanSignEqualsSign ) | ( GreaterThanSignEqualsSign ) );
    public final void rule__EquExpression__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1510:1: ( ( LessThanSign ) | ( GreaterThanSign ) | ( LessThanSignEqualsSign ) | ( GreaterThanSignEqualsSign ) )
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
                    // InternalPortugolParser.g:1511:2: ( LessThanSign )
                    {
                    // InternalPortugolParser.g:1511:2: ( LessThanSign )
                    // InternalPortugolParser.g:1512:3: LessThanSign
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
                    // InternalPortugolParser.g:1517:2: ( GreaterThanSign )
                    {
                    // InternalPortugolParser.g:1517:2: ( GreaterThanSign )
                    // InternalPortugolParser.g:1518:3: GreaterThanSign
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
                    // InternalPortugolParser.g:1523:2: ( LessThanSignEqualsSign )
                    {
                    // InternalPortugolParser.g:1523:2: ( LessThanSignEqualsSign )
                    // InternalPortugolParser.g:1524:3: LessThanSignEqualsSign
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
                    // InternalPortugolParser.g:1529:2: ( GreaterThanSignEqualsSign )
                    {
                    // InternalPortugolParser.g:1529:2: ( GreaterThanSignEqualsSign )
                    // InternalPortugolParser.g:1530:3: GreaterThanSignEqualsSign
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
    // InternalPortugolParser.g:1539:1: rule__AddExpression__OpAlternatives_1_0_0_1_0 : ( ( PlusSign ) | ( HyphenMinus ) );
    public final void rule__AddExpression__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1543:1: ( ( PlusSign ) | ( HyphenMinus ) )
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
                    // InternalPortugolParser.g:1544:2: ( PlusSign )
                    {
                    // InternalPortugolParser.g:1544:2: ( PlusSign )
                    // InternalPortugolParser.g:1545:3: PlusSign
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
                    // InternalPortugolParser.g:1550:2: ( HyphenMinus )
                    {
                    // InternalPortugolParser.g:1550:2: ( HyphenMinus )
                    // InternalPortugolParser.g:1551:3: HyphenMinus
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
    // InternalPortugolParser.g:1560:1: rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 : ( ( Asterisk ) | ( Solidus ) | ( MOD ) | ( PercentSign ) );
    public final void rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1564:1: ( ( Asterisk ) | ( Solidus ) | ( MOD ) | ( PercentSign ) )
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
                    // InternalPortugolParser.g:1565:2: ( Asterisk )
                    {
                    // InternalPortugolParser.g:1565:2: ( Asterisk )
                    // InternalPortugolParser.g:1566:3: Asterisk
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
                    // InternalPortugolParser.g:1571:2: ( Solidus )
                    {
                    // InternalPortugolParser.g:1571:2: ( Solidus )
                    // InternalPortugolParser.g:1572:3: Solidus
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
                    // InternalPortugolParser.g:1577:2: ( MOD )
                    {
                    // InternalPortugolParser.g:1577:2: ( MOD )
                    // InternalPortugolParser.g:1578:3: MOD
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
                    // InternalPortugolParser.g:1583:2: ( PercentSign )
                    {
                    // InternalPortugolParser.g:1583:2: ( PercentSign )
                    // InternalPortugolParser.g:1584:3: PercentSign
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
    // InternalPortugolParser.g:1593:1: rule__UnaryExpression__Alternatives : ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( rulePrimaryExpression ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1597:1: ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( rulePrimaryExpression ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==NOT||LA11_0==HyphenMinus) ) {
                alt11=1;
            }
            else if ( (LA11_0==LeftParenthesis||(LA11_0>=RULE_INT && LA11_0<=RULE_STRING)) ) {
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
                    // InternalPortugolParser.g:1598:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    {
                    // InternalPortugolParser.g:1598:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    // InternalPortugolParser.g:1599:3: ( rule__UnaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    }
                    // InternalPortugolParser.g:1600:3: ( rule__UnaryExpression__Group_0__0 )
                    // InternalPortugolParser.g:1600:4: rule__UnaryExpression__Group_0__0
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
                    // InternalPortugolParser.g:1604:2: ( rulePrimaryExpression )
                    {
                    // InternalPortugolParser.g:1604:2: ( rulePrimaryExpression )
                    // InternalPortugolParser.g:1605:3: rulePrimaryExpression
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
    // InternalPortugolParser.g:1614:1: rule__UnaryExpression__OpAlternatives_0_1_0 : ( ( NOT ) | ( HyphenMinus ) );
    public final void rule__UnaryExpression__OpAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1618:1: ( ( NOT ) | ( HyphenMinus ) )
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
                    // InternalPortugolParser.g:1619:2: ( NOT )
                    {
                    // InternalPortugolParser.g:1619:2: ( NOT )
                    // InternalPortugolParser.g:1620:3: NOT
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
                    // InternalPortugolParser.g:1625:2: ( HyphenMinus )
                    {
                    // InternalPortugolParser.g:1625:2: ( HyphenMinus )
                    // InternalPortugolParser.g:1626:3: HyphenMinus
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
    // InternalPortugolParser.g:1635:1: rule__PrimaryExpression__Alternatives : ( ( ruleLiteral ) | ( ruleFunctionCall ) | ( ruleDeclaredVar ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1639:1: ( ( ruleLiteral ) | ( ruleFunctionCall ) | ( ruleDeclaredVar ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_STRING:
                {
                alt13=1;
                }
                break;
            case RULE_ID:
                {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==EOF||LA13_2==Entao||LA13_2==Passo||LA13_2==Faca||LA13_2==MOD||(LA13_2>=XOU && LA13_2<=Ate)||(LA13_2>=LessThanSignHyphenMinus && LA13_2<=De)||(LA13_2>=PercentSign && LA13_2<=Ampersand)||(LA13_2>=RightParenthesis && LA13_2<=CircumflexAccent)) ) {
                    alt13=3;
                }
                else if ( (LA13_2==LeftParenthesis) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
                }
                break;
            case LeftParenthesis:
                {
                alt13=4;
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
                    // InternalPortugolParser.g:1640:2: ( ruleLiteral )
                    {
                    // InternalPortugolParser.g:1640:2: ( ruleLiteral )
                    // InternalPortugolParser.g:1641:3: ruleLiteral
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
                    // InternalPortugolParser.g:1646:2: ( ruleFunctionCall )
                    {
                    // InternalPortugolParser.g:1646:2: ( ruleFunctionCall )
                    // InternalPortugolParser.g:1647:3: ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPortugolParser.g:1652:2: ( ruleDeclaredVar )
                    {
                    // InternalPortugolParser.g:1652:2: ( ruleDeclaredVar )
                    // InternalPortugolParser.g:1653:3: ruleDeclaredVar
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getDeclaredVarParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDeclaredVar();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getDeclaredVarParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPortugolParser.g:1658:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    {
                    // InternalPortugolParser.g:1658:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    // InternalPortugolParser.g:1659:3: ( rule__PrimaryExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 
                    }
                    // InternalPortugolParser.g:1660:3: ( rule__PrimaryExpression__Group_3__0 )
                    // InternalPortugolParser.g:1660:4: rule__PrimaryExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 
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


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalPortugolParser.g:1668:1: rule__Literal__Alternatives : ( ( ruleNumericLiteral ) | ( ruleStringExpression ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1672:1: ( ( ruleNumericLiteral ) | ( ruleStringExpression ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_INT && LA14_0<=RULE_FLOAT)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_STRING) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalPortugolParser.g:1673:2: ( ruleNumericLiteral )
                    {
                    // InternalPortugolParser.g:1673:2: ( ruleNumericLiteral )
                    // InternalPortugolParser.g:1674:3: ruleNumericLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getNumericLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNumericLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getNumericLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugolParser.g:1679:2: ( ruleStringExpression )
                    {
                    // InternalPortugolParser.g:1679:2: ( ruleStringExpression )
                    // InternalPortugolParser.g:1680:3: ruleStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getStringExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleStringExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getStringExpressionParserRuleCall_1()); 
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
    // InternalPortugolParser.g:1689:1: rule__NumericLiteral__Alternatives : ( ( ( rule__NumericLiteral__IntValueAssignment_0 ) ) | ( ( rule__NumericLiteral__FloatValueAssignment_1 ) ) );
    public final void rule__NumericLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1693:1: ( ( ( rule__NumericLiteral__IntValueAssignment_0 ) ) | ( ( rule__NumericLiteral__FloatValueAssignment_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_FLOAT) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalPortugolParser.g:1694:2: ( ( rule__NumericLiteral__IntValueAssignment_0 ) )
                    {
                    // InternalPortugolParser.g:1694:2: ( ( rule__NumericLiteral__IntValueAssignment_0 ) )
                    // InternalPortugolParser.g:1695:3: ( rule__NumericLiteral__IntValueAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericLiteralAccess().getIntValueAssignment_0()); 
                    }
                    // InternalPortugolParser.g:1696:3: ( rule__NumericLiteral__IntValueAssignment_0 )
                    // InternalPortugolParser.g:1696:4: rule__NumericLiteral__IntValueAssignment_0
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
                    // InternalPortugolParser.g:1700:2: ( ( rule__NumericLiteral__FloatValueAssignment_1 ) )
                    {
                    // InternalPortugolParser.g:1700:2: ( ( rule__NumericLiteral__FloatValueAssignment_1 ) )
                    // InternalPortugolParser.g:1701:3: ( rule__NumericLiteral__FloatValueAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericLiteralAccess().getFloatValueAssignment_1()); 
                    }
                    // InternalPortugolParser.g:1702:3: ( rule__NumericLiteral__FloatValueAssignment_1 )
                    // InternalPortugolParser.g:1702:4: rule__NumericLiteral__FloatValueAssignment_1
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
    // InternalPortugolParser.g:1710:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1714:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalPortugolParser.g:1715:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalPortugolParser.g:1722:1: rule__Model__Group__0__Impl : ( ( rule__Model__HeaderAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1726:1: ( ( ( rule__Model__HeaderAssignment_0 ) ) )
            // InternalPortugolParser.g:1727:1: ( ( rule__Model__HeaderAssignment_0 ) )
            {
            // InternalPortugolParser.g:1727:1: ( ( rule__Model__HeaderAssignment_0 ) )
            // InternalPortugolParser.g:1728:2: ( rule__Model__HeaderAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getHeaderAssignment_0()); 
            }
            // InternalPortugolParser.g:1729:2: ( rule__Model__HeaderAssignment_0 )
            // InternalPortugolParser.g:1729:3: rule__Model__HeaderAssignment_0
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
    // InternalPortugolParser.g:1737:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1741:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalPortugolParser.g:1742:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalPortugolParser.g:1749:1: rule__Model__Group__1__Impl : ( ( rule__Model__GlobalDeclarationsAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1753:1: ( ( ( rule__Model__GlobalDeclarationsAssignment_1 ) ) )
            // InternalPortugolParser.g:1754:1: ( ( rule__Model__GlobalDeclarationsAssignment_1 ) )
            {
            // InternalPortugolParser.g:1754:1: ( ( rule__Model__GlobalDeclarationsAssignment_1 ) )
            // InternalPortugolParser.g:1755:2: ( rule__Model__GlobalDeclarationsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGlobalDeclarationsAssignment_1()); 
            }
            // InternalPortugolParser.g:1756:2: ( rule__Model__GlobalDeclarationsAssignment_1 )
            // InternalPortugolParser.g:1756:3: rule__Model__GlobalDeclarationsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__GlobalDeclarationsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalPortugolParser.g:1764:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1768:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalPortugolParser.g:1769:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalPortugolParser.g:1776:1: rule__Model__Group__2__Impl : ( ( rule__Model__SubprogramsAssignment_2 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1780:1: ( ( ( rule__Model__SubprogramsAssignment_2 )? ) )
            // InternalPortugolParser.g:1781:1: ( ( rule__Model__SubprogramsAssignment_2 )? )
            {
            // InternalPortugolParser.g:1781:1: ( ( rule__Model__SubprogramsAssignment_2 )? )
            // InternalPortugolParser.g:1782:2: ( rule__Model__SubprogramsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSubprogramsAssignment_2()); 
            }
            // InternalPortugolParser.g:1783:2: ( rule__Model__SubprogramsAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Procedimento||LA16_0==Funcao) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPortugolParser.g:1783:3: rule__Model__SubprogramsAssignment_2
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
    // InternalPortugolParser.g:1791:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1795:1: ( rule__Model__Group__3__Impl )
            // InternalPortugolParser.g:1796:2: rule__Model__Group__3__Impl
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
    // InternalPortugolParser.g:1802:1: rule__Model__Group__3__Impl : ( ( rule__Model__CommandsAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1806:1: ( ( ( rule__Model__CommandsAssignment_3 ) ) )
            // InternalPortugolParser.g:1807:1: ( ( rule__Model__CommandsAssignment_3 ) )
            {
            // InternalPortugolParser.g:1807:1: ( ( rule__Model__CommandsAssignment_3 ) )
            // InternalPortugolParser.g:1808:2: ( rule__Model__CommandsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugolParser.g:1809:2: ( rule__Model__CommandsAssignment_3 )
            // InternalPortugolParser.g:1809:3: rule__Model__CommandsAssignment_3
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
    // InternalPortugolParser.g:1818:1: rule__HeaderBlock__Group__0 : rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1 ;
    public final void rule__HeaderBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1822:1: ( rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1 )
            // InternalPortugolParser.g:1823:2: rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalPortugolParser.g:1830:1: rule__HeaderBlock__Group__0__Impl : ( Algoritmo ) ;
    public final void rule__HeaderBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1834:1: ( ( Algoritmo ) )
            // InternalPortugolParser.g:1835:1: ( Algoritmo )
            {
            // InternalPortugolParser.g:1835:1: ( Algoritmo )
            // InternalPortugolParser.g:1836:2: Algoritmo
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
    // InternalPortugolParser.g:1845:1: rule__HeaderBlock__Group__1 : rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2 ;
    public final void rule__HeaderBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1849:1: ( rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2 )
            // InternalPortugolParser.g:1850:2: rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalPortugolParser.g:1857:1: rule__HeaderBlock__Group__1__Impl : ( ( rule__HeaderBlock__AlgorithmNameAssignment_1 ) ) ;
    public final void rule__HeaderBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1861:1: ( ( ( rule__HeaderBlock__AlgorithmNameAssignment_1 ) ) )
            // InternalPortugolParser.g:1862:1: ( ( rule__HeaderBlock__AlgorithmNameAssignment_1 ) )
            {
            // InternalPortugolParser.g:1862:1: ( ( rule__HeaderBlock__AlgorithmNameAssignment_1 ) )
            // InternalPortugolParser.g:1863:2: ( rule__HeaderBlock__AlgorithmNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderBlockAccess().getAlgorithmNameAssignment_1()); 
            }
            // InternalPortugolParser.g:1864:2: ( rule__HeaderBlock__AlgorithmNameAssignment_1 )
            // InternalPortugolParser.g:1864:3: rule__HeaderBlock__AlgorithmNameAssignment_1
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
    // InternalPortugolParser.g:1872:1: rule__HeaderBlock__Group__2 : rule__HeaderBlock__Group__2__Impl ;
    public final void rule__HeaderBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1876:1: ( rule__HeaderBlock__Group__2__Impl )
            // InternalPortugolParser.g:1877:2: rule__HeaderBlock__Group__2__Impl
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
    // InternalPortugolParser.g:1883:1: rule__HeaderBlock__Group__2__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__HeaderBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1887:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugolParser.g:1888:1: ( ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:1888:1: ( ruleEND_COMMAND )
            // InternalPortugolParser.g:1889:2: ruleEND_COMMAND
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
    // InternalPortugolParser.g:1899:1: rule__DeclarationsBlock__Group__0 : rule__DeclarationsBlock__Group__0__Impl rule__DeclarationsBlock__Group__1 ;
    public final void rule__DeclarationsBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1903:1: ( rule__DeclarationsBlock__Group__0__Impl rule__DeclarationsBlock__Group__1 )
            // InternalPortugolParser.g:1904:2: rule__DeclarationsBlock__Group__0__Impl rule__DeclarationsBlock__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalPortugolParser.g:1911:1: rule__DeclarationsBlock__Group__0__Impl : ( Var ) ;
    public final void rule__DeclarationsBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1915:1: ( ( Var ) )
            // InternalPortugolParser.g:1916:1: ( Var )
            {
            // InternalPortugolParser.g:1916:1: ( Var )
            // InternalPortugolParser.g:1917:2: Var
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
    // InternalPortugolParser.g:1926:1: rule__DeclarationsBlock__Group__1 : rule__DeclarationsBlock__Group__1__Impl ;
    public final void rule__DeclarationsBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1930:1: ( rule__DeclarationsBlock__Group__1__Impl )
            // InternalPortugolParser.g:1931:2: rule__DeclarationsBlock__Group__1__Impl
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
    // InternalPortugolParser.g:1937:1: rule__DeclarationsBlock__Group__1__Impl : ( ( ( rule__DeclarationsBlock__Group_1__0 ) ) ( ( rule__DeclarationsBlock__Group_1__0 )* ) ) ;
    public final void rule__DeclarationsBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1941:1: ( ( ( ( rule__DeclarationsBlock__Group_1__0 ) ) ( ( rule__DeclarationsBlock__Group_1__0 )* ) ) )
            // InternalPortugolParser.g:1942:1: ( ( ( rule__DeclarationsBlock__Group_1__0 ) ) ( ( rule__DeclarationsBlock__Group_1__0 )* ) )
            {
            // InternalPortugolParser.g:1942:1: ( ( ( rule__DeclarationsBlock__Group_1__0 ) ) ( ( rule__DeclarationsBlock__Group_1__0 )* ) )
            // InternalPortugolParser.g:1943:2: ( ( rule__DeclarationsBlock__Group_1__0 ) ) ( ( rule__DeclarationsBlock__Group_1__0 )* )
            {
            // InternalPortugolParser.g:1943:2: ( ( rule__DeclarationsBlock__Group_1__0 ) )
            // InternalPortugolParser.g:1944:3: ( rule__DeclarationsBlock__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:1945:3: ( rule__DeclarationsBlock__Group_1__0 )
            // InternalPortugolParser.g:1945:4: rule__DeclarationsBlock__Group_1__0
            {
            pushFollow(FOLLOW_9);
            rule__DeclarationsBlock__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationsBlockAccess().getGroup_1()); 
            }

            }

            // InternalPortugolParser.g:1948:2: ( ( rule__DeclarationsBlock__Group_1__0 )* )
            // InternalPortugolParser.g:1949:3: ( rule__DeclarationsBlock__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:1950:3: ( rule__DeclarationsBlock__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPortugolParser.g:1950:4: rule__DeclarationsBlock__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DeclarationsBlock__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalPortugolParser.g:1960:1: rule__DeclarationsBlock__Group_1__0 : rule__DeclarationsBlock__Group_1__0__Impl rule__DeclarationsBlock__Group_1__1 ;
    public final void rule__DeclarationsBlock__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1964:1: ( rule__DeclarationsBlock__Group_1__0__Impl rule__DeclarationsBlock__Group_1__1 )
            // InternalPortugolParser.g:1965:2: rule__DeclarationsBlock__Group_1__0__Impl rule__DeclarationsBlock__Group_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalPortugolParser.g:1972:1: rule__DeclarationsBlock__Group_1__0__Impl : ( ( rule__DeclarationsBlock__VarsAssignment_1_0 ) ) ;
    public final void rule__DeclarationsBlock__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1976:1: ( ( ( rule__DeclarationsBlock__VarsAssignment_1_0 ) ) )
            // InternalPortugolParser.g:1977:1: ( ( rule__DeclarationsBlock__VarsAssignment_1_0 ) )
            {
            // InternalPortugolParser.g:1977:1: ( ( rule__DeclarationsBlock__VarsAssignment_1_0 ) )
            // InternalPortugolParser.g:1978:2: ( rule__DeclarationsBlock__VarsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getVarsAssignment_1_0()); 
            }
            // InternalPortugolParser.g:1979:2: ( rule__DeclarationsBlock__VarsAssignment_1_0 )
            // InternalPortugolParser.g:1979:3: rule__DeclarationsBlock__VarsAssignment_1_0
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
    // InternalPortugolParser.g:1987:1: rule__DeclarationsBlock__Group_1__1 : rule__DeclarationsBlock__Group_1__1__Impl ;
    public final void rule__DeclarationsBlock__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:1991:1: ( rule__DeclarationsBlock__Group_1__1__Impl )
            // InternalPortugolParser.g:1992:2: rule__DeclarationsBlock__Group_1__1__Impl
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
    // InternalPortugolParser.g:1998:1: rule__DeclarationsBlock__Group_1__1__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__DeclarationsBlock__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2002:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugolParser.g:2003:1: ( ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:2003:1: ( ruleEND_COMMAND )
            // InternalPortugolParser.g:2004:2: ruleEND_COMMAND
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
    // InternalPortugolParser.g:2014:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2018:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalPortugolParser.g:2019:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalPortugolParser.g:2026:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__VarDeclarationAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2030:1: ( ( ( rule__Variable__VarDeclarationAssignment_0 ) ) )
            // InternalPortugolParser.g:2031:1: ( ( rule__Variable__VarDeclarationAssignment_0 ) )
            {
            // InternalPortugolParser.g:2031:1: ( ( rule__Variable__VarDeclarationAssignment_0 ) )
            // InternalPortugolParser.g:2032:2: ( rule__Variable__VarDeclarationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getVarDeclarationAssignment_0()); 
            }
            // InternalPortugolParser.g:2033:2: ( rule__Variable__VarDeclarationAssignment_0 )
            // InternalPortugolParser.g:2033:3: rule__Variable__VarDeclarationAssignment_0
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
    // InternalPortugolParser.g:2041:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2045:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalPortugolParser.g:2046:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalPortugolParser.g:2053:1: rule__Variable__Group__1__Impl : ( Colon ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2057:1: ( ( Colon ) )
            // InternalPortugolParser.g:2058:1: ( Colon )
            {
            // InternalPortugolParser.g:2058:1: ( Colon )
            // InternalPortugolParser.g:2059:2: Colon
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
    // InternalPortugolParser.g:2068:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2072:1: ( rule__Variable__Group__2__Impl )
            // InternalPortugolParser.g:2073:2: rule__Variable__Group__2__Impl
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
    // InternalPortugolParser.g:2079:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__TypeAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2083:1: ( ( ( rule__Variable__TypeAssignment_2 ) ) )
            // InternalPortugolParser.g:2084:1: ( ( rule__Variable__TypeAssignment_2 ) )
            {
            // InternalPortugolParser.g:2084:1: ( ( rule__Variable__TypeAssignment_2 ) )
            // InternalPortugolParser.g:2085:2: ( rule__Variable__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getTypeAssignment_2()); 
            }
            // InternalPortugolParser.g:2086:2: ( rule__Variable__TypeAssignment_2 )
            // InternalPortugolParser.g:2086:3: rule__Variable__TypeAssignment_2
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
    // InternalPortugolParser.g:2095:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2099:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // InternalPortugolParser.g:2100:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalPortugolParser.g:2107:1: rule__VarDeclaration__Group__0__Impl : ( ( rule__VarDeclaration__VarsAssignment_0 ) ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2111:1: ( ( ( rule__VarDeclaration__VarsAssignment_0 ) ) )
            // InternalPortugolParser.g:2112:1: ( ( rule__VarDeclaration__VarsAssignment_0 ) )
            {
            // InternalPortugolParser.g:2112:1: ( ( rule__VarDeclaration__VarsAssignment_0 ) )
            // InternalPortugolParser.g:2113:2: ( rule__VarDeclaration__VarsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getVarsAssignment_0()); 
            }
            // InternalPortugolParser.g:2114:2: ( rule__VarDeclaration__VarsAssignment_0 )
            // InternalPortugolParser.g:2114:3: rule__VarDeclaration__VarsAssignment_0
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
    // InternalPortugolParser.g:2122:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2126:1: ( rule__VarDeclaration__Group__1__Impl )
            // InternalPortugolParser.g:2127:2: rule__VarDeclaration__Group__1__Impl
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
    // InternalPortugolParser.g:2133:1: rule__VarDeclaration__Group__1__Impl : ( ( rule__VarDeclaration__Group_1__0 )* ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2137:1: ( ( ( rule__VarDeclaration__Group_1__0 )* ) )
            // InternalPortugolParser.g:2138:1: ( ( rule__VarDeclaration__Group_1__0 )* )
            {
            // InternalPortugolParser.g:2138:1: ( ( rule__VarDeclaration__Group_1__0 )* )
            // InternalPortugolParser.g:2139:2: ( rule__VarDeclaration__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:2140:2: ( rule__VarDeclaration__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Comma) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPortugolParser.g:2140:3: rule__VarDeclaration__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__VarDeclaration__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalPortugolParser.g:2149:1: rule__VarDeclaration__Group_1__0 : rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1 ;
    public final void rule__VarDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2153:1: ( rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1 )
            // InternalPortugolParser.g:2154:2: rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalPortugolParser.g:2161:1: rule__VarDeclaration__Group_1__0__Impl : ( Comma ) ;
    public final void rule__VarDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2165:1: ( ( Comma ) )
            // InternalPortugolParser.g:2166:1: ( Comma )
            {
            // InternalPortugolParser.g:2166:1: ( Comma )
            // InternalPortugolParser.g:2167:2: Comma
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
    // InternalPortugolParser.g:2176:1: rule__VarDeclaration__Group_1__1 : rule__VarDeclaration__Group_1__1__Impl ;
    public final void rule__VarDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2180:1: ( rule__VarDeclaration__Group_1__1__Impl )
            // InternalPortugolParser.g:2181:2: rule__VarDeclaration__Group_1__1__Impl
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
    // InternalPortugolParser.g:2187:1: rule__VarDeclaration__Group_1__1__Impl : ( ( rule__VarDeclaration__VarsAssignment_1_1 ) ) ;
    public final void rule__VarDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2191:1: ( ( ( rule__VarDeclaration__VarsAssignment_1_1 ) ) )
            // InternalPortugolParser.g:2192:1: ( ( rule__VarDeclaration__VarsAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:2192:1: ( ( rule__VarDeclaration__VarsAssignment_1_1 ) )
            // InternalPortugolParser.g:2193:2: ( rule__VarDeclaration__VarsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getVarsAssignment_1_1()); 
            }
            // InternalPortugolParser.g:2194:2: ( rule__VarDeclaration__VarsAssignment_1_1 )
            // InternalPortugolParser.g:2194:3: rule__VarDeclaration__VarsAssignment_1_1
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
    // InternalPortugolParser.g:2203:1: rule__DeclaredVarList__Group__0 : rule__DeclaredVarList__Group__0__Impl rule__DeclaredVarList__Group__1 ;
    public final void rule__DeclaredVarList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2207:1: ( rule__DeclaredVarList__Group__0__Impl rule__DeclaredVarList__Group__1 )
            // InternalPortugolParser.g:2208:2: rule__DeclaredVarList__Group__0__Impl rule__DeclaredVarList__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalPortugolParser.g:2215:1: rule__DeclaredVarList__Group__0__Impl : ( ( rule__DeclaredVarList__VarsAssignment_0 ) ) ;
    public final void rule__DeclaredVarList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2219:1: ( ( ( rule__DeclaredVarList__VarsAssignment_0 ) ) )
            // InternalPortugolParser.g:2220:1: ( ( rule__DeclaredVarList__VarsAssignment_0 ) )
            {
            // InternalPortugolParser.g:2220:1: ( ( rule__DeclaredVarList__VarsAssignment_0 ) )
            // InternalPortugolParser.g:2221:2: ( rule__DeclaredVarList__VarsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getVarsAssignment_0()); 
            }
            // InternalPortugolParser.g:2222:2: ( rule__DeclaredVarList__VarsAssignment_0 )
            // InternalPortugolParser.g:2222:3: rule__DeclaredVarList__VarsAssignment_0
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
    // InternalPortugolParser.g:2230:1: rule__DeclaredVarList__Group__1 : rule__DeclaredVarList__Group__1__Impl ;
    public final void rule__DeclaredVarList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2234:1: ( rule__DeclaredVarList__Group__1__Impl )
            // InternalPortugolParser.g:2235:2: rule__DeclaredVarList__Group__1__Impl
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
    // InternalPortugolParser.g:2241:1: rule__DeclaredVarList__Group__1__Impl : ( ( rule__DeclaredVarList__Group_1__0 )* ) ;
    public final void rule__DeclaredVarList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2245:1: ( ( ( rule__DeclaredVarList__Group_1__0 )* ) )
            // InternalPortugolParser.g:2246:1: ( ( rule__DeclaredVarList__Group_1__0 )* )
            {
            // InternalPortugolParser.g:2246:1: ( ( rule__DeclaredVarList__Group_1__0 )* )
            // InternalPortugolParser.g:2247:2: ( rule__DeclaredVarList__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:2248:2: ( rule__DeclaredVarList__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Comma) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPortugolParser.g:2248:3: rule__DeclaredVarList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__DeclaredVarList__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalPortugolParser.g:2257:1: rule__DeclaredVarList__Group_1__0 : rule__DeclaredVarList__Group_1__0__Impl rule__DeclaredVarList__Group_1__1 ;
    public final void rule__DeclaredVarList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2261:1: ( rule__DeclaredVarList__Group_1__0__Impl rule__DeclaredVarList__Group_1__1 )
            // InternalPortugolParser.g:2262:2: rule__DeclaredVarList__Group_1__0__Impl rule__DeclaredVarList__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalPortugolParser.g:2269:1: rule__DeclaredVarList__Group_1__0__Impl : ( Comma ) ;
    public final void rule__DeclaredVarList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2273:1: ( ( Comma ) )
            // InternalPortugolParser.g:2274:1: ( Comma )
            {
            // InternalPortugolParser.g:2274:1: ( Comma )
            // InternalPortugolParser.g:2275:2: Comma
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
    // InternalPortugolParser.g:2284:1: rule__DeclaredVarList__Group_1__1 : rule__DeclaredVarList__Group_1__1__Impl ;
    public final void rule__DeclaredVarList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2288:1: ( rule__DeclaredVarList__Group_1__1__Impl )
            // InternalPortugolParser.g:2289:2: rule__DeclaredVarList__Group_1__1__Impl
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
    // InternalPortugolParser.g:2295:1: rule__DeclaredVarList__Group_1__1__Impl : ( ( rule__DeclaredVarList__VarsAssignment_1_1 ) ) ;
    public final void rule__DeclaredVarList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2299:1: ( ( ( rule__DeclaredVarList__VarsAssignment_1_1 ) ) )
            // InternalPortugolParser.g:2300:1: ( ( rule__DeclaredVarList__VarsAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:2300:1: ( ( rule__DeclaredVarList__VarsAssignment_1_1 ) )
            // InternalPortugolParser.g:2301:2: ( rule__DeclaredVarList__VarsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getVarsAssignment_1_1()); 
            }
            // InternalPortugolParser.g:2302:2: ( rule__DeclaredVarList__VarsAssignment_1_1 )
            // InternalPortugolParser.g:2302:3: rule__DeclaredVarList__VarsAssignment_1_1
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
    // InternalPortugolParser.g:2311:1: rule__BlockFunction__Group__0 : rule__BlockFunction__Group__0__Impl rule__BlockFunction__Group__1 ;
    public final void rule__BlockFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2315:1: ( rule__BlockFunction__Group__0__Impl rule__BlockFunction__Group__1 )
            // InternalPortugolParser.g:2316:2: rule__BlockFunction__Group__0__Impl rule__BlockFunction__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalPortugolParser.g:2323:1: rule__BlockFunction__Group__0__Impl : ( Funcao ) ;
    public final void rule__BlockFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2327:1: ( ( Funcao ) )
            // InternalPortugolParser.g:2328:1: ( Funcao )
            {
            // InternalPortugolParser.g:2328:1: ( Funcao )
            // InternalPortugolParser.g:2329:2: Funcao
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
    // InternalPortugolParser.g:2338:1: rule__BlockFunction__Group__1 : rule__BlockFunction__Group__1__Impl rule__BlockFunction__Group__2 ;
    public final void rule__BlockFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2342:1: ( rule__BlockFunction__Group__1__Impl rule__BlockFunction__Group__2 )
            // InternalPortugolParser.g:2343:2: rule__BlockFunction__Group__1__Impl rule__BlockFunction__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalPortugolParser.g:2350:1: rule__BlockFunction__Group__1__Impl : ( ( rule__BlockFunction__FunctionNameAssignment_1 ) ) ;
    public final void rule__BlockFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2354:1: ( ( ( rule__BlockFunction__FunctionNameAssignment_1 ) ) )
            // InternalPortugolParser.g:2355:1: ( ( rule__BlockFunction__FunctionNameAssignment_1 ) )
            {
            // InternalPortugolParser.g:2355:1: ( ( rule__BlockFunction__FunctionNameAssignment_1 ) )
            // InternalPortugolParser.g:2356:2: ( rule__BlockFunction__FunctionNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getFunctionNameAssignment_1()); 
            }
            // InternalPortugolParser.g:2357:2: ( rule__BlockFunction__FunctionNameAssignment_1 )
            // InternalPortugolParser.g:2357:3: rule__BlockFunction__FunctionNameAssignment_1
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
    // InternalPortugolParser.g:2365:1: rule__BlockFunction__Group__2 : rule__BlockFunction__Group__2__Impl rule__BlockFunction__Group__3 ;
    public final void rule__BlockFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2369:1: ( rule__BlockFunction__Group__2__Impl rule__BlockFunction__Group__3 )
            // InternalPortugolParser.g:2370:2: rule__BlockFunction__Group__2__Impl rule__BlockFunction__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalPortugolParser.g:2377:1: rule__BlockFunction__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__BlockFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2381:1: ( ( LeftParenthesis ) )
            // InternalPortugolParser.g:2382:1: ( LeftParenthesis )
            {
            // InternalPortugolParser.g:2382:1: ( LeftParenthesis )
            // InternalPortugolParser.g:2383:2: LeftParenthesis
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
    // InternalPortugolParser.g:2392:1: rule__BlockFunction__Group__3 : rule__BlockFunction__Group__3__Impl rule__BlockFunction__Group__4 ;
    public final void rule__BlockFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2396:1: ( rule__BlockFunction__Group__3__Impl rule__BlockFunction__Group__4 )
            // InternalPortugolParser.g:2397:2: rule__BlockFunction__Group__3__Impl rule__BlockFunction__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalPortugolParser.g:2404:1: rule__BlockFunction__Group__3__Impl : ( ( rule__BlockFunction__ParamListAssignment_3 ) ) ;
    public final void rule__BlockFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2408:1: ( ( ( rule__BlockFunction__ParamListAssignment_3 ) ) )
            // InternalPortugolParser.g:2409:1: ( ( rule__BlockFunction__ParamListAssignment_3 ) )
            {
            // InternalPortugolParser.g:2409:1: ( ( rule__BlockFunction__ParamListAssignment_3 ) )
            // InternalPortugolParser.g:2410:2: ( rule__BlockFunction__ParamListAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getParamListAssignment_3()); 
            }
            // InternalPortugolParser.g:2411:2: ( rule__BlockFunction__ParamListAssignment_3 )
            // InternalPortugolParser.g:2411:3: rule__BlockFunction__ParamListAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BlockFunction__ParamListAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getParamListAssignment_3()); 
            }

            }


            }

        }
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
    // InternalPortugolParser.g:2419:1: rule__BlockFunction__Group__4 : rule__BlockFunction__Group__4__Impl rule__BlockFunction__Group__5 ;
    public final void rule__BlockFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2423:1: ( rule__BlockFunction__Group__4__Impl rule__BlockFunction__Group__5 )
            // InternalPortugolParser.g:2424:2: rule__BlockFunction__Group__4__Impl rule__BlockFunction__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalPortugolParser.g:2431:1: rule__BlockFunction__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__BlockFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2435:1: ( ( RightParenthesis ) )
            // InternalPortugolParser.g:2436:1: ( RightParenthesis )
            {
            // InternalPortugolParser.g:2436:1: ( RightParenthesis )
            // InternalPortugolParser.g:2437:2: RightParenthesis
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
    // InternalPortugolParser.g:2446:1: rule__BlockFunction__Group__5 : rule__BlockFunction__Group__5__Impl rule__BlockFunction__Group__6 ;
    public final void rule__BlockFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2450:1: ( rule__BlockFunction__Group__5__Impl rule__BlockFunction__Group__6 )
            // InternalPortugolParser.g:2451:2: rule__BlockFunction__Group__5__Impl rule__BlockFunction__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalPortugolParser.g:2458:1: rule__BlockFunction__Group__5__Impl : ( Colon ) ;
    public final void rule__BlockFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2462:1: ( ( Colon ) )
            // InternalPortugolParser.g:2463:1: ( Colon )
            {
            // InternalPortugolParser.g:2463:1: ( Colon )
            // InternalPortugolParser.g:2464:2: Colon
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
    // InternalPortugolParser.g:2473:1: rule__BlockFunction__Group__6 : rule__BlockFunction__Group__6__Impl rule__BlockFunction__Group__7 ;
    public final void rule__BlockFunction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2477:1: ( rule__BlockFunction__Group__6__Impl rule__BlockFunction__Group__7 )
            // InternalPortugolParser.g:2478:2: rule__BlockFunction__Group__6__Impl rule__BlockFunction__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalPortugolParser.g:2485:1: rule__BlockFunction__Group__6__Impl : ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) ) ;
    public final void rule__BlockFunction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2489:1: ( ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) ) )
            // InternalPortugolParser.g:2490:1: ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) )
            {
            // InternalPortugolParser.g:2490:1: ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) )
            // InternalPortugolParser.g:2491:2: ( rule__BlockFunction__ReturnTypeAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getReturnTypeAssignment_6()); 
            }
            // InternalPortugolParser.g:2492:2: ( rule__BlockFunction__ReturnTypeAssignment_6 )
            // InternalPortugolParser.g:2492:3: rule__BlockFunction__ReturnTypeAssignment_6
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
    // InternalPortugolParser.g:2500:1: rule__BlockFunction__Group__7 : rule__BlockFunction__Group__7__Impl rule__BlockFunction__Group__8 ;
    public final void rule__BlockFunction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2504:1: ( rule__BlockFunction__Group__7__Impl rule__BlockFunction__Group__8 )
            // InternalPortugolParser.g:2505:2: rule__BlockFunction__Group__7__Impl rule__BlockFunction__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalPortugolParser.g:2512:1: rule__BlockFunction__Group__7__Impl : ( ( rule__BlockFunction__DeclarationsAssignment_7 )? ) ;
    public final void rule__BlockFunction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2516:1: ( ( ( rule__BlockFunction__DeclarationsAssignment_7 )? ) )
            // InternalPortugolParser.g:2517:1: ( ( rule__BlockFunction__DeclarationsAssignment_7 )? )
            {
            // InternalPortugolParser.g:2517:1: ( ( rule__BlockFunction__DeclarationsAssignment_7 )? )
            // InternalPortugolParser.g:2518:2: ( rule__BlockFunction__DeclarationsAssignment_7 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getDeclarationsAssignment_7()); 
            }
            // InternalPortugolParser.g:2519:2: ( rule__BlockFunction__DeclarationsAssignment_7 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Var) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPortugolParser.g:2519:3: rule__BlockFunction__DeclarationsAssignment_7
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
    // InternalPortugolParser.g:2527:1: rule__BlockFunction__Group__8 : rule__BlockFunction__Group__8__Impl rule__BlockFunction__Group__9 ;
    public final void rule__BlockFunction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2531:1: ( rule__BlockFunction__Group__8__Impl rule__BlockFunction__Group__9 )
            // InternalPortugolParser.g:2532:2: rule__BlockFunction__Group__8__Impl rule__BlockFunction__Group__9
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugolParser.g:2539:1: rule__BlockFunction__Group__8__Impl : ( Inicio ) ;
    public final void rule__BlockFunction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2543:1: ( ( Inicio ) )
            // InternalPortugolParser.g:2544:1: ( Inicio )
            {
            // InternalPortugolParser.g:2544:1: ( Inicio )
            // InternalPortugolParser.g:2545:2: Inicio
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
    // InternalPortugolParser.g:2554:1: rule__BlockFunction__Group__9 : rule__BlockFunction__Group__9__Impl rule__BlockFunction__Group__10 ;
    public final void rule__BlockFunction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2558:1: ( rule__BlockFunction__Group__9__Impl rule__BlockFunction__Group__10 )
            // InternalPortugolParser.g:2559:2: rule__BlockFunction__Group__9__Impl rule__BlockFunction__Group__10
            {
            pushFollow(FOLLOW_18);
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
    // InternalPortugolParser.g:2566:1: rule__BlockFunction__Group__9__Impl : ( ( ( rule__BlockFunction__CommandsAssignment_9 ) ) ( ( rule__BlockFunction__CommandsAssignment_9 )* ) ) ;
    public final void rule__BlockFunction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2570:1: ( ( ( ( rule__BlockFunction__CommandsAssignment_9 ) ) ( ( rule__BlockFunction__CommandsAssignment_9 )* ) ) )
            // InternalPortugolParser.g:2571:1: ( ( ( rule__BlockFunction__CommandsAssignment_9 ) ) ( ( rule__BlockFunction__CommandsAssignment_9 )* ) )
            {
            // InternalPortugolParser.g:2571:1: ( ( ( rule__BlockFunction__CommandsAssignment_9 ) ) ( ( rule__BlockFunction__CommandsAssignment_9 )* ) )
            // InternalPortugolParser.g:2572:2: ( ( rule__BlockFunction__CommandsAssignment_9 ) ) ( ( rule__BlockFunction__CommandsAssignment_9 )* )
            {
            // InternalPortugolParser.g:2572:2: ( ( rule__BlockFunction__CommandsAssignment_9 ) )
            // InternalPortugolParser.g:2573:3: ( rule__BlockFunction__CommandsAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getCommandsAssignment_9()); 
            }
            // InternalPortugolParser.g:2574:3: ( rule__BlockFunction__CommandsAssignment_9 )
            // InternalPortugolParser.g:2574:4: rule__BlockFunction__CommandsAssignment_9
            {
            pushFollow(FOLLOW_19);
            rule__BlockFunction__CommandsAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getCommandsAssignment_9()); 
            }

            }

            // InternalPortugolParser.g:2577:2: ( ( rule__BlockFunction__CommandsAssignment_9 )* )
            // InternalPortugolParser.g:2578:3: ( rule__BlockFunction__CommandsAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getCommandsAssignment_9()); 
            }
            // InternalPortugolParser.g:2579:3: ( rule__BlockFunction__CommandsAssignment_9 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Interrompa||(LA21_0>=Enquanto && LA21_0<=Escreva)||LA21_0==Retorne||LA21_0==Repita||(LA21_0>=Leia && LA21_0<=Para)||LA21_0==NOT||LA21_0==Se||LA21_0==LeftParenthesis||LA21_0==HyphenMinus||(LA21_0>=RULE_INT && LA21_0<=RULE_STRING)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPortugolParser.g:2579:4: rule__BlockFunction__CommandsAssignment_9
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__BlockFunction__CommandsAssignment_9();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalPortugolParser.g:2588:1: rule__BlockFunction__Group__10 : rule__BlockFunction__Group__10__Impl ;
    public final void rule__BlockFunction__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2592:1: ( rule__BlockFunction__Group__10__Impl )
            // InternalPortugolParser.g:2593:2: rule__BlockFunction__Group__10__Impl
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
    // InternalPortugolParser.g:2599:1: rule__BlockFunction__Group__10__Impl : ( Fimfuncao ) ;
    public final void rule__BlockFunction__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2603:1: ( ( Fimfuncao ) )
            // InternalPortugolParser.g:2604:1: ( Fimfuncao )
            {
            // InternalPortugolParser.g:2604:1: ( Fimfuncao )
            // InternalPortugolParser.g:2605:2: Fimfuncao
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
    // InternalPortugolParser.g:2615:1: rule__BlockProcedure__Group__0 : rule__BlockProcedure__Group__0__Impl rule__BlockProcedure__Group__1 ;
    public final void rule__BlockProcedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2619:1: ( rule__BlockProcedure__Group__0__Impl rule__BlockProcedure__Group__1 )
            // InternalPortugolParser.g:2620:2: rule__BlockProcedure__Group__0__Impl rule__BlockProcedure__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalPortugolParser.g:2627:1: rule__BlockProcedure__Group__0__Impl : ( Procedimento ) ;
    public final void rule__BlockProcedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2631:1: ( ( Procedimento ) )
            // InternalPortugolParser.g:2632:1: ( Procedimento )
            {
            // InternalPortugolParser.g:2632:1: ( Procedimento )
            // InternalPortugolParser.g:2633:2: Procedimento
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
    // InternalPortugolParser.g:2642:1: rule__BlockProcedure__Group__1 : rule__BlockProcedure__Group__1__Impl rule__BlockProcedure__Group__2 ;
    public final void rule__BlockProcedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2646:1: ( rule__BlockProcedure__Group__1__Impl rule__BlockProcedure__Group__2 )
            // InternalPortugolParser.g:2647:2: rule__BlockProcedure__Group__1__Impl rule__BlockProcedure__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalPortugolParser.g:2654:1: rule__BlockProcedure__Group__1__Impl : ( ( rule__BlockProcedure__ProcedureAssignment_1 ) ) ;
    public final void rule__BlockProcedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2658:1: ( ( ( rule__BlockProcedure__ProcedureAssignment_1 ) ) )
            // InternalPortugolParser.g:2659:1: ( ( rule__BlockProcedure__ProcedureAssignment_1 ) )
            {
            // InternalPortugolParser.g:2659:1: ( ( rule__BlockProcedure__ProcedureAssignment_1 ) )
            // InternalPortugolParser.g:2660:2: ( rule__BlockProcedure__ProcedureAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getProcedureAssignment_1()); 
            }
            // InternalPortugolParser.g:2661:2: ( rule__BlockProcedure__ProcedureAssignment_1 )
            // InternalPortugolParser.g:2661:3: rule__BlockProcedure__ProcedureAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BlockProcedure__ProcedureAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getProcedureAssignment_1()); 
            }

            }


            }

        }
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
    // InternalPortugolParser.g:2669:1: rule__BlockProcedure__Group__2 : rule__BlockProcedure__Group__2__Impl rule__BlockProcedure__Group__3 ;
    public final void rule__BlockProcedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2673:1: ( rule__BlockProcedure__Group__2__Impl rule__BlockProcedure__Group__3 )
            // InternalPortugolParser.g:2674:2: rule__BlockProcedure__Group__2__Impl rule__BlockProcedure__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalPortugolParser.g:2681:1: rule__BlockProcedure__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__BlockProcedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2685:1: ( ( LeftParenthesis ) )
            // InternalPortugolParser.g:2686:1: ( LeftParenthesis )
            {
            // InternalPortugolParser.g:2686:1: ( LeftParenthesis )
            // InternalPortugolParser.g:2687:2: LeftParenthesis
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
    // InternalPortugolParser.g:2696:1: rule__BlockProcedure__Group__3 : rule__BlockProcedure__Group__3__Impl rule__BlockProcedure__Group__4 ;
    public final void rule__BlockProcedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2700:1: ( rule__BlockProcedure__Group__3__Impl rule__BlockProcedure__Group__4 )
            // InternalPortugolParser.g:2701:2: rule__BlockProcedure__Group__3__Impl rule__BlockProcedure__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalPortugolParser.g:2708:1: rule__BlockProcedure__Group__3__Impl : ( ( rule__BlockProcedure__ParamListAssignment_3 ) ) ;
    public final void rule__BlockProcedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2712:1: ( ( ( rule__BlockProcedure__ParamListAssignment_3 ) ) )
            // InternalPortugolParser.g:2713:1: ( ( rule__BlockProcedure__ParamListAssignment_3 ) )
            {
            // InternalPortugolParser.g:2713:1: ( ( rule__BlockProcedure__ParamListAssignment_3 ) )
            // InternalPortugolParser.g:2714:2: ( rule__BlockProcedure__ParamListAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getParamListAssignment_3()); 
            }
            // InternalPortugolParser.g:2715:2: ( rule__BlockProcedure__ParamListAssignment_3 )
            // InternalPortugolParser.g:2715:3: rule__BlockProcedure__ParamListAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BlockProcedure__ParamListAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getParamListAssignment_3()); 
            }

            }


            }

        }
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
    // InternalPortugolParser.g:2723:1: rule__BlockProcedure__Group__4 : rule__BlockProcedure__Group__4__Impl rule__BlockProcedure__Group__5 ;
    public final void rule__BlockProcedure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2727:1: ( rule__BlockProcedure__Group__4__Impl rule__BlockProcedure__Group__5 )
            // InternalPortugolParser.g:2728:2: rule__BlockProcedure__Group__4__Impl rule__BlockProcedure__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalPortugolParser.g:2735:1: rule__BlockProcedure__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__BlockProcedure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2739:1: ( ( RightParenthesis ) )
            // InternalPortugolParser.g:2740:1: ( RightParenthesis )
            {
            // InternalPortugolParser.g:2740:1: ( RightParenthesis )
            // InternalPortugolParser.g:2741:2: RightParenthesis
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
    // InternalPortugolParser.g:2750:1: rule__BlockProcedure__Group__5 : rule__BlockProcedure__Group__5__Impl rule__BlockProcedure__Group__6 ;
    public final void rule__BlockProcedure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2754:1: ( rule__BlockProcedure__Group__5__Impl rule__BlockProcedure__Group__6 )
            // InternalPortugolParser.g:2755:2: rule__BlockProcedure__Group__5__Impl rule__BlockProcedure__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalPortugolParser.g:2762:1: rule__BlockProcedure__Group__5__Impl : ( ( rule__BlockProcedure__DeclarationsAssignment_5 )? ) ;
    public final void rule__BlockProcedure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2766:1: ( ( ( rule__BlockProcedure__DeclarationsAssignment_5 )? ) )
            // InternalPortugolParser.g:2767:1: ( ( rule__BlockProcedure__DeclarationsAssignment_5 )? )
            {
            // InternalPortugolParser.g:2767:1: ( ( rule__BlockProcedure__DeclarationsAssignment_5 )? )
            // InternalPortugolParser.g:2768:2: ( rule__BlockProcedure__DeclarationsAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getDeclarationsAssignment_5()); 
            }
            // InternalPortugolParser.g:2769:2: ( rule__BlockProcedure__DeclarationsAssignment_5 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Var) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPortugolParser.g:2769:3: rule__BlockProcedure__DeclarationsAssignment_5
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
    // InternalPortugolParser.g:2777:1: rule__BlockProcedure__Group__6 : rule__BlockProcedure__Group__6__Impl rule__BlockProcedure__Group__7 ;
    public final void rule__BlockProcedure__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2781:1: ( rule__BlockProcedure__Group__6__Impl rule__BlockProcedure__Group__7 )
            // InternalPortugolParser.g:2782:2: rule__BlockProcedure__Group__6__Impl rule__BlockProcedure__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugolParser.g:2789:1: rule__BlockProcedure__Group__6__Impl : ( Inicio ) ;
    public final void rule__BlockProcedure__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2793:1: ( ( Inicio ) )
            // InternalPortugolParser.g:2794:1: ( Inicio )
            {
            // InternalPortugolParser.g:2794:1: ( Inicio )
            // InternalPortugolParser.g:2795:2: Inicio
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
    // InternalPortugolParser.g:2804:1: rule__BlockProcedure__Group__7 : rule__BlockProcedure__Group__7__Impl rule__BlockProcedure__Group__8 ;
    public final void rule__BlockProcedure__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2808:1: ( rule__BlockProcedure__Group__7__Impl rule__BlockProcedure__Group__8 )
            // InternalPortugolParser.g:2809:2: rule__BlockProcedure__Group__7__Impl rule__BlockProcedure__Group__8
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
    // InternalPortugolParser.g:2816:1: rule__BlockProcedure__Group__7__Impl : ( ( ( rule__BlockProcedure__CommandsAssignment_7 ) ) ( ( rule__BlockProcedure__CommandsAssignment_7 )* ) ) ;
    public final void rule__BlockProcedure__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2820:1: ( ( ( ( rule__BlockProcedure__CommandsAssignment_7 ) ) ( ( rule__BlockProcedure__CommandsAssignment_7 )* ) ) )
            // InternalPortugolParser.g:2821:1: ( ( ( rule__BlockProcedure__CommandsAssignment_7 ) ) ( ( rule__BlockProcedure__CommandsAssignment_7 )* ) )
            {
            // InternalPortugolParser.g:2821:1: ( ( ( rule__BlockProcedure__CommandsAssignment_7 ) ) ( ( rule__BlockProcedure__CommandsAssignment_7 )* ) )
            // InternalPortugolParser.g:2822:2: ( ( rule__BlockProcedure__CommandsAssignment_7 ) ) ( ( rule__BlockProcedure__CommandsAssignment_7 )* )
            {
            // InternalPortugolParser.g:2822:2: ( ( rule__BlockProcedure__CommandsAssignment_7 ) )
            // InternalPortugolParser.g:2823:3: ( rule__BlockProcedure__CommandsAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getCommandsAssignment_7()); 
            }
            // InternalPortugolParser.g:2824:3: ( rule__BlockProcedure__CommandsAssignment_7 )
            // InternalPortugolParser.g:2824:4: rule__BlockProcedure__CommandsAssignment_7
            {
            pushFollow(FOLLOW_19);
            rule__BlockProcedure__CommandsAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getCommandsAssignment_7()); 
            }

            }

            // InternalPortugolParser.g:2827:2: ( ( rule__BlockProcedure__CommandsAssignment_7 )* )
            // InternalPortugolParser.g:2828:3: ( rule__BlockProcedure__CommandsAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getCommandsAssignment_7()); 
            }
            // InternalPortugolParser.g:2829:3: ( rule__BlockProcedure__CommandsAssignment_7 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==Interrompa||(LA23_0>=Enquanto && LA23_0<=Escreva)||LA23_0==Retorne||LA23_0==Repita||(LA23_0>=Leia && LA23_0<=Para)||LA23_0==NOT||LA23_0==Se||LA23_0==LeftParenthesis||LA23_0==HyphenMinus||(LA23_0>=RULE_INT && LA23_0<=RULE_STRING)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalPortugolParser.g:2829:4: rule__BlockProcedure__CommandsAssignment_7
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__BlockProcedure__CommandsAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalPortugolParser.g:2838:1: rule__BlockProcedure__Group__8 : rule__BlockProcedure__Group__8__Impl ;
    public final void rule__BlockProcedure__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2842:1: ( rule__BlockProcedure__Group__8__Impl )
            // InternalPortugolParser.g:2843:2: rule__BlockProcedure__Group__8__Impl
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
    // InternalPortugolParser.g:2849:1: rule__BlockProcedure__Group__8__Impl : ( Fimprocedimento ) ;
    public final void rule__BlockProcedure__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2853:1: ( ( Fimprocedimento ) )
            // InternalPortugolParser.g:2854:1: ( Fimprocedimento )
            {
            // InternalPortugolParser.g:2854:1: ( Fimprocedimento )
            // InternalPortugolParser.g:2855:2: Fimprocedimento
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


    // $ANTLR start "rule__BlockCommand__Group__0"
    // InternalPortugolParser.g:2865:1: rule__BlockCommand__Group__0 : rule__BlockCommand__Group__0__Impl rule__BlockCommand__Group__1 ;
    public final void rule__BlockCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2869:1: ( rule__BlockCommand__Group__0__Impl rule__BlockCommand__Group__1 )
            // InternalPortugolParser.g:2870:2: rule__BlockCommand__Group__0__Impl rule__BlockCommand__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugolParser.g:2877:1: rule__BlockCommand__Group__0__Impl : ( Inicio ) ;
    public final void rule__BlockCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2881:1: ( ( Inicio ) )
            // InternalPortugolParser.g:2882:1: ( Inicio )
            {
            // InternalPortugolParser.g:2882:1: ( Inicio )
            // InternalPortugolParser.g:2883:2: Inicio
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
    // InternalPortugolParser.g:2892:1: rule__BlockCommand__Group__1 : rule__BlockCommand__Group__1__Impl rule__BlockCommand__Group__2 ;
    public final void rule__BlockCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2896:1: ( rule__BlockCommand__Group__1__Impl rule__BlockCommand__Group__2 )
            // InternalPortugolParser.g:2897:2: rule__BlockCommand__Group__1__Impl rule__BlockCommand__Group__2
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
    // InternalPortugolParser.g:2904:1: rule__BlockCommand__Group__1__Impl : ( ( ( rule__BlockCommand__CommandsAssignment_1 ) ) ( ( rule__BlockCommand__CommandsAssignment_1 )* ) ) ;
    public final void rule__BlockCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2908:1: ( ( ( ( rule__BlockCommand__CommandsAssignment_1 ) ) ( ( rule__BlockCommand__CommandsAssignment_1 )* ) ) )
            // InternalPortugolParser.g:2909:1: ( ( ( rule__BlockCommand__CommandsAssignment_1 ) ) ( ( rule__BlockCommand__CommandsAssignment_1 )* ) )
            {
            // InternalPortugolParser.g:2909:1: ( ( ( rule__BlockCommand__CommandsAssignment_1 ) ) ( ( rule__BlockCommand__CommandsAssignment_1 )* ) )
            // InternalPortugolParser.g:2910:2: ( ( rule__BlockCommand__CommandsAssignment_1 ) ) ( ( rule__BlockCommand__CommandsAssignment_1 )* )
            {
            // InternalPortugolParser.g:2910:2: ( ( rule__BlockCommand__CommandsAssignment_1 ) )
            // InternalPortugolParser.g:2911:3: ( rule__BlockCommand__CommandsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getCommandsAssignment_1()); 
            }
            // InternalPortugolParser.g:2912:3: ( rule__BlockCommand__CommandsAssignment_1 )
            // InternalPortugolParser.g:2912:4: rule__BlockCommand__CommandsAssignment_1
            {
            pushFollow(FOLLOW_19);
            rule__BlockCommand__CommandsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockCommandAccess().getCommandsAssignment_1()); 
            }

            }

            // InternalPortugolParser.g:2915:2: ( ( rule__BlockCommand__CommandsAssignment_1 )* )
            // InternalPortugolParser.g:2916:3: ( rule__BlockCommand__CommandsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getCommandsAssignment_1()); 
            }
            // InternalPortugolParser.g:2917:3: ( rule__BlockCommand__CommandsAssignment_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Interrompa||(LA24_0>=Enquanto && LA24_0<=Escreva)||LA24_0==Retorne||LA24_0==Repita||(LA24_0>=Leia && LA24_0<=Para)||LA24_0==NOT||LA24_0==Se||LA24_0==LeftParenthesis||LA24_0==HyphenMinus||(LA24_0>=RULE_INT && LA24_0<=RULE_STRING)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPortugolParser.g:2917:4: rule__BlockCommand__CommandsAssignment_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__BlockCommand__CommandsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalPortugolParser.g:2926:1: rule__BlockCommand__Group__2 : rule__BlockCommand__Group__2__Impl ;
    public final void rule__BlockCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2930:1: ( rule__BlockCommand__Group__2__Impl )
            // InternalPortugolParser.g:2931:2: rule__BlockCommand__Group__2__Impl
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
    // InternalPortugolParser.g:2937:1: rule__BlockCommand__Group__2__Impl : ( Fimalgoritmo ) ;
    public final void rule__BlockCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2941:1: ( ( Fimalgoritmo ) )
            // InternalPortugolParser.g:2942:1: ( Fimalgoritmo )
            {
            // InternalPortugolParser.g:2942:1: ( Fimalgoritmo )
            // InternalPortugolParser.g:2943:2: Fimalgoritmo
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
    // InternalPortugolParser.g:2953:1: rule__AbstractCommand__Group_0__0 : rule__AbstractCommand__Group_0__0__Impl rule__AbstractCommand__Group_0__1 ;
    public final void rule__AbstractCommand__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2957:1: ( rule__AbstractCommand__Group_0__0__Impl rule__AbstractCommand__Group_0__1 )
            // InternalPortugolParser.g:2958:2: rule__AbstractCommand__Group_0__0__Impl rule__AbstractCommand__Group_0__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalPortugolParser.g:2965:1: rule__AbstractCommand__Group_0__0__Impl : ( ruleReadCommand ) ;
    public final void rule__AbstractCommand__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2969:1: ( ( ruleReadCommand ) )
            // InternalPortugolParser.g:2970:1: ( ruleReadCommand )
            {
            // InternalPortugolParser.g:2970:1: ( ruleReadCommand )
            // InternalPortugolParser.g:2971:2: ruleReadCommand
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
    // InternalPortugolParser.g:2980:1: rule__AbstractCommand__Group_0__1 : rule__AbstractCommand__Group_0__1__Impl ;
    public final void rule__AbstractCommand__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2984:1: ( rule__AbstractCommand__Group_0__1__Impl )
            // InternalPortugolParser.g:2985:2: rule__AbstractCommand__Group_0__1__Impl
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
    // InternalPortugolParser.g:2991:1: rule__AbstractCommand__Group_0__1__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__AbstractCommand__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:2995:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugolParser.g:2996:1: ( ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:2996:1: ( ruleEND_COMMAND )
            // InternalPortugolParser.g:2997:2: ruleEND_COMMAND
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
    // InternalPortugolParser.g:3007:1: rule__AbstractCommand__Group_1__0 : rule__AbstractCommand__Group_1__0__Impl rule__AbstractCommand__Group_1__1 ;
    public final void rule__AbstractCommand__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3011:1: ( rule__AbstractCommand__Group_1__0__Impl rule__AbstractCommand__Group_1__1 )
            // InternalPortugolParser.g:3012:2: rule__AbstractCommand__Group_1__0__Impl rule__AbstractCommand__Group_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalPortugolParser.g:3019:1: rule__AbstractCommand__Group_1__0__Impl : ( ruleWriteCommand ) ;
    public final void rule__AbstractCommand__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3023:1: ( ( ruleWriteCommand ) )
            // InternalPortugolParser.g:3024:1: ( ruleWriteCommand )
            {
            // InternalPortugolParser.g:3024:1: ( ruleWriteCommand )
            // InternalPortugolParser.g:3025:2: ruleWriteCommand
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
    // InternalPortugolParser.g:3034:1: rule__AbstractCommand__Group_1__1 : rule__AbstractCommand__Group_1__1__Impl ;
    public final void rule__AbstractCommand__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3038:1: ( rule__AbstractCommand__Group_1__1__Impl )
            // InternalPortugolParser.g:3039:2: rule__AbstractCommand__Group_1__1__Impl
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
    // InternalPortugolParser.g:3045:1: rule__AbstractCommand__Group_1__1__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__AbstractCommand__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3049:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugolParser.g:3050:1: ( ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:3050:1: ( ruleEND_COMMAND )
            // InternalPortugolParser.g:3051:2: ruleEND_COMMAND
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
    // InternalPortugolParser.g:3061:1: rule__AbstractCommand__Group_2__0 : rule__AbstractCommand__Group_2__0__Impl rule__AbstractCommand__Group_2__1 ;
    public final void rule__AbstractCommand__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3065:1: ( rule__AbstractCommand__Group_2__0__Impl rule__AbstractCommand__Group_2__1 )
            // InternalPortugolParser.g:3066:2: rule__AbstractCommand__Group_2__0__Impl rule__AbstractCommand__Group_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalPortugolParser.g:3073:1: rule__AbstractCommand__Group_2__0__Impl : ( ruleExpression ) ;
    public final void rule__AbstractCommand__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3077:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:3078:1: ( ruleExpression )
            {
            // InternalPortugolParser.g:3078:1: ( ruleExpression )
            // InternalPortugolParser.g:3079:2: ruleExpression
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
    // InternalPortugolParser.g:3088:1: rule__AbstractCommand__Group_2__1 : rule__AbstractCommand__Group_2__1__Impl ;
    public final void rule__AbstractCommand__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3092:1: ( rule__AbstractCommand__Group_2__1__Impl )
            // InternalPortugolParser.g:3093:2: rule__AbstractCommand__Group_2__1__Impl
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
    // InternalPortugolParser.g:3099:1: rule__AbstractCommand__Group_2__1__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__AbstractCommand__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3103:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugolParser.g:3104:1: ( ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:3104:1: ( ruleEND_COMMAND )
            // InternalPortugolParser.g:3105:2: ruleEND_COMMAND
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
    // InternalPortugolParser.g:3115:1: rule__AbstractCommand__Group_8__0 : rule__AbstractCommand__Group_8__0__Impl rule__AbstractCommand__Group_8__1 ;
    public final void rule__AbstractCommand__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3119:1: ( rule__AbstractCommand__Group_8__0__Impl rule__AbstractCommand__Group_8__1 )
            // InternalPortugolParser.g:3120:2: rule__AbstractCommand__Group_8__0__Impl rule__AbstractCommand__Group_8__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalPortugolParser.g:3127:1: rule__AbstractCommand__Group_8__0__Impl : ( ruleBreakStatement ) ;
    public final void rule__AbstractCommand__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3131:1: ( ( ruleBreakStatement ) )
            // InternalPortugolParser.g:3132:1: ( ruleBreakStatement )
            {
            // InternalPortugolParser.g:3132:1: ( ruleBreakStatement )
            // InternalPortugolParser.g:3133:2: ruleBreakStatement
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
    // InternalPortugolParser.g:3142:1: rule__AbstractCommand__Group_8__1 : rule__AbstractCommand__Group_8__1__Impl ;
    public final void rule__AbstractCommand__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3146:1: ( rule__AbstractCommand__Group_8__1__Impl )
            // InternalPortugolParser.g:3147:2: rule__AbstractCommand__Group_8__1__Impl
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
    // InternalPortugolParser.g:3153:1: rule__AbstractCommand__Group_8__1__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__AbstractCommand__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3157:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugolParser.g:3158:1: ( ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:3158:1: ( ruleEND_COMMAND )
            // InternalPortugolParser.g:3159:2: ruleEND_COMMAND
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
    // InternalPortugolParser.g:3169:1: rule__AbstractCommand__Group_9__0 : rule__AbstractCommand__Group_9__0__Impl rule__AbstractCommand__Group_9__1 ;
    public final void rule__AbstractCommand__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3173:1: ( rule__AbstractCommand__Group_9__0__Impl rule__AbstractCommand__Group_9__1 )
            // InternalPortugolParser.g:3174:2: rule__AbstractCommand__Group_9__0__Impl rule__AbstractCommand__Group_9__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalPortugolParser.g:3181:1: rule__AbstractCommand__Group_9__0__Impl : ( ruleReturnStatement ) ;
    public final void rule__AbstractCommand__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3185:1: ( ( ruleReturnStatement ) )
            // InternalPortugolParser.g:3186:1: ( ruleReturnStatement )
            {
            // InternalPortugolParser.g:3186:1: ( ruleReturnStatement )
            // InternalPortugolParser.g:3187:2: ruleReturnStatement
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
    // InternalPortugolParser.g:3196:1: rule__AbstractCommand__Group_9__1 : rule__AbstractCommand__Group_9__1__Impl ;
    public final void rule__AbstractCommand__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3200:1: ( rule__AbstractCommand__Group_9__1__Impl )
            // InternalPortugolParser.g:3201:2: rule__AbstractCommand__Group_9__1__Impl
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
    // InternalPortugolParser.g:3207:1: rule__AbstractCommand__Group_9__1__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__AbstractCommand__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3211:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugolParser.g:3212:1: ( ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:3212:1: ( ruleEND_COMMAND )
            // InternalPortugolParser.g:3213:2: ruleEND_COMMAND
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
    // InternalPortugolParser.g:3223:1: rule__BreakStatement__Group__0 : rule__BreakStatement__Group__0__Impl rule__BreakStatement__Group__1 ;
    public final void rule__BreakStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3227:1: ( rule__BreakStatement__Group__0__Impl rule__BreakStatement__Group__1 )
            // InternalPortugolParser.g:3228:2: rule__BreakStatement__Group__0__Impl rule__BreakStatement__Group__1
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
    // InternalPortugolParser.g:3235:1: rule__BreakStatement__Group__0__Impl : ( () ) ;
    public final void rule__BreakStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3239:1: ( ( () ) )
            // InternalPortugolParser.g:3240:1: ( () )
            {
            // InternalPortugolParser.g:3240:1: ( () )
            // InternalPortugolParser.g:3241:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakStatementAccess().getBreakStatementAction_0()); 
            }
            // InternalPortugolParser.g:3242:2: ()
            // InternalPortugolParser.g:3242:3: 
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
    // InternalPortugolParser.g:3250:1: rule__BreakStatement__Group__1 : rule__BreakStatement__Group__1__Impl ;
    public final void rule__BreakStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3254:1: ( rule__BreakStatement__Group__1__Impl )
            // InternalPortugolParser.g:3255:2: rule__BreakStatement__Group__1__Impl
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
    // InternalPortugolParser.g:3261:1: rule__BreakStatement__Group__1__Impl : ( Interrompa ) ;
    public final void rule__BreakStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3265:1: ( ( Interrompa ) )
            // InternalPortugolParser.g:3266:1: ( Interrompa )
            {
            // InternalPortugolParser.g:3266:1: ( Interrompa )
            // InternalPortugolParser.g:3267:2: Interrompa
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
    // InternalPortugolParser.g:3277:1: rule__ReturnStatement__Group__0 : rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1 ;
    public final void rule__ReturnStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3281:1: ( rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1 )
            // InternalPortugolParser.g:3282:2: rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugolParser.g:3289:1: rule__ReturnStatement__Group__0__Impl : ( () ) ;
    public final void rule__ReturnStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3293:1: ( ( () ) )
            // InternalPortugolParser.g:3294:1: ( () )
            {
            // InternalPortugolParser.g:3294:1: ( () )
            // InternalPortugolParser.g:3295:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getReturnExpressionAction_0()); 
            }
            // InternalPortugolParser.g:3296:2: ()
            // InternalPortugolParser.g:3296:3: 
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
    // InternalPortugolParser.g:3304:1: rule__ReturnStatement__Group__1 : rule__ReturnStatement__Group__1__Impl rule__ReturnStatement__Group__2 ;
    public final void rule__ReturnStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3308:1: ( rule__ReturnStatement__Group__1__Impl rule__ReturnStatement__Group__2 )
            // InternalPortugolParser.g:3309:2: rule__ReturnStatement__Group__1__Impl rule__ReturnStatement__Group__2
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
    // InternalPortugolParser.g:3316:1: rule__ReturnStatement__Group__1__Impl : ( Retorne ) ;
    public final void rule__ReturnStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3320:1: ( ( Retorne ) )
            // InternalPortugolParser.g:3321:1: ( Retorne )
            {
            // InternalPortugolParser.g:3321:1: ( Retorne )
            // InternalPortugolParser.g:3322:2: Retorne
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
    // InternalPortugolParser.g:3331:1: rule__ReturnStatement__Group__2 : rule__ReturnStatement__Group__2__Impl ;
    public final void rule__ReturnStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3335:1: ( rule__ReturnStatement__Group__2__Impl )
            // InternalPortugolParser.g:3336:2: rule__ReturnStatement__Group__2__Impl
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
    // InternalPortugolParser.g:3342:1: rule__ReturnStatement__Group__2__Impl : ( ( rule__ReturnStatement__ExprAssignment_2 ) ) ;
    public final void rule__ReturnStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3346:1: ( ( ( rule__ReturnStatement__ExprAssignment_2 ) ) )
            // InternalPortugolParser.g:3347:1: ( ( rule__ReturnStatement__ExprAssignment_2 ) )
            {
            // InternalPortugolParser.g:3347:1: ( ( rule__ReturnStatement__ExprAssignment_2 ) )
            // InternalPortugolParser.g:3348:2: ( rule__ReturnStatement__ExprAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getExprAssignment_2()); 
            }
            // InternalPortugolParser.g:3349:2: ( rule__ReturnStatement__ExprAssignment_2 )
            // InternalPortugolParser.g:3349:3: rule__ReturnStatement__ExprAssignment_2
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
    // InternalPortugolParser.g:3358:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3362:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalPortugolParser.g:3363:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
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
    // InternalPortugolParser.g:3370:1: rule__IfStatement__Group__0__Impl : ( Se ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3374:1: ( ( Se ) )
            // InternalPortugolParser.g:3375:1: ( Se )
            {
            // InternalPortugolParser.g:3375:1: ( Se )
            // InternalPortugolParser.g:3376:2: Se
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
    // InternalPortugolParser.g:3385:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3389:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalPortugolParser.g:3390:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
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
    // InternalPortugolParser.g:3397:1: rule__IfStatement__Group__1__Impl : ( ( rule__IfStatement__ExprAssignment_1 ) ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3401:1: ( ( ( rule__IfStatement__ExprAssignment_1 ) ) )
            // InternalPortugolParser.g:3402:1: ( ( rule__IfStatement__ExprAssignment_1 ) )
            {
            // InternalPortugolParser.g:3402:1: ( ( rule__IfStatement__ExprAssignment_1 ) )
            // InternalPortugolParser.g:3403:2: ( rule__IfStatement__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getExprAssignment_1()); 
            }
            // InternalPortugolParser.g:3404:2: ( rule__IfStatement__ExprAssignment_1 )
            // InternalPortugolParser.g:3404:3: rule__IfStatement__ExprAssignment_1
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
    // InternalPortugolParser.g:3412:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3416:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalPortugolParser.g:3417:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugolParser.g:3424:1: rule__IfStatement__Group__2__Impl : ( Entao ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3428:1: ( ( Entao ) )
            // InternalPortugolParser.g:3429:1: ( Entao )
            {
            // InternalPortugolParser.g:3429:1: ( Entao )
            // InternalPortugolParser.g:3430:2: Entao
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
    // InternalPortugolParser.g:3439:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3443:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalPortugolParser.g:3444:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
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
    // InternalPortugolParser.g:3451:1: rule__IfStatement__Group__3__Impl : ( ( ( rule__IfStatement__CommandsAssignment_3 ) ) ( ( rule__IfStatement__CommandsAssignment_3 )* ) ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3455:1: ( ( ( ( rule__IfStatement__CommandsAssignment_3 ) ) ( ( rule__IfStatement__CommandsAssignment_3 )* ) ) )
            // InternalPortugolParser.g:3456:1: ( ( ( rule__IfStatement__CommandsAssignment_3 ) ) ( ( rule__IfStatement__CommandsAssignment_3 )* ) )
            {
            // InternalPortugolParser.g:3456:1: ( ( ( rule__IfStatement__CommandsAssignment_3 ) ) ( ( rule__IfStatement__CommandsAssignment_3 )* ) )
            // InternalPortugolParser.g:3457:2: ( ( rule__IfStatement__CommandsAssignment_3 ) ) ( ( rule__IfStatement__CommandsAssignment_3 )* )
            {
            // InternalPortugolParser.g:3457:2: ( ( rule__IfStatement__CommandsAssignment_3 ) )
            // InternalPortugolParser.g:3458:3: ( rule__IfStatement__CommandsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugolParser.g:3459:3: ( rule__IfStatement__CommandsAssignment_3 )
            // InternalPortugolParser.g:3459:4: rule__IfStatement__CommandsAssignment_3
            {
            pushFollow(FOLLOW_19);
            rule__IfStatement__CommandsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getCommandsAssignment_3()); 
            }

            }

            // InternalPortugolParser.g:3462:2: ( ( rule__IfStatement__CommandsAssignment_3 )* )
            // InternalPortugolParser.g:3463:3: ( rule__IfStatement__CommandsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugolParser.g:3464:3: ( rule__IfStatement__CommandsAssignment_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==Interrompa||(LA25_0>=Enquanto && LA25_0<=Escreva)||LA25_0==Retorne||LA25_0==Repita||(LA25_0>=Leia && LA25_0<=Para)||LA25_0==NOT||LA25_0==Se||LA25_0==LeftParenthesis||LA25_0==HyphenMinus||(LA25_0>=RULE_INT && LA25_0<=RULE_STRING)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPortugolParser.g:3464:4: rule__IfStatement__CommandsAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__IfStatement__CommandsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalPortugolParser.g:3473:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3477:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalPortugolParser.g:3478:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
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
    // InternalPortugolParser.g:3485:1: rule__IfStatement__Group__4__Impl : ( ( rule__IfStatement__Group_4__0 )? ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3489:1: ( ( ( rule__IfStatement__Group_4__0 )? ) )
            // InternalPortugolParser.g:3490:1: ( ( rule__IfStatement__Group_4__0 )? )
            {
            // InternalPortugolParser.g:3490:1: ( ( rule__IfStatement__Group_4__0 )? )
            // InternalPortugolParser.g:3491:2: ( rule__IfStatement__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup_4()); 
            }
            // InternalPortugolParser.g:3492:2: ( rule__IfStatement__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Senao) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPortugolParser.g:3492:3: rule__IfStatement__Group_4__0
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
    // InternalPortugolParser.g:3500:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3504:1: ( rule__IfStatement__Group__5__Impl )
            // InternalPortugolParser.g:3505:2: rule__IfStatement__Group__5__Impl
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
    // InternalPortugolParser.g:3511:1: rule__IfStatement__Group__5__Impl : ( Fimse ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3515:1: ( ( Fimse ) )
            // InternalPortugolParser.g:3516:1: ( Fimse )
            {
            // InternalPortugolParser.g:3516:1: ( Fimse )
            // InternalPortugolParser.g:3517:2: Fimse
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
    // InternalPortugolParser.g:3527:1: rule__IfStatement__Group_4__0 : rule__IfStatement__Group_4__0__Impl rule__IfStatement__Group_4__1 ;
    public final void rule__IfStatement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3531:1: ( rule__IfStatement__Group_4__0__Impl rule__IfStatement__Group_4__1 )
            // InternalPortugolParser.g:3532:2: rule__IfStatement__Group_4__0__Impl rule__IfStatement__Group_4__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugolParser.g:3539:1: rule__IfStatement__Group_4__0__Impl : ( Senao ) ;
    public final void rule__IfStatement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3543:1: ( ( Senao ) )
            // InternalPortugolParser.g:3544:1: ( Senao )
            {
            // InternalPortugolParser.g:3544:1: ( Senao )
            // InternalPortugolParser.g:3545:2: Senao
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
    // InternalPortugolParser.g:3554:1: rule__IfStatement__Group_4__1 : rule__IfStatement__Group_4__1__Impl ;
    public final void rule__IfStatement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3558:1: ( rule__IfStatement__Group_4__1__Impl )
            // InternalPortugolParser.g:3559:2: rule__IfStatement__Group_4__1__Impl
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
    // InternalPortugolParser.g:3565:1: rule__IfStatement__Group_4__1__Impl : ( ( ( rule__IfStatement__ElseCommandsAssignment_4_1 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_4_1 )* ) ) ;
    public final void rule__IfStatement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3569:1: ( ( ( ( rule__IfStatement__ElseCommandsAssignment_4_1 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_4_1 )* ) ) )
            // InternalPortugolParser.g:3570:1: ( ( ( rule__IfStatement__ElseCommandsAssignment_4_1 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_4_1 )* ) )
            {
            // InternalPortugolParser.g:3570:1: ( ( ( rule__IfStatement__ElseCommandsAssignment_4_1 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_4_1 )* ) )
            // InternalPortugolParser.g:3571:2: ( ( rule__IfStatement__ElseCommandsAssignment_4_1 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_4_1 )* )
            {
            // InternalPortugolParser.g:3571:2: ( ( rule__IfStatement__ElseCommandsAssignment_4_1 ) )
            // InternalPortugolParser.g:3572:3: ( rule__IfStatement__ElseCommandsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseCommandsAssignment_4_1()); 
            }
            // InternalPortugolParser.g:3573:3: ( rule__IfStatement__ElseCommandsAssignment_4_1 )
            // InternalPortugolParser.g:3573:4: rule__IfStatement__ElseCommandsAssignment_4_1
            {
            pushFollow(FOLLOW_19);
            rule__IfStatement__ElseCommandsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseCommandsAssignment_4_1()); 
            }

            }

            // InternalPortugolParser.g:3576:2: ( ( rule__IfStatement__ElseCommandsAssignment_4_1 )* )
            // InternalPortugolParser.g:3577:3: ( rule__IfStatement__ElseCommandsAssignment_4_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseCommandsAssignment_4_1()); 
            }
            // InternalPortugolParser.g:3578:3: ( rule__IfStatement__ElseCommandsAssignment_4_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Interrompa||(LA27_0>=Enquanto && LA27_0<=Escreva)||LA27_0==Retorne||LA27_0==Repita||(LA27_0>=Leia && LA27_0<=Para)||LA27_0==NOT||LA27_0==Se||LA27_0==LeftParenthesis||LA27_0==HyphenMinus||(LA27_0>=RULE_INT && LA27_0<=RULE_STRING)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPortugolParser.g:3578:4: rule__IfStatement__ElseCommandsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__IfStatement__ElseCommandsAssignment_4_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalPortugolParser.g:3588:1: rule__SwitchCaseStatement__Group__0 : rule__SwitchCaseStatement__Group__0__Impl rule__SwitchCaseStatement__Group__1 ;
    public final void rule__SwitchCaseStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3592:1: ( rule__SwitchCaseStatement__Group__0__Impl rule__SwitchCaseStatement__Group__1 )
            // InternalPortugolParser.g:3593:2: rule__SwitchCaseStatement__Group__0__Impl rule__SwitchCaseStatement__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalPortugolParser.g:3600:1: rule__SwitchCaseStatement__Group__0__Impl : ( Escolha ) ;
    public final void rule__SwitchCaseStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3604:1: ( ( Escolha ) )
            // InternalPortugolParser.g:3605:1: ( Escolha )
            {
            // InternalPortugolParser.g:3605:1: ( Escolha )
            // InternalPortugolParser.g:3606:2: Escolha
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
    // InternalPortugolParser.g:3615:1: rule__SwitchCaseStatement__Group__1 : rule__SwitchCaseStatement__Group__1__Impl rule__SwitchCaseStatement__Group__2 ;
    public final void rule__SwitchCaseStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3619:1: ( rule__SwitchCaseStatement__Group__1__Impl rule__SwitchCaseStatement__Group__2 )
            // InternalPortugolParser.g:3620:2: rule__SwitchCaseStatement__Group__1__Impl rule__SwitchCaseStatement__Group__2
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
    // InternalPortugolParser.g:3627:1: rule__SwitchCaseStatement__Group__1__Impl : ( ( rule__SwitchCaseStatement__VariableAssignment_1 ) ) ;
    public final void rule__SwitchCaseStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3631:1: ( ( ( rule__SwitchCaseStatement__VariableAssignment_1 ) ) )
            // InternalPortugolParser.g:3632:1: ( ( rule__SwitchCaseStatement__VariableAssignment_1 ) )
            {
            // InternalPortugolParser.g:3632:1: ( ( rule__SwitchCaseStatement__VariableAssignment_1 ) )
            // InternalPortugolParser.g:3633:2: ( rule__SwitchCaseStatement__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getVariableAssignment_1()); 
            }
            // InternalPortugolParser.g:3634:2: ( rule__SwitchCaseStatement__VariableAssignment_1 )
            // InternalPortugolParser.g:3634:3: rule__SwitchCaseStatement__VariableAssignment_1
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
    // InternalPortugolParser.g:3642:1: rule__SwitchCaseStatement__Group__2 : rule__SwitchCaseStatement__Group__2__Impl rule__SwitchCaseStatement__Group__3 ;
    public final void rule__SwitchCaseStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3646:1: ( rule__SwitchCaseStatement__Group__2__Impl rule__SwitchCaseStatement__Group__3 )
            // InternalPortugolParser.g:3647:2: rule__SwitchCaseStatement__Group__2__Impl rule__SwitchCaseStatement__Group__3
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
    // InternalPortugolParser.g:3654:1: rule__SwitchCaseStatement__Group__2__Impl : ( ( ( rule__SwitchCaseStatement__CaseListAssignment_2 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_2 )* ) ) ;
    public final void rule__SwitchCaseStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3658:1: ( ( ( ( rule__SwitchCaseStatement__CaseListAssignment_2 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_2 )* ) ) )
            // InternalPortugolParser.g:3659:1: ( ( ( rule__SwitchCaseStatement__CaseListAssignment_2 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_2 )* ) )
            {
            // InternalPortugolParser.g:3659:1: ( ( ( rule__SwitchCaseStatement__CaseListAssignment_2 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_2 )* ) )
            // InternalPortugolParser.g:3660:2: ( ( rule__SwitchCaseStatement__CaseListAssignment_2 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_2 )* )
            {
            // InternalPortugolParser.g:3660:2: ( ( rule__SwitchCaseStatement__CaseListAssignment_2 ) )
            // InternalPortugolParser.g:3661:3: ( rule__SwitchCaseStatement__CaseListAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getCaseListAssignment_2()); 
            }
            // InternalPortugolParser.g:3662:3: ( rule__SwitchCaseStatement__CaseListAssignment_2 )
            // InternalPortugolParser.g:3662:4: rule__SwitchCaseStatement__CaseListAssignment_2
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

            // InternalPortugolParser.g:3665:2: ( ( rule__SwitchCaseStatement__CaseListAssignment_2 )* )
            // InternalPortugolParser.g:3666:3: ( rule__SwitchCaseStatement__CaseListAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getCaseListAssignment_2()); 
            }
            // InternalPortugolParser.g:3667:3: ( rule__SwitchCaseStatement__CaseListAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==Caso) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalPortugolParser.g:3667:4: rule__SwitchCaseStatement__CaseListAssignment_2
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__SwitchCaseStatement__CaseListAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalPortugolParser.g:3676:1: rule__SwitchCaseStatement__Group__3 : rule__SwitchCaseStatement__Group__3__Impl rule__SwitchCaseStatement__Group__4 ;
    public final void rule__SwitchCaseStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3680:1: ( rule__SwitchCaseStatement__Group__3__Impl rule__SwitchCaseStatement__Group__4 )
            // InternalPortugolParser.g:3681:2: rule__SwitchCaseStatement__Group__3__Impl rule__SwitchCaseStatement__Group__4
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
    // InternalPortugolParser.g:3688:1: rule__SwitchCaseStatement__Group__3__Impl : ( ( rule__SwitchCaseStatement__OtherCaseAssignment_3 )? ) ;
    public final void rule__SwitchCaseStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3692:1: ( ( ( rule__SwitchCaseStatement__OtherCaseAssignment_3 )? ) )
            // InternalPortugolParser.g:3693:1: ( ( rule__SwitchCaseStatement__OtherCaseAssignment_3 )? )
            {
            // InternalPortugolParser.g:3693:1: ( ( rule__SwitchCaseStatement__OtherCaseAssignment_3 )? )
            // InternalPortugolParser.g:3694:2: ( rule__SwitchCaseStatement__OtherCaseAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getOtherCaseAssignment_3()); 
            }
            // InternalPortugolParser.g:3695:2: ( rule__SwitchCaseStatement__OtherCaseAssignment_3 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Outrocaso) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPortugolParser.g:3695:3: rule__SwitchCaseStatement__OtherCaseAssignment_3
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
    // InternalPortugolParser.g:3703:1: rule__SwitchCaseStatement__Group__4 : rule__SwitchCaseStatement__Group__4__Impl ;
    public final void rule__SwitchCaseStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3707:1: ( rule__SwitchCaseStatement__Group__4__Impl )
            // InternalPortugolParser.g:3708:2: rule__SwitchCaseStatement__Group__4__Impl
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
    // InternalPortugolParser.g:3714:1: rule__SwitchCaseStatement__Group__4__Impl : ( Fimescolha ) ;
    public final void rule__SwitchCaseStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3718:1: ( ( Fimescolha ) )
            // InternalPortugolParser.g:3719:1: ( Fimescolha )
            {
            // InternalPortugolParser.g:3719:1: ( Fimescolha )
            // InternalPortugolParser.g:3720:2: Fimescolha
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
    // InternalPortugolParser.g:3730:1: rule__CaseList__Group__0 : rule__CaseList__Group__0__Impl rule__CaseList__Group__1 ;
    public final void rule__CaseList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3734:1: ( rule__CaseList__Group__0__Impl rule__CaseList__Group__1 )
            // InternalPortugolParser.g:3735:2: rule__CaseList__Group__0__Impl rule__CaseList__Group__1
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
    // InternalPortugolParser.g:3742:1: rule__CaseList__Group__0__Impl : ( Caso ) ;
    public final void rule__CaseList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3746:1: ( ( Caso ) )
            // InternalPortugolParser.g:3747:1: ( Caso )
            {
            // InternalPortugolParser.g:3747:1: ( Caso )
            // InternalPortugolParser.g:3748:2: Caso
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
    // InternalPortugolParser.g:3757:1: rule__CaseList__Group__1 : rule__CaseList__Group__1__Impl rule__CaseList__Group__2 ;
    public final void rule__CaseList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3761:1: ( rule__CaseList__Group__1__Impl rule__CaseList__Group__2 )
            // InternalPortugolParser.g:3762:2: rule__CaseList__Group__1__Impl rule__CaseList__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalPortugolParser.g:3769:1: rule__CaseList__Group__1__Impl : ( ( rule__CaseList__ExprAssignment_1 ) ) ;
    public final void rule__CaseList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3773:1: ( ( ( rule__CaseList__ExprAssignment_1 ) ) )
            // InternalPortugolParser.g:3774:1: ( ( rule__CaseList__ExprAssignment_1 ) )
            {
            // InternalPortugolParser.g:3774:1: ( ( rule__CaseList__ExprAssignment_1 ) )
            // InternalPortugolParser.g:3775:2: ( rule__CaseList__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getExprAssignment_1()); 
            }
            // InternalPortugolParser.g:3776:2: ( rule__CaseList__ExprAssignment_1 )
            // InternalPortugolParser.g:3776:3: rule__CaseList__ExprAssignment_1
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
    // InternalPortugolParser.g:3784:1: rule__CaseList__Group__2 : rule__CaseList__Group__2__Impl rule__CaseList__Group__3 ;
    public final void rule__CaseList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3788:1: ( rule__CaseList__Group__2__Impl rule__CaseList__Group__3 )
            // InternalPortugolParser.g:3789:2: rule__CaseList__Group__2__Impl rule__CaseList__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugolParser.g:3796:1: rule__CaseList__Group__2__Impl : ( Colon ) ;
    public final void rule__CaseList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3800:1: ( ( Colon ) )
            // InternalPortugolParser.g:3801:1: ( Colon )
            {
            // InternalPortugolParser.g:3801:1: ( Colon )
            // InternalPortugolParser.g:3802:2: Colon
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
    // InternalPortugolParser.g:3811:1: rule__CaseList__Group__3 : rule__CaseList__Group__3__Impl ;
    public final void rule__CaseList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3815:1: ( rule__CaseList__Group__3__Impl )
            // InternalPortugolParser.g:3816:2: rule__CaseList__Group__3__Impl
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
    // InternalPortugolParser.g:3822:1: rule__CaseList__Group__3__Impl : ( ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* ) ) ;
    public final void rule__CaseList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3826:1: ( ( ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* ) ) )
            // InternalPortugolParser.g:3827:1: ( ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* ) )
            {
            // InternalPortugolParser.g:3827:1: ( ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* ) )
            // InternalPortugolParser.g:3828:2: ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* )
            {
            // InternalPortugolParser.g:3828:2: ( ( rule__CaseList__CommandsAssignment_3 ) )
            // InternalPortugolParser.g:3829:3: ( rule__CaseList__CommandsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugolParser.g:3830:3: ( rule__CaseList__CommandsAssignment_3 )
            // InternalPortugolParser.g:3830:4: rule__CaseList__CommandsAssignment_3
            {
            pushFollow(FOLLOW_19);
            rule__CaseList__CommandsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseListAccess().getCommandsAssignment_3()); 
            }

            }

            // InternalPortugolParser.g:3833:2: ( ( rule__CaseList__CommandsAssignment_3 )* )
            // InternalPortugolParser.g:3834:3: ( rule__CaseList__CommandsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugolParser.g:3835:3: ( rule__CaseList__CommandsAssignment_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==Interrompa||(LA30_0>=Enquanto && LA30_0<=Escreva)||LA30_0==Retorne||LA30_0==Repita||(LA30_0>=Leia && LA30_0<=Para)||LA30_0==NOT||LA30_0==Se||LA30_0==LeftParenthesis||LA30_0==HyphenMinus||(LA30_0>=RULE_INT && LA30_0<=RULE_STRING)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPortugolParser.g:3835:4: rule__CaseList__CommandsAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__CaseList__CommandsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalPortugolParser.g:3845:1: rule__OtherCase__Group__0 : rule__OtherCase__Group__0__Impl rule__OtherCase__Group__1 ;
    public final void rule__OtherCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3849:1: ( rule__OtherCase__Group__0__Impl rule__OtherCase__Group__1 )
            // InternalPortugolParser.g:3850:2: rule__OtherCase__Group__0__Impl rule__OtherCase__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalPortugolParser.g:3857:1: rule__OtherCase__Group__0__Impl : ( Outrocaso ) ;
    public final void rule__OtherCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3861:1: ( ( Outrocaso ) )
            // InternalPortugolParser.g:3862:1: ( Outrocaso )
            {
            // InternalPortugolParser.g:3862:1: ( Outrocaso )
            // InternalPortugolParser.g:3863:2: Outrocaso
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
    // InternalPortugolParser.g:3872:1: rule__OtherCase__Group__1 : rule__OtherCase__Group__1__Impl rule__OtherCase__Group__2 ;
    public final void rule__OtherCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3876:1: ( rule__OtherCase__Group__1__Impl rule__OtherCase__Group__2 )
            // InternalPortugolParser.g:3877:2: rule__OtherCase__Group__1__Impl rule__OtherCase__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugolParser.g:3884:1: rule__OtherCase__Group__1__Impl : ( Colon ) ;
    public final void rule__OtherCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3888:1: ( ( Colon ) )
            // InternalPortugolParser.g:3889:1: ( Colon )
            {
            // InternalPortugolParser.g:3889:1: ( Colon )
            // InternalPortugolParser.g:3890:2: Colon
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
    // InternalPortugolParser.g:3899:1: rule__OtherCase__Group__2 : rule__OtherCase__Group__2__Impl ;
    public final void rule__OtherCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3903:1: ( rule__OtherCase__Group__2__Impl )
            // InternalPortugolParser.g:3904:2: rule__OtherCase__Group__2__Impl
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
    // InternalPortugolParser.g:3910:1: rule__OtherCase__Group__2__Impl : ( ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* ) ) ;
    public final void rule__OtherCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3914:1: ( ( ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* ) ) )
            // InternalPortugolParser.g:3915:1: ( ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* ) )
            {
            // InternalPortugolParser.g:3915:1: ( ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* ) )
            // InternalPortugolParser.g:3916:2: ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* )
            {
            // InternalPortugolParser.g:3916:2: ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) )
            // InternalPortugolParser.g:3917:3: ( rule__OtherCase__OtherCaseCommandsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getOtherCaseCommandsAssignment_2()); 
            }
            // InternalPortugolParser.g:3918:3: ( rule__OtherCase__OtherCaseCommandsAssignment_2 )
            // InternalPortugolParser.g:3918:4: rule__OtherCase__OtherCaseCommandsAssignment_2
            {
            pushFollow(FOLLOW_19);
            rule__OtherCase__OtherCaseCommandsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherCaseAccess().getOtherCaseCommandsAssignment_2()); 
            }

            }

            // InternalPortugolParser.g:3921:2: ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* )
            // InternalPortugolParser.g:3922:3: ( rule__OtherCase__OtherCaseCommandsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getOtherCaseCommandsAssignment_2()); 
            }
            // InternalPortugolParser.g:3923:3: ( rule__OtherCase__OtherCaseCommandsAssignment_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==Interrompa||(LA31_0>=Enquanto && LA31_0<=Escreva)||LA31_0==Retorne||LA31_0==Repita||(LA31_0>=Leia && LA31_0<=Para)||LA31_0==NOT||LA31_0==Se||LA31_0==LeftParenthesis||LA31_0==HyphenMinus||(LA31_0>=RULE_INT && LA31_0<=RULE_STRING)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalPortugolParser.g:3923:4: rule__OtherCase__OtherCaseCommandsAssignment_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__OtherCase__OtherCaseCommandsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalPortugolParser.g:3933:1: rule__ForStatement__Group__0 : rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1 ;
    public final void rule__ForStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3937:1: ( rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1 )
            // InternalPortugolParser.g:3938:2: rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1
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
    // InternalPortugolParser.g:3945:1: rule__ForStatement__Group__0__Impl : ( Para ) ;
    public final void rule__ForStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3949:1: ( ( Para ) )
            // InternalPortugolParser.g:3950:1: ( Para )
            {
            // InternalPortugolParser.g:3950:1: ( Para )
            // InternalPortugolParser.g:3951:2: Para
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
    // InternalPortugolParser.g:3960:1: rule__ForStatement__Group__1 : rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2 ;
    public final void rule__ForStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3964:1: ( rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2 )
            // InternalPortugolParser.g:3965:2: rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2
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
    // InternalPortugolParser.g:3972:1: rule__ForStatement__Group__1__Impl : ( ( rule__ForStatement__OperatorExprAssignment_1 ) ) ;
    public final void rule__ForStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3976:1: ( ( ( rule__ForStatement__OperatorExprAssignment_1 ) ) )
            // InternalPortugolParser.g:3977:1: ( ( rule__ForStatement__OperatorExprAssignment_1 ) )
            {
            // InternalPortugolParser.g:3977:1: ( ( rule__ForStatement__OperatorExprAssignment_1 ) )
            // InternalPortugolParser.g:3978:2: ( rule__ForStatement__OperatorExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getOperatorExprAssignment_1()); 
            }
            // InternalPortugolParser.g:3979:2: ( rule__ForStatement__OperatorExprAssignment_1 )
            // InternalPortugolParser.g:3979:3: rule__ForStatement__OperatorExprAssignment_1
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
    // InternalPortugolParser.g:3987:1: rule__ForStatement__Group__2 : rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3 ;
    public final void rule__ForStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:3991:1: ( rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3 )
            // InternalPortugolParser.g:3992:2: rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3
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
    // InternalPortugolParser.g:3999:1: rule__ForStatement__Group__2__Impl : ( De ) ;
    public final void rule__ForStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4003:1: ( ( De ) )
            // InternalPortugolParser.g:4004:1: ( De )
            {
            // InternalPortugolParser.g:4004:1: ( De )
            // InternalPortugolParser.g:4005:2: De
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
    // InternalPortugolParser.g:4014:1: rule__ForStatement__Group__3 : rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4 ;
    public final void rule__ForStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4018:1: ( rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4 )
            // InternalPortugolParser.g:4019:2: rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4
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
    // InternalPortugolParser.g:4026:1: rule__ForStatement__Group__3__Impl : ( ( rule__ForStatement__StartExprAssignment_3 ) ) ;
    public final void rule__ForStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4030:1: ( ( ( rule__ForStatement__StartExprAssignment_3 ) ) )
            // InternalPortugolParser.g:4031:1: ( ( rule__ForStatement__StartExprAssignment_3 ) )
            {
            // InternalPortugolParser.g:4031:1: ( ( rule__ForStatement__StartExprAssignment_3 ) )
            // InternalPortugolParser.g:4032:2: ( rule__ForStatement__StartExprAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getStartExprAssignment_3()); 
            }
            // InternalPortugolParser.g:4033:2: ( rule__ForStatement__StartExprAssignment_3 )
            // InternalPortugolParser.g:4033:3: rule__ForStatement__StartExprAssignment_3
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
    // InternalPortugolParser.g:4041:1: rule__ForStatement__Group__4 : rule__ForStatement__Group__4__Impl rule__ForStatement__Group__5 ;
    public final void rule__ForStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4045:1: ( rule__ForStatement__Group__4__Impl rule__ForStatement__Group__5 )
            // InternalPortugolParser.g:4046:2: rule__ForStatement__Group__4__Impl rule__ForStatement__Group__5
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
    // InternalPortugolParser.g:4053:1: rule__ForStatement__Group__4__Impl : ( Ate ) ;
    public final void rule__ForStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4057:1: ( ( Ate ) )
            // InternalPortugolParser.g:4058:1: ( Ate )
            {
            // InternalPortugolParser.g:4058:1: ( Ate )
            // InternalPortugolParser.g:4059:2: Ate
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
    // InternalPortugolParser.g:4068:1: rule__ForStatement__Group__5 : rule__ForStatement__Group__5__Impl rule__ForStatement__Group__6 ;
    public final void rule__ForStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4072:1: ( rule__ForStatement__Group__5__Impl rule__ForStatement__Group__6 )
            // InternalPortugolParser.g:4073:2: rule__ForStatement__Group__5__Impl rule__ForStatement__Group__6
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
    // InternalPortugolParser.g:4080:1: rule__ForStatement__Group__5__Impl : ( ( rule__ForStatement__EndExprAssignment_5 ) ) ;
    public final void rule__ForStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4084:1: ( ( ( rule__ForStatement__EndExprAssignment_5 ) ) )
            // InternalPortugolParser.g:4085:1: ( ( rule__ForStatement__EndExprAssignment_5 ) )
            {
            // InternalPortugolParser.g:4085:1: ( ( rule__ForStatement__EndExprAssignment_5 ) )
            // InternalPortugolParser.g:4086:2: ( rule__ForStatement__EndExprAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getEndExprAssignment_5()); 
            }
            // InternalPortugolParser.g:4087:2: ( rule__ForStatement__EndExprAssignment_5 )
            // InternalPortugolParser.g:4087:3: rule__ForStatement__EndExprAssignment_5
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
    // InternalPortugolParser.g:4095:1: rule__ForStatement__Group__6 : rule__ForStatement__Group__6__Impl rule__ForStatement__Group__7 ;
    public final void rule__ForStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4099:1: ( rule__ForStatement__Group__6__Impl rule__ForStatement__Group__7 )
            // InternalPortugolParser.g:4100:2: rule__ForStatement__Group__6__Impl rule__ForStatement__Group__7
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
    // InternalPortugolParser.g:4107:1: rule__ForStatement__Group__6__Impl : ( ( rule__ForStatement__Group_6__0 )? ) ;
    public final void rule__ForStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4111:1: ( ( ( rule__ForStatement__Group_6__0 )? ) )
            // InternalPortugolParser.g:4112:1: ( ( rule__ForStatement__Group_6__0 )? )
            {
            // InternalPortugolParser.g:4112:1: ( ( rule__ForStatement__Group_6__0 )? )
            // InternalPortugolParser.g:4113:2: ( rule__ForStatement__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getGroup_6()); 
            }
            // InternalPortugolParser.g:4114:2: ( rule__ForStatement__Group_6__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Passo) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPortugolParser.g:4114:3: rule__ForStatement__Group_6__0
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
    // InternalPortugolParser.g:4122:1: rule__ForStatement__Group__7 : rule__ForStatement__Group__7__Impl rule__ForStatement__Group__8 ;
    public final void rule__ForStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4126:1: ( rule__ForStatement__Group__7__Impl rule__ForStatement__Group__8 )
            // InternalPortugolParser.g:4127:2: rule__ForStatement__Group__7__Impl rule__ForStatement__Group__8
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugolParser.g:4134:1: rule__ForStatement__Group__7__Impl : ( Faca ) ;
    public final void rule__ForStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4138:1: ( ( Faca ) )
            // InternalPortugolParser.g:4139:1: ( Faca )
            {
            // InternalPortugolParser.g:4139:1: ( Faca )
            // InternalPortugolParser.g:4140:2: Faca
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
    // InternalPortugolParser.g:4149:1: rule__ForStatement__Group__8 : rule__ForStatement__Group__8__Impl rule__ForStatement__Group__9 ;
    public final void rule__ForStatement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4153:1: ( rule__ForStatement__Group__8__Impl rule__ForStatement__Group__9 )
            // InternalPortugolParser.g:4154:2: rule__ForStatement__Group__8__Impl rule__ForStatement__Group__9
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
    // InternalPortugolParser.g:4161:1: rule__ForStatement__Group__8__Impl : ( ( ( rule__ForStatement__CommandsAssignment_8 ) ) ( ( rule__ForStatement__CommandsAssignment_8 )* ) ) ;
    public final void rule__ForStatement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4165:1: ( ( ( ( rule__ForStatement__CommandsAssignment_8 ) ) ( ( rule__ForStatement__CommandsAssignment_8 )* ) ) )
            // InternalPortugolParser.g:4166:1: ( ( ( rule__ForStatement__CommandsAssignment_8 ) ) ( ( rule__ForStatement__CommandsAssignment_8 )* ) )
            {
            // InternalPortugolParser.g:4166:1: ( ( ( rule__ForStatement__CommandsAssignment_8 ) ) ( ( rule__ForStatement__CommandsAssignment_8 )* ) )
            // InternalPortugolParser.g:4167:2: ( ( rule__ForStatement__CommandsAssignment_8 ) ) ( ( rule__ForStatement__CommandsAssignment_8 )* )
            {
            // InternalPortugolParser.g:4167:2: ( ( rule__ForStatement__CommandsAssignment_8 ) )
            // InternalPortugolParser.g:4168:3: ( rule__ForStatement__CommandsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getCommandsAssignment_8()); 
            }
            // InternalPortugolParser.g:4169:3: ( rule__ForStatement__CommandsAssignment_8 )
            // InternalPortugolParser.g:4169:4: rule__ForStatement__CommandsAssignment_8
            {
            pushFollow(FOLLOW_19);
            rule__ForStatement__CommandsAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getCommandsAssignment_8()); 
            }

            }

            // InternalPortugolParser.g:4172:2: ( ( rule__ForStatement__CommandsAssignment_8 )* )
            // InternalPortugolParser.g:4173:3: ( rule__ForStatement__CommandsAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getCommandsAssignment_8()); 
            }
            // InternalPortugolParser.g:4174:3: ( rule__ForStatement__CommandsAssignment_8 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==Interrompa||(LA33_0>=Enquanto && LA33_0<=Escreva)||LA33_0==Retorne||LA33_0==Repita||(LA33_0>=Leia && LA33_0<=Para)||LA33_0==NOT||LA33_0==Se||LA33_0==LeftParenthesis||LA33_0==HyphenMinus||(LA33_0>=RULE_INT && LA33_0<=RULE_STRING)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPortugolParser.g:4174:4: rule__ForStatement__CommandsAssignment_8
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ForStatement__CommandsAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalPortugolParser.g:4183:1: rule__ForStatement__Group__9 : rule__ForStatement__Group__9__Impl ;
    public final void rule__ForStatement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4187:1: ( rule__ForStatement__Group__9__Impl )
            // InternalPortugolParser.g:4188:2: rule__ForStatement__Group__9__Impl
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
    // InternalPortugolParser.g:4194:1: rule__ForStatement__Group__9__Impl : ( Fimpara ) ;
    public final void rule__ForStatement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4198:1: ( ( Fimpara ) )
            // InternalPortugolParser.g:4199:1: ( Fimpara )
            {
            // InternalPortugolParser.g:4199:1: ( Fimpara )
            // InternalPortugolParser.g:4200:2: Fimpara
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
    // InternalPortugolParser.g:4210:1: rule__ForStatement__Group_6__0 : rule__ForStatement__Group_6__0__Impl rule__ForStatement__Group_6__1 ;
    public final void rule__ForStatement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4214:1: ( rule__ForStatement__Group_6__0__Impl rule__ForStatement__Group_6__1 )
            // InternalPortugolParser.g:4215:2: rule__ForStatement__Group_6__0__Impl rule__ForStatement__Group_6__1
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
    // InternalPortugolParser.g:4222:1: rule__ForStatement__Group_6__0__Impl : ( Passo ) ;
    public final void rule__ForStatement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4226:1: ( ( Passo ) )
            // InternalPortugolParser.g:4227:1: ( Passo )
            {
            // InternalPortugolParser.g:4227:1: ( Passo )
            // InternalPortugolParser.g:4228:2: Passo
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
    // InternalPortugolParser.g:4237:1: rule__ForStatement__Group_6__1 : rule__ForStatement__Group_6__1__Impl ;
    public final void rule__ForStatement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4241:1: ( rule__ForStatement__Group_6__1__Impl )
            // InternalPortugolParser.g:4242:2: rule__ForStatement__Group_6__1__Impl
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
    // InternalPortugolParser.g:4248:1: rule__ForStatement__Group_6__1__Impl : ( ( rule__ForStatement__StepExpeAssignment_6_1 ) ) ;
    public final void rule__ForStatement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4252:1: ( ( ( rule__ForStatement__StepExpeAssignment_6_1 ) ) )
            // InternalPortugolParser.g:4253:1: ( ( rule__ForStatement__StepExpeAssignment_6_1 ) )
            {
            // InternalPortugolParser.g:4253:1: ( ( rule__ForStatement__StepExpeAssignment_6_1 ) )
            // InternalPortugolParser.g:4254:2: ( rule__ForStatement__StepExpeAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getStepExpeAssignment_6_1()); 
            }
            // InternalPortugolParser.g:4255:2: ( rule__ForStatement__StepExpeAssignment_6_1 )
            // InternalPortugolParser.g:4255:3: rule__ForStatement__StepExpeAssignment_6_1
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
    // InternalPortugolParser.g:4264:1: rule__WhileStatement__Group__0 : rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 ;
    public final void rule__WhileStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4268:1: ( rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 )
            // InternalPortugolParser.g:4269:2: rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1
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
    // InternalPortugolParser.g:4276:1: rule__WhileStatement__Group__0__Impl : ( Enquanto ) ;
    public final void rule__WhileStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4280:1: ( ( Enquanto ) )
            // InternalPortugolParser.g:4281:1: ( Enquanto )
            {
            // InternalPortugolParser.g:4281:1: ( Enquanto )
            // InternalPortugolParser.g:4282:2: Enquanto
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
    // InternalPortugolParser.g:4291:1: rule__WhileStatement__Group__1 : rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 ;
    public final void rule__WhileStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4295:1: ( rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 )
            // InternalPortugolParser.g:4296:2: rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2
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
    // InternalPortugolParser.g:4303:1: rule__WhileStatement__Group__1__Impl : ( ( rule__WhileStatement__WhileExprAssignment_1 ) ) ;
    public final void rule__WhileStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4307:1: ( ( ( rule__WhileStatement__WhileExprAssignment_1 ) ) )
            // InternalPortugolParser.g:4308:1: ( ( rule__WhileStatement__WhileExprAssignment_1 ) )
            {
            // InternalPortugolParser.g:4308:1: ( ( rule__WhileStatement__WhileExprAssignment_1 ) )
            // InternalPortugolParser.g:4309:2: ( rule__WhileStatement__WhileExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getWhileExprAssignment_1()); 
            }
            // InternalPortugolParser.g:4310:2: ( rule__WhileStatement__WhileExprAssignment_1 )
            // InternalPortugolParser.g:4310:3: rule__WhileStatement__WhileExprAssignment_1
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
    // InternalPortugolParser.g:4318:1: rule__WhileStatement__Group__2 : rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 ;
    public final void rule__WhileStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4322:1: ( rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 )
            // InternalPortugolParser.g:4323:2: rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugolParser.g:4330:1: rule__WhileStatement__Group__2__Impl : ( Faca ) ;
    public final void rule__WhileStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4334:1: ( ( Faca ) )
            // InternalPortugolParser.g:4335:1: ( Faca )
            {
            // InternalPortugolParser.g:4335:1: ( Faca )
            // InternalPortugolParser.g:4336:2: Faca
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
    // InternalPortugolParser.g:4345:1: rule__WhileStatement__Group__3 : rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 ;
    public final void rule__WhileStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4349:1: ( rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 )
            // InternalPortugolParser.g:4350:2: rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4
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
    // InternalPortugolParser.g:4357:1: rule__WhileStatement__Group__3__Impl : ( ( ( rule__WhileStatement__CommandsAssignment_3 ) ) ( ( rule__WhileStatement__CommandsAssignment_3 )* ) ) ;
    public final void rule__WhileStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4361:1: ( ( ( ( rule__WhileStatement__CommandsAssignment_3 ) ) ( ( rule__WhileStatement__CommandsAssignment_3 )* ) ) )
            // InternalPortugolParser.g:4362:1: ( ( ( rule__WhileStatement__CommandsAssignment_3 ) ) ( ( rule__WhileStatement__CommandsAssignment_3 )* ) )
            {
            // InternalPortugolParser.g:4362:1: ( ( ( rule__WhileStatement__CommandsAssignment_3 ) ) ( ( rule__WhileStatement__CommandsAssignment_3 )* ) )
            // InternalPortugolParser.g:4363:2: ( ( rule__WhileStatement__CommandsAssignment_3 ) ) ( ( rule__WhileStatement__CommandsAssignment_3 )* )
            {
            // InternalPortugolParser.g:4363:2: ( ( rule__WhileStatement__CommandsAssignment_3 ) )
            // InternalPortugolParser.g:4364:3: ( rule__WhileStatement__CommandsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugolParser.g:4365:3: ( rule__WhileStatement__CommandsAssignment_3 )
            // InternalPortugolParser.g:4365:4: rule__WhileStatement__CommandsAssignment_3
            {
            pushFollow(FOLLOW_19);
            rule__WhileStatement__CommandsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getCommandsAssignment_3()); 
            }

            }

            // InternalPortugolParser.g:4368:2: ( ( rule__WhileStatement__CommandsAssignment_3 )* )
            // InternalPortugolParser.g:4369:3: ( rule__WhileStatement__CommandsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugolParser.g:4370:3: ( rule__WhileStatement__CommandsAssignment_3 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Interrompa||(LA34_0>=Enquanto && LA34_0<=Escreva)||LA34_0==Retorne||LA34_0==Repita||(LA34_0>=Leia && LA34_0<=Para)||LA34_0==NOT||LA34_0==Se||LA34_0==LeftParenthesis||LA34_0==HyphenMinus||(LA34_0>=RULE_INT && LA34_0<=RULE_STRING)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalPortugolParser.g:4370:4: rule__WhileStatement__CommandsAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__WhileStatement__CommandsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalPortugolParser.g:4379:1: rule__WhileStatement__Group__4 : rule__WhileStatement__Group__4__Impl ;
    public final void rule__WhileStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4383:1: ( rule__WhileStatement__Group__4__Impl )
            // InternalPortugolParser.g:4384:2: rule__WhileStatement__Group__4__Impl
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
    // InternalPortugolParser.g:4390:1: rule__WhileStatement__Group__4__Impl : ( Fimenquanto ) ;
    public final void rule__WhileStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4394:1: ( ( Fimenquanto ) )
            // InternalPortugolParser.g:4395:1: ( Fimenquanto )
            {
            // InternalPortugolParser.g:4395:1: ( Fimenquanto )
            // InternalPortugolParser.g:4396:2: Fimenquanto
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
    // InternalPortugolParser.g:4406:1: rule__RepeatStatement__Group__0 : rule__RepeatStatement__Group__0__Impl rule__RepeatStatement__Group__1 ;
    public final void rule__RepeatStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4410:1: ( rule__RepeatStatement__Group__0__Impl rule__RepeatStatement__Group__1 )
            // InternalPortugolParser.g:4411:2: rule__RepeatStatement__Group__0__Impl rule__RepeatStatement__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugolParser.g:4418:1: rule__RepeatStatement__Group__0__Impl : ( Repita ) ;
    public final void rule__RepeatStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4422:1: ( ( Repita ) )
            // InternalPortugolParser.g:4423:1: ( Repita )
            {
            // InternalPortugolParser.g:4423:1: ( Repita )
            // InternalPortugolParser.g:4424:2: Repita
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
    // InternalPortugolParser.g:4433:1: rule__RepeatStatement__Group__1 : rule__RepeatStatement__Group__1__Impl rule__RepeatStatement__Group__2 ;
    public final void rule__RepeatStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4437:1: ( rule__RepeatStatement__Group__1__Impl rule__RepeatStatement__Group__2 )
            // InternalPortugolParser.g:4438:2: rule__RepeatStatement__Group__1__Impl rule__RepeatStatement__Group__2
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
    // InternalPortugolParser.g:4445:1: rule__RepeatStatement__Group__1__Impl : ( ( ( rule__RepeatStatement__CommandsAssignment_1 ) ) ( ( rule__RepeatStatement__CommandsAssignment_1 )* ) ) ;
    public final void rule__RepeatStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4449:1: ( ( ( ( rule__RepeatStatement__CommandsAssignment_1 ) ) ( ( rule__RepeatStatement__CommandsAssignment_1 )* ) ) )
            // InternalPortugolParser.g:4450:1: ( ( ( rule__RepeatStatement__CommandsAssignment_1 ) ) ( ( rule__RepeatStatement__CommandsAssignment_1 )* ) )
            {
            // InternalPortugolParser.g:4450:1: ( ( ( rule__RepeatStatement__CommandsAssignment_1 ) ) ( ( rule__RepeatStatement__CommandsAssignment_1 )* ) )
            // InternalPortugolParser.g:4451:2: ( ( rule__RepeatStatement__CommandsAssignment_1 ) ) ( ( rule__RepeatStatement__CommandsAssignment_1 )* )
            {
            // InternalPortugolParser.g:4451:2: ( ( rule__RepeatStatement__CommandsAssignment_1 ) )
            // InternalPortugolParser.g:4452:3: ( rule__RepeatStatement__CommandsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatStatementAccess().getCommandsAssignment_1()); 
            }
            // InternalPortugolParser.g:4453:3: ( rule__RepeatStatement__CommandsAssignment_1 )
            // InternalPortugolParser.g:4453:4: rule__RepeatStatement__CommandsAssignment_1
            {
            pushFollow(FOLLOW_19);
            rule__RepeatStatement__CommandsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatStatementAccess().getCommandsAssignment_1()); 
            }

            }

            // InternalPortugolParser.g:4456:2: ( ( rule__RepeatStatement__CommandsAssignment_1 )* )
            // InternalPortugolParser.g:4457:3: ( rule__RepeatStatement__CommandsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatStatementAccess().getCommandsAssignment_1()); 
            }
            // InternalPortugolParser.g:4458:3: ( rule__RepeatStatement__CommandsAssignment_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==Interrompa||(LA35_0>=Enquanto && LA35_0<=Escreva)||LA35_0==Retorne||LA35_0==Repita||(LA35_0>=Leia && LA35_0<=Para)||LA35_0==NOT||LA35_0==Se||LA35_0==LeftParenthesis||LA35_0==HyphenMinus||(LA35_0>=RULE_INT && LA35_0<=RULE_STRING)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalPortugolParser.g:4458:4: rule__RepeatStatement__CommandsAssignment_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__RepeatStatement__CommandsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalPortugolParser.g:4467:1: rule__RepeatStatement__Group__2 : rule__RepeatStatement__Group__2__Impl rule__RepeatStatement__Group__3 ;
    public final void rule__RepeatStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4471:1: ( rule__RepeatStatement__Group__2__Impl rule__RepeatStatement__Group__3 )
            // InternalPortugolParser.g:4472:2: rule__RepeatStatement__Group__2__Impl rule__RepeatStatement__Group__3
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
    // InternalPortugolParser.g:4479:1: rule__RepeatStatement__Group__2__Impl : ( Ate ) ;
    public final void rule__RepeatStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4483:1: ( ( Ate ) )
            // InternalPortugolParser.g:4484:1: ( Ate )
            {
            // InternalPortugolParser.g:4484:1: ( Ate )
            // InternalPortugolParser.g:4485:2: Ate
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
    // InternalPortugolParser.g:4494:1: rule__RepeatStatement__Group__3 : rule__RepeatStatement__Group__3__Impl rule__RepeatStatement__Group__4 ;
    public final void rule__RepeatStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4498:1: ( rule__RepeatStatement__Group__3__Impl rule__RepeatStatement__Group__4 )
            // InternalPortugolParser.g:4499:2: rule__RepeatStatement__Group__3__Impl rule__RepeatStatement__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalPortugolParser.g:4506:1: rule__RepeatStatement__Group__3__Impl : ( ( rule__RepeatStatement__UntilExprAssignment_3 ) ) ;
    public final void rule__RepeatStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4510:1: ( ( ( rule__RepeatStatement__UntilExprAssignment_3 ) ) )
            // InternalPortugolParser.g:4511:1: ( ( rule__RepeatStatement__UntilExprAssignment_3 ) )
            {
            // InternalPortugolParser.g:4511:1: ( ( rule__RepeatStatement__UntilExprAssignment_3 ) )
            // InternalPortugolParser.g:4512:2: ( rule__RepeatStatement__UntilExprAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatStatementAccess().getUntilExprAssignment_3()); 
            }
            // InternalPortugolParser.g:4513:2: ( rule__RepeatStatement__UntilExprAssignment_3 )
            // InternalPortugolParser.g:4513:3: rule__RepeatStatement__UntilExprAssignment_3
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
    // InternalPortugolParser.g:4521:1: rule__RepeatStatement__Group__4 : rule__RepeatStatement__Group__4__Impl ;
    public final void rule__RepeatStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4525:1: ( rule__RepeatStatement__Group__4__Impl )
            // InternalPortugolParser.g:4526:2: rule__RepeatStatement__Group__4__Impl
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
    // InternalPortugolParser.g:4532:1: rule__RepeatStatement__Group__4__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__RepeatStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4536:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugolParser.g:4537:1: ( ruleEND_COMMAND )
            {
            // InternalPortugolParser.g:4537:1: ( ruleEND_COMMAND )
            // InternalPortugolParser.g:4538:2: ruleEND_COMMAND
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
    // InternalPortugolParser.g:4548:1: rule__SubprogramParam__Group__0 : rule__SubprogramParam__Group__0__Impl rule__SubprogramParam__Group__1 ;
    public final void rule__SubprogramParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4552:1: ( rule__SubprogramParam__Group__0__Impl rule__SubprogramParam__Group__1 )
            // InternalPortugolParser.g:4553:2: rule__SubprogramParam__Group__0__Impl rule__SubprogramParam__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalPortugolParser.g:4560:1: rule__SubprogramParam__Group__0__Impl : ( ( rule__SubprogramParam__ExpressionAssignment_0 ) ) ;
    public final void rule__SubprogramParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4564:1: ( ( ( rule__SubprogramParam__ExpressionAssignment_0 ) ) )
            // InternalPortugolParser.g:4565:1: ( ( rule__SubprogramParam__ExpressionAssignment_0 ) )
            {
            // InternalPortugolParser.g:4565:1: ( ( rule__SubprogramParam__ExpressionAssignment_0 ) )
            // InternalPortugolParser.g:4566:2: ( rule__SubprogramParam__ExpressionAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamAccess().getExpressionAssignment_0()); 
            }
            // InternalPortugolParser.g:4567:2: ( rule__SubprogramParam__ExpressionAssignment_0 )
            // InternalPortugolParser.g:4567:3: rule__SubprogramParam__ExpressionAssignment_0
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
    // InternalPortugolParser.g:4575:1: rule__SubprogramParam__Group__1 : rule__SubprogramParam__Group__1__Impl ;
    public final void rule__SubprogramParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4579:1: ( rule__SubprogramParam__Group__1__Impl )
            // InternalPortugolParser.g:4580:2: rule__SubprogramParam__Group__1__Impl
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
    // InternalPortugolParser.g:4586:1: rule__SubprogramParam__Group__1__Impl : ( ( rule__SubprogramParam__Group_1__0 )* ) ;
    public final void rule__SubprogramParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4590:1: ( ( ( rule__SubprogramParam__Group_1__0 )* ) )
            // InternalPortugolParser.g:4591:1: ( ( rule__SubprogramParam__Group_1__0 )* )
            {
            // InternalPortugolParser.g:4591:1: ( ( rule__SubprogramParam__Group_1__0 )* )
            // InternalPortugolParser.g:4592:2: ( rule__SubprogramParam__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:4593:2: ( rule__SubprogramParam__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==Comma) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalPortugolParser.g:4593:3: rule__SubprogramParam__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SubprogramParam__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalPortugolParser.g:4602:1: rule__SubprogramParam__Group_1__0 : rule__SubprogramParam__Group_1__0__Impl rule__SubprogramParam__Group_1__1 ;
    public final void rule__SubprogramParam__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4606:1: ( rule__SubprogramParam__Group_1__0__Impl rule__SubprogramParam__Group_1__1 )
            // InternalPortugolParser.g:4607:2: rule__SubprogramParam__Group_1__0__Impl rule__SubprogramParam__Group_1__1
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
    // InternalPortugolParser.g:4614:1: rule__SubprogramParam__Group_1__0__Impl : ( Comma ) ;
    public final void rule__SubprogramParam__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4618:1: ( ( Comma ) )
            // InternalPortugolParser.g:4619:1: ( Comma )
            {
            // InternalPortugolParser.g:4619:1: ( Comma )
            // InternalPortugolParser.g:4620:2: Comma
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
    // InternalPortugolParser.g:4629:1: rule__SubprogramParam__Group_1__1 : rule__SubprogramParam__Group_1__1__Impl ;
    public final void rule__SubprogramParam__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4633:1: ( rule__SubprogramParam__Group_1__1__Impl )
            // InternalPortugolParser.g:4634:2: rule__SubprogramParam__Group_1__1__Impl
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
    // InternalPortugolParser.g:4640:1: rule__SubprogramParam__Group_1__1__Impl : ( ( rule__SubprogramParam__ExpressionAssignment_1_1 ) ) ;
    public final void rule__SubprogramParam__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4644:1: ( ( ( rule__SubprogramParam__ExpressionAssignment_1_1 ) ) )
            // InternalPortugolParser.g:4645:1: ( ( rule__SubprogramParam__ExpressionAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:4645:1: ( ( rule__SubprogramParam__ExpressionAssignment_1_1 ) )
            // InternalPortugolParser.g:4646:2: ( rule__SubprogramParam__ExpressionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamAccess().getExpressionAssignment_1_1()); 
            }
            // InternalPortugolParser.g:4647:2: ( rule__SubprogramParam__ExpressionAssignment_1_1 )
            // InternalPortugolParser.g:4647:3: rule__SubprogramParam__ExpressionAssignment_1_1
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
    // InternalPortugolParser.g:4656:1: rule__ReadCommand__Group__0 : rule__ReadCommand__Group__0__Impl rule__ReadCommand__Group__1 ;
    public final void rule__ReadCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4660:1: ( rule__ReadCommand__Group__0__Impl rule__ReadCommand__Group__1 )
            // InternalPortugolParser.g:4661:2: rule__ReadCommand__Group__0__Impl rule__ReadCommand__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalPortugolParser.g:4668:1: rule__ReadCommand__Group__0__Impl : ( Leia ) ;
    public final void rule__ReadCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4672:1: ( ( Leia ) )
            // InternalPortugolParser.g:4673:1: ( Leia )
            {
            // InternalPortugolParser.g:4673:1: ( Leia )
            // InternalPortugolParser.g:4674:2: Leia
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
    // InternalPortugolParser.g:4683:1: rule__ReadCommand__Group__1 : rule__ReadCommand__Group__1__Impl rule__ReadCommand__Group__2 ;
    public final void rule__ReadCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4687:1: ( rule__ReadCommand__Group__1__Impl rule__ReadCommand__Group__2 )
            // InternalPortugolParser.g:4688:2: rule__ReadCommand__Group__1__Impl rule__ReadCommand__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalPortugolParser.g:4695:1: rule__ReadCommand__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__ReadCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4699:1: ( ( LeftParenthesis ) )
            // InternalPortugolParser.g:4700:1: ( LeftParenthesis )
            {
            // InternalPortugolParser.g:4700:1: ( LeftParenthesis )
            // InternalPortugolParser.g:4701:2: LeftParenthesis
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
    // InternalPortugolParser.g:4710:1: rule__ReadCommand__Group__2 : rule__ReadCommand__Group__2__Impl rule__ReadCommand__Group__3 ;
    public final void rule__ReadCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4714:1: ( rule__ReadCommand__Group__2__Impl rule__ReadCommand__Group__3 )
            // InternalPortugolParser.g:4715:2: rule__ReadCommand__Group__2__Impl rule__ReadCommand__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalPortugolParser.g:4722:1: rule__ReadCommand__Group__2__Impl : ( ( rule__ReadCommand__ParamListAssignment_2 ) ) ;
    public final void rule__ReadCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4726:1: ( ( ( rule__ReadCommand__ParamListAssignment_2 ) ) )
            // InternalPortugolParser.g:4727:1: ( ( rule__ReadCommand__ParamListAssignment_2 ) )
            {
            // InternalPortugolParser.g:4727:1: ( ( rule__ReadCommand__ParamListAssignment_2 ) )
            // InternalPortugolParser.g:4728:2: ( rule__ReadCommand__ParamListAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getParamListAssignment_2()); 
            }
            // InternalPortugolParser.g:4729:2: ( rule__ReadCommand__ParamListAssignment_2 )
            // InternalPortugolParser.g:4729:3: rule__ReadCommand__ParamListAssignment_2
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
    // InternalPortugolParser.g:4737:1: rule__ReadCommand__Group__3 : rule__ReadCommand__Group__3__Impl ;
    public final void rule__ReadCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4741:1: ( rule__ReadCommand__Group__3__Impl )
            // InternalPortugolParser.g:4742:2: rule__ReadCommand__Group__3__Impl
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
    // InternalPortugolParser.g:4748:1: rule__ReadCommand__Group__3__Impl : ( RightParenthesis ) ;
    public final void rule__ReadCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4752:1: ( ( RightParenthesis ) )
            // InternalPortugolParser.g:4753:1: ( RightParenthesis )
            {
            // InternalPortugolParser.g:4753:1: ( RightParenthesis )
            // InternalPortugolParser.g:4754:2: RightParenthesis
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
    // InternalPortugolParser.g:4764:1: rule__WriteCommand__Group__0 : rule__WriteCommand__Group__0__Impl rule__WriteCommand__Group__1 ;
    public final void rule__WriteCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4768:1: ( rule__WriteCommand__Group__0__Impl rule__WriteCommand__Group__1 )
            // InternalPortugolParser.g:4769:2: rule__WriteCommand__Group__0__Impl rule__WriteCommand__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalPortugolParser.g:4776:1: rule__WriteCommand__Group__0__Impl : ( ( rule__WriteCommand__WriteCommandAssignment_0 ) ) ;
    public final void rule__WriteCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4780:1: ( ( ( rule__WriteCommand__WriteCommandAssignment_0 ) ) )
            // InternalPortugolParser.g:4781:1: ( ( rule__WriteCommand__WriteCommandAssignment_0 ) )
            {
            // InternalPortugolParser.g:4781:1: ( ( rule__WriteCommand__WriteCommandAssignment_0 ) )
            // InternalPortugolParser.g:4782:2: ( rule__WriteCommand__WriteCommandAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getWriteCommandAssignment_0()); 
            }
            // InternalPortugolParser.g:4783:2: ( rule__WriteCommand__WriteCommandAssignment_0 )
            // InternalPortugolParser.g:4783:3: rule__WriteCommand__WriteCommandAssignment_0
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
    // InternalPortugolParser.g:4791:1: rule__WriteCommand__Group__1 : rule__WriteCommand__Group__1__Impl rule__WriteCommand__Group__2 ;
    public final void rule__WriteCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4795:1: ( rule__WriteCommand__Group__1__Impl rule__WriteCommand__Group__2 )
            // InternalPortugolParser.g:4796:2: rule__WriteCommand__Group__1__Impl rule__WriteCommand__Group__2
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
    // InternalPortugolParser.g:4803:1: rule__WriteCommand__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__WriteCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4807:1: ( ( LeftParenthesis ) )
            // InternalPortugolParser.g:4808:1: ( LeftParenthesis )
            {
            // InternalPortugolParser.g:4808:1: ( LeftParenthesis )
            // InternalPortugolParser.g:4809:2: LeftParenthesis
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
    // InternalPortugolParser.g:4818:1: rule__WriteCommand__Group__2 : rule__WriteCommand__Group__2__Impl rule__WriteCommand__Group__3 ;
    public final void rule__WriteCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4822:1: ( rule__WriteCommand__Group__2__Impl rule__WriteCommand__Group__3 )
            // InternalPortugolParser.g:4823:2: rule__WriteCommand__Group__2__Impl rule__WriteCommand__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalPortugolParser.g:4830:1: rule__WriteCommand__Group__2__Impl : ( ( rule__WriteCommand__WriteParamAssignment_2 ) ) ;
    public final void rule__WriteCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4834:1: ( ( ( rule__WriteCommand__WriteParamAssignment_2 ) ) )
            // InternalPortugolParser.g:4835:1: ( ( rule__WriteCommand__WriteParamAssignment_2 ) )
            {
            // InternalPortugolParser.g:4835:1: ( ( rule__WriteCommand__WriteParamAssignment_2 ) )
            // InternalPortugolParser.g:4836:2: ( rule__WriteCommand__WriteParamAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getWriteParamAssignment_2()); 
            }
            // InternalPortugolParser.g:4837:2: ( rule__WriteCommand__WriteParamAssignment_2 )
            // InternalPortugolParser.g:4837:3: rule__WriteCommand__WriteParamAssignment_2
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
    // InternalPortugolParser.g:4845:1: rule__WriteCommand__Group__3 : rule__WriteCommand__Group__3__Impl ;
    public final void rule__WriteCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4849:1: ( rule__WriteCommand__Group__3__Impl )
            // InternalPortugolParser.g:4850:2: rule__WriteCommand__Group__3__Impl
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
    // InternalPortugolParser.g:4856:1: rule__WriteCommand__Group__3__Impl : ( RightParenthesis ) ;
    public final void rule__WriteCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4860:1: ( ( RightParenthesis ) )
            // InternalPortugolParser.g:4861:1: ( RightParenthesis )
            {
            // InternalPortugolParser.g:4861:1: ( RightParenthesis )
            // InternalPortugolParser.g:4862:2: RightParenthesis
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
    // InternalPortugolParser.g:4872:1: rule__WriteParam__Group__0 : rule__WriteParam__Group__0__Impl rule__WriteParam__Group__1 ;
    public final void rule__WriteParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4876:1: ( rule__WriteParam__Group__0__Impl rule__WriteParam__Group__1 )
            // InternalPortugolParser.g:4877:2: rule__WriteParam__Group__0__Impl rule__WriteParam__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalPortugolParser.g:4884:1: rule__WriteParam__Group__0__Impl : ( ( rule__WriteParam__ParamsAssignment_0 ) ) ;
    public final void rule__WriteParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4888:1: ( ( ( rule__WriteParam__ParamsAssignment_0 ) ) )
            // InternalPortugolParser.g:4889:1: ( ( rule__WriteParam__ParamsAssignment_0 ) )
            {
            // InternalPortugolParser.g:4889:1: ( ( rule__WriteParam__ParamsAssignment_0 ) )
            // InternalPortugolParser.g:4890:2: ( rule__WriteParam__ParamsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getParamsAssignment_0()); 
            }
            // InternalPortugolParser.g:4891:2: ( rule__WriteParam__ParamsAssignment_0 )
            // InternalPortugolParser.g:4891:3: rule__WriteParam__ParamsAssignment_0
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
    // InternalPortugolParser.g:4899:1: rule__WriteParam__Group__1 : rule__WriteParam__Group__1__Impl ;
    public final void rule__WriteParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4903:1: ( rule__WriteParam__Group__1__Impl )
            // InternalPortugolParser.g:4904:2: rule__WriteParam__Group__1__Impl
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
    // InternalPortugolParser.g:4910:1: rule__WriteParam__Group__1__Impl : ( ( rule__WriteParam__PrecisionAssignment_1 )? ) ;
    public final void rule__WriteParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4914:1: ( ( ( rule__WriteParam__PrecisionAssignment_1 )? ) )
            // InternalPortugolParser.g:4915:1: ( ( rule__WriteParam__PrecisionAssignment_1 )? )
            {
            // InternalPortugolParser.g:4915:1: ( ( rule__WriteParam__PrecisionAssignment_1 )? )
            // InternalPortugolParser.g:4916:2: ( rule__WriteParam__PrecisionAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getPrecisionAssignment_1()); 
            }
            // InternalPortugolParser.g:4917:2: ( rule__WriteParam__PrecisionAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Colon) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPortugolParser.g:4917:3: rule__WriteParam__PrecisionAssignment_1
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
    // InternalPortugolParser.g:4926:1: rule__OptDecimalPrecision__Group__0 : rule__OptDecimalPrecision__Group__0__Impl rule__OptDecimalPrecision__Group__1 ;
    public final void rule__OptDecimalPrecision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4930:1: ( rule__OptDecimalPrecision__Group__0__Impl rule__OptDecimalPrecision__Group__1 )
            // InternalPortugolParser.g:4931:2: rule__OptDecimalPrecision__Group__0__Impl rule__OptDecimalPrecision__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalPortugolParser.g:4938:1: rule__OptDecimalPrecision__Group__0__Impl : ( Colon ) ;
    public final void rule__OptDecimalPrecision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4942:1: ( ( Colon ) )
            // InternalPortugolParser.g:4943:1: ( Colon )
            {
            // InternalPortugolParser.g:4943:1: ( Colon )
            // InternalPortugolParser.g:4944:2: Colon
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
    // InternalPortugolParser.g:4953:1: rule__OptDecimalPrecision__Group__1 : rule__OptDecimalPrecision__Group__1__Impl rule__OptDecimalPrecision__Group__2 ;
    public final void rule__OptDecimalPrecision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4957:1: ( rule__OptDecimalPrecision__Group__1__Impl rule__OptDecimalPrecision__Group__2 )
            // InternalPortugolParser.g:4958:2: rule__OptDecimalPrecision__Group__1__Impl rule__OptDecimalPrecision__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalPortugolParser.g:4965:1: rule__OptDecimalPrecision__Group__1__Impl : ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) ) ;
    public final void rule__OptDecimalPrecision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4969:1: ( ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) ) )
            // InternalPortugolParser.g:4970:1: ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) )
            {
            // InternalPortugolParser.g:4970:1: ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) )
            // InternalPortugolParser.g:4971:2: ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getFirstPrecisionAssignment_1()); 
            }
            // InternalPortugolParser.g:4972:2: ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 )
            // InternalPortugolParser.g:4972:3: rule__OptDecimalPrecision__FirstPrecisionAssignment_1
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
    // InternalPortugolParser.g:4980:1: rule__OptDecimalPrecision__Group__2 : rule__OptDecimalPrecision__Group__2__Impl ;
    public final void rule__OptDecimalPrecision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4984:1: ( rule__OptDecimalPrecision__Group__2__Impl )
            // InternalPortugolParser.g:4985:2: rule__OptDecimalPrecision__Group__2__Impl
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
    // InternalPortugolParser.g:4991:1: rule__OptDecimalPrecision__Group__2__Impl : ( ( rule__OptDecimalPrecision__Group_2__0 )? ) ;
    public final void rule__OptDecimalPrecision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:4995:1: ( ( ( rule__OptDecimalPrecision__Group_2__0 )? ) )
            // InternalPortugolParser.g:4996:1: ( ( rule__OptDecimalPrecision__Group_2__0 )? )
            {
            // InternalPortugolParser.g:4996:1: ( ( rule__OptDecimalPrecision__Group_2__0 )? )
            // InternalPortugolParser.g:4997:2: ( rule__OptDecimalPrecision__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getGroup_2()); 
            }
            // InternalPortugolParser.g:4998:2: ( rule__OptDecimalPrecision__Group_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Colon) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPortugolParser.g:4998:3: rule__OptDecimalPrecision__Group_2__0
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
    // InternalPortugolParser.g:5007:1: rule__OptDecimalPrecision__Group_2__0 : rule__OptDecimalPrecision__Group_2__0__Impl rule__OptDecimalPrecision__Group_2__1 ;
    public final void rule__OptDecimalPrecision__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5011:1: ( rule__OptDecimalPrecision__Group_2__0__Impl rule__OptDecimalPrecision__Group_2__1 )
            // InternalPortugolParser.g:5012:2: rule__OptDecimalPrecision__Group_2__0__Impl rule__OptDecimalPrecision__Group_2__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalPortugolParser.g:5019:1: rule__OptDecimalPrecision__Group_2__0__Impl : ( Colon ) ;
    public final void rule__OptDecimalPrecision__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5023:1: ( ( Colon ) )
            // InternalPortugolParser.g:5024:1: ( Colon )
            {
            // InternalPortugolParser.g:5024:1: ( Colon )
            // InternalPortugolParser.g:5025:2: Colon
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
    // InternalPortugolParser.g:5034:1: rule__OptDecimalPrecision__Group_2__1 : rule__OptDecimalPrecision__Group_2__1__Impl ;
    public final void rule__OptDecimalPrecision__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5038:1: ( rule__OptDecimalPrecision__Group_2__1__Impl )
            // InternalPortugolParser.g:5039:2: rule__OptDecimalPrecision__Group_2__1__Impl
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
    // InternalPortugolParser.g:5045:1: rule__OptDecimalPrecision__Group_2__1__Impl : ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) ) ;
    public final void rule__OptDecimalPrecision__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5049:1: ( ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) ) )
            // InternalPortugolParser.g:5050:1: ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) )
            {
            // InternalPortugolParser.g:5050:1: ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) )
            // InternalPortugolParser.g:5051:2: ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getSecondPrecisionAssignment_2_1()); 
            }
            // InternalPortugolParser.g:5052:2: ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 )
            // InternalPortugolParser.g:5052:3: rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1
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
    // InternalPortugolParser.g:5061:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5065:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalPortugolParser.g:5066:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalPortugolParser.g:5073:1: rule__Assignment__Group__0__Impl : ( ruleOrExpression ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5077:1: ( ( ruleOrExpression ) )
            // InternalPortugolParser.g:5078:1: ( ruleOrExpression )
            {
            // InternalPortugolParser.g:5078:1: ( ruleOrExpression )
            // InternalPortugolParser.g:5079:2: ruleOrExpression
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
    // InternalPortugolParser.g:5088:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5092:1: ( rule__Assignment__Group__1__Impl )
            // InternalPortugolParser.g:5093:2: rule__Assignment__Group__1__Impl
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
    // InternalPortugolParser.g:5099:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__Group_1__0 )* ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5103:1: ( ( ( rule__Assignment__Group_1__0 )* ) )
            // InternalPortugolParser.g:5104:1: ( ( rule__Assignment__Group_1__0 )* )
            {
            // InternalPortugolParser.g:5104:1: ( ( rule__Assignment__Group_1__0 )* )
            // InternalPortugolParser.g:5105:2: ( rule__Assignment__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:5106:2: ( rule__Assignment__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==LessThanSignHyphenMinus) ) {
                    int LA39_2 = input.LA(2);

                    if ( (synpred55_InternalPortugolParser()) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // InternalPortugolParser.g:5106:3: rule__Assignment__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Assignment__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalPortugolParser.g:5115:1: rule__Assignment__Group_1__0 : rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 ;
    public final void rule__Assignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5119:1: ( rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 )
            // InternalPortugolParser.g:5120:2: rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1
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
    // InternalPortugolParser.g:5127:1: rule__Assignment__Group_1__0__Impl : ( ( rule__Assignment__Group_1_0__0 ) ) ;
    public final void rule__Assignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5131:1: ( ( ( rule__Assignment__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:5132:1: ( ( rule__Assignment__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:5132:1: ( ( rule__Assignment__Group_1_0__0 ) )
            // InternalPortugolParser.g:5133:2: ( rule__Assignment__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:5134:2: ( rule__Assignment__Group_1_0__0 )
            // InternalPortugolParser.g:5134:3: rule__Assignment__Group_1_0__0
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
    // InternalPortugolParser.g:5142:1: rule__Assignment__Group_1__1 : rule__Assignment__Group_1__1__Impl ;
    public final void rule__Assignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5146:1: ( rule__Assignment__Group_1__1__Impl )
            // InternalPortugolParser.g:5147:2: rule__Assignment__Group_1__1__Impl
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
    // InternalPortugolParser.g:5153:1: rule__Assignment__Group_1__1__Impl : ( ( rule__Assignment__RightAssignment_1_1 ) ) ;
    public final void rule__Assignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5157:1: ( ( ( rule__Assignment__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:5158:1: ( ( rule__Assignment__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:5158:1: ( ( rule__Assignment__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:5159:2: ( rule__Assignment__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:5160:2: ( rule__Assignment__RightAssignment_1_1 )
            // InternalPortugolParser.g:5160:3: rule__Assignment__RightAssignment_1_1
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
    // InternalPortugolParser.g:5169:1: rule__Assignment__Group_1_0__0 : rule__Assignment__Group_1_0__0__Impl ;
    public final void rule__Assignment__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5173:1: ( rule__Assignment__Group_1_0__0__Impl )
            // InternalPortugolParser.g:5174:2: rule__Assignment__Group_1_0__0__Impl
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
    // InternalPortugolParser.g:5180:1: rule__Assignment__Group_1_0__0__Impl : ( ( rule__Assignment__Group_1_0_0__0 ) ) ;
    public final void rule__Assignment__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5184:1: ( ( ( rule__Assignment__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:5185:1: ( ( rule__Assignment__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:5185:1: ( ( rule__Assignment__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:5186:2: ( rule__Assignment__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:5187:2: ( rule__Assignment__Group_1_0_0__0 )
            // InternalPortugolParser.g:5187:3: rule__Assignment__Group_1_0_0__0
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
    // InternalPortugolParser.g:5196:1: rule__Assignment__Group_1_0_0__0 : rule__Assignment__Group_1_0_0__0__Impl rule__Assignment__Group_1_0_0__1 ;
    public final void rule__Assignment__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5200:1: ( rule__Assignment__Group_1_0_0__0__Impl rule__Assignment__Group_1_0_0__1 )
            // InternalPortugolParser.g:5201:2: rule__Assignment__Group_1_0_0__0__Impl rule__Assignment__Group_1_0_0__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalPortugolParser.g:5208:1: rule__Assignment__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Assignment__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5212:1: ( ( () ) )
            // InternalPortugolParser.g:5213:1: ( () )
            {
            // InternalPortugolParser.g:5213:1: ( () )
            // InternalPortugolParser.g:5214:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:5215:2: ()
            // InternalPortugolParser.g:5215:3: 
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
    // InternalPortugolParser.g:5223:1: rule__Assignment__Group_1_0_0__1 : rule__Assignment__Group_1_0_0__1__Impl ;
    public final void rule__Assignment__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5227:1: ( rule__Assignment__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:5228:2: rule__Assignment__Group_1_0_0__1__Impl
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
    // InternalPortugolParser.g:5234:1: rule__Assignment__Group_1_0_0__1__Impl : ( ( rule__Assignment__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__Assignment__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5238:1: ( ( ( rule__Assignment__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:5239:1: ( ( rule__Assignment__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:5239:1: ( ( rule__Assignment__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:5240:2: ( rule__Assignment__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:5241:2: ( rule__Assignment__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:5241:3: rule__Assignment__OpAssignment_1_0_0_1
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
    // InternalPortugolParser.g:5250:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5254:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalPortugolParser.g:5255:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalPortugolParser.g:5262:1: rule__OrExpression__Group__0__Impl : ( ruleXorExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5266:1: ( ( ruleXorExpression ) )
            // InternalPortugolParser.g:5267:1: ( ruleXorExpression )
            {
            // InternalPortugolParser.g:5267:1: ( ruleXorExpression )
            // InternalPortugolParser.g:5268:2: ruleXorExpression
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
    // InternalPortugolParser.g:5277:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5281:1: ( rule__OrExpression__Group__1__Impl )
            // InternalPortugolParser.g:5282:2: rule__OrExpression__Group__1__Impl
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
    // InternalPortugolParser.g:5288:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5292:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalPortugolParser.g:5293:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalPortugolParser.g:5293:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalPortugolParser.g:5294:2: ( rule__OrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:5295:2: ( rule__OrExpression__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==OU) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPortugolParser.g:5295:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalPortugolParser.g:5304:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5308:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalPortugolParser.g:5309:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
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
    // InternalPortugolParser.g:5316:1: rule__OrExpression__Group_1__0__Impl : ( ( rule__OrExpression__Group_1_0__0 ) ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5320:1: ( ( ( rule__OrExpression__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:5321:1: ( ( rule__OrExpression__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:5321:1: ( ( rule__OrExpression__Group_1_0__0 ) )
            // InternalPortugolParser.g:5322:2: ( rule__OrExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:5323:2: ( rule__OrExpression__Group_1_0__0 )
            // InternalPortugolParser.g:5323:3: rule__OrExpression__Group_1_0__0
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
    // InternalPortugolParser.g:5331:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5335:1: ( rule__OrExpression__Group_1__1__Impl )
            // InternalPortugolParser.g:5336:2: rule__OrExpression__Group_1__1__Impl
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
    // InternalPortugolParser.g:5342:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__RightAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5346:1: ( ( ( rule__OrExpression__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:5347:1: ( ( rule__OrExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:5347:1: ( ( rule__OrExpression__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:5348:2: ( rule__OrExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:5349:2: ( rule__OrExpression__RightAssignment_1_1 )
            // InternalPortugolParser.g:5349:3: rule__OrExpression__RightAssignment_1_1
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
    // InternalPortugolParser.g:5358:1: rule__OrExpression__Group_1_0__0 : rule__OrExpression__Group_1_0__0__Impl ;
    public final void rule__OrExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5362:1: ( rule__OrExpression__Group_1_0__0__Impl )
            // InternalPortugolParser.g:5363:2: rule__OrExpression__Group_1_0__0__Impl
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
    // InternalPortugolParser.g:5369:1: rule__OrExpression__Group_1_0__0__Impl : ( ( rule__OrExpression__Group_1_0_0__0 ) ) ;
    public final void rule__OrExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5373:1: ( ( ( rule__OrExpression__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:5374:1: ( ( rule__OrExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:5374:1: ( ( rule__OrExpression__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:5375:2: ( rule__OrExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:5376:2: ( rule__OrExpression__Group_1_0_0__0 )
            // InternalPortugolParser.g:5376:3: rule__OrExpression__Group_1_0_0__0
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
    // InternalPortugolParser.g:5385:1: rule__OrExpression__Group_1_0_0__0 : rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1 ;
    public final void rule__OrExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5389:1: ( rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1 )
            // InternalPortugolParser.g:5390:2: rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalPortugolParser.g:5397:1: rule__OrExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5401:1: ( ( () ) )
            // InternalPortugolParser.g:5402:1: ( () )
            {
            // InternalPortugolParser.g:5402:1: ( () )
            // InternalPortugolParser.g:5403:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:5404:2: ()
            // InternalPortugolParser.g:5404:3: 
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
    // InternalPortugolParser.g:5412:1: rule__OrExpression__Group_1_0_0__1 : rule__OrExpression__Group_1_0_0__1__Impl ;
    public final void rule__OrExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5416:1: ( rule__OrExpression__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:5417:2: rule__OrExpression__Group_1_0_0__1__Impl
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
    // InternalPortugolParser.g:5423:1: rule__OrExpression__Group_1_0_0__1__Impl : ( ( rule__OrExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__OrExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5427:1: ( ( ( rule__OrExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:5428:1: ( ( rule__OrExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:5428:1: ( ( rule__OrExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:5429:2: ( rule__OrExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:5430:2: ( rule__OrExpression__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:5430:3: rule__OrExpression__OpAssignment_1_0_0_1
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
    // InternalPortugolParser.g:5439:1: rule__XorExpression__Group__0 : rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 ;
    public final void rule__XorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5443:1: ( rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 )
            // InternalPortugolParser.g:5444:2: rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalPortugolParser.g:5451:1: rule__XorExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__XorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5455:1: ( ( ruleAndExpression ) )
            // InternalPortugolParser.g:5456:1: ( ruleAndExpression )
            {
            // InternalPortugolParser.g:5456:1: ( ruleAndExpression )
            // InternalPortugolParser.g:5457:2: ruleAndExpression
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
    // InternalPortugolParser.g:5466:1: rule__XorExpression__Group__1 : rule__XorExpression__Group__1__Impl ;
    public final void rule__XorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5470:1: ( rule__XorExpression__Group__1__Impl )
            // InternalPortugolParser.g:5471:2: rule__XorExpression__Group__1__Impl
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
    // InternalPortugolParser.g:5477:1: rule__XorExpression__Group__1__Impl : ( ( rule__XorExpression__Group_1__0 )* ) ;
    public final void rule__XorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5481:1: ( ( ( rule__XorExpression__Group_1__0 )* ) )
            // InternalPortugolParser.g:5482:1: ( ( rule__XorExpression__Group_1__0 )* )
            {
            // InternalPortugolParser.g:5482:1: ( ( rule__XorExpression__Group_1__0 )* )
            // InternalPortugolParser.g:5483:2: ( rule__XorExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:5484:2: ( rule__XorExpression__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==XOU) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPortugolParser.g:5484:3: rule__XorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__XorExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalPortugolParser.g:5493:1: rule__XorExpression__Group_1__0 : rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 ;
    public final void rule__XorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5497:1: ( rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 )
            // InternalPortugolParser.g:5498:2: rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1
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
    // InternalPortugolParser.g:5505:1: rule__XorExpression__Group_1__0__Impl : ( ( rule__XorExpression__Group_1_0__0 ) ) ;
    public final void rule__XorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5509:1: ( ( ( rule__XorExpression__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:5510:1: ( ( rule__XorExpression__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:5510:1: ( ( rule__XorExpression__Group_1_0__0 ) )
            // InternalPortugolParser.g:5511:2: ( rule__XorExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:5512:2: ( rule__XorExpression__Group_1_0__0 )
            // InternalPortugolParser.g:5512:3: rule__XorExpression__Group_1_0__0
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
    // InternalPortugolParser.g:5520:1: rule__XorExpression__Group_1__1 : rule__XorExpression__Group_1__1__Impl ;
    public final void rule__XorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5524:1: ( rule__XorExpression__Group_1__1__Impl )
            // InternalPortugolParser.g:5525:2: rule__XorExpression__Group_1__1__Impl
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
    // InternalPortugolParser.g:5531:1: rule__XorExpression__Group_1__1__Impl : ( ( rule__XorExpression__RightAssignment_1_1 ) ) ;
    public final void rule__XorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5535:1: ( ( ( rule__XorExpression__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:5536:1: ( ( rule__XorExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:5536:1: ( ( rule__XorExpression__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:5537:2: ( rule__XorExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:5538:2: ( rule__XorExpression__RightAssignment_1_1 )
            // InternalPortugolParser.g:5538:3: rule__XorExpression__RightAssignment_1_1
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
    // InternalPortugolParser.g:5547:1: rule__XorExpression__Group_1_0__0 : rule__XorExpression__Group_1_0__0__Impl ;
    public final void rule__XorExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5551:1: ( rule__XorExpression__Group_1_0__0__Impl )
            // InternalPortugolParser.g:5552:2: rule__XorExpression__Group_1_0__0__Impl
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
    // InternalPortugolParser.g:5558:1: rule__XorExpression__Group_1_0__0__Impl : ( ( rule__XorExpression__Group_1_0_0__0 ) ) ;
    public final void rule__XorExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5562:1: ( ( ( rule__XorExpression__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:5563:1: ( ( rule__XorExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:5563:1: ( ( rule__XorExpression__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:5564:2: ( rule__XorExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:5565:2: ( rule__XorExpression__Group_1_0_0__0 )
            // InternalPortugolParser.g:5565:3: rule__XorExpression__Group_1_0_0__0
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
    // InternalPortugolParser.g:5574:1: rule__XorExpression__Group_1_0_0__0 : rule__XorExpression__Group_1_0_0__0__Impl rule__XorExpression__Group_1_0_0__1 ;
    public final void rule__XorExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5578:1: ( rule__XorExpression__Group_1_0_0__0__Impl rule__XorExpression__Group_1_0_0__1 )
            // InternalPortugolParser.g:5579:2: rule__XorExpression__Group_1_0_0__0__Impl rule__XorExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalPortugolParser.g:5586:1: rule__XorExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__XorExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5590:1: ( ( () ) )
            // InternalPortugolParser.g:5591:1: ( () )
            {
            // InternalPortugolParser.g:5591:1: ( () )
            // InternalPortugolParser.g:5592:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:5593:2: ()
            // InternalPortugolParser.g:5593:3: 
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
    // InternalPortugolParser.g:5601:1: rule__XorExpression__Group_1_0_0__1 : rule__XorExpression__Group_1_0_0__1__Impl ;
    public final void rule__XorExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5605:1: ( rule__XorExpression__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:5606:2: rule__XorExpression__Group_1_0_0__1__Impl
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
    // InternalPortugolParser.g:5612:1: rule__XorExpression__Group_1_0_0__1__Impl : ( ( rule__XorExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__XorExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5616:1: ( ( ( rule__XorExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:5617:1: ( ( rule__XorExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:5617:1: ( ( rule__XorExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:5618:2: ( rule__XorExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:5619:2: ( rule__XorExpression__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:5619:3: rule__XorExpression__OpAssignment_1_0_0_1
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
    // InternalPortugolParser.g:5628:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5632:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalPortugolParser.g:5633:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalPortugolParser.g:5640:1: rule__AndExpression__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5644:1: ( ( ruleComparison ) )
            // InternalPortugolParser.g:5645:1: ( ruleComparison )
            {
            // InternalPortugolParser.g:5645:1: ( ruleComparison )
            // InternalPortugolParser.g:5646:2: ruleComparison
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
    // InternalPortugolParser.g:5655:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5659:1: ( rule__AndExpression__Group__1__Impl )
            // InternalPortugolParser.g:5660:2: rule__AndExpression__Group__1__Impl
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
    // InternalPortugolParser.g:5666:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5670:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalPortugolParser.g:5671:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalPortugolParser.g:5671:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalPortugolParser.g:5672:2: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:5673:2: ( rule__AndExpression__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==Ampersand||LA42_0==E) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalPortugolParser.g:5673:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalPortugolParser.g:5682:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5686:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalPortugolParser.g:5687:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
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
    // InternalPortugolParser.g:5694:1: rule__AndExpression__Group_1__0__Impl : ( ( rule__AndExpression__Group_1_0__0 ) ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5698:1: ( ( ( rule__AndExpression__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:5699:1: ( ( rule__AndExpression__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:5699:1: ( ( rule__AndExpression__Group_1_0__0 ) )
            // InternalPortugolParser.g:5700:2: ( rule__AndExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:5701:2: ( rule__AndExpression__Group_1_0__0 )
            // InternalPortugolParser.g:5701:3: rule__AndExpression__Group_1_0__0
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
    // InternalPortugolParser.g:5709:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5713:1: ( rule__AndExpression__Group_1__1__Impl )
            // InternalPortugolParser.g:5714:2: rule__AndExpression__Group_1__1__Impl
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
    // InternalPortugolParser.g:5720:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__RightAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5724:1: ( ( ( rule__AndExpression__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:5725:1: ( ( rule__AndExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:5725:1: ( ( rule__AndExpression__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:5726:2: ( rule__AndExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:5727:2: ( rule__AndExpression__RightAssignment_1_1 )
            // InternalPortugolParser.g:5727:3: rule__AndExpression__RightAssignment_1_1
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
    // InternalPortugolParser.g:5736:1: rule__AndExpression__Group_1_0__0 : rule__AndExpression__Group_1_0__0__Impl ;
    public final void rule__AndExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5740:1: ( rule__AndExpression__Group_1_0__0__Impl )
            // InternalPortugolParser.g:5741:2: rule__AndExpression__Group_1_0__0__Impl
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
    // InternalPortugolParser.g:5747:1: rule__AndExpression__Group_1_0__0__Impl : ( ( rule__AndExpression__Group_1_0_0__0 ) ) ;
    public final void rule__AndExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5751:1: ( ( ( rule__AndExpression__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:5752:1: ( ( rule__AndExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:5752:1: ( ( rule__AndExpression__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:5753:2: ( rule__AndExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:5754:2: ( rule__AndExpression__Group_1_0_0__0 )
            // InternalPortugolParser.g:5754:3: rule__AndExpression__Group_1_0_0__0
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
    // InternalPortugolParser.g:5763:1: rule__AndExpression__Group_1_0_0__0 : rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1 ;
    public final void rule__AndExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5767:1: ( rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1 )
            // InternalPortugolParser.g:5768:2: rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalPortugolParser.g:5775:1: rule__AndExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5779:1: ( ( () ) )
            // InternalPortugolParser.g:5780:1: ( () )
            {
            // InternalPortugolParser.g:5780:1: ( () )
            // InternalPortugolParser.g:5781:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:5782:2: ()
            // InternalPortugolParser.g:5782:3: 
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
    // InternalPortugolParser.g:5790:1: rule__AndExpression__Group_1_0_0__1 : rule__AndExpression__Group_1_0_0__1__Impl ;
    public final void rule__AndExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5794:1: ( rule__AndExpression__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:5795:2: rule__AndExpression__Group_1_0_0__1__Impl
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
    // InternalPortugolParser.g:5801:1: rule__AndExpression__Group_1_0_0__1__Impl : ( ( rule__AndExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__AndExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5805:1: ( ( ( rule__AndExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:5806:1: ( ( rule__AndExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:5806:1: ( ( rule__AndExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:5807:2: ( rule__AndExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:5808:2: ( rule__AndExpression__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:5808:3: rule__AndExpression__OpAssignment_1_0_0_1
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
    // InternalPortugolParser.g:5817:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5821:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalPortugolParser.g:5822:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalPortugolParser.g:5829:1: rule__Comparison__Group__0__Impl : ( ruleEquExpression ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5833:1: ( ( ruleEquExpression ) )
            // InternalPortugolParser.g:5834:1: ( ruleEquExpression )
            {
            // InternalPortugolParser.g:5834:1: ( ruleEquExpression )
            // InternalPortugolParser.g:5835:2: ruleEquExpression
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
    // InternalPortugolParser.g:5844:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5848:1: ( rule__Comparison__Group__1__Impl )
            // InternalPortugolParser.g:5849:2: rule__Comparison__Group__1__Impl
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
    // InternalPortugolParser.g:5855:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5859:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalPortugolParser.g:5860:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalPortugolParser.g:5860:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalPortugolParser.g:5861:2: ( rule__Comparison__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:5862:2: ( rule__Comparison__Group_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==LessThanSignGreaterThanSign||LA43_0==EqualsSign) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalPortugolParser.g:5862:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalPortugolParser.g:5871:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5875:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalPortugolParser.g:5876:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
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
    // InternalPortugolParser.g:5883:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Group_1_0__0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5887:1: ( ( ( rule__Comparison__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:5888:1: ( ( rule__Comparison__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:5888:1: ( ( rule__Comparison__Group_1_0__0 ) )
            // InternalPortugolParser.g:5889:2: ( rule__Comparison__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:5890:2: ( rule__Comparison__Group_1_0__0 )
            // InternalPortugolParser.g:5890:3: rule__Comparison__Group_1_0__0
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
    // InternalPortugolParser.g:5898:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5902:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalPortugolParser.g:5903:2: rule__Comparison__Group_1__1__Impl
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
    // InternalPortugolParser.g:5909:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5913:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:5914:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:5914:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:5915:2: ( rule__Comparison__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:5916:2: ( rule__Comparison__RightAssignment_1_1 )
            // InternalPortugolParser.g:5916:3: rule__Comparison__RightAssignment_1_1
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
    // InternalPortugolParser.g:5925:1: rule__Comparison__Group_1_0__0 : rule__Comparison__Group_1_0__0__Impl ;
    public final void rule__Comparison__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5929:1: ( rule__Comparison__Group_1_0__0__Impl )
            // InternalPortugolParser.g:5930:2: rule__Comparison__Group_1_0__0__Impl
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
    // InternalPortugolParser.g:5936:1: rule__Comparison__Group_1_0__0__Impl : ( ( rule__Comparison__Group_1_0_0__0 ) ) ;
    public final void rule__Comparison__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5940:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:5941:1: ( ( rule__Comparison__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:5941:1: ( ( rule__Comparison__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:5942:2: ( rule__Comparison__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:5943:2: ( rule__Comparison__Group_1_0_0__0 )
            // InternalPortugolParser.g:5943:3: rule__Comparison__Group_1_0_0__0
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
    // InternalPortugolParser.g:5952:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5956:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalPortugolParser.g:5957:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalPortugolParser.g:5964:1: rule__Comparison__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5968:1: ( ( () ) )
            // InternalPortugolParser.g:5969:1: ( () )
            {
            // InternalPortugolParser.g:5969:1: ( () )
            // InternalPortugolParser.g:5970:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:5971:2: ()
            // InternalPortugolParser.g:5971:3: 
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
    // InternalPortugolParser.g:5979:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5983:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:5984:2: rule__Comparison__Group_1_0_0__1__Impl
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
    // InternalPortugolParser.g:5990:1: rule__Comparison__Group_1_0_0__1__Impl : ( ( rule__Comparison__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:5994:1: ( ( ( rule__Comparison__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:5995:1: ( ( rule__Comparison__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:5995:1: ( ( rule__Comparison__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:5996:2: ( rule__Comparison__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:5997:2: ( rule__Comparison__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:5997:3: rule__Comparison__OpAssignment_1_0_0_1
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
    // InternalPortugolParser.g:6006:1: rule__EquExpression__Group__0 : rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1 ;
    public final void rule__EquExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6010:1: ( rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1 )
            // InternalPortugolParser.g:6011:2: rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalPortugolParser.g:6018:1: rule__EquExpression__Group__0__Impl : ( ruleAddExpression ) ;
    public final void rule__EquExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6022:1: ( ( ruleAddExpression ) )
            // InternalPortugolParser.g:6023:1: ( ruleAddExpression )
            {
            // InternalPortugolParser.g:6023:1: ( ruleAddExpression )
            // InternalPortugolParser.g:6024:2: ruleAddExpression
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
    // InternalPortugolParser.g:6033:1: rule__EquExpression__Group__1 : rule__EquExpression__Group__1__Impl ;
    public final void rule__EquExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6037:1: ( rule__EquExpression__Group__1__Impl )
            // InternalPortugolParser.g:6038:2: rule__EquExpression__Group__1__Impl
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
    // InternalPortugolParser.g:6044:1: rule__EquExpression__Group__1__Impl : ( ( rule__EquExpression__Group_1__0 )* ) ;
    public final void rule__EquExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6048:1: ( ( ( rule__EquExpression__Group_1__0 )* ) )
            // InternalPortugolParser.g:6049:1: ( ( rule__EquExpression__Group_1__0 )* )
            {
            // InternalPortugolParser.g:6049:1: ( ( rule__EquExpression__Group_1__0 )* )
            // InternalPortugolParser.g:6050:2: ( rule__EquExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:6051:2: ( rule__EquExpression__Group_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==LessThanSignEqualsSign||LA44_0==GreaterThanSignEqualsSign||LA44_0==LessThanSign||LA44_0==GreaterThanSign) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalPortugolParser.g:6051:3: rule__EquExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__EquExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalPortugolParser.g:6060:1: rule__EquExpression__Group_1__0 : rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1 ;
    public final void rule__EquExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6064:1: ( rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1 )
            // InternalPortugolParser.g:6065:2: rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1
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
    // InternalPortugolParser.g:6072:1: rule__EquExpression__Group_1__0__Impl : ( ( rule__EquExpression__Group_1_0__0 ) ) ;
    public final void rule__EquExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6076:1: ( ( ( rule__EquExpression__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:6077:1: ( ( rule__EquExpression__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:6077:1: ( ( rule__EquExpression__Group_1_0__0 ) )
            // InternalPortugolParser.g:6078:2: ( rule__EquExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:6079:2: ( rule__EquExpression__Group_1_0__0 )
            // InternalPortugolParser.g:6079:3: rule__EquExpression__Group_1_0__0
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
    // InternalPortugolParser.g:6087:1: rule__EquExpression__Group_1__1 : rule__EquExpression__Group_1__1__Impl ;
    public final void rule__EquExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6091:1: ( rule__EquExpression__Group_1__1__Impl )
            // InternalPortugolParser.g:6092:2: rule__EquExpression__Group_1__1__Impl
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
    // InternalPortugolParser.g:6098:1: rule__EquExpression__Group_1__1__Impl : ( ( rule__EquExpression__RightAssignment_1_1 ) ) ;
    public final void rule__EquExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6102:1: ( ( ( rule__EquExpression__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:6103:1: ( ( rule__EquExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:6103:1: ( ( rule__EquExpression__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:6104:2: ( rule__EquExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:6105:2: ( rule__EquExpression__RightAssignment_1_1 )
            // InternalPortugolParser.g:6105:3: rule__EquExpression__RightAssignment_1_1
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
    // InternalPortugolParser.g:6114:1: rule__EquExpression__Group_1_0__0 : rule__EquExpression__Group_1_0__0__Impl ;
    public final void rule__EquExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6118:1: ( rule__EquExpression__Group_1_0__0__Impl )
            // InternalPortugolParser.g:6119:2: rule__EquExpression__Group_1_0__0__Impl
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
    // InternalPortugolParser.g:6125:1: rule__EquExpression__Group_1_0__0__Impl : ( ( rule__EquExpression__Group_1_0_0__0 ) ) ;
    public final void rule__EquExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6129:1: ( ( ( rule__EquExpression__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:6130:1: ( ( rule__EquExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:6130:1: ( ( rule__EquExpression__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:6131:2: ( rule__EquExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:6132:2: ( rule__EquExpression__Group_1_0_0__0 )
            // InternalPortugolParser.g:6132:3: rule__EquExpression__Group_1_0_0__0
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
    // InternalPortugolParser.g:6141:1: rule__EquExpression__Group_1_0_0__0 : rule__EquExpression__Group_1_0_0__0__Impl rule__EquExpression__Group_1_0_0__1 ;
    public final void rule__EquExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6145:1: ( rule__EquExpression__Group_1_0_0__0__Impl rule__EquExpression__Group_1_0_0__1 )
            // InternalPortugolParser.g:6146:2: rule__EquExpression__Group_1_0_0__0__Impl rule__EquExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalPortugolParser.g:6153:1: rule__EquExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__EquExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6157:1: ( ( () ) )
            // InternalPortugolParser.g:6158:1: ( () )
            {
            // InternalPortugolParser.g:6158:1: ( () )
            // InternalPortugolParser.g:6159:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:6160:2: ()
            // InternalPortugolParser.g:6160:3: 
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
    // InternalPortugolParser.g:6168:1: rule__EquExpression__Group_1_0_0__1 : rule__EquExpression__Group_1_0_0__1__Impl ;
    public final void rule__EquExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6172:1: ( rule__EquExpression__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:6173:2: rule__EquExpression__Group_1_0_0__1__Impl
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
    // InternalPortugolParser.g:6179:1: rule__EquExpression__Group_1_0_0__1__Impl : ( ( rule__EquExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__EquExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6183:1: ( ( ( rule__EquExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:6184:1: ( ( rule__EquExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:6184:1: ( ( rule__EquExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:6185:2: ( rule__EquExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:6186:2: ( rule__EquExpression__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:6186:3: rule__EquExpression__OpAssignment_1_0_0_1
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
    // InternalPortugolParser.g:6195:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6199:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // InternalPortugolParser.g:6200:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalPortugolParser.g:6207:1: rule__AddExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6211:1: ( ( ruleMultiplicativeExpression ) )
            // InternalPortugolParser.g:6212:1: ( ruleMultiplicativeExpression )
            {
            // InternalPortugolParser.g:6212:1: ( ruleMultiplicativeExpression )
            // InternalPortugolParser.g:6213:2: ruleMultiplicativeExpression
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
    // InternalPortugolParser.g:6222:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6226:1: ( rule__AddExpression__Group__1__Impl )
            // InternalPortugolParser.g:6227:2: rule__AddExpression__Group__1__Impl
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
    // InternalPortugolParser.g:6233:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6237:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // InternalPortugolParser.g:6238:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // InternalPortugolParser.g:6238:1: ( ( rule__AddExpression__Group_1__0 )* )
            // InternalPortugolParser.g:6239:2: ( rule__AddExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:6240:2: ( rule__AddExpression__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==PlusSign||LA45_0==HyphenMinus) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalPortugolParser.g:6240:3: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__AddExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalPortugolParser.g:6249:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6253:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // InternalPortugolParser.g:6254:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
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
    // InternalPortugolParser.g:6261:1: rule__AddExpression__Group_1__0__Impl : ( ( rule__AddExpression__Group_1_0__0 ) ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6265:1: ( ( ( rule__AddExpression__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:6266:1: ( ( rule__AddExpression__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:6266:1: ( ( rule__AddExpression__Group_1_0__0 ) )
            // InternalPortugolParser.g:6267:2: ( rule__AddExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:6268:2: ( rule__AddExpression__Group_1_0__0 )
            // InternalPortugolParser.g:6268:3: rule__AddExpression__Group_1_0__0
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
    // InternalPortugolParser.g:6276:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6280:1: ( rule__AddExpression__Group_1__1__Impl )
            // InternalPortugolParser.g:6281:2: rule__AddExpression__Group_1__1__Impl
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
    // InternalPortugolParser.g:6287:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__RightAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6291:1: ( ( ( rule__AddExpression__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:6292:1: ( ( rule__AddExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:6292:1: ( ( rule__AddExpression__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:6293:2: ( rule__AddExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:6294:2: ( rule__AddExpression__RightAssignment_1_1 )
            // InternalPortugolParser.g:6294:3: rule__AddExpression__RightAssignment_1_1
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
    // InternalPortugolParser.g:6303:1: rule__AddExpression__Group_1_0__0 : rule__AddExpression__Group_1_0__0__Impl ;
    public final void rule__AddExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6307:1: ( rule__AddExpression__Group_1_0__0__Impl )
            // InternalPortugolParser.g:6308:2: rule__AddExpression__Group_1_0__0__Impl
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
    // InternalPortugolParser.g:6314:1: rule__AddExpression__Group_1_0__0__Impl : ( ( rule__AddExpression__Group_1_0_0__0 ) ) ;
    public final void rule__AddExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6318:1: ( ( ( rule__AddExpression__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:6319:1: ( ( rule__AddExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:6319:1: ( ( rule__AddExpression__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:6320:2: ( rule__AddExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:6321:2: ( rule__AddExpression__Group_1_0_0__0 )
            // InternalPortugolParser.g:6321:3: rule__AddExpression__Group_1_0_0__0
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
    // InternalPortugolParser.g:6330:1: rule__AddExpression__Group_1_0_0__0 : rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1 ;
    public final void rule__AddExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6334:1: ( rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1 )
            // InternalPortugolParser.g:6335:2: rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalPortugolParser.g:6342:1: rule__AddExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6346:1: ( ( () ) )
            // InternalPortugolParser.g:6347:1: ( () )
            {
            // InternalPortugolParser.g:6347:1: ( () )
            // InternalPortugolParser.g:6348:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:6349:2: ()
            // InternalPortugolParser.g:6349:3: 
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
    // InternalPortugolParser.g:6357:1: rule__AddExpression__Group_1_0_0__1 : rule__AddExpression__Group_1_0_0__1__Impl ;
    public final void rule__AddExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6361:1: ( rule__AddExpression__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:6362:2: rule__AddExpression__Group_1_0_0__1__Impl
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
    // InternalPortugolParser.g:6368:1: rule__AddExpression__Group_1_0_0__1__Impl : ( ( rule__AddExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__AddExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6372:1: ( ( ( rule__AddExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:6373:1: ( ( rule__AddExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:6373:1: ( ( rule__AddExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:6374:2: ( rule__AddExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:6375:2: ( rule__AddExpression__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:6375:3: rule__AddExpression__OpAssignment_1_0_0_1
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
    // InternalPortugolParser.g:6384:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6388:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalPortugolParser.g:6389:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalPortugolParser.g:6396:1: rule__MultiplicativeExpression__Group__0__Impl : ( rulePowerExpression ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6400:1: ( ( rulePowerExpression ) )
            // InternalPortugolParser.g:6401:1: ( rulePowerExpression )
            {
            // InternalPortugolParser.g:6401:1: ( rulePowerExpression )
            // InternalPortugolParser.g:6402:2: rulePowerExpression
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
    // InternalPortugolParser.g:6411:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6415:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalPortugolParser.g:6416:2: rule__MultiplicativeExpression__Group__1__Impl
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
    // InternalPortugolParser.g:6422:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6426:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalPortugolParser.g:6427:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalPortugolParser.g:6427:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalPortugolParser.g:6428:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:6429:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==MOD||LA46_0==PercentSign||LA46_0==Asterisk||LA46_0==Solidus) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalPortugolParser.g:6429:3: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalPortugolParser.g:6438:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6442:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalPortugolParser.g:6443:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
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
    // InternalPortugolParser.g:6450:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( ( rule__MultiplicativeExpression__Group_1_0__0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6454:1: ( ( ( rule__MultiplicativeExpression__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:6455:1: ( ( rule__MultiplicativeExpression__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:6455:1: ( ( rule__MultiplicativeExpression__Group_1_0__0 ) )
            // InternalPortugolParser.g:6456:2: ( rule__MultiplicativeExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:6457:2: ( rule__MultiplicativeExpression__Group_1_0__0 )
            // InternalPortugolParser.g:6457:3: rule__MultiplicativeExpression__Group_1_0__0
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
    // InternalPortugolParser.g:6465:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6469:1: ( rule__MultiplicativeExpression__Group_1__1__Impl )
            // InternalPortugolParser.g:6470:2: rule__MultiplicativeExpression__Group_1__1__Impl
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
    // InternalPortugolParser.g:6476:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6480:1: ( ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:6481:1: ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:6481:1: ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:6482:2: ( rule__MultiplicativeExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:6483:2: ( rule__MultiplicativeExpression__RightAssignment_1_1 )
            // InternalPortugolParser.g:6483:3: rule__MultiplicativeExpression__RightAssignment_1_1
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
    // InternalPortugolParser.g:6492:1: rule__MultiplicativeExpression__Group_1_0__0 : rule__MultiplicativeExpression__Group_1_0__0__Impl ;
    public final void rule__MultiplicativeExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6496:1: ( rule__MultiplicativeExpression__Group_1_0__0__Impl )
            // InternalPortugolParser.g:6497:2: rule__MultiplicativeExpression__Group_1_0__0__Impl
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
    // InternalPortugolParser.g:6503:1: rule__MultiplicativeExpression__Group_1_0__0__Impl : ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6507:1: ( ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:6508:1: ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:6508:1: ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:6509:2: ( rule__MultiplicativeExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:6510:2: ( rule__MultiplicativeExpression__Group_1_0_0__0 )
            // InternalPortugolParser.g:6510:3: rule__MultiplicativeExpression__Group_1_0_0__0
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
    // InternalPortugolParser.g:6519:1: rule__MultiplicativeExpression__Group_1_0_0__0 : rule__MultiplicativeExpression__Group_1_0_0__0__Impl rule__MultiplicativeExpression__Group_1_0_0__1 ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6523:1: ( rule__MultiplicativeExpression__Group_1_0_0__0__Impl rule__MultiplicativeExpression__Group_1_0_0__1 )
            // InternalPortugolParser.g:6524:2: rule__MultiplicativeExpression__Group_1_0_0__0__Impl rule__MultiplicativeExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalPortugolParser.g:6531:1: rule__MultiplicativeExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6535:1: ( ( () ) )
            // InternalPortugolParser.g:6536:1: ( () )
            {
            // InternalPortugolParser.g:6536:1: ( () )
            // InternalPortugolParser.g:6537:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:6538:2: ()
            // InternalPortugolParser.g:6538:3: 
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
    // InternalPortugolParser.g:6546:1: rule__MultiplicativeExpression__Group_1_0_0__1 : rule__MultiplicativeExpression__Group_1_0_0__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6550:1: ( rule__MultiplicativeExpression__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:6551:2: rule__MultiplicativeExpression__Group_1_0_0__1__Impl
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
    // InternalPortugolParser.g:6557:1: rule__MultiplicativeExpression__Group_1_0_0__1__Impl : ( ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6561:1: ( ( ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:6562:1: ( ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:6562:1: ( ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:6563:2: ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:6564:2: ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:6564:3: rule__MultiplicativeExpression__OpAssignment_1_0_0_1
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
    // InternalPortugolParser.g:6573:1: rule__PowerExpression__Group__0 : rule__PowerExpression__Group__0__Impl rule__PowerExpression__Group__1 ;
    public final void rule__PowerExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6577:1: ( rule__PowerExpression__Group__0__Impl rule__PowerExpression__Group__1 )
            // InternalPortugolParser.g:6578:2: rule__PowerExpression__Group__0__Impl rule__PowerExpression__Group__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalPortugolParser.g:6585:1: rule__PowerExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__PowerExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6589:1: ( ( ruleUnaryExpression ) )
            // InternalPortugolParser.g:6590:1: ( ruleUnaryExpression )
            {
            // InternalPortugolParser.g:6590:1: ( ruleUnaryExpression )
            // InternalPortugolParser.g:6591:2: ruleUnaryExpression
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
    // InternalPortugolParser.g:6600:1: rule__PowerExpression__Group__1 : rule__PowerExpression__Group__1__Impl ;
    public final void rule__PowerExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6604:1: ( rule__PowerExpression__Group__1__Impl )
            // InternalPortugolParser.g:6605:2: rule__PowerExpression__Group__1__Impl
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
    // InternalPortugolParser.g:6611:1: rule__PowerExpression__Group__1__Impl : ( ( rule__PowerExpression__Group_1__0 )* ) ;
    public final void rule__PowerExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6615:1: ( ( ( rule__PowerExpression__Group_1__0 )* ) )
            // InternalPortugolParser.g:6616:1: ( ( rule__PowerExpression__Group_1__0 )* )
            {
            // InternalPortugolParser.g:6616:1: ( ( rule__PowerExpression__Group_1__0 )* )
            // InternalPortugolParser.g:6617:2: ( rule__PowerExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup_1()); 
            }
            // InternalPortugolParser.g:6618:2: ( rule__PowerExpression__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==CircumflexAccent) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalPortugolParser.g:6618:3: rule__PowerExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__PowerExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalPortugolParser.g:6627:1: rule__PowerExpression__Group_1__0 : rule__PowerExpression__Group_1__0__Impl rule__PowerExpression__Group_1__1 ;
    public final void rule__PowerExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6631:1: ( rule__PowerExpression__Group_1__0__Impl rule__PowerExpression__Group_1__1 )
            // InternalPortugolParser.g:6632:2: rule__PowerExpression__Group_1__0__Impl rule__PowerExpression__Group_1__1
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
    // InternalPortugolParser.g:6639:1: rule__PowerExpression__Group_1__0__Impl : ( ( rule__PowerExpression__Group_1_0__0 ) ) ;
    public final void rule__PowerExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6643:1: ( ( ( rule__PowerExpression__Group_1_0__0 ) ) )
            // InternalPortugolParser.g:6644:1: ( ( rule__PowerExpression__Group_1_0__0 ) )
            {
            // InternalPortugolParser.g:6644:1: ( ( rule__PowerExpression__Group_1_0__0 ) )
            // InternalPortugolParser.g:6645:2: ( rule__PowerExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugolParser.g:6646:2: ( rule__PowerExpression__Group_1_0__0 )
            // InternalPortugolParser.g:6646:3: rule__PowerExpression__Group_1_0__0
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
    // InternalPortugolParser.g:6654:1: rule__PowerExpression__Group_1__1 : rule__PowerExpression__Group_1__1__Impl ;
    public final void rule__PowerExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6658:1: ( rule__PowerExpression__Group_1__1__Impl )
            // InternalPortugolParser.g:6659:2: rule__PowerExpression__Group_1__1__Impl
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
    // InternalPortugolParser.g:6665:1: rule__PowerExpression__Group_1__1__Impl : ( ( rule__PowerExpression__RightAssignment_1_1 ) ) ;
    public final void rule__PowerExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6669:1: ( ( ( rule__PowerExpression__RightAssignment_1_1 ) ) )
            // InternalPortugolParser.g:6670:1: ( ( rule__PowerExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugolParser.g:6670:1: ( ( rule__PowerExpression__RightAssignment_1_1 ) )
            // InternalPortugolParser.g:6671:2: ( rule__PowerExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugolParser.g:6672:2: ( rule__PowerExpression__RightAssignment_1_1 )
            // InternalPortugolParser.g:6672:3: rule__PowerExpression__RightAssignment_1_1
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
    // InternalPortugolParser.g:6681:1: rule__PowerExpression__Group_1_0__0 : rule__PowerExpression__Group_1_0__0__Impl ;
    public final void rule__PowerExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6685:1: ( rule__PowerExpression__Group_1_0__0__Impl )
            // InternalPortugolParser.g:6686:2: rule__PowerExpression__Group_1_0__0__Impl
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
    // InternalPortugolParser.g:6692:1: rule__PowerExpression__Group_1_0__0__Impl : ( ( rule__PowerExpression__Group_1_0_0__0 ) ) ;
    public final void rule__PowerExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6696:1: ( ( ( rule__PowerExpression__Group_1_0_0__0 ) ) )
            // InternalPortugolParser.g:6697:1: ( ( rule__PowerExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugolParser.g:6697:1: ( ( rule__PowerExpression__Group_1_0_0__0 ) )
            // InternalPortugolParser.g:6698:2: ( rule__PowerExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugolParser.g:6699:2: ( rule__PowerExpression__Group_1_0_0__0 )
            // InternalPortugolParser.g:6699:3: rule__PowerExpression__Group_1_0_0__0
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
    // InternalPortugolParser.g:6708:1: rule__PowerExpression__Group_1_0_0__0 : rule__PowerExpression__Group_1_0_0__0__Impl rule__PowerExpression__Group_1_0_0__1 ;
    public final void rule__PowerExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6712:1: ( rule__PowerExpression__Group_1_0_0__0__Impl rule__PowerExpression__Group_1_0_0__1 )
            // InternalPortugolParser.g:6713:2: rule__PowerExpression__Group_1_0_0__0__Impl rule__PowerExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalPortugolParser.g:6720:1: rule__PowerExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PowerExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6724:1: ( ( () ) )
            // InternalPortugolParser.g:6725:1: ( () )
            {
            // InternalPortugolParser.g:6725:1: ( () )
            // InternalPortugolParser.g:6726:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugolParser.g:6727:2: ()
            // InternalPortugolParser.g:6727:3: 
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
    // InternalPortugolParser.g:6735:1: rule__PowerExpression__Group_1_0_0__1 : rule__PowerExpression__Group_1_0_0__1__Impl ;
    public final void rule__PowerExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6739:1: ( rule__PowerExpression__Group_1_0_0__1__Impl )
            // InternalPortugolParser.g:6740:2: rule__PowerExpression__Group_1_0_0__1__Impl
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
    // InternalPortugolParser.g:6746:1: rule__PowerExpression__Group_1_0_0__1__Impl : ( ( rule__PowerExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__PowerExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6750:1: ( ( ( rule__PowerExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugolParser.g:6751:1: ( ( rule__PowerExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugolParser.g:6751:1: ( ( rule__PowerExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugolParser.g:6752:2: ( rule__PowerExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugolParser.g:6753:2: ( rule__PowerExpression__OpAssignment_1_0_0_1 )
            // InternalPortugolParser.g:6753:3: rule__PowerExpression__OpAssignment_1_0_0_1
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
    // InternalPortugolParser.g:6762:1: rule__UnaryExpression__Group_0__0 : rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 ;
    public final void rule__UnaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6766:1: ( rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 )
            // InternalPortugolParser.g:6767:2: rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalPortugolParser.g:6774:1: rule__UnaryExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6778:1: ( ( () ) )
            // InternalPortugolParser.g:6779:1: ( () )
            {
            // InternalPortugolParser.g:6779:1: ( () )
            // InternalPortugolParser.g:6780:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_0_0()); 
            }
            // InternalPortugolParser.g:6781:2: ()
            // InternalPortugolParser.g:6781:3: 
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
    // InternalPortugolParser.g:6789:1: rule__UnaryExpression__Group_0__1 : rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 ;
    public final void rule__UnaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6793:1: ( rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 )
            // InternalPortugolParser.g:6794:2: rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2
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
    // InternalPortugolParser.g:6801:1: rule__UnaryExpression__Group_0__1__Impl : ( ( rule__UnaryExpression__OpAssignment_0_1 ) ) ;
    public final void rule__UnaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6805:1: ( ( ( rule__UnaryExpression__OpAssignment_0_1 ) ) )
            // InternalPortugolParser.g:6806:1: ( ( rule__UnaryExpression__OpAssignment_0_1 ) )
            {
            // InternalPortugolParser.g:6806:1: ( ( rule__UnaryExpression__OpAssignment_0_1 ) )
            // InternalPortugolParser.g:6807:2: ( rule__UnaryExpression__OpAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOpAssignment_0_1()); 
            }
            // InternalPortugolParser.g:6808:2: ( rule__UnaryExpression__OpAssignment_0_1 )
            // InternalPortugolParser.g:6808:3: rule__UnaryExpression__OpAssignment_0_1
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
    // InternalPortugolParser.g:6816:1: rule__UnaryExpression__Group_0__2 : rule__UnaryExpression__Group_0__2__Impl ;
    public final void rule__UnaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6820:1: ( rule__UnaryExpression__Group_0__2__Impl )
            // InternalPortugolParser.g:6821:2: rule__UnaryExpression__Group_0__2__Impl
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
    // InternalPortugolParser.g:6827:1: rule__UnaryExpression__Group_0__2__Impl : ( ( rule__UnaryExpression__OperandAssignment_0_2 ) ) ;
    public final void rule__UnaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6831:1: ( ( ( rule__UnaryExpression__OperandAssignment_0_2 ) ) )
            // InternalPortugolParser.g:6832:1: ( ( rule__UnaryExpression__OperandAssignment_0_2 ) )
            {
            // InternalPortugolParser.g:6832:1: ( ( rule__UnaryExpression__OperandAssignment_0_2 ) )
            // InternalPortugolParser.g:6833:2: ( rule__UnaryExpression__OperandAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_0_2()); 
            }
            // InternalPortugolParser.g:6834:2: ( rule__UnaryExpression__OperandAssignment_0_2 )
            // InternalPortugolParser.g:6834:3: rule__UnaryExpression__OperandAssignment_0_2
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


    // $ANTLR start "rule__PrimaryExpression__Group_3__0"
    // InternalPortugolParser.g:6843:1: rule__PrimaryExpression__Group_3__0 : rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 ;
    public final void rule__PrimaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6847:1: ( rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 )
            // InternalPortugolParser.g:6848:2: rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__PrimaryExpression__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__0"


    // $ANTLR start "rule__PrimaryExpression__Group_3__0__Impl"
    // InternalPortugolParser.g:6855:1: rule__PrimaryExpression__Group_3__0__Impl : ( LeftParenthesis ) ;
    public final void rule__PrimaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6859:1: ( ( LeftParenthesis ) )
            // InternalPortugolParser.g:6860:1: ( LeftParenthesis )
            {
            // InternalPortugolParser.g:6860:1: ( LeftParenthesis )
            // InternalPortugolParser.g:6861:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__1"
    // InternalPortugolParser.g:6870:1: rule__PrimaryExpression__Group_3__1 : rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2 ;
    public final void rule__PrimaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6874:1: ( rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2 )
            // InternalPortugolParser.g:6875:2: rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2
            {
            pushFollow(FOLLOW_15);
            rule__PrimaryExpression__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__1"


    // $ANTLR start "rule__PrimaryExpression__Group_3__1__Impl"
    // InternalPortugolParser.g:6882:1: rule__PrimaryExpression__Group_3__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6886:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:6887:1: ( ruleExpression )
            {
            // InternalPortugolParser.g:6887:1: ( ruleExpression )
            // InternalPortugolParser.g:6888:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_3_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__2"
    // InternalPortugolParser.g:6897:1: rule__PrimaryExpression__Group_3__2 : rule__PrimaryExpression__Group_3__2__Impl ;
    public final void rule__PrimaryExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6901:1: ( rule__PrimaryExpression__Group_3__2__Impl )
            // InternalPortugolParser.g:6902:2: rule__PrimaryExpression__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__2"


    // $ANTLR start "rule__PrimaryExpression__Group_3__2__Impl"
    // InternalPortugolParser.g:6908:1: rule__PrimaryExpression__Group_3__2__Impl : ( RightParenthesis ) ;
    public final void rule__PrimaryExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6912:1: ( ( RightParenthesis ) )
            // InternalPortugolParser.g:6913:1: ( RightParenthesis )
            {
            // InternalPortugolParser.g:6913:1: ( RightParenthesis )
            // InternalPortugolParser.g:6914:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group__0"
    // InternalPortugolParser.g:6924:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6928:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalPortugolParser.g:6929:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalPortugolParser.g:6936:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__FbNameAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6940:1: ( ( ( rule__FunctionCall__FbNameAssignment_0 ) ) )
            // InternalPortugolParser.g:6941:1: ( ( rule__FunctionCall__FbNameAssignment_0 ) )
            {
            // InternalPortugolParser.g:6941:1: ( ( rule__FunctionCall__FbNameAssignment_0 ) )
            // InternalPortugolParser.g:6942:2: ( rule__FunctionCall__FbNameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFbNameAssignment_0()); 
            }
            // InternalPortugolParser.g:6943:2: ( rule__FunctionCall__FbNameAssignment_0 )
            // InternalPortugolParser.g:6943:3: rule__FunctionCall__FbNameAssignment_0
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
    // InternalPortugolParser.g:6951:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6955:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // InternalPortugolParser.g:6956:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
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
    // InternalPortugolParser.g:6963:1: rule__FunctionCall__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6967:1: ( ( LeftParenthesis ) )
            // InternalPortugolParser.g:6968:1: ( LeftParenthesis )
            {
            // InternalPortugolParser.g:6968:1: ( LeftParenthesis )
            // InternalPortugolParser.g:6969:2: LeftParenthesis
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
    // InternalPortugolParser.g:6978:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6982:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // InternalPortugolParser.g:6983:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalPortugolParser.g:6990:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__ParamAssignment_2 ) ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:6994:1: ( ( ( rule__FunctionCall__ParamAssignment_2 ) ) )
            // InternalPortugolParser.g:6995:1: ( ( rule__FunctionCall__ParamAssignment_2 ) )
            {
            // InternalPortugolParser.g:6995:1: ( ( rule__FunctionCall__ParamAssignment_2 ) )
            // InternalPortugolParser.g:6996:2: ( rule__FunctionCall__ParamAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParamAssignment_2()); 
            }
            // InternalPortugolParser.g:6997:2: ( rule__FunctionCall__ParamAssignment_2 )
            // InternalPortugolParser.g:6997:3: rule__FunctionCall__ParamAssignment_2
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
    // InternalPortugolParser.g:7005:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7009:1: ( rule__FunctionCall__Group__3__Impl )
            // InternalPortugolParser.g:7010:2: rule__FunctionCall__Group__3__Impl
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
    // InternalPortugolParser.g:7016:1: rule__FunctionCall__Group__3__Impl : ( RightParenthesis ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7020:1: ( ( RightParenthesis ) )
            // InternalPortugolParser.g:7021:1: ( RightParenthesis )
            {
            // InternalPortugolParser.g:7021:1: ( RightParenthesis )
            // InternalPortugolParser.g:7022:2: RightParenthesis
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


    // $ANTLR start "rule__Model__HeaderAssignment_0"
    // InternalPortugolParser.g:7032:1: rule__Model__HeaderAssignment_0 : ( ruleHeaderBlock ) ;
    public final void rule__Model__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7036:1: ( ( ruleHeaderBlock ) )
            // InternalPortugolParser.g:7037:2: ( ruleHeaderBlock )
            {
            // InternalPortugolParser.g:7037:2: ( ruleHeaderBlock )
            // InternalPortugolParser.g:7038:3: ruleHeaderBlock
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
    // InternalPortugolParser.g:7047:1: rule__Model__GlobalDeclarationsAssignment_1 : ( ruleDeclarationsBlock ) ;
    public final void rule__Model__GlobalDeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7051:1: ( ( ruleDeclarationsBlock ) )
            // InternalPortugolParser.g:7052:2: ( ruleDeclarationsBlock )
            {
            // InternalPortugolParser.g:7052:2: ( ruleDeclarationsBlock )
            // InternalPortugolParser.g:7053:3: ruleDeclarationsBlock
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
    // InternalPortugolParser.g:7062:1: rule__Model__SubprogramsAssignment_2 : ( ruleSubprograms ) ;
    public final void rule__Model__SubprogramsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7066:1: ( ( ruleSubprograms ) )
            // InternalPortugolParser.g:7067:2: ( ruleSubprograms )
            {
            // InternalPortugolParser.g:7067:2: ( ruleSubprograms )
            // InternalPortugolParser.g:7068:3: ruleSubprograms
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
    // InternalPortugolParser.g:7077:1: rule__Model__CommandsAssignment_3 : ( ruleBlockCommand ) ;
    public final void rule__Model__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7081:1: ( ( ruleBlockCommand ) )
            // InternalPortugolParser.g:7082:2: ( ruleBlockCommand )
            {
            // InternalPortugolParser.g:7082:2: ( ruleBlockCommand )
            // InternalPortugolParser.g:7083:3: ruleBlockCommand
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
    // InternalPortugolParser.g:7092:1: rule__HeaderBlock__AlgorithmNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__HeaderBlock__AlgorithmNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7096:1: ( ( RULE_STRING ) )
            // InternalPortugolParser.g:7097:2: ( RULE_STRING )
            {
            // InternalPortugolParser.g:7097:2: ( RULE_STRING )
            // InternalPortugolParser.g:7098:3: RULE_STRING
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
    // InternalPortugolParser.g:7107:1: rule__DeclarationsBlock__VarsAssignment_1_0 : ( ruleVariable ) ;
    public final void rule__DeclarationsBlock__VarsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7111:1: ( ( ruleVariable ) )
            // InternalPortugolParser.g:7112:2: ( ruleVariable )
            {
            // InternalPortugolParser.g:7112:2: ( ruleVariable )
            // InternalPortugolParser.g:7113:3: ruleVariable
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
    // InternalPortugolParser.g:7122:1: rule__Variable__VarDeclarationAssignment_0 : ( ruleVarDeclaration ) ;
    public final void rule__Variable__VarDeclarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7126:1: ( ( ruleVarDeclaration ) )
            // InternalPortugolParser.g:7127:2: ( ruleVarDeclaration )
            {
            // InternalPortugolParser.g:7127:2: ( ruleVarDeclaration )
            // InternalPortugolParser.g:7128:3: ruleVarDeclaration
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
    // InternalPortugolParser.g:7137:1: rule__Variable__TypeAssignment_2 : ( ruleVarType ) ;
    public final void rule__Variable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7141:1: ( ( ruleVarType ) )
            // InternalPortugolParser.g:7142:2: ( ruleVarType )
            {
            // InternalPortugolParser.g:7142:2: ( ruleVarType )
            // InternalPortugolParser.g:7143:3: ruleVarType
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
    // InternalPortugolParser.g:7152:1: rule__VarDeclaration__VarsAssignment_0 : ( ruleVarName ) ;
    public final void rule__VarDeclaration__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7156:1: ( ( ruleVarName ) )
            // InternalPortugolParser.g:7157:2: ( ruleVarName )
            {
            // InternalPortugolParser.g:7157:2: ( ruleVarName )
            // InternalPortugolParser.g:7158:3: ruleVarName
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
    // InternalPortugolParser.g:7167:1: rule__VarDeclaration__VarsAssignment_1_1 : ( ruleVarName ) ;
    public final void rule__VarDeclaration__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7171:1: ( ( ruleVarName ) )
            // InternalPortugolParser.g:7172:2: ( ruleVarName )
            {
            // InternalPortugolParser.g:7172:2: ( ruleVarName )
            // InternalPortugolParser.g:7173:3: ruleVarName
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
    // InternalPortugolParser.g:7182:1: rule__DeclaredVarList__VarsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredVarList__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7186:1: ( ( ( RULE_ID ) ) )
            // InternalPortugolParser.g:7187:2: ( ( RULE_ID ) )
            {
            // InternalPortugolParser.g:7187:2: ( ( RULE_ID ) )
            // InternalPortugolParser.g:7188:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getVarsVarNameCrossReference_0_0()); 
            }
            // InternalPortugolParser.g:7189:3: ( RULE_ID )
            // InternalPortugolParser.g:7190:4: RULE_ID
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
    // InternalPortugolParser.g:7201:1: rule__DeclaredVarList__VarsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredVarList__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7205:1: ( ( ( RULE_ID ) ) )
            // InternalPortugolParser.g:7206:2: ( ( RULE_ID ) )
            {
            // InternalPortugolParser.g:7206:2: ( ( RULE_ID ) )
            // InternalPortugolParser.g:7207:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getVarsVarNameCrossReference_1_1_0()); 
            }
            // InternalPortugolParser.g:7208:3: ( RULE_ID )
            // InternalPortugolParser.g:7209:4: RULE_ID
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
    // InternalPortugolParser.g:7220:1: rule__VarName__NameAssignment : ( RULE_ID ) ;
    public final void rule__VarName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7224:1: ( ( RULE_ID ) )
            // InternalPortugolParser.g:7225:2: ( RULE_ID )
            {
            // InternalPortugolParser.g:7225:2: ( RULE_ID )
            // InternalPortugolParser.g:7226:3: RULE_ID
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
    // InternalPortugolParser.g:7235:1: rule__VarType__TypeNameAssignment : ( ( rule__VarType__TypeNameAlternatives_0 ) ) ;
    public final void rule__VarType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7239:1: ( ( ( rule__VarType__TypeNameAlternatives_0 ) ) )
            // InternalPortugolParser.g:7240:2: ( ( rule__VarType__TypeNameAlternatives_0 ) )
            {
            // InternalPortugolParser.g:7240:2: ( ( rule__VarType__TypeNameAlternatives_0 ) )
            // InternalPortugolParser.g:7241:3: ( rule__VarType__TypeNameAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarTypeAccess().getTypeNameAlternatives_0()); 
            }
            // InternalPortugolParser.g:7242:3: ( rule__VarType__TypeNameAlternatives_0 )
            // InternalPortugolParser.g:7242:4: rule__VarType__TypeNameAlternatives_0
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
    // InternalPortugolParser.g:7250:1: rule__Subprograms__BlockSubProgramsAssignment : ( ruleBlockSubPrograms ) ;
    public final void rule__Subprograms__BlockSubProgramsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7254:1: ( ( ruleBlockSubPrograms ) )
            // InternalPortugolParser.g:7255:2: ( ruleBlockSubPrograms )
            {
            // InternalPortugolParser.g:7255:2: ( ruleBlockSubPrograms )
            // InternalPortugolParser.g:7256:3: ruleBlockSubPrograms
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
    // InternalPortugolParser.g:7265:1: rule__ProcedureName__NameAssignment : ( RULE_ID ) ;
    public final void rule__ProcedureName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7269:1: ( ( RULE_ID ) )
            // InternalPortugolParser.g:7270:2: ( RULE_ID )
            {
            // InternalPortugolParser.g:7270:2: ( RULE_ID )
            // InternalPortugolParser.g:7271:3: RULE_ID
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
    // InternalPortugolParser.g:7280:1: rule__FunctionName__NameAssignment : ( RULE_ID ) ;
    public final void rule__FunctionName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7284:1: ( ( RULE_ID ) )
            // InternalPortugolParser.g:7285:2: ( RULE_ID )
            {
            // InternalPortugolParser.g:7285:2: ( RULE_ID )
            // InternalPortugolParser.g:7286:3: RULE_ID
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
    // InternalPortugolParser.g:7295:1: rule__BlockFunction__FunctionNameAssignment_1 : ( ruleFunctionName ) ;
    public final void rule__BlockFunction__FunctionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7299:1: ( ( ruleFunctionName ) )
            // InternalPortugolParser.g:7300:2: ( ruleFunctionName )
            {
            // InternalPortugolParser.g:7300:2: ( ruleFunctionName )
            // InternalPortugolParser.g:7301:3: ruleFunctionName
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


    // $ANTLR start "rule__BlockFunction__ParamListAssignment_3"
    // InternalPortugolParser.g:7310:1: rule__BlockFunction__ParamListAssignment_3 : ( ruleVariable ) ;
    public final void rule__BlockFunction__ParamListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7314:1: ( ( ruleVariable ) )
            // InternalPortugolParser.g:7315:2: ( ruleVariable )
            {
            // InternalPortugolParser.g:7315:2: ( ruleVariable )
            // InternalPortugolParser.g:7316:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getParamListVariableParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getParamListVariableParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockFunction__ParamListAssignment_3"


    // $ANTLR start "rule__BlockFunction__ReturnTypeAssignment_6"
    // InternalPortugolParser.g:7325:1: rule__BlockFunction__ReturnTypeAssignment_6 : ( ruleVarType ) ;
    public final void rule__BlockFunction__ReturnTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7329:1: ( ( ruleVarType ) )
            // InternalPortugolParser.g:7330:2: ( ruleVarType )
            {
            // InternalPortugolParser.g:7330:2: ( ruleVarType )
            // InternalPortugolParser.g:7331:3: ruleVarType
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
    // InternalPortugolParser.g:7340:1: rule__BlockFunction__DeclarationsAssignment_7 : ( ruleDeclarationsBlock ) ;
    public final void rule__BlockFunction__DeclarationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7344:1: ( ( ruleDeclarationsBlock ) )
            // InternalPortugolParser.g:7345:2: ( ruleDeclarationsBlock )
            {
            // InternalPortugolParser.g:7345:2: ( ruleDeclarationsBlock )
            // InternalPortugolParser.g:7346:3: ruleDeclarationsBlock
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
    // InternalPortugolParser.g:7355:1: rule__BlockFunction__CommandsAssignment_9 : ( ruleAbstractCommand ) ;
    public final void rule__BlockFunction__CommandsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7359:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:7360:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:7360:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:7361:3: ruleAbstractCommand
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


    // $ANTLR start "rule__BlockProcedure__ProcedureAssignment_1"
    // InternalPortugolParser.g:7370:1: rule__BlockProcedure__ProcedureAssignment_1 : ( ruleProcedureName ) ;
    public final void rule__BlockProcedure__ProcedureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7374:1: ( ( ruleProcedureName ) )
            // InternalPortugolParser.g:7375:2: ( ruleProcedureName )
            {
            // InternalPortugolParser.g:7375:2: ( ruleProcedureName )
            // InternalPortugolParser.g:7376:3: ruleProcedureName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getProcedureProcedureNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleProcedureName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getProcedureProcedureNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockProcedure__ProcedureAssignment_1"


    // $ANTLR start "rule__BlockProcedure__ParamListAssignment_3"
    // InternalPortugolParser.g:7385:1: rule__BlockProcedure__ParamListAssignment_3 : ( ruleVariable ) ;
    public final void rule__BlockProcedure__ParamListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7389:1: ( ( ruleVariable ) )
            // InternalPortugolParser.g:7390:2: ( ruleVariable )
            {
            // InternalPortugolParser.g:7390:2: ( ruleVariable )
            // InternalPortugolParser.g:7391:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getParamListVariableParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getParamListVariableParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockProcedure__ParamListAssignment_3"


    // $ANTLR start "rule__BlockProcedure__DeclarationsAssignment_5"
    // InternalPortugolParser.g:7400:1: rule__BlockProcedure__DeclarationsAssignment_5 : ( ruleDeclarationsBlock ) ;
    public final void rule__BlockProcedure__DeclarationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7404:1: ( ( ruleDeclarationsBlock ) )
            // InternalPortugolParser.g:7405:2: ( ruleDeclarationsBlock )
            {
            // InternalPortugolParser.g:7405:2: ( ruleDeclarationsBlock )
            // InternalPortugolParser.g:7406:3: ruleDeclarationsBlock
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
    // InternalPortugolParser.g:7415:1: rule__BlockProcedure__CommandsAssignment_7 : ( ruleAbstractCommand ) ;
    public final void rule__BlockProcedure__CommandsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7419:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:7420:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:7420:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:7421:3: ruleAbstractCommand
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
    // InternalPortugolParser.g:7430:1: rule__BlockCommand__CommandsAssignment_1 : ( ruleAbstractCommand ) ;
    public final void rule__BlockCommand__CommandsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7434:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:7435:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:7435:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:7436:3: ruleAbstractCommand
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
    // InternalPortugolParser.g:7445:1: rule__ReturnStatement__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__ReturnStatement__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7449:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:7450:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:7450:2: ( ruleExpression )
            // InternalPortugolParser.g:7451:3: ruleExpression
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
    // InternalPortugolParser.g:7460:1: rule__IfStatement__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__IfStatement__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7464:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:7465:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:7465:2: ( ruleExpression )
            // InternalPortugolParser.g:7466:3: ruleExpression
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
    // InternalPortugolParser.g:7475:1: rule__IfStatement__CommandsAssignment_3 : ( ruleAbstractCommand ) ;
    public final void rule__IfStatement__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7479:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:7480:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:7480:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:7481:3: ruleAbstractCommand
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
    // InternalPortugolParser.g:7490:1: rule__IfStatement__ElseCommandsAssignment_4_1 : ( ruleAbstractCommand ) ;
    public final void rule__IfStatement__ElseCommandsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7494:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:7495:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:7495:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:7496:3: ruleAbstractCommand
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
    // InternalPortugolParser.g:7505:1: rule__SwitchCaseStatement__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SwitchCaseStatement__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7509:1: ( ( ( RULE_ID ) ) )
            // InternalPortugolParser.g:7510:2: ( ( RULE_ID ) )
            {
            // InternalPortugolParser.g:7510:2: ( ( RULE_ID ) )
            // InternalPortugolParser.g:7511:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getVariableVarNameCrossReference_1_0()); 
            }
            // InternalPortugolParser.g:7512:3: ( RULE_ID )
            // InternalPortugolParser.g:7513:4: RULE_ID
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
    // InternalPortugolParser.g:7524:1: rule__SwitchCaseStatement__CaseListAssignment_2 : ( ruleCaseList ) ;
    public final void rule__SwitchCaseStatement__CaseListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7528:1: ( ( ruleCaseList ) )
            // InternalPortugolParser.g:7529:2: ( ruleCaseList )
            {
            // InternalPortugolParser.g:7529:2: ( ruleCaseList )
            // InternalPortugolParser.g:7530:3: ruleCaseList
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
    // InternalPortugolParser.g:7539:1: rule__SwitchCaseStatement__OtherCaseAssignment_3 : ( ruleOtherCase ) ;
    public final void rule__SwitchCaseStatement__OtherCaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7543:1: ( ( ruleOtherCase ) )
            // InternalPortugolParser.g:7544:2: ( ruleOtherCase )
            {
            // InternalPortugolParser.g:7544:2: ( ruleOtherCase )
            // InternalPortugolParser.g:7545:3: ruleOtherCase
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
    // InternalPortugolParser.g:7554:1: rule__CaseList__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__CaseList__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7558:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:7559:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:7559:2: ( ruleExpression )
            // InternalPortugolParser.g:7560:3: ruleExpression
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
    // InternalPortugolParser.g:7569:1: rule__CaseList__CommandsAssignment_3 : ( ruleAbstractCommand ) ;
    public final void rule__CaseList__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7573:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:7574:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:7574:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:7575:3: ruleAbstractCommand
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
    // InternalPortugolParser.g:7584:1: rule__OtherCase__OtherCaseCommandsAssignment_2 : ( ruleAbstractCommand ) ;
    public final void rule__OtherCase__OtherCaseCommandsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7588:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:7589:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:7589:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:7590:3: ruleAbstractCommand
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
    // InternalPortugolParser.g:7599:1: rule__ForStatement__OperatorExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__ForStatement__OperatorExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7603:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:7604:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:7604:2: ( ruleExpression )
            // InternalPortugolParser.g:7605:3: ruleExpression
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
    // InternalPortugolParser.g:7614:1: rule__ForStatement__StartExprAssignment_3 : ( ruleExpression ) ;
    public final void rule__ForStatement__StartExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7618:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:7619:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:7619:2: ( ruleExpression )
            // InternalPortugolParser.g:7620:3: ruleExpression
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
    // InternalPortugolParser.g:7629:1: rule__ForStatement__EndExprAssignment_5 : ( ruleExpression ) ;
    public final void rule__ForStatement__EndExprAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7633:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:7634:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:7634:2: ( ruleExpression )
            // InternalPortugolParser.g:7635:3: ruleExpression
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
    // InternalPortugolParser.g:7644:1: rule__ForStatement__StepExpeAssignment_6_1 : ( ruleExpression ) ;
    public final void rule__ForStatement__StepExpeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7648:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:7649:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:7649:2: ( ruleExpression )
            // InternalPortugolParser.g:7650:3: ruleExpression
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
    // InternalPortugolParser.g:7659:1: rule__ForStatement__CommandsAssignment_8 : ( ruleAbstractCommand ) ;
    public final void rule__ForStatement__CommandsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7663:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:7664:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:7664:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:7665:3: ruleAbstractCommand
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
    // InternalPortugolParser.g:7674:1: rule__WhileStatement__WhileExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__WhileStatement__WhileExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7678:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:7679:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:7679:2: ( ruleExpression )
            // InternalPortugolParser.g:7680:3: ruleExpression
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
    // InternalPortugolParser.g:7689:1: rule__WhileStatement__CommandsAssignment_3 : ( ruleAbstractCommand ) ;
    public final void rule__WhileStatement__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7693:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:7694:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:7694:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:7695:3: ruleAbstractCommand
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
    // InternalPortugolParser.g:7704:1: rule__RepeatStatement__CommandsAssignment_1 : ( ruleAbstractCommand ) ;
    public final void rule__RepeatStatement__CommandsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7708:1: ( ( ruleAbstractCommand ) )
            // InternalPortugolParser.g:7709:2: ( ruleAbstractCommand )
            {
            // InternalPortugolParser.g:7709:2: ( ruleAbstractCommand )
            // InternalPortugolParser.g:7710:3: ruleAbstractCommand
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
    // InternalPortugolParser.g:7719:1: rule__RepeatStatement__UntilExprAssignment_3 : ( ruleExpression ) ;
    public final void rule__RepeatStatement__UntilExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7723:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:7724:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:7724:2: ( ruleExpression )
            // InternalPortugolParser.g:7725:3: ruleExpression
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
    // InternalPortugolParser.g:7734:1: rule__SubprogramParam__ExpressionAssignment_0 : ( ruleExpression ) ;
    public final void rule__SubprogramParam__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7738:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:7739:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:7739:2: ( ruleExpression )
            // InternalPortugolParser.g:7740:3: ruleExpression
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
    // InternalPortugolParser.g:7749:1: rule__SubprogramParam__ExpressionAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__SubprogramParam__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7753:1: ( ( ruleExpression ) )
            // InternalPortugolParser.g:7754:2: ( ruleExpression )
            {
            // InternalPortugolParser.g:7754:2: ( ruleExpression )
            // InternalPortugolParser.g:7755:3: ruleExpression
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
    // InternalPortugolParser.g:7764:1: rule__ReadCommand__ParamListAssignment_2 : ( ruleDeclaredVarList ) ;
    public final void rule__ReadCommand__ParamListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7768:1: ( ( ruleDeclaredVarList ) )
            // InternalPortugolParser.g:7769:2: ( ruleDeclaredVarList )
            {
            // InternalPortugolParser.g:7769:2: ( ruleDeclaredVarList )
            // InternalPortugolParser.g:7770:3: ruleDeclaredVarList
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
    // InternalPortugolParser.g:7779:1: rule__WriteCommand__WriteCommandAssignment_0 : ( ( rule__WriteCommand__WriteCommandAlternatives_0_0 ) ) ;
    public final void rule__WriteCommand__WriteCommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7783:1: ( ( ( rule__WriteCommand__WriteCommandAlternatives_0_0 ) ) )
            // InternalPortugolParser.g:7784:2: ( ( rule__WriteCommand__WriteCommandAlternatives_0_0 ) )
            {
            // InternalPortugolParser.g:7784:2: ( ( rule__WriteCommand__WriteCommandAlternatives_0_0 ) )
            // InternalPortugolParser.g:7785:3: ( rule__WriteCommand__WriteCommandAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getWriteCommandAlternatives_0_0()); 
            }
            // InternalPortugolParser.g:7786:3: ( rule__WriteCommand__WriteCommandAlternatives_0_0 )
            // InternalPortugolParser.g:7786:4: rule__WriteCommand__WriteCommandAlternatives_0_0
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
    // InternalPortugolParser.g:7794:1: rule__WriteCommand__WriteParamAssignment_2 : ( ruleWriteParam ) ;
    public final void rule__WriteCommand__WriteParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7798:1: ( ( ruleWriteParam ) )
            // InternalPortugolParser.g:7799:2: ( ruleWriteParam )
            {
            // InternalPortugolParser.g:7799:2: ( ruleWriteParam )
            // InternalPortugolParser.g:7800:3: ruleWriteParam
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
    // InternalPortugolParser.g:7809:1: rule__WriteParam__ParamsAssignment_0 : ( ruleSubprogramParam ) ;
    public final void rule__WriteParam__ParamsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7813:1: ( ( ruleSubprogramParam ) )
            // InternalPortugolParser.g:7814:2: ( ruleSubprogramParam )
            {
            // InternalPortugolParser.g:7814:2: ( ruleSubprogramParam )
            // InternalPortugolParser.g:7815:3: ruleSubprogramParam
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
    // InternalPortugolParser.g:7824:1: rule__WriteParam__PrecisionAssignment_1 : ( ruleOptDecimalPrecision ) ;
    public final void rule__WriteParam__PrecisionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7828:1: ( ( ruleOptDecimalPrecision ) )
            // InternalPortugolParser.g:7829:2: ( ruleOptDecimalPrecision )
            {
            // InternalPortugolParser.g:7829:2: ( ruleOptDecimalPrecision )
            // InternalPortugolParser.g:7830:3: ruleOptDecimalPrecision
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
    // InternalPortugolParser.g:7839:1: rule__OptDecimalPrecision__FirstPrecisionAssignment_1 : ( RULE_INT ) ;
    public final void rule__OptDecimalPrecision__FirstPrecisionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7843:1: ( ( RULE_INT ) )
            // InternalPortugolParser.g:7844:2: ( RULE_INT )
            {
            // InternalPortugolParser.g:7844:2: ( RULE_INT )
            // InternalPortugolParser.g:7845:3: RULE_INT
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
    // InternalPortugolParser.g:7854:1: rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7858:1: ( ( RULE_INT ) )
            // InternalPortugolParser.g:7859:2: ( RULE_INT )
            {
            // InternalPortugolParser.g:7859:2: ( RULE_INT )
            // InternalPortugolParser.g:7860:3: RULE_INT
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
    // InternalPortugolParser.g:7869:1: rule__Assignment__OpAssignment_1_0_0_1 : ( ( LessThanSignHyphenMinus ) ) ;
    public final void rule__Assignment__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7873:1: ( ( ( LessThanSignHyphenMinus ) ) )
            // InternalPortugolParser.g:7874:2: ( ( LessThanSignHyphenMinus ) )
            {
            // InternalPortugolParser.g:7874:2: ( ( LessThanSignHyphenMinus ) )
            // InternalPortugolParser.g:7875:3: ( LessThanSignHyphenMinus )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOpLessThanSignHyphenMinusKeyword_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:7876:3: ( LessThanSignHyphenMinus )
            // InternalPortugolParser.g:7877:4: LessThanSignHyphenMinus
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
    // InternalPortugolParser.g:7888:1: rule__Assignment__RightAssignment_1_1 : ( ruleAssignment ) ;
    public final void rule__Assignment__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7892:1: ( ( ruleAssignment ) )
            // InternalPortugolParser.g:7893:2: ( ruleAssignment )
            {
            // InternalPortugolParser.g:7893:2: ( ruleAssignment )
            // InternalPortugolParser.g:7894:3: ruleAssignment
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
    // InternalPortugolParser.g:7903:1: rule__OrExpression__OpAssignment_1_0_0_1 : ( ( OU ) ) ;
    public final void rule__OrExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7907:1: ( ( ( OU ) ) )
            // InternalPortugolParser.g:7908:2: ( ( OU ) )
            {
            // InternalPortugolParser.g:7908:2: ( ( OU ) )
            // InternalPortugolParser.g:7909:3: ( OU )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpOUKeyword_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:7910:3: ( OU )
            // InternalPortugolParser.g:7911:4: OU
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
    // InternalPortugolParser.g:7922:1: rule__OrExpression__RightAssignment_1_1 : ( ruleXorExpression ) ;
    public final void rule__OrExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7926:1: ( ( ruleXorExpression ) )
            // InternalPortugolParser.g:7927:2: ( ruleXorExpression )
            {
            // InternalPortugolParser.g:7927:2: ( ruleXorExpression )
            // InternalPortugolParser.g:7928:3: ruleXorExpression
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
    // InternalPortugolParser.g:7937:1: rule__XorExpression__OpAssignment_1_0_0_1 : ( ( XOU ) ) ;
    public final void rule__XorExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7941:1: ( ( ( XOU ) ) )
            // InternalPortugolParser.g:7942:2: ( ( XOU ) )
            {
            // InternalPortugolParser.g:7942:2: ( ( XOU ) )
            // InternalPortugolParser.g:7943:3: ( XOU )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOpXOUKeyword_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:7944:3: ( XOU )
            // InternalPortugolParser.g:7945:4: XOU
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
    // InternalPortugolParser.g:7956:1: rule__XorExpression__RightAssignment_1_1 : ( ruleAndExpression ) ;
    public final void rule__XorExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7960:1: ( ( ruleAndExpression ) )
            // InternalPortugolParser.g:7961:2: ( ruleAndExpression )
            {
            // InternalPortugolParser.g:7961:2: ( ruleAndExpression )
            // InternalPortugolParser.g:7962:3: ruleAndExpression
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
    // InternalPortugolParser.g:7971:1: rule__AndExpression__OpAssignment_1_0_0_1 : ( ( rule__AndExpression__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__AndExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7975:1: ( ( ( rule__AndExpression__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugolParser.g:7976:2: ( ( rule__AndExpression__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugolParser.g:7976:2: ( ( rule__AndExpression__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugolParser.g:7977:3: ( rule__AndExpression__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:7978:3: ( rule__AndExpression__OpAlternatives_1_0_0_1_0 )
            // InternalPortugolParser.g:7978:4: rule__AndExpression__OpAlternatives_1_0_0_1_0
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
    // InternalPortugolParser.g:7986:1: rule__AndExpression__RightAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__AndExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:7990:1: ( ( ruleComparison ) )
            // InternalPortugolParser.g:7991:2: ( ruleComparison )
            {
            // InternalPortugolParser.g:7991:2: ( ruleComparison )
            // InternalPortugolParser.g:7992:3: ruleComparison
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
    // InternalPortugolParser.g:8001:1: rule__Comparison__OpAssignment_1_0_0_1 : ( ( rule__Comparison__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8005:1: ( ( ( rule__Comparison__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugolParser.g:8006:2: ( ( rule__Comparison__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugolParser.g:8006:2: ( ( rule__Comparison__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugolParser.g:8007:3: ( rule__Comparison__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:8008:3: ( rule__Comparison__OpAlternatives_1_0_0_1_0 )
            // InternalPortugolParser.g:8008:4: rule__Comparison__OpAlternatives_1_0_0_1_0
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
    // InternalPortugolParser.g:8016:1: rule__Comparison__RightAssignment_1_1 : ( ruleEquExpression ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8020:1: ( ( ruleEquExpression ) )
            // InternalPortugolParser.g:8021:2: ( ruleEquExpression )
            {
            // InternalPortugolParser.g:8021:2: ( ruleEquExpression )
            // InternalPortugolParser.g:8022:3: ruleEquExpression
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
    // InternalPortugolParser.g:8031:1: rule__EquExpression__OpAssignment_1_0_0_1 : ( ( rule__EquExpression__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__EquExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8035:1: ( ( ( rule__EquExpression__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugolParser.g:8036:2: ( ( rule__EquExpression__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugolParser.g:8036:2: ( ( rule__EquExpression__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugolParser.g:8037:3: ( rule__EquExpression__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:8038:3: ( rule__EquExpression__OpAlternatives_1_0_0_1_0 )
            // InternalPortugolParser.g:8038:4: rule__EquExpression__OpAlternatives_1_0_0_1_0
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
    // InternalPortugolParser.g:8046:1: rule__EquExpression__RightAssignment_1_1 : ( ruleAddExpression ) ;
    public final void rule__EquExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8050:1: ( ( ruleAddExpression ) )
            // InternalPortugolParser.g:8051:2: ( ruleAddExpression )
            {
            // InternalPortugolParser.g:8051:2: ( ruleAddExpression )
            // InternalPortugolParser.g:8052:3: ruleAddExpression
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
    // InternalPortugolParser.g:8061:1: rule__AddExpression__OpAssignment_1_0_0_1 : ( ( rule__AddExpression__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__AddExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8065:1: ( ( ( rule__AddExpression__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugolParser.g:8066:2: ( ( rule__AddExpression__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugolParser.g:8066:2: ( ( rule__AddExpression__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugolParser.g:8067:3: ( rule__AddExpression__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:8068:3: ( rule__AddExpression__OpAlternatives_1_0_0_1_0 )
            // InternalPortugolParser.g:8068:4: rule__AddExpression__OpAlternatives_1_0_0_1_0
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
    // InternalPortugolParser.g:8076:1: rule__AddExpression__RightAssignment_1_1 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AddExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8080:1: ( ( ruleMultiplicativeExpression ) )
            // InternalPortugolParser.g:8081:2: ( ruleMultiplicativeExpression )
            {
            // InternalPortugolParser.g:8081:2: ( ruleMultiplicativeExpression )
            // InternalPortugolParser.g:8082:3: ruleMultiplicativeExpression
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
    // InternalPortugolParser.g:8091:1: rule__MultiplicativeExpression__OpAssignment_1_0_0_1 : ( ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__MultiplicativeExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8095:1: ( ( ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugolParser.g:8096:2: ( ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugolParser.g:8096:2: ( ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugolParser.g:8097:3: ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:8098:3: ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 )
            // InternalPortugolParser.g:8098:4: rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0
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
    // InternalPortugolParser.g:8106:1: rule__MultiplicativeExpression__RightAssignment_1_1 : ( rulePowerExpression ) ;
    public final void rule__MultiplicativeExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8110:1: ( ( rulePowerExpression ) )
            // InternalPortugolParser.g:8111:2: ( rulePowerExpression )
            {
            // InternalPortugolParser.g:8111:2: ( rulePowerExpression )
            // InternalPortugolParser.g:8112:3: rulePowerExpression
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
    // InternalPortugolParser.g:8121:1: rule__PowerExpression__OpAssignment_1_0_0_1 : ( ( CircumflexAccent ) ) ;
    public final void rule__PowerExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8125:1: ( ( ( CircumflexAccent ) ) )
            // InternalPortugolParser.g:8126:2: ( ( CircumflexAccent ) )
            {
            // InternalPortugolParser.g:8126:2: ( ( CircumflexAccent ) )
            // InternalPortugolParser.g:8127:3: ( CircumflexAccent )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getOpCircumflexAccentKeyword_1_0_0_1_0()); 
            }
            // InternalPortugolParser.g:8128:3: ( CircumflexAccent )
            // InternalPortugolParser.g:8129:4: CircumflexAccent
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
    // InternalPortugolParser.g:8140:1: rule__PowerExpression__RightAssignment_1_1 : ( ruleUnaryExpression ) ;
    public final void rule__PowerExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8144:1: ( ( ruleUnaryExpression ) )
            // InternalPortugolParser.g:8145:2: ( ruleUnaryExpression )
            {
            // InternalPortugolParser.g:8145:2: ( ruleUnaryExpression )
            // InternalPortugolParser.g:8146:3: ruleUnaryExpression
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
    // InternalPortugolParser.g:8155:1: rule__UnaryExpression__OpAssignment_0_1 : ( ( rule__UnaryExpression__OpAlternatives_0_1_0 ) ) ;
    public final void rule__UnaryExpression__OpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8159:1: ( ( ( rule__UnaryExpression__OpAlternatives_0_1_0 ) ) )
            // InternalPortugolParser.g:8160:2: ( ( rule__UnaryExpression__OpAlternatives_0_1_0 ) )
            {
            // InternalPortugolParser.g:8160:2: ( ( rule__UnaryExpression__OpAlternatives_0_1_0 ) )
            // InternalPortugolParser.g:8161:3: ( rule__UnaryExpression__OpAlternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOpAlternatives_0_1_0()); 
            }
            // InternalPortugolParser.g:8162:3: ( rule__UnaryExpression__OpAlternatives_0_1_0 )
            // InternalPortugolParser.g:8162:4: rule__UnaryExpression__OpAlternatives_0_1_0
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
    // InternalPortugolParser.g:8170:1: rule__UnaryExpression__OperandAssignment_0_2 : ( ruleUnaryExpression ) ;
    public final void rule__UnaryExpression__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8174:1: ( ( ruleUnaryExpression ) )
            // InternalPortugolParser.g:8175:2: ( ruleUnaryExpression )
            {
            // InternalPortugolParser.g:8175:2: ( ruleUnaryExpression )
            // InternalPortugolParser.g:8176:3: ruleUnaryExpression
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


    // $ANTLR start "rule__FunctionCall__FbNameAssignment_0"
    // InternalPortugolParser.g:8185:1: rule__FunctionCall__FbNameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__FbNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8189:1: ( ( ( RULE_ID ) ) )
            // InternalPortugolParser.g:8190:2: ( ( RULE_ID ) )
            {
            // InternalPortugolParser.g:8190:2: ( ( RULE_ID ) )
            // InternalPortugolParser.g:8191:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFbNameFunctionNameCrossReference_0_0()); 
            }
            // InternalPortugolParser.g:8192:3: ( RULE_ID )
            // InternalPortugolParser.g:8193:4: RULE_ID
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
    // InternalPortugolParser.g:8204:1: rule__FunctionCall__ParamAssignment_2 : ( ruleSubprogramParam ) ;
    public final void rule__FunctionCall__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8208:1: ( ( ruleSubprogramParam ) )
            // InternalPortugolParser.g:8209:2: ( ruleSubprogramParam )
            {
            // InternalPortugolParser.g:8209:2: ( ruleSubprogramParam )
            // InternalPortugolParser.g:8210:3: ruleSubprogramParam
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
    // InternalPortugolParser.g:8219:1: rule__DeclaredVar__VarNameAssignment : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredVar__VarNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8223:1: ( ( ( RULE_ID ) ) )
            // InternalPortugolParser.g:8224:2: ( ( RULE_ID ) )
            {
            // InternalPortugolParser.g:8224:2: ( ( RULE_ID ) )
            // InternalPortugolParser.g:8225:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getVarNameVarNameCrossReference_0()); 
            }
            // InternalPortugolParser.g:8226:3: ( RULE_ID )
            // InternalPortugolParser.g:8227:4: RULE_ID
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
    // InternalPortugolParser.g:8238:1: rule__NumericLiteral__IntValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__NumericLiteral__IntValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8242:1: ( ( RULE_INT ) )
            // InternalPortugolParser.g:8243:2: ( RULE_INT )
            {
            // InternalPortugolParser.g:8243:2: ( RULE_INT )
            // InternalPortugolParser.g:8244:3: RULE_INT
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
    // InternalPortugolParser.g:8253:1: rule__NumericLiteral__FloatValueAssignment_1 : ( RULE_FLOAT ) ;
    public final void rule__NumericLiteral__FloatValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8257:1: ( ( RULE_FLOAT ) )
            // InternalPortugolParser.g:8258:2: ( RULE_FLOAT )
            {
            // InternalPortugolParser.g:8258:2: ( RULE_FLOAT )
            // InternalPortugolParser.g:8259:3: RULE_FLOAT
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
    // InternalPortugolParser.g:8268:1: rule__StringExpression__LiteralStringAssignment : ( RULE_STRING ) ;
    public final void rule__StringExpression__LiteralStringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugolParser.g:8272:1: ( ( RULE_STRING ) )
            // InternalPortugolParser.g:8273:2: ( RULE_STRING )
            {
            // InternalPortugolParser.g:8273:2: ( RULE_STRING )
            // InternalPortugolParser.g:8274:3: RULE_STRING
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

    // $ANTLR start synpred55_InternalPortugolParser
    public final void synpred55_InternalPortugolParser_fragment() throws RecognitionException {   
        // InternalPortugolParser.g:5106:3: ( rule__Assignment__Group_1__0 )
        // InternalPortugolParser.g:5106:3: rule__Assignment__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Assignment__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalPortugolParser

    // Delegated rules

    public final boolean synpred55_InternalPortugolParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalPortugolParser_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000C00040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200104800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xC021200981278200L,0x0000000000000003L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0xC021200981278202L,0x0000000000000003L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0xC021000800000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x1000800000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1000800000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0400020000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0400020000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0A00050000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0A00050000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0028000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0028000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0044400400000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0044400400000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0020000800000000L});

}