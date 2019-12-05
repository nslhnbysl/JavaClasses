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
		dev.artifacts="Sprint backlog";
		dev.cerenomies="Sprint demo,planning,retro,daily standup";
		
		System.out.println("----creating an object of tester class----");
        
		Tester test=new Tester();
		test.salary=150000;
		test.work();
		test.getPaid();
		//test.code();      -->error because this method belongs just developer class
		test.test();
		test.artifacts="Sprint backlog";
		test.cerenomies="Sprint demo,planning,retro,daily standup";
		
		System.out.println("----creating an object of ScrumMaster class----");
		
		ScrumMaster scrumM=new ScrumMaster();
		
		scrumM.salary=8292000;
		scrumM.artifacts="Sprint backlog";
		scrumM.cerenomies="Sprint demo,planning,retro,daily standup";
		scrumM.work();
		scrumM.coordinateTeam();
		scrumM.getPaid();
		
System.out.println("----creating an object of ProductOwner class----");
		
		ProductOwner po=new ProductOwner();
		
		po.salary=3802000;
		po.artifacts="Product backlog,Sprint backlog";
		po.cerenomies="Sprint demo,planning,retro,daily standup";
		po.work();
		po.prioritize();;
		po.getPaid();
		
System.out.println("----creating an object of BussinessAnalyst class----");
		
		BussinessAnalyst ba=new BussinessAnalyst();
		
		ba.salary=38020;
		ba.artifacts="Sprint backlog";
		ba.cerenomies="Sprint demo,planning,retro";
		ba.work();
		ba.writeRequirement();;
		ba.getPaid();	
		
}
	
}
