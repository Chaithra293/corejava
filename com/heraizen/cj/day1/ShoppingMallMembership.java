package com.heraizen.cj.day1;

import java.util.Scanner;

public class ShoppingMallMembership {

	public static void main(String[] args) {

		float payableAmount = 0.0f;
		float discount = 0.0f;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the bill amount: ");
		int billAmount = scan.nextInt();

		System.out.println("Do you have a membership card?");
		char str = scan.next().charAt(0);

		if (str == 'y' || str == 'Y') {
			discount = billAmount * 0.1f;
			payableAmount = billAmount - discount;
			System.out.println("Thank you! Your total bill amount is Rs " + billAmount + ", discount is Rs " + discount
					+ " and net amount payable is Rs" + payableAmount);
		} else if (str == 'n' || str == 'N') {
			discount = billAmount * 0.03f;
			payableAmount = billAmount - discount;
			System.out.println("Thank you! Your total bill amount is Rs " + billAmount + ", discount is Rs " + discount
					+ " and net amount payable is Rs " + payableAmount);
		} else {
			System.out.println("Invalid");
		}
		scan.close();
	}

}
