package com.class12;

public class TwoArrayDemoRecap {

	public static void main(String[] args) {

		int[][]array1=new int[2][3];
		
		//first row
		array1[0][0]=9;
		array1[0][1]=4;
		array1[0][2]=2;
		//second row
		array1[1][0]=9;
		array1[1][1]=4;
		array1[1][2]=2;
		
		//1st way to advanced loop
		for(int i[]:array1) {       
			for(int a:i) {
				System.out.print(a+" ");
			}
		}
		System.out.println();
		//second way to use for loop with length 
		for(int a=0;a<array1.length;a++) {
			for(int b=0;b<array1[a].length;b++) {
				System.out.print(array1[a][b]+" ");
			}
		}
		System.out.println();
		int [][]array2= {
				{2,5,4,3},
				{5,6,8,4},
		};
			
		for(int a[]:array2) {
			for(int b:a) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		}
		
	}


