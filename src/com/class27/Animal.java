package com.class27;

public class Animal {

	public static void whoAmI() {
		System.out.println("I am an animal");
	}
	
}
class Monkey extends Animal{
	public static void whoAmI() {
		System.out.println("I am a monkey");
	}
	
//	      public  void whoAmI() {             -->we cannot  override this method with non static modifiers compiler give an error
//		System.out.println("I am an animal");
//	}
}
