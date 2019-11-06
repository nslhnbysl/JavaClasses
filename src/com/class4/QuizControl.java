package com.class4;

import java.util.Scanner;

public class QuizControl {
	 public static void main (String[] args){
		    
		    Scanner keyboard=new Scanner(System.in);
		    
		   
		    System.out.println("Please Enter First Name");
		    String name=keyboard.nextLine();
		    
			System.out.println("Please Enter Surname");
		    String lastname=keyboard.nextLine();
		    
		   System.out.println("_________________");
		    
		    System.out.println("How old are you");
		    
		    int age=keyboard.nextInt();
		    
		    System.out.println("Your age after 10 years is " +(age+=10)) ;
		    
		    
		    System.out.println("________________");

		    int myNumber=10;
		    
		    int stepOne=myNumber*myNumber;
		  
		    int stepTwo=stepOne+myNumber;
		    
		    int stepThree=stepTwo/myNumber;
		    
		    int stepFour=stepThree+17;
		    
		    int StepFive=stepFour-myNumber;
		    
		    int StepSix=StepFive/6;
		    
		    System.out.println("The magic number is _!");
		    
		    
		    Scanner keyboard1=new Scanner(System.in);
		    
		    int firstNumber=keyboard1.nextInt();
		    System.out.println("Please enter first number");
		    
		    int secondNumber=keyboard1.nextInt();
		    System.out.println("Please enter second number");
		    
		   
		    
		    int month=keyboard.nextInt();
		    
		    if(month==1){
		      System.out.println("January");
		    }else if(month==2){
		      System.out.println("February");
		    }else if(month==3){
		      System.out.println("March");
		    }else if(month==4){
		      System.out.println("April");
		    }else if(month==5){
		      System.out.println("May");
		    }else if(month==6){
		      System.out.println("June");
		    }else if(month==7){
		      System.out.println("July");
		    }else if(month==8){
		      System.out.println("August");
		    }else if(month==9){
		      System.out.println("September");
		    }else if(month==10){
		      System.out.println("October");
		    }else if(month==11){
		      System.out.println("November");
		    }else if(month==12){
		      System.out.println("December");
		    }
		    
		    
		    
		    
		    
		    
		    
		    
}
}