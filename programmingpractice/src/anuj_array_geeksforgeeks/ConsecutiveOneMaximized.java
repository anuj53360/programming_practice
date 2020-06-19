package anuj_array_geeksforgeeks;

public class ConsecutiveOneMaximized {

	public static void consecutiveOneMaximized(int[] array, int m) {

		int left = 0;
		int right = 0;
		int zerocount = 0;
		int maxwindow = 0;
		int bestleft = 0;

		while (right < array.length) {
			if (zerocount <= m) {
				if (array[right] == 0) {
					zerocount++;
				}
				right++;
			}
			if (zerocount > m) {
				if (array[left] == 0) {
					zerocount--;
				}
				left++;
			}
			if (right - left > maxwindow && (zerocount <= m)) {
				maxwindow = right - left;
				bestleft = left;
			}
		}
		
		
		for (int i = 0; i < maxwindow; i++) {
			if(array[bestleft+i]==0)
				System.out.println(bestleft+i);
		}

	}

	public static void main(String[] args) {
		int[] array = { 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1 };
		int m = 2;
		consecutiveOneMaximized(array, m);
	}
}
