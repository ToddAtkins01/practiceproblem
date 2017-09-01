package practiceproblems;

import java.util.Scanner;

public class oddOrEvan {

	public static void main(String[] args) {
		// Ask the user for a number. Tell the user if that number is even or odd.
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number.");
		int number = input.nextInt();
		if (number % 2 == 0)
			System.out.println("Thank you, You entered " + number + " and it is an even number");
		else
			System.out.println("Thank you, You entered " + number + " and it is an odd number");

		input.close();
	}

}
