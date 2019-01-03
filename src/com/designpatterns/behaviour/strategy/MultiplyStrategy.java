package com.designpatterns.behaviour.strategy;

public class MultiplyStrategy implements Strategy {

	@Override
	public void execute(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println("num1" + num1 + 
				"num2" + num2 + "Num1 and Num2" 
				+( num1 * num2));



	}

}
