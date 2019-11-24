package com.class22;

public class Husky {
	String name;
	String color;
	
	static String breed="Husky";
	static int paws=4;
	static int tale=1;
	
	void display() {
		System.out.println("Puppy name is "+name+"and it is breed is "+breed);
	}
	
	public static void main(String[] args) {
		
	Husky puppy1=new Husky();
	Husky puppy2=new Husky();
	Husky puppy3=new Husky();
	
	puppy1.name="meatball";
	puppy1.color="brown";
	
	puppy1.display();
	
	puppy2.name="Sharik";
	puppy2.name="black";
	
	puppy2.display();
	
	puppy3.name="sushi";
	puppy3.color="white";
	System.out.println("changing breed");
	puppy3.breed="bulldog";//we changed breed at this point breed will always bulldog
	puppy3.display(); //-->bulldog because we stored a breed bulldog with static variable
	
	puppy2.display();
	
		
		
	}

}
