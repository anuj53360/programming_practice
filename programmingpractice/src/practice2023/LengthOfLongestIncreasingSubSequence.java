package programmingpractice.src.practice2023;

public class LengthOfLongestIncreasingSubSequence {

    /**
     *  Iterate in nums array and do binary search in temp array and
     *  make put elemet in temp array in longest increasing order.
     */


    public int lengthOfLIS(int[] nums) {
int k=0;
        int []temp = new int[nums.length];
        temp[k] = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i] < temp[k]){
                int lb = 0;
                int ub = k;
                while (lb <= ub){
                    int mid = (lb+ub)/2;
                    if(temp[mid] < nums[i]){
                        lb = mid+1;
                    }else {
                        ub = mid-1;
                    }
                }
                temp[lb] = nums[i];

            }else if (temp[k] != nums[i]){
                k++;
                temp[k] = nums[i];
            }
        }

        return k+1;
    }

    public static void main(String[] args) {
LengthOfLongestIncreasingSubSequence ls = new LengthOfLongestIncreasingSubSequence();
      int []nums = {10,9,2,5,3,7,101,18};
System.out.println(ls.lengthOfLIS(nums));
    }
}
