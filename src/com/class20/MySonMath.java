package com.class20;

public class MySonMath {
	public String name;
     String phone;
     private int SSN; 
     protected String birthday;
     
	//public can be seen/accessed
	//from anywhere
	public int add1() {
		int num1=2;
		int num2=1;
		int result=num1+num2;
		return result;
		
	//default can be seen/accessed
	//within package and subclass
	}void add2(int num1,int num2){
		int result=num1+num2;
	}String name1(String name1,String lastName,int age){
		String wholeName=name1+lastName+age;
		return wholeName;
	}
	
	//protected can be seen/accessed
	//within package
	protected int add3(int num1,int num2) {
		int result = num1 + num2;
        return result;
    }
	
	//private can be seen/accessed
	//only within class
    private int add4(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

}
