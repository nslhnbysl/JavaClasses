package com.class22;

public class InstanceVariables {
	String name="Samir";//-->instance variable because 
	
public static void main(String[] args) {
	String name="Burcu"; //-->local variable its not visible for entire class its visible just in main method
	
	System.out.println(name);//--> gonna give Burcu because for instance variable we need to create object
	
	InstanceVariables obj=new InstanceVariables();
	System.out.println(obj.name);//-->its Samir because we called it with obj
	obj.name="John";
	System.out.println(obj.name); //-->it changed because we reassigned it but if we create a new object and called the name compiler gives us Samir
	
	InstanceVariables obj1=new InstanceVariables();
	System.out.println(obj1.name);//-->samir because string name in class is not static changes not effected this 
	
	
}
}
