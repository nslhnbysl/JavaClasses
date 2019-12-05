package com.class27;

public class Student {
	public void study() {
		System.out.println("Students always study");
	}
	protected void learn() {
		System.out.println("Smart students learn easier");
	}
	private void doHomework() {
		System.out.println("Students need to do homework");
	}
	

}
class SyntaxStudents extends Student{
	@Override
	public void study() {
		System.out.println("Syntax students always study");
	}
	void code() {
		System.out.println("Students are coding now");
	}
	//@Override if we add override compiler gives an error because private modifier is not accesible for the others classes 
	private void doHomework() {//it works because we created totaly new method external previous method
		System.out.println("Syntax Students need to do homework");
	}
	
}
class CollegeStudents extends Student{
	public void study() {
		System.out.println("College students always study");
	}
	void grade() {
		System.out.println("college students need higher grades to reach the goals");
	}
	
}
class SchoolStudent extends Student{
	public void study() {
		System.out.println("School Students always study");
	}
	
}