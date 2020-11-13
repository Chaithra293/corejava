package com.heraizen.cj.day1;

import java.util.Scanner;

public class CountingDigits {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
	    System.out.println("Enter any number: ");
	    int num = scan.nextInt();
	    scan.close();
	    
	    int count = 0 , total = 0, reverse=0;
	    while(num!=0) {
	         total = total + num % 10;
	         reverse = reverse * 10 + (num % 10);
	    	 num = num/10 ;
	    	 count = count + 1;
	    }
	    System.out.println("The number of digits in the entered number is " + count);
	    System.out.println("The sum of digits of the entered number is " + total);
	    System.out.println("Reverse of entered number is " + reverse);

	}

}
