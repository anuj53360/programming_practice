package programmingpractice.src.practice2023;

public class WiggleSubSequencesLeetCode {

    public int wiggleMaxLength(int[] nums) {

        if(nums.length == 0 || nums.length ==1){
            return  nums.length;
        }
        int k =0;
        if(k == nums.length){
            return 1;
        }
        while (k > nums.length && nums[k] == nums[k+1]){
            k++;
        }

        int result =2;
        boolean isSmall = nums[k] <  nums[k+1];
        for(int i = k+1; i< nums.length-1 ;i++){
            if(isSmall && nums[i+1] < nums[i]){
                nums[result] = nums[i+1];
                result++;
                isSmall = !isSmall;
            }else {
                if(!isSmall && nums[i+1] > nums[i]){
                    nums[result] = nums[i+1];
                    result++;
                    isSmall = !isSmall;
                }
            }

        }

       return  result;
    }

    public static void main(String[] args) {
       int []nums = {1,7,4,9,2,5};
       WiggleSubSequencesLeetCode ws = new WiggleSubSequencesLeetCode();
       ws.wiggleMaxLength(nums);
 }
}
