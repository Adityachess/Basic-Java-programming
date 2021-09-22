package com.bridgelabz.basicjava;

import java.util.Scanner;

public class Basicjava {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st number:");
		int num1 = sc.nextInt();

		System.out.println("Enter 2nd number:");
		int num2 = sc.nextInt();

		System.out.println("Enter 3rd number:");
		int num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3) {

			System.out.println("The Largest number is ::" + num1);

		} 
		else if (num2 > num1 && num2 > num3) {

			System.out.println("The Largest number is ::" + num2);

		} 
		else if (num3 > num1 && num3 > num2) {
			System.out.println("The Largest number is ::" + num3);

		} 
		else {
			System.out.println(" Not  valid");

		}
	}
}
