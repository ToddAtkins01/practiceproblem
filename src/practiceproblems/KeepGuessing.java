package practiceproblems;

import java.util.Scanner;

public class KeepGuessing {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number = 51;

		System.out.println("Can you guess the secret number? \nHint, it is between 1 and 100.");
		int entry = input.nextInt();

		while (entry != number) {
			System.out.println("Sorry that is incorrect. \nPlease try again. \nEnter the secret number.");
			
			entry = input.nextInt();
		}
		System.out.println("\nThat is correct! Way to go!!");
		input.close();
	}

}
