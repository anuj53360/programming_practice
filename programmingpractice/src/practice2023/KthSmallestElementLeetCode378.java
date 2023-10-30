package programmingpractice.src.practice2023;

public class KthSmallestElementLeetCode378 {

    public int kthSmallest(int[][] matrix, int k) {
     int row = matrix.length;
     int column = matrix[0].length;

     int low = matrix[0][0];
     int high = matrix[row-1][column-1];

     while (low < high){
         int mid = (high-low)/2 + low;
         int count =0;
         int j = column-1;

         for (int i=0;i<row;i++){
             while (j >=0 && matrix[i][j] > mid){
                 j--;
                 count += j+1;
             }
             if (count < k){
                 low = mid+1;
             }else {
                 high = mid;
             }
         }

     }
     return  low;
    }

    public static void main(String[] args) {
       int [][]matrix = {{1,5,9},{10,11,13},{12,13,15}};
       int k = 8;
       KthSmallestElementLeetCode378 kthSmallest = new KthSmallestElementLeetCode378();
       kthSmallest.kthSmallest(matrix , k);
    }
}
