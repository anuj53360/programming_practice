package leetcode;

public class IncreasingTriplet {

	public boolean increasingTriplet(int[] nums) {
		if (nums.length < 3) {
			return false;
		}

		int a = Integer.MAX_VALUE;
		int b = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < nums[i + 1]) {
				int c = nums[i];
				int d = nums[i + 1];

				if (b < c || b < d) {
					return true;
				}
				if (a < c) {
					return true;
				}

				a = c;
				b = d;
			}

		}
		return false;
	}

	public static void main(String[] args) {

	}
}
