package com.class31;

public class ParentTest {

	public static void main(String[] args) {
   Parent p=new Child();
   p.hello(); //try to execute and you will get from superclass because when we talk about static we cant override static it will be overhiding
              //compiler always give a superclass block of code and subclass block of code will hiding
              //compiler always give a reference class 
	
	
	Child c=new Child(); //now we will get subclass block of code because we reference to Child class
	c.hello();
	
	
	}

}
