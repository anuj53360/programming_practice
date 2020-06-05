package leetcode;

public class ValidPalindrome {

public static boolean isPalindrome(String s) {
//	String newstring=s.replaceAll("[^a-zA-Z0-9]", "");
//    if(newstring.equals(" ")|| newstring.length()==0|| newstring.length()==1) {
//	return true;
//}
//  String news=newstring.toLowerCase();
//  int i=0;
//  int j=news.length()-1;
//  boolean b=false;
//  while(i<j) {
//	  if(news.charAt(i)!=news.charAt(j)) {
//		  b=false;
//	  }
//	  else {
//		  b=true;
//	  }
//	  i++;
//	  j--;
//  }
//	  
//if(b) {
//	return true;
//}  else {
//	return false;
//}
	
	int i=0;
	int j=s.length()-1;
	
	while(i<j) {
		
		while(i<j && !Character.isLetterOrDigit(s.charAt(i))) {
			i++;
		}
		
		while(i<j && !Character.isLetterOrDigit(s.charAt(j))) {
			j--;
		}
		
		if(i<j && Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--))) {
			return false;
		}
		
	}
	
	return true;
    }
	


public static void main(String[] args) {
	String s="A man, a plan, a canal: Panama";
	isPalindrome(s);
}
}
