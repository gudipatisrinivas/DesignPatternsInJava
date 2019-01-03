package com.designpattern.behaviour.visitor;

public class ComputerPartVisitorImpl implements ComputerPartVisitor {

	@Override
	public void visit(Computer computerPart) {
		// TODO Auto-generated method stub
		System.out.println("Computer Part Visitor");

	}

	@Override
	public void visit(Mouse mousePart) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Part Visitor");
	}

	@Override
	public void visit(KeyBoard keyBoard) {
		// TODO Auto-generated method stub
		System.out.println("KeyBoard Part Visitor");

	}

	@Override
	public void visit(Monitor monitor) {
		// TODO Auto-generated method stub
		System.out.println("monitor Part Visitor");

	}

}
