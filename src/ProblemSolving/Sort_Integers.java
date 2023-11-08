package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

class Sort_Integers {
	static int arraySize, i, j, temp;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array - ");
		arraySize = scan.nextInt();
		int[] items = new int[arraySize];
		System.out.println("Input the array items - ");
		for (i = 0; i < arraySize; i++) {
			items[i] = scan.nextInt();
		}
		scan.close();
		System.out.println("Input array is " + Arrays.toString(items));
		/*
		 * Using inbuilt method Ascending -> Arrays.sort(items);
		 */
		afterSort(items, arraySize);
		System.out.println("Sorted array is " + Arrays.toString(items));

	}

	static void afterSort(int[] items, int arraySize) {
		// - Using for loop to sort ascending
		for (i = 0; i < arraySize; i++) {
			for (j = i + 1; j < arraySize; j++) {
				if (items[i] < items[j]) {
					temp = items[i];
					items[i] = items[j];
					items[j] = temp;
				}
			}
		}
	}
}
