package ProblemSolving;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequenciesOfWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence for which frequencies has to be found : ");
		String input = scan.nextLine().toLowerCase();
		scan.close();
		frequenciesOfCharacter(input);
	}

	private static void frequenciesOfCharacter(String input) {
		String[] words = input.split("\\s+");
		LinkedHashMap<String, Integer> wordFrequency = new LinkedHashMap<>();
		for (String word : words) {
			if (wordFrequency.containsKey(word)) {
				wordFrequency.put(word, wordFrequency.get(word) + 1);
			} else
				wordFrequency.put(word, 1);
		}
		for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
			System.out.println("\""+entry.getKey()+ "\" appears " + entry.getValue() + " times.");
		}
	}

}
