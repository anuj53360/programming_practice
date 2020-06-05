package leetcode_mayChallenge;

import java.util.Stack;

public class RemoveKDigit {

	public static String removeKdigits(String num, int k) {
		Stack<Character> stack = new Stack<>();
		if (k == 0) {
			return num;
		}
		if (num.length() == k) {
			return String.valueOf(0);
		}

		for (int i = 0; i < num.length(); i++) {
			while (!stack.isEmpty() && k > 0 && stack.peek() > num.charAt(i)) {
				stack.pop();
				k--;
			}
			stack.push(num.charAt(i));
		}

		for (int i = 0; i < k; i++) {
			stack.pop();
		}

		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		sb.reverse();

		while (sb.length() > 1 && sb.charAt(0) == '0') {
			sb.deleteCharAt(0);
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		int k = 3;
		String num = "1432219";
		removeKdigits(num, k);
	}
}
