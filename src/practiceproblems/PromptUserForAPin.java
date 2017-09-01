package practiceproblems;

import java.util.Scanner;

public class PromptUserForAPin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a PIN");
		String pin = input.nextLine();
		int count = 0;
		String reenterPin;
		do {
			System.out.println("Reenter your PIN:");
			reenterPin = input.nextLine();
			count++;
		} while (!reenterPin.equals(pin) && (count < 3));
		if (reenterPin.equals(pin)) {
			System.out.println("Congratulations!");
		} else {
			System.out.println("I am sorry, but you have reached the maximum number of attempts.");
		}
		input.close();
	}

}
