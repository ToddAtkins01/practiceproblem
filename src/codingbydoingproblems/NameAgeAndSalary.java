package codingbydoingproblems;

import java.util.Scanner;

public class NameAgeAndSalary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Hello.  What is your name?\n");
		String name = input.nextLine();

		System.out.print("\nHi, " + name + "! " + "How old are you?\n");
		int age = input.nextInt();

		System.out.print("\nSo you're " + age + ", eh? That's not old at all!\n How much do you make, " + name + "?\n");
		double howMuchYouMake = input.nextDouble();

		System.out.println("\n" + howMuchYouMake + "! I hope that's per hour and not per year! LOL!");

		input.close();
	}
}