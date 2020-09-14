package leetcode;

import java.util.Stack;

public class LongestValidParenthesis {

	public static int longestValidParentheses(String s) {

		Stack<Integer> stack = new Stack<>();
		int[] helper = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(i);
			} else if (s.charAt(i) == ')') {
				if (!stack.isEmpty()) {
					int temp = stack.pop();
					helper[temp] = 1;
					helper[i] = 1;
				}
			}
		}

		int max = 0;
		int curr = 0;
		for (int k = 0; k < helper.length; k++) {
			if (helper[k] == 1) {
				curr++;
			} else {
				max = Math.max(curr, max);
				curr = 0;
			}
		}
		return Math.max(curr, max);

	}

	public static void main(String[] args) {
		String s = ")()())";
		longestValidParentheses(s);
	}
}
