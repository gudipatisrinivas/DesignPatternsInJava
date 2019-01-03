package com.designpatterns.structural.adapter;

public class Volt {

	@Override
	public String toString() {
		return "Volt [volts=" + volts + "]";
	}

	private int volts;
	
	public Volt(int v){
		this.volts=v;
	}

	public int getVolts() {
		return volts;
	}

	public void setVolts(int volts) {
		this.volts = volts;
	}
	
}
