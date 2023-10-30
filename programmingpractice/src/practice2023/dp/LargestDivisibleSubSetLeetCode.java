package programmingpractice.src.practice2023.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubSetLeetCode {

    public List<Integer> largestDivisibleSubset(int[] nums) {

        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int []divCount = new int[nums.length];
        Arrays.fill(divCount , 1);

        int []prev = new int[nums.length];
        Arrays.fill(prev , -1);

        int max_index =0;
        for(int i=1;i<nums.length;i++){
            for (int j=0;j<i ;j++){
                if(nums[i] % nums[j] == 0 && divCount[i] < divCount[j]+1){
                    prev[i] = j;
                    divCount[i] = divCount[j]+1;
                }
            }
            if(divCount[i] > divCount[max_index]){
                max_index = i;
            }
        }

int k = max_index;
        while (k>0){
            list.add(nums[k]);
            k= prev[k];
        }

return  list;
    }


    public static void main(String[] args) {
       int []nums = {1,2,3};
       LargestDivisibleSubSetLeetCode ld = new LargestDivisibleSubSetLeetCode();
       ld.largestDivisibleSubset(nums);
    }
}
