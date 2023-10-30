package programmingpractice.src.practice2023;

import java.util.Arrays;

public class MinimizeMaximumPairSum {

    public int minPairSum(int[] nums) {

        int max = 0;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length;
        while (left<right){
            int sum = nums[left]+nums[right];
            left++;
            right--;
            max = Math.max(max , sum);
        }


        return max;

    }

    public static void main(String[] args) {

    }
}
