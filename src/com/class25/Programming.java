package com.class25;

public class Programming {
	
	String program;
	
	Programming(){
		System.out.println("I love programming language");
	}
	Programming(String program){
		this.program=program;
		System.out.println("I love "+program);
	}
	public static void main(String[] args) {
		Programming obj=new Programming();
		Programming obj1=new Programming("Java");
	}
	
 
}
