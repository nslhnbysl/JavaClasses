package com.class24;

public class Student {
//	Write program as a Student class that has instance variables name and address.
//	Create a constructor that will initialize those variables. Print name & address of given  student by the displayInfo method.
//	Write program as a Book class   that will have 2 Constructors. While creating an object make sure:
//	Instance variables are being initialized
//	Both Constructors are being executed

	String name;
	String adress;
	
	Student(){
	System.out.println("non argument parameterized");	
	}
	
	Student(String name,String adress){
		this();
		this.name=name;
		this.adress=adress;
		System.out.println("parameterized constructor");
		
	}
	public void displayInfo() {
		System.out.println("The student name is="+name+" adress is="+adress);
	}
	public static void main(String[] args) {
		Student obj=new Student("neslihan","centreville") ;
		obj.displayInfo();
	}
	
}
