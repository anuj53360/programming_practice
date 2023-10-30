package programmingpractice.src.practice2023;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximumProductWordLengthLeetCode {


    public int maxProduct(String[] words) {

        int max =0;
        Map<String , Set<Character>> map = new HashMap<>();

        for (String word : words) {
            Set<Character> set = new HashSet<>();
            for(int i=0; i< word.length() ;i++){
                set.add(word.charAt(i));
            }
        map.put(word , set);
        }

        for(int i=0; i< words.length ;i++){
            for (int j=i+1 ; j<words.length;j++){
                if(!isRelated(map.get(words[i]) , words[j])){
                    max = Math.max(max , words[i].length() * words[j].length());
                }
            }
        }



return max;
    }

    private boolean isRelated(Set<Character> characters, String word) {
    for(int i=0;i<word.length() ;i++){
        if(characters.contains(word.charAt(i))){
            return  true;
        }
    }
    return  false;
    }

    public static void main(String[] args) {

        MaximumProductWordLengthLeetCode mp = new MaximumProductWordLengthLeetCode();
       String []words = {"abcw","baz","foo","bar","xtfn","abcdef"};
       mp.maxProduct(words);
    }
}
