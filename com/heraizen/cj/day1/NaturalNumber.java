package com.heraizen.cj.day1;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number of natural numbers to be generated:");
        int n = scan.nextInt();
        scan.close();
        
        System.out.print("First " + n + " natural numbers are : ");
        for(int i=1;i<=n;i++) {
        	System.out.print(i + " ");
        }
        
        System.out.println("\nNumbers in descending order :");
        for(int i=n;i>=1;i--) {
        	System.out.print(i + " ");
        }
	}

}
