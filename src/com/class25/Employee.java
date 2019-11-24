package com.class25;

public class Employee {
	int salary;
	static String companyName;
	
	public void work() {
		System.out.println("I work in "+companyName);
	}
	public void getPaid() {
		System.out.println("I get paid "+salary);
	}

}
