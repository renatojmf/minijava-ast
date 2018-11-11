// Generated from C:/Users/Renato/Desktop/compiladores/atividade4/if688.github.io/atividades/04-MiniJavaAST\gramatica.g4 by ANTLR 4.7
package br.ufpe.cin.if688.minijava.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(gramaticaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(gramaticaParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classDeclExtends}
	 * labeled alternative in {@link gramaticaParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclExtends(gramaticaParser.ClassDeclExtendsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDeclExtends}
	 * labeled alternative in {@link gramaticaParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclExtends(gramaticaParser.ClassDeclExtendsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classDeclSimple}
	 * labeled alternative in {@link gramaticaParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclSimple(gramaticaParser.ClassDeclSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDeclSimple}
	 * labeled alternative in {@link gramaticaParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclSimple(gramaticaParser.ClassDeclSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(gramaticaParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(gramaticaParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(gramaticaParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(gramaticaParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(gramaticaParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(gramaticaParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(gramaticaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(gramaticaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block}
	 * labeled alternative in {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock(gramaticaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block}
	 * labeled alternative in {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock(gramaticaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(gramaticaParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(gramaticaParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code syso}
	 * labeled alternative in {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSyso(gramaticaParser.SysoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code syso}
	 * labeled alternative in {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSyso(gramaticaParser.SysoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(gramaticaParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(gramaticaParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAssign}
	 * labeled alternative in {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssign(gramaticaParser.ArrayAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAssign}
	 * labeled alternative in {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssign(gramaticaParser.ArrayAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign(gramaticaParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign(gramaticaParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code novoArray}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNovoArray(gramaticaParser.NovoArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code novoArray}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNovoArray(gramaticaParser.NovoArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inteiro}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterInteiro(gramaticaParser.InteiroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inteiro}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitInteiro(gramaticaParser.InteiroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code false}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFalse(gramaticaParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code false}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFalse(gramaticaParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code this}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterThis(gramaticaParser.ThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code this}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitThis(gramaticaParser.ThisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLookup}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterArrayLookup(gramaticaParser.ArrayLookupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLookup}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitArrayLookup(gramaticaParser.ArrayLookupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code call}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCall(gramaticaParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code call}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCall(gramaticaParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLength}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterArrayLength(gramaticaParser.ArrayLengthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLength}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitArrayLength(gramaticaParser.ArrayLengthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenteses}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParenteses(gramaticaParser.ParentesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenteses}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParenteses(gramaticaParser.ParentesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newObject}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNewObject(gramaticaParser.NewObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newObject}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNewObject(gramaticaParser.NewObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operacao}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOperacao(gramaticaParser.OperacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operacao}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOperacao(gramaticaParser.OperacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code true}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTrue(gramaticaParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code true}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTrue(gramaticaParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterId(gramaticaParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitId(gramaticaParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negacao}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNegacao(gramaticaParser.NegacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negacao}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNegacao(gramaticaParser.NegacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(gramaticaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(gramaticaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(gramaticaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(gramaticaParser.ArgsContext ctx);
}