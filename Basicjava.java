package com.bridgelabz.basicjava;

import java.util.Scanner;

public class Basicjava {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");

		int Num = sc.nextInt();

		System.out.println("Printing all num till Power value :" + Num);

		for (int i = 1; i <= Num; i++) {
			System.out.println("Power of 2^ " + i + " is: " + (Math.pow(2, i)));
		}
	}

}
