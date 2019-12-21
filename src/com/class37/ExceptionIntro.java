package com.class37;

public class ExceptionIntro {

	public static void main(String[] args) {
int a=20;
int b=0;
System.out.println(a/b); // java.lang.ArithmeticException: / by zero its gonna stop contuniuos execution we cannot finish the code it stop!!!

System.out.println("Code after an exception");//it will not execute because we had exception
System.out.println("Continues code");

int[]array={10,20,30};
System.out.println(array[3]);//ArrayIndexOutOfBoundsException

//how we contunie our code with exceptions how we handle it?

ArithmeticException exception=new ArithmeticException(); //any time exception is happen this object automatically created 
throw(exception);





	}

}
