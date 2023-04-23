package programmingpractice.src.anuj_array_geeksforgeeks;

import java.util.HashMap;
import java.util.Map.Entry;

public class DictionaryProblemHackerearth {

//	public static void dictionaryProblemHackerearth(int n,int k){
//		
//		char []chara=new char[26];
//		
////		for (int i = 0; i < chara.length; i++) {
////			chara[i]=
////		}
//		int charlength=26;
//		
//		if(n<=26) {
//			int diff=charlength-n;
//		}
//		
//		
//	}
	
	
public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i]))
            {
            map.put(nums[i],1);        
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        
        
        for(Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                return true;
            }
        }
        
     return false;   
    }
	
	public static void main(String[] args) {
		int n=3;
		int k=51;
		//dictionaryProblemHackerearth(n,k);
	}
}
