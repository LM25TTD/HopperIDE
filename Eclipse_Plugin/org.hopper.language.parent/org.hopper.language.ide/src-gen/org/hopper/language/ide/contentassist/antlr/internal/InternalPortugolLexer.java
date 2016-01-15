package org.hopper.language.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPortugolLexer extends Lexer {
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

    public InternalPortugolLexer() {;} 
    public InternalPortugolLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPortugolLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPortugol.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:11:7: ( 'real' )
            // InternalPortugol.g:11:9: 'real'
            {
            match("real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:12:7: ( 'inteiro' )
            // InternalPortugol.g:12:9: 'inteiro'
            {
            match("inteiro"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:13:7: ( 'caractere' )
            // InternalPortugol.g:13:9: 'caractere'
            {
            match("caractere"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:14:7: ( '&' )
            // InternalPortugol.g:14:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:15:7: ( 'AND' )
            // InternalPortugol.g:15:9: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:16:7: ( '=' )
            // InternalPortugol.g:16:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:17:7: ( '<>' )
            // InternalPortugol.g:17:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:18:7: ( '<' )
            // InternalPortugol.g:18:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:19:7: ( '>' )
            // InternalPortugol.g:19:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:20:7: ( '<=' )
            // InternalPortugol.g:20:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:21:7: ( '>=' )
            // InternalPortugol.g:21:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:22:7: ( 'algoritmo' )
            // InternalPortugol.g:22:9: 'algoritmo'
            {
            match("algoritmo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:23:7: ( 'var' )
            // InternalPortugol.g:23:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:24:7: ( ':' )
            // InternalPortugol.g:24:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:25:7: ( ',' )
            // InternalPortugol.g:25:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:26:7: ( 'funcao' )
            // InternalPortugol.g:26:9: 'funcao'
            {
            match("funcao"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:27:7: ( '(' )
            // InternalPortugol.g:27:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:28:7: ( ')' )
            // InternalPortugol.g:28:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:29:7: ( 'inicio' )
            // InternalPortugol.g:29:9: 'inicio'
            {
            match("inicio"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:30:7: ( 'fimfuncao' )
            // InternalPortugol.g:30:9: 'fimfuncao'
            {
            match("fimfuncao"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:31:7: ( 'procedimento' )
            // InternalPortugol.g:31:9: 'procedimento'
            {
            match("procedimento"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:32:7: ( 'fimprocedimento' )
            // InternalPortugol.g:32:9: 'fimprocedimento'
            {
            match("fimprocedimento"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:33:7: ( 'fimalgoritmo' )
            // InternalPortugol.g:33:9: 'fimalgoritmo'
            {
            match("fimalgoritmo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:34:7: ( 'leia' )
            // InternalPortugol.g:34:9: 'leia'
            {
            match("leia"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:35:7: ( 'escreva' )
            // InternalPortugol.g:35:9: 'escreva'
            {
            match("escreva"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:36:7: ( '+' )
            // InternalPortugol.g:36:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:37:7: ( '-' )
            // InternalPortugol.g:37:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:38:7: ( '*' )
            // InternalPortugol.g:38:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:39:7: ( '/' )
            // InternalPortugol.g:39:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:40:7: ( 'MOD' )
            // InternalPortugol.g:40:9: 'MOD'
            {
            match("MOD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:41:7: ( 'NOT' )
            // InternalPortugol.g:41:9: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:42:7: ( 'OR' )
            // InternalPortugol.g:42:9: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:43:7: ( 'XOR' )
            // InternalPortugol.g:43:9: 'XOR'
            {
            match("XOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:44:7: ( '^' )
            // InternalPortugol.g:44:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:6003:12: ( RULE_INT '.' RULE_INT )
            // InternalPortugol.g:6003:14: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_END_COMMAND"
    public final void mRULE_END_COMMAND() throws RecognitionException {
        try {
            int _type = RULE_END_COMMAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:6005:18: ( ( ' ' | '\\t' )* ( '\\r' | '\\n' )+ ( ' ' | '\\t' )* )
            // InternalPortugol.g:6005:20: ( ' ' | '\\t' )* ( '\\r' | '\\n' )+ ( ' ' | '\\t' )*
            {
            // InternalPortugol.g:6005:20: ( ' ' | '\\t' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\t'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPortugol.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalPortugol.g:6005:32: ( '\\r' | '\\n' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\n'||LA2_0=='\r') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPortugol.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalPortugol.g:6005:45: ( ' ' | '\\t' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\t'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPortugol.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_END_COMMAND"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:6007:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPortugol.g:6007:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPortugol.g:6007:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPortugol.g:6007:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPortugol.g:6007:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPortugol.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:6009:10: ( ( '0' .. '9' )+ )
            // InternalPortugol.g:6009:12: ( '0' .. '9' )+
            {
            // InternalPortugol.g:6009:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPortugol.g:6009:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:6011:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPortugol.g:6011:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPortugol.g:6011:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPortugol.g:6011:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPortugol.g:6011:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalPortugol.g:6011:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPortugol.g:6011:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPortugol.g:6011:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPortugol.g:6011:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalPortugol.g:6011:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPortugol.g:6011:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:6013:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPortugol.g:6013:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPortugol.g:6013:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPortugol.g:6013:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:6015:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPortugol.g:6015:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPortugol.g:6015:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPortugol.g:6015:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalPortugol.g:6015:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPortugol.g:6015:41: ( '\\r' )? '\\n'
                    {
                    // InternalPortugol.g:6015:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalPortugol.g:6015:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:6017:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPortugol.g:6017:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPortugol.g:6017:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPortugol.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:6019:16: ( . )
            // InternalPortugol.g:6019:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPortugol.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_FLOAT | RULE_END_COMMAND | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=43;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalPortugol.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalPortugol.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalPortugol.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalPortugol.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalPortugol.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalPortugol.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalPortugol.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalPortugol.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalPortugol.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalPortugol.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalPortugol.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalPortugol.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalPortugol.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalPortugol.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalPortugol.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalPortugol.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalPortugol.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalPortugol.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalPortugol.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalPortugol.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalPortugol.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalPortugol.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalPortugol.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalPortugol.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalPortugol.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalPortugol.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalPortugol.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalPortugol.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalPortugol.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalPortugol.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalPortugol.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalPortugol.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalPortugol.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // InternalPortugol.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // InternalPortugol.g:1:214: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 36 :
                // InternalPortugol.g:1:225: RULE_END_COMMAND
                {
                mRULE_END_COMMAND(); 

                }
                break;
            case 37 :
                // InternalPortugol.g:1:242: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 38 :
                // InternalPortugol.g:1:250: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 39 :
                // InternalPortugol.g:1:259: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 40 :
                // InternalPortugol.g:1:271: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 41 :
                // InternalPortugol.g:1:287: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 42 :
                // InternalPortugol.g:1:303: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 43 :
                // InternalPortugol.g:1:311: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\3\44\1\uffff\1\44\1\uffff\1\54\1\56\2\44\2\uffff\1\44\2\uffff\3\44\3\uffff\1\77\4\44\1\104\1\105\1\112\1\113\1\uffff\2\42\1\uffff\1\44\1\uffff\2\44\1\uffff\1\44\6\uffff\2\44\2\uffff\2\44\2\uffff\3\44\6\uffff\2\44\1\134\1\44\3\uffff\1\105\1\113\1\112\2\uffff\1\113\1\uffff\4\44\1\142\1\44\1\144\5\44\1\154\1\155\1\uffff\1\156\1\157\3\44\1\uffff\1\44\1\uffff\5\44\1\171\1\44\4\uffff\11\44\1\uffff\2\44\1\u0086\2\44\1\u0089\5\44\1\u008f\1\uffff\2\44\1\uffff\4\44\1\u0096\1\uffff\6\44\1\uffff\1\u009d\1\u009e\1\u009f\3\44\3\uffff\7\44\1\u00aa\1\u00ab\1\44\2\uffff\1\44\1\u00ae\1\uffff";
    static final String DFA15_eofS =
        "\u00af\uffff";
    static final String DFA15_minS =
        "\1\0\1\145\1\156\1\141\1\uffff\1\116\1\uffff\2\75\1\154\1\141\2\uffff\1\151\2\uffff\1\162\1\145\1\163\3\uffff\1\52\2\117\1\122\1\117\1\101\1\56\2\11\1\uffff\2\0\1\uffff\1\141\1\uffff\1\151\1\162\1\uffff\1\104\6\uffff\1\147\1\162\2\uffff\1\156\1\155\2\uffff\1\157\1\151\1\143\6\uffff\1\104\1\124\1\60\1\122\3\uffff\1\56\2\11\2\uffff\1\11\1\uffff\1\154\1\145\1\143\1\141\1\60\1\157\1\60\1\143\1\141\1\143\1\141\1\162\2\60\1\uffff\2\60\2\151\1\143\1\uffff\1\162\1\uffff\1\141\1\165\1\162\1\154\1\145\1\60\1\145\4\uffff\1\162\1\157\1\164\1\151\1\157\1\156\1\157\1\147\1\144\1\uffff\1\166\1\157\1\60\1\145\1\164\1\60\2\143\1\157\1\151\1\141\1\60\1\uffff\1\162\1\155\1\uffff\1\141\1\145\1\162\1\155\1\60\1\uffff\1\145\2\157\1\144\1\151\1\145\1\uffff\3\60\1\151\1\164\1\156\3\uffff\2\155\1\164\1\145\2\157\1\156\2\60\1\164\2\uffff\1\157\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\145\1\156\1\141\1\uffff\1\116\1\uffff\1\76\1\75\1\154\1\141\2\uffff\1\165\2\uffff\1\162\1\145\1\163\3\uffff\1\57\2\117\1\122\1\117\1\172\1\71\2\40\1\uffff\2\uffff\1\uffff\1\141\1\uffff\1\164\1\162\1\uffff\1\104\6\uffff\1\147\1\162\2\uffff\1\156\1\155\2\uffff\1\157\1\151\1\143\6\uffff\1\104\1\124\1\172\1\122\3\uffff\1\71\2\40\2\uffff\1\40\1\uffff\1\154\1\145\1\143\1\141\1\172\1\157\1\172\1\143\1\160\1\143\1\141\1\162\2\172\1\uffff\2\172\2\151\1\143\1\uffff\1\162\1\uffff\1\141\1\165\1\162\1\154\1\145\1\172\1\145\4\uffff\1\162\1\157\1\164\1\151\1\157\1\156\1\157\1\147\1\144\1\uffff\1\166\1\157\1\172\1\145\1\164\1\172\2\143\1\157\1\151\1\141\1\172\1\uffff\1\162\1\155\1\uffff\1\141\1\145\1\162\1\155\1\172\1\uffff\1\145\2\157\1\144\1\151\1\145\1\uffff\3\172\1\151\1\164\1\156\3\uffff\2\155\1\164\1\145\2\157\1\156\2\172\1\164\2\uffff\1\157\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\4\uffff\1\16\1\17\1\uffff\1\21\1\22\3\uffff\1\32\1\33\1\34\11\uffff\1\45\2\uffff\1\53\1\uffff\1\45\2\uffff\1\4\1\uffff\1\6\1\7\1\12\1\10\1\13\1\11\2\uffff\1\16\1\17\2\uffff\1\21\1\22\3\uffff\1\32\1\33\1\34\1\50\1\51\1\35\4\uffff\1\42\1\46\1\43\3\uffff\1\52\1\44\1\uffff\1\47\16\uffff\1\40\5\uffff\1\5\1\uffff\1\15\7\uffff\1\36\1\37\1\41\1\1\11\uffff\1\30\14\uffff\1\23\2\uffff\1\20\5\uffff\1\2\6\uffff\1\31\6\uffff\1\3\1\14\1\24\12\uffff\1\27\1\25\2\uffff\1\26";
    static final String DFA15_specialS =
        "\1\0\37\uffff\1\1\1\2\u008d\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\42\1\35\1\36\2\42\1\36\22\42\1\35\1\42\1\40\3\42\1\4\1\41\1\16\1\17\1\25\1\23\1\14\1\24\1\42\1\26\12\34\1\13\1\42\1\7\1\6\1\10\2\42\1\5\13\37\1\27\1\30\1\31\10\37\1\32\2\37\3\42\1\33\1\37\1\42\1\11\1\37\1\3\1\37\1\22\1\15\2\37\1\2\2\37\1\21\3\37\1\20\1\37\1\1\3\37\1\12\4\37\uff85\42",
            "\1\43",
            "\1\45",
            "\1\46",
            "",
            "\1\50",
            "",
            "\1\53\1\52",
            "\1\55",
            "\1\57",
            "\1\60",
            "",
            "",
            "\1\64\13\uffff\1\63",
            "",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "",
            "",
            "\1\75\4\uffff\1\76",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\106\1\uffff\12\107",
            "\1\111\1\110\2\uffff\1\110\22\uffff\1\111",
            "\1\114\1\110\2\uffff\1\110\22\uffff\1\114",
            "",
            "\0\115",
            "\0\115",
            "",
            "\1\116",
            "",
            "\1\120\12\uffff\1\117",
            "\1\121",
            "",
            "\1\122",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\123",
            "\1\124",
            "",
            "",
            "\1\125",
            "\1\126",
            "",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\132",
            "\1\133",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\135",
            "",
            "",
            "",
            "\1\106\1\uffff\12\107",
            "\1\114\1\110\2\uffff\1\110\22\uffff\1\114",
            "\1\111\1\110\2\uffff\1\110\22\uffff\1\111",
            "",
            "",
            "\1\114\1\112\2\uffff\1\112\22\uffff\1\114",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\143",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\145",
            "\1\150\4\uffff\1\146\11\uffff\1\147",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\160",
            "\1\161",
            "\1\162",
            "",
            "\1\163",
            "",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\172",
            "",
            "",
            "",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "",
            "\1\u0084",
            "\1\u0085",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0087",
            "\1\u0088",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u0090",
            "\1\u0091",
            "",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00ac",
            "",
            "",
            "\1\u00ad",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_FLOAT | RULE_END_COMMAND | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='r') ) {s = 1;}

                        else if ( (LA15_0=='i') ) {s = 2;}

                        else if ( (LA15_0=='c') ) {s = 3;}

                        else if ( (LA15_0=='&') ) {s = 4;}

                        else if ( (LA15_0=='A') ) {s = 5;}

                        else if ( (LA15_0=='=') ) {s = 6;}

                        else if ( (LA15_0=='<') ) {s = 7;}

                        else if ( (LA15_0=='>') ) {s = 8;}

                        else if ( (LA15_0=='a') ) {s = 9;}

                        else if ( (LA15_0=='v') ) {s = 10;}

                        else if ( (LA15_0==':') ) {s = 11;}

                        else if ( (LA15_0==',') ) {s = 12;}

                        else if ( (LA15_0=='f') ) {s = 13;}

                        else if ( (LA15_0=='(') ) {s = 14;}

                        else if ( (LA15_0==')') ) {s = 15;}

                        else if ( (LA15_0=='p') ) {s = 16;}

                        else if ( (LA15_0=='l') ) {s = 17;}

                        else if ( (LA15_0=='e') ) {s = 18;}

                        else if ( (LA15_0=='+') ) {s = 19;}

                        else if ( (LA15_0=='-') ) {s = 20;}

                        else if ( (LA15_0=='*') ) {s = 21;}

                        else if ( (LA15_0=='/') ) {s = 22;}

                        else if ( (LA15_0=='M') ) {s = 23;}

                        else if ( (LA15_0=='N') ) {s = 24;}

                        else if ( (LA15_0=='O') ) {s = 25;}

                        else if ( (LA15_0=='X') ) {s = 26;}

                        else if ( (LA15_0=='^') ) {s = 27;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 28;}

                        else if ( (LA15_0=='\t'||LA15_0==' ') ) {s = 29;}

                        else if ( (LA15_0=='\n'||LA15_0=='\r') ) {s = 30;}

                        else if ( ((LA15_0>='B' && LA15_0<='L')||(LA15_0>='P' && LA15_0<='W')||(LA15_0>='Y' && LA15_0<='Z')||LA15_0=='_'||LA15_0=='b'||LA15_0=='d'||(LA15_0>='g' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='k')||(LA15_0>='m' && LA15_0<='o')||LA15_0=='q'||(LA15_0>='s' && LA15_0<='u')||(LA15_0>='w' && LA15_0<='z')) ) {s = 31;}

                        else if ( (LA15_0=='\"') ) {s = 32;}

                        else if ( (LA15_0=='\'') ) {s = 33;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='%')||LA15_0=='.'||LA15_0==';'||(LA15_0>='?' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_32 = input.LA(1);

                        s = -1;
                        if ( ((LA15_32>='\u0000' && LA15_32<='\uFFFF')) ) {s = 77;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_33 = input.LA(1);

                        s = -1;
                        if ( ((LA15_33>='\u0000' && LA15_33<='\uFFFF')) ) {s = 77;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}