package com.class17;

public class Phone {

	String name,brand,color;
	
	int memory,year;
	
	void talk() {
		System.out.println("You can talk with "+name );
	}void search(){
		System.out.println("You can search with "+name);
	}void playGame(){
		System.out.println("You can play a game with "+name);
	}
	



public static void main(String [] args) {
	
	
	Phone phone1=new Phone();
	
	phone1.name="Iphone";
	phone1.brand="XR";
	phone1.memory=128;
	phone1.color="white";
	phone1.year=2019;
	
	System.out.println("I have " +phone1.name+phone1.brand+phone1.color+ "color "+ phone1.memory + " GB " );
	
	phone1.search();
	phone1.playGame();
	phone1.talk();
	
	Phone phone2=new Phone();
	
  phone2.name="Android";
  phone2.brand="Samsung";
  phone2.memory=254;
  phone2.color="Black";
  phone2.year=2020;
	
	System.out.println("I have "+phone2.name+phone2.brand+phone2.color+ " color "+phone2.memory+ " Gb");
	
	phone1.search();
	phone1.playGame();
	phone1.talk();
	
	Phone phone3=new Phone();
	
	  phone3.name="Nokia";
	 
	  phone3.color="red";
	
	  phone1.talk();
	
	
}	
}