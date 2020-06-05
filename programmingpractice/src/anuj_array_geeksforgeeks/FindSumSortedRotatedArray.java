package anuj_array_geeksforgeeks;

public class FindSumSortedRotatedArray {

	public static boolean sumSortedRotatedArray(int[] arr, int x) {
		int n = arr.length;
		if (arr.length == 0) {
			return false;
		}
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] > arr[i + 1]) {
				break;
			}
		}
		int left = i + 1;
		int right = i;
		while (left != right) {
			if (arr[left] + arr[right] == x) {
				return true;
			}
			if (arr[left] + arr[right] < x) {
				left = (left + 1) % n;
			//	left++;
				System.out.println(left+"AAAAAA");
			} else {
				System.out.println(n+right-1);
				right = (n + right - 1) % n;
				
				System.out.println(right+"BBBBBBBB");
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 11, 15, 6, 8, 9, 10 };
		int x = 16;
		sumSortedRotatedArray(arr, x);
	}
}
