package com.designpattern.behaviour.responsibility;

public class FileLogger extends AbstractLogger {
	
	public FileLogger(int level) {
		// TODO Auto-generated constructor stub
		this.level=level;
	}
	@Override
	protected void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("This is a File Logger");	
	}

}
