package com.class28;

public class Device {
//class device,then create child class"Apple"
	
	String deviceType,name;
	
	public Device(String deviceType,String name) {
		this.deviceType=deviceType;
		this.name=name;
	}
}
class Apple extends Device{
	int number;
	public Apple(String deviceType, String name, int number) {
		super(deviceType,name);
		this.number=number;
		System.out.println(deviceType+" "+name+" "+number);
	}
	
	public static void main(String[] args) {
		
		Apple device=new Apple("phone", "XR", 2);
	}
}
