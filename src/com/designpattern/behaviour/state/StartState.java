package com.designpattern.behaviour.state;

public class StartState implements State{

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		System.out.println("Player is in Start State");
		context.setState(this);
		
	}

	@Override
	public String toString() {
		return "StartState []";
	}

}
