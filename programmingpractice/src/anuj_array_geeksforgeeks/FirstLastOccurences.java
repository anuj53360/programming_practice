package anuj_array_geeksforgeeks;


public class FirstLastOccurences {

	public static int[] searchRange1(int[] nums, int target) {

		int[] newnums = new int[2];
		int first = 0;
		int last = nums.length - 1;

		int firstno = firstOccurence(nums, target, first, last);
		int secondno = lastOccurence(nums, target, first, last);
		newnums[0] = firstno;
		newnums[1] = secondno;

		for (int i = 0; i < newnums.length; i++) {
			System.out.println(newnums[i]);
		}

		return newnums;

	}

	private static int lastOccurence(int[] nums, int target, int first, int last) {

		if (last >= first) {
			int mid = first + (last - first) / 2;

			if (mid == nums.length - 1 || target < nums[mid + 1] && nums[mid] == target) {
				return mid;
			} else if (target < nums[mid]) {
				return lastOccurence(nums, target, first, mid - 1);
			} else {
				return lastOccurence(nums, target, mid + 1, last);
			}

		}
		return -1;
	}

	private static int firstOccurence(int[] nums, int target, int first, int last) {
		if (last >= first) {
			int mid = first + (last - first) / 2;

			if (mid == 0 || target > nums[mid - 1] && nums[mid] == target) {
				return mid;
			} else if (target > nums[mid]) {
				return lastOccurence(nums, target, mid + 1, last);
			} else {
				return lastOccurence(nums, target, first, mid - 1);
			}

		}
		return -1;
	}

	public static int[] searchRange(int[] nums, int target) {
		
		
		int mid=0;
		int left=0;
		int right=nums.length-1;
		
		if(nums.length==0) {
			return new int[] {-1,-1};
		}
		
		while(left<=right) {
			mid=left+(right-left)/2;
			
			if(nums[mid]==target) {
				break;
			}
			
			if(nums[mid]>target) {
				right=mid-1;
				
			} else {
				left=mid+1;
			}
			
		}
		
		if(nums[mid]!=target) {
			return new int[] {-1,-1};
		}
			
		int start=mid;
		int end=mid;
		
		for (int i = mid+1; i < nums.length; i++) {
			if(nums[i]==nums[mid]) {
				end=i;
			}else {
				break;
			}
		}
		
		for (int i = mid-1; i >= 0; i--) {
			
			if(nums[i]==nums[mid]) {
				start=i;
			}else {
				break;
			}
		}
		
		return new int[] {start,end};
		
	}
	
	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
		int target = 8;
		searchRange(nums, target);

	}
}
