package com.designpattern.behaviour.responsibility2;


	public interface DispenseChain {
		void setNextChain(DispenseChain nextChain);

		void dispense(Currency cur);
		}

