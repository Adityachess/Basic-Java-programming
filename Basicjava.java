package com.bridgelabz.basicjava;

import java.util.Scanner;

public class Basicjava {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num to Check Even or Odd :");

		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("The Entered number is even");
		} 
		else {
			System.out.println("The Entered number is odd");
		}
	}
}
