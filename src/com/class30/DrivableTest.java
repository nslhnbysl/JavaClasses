package com.class30;

public class DrivableTest {

	public static void main(String[] args) {
//java cannot create with interfaces 
		//this object is drivable type but we are reffering toyota
		Drivable obj=new Toyota();
		obj.drive();
	//	Drivable.DRIVE_FAST=false; -->c.e. final value cannot be reassigned
		
		
		Toyota toyota=new Toyota();
		toyota.drive();
		toyota.stop();
	}
}
