package ProblemSolving;

import java.util.Scanner;

public class PatternGeneration {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input : ");
		int input = scan.nextInt();
		scan.close();
		System.out.println("Here is the Diamond pattern");
		for (int i = 1; i <= input; i++) {
			for (int j = i; j < input; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for (int i = 1; i <= input; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = input; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("Here is the Arrowed-triangle pattern");
		for (int i = 1; i < input; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for (int i = input; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("Here is the left sided triangle pattern");
		for (int i = 1; i <= input; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		int space;
		System.out.println("Here is the right sided triangle pattern");
		for (int i = 1; i <= input; i++) {
			for (space = input; space > i; space--) {
				System.out.print("  ");
			}
			for (int k = 0; k < space; k++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
		System.out.println("Here is the Hill pattern");
		for (int i = 1; i <= input; i++) {
			for (int j = i; j < input; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
