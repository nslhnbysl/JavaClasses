package com.class12;

public class StringManupilations2 {

	public static void main(String[] args) {

	     //startsWith()  --this method test if a string starts with the specified prefix beginning
		
		String str2="It is very hot today";
		System.out.println("Is this string start with= "+str2.startsWith("It"));//its gonna turn into boolean 
		
		System.out.println("***********");
		
		//endsWith   --this method tests if this string ends with the specifies suffix
		
		System.out.println("Is this string ends with ="+str2.endsWith("today"));//its gonna be true 
		String abb=("Ali Burhan Baysal is my best friend");
		String n="Neslihan";
	    
	    System.out.println(abb.endsWith("d"));          //-->true
	    System.out.println(abb.endsWith("friend"));     //-->true
	    System.out.println(abb.endsWith("best friend"));//-->true
	    System.out.println(abb.endsWith("Ali Burhan Baysal is my best friend"));//-->true
		System.out.println(n.endsWith("han"));          //-->true
		System.out.println(n.endsWith("Neslihan"));     //-->true
		//isEmpty()-- this method check whether a string is empty or not
		//this method returns true if the given string is empty else it returns false
		
		String str=" ";
		System.out.println("Is this string empty= \n "+str.isEmpty());//\n is add one line 
		String str1="Hello";
		System.out.println("Is this string empty=\n"+str1.isEmpty());
		System.out.println();
		if(!str.isEmpty()) {
			System.out.println("This is not empty");
		}else {
			System.out.println("This is empty");
		}
		
		// \n
		String sentence="Each day has a promise to brigten up the day,\nBut first you must all ";
		
		System.out.println(sentence);
		
		System.out.println("*******************");
		
		//.concat()-->this method to concatenation string 
		String str3="Hello";
		String str4=" World";
		String str5=" People";
		System.out.println(str3+str4+str5);           //string concatenation 1st way
		
		System.out.println(str3.concat(str4).concat(str5));   //string concatenation 2nd way
		
		//trim()-->this method returns a copy of the string,with leading and trailing whitespace omitted
		
		String str6=" How are you";
		System.out.println(str6.trim());
		
		//charAt()--->    this method returns the character located at the strings specifies index,
		//the string indexes start from 0
		
		String str7="We might be done early today";
		
		System.out.println(str7.charAt(4)); //its gonna be i because 4 index is i 
		//System.out.println(str7.charAt(33));//its gonna be exception error because we dont have index 33
		System.out.println("______________");
		
		//indexOf()-->  this method returns the index within this string of the first occurance of the specified char or -1
		//if the character does not occur
		
		String str8="We might not be done early";
		System.out.println(str8.indexOf('m')); //its give 3 (index number)
		System.out.println(str8.indexOf('e',3));//it gives 14 because we pointed for start after number of 3 index
		System.out.println(str8.indexOf('m',76));//it gives -1 
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
