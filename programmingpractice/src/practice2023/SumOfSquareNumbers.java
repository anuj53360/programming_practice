package programmingpractice.src.practice2023;

public class SumOfSquareNumbers {

    public boolean judgeSquareSum(int c) {

        int left =0;
        int right = (int)c/2;
        while (left <= right){
            int value = left*left + right*right;
            if(value == c){
                return true;
            }
            else if(value > c){
                right--;
            }
            else if (value < c){
                left++;
            }

        }
        return false;
    }

    public static void main(String[] args) {
     SumOfSquareNumbers sn = new SumOfSquareNumbers();
        int c = 5;
      System.out.println(sn.judgeSquareSum(c));
    }
}
