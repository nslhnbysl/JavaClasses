package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {

		int[] nums=new int[4];
		
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;
		
		System.out.println(nums.length);//its gonna simply give you have many elements you have
		                                //to find number of elements inside an array
		
		//2nd way to declare
		               // 0        1        2       3
		String[] array= {"Winter","Fall","Summer","Spring"};
		//I was born in Summer
		System.out.println("Iwas born in "+array[2]);
		System.out.println(array.length);
		int arraySize=array.length; // the way to declare length ,will return an integer 
		
		int[] score= {80,90,70,100,99};
		
		
	}

}
