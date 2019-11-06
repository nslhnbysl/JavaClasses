package com.class9;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*write a guessing game where the user has to guess a secret number between 1 and 20.
		 * After every guess input,the program tells the user whether their number was too large or too small,
		 * the program will keep asking the user to enter the number until he finds the correct number
		 * when the system should display "congratulations you got it"
		 */

	Scanner scan = new Scanner(System.in);
//	int secretNumber=12;                                                //ASK
//	int firstNumber;
//	int secondNumber;
//	int start=0;
//	int end=0;
//	System.out.println("Please enter the start number");
//	firstNumber=scan.nextInt();
//	System.out.println("Please enter end number");
//	secondNumber=scan.nextInt();
//	
//	if(firstNumber<secondNumber) {
//		firstNumber=start;
//		secondNumber=end;
//	}else {
//		firstNumber=end;
//		secondNumber=start;
//	}
//	
//	int even=0;
//	int odd=0;
//	
//	for(int i=start;i<=end;i++) {
//		if(i%2==0) {
//			even=even+i;
//		}else {
//			odd=odd+i;
//		}
//	}
//	System.out.println(even);
//	
//	System.out.println(odd);
	
	
	
	
	
	
	
	
	
	
	

		int secretNumber = 12;
		
		
		
		int guessNumber;
		do {
			System.out.println("Please guess the number ");
			guessNumber = scan.nextInt();
			if (guessNumber > secretNumber) {
				System.out.println("Number is too large");

			} else if (guessNumber < secretNumber) {
				System.out.println("Number is too small");
			} else {
				System.out.println("Congratulations!");
			}

			}while (secretNumber != guessNumber);
		
//		
//		
//		
//		
//		
//		/*write a program that reads a range of integers
//		 * (start and end points) provided by a user and then from that range prints the 
//		 * sum of the even and odd integers
//		 */
//		
//		
//		
//		System.out.println("Please enter start number!");
//		int firstNum = scan.nextInt();
//		System.out.println("Please enter end number!");
//		int secondNum = scan.nextInt();
//
//		
//		int start=0;
//		int end=0;
//		
//		if(firstNum<secondNum) {
//			firstNum=start;
//			secondNum=end;
//			
//		}else {
//			firstNum=end;
//			secondNum=start;
//		}
//			
//		int even = 0;
//		int odd = 0;
//		
//		for (int a = start; a <= end; a++) {
//
//			if (a % 2 == 0) {
//				even = even + a;
//
//			}else {
//				odd = odd + a;
//			}
//		}
//
//			
//
//		System.out.println("The sum of even numbers are "+even);
//         System.out.println("The sum of odd numbers are "+odd);
	}
	

}
