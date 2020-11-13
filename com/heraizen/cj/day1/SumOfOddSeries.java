package com.heraizen.cj.day1;

import java.util.Scanner;

public class SumOfOddSeries {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num = scan.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				System.out.print(" " + i);
				sum += i;
			}
		}
		System.out.println("\nSum of Odd number series = " + sum);
		scan.close();
	}
}
