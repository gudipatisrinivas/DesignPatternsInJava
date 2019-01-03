package com.designpatterns.structural.adapter;

public class SocketAdapterObjectPatternImpl implements SocketAdapter{
	private Socket socket=new Socket();
	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return socket.getVolt();
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		return convert(socket.getVolt(),10);
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		return convert(socket.getVolt(), 40);
	}
	
	private Volt convert(Volt volt, int i) {
		// TODO Auto-generated method stub
		return new Volt(volt.getVolts()/i);
	}

}
