package com.designpattern.behaviour.responsibility2;

public class Dispenser50Dollar implements DispenseChain {
	
	private DispenseChain nextChain;
	@Override
	public void setNextChain(DispenseChain nextChain) {
		// TODO Auto-generated method stub
		this.nextChain=nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		// TODO Auto-generated method stub
		int currency = 0;
		int dispatching = 0;
		int leftoverCurrency=0;
		if (cur.getAmount() >= 50) {
			currency = cur.getAmount();
			dispatching = currency / 50;
			leftoverCurrency=currency-(dispatching*50);
			System.out.println("Dipatching " + dispatching + "X" + "50 =" + dispatching * 50);
			if(leftoverCurrency%50>0) {
				cur.setAmount(leftoverCurrency);
				nextChain.dispense(cur);
			}
		} else {
			nextChain.dispense(cur);
		}
	}

}
