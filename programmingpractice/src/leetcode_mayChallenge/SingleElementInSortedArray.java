package leetcode_mayChallenge;

public class SingleElementInSortedArray {

public static int singleNonDuplicate(int[] nums) {

	int start=0;
	int end=nums.length-1;
	
	while(start<end) {
		int mid=start+(end-start)/2;	
	if(mid%2==0) {
		if(nums[mid]==nums[mid-1]) {
             end=mid-2; 			
		}else if(nums[mid]==nums[mid+1]) {
			start=mid+2;
		}else {
			return nums[mid];
		}
	}else {
		if(nums[mid]==nums[mid-1]) {
			start=mid+1;
		}else {
			end=mid-1;
		}
	}	
		
	}
	return nums[start];
}


	
	
	public static void main(String[] args) {
		int[] nums= {1,1,2,3,3,4,4,8,8};
		int x=singleNonDuplicate(nums);
	   // System.out.println(x);
	}
}
