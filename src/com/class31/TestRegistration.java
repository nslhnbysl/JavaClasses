package com.class31;

public class TestRegistration {

	public static void main(String[] args) {

		Registration obj=new Registration();
		
		obj.getEmail("baysalneslihan@gmail.com");
		String myEmail=obj.giveEmail();
		System.out.println(myEmail);
		obj.getUserName("nslhnbysl");
		String myUser=obj.userName();
		System.out.println(myUser);
		obj.getPassword("aliburhancigim");
		String myPassword=obj.password();
		System.out.println(myPassword);
	}

}
