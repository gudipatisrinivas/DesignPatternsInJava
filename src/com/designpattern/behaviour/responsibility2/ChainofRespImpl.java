package com.designpattern.behaviour.responsibility2;

public class ChainofRespImpl {
	
	public DispenseChain buildDispenser() {
		
		DispenseChain dispense50=new Dispenser50Dollar();
		DispenseChain dispense20=new Dispenser20Dollar();
		DispenseChain dispense10=new Dispenser10Dollar();
		dispense50.setNextChain(dispense20);
		dispense20.setNextChain(dispense10);
		return dispense50;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DispenseChain dispenser = new ChainofRespImpl().buildDispenser();
		dispenser.dispense(new Currency(-20));
		dispenser.dispense(new Currency(120));
		dispenser.dispense(new Currency(130));
		dispenser.dispense(new Currency(140));
		dispenser.dispense(new Currency(70));
	}

}
