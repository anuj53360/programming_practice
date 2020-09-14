package anuj_array_geeksforgeeks;

public class SearchInsertPosition {

	public static int searchInsert(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			
			if(nums[i]==target) {
				return i;
			}
			
			if(nums[i]>target) {
				return i;
			}
			
		}
		return 0;
		
		
	}

	public static void main(String[] args) {
      int []nums= {1,3,5,6};
      int target=5;
      searchInsert(nums, target);
      
	}
}
