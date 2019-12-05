package com.class28;

class Child extends Parent{
	
	String name="James";
	
	public void callName() {
		System.out.println(name);
		System.out.println(super.name);
		System.out.println(lastName);//why it gives parent class value directly because we didnt create same variable name and another value it gives parent value
	}
	public void callingMethod() {
		this.callName(); //by default this is added ,so we are calling current class(child class)method
		super.callName();//we are calling imediate previous class(parent class)method
	}
	
	public static void main(String[] args) {
		
		Child obj=new Child();
		obj.callName();  //gives child class value-->James
		                 //after add super.name, it gives us 2 output-->james and John
		                 //after add sop lastName it gives us 3 output-->james,john and lastname 
		System.out.println("__________");
		    
		obj.callingMethod();
	}
}