package com.class25;

public class TaskOverload {
	
	static void method1(){
		System.out.println("I am the  non argument static method ");
	}
	static void method1(String str) {
		System.out.println("I am the one String static parameter method");
	}
	static void method1(int num) {
		System.out.println("I am the one int static parameter method");

	}
	
	private  void method2() {
		System.out.println("I am the  non argument private method ");
}
	private void method2(String str) {
		System.out.println("I am the one String private method ");

	}
	private void method2(int num) {
		System.out.println("I am the one int private method ");

	}
public static void main(String[] args) {
	//we can call static method directly 
	method1();     
   //we can call static method with class name 
	TaskOverload.method1();
	method1("Neslihan");
	method1(40);
	System.out.println("_______________");
	
	TaskOverload obj=new TaskOverload();
	//we cannot call nonstatic method directly and with classname we always need to create an object
	obj.method2();
	obj.method2(50);
	obj.method2("neslihan");
	
	//we can call static variable with object 
	obj.method1();
	
	
}
}
