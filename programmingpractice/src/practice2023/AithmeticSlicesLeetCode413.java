package programmingpractice.src.practice2023;

public class AithmeticSlicesLeetCode413 {

    public int numberOfArithmeticSlices(int[] nums) {

        int count =0;
        if (nums.length <3){
            return 0;
        }
        int pCount =0;
        for (int i=0;i<nums.length-2;i++){
            int a = nums[i];
            int b = nums[i+1];
            int c = nums[i+2];

            if(a ==b && b == c){
                pCount++;
                count += pCount;
            }else {
                pCount = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
       int []nums = {1,2,3,4};
       AithmeticSlicesLeetCode413 as = new AithmeticSlicesLeetCode413();
       as.numberOfArithmeticSlices(nums);
    }
}
