package com.heraizen.cj.day1;

import java.util.Scanner;

public class Subtraction {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number num1 ");
		int num1 = scan.nextInt();
		System.out.println("Enter the number num2 ");
		int num2 = scan.nextInt();

		int result = num1 - num2;
		System.out.println("The result(difference) is " + Math.abs(result));
		scan.close();

	}

}
