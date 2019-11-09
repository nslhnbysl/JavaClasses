package com.class13;

public class AllStringMethods {

	public static void main(String[] args) {

		
		/*
    str.isEmpty();
    str.length();
    str.toUpperCase();
    str.toLowerCase();
    str.equals();
    str.equalsIgnoreCase();
    str.contains(s);
    str.startsWith(String prefix);
    str.endsWith(String suffix);
    str.concat(String str);
    str.trim();
    str.charAt(int index);
    str.indexOf(int ch);
    str.replace();
    str.replaceAll();
    str.replaceFirst();
    str.split(regex, limit)
    
		 */
		
		
		String str="Nes?baysal?imran?baysal";
		String array[]=str.split("\\?",4);
		for (String string : array) {
			System.out.println(string);
		}
		
		System.out.println(array.length);
		
		
		
		
		
		
		
		
	}

}
