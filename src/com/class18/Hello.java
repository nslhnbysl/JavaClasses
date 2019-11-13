package com.class18;

public class Hello {
	
	public static void main(String[] args) {
		
	Hello obj=new Hello();
	obj.sayHello("Asel");
	obj.sayHello("Neslihan");	
	obj.sayHelloDifferentLanguage("USA");//hello
	obj.sayHelloDifferentLanguage("Russia");//hello
	obj.sayHelloDifferentLanguage("ParaGuay");
	obj.sayHelloDifferentLanguage("Turkey");
	obj.sayHelloDifferentLanguage("Spain");
	obj.sayNameAndAge("Neslihan", 30);
	obj.isSnowing(true);
	}
	
/*create a method that will say hello in different language based on the value
 * that will be passed when user calls a method
 */
void sayHello(String name) {
		System.out.println("Hello "+name);
	}	
void sayHelloDifferentLanguage(String country) {
	
	switch(country.toLowerCase()) {
	case"usa":
		System.out.println("Hello");
	break;
	case"russia":
		System.out.println("Privet");
	break;
	case"paraguay":
		System.out.println("Hola");
	break;
	case"albania":
		System.out.println("Pershendetje");
	break;
	default:
		System.out.println("I do not know how to say hello in your language");
	}
}
	

//method to say name and age

void sayNameAndAge(String name,int age) {
	System.out.println("My name is "+name+" and I am "+age+" years old");
}

//create a method that will check if it snowing 
//if it snow-->stay at home,otherwise go for a walk 

void isSnowing(boolean isSnowing) {//method header we have method name+parameters

if(isSnowing) {
	System.out.println("Stay at home");
}else {
	System.out.println("Go for a walk");
}
}



}