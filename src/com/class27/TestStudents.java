package com.class27;

public class TestStudents {

	public static void main(String[] args) {

		Student student1=new Student();
		SyntaxStudents syntax1=new SyntaxStudents();
		//syntax1.study();
		CollegeStudents college1=new CollegeStudents();
		//college1.study();
		SchoolStudent school1=new SchoolStudent();
		//school1.study();
		
		SyntaxStudents syntax2=new SyntaxStudents();
		SyntaxStudents syntax3=new SyntaxStudents();
		
		SyntaxStudents[]array= {syntax1,syntax2,syntax3};
		
		for(int h=0;h<array.length;h++) {
			array[h].study();
			array[h].code();
		}
		System.out.println("___________");
		
		Student cast1=new SyntaxStudents();
		cast1.study();
		cast1.learn();
		//cast1.code(); -->we cannot access it
	
		//cast1.doHomework();-->not visible because this method is private
		
		
		
		
	}

}
