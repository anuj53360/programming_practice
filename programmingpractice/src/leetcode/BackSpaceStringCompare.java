package leetcode;

import java.util.Stack;

public class BackSpaceStringCompare {

public static boolean backspaceCompare(String S, String T) {

	Stack<Character> sstack=new Stack<>();
	Stack<Character> tstack=new Stack<>();
	
	for (int i = 0; i < S.length(); i++) {
		if(S.charAt(i)!='#') {
		sstack.push(S.charAt(i));
		}else if(!sstack.isEmpty()){
			sstack.pop();
		}
	}
	
	for (int i = 0; i < T.length(); i++) {
		if(T.charAt(i)!='#') {
		tstack.push(T.charAt(i));
		}else if(!tstack.isEmpty()){
			tstack.pop();
		}
	}
	
	while(!sstack.isEmpty()) {
		char c=sstack.pop();
		if(tstack.isEmpty() || tstack.pop()==c || tstack.size()!=sstack.size()) {
			return false;
		}
	}
	return true;
    }
	
	public static void main(String[] args) {
		String S="ab#c"; 
		String T="ad#c";
		backspaceCompare(S,T);
	}
}
