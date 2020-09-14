package leetcode;

public class CountNoOfTems {

	public static int numTeams(int[] rating) {

		int[] dp = new int[rating.length];
		int count = 0;
		int len = rating.length;

		if (rating.length == 0) {
			return 0;
		}

		for (int i = 0; i < rating.length; i++) {

			for (int j = i; j >= 0; j--) {
				if (rating[i] > rating[j]) {
					dp[i]++;
					count = count + dp[j];
				}
			}
		}

		dp = new int[len];

		for (int i = 0; i < rating.length; i++) {

			for (int j = i; j >= 0; j--) {
				if (rating[i] < rating[j]) {
					dp[i]++;
					count = count + dp[j];
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {

		int[] rating = { 2, 5, 3, 4, 1 };
		numTeams(rating);
	}
}
