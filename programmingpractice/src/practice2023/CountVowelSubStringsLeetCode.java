package programmingpractice.src.practice2023;

import java.util.HashMap;
import java.util.Map;

public class CountVowelSubStringsLeetCode {

    public int countVowelSubstrings(String word) {
        return countVowelSubstringsUtil(word , 5) - countVowelSubstringsUtil(word , 4);
    }

    public int countVowelSubstringsUtil(String word , int k) {
int left=0;
int right =0;
int count =0;
        Map<Character , Integer> map = new HashMap<>();
        char []charArray = word.toCharArray();
        while (right < charArray.length){



            if(!isVowel(charArray[right])){
                left = right+1;
                right++;
                map.clear();
                continue;
            }
            map.put(charArray[right] , map.getOrDefault(charArray[right] ,0)+1);

            while (map.size() > k){
                map.put(charArray[left] , map.getOrDefault(charArray[left] ,0)-1);

                if(map.get(charArray[left]) == 0){
                    map.remove(charArray[left]);
                }
                left++;
            }
       count += right-left+1;
            right++;
            }

        return count;
    }

    private boolean isVowel(char c) {
    if(c == 'a' || c == 'e' || c == 'i'  || c == 'o' || c == 'u'){
        return true;
    }
    return  false;
    }


    public static void main(String[] args) {
  CountVowelSubStringsLeetCode cs = new CountVowelSubStringsLeetCode();
        String word = "cuaieuouac";
 System.out.println(cs.countVowelSubstrings(word));

    }
}
