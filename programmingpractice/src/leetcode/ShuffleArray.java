package leetcode;

public class ShuffleArray {

	public static int[] shuffle(int[] nums, int n) {

		int[] temp = new int[nums.length];

		int i = 0;
		int j = 0;

		int k = 0;
		int l = n;
		while (i < nums.length) {
			temp[i] = nums[k];
			i++;
			temp[i] = nums[l];
			k++;
			l++;
			i++;

		}

		return temp;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 4, 3, 2, 1 };
		int n = 4;
		int[] temp = shuffle(nums, n);
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}

}
