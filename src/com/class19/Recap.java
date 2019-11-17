package com.class19;

public class Recap {
	
	void sum(int num1,int num2) {
		int c=num1+num2;
		System.out.println("The sum of 2 number is= "+c);
	}
//	void sum(int num1,int num2) {                          //we CANNOT create a same method name compiler give an error 
//		int c=num1+num2;
//		System.out.println("The sum of 2 number is= "+c);
//	}
	//create method to display hello # times
	void sayHello(int time) {
		for (int i = 0; time >i; i++) {
		System.out.println("Hello");	
		}
	}	
	void saySometing(String word,int times) {
		for(int i=0;i<times;i++) {
			System.out.println(word);
		}
		
	}
	
	
	public static void main(String[] args) {
		Recap obj=new Recap();
		obj.sum(5, 10);
		obj.sayHello(15);
		obj.saySometing("Java", 5);
	}

}
