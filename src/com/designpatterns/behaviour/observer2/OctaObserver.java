package com.designpatterns.behaviour.observer2;

public class OctaObserver extends Observer{
	private Subject subject;

	public OctaObserver(Subject subject) {
		super();
		this.subject = subject;
		subject.addObserver(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(Integer.toOctalString(subject.getState()));
		
	}


}
