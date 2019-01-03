package com.designpattern.behaviour.visitor;

public class Computer implements ComputerPart {
	ComputerPart[] parts;
	

	public Computer() {
		parts=new ComputerPart[] {new Mouse(),new KeyBoard(),new Monitor()};
	}


	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		// TODO Auto-generated method stub
		for(ComputerPart comp:parts) {
			comp.accept(computerPartVisitor);
		}
computerPartVisitor.visit(this);
	}

}
