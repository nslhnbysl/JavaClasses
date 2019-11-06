package com.class14;

public class SplitMethod2 {

	public static void main(String[] args) {
 
		//how to seperate comma delimited string
		
		String str="If you come to class early,"
				+ "then you can study more, also you can learn more, "
				+ "and you can leave early";
		
		//(it returned from string to array and with split you seperated to sentences )
		String []array=str.split(",");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].trim());  //If you come to class early
			                                      //then you can study more
			                                      //also you can learn more
                                                  //and you can leave early
		
		}
		System.out.println("_________________");
		
		//
		
		String str1="Welcome To Syntax Technologies";
		String[]array2=str1.split(" ",4); //the number shows you how many sentences you have for seperately
		System.out.println(array2.length);
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);   //Welcome
			                                 //To
			                                 //Syntax 
			                                 //Technologies

		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
