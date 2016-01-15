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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_END_COMMAND", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'real'", "'inteiro'", "'caractere'", "'&'", "'AND'", "'='", "'<>'", "'<'", "'>'", "'<='", "'>='", "'algoritmo'", "'var'", "':'", "','", "'funcao'", "'('", "')'", "'inicio'", "'fimfuncao'", "'procedimento'", "'fimprocedimento'", "'fimalgoritmo'", "'leia'", "'escreva'", "'+'", "'-'", "'*'", "'/'", "'MOD'", "'NOT'", "'OR'", "'XOR'", "'^'"
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


    // $ANTLR start "entryRuleDeclaredVar"
    // InternalPortugol.g:179:1: entryRuleDeclaredVar : ruleDeclaredVar EOF ;
    public final void entryRuleDeclaredVar() throws RecognitionException {
        try {
            // InternalPortugol.g:180:1: ( ruleDeclaredVar EOF )
            // InternalPortugol.g:181:1: ruleDeclaredVar EOF
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
    // InternalPortugol.g:188:1: ruleDeclaredVar : ( ( rule__DeclaredVar__Group__0 ) ) ;
    public final void ruleDeclaredVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:192:2: ( ( ( rule__DeclaredVar__Group__0 ) ) )
            // InternalPortugol.g:193:2: ( ( rule__DeclaredVar__Group__0 ) )
            {
            // InternalPortugol.g:193:2: ( ( rule__DeclaredVar__Group__0 ) )
            // InternalPortugol.g:194:3: ( rule__DeclaredVar__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getGroup()); 
            }
            // InternalPortugol.g:195:3: ( rule__DeclaredVar__Group__0 )
            // InternalPortugol.g:195:4: rule__DeclaredVar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredVar__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredVarAccess().getGroup()); 
            }

            }


            }

        }
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

                if ( (LA1_0==28||LA1_0==33) ) {
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


    // $ANTLR start "entryRuleFunctionName"
    // InternalPortugol.g:311:1: entryRuleFunctionName : ruleFunctionName EOF ;
    public final void entryRuleFunctionName() throws RecognitionException {
        try {
            // InternalPortugol.g:312:1: ( ruleFunctionName EOF )
            // InternalPortugol.g:313:1: ruleFunctionName EOF
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
    // InternalPortugol.g:320:1: ruleFunctionName : ( ( rule__FunctionName__NameAssignment ) ) ;
    public final void ruleFunctionName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:324:2: ( ( ( rule__FunctionName__NameAssignment ) ) )
            // InternalPortugol.g:325:2: ( ( rule__FunctionName__NameAssignment ) )
            {
            // InternalPortugol.g:325:2: ( ( rule__FunctionName__NameAssignment ) )
            // InternalPortugol.g:326:3: ( rule__FunctionName__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionNameAccess().getNameAssignment()); 
            }
            // InternalPortugol.g:327:3: ( rule__FunctionName__NameAssignment )
            // InternalPortugol.g:327:4: rule__FunctionName__NameAssignment
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


    // $ANTLR start "entryRuleProcedureName"
    // InternalPortugol.g:336:1: entryRuleProcedureName : ruleProcedureName EOF ;
    public final void entryRuleProcedureName() throws RecognitionException {
        try {
            // InternalPortugol.g:337:1: ( ruleProcedureName EOF )
            // InternalPortugol.g:338:1: ruleProcedureName EOF
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
    // InternalPortugol.g:345:1: ruleProcedureName : ( ( rule__ProcedureName__NameAssignment ) ) ;
    public final void ruleProcedureName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:349:2: ( ( ( rule__ProcedureName__NameAssignment ) ) )
            // InternalPortugol.g:350:2: ( ( rule__ProcedureName__NameAssignment ) )
            {
            // InternalPortugol.g:350:2: ( ( rule__ProcedureName__NameAssignment ) )
            // InternalPortugol.g:351:3: ( rule__ProcedureName__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedureNameAccess().getNameAssignment()); 
            }
            // InternalPortugol.g:352:3: ( rule__ProcedureName__NameAssignment )
            // InternalPortugol.g:352:4: rule__ProcedureName__NameAssignment
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


    // $ANTLR start "entryRuleReadCommand"
    // InternalPortugol.g:461:1: entryRuleReadCommand : ruleReadCommand EOF ;
    public final void entryRuleReadCommand() throws RecognitionException {
        try {
            // InternalPortugol.g:462:1: ( ruleReadCommand EOF )
            // InternalPortugol.g:463:1: ruleReadCommand EOF
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
    // InternalPortugol.g:470:1: ruleReadCommand : ( ( rule__ReadCommand__Group__0 ) ) ;
    public final void ruleReadCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:474:2: ( ( ( rule__ReadCommand__Group__0 ) ) )
            // InternalPortugol.g:475:2: ( ( rule__ReadCommand__Group__0 ) )
            {
            // InternalPortugol.g:475:2: ( ( rule__ReadCommand__Group__0 ) )
            // InternalPortugol.g:476:3: ( rule__ReadCommand__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getGroup()); 
            }
            // InternalPortugol.g:477:3: ( rule__ReadCommand__Group__0 )
            // InternalPortugol.g:477:4: rule__ReadCommand__Group__0
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
    // InternalPortugol.g:486:1: entryRuleWriteCommand : ruleWriteCommand EOF ;
    public final void entryRuleWriteCommand() throws RecognitionException {
        try {
            // InternalPortugol.g:487:1: ( ruleWriteCommand EOF )
            // InternalPortugol.g:488:1: ruleWriteCommand EOF
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
    // InternalPortugol.g:495:1: ruleWriteCommand : ( ( rule__WriteCommand__Group__0 ) ) ;
    public final void ruleWriteCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:499:2: ( ( ( rule__WriteCommand__Group__0 ) ) )
            // InternalPortugol.g:500:2: ( ( rule__WriteCommand__Group__0 ) )
            {
            // InternalPortugol.g:500:2: ( ( rule__WriteCommand__Group__0 ) )
            // InternalPortugol.g:501:3: ( rule__WriteCommand__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getGroup()); 
            }
            // InternalPortugol.g:502:3: ( rule__WriteCommand__Group__0 )
            // InternalPortugol.g:502:4: rule__WriteCommand__Group__0
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
    // InternalPortugol.g:511:1: entryRuleWriteParam : ruleWriteParam EOF ;
    public final void entryRuleWriteParam() throws RecognitionException {
        try {
            // InternalPortugol.g:512:1: ( ruleWriteParam EOF )
            // InternalPortugol.g:513:1: ruleWriteParam EOF
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
    // InternalPortugol.g:520:1: ruleWriteParam : ( ( rule__WriteParam__Group__0 ) ) ;
    public final void ruleWriteParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:524:2: ( ( ( rule__WriteParam__Group__0 ) ) )
            // InternalPortugol.g:525:2: ( ( rule__WriteParam__Group__0 ) )
            {
            // InternalPortugol.g:525:2: ( ( rule__WriteParam__Group__0 ) )
            // InternalPortugol.g:526:3: ( rule__WriteParam__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getGroup()); 
            }
            // InternalPortugol.g:527:3: ( rule__WriteParam__Group__0 )
            // InternalPortugol.g:527:4: rule__WriteParam__Group__0
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


    // $ANTLR start "entryRuleExpression"
    // InternalPortugol.g:536:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:537:1: ( ruleExpression EOF )
            // InternalPortugol.g:538:1: ruleExpression EOF
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
    // InternalPortugol.g:545:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:549:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalPortugol.g:550:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalPortugol.g:550:2: ( ( rule__Expression__Group__0 ) )
            // InternalPortugol.g:551:3: ( rule__Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:552:3: ( rule__Expression__Group__0 )
            // InternalPortugol.g:552:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleXorExpression"
    // InternalPortugol.g:561:1: entryRuleXorExpression : ruleXorExpression EOF ;
    public final void entryRuleXorExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:562:1: ( ruleXorExpression EOF )
            // InternalPortugol.g:563:1: ruleXorExpression EOF
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
    // InternalPortugol.g:570:1: ruleXorExpression : ( ( rule__XorExpression__Group__0 ) ) ;
    public final void ruleXorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:574:2: ( ( ( rule__XorExpression__Group__0 ) ) )
            // InternalPortugol.g:575:2: ( ( rule__XorExpression__Group__0 ) )
            {
            // InternalPortugol.g:575:2: ( ( rule__XorExpression__Group__0 ) )
            // InternalPortugol.g:576:3: ( rule__XorExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:577:3: ( rule__XorExpression__Group__0 )
            // InternalPortugol.g:577:4: rule__XorExpression__Group__0
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
    // InternalPortugol.g:586:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:587:1: ( ruleAndExpression EOF )
            // InternalPortugol.g:588:1: ruleAndExpression EOF
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
    // InternalPortugol.g:595:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:599:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalPortugol.g:600:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalPortugol.g:600:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalPortugol.g:601:3: ( rule__AndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:602:3: ( rule__AndExpression__Group__0 )
            // InternalPortugol.g:602:4: rule__AndExpression__Group__0
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
    // InternalPortugol.g:611:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalPortugol.g:612:1: ( ruleComparison EOF )
            // InternalPortugol.g:613:1: ruleComparison EOF
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
    // InternalPortugol.g:620:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:624:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalPortugol.g:625:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalPortugol.g:625:2: ( ( rule__Comparison__Group__0 ) )
            // InternalPortugol.g:626:3: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // InternalPortugol.g:627:3: ( rule__Comparison__Group__0 )
            // InternalPortugol.g:627:4: rule__Comparison__Group__0
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
    // InternalPortugol.g:636:1: entryRuleEquExpression : ruleEquExpression EOF ;
    public final void entryRuleEquExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:637:1: ( ruleEquExpression EOF )
            // InternalPortugol.g:638:1: ruleEquExpression EOF
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
    // InternalPortugol.g:645:1: ruleEquExpression : ( ( rule__EquExpression__Group__0 ) ) ;
    public final void ruleEquExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:649:2: ( ( ( rule__EquExpression__Group__0 ) ) )
            // InternalPortugol.g:650:2: ( ( rule__EquExpression__Group__0 ) )
            {
            // InternalPortugol.g:650:2: ( ( rule__EquExpression__Group__0 ) )
            // InternalPortugol.g:651:3: ( rule__EquExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:652:3: ( rule__EquExpression__Group__0 )
            // InternalPortugol.g:652:4: rule__EquExpression__Group__0
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
    // InternalPortugol.g:661:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:662:1: ( ruleAddExpression EOF )
            // InternalPortugol.g:663:1: ruleAddExpression EOF
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
    // InternalPortugol.g:670:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:674:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // InternalPortugol.g:675:2: ( ( rule__AddExpression__Group__0 ) )
            {
            // InternalPortugol.g:675:2: ( ( rule__AddExpression__Group__0 ) )
            // InternalPortugol.g:676:3: ( rule__AddExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:677:3: ( rule__AddExpression__Group__0 )
            // InternalPortugol.g:677:4: rule__AddExpression__Group__0
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


    // $ANTLR start "entryRuleTerm"
    // InternalPortugol.g:686:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalPortugol.g:687:1: ( ruleTerm EOF )
            // InternalPortugol.g:688:1: ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermRule()); 
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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalPortugol.g:695:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:699:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalPortugol.g:700:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalPortugol.g:700:2: ( ( rule__Term__Group__0 ) )
            // InternalPortugol.g:701:3: ( rule__Term__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getGroup()); 
            }
            // InternalPortugol.g:702:3: ( rule__Term__Group__0 )
            // InternalPortugol.g:702:4: rule__Term__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRulePowerExpression"
    // InternalPortugol.g:711:1: entryRulePowerExpression : rulePowerExpression EOF ;
    public final void entryRulePowerExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:712:1: ( rulePowerExpression EOF )
            // InternalPortugol.g:713:1: rulePowerExpression EOF
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
    // InternalPortugol.g:720:1: rulePowerExpression : ( ( rule__PowerExpression__Group__0 ) ) ;
    public final void rulePowerExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:724:2: ( ( ( rule__PowerExpression__Group__0 ) ) )
            // InternalPortugol.g:725:2: ( ( rule__PowerExpression__Group__0 ) )
            {
            // InternalPortugol.g:725:2: ( ( rule__PowerExpression__Group__0 ) )
            // InternalPortugol.g:726:3: ( rule__PowerExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:727:3: ( rule__PowerExpression__Group__0 )
            // InternalPortugol.g:727:4: rule__PowerExpression__Group__0
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
    // InternalPortugol.g:736:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:737:1: ( ruleUnaryExpression EOF )
            // InternalPortugol.g:738:1: ruleUnaryExpression EOF
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
    // InternalPortugol.g:745:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:749:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // InternalPortugol.g:750:2: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // InternalPortugol.g:750:2: ( ( rule__UnaryExpression__Alternatives ) )
            // InternalPortugol.g:751:3: ( rule__UnaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            }
            // InternalPortugol.g:752:3: ( rule__UnaryExpression__Alternatives )
            // InternalPortugol.g:752:4: rule__UnaryExpression__Alternatives
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
    // InternalPortugol.g:761:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:762:1: ( rulePrimaryExpression EOF )
            // InternalPortugol.g:763:1: rulePrimaryExpression EOF
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
    // InternalPortugol.g:770:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:774:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalPortugol.g:775:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalPortugol.g:775:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalPortugol.g:776:3: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // InternalPortugol.g:777:3: ( rule__PrimaryExpression__Alternatives )
            // InternalPortugol.g:777:4: rule__PrimaryExpression__Alternatives
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
    // InternalPortugol.g:786:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalPortugol.g:787:1: ( ruleFunctionCall EOF )
            // InternalPortugol.g:788:1: ruleFunctionCall EOF
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
    // InternalPortugol.g:795:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:799:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalPortugol.g:800:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalPortugol.g:800:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalPortugol.g:801:3: ( rule__FunctionCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup()); 
            }
            // InternalPortugol.g:802:3: ( rule__FunctionCall__Group__0 )
            // InternalPortugol.g:802:4: rule__FunctionCall__Group__0
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


    // $ANTLR start "entryRuleOptDecimalPrecision"
    // InternalPortugol.g:811:1: entryRuleOptDecimalPrecision : ruleOptDecimalPrecision EOF ;
    public final void entryRuleOptDecimalPrecision() throws RecognitionException {
        try {
            // InternalPortugol.g:812:1: ( ruleOptDecimalPrecision EOF )
            // InternalPortugol.g:813:1: ruleOptDecimalPrecision EOF
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
    // InternalPortugol.g:820:1: ruleOptDecimalPrecision : ( ( rule__OptDecimalPrecision__Group__0 ) ) ;
    public final void ruleOptDecimalPrecision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:824:2: ( ( ( rule__OptDecimalPrecision__Group__0 ) ) )
            // InternalPortugol.g:825:2: ( ( rule__OptDecimalPrecision__Group__0 ) )
            {
            // InternalPortugol.g:825:2: ( ( rule__OptDecimalPrecision__Group__0 ) )
            // InternalPortugol.g:826:3: ( rule__OptDecimalPrecision__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getGroup()); 
            }
            // InternalPortugol.g:827:3: ( rule__OptDecimalPrecision__Group__0 )
            // InternalPortugol.g:827:4: rule__OptDecimalPrecision__Group__0
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


    // $ANTLR start "entryRuleConstant"
    // InternalPortugol.g:836:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalPortugol.g:837:1: ( ruleConstant EOF )
            // InternalPortugol.g:838:1: ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantRule()); 
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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalPortugol.g:845:1: ruleConstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:849:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalPortugol.g:850:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalPortugol.g:850:2: ( ( rule__Constant__Alternatives ) )
            // InternalPortugol.g:851:3: ( rule__Constant__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getAlternatives()); 
            }
            // InternalPortugol.g:852:3: ( rule__Constant__Alternatives )
            // InternalPortugol.g:852:4: rule__Constant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleNumericLiteral"
    // InternalPortugol.g:861:1: entryRuleNumericLiteral : ruleNumericLiteral EOF ;
    public final void entryRuleNumericLiteral() throws RecognitionException {
        try {
            // InternalPortugol.g:862:1: ( ruleNumericLiteral EOF )
            // InternalPortugol.g:863:1: ruleNumericLiteral EOF
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
    // InternalPortugol.g:870:1: ruleNumericLiteral : ( ( rule__NumericLiteral__Alternatives ) ) ;
    public final void ruleNumericLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:874:2: ( ( ( rule__NumericLiteral__Alternatives ) ) )
            // InternalPortugol.g:875:2: ( ( rule__NumericLiteral__Alternatives ) )
            {
            // InternalPortugol.g:875:2: ( ( rule__NumericLiteral__Alternatives ) )
            // InternalPortugol.g:876:3: ( rule__NumericLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericLiteralAccess().getAlternatives()); 
            }
            // InternalPortugol.g:877:3: ( rule__NumericLiteral__Alternatives )
            // InternalPortugol.g:877:4: rule__NumericLiteral__Alternatives
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
    // InternalPortugol.g:886:1: entryRuleStringExpression : ruleStringExpression EOF ;
    public final void entryRuleStringExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:887:1: ( ruleStringExpression EOF )
            // InternalPortugol.g:888:1: ruleStringExpression EOF
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
    // InternalPortugol.g:895:1: ruleStringExpression : ( ( rule__StringExpression__LiteralStringAssignment ) ) ;
    public final void ruleStringExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:899:2: ( ( ( rule__StringExpression__LiteralStringAssignment ) ) )
            // InternalPortugol.g:900:2: ( ( rule__StringExpression__LiteralStringAssignment ) )
            {
            // InternalPortugol.g:900:2: ( ( rule__StringExpression__LiteralStringAssignment ) )
            // InternalPortugol.g:901:3: ( rule__StringExpression__LiteralStringAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringExpressionAccess().getLiteralStringAssignment()); 
            }
            // InternalPortugol.g:902:3: ( rule__StringExpression__LiteralStringAssignment )
            // InternalPortugol.g:902:4: rule__StringExpression__LiteralStringAssignment
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
    // InternalPortugol.g:910:1: rule__VarType__TypeNameAlternatives_0 : ( ( 'real' ) | ( 'inteiro' ) | ( 'caractere' ) );
    public final void rule__VarType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:914:1: ( ( 'real' ) | ( 'inteiro' ) | ( 'caractere' ) )
            int alt2=3;
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
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPortugol.g:915:2: ( 'real' )
                    {
                    // InternalPortugol.g:915:2: ( 'real' )
                    // InternalPortugol.g:916:3: 'real'
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
                    // InternalPortugol.g:921:2: ( 'inteiro' )
                    {
                    // InternalPortugol.g:921:2: ( 'inteiro' )
                    // InternalPortugol.g:922:3: 'inteiro'
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
                    // InternalPortugol.g:927:2: ( 'caractere' )
                    {
                    // InternalPortugol.g:927:2: ( 'caractere' )
                    // InternalPortugol.g:928:3: 'caractere'
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

            }
        }
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
    // InternalPortugol.g:937:1: rule__BlockSubPrograms__Alternatives : ( ( ruleBlockFunction ) | ( ruleBlockProcedure ) );
    public final void rule__BlockSubPrograms__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:941:1: ( ( ruleBlockFunction ) | ( ruleBlockProcedure ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            else if ( (LA3_0==33) ) {
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
                    // InternalPortugol.g:942:2: ( ruleBlockFunction )
                    {
                    // InternalPortugol.g:942:2: ( ruleBlockFunction )
                    // InternalPortugol.g:943:3: ruleBlockFunction
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
                    // InternalPortugol.g:948:2: ( ruleBlockProcedure )
                    {
                    // InternalPortugol.g:948:2: ( ruleBlockProcedure )
                    // InternalPortugol.g:949:3: ruleBlockProcedure
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
    // InternalPortugol.g:958:1: rule__AbstractCommand__Alternatives : ( ( ruleReadCommand ) | ( ruleWriteCommand ) );
    public final void rule__AbstractCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:962:1: ( ( ruleReadCommand ) | ( ruleWriteCommand ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==36) ) {
                alt4=1;
            }
            else if ( (LA4_0==37) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPortugol.g:963:2: ( ruleReadCommand )
                    {
                    // InternalPortugol.g:963:2: ( ruleReadCommand )
                    // InternalPortugol.g:964:3: ruleReadCommand
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getReadCommandParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleReadCommand();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractCommandAccess().getReadCommandParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:969:2: ( ruleWriteCommand )
                    {
                    // InternalPortugol.g:969:2: ( ruleWriteCommand )
                    // InternalPortugol.g:970:3: ruleWriteCommand
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getWriteCommandParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleWriteCommand();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractCommandAccess().getWriteCommandParserRuleCall_1()); 
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


    // $ANTLR start "rule__AndExpression__OpAlternatives_1_0_1_0"
    // InternalPortugol.g:979:1: rule__AndExpression__OpAlternatives_1_0_1_0 : ( ( '&' ) | ( 'AND' ) );
    public final void rule__AndExpression__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:983:1: ( ( '&' ) | ( 'AND' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
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
                    // InternalPortugol.g:984:2: ( '&' )
                    {
                    // InternalPortugol.g:984:2: ( '&' )
                    // InternalPortugol.g:985:3: '&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndExpressionAccess().getOpAmpersandKeyword_1_0_1_0_0()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAndExpressionAccess().getOpAmpersandKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:990:2: ( 'AND' )
                    {
                    // InternalPortugol.g:990:2: ( 'AND' )
                    // InternalPortugol.g:991:3: 'AND'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndExpressionAccess().getOpANDKeyword_1_0_1_0_1()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAndExpressionAccess().getOpANDKeyword_1_0_1_0_1()); 
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
    // $ANTLR end "rule__AndExpression__OpAlternatives_1_0_1_0"


    // $ANTLR start "rule__Comparison__OpAlternatives_1_0_1_0"
    // InternalPortugol.g:1000:1: rule__Comparison__OpAlternatives_1_0_1_0 : ( ( '=' ) | ( '<>' ) );
    public final void rule__Comparison__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1004:1: ( ( '=' ) | ( '<>' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
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
                    // InternalPortugol.g:1005:2: ( '=' )
                    {
                    // InternalPortugol.g:1005:2: ( '=' )
                    // InternalPortugol.g:1006:3: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getOpEqualsSignKeyword_1_0_1_0_0()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getOpEqualsSignKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:1011:2: ( '<>' )
                    {
                    // InternalPortugol.g:1011:2: ( '<>' )
                    // InternalPortugol.g:1012:3: '<>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getOpLessThanSignGreaterThanSignKeyword_1_0_1_0_1()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getOpLessThanSignGreaterThanSignKeyword_1_0_1_0_1()); 
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
    // $ANTLR end "rule__Comparison__OpAlternatives_1_0_1_0"


    // $ANTLR start "rule__EquExpression__OpAlternatives_1_0_1_0"
    // InternalPortugol.g:1021:1: rule__EquExpression__OpAlternatives_1_0_1_0 : ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__EquExpression__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1025:1: ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            case 23:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalPortugol.g:1026:2: ( '<' )
                    {
                    // InternalPortugol.g:1026:2: ( '<' )
                    // InternalPortugol.g:1027:3: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEquExpressionAccess().getOpLessThanSignKeyword_1_0_1_0_0()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEquExpressionAccess().getOpLessThanSignKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:1032:2: ( '>' )
                    {
                    // InternalPortugol.g:1032:2: ( '>' )
                    // InternalPortugol.g:1033:3: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEquExpressionAccess().getOpGreaterThanSignKeyword_1_0_1_0_1()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEquExpressionAccess().getOpGreaterThanSignKeyword_1_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPortugol.g:1038:2: ( '<=' )
                    {
                    // InternalPortugol.g:1038:2: ( '<=' )
                    // InternalPortugol.g:1039:3: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEquExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_2()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEquExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPortugol.g:1044:2: ( '>=' )
                    {
                    // InternalPortugol.g:1044:2: ( '>=' )
                    // InternalPortugol.g:1045:3: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEquExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_3()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEquExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_3()); 
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
    // $ANTLR end "rule__EquExpression__OpAlternatives_1_0_1_0"


    // $ANTLR start "rule__AddExpression__Alternatives_1_0"
    // InternalPortugol.g:1054:1: rule__AddExpression__Alternatives_1_0 : ( ( ( rule__AddExpression__Group_1_0_0__0 ) ) | ( ( rule__AddExpression__Group_1_0_1__0 ) ) );
    public final void rule__AddExpression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1058:1: ( ( ( rule__AddExpression__Group_1_0_0__0 ) ) | ( ( rule__AddExpression__Group_1_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==38) ) {
                alt8=1;
            }
            else if ( (LA8_0==39) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPortugol.g:1059:2: ( ( rule__AddExpression__Group_1_0_0__0 ) )
                    {
                    // InternalPortugol.g:1059:2: ( ( rule__AddExpression__Group_1_0_0__0 ) )
                    // InternalPortugol.g:1060:3: ( rule__AddExpression__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddExpressionAccess().getGroup_1_0_0()); 
                    }
                    // InternalPortugol.g:1061:3: ( rule__AddExpression__Group_1_0_0__0 )
                    // InternalPortugol.g:1061:4: rule__AddExpression__Group_1_0_0__0
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
                    break;
                case 2 :
                    // InternalPortugol.g:1065:2: ( ( rule__AddExpression__Group_1_0_1__0 ) )
                    {
                    // InternalPortugol.g:1065:2: ( ( rule__AddExpression__Group_1_0_1__0 ) )
                    // InternalPortugol.g:1066:3: ( rule__AddExpression__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddExpressionAccess().getGroup_1_0_1()); 
                    }
                    // InternalPortugol.g:1067:3: ( rule__AddExpression__Group_1_0_1__0 )
                    // InternalPortugol.g:1067:4: rule__AddExpression__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddExpression__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAddExpressionAccess().getGroup_1_0_1()); 
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
    // $ANTLR end "rule__AddExpression__Alternatives_1_0"


    // $ANTLR start "rule__Term__Alternatives_1_0"
    // InternalPortugol.g:1075:1: rule__Term__Alternatives_1_0 : ( ( ( rule__Term__Group_1_0_0__0 ) ) | ( ( rule__Term__Group_1_0_1__0 ) ) | ( ( rule__Term__Group_1_0_2__0 ) ) );
    public final void rule__Term__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1079:1: ( ( ( rule__Term__Group_1_0_0__0 ) ) | ( ( rule__Term__Group_1_0_1__0 ) ) | ( ( rule__Term__Group_1_0_2__0 ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt9=1;
                }
                break;
            case 41:
                {
                alt9=2;
                }
                break;
            case 42:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalPortugol.g:1080:2: ( ( rule__Term__Group_1_0_0__0 ) )
                    {
                    // InternalPortugol.g:1080:2: ( ( rule__Term__Group_1_0_0__0 ) )
                    // InternalPortugol.g:1081:3: ( rule__Term__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getGroup_1_0_0()); 
                    }
                    // InternalPortugol.g:1082:3: ( rule__Term__Group_1_0_0__0 )
                    // InternalPortugol.g:1082:4: rule__Term__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:1086:2: ( ( rule__Term__Group_1_0_1__0 ) )
                    {
                    // InternalPortugol.g:1086:2: ( ( rule__Term__Group_1_0_1__0 ) )
                    // InternalPortugol.g:1087:3: ( rule__Term__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getGroup_1_0_1()); 
                    }
                    // InternalPortugol.g:1088:3: ( rule__Term__Group_1_0_1__0 )
                    // InternalPortugol.g:1088:4: rule__Term__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPortugol.g:1092:2: ( ( rule__Term__Group_1_0_2__0 ) )
                    {
                    // InternalPortugol.g:1092:2: ( ( rule__Term__Group_1_0_2__0 ) )
                    // InternalPortugol.g:1093:3: ( rule__Term__Group_1_0_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getGroup_1_0_2()); 
                    }
                    // InternalPortugol.g:1094:3: ( rule__Term__Group_1_0_2__0 )
                    // InternalPortugol.g:1094:4: rule__Term__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__Group_1_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getGroup_1_0_2()); 
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
    // $ANTLR end "rule__Term__Alternatives_1_0"


    // $ANTLR start "rule__UnaryExpression__Alternatives"
    // InternalPortugol.g:1102:1: rule__UnaryExpression__Alternatives : ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ( rule__UnaryExpression__Group_1__0 ) ) | ( rulePrimaryExpression ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1106:1: ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ( rule__UnaryExpression__Group_1__0 ) ) | ( rulePrimaryExpression ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt10=1;
                }
                break;
            case 39:
                {
                alt10=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case RULE_FLOAT:
            case 29:
                {
                alt10=3;
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
                    // InternalPortugol.g:1107:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    {
                    // InternalPortugol.g:1107:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    // InternalPortugol.g:1108:3: ( rule__UnaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    }
                    // InternalPortugol.g:1109:3: ( rule__UnaryExpression__Group_0__0 )
                    // InternalPortugol.g:1109:4: rule__UnaryExpression__Group_0__0
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
                    // InternalPortugol.g:1113:2: ( ( rule__UnaryExpression__Group_1__0 ) )
                    {
                    // InternalPortugol.g:1113:2: ( ( rule__UnaryExpression__Group_1__0 ) )
                    // InternalPortugol.g:1114:3: ( rule__UnaryExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getGroup_1()); 
                    }
                    // InternalPortugol.g:1115:3: ( rule__UnaryExpression__Group_1__0 )
                    // InternalPortugol.g:1115:4: rule__UnaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPortugol.g:1119:2: ( rulePrimaryExpression )
                    {
                    // InternalPortugol.g:1119:2: ( rulePrimaryExpression )
                    // InternalPortugol.g:1120:3: rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_2()); 
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


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalPortugol.g:1129:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ruleFunctionCall ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1133:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ruleFunctionCall ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_FLOAT:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==29) ) {
                    alt11=4;
                }
                else if ( (LA11_2==EOF||(LA11_2>=16 && LA11_2<=23)||(LA11_2>=26 && LA11_2<=27)||LA11_2==30||(LA11_2>=38 && LA11_2<=42)||(LA11_2>=44 && LA11_2<=46)) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalPortugol.g:1134:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalPortugol.g:1134:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalPortugol.g:1135:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    }
                    // InternalPortugol.g:1136:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalPortugol.g:1136:4: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:1140:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // InternalPortugol.g:1140:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // InternalPortugol.g:1141:3: ( rule__PrimaryExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    }
                    // InternalPortugol.g:1142:3: ( rule__PrimaryExpression__Group_1__0 )
                    // InternalPortugol.g:1142:4: rule__PrimaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPortugol.g:1146:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // InternalPortugol.g:1146:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // InternalPortugol.g:1147:3: ( rule__PrimaryExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    }
                    // InternalPortugol.g:1148:3: ( rule__PrimaryExpression__Group_2__0 )
                    // InternalPortugol.g:1148:4: rule__PrimaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPortugol.g:1152:2: ( ruleFunctionCall )
                    {
                    // InternalPortugol.g:1152:2: ( ruleFunctionCall )
                    // InternalPortugol.g:1153:3: ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_3()); 
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


    // $ANTLR start "rule__Constant__Alternatives"
    // InternalPortugol.g:1162:1: rule__Constant__Alternatives : ( ( ruleNumericLiteral ) | ( ruleStringExpression ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1166:1: ( ( ruleNumericLiteral ) | ( ruleStringExpression ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_INT && LA12_0<=RULE_FLOAT)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_STRING) ) {
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
                    // InternalPortugol.g:1167:2: ( ruleNumericLiteral )
                    {
                    // InternalPortugol.g:1167:2: ( ruleNumericLiteral )
                    // InternalPortugol.g:1168:3: ruleNumericLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getNumericLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNumericLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getNumericLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:1173:2: ( ruleStringExpression )
                    {
                    // InternalPortugol.g:1173:2: ( ruleStringExpression )
                    // InternalPortugol.g:1174:3: ruleStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getStringExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleStringExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getStringExpressionParserRuleCall_1()); 
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
    // $ANTLR end "rule__Constant__Alternatives"


    // $ANTLR start "rule__NumericLiteral__Alternatives"
    // InternalPortugol.g:1183:1: rule__NumericLiteral__Alternatives : ( ( ( rule__NumericLiteral__IntValueAssignment_0 ) ) | ( ( rule__NumericLiteral__FloatValueAssignment_1 ) ) );
    public final void rule__NumericLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1187:1: ( ( ( rule__NumericLiteral__IntValueAssignment_0 ) ) | ( ( rule__NumericLiteral__FloatValueAssignment_1 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_FLOAT) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalPortugol.g:1188:2: ( ( rule__NumericLiteral__IntValueAssignment_0 ) )
                    {
                    // InternalPortugol.g:1188:2: ( ( rule__NumericLiteral__IntValueAssignment_0 ) )
                    // InternalPortugol.g:1189:3: ( rule__NumericLiteral__IntValueAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericLiteralAccess().getIntValueAssignment_0()); 
                    }
                    // InternalPortugol.g:1190:3: ( rule__NumericLiteral__IntValueAssignment_0 )
                    // InternalPortugol.g:1190:4: rule__NumericLiteral__IntValueAssignment_0
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
                    // InternalPortugol.g:1194:2: ( ( rule__NumericLiteral__FloatValueAssignment_1 ) )
                    {
                    // InternalPortugol.g:1194:2: ( ( rule__NumericLiteral__FloatValueAssignment_1 ) )
                    // InternalPortugol.g:1195:3: ( rule__NumericLiteral__FloatValueAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericLiteralAccess().getFloatValueAssignment_1()); 
                    }
                    // InternalPortugol.g:1196:3: ( rule__NumericLiteral__FloatValueAssignment_1 )
                    // InternalPortugol.g:1196:4: rule__NumericLiteral__FloatValueAssignment_1
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
    // InternalPortugol.g:1204:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1208:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalPortugol.g:1209:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalPortugol.g:1216:1: rule__Model__Group__0__Impl : ( ( rule__Model__HeaderAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1220:1: ( ( ( rule__Model__HeaderAssignment_0 ) ) )
            // InternalPortugol.g:1221:1: ( ( rule__Model__HeaderAssignment_0 ) )
            {
            // InternalPortugol.g:1221:1: ( ( rule__Model__HeaderAssignment_0 ) )
            // InternalPortugol.g:1222:2: ( rule__Model__HeaderAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getHeaderAssignment_0()); 
            }
            // InternalPortugol.g:1223:2: ( rule__Model__HeaderAssignment_0 )
            // InternalPortugol.g:1223:3: rule__Model__HeaderAssignment_0
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
    // InternalPortugol.g:1231:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1235:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalPortugol.g:1236:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalPortugol.g:1243:1: rule__Model__Group__1__Impl : ( ( rule__Model__GlobalDeclarationsAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1247:1: ( ( ( rule__Model__GlobalDeclarationsAssignment_1 ) ) )
            // InternalPortugol.g:1248:1: ( ( rule__Model__GlobalDeclarationsAssignment_1 ) )
            {
            // InternalPortugol.g:1248:1: ( ( rule__Model__GlobalDeclarationsAssignment_1 ) )
            // InternalPortugol.g:1249:2: ( rule__Model__GlobalDeclarationsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGlobalDeclarationsAssignment_1()); 
            }
            // InternalPortugol.g:1250:2: ( rule__Model__GlobalDeclarationsAssignment_1 )
            // InternalPortugol.g:1250:3: rule__Model__GlobalDeclarationsAssignment_1
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
    // InternalPortugol.g:1258:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1262:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalPortugol.g:1263:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalPortugol.g:1270:1: rule__Model__Group__2__Impl : ( ( rule__Model__SubprogramsAssignment_2 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1274:1: ( ( ( rule__Model__SubprogramsAssignment_2 )? ) )
            // InternalPortugol.g:1275:1: ( ( rule__Model__SubprogramsAssignment_2 )? )
            {
            // InternalPortugol.g:1275:1: ( ( rule__Model__SubprogramsAssignment_2 )? )
            // InternalPortugol.g:1276:2: ( rule__Model__SubprogramsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSubprogramsAssignment_2()); 
            }
            // InternalPortugol.g:1277:2: ( rule__Model__SubprogramsAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28||LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPortugol.g:1277:3: rule__Model__SubprogramsAssignment_2
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
    // InternalPortugol.g:1285:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1289:1: ( rule__Model__Group__3__Impl )
            // InternalPortugol.g:1290:2: rule__Model__Group__3__Impl
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
    // InternalPortugol.g:1296:1: rule__Model__Group__3__Impl : ( ( rule__Model__CommandsAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1300:1: ( ( ( rule__Model__CommandsAssignment_3 ) ) )
            // InternalPortugol.g:1301:1: ( ( rule__Model__CommandsAssignment_3 ) )
            {
            // InternalPortugol.g:1301:1: ( ( rule__Model__CommandsAssignment_3 ) )
            // InternalPortugol.g:1302:2: ( rule__Model__CommandsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugol.g:1303:2: ( rule__Model__CommandsAssignment_3 )
            // InternalPortugol.g:1303:3: rule__Model__CommandsAssignment_3
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
    // InternalPortugol.g:1312:1: rule__HeaderBlock__Group__0 : rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1 ;
    public final void rule__HeaderBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1316:1: ( rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1 )
            // InternalPortugol.g:1317:2: rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1
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
    // InternalPortugol.g:1324:1: rule__HeaderBlock__Group__0__Impl : ( 'algoritmo' ) ;
    public final void rule__HeaderBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1328:1: ( ( 'algoritmo' ) )
            // InternalPortugol.g:1329:1: ( 'algoritmo' )
            {
            // InternalPortugol.g:1329:1: ( 'algoritmo' )
            // InternalPortugol.g:1330:2: 'algoritmo'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderBlockAccess().getAlgoritmoKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1339:1: rule__HeaderBlock__Group__1 : rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2 ;
    public final void rule__HeaderBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1343:1: ( rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2 )
            // InternalPortugol.g:1344:2: rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2
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
    // InternalPortugol.g:1351:1: rule__HeaderBlock__Group__1__Impl : ( ( rule__HeaderBlock__NameAssignment_1 ) ) ;
    public final void rule__HeaderBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1355:1: ( ( ( rule__HeaderBlock__NameAssignment_1 ) ) )
            // InternalPortugol.g:1356:1: ( ( rule__HeaderBlock__NameAssignment_1 ) )
            {
            // InternalPortugol.g:1356:1: ( ( rule__HeaderBlock__NameAssignment_1 ) )
            // InternalPortugol.g:1357:2: ( rule__HeaderBlock__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderBlockAccess().getNameAssignment_1()); 
            }
            // InternalPortugol.g:1358:2: ( rule__HeaderBlock__NameAssignment_1 )
            // InternalPortugol.g:1358:3: rule__HeaderBlock__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HeaderBlock__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderBlockAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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
    // InternalPortugol.g:1366:1: rule__HeaderBlock__Group__2 : rule__HeaderBlock__Group__2__Impl ;
    public final void rule__HeaderBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1370:1: ( rule__HeaderBlock__Group__2__Impl )
            // InternalPortugol.g:1371:2: rule__HeaderBlock__Group__2__Impl
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
    // InternalPortugol.g:1377:1: rule__HeaderBlock__Group__2__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__HeaderBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1381:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:1382:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:1382:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:1383:2: RULE_END_COMMAND
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
    // InternalPortugol.g:1393:1: rule__DeclarationsBlock__Group__0 : rule__DeclarationsBlock__Group__0__Impl rule__DeclarationsBlock__Group__1 ;
    public final void rule__DeclarationsBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1397:1: ( rule__DeclarationsBlock__Group__0__Impl rule__DeclarationsBlock__Group__1 )
            // InternalPortugol.g:1398:2: rule__DeclarationsBlock__Group__0__Impl rule__DeclarationsBlock__Group__1
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
    // InternalPortugol.g:1405:1: rule__DeclarationsBlock__Group__0__Impl : ( 'var' ) ;
    public final void rule__DeclarationsBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1409:1: ( ( 'var' ) )
            // InternalPortugol.g:1410:1: ( 'var' )
            {
            // InternalPortugol.g:1410:1: ( 'var' )
            // InternalPortugol.g:1411:2: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getVarKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1420:1: rule__DeclarationsBlock__Group__1 : rule__DeclarationsBlock__Group__1__Impl rule__DeclarationsBlock__Group__2 ;
    public final void rule__DeclarationsBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1424:1: ( rule__DeclarationsBlock__Group__1__Impl rule__DeclarationsBlock__Group__2 )
            // InternalPortugol.g:1425:2: rule__DeclarationsBlock__Group__1__Impl rule__DeclarationsBlock__Group__2
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
    // InternalPortugol.g:1432:1: rule__DeclarationsBlock__Group__1__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__DeclarationsBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1436:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:1437:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:1437:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:1438:2: RULE_END_COMMAND
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
    // InternalPortugol.g:1447:1: rule__DeclarationsBlock__Group__2 : rule__DeclarationsBlock__Group__2__Impl ;
    public final void rule__DeclarationsBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1451:1: ( rule__DeclarationsBlock__Group__2__Impl )
            // InternalPortugol.g:1452:2: rule__DeclarationsBlock__Group__2__Impl
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
    // InternalPortugol.g:1458:1: rule__DeclarationsBlock__Group__2__Impl : ( ( ( rule__DeclarationsBlock__Group_2__0 ) ) ( ( rule__DeclarationsBlock__Group_2__0 )* ) ) ;
    public final void rule__DeclarationsBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1462:1: ( ( ( ( rule__DeclarationsBlock__Group_2__0 ) ) ( ( rule__DeclarationsBlock__Group_2__0 )* ) ) )
            // InternalPortugol.g:1463:1: ( ( ( rule__DeclarationsBlock__Group_2__0 ) ) ( ( rule__DeclarationsBlock__Group_2__0 )* ) )
            {
            // InternalPortugol.g:1463:1: ( ( ( rule__DeclarationsBlock__Group_2__0 ) ) ( ( rule__DeclarationsBlock__Group_2__0 )* ) )
            // InternalPortugol.g:1464:2: ( ( rule__DeclarationsBlock__Group_2__0 ) ) ( ( rule__DeclarationsBlock__Group_2__0 )* )
            {
            // InternalPortugol.g:1464:2: ( ( rule__DeclarationsBlock__Group_2__0 ) )
            // InternalPortugol.g:1465:3: ( rule__DeclarationsBlock__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getGroup_2()); 
            }
            // InternalPortugol.g:1466:3: ( rule__DeclarationsBlock__Group_2__0 )
            // InternalPortugol.g:1466:4: rule__DeclarationsBlock__Group_2__0
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

            // InternalPortugol.g:1469:2: ( ( rule__DeclarationsBlock__Group_2__0 )* )
            // InternalPortugol.g:1470:3: ( rule__DeclarationsBlock__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getGroup_2()); 
            }
            // InternalPortugol.g:1471:3: ( rule__DeclarationsBlock__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPortugol.g:1471:4: rule__DeclarationsBlock__Group_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DeclarationsBlock__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalPortugol.g:1481:1: rule__DeclarationsBlock__Group_2__0 : rule__DeclarationsBlock__Group_2__0__Impl rule__DeclarationsBlock__Group_2__1 ;
    public final void rule__DeclarationsBlock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1485:1: ( rule__DeclarationsBlock__Group_2__0__Impl rule__DeclarationsBlock__Group_2__1 )
            // InternalPortugol.g:1486:2: rule__DeclarationsBlock__Group_2__0__Impl rule__DeclarationsBlock__Group_2__1
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
    // InternalPortugol.g:1493:1: rule__DeclarationsBlock__Group_2__0__Impl : ( ( rule__DeclarationsBlock__VarsAssignment_2_0 ) ) ;
    public final void rule__DeclarationsBlock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1497:1: ( ( ( rule__DeclarationsBlock__VarsAssignment_2_0 ) ) )
            // InternalPortugol.g:1498:1: ( ( rule__DeclarationsBlock__VarsAssignment_2_0 ) )
            {
            // InternalPortugol.g:1498:1: ( ( rule__DeclarationsBlock__VarsAssignment_2_0 ) )
            // InternalPortugol.g:1499:2: ( rule__DeclarationsBlock__VarsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getVarsAssignment_2_0()); 
            }
            // InternalPortugol.g:1500:2: ( rule__DeclarationsBlock__VarsAssignment_2_0 )
            // InternalPortugol.g:1500:3: rule__DeclarationsBlock__VarsAssignment_2_0
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
    // InternalPortugol.g:1508:1: rule__DeclarationsBlock__Group_2__1 : rule__DeclarationsBlock__Group_2__1__Impl ;
    public final void rule__DeclarationsBlock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1512:1: ( rule__DeclarationsBlock__Group_2__1__Impl )
            // InternalPortugol.g:1513:2: rule__DeclarationsBlock__Group_2__1__Impl
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
    // InternalPortugol.g:1519:1: rule__DeclarationsBlock__Group_2__1__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__DeclarationsBlock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1523:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:1524:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:1524:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:1525:2: RULE_END_COMMAND
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
    // InternalPortugol.g:1535:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1539:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalPortugol.g:1540:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalPortugol.g:1547:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__VarDeclarationAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1551:1: ( ( ( rule__Variable__VarDeclarationAssignment_0 ) ) )
            // InternalPortugol.g:1552:1: ( ( rule__Variable__VarDeclarationAssignment_0 ) )
            {
            // InternalPortugol.g:1552:1: ( ( rule__Variable__VarDeclarationAssignment_0 ) )
            // InternalPortugol.g:1553:2: ( rule__Variable__VarDeclarationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getVarDeclarationAssignment_0()); 
            }
            // InternalPortugol.g:1554:2: ( rule__Variable__VarDeclarationAssignment_0 )
            // InternalPortugol.g:1554:3: rule__Variable__VarDeclarationAssignment_0
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
    // InternalPortugol.g:1562:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1566:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalPortugol.g:1567:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
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
    // InternalPortugol.g:1574:1: rule__Variable__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1578:1: ( ( ':' ) )
            // InternalPortugol.g:1579:1: ( ':' )
            {
            // InternalPortugol.g:1579:1: ( ':' )
            // InternalPortugol.g:1580:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getColonKeyword_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1589:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1593:1: ( rule__Variable__Group__2__Impl )
            // InternalPortugol.g:1594:2: rule__Variable__Group__2__Impl
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
    // InternalPortugol.g:1600:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__TypeAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1604:1: ( ( ( rule__Variable__TypeAssignment_2 ) ) )
            // InternalPortugol.g:1605:1: ( ( rule__Variable__TypeAssignment_2 ) )
            {
            // InternalPortugol.g:1605:1: ( ( rule__Variable__TypeAssignment_2 ) )
            // InternalPortugol.g:1606:2: ( rule__Variable__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getTypeAssignment_2()); 
            }
            // InternalPortugol.g:1607:2: ( rule__Variable__TypeAssignment_2 )
            // InternalPortugol.g:1607:3: rule__Variable__TypeAssignment_2
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
    // InternalPortugol.g:1616:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1620:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // InternalPortugol.g:1621:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
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
    // InternalPortugol.g:1628:1: rule__VarDeclaration__Group__0__Impl : ( ( rule__VarDeclaration__VarsAssignment_0 ) ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1632:1: ( ( ( rule__VarDeclaration__VarsAssignment_0 ) ) )
            // InternalPortugol.g:1633:1: ( ( rule__VarDeclaration__VarsAssignment_0 ) )
            {
            // InternalPortugol.g:1633:1: ( ( rule__VarDeclaration__VarsAssignment_0 ) )
            // InternalPortugol.g:1634:2: ( rule__VarDeclaration__VarsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getVarsAssignment_0()); 
            }
            // InternalPortugol.g:1635:2: ( rule__VarDeclaration__VarsAssignment_0 )
            // InternalPortugol.g:1635:3: rule__VarDeclaration__VarsAssignment_0
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
    // InternalPortugol.g:1643:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1647:1: ( rule__VarDeclaration__Group__1__Impl )
            // InternalPortugol.g:1648:2: rule__VarDeclaration__Group__1__Impl
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
    // InternalPortugol.g:1654:1: rule__VarDeclaration__Group__1__Impl : ( ( rule__VarDeclaration__Group_1__0 )* ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1658:1: ( ( ( rule__VarDeclaration__Group_1__0 )* ) )
            // InternalPortugol.g:1659:1: ( ( rule__VarDeclaration__Group_1__0 )* )
            {
            // InternalPortugol.g:1659:1: ( ( rule__VarDeclaration__Group_1__0 )* )
            // InternalPortugol.g:1660:2: ( rule__VarDeclaration__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getGroup_1()); 
            }
            // InternalPortugol.g:1661:2: ( rule__VarDeclaration__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPortugol.g:1661:3: rule__VarDeclaration__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__VarDeclaration__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalPortugol.g:1670:1: rule__VarDeclaration__Group_1__0 : rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1 ;
    public final void rule__VarDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1674:1: ( rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1 )
            // InternalPortugol.g:1675:2: rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1
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
    // InternalPortugol.g:1682:1: rule__VarDeclaration__Group_1__0__Impl : ( ',' ) ;
    public final void rule__VarDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1686:1: ( ( ',' ) )
            // InternalPortugol.g:1687:1: ( ',' )
            {
            // InternalPortugol.g:1687:1: ( ',' )
            // InternalPortugol.g:1688:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getCommaKeyword_1_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1697:1: rule__VarDeclaration__Group_1__1 : rule__VarDeclaration__Group_1__1__Impl ;
    public final void rule__VarDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1701:1: ( rule__VarDeclaration__Group_1__1__Impl )
            // InternalPortugol.g:1702:2: rule__VarDeclaration__Group_1__1__Impl
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
    // InternalPortugol.g:1708:1: rule__VarDeclaration__Group_1__1__Impl : ( ( rule__VarDeclaration__VarsAssignment_1_1 ) ) ;
    public final void rule__VarDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1712:1: ( ( ( rule__VarDeclaration__VarsAssignment_1_1 ) ) )
            // InternalPortugol.g:1713:1: ( ( rule__VarDeclaration__VarsAssignment_1_1 ) )
            {
            // InternalPortugol.g:1713:1: ( ( rule__VarDeclaration__VarsAssignment_1_1 ) )
            // InternalPortugol.g:1714:2: ( rule__VarDeclaration__VarsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getVarsAssignment_1_1()); 
            }
            // InternalPortugol.g:1715:2: ( rule__VarDeclaration__VarsAssignment_1_1 )
            // InternalPortugol.g:1715:3: rule__VarDeclaration__VarsAssignment_1_1
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


    // $ANTLR start "rule__DeclaredVar__Group__0"
    // InternalPortugol.g:1724:1: rule__DeclaredVar__Group__0 : rule__DeclaredVar__Group__0__Impl rule__DeclaredVar__Group__1 ;
    public final void rule__DeclaredVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1728:1: ( rule__DeclaredVar__Group__0__Impl rule__DeclaredVar__Group__1 )
            // InternalPortugol.g:1729:2: rule__DeclaredVar__Group__0__Impl rule__DeclaredVar__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__DeclaredVar__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DeclaredVar__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredVar__Group__0"


    // $ANTLR start "rule__DeclaredVar__Group__0__Impl"
    // InternalPortugol.g:1736:1: rule__DeclaredVar__Group__0__Impl : ( ( rule__DeclaredVar__VarsAssignment_0 ) ) ;
    public final void rule__DeclaredVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1740:1: ( ( ( rule__DeclaredVar__VarsAssignment_0 ) ) )
            // InternalPortugol.g:1741:1: ( ( rule__DeclaredVar__VarsAssignment_0 ) )
            {
            // InternalPortugol.g:1741:1: ( ( rule__DeclaredVar__VarsAssignment_0 ) )
            // InternalPortugol.g:1742:2: ( rule__DeclaredVar__VarsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getVarsAssignment_0()); 
            }
            // InternalPortugol.g:1743:2: ( rule__DeclaredVar__VarsAssignment_0 )
            // InternalPortugol.g:1743:3: rule__DeclaredVar__VarsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredVar__VarsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredVarAccess().getVarsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredVar__Group__0__Impl"


    // $ANTLR start "rule__DeclaredVar__Group__1"
    // InternalPortugol.g:1751:1: rule__DeclaredVar__Group__1 : rule__DeclaredVar__Group__1__Impl ;
    public final void rule__DeclaredVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1755:1: ( rule__DeclaredVar__Group__1__Impl )
            // InternalPortugol.g:1756:2: rule__DeclaredVar__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredVar__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredVar__Group__1"


    // $ANTLR start "rule__DeclaredVar__Group__1__Impl"
    // InternalPortugol.g:1762:1: rule__DeclaredVar__Group__1__Impl : ( ( rule__DeclaredVar__Group_1__0 )* ) ;
    public final void rule__DeclaredVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1766:1: ( ( ( rule__DeclaredVar__Group_1__0 )* ) )
            // InternalPortugol.g:1767:1: ( ( rule__DeclaredVar__Group_1__0 )* )
            {
            // InternalPortugol.g:1767:1: ( ( rule__DeclaredVar__Group_1__0 )* )
            // InternalPortugol.g:1768:2: ( rule__DeclaredVar__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getGroup_1()); 
            }
            // InternalPortugol.g:1769:2: ( rule__DeclaredVar__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPortugol.g:1769:3: rule__DeclaredVar__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__DeclaredVar__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredVarAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredVar__Group__1__Impl"


    // $ANTLR start "rule__DeclaredVar__Group_1__0"
    // InternalPortugol.g:1778:1: rule__DeclaredVar__Group_1__0 : rule__DeclaredVar__Group_1__0__Impl rule__DeclaredVar__Group_1__1 ;
    public final void rule__DeclaredVar__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1782:1: ( rule__DeclaredVar__Group_1__0__Impl rule__DeclaredVar__Group_1__1 )
            // InternalPortugol.g:1783:2: rule__DeclaredVar__Group_1__0__Impl rule__DeclaredVar__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__DeclaredVar__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DeclaredVar__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredVar__Group_1__0"


    // $ANTLR start "rule__DeclaredVar__Group_1__0__Impl"
    // InternalPortugol.g:1790:1: rule__DeclaredVar__Group_1__0__Impl : ( ',' ) ;
    public final void rule__DeclaredVar__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1794:1: ( ( ',' ) )
            // InternalPortugol.g:1795:1: ( ',' )
            {
            // InternalPortugol.g:1795:1: ( ',' )
            // InternalPortugol.g:1796:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getCommaKeyword_1_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredVarAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredVar__Group_1__0__Impl"


    // $ANTLR start "rule__DeclaredVar__Group_1__1"
    // InternalPortugol.g:1805:1: rule__DeclaredVar__Group_1__1 : rule__DeclaredVar__Group_1__1__Impl ;
    public final void rule__DeclaredVar__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1809:1: ( rule__DeclaredVar__Group_1__1__Impl )
            // InternalPortugol.g:1810:2: rule__DeclaredVar__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredVar__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredVar__Group_1__1"


    // $ANTLR start "rule__DeclaredVar__Group_1__1__Impl"
    // InternalPortugol.g:1816:1: rule__DeclaredVar__Group_1__1__Impl : ( ( rule__DeclaredVar__VarsAssignment_1_1 ) ) ;
    public final void rule__DeclaredVar__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1820:1: ( ( ( rule__DeclaredVar__VarsAssignment_1_1 ) ) )
            // InternalPortugol.g:1821:1: ( ( rule__DeclaredVar__VarsAssignment_1_1 ) )
            {
            // InternalPortugol.g:1821:1: ( ( rule__DeclaredVar__VarsAssignment_1_1 ) )
            // InternalPortugol.g:1822:2: ( rule__DeclaredVar__VarsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getVarsAssignment_1_1()); 
            }
            // InternalPortugol.g:1823:2: ( rule__DeclaredVar__VarsAssignment_1_1 )
            // InternalPortugol.g:1823:3: rule__DeclaredVar__VarsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredVar__VarsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredVarAccess().getVarsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredVar__Group_1__1__Impl"


    // $ANTLR start "rule__BlockFunction__Group__0"
    // InternalPortugol.g:1832:1: rule__BlockFunction__Group__0 : rule__BlockFunction__Group__0__Impl rule__BlockFunction__Group__1 ;
    public final void rule__BlockFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1836:1: ( rule__BlockFunction__Group__0__Impl rule__BlockFunction__Group__1 )
            // InternalPortugol.g:1837:2: rule__BlockFunction__Group__0__Impl rule__BlockFunction__Group__1
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
    // InternalPortugol.g:1844:1: rule__BlockFunction__Group__0__Impl : ( 'funcao' ) ;
    public final void rule__BlockFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1848:1: ( ( 'funcao' ) )
            // InternalPortugol.g:1849:1: ( 'funcao' )
            {
            // InternalPortugol.g:1849:1: ( 'funcao' )
            // InternalPortugol.g:1850:2: 'funcao'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getFuncaoKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1859:1: rule__BlockFunction__Group__1 : rule__BlockFunction__Group__1__Impl rule__BlockFunction__Group__2 ;
    public final void rule__BlockFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1863:1: ( rule__BlockFunction__Group__1__Impl rule__BlockFunction__Group__2 )
            // InternalPortugol.g:1864:2: rule__BlockFunction__Group__1__Impl rule__BlockFunction__Group__2
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
    // InternalPortugol.g:1871:1: rule__BlockFunction__Group__1__Impl : ( ( rule__BlockFunction__FunctionNameAssignment_1 ) ) ;
    public final void rule__BlockFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1875:1: ( ( ( rule__BlockFunction__FunctionNameAssignment_1 ) ) )
            // InternalPortugol.g:1876:1: ( ( rule__BlockFunction__FunctionNameAssignment_1 ) )
            {
            // InternalPortugol.g:1876:1: ( ( rule__BlockFunction__FunctionNameAssignment_1 ) )
            // InternalPortugol.g:1877:2: ( rule__BlockFunction__FunctionNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getFunctionNameAssignment_1()); 
            }
            // InternalPortugol.g:1878:2: ( rule__BlockFunction__FunctionNameAssignment_1 )
            // InternalPortugol.g:1878:3: rule__BlockFunction__FunctionNameAssignment_1
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
    // InternalPortugol.g:1886:1: rule__BlockFunction__Group__2 : rule__BlockFunction__Group__2__Impl rule__BlockFunction__Group__3 ;
    public final void rule__BlockFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1890:1: ( rule__BlockFunction__Group__2__Impl rule__BlockFunction__Group__3 )
            // InternalPortugol.g:1891:2: rule__BlockFunction__Group__2__Impl rule__BlockFunction__Group__3
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
    // InternalPortugol.g:1898:1: rule__BlockFunction__Group__2__Impl : ( '(' ) ;
    public final void rule__BlockFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1902:1: ( ( '(' ) )
            // InternalPortugol.g:1903:1: ( '(' )
            {
            // InternalPortugol.g:1903:1: ( '(' )
            // InternalPortugol.g:1904:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1913:1: rule__BlockFunction__Group__3 : rule__BlockFunction__Group__3__Impl rule__BlockFunction__Group__4 ;
    public final void rule__BlockFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1917:1: ( rule__BlockFunction__Group__3__Impl rule__BlockFunction__Group__4 )
            // InternalPortugol.g:1918:2: rule__BlockFunction__Group__3__Impl rule__BlockFunction__Group__4
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
    // InternalPortugol.g:1925:1: rule__BlockFunction__Group__3__Impl : ( ( rule__BlockFunction__ParamListAssignment_3 ) ) ;
    public final void rule__BlockFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1929:1: ( ( ( rule__BlockFunction__ParamListAssignment_3 ) ) )
            // InternalPortugol.g:1930:1: ( ( rule__BlockFunction__ParamListAssignment_3 ) )
            {
            // InternalPortugol.g:1930:1: ( ( rule__BlockFunction__ParamListAssignment_3 ) )
            // InternalPortugol.g:1931:2: ( rule__BlockFunction__ParamListAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getParamListAssignment_3()); 
            }
            // InternalPortugol.g:1932:2: ( rule__BlockFunction__ParamListAssignment_3 )
            // InternalPortugol.g:1932:3: rule__BlockFunction__ParamListAssignment_3
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
    // InternalPortugol.g:1940:1: rule__BlockFunction__Group__4 : rule__BlockFunction__Group__4__Impl rule__BlockFunction__Group__5 ;
    public final void rule__BlockFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1944:1: ( rule__BlockFunction__Group__4__Impl rule__BlockFunction__Group__5 )
            // InternalPortugol.g:1945:2: rule__BlockFunction__Group__4__Impl rule__BlockFunction__Group__5
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
    // InternalPortugol.g:1952:1: rule__BlockFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__BlockFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1956:1: ( ( ')' ) )
            // InternalPortugol.g:1957:1: ( ')' )
            {
            // InternalPortugol.g:1957:1: ( ')' )
            // InternalPortugol.g:1958:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1967:1: rule__BlockFunction__Group__5 : rule__BlockFunction__Group__5__Impl rule__BlockFunction__Group__6 ;
    public final void rule__BlockFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1971:1: ( rule__BlockFunction__Group__5__Impl rule__BlockFunction__Group__6 )
            // InternalPortugol.g:1972:2: rule__BlockFunction__Group__5__Impl rule__BlockFunction__Group__6
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
    // InternalPortugol.g:1979:1: rule__BlockFunction__Group__5__Impl : ( ':' ) ;
    public final void rule__BlockFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1983:1: ( ( ':' ) )
            // InternalPortugol.g:1984:1: ( ':' )
            {
            // InternalPortugol.g:1984:1: ( ':' )
            // InternalPortugol.g:1985:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getColonKeyword_5()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1994:1: rule__BlockFunction__Group__6 : rule__BlockFunction__Group__6__Impl rule__BlockFunction__Group__7 ;
    public final void rule__BlockFunction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1998:1: ( rule__BlockFunction__Group__6__Impl rule__BlockFunction__Group__7 )
            // InternalPortugol.g:1999:2: rule__BlockFunction__Group__6__Impl rule__BlockFunction__Group__7
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
    // InternalPortugol.g:2006:1: rule__BlockFunction__Group__6__Impl : ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) ) ;
    public final void rule__BlockFunction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2010:1: ( ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) ) )
            // InternalPortugol.g:2011:1: ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) )
            {
            // InternalPortugol.g:2011:1: ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) )
            // InternalPortugol.g:2012:2: ( rule__BlockFunction__ReturnTypeAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getReturnTypeAssignment_6()); 
            }
            // InternalPortugol.g:2013:2: ( rule__BlockFunction__ReturnTypeAssignment_6 )
            // InternalPortugol.g:2013:3: rule__BlockFunction__ReturnTypeAssignment_6
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
    // InternalPortugol.g:2021:1: rule__BlockFunction__Group__7 : rule__BlockFunction__Group__7__Impl rule__BlockFunction__Group__8 ;
    public final void rule__BlockFunction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2025:1: ( rule__BlockFunction__Group__7__Impl rule__BlockFunction__Group__8 )
            // InternalPortugol.g:2026:2: rule__BlockFunction__Group__7__Impl rule__BlockFunction__Group__8
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
    // InternalPortugol.g:2033:1: rule__BlockFunction__Group__7__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__BlockFunction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2037:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2038:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2038:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2039:2: RULE_END_COMMAND
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
    // InternalPortugol.g:2048:1: rule__BlockFunction__Group__8 : rule__BlockFunction__Group__8__Impl rule__BlockFunction__Group__9 ;
    public final void rule__BlockFunction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2052:1: ( rule__BlockFunction__Group__8__Impl rule__BlockFunction__Group__9 )
            // InternalPortugol.g:2053:2: rule__BlockFunction__Group__8__Impl rule__BlockFunction__Group__9
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
    // InternalPortugol.g:2060:1: rule__BlockFunction__Group__8__Impl : ( ( rule__BlockFunction__DeclarationsAssignment_8 )? ) ;
    public final void rule__BlockFunction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2064:1: ( ( ( rule__BlockFunction__DeclarationsAssignment_8 )? ) )
            // InternalPortugol.g:2065:1: ( ( rule__BlockFunction__DeclarationsAssignment_8 )? )
            {
            // InternalPortugol.g:2065:1: ( ( rule__BlockFunction__DeclarationsAssignment_8 )? )
            // InternalPortugol.g:2066:2: ( rule__BlockFunction__DeclarationsAssignment_8 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getDeclarationsAssignment_8()); 
            }
            // InternalPortugol.g:2067:2: ( rule__BlockFunction__DeclarationsAssignment_8 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPortugol.g:2067:3: rule__BlockFunction__DeclarationsAssignment_8
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
    // InternalPortugol.g:2075:1: rule__BlockFunction__Group__9 : rule__BlockFunction__Group__9__Impl rule__BlockFunction__Group__10 ;
    public final void rule__BlockFunction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2079:1: ( rule__BlockFunction__Group__9__Impl rule__BlockFunction__Group__10 )
            // InternalPortugol.g:2080:2: rule__BlockFunction__Group__9__Impl rule__BlockFunction__Group__10
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
    // InternalPortugol.g:2087:1: rule__BlockFunction__Group__9__Impl : ( 'inicio' ) ;
    public final void rule__BlockFunction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2091:1: ( ( 'inicio' ) )
            // InternalPortugol.g:2092:1: ( 'inicio' )
            {
            // InternalPortugol.g:2092:1: ( 'inicio' )
            // InternalPortugol.g:2093:2: 'inicio'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getInicioKeyword_9()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2102:1: rule__BlockFunction__Group__10 : rule__BlockFunction__Group__10__Impl rule__BlockFunction__Group__11 ;
    public final void rule__BlockFunction__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2106:1: ( rule__BlockFunction__Group__10__Impl rule__BlockFunction__Group__11 )
            // InternalPortugol.g:2107:2: rule__BlockFunction__Group__10__Impl rule__BlockFunction__Group__11
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
    // InternalPortugol.g:2114:1: rule__BlockFunction__Group__10__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__BlockFunction__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2118:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2119:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2119:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2120:2: RULE_END_COMMAND
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
    // InternalPortugol.g:2129:1: rule__BlockFunction__Group__11 : rule__BlockFunction__Group__11__Impl rule__BlockFunction__Group__12 ;
    public final void rule__BlockFunction__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2133:1: ( rule__BlockFunction__Group__11__Impl rule__BlockFunction__Group__12 )
            // InternalPortugol.g:2134:2: rule__BlockFunction__Group__11__Impl rule__BlockFunction__Group__12
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
    // InternalPortugol.g:2141:1: rule__BlockFunction__Group__11__Impl : ( ( ( rule__BlockFunction__CommandsAssignment_11 ) ) ( ( rule__BlockFunction__CommandsAssignment_11 )* ) ) ;
    public final void rule__BlockFunction__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2145:1: ( ( ( ( rule__BlockFunction__CommandsAssignment_11 ) ) ( ( rule__BlockFunction__CommandsAssignment_11 )* ) ) )
            // InternalPortugol.g:2146:1: ( ( ( rule__BlockFunction__CommandsAssignment_11 ) ) ( ( rule__BlockFunction__CommandsAssignment_11 )* ) )
            {
            // InternalPortugol.g:2146:1: ( ( ( rule__BlockFunction__CommandsAssignment_11 ) ) ( ( rule__BlockFunction__CommandsAssignment_11 )* ) )
            // InternalPortugol.g:2147:2: ( ( rule__BlockFunction__CommandsAssignment_11 ) ) ( ( rule__BlockFunction__CommandsAssignment_11 )* )
            {
            // InternalPortugol.g:2147:2: ( ( rule__BlockFunction__CommandsAssignment_11 ) )
            // InternalPortugol.g:2148:3: ( rule__BlockFunction__CommandsAssignment_11 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getCommandsAssignment_11()); 
            }
            // InternalPortugol.g:2149:3: ( rule__BlockFunction__CommandsAssignment_11 )
            // InternalPortugol.g:2149:4: rule__BlockFunction__CommandsAssignment_11
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

            // InternalPortugol.g:2152:2: ( ( rule__BlockFunction__CommandsAssignment_11 )* )
            // InternalPortugol.g:2153:3: ( rule__BlockFunction__CommandsAssignment_11 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getCommandsAssignment_11()); 
            }
            // InternalPortugol.g:2154:3: ( rule__BlockFunction__CommandsAssignment_11 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=36 && LA19_0<=37)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPortugol.g:2154:4: rule__BlockFunction__CommandsAssignment_11
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__BlockFunction__CommandsAssignment_11();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalPortugol.g:2163:1: rule__BlockFunction__Group__12 : rule__BlockFunction__Group__12__Impl rule__BlockFunction__Group__13 ;
    public final void rule__BlockFunction__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2167:1: ( rule__BlockFunction__Group__12__Impl rule__BlockFunction__Group__13 )
            // InternalPortugol.g:2168:2: rule__BlockFunction__Group__12__Impl rule__BlockFunction__Group__13
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
    // InternalPortugol.g:2175:1: rule__BlockFunction__Group__12__Impl : ( 'fimfuncao' ) ;
    public final void rule__BlockFunction__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2179:1: ( ( 'fimfuncao' ) )
            // InternalPortugol.g:2180:1: ( 'fimfuncao' )
            {
            // InternalPortugol.g:2180:1: ( 'fimfuncao' )
            // InternalPortugol.g:2181:2: 'fimfuncao'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getFimfuncaoKeyword_12()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2190:1: rule__BlockFunction__Group__13 : rule__BlockFunction__Group__13__Impl ;
    public final void rule__BlockFunction__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2194:1: ( rule__BlockFunction__Group__13__Impl )
            // InternalPortugol.g:2195:2: rule__BlockFunction__Group__13__Impl
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
    // InternalPortugol.g:2201:1: rule__BlockFunction__Group__13__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__BlockFunction__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2205:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2206:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2206:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2207:2: RULE_END_COMMAND
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
    // InternalPortugol.g:2217:1: rule__BlockProcedure__Group__0 : rule__BlockProcedure__Group__0__Impl rule__BlockProcedure__Group__1 ;
    public final void rule__BlockProcedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2221:1: ( rule__BlockProcedure__Group__0__Impl rule__BlockProcedure__Group__1 )
            // InternalPortugol.g:2222:2: rule__BlockProcedure__Group__0__Impl rule__BlockProcedure__Group__1
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
    // InternalPortugol.g:2229:1: rule__BlockProcedure__Group__0__Impl : ( 'procedimento' ) ;
    public final void rule__BlockProcedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2233:1: ( ( 'procedimento' ) )
            // InternalPortugol.g:2234:1: ( 'procedimento' )
            {
            // InternalPortugol.g:2234:1: ( 'procedimento' )
            // InternalPortugol.g:2235:2: 'procedimento'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getProcedimentoKeyword_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2244:1: rule__BlockProcedure__Group__1 : rule__BlockProcedure__Group__1__Impl rule__BlockProcedure__Group__2 ;
    public final void rule__BlockProcedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2248:1: ( rule__BlockProcedure__Group__1__Impl rule__BlockProcedure__Group__2 )
            // InternalPortugol.g:2249:2: rule__BlockProcedure__Group__1__Impl rule__BlockProcedure__Group__2
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
    // InternalPortugol.g:2256:1: rule__BlockProcedure__Group__1__Impl : ( ( rule__BlockProcedure__ProcedureAssignment_1 ) ) ;
    public final void rule__BlockProcedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2260:1: ( ( ( rule__BlockProcedure__ProcedureAssignment_1 ) ) )
            // InternalPortugol.g:2261:1: ( ( rule__BlockProcedure__ProcedureAssignment_1 ) )
            {
            // InternalPortugol.g:2261:1: ( ( rule__BlockProcedure__ProcedureAssignment_1 ) )
            // InternalPortugol.g:2262:2: ( rule__BlockProcedure__ProcedureAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getProcedureAssignment_1()); 
            }
            // InternalPortugol.g:2263:2: ( rule__BlockProcedure__ProcedureAssignment_1 )
            // InternalPortugol.g:2263:3: rule__BlockProcedure__ProcedureAssignment_1
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
    // InternalPortugol.g:2271:1: rule__BlockProcedure__Group__2 : rule__BlockProcedure__Group__2__Impl rule__BlockProcedure__Group__3 ;
    public final void rule__BlockProcedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2275:1: ( rule__BlockProcedure__Group__2__Impl rule__BlockProcedure__Group__3 )
            // InternalPortugol.g:2276:2: rule__BlockProcedure__Group__2__Impl rule__BlockProcedure__Group__3
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
    // InternalPortugol.g:2283:1: rule__BlockProcedure__Group__2__Impl : ( '(' ) ;
    public final void rule__BlockProcedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2287:1: ( ( '(' ) )
            // InternalPortugol.g:2288:1: ( '(' )
            {
            // InternalPortugol.g:2288:1: ( '(' )
            // InternalPortugol.g:2289:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2298:1: rule__BlockProcedure__Group__3 : rule__BlockProcedure__Group__3__Impl rule__BlockProcedure__Group__4 ;
    public final void rule__BlockProcedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2302:1: ( rule__BlockProcedure__Group__3__Impl rule__BlockProcedure__Group__4 )
            // InternalPortugol.g:2303:2: rule__BlockProcedure__Group__3__Impl rule__BlockProcedure__Group__4
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
    // InternalPortugol.g:2310:1: rule__BlockProcedure__Group__3__Impl : ( ( rule__BlockProcedure__ParamListAssignment_3 ) ) ;
    public final void rule__BlockProcedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2314:1: ( ( ( rule__BlockProcedure__ParamListAssignment_3 ) ) )
            // InternalPortugol.g:2315:1: ( ( rule__BlockProcedure__ParamListAssignment_3 ) )
            {
            // InternalPortugol.g:2315:1: ( ( rule__BlockProcedure__ParamListAssignment_3 ) )
            // InternalPortugol.g:2316:2: ( rule__BlockProcedure__ParamListAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getParamListAssignment_3()); 
            }
            // InternalPortugol.g:2317:2: ( rule__BlockProcedure__ParamListAssignment_3 )
            // InternalPortugol.g:2317:3: rule__BlockProcedure__ParamListAssignment_3
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
    // InternalPortugol.g:2325:1: rule__BlockProcedure__Group__4 : rule__BlockProcedure__Group__4__Impl rule__BlockProcedure__Group__5 ;
    public final void rule__BlockProcedure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2329:1: ( rule__BlockProcedure__Group__4__Impl rule__BlockProcedure__Group__5 )
            // InternalPortugol.g:2330:2: rule__BlockProcedure__Group__4__Impl rule__BlockProcedure__Group__5
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
    // InternalPortugol.g:2337:1: rule__BlockProcedure__Group__4__Impl : ( ')' ) ;
    public final void rule__BlockProcedure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2341:1: ( ( ')' ) )
            // InternalPortugol.g:2342:1: ( ')' )
            {
            // InternalPortugol.g:2342:1: ( ')' )
            // InternalPortugol.g:2343:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2352:1: rule__BlockProcedure__Group__5 : rule__BlockProcedure__Group__5__Impl rule__BlockProcedure__Group__6 ;
    public final void rule__BlockProcedure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2356:1: ( rule__BlockProcedure__Group__5__Impl rule__BlockProcedure__Group__6 )
            // InternalPortugol.g:2357:2: rule__BlockProcedure__Group__5__Impl rule__BlockProcedure__Group__6
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
    // InternalPortugol.g:2364:1: rule__BlockProcedure__Group__5__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__BlockProcedure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2368:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2369:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2369:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2370:2: RULE_END_COMMAND
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
    // InternalPortugol.g:2379:1: rule__BlockProcedure__Group__6 : rule__BlockProcedure__Group__6__Impl rule__BlockProcedure__Group__7 ;
    public final void rule__BlockProcedure__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2383:1: ( rule__BlockProcedure__Group__6__Impl rule__BlockProcedure__Group__7 )
            // InternalPortugol.g:2384:2: rule__BlockProcedure__Group__6__Impl rule__BlockProcedure__Group__7
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
    // InternalPortugol.g:2391:1: rule__BlockProcedure__Group__6__Impl : ( ( rule__BlockProcedure__DeclarationsAssignment_6 )? ) ;
    public final void rule__BlockProcedure__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2395:1: ( ( ( rule__BlockProcedure__DeclarationsAssignment_6 )? ) )
            // InternalPortugol.g:2396:1: ( ( rule__BlockProcedure__DeclarationsAssignment_6 )? )
            {
            // InternalPortugol.g:2396:1: ( ( rule__BlockProcedure__DeclarationsAssignment_6 )? )
            // InternalPortugol.g:2397:2: ( rule__BlockProcedure__DeclarationsAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getDeclarationsAssignment_6()); 
            }
            // InternalPortugol.g:2398:2: ( rule__BlockProcedure__DeclarationsAssignment_6 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPortugol.g:2398:3: rule__BlockProcedure__DeclarationsAssignment_6
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
    // InternalPortugol.g:2406:1: rule__BlockProcedure__Group__7 : rule__BlockProcedure__Group__7__Impl rule__BlockProcedure__Group__8 ;
    public final void rule__BlockProcedure__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2410:1: ( rule__BlockProcedure__Group__7__Impl rule__BlockProcedure__Group__8 )
            // InternalPortugol.g:2411:2: rule__BlockProcedure__Group__7__Impl rule__BlockProcedure__Group__8
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
    // InternalPortugol.g:2418:1: rule__BlockProcedure__Group__7__Impl : ( 'inicio' ) ;
    public final void rule__BlockProcedure__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2422:1: ( ( 'inicio' ) )
            // InternalPortugol.g:2423:1: ( 'inicio' )
            {
            // InternalPortugol.g:2423:1: ( 'inicio' )
            // InternalPortugol.g:2424:2: 'inicio'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getInicioKeyword_7()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2433:1: rule__BlockProcedure__Group__8 : rule__BlockProcedure__Group__8__Impl rule__BlockProcedure__Group__9 ;
    public final void rule__BlockProcedure__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2437:1: ( rule__BlockProcedure__Group__8__Impl rule__BlockProcedure__Group__9 )
            // InternalPortugol.g:2438:2: rule__BlockProcedure__Group__8__Impl rule__BlockProcedure__Group__9
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
    // InternalPortugol.g:2445:1: rule__BlockProcedure__Group__8__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__BlockProcedure__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2449:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2450:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2450:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2451:2: RULE_END_COMMAND
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
    // InternalPortugol.g:2460:1: rule__BlockProcedure__Group__9 : rule__BlockProcedure__Group__9__Impl rule__BlockProcedure__Group__10 ;
    public final void rule__BlockProcedure__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2464:1: ( rule__BlockProcedure__Group__9__Impl rule__BlockProcedure__Group__10 )
            // InternalPortugol.g:2465:2: rule__BlockProcedure__Group__9__Impl rule__BlockProcedure__Group__10
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
    // InternalPortugol.g:2472:1: rule__BlockProcedure__Group__9__Impl : ( ( ( rule__BlockProcedure__CommandsAssignment_9 ) ) ( ( rule__BlockProcedure__CommandsAssignment_9 )* ) ) ;
    public final void rule__BlockProcedure__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2476:1: ( ( ( ( rule__BlockProcedure__CommandsAssignment_9 ) ) ( ( rule__BlockProcedure__CommandsAssignment_9 )* ) ) )
            // InternalPortugol.g:2477:1: ( ( ( rule__BlockProcedure__CommandsAssignment_9 ) ) ( ( rule__BlockProcedure__CommandsAssignment_9 )* ) )
            {
            // InternalPortugol.g:2477:1: ( ( ( rule__BlockProcedure__CommandsAssignment_9 ) ) ( ( rule__BlockProcedure__CommandsAssignment_9 )* ) )
            // InternalPortugol.g:2478:2: ( ( rule__BlockProcedure__CommandsAssignment_9 ) ) ( ( rule__BlockProcedure__CommandsAssignment_9 )* )
            {
            // InternalPortugol.g:2478:2: ( ( rule__BlockProcedure__CommandsAssignment_9 ) )
            // InternalPortugol.g:2479:3: ( rule__BlockProcedure__CommandsAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getCommandsAssignment_9()); 
            }
            // InternalPortugol.g:2480:3: ( rule__BlockProcedure__CommandsAssignment_9 )
            // InternalPortugol.g:2480:4: rule__BlockProcedure__CommandsAssignment_9
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

            // InternalPortugol.g:2483:2: ( ( rule__BlockProcedure__CommandsAssignment_9 )* )
            // InternalPortugol.g:2484:3: ( rule__BlockProcedure__CommandsAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getCommandsAssignment_9()); 
            }
            // InternalPortugol.g:2485:3: ( rule__BlockProcedure__CommandsAssignment_9 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=36 && LA21_0<=37)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPortugol.g:2485:4: rule__BlockProcedure__CommandsAssignment_9
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__BlockProcedure__CommandsAssignment_9();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalPortugol.g:2494:1: rule__BlockProcedure__Group__10 : rule__BlockProcedure__Group__10__Impl rule__BlockProcedure__Group__11 ;
    public final void rule__BlockProcedure__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2498:1: ( rule__BlockProcedure__Group__10__Impl rule__BlockProcedure__Group__11 )
            // InternalPortugol.g:2499:2: rule__BlockProcedure__Group__10__Impl rule__BlockProcedure__Group__11
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
    // InternalPortugol.g:2506:1: rule__BlockProcedure__Group__10__Impl : ( 'fimprocedimento' ) ;
    public final void rule__BlockProcedure__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2510:1: ( ( 'fimprocedimento' ) )
            // InternalPortugol.g:2511:1: ( 'fimprocedimento' )
            {
            // InternalPortugol.g:2511:1: ( 'fimprocedimento' )
            // InternalPortugol.g:2512:2: 'fimprocedimento'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getFimprocedimentoKeyword_10()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2521:1: rule__BlockProcedure__Group__11 : rule__BlockProcedure__Group__11__Impl ;
    public final void rule__BlockProcedure__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2525:1: ( rule__BlockProcedure__Group__11__Impl )
            // InternalPortugol.g:2526:2: rule__BlockProcedure__Group__11__Impl
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
    // InternalPortugol.g:2532:1: rule__BlockProcedure__Group__11__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__BlockProcedure__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2536:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2537:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2537:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2538:2: RULE_END_COMMAND
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
    // InternalPortugol.g:2548:1: rule__BlockCommand__Group__0 : rule__BlockCommand__Group__0__Impl rule__BlockCommand__Group__1 ;
    public final void rule__BlockCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2552:1: ( rule__BlockCommand__Group__0__Impl rule__BlockCommand__Group__1 )
            // InternalPortugol.g:2553:2: rule__BlockCommand__Group__0__Impl rule__BlockCommand__Group__1
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
    // InternalPortugol.g:2560:1: rule__BlockCommand__Group__0__Impl : ( 'inicio' ) ;
    public final void rule__BlockCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2564:1: ( ( 'inicio' ) )
            // InternalPortugol.g:2565:1: ( 'inicio' )
            {
            // InternalPortugol.g:2565:1: ( 'inicio' )
            // InternalPortugol.g:2566:2: 'inicio'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getInicioKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2575:1: rule__BlockCommand__Group__1 : rule__BlockCommand__Group__1__Impl rule__BlockCommand__Group__2 ;
    public final void rule__BlockCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2579:1: ( rule__BlockCommand__Group__1__Impl rule__BlockCommand__Group__2 )
            // InternalPortugol.g:2580:2: rule__BlockCommand__Group__1__Impl rule__BlockCommand__Group__2
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
    // InternalPortugol.g:2587:1: rule__BlockCommand__Group__1__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__BlockCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2591:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2592:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2592:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2593:2: RULE_END_COMMAND
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
    // InternalPortugol.g:2602:1: rule__BlockCommand__Group__2 : rule__BlockCommand__Group__2__Impl rule__BlockCommand__Group__3 ;
    public final void rule__BlockCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2606:1: ( rule__BlockCommand__Group__2__Impl rule__BlockCommand__Group__3 )
            // InternalPortugol.g:2607:2: rule__BlockCommand__Group__2__Impl rule__BlockCommand__Group__3
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
    // InternalPortugol.g:2614:1: rule__BlockCommand__Group__2__Impl : ( ( ( rule__BlockCommand__CommandsAssignment_2 ) ) ( ( rule__BlockCommand__CommandsAssignment_2 )* ) ) ;
    public final void rule__BlockCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2618:1: ( ( ( ( rule__BlockCommand__CommandsAssignment_2 ) ) ( ( rule__BlockCommand__CommandsAssignment_2 )* ) ) )
            // InternalPortugol.g:2619:1: ( ( ( rule__BlockCommand__CommandsAssignment_2 ) ) ( ( rule__BlockCommand__CommandsAssignment_2 )* ) )
            {
            // InternalPortugol.g:2619:1: ( ( ( rule__BlockCommand__CommandsAssignment_2 ) ) ( ( rule__BlockCommand__CommandsAssignment_2 )* ) )
            // InternalPortugol.g:2620:2: ( ( rule__BlockCommand__CommandsAssignment_2 ) ) ( ( rule__BlockCommand__CommandsAssignment_2 )* )
            {
            // InternalPortugol.g:2620:2: ( ( rule__BlockCommand__CommandsAssignment_2 ) )
            // InternalPortugol.g:2621:3: ( rule__BlockCommand__CommandsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getCommandsAssignment_2()); 
            }
            // InternalPortugol.g:2622:3: ( rule__BlockCommand__CommandsAssignment_2 )
            // InternalPortugol.g:2622:4: rule__BlockCommand__CommandsAssignment_2
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

            // InternalPortugol.g:2625:2: ( ( rule__BlockCommand__CommandsAssignment_2 )* )
            // InternalPortugol.g:2626:3: ( rule__BlockCommand__CommandsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getCommandsAssignment_2()); 
            }
            // InternalPortugol.g:2627:3: ( rule__BlockCommand__CommandsAssignment_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=36 && LA22_0<=37)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPortugol.g:2627:4: rule__BlockCommand__CommandsAssignment_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__BlockCommand__CommandsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalPortugol.g:2636:1: rule__BlockCommand__Group__3 : rule__BlockCommand__Group__3__Impl rule__BlockCommand__Group__4 ;
    public final void rule__BlockCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2640:1: ( rule__BlockCommand__Group__3__Impl rule__BlockCommand__Group__4 )
            // InternalPortugol.g:2641:2: rule__BlockCommand__Group__3__Impl rule__BlockCommand__Group__4
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
    // InternalPortugol.g:2648:1: rule__BlockCommand__Group__3__Impl : ( 'fimalgoritmo' ) ;
    public final void rule__BlockCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2652:1: ( ( 'fimalgoritmo' ) )
            // InternalPortugol.g:2653:1: ( 'fimalgoritmo' )
            {
            // InternalPortugol.g:2653:1: ( 'fimalgoritmo' )
            // InternalPortugol.g:2654:2: 'fimalgoritmo'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getFimalgoritmoKeyword_3()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2663:1: rule__BlockCommand__Group__4 : rule__BlockCommand__Group__4__Impl ;
    public final void rule__BlockCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2667:1: ( rule__BlockCommand__Group__4__Impl )
            // InternalPortugol.g:2668:2: rule__BlockCommand__Group__4__Impl
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
    // InternalPortugol.g:2674:1: rule__BlockCommand__Group__4__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__BlockCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2678:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2679:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2679:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2680:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getEND_COMMANDTerminalRuleCall_4()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__ReadCommand__Group__0"
    // InternalPortugol.g:2690:1: rule__ReadCommand__Group__0 : rule__ReadCommand__Group__0__Impl rule__ReadCommand__Group__1 ;
    public final void rule__ReadCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2694:1: ( rule__ReadCommand__Group__0__Impl rule__ReadCommand__Group__1 )
            // InternalPortugol.g:2695:2: rule__ReadCommand__Group__0__Impl rule__ReadCommand__Group__1
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
    // InternalPortugol.g:2702:1: rule__ReadCommand__Group__0__Impl : ( 'leia' ) ;
    public final void rule__ReadCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2706:1: ( ( 'leia' ) )
            // InternalPortugol.g:2707:1: ( 'leia' )
            {
            // InternalPortugol.g:2707:1: ( 'leia' )
            // InternalPortugol.g:2708:2: 'leia'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getLeiaKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2717:1: rule__ReadCommand__Group__1 : rule__ReadCommand__Group__1__Impl rule__ReadCommand__Group__2 ;
    public final void rule__ReadCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2721:1: ( rule__ReadCommand__Group__1__Impl rule__ReadCommand__Group__2 )
            // InternalPortugol.g:2722:2: rule__ReadCommand__Group__1__Impl rule__ReadCommand__Group__2
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
    // InternalPortugol.g:2729:1: rule__ReadCommand__Group__1__Impl : ( '(' ) ;
    public final void rule__ReadCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2733:1: ( ( '(' ) )
            // InternalPortugol.g:2734:1: ( '(' )
            {
            // InternalPortugol.g:2734:1: ( '(' )
            // InternalPortugol.g:2735:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2744:1: rule__ReadCommand__Group__2 : rule__ReadCommand__Group__2__Impl rule__ReadCommand__Group__3 ;
    public final void rule__ReadCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2748:1: ( rule__ReadCommand__Group__2__Impl rule__ReadCommand__Group__3 )
            // InternalPortugol.g:2749:2: rule__ReadCommand__Group__2__Impl rule__ReadCommand__Group__3
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
    // InternalPortugol.g:2756:1: rule__ReadCommand__Group__2__Impl : ( ( rule__ReadCommand__ParamListAssignment_2 ) ) ;
    public final void rule__ReadCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2760:1: ( ( ( rule__ReadCommand__ParamListAssignment_2 ) ) )
            // InternalPortugol.g:2761:1: ( ( rule__ReadCommand__ParamListAssignment_2 ) )
            {
            // InternalPortugol.g:2761:1: ( ( rule__ReadCommand__ParamListAssignment_2 ) )
            // InternalPortugol.g:2762:2: ( rule__ReadCommand__ParamListAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getParamListAssignment_2()); 
            }
            // InternalPortugol.g:2763:2: ( rule__ReadCommand__ParamListAssignment_2 )
            // InternalPortugol.g:2763:3: rule__ReadCommand__ParamListAssignment_2
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
    // InternalPortugol.g:2771:1: rule__ReadCommand__Group__3 : rule__ReadCommand__Group__3__Impl rule__ReadCommand__Group__4 ;
    public final void rule__ReadCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2775:1: ( rule__ReadCommand__Group__3__Impl rule__ReadCommand__Group__4 )
            // InternalPortugol.g:2776:2: rule__ReadCommand__Group__3__Impl rule__ReadCommand__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ReadCommand__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReadCommand__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPortugol.g:2783:1: rule__ReadCommand__Group__3__Impl : ( ')' ) ;
    public final void rule__ReadCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2787:1: ( ( ')' ) )
            // InternalPortugol.g:2788:1: ( ')' )
            {
            // InternalPortugol.g:2788:1: ( ')' )
            // InternalPortugol.g:2789:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__ReadCommand__Group__4"
    // InternalPortugol.g:2798:1: rule__ReadCommand__Group__4 : rule__ReadCommand__Group__4__Impl ;
    public final void rule__ReadCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2802:1: ( rule__ReadCommand__Group__4__Impl )
            // InternalPortugol.g:2803:2: rule__ReadCommand__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReadCommand__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadCommand__Group__4"


    // $ANTLR start "rule__ReadCommand__Group__4__Impl"
    // InternalPortugol.g:2809:1: rule__ReadCommand__Group__4__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__ReadCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2813:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2814:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2814:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2815:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getEND_COMMANDTerminalRuleCall_4()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReadCommandAccess().getEND_COMMANDTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadCommand__Group__4__Impl"


    // $ANTLR start "rule__WriteCommand__Group__0"
    // InternalPortugol.g:2825:1: rule__WriteCommand__Group__0 : rule__WriteCommand__Group__0__Impl rule__WriteCommand__Group__1 ;
    public final void rule__WriteCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2829:1: ( rule__WriteCommand__Group__0__Impl rule__WriteCommand__Group__1 )
            // InternalPortugol.g:2830:2: rule__WriteCommand__Group__0__Impl rule__WriteCommand__Group__1
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
    // InternalPortugol.g:2837:1: rule__WriteCommand__Group__0__Impl : ( 'escreva' ) ;
    public final void rule__WriteCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2841:1: ( ( 'escreva' ) )
            // InternalPortugol.g:2842:1: ( 'escreva' )
            {
            // InternalPortugol.g:2842:1: ( 'escreva' )
            // InternalPortugol.g:2843:2: 'escreva'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getEscrevaKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteCommandAccess().getEscrevaKeyword_0()); 
            }

            }


            }

        }
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
    // InternalPortugol.g:2852:1: rule__WriteCommand__Group__1 : rule__WriteCommand__Group__1__Impl rule__WriteCommand__Group__2 ;
    public final void rule__WriteCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2856:1: ( rule__WriteCommand__Group__1__Impl rule__WriteCommand__Group__2 )
            // InternalPortugol.g:2857:2: rule__WriteCommand__Group__1__Impl rule__WriteCommand__Group__2
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
    // InternalPortugol.g:2864:1: rule__WriteCommand__Group__1__Impl : ( '(' ) ;
    public final void rule__WriteCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2868:1: ( ( '(' ) )
            // InternalPortugol.g:2869:1: ( '(' )
            {
            // InternalPortugol.g:2869:1: ( '(' )
            // InternalPortugol.g:2870:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2879:1: rule__WriteCommand__Group__2 : rule__WriteCommand__Group__2__Impl rule__WriteCommand__Group__3 ;
    public final void rule__WriteCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2883:1: ( rule__WriteCommand__Group__2__Impl rule__WriteCommand__Group__3 )
            // InternalPortugol.g:2884:2: rule__WriteCommand__Group__2__Impl rule__WriteCommand__Group__3
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
    // InternalPortugol.g:2891:1: rule__WriteCommand__Group__2__Impl : ( ( rule__WriteCommand__WriteParamAssignment_2 ) ) ;
    public final void rule__WriteCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2895:1: ( ( ( rule__WriteCommand__WriteParamAssignment_2 ) ) )
            // InternalPortugol.g:2896:1: ( ( rule__WriteCommand__WriteParamAssignment_2 ) )
            {
            // InternalPortugol.g:2896:1: ( ( rule__WriteCommand__WriteParamAssignment_2 ) )
            // InternalPortugol.g:2897:2: ( rule__WriteCommand__WriteParamAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getWriteParamAssignment_2()); 
            }
            // InternalPortugol.g:2898:2: ( rule__WriteCommand__WriteParamAssignment_2 )
            // InternalPortugol.g:2898:3: rule__WriteCommand__WriteParamAssignment_2
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
    // InternalPortugol.g:2906:1: rule__WriteCommand__Group__3 : rule__WriteCommand__Group__3__Impl rule__WriteCommand__Group__4 ;
    public final void rule__WriteCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2910:1: ( rule__WriteCommand__Group__3__Impl rule__WriteCommand__Group__4 )
            // InternalPortugol.g:2911:2: rule__WriteCommand__Group__3__Impl rule__WriteCommand__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__WriteCommand__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WriteCommand__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPortugol.g:2918:1: rule__WriteCommand__Group__3__Impl : ( ')' ) ;
    public final void rule__WriteCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2922:1: ( ( ')' ) )
            // InternalPortugol.g:2923:1: ( ')' )
            {
            // InternalPortugol.g:2923:1: ( ')' )
            // InternalPortugol.g:2924:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__WriteCommand__Group__4"
    // InternalPortugol.g:2933:1: rule__WriteCommand__Group__4 : rule__WriteCommand__Group__4__Impl ;
    public final void rule__WriteCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2937:1: ( rule__WriteCommand__Group__4__Impl )
            // InternalPortugol.g:2938:2: rule__WriteCommand__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WriteCommand__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteCommand__Group__4"


    // $ANTLR start "rule__WriteCommand__Group__4__Impl"
    // InternalPortugol.g:2944:1: rule__WriteCommand__Group__4__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__WriteCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2948:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2949:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2949:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2950:2: RULE_END_COMMAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getEND_COMMANDTerminalRuleCall_4()); 
            }
            match(input,RULE_END_COMMAND,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteCommandAccess().getEND_COMMANDTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteCommand__Group__4__Impl"


    // $ANTLR start "rule__WriteParam__Group__0"
    // InternalPortugol.g:2960:1: rule__WriteParam__Group__0 : rule__WriteParam__Group__0__Impl rule__WriteParam__Group__1 ;
    public final void rule__WriteParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2964:1: ( rule__WriteParam__Group__0__Impl rule__WriteParam__Group__1 )
            // InternalPortugol.g:2965:2: rule__WriteParam__Group__0__Impl rule__WriteParam__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalPortugol.g:2972:1: rule__WriteParam__Group__0__Impl : ( ( rule__WriteParam__ExpressionAssignment_0 ) ) ;
    public final void rule__WriteParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2976:1: ( ( ( rule__WriteParam__ExpressionAssignment_0 ) ) )
            // InternalPortugol.g:2977:1: ( ( rule__WriteParam__ExpressionAssignment_0 ) )
            {
            // InternalPortugol.g:2977:1: ( ( rule__WriteParam__ExpressionAssignment_0 ) )
            // InternalPortugol.g:2978:2: ( rule__WriteParam__ExpressionAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getExpressionAssignment_0()); 
            }
            // InternalPortugol.g:2979:2: ( rule__WriteParam__ExpressionAssignment_0 )
            // InternalPortugol.g:2979:3: rule__WriteParam__ExpressionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__WriteParam__ExpressionAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteParamAccess().getExpressionAssignment_0()); 
            }

            }


            }

        }
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
    // InternalPortugol.g:2987:1: rule__WriteParam__Group__1 : rule__WriteParam__Group__1__Impl rule__WriteParam__Group__2 ;
    public final void rule__WriteParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2991:1: ( rule__WriteParam__Group__1__Impl rule__WriteParam__Group__2 )
            // InternalPortugol.g:2992:2: rule__WriteParam__Group__1__Impl rule__WriteParam__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__WriteParam__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WriteParam__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPortugol.g:2999:1: rule__WriteParam__Group__1__Impl : ( ( rule__WriteParam__Group_1__0 )* ) ;
    public final void rule__WriteParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3003:1: ( ( ( rule__WriteParam__Group_1__0 )* ) )
            // InternalPortugol.g:3004:1: ( ( rule__WriteParam__Group_1__0 )* )
            {
            // InternalPortugol.g:3004:1: ( ( rule__WriteParam__Group_1__0 )* )
            // InternalPortugol.g:3005:2: ( rule__WriteParam__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getGroup_1()); 
            }
            // InternalPortugol.g:3006:2: ( rule__WriteParam__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==27) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalPortugol.g:3006:3: rule__WriteParam__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__WriteParam__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteParamAccess().getGroup_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__WriteParam__Group__2"
    // InternalPortugol.g:3014:1: rule__WriteParam__Group__2 : rule__WriteParam__Group__2__Impl ;
    public final void rule__WriteParam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3018:1: ( rule__WriteParam__Group__2__Impl )
            // InternalPortugol.g:3019:2: rule__WriteParam__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WriteParam__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteParam__Group__2"


    // $ANTLR start "rule__WriteParam__Group__2__Impl"
    // InternalPortugol.g:3025:1: rule__WriteParam__Group__2__Impl : ( ( rule__WriteParam__PrecisionAssignment_2 )? ) ;
    public final void rule__WriteParam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3029:1: ( ( ( rule__WriteParam__PrecisionAssignment_2 )? ) )
            // InternalPortugol.g:3030:1: ( ( rule__WriteParam__PrecisionAssignment_2 )? )
            {
            // InternalPortugol.g:3030:1: ( ( rule__WriteParam__PrecisionAssignment_2 )? )
            // InternalPortugol.g:3031:2: ( rule__WriteParam__PrecisionAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getPrecisionAssignment_2()); 
            }
            // InternalPortugol.g:3032:2: ( rule__WriteParam__PrecisionAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPortugol.g:3032:3: rule__WriteParam__PrecisionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__WriteParam__PrecisionAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteParamAccess().getPrecisionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteParam__Group__2__Impl"


    // $ANTLR start "rule__WriteParam__Group_1__0"
    // InternalPortugol.g:3041:1: rule__WriteParam__Group_1__0 : rule__WriteParam__Group_1__0__Impl rule__WriteParam__Group_1__1 ;
    public final void rule__WriteParam__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3045:1: ( rule__WriteParam__Group_1__0__Impl rule__WriteParam__Group_1__1 )
            // InternalPortugol.g:3046:2: rule__WriteParam__Group_1__0__Impl rule__WriteParam__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__WriteParam__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WriteParam__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteParam__Group_1__0"


    // $ANTLR start "rule__WriteParam__Group_1__0__Impl"
    // InternalPortugol.g:3053:1: rule__WriteParam__Group_1__0__Impl : ( ',' ) ;
    public final void rule__WriteParam__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3057:1: ( ( ',' ) )
            // InternalPortugol.g:3058:1: ( ',' )
            {
            // InternalPortugol.g:3058:1: ( ',' )
            // InternalPortugol.g:3059:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getCommaKeyword_1_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteParamAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteParam__Group_1__0__Impl"


    // $ANTLR start "rule__WriteParam__Group_1__1"
    // InternalPortugol.g:3068:1: rule__WriteParam__Group_1__1 : rule__WriteParam__Group_1__1__Impl ;
    public final void rule__WriteParam__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3072:1: ( rule__WriteParam__Group_1__1__Impl )
            // InternalPortugol.g:3073:2: rule__WriteParam__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WriteParam__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteParam__Group_1__1"


    // $ANTLR start "rule__WriteParam__Group_1__1__Impl"
    // InternalPortugol.g:3079:1: rule__WriteParam__Group_1__1__Impl : ( ( rule__WriteParam__ExpressionAssignment_1_1 ) ) ;
    public final void rule__WriteParam__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3083:1: ( ( ( rule__WriteParam__ExpressionAssignment_1_1 ) ) )
            // InternalPortugol.g:3084:1: ( ( rule__WriteParam__ExpressionAssignment_1_1 ) )
            {
            // InternalPortugol.g:3084:1: ( ( rule__WriteParam__ExpressionAssignment_1_1 ) )
            // InternalPortugol.g:3085:2: ( rule__WriteParam__ExpressionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getExpressionAssignment_1_1()); 
            }
            // InternalPortugol.g:3086:2: ( rule__WriteParam__ExpressionAssignment_1_1 )
            // InternalPortugol.g:3086:3: rule__WriteParam__ExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__WriteParam__ExpressionAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteParamAccess().getExpressionAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteParam__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalPortugol.g:3095:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3099:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalPortugol.g:3100:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalPortugol.g:3107:1: rule__Expression__Group__0__Impl : ( ruleXorExpression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3111:1: ( ( ruleXorExpression ) )
            // InternalPortugol.g:3112:1: ( ruleXorExpression )
            {
            // InternalPortugol.g:3112:1: ( ruleXorExpression )
            // InternalPortugol.g:3113:2: ruleXorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getXorExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getXorExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalPortugol.g:3122:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3126:1: ( rule__Expression__Group__1__Impl )
            // InternalPortugol.g:3127:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalPortugol.g:3133:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3137:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // InternalPortugol.g:3138:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // InternalPortugol.g:3138:1: ( ( rule__Expression__Group_1__0 )* )
            // InternalPortugol.g:3139:2: ( rule__Expression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:3140:2: ( rule__Expression__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==44) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPortugol.g:3140:3: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalPortugol.g:3149:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3153:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalPortugol.g:3154:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalPortugol.g:3161:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__Group_1_0__0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3165:1: ( ( ( rule__Expression__Group_1_0__0 ) ) )
            // InternalPortugol.g:3166:1: ( ( rule__Expression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:3166:1: ( ( rule__Expression__Group_1_0__0 ) )
            // InternalPortugol.g:3167:2: ( rule__Expression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:3168:2: ( rule__Expression__Group_1_0__0 )
            // InternalPortugol.g:3168:3: rule__Expression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalPortugol.g:3176:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3180:1: ( rule__Expression__Group_1__1__Impl )
            // InternalPortugol.g:3181:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalPortugol.g:3187:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__RightAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3191:1: ( ( ( rule__Expression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:3192:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:3192:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            // InternalPortugol.g:3193:2: ( rule__Expression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:3194:2: ( rule__Expression__RightAssignment_1_1 )
            // InternalPortugol.g:3194:3: rule__Expression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1_0__0"
    // InternalPortugol.g:3203:1: rule__Expression__Group_1_0__0 : rule__Expression__Group_1_0__0__Impl rule__Expression__Group_1_0__1 ;
    public final void rule__Expression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3207:1: ( rule__Expression__Group_1_0__0__Impl rule__Expression__Group_1_0__1 )
            // InternalPortugol.g:3208:2: rule__Expression__Group_1_0__0__Impl rule__Expression__Group_1_0__1
            {
            pushFollow(FOLLOW_24);
            rule__Expression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0__0"


    // $ANTLR start "rule__Expression__Group_1_0__0__Impl"
    // InternalPortugol.g:3215:1: rule__Expression__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3219:1: ( ( () ) )
            // InternalPortugol.g:3220:1: ( () )
            {
            // InternalPortugol.g:3220:1: ( () )
            // InternalPortugol.g:3221:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0_0()); 
            }
            // InternalPortugol.g:3222:2: ()
            // InternalPortugol.g:3222:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_1_0__1"
    // InternalPortugol.g:3230:1: rule__Expression__Group_1_0__1 : rule__Expression__Group_1_0__1__Impl ;
    public final void rule__Expression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3234:1: ( rule__Expression__Group_1_0__1__Impl )
            // InternalPortugol.g:3235:2: rule__Expression__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0__1"


    // $ANTLR start "rule__Expression__Group_1_0__1__Impl"
    // InternalPortugol.g:3241:1: rule__Expression__Group_1_0__1__Impl : ( ( rule__Expression__OpAssignment_1_0_1 ) ) ;
    public final void rule__Expression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3245:1: ( ( ( rule__Expression__OpAssignment_1_0_1 ) ) )
            // InternalPortugol.g:3246:1: ( ( rule__Expression__OpAssignment_1_0_1 ) )
            {
            // InternalPortugol.g:3246:1: ( ( rule__Expression__OpAssignment_1_0_1 ) )
            // InternalPortugol.g:3247:2: ( rule__Expression__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOpAssignment_1_0_1()); 
            }
            // InternalPortugol.g:3248:2: ( rule__Expression__OpAssignment_1_0_1 )
            // InternalPortugol.g:3248:3: rule__Expression__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getOpAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0__1__Impl"


    // $ANTLR start "rule__XorExpression__Group__0"
    // InternalPortugol.g:3257:1: rule__XorExpression__Group__0 : rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 ;
    public final void rule__XorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3261:1: ( rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 )
            // InternalPortugol.g:3262:2: rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalPortugol.g:3269:1: rule__XorExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__XorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3273:1: ( ( ruleAndExpression ) )
            // InternalPortugol.g:3274:1: ( ruleAndExpression )
            {
            // InternalPortugol.g:3274:1: ( ruleAndExpression )
            // InternalPortugol.g:3275:2: ruleAndExpression
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
    // InternalPortugol.g:3284:1: rule__XorExpression__Group__1 : rule__XorExpression__Group__1__Impl ;
    public final void rule__XorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3288:1: ( rule__XorExpression__Group__1__Impl )
            // InternalPortugol.g:3289:2: rule__XorExpression__Group__1__Impl
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
    // InternalPortugol.g:3295:1: rule__XorExpression__Group__1__Impl : ( ( rule__XorExpression__Group_1__0 )* ) ;
    public final void rule__XorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3299:1: ( ( ( rule__XorExpression__Group_1__0 )* ) )
            // InternalPortugol.g:3300:1: ( ( rule__XorExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:3300:1: ( ( rule__XorExpression__Group_1__0 )* )
            // InternalPortugol.g:3301:2: ( rule__XorExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:3302:2: ( rule__XorExpression__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==45) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPortugol.g:3302:3: rule__XorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__XorExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalPortugol.g:3311:1: rule__XorExpression__Group_1__0 : rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 ;
    public final void rule__XorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3315:1: ( rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 )
            // InternalPortugol.g:3316:2: rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1
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
    // InternalPortugol.g:3323:1: rule__XorExpression__Group_1__0__Impl : ( ( rule__XorExpression__Group_1_0__0 ) ) ;
    public final void rule__XorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3327:1: ( ( ( rule__XorExpression__Group_1_0__0 ) ) )
            // InternalPortugol.g:3328:1: ( ( rule__XorExpression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:3328:1: ( ( rule__XorExpression__Group_1_0__0 ) )
            // InternalPortugol.g:3329:2: ( rule__XorExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:3330:2: ( rule__XorExpression__Group_1_0__0 )
            // InternalPortugol.g:3330:3: rule__XorExpression__Group_1_0__0
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
    // InternalPortugol.g:3338:1: rule__XorExpression__Group_1__1 : rule__XorExpression__Group_1__1__Impl ;
    public final void rule__XorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3342:1: ( rule__XorExpression__Group_1__1__Impl )
            // InternalPortugol.g:3343:2: rule__XorExpression__Group_1__1__Impl
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
    // InternalPortugol.g:3349:1: rule__XorExpression__Group_1__1__Impl : ( ( rule__XorExpression__RightAssignment_1_1 ) ) ;
    public final void rule__XorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3353:1: ( ( ( rule__XorExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:3354:1: ( ( rule__XorExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:3354:1: ( ( rule__XorExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:3355:2: ( rule__XorExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:3356:2: ( rule__XorExpression__RightAssignment_1_1 )
            // InternalPortugol.g:3356:3: rule__XorExpression__RightAssignment_1_1
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
    // InternalPortugol.g:3365:1: rule__XorExpression__Group_1_0__0 : rule__XorExpression__Group_1_0__0__Impl rule__XorExpression__Group_1_0__1 ;
    public final void rule__XorExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3369:1: ( rule__XorExpression__Group_1_0__0__Impl rule__XorExpression__Group_1_0__1 )
            // InternalPortugol.g:3370:2: rule__XorExpression__Group_1_0__0__Impl rule__XorExpression__Group_1_0__1
            {
            pushFollow(FOLLOW_26);
            rule__XorExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPortugol.g:3377:1: rule__XorExpression__Group_1_0__0__Impl : ( () ) ;
    public final void rule__XorExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3381:1: ( ( () ) )
            // InternalPortugol.g:3382:1: ( () )
            {
            // InternalPortugol.g:3382:1: ( () )
            // InternalPortugol.g:3383:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0_0()); 
            }
            // InternalPortugol.g:3384:2: ()
            // InternalPortugol.g:3384:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__XorExpression__Group_1_0__1"
    // InternalPortugol.g:3392:1: rule__XorExpression__Group_1_0__1 : rule__XorExpression__Group_1_0__1__Impl ;
    public final void rule__XorExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3396:1: ( rule__XorExpression__Group_1_0__1__Impl )
            // InternalPortugol.g:3397:2: rule__XorExpression__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1_0__1"


    // $ANTLR start "rule__XorExpression__Group_1_0__1__Impl"
    // InternalPortugol.g:3403:1: rule__XorExpression__Group_1_0__1__Impl : ( ( rule__XorExpression__OpAssignment_1_0_1 ) ) ;
    public final void rule__XorExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3407:1: ( ( ( rule__XorExpression__OpAssignment_1_0_1 ) ) )
            // InternalPortugol.g:3408:1: ( ( rule__XorExpression__OpAssignment_1_0_1 ) )
            {
            // InternalPortugol.g:3408:1: ( ( rule__XorExpression__OpAssignment_1_0_1 ) )
            // InternalPortugol.g:3409:2: ( rule__XorExpression__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOpAssignment_1_0_1()); 
            }
            // InternalPortugol.g:3410:2: ( rule__XorExpression__OpAssignment_1_0_1 )
            // InternalPortugol.g:3410:3: rule__XorExpression__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getOpAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1_0__1__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalPortugol.g:3419:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3423:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalPortugol.g:3424:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalPortugol.g:3431:1: rule__AndExpression__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3435:1: ( ( ruleComparison ) )
            // InternalPortugol.g:3436:1: ( ruleComparison )
            {
            // InternalPortugol.g:3436:1: ( ruleComparison )
            // InternalPortugol.g:3437:2: ruleComparison
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
    // InternalPortugol.g:3446:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3450:1: ( rule__AndExpression__Group__1__Impl )
            // InternalPortugol.g:3451:2: rule__AndExpression__Group__1__Impl
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
    // InternalPortugol.g:3457:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3461:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalPortugol.g:3462:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:3462:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalPortugol.g:3463:2: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:3464:2: ( rule__AndExpression__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=16 && LA27_0<=17)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPortugol.g:3464:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalPortugol.g:3473:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3477:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalPortugol.g:3478:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
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
    // InternalPortugol.g:3485:1: rule__AndExpression__Group_1__0__Impl : ( ( rule__AndExpression__Group_1_0__0 ) ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3489:1: ( ( ( rule__AndExpression__Group_1_0__0 ) ) )
            // InternalPortugol.g:3490:1: ( ( rule__AndExpression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:3490:1: ( ( rule__AndExpression__Group_1_0__0 ) )
            // InternalPortugol.g:3491:2: ( rule__AndExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:3492:2: ( rule__AndExpression__Group_1_0__0 )
            // InternalPortugol.g:3492:3: rule__AndExpression__Group_1_0__0
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
    // InternalPortugol.g:3500:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3504:1: ( rule__AndExpression__Group_1__1__Impl )
            // InternalPortugol.g:3505:2: rule__AndExpression__Group_1__1__Impl
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
    // InternalPortugol.g:3511:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__RightAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3515:1: ( ( ( rule__AndExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:3516:1: ( ( rule__AndExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:3516:1: ( ( rule__AndExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:3517:2: ( rule__AndExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:3518:2: ( rule__AndExpression__RightAssignment_1_1 )
            // InternalPortugol.g:3518:3: rule__AndExpression__RightAssignment_1_1
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
    // InternalPortugol.g:3527:1: rule__AndExpression__Group_1_0__0 : rule__AndExpression__Group_1_0__0__Impl rule__AndExpression__Group_1_0__1 ;
    public final void rule__AndExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3531:1: ( rule__AndExpression__Group_1_0__0__Impl rule__AndExpression__Group_1_0__1 )
            // InternalPortugol.g:3532:2: rule__AndExpression__Group_1_0__0__Impl rule__AndExpression__Group_1_0__1
            {
            pushFollow(FOLLOW_28);
            rule__AndExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPortugol.g:3539:1: rule__AndExpression__Group_1_0__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3543:1: ( ( () ) )
            // InternalPortugol.g:3544:1: ( () )
            {
            // InternalPortugol.g:3544:1: ( () )
            // InternalPortugol.g:3545:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0_0()); 
            }
            // InternalPortugol.g:3546:2: ()
            // InternalPortugol.g:3546:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1_0__1"
    // InternalPortugol.g:3554:1: rule__AndExpression__Group_1_0__1 : rule__AndExpression__Group_1_0__1__Impl ;
    public final void rule__AndExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3558:1: ( rule__AndExpression__Group_1_0__1__Impl )
            // InternalPortugol.g:3559:2: rule__AndExpression__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1_0__1"


    // $ANTLR start "rule__AndExpression__Group_1_0__1__Impl"
    // InternalPortugol.g:3565:1: rule__AndExpression__Group_1_0__1__Impl : ( ( rule__AndExpression__OpAssignment_1_0_1 ) ) ;
    public final void rule__AndExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3569:1: ( ( ( rule__AndExpression__OpAssignment_1_0_1 ) ) )
            // InternalPortugol.g:3570:1: ( ( rule__AndExpression__OpAssignment_1_0_1 ) )
            {
            // InternalPortugol.g:3570:1: ( ( rule__AndExpression__OpAssignment_1_0_1 ) )
            // InternalPortugol.g:3571:2: ( rule__AndExpression__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAssignment_1_0_1()); 
            }
            // InternalPortugol.g:3572:2: ( rule__AndExpression__OpAssignment_1_0_1 )
            // InternalPortugol.g:3572:3: rule__AndExpression__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOpAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1_0__1__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalPortugol.g:3581:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3585:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalPortugol.g:3586:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalPortugol.g:3593:1: rule__Comparison__Group__0__Impl : ( ruleEquExpression ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3597:1: ( ( ruleEquExpression ) )
            // InternalPortugol.g:3598:1: ( ruleEquExpression )
            {
            // InternalPortugol.g:3598:1: ( ruleEquExpression )
            // InternalPortugol.g:3599:2: ruleEquExpression
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
    // InternalPortugol.g:3608:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3612:1: ( rule__Comparison__Group__1__Impl )
            // InternalPortugol.g:3613:2: rule__Comparison__Group__1__Impl
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
    // InternalPortugol.g:3619:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3623:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalPortugol.g:3624:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalPortugol.g:3624:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalPortugol.g:3625:2: ( rule__Comparison__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1()); 
            }
            // InternalPortugol.g:3626:2: ( rule__Comparison__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=18 && LA28_0<=19)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalPortugol.g:3626:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalPortugol.g:3635:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3639:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalPortugol.g:3640:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
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
    // InternalPortugol.g:3647:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Group_1_0__0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3651:1: ( ( ( rule__Comparison__Group_1_0__0 ) ) )
            // InternalPortugol.g:3652:1: ( ( rule__Comparison__Group_1_0__0 ) )
            {
            // InternalPortugol.g:3652:1: ( ( rule__Comparison__Group_1_0__0 ) )
            // InternalPortugol.g:3653:2: ( rule__Comparison__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:3654:2: ( rule__Comparison__Group_1_0__0 )
            // InternalPortugol.g:3654:3: rule__Comparison__Group_1_0__0
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
    // InternalPortugol.g:3662:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3666:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalPortugol.g:3667:2: rule__Comparison__Group_1__1__Impl
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
    // InternalPortugol.g:3673:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3677:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:3678:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:3678:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // InternalPortugol.g:3679:2: ( rule__Comparison__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:3680:2: ( rule__Comparison__RightAssignment_1_1 )
            // InternalPortugol.g:3680:3: rule__Comparison__RightAssignment_1_1
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
    // InternalPortugol.g:3689:1: rule__Comparison__Group_1_0__0 : rule__Comparison__Group_1_0__0__Impl rule__Comparison__Group_1_0__1 ;
    public final void rule__Comparison__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3693:1: ( rule__Comparison__Group_1_0__0__Impl rule__Comparison__Group_1_0__1 )
            // InternalPortugol.g:3694:2: rule__Comparison__Group_1_0__0__Impl rule__Comparison__Group_1_0__1
            {
            pushFollow(FOLLOW_30);
            rule__Comparison__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPortugol.g:3701:1: rule__Comparison__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3705:1: ( ( () ) )
            // InternalPortugol.g:3706:1: ( () )
            {
            // InternalPortugol.g:3706:1: ( () )
            // InternalPortugol.g:3707:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getCompExpressionLeftAction_1_0_0()); 
            }
            // InternalPortugol.g:3708:2: ()
            // InternalPortugol.g:3708:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getCompExpressionLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0__1"
    // InternalPortugol.g:3716:1: rule__Comparison__Group_1_0__1 : rule__Comparison__Group_1_0__1__Impl ;
    public final void rule__Comparison__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3720:1: ( rule__Comparison__Group_1_0__1__Impl )
            // InternalPortugol.g:3721:2: rule__Comparison__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0__1"


    // $ANTLR start "rule__Comparison__Group_1_0__1__Impl"
    // InternalPortugol.g:3727:1: rule__Comparison__Group_1_0__1__Impl : ( ( rule__Comparison__OpAssignment_1_0_1 ) ) ;
    public final void rule__Comparison__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3731:1: ( ( ( rule__Comparison__OpAssignment_1_0_1 ) ) )
            // InternalPortugol.g:3732:1: ( ( rule__Comparison__OpAssignment_1_0_1 ) )
            {
            // InternalPortugol.g:3732:1: ( ( rule__Comparison__OpAssignment_1_0_1 ) )
            // InternalPortugol.g:3733:2: ( rule__Comparison__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOpAssignment_1_0_1()); 
            }
            // InternalPortugol.g:3734:2: ( rule__Comparison__OpAssignment_1_0_1 )
            // InternalPortugol.g:3734:3: rule__Comparison__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getOpAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0__1__Impl"


    // $ANTLR start "rule__EquExpression__Group__0"
    // InternalPortugol.g:3743:1: rule__EquExpression__Group__0 : rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1 ;
    public final void rule__EquExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3747:1: ( rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1 )
            // InternalPortugol.g:3748:2: rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalPortugol.g:3755:1: rule__EquExpression__Group__0__Impl : ( ruleAddExpression ) ;
    public final void rule__EquExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3759:1: ( ( ruleAddExpression ) )
            // InternalPortugol.g:3760:1: ( ruleAddExpression )
            {
            // InternalPortugol.g:3760:1: ( ruleAddExpression )
            // InternalPortugol.g:3761:2: ruleAddExpression
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
    // InternalPortugol.g:3770:1: rule__EquExpression__Group__1 : rule__EquExpression__Group__1__Impl ;
    public final void rule__EquExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3774:1: ( rule__EquExpression__Group__1__Impl )
            // InternalPortugol.g:3775:2: rule__EquExpression__Group__1__Impl
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
    // InternalPortugol.g:3781:1: rule__EquExpression__Group__1__Impl : ( ( rule__EquExpression__Group_1__0 )* ) ;
    public final void rule__EquExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3785:1: ( ( ( rule__EquExpression__Group_1__0 )* ) )
            // InternalPortugol.g:3786:1: ( ( rule__EquExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:3786:1: ( ( rule__EquExpression__Group_1__0 )* )
            // InternalPortugol.g:3787:2: ( rule__EquExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:3788:2: ( rule__EquExpression__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=20 && LA29_0<=23)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPortugol.g:3788:3: rule__EquExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__EquExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalPortugol.g:3797:1: rule__EquExpression__Group_1__0 : rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1 ;
    public final void rule__EquExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3801:1: ( rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1 )
            // InternalPortugol.g:3802:2: rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1
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
    // InternalPortugol.g:3809:1: rule__EquExpression__Group_1__0__Impl : ( ( rule__EquExpression__Group_1_0__0 ) ) ;
    public final void rule__EquExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3813:1: ( ( ( rule__EquExpression__Group_1_0__0 ) ) )
            // InternalPortugol.g:3814:1: ( ( rule__EquExpression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:3814:1: ( ( rule__EquExpression__Group_1_0__0 ) )
            // InternalPortugol.g:3815:2: ( rule__EquExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:3816:2: ( rule__EquExpression__Group_1_0__0 )
            // InternalPortugol.g:3816:3: rule__EquExpression__Group_1_0__0
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
    // InternalPortugol.g:3824:1: rule__EquExpression__Group_1__1 : rule__EquExpression__Group_1__1__Impl ;
    public final void rule__EquExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3828:1: ( rule__EquExpression__Group_1__1__Impl )
            // InternalPortugol.g:3829:2: rule__EquExpression__Group_1__1__Impl
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
    // InternalPortugol.g:3835:1: rule__EquExpression__Group_1__1__Impl : ( ( rule__EquExpression__RightAssignment_1_1 ) ) ;
    public final void rule__EquExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3839:1: ( ( ( rule__EquExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:3840:1: ( ( rule__EquExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:3840:1: ( ( rule__EquExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:3841:2: ( rule__EquExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:3842:2: ( rule__EquExpression__RightAssignment_1_1 )
            // InternalPortugol.g:3842:3: rule__EquExpression__RightAssignment_1_1
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
    // InternalPortugol.g:3851:1: rule__EquExpression__Group_1_0__0 : rule__EquExpression__Group_1_0__0__Impl rule__EquExpression__Group_1_0__1 ;
    public final void rule__EquExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3855:1: ( rule__EquExpression__Group_1_0__0__Impl rule__EquExpression__Group_1_0__1 )
            // InternalPortugol.g:3856:2: rule__EquExpression__Group_1_0__0__Impl rule__EquExpression__Group_1_0__1
            {
            pushFollow(FOLLOW_32);
            rule__EquExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EquExpression__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPortugol.g:3863:1: rule__EquExpression__Group_1_0__0__Impl : ( () ) ;
    public final void rule__EquExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3867:1: ( ( () ) )
            // InternalPortugol.g:3868:1: ( () )
            {
            // InternalPortugol.g:3868:1: ( () )
            // InternalPortugol.g:3869:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getEquExpressionLeftAction_1_0_0()); 
            }
            // InternalPortugol.g:3870:2: ()
            // InternalPortugol.g:3870:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquExpressionAccess().getEquExpressionLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EquExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__EquExpression__Group_1_0__1"
    // InternalPortugol.g:3878:1: rule__EquExpression__Group_1_0__1 : rule__EquExpression__Group_1_0__1__Impl ;
    public final void rule__EquExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3882:1: ( rule__EquExpression__Group_1_0__1__Impl )
            // InternalPortugol.g:3883:2: rule__EquExpression__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EquExpression__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EquExpression__Group_1_0__1"


    // $ANTLR start "rule__EquExpression__Group_1_0__1__Impl"
    // InternalPortugol.g:3889:1: rule__EquExpression__Group_1_0__1__Impl : ( ( rule__EquExpression__OpAssignment_1_0_1 ) ) ;
    public final void rule__EquExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3893:1: ( ( ( rule__EquExpression__OpAssignment_1_0_1 ) ) )
            // InternalPortugol.g:3894:1: ( ( rule__EquExpression__OpAssignment_1_0_1 ) )
            {
            // InternalPortugol.g:3894:1: ( ( rule__EquExpression__OpAssignment_1_0_1 ) )
            // InternalPortugol.g:3895:2: ( rule__EquExpression__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getOpAssignment_1_0_1()); 
            }
            // InternalPortugol.g:3896:2: ( rule__EquExpression__OpAssignment_1_0_1 )
            // InternalPortugol.g:3896:3: rule__EquExpression__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__EquExpression__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquExpressionAccess().getOpAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EquExpression__Group_1_0__1__Impl"


    // $ANTLR start "rule__AddExpression__Group__0"
    // InternalPortugol.g:3905:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3909:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // InternalPortugol.g:3910:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalPortugol.g:3917:1: rule__AddExpression__Group__0__Impl : ( ruleTerm ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3921:1: ( ( ruleTerm ) )
            // InternalPortugol.g:3922:1: ( ruleTerm )
            {
            // InternalPortugol.g:3922:1: ( ruleTerm )
            // InternalPortugol.g:3923:2: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getTermParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getTermParserRuleCall_0()); 
            }

            }


            }

        }
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
    // InternalPortugol.g:3932:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3936:1: ( rule__AddExpression__Group__1__Impl )
            // InternalPortugol.g:3937:2: rule__AddExpression__Group__1__Impl
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
    // InternalPortugol.g:3943:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3947:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // InternalPortugol.g:3948:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:3948:1: ( ( rule__AddExpression__Group_1__0 )* )
            // InternalPortugol.g:3949:2: ( rule__AddExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:3950:2: ( rule__AddExpression__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=38 && LA30_0<=39)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPortugol.g:3950:3: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__AddExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalPortugol.g:3959:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3963:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // InternalPortugol.g:3964:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
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
    // InternalPortugol.g:3971:1: rule__AddExpression__Group_1__0__Impl : ( ( rule__AddExpression__Alternatives_1_0 ) ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3975:1: ( ( ( rule__AddExpression__Alternatives_1_0 ) ) )
            // InternalPortugol.g:3976:1: ( ( rule__AddExpression__Alternatives_1_0 ) )
            {
            // InternalPortugol.g:3976:1: ( ( rule__AddExpression__Alternatives_1_0 ) )
            // InternalPortugol.g:3977:2: ( rule__AddExpression__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getAlternatives_1_0()); 
            }
            // InternalPortugol.g:3978:2: ( rule__AddExpression__Alternatives_1_0 )
            // InternalPortugol.g:3978:3: rule__AddExpression__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AddExpression__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
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
    // InternalPortugol.g:3986:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3990:1: ( rule__AddExpression__Group_1__1__Impl )
            // InternalPortugol.g:3991:2: rule__AddExpression__Group_1__1__Impl
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
    // InternalPortugol.g:3997:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__RightAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4001:1: ( ( ( rule__AddExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:4002:1: ( ( rule__AddExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:4002:1: ( ( rule__AddExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:4003:2: ( rule__AddExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:4004:2: ( rule__AddExpression__RightAssignment_1_1 )
            // InternalPortugol.g:4004:3: rule__AddExpression__RightAssignment_1_1
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


    // $ANTLR start "rule__AddExpression__Group_1_0_0__0"
    // InternalPortugol.g:4013:1: rule__AddExpression__Group_1_0_0__0 : rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1 ;
    public final void rule__AddExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4017:1: ( rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1 )
            // InternalPortugol.g:4018:2: rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalPortugol.g:4025:1: rule__AddExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4029:1: ( ( () ) )
            // InternalPortugol.g:4030:1: ( () )
            {
            // InternalPortugol.g:4030:1: ( () )
            // InternalPortugol.g:4031:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getAddExpressionLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:4032:2: ()
            // InternalPortugol.g:4032:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getAddExpressionLeftAction_1_0_0_0()); 
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
    // InternalPortugol.g:4040:1: rule__AddExpression__Group_1_0_0__1 : rule__AddExpression__Group_1_0_0__1__Impl ;
    public final void rule__AddExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4044:1: ( rule__AddExpression__Group_1_0_0__1__Impl )
            // InternalPortugol.g:4045:2: rule__AddExpression__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:4051:1: rule__AddExpression__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__AddExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4055:1: ( ( '+' ) )
            // InternalPortugol.g:4056:1: ( '+' )
            {
            // InternalPortugol.g:4056:1: ( '+' )
            // InternalPortugol.g:4057:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_0_0_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_0_0_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__AddExpression__Group_1_0_1__0"
    // InternalPortugol.g:4067:1: rule__AddExpression__Group_1_0_1__0 : rule__AddExpression__Group_1_0_1__0__Impl rule__AddExpression__Group_1_0_1__1 ;
    public final void rule__AddExpression__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4071:1: ( rule__AddExpression__Group_1_0_1__0__Impl rule__AddExpression__Group_1_0_1__1 )
            // InternalPortugol.g:4072:2: rule__AddExpression__Group_1_0_1__0__Impl rule__AddExpression__Group_1_0_1__1
            {
            pushFollow(FOLLOW_34);
            rule__AddExpression__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddExpression__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_1__0"


    // $ANTLR start "rule__AddExpression__Group_1_0_1__0__Impl"
    // InternalPortugol.g:4079:1: rule__AddExpression__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4083:1: ( ( () ) )
            // InternalPortugol.g:4084:1: ( () )
            {
            // InternalPortugol.g:4084:1: ( () )
            // InternalPortugol.g:4085:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionLeftAction_1_0_1_0()); 
            }
            // InternalPortugol.g:4086:2: ()
            // InternalPortugol.g:4086:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getSubExpressionLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__AddExpression__Group_1_0_1__1"
    // InternalPortugol.g:4094:1: rule__AddExpression__Group_1_0_1__1 : rule__AddExpression__Group_1_0_1__1__Impl ;
    public final void rule__AddExpression__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4098:1: ( rule__AddExpression__Group_1_0_1__1__Impl )
            // InternalPortugol.g:4099:2: rule__AddExpression__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddExpression__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_1__1"


    // $ANTLR start "rule__AddExpression__Group_1_0_1__1__Impl"
    // InternalPortugol.g:4105:1: rule__AddExpression__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__AddExpression__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4109:1: ( ( '-' ) )
            // InternalPortugol.g:4110:1: ( '-' )
            {
            // InternalPortugol.g:4110:1: ( '-' )
            // InternalPortugol.g:4111:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Term__Group__0"
    // InternalPortugol.g:4121:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4125:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalPortugol.g:4126:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Term__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Term__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0"


    // $ANTLR start "rule__Term__Group__0__Impl"
    // InternalPortugol.g:4133:1: rule__Term__Group__0__Impl : ( rulePowerExpression ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4137:1: ( ( rulePowerExpression ) )
            // InternalPortugol.g:4138:1: ( rulePowerExpression )
            {
            // InternalPortugol.g:4138:1: ( rulePowerExpression )
            // InternalPortugol.g:4139:2: rulePowerExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getPowerExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePowerExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getPowerExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0__Impl"


    // $ANTLR start "rule__Term__Group__1"
    // InternalPortugol.g:4148:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4152:1: ( rule__Term__Group__1__Impl )
            // InternalPortugol.g:4153:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1"


    // $ANTLR start "rule__Term__Group__1__Impl"
    // InternalPortugol.g:4159:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4163:1: ( ( ( rule__Term__Group_1__0 )* ) )
            // InternalPortugol.g:4164:1: ( ( rule__Term__Group_1__0 )* )
            {
            // InternalPortugol.g:4164:1: ( ( rule__Term__Group_1__0 )* )
            // InternalPortugol.g:4165:2: ( rule__Term__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getGroup_1()); 
            }
            // InternalPortugol.g:4166:2: ( rule__Term__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=40 && LA31_0<=42)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalPortugol.g:4166:3: rule__Term__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Term__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1__Impl"


    // $ANTLR start "rule__Term__Group_1__0"
    // InternalPortugol.g:4175:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4179:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // InternalPortugol.g:4180:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__Term__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Term__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__0"


    // $ANTLR start "rule__Term__Group_1__0__Impl"
    // InternalPortugol.g:4187:1: rule__Term__Group_1__0__Impl : ( ( rule__Term__Alternatives_1_0 ) ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4191:1: ( ( ( rule__Term__Alternatives_1_0 ) ) )
            // InternalPortugol.g:4192:1: ( ( rule__Term__Alternatives_1_0 ) )
            {
            // InternalPortugol.g:4192:1: ( ( rule__Term__Alternatives_1_0 ) )
            // InternalPortugol.g:4193:2: ( rule__Term__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getAlternatives_1_0()); 
            }
            // InternalPortugol.g:4194:2: ( rule__Term__Alternatives_1_0 )
            // InternalPortugol.g:4194:3: rule__Term__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1__1"
    // InternalPortugol.g:4202:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4206:1: ( rule__Term__Group_1__1__Impl )
            // InternalPortugol.g:4207:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__1"


    // $ANTLR start "rule__Term__Group_1__1__Impl"
    // InternalPortugol.g:4213:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__RightAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4217:1: ( ( ( rule__Term__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:4218:1: ( ( rule__Term__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:4218:1: ( ( rule__Term__RightAssignment_1_1 ) )
            // InternalPortugol.g:4219:2: ( rule__Term__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:4220:2: ( rule__Term__RightAssignment_1_1 )
            // InternalPortugol.g:4220:3: rule__Term__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Term__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__1__Impl"


    // $ANTLR start "rule__Term__Group_1_0_0__0"
    // InternalPortugol.g:4229:1: rule__Term__Group_1_0_0__0 : rule__Term__Group_1_0_0__0__Impl rule__Term__Group_1_0_0__1 ;
    public final void rule__Term__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4233:1: ( rule__Term__Group_1_0_0__0__Impl rule__Term__Group_1_0_0__1 )
            // InternalPortugol.g:4234:2: rule__Term__Group_1_0_0__0__Impl rule__Term__Group_1_0_0__1
            {
            pushFollow(FOLLOW_39);
            rule__Term__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_0__0"


    // $ANTLR start "rule__Term__Group_1_0_0__0__Impl"
    // InternalPortugol.g:4241:1: rule__Term__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Term__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4245:1: ( ( () ) )
            // InternalPortugol.g:4246:1: ( () )
            {
            // InternalPortugol.g:4246:1: ( () )
            // InternalPortugol.g:4247:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getMultiplyLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:4248:2: ()
            // InternalPortugol.g:4248:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getMultiplyLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Term__Group_1_0_0__1"
    // InternalPortugol.g:4256:1: rule__Term__Group_1_0_0__1 : rule__Term__Group_1_0_0__1__Impl ;
    public final void rule__Term__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4260:1: ( rule__Term__Group_1_0_0__1__Impl )
            // InternalPortugol.g:4261:2: rule__Term__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_0__1"


    // $ANTLR start "rule__Term__Group_1_0_0__1__Impl"
    // InternalPortugol.g:4267:1: rule__Term__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Term__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4271:1: ( ( '*' ) )
            // InternalPortugol.g:4272:1: ( '*' )
            {
            // InternalPortugol.g:4272:1: ( '*' )
            // InternalPortugol.g:4273:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getAsteriskKeyword_1_0_0_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getAsteriskKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Term__Group_1_0_1__0"
    // InternalPortugol.g:4283:1: rule__Term__Group_1_0_1__0 : rule__Term__Group_1_0_1__0__Impl rule__Term__Group_1_0_1__1 ;
    public final void rule__Term__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4287:1: ( rule__Term__Group_1_0_1__0__Impl rule__Term__Group_1_0_1__1 )
            // InternalPortugol.g:4288:2: rule__Term__Group_1_0_1__0__Impl rule__Term__Group_1_0_1__1
            {
            pushFollow(FOLLOW_40);
            rule__Term__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_1__0"


    // $ANTLR start "rule__Term__Group_1_0_1__0__Impl"
    // InternalPortugol.g:4295:1: rule__Term__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Term__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4299:1: ( ( () ) )
            // InternalPortugol.g:4300:1: ( () )
            {
            // InternalPortugol.g:4300:1: ( () )
            // InternalPortugol.g:4301:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getDivisionLeftAction_1_0_1_0()); 
            }
            // InternalPortugol.g:4302:2: ()
            // InternalPortugol.g:4302:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getDivisionLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1_0_1__1"
    // InternalPortugol.g:4310:1: rule__Term__Group_1_0_1__1 : rule__Term__Group_1_0_1__1__Impl ;
    public final void rule__Term__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4314:1: ( rule__Term__Group_1_0_1__1__Impl )
            // InternalPortugol.g:4315:2: rule__Term__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_1__1"


    // $ANTLR start "rule__Term__Group_1_0_1__1__Impl"
    // InternalPortugol.g:4321:1: rule__Term__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Term__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4325:1: ( ( '/' ) )
            // InternalPortugol.g:4326:1: ( '/' )
            {
            // InternalPortugol.g:4326:1: ( '/' )
            // InternalPortugol.g:4327:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getSolidusKeyword_1_0_1_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getSolidusKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Term__Group_1_0_2__0"
    // InternalPortugol.g:4337:1: rule__Term__Group_1_0_2__0 : rule__Term__Group_1_0_2__0__Impl rule__Term__Group_1_0_2__1 ;
    public final void rule__Term__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4341:1: ( rule__Term__Group_1_0_2__0__Impl rule__Term__Group_1_0_2__1 )
            // InternalPortugol.g:4342:2: rule__Term__Group_1_0_2__0__Impl rule__Term__Group_1_0_2__1
            {
            pushFollow(FOLLOW_37);
            rule__Term__Group_1_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_2__0"


    // $ANTLR start "rule__Term__Group_1_0_2__0__Impl"
    // InternalPortugol.g:4349:1: rule__Term__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Term__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4353:1: ( ( () ) )
            // InternalPortugol.g:4354:1: ( () )
            {
            // InternalPortugol.g:4354:1: ( () )
            // InternalPortugol.g:4355:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getModLeftAction_1_0_2_0()); 
            }
            // InternalPortugol.g:4356:2: ()
            // InternalPortugol.g:4356:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getModLeftAction_1_0_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__Term__Group_1_0_2__1"
    // InternalPortugol.g:4364:1: rule__Term__Group_1_0_2__1 : rule__Term__Group_1_0_2__1__Impl ;
    public final void rule__Term__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4368:1: ( rule__Term__Group_1_0_2__1__Impl )
            // InternalPortugol.g:4369:2: rule__Term__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_2__1"


    // $ANTLR start "rule__Term__Group_1_0_2__1__Impl"
    // InternalPortugol.g:4375:1: rule__Term__Group_1_0_2__1__Impl : ( 'MOD' ) ;
    public final void rule__Term__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4379:1: ( ( 'MOD' ) )
            // InternalPortugol.g:4380:1: ( 'MOD' )
            {
            // InternalPortugol.g:4380:1: ( 'MOD' )
            // InternalPortugol.g:4381:2: 'MOD'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getMODKeyword_1_0_2_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getMODKeyword_1_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__PowerExpression__Group__0"
    // InternalPortugol.g:4391:1: rule__PowerExpression__Group__0 : rule__PowerExpression__Group__0__Impl rule__PowerExpression__Group__1 ;
    public final void rule__PowerExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4395:1: ( rule__PowerExpression__Group__0__Impl rule__PowerExpression__Group__1 )
            // InternalPortugol.g:4396:2: rule__PowerExpression__Group__0__Impl rule__PowerExpression__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalPortugol.g:4403:1: rule__PowerExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__PowerExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4407:1: ( ( ruleUnaryExpression ) )
            // InternalPortugol.g:4408:1: ( ruleUnaryExpression )
            {
            // InternalPortugol.g:4408:1: ( ruleUnaryExpression )
            // InternalPortugol.g:4409:2: ruleUnaryExpression
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
    // InternalPortugol.g:4418:1: rule__PowerExpression__Group__1 : rule__PowerExpression__Group__1__Impl ;
    public final void rule__PowerExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4422:1: ( rule__PowerExpression__Group__1__Impl )
            // InternalPortugol.g:4423:2: rule__PowerExpression__Group__1__Impl
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
    // InternalPortugol.g:4429:1: rule__PowerExpression__Group__1__Impl : ( ( rule__PowerExpression__Group_1__0 )* ) ;
    public final void rule__PowerExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4433:1: ( ( ( rule__PowerExpression__Group_1__0 )* ) )
            // InternalPortugol.g:4434:1: ( ( rule__PowerExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:4434:1: ( ( rule__PowerExpression__Group_1__0 )* )
            // InternalPortugol.g:4435:2: ( rule__PowerExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:4436:2: ( rule__PowerExpression__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==46) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPortugol.g:4436:3: rule__PowerExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__PowerExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalPortugol.g:4445:1: rule__PowerExpression__Group_1__0 : rule__PowerExpression__Group_1__0__Impl rule__PowerExpression__Group_1__1 ;
    public final void rule__PowerExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4449:1: ( rule__PowerExpression__Group_1__0__Impl rule__PowerExpression__Group_1__1 )
            // InternalPortugol.g:4450:2: rule__PowerExpression__Group_1__0__Impl rule__PowerExpression__Group_1__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalPortugol.g:4457:1: rule__PowerExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PowerExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4461:1: ( ( () ) )
            // InternalPortugol.g:4462:1: ( () )
            {
            // InternalPortugol.g:4462:1: ( () )
            // InternalPortugol.g:4463:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getPowerExpressionLeftAction_1_0()); 
            }
            // InternalPortugol.g:4464:2: ()
            // InternalPortugol.g:4464:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerExpressionAccess().getPowerExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PowerExpression__Group_1__1"
    // InternalPortugol.g:4472:1: rule__PowerExpression__Group_1__1 : rule__PowerExpression__Group_1__1__Impl rule__PowerExpression__Group_1__2 ;
    public final void rule__PowerExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4476:1: ( rule__PowerExpression__Group_1__1__Impl rule__PowerExpression__Group_1__2 )
            // InternalPortugol.g:4477:2: rule__PowerExpression__Group_1__1__Impl rule__PowerExpression__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__PowerExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PowerExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPortugol.g:4484:1: rule__PowerExpression__Group_1__1__Impl : ( ( rule__PowerExpression__OpAssignment_1_1 ) ) ;
    public final void rule__PowerExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4488:1: ( ( ( rule__PowerExpression__OpAssignment_1_1 ) ) )
            // InternalPortugol.g:4489:1: ( ( rule__PowerExpression__OpAssignment_1_1 ) )
            {
            // InternalPortugol.g:4489:1: ( ( rule__PowerExpression__OpAssignment_1_1 ) )
            // InternalPortugol.g:4490:2: ( rule__PowerExpression__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getOpAssignment_1_1()); 
            }
            // InternalPortugol.g:4491:2: ( rule__PowerExpression__OpAssignment_1_1 )
            // InternalPortugol.g:4491:3: rule__PowerExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PowerExpression__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerExpressionAccess().getOpAssignment_1_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__PowerExpression__Group_1__2"
    // InternalPortugol.g:4499:1: rule__PowerExpression__Group_1__2 : rule__PowerExpression__Group_1__2__Impl ;
    public final void rule__PowerExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4503:1: ( rule__PowerExpression__Group_1__2__Impl )
            // InternalPortugol.g:4504:2: rule__PowerExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PowerExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerExpression__Group_1__2"


    // $ANTLR start "rule__PowerExpression__Group_1__2__Impl"
    // InternalPortugol.g:4510:1: rule__PowerExpression__Group_1__2__Impl : ( ( rule__PowerExpression__RightAssignment_1_2 ) ) ;
    public final void rule__PowerExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4514:1: ( ( ( rule__PowerExpression__RightAssignment_1_2 ) ) )
            // InternalPortugol.g:4515:1: ( ( rule__PowerExpression__RightAssignment_1_2 ) )
            {
            // InternalPortugol.g:4515:1: ( ( rule__PowerExpression__RightAssignment_1_2 ) )
            // InternalPortugol.g:4516:2: ( rule__PowerExpression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getRightAssignment_1_2()); 
            }
            // InternalPortugol.g:4517:2: ( rule__PowerExpression__RightAssignment_1_2 )
            // InternalPortugol.g:4517:3: rule__PowerExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PowerExpression__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerExpressionAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerExpression__Group_1__2__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0__0"
    // InternalPortugol.g:4526:1: rule__UnaryExpression__Group_0__0 : rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 ;
    public final void rule__UnaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4530:1: ( rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 )
            // InternalPortugol.g:4531:2: rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalPortugol.g:4538:1: rule__UnaryExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4542:1: ( ( () ) )
            // InternalPortugol.g:4543:1: ( () )
            {
            // InternalPortugol.g:4543:1: ( () )
            // InternalPortugol.g:4544:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getBooleanNegationAction_0_0()); 
            }
            // InternalPortugol.g:4545:2: ()
            // InternalPortugol.g:4545:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getBooleanNegationAction_0_0()); 
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
    // InternalPortugol.g:4553:1: rule__UnaryExpression__Group_0__1 : rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 ;
    public final void rule__UnaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4557:1: ( rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 )
            // InternalPortugol.g:4558:2: rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2
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
    // InternalPortugol.g:4565:1: rule__UnaryExpression__Group_0__1__Impl : ( ( 'NOT' ) ) ;
    public final void rule__UnaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4569:1: ( ( ( 'NOT' ) ) )
            // InternalPortugol.g:4570:1: ( ( 'NOT' ) )
            {
            // InternalPortugol.g:4570:1: ( ( 'NOT' ) )
            // InternalPortugol.g:4571:2: ( 'NOT' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getNOTKeyword_0_1()); 
            }
            // InternalPortugol.g:4572:2: ( 'NOT' )
            // InternalPortugol.g:4572:3: 'NOT'
            {
            match(input,43,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getNOTKeyword_0_1()); 
            }

            }


            }

        }
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
    // InternalPortugol.g:4580:1: rule__UnaryExpression__Group_0__2 : rule__UnaryExpression__Group_0__2__Impl ;
    public final void rule__UnaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4584:1: ( rule__UnaryExpression__Group_0__2__Impl )
            // InternalPortugol.g:4585:2: rule__UnaryExpression__Group_0__2__Impl
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
    // InternalPortugol.g:4591:1: rule__UnaryExpression__Group_0__2__Impl : ( ( rule__UnaryExpression__ExpressionAssignment_0_2 ) ) ;
    public final void rule__UnaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4595:1: ( ( ( rule__UnaryExpression__ExpressionAssignment_0_2 ) ) )
            // InternalPortugol.g:4596:1: ( ( rule__UnaryExpression__ExpressionAssignment_0_2 ) )
            {
            // InternalPortugol.g:4596:1: ( ( rule__UnaryExpression__ExpressionAssignment_0_2 ) )
            // InternalPortugol.g:4597:2: ( rule__UnaryExpression__ExpressionAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getExpressionAssignment_0_2()); 
            }
            // InternalPortugol.g:4598:2: ( rule__UnaryExpression__ExpressionAssignment_0_2 )
            // InternalPortugol.g:4598:3: rule__UnaryExpression__ExpressionAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__ExpressionAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getExpressionAssignment_0_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__UnaryExpression__Group_1__0"
    // InternalPortugol.g:4607:1: rule__UnaryExpression__Group_1__0 : rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 ;
    public final void rule__UnaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4611:1: ( rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 )
            // InternalPortugol.g:4612:2: rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_44);
            rule__UnaryExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__0"


    // $ANTLR start "rule__UnaryExpression__Group_1__0__Impl"
    // InternalPortugol.g:4619:1: rule__UnaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4623:1: ( ( () ) )
            // InternalPortugol.g:4624:1: ( () )
            {
            // InternalPortugol.g:4624:1: ( () )
            // InternalPortugol.g:4625:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getArithmeticSignedAction_1_0()); 
            }
            // InternalPortugol.g:4626:2: ()
            // InternalPortugol.g:4626:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getArithmeticSignedAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_1__1"
    // InternalPortugol.g:4634:1: rule__UnaryExpression__Group_1__1 : rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 ;
    public final void rule__UnaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4638:1: ( rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 )
            // InternalPortugol.g:4639:2: rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__UnaryExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__1"


    // $ANTLR start "rule__UnaryExpression__Group_1__1__Impl"
    // InternalPortugol.g:4646:1: rule__UnaryExpression__Group_1__1__Impl : ( ( '-' ) ) ;
    public final void rule__UnaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4650:1: ( ( ( '-' ) ) )
            // InternalPortugol.g:4651:1: ( ( '-' ) )
            {
            // InternalPortugol.g:4651:1: ( ( '-' ) )
            // InternalPortugol.g:4652:2: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_1_1()); 
            }
            // InternalPortugol.g:4653:2: ( '-' )
            // InternalPortugol.g:4653:3: '-'
            {
            match(input,39,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_1__2"
    // InternalPortugol.g:4661:1: rule__UnaryExpression__Group_1__2 : rule__UnaryExpression__Group_1__2__Impl ;
    public final void rule__UnaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4665:1: ( rule__UnaryExpression__Group_1__2__Impl )
            // InternalPortugol.g:4666:2: rule__UnaryExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__2"


    // $ANTLR start "rule__UnaryExpression__Group_1__2__Impl"
    // InternalPortugol.g:4672:1: rule__UnaryExpression__Group_1__2__Impl : ( ( rule__UnaryExpression__ExpressionAssignment_1_2 ) ) ;
    public final void rule__UnaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4676:1: ( ( ( rule__UnaryExpression__ExpressionAssignment_1_2 ) ) )
            // InternalPortugol.g:4677:1: ( ( rule__UnaryExpression__ExpressionAssignment_1_2 ) )
            {
            // InternalPortugol.g:4677:1: ( ( rule__UnaryExpression__ExpressionAssignment_1_2 ) )
            // InternalPortugol.g:4678:2: ( rule__UnaryExpression__ExpressionAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getExpressionAssignment_1_2()); 
            }
            // InternalPortugol.g:4679:2: ( rule__UnaryExpression__ExpressionAssignment_1_2 )
            // InternalPortugol.g:4679:3: rule__UnaryExpression__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__ExpressionAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getExpressionAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // InternalPortugol.g:4688:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4692:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalPortugol.g:4693:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_45);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0__Impl"
    // InternalPortugol.g:4700:1: rule__PrimaryExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4704:1: ( ( () ) )
            // InternalPortugol.g:4705:1: ( () )
            {
            // InternalPortugol.g:4705:1: ( () )
            // InternalPortugol.g:4706:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getExpressionConstantAction_0_0()); 
            }
            // InternalPortugol.g:4707:2: ()
            // InternalPortugol.g:4707:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getExpressionConstantAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1"
    // InternalPortugol.g:4715:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4719:1: ( rule__PrimaryExpression__Group_0__1__Impl )
            // InternalPortugol.g:4720:2: rule__PrimaryExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1__Impl"
    // InternalPortugol.g:4726:1: rule__PrimaryExpression__Group_0__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4730:1: ( ( ( rule__PrimaryExpression__ValueAssignment_0_1 ) ) )
            // InternalPortugol.g:4731:1: ( ( rule__PrimaryExpression__ValueAssignment_0_1 ) )
            {
            // InternalPortugol.g:4731:1: ( ( rule__PrimaryExpression__ValueAssignment_0_1 ) )
            // InternalPortugol.g:4732:2: ( rule__PrimaryExpression__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_0_1()); 
            }
            // InternalPortugol.g:4733:2: ( rule__PrimaryExpression__ValueAssignment_0_1 )
            // InternalPortugol.g:4733:3: rule__PrimaryExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ValueAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0"
    // InternalPortugol.g:4742:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4746:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // InternalPortugol.g:4747:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__PrimaryExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0__Impl"
    // InternalPortugol.g:4754:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4758:1: ( ( () ) )
            // InternalPortugol.g:4759:1: ( () )
            {
            // InternalPortugol.g:4759:1: ( () )
            // InternalPortugol.g:4760:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getExpressionVariableAction_1_0()); 
            }
            // InternalPortugol.g:4761:2: ()
            // InternalPortugol.g:4761:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getExpressionVariableAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1"
    // InternalPortugol.g:4769:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4773:1: ( rule__PrimaryExpression__Group_1__1__Impl )
            // InternalPortugol.g:4774:2: rule__PrimaryExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__1"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1__Impl"
    // InternalPortugol.g:4780:1: rule__PrimaryExpression__Group_1__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4784:1: ( ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) )
            // InternalPortugol.g:4785:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            {
            // InternalPortugol.g:4785:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            // InternalPortugol.g:4786:2: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 
            }
            // InternalPortugol.g:4787:2: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            // InternalPortugol.g:4787:3: rule__PrimaryExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0"
    // InternalPortugol.g:4796:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4800:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // InternalPortugol.g:4801:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__PrimaryExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0__Impl"
    // InternalPortugol.g:4808:1: rule__PrimaryExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4812:1: ( ( '(' ) )
            // InternalPortugol.g:4813:1: ( '(' )
            {
            // InternalPortugol.g:4813:1: ( '(' )
            // InternalPortugol.g:4814:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1"
    // InternalPortugol.g:4823:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4827:1: ( rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 )
            // InternalPortugol.g:4828:2: rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2
            {
            pushFollow(FOLLOW_15);
            rule__PrimaryExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1__Impl"
    // InternalPortugol.g:4835:1: rule__PrimaryExpression__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4839:1: ( ( ruleExpression ) )
            // InternalPortugol.g:4840:1: ( ruleExpression )
            {
            // InternalPortugol.g:4840:1: ( ruleExpression )
            // InternalPortugol.g:4841:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__2"
    // InternalPortugol.g:4850:1: rule__PrimaryExpression__Group_2__2 : rule__PrimaryExpression__Group_2__2__Impl ;
    public final void rule__PrimaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4854:1: ( rule__PrimaryExpression__Group_2__2__Impl )
            // InternalPortugol.g:4855:2: rule__PrimaryExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__2"


    // $ANTLR start "rule__PrimaryExpression__Group_2__2__Impl"
    // InternalPortugol.g:4861:1: rule__PrimaryExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4865:1: ( ( ')' ) )
            // InternalPortugol.g:4866:1: ( ')' )
            {
            // InternalPortugol.g:4866:1: ( ')' )
            // InternalPortugol.g:4867:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group__0"
    // InternalPortugol.g:4877:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4881:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalPortugol.g:4882:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
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
    // InternalPortugol.g:4889:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__FbNameAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4893:1: ( ( ( rule__FunctionCall__FbNameAssignment_0 ) ) )
            // InternalPortugol.g:4894:1: ( ( rule__FunctionCall__FbNameAssignment_0 ) )
            {
            // InternalPortugol.g:4894:1: ( ( rule__FunctionCall__FbNameAssignment_0 ) )
            // InternalPortugol.g:4895:2: ( rule__FunctionCall__FbNameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFbNameAssignment_0()); 
            }
            // InternalPortugol.g:4896:2: ( rule__FunctionCall__FbNameAssignment_0 )
            // InternalPortugol.g:4896:3: rule__FunctionCall__FbNameAssignment_0
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
    // InternalPortugol.g:4904:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4908:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // InternalPortugol.g:4909:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
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
    // InternalPortugol.g:4916:1: rule__FunctionCall__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4920:1: ( ( '(' ) )
            // InternalPortugol.g:4921:1: ( '(' )
            {
            // InternalPortugol.g:4921:1: ( '(' )
            // InternalPortugol.g:4922:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:4931:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4935:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // InternalPortugol.g:4936:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
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
    // InternalPortugol.g:4943:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__ParamAssignment_2 ) ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4947:1: ( ( ( rule__FunctionCall__ParamAssignment_2 ) ) )
            // InternalPortugol.g:4948:1: ( ( rule__FunctionCall__ParamAssignment_2 ) )
            {
            // InternalPortugol.g:4948:1: ( ( rule__FunctionCall__ParamAssignment_2 ) )
            // InternalPortugol.g:4949:2: ( rule__FunctionCall__ParamAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParamAssignment_2()); 
            }
            // InternalPortugol.g:4950:2: ( rule__FunctionCall__ParamAssignment_2 )
            // InternalPortugol.g:4950:3: rule__FunctionCall__ParamAssignment_2
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
    // InternalPortugol.g:4958:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4962:1: ( rule__FunctionCall__Group__3__Impl )
            // InternalPortugol.g:4963:2: rule__FunctionCall__Group__3__Impl
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
    // InternalPortugol.g:4969:1: rule__FunctionCall__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4973:1: ( ( ')' ) )
            // InternalPortugol.g:4974:1: ( ')' )
            {
            // InternalPortugol.g:4974:1: ( ')' )
            // InternalPortugol.g:4975:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__OptDecimalPrecision__Group__0"
    // InternalPortugol.g:4985:1: rule__OptDecimalPrecision__Group__0 : rule__OptDecimalPrecision__Group__0__Impl rule__OptDecimalPrecision__Group__1 ;
    public final void rule__OptDecimalPrecision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4989:1: ( rule__OptDecimalPrecision__Group__0__Impl rule__OptDecimalPrecision__Group__1 )
            // InternalPortugol.g:4990:2: rule__OptDecimalPrecision__Group__0__Impl rule__OptDecimalPrecision__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalPortugol.g:4997:1: rule__OptDecimalPrecision__Group__0__Impl : ( ':' ) ;
    public final void rule__OptDecimalPrecision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5001:1: ( ( ':' ) )
            // InternalPortugol.g:5002:1: ( ':' )
            {
            // InternalPortugol.g:5002:1: ( ':' )
            // InternalPortugol.g:5003:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getColonKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:5012:1: rule__OptDecimalPrecision__Group__1 : rule__OptDecimalPrecision__Group__1__Impl rule__OptDecimalPrecision__Group__2 ;
    public final void rule__OptDecimalPrecision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5016:1: ( rule__OptDecimalPrecision__Group__1__Impl rule__OptDecimalPrecision__Group__2 )
            // InternalPortugol.g:5017:2: rule__OptDecimalPrecision__Group__1__Impl rule__OptDecimalPrecision__Group__2
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
    // InternalPortugol.g:5024:1: rule__OptDecimalPrecision__Group__1__Impl : ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) ) ;
    public final void rule__OptDecimalPrecision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5028:1: ( ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) ) )
            // InternalPortugol.g:5029:1: ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) )
            {
            // InternalPortugol.g:5029:1: ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) )
            // InternalPortugol.g:5030:2: ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getFirstPrecisionAssignment_1()); 
            }
            // InternalPortugol.g:5031:2: ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 )
            // InternalPortugol.g:5031:3: rule__OptDecimalPrecision__FirstPrecisionAssignment_1
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
    // InternalPortugol.g:5039:1: rule__OptDecimalPrecision__Group__2 : rule__OptDecimalPrecision__Group__2__Impl ;
    public final void rule__OptDecimalPrecision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5043:1: ( rule__OptDecimalPrecision__Group__2__Impl )
            // InternalPortugol.g:5044:2: rule__OptDecimalPrecision__Group__2__Impl
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
    // InternalPortugol.g:5050:1: rule__OptDecimalPrecision__Group__2__Impl : ( ( rule__OptDecimalPrecision__Group_2__0 )? ) ;
    public final void rule__OptDecimalPrecision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5054:1: ( ( ( rule__OptDecimalPrecision__Group_2__0 )? ) )
            // InternalPortugol.g:5055:1: ( ( rule__OptDecimalPrecision__Group_2__0 )? )
            {
            // InternalPortugol.g:5055:1: ( ( rule__OptDecimalPrecision__Group_2__0 )? )
            // InternalPortugol.g:5056:2: ( rule__OptDecimalPrecision__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getGroup_2()); 
            }
            // InternalPortugol.g:5057:2: ( rule__OptDecimalPrecision__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==26) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPortugol.g:5057:3: rule__OptDecimalPrecision__Group_2__0
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
    // InternalPortugol.g:5066:1: rule__OptDecimalPrecision__Group_2__0 : rule__OptDecimalPrecision__Group_2__0__Impl rule__OptDecimalPrecision__Group_2__1 ;
    public final void rule__OptDecimalPrecision__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5070:1: ( rule__OptDecimalPrecision__Group_2__0__Impl rule__OptDecimalPrecision__Group_2__1 )
            // InternalPortugol.g:5071:2: rule__OptDecimalPrecision__Group_2__0__Impl rule__OptDecimalPrecision__Group_2__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalPortugol.g:5078:1: rule__OptDecimalPrecision__Group_2__0__Impl : ( ':' ) ;
    public final void rule__OptDecimalPrecision__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5082:1: ( ( ':' ) )
            // InternalPortugol.g:5083:1: ( ':' )
            {
            // InternalPortugol.g:5083:1: ( ':' )
            // InternalPortugol.g:5084:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getColonKeyword_2_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:5093:1: rule__OptDecimalPrecision__Group_2__1 : rule__OptDecimalPrecision__Group_2__1__Impl ;
    public final void rule__OptDecimalPrecision__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5097:1: ( rule__OptDecimalPrecision__Group_2__1__Impl )
            // InternalPortugol.g:5098:2: rule__OptDecimalPrecision__Group_2__1__Impl
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
    // InternalPortugol.g:5104:1: rule__OptDecimalPrecision__Group_2__1__Impl : ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) ) ;
    public final void rule__OptDecimalPrecision__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5108:1: ( ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) ) )
            // InternalPortugol.g:5109:1: ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) )
            {
            // InternalPortugol.g:5109:1: ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) )
            // InternalPortugol.g:5110:2: ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getSecondPrecisionAssignment_2_1()); 
            }
            // InternalPortugol.g:5111:2: ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 )
            // InternalPortugol.g:5111:3: rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1
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


    // $ANTLR start "rule__Model__HeaderAssignment_0"
    // InternalPortugol.g:5120:1: rule__Model__HeaderAssignment_0 : ( ruleHeaderBlock ) ;
    public final void rule__Model__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5124:1: ( ( ruleHeaderBlock ) )
            // InternalPortugol.g:5125:2: ( ruleHeaderBlock )
            {
            // InternalPortugol.g:5125:2: ( ruleHeaderBlock )
            // InternalPortugol.g:5126:3: ruleHeaderBlock
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
    // InternalPortugol.g:5135:1: rule__Model__GlobalDeclarationsAssignment_1 : ( ruleDeclarationsBlock ) ;
    public final void rule__Model__GlobalDeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5139:1: ( ( ruleDeclarationsBlock ) )
            // InternalPortugol.g:5140:2: ( ruleDeclarationsBlock )
            {
            // InternalPortugol.g:5140:2: ( ruleDeclarationsBlock )
            // InternalPortugol.g:5141:3: ruleDeclarationsBlock
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
    // InternalPortugol.g:5150:1: rule__Model__SubprogramsAssignment_2 : ( ruleSubprograms ) ;
    public final void rule__Model__SubprogramsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5154:1: ( ( ruleSubprograms ) )
            // InternalPortugol.g:5155:2: ( ruleSubprograms )
            {
            // InternalPortugol.g:5155:2: ( ruleSubprograms )
            // InternalPortugol.g:5156:3: ruleSubprograms
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
    // InternalPortugol.g:5165:1: rule__Model__CommandsAssignment_3 : ( ruleBlockCommand ) ;
    public final void rule__Model__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5169:1: ( ( ruleBlockCommand ) )
            // InternalPortugol.g:5170:2: ( ruleBlockCommand )
            {
            // InternalPortugol.g:5170:2: ( ruleBlockCommand )
            // InternalPortugol.g:5171:3: ruleBlockCommand
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


    // $ANTLR start "rule__HeaderBlock__NameAssignment_1"
    // InternalPortugol.g:5180:1: rule__HeaderBlock__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__HeaderBlock__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5184:1: ( ( RULE_STRING ) )
            // InternalPortugol.g:5185:2: ( RULE_STRING )
            {
            // InternalPortugol.g:5185:2: ( RULE_STRING )
            // InternalPortugol.g:5186:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderBlockAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeaderBlockAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderBlock__NameAssignment_1"


    // $ANTLR start "rule__DeclarationsBlock__VarsAssignment_2_0"
    // InternalPortugol.g:5195:1: rule__DeclarationsBlock__VarsAssignment_2_0 : ( ruleVariable ) ;
    public final void rule__DeclarationsBlock__VarsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5199:1: ( ( ruleVariable ) )
            // InternalPortugol.g:5200:2: ( ruleVariable )
            {
            // InternalPortugol.g:5200:2: ( ruleVariable )
            // InternalPortugol.g:5201:3: ruleVariable
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
    // InternalPortugol.g:5210:1: rule__Variable__VarDeclarationAssignment_0 : ( ruleVarDeclaration ) ;
    public final void rule__Variable__VarDeclarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5214:1: ( ( ruleVarDeclaration ) )
            // InternalPortugol.g:5215:2: ( ruleVarDeclaration )
            {
            // InternalPortugol.g:5215:2: ( ruleVarDeclaration )
            // InternalPortugol.g:5216:3: ruleVarDeclaration
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
    // InternalPortugol.g:5225:1: rule__Variable__TypeAssignment_2 : ( ruleVarType ) ;
    public final void rule__Variable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5229:1: ( ( ruleVarType ) )
            // InternalPortugol.g:5230:2: ( ruleVarType )
            {
            // InternalPortugol.g:5230:2: ( ruleVarType )
            // InternalPortugol.g:5231:3: ruleVarType
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
    // InternalPortugol.g:5240:1: rule__VarDeclaration__VarsAssignment_0 : ( ruleVarName ) ;
    public final void rule__VarDeclaration__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5244:1: ( ( ruleVarName ) )
            // InternalPortugol.g:5245:2: ( ruleVarName )
            {
            // InternalPortugol.g:5245:2: ( ruleVarName )
            // InternalPortugol.g:5246:3: ruleVarName
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
    // InternalPortugol.g:5255:1: rule__VarDeclaration__VarsAssignment_1_1 : ( ruleVarName ) ;
    public final void rule__VarDeclaration__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5259:1: ( ( ruleVarName ) )
            // InternalPortugol.g:5260:2: ( ruleVarName )
            {
            // InternalPortugol.g:5260:2: ( ruleVarName )
            // InternalPortugol.g:5261:3: ruleVarName
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


    // $ANTLR start "rule__DeclaredVar__VarsAssignment_0"
    // InternalPortugol.g:5270:1: rule__DeclaredVar__VarsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredVar__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5274:1: ( ( ( RULE_ID ) ) )
            // InternalPortugol.g:5275:2: ( ( RULE_ID ) )
            {
            // InternalPortugol.g:5275:2: ( ( RULE_ID ) )
            // InternalPortugol.g:5276:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getVarsVarNameCrossReference_0_0()); 
            }
            // InternalPortugol.g:5277:3: ( RULE_ID )
            // InternalPortugol.g:5278:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getVarsVarNameIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredVarAccess().getVarsVarNameIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredVarAccess().getVarsVarNameCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredVar__VarsAssignment_0"


    // $ANTLR start "rule__DeclaredVar__VarsAssignment_1_1"
    // InternalPortugol.g:5289:1: rule__DeclaredVar__VarsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredVar__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5293:1: ( ( ( RULE_ID ) ) )
            // InternalPortugol.g:5294:2: ( ( RULE_ID ) )
            {
            // InternalPortugol.g:5294:2: ( ( RULE_ID ) )
            // InternalPortugol.g:5295:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getVarsVarNameCrossReference_1_1_0()); 
            }
            // InternalPortugol.g:5296:3: ( RULE_ID )
            // InternalPortugol.g:5297:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getVarsVarNameIDTerminalRuleCall_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredVarAccess().getVarsVarNameIDTerminalRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredVarAccess().getVarsVarNameCrossReference_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredVar__VarsAssignment_1_1"


    // $ANTLR start "rule__VarName__NameAssignment"
    // InternalPortugol.g:5308:1: rule__VarName__NameAssignment : ( RULE_ID ) ;
    public final void rule__VarName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5312:1: ( ( RULE_ID ) )
            // InternalPortugol.g:5313:2: ( RULE_ID )
            {
            // InternalPortugol.g:5313:2: ( RULE_ID )
            // InternalPortugol.g:5314:3: RULE_ID
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
    // InternalPortugol.g:5323:1: rule__VarType__TypeNameAssignment : ( ( rule__VarType__TypeNameAlternatives_0 ) ) ;
    public final void rule__VarType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5327:1: ( ( ( rule__VarType__TypeNameAlternatives_0 ) ) )
            // InternalPortugol.g:5328:2: ( ( rule__VarType__TypeNameAlternatives_0 ) )
            {
            // InternalPortugol.g:5328:2: ( ( rule__VarType__TypeNameAlternatives_0 ) )
            // InternalPortugol.g:5329:3: ( rule__VarType__TypeNameAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarTypeAccess().getTypeNameAlternatives_0()); 
            }
            // InternalPortugol.g:5330:3: ( rule__VarType__TypeNameAlternatives_0 )
            // InternalPortugol.g:5330:4: rule__VarType__TypeNameAlternatives_0
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
    // InternalPortugol.g:5338:1: rule__Subprograms__BlockSubProgramsAssignment : ( ruleBlockSubPrograms ) ;
    public final void rule__Subprograms__BlockSubProgramsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5342:1: ( ( ruleBlockSubPrograms ) )
            // InternalPortugol.g:5343:2: ( ruleBlockSubPrograms )
            {
            // InternalPortugol.g:5343:2: ( ruleBlockSubPrograms )
            // InternalPortugol.g:5344:3: ruleBlockSubPrograms
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


    // $ANTLR start "rule__FunctionName__NameAssignment"
    // InternalPortugol.g:5353:1: rule__FunctionName__NameAssignment : ( RULE_ID ) ;
    public final void rule__FunctionName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5357:1: ( ( RULE_ID ) )
            // InternalPortugol.g:5358:2: ( RULE_ID )
            {
            // InternalPortugol.g:5358:2: ( RULE_ID )
            // InternalPortugol.g:5359:3: RULE_ID
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


    // $ANTLR start "rule__ProcedureName__NameAssignment"
    // InternalPortugol.g:5368:1: rule__ProcedureName__NameAssignment : ( RULE_ID ) ;
    public final void rule__ProcedureName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5372:1: ( ( RULE_ID ) )
            // InternalPortugol.g:5373:2: ( RULE_ID )
            {
            // InternalPortugol.g:5373:2: ( RULE_ID )
            // InternalPortugol.g:5374:3: RULE_ID
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


    // $ANTLR start "rule__BlockFunction__FunctionNameAssignment_1"
    // InternalPortugol.g:5383:1: rule__BlockFunction__FunctionNameAssignment_1 : ( ruleFunctionName ) ;
    public final void rule__BlockFunction__FunctionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5387:1: ( ( ruleFunctionName ) )
            // InternalPortugol.g:5388:2: ( ruleFunctionName )
            {
            // InternalPortugol.g:5388:2: ( ruleFunctionName )
            // InternalPortugol.g:5389:3: ruleFunctionName
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
    // InternalPortugol.g:5398:1: rule__BlockFunction__ParamListAssignment_3 : ( ruleVariable ) ;
    public final void rule__BlockFunction__ParamListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5402:1: ( ( ruleVariable ) )
            // InternalPortugol.g:5403:2: ( ruleVariable )
            {
            // InternalPortugol.g:5403:2: ( ruleVariable )
            // InternalPortugol.g:5404:3: ruleVariable
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
    // InternalPortugol.g:5413:1: rule__BlockFunction__ReturnTypeAssignment_6 : ( ruleVarType ) ;
    public final void rule__BlockFunction__ReturnTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5417:1: ( ( ruleVarType ) )
            // InternalPortugol.g:5418:2: ( ruleVarType )
            {
            // InternalPortugol.g:5418:2: ( ruleVarType )
            // InternalPortugol.g:5419:3: ruleVarType
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
    // InternalPortugol.g:5428:1: rule__BlockFunction__DeclarationsAssignment_8 : ( ruleDeclarationsBlock ) ;
    public final void rule__BlockFunction__DeclarationsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5432:1: ( ( ruleDeclarationsBlock ) )
            // InternalPortugol.g:5433:2: ( ruleDeclarationsBlock )
            {
            // InternalPortugol.g:5433:2: ( ruleDeclarationsBlock )
            // InternalPortugol.g:5434:3: ruleDeclarationsBlock
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
    // InternalPortugol.g:5443:1: rule__BlockFunction__CommandsAssignment_11 : ( ruleAbstractCommand ) ;
    public final void rule__BlockFunction__CommandsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5447:1: ( ( ruleAbstractCommand ) )
            // InternalPortugol.g:5448:2: ( ruleAbstractCommand )
            {
            // InternalPortugol.g:5448:2: ( ruleAbstractCommand )
            // InternalPortugol.g:5449:3: ruleAbstractCommand
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
    // InternalPortugol.g:5458:1: rule__BlockProcedure__ProcedureAssignment_1 : ( ruleProcedureName ) ;
    public final void rule__BlockProcedure__ProcedureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5462:1: ( ( ruleProcedureName ) )
            // InternalPortugol.g:5463:2: ( ruleProcedureName )
            {
            // InternalPortugol.g:5463:2: ( ruleProcedureName )
            // InternalPortugol.g:5464:3: ruleProcedureName
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
    // InternalPortugol.g:5473:1: rule__BlockProcedure__ParamListAssignment_3 : ( ruleVariable ) ;
    public final void rule__BlockProcedure__ParamListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5477:1: ( ( ruleVariable ) )
            // InternalPortugol.g:5478:2: ( ruleVariable )
            {
            // InternalPortugol.g:5478:2: ( ruleVariable )
            // InternalPortugol.g:5479:3: ruleVariable
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
    // InternalPortugol.g:5488:1: rule__BlockProcedure__DeclarationsAssignment_6 : ( ruleDeclarationsBlock ) ;
    public final void rule__BlockProcedure__DeclarationsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5492:1: ( ( ruleDeclarationsBlock ) )
            // InternalPortugol.g:5493:2: ( ruleDeclarationsBlock )
            {
            // InternalPortugol.g:5493:2: ( ruleDeclarationsBlock )
            // InternalPortugol.g:5494:3: ruleDeclarationsBlock
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
    // InternalPortugol.g:5503:1: rule__BlockProcedure__CommandsAssignment_9 : ( ruleAbstractCommand ) ;
    public final void rule__BlockProcedure__CommandsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5507:1: ( ( ruleAbstractCommand ) )
            // InternalPortugol.g:5508:2: ( ruleAbstractCommand )
            {
            // InternalPortugol.g:5508:2: ( ruleAbstractCommand )
            // InternalPortugol.g:5509:3: ruleAbstractCommand
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
    // InternalPortugol.g:5518:1: rule__BlockCommand__CommandsAssignment_2 : ( ruleAbstractCommand ) ;
    public final void rule__BlockCommand__CommandsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5522:1: ( ( ruleAbstractCommand ) )
            // InternalPortugol.g:5523:2: ( ruleAbstractCommand )
            {
            // InternalPortugol.g:5523:2: ( ruleAbstractCommand )
            // InternalPortugol.g:5524:3: ruleAbstractCommand
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


    // $ANTLR start "rule__ReadCommand__ParamListAssignment_2"
    // InternalPortugol.g:5533:1: rule__ReadCommand__ParamListAssignment_2 : ( ruleDeclaredVar ) ;
    public final void rule__ReadCommand__ParamListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5537:1: ( ( ruleDeclaredVar ) )
            // InternalPortugol.g:5538:2: ( ruleDeclaredVar )
            {
            // InternalPortugol.g:5538:2: ( ruleDeclaredVar )
            // InternalPortugol.g:5539:3: ruleDeclaredVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getParamListDeclaredVarParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDeclaredVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReadCommandAccess().getParamListDeclaredVarParserRuleCall_2_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__WriteCommand__WriteParamAssignment_2"
    // InternalPortugol.g:5548:1: rule__WriteCommand__WriteParamAssignment_2 : ( ruleWriteParam ) ;
    public final void rule__WriteCommand__WriteParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5552:1: ( ( ruleWriteParam ) )
            // InternalPortugol.g:5553:2: ( ruleWriteParam )
            {
            // InternalPortugol.g:5553:2: ( ruleWriteParam )
            // InternalPortugol.g:5554:3: ruleWriteParam
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


    // $ANTLR start "rule__WriteParam__ExpressionAssignment_0"
    // InternalPortugol.g:5563:1: rule__WriteParam__ExpressionAssignment_0 : ( ruleExpression ) ;
    public final void rule__WriteParam__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5567:1: ( ( ruleExpression ) )
            // InternalPortugol.g:5568:2: ( ruleExpression )
            {
            // InternalPortugol.g:5568:2: ( ruleExpression )
            // InternalPortugol.g:5569:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getExpressionExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteParamAccess().getExpressionExpressionParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteParam__ExpressionAssignment_0"


    // $ANTLR start "rule__WriteParam__ExpressionAssignment_1_1"
    // InternalPortugol.g:5578:1: rule__WriteParam__ExpressionAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__WriteParam__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5582:1: ( ( ruleExpression ) )
            // InternalPortugol.g:5583:2: ( ruleExpression )
            {
            // InternalPortugol.g:5583:2: ( ruleExpression )
            // InternalPortugol.g:5584:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getExpressionExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteParamAccess().getExpressionExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteParam__ExpressionAssignment_1_1"


    // $ANTLR start "rule__WriteParam__PrecisionAssignment_2"
    // InternalPortugol.g:5593:1: rule__WriteParam__PrecisionAssignment_2 : ( ruleOptDecimalPrecision ) ;
    public final void rule__WriteParam__PrecisionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5597:1: ( ( ruleOptDecimalPrecision ) )
            // InternalPortugol.g:5598:2: ( ruleOptDecimalPrecision )
            {
            // InternalPortugol.g:5598:2: ( ruleOptDecimalPrecision )
            // InternalPortugol.g:5599:3: ruleOptDecimalPrecision
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getPrecisionOptDecimalPrecisionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOptDecimalPrecision();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteParamAccess().getPrecisionOptDecimalPrecisionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteParam__PrecisionAssignment_2"


    // $ANTLR start "rule__Expression__OpAssignment_1_0_1"
    // InternalPortugol.g:5608:1: rule__Expression__OpAssignment_1_0_1 : ( ( 'OR' ) ) ;
    public final void rule__Expression__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5612:1: ( ( ( 'OR' ) ) )
            // InternalPortugol.g:5613:2: ( ( 'OR' ) )
            {
            // InternalPortugol.g:5613:2: ( ( 'OR' ) )
            // InternalPortugol.g:5614:3: ( 'OR' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOpORKeyword_1_0_1_0()); 
            }
            // InternalPortugol.g:5615:3: ( 'OR' )
            // InternalPortugol.g:5616:4: 'OR'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOpORKeyword_1_0_1_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getOpORKeyword_1_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getOpORKeyword_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__OpAssignment_1_0_1"


    // $ANTLR start "rule__Expression__RightAssignment_1_1"
    // InternalPortugol.g:5627:1: rule__Expression__RightAssignment_1_1 : ( ruleXorExpression ) ;
    public final void rule__Expression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5631:1: ( ( ruleXorExpression ) )
            // InternalPortugol.g:5632:2: ( ruleXorExpression )
            {
            // InternalPortugol.g:5632:2: ( ruleXorExpression )
            // InternalPortugol.g:5633:3: ruleXorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getRightXorExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleXorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getRightXorExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__RightAssignment_1_1"


    // $ANTLR start "rule__XorExpression__OpAssignment_1_0_1"
    // InternalPortugol.g:5642:1: rule__XorExpression__OpAssignment_1_0_1 : ( ( 'XOR' ) ) ;
    public final void rule__XorExpression__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5646:1: ( ( ( 'XOR' ) ) )
            // InternalPortugol.g:5647:2: ( ( 'XOR' ) )
            {
            // InternalPortugol.g:5647:2: ( ( 'XOR' ) )
            // InternalPortugol.g:5648:3: ( 'XOR' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOpXORKeyword_1_0_1_0()); 
            }
            // InternalPortugol.g:5649:3: ( 'XOR' )
            // InternalPortugol.g:5650:4: 'XOR'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOpXORKeyword_1_0_1_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getOpXORKeyword_1_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExpressionAccess().getOpXORKeyword_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__OpAssignment_1_0_1"


    // $ANTLR start "rule__XorExpression__RightAssignment_1_1"
    // InternalPortugol.g:5661:1: rule__XorExpression__RightAssignment_1_1 : ( ruleAndExpression ) ;
    public final void rule__XorExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5665:1: ( ( ruleAndExpression ) )
            // InternalPortugol.g:5666:2: ( ruleAndExpression )
            {
            // InternalPortugol.g:5666:2: ( ruleAndExpression )
            // InternalPortugol.g:5667:3: ruleAndExpression
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


    // $ANTLR start "rule__AndExpression__OpAssignment_1_0_1"
    // InternalPortugol.g:5676:1: rule__AndExpression__OpAssignment_1_0_1 : ( ( rule__AndExpression__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__AndExpression__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5680:1: ( ( ( rule__AndExpression__OpAlternatives_1_0_1_0 ) ) )
            // InternalPortugol.g:5681:2: ( ( rule__AndExpression__OpAlternatives_1_0_1_0 ) )
            {
            // InternalPortugol.g:5681:2: ( ( rule__AndExpression__OpAlternatives_1_0_1_0 ) )
            // InternalPortugol.g:5682:3: ( rule__AndExpression__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAlternatives_1_0_1_0()); 
            }
            // InternalPortugol.g:5683:3: ( rule__AndExpression__OpAlternatives_1_0_1_0 )
            // InternalPortugol.g:5683:4: rule__AndExpression__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__OpAlternatives_1_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOpAlternatives_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__OpAssignment_1_0_1"


    // $ANTLR start "rule__AndExpression__RightAssignment_1_1"
    // InternalPortugol.g:5691:1: rule__AndExpression__RightAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__AndExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5695:1: ( ( ruleComparison ) )
            // InternalPortugol.g:5696:2: ( ruleComparison )
            {
            // InternalPortugol.g:5696:2: ( ruleComparison )
            // InternalPortugol.g:5697:3: ruleComparison
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


    // $ANTLR start "rule__Comparison__OpAssignment_1_0_1"
    // InternalPortugol.g:5706:1: rule__Comparison__OpAssignment_1_0_1 : ( ( rule__Comparison__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5710:1: ( ( ( rule__Comparison__OpAlternatives_1_0_1_0 ) ) )
            // InternalPortugol.g:5711:2: ( ( rule__Comparison__OpAlternatives_1_0_1_0 ) )
            {
            // InternalPortugol.g:5711:2: ( ( rule__Comparison__OpAlternatives_1_0_1_0 ) )
            // InternalPortugol.g:5712:3: ( rule__Comparison__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOpAlternatives_1_0_1_0()); 
            }
            // InternalPortugol.g:5713:3: ( rule__Comparison__OpAlternatives_1_0_1_0 )
            // InternalPortugol.g:5713:4: rule__Comparison__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAlternatives_1_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getOpAlternatives_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__OpAssignment_1_0_1"


    // $ANTLR start "rule__Comparison__RightAssignment_1_1"
    // InternalPortugol.g:5721:1: rule__Comparison__RightAssignment_1_1 : ( ruleEquExpression ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5725:1: ( ( ruleEquExpression ) )
            // InternalPortugol.g:5726:2: ( ruleEquExpression )
            {
            // InternalPortugol.g:5726:2: ( ruleEquExpression )
            // InternalPortugol.g:5727:3: ruleEquExpression
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


    // $ANTLR start "rule__EquExpression__OpAssignment_1_0_1"
    // InternalPortugol.g:5736:1: rule__EquExpression__OpAssignment_1_0_1 : ( ( rule__EquExpression__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__EquExpression__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5740:1: ( ( ( rule__EquExpression__OpAlternatives_1_0_1_0 ) ) )
            // InternalPortugol.g:5741:2: ( ( rule__EquExpression__OpAlternatives_1_0_1_0 ) )
            {
            // InternalPortugol.g:5741:2: ( ( rule__EquExpression__OpAlternatives_1_0_1_0 ) )
            // InternalPortugol.g:5742:3: ( rule__EquExpression__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getOpAlternatives_1_0_1_0()); 
            }
            // InternalPortugol.g:5743:3: ( rule__EquExpression__OpAlternatives_1_0_1_0 )
            // InternalPortugol.g:5743:4: rule__EquExpression__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__EquExpression__OpAlternatives_1_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquExpressionAccess().getOpAlternatives_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EquExpression__OpAssignment_1_0_1"


    // $ANTLR start "rule__EquExpression__RightAssignment_1_1"
    // InternalPortugol.g:5751:1: rule__EquExpression__RightAssignment_1_1 : ( ruleAddExpression ) ;
    public final void rule__EquExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5755:1: ( ( ruleAddExpression ) )
            // InternalPortugol.g:5756:2: ( ruleAddExpression )
            {
            // InternalPortugol.g:5756:2: ( ruleAddExpression )
            // InternalPortugol.g:5757:3: ruleAddExpression
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


    // $ANTLR start "rule__AddExpression__RightAssignment_1_1"
    // InternalPortugol.g:5766:1: rule__AddExpression__RightAssignment_1_1 : ( ruleTerm ) ;
    public final void rule__AddExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5770:1: ( ( ruleTerm ) )
            // InternalPortugol.g:5771:2: ( ruleTerm )
            {
            // InternalPortugol.g:5771:2: ( ruleTerm )
            // InternalPortugol.g:5772:3: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getRightTermParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getRightTermParserRuleCall_1_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Term__RightAssignment_1_1"
    // InternalPortugol.g:5781:1: rule__Term__RightAssignment_1_1 : ( rulePowerExpression ) ;
    public final void rule__Term__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5785:1: ( ( rulePowerExpression ) )
            // InternalPortugol.g:5786:2: ( rulePowerExpression )
            {
            // InternalPortugol.g:5786:2: ( rulePowerExpression )
            // InternalPortugol.g:5787:3: rulePowerExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getRightPowerExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePowerExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getRightPowerExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__RightAssignment_1_1"


    // $ANTLR start "rule__PowerExpression__OpAssignment_1_1"
    // InternalPortugol.g:5796:1: rule__PowerExpression__OpAssignment_1_1 : ( ( '^' ) ) ;
    public final void rule__PowerExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5800:1: ( ( ( '^' ) ) )
            // InternalPortugol.g:5801:2: ( ( '^' ) )
            {
            // InternalPortugol.g:5801:2: ( ( '^' ) )
            // InternalPortugol.g:5802:3: ( '^' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getOpCircumflexAccentKeyword_1_1_0()); 
            }
            // InternalPortugol.g:5803:3: ( '^' )
            // InternalPortugol.g:5804:4: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getOpCircumflexAccentKeyword_1_1_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerExpressionAccess().getOpCircumflexAccentKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerExpressionAccess().getOpCircumflexAccentKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerExpression__OpAssignment_1_1"


    // $ANTLR start "rule__PowerExpression__RightAssignment_1_2"
    // InternalPortugol.g:5815:1: rule__PowerExpression__RightAssignment_1_2 : ( ruleUnaryExpression ) ;
    public final void rule__PowerExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5819:1: ( ( ruleUnaryExpression ) )
            // InternalPortugol.g:5820:2: ( ruleUnaryExpression )
            {
            // InternalPortugol.g:5820:2: ( ruleUnaryExpression )
            // InternalPortugol.g:5821:3: ruleUnaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getRightUnaryExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerExpressionAccess().getRightUnaryExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerExpression__RightAssignment_1_2"


    // $ANTLR start "rule__UnaryExpression__ExpressionAssignment_0_2"
    // InternalPortugol.g:5830:1: rule__UnaryExpression__ExpressionAssignment_0_2 : ( rulePrimaryExpression ) ;
    public final void rule__UnaryExpression__ExpressionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5834:1: ( ( rulePrimaryExpression ) )
            // InternalPortugol.g:5835:2: ( rulePrimaryExpression )
            {
            // InternalPortugol.g:5835:2: ( rulePrimaryExpression )
            // InternalPortugol.g:5836:3: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__ExpressionAssignment_0_2"


    // $ANTLR start "rule__UnaryExpression__ExpressionAssignment_1_2"
    // InternalPortugol.g:5845:1: rule__UnaryExpression__ExpressionAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__UnaryExpression__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5849:1: ( ( rulePrimaryExpression ) )
            // InternalPortugol.g:5850:2: ( rulePrimaryExpression )
            {
            // InternalPortugol.g:5850:2: ( rulePrimaryExpression )
            // InternalPortugol.g:5851:3: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__ExpressionAssignment_1_2"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_0_1"
    // InternalPortugol.g:5860:1: rule__PrimaryExpression__ValueAssignment_0_1 : ( ruleConstant ) ;
    public final void rule__PrimaryExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5864:1: ( ( ruleConstant ) )
            // InternalPortugol.g:5865:2: ( ruleConstant )
            {
            // InternalPortugol.g:5865:2: ( ruleConstant )
            // InternalPortugol.g:5866:3: ruleConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueConstantParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getValueConstantParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_0_1"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_1_1"
    // InternalPortugol.g:5875:1: rule__PrimaryExpression__ValueAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5879:1: ( ( ( RULE_ID ) ) )
            // InternalPortugol.g:5880:2: ( ( RULE_ID ) )
            {
            // InternalPortugol.g:5880:2: ( ( RULE_ID ) )
            // InternalPortugol.g:5881:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueVarNameCrossReference_1_1_0()); 
            }
            // InternalPortugol.g:5882:3: ( RULE_ID )
            // InternalPortugol.g:5883:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getValueVarNameIDTerminalRuleCall_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getValueVarNameIDTerminalRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getValueVarNameCrossReference_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_1_1"


    // $ANTLR start "rule__FunctionCall__FbNameAssignment_0"
    // InternalPortugol.g:5894:1: rule__FunctionCall__FbNameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__FbNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5898:1: ( ( ( RULE_ID ) ) )
            // InternalPortugol.g:5899:2: ( ( RULE_ID ) )
            {
            // InternalPortugol.g:5899:2: ( ( RULE_ID ) )
            // InternalPortugol.g:5900:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFbNameFunctionNameCrossReference_0_0()); 
            }
            // InternalPortugol.g:5901:3: ( RULE_ID )
            // InternalPortugol.g:5902:4: RULE_ID
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
    // InternalPortugol.g:5913:1: rule__FunctionCall__ParamAssignment_2 : ( ruleWriteParam ) ;
    public final void rule__FunctionCall__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5917:1: ( ( ruleWriteParam ) )
            // InternalPortugol.g:5918:2: ( ruleWriteParam )
            {
            // InternalPortugol.g:5918:2: ( ruleWriteParam )
            // InternalPortugol.g:5919:3: ruleWriteParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParamWriteParamParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleWriteParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParamWriteParamParserRuleCall_2_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__OptDecimalPrecision__FirstPrecisionAssignment_1"
    // InternalPortugol.g:5928:1: rule__OptDecimalPrecision__FirstPrecisionAssignment_1 : ( RULE_INT ) ;
    public final void rule__OptDecimalPrecision__FirstPrecisionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5932:1: ( ( RULE_INT ) )
            // InternalPortugol.g:5933:2: ( RULE_INT )
            {
            // InternalPortugol.g:5933:2: ( RULE_INT )
            // InternalPortugol.g:5934:3: RULE_INT
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
    // InternalPortugol.g:5943:1: rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5947:1: ( ( RULE_INT ) )
            // InternalPortugol.g:5948:2: ( RULE_INT )
            {
            // InternalPortugol.g:5948:2: ( RULE_INT )
            // InternalPortugol.g:5949:3: RULE_INT
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


    // $ANTLR start "rule__NumericLiteral__IntValueAssignment_0"
    // InternalPortugol.g:5958:1: rule__NumericLiteral__IntValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__NumericLiteral__IntValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5962:1: ( ( RULE_INT ) )
            // InternalPortugol.g:5963:2: ( RULE_INT )
            {
            // InternalPortugol.g:5963:2: ( RULE_INT )
            // InternalPortugol.g:5964:3: RULE_INT
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
    // InternalPortugol.g:5973:1: rule__NumericLiteral__FloatValueAssignment_1 : ( RULE_FLOAT ) ;
    public final void rule__NumericLiteral__FloatValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5977:1: ( ( RULE_FLOAT ) )
            // InternalPortugol.g:5978:2: ( RULE_FLOAT )
            {
            // InternalPortugol.g:5978:2: ( RULE_FLOAT )
            // InternalPortugol.g:5979:3: RULE_FLOAT
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
    // InternalPortugol.g:5988:1: rule__StringExpression__LiteralStringAssignment : ( RULE_STRING ) ;
    public final void rule__StringExpression__LiteralStringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5992:1: ( ( RULE_STRING ) )
            // InternalPortugol.g:5993:2: ( RULE_STRING )
            {
            // InternalPortugol.g:5993:2: ( RULE_STRING )
            // InternalPortugol.g:5994:3: RULE_STRING
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000210000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000290000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000880200001E0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000000000001A0L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000080L});

}