package programmingpractice.src.practice2023;

public class SortArrayParityIILeetCode922 {

    public int[] sortArrayByParityII(int[] nums) {

        int even =0;
        int odd =1;

        while (even < nums.length && odd < nums.length){
            if(nums[even] %2 ==0){
                even += 2;
            }else if (nums[odd] %2 !=0){
                odd += 2;
            }else {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
                even++;
                odd--;
            }
        }
return nums;
    }

    public static void main(String[] args) {
     SortArrayParityIILeetCode922 sa = new SortArrayParityIILeetCode922();
        int []nums = {4,2,5,7};
        sa.sortArrayByParityII(nums);

    }
}
