package com.class28;

public class TaskUser {
	//Write program: userClass  that has a constructor that initializes name and mobile number instance variables.
	//Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
	//Print users name, mobile number and address in userDetails method. Test your code.


	//Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
	//In circle class create a method to calculate the area of circle. Test your code

	String name;
	int mobileNumber;
	
	TaskUser(String name,int mobileNumber){
		this.name=name;
		this.mobileNumber=mobileNumber;
	}
	
}
class TaskUserInfo extends TaskUser{
	String adress;
	
	TaskUserInfo(String name,int mobileNumber,String adress){
		super(name,mobileNumber);
		this.adress=adress;
		System.out.println(name+" "+mobileNumber+" "+adress);
	}
}