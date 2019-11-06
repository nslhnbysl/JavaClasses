package com.class13;

public class ReplaceAll {

	public static void main(String[] args) {

	String str="3446He234566l334l333o";
	//print only text and not numbers 
	System.out.println(str.replaceAll("[0-9]", ""));   //hello
	
	System.out.println(str.replaceAll("[a-z]", ""));   //3446H234566334333
  
	System.out.println(str.replaceAll("[a-zA-Z]", ""));//3446234566334333
	
	
	//remove everyting except text and numbers
	String str2="Hi#$%How$%%^403282393";
	
	System.out.println(str2.replaceAll("[^a-zA-Z0-9]", "")); //HiHow403282393 ^ means to reverse negative 
		
	System.out.println(str2.replaceAll("[a-zA-Z0-9]", ""));	 //#$%$%%^
	
	System.out.println(str2.replaceAll("[^How]", " "));
	
    System.out.println(str2.substring(5, 8));
    
    String name="@#$%^N55-05esl0938738@#$%#@ihan";
    
    System.out.println(name.replaceAll("[^a-zA-Z]","")); //harfler haric digerlerini remove yapti Neslihan oldu sonuc
    
		
		
		
		
		
		
		
		
		
	}

}
