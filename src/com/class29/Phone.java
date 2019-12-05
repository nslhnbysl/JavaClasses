package com.class29;

public abstract class Phone {

	//looks a regular class 
	//after the unimplemented methods creation we must to change the from regular class to abstract class
	//we gonna have some methods
	//we also call these methods implemented because they have method body(sopln)
	public void makeCall() {
		System.out.println("Make call");
	}
	public void sendText() {
		System.out.println("Send text");
	}
	
	
	//we gonna add another behavior
	//in below we create an unimplemented methods
	//when we not add {} after () we must add abstract keyword
	//we must use ABSTRACT for unimplemented methods 
	//because we will have some child classes and all class will have own implementation about takepicture 
	//we can add as many abstract method as long as we want 
	
	public abstract void takePictures();//-->unimplemented/abstract/undefined methods 
	
	public abstract void playGames();
}

class iPhone extends Phone{
	
	//compiler gives an error and give us a option and to click once it create automatically belows overriding methods
	//you will have to provide create all abstracts methods

	@Override
	public void takePictures() {
		System.out.println("iPhone takes pictures");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGames() {
		System.out.println("Play games on iPhone");
		// TODO Auto-generated method stub
		
	}	
}
//concrete(somut) class
class Samsung extends Phone{
	//compiler gives an error and we automatically override all unimplemented methods

	@Override
	public void takePictures() {
System.out.println("Samsung takes pictures");		
	}

	@Override
	public void playGames() {
System.out.println("Play games on Samsung");		
	}
	
}






