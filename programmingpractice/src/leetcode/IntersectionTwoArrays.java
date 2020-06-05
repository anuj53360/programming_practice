package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class IntersectionTwoArrays {

public static int[] intersect(int[] nums1, int[] nums2) {

	HashMap<Integer, Integer> map1=new HashMap<>();
	List<Integer> list=new ArrayList<>();
	
	for (int i = 0; i < nums1.length; i++) {
		if(!map1.containsKey(nums1[i])) { 
		map1.put(nums1[i], 1);
		}else {
			map1.put(nums1[i], map1.get(nums1[i])+1);
		}
	}
	
	
	for (int i = 0; i < nums2.length; i++) {
    int count=map1.getOrDefault(nums2[i], 0);
    if(count>0) {
    	list.add(nums2[i]);
    	map1.put(nums2[i], count-1);
    }
	}
	int []array=new int[nums1.length];
	
for (int i = 0; i < list.size(); i++) {
	array[i]=list.get(i);
}
	
	

	
	
	
	
	return array;
    }
	
	public static void main(String[] args) {
//		int []nums1= {1,2,2,1};
//		int []nums2= {2,2};
		int []nums1= {4,9,5};
		int []nums2= {9,4,9,8,4};
		intersect(nums1,nums2);
	}
	
}
