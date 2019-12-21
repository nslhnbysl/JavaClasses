package com.class36;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TaskCity {

	public static void main(String[] args) {

//Create a Map from array of cities that will sort keys in alphabetical order. As a key store the name of the city and as a value store the
//length of the city(Example: Paris=5, Moscow =6, Washington DC=13 etc..)If any city name is more than 7 characters 
//remove that city ( use Iterator ).


		
		 String[] city = {"Istanbul", "Irvine" , "Venice", "Tokyo", "Niamey", "Luxembourg"};
	        Map<String , Integer> cityMap = new TreeMap<>();
	        
	        for(String s : city) {
	            cityMap.put(s, s.length());
	        }
	        
	        
	        Set<Entry<String, Integer>> cities = cityMap.entrySet();
	        System.out.println(cities);
	        
	        Iterator<Entry<String, Integer>> itr = cities.iterator();
	        while(itr.hasNext()) {
	            Entry<String, Integer> e = itr.next();
	            Integer length = e.getValue();
	            String name = e.getKey();
	            
	            if(length > 7) {
	                itr.remove();
	            }
	        }
	        
	        System.out.println(cities);
	        
	        
	        

		
		
	}

}
