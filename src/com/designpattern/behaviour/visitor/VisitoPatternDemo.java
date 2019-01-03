package com.designpattern.behaviour.visitor;

public class VisitoPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerPart computer=new Computer();
		computer.accept(new ComputerPartVisitorImpl());
	}

}
