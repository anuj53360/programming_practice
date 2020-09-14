package anuj_array_geeksforgeeks;

import java.util.Arrays;
import java.util.Collections;

public class ThreeSumClosest {

	public static int threeSumClosest(int[] nums, int target) {

		
		
		Arrays.sort(nums);
		int closestSum = Integer.MAX_VALUE;

		for (int i = 0; i < nums.length; i++) {
			int j = i + 1;
			int last = nums.length - 1;

			while (j < last) {
            int sum=nums[i]+nums[j]+nums[last];
            if(Math.abs(target-sum)< Math.abs(target-closestSum)) {
            	closestSum=sum;
            }
            
            
            if(sum>target) {
            	last--;
            }else {
            	j++;
            }
			}
		}

		return closestSum;
	}

	public static void main(String[] args) {

		int[] nums = { -1, 2, 1, -4 };
		int target = 1;
		threeSumClosest(nums, target);
	}
}
