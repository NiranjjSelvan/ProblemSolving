package ProblemSolving;

import java.util.Scanner;

public class PalindromeCheckerOnInteger {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the i1231nput : ");
		int input = scan.nextInt();
		scan.close();
		if (isPalindrome(input)) {
			System.out.println(input + " is a palindrome.");
		} else {
			System.out.println(input + " is not a palindrome.");
		}
	}

	public static boolean isPalindrome(int input) {
		int originalNumber = input;
		int reversedNumber = 0;

		while (input > 0) {
			int remainder = input % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			input /= 10;
		}

		return originalNumber == reversedNumber;
	}
}
