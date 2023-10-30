package programmingpractice.src.practice2023;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementOne {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int []result = new int[nums1.length];
        for (int i=0;i<nums1.length;i++){
            int greaterIndex = -1;
            int j = nums2.length-1;
            while (j >0 && nums1[i] != nums2[j]){
               if (nums2[j] > nums1[i]){
                   greaterIndex = nums2[j];
               }
               j--;
            }
       result[i] = greaterIndex;
        }

return  result;
    }


    public int[] nextGreaterElementStack(int[] nums1, int[] nums2) {

        int []result = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        Map<Integer , Integer> map = new HashMap<>();
        for (int i=0;i<nums2.length;i++){
           while (!stack.isEmpty() && nums2[i] > stack.peek()){
               map.put(stack.pop() , nums2[i]);
           }
           stack.push(nums2[i]);
        }

        int i =0;
        for (int num: nums1) {
            result[i++] = map.getOrDefault(num , -1);
        }

        return  result;
    }


    public static void main(String[] args) {
     NextGreaterElementOne ng = new NextGreaterElementOne();
        int []nums1 = {4,1,2};
        int []nums2 = {1,3,4,2};
        ng.nextGreaterElement(nums1 , nums2);
    }
}
