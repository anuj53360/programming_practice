package anuj_array_geeksforgeeks;


import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestUsingPriority {

	public static int kthSmallest(int[] array,int k) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		for (Integer integer : array) {
			pq.add(integer);
		}
		
       	int x=0;
//		int count=0;
		for (Integer integer : pq) {
//			if(count==array.length-k) {
//				x=integer;
//			}
//			count++;
		//	pq.poll();
	System.out.println(integer);
			
		}
		
		
		return x;
		
	}
	
	public static void main(String[] args) {
		
		int [] array= {7 ,10, 4, 3, 22, 18,25};
		int k=kthSmallest(array,3);
	//System.out.println(k);
	}
}
