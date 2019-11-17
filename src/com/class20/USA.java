package com.class20;

public class USA {

	private String capitalCity="Washington DC";//in class access
	public String mainState="New York" ;//access for everywhere
	protected String school="Syntax"; //in package access
	
	public static void main(String[] args) {
		
		USA us=new USA(); //vreate new obj
		 System.out.println("Access from USA Class");
		System.out.println(us.mainState);
		System.out.println(us.school);
		System.out.println(us.capitalCity); //I can access all of them because we are in same class and same package
		
		
	}
		
	
}
