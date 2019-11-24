package com.class24;

public class ChemistryTeacherTask extends MathTeacherTask{

	
	ChemistryTeacherTask(String name,String lastName,int age,int salary){
		this.name=name;
		this.lastName=lastName;
		this.age=age;
		this.salary=salary;
	}
	ChemistryTeacherTask(){
		
	}
	
	public static void main(String[] args) {
		
	
	ChemistryTeacherTask obj=new ChemistryTeacherTask("Neslihan", "Baysal", 29, 5000);
	obj.displayTeacher();
	
}
}