package com.class34;

import java.util.*;

public class HomeWork {

	public static void main(String[] args) {

//	1-Create a Set collection in which you need to add  names  of  the  countries.In  this  set  we want all objects
//	to be sorted in alphabetical order. Using  2  different  ways  retrieve  all elements from set.

		Set<String> country = new TreeSet<>();
		country.add("Holland");
		country.add("Swiss");
		country.add("Africa");
		country.add("Turkey");

		System.out.println(country);
		System.out.println("ADVANCED FOR LOOP");
		for (String co : country) {
			System.out.println(co);
		}
		System.out.println("----ITERATOR----");
		Iterator<String> it = country.iterator();

		while (it.hasNext()) {
			String next = it.next();
			System.out.println(next);
		}

//	2.Create a Set of cities in which you want to make sure that insertion order is maintained. 
//	Using Iterator remove any city that starts with “A”;

		Set<String> city = new LinkedHashSet<>();
		city.add("Istanbul");
		city.add("NYC");
		city.add("Amsterdam");
		city.add("Paris");
		System.out.println(city);

		Iterator<String> itcity = city.iterator();

		while (itcity.hasNext()) {

			if (itcity.next().startsWith("A")) {
				itcity.remove();
			}

		}

		System.out.println(city);

//	3.Create a Set collection that will hold Objects of Student Type.In this set we do not care about the insertion order.Each student object 
//	should  have  name  and  studentID.  Display name of each student.

		Set<HomeworkStudent> sList = new HashSet<>();

		sList.add(new HomeworkStudent("Neslihan", 12));
		sList.add(new HomeworkStudent("Imran", 14));
		sList.add(new HomeworkStudent("Ali", 16));

		for (HomeworkStudent list : sList) {
			System.out.println(list.name + " " + list.studentId);
		}

		Iterator<HomeworkStudent> its = sList.iterator();

		while (its.hasNext()) {
			HomeworkStudent student = its.next();
			System.out.println(student.name + " " + student.studentId);
		}

		// How can you remove all duplicates from ArrayList?
		List<String> aList = new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		System.out.println(aList);

		System.out.println("convert 1st way");
		Set<String> hset = new HashSet<>(aList);
		aList.addAll(aList);
		System.out.println(hset);

		System.out.println("Convert 2nd way");
		Set<String> hset2 = new HashSet<>();

		hset2.addAll(aList);
		System.out.println(hset2);

		Set<String> list = new HashSet<>();
		list.add("null");
		list.add("shiva");
		list.add("sandish");
		list.add("asel");
		list.add("sumair");

		list.remove("sumair");

		System.out.println(list);

		System.out.println(list.contains("null"));

		Set<String> hset1 = new HashSet<>();
		hset1.add("first");
		hset1.add("second");
		hset1.add("third");
		hset1.add("fourth");
		hset1.add("fifth");

	}

}
