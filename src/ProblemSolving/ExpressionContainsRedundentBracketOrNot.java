package ProblemSolving;

import java.util.Stack;

public class ExpressionContainsRedundentBracketOrNot {

	public static void main(String[] args) {
		String expression1 = "((a+b))";
		String expression2 = "(a+b)";
		String expression3 = "((a+b)*(c-d))";

		System.out.println("Expression 1 has redundant brackets: " + hasRedundantBrackets(expression1));
		System.out.println("Expression 2 has redundant brackets: " + hasRedundantBrackets(expression2));
		System.out.println("Expression 3 has redundant brackets: " + hasRedundantBrackets(expression3));

	}

	public static boolean hasRedundantBrackets(String expression) {
		Stack<Character> stack = new Stack<>();
		for (char ch : expression.toCharArray()) {
			if (ch == ')') {
				char top = stack.pop();
				boolean hasOperators = false;
				while (top != '(') {
					if (top == '+' || top == '-' || top == '*' || top == '/')
						hasOperators = true;
					top = stack.pop();
				}
				if (!hasOperators) {
					return true;
				}
			} else {
				stack.push(ch);
			}
		}
		return false;
	}
}
