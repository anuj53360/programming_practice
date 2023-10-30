package programmingpractice.src.practice2023;

public class ValidPalindromeTwoLeetCode680 {

    public boolean validPalindrome(String s) {

        return  validSubPalindrome(s , 0 , s.length() , false);
    }

    private boolean validSubPalindrome(String s, int i, int length, boolean b) {
        if(i > length){
            return true;
        }

        if(s.charAt(i) != s.charAt(length)){
            if (b ==false){
                if (validSubPalindrome(s , i+1 , length , true))
                    return true;
                return validSubPalindrome(s , i , length-1 , true);
            }
            else return false;

        }
        return validSubPalindrome(s , i+1, length-1 , b);
    }

    public static void main(String[] args) {
        ValidPalindromeTwoLeetCode680 vp = new ValidPalindromeTwoLeetCode680();
       String s = "deeee";
         System.out.println(vp.validPalindrome(s));


    }
}
