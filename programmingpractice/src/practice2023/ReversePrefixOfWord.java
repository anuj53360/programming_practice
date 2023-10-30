package programmingpractice.src.practice2023;

public class ReversePrefixOfWord {

    public String reversePrefix(String word, char ch) {
          int index = word.indexOf(ch);
          String subString = word.substring(0 , index+1);
        StringBuffer sb = new StringBuffer(subString);
            sb.reverse().append(word.substring(index+1 , word.length()));
            return sb.toString();
    }


    public String reverseStr(String s, int k) {

        char []charArray = s.toCharArray();
        int n = charArray.length;
        for(int i=0;i<=n-1; i+=2*k){
            String s1= "";
            if(i+k-1 <= n-1) {
                 reverseK(i , i+k-1 , charArray);
            }else{
                reverseK(i , n-1 , charArray);
            }
        }

        return new String(charArray);
    }

    private void reverseK(int i, int j, char[] charArray) {
       while (i < j){
           char temp = charArray[i];
           charArray[i] = charArray[j];
           charArray[j] = temp;
           i++;
           j--;
       }

    }

    public String reverseWords(String s) {
        String s4 = s.strip();
     StringBuffer sb = new StringBuffer();
        String[]  s1 = s4.split(" ");
        for (int i=s1.length-1 ; i>= 0;i--){
            sb.append(s1[i]).append(" ");
        }
        return sb.substring(0 , sb.length()-1).replaceAll("\\s+"," ");
    }

    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
//       String  s = "abcdefg";
//       int k = 2;
//
        String s = "a good   example";
        ReversePrefixOfWord rp = new ReversePrefixOfWord();
     //  System.out.println(rp.reversePrefix(word , ch));
    //    System.out.println(rp.reverseStr(s , k));
        System.out.println(rp.reverseWords(s));
    }
}
