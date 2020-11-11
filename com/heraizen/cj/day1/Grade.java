package com.heraizen.cj.day1;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the marks scored in subject 1");
		int marks1 = scan.nextInt();
		System.out.println("Enter the marks scored in subject 2");
		int marks2 = scan.nextInt();
		System.out.println("Enter the marks scored in subject 3");
		int marks3 = scan.nextInt();
		scan.close();
		
		int total = marks1 + marks2 + marks3;
		float avg = total/3;
		
		System.out.println("Total marks " + total + "\nAverage is " + avg);
		if(avg <= 35) {
			System.out.println("Grade :'C'");
		}
		else if(avg >35 && avg <= 60) {
			System.out.println("Grade :'B'");
		}
		else {
			System.out.println("Grade : 'A'");
		}
	}

}
