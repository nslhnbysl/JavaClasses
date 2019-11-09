package com.class15;

public class StringMoreExamples {

	public static void main(String[] args) {

		//4-get character at specific position -->charAt();
		
		String str="Syntax Technologies Inc";
		
		char letter=str.charAt(5);
        System.out.println(letter); //-->gonna return one char at index 5 
        System.out.println(str.length()); //19
        
       // System.out.println(str.charAt(str.length())); exception because length 19 but last index number is 18 out of boundry
        
        System.out.println(str.charAt(str.length()-1)); //-->s 
        
        //get a substring from a string
        
        String substr1=str.substring(0,6);
        System.out.println(substr1);       //Syntax
        
        String substr2=str.substring(7);
        System.out.println(substr2);       //Technologies Inc
        		
        
       

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
