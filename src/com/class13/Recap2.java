package com.class13;

public class Recap2 {

	public static void main(String[] args) {

	String str1="Hello";
	String str2="Hello";
	
	String str3=new String("Bye"); //new keyword means create a new objects so these two is not equals
	String str4=new String("Bye");
	
	System.out.println(str1.equals(str2));//true 
		
	System.out.println(str1==str2);	      //true 

	System.out.println(str3.equals(str4));//true  this is comparing the contents (check details and inside)
	
	System.out.println(str3==str4);       //false this is compares  objects  (check surface)
	
	str1="HeLlo";
	str2="Hello";
	
	System.out.println(str1.equalsIgnoreCase(str2)); //true 
	
	System.out.println(str2.contains("ll"));

	System.out.println("___________");
	String str5="Today is Saturday";
	 
	System.out.println(str5.startsWith("To"));	  //true
	System.out.println(str5.startsWith("today")); //false because of capitilization
	
	System.out.println(str5.endsWith("day"));     //true
	
	
	System.out.println(str5.concat(" and we have java class"));
	
	
	String str6="      It is sunny";
	System.out.println("before trimming "+str6);
	System.out.println(str6.trim());

	String str7="Tomorrow we will be done with String Manupilations";
	
	System.out.println(str7.indexOf('e', 11)); //if it is not present its gonna give -1 ('e',54)
	System.out.println(str7.indexOf("we"));    //9
	
	
	System.out.println(str7.charAt(10)); //e
	
	
	
	
	
	
	
	
		
		
	}

}
