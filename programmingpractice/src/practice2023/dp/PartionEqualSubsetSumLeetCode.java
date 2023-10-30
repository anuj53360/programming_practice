package programmingpractice.src.practice2023.dp;

public class PartionEqualSubsetSumLeetCode {

    public boolean canPartition(int[] nums) {

        int sum =0;
        for (int i : nums){
            sum += i;
        }
        if (sum%2 != 0){
            return false;
        }
        return  subSetSum(nums , 0 , 0 , sum/2);
    }

    private boolean subSetSum(int[] nums, int index, int sumSoFar, int target) {

    if(sumSoFar == target){
        return true;
    }
    if (index == nums.length || sumSoFar > target){
        return false;
    }
    return subSetSum(nums , index+1 , sumSoFar+nums[index] , target) ||
            subSetSum(nums , index+1 , sumSoFar , target);

    }

    public boolean canPartitionDP(int[] nums) {

        int sum =0;
        for (int i : nums){
            sum += i;
        }
        if (sum%2 != 0){
            return false;
        }

        sum /= 2;

        boolean [][]dp = new boolean[nums.length+1][sum+1];

        for (int i=0;i<dp.length;i++){
            for (int j=0;j<dp[0].length;j++){
                if (i ==0 && j==0){
                    dp[i][j] = true;
                }
                else if (i == 0){
                    dp[i][j] = false;
                }
                else if (j ==0 || dp[i-1][j]){
                    dp[i][j] = true;
                }
                else if(j >= nums[i-1]){
                    dp[i][j] = dp[i-1][j-nums[i-1]];
                }
            }
        }
        return  dp[nums.length][sum];
    }



    public static void main(String[] args) {
      int []nums = {1,2,3,5};
      PartionEqualSubsetSumLeetCode pe = new PartionEqualSubsetSumLeetCode();
      pe.canPartition(nums);
    }
}
