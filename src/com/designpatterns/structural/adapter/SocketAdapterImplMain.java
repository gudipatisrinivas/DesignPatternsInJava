package com.designpatterns.structural.adapter;

public class SocketAdapterImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SocketAdapterObjectPatternImpl objectSocket=new SocketAdapterObjectPatternImpl();
		System.out.println(objectSocket.get120Volt());
		System.out.println(objectSocket.get12Volt());
		System.out.println(objectSocket.get3Volt());
		
		
		SocketAdapterClassPatternImpl classSocket=new SocketAdapterClassPatternImpl();
		System.out.println(classSocket.get120Volt());
		System.out.println(classSocket.get12Volt());
		System.out.println(classSocket.get3Volt());
	}

}
