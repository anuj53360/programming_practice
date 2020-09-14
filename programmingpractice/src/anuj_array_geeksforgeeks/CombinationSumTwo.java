package anuj_array_geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumTwo {

	List<List<Integer>> result;
	List<Integer> current;

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {

		result = new ArrayList<>();
		current = new ArrayList<>();
		Arrays.sort(candidates);
		combinationSum2Util(candidates, target, 0, current);

		return result;

	}

	private void combinationSum2Util(int[] candidates, int target, int i, List<Integer> current) {

		if(target==0) {
			List<Integer> temp=new ArrayList<>(current);
			if(!result.contains(temp)) {
				result.add(temp);
			}
			return;
		}
		
		if(i==candidates.length || target<0) {
			return;
		}
		
		current.add(candidates[i]);
		combinationSum2Util(candidates, target-candidates[i], i+1, current);
		current.remove(current.size()-1);
		combinationSum2Util(candidates, target, i+1, current);
		
	}

	public static void main(String[] args) {
		int[] nums = { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;
		combinationSum2(nums, target);
	}
}
