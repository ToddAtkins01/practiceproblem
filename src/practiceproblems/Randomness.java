package practiceproblems;

import java.util.Random;

public class Randomness {
	public static void main(String[] args) {
		Random r = new Random();

		int x = 1 + r.nextInt(10);

		System.out.println("My random number is " + x);

		System.out.println("\nHere are some numbers from 1 to 5!");
		System.out.print(1 + r.nextInt(5) + " ");
		System.out.print(1 + r.nextInt(5) + " ");
		System.out.print(1 + r.nextInt(5) + " ");
		System.out.print(1 + r.nextInt(5) + " ");
		System.out.print(1 + r.nextInt(5) + " ");
		System.out.print(1 + r.nextInt(5) + " ");
		System.out.println();

		System.out.println("\nHere are some numbers from 1 to 100!");
		System.out.print(1 + r.nextInt(100) + "\t");
		System.out.print(1 + r.nextInt(100) + "\t");
		System.out.print(1 + r.nextInt(100) + "\t");
		System.out.print(1 + r.nextInt(100) + "\t");
		System.out.print(1 + r.nextInt(100) + "\t");
		System.out.print(1 + r.nextInt(100) + "\t");
		System.out.println();

		int num1 = 1 + r.nextInt(10);
		System.out.println("\nMy random number is " + num1);
		int num2 = 1 + r.nextInt(10);
		System.out.println("My random number is " + num2);

		if (num1 == num2) {
			System.out.println("\nThe random numbers were the same! Weird.");
		}
		if (num1 != num2) {
			System.out.println("\nThe random numbers were different! Not too surprising, actually.");
		}
	}
}