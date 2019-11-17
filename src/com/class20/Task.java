package com.class20;

public class Task {
//	Create a method that will take 1 parameter as a String and return reversed String. Method should be visibly only within same package.
//	Create a method that will take a String and return whether String is palindrome or not. Method should be available to all classes within your projects.
//	Create a method that will take a string and return an array of words from that string. Method should be available only within same class.
//

//Q1
	protected String reverse(String word) {

	String reversed="";
	
	for(int i=word.length()-1;i>=0;i--) {
	reversed=reversed+word.charAt(i);	
	}
	return reversed;
		}
	
//Q2
public String palindrome(String name1) {
	String reversed="";
	int length=name1.length();
	String result;
	
	for(int i=length-1;i>=0;i--) {
	reversed=reversed+name1.charAt(i);	
	}
	if(name1.equalsIgnoreCase(reversed)) {
		result="This is a palindrome number";
	}else {
		result="This is not a palindrome number";
	}
	return result;
}

//Q3

private String[] arrayOfWords(String sentence) {

//	String[] stringArray;

//	stringArray = sentence.split(" ");

//	return stringArray;



	return sentence.split(" ");

}



public static void main(String[] args) {

		Task task = new Task();

		String q1 = task.reverse("Neslihan");
		System.out.println(q1);
		
	
	
	
	
	
	
	
	
	
	
}




}
