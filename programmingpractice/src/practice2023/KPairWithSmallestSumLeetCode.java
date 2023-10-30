package programmingpractice.src.practice2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class KPairWithSmallestSumLeetCode {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

      List<List<Integer>> list = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int x : nums1){
            pq.offer(new int[] {x + nums2[0] , 0});
        }

        while (k >0 && !pq.isEmpty()){
            int []pair = pq.poll();
            int sum = pair[0];
            int pos = pair[1];

        List<Integer> curr = new ArrayList<>();
        curr.add(sum - nums2[pos]);
        curr.add(nums2[pos]);
        list.add(curr);

        if(pos+1 < nums2.length){
            pq.offer(new int []{sum - nums2[pos] + nums2[pos+1] , pos+1});
        }

        k--;
        }



//        int num1Length = nums1.length;
//        int num2Length = nums2.length;
//        for (int i=0;i<num1Length-1;i++){
//            for (int j =0;j<num2Length-1;j++){
//                int sum = nums1[i] + nums2[i];
//                minPQ.add(new Pair(nums1[i] , nums2[i] , sum));
//            }
//
//        }
//        for (int count =0;count<k;count++){
//            list.add(Arrays.asList(minPQ.poll().i , minPQ.poll().i ));
//        }

        return list;
    }

    public static void main(String[] args) {

       int []nums1 = {1,7,11};
       int []nums2 = {2,4,6};
       int k = 3;
       KPairWithSmallestSumLeetCode kPair = new KPairWithSmallestSumLeetCode();
       kPair.kSmallestPairs(nums1 , nums2 , k);
    }
}


//class Pair{
//    int i;
//    int j;
//    int sum;
//    Pair(int i , int j , int sum){
//        this.i = i;
//        this.j = j;
//        this.sum = sum;
//    }
//}