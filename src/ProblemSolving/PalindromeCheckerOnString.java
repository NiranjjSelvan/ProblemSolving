package ProblemSolving;

import java.util.Scanner;

public class PalindromeCheckerOnString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		if (isPalindrome(input)) {
			System.out.println(input + " is a palindrome.");
		} else {
			System.out.println(input + " is not a palindrome.");
		}
	}

	public static boolean isPalindrome(String input) {
		int left = 0;
		int right = input.length() - 1;

		while (left < right) {
			if (input.charAt(left) != input.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
