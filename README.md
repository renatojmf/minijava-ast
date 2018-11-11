# minijava-ast
Analisador sintático para MiniJava, dê como entrada um código Java qualquer e veja o funcionamento do algoritmo.
O ANTLR foi utilizado para auxiliar a criação da AST por meio de uma gramática;

A gramática utilizada está no diretório 04-MiniJavaAST\gramatica.g4 
O visitor implementado está no diretório 04-MiniJavaAST\src\br\ufpe\cin\if688\minijava\gen\grammaVisitor.java

Para testar o programa bastar alterar o arquivo input.txt com o código desejado e alterar, no arquivo Main localizado em 04-MiniJavaAST\src\br\ufpe\cin\if688\minijava\main, o trecho CharStream cs = CharStreams.fromFileName() e adicionar o Path do input nesse trecho de código.