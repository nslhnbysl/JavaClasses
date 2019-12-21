package com.class36;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TaskEmployee {

	public static void main(String[] args) {
		//Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary.
		//in the below format John Smith=$100000 Output should be
		
		Map<String,Integer>map=new TreeMap<>();
		map.put("Neslihan", 90000);
		map.put("Ali", 40000);
		map.put("Imran", 80000);
		map.put("John", 100000);
		
		Set<Entry<String,Integer>>employee=map.entrySet();
		int max=map.get("Neslihan");
		for(Entry<String,Integer> empl:employee ) {
			int salary=empl.getValue();
			if(salary>max) {
				max=salary;	
				System.out.println(empl.getKey()+"="+empl.getValue());
			}
		}

		
	}

}
