package binarytree;

import java.util.HashMap;
import java.util.Map;

public class UniqueBinarySearchTree {

	public static int numTrees(int n) {

		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		map.put(1, 1);
		return numTreeUtil(n, map);
	}

	private static int numTreeUtil(int n, Map<Integer, Integer> map) {
		if (map.containsKey(n))
			return map.get(n);
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += numTreeUtil(i - 1, map) * numTreeUtil(n - i, map);
		map.put(n, sum);
		return sum;
	}

	public static void main(String[] args) {
		int n = 5;
		numTrees(n);

	}
}
