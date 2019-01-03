package com.designpattern.behaviour.command;

public class CommandPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock stock=new Stock();
		BuyStock buyStock=new BuyStock(stock);
		SellStock sellStock=new SellStock(stock);
		Broker broker=new Broker();
		broker.takeOrder(buyStock);
		broker.takeOrder(sellStock);
		broker.placeOrder();

	}

}
