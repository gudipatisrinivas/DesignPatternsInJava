package com.designpattern.behaviour.memento;

public class MementoPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator orginator=new Originator();
		CareTaker care=new CareTaker();
		orginator.setState("State 1");
		orginator.setState("State 2");
		care.add(orginator.saveStateToMemento());
		orginator.setState("State 3");

		care.add(orginator.saveStateToMemento());
		orginator.setState("State 4");

		//care.add(orginator.saveStateToMemento());
		System.out.println(orginator.getState());
		orginator.getStateToMemento(care.getMemento(0));
		System.out.println(orginator.getState());
		orginator.getStateToMemento(care.getMemento(1));
		System.out.println(orginator.getState());
		
	}

}
