package com.heraizen.cj.day1;

import java.util.Scanner;

public class FactorialUsingWhile {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		int i = 1, fact = 1;
		while (i <= num) {
			fact = fact * i;
			i++;
		}
		System.out.println("factorial of a number " + fact);
		scan.close();
	}
}
