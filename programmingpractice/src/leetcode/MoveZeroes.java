package leetcode;



public class MoveZeroes {

public static void moveZeroes(int[] nums) {
        
	int first=0;
	int second=0;
for (first = 0; first <nums.length; first++) {
		
	if(nums[first]!=0 && nums[second]==0) {
		int temp=nums[first];
		nums[first]=nums[second];
		nums[second]=temp;
		
	}
	if(nums[second]!=0) {
		second++;
	}
	
    }
	
	for (int i = 0; i < nums.length; i++) {
		System.out.println(nums[i]);
	}
	
}



	public static void main(String[] args) {
		int []nums= {0,1,0,3,12};
		moveZeroes(nums);
	}
}
