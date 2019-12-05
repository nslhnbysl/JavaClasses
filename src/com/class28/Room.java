package com.class28;

public class Room extends Building{

	int roomNumber;
	
	Room(String address,int floor,int roomNumber){
	super(address,floor);
	this.roomNumber=roomNumber;
	System.out.println(address+" "+floor+" "+roomNumber);

	}
	Room(int roomNumber){
		super(roomNumber);
		
		System.out.println(roomNumber);
	}
	
	public static void main(String[] args) {
		Room room=new Room(101);
		//System.out.println(room.floor);
		Room room1=new Room("121 Test Dr.",10,101);
		
		
	}
}
