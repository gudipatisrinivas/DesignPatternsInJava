package com.designpattern.behaviour.visitor2;

public interface ShoppingCart {
	int visit(Book book);

	int visit(Fruit fruit);
}