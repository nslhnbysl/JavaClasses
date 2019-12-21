package com.class35;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {

		HashMap<Integer,String> map=new HashMap<>();
		//to store key+value pair into map 
		
		map.put(101, "John");
		map.put(102, "Neslihan");
		map.put(103, "Ali");
		map.put(104, "Imran");
		
		System.out.println(map);//{101=John, 102=Neslihan, 103=Ali, 104=Imran}
		
		//how to verify if there any elements inside map 
		
		boolean flag=map.isEmpty();
		
		if(!flag) {
			int size=map.size();
			System.out.println(size);
		}
		
		//I want to add more entries 
		
		//map.put("105","Burhan"); -->c.e. because key and value type must be matched 
		
		map.put(105, "Ali");
		
		System.out.println(map); //{101=John, 102=Neslihan, 103=Ali, 104=Imran, 105=Ali} we can add duplicates values 
		
		map.put(102, "Nes");
		System.out.println(map); //{101=John, 102=Nes, 103=Ali, 104=Imran, 105=Ali} we override the entry value we cannot have duplicate keys
		                                                                           //we replaced value but we cannot replace the key 
		
		//how to access value 
		
		String mapElement=map.get(105);
		System.out.println(mapElement); //Ali and its gonna return you 1 value 
		
		//how to replace or update the value
		
		map.replace(103, "Ensar");
		System.out.println(map); //{101=John, 102=Nes, 103=Ensar, 104=Imran, 105=Ali}
		                         //we simply replace from Ali to ensar through use keyword 
		//how to remove an object from a map 
		map.remove(101);
		System.out.println(map); //{102=Nes, 103=Ensar, 104=Imran, 105=Ali} we simply remove 1st entire entry 
	}

}
