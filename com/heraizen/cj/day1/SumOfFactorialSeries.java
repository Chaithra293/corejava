package com.heraizen.cj.day1;

public class SumOfFactorialSeries {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 7; i++) {
			sum += i / factorial(i);
		}
		System.out.println("sum of series : " + sum);
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
