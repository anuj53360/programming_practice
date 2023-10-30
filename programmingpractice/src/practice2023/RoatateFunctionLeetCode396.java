package programmingpractice.src.practice2023;

import java.util.Map;

public class RoatateFunctionLeetCode396 {


    public int maxRotateFunction(int[] nums) {
if(nums == null || nums.length == 0){
    return 0;
}

int sum =0;
int fo = 0;
int max = Integer.MIN_VALUE;

for(int i=0;i<nums.length ; i++){
    sum += nums[i];
    fo += i + nums[i];
}

int []dp = new int[nums.length];
dp[0] = fo;
max = dp[0];
for(int i=1 ;i<nums.length ;i++){
    dp[i]  = dp[i-1]+ sum -nums.length* nums[nums.length-1];
    max = Math.max(max , dp[i]);
}

return  max;
    }

    public static void main(String[] args) {
        RoatateFunctionLeetCode396 rf = new RoatateFunctionLeetCode396();
        int []nums = {4,3,2,6};
        rf.maxRotateFunction(nums);
    }
}
