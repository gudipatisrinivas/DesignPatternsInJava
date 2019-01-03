package com.designpattern.behaviour.command;

public class Stock {
	private String name="ABC";
	private int quantity=10;
	public void buy() {
		System.out.println(
				"Buy Stock Name"+name+"Quantity"+quantity);
	}
	
	public void sell() {
		System.out.println(
				"Sell Stock Name"+name+"Quantity"+quantity);
	}
	

}
