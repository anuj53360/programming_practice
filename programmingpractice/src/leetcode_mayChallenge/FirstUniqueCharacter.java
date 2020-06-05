package leetcode_mayChallenge;

import java.util.LinkedList;

public class FirstUniqueCharacter {

public static int firstUniqChar(String s) {
	int []address=new int[26];
	for (int i = 0; i < address.length; i++) {
		address[i]=0;
	}
	
	
	
	for (int i = 0; i < s.length(); i++) {
		int x=address[s.charAt(i)-'a'];
		address[s.charAt(i)-'a']=x+1;
	}
//	for (char c : s.toCharArray()) {
//		int x=address[c-'a'];
//		address[c-'a']=x+1;
//	}
	
	for (int i = 0; i < address.length; i++) {
		System.out.println(address[i]);
	}
	
	for (int i = 0; i < s.length(); i++) {
		if(address[s.charAt(i)-'a']==1) {
			return i;
		}
	}
	return -1;
//    LinkedList<Character> ll=new LinkedList<>();
//    int []address=new int[26];
//    boolean []checkcharlinked=new boolean[26];
//    
//    for (int i = 0; i < checkcharlinked.length; i++) {
//		checkcharlinked[i]=false;
//	}
//    
//    for (int i = 0; i < address.length; i++) {
//		address[i]=0;
//	}
//	
//	  for (int i = 0; i < s.length(); i++) {
//		if(address[s.charAt(i)-'a']==0 && checkcharlinked[s.charAt(i)]==false) {
//		  ll.add(s.charAt(i));
//		  ll.hashCode();
//		  address[s.charAt(i)-'a']=ll.hashCode();
//		}else {
//			ll.remove(s.charAt(i));
//			checkcharlinked[s.charAt(i)]=true;
//		}
//	}
//	  
//	  System.out.println(ll.getFirst());
//	return 0;
    }
	
	public static void main(String[] args) {
		String s="loveleetcode";
		int x=firstUniqChar(s);
	System.out.println(x);
	}
}
