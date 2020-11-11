package com.heraizen.cj.day1;

import java.util.Scanner;

public class CountingDigits {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
	    System.out.println("Enter any number: ");
	    int num = scan.nextInt();
	    scan.close();
	    
	    int count = 0 , total = 0,rem, reverse=0;
	    while(num!=0) {
	    	 rem = num % 10;
	         total = total + rem;
	         reverse = reverse * 10 +rem;
	    	 num = num/10 ;
	    	 count = count + 1;
	    }
	    System.out.println("The number of digits in the entered number is " + count);
	    System.out.println("The sum of digits of the entered number is " + total);
	    System.out.println("Reverse of entered number is " + reverse);

	}

}
