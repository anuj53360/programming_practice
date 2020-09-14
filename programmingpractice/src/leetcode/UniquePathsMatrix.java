package leetcode;

public class UniquePathsMatrix {

	public static int uniquePaths(int m, int n) {

		if (m == 1 || n == 1) {
			return 1;
		}
		return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
	}

	public static int uniquePathsDp(int m, int n) {

		int[][] dp = new int[m][n];

		for (int i = 0; i < m; i++) {
			dp[i][0] = 1;
		}

		for (int i = 0; i < n; i++) {
			dp[0][i] = 1;
		}

		for (int i = 1; i < dp.length - 1; i++) {

			for (int j = 1; j < dp[0].length - 1; j++) {

				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			}
		}

		return dp[m - 1][n - 1];
	}

	public static void main(String[] args) {

		int m = 3;
		int n = 3;
		System.out.println(uniquePaths(m, n));
		uniquePathsDp(m, n);
	}
}
