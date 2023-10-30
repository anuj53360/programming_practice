package programmingpractice.src.practice2023;

public class CombinationSumFourLeetCode {
int count = 0;

    public int combinationSum4(int[] nums, int target) {
       //return combinationSum4Util(nums , target);
        return combinationSum4UtilMemoization(nums , target , new Integer[target+1]);

    }

    private int combinationSum4Util(int[] nums, int target) {
        if(target == 0){
            return  1;
        }
        if (target <0){
            return 0;
        }
        int count =0;
        for (int i=0; i<nums.length;i++){
          count +=  combinationSum4Util(nums , target-nums[i]);
        }

        return count;
    }


    private int combinationSum4UtilMemoization(int[] nums, int target, Integer[] dp) {
        if(target == 0){
            return  1;
        }
        if (target <0){
            return 0;
        }
        if(dp[target] !=null){
            return dp[target];
        }

        int count =0;
        for (int i=0; i<nums.length;i++){
            count +=  combinationSum4Util(nums , target-nums[i]);
        }

        return dp[target] = count;
    }

    private int combinationSum4Tabulation(int[] nums, int target) {
       int []dp = new int[target+1];
       dp[0] = 1;

       for (int i=1;i<= target ;i++){
           for (int j =0;j<nums.length;j++){
               if(i-nums[j]>0){
                   dp[i] += dp[i-nums[j]];
               }
           }
       }
        return dp[target];
    }



    public static void main(String[] args) {
CombinationSumFourLeetCode cs = new CombinationSumFourLeetCode();
     int []nums = {1,2,3};
     int target = 4;
     cs.combinationSum4(nums , target);
    }
}
