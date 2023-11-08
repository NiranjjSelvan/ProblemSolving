package ProblemSolving;

import java.util.Scanner;

public class Palindrome_Integer {

	public static void main(String[] args) {
		int input;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an input to check if it is a palindrome or not -");
		input = scan.nextInt();
		scan.close();
		System.out.println("You have entered - " + input + " and " + isPalindrome(input));
	}

	static String isPalindrome(int input) {
		int temp = input, r, sum = 0;
		while (input > 0) {
			r = input % 10;
			sum = (sum * 10) + r;
			input = input / 10;
		}
		if (temp == sum)
			return "it is a Palindrome";
		else
			return "it is not a Palindrome";
	}
}
