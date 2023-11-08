package ProblemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesiredSumUsing_k {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int targetSum = scan.nextInt();
		int k = scan.nextInt(); // Set the maximum number allowed (e.g., numbers below 3)
		scan.close();
		List<List<Integer>> result = findCombinations(targetSum, k);

		if (result.isEmpty()) {
			System.out.println("No combinations found.");
		} else {
			System.out.println("All possible combinations to sum to " + targetSum + ":");
			for (List<Integer> combination : result) {
				System.out.println(combination);
			}
		}
	}

	public static List<List<Integer>> findCombinations(int targetSum, int k) {
		List<List<Integer>> result = new ArrayList<>();
		findCombinationsHelper(targetSum, k, new ArrayList<>(), result, 1);
		return result;
	}

	private static void findCombinationsHelper(int remainingSum, int k, List<Integer> currentCombination,
			List<List<Integer>> result, int start) {
		if (remainingSum == 0) {
			result.add(new ArrayList<>(currentCombination));
			return;
		}

		for (int i = start; i <= k && i <= remainingSum; i++) {
			currentCombination.add(i);
			findCombinationsHelper(remainingSum - i, k, currentCombination, result, i);
			currentCombination.remove(currentCombination.size() - 1);
		}
	}
}
