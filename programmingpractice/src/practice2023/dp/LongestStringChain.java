package programmingpractice.src.practice2023.dp;

import java.util.*;

public class LongestStringChain {

    static Comparator<String> comp = (s1 , s2) -> s1.length() - s2.length();


    public int longestStrChain(String[] words) {
        List<String> word = Arrays.asList(words);
        int n = word.size();

        // Sort the array by string length
        word.sort(comp);

        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int maxi = 1;

        for (int i = 0; i < n; i++) {
            for (int prevIndex = 0; prevIndex < i; prevIndex++) {
                if (compare(word.get(i), word.get(prevIndex)) && 1 + dp[prevIndex] > dp[i]) {
                    dp[i] = 1 + dp[prevIndex];
                }
            }

            if (dp[i] > maxi) {
                maxi = dp[i];
            }
        }

        return maxi;
    }

    private boolean compare(String word, String word1) {
        if (word.length() != word1.length()+1){
            return  false;
        }
        int first =0;
        int second =0;

        while (first < word.length()){
            if (second < word1.length() && word.charAt(first) == word1.charAt(second)){
                first++;
                second++;
            }else {
                first++;
            }
        }
        return  first == word.length() && second == word1.length();
    }

    public static void main(String[] args) {
       String []words = {"a","b","ba","bca","bda","bdca"};
       LongestStringChain ls = new LongestStringChain();
       ls.longestStrChain(words);
    }
}
