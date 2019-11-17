package com.class20;

public class Canada {

	public static void main(String[] args) {
    USA us1=new USA();//we can use USA without import because we are in same package
    
    System.out.println("Access from Canada Class");
    System.out.println(us1.mainState);
    System.out.println(us1.school);
   // System.out.println(us1.capitalCity);-->gives an error because its protected
    
    
    
	}

}
