package programmingpractice.src.practice2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSequenceGivenSumLeetCode {
//    int count =0;
    public int numSubseq(int[] nums, int target) {
//        numSubseqUtil(nums , 0 , target , new ArrayList<Integer>());
//        return  count;
        int count =0;
        int left =0;
        int right = nums.length-1;
        Arrays.sort(nums);
        int mod = (int)1e9+7;
        int []power = new int[nums.length];
        power[0] = 1;
        for (int i=1;i<nums.length;i++){
            power[i] = (power[i-1]*2)%mod;
        }

        while (left <= right){
            if(nums[left] + nums[right] <= target){
                count = (count+power[right-left])%mod;
               left++;
            }else if (nums[left]+ nums[right] > target){
                right--;
            }
        }
        return  count;
    }

//    private void numSubseqUtil(int[] nums, int index, int target , List<Integer> list) {
//    if(index == nums.length){
//
//        if(list.size()>0 && list.get(0) + list.get(list.size()-1) <= target){
//            count++;
//        }
//    }else {
//        numSubseqUtil(nums, index+1, target, list);
//        list.add(nums[index]);
//        numSubseqUtil(nums, index+1, target , list);
//        list.remove(list.size()-1);
//    }
//
//    }

    public static void main(String[] args) {
       int [] nums = {3,5,6,7};
       int target = 9;
       SubSequenceGivenSumLeetCode sumLeetCode = new SubSequenceGivenSumLeetCode();
       System.out.println(sumLeetCode.numSubseq(nums , target));
    }
}
