package anuj_array_geeksforgeeks;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 2, 5, 6 };
		int m = arr1.length;
		int n = arr2.length;
		merge(arr1, m, arr2, n);
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] arr3 = new int[m + n];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < m && j < n) {
			if (nums1[i] < nums2[j]) {
				arr3[k] = nums1[i];
				k++;
				i++;
			} else {
				arr3[k] = nums2[j];
				k++;
				j++;
			}
		}
		while (i < m) {
			arr3[k] = nums1[i];
			k++;
			i++;
		}
		while (j < n) {
			arr3[k] = nums2[j];
			k++;
			j++;
		}
          nums1=Arrays.copyOf(arr3,m+n);
for (int k2 = 0; k2 < nums1.length; k2++) {
	System.out.println(nums1[k2]);
}
	}
}
