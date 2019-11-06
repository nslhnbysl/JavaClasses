package com.class11;

import java.util.Arrays;

public class ArrayManipulation {

	public static void main(String[] args) {

		
		String[] actualNames= {"John", "Smith","Alex","Tanaz"};
        Arrays.sort(actualNames);
        
        String[] expectedNames= { "Smith","John","Alex","Tanaz"};
        
        //To sort the elements of an Array
        Arrays.sort(expectedNames);
        
        System.out.println(Arrays.toString(actualNames));
        
        String actual=Arrays.toString(actualNames);
        String expected=Arrays.toString(expectedNames);
        
        System.out.println(actual.equals(expected));
		
		
        String []firstName= {"Nesli","Ali","Imran"};
        
        		Arrays.sort(firstName);
        		for(String a:firstName) {
        			System.out.print(a);
        			System.out.println();
        		}
		 
		
		int[] numbers= {123,34,57,23,99};
		
		
		for (int i:numbers) {
			System.out.print(i+" ");
		}
        System.out.println();		
		
        Arrays.sort(numbers);   //to organize values from small to big
		for(int i:numbers) {
			System.out.print(i+" ");
		}
		
		
		
		
		
		
	}

}
