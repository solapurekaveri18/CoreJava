package Basics;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String to get reverse of it");
		String input = scan.nextLine();
		System.out.println(ReverseStringLogic(input));

		if (input.isEmpty() || input == null) {
			System.out.println("PLEASE ENTER VALID STRING");
			input = scan.nextLine();
		}
		if (input.length() == 1) {
			String REVERSE = input;

		}
	}

	private static String ReverseStringLogic(String enteredInput) {

		//

		String[] originalArray = enteredInput.split("\\s+");
		String text = "";
		for (String item : originalArray) {

			text = item + " " + text;
			// }

		}
		
		return text;
	}

}

// else {
// String[] originalArray = input.split("\\s+");
//
// for (String item : originalArray) { // this, is, a, test, string
// reverse = item + " " + reverse; // this + "", is + this, a + is this, test +
// a is this, string + test a is this
// }
// }
//
// return reverse.trim();
// }
// }