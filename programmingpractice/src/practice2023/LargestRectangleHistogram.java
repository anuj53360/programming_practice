package programmingpractice.src.practice2023;

import java.util.Stack;

public class LargestRectangleHistogram {

    public int largestRectangleArea(int[] heights) {

        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int []left = new int[n];
        int []right = new int[n];

        for (int i=0;i<n;i++){
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
                left[i] = 0;
            }else {
                left[i] = stack.peek()+1;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()){
            stack.pop();
        }

        for (int i= n-1;i>=0;i--){

            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }

            if (stack.isEmpty()){
                right[i] = n-1;
            }else {
                right[i] = stack.peek()-1;
            }
            stack.push(i);
        }

        int maxA =0;
        for (int i=0;i<n;i++){
            maxA = Math.max(maxA , heights[i] *(right[i] - left[i]+1));
        }
     return maxA;
    }

    public static void main(String[] args) {
        LargestRectangleHistogram lr = new LargestRectangleHistogram();
         int []heights = {2,1,5,6,2,3};
         lr.largestRectangleArea(heights);

    }
}
