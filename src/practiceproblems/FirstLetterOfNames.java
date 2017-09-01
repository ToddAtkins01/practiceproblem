package practiceproblems;

public class FirstLetterOfNames {

	public static void main(String[] args) {

		String[] names = new String[4];
		names[0] = "Angela";
		names[1] = "Jamie";
		names[2] = "Barb";
		names[3] = "Jaylen";

		char[] letters1 = names[0].toCharArray();
		char[] letters2 = names[1].toCharArray();
		char[] letters3= names[2].toCharArray();
		char[] letters4 = names[3].toCharArray();
		
		System.out.println("The first letter of my name is " + letters1[0]);
		System.out.println("The first letter of my name is " + letters2[0]);
		System.out.println("The first letter of my name is " + letters3[0]);
		System.out.println("The first letter of my name is " + letters4[0]);
		
	}

}
