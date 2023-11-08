package ProblemSolving;

import java.util.Scanner;

public class Find_Nth_Fibonacci {

	public static void main(String[] args) {
		int n, result;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the count -");
		n = scan.nextInt();
		scan.close();
		result = getNthFibonacci_Recurssion(n);
		System.out.println(n + "th value of the Fibonacci series is " + result);
	}

	static int getNthFibonacci_Recurssion(int n) {
		if (n == 0)
			return 0;
		else if (n == 1 || n == 2)
			return 1;
		return getNthFibonacci_Recurssion(n - 1) + getNthFibonacci_Recurssion(n - 2);
	}
}
