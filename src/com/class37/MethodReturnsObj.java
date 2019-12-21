package com.class37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MethodReturnsObj {

	public static void main(String[] args) {
		
	Scanner scan=returnScanner();   //we simply screate scanner to use this scanner method 
	scan.nextLine();
	List<String>list=returnStringList("Java","My favorite subjects");
	System.out.println(list);
		
	Map<String,String>map=returnMap("Neslihan","Baysal","Imran","Baysal");
		System.out.println(map);
		
		
	}
//create a method that will return an object of scanner class
	
	public static Scanner returnScanner() {
		Scanner scan=new Scanner(System.in);
		return scan;
	}
//create a method that will return an object of ArrayList class	
	
	public static List <String> returnStringList(String str,String str1) {
		List<String>list=new ArrayList<>();
		list.add(str);
		list.add(str1);
		return list;
	}

	//create a method that will return an object of map class
	
	public static Map<String,String> returnMap(String key,String value,String key1,String value1) {
		Map<String,String>map=new HashMap<>();
		map.put(key, value);
		map.put(key1, value1);
		return map;
	}
	
	
	
	
	
	
	
	
}
