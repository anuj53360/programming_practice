package leetcode_mayChallenge;

import java.util.ArrayList;
import java.util.List;

public class AllAnagramInString {

	
public static List<Integer> findAnagrams(String s, String p) {

     List<Integer> result=new ArrayList<>();    	
	int slength=s.length();
	int plength=p.length();
	int []pchar=new int[26];
	int []schar=new int[26];
	if(slength<plength) {
		return result;
	}
	int left=0;
	int right=0;
	while(right<plength) {
		pchar[p.charAt(right)-'a']+=1;
		schar[s.charAt(right++)-'a']+=1;
	}
	right-=1;
	while(right<slength) {
		if(pchar==schar) {
			
		}
	}
	
	
	
	
	
//	for (char i : p.toCharArray()) {
//		pchar[i-'a']+=1;
//	}
//	int start=0;
//	for (int i = 0; i < p.length(); i++) {
//		pchar[s.charAt(i)-'a']-=1;
//	}
//	int mismatchcount=0;
//	for (int i : pchar) {
//		if(i!=0) 
//			mismatchcount+=1; 
//	}
//	if(mismatchcount==0) {
//		result.add(start);
//		start++;
//	}
//	while(start<=s.length()-p.length()) {
//    int idx1=s.charAt(start-1)-'a';
//    int idx2=s.charAt(start+p.length()-1)-'a';
//    pchar[idx1]+=1;
//    if(pchar[idx1]==1) {
//    	mismatchcount+=1;
//    }else if(pchar[idx1]==0) {
//    	mismatchcount-=1;
//    }
//    pchar[idx2]-=1;
//    if(pchar[idx2]==-1)
//    	mismatchcount+=1;
//    else if(pchar[idx2]==0) {
//    	mismatchcount-=1;
//    }
//    
//    if(mismatchcount==0) {
//    	result.add(start);
//    	start++;
//    }
//	}
	return result;
	
	
	
	
    }
	
	public static void main(String[] args) {
		String s="cbaebabacd";
		String p="abc";
		findAnagrams(s,p);
	}
}
