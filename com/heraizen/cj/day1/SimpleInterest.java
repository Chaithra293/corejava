package com.heraizen.cj.day1;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the principal amount");
		int amount = scan.nextInt();
		
		System.out.println("Enter the rate of interest");
		float interest = scan.nextFloat();
		
		System.out.println("Enter the time(years)");
		float time = scan.nextFloat();
		scan.close();
		int simpleInterest = (int) ((amount * interest * time)/100);
		System.out.println("Simple Interest is "+ simpleInterest);
		
	}

}
