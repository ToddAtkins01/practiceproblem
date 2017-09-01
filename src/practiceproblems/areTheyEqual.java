package practiceproblems;

import java.util.Scanner;

public class areTheyEqual {

	public static void main(String[] args) {
		// Ask the user for two integers. Check and see if the two integers are equal to
		// each other. If they are, inform the the user that the numbers are equal;
		// otherwise, inform the user that the numbers are not equal

				Scanner input = new Scanner (System.in);
				
				
				System.out.println("Please enter one number.");
				int number1 = input.nextInt();
				System.out.println("Thank you, you entered " +number1);
				
				System.out.println("Now please enter another number.");
				int number2 = input.nextInt();
				System.out.println("Thank you, you entered " +number2);
				
				input.close();
				
				
				if (number1 == number2) System.out.println("These numbers are equal to each other");
				else System.out.println("Sorry, These numbers are not equal to each other");
				
		

	}

}
