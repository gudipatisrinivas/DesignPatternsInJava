package com.designpatterns.structural.bridge;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Drawing the circle color:red"+radius+",x:"+x+",y"+y);

	}

}
