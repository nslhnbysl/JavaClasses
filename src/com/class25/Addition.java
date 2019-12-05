package com.class25;

public class Addition {

	//method overloading:
	//1 by passing different amount of parameters



public void add(int num1,int num2) {
	System.out.println(num1+num2);
}

public void add(int num1,int num2,int num3) {
	System.out.println(num1+num2+num3);
}

//2 by having different type of parameters

public void add(double num1,double num2) { //add(double num1,double num2) this is our method signature and compiler consider that part for overloading
	System.out.println(num1+num2);
}

public void add(int num1,double num2) {
	System.out.println(num1+num2);
}

public double add(double num2,int num1) {
	double sum=num1+num2;
	return sum;
}

public static void main(String[] args) {
	Addition obj=new Addition();
	obj.add(5, 5);
	obj.add(5, 5, 5);
	obj.add(5.0, 5.0);
	obj.add(5, 5.0);
	
	String str="Hello";
	System.out.println(str.substring(3)); //it is also overloading 
	System.out.println(str.subSequence(1, 3));
}



}
