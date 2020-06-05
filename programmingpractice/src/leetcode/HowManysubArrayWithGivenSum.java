package leetcode;

import java.util.HashMap;
import java.util.Map;

public class HowManysubArrayWithGivenSum {
            
	public static int subArrayWithGivenSum(int []arr,int k){
		Map<Integer,Integer> map=new HashMap<>();
		int prefixsum=0;
		int count=0;
		for (int i = 0; i <arr.length; i++) {
			prefixsum+=arr[i];
			if(prefixsum==k) {
				count++;
			}
			if(!map.containsKey(prefixsum-k)) {
				map.put(prefixsum, 1);
				
			}else {
				count++;
				map.put(prefixsum, map.get(prefixsum+1));
			}
		}
		return count;	
	}
	
	
	public static void main(String[] args) {
		int []arr= {3,4,7,2,-3,1,4,2};
		int k=7;
		int count=subArrayWithGivenSum(arr,k);
	    System.out.println(count);
	}
}
