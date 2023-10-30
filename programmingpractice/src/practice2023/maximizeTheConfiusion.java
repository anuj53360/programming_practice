package programmingpractice.src.practice2023;

public class maximizeTheConfiusion {

    public int maxConsecutiveAnswers(String answerKey, int k) {

        int countT =0;
        int countF =0;
        int left =0;
        int right =0;
        int res =0;


        while (right < answerKey.length()){

            if(answerKey.charAt(right) == 'T'){
                countT++;
            }else{
                countF++;
            }

            if(countT > k && countF >k && left < answerKey.length()){
                if(answerKey.charAt(left) == 'T'){
                    countT--;
                }else{
                    countF--;
                }
                left++;

            }
            res = Math.max(res , right-left+1);
            right++;
        }
        return  res;
    }

    public static void main(String[] args) {
        maximizeTheConfiusion mc = new maximizeTheConfiusion();
       String answerKey = "TTFF";
       int k = 2;
       mc.maxConsecutiveAnswers(answerKey , k);
    }
}
