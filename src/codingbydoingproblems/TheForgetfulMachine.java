package codingbydoingproblems;

import java.util.Scanner;

public class TheForgetfulMachine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.print("Give me a word! ");
		input.nextLine();

		System.out.print("\nGive me a second word! ");
		input.nextLine();

		System.out.print("\nGreat, now your favorite number? ");
		input.nextInt();
		
		System.out.print("\nAnd your second-favorite number... ");
		input.nextInt();
		
		System.out.println("\n\nWhew!  Wasn't that fun?");

		
		input.close();
	}
}