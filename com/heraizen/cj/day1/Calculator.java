package com.heraizen.cj.day1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the operand num1 ");
		int num1 = scan.nextInt();
		System.out.println("Enter the operand num2 ");
		int num2 = scan.nextInt();
		float result = 0f;

		System.out.println("1. add   2. multiply  3. sub   4. div  5. mod");
		System.out.println("Enter the operator ");
		int choice = scan.nextInt();

		switch (choice) {

		case 1:
			result = num1 + num2;
			System.out.println(" Sum of given numbers " + num1 + " and " + num2 + " is " + result);
			break;

		case 2:
			result = num1 * num2;
			System.out.println(" Product of given numbers " + num1 + " and " + num2 + " is " + result);
			break;

		case 3:
			result = num1 - num2;
			System.out.println(" Subtraction of given numbers " + num1 + " and " + num2 + " is " + result);
			break;

		case 4:
			if (num2 == 0) {
				result = 0;
				System.out.println("quotient of given numbers " + num1 + " and " + num2 + " is " + result);
			} else {
				result = num1 / num2;
				System.out.println(" quotient of given numbers " + num1 + " and " + num2 + " is " + result);

			}
			break;

		case 5:
			result = num1 % num2;
			System.out.println(" Mod of given numbers " + num1 + " and " + num2 + " is " + result);
			break;

		default:
			System.out.println("incorrect input");
			break;

		}
		scan.close();

	}
}
