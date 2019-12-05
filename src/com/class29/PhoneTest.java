package com.class29;

public class PhoneTest {
	public static void main(String[] args) {
		
	
	//you cannot create an object of an abstract class
	//because its not complete%100
	
	//Phone phone=new Phone(); -->will give compiler error
	//we can create it inderctly
	
	Phone phone=new iPhone();//it works because during the execution java always refer a child class and already in child class we comlete our methods%100
	
	phone.makeCall();
	phone.playGames();
	phone.sendText();
	phone.takePictures();
	
	
	

}
}