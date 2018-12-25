package com.designpatterns.structural.composite;

public class CompositeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComputerPart cpm=new ComputerPart();
		Leaf hd=new Leaf("HardDisk",4000);
		Leaf ram=new Leaf("Ram",500);
		Leaf monitor=new Leaf("Monitor",5000);
		Leaf mouse=new Leaf("Mouse",2500);
		
		Composite cpu=new Composite();
		cpu.addComponent(hd);
		cpu.addComponent(ram);
		
		Composite peri=new Composite();
		peri.addComponent(monitor);
		peri.addComponent(mouse);
		System.out.println("\n**** CPU Details *****");
		cpu.showPrice();
		System.out.println("\n**** Peripheral Details *****");
		peri.showPrice();
		System.out.println("\n**** Computer Details *****");
		
		
		Composite comp=new Composite();
		comp.addComponent(cpu);
		comp.addComponent(peri);
		comp.showPrice();
		

	}

}
