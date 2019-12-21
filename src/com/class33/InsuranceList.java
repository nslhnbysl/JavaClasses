package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceList {

	public static void main(String[] args) {

		ArrayList<Insurance>insuranceList=new ArrayList<>();
		
		insuranceList.add(new Car("Allstate","Lexus"));
		insuranceList.add(new Pet("figo","scotishfold"));
		insuranceList.add(new Health("Kaiser"));
		
		//advanced for loop
		System.out.println("ADVANCED LOOP");
		for(Insurance list:insuranceList) {
			list.getQuote();
			list.cancelInsurance();
		}
		//for loop  
		System.out.println("FOR LOOP");
		for(int i=0;i<insuranceList.size();i++) {
			insuranceList.get(i).getQuote();
			insuranceList.get(i).cancelInsurance();
		}
		System.out.println("ITERATOR");
		Iterator<Insurance> it=insuranceList.iterator();
		
		while(it.hasNext()) {
			Insurance a=it.next(); //why I couldnt do this directly because we need to reassign the it.next() and after that we can use this with multiple options
			
			a.cancelInsurance();
			a.getQuote();
		}
	}

}
