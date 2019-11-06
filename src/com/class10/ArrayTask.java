package com.class10;

public class ArrayTask {

	public static void main(String[] args) {

		
		//Create an array of chars and store grades into it: A,B,C,D,E,F.
		//Then print a grade B (use 2 different ways of creating an array).
		
		
		char[] grade= {'A','B','C','D','E','F'};
		System.out.println(grade[1]);
		
		char[]grade2=new char[6];
		 grade2[0]='A';
		 grade2[1]='B';
		 grade2[2]='C';
		 grade2[3]='D';
		 grade2[4]='E';
		 grade2[5]='F';
		
		 System.out.println(grade[1]);


		//Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).

		 String []name= {"Maria","Gulnur","Burcu","Juliana","Neslihan"};
		 System.out.println(name[4]);
		 
		 String[]names=new String[5];
		 names[0]="Neslihan";
		 names[1]="Maria";
		 names[2]="Gulnur";
		 names[3]="Burcu";
		 names[4]="Juliana";
		 System.out.println(names[0]);
		 
		  

		//Create an array of words: Java, Saturday, day, coding, is. 
		//Print the following sentence using element of array: “Saturday is Java coding Day”. 
		
		String []w= {"Java","Saturday","day","coding","is"};
		System.out.println(w[1]+" "+w[4]+" " +w[0]+" " +w[3] +" "+w[2]);
		
		int arraySize=w.length;
		System.out.println(arraySize);
	
	}
}
