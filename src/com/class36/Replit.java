package com.class36;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Replit {

	public static void main(String[] args) {
//		 Map<String,String>map=new HashMap<>();
//		 
//		 map.put("ONE","AAA");
//		 map.put("TWO","BBB");
//		 map.put("THREE","CCC");
//		 map.put("FOUR","DDD");
//		 map.put("FIVE","EEE");
//
//		 
//		 Set<Entry<String,String>>setEntry=map.entrySet();
//		 Iterator<Entry<String,String>>it=setEntry.iterator();
//		   
//		 while(it.hasNext()){
//		     Entry<String,String>next=it.next();
//		     System.out.println(next.getKey()+ " : "+next.getValue());
//		   }
		  
		 Map <String,Integer>map=new HashMap<>();
		    map.put("mango", 10); 
		    map.put("apple", 30); 
		    map.put("orange", 20); 
		    map.put("mango", 40); 
		    map.put("mango", 40);  
		    
		    map.remove("mango");
		    map.replace("orange", 20);
		    System.out.println(map);
		
		 }
		 
	}


