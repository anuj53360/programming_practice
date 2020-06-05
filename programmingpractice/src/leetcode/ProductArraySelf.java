package leetcode;

public class ProductArraySelf {

public static int[] productExceptSelf(int[] nums) {
	
	
	int []leftprduct=new int[nums.length];
	int []rightprduct=new int[nums.length];
	
	leftprduct[0]=1;
	for (int i = 1; i < nums.length; i++) {
		leftprduct[i]=leftprduct[i-1]*nums[i-1];
	}
	rightprduct[nums.length-1]=1;
    for (int i = rightprduct.length-2; i >= 0; i--) {
		rightprduct[i]=rightprduct[i+1]*nums[i+1];
	}
    for (int i = 0; i < nums.length; i++) {
		nums[i]=leftprduct[i]*rightprduct[i];
	}
	return nums;
    }
	
	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		productExceptSelf(nums);
	}
}
