package com.heraizen.cj.arrays;

import java.util.Scanner;

public class MultidimensionalArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows M");
		int m = sc.nextInt();

		System.out.println("Enter number of columns N");
		int n = sc.nextInt();
		int[][] a = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt(); // taking input values
			}
		}

		System.out.println("Sum of matrix elements is : " + TwoDimensionArray.sumOfElement(a, m, n));
		System.out.println("Biggest of matrix elements is : " + TwoDimensionArray.biggest(a, m, n));
		System.out.println("Sum of diagonal elements is : " + TwoDimensionArray.sumOfDiagonal(a, m, n));
		System.out.println("transpose of a matrix is : ");
		int b[][] = TwoDimensionArray.transpose(a, m, n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
