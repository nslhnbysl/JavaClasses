package com.class11;

public class TwoDimensionalArrays {
	public static void main(String[] args) {
		
//declare 2D Array
		
		int[][] array=new int[3][4];
		
//1st row 
		array[0][0]=44;
		array[0][1]=21;
		array[0][2]=65;
		array[0][3]=41;
		
//2nd row
		array[1][0]=10;
		array[1][1]=56;
		array[1][2]=87;
		array[1][3]=13;
//3rd row
		array[2][0]=32;
		array[2][1]=10;
		array[2][2]=10;
		array[2][3]=10;
	
		System.out.println(array[0]); //its gonna give an error
		System.out.println(array[0][2]);//its gonna give you 65
		
		//task create 2d array of string with 2 rows and 3 columns
		
		
		String[][]abb=new String[2][3];
		abb[0][2]="Ali Burhan Baysal";
		System.out.println(abb[0][2]);
		System.out.println("___________");
		
		
//declare 2d array 2nd way
		
		int[][] numbers= {
				{3,4,6,7,5},
				{4,2,4,5,3,9},
				{3,4,5,6,3},
		};
		
		System.out.println(numbers[1][4]); //3
		
		//to identify numbers of rows
		System.out.println(numbers.length);
		System.out.println("__________");
		//to identify numbers of columns/elements
		System.out.println(numbers[1].length);//we should write bigger number of index in row 
		System.out.println("*********");
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
