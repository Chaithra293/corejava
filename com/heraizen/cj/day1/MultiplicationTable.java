package com.heraizen.cj.day1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
    System.out.println("Enter the number to generate its multiplication table: ");
    int n = scan.nextInt();
    scan.close();
    
    System.out.println("Multiplication table for " + n + " is :");
    for(int i=1;i<=10;i++) {
    	int res = n * i;
    	System.out.println(n + " * " + i + " = " + res);
    }
}
}
