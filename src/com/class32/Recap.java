package com.class32;

public class Recap {

	public static void main(String[] args) {

		//to store single value
		int num1=10;
		//to store multiple values
		int[] array= {10,20,30};
		
		int[]arr=new int[3]; //-->we must write 3 if we need 3 elements
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		System.out.println(arr[2]);
		
		//to retrieve all values 1 by1
		//using enhanced loop
		
		for(int num:arr) {
			System.out.println(num);
		}
		//using for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//we can store non primitive types:objects
		Fruit f=new Apple(); //-we can give a reference a parent class
		Fruit f1=new Banana();
		Fruit f2=new Orange();
		
		Monkey m1=new Monkey(); //-->can we add this object inside our fruit array ? no because monkey didnt have any extends but think carefully
		
		Object n1=new Apple(); //-->the object class already parent for all classes and we can access throught the object class and we can mix
		Object n2=new Banana();
		Object n3=new Orange();
		Object n4=new Monkey(); //-->and for this way we refered Object class they also participant of object class all classes parent is object class
		
		
		Object[] mixArray= {n1,n2,n3,n4,"Hello"}; //now we can mix if you try to add m1 compiler gives an error 
		 System.out.println();               //if you add f1 compiler gives an error too
		}                                 //for this way we can store different type of values together
	                                      //limitation of array 
}
class Monkey{
	
}
class Fruit{
	
}
class Apple extends Fruit{
	
}class Orange extends Fruit{
	
}class Banana extends Fruit{
	
}