package java_practice;

import java.util.HashMap;
import java.util.Map;

public class AleceBobGameWar {

	public int solution(String A, String B) {
		// write your code in Java SE 8

		if (A.length() != B.length()) {
			return -1;
		}

		int count = 0;
		for (int i = 0; i < A.length(); i++) {
			char ac = A.charAt(i);
			char bc = B.charAt(i);
			count = solutionUtil(ac, bc);
		}
		return count;
	}

	static int countvalue = 0;

	private int solutionUtil(Character ac, Character bc) {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(2, "2");
		map.put(3, "3");
		map.put(4, "4");
		map.put(5, "5");
		map.put(6, "6");
		map.put(7, "7");
		map.put(8, "8");
		map.put(9, "9");
		map.put(10, "T");
		map.put(11, "J");
		map.put(12, "Q");
		map.put(13, "K");
		map.put(14, "A");

		Integer avalue = -1;
		Integer bvalue = -1;

		for (String value : map.values()) {
			if (value.equals(ac.toString())) {
				for (Map.Entry<Integer, String> entry : map.entrySet()) {

					if (entry.getValue().equals(value)) {
						avalue = (Integer) entry.getKey();
					}
				}
			}
		}

		for (String value : map.values()) {
			if (value.equals(bc.toString())) {
				for (Map.Entry<Integer, String> entry : map.entrySet()) {

					if (entry.getValue().equals(value)) {
						bvalue = (Integer) entry.getKey();
					}
				}
			}
		}

		if (avalue > bvalue) {
			countvalue++;
		}

		return countvalue;
	}

	public static void main(String[] args) {

		AleceBobGameWar alec = new AleceBobGameWar();
		System.out.println(alec.solution("23A84Q", "K2Q25J"));

	}
}
