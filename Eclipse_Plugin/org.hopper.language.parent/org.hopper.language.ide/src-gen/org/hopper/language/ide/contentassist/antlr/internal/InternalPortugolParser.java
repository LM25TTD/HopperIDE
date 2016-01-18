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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_END_COMMAND", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'real'", "'inteiro'", "'caractere'", "'caracter'", "'escreva'", "'escreval'", "'&'", "'E'", "'='", "'<>'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'MOD'", "'%'", "'NOT'", "'algoritmo'", "'var'", "':'", "','", "'funcao'", "'('", "')'", "'inicio'", "'fimfuncao'", "'procedimento'", "'fimprocedimento'", "'fimalgoritmo'", "'se'", "'entao'", "'fimse'", "'senao'", "'escolha'", "'fimescolha'", "'caso'", "'outrocaso'", "'leia'", "'interrompa'", "'<-'", "'OU'", "'XOU'", "'^'"
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
    public static final int RULE_END_COMMAND=4;
    public static final int RULE_STRING=5;
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


    // $ANTLR start "entryRuleSubprogramParam"
    // InternalPortugol.g:561:1: entryRuleSubprogramParam : ruleSubprogramParam EOF ;
    public final void entryRuleSubprogramParam() throws RecognitionException {
        try {
            // InternalPortugol.g:562:1: ( ruleSubprogramParam EOF )
            // InternalPortugol.g:563:1: ruleSubprogramParam EOF
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
    // InternalPortugol.g:570:1: ruleSubprogramParam : ( ( rule__SubprogramParam__Group__0 ) ) ;
    public final void ruleSubprogramParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:574:2: ( ( ( rule__SubprogramParam__Group__0 ) ) )
            // InternalPortugol.g:575:2: ( ( rule__SubprogramParam__Group__0 ) )
            {
            // InternalPortugol.g:575:2: ( ( rule__SubprogramParam__Group__0 ) )
            // InternalPortugol.g:576:3: ( rule__SubprogramParam__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamAccess().getGroup()); 
            }
            // InternalPortugol.g:577:3: ( rule__SubprogramParam__Group__0 )
            // InternalPortugol.g:577:4: rule__SubprogramParam__Group__0
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
    // InternalPortugol.g:586:1: entryRuleReadCommand : ruleReadCommand EOF ;
    public final void entryRuleReadCommand() throws RecognitionException {
        try {
            // InternalPortugol.g:587:1: ( ruleReadCommand EOF )
            // InternalPortugol.g:588:1: ruleReadCommand EOF
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
    // InternalPortugol.g:595:1: ruleReadCommand : ( ( rule__ReadCommand__Group__0 ) ) ;
    public final void ruleReadCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:599:2: ( ( ( rule__ReadCommand__Group__0 ) ) )
            // InternalPortugol.g:600:2: ( ( rule__ReadCommand__Group__0 ) )
            {
            // InternalPortugol.g:600:2: ( ( rule__ReadCommand__Group__0 ) )
            // InternalPortugol.g:601:3: ( rule__ReadCommand__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getGroup()); 
            }
            // InternalPortugol.g:602:3: ( rule__ReadCommand__Group__0 )
            // InternalPortugol.g:602:4: rule__ReadCommand__Group__0
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
    // InternalPortugol.g:611:1: entryRuleWriteCommand : ruleWriteCommand EOF ;
    public final void entryRuleWriteCommand() throws RecognitionException {
        try {
            // InternalPortugol.g:612:1: ( ruleWriteCommand EOF )
            // InternalPortugol.g:613:1: ruleWriteCommand EOF
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
    // InternalPortugol.g:620:1: ruleWriteCommand : ( ( rule__WriteCommand__Group__0 ) ) ;
    public final void ruleWriteCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:624:2: ( ( ( rule__WriteCommand__Group__0 ) ) )
            // InternalPortugol.g:625:2: ( ( rule__WriteCommand__Group__0 ) )
            {
            // InternalPortugol.g:625:2: ( ( rule__WriteCommand__Group__0 ) )
            // InternalPortugol.g:626:3: ( rule__WriteCommand__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getGroup()); 
            }
            // InternalPortugol.g:627:3: ( rule__WriteCommand__Group__0 )
            // InternalPortugol.g:627:4: rule__WriteCommand__Group__0
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
    // InternalPortugol.g:636:1: entryRuleWriteParam : ruleWriteParam EOF ;
    public final void entryRuleWriteParam() throws RecognitionException {
        try {
            // InternalPortugol.g:637:1: ( ruleWriteParam EOF )
            // InternalPortugol.g:638:1: ruleWriteParam EOF
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
    // InternalPortugol.g:645:1: ruleWriteParam : ( ( rule__WriteParam__Group__0 ) ) ;
    public final void ruleWriteParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:649:2: ( ( ( rule__WriteParam__Group__0 ) ) )
            // InternalPortugol.g:650:2: ( ( rule__WriteParam__Group__0 ) )
            {
            // InternalPortugol.g:650:2: ( ( rule__WriteParam__Group__0 ) )
            // InternalPortugol.g:651:3: ( rule__WriteParam__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getGroup()); 
            }
            // InternalPortugol.g:652:3: ( rule__WriteParam__Group__0 )
            // InternalPortugol.g:652:4: rule__WriteParam__Group__0
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
    // InternalPortugol.g:661:1: entryRuleOptDecimalPrecision : ruleOptDecimalPrecision EOF ;
    public final void entryRuleOptDecimalPrecision() throws RecognitionException {
        try {
            // InternalPortugol.g:662:1: ( ruleOptDecimalPrecision EOF )
            // InternalPortugol.g:663:1: ruleOptDecimalPrecision EOF
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
    // InternalPortugol.g:670:1: ruleOptDecimalPrecision : ( ( rule__OptDecimalPrecision__Group__0 ) ) ;
    public final void ruleOptDecimalPrecision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:674:2: ( ( ( rule__OptDecimalPrecision__Group__0 ) ) )
            // InternalPortugol.g:675:2: ( ( rule__OptDecimalPrecision__Group__0 ) )
            {
            // InternalPortugol.g:675:2: ( ( rule__OptDecimalPrecision__Group__0 ) )
            // InternalPortugol.g:676:3: ( rule__OptDecimalPrecision__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getGroup()); 
            }
            // InternalPortugol.g:677:3: ( rule__OptDecimalPrecision__Group__0 )
            // InternalPortugol.g:677:4: rule__OptDecimalPrecision__Group__0
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
    // InternalPortugol.g:686:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:687:1: ( ruleExpression EOF )
            // InternalPortugol.g:688:1: ruleExpression EOF
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
    // InternalPortugol.g:695:1: ruleExpression : ( ruleAssignment ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:699:2: ( ( ruleAssignment ) )
            // InternalPortugol.g:700:2: ( ruleAssignment )
            {
            // InternalPortugol.g:700:2: ( ruleAssignment )
            // InternalPortugol.g:701:3: ruleAssignment
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
    // InternalPortugol.g:711:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalPortugol.g:712:1: ( ruleAssignment EOF )
            // InternalPortugol.g:713:1: ruleAssignment EOF
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
    // InternalPortugol.g:720:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:724:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalPortugol.g:725:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalPortugol.g:725:2: ( ( rule__Assignment__Group__0 ) )
            // InternalPortugol.g:726:3: ( rule__Assignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // InternalPortugol.g:727:3: ( rule__Assignment__Group__0 )
            // InternalPortugol.g:727:4: rule__Assignment__Group__0
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
    // InternalPortugol.g:736:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:737:1: ( ruleOrExpression EOF )
            // InternalPortugol.g:738:1: ruleOrExpression EOF
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
    // InternalPortugol.g:745:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:749:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalPortugol.g:750:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalPortugol.g:750:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalPortugol.g:751:3: ( rule__OrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:752:3: ( rule__OrExpression__Group__0 )
            // InternalPortugol.g:752:4: rule__OrExpression__Group__0
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
    // InternalPortugol.g:761:1: entryRuleXorExpression : ruleXorExpression EOF ;
    public final void entryRuleXorExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:762:1: ( ruleXorExpression EOF )
            // InternalPortugol.g:763:1: ruleXorExpression EOF
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
    // InternalPortugol.g:770:1: ruleXorExpression : ( ( rule__XorExpression__Group__0 ) ) ;
    public final void ruleXorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:774:2: ( ( ( rule__XorExpression__Group__0 ) ) )
            // InternalPortugol.g:775:2: ( ( rule__XorExpression__Group__0 ) )
            {
            // InternalPortugol.g:775:2: ( ( rule__XorExpression__Group__0 ) )
            // InternalPortugol.g:776:3: ( rule__XorExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:777:3: ( rule__XorExpression__Group__0 )
            // InternalPortugol.g:777:4: rule__XorExpression__Group__0
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
    // InternalPortugol.g:786:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:787:1: ( ruleAndExpression EOF )
            // InternalPortugol.g:788:1: ruleAndExpression EOF
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
    // InternalPortugol.g:795:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:799:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalPortugol.g:800:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalPortugol.g:800:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalPortugol.g:801:3: ( rule__AndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:802:3: ( rule__AndExpression__Group__0 )
            // InternalPortugol.g:802:4: rule__AndExpression__Group__0
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
    // InternalPortugol.g:811:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalPortugol.g:812:1: ( ruleComparison EOF )
            // InternalPortugol.g:813:1: ruleComparison EOF
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
    // InternalPortugol.g:820:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:824:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalPortugol.g:825:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalPortugol.g:825:2: ( ( rule__Comparison__Group__0 ) )
            // InternalPortugol.g:826:3: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // InternalPortugol.g:827:3: ( rule__Comparison__Group__0 )
            // InternalPortugol.g:827:4: rule__Comparison__Group__0
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
    // InternalPortugol.g:836:1: entryRuleEquExpression : ruleEquExpression EOF ;
    public final void entryRuleEquExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:837:1: ( ruleEquExpression EOF )
            // InternalPortugol.g:838:1: ruleEquExpression EOF
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
    // InternalPortugol.g:845:1: ruleEquExpression : ( ( rule__EquExpression__Group__0 ) ) ;
    public final void ruleEquExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:849:2: ( ( ( rule__EquExpression__Group__0 ) ) )
            // InternalPortugol.g:850:2: ( ( rule__EquExpression__Group__0 ) )
            {
            // InternalPortugol.g:850:2: ( ( rule__EquExpression__Group__0 ) )
            // InternalPortugol.g:851:3: ( rule__EquExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:852:3: ( rule__EquExpression__Group__0 )
            // InternalPortugol.g:852:4: rule__EquExpression__Group__0
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
    // InternalPortugol.g:861:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:862:1: ( ruleAddExpression EOF )
            // InternalPortugol.g:863:1: ruleAddExpression EOF
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
    // InternalPortugol.g:870:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:874:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // InternalPortugol.g:875:2: ( ( rule__AddExpression__Group__0 ) )
            {
            // InternalPortugol.g:875:2: ( ( rule__AddExpression__Group__0 ) )
            // InternalPortugol.g:876:3: ( rule__AddExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:877:3: ( rule__AddExpression__Group__0 )
            // InternalPortugol.g:877:4: rule__AddExpression__Group__0
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
    // InternalPortugol.g:886:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:887:1: ( ruleMultiplicativeExpression EOF )
            // InternalPortugol.g:888:1: ruleMultiplicativeExpression EOF
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
    // InternalPortugol.g:895:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:899:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // InternalPortugol.g:900:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // InternalPortugol.g:900:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // InternalPortugol.g:901:3: ( rule__MultiplicativeExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:902:3: ( rule__MultiplicativeExpression__Group__0 )
            // InternalPortugol.g:902:4: rule__MultiplicativeExpression__Group__0
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
    // InternalPortugol.g:911:1: entryRulePowerExpression : rulePowerExpression EOF ;
    public final void entryRulePowerExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:912:1: ( rulePowerExpression EOF )
            // InternalPortugol.g:913:1: rulePowerExpression EOF
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
    // InternalPortugol.g:920:1: rulePowerExpression : ( ( rule__PowerExpression__Group__0 ) ) ;
    public final void rulePowerExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:924:2: ( ( ( rule__PowerExpression__Group__0 ) ) )
            // InternalPortugol.g:925:2: ( ( rule__PowerExpression__Group__0 ) )
            {
            // InternalPortugol.g:925:2: ( ( rule__PowerExpression__Group__0 ) )
            // InternalPortugol.g:926:3: ( rule__PowerExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:927:3: ( rule__PowerExpression__Group__0 )
            // InternalPortugol.g:927:4: rule__PowerExpression__Group__0
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
    // InternalPortugol.g:936:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:937:1: ( ruleUnaryExpression EOF )
            // InternalPortugol.g:938:1: ruleUnaryExpression EOF
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
    // InternalPortugol.g:945:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:949:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // InternalPortugol.g:950:2: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // InternalPortugol.g:950:2: ( ( rule__UnaryExpression__Alternatives ) )
            // InternalPortugol.g:951:3: ( rule__UnaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            }
            // InternalPortugol.g:952:3: ( rule__UnaryExpression__Alternatives )
            // InternalPortugol.g:952:4: rule__UnaryExpression__Alternatives
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
    // InternalPortugol.g:961:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:962:1: ( rulePrimaryExpression EOF )
            // InternalPortugol.g:963:1: rulePrimaryExpression EOF
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
    // InternalPortugol.g:970:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:974:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalPortugol.g:975:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalPortugol.g:975:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalPortugol.g:976:3: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // InternalPortugol.g:977:3: ( rule__PrimaryExpression__Alternatives )
            // InternalPortugol.g:977:4: rule__PrimaryExpression__Alternatives
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
    // InternalPortugol.g:986:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalPortugol.g:987:1: ( ruleFunctionCall EOF )
            // InternalPortugol.g:988:1: ruleFunctionCall EOF
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
    // InternalPortugol.g:995:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:999:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalPortugol.g:1000:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalPortugol.g:1000:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalPortugol.g:1001:3: ( rule__FunctionCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup()); 
            }
            // InternalPortugol.g:1002:3: ( rule__FunctionCall__Group__0 )
            // InternalPortugol.g:1002:4: rule__FunctionCall__Group__0
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
    // InternalPortugol.g:1011:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalPortugol.g:1012:1: ( ruleLiteral EOF )
            // InternalPortugol.g:1013:1: ruleLiteral EOF
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
    // InternalPortugol.g:1020:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1024:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalPortugol.g:1025:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalPortugol.g:1025:2: ( ( rule__Literal__Alternatives ) )
            // InternalPortugol.g:1026:3: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalPortugol.g:1027:3: ( rule__Literal__Alternatives )
            // InternalPortugol.g:1027:4: rule__Literal__Alternatives
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
    // InternalPortugol.g:1036:1: entryRuleDeclaredVar : ruleDeclaredVar EOF ;
    public final void entryRuleDeclaredVar() throws RecognitionException {
        try {
            // InternalPortugol.g:1037:1: ( ruleDeclaredVar EOF )
            // InternalPortugol.g:1038:1: ruleDeclaredVar EOF
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
    // InternalPortugol.g:1045:1: ruleDeclaredVar : ( ( rule__DeclaredVar__VarNameAssignment ) ) ;
    public final void ruleDeclaredVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1049:2: ( ( ( rule__DeclaredVar__VarNameAssignment ) ) )
            // InternalPortugol.g:1050:2: ( ( rule__DeclaredVar__VarNameAssignment ) )
            {
            // InternalPortugol.g:1050:2: ( ( rule__DeclaredVar__VarNameAssignment ) )
            // InternalPortugol.g:1051:3: ( rule__DeclaredVar__VarNameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getVarNameAssignment()); 
            }
            // InternalPortugol.g:1052:3: ( rule__DeclaredVar__VarNameAssignment )
            // InternalPortugol.g:1052:4: rule__DeclaredVar__VarNameAssignment
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
    // InternalPortugol.g:1061:1: entryRuleNumericLiteral : ruleNumericLiteral EOF ;
    public final void entryRuleNumericLiteral() throws RecognitionException {
        try {
            // InternalPortugol.g:1062:1: ( ruleNumericLiteral EOF )
            // InternalPortugol.g:1063:1: ruleNumericLiteral EOF
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
    // InternalPortugol.g:1070:1: ruleNumericLiteral : ( ( rule__NumericLiteral__Alternatives ) ) ;
    public final void ruleNumericLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1074:2: ( ( ( rule__NumericLiteral__Alternatives ) ) )
            // InternalPortugol.g:1075:2: ( ( rule__NumericLiteral__Alternatives ) )
            {
            // InternalPortugol.g:1075:2: ( ( rule__NumericLiteral__Alternatives ) )
            // InternalPortugol.g:1076:3: ( rule__NumericLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericLiteralAccess().getAlternatives()); 
            }
            // InternalPortugol.g:1077:3: ( rule__NumericLiteral__Alternatives )
            // InternalPortugol.g:1077:4: rule__NumericLiteral__Alternatives
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
    // InternalPortugol.g:1086:1: entryRuleStringExpression : ruleStringExpression EOF ;
    public final void entryRuleStringExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:1087:1: ( ruleStringExpression EOF )
            // InternalPortugol.g:1088:1: ruleStringExpression EOF
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
    // InternalPortugol.g:1095:1: ruleStringExpression : ( ( rule__StringExpression__LiteralStringAssignment ) ) ;
    public final void ruleStringExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1099:2: ( ( ( rule__StringExpression__LiteralStringAssignment ) ) )
            // InternalPortugol.g:1100:2: ( ( rule__StringExpression__LiteralStringAssignment ) )
            {
            // InternalPortugol.g:1100:2: ( ( rule__StringExpression__LiteralStringAssignment ) )
            // InternalPortugol.g:1101:3: ( rule__StringExpression__LiteralStringAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringExpressionAccess().getLiteralStringAssignment()); 
            }
            // InternalPortugol.g:1102:3: ( rule__StringExpression__LiteralStringAssignment )
            // InternalPortugol.g:1102:4: rule__StringExpression__LiteralStringAssignment
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


    // $ANTLR start "rule__VarType__TypeNameAlternatives_0"
    // InternalPortugol.g:1110:1: rule__VarType__TypeNameAlternatives_0 : ( ( 'real' ) | ( 'inteiro' ) | ( 'caractere' ) | ( 'caracter' ) );
    public final void rule__VarType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1114:1: ( ( 'real' ) | ( 'inteiro' ) | ( 'caractere' ) | ( 'caracter' ) )
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
                    // InternalPortugol.g:1115:2: ( 'real' )
                    {
                    // InternalPortugol.g:1115:2: ( 'real' )
                    // InternalPortugol.g:1116:3: 'real'
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
                    // InternalPortugol.g:1121:2: ( 'inteiro' )
                    {
                    // InternalPortugol.g:1121:2: ( 'inteiro' )
                    // InternalPortugol.g:1122:3: 'inteiro'
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
                    // InternalPortugol.g:1127:2: ( 'caractere' )
                    {
                    // InternalPortugol.g:1127:2: ( 'caractere' )
                    // InternalPortugol.g:1128:3: 'caractere'
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
                    // InternalPortugol.g:1133:2: ( 'caracter' )
                    {
                    // InternalPortugol.g:1133:2: ( 'caracter' )
                    // InternalPortugol.g:1134:3: 'caracter'
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
    // InternalPortugol.g:1143:1: rule__BlockSubPrograms__Alternatives : ( ( ruleBlockFunction ) | ( ruleBlockProcedure ) );
    public final void rule__BlockSubPrograms__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1147:1: ( ( ruleBlockFunction ) | ( ruleBlockProcedure ) )
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
                    // InternalPortugol.g:1148:2: ( ruleBlockFunction )
                    {
                    // InternalPortugol.g:1148:2: ( ruleBlockFunction )
                    // InternalPortugol.g:1149:3: ruleBlockFunction
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
                    // InternalPortugol.g:1154:2: ( ruleBlockProcedure )
                    {
                    // InternalPortugol.g:1154:2: ( ruleBlockProcedure )
                    // InternalPortugol.g:1155:3: ruleBlockProcedure
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
    // InternalPortugol.g:1164:1: rule__AbstractCommand__Alternatives : ( ( ( rule__AbstractCommand__Group_0__0 ) ) | ( ( rule__AbstractCommand__Group_1__0 ) ) | ( ( rule__AbstractCommand__Group_2__0 ) ) | ( ( rule__AbstractCommand__Group_3__0 ) ) | ( ( rule__AbstractCommand__Group_4__0 ) ) );
    public final void rule__AbstractCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1168:1: ( ( ( rule__AbstractCommand__Group_0__0 ) ) | ( ( rule__AbstractCommand__Group_1__0 ) ) | ( ( rule__AbstractCommand__Group_2__0 ) ) | ( ( rule__AbstractCommand__Group_3__0 ) ) | ( ( rule__AbstractCommand__Group_4__0 ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 54:
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
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalPortugol.g:1169:2: ( ( rule__AbstractCommand__Group_0__0 ) )
                    {
                    // InternalPortugol.g:1169:2: ( ( rule__AbstractCommand__Group_0__0 ) )
                    // InternalPortugol.g:1170:3: ( rule__AbstractCommand__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_0()); 
                    }
                    // InternalPortugol.g:1171:3: ( rule__AbstractCommand__Group_0__0 )
                    // InternalPortugol.g:1171:4: rule__AbstractCommand__Group_0__0
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
                    // InternalPortugol.g:1175:2: ( ( rule__AbstractCommand__Group_1__0 ) )
                    {
                    // InternalPortugol.g:1175:2: ( ( rule__AbstractCommand__Group_1__0 ) )
                    // InternalPortugol.g:1176:3: ( rule__AbstractCommand__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_1()); 
                    }
                    // InternalPortugol.g:1177:3: ( rule__AbstractCommand__Group_1__0 )
                    // InternalPortugol.g:1177:4: rule__AbstractCommand__Group_1__0
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
                    // InternalPortugol.g:1181:2: ( ( rule__AbstractCommand__Group_2__0 ) )
                    {
                    // InternalPortugol.g:1181:2: ( ( rule__AbstractCommand__Group_2__0 ) )
                    // InternalPortugol.g:1182:3: ( rule__AbstractCommand__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_2()); 
                    }
                    // InternalPortugol.g:1183:3: ( rule__AbstractCommand__Group_2__0 )
                    // InternalPortugol.g:1183:4: rule__AbstractCommand__Group_2__0
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
                    // InternalPortugol.g:1187:2: ( ( rule__AbstractCommand__Group_3__0 ) )
                    {
                    // InternalPortugol.g:1187:2: ( ( rule__AbstractCommand__Group_3__0 ) )
                    // InternalPortugol.g:1188:3: ( rule__AbstractCommand__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_3()); 
                    }
                    // InternalPortugol.g:1189:3: ( rule__AbstractCommand__Group_3__0 )
                    // InternalPortugol.g:1189:4: rule__AbstractCommand__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractCommand__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractCommandAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPortugol.g:1193:2: ( ( rule__AbstractCommand__Group_4__0 ) )
                    {
                    // InternalPortugol.g:1193:2: ( ( rule__AbstractCommand__Group_4__0 ) )
                    // InternalPortugol.g:1194:3: ( rule__AbstractCommand__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_4()); 
                    }
                    // InternalPortugol.g:1195:3: ( rule__AbstractCommand__Group_4__0 )
                    // InternalPortugol.g:1195:4: rule__AbstractCommand__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractCommand__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractCommandAccess().getGroup_4()); 
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
    // InternalPortugol.g:1203:1: rule__WriteCommand__WriteCommandAlternatives_0_0 : ( ( 'escreva' ) | ( 'escreval' ) );
    public final void rule__WriteCommand__WriteCommandAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1207:1: ( ( 'escreva' ) | ( 'escreval' ) )
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
                    // InternalPortugol.g:1208:2: ( 'escreva' )
                    {
                    // InternalPortugol.g:1208:2: ( 'escreva' )
                    // InternalPortugol.g:1209:3: 'escreva'
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
                    // InternalPortugol.g:1214:2: ( 'escreval' )
                    {
                    // InternalPortugol.g:1214:2: ( 'escreval' )
                    // InternalPortugol.g:1215:3: 'escreval'
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
    // InternalPortugol.g:1224:1: rule__AndExpression__OpAlternatives_1_0_0_1_0 : ( ( '&' ) | ( 'E' ) );
    public final void rule__AndExpression__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1228:1: ( ( '&' ) | ( 'E' ) )
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
                    // InternalPortugol.g:1229:2: ( '&' )
                    {
                    // InternalPortugol.g:1229:2: ( '&' )
                    // InternalPortugol.g:1230:3: '&'
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
                    // InternalPortugol.g:1235:2: ( 'E' )
                    {
                    // InternalPortugol.g:1235:2: ( 'E' )
                    // InternalPortugol.g:1236:3: 'E'
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
    // InternalPortugol.g:1245:1: rule__Comparison__OpAlternatives_1_0_0_1_0 : ( ( '=' ) | ( '<>' ) );
    public final void rule__Comparison__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1249:1: ( ( '=' ) | ( '<>' ) )
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
                    // InternalPortugol.g:1250:2: ( '=' )
                    {
                    // InternalPortugol.g:1250:2: ( '=' )
                    // InternalPortugol.g:1251:3: '='
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
                    // InternalPortugol.g:1256:2: ( '<>' )
                    {
                    // InternalPortugol.g:1256:2: ( '<>' )
                    // InternalPortugol.g:1257:3: '<>'
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
    // InternalPortugol.g:1266:1: rule__EquExpression__OpAlternatives_1_0_0_1_0 : ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__EquExpression__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1270:1: ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
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
                    // InternalPortugol.g:1271:2: ( '<' )
                    {
                    // InternalPortugol.g:1271:2: ( '<' )
                    // InternalPortugol.g:1272:3: '<'
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
                    // InternalPortugol.g:1277:2: ( '>' )
                    {
                    // InternalPortugol.g:1277:2: ( '>' )
                    // InternalPortugol.g:1278:3: '>'
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
                    // InternalPortugol.g:1283:2: ( '<=' )
                    {
                    // InternalPortugol.g:1283:2: ( '<=' )
                    // InternalPortugol.g:1284:3: '<='
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
                    // InternalPortugol.g:1289:2: ( '>=' )
                    {
                    // InternalPortugol.g:1289:2: ( '>=' )
                    // InternalPortugol.g:1290:3: '>='
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
    // InternalPortugol.g:1299:1: rule__AddExpression__OpAlternatives_1_0_0_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__AddExpression__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1303:1: ( ( '+' ) | ( '-' ) )
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
                    // InternalPortugol.g:1304:2: ( '+' )
                    {
                    // InternalPortugol.g:1304:2: ( '+' )
                    // InternalPortugol.g:1305:3: '+'
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
                    // InternalPortugol.g:1310:2: ( '-' )
                    {
                    // InternalPortugol.g:1310:2: ( '-' )
                    // InternalPortugol.g:1311:3: '-'
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
    // InternalPortugol.g:1320:1: rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 : ( ( '*' ) | ( '/' ) | ( 'MOD' ) | ( '%' ) );
    public final void rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1324:1: ( ( '*' ) | ( '/' ) | ( 'MOD' ) | ( '%' ) )
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
                    // InternalPortugol.g:1325:2: ( '*' )
                    {
                    // InternalPortugol.g:1325:2: ( '*' )
                    // InternalPortugol.g:1326:3: '*'
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
                    // InternalPortugol.g:1331:2: ( '/' )
                    {
                    // InternalPortugol.g:1331:2: ( '/' )
                    // InternalPortugol.g:1332:3: '/'
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
                    // InternalPortugol.g:1337:2: ( 'MOD' )
                    {
                    // InternalPortugol.g:1337:2: ( 'MOD' )
                    // InternalPortugol.g:1338:3: 'MOD'
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
                    // InternalPortugol.g:1343:2: ( '%' )
                    {
                    // InternalPortugol.g:1343:2: ( '%' )
                    // InternalPortugol.g:1344:3: '%'
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
    // InternalPortugol.g:1353:1: rule__UnaryExpression__Alternatives : ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( rulePrimaryExpression ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1357:1: ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( rulePrimaryExpression ) )
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
                    // InternalPortugol.g:1358:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    {
                    // InternalPortugol.g:1358:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    // InternalPortugol.g:1359:3: ( rule__UnaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    }
                    // InternalPortugol.g:1360:3: ( rule__UnaryExpression__Group_0__0 )
                    // InternalPortugol.g:1360:4: rule__UnaryExpression__Group_0__0
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
                    // InternalPortugol.g:1364:2: ( rulePrimaryExpression )
                    {
                    // InternalPortugol.g:1364:2: ( rulePrimaryExpression )
                    // InternalPortugol.g:1365:3: rulePrimaryExpression
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
    // InternalPortugol.g:1374:1: rule__UnaryExpression__OpAlternatives_0_1_0 : ( ( 'NOT' ) | ( '-' ) );
    public final void rule__UnaryExpression__OpAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1378:1: ( ( 'NOT' ) | ( '-' ) )
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
                    // InternalPortugol.g:1379:2: ( 'NOT' )
                    {
                    // InternalPortugol.g:1379:2: ( 'NOT' )
                    // InternalPortugol.g:1380:3: 'NOT'
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
                    // InternalPortugol.g:1385:2: ( '-' )
                    {
                    // InternalPortugol.g:1385:2: ( '-' )
                    // InternalPortugol.g:1386:3: '-'
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
    // InternalPortugol.g:1395:1: rule__PrimaryExpression__Alternatives : ( ( ruleLiteral ) | ( ruleFunctionCall ) | ( ruleDeclaredVar ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1399:1: ( ( ruleLiteral ) | ( ruleFunctionCall ) | ( ruleDeclaredVar ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) )
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

                if ( (LA13_2==39) ) {
                    alt13=2;
                }
                else if ( (LA13_2==EOF||LA13_2==RULE_END_COMMAND||(LA13_2>=19 && LA13_2<=32)||(LA13_2>=36 && LA13_2<=37)||LA13_2==40||LA13_2==47||(LA13_2>=56 && LA13_2<=59)) ) {
                    alt13=3;
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
                    // InternalPortugol.g:1400:2: ( ruleLiteral )
                    {
                    // InternalPortugol.g:1400:2: ( ruleLiteral )
                    // InternalPortugol.g:1401:3: ruleLiteral
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
                    // InternalPortugol.g:1406:2: ( ruleFunctionCall )
                    {
                    // InternalPortugol.g:1406:2: ( ruleFunctionCall )
                    // InternalPortugol.g:1407:3: ruleFunctionCall
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
                    // InternalPortugol.g:1412:2: ( ruleDeclaredVar )
                    {
                    // InternalPortugol.g:1412:2: ( ruleDeclaredVar )
                    // InternalPortugol.g:1413:3: ruleDeclaredVar
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
                    // InternalPortugol.g:1418:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    {
                    // InternalPortugol.g:1418:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    // InternalPortugol.g:1419:3: ( rule__PrimaryExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 
                    }
                    // InternalPortugol.g:1420:3: ( rule__PrimaryExpression__Group_3__0 )
                    // InternalPortugol.g:1420:4: rule__PrimaryExpression__Group_3__0
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
    // InternalPortugol.g:1428:1: rule__Literal__Alternatives : ( ( ruleNumericLiteral ) | ( ruleStringExpression ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1432:1: ( ( ruleNumericLiteral ) | ( ruleStringExpression ) )
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
                    // InternalPortugol.g:1433:2: ( ruleNumericLiteral )
                    {
                    // InternalPortugol.g:1433:2: ( ruleNumericLiteral )
                    // InternalPortugol.g:1434:3: ruleNumericLiteral
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
                    // InternalPortugol.g:1439:2: ( ruleStringExpression )
                    {
                    // InternalPortugol.g:1439:2: ( ruleStringExpression )
                    // InternalPortugol.g:1440:3: ruleStringExpression
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
    // InternalPortugol.g:1449:1: rule__NumericLiteral__Alternatives : ( ( ( rule__NumericLiteral__IntValueAssignment_0 ) ) | ( ( rule__NumericLiteral__FloatValueAssignment_1 ) ) );
    public final void rule__NumericLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1453:1: ( ( ( rule__NumericLiteral__IntValueAssignment_0 ) ) | ( ( rule__NumericLiteral__FloatValueAssignment_1 ) ) )
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
                    // InternalPortugol.g:1454:2: ( ( rule__NumericLiteral__IntValueAssignment_0 ) )
                    {
                    // InternalPortugol.g:1454:2: ( ( rule__NumericLiteral__IntValueAssignment_0 ) )
                    // InternalPortugol.g:1455:3: ( rule__NumericLiteral__IntValueAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericLiteralAccess().getIntValueAssignment_0()); 
                    }
                    // InternalPortugol.g:1456:3: ( rule__NumericLiteral__IntValueAssignment_0 )
                    // InternalPortugol.g:1456:4: rule__NumericLiteral__IntValueAssignment_0
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
                    // InternalPortugol.g:1460:2: ( ( rule__NumericLiteral__FloatValueAssignment_1 ) )
                    {
                    // InternalPortugol.g:1460:2: ( ( rule__NumericLiteral__FloatValueAssignment_1 ) )
                    // InternalPortugol.g:1461:3: ( rule__NumericLiteral__FloatValueAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericLiteralAccess().getFloatValueAssignment_1()); 
                    }
                    // InternalPortugol.g:1462:3: ( rule__NumericLiteral__FloatValueAssignment_1 )
                    // InternalPortugol.g:1462:4: rule__NumericLiteral__FloatValueAssignment_1
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
    // InternalPortugol.g:1470:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1474:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalPortugol.g:1475:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalPortugol.g:1482:1: rule__Model__Group__0__Impl : ( ( rule__Model__HeaderAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1486:1: ( ( ( rule__Model__HeaderAssignment_0 ) ) )
            // InternalPortugol.g:1487:1: ( ( rule__Model__HeaderAssignment_0 ) )
            {
            // InternalPortugol.g:1487:1: ( ( rule__Model__HeaderAssignment_0 ) )
            // InternalPortugol.g:1488:2: ( rule__Model__HeaderAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getHeaderAssignment_0()); 
            }
            // InternalPortugol.g:1489:2: ( rule__Model__HeaderAssignment_0 )
            // InternalPortugol.g:1489:3: rule__Model__HeaderAssignment_0
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
    // InternalPortugol.g:1497:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1501:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalPortugol.g:1502:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalPortugol.g:1509:1: rule__Model__Group__1__Impl : ( ( rule__Model__GlobalDeclarationsAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1513:1: ( ( ( rule__Model__GlobalDeclarationsAssignment_1 ) ) )
            // InternalPortugol.g:1514:1: ( ( rule__Model__GlobalDeclarationsAssignment_1 ) )
            {
            // InternalPortugol.g:1514:1: ( ( rule__Model__GlobalDeclarationsAssignment_1 ) )
            // InternalPortugol.g:1515:2: ( rule__Model__GlobalDeclarationsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGlobalDeclarationsAssignment_1()); 
            }
            // InternalPortugol.g:1516:2: ( rule__Model__GlobalDeclarationsAssignment_1 )
            // InternalPortugol.g:1516:3: rule__Model__GlobalDeclarationsAssignment_1
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
    // InternalPortugol.g:1524:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1528:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalPortugol.g:1529:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalPortugol.g:1536:1: rule__Model__Group__2__Impl : ( ( rule__Model__SubprogramsAssignment_2 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1540:1: ( ( ( rule__Model__SubprogramsAssignment_2 )? ) )
            // InternalPortugol.g:1541:1: ( ( rule__Model__SubprogramsAssignment_2 )? )
            {
            // InternalPortugol.g:1541:1: ( ( rule__Model__SubprogramsAssignment_2 )? )
            // InternalPortugol.g:1542:2: ( rule__Model__SubprogramsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSubprogramsAssignment_2()); 
            }
            // InternalPortugol.g:1543:2: ( rule__Model__SubprogramsAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38||LA16_0==43) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPortugol.g:1543:3: rule__Model__SubprogramsAssignment_2
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
    // InternalPortugol.g:1551:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1555:1: ( rule__Model__Group__3__Impl )
            // InternalPortugol.g:1556:2: rule__Model__Group__3__Impl
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
    // InternalPortugol.g:1562:1: rule__Model__Group__3__Impl : ( ( rule__Model__CommandsAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1566:1: ( ( ( rule__Model__CommandsAssignment_3 ) ) )
            // InternalPortugol.g:1567:1: ( ( rule__Model__CommandsAssignment_3 ) )
            {
            // InternalPortugol.g:1567:1: ( ( rule__Model__CommandsAssignment_3 ) )
            // InternalPortugol.g:1568:2: ( rule__Model__CommandsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugol.g:1569:2: ( rule__Model__CommandsAssignment_3 )
            // InternalPortugol.g:1569:3: rule__Model__CommandsAssignment_3
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
    // InternalPortugol.g:1578:1: rule__HeaderBlock__Group__0 : rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1 ;
    public final void rule__HeaderBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1582:1: ( rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1 )
            // InternalPortugol.g:1583:2: rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1
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
    // InternalPortugol.g:1590:1: rule__HeaderBlock__Group__0__Impl : ( 'algoritmo' ) ;
    public final void rule__HeaderBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1594:1: ( ( 'algoritmo' ) )
            // InternalPortugol.g:1595:1: ( 'algoritmo' )
            {
            // InternalPortugol.g:1595:1: ( 'algoritmo' )
            // InternalPortugol.g:1596:2: 'algoritmo'
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
    // InternalPortugol.g:1605:1: rule__HeaderBlock__Group__1 : rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2 ;
    public final void rule__HeaderBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1609:1: ( rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2 )
            // InternalPortugol.g:1610:2: rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2
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
    // InternalPortugol.g:1617:1: rule__HeaderBlock__Group__1__Impl : ( ( rule__HeaderBlock__AlgorithmNameAssignment_1 ) ) ;
    public final void rule__HeaderBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1621:1: ( ( ( rule__HeaderBlock__AlgorithmNameAssignment_1 ) ) )
            // InternalPortugol.g:1622:1: ( ( rule__HeaderBlock__AlgorithmNameAssignment_1 ) )
            {
            // InternalPortugol.g:1622:1: ( ( rule__HeaderBlock__AlgorithmNameAssignment_1 ) )
            // InternalPortugol.g:1623:2: ( rule__HeaderBlock__AlgorithmNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderBlockAccess().getAlgorithmNameAssignment_1()); 
            }
            // InternalPortugol.g:1624:2: ( rule__HeaderBlock__AlgorithmNameAssignment_1 )
            // InternalPortugol.g:1624:3: rule__HeaderBlock__AlgorithmNameAssignment_1
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
    // InternalPortugol.g:1632:1: rule__HeaderBlock__Group__2 : rule__HeaderBlock__Group__2__Impl ;
    public final void rule__HeaderBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1636:1: ( rule__HeaderBlock__Group__2__Impl )
            // InternalPortugol.g:1637:2: rule__HeaderBlock__Group__2__Impl
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
    // InternalPortugol.g:1643:1: rule__HeaderBlock__Group__2__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__HeaderBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1647:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:1648:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:1648:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:1649:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderBlockAccess().getEND_COMMANDTerminalRuleCall_2()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderBlockAccess().getEND_COMMANDTerminalRuleCall_2()); 
            }

            }


            }

        }
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
    // InternalPortugol.g:1659:1: rule__DeclarationsBlock__Group__0 : rule__DeclarationsBlock__Group__0__Impl rule__DeclarationsBlock__Group__1 ;
    public final void rule__DeclarationsBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1663:1: ( rule__DeclarationsBlock__Group__0__Impl rule__DeclarationsBlock__Group__1 )
            // InternalPortugol.g:1664:2: rule__DeclarationsBlock__Group__0__Impl rule__DeclarationsBlock__Group__1
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
    // InternalPortugol.g:1671:1: rule__DeclarationsBlock__Group__0__Impl : ( 'var' ) ;
    public final void rule__DeclarationsBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1675:1: ( ( 'var' ) )
            // InternalPortugol.g:1676:1: ( 'var' )
            {
            // InternalPortugol.g:1676:1: ( 'var' )
            // InternalPortugol.g:1677:2: 'var'
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
    // InternalPortugol.g:1686:1: rule__DeclarationsBlock__Group__1 : rule__DeclarationsBlock__Group__1__Impl rule__DeclarationsBlock__Group__2 ;
    public final void rule__DeclarationsBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1690:1: ( rule__DeclarationsBlock__Group__1__Impl rule__DeclarationsBlock__Group__2 )
            // InternalPortugol.g:1691:2: rule__DeclarationsBlock__Group__1__Impl rule__DeclarationsBlock__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__DeclarationsBlock__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DeclarationsBlock__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPortugol.g:1698:1: rule__DeclarationsBlock__Group__1__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__DeclarationsBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1702:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:1703:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:1703:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:1704:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getEND_COMMANDTerminalRuleCall_1()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationsBlockAccess().getEND_COMMANDTerminalRuleCall_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__DeclarationsBlock__Group__2"
    // InternalPortugol.g:1713:1: rule__DeclarationsBlock__Group__2 : rule__DeclarationsBlock__Group__2__Impl ;
    public final void rule__DeclarationsBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1717:1: ( rule__DeclarationsBlock__Group__2__Impl )
            // InternalPortugol.g:1718:2: rule__DeclarationsBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclarationsBlock__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationsBlock__Group__2"


    // $ANTLR start "rule__DeclarationsBlock__Group__2__Impl"
    // InternalPortugol.g:1724:1: rule__DeclarationsBlock__Group__2__Impl : ( ( ( rule__DeclarationsBlock__Group_2__0 ) ) ( ( rule__DeclarationsBlock__Group_2__0 )* ) ) ;
    public final void rule__DeclarationsBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1728:1: ( ( ( ( rule__DeclarationsBlock__Group_2__0 ) ) ( ( rule__DeclarationsBlock__Group_2__0 )* ) ) )
            // InternalPortugol.g:1729:1: ( ( ( rule__DeclarationsBlock__Group_2__0 ) ) ( ( rule__DeclarationsBlock__Group_2__0 )* ) )
            {
            // InternalPortugol.g:1729:1: ( ( ( rule__DeclarationsBlock__Group_2__0 ) ) ( ( rule__DeclarationsBlock__Group_2__0 )* ) )
            // InternalPortugol.g:1730:2: ( ( rule__DeclarationsBlock__Group_2__0 ) ) ( ( rule__DeclarationsBlock__Group_2__0 )* )
            {
            // InternalPortugol.g:1730:2: ( ( rule__DeclarationsBlock__Group_2__0 ) )
            // InternalPortugol.g:1731:3: ( rule__DeclarationsBlock__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getGroup_2()); 
            }
            // InternalPortugol.g:1732:3: ( rule__DeclarationsBlock__Group_2__0 )
            // InternalPortugol.g:1732:4: rule__DeclarationsBlock__Group_2__0
            {
            pushFollow(FOLLOW_9);
            rule__DeclarationsBlock__Group_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationsBlockAccess().getGroup_2()); 
            }

            }

            // InternalPortugol.g:1735:2: ( ( rule__DeclarationsBlock__Group_2__0 )* )
            // InternalPortugol.g:1736:3: ( rule__DeclarationsBlock__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getGroup_2()); 
            }
            // InternalPortugol.g:1737:3: ( rule__DeclarationsBlock__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPortugol.g:1737:4: rule__DeclarationsBlock__Group_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DeclarationsBlock__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationsBlockAccess().getGroup_2()); 
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
    // $ANTLR end "rule__DeclarationsBlock__Group__2__Impl"


    // $ANTLR start "rule__DeclarationsBlock__Group_2__0"
    // InternalPortugol.g:1747:1: rule__DeclarationsBlock__Group_2__0 : rule__DeclarationsBlock__Group_2__0__Impl rule__DeclarationsBlock__Group_2__1 ;
    public final void rule__DeclarationsBlock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1751:1: ( rule__DeclarationsBlock__Group_2__0__Impl rule__DeclarationsBlock__Group_2__1 )
            // InternalPortugol.g:1752:2: rule__DeclarationsBlock__Group_2__0__Impl rule__DeclarationsBlock__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__DeclarationsBlock__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DeclarationsBlock__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationsBlock__Group_2__0"


    // $ANTLR start "rule__DeclarationsBlock__Group_2__0__Impl"
    // InternalPortugol.g:1759:1: rule__DeclarationsBlock__Group_2__0__Impl : ( ( rule__DeclarationsBlock__VarsAssignment_2_0 ) ) ;
    public final void rule__DeclarationsBlock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1763:1: ( ( ( rule__DeclarationsBlock__VarsAssignment_2_0 ) ) )
            // InternalPortugol.g:1764:1: ( ( rule__DeclarationsBlock__VarsAssignment_2_0 ) )
            {
            // InternalPortugol.g:1764:1: ( ( rule__DeclarationsBlock__VarsAssignment_2_0 ) )
            // InternalPortugol.g:1765:2: ( rule__DeclarationsBlock__VarsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getVarsAssignment_2_0()); 
            }
            // InternalPortugol.g:1766:2: ( rule__DeclarationsBlock__VarsAssignment_2_0 )
            // InternalPortugol.g:1766:3: rule__DeclarationsBlock__VarsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__DeclarationsBlock__VarsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationsBlockAccess().getVarsAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationsBlock__Group_2__0__Impl"


    // $ANTLR start "rule__DeclarationsBlock__Group_2__1"
    // InternalPortugol.g:1774:1: rule__DeclarationsBlock__Group_2__1 : rule__DeclarationsBlock__Group_2__1__Impl ;
    public final void rule__DeclarationsBlock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1778:1: ( rule__DeclarationsBlock__Group_2__1__Impl )
            // InternalPortugol.g:1779:2: rule__DeclarationsBlock__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclarationsBlock__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationsBlock__Group_2__1"


    // $ANTLR start "rule__DeclarationsBlock__Group_2__1__Impl"
    // InternalPortugol.g:1785:1: rule__DeclarationsBlock__Group_2__1__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__DeclarationsBlock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1789:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:1790:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:1790:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:1791:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getEND_COMMANDTerminalRuleCall_2_1()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationsBlockAccess().getEND_COMMANDTerminalRuleCall_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationsBlock__Group_2__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalPortugol.g:1801:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1805:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalPortugol.g:1806:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalPortugol.g:1813:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__VarDeclarationAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1817:1: ( ( ( rule__Variable__VarDeclarationAssignment_0 ) ) )
            // InternalPortugol.g:1818:1: ( ( rule__Variable__VarDeclarationAssignment_0 ) )
            {
            // InternalPortugol.g:1818:1: ( ( rule__Variable__VarDeclarationAssignment_0 ) )
            // InternalPortugol.g:1819:2: ( rule__Variable__VarDeclarationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getVarDeclarationAssignment_0()); 
            }
            // InternalPortugol.g:1820:2: ( rule__Variable__VarDeclarationAssignment_0 )
            // InternalPortugol.g:1820:3: rule__Variable__VarDeclarationAssignment_0
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
    // InternalPortugol.g:1828:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1832:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalPortugol.g:1833:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
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
    // InternalPortugol.g:1840:1: rule__Variable__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1844:1: ( ( ':' ) )
            // InternalPortugol.g:1845:1: ( ':' )
            {
            // InternalPortugol.g:1845:1: ( ':' )
            // InternalPortugol.g:1846:2: ':'
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
    // InternalPortugol.g:1855:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1859:1: ( rule__Variable__Group__2__Impl )
            // InternalPortugol.g:1860:2: rule__Variable__Group__2__Impl
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
    // InternalPortugol.g:1866:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__TypeAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1870:1: ( ( ( rule__Variable__TypeAssignment_2 ) ) )
            // InternalPortugol.g:1871:1: ( ( rule__Variable__TypeAssignment_2 ) )
            {
            // InternalPortugol.g:1871:1: ( ( rule__Variable__TypeAssignment_2 ) )
            // InternalPortugol.g:1872:2: ( rule__Variable__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getTypeAssignment_2()); 
            }
            // InternalPortugol.g:1873:2: ( rule__Variable__TypeAssignment_2 )
            // InternalPortugol.g:1873:3: rule__Variable__TypeAssignment_2
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
    // InternalPortugol.g:1882:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1886:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // InternalPortugol.g:1887:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
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
    // InternalPortugol.g:1894:1: rule__VarDeclaration__Group__0__Impl : ( ( rule__VarDeclaration__VarsAssignment_0 ) ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1898:1: ( ( ( rule__VarDeclaration__VarsAssignment_0 ) ) )
            // InternalPortugol.g:1899:1: ( ( rule__VarDeclaration__VarsAssignment_0 ) )
            {
            // InternalPortugol.g:1899:1: ( ( rule__VarDeclaration__VarsAssignment_0 ) )
            // InternalPortugol.g:1900:2: ( rule__VarDeclaration__VarsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getVarsAssignment_0()); 
            }
            // InternalPortugol.g:1901:2: ( rule__VarDeclaration__VarsAssignment_0 )
            // InternalPortugol.g:1901:3: rule__VarDeclaration__VarsAssignment_0
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
    // InternalPortugol.g:1909:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1913:1: ( rule__VarDeclaration__Group__1__Impl )
            // InternalPortugol.g:1914:2: rule__VarDeclaration__Group__1__Impl
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
    // InternalPortugol.g:1920:1: rule__VarDeclaration__Group__1__Impl : ( ( rule__VarDeclaration__Group_1__0 )* ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1924:1: ( ( ( rule__VarDeclaration__Group_1__0 )* ) )
            // InternalPortugol.g:1925:1: ( ( rule__VarDeclaration__Group_1__0 )* )
            {
            // InternalPortugol.g:1925:1: ( ( rule__VarDeclaration__Group_1__0 )* )
            // InternalPortugol.g:1926:2: ( rule__VarDeclaration__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getGroup_1()); 
            }
            // InternalPortugol.g:1927:2: ( rule__VarDeclaration__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==37) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPortugol.g:1927:3: rule__VarDeclaration__Group_1__0
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
    // InternalPortugol.g:1936:1: rule__VarDeclaration__Group_1__0 : rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1 ;
    public final void rule__VarDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1940:1: ( rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1 )
            // InternalPortugol.g:1941:2: rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1
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
    // InternalPortugol.g:1948:1: rule__VarDeclaration__Group_1__0__Impl : ( ',' ) ;
    public final void rule__VarDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1952:1: ( ( ',' ) )
            // InternalPortugol.g:1953:1: ( ',' )
            {
            // InternalPortugol.g:1953:1: ( ',' )
            // InternalPortugol.g:1954:2: ','
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
    // InternalPortugol.g:1963:1: rule__VarDeclaration__Group_1__1 : rule__VarDeclaration__Group_1__1__Impl ;
    public final void rule__VarDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1967:1: ( rule__VarDeclaration__Group_1__1__Impl )
            // InternalPortugol.g:1968:2: rule__VarDeclaration__Group_1__1__Impl
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
    // InternalPortugol.g:1974:1: rule__VarDeclaration__Group_1__1__Impl : ( ( rule__VarDeclaration__VarsAssignment_1_1 ) ) ;
    public final void rule__VarDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1978:1: ( ( ( rule__VarDeclaration__VarsAssignment_1_1 ) ) )
            // InternalPortugol.g:1979:1: ( ( rule__VarDeclaration__VarsAssignment_1_1 ) )
            {
            // InternalPortugol.g:1979:1: ( ( rule__VarDeclaration__VarsAssignment_1_1 ) )
            // InternalPortugol.g:1980:2: ( rule__VarDeclaration__VarsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getVarsAssignment_1_1()); 
            }
            // InternalPortugol.g:1981:2: ( rule__VarDeclaration__VarsAssignment_1_1 )
            // InternalPortugol.g:1981:3: rule__VarDeclaration__VarsAssignment_1_1
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
    // InternalPortugol.g:1990:1: rule__DeclaredVarList__Group__0 : rule__DeclaredVarList__Group__0__Impl rule__DeclaredVarList__Group__1 ;
    public final void rule__DeclaredVarList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1994:1: ( rule__DeclaredVarList__Group__0__Impl rule__DeclaredVarList__Group__1 )
            // InternalPortugol.g:1995:2: rule__DeclaredVarList__Group__0__Impl rule__DeclaredVarList__Group__1
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
    // InternalPortugol.g:2002:1: rule__DeclaredVarList__Group__0__Impl : ( ( rule__DeclaredVarList__VarsAssignment_0 ) ) ;
    public final void rule__DeclaredVarList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2006:1: ( ( ( rule__DeclaredVarList__VarsAssignment_0 ) ) )
            // InternalPortugol.g:2007:1: ( ( rule__DeclaredVarList__VarsAssignment_0 ) )
            {
            // InternalPortugol.g:2007:1: ( ( rule__DeclaredVarList__VarsAssignment_0 ) )
            // InternalPortugol.g:2008:2: ( rule__DeclaredVarList__VarsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getVarsAssignment_0()); 
            }
            // InternalPortugol.g:2009:2: ( rule__DeclaredVarList__VarsAssignment_0 )
            // InternalPortugol.g:2009:3: rule__DeclaredVarList__VarsAssignment_0
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
    // InternalPortugol.g:2017:1: rule__DeclaredVarList__Group__1 : rule__DeclaredVarList__Group__1__Impl ;
    public final void rule__DeclaredVarList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2021:1: ( rule__DeclaredVarList__Group__1__Impl )
            // InternalPortugol.g:2022:2: rule__DeclaredVarList__Group__1__Impl
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
    // InternalPortugol.g:2028:1: rule__DeclaredVarList__Group__1__Impl : ( ( rule__DeclaredVarList__Group_1__0 )* ) ;
    public final void rule__DeclaredVarList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2032:1: ( ( ( rule__DeclaredVarList__Group_1__0 )* ) )
            // InternalPortugol.g:2033:1: ( ( rule__DeclaredVarList__Group_1__0 )* )
            {
            // InternalPortugol.g:2033:1: ( ( rule__DeclaredVarList__Group_1__0 )* )
            // InternalPortugol.g:2034:2: ( rule__DeclaredVarList__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getGroup_1()); 
            }
            // InternalPortugol.g:2035:2: ( rule__DeclaredVarList__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==37) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPortugol.g:2035:3: rule__DeclaredVarList__Group_1__0
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
    // InternalPortugol.g:2044:1: rule__DeclaredVarList__Group_1__0 : rule__DeclaredVarList__Group_1__0__Impl rule__DeclaredVarList__Group_1__1 ;
    public final void rule__DeclaredVarList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2048:1: ( rule__DeclaredVarList__Group_1__0__Impl rule__DeclaredVarList__Group_1__1 )
            // InternalPortugol.g:2049:2: rule__DeclaredVarList__Group_1__0__Impl rule__DeclaredVarList__Group_1__1
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
    // InternalPortugol.g:2056:1: rule__DeclaredVarList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__DeclaredVarList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2060:1: ( ( ',' ) )
            // InternalPortugol.g:2061:1: ( ',' )
            {
            // InternalPortugol.g:2061:1: ( ',' )
            // InternalPortugol.g:2062:2: ','
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
    // InternalPortugol.g:2071:1: rule__DeclaredVarList__Group_1__1 : rule__DeclaredVarList__Group_1__1__Impl ;
    public final void rule__DeclaredVarList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2075:1: ( rule__DeclaredVarList__Group_1__1__Impl )
            // InternalPortugol.g:2076:2: rule__DeclaredVarList__Group_1__1__Impl
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
    // InternalPortugol.g:2082:1: rule__DeclaredVarList__Group_1__1__Impl : ( ( rule__DeclaredVarList__VarsAssignment_1_1 ) ) ;
    public final void rule__DeclaredVarList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2086:1: ( ( ( rule__DeclaredVarList__VarsAssignment_1_1 ) ) )
            // InternalPortugol.g:2087:1: ( ( rule__DeclaredVarList__VarsAssignment_1_1 ) )
            {
            // InternalPortugol.g:2087:1: ( ( rule__DeclaredVarList__VarsAssignment_1_1 ) )
            // InternalPortugol.g:2088:2: ( rule__DeclaredVarList__VarsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getVarsAssignment_1_1()); 
            }
            // InternalPortugol.g:2089:2: ( rule__DeclaredVarList__VarsAssignment_1_1 )
            // InternalPortugol.g:2089:3: rule__DeclaredVarList__VarsAssignment_1_1
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
    // InternalPortugol.g:2098:1: rule__BlockFunction__Group__0 : rule__BlockFunction__Group__0__Impl rule__BlockFunction__Group__1 ;
    public final void rule__BlockFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2102:1: ( rule__BlockFunction__Group__0__Impl rule__BlockFunction__Group__1 )
            // InternalPortugol.g:2103:2: rule__BlockFunction__Group__0__Impl rule__BlockFunction__Group__1
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
    // InternalPortugol.g:2110:1: rule__BlockFunction__Group__0__Impl : ( 'funcao' ) ;
    public final void rule__BlockFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2114:1: ( ( 'funcao' ) )
            // InternalPortugol.g:2115:1: ( 'funcao' )
            {
            // InternalPortugol.g:2115:1: ( 'funcao' )
            // InternalPortugol.g:2116:2: 'funcao'
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
    // InternalPortugol.g:2125:1: rule__BlockFunction__Group__1 : rule__BlockFunction__Group__1__Impl rule__BlockFunction__Group__2 ;
    public final void rule__BlockFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2129:1: ( rule__BlockFunction__Group__1__Impl rule__BlockFunction__Group__2 )
            // InternalPortugol.g:2130:2: rule__BlockFunction__Group__1__Impl rule__BlockFunction__Group__2
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
    // InternalPortugol.g:2137:1: rule__BlockFunction__Group__1__Impl : ( ( rule__BlockFunction__FunctionNameAssignment_1 ) ) ;
    public final void rule__BlockFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2141:1: ( ( ( rule__BlockFunction__FunctionNameAssignment_1 ) ) )
            // InternalPortugol.g:2142:1: ( ( rule__BlockFunction__FunctionNameAssignment_1 ) )
            {
            // InternalPortugol.g:2142:1: ( ( rule__BlockFunction__FunctionNameAssignment_1 ) )
            // InternalPortugol.g:2143:2: ( rule__BlockFunction__FunctionNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getFunctionNameAssignment_1()); 
            }
            // InternalPortugol.g:2144:2: ( rule__BlockFunction__FunctionNameAssignment_1 )
            // InternalPortugol.g:2144:3: rule__BlockFunction__FunctionNameAssignment_1
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
    // InternalPortugol.g:2152:1: rule__BlockFunction__Group__2 : rule__BlockFunction__Group__2__Impl rule__BlockFunction__Group__3 ;
    public final void rule__BlockFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2156:1: ( rule__BlockFunction__Group__2__Impl rule__BlockFunction__Group__3 )
            // InternalPortugol.g:2157:2: rule__BlockFunction__Group__2__Impl rule__BlockFunction__Group__3
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
    // InternalPortugol.g:2164:1: rule__BlockFunction__Group__2__Impl : ( '(' ) ;
    public final void rule__BlockFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2168:1: ( ( '(' ) )
            // InternalPortugol.g:2169:1: ( '(' )
            {
            // InternalPortugol.g:2169:1: ( '(' )
            // InternalPortugol.g:2170:2: '('
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
    // InternalPortugol.g:2179:1: rule__BlockFunction__Group__3 : rule__BlockFunction__Group__3__Impl rule__BlockFunction__Group__4 ;
    public final void rule__BlockFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2183:1: ( rule__BlockFunction__Group__3__Impl rule__BlockFunction__Group__4 )
            // InternalPortugol.g:2184:2: rule__BlockFunction__Group__3__Impl rule__BlockFunction__Group__4
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
    // InternalPortugol.g:2191:1: rule__BlockFunction__Group__3__Impl : ( ( rule__BlockFunction__ParamListAssignment_3 ) ) ;
    public final void rule__BlockFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2195:1: ( ( ( rule__BlockFunction__ParamListAssignment_3 ) ) )
            // InternalPortugol.g:2196:1: ( ( rule__BlockFunction__ParamListAssignment_3 ) )
            {
            // InternalPortugol.g:2196:1: ( ( rule__BlockFunction__ParamListAssignment_3 ) )
            // InternalPortugol.g:2197:2: ( rule__BlockFunction__ParamListAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getParamListAssignment_3()); 
            }
            // InternalPortugol.g:2198:2: ( rule__BlockFunction__ParamListAssignment_3 )
            // InternalPortugol.g:2198:3: rule__BlockFunction__ParamListAssignment_3
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
    // InternalPortugol.g:2206:1: rule__BlockFunction__Group__4 : rule__BlockFunction__Group__4__Impl rule__BlockFunction__Group__5 ;
    public final void rule__BlockFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2210:1: ( rule__BlockFunction__Group__4__Impl rule__BlockFunction__Group__5 )
            // InternalPortugol.g:2211:2: rule__BlockFunction__Group__4__Impl rule__BlockFunction__Group__5
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
    // InternalPortugol.g:2218:1: rule__BlockFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__BlockFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2222:1: ( ( ')' ) )
            // InternalPortugol.g:2223:1: ( ')' )
            {
            // InternalPortugol.g:2223:1: ( ')' )
            // InternalPortugol.g:2224:2: ')'
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
    // InternalPortugol.g:2233:1: rule__BlockFunction__Group__5 : rule__BlockFunction__Group__5__Impl rule__BlockFunction__Group__6 ;
    public final void rule__BlockFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2237:1: ( rule__BlockFunction__Group__5__Impl rule__BlockFunction__Group__6 )
            // InternalPortugol.g:2238:2: rule__BlockFunction__Group__5__Impl rule__BlockFunction__Group__6
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
    // InternalPortugol.g:2245:1: rule__BlockFunction__Group__5__Impl : ( ':' ) ;
    public final void rule__BlockFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2249:1: ( ( ':' ) )
            // InternalPortugol.g:2250:1: ( ':' )
            {
            // InternalPortugol.g:2250:1: ( ':' )
            // InternalPortugol.g:2251:2: ':'
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
    // InternalPortugol.g:2260:1: rule__BlockFunction__Group__6 : rule__BlockFunction__Group__6__Impl rule__BlockFunction__Group__7 ;
    public final void rule__BlockFunction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2264:1: ( rule__BlockFunction__Group__6__Impl rule__BlockFunction__Group__7 )
            // InternalPortugol.g:2265:2: rule__BlockFunction__Group__6__Impl rule__BlockFunction__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalPortugol.g:2272:1: rule__BlockFunction__Group__6__Impl : ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) ) ;
    public final void rule__BlockFunction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2276:1: ( ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) ) )
            // InternalPortugol.g:2277:1: ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) )
            {
            // InternalPortugol.g:2277:1: ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) )
            // InternalPortugol.g:2278:2: ( rule__BlockFunction__ReturnTypeAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getReturnTypeAssignment_6()); 
            }
            // InternalPortugol.g:2279:2: ( rule__BlockFunction__ReturnTypeAssignment_6 )
            // InternalPortugol.g:2279:3: rule__BlockFunction__ReturnTypeAssignment_6
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
    // InternalPortugol.g:2287:1: rule__BlockFunction__Group__7 : rule__BlockFunction__Group__7__Impl rule__BlockFunction__Group__8 ;
    public final void rule__BlockFunction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2291:1: ( rule__BlockFunction__Group__7__Impl rule__BlockFunction__Group__8 )
            // InternalPortugol.g:2292:2: rule__BlockFunction__Group__7__Impl rule__BlockFunction__Group__8
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
    // InternalPortugol.g:2299:1: rule__BlockFunction__Group__7__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__BlockFunction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2303:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2304:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2304:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2305:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getEND_COMMANDTerminalRuleCall_7()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getEND_COMMANDTerminalRuleCall_7()); 
            }

            }


            }

        }
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
    // InternalPortugol.g:2314:1: rule__BlockFunction__Group__8 : rule__BlockFunction__Group__8__Impl rule__BlockFunction__Group__9 ;
    public final void rule__BlockFunction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2318:1: ( rule__BlockFunction__Group__8__Impl rule__BlockFunction__Group__9 )
            // InternalPortugol.g:2319:2: rule__BlockFunction__Group__8__Impl rule__BlockFunction__Group__9
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
    // InternalPortugol.g:2326:1: rule__BlockFunction__Group__8__Impl : ( ( rule__BlockFunction__DeclarationsAssignment_8 )? ) ;
    public final void rule__BlockFunction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2330:1: ( ( ( rule__BlockFunction__DeclarationsAssignment_8 )? ) )
            // InternalPortugol.g:2331:1: ( ( rule__BlockFunction__DeclarationsAssignment_8 )? )
            {
            // InternalPortugol.g:2331:1: ( ( rule__BlockFunction__DeclarationsAssignment_8 )? )
            // InternalPortugol.g:2332:2: ( rule__BlockFunction__DeclarationsAssignment_8 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getDeclarationsAssignment_8()); 
            }
            // InternalPortugol.g:2333:2: ( rule__BlockFunction__DeclarationsAssignment_8 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPortugol.g:2333:3: rule__BlockFunction__DeclarationsAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__BlockFunction__DeclarationsAssignment_8();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getDeclarationsAssignment_8()); 
            }

            }


            }

        }
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
    // InternalPortugol.g:2341:1: rule__BlockFunction__Group__9 : rule__BlockFunction__Group__9__Impl rule__BlockFunction__Group__10 ;
    public final void rule__BlockFunction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2345:1: ( rule__BlockFunction__Group__9__Impl rule__BlockFunction__Group__10 )
            // InternalPortugol.g:2346:2: rule__BlockFunction__Group__9__Impl rule__BlockFunction__Group__10
            {
            pushFollow(FOLLOW_7);
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
    // InternalPortugol.g:2353:1: rule__BlockFunction__Group__9__Impl : ( 'inicio' ) ;
    public final void rule__BlockFunction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2357:1: ( ( 'inicio' ) )
            // InternalPortugol.g:2358:1: ( 'inicio' )
            {
            // InternalPortugol.g:2358:1: ( 'inicio' )
            // InternalPortugol.g:2359:2: 'inicio'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getInicioKeyword_9()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getInicioKeyword_9()); 
            }

            }


            }

        }
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
    // InternalPortugol.g:2368:1: rule__BlockFunction__Group__10 : rule__BlockFunction__Group__10__Impl rule__BlockFunction__Group__11 ;
    public final void rule__BlockFunction__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2372:1: ( rule__BlockFunction__Group__10__Impl rule__BlockFunction__Group__11 )
            // InternalPortugol.g:2373:2: rule__BlockFunction__Group__10__Impl rule__BlockFunction__Group__11
            {
            pushFollow(FOLLOW_17);
            rule__BlockFunction__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockFunction__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPortugol.g:2380:1: rule__BlockFunction__Group__10__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__BlockFunction__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2384:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2385:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2385:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2386:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getEND_COMMANDTerminalRuleCall_10()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getEND_COMMANDTerminalRuleCall_10()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__BlockFunction__Group__11"
    // InternalPortugol.g:2395:1: rule__BlockFunction__Group__11 : rule__BlockFunction__Group__11__Impl rule__BlockFunction__Group__12 ;
    public final void rule__BlockFunction__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2399:1: ( rule__BlockFunction__Group__11__Impl rule__BlockFunction__Group__12 )
            // InternalPortugol.g:2400:2: rule__BlockFunction__Group__11__Impl rule__BlockFunction__Group__12
            {
            pushFollow(FOLLOW_18);
            rule__BlockFunction__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockFunction__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockFunction__Group__11"


    // $ANTLR start "rule__BlockFunction__Group__11__Impl"
    // InternalPortugol.g:2407:1: rule__BlockFunction__Group__11__Impl : ( ( ( rule__BlockFunction__CommandsAssignment_11 ) ) ( ( rule__BlockFunction__CommandsAssignment_11 )* ) ) ;
    public final void rule__BlockFunction__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2411:1: ( ( ( ( rule__BlockFunction__CommandsAssignment_11 ) ) ( ( rule__BlockFunction__CommandsAssignment_11 )* ) ) )
            // InternalPortugol.g:2412:1: ( ( ( rule__BlockFunction__CommandsAssignment_11 ) ) ( ( rule__BlockFunction__CommandsAssignment_11 )* ) )
            {
            // InternalPortugol.g:2412:1: ( ( ( rule__BlockFunction__CommandsAssignment_11 ) ) ( ( rule__BlockFunction__CommandsAssignment_11 )* ) )
            // InternalPortugol.g:2413:2: ( ( rule__BlockFunction__CommandsAssignment_11 ) ) ( ( rule__BlockFunction__CommandsAssignment_11 )* )
            {
            // InternalPortugol.g:2413:2: ( ( rule__BlockFunction__CommandsAssignment_11 ) )
            // InternalPortugol.g:2414:3: ( rule__BlockFunction__CommandsAssignment_11 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getCommandsAssignment_11()); 
            }
            // InternalPortugol.g:2415:3: ( rule__BlockFunction__CommandsAssignment_11 )
            // InternalPortugol.g:2415:4: rule__BlockFunction__CommandsAssignment_11
            {
            pushFollow(FOLLOW_19);
            rule__BlockFunction__CommandsAssignment_11();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getCommandsAssignment_11()); 
            }

            }

            // InternalPortugol.g:2418:2: ( ( rule__BlockFunction__CommandsAssignment_11 )* )
            // InternalPortugol.g:2419:3: ( rule__BlockFunction__CommandsAssignment_11 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getCommandsAssignment_11()); 
            }
            // InternalPortugol.g:2420:3: ( rule__BlockFunction__CommandsAssignment_11 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_FLOAT)||(LA21_0>=17 && LA21_0<=18)||LA21_0==28||LA21_0==33||LA21_0==39||LA21_0==46||LA21_0==50||LA21_0==54) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPortugol.g:2420:4: rule__BlockFunction__CommandsAssignment_11
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__BlockFunction__CommandsAssignment_11();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getCommandsAssignment_11()); 
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
    // $ANTLR end "rule__BlockFunction__Group__11__Impl"


    // $ANTLR start "rule__BlockFunction__Group__12"
    // InternalPortugol.g:2429:1: rule__BlockFunction__Group__12 : rule__BlockFunction__Group__12__Impl rule__BlockFunction__Group__13 ;
    public final void rule__BlockFunction__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2433:1: ( rule__BlockFunction__Group__12__Impl rule__BlockFunction__Group__13 )
            // InternalPortugol.g:2434:2: rule__BlockFunction__Group__12__Impl rule__BlockFunction__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__BlockFunction__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockFunction__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockFunction__Group__12"


    // $ANTLR start "rule__BlockFunction__Group__12__Impl"
    // InternalPortugol.g:2441:1: rule__BlockFunction__Group__12__Impl : ( 'fimfuncao' ) ;
    public final void rule__BlockFunction__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2445:1: ( ( 'fimfuncao' ) )
            // InternalPortugol.g:2446:1: ( 'fimfuncao' )
            {
            // InternalPortugol.g:2446:1: ( 'fimfuncao' )
            // InternalPortugol.g:2447:2: 'fimfuncao'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getFimfuncaoKeyword_12()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getFimfuncaoKeyword_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockFunction__Group__12__Impl"


    // $ANTLR start "rule__BlockFunction__Group__13"
    // InternalPortugol.g:2456:1: rule__BlockFunction__Group__13 : rule__BlockFunction__Group__13__Impl ;
    public final void rule__BlockFunction__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2460:1: ( rule__BlockFunction__Group__13__Impl )
            // InternalPortugol.g:2461:2: rule__BlockFunction__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockFunction__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockFunction__Group__13"


    // $ANTLR start "rule__BlockFunction__Group__13__Impl"
    // InternalPortugol.g:2467:1: rule__BlockFunction__Group__13__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__BlockFunction__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2471:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2472:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2472:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2473:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getEND_COMMANDTerminalRuleCall_13()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getEND_COMMANDTerminalRuleCall_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockFunction__Group__13__Impl"


    // $ANTLR start "rule__BlockProcedure__Group__0"
    // InternalPortugol.g:2483:1: rule__BlockProcedure__Group__0 : rule__BlockProcedure__Group__0__Impl rule__BlockProcedure__Group__1 ;
    public final void rule__BlockProcedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2487:1: ( rule__BlockProcedure__Group__0__Impl rule__BlockProcedure__Group__1 )
            // InternalPortugol.g:2488:2: rule__BlockProcedure__Group__0__Impl rule__BlockProcedure__Group__1
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
    // InternalPortugol.g:2495:1: rule__BlockProcedure__Group__0__Impl : ( 'procedimento' ) ;
    public final void rule__BlockProcedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2499:1: ( ( 'procedimento' ) )
            // InternalPortugol.g:2500:1: ( 'procedimento' )
            {
            // InternalPortugol.g:2500:1: ( 'procedimento' )
            // InternalPortugol.g:2501:2: 'procedimento'
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
    // InternalPortugol.g:2510:1: rule__BlockProcedure__Group__1 : rule__BlockProcedure__Group__1__Impl rule__BlockProcedure__Group__2 ;
    public final void rule__BlockProcedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2514:1: ( rule__BlockProcedure__Group__1__Impl rule__BlockProcedure__Group__2 )
            // InternalPortugol.g:2515:2: rule__BlockProcedure__Group__1__Impl rule__BlockProcedure__Group__2
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
    // InternalPortugol.g:2522:1: rule__BlockProcedure__Group__1__Impl : ( ( rule__BlockProcedure__ProcedureAssignment_1 ) ) ;
    public final void rule__BlockProcedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2526:1: ( ( ( rule__BlockProcedure__ProcedureAssignment_1 ) ) )
            // InternalPortugol.g:2527:1: ( ( rule__BlockProcedure__ProcedureAssignment_1 ) )
            {
            // InternalPortugol.g:2527:1: ( ( rule__BlockProcedure__ProcedureAssignment_1 ) )
            // InternalPortugol.g:2528:2: ( rule__BlockProcedure__ProcedureAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getProcedureAssignment_1()); 
            }
            // InternalPortugol.g:2529:2: ( rule__BlockProcedure__ProcedureAssignment_1 )
            // InternalPortugol.g:2529:3: rule__BlockProcedure__ProcedureAssignment_1
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
    // InternalPortugol.g:2537:1: rule__BlockProcedure__Group__2 : rule__BlockProcedure__Group__2__Impl rule__BlockProcedure__Group__3 ;
    public final void rule__BlockProcedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2541:1: ( rule__BlockProcedure__Group__2__Impl rule__BlockProcedure__Group__3 )
            // InternalPortugol.g:2542:2: rule__BlockProcedure__Group__2__Impl rule__BlockProcedure__Group__3
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
    // InternalPortugol.g:2549:1: rule__BlockProcedure__Group__2__Impl : ( '(' ) ;
    public final void rule__BlockProcedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2553:1: ( ( '(' ) )
            // InternalPortugol.g:2554:1: ( '(' )
            {
            // InternalPortugol.g:2554:1: ( '(' )
            // InternalPortugol.g:2555:2: '('
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
    // InternalPortugol.g:2564:1: rule__BlockProcedure__Group__3 : rule__BlockProcedure__Group__3__Impl rule__BlockProcedure__Group__4 ;
    public final void rule__BlockProcedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2568:1: ( rule__BlockProcedure__Group__3__Impl rule__BlockProcedure__Group__4 )
            // InternalPortugol.g:2569:2: rule__BlockProcedure__Group__3__Impl rule__BlockProcedure__Group__4
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
    // InternalPortugol.g:2576:1: rule__BlockProcedure__Group__3__Impl : ( ( rule__BlockProcedure__ParamListAssignment_3 ) ) ;
    public final void rule__BlockProcedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2580:1: ( ( ( rule__BlockProcedure__ParamListAssignment_3 ) ) )
            // InternalPortugol.g:2581:1: ( ( rule__BlockProcedure__ParamListAssignment_3 ) )
            {
            // InternalPortugol.g:2581:1: ( ( rule__BlockProcedure__ParamListAssignment_3 ) )
            // InternalPortugol.g:2582:2: ( rule__BlockProcedure__ParamListAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getParamListAssignment_3()); 
            }
            // InternalPortugol.g:2583:2: ( rule__BlockProcedure__ParamListAssignment_3 )
            // InternalPortugol.g:2583:3: rule__BlockProcedure__ParamListAssignment_3
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
    // InternalPortugol.g:2591:1: rule__BlockProcedure__Group__4 : rule__BlockProcedure__Group__4__Impl rule__BlockProcedure__Group__5 ;
    public final void rule__BlockProcedure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2595:1: ( rule__BlockProcedure__Group__4__Impl rule__BlockProcedure__Group__5 )
            // InternalPortugol.g:2596:2: rule__BlockProcedure__Group__4__Impl rule__BlockProcedure__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalPortugol.g:2603:1: rule__BlockProcedure__Group__4__Impl : ( ')' ) ;
    public final void rule__BlockProcedure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2607:1: ( ( ')' ) )
            // InternalPortugol.g:2608:1: ( ')' )
            {
            // InternalPortugol.g:2608:1: ( ')' )
            // InternalPortugol.g:2609:2: ')'
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
    // InternalPortugol.g:2618:1: rule__BlockProcedure__Group__5 : rule__BlockProcedure__Group__5__Impl rule__BlockProcedure__Group__6 ;
    public final void rule__BlockProcedure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2622:1: ( rule__BlockProcedure__Group__5__Impl rule__BlockProcedure__Group__6 )
            // InternalPortugol.g:2623:2: rule__BlockProcedure__Group__5__Impl rule__BlockProcedure__Group__6
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
    // InternalPortugol.g:2630:1: rule__BlockProcedure__Group__5__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__BlockProcedure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2634:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2635:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2635:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2636:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getEND_COMMANDTerminalRuleCall_5()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getEND_COMMANDTerminalRuleCall_5()); 
            }

            }


            }

        }
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
    // InternalPortugol.g:2645:1: rule__BlockProcedure__Group__6 : rule__BlockProcedure__Group__6__Impl rule__BlockProcedure__Group__7 ;
    public final void rule__BlockProcedure__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2649:1: ( rule__BlockProcedure__Group__6__Impl rule__BlockProcedure__Group__7 )
            // InternalPortugol.g:2650:2: rule__BlockProcedure__Group__6__Impl rule__BlockProcedure__Group__7
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
    // InternalPortugol.g:2657:1: rule__BlockProcedure__Group__6__Impl : ( ( rule__BlockProcedure__DeclarationsAssignment_6 )? ) ;
    public final void rule__BlockProcedure__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2661:1: ( ( ( rule__BlockProcedure__DeclarationsAssignment_6 )? ) )
            // InternalPortugol.g:2662:1: ( ( rule__BlockProcedure__DeclarationsAssignment_6 )? )
            {
            // InternalPortugol.g:2662:1: ( ( rule__BlockProcedure__DeclarationsAssignment_6 )? )
            // InternalPortugol.g:2663:2: ( rule__BlockProcedure__DeclarationsAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getDeclarationsAssignment_6()); 
            }
            // InternalPortugol.g:2664:2: ( rule__BlockProcedure__DeclarationsAssignment_6 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPortugol.g:2664:3: rule__BlockProcedure__DeclarationsAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__BlockProcedure__DeclarationsAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getDeclarationsAssignment_6()); 
            }

            }


            }

        }
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
    // InternalPortugol.g:2672:1: rule__BlockProcedure__Group__7 : rule__BlockProcedure__Group__7__Impl rule__BlockProcedure__Group__8 ;
    public final void rule__BlockProcedure__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2676:1: ( rule__BlockProcedure__Group__7__Impl rule__BlockProcedure__Group__8 )
            // InternalPortugol.g:2677:2: rule__BlockProcedure__Group__7__Impl rule__BlockProcedure__Group__8
            {
            pushFollow(FOLLOW_7);
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
    // InternalPortugol.g:2684:1: rule__BlockProcedure__Group__7__Impl : ( 'inicio' ) ;
    public final void rule__BlockProcedure__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2688:1: ( ( 'inicio' ) )
            // InternalPortugol.g:2689:1: ( 'inicio' )
            {
            // InternalPortugol.g:2689:1: ( 'inicio' )
            // InternalPortugol.g:2690:2: 'inicio'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getInicioKeyword_7()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getInicioKeyword_7()); 
            }

            }


            }

        }
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
    // InternalPortugol.g:2699:1: rule__BlockProcedure__Group__8 : rule__BlockProcedure__Group__8__Impl rule__BlockProcedure__Group__9 ;
    public final void rule__BlockProcedure__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2703:1: ( rule__BlockProcedure__Group__8__Impl rule__BlockProcedure__Group__9 )
            // InternalPortugol.g:2704:2: rule__BlockProcedure__Group__8__Impl rule__BlockProcedure__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__BlockProcedure__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockProcedure__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPortugol.g:2711:1: rule__BlockProcedure__Group__8__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__BlockProcedure__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2715:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2716:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2716:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2717:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getEND_COMMANDTerminalRuleCall_8()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getEND_COMMANDTerminalRuleCall_8()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__BlockProcedure__Group__9"
    // InternalPortugol.g:2726:1: rule__BlockProcedure__Group__9 : rule__BlockProcedure__Group__9__Impl rule__BlockProcedure__Group__10 ;
    public final void rule__BlockProcedure__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2730:1: ( rule__BlockProcedure__Group__9__Impl rule__BlockProcedure__Group__10 )
            // InternalPortugol.g:2731:2: rule__BlockProcedure__Group__9__Impl rule__BlockProcedure__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__BlockProcedure__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockProcedure__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockProcedure__Group__9"


    // $ANTLR start "rule__BlockProcedure__Group__9__Impl"
    // InternalPortugol.g:2738:1: rule__BlockProcedure__Group__9__Impl : ( ( ( rule__BlockProcedure__CommandsAssignment_9 ) ) ( ( rule__BlockProcedure__CommandsAssignment_9 )* ) ) ;
    public final void rule__BlockProcedure__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2742:1: ( ( ( ( rule__BlockProcedure__CommandsAssignment_9 ) ) ( ( rule__BlockProcedure__CommandsAssignment_9 )* ) ) )
            // InternalPortugol.g:2743:1: ( ( ( rule__BlockProcedure__CommandsAssignment_9 ) ) ( ( rule__BlockProcedure__CommandsAssignment_9 )* ) )
            {
            // InternalPortugol.g:2743:1: ( ( ( rule__BlockProcedure__CommandsAssignment_9 ) ) ( ( rule__BlockProcedure__CommandsAssignment_9 )* ) )
            // InternalPortugol.g:2744:2: ( ( rule__BlockProcedure__CommandsAssignment_9 ) ) ( ( rule__BlockProcedure__CommandsAssignment_9 )* )
            {
            // InternalPortugol.g:2744:2: ( ( rule__BlockProcedure__CommandsAssignment_9 ) )
            // InternalPortugol.g:2745:3: ( rule__BlockProcedure__CommandsAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getCommandsAssignment_9()); 
            }
            // InternalPortugol.g:2746:3: ( rule__BlockProcedure__CommandsAssignment_9 )
            // InternalPortugol.g:2746:4: rule__BlockProcedure__CommandsAssignment_9
            {
            pushFollow(FOLLOW_19);
            rule__BlockProcedure__CommandsAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getCommandsAssignment_9()); 
            }

            }

            // InternalPortugol.g:2749:2: ( ( rule__BlockProcedure__CommandsAssignment_9 )* )
            // InternalPortugol.g:2750:3: ( rule__BlockProcedure__CommandsAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getCommandsAssignment_9()); 
            }
            // InternalPortugol.g:2751:3: ( rule__BlockProcedure__CommandsAssignment_9 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_FLOAT)||(LA23_0>=17 && LA23_0<=18)||LA23_0==28||LA23_0==33||LA23_0==39||LA23_0==46||LA23_0==50||LA23_0==54) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalPortugol.g:2751:4: rule__BlockProcedure__CommandsAssignment_9
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__BlockProcedure__CommandsAssignment_9();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getCommandsAssignment_9()); 
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
    // $ANTLR end "rule__BlockProcedure__Group__9__Impl"


    // $ANTLR start "rule__BlockProcedure__Group__10"
    // InternalPortugol.g:2760:1: rule__BlockProcedure__Group__10 : rule__BlockProcedure__Group__10__Impl rule__BlockProcedure__Group__11 ;
    public final void rule__BlockProcedure__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2764:1: ( rule__BlockProcedure__Group__10__Impl rule__BlockProcedure__Group__11 )
            // InternalPortugol.g:2765:2: rule__BlockProcedure__Group__10__Impl rule__BlockProcedure__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__BlockProcedure__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockProcedure__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockProcedure__Group__10"


    // $ANTLR start "rule__BlockProcedure__Group__10__Impl"
    // InternalPortugol.g:2772:1: rule__BlockProcedure__Group__10__Impl : ( 'fimprocedimento' ) ;
    public final void rule__BlockProcedure__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2776:1: ( ( 'fimprocedimento' ) )
            // InternalPortugol.g:2777:1: ( 'fimprocedimento' )
            {
            // InternalPortugol.g:2777:1: ( 'fimprocedimento' )
            // InternalPortugol.g:2778:2: 'fimprocedimento'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getFimprocedimentoKeyword_10()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getFimprocedimentoKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockProcedure__Group__10__Impl"


    // $ANTLR start "rule__BlockProcedure__Group__11"
    // InternalPortugol.g:2787:1: rule__BlockProcedure__Group__11 : rule__BlockProcedure__Group__11__Impl ;
    public final void rule__BlockProcedure__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2791:1: ( rule__BlockProcedure__Group__11__Impl )
            // InternalPortugol.g:2792:2: rule__BlockProcedure__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockProcedure__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockProcedure__Group__11"


    // $ANTLR start "rule__BlockProcedure__Group__11__Impl"
    // InternalPortugol.g:2798:1: rule__BlockProcedure__Group__11__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__BlockProcedure__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2802:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2803:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2803:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2804:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getEND_COMMANDTerminalRuleCall_11()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getEND_COMMANDTerminalRuleCall_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockProcedure__Group__11__Impl"


    // $ANTLR start "rule__BlockCommand__Group__0"
    // InternalPortugol.g:2814:1: rule__BlockCommand__Group__0 : rule__BlockCommand__Group__0__Impl rule__BlockCommand__Group__1 ;
    public final void rule__BlockCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2818:1: ( rule__BlockCommand__Group__0__Impl rule__BlockCommand__Group__1 )
            // InternalPortugol.g:2819:2: rule__BlockCommand__Group__0__Impl rule__BlockCommand__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalPortugol.g:2826:1: rule__BlockCommand__Group__0__Impl : ( 'inicio' ) ;
    public final void rule__BlockCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2830:1: ( ( 'inicio' ) )
            // InternalPortugol.g:2831:1: ( 'inicio' )
            {
            // InternalPortugol.g:2831:1: ( 'inicio' )
            // InternalPortugol.g:2832:2: 'inicio'
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
    // InternalPortugol.g:2841:1: rule__BlockCommand__Group__1 : rule__BlockCommand__Group__1__Impl rule__BlockCommand__Group__2 ;
    public final void rule__BlockCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2845:1: ( rule__BlockCommand__Group__1__Impl rule__BlockCommand__Group__2 )
            // InternalPortugol.g:2846:2: rule__BlockCommand__Group__1__Impl rule__BlockCommand__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugol.g:2853:1: rule__BlockCommand__Group__1__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__BlockCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2857:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2858:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2858:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2859:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getEND_COMMANDTerminalRuleCall_1()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockCommandAccess().getEND_COMMANDTerminalRuleCall_1()); 
            }

            }


            }

        }
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
    // InternalPortugol.g:2868:1: rule__BlockCommand__Group__2 : rule__BlockCommand__Group__2__Impl rule__BlockCommand__Group__3 ;
    public final void rule__BlockCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2872:1: ( rule__BlockCommand__Group__2__Impl rule__BlockCommand__Group__3 )
            // InternalPortugol.g:2873:2: rule__BlockCommand__Group__2__Impl rule__BlockCommand__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__BlockCommand__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockCommand__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPortugol.g:2880:1: rule__BlockCommand__Group__2__Impl : ( ( ( rule__BlockCommand__CommandsAssignment_2 ) ) ( ( rule__BlockCommand__CommandsAssignment_2 )* ) ) ;
    public final void rule__BlockCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2884:1: ( ( ( ( rule__BlockCommand__CommandsAssignment_2 ) ) ( ( rule__BlockCommand__CommandsAssignment_2 )* ) ) )
            // InternalPortugol.g:2885:1: ( ( ( rule__BlockCommand__CommandsAssignment_2 ) ) ( ( rule__BlockCommand__CommandsAssignment_2 )* ) )
            {
            // InternalPortugol.g:2885:1: ( ( ( rule__BlockCommand__CommandsAssignment_2 ) ) ( ( rule__BlockCommand__CommandsAssignment_2 )* ) )
            // InternalPortugol.g:2886:2: ( ( rule__BlockCommand__CommandsAssignment_2 ) ) ( ( rule__BlockCommand__CommandsAssignment_2 )* )
            {
            // InternalPortugol.g:2886:2: ( ( rule__BlockCommand__CommandsAssignment_2 ) )
            // InternalPortugol.g:2887:3: ( rule__BlockCommand__CommandsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getCommandsAssignment_2()); 
            }
            // InternalPortugol.g:2888:3: ( rule__BlockCommand__CommandsAssignment_2 )
            // InternalPortugol.g:2888:4: rule__BlockCommand__CommandsAssignment_2
            {
            pushFollow(FOLLOW_19);
            rule__BlockCommand__CommandsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockCommandAccess().getCommandsAssignment_2()); 
            }

            }

            // InternalPortugol.g:2891:2: ( ( rule__BlockCommand__CommandsAssignment_2 )* )
            // InternalPortugol.g:2892:3: ( rule__BlockCommand__CommandsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getCommandsAssignment_2()); 
            }
            // InternalPortugol.g:2893:3: ( rule__BlockCommand__CommandsAssignment_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_FLOAT)||(LA24_0>=17 && LA24_0<=18)||LA24_0==28||LA24_0==33||LA24_0==39||LA24_0==46||LA24_0==50||LA24_0==54) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPortugol.g:2893:4: rule__BlockCommand__CommandsAssignment_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__BlockCommand__CommandsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockCommandAccess().getCommandsAssignment_2()); 
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
    // $ANTLR end "rule__BlockCommand__Group__2__Impl"


    // $ANTLR start "rule__BlockCommand__Group__3"
    // InternalPortugol.g:2902:1: rule__BlockCommand__Group__3 : rule__BlockCommand__Group__3__Impl rule__BlockCommand__Group__4 ;
    public final void rule__BlockCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2906:1: ( rule__BlockCommand__Group__3__Impl rule__BlockCommand__Group__4 )
            // InternalPortugol.g:2907:2: rule__BlockCommand__Group__3__Impl rule__BlockCommand__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__BlockCommand__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockCommand__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockCommand__Group__3"


    // $ANTLR start "rule__BlockCommand__Group__3__Impl"
    // InternalPortugol.g:2914:1: rule__BlockCommand__Group__3__Impl : ( 'fimalgoritmo' ) ;
    public final void rule__BlockCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2918:1: ( ( 'fimalgoritmo' ) )
            // InternalPortugol.g:2919:1: ( 'fimalgoritmo' )
            {
            // InternalPortugol.g:2919:1: ( 'fimalgoritmo' )
            // InternalPortugol.g:2920:2: 'fimalgoritmo'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getFimalgoritmoKeyword_3()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockCommandAccess().getFimalgoritmoKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockCommand__Group__3__Impl"


    // $ANTLR start "rule__BlockCommand__Group__4"
    // InternalPortugol.g:2929:1: rule__BlockCommand__Group__4 : rule__BlockCommand__Group__4__Impl ;
    public final void rule__BlockCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2933:1: ( rule__BlockCommand__Group__4__Impl )
            // InternalPortugol.g:2934:2: rule__BlockCommand__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockCommand__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockCommand__Group__4"


    // $ANTLR start "rule__BlockCommand__Group__4__Impl"
    // InternalPortugol.g:2940:1: rule__BlockCommand__Group__4__Impl : ( ( RULE_END_COMMAND )? ) ;
    public final void rule__BlockCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2944:1: ( ( ( RULE_END_COMMAND )? ) )
            // InternalPortugol.g:2945:1: ( ( RULE_END_COMMAND )? )
            {
            // InternalPortugol.g:2945:1: ( ( RULE_END_COMMAND )? )
            // InternalPortugol.g:2946:2: ( RULE_END_COMMAND )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getEND_COMMANDTerminalRuleCall_4()); 
            }
            // InternalPortugol.g:2947:2: ( RULE_END_COMMAND )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_END_COMMAND) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPortugol.g:2947:3: RULE_END_COMMAND
                    {
                    match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockCommandAccess().getEND_COMMANDTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockCommand__Group__4__Impl"


    // $ANTLR start "rule__AbstractCommand__Group_0__0"
    // InternalPortugol.g:2956:1: rule__AbstractCommand__Group_0__0 : rule__AbstractCommand__Group_0__0__Impl rule__AbstractCommand__Group_0__1 ;
    public final void rule__AbstractCommand__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2960:1: ( rule__AbstractCommand__Group_0__0__Impl rule__AbstractCommand__Group_0__1 )
            // InternalPortugol.g:2961:2: rule__AbstractCommand__Group_0__0__Impl rule__AbstractCommand__Group_0__1
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
    // InternalPortugol.g:2968:1: rule__AbstractCommand__Group_0__0__Impl : ( ruleReadCommand ) ;
    public final void rule__AbstractCommand__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2972:1: ( ( ruleReadCommand ) )
            // InternalPortugol.g:2973:1: ( ruleReadCommand )
            {
            // InternalPortugol.g:2973:1: ( ruleReadCommand )
            // InternalPortugol.g:2974:2: ruleReadCommand
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
    // InternalPortugol.g:2983:1: rule__AbstractCommand__Group_0__1 : rule__AbstractCommand__Group_0__1__Impl ;
    public final void rule__AbstractCommand__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2987:1: ( rule__AbstractCommand__Group_0__1__Impl )
            // InternalPortugol.g:2988:2: rule__AbstractCommand__Group_0__1__Impl
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
    // InternalPortugol.g:2994:1: rule__AbstractCommand__Group_0__1__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__AbstractCommand__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2998:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2999:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2999:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:3000:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractCommandAccess().getEND_COMMANDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractCommandAccess().getEND_COMMANDTerminalRuleCall_0_1()); 
            }

            }


            }

        }
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
    // InternalPortugol.g:3010:1: rule__AbstractCommand__Group_1__0 : rule__AbstractCommand__Group_1__0__Impl rule__AbstractCommand__Group_1__1 ;
    public final void rule__AbstractCommand__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3014:1: ( rule__AbstractCommand__Group_1__0__Impl rule__AbstractCommand__Group_1__1 )
            // InternalPortugol.g:3015:2: rule__AbstractCommand__Group_1__0__Impl rule__AbstractCommand__Group_1__1
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
    // InternalPortugol.g:3022:1: rule__AbstractCommand__Group_1__0__Impl : ( ruleWriteCommand ) ;
    public final void rule__AbstractCommand__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3026:1: ( ( ruleWriteCommand ) )
            // InternalPortugol.g:3027:1: ( ruleWriteCommand )
            {
            // InternalPortugol.g:3027:1: ( ruleWriteCommand )
            // InternalPortugol.g:3028:2: ruleWriteCommand
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
    // InternalPortugol.g:3037:1: rule__AbstractCommand__Group_1__1 : rule__AbstractCommand__Group_1__1__Impl ;
    public final void rule__AbstractCommand__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3041:1: ( rule__AbstractCommand__Group_1__1__Impl )
            // InternalPortugol.g:3042:2: rule__AbstractCommand__Group_1__1__Impl
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
    // InternalPortugol.g:3048:1: rule__AbstractCommand__Group_1__1__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__AbstractCommand__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3052:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:3053:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:3053:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:3054:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractCommandAccess().getEND_COMMANDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractCommandAccess().getEND_COMMANDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
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
    // InternalPortugol.g:3064:1: rule__AbstractCommand__Group_2__0 : rule__AbstractCommand__Group_2__0__Impl rule__AbstractCommand__Group_2__1 ;
    public final void rule__AbstractCommand__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3068:1: ( rule__AbstractCommand__Group_2__0__Impl rule__AbstractCommand__Group_2__1 )
            // InternalPortugol.g:3069:2: rule__AbstractCommand__Group_2__0__Impl rule__AbstractCommand__Group_2__1
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
    // InternalPortugol.g:3076:1: rule__AbstractCommand__Group_2__0__Impl : ( ruleExpression ) ;
    public final void rule__AbstractCommand__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3080:1: ( ( ruleExpression ) )
            // InternalPortugol.g:3081:1: ( ruleExpression )
            {
            // InternalPortugol.g:3081:1: ( ruleExpression )
            // InternalPortugol.g:3082:2: ruleExpression
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
    // InternalPortugol.g:3091:1: rule__AbstractCommand__Group_2__1 : rule__AbstractCommand__Group_2__1__Impl ;
    public final void rule__AbstractCommand__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3095:1: ( rule__AbstractCommand__Group_2__1__Impl )
            // InternalPortugol.g:3096:2: rule__AbstractCommand__Group_2__1__Impl
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
    // InternalPortugol.g:3102:1: rule__AbstractCommand__Group_2__1__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__AbstractCommand__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3106:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:3107:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:3107:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:3108:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractCommandAccess().getEND_COMMANDTerminalRuleCall_2_1()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractCommandAccess().getEND_COMMANDTerminalRuleCall_2_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__AbstractCommand__Group_3__0"
    // InternalPortugol.g:3118:1: rule__AbstractCommand__Group_3__0 : rule__AbstractCommand__Group_3__0__Impl rule__AbstractCommand__Group_3__1 ;
    public final void rule__AbstractCommand__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3122:1: ( rule__AbstractCommand__Group_3__0__Impl rule__AbstractCommand__Group_3__1 )
            // InternalPortugol.g:3123:2: rule__AbstractCommand__Group_3__0__Impl rule__AbstractCommand__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__AbstractCommand__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AbstractCommand__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractCommand__Group_3__0"


    // $ANTLR start "rule__AbstractCommand__Group_3__0__Impl"
    // InternalPortugol.g:3130:1: rule__AbstractCommand__Group_3__0__Impl : ( ruleIfStatement ) ;
    public final void rule__AbstractCommand__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3134:1: ( ( ruleIfStatement ) )
            // InternalPortugol.g:3135:1: ( ruleIfStatement )
            {
            // InternalPortugol.g:3135:1: ( ruleIfStatement )
            // InternalPortugol.g:3136:2: ruleIfStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractCommandAccess().getIfStatementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIfStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractCommandAccess().getIfStatementParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractCommand__Group_3__0__Impl"


    // $ANTLR start "rule__AbstractCommand__Group_3__1"
    // InternalPortugol.g:3145:1: rule__AbstractCommand__Group_3__1 : rule__AbstractCommand__Group_3__1__Impl ;
    public final void rule__AbstractCommand__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3149:1: ( rule__AbstractCommand__Group_3__1__Impl )
            // InternalPortugol.g:3150:2: rule__AbstractCommand__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractCommand__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractCommand__Group_3__1"


    // $ANTLR start "rule__AbstractCommand__Group_3__1__Impl"
    // InternalPortugol.g:3156:1: rule__AbstractCommand__Group_3__1__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__AbstractCommand__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3160:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:3161:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:3161:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:3162:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractCommandAccess().getEND_COMMANDTerminalRuleCall_3_1()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractCommandAccess().getEND_COMMANDTerminalRuleCall_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractCommand__Group_3__1__Impl"


    // $ANTLR start "rule__AbstractCommand__Group_4__0"
    // InternalPortugol.g:3172:1: rule__AbstractCommand__Group_4__0 : rule__AbstractCommand__Group_4__0__Impl rule__AbstractCommand__Group_4__1 ;
    public final void rule__AbstractCommand__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3176:1: ( rule__AbstractCommand__Group_4__0__Impl rule__AbstractCommand__Group_4__1 )
            // InternalPortugol.g:3177:2: rule__AbstractCommand__Group_4__0__Impl rule__AbstractCommand__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__AbstractCommand__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AbstractCommand__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractCommand__Group_4__0"


    // $ANTLR start "rule__AbstractCommand__Group_4__0__Impl"
    // InternalPortugol.g:3184:1: rule__AbstractCommand__Group_4__0__Impl : ( ruleSwitchCaseStatement ) ;
    public final void rule__AbstractCommand__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3188:1: ( ( ruleSwitchCaseStatement ) )
            // InternalPortugol.g:3189:1: ( ruleSwitchCaseStatement )
            {
            // InternalPortugol.g:3189:1: ( ruleSwitchCaseStatement )
            // InternalPortugol.g:3190:2: ruleSwitchCaseStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractCommandAccess().getSwitchCaseStatementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSwitchCaseStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractCommandAccess().getSwitchCaseStatementParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractCommand__Group_4__0__Impl"


    // $ANTLR start "rule__AbstractCommand__Group_4__1"
    // InternalPortugol.g:3199:1: rule__AbstractCommand__Group_4__1 : rule__AbstractCommand__Group_4__1__Impl ;
    public final void rule__AbstractCommand__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3203:1: ( rule__AbstractCommand__Group_4__1__Impl )
            // InternalPortugol.g:3204:2: rule__AbstractCommand__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractCommand__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractCommand__Group_4__1"


    // $ANTLR start "rule__AbstractCommand__Group_4__1__Impl"
    // InternalPortugol.g:3210:1: rule__AbstractCommand__Group_4__1__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__AbstractCommand__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3214:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:3215:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:3215:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:3216:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractCommandAccess().getEND_COMMANDTerminalRuleCall_4_1()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractCommandAccess().getEND_COMMANDTerminalRuleCall_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractCommand__Group_4__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__0"
    // InternalPortugol.g:3226:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3230:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalPortugol.g:3231:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
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
    // InternalPortugol.g:3238:1: rule__IfStatement__Group__0__Impl : ( 'se' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3242:1: ( ( 'se' ) )
            // InternalPortugol.g:3243:1: ( 'se' )
            {
            // InternalPortugol.g:3243:1: ( 'se' )
            // InternalPortugol.g:3244:2: 'se'
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
    // InternalPortugol.g:3253:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3257:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalPortugol.g:3258:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
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
    // InternalPortugol.g:3265:1: rule__IfStatement__Group__1__Impl : ( ( rule__IfStatement__ExprAssignment_1 ) ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3269:1: ( ( ( rule__IfStatement__ExprAssignment_1 ) ) )
            // InternalPortugol.g:3270:1: ( ( rule__IfStatement__ExprAssignment_1 ) )
            {
            // InternalPortugol.g:3270:1: ( ( rule__IfStatement__ExprAssignment_1 ) )
            // InternalPortugol.g:3271:2: ( rule__IfStatement__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getExprAssignment_1()); 
            }
            // InternalPortugol.g:3272:2: ( rule__IfStatement__ExprAssignment_1 )
            // InternalPortugol.g:3272:3: rule__IfStatement__ExprAssignment_1
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
    // InternalPortugol.g:3280:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3284:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalPortugol.g:3285:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalPortugol.g:3292:1: rule__IfStatement__Group__2__Impl : ( 'entao' ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3296:1: ( ( 'entao' ) )
            // InternalPortugol.g:3297:1: ( 'entao' )
            {
            // InternalPortugol.g:3297:1: ( 'entao' )
            // InternalPortugol.g:3298:2: 'entao'
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
    // InternalPortugol.g:3307:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3311:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalPortugol.g:3312:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugol.g:3319:1: rule__IfStatement__Group__3__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3323:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:3324:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:3324:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:3325:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getEND_COMMANDTerminalRuleCall_3()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getEND_COMMANDTerminalRuleCall_3()); 
            }

            }


            }

        }
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
    // InternalPortugol.g:3334:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3338:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalPortugol.g:3339:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
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
    // InternalPortugol.g:3346:1: rule__IfStatement__Group__4__Impl : ( ( ( rule__IfStatement__CommandsAssignment_4 ) ) ( ( rule__IfStatement__CommandsAssignment_4 )* ) ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3350:1: ( ( ( ( rule__IfStatement__CommandsAssignment_4 ) ) ( ( rule__IfStatement__CommandsAssignment_4 )* ) ) )
            // InternalPortugol.g:3351:1: ( ( ( rule__IfStatement__CommandsAssignment_4 ) ) ( ( rule__IfStatement__CommandsAssignment_4 )* ) )
            {
            // InternalPortugol.g:3351:1: ( ( ( rule__IfStatement__CommandsAssignment_4 ) ) ( ( rule__IfStatement__CommandsAssignment_4 )* ) )
            // InternalPortugol.g:3352:2: ( ( rule__IfStatement__CommandsAssignment_4 ) ) ( ( rule__IfStatement__CommandsAssignment_4 )* )
            {
            // InternalPortugol.g:3352:2: ( ( rule__IfStatement__CommandsAssignment_4 ) )
            // InternalPortugol.g:3353:3: ( rule__IfStatement__CommandsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getCommandsAssignment_4()); 
            }
            // InternalPortugol.g:3354:3: ( rule__IfStatement__CommandsAssignment_4 )
            // InternalPortugol.g:3354:4: rule__IfStatement__CommandsAssignment_4
            {
            pushFollow(FOLLOW_19);
            rule__IfStatement__CommandsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getCommandsAssignment_4()); 
            }

            }

            // InternalPortugol.g:3357:2: ( ( rule__IfStatement__CommandsAssignment_4 )* )
            // InternalPortugol.g:3358:3: ( rule__IfStatement__CommandsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getCommandsAssignment_4()); 
            }
            // InternalPortugol.g:3359:3: ( rule__IfStatement__CommandsAssignment_4 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_FLOAT)||(LA26_0>=17 && LA26_0<=18)||LA26_0==28||LA26_0==33||LA26_0==39||LA26_0==46||LA26_0==50||LA26_0==54) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPortugol.g:3359:4: rule__IfStatement__CommandsAssignment_4
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__IfStatement__CommandsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getCommandsAssignment_4()); 
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
    // $ANTLR end "rule__IfStatement__Group__4__Impl"


    // $ANTLR start "rule__IfStatement__Group__5"
    // InternalPortugol.g:3368:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3372:1: ( rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 )
            // InternalPortugol.g:3373:2: rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__IfStatement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPortugol.g:3380:1: rule__IfStatement__Group__5__Impl : ( ( rule__IfStatement__Group_5__0 )? ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3384:1: ( ( ( rule__IfStatement__Group_5__0 )? ) )
            // InternalPortugol.g:3385:1: ( ( rule__IfStatement__Group_5__0 )? )
            {
            // InternalPortugol.g:3385:1: ( ( rule__IfStatement__Group_5__0 )? )
            // InternalPortugol.g:3386:2: ( rule__IfStatement__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup_5()); 
            }
            // InternalPortugol.g:3387:2: ( rule__IfStatement__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==49) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPortugol.g:3387:3: rule__IfStatement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfStatement__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getGroup_5()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__IfStatement__Group__6"
    // InternalPortugol.g:3395:1: rule__IfStatement__Group__6 : rule__IfStatement__Group__6__Impl ;
    public final void rule__IfStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3399:1: ( rule__IfStatement__Group__6__Impl )
            // InternalPortugol.g:3400:2: rule__IfStatement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__6"


    // $ANTLR start "rule__IfStatement__Group__6__Impl"
    // InternalPortugol.g:3406:1: rule__IfStatement__Group__6__Impl : ( 'fimse' ) ;
    public final void rule__IfStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3410:1: ( ( 'fimse' ) )
            // InternalPortugol.g:3411:1: ( 'fimse' )
            {
            // InternalPortugol.g:3411:1: ( 'fimse' )
            // InternalPortugol.g:3412:2: 'fimse'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getFimseKeyword_6()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getFimseKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__6__Impl"


    // $ANTLR start "rule__IfStatement__Group_5__0"
    // InternalPortugol.g:3422:1: rule__IfStatement__Group_5__0 : rule__IfStatement__Group_5__0__Impl rule__IfStatement__Group_5__1 ;
    public final void rule__IfStatement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3426:1: ( rule__IfStatement__Group_5__0__Impl rule__IfStatement__Group_5__1 )
            // InternalPortugol.g:3427:2: rule__IfStatement__Group_5__0__Impl rule__IfStatement__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__IfStatement__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_5__0"


    // $ANTLR start "rule__IfStatement__Group_5__0__Impl"
    // InternalPortugol.g:3434:1: rule__IfStatement__Group_5__0__Impl : ( 'senao' ) ;
    public final void rule__IfStatement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3438:1: ( ( 'senao' ) )
            // InternalPortugol.g:3439:1: ( 'senao' )
            {
            // InternalPortugol.g:3439:1: ( 'senao' )
            // InternalPortugol.g:3440:2: 'senao'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getSenaoKeyword_5_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getSenaoKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_5__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_5__1"
    // InternalPortugol.g:3449:1: rule__IfStatement__Group_5__1 : rule__IfStatement__Group_5__1__Impl rule__IfStatement__Group_5__2 ;
    public final void rule__IfStatement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3453:1: ( rule__IfStatement__Group_5__1__Impl rule__IfStatement__Group_5__2 )
            // InternalPortugol.g:3454:2: rule__IfStatement__Group_5__1__Impl rule__IfStatement__Group_5__2
            {
            pushFollow(FOLLOW_17);
            rule__IfStatement__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_5__1"


    // $ANTLR start "rule__IfStatement__Group_5__1__Impl"
    // InternalPortugol.g:3461:1: rule__IfStatement__Group_5__1__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__IfStatement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3465:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:3466:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:3466:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:3467:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getEND_COMMANDTerminalRuleCall_5_1()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getEND_COMMANDTerminalRuleCall_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_5__1__Impl"


    // $ANTLR start "rule__IfStatement__Group_5__2"
    // InternalPortugol.g:3476:1: rule__IfStatement__Group_5__2 : rule__IfStatement__Group_5__2__Impl ;
    public final void rule__IfStatement__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3480:1: ( rule__IfStatement__Group_5__2__Impl )
            // InternalPortugol.g:3481:2: rule__IfStatement__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_5__2"


    // $ANTLR start "rule__IfStatement__Group_5__2__Impl"
    // InternalPortugol.g:3487:1: rule__IfStatement__Group_5__2__Impl : ( ( ( rule__IfStatement__ElseCommandsAssignment_5_2 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_5_2 )* ) ) ;
    public final void rule__IfStatement__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3491:1: ( ( ( ( rule__IfStatement__ElseCommandsAssignment_5_2 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_5_2 )* ) ) )
            // InternalPortugol.g:3492:1: ( ( ( rule__IfStatement__ElseCommandsAssignment_5_2 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_5_2 )* ) )
            {
            // InternalPortugol.g:3492:1: ( ( ( rule__IfStatement__ElseCommandsAssignment_5_2 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_5_2 )* ) )
            // InternalPortugol.g:3493:2: ( ( rule__IfStatement__ElseCommandsAssignment_5_2 ) ) ( ( rule__IfStatement__ElseCommandsAssignment_5_2 )* )
            {
            // InternalPortugol.g:3493:2: ( ( rule__IfStatement__ElseCommandsAssignment_5_2 ) )
            // InternalPortugol.g:3494:3: ( rule__IfStatement__ElseCommandsAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseCommandsAssignment_5_2()); 
            }
            // InternalPortugol.g:3495:3: ( rule__IfStatement__ElseCommandsAssignment_5_2 )
            // InternalPortugol.g:3495:4: rule__IfStatement__ElseCommandsAssignment_5_2
            {
            pushFollow(FOLLOW_19);
            rule__IfStatement__ElseCommandsAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseCommandsAssignment_5_2()); 
            }

            }

            // InternalPortugol.g:3498:2: ( ( rule__IfStatement__ElseCommandsAssignment_5_2 )* )
            // InternalPortugol.g:3499:3: ( rule__IfStatement__ElseCommandsAssignment_5_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseCommandsAssignment_5_2()); 
            }
            // InternalPortugol.g:3500:3: ( rule__IfStatement__ElseCommandsAssignment_5_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_FLOAT)||(LA28_0>=17 && LA28_0<=18)||LA28_0==28||LA28_0==33||LA28_0==39||LA28_0==46||LA28_0==50||LA28_0==54) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalPortugol.g:3500:4: rule__IfStatement__ElseCommandsAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__IfStatement__ElseCommandsAssignment_5_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseCommandsAssignment_5_2()); 
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
    // $ANTLR end "rule__IfStatement__Group_5__2__Impl"


    // $ANTLR start "rule__SwitchCaseStatement__Group__0"
    // InternalPortugol.g:3510:1: rule__SwitchCaseStatement__Group__0 : rule__SwitchCaseStatement__Group__0__Impl rule__SwitchCaseStatement__Group__1 ;
    public final void rule__SwitchCaseStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3514:1: ( rule__SwitchCaseStatement__Group__0__Impl rule__SwitchCaseStatement__Group__1 )
            // InternalPortugol.g:3515:2: rule__SwitchCaseStatement__Group__0__Impl rule__SwitchCaseStatement__Group__1
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
    // InternalPortugol.g:3522:1: rule__SwitchCaseStatement__Group__0__Impl : ( 'escolha' ) ;
    public final void rule__SwitchCaseStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3526:1: ( ( 'escolha' ) )
            // InternalPortugol.g:3527:1: ( 'escolha' )
            {
            // InternalPortugol.g:3527:1: ( 'escolha' )
            // InternalPortugol.g:3528:2: 'escolha'
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
    // InternalPortugol.g:3537:1: rule__SwitchCaseStatement__Group__1 : rule__SwitchCaseStatement__Group__1__Impl rule__SwitchCaseStatement__Group__2 ;
    public final void rule__SwitchCaseStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3541:1: ( rule__SwitchCaseStatement__Group__1__Impl rule__SwitchCaseStatement__Group__2 )
            // InternalPortugol.g:3542:2: rule__SwitchCaseStatement__Group__1__Impl rule__SwitchCaseStatement__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalPortugol.g:3549:1: rule__SwitchCaseStatement__Group__1__Impl : ( ( rule__SwitchCaseStatement__VariableAssignment_1 ) ) ;
    public final void rule__SwitchCaseStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3553:1: ( ( ( rule__SwitchCaseStatement__VariableAssignment_1 ) ) )
            // InternalPortugol.g:3554:1: ( ( rule__SwitchCaseStatement__VariableAssignment_1 ) )
            {
            // InternalPortugol.g:3554:1: ( ( rule__SwitchCaseStatement__VariableAssignment_1 ) )
            // InternalPortugol.g:3555:2: ( rule__SwitchCaseStatement__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getVariableAssignment_1()); 
            }
            // InternalPortugol.g:3556:2: ( rule__SwitchCaseStatement__VariableAssignment_1 )
            // InternalPortugol.g:3556:3: rule__SwitchCaseStatement__VariableAssignment_1
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
    // InternalPortugol.g:3564:1: rule__SwitchCaseStatement__Group__2 : rule__SwitchCaseStatement__Group__2__Impl rule__SwitchCaseStatement__Group__3 ;
    public final void rule__SwitchCaseStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3568:1: ( rule__SwitchCaseStatement__Group__2__Impl rule__SwitchCaseStatement__Group__3 )
            // InternalPortugol.g:3569:2: rule__SwitchCaseStatement__Group__2__Impl rule__SwitchCaseStatement__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalPortugol.g:3576:1: rule__SwitchCaseStatement__Group__2__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__SwitchCaseStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3580:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:3581:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:3581:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:3582:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getEND_COMMANDTerminalRuleCall_2()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseStatementAccess().getEND_COMMANDTerminalRuleCall_2()); 
            }

            }


            }

        }
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
    // InternalPortugol.g:3591:1: rule__SwitchCaseStatement__Group__3 : rule__SwitchCaseStatement__Group__3__Impl rule__SwitchCaseStatement__Group__4 ;
    public final void rule__SwitchCaseStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3595:1: ( rule__SwitchCaseStatement__Group__3__Impl rule__SwitchCaseStatement__Group__4 )
            // InternalPortugol.g:3596:2: rule__SwitchCaseStatement__Group__3__Impl rule__SwitchCaseStatement__Group__4
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
    // InternalPortugol.g:3603:1: rule__SwitchCaseStatement__Group__3__Impl : ( ( ( rule__SwitchCaseStatement__CaseListAssignment_3 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_3 )* ) ) ;
    public final void rule__SwitchCaseStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3607:1: ( ( ( ( rule__SwitchCaseStatement__CaseListAssignment_3 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_3 )* ) ) )
            // InternalPortugol.g:3608:1: ( ( ( rule__SwitchCaseStatement__CaseListAssignment_3 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_3 )* ) )
            {
            // InternalPortugol.g:3608:1: ( ( ( rule__SwitchCaseStatement__CaseListAssignment_3 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_3 )* ) )
            // InternalPortugol.g:3609:2: ( ( rule__SwitchCaseStatement__CaseListAssignment_3 ) ) ( ( rule__SwitchCaseStatement__CaseListAssignment_3 )* )
            {
            // InternalPortugol.g:3609:2: ( ( rule__SwitchCaseStatement__CaseListAssignment_3 ) )
            // InternalPortugol.g:3610:3: ( rule__SwitchCaseStatement__CaseListAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getCaseListAssignment_3()); 
            }
            // InternalPortugol.g:3611:3: ( rule__SwitchCaseStatement__CaseListAssignment_3 )
            // InternalPortugol.g:3611:4: rule__SwitchCaseStatement__CaseListAssignment_3
            {
            pushFollow(FOLLOW_27);
            rule__SwitchCaseStatement__CaseListAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseStatementAccess().getCaseListAssignment_3()); 
            }

            }

            // InternalPortugol.g:3614:2: ( ( rule__SwitchCaseStatement__CaseListAssignment_3 )* )
            // InternalPortugol.g:3615:3: ( rule__SwitchCaseStatement__CaseListAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getCaseListAssignment_3()); 
            }
            // InternalPortugol.g:3616:3: ( rule__SwitchCaseStatement__CaseListAssignment_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==52) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPortugol.g:3616:4: rule__SwitchCaseStatement__CaseListAssignment_3
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__SwitchCaseStatement__CaseListAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseStatementAccess().getCaseListAssignment_3()); 
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
    // $ANTLR end "rule__SwitchCaseStatement__Group__3__Impl"


    // $ANTLR start "rule__SwitchCaseStatement__Group__4"
    // InternalPortugol.g:3625:1: rule__SwitchCaseStatement__Group__4 : rule__SwitchCaseStatement__Group__4__Impl rule__SwitchCaseStatement__Group__5 ;
    public final void rule__SwitchCaseStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3629:1: ( rule__SwitchCaseStatement__Group__4__Impl rule__SwitchCaseStatement__Group__5 )
            // InternalPortugol.g:3630:2: rule__SwitchCaseStatement__Group__4__Impl rule__SwitchCaseStatement__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__SwitchCaseStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SwitchCaseStatement__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPortugol.g:3637:1: rule__SwitchCaseStatement__Group__4__Impl : ( ( rule__SwitchCaseStatement__OtherCaseAssignment_4 )? ) ;
    public final void rule__SwitchCaseStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3641:1: ( ( ( rule__SwitchCaseStatement__OtherCaseAssignment_4 )? ) )
            // InternalPortugol.g:3642:1: ( ( rule__SwitchCaseStatement__OtherCaseAssignment_4 )? )
            {
            // InternalPortugol.g:3642:1: ( ( rule__SwitchCaseStatement__OtherCaseAssignment_4 )? )
            // InternalPortugol.g:3643:2: ( rule__SwitchCaseStatement__OtherCaseAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getOtherCaseAssignment_4()); 
            }
            // InternalPortugol.g:3644:2: ( rule__SwitchCaseStatement__OtherCaseAssignment_4 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==53) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPortugol.g:3644:3: rule__SwitchCaseStatement__OtherCaseAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__SwitchCaseStatement__OtherCaseAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseStatementAccess().getOtherCaseAssignment_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__SwitchCaseStatement__Group__5"
    // InternalPortugol.g:3652:1: rule__SwitchCaseStatement__Group__5 : rule__SwitchCaseStatement__Group__5__Impl ;
    public final void rule__SwitchCaseStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3656:1: ( rule__SwitchCaseStatement__Group__5__Impl )
            // InternalPortugol.g:3657:2: rule__SwitchCaseStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SwitchCaseStatement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchCaseStatement__Group__5"


    // $ANTLR start "rule__SwitchCaseStatement__Group__5__Impl"
    // InternalPortugol.g:3663:1: rule__SwitchCaseStatement__Group__5__Impl : ( 'fimescolha' ) ;
    public final void rule__SwitchCaseStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3667:1: ( ( 'fimescolha' ) )
            // InternalPortugol.g:3668:1: ( 'fimescolha' )
            {
            // InternalPortugol.g:3668:1: ( 'fimescolha' )
            // InternalPortugol.g:3669:2: 'fimescolha'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getFimescolhaKeyword_5()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseStatementAccess().getFimescolhaKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchCaseStatement__Group__5__Impl"


    // $ANTLR start "rule__CaseList__Group__0"
    // InternalPortugol.g:3679:1: rule__CaseList__Group__0 : rule__CaseList__Group__0__Impl rule__CaseList__Group__1 ;
    public final void rule__CaseList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3683:1: ( rule__CaseList__Group__0__Impl rule__CaseList__Group__1 )
            // InternalPortugol.g:3684:2: rule__CaseList__Group__0__Impl rule__CaseList__Group__1
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
    // InternalPortugol.g:3691:1: rule__CaseList__Group__0__Impl : ( 'caso' ) ;
    public final void rule__CaseList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3695:1: ( ( 'caso' ) )
            // InternalPortugol.g:3696:1: ( 'caso' )
            {
            // InternalPortugol.g:3696:1: ( 'caso' )
            // InternalPortugol.g:3697:2: 'caso'
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
    // InternalPortugol.g:3706:1: rule__CaseList__Group__1 : rule__CaseList__Group__1__Impl rule__CaseList__Group__2 ;
    public final void rule__CaseList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3710:1: ( rule__CaseList__Group__1__Impl rule__CaseList__Group__2 )
            // InternalPortugol.g:3711:2: rule__CaseList__Group__1__Impl rule__CaseList__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalPortugol.g:3718:1: rule__CaseList__Group__1__Impl : ( ( rule__CaseList__ExprAssignment_1 ) ) ;
    public final void rule__CaseList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3722:1: ( ( ( rule__CaseList__ExprAssignment_1 ) ) )
            // InternalPortugol.g:3723:1: ( ( rule__CaseList__ExprAssignment_1 ) )
            {
            // InternalPortugol.g:3723:1: ( ( rule__CaseList__ExprAssignment_1 ) )
            // InternalPortugol.g:3724:2: ( rule__CaseList__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getExprAssignment_1()); 
            }
            // InternalPortugol.g:3725:2: ( rule__CaseList__ExprAssignment_1 )
            // InternalPortugol.g:3725:3: rule__CaseList__ExprAssignment_1
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
    // InternalPortugol.g:3733:1: rule__CaseList__Group__2 : rule__CaseList__Group__2__Impl rule__CaseList__Group__3 ;
    public final void rule__CaseList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3737:1: ( rule__CaseList__Group__2__Impl rule__CaseList__Group__3 )
            // InternalPortugol.g:3738:2: rule__CaseList__Group__2__Impl rule__CaseList__Group__3
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
    // InternalPortugol.g:3745:1: rule__CaseList__Group__2__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__CaseList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3749:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:3750:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:3750:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:3751:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getEND_COMMANDTerminalRuleCall_2()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseListAccess().getEND_COMMANDTerminalRuleCall_2()); 
            }

            }


            }

        }
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
    // InternalPortugol.g:3760:1: rule__CaseList__Group__3 : rule__CaseList__Group__3__Impl rule__CaseList__Group__4 ;
    public final void rule__CaseList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3764:1: ( rule__CaseList__Group__3__Impl rule__CaseList__Group__4 )
            // InternalPortugol.g:3765:2: rule__CaseList__Group__3__Impl rule__CaseList__Group__4
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
    // InternalPortugol.g:3772:1: rule__CaseList__Group__3__Impl : ( ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* ) ) ;
    public final void rule__CaseList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3776:1: ( ( ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* ) ) )
            // InternalPortugol.g:3777:1: ( ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* ) )
            {
            // InternalPortugol.g:3777:1: ( ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* ) )
            // InternalPortugol.g:3778:2: ( ( rule__CaseList__CommandsAssignment_3 ) ) ( ( rule__CaseList__CommandsAssignment_3 )* )
            {
            // InternalPortugol.g:3778:2: ( ( rule__CaseList__CommandsAssignment_3 ) )
            // InternalPortugol.g:3779:3: ( rule__CaseList__CommandsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugol.g:3780:3: ( rule__CaseList__CommandsAssignment_3 )
            // InternalPortugol.g:3780:4: rule__CaseList__CommandsAssignment_3
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

            // InternalPortugol.g:3783:2: ( ( rule__CaseList__CommandsAssignment_3 )* )
            // InternalPortugol.g:3784:3: ( rule__CaseList__CommandsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugol.g:3785:3: ( rule__CaseList__CommandsAssignment_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_FLOAT)||(LA31_0>=17 && LA31_0<=18)||LA31_0==28||LA31_0==33||LA31_0==39||LA31_0==46||LA31_0==50||LA31_0==54) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalPortugol.g:3785:4: rule__CaseList__CommandsAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__CaseList__CommandsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalPortugol.g:3794:1: rule__CaseList__Group__4 : rule__CaseList__Group__4__Impl ;
    public final void rule__CaseList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3798:1: ( rule__CaseList__Group__4__Impl )
            // InternalPortugol.g:3799:2: rule__CaseList__Group__4__Impl
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
    // InternalPortugol.g:3805:1: rule__CaseList__Group__4__Impl : ( ( rule__CaseList__Group_4__0 )? ) ;
    public final void rule__CaseList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3809:1: ( ( ( rule__CaseList__Group_4__0 )? ) )
            // InternalPortugol.g:3810:1: ( ( rule__CaseList__Group_4__0 )? )
            {
            // InternalPortugol.g:3810:1: ( ( rule__CaseList__Group_4__0 )? )
            // InternalPortugol.g:3811:2: ( rule__CaseList__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getGroup_4()); 
            }
            // InternalPortugol.g:3812:2: ( rule__CaseList__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==55) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPortugol.g:3812:3: rule__CaseList__Group_4__0
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
    // InternalPortugol.g:3821:1: rule__CaseList__Group_4__0 : rule__CaseList__Group_4__0__Impl rule__CaseList__Group_4__1 ;
    public final void rule__CaseList__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3825:1: ( rule__CaseList__Group_4__0__Impl rule__CaseList__Group_4__1 )
            // InternalPortugol.g:3826:2: rule__CaseList__Group_4__0__Impl rule__CaseList__Group_4__1
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
    // InternalPortugol.g:3833:1: rule__CaseList__Group_4__0__Impl : ( ( rule__CaseList__BreakStatementAssignment_4_0 ) ) ;
    public final void rule__CaseList__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3837:1: ( ( ( rule__CaseList__BreakStatementAssignment_4_0 ) ) )
            // InternalPortugol.g:3838:1: ( ( rule__CaseList__BreakStatementAssignment_4_0 ) )
            {
            // InternalPortugol.g:3838:1: ( ( rule__CaseList__BreakStatementAssignment_4_0 ) )
            // InternalPortugol.g:3839:2: ( rule__CaseList__BreakStatementAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getBreakStatementAssignment_4_0()); 
            }
            // InternalPortugol.g:3840:2: ( rule__CaseList__BreakStatementAssignment_4_0 )
            // InternalPortugol.g:3840:3: rule__CaseList__BreakStatementAssignment_4_0
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
    // InternalPortugol.g:3848:1: rule__CaseList__Group_4__1 : rule__CaseList__Group_4__1__Impl ;
    public final void rule__CaseList__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3852:1: ( rule__CaseList__Group_4__1__Impl )
            // InternalPortugol.g:3853:2: rule__CaseList__Group_4__1__Impl
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
    // InternalPortugol.g:3859:1: rule__CaseList__Group_4__1__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__CaseList__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3863:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:3864:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:3864:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:3865:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getEND_COMMANDTerminalRuleCall_4_1()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseListAccess().getEND_COMMANDTerminalRuleCall_4_1()); 
            }

            }


            }

        }
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
    // InternalPortugol.g:3875:1: rule__OtherCase__Group__0 : rule__OtherCase__Group__0__Impl rule__OtherCase__Group__1 ;
    public final void rule__OtherCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3879:1: ( rule__OtherCase__Group__0__Impl rule__OtherCase__Group__1 )
            // InternalPortugol.g:3880:2: rule__OtherCase__Group__0__Impl rule__OtherCase__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalPortugol.g:3887:1: rule__OtherCase__Group__0__Impl : ( 'outrocaso' ) ;
    public final void rule__OtherCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3891:1: ( ( 'outrocaso' ) )
            // InternalPortugol.g:3892:1: ( 'outrocaso' )
            {
            // InternalPortugol.g:3892:1: ( 'outrocaso' )
            // InternalPortugol.g:3893:2: 'outrocaso'
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
    // InternalPortugol.g:3902:1: rule__OtherCase__Group__1 : rule__OtherCase__Group__1__Impl rule__OtherCase__Group__2 ;
    public final void rule__OtherCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3906:1: ( rule__OtherCase__Group__1__Impl rule__OtherCase__Group__2 )
            // InternalPortugol.g:3907:2: rule__OtherCase__Group__1__Impl rule__OtherCase__Group__2
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
    // InternalPortugol.g:3914:1: rule__OtherCase__Group__1__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__OtherCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3918:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:3919:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:3919:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:3920:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getEND_COMMANDTerminalRuleCall_1()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherCaseAccess().getEND_COMMANDTerminalRuleCall_1()); 
            }

            }


            }

        }
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
    // InternalPortugol.g:3929:1: rule__OtherCase__Group__2 : rule__OtherCase__Group__2__Impl rule__OtherCase__Group__3 ;
    public final void rule__OtherCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3933:1: ( rule__OtherCase__Group__2__Impl rule__OtherCase__Group__3 )
            // InternalPortugol.g:3934:2: rule__OtherCase__Group__2__Impl rule__OtherCase__Group__3
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
    // InternalPortugol.g:3941:1: rule__OtherCase__Group__2__Impl : ( ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* ) ) ;
    public final void rule__OtherCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3945:1: ( ( ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* ) ) )
            // InternalPortugol.g:3946:1: ( ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* ) )
            {
            // InternalPortugol.g:3946:1: ( ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* ) )
            // InternalPortugol.g:3947:2: ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) ) ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* )
            {
            // InternalPortugol.g:3947:2: ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 ) )
            // InternalPortugol.g:3948:3: ( rule__OtherCase__OtherCaseCommandsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getOtherCaseCommandsAssignment_2()); 
            }
            // InternalPortugol.g:3949:3: ( rule__OtherCase__OtherCaseCommandsAssignment_2 )
            // InternalPortugol.g:3949:4: rule__OtherCase__OtherCaseCommandsAssignment_2
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

            // InternalPortugol.g:3952:2: ( ( rule__OtherCase__OtherCaseCommandsAssignment_2 )* )
            // InternalPortugol.g:3953:3: ( rule__OtherCase__OtherCaseCommandsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getOtherCaseCommandsAssignment_2()); 
            }
            // InternalPortugol.g:3954:3: ( rule__OtherCase__OtherCaseCommandsAssignment_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_FLOAT)||(LA33_0>=17 && LA33_0<=18)||LA33_0==28||LA33_0==33||LA33_0==39||LA33_0==46||LA33_0==50||LA33_0==54) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPortugol.g:3954:4: rule__OtherCase__OtherCaseCommandsAssignment_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__OtherCase__OtherCaseCommandsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalPortugol.g:3963:1: rule__OtherCase__Group__3 : rule__OtherCase__Group__3__Impl ;
    public final void rule__OtherCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3967:1: ( rule__OtherCase__Group__3__Impl )
            // InternalPortugol.g:3968:2: rule__OtherCase__Group__3__Impl
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
    // InternalPortugol.g:3974:1: rule__OtherCase__Group__3__Impl : ( ( rule__OtherCase__Group_3__0 )? ) ;
    public final void rule__OtherCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3978:1: ( ( ( rule__OtherCase__Group_3__0 )? ) )
            // InternalPortugol.g:3979:1: ( ( rule__OtherCase__Group_3__0 )? )
            {
            // InternalPortugol.g:3979:1: ( ( rule__OtherCase__Group_3__0 )? )
            // InternalPortugol.g:3980:2: ( rule__OtherCase__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getGroup_3()); 
            }
            // InternalPortugol.g:3981:2: ( rule__OtherCase__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==55) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPortugol.g:3981:3: rule__OtherCase__Group_3__0
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
    // InternalPortugol.g:3990:1: rule__OtherCase__Group_3__0 : rule__OtherCase__Group_3__0__Impl rule__OtherCase__Group_3__1 ;
    public final void rule__OtherCase__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3994:1: ( rule__OtherCase__Group_3__0__Impl rule__OtherCase__Group_3__1 )
            // InternalPortugol.g:3995:2: rule__OtherCase__Group_3__0__Impl rule__OtherCase__Group_3__1
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
    // InternalPortugol.g:4002:1: rule__OtherCase__Group_3__0__Impl : ( ( rule__OtherCase__BreakStatementAssignment_3_0 ) ) ;
    public final void rule__OtherCase__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4006:1: ( ( ( rule__OtherCase__BreakStatementAssignment_3_0 ) ) )
            // InternalPortugol.g:4007:1: ( ( rule__OtherCase__BreakStatementAssignment_3_0 ) )
            {
            // InternalPortugol.g:4007:1: ( ( rule__OtherCase__BreakStatementAssignment_3_0 ) )
            // InternalPortugol.g:4008:2: ( rule__OtherCase__BreakStatementAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getBreakStatementAssignment_3_0()); 
            }
            // InternalPortugol.g:4009:2: ( rule__OtherCase__BreakStatementAssignment_3_0 )
            // InternalPortugol.g:4009:3: rule__OtherCase__BreakStatementAssignment_3_0
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
    // InternalPortugol.g:4017:1: rule__OtherCase__Group_3__1 : rule__OtherCase__Group_3__1__Impl ;
    public final void rule__OtherCase__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4021:1: ( rule__OtherCase__Group_3__1__Impl )
            // InternalPortugol.g:4022:2: rule__OtherCase__Group_3__1__Impl
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
    // InternalPortugol.g:4028:1: rule__OtherCase__Group_3__1__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__OtherCase__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4032:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:4033:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:4033:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:4034:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getEND_COMMANDTerminalRuleCall_3_1()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherCaseAccess().getEND_COMMANDTerminalRuleCall_3_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__SubprogramParam__Group__0"
    // InternalPortugol.g:4044:1: rule__SubprogramParam__Group__0 : rule__SubprogramParam__Group__0__Impl rule__SubprogramParam__Group__1 ;
    public final void rule__SubprogramParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4048:1: ( rule__SubprogramParam__Group__0__Impl rule__SubprogramParam__Group__1 )
            // InternalPortugol.g:4049:2: rule__SubprogramParam__Group__0__Impl rule__SubprogramParam__Group__1
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
    // InternalPortugol.g:4056:1: rule__SubprogramParam__Group__0__Impl : ( ( rule__SubprogramParam__ExpressionAssignment_0 ) ) ;
    public final void rule__SubprogramParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4060:1: ( ( ( rule__SubprogramParam__ExpressionAssignment_0 ) ) )
            // InternalPortugol.g:4061:1: ( ( rule__SubprogramParam__ExpressionAssignment_0 ) )
            {
            // InternalPortugol.g:4061:1: ( ( rule__SubprogramParam__ExpressionAssignment_0 ) )
            // InternalPortugol.g:4062:2: ( rule__SubprogramParam__ExpressionAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamAccess().getExpressionAssignment_0()); 
            }
            // InternalPortugol.g:4063:2: ( rule__SubprogramParam__ExpressionAssignment_0 )
            // InternalPortugol.g:4063:3: rule__SubprogramParam__ExpressionAssignment_0
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
    // InternalPortugol.g:4071:1: rule__SubprogramParam__Group__1 : rule__SubprogramParam__Group__1__Impl ;
    public final void rule__SubprogramParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4075:1: ( rule__SubprogramParam__Group__1__Impl )
            // InternalPortugol.g:4076:2: rule__SubprogramParam__Group__1__Impl
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
    // InternalPortugol.g:4082:1: rule__SubprogramParam__Group__1__Impl : ( ( rule__SubprogramParam__Group_1__0 )* ) ;
    public final void rule__SubprogramParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4086:1: ( ( ( rule__SubprogramParam__Group_1__0 )* ) )
            // InternalPortugol.g:4087:1: ( ( rule__SubprogramParam__Group_1__0 )* )
            {
            // InternalPortugol.g:4087:1: ( ( rule__SubprogramParam__Group_1__0 )* )
            // InternalPortugol.g:4088:2: ( rule__SubprogramParam__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamAccess().getGroup_1()); 
            }
            // InternalPortugol.g:4089:2: ( rule__SubprogramParam__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==37) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalPortugol.g:4089:3: rule__SubprogramParam__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SubprogramParam__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalPortugol.g:4098:1: rule__SubprogramParam__Group_1__0 : rule__SubprogramParam__Group_1__0__Impl rule__SubprogramParam__Group_1__1 ;
    public final void rule__SubprogramParam__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4102:1: ( rule__SubprogramParam__Group_1__0__Impl rule__SubprogramParam__Group_1__1 )
            // InternalPortugol.g:4103:2: rule__SubprogramParam__Group_1__0__Impl rule__SubprogramParam__Group_1__1
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
    // InternalPortugol.g:4110:1: rule__SubprogramParam__Group_1__0__Impl : ( ',' ) ;
    public final void rule__SubprogramParam__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4114:1: ( ( ',' ) )
            // InternalPortugol.g:4115:1: ( ',' )
            {
            // InternalPortugol.g:4115:1: ( ',' )
            // InternalPortugol.g:4116:2: ','
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
    // InternalPortugol.g:4125:1: rule__SubprogramParam__Group_1__1 : rule__SubprogramParam__Group_1__1__Impl ;
    public final void rule__SubprogramParam__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4129:1: ( rule__SubprogramParam__Group_1__1__Impl )
            // InternalPortugol.g:4130:2: rule__SubprogramParam__Group_1__1__Impl
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
    // InternalPortugol.g:4136:1: rule__SubprogramParam__Group_1__1__Impl : ( ( rule__SubprogramParam__ExpressionAssignment_1_1 ) ) ;
    public final void rule__SubprogramParam__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4140:1: ( ( ( rule__SubprogramParam__ExpressionAssignment_1_1 ) ) )
            // InternalPortugol.g:4141:1: ( ( rule__SubprogramParam__ExpressionAssignment_1_1 ) )
            {
            // InternalPortugol.g:4141:1: ( ( rule__SubprogramParam__ExpressionAssignment_1_1 ) )
            // InternalPortugol.g:4142:2: ( rule__SubprogramParam__ExpressionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubprogramParamAccess().getExpressionAssignment_1_1()); 
            }
            // InternalPortugol.g:4143:2: ( rule__SubprogramParam__ExpressionAssignment_1_1 )
            // InternalPortugol.g:4143:3: rule__SubprogramParam__ExpressionAssignment_1_1
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
    // InternalPortugol.g:4152:1: rule__ReadCommand__Group__0 : rule__ReadCommand__Group__0__Impl rule__ReadCommand__Group__1 ;
    public final void rule__ReadCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4156:1: ( rule__ReadCommand__Group__0__Impl rule__ReadCommand__Group__1 )
            // InternalPortugol.g:4157:2: rule__ReadCommand__Group__0__Impl rule__ReadCommand__Group__1
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
    // InternalPortugol.g:4164:1: rule__ReadCommand__Group__0__Impl : ( 'leia' ) ;
    public final void rule__ReadCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4168:1: ( ( 'leia' ) )
            // InternalPortugol.g:4169:1: ( 'leia' )
            {
            // InternalPortugol.g:4169:1: ( 'leia' )
            // InternalPortugol.g:4170:2: 'leia'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getLeiaKeyword_0()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:4179:1: rule__ReadCommand__Group__1 : rule__ReadCommand__Group__1__Impl rule__ReadCommand__Group__2 ;
    public final void rule__ReadCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4183:1: ( rule__ReadCommand__Group__1__Impl rule__ReadCommand__Group__2 )
            // InternalPortugol.g:4184:2: rule__ReadCommand__Group__1__Impl rule__ReadCommand__Group__2
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
    // InternalPortugol.g:4191:1: rule__ReadCommand__Group__1__Impl : ( '(' ) ;
    public final void rule__ReadCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4195:1: ( ( '(' ) )
            // InternalPortugol.g:4196:1: ( '(' )
            {
            // InternalPortugol.g:4196:1: ( '(' )
            // InternalPortugol.g:4197:2: '('
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
    // InternalPortugol.g:4206:1: rule__ReadCommand__Group__2 : rule__ReadCommand__Group__2__Impl rule__ReadCommand__Group__3 ;
    public final void rule__ReadCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4210:1: ( rule__ReadCommand__Group__2__Impl rule__ReadCommand__Group__3 )
            // InternalPortugol.g:4211:2: rule__ReadCommand__Group__2__Impl rule__ReadCommand__Group__3
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
    // InternalPortugol.g:4218:1: rule__ReadCommand__Group__2__Impl : ( ( rule__ReadCommand__ParamListAssignment_2 ) ) ;
    public final void rule__ReadCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4222:1: ( ( ( rule__ReadCommand__ParamListAssignment_2 ) ) )
            // InternalPortugol.g:4223:1: ( ( rule__ReadCommand__ParamListAssignment_2 ) )
            {
            // InternalPortugol.g:4223:1: ( ( rule__ReadCommand__ParamListAssignment_2 ) )
            // InternalPortugol.g:4224:2: ( rule__ReadCommand__ParamListAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getParamListAssignment_2()); 
            }
            // InternalPortugol.g:4225:2: ( rule__ReadCommand__ParamListAssignment_2 )
            // InternalPortugol.g:4225:3: rule__ReadCommand__ParamListAssignment_2
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
    // InternalPortugol.g:4233:1: rule__ReadCommand__Group__3 : rule__ReadCommand__Group__3__Impl ;
    public final void rule__ReadCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4237:1: ( rule__ReadCommand__Group__3__Impl )
            // InternalPortugol.g:4238:2: rule__ReadCommand__Group__3__Impl
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
    // InternalPortugol.g:4244:1: rule__ReadCommand__Group__3__Impl : ( ')' ) ;
    public final void rule__ReadCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4248:1: ( ( ')' ) )
            // InternalPortugol.g:4249:1: ( ')' )
            {
            // InternalPortugol.g:4249:1: ( ')' )
            // InternalPortugol.g:4250:2: ')'
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
    // InternalPortugol.g:4260:1: rule__WriteCommand__Group__0 : rule__WriteCommand__Group__0__Impl rule__WriteCommand__Group__1 ;
    public final void rule__WriteCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4264:1: ( rule__WriteCommand__Group__0__Impl rule__WriteCommand__Group__1 )
            // InternalPortugol.g:4265:2: rule__WriteCommand__Group__0__Impl rule__WriteCommand__Group__1
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
    // InternalPortugol.g:4272:1: rule__WriteCommand__Group__0__Impl : ( ( rule__WriteCommand__WriteCommandAssignment_0 ) ) ;
    public final void rule__WriteCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4276:1: ( ( ( rule__WriteCommand__WriteCommandAssignment_0 ) ) )
            // InternalPortugol.g:4277:1: ( ( rule__WriteCommand__WriteCommandAssignment_0 ) )
            {
            // InternalPortugol.g:4277:1: ( ( rule__WriteCommand__WriteCommandAssignment_0 ) )
            // InternalPortugol.g:4278:2: ( rule__WriteCommand__WriteCommandAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getWriteCommandAssignment_0()); 
            }
            // InternalPortugol.g:4279:2: ( rule__WriteCommand__WriteCommandAssignment_0 )
            // InternalPortugol.g:4279:3: rule__WriteCommand__WriteCommandAssignment_0
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
    // InternalPortugol.g:4287:1: rule__WriteCommand__Group__1 : rule__WriteCommand__Group__1__Impl rule__WriteCommand__Group__2 ;
    public final void rule__WriteCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4291:1: ( rule__WriteCommand__Group__1__Impl rule__WriteCommand__Group__2 )
            // InternalPortugol.g:4292:2: rule__WriteCommand__Group__1__Impl rule__WriteCommand__Group__2
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
    // InternalPortugol.g:4299:1: rule__WriteCommand__Group__1__Impl : ( '(' ) ;
    public final void rule__WriteCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4303:1: ( ( '(' ) )
            // InternalPortugol.g:4304:1: ( '(' )
            {
            // InternalPortugol.g:4304:1: ( '(' )
            // InternalPortugol.g:4305:2: '('
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
    // InternalPortugol.g:4314:1: rule__WriteCommand__Group__2 : rule__WriteCommand__Group__2__Impl rule__WriteCommand__Group__3 ;
    public final void rule__WriteCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4318:1: ( rule__WriteCommand__Group__2__Impl rule__WriteCommand__Group__3 )
            // InternalPortugol.g:4319:2: rule__WriteCommand__Group__2__Impl rule__WriteCommand__Group__3
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
    // InternalPortugol.g:4326:1: rule__WriteCommand__Group__2__Impl : ( ( rule__WriteCommand__WriteParamAssignment_2 ) ) ;
    public final void rule__WriteCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4330:1: ( ( ( rule__WriteCommand__WriteParamAssignment_2 ) ) )
            // InternalPortugol.g:4331:1: ( ( rule__WriteCommand__WriteParamAssignment_2 ) )
            {
            // InternalPortugol.g:4331:1: ( ( rule__WriteCommand__WriteParamAssignment_2 ) )
            // InternalPortugol.g:4332:2: ( rule__WriteCommand__WriteParamAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getWriteParamAssignment_2()); 
            }
            // InternalPortugol.g:4333:2: ( rule__WriteCommand__WriteParamAssignment_2 )
            // InternalPortugol.g:4333:3: rule__WriteCommand__WriteParamAssignment_2
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
    // InternalPortugol.g:4341:1: rule__WriteCommand__Group__3 : rule__WriteCommand__Group__3__Impl ;
    public final void rule__WriteCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4345:1: ( rule__WriteCommand__Group__3__Impl )
            // InternalPortugol.g:4346:2: rule__WriteCommand__Group__3__Impl
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
    // InternalPortugol.g:4352:1: rule__WriteCommand__Group__3__Impl : ( ')' ) ;
    public final void rule__WriteCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4356:1: ( ( ')' ) )
            // InternalPortugol.g:4357:1: ( ')' )
            {
            // InternalPortugol.g:4357:1: ( ')' )
            // InternalPortugol.g:4358:2: ')'
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
    // InternalPortugol.g:4368:1: rule__WriteParam__Group__0 : rule__WriteParam__Group__0__Impl rule__WriteParam__Group__1 ;
    public final void rule__WriteParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4372:1: ( rule__WriteParam__Group__0__Impl rule__WriteParam__Group__1 )
            // InternalPortugol.g:4373:2: rule__WriteParam__Group__0__Impl rule__WriteParam__Group__1
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
    // InternalPortugol.g:4380:1: rule__WriteParam__Group__0__Impl : ( ( rule__WriteParam__ParamsAssignment_0 ) ) ;
    public final void rule__WriteParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4384:1: ( ( ( rule__WriteParam__ParamsAssignment_0 ) ) )
            // InternalPortugol.g:4385:1: ( ( rule__WriteParam__ParamsAssignment_0 ) )
            {
            // InternalPortugol.g:4385:1: ( ( rule__WriteParam__ParamsAssignment_0 ) )
            // InternalPortugol.g:4386:2: ( rule__WriteParam__ParamsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getParamsAssignment_0()); 
            }
            // InternalPortugol.g:4387:2: ( rule__WriteParam__ParamsAssignment_0 )
            // InternalPortugol.g:4387:3: rule__WriteParam__ParamsAssignment_0
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
    // InternalPortugol.g:4395:1: rule__WriteParam__Group__1 : rule__WriteParam__Group__1__Impl ;
    public final void rule__WriteParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4399:1: ( rule__WriteParam__Group__1__Impl )
            // InternalPortugol.g:4400:2: rule__WriteParam__Group__1__Impl
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
    // InternalPortugol.g:4406:1: rule__WriteParam__Group__1__Impl : ( ( rule__WriteParam__PrecisionAssignment_1 )? ) ;
    public final void rule__WriteParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4410:1: ( ( ( rule__WriteParam__PrecisionAssignment_1 )? ) )
            // InternalPortugol.g:4411:1: ( ( rule__WriteParam__PrecisionAssignment_1 )? )
            {
            // InternalPortugol.g:4411:1: ( ( rule__WriteParam__PrecisionAssignment_1 )? )
            // InternalPortugol.g:4412:2: ( rule__WriteParam__PrecisionAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getPrecisionAssignment_1()); 
            }
            // InternalPortugol.g:4413:2: ( rule__WriteParam__PrecisionAssignment_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==36) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalPortugol.g:4413:3: rule__WriteParam__PrecisionAssignment_1
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
    // InternalPortugol.g:4422:1: rule__OptDecimalPrecision__Group__0 : rule__OptDecimalPrecision__Group__0__Impl rule__OptDecimalPrecision__Group__1 ;
    public final void rule__OptDecimalPrecision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4426:1: ( rule__OptDecimalPrecision__Group__0__Impl rule__OptDecimalPrecision__Group__1 )
            // InternalPortugol.g:4427:2: rule__OptDecimalPrecision__Group__0__Impl rule__OptDecimalPrecision__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalPortugol.g:4434:1: rule__OptDecimalPrecision__Group__0__Impl : ( ':' ) ;
    public final void rule__OptDecimalPrecision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4438:1: ( ( ':' ) )
            // InternalPortugol.g:4439:1: ( ':' )
            {
            // InternalPortugol.g:4439:1: ( ':' )
            // InternalPortugol.g:4440:2: ':'
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
    // InternalPortugol.g:4449:1: rule__OptDecimalPrecision__Group__1 : rule__OptDecimalPrecision__Group__1__Impl rule__OptDecimalPrecision__Group__2 ;
    public final void rule__OptDecimalPrecision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4453:1: ( rule__OptDecimalPrecision__Group__1__Impl rule__OptDecimalPrecision__Group__2 )
            // InternalPortugol.g:4454:2: rule__OptDecimalPrecision__Group__1__Impl rule__OptDecimalPrecision__Group__2
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
    // InternalPortugol.g:4461:1: rule__OptDecimalPrecision__Group__1__Impl : ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) ) ;
    public final void rule__OptDecimalPrecision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4465:1: ( ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) ) )
            // InternalPortugol.g:4466:1: ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) )
            {
            // InternalPortugol.g:4466:1: ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) )
            // InternalPortugol.g:4467:2: ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getFirstPrecisionAssignment_1()); 
            }
            // InternalPortugol.g:4468:2: ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 )
            // InternalPortugol.g:4468:3: rule__OptDecimalPrecision__FirstPrecisionAssignment_1
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
    // InternalPortugol.g:4476:1: rule__OptDecimalPrecision__Group__2 : rule__OptDecimalPrecision__Group__2__Impl ;
    public final void rule__OptDecimalPrecision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4480:1: ( rule__OptDecimalPrecision__Group__2__Impl )
            // InternalPortugol.g:4481:2: rule__OptDecimalPrecision__Group__2__Impl
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
    // InternalPortugol.g:4487:1: rule__OptDecimalPrecision__Group__2__Impl : ( ( rule__OptDecimalPrecision__Group_2__0 )? ) ;
    public final void rule__OptDecimalPrecision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4491:1: ( ( ( rule__OptDecimalPrecision__Group_2__0 )? ) )
            // InternalPortugol.g:4492:1: ( ( rule__OptDecimalPrecision__Group_2__0 )? )
            {
            // InternalPortugol.g:4492:1: ( ( rule__OptDecimalPrecision__Group_2__0 )? )
            // InternalPortugol.g:4493:2: ( rule__OptDecimalPrecision__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getGroup_2()); 
            }
            // InternalPortugol.g:4494:2: ( rule__OptDecimalPrecision__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==36) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPortugol.g:4494:3: rule__OptDecimalPrecision__Group_2__0
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
    // InternalPortugol.g:4503:1: rule__OptDecimalPrecision__Group_2__0 : rule__OptDecimalPrecision__Group_2__0__Impl rule__OptDecimalPrecision__Group_2__1 ;
    public final void rule__OptDecimalPrecision__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4507:1: ( rule__OptDecimalPrecision__Group_2__0__Impl rule__OptDecimalPrecision__Group_2__1 )
            // InternalPortugol.g:4508:2: rule__OptDecimalPrecision__Group_2__0__Impl rule__OptDecimalPrecision__Group_2__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalPortugol.g:4515:1: rule__OptDecimalPrecision__Group_2__0__Impl : ( ':' ) ;
    public final void rule__OptDecimalPrecision__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4519:1: ( ( ':' ) )
            // InternalPortugol.g:4520:1: ( ':' )
            {
            // InternalPortugol.g:4520:1: ( ':' )
            // InternalPortugol.g:4521:2: ':'
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
    // InternalPortugol.g:4530:1: rule__OptDecimalPrecision__Group_2__1 : rule__OptDecimalPrecision__Group_2__1__Impl ;
    public final void rule__OptDecimalPrecision__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4534:1: ( rule__OptDecimalPrecision__Group_2__1__Impl )
            // InternalPortugol.g:4535:2: rule__OptDecimalPrecision__Group_2__1__Impl
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
    // InternalPortugol.g:4541:1: rule__OptDecimalPrecision__Group_2__1__Impl : ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) ) ;
    public final void rule__OptDecimalPrecision__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4545:1: ( ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) ) )
            // InternalPortugol.g:4546:1: ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) )
            {
            // InternalPortugol.g:4546:1: ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) )
            // InternalPortugol.g:4547:2: ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getSecondPrecisionAssignment_2_1()); 
            }
            // InternalPortugol.g:4548:2: ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 )
            // InternalPortugol.g:4548:3: rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1
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
    // InternalPortugol.g:4557:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4561:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalPortugol.g:4562:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalPortugol.g:4569:1: rule__Assignment__Group__0__Impl : ( ruleOrExpression ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4573:1: ( ( ruleOrExpression ) )
            // InternalPortugol.g:4574:1: ( ruleOrExpression )
            {
            // InternalPortugol.g:4574:1: ( ruleOrExpression )
            // InternalPortugol.g:4575:2: ruleOrExpression
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
    // InternalPortugol.g:4584:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4588:1: ( rule__Assignment__Group__1__Impl )
            // InternalPortugol.g:4589:2: rule__Assignment__Group__1__Impl
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
    // InternalPortugol.g:4595:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__Group_1__0 )* ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4599:1: ( ( ( rule__Assignment__Group_1__0 )* ) )
            // InternalPortugol.g:4600:1: ( ( rule__Assignment__Group_1__0 )* )
            {
            // InternalPortugol.g:4600:1: ( ( rule__Assignment__Group_1__0 )* )
            // InternalPortugol.g:4601:2: ( rule__Assignment__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_1()); 
            }
            // InternalPortugol.g:4602:2: ( rule__Assignment__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==56) ) {
                    int LA38_2 = input.LA(2);

                    if ( (synpred49_InternalPortugol()) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // InternalPortugol.g:4602:3: rule__Assignment__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Assignment__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalPortugol.g:4611:1: rule__Assignment__Group_1__0 : rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 ;
    public final void rule__Assignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4615:1: ( rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 )
            // InternalPortugol.g:4616:2: rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1
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
    // InternalPortugol.g:4623:1: rule__Assignment__Group_1__0__Impl : ( ( rule__Assignment__Group_1_0__0 ) ) ;
    public final void rule__Assignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4627:1: ( ( ( rule__Assignment__Group_1_0__0 ) ) )
            // InternalPortugol.g:4628:1: ( ( rule__Assignment__Group_1_0__0 ) )
            {
            // InternalPortugol.g:4628:1: ( ( rule__Assignment__Group_1_0__0 ) )
            // InternalPortugol.g:4629:2: ( rule__Assignment__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:4630:2: ( rule__Assignment__Group_1_0__0 )
            // InternalPortugol.g:4630:3: rule__Assignment__Group_1_0__0
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
    // InternalPortugol.g:4638:1: rule__Assignment__Group_1__1 : rule__Assignment__Group_1__1__Impl ;
    public final void rule__Assignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4642:1: ( rule__Assignment__Group_1__1__Impl )
            // InternalPortugol.g:4643:2: rule__Assignment__Group_1__1__Impl
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
    // InternalPortugol.g:4649:1: rule__Assignment__Group_1__1__Impl : ( ( rule__Assignment__RightAssignment_1_1 ) ) ;
    public final void rule__Assignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4653:1: ( ( ( rule__Assignment__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:4654:1: ( ( rule__Assignment__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:4654:1: ( ( rule__Assignment__RightAssignment_1_1 ) )
            // InternalPortugol.g:4655:2: ( rule__Assignment__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:4656:2: ( rule__Assignment__RightAssignment_1_1 )
            // InternalPortugol.g:4656:3: rule__Assignment__RightAssignment_1_1
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
    // InternalPortugol.g:4665:1: rule__Assignment__Group_1_0__0 : rule__Assignment__Group_1_0__0__Impl ;
    public final void rule__Assignment__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4669:1: ( rule__Assignment__Group_1_0__0__Impl )
            // InternalPortugol.g:4670:2: rule__Assignment__Group_1_0__0__Impl
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
    // InternalPortugol.g:4676:1: rule__Assignment__Group_1_0__0__Impl : ( ( rule__Assignment__Group_1_0_0__0 ) ) ;
    public final void rule__Assignment__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4680:1: ( ( ( rule__Assignment__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:4681:1: ( ( rule__Assignment__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:4681:1: ( ( rule__Assignment__Group_1_0_0__0 ) )
            // InternalPortugol.g:4682:2: ( rule__Assignment__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:4683:2: ( rule__Assignment__Group_1_0_0__0 )
            // InternalPortugol.g:4683:3: rule__Assignment__Group_1_0_0__0
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
    // InternalPortugol.g:4692:1: rule__Assignment__Group_1_0_0__0 : rule__Assignment__Group_1_0_0__0__Impl rule__Assignment__Group_1_0_0__1 ;
    public final void rule__Assignment__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4696:1: ( rule__Assignment__Group_1_0_0__0__Impl rule__Assignment__Group_1_0_0__1 )
            // InternalPortugol.g:4697:2: rule__Assignment__Group_1_0_0__0__Impl rule__Assignment__Group_1_0_0__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalPortugol.g:4704:1: rule__Assignment__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Assignment__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4708:1: ( ( () ) )
            // InternalPortugol.g:4709:1: ( () )
            {
            // InternalPortugol.g:4709:1: ( () )
            // InternalPortugol.g:4710:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:4711:2: ()
            // InternalPortugol.g:4711:3: 
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
    // InternalPortugol.g:4719:1: rule__Assignment__Group_1_0_0__1 : rule__Assignment__Group_1_0_0__1__Impl ;
    public final void rule__Assignment__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4723:1: ( rule__Assignment__Group_1_0_0__1__Impl )
            // InternalPortugol.g:4724:2: rule__Assignment__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:4730:1: rule__Assignment__Group_1_0_0__1__Impl : ( ( rule__Assignment__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__Assignment__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4734:1: ( ( ( rule__Assignment__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:4735:1: ( ( rule__Assignment__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:4735:1: ( ( rule__Assignment__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:4736:2: ( rule__Assignment__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:4737:2: ( rule__Assignment__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:4737:3: rule__Assignment__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:4746:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4750:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalPortugol.g:4751:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalPortugol.g:4758:1: rule__OrExpression__Group__0__Impl : ( ruleXorExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4762:1: ( ( ruleXorExpression ) )
            // InternalPortugol.g:4763:1: ( ruleXorExpression )
            {
            // InternalPortugol.g:4763:1: ( ruleXorExpression )
            // InternalPortugol.g:4764:2: ruleXorExpression
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
    // InternalPortugol.g:4773:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4777:1: ( rule__OrExpression__Group__1__Impl )
            // InternalPortugol.g:4778:2: rule__OrExpression__Group__1__Impl
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
    // InternalPortugol.g:4784:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4788:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalPortugol.g:4789:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:4789:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalPortugol.g:4790:2: ( rule__OrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:4791:2: ( rule__OrExpression__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==57) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalPortugol.g:4791:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalPortugol.g:4800:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4804:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalPortugol.g:4805:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
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
    // InternalPortugol.g:4812:1: rule__OrExpression__Group_1__0__Impl : ( ( rule__OrExpression__Group_1_0__0 ) ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4816:1: ( ( ( rule__OrExpression__Group_1_0__0 ) ) )
            // InternalPortugol.g:4817:1: ( ( rule__OrExpression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:4817:1: ( ( rule__OrExpression__Group_1_0__0 ) )
            // InternalPortugol.g:4818:2: ( rule__OrExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:4819:2: ( rule__OrExpression__Group_1_0__0 )
            // InternalPortugol.g:4819:3: rule__OrExpression__Group_1_0__0
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
    // InternalPortugol.g:4827:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4831:1: ( rule__OrExpression__Group_1__1__Impl )
            // InternalPortugol.g:4832:2: rule__OrExpression__Group_1__1__Impl
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
    // InternalPortugol.g:4838:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__RightAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4842:1: ( ( ( rule__OrExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:4843:1: ( ( rule__OrExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:4843:1: ( ( rule__OrExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:4844:2: ( rule__OrExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:4845:2: ( rule__OrExpression__RightAssignment_1_1 )
            // InternalPortugol.g:4845:3: rule__OrExpression__RightAssignment_1_1
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
    // InternalPortugol.g:4854:1: rule__OrExpression__Group_1_0__0 : rule__OrExpression__Group_1_0__0__Impl ;
    public final void rule__OrExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4858:1: ( rule__OrExpression__Group_1_0__0__Impl )
            // InternalPortugol.g:4859:2: rule__OrExpression__Group_1_0__0__Impl
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
    // InternalPortugol.g:4865:1: rule__OrExpression__Group_1_0__0__Impl : ( ( rule__OrExpression__Group_1_0_0__0 ) ) ;
    public final void rule__OrExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4869:1: ( ( ( rule__OrExpression__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:4870:1: ( ( rule__OrExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:4870:1: ( ( rule__OrExpression__Group_1_0_0__0 ) )
            // InternalPortugol.g:4871:2: ( rule__OrExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:4872:2: ( rule__OrExpression__Group_1_0_0__0 )
            // InternalPortugol.g:4872:3: rule__OrExpression__Group_1_0_0__0
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
    // InternalPortugol.g:4881:1: rule__OrExpression__Group_1_0_0__0 : rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1 ;
    public final void rule__OrExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4885:1: ( rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1 )
            // InternalPortugol.g:4886:2: rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalPortugol.g:4893:1: rule__OrExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4897:1: ( ( () ) )
            // InternalPortugol.g:4898:1: ( () )
            {
            // InternalPortugol.g:4898:1: ( () )
            // InternalPortugol.g:4899:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:4900:2: ()
            // InternalPortugol.g:4900:3: 
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
    // InternalPortugol.g:4908:1: rule__OrExpression__Group_1_0_0__1 : rule__OrExpression__Group_1_0_0__1__Impl ;
    public final void rule__OrExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4912:1: ( rule__OrExpression__Group_1_0_0__1__Impl )
            // InternalPortugol.g:4913:2: rule__OrExpression__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:4919:1: rule__OrExpression__Group_1_0_0__1__Impl : ( ( rule__OrExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__OrExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4923:1: ( ( ( rule__OrExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:4924:1: ( ( rule__OrExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:4924:1: ( ( rule__OrExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:4925:2: ( rule__OrExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:4926:2: ( rule__OrExpression__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:4926:3: rule__OrExpression__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:4935:1: rule__XorExpression__Group__0 : rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 ;
    public final void rule__XorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4939:1: ( rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 )
            // InternalPortugol.g:4940:2: rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalPortugol.g:4947:1: rule__XorExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__XorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4951:1: ( ( ruleAndExpression ) )
            // InternalPortugol.g:4952:1: ( ruleAndExpression )
            {
            // InternalPortugol.g:4952:1: ( ruleAndExpression )
            // InternalPortugol.g:4953:2: ruleAndExpression
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
    // InternalPortugol.g:4962:1: rule__XorExpression__Group__1 : rule__XorExpression__Group__1__Impl ;
    public final void rule__XorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4966:1: ( rule__XorExpression__Group__1__Impl )
            // InternalPortugol.g:4967:2: rule__XorExpression__Group__1__Impl
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
    // InternalPortugol.g:4973:1: rule__XorExpression__Group__1__Impl : ( ( rule__XorExpression__Group_1__0 )* ) ;
    public final void rule__XorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4977:1: ( ( ( rule__XorExpression__Group_1__0 )* ) )
            // InternalPortugol.g:4978:1: ( ( rule__XorExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:4978:1: ( ( rule__XorExpression__Group_1__0 )* )
            // InternalPortugol.g:4979:2: ( rule__XorExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:4980:2: ( rule__XorExpression__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==58) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPortugol.g:4980:3: rule__XorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__XorExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalPortugol.g:4989:1: rule__XorExpression__Group_1__0 : rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 ;
    public final void rule__XorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4993:1: ( rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 )
            // InternalPortugol.g:4994:2: rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1
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
    // InternalPortugol.g:5001:1: rule__XorExpression__Group_1__0__Impl : ( ( rule__XorExpression__Group_1_0__0 ) ) ;
    public final void rule__XorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5005:1: ( ( ( rule__XorExpression__Group_1_0__0 ) ) )
            // InternalPortugol.g:5006:1: ( ( rule__XorExpression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:5006:1: ( ( rule__XorExpression__Group_1_0__0 ) )
            // InternalPortugol.g:5007:2: ( rule__XorExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:5008:2: ( rule__XorExpression__Group_1_0__0 )
            // InternalPortugol.g:5008:3: rule__XorExpression__Group_1_0__0
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
    // InternalPortugol.g:5016:1: rule__XorExpression__Group_1__1 : rule__XorExpression__Group_1__1__Impl ;
    public final void rule__XorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5020:1: ( rule__XorExpression__Group_1__1__Impl )
            // InternalPortugol.g:5021:2: rule__XorExpression__Group_1__1__Impl
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
    // InternalPortugol.g:5027:1: rule__XorExpression__Group_1__1__Impl : ( ( rule__XorExpression__RightAssignment_1_1 ) ) ;
    public final void rule__XorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5031:1: ( ( ( rule__XorExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:5032:1: ( ( rule__XorExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:5032:1: ( ( rule__XorExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:5033:2: ( rule__XorExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:5034:2: ( rule__XorExpression__RightAssignment_1_1 )
            // InternalPortugol.g:5034:3: rule__XorExpression__RightAssignment_1_1
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
    // InternalPortugol.g:5043:1: rule__XorExpression__Group_1_0__0 : rule__XorExpression__Group_1_0__0__Impl ;
    public final void rule__XorExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5047:1: ( rule__XorExpression__Group_1_0__0__Impl )
            // InternalPortugol.g:5048:2: rule__XorExpression__Group_1_0__0__Impl
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
    // InternalPortugol.g:5054:1: rule__XorExpression__Group_1_0__0__Impl : ( ( rule__XorExpression__Group_1_0_0__0 ) ) ;
    public final void rule__XorExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5058:1: ( ( ( rule__XorExpression__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:5059:1: ( ( rule__XorExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:5059:1: ( ( rule__XorExpression__Group_1_0_0__0 ) )
            // InternalPortugol.g:5060:2: ( rule__XorExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:5061:2: ( rule__XorExpression__Group_1_0_0__0 )
            // InternalPortugol.g:5061:3: rule__XorExpression__Group_1_0_0__0
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
    // InternalPortugol.g:5070:1: rule__XorExpression__Group_1_0_0__0 : rule__XorExpression__Group_1_0_0__0__Impl rule__XorExpression__Group_1_0_0__1 ;
    public final void rule__XorExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5074:1: ( rule__XorExpression__Group_1_0_0__0__Impl rule__XorExpression__Group_1_0_0__1 )
            // InternalPortugol.g:5075:2: rule__XorExpression__Group_1_0_0__0__Impl rule__XorExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalPortugol.g:5082:1: rule__XorExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__XorExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5086:1: ( ( () ) )
            // InternalPortugol.g:5087:1: ( () )
            {
            // InternalPortugol.g:5087:1: ( () )
            // InternalPortugol.g:5088:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:5089:2: ()
            // InternalPortugol.g:5089:3: 
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
    // InternalPortugol.g:5097:1: rule__XorExpression__Group_1_0_0__1 : rule__XorExpression__Group_1_0_0__1__Impl ;
    public final void rule__XorExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5101:1: ( rule__XorExpression__Group_1_0_0__1__Impl )
            // InternalPortugol.g:5102:2: rule__XorExpression__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:5108:1: rule__XorExpression__Group_1_0_0__1__Impl : ( ( rule__XorExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__XorExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5112:1: ( ( ( rule__XorExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:5113:1: ( ( rule__XorExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:5113:1: ( ( rule__XorExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:5114:2: ( rule__XorExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:5115:2: ( rule__XorExpression__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:5115:3: rule__XorExpression__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:5124:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5128:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalPortugol.g:5129:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalPortugol.g:5136:1: rule__AndExpression__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5140:1: ( ( ruleComparison ) )
            // InternalPortugol.g:5141:1: ( ruleComparison )
            {
            // InternalPortugol.g:5141:1: ( ruleComparison )
            // InternalPortugol.g:5142:2: ruleComparison
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
    // InternalPortugol.g:5151:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5155:1: ( rule__AndExpression__Group__1__Impl )
            // InternalPortugol.g:5156:2: rule__AndExpression__Group__1__Impl
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
    // InternalPortugol.g:5162:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5166:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalPortugol.g:5167:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:5167:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalPortugol.g:5168:2: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:5169:2: ( rule__AndExpression__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=19 && LA41_0<=20)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPortugol.g:5169:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalPortugol.g:5178:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5182:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalPortugol.g:5183:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
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
    // InternalPortugol.g:5190:1: rule__AndExpression__Group_1__0__Impl : ( ( rule__AndExpression__Group_1_0__0 ) ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5194:1: ( ( ( rule__AndExpression__Group_1_0__0 ) ) )
            // InternalPortugol.g:5195:1: ( ( rule__AndExpression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:5195:1: ( ( rule__AndExpression__Group_1_0__0 ) )
            // InternalPortugol.g:5196:2: ( rule__AndExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:5197:2: ( rule__AndExpression__Group_1_0__0 )
            // InternalPortugol.g:5197:3: rule__AndExpression__Group_1_0__0
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
    // InternalPortugol.g:5205:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5209:1: ( rule__AndExpression__Group_1__1__Impl )
            // InternalPortugol.g:5210:2: rule__AndExpression__Group_1__1__Impl
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
    // InternalPortugol.g:5216:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__RightAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5220:1: ( ( ( rule__AndExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:5221:1: ( ( rule__AndExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:5221:1: ( ( rule__AndExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:5222:2: ( rule__AndExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:5223:2: ( rule__AndExpression__RightAssignment_1_1 )
            // InternalPortugol.g:5223:3: rule__AndExpression__RightAssignment_1_1
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
    // InternalPortugol.g:5232:1: rule__AndExpression__Group_1_0__0 : rule__AndExpression__Group_1_0__0__Impl ;
    public final void rule__AndExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5236:1: ( rule__AndExpression__Group_1_0__0__Impl )
            // InternalPortugol.g:5237:2: rule__AndExpression__Group_1_0__0__Impl
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
    // InternalPortugol.g:5243:1: rule__AndExpression__Group_1_0__0__Impl : ( ( rule__AndExpression__Group_1_0_0__0 ) ) ;
    public final void rule__AndExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5247:1: ( ( ( rule__AndExpression__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:5248:1: ( ( rule__AndExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:5248:1: ( ( rule__AndExpression__Group_1_0_0__0 ) )
            // InternalPortugol.g:5249:2: ( rule__AndExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:5250:2: ( rule__AndExpression__Group_1_0_0__0 )
            // InternalPortugol.g:5250:3: rule__AndExpression__Group_1_0_0__0
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
    // InternalPortugol.g:5259:1: rule__AndExpression__Group_1_0_0__0 : rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1 ;
    public final void rule__AndExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5263:1: ( rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1 )
            // InternalPortugol.g:5264:2: rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalPortugol.g:5271:1: rule__AndExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5275:1: ( ( () ) )
            // InternalPortugol.g:5276:1: ( () )
            {
            // InternalPortugol.g:5276:1: ( () )
            // InternalPortugol.g:5277:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:5278:2: ()
            // InternalPortugol.g:5278:3: 
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
    // InternalPortugol.g:5286:1: rule__AndExpression__Group_1_0_0__1 : rule__AndExpression__Group_1_0_0__1__Impl ;
    public final void rule__AndExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5290:1: ( rule__AndExpression__Group_1_0_0__1__Impl )
            // InternalPortugol.g:5291:2: rule__AndExpression__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:5297:1: rule__AndExpression__Group_1_0_0__1__Impl : ( ( rule__AndExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__AndExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5301:1: ( ( ( rule__AndExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:5302:1: ( ( rule__AndExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:5302:1: ( ( rule__AndExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:5303:2: ( rule__AndExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:5304:2: ( rule__AndExpression__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:5304:3: rule__AndExpression__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:5313:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5317:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalPortugol.g:5318:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalPortugol.g:5325:1: rule__Comparison__Group__0__Impl : ( ruleEquExpression ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5329:1: ( ( ruleEquExpression ) )
            // InternalPortugol.g:5330:1: ( ruleEquExpression )
            {
            // InternalPortugol.g:5330:1: ( ruleEquExpression )
            // InternalPortugol.g:5331:2: ruleEquExpression
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
    // InternalPortugol.g:5340:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5344:1: ( rule__Comparison__Group__1__Impl )
            // InternalPortugol.g:5345:2: rule__Comparison__Group__1__Impl
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
    // InternalPortugol.g:5351:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5355:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalPortugol.g:5356:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalPortugol.g:5356:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalPortugol.g:5357:2: ( rule__Comparison__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1()); 
            }
            // InternalPortugol.g:5358:2: ( rule__Comparison__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=21 && LA42_0<=22)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalPortugol.g:5358:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalPortugol.g:5367:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5371:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalPortugol.g:5372:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
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
    // InternalPortugol.g:5379:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Group_1_0__0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5383:1: ( ( ( rule__Comparison__Group_1_0__0 ) ) )
            // InternalPortugol.g:5384:1: ( ( rule__Comparison__Group_1_0__0 ) )
            {
            // InternalPortugol.g:5384:1: ( ( rule__Comparison__Group_1_0__0 ) )
            // InternalPortugol.g:5385:2: ( rule__Comparison__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:5386:2: ( rule__Comparison__Group_1_0__0 )
            // InternalPortugol.g:5386:3: rule__Comparison__Group_1_0__0
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
    // InternalPortugol.g:5394:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5398:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalPortugol.g:5399:2: rule__Comparison__Group_1__1__Impl
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
    // InternalPortugol.g:5405:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5409:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:5410:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:5410:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // InternalPortugol.g:5411:2: ( rule__Comparison__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:5412:2: ( rule__Comparison__RightAssignment_1_1 )
            // InternalPortugol.g:5412:3: rule__Comparison__RightAssignment_1_1
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
    // InternalPortugol.g:5421:1: rule__Comparison__Group_1_0__0 : rule__Comparison__Group_1_0__0__Impl ;
    public final void rule__Comparison__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5425:1: ( rule__Comparison__Group_1_0__0__Impl )
            // InternalPortugol.g:5426:2: rule__Comparison__Group_1_0__0__Impl
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
    // InternalPortugol.g:5432:1: rule__Comparison__Group_1_0__0__Impl : ( ( rule__Comparison__Group_1_0_0__0 ) ) ;
    public final void rule__Comparison__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5436:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:5437:1: ( ( rule__Comparison__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:5437:1: ( ( rule__Comparison__Group_1_0_0__0 ) )
            // InternalPortugol.g:5438:2: ( rule__Comparison__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:5439:2: ( rule__Comparison__Group_1_0_0__0 )
            // InternalPortugol.g:5439:3: rule__Comparison__Group_1_0_0__0
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
    // InternalPortugol.g:5448:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5452:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalPortugol.g:5453:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalPortugol.g:5460:1: rule__Comparison__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5464:1: ( ( () ) )
            // InternalPortugol.g:5465:1: ( () )
            {
            // InternalPortugol.g:5465:1: ( () )
            // InternalPortugol.g:5466:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:5467:2: ()
            // InternalPortugol.g:5467:3: 
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
    // InternalPortugol.g:5475:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5479:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalPortugol.g:5480:2: rule__Comparison__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:5486:1: rule__Comparison__Group_1_0_0__1__Impl : ( ( rule__Comparison__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5490:1: ( ( ( rule__Comparison__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:5491:1: ( ( rule__Comparison__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:5491:1: ( ( rule__Comparison__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:5492:2: ( rule__Comparison__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:5493:2: ( rule__Comparison__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:5493:3: rule__Comparison__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:5502:1: rule__EquExpression__Group__0 : rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1 ;
    public final void rule__EquExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5506:1: ( rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1 )
            // InternalPortugol.g:5507:2: rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalPortugol.g:5514:1: rule__EquExpression__Group__0__Impl : ( ruleAddExpression ) ;
    public final void rule__EquExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5518:1: ( ( ruleAddExpression ) )
            // InternalPortugol.g:5519:1: ( ruleAddExpression )
            {
            // InternalPortugol.g:5519:1: ( ruleAddExpression )
            // InternalPortugol.g:5520:2: ruleAddExpression
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
    // InternalPortugol.g:5529:1: rule__EquExpression__Group__1 : rule__EquExpression__Group__1__Impl ;
    public final void rule__EquExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5533:1: ( rule__EquExpression__Group__1__Impl )
            // InternalPortugol.g:5534:2: rule__EquExpression__Group__1__Impl
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
    // InternalPortugol.g:5540:1: rule__EquExpression__Group__1__Impl : ( ( rule__EquExpression__Group_1__0 )* ) ;
    public final void rule__EquExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5544:1: ( ( ( rule__EquExpression__Group_1__0 )* ) )
            // InternalPortugol.g:5545:1: ( ( rule__EquExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:5545:1: ( ( rule__EquExpression__Group_1__0 )* )
            // InternalPortugol.g:5546:2: ( rule__EquExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:5547:2: ( rule__EquExpression__Group_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=23 && LA43_0<=26)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalPortugol.g:5547:3: rule__EquExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__EquExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalPortugol.g:5556:1: rule__EquExpression__Group_1__0 : rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1 ;
    public final void rule__EquExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5560:1: ( rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1 )
            // InternalPortugol.g:5561:2: rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1
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
    // InternalPortugol.g:5568:1: rule__EquExpression__Group_1__0__Impl : ( ( rule__EquExpression__Group_1_0__0 ) ) ;
    public final void rule__EquExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5572:1: ( ( ( rule__EquExpression__Group_1_0__0 ) ) )
            // InternalPortugol.g:5573:1: ( ( rule__EquExpression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:5573:1: ( ( rule__EquExpression__Group_1_0__0 ) )
            // InternalPortugol.g:5574:2: ( rule__EquExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:5575:2: ( rule__EquExpression__Group_1_0__0 )
            // InternalPortugol.g:5575:3: rule__EquExpression__Group_1_0__0
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
    // InternalPortugol.g:5583:1: rule__EquExpression__Group_1__1 : rule__EquExpression__Group_1__1__Impl ;
    public final void rule__EquExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5587:1: ( rule__EquExpression__Group_1__1__Impl )
            // InternalPortugol.g:5588:2: rule__EquExpression__Group_1__1__Impl
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
    // InternalPortugol.g:5594:1: rule__EquExpression__Group_1__1__Impl : ( ( rule__EquExpression__RightAssignment_1_1 ) ) ;
    public final void rule__EquExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5598:1: ( ( ( rule__EquExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:5599:1: ( ( rule__EquExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:5599:1: ( ( rule__EquExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:5600:2: ( rule__EquExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:5601:2: ( rule__EquExpression__RightAssignment_1_1 )
            // InternalPortugol.g:5601:3: rule__EquExpression__RightAssignment_1_1
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
    // InternalPortugol.g:5610:1: rule__EquExpression__Group_1_0__0 : rule__EquExpression__Group_1_0__0__Impl ;
    public final void rule__EquExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5614:1: ( rule__EquExpression__Group_1_0__0__Impl )
            // InternalPortugol.g:5615:2: rule__EquExpression__Group_1_0__0__Impl
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
    // InternalPortugol.g:5621:1: rule__EquExpression__Group_1_0__0__Impl : ( ( rule__EquExpression__Group_1_0_0__0 ) ) ;
    public final void rule__EquExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5625:1: ( ( ( rule__EquExpression__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:5626:1: ( ( rule__EquExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:5626:1: ( ( rule__EquExpression__Group_1_0_0__0 ) )
            // InternalPortugol.g:5627:2: ( rule__EquExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:5628:2: ( rule__EquExpression__Group_1_0_0__0 )
            // InternalPortugol.g:5628:3: rule__EquExpression__Group_1_0_0__0
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
    // InternalPortugol.g:5637:1: rule__EquExpression__Group_1_0_0__0 : rule__EquExpression__Group_1_0_0__0__Impl rule__EquExpression__Group_1_0_0__1 ;
    public final void rule__EquExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5641:1: ( rule__EquExpression__Group_1_0_0__0__Impl rule__EquExpression__Group_1_0_0__1 )
            // InternalPortugol.g:5642:2: rule__EquExpression__Group_1_0_0__0__Impl rule__EquExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalPortugol.g:5649:1: rule__EquExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__EquExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5653:1: ( ( () ) )
            // InternalPortugol.g:5654:1: ( () )
            {
            // InternalPortugol.g:5654:1: ( () )
            // InternalPortugol.g:5655:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:5656:2: ()
            // InternalPortugol.g:5656:3: 
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
    // InternalPortugol.g:5664:1: rule__EquExpression__Group_1_0_0__1 : rule__EquExpression__Group_1_0_0__1__Impl ;
    public final void rule__EquExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5668:1: ( rule__EquExpression__Group_1_0_0__1__Impl )
            // InternalPortugol.g:5669:2: rule__EquExpression__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:5675:1: rule__EquExpression__Group_1_0_0__1__Impl : ( ( rule__EquExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__EquExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5679:1: ( ( ( rule__EquExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:5680:1: ( ( rule__EquExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:5680:1: ( ( rule__EquExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:5681:2: ( rule__EquExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:5682:2: ( rule__EquExpression__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:5682:3: rule__EquExpression__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:5691:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5695:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // InternalPortugol.g:5696:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalPortugol.g:5703:1: rule__AddExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5707:1: ( ( ruleMultiplicativeExpression ) )
            // InternalPortugol.g:5708:1: ( ruleMultiplicativeExpression )
            {
            // InternalPortugol.g:5708:1: ( ruleMultiplicativeExpression )
            // InternalPortugol.g:5709:2: ruleMultiplicativeExpression
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
    // InternalPortugol.g:5718:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5722:1: ( rule__AddExpression__Group__1__Impl )
            // InternalPortugol.g:5723:2: rule__AddExpression__Group__1__Impl
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
    // InternalPortugol.g:5729:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5733:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // InternalPortugol.g:5734:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:5734:1: ( ( rule__AddExpression__Group_1__0 )* )
            // InternalPortugol.g:5735:2: ( rule__AddExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:5736:2: ( rule__AddExpression__Group_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=27 && LA44_0<=28)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalPortugol.g:5736:3: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__AddExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalPortugol.g:5745:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5749:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // InternalPortugol.g:5750:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
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
    // InternalPortugol.g:5757:1: rule__AddExpression__Group_1__0__Impl : ( ( rule__AddExpression__Group_1_0__0 ) ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5761:1: ( ( ( rule__AddExpression__Group_1_0__0 ) ) )
            // InternalPortugol.g:5762:1: ( ( rule__AddExpression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:5762:1: ( ( rule__AddExpression__Group_1_0__0 ) )
            // InternalPortugol.g:5763:2: ( rule__AddExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:5764:2: ( rule__AddExpression__Group_1_0__0 )
            // InternalPortugol.g:5764:3: rule__AddExpression__Group_1_0__0
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
    // InternalPortugol.g:5772:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5776:1: ( rule__AddExpression__Group_1__1__Impl )
            // InternalPortugol.g:5777:2: rule__AddExpression__Group_1__1__Impl
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
    // InternalPortugol.g:5783:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__RightAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5787:1: ( ( ( rule__AddExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:5788:1: ( ( rule__AddExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:5788:1: ( ( rule__AddExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:5789:2: ( rule__AddExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:5790:2: ( rule__AddExpression__RightAssignment_1_1 )
            // InternalPortugol.g:5790:3: rule__AddExpression__RightAssignment_1_1
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
    // InternalPortugol.g:5799:1: rule__AddExpression__Group_1_0__0 : rule__AddExpression__Group_1_0__0__Impl ;
    public final void rule__AddExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5803:1: ( rule__AddExpression__Group_1_0__0__Impl )
            // InternalPortugol.g:5804:2: rule__AddExpression__Group_1_0__0__Impl
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
    // InternalPortugol.g:5810:1: rule__AddExpression__Group_1_0__0__Impl : ( ( rule__AddExpression__Group_1_0_0__0 ) ) ;
    public final void rule__AddExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5814:1: ( ( ( rule__AddExpression__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:5815:1: ( ( rule__AddExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:5815:1: ( ( rule__AddExpression__Group_1_0_0__0 ) )
            // InternalPortugol.g:5816:2: ( rule__AddExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:5817:2: ( rule__AddExpression__Group_1_0_0__0 )
            // InternalPortugol.g:5817:3: rule__AddExpression__Group_1_0_0__0
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
    // InternalPortugol.g:5826:1: rule__AddExpression__Group_1_0_0__0 : rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1 ;
    public final void rule__AddExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5830:1: ( rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1 )
            // InternalPortugol.g:5831:2: rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalPortugol.g:5838:1: rule__AddExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5842:1: ( ( () ) )
            // InternalPortugol.g:5843:1: ( () )
            {
            // InternalPortugol.g:5843:1: ( () )
            // InternalPortugol.g:5844:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:5845:2: ()
            // InternalPortugol.g:5845:3: 
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
    // InternalPortugol.g:5853:1: rule__AddExpression__Group_1_0_0__1 : rule__AddExpression__Group_1_0_0__1__Impl ;
    public final void rule__AddExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5857:1: ( rule__AddExpression__Group_1_0_0__1__Impl )
            // InternalPortugol.g:5858:2: rule__AddExpression__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:5864:1: rule__AddExpression__Group_1_0_0__1__Impl : ( ( rule__AddExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__AddExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5868:1: ( ( ( rule__AddExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:5869:1: ( ( rule__AddExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:5869:1: ( ( rule__AddExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:5870:2: ( rule__AddExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:5871:2: ( rule__AddExpression__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:5871:3: rule__AddExpression__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:5880:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5884:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalPortugol.g:5885:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalPortugol.g:5892:1: rule__MultiplicativeExpression__Group__0__Impl : ( rulePowerExpression ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5896:1: ( ( rulePowerExpression ) )
            // InternalPortugol.g:5897:1: ( rulePowerExpression )
            {
            // InternalPortugol.g:5897:1: ( rulePowerExpression )
            // InternalPortugol.g:5898:2: rulePowerExpression
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
    // InternalPortugol.g:5907:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5911:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalPortugol.g:5912:2: rule__MultiplicativeExpression__Group__1__Impl
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
    // InternalPortugol.g:5918:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5922:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalPortugol.g:5923:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:5923:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalPortugol.g:5924:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:5925:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=29 && LA45_0<=32)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalPortugol.g:5925:3: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalPortugol.g:5934:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5938:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalPortugol.g:5939:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
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
    // InternalPortugol.g:5946:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( ( rule__MultiplicativeExpression__Group_1_0__0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5950:1: ( ( ( rule__MultiplicativeExpression__Group_1_0__0 ) ) )
            // InternalPortugol.g:5951:1: ( ( rule__MultiplicativeExpression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:5951:1: ( ( rule__MultiplicativeExpression__Group_1_0__0 ) )
            // InternalPortugol.g:5952:2: ( rule__MultiplicativeExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:5953:2: ( rule__MultiplicativeExpression__Group_1_0__0 )
            // InternalPortugol.g:5953:3: rule__MultiplicativeExpression__Group_1_0__0
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
    // InternalPortugol.g:5961:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5965:1: ( rule__MultiplicativeExpression__Group_1__1__Impl )
            // InternalPortugol.g:5966:2: rule__MultiplicativeExpression__Group_1__1__Impl
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
    // InternalPortugol.g:5972:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5976:1: ( ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:5977:1: ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:5977:1: ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:5978:2: ( rule__MultiplicativeExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:5979:2: ( rule__MultiplicativeExpression__RightAssignment_1_1 )
            // InternalPortugol.g:5979:3: rule__MultiplicativeExpression__RightAssignment_1_1
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
    // InternalPortugol.g:5988:1: rule__MultiplicativeExpression__Group_1_0__0 : rule__MultiplicativeExpression__Group_1_0__0__Impl ;
    public final void rule__MultiplicativeExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5992:1: ( rule__MultiplicativeExpression__Group_1_0__0__Impl )
            // InternalPortugol.g:5993:2: rule__MultiplicativeExpression__Group_1_0__0__Impl
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
    // InternalPortugol.g:5999:1: rule__MultiplicativeExpression__Group_1_0__0__Impl : ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6003:1: ( ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:6004:1: ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:6004:1: ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) )
            // InternalPortugol.g:6005:2: ( rule__MultiplicativeExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:6006:2: ( rule__MultiplicativeExpression__Group_1_0_0__0 )
            // InternalPortugol.g:6006:3: rule__MultiplicativeExpression__Group_1_0_0__0
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
    // InternalPortugol.g:6015:1: rule__MultiplicativeExpression__Group_1_0_0__0 : rule__MultiplicativeExpression__Group_1_0_0__0__Impl rule__MultiplicativeExpression__Group_1_0_0__1 ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6019:1: ( rule__MultiplicativeExpression__Group_1_0_0__0__Impl rule__MultiplicativeExpression__Group_1_0_0__1 )
            // InternalPortugol.g:6020:2: rule__MultiplicativeExpression__Group_1_0_0__0__Impl rule__MultiplicativeExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalPortugol.g:6027:1: rule__MultiplicativeExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6031:1: ( ( () ) )
            // InternalPortugol.g:6032:1: ( () )
            {
            // InternalPortugol.g:6032:1: ( () )
            // InternalPortugol.g:6033:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:6034:2: ()
            // InternalPortugol.g:6034:3: 
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
    // InternalPortugol.g:6042:1: rule__MultiplicativeExpression__Group_1_0_0__1 : rule__MultiplicativeExpression__Group_1_0_0__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6046:1: ( rule__MultiplicativeExpression__Group_1_0_0__1__Impl )
            // InternalPortugol.g:6047:2: rule__MultiplicativeExpression__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:6053:1: rule__MultiplicativeExpression__Group_1_0_0__1__Impl : ( ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6057:1: ( ( ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:6058:1: ( ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:6058:1: ( ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:6059:2: ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:6060:2: ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:6060:3: rule__MultiplicativeExpression__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:6069:1: rule__PowerExpression__Group__0 : rule__PowerExpression__Group__0__Impl rule__PowerExpression__Group__1 ;
    public final void rule__PowerExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6073:1: ( rule__PowerExpression__Group__0__Impl rule__PowerExpression__Group__1 )
            // InternalPortugol.g:6074:2: rule__PowerExpression__Group__0__Impl rule__PowerExpression__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalPortugol.g:6081:1: rule__PowerExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__PowerExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6085:1: ( ( ruleUnaryExpression ) )
            // InternalPortugol.g:6086:1: ( ruleUnaryExpression )
            {
            // InternalPortugol.g:6086:1: ( ruleUnaryExpression )
            // InternalPortugol.g:6087:2: ruleUnaryExpression
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
    // InternalPortugol.g:6096:1: rule__PowerExpression__Group__1 : rule__PowerExpression__Group__1__Impl ;
    public final void rule__PowerExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6100:1: ( rule__PowerExpression__Group__1__Impl )
            // InternalPortugol.g:6101:2: rule__PowerExpression__Group__1__Impl
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
    // InternalPortugol.g:6107:1: rule__PowerExpression__Group__1__Impl : ( ( rule__PowerExpression__Group_1__0 )* ) ;
    public final void rule__PowerExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6111:1: ( ( ( rule__PowerExpression__Group_1__0 )* ) )
            // InternalPortugol.g:6112:1: ( ( rule__PowerExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:6112:1: ( ( rule__PowerExpression__Group_1__0 )* )
            // InternalPortugol.g:6113:2: ( rule__PowerExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:6114:2: ( rule__PowerExpression__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==59) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalPortugol.g:6114:3: rule__PowerExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__PowerExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalPortugol.g:6123:1: rule__PowerExpression__Group_1__0 : rule__PowerExpression__Group_1__0__Impl rule__PowerExpression__Group_1__1 ;
    public final void rule__PowerExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6127:1: ( rule__PowerExpression__Group_1__0__Impl rule__PowerExpression__Group_1__1 )
            // InternalPortugol.g:6128:2: rule__PowerExpression__Group_1__0__Impl rule__PowerExpression__Group_1__1
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
    // InternalPortugol.g:6135:1: rule__PowerExpression__Group_1__0__Impl : ( ( rule__PowerExpression__Group_1_0__0 ) ) ;
    public final void rule__PowerExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6139:1: ( ( ( rule__PowerExpression__Group_1_0__0 ) ) )
            // InternalPortugol.g:6140:1: ( ( rule__PowerExpression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:6140:1: ( ( rule__PowerExpression__Group_1_0__0 ) )
            // InternalPortugol.g:6141:2: ( rule__PowerExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:6142:2: ( rule__PowerExpression__Group_1_0__0 )
            // InternalPortugol.g:6142:3: rule__PowerExpression__Group_1_0__0
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
    // InternalPortugol.g:6150:1: rule__PowerExpression__Group_1__1 : rule__PowerExpression__Group_1__1__Impl ;
    public final void rule__PowerExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6154:1: ( rule__PowerExpression__Group_1__1__Impl )
            // InternalPortugol.g:6155:2: rule__PowerExpression__Group_1__1__Impl
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
    // InternalPortugol.g:6161:1: rule__PowerExpression__Group_1__1__Impl : ( ( rule__PowerExpression__RightAssignment_1_1 ) ) ;
    public final void rule__PowerExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6165:1: ( ( ( rule__PowerExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:6166:1: ( ( rule__PowerExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:6166:1: ( ( rule__PowerExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:6167:2: ( rule__PowerExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:6168:2: ( rule__PowerExpression__RightAssignment_1_1 )
            // InternalPortugol.g:6168:3: rule__PowerExpression__RightAssignment_1_1
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
    // InternalPortugol.g:6177:1: rule__PowerExpression__Group_1_0__0 : rule__PowerExpression__Group_1_0__0__Impl ;
    public final void rule__PowerExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6181:1: ( rule__PowerExpression__Group_1_0__0__Impl )
            // InternalPortugol.g:6182:2: rule__PowerExpression__Group_1_0__0__Impl
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
    // InternalPortugol.g:6188:1: rule__PowerExpression__Group_1_0__0__Impl : ( ( rule__PowerExpression__Group_1_0_0__0 ) ) ;
    public final void rule__PowerExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6192:1: ( ( ( rule__PowerExpression__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:6193:1: ( ( rule__PowerExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:6193:1: ( ( rule__PowerExpression__Group_1_0_0__0 ) )
            // InternalPortugol.g:6194:2: ( rule__PowerExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:6195:2: ( rule__PowerExpression__Group_1_0_0__0 )
            // InternalPortugol.g:6195:3: rule__PowerExpression__Group_1_0_0__0
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
    // InternalPortugol.g:6204:1: rule__PowerExpression__Group_1_0_0__0 : rule__PowerExpression__Group_1_0_0__0__Impl rule__PowerExpression__Group_1_0_0__1 ;
    public final void rule__PowerExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6208:1: ( rule__PowerExpression__Group_1_0_0__0__Impl rule__PowerExpression__Group_1_0_0__1 )
            // InternalPortugol.g:6209:2: rule__PowerExpression__Group_1_0_0__0__Impl rule__PowerExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalPortugol.g:6216:1: rule__PowerExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PowerExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6220:1: ( ( () ) )
            // InternalPortugol.g:6221:1: ( () )
            {
            // InternalPortugol.g:6221:1: ( () )
            // InternalPortugol.g:6222:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:6223:2: ()
            // InternalPortugol.g:6223:3: 
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
    // InternalPortugol.g:6231:1: rule__PowerExpression__Group_1_0_0__1 : rule__PowerExpression__Group_1_0_0__1__Impl ;
    public final void rule__PowerExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6235:1: ( rule__PowerExpression__Group_1_0_0__1__Impl )
            // InternalPortugol.g:6236:2: rule__PowerExpression__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:6242:1: rule__PowerExpression__Group_1_0_0__1__Impl : ( ( rule__PowerExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__PowerExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6246:1: ( ( ( rule__PowerExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:6247:1: ( ( rule__PowerExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:6247:1: ( ( rule__PowerExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:6248:2: ( rule__PowerExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:6249:2: ( rule__PowerExpression__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:6249:3: rule__PowerExpression__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:6258:1: rule__UnaryExpression__Group_0__0 : rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 ;
    public final void rule__UnaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6262:1: ( rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 )
            // InternalPortugol.g:6263:2: rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalPortugol.g:6270:1: rule__UnaryExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6274:1: ( ( () ) )
            // InternalPortugol.g:6275:1: ( () )
            {
            // InternalPortugol.g:6275:1: ( () )
            // InternalPortugol.g:6276:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_0_0()); 
            }
            // InternalPortugol.g:6277:2: ()
            // InternalPortugol.g:6277:3: 
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
    // InternalPortugol.g:6285:1: rule__UnaryExpression__Group_0__1 : rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 ;
    public final void rule__UnaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6289:1: ( rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 )
            // InternalPortugol.g:6290:2: rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2
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
    // InternalPortugol.g:6297:1: rule__UnaryExpression__Group_0__1__Impl : ( ( rule__UnaryExpression__OpAssignment_0_1 ) ) ;
    public final void rule__UnaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6301:1: ( ( ( rule__UnaryExpression__OpAssignment_0_1 ) ) )
            // InternalPortugol.g:6302:1: ( ( rule__UnaryExpression__OpAssignment_0_1 ) )
            {
            // InternalPortugol.g:6302:1: ( ( rule__UnaryExpression__OpAssignment_0_1 ) )
            // InternalPortugol.g:6303:2: ( rule__UnaryExpression__OpAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOpAssignment_0_1()); 
            }
            // InternalPortugol.g:6304:2: ( rule__UnaryExpression__OpAssignment_0_1 )
            // InternalPortugol.g:6304:3: rule__UnaryExpression__OpAssignment_0_1
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
    // InternalPortugol.g:6312:1: rule__UnaryExpression__Group_0__2 : rule__UnaryExpression__Group_0__2__Impl ;
    public final void rule__UnaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6316:1: ( rule__UnaryExpression__Group_0__2__Impl )
            // InternalPortugol.g:6317:2: rule__UnaryExpression__Group_0__2__Impl
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
    // InternalPortugol.g:6323:1: rule__UnaryExpression__Group_0__2__Impl : ( ( rule__UnaryExpression__OperandAssignment_0_2 ) ) ;
    public final void rule__UnaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6327:1: ( ( ( rule__UnaryExpression__OperandAssignment_0_2 ) ) )
            // InternalPortugol.g:6328:1: ( ( rule__UnaryExpression__OperandAssignment_0_2 ) )
            {
            // InternalPortugol.g:6328:1: ( ( rule__UnaryExpression__OperandAssignment_0_2 ) )
            // InternalPortugol.g:6329:2: ( rule__UnaryExpression__OperandAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_0_2()); 
            }
            // InternalPortugol.g:6330:2: ( rule__UnaryExpression__OperandAssignment_0_2 )
            // InternalPortugol.g:6330:3: rule__UnaryExpression__OperandAssignment_0_2
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
    // InternalPortugol.g:6339:1: rule__PrimaryExpression__Group_3__0 : rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 ;
    public final void rule__PrimaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6343:1: ( rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 )
            // InternalPortugol.g:6344:2: rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1
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
    // InternalPortugol.g:6351:1: rule__PrimaryExpression__Group_3__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6355:1: ( ( '(' ) )
            // InternalPortugol.g:6356:1: ( '(' )
            {
            // InternalPortugol.g:6356:1: ( '(' )
            // InternalPortugol.g:6357:2: '('
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
    // InternalPortugol.g:6366:1: rule__PrimaryExpression__Group_3__1 : rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2 ;
    public final void rule__PrimaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6370:1: ( rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2 )
            // InternalPortugol.g:6371:2: rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2
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
    // InternalPortugol.g:6378:1: rule__PrimaryExpression__Group_3__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6382:1: ( ( ruleExpression ) )
            // InternalPortugol.g:6383:1: ( ruleExpression )
            {
            // InternalPortugol.g:6383:1: ( ruleExpression )
            // InternalPortugol.g:6384:2: ruleExpression
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
    // InternalPortugol.g:6393:1: rule__PrimaryExpression__Group_3__2 : rule__PrimaryExpression__Group_3__2__Impl ;
    public final void rule__PrimaryExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6397:1: ( rule__PrimaryExpression__Group_3__2__Impl )
            // InternalPortugol.g:6398:2: rule__PrimaryExpression__Group_3__2__Impl
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
    // InternalPortugol.g:6404:1: rule__PrimaryExpression__Group_3__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6408:1: ( ( ')' ) )
            // InternalPortugol.g:6409:1: ( ')' )
            {
            // InternalPortugol.g:6409:1: ( ')' )
            // InternalPortugol.g:6410:2: ')'
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
    // InternalPortugol.g:6420:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6424:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalPortugol.g:6425:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
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
    // InternalPortugol.g:6432:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__FbNameAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6436:1: ( ( ( rule__FunctionCall__FbNameAssignment_0 ) ) )
            // InternalPortugol.g:6437:1: ( ( rule__FunctionCall__FbNameAssignment_0 ) )
            {
            // InternalPortugol.g:6437:1: ( ( rule__FunctionCall__FbNameAssignment_0 ) )
            // InternalPortugol.g:6438:2: ( rule__FunctionCall__FbNameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFbNameAssignment_0()); 
            }
            // InternalPortugol.g:6439:2: ( rule__FunctionCall__FbNameAssignment_0 )
            // InternalPortugol.g:6439:3: rule__FunctionCall__FbNameAssignment_0
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
    // InternalPortugol.g:6447:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6451:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // InternalPortugol.g:6452:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
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
    // InternalPortugol.g:6459:1: rule__FunctionCall__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6463:1: ( ( '(' ) )
            // InternalPortugol.g:6464:1: ( '(' )
            {
            // InternalPortugol.g:6464:1: ( '(' )
            // InternalPortugol.g:6465:2: '('
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
    // InternalPortugol.g:6474:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6478:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // InternalPortugol.g:6479:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
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
    // InternalPortugol.g:6486:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__ParamAssignment_2 ) ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6490:1: ( ( ( rule__FunctionCall__ParamAssignment_2 ) ) )
            // InternalPortugol.g:6491:1: ( ( rule__FunctionCall__ParamAssignment_2 ) )
            {
            // InternalPortugol.g:6491:1: ( ( rule__FunctionCall__ParamAssignment_2 ) )
            // InternalPortugol.g:6492:2: ( rule__FunctionCall__ParamAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParamAssignment_2()); 
            }
            // InternalPortugol.g:6493:2: ( rule__FunctionCall__ParamAssignment_2 )
            // InternalPortugol.g:6493:3: rule__FunctionCall__ParamAssignment_2
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
    // InternalPortugol.g:6501:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6505:1: ( rule__FunctionCall__Group__3__Impl )
            // InternalPortugol.g:6506:2: rule__FunctionCall__Group__3__Impl
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
    // InternalPortugol.g:6512:1: rule__FunctionCall__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6516:1: ( ( ')' ) )
            // InternalPortugol.g:6517:1: ( ')' )
            {
            // InternalPortugol.g:6517:1: ( ')' )
            // InternalPortugol.g:6518:2: ')'
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
    // InternalPortugol.g:6528:1: rule__Model__HeaderAssignment_0 : ( ruleHeaderBlock ) ;
    public final void rule__Model__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6532:1: ( ( ruleHeaderBlock ) )
            // InternalPortugol.g:6533:2: ( ruleHeaderBlock )
            {
            // InternalPortugol.g:6533:2: ( ruleHeaderBlock )
            // InternalPortugol.g:6534:3: ruleHeaderBlock
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
    // InternalPortugol.g:6543:1: rule__Model__GlobalDeclarationsAssignment_1 : ( ruleDeclarationsBlock ) ;
    public final void rule__Model__GlobalDeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6547:1: ( ( ruleDeclarationsBlock ) )
            // InternalPortugol.g:6548:2: ( ruleDeclarationsBlock )
            {
            // InternalPortugol.g:6548:2: ( ruleDeclarationsBlock )
            // InternalPortugol.g:6549:3: ruleDeclarationsBlock
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
    // InternalPortugol.g:6558:1: rule__Model__SubprogramsAssignment_2 : ( ruleSubprograms ) ;
    public final void rule__Model__SubprogramsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6562:1: ( ( ruleSubprograms ) )
            // InternalPortugol.g:6563:2: ( ruleSubprograms )
            {
            // InternalPortugol.g:6563:2: ( ruleSubprograms )
            // InternalPortugol.g:6564:3: ruleSubprograms
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
    // InternalPortugol.g:6573:1: rule__Model__CommandsAssignment_3 : ( ruleBlockCommand ) ;
    public final void rule__Model__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6577:1: ( ( ruleBlockCommand ) )
            // InternalPortugol.g:6578:2: ( ruleBlockCommand )
            {
            // InternalPortugol.g:6578:2: ( ruleBlockCommand )
            // InternalPortugol.g:6579:3: ruleBlockCommand
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
    // InternalPortugol.g:6588:1: rule__HeaderBlock__AlgorithmNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__HeaderBlock__AlgorithmNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6592:1: ( ( RULE_STRING ) )
            // InternalPortugol.g:6593:2: ( RULE_STRING )
            {
            // InternalPortugol.g:6593:2: ( RULE_STRING )
            // InternalPortugol.g:6594:3: RULE_STRING
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


    // $ANTLR start "rule__DeclarationsBlock__VarsAssignment_2_0"
    // InternalPortugol.g:6603:1: rule__DeclarationsBlock__VarsAssignment_2_0 : ( ruleVariable ) ;
    public final void rule__DeclarationsBlock__VarsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6607:1: ( ( ruleVariable ) )
            // InternalPortugol.g:6608:2: ( ruleVariable )
            {
            // InternalPortugol.g:6608:2: ( ruleVariable )
            // InternalPortugol.g:6609:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getVarsVariableParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationsBlockAccess().getVarsVariableParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclarationsBlock__VarsAssignment_2_0"


    // $ANTLR start "rule__Variable__VarDeclarationAssignment_0"
    // InternalPortugol.g:6618:1: rule__Variable__VarDeclarationAssignment_0 : ( ruleVarDeclaration ) ;
    public final void rule__Variable__VarDeclarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6622:1: ( ( ruleVarDeclaration ) )
            // InternalPortugol.g:6623:2: ( ruleVarDeclaration )
            {
            // InternalPortugol.g:6623:2: ( ruleVarDeclaration )
            // InternalPortugol.g:6624:3: ruleVarDeclaration
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
    // InternalPortugol.g:6633:1: rule__Variable__TypeAssignment_2 : ( ruleVarType ) ;
    public final void rule__Variable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6637:1: ( ( ruleVarType ) )
            // InternalPortugol.g:6638:2: ( ruleVarType )
            {
            // InternalPortugol.g:6638:2: ( ruleVarType )
            // InternalPortugol.g:6639:3: ruleVarType
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
    // InternalPortugol.g:6648:1: rule__VarDeclaration__VarsAssignment_0 : ( ruleVarName ) ;
    public final void rule__VarDeclaration__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6652:1: ( ( ruleVarName ) )
            // InternalPortugol.g:6653:2: ( ruleVarName )
            {
            // InternalPortugol.g:6653:2: ( ruleVarName )
            // InternalPortugol.g:6654:3: ruleVarName
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
    // InternalPortugol.g:6663:1: rule__VarDeclaration__VarsAssignment_1_1 : ( ruleVarName ) ;
    public final void rule__VarDeclaration__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6667:1: ( ( ruleVarName ) )
            // InternalPortugol.g:6668:2: ( ruleVarName )
            {
            // InternalPortugol.g:6668:2: ( ruleVarName )
            // InternalPortugol.g:6669:3: ruleVarName
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
    // InternalPortugol.g:6678:1: rule__DeclaredVarList__VarsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredVarList__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6682:1: ( ( ( RULE_ID ) ) )
            // InternalPortugol.g:6683:2: ( ( RULE_ID ) )
            {
            // InternalPortugol.g:6683:2: ( ( RULE_ID ) )
            // InternalPortugol.g:6684:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getVarsVarNameCrossReference_0_0()); 
            }
            // InternalPortugol.g:6685:3: ( RULE_ID )
            // InternalPortugol.g:6686:4: RULE_ID
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
    // InternalPortugol.g:6697:1: rule__DeclaredVarList__VarsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredVarList__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6701:1: ( ( ( RULE_ID ) ) )
            // InternalPortugol.g:6702:2: ( ( RULE_ID ) )
            {
            // InternalPortugol.g:6702:2: ( ( RULE_ID ) )
            // InternalPortugol.g:6703:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarListAccess().getVarsVarNameCrossReference_1_1_0()); 
            }
            // InternalPortugol.g:6704:3: ( RULE_ID )
            // InternalPortugol.g:6705:4: RULE_ID
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
    // InternalPortugol.g:6716:1: rule__VarName__NameAssignment : ( RULE_ID ) ;
    public final void rule__VarName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6720:1: ( ( RULE_ID ) )
            // InternalPortugol.g:6721:2: ( RULE_ID )
            {
            // InternalPortugol.g:6721:2: ( RULE_ID )
            // InternalPortugol.g:6722:3: RULE_ID
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
    // InternalPortugol.g:6731:1: rule__VarType__TypeNameAssignment : ( ( rule__VarType__TypeNameAlternatives_0 ) ) ;
    public final void rule__VarType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6735:1: ( ( ( rule__VarType__TypeNameAlternatives_0 ) ) )
            // InternalPortugol.g:6736:2: ( ( rule__VarType__TypeNameAlternatives_0 ) )
            {
            // InternalPortugol.g:6736:2: ( ( rule__VarType__TypeNameAlternatives_0 ) )
            // InternalPortugol.g:6737:3: ( rule__VarType__TypeNameAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarTypeAccess().getTypeNameAlternatives_0()); 
            }
            // InternalPortugol.g:6738:3: ( rule__VarType__TypeNameAlternatives_0 )
            // InternalPortugol.g:6738:4: rule__VarType__TypeNameAlternatives_0
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
    // InternalPortugol.g:6746:1: rule__Subprograms__BlockSubProgramsAssignment : ( ruleBlockSubPrograms ) ;
    public final void rule__Subprograms__BlockSubProgramsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6750:1: ( ( ruleBlockSubPrograms ) )
            // InternalPortugol.g:6751:2: ( ruleBlockSubPrograms )
            {
            // InternalPortugol.g:6751:2: ( ruleBlockSubPrograms )
            // InternalPortugol.g:6752:3: ruleBlockSubPrograms
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
    // InternalPortugol.g:6761:1: rule__ProcedureName__NameAssignment : ( RULE_ID ) ;
    public final void rule__ProcedureName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6765:1: ( ( RULE_ID ) )
            // InternalPortugol.g:6766:2: ( RULE_ID )
            {
            // InternalPortugol.g:6766:2: ( RULE_ID )
            // InternalPortugol.g:6767:3: RULE_ID
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
    // InternalPortugol.g:6776:1: rule__FunctionName__NameAssignment : ( RULE_ID ) ;
    public final void rule__FunctionName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6780:1: ( ( RULE_ID ) )
            // InternalPortugol.g:6781:2: ( RULE_ID )
            {
            // InternalPortugol.g:6781:2: ( RULE_ID )
            // InternalPortugol.g:6782:3: RULE_ID
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
    // InternalPortugol.g:6791:1: rule__BlockFunction__FunctionNameAssignment_1 : ( ruleFunctionName ) ;
    public final void rule__BlockFunction__FunctionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6795:1: ( ( ruleFunctionName ) )
            // InternalPortugol.g:6796:2: ( ruleFunctionName )
            {
            // InternalPortugol.g:6796:2: ( ruleFunctionName )
            // InternalPortugol.g:6797:3: ruleFunctionName
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
    // InternalPortugol.g:6806:1: rule__BlockFunction__ParamListAssignment_3 : ( ruleVariable ) ;
    public final void rule__BlockFunction__ParamListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6810:1: ( ( ruleVariable ) )
            // InternalPortugol.g:6811:2: ( ruleVariable )
            {
            // InternalPortugol.g:6811:2: ( ruleVariable )
            // InternalPortugol.g:6812:3: ruleVariable
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
    // InternalPortugol.g:6821:1: rule__BlockFunction__ReturnTypeAssignment_6 : ( ruleVarType ) ;
    public final void rule__BlockFunction__ReturnTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6825:1: ( ( ruleVarType ) )
            // InternalPortugol.g:6826:2: ( ruleVarType )
            {
            // InternalPortugol.g:6826:2: ( ruleVarType )
            // InternalPortugol.g:6827:3: ruleVarType
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


    // $ANTLR start "rule__BlockFunction__DeclarationsAssignment_8"
    // InternalPortugol.g:6836:1: rule__BlockFunction__DeclarationsAssignment_8 : ( ruleDeclarationsBlock ) ;
    public final void rule__BlockFunction__DeclarationsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6840:1: ( ( ruleDeclarationsBlock ) )
            // InternalPortugol.g:6841:2: ( ruleDeclarationsBlock )
            {
            // InternalPortugol.g:6841:2: ( ruleDeclarationsBlock )
            // InternalPortugol.g:6842:3: ruleDeclarationsBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getDeclarationsDeclarationsBlockParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDeclarationsBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getDeclarationsDeclarationsBlockParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockFunction__DeclarationsAssignment_8"


    // $ANTLR start "rule__BlockFunction__CommandsAssignment_11"
    // InternalPortugol.g:6851:1: rule__BlockFunction__CommandsAssignment_11 : ( ruleAbstractCommand ) ;
    public final void rule__BlockFunction__CommandsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6855:1: ( ( ruleAbstractCommand ) )
            // InternalPortugol.g:6856:2: ( ruleAbstractCommand )
            {
            // InternalPortugol.g:6856:2: ( ruleAbstractCommand )
            // InternalPortugol.g:6857:3: ruleAbstractCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getCommandsAbstractCommandParserRuleCall_11_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbstractCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockFunctionAccess().getCommandsAbstractCommandParserRuleCall_11_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockFunction__CommandsAssignment_11"


    // $ANTLR start "rule__BlockProcedure__ProcedureAssignment_1"
    // InternalPortugol.g:6866:1: rule__BlockProcedure__ProcedureAssignment_1 : ( ruleProcedureName ) ;
    public final void rule__BlockProcedure__ProcedureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6870:1: ( ( ruleProcedureName ) )
            // InternalPortugol.g:6871:2: ( ruleProcedureName )
            {
            // InternalPortugol.g:6871:2: ( ruleProcedureName )
            // InternalPortugol.g:6872:3: ruleProcedureName
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
    // InternalPortugol.g:6881:1: rule__BlockProcedure__ParamListAssignment_3 : ( ruleVariable ) ;
    public final void rule__BlockProcedure__ParamListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6885:1: ( ( ruleVariable ) )
            // InternalPortugol.g:6886:2: ( ruleVariable )
            {
            // InternalPortugol.g:6886:2: ( ruleVariable )
            // InternalPortugol.g:6887:3: ruleVariable
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


    // $ANTLR start "rule__BlockProcedure__DeclarationsAssignment_6"
    // InternalPortugol.g:6896:1: rule__BlockProcedure__DeclarationsAssignment_6 : ( ruleDeclarationsBlock ) ;
    public final void rule__BlockProcedure__DeclarationsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6900:1: ( ( ruleDeclarationsBlock ) )
            // InternalPortugol.g:6901:2: ( ruleDeclarationsBlock )
            {
            // InternalPortugol.g:6901:2: ( ruleDeclarationsBlock )
            // InternalPortugol.g:6902:3: ruleDeclarationsBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getDeclarationsDeclarationsBlockParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDeclarationsBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getDeclarationsDeclarationsBlockParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockProcedure__DeclarationsAssignment_6"


    // $ANTLR start "rule__BlockProcedure__CommandsAssignment_9"
    // InternalPortugol.g:6911:1: rule__BlockProcedure__CommandsAssignment_9 : ( ruleAbstractCommand ) ;
    public final void rule__BlockProcedure__CommandsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6915:1: ( ( ruleAbstractCommand ) )
            // InternalPortugol.g:6916:2: ( ruleAbstractCommand )
            {
            // InternalPortugol.g:6916:2: ( ruleAbstractCommand )
            // InternalPortugol.g:6917:3: ruleAbstractCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getCommandsAbstractCommandParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbstractCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockProcedureAccess().getCommandsAbstractCommandParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockProcedure__CommandsAssignment_9"


    // $ANTLR start "rule__BlockCommand__CommandsAssignment_2"
    // InternalPortugol.g:6926:1: rule__BlockCommand__CommandsAssignment_2 : ( ruleAbstractCommand ) ;
    public final void rule__BlockCommand__CommandsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6930:1: ( ( ruleAbstractCommand ) )
            // InternalPortugol.g:6931:2: ( ruleAbstractCommand )
            {
            // InternalPortugol.g:6931:2: ( ruleAbstractCommand )
            // InternalPortugol.g:6932:3: ruleAbstractCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getCommandsAbstractCommandParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbstractCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockCommandAccess().getCommandsAbstractCommandParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockCommand__CommandsAssignment_2"


    // $ANTLR start "rule__IfStatement__ExprAssignment_1"
    // InternalPortugol.g:6941:1: rule__IfStatement__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__IfStatement__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6945:1: ( ( ruleExpression ) )
            // InternalPortugol.g:6946:2: ( ruleExpression )
            {
            // InternalPortugol.g:6946:2: ( ruleExpression )
            // InternalPortugol.g:6947:3: ruleExpression
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


    // $ANTLR start "rule__IfStatement__CommandsAssignment_4"
    // InternalPortugol.g:6956:1: rule__IfStatement__CommandsAssignment_4 : ( ruleAbstractCommand ) ;
    public final void rule__IfStatement__CommandsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6960:1: ( ( ruleAbstractCommand ) )
            // InternalPortugol.g:6961:2: ( ruleAbstractCommand )
            {
            // InternalPortugol.g:6961:2: ( ruleAbstractCommand )
            // InternalPortugol.g:6962:3: ruleAbstractCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getCommandsAbstractCommandParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbstractCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getCommandsAbstractCommandParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__CommandsAssignment_4"


    // $ANTLR start "rule__IfStatement__ElseCommandsAssignment_5_2"
    // InternalPortugol.g:6971:1: rule__IfStatement__ElseCommandsAssignment_5_2 : ( ruleAbstractCommand ) ;
    public final void rule__IfStatement__ElseCommandsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6975:1: ( ( ruleAbstractCommand ) )
            // InternalPortugol.g:6976:2: ( ruleAbstractCommand )
            {
            // InternalPortugol.g:6976:2: ( ruleAbstractCommand )
            // InternalPortugol.g:6977:3: ruleAbstractCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseCommandsAbstractCommandParserRuleCall_5_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbstractCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseCommandsAbstractCommandParserRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__ElseCommandsAssignment_5_2"


    // $ANTLR start "rule__SwitchCaseStatement__VariableAssignment_1"
    // InternalPortugol.g:6986:1: rule__SwitchCaseStatement__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SwitchCaseStatement__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6990:1: ( ( ( RULE_ID ) ) )
            // InternalPortugol.g:6991:2: ( ( RULE_ID ) )
            {
            // InternalPortugol.g:6991:2: ( ( RULE_ID ) )
            // InternalPortugol.g:6992:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getVariableVarNameCrossReference_1_0()); 
            }
            // InternalPortugol.g:6993:3: ( RULE_ID )
            // InternalPortugol.g:6994:4: RULE_ID
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


    // $ANTLR start "rule__SwitchCaseStatement__CaseListAssignment_3"
    // InternalPortugol.g:7005:1: rule__SwitchCaseStatement__CaseListAssignment_3 : ( ruleCaseList ) ;
    public final void rule__SwitchCaseStatement__CaseListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7009:1: ( ( ruleCaseList ) )
            // InternalPortugol.g:7010:2: ( ruleCaseList )
            {
            // InternalPortugol.g:7010:2: ( ruleCaseList )
            // InternalPortugol.g:7011:3: ruleCaseList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getCaseListCaseListParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCaseList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseStatementAccess().getCaseListCaseListParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchCaseStatement__CaseListAssignment_3"


    // $ANTLR start "rule__SwitchCaseStatement__OtherCaseAssignment_4"
    // InternalPortugol.g:7020:1: rule__SwitchCaseStatement__OtherCaseAssignment_4 : ( ruleOtherCase ) ;
    public final void rule__SwitchCaseStatement__OtherCaseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7024:1: ( ( ruleOtherCase ) )
            // InternalPortugol.g:7025:2: ( ruleOtherCase )
            {
            // InternalPortugol.g:7025:2: ( ruleOtherCase )
            // InternalPortugol.g:7026:3: ruleOtherCase
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchCaseStatementAccess().getOtherCaseOtherCaseParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOtherCase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchCaseStatementAccess().getOtherCaseOtherCaseParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchCaseStatement__OtherCaseAssignment_4"


    // $ANTLR start "rule__CaseList__ExprAssignment_1"
    // InternalPortugol.g:7035:1: rule__CaseList__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__CaseList__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7039:1: ( ( ruleExpression ) )
            // InternalPortugol.g:7040:2: ( ruleExpression )
            {
            // InternalPortugol.g:7040:2: ( ruleExpression )
            // InternalPortugol.g:7041:3: ruleExpression
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
    // InternalPortugol.g:7050:1: rule__CaseList__CommandsAssignment_3 : ( ruleAbstractCommand ) ;
    public final void rule__CaseList__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7054:1: ( ( ruleAbstractCommand ) )
            // InternalPortugol.g:7055:2: ( ruleAbstractCommand )
            {
            // InternalPortugol.g:7055:2: ( ruleAbstractCommand )
            // InternalPortugol.g:7056:3: ruleAbstractCommand
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
    // InternalPortugol.g:7065:1: rule__CaseList__BreakStatementAssignment_4_0 : ( ( 'interrompa' ) ) ;
    public final void rule__CaseList__BreakStatementAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7069:1: ( ( ( 'interrompa' ) ) )
            // InternalPortugol.g:7070:2: ( ( 'interrompa' ) )
            {
            // InternalPortugol.g:7070:2: ( ( 'interrompa' ) )
            // InternalPortugol.g:7071:3: ( 'interrompa' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getBreakStatementInterrompaKeyword_4_0_0()); 
            }
            // InternalPortugol.g:7072:3: ( 'interrompa' )
            // InternalPortugol.g:7073:4: 'interrompa'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseListAccess().getBreakStatementInterrompaKeyword_4_0_0()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:7084:1: rule__OtherCase__OtherCaseCommandsAssignment_2 : ( ruleAbstractCommand ) ;
    public final void rule__OtherCase__OtherCaseCommandsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7088:1: ( ( ruleAbstractCommand ) )
            // InternalPortugol.g:7089:2: ( ruleAbstractCommand )
            {
            // InternalPortugol.g:7089:2: ( ruleAbstractCommand )
            // InternalPortugol.g:7090:3: ruleAbstractCommand
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
    // InternalPortugol.g:7099:1: rule__OtherCase__BreakStatementAssignment_3_0 : ( ( 'interrompa' ) ) ;
    public final void rule__OtherCase__BreakStatementAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7103:1: ( ( ( 'interrompa' ) ) )
            // InternalPortugol.g:7104:2: ( ( 'interrompa' ) )
            {
            // InternalPortugol.g:7104:2: ( ( 'interrompa' ) )
            // InternalPortugol.g:7105:3: ( 'interrompa' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getBreakStatementInterrompaKeyword_3_0_0()); 
            }
            // InternalPortugol.g:7106:3: ( 'interrompa' )
            // InternalPortugol.g:7107:4: 'interrompa'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherCaseAccess().getBreakStatementInterrompaKeyword_3_0_0()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__SubprogramParam__ExpressionAssignment_0"
    // InternalPortugol.g:7118:1: rule__SubprogramParam__ExpressionAssignment_0 : ( ruleExpression ) ;
    public final void rule__SubprogramParam__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7122:1: ( ( ruleExpression ) )
            // InternalPortugol.g:7123:2: ( ruleExpression )
            {
            // InternalPortugol.g:7123:2: ( ruleExpression )
            // InternalPortugol.g:7124:3: ruleExpression
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
    // InternalPortugol.g:7133:1: rule__SubprogramParam__ExpressionAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__SubprogramParam__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7137:1: ( ( ruleExpression ) )
            // InternalPortugol.g:7138:2: ( ruleExpression )
            {
            // InternalPortugol.g:7138:2: ( ruleExpression )
            // InternalPortugol.g:7139:3: ruleExpression
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
    // InternalPortugol.g:7148:1: rule__ReadCommand__ParamListAssignment_2 : ( ruleDeclaredVarList ) ;
    public final void rule__ReadCommand__ParamListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7152:1: ( ( ruleDeclaredVarList ) )
            // InternalPortugol.g:7153:2: ( ruleDeclaredVarList )
            {
            // InternalPortugol.g:7153:2: ( ruleDeclaredVarList )
            // InternalPortugol.g:7154:3: ruleDeclaredVarList
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
    // InternalPortugol.g:7163:1: rule__WriteCommand__WriteCommandAssignment_0 : ( ( rule__WriteCommand__WriteCommandAlternatives_0_0 ) ) ;
    public final void rule__WriteCommand__WriteCommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7167:1: ( ( ( rule__WriteCommand__WriteCommandAlternatives_0_0 ) ) )
            // InternalPortugol.g:7168:2: ( ( rule__WriteCommand__WriteCommandAlternatives_0_0 ) )
            {
            // InternalPortugol.g:7168:2: ( ( rule__WriteCommand__WriteCommandAlternatives_0_0 ) )
            // InternalPortugol.g:7169:3: ( rule__WriteCommand__WriteCommandAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getWriteCommandAlternatives_0_0()); 
            }
            // InternalPortugol.g:7170:3: ( rule__WriteCommand__WriteCommandAlternatives_0_0 )
            // InternalPortugol.g:7170:4: rule__WriteCommand__WriteCommandAlternatives_0_0
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
    // InternalPortugol.g:7178:1: rule__WriteCommand__WriteParamAssignment_2 : ( ruleWriteParam ) ;
    public final void rule__WriteCommand__WriteParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7182:1: ( ( ruleWriteParam ) )
            // InternalPortugol.g:7183:2: ( ruleWriteParam )
            {
            // InternalPortugol.g:7183:2: ( ruleWriteParam )
            // InternalPortugol.g:7184:3: ruleWriteParam
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
    // InternalPortugol.g:7193:1: rule__WriteParam__ParamsAssignment_0 : ( ruleSubprogramParam ) ;
    public final void rule__WriteParam__ParamsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7197:1: ( ( ruleSubprogramParam ) )
            // InternalPortugol.g:7198:2: ( ruleSubprogramParam )
            {
            // InternalPortugol.g:7198:2: ( ruleSubprogramParam )
            // InternalPortugol.g:7199:3: ruleSubprogramParam
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
    // InternalPortugol.g:7208:1: rule__WriteParam__PrecisionAssignment_1 : ( ruleOptDecimalPrecision ) ;
    public final void rule__WriteParam__PrecisionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7212:1: ( ( ruleOptDecimalPrecision ) )
            // InternalPortugol.g:7213:2: ( ruleOptDecimalPrecision )
            {
            // InternalPortugol.g:7213:2: ( ruleOptDecimalPrecision )
            // InternalPortugol.g:7214:3: ruleOptDecimalPrecision
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
    // InternalPortugol.g:7223:1: rule__OptDecimalPrecision__FirstPrecisionAssignment_1 : ( RULE_INT ) ;
    public final void rule__OptDecimalPrecision__FirstPrecisionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7227:1: ( ( RULE_INT ) )
            // InternalPortugol.g:7228:2: ( RULE_INT )
            {
            // InternalPortugol.g:7228:2: ( RULE_INT )
            // InternalPortugol.g:7229:3: RULE_INT
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
    // InternalPortugol.g:7238:1: rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7242:1: ( ( RULE_INT ) )
            // InternalPortugol.g:7243:2: ( RULE_INT )
            {
            // InternalPortugol.g:7243:2: ( RULE_INT )
            // InternalPortugol.g:7244:3: RULE_INT
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
    // InternalPortugol.g:7253:1: rule__Assignment__OpAssignment_1_0_0_1 : ( ( '<-' ) ) ;
    public final void rule__Assignment__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7257:1: ( ( ( '<-' ) ) )
            // InternalPortugol.g:7258:2: ( ( '<-' ) )
            {
            // InternalPortugol.g:7258:2: ( ( '<-' ) )
            // InternalPortugol.g:7259:3: ( '<-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOpLessThanSignHyphenMinusKeyword_1_0_0_1_0()); 
            }
            // InternalPortugol.g:7260:3: ( '<-' )
            // InternalPortugol.g:7261:4: '<-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOpLessThanSignHyphenMinusKeyword_1_0_0_1_0()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:7272:1: rule__Assignment__RightAssignment_1_1 : ( ruleAssignment ) ;
    public final void rule__Assignment__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7276:1: ( ( ruleAssignment ) )
            // InternalPortugol.g:7277:2: ( ruleAssignment )
            {
            // InternalPortugol.g:7277:2: ( ruleAssignment )
            // InternalPortugol.g:7278:3: ruleAssignment
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
    // InternalPortugol.g:7287:1: rule__OrExpression__OpAssignment_1_0_0_1 : ( ( 'OU' ) ) ;
    public final void rule__OrExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7291:1: ( ( ( 'OU' ) ) )
            // InternalPortugol.g:7292:2: ( ( 'OU' ) )
            {
            // InternalPortugol.g:7292:2: ( ( 'OU' ) )
            // InternalPortugol.g:7293:3: ( 'OU' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpOUKeyword_1_0_0_1_0()); 
            }
            // InternalPortugol.g:7294:3: ( 'OU' )
            // InternalPortugol.g:7295:4: 'OU'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpOUKeyword_1_0_0_1_0()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:7306:1: rule__OrExpression__RightAssignment_1_1 : ( ruleXorExpression ) ;
    public final void rule__OrExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7310:1: ( ( ruleXorExpression ) )
            // InternalPortugol.g:7311:2: ( ruleXorExpression )
            {
            // InternalPortugol.g:7311:2: ( ruleXorExpression )
            // InternalPortugol.g:7312:3: ruleXorExpression
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
    // InternalPortugol.g:7321:1: rule__XorExpression__OpAssignment_1_0_0_1 : ( ( 'XOU' ) ) ;
    public final void rule__XorExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7325:1: ( ( ( 'XOU' ) ) )
            // InternalPortugol.g:7326:2: ( ( 'XOU' ) )
            {
            // InternalPortugol.g:7326:2: ( ( 'XOU' ) )
            // InternalPortugol.g:7327:3: ( 'XOU' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOpXOUKeyword_1_0_0_1_0()); 
            }
            // InternalPortugol.g:7328:3: ( 'XOU' )
            // InternalPortugol.g:7329:4: 'XOU'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOpXOUKeyword_1_0_0_1_0()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:7340:1: rule__XorExpression__RightAssignment_1_1 : ( ruleAndExpression ) ;
    public final void rule__XorExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7344:1: ( ( ruleAndExpression ) )
            // InternalPortugol.g:7345:2: ( ruleAndExpression )
            {
            // InternalPortugol.g:7345:2: ( ruleAndExpression )
            // InternalPortugol.g:7346:3: ruleAndExpression
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
    // InternalPortugol.g:7355:1: rule__AndExpression__OpAssignment_1_0_0_1 : ( ( rule__AndExpression__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__AndExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7359:1: ( ( ( rule__AndExpression__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugol.g:7360:2: ( ( rule__AndExpression__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugol.g:7360:2: ( ( rule__AndExpression__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugol.g:7361:3: ( rule__AndExpression__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugol.g:7362:3: ( rule__AndExpression__OpAlternatives_1_0_0_1_0 )
            // InternalPortugol.g:7362:4: rule__AndExpression__OpAlternatives_1_0_0_1_0
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
    // InternalPortugol.g:7370:1: rule__AndExpression__RightAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__AndExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7374:1: ( ( ruleComparison ) )
            // InternalPortugol.g:7375:2: ( ruleComparison )
            {
            // InternalPortugol.g:7375:2: ( ruleComparison )
            // InternalPortugol.g:7376:3: ruleComparison
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
    // InternalPortugol.g:7385:1: rule__Comparison__OpAssignment_1_0_0_1 : ( ( rule__Comparison__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7389:1: ( ( ( rule__Comparison__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugol.g:7390:2: ( ( rule__Comparison__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugol.g:7390:2: ( ( rule__Comparison__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugol.g:7391:3: ( rule__Comparison__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugol.g:7392:3: ( rule__Comparison__OpAlternatives_1_0_0_1_0 )
            // InternalPortugol.g:7392:4: rule__Comparison__OpAlternatives_1_0_0_1_0
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
    // InternalPortugol.g:7400:1: rule__Comparison__RightAssignment_1_1 : ( ruleEquExpression ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7404:1: ( ( ruleEquExpression ) )
            // InternalPortugol.g:7405:2: ( ruleEquExpression )
            {
            // InternalPortugol.g:7405:2: ( ruleEquExpression )
            // InternalPortugol.g:7406:3: ruleEquExpression
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
    // InternalPortugol.g:7415:1: rule__EquExpression__OpAssignment_1_0_0_1 : ( ( rule__EquExpression__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__EquExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7419:1: ( ( ( rule__EquExpression__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugol.g:7420:2: ( ( rule__EquExpression__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugol.g:7420:2: ( ( rule__EquExpression__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugol.g:7421:3: ( rule__EquExpression__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugol.g:7422:3: ( rule__EquExpression__OpAlternatives_1_0_0_1_0 )
            // InternalPortugol.g:7422:4: rule__EquExpression__OpAlternatives_1_0_0_1_0
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
    // InternalPortugol.g:7430:1: rule__EquExpression__RightAssignment_1_1 : ( ruleAddExpression ) ;
    public final void rule__EquExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7434:1: ( ( ruleAddExpression ) )
            // InternalPortugol.g:7435:2: ( ruleAddExpression )
            {
            // InternalPortugol.g:7435:2: ( ruleAddExpression )
            // InternalPortugol.g:7436:3: ruleAddExpression
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
    // InternalPortugol.g:7445:1: rule__AddExpression__OpAssignment_1_0_0_1 : ( ( rule__AddExpression__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__AddExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7449:1: ( ( ( rule__AddExpression__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugol.g:7450:2: ( ( rule__AddExpression__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugol.g:7450:2: ( ( rule__AddExpression__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugol.g:7451:3: ( rule__AddExpression__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugol.g:7452:3: ( rule__AddExpression__OpAlternatives_1_0_0_1_0 )
            // InternalPortugol.g:7452:4: rule__AddExpression__OpAlternatives_1_0_0_1_0
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
    // InternalPortugol.g:7460:1: rule__AddExpression__RightAssignment_1_1 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AddExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7464:1: ( ( ruleMultiplicativeExpression ) )
            // InternalPortugol.g:7465:2: ( ruleMultiplicativeExpression )
            {
            // InternalPortugol.g:7465:2: ( ruleMultiplicativeExpression )
            // InternalPortugol.g:7466:3: ruleMultiplicativeExpression
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
    // InternalPortugol.g:7475:1: rule__MultiplicativeExpression__OpAssignment_1_0_0_1 : ( ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__MultiplicativeExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7479:1: ( ( ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugol.g:7480:2: ( ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugol.g:7480:2: ( ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugol.g:7481:3: ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugol.g:7482:3: ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 )
            // InternalPortugol.g:7482:4: rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0
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
    // InternalPortugol.g:7490:1: rule__MultiplicativeExpression__RightAssignment_1_1 : ( rulePowerExpression ) ;
    public final void rule__MultiplicativeExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7494:1: ( ( rulePowerExpression ) )
            // InternalPortugol.g:7495:2: ( rulePowerExpression )
            {
            // InternalPortugol.g:7495:2: ( rulePowerExpression )
            // InternalPortugol.g:7496:3: rulePowerExpression
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
    // InternalPortugol.g:7505:1: rule__PowerExpression__OpAssignment_1_0_0_1 : ( ( '^' ) ) ;
    public final void rule__PowerExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7509:1: ( ( ( '^' ) ) )
            // InternalPortugol.g:7510:2: ( ( '^' ) )
            {
            // InternalPortugol.g:7510:2: ( ( '^' ) )
            // InternalPortugol.g:7511:3: ( '^' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getOpCircumflexAccentKeyword_1_0_0_1_0()); 
            }
            // InternalPortugol.g:7512:3: ( '^' )
            // InternalPortugol.g:7513:4: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getOpCircumflexAccentKeyword_1_0_0_1_0()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:7524:1: rule__PowerExpression__RightAssignment_1_1 : ( ruleUnaryExpression ) ;
    public final void rule__PowerExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7528:1: ( ( ruleUnaryExpression ) )
            // InternalPortugol.g:7529:2: ( ruleUnaryExpression )
            {
            // InternalPortugol.g:7529:2: ( ruleUnaryExpression )
            // InternalPortugol.g:7530:3: ruleUnaryExpression
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
    // InternalPortugol.g:7539:1: rule__UnaryExpression__OpAssignment_0_1 : ( ( rule__UnaryExpression__OpAlternatives_0_1_0 ) ) ;
    public final void rule__UnaryExpression__OpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7543:1: ( ( ( rule__UnaryExpression__OpAlternatives_0_1_0 ) ) )
            // InternalPortugol.g:7544:2: ( ( rule__UnaryExpression__OpAlternatives_0_1_0 ) )
            {
            // InternalPortugol.g:7544:2: ( ( rule__UnaryExpression__OpAlternatives_0_1_0 ) )
            // InternalPortugol.g:7545:3: ( rule__UnaryExpression__OpAlternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOpAlternatives_0_1_0()); 
            }
            // InternalPortugol.g:7546:3: ( rule__UnaryExpression__OpAlternatives_0_1_0 )
            // InternalPortugol.g:7546:4: rule__UnaryExpression__OpAlternatives_0_1_0
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
    // InternalPortugol.g:7554:1: rule__UnaryExpression__OperandAssignment_0_2 : ( ruleUnaryExpression ) ;
    public final void rule__UnaryExpression__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7558:1: ( ( ruleUnaryExpression ) )
            // InternalPortugol.g:7559:2: ( ruleUnaryExpression )
            {
            // InternalPortugol.g:7559:2: ( ruleUnaryExpression )
            // InternalPortugol.g:7560:3: ruleUnaryExpression
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
    // InternalPortugol.g:7569:1: rule__FunctionCall__FbNameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__FbNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7573:1: ( ( ( RULE_ID ) ) )
            // InternalPortugol.g:7574:2: ( ( RULE_ID ) )
            {
            // InternalPortugol.g:7574:2: ( ( RULE_ID ) )
            // InternalPortugol.g:7575:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFbNameFunctionNameCrossReference_0_0()); 
            }
            // InternalPortugol.g:7576:3: ( RULE_ID )
            // InternalPortugol.g:7577:4: RULE_ID
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
    // InternalPortugol.g:7588:1: rule__FunctionCall__ParamAssignment_2 : ( ruleSubprogramParam ) ;
    public final void rule__FunctionCall__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7592:1: ( ( ruleSubprogramParam ) )
            // InternalPortugol.g:7593:2: ( ruleSubprogramParam )
            {
            // InternalPortugol.g:7593:2: ( ruleSubprogramParam )
            // InternalPortugol.g:7594:3: ruleSubprogramParam
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
    // InternalPortugol.g:7603:1: rule__DeclaredVar__VarNameAssignment : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredVar__VarNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7607:1: ( ( ( RULE_ID ) ) )
            // InternalPortugol.g:7608:2: ( ( RULE_ID ) )
            {
            // InternalPortugol.g:7608:2: ( ( RULE_ID ) )
            // InternalPortugol.g:7609:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getVarNameVarNameCrossReference_0()); 
            }
            // InternalPortugol.g:7610:3: ( RULE_ID )
            // InternalPortugol.g:7611:4: RULE_ID
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
    // InternalPortugol.g:7622:1: rule__NumericLiteral__IntValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__NumericLiteral__IntValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7626:1: ( ( RULE_INT ) )
            // InternalPortugol.g:7627:2: ( RULE_INT )
            {
            // InternalPortugol.g:7627:2: ( RULE_INT )
            // InternalPortugol.g:7628:3: RULE_INT
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
    // InternalPortugol.g:7637:1: rule__NumericLiteral__FloatValueAssignment_1 : ( RULE_FLOAT ) ;
    public final void rule__NumericLiteral__FloatValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7641:1: ( ( RULE_FLOAT ) )
            // InternalPortugol.g:7642:2: ( RULE_FLOAT )
            {
            // InternalPortugol.g:7642:2: ( RULE_FLOAT )
            // InternalPortugol.g:7643:3: RULE_FLOAT
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
    // InternalPortugol.g:7652:1: rule__StringExpression__LiteralStringAssignment : ( RULE_STRING ) ;
    public final void rule__StringExpression__LiteralStringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:7656:1: ( ( RULE_STRING ) )
            // InternalPortugol.g:7657:2: ( RULE_STRING )
            {
            // InternalPortugol.g:7657:2: ( RULE_STRING )
            // InternalPortugol.g:7658:3: RULE_STRING
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

    // $ANTLR start synpred49_InternalPortugol
    public final void synpred49_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:4602:3: ( rule__Assignment__Group_1__0 )
        // InternalPortugol.g:4602:3: rule__Assignment__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Assignment__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalPortugol

    // Delegated rules

    public final boolean synpred49_InternalPortugol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalPortugol_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00444082100601E0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00444082100601E2L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000082100001E0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0028000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000210000000L});

}