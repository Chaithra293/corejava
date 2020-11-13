package com.heraizen.cj.day1;

import java.util.Scanner;

public class SumOfSeries {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		float sum = 0;
		for(int i=1;i<=n;i++) {
		 sum = sum + (float)1/i;
		}
		System.out.println("Sum "+ sum);
		scan.close();
	}

}
