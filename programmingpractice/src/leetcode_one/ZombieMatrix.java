package leetcode_one;

import java.util.LinkedList;
import java.util.Queue;

public class ZombieMatrix {

	public static int minHours(int rows, int columns, int[][] grid) {
		int humancount = 0;
		int days = 0;
		Queue<int[]> queue = new LinkedList<>();
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 0) {
					humancount++;
				} else {
					queue.offer(new int[] { i, j });
				}
			}
		}
		int[][] dir = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
		while (!queue.isEmpty() && humancount > 0) {
			int[] zombie = queue.poll();
			for (int[] di : dir) {
				int newx = di[0] + zombie[0];
				int newy = di[1] + zombie[1];
				if (newx >= 0 && newy >= 0 && newx < grid.length && newy < grid[0].length && grid[newx][newy] == 0) {
					grid[newx][newy] = 1;
					queue.offer(new int[] { newx, newy });
					humancount--;
				}

			}

		}
		days++;

		return humancount == 0 ? days : -1;
	}

	public static void main(String[] args) {
		int[][] grid = { { 0, 1, 1, 0, 1 }, { 0, 1, 0, 1, 0 }, { 0, 0, 0, 0, 1 }, { 0, 1, 0, 0, 0 } };
		int rows = grid.length;
		int columns = grid[0].length;
		minHours(rows, columns, grid);
	}
}
