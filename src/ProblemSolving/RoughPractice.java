package ProblemSolving;

import java.util.Scanner;

public class RoughPractice {
	static String output;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the expression - ");
		String input = scan.nextLine();
		scan.close();
		System.out.println("Final output is - " + generatePattern(input.toLowerCase()));
	}

	public static String generatePattern(String input) {
		StringBuffer buffer = new StringBuffer("");
		output = "";
		int multiplier = -1, multiplierPosiion = -1, openPosition = -1, closePosition = -1, inputSize = input.length();
		for (int i = inputSize - 1; i >= 0; i--) {
			if (input.charAt(i) == '[') {
				openPosition = i;
				System.out.println("Inner Iteration #" + i + " has OpenPosition");
			} else if (input.charAt(i) == ']') {
				closePosition = i;
				System.out.println("Inner Iteration #" + i + " has ClosePosition");
			} else if (input.charAt(i) >= 97 && input.charAt(i) <= 122) {
				buffer = buffer.insert(0, input.charAt(i));
				System.out.println("InnerIteration #" + i + " has Buffer value " + buffer);
			} else if (input.charAt(i) >= 48 && input.charAt(i) <= 57) {
				multiplierPosiion = i;
				multiplier = Integer.parseInt(String.valueOf(input.charAt(i)));
				System.out.println("Inner Iteration #" + i + " has multiplier value " + multiplier);
			}
			if (closePosition > -1 && openPosition > -1 && multiplierPosiion > -1 && multiplier > -1) {
				output = proliferateAndReplace(buffer, multiplier);
				input = input.replace(input.substring(multiplierPosiion, (closePosition + 1)), output);
				System.out.println("Inner Input after replacement - " + input);
				System.out.println("Actual last character is - " + input.charAt(input.length() - 1));
				if (input.charAt(input.length() - 1) == ']') {
					inputSize = input.length();
					generatePattern(input);
				} else {
					buffer = new StringBuffer("");
					openPosition = closePosition = multiplierPosiion = multiplier = -1;
					return output;
				}
			}
		}
		return output;
	}

	public static String proliferateAndReplace(StringBuffer buffer, int multiplier) {
		for (int i = 0; i < multiplier; i++) {
			System.out.println("Outer Iteration number - " + i);
			output = output.concat(buffer.toString());
			System.out.println("Lucky Output has - " + output);
		}
		return output;
	}
}
