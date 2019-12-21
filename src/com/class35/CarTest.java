package com.class35;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Car {
	// create a car class that will have variables,methods and constructor
	// then we will create a map that will hold car numbers and car objects storein
	// it
	String make, model;

	public Car(String make, String model) {
		this.make = make;
		this.model = model;
	}

	public void display() { // we cannot to static this because variables are not static
		System.out.println(make + " " + model);
	}
}

public class CarTest {
	public static void main(String[] args) {

		Map<Integer, Car> mapCar = new LinkedHashMap<>();
		mapCar.put(1, new Car("BMW", "X5")); // inside our map we storing out user defined class objects
		mapCar.put(2, new Car("Tesla", "S"));
		mapCar.put(3, new Car("Mercedes", "S500"));
		mapCar.put(4, new Car("Toyota", "Rav4"));
		mapCar.put(5, new Car("Honda", "Civic"));
		mapCar.put(2, new Car("Lincoln", "Aviator"));// override key 2

		System.out.println(mapCar.size());

		// display only value objects

		Collection<Car> coll = mapCar.values();
		for (Car c : coll) {
			System.out.println(c.make + " " + c.model); // when we try to print just c compiler will give this
														// com.class35.Car@15db9742
			c.display();
		}

       //lets try to map key to its corresponding(karsilik) values( entrySet or Keyset)
		
		Set<Entry<Integer,Car>> set=mapCar.entrySet(); //entry set simply returns unique collection of entries
		
		for(Entry<Integer,Car>ent:set) {
			Integer i=ent.getKey();
			Car c=ent.getValue();
			System.out.println("Key "+i+" is associated with value of "+c.make);
		}
		
		//using key set to map keys to values 
		
		Set<Integer>keyCar=mapCar.keySet();
		for(int key:keyCar) {
			//System.out.println(key+"="+mapCar.get(key).make+" "+mapCar.get(key).model);
			Car car=mapCar.get(key);
			String carDetails=car.make+"-"+car.model;
			System.out.println(key+"="+carDetails);
		}
		
      //use iterator to iterate through values,keySet and entrySet
		
		Iterator itKey=mapCar.keySet().iterator();
		while(itKey.hasNext()) {
			Object make=itKey.next();
			
		}
		
		Iterator itVal=mapCar.values().iterator();
		while(itVal.hasNext()) {
			
			System.out.println(itVal.next());
		}
		
	}

}
