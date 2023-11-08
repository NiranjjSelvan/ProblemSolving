package Implementations;

import java.util.HashMap;
import java.util.Map;

public class hashMap {

	public static void main(String[] args) {
		// Create a HashMap with Integer keys and String values
		Map<Integer, String> hashMap = new HashMap<>();

		// Add key-value pairs to the HashMap
		hashMap.put(1, "Alice");
		hashMap.put(2, "Bob");
		hashMap.put(3, "Charlie");
		hashMap.put(4, "David");

		// Access values by their keys
		String value1 = hashMap.get(1);
		String value3 = hashMap.get(3);

		System.out.println("Value associated with key 1: " + value1);
		System.out.println("Value associated with key 3: " + value3);

		// Check if a key exists in the HashMap
		boolean containsKey2 = hashMap.containsKey(2);
		System.out.println("Does the HashMap contain key 2? " + containsKey2);

		// Check if a value exists in the HashMap
		boolean containsValueEve = hashMap.containsValue("Eve");
		System.out.println("Does the HashMap contain value 'Eve'? " + containsValueEve);

		// Remove a key-value pair from the HashMap
		hashMap.remove(4);

		// Iterate over the keys and values in the HashMap
		System.out.println("Iterating over the HashMap:");
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

	}

}
