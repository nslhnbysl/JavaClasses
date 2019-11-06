package com.class8;

public class ForLoop {

	public static void main(String[] args) {

		
	//say good morning 5 times
	//   initilaze  - test condition  - increment
		for(int i=0;     i<=4;             i++) {
			System.out.println("Good Morning");
		}
		
		
	//print numbers from 1-10
	for (int i=1; i<=10; i++) {
		System.out.println(i);
	}
	                                          //--> can we initilaze same variable for many times ?
	                                          //yes because they are in different for loops not in same bucket 
	
	//print numbers from 10-1
	for(int i=10; i>=1; i--) {
		System.out.println(i);
	}
	for(int i=0; i<=50; i+=5) {
		System.out.println(i);	
		
	}
	
	
	//print numbers from 1 to 100 in 1 line with space
	for(int a=1; a<=100; a++) {
		System.out.print(a+" ");
	}

	//print numbers from 100 to 1
	
	for(int a=100;a>=1;a--) {
		System.out.println(a);
	}
	
	//print even numbers from 20 to 1 (2 ways)
	
	for(int a=20;a>=1;a-=2) {
		System.out.println(a);
	}
	
		for (int a = 20; a >= 1; a--) {
			if (a % 2 == 0) {
				System.out.println(a);
			}

		}
	
	//print odd numbers between 20 and 50(2 ways)
		
		for(int a=20;a<=50;a++) {
			if(a%2==1) {
				System.out.println(a);
			}
		}
	
		
		for(int a=21;a<=50;a+=2) {
			System.out.println(a);
		}
	
	int sum=0;
	for(int i=1;i<=5;i++) {
		sum=sum+i;
		System.out.println(sum+"+");
	}
	System.out.println();
	System.out.println(sum);
	System.out.println("*************");
	
	//what is the output
	
	int sumAll=0;
	for(int i=0; i<=20; i+=5) { // 0 5 10 15 20
		sumAll=sumAll+i;        // 0 
	}
	System.out.println(sumAll);
	
	int total=2;
	
	for(int y=1; y<=3;y++) {
		total=total*y;       //2==2*1; 4=2*2; 12=4*3
		
	}System.out.println(total);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}