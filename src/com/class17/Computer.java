package com.class17;

public class Computer {
	String brand,name;
	boolean keyboard;
	int screen,memory;

	void playGames() { //method header 
		System.out.println("I can play on my "+name); //method body
	}void javaCoding(){
		System.out.println("I can do Java coding on my "+name);
	}void watchMovie(){
		System.out.println("I can watch movie on my "+name );
	}


public static void main(String [] args) {
	
	//we can add main method but we should consider it must be inside main method 
	//we basicly create a new class under ci=omputer class 
	Computer comp1=new Computer();
	comp1.brand="Apple";
	comp1.name="MacBook Pro";
	comp1.keyboard=false;
	comp1.memory=250;
	
	System.out.println("I have "+comp1.brand+" "+comp1.name);
	
	comp1.javaCoding();
	comp1.watchMovie();
	comp1.playGames();
	
	Computer computer2=new Computer();
	
	computer2.brand="Dell";
	System.out.println(computer2.brand);
	computer2.name="Inspiron";
	computer2.memory=728;
	
	computer2.javaCoding();
	computer2.watchMovie();
	
	
	
	
	
	
	
	
	
	
	
}	
}