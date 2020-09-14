package leetcode;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

	public static int[][] insert(int[][] intervals, int[] newInterval) {

		List<int[]> list = new ArrayList<>();

		if (intervals.length == 0) {
			List<int[]> list1 = new ArrayList<>();
			list1.add(newInterval);
			return list1.toArray(new int[1][]);
		}

		for (int i = 0; i < intervals.length; i++) {
			list.add(intervals[i]);
		}

		int i = 0;
		while (i < list.size()) {
			int[] curr = list.get(i);

			if (curr[1] < newInterval[0]) {
				i++;
			} else if (curr[0] > newInterval[1]) {
				list.add(i, newInterval);
				break;

			} else {
				int min = Math.min(curr[0], newInterval[0]);
				int max = Math.max(curr[1], newInterval[1]);
				newInterval[0] = min;
				newInterval[1] = max;
				list.remove(i);
			}
		}

		if (i == list.size())
			list.add(newInterval);

		return list.toArray(new int[list.size()][]);

	}

	public static void main(String[] args) {

		int[][] intervals = { { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, { 12, 16 } };
		int[] newInterval = { 4, 8 };
		insert(intervals, newInterval);
	}
}
