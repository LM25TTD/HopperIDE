package org.hopper.language.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPortugolLexer extends Lexer {
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
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
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
    public static final int RULE_END_COMMAND=5;
    public static final int RULE_STRING=4;
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
            // InternalPortugol.g:11:7: ( 'algoritmo' )
            // InternalPortugol.g:11:9: 'algoritmo'
            {
            match("algoritmo"); 


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
            // InternalPortugol.g:12:7: ( 'var' )
            // InternalPortugol.g:12:9: 'var'
            {
            match("var"); 


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
            // InternalPortugol.g:13:7: ( ':' )
            // InternalPortugol.g:13:9: ':'
            {
            match(':'); 

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
            // InternalPortugol.g:14:7: ( ',' )
            // InternalPortugol.g:14:9: ','
            {
            match(','); 

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
            // InternalPortugol.g:15:7: ( 'real' )
            // InternalPortugol.g:15:9: 'real'
            {
            match("real"); 


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
            // InternalPortugol.g:16:7: ( 'inteiro' )
            // InternalPortugol.g:16:9: 'inteiro'
            {
            match("inteiro"); 


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
            // InternalPortugol.g:17:7: ( 'caractere' )
            // InternalPortugol.g:17:9: 'caractere'
            {
            match("caractere"); 


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
            // InternalPortugol.g:18:7: ( 'caracter' )
            // InternalPortugol.g:18:9: 'caracter'
            {
            match("caracter"); 


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
            // InternalPortugol.g:19:7: ( 'funcao' )
            // InternalPortugol.g:19:9: 'funcao'
            {
            match("funcao"); 


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
            // InternalPortugol.g:20:7: ( '(' )
            // InternalPortugol.g:20:9: '('
            {
            match('('); 

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
            // InternalPortugol.g:21:7: ( ')' )
            // InternalPortugol.g:21:9: ')'
            {
            match(')'); 

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
            // InternalPortugol.g:22:7: ( 'inicio' )
            // InternalPortugol.g:22:9: 'inicio'
            {
            match("inicio"); 


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
            // InternalPortugol.g:23:7: ( 'fimfuncao' )
            // InternalPortugol.g:23:9: 'fimfuncao'
            {
            match("fimfuncao"); 


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
            // InternalPortugol.g:24:7: ( 'procedimento' )
            // InternalPortugol.g:24:9: 'procedimento'
            {
            match("procedimento"); 


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
            // InternalPortugol.g:25:7: ( 'fimprocedimento' )
            // InternalPortugol.g:25:9: 'fimprocedimento'
            {
            match("fimprocedimento"); 


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
            // InternalPortugol.g:26:7: ( 'fimalgoritmo' )
            // InternalPortugol.g:26:9: 'fimalgoritmo'
            {
            match("fimalgoritmo"); 


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
            // InternalPortugol.g:27:7: ( 'se' )
            // InternalPortugol.g:27:9: 'se'
            {
            match("se"); 


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
            // InternalPortugol.g:28:7: ( 'entao' )
            // InternalPortugol.g:28:9: 'entao'
            {
            match("entao"); 


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
            // InternalPortugol.g:29:7: ( 'senao' )
            // InternalPortugol.g:29:9: 'senao'
            {
            match("senao"); 


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
            // InternalPortugol.g:30:7: ( 'fimse' )
            // InternalPortugol.g:30:9: 'fimse'
            {
            match("fimse"); 


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
            // InternalPortugol.g:31:7: ( 'escolha' )
            // InternalPortugol.g:31:9: 'escolha'
            {
            match("escolha"); 


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
            // InternalPortugol.g:32:7: ( 'fimescolha' )
            // InternalPortugol.g:32:9: 'fimescolha'
            {
            match("fimescolha"); 


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
            // InternalPortugol.g:33:7: ( 'caso' )
            // InternalPortugol.g:33:9: 'caso'
            {
            match("caso"); 


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
            // InternalPortugol.g:34:7: ( 'interrompa' )
            // InternalPortugol.g:34:9: 'interrompa'
            {
            match("interrompa"); 


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
            // InternalPortugol.g:35:7: ( 'outrocaso' )
            // InternalPortugol.g:35:9: 'outrocaso'
            {
            match("outrocaso"); 


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
            // InternalPortugol.g:36:7: ( 'para' )
            // InternalPortugol.g:36:9: 'para'
            {
            match("para"); 


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
            // InternalPortugol.g:37:7: ( 'de' )
            // InternalPortugol.g:37:9: 'de'
            {
            match("de"); 


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
            // InternalPortugol.g:38:7: ( 'ate' )
            // InternalPortugol.g:38:9: 'ate'
            {
            match("ate"); 


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
            // InternalPortugol.g:39:7: ( 'passo' )
            // InternalPortugol.g:39:9: 'passo'
            {
            match("passo"); 


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
            // InternalPortugol.g:40:7: ( 'faca' )
            // InternalPortugol.g:40:9: 'faca'
            {
            match("faca"); 


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
            // InternalPortugol.g:41:7: ( 'fimpara' )
            // InternalPortugol.g:41:9: 'fimpara'
            {
            match("fimpara"); 


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
            // InternalPortugol.g:42:7: ( 'enquanto' )
            // InternalPortugol.g:42:9: 'enquanto'
            {
            match("enquanto"); 


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
            // InternalPortugol.g:43:7: ( 'fimenquanto' )
            // InternalPortugol.g:43:9: 'fimenquanto'
            {
            match("fimenquanto"); 


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
            // InternalPortugol.g:44:7: ( 'repita' )
            // InternalPortugol.g:44:9: 'repita'
            {
            match("repita"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:45:7: ( 'leia' )
            // InternalPortugol.g:45:9: 'leia'
            {
            match("leia"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:46:7: ( 'escreva' )
            // InternalPortugol.g:46:9: 'escreva'
            {
            match("escreva"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:47:7: ( 'escreval' )
            // InternalPortugol.g:47:9: 'escreval'
            {
            match("escreval"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:48:7: ( '<-' )
            // InternalPortugol.g:48:9: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:49:7: ( 'OU' )
            // InternalPortugol.g:49:9: 'OU'
            {
            match("OU"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:50:7: ( 'XOU' )
            // InternalPortugol.g:50:9: 'XOU'
            {
            match("XOU"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:51:7: ( '&' )
            // InternalPortugol.g:51:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:52:7: ( 'E' )
            // InternalPortugol.g:52:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:53:7: ( '=' )
            // InternalPortugol.g:53:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:54:7: ( '<>' )
            // InternalPortugol.g:54:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:55:7: ( '<' )
            // InternalPortugol.g:55:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:56:7: ( '>' )
            // InternalPortugol.g:56:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:57:7: ( '<=' )
            // InternalPortugol.g:57:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:58:7: ( '>=' )
            // InternalPortugol.g:58:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:59:7: ( '+' )
            // InternalPortugol.g:59:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:60:7: ( '-' )
            // InternalPortugol.g:60:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:61:7: ( '*' )
            // InternalPortugol.g:61:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:62:7: ( '/' )
            // InternalPortugol.g:62:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:63:7: ( 'MOD' )
            // InternalPortugol.g:63:9: 'MOD'
            {
            match("MOD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:64:7: ( '%' )
            // InternalPortugol.g:64:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:65:7: ( '^' )
            // InternalPortugol.g:65:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:66:7: ( 'NOT' )
            // InternalPortugol.g:66:9: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugol.g:3345:12: ( RULE_INT '.' RULE_INT )
            // InternalPortugol.g:3345:14: RULE_INT '.' RULE_INT
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
            // InternalPortugol.g:3347:18: ( ( ' ' | '\\t' )* ( '\\r' | '\\n' )+ ( ' ' | '\\t' )* )
            // InternalPortugol.g:3347:20: ( ' ' | '\\t' )* ( '\\r' | '\\n' )+ ( ' ' | '\\t' )*
            {
            // InternalPortugol.g:3347:20: ( ' ' | '\\t' )*
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

            // InternalPortugol.g:3347:32: ( '\\r' | '\\n' )+
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

            // InternalPortugol.g:3347:45: ( ' ' | '\\t' )*
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
            // InternalPortugol.g:3349:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPortugol.g:3349:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPortugol.g:3349:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPortugol.g:3349:11: '^'
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

            // InternalPortugol.g:3349:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalPortugol.g:3351:10: ( ( '0' .. '9' )+ )
            // InternalPortugol.g:3351:12: ( '0' .. '9' )+
            {
            // InternalPortugol.g:3351:12: ( '0' .. '9' )+
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
            	    // InternalPortugol.g:3351:13: '0' .. '9'
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
            // InternalPortugol.g:3353:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPortugol.g:3353:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPortugol.g:3353:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalPortugol.g:3353:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPortugol.g:3353:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalPortugol.g:3353:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPortugol.g:3353:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalPortugol.g:3353:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPortugol.g:3353:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalPortugol.g:3353:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPortugol.g:3353:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalPortugol.g:3355:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPortugol.g:3355:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPortugol.g:3355:24: ( options {greedy=false; } : . )*
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
            	    // InternalPortugol.g:3355:52: .
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
            // InternalPortugol.g:3357:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPortugol.g:3357:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPortugol.g:3357:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPortugol.g:3357:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalPortugol.g:3357:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPortugol.g:3357:41: ( '\\r' )? '\\n'
                    {
                    // InternalPortugol.g:3357:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalPortugol.g:3357:41: '\\r'
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
            // InternalPortugol.g:3359:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPortugol.g:3359:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPortugol.g:3359:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalPortugol.g:3361:16: ( . )
            // InternalPortugol.g:3361:18: .
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
        // InternalPortugol.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | RULE_FLOAT | RULE_END_COMMAND | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=65;
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
                // InternalPortugol.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // InternalPortugol.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // InternalPortugol.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // InternalPortugol.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // InternalPortugol.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // InternalPortugol.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // InternalPortugol.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // InternalPortugol.g:1:256: T__54
                {
                mT__54(); 

                }
                break;
            case 43 :
                // InternalPortugol.g:1:262: T__55
                {
                mT__55(); 

                }
                break;
            case 44 :
                // InternalPortugol.g:1:268: T__56
                {
                mT__56(); 

                }
                break;
            case 45 :
                // InternalPortugol.g:1:274: T__57
                {
                mT__57(); 

                }
                break;
            case 46 :
                // InternalPortugol.g:1:280: T__58
                {
                mT__58(); 

                }
                break;
            case 47 :
                // InternalPortugol.g:1:286: T__59
                {
                mT__59(); 

                }
                break;
            case 48 :
                // InternalPortugol.g:1:292: T__60
                {
                mT__60(); 

                }
                break;
            case 49 :
                // InternalPortugol.g:1:298: T__61
                {
                mT__61(); 

                }
                break;
            case 50 :
                // InternalPortugol.g:1:304: T__62
                {
                mT__62(); 

                }
                break;
            case 51 :
                // InternalPortugol.g:1:310: T__63
                {
                mT__63(); 

                }
                break;
            case 52 :
                // InternalPortugol.g:1:316: T__64
                {
                mT__64(); 

                }
                break;
            case 53 :
                // InternalPortugol.g:1:322: T__65
                {
                mT__65(); 

                }
                break;
            case 54 :
                // InternalPortugol.g:1:328: T__66
                {
                mT__66(); 

                }
                break;
            case 55 :
                // InternalPortugol.g:1:334: T__67
                {
                mT__67(); 

                }
                break;
            case 56 :
                // InternalPortugol.g:1:340: T__68
                {
                mT__68(); 

                }
                break;
            case 57 :
                // InternalPortugol.g:1:346: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 58 :
                // InternalPortugol.g:1:357: RULE_END_COMMAND
                {
                mRULE_END_COMMAND(); 

                }
                break;
            case 59 :
                // InternalPortugol.g:1:374: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 60 :
                // InternalPortugol.g:1:382: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 61 :
                // InternalPortugol.g:1:391: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 62 :
                // InternalPortugol.g:1:403: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 63 :
                // InternalPortugol.g:1:419: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 64 :
                // InternalPortugol.g:1:435: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 65 :
                // InternalPortugol.g:1:443: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\2\51\2\uffff\4\51\2\uffff\6\51\1\100\2\51\1\uffff\1\104\1\uffff\1\107\3\uffff\1\115\1\51\1\uffff\1\120\1\51\1\122\1\125\1\131\1\uffff\2\46\1\uffff\2\51\1\uffff\1\51\2\uffff\6\51\2\uffff\2\51\1\153\3\51\1\160\1\51\4\uffff\1\162\1\51\13\uffff\1\51\2\uffff\1\51\2\uffff\1\122\1\uffff\1\131\1\125\1\131\2\uffff\1\51\1\167\1\170\15\51\1\uffff\4\51\1\uffff\1\51\1\uffff\1\u0090\1\u0091\1\u0092\1\51\2\uffff\1\u0094\4\51\1\u009a\6\51\1\u00a3\1\51\1\u00a5\7\51\1\u00ad\3\uffff\1\51\1\uffff\5\51\1\uffff\5\51\1\u00b9\2\51\1\uffff\1\51\1\uffff\1\u00bd\1\u00be\1\u00bf\4\51\1\uffff\1\51\1\u00c5\2\51\1\u00c8\1\51\1\u00ca\4\51\1\uffff\3\51\3\uffff\5\51\1\uffff\1\u00d7\1\51\1\uffff\1\51\1\uffff\2\51\1\u00dc\5\51\1\u00e2\1\u00e4\2\51\1\uffff\1\51\1\u00e9\2\51\1\uffff\4\51\1\u00f0\1\uffff\1\u00f1\1\uffff\1\51\1\u00f3\1\51\1\u00f5\1\uffff\1\u00f6\5\51\2\uffff\1\u00fc\1\uffff\1\u00fd\2\uffff\2\51\1\u0100\2\51\2\uffff\2\51\1\uffff\1\u0105\2\51\1\u0108\1\uffff\1\u0109\1\51\2\uffff\1\51\1\u010c\1\uffff";
    static final String DFA15_eofS =
        "\u010d\uffff";
    static final String DFA15_minS =
        "\1\0\1\154\1\141\2\uffff\1\145\1\156\2\141\2\uffff\1\141\1\145\1\156\1\165\2\145\1\55\1\125\1\117\1\uffff\1\60\1\uffff\1\75\3\uffff\1\52\1\117\1\uffff\1\101\1\117\1\56\2\11\1\uffff\2\0\1\uffff\1\147\1\145\1\uffff\1\162\2\uffff\1\141\1\151\1\162\1\156\1\155\1\143\2\uffff\1\157\1\162\1\60\1\161\1\143\1\164\1\60\1\151\4\uffff\1\60\1\125\13\uffff\1\104\2\uffff\1\124\2\uffff\1\56\1\uffff\3\11\2\uffff\1\157\2\60\1\154\1\151\1\145\1\143\1\141\1\157\1\143\2\141\1\143\1\141\1\163\1\141\1\uffff\1\141\1\165\1\157\1\162\1\uffff\1\141\1\uffff\3\60\1\162\2\uffff\1\60\1\164\2\151\1\143\1\60\1\141\1\165\1\141\1\154\1\145\1\156\1\60\1\145\1\60\3\157\1\141\1\154\1\145\1\157\1\60\3\uffff\1\151\1\uffff\1\141\2\162\1\157\1\164\1\uffff\1\157\1\156\1\157\1\162\1\147\1\60\1\143\1\161\1\uffff\1\144\1\uffff\3\60\1\156\1\150\1\166\1\143\1\uffff\1\164\1\60\2\157\1\60\1\145\1\60\2\143\1\141\1\157\1\uffff\1\157\1\165\1\151\3\uffff\1\164\3\141\1\155\1\uffff\1\60\1\155\1\uffff\1\162\1\uffff\1\141\1\145\1\60\1\162\1\154\1\141\1\155\1\157\2\60\1\163\1\157\1\uffff\1\160\1\60\1\157\1\144\1\uffff\1\151\1\150\1\156\1\145\1\60\1\uffff\1\60\1\uffff\1\157\1\60\1\141\1\60\1\uffff\1\60\1\151\1\164\1\141\1\164\1\156\2\uffff\1\60\1\uffff\1\60\2\uffff\2\155\1\60\1\157\1\164\2\uffff\1\145\1\157\1\uffff\1\60\1\157\1\156\1\60\1\uffff\1\60\1\164\2\uffff\1\157\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\164\1\141\2\uffff\1\145\1\156\1\141\1\165\2\uffff\1\162\1\145\1\163\1\165\2\145\1\76\1\125\1\117\1\uffff\1\172\1\uffff\1\75\3\uffff\1\57\1\117\1\uffff\1\172\1\117\1\71\2\40\1\uffff\2\uffff\1\uffff\1\147\1\145\1\uffff\1\162\2\uffff\1\160\1\164\1\163\1\156\1\155\1\143\2\uffff\1\157\1\163\1\172\1\164\1\143\1\164\1\172\1\151\4\uffff\1\172\1\125\13\uffff\1\104\2\uffff\1\124\2\uffff\1\71\1\uffff\3\40\2\uffff\1\157\2\172\1\154\1\151\1\145\1\143\1\141\1\157\1\143\1\163\1\141\1\143\1\141\1\163\1\141\1\uffff\1\141\1\165\2\162\1\uffff\1\141\1\uffff\3\172\1\162\2\uffff\1\172\1\164\1\162\1\151\1\143\1\172\1\141\1\165\1\162\1\154\1\145\1\163\1\172\1\145\1\172\3\157\1\141\1\154\1\145\1\157\1\172\3\uffff\1\151\1\uffff\1\141\2\162\1\157\1\164\1\uffff\1\157\1\156\1\157\1\162\1\147\1\172\1\143\1\161\1\uffff\1\144\1\uffff\3\172\1\156\1\150\1\166\1\143\1\uffff\1\164\1\172\2\157\1\172\1\145\1\172\2\143\1\141\1\157\1\uffff\1\157\1\165\1\151\3\uffff\1\164\3\141\1\155\1\uffff\1\172\1\155\1\uffff\1\162\1\uffff\1\141\1\145\1\172\1\162\1\154\1\141\1\155\1\157\2\172\1\163\1\157\1\uffff\1\160\1\172\1\157\1\144\1\uffff\1\151\1\150\1\156\1\145\1\172\1\uffff\1\172\1\uffff\1\157\1\172\1\141\1\172\1\uffff\1\172\1\151\1\164\1\141\1\164\1\156\2\uffff\1\172\1\uffff\1\172\2\uffff\2\155\1\172\1\157\1\164\2\uffff\1\145\1\157\1\uffff\1\172\1\157\1\156\1\172\1\uffff\1\172\1\164\2\uffff\1\157\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\3\uffff\1\3\1\4\4\uffff\1\12\1\13\11\uffff\1\51\1\uffff\1\53\1\uffff\1\61\1\62\1\63\2\uffff\1\66\5\uffff\1\73\2\uffff\1\101\2\uffff\1\73\1\uffff\1\3\1\4\6\uffff\1\12\1\13\10\uffff\1\46\1\54\1\57\1\55\2\uffff\1\51\1\52\1\53\1\60\1\56\1\61\1\62\1\63\1\76\1\77\1\64\1\uffff\1\66\1\67\1\uffff\1\74\1\71\1\uffff\1\100\3\uffff\1\72\1\75\20\uffff\1\21\4\uffff\1\33\1\uffff\1\47\4\uffff\1\34\1\2\27\uffff\1\50\1\65\1\70\1\uffff\1\5\5\uffff\1\27\10\uffff\1\36\1\uffff\1\32\7\uffff\1\43\13\uffff\1\24\3\uffff\1\35\1\23\1\22\5\uffff\1\42\2\uffff\1\14\1\uffff\1\11\14\uffff\1\6\4\uffff\1\37\5\uffff\1\25\1\uffff\1\44\4\uffff\1\10\6\uffff\1\40\1\45\1\uffff\1\1\1\uffff\1\7\1\15\5\uffff\1\31\1\30\2\uffff\1\26\4\uffff\1\41\2\uffff\1\20\1\16\2\uffff\1\17";
    static final String DFA15_specialS =
        "\1\2\43\uffff\1\0\1\1\u00e7\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\46\1\41\1\42\2\46\1\42\22\46\1\41\1\46\1\44\2\46\1\35\1\24\1\45\1\11\1\12\1\32\1\30\1\4\1\31\1\46\1\33\12\40\1\3\1\46\1\21\1\26\1\27\2\46\4\43\1\25\7\43\1\34\1\37\1\22\10\43\1\23\2\43\3\46\1\36\1\43\1\46\1\1\1\43\1\7\1\17\1\15\1\10\2\43\1\6\2\43\1\20\2\43\1\16\1\13\1\43\1\5\1\14\2\43\1\2\4\43\uff85\46",
            "\1\47\7\uffff\1\50",
            "\1\52",
            "",
            "",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\62\7\uffff\1\61\13\uffff\1\60",
            "",
            "",
            "\1\66\20\uffff\1\65",
            "\1\67",
            "\1\70\4\uffff\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75\17\uffff\1\77\1\76",
            "\1\101",
            "\1\102",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\106",
            "",
            "",
            "",
            "\1\113\4\uffff\1\114",
            "\1\116",
            "",
            "\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\121",
            "\1\123\1\uffff\12\124",
            "\1\127\1\126\2\uffff\1\126\22\uffff\1\127",
            "\1\130\1\126\2\uffff\1\126\22\uffff\1\130",
            "",
            "\0\132",
            "\0\132",
            "",
            "\1\133",
            "\1\134",
            "",
            "\1\135",
            "",
            "",
            "\1\136\16\uffff\1\137",
            "\1\141\12\uffff\1\140",
            "\1\142\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "",
            "\1\147",
            "\1\150\1\151",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\15\51\1\152\14\51",
            "\1\155\2\uffff\1\154",
            "\1\156",
            "\1\157",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\161",
            "",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\163",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\164",
            "",
            "",
            "\1\165",
            "",
            "",
            "\1\123\1\uffff\12\124",
            "",
            "\1\130\1\126\2\uffff\1\126\22\uffff\1\130",
            "\1\127\1\126\2\uffff\1\126\22\uffff\1\127",
            "\1\130\1\125\2\uffff\1\125\22\uffff\1\130",
            "",
            "",
            "\1\166",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0082\3\uffff\1\u0084\1\u0080\11\uffff\1\u0081\2\uffff\1\u0083",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c\2\uffff\1\u008d",
            "\1\u008e",
            "",
            "\1\u008f",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0093",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0095",
            "\1\u0096\10\uffff\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u009b",
            "\1\u009c",
            "\1\u009e\20\uffff\1\u009d",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a2\4\uffff\1\u00a1",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a4",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "\1\u00c4",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00c6",
            "\1\u00c7",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00c9",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00d8",
            "",
            "\1\u00d9",
            "",
            "\1\u00da",
            "\1\u00db",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\13\51\1\u00e3\16\51",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "\1\u00e7",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\4\51\1\u00e8\25\51",
            "\1\u00ea",
            "\1\u00eb",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u00f2",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00f4",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\u00fe",
            "\1\u00ff",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0101",
            "\1\u0102",
            "",
            "",
            "\1\u0103",
            "\1\u0104",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0106",
            "\1\u0107",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u010a",
            "",
            "",
            "\1\u010b",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
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
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | RULE_FLOAT | RULE_END_COMMAND | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_36 = input.LA(1);

                        s = -1;
                        if ( ((LA15_36>='\u0000' && LA15_36<='\uFFFF')) ) {s = 90;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_37 = input.LA(1);

                        s = -1;
                        if ( ((LA15_37>='\u0000' && LA15_37<='\uFFFF')) ) {s = 90;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='a') ) {s = 1;}

                        else if ( (LA15_0=='v') ) {s = 2;}

                        else if ( (LA15_0==':') ) {s = 3;}

                        else if ( (LA15_0==',') ) {s = 4;}

                        else if ( (LA15_0=='r') ) {s = 5;}

                        else if ( (LA15_0=='i') ) {s = 6;}

                        else if ( (LA15_0=='c') ) {s = 7;}

                        else if ( (LA15_0=='f') ) {s = 8;}

                        else if ( (LA15_0=='(') ) {s = 9;}

                        else if ( (LA15_0==')') ) {s = 10;}

                        else if ( (LA15_0=='p') ) {s = 11;}

                        else if ( (LA15_0=='s') ) {s = 12;}

                        else if ( (LA15_0=='e') ) {s = 13;}

                        else if ( (LA15_0=='o') ) {s = 14;}

                        else if ( (LA15_0=='d') ) {s = 15;}

                        else if ( (LA15_0=='l') ) {s = 16;}

                        else if ( (LA15_0=='<') ) {s = 17;}

                        else if ( (LA15_0=='O') ) {s = 18;}

                        else if ( (LA15_0=='X') ) {s = 19;}

                        else if ( (LA15_0=='&') ) {s = 20;}

                        else if ( (LA15_0=='E') ) {s = 21;}

                        else if ( (LA15_0=='=') ) {s = 22;}

                        else if ( (LA15_0=='>') ) {s = 23;}

                        else if ( (LA15_0=='+') ) {s = 24;}

                        else if ( (LA15_0=='-') ) {s = 25;}

                        else if ( (LA15_0=='*') ) {s = 26;}

                        else if ( (LA15_0=='/') ) {s = 27;}

                        else if ( (LA15_0=='M') ) {s = 28;}

                        else if ( (LA15_0=='%') ) {s = 29;}

                        else if ( (LA15_0=='^') ) {s = 30;}

                        else if ( (LA15_0=='N') ) {s = 31;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 32;}

                        else if ( (LA15_0=='\t'||LA15_0==' ') ) {s = 33;}

                        else if ( (LA15_0=='\n'||LA15_0=='\r') ) {s = 34;}

                        else if ( ((LA15_0>='A' && LA15_0<='D')||(LA15_0>='F' && LA15_0<='L')||(LA15_0>='P' && LA15_0<='W')||(LA15_0>='Y' && LA15_0<='Z')||LA15_0=='_'||LA15_0=='b'||(LA15_0>='g' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='k')||(LA15_0>='m' && LA15_0<='n')||LA15_0=='q'||(LA15_0>='t' && LA15_0<='u')||(LA15_0>='w' && LA15_0<='z')) ) {s = 35;}

                        else if ( (LA15_0=='\"') ) {s = 36;}

                        else if ( (LA15_0=='\'') ) {s = 37;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='$')||LA15_0=='.'||LA15_0==';'||(LA15_0>='?' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 38;}

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