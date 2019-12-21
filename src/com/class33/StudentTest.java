package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	String name;
	int studentId;
	
	public Student(String name,int studentId){
		this.name=name;
		this.studentId=studentId;
	}
	
	public void display() {
		System.out.println("My name is "+name+" and my student ID is "+studentId);
	}
}

public class StudentTest {

	public static void main(String[] args) {
		//lets create an arraylist that will store student type of objects
		
		List<Student> students=new ArrayList<>(); //we created arraylist type of Student
		
		Student stu=new Student("John",101);
		Student stu1=new Student("Jane",102);
		Student stu2=new Student("Jack",103); //we created Student type of 3 objects 

		students.add(stu); //we added our Student type of objects inside the arraylist
		students.add(stu1);
		students.add(stu2);
		
		//display info of each student
		for(Student student:students) {
			student.display();
		}
		//adding more objects of a student type    //simple way to add new object and at the same time create new object 
		students.add(new Student("Michael",104));//-->we can add more students directly inside this we can create new objects 
		students.add(new Student("David",105));
		students.add(new Student("Neslihan",106));
		
	    //display into of each student
		
		Iterator<Student>myIterator=students.iterator();
		while(myIterator.hasNext()) {
			myIterator.next().display();
		}
		
	}

}
