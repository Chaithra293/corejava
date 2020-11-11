package com.heraizen.cj.day1;

import java.util.Scanner;

public class AverageOfWeights {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the weight of first person");
		float weight_1=scan.nextFloat();
		
		System.out.println("Enter the weight of second person");
		float weight_2=scan.nextFloat();
		
		System.out.println("Enter the weight of third person");
		float weight_3=scan.nextFloat();
		scan.close();
		
		float sum=weight_1 + weight_2 + weight_3;
		float average=sum/3;
		System.out.println("The sum of weight of the 3 persons is "+ sum + "Kgs and the average weight is "+average+" Kgs");
	}

}
