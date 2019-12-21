package com.class34;

import java.util.*;// it means anyting inside the package import it for me 

class Sweets{
	String name;
	public Sweets(String name){
		this.name=name;
	}
	
	public void iLove() {
		System.out.println("I love "+name);
	}
	}
public class LinkedListDemo2 {

	public static void main(String[] args) {
//create a list of sweets objects
		LinkedList<Sweets> sweetList=new LinkedList<Sweets>();
	sweetList.add(new Sweets("Chocolate")); //this object will be store inside the element
	sweetList.add(new Sweets("Cake"));     //we add name argument
	sweetList.add(new Sweets("Cookies"));
	sweetList.add(new Sweets("Macarons"));
	
	//lets display name of each sweet object 
	
	for(Sweets element:sweetList) {
		System.out.println(element.name);//we print objects names 
		element.iLove();  //we can call methods what objects have 
	}
	
	Sweets mySweet=sweetList.get(2); //retrieving one element and accesing method
	mySweet.iLove();
	
	//retrieving 1 element and accessing method(1 step)
	sweetList.get(2).iLove();
	
	String nameOfTheSweet=sweetList.get(2).name; //type is string because we assigned a name value
	

	Integer num=100;
	String newNumber=num.toString().replace("100", "200"); //i am calling method to string and replace the value from 100 to 200
	System.out.println(newNumber); //200 we can use String manupulations on integer,double how ? through toString
	
	int size=newNumber.replace("200", "300").length(); //when we need to learn the length it returns int and we must change the data type from string to int
	System.out.println(size);	 
	}

}
