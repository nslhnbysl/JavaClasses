package com.class22;

public class AccessingStaticVariables {
public static void main(String[] args) {
	
	Husky obj=new Husky();
	System.out.println(obj.name);//-->null
	System.out.println(Husky.breed);//-->husky
	
	System.out.println(obj.breed);//-->husky we changed this variable value in another class
	                              //because of that we see husky this class clear page completely  and it refers first value husky 
	
    obj.name="Sharik";// this name only belongs this class we cant transfer other class 
                      //we have already have name of sharik but it was on husky class it belongs there 
    

}
}