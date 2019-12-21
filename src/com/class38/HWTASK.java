package com.class38;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HWTASK {

	
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number of students: ");

		 int students = scan.nextInt(); 

		 while (students <= 0) {

		     try {

		        System.out.print("Enter the number of students: ");

		        students = scan.nextInt();

		     }

		     catch (InputMismatchException e) {

		        System.out.print("Enter the number of students");

		     }
		 }    
	}

}
