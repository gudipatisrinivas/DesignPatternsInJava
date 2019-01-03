package com.designpattern.behaviour.visitor2;

public interface ShoppingCartVisitor {
	int visit(Book book);

	int visit(Fruit fruit);
}