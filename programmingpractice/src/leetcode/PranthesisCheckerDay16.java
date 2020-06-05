package leetcode;

public class PranthesisCheckerDay16 {

	public static boolean pranthesisChecker(String string) {
         
		if(string.length()==0) {
			return true;
		}
		if(string.length()==1 && string.contains("*")) {
			return true;
		}
		
		int count=0;
		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i)==')') {
				count--;
			}else {
				count++;
			}
			if(count<0) {
				return false;
			}
		}

		if(count==0) {
			return true;
		}
		
		for (int i = string.length()-1; i >=0; --i) {
			if(string.charAt(i)=='(') {
				count--;
			}else {
				count++;
			}
			if(count<0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
      
		String string="*";
		//System.out.println(pranthesisChecker(string));
		
		
		for (int i = 1; i < 7; ++i) {
			System.out.println(i);
		}
	}
}
