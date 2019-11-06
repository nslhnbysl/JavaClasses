package com.class12;

public class StringManupulationsTask {

	public static void main(String[] args) {

		
		/*create to string and initialize them with some value,
		 * implement the following methods on those strings
		 * sen.length()
		 * sen.equals();
		 * sen.contains();
		 * sen.toUpperCase();
		 * sen.toLowerCase();
		 * sen.equalsIgnoreCase(another string);
		 */
		
		String family="Neslihan Imran Ali Burhan";
		String familyHobby="Cooking Music Helicopters";
		
		int familyLength=family.length();
		System.out.println(familyLength);
		System.out.println(family.length());
		System.out.println(family.equals("Neslihan Imran Ali Burhan")); //true
		System.out.println(family.equals("Neslihan"));                  //false
	    System.out.println(family.contains("Ali"));                     //true
	    System.out.println(family.contains("Baysal"));                  //false
	    
	    family=family.toUpperCase();
	    System.out.println(family);       //All letters turn into Uppercase
	    family=family.toLowerCase();
	    System.out.println(family);       //All letters turn into lowercase
	      
		boolean isEqual=family.contentEquals(familyHobby);
		//System.out.println(isEqual);
		
	}

}
