package practiceproblems;

import java.util.Random;

public class DoubleDice {
	public static void main(String[] args) {
		Random r = new Random();

		System.out.println("Let's roll some dice!!");
		
		int num1 = 1 + r.nextInt(10);
		int num2 = 1 + r.nextInt(10);
		while (num1 != num2);
		{
		
		System.out.println("\nRoll #1 is " + num1);
		
		System.out.println("Roll #1 is " + num2);

		int total = (num1 + num2);
		System.out.println("\nThe total for your roll is " + total + ".");

	
		}
	}
	
}