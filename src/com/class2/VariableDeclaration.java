package com.class2;

public class VariableDeclaration {
	public static void main (String[] args) {
	
		
		//1-declaring variable num1 that will hold value of hint and
		//assigning value of 123 to it
	int num1=123;
	int num2=6767;		
	long num3=729292273644993l;
	
	char num4='A';
	
	
		//2-declare variable first and then assign value
	int n1;
	int n2;
	int n3;
	
	n1=56;
	n2=9393;
	n3=829;
	
	
	   //3.declare all variable together and then assign value
	
	int number1,number2,number3;
	number1=12;
	number2=15;
	number3=675;
	
	boolean var=true;
	
	char myVariable;
	myVariable='$';
	
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);
	System.out.println(num4);
	System.out.println(n1);
	System.out.println(n2);
	System.out.println(n3);
	System.out.println(number1);
	System.out.println(number2);
	System.out.println(number3);
	System.out.println(var);
	System.out.println(myVariable);
	
	number2=number1; //12
	System.out.println(number2);
	//number2=false;-->compile time error asking to change datatype of 
	//variable number2 to boolean
	
	boolean isRain=false;
	boolean isSnow;
	isSnow=isRain;// isSnow=false 
	System.out.println(isSnow);
	
	isSnow=true;
	System.out.print(isSnow);//isSnow=true
	
	
	
	}

}
