package practiceproblems;

import java.util.Scanner;

public class GreaterOfTwo {

	public static void main(String[] args) {
		// Ask the user to input two integer values. Print the greater value.
		// Extension: ask the user for three integers, then print the greatest value.
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter an integer");
		int n1 = input.nextInt();

		System.out.println("Thank you, Please enter another integer");
		int n2 = input.nextInt();
		if (n1 > n2) {
			System.out.println(n1);
		} else {
			System.out.println(n2);
		}
		input.close();
	}

}
