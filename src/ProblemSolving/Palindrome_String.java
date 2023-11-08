package ProblemSolving;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		String original;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an input to check if it is a palindrome or not -");
		original = scan.nextLine().toLowerCase();
		scan.close();
		if (isPalindrome(original))
			System.out.println(original + "It is a Palindrome");
		else
			System.out.println(original + "It is not a Palindrome");
	}

	public static boolean isPalindrome(String original) {
		int left = 0, right = (original.length() - 1);
		while (left < right) {
			if (original.charAt(left) != original.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
