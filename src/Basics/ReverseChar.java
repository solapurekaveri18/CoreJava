package Basics;

import java.util.Scanner;

public class ReverseChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter string");
		String original = scan.nextLine();

		while (original.isEmpty() || original == null) {
			System.out.println("Please enter valid string, empty/null string not allowed");
			original = scan.nextLine();

		}
		scan.close();

		System.out.println(ReverseLogic(original));
	}

	private static String ReverseLogic(String enteredString) {
		String s = "";

		for (int i = enteredString.length() - 1; i >= 0; i--) {
			s = s + enteredString.charAt(i);
		}

		return s;

	}
}
