package com.class30;

public interface Bank {

	void haveChecking();
	void haveSavings();
}
class BOA extends Finance implements Bank{ //we can inherit just one class but we can inherit multiple interfaces 

	@Override
	public void haveChecking() {
System.out.println("BOA has a checking account");		
	}

	@Override
	public void haveSavings() {
System.out.println("BOA has a savings account");		
	}
	
}
interface Trustable{
	void trust();
}                                            //we can implement multiple interfaces on our class 

class Finance{
	public void financing() {
		System.out.println("Financial transactions must happen");
	}
}
class CapitalOne implements Bank,  Trustable{  //we can create more than one implements 

	@Override
	public void haveChecking() {
		System.out.println("Capital one has a checking account");		

	}

	@Override
	public void haveSavings() {
		System.out.println("Capital one has a savings account");		

	}

	@Override
	public void trust() {
System.out.println("You can trust capital one with your money");		
	}
	
}
class CapitalOneChild extends CapitalOne{
	
}
