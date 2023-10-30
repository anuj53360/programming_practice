package programmingpractice.src.practice2023;

import java.util.Stack;

public class SumSubArrayRanges {

    public long subArrayRanges(int[] nums) {

        Stack<Node> stack = new Stack<>();
        long []lesserLeft = new long[nums.length];
        for (int i=0;i< nums.length;i++){
            long count =1;
            while (stack.size()>0 && stack.peek().val <= nums[i]){
                count += stack.pop().dist;
            }
            stack.add(new Node(nums[i] , count));
            lesserLeft[i] = count;
        }
        stack.clear();


        long []lesserRight = new long[nums.length];
        for (int i=nums.length-1;i>=0;i--){
            long count =1;
            while (stack.size()>0 && stack.peek().val < nums[i]){
                count += stack.pop().dist;
            }
            stack.add(new Node(nums[i] , count));
            lesserRight[i] = count;
        }

        stack.clear();

        long []maxLeft = new long[nums.length];
        for (int i=0;i< nums.length;i++){
            long count =1;
            while (stack.size()>0 && stack.peek().val >= nums[i]){
                count += stack.pop().dist;
            }
            stack.add(new Node(nums[i] , count));
            maxLeft[i] = count;
        }
        stack.clear();


        long []maxRight = new long[nums.length];
        for (int i=nums.length-1;i>=0;i--){
            long count =1;
            while (stack.size()>0 && stack.peek().val > nums[i]){
                count += stack.pop().dist;
            }
            stack.add(new Node(nums[i] , count));
            maxRight[i] = count;
        }

        stack.clear();

        long ans =0;
        for (int i=0;i<nums.length;i++){
            ans += ((lesserLeft[i] * lesserRight[i]) - (maxLeft[i] * maxRight[i])) * nums[i];
        }
        return  ans;
    }


    public static void main(String[] args) {

    }
}

class Node{
    long val;
    long dist;
    Node(long val , long dist){
        this.val = val;
        this.dist = dist;
    }
}
