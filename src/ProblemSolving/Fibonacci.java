package ProblemSolving;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int count;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the count -");
		count = scan.nextInt();
		scan.close();
		getFibonacci(count);
	}

	static void getFibonacci(int count) {
		int n1 = 0, n2 = 1, n3 = 0, i = 0;
		while (i < count) {
			System.out.print(+n1 + " ");
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			i++;
		}
	}

}
