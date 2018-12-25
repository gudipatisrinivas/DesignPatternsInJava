package com.designpatterns.structural.flyweight;

public class FlyWeightDemo {
	private static final String[] names=
		{"Red","Green","Blue","White","Black"};
	
	public static void main(String[] s) {
		for(int i=0;i<20;i++) {
			Circle c=(Circle) ShapeFactory.getCircle(getRandomCircle());
			c.setX(getRandomX());
			c.setY(getRandomY());
			c.draw();
		}
		
	}

	private static int getRandomY() {
		// TODO Auto-generated method stub
		return (int)(Math.random()*100);
	}

	private static int getRandomX() {
		// TODO Auto-generated method stub
		return (int)(Math.random()*100);
	}

	private static String getRandomCircle() {
		// TODO Auto-generated method stub
		return names[(int)(Math.random()*names.length)];
	}

}
