package com.class11;

public class Recap {

	public static void main(String[] args) {

	int num1=12;
	int num2=14;
	int num3=16;
	
	int num4=13, num5=50, num6=33;
	
	int a,b,c,d;
	
	a=12;
	b=33;
	
	//Array declaration:
	  int [] h,u;
	//int h[],u; it will give you error because array contains just h 
	  
	  int[]numbersList= {2,3,5,7};
		
	   //  1       2,5     4,7
	for(int s=0;s<numbersList.length;s++) { //shortcut to create ctrl+space
		//3,6
		System.out.println(numbersList[s]);
	}
	System.out.println("________");
		
	
	//for each loop,advanced loop 
	
 for(int element:numbersList) {
	 System.out.print(element+" ");
 }
	
 //in array we can NOT change the index number after loop print work
 
		
		
		
		
		
		
		
		
	}

}
