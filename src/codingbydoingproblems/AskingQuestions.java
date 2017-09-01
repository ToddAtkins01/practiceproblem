package codingbydoingproblems;

import java.util.Scanner;

public class AskingQuestions {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int age;
		String height;
		double weight;

		System.out.print("How old are you? ");
		age = input.nextInt();

		System.out.print("How tall are you? ");
		height = input.next();

		System.out.print("How much do you weigh? ");
		weight = input.nextDouble();

		System.out.println("So you're " + age + " old, " + height + " tall and " + weight + " heavy.");

		input.close();
	}
}