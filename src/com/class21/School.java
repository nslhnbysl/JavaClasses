package com.class21;

public class School {
public String studentName;
public double GPA;
public String school;



public void displayInfo() {
	System.out.println(studentName+" attending "+school+" has a GPA of "+GPA);
}protected void study(int hours) {
	System.out.println("Studying for "+hours+" hours");
}
}
