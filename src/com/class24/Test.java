package com.class24;

public class Test {
public static void main(String[] args) {
	
	Child1 child1=new Child1();
	System.out.println(child1.race);
	System.out.println(child1.haircolor);
	System.out.println(child1.eyeColor);
	child1.sing();
	child1.code();
	
	Parent parent=new Parent();
	System.out.println(parent.haircolor);
	System.out.println(parent.eyeColor);
	System.out.println(Parent.race);
	parent.sing();
	//parent.code();-->give an error because its belongs class child1 and the parent class not extends with it 
	
	Child2 child2=new Child2();
	child2.eyeColor="blue";
	System.out.println(child2.eyeColor);
	child2.haircolor="yellow";
	System.out.println(child2.haircolor);
	System.out.println(child2.race);
	child2.design();
	child2.sing();
	
	
	
}
}
