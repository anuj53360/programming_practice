package programmingpractice.src.practice2023;

public class RangeSumQueryLeetCode {

    private int [][]arr;
    public RangeSumQueryLeetCode(int[][] matrix) {
    arr = matrix;

    for(int i=0; i<arr.length ;i++){
        for (int j=1 ; j<arr[0].length;j++){
          arr[i][j] +=arr[i][j-1];
        }
    }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {

        int ans =0;
        for (int i = row1 ; i<= row2 ; i++){
            if(col1 == 0){
                ans = ans+arr[i][col2];
            }else {
                ans = ans+arr[i][col2] - arr[i][col1-1];
            }

        }

        return  ans;
    }

    public static void main(String[] args) {

    //    RangeSumQueryLeetCode rq= new RangeSumQueryLeetCode();
//        [[[[3, 0, 1, 4, 2], [5, 6, 3, 2, 1], [1, 2, 0, 1, 5], [4, 1, 0, 1, 7], [1, 0, 3, 0, 5]]], [2, 1, 4, 3], [1, 1, 2, 2], [1, 2, 2, 4]]
//        rq.sumRegion();
    }
}
