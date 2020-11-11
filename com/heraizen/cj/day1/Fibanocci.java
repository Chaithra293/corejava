package com.heraizen.cj.day1;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
        System.out.println("Enter the upper bound number to generate the Fibonacci numbers :");
        int n = scan.nextInt();
        scan.close();
        int num1 = 0;
        int num2 = 1;
        System.out.print("Fibonacci series up to the entered number is : " + num1 +" " + num2);
        for(int i=2;i<n;i++) {
        	int num3 = num1 + num2;
        	num1 = num2;
        	num2 = num3;
        	System.out.print(" " + num3);
        }
	}

}
