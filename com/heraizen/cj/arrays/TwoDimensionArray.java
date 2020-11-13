package com.heraizen.cj.arrays;

public class TwoDimensionArray {
//  Sum of elements in the matrix-----
	public static int sumOfElement(int a[][], int m, int n) {
		int matrixSum = 0;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrixSum += a[i][j];
			}
		}
		return matrixSum;
	}

//Biggest element in the matrix
	public static int biggest(int a[][], int m, int n) {
		int biggestEle = a[0][0];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (biggestEle < a[i][j]) {
					biggestEle = a[i][j];
				}
			}
		}
		return biggestEle;
	}

//Transpose of Matrix
	public static int[][] transpose(int a[][], int m, int n) {
		int[][] transMatrix = new int[n][m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				transMatrix[j][i] = a[i][j];
			}
		}
		return transMatrix;

	}

//Sum of diagonal elements
	public static int sumOfDiagonal(int a[][], int m, int n) {
		int diagonalSum = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					diagonalSum += a[i][j];
				}
			}
		}
		return diagonalSum;
	}

}
