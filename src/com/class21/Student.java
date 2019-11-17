package com.class21;

public class Student {


public static void main(String[] args) {
	
	School student1=new School();
	student1.studentName="Eric";
	student1.school="Syntax";
	student1.GPA=3.98;
	
	student1.displayInfo();
	student1.study(5);
	
	School student2=new School();
	student2.studentName="Jamie";
	student2.GPA=3.90;
	student2.school="Syntax";
	
	student1.displayInfo();
	student2.displayInfo();
	
	
}

}
