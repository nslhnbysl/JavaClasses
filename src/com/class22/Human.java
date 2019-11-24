package com.class22;

public class Human {

	String name; //instance variable you can use in main method how much do you want
	String lastName;//if we dont see a static its a instance variable 
	
	//static variables
	static int eyes=2; 
	static int nose=1;
	static boolean brain=true;
	
	public static void main(String[] args) {
		Human human1=new Human();
		human1.name="John";
		human1.lastName="Smith";
		System.out.println("Printing static variables");
		System.out.println(Human.eyes);//-->its simple way to access because it belongs to class Human
		System.out.println(human1.eyes);//-->we can do like this but we have little warning other way is better than this 
		System.out.println(eyes);  //-->this is 3rd way we can use this way for inside the what eyes belong to class(human)
		System.out.println("___________");
		
		Human human2=new Human();
		human2.name="Jimmy";
		human2.lastName="Miller";
		human2.lastName="Doe";
		
		System.out.println(human2.lastName); //-->Doe
		System.out.println(human1.lastName); //-->Smith
		
	}
}
