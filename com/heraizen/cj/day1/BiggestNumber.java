package com.heraizen.cj.day1;

import java.util.Scanner;

public class BiggestNumber {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the first number num1");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number num2 ");
		int num2 = scan.nextInt();
		scan.close();
		
		if(num1 > num2) {
			System.out.println("The bigger of two numbers (" + num1 +" and " + num2 + ") is : "+ num1);
		}
		else {
			System.out.println("The bigger of two numbers (" + num1 +" and " + num2 + ") is : "+ num2);
		}

	}

}
