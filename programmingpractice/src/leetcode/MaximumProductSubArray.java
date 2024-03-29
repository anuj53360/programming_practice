package leetcode;

public class MaximumProductSubArray {

	public static int maxProduct(int[] nums) {

		int result = nums[0];
		int maxpr = nums[0];
		int minpr = nums[0];

		int first = 0;
		int second = 0;
		for (int i = 1; i < nums.length; i++) {
			first = maxpr * nums[i];
			second = minpr * nums[i];

			maxpr = Math.max(nums[i], Math.max(first, second));
			minpr = Math.min(nums[i], Math.min(first, second));
			result = Math.max(result, maxpr);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, -2, 4 };
		maxProduct(nums);
	}
}
