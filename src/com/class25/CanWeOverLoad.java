package com.class25;

public class CanWeOverLoad {
	
	//can we overload a private method?
	
	private void methodOne() {
		System.out.println("I am method one");
	}
 private void methodOne(String str) {
	 System.out.println("I am method one with "+str);
 }
 
 //can we overload a main method? -YES
 
 
 public static void main(String str) {  //we need to call these for create an object
	System.out.println("I am main method with String arguments");
	String name="neslihan";
	System.out.println(name);
}
 
 public static void main(String str,String[] arg) {
	 System.out.println("I am a main method with 2 parameters");
 }
 public static void main(String[] args) { //this method is a signature to print 
	System.out.println("I am a main method");
	main("String");                       //1st=we can call this method for to use main word because we are in already in same class 
	CanWeOverLoad.main("String");         //2nd=we can call with classNAME
	String[] array= {"A","B"};
	main("Hello", array);
	
	
}
 
}
