package com.class5;

public class LogicalOr {

	public static void main(String[] args) {

		
//7 days a week
//if days is 2 or 4 -->SDLC class
//if day 6 or 7 --> JAVA class
//if day 1 or 5 -->No class
//if day=3-->review class 
//otherwise -->Not a valid day
		
int day=6;
  //false OR false-->false
if(day==2 || day==4) {
	System.out.println("SDLC Class");
  //true OR false -->true 
}else if(day==6 || day==7) {
	System.out.println("JAVA Class");
	//false OR false-->false
}else if(day==1 || day==5) {
	System.out.println("No class");
}else if(day==3) {
	System.out.println("Review Class");
}else {
	System.out.println("Not a valid day");
}
		
//7 days a week
//if days is tuesday or thursday-->sdlc class
//if day saturday or sunday-->Java class
//if day monday or friday-->no class
//if day is wednesday-->review class
		
	String weekDay="Wednesday";
	
	if(weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
		System.out.println("SDLC CLASS");
	}else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
		System.out.println("JAVA CLASS");
	}else if(weekDay.equals("Monday") || weekDay.equals("Friday")) {
		System.out.println("NO CLASS");
		
	}else if(weekDay.equals("Wednesday")) {
		System.out.println("Review Class");
	}else {
		System.out.println("Not a valid day");
	}
		
		
		
		
		
		
		
		
		
		
		
	}

}
