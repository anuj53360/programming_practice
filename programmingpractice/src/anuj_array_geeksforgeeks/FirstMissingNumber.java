package anuj_array_geeksforgeeks;

import java.util.Arrays;

public class FirstMissingNumber {

	public static int firstMissingPositive(int[] nums) {
          
//		Arrays.sort(nums);
		int n=nums.length;
		int i;
		boolean []temp=new boolean[n+1];
		
		
		for (i = 0; i < nums.length; i++) {
			if(nums[i]>=0 && nums[i]<n) {
				temp[nums[i]]=true;
			}
		}
		
		for ( i = 1; i < n; i++) {
			if(!temp[i]) {
				break;
			}
		}
		
		
		return i;
		
	}

	public static void main(String[] args) {
     
		int []nums= {1,2,0};
		System.out.println(firstMissingPositive(nums));
		
		
	}
}
