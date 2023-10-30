package programmingpractice.src.practice2023;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithKDifferentIntegerLeetCode {
    public int subarraysWithKDistinct(int[] nums, int k) {
       return subarraysWithKDistinctUtil(nums , k) - subarraysWithKDistinctUtil(nums , k-1);
    }

    public int subarraysWithKDistinctUtil(int[] nums, int k) {
         int left =0;
         int right =0;
         int count =0;
        Map<Integer , Integer> map = new HashMap<>();
        while (right < nums.length){
            if(!map.containsKey(nums[right])){
                map.put(nums[right] , 1);
            }else {
                map.put(nums[right] , map.get(nums[right])+1);
            }
            if(map.size() <= k){
                count += (right-left+1);
            }else{
                while (left < nums.length && left <= right && map.size() > k){
                    map.put(nums[left] , map.get(nums[left])-1);
                    if(map.get(nums[left]) == 0){
                        map.remove(nums[left]);
                    }
                    left++;
                }
                count += right-left+1;
            }

      right++;
        }




        return count;
    }

    public static void main(String[] args) {
        SubArrayWithKDifferentIntegerLeetCode sd = new SubArrayWithKDifferentIntegerLeetCode();
        int []nums = {1,2,1,3,4};
        int k = 3;
      System.out.println(sd.subarraysWithKDistinct(nums , k));
    }
}
