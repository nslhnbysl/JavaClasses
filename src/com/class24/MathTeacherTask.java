package com.class24;

public class MathTeacherTask extends TeacherTask{
	

	int age;
	int salary;
	
	public void learn() {
		System.out.println("teachers should not stop to learn ");
	}
	
	public static void main(String[] args) {
		
		MathTeacherTask obj=new MathTeacherTask();
		
		obj.name="Neslihan";
		obj.lastName="Baysal";
		obj.age=29;
		obj.salary=5000;
		obj.teach();
		obj.learn();
		
		obj.displayInfo();
	}
	public void displayTeacher() {
		System.out.println(name+" "+lastName+" "+age+" "+salary);
	}

}
