package com.class26;

public class RunTimePolymorphism {
public static void main(String[] args) {
	
	//creating an obj animal(parent) class
	Animal animal=new Animal();
	animal.sleep();
	animal.eat();
	System.out.println("___________");
	//creating an obj cat(child) class
	Cat cat=new Cat();
	cat.sleep();//comes from child class
	cat.eat();  //comes from parent class
	cat.meow();//comes from child class
	
	Animal obj=new Cat();
	//narrowing
	//Cat obj2=new Animal();-->compiler give an error because all cat is animal but all animal is not cat
	obj.eat(); //coming from parent
	obj.sleep();//coming from child (its overriding method)
	//obj.meow();-->compiler error 
		//widening
		double d=90;
		//narrowing
		int i=(int)1.99;
		
		//nOn primitive typecasting
		//widening-->creating an object of the class
		// and giving reference to the parent class
		
		Animal obj1=new Cat();
		//narrowing 
		//Cat obj2=new Animal();-->cannot convert from animal to cat
	}
}
