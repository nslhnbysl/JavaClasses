package com.class36;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TaskPerson {
//Create a Person class with following private fields: name, lastName, age, salary.Variables should be initialized through constructor.
//Inside the class also create a method to print user details.
//In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.
		
	private String name,lastName;
	private int age,salary;
	

		
	 TaskPerson(String name,String lastName,int age,int salary){
		this.name=name;
		this.lastName=lastName;
		this.age=age;
		this.salary=salary;
	}	
	  public void display() {
		  System.out.println("The student name="+name+" lastname="+lastName+" age="+" salary="+salary);
	  }

	  public static void main(String[] args) {
		
		  Map<Integer,TaskPerson>map=new LinkedHashMap<>();
			
			map.put(1, new TaskPerson("Neslihan","Baysal",30,130000));
			map.put(2, new TaskPerson("Imran","Baysal",30,190000));
			map.put(3, new TaskPerson("Kenan","Baysal",30,140000));
			map.put(4, new TaskPerson("Ali","Baysal",30,0));
			
			Iterator<Integer> keyMap=map.keySet().iterator();
			while(keyMap.hasNext()) {
				Integer key=keyMap.next();
				System.out.println(key+"--> "+map.get(key).name+map.get(key).lastName);
				map.get(key).display();
			}
	  
	  
	  
	  
	  }
 
}