package com.class24test;

import com.class24.TaskConstructor;

public class TaskTest {
	public static void main(String[] args) {
		
		
		
// TaskConstructor task1=new TaskConstructor(); give an error because its default 
		
TaskConstructor task2=new TaskConstructor("Neslihan","Baysal",29);//not any error because its public
task2.displayTask();
		
//TaskConstructor task3=new TaskConstructor("Neslihan","Baysal");-->give an error because its protected
//task3.displayTask();
		
//TaskConstructor task4=new TaskConstructor(29);--> give an error because its a private
//task4.displayTask();
	}

}
