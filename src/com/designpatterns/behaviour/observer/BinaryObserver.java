package com.designpatterns.behaviour.observer;

public class BinaryObserver extends Observer {
	
	public BinaryObserver(Subject sub) {
		this.subject=sub;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Change in "
				+ " the Status Binary Design Pattern\t"
		+Integer.toBinaryString(this.subject.getState()));

	}

}
