package com.class38;

public class FinallyBlock {

	public static void main(String[] args) {


		String str="Hello";
		
		try{
		char character=str.charAt(5);
		System.out.println(character);
		}catch(StringIndexOutOfBoundsException e){
			e.printStackTrace();
		}finally {     //it will execute no matter what even in exception 
		
			System.out.println("I am a finally block");
		}
		System.out.println("end of the code");
	}

}
