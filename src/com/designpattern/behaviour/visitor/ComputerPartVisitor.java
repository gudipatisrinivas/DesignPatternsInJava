package com.designpattern.behaviour.visitor;

public interface ComputerPartVisitor {
	public void visit(Computer computerPart);
	public void visit(Mouse mousePart);
	public void visit(KeyBoard keyBoard);
	public void visit(Monitor monitor);
}
