package com.heraizen.cj.arrays;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter array elements : ");
		for (int i = 0; i <= n; i++) {
			arr[i] = sc.nextInt();
		}

		int sumOfElements = 0;
		for (int i = 0; i < arr.length; i++) {
			sumOfElements += arr[i];
		}
		System.out.println("Sum of array elements is : " + sumOfElements);
		sc.close();
	}

}
