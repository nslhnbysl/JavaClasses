package com.class11;

public class Task {

	public static void main(String[] args) {

		//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
		String [] cars= {"Audi","BMW","Tesla","Honda","Lexus","WV"};
		
		for(int a=0;a<cars.length;a++) {
			System.out.println(cars[a]);
		}
		for(String h:cars) {
			System.out.println(h);
		}
		
		
		//Create an array on integers and calculate the sum of all elements in an array.
		
		int[]array= {2,3,4,5,6,7};
		int sum=0;
		
		for(int a=0;a<array.length;a++) {
			 sum=sum+array[a];
			
		}
		
		 System.out.println(sum);
		
		//Create an array of countries. While retrieving all values from an array print capital for each country. (use 2 different loops).
		
		String[]country= {"Turkey","USA","India"};
		
	//  for(String getCountry:countries)
		for(int a=0;a<country.length;a++) {
			switch(country[a]) {
			case "Turkey":
				System.out.println("Ankara");
			break;
			case"USA":
				System.out.println("DC");
			break;
			case"India":
				System.out.println("New Delhi");
			break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
