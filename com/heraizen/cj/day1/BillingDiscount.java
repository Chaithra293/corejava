package com.heraizen.cj.day1;

import java.util.Scanner;

public class BillingDiscount {

	public static void main(String[] args) {

		int netAmount;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the billing amount: ");
		int billAmount=scan.nextInt();
		if(billAmount>6000) {
		netAmount= billAmount-(billAmount/10);
		}
		else {
			netAmount=billAmount;
		}
		System.out.println("your Net billing amount: " +netAmount);
	}

}
