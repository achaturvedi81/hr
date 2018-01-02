/**
 * 
 */
package com.abhishek.test;

import java.util.Stack;

/**
 * @author m975852
 *
 */
public class BalancedBrackets {

	public static boolean isBalanced(String expression) {
		Stack<Character> bracketsStack = new Stack<>();
		char[] characters = expression.toCharArray();
		for (char character : characters) {
			if (character == '(' || character == '[' || character == '{') {
				bracketsStack.push(character);
			} else {
				if (bracketsStack.isEmpty() || !matching(bracketsStack.pop(), character)) {
					return false;
				}
			}
		}
		return bracketsStack.isEmpty() ? true : false;
	}

	private static boolean matching(Character pop, char character) {
		boolean matched = false;
		switch (character) {
		case ')':
			if(pop.equals('(')) {
				matched = true;
			}
			break;
		case ']':
			if(pop.equals('[')) {
				matched = true;
			}
			break;

		case '}':
			if(pop.equals('{')) {
				matched = true;
			}
			break;

		default:
			break;
		}

		return matched;
	}

	public static void main(String[] args) {
		String[] testInputs = { "[]({})", "[]({})[]", "", "()()()[]{}[]([{}])", "([{]})[]"};
		for (String expression : testInputs) {
			System.out.println((isBalanced(expression)) ? "YES" : "NO");
		}
	}

}
