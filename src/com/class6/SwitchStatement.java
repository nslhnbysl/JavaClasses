package com.class6;

public class SwitchStatement {

	public static void main(String[] args) {

		int day = 3;
		String weekDay;

		switch (day) {
		case 1: // day==1
			weekDay = "Monday";
			break;
		case 2:
			weekDay = "Tuesday";
			break;
		case 3:
			weekDay = "Thursday";
			break;
		case 4:
			weekDay = "Thursday";
			break;
		case 5:
			weekDay = "Friday";
			break;
		case 6:
			weekDay = "Saturday";
			break;
		case 7:
			weekDay = "Sunday";
		default:
			weekDay = "Invalid";
		}
System.out.println(weekDay);
	}

}
