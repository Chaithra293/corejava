package com.heraizen.cj.arrays;

import java.util.Arrays;

public class SumAverage {

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 2, 0, 0, 0, 0 };
		int sum = 0;
		int minimum = arr[0];

		for (int i = 0; i < arr.length - 4; i++) {
			sum += arr[i];
			if (minimum > arr[i]) {
				minimum = arr[i];
			}
		}
		int avg = sum / (arr.length - 4);
		arr[14] = sum;
		arr[15] = avg;
		arr[16] = minimum;
		System.out.println(Arrays.toString(arr));

	}

}
