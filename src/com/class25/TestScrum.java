package com.class25;

public class TestScrum {

	
	public static void main(String[] args) {
		
	System.out.println("-----Create an object of employee class-----");	
		
		Employee emp=new Employee();
		emp.salary=40000;
		Employee.companyName="Syntax";
		emp.work();
		emp.getPaid();
		
		System.out.println("-----creating an object of scrumteam class-----");
		ScrumTeam sm=new ScrumTeam();
		sm.salary=38000;
		sm.getPaid();
		sm.artifacts="product backlog,sprint backlog,burndownchart";
		sm.cerenomies="Sprint demo,planning,retro,daily standup";
		sm.attendScrumMeetings();
		
		Developer dev=new Developer();
		
		System.out.println("----creating an object of developer class----");

		dev.salary=150000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts="Sptint backlog";
		dev.cerenomies="Sprint demo,planning,retro,daily standup";
		
}
	
}
