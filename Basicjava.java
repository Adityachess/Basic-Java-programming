package com.bridgelabz.basicjava;

import java.util.Scanner;

public class Basicjava {

	public static void main(String[] args) {

		int year;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any year of your choice: ");

		year = sc.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("this is leap year");
		}

		else {
			System.out.println("this is not leap year");
		}
	}

}
