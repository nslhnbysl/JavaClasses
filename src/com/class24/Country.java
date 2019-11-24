package com.class24;

public class Country {

	public String capital,name;
	public int population;
	
	public Country(String name,String capital,int population){//can use access modifiers on constructors
		this.capital=capital;
		this.name=name;
		this.population=population;
		}
	
	private Country(){                 //non argument constructor 
		
	}
	
public void displayCountry() { //parameterized constructor
	System.out.println(name+"'s capital city is "+capital+",the population of "+capital+" is "+population);
}
	
	public static void main(String[] args) {
		
		
		Country country1=new Country();
		country1.name="USA";
		country1.capital="Washington DC";
		System.out.println(country1.name+" "+country1.capital);
		
		
		Country country2=new Country("Turkey","Istanbul",15000000);
		country2.displayCountry();
		
		
	}
}
