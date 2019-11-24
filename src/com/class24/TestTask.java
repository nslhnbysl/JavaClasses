package com.class24;

public class TestTask {

	public static void main(String[] args) {
TaskConstructor task1=new TaskConstructor();
		
		TaskConstructor task2=new TaskConstructor("Neslihan","Baysal",29);
		task2.displayTask();
		
		TaskConstructor task3=new TaskConstructor("Neslihan","Baysal");
		task3.displayTask();
		
		//TaskConstructor task4=new TaskConstructor(29);-->because it is a private access modifier
		//task4.displayTask();
	}

}
