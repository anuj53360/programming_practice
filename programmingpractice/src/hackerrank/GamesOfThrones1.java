package hackerrank;

import java.util.Arrays;

public class GamesOfThrones1 {

	static String gameOfThrones(String s) {
		Boolean b = false;
		int count = 0;
		String result = "";
		int[] char_array = new int[26];
		Arrays.fill(char_array, 0);

		for (int i = 0; i < s.length(); i++) {
			char_array[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < char_array.length; i++) {
			if (char_array[i] % 2 == 0) {
				b = true;
			} else if (char_array[i] % 2 != 0) {
			count++;
			}
		}
		if(count>1) {
		   b=false;
		}
		if (b)
			return "YES";
		else
			return "NO";
	}

	public static void main(String[] args) {

	}
}
