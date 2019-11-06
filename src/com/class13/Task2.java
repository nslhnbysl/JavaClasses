package com.class13;

public class Task2 {

	public static void main(String[] args) {
		
	//create a string and print it in reverse order(Sudnay-->yadnuS)
	String day="Sunday";
	
	for(int a=day.length()-1;a>=0;a--) {
		System.out.print(day.charAt(a));
	}
		
	System.out.println();	
		
		
		String name="Neslihan Baysal";
		String nameDiv=name.substring(name.length()/2);
		
		if(!(name.isEmpty())) {
			for (int i = 0; i < nameDiv.length(); i++) {
			if(i%2==1 && nameDiv.length()>=3 ) {
				System.out.println(nameDiv.charAt(i));
			}
			}
		}
		
		/*
         * Create a String and if the String is not empty perform the following: if the
         * String has an odd number of characters and has 3 or more characters, print
         * the character in the middle of the String.
         */
        
    
        //
        String str1="Neslihan Baysal";
        
        int lenght=str1.length();
        int middle=str1.length()/2;
        
        System.out.println();
        if(!str1.isEmpty()) {
            if(lenght%2!=0 && lenght>=3) {
                System.out.println(str1.charAt(middle));
            
            }
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
