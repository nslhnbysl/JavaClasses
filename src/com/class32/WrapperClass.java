package com.class32;

public class WrapperClass {

	public static void main(String[] args) {

		//int num=100;
		//Autoboxing-->converting primitive type into an object type
		Integer num=100;
		System.out.println(num.MIN_VALUE);//-->there is multiple methods come to after converting
		
		String str=num.toString();  //we converted from int to string
		System.out.println(str);        //will print 100
		//converting boolean primitive type into boolean object type
		Boolean bool=true;
		Byte $b=20;
		System.out.println($b.MAX_VALUE); //--> its gonna give us byte type range and its 127
		
		//Autoboxing -->converting object type into a primitive type
		int num1=new Integer(10);
		System.out.println(num1);
	}

}
