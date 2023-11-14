package Implementations;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine();
		scan.close();
		StringTokenizer tokenizer = new StringTokenizer(inputString, "/");
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
	}

}
