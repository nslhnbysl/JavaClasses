package com.class10;

import java.util.Scanner;

public class ArrayIntro {

	public static void main(String[] args) {
//1 way 
		int[] b; //declare an array(most common)
		int c[]; //declare an array(this is also correct)
		
		b=new int[4];//initilize an array
		
		//2 way-->all in 1 line(declaration&initilization)
		int[]array=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		
		//access value from an array
		System.out.println(array[2]);
		
		//lets create an array that will store classes
		
		String[] classes=new String[4];
		
		classes[0]="Java";
		classes[1]="SDLC";
		classes[2]="Manuel Testing";
		classes[3]="GIT";
		
		//Today we have java class
		System.out.println("Today we have "+classes[0]);
		
		
		int[] nums=new int[3];
		
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		//how can change 1 to 100
		nums[0]=100;
		System.out.println(nums[0]);
		System.out.println(nums[0]+nums[2]);//100+3   103
		
		
		
		String[] names=new String[3];
		
		names[1]="Seda";
		names[2]="Jamie";
		//names[3]="Olga";-->during the run time we will get exception
		System.out.println(names[0]); //compiler gives you--> null(default value)
		
		double[] numbers=new double[4];
		numbers[1]=100;
		numbers[3]=200; 
		System.out.println(numbers[2]);//its will give you 0.0
		
		System.out.println(numbers[1]);//it will give you 100.0
		
		
		
		

	
		
		
		
		
		
		
		
	}

}
