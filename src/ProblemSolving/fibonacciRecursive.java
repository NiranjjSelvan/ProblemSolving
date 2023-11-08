package ProblemSolving;

import java.util.Scanner;

public class fibonacciRecursive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for which fibonacci value has to be found : ");
		int n = scan.nextInt();
		scan.close();
		System.out.println("The " + n + "th Fibonacci number is: " + getFibonacci(n));
	}

	public static int getFibonacci(int n) {
		if (n <= 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return getFibonacci(n - 1) + getFibonacci(n - 2);
		}
	}
}
