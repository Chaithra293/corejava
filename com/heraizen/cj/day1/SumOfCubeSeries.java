package com.heraizen.cj.day1;

import java.util.Scanner;

public class SumOfCubeSeries {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		double sum = 0;
		for (int i = 2; i <= num; i++) {
			sum = sum + 1 / Math.pow(i, 3);
		}
		System.out.format("Sum of series : " + sum);
		scan.close();
	}
}
