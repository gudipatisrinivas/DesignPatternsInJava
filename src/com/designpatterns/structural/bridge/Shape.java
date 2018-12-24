package com.designpatterns.structural.bridge;

public abstract class Shape {
	protected DrawAPI drawAPI;
	protected Shape(DrawAPI drawApi) {
		this.drawAPI=drawApi;
	}
	public abstract void draw();

}
