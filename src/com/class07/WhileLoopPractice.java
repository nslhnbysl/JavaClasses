package com.class07;

public class WhileLoopPractice {

	public static void main(String[] args) {

	//how to print numbers from 1 to 20
		
//		int i=1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
//		
//		//i want to print numbers from 10 to 30 all in 1 line
//		
//		int y=10;
//		while(y<=30) {
//			System.out.print(y+ " " );
//			y++;
//		}
//		System.out.println("_________________");
//		//how to print values 10 to 1;
//		
//		int a=10;
//		while(a>=1) {
//			System.out.println(a);
//			a--;
//		}
//		System.out.println("____________________");
//		//print values from50 to 20
//		
//		int b=50;
//		while(b>=20) {
//			System.out.println(b);
//			b--;
//		}
//		System.out.println("____________");
//		//I want to print all even numbers from 1 to 20
//		//1 way-increment value by 2
//		int z=2;
//		while(z<=20) {
//			System.out.println(z);
//			z+=2;
//		}
//		System.out.println("_____________-");
//		//2 way using modulus
//		int q=1;
//		while(q<=20) {
//			if(q%2==0) {
//				System.out.println(q);
//			}
//			q++; // we should add this part in while loop because while loop it still running 
//			     //if we write this part in if statement incrementation never happen 
//		         //
//		
//		}
		
		
		//print only odd number from 50 to 100
		//print only even numbers from 100 to 1
		
		
		int f=51;                               //int f=50;
		                                        
		
		while(f<=100) {                         //while(f<=100){
			                                    //if(f%2==1){
			System.out.println(f);              //System.out.print(f);
			f+=2;                               //}f++;}
		}
		
		int h=100;
		while(h>=1) {
			System.out.println(h);
			
			h-=2;
			
		}
		
		
		
	}

}
