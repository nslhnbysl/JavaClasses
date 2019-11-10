package com.class17;

public class ObjectOfComputer {

	public static void main(String[] args) {

		Computer computer1=new Computer();
		
		computer1.brand="Dell";
		computer1.name="Inspiron";
		computer1.keyboard=true;
		computer1.screen=15;
		computer1.memory=250;
		
		computer1.playGames();
		computer1.javaCoding();
		computer1.watchMovie();
	}

}
