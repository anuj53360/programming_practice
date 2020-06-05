package stack;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingCharacter {

	final static int MAX_CHAR=26;
	
	public static void firstNonRepeatingCharacter(String string) {
		int []charcterarray=new int[MAX_CHAR];
		
		Queue<Character> queue=new LinkedList<Character>();
		
		
		for (int i = 0; i < string.length(); i++) {
		char c=string.charAt(i);
		queue.add(c);
        charcterarray[c-'a']++;
		while (!queue.isEmpty()) {
			if(charcterarray[queue.peek()-'a']>1) {
				queue.remove();
			}else {
				System.out.println(queue.peek());
			break;
			}
			
		}
		
		}
		
		
	}
	
	public static void main(String[] args) {
		String string="aabc";
		firstNonRepeatingCharacter(string);
	}
}
