package leetcode;

public class RotateArray {

	public static void rotate(int[] nums, int k) {//5671234
		for(int i=0;i<k;i++) {
			rotatearrayutil(nums);
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	
	public static void rotatearrayutil(int []nums){
         int x=nums[nums.length-1];	
         for (int i = nums.length-1; i>0; i--) {
        	 nums[i]=nums[i-1];
		}
         nums[0]=x;
	}
	
	
	public static void main(String[] args) {
		int []nums= {1,2,3,4,5,6,7};
		int k=3;
		rotate(nums,k);
	}
}
