package com.class7;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
/*you need to ask user to pay for coffee
 *you need to keep asking user to pay for it (please pay your coffee)
 *until entered price is=5;
 *after user paid then say "Enjoy your coffee!"
 * 
 */
	Scanner scan=new Scanner(System.in);
	
	//FIRST WAY
      double price;
	
	do {
		System.out.println("Please pay your coffee");
		price=scan.nextInt();
		                     //price++;           //its not neccessary because you already give a value(price)
	}while(price!=5);                            //everytime price gonna be different we dont need increment
	                                             
	
System.out.println("Enjoy your coffee");
	
//SECOND WAY
	
 double price1;
System.out.println("Please pay your coffee");
price1=scan.nextInt();

while(price1!=5) {
	System.out.println("Please pay your coffee");
	price1=scan.nextInt();
}










}
}