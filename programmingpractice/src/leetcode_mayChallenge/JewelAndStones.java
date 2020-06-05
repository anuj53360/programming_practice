package leetcode_mayChallenge;

import java.util.HashSet;

public class JewelAndStones {

public static int numJewelsInStones(String J, String S) {
        
	HashSet<Character> hs=new HashSet<>();
	for (int i = 0; i < J.length(); i++) {
		hs.add(J.charAt(i));
	}
	int count =0;
	for (int i = 0; i < S.length(); i++) {
		if(hs.contains(S.charAt(i))) {
			count++;
		}
	}
	return count;
    }
	
	public static void main(String[] args) {
		String J="aA";
		String S="aAAbbbb";
		numJewelsInStones(J,S);
	}
}
