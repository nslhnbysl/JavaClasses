package com.class24;

public class TeacherTask {
	//Write program for multilevel inheritance where class A inherited by B and class B inherit class by C.
	//Write program to inherit class A that has method printF which is static and call or reuse that method into class B
	//Write a Java program called Teacher. 
	//Identify features and behaviour of that Class. Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher 
	//that would have it their own features and behaviour. Test all 4 classes 

String name;
String lastName;

TeacherTask(){
	
}

TeacherTask(String name,String lastName){
	this.name=name;
	this.lastName=lastName;
}

public void displayInfo() {
	System.out.println(name+lastName);
}

public void teach() {
	System.out.println("teachers always teach us someting");
}



}
