package codingbydoingproblems;

import java.util.Scanner;

public class MoreUserInputOfData {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the following information so I can sell it for a profit!\n");

		System.out.print("\nFirst names: ");
		String firstName = input.nextLine();

		System.out.print("Last name: ");
		String lastName = input.nextLine();

		System.out.print("Grade (9-12): ");
		int grade = input.nextInt();
		input.nextLine();

		System.out.print("Student ID: ");
		String studentID = input.nextLine();

		System.out.print("Login: ");
		String login = input.nextLine();

		System.out.print("GPA (0.0-4.0): ");
		double gpa = input.nextDouble();

		System.out.println("Your information:");
		System.out.println("\tLogin:\t" + login);
		System.out.println("\tID:\t" + studentID);
		System.out.println("\tName:\t" + lastName + ", " + firstName);
		System.out.println("\tGPA:\t" + gpa);
		System.out.println("\tGrade:\t" + grade);

		input.close();
	}
}