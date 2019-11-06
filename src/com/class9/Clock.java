package com.class9;

public class Clock {

	public static void main(String[] args) {

		// 24 hours,60 minutes

		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 60; j++)
				if (j < 10) {
					System.out.println(i + ":0" + j);
				} else {
					System.out.println(i + ":" + j);
				}
		}

		for (int a = 0; a < 10; a++) {
//System.out.println(a);
			for (int b = 0; b < 10; b++) {
//System.out.println(b);
				for (int c = 0; c < 10; c++) {
//System.out.println(c);
					for (int d = 0; d < 10; d++) {
//System.out.println(d);		
			System.out.println(a +""+ b+"" + c +""+ d);
					}
				}
			}
		}

	}

}
