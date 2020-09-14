package leetcode;

public class ShortestSubArrayRemoved {

	public static int findLengthOfShortestSubarray(int[] arr) {

		int n = arr.length;
		int left = 0;
		int right = n - 1;

		while (left < n && arr[left] <= arr[left + 1]) {
			left++;
			if (left == n - 1) {
				return 0;
			}
		}

		while (right > left && arr[right] >= arr[right - 1]) {
			right--;
			if (right == 0) {
				return n - 1;
			}
		}

		int result = Math.min(n - 1 - left, right);
		int i = 0;
		int j = right;

		while (i <= left && j < n) {
			if (arr[j] >= arr[i]) {
				result = Math.min(result, j - i - 1);
				i++;
			} else {
				j++;
			}
		}

		return result;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 10, 4, 2, 3, 5 };
		findLengthOfShortestSubarray(arr);
	}
}
