package com.class37;

public class UncheckedException {

	public static void main(String[] args) {
		System.out.println("Beginning of the code");
		int a=20;
		int b=0;
		
		try {    //try to exception block of code execute inside the try block of code
		System.out.println("I am code inside try block");
		System.out.println(a/b);
		System.out.println("I am continues code inside try block"); //its not executed because previous code thrown after that will not execute
		}catch(ArithmeticException e) { //ArithmeticException e=new ArithmeticException();
		System.out.println("catch block code");
		e.printStackTrace(); //it shows us what exception we handled it and the end of the execution we will see the exception note end of print
		System.out.println(e);//another way to see exception just print the name of exception object
		System.out.println(e.getMessage());//another way to see exception note
		}
		
		System.out.println("End of the code");
		
	}

}
