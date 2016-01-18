package org.hopper.language.ide.contentassist.antlr.internal;

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'real'", "'inteiro'", "'caractere'", "'caracter'", "'escreva'", "'escreval'", "'&'", "'E'", "'='", "'<>'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'MOD'", "'%'", "'NOT'", "'algoritmo'", "'var'", "':'", "','", "'funcao'", "'('", "')'", "'inicio'", "'fimfuncao'", "'procedimento'", "'fimprocedimento'", "'fimalgoritmo'", "'se'", "'entao'", "'fimse'", "'senao'", "'escolha'", "'fimescolha'", "'caso'", "'outrocaso'", "'para'", "'de'", "'ate'", "'faca'", "'fimpara'", "'passo'", "'enquanto'", "'fimenquanto'", "'repita'", "'leia'", "'interrompa'", "'<-'", "'OU'", "'XOU'", "'^'"
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
    // InternalPortugol.g:54:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalPortugol.g:55:1: ( ruleModel EOF )
            // InternalPortugol.g:56:1: ruleModel EOF
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
    // InternalPortugol.g:63:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:67:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalPortugol.g:68:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalPortugol.g:68:2: ( ( rule__Model__Group__0 ) )
            // InternalPortugol.g:69:3: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // InternalPortugol.g:70:3: ( rule__Model__Group__0 )
            // InternalPortugol.g:70:4: rule__Model__Group__0
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
    // InternalPortugol.g:79:1: entryRuleHeaderBlock : ruleHeaderBlock EOF ;
    public final void entryRuleHeaderBlock() throws RecognitionException {
        try {
            // InternalPortugol.g:80:1: ( ruleHeaderBlock EOF )
            // InternalPortugol.g:81:1: ruleHeaderBlock EOF
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
    // InternalPortugol.g:88:1: ruleHeaderBlock : ( ( rule__HeaderBlock__Group__0 ) ) ;
    public final void ruleHeaderBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:92:2: ( ( ( rule__HeaderBlock__Group__0 ) ) )
            // InternalPortugol.g:93:2: ( ( rule__HeaderBlock__Group__0 ) )
            {
            // InternalPortugol.g:93:2: ( ( rule__HeaderBlock__Group__0 ) )
            // InternalPortugol.g:94:3: ( rule__HeaderBlock__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderBlockAccess().getGroup()); 
            }
            // InternalPortugol.g:95:3: ( rule__HeaderBlock__Group__0 )
            // InternalPortugol.g:95:4: rule__HeaderBlock__Group__0
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
    // InternalPortugol.g:104:1: entryRuleDeclarationsBlock : ruleDeclarationsBlock EOF ;
    public final void entryRuleDeclarationsBlock() throws RecognitionException {
        try {
            // InternalPortugol.g:105:1: ( ruleDeclarationsBlock EOF )
            // InternalPortugol.g:106:1: ruleDeclarationsBlock EOF
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
    // InternalPortugol.g:113:1: ruleDeclarationsBlock : ( ( rule__DeclarationsBlock__Group__0 ) ) ;
    public final void ruleDeclarationsBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:117:2: ( ( ( rule__DeclarationsBlock__Group__0 ) ) )
            // InternalPortugol.g:118:2: ( ( rule__DeclarationsBlock__Group__0 ) )
            {
            // InternalPortugol.g:118:2: ( ( rule__DeclarationsBlock__Group__0 ) )
            // InternalPortugol.g:119:3: ( rule__DeclarationsBlock__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getGroup()); 
            }
            // InternalPortugol.g:120:3: ( rule__DeclarationsBlock__Group__0 )
            // InternalPortugol.g:120:4: rule__DeclarationsBlock__Group__0
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
    // InternalPortugol.g:129:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalPortugol.g:130:1: ( ruleVariable EOF )
            // InternalPortugol.g:131:1: ruleVariable EOF
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
    // InternalPortugol.g:138:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:142:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalPortugol.g:143:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalPortugol.g:143:2: ( ( rule__Variable__Group__0 ) )
            // InternalPortugol.g:144:3: ( rule__Variable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getGroup()); 
            }
            // InternalPortugol.g:145:3: ( rule__Variable__Group__0 )
            // InternalPortugol.g:145:4: rule__Variable__Group__0
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
    // InternalPortugol.g:154:1: entryRuleVarDeclaration : ruleVarDeclaration EOF ;
    public final void entryRuleVarDeclaration() throws RecognitionException {
        try {
            // InternalPortugol.g:155:1: ( ruleVarDeclaration EOF )
            // InternalPortugol.g:156:1: ruleVarDeclaration EOF
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
    // InternalPortugol.g:163:1: ruleVarDeclaration : ( ( rule__VarDeclaration__Group__0 ) ) ;
    public final void ruleVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:167:2: ( ( ( rule__VarDeclaration__Group__0 ) ) )
            // InternalPortugol.g:168:2: ( ( rule__VarDeclaration__Group__0 ) )
            {
            // InternalPortugol.g:168:2: ( ( rule__VarDeclaration__Group__0 ) )
            // InternalPortugol.g:169:3: ( rule__VarDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getGroup()); 
            }
            // InternalPortugol.g:170:3: ( rule__VarDeclaration__Group__0 )
            // InternalPortugol.g:170:4: rule__VarDeclaration__Group__0
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
    // InternalPortugol.g:179:1: entryRuleDeclaredVarList : ruleDeclaredVarList EOF ;
    public final void entryRuleDeclaredVarList() throws RecognitionException {
        try {
            // InternalPortugol.g:180:1: ( ruleDeclaredVarList EOF )
            // InternalPortugol.g:181:1: ruleDeclaredVarList EOF
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
    // InternalPortugol.g:188:1: ruleDeclaredVarList : ( ( rule__DeclaredVarList__Group__0 ) ) ;
    public final void ruleDeclaredVarList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:192:2: ( ( ( rule__DeclaredVarList__Group__0 ) ) )
            // InternalPortugol.g:193:2: ( ( rule__DeclaredVarList__Group__0 ) )
            {
            // InternalPortugol.g:193:2: ( ( rule__DeclaredVarList__Group__0 ) )
            // InternalPortugol.g:194:3: ( rule__DeclaredVarList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getGroup()); 
            }
            // InternalPortugol.g:195:3: ( rule__DeclaredVarList__Group__0 )
            // InternalPortugol.g:195:4: rule__DeclaredVarList__Group__0
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
    // InternalPortugol.g:204:1: entryRuleVarName : ruleVarName EOF ;
    public final void entryRuleVarName() throws RecognitionException {
        try {
            // InternalPortugol.g:205:1: ( ruleVarName EOF )
            // InternalPortugol.g:206:1: ruleVarName EOF
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
    // InternalPortugol.g:213:1: ruleVarName : ( ( rule__VarName__NameAssignment ) ) ;
    public final void ruleVarName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:217:2: ( ( ( rule__VarName__NameAssignment ) ) )
            // InternalPortugol.g:218:2: ( ( rule__VarName__NameAssignment ) )
            {
            // InternalPortugol.g:218:2: ( ( rule__VarName__NameAssignment ) )
            // InternalPortugol.g:219:3: ( rule__VarName__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarNameAccess().getNameAssignment()); 
            }
            // InternalPortugol.g:220:3: ( rule__VarName__NameAssignment )
            // InternalPortugol.g:220:4: rule__VarName__NameAssignment
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
    // InternalPortugol.g:229:1: entryRuleVarType : ruleVarType EOF ;
    public final void entryRuleVarType() throws RecognitionException {
        try {
            // InternalPortugol.g:230:1: ( ruleVarType EOF )
            // InternalPortugol.g:231:1: ruleVarType EOF
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
    // InternalPortugol.g:238:1: ruleVarType : ( ( rule__VarType__TypeNameAssignment ) ) ;
    public final void ruleVarType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:242:2: ( ( ( rule__VarType__TypeNameAssignment ) ) )
            // InternalPortugol.g:243:2: ( ( rule__VarType__TypeNameAssignment ) )
            {
            // InternalPortugol.g:243:2: ( ( rule__VarType__TypeNameAssignment ) )
            // InternalPortugol.g:244:3: ( rule__VarType__TypeNameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarTypeAccess().getTypeNameAssignment()); 
            }
            // InternalPortugol.g:245:3: ( rule__VarType__TypeNameAssignment )
            // InternalPortugol.g:245:4: rule__VarType__TypeNameAssignment
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
    // InternalPortugol.g:254:1: entryRuleSubprograms : ruleSubprograms EOF ;
    public final void entryRuleSubprograms() throws RecognitionException {
        try {
            // InternalPortugol.g:255:1: ( ruleSubprograms EOF )
            // InternalPortugol.g:256:1: ruleSubprograms EOF
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
    // InternalPortugol.g:263:1: ruleSubprograms : ( ( ( rule__Subprograms__BlockSubProgramsAssignment ) ) ( ( rule__Subprograms__BlockSubProgramsAssignment )* ) ) ;
    public final void ruleSubprograms() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:267:2: ( ( ( ( rule__Subprograms__BlockSubProgramsAssignment ) ) ( ( rule__Subprograms__BlockSubProgramsAssignment )* ) ) )
            // InternalPortugol.g:268:2: ( ( ( rule__Subprograms__BlockSubProgramsAssignment ) ) ( ( rule__Subprograms__BlockSubProgramsAssignment )* ) )
            {
            // InternalPortugol.g:268:2: ( ( ( rule__Subprograms__BlockSubProgramsAssignment ) ) ( ( rule__Subprograms__BlockSubProgramsAssignment )* ) )
            // InternalPortugol.g:269:3: ( ( rule__Subprograms__BlockSubProgramsAssignment ) ) ( ( rule__Subprograms__BlockSubProgramsAssignment )* )
            {
            // InternalPortugol.g:269:3: ( ( rule__Subprograms__BlockSubProgramsAssignment ) )
            // InternalPortugol.g:270:4: ( rule__Subprograms__BlockSubProgramsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramsAccess().getBlockSubProgramsAssignment()); 
            }
            // InternalPortugol.g:271:4: ( rule__Subprograms__BlockSubProgramsAssignment )
            // InternalPortugol.g:271:5: rule__Subprograms__BlockSubProgramsAssignment
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

            // InternalPortugol.g:274:3: ( ( rule__Subprograms__BlockSubProgramsAssignment )* )
            // InternalPortugol.g:275:4: ( rule__Subprograms__BlockSubProgramsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramsAccess().getBlockSubProgramsAssignment()); 
            }
            // InternalPortugol.g:276:4: ( rule__Subprograms__BlockSubProgramsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==38||LA1_0==43) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPortugol.g:276:5: rule__Subprograms__BlockSubProgramsAssignment
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
    // InternalPortugol.g:286:1: entryRuleBlockSubPrograms : ruleBlockSubPrograms EOF ;
    public final void entryRuleBlockSubPrograms() throws RecognitionException {
        try {
            // InternalPortugol.g:287:1: ( ruleBlockSubPrograms EOF )
            // InternalPortugol.g:288:1: ruleBlockSubPrograms EOF
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
    // InternalPortugol.g:295:1: ruleBlockSubPrograms : ( ( rule__BlockSubPrograms__Alternatives ) ) ;
    public final void ruleBlockSubPrograms() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:299:2: ( ( ( rule__BlockSubPrograms__Alternatives ) ) )
            // InternalPortugol.g:300:2: ( ( rule__BlockSubPrograms__Alternatives ) )
            {
            // InternalPortugol.g:300:2: ( ( rule__BlockSubPrograms__Alternatives ) )
            // InternalPortugol.g:301:3: ( rule__BlockSubPrograms__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockSubProgramsAccess().getAlternatives()); 
            }
            // InternalPortugol.g:302:3: ( rule__BlockSubPrograms__Alternatives )
            // InternalPortugol.g:302:4: rule__BlockSubPrograms__Alternatives
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
    // InternalPortugol.g:311:1: entryRuleProcedureName : ruleProcedureName EOF ;
    public final void entryRuleProcedureName() throws RecognitionException {
        try {
            // InternalPortugol.g:312:1: ( ruleProcedureName EOF )
            // InternalPortugol.g:313:1: ruleProcedureName EOF
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
    // InternalPortugol.g:320:1: ruleProcedureName : ( ( rule__ProcedureName__NameAssignment ) ) ;
    public final void ruleProcedureName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:324:2: ( ( ( rule__ProcedureName__NameAssignment ) ) )
            // InternalPortugol.g:325:2: ( ( rule__ProcedureName__NameAssignment ) )
            {
            // InternalPortugol.g:325:2: ( ( rule__ProcedureName__NameAssignment ) )
            // InternalPortugol.g:326:3: ( rule__ProcedureName__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedureNameAccess().getNameAssignment()); 
            }
            // InternalPortugol.g:327:3: ( rule__ProcedureName__NameAssignment )
            // InternalPortugol.g:327:4: rule__ProcedureName__NameAssignment
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
    // InternalPortugol.g:336:1: entryRuleFunctionName : ruleFunctionName EOF ;
    public final void entryRuleFunctionName() throws RecognitionException {
        try {
            // InternalPortugol.g:337:1: ( ruleFunctionName EOF )
            // InternalPortugol.g:338:1: ruleFunctionName EOF
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
    // InternalPortugol.g:345:1: ruleFunctionName : ( ( rule__FunctionName__NameAssignment ) ) ;
    public final void ruleFunctionName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:349:2: ( ( ( rule__FunctionName__NameAssignment ) ) )
            // InternalPortugol.g:350:2: ( ( rule__FunctionName__NameAssignment ) )
            {
            // InternalPortugol.g:350:2: ( ( rule__FunctionName__NameAssignment ) )
            // InternalPortugol.g:351:3: ( rule__FunctionName__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionNameAccess().getNameAssignment()); 
            }
            // InternalPortugol.g:352:3: ( rule__FunctionName__NameAssignment )
            // InternalPortugol.g:352:4: rule__FunctionName__NameAssignment
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
    // InternalPortugol.g:361:1: entryRuleBlockFunction : ruleBlockFunction EOF ;
    public final void entryRuleBlockFunction() throws RecognitionException {
        try {
            // InternalPortugol.g:362:1: ( ruleBlockFunction EOF )
            // InternalPortugol.g:363:1: ruleBlockFunction EOF
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
    // InternalPortugol.g:370:1: ruleBlockFunction : ( ( rule__BlockFunction__Group__0 ) ) ;
    public final void ruleBlockFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:374:2: ( ( ( rule__BlockFunction__Group__0 ) ) )
            // InternalPortugol.g:375:2: ( ( rule__BlockFunction__Group__0 ) )
            {
            // InternalPortugol.g:375:2: ( ( rule__BlockFunction__Group__0 ) )
            // InternalPortugol.g:376:3: ( rule__BlockFunction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getGroup()); 
            }
            // InternalPortugol.g:377:3: ( rule__BlockFunction__Group__0 )
            // InternalPortugol.g:377:4: rule__BlockFunction__Group__0
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
    // InternalPortugol.g:386:1: entryRuleBlockProcedure : ruleBlockProcedure EOF ;
    public final void entryRuleBlockProcedure() throws RecognitionException {
        try {
            // InternalPortugol.g:387:1: ( ruleBlockProcedure EOF )
            // InternalPortugol.g:388:1: ruleBlockProcedure EOF
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
    // InternalPortugol.g:395:1: ruleBlockProcedure : ( ( rule__BlockProcedure__Group__0 ) ) ;
    public final void ruleBlockProcedure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:399:2: ( ( ( rule__BlockProcedure__Group__0 ) ) )
            // InternalPortugol.g:400:2: ( ( rule__BlockProcedure__Group__0 ) )
            {
            // InternalPortugol.g:400:2: ( ( rule__BlockProcedure__Group__0 ) )
            // InternalPortugol.g:401:3: ( rule__BlockProcedure__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getGroup()); 
            }
            // InternalPortugol.g:402:3: ( rule__BlockProcedure__Group__0 )
            // InternalPortugol.g:402:4: rule__BlockProcedure__Group__0
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
    // InternalPortugol.g:411:1: entryRuleBlockCommand : ruleBlockCommand EOF ;
    public final void entryRuleBlockCommand() throws RecognitionException {
        try {
            // InternalPortugol.g:412:1: ( ruleBlockCommand EOF )
            // InternalPortugol.g:413:1: ruleBlockCommand EOF
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
    // InternalPortugol.g:420:1: ruleBlockCommand : ( ( rule__BlockCommand__Group__0 ) ) ;
    public final void ruleBlockCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:424:2: ( ( ( rule__BlockCommand__Group__0 ) ) )
            // InternalPortugol.g:425:2: ( ( rule__BlockCommand__Group__0 ) )
            {
            // InternalPortugol.g:425:2: ( ( rule__BlockCommand__Group__0 ) )
            // InternalPortugol.g:426:3: ( rule__BlockCommand__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getGroup()); 
            }
            // InternalPortugol.g:427:3: ( rule__BlockCommand__Group__0 )
            // InternalPortugol.g:427:4: rule__BlockCommand__Group__0
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
    // InternalPortugol.g:436:1: entryRuleAbstractCommand : ruleAbstractCommand EOF ;
    public final void entryRuleAbstractCommand() throws RecognitionException {
        try {
            // InternalPortugol.g:437:1: ( ruleAbstractCommand EOF )
            // InternalPortugol.g:438:1: ruleAbstractCommand EOF
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
    // InternalPortugol.g:445:1: ruleAbstractCommand : ( ( rule__AbstractCommand__Alternatives ) ) ;
    public final void ruleAbstractCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:449:2: ( ( ( rule__AbstractCommand__Alternatives ) ) )
            // InternalPortugol.g:450:2: ( ( rule__AbstractCommand__Alternatives ) )
            {
            // InternalPortugol.g:450:2: ( ( rule__AbstractCommand__Alternatives ) )
            // InternalPortugol.g:451:3: ( rule__AbstractCommand__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractCommandAccess().getAlternatives()); 
            }
            // InternalPortugol.g:452:3: ( rule__AbstractCommand__Alternatives )
            // InternalPortugol.g:452:4: rule__AbstractCommand__Alternatives
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


    // $ANTLR start "entryRuleIfStatement"
    // InternalPortugol.g:461:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalPortugol.g:462:1: ( ruleIfStatement EOF )
            // InternalPortugol.g:463:1: ruleIfStatement EOF
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
    // InternalPortugol.g:470:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:474:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalPortugol.g:475:2: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalPortugol.g:475:2: ( ( rule__IfStatement__Group__0 ) )
            // InternalPortugol.g:476:3: ( rule__IfStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup()); 
            }
            // InternalPortugol.g:477:3: ( rule__IfStatement__Group__0 )
            // InternalPortugol.g:477:4: rule__IfStatement__Group__0
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
    // InternalPortugol.g:486:1: entryRuleSwitchCaseStatement : ruleSwitchCaseStatement EOF ;
    public final void entryRuleSwitchCaseStatement() throws RecognitionException {
        try {
            // InternalPortugol.g:487:1: ( ruleSwitchCaseStatement EOF )
            // InternalPortugol.g:488:1: ruleSwitchCaseStatement EOF
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
    // InternalPortugol.g:495:1: ruleSwitchCaseStatement : ( ( rule__SwitchCaseStatement__Group__0 ) ) ;
    public final void ruleSwitchCaseStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:499:2: ( ( ( rule__SwitchCaseStatement__Group__0 ) ) )
            // InternalPortugol.g:500:2: ( ( rule__SwitchCaseStatement__Group__0 ) )
            {
            // InternalPortugol.g:500:2: ( ( rule__SwitchCaseStatement__Group__0 ) )
            // InternalPortugol.g:501:3: ( rule__SwitchCaseStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getGroup()); 
            }
            // InternalPortugol.g:502:3: ( rule__SwitchCaseStatement__Group__0 )
            // InternalPortugol.g:502:4: rule__SwitchCaseStatement__Group__0
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
    // InternalPortugol.g:511:1: entryRuleCaseList : ruleCaseList EOF ;
    public final void entryRuleCaseList() throws RecognitionException {
        try {
            // InternalPortugol.g:512:1: ( ruleCaseList EOF )
            // InternalPortugol.g:513:1: ruleCaseList EOF
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
    // InternalPortugol.g:520:1: ruleCaseList : ( ( rule__CaseList__Group__0 ) ) ;
    public final void ruleCaseList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:524:2: ( ( ( rule__CaseList__Group__0 ) ) )
            // InternalPortugol.g:525:2: ( ( rule__CaseList__Group__0 ) )
            {
            // InternalPortugol.g:525:2: ( ( rule__CaseList__Group__0 ) )
            // InternalPortugol.g:526:3: ( rule__CaseList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getGroup()); 
            }
            // InternalPortugol.g:527:3: ( rule__CaseList__Group__0 )
            // InternalPortugol.g:527:4: rule__CaseList__Group__0
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
    // InternalPortugol.g:536:1: entryRuleOtherCase : ruleOtherCase EOF ;
    public final void entryRuleOtherCase() throws RecognitionException {
        try {
            // InternalPortugol.g:537:1: ( ruleOtherCase EOF )
            // InternalPortugol.g:538:1: ruleOtherCase EOF
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
    // InternalPortugol.g:545:1: ruleOtherCase : ( ( rule__OtherCase__Group__0 ) ) ;
    public final void ruleOtherCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:549:2: ( ( ( rule__OtherCase__Group__0 ) ) )
            // InternalPortugol.g:550:2: ( ( rule__OtherCase__Group__0 ) )
            {
            // InternalPortugol.g:550:2: ( ( rule__OtherCase__Group__0 ) )
            // InternalPortugol.g:551:3: ( rule__OtherCase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getGroup()); 
            }
            // InternalPortugol.g:552:3: ( rule__OtherCase__Group__0 )
            // InternalPortugol.g:552:4: rule__OtherCase__Group__0
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
    // InternalPortugol.g:561:1: entryRuleForStatement : ruleForStatement EOF ;
    public final void entryRuleForStatement() throws RecognitionException {
        try {
            // InternalPortugol.g:562:1: ( ruleForStatement EOF )
            // InternalPortugol.g:563:1: ruleForStatement EOF
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
    // InternalPortugol.g:570:1: ruleForStatement : ( ( rule__ForStatement__Group__0 ) ) ;
    public final void ruleForStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:574:2: ( ( ( rule__ForStatement__Group__0 ) ) )
            // InternalPortugol.g:575:2: ( ( rule__ForStatement__Group__0 ) )
            {
            // InternalPortugol.g:575:2: ( ( rule__ForStatement__Group__0 ) )
            // InternalPortugol.g:576:3: ( rule__ForStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getGroup()); 
            }
            // InternalPortugol.g:577:3: ( rule__ForStatement__Group__0 )
            // InternalPortugol.g:577:4: rule__ForStatement__Group__0
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
    // InternalPortugol.g:586:1: entryRuleWhileStatement : ruleWhileStatement EOF ;
    public final void entryRuleWhileStatement() throws RecognitionException {
        try {
            // InternalPortugol.g:587:1: ( ruleWhileStatement EOF )
            // InternalPortugol.g:588:1: ruleWhileStatement EOF
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
    // InternalPortugol.g:595:1: ruleWhileStatement : ( ( rule__WhileStatement__Group__0 ) ) ;
    public final void ruleWhileStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:599:2: ( ( ( rule__WhileStatement__Group__0 ) ) )
            // InternalPortugol.g:600:2: ( ( rule__WhileStatement__Group__0 ) )
            {
            // InternalPortugol.g:600:2: ( ( rule__WhileStatement__Group__0 ) )
            // InternalPortugol.g:601:3: ( rule__WhileStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getGroup()); 
            }
            // InternalPortugol.g:602:3: ( rule__WhileStatement__Group__0 )
            // InternalPortugol.g:602:4: rule__WhileStatement__Group__0
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
    // InternalPortugol.g:611:1: entryRuleRepeatStatement : ruleRepeatStatement EOF ;
    public final void entryRuleRepeatStatement() throws RecognitionException {
        try {
            // InternalPortugol.g:612:1: ( ruleRepeatStatement EOF )
            // InternalPortugol.g:613:1: ruleRepeatStatement EOF
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
    // InternalPortugol.g:620:1: ruleRepeatStatement : ( ( rule__RepeatStatement__Group__0 ) ) ;
    public final void ruleRepeatStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:624:2: ( ( ( rule__RepeatStatement__Group__0 ) ) )
            // InternalPortugol.g:625:2: ( ( rule__RepeatStatement__Group__0 ) )
            {
            // InternalPortugol.g:625:2: ( ( rule__RepeatStatement__Group__0 ) )
            // InternalPortugol.g:626:3: ( rule__RepeatStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatStatementAccess().getGroup()); 
            }
            // InternalPortugol.g:627:3: ( rule__RepeatStatement__Group__0 )
            // InternalPortugol.g:627:4: rule__RepeatStatement__Group__0
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
    // InternalPortugol.g:636:1: entryRuleSubprogramParam : ruleSubprogramParam EOF ;
    public final void entryRuleSubprogramParam() throws RecognitionException {
        try {
            // InternalPortugol.g:637:1: ( ruleSubprogramParam EOF )
            // InternalPortugol.g:638:1: ruleSubprogramParam EOF
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
    // InternalPortugol.g:645:1: ruleSubprogramParam : ( ( rule__SubprogramParam__Group__0 ) ) ;
    public final void ruleSubprogramParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:649:2: ( ( ( rule__SubprogramParam__Group__0 ) ) )
            // InternalPortugol.g:650:2: ( ( rule__SubprogramParam__Group__0 ) )
            {
            // InternalPortugol.g:650:2: ( ( rule__SubprogramParam__Group__0 ) )
            // InternalPortugol.g:651:3: ( rule__SubprogramParam__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamAccess().getGroup()); 
            }
            // InternalPortugol.g:652:3: ( rule__SubprogramParam__Group__0 )
            // InternalPortugol.g:652:4: rule__SubprogramParam__Group__0
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
    // InternalPortugol.g:661:1: entryRuleReadCommand : ruleReadCommand EOF ;
    public final void entryRuleReadCommand() throws RecognitionException {
        try {
            // InternalPortugol.g:662:1: ( ruleReadCommand EOF )
            // InternalPortugol.g:663:1: ruleReadCommand EOF
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
    // InternalPortugol.g:670:1: ruleReadCommand : ( ( rule__ReadCommand__Group__0 ) ) ;
    public final void ruleReadCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:674:2: ( ( ( rule__ReadCommand__Group__0 ) ) )
            // InternalPortugol.g:675:2: ( ( rule__ReadCommand__Group__0 ) )
            {
            // InternalPortugol.g:675:2: ( ( rule__ReadCommand__Group__0 ) )
            // InternalPortugol.g:676:3: ( rule__ReadCommand__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getGroup()); 
            }
            // InternalPortugol.g:677:3: ( rule__ReadCommand__Group__0 )
            // InternalPortugol.g:677:4: rule__ReadCommand__Group__0
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
    // InternalPortugol.g:686:1: entryRuleWriteCommand : ruleWriteCommand EOF ;
    public final void entryRuleWriteCommand() throws RecognitionException {
        try {
            // InternalPortugol.g:687:1: ( ruleWriteCommand EOF )
            // InternalPortugol.g:688:1: ruleWriteCommand EOF
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
    // InternalPortugol.g:695:1: ruleWriteCommand : ( ( rule__WriteCommand__Group__0 ) ) ;
    public final void ruleWriteCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:699:2: ( ( ( rule__WriteCommand__Group__0 ) ) )
            // InternalPortugol.g:700:2: ( ( rule__WriteCommand__Group__0 ) )
            {
            // InternalPortugol.g:700:2: ( ( rule__WriteCommand__Group__0 ) )
            // InternalPortugol.g:701:3: ( rule__WriteCommand__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getGroup()); 
            }
            // InternalPortugol.g:702:3: ( rule__WriteCommand__Group__0 )
            // InternalPortugol.g:702:4: rule__WriteCommand__Group__0
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
    // InternalPortugol.g:711:1: entryRuleWriteParam : ruleWriteParam EOF ;
    public final void entryRuleWriteParam() throws RecognitionException {
        try {
            // InternalPortugol.g:712:1: ( ruleWriteParam EOF )
            // InternalPortugol.g:713:1: ruleWriteParam EOF
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
    // InternalPortugol.g:720:1: ruleWriteParam : ( ( rule__WriteParam__Group__0 ) ) ;
    public final void ruleWriteParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:724:2: ( ( ( rule__WriteParam__Group__0 ) ) )
            // InternalPortugol.g:725:2: ( ( rule__WriteParam__Group__0 ) )
            {
            // InternalPortugol.g:725:2: ( ( rule__WriteParam__Group__0 ) )
            // InternalPortugol.g:726:3: ( rule__WriteParam__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getGroup()); 
            }
            // InternalPortugol.g:727:3: ( rule__WriteParam__Group__0 )
            // InternalPortugol.g:727:4: rule__WriteParam__Group__0
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
    // InternalPortugol.g:736:1: entryRuleOptDecimalPrecision : ruleOptDecimalPrecision EOF ;
    public final void entryRuleOptDecimalPrecision() throws RecognitionException {
        try {
            // InternalPortugol.g:737:1: ( ruleOptDecimalPrecision EOF )
            // InternalPortugol.g:738:1: ruleOptDecimalPrecision EOF
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
    // InternalPortugol.g:745:1: ruleOptDecimalPrecision : ( ( rule__OptDecimalPrecision__Group__0 ) ) ;
    public final void ruleOptDecimalPrecision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:749:2: ( ( ( rule__OptDecimalPrecision__Group__0 ) ) )
            // InternalPortugol.g:750:2: ( ( rule__OptDecimalPrecision__Group__0 ) )
            {
            // InternalPortugol.g:750:2: ( ( rule__OptDecimalPrecision__Group__0 ) )
            // InternalPortugol.g:751:3: ( rule__OptDecimalPrecision__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getGroup()); 
            }
            // InternalPortugol.g:752:3: ( rule__OptDecimalPrecision__Group__0 )
            // InternalPortugol.g:752:4: rule__OptDecimalPrecision__Group__0
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
    // InternalPortugol.g:761:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:762:1: ( ruleExpression EOF )
            // InternalPortugol.g:763:1: ruleExpression EOF
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
    // InternalPortugol.g:770:1: ruleExpression : ( ruleAssignment ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:774:2: ( ( ruleAssignment ) )
            // InternalPortugol.g:775:2: ( ruleAssignment )
            {
            // InternalPortugol.g:775:2: ( ruleAssignment )
            // InternalPortugol.g:776:3: ruleAssignment
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
    // InternalPortugol.g:786:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalPortugol.g:787:1: ( ruleAssignment EOF )
            // InternalPortugol.g:788:1: ruleAssignment EOF
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
    // InternalPortugol.g:795:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:799:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalPortugol.g:800:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalPortugol.g:800:2: ( ( rule__Assignment__Group__0 ) )
            // InternalPortugol.g:801:3: ( rule__Assignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // InternalPortugol.g:802:3: ( rule__Assignment__Group__0 )
            // InternalPortugol.g:802:4: rule__Assignment__Group__0
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
    // InternalPortugol.g:811:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:812:1: ( ruleOrExpression EOF )
            // InternalPortugol.g:813:1: ruleOrExpression EOF
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
    // InternalPortugol.g:820:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:824:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalPortugol.g:825:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalPortugol.g:825:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalPortugol.g:826:3: ( rule__OrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:827:3: ( rule__OrExpression__Group__0 )
            // InternalPortugol.g:827:4: rule__OrExpression__Group__0
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
    // InternalPortugol.g:836:1: entryRuleXorExpression : ruleXorExpression EOF ;
    public final void entryRuleXorExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:837:1: ( ruleXorExpression EOF )
            // InternalPortugol.g:838:1: ruleXorExpression EOF
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
    // InternalPortugol.g:845:1: ruleXorExpression : ( ( rule__XorExpression__Group__0 ) ) ;
    public final void ruleXorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:849:2: ( ( ( rule__XorExpression__Group__0 ) ) )
            // InternalPortugol.g:850:2: ( ( rule__XorExpression__Group__0 ) )
            {
            // InternalPortugol.g:850:2: ( ( rule__XorExpression__Group__0 ) )
            // InternalPortugol.g:851:3: ( rule__XorExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:852:3: ( rule__XorExpression__Group__0 )
            // InternalPortugol.g:852:4: rule__XorExpression__Group__0
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
    // InternalPortugol.g:861:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:862:1: ( ruleAndExpression EOF )
            // InternalPortugol.g:863:1: ruleAndExpression EOF
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
    // InternalPortugol.g:870:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:874:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalPortugol.g:875:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalPortugol.g:875:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalPortugol.g:876:3: ( rule__AndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:877:3: ( rule__AndExpression__Group__0 )
            // InternalPortugol.g:877:4: rule__AndExpression__Group__0
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
    // InternalPortugol.g:886:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalPortugol.g:887:1: ( ruleComparison EOF )
            // InternalPortugol.g:888:1: ruleComparison EOF
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
    // InternalPortugol.g:895:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:899:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalPortugol.g:900:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalPortugol.g:900:2: ( ( rule__Comparison__Group__0 ) )
            // InternalPortugol.g:901:3: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // InternalPortugol.g:902:3: ( rule__Comparison__Group__0 )
            // InternalPortugol.g:902:4: rule__Comparison__Group__0
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
    // InternalPortugol.g:911:1: entryRuleEquExpression : ruleEquExpression EOF ;
    public final void entryRuleEquExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:912:1: ( ruleEquExpression EOF )
            // InternalPortugol.g:913:1: ruleEquExpression EOF
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
    // InternalPortugol.g:920:1: ruleEquExpression : ( ( rule__EquExpression__Group__0 ) ) ;
    public final void ruleEquExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:924:2: ( ( ( rule__EquExpression__Group__0 ) ) )
            // InternalPortugol.g:925:2: ( ( rule__EquExpression__Group__0 ) )
            {
            // InternalPortugol.g:925:2: ( ( rule__EquExpression__Group__0 ) )
            // InternalPortugol.g:926:3: ( rule__EquExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:927:3: ( rule__EquExpression__Group__0 )
            // InternalPortugol.g:927:4: rule__EquExpression__Group__0
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
    // InternalPortugol.g:936:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:937:1: ( ruleAddExpression EOF )
            // InternalPortugol.g:938:1: ruleAddExpression EOF
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
    // InternalPortugol.g:945:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:949:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // InternalPortugol.g:950:2: ( ( rule__AddExpression__Group__0 ) )
            {
            // InternalPortugol.g:950:2: ( ( rule__AddExpression__Group__0 ) )
            // InternalPortugol.g:951:3: ( rule__AddExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:952:3: ( rule__AddExpression__Group__0 )
            // InternalPortugol.g:952:4: rule__AddExpression__Group__0
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
    // InternalPortugol.g:961:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:962:1: ( ruleMultiplicativeExpression EOF )
            // InternalPortugol.g:963:1: ruleMultiplicativeExpression EOF
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
    // InternalPortugol.g:970:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:974:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // InternalPortugol.g:975:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // InternalPortugol.g:975:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // InternalPortugol.g:976:3: ( rule__MultiplicativeExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:977:3: ( rule__MultiplicativeExpression__Group__0 )
            // InternalPortugol.g:977:4: rule__MultiplicativeExpression__Group__0
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
    // InternalPortugol.g:986:1: entryRulePowerExpression : rulePowerExpression EOF ;
    public final void entryRulePowerExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:987:1: ( rulePowerExpression EOF )
            // InternalPortugol.g:988:1: rulePowerExpression EOF
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
    // InternalPortugol.g:995:1: rulePowerExpression : ( ( rule__PowerExpression__Group__0 ) ) ;
    public final void rulePowerExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:999:2: ( ( ( rule__PowerExpression__Group__0 ) ) )
            // InternalPortugol.g:1000:2: ( ( rule__PowerExpression__Group__0 ) )
            {
            // InternalPortugol.g:1000:2: ( ( rule__PowerExpression__Group__0 ) )
            // InternalPortugol.g:1001:3: ( rule__PowerExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:1002:3: ( rule__PowerExpression__Group__0 )
            // InternalPortugol.g:1002:4: rule__PowerExpression__Group__0
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
    // InternalPortugol.g:1011:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:1012:1: ( ruleUnaryExpression EOF )
            // InternalPortugol.g:1013:1: ruleUnaryExpression EOF
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
    // InternalPortugol.g:1020:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1024:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // InternalPortugol.g:1025:2: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // InternalPortugol.g:1025:2: ( ( rule__UnaryExpression__Alternatives ) )
            // InternalPortugol.g:1026:3: ( rule__UnaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            }
            // InternalPortugol.g:1027:3: ( rule__UnaryExpression__Alternatives )
            // InternalPortugol.g:1027:4: rule__UnaryExpression__Alternatives
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
    // InternalPortugol.g:1036:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:1037:1: ( rulePrimaryExpression EOF )
            // InternalPortugol.g:1038:1: rulePrimaryExpression EOF
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
    // InternalPortugol.g:1045:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1049:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalPortugol.g:1050:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalPortugol.g:1050:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalPortugol.g:1051:3: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // InternalPortugol.g:1052:3: ( rule__PrimaryExpression__Alternatives )
            // InternalPortugol.g:1052:4: rule__PrimaryExpression__Alternatives
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
    // InternalPortugol.g:1061:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalPortugol.g:1062:1: ( ruleFunctionCall EOF )
            // InternalPortugol.g:1063:1: ruleFunctionCall EOF
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
    // InternalPortugol.g:1070:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1074:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalPortugol.g:1075:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalPortugol.g:1075:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalPortugol.g:1076:3: ( rule__FunctionCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup()); 
            }
            // InternalPortugol.g:1077:3: ( rule__FunctionCall__Group__0 )
            // InternalPortugol.g:1077:4: rule__FunctionCall__Group__0
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
    // InternalPortugol.g:1086:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalPortugol.g:1087:1: ( ruleLiteral EOF )
            // InternalPortugol.g:1088:1: ruleLiteral EOF
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
    // InternalPortugol.g:1095:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1099:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalPortugol.g:1100:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalPortugol.g:1100:2: ( ( rule__Literal__Alternatives ) )
            // InternalPortugol.g:1101:3: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalPortugol.g:1102:3: ( rule__Literal__Alternatives )
            // InternalPortugol.g:1102:4: rule__Literal__Alternatives
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
    // InternalPortugol.g:1111:1: entryRuleDeclaredVar : ruleDeclaredVar EOF ;
    public final void entryRuleDeclaredVar() throws RecognitionException {
        try {
            // InternalPortugol.g:1112:1: ( ruleDeclaredVar EOF )
            // InternalPortugol.g:1113:1: ruleDeclaredVar EOF
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
    // InternalPortugol.g:1120:1: ruleDeclaredVar : ( ( rule__DeclaredVar__VarNameAssignment ) ) ;
    public final void ruleDeclaredVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1124:2: ( ( ( rule__DeclaredVar__VarNameAssignment ) ) )
            // InternalPortugol.g:1125:2: ( ( rule__DeclaredVar__VarNameAssignment ) )
            {
            // InternalPortugol.g:1125:2: ( ( rule__DeclaredVar__VarNameAssignment ) )
            // InternalPortugol.g:1126:3: ( rule__DeclaredVar__VarNameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getVarNameAssignment()); 
            }
            // InternalPortugol.g:1127:3: ( rule__DeclaredVar__VarNameAssignment )
            // InternalPortugol.g:1127:4: rule__DeclaredVar__VarNameAssignment
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
    // InternalPortugol.g:1136:1: entryRuleNumericLiteral : ruleNumericLiteral EOF ;
    public final void entryRuleNumericLiteral() throws RecognitionException {
        try {
            // InternalPortugol.g:1137:1: ( ruleNumericLiteral EOF )
            // InternalPortugol.g:1138:1: ruleNumericLiteral EOF
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
    // InternalPortugol.g:1145:1: ruleNumericLiteral : ( ( rule__NumericLiteral__Alternatives ) ) ;
    public final void ruleNumericLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1149:2: ( ( ( rule__NumericLiteral__Alternatives ) ) )
            // InternalPortugol.g:1150:2: ( ( rule__NumericLiteral__Alternatives ) )
            {
            // InternalPortugol.g:1150:2: ( ( rule__NumericLiteral__Alternatives ) )
            // InternalPortugol.g:1151:3: ( rule__NumericLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericLiteralAccess().getAlternatives()); 
            }
            // InternalPortugol.g:1152:3: ( rule__NumericLiteral__Alternatives )
            // InternalPortugol.g:1152:4: rule__NumericLiteral__Alternatives
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
    // InternalPortugol.g:1161:1: entryRuleStringExpression : ruleStringExpression EOF ;
    public final void entryRuleStringExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:1162:1: ( ruleStringExpression EOF )
            // InternalPortugol.g:1163:1: ruleStringExpression EOF
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
    // InternalPortugol.g:1170:1: ruleStringExpression : ( ( rule__StringExpression__LiteralStringAssignment ) ) ;
    public final void ruleStringExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1174:2: ( ( ( rule__StringExpression__LiteralStringAssignment ) ) )
            // InternalPortugol.g:1175:2: ( ( rule__StringExpression__LiteralStringAssignment ) )
            {
            // InternalPortugol.g:1175:2: ( ( rule__StringExpression__LiteralStringAssignment ) )
            // InternalPortugol.g:1176:3: ( rule__StringExpression__LiteralStringAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringExpressionAccess().getLiteralStringAssignment()); 
            }
            // InternalPortugol.g:1177:3: ( rule__StringExpression__LiteralStringAssignment )
            // InternalPortugol.g:1177:4: rule__StringExpression__LiteralStringAssignment
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
    // InternalPortugol.g:1186:1: entryRuleEND_COMMAND : ruleEND_COMMAND EOF ;
    public final void entryRuleEND_COMMAND() throws RecognitionException {
        try {
            // InternalPortugol.g:1187:1: ( ruleEND_COMMAND EOF )
            // InternalPortugol.g:1188:1: ruleEND_COMMAND EOF
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
    // InternalPortugol.g:1195:1: ruleEND_COMMAND : ( ';' ) ;
    public final void ruleEND_COMMAND() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1199:2: ( ( ';' ) )
            // InternalPortugol.g:1200:2: ( ';' )
            {
            // InternalPortugol.g:1200:2: ( ';' )
            // InternalPortugol.g:1201:3: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEND_COMMANDAccess().getSemicolonKeyword()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1210:1: rule__VarType__TypeNameAlternatives_0 : ( ( 'real' ) | ( 'inteiro' ) | ( 'caractere' ) | ( 'caracter' ) );
    public final void rule__VarType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1214:1: ( ( 'real' ) | ( 'inteiro' ) | ( 'caractere' ) | ( 'caracter' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
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
                    // InternalPortugol.g:1215:2: ( 'real' )
                    {
                    // InternalPortugol.g:1215:2: ( 'real' )
                    // InternalPortugol.g:1216:3: 'real'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarTypeAccess().getTypeNameRealKeyword_0_0()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarTypeAccess().getTypeNameRealKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:1221:2: ( 'inteiro' )
                    {
                    // InternalPortugol.g:1221:2: ( 'inteiro' )
                    // InternalPortugol.g:1222:3: 'inteiro'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarTypeAccess().getTypeNameInteiroKeyword_0_1()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarTypeAccess().getTypeNameInteiroKeyword_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPortugol.g:1227:2: ( 'caractere' )
                    {
                    // InternalPortugol.g:1227:2: ( 'caractere' )
                    // InternalPortugol.g:1228:3: 'caractere'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarTypeAccess().getTypeNameCaractereKeyword_0_2()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarTypeAccess().getTypeNameCaractereKeyword_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPortugol.g:1233:2: ( 'caracter' )
                    {
                    // InternalPortugol.g:1233:2: ( 'caracter' )
                    // InternalPortugol.g:1234:3: 'caracter'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarTypeAccess().getTypeNameCaracterKeyword_0_3()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1243:1: rule__BlockSubPrograms__Alternatives : ( ( ruleBlockFunction ) | ( ruleBlockProcedure ) );
    public final void rule__BlockSubPrograms__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1247:1: ( ( ruleBlockFunction ) | ( ruleBlockProcedure ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==38) ) {
                alt3=1;
            }
            else if ( (LA3_0==43) ) {
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
                    // InternalPortugol.g:1248:2: ( ruleBlockFunction )
                    {
                    // InternalPortugol.g:1248:2: ( ruleBlockFunction )
                    // InternalPortugol.g:1249:3: ruleBlockFunction
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
                    // InternalPortugol.g:1254:2: ( ruleBlockProcedure )
                    {
                    // InternalPortugol.g:1254:2: ( ruleBlockProcedure )
                    // InternalPortugol.g:1255:3: ruleBlockProcedure
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
    // InternalPortugol.g:1264:1: rule__AbstractCommand__Alternatives : ( ( ( rule__AbstractCommand__Group_0__0 ) ) | ( ( rule__AbstractCommand__Group_1__0 ) ) | ( ( rule__AbstractCommand__Group_2__0 ) ) | ( ruleIfStatement ) | ( ruleSwitchCaseStatement ) | ( ruleForStatement ) | ( ruleRepeatStatement ) | ( ruleWhileStatement ) );
    public final void rule__AbstractCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1268:1: ( ( ( rule__AbstractCommand__Group_0__0 ) ) | ( ( rule__AbstractCommand__Group_1__0 ) ) | ( ( rule__AbstractCommand__Group_2__0 ) ) | ( ruleIfStatement ) | ( ruleSwitchCaseStatement ) | ( ruleForStatement ) | ( ruleRepeatStatement ) | ( ruleWhileStatement ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt4=1;
                }
                break;
            case 17:
            case 18:
                {
                alt4=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case RULE_FLOAT:
            case 28:
            case 33:
            case 39:
                {
                alt4=3;
                }
                break;
            case 46:
                {
                alt4=4;
                }
                break;
            case 50:
                {
                alt4=5;
                }
                break;
            case 54:
                {
                alt4=6;
                }
                break;
            case 62:
                {
                alt4=7;
                }
                break;
            case 60:
                {
                alt4=8;
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
                    // InternalPortugol.g:1269:2: ( ( rule__AbstractCommand__Group_0__0 ) )
                    {
                    // InternalPortugol.g:1269:2: ( ( rule__AbstractCommand__Group_0__0 ) )
                    // InternalPortugol.g:1270:3: ( rule__AbstractCommand__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_0()); 
                    }
                    // InternalPortugol.g:1271:3: ( rule__AbstractCommand__Group_0__0 )
                    // InternalPortugol.g:1271:4: rule__AbstractCommand__Group_0__0
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
                    // InternalPortugol.g:1275:2: ( ( rule__AbstractCommand__Group_1__0 ) )
                    {
                    // InternalPortugol.g:1275:2: ( ( rule__AbstractCommand__Group_1__0 ) )
                    // InternalPortugol.g:1276:3: ( rule__AbstractCommand__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_1()); 
                    }
                    // InternalPortugol.g:1277:3: ( rule__AbstractCommand__Group_1__0 )
                    // InternalPortugol.g:1277:4: rule__AbstractCommand__Group_1__0
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
                    // InternalPortugol.g:1281:2: ( ( rule__AbstractCommand__Group_2__0 ) )
                    {
                    // InternalPortugol.g:1281:2: ( ( rule__AbstractCommand__Group_2__0 ) )
                    // InternalPortugol.g:1282:3: ( rule__AbstractCommand__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_2()); 
                    }
                    // InternalPortugol.g:1283:3: ( rule__AbstractCommand__Group_2__0 )
                    // InternalPortugol.g:1283:4: rule__AbstractCommand__Group_2__0
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
                    // InternalPortugol.g:1287:2: ( ruleIfStatement )
                    {
                    // InternalPortugol.g:1287:2: ( ruleIfStatement )
                    // InternalPortugol.g:1288:3: ruleIfStatement
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
                    // InternalPortugol.g:1293:2: ( ruleSwitchCaseStatement )
                    {
                    // InternalPortugol.g:1293:2: ( ruleSwitchCaseStatement )
                    // InternalPortugol.g:1294:3: ruleSwitchCaseStatement
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
                    // InternalPortugol.g:1299:2: ( ruleForStatement )
                    {
                    // InternalPortugol.g:1299:2: ( ruleForStatement )
                    // InternalPortugol.g:1300:3: ruleForStatement
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
                    // InternalPortugol.g:1305:2: ( ruleRepeatStatement )
                    {
                    // InternalPortugol.g:1305:2: ( ruleRepeatStatement )
                    // InternalPortugol.g:1306:3: ruleRepeatStatement
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
                    // InternalPortugol.g:1311:2: ( ruleWhileStatement )
                    {
                    // InternalPortugol.g:1311:2: ( ruleWhileStatement )
                    // InternalPortugol.g:1312:3: ruleWhileStatement
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

            }
        }
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
    // InternalPortugol.g:1321:1: rule__WriteCommand__WriteCommandAlternatives_0_0 : ( ( 'escreva' ) | ( 'escreval' ) );
    public final void rule__WriteCommand__WriteCommandAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1325:1: ( ( 'escreva' ) | ( 'escreval' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
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
                    // InternalPortugol.g:1326:2: ( 'escreva' )
                    {
                    // InternalPortugol.g:1326:2: ( 'escreva' )
                    // InternalPortugol.g:1327:3: 'escreva'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWriteCommandAccess().getWriteCommandEscrevaKeyword_0_0_0()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWriteCommandAccess().getWriteCommandEscrevaKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:1332:2: ( 'escreval' )
                    {
                    // InternalPortugol.g:1332:2: ( 'escreval' )
                    // InternalPortugol.g:1333:3: 'escreval'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWriteCommandAccess().getWriteCommandEscrevalKeyword_0_0_1()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1342:1: rule__AndExpression__OpAlternatives_1_0_0_1_0 : ( ( '&' ) | ( 'E' ) );
    public final void rule__AndExpression__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1346:1: ( ( '&' ) | ( 'E' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
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
                    // InternalPortugol.g:1347:2: ( '&' )
                    {
                    // InternalPortugol.g:1347:2: ( '&' )
                    // InternalPortugol.g:1348:3: '&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndExpressionAccess().getOpAmpersandKeyword_1_0_0_1_0_0()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAndExpressionAccess().getOpAmpersandKeyword_1_0_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:1353:2: ( 'E' )
                    {
                    // InternalPortugol.g:1353:2: ( 'E' )
                    // InternalPortugol.g:1354:3: 'E'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndExpressionAccess().getOpEKeyword_1_0_0_1_0_1()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1363:1: rule__Comparison__OpAlternatives_1_0_0_1_0 : ( ( '=' ) | ( '<>' ) );
    public final void rule__Comparison__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1367:1: ( ( '=' ) | ( '<>' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
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
                    // InternalPortugol.g:1368:2: ( '=' )
                    {
                    // InternalPortugol.g:1368:2: ( '=' )
                    // InternalPortugol.g:1369:3: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getOpEqualsSignKeyword_1_0_0_1_0_0()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getOpEqualsSignKeyword_1_0_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:1374:2: ( '<>' )
                    {
                    // InternalPortugol.g:1374:2: ( '<>' )
                    // InternalPortugol.g:1375:3: '<>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getOpLessThanSignGreaterThanSignKeyword_1_0_0_1_0_1()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1384:1: rule__EquExpression__OpAlternatives_1_0_0_1_0 : ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__EquExpression__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1388:1: ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 25:
                {
                alt8=3;
                }
                break;
            case 26:
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
                    // InternalPortugol.g:1389:2: ( '<' )
                    {
                    // InternalPortugol.g:1389:2: ( '<' )
                    // InternalPortugol.g:1390:3: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEquExpressionAccess().getOpLessThanSignKeyword_1_0_0_1_0_0()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEquExpressionAccess().getOpLessThanSignKeyword_1_0_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:1395:2: ( '>' )
                    {
                    // InternalPortugol.g:1395:2: ( '>' )
                    // InternalPortugol.g:1396:3: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEquExpressionAccess().getOpGreaterThanSignKeyword_1_0_0_1_0_1()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEquExpressionAccess().getOpGreaterThanSignKeyword_1_0_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPortugol.g:1401:2: ( '<=' )
                    {
                    // InternalPortugol.g:1401:2: ( '<=' )
                    // InternalPortugol.g:1402:3: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEquExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_0_0_1_0_2()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEquExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_0_0_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPortugol.g:1407:2: ( '>=' )
                    {
                    // InternalPortugol.g:1407:2: ( '>=' )
                    // InternalPortugol.g:1408:3: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEquExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_0_1_0_3()); 
                    }
                    match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1417:1: rule__AddExpression__OpAlternatives_1_0_0_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__AddExpression__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1421:1: ( ( '+' ) | ( '-' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            else if ( (LA9_0==28) ) {
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
                    // InternalPortugol.g:1422:2: ( '+' )
                    {
                    // InternalPortugol.g:1422:2: ( '+' )
                    // InternalPortugol.g:1423:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddExpressionAccess().getOpPlusSignKeyword_1_0_0_1_0_0()); 
                    }
                    match(input,27,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAddExpressionAccess().getOpPlusSignKeyword_1_0_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:1428:2: ( '-' )
                    {
                    // InternalPortugol.g:1428:2: ( '-' )
                    // InternalPortugol.g:1429:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddExpressionAccess().getOpHyphenMinusKeyword_1_0_0_1_0_1()); 
                    }
                    match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1438:1: rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 : ( ( '*' ) | ( '/' ) | ( 'MOD' ) | ( '%' ) );
    public final void rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1442:1: ( ( '*' ) | ( '/' ) | ( 'MOD' ) | ( '%' ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt10=1;
                }
                break;
            case 30:
                {
                alt10=2;
                }
                break;
            case 31:
                {
                alt10=3;
                }
                break;
            case 32:
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
                    // InternalPortugol.g:1443:2: ( '*' )
                    {
                    // InternalPortugol.g:1443:2: ( '*' )
                    // InternalPortugol.g:1444:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeExpressionAccess().getOpAsteriskKeyword_1_0_0_1_0_0()); 
                    }
                    match(input,29,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeExpressionAccess().getOpAsteriskKeyword_1_0_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:1449:2: ( '/' )
                    {
                    // InternalPortugol.g:1449:2: ( '/' )
                    // InternalPortugol.g:1450:3: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeExpressionAccess().getOpSolidusKeyword_1_0_0_1_0_1()); 
                    }
                    match(input,30,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeExpressionAccess().getOpSolidusKeyword_1_0_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPortugol.g:1455:2: ( 'MOD' )
                    {
                    // InternalPortugol.g:1455:2: ( 'MOD' )
                    // InternalPortugol.g:1456:3: 'MOD'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeExpressionAccess().getOpMODKeyword_1_0_0_1_0_2()); 
                    }
                    match(input,31,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeExpressionAccess().getOpMODKeyword_1_0_0_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPortugol.g:1461:2: ( '%' )
                    {
                    // InternalPortugol.g:1461:2: ( '%' )
                    // InternalPortugol.g:1462:3: '%'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeExpressionAccess().getOpPercentSignKeyword_1_0_0_1_0_3()); 
                    }
                    match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1471:1: rule__UnaryExpression__Alternatives : ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( rulePrimaryExpression ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1475:1: ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( rulePrimaryExpression ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28||LA11_0==33) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_FLOAT)||LA11_0==39) ) {
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
                    // InternalPortugol.g:1476:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    {
                    // InternalPortugol.g:1476:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    // InternalPortugol.g:1477:3: ( rule__UnaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    }
                    // InternalPortugol.g:1478:3: ( rule__UnaryExpression__Group_0__0 )
                    // InternalPortugol.g:1478:4: rule__UnaryExpression__Group_0__0
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
                    // InternalPortugol.g:1482:2: ( rulePrimaryExpression )
                    {
                    // InternalPortugol.g:1482:2: ( rulePrimaryExpression )
                    // InternalPortugol.g:1483:3: rulePrimaryExpression
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
    // InternalPortugol.g:1492:1: rule__UnaryExpression__OpAlternatives_0_1_0 : ( ( 'NOT' ) | ( '-' ) );
    public final void rule__UnaryExpression__OpAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1496:1: ( ( 'NOT' ) | ( '-' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            else if ( (LA12_0==28) ) {
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
                    // InternalPortugol.g:1497:2: ( 'NOT' )
                    {
                    // InternalPortugol.g:1497:2: ( 'NOT' )
                    // InternalPortugol.g:1498:3: 'NOT'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getOpNOTKeyword_0_1_0_0()); 
                    }
                    match(input,33,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExpressionAccess().getOpNOTKeyword_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:1503:2: ( '-' )
                    {
                    // InternalPortugol.g:1503:2: ( '-' )
                    // InternalPortugol.g:1504:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getOpHyphenMinusKeyword_0_1_0_1()); 
                    }
                    match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1513:1: rule__PrimaryExpression__Alternatives : ( ( ruleLiteral ) | ( ruleFunctionCall ) | ( ruleDeclaredVar ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1517:1: ( ( ruleLiteral ) | ( ruleFunctionCall ) | ( ruleDeclaredVar ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_FLOAT:
                {
                alt13=1;
                }
                break;
            case RULE_ID:
                {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==EOF||LA13_2==12||(LA13_2>=19 && LA13_2<=32)||(LA13_2>=36 && LA13_2<=37)||LA13_2==40||LA13_2==47||(LA13_2>=55 && LA13_2<=57)||LA13_2==59||(LA13_2>=65 && LA13_2<=68)) ) {
                    alt13=3;
                }
                else if ( (LA13_2==39) ) {
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
            case 39:
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
                    // InternalPortugol.g:1518:2: ( ruleLiteral )
                    {
                    // InternalPortugol.g:1518:2: ( ruleLiteral )
                    // InternalPortugol.g:1519:3: ruleLiteral
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
                    // InternalPortugol.g:1524:2: ( ruleFunctionCall )
                    {
                    // InternalPortugol.g:1524:2: ( ruleFunctionCall )
                    // InternalPortugol.g:1525:3: ruleFunctionCall
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
                    // InternalPortugol.g:1530:2: ( ruleDeclaredVar )
                    {
                    // InternalPortugol.g:1530:2: ( ruleDeclaredVar )
                    // InternalPortugol.g:1531:3: ruleDeclaredVar
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
                    // InternalPortugol.g:1536:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    {
                    // InternalPortugol.g:1536:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    // InternalPortugol.g:1537:3: ( rule__PrimaryExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 
                    }
                    // InternalPortugol.g:1538:3: ( rule__PrimaryExpression__Group_3__0 )
                    // InternalPortugol.g:1538:4: rule__PrimaryExpression__Group_3__0
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
    // InternalPortugol.g:1546:1: rule__Literal__Alternatives : ( ( ruleNumericLiteral ) | ( ruleStringExpression ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1550:1: ( ( ruleNumericLiteral ) | ( ruleStringExpression ) )
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
                    // InternalPortugol.g:1551:2: ( ruleNumericLiteral )
                    {
                    // InternalPortugol.g:1551:2: ( ruleNumericLiteral )
                    // InternalPortugol.g:1552:3: ruleNumericLiteral
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
                    // InternalPortugol.g:1557:2: ( ruleStringExpression )
                    {
                    // InternalPortugol.g:1557:2: ( ruleStringExpression )
                    // InternalPortugol.g:1558:3: ruleStringExpression
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
    // InternalPortugol.g:1567:1: rule__NumericLiteral__Alternatives : ( ( ( rule__NumericLiteral__IntValueAssignment_0 ) ) | ( ( rule__NumericLiteral__FloatValueAssignment_1 ) ) );
    public final void rule__NumericLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1571:1: ( ( ( rule__NumericLiteral__IntValueAssignment_0 ) ) | ( ( rule__NumericLiteral__FloatValueAssignment_1 ) ) )
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
                    // InternalPortugol.g:1572:2: ( ( rule__NumericLiteral__IntValueAssignment_0 ) )
                    {
                    // InternalPortugol.g:1572:2: ( ( rule__NumericLiteral__IntValueAssignment_0 ) )
                    // InternalPortugol.g:1573:3: ( rule__NumericLiteral__IntValueAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericLiteralAccess().getIntValueAssignment_0()); 
                    }
                    // InternalPortugol.g:1574:3: ( rule__NumericLiteral__IntValueAssignment_0 )
                    // InternalPortugol.g:1574:4: rule__NumericLiteral__IntValueAssignment_0
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
                    // InternalPortugol.g:1578:2: ( ( rule__NumericLiteral__FloatValueAssignment_1 ) )
                    {
                    // InternalPortugol.g:1578:2: ( ( rule__NumericLiteral__FloatValueAssignment_1 ) )
                    // InternalPortugol.g:1579:3: ( rule__NumericLiteral__FloatValueAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericLiteralAccess().getFloatValueAssignment_1()); 
                    }
                    // InternalPortugol.g:1580:3: ( rule__NumericLiteral__FloatValueAssignment_1 )
                    // InternalPortugol.g:1580:4: rule__NumericLiteral__FloatValueAssignment_1
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
    // InternalPortugol.g:1588:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1592:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalPortugol.g:1593:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalPortugol.g:1600:1: rule__Model__Group__0__Impl : ( ( rule__Model__HeaderAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1604:1: ( ( ( rule__Model__HeaderAssignment_0 ) ) )
            // InternalPortugol.g:1605:1: ( ( rule__Model__HeaderAssignment_0 ) )
            {
            // InternalPortugol.g:1605:1: ( ( rule__Model__HeaderAssignment_0 ) )
            // InternalPortugol.g:1606:2: ( rule__Model__HeaderAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getHeaderAssignment_0()); 
            }
            // InternalPortugol.g:1607:2: ( rule__Model__HeaderAssignment_0 )
            // InternalPortugol.g:1607:3: rule__Model__HeaderAssignment_0
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
    // InternalPortugol.g:1615:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1619:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalPortugol.g:1620:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalPortugol.g:1627:1: rule__Model__Group__1__Impl : ( ( rule__Model__GlobalDeclarationsAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1631:1: ( ( ( rule__Model__GlobalDeclarationsAssignment_1 ) ) )
            // InternalPortugol.g:1632:1: ( ( rule__Model__GlobalDeclarationsAssignment_1 ) )
            {
            // InternalPortugol.g:1632:1: ( ( rule__Model__GlobalDeclarationsAssignment_1 ) )
            // InternalPortugol.g:1633:2: ( rule__Model__GlobalDeclarationsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGlobalDeclarationsAssignment_1()); 
            }
            // InternalPortugol.g:1634:2: ( rule__Model__GlobalDeclarationsAssignment_1 )
            // InternalPortugol.g:1634:3: rule__Model__GlobalDeclarationsAssignment_1
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
    // InternalPortugol.g:1642:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1646:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalPortugol.g:1647:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalPortugol.g:1654:1: rule__Model__Group__2__Impl : ( ( rule__Model__SubprogramsAssignment_2 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1658:1: ( ( ( rule__Model__SubprogramsAssignment_2 )? ) )
            // InternalPortugol.g:1659:1: ( ( rule__Model__SubprogramsAssignment_2 )? )
            {
            // InternalPortugol.g:1659:1: ( ( rule__Model__SubprogramsAssignment_2 )? )
            // InternalPortugol.g:1660:2: ( rule__Model__SubprogramsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSubprogramsAssignment_2()); 
            }
            // InternalPortugol.g:1661:2: ( rule__Model__SubprogramsAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38||LA16_0==43) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPortugol.g:1661:3: rule__Model__SubprogramsAssignment_2
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
    // InternalPortugol.g:1669:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1673:1: ( rule__Model__Group__3__Impl )
            // InternalPortugol.g:1674:2: rule__Model__Group__3__Impl
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
    // InternalPortugol.g:1680:1: rule__Model__Group__3__Impl : ( ( rule__Model__CommandsAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1684:1: ( ( ( rule__Model__CommandsAssignment_3 ) ) )
            // InternalPortugol.g:1685:1: ( ( rule__Model__CommandsAssignment_3 ) )
            {
            // InternalPortugol.g:1685:1: ( ( rule__Model__CommandsAssignment_3 ) )
            // InternalPortugol.g:1686:2: ( rule__Model__CommandsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugol.g:1687:2: ( rule__Model__CommandsAssignment_3 )
            // InternalPortugol.g:1687:3: rule__Model__CommandsAssignment_3
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
    // InternalPortugol.g:1696:1: rule__HeaderBlock__Group__0 : rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1 ;
    public final void rule__HeaderBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1700:1: ( rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1 )
            // InternalPortugol.g:1701:2: rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1
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
    // InternalPortugol.g:1708:1: rule__HeaderBlock__Group__0__Impl : ( 'algoritmo' ) ;
    public final void rule__HeaderBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1712:1: ( ( 'algoritmo' ) )
            // InternalPortugol.g:1713:1: ( 'algoritmo' )
            {
            // InternalPortugol.g:1713:1: ( 'algoritmo' )
            // InternalPortugol.g:1714:2: 'algoritmo'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderBlockAccess().getAlgoritmoKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1723:1: rule__HeaderBlock__Group__1 : rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2 ;
    public final void rule__HeaderBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1727:1: ( rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2 )
            // InternalPortugol.g:1728:2: rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2
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
    // InternalPortugol.g:1735:1: rule__HeaderBlock__Group__1__Impl : ( ( rule__HeaderBlock__AlgorithmNameAssignment_1 ) ) ;
    public final void rule__HeaderBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1739:1: ( ( ( rule__HeaderBlock__AlgorithmNameAssignment_1 ) ) )
            // InternalPortugol.g:1740:1: ( ( rule__HeaderBlock__AlgorithmNameAssignment_1 ) )
            {
            // InternalPortugol.g:1740:1: ( ( rule__HeaderBlock__AlgorithmNameAssignment_1 ) )
            // InternalPortugol.g:1741:2: ( rule__HeaderBlock__AlgorithmNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderBlockAccess().getAlgorithmNameAssignment_1()); 
            }
            // InternalPortugol.g:1742:2: ( rule__HeaderBlock__AlgorithmNameAssignment_1 )
            // InternalPortugol.g:1742:3: rule__HeaderBlock__AlgorithmNameAssignment_1
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
    // InternalPortugol.g:1750:1: rule__HeaderBlock__Group__2 : rule__HeaderBlock__Group__2__Impl ;
    public final void rule__HeaderBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1754:1: ( rule__HeaderBlock__Group__2__Impl )
            // InternalPortugol.g:1755:2: rule__HeaderBlock__Group__2__Impl
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
    // InternalPortugol.g:1761:1: rule__HeaderBlock__Group__2__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__HeaderBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1765:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugol.g:1766:1: ( ruleEND_COMMAND )
            {
            // InternalPortugol.g:1766:1: ( ruleEND_COMMAND )
            // InternalPortugol.g:1767:2: ruleEND_COMMAND
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
    // InternalPortugol.g:1777:1: rule__DeclarationsBlock__Group__0 : rule__DeclarationsBlock__Group__0__Impl rule__DeclarationsBlock__Group__1 ;
    public final void rule__DeclarationsBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1781:1: ( rule__DeclarationsBlock__Group__0__Impl rule__DeclarationsBlock__Group__1 )
            // InternalPortugol.g:1782:2: rule__DeclarationsBlock__Group__0__Impl rule__DeclarationsBlock__Group__1
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
    // InternalPortugol.g:1789:1: rule__DeclarationsBlock__Group__0__Impl : ( 'var' ) ;
    public final void rule__DeclarationsBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1793:1: ( ( 'var' ) )
            // InternalPortugol.g:1794:1: ( 'var' )
            {
            // InternalPortugol.g:1794:1: ( 'var' )
            // InternalPortugol.g:1795:2: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getVarKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1804:1: rule__DeclarationsBlock__Group__1 : rule__DeclarationsBlock__Group__1__Impl ;
    public final void rule__DeclarationsBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1808:1: ( rule__DeclarationsBlock__Group__1__Impl )
            // InternalPortugol.g:1809:2: rule__DeclarationsBlock__Group__1__Impl
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
    // InternalPortugol.g:1815:1: rule__DeclarationsBlock__Group__1__Impl : ( ( ( rule__DeclarationsBlock__Group_1__0 ) ) ( ( rule__DeclarationsBlock__Group_1__0 )* ) ) ;
    public final void rule__DeclarationsBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1819:1: ( ( ( ( rule__DeclarationsBlock__Group_1__0 ) ) ( ( rule__DeclarationsBlock__Group_1__0 )* ) ) )
            // InternalPortugol.g:1820:1: ( ( ( rule__DeclarationsBlock__Group_1__0 ) ) ( ( rule__DeclarationsBlock__Group_1__0 )* ) )
            {
            // InternalPortugol.g:1820:1: ( ( ( rule__DeclarationsBlock__Group_1__0 ) ) ( ( rule__DeclarationsBlock__Group_1__0 )* ) )
            // InternalPortugol.g:1821:2: ( ( rule__DeclarationsBlock__Group_1__0 ) ) ( ( rule__DeclarationsBlock__Group_1__0 )* )
            {
            // InternalPortugol.g:1821:2: ( ( rule__DeclarationsBlock__Group_1__0 ) )
            // InternalPortugol.g:1822:3: ( rule__DeclarationsBlock__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getGroup_1()); 
            }
            // InternalPortugol.g:1823:3: ( rule__DeclarationsBlock__Group_1__0 )
            // InternalPortugol.g:1823:4: rule__DeclarationsBlock__Group_1__0
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

            // InternalPortugol.g:1826:2: ( ( rule__DeclarationsBlock__Group_1__0 )* )
            // InternalPortugol.g:1827:3: ( rule__DeclarationsBlock__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getGroup_1()); 
            }
            // InternalPortugol.g:1828:3: ( rule__DeclarationsBlock__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPortugol.g:1828:4: rule__DeclarationsBlock__Group_1__0
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
    // InternalPortugol.g:1838:1: rule__DeclarationsBlock__Group_1__0 : rule__DeclarationsBlock__Group_1__0__Impl rule__DeclarationsBlock__Group_1__1 ;
    public final void rule__DeclarationsBlock__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1842:1: ( rule__DeclarationsBlock__Group_1__0__Impl rule__DeclarationsBlock__Group_1__1 )
            // InternalPortugol.g:1843:2: rule__DeclarationsBlock__Group_1__0__Impl rule__DeclarationsBlock__Group_1__1
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
    // InternalPortugol.g:1850:1: rule__DeclarationsBlock__Group_1__0__Impl : ( ( rule__DeclarationsBlock__VarsAssignment_1_0 ) ) ;
    public final void rule__DeclarationsBlock__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1854:1: ( ( ( rule__DeclarationsBlock__VarsAssignment_1_0 ) ) )
            // InternalPortugol.g:1855:1: ( ( rule__DeclarationsBlock__VarsAssignment_1_0 ) )
            {
            // InternalPortugol.g:1855:1: ( ( rule__DeclarationsBlock__VarsAssignment_1_0 ) )
            // InternalPortugol.g:1856:2: ( rule__DeclarationsBlock__VarsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getVarsAssignment_1_0()); 
            }
            // InternalPortugol.g:1857:2: ( rule__DeclarationsBlock__VarsAssignment_1_0 )
            // InternalPortugol.g:1857:3: rule__DeclarationsBlock__VarsAssignment_1_0
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
    // InternalPortugol.g:1865:1: rule__DeclarationsBlock__Group_1__1 : rule__DeclarationsBlock__Group_1__1__Impl ;
    public final void rule__DeclarationsBlock__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1869:1: ( rule__DeclarationsBlock__Group_1__1__Impl )
            // InternalPortugol.g:1870:2: rule__DeclarationsBlock__Group_1__1__Impl
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
    // InternalPortugol.g:1876:1: rule__DeclarationsBlock__Group_1__1__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__DeclarationsBlock__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1880:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugol.g:1881:1: ( ruleEND_COMMAND )
            {
            // InternalPortugol.g:1881:1: ( ruleEND_COMMAND )
            // InternalPortugol.g:1882:2: ruleEND_COMMAND
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
    // InternalPortugol.g:1892:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1896:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalPortugol.g:1897:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalPortugol.g:1904:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__VarDeclarationAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1908:1: ( ( ( rule__Variable__VarDeclarationAssignment_0 ) ) )
            // InternalPortugol.g:1909:1: ( ( rule__Variable__VarDeclarationAssignment_0 ) )
            {
            // InternalPortugol.g:1909:1: ( ( rule__Variable__VarDeclarationAssignment_0 ) )
            // InternalPortugol.g:1910:2: ( rule__Variable__VarDeclarationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getVarDeclarationAssignment_0()); 
            }
            // InternalPortugol.g:1911:2: ( rule__Variable__VarDeclarationAssignment_0 )
            // InternalPortugol.g:1911:3: rule__Variable__VarDeclarationAssignment_0
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
    // InternalPortugol.g:1919:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1923:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalPortugol.g:1924:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
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
    // InternalPortugol.g:1931:1: rule__Variable__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1935:1: ( ( ':' ) )
            // InternalPortugol.g:1936:1: ( ':' )
            {
            // InternalPortugol.g:1936:1: ( ':' )
            // InternalPortugol.g:1937:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getColonKeyword_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1946:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1950:1: ( rule__Variable__Group__2__Impl )
            // InternalPortugol.g:1951:2: rule__Variable__Group__2__Impl
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
    // InternalPortugol.g:1957:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__TypeAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1961:1: ( ( ( rule__Variable__TypeAssignment_2 ) ) )
            // InternalPortugol.g:1962:1: ( ( rule__Variable__TypeAssignment_2 ) )
            {
            // InternalPortugol.g:1962:1: ( ( rule__Variable__TypeAssignment_2 ) )
            // InternalPortugol.g:1963:2: ( rule__Variable__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getTypeAssignment_2()); 
            }
            // InternalPortugol.g:1964:2: ( rule__Variable__TypeAssignment_2 )
            // InternalPortugol.g:1964:3: rule__Variable__TypeAssignment_2
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
    // InternalPortugol.g:1973:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1977:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // InternalPortugol.g:1978:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
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
    // InternalPortugol.g:1985:1: rule__VarDeclaration__Group__0__Impl : ( ( rule__VarDeclaration__VarsAssignment_0 ) ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1989:1: ( ( ( rule__VarDeclaration__VarsAssignment_0 ) ) )
            // InternalPortugol.g:1990:1: ( ( rule__VarDeclaration__VarsAssignment_0 ) )
            {
            // InternalPortugol.g:1990:1: ( ( rule__VarDeclaration__VarsAssignment_0 ) )
            // InternalPortugol.g:1991:2: ( rule__VarDeclaration__VarsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getVarsAssignment_0()); 
            }
            // InternalPortugol.g:1992:2: ( rule__VarDeclaration__VarsAssignment_0 )
            // InternalPortugol.g:1992:3: rule__VarDeclaration__VarsAssignment_0
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
    // InternalPortugol.g:2000:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2004:1: ( rule__VarDeclaration__Group__1__Impl )
            // InternalPortugol.g:2005:2: rule__VarDeclaration__Group__1__Impl
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
    // InternalPortugol.g:2011:1: rule__VarDeclaration__Group__1__Impl : ( ( rule__VarDeclaration__Group_1__0 )* ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2015:1: ( ( ( rule__VarDeclaration__Group_1__0 )* ) )
            // InternalPortugol.g:2016:1: ( ( rule__VarDeclaration__Group_1__0 )* )
            {
            // InternalPortugol.g:2016:1: ( ( rule__VarDeclaration__Group_1__0 )* )
            // InternalPortugol.g:2017:2: ( rule__VarDeclaration__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getGroup_1()); 
            }
            // InternalPortugol.g:2018:2: ( rule__VarDeclaration__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==37) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPortugol.g:2018:3: rule__VarDeclaration__Group_1__0
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
    // InternalPortugol.g:2027:1: rule__VarDeclaration__Group_1__0 : rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1 ;
    public final void rule__VarDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2031:1: ( rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1 )
            // InternalPortugol.g:2032:2: rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1
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
    // InternalPortugol.g:2039:1: rule__VarDeclaration__Group_1__0__Impl : ( ',' ) ;
    public final void rule__VarDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2043:1: ( ( ',' ) )
            // InternalPortugol.g:2044:1: ( ',' )
            {
            // InternalPortugol.g:2044:1: ( ',' )
            // InternalPortugol.g:2045:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getCommaKeyword_1_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2054:1: rule__VarDeclaration__Group_1__1 : rule__VarDeclaration__Group_1__1__Impl ;
    public final void rule__VarDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2058:1: ( rule__VarDeclaration__Group_1__1__Impl )
            // InternalPortugol.g:2059:2: rule__VarDeclaration__Group_1__1__Impl
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
    // InternalPortugol.g:2065:1: rule__VarDeclaration__Group_1__1__Impl : ( ( rule__VarDeclaration__VarsAssignment_1_1 ) ) ;
    public final void rule__VarDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2069:1: ( ( ( rule__VarDeclaration__VarsAssignment_1_1 ) ) )
            // InternalPortugol.g:2070:1: ( ( rule__VarDeclaration__VarsAssignment_1_1 ) )
            {
            // InternalPortugol.g:2070:1: ( ( rule__VarDeclaration__VarsAssignment_1_1 ) )
            // InternalPortugol.g:2071:2: ( rule__VarDeclaration__VarsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getVarsAssignment_1_1()); 
            }
            // InternalPortugol.g:2072:2: ( rule__VarDeclaration__VarsAssignment_1_1 )
            // InternalPortugol.g:2072:3: rule__VarDeclaration__VarsAssignment_1_1
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
    // InternalPortugol.g:2081:1: rule__DeclaredVarList__Group__0 : rule__DeclaredVarList__Group__0__Impl rule__DeclaredVarList__Group__1 ;
    public final void rule__DeclaredVarList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2085:1: ( rule__DeclaredVarList__Group__0__Impl rule__DeclaredVarList__Group__1 )
            // InternalPortugol.g:2086:2: rule__DeclaredVarList__Group__0__Impl rule__DeclaredVarList__Group__1
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
    // InternalPortugol.g:2093:1: rule__DeclaredVarList__Group__0__Impl : ( ( rule__DeclaredVarList__VarsAssignment_0 ) ) ;
    public final void rule__DeclaredVarList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2097:1: ( ( ( rule__DeclaredVarList__VarsAssignment_0 ) ) )
            // InternalPortugol.g:2098:1: ( ( rule__DeclaredVarList__VarsAssignment_0 ) )
            {
            // InternalPortugol.g:2098:1: ( ( rule__DeclaredVarList__VarsAssignment_0 ) )
            // InternalPortugol.g:2099:2: ( rule__DeclaredVarList__VarsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getVarsAssignment_0()); 
            }
            // InternalPortugol.g:2100:2: ( rule__DeclaredVarList__VarsAssignment_0 )
            // InternalPortugol.g:2100:3: rule__DeclaredVarList__VarsAssignment_0
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
    // InternalPortugol.g:2108:1: rule__DeclaredVarList__Group__1 : rule__DeclaredVarList__Group__1__Impl ;
    public final void rule__DeclaredVarList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2112:1: ( rule__DeclaredVarList__Group__1__Impl )
            // InternalPortugol.g:2113:2: rule__DeclaredVarList__Group__1__Impl
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
    // InternalPortugol.g:2119:1: rule__DeclaredVarList__Group__1__Impl : ( ( rule__DeclaredVarList__Group_1__0 )* ) ;
    public final void rule__DeclaredVarList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2123:1: ( ( ( rule__DeclaredVarList__Group_1__0 )* ) )
            // InternalPortugol.g:2124:1: ( ( rule__DeclaredVarList__Group_1__0 )* )
            {
            // InternalPortugol.g:2124:1: ( ( rule__DeclaredVarList__Group_1__0 )* )
            // InternalPortugol.g:2125:2: ( rule__DeclaredVarList__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getGroup_1()); 
            }
            // InternalPortugol.g:2126:2: ( rule__DeclaredVarList__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==37) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPortugol.g:2126:3: rule__DeclaredVarList__Group_1__0
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
    // InternalPortugol.g:2135:1: rule__DeclaredVarList__Group_1__0 : rule__DeclaredVarList__Group_1__0__Impl rule__DeclaredVarList__Group_1__1 ;
    public final void rule__DeclaredVarList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2139:1: ( rule__DeclaredVarList__Group_1__0__Impl rule__DeclaredVarList__Group_1__1 )
            // InternalPortugol.g:2140:2: rule__DeclaredVarList__Group_1__0__Impl rule__DeclaredVarList__Group_1__1
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
    // InternalPortugol.g:2147:1: rule__DeclaredVarList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__DeclaredVarList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2151:1: ( ( ',' ) )
            // InternalPortugol.g:2152:1: ( ',' )
            {
            // InternalPortugol.g:2152:1: ( ',' )
            // InternalPortugol.g:2153:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getCommaKeyword_1_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2162:1: rule__DeclaredVarList__Group_1__1 : rule__DeclaredVarList__Group_1__1__Impl ;
    public final void rule__DeclaredVarList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2166:1: ( rule__DeclaredVarList__Group_1__1__Impl )
            // InternalPortugol.g:2167:2: rule__DeclaredVarList__Group_1__1__Impl
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
    // InternalPortugol.g:2173:1: rule__DeclaredVarList__Group_1__1__Impl : ( ( rule__DeclaredVarList__VarsAssignment_1_1 ) ) ;
    public final void rule__DeclaredVarList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2177:1: ( ( ( rule__DeclaredVarList__VarsAssignment_1_1 ) ) )
            // InternalPortugol.g:2178:1: ( ( rule__DeclaredVarList__VarsAssignment_1_1 ) )
            {
            // InternalPortugol.g:2178:1: ( ( rule__DeclaredVarList__VarsAssignment_1_1 ) )
            // InternalPortugol.g:2179:2: ( rule__DeclaredVarList__VarsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getVarsAssignment_1_1()); 
            }
            // InternalPortugol.g:2180:2: ( rule__DeclaredVarList__VarsAssignment_1_1 )
            // InternalPortugol.g:2180:3: rule__DeclaredVarList__VarsAssignment_1_1
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
    // InternalPortugol.g:2189:1: rule__BlockFunction__Group__0 : rule__BlockFunction__Group__0__Impl rule__BlockFunction__Group__1 ;
    public final void rule__BlockFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2193:1: ( rule__BlockFunction__Group__0__Impl rule__BlockFunction__Group__1 )
            // InternalPortugol.g:2194:2: rule__BlockFunction__Group__0__Impl rule__BlockFunction__Group__1
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
    // InternalPortugol.g:2201:1: rule__BlockFunction__Group__0__Impl : ( 'funcao' ) ;
    public final void rule__BlockFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2205:1: ( ( 'funcao' ) )
            // InternalPortugol.g:2206:1: ( 'funcao' )
            {
            // InternalPortugol.g:2206:1: ( 'funcao' )
            // InternalPortugol.g:2207:2: 'funcao'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getFuncaoKeyword_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2216:1: rule__BlockFunction__Group__1 : rule__BlockFunction__Group__1__Impl rule__BlockFunction__Group__2 ;
    public final void rule__BlockFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2220:1: ( rule__BlockFunction__Group__1__Impl rule__BlockFunction__Group__2 )
            // InternalPortugol.g:2221:2: rule__BlockFunction__Group__1__Impl rule__BlockFunction__Group__2
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
    // InternalPortugol.g:2228:1: rule__BlockFunction__Group__1__Impl : ( ( rule__BlockFunction__FunctionNameAssignment_1 ) ) ;
    public final void rule__BlockFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2232:1: ( ( ( rule__BlockFunction__FunctionNameAssignment_1 ) ) )
            // InternalPortugol.g:2233:1: ( ( rule__BlockFunction__FunctionNameAssignment_1 ) )
            {
            // InternalPortugol.g:2233:1: ( ( rule__BlockFunction__FunctionNameAssignment_1 ) )
            // InternalPortugol.g:2234:2: ( rule__BlockFunction__FunctionNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getFunctionNameAssignment_1()); 
            }
            // InternalPortugol.g:2235:2: ( rule__BlockFunction__FunctionNameAssignment_1 )
            // InternalPortugol.g:2235:3: rule__BlockFunction__FunctionNameAssignment_1
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
    // InternalPortugol.g:2243:1: rule__BlockFunction__Group__2 : rule__BlockFunction__Group__2__Impl rule__BlockFunction__Group__3 ;
    public final void rule__BlockFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2247:1: ( rule__BlockFunction__Group__2__Impl rule__BlockFunction__Group__3 )
            // InternalPortugol.g:2248:2: rule__BlockFunction__Group__2__Impl rule__BlockFunction__Group__3
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
    // InternalPortugol.g:2255:1: rule__BlockFunction__Group__2__Impl : ( '(' ) ;
    public final void rule__BlockFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2259:1: ( ( '(' ) )
            // InternalPortugol.g:2260:1: ( '(' )
            {
            // InternalPortugol.g:2260:1: ( '(' )
            // InternalPortugol.g:2261:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2270:1: rule__BlockFunction__Group__3 : rule__BlockFunction__Group__3__Impl rule__BlockFunction__Group__4 ;
    public final void rule__BlockFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2274:1: ( rule__BlockFunction__Group__3__Impl rule__BlockFunction__Group__4 )
            // InternalPortugol.g:2275:2: rule__BlockFunction__Group__3__Impl rule__BlockFunction__Group__4
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
    // InternalPortugol.g:2282:1: rule__BlockFunction__Group__3__Impl : ( ( rule__BlockFunction__ParamListAssignment_3 ) ) ;
    public final void rule__BlockFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2286:1: ( ( ( rule__BlockFunction__ParamListAssignment_3 ) ) )
            // InternalPortugol.g:2287:1: ( ( rule__BlockFunction__ParamListAssignment_3 ) )
            {
            // InternalPortugol.g:2287:1: ( ( rule__BlockFunction__ParamListAssignment_3 ) )
            // InternalPortugol.g:2288:2: ( rule__BlockFunction__ParamListAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getParamListAssignment_3()); 
            }
            // InternalPortugol.g:2289:2: ( rule__BlockFunction__ParamListAssignment_3 )
            // InternalPortugol.g:2289:3: rule__BlockFunction__ParamListAssignment_3
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
    // InternalPortugol.g:2297:1: rule__BlockFunction__Group__4 : rule__BlockFunction__Group__4__Impl rule__BlockFunction__Group__5 ;
    public final void rule__BlockFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2301:1: ( rule__BlockFunction__Group__4__Impl rule__BlockFunction__Group__5 )
            // InternalPortugol.g:2302:2: rule__BlockFunction__Group__4__Impl rule__BlockFunction__Group__5
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
    // InternalPortugol.g:2309:1: rule__BlockFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__BlockFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2313:1: ( ( ')' ) )
            // InternalPortugol.g:2314:1: ( ')' )
            {
            // InternalPortugol.g:2314:1: ( ')' )
            // InternalPortugol.g:2315:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2324:1: rule__BlockFunction__Group__5 : rule__BlockFunction__Group__5__Impl rule__BlockFunction__Group__6 ;
    public final void rule__BlockFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2328:1: ( rule__BlockFunction__Group__5__Impl rule__BlockFunction__Group__6 )
            // InternalPortugol.g:2329:2: rule__BlockFunction__Group__5__Impl rule__BlockFunction__Group__6
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
    // InternalPortugol.g:2336:1: rule__BlockFunction__Group__5__Impl : ( ':' ) ;
    public final void rule__BlockFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2340:1: ( ( ':' ) )
            // InternalPortugol.g:2341:1: ( ':' )
            {
            // InternalPortugol.g:2341:1: ( ':' )
            // InternalPortugol.g:2342:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getColonKeyword_5()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2351:1: rule__BlockFunction__Group__6 : rule__BlockFunction__Group__6__Impl rule__BlockFunction__Group__7 ;
    public final void rule__BlockFunction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2355:1: ( rule__BlockFunction__Group__6__Impl rule__BlockFunction__Group__7 )
            // InternalPortugol.g:2356:2: rule__BlockFunction__Group__6__Impl rule__BlockFunction__Group__7
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
    // InternalPortugol.g:2363:1: rule__BlockFunction__Group__6__Impl : ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) ) ;
    public final void rule__BlockFunction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2367:1: ( ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) ) )
            // InternalPortugol.g:2368:1: ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) )
            {
            // InternalPortugol.g:2368:1: ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) )
            // InternalPortugol.g:2369:2: ( rule__BlockFunction__ReturnTypeAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getReturnTypeAssignment_6()); 
            }
            // InternalPortugol.g:2370:2: ( rule__BlockFunction__ReturnTypeAssignment_6 )
            // InternalPortugol.g:2370:3: rule__BlockFunction__ReturnTypeAssignment_6
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
    // InternalPortugol.g:2378:1: rule__BlockFunction__Group__7 : rule__BlockFunction__Group__7__Impl rule__BlockFunction__Group__8 ;
    public final void rule__BlockFunction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2382:1: ( rule__BlockFunction__Group__7__Impl rule__BlockFunction__Group__8 )
            // InternalPortugol.g:2383:2: rule__BlockFunction__Group__7__Impl rule__BlockFunction__Group__8
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
    // InternalPortugol.g:2390:1: rule__BlockFunction__Group__7__Impl : ( ( rule__BlockFunction__DeclarationsAssignment_7 )? ) ;
    public final void rule__BlockFunction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2394:1: ( ( ( rule__BlockFunction__DeclarationsAssignment_7 )? ) )
            // InternalPortugol.g:2395:1: ( ( rule__BlockFunction__DeclarationsAssignment_7 )? )
            {
            // InternalPortugol.g:2395:1: ( ( rule__BlockFunction__DeclarationsAssignment_7 )? )
            // InternalPortugol.g:2396:2: ( rule__BlockFunction__DeclarationsAssignment_7 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getDeclarationsAssignment_7()); 
            }
            // InternalPortugol.g:2397:2: ( rule__BlockFunction__DeclarationsAssignment_7 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPortugol.g:2397:3: rule__BlockFunction__DeclarationsAssignment_7
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
    // InternalPortugol.g:2405:1: rule__BlockFunction__Group__8 : rule__BlockFunction__Group__8__Impl rule__BlockFunction__Group__9 ;
    public final void rule__BlockFunction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2409:1: ( rule__BlockFunction__Group__8__Impl rule__BlockFunction__Group__9 )
            // InternalPortugol.g:2410:2: rule__BlockFunction__Group__8__Impl rule__BlockFunction__Group__9
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
    // InternalPortugol.g:2417:1: rule__BlockFunction__Group__8__Impl : ( 'inicio' ) ;
    public final void rule__BlockFunction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2421:1: ( ( 'inicio' ) )
            // InternalPortugol.g:2422:1: ( 'inicio' )
            {
            // InternalPortugol.g:2422:1: ( 'inicio' )
            // InternalPortugol.g:2423:2: 'inicio'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getInicioKeyword_8()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2432:1: rule__BlockFunction__Group__9 : rule__BlockFunction__Group__9__Impl rule__BlockFunction__Group__10 ;
    public final void rule__BlockFunction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2436:1: ( rule__BlockFunction__Group__9__Impl rule__BlockFunction__Group__10 )
            // InternalPortugol.g:2437:2: rule__BlockFunction__Group__9__Impl rule__BlockFunction__Group__10
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
    // InternalPortugol.g:2444:1: rule__BlockFunction__Group__9__Impl : ( ( ( rule__BlockFunction__CommandsAssignment_9 ) ) ( ( rule__BlockFunction__CommandsAssignment_9 )* ) ) ;
    public final void rule__BlockFunction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2448:1: ( ( ( ( rule__BlockFunction__CommandsAssignment_9 ) ) ( ( rule__BlockFunction__CommandsAssignment_9 )* ) ) )
            // InternalPortugol.g:2449:1: ( ( ( rule__BlockFunction__CommandsAssignment_9 ) ) ( ( rule__BlockFunction__CommandsAssignment_9 )* ) )
            {
            // InternalPortugol.g:2449:1: ( ( ( rule__BlockFunction__CommandsAssignment_9 ) ) ( ( rule__BlockFunction__CommandsAssignment_9 )* ) )
            // InternalPortugol.g:2450:2: ( ( rule__BlockFunction__CommandsAssignment_9 ) ) ( ( rule__BlockFunction__CommandsAssignment_9 )* )
            {
            // InternalPortugol.g:2450:2: ( ( rule__BlockFunction__CommandsAssignment_9 ) )
            // InternalPortugol.g:2451:3: ( rule__BlockFunction__CommandsAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getCommandsAssignment_9()); 
            }
            // InternalPortugol.g:2452:3: ( rule__BlockFunction__CommandsAssignment_9 )
            // InternalPortugol.g:2452:4: rule__BlockFunction__CommandsAssignment_9
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

            // InternalPortugol.g:2455:2: ( ( rule__BlockFunction__CommandsAssignment_9 )* )
            // InternalPortugol.g:2456:3: ( rule__BlockFunction__CommandsAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getCommandsAssignment_9()); 
            }
            // InternalPortugol.g:2457:3: ( rule__BlockFunction__CommandsAssignment_9 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_FLOAT)||(LA21_0>=17 && LA21_0<=18)||LA21_0==28||LA21_0==33||LA21_0==39||LA21_0==46||LA21_0==50||LA21_0==54||LA21_0==60||(LA21_0>=62 && LA21_0<=63)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPortugol.g:2457:4: rule__BlockFunction__CommandsAssignment_9
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
    // InternalPortugol.g:2466:1: rule__BlockFunction__Group__10 : rule__BlockFunction__Group__10__Impl ;
    public final void rule__BlockFunction__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2470:1: ( rule__BlockFunction__Group__10__Impl )
            // InternalPortugol.g:2471:2: rule__BlockFunction__Group__10__Impl
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
    // InternalPortugol.g:2477:1: rule__BlockFunction__Group__10__Impl : ( 'fimfuncao' ) ;
    public final void rule__BlockFunction__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2481:1: ( ( 'fimfuncao' ) )
            // InternalPortugol.g:2482:1: ( 'fimfuncao' )
            {
            // InternalPortugol.g:2482:1: ( 'fimfuncao' )
            // InternalPortugol.g:2483:2: 'fimfuncao'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getFimfuncaoKeyword_10()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2493:1: rule__BlockProcedure__Group__0 : rule__BlockProcedure__Group__0__Impl rule__BlockProcedure__Group__1 ;
    public final void rule__BlockProcedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2497:1: ( rule__BlockProcedure__Group__0__Impl rule__BlockProcedure__Group__1 )
            // InternalPortugol.g:2498:2: rule__BlockProcedure__Group__0__Impl rule__BlockProcedure__Group__1
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
    // InternalPortugol.g:2505:1: rule__BlockProcedure__Group__0__Impl : ( 'procedimento' ) ;
    public final void rule__BlockProcedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2509:1: ( ( 'procedimento' ) )
            // InternalPortugol.g:2510:1: ( 'procedimento' )
            {
            // InternalPortugol.g:2510:1: ( 'procedimento' )
            // InternalPortugol.g:2511:2: 'procedimento'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getProcedimentoKeyword_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2520:1: rule__BlockProcedure__Group__1 : rule__BlockProcedure__Group__1__Impl rule__BlockProcedure__Group__2 ;
    public final void rule__BlockProcedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2524:1: ( rule__BlockProcedure__Group__1__Impl rule__BlockProcedure__Group__2 )
            // InternalPortugol.g:2525:2: rule__BlockProcedure__Group__1__Impl rule__BlockProcedure__Group__2
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
    // InternalPortugol.g:2532:1: rule__BlockProcedure__Group__1__Impl : ( ( rule__BlockProcedure__ProcedureAssignment_1 ) ) ;
    public final void rule__BlockProcedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2536:1: ( ( ( rule__BlockProcedure__ProcedureAssignment_1 ) ) )
            // InternalPortugol.g:2537:1: ( ( rule__BlockProcedure__ProcedureAssignment_1 ) )
            {
            // InternalPortugol.g:2537:1: ( ( rule__BlockProcedure__ProcedureAssignment_1 ) )
            // InternalPortugol.g:2538:2: ( rule__BlockProcedure__ProcedureAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getProcedureAssignment_1()); 
            }
            // InternalPortugol.g:2539:2: ( rule__BlockProcedure__ProcedureAssignment_1 )
            // InternalPortugol.g:2539:3: rule__BlockProcedure__ProcedureAssignment_1
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
    // InternalPortugol.g:2547:1: rule__BlockProcedure__Group__2 : rule__BlockProcedure__Group__2__Impl rule__BlockProcedure__Group__3 ;
    public final void rule__BlockProcedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2551:1: ( rule__BlockProcedure__Group__2__Impl rule__BlockProcedure__Group__3 )
            // InternalPortugol.g:2552:2: rule__BlockProcedure__Group__2__Impl rule__BlockProcedure__Group__3
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
    // InternalPortugol.g:2559:1: rule__BlockProcedure__Group__2__Impl : ( '(' ) ;
    public final void rule__BlockProcedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2563:1: ( ( '(' ) )
            // InternalPortugol.g:2564:1: ( '(' )
            {
            // InternalPortugol.g:2564:1: ( '(' )
            // InternalPortugol.g:2565:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2574:1: rule__BlockProcedure__Group__3 : rule__BlockProcedure__Group__3__Impl rule__BlockProcedure__Group__4 ;
    public final void rule__BlockProcedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2578:1: ( rule__BlockProcedure__Group__3__Impl rule__BlockProcedure__Group__4 )
            // InternalPortugol.g:2579:2: rule__BlockProcedure__Group__3__Impl rule__BlockProcedure__Group__4
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
    // InternalPortugol.g:2586:1: rule__BlockProcedure__Group__3__Impl : ( ( rule__BlockProcedure__ParamListAssignment_3 ) ) ;
    public final void rule__BlockProcedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2590:1: ( ( ( rule__BlockProcedure__ParamListAssignment_3 ) ) )
            // InternalPortugol.g:2591:1: ( ( rule__BlockProcedure__ParamListAssignment_3 ) )
            {
            // InternalPortugol.g:2591:1: ( ( rule__BlockProcedure__ParamListAssignment_3 ) )
            // InternalPortugol.g:2592:2: ( rule__BlockProcedure__ParamListAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getParamListAssignment_3()); 
            }
            // InternalPortugol.g:2593:2: ( rule__BlockProcedure__ParamListAssignment_3 )
            // InternalPortugol.g:2593:3: rule__BlockProcedure__ParamListAssignment_3
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
    // InternalPortugol.g:2601:1: rule__BlockProcedure__Group__4 : rule__BlockProcedure__Group__4__Impl rule__BlockProcedure__Group__5 ;
    public final void rule__BlockProcedure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2605:1: ( rule__BlockProcedure__Group__4__Impl rule__BlockProcedure__Group__5 )
            // InternalPortugol.g:2606:2: rule__BlockProcedure__Group__4__Impl rule__BlockProcedure__Group__5
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
    // InternalPortugol.g:2613:1: rule__BlockProcedure__Group__4__Impl : ( ')' ) ;
    public final void rule__BlockProcedure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2617:1: ( ( ')' ) )
            // InternalPortugol.g:2618:1: ( ')' )
            {
            // InternalPortugol.g:2618:1: ( ')' )
            // InternalPortugol.g:2619:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2628:1: rule__BlockProcedure__Group__5 : rule__BlockProcedure__Group__5__Impl rule__BlockProcedure__Group__6 ;
    public final void rule__BlockProcedure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2632:1: ( rule__BlockProcedure__Group__5__Impl rule__BlockProcedure__Group__6 )
            // InternalPortugol.g:2633:2: rule__BlockProcedure__Group__5__Impl rule__BlockProcedure__Group__6
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
    // InternalPortugol.g:2640:1: rule__BlockProcedure__Group__5__Impl : ( ( rule__BlockProcedure__DeclarationsAssignment_5 )? ) ;
    public final void rule__BlockProcedure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2644:1: ( ( ( rule__BlockProcedure__DeclarationsAssignment_5 )? ) )
            // InternalPortugol.g:2645:1: ( ( rule__BlockProcedure__DeclarationsAssignment_5 )? )
            {
            // InternalPortugol.g:2645:1: ( ( rule__BlockProcedure__DeclarationsAssignment_5 )? )
            // InternalPortugol.g:2646:2: ( rule__BlockProcedure__DeclarationsAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getDeclarationsAssignment_5()); 
            }
            // InternalPortugol.g:2647:2: ( rule__BlockProcedure__DeclarationsAssignment_5 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPortugol.g:2647:3: rule__BlockProcedure__DeclarationsAssignment_5
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
    // InternalPortugol.g:2655:1: rule__BlockProcedure__Group__6 : rule__BlockProcedure__Group__6__Impl rule__BlockProcedure__Group__7 ;
    public final void rule__BlockProcedure__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2659:1: ( rule__BlockProcedure__Group__6__Impl rule__BlockProcedure__Group__7 )
            // InternalPortugol.g:2660:2: rule__BlockProcedure__Group__6__Impl rule__BlockProcedure__Group__7
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
    // InternalPortugol.g:2667:1: rule__BlockProcedure__Group__6__Impl : ( 'inicio' ) ;
    public final void rule__BlockProcedure__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2671:1: ( ( 'inicio' ) )
            // InternalPortugol.g:2672:1: ( 'inicio' )
            {
            // InternalPortugol.g:2672:1: ( 'inicio' )
            // InternalPortugol.g:2673:2: 'inicio'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getInicioKeyword_6()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2682:1: rule__BlockProcedure__Group__7 : rule__BlockProcedure__Group__7__Impl rule__BlockProcedure__Group__8 ;
    public final void rule__BlockProcedure__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2686:1: ( rule__BlockProcedure__Group__7__Impl rule__BlockProcedure__Group__8 )
            // InternalPortugol.g:2687:2: rule__BlockProcedure__Group__7__Impl rule__BlockProcedure__Group__8
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
    // InternalPortugol.g:2694:1: rule__BlockProcedure__Group__7__Impl : ( ( ( rule__BlockProcedure__CommandsAssignment_7 ) ) ( ( rule__BlockProcedure__CommandsAssignment_7 )* ) ) ;
    public final void rule__BlockProcedure__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2698:1: ( ( ( ( rule__BlockProcedure__CommandsAssignment_7 ) ) ( ( rule__BlockProcedure__CommandsAssignment_7 )* ) ) )
            // InternalPortugol.g:2699:1: ( ( ( rule__BlockProcedure__CommandsAssignment_7 ) ) ( ( rule__BlockProcedure__CommandsAssignment_7 )* ) )
            {
            // InternalPortugol.g:2699:1: ( ( ( rule__BlockProcedure__CommandsAssignment_7 ) ) ( ( rule__BlockProcedure__CommandsAssignment_7 )* ) )
            // InternalPortugol.g:2700:2: ( ( rule__BlockProcedure__CommandsAssignment_7 ) ) ( ( rule__BlockProcedure__CommandsAssignment_7 )* )
            {
            // InternalPortugol.g:2700:2: ( ( rule__BlockProcedure__CommandsAssignment_7 ) )
            // InternalPortugol.g:2701:3: ( rule__BlockProcedure__CommandsAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getCommandsAssignment_7()); 
            }
            // InternalPortugol.g:2702:3: ( rule__BlockProcedure__CommandsAssignment_7 )
            // InternalPortugol.g:2702:4: rule__BlockProcedure__CommandsAssignment_7
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

            // InternalPortugol.g:2705:2: ( ( rule__BlockProcedure__CommandsAssignment_7 )* )
            // InternalPortugol.g:2706:3: ( rule__BlockProcedure__CommandsAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getCommandsAssignment_7()); 
            }
            // InternalPortugol.g:2707:3: ( rule__BlockProcedure__CommandsAssignment_7 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_FLOAT)||(LA23_0>=17 && LA23_0<=18)||LA23_0==28||LA23_0==33||LA23_0==39||LA23_0==46||LA23_0==50||LA23_0==54||LA23_0==60||(LA23_0>=62 && LA23_0<=63)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalPortugol.g:2707:4: rule__BlockProcedure__CommandsAssignment_7
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
    // InternalPortugol.g:2716:1: rule__BlockProcedure__Group__8 : rule__BlockProcedure__Group__8__Impl ;
    public final void rule__BlockProcedure__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2720:1: ( rule__BlockProcedure__Group__8__Impl )
            // InternalPortugol.g:2721:2: rule__BlockProcedure__Group__8__Impl
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
    // InternalPortugol.g:2727:1: rule__BlockProcedure__Group__8__Impl : ( 'fimprocedimento' ) ;
    public final void rule__BlockProcedure__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2731:1: ( ( 'fimprocedimento' ) )
            // InternalPortugol.g:2732:1: ( 'fimprocedimento' )
            {
            // InternalPortugol.g:2732:1: ( 'fimprocedimento' )
            // InternalPortugol.g:2733:2: 'fimprocedimento'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getFimprocedimentoKeyword_8()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2743:1: rule__BlockCommand__Group__0 : rule__BlockCommand__Group__0__Impl rule__BlockCommand__Group__1 ;
    public final void rule__BlockCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2747:1: ( rule__BlockCommand__Group__0__Impl rule__BlockCommand__Group__1 )
            // InternalPortugol.g:2748:2: rule__BlockCommand__Group__0__Impl rule__BlockCommand__Group__1
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
    // InternalPortugol.g:2755:1: rule__BlockCommand__Group__0__Impl : ( 'inicio' ) ;
    public final void rule__BlockCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2759:1: ( ( 'inicio' ) )
            // InternalPortugol.g:2760:1: ( 'inicio' )
            {
            // InternalPortugol.g:2760:1: ( 'inicio' )
            // InternalPortugol.g:2761:2: 'inicio'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getInicioKeyword_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2770:1: rule__BlockCommand__Group__1 : rule__BlockCommand__Group__1__Impl rule__BlockCommand__Group__2 ;
    public final void rule__BlockCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2774:1: ( rule__BlockCommand__Group__1__Impl rule__BlockCommand__Group__2 )
            // InternalPortugol.g:2775:2: rule__BlockCommand__Group__1__Impl rule__BlockCommand__Group__2
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
    // InternalPortugol.g:2782:1: rule__BlockCommand__Group__1__Impl : ( ( ( rule__BlockCommand__CommandsAssignment_1 ) ) ( ( rule__BlockCommand__CommandsAssignment_1 )* ) ) ;
    public final void rule__BlockCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2786:1: ( ( ( ( rule__BlockCommand__CommandsAssignment_1 ) ) ( ( rule__BlockCommand__CommandsAssignment_1 )* ) ) )
            // InternalPortugol.g:2787:1: ( ( ( rule__BlockCommand__CommandsAssignment_1 ) ) ( ( rule__BlockCommand__CommandsAssignment_1 )* ) )
            {
            // InternalPortugol.g:2787:1: ( ( ( rule__BlockCommand__CommandsAssignment_1 ) ) ( ( rule__BlockCommand__CommandsAssignment_1 )* ) )
            // InternalPortugol.g:2788:2: ( ( rule__BlockCommand__CommandsAssignment_1 ) ) ( ( rule__BlockCommand__CommandsAssignment_1 )* )
            {
            // InternalPortugol.g:2788:2: ( ( rule__BlockCommand__CommandsAssignment_1 ) )
            // InternalPortugol.g:2789:3: ( rule__BlockCommand__CommandsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getCommandsAssignment_1()); 
            }
            // InternalPortugol.g:2790:3: ( rule__BlockCommand__CommandsAssignment_1 )
            // InternalPortugol.g:2790:4: rule__BlockCommand__CommandsAssignment_1
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

            // InternalPortugol.g:2793:2: ( ( rule__BlockCommand__CommandsAssignment_1 )* )
            // InternalPortugol.g:2794:3: ( rule__BlockCommand__CommandsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getCommandsAssignment_1()); 
            }
            // InternalPortugol.g:2795:3: ( rule__BlockCommand__CommandsAssignment_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_FLOAT)||(LA24_0>=17 && LA24_0<=18)||LA24_0==28||LA24_0==33||LA24_0==39||LA24_0==46||LA24_0==50||LA24_0==54||LA24_0==60||(LA24_0>=62 && LA24_0<=63)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPortugol.g:2795:4: rule__BlockCommand__CommandsAssignment_1
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
    // InternalPortugol.g:2804:1: rule__BlockCommand__Group__2 : rule__BlockCommand__Group__2__Impl ;
    public final void rule__BlockCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2808:1: ( rule__BlockCommand__Group__2__Impl )
            // InternalPortugol.g:2809:2: rule__BlockCommand__Group__2__Impl
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
    // InternalPortugol.g:2815:1: rule__BlockCommand__Group__2__Impl : ( 'fimalgoritmo' ) ;
    public final void rule__BlockCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2819:1: ( ( 'fimalgoritmo' ) )
            // InternalPortugol.g:2820:1: ( 'fimalgoritmo' )
            {
            // InternalPortugol.g:2820:1: ( 'fimalgoritmo' )
            // InternalPortugol.g:2821:2: 'fimalgoritmo'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getFimalgoritmoKeyword_2()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2831:1: rule__AbstractCommand__Group_0__0 : rule__AbstractCommand__Group_0__0__Impl rule__AbstractCommand__Group_0__1 ;
    public final void rule__AbstractCommand__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2835:1: ( rule__AbstractCommand__Group_0__0__Impl rule__AbstractCommand__Group_0__1 )
            // InternalPortugol.g:2836:2: rule__AbstractCommand__Group_0__0__Impl rule__AbstractCommand__Group_0__1
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
    // InternalPortugol.g:2843:1: rule__AbstractCommand__Group_0__0__Impl : ( ruleReadCommand ) ;
    public final void rule__AbstractCommand__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2847:1: ( ( ruleReadCommand ) )
            // InternalPortugol.g:2848:1: ( ruleReadCommand )
            {
            // InternalPortugol.g:2848:1: ( ruleReadCommand )
            // InternalPortugol.g:2849:2: ruleReadCommand
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
    // InternalPortugol.g:2858:1: rule__AbstractCommand__Group_0__1 : rule__AbstractCommand__Group_0__1__Impl ;
    public final void rule__AbstractCommand__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2862:1: ( rule__AbstractCommand__Group_0__1__Impl )
            // InternalPortugol.g:2863:2: rule__AbstractCommand__Group_0__1__Impl
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
    // InternalPortugol.g:2869:1: rule__AbstractCommand__Group_0__1__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__AbstractCommand__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2873:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugol.g:2874:1: ( ruleEND_COMMAND )
            {
            // InternalPortugol.g:2874:1: ( ruleEND_COMMAND )
            // InternalPortugol.g:2875:2: ruleEND_COMMAND
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
    // InternalPortugol.g:2885:1: rule__AbstractCommand__Group_1__0 : rule__AbstractCommand__Group_1__0__Impl rule__AbstractCommand__Group_1__1 ;
    public final void rule__AbstractCommand__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2889:1: ( rule__AbstractCommand__Group_1__0__Impl rule__AbstractCommand__Group_1__1 )
            // InternalPortugol.g:2890:2: rule__AbstractCommand__Group_1__0__Impl rule__AbstractCommand__Group_1__1
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
    // InternalPortugol.g:2897:1: rule__AbstractCommand__Group_1__0__Impl : ( ruleWriteCommand ) ;
    public final void rule__AbstractCommand__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2901:1: ( ( ruleWriteCommand ) )
            // InternalPortugol.g:2902:1: ( ruleWriteCommand )
            {
            // InternalPortugol.g:2902:1: ( ruleWriteCommand )
            // InternalPortugol.g:2903:2: ruleWriteCommand
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
    // InternalPortugol.g:2912:1: rule__AbstractCommand__Group_1__1 : rule__AbstractCommand__Group_1__1__Impl ;
    public final void rule__AbstractCommand__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2916:1: ( rule__AbstractCommand__Group_1__1__Impl )
            // InternalPortugol.g:2917:2: rule__AbstractCommand__Group_1__1__Impl
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
    // InternalPortugol.g:2923:1: rule__AbstractCommand__Group_1__1__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__AbstractCommand__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2927:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugol.g:2928:1: ( ruleEND_COMMAND )
            {
            // InternalPortugol.g:2928:1: ( ruleEND_COMMAND )
            // InternalPortugol.g:2929:2: ruleEND_COMMAND
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
    // InternalPortugol.g:2939:1: rule__AbstractCommand__Group_2__0 : rule__AbstractCommand__Group_2__0__Impl rule__AbstractCommand__Group_2__1 ;
    public final void rule__AbstractCommand__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2943:1: ( rule__AbstractCommand__Group_2__0__Impl rule__AbstractCommand__Group_2__1 )
            // InternalPortugol.g:2944:2: rule__AbstractCommand__Group_2__0__Impl rule__AbstractCommand__Group_2__1
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
    // InternalPortugol.g:2951:1: rule__AbstractCommand__Group_2__0__Impl : ( ruleExpression ) ;
    public final void rule__AbstractCommand__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2955:1: ( ( ruleExpression ) )
            // InternalPortugol.g:2956:1: ( ruleExpression )
            {
            // InternalPortugol.g:2956:1: ( ruleExpression )
            // InternalPortugol.g:2957:2: ruleExpression
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
    // InternalPortugol.g:2966:1: rule__AbstractCommand__Group_2__1 : rule__AbstractCommand__Group_2__1__Impl ;
    public final void rule__AbstractCommand__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2970:1: ( rule__AbstractCommand__Group_2__1__Impl )
            // InternalPortugol.g:2971:2: rule__AbstractCommand__Group_2__1__Impl
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
    // InternalPortugol.g:2977:1: rule__AbstractCommand__Group_2__1__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__AbstractCommand__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2981:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugol.g:2982:1: ( ruleEND_COMMAND )
            {
            // InternalPortugol.g:2982:1: ( ruleEND_COMMAND )
            // InternalPortugol.g:2983:2: ruleEND_COMMAND
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


    // $ANTLR start "rule__IfStatement__Group__0"
    // InternalPortugol.g:2993:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2997:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalPortugol.g:2998:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPortugol.g:3005:1: rule__IfStatement__Group__0__Impl : ( 'se' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3009:1: ( ( 'se' ) )
            // InternalPortugol.g:3010:1: ( 'se' )
            {
            // InternalPortugol.g:3010:1: ( 'se' )
            // InternalPortugol.g:3011:2: 'se'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getSeKeyword_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:3020:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3024:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalPortugol.g:3025:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalPortugol.g:3032:1: rule__IfStatement__Group__1__Impl : ( ( rule__IfStatement__ExprAssignment_1 ) ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3036:1: ( ( ( rule__IfStatement__ExprAssignment_1 ) ) )
            // InternalPortugol.g:3037:1: ( ( rule__IfStatement__ExprAssignment_1 ) )
            {
            // InternalPortugol.g:3037:1: ( ( rule__IfStatement__ExprAssignment_1 ) )
            // InternalPortugol.g:3038:2: ( rule__IfStatement__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getExprAssignment_1()); 
            }
            // InternalPortugol.g:3039:2: ( rule__IfStatement__ExprAssignment_1 )
            // InternalPortugol.g:3039:3: rule__IfStatement__ExprAssignment_1
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
    // InternalPortugol.g:3047:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3051:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalPortugol.g:3052:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
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
    // InternalPortugol.g:3059:1: rule__IfStatement__Group__2__Impl : ( 'entao' ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3063:1: ( ( 'entao' ) )
            // InternalPortugol.g:3064:1: ( 'entao' )
            {
            // InternalPortugol.g:3064:1: ( 'entao' )
            // InternalPortugol.g:3065:2: 'entao'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getEntaoKeyword_2()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:3074:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3078:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalPortugol.g:3079:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalPortugol.g:3086:1: rule__IfStatement__Group__3__Impl : ( ( ( rule__IfStatement__CommandsAssignment_3 ) ) ( ( rule__IfStatement__CommandsAssignment_3 )* ) ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3090:1: ( ( ( ( rule__IfStatement__CommandsAssignment_3 ) ) ( ( rule__IfStatement__CommandsAssignment_3 )* ) ) )
            // InternalPortugol.g:3091:1: ( ( ( rule__IfStatement__CommandsAssignment_3 ) ) ( ( rule__IfStatement__CommandsAssignment_3 )* ) )
            {
            // InternalPortugol.g:3091:1: ( ( ( rule__IfStatement__CommandsAssignment_3 ) ) ( ( rule__IfStatement__CommandsAssignment_3 )* ) )
            // InternalPortugol.g:3092:2: ( ( rule__IfStatement__CommandsAssignment_3 ) ) ( ( rule__IfStatement__CommandsAssignment_3 )* )
            {
            // InternalPortugol.g:3092:2: ( ( rule__IfStatement__CommandsAssignment_3 ) )
            // InternalPortugol.g:3093:3: ( rule__IfStatement__CommandsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugol.g:3094:3: ( rule__IfStatement__CommandsAssignment_3 )
            // InternalPortugol.g:3094:4: rule__IfStatement__CommandsAssignment_3
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

            // InternalPortugol.g:3097:2: ( ( rule__IfStatement__CommandsAssignment_3 )* )
            // InternalPortugol.g:3098:3: ( rule__IfStatement__CommandsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugol.g:3099:3: ( rule__IfStatement__CommandsAssignment_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_FLOAT)||(LA25_0>=17 && LA25_0<=18)||LA25_0==28||LA25_0==33||LA25_0==39||LA25_0==46||LA25_0==50||LA25_0==54||LA25_0==60||(LA25_0>=62 && LA25_0<=63)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPortugol.g:3099:4: rule__IfStatement__CommandsAssignment_3
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
    // InternalPortugol.g:3108:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3112:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalPortugol.g:3113:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalPortugol.g:3120:1: rule__IfStatement__Group__4__Impl : ( ( rule__IfStatement__Group_4__0 )? ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3124:1: ( ( ( rule__IfStatement__Group_4__0 )? ) )
            // InternalPortugol.g:3125:1: ( ( rule__IfStatement__Group_4__0 )? )
            {
            // InternalPortugol.g:3125:1: ( ( rule__IfStatement__Group_4__0 )? )
            // InternalPortugol.g:3126:2: ( rule__IfStatement__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup_4()); 
            }
            // InternalPortugol.g:3127:2: ( rule__IfStatement__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==49) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPortugol.g:3127:3: rule__IfStatement__Group_4__0
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
    // InternalPortugol.g:3135:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3139:1: ( rule__IfStatement__Group__5__Impl )
            // InternalPortugol.g:3140:2: rule__IfStatement__Group__5__Impl
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
    // InternalPortugol.g:3146:1: rule__IfStatement__Group__5__Impl : ( 'fimse' ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3150:1: ( ( 'fimse' ) )
            // InternalPortugol.g:3151:1: ( 'fimse' )
            {
            // InternalPortugol.g:3151:1: ( 'fimse' )
            // InternalPortugol.g:3152:2: 'fimse'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getFimseKeyword_5()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:3162:1: rule__IfStatement__Group_4__0 : rule__IfStatement__Group_4__0__Impl rule__IfStatement__Group_4__1 ;
    public final void rule__IfStatement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3166:1: ( rule__IfStatement__Group_4__0__Impl rule__IfStatement__Group_4__1 )
            // InternalPortugol.g:3167:2: rule__IfStatement__Group_4__0__Impl rule__IfStatement__Group_4__1
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
    // InternalPortugol.g:3174:1: rule__IfStatement__Group_4__0__Impl : ( 'senao' ) ;
    public final void rule__IfStatement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3178:1: ( ( 'senao' ) )
            // InternalPortugol.g:3179:1: ( 'senao' )
            {
            // InternalPortugol.g:3179:1: ( 'senao' )
            // InternalPortugol.g:3180:2: 'senao'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getSenaoKeyword_4_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:3189:1: rule__IfStatement__Group_4__1 : rule__IfStatement__Group_4__1__Impl ;
    public final void rule__IfStatement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3193:1: ( rule__IfStatement__Group_4__1__Impl )
            // InternalPortugol.g:3194:2: rule__IfStatement__Group_4__1__Impl
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
    // InternalPortugol.g:3200:1: rule__IfStatement__Group_4__1__Impl : ( ( ( rule__IfStatement__ElseCommandsAssignment_4_1 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_4_1 )* ) ) ;
    public final void rule__IfStatement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3204:1: ( ( ( ( rule__IfStatement__ElseCommandsAssignment_4_1 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_4_1 )* ) ) )
            // InternalPortugol.g:3205:1: ( ( ( rule__IfStatement__ElseCommandsAssignment_4_1 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_4_1 )* ) )
            {
            // InternalPortugol.g:3205:1: ( ( ( rule__IfStatement__ElseCommandsAssignment_4_1 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_4_1 )* ) )
            // InternalPortugol.g:3206:2: ( ( rule__IfStatement__ElseCommandsAssignment_4_1 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_4_1 )* )
            {
            // InternalPortugol.g:3206:2: ( ( rule__IfStatement__ElseCommandsAssignment_4_1 ) )
            // InternalPortugol.g:3207:3: ( rule__IfStatement__ElseCommandsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseCommandsAssignment_4_1()); 
            }
            // InternalPortugol.g:3208:3: ( rule__IfStatement__ElseCommandsAssignment_4_1 )
            // InternalPortugol.g:3208:4: rule__IfStatement__ElseCommandsAssignment_4_1
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

            // InternalPortugol.g:3211:2: ( ( rule__IfStatement__ElseCommandsAssignment_4_1 )* )
            // InternalPortugol.g:3212:3: ( rule__IfStatement__ElseCommandsAssignment_4_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseCommandsAssignment_4_1()); 
            }
            // InternalPortugol.g:3213:3: ( rule__IfStatement__ElseCommandsAssignment_4_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_FLOAT)||(LA27_0>=17 && LA27_0<=18)||LA27_0==28||LA27_0==33||LA27_0==39||LA27_0==46||LA27_0==50||LA27_0==54||LA27_0==60||(LA27_0>=62 && LA27_0<=63)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPortugol.g:3213:4: rule__IfStatement__ElseCommandsAssignment_4_1
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
    // InternalPortugol.g:3223:1: rule__SwitchCaseStatement__Group__0 : rule__SwitchCaseStatement__Group__0__Impl rule__SwitchCaseStatement__Group__1 ;
    public final void rule__SwitchCaseStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3227:1: ( rule__SwitchCaseStatement__Group__0__Impl rule__SwitchCaseStatement__Group__1 )
            // InternalPortugol.g:3228:2: rule__SwitchCaseStatement__Group__0__Impl rule__SwitchCaseStatement__Group__1
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
    // InternalPortugol.g:3235:1: rule__SwitchCaseStatement__Group__0__Impl : ( 'escolha' ) ;
    public final void rule__SwitchCaseStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3239:1: ( ( 'escolha' ) )
            // InternalPortugol.g:3240:1: ( 'escolha' )
            {
            // InternalPortugol.g:3240:1: ( 'escolha' )
            // InternalPortugol.g:3241:2: 'escolha'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getEscolhaKeyword_0()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:3250:1: rule__SwitchCaseStatement__Group__1 : rule__SwitchCaseStatement__Group__1__Impl rule__SwitchCaseStatement__Group__2 ;
    public final void rule__SwitchCaseStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3254:1: ( rule__SwitchCaseStatement__Group__1__Impl rule__SwitchCaseStatement__Group__2 )
            // InternalPortugol.g:3255:2: rule__SwitchCaseStatement__Group__1__Impl rule__SwitchCaseStatement__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalPortugol.g:3262:1: rule__SwitchCaseStatement__Group__1__Impl : ( ( rule__SwitchCaseStatement__VariableAssignment_1 ) ) ;
    public final void rule__SwitchCaseStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3266:1: ( ( ( rule__SwitchCaseStatement__VariableAssignment_1 ) ) )
            // InternalPortugol.g:3267:1: ( ( rule__SwitchCaseStatement__VariableAssignment_1 ) )
            {
            // InternalPortugol.g:3267:1: ( ( rule__SwitchCaseStatement__VariableAssignment_1 ) )
            // InternalPortugol.g:3268:2: ( rule__SwitchCaseStatement__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getVariableAssignment_1()); 
            }
            // InternalPortugol.g:3269:2: ( rule__SwitchCaseStatement__VariableAssignment_1 )
            // InternalPortugol.g:3269:3: rule__SwitchCaseStatement__VariableAssignment_1
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
    // InternalPortugol.g:3277:1: rule__SwitchCaseStatement__Group__2 : rule__SwitchCaseStatement__Group__2__Impl rule__SwitchCaseStatement__Group__3 ;
    public final void rule__SwitchCaseStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3281:1: ( rule__SwitchCaseStatement__Group__2__Impl rule__SwitchCaseStatement__Group__3 )
            // InternalPortugol.g:3282:2: rule__SwitchCaseStatement__Group__2__Impl rule__SwitchCaseStatement__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalPortugol.g:3289:1: rule__SwitchCaseStatement__Group__2__Impl : ( ( ( rule__SwitchCaseStatement__CaseListAssignment_2 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_2 )* ) ) ;
    public final void rule__SwitchCaseStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3293:1: ( ( ( ( rule__SwitchCaseStatement__CaseListAssignment_2 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_2 )* ) ) )
            // InternalPortugol.g:3294:1: ( ( ( rule__SwitchCaseStatement__CaseListAssignment_2 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_2 )* ) )
            {
            // InternalPortugol.g:3294:1: ( ( ( rule__SwitchCaseStatement__CaseListAssignment_2 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_2 )* ) )
            // InternalPortugol.g:3295:2: ( ( rule__SwitchCaseStatement__CaseListAssignment_2 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_2 )* )
            {
            // InternalPortugol.g:3295:2: ( ( rule__SwitchCaseStatement__CaseListAssignment_2 ) )
            // InternalPortugol.g:3296:3: ( rule__SwitchCaseStatement__CaseListAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getCaseListAssignment_2()); 
            }
            // InternalPortugol.g:3297:3: ( rule__SwitchCaseStatement__CaseListAssignment_2 )
            // InternalPortugol.g:3297:4: rule__SwitchCaseStatement__CaseListAssignment_2
            {
            pushFollow(FOLLOW_27);
            rule__SwitchCaseStatement__CaseListAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseStatementAccess().getCaseListAssignment_2()); 
            }

            }

            // InternalPortugol.g:3300:2: ( ( rule__SwitchCaseStatement__CaseListAssignment_2 )* )
            // InternalPortugol.g:3301:3: ( rule__SwitchCaseStatement__CaseListAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getCaseListAssignment_2()); 
            }
            // InternalPortugol.g:3302:3: ( rule__SwitchCaseStatement__CaseListAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==52) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalPortugol.g:3302:4: rule__SwitchCaseStatement__CaseListAssignment_2
            	    {
            	    pushFollow(FOLLOW_27);
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
    // InternalPortugol.g:3311:1: rule__SwitchCaseStatement__Group__3 : rule__SwitchCaseStatement__Group__3__Impl rule__SwitchCaseStatement__Group__4 ;
    public final void rule__SwitchCaseStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3315:1: ( rule__SwitchCaseStatement__Group__3__Impl rule__SwitchCaseStatement__Group__4 )
            // InternalPortugol.g:3316:2: rule__SwitchCaseStatement__Group__3__Impl rule__SwitchCaseStatement__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalPortugol.g:3323:1: rule__SwitchCaseStatement__Group__3__Impl : ( ( rule__SwitchCaseStatement__OtherCaseAssignment_3 )? ) ;
    public final void rule__SwitchCaseStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3327:1: ( ( ( rule__SwitchCaseStatement__OtherCaseAssignment_3 )? ) )
            // InternalPortugol.g:3328:1: ( ( rule__SwitchCaseStatement__OtherCaseAssignment_3 )? )
            {
            // InternalPortugol.g:3328:1: ( ( rule__SwitchCaseStatement__OtherCaseAssignment_3 )? )
            // InternalPortugol.g:3329:2: ( rule__SwitchCaseStatement__OtherCaseAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getOtherCaseAssignment_3()); 
            }
            // InternalPortugol.g:3330:2: ( rule__SwitchCaseStatement__OtherCaseAssignment_3 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==53) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPortugol.g:3330:3: rule__SwitchCaseStatement__OtherCaseAssignment_3
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
    // InternalPortugol.g:3338:1: rule__SwitchCaseStatement__Group__4 : rule__SwitchCaseStatement__Group__4__Impl ;
    public final void rule__SwitchCaseStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3342:1: ( rule__SwitchCaseStatement__Group__4__Impl )
            // InternalPortugol.g:3343:2: rule__SwitchCaseStatement__Group__4__Impl
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
    // InternalPortugol.g:3349:1: rule__SwitchCaseStatement__Group__4__Impl : ( 'fimescolha' ) ;
    public final void rule__SwitchCaseStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3353:1: ( ( 'fimescolha' ) )
            // InternalPortugol.g:3354:1: ( 'fimescolha' )
            {
            // InternalPortugol.g:3354:1: ( 'fimescolha' )
            // InternalPortugol.g:3355:2: 'fimescolha'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getFimescolhaKeyword_4()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:3365:1: rule__CaseList__Group__0 : rule__CaseList__Group__0__Impl rule__CaseList__Group__1 ;
    public final void rule__CaseList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3369:1: ( rule__CaseList__Group__0__Impl rule__CaseList__Group__1 )
            // InternalPortugol.g:3370:2: rule__CaseList__Group__0__Impl rule__CaseList__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPortugol.g:3377:1: rule__CaseList__Group__0__Impl : ( 'caso' ) ;
    public final void rule__CaseList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3381:1: ( ( 'caso' ) )
            // InternalPortugol.g:3382:1: ( 'caso' )
            {
            // InternalPortugol.g:3382:1: ( 'caso' )
            // InternalPortugol.g:3383:2: 'caso'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getCasoKeyword_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:3392:1: rule__CaseList__Group__1 : rule__CaseList__Group__1__Impl rule__CaseList__Group__2 ;
    public final void rule__CaseList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3396:1: ( rule__CaseList__Group__1__Impl rule__CaseList__Group__2 )
            // InternalPortugol.g:3397:2: rule__CaseList__Group__1__Impl rule__CaseList__Group__2
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
    // InternalPortugol.g:3404:1: rule__CaseList__Group__1__Impl : ( ( rule__CaseList__ExprAssignment_1 ) ) ;
    public final void rule__CaseList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3408:1: ( ( ( rule__CaseList__ExprAssignment_1 ) ) )
            // InternalPortugol.g:3409:1: ( ( rule__CaseList__ExprAssignment_1 ) )
            {
            // InternalPortugol.g:3409:1: ( ( rule__CaseList__ExprAssignment_1 ) )
            // InternalPortugol.g:3410:2: ( rule__CaseList__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getExprAssignment_1()); 
            }
            // InternalPortugol.g:3411:2: ( rule__CaseList__ExprAssignment_1 )
            // InternalPortugol.g:3411:3: rule__CaseList__ExprAssignment_1
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
    // InternalPortugol.g:3419:1: rule__CaseList__Group__2 : rule__CaseList__Group__2__Impl rule__CaseList__Group__3 ;
    public final void rule__CaseList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3423:1: ( rule__CaseList__Group__2__Impl rule__CaseList__Group__3 )
            // InternalPortugol.g:3424:2: rule__CaseList__Group__2__Impl rule__CaseList__Group__3
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
    // InternalPortugol.g:3431:1: rule__CaseList__Group__2__Impl : ( ':' ) ;
    public final void rule__CaseList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3435:1: ( ( ':' ) )
            // InternalPortugol.g:3436:1: ( ':' )
            {
            // InternalPortugol.g:3436:1: ( ':' )
            // InternalPortugol.g:3437:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getColonKeyword_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:3446:1: rule__CaseList__Group__3 : rule__CaseList__Group__3__Impl rule__CaseList__Group__4 ;
    public final void rule__CaseList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3450:1: ( rule__CaseList__Group__3__Impl rule__CaseList__Group__4 )
            // InternalPortugol.g:3451:2: rule__CaseList__Group__3__Impl rule__CaseList__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__CaseList__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CaseList__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPortugol.g:3458:1: rule__CaseList__Group__3__Impl : ( ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* ) ) ;
    public final void rule__CaseList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3462:1: ( ( ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* ) ) )
            // InternalPortugol.g:3463:1: ( ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* ) )
            {
            // InternalPortugol.g:3463:1: ( ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* ) )
            // InternalPortugol.g:3464:2: ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* )
            {
            // InternalPortugol.g:3464:2: ( ( rule__CaseList__CommandsAssignment_3 ) )
            // InternalPortugol.g:3465:3: ( rule__CaseList__CommandsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugol.g:3466:3: ( rule__CaseList__CommandsAssignment_3 )
            // InternalPortugol.g:3466:4: rule__CaseList__CommandsAssignment_3
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

            // InternalPortugol.g:3469:2: ( ( rule__CaseList__CommandsAssignment_3 )* )
            // InternalPortugol.g:3470:3: ( rule__CaseList__CommandsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugol.g:3471:3: ( rule__CaseList__CommandsAssignment_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_FLOAT)||(LA30_0>=17 && LA30_0<=18)||LA30_0==28||LA30_0==33||LA30_0==39||LA30_0==46||LA30_0==50||LA30_0==54||LA30_0==60||(LA30_0>=62 && LA30_0<=63)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPortugol.g:3471:4: rule__CaseList__CommandsAssignment_3
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


    // $ANTLR start "rule__CaseList__Group__4"
    // InternalPortugol.g:3480:1: rule__CaseList__Group__4 : rule__CaseList__Group__4__Impl ;
    public final void rule__CaseList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3484:1: ( rule__CaseList__Group__4__Impl )
            // InternalPortugol.g:3485:2: rule__CaseList__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CaseList__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseList__Group__4"


    // $ANTLR start "rule__CaseList__Group__4__Impl"
    // InternalPortugol.g:3491:1: rule__CaseList__Group__4__Impl : ( ( rule__CaseList__Group_4__0 )? ) ;
    public final void rule__CaseList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3495:1: ( ( ( rule__CaseList__Group_4__0 )? ) )
            // InternalPortugol.g:3496:1: ( ( rule__CaseList__Group_4__0 )? )
            {
            // InternalPortugol.g:3496:1: ( ( rule__CaseList__Group_4__0 )? )
            // InternalPortugol.g:3497:2: ( rule__CaseList__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getGroup_4()); 
            }
            // InternalPortugol.g:3498:2: ( rule__CaseList__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==64) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPortugol.g:3498:3: rule__CaseList__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CaseList__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseListAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseList__Group__4__Impl"


    // $ANTLR start "rule__CaseList__Group_4__0"
    // InternalPortugol.g:3507:1: rule__CaseList__Group_4__0 : rule__CaseList__Group_4__0__Impl rule__CaseList__Group_4__1 ;
    public final void rule__CaseList__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3511:1: ( rule__CaseList__Group_4__0__Impl rule__CaseList__Group_4__1 )
            // InternalPortugol.g:3512:2: rule__CaseList__Group_4__0__Impl rule__CaseList__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__CaseList__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CaseList__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseList__Group_4__0"


    // $ANTLR start "rule__CaseList__Group_4__0__Impl"
    // InternalPortugol.g:3519:1: rule__CaseList__Group_4__0__Impl : ( ( rule__CaseList__BreakStatementAssignment_4_0 ) ) ;
    public final void rule__CaseList__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3523:1: ( ( ( rule__CaseList__BreakStatementAssignment_4_0 ) ) )
            // InternalPortugol.g:3524:1: ( ( rule__CaseList__BreakStatementAssignment_4_0 ) )
            {
            // InternalPortugol.g:3524:1: ( ( rule__CaseList__BreakStatementAssignment_4_0 ) )
            // InternalPortugol.g:3525:2: ( rule__CaseList__BreakStatementAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getBreakStatementAssignment_4_0()); 
            }
            // InternalPortugol.g:3526:2: ( rule__CaseList__BreakStatementAssignment_4_0 )
            // InternalPortugol.g:3526:3: rule__CaseList__BreakStatementAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__CaseList__BreakStatementAssignment_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseListAccess().getBreakStatementAssignment_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseList__Group_4__0__Impl"


    // $ANTLR start "rule__CaseList__Group_4__1"
    // InternalPortugol.g:3534:1: rule__CaseList__Group_4__1 : rule__CaseList__Group_4__1__Impl ;
    public final void rule__CaseList__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3538:1: ( rule__CaseList__Group_4__1__Impl )
            // InternalPortugol.g:3539:2: rule__CaseList__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CaseList__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseList__Group_4__1"


    // $ANTLR start "rule__CaseList__Group_4__1__Impl"
    // InternalPortugol.g:3545:1: rule__CaseList__Group_4__1__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__CaseList__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3549:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugol.g:3550:1: ( ruleEND_COMMAND )
            {
            // InternalPortugol.g:3550:1: ( ruleEND_COMMAND )
            // InternalPortugol.g:3551:2: ruleEND_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getEND_COMMANDParserRuleCall_4_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleEND_COMMAND();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseListAccess().getEND_COMMANDParserRuleCall_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseList__Group_4__1__Impl"


    // $ANTLR start "rule__OtherCase__Group__0"
    // InternalPortugol.g:3561:1: rule__OtherCase__Group__0 : rule__OtherCase__Group__0__Impl rule__OtherCase__Group__1 ;
    public final void rule__OtherCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3565:1: ( rule__OtherCase__Group__0__Impl rule__OtherCase__Group__1 )
            // InternalPortugol.g:3566:2: rule__OtherCase__Group__0__Impl rule__OtherCase__Group__1
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
    // InternalPortugol.g:3573:1: rule__OtherCase__Group__0__Impl : ( 'outrocaso' ) ;
    public final void rule__OtherCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3577:1: ( ( 'outrocaso' ) )
            // InternalPortugol.g:3578:1: ( 'outrocaso' )
            {
            // InternalPortugol.g:3578:1: ( 'outrocaso' )
            // InternalPortugol.g:3579:2: 'outrocaso'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getOutrocasoKeyword_0()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:3588:1: rule__OtherCase__Group__1 : rule__OtherCase__Group__1__Impl rule__OtherCase__Group__2 ;
    public final void rule__OtherCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3592:1: ( rule__OtherCase__Group__1__Impl rule__OtherCase__Group__2 )
            // InternalPortugol.g:3593:2: rule__OtherCase__Group__1__Impl rule__OtherCase__Group__2
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
    // InternalPortugol.g:3600:1: rule__OtherCase__Group__1__Impl : ( ':' ) ;
    public final void rule__OtherCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3604:1: ( ( ':' ) )
            // InternalPortugol.g:3605:1: ( ':' )
            {
            // InternalPortugol.g:3605:1: ( ':' )
            // InternalPortugol.g:3606:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getColonKeyword_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:3615:1: rule__OtherCase__Group__2 : rule__OtherCase__Group__2__Impl rule__OtherCase__Group__3 ;
    public final void rule__OtherCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3619:1: ( rule__OtherCase__Group__2__Impl rule__OtherCase__Group__3 )
            // InternalPortugol.g:3620:2: rule__OtherCase__Group__2__Impl rule__OtherCase__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__OtherCase__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OtherCase__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPortugol.g:3627:1: rule__OtherCase__Group__2__Impl : ( ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* ) ) ;
    public final void rule__OtherCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3631:1: ( ( ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* ) ) )
            // InternalPortugol.g:3632:1: ( ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* ) )
            {
            // InternalPortugol.g:3632:1: ( ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* ) )
            // InternalPortugol.g:3633:2: ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* )
            {
            // InternalPortugol.g:3633:2: ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) )
            // InternalPortugol.g:3634:3: ( rule__OtherCase__OtherCaseCommandsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getOtherCaseCommandsAssignment_2()); 
            }
            // InternalPortugol.g:3635:3: ( rule__OtherCase__OtherCaseCommandsAssignment_2 )
            // InternalPortugol.g:3635:4: rule__OtherCase__OtherCaseCommandsAssignment_2
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

            // InternalPortugol.g:3638:2: ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* )
            // InternalPortugol.g:3639:3: ( rule__OtherCase__OtherCaseCommandsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getOtherCaseCommandsAssignment_2()); 
            }
            // InternalPortugol.g:3640:3: ( rule__OtherCase__OtherCaseCommandsAssignment_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_FLOAT)||(LA32_0>=17 && LA32_0<=18)||LA32_0==28||LA32_0==33||LA32_0==39||LA32_0==46||LA32_0==50||LA32_0==54||LA32_0==60||(LA32_0>=62 && LA32_0<=63)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPortugol.g:3640:4: rule__OtherCase__OtherCaseCommandsAssignment_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__OtherCase__OtherCaseCommandsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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


    // $ANTLR start "rule__OtherCase__Group__3"
    // InternalPortugol.g:3649:1: rule__OtherCase__Group__3 : rule__OtherCase__Group__3__Impl ;
    public final void rule__OtherCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3653:1: ( rule__OtherCase__Group__3__Impl )
            // InternalPortugol.g:3654:2: rule__OtherCase__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherCase__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherCase__Group__3"


    // $ANTLR start "rule__OtherCase__Group__3__Impl"
    // InternalPortugol.g:3660:1: rule__OtherCase__Group__3__Impl : ( ( rule__OtherCase__Group_3__0 )? ) ;
    public final void rule__OtherCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3664:1: ( ( ( rule__OtherCase__Group_3__0 )? ) )
            // InternalPortugol.g:3665:1: ( ( rule__OtherCase__Group_3__0 )? )
            {
            // InternalPortugol.g:3665:1: ( ( rule__OtherCase__Group_3__0 )? )
            // InternalPortugol.g:3666:2: ( rule__OtherCase__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getGroup_3()); 
            }
            // InternalPortugol.g:3667:2: ( rule__OtherCase__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==64) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPortugol.g:3667:3: rule__OtherCase__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OtherCase__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherCaseAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherCase__Group__3__Impl"


    // $ANTLR start "rule__OtherCase__Group_3__0"
    // InternalPortugol.g:3676:1: rule__OtherCase__Group_3__0 : rule__OtherCase__Group_3__0__Impl rule__OtherCase__Group_3__1 ;
    public final void rule__OtherCase__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3680:1: ( rule__OtherCase__Group_3__0__Impl rule__OtherCase__Group_3__1 )
            // InternalPortugol.g:3681:2: rule__OtherCase__Group_3__0__Impl rule__OtherCase__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__OtherCase__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OtherCase__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherCase__Group_3__0"


    // $ANTLR start "rule__OtherCase__Group_3__0__Impl"
    // InternalPortugol.g:3688:1: rule__OtherCase__Group_3__0__Impl : ( ( rule__OtherCase__BreakStatementAssignment_3_0 ) ) ;
    public final void rule__OtherCase__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3692:1: ( ( ( rule__OtherCase__BreakStatementAssignment_3_0 ) ) )
            // InternalPortugol.g:3693:1: ( ( rule__OtherCase__BreakStatementAssignment_3_0 ) )
            {
            // InternalPortugol.g:3693:1: ( ( rule__OtherCase__BreakStatementAssignment_3_0 ) )
            // InternalPortugol.g:3694:2: ( rule__OtherCase__BreakStatementAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getBreakStatementAssignment_3_0()); 
            }
            // InternalPortugol.g:3695:2: ( rule__OtherCase__BreakStatementAssignment_3_0 )
            // InternalPortugol.g:3695:3: rule__OtherCase__BreakStatementAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__OtherCase__BreakStatementAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherCaseAccess().getBreakStatementAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherCase__Group_3__0__Impl"


    // $ANTLR start "rule__OtherCase__Group_3__1"
    // InternalPortugol.g:3703:1: rule__OtherCase__Group_3__1 : rule__OtherCase__Group_3__1__Impl ;
    public final void rule__OtherCase__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3707:1: ( rule__OtherCase__Group_3__1__Impl )
            // InternalPortugol.g:3708:2: rule__OtherCase__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherCase__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherCase__Group_3__1"


    // $ANTLR start "rule__OtherCase__Group_3__1__Impl"
    // InternalPortugol.g:3714:1: rule__OtherCase__Group_3__1__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__OtherCase__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3718:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugol.g:3719:1: ( ruleEND_COMMAND )
            {
            // InternalPortugol.g:3719:1: ( ruleEND_COMMAND )
            // InternalPortugol.g:3720:2: ruleEND_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getEND_COMMANDParserRuleCall_3_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleEND_COMMAND();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherCaseAccess().getEND_COMMANDParserRuleCall_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherCase__Group_3__1__Impl"


    // $ANTLR start "rule__ForStatement__Group__0"
    // InternalPortugol.g:3730:1: rule__ForStatement__Group__0 : rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1 ;
    public final void rule__ForStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3734:1: ( rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1 )
            // InternalPortugol.g:3735:2: rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPortugol.g:3742:1: rule__ForStatement__Group__0__Impl : ( 'para' ) ;
    public final void rule__ForStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3746:1: ( ( 'para' ) )
            // InternalPortugol.g:3747:1: ( 'para' )
            {
            // InternalPortugol.g:3747:1: ( 'para' )
            // InternalPortugol.g:3748:2: 'para'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getParaKeyword_0()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:3757:1: rule__ForStatement__Group__1 : rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2 ;
    public final void rule__ForStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3761:1: ( rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2 )
            // InternalPortugol.g:3762:2: rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2
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
    // InternalPortugol.g:3769:1: rule__ForStatement__Group__1__Impl : ( ( rule__ForStatement__OperatorExprAssignment_1 ) ) ;
    public final void rule__ForStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3773:1: ( ( ( rule__ForStatement__OperatorExprAssignment_1 ) ) )
            // InternalPortugol.g:3774:1: ( ( rule__ForStatement__OperatorExprAssignment_1 ) )
            {
            // InternalPortugol.g:3774:1: ( ( rule__ForStatement__OperatorExprAssignment_1 ) )
            // InternalPortugol.g:3775:2: ( rule__ForStatement__OperatorExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getOperatorExprAssignment_1()); 
            }
            // InternalPortugol.g:3776:2: ( rule__ForStatement__OperatorExprAssignment_1 )
            // InternalPortugol.g:3776:3: rule__ForStatement__OperatorExprAssignment_1
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
    // InternalPortugol.g:3784:1: rule__ForStatement__Group__2 : rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3 ;
    public final void rule__ForStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3788:1: ( rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3 )
            // InternalPortugol.g:3789:2: rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalPortugol.g:3796:1: rule__ForStatement__Group__2__Impl : ( 'de' ) ;
    public final void rule__ForStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3800:1: ( ( 'de' ) )
            // InternalPortugol.g:3801:1: ( 'de' )
            {
            // InternalPortugol.g:3801:1: ( 'de' )
            // InternalPortugol.g:3802:2: 'de'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getDeKeyword_2()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:3811:1: rule__ForStatement__Group__3 : rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4 ;
    public final void rule__ForStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3815:1: ( rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4 )
            // InternalPortugol.g:3816:2: rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4
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
    // InternalPortugol.g:3823:1: rule__ForStatement__Group__3__Impl : ( ( rule__ForStatement__StartExprAssignment_3 ) ) ;
    public final void rule__ForStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3827:1: ( ( ( rule__ForStatement__StartExprAssignment_3 ) ) )
            // InternalPortugol.g:3828:1: ( ( rule__ForStatement__StartExprAssignment_3 ) )
            {
            // InternalPortugol.g:3828:1: ( ( rule__ForStatement__StartExprAssignment_3 ) )
            // InternalPortugol.g:3829:2: ( rule__ForStatement__StartExprAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getStartExprAssignment_3()); 
            }
            // InternalPortugol.g:3830:2: ( rule__ForStatement__StartExprAssignment_3 )
            // InternalPortugol.g:3830:3: rule__ForStatement__StartExprAssignment_3
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
    // InternalPortugol.g:3838:1: rule__ForStatement__Group__4 : rule__ForStatement__Group__4__Impl rule__ForStatement__Group__5 ;
    public final void rule__ForStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3842:1: ( rule__ForStatement__Group__4__Impl rule__ForStatement__Group__5 )
            // InternalPortugol.g:3843:2: rule__ForStatement__Group__4__Impl rule__ForStatement__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalPortugol.g:3850:1: rule__ForStatement__Group__4__Impl : ( 'ate' ) ;
    public final void rule__ForStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3854:1: ( ( 'ate' ) )
            // InternalPortugol.g:3855:1: ( 'ate' )
            {
            // InternalPortugol.g:3855:1: ( 'ate' )
            // InternalPortugol.g:3856:2: 'ate'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getAteKeyword_4()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:3865:1: rule__ForStatement__Group__5 : rule__ForStatement__Group__5__Impl rule__ForStatement__Group__6 ;
    public final void rule__ForStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3869:1: ( rule__ForStatement__Group__5__Impl rule__ForStatement__Group__6 )
            // InternalPortugol.g:3870:2: rule__ForStatement__Group__5__Impl rule__ForStatement__Group__6
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
    // InternalPortugol.g:3877:1: rule__ForStatement__Group__5__Impl : ( ( rule__ForStatement__EndExprAssignment_5 ) ) ;
    public final void rule__ForStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3881:1: ( ( ( rule__ForStatement__EndExprAssignment_5 ) ) )
            // InternalPortugol.g:3882:1: ( ( rule__ForStatement__EndExprAssignment_5 ) )
            {
            // InternalPortugol.g:3882:1: ( ( rule__ForStatement__EndExprAssignment_5 ) )
            // InternalPortugol.g:3883:2: ( rule__ForStatement__EndExprAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getEndExprAssignment_5()); 
            }
            // InternalPortugol.g:3884:2: ( rule__ForStatement__EndExprAssignment_5 )
            // InternalPortugol.g:3884:3: rule__ForStatement__EndExprAssignment_5
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
    // InternalPortugol.g:3892:1: rule__ForStatement__Group__6 : rule__ForStatement__Group__6__Impl rule__ForStatement__Group__7 ;
    public final void rule__ForStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3896:1: ( rule__ForStatement__Group__6__Impl rule__ForStatement__Group__7 )
            // InternalPortugol.g:3897:2: rule__ForStatement__Group__6__Impl rule__ForStatement__Group__7
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
    // InternalPortugol.g:3904:1: rule__ForStatement__Group__6__Impl : ( ( rule__ForStatement__Group_6__0 )? ) ;
    public final void rule__ForStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3908:1: ( ( ( rule__ForStatement__Group_6__0 )? ) )
            // InternalPortugol.g:3909:1: ( ( rule__ForStatement__Group_6__0 )? )
            {
            // InternalPortugol.g:3909:1: ( ( rule__ForStatement__Group_6__0 )? )
            // InternalPortugol.g:3910:2: ( rule__ForStatement__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getGroup_6()); 
            }
            // InternalPortugol.g:3911:2: ( rule__ForStatement__Group_6__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==59) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPortugol.g:3911:3: rule__ForStatement__Group_6__0
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
    // InternalPortugol.g:3919:1: rule__ForStatement__Group__7 : rule__ForStatement__Group__7__Impl rule__ForStatement__Group__8 ;
    public final void rule__ForStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3923:1: ( rule__ForStatement__Group__7__Impl rule__ForStatement__Group__8 )
            // InternalPortugol.g:3924:2: rule__ForStatement__Group__7__Impl rule__ForStatement__Group__8
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
    // InternalPortugol.g:3931:1: rule__ForStatement__Group__7__Impl : ( 'faca' ) ;
    public final void rule__ForStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3935:1: ( ( 'faca' ) )
            // InternalPortugol.g:3936:1: ( 'faca' )
            {
            // InternalPortugol.g:3936:1: ( 'faca' )
            // InternalPortugol.g:3937:2: 'faca'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getFacaKeyword_7()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:3946:1: rule__ForStatement__Group__8 : rule__ForStatement__Group__8__Impl rule__ForStatement__Group__9 ;
    public final void rule__ForStatement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3950:1: ( rule__ForStatement__Group__8__Impl rule__ForStatement__Group__9 )
            // InternalPortugol.g:3951:2: rule__ForStatement__Group__8__Impl rule__ForStatement__Group__9
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
    // InternalPortugol.g:3958:1: rule__ForStatement__Group__8__Impl : ( ( ( rule__ForStatement__CommandsAssignment_8 ) ) ( ( rule__ForStatement__CommandsAssignment_8 )* ) ) ;
    public final void rule__ForStatement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3962:1: ( ( ( ( rule__ForStatement__CommandsAssignment_8 ) ) ( ( rule__ForStatement__CommandsAssignment_8 )* ) ) )
            // InternalPortugol.g:3963:1: ( ( ( rule__ForStatement__CommandsAssignment_8 ) ) ( ( rule__ForStatement__CommandsAssignment_8 )* ) )
            {
            // InternalPortugol.g:3963:1: ( ( ( rule__ForStatement__CommandsAssignment_8 ) ) ( ( rule__ForStatement__CommandsAssignment_8 )* ) )
            // InternalPortugol.g:3964:2: ( ( rule__ForStatement__CommandsAssignment_8 ) ) ( ( rule__ForStatement__CommandsAssignment_8 )* )
            {
            // InternalPortugol.g:3964:2: ( ( rule__ForStatement__CommandsAssignment_8 ) )
            // InternalPortugol.g:3965:3: ( rule__ForStatement__CommandsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getCommandsAssignment_8()); 
            }
            // InternalPortugol.g:3966:3: ( rule__ForStatement__CommandsAssignment_8 )
            // InternalPortugol.g:3966:4: rule__ForStatement__CommandsAssignment_8
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

            // InternalPortugol.g:3969:2: ( ( rule__ForStatement__CommandsAssignment_8 )* )
            // InternalPortugol.g:3970:3: ( rule__ForStatement__CommandsAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getCommandsAssignment_8()); 
            }
            // InternalPortugol.g:3971:3: ( rule__ForStatement__CommandsAssignment_8 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_FLOAT)||(LA35_0>=17 && LA35_0<=18)||LA35_0==28||LA35_0==33||LA35_0==39||LA35_0==46||LA35_0==50||LA35_0==54||LA35_0==60||(LA35_0>=62 && LA35_0<=63)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalPortugol.g:3971:4: rule__ForStatement__CommandsAssignment_8
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ForStatement__CommandsAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalPortugol.g:3980:1: rule__ForStatement__Group__9 : rule__ForStatement__Group__9__Impl ;
    public final void rule__ForStatement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3984:1: ( rule__ForStatement__Group__9__Impl )
            // InternalPortugol.g:3985:2: rule__ForStatement__Group__9__Impl
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
    // InternalPortugol.g:3991:1: rule__ForStatement__Group__9__Impl : ( 'fimpara' ) ;
    public final void rule__ForStatement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3995:1: ( ( 'fimpara' ) )
            // InternalPortugol.g:3996:1: ( 'fimpara' )
            {
            // InternalPortugol.g:3996:1: ( 'fimpara' )
            // InternalPortugol.g:3997:2: 'fimpara'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getFimparaKeyword_9()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:4007:1: rule__ForStatement__Group_6__0 : rule__ForStatement__Group_6__0__Impl rule__ForStatement__Group_6__1 ;
    public final void rule__ForStatement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4011:1: ( rule__ForStatement__Group_6__0__Impl rule__ForStatement__Group_6__1 )
            // InternalPortugol.g:4012:2: rule__ForStatement__Group_6__0__Impl rule__ForStatement__Group_6__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPortugol.g:4019:1: rule__ForStatement__Group_6__0__Impl : ( 'passo' ) ;
    public final void rule__ForStatement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4023:1: ( ( 'passo' ) )
            // InternalPortugol.g:4024:1: ( 'passo' )
            {
            // InternalPortugol.g:4024:1: ( 'passo' )
            // InternalPortugol.g:4025:2: 'passo'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getPassoKeyword_6_0()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:4034:1: rule__ForStatement__Group_6__1 : rule__ForStatement__Group_6__1__Impl ;
    public final void rule__ForStatement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4038:1: ( rule__ForStatement__Group_6__1__Impl )
            // InternalPortugol.g:4039:2: rule__ForStatement__Group_6__1__Impl
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
    // InternalPortugol.g:4045:1: rule__ForStatement__Group_6__1__Impl : ( ( rule__ForStatement__StepExpeAssignment_6_1 ) ) ;
    public final void rule__ForStatement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4049:1: ( ( ( rule__ForStatement__StepExpeAssignment_6_1 ) ) )
            // InternalPortugol.g:4050:1: ( ( rule__ForStatement__StepExpeAssignment_6_1 ) )
            {
            // InternalPortugol.g:4050:1: ( ( rule__ForStatement__StepExpeAssignment_6_1 ) )
            // InternalPortugol.g:4051:2: ( rule__ForStatement__StepExpeAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getStepExpeAssignment_6_1()); 
            }
            // InternalPortugol.g:4052:2: ( rule__ForStatement__StepExpeAssignment_6_1 )
            // InternalPortugol.g:4052:3: rule__ForStatement__StepExpeAssignment_6_1
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
    // InternalPortugol.g:4061:1: rule__WhileStatement__Group__0 : rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 ;
    public final void rule__WhileStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4065:1: ( rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 )
            // InternalPortugol.g:4066:2: rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPortugol.g:4073:1: rule__WhileStatement__Group__0__Impl : ( 'enquanto' ) ;
    public final void rule__WhileStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4077:1: ( ( 'enquanto' ) )
            // InternalPortugol.g:4078:1: ( 'enquanto' )
            {
            // InternalPortugol.g:4078:1: ( 'enquanto' )
            // InternalPortugol.g:4079:2: 'enquanto'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getEnquantoKeyword_0()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:4088:1: rule__WhileStatement__Group__1 : rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 ;
    public final void rule__WhileStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4092:1: ( rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 )
            // InternalPortugol.g:4093:2: rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2
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
    // InternalPortugol.g:4100:1: rule__WhileStatement__Group__1__Impl : ( ( rule__WhileStatement__WhileExprAssignment_1 ) ) ;
    public final void rule__WhileStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4104:1: ( ( ( rule__WhileStatement__WhileExprAssignment_1 ) ) )
            // InternalPortugol.g:4105:1: ( ( rule__WhileStatement__WhileExprAssignment_1 ) )
            {
            // InternalPortugol.g:4105:1: ( ( rule__WhileStatement__WhileExprAssignment_1 ) )
            // InternalPortugol.g:4106:2: ( rule__WhileStatement__WhileExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getWhileExprAssignment_1()); 
            }
            // InternalPortugol.g:4107:2: ( rule__WhileStatement__WhileExprAssignment_1 )
            // InternalPortugol.g:4107:3: rule__WhileStatement__WhileExprAssignment_1
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
    // InternalPortugol.g:4115:1: rule__WhileStatement__Group__2 : rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 ;
    public final void rule__WhileStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4119:1: ( rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 )
            // InternalPortugol.g:4120:2: rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3
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
    // InternalPortugol.g:4127:1: rule__WhileStatement__Group__2__Impl : ( 'faca' ) ;
    public final void rule__WhileStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4131:1: ( ( 'faca' ) )
            // InternalPortugol.g:4132:1: ( 'faca' )
            {
            // InternalPortugol.g:4132:1: ( 'faca' )
            // InternalPortugol.g:4133:2: 'faca'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getFacaKeyword_2()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:4142:1: rule__WhileStatement__Group__3 : rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 ;
    public final void rule__WhileStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4146:1: ( rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 )
            // InternalPortugol.g:4147:2: rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4
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
    // InternalPortugol.g:4154:1: rule__WhileStatement__Group__3__Impl : ( ( ( rule__WhileStatement__CommandsAssignment_3 ) ) ( ( rule__WhileStatement__CommandsAssignment_3 )* ) ) ;
    public final void rule__WhileStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4158:1: ( ( ( ( rule__WhileStatement__CommandsAssignment_3 ) ) ( ( rule__WhileStatement__CommandsAssignment_3 )* ) ) )
            // InternalPortugol.g:4159:1: ( ( ( rule__WhileStatement__CommandsAssignment_3 ) ) ( ( rule__WhileStatement__CommandsAssignment_3 )* ) )
            {
            // InternalPortugol.g:4159:1: ( ( ( rule__WhileStatement__CommandsAssignment_3 ) ) ( ( rule__WhileStatement__CommandsAssignment_3 )* ) )
            // InternalPortugol.g:4160:2: ( ( rule__WhileStatement__CommandsAssignment_3 ) ) ( ( rule__WhileStatement__CommandsAssignment_3 )* )
            {
            // InternalPortugol.g:4160:2: ( ( rule__WhileStatement__CommandsAssignment_3 ) )
            // InternalPortugol.g:4161:3: ( rule__WhileStatement__CommandsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugol.g:4162:3: ( rule__WhileStatement__CommandsAssignment_3 )
            // InternalPortugol.g:4162:4: rule__WhileStatement__CommandsAssignment_3
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

            // InternalPortugol.g:4165:2: ( ( rule__WhileStatement__CommandsAssignment_3 )* )
            // InternalPortugol.g:4166:3: ( rule__WhileStatement__CommandsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugol.g:4167:3: ( rule__WhileStatement__CommandsAssignment_3 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_FLOAT)||(LA36_0>=17 && LA36_0<=18)||LA36_0==28||LA36_0==33||LA36_0==39||LA36_0==46||LA36_0==50||LA36_0==54||LA36_0==60||(LA36_0>=62 && LA36_0<=63)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalPortugol.g:4167:4: rule__WhileStatement__CommandsAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__WhileStatement__CommandsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalPortugol.g:4176:1: rule__WhileStatement__Group__4 : rule__WhileStatement__Group__4__Impl ;
    public final void rule__WhileStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4180:1: ( rule__WhileStatement__Group__4__Impl )
            // InternalPortugol.g:4181:2: rule__WhileStatement__Group__4__Impl
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
    // InternalPortugol.g:4187:1: rule__WhileStatement__Group__4__Impl : ( 'fimenquanto' ) ;
    public final void rule__WhileStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4191:1: ( ( 'fimenquanto' ) )
            // InternalPortugol.g:4192:1: ( 'fimenquanto' )
            {
            // InternalPortugol.g:4192:1: ( 'fimenquanto' )
            // InternalPortugol.g:4193:2: 'fimenquanto'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getFimenquantoKeyword_4()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:4203:1: rule__RepeatStatement__Group__0 : rule__RepeatStatement__Group__0__Impl rule__RepeatStatement__Group__1 ;
    public final void rule__RepeatStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4207:1: ( rule__RepeatStatement__Group__0__Impl rule__RepeatStatement__Group__1 )
            // InternalPortugol.g:4208:2: rule__RepeatStatement__Group__0__Impl rule__RepeatStatement__Group__1
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
    // InternalPortugol.g:4215:1: rule__RepeatStatement__Group__0__Impl : ( 'repita' ) ;
    public final void rule__RepeatStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4219:1: ( ( 'repita' ) )
            // InternalPortugol.g:4220:1: ( 'repita' )
            {
            // InternalPortugol.g:4220:1: ( 'repita' )
            // InternalPortugol.g:4221:2: 'repita'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatStatementAccess().getRepitaKeyword_0()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:4230:1: rule__RepeatStatement__Group__1 : rule__RepeatStatement__Group__1__Impl rule__RepeatStatement__Group__2 ;
    public final void rule__RepeatStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4234:1: ( rule__RepeatStatement__Group__1__Impl rule__RepeatStatement__Group__2 )
            // InternalPortugol.g:4235:2: rule__RepeatStatement__Group__1__Impl rule__RepeatStatement__Group__2
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
    // InternalPortugol.g:4242:1: rule__RepeatStatement__Group__1__Impl : ( ( ( rule__RepeatStatement__CommandsAssignment_1 ) ) ( ( rule__RepeatStatement__CommandsAssignment_1 )* ) ) ;
    public final void rule__RepeatStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4246:1: ( ( ( ( rule__RepeatStatement__CommandsAssignment_1 ) ) ( ( rule__RepeatStatement__CommandsAssignment_1 )* ) ) )
            // InternalPortugol.g:4247:1: ( ( ( rule__RepeatStatement__CommandsAssignment_1 ) ) ( ( rule__RepeatStatement__CommandsAssignment_1 )* ) )
            {
            // InternalPortugol.g:4247:1: ( ( ( rule__RepeatStatement__CommandsAssignment_1 ) ) ( ( rule__RepeatStatement__CommandsAssignment_1 )* ) )
            // InternalPortugol.g:4248:2: ( ( rule__RepeatStatement__CommandsAssignment_1 ) ) ( ( rule__RepeatStatement__CommandsAssignment_1 )* )
            {
            // InternalPortugol.g:4248:2: ( ( rule__RepeatStatement__CommandsAssignment_1 ) )
            // InternalPortugol.g:4249:3: ( rule__RepeatStatement__CommandsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatStatementAccess().getCommandsAssignment_1()); 
            }
            // InternalPortugol.g:4250:3: ( rule__RepeatStatement__CommandsAssignment_1 )
            // InternalPortugol.g:4250:4: rule__RepeatStatement__CommandsAssignment_1
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

            // InternalPortugol.g:4253:2: ( ( rule__RepeatStatement__CommandsAssignment_1 )* )
            // InternalPortugol.g:4254:3: ( rule__RepeatStatement__CommandsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatStatementAccess().getCommandsAssignment_1()); 
            }
            // InternalPortugol.g:4255:3: ( rule__RepeatStatement__CommandsAssignment_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_FLOAT)||(LA37_0>=17 && LA37_0<=18)||LA37_0==28||LA37_0==33||LA37_0==39||LA37_0==46||LA37_0==50||LA37_0==54||LA37_0==60||(LA37_0>=62 && LA37_0<=63)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalPortugol.g:4255:4: rule__RepeatStatement__CommandsAssignment_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__RepeatStatement__CommandsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalPortugol.g:4264:1: rule__RepeatStatement__Group__2 : rule__RepeatStatement__Group__2__Impl rule__RepeatStatement__Group__3 ;
    public final void rule__RepeatStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4268:1: ( rule__RepeatStatement__Group__2__Impl rule__RepeatStatement__Group__3 )
            // InternalPortugol.g:4269:2: rule__RepeatStatement__Group__2__Impl rule__RepeatStatement__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalPortugol.g:4276:1: rule__RepeatStatement__Group__2__Impl : ( 'ate' ) ;
    public final void rule__RepeatStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4280:1: ( ( 'ate' ) )
            // InternalPortugol.g:4281:1: ( 'ate' )
            {
            // InternalPortugol.g:4281:1: ( 'ate' )
            // InternalPortugol.g:4282:2: 'ate'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatStatementAccess().getAteKeyword_2()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:4291:1: rule__RepeatStatement__Group__3 : rule__RepeatStatement__Group__3__Impl rule__RepeatStatement__Group__4 ;
    public final void rule__RepeatStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4295:1: ( rule__RepeatStatement__Group__3__Impl rule__RepeatStatement__Group__4 )
            // InternalPortugol.g:4296:2: rule__RepeatStatement__Group__3__Impl rule__RepeatStatement__Group__4
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
    // InternalPortugol.g:4303:1: rule__RepeatStatement__Group__3__Impl : ( ( rule__RepeatStatement__UntilExprAssignment_3 ) ) ;
    public final void rule__RepeatStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4307:1: ( ( ( rule__RepeatStatement__UntilExprAssignment_3 ) ) )
            // InternalPortugol.g:4308:1: ( ( rule__RepeatStatement__UntilExprAssignment_3 ) )
            {
            // InternalPortugol.g:4308:1: ( ( rule__RepeatStatement__UntilExprAssignment_3 ) )
            // InternalPortugol.g:4309:2: ( rule__RepeatStatement__UntilExprAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatStatementAccess().getUntilExprAssignment_3()); 
            }
            // InternalPortugol.g:4310:2: ( rule__RepeatStatement__UntilExprAssignment_3 )
            // InternalPortugol.g:4310:3: rule__RepeatStatement__UntilExprAssignment_3
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
    // InternalPortugol.g:4318:1: rule__RepeatStatement__Group__4 : rule__RepeatStatement__Group__4__Impl ;
    public final void rule__RepeatStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4322:1: ( rule__RepeatStatement__Group__4__Impl )
            // InternalPortugol.g:4323:2: rule__RepeatStatement__Group__4__Impl
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
    // InternalPortugol.g:4329:1: rule__RepeatStatement__Group__4__Impl : ( ruleEND_COMMAND ) ;
    public final void rule__RepeatStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4333:1: ( ( ruleEND_COMMAND ) )
            // InternalPortugol.g:4334:1: ( ruleEND_COMMAND )
            {
            // InternalPortugol.g:4334:1: ( ruleEND_COMMAND )
            // InternalPortugol.g:4335:2: ruleEND_COMMAND
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
    // InternalPortugol.g:4345:1: rule__SubprogramParam__Group__0 : rule__SubprogramParam__Group__0__Impl rule__SubprogramParam__Group__1 ;
    public final void rule__SubprogramParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4349:1: ( rule__SubprogramParam__Group__0__Impl rule__SubprogramParam__Group__1 )
            // InternalPortugol.g:4350:2: rule__SubprogramParam__Group__0__Impl rule__SubprogramParam__Group__1
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
    // InternalPortugol.g:4357:1: rule__SubprogramParam__Group__0__Impl : ( ( rule__SubprogramParam__ExpressionAssignment_0 ) ) ;
    public final void rule__SubprogramParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4361:1: ( ( ( rule__SubprogramParam__ExpressionAssignment_0 ) ) )
            // InternalPortugol.g:4362:1: ( ( rule__SubprogramParam__ExpressionAssignment_0 ) )
            {
            // InternalPortugol.g:4362:1: ( ( rule__SubprogramParam__ExpressionAssignment_0 ) )
            // InternalPortugol.g:4363:2: ( rule__SubprogramParam__ExpressionAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamAccess().getExpressionAssignment_0()); 
            }
            // InternalPortugol.g:4364:2: ( rule__SubprogramParam__ExpressionAssignment_0 )
            // InternalPortugol.g:4364:3: rule__SubprogramParam__ExpressionAssignment_0
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
    // InternalPortugol.g:4372:1: rule__SubprogramParam__Group__1 : rule__SubprogramParam__Group__1__Impl ;
    public final void rule__SubprogramParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4376:1: ( rule__SubprogramParam__Group__1__Impl )
            // InternalPortugol.g:4377:2: rule__SubprogramParam__Group__1__Impl
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
    // InternalPortugol.g:4383:1: rule__SubprogramParam__Group__1__Impl : ( ( rule__SubprogramParam__Group_1__0 )* ) ;
    public final void rule__SubprogramParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4387:1: ( ( ( rule__SubprogramParam__Group_1__0 )* ) )
            // InternalPortugol.g:4388:1: ( ( rule__SubprogramParam__Group_1__0 )* )
            {
            // InternalPortugol.g:4388:1: ( ( rule__SubprogramParam__Group_1__0 )* )
            // InternalPortugol.g:4389:2: ( rule__SubprogramParam__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamAccess().getGroup_1()); 
            }
            // InternalPortugol.g:4390:2: ( rule__SubprogramParam__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==37) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalPortugol.g:4390:3: rule__SubprogramParam__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SubprogramParam__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalPortugol.g:4399:1: rule__SubprogramParam__Group_1__0 : rule__SubprogramParam__Group_1__0__Impl rule__SubprogramParam__Group_1__1 ;
    public final void rule__SubprogramParam__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4403:1: ( rule__SubprogramParam__Group_1__0__Impl rule__SubprogramParam__Group_1__1 )
            // InternalPortugol.g:4404:2: rule__SubprogramParam__Group_1__0__Impl rule__SubprogramParam__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPortugol.g:4411:1: rule__SubprogramParam__Group_1__0__Impl : ( ',' ) ;
    public final void rule__SubprogramParam__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4415:1: ( ( ',' ) )
            // InternalPortugol.g:4416:1: ( ',' )
            {
            // InternalPortugol.g:4416:1: ( ',' )
            // InternalPortugol.g:4417:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamAccess().getCommaKeyword_1_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:4426:1: rule__SubprogramParam__Group_1__1 : rule__SubprogramParam__Group_1__1__Impl ;
    public final void rule__SubprogramParam__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4430:1: ( rule__SubprogramParam__Group_1__1__Impl )
            // InternalPortugol.g:4431:2: rule__SubprogramParam__Group_1__1__Impl
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
    // InternalPortugol.g:4437:1: rule__SubprogramParam__Group_1__1__Impl : ( ( rule__SubprogramParam__ExpressionAssignment_1_1 ) ) ;
    public final void rule__SubprogramParam__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4441:1: ( ( ( rule__SubprogramParam__ExpressionAssignment_1_1 ) ) )
            // InternalPortugol.g:4442:1: ( ( rule__SubprogramParam__ExpressionAssignment_1_1 ) )
            {
            // InternalPortugol.g:4442:1: ( ( rule__SubprogramParam__ExpressionAssignment_1_1 ) )
            // InternalPortugol.g:4443:2: ( rule__SubprogramParam__ExpressionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamAccess().getExpressionAssignment_1_1()); 
            }
            // InternalPortugol.g:4444:2: ( rule__SubprogramParam__ExpressionAssignment_1_1 )
            // InternalPortugol.g:4444:3: rule__SubprogramParam__ExpressionAssignment_1_1
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
    // InternalPortugol.g:4453:1: rule__ReadCommand__Group__0 : rule__ReadCommand__Group__0__Impl rule__ReadCommand__Group__1 ;
    public final void rule__ReadCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4457:1: ( rule__ReadCommand__Group__0__Impl rule__ReadCommand__Group__1 )
            // InternalPortugol.g:4458:2: rule__ReadCommand__Group__0__Impl rule__ReadCommand__Group__1
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
    // InternalPortugol.g:4465:1: rule__ReadCommand__Group__0__Impl : ( 'leia' ) ;
    public final void rule__ReadCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4469:1: ( ( 'leia' ) )
            // InternalPortugol.g:4470:1: ( 'leia' )
            {
            // InternalPortugol.g:4470:1: ( 'leia' )
            // InternalPortugol.g:4471:2: 'leia'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getLeiaKeyword_0()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:4480:1: rule__ReadCommand__Group__1 : rule__ReadCommand__Group__1__Impl rule__ReadCommand__Group__2 ;
    public final void rule__ReadCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4484:1: ( rule__ReadCommand__Group__1__Impl rule__ReadCommand__Group__2 )
            // InternalPortugol.g:4485:2: rule__ReadCommand__Group__1__Impl rule__ReadCommand__Group__2
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
    // InternalPortugol.g:4492:1: rule__ReadCommand__Group__1__Impl : ( '(' ) ;
    public final void rule__ReadCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4496:1: ( ( '(' ) )
            // InternalPortugol.g:4497:1: ( '(' )
            {
            // InternalPortugol.g:4497:1: ( '(' )
            // InternalPortugol.g:4498:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:4507:1: rule__ReadCommand__Group__2 : rule__ReadCommand__Group__2__Impl rule__ReadCommand__Group__3 ;
    public final void rule__ReadCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4511:1: ( rule__ReadCommand__Group__2__Impl rule__ReadCommand__Group__3 )
            // InternalPortugol.g:4512:2: rule__ReadCommand__Group__2__Impl rule__ReadCommand__Group__3
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
    // InternalPortugol.g:4519:1: rule__ReadCommand__Group__2__Impl : ( ( rule__ReadCommand__ParamListAssignment_2 ) ) ;
    public final void rule__ReadCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4523:1: ( ( ( rule__ReadCommand__ParamListAssignment_2 ) ) )
            // InternalPortugol.g:4524:1: ( ( rule__ReadCommand__ParamListAssignment_2 ) )
            {
            // InternalPortugol.g:4524:1: ( ( rule__ReadCommand__ParamListAssignment_2 ) )
            // InternalPortugol.g:4525:2: ( rule__ReadCommand__ParamListAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getParamListAssignment_2()); 
            }
            // InternalPortugol.g:4526:2: ( rule__ReadCommand__ParamListAssignment_2 )
            // InternalPortugol.g:4526:3: rule__ReadCommand__ParamListAssignment_2
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
    // InternalPortugol.g:4534:1: rule__ReadCommand__Group__3 : rule__ReadCommand__Group__3__Impl ;
    public final void rule__ReadCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4538:1: ( rule__ReadCommand__Group__3__Impl )
            // InternalPortugol.g:4539:2: rule__ReadCommand__Group__3__Impl
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
    // InternalPortugol.g:4545:1: rule__ReadCommand__Group__3__Impl : ( ')' ) ;
    public final void rule__ReadCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4549:1: ( ( ')' ) )
            // InternalPortugol.g:4550:1: ( ')' )
            {
            // InternalPortugol.g:4550:1: ( ')' )
            // InternalPortugol.g:4551:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:4561:1: rule__WriteCommand__Group__0 : rule__WriteCommand__Group__0__Impl rule__WriteCommand__Group__1 ;
    public final void rule__WriteCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4565:1: ( rule__WriteCommand__Group__0__Impl rule__WriteCommand__Group__1 )
            // InternalPortugol.g:4566:2: rule__WriteCommand__Group__0__Impl rule__WriteCommand__Group__1
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
    // InternalPortugol.g:4573:1: rule__WriteCommand__Group__0__Impl : ( ( rule__WriteCommand__WriteCommandAssignment_0 ) ) ;
    public final void rule__WriteCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4577:1: ( ( ( rule__WriteCommand__WriteCommandAssignment_0 ) ) )
            // InternalPortugol.g:4578:1: ( ( rule__WriteCommand__WriteCommandAssignment_0 ) )
            {
            // InternalPortugol.g:4578:1: ( ( rule__WriteCommand__WriteCommandAssignment_0 ) )
            // InternalPortugol.g:4579:2: ( rule__WriteCommand__WriteCommandAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getWriteCommandAssignment_0()); 
            }
            // InternalPortugol.g:4580:2: ( rule__WriteCommand__WriteCommandAssignment_0 )
            // InternalPortugol.g:4580:3: rule__WriteCommand__WriteCommandAssignment_0
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
    // InternalPortugol.g:4588:1: rule__WriteCommand__Group__1 : rule__WriteCommand__Group__1__Impl rule__WriteCommand__Group__2 ;
    public final void rule__WriteCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4592:1: ( rule__WriteCommand__Group__1__Impl rule__WriteCommand__Group__2 )
            // InternalPortugol.g:4593:2: rule__WriteCommand__Group__1__Impl rule__WriteCommand__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalPortugol.g:4600:1: rule__WriteCommand__Group__1__Impl : ( '(' ) ;
    public final void rule__WriteCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4604:1: ( ( '(' ) )
            // InternalPortugol.g:4605:1: ( '(' )
            {
            // InternalPortugol.g:4605:1: ( '(' )
            // InternalPortugol.g:4606:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:4615:1: rule__WriteCommand__Group__2 : rule__WriteCommand__Group__2__Impl rule__WriteCommand__Group__3 ;
    public final void rule__WriteCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4619:1: ( rule__WriteCommand__Group__2__Impl rule__WriteCommand__Group__3 )
            // InternalPortugol.g:4620:2: rule__WriteCommand__Group__2__Impl rule__WriteCommand__Group__3
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
    // InternalPortugol.g:4627:1: rule__WriteCommand__Group__2__Impl : ( ( rule__WriteCommand__WriteParamAssignment_2 ) ) ;
    public final void rule__WriteCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4631:1: ( ( ( rule__WriteCommand__WriteParamAssignment_2 ) ) )
            // InternalPortugol.g:4632:1: ( ( rule__WriteCommand__WriteParamAssignment_2 ) )
            {
            // InternalPortugol.g:4632:1: ( ( rule__WriteCommand__WriteParamAssignment_2 ) )
            // InternalPortugol.g:4633:2: ( rule__WriteCommand__WriteParamAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getWriteParamAssignment_2()); 
            }
            // InternalPortugol.g:4634:2: ( rule__WriteCommand__WriteParamAssignment_2 )
            // InternalPortugol.g:4634:3: rule__WriteCommand__WriteParamAssignment_2
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
    // InternalPortugol.g:4642:1: rule__WriteCommand__Group__3 : rule__WriteCommand__Group__3__Impl ;
    public final void rule__WriteCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4646:1: ( rule__WriteCommand__Group__3__Impl )
            // InternalPortugol.g:4647:2: rule__WriteCommand__Group__3__Impl
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
    // InternalPortugol.g:4653:1: rule__WriteCommand__Group__3__Impl : ( ')' ) ;
    public final void rule__WriteCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4657:1: ( ( ')' ) )
            // InternalPortugol.g:4658:1: ( ')' )
            {
            // InternalPortugol.g:4658:1: ( ')' )
            // InternalPortugol.g:4659:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:4669:1: rule__WriteParam__Group__0 : rule__WriteParam__Group__0__Impl rule__WriteParam__Group__1 ;
    public final void rule__WriteParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4673:1: ( rule__WriteParam__Group__0__Impl rule__WriteParam__Group__1 )
            // InternalPortugol.g:4674:2: rule__WriteParam__Group__0__Impl rule__WriteParam__Group__1
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
    // InternalPortugol.g:4681:1: rule__WriteParam__Group__0__Impl : ( ( rule__WriteParam__ParamsAssignment_0 ) ) ;
    public final void rule__WriteParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4685:1: ( ( ( rule__WriteParam__ParamsAssignment_0 ) ) )
            // InternalPortugol.g:4686:1: ( ( rule__WriteParam__ParamsAssignment_0 ) )
            {
            // InternalPortugol.g:4686:1: ( ( rule__WriteParam__ParamsAssignment_0 ) )
            // InternalPortugol.g:4687:2: ( rule__WriteParam__ParamsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getParamsAssignment_0()); 
            }
            // InternalPortugol.g:4688:2: ( rule__WriteParam__ParamsAssignment_0 )
            // InternalPortugol.g:4688:3: rule__WriteParam__ParamsAssignment_0
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
    // InternalPortugol.g:4696:1: rule__WriteParam__Group__1 : rule__WriteParam__Group__1__Impl ;
    public final void rule__WriteParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4700:1: ( rule__WriteParam__Group__1__Impl )
            // InternalPortugol.g:4701:2: rule__WriteParam__Group__1__Impl
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
    // InternalPortugol.g:4707:1: rule__WriteParam__Group__1__Impl : ( ( rule__WriteParam__PrecisionAssignment_1 )? ) ;
    public final void rule__WriteParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4711:1: ( ( ( rule__WriteParam__PrecisionAssignment_1 )? ) )
            // InternalPortugol.g:4712:1: ( ( rule__WriteParam__PrecisionAssignment_1 )? )
            {
            // InternalPortugol.g:4712:1: ( ( rule__WriteParam__PrecisionAssignment_1 )? )
            // InternalPortugol.g:4713:2: ( rule__WriteParam__PrecisionAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getPrecisionAssignment_1()); 
            }
            // InternalPortugol.g:4714:2: ( rule__WriteParam__PrecisionAssignment_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==36) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalPortugol.g:4714:3: rule__WriteParam__PrecisionAssignment_1
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
    // InternalPortugol.g:4723:1: rule__OptDecimalPrecision__Group__0 : rule__OptDecimalPrecision__Group__0__Impl rule__OptDecimalPrecision__Group__1 ;
    public final void rule__OptDecimalPrecision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4727:1: ( rule__OptDecimalPrecision__Group__0__Impl rule__OptDecimalPrecision__Group__1 )
            // InternalPortugol.g:4728:2: rule__OptDecimalPrecision__Group__0__Impl rule__OptDecimalPrecision__Group__1
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
    // InternalPortugol.g:4735:1: rule__OptDecimalPrecision__Group__0__Impl : ( ':' ) ;
    public final void rule__OptDecimalPrecision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4739:1: ( ( ':' ) )
            // InternalPortugol.g:4740:1: ( ':' )
            {
            // InternalPortugol.g:4740:1: ( ':' )
            // InternalPortugol.g:4741:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getColonKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:4750:1: rule__OptDecimalPrecision__Group__1 : rule__OptDecimalPrecision__Group__1__Impl rule__OptDecimalPrecision__Group__2 ;
    public final void rule__OptDecimalPrecision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4754:1: ( rule__OptDecimalPrecision__Group__1__Impl rule__OptDecimalPrecision__Group__2 )
            // InternalPortugol.g:4755:2: rule__OptDecimalPrecision__Group__1__Impl rule__OptDecimalPrecision__Group__2
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
    // InternalPortugol.g:4762:1: rule__OptDecimalPrecision__Group__1__Impl : ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) ) ;
    public final void rule__OptDecimalPrecision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4766:1: ( ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) ) )
            // InternalPortugol.g:4767:1: ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) )
            {
            // InternalPortugol.g:4767:1: ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) )
            // InternalPortugol.g:4768:2: ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getFirstPrecisionAssignment_1()); 
            }
            // InternalPortugol.g:4769:2: ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 )
            // InternalPortugol.g:4769:3: rule__OptDecimalPrecision__FirstPrecisionAssignment_1
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
    // InternalPortugol.g:4777:1: rule__OptDecimalPrecision__Group__2 : rule__OptDecimalPrecision__Group__2__Impl ;
    public final void rule__OptDecimalPrecision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4781:1: ( rule__OptDecimalPrecision__Group__2__Impl )
            // InternalPortugol.g:4782:2: rule__OptDecimalPrecision__Group__2__Impl
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
    // InternalPortugol.g:4788:1: rule__OptDecimalPrecision__Group__2__Impl : ( ( rule__OptDecimalPrecision__Group_2__0 )? ) ;
    public final void rule__OptDecimalPrecision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4792:1: ( ( ( rule__OptDecimalPrecision__Group_2__0 )? ) )
            // InternalPortugol.g:4793:1: ( ( rule__OptDecimalPrecision__Group_2__0 )? )
            {
            // InternalPortugol.g:4793:1: ( ( rule__OptDecimalPrecision__Group_2__0 )? )
            // InternalPortugol.g:4794:2: ( rule__OptDecimalPrecision__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getGroup_2()); 
            }
            // InternalPortugol.g:4795:2: ( rule__OptDecimalPrecision__Group_2__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==36) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalPortugol.g:4795:3: rule__OptDecimalPrecision__Group_2__0
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
    // InternalPortugol.g:4804:1: rule__OptDecimalPrecision__Group_2__0 : rule__OptDecimalPrecision__Group_2__0__Impl rule__OptDecimalPrecision__Group_2__1 ;
    public final void rule__OptDecimalPrecision__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4808:1: ( rule__OptDecimalPrecision__Group_2__0__Impl rule__OptDecimalPrecision__Group_2__1 )
            // InternalPortugol.g:4809:2: rule__OptDecimalPrecision__Group_2__0__Impl rule__OptDecimalPrecision__Group_2__1
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
    // InternalPortugol.g:4816:1: rule__OptDecimalPrecision__Group_2__0__Impl : ( ':' ) ;
    public final void rule__OptDecimalPrecision__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4820:1: ( ( ':' ) )
            // InternalPortugol.g:4821:1: ( ':' )
            {
            // InternalPortugol.g:4821:1: ( ':' )
            // InternalPortugol.g:4822:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getColonKeyword_2_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:4831:1: rule__OptDecimalPrecision__Group_2__1 : rule__OptDecimalPrecision__Group_2__1__Impl ;
    public final void rule__OptDecimalPrecision__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4835:1: ( rule__OptDecimalPrecision__Group_2__1__Impl )
            // InternalPortugol.g:4836:2: rule__OptDecimalPrecision__Group_2__1__Impl
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
    // InternalPortugol.g:4842:1: rule__OptDecimalPrecision__Group_2__1__Impl : ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) ) ;
    public final void rule__OptDecimalPrecision__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4846:1: ( ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) ) )
            // InternalPortugol.g:4847:1: ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) )
            {
            // InternalPortugol.g:4847:1: ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) )
            // InternalPortugol.g:4848:2: ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getSecondPrecisionAssignment_2_1()); 
            }
            // InternalPortugol.g:4849:2: ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 )
            // InternalPortugol.g:4849:3: rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1
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
    // InternalPortugol.g:4858:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4862:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalPortugol.g:4863:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
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
    // InternalPortugol.g:4870:1: rule__Assignment__Group__0__Impl : ( ruleOrExpression ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4874:1: ( ( ruleOrExpression ) )
            // InternalPortugol.g:4875:1: ( ruleOrExpression )
            {
            // InternalPortugol.g:4875:1: ( ruleOrExpression )
            // InternalPortugol.g:4876:2: ruleOrExpression
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
    // InternalPortugol.g:4885:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4889:1: ( rule__Assignment__Group__1__Impl )
            // InternalPortugol.g:4890:2: rule__Assignment__Group__1__Impl
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
    // InternalPortugol.g:4896:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__Group_1__0 )* ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4900:1: ( ( ( rule__Assignment__Group_1__0 )* ) )
            // InternalPortugol.g:4901:1: ( ( rule__Assignment__Group_1__0 )* )
            {
            // InternalPortugol.g:4901:1: ( ( rule__Assignment__Group_1__0 )* )
            // InternalPortugol.g:4902:2: ( rule__Assignment__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_1()); 
            }
            // InternalPortugol.g:4903:2: ( rule__Assignment__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==65) ) {
                    int LA41_2 = input.LA(2);

                    if ( (synpred55_InternalPortugol()) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // InternalPortugol.g:4903:3: rule__Assignment__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Assignment__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalPortugol.g:4912:1: rule__Assignment__Group_1__0 : rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 ;
    public final void rule__Assignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4916:1: ( rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 )
            // InternalPortugol.g:4917:2: rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPortugol.g:4924:1: rule__Assignment__Group_1__0__Impl : ( ( rule__Assignment__Group_1_0__0 ) ) ;
    public final void rule__Assignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4928:1: ( ( ( rule__Assignment__Group_1_0__0 ) ) )
            // InternalPortugol.g:4929:1: ( ( rule__Assignment__Group_1_0__0 ) )
            {
            // InternalPortugol.g:4929:1: ( ( rule__Assignment__Group_1_0__0 ) )
            // InternalPortugol.g:4930:2: ( rule__Assignment__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:4931:2: ( rule__Assignment__Group_1_0__0 )
            // InternalPortugol.g:4931:3: rule__Assignment__Group_1_0__0
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
    // InternalPortugol.g:4939:1: rule__Assignment__Group_1__1 : rule__Assignment__Group_1__1__Impl ;
    public final void rule__Assignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4943:1: ( rule__Assignment__Group_1__1__Impl )
            // InternalPortugol.g:4944:2: rule__Assignment__Group_1__1__Impl
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
    // InternalPortugol.g:4950:1: rule__Assignment__Group_1__1__Impl : ( ( rule__Assignment__RightAssignment_1_1 ) ) ;
    public final void rule__Assignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4954:1: ( ( ( rule__Assignment__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:4955:1: ( ( rule__Assignment__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:4955:1: ( ( rule__Assignment__RightAssignment_1_1 ) )
            // InternalPortugol.g:4956:2: ( rule__Assignment__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:4957:2: ( rule__Assignment__RightAssignment_1_1 )
            // InternalPortugol.g:4957:3: rule__Assignment__RightAssignment_1_1
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
    // InternalPortugol.g:4966:1: rule__Assignment__Group_1_0__0 : rule__Assignment__Group_1_0__0__Impl ;
    public final void rule__Assignment__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4970:1: ( rule__Assignment__Group_1_0__0__Impl )
            // InternalPortugol.g:4971:2: rule__Assignment__Group_1_0__0__Impl
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
    // InternalPortugol.g:4977:1: rule__Assignment__Group_1_0__0__Impl : ( ( rule__Assignment__Group_1_0_0__0 ) ) ;
    public final void rule__Assignment__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4981:1: ( ( ( rule__Assignment__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:4982:1: ( ( rule__Assignment__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:4982:1: ( ( rule__Assignment__Group_1_0_0__0 ) )
            // InternalPortugol.g:4983:2: ( rule__Assignment__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:4984:2: ( rule__Assignment__Group_1_0_0__0 )
            // InternalPortugol.g:4984:3: rule__Assignment__Group_1_0_0__0
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
    // InternalPortugol.g:4993:1: rule__Assignment__Group_1_0_0__0 : rule__Assignment__Group_1_0_0__0__Impl rule__Assignment__Group_1_0_0__1 ;
    public final void rule__Assignment__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4997:1: ( rule__Assignment__Group_1_0_0__0__Impl rule__Assignment__Group_1_0_0__1 )
            // InternalPortugol.g:4998:2: rule__Assignment__Group_1_0_0__0__Impl rule__Assignment__Group_1_0_0__1
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
    // InternalPortugol.g:5005:1: rule__Assignment__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Assignment__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5009:1: ( ( () ) )
            // InternalPortugol.g:5010:1: ( () )
            {
            // InternalPortugol.g:5010:1: ( () )
            // InternalPortugol.g:5011:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:5012:2: ()
            // InternalPortugol.g:5012:3: 
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
    // InternalPortugol.g:5020:1: rule__Assignment__Group_1_0_0__1 : rule__Assignment__Group_1_0_0__1__Impl ;
    public final void rule__Assignment__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5024:1: ( rule__Assignment__Group_1_0_0__1__Impl )
            // InternalPortugol.g:5025:2: rule__Assignment__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:5031:1: rule__Assignment__Group_1_0_0__1__Impl : ( ( rule__Assignment__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__Assignment__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5035:1: ( ( ( rule__Assignment__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:5036:1: ( ( rule__Assignment__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:5036:1: ( ( rule__Assignment__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:5037:2: ( rule__Assignment__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:5038:2: ( rule__Assignment__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:5038:3: rule__Assignment__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:5047:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5051:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalPortugol.g:5052:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
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
    // InternalPortugol.g:5059:1: rule__OrExpression__Group__0__Impl : ( ruleXorExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5063:1: ( ( ruleXorExpression ) )
            // InternalPortugol.g:5064:1: ( ruleXorExpression )
            {
            // InternalPortugol.g:5064:1: ( ruleXorExpression )
            // InternalPortugol.g:5065:2: ruleXorExpression
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
    // InternalPortugol.g:5074:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5078:1: ( rule__OrExpression__Group__1__Impl )
            // InternalPortugol.g:5079:2: rule__OrExpression__Group__1__Impl
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
    // InternalPortugol.g:5085:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5089:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalPortugol.g:5090:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:5090:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalPortugol.g:5091:2: ( rule__OrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:5092:2: ( rule__OrExpression__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==66) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalPortugol.g:5092:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalPortugol.g:5101:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5105:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalPortugol.g:5106:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPortugol.g:5113:1: rule__OrExpression__Group_1__0__Impl : ( ( rule__OrExpression__Group_1_0__0 ) ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5117:1: ( ( ( rule__OrExpression__Group_1_0__0 ) ) )
            // InternalPortugol.g:5118:1: ( ( rule__OrExpression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:5118:1: ( ( rule__OrExpression__Group_1_0__0 ) )
            // InternalPortugol.g:5119:2: ( rule__OrExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:5120:2: ( rule__OrExpression__Group_1_0__0 )
            // InternalPortugol.g:5120:3: rule__OrExpression__Group_1_0__0
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
    // InternalPortugol.g:5128:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5132:1: ( rule__OrExpression__Group_1__1__Impl )
            // InternalPortugol.g:5133:2: rule__OrExpression__Group_1__1__Impl
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
    // InternalPortugol.g:5139:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__RightAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5143:1: ( ( ( rule__OrExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:5144:1: ( ( rule__OrExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:5144:1: ( ( rule__OrExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:5145:2: ( rule__OrExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:5146:2: ( rule__OrExpression__RightAssignment_1_1 )
            // InternalPortugol.g:5146:3: rule__OrExpression__RightAssignment_1_1
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
    // InternalPortugol.g:5155:1: rule__OrExpression__Group_1_0__0 : rule__OrExpression__Group_1_0__0__Impl ;
    public final void rule__OrExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5159:1: ( rule__OrExpression__Group_1_0__0__Impl )
            // InternalPortugol.g:5160:2: rule__OrExpression__Group_1_0__0__Impl
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
    // InternalPortugol.g:5166:1: rule__OrExpression__Group_1_0__0__Impl : ( ( rule__OrExpression__Group_1_0_0__0 ) ) ;
    public final void rule__OrExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5170:1: ( ( ( rule__OrExpression__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:5171:1: ( ( rule__OrExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:5171:1: ( ( rule__OrExpression__Group_1_0_0__0 ) )
            // InternalPortugol.g:5172:2: ( rule__OrExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:5173:2: ( rule__OrExpression__Group_1_0_0__0 )
            // InternalPortugol.g:5173:3: rule__OrExpression__Group_1_0_0__0
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
    // InternalPortugol.g:5182:1: rule__OrExpression__Group_1_0_0__0 : rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1 ;
    public final void rule__OrExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5186:1: ( rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1 )
            // InternalPortugol.g:5187:2: rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1
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
    // InternalPortugol.g:5194:1: rule__OrExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5198:1: ( ( () ) )
            // InternalPortugol.g:5199:1: ( () )
            {
            // InternalPortugol.g:5199:1: ( () )
            // InternalPortugol.g:5200:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:5201:2: ()
            // InternalPortugol.g:5201:3: 
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
    // InternalPortugol.g:5209:1: rule__OrExpression__Group_1_0_0__1 : rule__OrExpression__Group_1_0_0__1__Impl ;
    public final void rule__OrExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5213:1: ( rule__OrExpression__Group_1_0_0__1__Impl )
            // InternalPortugol.g:5214:2: rule__OrExpression__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:5220:1: rule__OrExpression__Group_1_0_0__1__Impl : ( ( rule__OrExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__OrExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5224:1: ( ( ( rule__OrExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:5225:1: ( ( rule__OrExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:5225:1: ( ( rule__OrExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:5226:2: ( rule__OrExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:5227:2: ( rule__OrExpression__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:5227:3: rule__OrExpression__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:5236:1: rule__XorExpression__Group__0 : rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 ;
    public final void rule__XorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5240:1: ( rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 )
            // InternalPortugol.g:5241:2: rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1
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
    // InternalPortugol.g:5248:1: rule__XorExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__XorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5252:1: ( ( ruleAndExpression ) )
            // InternalPortugol.g:5253:1: ( ruleAndExpression )
            {
            // InternalPortugol.g:5253:1: ( ruleAndExpression )
            // InternalPortugol.g:5254:2: ruleAndExpression
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
    // InternalPortugol.g:5263:1: rule__XorExpression__Group__1 : rule__XorExpression__Group__1__Impl ;
    public final void rule__XorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5267:1: ( rule__XorExpression__Group__1__Impl )
            // InternalPortugol.g:5268:2: rule__XorExpression__Group__1__Impl
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
    // InternalPortugol.g:5274:1: rule__XorExpression__Group__1__Impl : ( ( rule__XorExpression__Group_1__0 )* ) ;
    public final void rule__XorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5278:1: ( ( ( rule__XorExpression__Group_1__0 )* ) )
            // InternalPortugol.g:5279:1: ( ( rule__XorExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:5279:1: ( ( rule__XorExpression__Group_1__0 )* )
            // InternalPortugol.g:5280:2: ( rule__XorExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:5281:2: ( rule__XorExpression__Group_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==67) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalPortugol.g:5281:3: rule__XorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__XorExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalPortugol.g:5290:1: rule__XorExpression__Group_1__0 : rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 ;
    public final void rule__XorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5294:1: ( rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 )
            // InternalPortugol.g:5295:2: rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPortugol.g:5302:1: rule__XorExpression__Group_1__0__Impl : ( ( rule__XorExpression__Group_1_0__0 ) ) ;
    public final void rule__XorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5306:1: ( ( ( rule__XorExpression__Group_1_0__0 ) ) )
            // InternalPortugol.g:5307:1: ( ( rule__XorExpression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:5307:1: ( ( rule__XorExpression__Group_1_0__0 ) )
            // InternalPortugol.g:5308:2: ( rule__XorExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:5309:2: ( rule__XorExpression__Group_1_0__0 )
            // InternalPortugol.g:5309:3: rule__XorExpression__Group_1_0__0
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
    // InternalPortugol.g:5317:1: rule__XorExpression__Group_1__1 : rule__XorExpression__Group_1__1__Impl ;
    public final void rule__XorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5321:1: ( rule__XorExpression__Group_1__1__Impl )
            // InternalPortugol.g:5322:2: rule__XorExpression__Group_1__1__Impl
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
    // InternalPortugol.g:5328:1: rule__XorExpression__Group_1__1__Impl : ( ( rule__XorExpression__RightAssignment_1_1 ) ) ;
    public final void rule__XorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5332:1: ( ( ( rule__XorExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:5333:1: ( ( rule__XorExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:5333:1: ( ( rule__XorExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:5334:2: ( rule__XorExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:5335:2: ( rule__XorExpression__RightAssignment_1_1 )
            // InternalPortugol.g:5335:3: rule__XorExpression__RightAssignment_1_1
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
    // InternalPortugol.g:5344:1: rule__XorExpression__Group_1_0__0 : rule__XorExpression__Group_1_0__0__Impl ;
    public final void rule__XorExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5348:1: ( rule__XorExpression__Group_1_0__0__Impl )
            // InternalPortugol.g:5349:2: rule__XorExpression__Group_1_0__0__Impl
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
    // InternalPortugol.g:5355:1: rule__XorExpression__Group_1_0__0__Impl : ( ( rule__XorExpression__Group_1_0_0__0 ) ) ;
    public final void rule__XorExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5359:1: ( ( ( rule__XorExpression__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:5360:1: ( ( rule__XorExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:5360:1: ( ( rule__XorExpression__Group_1_0_0__0 ) )
            // InternalPortugol.g:5361:2: ( rule__XorExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:5362:2: ( rule__XorExpression__Group_1_0_0__0 )
            // InternalPortugol.g:5362:3: rule__XorExpression__Group_1_0_0__0
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
    // InternalPortugol.g:5371:1: rule__XorExpression__Group_1_0_0__0 : rule__XorExpression__Group_1_0_0__0__Impl rule__XorExpression__Group_1_0_0__1 ;
    public final void rule__XorExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5375:1: ( rule__XorExpression__Group_1_0_0__0__Impl rule__XorExpression__Group_1_0_0__1 )
            // InternalPortugol.g:5376:2: rule__XorExpression__Group_1_0_0__0__Impl rule__XorExpression__Group_1_0_0__1
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
    // InternalPortugol.g:5383:1: rule__XorExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__XorExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5387:1: ( ( () ) )
            // InternalPortugol.g:5388:1: ( () )
            {
            // InternalPortugol.g:5388:1: ( () )
            // InternalPortugol.g:5389:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:5390:2: ()
            // InternalPortugol.g:5390:3: 
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
    // InternalPortugol.g:5398:1: rule__XorExpression__Group_1_0_0__1 : rule__XorExpression__Group_1_0_0__1__Impl ;
    public final void rule__XorExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5402:1: ( rule__XorExpression__Group_1_0_0__1__Impl )
            // InternalPortugol.g:5403:2: rule__XorExpression__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:5409:1: rule__XorExpression__Group_1_0_0__1__Impl : ( ( rule__XorExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__XorExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5413:1: ( ( ( rule__XorExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:5414:1: ( ( rule__XorExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:5414:1: ( ( rule__XorExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:5415:2: ( rule__XorExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:5416:2: ( rule__XorExpression__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:5416:3: rule__XorExpression__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:5425:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5429:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalPortugol.g:5430:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
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
    // InternalPortugol.g:5437:1: rule__AndExpression__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5441:1: ( ( ruleComparison ) )
            // InternalPortugol.g:5442:1: ( ruleComparison )
            {
            // InternalPortugol.g:5442:1: ( ruleComparison )
            // InternalPortugol.g:5443:2: ruleComparison
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
    // InternalPortugol.g:5452:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5456:1: ( rule__AndExpression__Group__1__Impl )
            // InternalPortugol.g:5457:2: rule__AndExpression__Group__1__Impl
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
    // InternalPortugol.g:5463:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5467:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalPortugol.g:5468:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:5468:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalPortugol.g:5469:2: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:5470:2: ( rule__AndExpression__Group_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=19 && LA44_0<=20)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalPortugol.g:5470:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalPortugol.g:5479:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5483:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalPortugol.g:5484:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPortugol.g:5491:1: rule__AndExpression__Group_1__0__Impl : ( ( rule__AndExpression__Group_1_0__0 ) ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5495:1: ( ( ( rule__AndExpression__Group_1_0__0 ) ) )
            // InternalPortugol.g:5496:1: ( ( rule__AndExpression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:5496:1: ( ( rule__AndExpression__Group_1_0__0 ) )
            // InternalPortugol.g:5497:2: ( rule__AndExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:5498:2: ( rule__AndExpression__Group_1_0__0 )
            // InternalPortugol.g:5498:3: rule__AndExpression__Group_1_0__0
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
    // InternalPortugol.g:5506:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5510:1: ( rule__AndExpression__Group_1__1__Impl )
            // InternalPortugol.g:5511:2: rule__AndExpression__Group_1__1__Impl
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
    // InternalPortugol.g:5517:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__RightAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5521:1: ( ( ( rule__AndExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:5522:1: ( ( rule__AndExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:5522:1: ( ( rule__AndExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:5523:2: ( rule__AndExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:5524:2: ( rule__AndExpression__RightAssignment_1_1 )
            // InternalPortugol.g:5524:3: rule__AndExpression__RightAssignment_1_1
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
    // InternalPortugol.g:5533:1: rule__AndExpression__Group_1_0__0 : rule__AndExpression__Group_1_0__0__Impl ;
    public final void rule__AndExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5537:1: ( rule__AndExpression__Group_1_0__0__Impl )
            // InternalPortugol.g:5538:2: rule__AndExpression__Group_1_0__0__Impl
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
    // InternalPortugol.g:5544:1: rule__AndExpression__Group_1_0__0__Impl : ( ( rule__AndExpression__Group_1_0_0__0 ) ) ;
    public final void rule__AndExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5548:1: ( ( ( rule__AndExpression__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:5549:1: ( ( rule__AndExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:5549:1: ( ( rule__AndExpression__Group_1_0_0__0 ) )
            // InternalPortugol.g:5550:2: ( rule__AndExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:5551:2: ( rule__AndExpression__Group_1_0_0__0 )
            // InternalPortugol.g:5551:3: rule__AndExpression__Group_1_0_0__0
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
    // InternalPortugol.g:5560:1: rule__AndExpression__Group_1_0_0__0 : rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1 ;
    public final void rule__AndExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5564:1: ( rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1 )
            // InternalPortugol.g:5565:2: rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1
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
    // InternalPortugol.g:5572:1: rule__AndExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5576:1: ( ( () ) )
            // InternalPortugol.g:5577:1: ( () )
            {
            // InternalPortugol.g:5577:1: ( () )
            // InternalPortugol.g:5578:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:5579:2: ()
            // InternalPortugol.g:5579:3: 
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
    // InternalPortugol.g:5587:1: rule__AndExpression__Group_1_0_0__1 : rule__AndExpression__Group_1_0_0__1__Impl ;
    public final void rule__AndExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5591:1: ( rule__AndExpression__Group_1_0_0__1__Impl )
            // InternalPortugol.g:5592:2: rule__AndExpression__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:5598:1: rule__AndExpression__Group_1_0_0__1__Impl : ( ( rule__AndExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__AndExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5602:1: ( ( ( rule__AndExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:5603:1: ( ( rule__AndExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:5603:1: ( ( rule__AndExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:5604:2: ( rule__AndExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:5605:2: ( rule__AndExpression__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:5605:3: rule__AndExpression__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:5614:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5618:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalPortugol.g:5619:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
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
    // InternalPortugol.g:5626:1: rule__Comparison__Group__0__Impl : ( ruleEquExpression ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5630:1: ( ( ruleEquExpression ) )
            // InternalPortugol.g:5631:1: ( ruleEquExpression )
            {
            // InternalPortugol.g:5631:1: ( ruleEquExpression )
            // InternalPortugol.g:5632:2: ruleEquExpression
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
    // InternalPortugol.g:5641:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5645:1: ( rule__Comparison__Group__1__Impl )
            // InternalPortugol.g:5646:2: rule__Comparison__Group__1__Impl
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
    // InternalPortugol.g:5652:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5656:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalPortugol.g:5657:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalPortugol.g:5657:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalPortugol.g:5658:2: ( rule__Comparison__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1()); 
            }
            // InternalPortugol.g:5659:2: ( rule__Comparison__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=21 && LA45_0<=22)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalPortugol.g:5659:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalPortugol.g:5668:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5672:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalPortugol.g:5673:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPortugol.g:5680:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Group_1_0__0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5684:1: ( ( ( rule__Comparison__Group_1_0__0 ) ) )
            // InternalPortugol.g:5685:1: ( ( rule__Comparison__Group_1_0__0 ) )
            {
            // InternalPortugol.g:5685:1: ( ( rule__Comparison__Group_1_0__0 ) )
            // InternalPortugol.g:5686:2: ( rule__Comparison__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:5687:2: ( rule__Comparison__Group_1_0__0 )
            // InternalPortugol.g:5687:3: rule__Comparison__Group_1_0__0
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
    // InternalPortugol.g:5695:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5699:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalPortugol.g:5700:2: rule__Comparison__Group_1__1__Impl
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
    // InternalPortugol.g:5706:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5710:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:5711:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:5711:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // InternalPortugol.g:5712:2: ( rule__Comparison__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:5713:2: ( rule__Comparison__RightAssignment_1_1 )
            // InternalPortugol.g:5713:3: rule__Comparison__RightAssignment_1_1
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
    // InternalPortugol.g:5722:1: rule__Comparison__Group_1_0__0 : rule__Comparison__Group_1_0__0__Impl ;
    public final void rule__Comparison__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5726:1: ( rule__Comparison__Group_1_0__0__Impl )
            // InternalPortugol.g:5727:2: rule__Comparison__Group_1_0__0__Impl
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
    // InternalPortugol.g:5733:1: rule__Comparison__Group_1_0__0__Impl : ( ( rule__Comparison__Group_1_0_0__0 ) ) ;
    public final void rule__Comparison__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5737:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:5738:1: ( ( rule__Comparison__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:5738:1: ( ( rule__Comparison__Group_1_0_0__0 ) )
            // InternalPortugol.g:5739:2: ( rule__Comparison__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:5740:2: ( rule__Comparison__Group_1_0_0__0 )
            // InternalPortugol.g:5740:3: rule__Comparison__Group_1_0_0__0
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
    // InternalPortugol.g:5749:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5753:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalPortugol.g:5754:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
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
    // InternalPortugol.g:5761:1: rule__Comparison__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5765:1: ( ( () ) )
            // InternalPortugol.g:5766:1: ( () )
            {
            // InternalPortugol.g:5766:1: ( () )
            // InternalPortugol.g:5767:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:5768:2: ()
            // InternalPortugol.g:5768:3: 
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
    // InternalPortugol.g:5776:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5780:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalPortugol.g:5781:2: rule__Comparison__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:5787:1: rule__Comparison__Group_1_0_0__1__Impl : ( ( rule__Comparison__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5791:1: ( ( ( rule__Comparison__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:5792:1: ( ( rule__Comparison__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:5792:1: ( ( rule__Comparison__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:5793:2: ( rule__Comparison__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:5794:2: ( rule__Comparison__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:5794:3: rule__Comparison__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:5803:1: rule__EquExpression__Group__0 : rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1 ;
    public final void rule__EquExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5807:1: ( rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1 )
            // InternalPortugol.g:5808:2: rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1
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
    // InternalPortugol.g:5815:1: rule__EquExpression__Group__0__Impl : ( ruleAddExpression ) ;
    public final void rule__EquExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5819:1: ( ( ruleAddExpression ) )
            // InternalPortugol.g:5820:1: ( ruleAddExpression )
            {
            // InternalPortugol.g:5820:1: ( ruleAddExpression )
            // InternalPortugol.g:5821:2: ruleAddExpression
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
    // InternalPortugol.g:5830:1: rule__EquExpression__Group__1 : rule__EquExpression__Group__1__Impl ;
    public final void rule__EquExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5834:1: ( rule__EquExpression__Group__1__Impl )
            // InternalPortugol.g:5835:2: rule__EquExpression__Group__1__Impl
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
    // InternalPortugol.g:5841:1: rule__EquExpression__Group__1__Impl : ( ( rule__EquExpression__Group_1__0 )* ) ;
    public final void rule__EquExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5845:1: ( ( ( rule__EquExpression__Group_1__0 )* ) )
            // InternalPortugol.g:5846:1: ( ( rule__EquExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:5846:1: ( ( rule__EquExpression__Group_1__0 )* )
            // InternalPortugol.g:5847:2: ( rule__EquExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:5848:2: ( rule__EquExpression__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=23 && LA46_0<=26)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalPortugol.g:5848:3: rule__EquExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__EquExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalPortugol.g:5857:1: rule__EquExpression__Group_1__0 : rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1 ;
    public final void rule__EquExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5861:1: ( rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1 )
            // InternalPortugol.g:5862:2: rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPortugol.g:5869:1: rule__EquExpression__Group_1__0__Impl : ( ( rule__EquExpression__Group_1_0__0 ) ) ;
    public final void rule__EquExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5873:1: ( ( ( rule__EquExpression__Group_1_0__0 ) ) )
            // InternalPortugol.g:5874:1: ( ( rule__EquExpression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:5874:1: ( ( rule__EquExpression__Group_1_0__0 ) )
            // InternalPortugol.g:5875:2: ( rule__EquExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:5876:2: ( rule__EquExpression__Group_1_0__0 )
            // InternalPortugol.g:5876:3: rule__EquExpression__Group_1_0__0
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
    // InternalPortugol.g:5884:1: rule__EquExpression__Group_1__1 : rule__EquExpression__Group_1__1__Impl ;
    public final void rule__EquExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5888:1: ( rule__EquExpression__Group_1__1__Impl )
            // InternalPortugol.g:5889:2: rule__EquExpression__Group_1__1__Impl
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
    // InternalPortugol.g:5895:1: rule__EquExpression__Group_1__1__Impl : ( ( rule__EquExpression__RightAssignment_1_1 ) ) ;
    public final void rule__EquExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5899:1: ( ( ( rule__EquExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:5900:1: ( ( rule__EquExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:5900:1: ( ( rule__EquExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:5901:2: ( rule__EquExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:5902:2: ( rule__EquExpression__RightAssignment_1_1 )
            // InternalPortugol.g:5902:3: rule__EquExpression__RightAssignment_1_1
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
    // InternalPortugol.g:5911:1: rule__EquExpression__Group_1_0__0 : rule__EquExpression__Group_1_0__0__Impl ;
    public final void rule__EquExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5915:1: ( rule__EquExpression__Group_1_0__0__Impl )
            // InternalPortugol.g:5916:2: rule__EquExpression__Group_1_0__0__Impl
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
    // InternalPortugol.g:5922:1: rule__EquExpression__Group_1_0__0__Impl : ( ( rule__EquExpression__Group_1_0_0__0 ) ) ;
    public final void rule__EquExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5926:1: ( ( ( rule__EquExpression__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:5927:1: ( ( rule__EquExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:5927:1: ( ( rule__EquExpression__Group_1_0_0__0 ) )
            // InternalPortugol.g:5928:2: ( rule__EquExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:5929:2: ( rule__EquExpression__Group_1_0_0__0 )
            // InternalPortugol.g:5929:3: rule__EquExpression__Group_1_0_0__0
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
    // InternalPortugol.g:5938:1: rule__EquExpression__Group_1_0_0__0 : rule__EquExpression__Group_1_0_0__0__Impl rule__EquExpression__Group_1_0_0__1 ;
    public final void rule__EquExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5942:1: ( rule__EquExpression__Group_1_0_0__0__Impl rule__EquExpression__Group_1_0_0__1 )
            // InternalPortugol.g:5943:2: rule__EquExpression__Group_1_0_0__0__Impl rule__EquExpression__Group_1_0_0__1
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
    // InternalPortugol.g:5950:1: rule__EquExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__EquExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5954:1: ( ( () ) )
            // InternalPortugol.g:5955:1: ( () )
            {
            // InternalPortugol.g:5955:1: ( () )
            // InternalPortugol.g:5956:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:5957:2: ()
            // InternalPortugol.g:5957:3: 
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
    // InternalPortugol.g:5965:1: rule__EquExpression__Group_1_0_0__1 : rule__EquExpression__Group_1_0_0__1__Impl ;
    public final void rule__EquExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5969:1: ( rule__EquExpression__Group_1_0_0__1__Impl )
            // InternalPortugol.g:5970:2: rule__EquExpression__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:5976:1: rule__EquExpression__Group_1_0_0__1__Impl : ( ( rule__EquExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__EquExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5980:1: ( ( ( rule__EquExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:5981:1: ( ( rule__EquExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:5981:1: ( ( rule__EquExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:5982:2: ( rule__EquExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:5983:2: ( rule__EquExpression__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:5983:3: rule__EquExpression__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:5992:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5996:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // InternalPortugol.g:5997:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
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
    // InternalPortugol.g:6004:1: rule__AddExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6008:1: ( ( ruleMultiplicativeExpression ) )
            // InternalPortugol.g:6009:1: ( ruleMultiplicativeExpression )
            {
            // InternalPortugol.g:6009:1: ( ruleMultiplicativeExpression )
            // InternalPortugol.g:6010:2: ruleMultiplicativeExpression
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
    // InternalPortugol.g:6019:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6023:1: ( rule__AddExpression__Group__1__Impl )
            // InternalPortugol.g:6024:2: rule__AddExpression__Group__1__Impl
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
    // InternalPortugol.g:6030:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6034:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // InternalPortugol.g:6035:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:6035:1: ( ( rule__AddExpression__Group_1__0 )* )
            // InternalPortugol.g:6036:2: ( rule__AddExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:6037:2: ( rule__AddExpression__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=27 && LA47_0<=28)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalPortugol.g:6037:3: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__AddExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalPortugol.g:6046:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6050:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // InternalPortugol.g:6051:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPortugol.g:6058:1: rule__AddExpression__Group_1__0__Impl : ( ( rule__AddExpression__Group_1_0__0 ) ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6062:1: ( ( ( rule__AddExpression__Group_1_0__0 ) ) )
            // InternalPortugol.g:6063:1: ( ( rule__AddExpression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:6063:1: ( ( rule__AddExpression__Group_1_0__0 ) )
            // InternalPortugol.g:6064:2: ( rule__AddExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:6065:2: ( rule__AddExpression__Group_1_0__0 )
            // InternalPortugol.g:6065:3: rule__AddExpression__Group_1_0__0
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
    // InternalPortugol.g:6073:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6077:1: ( rule__AddExpression__Group_1__1__Impl )
            // InternalPortugol.g:6078:2: rule__AddExpression__Group_1__1__Impl
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
    // InternalPortugol.g:6084:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__RightAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6088:1: ( ( ( rule__AddExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:6089:1: ( ( rule__AddExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:6089:1: ( ( rule__AddExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:6090:2: ( rule__AddExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:6091:2: ( rule__AddExpression__RightAssignment_1_1 )
            // InternalPortugol.g:6091:3: rule__AddExpression__RightAssignment_1_1
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
    // InternalPortugol.g:6100:1: rule__AddExpression__Group_1_0__0 : rule__AddExpression__Group_1_0__0__Impl ;
    public final void rule__AddExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6104:1: ( rule__AddExpression__Group_1_0__0__Impl )
            // InternalPortugol.g:6105:2: rule__AddExpression__Group_1_0__0__Impl
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
    // InternalPortugol.g:6111:1: rule__AddExpression__Group_1_0__0__Impl : ( ( rule__AddExpression__Group_1_0_0__0 ) ) ;
    public final void rule__AddExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6115:1: ( ( ( rule__AddExpression__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:6116:1: ( ( rule__AddExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:6116:1: ( ( rule__AddExpression__Group_1_0_0__0 ) )
            // InternalPortugol.g:6117:2: ( rule__AddExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:6118:2: ( rule__AddExpression__Group_1_0_0__0 )
            // InternalPortugol.g:6118:3: rule__AddExpression__Group_1_0_0__0
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
    // InternalPortugol.g:6127:1: rule__AddExpression__Group_1_0_0__0 : rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1 ;
    public final void rule__AddExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6131:1: ( rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1 )
            // InternalPortugol.g:6132:2: rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1
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
    // InternalPortugol.g:6139:1: rule__AddExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6143:1: ( ( () ) )
            // InternalPortugol.g:6144:1: ( () )
            {
            // InternalPortugol.g:6144:1: ( () )
            // InternalPortugol.g:6145:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:6146:2: ()
            // InternalPortugol.g:6146:3: 
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
    // InternalPortugol.g:6154:1: rule__AddExpression__Group_1_0_0__1 : rule__AddExpression__Group_1_0_0__1__Impl ;
    public final void rule__AddExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6158:1: ( rule__AddExpression__Group_1_0_0__1__Impl )
            // InternalPortugol.g:6159:2: rule__AddExpression__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:6165:1: rule__AddExpression__Group_1_0_0__1__Impl : ( ( rule__AddExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__AddExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6169:1: ( ( ( rule__AddExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:6170:1: ( ( rule__AddExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:6170:1: ( ( rule__AddExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:6171:2: ( rule__AddExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:6172:2: ( rule__AddExpression__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:6172:3: rule__AddExpression__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:6181:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6185:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalPortugol.g:6186:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
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
    // InternalPortugol.g:6193:1: rule__MultiplicativeExpression__Group__0__Impl : ( rulePowerExpression ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6197:1: ( ( rulePowerExpression ) )
            // InternalPortugol.g:6198:1: ( rulePowerExpression )
            {
            // InternalPortugol.g:6198:1: ( rulePowerExpression )
            // InternalPortugol.g:6199:2: rulePowerExpression
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
    // InternalPortugol.g:6208:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6212:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalPortugol.g:6213:2: rule__MultiplicativeExpression__Group__1__Impl
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
    // InternalPortugol.g:6219:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6223:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalPortugol.g:6224:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:6224:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalPortugol.g:6225:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:6226:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=29 && LA48_0<=32)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalPortugol.g:6226:3: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalPortugol.g:6235:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6239:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalPortugol.g:6240:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPortugol.g:6247:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( ( rule__MultiplicativeExpression__Group_1_0__0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6251:1: ( ( ( rule__MultiplicativeExpression__Group_1_0__0 ) ) )
            // InternalPortugol.g:6252:1: ( ( rule__MultiplicativeExpression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:6252:1: ( ( rule__MultiplicativeExpression__Group_1_0__0 ) )
            // InternalPortugol.g:6253:2: ( rule__MultiplicativeExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:6254:2: ( rule__MultiplicativeExpression__Group_1_0__0 )
            // InternalPortugol.g:6254:3: rule__MultiplicativeExpression__Group_1_0__0
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
    // InternalPortugol.g:6262:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6266:1: ( rule__MultiplicativeExpression__Group_1__1__Impl )
            // InternalPortugol.g:6267:2: rule__MultiplicativeExpression__Group_1__1__Impl
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
    // InternalPortugol.g:6273:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6277:1: ( ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:6278:1: ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:6278:1: ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:6279:2: ( rule__MultiplicativeExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:6280:2: ( rule__MultiplicativeExpression__RightAssignment_1_1 )
            // InternalPortugol.g:6280:3: rule__MultiplicativeExpression__RightAssignment_1_1
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
    // InternalPortugol.g:6289:1: rule__MultiplicativeExpression__Group_1_0__0 : rule__MultiplicativeExpression__Group_1_0__0__Impl ;
    public final void rule__MultiplicativeExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6293:1: ( rule__MultiplicativeExpression__Group_1_0__0__Impl )
            // InternalPortugol.g:6294:2: rule__MultiplicativeExpression__Group_1_0__0__Impl
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
    // InternalPortugol.g:6300:1: rule__MultiplicativeExpression__Group_1_0__0__Impl : ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6304:1: ( ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:6305:1: ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:6305:1: ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) )
            // InternalPortugol.g:6306:2: ( rule__MultiplicativeExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:6307:2: ( rule__MultiplicativeExpression__Group_1_0_0__0 )
            // InternalPortugol.g:6307:3: rule__MultiplicativeExpression__Group_1_0_0__0
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
    // InternalPortugol.g:6316:1: rule__MultiplicativeExpression__Group_1_0_0__0 : rule__MultiplicativeExpression__Group_1_0_0__0__Impl rule__MultiplicativeExpression__Group_1_0_0__1 ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6320:1: ( rule__MultiplicativeExpression__Group_1_0_0__0__Impl rule__MultiplicativeExpression__Group_1_0_0__1 )
            // InternalPortugol.g:6321:2: rule__MultiplicativeExpression__Group_1_0_0__0__Impl rule__MultiplicativeExpression__Group_1_0_0__1
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
    // InternalPortugol.g:6328:1: rule__MultiplicativeExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6332:1: ( ( () ) )
            // InternalPortugol.g:6333:1: ( () )
            {
            // InternalPortugol.g:6333:1: ( () )
            // InternalPortugol.g:6334:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:6335:2: ()
            // InternalPortugol.g:6335:3: 
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
    // InternalPortugol.g:6343:1: rule__MultiplicativeExpression__Group_1_0_0__1 : rule__MultiplicativeExpression__Group_1_0_0__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6347:1: ( rule__MultiplicativeExpression__Group_1_0_0__1__Impl )
            // InternalPortugol.g:6348:2: rule__MultiplicativeExpression__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:6354:1: rule__MultiplicativeExpression__Group_1_0_0__1__Impl : ( ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6358:1: ( ( ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:6359:1: ( ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:6359:1: ( ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:6360:2: ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:6361:2: ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:6361:3: rule__MultiplicativeExpression__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:6370:1: rule__PowerExpression__Group__0 : rule__PowerExpression__Group__0__Impl rule__PowerExpression__Group__1 ;
    public final void rule__PowerExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6374:1: ( rule__PowerExpression__Group__0__Impl rule__PowerExpression__Group__1 )
            // InternalPortugol.g:6375:2: rule__PowerExpression__Group__0__Impl rule__PowerExpression__Group__1
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
    // InternalPortugol.g:6382:1: rule__PowerExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__PowerExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6386:1: ( ( ruleUnaryExpression ) )
            // InternalPortugol.g:6387:1: ( ruleUnaryExpression )
            {
            // InternalPortugol.g:6387:1: ( ruleUnaryExpression )
            // InternalPortugol.g:6388:2: ruleUnaryExpression
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
    // InternalPortugol.g:6397:1: rule__PowerExpression__Group__1 : rule__PowerExpression__Group__1__Impl ;
    public final void rule__PowerExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6401:1: ( rule__PowerExpression__Group__1__Impl )
            // InternalPortugol.g:6402:2: rule__PowerExpression__Group__1__Impl
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
    // InternalPortugol.g:6408:1: rule__PowerExpression__Group__1__Impl : ( ( rule__PowerExpression__Group_1__0 )* ) ;
    public final void rule__PowerExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6412:1: ( ( ( rule__PowerExpression__Group_1__0 )* ) )
            // InternalPortugol.g:6413:1: ( ( rule__PowerExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:6413:1: ( ( rule__PowerExpression__Group_1__0 )* )
            // InternalPortugol.g:6414:2: ( rule__PowerExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:6415:2: ( rule__PowerExpression__Group_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==68) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalPortugol.g:6415:3: rule__PowerExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__PowerExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalPortugol.g:6424:1: rule__PowerExpression__Group_1__0 : rule__PowerExpression__Group_1__0__Impl rule__PowerExpression__Group_1__1 ;
    public final void rule__PowerExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6428:1: ( rule__PowerExpression__Group_1__0__Impl rule__PowerExpression__Group_1__1 )
            // InternalPortugol.g:6429:2: rule__PowerExpression__Group_1__0__Impl rule__PowerExpression__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPortugol.g:6436:1: rule__PowerExpression__Group_1__0__Impl : ( ( rule__PowerExpression__Group_1_0__0 ) ) ;
    public final void rule__PowerExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6440:1: ( ( ( rule__PowerExpression__Group_1_0__0 ) ) )
            // InternalPortugol.g:6441:1: ( ( rule__PowerExpression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:6441:1: ( ( rule__PowerExpression__Group_1_0__0 ) )
            // InternalPortugol.g:6442:2: ( rule__PowerExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:6443:2: ( rule__PowerExpression__Group_1_0__0 )
            // InternalPortugol.g:6443:3: rule__PowerExpression__Group_1_0__0
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
    // InternalPortugol.g:6451:1: rule__PowerExpression__Group_1__1 : rule__PowerExpression__Group_1__1__Impl ;
    public final void rule__PowerExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6455:1: ( rule__PowerExpression__Group_1__1__Impl )
            // InternalPortugol.g:6456:2: rule__PowerExpression__Group_1__1__Impl
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
    // InternalPortugol.g:6462:1: rule__PowerExpression__Group_1__1__Impl : ( ( rule__PowerExpression__RightAssignment_1_1 ) ) ;
    public final void rule__PowerExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6466:1: ( ( ( rule__PowerExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:6467:1: ( ( rule__PowerExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:6467:1: ( ( rule__PowerExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:6468:2: ( rule__PowerExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:6469:2: ( rule__PowerExpression__RightAssignment_1_1 )
            // InternalPortugol.g:6469:3: rule__PowerExpression__RightAssignment_1_1
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
    // InternalPortugol.g:6478:1: rule__PowerExpression__Group_1_0__0 : rule__PowerExpression__Group_1_0__0__Impl ;
    public final void rule__PowerExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6482:1: ( rule__PowerExpression__Group_1_0__0__Impl )
            // InternalPortugol.g:6483:2: rule__PowerExpression__Group_1_0__0__Impl
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
    // InternalPortugol.g:6489:1: rule__PowerExpression__Group_1_0__0__Impl : ( ( rule__PowerExpression__Group_1_0_0__0 ) ) ;
    public final void rule__PowerExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6493:1: ( ( ( rule__PowerExpression__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:6494:1: ( ( rule__PowerExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:6494:1: ( ( rule__PowerExpression__Group_1_0_0__0 ) )
            // InternalPortugol.g:6495:2: ( rule__PowerExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:6496:2: ( rule__PowerExpression__Group_1_0_0__0 )
            // InternalPortugol.g:6496:3: rule__PowerExpression__Group_1_0_0__0
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
    // InternalPortugol.g:6505:1: rule__PowerExpression__Group_1_0_0__0 : rule__PowerExpression__Group_1_0_0__0__Impl rule__PowerExpression__Group_1_0_0__1 ;
    public final void rule__PowerExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6509:1: ( rule__PowerExpression__Group_1_0_0__0__Impl rule__PowerExpression__Group_1_0_0__1 )
            // InternalPortugol.g:6510:2: rule__PowerExpression__Group_1_0_0__0__Impl rule__PowerExpression__Group_1_0_0__1
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
    // InternalPortugol.g:6517:1: rule__PowerExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PowerExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6521:1: ( ( () ) )
            // InternalPortugol.g:6522:1: ( () )
            {
            // InternalPortugol.g:6522:1: ( () )
            // InternalPortugol.g:6523:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:6524:2: ()
            // InternalPortugol.g:6524:3: 
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
    // InternalPortugol.g:6532:1: rule__PowerExpression__Group_1_0_0__1 : rule__PowerExpression__Group_1_0_0__1__Impl ;
    public final void rule__PowerExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6536:1: ( rule__PowerExpression__Group_1_0_0__1__Impl )
            // InternalPortugol.g:6537:2: rule__PowerExpression__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:6543:1: rule__PowerExpression__Group_1_0_0__1__Impl : ( ( rule__PowerExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__PowerExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6547:1: ( ( ( rule__PowerExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:6548:1: ( ( rule__PowerExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:6548:1: ( ( rule__PowerExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:6549:2: ( rule__PowerExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:6550:2: ( rule__PowerExpression__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:6550:3: rule__PowerExpression__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:6559:1: rule__UnaryExpression__Group_0__0 : rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 ;
    public final void rule__UnaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6563:1: ( rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 )
            // InternalPortugol.g:6564:2: rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1
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
    // InternalPortugol.g:6571:1: rule__UnaryExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6575:1: ( ( () ) )
            // InternalPortugol.g:6576:1: ( () )
            {
            // InternalPortugol.g:6576:1: ( () )
            // InternalPortugol.g:6577:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_0_0()); 
            }
            // InternalPortugol.g:6578:2: ()
            // InternalPortugol.g:6578:3: 
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
    // InternalPortugol.g:6586:1: rule__UnaryExpression__Group_0__1 : rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 ;
    public final void rule__UnaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6590:1: ( rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 )
            // InternalPortugol.g:6591:2: rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalPortugol.g:6598:1: rule__UnaryExpression__Group_0__1__Impl : ( ( rule__UnaryExpression__OpAssignment_0_1 ) ) ;
    public final void rule__UnaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6602:1: ( ( ( rule__UnaryExpression__OpAssignment_0_1 ) ) )
            // InternalPortugol.g:6603:1: ( ( rule__UnaryExpression__OpAssignment_0_1 ) )
            {
            // InternalPortugol.g:6603:1: ( ( rule__UnaryExpression__OpAssignment_0_1 ) )
            // InternalPortugol.g:6604:2: ( rule__UnaryExpression__OpAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOpAssignment_0_1()); 
            }
            // InternalPortugol.g:6605:2: ( rule__UnaryExpression__OpAssignment_0_1 )
            // InternalPortugol.g:6605:3: rule__UnaryExpression__OpAssignment_0_1
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
    // InternalPortugol.g:6613:1: rule__UnaryExpression__Group_0__2 : rule__UnaryExpression__Group_0__2__Impl ;
    public final void rule__UnaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6617:1: ( rule__UnaryExpression__Group_0__2__Impl )
            // InternalPortugol.g:6618:2: rule__UnaryExpression__Group_0__2__Impl
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
    // InternalPortugol.g:6624:1: rule__UnaryExpression__Group_0__2__Impl : ( ( rule__UnaryExpression__OperandAssignment_0_2 ) ) ;
    public final void rule__UnaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6628:1: ( ( ( rule__UnaryExpression__OperandAssignment_0_2 ) ) )
            // InternalPortugol.g:6629:1: ( ( rule__UnaryExpression__OperandAssignment_0_2 ) )
            {
            // InternalPortugol.g:6629:1: ( ( rule__UnaryExpression__OperandAssignment_0_2 ) )
            // InternalPortugol.g:6630:2: ( rule__UnaryExpression__OperandAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_0_2()); 
            }
            // InternalPortugol.g:6631:2: ( rule__UnaryExpression__OperandAssignment_0_2 )
            // InternalPortugol.g:6631:3: rule__UnaryExpression__OperandAssignment_0_2
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
    // InternalPortugol.g:6640:1: rule__PrimaryExpression__Group_3__0 : rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 ;
    public final void rule__PrimaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6644:1: ( rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 )
            // InternalPortugol.g:6645:2: rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPortugol.g:6652:1: rule__PrimaryExpression__Group_3__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6656:1: ( ( '(' ) )
            // InternalPortugol.g:6657:1: ( '(' )
            {
            // InternalPortugol.g:6657:1: ( '(' )
            // InternalPortugol.g:6658:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:6667:1: rule__PrimaryExpression__Group_3__1 : rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2 ;
    public final void rule__PrimaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6671:1: ( rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2 )
            // InternalPortugol.g:6672:2: rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2
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
    // InternalPortugol.g:6679:1: rule__PrimaryExpression__Group_3__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6683:1: ( ( ruleExpression ) )
            // InternalPortugol.g:6684:1: ( ruleExpression )
            {
            // InternalPortugol.g:6684:1: ( ruleExpression )
            // InternalPortugol.g:6685:2: ruleExpression
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
    // InternalPortugol.g:6694:1: rule__PrimaryExpression__Group_3__2 : rule__PrimaryExpression__Group_3__2__Impl ;
    public final void rule__PrimaryExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6698:1: ( rule__PrimaryExpression__Group_3__2__Impl )
            // InternalPortugol.g:6699:2: rule__PrimaryExpression__Group_3__2__Impl
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
    // InternalPortugol.g:6705:1: rule__PrimaryExpression__Group_3__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6709:1: ( ( ')' ) )
            // InternalPortugol.g:6710:1: ( ')' )
            {
            // InternalPortugol.g:6710:1: ( ')' )
            // InternalPortugol.g:6711:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:6721:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6725:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalPortugol.g:6726:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
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
    // InternalPortugol.g:6733:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__FbNameAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6737:1: ( ( ( rule__FunctionCall__FbNameAssignment_0 ) ) )
            // InternalPortugol.g:6738:1: ( ( rule__FunctionCall__FbNameAssignment_0 ) )
            {
            // InternalPortugol.g:6738:1: ( ( rule__FunctionCall__FbNameAssignment_0 ) )
            // InternalPortugol.g:6739:2: ( rule__FunctionCall__FbNameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFbNameAssignment_0()); 
            }
            // InternalPortugol.g:6740:2: ( rule__FunctionCall__FbNameAssignment_0 )
            // InternalPortugol.g:6740:3: rule__FunctionCall__FbNameAssignment_0
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
    // InternalPortugol.g:6748:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6752:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // InternalPortugol.g:6753:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalPortugol.g:6760:1: rule__FunctionCall__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6764:1: ( ( '(' ) )
            // InternalPortugol.g:6765:1: ( '(' )
            {
            // InternalPortugol.g:6765:1: ( '(' )
            // InternalPortugol.g:6766:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:6775:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6779:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // InternalPortugol.g:6780:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
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
    // InternalPortugol.g:6787:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__ParamAssignment_2 ) ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6791:1: ( ( ( rule__FunctionCall__ParamAssignment_2 ) ) )
            // InternalPortugol.g:6792:1: ( ( rule__FunctionCall__ParamAssignment_2 ) )
            {
            // InternalPortugol.g:6792:1: ( ( rule__FunctionCall__ParamAssignment_2 ) )
            // InternalPortugol.g:6793:2: ( rule__FunctionCall__ParamAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParamAssignment_2()); 
            }
            // InternalPortugol.g:6794:2: ( rule__FunctionCall__ParamAssignment_2 )
            // InternalPortugol.g:6794:3: rule__FunctionCall__ParamAssignment_2
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
    // InternalPortugol.g:6802:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6806:1: ( rule__FunctionCall__Group__3__Impl )
            // InternalPortugol.g:6807:2: rule__FunctionCall__Group__3__Impl
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
    // InternalPortugol.g:6813:1: rule__FunctionCall__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6817:1: ( ( ')' ) )
            // InternalPortugol.g:6818:1: ( ')' )
            {
            // InternalPortugol.g:6818:1: ( ')' )
            // InternalPortugol.g:6819:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:6829:1: rule__Model__HeaderAssignment_0 : ( ruleHeaderBlock ) ;
    public final void rule__Model__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6833:1: ( ( ruleHeaderBlock ) )
            // InternalPortugol.g:6834:2: ( ruleHeaderBlock )
            {
            // InternalPortugol.g:6834:2: ( ruleHeaderBlock )
            // InternalPortugol.g:6835:3: ruleHeaderBlock
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
    // InternalPortugol.g:6844:1: rule__Model__GlobalDeclarationsAssignment_1 : ( ruleDeclarationsBlock ) ;
    public final void rule__Model__GlobalDeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6848:1: ( ( ruleDeclarationsBlock ) )
            // InternalPortugol.g:6849:2: ( ruleDeclarationsBlock )
            {
            // InternalPortugol.g:6849:2: ( ruleDeclarationsBlock )
            // InternalPortugol.g:6850:3: ruleDeclarationsBlock
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
    // InternalPortugol.g:6859:1: rule__Model__SubprogramsAssignment_2 : ( ruleSubprograms ) ;
    public final void rule__Model__SubprogramsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6863:1: ( ( ruleSubprograms ) )
            // InternalPortugol.g:6864:2: ( ruleSubprograms )
            {
            // InternalPortugol.g:6864:2: ( ruleSubprograms )
            // InternalPortugol.g:6865:3: ruleSubprograms
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
    // InternalPortugol.g:6874:1: rule__Model__CommandsAssignment_3 : ( ruleBlockCommand ) ;
    public final void rule__Model__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6878:1: ( ( ruleBlockCommand ) )
            // InternalPortugol.g:6879:2: ( ruleBlockCommand )
            {
            // InternalPortugol.g:6879:2: ( ruleBlockCommand )
            // InternalPortugol.g:6880:3: ruleBlockCommand
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
    // InternalPortugol.g:6889:1: rule__HeaderBlock__AlgorithmNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__HeaderBlock__AlgorithmNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6893:1: ( ( RULE_STRING ) )
            // InternalPortugol.g:6894:2: ( RULE_STRING )
            {
            // InternalPortugol.g:6894:2: ( RULE_STRING )
            // InternalPortugol.g:6895:3: RULE_STRING
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
    // InternalPortugol.g:6904:1: rule__DeclarationsBlock__VarsAssignment_1_0 : ( ruleVariable ) ;
    public final void rule__DeclarationsBlock__VarsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6908:1: ( ( ruleVariable ) )
            // InternalPortugol.g:6909:2: ( ruleVariable )
            {
            // InternalPortugol.g:6909:2: ( ruleVariable )
            // InternalPortugol.g:6910:3: ruleVariable
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
    // InternalPortugol.g:6919:1: rule__Variable__VarDeclarationAssignment_0 : ( ruleVarDeclaration ) ;
    public final void rule__Variable__VarDeclarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6923:1: ( ( ruleVarDeclaration ) )
            // InternalPortugol.g:6924:2: ( ruleVarDeclaration )
            {
            // InternalPortugol.g:6924:2: ( ruleVarDeclaration )
            // InternalPortugol.g:6925:3: ruleVarDeclaration
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
    // InternalPortugol.g:6934:1: rule__Variable__TypeAssignment_2 : ( ruleVarType ) ;
    public final void rule__Variable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6938:1: ( ( ruleVarType ) )
            // InternalPortugol.g:6939:2: ( ruleVarType )
            {
            // InternalPortugol.g:6939:2: ( ruleVarType )
            // InternalPortugol.g:6940:3: ruleVarType
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
    // InternalPortugol.g:6949:1: rule__VarDeclaration__VarsAssignment_0 : ( ruleVarName ) ;
    public final void rule__VarDeclaration__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6953:1: ( ( ruleVarName ) )
            // InternalPortugol.g:6954:2: ( ruleVarName )
            {
            // InternalPortugol.g:6954:2: ( ruleVarName )
            // InternalPortugol.g:6955:3: ruleVarName
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
    // InternalPortugol.g:6964:1: rule__VarDeclaration__VarsAssignment_1_1 : ( ruleVarName ) ;
    public final void rule__VarDeclaration__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6968:1: ( ( ruleVarName ) )
            // InternalPortugol.g:6969:2: ( ruleVarName )
            {
            // InternalPortugol.g:6969:2: ( ruleVarName )
            // InternalPortugol.g:6970:3: ruleVarName
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
    // InternalPortugol.g:6979:1: rule__DeclaredVarList__VarsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredVarList__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6983:1: ( ( ( RULE_ID ) ) )
            // InternalPortugol.g:6984:2: ( ( RULE_ID ) )
            {
            // InternalPortugol.g:6984:2: ( ( RULE_ID ) )
            // InternalPortugol.g:6985:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getVarsVarNameCrossReference_0_0()); 
            }
            // InternalPortugol.g:6986:3: ( RULE_ID )
            // InternalPortugol.g:6987:4: RULE_ID
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
    // InternalPortugol.g:6998:1: rule__DeclaredVarList__VarsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredVarList__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7002:1: ( ( ( RULE_ID ) ) )
            // InternalPortugol.g:7003:2: ( ( RULE_ID ) )
            {
            // InternalPortugol.g:7003:2: ( ( RULE_ID ) )
            // InternalPortugol.g:7004:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getVarsVarNameCrossReference_1_1_0()); 
            }
            // InternalPortugol.g:7005:3: ( RULE_ID )
            // InternalPortugol.g:7006:4: RULE_ID
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
    // InternalPortugol.g:7017:1: rule__VarName__NameAssignment : ( RULE_ID ) ;
    public final void rule__VarName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7021:1: ( ( RULE_ID ) )
            // InternalPortugol.g:7022:2: ( RULE_ID )
            {
            // InternalPortugol.g:7022:2: ( RULE_ID )
            // InternalPortugol.g:7023:3: RULE_ID
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
    // InternalPortugol.g:7032:1: rule__VarType__TypeNameAssignment : ( ( rule__VarType__TypeNameAlternatives_0 ) ) ;
    public final void rule__VarType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7036:1: ( ( ( rule__VarType__TypeNameAlternatives_0 ) ) )
            // InternalPortugol.g:7037:2: ( ( rule__VarType__TypeNameAlternatives_0 ) )
            {
            // InternalPortugol.g:7037:2: ( ( rule__VarType__TypeNameAlternatives_0 ) )
            // InternalPortugol.g:7038:3: ( rule__VarType__TypeNameAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarTypeAccess().getTypeNameAlternatives_0()); 
            }
            // InternalPortugol.g:7039:3: ( rule__VarType__TypeNameAlternatives_0 )
            // InternalPortugol.g:7039:4: rule__VarType__TypeNameAlternatives_0
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
    // InternalPortugol.g:7047:1: rule__Subprograms__BlockSubProgramsAssignment : ( ruleBlockSubPrograms ) ;
    public final void rule__Subprograms__BlockSubProgramsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7051:1: ( ( ruleBlockSubPrograms ) )
            // InternalPortugol.g:7052:2: ( ruleBlockSubPrograms )
            {
            // InternalPortugol.g:7052:2: ( ruleBlockSubPrograms )
            // InternalPortugol.g:7053:3: ruleBlockSubPrograms
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
    // InternalPortugol.g:7062:1: rule__ProcedureName__NameAssignment : ( RULE_ID ) ;
    public final void rule__ProcedureName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7066:1: ( ( RULE_ID ) )
            // InternalPortugol.g:7067:2: ( RULE_ID )
            {
            // InternalPortugol.g:7067:2: ( RULE_ID )
            // InternalPortugol.g:7068:3: RULE_ID
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
    // InternalPortugol.g:7077:1: rule__FunctionName__NameAssignment : ( RULE_ID ) ;
    public final void rule__FunctionName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7081:1: ( ( RULE_ID ) )
            // InternalPortugol.g:7082:2: ( RULE_ID )
            {
            // InternalPortugol.g:7082:2: ( RULE_ID )
            // InternalPortugol.g:7083:3: RULE_ID
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
    // InternalPortugol.g:7092:1: rule__BlockFunction__FunctionNameAssignment_1 : ( ruleFunctionName ) ;
    public final void rule__BlockFunction__FunctionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7096:1: ( ( ruleFunctionName ) )
            // InternalPortugol.g:7097:2: ( ruleFunctionName )
            {
            // InternalPortugol.g:7097:2: ( ruleFunctionName )
            // InternalPortugol.g:7098:3: ruleFunctionName
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
    // InternalPortugol.g:7107:1: rule__BlockFunction__ParamListAssignment_3 : ( ruleVariable ) ;
    public final void rule__BlockFunction__ParamListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7111:1: ( ( ruleVariable ) )
            // InternalPortugol.g:7112:2: ( ruleVariable )
            {
            // InternalPortugol.g:7112:2: ( ruleVariable )
            // InternalPortugol.g:7113:3: ruleVariable
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
    // InternalPortugol.g:7122:1: rule__BlockFunction__ReturnTypeAssignment_6 : ( ruleVarType ) ;
    public final void rule__BlockFunction__ReturnTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7126:1: ( ( ruleVarType ) )
            // InternalPortugol.g:7127:2: ( ruleVarType )
            {
            // InternalPortugol.g:7127:2: ( ruleVarType )
            // InternalPortugol.g:7128:3: ruleVarType
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
    // InternalPortugol.g:7137:1: rule__BlockFunction__DeclarationsAssignment_7 : ( ruleDeclarationsBlock ) ;
    public final void rule__BlockFunction__DeclarationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7141:1: ( ( ruleDeclarationsBlock ) )
            // InternalPortugol.g:7142:2: ( ruleDeclarationsBlock )
            {
            // InternalPortugol.g:7142:2: ( ruleDeclarationsBlock )
            // InternalPortugol.g:7143:3: ruleDeclarationsBlock
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
    // InternalPortugol.g:7152:1: rule__BlockFunction__CommandsAssignment_9 : ( ruleAbstractCommand ) ;
    public final void rule__BlockFunction__CommandsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7156:1: ( ( ruleAbstractCommand ) )
            // InternalPortugol.g:7157:2: ( ruleAbstractCommand )
            {
            // InternalPortugol.g:7157:2: ( ruleAbstractCommand )
            // InternalPortugol.g:7158:3: ruleAbstractCommand
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
    // InternalPortugol.g:7167:1: rule__BlockProcedure__ProcedureAssignment_1 : ( ruleProcedureName ) ;
    public final void rule__BlockProcedure__ProcedureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7171:1: ( ( ruleProcedureName ) )
            // InternalPortugol.g:7172:2: ( ruleProcedureName )
            {
            // InternalPortugol.g:7172:2: ( ruleProcedureName )
            // InternalPortugol.g:7173:3: ruleProcedureName
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
    // InternalPortugol.g:7182:1: rule__BlockProcedure__ParamListAssignment_3 : ( ruleVariable ) ;
    public final void rule__BlockProcedure__ParamListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7186:1: ( ( ruleVariable ) )
            // InternalPortugol.g:7187:2: ( ruleVariable )
            {
            // InternalPortugol.g:7187:2: ( ruleVariable )
            // InternalPortugol.g:7188:3: ruleVariable
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
    // InternalPortugol.g:7197:1: rule__BlockProcedure__DeclarationsAssignment_5 : ( ruleDeclarationsBlock ) ;
    public final void rule__BlockProcedure__DeclarationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7201:1: ( ( ruleDeclarationsBlock ) )
            // InternalPortugol.g:7202:2: ( ruleDeclarationsBlock )
            {
            // InternalPortugol.g:7202:2: ( ruleDeclarationsBlock )
            // InternalPortugol.g:7203:3: ruleDeclarationsBlock
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
    // InternalPortugol.g:7212:1: rule__BlockProcedure__CommandsAssignment_7 : ( ruleAbstractCommand ) ;
    public final void rule__BlockProcedure__CommandsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7216:1: ( ( ruleAbstractCommand ) )
            // InternalPortugol.g:7217:2: ( ruleAbstractCommand )
            {
            // InternalPortugol.g:7217:2: ( ruleAbstractCommand )
            // InternalPortugol.g:7218:3: ruleAbstractCommand
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
    // InternalPortugol.g:7227:1: rule__BlockCommand__CommandsAssignment_1 : ( ruleAbstractCommand ) ;
    public final void rule__BlockCommand__CommandsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7231:1: ( ( ruleAbstractCommand ) )
            // InternalPortugol.g:7232:2: ( ruleAbstractCommand )
            {
            // InternalPortugol.g:7232:2: ( ruleAbstractCommand )
            // InternalPortugol.g:7233:3: ruleAbstractCommand
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


    // $ANTLR start "rule__IfStatement__ExprAssignment_1"
    // InternalPortugol.g:7242:1: rule__IfStatement__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__IfStatement__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7246:1: ( ( ruleExpression ) )
            // InternalPortugol.g:7247:2: ( ruleExpression )
            {
            // InternalPortugol.g:7247:2: ( ruleExpression )
            // InternalPortugol.g:7248:3: ruleExpression
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
    // InternalPortugol.g:7257:1: rule__IfStatement__CommandsAssignment_3 : ( ruleAbstractCommand ) ;
    public final void rule__IfStatement__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7261:1: ( ( ruleAbstractCommand ) )
            // InternalPortugol.g:7262:2: ( ruleAbstractCommand )
            {
            // InternalPortugol.g:7262:2: ( ruleAbstractCommand )
            // InternalPortugol.g:7263:3: ruleAbstractCommand
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
    // InternalPortugol.g:7272:1: rule__IfStatement__ElseCommandsAssignment_4_1 : ( ruleAbstractCommand ) ;
    public final void rule__IfStatement__ElseCommandsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7276:1: ( ( ruleAbstractCommand ) )
            // InternalPortugol.g:7277:2: ( ruleAbstractCommand )
            {
            // InternalPortugol.g:7277:2: ( ruleAbstractCommand )
            // InternalPortugol.g:7278:3: ruleAbstractCommand
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
    // InternalPortugol.g:7287:1: rule__SwitchCaseStatement__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SwitchCaseStatement__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7291:1: ( ( ( RULE_ID ) ) )
            // InternalPortugol.g:7292:2: ( ( RULE_ID ) )
            {
            // InternalPortugol.g:7292:2: ( ( RULE_ID ) )
            // InternalPortugol.g:7293:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getVariableVarNameCrossReference_1_0()); 
            }
            // InternalPortugol.g:7294:3: ( RULE_ID )
            // InternalPortugol.g:7295:4: RULE_ID
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
    // InternalPortugol.g:7306:1: rule__SwitchCaseStatement__CaseListAssignment_2 : ( ruleCaseList ) ;
    public final void rule__SwitchCaseStatement__CaseListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7310:1: ( ( ruleCaseList ) )
            // InternalPortugol.g:7311:2: ( ruleCaseList )
            {
            // InternalPortugol.g:7311:2: ( ruleCaseList )
            // InternalPortugol.g:7312:3: ruleCaseList
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
    // InternalPortugol.g:7321:1: rule__SwitchCaseStatement__OtherCaseAssignment_3 : ( ruleOtherCase ) ;
    public final void rule__SwitchCaseStatement__OtherCaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7325:1: ( ( ruleOtherCase ) )
            // InternalPortugol.g:7326:2: ( ruleOtherCase )
            {
            // InternalPortugol.g:7326:2: ( ruleOtherCase )
            // InternalPortugol.g:7327:3: ruleOtherCase
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
    // InternalPortugol.g:7336:1: rule__CaseList__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__CaseList__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7340:1: ( ( ruleExpression ) )
            // InternalPortugol.g:7341:2: ( ruleExpression )
            {
            // InternalPortugol.g:7341:2: ( ruleExpression )
            // InternalPortugol.g:7342:3: ruleExpression
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
    // InternalPortugol.g:7351:1: rule__CaseList__CommandsAssignment_3 : ( ruleAbstractCommand ) ;
    public final void rule__CaseList__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7355:1: ( ( ruleAbstractCommand ) )
            // InternalPortugol.g:7356:2: ( ruleAbstractCommand )
            {
            // InternalPortugol.g:7356:2: ( ruleAbstractCommand )
            // InternalPortugol.g:7357:3: ruleAbstractCommand
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


    // $ANTLR start "rule__CaseList__BreakStatementAssignment_4_0"
    // InternalPortugol.g:7366:1: rule__CaseList__BreakStatementAssignment_4_0 : ( ( 'interrompa' ) ) ;
    public final void rule__CaseList__BreakStatementAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7370:1: ( ( ( 'interrompa' ) ) )
            // InternalPortugol.g:7371:2: ( ( 'interrompa' ) )
            {
            // InternalPortugol.g:7371:2: ( ( 'interrompa' ) )
            // InternalPortugol.g:7372:3: ( 'interrompa' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getBreakStatementInterrompaKeyword_4_0_0()); 
            }
            // InternalPortugol.g:7373:3: ( 'interrompa' )
            // InternalPortugol.g:7374:4: 'interrompa'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getBreakStatementInterrompaKeyword_4_0_0()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseListAccess().getBreakStatementInterrompaKeyword_4_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseListAccess().getBreakStatementInterrompaKeyword_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseList__BreakStatementAssignment_4_0"


    // $ANTLR start "rule__OtherCase__OtherCaseCommandsAssignment_2"
    // InternalPortugol.g:7385:1: rule__OtherCase__OtherCaseCommandsAssignment_2 : ( ruleAbstractCommand ) ;
    public final void rule__OtherCase__OtherCaseCommandsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7389:1: ( ( ruleAbstractCommand ) )
            // InternalPortugol.g:7390:2: ( ruleAbstractCommand )
            {
            // InternalPortugol.g:7390:2: ( ruleAbstractCommand )
            // InternalPortugol.g:7391:3: ruleAbstractCommand
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


    // $ANTLR start "rule__OtherCase__BreakStatementAssignment_3_0"
    // InternalPortugol.g:7400:1: rule__OtherCase__BreakStatementAssignment_3_0 : ( ( 'interrompa' ) ) ;
    public final void rule__OtherCase__BreakStatementAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7404:1: ( ( ( 'interrompa' ) ) )
            // InternalPortugol.g:7405:2: ( ( 'interrompa' ) )
            {
            // InternalPortugol.g:7405:2: ( ( 'interrompa' ) )
            // InternalPortugol.g:7406:3: ( 'interrompa' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getBreakStatementInterrompaKeyword_3_0_0()); 
            }
            // InternalPortugol.g:7407:3: ( 'interrompa' )
            // InternalPortugol.g:7408:4: 'interrompa'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getBreakStatementInterrompaKeyword_3_0_0()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherCaseAccess().getBreakStatementInterrompaKeyword_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherCaseAccess().getBreakStatementInterrompaKeyword_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherCase__BreakStatementAssignment_3_0"


    // $ANTLR start "rule__ForStatement__OperatorExprAssignment_1"
    // InternalPortugol.g:7419:1: rule__ForStatement__OperatorExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__ForStatement__OperatorExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7423:1: ( ( ruleExpression ) )
            // InternalPortugol.g:7424:2: ( ruleExpression )
            {
            // InternalPortugol.g:7424:2: ( ruleExpression )
            // InternalPortugol.g:7425:3: ruleExpression
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
    // InternalPortugol.g:7434:1: rule__ForStatement__StartExprAssignment_3 : ( ruleExpression ) ;
    public final void rule__ForStatement__StartExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7438:1: ( ( ruleExpression ) )
            // InternalPortugol.g:7439:2: ( ruleExpression )
            {
            // InternalPortugol.g:7439:2: ( ruleExpression )
            // InternalPortugol.g:7440:3: ruleExpression
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
    // InternalPortugol.g:7449:1: rule__ForStatement__EndExprAssignment_5 : ( ruleExpression ) ;
    public final void rule__ForStatement__EndExprAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7453:1: ( ( ruleExpression ) )
            // InternalPortugol.g:7454:2: ( ruleExpression )
            {
            // InternalPortugol.g:7454:2: ( ruleExpression )
            // InternalPortugol.g:7455:3: ruleExpression
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
    // InternalPortugol.g:7464:1: rule__ForStatement__StepExpeAssignment_6_1 : ( ruleExpression ) ;
    public final void rule__ForStatement__StepExpeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7468:1: ( ( ruleExpression ) )
            // InternalPortugol.g:7469:2: ( ruleExpression )
            {
            // InternalPortugol.g:7469:2: ( ruleExpression )
            // InternalPortugol.g:7470:3: ruleExpression
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
    // InternalPortugol.g:7479:1: rule__ForStatement__CommandsAssignment_8 : ( ruleAbstractCommand ) ;
    public final void rule__ForStatement__CommandsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7483:1: ( ( ruleAbstractCommand ) )
            // InternalPortugol.g:7484:2: ( ruleAbstractCommand )
            {
            // InternalPortugol.g:7484:2: ( ruleAbstractCommand )
            // InternalPortugol.g:7485:3: ruleAbstractCommand
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
    // InternalPortugol.g:7494:1: rule__WhileStatement__WhileExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__WhileStatement__WhileExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7498:1: ( ( ruleExpression ) )
            // InternalPortugol.g:7499:2: ( ruleExpression )
            {
            // InternalPortugol.g:7499:2: ( ruleExpression )
            // InternalPortugol.g:7500:3: ruleExpression
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
    // InternalPortugol.g:7509:1: rule__WhileStatement__CommandsAssignment_3 : ( ruleAbstractCommand ) ;
    public final void rule__WhileStatement__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7513:1: ( ( ruleAbstractCommand ) )
            // InternalPortugol.g:7514:2: ( ruleAbstractCommand )
            {
            // InternalPortugol.g:7514:2: ( ruleAbstractCommand )
            // InternalPortugol.g:7515:3: ruleAbstractCommand
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
    // InternalPortugol.g:7524:1: rule__RepeatStatement__CommandsAssignment_1 : ( ruleAbstractCommand ) ;
    public final void rule__RepeatStatement__CommandsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7528:1: ( ( ruleAbstractCommand ) )
            // InternalPortugol.g:7529:2: ( ruleAbstractCommand )
            {
            // InternalPortugol.g:7529:2: ( ruleAbstractCommand )
            // InternalPortugol.g:7530:3: ruleAbstractCommand
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
    // InternalPortugol.g:7539:1: rule__RepeatStatement__UntilExprAssignment_3 : ( ruleExpression ) ;
    public final void rule__RepeatStatement__UntilExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7543:1: ( ( ruleExpression ) )
            // InternalPortugol.g:7544:2: ( ruleExpression )
            {
            // InternalPortugol.g:7544:2: ( ruleExpression )
            // InternalPortugol.g:7545:3: ruleExpression
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
    // InternalPortugol.g:7554:1: rule__SubprogramParam__ExpressionAssignment_0 : ( ruleExpression ) ;
    public final void rule__SubprogramParam__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7558:1: ( ( ruleExpression ) )
            // InternalPortugol.g:7559:2: ( ruleExpression )
            {
            // InternalPortugol.g:7559:2: ( ruleExpression )
            // InternalPortugol.g:7560:3: ruleExpression
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
    // InternalPortugol.g:7569:1: rule__SubprogramParam__ExpressionAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__SubprogramParam__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7573:1: ( ( ruleExpression ) )
            // InternalPortugol.g:7574:2: ( ruleExpression )
            {
            // InternalPortugol.g:7574:2: ( ruleExpression )
            // InternalPortugol.g:7575:3: ruleExpression
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
    // InternalPortugol.g:7584:1: rule__ReadCommand__ParamListAssignment_2 : ( ruleDeclaredVarList ) ;
    public final void rule__ReadCommand__ParamListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7588:1: ( ( ruleDeclaredVarList ) )
            // InternalPortugol.g:7589:2: ( ruleDeclaredVarList )
            {
            // InternalPortugol.g:7589:2: ( ruleDeclaredVarList )
            // InternalPortugol.g:7590:3: ruleDeclaredVarList
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
    // InternalPortugol.g:7599:1: rule__WriteCommand__WriteCommandAssignment_0 : ( ( rule__WriteCommand__WriteCommandAlternatives_0_0 ) ) ;
    public final void rule__WriteCommand__WriteCommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7603:1: ( ( ( rule__WriteCommand__WriteCommandAlternatives_0_0 ) ) )
            // InternalPortugol.g:7604:2: ( ( rule__WriteCommand__WriteCommandAlternatives_0_0 ) )
            {
            // InternalPortugol.g:7604:2: ( ( rule__WriteCommand__WriteCommandAlternatives_0_0 ) )
            // InternalPortugol.g:7605:3: ( rule__WriteCommand__WriteCommandAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getWriteCommandAlternatives_0_0()); 
            }
            // InternalPortugol.g:7606:3: ( rule__WriteCommand__WriteCommandAlternatives_0_0 )
            // InternalPortugol.g:7606:4: rule__WriteCommand__WriteCommandAlternatives_0_0
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
    // InternalPortugol.g:7614:1: rule__WriteCommand__WriteParamAssignment_2 : ( ruleWriteParam ) ;
    public final void rule__WriteCommand__WriteParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7618:1: ( ( ruleWriteParam ) )
            // InternalPortugol.g:7619:2: ( ruleWriteParam )
            {
            // InternalPortugol.g:7619:2: ( ruleWriteParam )
            // InternalPortugol.g:7620:3: ruleWriteParam
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
    // InternalPortugol.g:7629:1: rule__WriteParam__ParamsAssignment_0 : ( ruleSubprogramParam ) ;
    public final void rule__WriteParam__ParamsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7633:1: ( ( ruleSubprogramParam ) )
            // InternalPortugol.g:7634:2: ( ruleSubprogramParam )
            {
            // InternalPortugol.g:7634:2: ( ruleSubprogramParam )
            // InternalPortugol.g:7635:3: ruleSubprogramParam
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
    // InternalPortugol.g:7644:1: rule__WriteParam__PrecisionAssignment_1 : ( ruleOptDecimalPrecision ) ;
    public final void rule__WriteParam__PrecisionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7648:1: ( ( ruleOptDecimalPrecision ) )
            // InternalPortugol.g:7649:2: ( ruleOptDecimalPrecision )
            {
            // InternalPortugol.g:7649:2: ( ruleOptDecimalPrecision )
            // InternalPortugol.g:7650:3: ruleOptDecimalPrecision
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
    // InternalPortugol.g:7659:1: rule__OptDecimalPrecision__FirstPrecisionAssignment_1 : ( RULE_INT ) ;
    public final void rule__OptDecimalPrecision__FirstPrecisionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7663:1: ( ( RULE_INT ) )
            // InternalPortugol.g:7664:2: ( RULE_INT )
            {
            // InternalPortugol.g:7664:2: ( RULE_INT )
            // InternalPortugol.g:7665:3: RULE_INT
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
    // InternalPortugol.g:7674:1: rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7678:1: ( ( RULE_INT ) )
            // InternalPortugol.g:7679:2: ( RULE_INT )
            {
            // InternalPortugol.g:7679:2: ( RULE_INT )
            // InternalPortugol.g:7680:3: RULE_INT
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
    // InternalPortugol.g:7689:1: rule__Assignment__OpAssignment_1_0_0_1 : ( ( '<-' ) ) ;
    public final void rule__Assignment__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7693:1: ( ( ( '<-' ) ) )
            // InternalPortugol.g:7694:2: ( ( '<-' ) )
            {
            // InternalPortugol.g:7694:2: ( ( '<-' ) )
            // InternalPortugol.g:7695:3: ( '<-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOpLessThanSignHyphenMinusKeyword_1_0_0_1_0()); 
            }
            // InternalPortugol.g:7696:3: ( '<-' )
            // InternalPortugol.g:7697:4: '<-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOpLessThanSignHyphenMinusKeyword_1_0_0_1_0()); 
            }
            match(input,65,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:7708:1: rule__Assignment__RightAssignment_1_1 : ( ruleAssignment ) ;
    public final void rule__Assignment__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7712:1: ( ( ruleAssignment ) )
            // InternalPortugol.g:7713:2: ( ruleAssignment )
            {
            // InternalPortugol.g:7713:2: ( ruleAssignment )
            // InternalPortugol.g:7714:3: ruleAssignment
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
    // InternalPortugol.g:7723:1: rule__OrExpression__OpAssignment_1_0_0_1 : ( ( 'OU' ) ) ;
    public final void rule__OrExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7727:1: ( ( ( 'OU' ) ) )
            // InternalPortugol.g:7728:2: ( ( 'OU' ) )
            {
            // InternalPortugol.g:7728:2: ( ( 'OU' ) )
            // InternalPortugol.g:7729:3: ( 'OU' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpOUKeyword_1_0_0_1_0()); 
            }
            // InternalPortugol.g:7730:3: ( 'OU' )
            // InternalPortugol.g:7731:4: 'OU'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpOUKeyword_1_0_0_1_0()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:7742:1: rule__OrExpression__RightAssignment_1_1 : ( ruleXorExpression ) ;
    public final void rule__OrExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7746:1: ( ( ruleXorExpression ) )
            // InternalPortugol.g:7747:2: ( ruleXorExpression )
            {
            // InternalPortugol.g:7747:2: ( ruleXorExpression )
            // InternalPortugol.g:7748:3: ruleXorExpression
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
    // InternalPortugol.g:7757:1: rule__XorExpression__OpAssignment_1_0_0_1 : ( ( 'XOU' ) ) ;
    public final void rule__XorExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7761:1: ( ( ( 'XOU' ) ) )
            // InternalPortugol.g:7762:2: ( ( 'XOU' ) )
            {
            // InternalPortugol.g:7762:2: ( ( 'XOU' ) )
            // InternalPortugol.g:7763:3: ( 'XOU' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOpXOUKeyword_1_0_0_1_0()); 
            }
            // InternalPortugol.g:7764:3: ( 'XOU' )
            // InternalPortugol.g:7765:4: 'XOU'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOpXOUKeyword_1_0_0_1_0()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:7776:1: rule__XorExpression__RightAssignment_1_1 : ( ruleAndExpression ) ;
    public final void rule__XorExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7780:1: ( ( ruleAndExpression ) )
            // InternalPortugol.g:7781:2: ( ruleAndExpression )
            {
            // InternalPortugol.g:7781:2: ( ruleAndExpression )
            // InternalPortugol.g:7782:3: ruleAndExpression
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
    // InternalPortugol.g:7791:1: rule__AndExpression__OpAssignment_1_0_0_1 : ( ( rule__AndExpression__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__AndExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7795:1: ( ( ( rule__AndExpression__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugol.g:7796:2: ( ( rule__AndExpression__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugol.g:7796:2: ( ( rule__AndExpression__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugol.g:7797:3: ( rule__AndExpression__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugol.g:7798:3: ( rule__AndExpression__OpAlternatives_1_0_0_1_0 )
            // InternalPortugol.g:7798:4: rule__AndExpression__OpAlternatives_1_0_0_1_0
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
    // InternalPortugol.g:7806:1: rule__AndExpression__RightAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__AndExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7810:1: ( ( ruleComparison ) )
            // InternalPortugol.g:7811:2: ( ruleComparison )
            {
            // InternalPortugol.g:7811:2: ( ruleComparison )
            // InternalPortugol.g:7812:3: ruleComparison
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
    // InternalPortugol.g:7821:1: rule__Comparison__OpAssignment_1_0_0_1 : ( ( rule__Comparison__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7825:1: ( ( ( rule__Comparison__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugol.g:7826:2: ( ( rule__Comparison__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugol.g:7826:2: ( ( rule__Comparison__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugol.g:7827:3: ( rule__Comparison__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugol.g:7828:3: ( rule__Comparison__OpAlternatives_1_0_0_1_0 )
            // InternalPortugol.g:7828:4: rule__Comparison__OpAlternatives_1_0_0_1_0
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
    // InternalPortugol.g:7836:1: rule__Comparison__RightAssignment_1_1 : ( ruleEquExpression ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7840:1: ( ( ruleEquExpression ) )
            // InternalPortugol.g:7841:2: ( ruleEquExpression )
            {
            // InternalPortugol.g:7841:2: ( ruleEquExpression )
            // InternalPortugol.g:7842:3: ruleEquExpression
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
    // InternalPortugol.g:7851:1: rule__EquExpression__OpAssignment_1_0_0_1 : ( ( rule__EquExpression__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__EquExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7855:1: ( ( ( rule__EquExpression__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugol.g:7856:2: ( ( rule__EquExpression__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugol.g:7856:2: ( ( rule__EquExpression__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugol.g:7857:3: ( rule__EquExpression__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugol.g:7858:3: ( rule__EquExpression__OpAlternatives_1_0_0_1_0 )
            // InternalPortugol.g:7858:4: rule__EquExpression__OpAlternatives_1_0_0_1_0
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
    // InternalPortugol.g:7866:1: rule__EquExpression__RightAssignment_1_1 : ( ruleAddExpression ) ;
    public final void rule__EquExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7870:1: ( ( ruleAddExpression ) )
            // InternalPortugol.g:7871:2: ( ruleAddExpression )
            {
            // InternalPortugol.g:7871:2: ( ruleAddExpression )
            // InternalPortugol.g:7872:3: ruleAddExpression
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
    // InternalPortugol.g:7881:1: rule__AddExpression__OpAssignment_1_0_0_1 : ( ( rule__AddExpression__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__AddExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7885:1: ( ( ( rule__AddExpression__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugol.g:7886:2: ( ( rule__AddExpression__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugol.g:7886:2: ( ( rule__AddExpression__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugol.g:7887:3: ( rule__AddExpression__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugol.g:7888:3: ( rule__AddExpression__OpAlternatives_1_0_0_1_0 )
            // InternalPortugol.g:7888:4: rule__AddExpression__OpAlternatives_1_0_0_1_0
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
    // InternalPortugol.g:7896:1: rule__AddExpression__RightAssignment_1_1 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AddExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7900:1: ( ( ruleMultiplicativeExpression ) )
            // InternalPortugol.g:7901:2: ( ruleMultiplicativeExpression )
            {
            // InternalPortugol.g:7901:2: ( ruleMultiplicativeExpression )
            // InternalPortugol.g:7902:3: ruleMultiplicativeExpression
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
    // InternalPortugol.g:7911:1: rule__MultiplicativeExpression__OpAssignment_1_0_0_1 : ( ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__MultiplicativeExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7915:1: ( ( ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugol.g:7916:2: ( ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugol.g:7916:2: ( ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugol.g:7917:3: ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugol.g:7918:3: ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 )
            // InternalPortugol.g:7918:4: rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0
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
    // InternalPortugol.g:7926:1: rule__MultiplicativeExpression__RightAssignment_1_1 : ( rulePowerExpression ) ;
    public final void rule__MultiplicativeExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7930:1: ( ( rulePowerExpression ) )
            // InternalPortugol.g:7931:2: ( rulePowerExpression )
            {
            // InternalPortugol.g:7931:2: ( rulePowerExpression )
            // InternalPortugol.g:7932:3: rulePowerExpression
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
    // InternalPortugol.g:7941:1: rule__PowerExpression__OpAssignment_1_0_0_1 : ( ( '^' ) ) ;
    public final void rule__PowerExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7945:1: ( ( ( '^' ) ) )
            // InternalPortugol.g:7946:2: ( ( '^' ) )
            {
            // InternalPortugol.g:7946:2: ( ( '^' ) )
            // InternalPortugol.g:7947:3: ( '^' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getOpCircumflexAccentKeyword_1_0_0_1_0()); 
            }
            // InternalPortugol.g:7948:3: ( '^' )
            // InternalPortugol.g:7949:4: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getOpCircumflexAccentKeyword_1_0_0_1_0()); 
            }
            match(input,68,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:7960:1: rule__PowerExpression__RightAssignment_1_1 : ( ruleUnaryExpression ) ;
    public final void rule__PowerExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7964:1: ( ( ruleUnaryExpression ) )
            // InternalPortugol.g:7965:2: ( ruleUnaryExpression )
            {
            // InternalPortugol.g:7965:2: ( ruleUnaryExpression )
            // InternalPortugol.g:7966:3: ruleUnaryExpression
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
    // InternalPortugol.g:7975:1: rule__UnaryExpression__OpAssignment_0_1 : ( ( rule__UnaryExpression__OpAlternatives_0_1_0 ) ) ;
    public final void rule__UnaryExpression__OpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7979:1: ( ( ( rule__UnaryExpression__OpAlternatives_0_1_0 ) ) )
            // InternalPortugol.g:7980:2: ( ( rule__UnaryExpression__OpAlternatives_0_1_0 ) )
            {
            // InternalPortugol.g:7980:2: ( ( rule__UnaryExpression__OpAlternatives_0_1_0 ) )
            // InternalPortugol.g:7981:3: ( rule__UnaryExpression__OpAlternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOpAlternatives_0_1_0()); 
            }
            // InternalPortugol.g:7982:3: ( rule__UnaryExpression__OpAlternatives_0_1_0 )
            // InternalPortugol.g:7982:4: rule__UnaryExpression__OpAlternatives_0_1_0
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
    // InternalPortugol.g:7990:1: rule__UnaryExpression__OperandAssignment_0_2 : ( ruleUnaryExpression ) ;
    public final void rule__UnaryExpression__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7994:1: ( ( ruleUnaryExpression ) )
            // InternalPortugol.g:7995:2: ( ruleUnaryExpression )
            {
            // InternalPortugol.g:7995:2: ( ruleUnaryExpression )
            // InternalPortugol.g:7996:3: ruleUnaryExpression
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
    // InternalPortugol.g:8005:1: rule__FunctionCall__FbNameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__FbNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:8009:1: ( ( ( RULE_ID ) ) )
            // InternalPortugol.g:8010:2: ( ( RULE_ID ) )
            {
            // InternalPortugol.g:8010:2: ( ( RULE_ID ) )
            // InternalPortugol.g:8011:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFbNameFunctionNameCrossReference_0_0()); 
            }
            // InternalPortugol.g:8012:3: ( RULE_ID )
            // InternalPortugol.g:8013:4: RULE_ID
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
    // InternalPortugol.g:8024:1: rule__FunctionCall__ParamAssignment_2 : ( ruleSubprogramParam ) ;
    public final void rule__FunctionCall__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:8028:1: ( ( ruleSubprogramParam ) )
            // InternalPortugol.g:8029:2: ( ruleSubprogramParam )
            {
            // InternalPortugol.g:8029:2: ( ruleSubprogramParam )
            // InternalPortugol.g:8030:3: ruleSubprogramParam
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
    // InternalPortugol.g:8039:1: rule__DeclaredVar__VarNameAssignment : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredVar__VarNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:8043:1: ( ( ( RULE_ID ) ) )
            // InternalPortugol.g:8044:2: ( ( RULE_ID ) )
            {
            // InternalPortugol.g:8044:2: ( ( RULE_ID ) )
            // InternalPortugol.g:8045:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getVarNameVarNameCrossReference_0()); 
            }
            // InternalPortugol.g:8046:3: ( RULE_ID )
            // InternalPortugol.g:8047:4: RULE_ID
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
    // InternalPortugol.g:8058:1: rule__NumericLiteral__IntValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__NumericLiteral__IntValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:8062:1: ( ( RULE_INT ) )
            // InternalPortugol.g:8063:2: ( RULE_INT )
            {
            // InternalPortugol.g:8063:2: ( RULE_INT )
            // InternalPortugol.g:8064:3: RULE_INT
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
    // InternalPortugol.g:8073:1: rule__NumericLiteral__FloatValueAssignment_1 : ( RULE_FLOAT ) ;
    public final void rule__NumericLiteral__FloatValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:8077:1: ( ( RULE_FLOAT ) )
            // InternalPortugol.g:8078:2: ( RULE_FLOAT )
            {
            // InternalPortugol.g:8078:2: ( RULE_FLOAT )
            // InternalPortugol.g:8079:3: RULE_FLOAT
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
    // InternalPortugol.g:8088:1: rule__StringExpression__LiteralStringAssignment : ( RULE_STRING ) ;
    public final void rule__StringExpression__LiteralStringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:8092:1: ( ( RULE_STRING ) )
            // InternalPortugol.g:8093:2: ( RULE_STRING )
            {
            // InternalPortugol.g:8093:2: ( RULE_STRING )
            // InternalPortugol.g:8094:3: RULE_STRING
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

    // $ANTLR start synpred55_InternalPortugol
    public final void synpred55_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:4903:3: ( rule__Assignment__Group_1__0 )
        // InternalPortugol.g:4903:3: rule__Assignment__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Assignment__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalPortugol

    // Delegated rules

    public final boolean synpred55_InternalPortugol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalPortugol_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000084000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000A4000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xD0444082100600F0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0xD0444082100600F2L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000082100000F0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0028000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000210000000L});

}