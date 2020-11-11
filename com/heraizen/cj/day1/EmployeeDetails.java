package com.heraizen.cj.day1;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the empNo");
		int empNo = scan.nextInt();
		
		System.out.println("Enter Employee name");
		String empName = scan.next();
		
		System.out.println("Enter the monthly salary");
		int monthSalary = scan.nextInt();
		scan.close();
		
		int yearSalary = monthSalary * 12;
		System.out.println("Hi "+ empName+"! Your employee id is "+ empNo + ", monthly salary is Rs " + monthSalary + " and yearly salary is Rs"+yearSalary + ".");
		
	}
}
