package com.heraizen.cj.day1;

public class Matrix {
	public static void main(String[] args) {

		int[][] a = { { 5, 6, 7 }, { 4, 5, 6 }, { 5, 6, 7 } };
		int sum = 0;
		int small = a[0][0];
		int big = a[0][0];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum += a[i][j];
				if (small > a[i][j]) {
					small = a[i][j];
				}
				if (big < a[i][j]) {
					big = a[i][j];
				}
			}
		}
		System.out.println("sum of matrix " + sum);
		System.out.println("biggest element " + big);
		System.out.println("smallest element " + small);

	}
}
