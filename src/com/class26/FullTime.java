package com.class26;

public class FullTime extends Employee{
	
     int bonus;
     
     public void getPaid() {
 		System.out.println("Full time employee gets paid "+salary+" and "+bonus);
 	}
     
     public static void main(String[] args) {
    	 Employee emp=new Employee();
    	 emp.salary=80000;
    	 emp.getPaid();
    	 
    	 FullTime obj=new FullTime();
    	 obj.salary=130000;
    	 obj.bonus=40000;
    	 obj.getPaid();//we access in the fulltime class getPaid method 
    	               //we overriden inside employee class getPaid 
    	 
    	 Contructor con=new Contructor();
    	 con.salary=50000;
    	 con.getPaid();
    	 con.overTime();
	}
}
