package com.designpatterns.behaviour.strategy;

public class StrategyImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context=new Context(new AddStrategy());
		context.doOperation(2, 3);
		Context context1=new Context(new SubtractStrategy());
		context1.doOperation(10, 3);
		Context context2=new Context(new MultiplyStrategy());
		context2.doOperation(21, 5);
	}

}
