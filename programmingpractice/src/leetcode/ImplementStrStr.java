package leetcode;

import java.util.HashMap;
import java.util.Map.Entry;

public class ImplementStrStr {

public static int strStr(String haystack, String needle) {
	
	if(haystack==null || needle==null) {
		return -1;
	}
	
	if(needle.length()>haystack.length()) {
		return -1;
	}
	
	for (int i = 0; i < haystack.length()-needle.length()+1; i++) {
	int j;
	for (j = 0;  j< needle.length(); j++) {
		
		if(haystack.charAt(i+j)!=needle.charAt(j)) {
			break;
		}
	}
		if(j==needle.length()) {
			return i;
		}

	}
	return -1;
	
}
	
	
	public static void main(String[] args) {
		String haystack="hello";
		String needle="ll";
		int x=strStr(haystack,needle);
	   System.out.println(x);
	}
}
