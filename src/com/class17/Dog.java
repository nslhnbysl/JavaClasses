package com.class17;

public class Dog {
	
	String species,color,hair;
	int weight,age;
	boolean smart;

	void barking() {
		System.out.println("The species of dog "+species+ " is barking");
		
	}void smellsGood(){
		System.out.println(species+ " is smells good");
	}void smellsBad(){
		System.out.println(species+ " is smells not good");
	}
	
	
	
	
	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		
		dog1.species="Husky";
		dog1.color="White";
		dog1.hair="long";
		dog1.smart=true;
		
		System.out.println("I would live to adapt "+dog1.color+" "+dog1.species+" "+dog1.hair+" hair");
		
		dog1.smellsGood();
		
		Dog dog2=new Dog();
		
		dog2.species="Bulldog";
		dog2.color="brown";
		dog2.hair="short";
		dog2.age=15;
		
		System.out.println("My friend has a "+dog2.color+" "+dog2.species+ " with "+dog2.hair+" hair and it is "+dog2.age+" years old");
		
		dog2.smellsBad();
		dog2.barking();
		
	}
}
