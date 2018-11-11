package br.ufpe.cin.if688.minijava.gen;

import br.ufpe.cin.if688.minijava.ast.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class grammaVisitor implements gramaticaVisitor {
    @Override
    public Object visitProgram(gramaticaParser.ProgramContext ctx) {
        MainClass cl = (MainClass) ctx.mainClass().accept(this);
        ClassDeclList cdl = new ClassDeclList();
        for(int i = 0; i < ctx.classDecl().size(); i++){
            cdl.addElement((ClassDecl) ctx.classDecl(i).accept(this));
        }
        Program pg = new Program(cl, cdl);
        return pg;
    }
    @Override
    public Object visitMainClass(gramaticaParser.MainClassContext ctx) {
        Identifier i1, i2;
        Statement s;
        i1 = (Identifier) ctx.identifier(0).accept(this);
        i2 = (Identifier) ctx.identifier(1).accept(this);
        s = (Statement) ctx.statement().accept(this);

        MainClass cl = new MainClass(i1,i2,s);
        return cl;
    }

    @Override
    public Object visitClassDeclSimple(gramaticaParser.ClassDeclSimpleContext ctx) {
        Identifier i1;
        VarDeclList vdl = new VarDeclList();
        MethodDeclList mdl = new MethodDeclList();
        i1 = (Identifier) ctx.identifier().accept(this);
        for(int i = 0; i < ctx.varDecl().size(); i++){
            vdl.addElement((VarDecl) ctx.varDecl(i).accept(this));
        }
        for(int i = 0; i < ctx.methodDecl().size(); i++){
            mdl.addElement((MethodDecl) ctx.methodDecl(i).accept(this));
        }
        ClassDeclSimple cds = new ClassDeclSimple(i1,vdl,mdl);
        return cds;
    }

    @Override
    public Object visitClassDeclExtends(gramaticaParser.ClassDeclExtendsContext ctx) {
        Identifier i1,i2;
        VarDeclList vdl = new VarDeclList();
        MethodDeclList mdl = new MethodDeclList();

        i1 = (Identifier) ctx.identifier(0).accept(this);
        i2 = (Identifier) ctx.identifier(1).accept(this);

        for(int i = 0; i < ctx.varDecl().size(); i++){
            vdl.addElement((VarDecl) ctx.varDecl(i).accept(this));
        }
        for(int i = 0; i < ctx.methodDecl().size(); i++){
            mdl.addElement((MethodDecl) ctx.methodDecl(i).accept(this));
        }

        ClassDeclExtends cde = new ClassDeclExtends(i1,i2,vdl,mdl);
        return cde;
    }

    @Override
    public Object visitVarDecl(gramaticaParser.VarDeclContext ctx) {
        Type t1;
        Identifier i1;

        t1 = (Type) ctx.type().accept(this);
        i1 = (Identifier) ctx.identifier().accept(this);

        VarDecl vd = new VarDecl(t1,i1);
        return vd;
    }

    @Override
    public Object visitMethodDecl(gramaticaParser.MethodDeclContext ctx) {
        Type t1;
        Identifier i1;
        FormalList fl = new FormalList();
        VarDeclList vdl = new VarDeclList();
        StatementList sl = new StatementList();
        Exp e;

        t1 = (Type) ctx.type().accept(this);
        i1 = (Identifier) ctx.identifier().accept(this);
        e = (Exp) ctx.exp().accept(this);

        for(int i = 0; i < ctx.varDecl().size(); i++){
            vdl.addElement((VarDecl) ctx.varDecl(i).accept(this));
        }
        for(int i = 0; i < ctx.formal().size(); i++){
            fl.addElement((Formal) ctx.formal(i).accept(this));
        }
        for(int i = 0; i < ctx.statement().size(); i++){
            sl.addElement((Statement) ctx.statement(i).accept(this));
        }

        MethodDecl ml = new MethodDecl(t1,i1,fl,vdl,sl,e);
        return ml;
    }

    @Override
    public Object visitFormal(gramaticaParser.FormalContext ctx) {
        Type t1;
        Identifier i1;

        t1 = (Type) ctx.type().accept(this);
        i1 = (Identifier) ctx.identifier().accept(this);

        Formal f = new Formal(t1,i1);
        return f;
    }

    @Override
    public Object visitType(gramaticaParser.TypeContext ctx) {
        if(ctx.getText().equals("boolean")){
            return new BooleanType();
        } else if(ctx.getText().equals("int")){
            return new IntegerType();
        } else if(ctx.getText().equals("int[]")){
            return new IntArrayType();
        } else {
            return new IdentifierType(ctx.getText());
        }
    }

    @Override
    public Object visitBlock(gramaticaParser.BlockContext ctx) {
        StatementList sl = new StatementList();
        for(int i = 0; i < ctx.statement().size(); i++){
            sl.addElement((Statement) ctx.statement(i).accept(this));
        }
        Block b = new Block(sl);
        return b;
    }

    @Override
    public Object visitIf(gramaticaParser.IfContext ctx) {
        Exp e;
        Statement s1,s2;
        e = (Exp) ctx.exp().accept(this);

        s1 = (Statement) ctx.statement(0).accept(this);
        s2 = (Statement) ctx.statement(1).accept(this);

        If i = new If(e,s1,s2);
        return i;
    }

    @Override
    public Object visitSyso(gramaticaParser.SysoContext ctx) {
        Exp e;
        e = (Exp) ctx.exp().accept(this);

        Print p = new Print(e);
        return p;
    }

    @Override
    public Object visitWhile(gramaticaParser.WhileContext ctx) {
        Exp e;
        Statement s;

        e = (Exp) ctx.exp().accept(this);
        s = (Statement) ctx.statement().accept(this);

        While w = new While(e,s);
        return w;
    }

    @Override
    public Object visitArrayAssign(gramaticaParser.ArrayAssignContext ctx) {
        Identifier i1;
        Exp e1,e2;

        i1 = (Identifier) ctx.identifier().accept(this);
        e1 = (Exp) ctx.exp(0).accept(this);
        e2 = (Exp) ctx.exp(1).accept(this);

        ArrayAssign aa = new ArrayAssign(i1,e1,e2);
        return aa;
    }

    @Override
    public Object visitAssign(gramaticaParser.AssignContext ctx) {
        Identifier i1;
        Exp e;

        i1 = (Identifier) ctx.identifier().accept(this);
        e = (Exp) ctx.exp().accept(this);

        Assign a = new Assign(i1,e);
        return a;
    }

    @Override
    public Object visitNovoArray(gramaticaParser.NovoArrayContext ctx) {
        Exp e;
        e = (Exp) ctx.exp().accept(this);

        NewArray na = new NewArray(e);
        return na;
    }

    @Override
    public Object visitInteiro(gramaticaParser.InteiroContext ctx) {
        return new IntegerLiteral(Integer.parseInt(ctx.getText()));
    }

    @Override
    public Object visitFalse(gramaticaParser.FalseContext ctx) {
        return new False();
    }

    @Override
    public Object visitThis(gramaticaParser.ThisContext ctx) {
        return new This();
    }

    @Override
    public Object visitArrayLookup(gramaticaParser.ArrayLookupContext ctx) {
        Exp e1,e2;
        e1 = (Exp) ctx.exp(0).accept(this);
        e2 = (Exp) ctx.exp(1).accept(this);

        ArrayLookup al = new ArrayLookup(e1,e2);
        return al;
    }

    @Override
    public Object visitCall(gramaticaParser.CallContext ctx) {
        Exp e;
        Identifier i1;
        ExpList el = new ExpList();

        e = (Exp) ctx.exp().accept(this);
        i1 = (Identifier) ctx.identifier().accept(this);

        for(int i = 0; i < ctx.args().size(); i++){
            el.addElement((Exp) ctx.args(i).accept(this));
        }

        Call c = new Call (e,i1,el);
        return c;
    }

    @Override
    public Object visitArrayLength(gramaticaParser.ArrayLengthContext ctx) {
        Exp e;
        e = (Exp) ctx.exp().accept(this);

        ArrayLength al = new ArrayLength(e);
        return al;
    }

    @Override
    public Object visitParenteses(gramaticaParser.ParentesesContext ctx) {
        return ctx.exp().accept(this);
    }

    @Override
    public Object visitNewObject(gramaticaParser.NewObjectContext ctx) {
        Identifier i1;
        i1 = (Identifier) ctx.identifier().accept(this);

        NewObject no = new NewObject(i1);
        return no;
    }

    @Override
    public Object visitOperacao(gramaticaParser.OperacaoContext ctx) {
        Exp e1,e2;
        e1 = (Exp) ctx.exp(0).accept(this);
        e2 = (Exp) ctx.exp(1).accept(this);

        if(ctx.OPERADORES().getText().equals("+")){
            Plus p = new Plus(e1,e2);
            return p;
        } else if(ctx.OPERADORES().getText().equals("-")){
            Minus m = new Minus(e1,e2);
            return m;
        } else if(ctx.OPERADORES().getText().equals("*")){
            Times t = new Times(e1,e2);
            return t;
        } else if (ctx.OPERADORES().getText().equals("&&")){
            And a = new And(e1,e2);
            return a;
        } else {
            LessThan lt = new LessThan(e1,e2);
            return lt;
        }
    }

    @Override
    public Object visitTrue(gramaticaParser.TrueContext ctx) {
        return new True();
    }

    @Override
    public Object visitId(gramaticaParser.IdContext ctx) {
        return new IdentifierExp(ctx.getText());
    }

    @Override
    public Object visitNegacao(gramaticaParser.NegacaoContext ctx) {
        Exp e = (Exp) ctx.exp().accept(this);
        Not n = new Not(e);
        return n;
    }

    @Override
    public Object visitIdentifier(gramaticaParser.IdentifierContext ctx) {
        return new Identifier(ctx.getText());
    }

    @Override
    public Object visitArgs(gramaticaParser.ArgsContext ctx) {
        return ctx.exp().accept(this);
    }

    @Override
    public Object visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
