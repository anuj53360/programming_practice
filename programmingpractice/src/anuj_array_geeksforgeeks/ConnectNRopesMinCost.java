package anuj_array_geeksforgeeks;

import java.util.PriorityQueue;

public class ConnectNRopesMinCost {
	
	public void connectNRopes(int []len) {
		
		PriorityQueue<Integer> queue=new PriorityQueue<>();
		for (int i = 0; i < len.length; i++) {
			queue.add(len[i]);
		}
		
		int res=0;
		while(queue.size()>1) {
			int first=queue.poll();
			int second=queue.poll();
			res+=first+second;
			queue.add(first+second);
		}
		
		System.out.println(res);
	}
	
	
	
	public static void main(String[] args) {
		ConnectNRopesMinCost mincost=new ConnectNRopesMinCost();
		int []len= {4,3,2,6};
	   mincost.connectNRopes(len);
	}

}
