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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_END_COMMAND", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'real'", "'inteiro'", "'caractere'", "'&'", "'E'", "'='", "'<>'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'MOD'", "'%'", "'NOT'", "'algoritmo'", "'var'", "':'", "','", "'funcao'", "'('", "')'", "'inicio'", "'fimfuncao'", "'procedimento'", "'fimprocedimento'", "'fimalgoritmo'", "'leia'", "'escreva'", "'<-'", "'OU'", "'XOU'", "'^'"
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
    public static final int T__48=48;
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

                if ( (LA1_0==35||LA1_0==40) ) {
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


    // $ANTLR start "entryRuleOptDecimalPrecision"
    // InternalPortugol.g:536:1: entryRuleOptDecimalPrecision : ruleOptDecimalPrecision EOF ;
    public final void entryRuleOptDecimalPrecision() throws RecognitionException {
        try {
            // InternalPortugol.g:537:1: ( ruleOptDecimalPrecision EOF )
            // InternalPortugol.g:538:1: ruleOptDecimalPrecision EOF
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
    // InternalPortugol.g:545:1: ruleOptDecimalPrecision : ( ( rule__OptDecimalPrecision__Group__0 ) ) ;
    public final void ruleOptDecimalPrecision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:549:2: ( ( ( rule__OptDecimalPrecision__Group__0 ) ) )
            // InternalPortugol.g:550:2: ( ( rule__OptDecimalPrecision__Group__0 ) )
            {
            // InternalPortugol.g:550:2: ( ( rule__OptDecimalPrecision__Group__0 ) )
            // InternalPortugol.g:551:3: ( rule__OptDecimalPrecision__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getGroup()); 
            }
            // InternalPortugol.g:552:3: ( rule__OptDecimalPrecision__Group__0 )
            // InternalPortugol.g:552:4: rule__OptDecimalPrecision__Group__0
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
    // InternalPortugol.g:561:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:562:1: ( ruleExpression EOF )
            // InternalPortugol.g:563:1: ruleExpression EOF
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
    // InternalPortugol.g:570:1: ruleExpression : ( ruleAssignment ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:574:2: ( ( ruleAssignment ) )
            // InternalPortugol.g:575:2: ( ruleAssignment )
            {
            // InternalPortugol.g:575:2: ( ruleAssignment )
            // InternalPortugol.g:576:3: ruleAssignment
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
    // InternalPortugol.g:586:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalPortugol.g:587:1: ( ruleAssignment EOF )
            // InternalPortugol.g:588:1: ruleAssignment EOF
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
    // InternalPortugol.g:595:1: ruleAssignment : ( ( rule__Assignment__Alternatives ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:599:2: ( ( ( rule__Assignment__Alternatives ) ) )
            // InternalPortugol.g:600:2: ( ( rule__Assignment__Alternatives ) )
            {
            // InternalPortugol.g:600:2: ( ( rule__Assignment__Alternatives ) )
            // InternalPortugol.g:601:3: ( rule__Assignment__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getAlternatives()); 
            }
            // InternalPortugol.g:602:3: ( rule__Assignment__Alternatives )
            // InternalPortugol.g:602:4: rule__Assignment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getAlternatives()); 
            }

            }


            }

        }
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
    // InternalPortugol.g:611:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:612:1: ( ruleOrExpression EOF )
            // InternalPortugol.g:613:1: ruleOrExpression EOF
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
    // InternalPortugol.g:620:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:624:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalPortugol.g:625:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalPortugol.g:625:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalPortugol.g:626:3: ( rule__OrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:627:3: ( rule__OrExpression__Group__0 )
            // InternalPortugol.g:627:4: rule__OrExpression__Group__0
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
    // InternalPortugol.g:636:1: entryRuleXorExpression : ruleXorExpression EOF ;
    public final void entryRuleXorExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:637:1: ( ruleXorExpression EOF )
            // InternalPortugol.g:638:1: ruleXorExpression EOF
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
    // InternalPortugol.g:645:1: ruleXorExpression : ( ( rule__XorExpression__Group__0 ) ) ;
    public final void ruleXorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:649:2: ( ( ( rule__XorExpression__Group__0 ) ) )
            // InternalPortugol.g:650:2: ( ( rule__XorExpression__Group__0 ) )
            {
            // InternalPortugol.g:650:2: ( ( rule__XorExpression__Group__0 ) )
            // InternalPortugol.g:651:3: ( rule__XorExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:652:3: ( rule__XorExpression__Group__0 )
            // InternalPortugol.g:652:4: rule__XorExpression__Group__0
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
    // InternalPortugol.g:661:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:662:1: ( ruleAndExpression EOF )
            // InternalPortugol.g:663:1: ruleAndExpression EOF
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
    // InternalPortugol.g:670:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:674:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalPortugol.g:675:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalPortugol.g:675:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalPortugol.g:676:3: ( rule__AndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:677:3: ( rule__AndExpression__Group__0 )
            // InternalPortugol.g:677:4: rule__AndExpression__Group__0
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
    // InternalPortugol.g:686:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalPortugol.g:687:1: ( ruleComparison EOF )
            // InternalPortugol.g:688:1: ruleComparison EOF
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
    // InternalPortugol.g:695:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:699:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalPortugol.g:700:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalPortugol.g:700:2: ( ( rule__Comparison__Group__0 ) )
            // InternalPortugol.g:701:3: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // InternalPortugol.g:702:3: ( rule__Comparison__Group__0 )
            // InternalPortugol.g:702:4: rule__Comparison__Group__0
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
    // InternalPortugol.g:711:1: entryRuleEquExpression : ruleEquExpression EOF ;
    public final void entryRuleEquExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:712:1: ( ruleEquExpression EOF )
            // InternalPortugol.g:713:1: ruleEquExpression EOF
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
    // InternalPortugol.g:720:1: ruleEquExpression : ( ( rule__EquExpression__Group__0 ) ) ;
    public final void ruleEquExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:724:2: ( ( ( rule__EquExpression__Group__0 ) ) )
            // InternalPortugol.g:725:2: ( ( rule__EquExpression__Group__0 ) )
            {
            // InternalPortugol.g:725:2: ( ( rule__EquExpression__Group__0 ) )
            // InternalPortugol.g:726:3: ( rule__EquExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:727:3: ( rule__EquExpression__Group__0 )
            // InternalPortugol.g:727:4: rule__EquExpression__Group__0
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
    // InternalPortugol.g:736:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:737:1: ( ruleAddExpression EOF )
            // InternalPortugol.g:738:1: ruleAddExpression EOF
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
    // InternalPortugol.g:745:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:749:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // InternalPortugol.g:750:2: ( ( rule__AddExpression__Group__0 ) )
            {
            // InternalPortugol.g:750:2: ( ( rule__AddExpression__Group__0 ) )
            // InternalPortugol.g:751:3: ( rule__AddExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:752:3: ( rule__AddExpression__Group__0 )
            // InternalPortugol.g:752:4: rule__AddExpression__Group__0
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
    // InternalPortugol.g:761:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:762:1: ( ruleMultiplicativeExpression EOF )
            // InternalPortugol.g:763:1: ruleMultiplicativeExpression EOF
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
    // InternalPortugol.g:770:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:774:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // InternalPortugol.g:775:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // InternalPortugol.g:775:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // InternalPortugol.g:776:3: ( rule__MultiplicativeExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:777:3: ( rule__MultiplicativeExpression__Group__0 )
            // InternalPortugol.g:777:4: rule__MultiplicativeExpression__Group__0
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
    // InternalPortugol.g:786:1: entryRulePowerExpression : rulePowerExpression EOF ;
    public final void entryRulePowerExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:787:1: ( rulePowerExpression EOF )
            // InternalPortugol.g:788:1: rulePowerExpression EOF
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
    // InternalPortugol.g:795:1: rulePowerExpression : ( ( rule__PowerExpression__Group__0 ) ) ;
    public final void rulePowerExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:799:2: ( ( ( rule__PowerExpression__Group__0 ) ) )
            // InternalPortugol.g:800:2: ( ( rule__PowerExpression__Group__0 ) )
            {
            // InternalPortugol.g:800:2: ( ( rule__PowerExpression__Group__0 ) )
            // InternalPortugol.g:801:3: ( rule__PowerExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup()); 
            }
            // InternalPortugol.g:802:3: ( rule__PowerExpression__Group__0 )
            // InternalPortugol.g:802:4: rule__PowerExpression__Group__0
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
    // InternalPortugol.g:811:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:812:1: ( ruleUnaryExpression EOF )
            // InternalPortugol.g:813:1: ruleUnaryExpression EOF
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
    // InternalPortugol.g:820:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:824:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // InternalPortugol.g:825:2: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // InternalPortugol.g:825:2: ( ( rule__UnaryExpression__Alternatives ) )
            // InternalPortugol.g:826:3: ( rule__UnaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            }
            // InternalPortugol.g:827:3: ( rule__UnaryExpression__Alternatives )
            // InternalPortugol.g:827:4: rule__UnaryExpression__Alternatives
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


    // $ANTLR start "entryRuleMemberCall"
    // InternalPortugol.g:836:1: entryRuleMemberCall : ruleMemberCall EOF ;
    public final void entryRuleMemberCall() throws RecognitionException {
        try {
            // InternalPortugol.g:837:1: ( ruleMemberCall EOF )
            // InternalPortugol.g:838:1: ruleMemberCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMemberCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMemberCall"


    // $ANTLR start "ruleMemberCall"
    // InternalPortugol.g:845:1: ruleMemberCall : ( ( rule__MemberCall__Group__0 ) ) ;
    public final void ruleMemberCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:849:2: ( ( ( rule__MemberCall__Group__0 ) ) )
            // InternalPortugol.g:850:2: ( ( rule__MemberCall__Group__0 ) )
            {
            // InternalPortugol.g:850:2: ( ( rule__MemberCall__Group__0 ) )
            // InternalPortugol.g:851:3: ( rule__MemberCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberCallAccess().getGroup()); 
            }
            // InternalPortugol.g:852:3: ( rule__MemberCall__Group__0 )
            // InternalPortugol.g:852:4: rule__MemberCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MemberCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberCallAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMemberCall"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalPortugol.g:861:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:862:1: ( rulePrimaryExpression EOF )
            // InternalPortugol.g:863:1: rulePrimaryExpression EOF
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
    // InternalPortugol.g:870:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:874:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalPortugol.g:875:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalPortugol.g:875:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalPortugol.g:876:3: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // InternalPortugol.g:877:3: ( rule__PrimaryExpression__Alternatives )
            // InternalPortugol.g:877:4: rule__PrimaryExpression__Alternatives
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
    // InternalPortugol.g:886:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalPortugol.g:887:1: ( ruleFunctionCall EOF )
            // InternalPortugol.g:888:1: ruleFunctionCall EOF
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
    // InternalPortugol.g:895:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:899:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalPortugol.g:900:2: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalPortugol.g:900:2: ( ( rule__FunctionCall__Group__0 ) )
            // InternalPortugol.g:901:3: ( rule__FunctionCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup()); 
            }
            // InternalPortugol.g:902:3: ( rule__FunctionCall__Group__0 )
            // InternalPortugol.g:902:4: rule__FunctionCall__Group__0
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
    // InternalPortugol.g:911:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalPortugol.g:912:1: ( ruleLiteral EOF )
            // InternalPortugol.g:913:1: ruleLiteral EOF
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
    // InternalPortugol.g:920:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:924:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalPortugol.g:925:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalPortugol.g:925:2: ( ( rule__Literal__Alternatives ) )
            // InternalPortugol.g:926:3: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalPortugol.g:927:3: ( rule__Literal__Alternatives )
            // InternalPortugol.g:927:4: rule__Literal__Alternatives
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


    // $ANTLR start "entryRuleNumericLiteral"
    // InternalPortugol.g:936:1: entryRuleNumericLiteral : ruleNumericLiteral EOF ;
    public final void entryRuleNumericLiteral() throws RecognitionException {
        try {
            // InternalPortugol.g:937:1: ( ruleNumericLiteral EOF )
            // InternalPortugol.g:938:1: ruleNumericLiteral EOF
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
    // InternalPortugol.g:945:1: ruleNumericLiteral : ( ( rule__NumericLiteral__Alternatives ) ) ;
    public final void ruleNumericLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:949:2: ( ( ( rule__NumericLiteral__Alternatives ) ) )
            // InternalPortugol.g:950:2: ( ( rule__NumericLiteral__Alternatives ) )
            {
            // InternalPortugol.g:950:2: ( ( rule__NumericLiteral__Alternatives ) )
            // InternalPortugol.g:951:3: ( rule__NumericLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericLiteralAccess().getAlternatives()); 
            }
            // InternalPortugol.g:952:3: ( rule__NumericLiteral__Alternatives )
            // InternalPortugol.g:952:4: rule__NumericLiteral__Alternatives
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
    // InternalPortugol.g:961:1: entryRuleStringExpression : ruleStringExpression EOF ;
    public final void entryRuleStringExpression() throws RecognitionException {
        try {
            // InternalPortugol.g:962:1: ( ruleStringExpression EOF )
            // InternalPortugol.g:963:1: ruleStringExpression EOF
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
    // InternalPortugol.g:970:1: ruleStringExpression : ( ( rule__StringExpression__LiteralStringAssignment ) ) ;
    public final void ruleStringExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:974:2: ( ( ( rule__StringExpression__LiteralStringAssignment ) ) )
            // InternalPortugol.g:975:2: ( ( rule__StringExpression__LiteralStringAssignment ) )
            {
            // InternalPortugol.g:975:2: ( ( rule__StringExpression__LiteralStringAssignment ) )
            // InternalPortugol.g:976:3: ( rule__StringExpression__LiteralStringAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringExpressionAccess().getLiteralStringAssignment()); 
            }
            // InternalPortugol.g:977:3: ( rule__StringExpression__LiteralStringAssignment )
            // InternalPortugol.g:977:4: rule__StringExpression__LiteralStringAssignment
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
    // InternalPortugol.g:985:1: rule__VarType__TypeNameAlternatives_0 : ( ( 'real' ) | ( 'inteiro' ) | ( 'caractere' ) );
    public final void rule__VarType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:989:1: ( ( 'real' ) | ( 'inteiro' ) | ( 'caractere' ) )
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
                    // InternalPortugol.g:990:2: ( 'real' )
                    {
                    // InternalPortugol.g:990:2: ( 'real' )
                    // InternalPortugol.g:991:3: 'real'
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
                    // InternalPortugol.g:996:2: ( 'inteiro' )
                    {
                    // InternalPortugol.g:996:2: ( 'inteiro' )
                    // InternalPortugol.g:997:3: 'inteiro'
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
                    // InternalPortugol.g:1002:2: ( 'caractere' )
                    {
                    // InternalPortugol.g:1002:2: ( 'caractere' )
                    // InternalPortugol.g:1003:3: 'caractere'
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
    // InternalPortugol.g:1012:1: rule__BlockSubPrograms__Alternatives : ( ( ruleBlockFunction ) | ( ruleBlockProcedure ) );
    public final void rule__BlockSubPrograms__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1016:1: ( ( ruleBlockFunction ) | ( ruleBlockProcedure ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            else if ( (LA3_0==40) ) {
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
                    // InternalPortugol.g:1017:2: ( ruleBlockFunction )
                    {
                    // InternalPortugol.g:1017:2: ( ruleBlockFunction )
                    // InternalPortugol.g:1018:3: ruleBlockFunction
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
                    // InternalPortugol.g:1023:2: ( ruleBlockProcedure )
                    {
                    // InternalPortugol.g:1023:2: ( ruleBlockProcedure )
                    // InternalPortugol.g:1024:3: ruleBlockProcedure
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
    // InternalPortugol.g:1033:1: rule__AbstractCommand__Alternatives : ( ( ( rule__AbstractCommand__Group_0__0 ) ) | ( ( rule__AbstractCommand__Group_1__0 ) ) | ( ( rule__AbstractCommand__Group_2__0 ) ) );
    public final void rule__AbstractCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1037:1: ( ( ( rule__AbstractCommand__Group_0__0 ) ) | ( ( rule__AbstractCommand__Group_1__0 ) ) | ( ( rule__AbstractCommand__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt4=1;
                }
                break;
            case 44:
                {
                alt4=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case RULE_FLOAT:
            case 25:
            case 30:
            case 36:
                {
                alt4=3;
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
                    // InternalPortugol.g:1038:2: ( ( rule__AbstractCommand__Group_0__0 ) )
                    {
                    // InternalPortugol.g:1038:2: ( ( rule__AbstractCommand__Group_0__0 ) )
                    // InternalPortugol.g:1039:3: ( rule__AbstractCommand__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_0()); 
                    }
                    // InternalPortugol.g:1040:3: ( rule__AbstractCommand__Group_0__0 )
                    // InternalPortugol.g:1040:4: rule__AbstractCommand__Group_0__0
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
                    // InternalPortugol.g:1044:2: ( ( rule__AbstractCommand__Group_1__0 ) )
                    {
                    // InternalPortugol.g:1044:2: ( ( rule__AbstractCommand__Group_1__0 ) )
                    // InternalPortugol.g:1045:3: ( rule__AbstractCommand__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_1()); 
                    }
                    // InternalPortugol.g:1046:3: ( rule__AbstractCommand__Group_1__0 )
                    // InternalPortugol.g:1046:4: rule__AbstractCommand__Group_1__0
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
                    // InternalPortugol.g:1050:2: ( ( rule__AbstractCommand__Group_2__0 ) )
                    {
                    // InternalPortugol.g:1050:2: ( ( rule__AbstractCommand__Group_2__0 ) )
                    // InternalPortugol.g:1051:3: ( rule__AbstractCommand__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractCommandAccess().getGroup_2()); 
                    }
                    // InternalPortugol.g:1052:3: ( rule__AbstractCommand__Group_2__0 )
                    // InternalPortugol.g:1052:4: rule__AbstractCommand__Group_2__0
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

            }
        }
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


    // $ANTLR start "rule__Assignment__Alternatives"
    // InternalPortugol.g:1060:1: rule__Assignment__Alternatives : ( ( ( rule__Assignment__Group_0__0 ) ) | ( ( rule__Assignment__Group_1__0 ) ) );
    public final void rule__Assignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1064:1: ( ( ( rule__Assignment__Group_0__0 ) ) | ( ( rule__Assignment__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==45) ) {
                    alt5=1;
                }
                else if ( (LA5_1==36) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==RULE_STRING||(LA5_0>=RULE_INT && LA5_0<=RULE_FLOAT)||LA5_0==25||LA5_0==30||LA5_0==36) ) {
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
                    // InternalPortugol.g:1065:2: ( ( rule__Assignment__Group_0__0 ) )
                    {
                    // InternalPortugol.g:1065:2: ( ( rule__Assignment__Group_0__0 ) )
                    // InternalPortugol.g:1066:3: ( rule__Assignment__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getGroup_0()); 
                    }
                    // InternalPortugol.g:1067:3: ( rule__Assignment__Group_0__0 )
                    // InternalPortugol.g:1067:4: rule__Assignment__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assignment__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssignmentAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:1071:2: ( ( rule__Assignment__Group_1__0 ) )
                    {
                    // InternalPortugol.g:1071:2: ( ( rule__Assignment__Group_1__0 ) )
                    // InternalPortugol.g:1072:3: ( rule__Assignment__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getGroup_1()); 
                    }
                    // InternalPortugol.g:1073:3: ( rule__Assignment__Group_1__0 )
                    // InternalPortugol.g:1073:4: rule__Assignment__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assignment__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssignmentAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Assignment__Alternatives"


    // $ANTLR start "rule__AndExpression__OpAlternatives_1_0_0_1_0"
    // InternalPortugol.g:1081:1: rule__AndExpression__OpAlternatives_1_0_0_1_0 : ( ( '&' ) | ( 'E' ) );
    public final void rule__AndExpression__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1085:1: ( ( '&' ) | ( 'E' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
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
                    // InternalPortugol.g:1086:2: ( '&' )
                    {
                    // InternalPortugol.g:1086:2: ( '&' )
                    // InternalPortugol.g:1087:3: '&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndExpressionAccess().getOpAmpersandKeyword_1_0_0_1_0_0()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAndExpressionAccess().getOpAmpersandKeyword_1_0_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:1092:2: ( 'E' )
                    {
                    // InternalPortugol.g:1092:2: ( 'E' )
                    // InternalPortugol.g:1093:3: 'E'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndExpressionAccess().getOpEKeyword_1_0_0_1_0_1()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1102:1: rule__Comparison__OpAlternatives_1_0_0_1_0 : ( ( '=' ) | ( '<>' ) );
    public final void rule__Comparison__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1106:1: ( ( '=' ) | ( '<>' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
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
                    // InternalPortugol.g:1107:2: ( '=' )
                    {
                    // InternalPortugol.g:1107:2: ( '=' )
                    // InternalPortugol.g:1108:3: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getOpEqualsSignKeyword_1_0_0_1_0_0()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getOpEqualsSignKeyword_1_0_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:1113:2: ( '<>' )
                    {
                    // InternalPortugol.g:1113:2: ( '<>' )
                    // InternalPortugol.g:1114:3: '<>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getOpLessThanSignGreaterThanSignKeyword_1_0_0_1_0_1()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1123:1: rule__EquExpression__OpAlternatives_1_0_0_1_0 : ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__EquExpression__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1127:1: ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            case 23:
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
                    // InternalPortugol.g:1128:2: ( '<' )
                    {
                    // InternalPortugol.g:1128:2: ( '<' )
                    // InternalPortugol.g:1129:3: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEquExpressionAccess().getOpLessThanSignKeyword_1_0_0_1_0_0()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEquExpressionAccess().getOpLessThanSignKeyword_1_0_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:1134:2: ( '>' )
                    {
                    // InternalPortugol.g:1134:2: ( '>' )
                    // InternalPortugol.g:1135:3: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEquExpressionAccess().getOpGreaterThanSignKeyword_1_0_0_1_0_1()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEquExpressionAccess().getOpGreaterThanSignKeyword_1_0_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPortugol.g:1140:2: ( '<=' )
                    {
                    // InternalPortugol.g:1140:2: ( '<=' )
                    // InternalPortugol.g:1141:3: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEquExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_0_0_1_0_2()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEquExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_0_0_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPortugol.g:1146:2: ( '>=' )
                    {
                    // InternalPortugol.g:1146:2: ( '>=' )
                    // InternalPortugol.g:1147:3: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEquExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_0_1_0_3()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1156:1: rule__AddExpression__OpAlternatives_1_0_0_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__AddExpression__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1160:1: ( ( '+' ) | ( '-' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
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
                    // InternalPortugol.g:1161:2: ( '+' )
                    {
                    // InternalPortugol.g:1161:2: ( '+' )
                    // InternalPortugol.g:1162:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddExpressionAccess().getOpPlusSignKeyword_1_0_0_1_0_0()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAddExpressionAccess().getOpPlusSignKeyword_1_0_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:1167:2: ( '-' )
                    {
                    // InternalPortugol.g:1167:2: ( '-' )
                    // InternalPortugol.g:1168:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddExpressionAccess().getOpHyphenMinusKeyword_1_0_0_1_0_1()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1177:1: rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 : ( ( '*' ) | ( '/' ) | ( 'MOD' ) | ( '%' ) );
    public final void rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1181:1: ( ( '*' ) | ( '/' ) | ( 'MOD' ) | ( '%' ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt10=1;
                }
                break;
            case 27:
                {
                alt10=2;
                }
                break;
            case 28:
                {
                alt10=3;
                }
                break;
            case 29:
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
                    // InternalPortugol.g:1182:2: ( '*' )
                    {
                    // InternalPortugol.g:1182:2: ( '*' )
                    // InternalPortugol.g:1183:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeExpressionAccess().getOpAsteriskKeyword_1_0_0_1_0_0()); 
                    }
                    match(input,26,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeExpressionAccess().getOpAsteriskKeyword_1_0_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:1188:2: ( '/' )
                    {
                    // InternalPortugol.g:1188:2: ( '/' )
                    // InternalPortugol.g:1189:3: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeExpressionAccess().getOpSolidusKeyword_1_0_0_1_0_1()); 
                    }
                    match(input,27,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeExpressionAccess().getOpSolidusKeyword_1_0_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPortugol.g:1194:2: ( 'MOD' )
                    {
                    // InternalPortugol.g:1194:2: ( 'MOD' )
                    // InternalPortugol.g:1195:3: 'MOD'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeExpressionAccess().getOpMODKeyword_1_0_0_1_0_2()); 
                    }
                    match(input,28,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeExpressionAccess().getOpMODKeyword_1_0_0_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPortugol.g:1200:2: ( '%' )
                    {
                    // InternalPortugol.g:1200:2: ( '%' )
                    // InternalPortugol.g:1201:3: '%'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeExpressionAccess().getOpPercentSignKeyword_1_0_0_1_0_3()); 
                    }
                    match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1210:1: rule__UnaryExpression__Alternatives : ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ruleMemberCall ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1214:1: ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ruleMemberCall ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25||LA11_0==30) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_FLOAT)||LA11_0==36) ) {
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
                    // InternalPortugol.g:1215:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    {
                    // InternalPortugol.g:1215:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    // InternalPortugol.g:1216:3: ( rule__UnaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    }
                    // InternalPortugol.g:1217:3: ( rule__UnaryExpression__Group_0__0 )
                    // InternalPortugol.g:1217:4: rule__UnaryExpression__Group_0__0
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
                    // InternalPortugol.g:1221:2: ( ruleMemberCall )
                    {
                    // InternalPortugol.g:1221:2: ( ruleMemberCall )
                    // InternalPortugol.g:1222:3: ruleMemberCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getMemberCallParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMemberCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExpressionAccess().getMemberCallParserRuleCall_1()); 
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
    // InternalPortugol.g:1231:1: rule__UnaryExpression__OpAlternatives_0_1_0 : ( ( 'NOT' ) | ( '-' ) );
    public final void rule__UnaryExpression__OpAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1235:1: ( ( 'NOT' ) | ( '-' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
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
                    // InternalPortugol.g:1236:2: ( 'NOT' )
                    {
                    // InternalPortugol.g:1236:2: ( 'NOT' )
                    // InternalPortugol.g:1237:3: 'NOT'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getOpNOTKeyword_0_1_0_0()); 
                    }
                    match(input,30,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExpressionAccess().getOpNOTKeyword_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPortugol.g:1242:2: ( '-' )
                    {
                    // InternalPortugol.g:1242:2: ( '-' )
                    // InternalPortugol.g:1243:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getOpHyphenMinusKeyword_0_1_0_1()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1252:1: rule__PrimaryExpression__Alternatives : ( ( ruleLiteral ) | ( ruleFunctionCall ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1256:1: ( ( ruleLiteral ) | ( ruleFunctionCall ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) )
            int alt13=3;
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
                alt13=2;
                }
                break;
            case 36:
                {
                alt13=3;
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
                    // InternalPortugol.g:1257:2: ( ruleLiteral )
                    {
                    // InternalPortugol.g:1257:2: ( ruleLiteral )
                    // InternalPortugol.g:1258:3: ruleLiteral
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
                    // InternalPortugol.g:1263:2: ( ruleFunctionCall )
                    {
                    // InternalPortugol.g:1263:2: ( ruleFunctionCall )
                    // InternalPortugol.g:1264:3: ruleFunctionCall
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
                    // InternalPortugol.g:1269:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // InternalPortugol.g:1269:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // InternalPortugol.g:1270:3: ( rule__PrimaryExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    }
                    // InternalPortugol.g:1271:3: ( rule__PrimaryExpression__Group_2__0 )
                    // InternalPortugol.g:1271:4: rule__PrimaryExpression__Group_2__0
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

            }
        }
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
    // InternalPortugol.g:1279:1: rule__Literal__Alternatives : ( ( ruleNumericLiteral ) | ( ruleStringExpression ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1283:1: ( ( ruleNumericLiteral ) | ( ruleStringExpression ) )
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
                    // InternalPortugol.g:1284:2: ( ruleNumericLiteral )
                    {
                    // InternalPortugol.g:1284:2: ( ruleNumericLiteral )
                    // InternalPortugol.g:1285:3: ruleNumericLiteral
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
                    // InternalPortugol.g:1290:2: ( ruleStringExpression )
                    {
                    // InternalPortugol.g:1290:2: ( ruleStringExpression )
                    // InternalPortugol.g:1291:3: ruleStringExpression
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
    // InternalPortugol.g:1300:1: rule__NumericLiteral__Alternatives : ( ( ( rule__NumericLiteral__IntValueAssignment_0 ) ) | ( ( rule__NumericLiteral__FloatValueAssignment_1 ) ) );
    public final void rule__NumericLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1304:1: ( ( ( rule__NumericLiteral__IntValueAssignment_0 ) ) | ( ( rule__NumericLiteral__FloatValueAssignment_1 ) ) )
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
                    // InternalPortugol.g:1305:2: ( ( rule__NumericLiteral__IntValueAssignment_0 ) )
                    {
                    // InternalPortugol.g:1305:2: ( ( rule__NumericLiteral__IntValueAssignment_0 ) )
                    // InternalPortugol.g:1306:3: ( rule__NumericLiteral__IntValueAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericLiteralAccess().getIntValueAssignment_0()); 
                    }
                    // InternalPortugol.g:1307:3: ( rule__NumericLiteral__IntValueAssignment_0 )
                    // InternalPortugol.g:1307:4: rule__NumericLiteral__IntValueAssignment_0
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
                    // InternalPortugol.g:1311:2: ( ( rule__NumericLiteral__FloatValueAssignment_1 ) )
                    {
                    // InternalPortugol.g:1311:2: ( ( rule__NumericLiteral__FloatValueAssignment_1 ) )
                    // InternalPortugol.g:1312:3: ( rule__NumericLiteral__FloatValueAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericLiteralAccess().getFloatValueAssignment_1()); 
                    }
                    // InternalPortugol.g:1313:3: ( rule__NumericLiteral__FloatValueAssignment_1 )
                    // InternalPortugol.g:1313:4: rule__NumericLiteral__FloatValueAssignment_1
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
    // InternalPortugol.g:1321:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1325:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalPortugol.g:1326:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalPortugol.g:1333:1: rule__Model__Group__0__Impl : ( ( rule__Model__HeaderAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1337:1: ( ( ( rule__Model__HeaderAssignment_0 ) ) )
            // InternalPortugol.g:1338:1: ( ( rule__Model__HeaderAssignment_0 ) )
            {
            // InternalPortugol.g:1338:1: ( ( rule__Model__HeaderAssignment_0 ) )
            // InternalPortugol.g:1339:2: ( rule__Model__HeaderAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getHeaderAssignment_0()); 
            }
            // InternalPortugol.g:1340:2: ( rule__Model__HeaderAssignment_0 )
            // InternalPortugol.g:1340:3: rule__Model__HeaderAssignment_0
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
    // InternalPortugol.g:1348:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1352:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalPortugol.g:1353:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalPortugol.g:1360:1: rule__Model__Group__1__Impl : ( ( rule__Model__GlobalDeclarationsAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1364:1: ( ( ( rule__Model__GlobalDeclarationsAssignment_1 ) ) )
            // InternalPortugol.g:1365:1: ( ( rule__Model__GlobalDeclarationsAssignment_1 ) )
            {
            // InternalPortugol.g:1365:1: ( ( rule__Model__GlobalDeclarationsAssignment_1 ) )
            // InternalPortugol.g:1366:2: ( rule__Model__GlobalDeclarationsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGlobalDeclarationsAssignment_1()); 
            }
            // InternalPortugol.g:1367:2: ( rule__Model__GlobalDeclarationsAssignment_1 )
            // InternalPortugol.g:1367:3: rule__Model__GlobalDeclarationsAssignment_1
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
    // InternalPortugol.g:1375:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1379:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalPortugol.g:1380:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalPortugol.g:1387:1: rule__Model__Group__2__Impl : ( ( rule__Model__SubprogramsAssignment_2 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1391:1: ( ( ( rule__Model__SubprogramsAssignment_2 )? ) )
            // InternalPortugol.g:1392:1: ( ( rule__Model__SubprogramsAssignment_2 )? )
            {
            // InternalPortugol.g:1392:1: ( ( rule__Model__SubprogramsAssignment_2 )? )
            // InternalPortugol.g:1393:2: ( rule__Model__SubprogramsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSubprogramsAssignment_2()); 
            }
            // InternalPortugol.g:1394:2: ( rule__Model__SubprogramsAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35||LA16_0==40) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPortugol.g:1394:3: rule__Model__SubprogramsAssignment_2
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
    // InternalPortugol.g:1402:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1406:1: ( rule__Model__Group__3__Impl )
            // InternalPortugol.g:1407:2: rule__Model__Group__3__Impl
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
    // InternalPortugol.g:1413:1: rule__Model__Group__3__Impl : ( ( rule__Model__CommandsAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1417:1: ( ( ( rule__Model__CommandsAssignment_3 ) ) )
            // InternalPortugol.g:1418:1: ( ( rule__Model__CommandsAssignment_3 ) )
            {
            // InternalPortugol.g:1418:1: ( ( rule__Model__CommandsAssignment_3 ) )
            // InternalPortugol.g:1419:2: ( rule__Model__CommandsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getCommandsAssignment_3()); 
            }
            // InternalPortugol.g:1420:2: ( rule__Model__CommandsAssignment_3 )
            // InternalPortugol.g:1420:3: rule__Model__CommandsAssignment_3
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
    // InternalPortugol.g:1429:1: rule__HeaderBlock__Group__0 : rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1 ;
    public final void rule__HeaderBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1433:1: ( rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1 )
            // InternalPortugol.g:1434:2: rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1
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
    // InternalPortugol.g:1441:1: rule__HeaderBlock__Group__0__Impl : ( 'algoritmo' ) ;
    public final void rule__HeaderBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1445:1: ( ( 'algoritmo' ) )
            // InternalPortugol.g:1446:1: ( 'algoritmo' )
            {
            // InternalPortugol.g:1446:1: ( 'algoritmo' )
            // InternalPortugol.g:1447:2: 'algoritmo'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderBlockAccess().getAlgoritmoKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1456:1: rule__HeaderBlock__Group__1 : rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2 ;
    public final void rule__HeaderBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1460:1: ( rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2 )
            // InternalPortugol.g:1461:2: rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2
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
    // InternalPortugol.g:1468:1: rule__HeaderBlock__Group__1__Impl : ( ( rule__HeaderBlock__NameAssignment_1 ) ) ;
    public final void rule__HeaderBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1472:1: ( ( ( rule__HeaderBlock__NameAssignment_1 ) ) )
            // InternalPortugol.g:1473:1: ( ( rule__HeaderBlock__NameAssignment_1 ) )
            {
            // InternalPortugol.g:1473:1: ( ( rule__HeaderBlock__NameAssignment_1 ) )
            // InternalPortugol.g:1474:2: ( rule__HeaderBlock__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeaderBlockAccess().getNameAssignment_1()); 
            }
            // InternalPortugol.g:1475:2: ( rule__HeaderBlock__NameAssignment_1 )
            // InternalPortugol.g:1475:3: rule__HeaderBlock__NameAssignment_1
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
    // InternalPortugol.g:1483:1: rule__HeaderBlock__Group__2 : rule__HeaderBlock__Group__2__Impl ;
    public final void rule__HeaderBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1487:1: ( rule__HeaderBlock__Group__2__Impl )
            // InternalPortugol.g:1488:2: rule__HeaderBlock__Group__2__Impl
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
    // InternalPortugol.g:1494:1: rule__HeaderBlock__Group__2__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__HeaderBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1498:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:1499:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:1499:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:1500:2: RULE_END_COMMAND
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
    // InternalPortugol.g:1510:1: rule__DeclarationsBlock__Group__0 : rule__DeclarationsBlock__Group__0__Impl rule__DeclarationsBlock__Group__1 ;
    public final void rule__DeclarationsBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1514:1: ( rule__DeclarationsBlock__Group__0__Impl rule__DeclarationsBlock__Group__1 )
            // InternalPortugol.g:1515:2: rule__DeclarationsBlock__Group__0__Impl rule__DeclarationsBlock__Group__1
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
    // InternalPortugol.g:1522:1: rule__DeclarationsBlock__Group__0__Impl : ( 'var' ) ;
    public final void rule__DeclarationsBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1526:1: ( ( 'var' ) )
            // InternalPortugol.g:1527:1: ( 'var' )
            {
            // InternalPortugol.g:1527:1: ( 'var' )
            // InternalPortugol.g:1528:2: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getVarKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1537:1: rule__DeclarationsBlock__Group__1 : rule__DeclarationsBlock__Group__1__Impl rule__DeclarationsBlock__Group__2 ;
    public final void rule__DeclarationsBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1541:1: ( rule__DeclarationsBlock__Group__1__Impl rule__DeclarationsBlock__Group__2 )
            // InternalPortugol.g:1542:2: rule__DeclarationsBlock__Group__1__Impl rule__DeclarationsBlock__Group__2
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
    // InternalPortugol.g:1549:1: rule__DeclarationsBlock__Group__1__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__DeclarationsBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1553:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:1554:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:1554:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:1555:2: RULE_END_COMMAND
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
    // InternalPortugol.g:1564:1: rule__DeclarationsBlock__Group__2 : rule__DeclarationsBlock__Group__2__Impl ;
    public final void rule__DeclarationsBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1568:1: ( rule__DeclarationsBlock__Group__2__Impl )
            // InternalPortugol.g:1569:2: rule__DeclarationsBlock__Group__2__Impl
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
    // InternalPortugol.g:1575:1: rule__DeclarationsBlock__Group__2__Impl : ( ( ( rule__DeclarationsBlock__Group_2__0 ) ) ( ( rule__DeclarationsBlock__Group_2__0 )* ) ) ;
    public final void rule__DeclarationsBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1579:1: ( ( ( ( rule__DeclarationsBlock__Group_2__0 ) ) ( ( rule__DeclarationsBlock__Group_2__0 )* ) ) )
            // InternalPortugol.g:1580:1: ( ( ( rule__DeclarationsBlock__Group_2__0 ) ) ( ( rule__DeclarationsBlock__Group_2__0 )* ) )
            {
            // InternalPortugol.g:1580:1: ( ( ( rule__DeclarationsBlock__Group_2__0 ) ) ( ( rule__DeclarationsBlock__Group_2__0 )* ) )
            // InternalPortugol.g:1581:2: ( ( rule__DeclarationsBlock__Group_2__0 ) ) ( ( rule__DeclarationsBlock__Group_2__0 )* )
            {
            // InternalPortugol.g:1581:2: ( ( rule__DeclarationsBlock__Group_2__0 ) )
            // InternalPortugol.g:1582:3: ( rule__DeclarationsBlock__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getGroup_2()); 
            }
            // InternalPortugol.g:1583:3: ( rule__DeclarationsBlock__Group_2__0 )
            // InternalPortugol.g:1583:4: rule__DeclarationsBlock__Group_2__0
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

            // InternalPortugol.g:1586:2: ( ( rule__DeclarationsBlock__Group_2__0 )* )
            // InternalPortugol.g:1587:3: ( rule__DeclarationsBlock__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getGroup_2()); 
            }
            // InternalPortugol.g:1588:3: ( rule__DeclarationsBlock__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPortugol.g:1588:4: rule__DeclarationsBlock__Group_2__0
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
    // InternalPortugol.g:1598:1: rule__DeclarationsBlock__Group_2__0 : rule__DeclarationsBlock__Group_2__0__Impl rule__DeclarationsBlock__Group_2__1 ;
    public final void rule__DeclarationsBlock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1602:1: ( rule__DeclarationsBlock__Group_2__0__Impl rule__DeclarationsBlock__Group_2__1 )
            // InternalPortugol.g:1603:2: rule__DeclarationsBlock__Group_2__0__Impl rule__DeclarationsBlock__Group_2__1
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
    // InternalPortugol.g:1610:1: rule__DeclarationsBlock__Group_2__0__Impl : ( ( rule__DeclarationsBlock__VarsAssignment_2_0 ) ) ;
    public final void rule__DeclarationsBlock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1614:1: ( ( ( rule__DeclarationsBlock__VarsAssignment_2_0 ) ) )
            // InternalPortugol.g:1615:1: ( ( rule__DeclarationsBlock__VarsAssignment_2_0 ) )
            {
            // InternalPortugol.g:1615:1: ( ( rule__DeclarationsBlock__VarsAssignment_2_0 ) )
            // InternalPortugol.g:1616:2: ( rule__DeclarationsBlock__VarsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationsBlockAccess().getVarsAssignment_2_0()); 
            }
            // InternalPortugol.g:1617:2: ( rule__DeclarationsBlock__VarsAssignment_2_0 )
            // InternalPortugol.g:1617:3: rule__DeclarationsBlock__VarsAssignment_2_0
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
    // InternalPortugol.g:1625:1: rule__DeclarationsBlock__Group_2__1 : rule__DeclarationsBlock__Group_2__1__Impl ;
    public final void rule__DeclarationsBlock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1629:1: ( rule__DeclarationsBlock__Group_2__1__Impl )
            // InternalPortugol.g:1630:2: rule__DeclarationsBlock__Group_2__1__Impl
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
    // InternalPortugol.g:1636:1: rule__DeclarationsBlock__Group_2__1__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__DeclarationsBlock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1640:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:1641:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:1641:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:1642:2: RULE_END_COMMAND
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
    // InternalPortugol.g:1652:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1656:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalPortugol.g:1657:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalPortugol.g:1664:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__VarDeclarationAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1668:1: ( ( ( rule__Variable__VarDeclarationAssignment_0 ) ) )
            // InternalPortugol.g:1669:1: ( ( rule__Variable__VarDeclarationAssignment_0 ) )
            {
            // InternalPortugol.g:1669:1: ( ( rule__Variable__VarDeclarationAssignment_0 ) )
            // InternalPortugol.g:1670:2: ( rule__Variable__VarDeclarationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getVarDeclarationAssignment_0()); 
            }
            // InternalPortugol.g:1671:2: ( rule__Variable__VarDeclarationAssignment_0 )
            // InternalPortugol.g:1671:3: rule__Variable__VarDeclarationAssignment_0
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
    // InternalPortugol.g:1679:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1683:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalPortugol.g:1684:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
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
    // InternalPortugol.g:1691:1: rule__Variable__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1695:1: ( ( ':' ) )
            // InternalPortugol.g:1696:1: ( ':' )
            {
            // InternalPortugol.g:1696:1: ( ':' )
            // InternalPortugol.g:1697:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getColonKeyword_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1706:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1710:1: ( rule__Variable__Group__2__Impl )
            // InternalPortugol.g:1711:2: rule__Variable__Group__2__Impl
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
    // InternalPortugol.g:1717:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__TypeAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1721:1: ( ( ( rule__Variable__TypeAssignment_2 ) ) )
            // InternalPortugol.g:1722:1: ( ( rule__Variable__TypeAssignment_2 ) )
            {
            // InternalPortugol.g:1722:1: ( ( rule__Variable__TypeAssignment_2 ) )
            // InternalPortugol.g:1723:2: ( rule__Variable__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getTypeAssignment_2()); 
            }
            // InternalPortugol.g:1724:2: ( rule__Variable__TypeAssignment_2 )
            // InternalPortugol.g:1724:3: rule__Variable__TypeAssignment_2
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
    // InternalPortugol.g:1733:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1737:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // InternalPortugol.g:1738:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
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
    // InternalPortugol.g:1745:1: rule__VarDeclaration__Group__0__Impl : ( ( rule__VarDeclaration__VarsAssignment_0 ) ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1749:1: ( ( ( rule__VarDeclaration__VarsAssignment_0 ) ) )
            // InternalPortugol.g:1750:1: ( ( rule__VarDeclaration__VarsAssignment_0 ) )
            {
            // InternalPortugol.g:1750:1: ( ( rule__VarDeclaration__VarsAssignment_0 ) )
            // InternalPortugol.g:1751:2: ( rule__VarDeclaration__VarsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getVarsAssignment_0()); 
            }
            // InternalPortugol.g:1752:2: ( rule__VarDeclaration__VarsAssignment_0 )
            // InternalPortugol.g:1752:3: rule__VarDeclaration__VarsAssignment_0
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
    // InternalPortugol.g:1760:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1764:1: ( rule__VarDeclaration__Group__1__Impl )
            // InternalPortugol.g:1765:2: rule__VarDeclaration__Group__1__Impl
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
    // InternalPortugol.g:1771:1: rule__VarDeclaration__Group__1__Impl : ( ( rule__VarDeclaration__Group_1__0 )* ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1775:1: ( ( ( rule__VarDeclaration__Group_1__0 )* ) )
            // InternalPortugol.g:1776:1: ( ( rule__VarDeclaration__Group_1__0 )* )
            {
            // InternalPortugol.g:1776:1: ( ( rule__VarDeclaration__Group_1__0 )* )
            // InternalPortugol.g:1777:2: ( rule__VarDeclaration__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getGroup_1()); 
            }
            // InternalPortugol.g:1778:2: ( rule__VarDeclaration__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPortugol.g:1778:3: rule__VarDeclaration__Group_1__0
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
    // InternalPortugol.g:1787:1: rule__VarDeclaration__Group_1__0 : rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1 ;
    public final void rule__VarDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1791:1: ( rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1 )
            // InternalPortugol.g:1792:2: rule__VarDeclaration__Group_1__0__Impl rule__VarDeclaration__Group_1__1
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
    // InternalPortugol.g:1799:1: rule__VarDeclaration__Group_1__0__Impl : ( ',' ) ;
    public final void rule__VarDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1803:1: ( ( ',' ) )
            // InternalPortugol.g:1804:1: ( ',' )
            {
            // InternalPortugol.g:1804:1: ( ',' )
            // InternalPortugol.g:1805:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getCommaKeyword_1_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1814:1: rule__VarDeclaration__Group_1__1 : rule__VarDeclaration__Group_1__1__Impl ;
    public final void rule__VarDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1818:1: ( rule__VarDeclaration__Group_1__1__Impl )
            // InternalPortugol.g:1819:2: rule__VarDeclaration__Group_1__1__Impl
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
    // InternalPortugol.g:1825:1: rule__VarDeclaration__Group_1__1__Impl : ( ( rule__VarDeclaration__VarsAssignment_1_1 ) ) ;
    public final void rule__VarDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1829:1: ( ( ( rule__VarDeclaration__VarsAssignment_1_1 ) ) )
            // InternalPortugol.g:1830:1: ( ( rule__VarDeclaration__VarsAssignment_1_1 ) )
            {
            // InternalPortugol.g:1830:1: ( ( rule__VarDeclaration__VarsAssignment_1_1 ) )
            // InternalPortugol.g:1831:2: ( rule__VarDeclaration__VarsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclarationAccess().getVarsAssignment_1_1()); 
            }
            // InternalPortugol.g:1832:2: ( rule__VarDeclaration__VarsAssignment_1_1 )
            // InternalPortugol.g:1832:3: rule__VarDeclaration__VarsAssignment_1_1
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
    // InternalPortugol.g:1841:1: rule__DeclaredVar__Group__0 : rule__DeclaredVar__Group__0__Impl rule__DeclaredVar__Group__1 ;
    public final void rule__DeclaredVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1845:1: ( rule__DeclaredVar__Group__0__Impl rule__DeclaredVar__Group__1 )
            // InternalPortugol.g:1846:2: rule__DeclaredVar__Group__0__Impl rule__DeclaredVar__Group__1
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
    // InternalPortugol.g:1853:1: rule__DeclaredVar__Group__0__Impl : ( ( rule__DeclaredVar__VarsAssignment_0 ) ) ;
    public final void rule__DeclaredVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1857:1: ( ( ( rule__DeclaredVar__VarsAssignment_0 ) ) )
            // InternalPortugol.g:1858:1: ( ( rule__DeclaredVar__VarsAssignment_0 ) )
            {
            // InternalPortugol.g:1858:1: ( ( rule__DeclaredVar__VarsAssignment_0 ) )
            // InternalPortugol.g:1859:2: ( rule__DeclaredVar__VarsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getVarsAssignment_0()); 
            }
            // InternalPortugol.g:1860:2: ( rule__DeclaredVar__VarsAssignment_0 )
            // InternalPortugol.g:1860:3: rule__DeclaredVar__VarsAssignment_0
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
    // InternalPortugol.g:1868:1: rule__DeclaredVar__Group__1 : rule__DeclaredVar__Group__1__Impl ;
    public final void rule__DeclaredVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1872:1: ( rule__DeclaredVar__Group__1__Impl )
            // InternalPortugol.g:1873:2: rule__DeclaredVar__Group__1__Impl
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
    // InternalPortugol.g:1879:1: rule__DeclaredVar__Group__1__Impl : ( ( rule__DeclaredVar__Group_1__0 )* ) ;
    public final void rule__DeclaredVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1883:1: ( ( ( rule__DeclaredVar__Group_1__0 )* ) )
            // InternalPortugol.g:1884:1: ( ( rule__DeclaredVar__Group_1__0 )* )
            {
            // InternalPortugol.g:1884:1: ( ( rule__DeclaredVar__Group_1__0 )* )
            // InternalPortugol.g:1885:2: ( rule__DeclaredVar__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getGroup_1()); 
            }
            // InternalPortugol.g:1886:2: ( rule__DeclaredVar__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPortugol.g:1886:3: rule__DeclaredVar__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__DeclaredVar__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalPortugol.g:1895:1: rule__DeclaredVar__Group_1__0 : rule__DeclaredVar__Group_1__0__Impl rule__DeclaredVar__Group_1__1 ;
    public final void rule__DeclaredVar__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1899:1: ( rule__DeclaredVar__Group_1__0__Impl rule__DeclaredVar__Group_1__1 )
            // InternalPortugol.g:1900:2: rule__DeclaredVar__Group_1__0__Impl rule__DeclaredVar__Group_1__1
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
    // InternalPortugol.g:1907:1: rule__DeclaredVar__Group_1__0__Impl : ( ',' ) ;
    public final void rule__DeclaredVar__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1911:1: ( ( ',' ) )
            // InternalPortugol.g:1912:1: ( ',' )
            {
            // InternalPortugol.g:1912:1: ( ',' )
            // InternalPortugol.g:1913:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getCommaKeyword_1_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1922:1: rule__DeclaredVar__Group_1__1 : rule__DeclaredVar__Group_1__1__Impl ;
    public final void rule__DeclaredVar__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1926:1: ( rule__DeclaredVar__Group_1__1__Impl )
            // InternalPortugol.g:1927:2: rule__DeclaredVar__Group_1__1__Impl
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
    // InternalPortugol.g:1933:1: rule__DeclaredVar__Group_1__1__Impl : ( ( rule__DeclaredVar__VarsAssignment_1_1 ) ) ;
    public final void rule__DeclaredVar__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1937:1: ( ( ( rule__DeclaredVar__VarsAssignment_1_1 ) ) )
            // InternalPortugol.g:1938:1: ( ( rule__DeclaredVar__VarsAssignment_1_1 ) )
            {
            // InternalPortugol.g:1938:1: ( ( rule__DeclaredVar__VarsAssignment_1_1 ) )
            // InternalPortugol.g:1939:2: ( rule__DeclaredVar__VarsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getVarsAssignment_1_1()); 
            }
            // InternalPortugol.g:1940:2: ( rule__DeclaredVar__VarsAssignment_1_1 )
            // InternalPortugol.g:1940:3: rule__DeclaredVar__VarsAssignment_1_1
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
    // InternalPortugol.g:1949:1: rule__BlockFunction__Group__0 : rule__BlockFunction__Group__0__Impl rule__BlockFunction__Group__1 ;
    public final void rule__BlockFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1953:1: ( rule__BlockFunction__Group__0__Impl rule__BlockFunction__Group__1 )
            // InternalPortugol.g:1954:2: rule__BlockFunction__Group__0__Impl rule__BlockFunction__Group__1
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
    // InternalPortugol.g:1961:1: rule__BlockFunction__Group__0__Impl : ( 'funcao' ) ;
    public final void rule__BlockFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1965:1: ( ( 'funcao' ) )
            // InternalPortugol.g:1966:1: ( 'funcao' )
            {
            // InternalPortugol.g:1966:1: ( 'funcao' )
            // InternalPortugol.g:1967:2: 'funcao'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getFuncaoKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:1976:1: rule__BlockFunction__Group__1 : rule__BlockFunction__Group__1__Impl rule__BlockFunction__Group__2 ;
    public final void rule__BlockFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1980:1: ( rule__BlockFunction__Group__1__Impl rule__BlockFunction__Group__2 )
            // InternalPortugol.g:1981:2: rule__BlockFunction__Group__1__Impl rule__BlockFunction__Group__2
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
    // InternalPortugol.g:1988:1: rule__BlockFunction__Group__1__Impl : ( ( rule__BlockFunction__FunctionNameAssignment_1 ) ) ;
    public final void rule__BlockFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:1992:1: ( ( ( rule__BlockFunction__FunctionNameAssignment_1 ) ) )
            // InternalPortugol.g:1993:1: ( ( rule__BlockFunction__FunctionNameAssignment_1 ) )
            {
            // InternalPortugol.g:1993:1: ( ( rule__BlockFunction__FunctionNameAssignment_1 ) )
            // InternalPortugol.g:1994:2: ( rule__BlockFunction__FunctionNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getFunctionNameAssignment_1()); 
            }
            // InternalPortugol.g:1995:2: ( rule__BlockFunction__FunctionNameAssignment_1 )
            // InternalPortugol.g:1995:3: rule__BlockFunction__FunctionNameAssignment_1
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
    // InternalPortugol.g:2003:1: rule__BlockFunction__Group__2 : rule__BlockFunction__Group__2__Impl rule__BlockFunction__Group__3 ;
    public final void rule__BlockFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2007:1: ( rule__BlockFunction__Group__2__Impl rule__BlockFunction__Group__3 )
            // InternalPortugol.g:2008:2: rule__BlockFunction__Group__2__Impl rule__BlockFunction__Group__3
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
    // InternalPortugol.g:2015:1: rule__BlockFunction__Group__2__Impl : ( '(' ) ;
    public final void rule__BlockFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2019:1: ( ( '(' ) )
            // InternalPortugol.g:2020:1: ( '(' )
            {
            // InternalPortugol.g:2020:1: ( '(' )
            // InternalPortugol.g:2021:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2030:1: rule__BlockFunction__Group__3 : rule__BlockFunction__Group__3__Impl rule__BlockFunction__Group__4 ;
    public final void rule__BlockFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2034:1: ( rule__BlockFunction__Group__3__Impl rule__BlockFunction__Group__4 )
            // InternalPortugol.g:2035:2: rule__BlockFunction__Group__3__Impl rule__BlockFunction__Group__4
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
    // InternalPortugol.g:2042:1: rule__BlockFunction__Group__3__Impl : ( ( rule__BlockFunction__ParamListAssignment_3 ) ) ;
    public final void rule__BlockFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2046:1: ( ( ( rule__BlockFunction__ParamListAssignment_3 ) ) )
            // InternalPortugol.g:2047:1: ( ( rule__BlockFunction__ParamListAssignment_3 ) )
            {
            // InternalPortugol.g:2047:1: ( ( rule__BlockFunction__ParamListAssignment_3 ) )
            // InternalPortugol.g:2048:2: ( rule__BlockFunction__ParamListAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getParamListAssignment_3()); 
            }
            // InternalPortugol.g:2049:2: ( rule__BlockFunction__ParamListAssignment_3 )
            // InternalPortugol.g:2049:3: rule__BlockFunction__ParamListAssignment_3
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
    // InternalPortugol.g:2057:1: rule__BlockFunction__Group__4 : rule__BlockFunction__Group__4__Impl rule__BlockFunction__Group__5 ;
    public final void rule__BlockFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2061:1: ( rule__BlockFunction__Group__4__Impl rule__BlockFunction__Group__5 )
            // InternalPortugol.g:2062:2: rule__BlockFunction__Group__4__Impl rule__BlockFunction__Group__5
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
    // InternalPortugol.g:2069:1: rule__BlockFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__BlockFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2073:1: ( ( ')' ) )
            // InternalPortugol.g:2074:1: ( ')' )
            {
            // InternalPortugol.g:2074:1: ( ')' )
            // InternalPortugol.g:2075:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2084:1: rule__BlockFunction__Group__5 : rule__BlockFunction__Group__5__Impl rule__BlockFunction__Group__6 ;
    public final void rule__BlockFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2088:1: ( rule__BlockFunction__Group__5__Impl rule__BlockFunction__Group__6 )
            // InternalPortugol.g:2089:2: rule__BlockFunction__Group__5__Impl rule__BlockFunction__Group__6
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
    // InternalPortugol.g:2096:1: rule__BlockFunction__Group__5__Impl : ( ':' ) ;
    public final void rule__BlockFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2100:1: ( ( ':' ) )
            // InternalPortugol.g:2101:1: ( ':' )
            {
            // InternalPortugol.g:2101:1: ( ':' )
            // InternalPortugol.g:2102:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getColonKeyword_5()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2111:1: rule__BlockFunction__Group__6 : rule__BlockFunction__Group__6__Impl rule__BlockFunction__Group__7 ;
    public final void rule__BlockFunction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2115:1: ( rule__BlockFunction__Group__6__Impl rule__BlockFunction__Group__7 )
            // InternalPortugol.g:2116:2: rule__BlockFunction__Group__6__Impl rule__BlockFunction__Group__7
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
    // InternalPortugol.g:2123:1: rule__BlockFunction__Group__6__Impl : ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) ) ;
    public final void rule__BlockFunction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2127:1: ( ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) ) )
            // InternalPortugol.g:2128:1: ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) )
            {
            // InternalPortugol.g:2128:1: ( ( rule__BlockFunction__ReturnTypeAssignment_6 ) )
            // InternalPortugol.g:2129:2: ( rule__BlockFunction__ReturnTypeAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getReturnTypeAssignment_6()); 
            }
            // InternalPortugol.g:2130:2: ( rule__BlockFunction__ReturnTypeAssignment_6 )
            // InternalPortugol.g:2130:3: rule__BlockFunction__ReturnTypeAssignment_6
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
    // InternalPortugol.g:2138:1: rule__BlockFunction__Group__7 : rule__BlockFunction__Group__7__Impl rule__BlockFunction__Group__8 ;
    public final void rule__BlockFunction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2142:1: ( rule__BlockFunction__Group__7__Impl rule__BlockFunction__Group__8 )
            // InternalPortugol.g:2143:2: rule__BlockFunction__Group__7__Impl rule__BlockFunction__Group__8
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
    // InternalPortugol.g:2150:1: rule__BlockFunction__Group__7__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__BlockFunction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2154:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2155:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2155:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2156:2: RULE_END_COMMAND
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
    // InternalPortugol.g:2165:1: rule__BlockFunction__Group__8 : rule__BlockFunction__Group__8__Impl rule__BlockFunction__Group__9 ;
    public final void rule__BlockFunction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2169:1: ( rule__BlockFunction__Group__8__Impl rule__BlockFunction__Group__9 )
            // InternalPortugol.g:2170:2: rule__BlockFunction__Group__8__Impl rule__BlockFunction__Group__9
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
    // InternalPortugol.g:2177:1: rule__BlockFunction__Group__8__Impl : ( ( rule__BlockFunction__DeclarationsAssignment_8 )? ) ;
    public final void rule__BlockFunction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2181:1: ( ( ( rule__BlockFunction__DeclarationsAssignment_8 )? ) )
            // InternalPortugol.g:2182:1: ( ( rule__BlockFunction__DeclarationsAssignment_8 )? )
            {
            // InternalPortugol.g:2182:1: ( ( rule__BlockFunction__DeclarationsAssignment_8 )? )
            // InternalPortugol.g:2183:2: ( rule__BlockFunction__DeclarationsAssignment_8 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getDeclarationsAssignment_8()); 
            }
            // InternalPortugol.g:2184:2: ( rule__BlockFunction__DeclarationsAssignment_8 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPortugol.g:2184:3: rule__BlockFunction__DeclarationsAssignment_8
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
    // InternalPortugol.g:2192:1: rule__BlockFunction__Group__9 : rule__BlockFunction__Group__9__Impl rule__BlockFunction__Group__10 ;
    public final void rule__BlockFunction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2196:1: ( rule__BlockFunction__Group__9__Impl rule__BlockFunction__Group__10 )
            // InternalPortugol.g:2197:2: rule__BlockFunction__Group__9__Impl rule__BlockFunction__Group__10
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
    // InternalPortugol.g:2204:1: rule__BlockFunction__Group__9__Impl : ( 'inicio' ) ;
    public final void rule__BlockFunction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2208:1: ( ( 'inicio' ) )
            // InternalPortugol.g:2209:1: ( 'inicio' )
            {
            // InternalPortugol.g:2209:1: ( 'inicio' )
            // InternalPortugol.g:2210:2: 'inicio'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getInicioKeyword_9()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2219:1: rule__BlockFunction__Group__10 : rule__BlockFunction__Group__10__Impl rule__BlockFunction__Group__11 ;
    public final void rule__BlockFunction__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2223:1: ( rule__BlockFunction__Group__10__Impl rule__BlockFunction__Group__11 )
            // InternalPortugol.g:2224:2: rule__BlockFunction__Group__10__Impl rule__BlockFunction__Group__11
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
    // InternalPortugol.g:2231:1: rule__BlockFunction__Group__10__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__BlockFunction__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2235:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2236:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2236:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2237:2: RULE_END_COMMAND
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
    // InternalPortugol.g:2246:1: rule__BlockFunction__Group__11 : rule__BlockFunction__Group__11__Impl rule__BlockFunction__Group__12 ;
    public final void rule__BlockFunction__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2250:1: ( rule__BlockFunction__Group__11__Impl rule__BlockFunction__Group__12 )
            // InternalPortugol.g:2251:2: rule__BlockFunction__Group__11__Impl rule__BlockFunction__Group__12
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
    // InternalPortugol.g:2258:1: rule__BlockFunction__Group__11__Impl : ( ( ( rule__BlockFunction__CommandsAssignment_11 ) ) ( ( rule__BlockFunction__CommandsAssignment_11 )* ) ) ;
    public final void rule__BlockFunction__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2262:1: ( ( ( ( rule__BlockFunction__CommandsAssignment_11 ) ) ( ( rule__BlockFunction__CommandsAssignment_11 )* ) ) )
            // InternalPortugol.g:2263:1: ( ( ( rule__BlockFunction__CommandsAssignment_11 ) ) ( ( rule__BlockFunction__CommandsAssignment_11 )* ) )
            {
            // InternalPortugol.g:2263:1: ( ( ( rule__BlockFunction__CommandsAssignment_11 ) ) ( ( rule__BlockFunction__CommandsAssignment_11 )* ) )
            // InternalPortugol.g:2264:2: ( ( rule__BlockFunction__CommandsAssignment_11 ) ) ( ( rule__BlockFunction__CommandsAssignment_11 )* )
            {
            // InternalPortugol.g:2264:2: ( ( rule__BlockFunction__CommandsAssignment_11 ) )
            // InternalPortugol.g:2265:3: ( rule__BlockFunction__CommandsAssignment_11 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getCommandsAssignment_11()); 
            }
            // InternalPortugol.g:2266:3: ( rule__BlockFunction__CommandsAssignment_11 )
            // InternalPortugol.g:2266:4: rule__BlockFunction__CommandsAssignment_11
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

            // InternalPortugol.g:2269:2: ( ( rule__BlockFunction__CommandsAssignment_11 )* )
            // InternalPortugol.g:2270:3: ( rule__BlockFunction__CommandsAssignment_11 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getCommandsAssignment_11()); 
            }
            // InternalPortugol.g:2271:3: ( rule__BlockFunction__CommandsAssignment_11 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_FLOAT)||LA21_0==25||LA21_0==30||LA21_0==36||(LA21_0>=43 && LA21_0<=44)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPortugol.g:2271:4: rule__BlockFunction__CommandsAssignment_11
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
    // InternalPortugol.g:2280:1: rule__BlockFunction__Group__12 : rule__BlockFunction__Group__12__Impl rule__BlockFunction__Group__13 ;
    public final void rule__BlockFunction__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2284:1: ( rule__BlockFunction__Group__12__Impl rule__BlockFunction__Group__13 )
            // InternalPortugol.g:2285:2: rule__BlockFunction__Group__12__Impl rule__BlockFunction__Group__13
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
    // InternalPortugol.g:2292:1: rule__BlockFunction__Group__12__Impl : ( 'fimfuncao' ) ;
    public final void rule__BlockFunction__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2296:1: ( ( 'fimfuncao' ) )
            // InternalPortugol.g:2297:1: ( 'fimfuncao' )
            {
            // InternalPortugol.g:2297:1: ( 'fimfuncao' )
            // InternalPortugol.g:2298:2: 'fimfuncao'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockFunctionAccess().getFimfuncaoKeyword_12()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2307:1: rule__BlockFunction__Group__13 : rule__BlockFunction__Group__13__Impl ;
    public final void rule__BlockFunction__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2311:1: ( rule__BlockFunction__Group__13__Impl )
            // InternalPortugol.g:2312:2: rule__BlockFunction__Group__13__Impl
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
    // InternalPortugol.g:2318:1: rule__BlockFunction__Group__13__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__BlockFunction__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2322:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2323:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2323:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2324:2: RULE_END_COMMAND
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
    // InternalPortugol.g:2334:1: rule__BlockProcedure__Group__0 : rule__BlockProcedure__Group__0__Impl rule__BlockProcedure__Group__1 ;
    public final void rule__BlockProcedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2338:1: ( rule__BlockProcedure__Group__0__Impl rule__BlockProcedure__Group__1 )
            // InternalPortugol.g:2339:2: rule__BlockProcedure__Group__0__Impl rule__BlockProcedure__Group__1
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
    // InternalPortugol.g:2346:1: rule__BlockProcedure__Group__0__Impl : ( 'procedimento' ) ;
    public final void rule__BlockProcedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2350:1: ( ( 'procedimento' ) )
            // InternalPortugol.g:2351:1: ( 'procedimento' )
            {
            // InternalPortugol.g:2351:1: ( 'procedimento' )
            // InternalPortugol.g:2352:2: 'procedimento'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getProcedimentoKeyword_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2361:1: rule__BlockProcedure__Group__1 : rule__BlockProcedure__Group__1__Impl rule__BlockProcedure__Group__2 ;
    public final void rule__BlockProcedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2365:1: ( rule__BlockProcedure__Group__1__Impl rule__BlockProcedure__Group__2 )
            // InternalPortugol.g:2366:2: rule__BlockProcedure__Group__1__Impl rule__BlockProcedure__Group__2
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
    // InternalPortugol.g:2373:1: rule__BlockProcedure__Group__1__Impl : ( ( rule__BlockProcedure__ProcedureAssignment_1 ) ) ;
    public final void rule__BlockProcedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2377:1: ( ( ( rule__BlockProcedure__ProcedureAssignment_1 ) ) )
            // InternalPortugol.g:2378:1: ( ( rule__BlockProcedure__ProcedureAssignment_1 ) )
            {
            // InternalPortugol.g:2378:1: ( ( rule__BlockProcedure__ProcedureAssignment_1 ) )
            // InternalPortugol.g:2379:2: ( rule__BlockProcedure__ProcedureAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getProcedureAssignment_1()); 
            }
            // InternalPortugol.g:2380:2: ( rule__BlockProcedure__ProcedureAssignment_1 )
            // InternalPortugol.g:2380:3: rule__BlockProcedure__ProcedureAssignment_1
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
    // InternalPortugol.g:2388:1: rule__BlockProcedure__Group__2 : rule__BlockProcedure__Group__2__Impl rule__BlockProcedure__Group__3 ;
    public final void rule__BlockProcedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2392:1: ( rule__BlockProcedure__Group__2__Impl rule__BlockProcedure__Group__3 )
            // InternalPortugol.g:2393:2: rule__BlockProcedure__Group__2__Impl rule__BlockProcedure__Group__3
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
    // InternalPortugol.g:2400:1: rule__BlockProcedure__Group__2__Impl : ( '(' ) ;
    public final void rule__BlockProcedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2404:1: ( ( '(' ) )
            // InternalPortugol.g:2405:1: ( '(' )
            {
            // InternalPortugol.g:2405:1: ( '(' )
            // InternalPortugol.g:2406:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2415:1: rule__BlockProcedure__Group__3 : rule__BlockProcedure__Group__3__Impl rule__BlockProcedure__Group__4 ;
    public final void rule__BlockProcedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2419:1: ( rule__BlockProcedure__Group__3__Impl rule__BlockProcedure__Group__4 )
            // InternalPortugol.g:2420:2: rule__BlockProcedure__Group__3__Impl rule__BlockProcedure__Group__4
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
    // InternalPortugol.g:2427:1: rule__BlockProcedure__Group__3__Impl : ( ( rule__BlockProcedure__ParamListAssignment_3 ) ) ;
    public final void rule__BlockProcedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2431:1: ( ( ( rule__BlockProcedure__ParamListAssignment_3 ) ) )
            // InternalPortugol.g:2432:1: ( ( rule__BlockProcedure__ParamListAssignment_3 ) )
            {
            // InternalPortugol.g:2432:1: ( ( rule__BlockProcedure__ParamListAssignment_3 ) )
            // InternalPortugol.g:2433:2: ( rule__BlockProcedure__ParamListAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getParamListAssignment_3()); 
            }
            // InternalPortugol.g:2434:2: ( rule__BlockProcedure__ParamListAssignment_3 )
            // InternalPortugol.g:2434:3: rule__BlockProcedure__ParamListAssignment_3
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
    // InternalPortugol.g:2442:1: rule__BlockProcedure__Group__4 : rule__BlockProcedure__Group__4__Impl rule__BlockProcedure__Group__5 ;
    public final void rule__BlockProcedure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2446:1: ( rule__BlockProcedure__Group__4__Impl rule__BlockProcedure__Group__5 )
            // InternalPortugol.g:2447:2: rule__BlockProcedure__Group__4__Impl rule__BlockProcedure__Group__5
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
    // InternalPortugol.g:2454:1: rule__BlockProcedure__Group__4__Impl : ( ')' ) ;
    public final void rule__BlockProcedure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2458:1: ( ( ')' ) )
            // InternalPortugol.g:2459:1: ( ')' )
            {
            // InternalPortugol.g:2459:1: ( ')' )
            // InternalPortugol.g:2460:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2469:1: rule__BlockProcedure__Group__5 : rule__BlockProcedure__Group__5__Impl rule__BlockProcedure__Group__6 ;
    public final void rule__BlockProcedure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2473:1: ( rule__BlockProcedure__Group__5__Impl rule__BlockProcedure__Group__6 )
            // InternalPortugol.g:2474:2: rule__BlockProcedure__Group__5__Impl rule__BlockProcedure__Group__6
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
    // InternalPortugol.g:2481:1: rule__BlockProcedure__Group__5__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__BlockProcedure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2485:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2486:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2486:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2487:2: RULE_END_COMMAND
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
    // InternalPortugol.g:2496:1: rule__BlockProcedure__Group__6 : rule__BlockProcedure__Group__6__Impl rule__BlockProcedure__Group__7 ;
    public final void rule__BlockProcedure__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2500:1: ( rule__BlockProcedure__Group__6__Impl rule__BlockProcedure__Group__7 )
            // InternalPortugol.g:2501:2: rule__BlockProcedure__Group__6__Impl rule__BlockProcedure__Group__7
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
    // InternalPortugol.g:2508:1: rule__BlockProcedure__Group__6__Impl : ( ( rule__BlockProcedure__DeclarationsAssignment_6 )? ) ;
    public final void rule__BlockProcedure__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2512:1: ( ( ( rule__BlockProcedure__DeclarationsAssignment_6 )? ) )
            // InternalPortugol.g:2513:1: ( ( rule__BlockProcedure__DeclarationsAssignment_6 )? )
            {
            // InternalPortugol.g:2513:1: ( ( rule__BlockProcedure__DeclarationsAssignment_6 )? )
            // InternalPortugol.g:2514:2: ( rule__BlockProcedure__DeclarationsAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getDeclarationsAssignment_6()); 
            }
            // InternalPortugol.g:2515:2: ( rule__BlockProcedure__DeclarationsAssignment_6 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPortugol.g:2515:3: rule__BlockProcedure__DeclarationsAssignment_6
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
    // InternalPortugol.g:2523:1: rule__BlockProcedure__Group__7 : rule__BlockProcedure__Group__7__Impl rule__BlockProcedure__Group__8 ;
    public final void rule__BlockProcedure__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2527:1: ( rule__BlockProcedure__Group__7__Impl rule__BlockProcedure__Group__8 )
            // InternalPortugol.g:2528:2: rule__BlockProcedure__Group__7__Impl rule__BlockProcedure__Group__8
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
    // InternalPortugol.g:2535:1: rule__BlockProcedure__Group__7__Impl : ( 'inicio' ) ;
    public final void rule__BlockProcedure__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2539:1: ( ( 'inicio' ) )
            // InternalPortugol.g:2540:1: ( 'inicio' )
            {
            // InternalPortugol.g:2540:1: ( 'inicio' )
            // InternalPortugol.g:2541:2: 'inicio'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getInicioKeyword_7()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2550:1: rule__BlockProcedure__Group__8 : rule__BlockProcedure__Group__8__Impl rule__BlockProcedure__Group__9 ;
    public final void rule__BlockProcedure__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2554:1: ( rule__BlockProcedure__Group__8__Impl rule__BlockProcedure__Group__9 )
            // InternalPortugol.g:2555:2: rule__BlockProcedure__Group__8__Impl rule__BlockProcedure__Group__9
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
    // InternalPortugol.g:2562:1: rule__BlockProcedure__Group__8__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__BlockProcedure__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2566:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2567:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2567:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2568:2: RULE_END_COMMAND
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
    // InternalPortugol.g:2577:1: rule__BlockProcedure__Group__9 : rule__BlockProcedure__Group__9__Impl rule__BlockProcedure__Group__10 ;
    public final void rule__BlockProcedure__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2581:1: ( rule__BlockProcedure__Group__9__Impl rule__BlockProcedure__Group__10 )
            // InternalPortugol.g:2582:2: rule__BlockProcedure__Group__9__Impl rule__BlockProcedure__Group__10
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
    // InternalPortugol.g:2589:1: rule__BlockProcedure__Group__9__Impl : ( ( ( rule__BlockProcedure__CommandsAssignment_9 ) ) ( ( rule__BlockProcedure__CommandsAssignment_9 )* ) ) ;
    public final void rule__BlockProcedure__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2593:1: ( ( ( ( rule__BlockProcedure__CommandsAssignment_9 ) ) ( ( rule__BlockProcedure__CommandsAssignment_9 )* ) ) )
            // InternalPortugol.g:2594:1: ( ( ( rule__BlockProcedure__CommandsAssignment_9 ) ) ( ( rule__BlockProcedure__CommandsAssignment_9 )* ) )
            {
            // InternalPortugol.g:2594:1: ( ( ( rule__BlockProcedure__CommandsAssignment_9 ) ) ( ( rule__BlockProcedure__CommandsAssignment_9 )* ) )
            // InternalPortugol.g:2595:2: ( ( rule__BlockProcedure__CommandsAssignment_9 ) ) ( ( rule__BlockProcedure__CommandsAssignment_9 )* )
            {
            // InternalPortugol.g:2595:2: ( ( rule__BlockProcedure__CommandsAssignment_9 ) )
            // InternalPortugol.g:2596:3: ( rule__BlockProcedure__CommandsAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getCommandsAssignment_9()); 
            }
            // InternalPortugol.g:2597:3: ( rule__BlockProcedure__CommandsAssignment_9 )
            // InternalPortugol.g:2597:4: rule__BlockProcedure__CommandsAssignment_9
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

            // InternalPortugol.g:2600:2: ( ( rule__BlockProcedure__CommandsAssignment_9 )* )
            // InternalPortugol.g:2601:3: ( rule__BlockProcedure__CommandsAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getCommandsAssignment_9()); 
            }
            // InternalPortugol.g:2602:3: ( rule__BlockProcedure__CommandsAssignment_9 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_FLOAT)||LA23_0==25||LA23_0==30||LA23_0==36||(LA23_0>=43 && LA23_0<=44)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalPortugol.g:2602:4: rule__BlockProcedure__CommandsAssignment_9
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
    // InternalPortugol.g:2611:1: rule__BlockProcedure__Group__10 : rule__BlockProcedure__Group__10__Impl rule__BlockProcedure__Group__11 ;
    public final void rule__BlockProcedure__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2615:1: ( rule__BlockProcedure__Group__10__Impl rule__BlockProcedure__Group__11 )
            // InternalPortugol.g:2616:2: rule__BlockProcedure__Group__10__Impl rule__BlockProcedure__Group__11
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
    // InternalPortugol.g:2623:1: rule__BlockProcedure__Group__10__Impl : ( 'fimprocedimento' ) ;
    public final void rule__BlockProcedure__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2627:1: ( ( 'fimprocedimento' ) )
            // InternalPortugol.g:2628:1: ( 'fimprocedimento' )
            {
            // InternalPortugol.g:2628:1: ( 'fimprocedimento' )
            // InternalPortugol.g:2629:2: 'fimprocedimento'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockProcedureAccess().getFimprocedimentoKeyword_10()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2638:1: rule__BlockProcedure__Group__11 : rule__BlockProcedure__Group__11__Impl ;
    public final void rule__BlockProcedure__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2642:1: ( rule__BlockProcedure__Group__11__Impl )
            // InternalPortugol.g:2643:2: rule__BlockProcedure__Group__11__Impl
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
    // InternalPortugol.g:2649:1: rule__BlockProcedure__Group__11__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__BlockProcedure__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2653:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2654:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2654:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2655:2: RULE_END_COMMAND
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
    // InternalPortugol.g:2665:1: rule__BlockCommand__Group__0 : rule__BlockCommand__Group__0__Impl rule__BlockCommand__Group__1 ;
    public final void rule__BlockCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2669:1: ( rule__BlockCommand__Group__0__Impl rule__BlockCommand__Group__1 )
            // InternalPortugol.g:2670:2: rule__BlockCommand__Group__0__Impl rule__BlockCommand__Group__1
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
    // InternalPortugol.g:2677:1: rule__BlockCommand__Group__0__Impl : ( 'inicio' ) ;
    public final void rule__BlockCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2681:1: ( ( 'inicio' ) )
            // InternalPortugol.g:2682:1: ( 'inicio' )
            {
            // InternalPortugol.g:2682:1: ( 'inicio' )
            // InternalPortugol.g:2683:2: 'inicio'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getInicioKeyword_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2692:1: rule__BlockCommand__Group__1 : rule__BlockCommand__Group__1__Impl rule__BlockCommand__Group__2 ;
    public final void rule__BlockCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2696:1: ( rule__BlockCommand__Group__1__Impl rule__BlockCommand__Group__2 )
            // InternalPortugol.g:2697:2: rule__BlockCommand__Group__1__Impl rule__BlockCommand__Group__2
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
    // InternalPortugol.g:2704:1: rule__BlockCommand__Group__1__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__BlockCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2708:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2709:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2709:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2710:2: RULE_END_COMMAND
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
    // InternalPortugol.g:2719:1: rule__BlockCommand__Group__2 : rule__BlockCommand__Group__2__Impl rule__BlockCommand__Group__3 ;
    public final void rule__BlockCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2723:1: ( rule__BlockCommand__Group__2__Impl rule__BlockCommand__Group__3 )
            // InternalPortugol.g:2724:2: rule__BlockCommand__Group__2__Impl rule__BlockCommand__Group__3
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
    // InternalPortugol.g:2731:1: rule__BlockCommand__Group__2__Impl : ( ( ( rule__BlockCommand__CommandsAssignment_2 ) ) ( ( rule__BlockCommand__CommandsAssignment_2 )* ) ) ;
    public final void rule__BlockCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2735:1: ( ( ( ( rule__BlockCommand__CommandsAssignment_2 ) ) ( ( rule__BlockCommand__CommandsAssignment_2 )* ) ) )
            // InternalPortugol.g:2736:1: ( ( ( rule__BlockCommand__CommandsAssignment_2 ) ) ( ( rule__BlockCommand__CommandsAssignment_2 )* ) )
            {
            // InternalPortugol.g:2736:1: ( ( ( rule__BlockCommand__CommandsAssignment_2 ) ) ( ( rule__BlockCommand__CommandsAssignment_2 )* ) )
            // InternalPortugol.g:2737:2: ( ( rule__BlockCommand__CommandsAssignment_2 ) ) ( ( rule__BlockCommand__CommandsAssignment_2 )* )
            {
            // InternalPortugol.g:2737:2: ( ( rule__BlockCommand__CommandsAssignment_2 ) )
            // InternalPortugol.g:2738:3: ( rule__BlockCommand__CommandsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getCommandsAssignment_2()); 
            }
            // InternalPortugol.g:2739:3: ( rule__BlockCommand__CommandsAssignment_2 )
            // InternalPortugol.g:2739:4: rule__BlockCommand__CommandsAssignment_2
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

            // InternalPortugol.g:2742:2: ( ( rule__BlockCommand__CommandsAssignment_2 )* )
            // InternalPortugol.g:2743:3: ( rule__BlockCommand__CommandsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getCommandsAssignment_2()); 
            }
            // InternalPortugol.g:2744:3: ( rule__BlockCommand__CommandsAssignment_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_FLOAT)||LA24_0==25||LA24_0==30||LA24_0==36||(LA24_0>=43 && LA24_0<=44)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPortugol.g:2744:4: rule__BlockCommand__CommandsAssignment_2
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
    // InternalPortugol.g:2753:1: rule__BlockCommand__Group__3 : rule__BlockCommand__Group__3__Impl rule__BlockCommand__Group__4 ;
    public final void rule__BlockCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2757:1: ( rule__BlockCommand__Group__3__Impl rule__BlockCommand__Group__4 )
            // InternalPortugol.g:2758:2: rule__BlockCommand__Group__3__Impl rule__BlockCommand__Group__4
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
    // InternalPortugol.g:2765:1: rule__BlockCommand__Group__3__Impl : ( 'fimalgoritmo' ) ;
    public final void rule__BlockCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2769:1: ( ( 'fimalgoritmo' ) )
            // InternalPortugol.g:2770:1: ( 'fimalgoritmo' )
            {
            // InternalPortugol.g:2770:1: ( 'fimalgoritmo' )
            // InternalPortugol.g:2771:2: 'fimalgoritmo'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockCommandAccess().getFimalgoritmoKeyword_3()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2780:1: rule__BlockCommand__Group__4 : rule__BlockCommand__Group__4__Impl ;
    public final void rule__BlockCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2784:1: ( rule__BlockCommand__Group__4__Impl )
            // InternalPortugol.g:2785:2: rule__BlockCommand__Group__4__Impl
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
    // InternalPortugol.g:2791:1: rule__BlockCommand__Group__4__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__BlockCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2795:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2796:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2796:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2797:2: RULE_END_COMMAND
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


    // $ANTLR start "rule__AbstractCommand__Group_0__0"
    // InternalPortugol.g:2807:1: rule__AbstractCommand__Group_0__0 : rule__AbstractCommand__Group_0__0__Impl rule__AbstractCommand__Group_0__1 ;
    public final void rule__AbstractCommand__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2811:1: ( rule__AbstractCommand__Group_0__0__Impl rule__AbstractCommand__Group_0__1 )
            // InternalPortugol.g:2812:2: rule__AbstractCommand__Group_0__0__Impl rule__AbstractCommand__Group_0__1
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
    // InternalPortugol.g:2819:1: rule__AbstractCommand__Group_0__0__Impl : ( ruleReadCommand ) ;
    public final void rule__AbstractCommand__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2823:1: ( ( ruleReadCommand ) )
            // InternalPortugol.g:2824:1: ( ruleReadCommand )
            {
            // InternalPortugol.g:2824:1: ( ruleReadCommand )
            // InternalPortugol.g:2825:2: ruleReadCommand
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
    // InternalPortugol.g:2834:1: rule__AbstractCommand__Group_0__1 : rule__AbstractCommand__Group_0__1__Impl ;
    public final void rule__AbstractCommand__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2838:1: ( rule__AbstractCommand__Group_0__1__Impl )
            // InternalPortugol.g:2839:2: rule__AbstractCommand__Group_0__1__Impl
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
    // InternalPortugol.g:2845:1: rule__AbstractCommand__Group_0__1__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__AbstractCommand__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2849:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2850:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2850:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2851:2: RULE_END_COMMAND
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
    // InternalPortugol.g:2861:1: rule__AbstractCommand__Group_1__0 : rule__AbstractCommand__Group_1__0__Impl rule__AbstractCommand__Group_1__1 ;
    public final void rule__AbstractCommand__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2865:1: ( rule__AbstractCommand__Group_1__0__Impl rule__AbstractCommand__Group_1__1 )
            // InternalPortugol.g:2866:2: rule__AbstractCommand__Group_1__0__Impl rule__AbstractCommand__Group_1__1
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
    // InternalPortugol.g:2873:1: rule__AbstractCommand__Group_1__0__Impl : ( ruleWriteCommand ) ;
    public final void rule__AbstractCommand__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2877:1: ( ( ruleWriteCommand ) )
            // InternalPortugol.g:2878:1: ( ruleWriteCommand )
            {
            // InternalPortugol.g:2878:1: ( ruleWriteCommand )
            // InternalPortugol.g:2879:2: ruleWriteCommand
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
    // InternalPortugol.g:2888:1: rule__AbstractCommand__Group_1__1 : rule__AbstractCommand__Group_1__1__Impl ;
    public final void rule__AbstractCommand__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2892:1: ( rule__AbstractCommand__Group_1__1__Impl )
            // InternalPortugol.g:2893:2: rule__AbstractCommand__Group_1__1__Impl
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
    // InternalPortugol.g:2899:1: rule__AbstractCommand__Group_1__1__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__AbstractCommand__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2903:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2904:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2904:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2905:2: RULE_END_COMMAND
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
    // InternalPortugol.g:2915:1: rule__AbstractCommand__Group_2__0 : rule__AbstractCommand__Group_2__0__Impl rule__AbstractCommand__Group_2__1 ;
    public final void rule__AbstractCommand__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2919:1: ( rule__AbstractCommand__Group_2__0__Impl rule__AbstractCommand__Group_2__1 )
            // InternalPortugol.g:2920:2: rule__AbstractCommand__Group_2__0__Impl rule__AbstractCommand__Group_2__1
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
    // InternalPortugol.g:2927:1: rule__AbstractCommand__Group_2__0__Impl : ( ruleExpression ) ;
    public final void rule__AbstractCommand__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2931:1: ( ( ruleExpression ) )
            // InternalPortugol.g:2932:1: ( ruleExpression )
            {
            // InternalPortugol.g:2932:1: ( ruleExpression )
            // InternalPortugol.g:2933:2: ruleExpression
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
    // InternalPortugol.g:2942:1: rule__AbstractCommand__Group_2__1 : rule__AbstractCommand__Group_2__1__Impl ;
    public final void rule__AbstractCommand__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2946:1: ( rule__AbstractCommand__Group_2__1__Impl )
            // InternalPortugol.g:2947:2: rule__AbstractCommand__Group_2__1__Impl
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
    // InternalPortugol.g:2953:1: rule__AbstractCommand__Group_2__1__Impl : ( RULE_END_COMMAND ) ;
    public final void rule__AbstractCommand__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2957:1: ( ( RULE_END_COMMAND ) )
            // InternalPortugol.g:2958:1: ( RULE_END_COMMAND )
            {
            // InternalPortugol.g:2958:1: ( RULE_END_COMMAND )
            // InternalPortugol.g:2959:2: RULE_END_COMMAND
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


    // $ANTLR start "rule__ReadCommand__Group__0"
    // InternalPortugol.g:2969:1: rule__ReadCommand__Group__0 : rule__ReadCommand__Group__0__Impl rule__ReadCommand__Group__1 ;
    public final void rule__ReadCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2973:1: ( rule__ReadCommand__Group__0__Impl rule__ReadCommand__Group__1 )
            // InternalPortugol.g:2974:2: rule__ReadCommand__Group__0__Impl rule__ReadCommand__Group__1
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
    // InternalPortugol.g:2981:1: rule__ReadCommand__Group__0__Impl : ( 'leia' ) ;
    public final void rule__ReadCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:2985:1: ( ( 'leia' ) )
            // InternalPortugol.g:2986:1: ( 'leia' )
            {
            // InternalPortugol.g:2986:1: ( 'leia' )
            // InternalPortugol.g:2987:2: 'leia'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getLeiaKeyword_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:2996:1: rule__ReadCommand__Group__1 : rule__ReadCommand__Group__1__Impl rule__ReadCommand__Group__2 ;
    public final void rule__ReadCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3000:1: ( rule__ReadCommand__Group__1__Impl rule__ReadCommand__Group__2 )
            // InternalPortugol.g:3001:2: rule__ReadCommand__Group__1__Impl rule__ReadCommand__Group__2
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
    // InternalPortugol.g:3008:1: rule__ReadCommand__Group__1__Impl : ( '(' ) ;
    public final void rule__ReadCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3012:1: ( ( '(' ) )
            // InternalPortugol.g:3013:1: ( '(' )
            {
            // InternalPortugol.g:3013:1: ( '(' )
            // InternalPortugol.g:3014:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:3023:1: rule__ReadCommand__Group__2 : rule__ReadCommand__Group__2__Impl rule__ReadCommand__Group__3 ;
    public final void rule__ReadCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3027:1: ( rule__ReadCommand__Group__2__Impl rule__ReadCommand__Group__3 )
            // InternalPortugol.g:3028:2: rule__ReadCommand__Group__2__Impl rule__ReadCommand__Group__3
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
    // InternalPortugol.g:3035:1: rule__ReadCommand__Group__2__Impl : ( ( rule__ReadCommand__ParamListAssignment_2 ) ) ;
    public final void rule__ReadCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3039:1: ( ( ( rule__ReadCommand__ParamListAssignment_2 ) ) )
            // InternalPortugol.g:3040:1: ( ( rule__ReadCommand__ParamListAssignment_2 ) )
            {
            // InternalPortugol.g:3040:1: ( ( rule__ReadCommand__ParamListAssignment_2 ) )
            // InternalPortugol.g:3041:2: ( rule__ReadCommand__ParamListAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getParamListAssignment_2()); 
            }
            // InternalPortugol.g:3042:2: ( rule__ReadCommand__ParamListAssignment_2 )
            // InternalPortugol.g:3042:3: rule__ReadCommand__ParamListAssignment_2
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
    // InternalPortugol.g:3050:1: rule__ReadCommand__Group__3 : rule__ReadCommand__Group__3__Impl ;
    public final void rule__ReadCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3054:1: ( rule__ReadCommand__Group__3__Impl )
            // InternalPortugol.g:3055:2: rule__ReadCommand__Group__3__Impl
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
    // InternalPortugol.g:3061:1: rule__ReadCommand__Group__3__Impl : ( ')' ) ;
    public final void rule__ReadCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3065:1: ( ( ')' ) )
            // InternalPortugol.g:3066:1: ( ')' )
            {
            // InternalPortugol.g:3066:1: ( ')' )
            // InternalPortugol.g:3067:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadCommandAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:3077:1: rule__WriteCommand__Group__0 : rule__WriteCommand__Group__0__Impl rule__WriteCommand__Group__1 ;
    public final void rule__WriteCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3081:1: ( rule__WriteCommand__Group__0__Impl rule__WriteCommand__Group__1 )
            // InternalPortugol.g:3082:2: rule__WriteCommand__Group__0__Impl rule__WriteCommand__Group__1
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
    // InternalPortugol.g:3089:1: rule__WriteCommand__Group__0__Impl : ( 'escreva' ) ;
    public final void rule__WriteCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3093:1: ( ( 'escreva' ) )
            // InternalPortugol.g:3094:1: ( 'escreva' )
            {
            // InternalPortugol.g:3094:1: ( 'escreva' )
            // InternalPortugol.g:3095:2: 'escreva'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getEscrevaKeyword_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:3104:1: rule__WriteCommand__Group__1 : rule__WriteCommand__Group__1__Impl rule__WriteCommand__Group__2 ;
    public final void rule__WriteCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3108:1: ( rule__WriteCommand__Group__1__Impl rule__WriteCommand__Group__2 )
            // InternalPortugol.g:3109:2: rule__WriteCommand__Group__1__Impl rule__WriteCommand__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugol.g:3116:1: rule__WriteCommand__Group__1__Impl : ( '(' ) ;
    public final void rule__WriteCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3120:1: ( ( '(' ) )
            // InternalPortugol.g:3121:1: ( '(' )
            {
            // InternalPortugol.g:3121:1: ( '(' )
            // InternalPortugol.g:3122:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:3131:1: rule__WriteCommand__Group__2 : rule__WriteCommand__Group__2__Impl rule__WriteCommand__Group__3 ;
    public final void rule__WriteCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3135:1: ( rule__WriteCommand__Group__2__Impl rule__WriteCommand__Group__3 )
            // InternalPortugol.g:3136:2: rule__WriteCommand__Group__2__Impl rule__WriteCommand__Group__3
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
    // InternalPortugol.g:3143:1: rule__WriteCommand__Group__2__Impl : ( ( rule__WriteCommand__WriteParamAssignment_2 ) ) ;
    public final void rule__WriteCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3147:1: ( ( ( rule__WriteCommand__WriteParamAssignment_2 ) ) )
            // InternalPortugol.g:3148:1: ( ( rule__WriteCommand__WriteParamAssignment_2 ) )
            {
            // InternalPortugol.g:3148:1: ( ( rule__WriteCommand__WriteParamAssignment_2 ) )
            // InternalPortugol.g:3149:2: ( rule__WriteCommand__WriteParamAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getWriteParamAssignment_2()); 
            }
            // InternalPortugol.g:3150:2: ( rule__WriteCommand__WriteParamAssignment_2 )
            // InternalPortugol.g:3150:3: rule__WriteCommand__WriteParamAssignment_2
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
    // InternalPortugol.g:3158:1: rule__WriteCommand__Group__3 : rule__WriteCommand__Group__3__Impl ;
    public final void rule__WriteCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3162:1: ( rule__WriteCommand__Group__3__Impl )
            // InternalPortugol.g:3163:2: rule__WriteCommand__Group__3__Impl
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
    // InternalPortugol.g:3169:1: rule__WriteCommand__Group__3__Impl : ( ')' ) ;
    public final void rule__WriteCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3173:1: ( ( ')' ) )
            // InternalPortugol.g:3174:1: ( ')' )
            {
            // InternalPortugol.g:3174:1: ( ')' )
            // InternalPortugol.g:3175:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteCommandAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:3185:1: rule__WriteParam__Group__0 : rule__WriteParam__Group__0__Impl rule__WriteParam__Group__1 ;
    public final void rule__WriteParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3189:1: ( rule__WriteParam__Group__0__Impl rule__WriteParam__Group__1 )
            // InternalPortugol.g:3190:2: rule__WriteParam__Group__0__Impl rule__WriteParam__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPortugol.g:3197:1: rule__WriteParam__Group__0__Impl : ( ( rule__WriteParam__ExpressionAssignment_0 ) ) ;
    public final void rule__WriteParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3201:1: ( ( ( rule__WriteParam__ExpressionAssignment_0 ) ) )
            // InternalPortugol.g:3202:1: ( ( rule__WriteParam__ExpressionAssignment_0 ) )
            {
            // InternalPortugol.g:3202:1: ( ( rule__WriteParam__ExpressionAssignment_0 ) )
            // InternalPortugol.g:3203:2: ( rule__WriteParam__ExpressionAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getExpressionAssignment_0()); 
            }
            // InternalPortugol.g:3204:2: ( rule__WriteParam__ExpressionAssignment_0 )
            // InternalPortugol.g:3204:3: rule__WriteParam__ExpressionAssignment_0
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
    // InternalPortugol.g:3212:1: rule__WriteParam__Group__1 : rule__WriteParam__Group__1__Impl rule__WriteParam__Group__2 ;
    public final void rule__WriteParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3216:1: ( rule__WriteParam__Group__1__Impl rule__WriteParam__Group__2 )
            // InternalPortugol.g:3217:2: rule__WriteParam__Group__1__Impl rule__WriteParam__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalPortugol.g:3224:1: rule__WriteParam__Group__1__Impl : ( ( rule__WriteParam__Group_1__0 )* ) ;
    public final void rule__WriteParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3228:1: ( ( ( rule__WriteParam__Group_1__0 )* ) )
            // InternalPortugol.g:3229:1: ( ( rule__WriteParam__Group_1__0 )* )
            {
            // InternalPortugol.g:3229:1: ( ( rule__WriteParam__Group_1__0 )* )
            // InternalPortugol.g:3230:2: ( rule__WriteParam__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getGroup_1()); 
            }
            // InternalPortugol.g:3231:2: ( rule__WriteParam__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==34) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPortugol.g:3231:3: rule__WriteParam__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__WriteParam__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalPortugol.g:3239:1: rule__WriteParam__Group__2 : rule__WriteParam__Group__2__Impl ;
    public final void rule__WriteParam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3243:1: ( rule__WriteParam__Group__2__Impl )
            // InternalPortugol.g:3244:2: rule__WriteParam__Group__2__Impl
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
    // InternalPortugol.g:3250:1: rule__WriteParam__Group__2__Impl : ( ( rule__WriteParam__PrecisionAssignment_2 )? ) ;
    public final void rule__WriteParam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3254:1: ( ( ( rule__WriteParam__PrecisionAssignment_2 )? ) )
            // InternalPortugol.g:3255:1: ( ( rule__WriteParam__PrecisionAssignment_2 )? )
            {
            // InternalPortugol.g:3255:1: ( ( rule__WriteParam__PrecisionAssignment_2 )? )
            // InternalPortugol.g:3256:2: ( rule__WriteParam__PrecisionAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getPrecisionAssignment_2()); 
            }
            // InternalPortugol.g:3257:2: ( rule__WriteParam__PrecisionAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPortugol.g:3257:3: rule__WriteParam__PrecisionAssignment_2
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
    // InternalPortugol.g:3266:1: rule__WriteParam__Group_1__0 : rule__WriteParam__Group_1__0__Impl rule__WriteParam__Group_1__1 ;
    public final void rule__WriteParam__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3270:1: ( rule__WriteParam__Group_1__0__Impl rule__WriteParam__Group_1__1 )
            // InternalPortugol.g:3271:2: rule__WriteParam__Group_1__0__Impl rule__WriteParam__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugol.g:3278:1: rule__WriteParam__Group_1__0__Impl : ( ',' ) ;
    public final void rule__WriteParam__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3282:1: ( ( ',' ) )
            // InternalPortugol.g:3283:1: ( ',' )
            {
            // InternalPortugol.g:3283:1: ( ',' )
            // InternalPortugol.g:3284:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getCommaKeyword_1_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:3293:1: rule__WriteParam__Group_1__1 : rule__WriteParam__Group_1__1__Impl ;
    public final void rule__WriteParam__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3297:1: ( rule__WriteParam__Group_1__1__Impl )
            // InternalPortugol.g:3298:2: rule__WriteParam__Group_1__1__Impl
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
    // InternalPortugol.g:3304:1: rule__WriteParam__Group_1__1__Impl : ( ( rule__WriteParam__ExpressionAssignment_1_1 ) ) ;
    public final void rule__WriteParam__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3308:1: ( ( ( rule__WriteParam__ExpressionAssignment_1_1 ) ) )
            // InternalPortugol.g:3309:1: ( ( rule__WriteParam__ExpressionAssignment_1_1 ) )
            {
            // InternalPortugol.g:3309:1: ( ( rule__WriteParam__ExpressionAssignment_1_1 ) )
            // InternalPortugol.g:3310:2: ( rule__WriteParam__ExpressionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteParamAccess().getExpressionAssignment_1_1()); 
            }
            // InternalPortugol.g:3311:2: ( rule__WriteParam__ExpressionAssignment_1_1 )
            // InternalPortugol.g:3311:3: rule__WriteParam__ExpressionAssignment_1_1
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


    // $ANTLR start "rule__OptDecimalPrecision__Group__0"
    // InternalPortugol.g:3320:1: rule__OptDecimalPrecision__Group__0 : rule__OptDecimalPrecision__Group__0__Impl rule__OptDecimalPrecision__Group__1 ;
    public final void rule__OptDecimalPrecision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3324:1: ( rule__OptDecimalPrecision__Group__0__Impl rule__OptDecimalPrecision__Group__1 )
            // InternalPortugol.g:3325:2: rule__OptDecimalPrecision__Group__0__Impl rule__OptDecimalPrecision__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalPortugol.g:3332:1: rule__OptDecimalPrecision__Group__0__Impl : ( ':' ) ;
    public final void rule__OptDecimalPrecision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3336:1: ( ( ':' ) )
            // InternalPortugol.g:3337:1: ( ':' )
            {
            // InternalPortugol.g:3337:1: ( ':' )
            // InternalPortugol.g:3338:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getColonKeyword_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:3347:1: rule__OptDecimalPrecision__Group__1 : rule__OptDecimalPrecision__Group__1__Impl rule__OptDecimalPrecision__Group__2 ;
    public final void rule__OptDecimalPrecision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3351:1: ( rule__OptDecimalPrecision__Group__1__Impl rule__OptDecimalPrecision__Group__2 )
            // InternalPortugol.g:3352:2: rule__OptDecimalPrecision__Group__1__Impl rule__OptDecimalPrecision__Group__2
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
    // InternalPortugol.g:3359:1: rule__OptDecimalPrecision__Group__1__Impl : ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) ) ;
    public final void rule__OptDecimalPrecision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3363:1: ( ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) ) )
            // InternalPortugol.g:3364:1: ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) )
            {
            // InternalPortugol.g:3364:1: ( ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 ) )
            // InternalPortugol.g:3365:2: ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getFirstPrecisionAssignment_1()); 
            }
            // InternalPortugol.g:3366:2: ( rule__OptDecimalPrecision__FirstPrecisionAssignment_1 )
            // InternalPortugol.g:3366:3: rule__OptDecimalPrecision__FirstPrecisionAssignment_1
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
    // InternalPortugol.g:3374:1: rule__OptDecimalPrecision__Group__2 : rule__OptDecimalPrecision__Group__2__Impl ;
    public final void rule__OptDecimalPrecision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3378:1: ( rule__OptDecimalPrecision__Group__2__Impl )
            // InternalPortugol.g:3379:2: rule__OptDecimalPrecision__Group__2__Impl
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
    // InternalPortugol.g:3385:1: rule__OptDecimalPrecision__Group__2__Impl : ( ( rule__OptDecimalPrecision__Group_2__0 )? ) ;
    public final void rule__OptDecimalPrecision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3389:1: ( ( ( rule__OptDecimalPrecision__Group_2__0 )? ) )
            // InternalPortugol.g:3390:1: ( ( rule__OptDecimalPrecision__Group_2__0 )? )
            {
            // InternalPortugol.g:3390:1: ( ( rule__OptDecimalPrecision__Group_2__0 )? )
            // InternalPortugol.g:3391:2: ( rule__OptDecimalPrecision__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getGroup_2()); 
            }
            // InternalPortugol.g:3392:2: ( rule__OptDecimalPrecision__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPortugol.g:3392:3: rule__OptDecimalPrecision__Group_2__0
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
    // InternalPortugol.g:3401:1: rule__OptDecimalPrecision__Group_2__0 : rule__OptDecimalPrecision__Group_2__0__Impl rule__OptDecimalPrecision__Group_2__1 ;
    public final void rule__OptDecimalPrecision__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3405:1: ( rule__OptDecimalPrecision__Group_2__0__Impl rule__OptDecimalPrecision__Group_2__1 )
            // InternalPortugol.g:3406:2: rule__OptDecimalPrecision__Group_2__0__Impl rule__OptDecimalPrecision__Group_2__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalPortugol.g:3413:1: rule__OptDecimalPrecision__Group_2__0__Impl : ( ':' ) ;
    public final void rule__OptDecimalPrecision__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3417:1: ( ( ':' ) )
            // InternalPortugol.g:3418:1: ( ':' )
            {
            // InternalPortugol.g:3418:1: ( ':' )
            // InternalPortugol.g:3419:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getColonKeyword_2_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:3428:1: rule__OptDecimalPrecision__Group_2__1 : rule__OptDecimalPrecision__Group_2__1__Impl ;
    public final void rule__OptDecimalPrecision__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3432:1: ( rule__OptDecimalPrecision__Group_2__1__Impl )
            // InternalPortugol.g:3433:2: rule__OptDecimalPrecision__Group_2__1__Impl
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
    // InternalPortugol.g:3439:1: rule__OptDecimalPrecision__Group_2__1__Impl : ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) ) ;
    public final void rule__OptDecimalPrecision__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3443:1: ( ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) ) )
            // InternalPortugol.g:3444:1: ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) )
            {
            // InternalPortugol.g:3444:1: ( ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 ) )
            // InternalPortugol.g:3445:2: ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptDecimalPrecisionAccess().getSecondPrecisionAssignment_2_1()); 
            }
            // InternalPortugol.g:3446:2: ( rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 )
            // InternalPortugol.g:3446:3: rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1
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


    // $ANTLR start "rule__Assignment__Group_0__0"
    // InternalPortugol.g:3455:1: rule__Assignment__Group_0__0 : rule__Assignment__Group_0__0__Impl rule__Assignment__Group_0__1 ;
    public final void rule__Assignment__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3459:1: ( rule__Assignment__Group_0__0__Impl rule__Assignment__Group_0__1 )
            // InternalPortugol.g:3460:2: rule__Assignment__Group_0__0__Impl rule__Assignment__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Assignment__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_0__0"


    // $ANTLR start "rule__Assignment__Group_0__0__Impl"
    // InternalPortugol.g:3467:1: rule__Assignment__Group_0__0__Impl : ( () ) ;
    public final void rule__Assignment__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3471:1: ( ( () ) )
            // InternalPortugol.g:3472:1: ( () )
            {
            // InternalPortugol.g:3472:1: ( () )
            // InternalPortugol.g:3473:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getAssignmentAction_0_0()); 
            }
            // InternalPortugol.g:3474:2: ()
            // InternalPortugol.g:3474:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getAssignmentAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_0__0__Impl"


    // $ANTLR start "rule__Assignment__Group_0__1"
    // InternalPortugol.g:3482:1: rule__Assignment__Group_0__1 : rule__Assignment__Group_0__1__Impl rule__Assignment__Group_0__2 ;
    public final void rule__Assignment__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3486:1: ( rule__Assignment__Group_0__1__Impl rule__Assignment__Group_0__2 )
            // InternalPortugol.g:3487:2: rule__Assignment__Group_0__1__Impl rule__Assignment__Group_0__2
            {
            pushFollow(FOLLOW_24);
            rule__Assignment__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_0__1"


    // $ANTLR start "rule__Assignment__Group_0__1__Impl"
    // InternalPortugol.g:3494:1: rule__Assignment__Group_0__1__Impl : ( ( rule__Assignment__TargetAssignment_0_1 ) ) ;
    public final void rule__Assignment__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3498:1: ( ( ( rule__Assignment__TargetAssignment_0_1 ) ) )
            // InternalPortugol.g:3499:1: ( ( rule__Assignment__TargetAssignment_0_1 ) )
            {
            // InternalPortugol.g:3499:1: ( ( rule__Assignment__TargetAssignment_0_1 ) )
            // InternalPortugol.g:3500:2: ( rule__Assignment__TargetAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getTargetAssignment_0_1()); 
            }
            // InternalPortugol.g:3501:2: ( rule__Assignment__TargetAssignment_0_1 )
            // InternalPortugol.g:3501:3: rule__Assignment__TargetAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__TargetAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getTargetAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_0__1__Impl"


    // $ANTLR start "rule__Assignment__Group_0__2"
    // InternalPortugol.g:3509:1: rule__Assignment__Group_0__2 : rule__Assignment__Group_0__2__Impl rule__Assignment__Group_0__3 ;
    public final void rule__Assignment__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3513:1: ( rule__Assignment__Group_0__2__Impl rule__Assignment__Group_0__3 )
            // InternalPortugol.g:3514:2: rule__Assignment__Group_0__2__Impl rule__Assignment__Group_0__3
            {
            pushFollow(FOLLOW_17);
            rule__Assignment__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_0__2"


    // $ANTLR start "rule__Assignment__Group_0__2__Impl"
    // InternalPortugol.g:3521:1: rule__Assignment__Group_0__2__Impl : ( '<-' ) ;
    public final void rule__Assignment__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3525:1: ( ( '<-' ) )
            // InternalPortugol.g:3526:1: ( '<-' )
            {
            // InternalPortugol.g:3526:1: ( '<-' )
            // InternalPortugol.g:3527:2: '<-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getLessThanSignHyphenMinusKeyword_0_2()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getLessThanSignHyphenMinusKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_0__2__Impl"


    // $ANTLR start "rule__Assignment__Group_0__3"
    // InternalPortugol.g:3536:1: rule__Assignment__Group_0__3 : rule__Assignment__Group_0__3__Impl ;
    public final void rule__Assignment__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3540:1: ( rule__Assignment__Group_0__3__Impl )
            // InternalPortugol.g:3541:2: rule__Assignment__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_0__3"


    // $ANTLR start "rule__Assignment__Group_0__3__Impl"
    // InternalPortugol.g:3547:1: rule__Assignment__Group_0__3__Impl : ( ( rule__Assignment__ValueAssignment_0_3 ) ) ;
    public final void rule__Assignment__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3551:1: ( ( ( rule__Assignment__ValueAssignment_0_3 ) ) )
            // InternalPortugol.g:3552:1: ( ( rule__Assignment__ValueAssignment_0_3 ) )
            {
            // InternalPortugol.g:3552:1: ( ( rule__Assignment__ValueAssignment_0_3 ) )
            // InternalPortugol.g:3553:2: ( rule__Assignment__ValueAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueAssignment_0_3()); 
            }
            // InternalPortugol.g:3554:2: ( rule__Assignment__ValueAssignment_0_3 )
            // InternalPortugol.g:3554:3: rule__Assignment__ValueAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ValueAssignment_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getValueAssignment_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_0__3__Impl"


    // $ANTLR start "rule__Assignment__Group_1__0"
    // InternalPortugol.g:3563:1: rule__Assignment__Group_1__0 : rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 ;
    public final void rule__Assignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3567:1: ( rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 )
            // InternalPortugol.g:3568:2: rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalPortugol.g:3575:1: rule__Assignment__Group_1__0__Impl : ( ruleOrExpression ) ;
    public final void rule__Assignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3579:1: ( ( ruleOrExpression ) )
            // InternalPortugol.g:3580:1: ( ruleOrExpression )
            {
            // InternalPortugol.g:3580:1: ( ruleOrExpression )
            // InternalPortugol.g:3581:2: ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOrExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getOrExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
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
    // InternalPortugol.g:3590:1: rule__Assignment__Group_1__1 : rule__Assignment__Group_1__1__Impl ;
    public final void rule__Assignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3594:1: ( rule__Assignment__Group_1__1__Impl )
            // InternalPortugol.g:3595:2: rule__Assignment__Group_1__1__Impl
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
    // InternalPortugol.g:3601:1: rule__Assignment__Group_1__1__Impl : ( ( rule__Assignment__Group_1_1__0 )? ) ;
    public final void rule__Assignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3605:1: ( ( ( rule__Assignment__Group_1_1__0 )? ) )
            // InternalPortugol.g:3606:1: ( ( rule__Assignment__Group_1_1__0 )? )
            {
            // InternalPortugol.g:3606:1: ( ( rule__Assignment__Group_1_1__0 )? )
            // InternalPortugol.g:3607:2: ( rule__Assignment__Group_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_1_1()); 
            }
            // InternalPortugol.g:3608:2: ( rule__Assignment__Group_1_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==45) ) {
                int LA28_1 = input.LA(2);

                if ( (synpred35_InternalPortugol()) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalPortugol.g:3608:3: rule__Assignment__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assignment__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup_1_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Assignment__Group_1_1__0"
    // InternalPortugol.g:3617:1: rule__Assignment__Group_1_1__0 : rule__Assignment__Group_1_1__0__Impl rule__Assignment__Group_1_1__1 ;
    public final void rule__Assignment__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3621:1: ( rule__Assignment__Group_1_1__0__Impl rule__Assignment__Group_1_1__1 )
            // InternalPortugol.g:3622:2: rule__Assignment__Group_1_1__0__Impl rule__Assignment__Group_1_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Assignment__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_1__0"


    // $ANTLR start "rule__Assignment__Group_1_1__0__Impl"
    // InternalPortugol.g:3629:1: rule__Assignment__Group_1_1__0__Impl : ( ( rule__Assignment__Group_1_1_0__0 ) ) ;
    public final void rule__Assignment__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3633:1: ( ( ( rule__Assignment__Group_1_1_0__0 ) ) )
            // InternalPortugol.g:3634:1: ( ( rule__Assignment__Group_1_1_0__0 ) )
            {
            // InternalPortugol.g:3634:1: ( ( rule__Assignment__Group_1_1_0__0 ) )
            // InternalPortugol.g:3635:2: ( rule__Assignment__Group_1_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_1_1_0()); 
            }
            // InternalPortugol.g:3636:2: ( rule__Assignment__Group_1_1_0__0 )
            // InternalPortugol.g:3636:3: rule__Assignment__Group_1_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_1__0__Impl"


    // $ANTLR start "rule__Assignment__Group_1_1__1"
    // InternalPortugol.g:3644:1: rule__Assignment__Group_1_1__1 : rule__Assignment__Group_1_1__1__Impl ;
    public final void rule__Assignment__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3648:1: ( rule__Assignment__Group_1_1__1__Impl )
            // InternalPortugol.g:3649:2: rule__Assignment__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_1__1"


    // $ANTLR start "rule__Assignment__Group_1_1__1__Impl"
    // InternalPortugol.g:3655:1: rule__Assignment__Group_1_1__1__Impl : ( ( rule__Assignment__RightAssignment_1_1_1 ) ) ;
    public final void rule__Assignment__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3659:1: ( ( ( rule__Assignment__RightAssignment_1_1_1 ) ) )
            // InternalPortugol.g:3660:1: ( ( rule__Assignment__RightAssignment_1_1_1 ) )
            {
            // InternalPortugol.g:3660:1: ( ( rule__Assignment__RightAssignment_1_1_1 ) )
            // InternalPortugol.g:3661:2: ( rule__Assignment__RightAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getRightAssignment_1_1_1()); 
            }
            // InternalPortugol.g:3662:2: ( rule__Assignment__RightAssignment_1_1_1 )
            // InternalPortugol.g:3662:3: rule__Assignment__RightAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__RightAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getRightAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_1__1__Impl"


    // $ANTLR start "rule__Assignment__Group_1_1_0__0"
    // InternalPortugol.g:3671:1: rule__Assignment__Group_1_1_0__0 : rule__Assignment__Group_1_1_0__0__Impl ;
    public final void rule__Assignment__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3675:1: ( rule__Assignment__Group_1_1_0__0__Impl )
            // InternalPortugol.g:3676:2: rule__Assignment__Group_1_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_1_0__0"


    // $ANTLR start "rule__Assignment__Group_1_1_0__0__Impl"
    // InternalPortugol.g:3682:1: rule__Assignment__Group_1_1_0__0__Impl : ( ( rule__Assignment__Group_1_1_0_0__0 ) ) ;
    public final void rule__Assignment__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3686:1: ( ( ( rule__Assignment__Group_1_1_0_0__0 ) ) )
            // InternalPortugol.g:3687:1: ( ( rule__Assignment__Group_1_1_0_0__0 ) )
            {
            // InternalPortugol.g:3687:1: ( ( rule__Assignment__Group_1_1_0_0__0 ) )
            // InternalPortugol.g:3688:2: ( rule__Assignment__Group_1_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_1_1_0_0()); 
            }
            // InternalPortugol.g:3689:2: ( rule__Assignment__Group_1_1_0_0__0 )
            // InternalPortugol.g:3689:3: rule__Assignment__Group_1_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_1_0__0__Impl"


    // $ANTLR start "rule__Assignment__Group_1_1_0_0__0"
    // InternalPortugol.g:3698:1: rule__Assignment__Group_1_1_0_0__0 : rule__Assignment__Group_1_1_0_0__0__Impl rule__Assignment__Group_1_1_0_0__1 ;
    public final void rule__Assignment__Group_1_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3702:1: ( rule__Assignment__Group_1_1_0_0__0__Impl rule__Assignment__Group_1_1_0_0__1 )
            // InternalPortugol.g:3703:2: rule__Assignment__Group_1_1_0_0__0__Impl rule__Assignment__Group_1_1_0_0__1
            {
            pushFollow(FOLLOW_24);
            rule__Assignment__Group_1_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_1_0_0__0"


    // $ANTLR start "rule__Assignment__Group_1_1_0_0__0__Impl"
    // InternalPortugol.g:3710:1: rule__Assignment__Group_1_1_0_0__0__Impl : ( () ) ;
    public final void rule__Assignment__Group_1_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3714:1: ( ( () ) )
            // InternalPortugol.g:3715:1: ( () )
            {
            // InternalPortugol.g:3715:1: ( () )
            // InternalPortugol.g:3716:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getBinaryOperationLeftAction_1_1_0_0_0()); 
            }
            // InternalPortugol.g:3717:2: ()
            // InternalPortugol.g:3717:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getBinaryOperationLeftAction_1_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_1_0_0__0__Impl"


    // $ANTLR start "rule__Assignment__Group_1_1_0_0__1"
    // InternalPortugol.g:3725:1: rule__Assignment__Group_1_1_0_0__1 : rule__Assignment__Group_1_1_0_0__1__Impl ;
    public final void rule__Assignment__Group_1_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3729:1: ( rule__Assignment__Group_1_1_0_0__1__Impl )
            // InternalPortugol.g:3730:2: rule__Assignment__Group_1_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_1_0_0__1"


    // $ANTLR start "rule__Assignment__Group_1_1_0_0__1__Impl"
    // InternalPortugol.g:3736:1: rule__Assignment__Group_1_1_0_0__1__Impl : ( ( rule__Assignment__OpAssignment_1_1_0_0_1 ) ) ;
    public final void rule__Assignment__Group_1_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3740:1: ( ( ( rule__Assignment__OpAssignment_1_1_0_0_1 ) ) )
            // InternalPortugol.g:3741:1: ( ( rule__Assignment__OpAssignment_1_1_0_0_1 ) )
            {
            // InternalPortugol.g:3741:1: ( ( rule__Assignment__OpAssignment_1_1_0_0_1 ) )
            // InternalPortugol.g:3742:2: ( rule__Assignment__OpAssignment_1_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOpAssignment_1_1_0_0_1()); 
            }
            // InternalPortugol.g:3743:2: ( rule__Assignment__OpAssignment_1_1_0_0_1 )
            // InternalPortugol.g:3743:3: rule__Assignment__OpAssignment_1_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__OpAssignment_1_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getOpAssignment_1_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_1_0_0__1__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // InternalPortugol.g:3752:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3756:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalPortugol.g:3757:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalPortugol.g:3764:1: rule__OrExpression__Group__0__Impl : ( ruleXorExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3768:1: ( ( ruleXorExpression ) )
            // InternalPortugol.g:3769:1: ( ruleXorExpression )
            {
            // InternalPortugol.g:3769:1: ( ruleXorExpression )
            // InternalPortugol.g:3770:2: ruleXorExpression
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
    // InternalPortugol.g:3779:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3783:1: ( rule__OrExpression__Group__1__Impl )
            // InternalPortugol.g:3784:2: rule__OrExpression__Group__1__Impl
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
    // InternalPortugol.g:3790:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3794:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalPortugol.g:3795:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:3795:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalPortugol.g:3796:2: ( rule__OrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:3797:2: ( rule__OrExpression__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==46) ) {
                    int LA29_2 = input.LA(2);

                    if ( (synpred36_InternalPortugol()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // InternalPortugol.g:3797:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalPortugol.g:3806:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3810:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalPortugol.g:3811:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugol.g:3818:1: rule__OrExpression__Group_1__0__Impl : ( ( rule__OrExpression__Group_1_0__0 ) ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3822:1: ( ( ( rule__OrExpression__Group_1_0__0 ) ) )
            // InternalPortugol.g:3823:1: ( ( rule__OrExpression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:3823:1: ( ( rule__OrExpression__Group_1_0__0 ) )
            // InternalPortugol.g:3824:2: ( rule__OrExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:3825:2: ( rule__OrExpression__Group_1_0__0 )
            // InternalPortugol.g:3825:3: rule__OrExpression__Group_1_0__0
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
    // InternalPortugol.g:3833:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3837:1: ( rule__OrExpression__Group_1__1__Impl )
            // InternalPortugol.g:3838:2: rule__OrExpression__Group_1__1__Impl
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
    // InternalPortugol.g:3844:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__RightAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3848:1: ( ( ( rule__OrExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:3849:1: ( ( rule__OrExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:3849:1: ( ( rule__OrExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:3850:2: ( rule__OrExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:3851:2: ( rule__OrExpression__RightAssignment_1_1 )
            // InternalPortugol.g:3851:3: rule__OrExpression__RightAssignment_1_1
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
    // InternalPortugol.g:3860:1: rule__OrExpression__Group_1_0__0 : rule__OrExpression__Group_1_0__0__Impl ;
    public final void rule__OrExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3864:1: ( rule__OrExpression__Group_1_0__0__Impl )
            // InternalPortugol.g:3865:2: rule__OrExpression__Group_1_0__0__Impl
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
    // InternalPortugol.g:3871:1: rule__OrExpression__Group_1_0__0__Impl : ( ( rule__OrExpression__Group_1_0_0__0 ) ) ;
    public final void rule__OrExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3875:1: ( ( ( rule__OrExpression__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:3876:1: ( ( rule__OrExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:3876:1: ( ( rule__OrExpression__Group_1_0_0__0 ) )
            // InternalPortugol.g:3877:2: ( rule__OrExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:3878:2: ( rule__OrExpression__Group_1_0_0__0 )
            // InternalPortugol.g:3878:3: rule__OrExpression__Group_1_0_0__0
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
    // InternalPortugol.g:3887:1: rule__OrExpression__Group_1_0_0__0 : rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1 ;
    public final void rule__OrExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3891:1: ( rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1 )
            // InternalPortugol.g:3892:2: rule__OrExpression__Group_1_0_0__0__Impl rule__OrExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalPortugol.g:3899:1: rule__OrExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3903:1: ( ( () ) )
            // InternalPortugol.g:3904:1: ( () )
            {
            // InternalPortugol.g:3904:1: ( () )
            // InternalPortugol.g:3905:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:3906:2: ()
            // InternalPortugol.g:3906:3: 
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
    // InternalPortugol.g:3914:1: rule__OrExpression__Group_1_0_0__1 : rule__OrExpression__Group_1_0_0__1__Impl ;
    public final void rule__OrExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3918:1: ( rule__OrExpression__Group_1_0_0__1__Impl )
            // InternalPortugol.g:3919:2: rule__OrExpression__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:3925:1: rule__OrExpression__Group_1_0_0__1__Impl : ( ( rule__OrExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__OrExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3929:1: ( ( ( rule__OrExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:3930:1: ( ( rule__OrExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:3930:1: ( ( rule__OrExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:3931:2: ( rule__OrExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:3932:2: ( rule__OrExpression__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:3932:3: rule__OrExpression__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:3941:1: rule__XorExpression__Group__0 : rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 ;
    public final void rule__XorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3945:1: ( rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 )
            // InternalPortugol.g:3946:2: rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalPortugol.g:3953:1: rule__XorExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__XorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3957:1: ( ( ruleAndExpression ) )
            // InternalPortugol.g:3958:1: ( ruleAndExpression )
            {
            // InternalPortugol.g:3958:1: ( ruleAndExpression )
            // InternalPortugol.g:3959:2: ruleAndExpression
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
    // InternalPortugol.g:3968:1: rule__XorExpression__Group__1 : rule__XorExpression__Group__1__Impl ;
    public final void rule__XorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3972:1: ( rule__XorExpression__Group__1__Impl )
            // InternalPortugol.g:3973:2: rule__XorExpression__Group__1__Impl
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
    // InternalPortugol.g:3979:1: rule__XorExpression__Group__1__Impl : ( ( rule__XorExpression__Group_1__0 )* ) ;
    public final void rule__XorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3983:1: ( ( ( rule__XorExpression__Group_1__0 )* ) )
            // InternalPortugol.g:3984:1: ( ( rule__XorExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:3984:1: ( ( rule__XorExpression__Group_1__0 )* )
            // InternalPortugol.g:3985:2: ( rule__XorExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:3986:2: ( rule__XorExpression__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==47) ) {
                    int LA30_2 = input.LA(2);

                    if ( (synpred37_InternalPortugol()) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // InternalPortugol.g:3986:3: rule__XorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__XorExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalPortugol.g:3995:1: rule__XorExpression__Group_1__0 : rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 ;
    public final void rule__XorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:3999:1: ( rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 )
            // InternalPortugol.g:4000:2: rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugol.g:4007:1: rule__XorExpression__Group_1__0__Impl : ( ( rule__XorExpression__Group_1_0__0 ) ) ;
    public final void rule__XorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4011:1: ( ( ( rule__XorExpression__Group_1_0__0 ) ) )
            // InternalPortugol.g:4012:1: ( ( rule__XorExpression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:4012:1: ( ( rule__XorExpression__Group_1_0__0 ) )
            // InternalPortugol.g:4013:2: ( rule__XorExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:4014:2: ( rule__XorExpression__Group_1_0__0 )
            // InternalPortugol.g:4014:3: rule__XorExpression__Group_1_0__0
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
    // InternalPortugol.g:4022:1: rule__XorExpression__Group_1__1 : rule__XorExpression__Group_1__1__Impl ;
    public final void rule__XorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4026:1: ( rule__XorExpression__Group_1__1__Impl )
            // InternalPortugol.g:4027:2: rule__XorExpression__Group_1__1__Impl
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
    // InternalPortugol.g:4033:1: rule__XorExpression__Group_1__1__Impl : ( ( rule__XorExpression__RightAssignment_1_1 ) ) ;
    public final void rule__XorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4037:1: ( ( ( rule__XorExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:4038:1: ( ( rule__XorExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:4038:1: ( ( rule__XorExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:4039:2: ( rule__XorExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:4040:2: ( rule__XorExpression__RightAssignment_1_1 )
            // InternalPortugol.g:4040:3: rule__XorExpression__RightAssignment_1_1
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
    // InternalPortugol.g:4049:1: rule__XorExpression__Group_1_0__0 : rule__XorExpression__Group_1_0__0__Impl ;
    public final void rule__XorExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4053:1: ( rule__XorExpression__Group_1_0__0__Impl )
            // InternalPortugol.g:4054:2: rule__XorExpression__Group_1_0__0__Impl
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
    // InternalPortugol.g:4060:1: rule__XorExpression__Group_1_0__0__Impl : ( ( rule__XorExpression__Group_1_0_0__0 ) ) ;
    public final void rule__XorExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4064:1: ( ( ( rule__XorExpression__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:4065:1: ( ( rule__XorExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:4065:1: ( ( rule__XorExpression__Group_1_0_0__0 ) )
            // InternalPortugol.g:4066:2: ( rule__XorExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:4067:2: ( rule__XorExpression__Group_1_0_0__0 )
            // InternalPortugol.g:4067:3: rule__XorExpression__Group_1_0_0__0
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
    // InternalPortugol.g:4076:1: rule__XorExpression__Group_1_0_0__0 : rule__XorExpression__Group_1_0_0__0__Impl rule__XorExpression__Group_1_0_0__1 ;
    public final void rule__XorExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4080:1: ( rule__XorExpression__Group_1_0_0__0__Impl rule__XorExpression__Group_1_0_0__1 )
            // InternalPortugol.g:4081:2: rule__XorExpression__Group_1_0_0__0__Impl rule__XorExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalPortugol.g:4088:1: rule__XorExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__XorExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4092:1: ( ( () ) )
            // InternalPortugol.g:4093:1: ( () )
            {
            // InternalPortugol.g:4093:1: ( () )
            // InternalPortugol.g:4094:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:4095:2: ()
            // InternalPortugol.g:4095:3: 
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
    // InternalPortugol.g:4103:1: rule__XorExpression__Group_1_0_0__1 : rule__XorExpression__Group_1_0_0__1__Impl ;
    public final void rule__XorExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4107:1: ( rule__XorExpression__Group_1_0_0__1__Impl )
            // InternalPortugol.g:4108:2: rule__XorExpression__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:4114:1: rule__XorExpression__Group_1_0_0__1__Impl : ( ( rule__XorExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__XorExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4118:1: ( ( ( rule__XorExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:4119:1: ( ( rule__XorExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:4119:1: ( ( rule__XorExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:4120:2: ( rule__XorExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:4121:2: ( rule__XorExpression__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:4121:3: rule__XorExpression__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:4130:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4134:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalPortugol.g:4135:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalPortugol.g:4142:1: rule__AndExpression__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4146:1: ( ( ruleComparison ) )
            // InternalPortugol.g:4147:1: ( ruleComparison )
            {
            // InternalPortugol.g:4147:1: ( ruleComparison )
            // InternalPortugol.g:4148:2: ruleComparison
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
    // InternalPortugol.g:4157:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4161:1: ( rule__AndExpression__Group__1__Impl )
            // InternalPortugol.g:4162:2: rule__AndExpression__Group__1__Impl
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
    // InternalPortugol.g:4168:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4172:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalPortugol.g:4173:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:4173:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalPortugol.g:4174:2: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:4175:2: ( rule__AndExpression__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==16) ) {
                    int LA31_2 = input.LA(2);

                    if ( (synpred38_InternalPortugol()) ) {
                        alt31=1;
                    }


                }
                else if ( (LA31_0==17) ) {
                    int LA31_3 = input.LA(2);

                    if ( (synpred38_InternalPortugol()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalPortugol.g:4175:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalPortugol.g:4184:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4188:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalPortugol.g:4189:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugol.g:4196:1: rule__AndExpression__Group_1__0__Impl : ( ( rule__AndExpression__Group_1_0__0 ) ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4200:1: ( ( ( rule__AndExpression__Group_1_0__0 ) ) )
            // InternalPortugol.g:4201:1: ( ( rule__AndExpression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:4201:1: ( ( rule__AndExpression__Group_1_0__0 ) )
            // InternalPortugol.g:4202:2: ( rule__AndExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:4203:2: ( rule__AndExpression__Group_1_0__0 )
            // InternalPortugol.g:4203:3: rule__AndExpression__Group_1_0__0
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
    // InternalPortugol.g:4211:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4215:1: ( rule__AndExpression__Group_1__1__Impl )
            // InternalPortugol.g:4216:2: rule__AndExpression__Group_1__1__Impl
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
    // InternalPortugol.g:4222:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__RightAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4226:1: ( ( ( rule__AndExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:4227:1: ( ( rule__AndExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:4227:1: ( ( rule__AndExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:4228:2: ( rule__AndExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:4229:2: ( rule__AndExpression__RightAssignment_1_1 )
            // InternalPortugol.g:4229:3: rule__AndExpression__RightAssignment_1_1
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
    // InternalPortugol.g:4238:1: rule__AndExpression__Group_1_0__0 : rule__AndExpression__Group_1_0__0__Impl ;
    public final void rule__AndExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4242:1: ( rule__AndExpression__Group_1_0__0__Impl )
            // InternalPortugol.g:4243:2: rule__AndExpression__Group_1_0__0__Impl
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
    // InternalPortugol.g:4249:1: rule__AndExpression__Group_1_0__0__Impl : ( ( rule__AndExpression__Group_1_0_0__0 ) ) ;
    public final void rule__AndExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4253:1: ( ( ( rule__AndExpression__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:4254:1: ( ( rule__AndExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:4254:1: ( ( rule__AndExpression__Group_1_0_0__0 ) )
            // InternalPortugol.g:4255:2: ( rule__AndExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:4256:2: ( rule__AndExpression__Group_1_0_0__0 )
            // InternalPortugol.g:4256:3: rule__AndExpression__Group_1_0_0__0
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
    // InternalPortugol.g:4265:1: rule__AndExpression__Group_1_0_0__0 : rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1 ;
    public final void rule__AndExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4269:1: ( rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1 )
            // InternalPortugol.g:4270:2: rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalPortugol.g:4277:1: rule__AndExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4281:1: ( ( () ) )
            // InternalPortugol.g:4282:1: ( () )
            {
            // InternalPortugol.g:4282:1: ( () )
            // InternalPortugol.g:4283:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:4284:2: ()
            // InternalPortugol.g:4284:3: 
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
    // InternalPortugol.g:4292:1: rule__AndExpression__Group_1_0_0__1 : rule__AndExpression__Group_1_0_0__1__Impl ;
    public final void rule__AndExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4296:1: ( rule__AndExpression__Group_1_0_0__1__Impl )
            // InternalPortugol.g:4297:2: rule__AndExpression__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:4303:1: rule__AndExpression__Group_1_0_0__1__Impl : ( ( rule__AndExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__AndExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4307:1: ( ( ( rule__AndExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:4308:1: ( ( rule__AndExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:4308:1: ( ( rule__AndExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:4309:2: ( rule__AndExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:4310:2: ( rule__AndExpression__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:4310:3: rule__AndExpression__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:4319:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4323:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalPortugol.g:4324:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalPortugol.g:4331:1: rule__Comparison__Group__0__Impl : ( ruleEquExpression ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4335:1: ( ( ruleEquExpression ) )
            // InternalPortugol.g:4336:1: ( ruleEquExpression )
            {
            // InternalPortugol.g:4336:1: ( ruleEquExpression )
            // InternalPortugol.g:4337:2: ruleEquExpression
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
    // InternalPortugol.g:4346:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4350:1: ( rule__Comparison__Group__1__Impl )
            // InternalPortugol.g:4351:2: rule__Comparison__Group__1__Impl
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
    // InternalPortugol.g:4357:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4361:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalPortugol.g:4362:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalPortugol.g:4362:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalPortugol.g:4363:2: ( rule__Comparison__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1()); 
            }
            // InternalPortugol.g:4364:2: ( rule__Comparison__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==18) ) {
                    int LA32_2 = input.LA(2);

                    if ( (synpred39_InternalPortugol()) ) {
                        alt32=1;
                    }


                }
                else if ( (LA32_0==19) ) {
                    int LA32_3 = input.LA(2);

                    if ( (synpred39_InternalPortugol()) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // InternalPortugol.g:4364:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalPortugol.g:4373:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4377:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalPortugol.g:4378:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugol.g:4385:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Group_1_0__0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4389:1: ( ( ( rule__Comparison__Group_1_0__0 ) ) )
            // InternalPortugol.g:4390:1: ( ( rule__Comparison__Group_1_0__0 ) )
            {
            // InternalPortugol.g:4390:1: ( ( rule__Comparison__Group_1_0__0 ) )
            // InternalPortugol.g:4391:2: ( rule__Comparison__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:4392:2: ( rule__Comparison__Group_1_0__0 )
            // InternalPortugol.g:4392:3: rule__Comparison__Group_1_0__0
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
    // InternalPortugol.g:4400:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4404:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalPortugol.g:4405:2: rule__Comparison__Group_1__1__Impl
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
    // InternalPortugol.g:4411:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4415:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:4416:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:4416:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // InternalPortugol.g:4417:2: ( rule__Comparison__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:4418:2: ( rule__Comparison__RightAssignment_1_1 )
            // InternalPortugol.g:4418:3: rule__Comparison__RightAssignment_1_1
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
    // InternalPortugol.g:4427:1: rule__Comparison__Group_1_0__0 : rule__Comparison__Group_1_0__0__Impl ;
    public final void rule__Comparison__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4431:1: ( rule__Comparison__Group_1_0__0__Impl )
            // InternalPortugol.g:4432:2: rule__Comparison__Group_1_0__0__Impl
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
    // InternalPortugol.g:4438:1: rule__Comparison__Group_1_0__0__Impl : ( ( rule__Comparison__Group_1_0_0__0 ) ) ;
    public final void rule__Comparison__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4442:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:4443:1: ( ( rule__Comparison__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:4443:1: ( ( rule__Comparison__Group_1_0_0__0 ) )
            // InternalPortugol.g:4444:2: ( rule__Comparison__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:4445:2: ( rule__Comparison__Group_1_0_0__0 )
            // InternalPortugol.g:4445:3: rule__Comparison__Group_1_0_0__0
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
    // InternalPortugol.g:4454:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4458:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalPortugol.g:4459:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalPortugol.g:4466:1: rule__Comparison__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4470:1: ( ( () ) )
            // InternalPortugol.g:4471:1: ( () )
            {
            // InternalPortugol.g:4471:1: ( () )
            // InternalPortugol.g:4472:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:4473:2: ()
            // InternalPortugol.g:4473:3: 
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
    // InternalPortugol.g:4481:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4485:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalPortugol.g:4486:2: rule__Comparison__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:4492:1: rule__Comparison__Group_1_0_0__1__Impl : ( ( rule__Comparison__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4496:1: ( ( ( rule__Comparison__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:4497:1: ( ( rule__Comparison__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:4497:1: ( ( rule__Comparison__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:4498:2: ( rule__Comparison__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:4499:2: ( rule__Comparison__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:4499:3: rule__Comparison__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:4508:1: rule__EquExpression__Group__0 : rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1 ;
    public final void rule__EquExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4512:1: ( rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1 )
            // InternalPortugol.g:4513:2: rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalPortugol.g:4520:1: rule__EquExpression__Group__0__Impl : ( ruleAddExpression ) ;
    public final void rule__EquExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4524:1: ( ( ruleAddExpression ) )
            // InternalPortugol.g:4525:1: ( ruleAddExpression )
            {
            // InternalPortugol.g:4525:1: ( ruleAddExpression )
            // InternalPortugol.g:4526:2: ruleAddExpression
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
    // InternalPortugol.g:4535:1: rule__EquExpression__Group__1 : rule__EquExpression__Group__1__Impl ;
    public final void rule__EquExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4539:1: ( rule__EquExpression__Group__1__Impl )
            // InternalPortugol.g:4540:2: rule__EquExpression__Group__1__Impl
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
    // InternalPortugol.g:4546:1: rule__EquExpression__Group__1__Impl : ( ( rule__EquExpression__Group_1__0 )* ) ;
    public final void rule__EquExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4550:1: ( ( ( rule__EquExpression__Group_1__0 )* ) )
            // InternalPortugol.g:4551:1: ( ( rule__EquExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:4551:1: ( ( rule__EquExpression__Group_1__0 )* )
            // InternalPortugol.g:4552:2: ( rule__EquExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:4553:2: ( rule__EquExpression__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                switch ( input.LA(1) ) {
                case 20:
                    {
                    int LA33_2 = input.LA(2);

                    if ( (synpred40_InternalPortugol()) ) {
                        alt33=1;
                    }


                    }
                    break;
                case 21:
                    {
                    int LA33_3 = input.LA(2);

                    if ( (synpred40_InternalPortugol()) ) {
                        alt33=1;
                    }


                    }
                    break;
                case 22:
                    {
                    int LA33_4 = input.LA(2);

                    if ( (synpred40_InternalPortugol()) ) {
                        alt33=1;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA33_5 = input.LA(2);

                    if ( (synpred40_InternalPortugol()) ) {
                        alt33=1;
                    }


                    }
                    break;

                }

                switch (alt33) {
            	case 1 :
            	    // InternalPortugol.g:4553:3: rule__EquExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__EquExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalPortugol.g:4562:1: rule__EquExpression__Group_1__0 : rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1 ;
    public final void rule__EquExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4566:1: ( rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1 )
            // InternalPortugol.g:4567:2: rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugol.g:4574:1: rule__EquExpression__Group_1__0__Impl : ( ( rule__EquExpression__Group_1_0__0 ) ) ;
    public final void rule__EquExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4578:1: ( ( ( rule__EquExpression__Group_1_0__0 ) ) )
            // InternalPortugol.g:4579:1: ( ( rule__EquExpression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:4579:1: ( ( rule__EquExpression__Group_1_0__0 ) )
            // InternalPortugol.g:4580:2: ( rule__EquExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:4581:2: ( rule__EquExpression__Group_1_0__0 )
            // InternalPortugol.g:4581:3: rule__EquExpression__Group_1_0__0
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
    // InternalPortugol.g:4589:1: rule__EquExpression__Group_1__1 : rule__EquExpression__Group_1__1__Impl ;
    public final void rule__EquExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4593:1: ( rule__EquExpression__Group_1__1__Impl )
            // InternalPortugol.g:4594:2: rule__EquExpression__Group_1__1__Impl
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
    // InternalPortugol.g:4600:1: rule__EquExpression__Group_1__1__Impl : ( ( rule__EquExpression__RightAssignment_1_1 ) ) ;
    public final void rule__EquExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4604:1: ( ( ( rule__EquExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:4605:1: ( ( rule__EquExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:4605:1: ( ( rule__EquExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:4606:2: ( rule__EquExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:4607:2: ( rule__EquExpression__RightAssignment_1_1 )
            // InternalPortugol.g:4607:3: rule__EquExpression__RightAssignment_1_1
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
    // InternalPortugol.g:4616:1: rule__EquExpression__Group_1_0__0 : rule__EquExpression__Group_1_0__0__Impl ;
    public final void rule__EquExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4620:1: ( rule__EquExpression__Group_1_0__0__Impl )
            // InternalPortugol.g:4621:2: rule__EquExpression__Group_1_0__0__Impl
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
    // InternalPortugol.g:4627:1: rule__EquExpression__Group_1_0__0__Impl : ( ( rule__EquExpression__Group_1_0_0__0 ) ) ;
    public final void rule__EquExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4631:1: ( ( ( rule__EquExpression__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:4632:1: ( ( rule__EquExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:4632:1: ( ( rule__EquExpression__Group_1_0_0__0 ) )
            // InternalPortugol.g:4633:2: ( rule__EquExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:4634:2: ( rule__EquExpression__Group_1_0_0__0 )
            // InternalPortugol.g:4634:3: rule__EquExpression__Group_1_0_0__0
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
    // InternalPortugol.g:4643:1: rule__EquExpression__Group_1_0_0__0 : rule__EquExpression__Group_1_0_0__0__Impl rule__EquExpression__Group_1_0_0__1 ;
    public final void rule__EquExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4647:1: ( rule__EquExpression__Group_1_0_0__0__Impl rule__EquExpression__Group_1_0_0__1 )
            // InternalPortugol.g:4648:2: rule__EquExpression__Group_1_0_0__0__Impl rule__EquExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalPortugol.g:4655:1: rule__EquExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__EquExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4659:1: ( ( () ) )
            // InternalPortugol.g:4660:1: ( () )
            {
            // InternalPortugol.g:4660:1: ( () )
            // InternalPortugol.g:4661:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:4662:2: ()
            // InternalPortugol.g:4662:3: 
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
    // InternalPortugol.g:4670:1: rule__EquExpression__Group_1_0_0__1 : rule__EquExpression__Group_1_0_0__1__Impl ;
    public final void rule__EquExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4674:1: ( rule__EquExpression__Group_1_0_0__1__Impl )
            // InternalPortugol.g:4675:2: rule__EquExpression__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:4681:1: rule__EquExpression__Group_1_0_0__1__Impl : ( ( rule__EquExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__EquExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4685:1: ( ( ( rule__EquExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:4686:1: ( ( rule__EquExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:4686:1: ( ( rule__EquExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:4687:2: ( rule__EquExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:4688:2: ( rule__EquExpression__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:4688:3: rule__EquExpression__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:4697:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4701:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // InternalPortugol.g:4702:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalPortugol.g:4709:1: rule__AddExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4713:1: ( ( ruleMultiplicativeExpression ) )
            // InternalPortugol.g:4714:1: ( ruleMultiplicativeExpression )
            {
            // InternalPortugol.g:4714:1: ( ruleMultiplicativeExpression )
            // InternalPortugol.g:4715:2: ruleMultiplicativeExpression
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
    // InternalPortugol.g:4724:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4728:1: ( rule__AddExpression__Group__1__Impl )
            // InternalPortugol.g:4729:2: rule__AddExpression__Group__1__Impl
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
    // InternalPortugol.g:4735:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4739:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // InternalPortugol.g:4740:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:4740:1: ( ( rule__AddExpression__Group_1__0 )* )
            // InternalPortugol.g:4741:2: ( rule__AddExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:4742:2: ( rule__AddExpression__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==24) ) {
                    int LA34_2 = input.LA(2);

                    if ( (synpred41_InternalPortugol()) ) {
                        alt34=1;
                    }


                }
                else if ( (LA34_0==25) ) {
                    int LA34_3 = input.LA(2);

                    if ( (synpred41_InternalPortugol()) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // InternalPortugol.g:4742:3: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__AddExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalPortugol.g:4751:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4755:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // InternalPortugol.g:4756:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugol.g:4763:1: rule__AddExpression__Group_1__0__Impl : ( ( rule__AddExpression__Group_1_0__0 ) ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4767:1: ( ( ( rule__AddExpression__Group_1_0__0 ) ) )
            // InternalPortugol.g:4768:1: ( ( rule__AddExpression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:4768:1: ( ( rule__AddExpression__Group_1_0__0 ) )
            // InternalPortugol.g:4769:2: ( rule__AddExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:4770:2: ( rule__AddExpression__Group_1_0__0 )
            // InternalPortugol.g:4770:3: rule__AddExpression__Group_1_0__0
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
    // InternalPortugol.g:4778:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4782:1: ( rule__AddExpression__Group_1__1__Impl )
            // InternalPortugol.g:4783:2: rule__AddExpression__Group_1__1__Impl
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
    // InternalPortugol.g:4789:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__RightAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4793:1: ( ( ( rule__AddExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:4794:1: ( ( rule__AddExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:4794:1: ( ( rule__AddExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:4795:2: ( rule__AddExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:4796:2: ( rule__AddExpression__RightAssignment_1_1 )
            // InternalPortugol.g:4796:3: rule__AddExpression__RightAssignment_1_1
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
    // InternalPortugol.g:4805:1: rule__AddExpression__Group_1_0__0 : rule__AddExpression__Group_1_0__0__Impl ;
    public final void rule__AddExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4809:1: ( rule__AddExpression__Group_1_0__0__Impl )
            // InternalPortugol.g:4810:2: rule__AddExpression__Group_1_0__0__Impl
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
    // InternalPortugol.g:4816:1: rule__AddExpression__Group_1_0__0__Impl : ( ( rule__AddExpression__Group_1_0_0__0 ) ) ;
    public final void rule__AddExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4820:1: ( ( ( rule__AddExpression__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:4821:1: ( ( rule__AddExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:4821:1: ( ( rule__AddExpression__Group_1_0_0__0 ) )
            // InternalPortugol.g:4822:2: ( rule__AddExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:4823:2: ( rule__AddExpression__Group_1_0_0__0 )
            // InternalPortugol.g:4823:3: rule__AddExpression__Group_1_0_0__0
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
    // InternalPortugol.g:4832:1: rule__AddExpression__Group_1_0_0__0 : rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1 ;
    public final void rule__AddExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4836:1: ( rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1 )
            // InternalPortugol.g:4837:2: rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalPortugol.g:4844:1: rule__AddExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4848:1: ( ( () ) )
            // InternalPortugol.g:4849:1: ( () )
            {
            // InternalPortugol.g:4849:1: ( () )
            // InternalPortugol.g:4850:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:4851:2: ()
            // InternalPortugol.g:4851:3: 
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
    // InternalPortugol.g:4859:1: rule__AddExpression__Group_1_0_0__1 : rule__AddExpression__Group_1_0_0__1__Impl ;
    public final void rule__AddExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4863:1: ( rule__AddExpression__Group_1_0_0__1__Impl )
            // InternalPortugol.g:4864:2: rule__AddExpression__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:4870:1: rule__AddExpression__Group_1_0_0__1__Impl : ( ( rule__AddExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__AddExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4874:1: ( ( ( rule__AddExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:4875:1: ( ( rule__AddExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:4875:1: ( ( rule__AddExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:4876:2: ( rule__AddExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:4877:2: ( rule__AddExpression__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:4877:3: rule__AddExpression__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:4886:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4890:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalPortugol.g:4891:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalPortugol.g:4898:1: rule__MultiplicativeExpression__Group__0__Impl : ( rulePowerExpression ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4902:1: ( ( rulePowerExpression ) )
            // InternalPortugol.g:4903:1: ( rulePowerExpression )
            {
            // InternalPortugol.g:4903:1: ( rulePowerExpression )
            // InternalPortugol.g:4904:2: rulePowerExpression
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
    // InternalPortugol.g:4913:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4917:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalPortugol.g:4918:2: rule__MultiplicativeExpression__Group__1__Impl
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
    // InternalPortugol.g:4924:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4928:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalPortugol.g:4929:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:4929:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalPortugol.g:4930:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:4931:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    int LA35_2 = input.LA(2);

                    if ( (synpred42_InternalPortugol()) ) {
                        alt35=1;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA35_3 = input.LA(2);

                    if ( (synpred42_InternalPortugol()) ) {
                        alt35=1;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA35_4 = input.LA(2);

                    if ( (synpred42_InternalPortugol()) ) {
                        alt35=1;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA35_5 = input.LA(2);

                    if ( (synpred42_InternalPortugol()) ) {
                        alt35=1;
                    }


                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // InternalPortugol.g:4931:3: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalPortugol.g:4940:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4944:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalPortugol.g:4945:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugol.g:4952:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( ( rule__MultiplicativeExpression__Group_1_0__0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4956:1: ( ( ( rule__MultiplicativeExpression__Group_1_0__0 ) ) )
            // InternalPortugol.g:4957:1: ( ( rule__MultiplicativeExpression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:4957:1: ( ( rule__MultiplicativeExpression__Group_1_0__0 ) )
            // InternalPortugol.g:4958:2: ( rule__MultiplicativeExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:4959:2: ( rule__MultiplicativeExpression__Group_1_0__0 )
            // InternalPortugol.g:4959:3: rule__MultiplicativeExpression__Group_1_0__0
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
    // InternalPortugol.g:4967:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4971:1: ( rule__MultiplicativeExpression__Group_1__1__Impl )
            // InternalPortugol.g:4972:2: rule__MultiplicativeExpression__Group_1__1__Impl
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
    // InternalPortugol.g:4978:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4982:1: ( ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:4983:1: ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:4983:1: ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:4984:2: ( rule__MultiplicativeExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:4985:2: ( rule__MultiplicativeExpression__RightAssignment_1_1 )
            // InternalPortugol.g:4985:3: rule__MultiplicativeExpression__RightAssignment_1_1
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
    // InternalPortugol.g:4994:1: rule__MultiplicativeExpression__Group_1_0__0 : rule__MultiplicativeExpression__Group_1_0__0__Impl ;
    public final void rule__MultiplicativeExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:4998:1: ( rule__MultiplicativeExpression__Group_1_0__0__Impl )
            // InternalPortugol.g:4999:2: rule__MultiplicativeExpression__Group_1_0__0__Impl
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
    // InternalPortugol.g:5005:1: rule__MultiplicativeExpression__Group_1_0__0__Impl : ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5009:1: ( ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:5010:1: ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:5010:1: ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) )
            // InternalPortugol.g:5011:2: ( rule__MultiplicativeExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:5012:2: ( rule__MultiplicativeExpression__Group_1_0_0__0 )
            // InternalPortugol.g:5012:3: rule__MultiplicativeExpression__Group_1_0_0__0
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
    // InternalPortugol.g:5021:1: rule__MultiplicativeExpression__Group_1_0_0__0 : rule__MultiplicativeExpression__Group_1_0_0__0__Impl rule__MultiplicativeExpression__Group_1_0_0__1 ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5025:1: ( rule__MultiplicativeExpression__Group_1_0_0__0__Impl rule__MultiplicativeExpression__Group_1_0_0__1 )
            // InternalPortugol.g:5026:2: rule__MultiplicativeExpression__Group_1_0_0__0__Impl rule__MultiplicativeExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalPortugol.g:5033:1: rule__MultiplicativeExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5037:1: ( ( () ) )
            // InternalPortugol.g:5038:1: ( () )
            {
            // InternalPortugol.g:5038:1: ( () )
            // InternalPortugol.g:5039:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:5040:2: ()
            // InternalPortugol.g:5040:3: 
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
    // InternalPortugol.g:5048:1: rule__MultiplicativeExpression__Group_1_0_0__1 : rule__MultiplicativeExpression__Group_1_0_0__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5052:1: ( rule__MultiplicativeExpression__Group_1_0_0__1__Impl )
            // InternalPortugol.g:5053:2: rule__MultiplicativeExpression__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:5059:1: rule__MultiplicativeExpression__Group_1_0_0__1__Impl : ( ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5063:1: ( ( ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:5064:1: ( ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:5064:1: ( ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:5065:2: ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:5066:2: ( rule__MultiplicativeExpression__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:5066:3: rule__MultiplicativeExpression__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:5075:1: rule__PowerExpression__Group__0 : rule__PowerExpression__Group__0__Impl rule__PowerExpression__Group__1 ;
    public final void rule__PowerExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5079:1: ( rule__PowerExpression__Group__0__Impl rule__PowerExpression__Group__1 )
            // InternalPortugol.g:5080:2: rule__PowerExpression__Group__0__Impl rule__PowerExpression__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalPortugol.g:5087:1: rule__PowerExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__PowerExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5091:1: ( ( ruleUnaryExpression ) )
            // InternalPortugol.g:5092:1: ( ruleUnaryExpression )
            {
            // InternalPortugol.g:5092:1: ( ruleUnaryExpression )
            // InternalPortugol.g:5093:2: ruleUnaryExpression
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
    // InternalPortugol.g:5102:1: rule__PowerExpression__Group__1 : rule__PowerExpression__Group__1__Impl ;
    public final void rule__PowerExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5106:1: ( rule__PowerExpression__Group__1__Impl )
            // InternalPortugol.g:5107:2: rule__PowerExpression__Group__1__Impl
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
    // InternalPortugol.g:5113:1: rule__PowerExpression__Group__1__Impl : ( ( rule__PowerExpression__Group_1__0 )* ) ;
    public final void rule__PowerExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5117:1: ( ( ( rule__PowerExpression__Group_1__0 )* ) )
            // InternalPortugol.g:5118:1: ( ( rule__PowerExpression__Group_1__0 )* )
            {
            // InternalPortugol.g:5118:1: ( ( rule__PowerExpression__Group_1__0 )* )
            // InternalPortugol.g:5119:2: ( rule__PowerExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup_1()); 
            }
            // InternalPortugol.g:5120:2: ( rule__PowerExpression__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==48) ) {
                    int LA36_2 = input.LA(2);

                    if ( (synpred43_InternalPortugol()) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // InternalPortugol.g:5120:3: rule__PowerExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__PowerExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalPortugol.g:5129:1: rule__PowerExpression__Group_1__0 : rule__PowerExpression__Group_1__0__Impl rule__PowerExpression__Group_1__1 ;
    public final void rule__PowerExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5133:1: ( rule__PowerExpression__Group_1__0__Impl rule__PowerExpression__Group_1__1 )
            // InternalPortugol.g:5134:2: rule__PowerExpression__Group_1__0__Impl rule__PowerExpression__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugol.g:5141:1: rule__PowerExpression__Group_1__0__Impl : ( ( rule__PowerExpression__Group_1_0__0 ) ) ;
    public final void rule__PowerExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5145:1: ( ( ( rule__PowerExpression__Group_1_0__0 ) ) )
            // InternalPortugol.g:5146:1: ( ( rule__PowerExpression__Group_1_0__0 ) )
            {
            // InternalPortugol.g:5146:1: ( ( rule__PowerExpression__Group_1_0__0 ) )
            // InternalPortugol.g:5147:2: ( rule__PowerExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:5148:2: ( rule__PowerExpression__Group_1_0__0 )
            // InternalPortugol.g:5148:3: rule__PowerExpression__Group_1_0__0
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
    // InternalPortugol.g:5156:1: rule__PowerExpression__Group_1__1 : rule__PowerExpression__Group_1__1__Impl ;
    public final void rule__PowerExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5160:1: ( rule__PowerExpression__Group_1__1__Impl )
            // InternalPortugol.g:5161:2: rule__PowerExpression__Group_1__1__Impl
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
    // InternalPortugol.g:5167:1: rule__PowerExpression__Group_1__1__Impl : ( ( rule__PowerExpression__RightAssignment_1_1 ) ) ;
    public final void rule__PowerExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5171:1: ( ( ( rule__PowerExpression__RightAssignment_1_1 ) ) )
            // InternalPortugol.g:5172:1: ( ( rule__PowerExpression__RightAssignment_1_1 ) )
            {
            // InternalPortugol.g:5172:1: ( ( rule__PowerExpression__RightAssignment_1_1 ) )
            // InternalPortugol.g:5173:2: ( rule__PowerExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalPortugol.g:5174:2: ( rule__PowerExpression__RightAssignment_1_1 )
            // InternalPortugol.g:5174:3: rule__PowerExpression__RightAssignment_1_1
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
    // InternalPortugol.g:5183:1: rule__PowerExpression__Group_1_0__0 : rule__PowerExpression__Group_1_0__0__Impl ;
    public final void rule__PowerExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5187:1: ( rule__PowerExpression__Group_1_0__0__Impl )
            // InternalPortugol.g:5188:2: rule__PowerExpression__Group_1_0__0__Impl
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
    // InternalPortugol.g:5194:1: rule__PowerExpression__Group_1_0__0__Impl : ( ( rule__PowerExpression__Group_1_0_0__0 ) ) ;
    public final void rule__PowerExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5198:1: ( ( ( rule__PowerExpression__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:5199:1: ( ( rule__PowerExpression__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:5199:1: ( ( rule__PowerExpression__Group_1_0_0__0 ) )
            // InternalPortugol.g:5200:2: ( rule__PowerExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:5201:2: ( rule__PowerExpression__Group_1_0_0__0 )
            // InternalPortugol.g:5201:3: rule__PowerExpression__Group_1_0_0__0
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
    // InternalPortugol.g:5210:1: rule__PowerExpression__Group_1_0_0__0 : rule__PowerExpression__Group_1_0_0__0__Impl rule__PowerExpression__Group_1_0_0__1 ;
    public final void rule__PowerExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5214:1: ( rule__PowerExpression__Group_1_0_0__0__Impl rule__PowerExpression__Group_1_0_0__1 )
            // InternalPortugol.g:5215:2: rule__PowerExpression__Group_1_0_0__0__Impl rule__PowerExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalPortugol.g:5222:1: rule__PowerExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PowerExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5226:1: ( ( () ) )
            // InternalPortugol.g:5227:1: ( () )
            {
            // InternalPortugol.g:5227:1: ( () )
            // InternalPortugol.g:5228:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()); 
            }
            // InternalPortugol.g:5229:2: ()
            // InternalPortugol.g:5229:3: 
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
    // InternalPortugol.g:5237:1: rule__PowerExpression__Group_1_0_0__1 : rule__PowerExpression__Group_1_0_0__1__Impl ;
    public final void rule__PowerExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5241:1: ( rule__PowerExpression__Group_1_0_0__1__Impl )
            // InternalPortugol.g:5242:2: rule__PowerExpression__Group_1_0_0__1__Impl
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
    // InternalPortugol.g:5248:1: rule__PowerExpression__Group_1_0_0__1__Impl : ( ( rule__PowerExpression__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__PowerExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5252:1: ( ( ( rule__PowerExpression__OpAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:5253:1: ( ( rule__PowerExpression__OpAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:5253:1: ( ( rule__PowerExpression__OpAssignment_1_0_0_1 ) )
            // InternalPortugol.g:5254:2: ( rule__PowerExpression__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:5255:2: ( rule__PowerExpression__OpAssignment_1_0_0_1 )
            // InternalPortugol.g:5255:3: rule__PowerExpression__OpAssignment_1_0_0_1
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
    // InternalPortugol.g:5264:1: rule__UnaryExpression__Group_0__0 : rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 ;
    public final void rule__UnaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5268:1: ( rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 )
            // InternalPortugol.g:5269:2: rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalPortugol.g:5276:1: rule__UnaryExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5280:1: ( ( () ) )
            // InternalPortugol.g:5281:1: ( () )
            {
            // InternalPortugol.g:5281:1: ( () )
            // InternalPortugol.g:5282:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_0_0()); 
            }
            // InternalPortugol.g:5283:2: ()
            // InternalPortugol.g:5283:3: 
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
    // InternalPortugol.g:5291:1: rule__UnaryExpression__Group_0__1 : rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 ;
    public final void rule__UnaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5295:1: ( rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 )
            // InternalPortugol.g:5296:2: rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugol.g:5303:1: rule__UnaryExpression__Group_0__1__Impl : ( ( rule__UnaryExpression__OpAssignment_0_1 ) ) ;
    public final void rule__UnaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5307:1: ( ( ( rule__UnaryExpression__OpAssignment_0_1 ) ) )
            // InternalPortugol.g:5308:1: ( ( rule__UnaryExpression__OpAssignment_0_1 ) )
            {
            // InternalPortugol.g:5308:1: ( ( rule__UnaryExpression__OpAssignment_0_1 ) )
            // InternalPortugol.g:5309:2: ( rule__UnaryExpression__OpAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOpAssignment_0_1()); 
            }
            // InternalPortugol.g:5310:2: ( rule__UnaryExpression__OpAssignment_0_1 )
            // InternalPortugol.g:5310:3: rule__UnaryExpression__OpAssignment_0_1
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
    // InternalPortugol.g:5318:1: rule__UnaryExpression__Group_0__2 : rule__UnaryExpression__Group_0__2__Impl ;
    public final void rule__UnaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5322:1: ( rule__UnaryExpression__Group_0__2__Impl )
            // InternalPortugol.g:5323:2: rule__UnaryExpression__Group_0__2__Impl
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
    // InternalPortugol.g:5329:1: rule__UnaryExpression__Group_0__2__Impl : ( ( rule__UnaryExpression__OperandAssignment_0_2 ) ) ;
    public final void rule__UnaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5333:1: ( ( ( rule__UnaryExpression__OperandAssignment_0_2 ) ) )
            // InternalPortugol.g:5334:1: ( ( rule__UnaryExpression__OperandAssignment_0_2 ) )
            {
            // InternalPortugol.g:5334:1: ( ( rule__UnaryExpression__OperandAssignment_0_2 ) )
            // InternalPortugol.g:5335:2: ( rule__UnaryExpression__OperandAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_0_2()); 
            }
            // InternalPortugol.g:5336:2: ( rule__UnaryExpression__OperandAssignment_0_2 )
            // InternalPortugol.g:5336:3: rule__UnaryExpression__OperandAssignment_0_2
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


    // $ANTLR start "rule__MemberCall__Group__0"
    // InternalPortugol.g:5345:1: rule__MemberCall__Group__0 : rule__MemberCall__Group__0__Impl rule__MemberCall__Group__1 ;
    public final void rule__MemberCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5349:1: ( rule__MemberCall__Group__0__Impl rule__MemberCall__Group__1 )
            // InternalPortugol.g:5350:2: rule__MemberCall__Group__0__Impl rule__MemberCall__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__MemberCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MemberCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberCall__Group__0"


    // $ANTLR start "rule__MemberCall__Group__0__Impl"
    // InternalPortugol.g:5357:1: rule__MemberCall__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__MemberCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5361:1: ( ( rulePrimaryExpression ) )
            // InternalPortugol.g:5362:1: ( rulePrimaryExpression )
            {
            // InternalPortugol.g:5362:1: ( rulePrimaryExpression )
            // InternalPortugol.g:5363:2: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberCallAccess().getPrimaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberCallAccess().getPrimaryExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberCall__Group__0__Impl"


    // $ANTLR start "rule__MemberCall__Group__1"
    // InternalPortugol.g:5372:1: rule__MemberCall__Group__1 : rule__MemberCall__Group__1__Impl ;
    public final void rule__MemberCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5376:1: ( rule__MemberCall__Group__1__Impl )
            // InternalPortugol.g:5377:2: rule__MemberCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberCall__Group__1"


    // $ANTLR start "rule__MemberCall__Group__1__Impl"
    // InternalPortugol.g:5383:1: rule__MemberCall__Group__1__Impl : ( ( rule__MemberCall__Group_1__0 )* ) ;
    public final void rule__MemberCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5387:1: ( ( ( rule__MemberCall__Group_1__0 )* ) )
            // InternalPortugol.g:5388:1: ( ( rule__MemberCall__Group_1__0 )* )
            {
            // InternalPortugol.g:5388:1: ( ( rule__MemberCall__Group_1__0 )* )
            // InternalPortugol.g:5389:2: ( rule__MemberCall__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberCallAccess().getGroup_1()); 
            }
            // InternalPortugol.g:5390:2: ( rule__MemberCall__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    int LA37_2 = input.LA(2);

                    if ( (synpred44_InternalPortugol()) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // InternalPortugol.g:5390:3: rule__MemberCall__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__MemberCall__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberCallAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberCall__Group__1__Impl"


    // $ANTLR start "rule__MemberCall__Group_1__0"
    // InternalPortugol.g:5399:1: rule__MemberCall__Group_1__0 : rule__MemberCall__Group_1__0__Impl rule__MemberCall__Group_1__1 ;
    public final void rule__MemberCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5403:1: ( rule__MemberCall__Group_1__0__Impl rule__MemberCall__Group_1__1 )
            // InternalPortugol.g:5404:2: rule__MemberCall__Group_1__0__Impl rule__MemberCall__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__MemberCall__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MemberCall__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberCall__Group_1__0"


    // $ANTLR start "rule__MemberCall__Group_1__0__Impl"
    // InternalPortugol.g:5411:1: rule__MemberCall__Group_1__0__Impl : ( ( rule__MemberCall__Group_1_0__0 ) ) ;
    public final void rule__MemberCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5415:1: ( ( ( rule__MemberCall__Group_1_0__0 ) ) )
            // InternalPortugol.g:5416:1: ( ( rule__MemberCall__Group_1_0__0 ) )
            {
            // InternalPortugol.g:5416:1: ( ( rule__MemberCall__Group_1_0__0 ) )
            // InternalPortugol.g:5417:2: ( rule__MemberCall__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberCallAccess().getGroup_1_0()); 
            }
            // InternalPortugol.g:5418:2: ( rule__MemberCall__Group_1_0__0 )
            // InternalPortugol.g:5418:3: rule__MemberCall__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__MemberCall__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberCallAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberCall__Group_1__0__Impl"


    // $ANTLR start "rule__MemberCall__Group_1__1"
    // InternalPortugol.g:5426:1: rule__MemberCall__Group_1__1 : rule__MemberCall__Group_1__1__Impl ;
    public final void rule__MemberCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5430:1: ( rule__MemberCall__Group_1__1__Impl )
            // InternalPortugol.g:5431:2: rule__MemberCall__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberCall__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberCall__Group_1__1"


    // $ANTLR start "rule__MemberCall__Group_1__1__Impl"
    // InternalPortugol.g:5437:1: rule__MemberCall__Group_1__1__Impl : ( ( rule__MemberCall__ValueAssignment_1_1 ) ) ;
    public final void rule__MemberCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5441:1: ( ( ( rule__MemberCall__ValueAssignment_1_1 ) ) )
            // InternalPortugol.g:5442:1: ( ( rule__MemberCall__ValueAssignment_1_1 ) )
            {
            // InternalPortugol.g:5442:1: ( ( rule__MemberCall__ValueAssignment_1_1 ) )
            // InternalPortugol.g:5443:2: ( rule__MemberCall__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberCallAccess().getValueAssignment_1_1()); 
            }
            // InternalPortugol.g:5444:2: ( rule__MemberCall__ValueAssignment_1_1 )
            // InternalPortugol.g:5444:3: rule__MemberCall__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MemberCall__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberCallAccess().getValueAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberCall__Group_1__1__Impl"


    // $ANTLR start "rule__MemberCall__Group_1_0__0"
    // InternalPortugol.g:5453:1: rule__MemberCall__Group_1_0__0 : rule__MemberCall__Group_1_0__0__Impl ;
    public final void rule__MemberCall__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5457:1: ( rule__MemberCall__Group_1_0__0__Impl )
            // InternalPortugol.g:5458:2: rule__MemberCall__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberCall__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberCall__Group_1_0__0"


    // $ANTLR start "rule__MemberCall__Group_1_0__0__Impl"
    // InternalPortugol.g:5464:1: rule__MemberCall__Group_1_0__0__Impl : ( ( rule__MemberCall__Group_1_0_0__0 ) ) ;
    public final void rule__MemberCall__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5468:1: ( ( ( rule__MemberCall__Group_1_0_0__0 ) ) )
            // InternalPortugol.g:5469:1: ( ( rule__MemberCall__Group_1_0_0__0 ) )
            {
            // InternalPortugol.g:5469:1: ( ( rule__MemberCall__Group_1_0_0__0 ) )
            // InternalPortugol.g:5470:2: ( rule__MemberCall__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberCallAccess().getGroup_1_0_0()); 
            }
            // InternalPortugol.g:5471:2: ( rule__MemberCall__Group_1_0_0__0 )
            // InternalPortugol.g:5471:3: rule__MemberCall__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__MemberCall__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberCallAccess().getGroup_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberCall__Group_1_0__0__Impl"


    // $ANTLR start "rule__MemberCall__Group_1_0_0__0"
    // InternalPortugol.g:5480:1: rule__MemberCall__Group_1_0_0__0 : rule__MemberCall__Group_1_0_0__0__Impl rule__MemberCall__Group_1_0_0__1 ;
    public final void rule__MemberCall__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5484:1: ( rule__MemberCall__Group_1_0_0__0__Impl rule__MemberCall__Group_1_0_0__1 )
            // InternalPortugol.g:5485:2: rule__MemberCall__Group_1_0_0__0__Impl rule__MemberCall__Group_1_0_0__1
            {
            pushFollow(FOLLOW_8);
            rule__MemberCall__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MemberCall__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberCall__Group_1_0_0__0"


    // $ANTLR start "rule__MemberCall__Group_1_0_0__0__Impl"
    // InternalPortugol.g:5492:1: rule__MemberCall__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MemberCall__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5496:1: ( ( () ) )
            // InternalPortugol.g:5497:1: ( () )
            {
            // InternalPortugol.g:5497:1: ( () )
            // InternalPortugol.g:5498:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberCallAccess().getAssignmentAssignableAction_1_0_0_0()); 
            }
            // InternalPortugol.g:5499:2: ()
            // InternalPortugol.g:5499:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberCallAccess().getAssignmentAssignableAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberCall__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__MemberCall__Group_1_0_0__1"
    // InternalPortugol.g:5507:1: rule__MemberCall__Group_1_0_0__1 : rule__MemberCall__Group_1_0_0__1__Impl rule__MemberCall__Group_1_0_0__2 ;
    public final void rule__MemberCall__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5511:1: ( rule__MemberCall__Group_1_0_0__1__Impl rule__MemberCall__Group_1_0_0__2 )
            // InternalPortugol.g:5512:2: rule__MemberCall__Group_1_0_0__1__Impl rule__MemberCall__Group_1_0_0__2
            {
            pushFollow(FOLLOW_24);
            rule__MemberCall__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MemberCall__Group_1_0_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberCall__Group_1_0_0__1"


    // $ANTLR start "rule__MemberCall__Group_1_0_0__1__Impl"
    // InternalPortugol.g:5519:1: rule__MemberCall__Group_1_0_0__1__Impl : ( ( rule__MemberCall__FeatureAssignment_1_0_0_1 ) ) ;
    public final void rule__MemberCall__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5523:1: ( ( ( rule__MemberCall__FeatureAssignment_1_0_0_1 ) ) )
            // InternalPortugol.g:5524:1: ( ( rule__MemberCall__FeatureAssignment_1_0_0_1 ) )
            {
            // InternalPortugol.g:5524:1: ( ( rule__MemberCall__FeatureAssignment_1_0_0_1 ) )
            // InternalPortugol.g:5525:2: ( rule__MemberCall__FeatureAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberCallAccess().getFeatureAssignment_1_0_0_1()); 
            }
            // InternalPortugol.g:5526:2: ( rule__MemberCall__FeatureAssignment_1_0_0_1 )
            // InternalPortugol.g:5526:3: rule__MemberCall__FeatureAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MemberCall__FeatureAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberCallAccess().getFeatureAssignment_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberCall__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__MemberCall__Group_1_0_0__2"
    // InternalPortugol.g:5534:1: rule__MemberCall__Group_1_0_0__2 : rule__MemberCall__Group_1_0_0__2__Impl ;
    public final void rule__MemberCall__Group_1_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5538:1: ( rule__MemberCall__Group_1_0_0__2__Impl )
            // InternalPortugol.g:5539:2: rule__MemberCall__Group_1_0_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberCall__Group_1_0_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberCall__Group_1_0_0__2"


    // $ANTLR start "rule__MemberCall__Group_1_0_0__2__Impl"
    // InternalPortugol.g:5545:1: rule__MemberCall__Group_1_0_0__2__Impl : ( '<-' ) ;
    public final void rule__MemberCall__Group_1_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5549:1: ( ( '<-' ) )
            // InternalPortugol.g:5550:1: ( '<-' )
            {
            // InternalPortugol.g:5550:1: ( '<-' )
            // InternalPortugol.g:5551:2: '<-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberCallAccess().getLessThanSignHyphenMinusKeyword_1_0_0_2()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberCallAccess().getLessThanSignHyphenMinusKeyword_1_0_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberCall__Group_1_0_0__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0"
    // InternalPortugol.g:5561:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5565:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // InternalPortugol.g:5566:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugol.g:5573:1: rule__PrimaryExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5577:1: ( ( '(' ) )
            // InternalPortugol.g:5578:1: ( '(' )
            {
            // InternalPortugol.g:5578:1: ( '(' )
            // InternalPortugol.g:5579:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:5588:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5592:1: ( rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 )
            // InternalPortugol.g:5593:2: rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2
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
    // InternalPortugol.g:5600:1: rule__PrimaryExpression__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5604:1: ( ( ruleExpression ) )
            // InternalPortugol.g:5605:1: ( ruleExpression )
            {
            // InternalPortugol.g:5605:1: ( ruleExpression )
            // InternalPortugol.g:5606:2: ruleExpression
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
    // InternalPortugol.g:5615:1: rule__PrimaryExpression__Group_2__2 : rule__PrimaryExpression__Group_2__2__Impl ;
    public final void rule__PrimaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5619:1: ( rule__PrimaryExpression__Group_2__2__Impl )
            // InternalPortugol.g:5620:2: rule__PrimaryExpression__Group_2__2__Impl
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
    // InternalPortugol.g:5626:1: rule__PrimaryExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5630:1: ( ( ')' ) )
            // InternalPortugol.g:5631:1: ( ')' )
            {
            // InternalPortugol.g:5631:1: ( ')' )
            // InternalPortugol.g:5632:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:5642:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5646:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalPortugol.g:5647:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
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
    // InternalPortugol.g:5654:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__FbNameAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5658:1: ( ( ( rule__FunctionCall__FbNameAssignment_0 ) ) )
            // InternalPortugol.g:5659:1: ( ( rule__FunctionCall__FbNameAssignment_0 ) )
            {
            // InternalPortugol.g:5659:1: ( ( rule__FunctionCall__FbNameAssignment_0 ) )
            // InternalPortugol.g:5660:2: ( rule__FunctionCall__FbNameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFbNameAssignment_0()); 
            }
            // InternalPortugol.g:5661:2: ( rule__FunctionCall__FbNameAssignment_0 )
            // InternalPortugol.g:5661:3: rule__FunctionCall__FbNameAssignment_0
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
    // InternalPortugol.g:5669:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5673:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // InternalPortugol.g:5674:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPortugol.g:5681:1: rule__FunctionCall__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5685:1: ( ( '(' ) )
            // InternalPortugol.g:5686:1: ( '(' )
            {
            // InternalPortugol.g:5686:1: ( '(' )
            // InternalPortugol.g:5687:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:5696:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5700:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // InternalPortugol.g:5701:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
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
    // InternalPortugol.g:5708:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__ParamAssignment_2 ) ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5712:1: ( ( ( rule__FunctionCall__ParamAssignment_2 ) ) )
            // InternalPortugol.g:5713:1: ( ( rule__FunctionCall__ParamAssignment_2 ) )
            {
            // InternalPortugol.g:5713:1: ( ( rule__FunctionCall__ParamAssignment_2 ) )
            // InternalPortugol.g:5714:2: ( rule__FunctionCall__ParamAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParamAssignment_2()); 
            }
            // InternalPortugol.g:5715:2: ( rule__FunctionCall__ParamAssignment_2 )
            // InternalPortugol.g:5715:3: rule__FunctionCall__ParamAssignment_2
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
    // InternalPortugol.g:5723:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5727:1: ( rule__FunctionCall__Group__3__Impl )
            // InternalPortugol.g:5728:2: rule__FunctionCall__Group__3__Impl
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
    // InternalPortugol.g:5734:1: rule__FunctionCall__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5738:1: ( ( ')' ) )
            // InternalPortugol.g:5739:1: ( ')' )
            {
            // InternalPortugol.g:5739:1: ( ')' )
            // InternalPortugol.g:5740:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:5750:1: rule__Model__HeaderAssignment_0 : ( ruleHeaderBlock ) ;
    public final void rule__Model__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5754:1: ( ( ruleHeaderBlock ) )
            // InternalPortugol.g:5755:2: ( ruleHeaderBlock )
            {
            // InternalPortugol.g:5755:2: ( ruleHeaderBlock )
            // InternalPortugol.g:5756:3: ruleHeaderBlock
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
    // InternalPortugol.g:5765:1: rule__Model__GlobalDeclarationsAssignment_1 : ( ruleDeclarationsBlock ) ;
    public final void rule__Model__GlobalDeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5769:1: ( ( ruleDeclarationsBlock ) )
            // InternalPortugol.g:5770:2: ( ruleDeclarationsBlock )
            {
            // InternalPortugol.g:5770:2: ( ruleDeclarationsBlock )
            // InternalPortugol.g:5771:3: ruleDeclarationsBlock
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
    // InternalPortugol.g:5780:1: rule__Model__SubprogramsAssignment_2 : ( ruleSubprograms ) ;
    public final void rule__Model__SubprogramsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5784:1: ( ( ruleSubprograms ) )
            // InternalPortugol.g:5785:2: ( ruleSubprograms )
            {
            // InternalPortugol.g:5785:2: ( ruleSubprograms )
            // InternalPortugol.g:5786:3: ruleSubprograms
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
    // InternalPortugol.g:5795:1: rule__Model__CommandsAssignment_3 : ( ruleBlockCommand ) ;
    public final void rule__Model__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5799:1: ( ( ruleBlockCommand ) )
            // InternalPortugol.g:5800:2: ( ruleBlockCommand )
            {
            // InternalPortugol.g:5800:2: ( ruleBlockCommand )
            // InternalPortugol.g:5801:3: ruleBlockCommand
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
    // InternalPortugol.g:5810:1: rule__HeaderBlock__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__HeaderBlock__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5814:1: ( ( RULE_STRING ) )
            // InternalPortugol.g:5815:2: ( RULE_STRING )
            {
            // InternalPortugol.g:5815:2: ( RULE_STRING )
            // InternalPortugol.g:5816:3: RULE_STRING
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
    // InternalPortugol.g:5825:1: rule__DeclarationsBlock__VarsAssignment_2_0 : ( ruleVariable ) ;
    public final void rule__DeclarationsBlock__VarsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5829:1: ( ( ruleVariable ) )
            // InternalPortugol.g:5830:2: ( ruleVariable )
            {
            // InternalPortugol.g:5830:2: ( ruleVariable )
            // InternalPortugol.g:5831:3: ruleVariable
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
    // InternalPortugol.g:5840:1: rule__Variable__VarDeclarationAssignment_0 : ( ruleVarDeclaration ) ;
    public final void rule__Variable__VarDeclarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5844:1: ( ( ruleVarDeclaration ) )
            // InternalPortugol.g:5845:2: ( ruleVarDeclaration )
            {
            // InternalPortugol.g:5845:2: ( ruleVarDeclaration )
            // InternalPortugol.g:5846:3: ruleVarDeclaration
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
    // InternalPortugol.g:5855:1: rule__Variable__TypeAssignment_2 : ( ruleVarType ) ;
    public final void rule__Variable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5859:1: ( ( ruleVarType ) )
            // InternalPortugol.g:5860:2: ( ruleVarType )
            {
            // InternalPortugol.g:5860:2: ( ruleVarType )
            // InternalPortugol.g:5861:3: ruleVarType
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
    // InternalPortugol.g:5870:1: rule__VarDeclaration__VarsAssignment_0 : ( ruleVarName ) ;
    public final void rule__VarDeclaration__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5874:1: ( ( ruleVarName ) )
            // InternalPortugol.g:5875:2: ( ruleVarName )
            {
            // InternalPortugol.g:5875:2: ( ruleVarName )
            // InternalPortugol.g:5876:3: ruleVarName
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
    // InternalPortugol.g:5885:1: rule__VarDeclaration__VarsAssignment_1_1 : ( ruleVarName ) ;
    public final void rule__VarDeclaration__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5889:1: ( ( ruleVarName ) )
            // InternalPortugol.g:5890:2: ( ruleVarName )
            {
            // InternalPortugol.g:5890:2: ( ruleVarName )
            // InternalPortugol.g:5891:3: ruleVarName
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
    // InternalPortugol.g:5900:1: rule__DeclaredVar__VarsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredVar__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5904:1: ( ( ( RULE_ID ) ) )
            // InternalPortugol.g:5905:2: ( ( RULE_ID ) )
            {
            // InternalPortugol.g:5905:2: ( ( RULE_ID ) )
            // InternalPortugol.g:5906:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getVarsVarNameCrossReference_0_0()); 
            }
            // InternalPortugol.g:5907:3: ( RULE_ID )
            // InternalPortugol.g:5908:4: RULE_ID
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
    // InternalPortugol.g:5919:1: rule__DeclaredVar__VarsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredVar__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5923:1: ( ( ( RULE_ID ) ) )
            // InternalPortugol.g:5924:2: ( ( RULE_ID ) )
            {
            // InternalPortugol.g:5924:2: ( ( RULE_ID ) )
            // InternalPortugol.g:5925:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredVarAccess().getVarsVarNameCrossReference_1_1_0()); 
            }
            // InternalPortugol.g:5926:3: ( RULE_ID )
            // InternalPortugol.g:5927:4: RULE_ID
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
    // InternalPortugol.g:5938:1: rule__VarName__NameAssignment : ( RULE_ID ) ;
    public final void rule__VarName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5942:1: ( ( RULE_ID ) )
            // InternalPortugol.g:5943:2: ( RULE_ID )
            {
            // InternalPortugol.g:5943:2: ( RULE_ID )
            // InternalPortugol.g:5944:3: RULE_ID
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
    // InternalPortugol.g:5953:1: rule__VarType__TypeNameAssignment : ( ( rule__VarType__TypeNameAlternatives_0 ) ) ;
    public final void rule__VarType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5957:1: ( ( ( rule__VarType__TypeNameAlternatives_0 ) ) )
            // InternalPortugol.g:5958:2: ( ( rule__VarType__TypeNameAlternatives_0 ) )
            {
            // InternalPortugol.g:5958:2: ( ( rule__VarType__TypeNameAlternatives_0 ) )
            // InternalPortugol.g:5959:3: ( rule__VarType__TypeNameAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarTypeAccess().getTypeNameAlternatives_0()); 
            }
            // InternalPortugol.g:5960:3: ( rule__VarType__TypeNameAlternatives_0 )
            // InternalPortugol.g:5960:4: rule__VarType__TypeNameAlternatives_0
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
    // InternalPortugol.g:5968:1: rule__Subprograms__BlockSubProgramsAssignment : ( ruleBlockSubPrograms ) ;
    public final void rule__Subprograms__BlockSubProgramsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5972:1: ( ( ruleBlockSubPrograms ) )
            // InternalPortugol.g:5973:2: ( ruleBlockSubPrograms )
            {
            // InternalPortugol.g:5973:2: ( ruleBlockSubPrograms )
            // InternalPortugol.g:5974:3: ruleBlockSubPrograms
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
    // InternalPortugol.g:5983:1: rule__FunctionName__NameAssignment : ( RULE_ID ) ;
    public final void rule__FunctionName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:5987:1: ( ( RULE_ID ) )
            // InternalPortugol.g:5988:2: ( RULE_ID )
            {
            // InternalPortugol.g:5988:2: ( RULE_ID )
            // InternalPortugol.g:5989:3: RULE_ID
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
    // InternalPortugol.g:5998:1: rule__ProcedureName__NameAssignment : ( RULE_ID ) ;
    public final void rule__ProcedureName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6002:1: ( ( RULE_ID ) )
            // InternalPortugol.g:6003:2: ( RULE_ID )
            {
            // InternalPortugol.g:6003:2: ( RULE_ID )
            // InternalPortugol.g:6004:3: RULE_ID
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
    // InternalPortugol.g:6013:1: rule__BlockFunction__FunctionNameAssignment_1 : ( ruleFunctionName ) ;
    public final void rule__BlockFunction__FunctionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6017:1: ( ( ruleFunctionName ) )
            // InternalPortugol.g:6018:2: ( ruleFunctionName )
            {
            // InternalPortugol.g:6018:2: ( ruleFunctionName )
            // InternalPortugol.g:6019:3: ruleFunctionName
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
    // InternalPortugol.g:6028:1: rule__BlockFunction__ParamListAssignment_3 : ( ruleVariable ) ;
    public final void rule__BlockFunction__ParamListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6032:1: ( ( ruleVariable ) )
            // InternalPortugol.g:6033:2: ( ruleVariable )
            {
            // InternalPortugol.g:6033:2: ( ruleVariable )
            // InternalPortugol.g:6034:3: ruleVariable
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
    // InternalPortugol.g:6043:1: rule__BlockFunction__ReturnTypeAssignment_6 : ( ruleVarType ) ;
    public final void rule__BlockFunction__ReturnTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6047:1: ( ( ruleVarType ) )
            // InternalPortugol.g:6048:2: ( ruleVarType )
            {
            // InternalPortugol.g:6048:2: ( ruleVarType )
            // InternalPortugol.g:6049:3: ruleVarType
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
    // InternalPortugol.g:6058:1: rule__BlockFunction__DeclarationsAssignment_8 : ( ruleDeclarationsBlock ) ;
    public final void rule__BlockFunction__DeclarationsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6062:1: ( ( ruleDeclarationsBlock ) )
            // InternalPortugol.g:6063:2: ( ruleDeclarationsBlock )
            {
            // InternalPortugol.g:6063:2: ( ruleDeclarationsBlock )
            // InternalPortugol.g:6064:3: ruleDeclarationsBlock
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
    // InternalPortugol.g:6073:1: rule__BlockFunction__CommandsAssignment_11 : ( ruleAbstractCommand ) ;
    public final void rule__BlockFunction__CommandsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6077:1: ( ( ruleAbstractCommand ) )
            // InternalPortugol.g:6078:2: ( ruleAbstractCommand )
            {
            // InternalPortugol.g:6078:2: ( ruleAbstractCommand )
            // InternalPortugol.g:6079:3: ruleAbstractCommand
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
    // InternalPortugol.g:6088:1: rule__BlockProcedure__ProcedureAssignment_1 : ( ruleProcedureName ) ;
    public final void rule__BlockProcedure__ProcedureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6092:1: ( ( ruleProcedureName ) )
            // InternalPortugol.g:6093:2: ( ruleProcedureName )
            {
            // InternalPortugol.g:6093:2: ( ruleProcedureName )
            // InternalPortugol.g:6094:3: ruleProcedureName
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
    // InternalPortugol.g:6103:1: rule__BlockProcedure__ParamListAssignment_3 : ( ruleVariable ) ;
    public final void rule__BlockProcedure__ParamListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6107:1: ( ( ruleVariable ) )
            // InternalPortugol.g:6108:2: ( ruleVariable )
            {
            // InternalPortugol.g:6108:2: ( ruleVariable )
            // InternalPortugol.g:6109:3: ruleVariable
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
    // InternalPortugol.g:6118:1: rule__BlockProcedure__DeclarationsAssignment_6 : ( ruleDeclarationsBlock ) ;
    public final void rule__BlockProcedure__DeclarationsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6122:1: ( ( ruleDeclarationsBlock ) )
            // InternalPortugol.g:6123:2: ( ruleDeclarationsBlock )
            {
            // InternalPortugol.g:6123:2: ( ruleDeclarationsBlock )
            // InternalPortugol.g:6124:3: ruleDeclarationsBlock
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
    // InternalPortugol.g:6133:1: rule__BlockProcedure__CommandsAssignment_9 : ( ruleAbstractCommand ) ;
    public final void rule__BlockProcedure__CommandsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6137:1: ( ( ruleAbstractCommand ) )
            // InternalPortugol.g:6138:2: ( ruleAbstractCommand )
            {
            // InternalPortugol.g:6138:2: ( ruleAbstractCommand )
            // InternalPortugol.g:6139:3: ruleAbstractCommand
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
    // InternalPortugol.g:6148:1: rule__BlockCommand__CommandsAssignment_2 : ( ruleAbstractCommand ) ;
    public final void rule__BlockCommand__CommandsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6152:1: ( ( ruleAbstractCommand ) )
            // InternalPortugol.g:6153:2: ( ruleAbstractCommand )
            {
            // InternalPortugol.g:6153:2: ( ruleAbstractCommand )
            // InternalPortugol.g:6154:3: ruleAbstractCommand
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
    // InternalPortugol.g:6163:1: rule__ReadCommand__ParamListAssignment_2 : ( ruleDeclaredVar ) ;
    public final void rule__ReadCommand__ParamListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6167:1: ( ( ruleDeclaredVar ) )
            // InternalPortugol.g:6168:2: ( ruleDeclaredVar )
            {
            // InternalPortugol.g:6168:2: ( ruleDeclaredVar )
            // InternalPortugol.g:6169:3: ruleDeclaredVar
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
    // InternalPortugol.g:6178:1: rule__WriteCommand__WriteParamAssignment_2 : ( ruleWriteParam ) ;
    public final void rule__WriteCommand__WriteParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6182:1: ( ( ruleWriteParam ) )
            // InternalPortugol.g:6183:2: ( ruleWriteParam )
            {
            // InternalPortugol.g:6183:2: ( ruleWriteParam )
            // InternalPortugol.g:6184:3: ruleWriteParam
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
    // InternalPortugol.g:6193:1: rule__WriteParam__ExpressionAssignment_0 : ( ruleExpression ) ;
    public final void rule__WriteParam__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6197:1: ( ( ruleExpression ) )
            // InternalPortugol.g:6198:2: ( ruleExpression )
            {
            // InternalPortugol.g:6198:2: ( ruleExpression )
            // InternalPortugol.g:6199:3: ruleExpression
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
    // InternalPortugol.g:6208:1: rule__WriteParam__ExpressionAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__WriteParam__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6212:1: ( ( ruleExpression ) )
            // InternalPortugol.g:6213:2: ( ruleExpression )
            {
            // InternalPortugol.g:6213:2: ( ruleExpression )
            // InternalPortugol.g:6214:3: ruleExpression
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
    // InternalPortugol.g:6223:1: rule__WriteParam__PrecisionAssignment_2 : ( ruleOptDecimalPrecision ) ;
    public final void rule__WriteParam__PrecisionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6227:1: ( ( ruleOptDecimalPrecision ) )
            // InternalPortugol.g:6228:2: ( ruleOptDecimalPrecision )
            {
            // InternalPortugol.g:6228:2: ( ruleOptDecimalPrecision )
            // InternalPortugol.g:6229:3: ruleOptDecimalPrecision
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


    // $ANTLR start "rule__OptDecimalPrecision__FirstPrecisionAssignment_1"
    // InternalPortugol.g:6238:1: rule__OptDecimalPrecision__FirstPrecisionAssignment_1 : ( RULE_INT ) ;
    public final void rule__OptDecimalPrecision__FirstPrecisionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6242:1: ( ( RULE_INT ) )
            // InternalPortugol.g:6243:2: ( RULE_INT )
            {
            // InternalPortugol.g:6243:2: ( RULE_INT )
            // InternalPortugol.g:6244:3: RULE_INT
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
    // InternalPortugol.g:6253:1: rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__OptDecimalPrecision__SecondPrecisionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6257:1: ( ( RULE_INT ) )
            // InternalPortugol.g:6258:2: ( RULE_INT )
            {
            // InternalPortugol.g:6258:2: ( RULE_INT )
            // InternalPortugol.g:6259:3: RULE_INT
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


    // $ANTLR start "rule__Assignment__TargetAssignment_0_1"
    // InternalPortugol.g:6268:1: rule__Assignment__TargetAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__TargetAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6272:1: ( ( ( RULE_ID ) ) )
            // InternalPortugol.g:6273:2: ( ( RULE_ID ) )
            {
            // InternalPortugol.g:6273:2: ( ( RULE_ID ) )
            // InternalPortugol.g:6274:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getTargetVarNameCrossReference_0_1_0()); 
            }
            // InternalPortugol.g:6275:3: ( RULE_ID )
            // InternalPortugol.g:6276:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getTargetVarNameIDTerminalRuleCall_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getTargetVarNameIDTerminalRuleCall_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getTargetVarNameCrossReference_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__TargetAssignment_0_1"


    // $ANTLR start "rule__Assignment__ValueAssignment_0_3"
    // InternalPortugol.g:6287:1: rule__Assignment__ValueAssignment_0_3 : ( ruleAssignment ) ;
    public final void rule__Assignment__ValueAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6291:1: ( ( ruleAssignment ) )
            // InternalPortugol.g:6292:2: ( ruleAssignment )
            {
            // InternalPortugol.g:6292:2: ( ruleAssignment )
            // InternalPortugol.g:6293:3: ruleAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueAssignmentParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getValueAssignmentParserRuleCall_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ValueAssignment_0_3"


    // $ANTLR start "rule__Assignment__OpAssignment_1_1_0_0_1"
    // InternalPortugol.g:6302:1: rule__Assignment__OpAssignment_1_1_0_0_1 : ( ( '<-' ) ) ;
    public final void rule__Assignment__OpAssignment_1_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6306:1: ( ( ( '<-' ) ) )
            // InternalPortugol.g:6307:2: ( ( '<-' ) )
            {
            // InternalPortugol.g:6307:2: ( ( '<-' ) )
            // InternalPortugol.g:6308:3: ( '<-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOpLessThanSignHyphenMinusKeyword_1_1_0_0_1_0()); 
            }
            // InternalPortugol.g:6309:3: ( '<-' )
            // InternalPortugol.g:6310:4: '<-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getOpLessThanSignHyphenMinusKeyword_1_1_0_0_1_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getOpLessThanSignHyphenMinusKeyword_1_1_0_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getOpLessThanSignHyphenMinusKeyword_1_1_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__OpAssignment_1_1_0_0_1"


    // $ANTLR start "rule__Assignment__RightAssignment_1_1_1"
    // InternalPortugol.g:6321:1: rule__Assignment__RightAssignment_1_1_1 : ( ruleAssignment ) ;
    public final void rule__Assignment__RightAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6325:1: ( ( ruleAssignment ) )
            // InternalPortugol.g:6326:2: ( ruleAssignment )
            {
            // InternalPortugol.g:6326:2: ( ruleAssignment )
            // InternalPortugol.g:6327:3: ruleAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getRightAssignmentParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getRightAssignmentParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__RightAssignment_1_1_1"


    // $ANTLR start "rule__OrExpression__OpAssignment_1_0_0_1"
    // InternalPortugol.g:6336:1: rule__OrExpression__OpAssignment_1_0_0_1 : ( ( 'OU' ) ) ;
    public final void rule__OrExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6340:1: ( ( ( 'OU' ) ) )
            // InternalPortugol.g:6341:2: ( ( 'OU' ) )
            {
            // InternalPortugol.g:6341:2: ( ( 'OU' ) )
            // InternalPortugol.g:6342:3: ( 'OU' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpOUKeyword_1_0_0_1_0()); 
            }
            // InternalPortugol.g:6343:3: ( 'OU' )
            // InternalPortugol.g:6344:4: 'OU'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpOUKeyword_1_0_0_1_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:6355:1: rule__OrExpression__RightAssignment_1_1 : ( ruleXorExpression ) ;
    public final void rule__OrExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6359:1: ( ( ruleXorExpression ) )
            // InternalPortugol.g:6360:2: ( ruleXorExpression )
            {
            // InternalPortugol.g:6360:2: ( ruleXorExpression )
            // InternalPortugol.g:6361:3: ruleXorExpression
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
    // InternalPortugol.g:6370:1: rule__XorExpression__OpAssignment_1_0_0_1 : ( ( 'XOU' ) ) ;
    public final void rule__XorExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6374:1: ( ( ( 'XOU' ) ) )
            // InternalPortugol.g:6375:2: ( ( 'XOU' ) )
            {
            // InternalPortugol.g:6375:2: ( ( 'XOU' ) )
            // InternalPortugol.g:6376:3: ( 'XOU' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOpXOUKeyword_1_0_0_1_0()); 
            }
            // InternalPortugol.g:6377:3: ( 'XOU' )
            // InternalPortugol.g:6378:4: 'XOU'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExpressionAccess().getOpXOUKeyword_1_0_0_1_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:6389:1: rule__XorExpression__RightAssignment_1_1 : ( ruleAndExpression ) ;
    public final void rule__XorExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6393:1: ( ( ruleAndExpression ) )
            // InternalPortugol.g:6394:2: ( ruleAndExpression )
            {
            // InternalPortugol.g:6394:2: ( ruleAndExpression )
            // InternalPortugol.g:6395:3: ruleAndExpression
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
    // InternalPortugol.g:6404:1: rule__AndExpression__OpAssignment_1_0_0_1 : ( ( rule__AndExpression__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__AndExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6408:1: ( ( ( rule__AndExpression__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugol.g:6409:2: ( ( rule__AndExpression__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugol.g:6409:2: ( ( rule__AndExpression__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugol.g:6410:3: ( rule__AndExpression__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugol.g:6411:3: ( rule__AndExpression__OpAlternatives_1_0_0_1_0 )
            // InternalPortugol.g:6411:4: rule__AndExpression__OpAlternatives_1_0_0_1_0
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
    // InternalPortugol.g:6419:1: rule__AndExpression__RightAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__AndExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6423:1: ( ( ruleComparison ) )
            // InternalPortugol.g:6424:2: ( ruleComparison )
            {
            // InternalPortugol.g:6424:2: ( ruleComparison )
            // InternalPortugol.g:6425:3: ruleComparison
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
    // InternalPortugol.g:6434:1: rule__Comparison__OpAssignment_1_0_0_1 : ( ( rule__Comparison__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6438:1: ( ( ( rule__Comparison__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugol.g:6439:2: ( ( rule__Comparison__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugol.g:6439:2: ( ( rule__Comparison__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugol.g:6440:3: ( rule__Comparison__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugol.g:6441:3: ( rule__Comparison__OpAlternatives_1_0_0_1_0 )
            // InternalPortugol.g:6441:4: rule__Comparison__OpAlternatives_1_0_0_1_0
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
    // InternalPortugol.g:6449:1: rule__Comparison__RightAssignment_1_1 : ( ruleEquExpression ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6453:1: ( ( ruleEquExpression ) )
            // InternalPortugol.g:6454:2: ( ruleEquExpression )
            {
            // InternalPortugol.g:6454:2: ( ruleEquExpression )
            // InternalPortugol.g:6455:3: ruleEquExpression
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
    // InternalPortugol.g:6464:1: rule__EquExpression__OpAssignment_1_0_0_1 : ( ( rule__EquExpression__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__EquExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6468:1: ( ( ( rule__EquExpression__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugol.g:6469:2: ( ( rule__EquExpression__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugol.g:6469:2: ( ( rule__EquExpression__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugol.g:6470:3: ( rule__EquExpression__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugol.g:6471:3: ( rule__EquExpression__OpAlternatives_1_0_0_1_0 )
            // InternalPortugol.g:6471:4: rule__EquExpression__OpAlternatives_1_0_0_1_0
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
    // InternalPortugol.g:6479:1: rule__EquExpression__RightAssignment_1_1 : ( ruleAddExpression ) ;
    public final void rule__EquExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6483:1: ( ( ruleAddExpression ) )
            // InternalPortugol.g:6484:2: ( ruleAddExpression )
            {
            // InternalPortugol.g:6484:2: ( ruleAddExpression )
            // InternalPortugol.g:6485:3: ruleAddExpression
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
    // InternalPortugol.g:6494:1: rule__AddExpression__OpAssignment_1_0_0_1 : ( ( rule__AddExpression__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__AddExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6498:1: ( ( ( rule__AddExpression__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugol.g:6499:2: ( ( rule__AddExpression__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugol.g:6499:2: ( ( rule__AddExpression__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugol.g:6500:3: ( rule__AddExpression__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugol.g:6501:3: ( rule__AddExpression__OpAlternatives_1_0_0_1_0 )
            // InternalPortugol.g:6501:4: rule__AddExpression__OpAlternatives_1_0_0_1_0
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
    // InternalPortugol.g:6509:1: rule__AddExpression__RightAssignment_1_1 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AddExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6513:1: ( ( ruleMultiplicativeExpression ) )
            // InternalPortugol.g:6514:2: ( ruleMultiplicativeExpression )
            {
            // InternalPortugol.g:6514:2: ( ruleMultiplicativeExpression )
            // InternalPortugol.g:6515:3: ruleMultiplicativeExpression
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
    // InternalPortugol.g:6524:1: rule__MultiplicativeExpression__OpAssignment_1_0_0_1 : ( ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__MultiplicativeExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6528:1: ( ( ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 ) ) )
            // InternalPortugol.g:6529:2: ( ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 ) )
            {
            // InternalPortugol.g:6529:2: ( ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 ) )
            // InternalPortugol.g:6530:3: ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOpAlternatives_1_0_0_1_0()); 
            }
            // InternalPortugol.g:6531:3: ( rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0 )
            // InternalPortugol.g:6531:4: rule__MultiplicativeExpression__OpAlternatives_1_0_0_1_0
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
    // InternalPortugol.g:6539:1: rule__MultiplicativeExpression__RightAssignment_1_1 : ( rulePowerExpression ) ;
    public final void rule__MultiplicativeExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6543:1: ( ( rulePowerExpression ) )
            // InternalPortugol.g:6544:2: ( rulePowerExpression )
            {
            // InternalPortugol.g:6544:2: ( rulePowerExpression )
            // InternalPortugol.g:6545:3: rulePowerExpression
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
    // InternalPortugol.g:6554:1: rule__PowerExpression__OpAssignment_1_0_0_1 : ( ( '^' ) ) ;
    public final void rule__PowerExpression__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6558:1: ( ( ( '^' ) ) )
            // InternalPortugol.g:6559:2: ( ( '^' ) )
            {
            // InternalPortugol.g:6559:2: ( ( '^' ) )
            // InternalPortugol.g:6560:3: ( '^' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getOpCircumflexAccentKeyword_1_0_0_1_0()); 
            }
            // InternalPortugol.g:6561:3: ( '^' )
            // InternalPortugol.g:6562:4: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerExpressionAccess().getOpCircumflexAccentKeyword_1_0_0_1_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalPortugol.g:6573:1: rule__PowerExpression__RightAssignment_1_1 : ( ruleUnaryExpression ) ;
    public final void rule__PowerExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6577:1: ( ( ruleUnaryExpression ) )
            // InternalPortugol.g:6578:2: ( ruleUnaryExpression )
            {
            // InternalPortugol.g:6578:2: ( ruleUnaryExpression )
            // InternalPortugol.g:6579:3: ruleUnaryExpression
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
    // InternalPortugol.g:6588:1: rule__UnaryExpression__OpAssignment_0_1 : ( ( rule__UnaryExpression__OpAlternatives_0_1_0 ) ) ;
    public final void rule__UnaryExpression__OpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6592:1: ( ( ( rule__UnaryExpression__OpAlternatives_0_1_0 ) ) )
            // InternalPortugol.g:6593:2: ( ( rule__UnaryExpression__OpAlternatives_0_1_0 ) )
            {
            // InternalPortugol.g:6593:2: ( ( rule__UnaryExpression__OpAlternatives_0_1_0 ) )
            // InternalPortugol.g:6594:3: ( rule__UnaryExpression__OpAlternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOpAlternatives_0_1_0()); 
            }
            // InternalPortugol.g:6595:3: ( rule__UnaryExpression__OpAlternatives_0_1_0 )
            // InternalPortugol.g:6595:4: rule__UnaryExpression__OpAlternatives_0_1_0
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
    // InternalPortugol.g:6603:1: rule__UnaryExpression__OperandAssignment_0_2 : ( ruleUnaryExpression ) ;
    public final void rule__UnaryExpression__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6607:1: ( ( ruleUnaryExpression ) )
            // InternalPortugol.g:6608:2: ( ruleUnaryExpression )
            {
            // InternalPortugol.g:6608:2: ( ruleUnaryExpression )
            // InternalPortugol.g:6609:3: ruleUnaryExpression
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


    // $ANTLR start "rule__MemberCall__FeatureAssignment_1_0_0_1"
    // InternalPortugol.g:6618:1: rule__MemberCall__FeatureAssignment_1_0_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__MemberCall__FeatureAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6622:1: ( ( ( RULE_ID ) ) )
            // InternalPortugol.g:6623:2: ( ( RULE_ID ) )
            {
            // InternalPortugol.g:6623:2: ( ( RULE_ID ) )
            // InternalPortugol.g:6624:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberCallAccess().getFeatureVarNameCrossReference_1_0_0_1_0()); 
            }
            // InternalPortugol.g:6625:3: ( RULE_ID )
            // InternalPortugol.g:6626:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberCallAccess().getFeatureVarNameIDTerminalRuleCall_1_0_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberCallAccess().getFeatureVarNameIDTerminalRuleCall_1_0_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberCallAccess().getFeatureVarNameCrossReference_1_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberCall__FeatureAssignment_1_0_0_1"


    // $ANTLR start "rule__MemberCall__ValueAssignment_1_1"
    // InternalPortugol.g:6637:1: rule__MemberCall__ValueAssignment_1_1 : ( ruleAssignment ) ;
    public final void rule__MemberCall__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6641:1: ( ( ruleAssignment ) )
            // InternalPortugol.g:6642:2: ( ruleAssignment )
            {
            // InternalPortugol.g:6642:2: ( ruleAssignment )
            // InternalPortugol.g:6643:3: ruleAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberCallAccess().getValueAssignmentParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberCallAccess().getValueAssignmentParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberCall__ValueAssignment_1_1"


    // $ANTLR start "rule__FunctionCall__FbNameAssignment_0"
    // InternalPortugol.g:6652:1: rule__FunctionCall__FbNameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__FbNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6656:1: ( ( ( RULE_ID ) ) )
            // InternalPortugol.g:6657:2: ( ( RULE_ID ) )
            {
            // InternalPortugol.g:6657:2: ( ( RULE_ID ) )
            // InternalPortugol.g:6658:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFbNameFunctionNameCrossReference_0_0()); 
            }
            // InternalPortugol.g:6659:3: ( RULE_ID )
            // InternalPortugol.g:6660:4: RULE_ID
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
    // InternalPortugol.g:6671:1: rule__FunctionCall__ParamAssignment_2 : ( ruleWriteParam ) ;
    public final void rule__FunctionCall__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6675:1: ( ( ruleWriteParam ) )
            // InternalPortugol.g:6676:2: ( ruleWriteParam )
            {
            // InternalPortugol.g:6676:2: ( ruleWriteParam )
            // InternalPortugol.g:6677:3: ruleWriteParam
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


    // $ANTLR start "rule__NumericLiteral__IntValueAssignment_0"
    // InternalPortugol.g:6686:1: rule__NumericLiteral__IntValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__NumericLiteral__IntValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6690:1: ( ( RULE_INT ) )
            // InternalPortugol.g:6691:2: ( RULE_INT )
            {
            // InternalPortugol.g:6691:2: ( RULE_INT )
            // InternalPortugol.g:6692:3: RULE_INT
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
    // InternalPortugol.g:6701:1: rule__NumericLiteral__FloatValueAssignment_1 : ( RULE_FLOAT ) ;
    public final void rule__NumericLiteral__FloatValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6705:1: ( ( RULE_FLOAT ) )
            // InternalPortugol.g:6706:2: ( RULE_FLOAT )
            {
            // InternalPortugol.g:6706:2: ( RULE_FLOAT )
            // InternalPortugol.g:6707:3: RULE_FLOAT
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
    // InternalPortugol.g:6716:1: rule__StringExpression__LiteralStringAssignment : ( RULE_STRING ) ;
    public final void rule__StringExpression__LiteralStringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPortugol.g:6720:1: ( ( RULE_STRING ) )
            // InternalPortugol.g:6721:2: ( RULE_STRING )
            {
            // InternalPortugol.g:6721:2: ( RULE_STRING )
            // InternalPortugol.g:6722:3: RULE_STRING
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

    // $ANTLR start synpred35_InternalPortugol
    public final void synpred35_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:3608:3: ( rule__Assignment__Group_1_1__0 )
        // InternalPortugol.g:3608:3: rule__Assignment__Group_1_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Assignment__Group_1_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalPortugol

    // $ANTLR start synpred36_InternalPortugol
    public final void synpred36_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:3797:3: ( rule__OrExpression__Group_1__0 )
        // InternalPortugol.g:3797:3: rule__OrExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__OrExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_InternalPortugol

    // $ANTLR start synpred37_InternalPortugol
    public final void synpred37_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:3986:3: ( rule__XorExpression__Group_1__0 )
        // InternalPortugol.g:3986:3: rule__XorExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__XorExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalPortugol

    // $ANTLR start synpred38_InternalPortugol
    public final void synpred38_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:4175:3: ( rule__AndExpression__Group_1__0 )
        // InternalPortugol.g:4175:3: rule__AndExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__AndExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_InternalPortugol

    // $ANTLR start synpred39_InternalPortugol
    public final void synpred39_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:4364:3: ( rule__Comparison__Group_1__0 )
        // InternalPortugol.g:4364:3: rule__Comparison__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Comparison__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalPortugol

    // $ANTLR start synpred40_InternalPortugol
    public final void synpred40_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:4553:3: ( rule__EquExpression__Group_1__0 )
        // InternalPortugol.g:4553:3: rule__EquExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__EquExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalPortugol

    // $ANTLR start synpred41_InternalPortugol
    public final void synpred41_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:4742:3: ( rule__AddExpression__Group_1__0 )
        // InternalPortugol.g:4742:3: rule__AddExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__AddExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_InternalPortugol

    // $ANTLR start synpred42_InternalPortugol
    public final void synpred42_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:4931:3: ( rule__MultiplicativeExpression__Group_1__0 )
        // InternalPortugol.g:4931:3: rule__MultiplicativeExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__MultiplicativeExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_InternalPortugol

    // $ANTLR start synpred43_InternalPortugol
    public final void synpred43_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:5120:3: ( rule__PowerExpression__Group_1__0 )
        // InternalPortugol.g:5120:3: rule__PowerExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__PowerExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_InternalPortugol

    // $ANTLR start synpred44_InternalPortugol
    public final void synpred44_InternalPortugol_fragment() throws RecognitionException {   
        // InternalPortugol.g:5390:3: ( rule__MemberCall__Group_1__0 )
        // InternalPortugol.g:5390:3: rule__MemberCall__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__MemberCall__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_InternalPortugol

    // Delegated rules

    public final boolean synpred38_InternalPortugol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalPortugol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalPortugol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalPortugol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalPortugol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalPortugol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalPortugol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalPortugol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalPortugol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalPortugol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_InternalPortugol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalPortugol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_InternalPortugol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalPortugol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalPortugol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalPortugol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalPortugol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalPortugol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalPortugol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalPortugol_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000010800000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000014800000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00001810420001E0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00001810420001E2L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000042000000L});

}