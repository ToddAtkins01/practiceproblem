package practiceproblems;

import java.util.Scanner;

public class AWordAndALetter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a word.");
		String word = input.nextLine();

		System.out.println("Now enter a letter.");
		char letter = input.nextLine().charAt(0);

		char[] letters = word.toCharArray();

		//System.out.println(letter + " is equal to a letters in " + word + ".");
		
		//System.out.println(letter + " is not equal to a letter in " + word + ".");

		input.close();
	}

}
