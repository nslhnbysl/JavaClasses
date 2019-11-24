package com.class22;

public class TestStaticVsNonStatic {

	public static void main(String[] args) {
		//how to access static members(variables)
		//they can be accessed by class name
				System.out.println(StaticVsNonStatic.school); //static variable access way
				StaticVsNonStatic.getInfo1();                 //static method access way
				
		//how to access non static members(methods) 
		//we can be accessed by creating an object of that class
			
				StaticVsNonStatic student1=new StaticVsNonStatic();
				StaticVsNonStatic student2=new StaticVsNonStatic();
				
				student1.getInfo();
				StaticVsNonStatic.getInfo1();//-->print the static method way
				
				
				student2.name="Neslihan";
				student2.grade='A';
				student2.getInfo();
				
	}

}
