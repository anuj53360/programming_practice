package programmingpractice.src.practice2023;

import java.util.Arrays;

public class WiggleSortLeetCode {

    public void wiggleSort(int[] nums) {

        Arrays.sort(nums);

        int  right = nums.length-1;
        int mid = (nums.length-1)/2;

        int []result = new int[right+1];
        int counter =0;
        while (mid >=0 || right > (nums.length-1)/2){
            if (counter %2 ==0){
                result[counter] = nums[mid];
                mid--;
            }else {
                result[counter] = nums[right];
                right--;
            }
            counter++;
        }

        for (int i=0;i< nums.length;i++){
            nums[i] = result[i];
        }

        Arrays.stream(nums).forEach(System.out::println);

    }



    public static void main(String[] args) {
       int []nums = {1,3,2,2,3,1};
       WiggleSortLeetCode ws = new WiggleSortLeetCode();
       ws.wiggleSort(nums);
    }
}
