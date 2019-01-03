package com.designpatterns.behaviour.observer2;

public class BinaryObserver extends Observer {
	
	private Subject subject;

	public BinaryObserver(Subject subject) {
		super();
		this.subject = subject;
		subject.addObserver(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(subject.getState()));
		
	}

}
