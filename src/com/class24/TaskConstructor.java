package com.class24;

public class TaskConstructor {
	
	String name,lastName;
	int age;
	
	 TaskConstructor(){
		
	}
	
	public TaskConstructor(String name1,String lastName1,int age1){
		name=name1;
		lastName=lastName1;
		age=age1;
	}
	
	protected TaskConstructor(String name1,String lastName1) {
		name=name1;
		lastName=lastName1;
	}
	private TaskConstructor(int age1) {
		age=age1;
	}
	
	public void displayTask() {
		System.out.println(name+" "+lastName+" "+age);
	}
	
	//static TaskConstructor() { -->we cant use any non access modifiers on consrtructors 
		
	
	
	public static void main(String[] args) {
		
		TaskConstructor task1=new TaskConstructor();
		
		TaskConstructor task2=new TaskConstructor("Neslihan","Baysal",29);
		task2.displayTask();
		
		TaskConstructor task3=new TaskConstructor("Neslihan","Baysal");
		task3.displayTask();
		
		TaskConstructor task4=new TaskConstructor(29);
		task4.displayTask();
		
		
	}

}
