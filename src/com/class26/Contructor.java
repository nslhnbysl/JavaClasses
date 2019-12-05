package com.class26;

public class Contructor extends Employee{

	public void overTime() {
		System.out.println("Constructor gets paid for over time");
	}
	
	public static void main(String[] args) {
		FullTime obj=new FullTime();
   	    obj.getPaid();
		
	}
}
