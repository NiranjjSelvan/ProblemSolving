package ProblemSolving;

import java.util.LinkedHashMap; 
import java.util.Map;
import java.util.Scanner;

public class FrequenciesOfCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word for which frequencies has to be found : ");
		String input = scan.nextLine().toLowerCase();
		scan.close();
		frequenciesOfCharacter(input);
	}

	public static void frequenciesOfCharacter(String input) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (Character c : input.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else
				map.put(c, 1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println("\"" + entry.getKey() + "\" appears " + entry.getValue()+" times.");
		}
	}
}
