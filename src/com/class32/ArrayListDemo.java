package com.class32;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String>arrayList=new ArrayList<String>(); //-->we simply storing string
		//to store values inside your collection
		
		arrayList.add("John"); //we can store them as many as many we want
		arrayList.add("Jane");
		arrayList.add("Neslihan");
		//to retrieve the value from arraylist
		System.out.println(arrayList.get(1)); //-->this gonna print the value of number 1 elemnet easily 
		
		
		//add more values 
		arrayList.add("John"); //we can store same name again and again
		arrayList.add("Jane");
		arrayList.add("Neslihan");
		arrayList.set(0, "Ali");
		
		//how many elements inside arrayList
		System.out.println(arrayList.size());
		
		//creating a new object of  arraylist and inside it I wanna store numeric values
		
		ArrayList<Integer>numArrList=new ArrayList<>();
		numArrList.add(100);
		numArrList.add(200);
		numArrList.add(300);
		
		//update the value
		numArrList.set(2, 400); //--> we can change the value of elemnts for this way to use .set()
		
		System.out.println(numArrList);//[100, 200, 400] compiler gonna print all array like this 
		System.out.println(numArrList.get(2)); //--> we can print thorugh to use get and add number of elements and compiler will gives us 300
		
		//retrieving values 1st way
		//int i =control variable or counter variable it simply does controls our loops
		for(int i=0;i<numArrList.size();i++) { //we need also for loop to print all values ONE BY ONE 
			System.out.println(numArrList.get(i));
		}
		
		//2nd way
		
		for(Integer number:numArrList) {
			System.out.println(number);
		}
		
		
		ArrayList<String>myArray=new ArrayList<String>();
		myArray.add("Neslihan");
		myArray.add("Ali");
		myArray.add("Burhan");
		myArray.add("Imran");
		myArray.add("Baysal");
		
		System.out.println(myArray.isEmpty());
		
		System.out.println(myArray.contains("Neslihan"));
		
		System.out.println(myArray.size());
		
		for(int i=0;i<myArray.size();i++) {
			System.out.println(myArray.get(i));
		}
		
		System.out.println(myArray);
	}

}
