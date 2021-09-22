package com.bridgelabz.basicjava;

import java.util.Scanner;

public class Basicjava {

	public static void main(String[] args) {

		int Heads = 0;
		int Tails = 0;
		int Counter = 1;

		double randNum = 0.0;

		Scanner Input = new Scanner(System.in);

		System.out.println("The numbres of times to filp coin ");

		double flips = Input.nextDouble();

		while (Counter <= flips) {

			randNum = Math.random();

			System.out.print(Counter + " " + randNum);

			if (randNum < 0.5) {
				Heads++;
				System.out.println(" heads ");
			} 
			else {
				Tails++;
				System.out.println(" tails ");
			}
			Counter++;
		}

		System.out.println();
		System.out.println("No. of heads equal to :" + Heads);
		System.out.println("No. of tails equal to :" + Tails);

		double percentage_heads = ((Heads / flips) * 100);
		double percentage_tails = ((Tails / flips) * 100);

		System.out.println("The percentage of heads is :" + percentage_heads);

		System.out.println("The percentage of heads is :" + percentage_tails);

	}

}
