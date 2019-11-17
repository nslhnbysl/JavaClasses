package com.class09;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {

		
		for(int i=1;i<=3;i++) {
			System.out.println(i);
		}
		
		//System.out.println(i);--> we dont know where is the i because we didnt declare , this i belongs to the loop ,
		 
//		 Scanner inp = new Scanner(System.in);
//		    System.out.print("Int:");
//		    int end = inp.nextInt();
//
//		for(int a=0;a<end*2;a++){
//		  System.out.println(a+" ");
//		}

		   
	    for(int a=1;a<=5;a++){
	      for(int b=5;b>a;b--){
	        System.out.print(" ");
	      }for(int c=1;c<=a;c++){
	      System.out.print(a);
	      }
	       System.out.println();
	    }
	    
	    int n = 4;
        for(int i = 0; i < n; i++){
           
           System.out.print('$');
            
            for(int j = 0; j < n-2; j++){
              if(i > 0 && i < n-1){
                System.out.print(" ");
              }
              else{
                System.out.print('$');
              }
          }
          System.out.println('$');
        }
      
    


		
	
		
		
	}

}
