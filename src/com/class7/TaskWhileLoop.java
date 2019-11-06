package com.class7;

public class TaskWhileLoop {

	public static void main(String[] args) {

		boolean workDay=true;
		int day=1;
		
//		while(day<=5) {
//		if(workDay) {
//			System.out.println("I need a day off");
//			if(day==6) {
//				System.out.println("I don't need a day off any more");
//			}
//		
//		}
//		
//		day++;
//		
//		}
		
		while(workDay) {//if this part true its gonna be print to 1 from 5 because if statement refer with 6
			            //if number gonna be 6 if statement gonna be true and print its output
			if(day==6) {  
				workDay=false;//we simply change the value because to stop print    //break;   we can use instead of convert the condition
				System.out.println("I do not need a day of anymore");
			}else {
			System.out.println("I need a day off");	
				
			}
			day++;
		}
}
}