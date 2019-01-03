package com.designpatterns.behaviour.observer2;

public class HexaObserver extends Observer{
	private Subject subject;

	public HexaObserver(Subject subject) {
		super();
		this.subject = subject;
		subject.addObserver(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(Integer.toHexString(subject.getState()));
		
	}


}
