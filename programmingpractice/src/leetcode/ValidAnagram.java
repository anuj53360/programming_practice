package leetcode;

import java.util.HashMap;
import java.util.Map.Entry;



public class ValidAnagram {

	
public static boolean isAnagram(String s, String t) {

	
	
//	boolean flag=true;
//	HashMap<Character, Integer> map=new HashMap<>();
//	for (int i = 0; i < s.length(); i++) {
//		if(!map.containsKey(s.charAt(i))) {
//			map.put(s.charAt(i), 1);
//		}
//		else {
//			map.put(s.charAt(i), map.get(s.charAt(i))+1);
//		}
//	}
//	for (int i = 0; i < t.length(); i++) {
//		if(map.containsKey(t.charAt(i))) {
//			map.put(t.charAt(i), map.get(t.charAt(i))-1);
//		}else {
//			return false;
//		}
//	}
//	for (Entry<Character, Integer> entry : map.entrySet()) {
//	  if(entry.getValue()==0) {
//		  flag=true;
//	  }else {
//		  flag=false;
//	  }
//	}
//	
//	if(flag) {
//		return true;
//	}else {
//		return false;
//	}
	
	if(s.length()!=t.length()) {
		return false;
	}
	
	char []chararray=new char[26];	
    for (int i = 0; i < s.length(); i++) {
		  chararray[s.charAt(i)-'a']++;
	}    

    
    for (int i = 0; i < t.length(); i++) {
		chararray[t.charAt(i)-'a']--;
		if(chararray[t.charAt(i)-'a']<0) {
			return false;
		}
	}
    return true;

}
	
	public static void main(String[] args) {
		String s="anagram";
		String t="nagaram";
		isAnagram(s,t);
	}
}
