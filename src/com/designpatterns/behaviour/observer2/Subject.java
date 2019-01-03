package com.designpatterns.behaviour.observer2;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	List<Observer> observers = new ArrayList<>();
	int state;
	public int getState() {
		// TODO Auto-generated method stub
		return state;
	}
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	public void setState(int state) {
		this.state = state;
		notifyAllObserver();
	}
	private void notifyAllObserver() {
		// TODO Auto-generated method stub
		for(Observer sub:observers) {
			sub.update();
		}
		
	}

}
