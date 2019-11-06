package com.class10;

public class ArrayAndLoopTask {

	public static void main(String[] args) {

		//Create an array of countries. While retrieving all values from an array print capital for each country.
		
		String[] country= {"Turkey","Russia","England","France"};
		int size=country.length;
		String capital=null;
		
		for(int i=0;i<size;i++) {
			switch(country[i]) {
			case "Turkey":
				capital="Istanbul";
			break;
			case "Russia":
				capital="Moscow";
				break;
			case "England":
				capital="London";
				break;
			case "France":
				capital="Paris";
				break;
			
				
			
			}
			System.out.print(country[i]); 
			System.out.print(" ");
			System.out.println(capital);
		}
		
		
	}

}
