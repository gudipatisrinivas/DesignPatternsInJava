package com.designpattern.behaviour.visitor2;

public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);
}