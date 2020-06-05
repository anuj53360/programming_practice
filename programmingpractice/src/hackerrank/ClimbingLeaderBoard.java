package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ClimbingLeaderBoard {

	
	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		
		Stack<Integer> stack=new Stack<>();
		int count=1;
		stack.push(scores[0]);
        for (int i = 0; i < scores.length; i++) {
        	if(stack.peek()==scores[i]) {
        		count=count;
        	}else {
        		count++;
        	}
        	stack.push(scores[i]);
		}  		
		System.out.println(count);
		
		List<Integer> list=new ArrayList<>();
		for (int i = 0; i < alice.length; i++) {
			if(stack.peek()>alice[i]) {
				count++;
				list.add(count);
			}else {
				int x=stack.peek();
				while(x<=alice[i]) {
					stack.pop();
					count--;
				}
				list.add(count);
			}
		}
		for (Integer integer : list) {
			System.out.println(integer);
		}
		return alice;
    }
	
	
	public static void main(String[] args) {
		int []scores= {100,100,50,40,40,20,10};
		int []alice= {5,25,50,120};
		climbingLeaderboard(scores,alice);
	}
}
