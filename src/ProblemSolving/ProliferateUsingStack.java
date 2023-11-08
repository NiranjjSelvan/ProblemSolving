package ProblemSolving;

import java.util.Scanner;
import java.util.Stack;

public class ProliferateUsingStack {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the expression - ");
		String input = scan.nextLine();
		scan.close();
		String output = parseString(input);
		System.out.println("Output: " + output);
	}

	public static String parseString(String input) {
		Stack<Integer> countStack = new Stack<>();
		Stack<StringBuilder> stringStack = new Stack<>();
		StringBuilder currentString = new StringBuilder();
		int count = 0;
		for (char c : input.toCharArray()) {
			if (Character.isDigit(c)) {
				count = count * 10 + (c - '0');
			} else if (c == '[') {
				countStack.push(count);
				stringStack.push(currentString);
				count = 0;
				currentString = new StringBuilder();
			} else if (c == ']') {
				int repeatCount = countStack.pop();
				StringBuilder repeatedString = new StringBuilder();
				for (int i = 0; i < repeatCount; i++) {
					repeatedString.append(currentString);
				}
				currentString = stringStack.pop().append(repeatedString);
			} else {
				currentString.append(c);
			}
		}
		return currentString.toString();
	}

}
