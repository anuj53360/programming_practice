package programmingpractice.src.practice2023;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubString {

    public String minWindow(String s, String t) {

        int sLength = s.length();
        int tLength = t.length();

        Map<Character , Integer> tmap = new HashMap<>();
        Map<Character , Integer> smap = new HashMap<>();

        for (int i=0;i<t.length();i++){
            tmap.put(t.charAt(i) ,  tmap.getOrDefault(s.charAt(i) , 0)+1);
        }

        int start =0;
        int end =0;
        int minLen = Integer.MAX_VALUE;
        int matchCount = 0;
        int minStart =0;

        while (end < sLength){

            char chs = s.charAt(end);
            if (tmap.containsKey(chs)){
                if (smap.containsKey(chs)){
                    if (smap.get(chs) < tmap.get(chs)){
                        matchCount++;
                    }
                    smap.put(chs , smap.get(chs)+1);
                }
                else {
                    matchCount++;
                    smap.put(chs ,1);
                }
            }
            end++;

            while (matchCount == tLength){
                if ((end - start) < minLen){
                    minLen  = end- start;
                    minStart = start;
                }
                char chss = s.charAt(start);
                if (tmap.containsKey(chss)){
                    if (smap.get(chss) > tmap.get(chss)){
                        smap.put(chss , smap.get(chss)-1);
                    }else{
                        tmap.put(chss , tmap.get(chss)-1);
                        matchCount --;
                    }
                }
                start++;

            }

        }
        if (minLen == Integer.MAX_VALUE){
            return  " ";
        }
        return  s.substring(minStart , minStart+minLen);
    }

    public static void main(String[] args) {
        MinimumWindowSubString mw = new MinimumWindowSubString();
       String s = "ADOBECODEBANC";
       String t = "ABC";
       mw.minWindow(s ,t);
    }
}
