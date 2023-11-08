package ProblemSolving;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintCharacterwithinbrackets {

	public static void main(String[] args) {
		String input = "a2[b3[c]]"; // Example input string
		String output = processString(input);
		System.out.println(output); // Output: abcccbcc
	}

	public static String processString(String input) {
		StringBuilder result = new StringBuilder();
		Pattern pattern = Pattern.compile("(\\d+)\\[(\\w+)\\]");
		Matcher matcher = pattern.matcher(input);

		int lastIndex = 0;
		while (matcher.find()) {
			int multiplier = Integer.parseInt(matcher.group(1));
			String characters = matcher.group(2);

			result.append(input.substring(lastIndex, matcher.start())); // Append characters before the match
			result.append(repeatCharacters(characters, multiplier)); // Append the multiplied characters
			lastIndex = matcher.end(); // Update the last index

			// Handle characters after the last match
			if (lastIndex < input.length() - 1 && !matcher.find()) {
				result.append(input.substring(lastIndex));
			}
		}

		return result.toString();
	}

	public static String repeatCharacters(String characters, int times) {
		StringBuilder repeated = new StringBuilder();
		for (int i = 0; i < times; i++) {
			repeated.append(characters);
		}
		return repeated.toString();
	}
}
