package hackerrank;

public class StringCompression {

	
	public static String compressedString(String message) {

        String out="";
        int sum=1;
        for (int i = 0; i < message.length()-1; i++) {
   if(message.charAt(i)==message.charAt(i+1)) {
	   sum++;
   }		else {
	   out=out+message.charAt(i)+sum;
	   sum=1;
   }	
		}
        out=out+message.charAt(message.length()-1)+sum;
        return out;
    }

	
	public static void main(String[] args) {
		String str="aaabbbcc";
		String s=compressedString(str);
	System.out.println(s);
	}
}
