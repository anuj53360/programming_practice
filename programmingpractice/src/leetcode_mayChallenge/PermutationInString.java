package leetcode_mayChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationInString {

	public static boolean checkInclusion(String s1, String s2) {
		if (s2.length() < s1.length())
			return false;
List<Integer> list=new ArrayList<>();
		int[] s1check = new int[26];
		int[] s2check = new int[26];
		Arrays.fill(s1check, 0);
		Arrays.fill(s2check, 0);
		int left = 0;
		int right = 0;
		while (right < s1.length()) {
			s1check[s1.charAt(right) - 'a'] += 1;
			s2check[s2.charAt(right) - 'a'] += 1;
			right++;
		}

		if (Arrays.compare(s1check, s2check) == 0) {
			 list.add(left);
			//return true;
		}

		while (right < s2.length()) {
			s2check[s2.charAt(right) - 'a'] += 1;
			s2check[s2.charAt(left) - 'a'] -= 1;
			left++;
			right++;
			if (Arrays.compare(s1check, s2check) == 0) {
				 list.add(left);
				//return true;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "eidboaooo";
		boolean b = checkInclusion(s1, s2);
		System.out.println(b);
	}
}
