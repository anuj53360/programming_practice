package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class GroupAnagram {

	
public static List<List<String>> groupAnagrams(String[] strs) {
	
	HashMap<String, List<String>> map=new HashMap<>();
	
	for (int i = 0; i < strs.length; i++) {
		String s=strs[i];
		
	    char []ch=s.toCharArray();
	    Arrays.sort(ch);
	    String key=String.valueOf(ch);
	   
	    
	    if(!map.containsKey(key)) {
	    	map.put(key, new ArrayList<>());
	    	map.get(key).add(s);
	    }else {
	    	map.get(key).add(s);
	    }
	
	}
	List<List<String>> list=new ArrayList<>();
	
	for (Entry<String, List<String>> entry : map.entrySet()) {
	list.add(entry.getValue());
	}
	
	return list;
    }
	
	public static void main(String[] args) {
		String []strs= {"eat", "tea", "tan", "ate", "nat", "bat"};
		groupAnagrams(strs);	
	}
}
