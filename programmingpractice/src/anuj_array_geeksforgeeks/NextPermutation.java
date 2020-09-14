package anuj_array_geeksforgeeks;

import java.util.Arrays;

public class NextPermutation {

	public static void nextPermutation(int[] nums) {
        int n=nums.length;
		if(n==0) {
			return;
		}
		
		for (int i = nums.length-1; i >= 0; i--) {
			if(i==0) {
				Arrays.sort(nums);
				return;
			}else {
				
				if(nums[i-1]<nums[i]) {
					for(int j=nums.length-1;j>=i;j--) {
						if(nums[j]>nums[i-1]) {
							int temp=nums[j];
							nums[j]=nums[i-1];
							nums[i-1]=temp;
							break;
						}
					}
					
					Arrays.sort(nums,i,nums.length);
					return;
					
				}
			}
			
		}
    }
	
	public static void main(String[] args) {

		int []nums= {1,2,5,4,3};
		nextPermutation(nums);
		
		
	}
}
