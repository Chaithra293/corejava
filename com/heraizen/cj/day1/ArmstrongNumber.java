package com.heraizen.cj.day1;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		
		int arms = num;
		int sum = 0;
		while(num > 0) {
			int rem = num % 10;
			num = num / 10;
			sum = sum + (rem*rem*rem);
		}
		
		if(sum == arms) {
			System.out.println(arms + " is an armstrong number");
		}
		scan.close();
	}

}
