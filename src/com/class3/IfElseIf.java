package com.class3;

public class IfElseIf {

	public static void main(String[] args) {

		int num1 = 100;
		int num2 = 100;

		if (num1 > num2) {
			System.out.println("Num1 is larger than num2");
		} else if (num1 == num2) {
			System.out.println("Num1 is equal to num2");

		} else {
			System.out.println("Num1 is smaller than num2");
		}

		int day = 0;

		if (day == 1) {

			System.out.println("Today is Monday.I have to go work");
		} else if (day == 2) {
			System.out.println("Today is Tuesday.I have SDLC class");
		} else if (day == 3) {
			System.out.println("Today is Wednesday.I have Java Review class");
		} else if (day == 4) {
			System.out.println("Today is Thursday.I have SDLC review class");
		} else if (day == 5) {
			System.out.println("Today is Friday.weekend is here");
		} else if (day == 6) {
			System.out.println("Today is Saturday.My fav coding day");
		} else if (day == 7) {
			System.out.println("I love spending Sundays on Syntax");
		} else { // after else you can't write anyting its finish,else always always the last
					// part
			System.out.println("I do not know this day");
		}

		// ctrl+shift+f-->for windows

		System.out.println("I am done with if statement");

	}

}
