package com.class36;

import java.util.*;
import java.util.Map.Entry;

public class Recap {

	public static void main(String[] args) {
		//Create a map groceries that will store products and its quantities and we want maintain the insertion order for key

		//Map<K,V>variableName=new MapChildObject<>();
		Map <String,Integer>groceryMap=new LinkedHashMap<>();
		groceryMap.put("Milk",2);
		groceryMap.put("Tea",3);
		groceryMap.put("Onion",5);
		groceryMap.put("Apple",10);

		//retrieve single value
		groceryMap.get("Apple"); //-->first entry always key and we always call it

		//verify if specific key or value is in the map

		groceryMap.containsKey("Milk"); //-->check the contains key 
		groceryMap.containsValue(2);     //-->check the contains value 

		//how to retrieve all values?
		//1st way
		Collection<Integer>values=groceryMap.values(); // first we convert to collection to use iterator 
		//2nd way
		for(Integer val:values){
			System.out.println(val);
		}
		//3nd way
		Iterator<Integer>valIt=values.iterator();
		while(valIt.hasNext()) {
			System.out.println(valIt.next());
		}
		
		//get All key and map them to values(milk-->2)
		//1st way using keyset
		//Set<String>keys=groceryMap.keySet();
		for(String k:groceryMap.keySet()) {
			System.out.println(k.toUpperCase()+"-->"+groceryMap.get(k));
		}
		
		Iterator<String>keyIterator=groceryMap.keySet().iterator();
		while(keyIterator.hasNext()) {
			String itKey=keyIterator.next();
			Integer val=groceryMap.get(itKey);
			System.out.println(itKey.toLowerCase()+"--->"+val);
			
		}
		
		//2nd way EntrySet
		////get All key and map them to values(milk-->2)
		Set<Entry<String,Integer>>entr=groceryMap.entrySet();
		
		//to get an entry object we need to call method-->.entrySet()-->a set of entry objects 
		//entry will have methods:
		//.getKey();-->simply return a key object
		//.getValue();-->return value object
		
		for(Entry<String,Integer>e:entr) {
			System.out.println(e.getKey()+"--->"+e.getValue());
		}
		
		
		
		
 
	}

}
