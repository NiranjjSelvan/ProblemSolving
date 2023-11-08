package ProblemSolving;

import java.util.Scanner;

public class Basics {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string - ");
		String input = scan.nextLine();
		scan.close();
		System.out.println("You have entered - " + input);
	}

}
