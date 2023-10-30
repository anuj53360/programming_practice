package programmingpractice.src.practice2023;

public class SortArrayParityLeetCode995 {

    public int[] sortArrayByParity(int[] nums) {
        int even =0;
        int odd = 1;

        while (even < nums.length-2){
            if (nums[even] %2 ==0){
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd]  = temp;
                odd ++;
            }
            even ++;
        }


        for (int i : nums){
            System.out.println(i);
        }

     return  nums;
    }

    public static void main(String[] args) {
        SortArrayParityLeetCode995 sa = new SortArrayParityLeetCode995();
        int []nums = {4,2,5,7};
        sa.sortArrayByParity(nums);
    }
}
