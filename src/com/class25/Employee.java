package com.class25;

public class Employee {
	 int salary;
	public static String companyName;
	protected int employeeId;
	private String employeeName;
	
	public void work() {
		System.out.println("I work in "+companyName);
	}
	public void getPaid() {
		System.out.println("I get paid "+salary);
	}

}
