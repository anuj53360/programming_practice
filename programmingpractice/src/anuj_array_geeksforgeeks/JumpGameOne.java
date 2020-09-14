package anuj_array_geeksforgeeks;

public class JumpGameOne {

	public static boolean canJump(int[] nums) {
		
		int result=0;
		
		for (int i = 0; i <= result ; i++) {
			if(i == nums.length-1) {
				return true;
			}
			result=Math.max(result, i+nums[i]);
		}
		
		
		return false;
	}
	
	public static void main(String[] args) {
	int []nums= {2,3,1,1,4};
	canJump(nums);
		
	}
}
