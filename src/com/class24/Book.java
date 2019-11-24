package com.class24;

public class Book extends Student{
	
	Book(){
		this("name","abb");
		System.out.println("this is non argument constructor");
	}
	
	Book(String name,String adress){
		
		System.out.println("this is a parameterized constructor");
	}
	
	
	
	public static void main(String[] args) {
		
		 Book obj=new Book();
		 
		 obj.name="Neslihan";
		 obj.adress="Centreville";
		 obj.displayInfo();
				 
	}

}
