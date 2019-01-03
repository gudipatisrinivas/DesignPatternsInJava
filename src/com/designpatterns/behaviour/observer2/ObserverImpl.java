package com.designpatterns.behaviour.observer2;

public class ObserverImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject=new Subject();
		HexaObserver hex=new HexaObserver(subject);

		BinaryObserver binary=new BinaryObserver(subject);

		OctaObserver octa=new OctaObserver(subject);
		subject.setState(20);
		subject.setState(120);
		

	}

}
