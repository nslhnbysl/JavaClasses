package com.class20_andrei;

import com.class20.USA;

public class Mexico {
	public static void main(String[] args) {
	
		USA us2=new USA(); //we import it because class is public 
		                   //if it is not public we cant use USA class
		System.out.println("Access from Mexico Class");
		System.out.println(us2.mainState);//we can access this because its public 
		//System.out.println(us2.capitalCity); gives an error because capitalCity is private it works just in same class
		//System.out.println(us2.school); gives an error because its protected it works just in same package 
		
		
	//when USA is default(class USA)
	//I cannot access USA class because they are in different packages and class is not public
	//we need to go inside USA before mainState and then if USA be non public we CANNOT go in mainState or anyting inside USA
		
	}

}
