package com.heraizen.cj.day1;

import java.util.Scanner;

public class NumberOfPrimeDigits {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = scan.nextInt();

		int c = 0;
		int count = 0;
		while (num > 0) {
			int rem = num % 10;
			num = num / 10;
			c++;
			if (rem == 1)
				c--;
			for (int i = 2; i <= rem / 2; i++) {
				if (rem % i == 0) {
					count++;
				}
			}

		}
		System.out.println("No. of prime digits " + (c - count));

		scan.close();
	}

}
