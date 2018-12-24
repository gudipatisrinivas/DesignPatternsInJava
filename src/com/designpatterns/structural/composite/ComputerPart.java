package com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

class Leaf implements Component {
	String name;
	int price;

	public Leaf(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		System.out.println("Name:"+name +"Price"+price);
		
	}

}
class Composite implements Component {
	String name;
	List<Component> listOfComponent=new ArrayList<>();
	
	public void addComponent(Component com) {
		listOfComponent.add(com);
	}

	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		for(Component c:listOfComponent) {
		c.showPrice();
		}
	}
	
}

public class ComputerPart{
	
}