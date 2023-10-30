package programmingpractice.src.practice2023.dp;


import java.util.ArrayList;

public class HouseRobberTwoLeetCode {

    public int rob(int[] nums) {

        int n = nums.length;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        if(n == 1){
            return  nums[0];
        }
        for(int i=0 ; i<n;i++){
            if(i!= 0){
                list1.add(nums[i]);
            }
            if(i != n-1){
                list2.add(nums[i]);
            }
        }
        int ans1 = robUtil(list1);
        int ans2 = robUtil(list2) ;
        return  Math.max(ans1 , ans2);

    }

    private int robUtil(ArrayList<Integer> list) {
        int n = list.size();
        int []dp = new int[n];

//   int prev1 = list.get(0);
//   int prev2 = 0;
        dp[0] = list.get(0);

   for(int i=1 ; i< n;i++){
       int pick = list.get(i);
       if(i>1){
           pick += dp[i-2];
       }
       int nonPick = 0 + dp[i-1];

       int max = Math.max(pick , nonPick);

   }

   return  dp[n-1];
    }

    public static void main(String[] args) {
        HouseRobberTwoLeetCode hr = new HouseRobberTwoLeetCode();
        int []nums = {1,2,3,1};
        System.out.println(hr.rob(nums));
    }
}
