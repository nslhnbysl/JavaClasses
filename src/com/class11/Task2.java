package com.class11;

public class Task2 {
public static void main(String[] args) {
	
	//Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
	//Develop a program which will identify/print the even numbers only.
	
	
	int[][]abb={
			{3,56,32,56},
			{2,5,8,90},
			{8,2,6,8}};
	
	
	for(int i=0;i<abb.length;i++) {
		for(int j=0;j<abb[i].length;j++) {
			if(j%2==0) {
				System.out.print(j);
			}
			}
	System.out.println();
	}
	
	
	
//Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.
	
	int[][] array= {{1,2,3},{3,4,5},{6,7,8}};
	
	int sum=0;
	//1st way 
	for(int a=0;a<array.length;a++) {
		for(int b=0;b<array[a].length;b++) {
			sum=sum+array[a][b];
		}
		System.out.println();
	}
	System.out.println("The sum of array is " +sum);
	
	//2nd way
	int sum1=0;
	for(int nums[]:array) {
		for(int getNum:nums) {
			sum1+=getNum;
		}
	}
	
	System.out.println("The sum of array is "+ sum1);
	
	
	
}
}
