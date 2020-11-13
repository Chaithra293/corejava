package com.heraizen.cj.arrays;

import java.util.Scanner;

public class BiggestAndSmallestElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter array elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("The biggest element in array is " + biggest(arr));
		System.out.println("The smallest element in array is " + smallest(arr));
		sc.close();
	}

	public static int biggest(int arr[]) {
		int big = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (big < arr[i]) {
				big = arr[i];
			}
		}
		return big;
	}

	public static int smallest(int arr[]) {
		int small = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (small > arr[i]) {
				small = arr[i];
			}
		}
		return small;
	}

}
