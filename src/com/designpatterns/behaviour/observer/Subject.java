package com.designpatterns.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private List<Observer> listofObserver=new ArrayList<>();
	private int state;
	public List<Observer> getListofObserver() {
		return listofObserver;
	}
	public void setListofObserver(List<Observer> listofObserver) {
		this.listofObserver = listofObserver;
		
	}
	public int getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
		notifyAllObservor();
	}
	
	public void attach(Observer obj) {
		listofObserver.add(obj);
		
	}
	
	public void remove(Observer obj) {
		listofObserver.remove(obj);
	}
	public void notifyAllObservor() {
		for(Observer obj:listofObserver) {
			obj.update();
		}
		
	}

}
