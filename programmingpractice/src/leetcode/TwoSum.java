//package leetcode;
//
//import java.util.HashMap;
//
//public class TwoSum {
//
//
//public  static int[] twoSum(int[] nums, int target) {
//
//	int []array=new int[2];
//	HashMap<Integer, Integer> map=new HashMap<>();
//	for (int i = 0; i < nums.length; i++) {
//		int diff=target-nums[i];
//		if(map.containsKey(diff)) {
//			array[0]=map.get(diff);
//			array[1]=i;
//		}
//		map.put(nums[i], i);
//	}
//
//
//
//
////
//
//
////	  for (int k = 0; k < array.length; k++) {
////		System.out.println(array[k]);
//	}
//
//	return array;
//    }
//
//	public static void main(String[] args) {
////		int[] nums= {2,7,11,15};
//		int[] nums= {3,2,4};
//		int target=6;
//		twoSum(nums,target);
//	}
//}
