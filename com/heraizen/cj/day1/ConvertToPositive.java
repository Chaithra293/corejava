package com.heraizen.cj.day1;

import java.util.Scanner;

public class ConvertToPositive {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        
        if(num<0)
        {
        	int x = Math.abs(num);
        	System.out.println("The result is : " + x);
        }
        else {
        	System.out.println("The result is : " + num);
        }
	}

}
