package com.class25;

public class ConstructorOverloading {
	//different amount of parameters
	ConstructorOverloading(){
		System.out.println("I am not argument constructor");
	}
	ConstructorOverloading(String str){
		System.out.println("I am constructor with one string parameter ");
	}
  //having different type of 
	ConstructorOverloading(int num){
		System.out.println("I am constructor with one int parameter ");
	}
	
	
}
