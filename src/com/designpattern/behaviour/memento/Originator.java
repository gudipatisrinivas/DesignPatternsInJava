package com.designpattern.behaviour.memento;

public class Originator {
String state;

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public Memento saveStateToMemento() {
	return new Memento(state);
}

public String getStateToMemento(Memento memento) {
	this.state=memento.getState();
	return memento.getState();
}

}
