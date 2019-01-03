package com.designpattern.behaviour.responsibility2;

public class Dispenser10Dollar implements DispenseChain {
	private DispenseChain nextChain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		// TODO Auto-generated method stub
		this.nextChain = nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		// TODO Auto-generated method stub
		int currency = 0;
		int dispatching = 0;
		int leftoverCurrency=0;
		if (cur.getAmount() >= 10) {
			currency = cur.getAmount();
			dispatching = currency / 10;
			leftoverCurrency=currency-(dispatching*10);
			System.out.println("Dipatching " + dispatching + "X" + "10 =" + dispatching * 10);
			if (leftoverCurrency%10 > 0) {
				cur.setAmount(cur.getAmount()-(dispatching*10));
				nextChain.dispense(cur);
			}
		} else {
			System.out.println("Sorry we can't serve the amount");
		}
	}

}
