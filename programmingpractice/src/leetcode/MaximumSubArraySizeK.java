package leetcode;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumSubArraySizeK {

	public void maximumSubArraySizeK(int[] array, int k) {

		int start = 0;
		int end = k - 1;
		int i = start;
		int max = array[k - 1];

		while (end <= array.length - 1) {
			if (array[start] > max) {
				max = array[start];
			}
			start++;

			if (start == end && start != array.length - 1) {
				System.out.println(max);
				end++;
				start = ++i;

				if (end < array.length - 1) {
					max = array[end];
				}
			}
		}
	}
	
	public void maxOfSizeKSubArray(int []array,int k) {
		
	//	PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		
//		for (int i = 0; i < array.length; i++) {
//			pq.add(array[i]);
//			if(pq.size()==k) {
//				System.out.println(pq.peek());
//				
//			}
//		}
		
		
		// int[] ans = new int[nums.length - k + 1];
	        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) ->{
	            return Integer.compare(array[b], array[a]);
	        });
	        for(int i = 0; i < k - 1; i++) pq.add(i);
	        
	        System.out.println(pq.peek()+"QQQQQQQQQQQQQQ");
	        for(int i = k - 1; i < array.length; i++){
	            pq.add(i);
	            while(pq.peek() < i - k + 1) pq.poll();
	            int index = pq.peek();
//	            ans[i - k + 1] = nums[index];
	            System.out.println(array[index]+"AAAAAAAAAAAAAAAAA");
	        }
	//        return ans;
		
	}
	
	

	public static void main(String[] args) {

		MaximumSubArraySizeK max = new MaximumSubArraySizeK();
		int[] array = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
	//	max.maximumSubArraySizeK(array, 3);
		max.maxOfSizeKSubArray(array,3);
	}
}
