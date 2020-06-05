package anuj_array_geeksforgeeks;

public class NumberFlipBinaryStringAlternate {

	public static char nextcharvalue(char startingchar){
		return (startingchar=='0')?'1':'0';
	}
	public static int binaryStringAlternateUtil(String str, char startingchar){
	
		int count=0;
		     for (int i = 0; i < str.length()-1; i++) {
				if(str.charAt(i)==startingchar) {
					count++;
				}
				startingchar=nextcharvalue(startingchar);
			}
		return count;
	}
	
	
	
	public static int binaryStringAlternate(String str) {
	return	Math.min(binaryStringAlternateUtil(str,'0') ,binaryStringAlternateUtil(str,'1'));
	}
	
	public static void main(String[] args) {
		String str="0001010111";
		int count=binaryStringAlternate(str);
	    System.out.println(count);
	}
	
}
