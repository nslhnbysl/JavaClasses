package com.class19;

import java.util.Scanner;

public class Task {
	
	String createEmail(String name,String lastName,String mailType) {
		String mailCreated=name+lastName+mailType;
		return mailCreated;
	}	
	
	    boolean primeNumber(int num1){
	    	
	   	boolean isPrime=true;
	    
	    for(int i=2; i<num1; i++) {
	        if(num1%i==0) {
	            isPrime=false;
	        }
	        }
	    if(num1<2) {
	        System.out.println("Number can not be check");
	    }else if (isPrime) {
	        System.out.println(num1+ " is a Prime number");
	    }else {
	        System.out.println(num1+ " is not a Prime Number");
	       }    
		return isPrime;
	} 
public static void main(String[] args) {
	Task obj=new Task();
	String mailCreated=obj.createEmail("neslihan", "baysal", "@gmail.com");
	System.out.println(mailCreated);
	boolean prime=obj.primeNumber(5);
	System.out.println(prime);
	boolean prime1=obj.primeNumber(12);
	System.out.println(prime1);
}
}
