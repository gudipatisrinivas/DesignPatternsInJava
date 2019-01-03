package com.designpattern.behaviour.visitor;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);

}
