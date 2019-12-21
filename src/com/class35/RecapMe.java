package com.class35;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RecapMe {

	public static void main(String[] args) {

		Map<Integer,String>map=new LinkedHashMap<>();
		
		map.put(01, "Adana");
		map.put(34, "Istanbul");
		map.put(06, "Ankara");
		map.put(35, "Izmir");
		System.out.println(map); //{1=Adana, 34=Istanbul, 6=Ankara, 35=Izmir} with LinkedHashMap
        System.out.println(map); //{1=Adana, 34=Istanbul, 35=Izmir, 6=Ankara} with HashMap
		System.out.println(map); //{1=Adana, 6=Ankara, 34=Istanbul, 35=Izmir} with TreeMap
		
		System.out.println(map.get(06)); //to access one value  use get method we must give a key 
		
		System.out.println(map.containsKey(06)); //we check just key -->true 
		System.out.println(map.containsValue("Bodrum")); //>simply check the values -->false
		
		map.replace(01, "Antalya"); //we simply change the key 01 value 
		System.out.println(map);  //{1=Antalya, 34=Istanbul, 6=Ankara, 35=Izmir}

		map.remove(01); //we simply remove(delete) key 01 entry 
		System.out.println(map); //{34=Istanbul, 6=Ankara, 35=Izmir}

		
		Map<String,String>recap=new LinkedHashMap<>();
		
		recap.put("Neslihan", "Baysal");
		recap.put("Ali Burhan", "Baysal");
		recap.put("Imran", "Baysal");
		recap.put("Nevin", "Baysal");
		recap.put("Yusuf", "Baysal");
		
		Set<String>setKey=recap.keySet(); //we created set ????
		for(String key:setKey) {
			System.out.println(key); //we simply print just key values 
			System.out.println(key+"--add get method inside keyset for each --> "+recap.get(key));
		}
		Iterator<String>it=setKey.iterator();
		while(it.hasNext()) {
			String next=it.next();
			String nextget=recap.get(next);
			System.out.println(next+"------>"+nextget);
		}
		
		//how to retrieve all K+V with entrySet
		
		Set<Entry<String,String>>entrySet=recap.entrySet();
		
		for(Entry<String,String> entry:entrySet) {  //retrieve all values through each loop we refered Entry objects inside type of K+V and gave a name
			System.out.println(entry.getKey()+"----------"+entry.getValue());
			
		}
		
		
	}

}
