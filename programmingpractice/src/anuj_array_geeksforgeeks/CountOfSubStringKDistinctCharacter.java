package anuj_array_geeksforgeeks;

import java.util.HashMap;

public class CountOfSubStringKDistinctCharacter {

	public static void kdistinctCharacterCount(String str, int k) {

		HashMap<Character, Integer> map = new HashMap<>();

		int count = 0;

		for (int i = 0; i < k; i++) {
			if (map.get(str.charAt(i)) == null) {
				map.put(str.charAt(i), 1);
			} else {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}
		}
		if (map.size() == k) {
			count++;
		}
		System.out.println(map.size()+" "+count);

		for (int i = k; i < str.length(); i++) {
			if (map.get(str.charAt(i)) == null) {
				map.put(str.charAt(i), 1);
			} else {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}
			map.put(str.charAt(i - k), map.get(str.charAt(i-k)) - 1);

			if (map.get(str.charAt(i - k)) == 0) {
				map.remove(str.charAt(i - k));
			}

			if (map.size() == k) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		String str = "aabcdabbcdc";
		int k = 3;
		kdistinctCharacterCount(str, k);
	}
}
