package leetcode_mayChallenge;

public class UncrossedLines {

	public static int maxUncrossedLines(int[] A, int[] B) {

		int m = A.length;
		int n = B.length;
		int[][] dp = new int[m + 1][n + 1];

		for (int i = 1; i < m + 1; i++) {
			for (int j = 1; j < n + 1; j++)
				dp[i][j] = A[i - 1] == B[j - 1] ? 1 + dp[i - 1][j - 1] : Math.max(dp[i][j - 1], dp[i - 1][j]);
		}
		return dp[m][n];
	}

	public static void main(String[] args) {
		int[] A = { 1, 3, 7, 1, 7, 5 };
		int[] B = { 1, 9, 2, 5, 1 };
		maxUncrossedLines(A, B);
	}
}
