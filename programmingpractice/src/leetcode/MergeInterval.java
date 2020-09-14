package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class MergeInterval {

	public static int[][] merge(int[][] intervals) {

		Arrays.sort(intervals, (a1, a2) -> Integer.compare(a1[0], a2[0]));

		List<int[]> list = new ArrayList<>();

		if (intervals.length == 0) {
			return new int[0][0];
		}

		for (int i = 0; i < intervals.length; i++) {
			list.add(intervals[i]);
		}

		
		
		int[] curr = list.get(0);
		int i = 1;

		while (i < intervals.length) {
			int[] inter = list.get(i);

			if (curr[1] < inter[0]) {
				curr = list.get(i);
				i++;
			} else {
				int max = Math.max(curr[1], inter[1]);
				list.get(i - 1)[1] = max;
				list.remove(i);
			}

		}

		return list.toArray(new int[list.size()][]);
		

	}

	public static void main(String[] args) {
		int[][] interval = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		merge(interval);

	}
}
