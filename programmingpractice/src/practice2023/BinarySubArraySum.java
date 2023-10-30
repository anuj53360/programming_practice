package programmingpractice.src.practice2023;

import java.util.HashMap;
import java.util.Map;

public class BinarySubArraySum {

    /**
     * We will use Map
     * first in map we put (0,0). Then we chack if map contains
     * prefixSum-goal then increment ans.
     *
     */

    public int numSubarraysWithSum(int[] nums, int goal) {

       int ans =0;
       int prefSum =0;

        Map<Integer , Integer> map = new HashMap<>();
        for (int i=0;i< nums.length;i++){
            map.put(prefSum , map.getOrDefault(prefSum ,0)+1);

            prefSum += nums[i];
            if (map.containsKey(prefSum-goal)){
                ans += map.get(prefSum-goal);
            }

        }
        return  ans;
    }

    public static void main(String[] args) {
        BinarySubArraySum bs = new BinarySubArraySum();
       int[] nums = {1,0,1,0,1};
       int goal = 2;
       System.out.println(bs.numSubarraysWithSum(nums , goal));
    }
}
