package com.class6;

import java.util.Scanner;

public class HomeWorkLast {
	public static void main(String[] args) {

		int quiz;
		int midTerm;
		int finalScore;
		int average;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter quiz score");
		quiz = scan.nextInt();
		System.out.println("Please enter midTerm score");
		midTerm = scan.nextInt();
		System.out.println("Please enter final score");
		finalScore = scan.nextInt();
		average = (quiz + midTerm + finalScore) / 3;

		//char grade = scan.next().charAt(0);
		char grade = 0;
		
		if (average >= 90) {
			grade = 'A';
		} else if (average < 90 && average >= 70) {
			grade = 'B';

		} else if (average < 70 && average >= 50) {
			grade = 'C';

		} else if (average < 50) {
			grade = 'D';
		}
		System.out.println(grade);
	}
}
