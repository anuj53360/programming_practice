package programmingpractice.src.practice2023;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistanceCharacterLeetCode {

    public int[] shortestToChar(String s, char c) {
       int []answer = new int[s.length()];
        Queue<Integer> queue = new LinkedList<>();
        char []charArray = s.toCharArray();
        for (int i=0;i<charArray.length;i++){
            if (charArray[i] == c){
                queue.offer(i);
            }
        }

        for (int i=0;i<charArray.length;i++){
            int charIndex = Math.abs(i-queue.peek());
            System.out.println(i+ " "+queue.peek());
            if (i<=queue.peek()){
                answer[i] = charIndex;
                System.out.println("aaaaaa "+charArray[i]+" "+charIndex + " "+answer[i]);
            }else{
              int min =  Math.min(charIndex , Math.abs(i-queue.peek()));
           answer[i] = min;
                queue.poll();
                System.out.println(charArray[i]+" "+charIndex + " "+answer[i]);
            }
        }
   return answer;
    }

    public int[] shortestToCharSec(String s, char c) {
        int []answer = new int[s.length()];

        int next = nextIndex(s , c , 0);
        int previous = next;

        for (int i=0;i< s.length();i++){
            if (i > next){
                previous = next;
                next = nextIndex(s , c, next+1);
            }

            answer[i] = Math.abs(Math.min(next-i , i-previous));
        }

        return  answer;
    }

    private int nextIndex(String s, char c, int index) {
    while (index < s.length()){
        if (s.charAt(index) == c){
            break;
        }
        ++index;
    }
    if (index == s.length()){
        return  Integer.MAX_VALUE;
    }
    return  index;
    }

    public static void main(String[] args) {
      String  s = "loveleetcode";
      char c = 'e';
      ShortestDistanceCharacterLeetCode sd = new ShortestDistanceCharacterLeetCode();
      sd.shortestToChar(s , c);
    }
}
