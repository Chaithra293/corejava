package com.heraizen.cj.day1;

public class PatternI {
	public static void main(String[] args) {

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == 1 || j == 5 || i == 7) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
