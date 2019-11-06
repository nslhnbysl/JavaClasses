package com.class9;

public class Pattern {

	public static void main(String[] args) {

//		for(int k=1;k<=5;k++) {
//			for(int l=1;l<=5;l++) {
//				System.out.println("*"); //when print it its gonna be different line because of ln 
//			}
//		}
		
		// *****
		// *****
		// *****
		// *****
		
		for (int a=1;a<=4;a++) {       //rows
			for(int b=1;b<=5;b++) {    //columns
				
				System.out.print("*"); //-->this is for to print first looping together and after the condition is false 
				                       //add one more code with  () outside the loop and its gonna seperate looping steps
			}
			System.out.println();
		}
		
		
		for(int c=1;c<8;c++) {
			for(int d=1;d<3;d++) {
				System.out.print("Neslihan ");
		}
		System.out.println();
		}
		/* 12345
		 * 12345
		 * 12345
		 * 12345 
		 */
				
		
		for(int m=1;m<=4;m++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
			
		/* 11111
		 * 22222
		 * 33333
		 * 44444
		 * 55555
		 */
		
		for(int i=1;i<6;i++) {
			for(int j=1;j<6;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		/* 123456789
		 * 123456789
		 * 123456789
		 * 123456789
		 * 123456789
		 */
		
		for(int a=1;a<=5;a++) {
			for(int b=a;b<=9;b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		/*54321
		 *54321
		 *54321
		 *54321
		 *54321
		 */
		
		for(int a=1;a<6;a++) {
			for(int b=5;b>=1;b--) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		for(int a=5;a>=1;a--) {
			for(int b=1;b<=5;b++) {
				System.out.print(a);
			}
			System.out.println();
		}
		
		/*  *
		 *  **
		 *  ***
		 *  ****
		 *  *****  
		 */
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
