package practiceproblems;

public class FirstLetterOfNamesAuto {

	public static void main(String[] args) {

		String[] names = new String[4];
		names[0] = "Angela";
		names[1] = "Jamie";
		names[2] = "Barb";
		names[3] = "Jaylen";

		for (int idx = 0; idx<names.length; idx++) {
			char [] letters = names[idx].toCharArray();
		
		
		System.out.println("The first letter of "+ names[idx] + " is " + letters[0]);
		}
	}

}
