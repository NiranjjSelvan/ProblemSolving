package ProblemSolving;

import java.util.Scanner;

public class CrossTheBridge_MinimalMoves {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter teh total number of bricks ");
		int total = scan.nextInt();
		int[] brickValues = new int[total];
		System.out.println("Input the values of the brick");
		for (int i = 0; i < total; i++) {
			brickValues[i] = scan.nextInt();
		}
		scan.close();
		System.out.println("Minimal move to cross the bridge is " + getMinimalMove(total, brickValues));
	}

	static int getMinimalMove(int total, int[] brickValues) {
		int moves = 0;
		for (int i = 0; i < total; i++) {
			for (int j = total - 1; j > i; j--) {
				if (brickValues[i] == brickValues[j]) {
					i = j;
				}
			}
			moves++;
		}
		return moves;
	}

}
