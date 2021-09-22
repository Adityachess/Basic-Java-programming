package com.bridgelabz.basicjava;

import java.util.Scanner;

public class Basicjava {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number ");

		int num = scan.nextInt();

		for (int i = 2; i < num; i++) {

			while (num % i == 0) {

				System.out.println(i + " ");
				num = num / i;

			}

			if (num > 2) {

				System.out.print(num);
			}
		}

	}
}
