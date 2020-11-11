package com.heraizen.cj.day1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		scan.close();
		
		if(num%2 == 0) {
			System.out.println("The Entered number " + num + " is even");
		}
		
		else {
			System.out.println("The Entered number " + num + " is odd");
		}

	}

}
