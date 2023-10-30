package programmingpractice.src.practice2023;

import java.util.Arrays;

public class BagOfTokenLeetCode948 {


    public int bagOfTokensScore(int[] tokens, int power) {

        Arrays.sort(tokens);
        int left = 0;
        int right = tokens.length-1;
        int curr_score =0;
        int max_score =0;
        while (left <=right){

            if(tokens[left] <= power){
                power -=tokens[left];
                curr_score +=1;
                max_score = Math.max(max_score , curr_score);
                left +=1;
            }else if (curr_score >=1){
                power += tokens[right];
                curr_score -=1;
                right -=1;
            }else {
                break;
            }
        }
        return  max_score;
    }

    public static void main(String[] args) {
        int []tokens = {100,200,300,400};
        int power = 200;
        BagOfTokenLeetCode948 bt = new BagOfTokenLeetCode948();
        bt.bagOfTokensScore(tokens , power);
    }
}
