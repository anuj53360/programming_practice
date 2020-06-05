package hackerrank;

import java.util.Stack;

public class AlternatingCharacter {

	static int alternatingCharacters(String s) {
		if (s.length() < 1)
			return 0;
		Stack<Character> stack = new Stack<>();
		stack.push(s.charAt(0));
		int count = 0;
		for (int i = 1; i < s.length(); i++) {
			if (stack.peek() != s.charAt(i)) {
				stack.push(s.charAt(i));
			} else {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		String s = "AAABBB";
		System.out.println(alternatingCharacters(s));
	}
}
