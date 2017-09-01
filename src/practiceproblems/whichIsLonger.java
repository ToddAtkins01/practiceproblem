package practiceproblems;

import java.util.Scanner;

public class whichIsLonger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Ask the user for her first name and last name.
		System.out.println("What is your first and last name?");
		{
			String firstName = input.next();
			String lastName = input.next();
			System.out.println(firstName + " " + lastName);

			// Use the length() method to tell her which is longer.
			int firstNameLength = firstName.length();
			int lastNameLength = lastName.length();

			if (firstNameLength > lastNameLength) {
				System.out.println("Your first name is greater than your last name.");
			} else if (firstNameLength < lastNameLength) {
				System.out.println("Your last name is greater than your first name.");
			} else {
				System.out.println("Your first name is equal to your last name.");
				input.close();
			}

		}
	}

}
