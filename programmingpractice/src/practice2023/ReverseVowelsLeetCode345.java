package programmingpractice.src.practice2023;

public class ReverseVowelsLeetCode345 {


    public String reverseVowels(String s) {

        char []charArray = s.toCharArray();
        int left = 0;
        int right  = charArray.length-1;
        while (left < right){
            if(isVowel(charArray[left]) && isVowel(charArray[right])){
                swap( charArray ,left , right);
                left++;
                right--;
            }else if(!isVowel(charArray[left])){
                left++;
            }else if(!isVowel(charArray[right])) {
                right--;
            }
        }
        return  String.valueOf(charArray);
    }

    private boolean isVowel(char character) {
    if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
        character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U'
    ){
        return  true;
    }
    return  false;
    }

    private void swap(char[] charArray, int left, int right) {
     char temp = charArray[left];
     charArray[left] = charArray[right];
     charArray[right] = temp;
    }

    public static void main(String[] args) {
         String s = "aA";
         ReverseVowelsLeetCode345 rv = new ReverseVowelsLeetCode345();
        System.out.println(rv.reverseVowels(s));
    }
}

