package com.class03;

public class RelationalOperators {

	public static void main(String[] args) {
	
		int num1=20;
		int num2=19;
		
		System.out.println(num1>num2);
        System.out.println(num1<num2);
        
       double d=1.99;
       double d1=2.99;
       
       boolean b5=d>d1;
       System.out.println(b5);//false
       
       boolean b1=d<d1;
       boolean b2=d==d1;
       boolean b3=d!=d1;
       System.out.println(b1);//true
       System.out.println(b2);//false
       System.out.println(b3);//true
       System.out.println("############");
       
       
       int a=90;
       int b=300;
       //if number a bigger than number b 
       //I want to print a is larger than b
       
      if (a>b) {
     System.out.println("a is larger than b");
     }else {
      System.out.println("a is smaller than b");
     }
      
     int expectedHours=15;
     int actualHours=2;
     //if expected hours are more than actual->you will succeed
     //otherwise, please study more
     
     if(actualHours>expectedHours) {
    	 System.out.println("you will succeed");
     }else {
         System.out.println("please study more");
     }
   
     double teaPrice=4.99;
     double allowedPrice=3.99;
     
     //if price more than I can afford I will Not buy
     //if price is less or matches what I can afford then I will buy tea
     
     if(allowedPrice<=teaPrice) {
    	 System.out.println("I will buy tea");
    	 System.out.println("And I will enjoy tea");
     }else {
    	 System.out.println("I cannot afford, I need to study more");
    	 System.out.println("I will go back to study more");
     }
         System.out.println("I keep writing some code");
    	  
        boolean val=false;
        if(val){//if value==true
        System.out.println("Hello");	
        }else {//if value==false
       	System.out.println("Bye");
        	 }
  
    	boolean isRain=false;
    	//if it is raining I will take umbrella,otherwise I go for a walk
    	
    	if(isRain) {
    		System.out.println("I will take umbrella");
    	}else {
    		System.out.println("I go for a walk");
    	}
      
       
       
       
       
       
       
       
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
