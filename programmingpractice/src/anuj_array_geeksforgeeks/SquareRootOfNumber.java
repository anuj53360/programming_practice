package anuj_array_geeksforgeeks;

public class SquareRootOfNumber {

	// using binary search
	public int squareRoot(int x) {
		if (x == 0 || x == 1)
			return x;
		int left = 0;
		int right = x;
		int ans = 0;

		while (left < right) {
			int mid = left + (right - left) / 2;
			if (mid * mid == x) {
				return mid;
			}
			if (mid * mid < x) {
				left = mid + 1;
				ans = mid;
			} else {
				right = mid - 1;
			}

		}

		return ans;
	}

	public static void main(String[] args) {
		int x = 11;
	}
}
