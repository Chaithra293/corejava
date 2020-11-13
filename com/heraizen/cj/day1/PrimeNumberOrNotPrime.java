package com.heraizen.cj.day1;

import java.util.Scanner;

public class PrimeNumberOrNotPrime {

	public static void main(String[] args) {

		boolean flag = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number :");
		int num = scan.nextInt();
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("The entered number " + num + " is a prime number");
		} else {
			System.out.println("The entered number " + num + " is not a prime number");
		}
		scan.close();
	}

}
