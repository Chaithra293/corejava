package com.heraizen.cj.day1;

public class AlphabetPattern {

	public static void main(String[] args) {

		int alpha = 65;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print((char) alpha + " ");
				alpha += 1;
			}

			System.out.println();
		}

	}
}
