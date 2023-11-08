package ProblemSolving;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of rows for the pyramid: ");
		int numRows = scan.nextInt();
		scan.close();
		for (int i = 1; i <= numRows; i++) {
			// Print spaces for the left side of the pyramid
			for (int j = 1; j <= numRows - i; j++) {
				System.out.print(" ");
			}

			// Print asterisks for the left side of the pyramid
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}

			// Move to the next line after each row
			System.out.println();
		}

	}
}
