package com.class35;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task {

	public static void main(String[] args) {
//		1.Create a map of a building. Store floor number  and  it  is  associated  company name.  (Example:  1=  Google,  2=Syntax 
//		etc..).  Insert  7  entries  with  duplicate keys and values.Check how many entries you have?
//      Update company on a 4th floor Remove company on the 7th floor Print your map

Map<Integer,String>map=new LinkedHashMap<>();

map.put(1, "Google");
map.put(2, "Amazon");
map.put(3, "P&G");
map.put(4, "E&Y");
map.put(5, "Ebay");
map.put(6, "Twitter");
map.put(6, "Instagram");

System.out.println(map.size());//gonna be 6 because I override the key 6
System.out.println(map);
map.remove(4);
System.out.println(map);

//1-Create  a  map  of  countries  with  its capital  that  will  store  countries  in alphabetical order.
//Print  all  keys  and  values  from  a country map using for each loop and iterator.Print  all  values  from  a  country  map 
//using for each loop and iterator.

Map<String,String>mapcity=new TreeMap<>();
mapcity.put("Turkey", "Ankara");
mapcity.put("Italy", "Rome");
mapcity.put("France", "Paris");
mapcity.put("USA", "DC");


Set<String>keyCity=mapcity.keySet();

Iterator<String>it=keyCity.iterator();

while(it.hasNext()) {
	String val=it.next();
	System.out.println(val+"-->"+mapcity.get(val));
}
for(String city:keyCity) {
	System.out.println(city+"----->"+mapcity.get(city));
}

Collection<String>col=mapcity.values();
for(String col1:col) {
	System.out.println(col1);
}



	}

}
