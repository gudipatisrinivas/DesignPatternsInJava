package com.designpatterns.behaviour.observer;

public class HexaObserver extends Observer {
	
	public HexaObserver(Subject sub) {
		this.subject=sub;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Change in the Status "
				+ "HexaDecimal format\t"
		+Integer.toHexString
		(this.subject.getState()));

	}

}
