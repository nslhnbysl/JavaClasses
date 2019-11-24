package com.class23;

public class TaskStudent {
	    //Write a java program of Class Students that takes students name and 3 subject grades.
		//Inside your class also have a method to Calculate Average Grade.
		//Test Student class for 5 different students with different marks.
		//Your program should print an average mark of each students name.
		//NOTE: please use different names for instance and local variables.
	
	String name;
	int math;
	int history;
	int chemistry;
	
	TaskStudent(String nameOfStudent,int gradeOfMath,int gradeOfHistory,int gradeOfChemistry){
		name=nameOfStudent;
		math=gradeOfMath;
		history=gradeOfHistory;
		chemistry=gradeOfChemistry;
		
	}
	
	public  void averageGrade() {
		int average=(math+history+chemistry)/3;
		System.out.println(name+"'s average grade for math,history and chemistry is= "+average);
		
	}
	public static void main(String[] args) {
		
		TaskStudent student1=new TaskStudent("neslihan", 85, 100, 70);
		student1.averageGrade();
		
		TaskStudent student2=new TaskStudent("ali",76,98,78);
		student2.averageGrade();
		
		TaskStudent student3=new TaskStudent("Imran",45,78,88);
		student3.averageGrade();
		
		TaskStudent student4=new TaskStudent("zeynep",45,89,33);
		student4.averageGrade();
		
		TaskStudent student5=new TaskStudent("osman",67,33,78);
		student5.averageGrade();
	}
	

}
