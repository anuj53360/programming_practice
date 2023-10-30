package programmingpractice.src.practice2023;

import java.util.*;

public class TopKFrequentElementLeetCode {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer , Integer> map = new HashMap<>();
        for (int num:nums) {
            map.put(num , map.getOrDefault(num , 0)+1);
        }

        Queue<Integer> priorityQueue = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        for (int key: map.keySet()) {
               priorityQueue.add(key);

        }

        int []result = new int[k];

        for (int i=0;i<k;i++){
            result[i] = priorityQueue.poll();

        }

        Arrays.stream(result).forEach(System.out::println);


       return result;
    }

    public static void main(String[] args) {
TopKFrequentElementLeetCode tf = new TopKFrequentElementLeetCode();
        int []nums = {1,1,1,2,2,3};
        int k = 2;
        tf.topKFrequent(nums , k);
    }
}
