/*
 * generated by Xtext 2.9.0
 */
lexer grammar InternalPortugolLexer;

@header {
package org.hopper.language.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

Fimprocedimento : ('F'|'f')('I'|'i')('M'|'m')('P'|'p')('R'|'r')('O'|'o')('C'|'c')('E'|'e')('D'|'d')('I'|'i')('M'|'m')('E'|'e')('N'|'n')('T'|'t')('O'|'o');

Fimalgoritmo : ('F'|'f')('I'|'i')('M'|'m')('A'|'a')('L'|'l')('G'|'g')('O'|'o')('R'|'r')('I'|'i')('T'|'t')('M'|'m')('O'|'o');

Procedimento : ('P'|'p')('R'|'r')('O'|'o')('C'|'c')('E'|'e')('D'|'d')('I'|'i')('M'|'m')('E'|'e')('N'|'n')('T'|'t')('O'|'o');

Fimenquanto : ('F'|'f')('I'|'i')('M'|'m')('E'|'e')('N'|'n')('Q'|'q')('U'|'u')('A'|'a')('N'|'n')('T'|'t')('O'|'o');

Fimescolha : ('F'|'f')('I'|'i')('M'|'m')('E'|'e')('S'|'s')('C'|'c')('O'|'o')('L'|'l')('H'|'h')('A'|'a');

Interrompa : ('I'|'i')('N'|'n')('T'|'t')('E'|'e')('R'|'r')('R'|'r')('O'|'o')('M'|'m')('P'|'p')('A'|'a');

Algoritmo : ('A'|'a')('L'|'l')('G'|'g')('O'|'o')('R'|'r')('I'|'i')('T'|'t')('M'|'m')('O'|'o');

Caractere : ('C'|'c')('A'|'a')('R'|'r')('A'|'a')('C'|'c')('T'|'t')('E'|'e')('R'|'r')('E'|'e');

Fimfuncao : ('F'|'f')('I'|'i')('M'|'m')('F'|'f')('U'|'u')('N'|'n')('C'|'c')('A'|'a')('O'|'o');

Outrocaso : ('O'|'o')('U'|'u')('T'|'t')('R'|'r')('O'|'o')('C'|'c')('A'|'a')('S'|'s')('O'|'o');

Caracter : ('C'|'c')('A'|'a')('R'|'r')('A'|'a')('C'|'c')('T'|'t')('E'|'e')('R'|'r');

Enquanto : ('E'|'e')('N'|'n')('Q'|'q')('U'|'u')('A'|'a')('N'|'n')('T'|'t')('O'|'o');

Escreval : ('E'|'e')('S'|'s')('C'|'c')('R'|'r')('E'|'e')('V'|'v')('A'|'a')('L'|'l');

Escolha : ('E'|'e')('S'|'s')('C'|'c')('O'|'o')('L'|'l')('H'|'h')('A'|'a');

Escreva : ('E'|'e')('S'|'s')('C'|'c')('R'|'r')('E'|'e')('V'|'v')('A'|'a');

Fimpara : ('F'|'f')('I'|'i')('M'|'m')('P'|'p')('A'|'a')('R'|'r')('A'|'a');

Inteiro : ('I'|'i')('N'|'n')('T'|'t')('E'|'e')('I'|'i')('R'|'r')('O'|'o');

Retorne : ('R'|'r')('E'|'e')('T'|'t')('O'|'o')('R'|'r')('N'|'n')('E'|'e');

Funcao : ('F'|'f')('U'|'u')('N'|'n')('C'|'c')('A'|'a')('O'|'o');

Inicio : ('I'|'i')('N'|'n')('I'|'i')('C'|'c')('I'|'i')('O'|'o');

Repita : ('R'|'r')('E'|'e')('P'|'p')('I'|'i')('T'|'t')('A'|'a');

Entao : ('E'|'e')('N'|'n')('T'|'t')('A'|'a')('O'|'o');

Fimse : ('F'|'f')('I'|'i')('M'|'m')('S'|'s')('E'|'e');

Passo : ('P'|'p')('A'|'a')('S'|'s')('S'|'s')('O'|'o');

Senao : ('S'|'s')('E'|'e')('N'|'n')('A'|'a')('O'|'o');

Caso : ('C'|'c')('A'|'a')('S'|'s')('O'|'o');

Faca : ('F'|'f')('A'|'a')('C'|'c')('A'|'a');

Leia : ('L'|'l')('E'|'e')('I'|'i')('A'|'a');

Para : ('P'|'p')('A'|'a')('R'|'r')('A'|'a');

Real : ('R'|'r')('E'|'e')('A'|'a')('L'|'l');

MOD : ('M'|'m')('O'|'o')('D'|'d');

NOT : ('N'|'n')('O'|'o')('T'|'t');

XOU : ('X'|'x')('O'|'o')('U'|'u');

Ate : ('A'|'a')('T'|'t')('E'|'e');

Var : ('V'|'v')('A'|'a')('R'|'r');

LessThanSignHyphenMinus : '<''-';

LessThanSignEqualsSign : '<''=';

LessThanSignGreaterThanSign : '<''>';

GreaterThanSignEqualsSign : '>''=';

OU : ('O'|'o')('U'|'u');

De : ('D'|'d')('E'|'e');

Se : ('S'|'s')('E'|'e');

PercentSign : '%';

Ampersand : '&';

LeftParenthesis : '(';

RightParenthesis : ')';

Asterisk : '*';

PlusSign : '+';

Comma : ',';

HyphenMinus : '-';

Solidus : '/';

Colon : ':';

Semicolon : ';';

LessThanSign : '<';

EqualsSign : '=';

GreaterThanSign : '>';

E : ('E'|'e');

CircumflexAccent : '^';

// Rules duplicated to allow inter-rule references

RULE_FLOAT : RULE_INT '.' RULE_INT;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
