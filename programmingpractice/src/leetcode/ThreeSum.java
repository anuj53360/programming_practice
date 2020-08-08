package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {

	List<List<Integer>> list = new ArrayList<List<Integer>>();

	public List<List<Integer>> threeSum1(int[] nums) {

		for (int i = 0; i < nums.length - 1; i++) {
			List<Integer> list1 = new ArrayList<>();
			HashSet<Integer> s = new HashSet<Integer>();
			for (int j = i + 1; j < nums.length; j++) {

				int x = -(nums[i] + nums[j]);
				if (s.contains(x)) {
					System.out.printf("%d %d %d\n", x, nums[i], nums[j]);
					list1.add(x);
					list1.add(nums[i]);
					list1.add(nums[j]);
				} else {
					s.add(nums[j]);
				}

			}
			list.add(list1);

		}

		return list;
	}

	public List<List<Integer>> threeSum(int[] nums) {

		if (nums == null || nums.length < 3) {
			return new ArrayList<>();
		}

		List<List<Integer>> list = new ArrayList<>();

		for (int i = 0; i < nums.length - 2; i++) {

			if(i ==0 || (i>0 && nums[i]!= nums[i-1])) {
			
			int sum = 0 - nums[i];
			int low = i + 1;
			int high = nums.length - 1;

			while (low < high) {

				if (sum == nums[low] + nums[high]) {
					list.add(Arrays.asList(nums[i], nums[low], nums[high]));

					while ((low < high) && nums[low] == nums[low + 1]) {
						low++;
					}

					while ((low < high) && nums[high] == nums[high - 1]) {
						high--;
					}

					low++;
					high--;
				} else if (sum > nums[low] + nums[high]) {
					low++;
				} else {
					high--;
				}
			}
			}
		}

		return list;
	}

	public static void main(String[] args) {
		int[] arr = { -1, 0, 1, 2, -1, -4 };
		ThreeSum three = new ThreeSum();
		List<List<Integer>> list = three.threeSum(arr);
		for (List<Integer> list2 : list) {
			System.out.println(list2);
		}
	}
}
