package anuj_array_geeksforgeeks;

import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElement {

	
	
	public static void main(String[] args) {
		KLargestElement largest=new KLargestElement();
		int []array= {1, 23, 12, 9, 30, 2, 50};
		largest.largestElement(array,3);
		
	}

	private void largestElement(int[] array,int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		int count=0;
		for (int i = 0; i < array.length; i++) {
			pq.add(array[i]);
		}
		while(count<k) {
			System.out.println(pq.poll());
			count++;
		}
		
		
		
	}
}
