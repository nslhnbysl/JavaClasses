package com.class7;

public class WhileLoop {

	public static void main(String[] args) {
		int time = 8;
		if (time < 12) {// condition is true
			System.out.println("Good Morning");// code executes 1 time
		} // 8<12 its true and jump 12ln and again jump 12 print it make it 4 times
		System.out.println("________________");
		while (time < 12) {// if condition is true print to below
			System.out.println("Good Morning");// code executes infinitely-->infinite loop(there is no stop)
			time++; // increment allows to add1 and repeat from8 to 12 its gonna print 4 times
		}

		//I want to print GA 5 times
		
		
		int i=12;
		while(i<17) {
			System.out.println("Good Afternoon");
		}
		System.out.println("outside of while loop");//if condition is false for ex= int i=12; while(i<5)
		
		
		
		
		
		
	}
}