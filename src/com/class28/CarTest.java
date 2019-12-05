package com.class28;

public class CarTest {

	public static void main(String[] args) {
    
		Tesla tesla=new Tesla();  //it gives 2 constructors because compiler added automatically super() inside the tesla constructor 
		
		Tesla tesla1=new Tesla(true);
		tesla1.displayInfo();
		System.out.println("creating another objects");
		Tesla tesla2=new Tesla("Tesla XL","S8",false);
		tesla2.displayInfo();
	}
	
	public void helloName(String name) {
		System.out.println("Hello "+name);
	}

}
