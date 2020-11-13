package com.heraizen.cj.day1;

import java.util.Scanner;

public class PrimeNumbersBetweenRange {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the lower bound value:");
	    int num1 = scan.nextInt();
		System.out.println("Enter the upper bound value:");
		int num2 = scan.nextInt();
		System.out.print("The prime numbers between "+ num1 +" and "+ num2 +" are: ");
		for(int i = num1 ; i <= num2 ; i++)
		{
			int count = 0;
			for(int j = 1 ; j <= i ; j++)	
			{
				if(i % j == 0)
					count = count+1;
			}
			if(count == 2)
				System.out.print(i + " ");
		}
		scan.close();
	}

}
