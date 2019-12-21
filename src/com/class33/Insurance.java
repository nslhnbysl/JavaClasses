package com.class33;

public abstract class Insurance {
	    //1.Create  a  class  Insurance  that  will  have  an attribute as insuranceName and unimplemented 
		//behaviour  as  getQuote  and  cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has 
		//it’s own attribute as carModel and Class Pet has petType  attribute.  Create  3  objects  of  the  sub 
		//classes  and  store  them  in  ArrayList.  Using  for loop/advanced  for  loop/  iterator  access  all methods of the class. 
	
	String InsuranceName;
	public abstract void getQuote();
	public abstract void cancelInsurance();
	
	Insurance(String InsuranceName){
		this.InsuranceName=InsuranceName;
	}
		
}
class Car extends Insurance{
String carModel;

Car(String InsuranceName,String carModel) {
		super(InsuranceName);
		this.carModel=carModel;
	}
	@Override
	public void getQuote() {
	System.out.println("Insurance quote for "+carModel+" is 300$");	
	}

	@Override
	public void cancelInsurance() {
	System.out.println(carModel+" insurance has been canceled");	
	}
	
}
class Pet extends Insurance{
String petType;	
 Pet(String InsuranceName,String petType) {
		super(InsuranceName);
		this.petType=petType;
	}

	@Override
	public void getQuote() {
	System.out.println("Insurance quote for "+petType+" is 700$");	
	}
   @Override
	public void cancelInsurance() {
	System.out.println(petType+" insurance has been canceled");	
	}
	
}
class Health extends Insurance{

	Health(String InsuranceName) {
		super(InsuranceName);
		
	}

	@Override
	public void getQuote() {
		System.out.println("Insurance quote for health is 1700$");
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Health insurance has been canceled");
	}
	
}
