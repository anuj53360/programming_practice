package leetcode_mayChallenge;

import java.util.HashMap;
import java.util.Map.Entry;

public class MajorityElement {

	public static int majorityElement(int[] nums) {
        int highvalue=0;
        int key=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
       
        
        for (Entry<Integer, Integer> entry: map.entrySet()) {
        	 if(entry.getValue()>highvalue){
                 highvalue=entry.getValue();
              key=entry.getKey();
        	 }
		}
    
       return key; 
    }
	
	public static void main(String[] args) {
		int[] nums= {2,2,1,1,1,2,2};
		majorityElement(nums);
	}
}
