package programmingpractice.src.practice2023;

import java.util.Arrays;
import java.util.Collections;

public class NonOverlappingIntervals {

    public int eraseOverlapIntervals(int[][] intervals) {

        int count =0;
        if(intervals.length == 0){
            return 0;
        }

        Arrays.sort( intervals , (a1 , a2) -> a1[0] -a2[0]);
        int end = intervals[0][1];

        for (int i=1;i<intervals.length;i++){
            if (end > intervals[i][0]){
                end = Math.max(end , intervals[i][1]);
                count++;

            }else {
                end = intervals[i][1];
            }
        }
      return  count;
    }

    public static void main(String[] args) {
NonOverlappingIntervals no = new NonOverlappingIntervals();
      int [][]intervals = {{1,2},{2,3},{3,4},{1,3}};
       no.eraseOverlapIntervals(intervals);

    }
}
