package com.class26;

public class Animal {
	public void sleep() {
		System.out.println("Animal sleep");
	}
    public void eat() {
        System.out.println("Animal eat");	
    }
  }
class Cat extends Animal {
	public void sleep() {
		System.out.println("Cat sleep all day");
	}
	public void meow() {
		
	}
}


