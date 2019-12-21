package com.class38;

public class ThrowsExample {

	static String name="John";
	
	public static void studentSleeping() throws InterruptedException {
		System.out.println("Student is "+name+" is sleeping");
		Thread.sleep(3000);
	}
	
	public static void callingSleepingStudent() throws InterruptedException {
		studentSleeping();
		
	}
	
	public static void callingMore()  {//we gave an responsibility who call the method its gonna be contunie until someone 
		                                                          //get a responsibility to handle it
		try {
			callingSleepingStudent();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) throws InterruptedException  {

		callingSleepingStudent();//we didint want to handle this method and we throwed it 
		callingMore();           //when we call this method no issue because we alrealdy handle the exception 
	}

}
