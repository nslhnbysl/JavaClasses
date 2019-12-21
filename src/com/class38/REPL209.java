package com.class38;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class REPL209 {

	public static void display(Map<String,Integer>map){
		   
	   if( !map.isEmpty()){
	    
	     Set<Entry<String,Integer>>f=map.entrySet();
		     for(Entry<String,Integer> fu : f){
		       System.out.println(fu.getKey()+fu.getValue());
		  } }else{
		     System.out.println("map is empty");}}
	    
		  public static void main(String[]args){
		    
		    Map<String,Integer>map=new HashMap<>();
		    
	map.put("mango", 10); 
	map.put("apple", 30); 
	map.put("orange", 20); 

		 display(map);
		    
	 }	
}