package com.class7;

public class DoWhile {

	public static void main(String[] args) {

	int num=10;
	while(num<=15) {
		System.out.println("Hello");            
		num++;
	}
		int num1=10;
		do {
			System.out.println("Bye");
			num1++;
		}while(num1<=12);
		
		System.out.println("___________");
		
		//print even numbers from 20 to 50 using do while
		
		int number=20;
		do {
			System.out.println(number);
			number+=2;
		}while(number<=50);
		//2 way
		do {
			if(number%2==0) {
				System.out.println(number);
			}
			number--;
			
		}while(number>=20);
		
		
		
		
		
		
		
		
		
	}

}
