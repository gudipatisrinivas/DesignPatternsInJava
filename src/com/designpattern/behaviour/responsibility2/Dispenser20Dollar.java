package com.designpattern.behaviour.responsibility2;

public class Dispenser20Dollar implements DispenseChain {
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
		if (cur.getAmount() >= 20) {
			currency = cur.getAmount();
			dispatching = currency / 20;
			leftoverCurrency=currency-(dispatching*20);
			System.out.println("Dipatching " + dispatching + "X" + "20 =" + dispatching * 20);
			if(leftoverCurrency%20>0) {
				cur.setAmount(leftoverCurrency);
				nextChain.dispense(cur);
			}
		} else {
			nextChain.dispense(cur);
		}
	}

}
