package programmingpractice.src.practice2023;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class FindKClosestElementLeetCode658 {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        List<Integer> list = new ArrayList<>();

        int left =0;
        int right = arr.length-1;
        while (right - left >= k){
            if( Math.abs(arr[left] - x) > Math.abs(arr[right] -x)){
                left++;
            }
            else {
                right --;
            }
        }
        for (int i= left;i<=right;i++){
            list.add(arr[i]);
        }
        return  list;
    }

    public List<Integer> findClosestElementsPQ(int[] arr, int k, int x) {
    List<Integer> list = new ArrayList<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (Integer i : arr){
            if (k >0){
                pq.add(i);
                k--;
            }else if(Math.abs(pq.peek()-x) > Math.abs(i-x)){
                pq.poll();
                pq.add(i);
            }
        }

        while (!pq.isEmpty()){
            list.add(pq.poll());
        }
        return list;
    }


    public static void main(String[] args) {

       int []arr = {1,2,3,4,5};
       int k = 4;
       int x = 3;
       FindKClosestElementLeetCode658 fc = new FindKClosestElementLeetCode658();
       fc.findClosestElements(arr , k , x);
    }
}
