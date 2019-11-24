package com.class24;

public class ThisKeyword {
	int a,b;
	
	ThisKeyword(int a,int b){
		this.a=a;
		this.b=b;
		}
	ThisKeyword(){
		System.out.println("I am non argument constructor");
	}
	
	public void sum(int a,int b) {
		System.out.println("The sum of local parameters is="+(a+b));
		System.out.println("The sum of instance variables is="+(this.a+this.b));
	}
	public void sayA() {
		System.out.println(a);
		System.out.println();
	}
	public void sayB() {
		System.out.println(b);
	}
	public void sayAandB() {
		this.sayA();
		sayB();      //compiler adds this automatically-->this.sayB();
	}
	
	
public static void main(String[] args) {
	ThisKeyword obj=new ThisKeyword(15,20);
	obj.sayA();
	obj.sayB();
	obj.sayAandB();
	obj.sum(10, 10);
	
	ThisKeyword obj1=new ThisKeyword();
	obj1.sum(100, 200);
	
}
}
