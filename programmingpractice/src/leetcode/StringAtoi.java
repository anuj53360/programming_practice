package leetcode;

public class StringAtoi {

	 public static int myAtoi(String str) {
		 if(str==null || str.length()==0) {
			 return 0;
		 }
	        int startindex=0;
	        double result=0;
	       boolean isNegative=false;
	         str=str.trim();
	         if(str.charAt(0)=='+' || str.charAt(0)=='-') {
	        	 startindex++;
	         }
	
	         if(str.charAt(0)=='-') {
	        	 isNegative=true;
	         }
	         
	         
	      for (int j = startindex; j < str.length(); j++) {
			if(str.charAt(j)<'0' || str.charAt(j)>'9') {
				break;
			}
			int digitv=str.charAt(j)-'0';
			result=result*10+digitv;
		}
	        
	        if(isNegative) {
	        	result=-result;
	        }
	       
	        
	        if(result>Integer.MAX_VALUE) {
	        	System.out.println("XXXXX");
	        	return Integer.MAX_VALUE; 
	        }
	        if(result<Integer.MIN_VALUE) {
	        	System.out.println("XXXXX");
	        	return Integer.MIN_VALUE; 
	        }
	        return (int) result;
	        
	        
	    }
	
	
	public static void main(String[] args) {
		 
		String str="+23";
		int x=myAtoi(str);
	System.out.println(x);
	}
}
