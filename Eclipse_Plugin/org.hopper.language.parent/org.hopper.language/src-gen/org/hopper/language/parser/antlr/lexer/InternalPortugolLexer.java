package org.hopper.language.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPortugolLexer extends Lexer {
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

    public InternalPortugolLexer() {;} 
    public InternalPortugolLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPortugolLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPortugolLexer.g"; }

    // $ANTLR start "Fimprocedimento"
    public final void mFimprocedimento() throws RecognitionException {
        try {
            int _type = Fimprocedimento;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:14:17: ( ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' ) )
            // InternalPortugolLexer.g:14:19: ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Fimprocedimento"

    // $ANTLR start "Fimalgoritmo"
    public final void mFimalgoritmo() throws RecognitionException {
        try {
            int _type = Fimalgoritmo;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:16:14: ( ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'G' | 'g' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'M' | 'm' ) ( 'O' | 'o' ) )
            // InternalPortugolLexer.g:16:16: ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'G' | 'g' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'M' | 'm' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Fimalgoritmo"

    // $ANTLR start "Procedimento"
    public final void mProcedimento() throws RecognitionException {
        try {
            int _type = Procedimento;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:18:14: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' ) )
            // InternalPortugolLexer.g:18:16: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Procedimento"

    // $ANTLR start "Fimenquanto"
    public final void mFimenquanto() throws RecognitionException {
        try {
            int _type = Fimenquanto;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:20:13: ( ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' ) )
            // InternalPortugolLexer.g:20:15: ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Fimenquanto"

    // $ANTLR start "Fimescolha"
    public final void mFimescolha() throws RecognitionException {
        try {
            int _type = Fimescolha;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:22:12: ( ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'H' | 'h' ) ( 'A' | 'a' ) )
            // InternalPortugolLexer.g:22:14: ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'H' | 'h' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Fimescolha"

    // $ANTLR start "Interrompa"
    public final void mInterrompa() throws RecognitionException {
        try {
            int _type = Interrompa;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:24:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'A' | 'a' ) )
            // InternalPortugolLexer.g:24:14: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Interrompa"

    // $ANTLR start "Algoritmo"
    public final void mAlgoritmo() throws RecognitionException {
        try {
            int _type = Algoritmo;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:26:11: ( ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'G' | 'g' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'M' | 'm' ) ( 'O' | 'o' ) )
            // InternalPortugolLexer.g:26:13: ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'G' | 'g' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'M' | 'm' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Algoritmo"

    // $ANTLR start "Caractere"
    public final void mCaractere() throws RecognitionException {
        try {
            int _type = Caractere;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:28:11: ( ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // InternalPortugolLexer.g:28:13: ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Caractere"

    // $ANTLR start "Fimfuncao"
    public final void mFimfuncao() throws RecognitionException {
        try {
            int _type = Fimfuncao;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:30:11: ( ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'F' | 'f' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'O' | 'o' ) )
            // InternalPortugolLexer.g:30:13: ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'F' | 'f' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Fimfuncao"

    // $ANTLR start "Outrocaso"
    public final void mOutrocaso() throws RecognitionException {
        try {
            int _type = Outrocaso;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:32:11: ( ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'O' | 'o' ) )
            // InternalPortugolLexer.g:32:13: ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Outrocaso"

    // $ANTLR start "Caracter"
    public final void mCaracter() throws RecognitionException {
        try {
            int _type = Caracter;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:34:10: ( ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // InternalPortugolLexer.g:34:12: ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Caracter"

    // $ANTLR start "Enquanto"
    public final void mEnquanto() throws RecognitionException {
        try {
            int _type = Enquanto;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:36:10: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' ) )
            // InternalPortugolLexer.g:36:12: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Enquanto"

    // $ANTLR start "Escreval"
    public final void mEscreval() throws RecognitionException {
        try {
            int _type = Escreval;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:38:10: ( ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // InternalPortugolLexer.g:38:12: ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Escreval"

    // $ANTLR start "Escolha"
    public final void mEscolha() throws RecognitionException {
        try {
            int _type = Escolha;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:40:9: ( ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'H' | 'h' ) ( 'A' | 'a' ) )
            // InternalPortugolLexer.g:40:11: ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'H' | 'h' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Escolha"

    // $ANTLR start "Escreva"
    public final void mEscreva() throws RecognitionException {
        try {
            int _type = Escreva;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:42:9: ( ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'V' | 'v' ) ( 'A' | 'a' ) )
            // InternalPortugolLexer.g:42:11: ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'V' | 'v' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Escreva"

    // $ANTLR start "Fimpara"
    public final void mFimpara() throws RecognitionException {
        try {
            int _type = Fimpara;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:44:9: ( ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) )
            // InternalPortugolLexer.g:44:11: ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Fimpara"

    // $ANTLR start "Inteiro"
    public final void mInteiro() throws RecognitionException {
        try {
            int _type = Inteiro;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:46:9: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'O' | 'o' ) )
            // InternalPortugolLexer.g:46:11: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Inteiro"

    // $ANTLR start "Retorne"
    public final void mRetorne() throws RecognitionException {
        try {
            int _type = Retorne;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:48:9: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'N' | 'n' ) ( 'E' | 'e' ) )
            // InternalPortugolLexer.g:48:11: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'N' | 'n' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Retorne"

    // $ANTLR start "Funcao"
    public final void mFuncao() throws RecognitionException {
        try {
            int _type = Funcao;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:50:8: ( ( 'F' | 'f' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'O' | 'o' ) )
            // InternalPortugolLexer.g:50:10: ( 'F' | 'f' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Funcao"

    // $ANTLR start "Inicio"
    public final void mInicio() throws RecognitionException {
        try {
            int _type = Inicio;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:52:8: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'I' | 'i' ) ( 'O' | 'o' ) )
            // InternalPortugolLexer.g:52:10: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'I' | 'i' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Inicio"

    // $ANTLR start "Maiusc"
    public final void mMaiusc() throws RecognitionException {
        try {
            int _type = Maiusc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:54:8: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'U' | 'u' ) ( 'S' | 's' ) ( 'C' | 'c' ) )
            // InternalPortugolLexer.g:54:10: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'U' | 'u' ) ( 'S' | 's' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Maiusc"

    // $ANTLR start "Repita"
    public final void mRepita() throws RecognitionException {
        try {
            int _type = Repita;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:56:8: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'A' | 'a' ) )
            // InternalPortugolLexer.g:56:10: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Repita"

    // $ANTLR start "Compr"
    public final void mCompr() throws RecognitionException {
        try {
            int _type = Compr;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:58:7: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'R' | 'r' ) )
            // InternalPortugolLexer.g:58:9: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Compr"

    // $ANTLR start "Copia"
    public final void mCopia() throws RecognitionException {
        try {
            int _type = Copia;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:60:7: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'I' | 'i' ) ( 'A' | 'a' ) )
            // InternalPortugolLexer.g:60:9: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'I' | 'i' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Copia"

    // $ANTLR start "Entao"
    public final void mEntao() throws RecognitionException {
        try {
            int _type = Entao;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:62:7: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'O' | 'o' ) )
            // InternalPortugolLexer.g:62:9: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Entao"

    // $ANTLR start "Fimse"
    public final void mFimse() throws RecognitionException {
        try {
            int _type = Fimse;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:64:7: ( ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalPortugolLexer.g:64:9: ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Fimse"

    // $ANTLR start "Passo"
    public final void mPasso() throws RecognitionException {
        try {
            int _type = Passo;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:66:7: ( ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'O' | 'o' ) )
            // InternalPortugolLexer.g:66:9: ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Passo"

    // $ANTLR start "Raizq"
    public final void mRaizq() throws RecognitionException {
        try {
            int _type = Raizq;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:68:7: ( ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'Q' | 'q' ) )
            // InternalPortugolLexer.g:68:9: ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'Q' | 'q' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Raizq"

    // $ANTLR start "Senao"
    public final void mSenao() throws RecognitionException {
        try {
            int _type = Senao;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:70:7: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'O' | 'o' ) )
            // InternalPortugolLexer.g:70:9: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Senao"

    // $ANTLR start "Caso"
    public final void mCaso() throws RecognitionException {
        try {
            int _type = Caso;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:72:6: ( ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'O' | 'o' ) )
            // InternalPortugolLexer.g:72:8: ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Caso"

    // $ANTLR start "Faca"
    public final void mFaca() throws RecognitionException {
        try {
            int _type = Faca;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:74:6: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'A' | 'a' ) )
            // InternalPortugolLexer.g:74:8: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Faca"

    // $ANTLR start "Leia"
    public final void mLeia() throws RecognitionException {
        try {
            int _type = Leia;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:76:6: ( ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'A' | 'a' ) )
            // InternalPortugolLexer.g:76:8: ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Leia"

    // $ANTLR start "Para"
    public final void mPara() throws RecognitionException {
        try {
            int _type = Para;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:78:6: ( ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) )
            // InternalPortugolLexer.g:78:8: ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Para"

    // $ANTLR start "Real"
    public final void mReal() throws RecognitionException {
        try {
            int _type = Real;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:80:6: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // InternalPortugolLexer.g:80:8: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Real"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:82:5: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) )
            // InternalPortugolLexer.g:82:7: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:84:5: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
            // InternalPortugolLexer.g:84:7: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "XOU"
    public final void mXOU() throws RecognitionException {
        try {
            int _type = XOU;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:86:5: ( ( 'X' | 'x' ) ( 'O' | 'o' ) ( 'U' | 'u' ) )
            // InternalPortugolLexer.g:86:7: ( 'X' | 'x' ) ( 'O' | 'o' ) ( 'U' | 'u' )
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XOU"

    // $ANTLR start "Ate"
    public final void mAte() throws RecognitionException {
        try {
            int _type = Ate;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:88:5: ( ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // InternalPortugolLexer.g:88:7: ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ate"

    // $ANTLR start "Var"
    public final void mVar() throws RecognitionException {
        try {
            int _type = Var;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:90:5: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // InternalPortugolLexer.g:90:7: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Var"

    // $ANTLR start "LessThanSignHyphenMinus"
    public final void mLessThanSignHyphenMinus() throws RecognitionException {
        try {
            int _type = LessThanSignHyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:92:25: ( '<' '-' )
            // InternalPortugolLexer.g:92:27: '<' '-'
            {
            match('<'); 
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignHyphenMinus"

    // $ANTLR start "LessThanSignEqualsSign"
    public final void mLessThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = LessThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:94:24: ( '<' '=' )
            // InternalPortugolLexer.g:94:26: '<' '='
            {
            match('<'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignEqualsSign"

    // $ANTLR start "LessThanSignGreaterThanSign"
    public final void mLessThanSignGreaterThanSign() throws RecognitionException {
        try {
            int _type = LessThanSignGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:96:29: ( '<' '>' )
            // InternalPortugolLexer.g:96:31: '<' '>'
            {
            match('<'); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignGreaterThanSign"

    // $ANTLR start "GreaterThanSignEqualsSign"
    public final void mGreaterThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:98:27: ( '>' '=' )
            // InternalPortugolLexer.g:98:29: '>' '='
            {
            match('>'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSignEqualsSign"

    // $ANTLR start "OU"
    public final void mOU() throws RecognitionException {
        try {
            int _type = OU;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:100:4: ( ( 'O' | 'o' ) ( 'U' | 'u' ) )
            // InternalPortugolLexer.g:100:6: ( 'O' | 'o' ) ( 'U' | 'u' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OU"

    // $ANTLR start "De"
    public final void mDe() throws RecognitionException {
        try {
            int _type = De;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:102:4: ( ( 'D' | 'd' ) ( 'E' | 'e' ) )
            // InternalPortugolLexer.g:102:6: ( 'D' | 'd' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "De"

    // $ANTLR start "Pi"
    public final void mPi() throws RecognitionException {
        try {
            int _type = Pi;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:104:4: ( ( 'P' | 'p' ) ( 'I' | 'i' ) )
            // InternalPortugolLexer.g:104:6: ( 'P' | 'p' ) ( 'I' | 'i' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pi"

    // $ANTLR start "Se"
    public final void mSe() throws RecognitionException {
        try {
            int _type = Se;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:106:4: ( ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalPortugolLexer.g:106:6: ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Se"

    // $ANTLR start "PercentSign"
    public final void mPercentSign() throws RecognitionException {
        try {
            int _type = PercentSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:108:13: ( '%' )
            // InternalPortugolLexer.g:108:15: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PercentSign"

    // $ANTLR start "Ampersand"
    public final void mAmpersand() throws RecognitionException {
        try {
            int _type = Ampersand;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:110:11: ( '&' )
            // InternalPortugolLexer.g:110:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ampersand"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:112:17: ( '(' )
            // InternalPortugolLexer.g:112:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:114:18: ( ')' )
            // InternalPortugolLexer.g:114:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:116:10: ( '*' )
            // InternalPortugolLexer.g:116:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:118:10: ( '+' )
            // InternalPortugolLexer.g:118:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:120:7: ( ',' )
            // InternalPortugolLexer.g:120:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:122:13: ( '-' )
            // InternalPortugolLexer.g:122:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:124:9: ( '/' )
            // InternalPortugolLexer.g:124:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:126:7: ( ':' )
            // InternalPortugolLexer.g:126:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Semicolon"
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:128:11: ( ';' )
            // InternalPortugolLexer.g:128:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Semicolon"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:130:14: ( '<' )
            // InternalPortugolLexer.g:130:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSign"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:132:12: ( '=' )
            // InternalPortugolLexer.g:132:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "GreaterThanSign"
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:134:17: ( '>' )
            // InternalPortugolLexer.g:134:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSign"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            int _type = E;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:136:3: ( ( 'E' | 'e' ) )
            // InternalPortugolLexer.g:136:5: ( 'E' | 'e' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "CircumflexAccent"
    public final void mCircumflexAccent() throws RecognitionException {
        try {
            int _type = CircumflexAccent;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:138:18: ( '^' )
            // InternalPortugolLexer.g:138:20: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CircumflexAccent"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:142:12: ( RULE_INT '.' RULE_INT )
            // InternalPortugolLexer.g:142:14: RULE_INT '.' RULE_INT
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPortugolLexer.g:144:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPortugolLexer.g:144:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPortugolLexer.g:144:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPortugolLexer.g:144:11: '^'
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

            // InternalPortugolLexer.g:144:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPortugolLexer.g:
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
            	    break loop2;
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
            // InternalPortugolLexer.g:146:10: ( ( '0' .. '9' )+ )
            // InternalPortugolLexer.g:146:12: ( '0' .. '9' )+
            {
            // InternalPortugolLexer.g:146:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPortugolLexer.g:146:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // InternalPortugolLexer.g:148:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPortugolLexer.g:148:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPortugolLexer.g:148:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPortugolLexer.g:148:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPortugolLexer.g:148:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalPortugolLexer.g:148:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPortugolLexer.g:148:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPortugolLexer.g:148:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPortugolLexer.g:148:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPortugolLexer.g:148:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPortugolLexer.g:148:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // InternalPortugolLexer.g:150:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPortugolLexer.g:150:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPortugolLexer.g:150:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPortugolLexer.g:150:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // InternalPortugolLexer.g:152:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPortugolLexer.g:152:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPortugolLexer.g:152:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPortugolLexer.g:152:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalPortugolLexer.g:152:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPortugolLexer.g:152:41: ( '\\r' )? '\\n'
                    {
                    // InternalPortugolLexer.g:152:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalPortugolLexer.g:152:41: '\\r'
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
            // InternalPortugolLexer.g:154:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPortugolLexer.g:154:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPortugolLexer.g:154:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPortugolLexer.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // InternalPortugolLexer.g:156:16: ( . )
            // InternalPortugolLexer.g:156:18: .
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
        // InternalPortugolLexer.g:1:8: ( Fimprocedimento | Fimalgoritmo | Procedimento | Fimenquanto | Fimescolha | Interrompa | Algoritmo | Caractere | Fimfuncao | Outrocaso | Caracter | Enquanto | Escreval | Escolha | Escreva | Fimpara | Inteiro | Retorne | Funcao | Inicio | Maiusc | Repita | Compr | Copia | Entao | Fimse | Passo | Raizq | Senao | Caso | Faca | Leia | Para | Real | MOD | NOT | XOU | Ate | Var | LessThanSignHyphenMinus | LessThanSignEqualsSign | LessThanSignGreaterThanSign | GreaterThanSignEqualsSign | OU | De | Pi | Se | PercentSign | Ampersand | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | E | CircumflexAccent | RULE_FLOAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=71;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalPortugolLexer.g:1:10: Fimprocedimento
                {
                mFimprocedimento(); 

                }
                break;
            case 2 :
                // InternalPortugolLexer.g:1:26: Fimalgoritmo
                {
                mFimalgoritmo(); 

                }
                break;
            case 3 :
                // InternalPortugolLexer.g:1:39: Procedimento
                {
                mProcedimento(); 

                }
                break;
            case 4 :
                // InternalPortugolLexer.g:1:52: Fimenquanto
                {
                mFimenquanto(); 

                }
                break;
            case 5 :
                // InternalPortugolLexer.g:1:64: Fimescolha
                {
                mFimescolha(); 

                }
                break;
            case 6 :
                // InternalPortugolLexer.g:1:75: Interrompa
                {
                mInterrompa(); 

                }
                break;
            case 7 :
                // InternalPortugolLexer.g:1:86: Algoritmo
                {
                mAlgoritmo(); 

                }
                break;
            case 8 :
                // InternalPortugolLexer.g:1:96: Caractere
                {
                mCaractere(); 

                }
                break;
            case 9 :
                // InternalPortugolLexer.g:1:106: Fimfuncao
                {
                mFimfuncao(); 

                }
                break;
            case 10 :
                // InternalPortugolLexer.g:1:116: Outrocaso
                {
                mOutrocaso(); 

                }
                break;
            case 11 :
                // InternalPortugolLexer.g:1:126: Caracter
                {
                mCaracter(); 

                }
                break;
            case 12 :
                // InternalPortugolLexer.g:1:135: Enquanto
                {
                mEnquanto(); 

                }
                break;
            case 13 :
                // InternalPortugolLexer.g:1:144: Escreval
                {
                mEscreval(); 

                }
                break;
            case 14 :
                // InternalPortugolLexer.g:1:153: Escolha
                {
                mEscolha(); 

                }
                break;
            case 15 :
                // InternalPortugolLexer.g:1:161: Escreva
                {
                mEscreva(); 

                }
                break;
            case 16 :
                // InternalPortugolLexer.g:1:169: Fimpara
                {
                mFimpara(); 

                }
                break;
            case 17 :
                // InternalPortugolLexer.g:1:177: Inteiro
                {
                mInteiro(); 

                }
                break;
            case 18 :
                // InternalPortugolLexer.g:1:185: Retorne
                {
                mRetorne(); 

                }
                break;
            case 19 :
                // InternalPortugolLexer.g:1:193: Funcao
                {
                mFuncao(); 

                }
                break;
            case 20 :
                // InternalPortugolLexer.g:1:200: Inicio
                {
                mInicio(); 

                }
                break;
            case 21 :
                // InternalPortugolLexer.g:1:207: Maiusc
                {
                mMaiusc(); 

                }
                break;
            case 22 :
                // InternalPortugolLexer.g:1:214: Repita
                {
                mRepita(); 

                }
                break;
            case 23 :
                // InternalPortugolLexer.g:1:221: Compr
                {
                mCompr(); 

                }
                break;
            case 24 :
                // InternalPortugolLexer.g:1:227: Copia
                {
                mCopia(); 

                }
                break;
            case 25 :
                // InternalPortugolLexer.g:1:233: Entao
                {
                mEntao(); 

                }
                break;
            case 26 :
                // InternalPortugolLexer.g:1:239: Fimse
                {
                mFimse(); 

                }
                break;
            case 27 :
                // InternalPortugolLexer.g:1:245: Passo
                {
                mPasso(); 

                }
                break;
            case 28 :
                // InternalPortugolLexer.g:1:251: Raizq
                {
                mRaizq(); 

                }
                break;
            case 29 :
                // InternalPortugolLexer.g:1:257: Senao
                {
                mSenao(); 

                }
                break;
            case 30 :
                // InternalPortugolLexer.g:1:263: Caso
                {
                mCaso(); 

                }
                break;
            case 31 :
                // InternalPortugolLexer.g:1:268: Faca
                {
                mFaca(); 

                }
                break;
            case 32 :
                // InternalPortugolLexer.g:1:273: Leia
                {
                mLeia(); 

                }
                break;
            case 33 :
                // InternalPortugolLexer.g:1:278: Para
                {
                mPara(); 

                }
                break;
            case 34 :
                // InternalPortugolLexer.g:1:283: Real
                {
                mReal(); 

                }
                break;
            case 35 :
                // InternalPortugolLexer.g:1:288: MOD
                {
                mMOD(); 

                }
                break;
            case 36 :
                // InternalPortugolLexer.g:1:292: NOT
                {
                mNOT(); 

                }
                break;
            case 37 :
                // InternalPortugolLexer.g:1:296: XOU
                {
                mXOU(); 

                }
                break;
            case 38 :
                // InternalPortugolLexer.g:1:300: Ate
                {
                mAte(); 

                }
                break;
            case 39 :
                // InternalPortugolLexer.g:1:304: Var
                {
                mVar(); 

                }
                break;
            case 40 :
                // InternalPortugolLexer.g:1:308: LessThanSignHyphenMinus
                {
                mLessThanSignHyphenMinus(); 

                }
                break;
            case 41 :
                // InternalPortugolLexer.g:1:332: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 42 :
                // InternalPortugolLexer.g:1:355: LessThanSignGreaterThanSign
                {
                mLessThanSignGreaterThanSign(); 

                }
                break;
            case 43 :
                // InternalPortugolLexer.g:1:383: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 44 :
                // InternalPortugolLexer.g:1:409: OU
                {
                mOU(); 

                }
                break;
            case 45 :
                // InternalPortugolLexer.g:1:412: De
                {
                mDe(); 

                }
                break;
            case 46 :
                // InternalPortugolLexer.g:1:415: Pi
                {
                mPi(); 

                }
                break;
            case 47 :
                // InternalPortugolLexer.g:1:418: Se
                {
                mSe(); 

                }
                break;
            case 48 :
                // InternalPortugolLexer.g:1:421: PercentSign
                {
                mPercentSign(); 

                }
                break;
            case 49 :
                // InternalPortugolLexer.g:1:433: Ampersand
                {
                mAmpersand(); 

                }
                break;
            case 50 :
                // InternalPortugolLexer.g:1:443: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 51 :
                // InternalPortugolLexer.g:1:459: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 52 :
                // InternalPortugolLexer.g:1:476: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 53 :
                // InternalPortugolLexer.g:1:485: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 54 :
                // InternalPortugolLexer.g:1:494: Comma
                {
                mComma(); 

                }
                break;
            case 55 :
                // InternalPortugolLexer.g:1:500: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 56 :
                // InternalPortugolLexer.g:1:512: Solidus
                {
                mSolidus(); 

                }
                break;
            case 57 :
                // InternalPortugolLexer.g:1:520: Colon
                {
                mColon(); 

                }
                break;
            case 58 :
                // InternalPortugolLexer.g:1:526: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 59 :
                // InternalPortugolLexer.g:1:536: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 60 :
                // InternalPortugolLexer.g:1:549: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 61 :
                // InternalPortugolLexer.g:1:560: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 62 :
                // InternalPortugolLexer.g:1:576: E
                {
                mE(); 

                }
                break;
            case 63 :
                // InternalPortugolLexer.g:1:578: CircumflexAccent
                {
                mCircumflexAccent(); 

                }
                break;
            case 64 :
                // InternalPortugolLexer.g:1:595: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 65 :
                // InternalPortugolLexer.g:1:606: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 66 :
                // InternalPortugolLexer.g:1:614: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 67 :
                // InternalPortugolLexer.g:1:623: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 68 :
                // InternalPortugolLexer.g:1:635: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 69 :
                // InternalPortugolLexer.g:1:651: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 70 :
                // InternalPortugolLexer.g:1:667: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 71 :
                // InternalPortugolLexer.g:1:675: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\6\50\1\64\7\50\1\101\1\103\1\50\10\uffff\1\117\3\uffff\1\123\1\124\1\uffff\2\44\2\uffff\3\50\1\uffff\2\50\1\137\5\50\1\151\2\50\1\uffff\4\50\1\164\4\50\6\uffff\1\171\21\uffff\1\124\2\uffff\6\50\1\uffff\3\50\1\u0087\5\50\1\uffff\10\50\1\u0096\1\50\1\uffff\1\50\1\u0099\1\u009a\1\u009b\1\uffff\6\50\1\u00a4\2\50\1\u00a7\3\50\1\uffff\1\50\1\u00ad\11\50\1\u00b7\2\50\1\uffff\1\50\1\u00bb\3\uffff\6\50\1\u00c2\1\50\1\uffff\1\50\1\u00c5\1\uffff\5\50\1\uffff\1\u00cb\1\u00cc\2\50\1\u00cf\4\50\1\uffff\1\u00d4\1\50\1\u00d6\1\uffff\6\50\1\uffff\1\u00dd\1\50\1\uffff\2\50\1\u00e1\2\50\2\uffff\2\50\1\uffff\3\50\1\u00e9\1\uffff\1\u00ea\1\uffff\1\50\1\u00ec\4\50\1\uffff\2\50\1\u00f3\1\uffff\4\50\1\u00f9\1\u00fa\1\u00fb\2\uffff\1\50\1\uffff\6\50\1\uffff\1\50\1\u0105\1\50\1\u0107\1\u0108\3\uffff\4\50\1\u010d\2\50\1\u0110\1\u0111\1\uffff\1\u0112\2\uffff\3\50\1\u0116\1\uffff\1\50\1\u0118\3\uffff\2\50\1\u011b\1\uffff\1\50\1\uffff\1\50\1\u011e\1\uffff\1\u011f\1\50\2\uffff\1\50\1\u0122\1\uffff";
    static final String DFA12_eofS =
        "\u0123\uffff";
    static final String DFA12_minS =
        "\1\0\2\101\1\116\1\114\1\101\1\125\1\60\2\101\2\105\2\117\1\101\1\55\1\75\1\105\10\uffff\1\52\3\uffff\1\101\1\56\1\uffff\2\0\2\uffff\1\115\1\116\1\103\1\uffff\1\117\1\122\1\60\1\111\1\107\1\105\1\122\1\115\1\60\1\121\1\103\1\uffff\1\101\2\111\1\104\1\60\1\111\1\124\1\125\1\122\6\uffff\1\60\21\uffff\1\56\2\uffff\1\101\1\103\1\101\1\103\1\123\1\101\1\uffff\1\105\1\103\1\117\1\60\1\101\1\117\1\120\1\111\1\122\1\uffff\1\125\1\101\2\117\1\111\1\114\1\132\1\125\1\60\1\101\1\uffff\1\101\3\60\1\uffff\1\101\1\114\1\116\1\125\1\105\1\101\1\60\1\105\1\117\1\60\2\111\1\122\1\uffff\1\103\1\60\1\122\1\101\1\117\1\101\1\117\1\105\1\114\1\122\1\124\1\60\1\121\1\123\1\uffff\1\117\1\60\3\uffff\1\117\1\122\1\107\1\121\1\103\1\116\1\60\1\117\1\uffff\1\104\1\60\1\uffff\2\122\1\117\1\111\1\124\1\uffff\2\60\1\103\1\116\1\60\1\126\1\110\1\116\1\101\1\uffff\1\60\1\103\1\60\1\uffff\1\103\1\101\1\117\1\125\1\117\1\103\1\uffff\1\60\1\111\1\uffff\2\117\1\60\1\124\1\105\2\uffff\1\101\1\124\1\uffff\2\101\1\105\1\60\1\uffff\1\60\1\uffff\1\105\1\60\1\122\1\101\1\114\1\101\1\uffff\2\115\1\60\1\uffff\1\115\1\122\1\123\1\117\3\60\2\uffff\1\104\1\uffff\1\111\1\116\1\110\1\117\1\105\1\120\1\uffff\1\117\1\60\1\117\2\60\3\uffff\1\111\2\124\1\101\1\60\1\116\1\101\2\60\1\uffff\1\60\2\uffff\2\115\1\117\1\60\1\uffff\1\124\1\60\3\uffff\1\105\1\117\1\60\1\uffff\1\117\1\uffff\1\116\1\60\1\uffff\1\60\1\124\2\uffff\1\117\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\165\1\162\1\156\1\164\1\157\1\165\1\172\1\145\1\157\2\145\2\157\1\141\1\76\1\75\1\145\10\uffff\1\57\3\uffff\1\172\1\71\1\uffff\2\uffff\2\uffff\1\155\1\156\1\143\1\uffff\1\157\1\163\1\172\1\164\1\147\1\145\1\163\1\160\1\172\1\164\1\143\1\uffff\1\164\2\151\1\144\1\172\1\151\1\164\1\165\1\162\6\uffff\1\172\21\uffff\1\71\2\uffff\1\163\1\143\1\141\1\143\1\163\1\141\1\uffff\1\145\1\143\1\157\1\172\1\141\1\157\1\160\1\151\1\162\1\uffff\1\165\1\141\1\162\1\157\1\151\1\154\1\172\1\165\1\172\1\141\1\uffff\1\141\3\172\1\uffff\1\162\1\154\1\163\1\165\1\145\1\141\1\172\1\145\1\157\1\172\1\162\1\151\1\162\1\uffff\1\143\1\172\1\162\1\141\1\157\1\141\1\157\1\145\1\154\1\162\1\164\1\172\1\161\1\163\1\uffff\1\157\1\172\3\uffff\1\157\1\162\1\147\1\161\1\143\1\156\1\172\1\157\1\uffff\1\144\1\172\1\uffff\2\162\1\157\1\151\1\164\1\uffff\2\172\1\143\1\156\1\172\1\166\1\150\1\156\1\141\1\uffff\1\172\1\143\1\172\1\uffff\1\143\1\141\1\157\1\165\1\157\1\143\1\uffff\1\172\1\151\1\uffff\2\157\1\172\1\164\1\145\2\uffff\1\141\1\164\1\uffff\2\141\1\145\1\172\1\uffff\1\172\1\uffff\1\145\1\172\1\162\1\141\1\154\1\141\1\uffff\2\155\1\172\1\uffff\1\155\1\162\1\163\1\157\3\172\2\uffff\1\144\1\uffff\1\151\1\156\1\150\1\157\1\145\1\160\1\uffff\1\157\1\172\1\157\2\172\3\uffff\1\151\2\164\1\141\1\172\1\156\1\141\2\172\1\uffff\1\172\2\uffff\2\155\1\157\1\172\1\uffff\1\164\1\172\3\uffff\1\145\1\157\1\172\1\uffff\1\157\1\uffff\1\156\1\172\1\uffff\1\172\1\164\2\uffff\1\157\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\22\uffff\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\uffff\1\71\1\72\1\74\2\uffff\1\101\2\uffff\1\106\1\107\3\uffff\1\101\13\uffff\1\76\11\uffff\1\50\1\51\1\52\1\73\1\53\1\75\1\uffff\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\104\1\105\1\70\1\71\1\72\1\74\1\77\1\102\1\100\1\uffff\1\103\1\106\6\uffff\1\56\11\uffff\1\54\12\uffff\1\57\4\uffff\1\55\15\uffff\1\46\16\uffff\1\43\2\uffff\1\44\1\45\1\47\10\uffff\1\37\2\uffff\1\41\5\uffff\1\36\11\uffff\1\42\3\uffff\1\40\6\uffff\1\32\2\uffff\1\33\5\uffff\1\27\1\30\2\uffff\1\31\4\uffff\1\34\1\uffff\1\35\6\uffff\1\23\3\uffff\1\24\7\uffff\1\26\1\25\1\uffff\1\20\6\uffff\1\21\5\uffff\1\17\1\16\1\22\11\uffff\1\13\1\uffff\1\14\1\15\4\uffff\1\11\2\uffff\1\7\1\10\1\12\3\uffff\1\5\1\uffff\1\6\2\uffff\1\4\2\uffff\1\2\1\3\2\uffff\1\1";
    static final String DFA12_specialS =
        "\1\2\40\uffff\1\0\1\1\u0100\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\44\2\43\2\44\1\43\22\44\1\43\1\44\1\41\2\44\1\22\1\23\1\42\1\24\1\25\1\26\1\27\1\30\1\31\1\44\1\32\12\37\1\33\1\34\1\17\1\35\1\20\2\44\1\4\1\40\1\5\1\21\1\7\1\1\2\40\1\3\2\40\1\13\1\11\1\14\1\6\1\2\1\40\1\10\1\12\2\40\1\16\1\40\1\15\2\40\3\44\1\36\1\40\1\44\1\4\1\40\1\5\1\21\1\7\1\1\2\40\1\3\2\40\1\13\1\11\1\14\1\6\1\2\1\40\1\10\1\12\2\40\1\16\1\40\1\15\2\40\uff85\44",
            "\1\47\7\uffff\1\45\13\uffff\1\46\13\uffff\1\47\7\uffff\1\45\13\uffff\1\46",
            "\1\52\7\uffff\1\53\10\uffff\1\51\16\uffff\1\52\7\uffff\1\53\10\uffff\1\51",
            "\1\54\37\uffff\1\54",
            "\1\55\7\uffff\1\56\27\uffff\1\55\7\uffff\1\56",
            "\1\57\15\uffff\1\60\21\uffff\1\57\15\uffff\1\60",
            "\1\61\37\uffff\1\61",
            "\12\50\7\uffff\15\50\1\62\4\50\1\63\7\50\4\uffff\1\50\1\uffff\15\50\1\62\4\50\1\63\7\50",
            "\1\66\3\uffff\1\65\33\uffff\1\66\3\uffff\1\65",
            "\1\67\15\uffff\1\70\21\uffff\1\67\15\uffff\1\70",
            "\1\71\37\uffff\1\71",
            "\1\72\37\uffff\1\72",
            "\1\73\37\uffff\1\73",
            "\1\74\37\uffff\1\74",
            "\1\75\37\uffff\1\75",
            "\1\76\17\uffff\1\77\1\100",
            "\1\102",
            "\1\104\37\uffff\1\104",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\115\4\uffff\1\116",
            "",
            "",
            "",
            "\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\125\1\uffff\12\126",
            "",
            "\0\127",
            "\0\127",
            "",
            "",
            "\1\131\37\uffff\1\131",
            "\1\132\37\uffff\1\132",
            "\1\133\37\uffff\1\133",
            "",
            "\1\134\37\uffff\1\134",
            "\1\136\1\135\36\uffff\1\136\1\135",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\141\12\uffff\1\140\24\uffff\1\141\12\uffff\1\140",
            "\1\142\37\uffff\1\142",
            "\1\143\37\uffff\1\143",
            "\1\144\1\145\36\uffff\1\144\1\145",
            "\1\146\2\uffff\1\147\34\uffff\1\146\2\uffff\1\147",
            "\12\50\7\uffff\23\50\1\150\6\50\4\uffff\1\50\1\uffff\23\50\1\150\6\50",
            "\1\152\2\uffff\1\153\34\uffff\1\152\2\uffff\1\153",
            "\1\154\37\uffff\1\154",
            "",
            "\1\157\16\uffff\1\156\3\uffff\1\155\14\uffff\1\157\16\uffff\1\156\3\uffff\1\155",
            "\1\160\37\uffff\1\160",
            "\1\161\37\uffff\1\161",
            "\1\162\37\uffff\1\162",
            "\12\50\7\uffff\15\50\1\163\14\50\4\uffff\1\50\1\uffff\15\50\1\163\14\50",
            "\1\165\37\uffff\1\165",
            "\1\166\37\uffff\1\166",
            "\1\167\37\uffff\1\167",
            "\1\170\37\uffff\1\170",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\125\1\uffff\12\126",
            "",
            "",
            "\1\173\3\uffff\1\174\1\175\11\uffff\1\172\2\uffff\1\176\15\uffff\1\173\3\uffff\1\174\1\175\11\uffff\1\172\2\uffff\1\176",
            "\1\177\37\uffff\1\177",
            "\1\u0080\37\uffff\1\u0080",
            "\1\u0081\37\uffff\1\u0081",
            "\1\u0082\37\uffff\1\u0082",
            "\1\u0083\37\uffff\1\u0083",
            "",
            "\1\u0084\37\uffff\1\u0084",
            "\1\u0085\37\uffff\1\u0085",
            "\1\u0086\37\uffff\1\u0086",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0088\37\uffff\1\u0088",
            "\1\u0089\37\uffff\1\u0089",
            "\1\u008a\37\uffff\1\u008a",
            "\1\u008b\37\uffff\1\u008b",
            "\1\u008c\37\uffff\1\u008c",
            "",
            "\1\u008d\37\uffff\1\u008d",
            "\1\u008e\37\uffff\1\u008e",
            "\1\u0090\2\uffff\1\u008f\34\uffff\1\u0090\2\uffff\1\u008f",
            "\1\u0091\37\uffff\1\u0091",
            "\1\u0092\37\uffff\1\u0092",
            "\1\u0093\37\uffff\1\u0093",
            "\1\u0094\37\uffff\1\u0094",
            "\1\u0095\37\uffff\1\u0095",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0097\37\uffff\1\u0097",
            "",
            "\1\u0098\37\uffff\1\u0098",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u009d\20\uffff\1\u009c\16\uffff\1\u009d\20\uffff\1\u009c",
            "\1\u009e\37\uffff\1\u009e",
            "\1\u009f\4\uffff\1\u00a0\32\uffff\1\u009f\4\uffff\1\u00a0",
            "\1\u00a1\37\uffff\1\u00a1",
            "\1\u00a2\37\uffff\1\u00a2",
            "\1\u00a3\37\uffff\1\u00a3",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a5\37\uffff\1\u00a5",
            "\1\u00a6\37\uffff\1\u00a6",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a9\10\uffff\1\u00a8\26\uffff\1\u00a9\10\uffff\1\u00a8",
            "\1\u00aa\37\uffff\1\u00aa",
            "\1\u00ab\37\uffff\1\u00ab",
            "",
            "\1\u00ac\37\uffff\1\u00ac",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ae\37\uffff\1\u00ae",
            "\1\u00af\37\uffff\1\u00af",
            "\1\u00b0\37\uffff\1\u00b0",
            "\1\u00b1\37\uffff\1\u00b1",
            "\1\u00b2\37\uffff\1\u00b2",
            "\1\u00b3\37\uffff\1\u00b3",
            "\1\u00b4\37\uffff\1\u00b4",
            "\1\u00b5\37\uffff\1\u00b5",
            "\1\u00b6\37\uffff\1\u00b6",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00b8\37\uffff\1\u00b8",
            "\1\u00b9\37\uffff\1\u00b9",
            "",
            "\1\u00ba\37\uffff\1\u00ba",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "\1\u00bc\37\uffff\1\u00bc",
            "\1\u00bd\37\uffff\1\u00bd",
            "\1\u00be\37\uffff\1\u00be",
            "\1\u00bf\37\uffff\1\u00bf",
            "\1\u00c0\37\uffff\1\u00c0",
            "\1\u00c1\37\uffff\1\u00c1",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00c3\37\uffff\1\u00c3",
            "",
            "\1\u00c4\37\uffff\1\u00c4",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00c6\37\uffff\1\u00c6",
            "\1\u00c7\37\uffff\1\u00c7",
            "\1\u00c8\37\uffff\1\u00c8",
            "\1\u00c9\37\uffff\1\u00c9",
            "\1\u00ca\37\uffff\1\u00ca",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00cd\37\uffff\1\u00cd",
            "\1\u00ce\37\uffff\1\u00ce",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d0\37\uffff\1\u00d0",
            "\1\u00d1\37\uffff\1\u00d1",
            "\1\u00d2\37\uffff\1\u00d2",
            "\1\u00d3\37\uffff\1\u00d3",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d5\37\uffff\1\u00d5",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00d7\37\uffff\1\u00d7",
            "\1\u00d8\37\uffff\1\u00d8",
            "\1\u00d9\37\uffff\1\u00d9",
            "\1\u00da\37\uffff\1\u00da",
            "\1\u00db\37\uffff\1\u00db",
            "\1\u00dc\37\uffff\1\u00dc",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00de\37\uffff\1\u00de",
            "",
            "\1\u00df\37\uffff\1\u00df",
            "\1\u00e0\37\uffff\1\u00e0",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00e2\37\uffff\1\u00e2",
            "\1\u00e3\37\uffff\1\u00e3",
            "",
            "",
            "\1\u00e4\37\uffff\1\u00e4",
            "\1\u00e5\37\uffff\1\u00e5",
            "",
            "\1\u00e6\37\uffff\1\u00e6",
            "\1\u00e7\37\uffff\1\u00e7",
            "\1\u00e8\37\uffff\1\u00e8",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00eb\37\uffff\1\u00eb",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ed\37\uffff\1\u00ed",
            "\1\u00ee\37\uffff\1\u00ee",
            "\1\u00ef\37\uffff\1\u00ef",
            "\1\u00f0\37\uffff\1\u00f0",
            "",
            "\1\u00f1\37\uffff\1\u00f1",
            "\1\u00f2\37\uffff\1\u00f2",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00f4\37\uffff\1\u00f4",
            "\1\u00f5\37\uffff\1\u00f5",
            "\1\u00f6\37\uffff\1\u00f6",
            "\1\u00f7\37\uffff\1\u00f7",
            "\12\50\7\uffff\13\50\1\u00f8\16\50\4\uffff\1\50\1\uffff\13\50\1\u00f8\16\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u00fc\37\uffff\1\u00fc",
            "",
            "\1\u00fd\37\uffff\1\u00fd",
            "\1\u00fe\37\uffff\1\u00fe",
            "\1\u00ff\37\uffff\1\u00ff",
            "\1\u0100\37\uffff\1\u0100",
            "\1\u0101\37\uffff\1\u0101",
            "\1\u0102\37\uffff\1\u0102",
            "",
            "\1\u0103\37\uffff\1\u0103",
            "\12\50\7\uffff\4\50\1\u0104\25\50\4\uffff\1\50\1\uffff\4\50\1\u0104\25\50",
            "\1\u0106\37\uffff\1\u0106",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "\1\u0109\37\uffff\1\u0109",
            "\1\u010a\37\uffff\1\u010a",
            "\1\u010b\37\uffff\1\u010b",
            "\1\u010c\37\uffff\1\u010c",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u010e\37\uffff\1\u010e",
            "\1\u010f\37\uffff\1\u010f",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u0113\37\uffff\1\u0113",
            "\1\u0114\37\uffff\1\u0114",
            "\1\u0115\37\uffff\1\u0115",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0117\37\uffff\1\u0117",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "\1\u0119\37\uffff\1\u0119",
            "\1\u011a\37\uffff\1\u011a",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u011c\37\uffff\1\u011c",
            "",
            "\1\u011d\37\uffff\1\u011d",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0120\37\uffff\1\u0120",
            "",
            "",
            "\1\u0121\37\uffff\1\u0121",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Fimprocedimento | Fimalgoritmo | Procedimento | Fimenquanto | Fimescolha | Interrompa | Algoritmo | Caractere | Fimfuncao | Outrocaso | Caracter | Enquanto | Escreval | Escolha | Escreva | Fimpara | Inteiro | Retorne | Funcao | Inicio | Maiusc | Repita | Compr | Copia | Entao | Fimse | Passo | Raizq | Senao | Caso | Faca | Leia | Para | Real | MOD | NOT | XOU | Ate | Var | LessThanSignHyphenMinus | LessThanSignEqualsSign | LessThanSignGreaterThanSign | GreaterThanSignEqualsSign | OU | De | Pi | Se | PercentSign | Ampersand | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | E | CircumflexAccent | RULE_FLOAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_33 = input.LA(1);

                        s = -1;
                        if ( ((LA12_33>='\u0000' && LA12_33<='\uFFFF')) ) {s = 87;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_34 = input.LA(1);

                        s = -1;
                        if ( ((LA12_34>='\u0000' && LA12_34<='\uFFFF')) ) {s = 87;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='F'||LA12_0=='f') ) {s = 1;}

                        else if ( (LA12_0=='P'||LA12_0=='p') ) {s = 2;}

                        else if ( (LA12_0=='I'||LA12_0=='i') ) {s = 3;}

                        else if ( (LA12_0=='A'||LA12_0=='a') ) {s = 4;}

                        else if ( (LA12_0=='C'||LA12_0=='c') ) {s = 5;}

                        else if ( (LA12_0=='O'||LA12_0=='o') ) {s = 6;}

                        else if ( (LA12_0=='E'||LA12_0=='e') ) {s = 7;}

                        else if ( (LA12_0=='R'||LA12_0=='r') ) {s = 8;}

                        else if ( (LA12_0=='M'||LA12_0=='m') ) {s = 9;}

                        else if ( (LA12_0=='S'||LA12_0=='s') ) {s = 10;}

                        else if ( (LA12_0=='L'||LA12_0=='l') ) {s = 11;}

                        else if ( (LA12_0=='N'||LA12_0=='n') ) {s = 12;}

                        else if ( (LA12_0=='X'||LA12_0=='x') ) {s = 13;}

                        else if ( (LA12_0=='V'||LA12_0=='v') ) {s = 14;}

                        else if ( (LA12_0=='<') ) {s = 15;}

                        else if ( (LA12_0=='>') ) {s = 16;}

                        else if ( (LA12_0=='D'||LA12_0=='d') ) {s = 17;}

                        else if ( (LA12_0=='%') ) {s = 18;}

                        else if ( (LA12_0=='&') ) {s = 19;}

                        else if ( (LA12_0=='(') ) {s = 20;}

                        else if ( (LA12_0==')') ) {s = 21;}

                        else if ( (LA12_0=='*') ) {s = 22;}

                        else if ( (LA12_0=='+') ) {s = 23;}

                        else if ( (LA12_0==',') ) {s = 24;}

                        else if ( (LA12_0=='-') ) {s = 25;}

                        else if ( (LA12_0=='/') ) {s = 26;}

                        else if ( (LA12_0==':') ) {s = 27;}

                        else if ( (LA12_0==';') ) {s = 28;}

                        else if ( (LA12_0=='=') ) {s = 29;}

                        else if ( (LA12_0=='^') ) {s = 30;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 31;}

                        else if ( (LA12_0=='B'||(LA12_0>='G' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='K')||LA12_0=='Q'||(LA12_0>='T' && LA12_0<='U')||LA12_0=='W'||(LA12_0>='Y' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||LA12_0=='q'||(LA12_0>='t' && LA12_0<='u')||LA12_0=='w'||(LA12_0>='y' && LA12_0<='z')) ) {s = 32;}

                        else if ( (LA12_0=='\"') ) {s = 33;}

                        else if ( (LA12_0=='\'') ) {s = 34;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 35;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='$')||LA12_0=='.'||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}