package leetcode;

import java.util.PriorityQueue;

public class LastStoneWeight {

	
	 public static int lastStoneWeight(int[] stones) {
	        
		 PriorityQueue<Integer> pq=new PriorityQueue<>();
		 for (int i = 0; i < stones.length; i++) {
			pq.add(-stones[i]);
		}
		 
		 while(pq.size()>1) {
			int firstmaxe=pq.poll();
		    int secondmaxe=pq.poll();
		    
		    if(firstmaxe!=secondmaxe) {
		    	pq.add(firstmaxe-secondmaxe);
		    }
		 }
		 
		 return pq.isEmpty()?0:-pq.poll();
		 
		 
	    }
	
	public static void main(String[] args) {
		int[] stones= {2,7,4,1,8,1};
		int x=lastStoneWeight(stones);
	    System.out.println(x);
	}
}
