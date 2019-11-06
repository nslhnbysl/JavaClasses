package com.class10;

public class AllValuesFromArray {

	public static void main(String[] args) {
                      // 0   1   2   3   4   5
		char[] grades= {'A','B','C','D','E','F'};
		
		int a=2;
		System.out.println(grades[a]);//a=2 and it gives you number 2 so C 
		
		a+=2; //2+2=4
		
		System.out.println(grades[a]);// a=4--> it gives E
		a--;
		System.out.println(grades[a]);//a=3-->it gives D
		
		System.out.println(grades[a]);
		
		System.out.println("_____________");
		
		for(int i=0;i<grades.length;i++) {
			System.out.println(grades[i]);
		}
		System.out.println("__________________");
		
		
		String[]animals= {"Cat","Dog","Cow","Snake","Elephant"};
		int size=animals.length;
		//I want to print all values from an array
		//when value is dog-->I love dogs
		
		for(int i=0;i<size;i++) {
			if(animals[i].contentEquals("Dog")) {
				System.out.println("I love dogs");
			}else {
			System.out.println(animals[i]);
		}
		}
//		for(int i=size;i>-1;i--) {
//			System.out.println(animals[i]);
//		}
		
		
		//create an array to store 5 double values,print all elements in 1 line
		
		double[]values= {01.05,02.05,03.05,04.05,05.05};
		
		int size1=values.length;
		
		for(int i=0;i<size1;i++) {
			System.out.print(values[i]+",");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
