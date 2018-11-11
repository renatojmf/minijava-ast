package br.ufpe.cin.if688.minijava.main;

import br.ufpe.cin.if688.minijava.ast.BooleanType;
import br.ufpe.cin.if688.minijava.ast.ClassDeclExtends;
import br.ufpe.cin.if688.minijava.ast.ClassDeclList;
import br.ufpe.cin.if688.minijava.ast.ClassDeclSimple;
import br.ufpe.cin.if688.minijava.ast.Identifier;
import br.ufpe.cin.if688.minijava.ast.IdentifierType;
import br.ufpe.cin.if688.minijava.ast.IntegerLiteral;
import br.ufpe.cin.if688.minijava.ast.IntegerType;
import br.ufpe.cin.if688.minijava.ast.MainClass;
import br.ufpe.cin.if688.minijava.ast.MethodDeclList;
import br.ufpe.cin.if688.minijava.ast.Print;
import br.ufpe.cin.if688.minijava.ast.Program;
import br.ufpe.cin.if688.minijava.ast.VarDecl;
import br.ufpe.cin.if688.minijava.ast.VarDeclList;
import br.ufpe.cin.if688.minijava.gen.gramaticaLexer;
import br.ufpe.cin.if688.minijava.gen.gramaticaParser;
import br.ufpe.cin.if688.minijava.gen.grammaVisitor;
import br.ufpe.cin.if688.minijava.visitor.PrettyPrintVisitor;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.TokenStream;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		/*MainClass main = new MainClass(
				new Identifier("Teste"), 
				new Identifier("Testando"), 
				new Print(new IntegerLiteral(2))
		);
		
		VarDeclList vdl1 = new VarDeclList();
		vdl1.addElement(new VarDecl(
			new BooleanType(),
			new Identifier("flag")
		));
		vdl1.addElement(new VarDecl(
				new IntegerType(),
				new Identifier("num")
		));
		
		MethodDeclList mdl = new MethodDeclList();
		
		ClassDeclSimple A = new ClassDeclSimple(
					new Identifier("A"), vdl1, mdl
		);
		
		ClassDeclExtends B = new ClassDeclExtends(
				new Identifier("B"), new Identifier("A"), 
				new VarDeclList(), new MethodDeclList()
		);
		
		VarDeclList vdl2 = new VarDeclList();
		vdl2.addElement(new VarDecl(
				new IdentifierType("A"),
				new Identifier("obj")
		));
		ClassDeclSimple C = new ClassDeclSimple(
				new Identifier("C"), vdl2, new MethodDeclList()
		);
		
		ClassDeclList cdl = new ClassDeclList();
		cdl.addElement(A);
		cdl.addElement(B);
		cdl.addElement(C);

		Program p = new Program(main, cdl);*/
		try {
			grammaVisitor gv = new grammaVisitor();
			CharStream cs = CharStreams.fromFileName("C:\\Users\\Renato\\Desktop\\compiladores\\atividade4\\if688.github.io\\atividades\\04-MiniJavaAST\\input.txt");
			gramaticaLexer lexer = new gramaticaLexer(cs);
			TokenStream tokenStream = new BufferedTokenStream(lexer);
			gramaticaParser parser = new gramaticaParser(tokenStream);

			gramaticaParser.ProgramContext program = parser.program();
			Program p = (Program) gv.visitProgram(program);
			PrettyPrintVisitor ppv = new PrettyPrintVisitor();
			ppv.visit(p);
		} catch(IOException e) {
			System.err.println("Erro ao abrir arquivo!");
			e.printStackTrace();
			System.exit(1);
		}
		//PrettyPrintVisitor ppv = new PrettyPrintVisitor();
		//ppv.visit(p);
	}

}
