package com.class21;

public class School {
public String studentName;
public double GPA;
public static String school;//this variable doesn't belong to objects this variable belongs to class
                            //if we changed the value on other class and it will change there because it belong there




public void displayInfo() {
	System.out.println(studentName+" attending "+school+" has a GPA of "+GPA);
}protected void study(int hours) {
	System.out.println("Studying for "+hours+" hours");
}
}
