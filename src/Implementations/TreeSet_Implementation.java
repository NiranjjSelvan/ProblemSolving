package Implementations;

import java.util.TreeSet;

public class TreeSet_Implementation {
	public static void main(String[] args) {
		// Create a TreeSet of integers
		TreeSet<Integer> set = new TreeSet<>();

		// Add elements to the TreeSet
		set.add(5);
		set.add(2);
		set.add(8);
		set.add(2); // Duplicate, ignored

		// Check if an element exists in the TreeSet
		boolean containsEight = set.contains(8); // true
		System.out.println("Does the set contains 8? - " + containsEight);

		// Remove an element from the TreeSet
		set.remove(2);

		// Iterate over the elements (in ascending order)
		for (int number : set) {
			System.out.println(number);
		}
	}
}
