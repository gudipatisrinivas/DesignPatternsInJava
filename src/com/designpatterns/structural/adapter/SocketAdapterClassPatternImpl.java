package com.designpatterns.structural.adapter;

public class SocketAdapterClassPatternImpl extends Socket implements SocketAdapter {

	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		Socket socket=new Socket();
		return convert(socket.getVolt(),10);
		
	}

	private Volt convert(Volt volt, int i) {
		// TODO Auto-generated method stub
		return new Volt(volt.getVolts()/i);
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		Socket socket=new Socket();
		return convert(socket.getVolt(),40);
	}

}
