package com.bridgelabz.basicjava;

import java.util.Scanner;

public class Basicjava {

	public static void main(String[] args) {

		double sum = 0.0;
		double a = 1.0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");

		double Number = sc.nextDouble();

		for (double i = 1; i <= Number; i++) {

			sum += a / i;
			
			System.out.println(a / i);

		}

		System.out.println("Harmonic value is:" + sum);

	}

}
