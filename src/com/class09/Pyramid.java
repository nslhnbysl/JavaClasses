package com.class09;

public class Pyramid {

	public static void main(String[] args) {

		
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
		
		/* 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
		
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		/* 1
		 * 22
		 * 333
		 * 4444
		 * 55555
		 * 666666
		 * 7777777
		 * 88888888
		 * 999999999
		 */
		
		for(int a=1;a<=9;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print(a);
			}
			System.out.println();
		}
		
		for(int a=5;a>=1;a--) {                //ASK if I want this   54321
			for(int b=a;b>=1;b--) {                                //  4321
				System.out.print(b);                               //   321
			}                                                      //    21
			System.out.println();                                  //     1
		}
		
		
		
	}

}
