package dynamicprogramming;

public class JumpGame {

	public int jump(int[] nums) {

		int n = nums.length;
		int[] temp = new int[nums.length];
		if (n == 0 || nums[0] == 0) {
			return Integer.MAX_VALUE;
		}

		temp[0] = 0;

		for (int i = 1; i < nums.length; i++) {

			temp[i] = Integer.MAX_VALUE;
			for (int j = 0; j < i; j++) {

				if (i <= j + nums[j] && temp[j] != Integer.MAX_VALUE) {
					temp[i] = Math.min(temp[i], temp[j] + 1);
					break;
				}
			}
		}
		return temp[n - 1];
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 6, 1, 0, 9 };
	}
}
