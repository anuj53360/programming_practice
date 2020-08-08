package anuj_array_geeksforgeeks;

import java.util.HashSet;

public class FindTripletSumEqualZero {

	public static void findTripletSum(int[] arr, int n) {

		boolean found = false;
		for (int i = 0; i < n - 1; i++) {
			HashSet<Integer> s = new HashSet<Integer>();
			for (int j = i + 1; j < n; j++) {
				int x = -(arr[i] + arr[j]);
				if (s.contains(x)) {
					System.out.printf("%d %d %d\n", x, arr[i], arr[j]);
					found = true;
				} else {
					s.add(arr[j]);
				}
			}
		}

		if (found == false) {
			System.out.printf(" No Triplet Found\n");
		}
	}

	public static void main(String[] args) {
		int[] array = { 0, -1, 2, -3, 1 };
		int n = array.length;
		findTripletSum(array, n);
	}
}
