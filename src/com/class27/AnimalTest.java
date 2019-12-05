package com.class27;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal=new Monkey();
		animal.whoAmI(); //it gives a parent class method code because we CANNOT override sttaic methods 
	}

}
