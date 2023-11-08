package ProblemSolving;

import java.util.Scanner;

public class Palindrome_SubString {

	public static void main(String[] args) {
		String original;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an input to check if it is a palindrome or not -");
		original = scan.nextLine().toLowerCase();
		scan.close();
		System.out.println("Input is - " + original + "\nPalindrome found are - " + isPallindromeSubString(original));
	}

	public static String isPallindromeSubString(String original) {
		String output = "", temp = "";
		int i, j;
		StringBuffer buffer;
		for (i = 0; i < original.length(); i++) {
			for (j = i + 1; j < original.length(); j++) {
				buffer = new StringBuffer(original.substring(i, j));
				temp = buffer.reverse().toString();
				if (original.substring(i, j).equals(temp) && original.substring(i, j).length() > 1)
					output = output + original.substring(i, j) + ",";
			}
		}
		return output;
	}
}
