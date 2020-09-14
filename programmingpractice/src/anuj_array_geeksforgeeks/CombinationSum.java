package anuj_array_geeksforgeeks;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {

		List<List<Integer>> result=new ArrayList<>();
		
		if(candidates==null || candidates.length==0) {
			return result;
		}
		
		combinationSumUtil(candidates, target,0,new ArrayList<>(),result);
		
		return result;

	}

	private static void combinationSumUtil(int[] candidates, int target, int i, List<Integer> current,
			List<List<Integer>> result) {

		if(target==0) {
	     result.add(new ArrayList<Integer>(current));
		return;
		}
		
		else if(target<0) {
        	return;
        }
		
        
        for (int j = i; j < candidates.length; j++) {
			current.add(candidates[j]);
			combinationSumUtil(candidates, target-candidates[j], j, current, result);
			current.remove(current.size()-1);
		}
	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, 6, 7 };
		int target = 7;
		combinationSum(nums, target);
		
	}
}
