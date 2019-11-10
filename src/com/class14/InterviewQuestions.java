package com.class14;

import java.util.Arrays;

public class InterviewQuestions {

	public static void main(String[] args) {

		// 1-Write a program to swap 2 numbers without a temporary variable?Swap 2
		// strings without a temporary variable?

//		int a=1;
//		int b=2;
//		
//		a+=b;
//		System.out.println(a);
//		b-=a;
//		System.out.println(b); 

		int a = 10;
		int b = 20;

		a = a + b;// 30
		b = a - b;// 10
		a = a - b;// 20

		System.out.println("The value of a " + a); // 20
		System.out.println("The value of b " + b); // 10

		String a1 = "Love";
		String b1 = "You";

		System.out.println("Before swap: " + a1 + " " + b1);

		a1 = a1 + b1;
		b1 = a1.substring(0, a1.length() - b1.length());
		a1 = a1.substring(b1.length());
		System.out.println("After : " + a1 + " " + b1);

		// 2-Write a java program to find the second largest number in the array,max and
		// minimum number in array

		int num[] = { 900, 90, 6, 7, 500, 4, 600, 20, 3 };
		int largest = num[0];
		int secondLargest = num[0];

		for (int i = 0; i < num.length; i++) {
			if (largest < num[i]) {
				secondLargest = largest;
				largest = num[i];
			}
			if (secondLargest < num[i] && num[i] < largest) {
				secondLargest = num[i];

			}
		}
		System.out.println("Largest : " + largest);
		System.out.println("Second Largest : " + secondLargest);

//		int nums[] = { 900, 90, 6, 7, 500, 4, 600, 20, 3 };
//
//		Arrays.sort(nums);
//		int small = num[0];
//		int large = num[nums.length - 1];
//		System.out.println(small);
//		System.out.println(large);

	}
}
