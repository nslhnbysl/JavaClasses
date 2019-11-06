package com.class12;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {

		int[] array1= {1,2,4,5};
		//System.out.println(array1[2]); 
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		System.out.println("___________");
		
		for(int i:array1) {          //-->advanced loop
			System.out.println(i);  // --> we just print variable of loop we don't use[] and array name
		}
		Scanner scan=new Scanner(System.in); 
		
		int [] array=new int[3];
		
		for(int a=0;a<array.length;a++) {
			array[a]=scan.nextInt();               //-->the way of dtore an inputs in array
		}for (int i = 0; i < array.length; i++) {  //-->this loop for to print what gave an inputs
			System.out.println(array[i]+ " ");
		}
		
		
		
		
		
	}

}
