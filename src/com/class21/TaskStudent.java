package com.class21;

public class TaskStudent {
//	2.  Create a Class called Students
//	●
//	Create three  variables  
//	studentName , studentID  and  
//	numberOfStudents
//	●
//	Create three objects of the 
//	Students Class 
//	●
//	Set the value for  studentName , 
//	studentID and increment  the 
//	numberOfStudents for each 
//	object
//	●
//	Print out  total number of 
//	students
//	Task

String studentName;
int studentId;
static int numberOfStudents;
private static String valueOfStudent;




public static void main(String[] args) {
	TaskStudent student1=new TaskStudent();
	TaskStudent student2=new TaskStudent();
	TaskStudent student3=new TaskStudent();
	student1.studentName="Neslihan";
	student1.studentId=4567;
	student1.numberOfStudents++;
	student1.valueOfStudent="dahi";
	System.out.println(valueOfStudent);
	student2.studentName="Imran";
	student2.studentId=3234;
	student2.numberOfStudents++;
	student2.valueOfStudent="tembel";
	System.out.println(valueOfStudent);
	student2.valueOfStudent="zeki";
	student3.studentName="Ali";
	student3.studentId=2345;
	student3.numberOfStudents++;
	
	System.out.println(numberOfStudents);
	System.out.println(valueOfStudent);
}
	
}
