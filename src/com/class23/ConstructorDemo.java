package com.class23;

public class ConstructorDemo {
	//ConstructorDemo(){  this constructor already created by java compiler but if we add another constructor we can
		
	// }
	ConstructorDemo() { // we created a constructor for this class
		System.out.println("I am your constructor ");
	}

	ConstructorDemo(String str) { // this constructors do have own parameters
									//
		System.out.println("I am constructor with string parameter " + str);
	}

	ConstructorDemo(int num) {
		System.out.println("I am constructor with int parameter " + num);
	}

	public static void main(String[] args) {

		ConstructorDemo obj = new ConstructorDemo();// first print constructor code because compiler jumped to
													// constructor method
													// and then print next code

		System.out.println("code after creating a object");
		obj.hello();
		obj.hello("hello");

		ConstructorDemo obj1 = new ConstructorDemo("My parameter");

		ConstructorDemo obj2 = new ConstructorDemo(123);
		
		
	}

	public void hello() {
		System.out.println("Hello Class");
		System.out.println("Hello instructors");
	}

	public void hello(String str) {
		System.out.println("Hello Class1");
		System.out.println("Hello instructors1");
	}

}
