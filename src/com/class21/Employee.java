package com.class21;

public class Employee {
//	    CreateaClasscalledEmployee:
//		● Create three variables eID , salary
//		and set the CEO to “Sumair”
//		● Create two objects of the class
//		Employee
//		● Set the value of eID, salary for each of
//		the objects
//		● Print out the eID , salary and CEO for
//		each of the objects
	
	public String eID;
	public int salary;
	 static String ceo="Sumair";//static non access modifier
	                            //can be use with variable,methods,blocks and nested class
	                            //belongs to class than an instance(ornek olusum)
	                            //
	 void displayTitle() {
		System.out.println(eID+" is working on Syntax and his salary is "+salary+" the school ceo's name is "+ceo);
	}
	
	public static void main(String[] args) {
		
	Employee employee1=new Employee();
	Employee employee2=new Employee();
	
	employee1.eID="Sohil";
	employee2.eID="Diego";
	employee1.salary=120000;
	employee2.salary=130000;
	
	employee1.displayTitle();
	employee2.displayTitle();	
		
	}
}
