package com.class25_1;

import com.class25.Employee;

public class WaterFallTeam extends Employee{
public static void main(String[] args) {
	
	WaterFallTeam team=new WaterFallTeam();
	
	//team.salary=203940;     //CANT ACCESS because its default
	team.companyName="Syntax";
	
	team.employeeId=4; //it has protected modifier normally we cant access it but we access now because of extends so inheritance
	//team.employeeName="Nes"; //we cant access it because its private
	
	//team.salary=7393;     //give an error because it has default modifier

	
}
}
