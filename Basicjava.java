package com.bridgelabz.basicjava;

import java.util.Scanner;

public class Basicjava {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers to Swap");
		System.out.println("Enter Number 1");
		int num1 = sc.nextInt();
		System.out.println("Enter Number 2");
		int num2 = sc.nextInt();
			
		int swap = num1;
		num1 = num2;
		num2 = swap;
		System.out.println("After Swaping the number the final value is");
		System.out.println("The first number 1 is :" +num1);
		System.out.println("The Second number 2 is :" +num2);
	}
}
