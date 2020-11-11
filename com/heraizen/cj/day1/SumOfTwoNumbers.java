package com.heraizen.cj.day1;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the num1 value :");
		int num1=scan.nextInt();
		
		System.out.println("Enter the num2 value :");
		int num2=scan.nextInt();
		
		int result=num1+num2;
		System.out.println("Sum of "+num1+" and "+num2+" is "+result);

	}

}
