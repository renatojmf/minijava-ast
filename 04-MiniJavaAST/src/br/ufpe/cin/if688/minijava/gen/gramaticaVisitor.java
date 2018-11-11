// Generated from C:/Users/Renato/Desktop/compiladores/atividade4/if688.github.io/atividades/04-MiniJavaAST\gramatica.g4 by ANTLR 4.7
package br.ufpe.cin.if688.minijava.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(gramaticaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(gramaticaParser.MainClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDeclExtends}
	 * labeled alternative in {@link gramaticaParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclExtends(gramaticaParser.ClassDeclExtendsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDeclSimple}
	 * labeled alternative in {@link gramaticaParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclSimple(gramaticaParser.ClassDeclSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(gramaticaParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(gramaticaParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal(gramaticaParser.FormalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(gramaticaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block}
	 * labeled alternative in {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(gramaticaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(gramaticaParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code syso}
	 * labeled alternative in {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyso(gramaticaParser.SysoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(gramaticaParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAssign}
	 * labeled alternative in {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssign(gramaticaParser.ArrayAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(gramaticaParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code novoArray}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNovoArray(gramaticaParser.NovoArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inteiro}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteiro(gramaticaParser.InteiroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(gramaticaParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code this}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThis(gramaticaParser.ThisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLookup}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLookup(gramaticaParser.ArrayLookupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code call}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(gramaticaParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLength}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLength(gramaticaParser.ArrayLengthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenteses}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenteses(gramaticaParser.ParentesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newObject}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObject(gramaticaParser.NewObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operacao}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacao(gramaticaParser.OperacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(gramaticaParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(gramaticaParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negacao}
	 * labeled alternative in {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegacao(gramaticaParser.NegacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(gramaticaParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(gramaticaParser.ArgsContext ctx);
}