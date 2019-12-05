package com.class25;

public class TaskArea {
	void area(int num1,int num2) {
		System.out.println((num1*2)+(num2*2));
	}

	void area(int num1) {
		System.out.println(num1*4);
	}
	
	void area(int w,int h,int l) {
		System.out.println(((h+w)*2)+((h+l)*2)+ (2*(w+l)));
	}
}
