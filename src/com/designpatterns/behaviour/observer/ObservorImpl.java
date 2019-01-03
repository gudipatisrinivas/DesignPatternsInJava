package com.designpatterns.behaviour.observer;

public class ObservorImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject sub=new Subject();
		BinaryObserver obj=new BinaryObserver(sub);
		HexaObserver obj2=new HexaObserver(sub);
		sub.setState(90);
		

	}

}
