package leetcode;

public class BestTimeBuySellStock {

	public static int maxProfit(int[] prices) {

		if (prices.length == 0) {
			return 0;
		}
		int maxprofit = 0;
		int min = prices[0];

		for (int i = 1; i < prices.length; i++) {
			maxprofit = Math.max(maxprofit, prices[i] - min);
			min = Math.min(min, prices[i]);
		}

		return maxprofit;
	}

	public static void main(String[] args) {

		int[] prices = { 7, 1, 5, 3, 6, 4 };
		maxProfit(prices);
	}
}
