package com.class21;

public class Students {
//	2. Create a Class called Students
//	● Create three variables studentName , studentID and numberOfStudents
//	● Create three objects of the Students Class
//	● Set the value for studentName , studentID and increment the numberOfStudents for each object
//	● Print out total number of students
	
	public String studentName;
	public static int numberOfStudents=0;
	int studentID;
	public void displayStudent() {
		System.out.println("The total number of students "+numberOfStudents);
	}
	
	public static void main(String[] args) {
		Students student1=new Students();
		Students student2=new Students();
		Students student3=new Students();
		student1.studentName="Neslihan";
		student1.studentID=5455;
		student1.numberOfStudents++;
		student1.displayStudent();
		student2.studentName="Ali";
		student2.studentID=3422;
		student2.numberOfStudents++;
		student2.displayStudent();
		student3.studentName="Imran";
		student3.studentID=8493;
		student3.numberOfStudents++;
		student3.displayStudent();
		student1.displayStudent();
		
		
	}
}
