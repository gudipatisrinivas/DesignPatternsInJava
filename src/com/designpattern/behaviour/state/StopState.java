package com.designpattern.behaviour.state;

public class StopState implements State{

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		System.out.println("Player is in Stop State");
		context.setState(this);
		
	}

	@Override
	public String toString() {
		return "Stop State []";
	}

}
