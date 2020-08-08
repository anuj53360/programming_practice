package anuj_array_geeksforgeeks;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFromDataStream {

	public double getMedians(int[] array) {
		PriorityQueue<Integer> lower = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> higher = new PriorityQueue<>();
		double[] medians = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			int num = array[i];
			addNum(num, lower, higher);
			rebalnce(lower, higher);
			findMedian(lower, higher);
		}
		return 0;
	}

	public void addNum(int num, PriorityQueue<Integer> lowers, PriorityQueue<Integer> higher) {
		if (lowers.size() == 0 || num < lowers.peek()) {
			lowers.add(num);
		} else {
			higher.add(num);
		}
	}

	public double findMedian(PriorityQueue<Integer> lowers, PriorityQueue<Integer> higher) {
		PriorityQueue<Integer> biggerheap = lowers.size() > higher.size() ? lowers : higher;
		PriorityQueue<Integer> smallerheap = lowers.size() < higher.size() ? lowers : higher;
		if (biggerheap.size() == smallerheap.size())
			return (double) (biggerheap.peek() + smallerheap.peek()) / 2;
		return biggerheap.peek();
	}

	public void rebalnce(PriorityQueue<Integer> lowers, PriorityQueue<Integer> higher) {
		PriorityQueue<Integer> biggerheap = lowers.size() > higher.size() ? lowers : higher;
		PriorityQueue<Integer> smallerheap = lowers.size() < higher.size() ? lowers : higher;
		if (biggerheap.size() - smallerheap.size() >= 2) {
			smallerheap.add(biggerheap.poll());
		}
	}

	public static void main(String[] args) {

	}
}
