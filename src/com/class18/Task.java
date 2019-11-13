package com.class18;

public class Task {
public static void main(String[] args) {
	
//Create a method that will take 2 parameters as a numbers and prints which number is larger.
//Create a method that will take a number and prints whether the number is even or odd.
//Create a method that will print whether given String is palindrome or not.	

	Task obj=new Task();
	obj.largerNumber(54, 100);
	obj.evenOdd(56);
	obj.palindrome("anna");
	obj.palindrome("yes");
}
void largerNumber(int num1,int num2) {
	if(num1>num2) {
		System.out.println(num1+" is the largest number");
	}else {
		System.out.println(num2+" is the largest number");
	}
}

void evenOdd(int num1) {
	if(num1%2==0) {
		System.out.println(num1 +" is an even number");
	}else {
		System.out.println(num1 +" is an odd number");
	}
}

void palindrome(String name) {
	String nameReverse="";
	for(int a=name.length()-1;a>=0;a--) {
		//System.out.println(name.charAt(a));
		nameReverse=nameReverse+name.charAt(a);
	}
	if(name.equalsIgnoreCase(nameReverse)) {
		System.out.println("This is a palindrome word");
	}else {
		System.out.println("This is not a palindrome word");
	}
}
}

