package java_practice;

import java.util.HashSet;

public class SubStringDeletion {

	public static void main(String[] args) {
		String s = "abcc";

		Integer x=subStringDeletion(s);
		System.out.println(x.toString());
	}

	private static int subStringDeletion(String s) {

//		if (s == null) {
//			return 0;
//		}
//
//		if (s.length() == 1) {
//			return 1;
//		}
		int count = 0;

		HashSet<Character> set = new HashSet<>();

		//if (s.length() >1 ) {

			for (int i = 0; i < s.length(); i++) {
				if (!set.contains(s.charAt(i))) {
					set.add(s.charAt(i));
					//count++;
				} else {
					count=+2;
				}

			}
		//}

		return count;

	}
}
