package com.designpattern.behaviour.responsibility;

public class ChainPatternDemo {
	
	private static AbstractLogger getChainOfLogger() {
	AbstractLogger errorLogger=new ErrorLogger(AbstractLogger.ERROR);
	AbstractLogger fileLogger=new FileLogger(AbstractLogger.DEBUG);
	AbstractLogger consoleLogger=new FileLogger(AbstractLogger.INFO);
	errorLogger.setNextLogger(fileLogger);
	fileLogger.setNextLogger(consoleLogger);
	return errorLogger;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractLogger loggerChain=getChainOfLogger();
		loggerChain.logMessage(AbstractLogger.INFO, "This is an INFO level log information");
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an DEBUG level information");
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an Error level information");

	}

}
