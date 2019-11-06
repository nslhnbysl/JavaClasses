package com.class12;

import java.util.Scanner;

public class ForLoopAndScannerIn2d {

	public static void main(String[] args) {

		// create grocery list fruits ,vegetables and print

		String[][] array = new String[2][4];

		Scanner scan = new Scanner(System.in);

		for (int a = 0; a < array.length; a++) {
			for (int b = 0; b < array[a].length; b++) {
				array[a][b] = scan.nextLine();
				}
			}

		for (int a = 0; a < array.length; a++) {
			for (int b = 0; b < array[a].length; b++) {
				System.out.print(array[a][b] + " ");
			}
			System.out.println();
		}
	}

}
