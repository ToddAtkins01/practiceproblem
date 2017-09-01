package practiceproblems;

import java.util.Scanner;

public class AskUserToCreateAPassword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Ask the user to create a password.
		System.out.println("Please create a password.");
		String password = input.next();

		System.out.println("Please enter your password again to verify.");
		String password2 = input.next();

		if (password.equals(password2)) {
			System.out.println("Thank you. Your passwords match.");
		} else {
			System.out.println("Sorry, but your passwords do not match. :-(");
		}
		input.close();
	}

}
