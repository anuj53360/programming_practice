package programmingpractice.src.practice2023;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class FindRightInterval {

    public int[] findRightInterval(int[][] intervals) {

        var set = new TreeSet<>();
        Map<Integer , Integer> map = new HashMap<>();
        int []result = new int[intervals.length];

        for (int i=0;i<intervals.length;i++){
            set.add(intervals[i][0]);
            map.put(intervals[i][0] , i);
        }

        for (int i=0;i<intervals.length;i++){
            result[i] = map.getOrDefault(set.ceiling(intervals[i][1]) , -1);
        }
        return  result;
    }

    public static void main(String[] args) {
        int [][]intervals = {{3,4},{2,3},{1,2}};
        FindRightInterval fr = new FindRightInterval();
        fr.findRightInterval(intervals);
    }
}
