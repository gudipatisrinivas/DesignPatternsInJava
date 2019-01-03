package com.designpattern.behaviour.visitor2;

import com.designpattern.behaviour.visitor.ComputerPart;
import com.designpattern.behaviour.visitor.ComputerPartVisitor;

public class Book implements ItemElement {
	private int price;
	private String isbnNumber;

	public Book(int cost, String isbn) {
		this.price = cost;
		this.isbnNumber = isbn;
	}

	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}
