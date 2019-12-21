package com.class36;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ReviewMap {

	public static void main(String[] args) {

		
		Map<Integer,String>map=new TreeMap<>();
		
		map.put(01, "Istanbul");
		map.put(02, "Ankara");
		map.put(03, "Bodrum");
		map.put(04, "Izmir");
		
		Set<Entry<Integer,String>> setEnt=map.entrySet();
		
		System.out.println("FOR EACH LOOP");
		for(Entry<Integer,String> entryFor:setEnt) {
			System.out.println(entryFor.getKey()+"--->"+entryFor.getValue());
		}
		System.out.println("ITERATOR");
		
		Iterator<Entry<Integer,String>>setIt=setEnt.iterator();
		
		while(setIt.hasNext()) {
			Entry<Integer,String>nn=setIt.next();
			Integer kk=nn.getKey();
			String vv=nn.getValue();
			System.out.println("1ST WAY IN ITERATOR");
			System.out.println(kk+"---->"+vv);
			
			String ee=nn.getKey()+"_______"+nn.getValue();
			System.out.println(ee);
			
		}
		
		//Create a map of Best Buy store. Place item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
	    //Retrieve all keys and values from a Best Buy map using EntrySet.
		
Map<Integer,String>bestbuy=new LinkedHashMap<>();

bestbuy.put(1, "drone");
bestbuy.put(10, "tv");
bestbuy.put(100, "computer");
bestbuy.put(1000, "phone");
bestbuy.put(10000, "watch");
System.out.println(bestbuy);  //{1=drone, 10=tv, 100=computer, 1000=phone, 10000=watch} maintained with ordered

for(Map.Entry<Integer, String> entry : bestbuy.entrySet())	{
	System.out.println(entry.getKey()+"---->"+entry.getValue());
}
		
Set<Entry<Integer,String>>setEntry=bestbuy.entrySet();

Iterator<Entry<Integer,String>> it=setEntry.iterator();
while(it.hasNext()) {
	Entry<Integer,String> entry=it.next();
	System.out.println(entry.getKey()+"="+entry.getValue());
}

Set<Integer>keySet=bestbuy.keySet();

for(Integer key:keySet) {
	System.out.println(key+"==="+bestbuy.get(key));
}

	

bestbuy.replace(100, "mobile");

System.out.println(bestbuy);





	}

}
