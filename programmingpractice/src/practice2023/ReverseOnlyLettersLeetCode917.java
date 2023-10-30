package programmingpractice.src.practice2023;

public class ReverseOnlyLettersLeetCode917 {

    public String reverseOnlyLetters(String s) {
        char []charArray = s.toCharArray();

        int left =0;
        int right = charArray.length-1;
        while (left < right){
            if (Character.isAlphabetic(charArray[left]) &&
                    Character.isAlphabetic(charArray[right])){
                swap(charArray , left , right);
                left++;
                right--;
            }
            if (!Character.isAlphabetic(charArray[left])){
                left++;
            }
            if (!Character.isAlphabetic(charArray[right])){
                right--;
            }
        }




return  String.valueOf(charArray);
    }

    private void swap(char[] charArray, int left, int right) {
    char temp = charArray[left];
    charArray[left] = charArray[right];
    charArray[right] = temp;
    }

    public static void main(String[] args) {
       String s = "Test1ng-Leet=code-Q!";
       ReverseOnlyLettersLeetCode917 ro = new ReverseOnlyLettersLeetCode917();
        System.out.println(ro.reverseOnlyLetters(s));

    }
}
