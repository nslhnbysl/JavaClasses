package com.class24;

public class PianoTeacherTask extends ChemistryTeacherTask{
	
	public static void main(String[] args) {
		
		PianoTeacherTask obj=new PianoTeacherTask();
		
		obj.name="Neslihan";
		obj.lastName="Baysal";
		obj.age=29;
		obj.salary=84930;
		obj.displayTeacher();
		
		obj.teach();
		obj.learn();
	}
	

}
