grammar gramatica;

program : mainClass classDecl* EOF;
mainClass : 'class' identifier '{' 'public' 'static' ('Void' | 'void') 'main' '(' 'String' '[' ']' identifier ')' '{' statement '}' '}';

classDecl : 'class' identifier 'extends' identifier '{' varDecl* methodDecl* '}' #classDeclExtends
          | 'class' identifier '{' varDecl* methodDecl* '}'  #classDeclSimple;

varDecl : type identifier ';' ;
methodDecl : 'public' type identifier '(' formal* ')' '{' varDecl* statement* 'return' exp ';' '}' ;
formal : type identifier','? ;
type : 'boolean'
     | 'int'
     | 'int' '[' ']'
     | identifier;

statement : '{' statement* '}' #block
          | 'if' '(' exp ')' statement 'else' statement #if
          | 'System' '.' 'out' '.' 'println' '(' exp ')' ';' #syso
          | 'while' '(' exp ')' statement #while
          | identifier '[' exp ']' '=' exp ';' #arrayAssign
          | identifier '=' exp ';' #assign;

exp : 'false' #false
    | 'true' #true
    | INTEGER #inteiro
    | ID #id
    | 'new' 'int' '[' exp ']' #novoArray
    | 'new' identifier '(' ')' #newObject
    | '!' exp #negacao
    | 'this' #this
    | '(' exp ')' #parenteses
    | exp OPERADORES exp #operacao
    | exp '.' 'length' #arrayLength
    | exp '[' exp ']' #arrayLookup
    | exp '.' identifier '(' args* ')' #call;

identifier : ID;
args : exp | exp ',' ;

ID : (LETRAS | [_])(LETRAS | [_] | DIGITO)* ;
LETRAS : [A-Za-z];
INTEGER : [0] | ([1-9]) (DIGITO)*;
DIGITO : [0-9];
WHITESPACE : ((' ' | '\n' | '\t' | '\r' | '\f')) -> skip;
COMENTARIOS : (('/*' (COMENTARIOS|.)*? '\'') | ('//' (.)*? '\n')) -> skip;
OPERADORES : '&&' | '<' | '+' | '-' | '*';