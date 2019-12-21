package com.class31;

public abstract class Marks {
	double math;
	double history;
	double science;
	double chemistry;
	double music;
	double language;
	

	
	
	
public abstract void getPercentage();
}

class A extends Marks{
	
	A(double history,double science,double music){
		
		this.history=history;
		this.science=science;
		this.music=music;
	}

	
	public void getPercentage() {
		System.out.println((history+science+music)/3);	
	}
}

class B extends Marks{
	B(double chemistry,double music,double language,double history){
		this.chemistry=chemistry;
		this.music=music;
		this.language=language;
		this.history=history;
	}

	@Override
	public void getPercentage() {
System.out.println((chemistry+music+language+history)/4);		
	}
}
