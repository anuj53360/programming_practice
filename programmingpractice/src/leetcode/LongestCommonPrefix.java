package leetcode;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
		if(strs.length==0 || strs==null) {
			return "";		
			}
		return	longestCommonPrefixUtil(strs,0,strs.length-1);
	}
	
public static String longestCommonPrefixUtil(String []strs,int start,int last){
		if(start==last) {
			return strs[start];
		}
		int mid=start+last/2;
		String lc=longestCommonPrefixUtil(strs,start,mid);
		String rc=longestCommonPrefixUtil(strs,mid+1,last);
   return longestCommon(lc,rc);
}

public static String longestCommon(String lc,String rc){
	int min=Math.min(lc.length(),rc.length());
			for (int i = 0; i < min; i++) {
				 if ( lc.charAt(i) != rc.charAt(i) ) {
			            return lc.substring(0, i);
			            }
			    }
			    return lc.substring(0, min);
			}



//	public static String longestCommonPrefixUtil(String prefix,String strs,int minlength){
//		String result="";
//		for (int i = 0; i <= minlength; i++) {
//			for (int j = 0; j <= minlength; j++) {
//				if(prefix.charAt(i)==strs.charAt(j)) {
//                  result+=prefix.charAt(i); 					
//				}
//			}
//		}
//		return result;
//	}
	
	public static void main(String[] args) {
		String[] strs= {"flower","flow","flight"};
		String s=longestCommonPrefix(strs);
	System.out.println(s);
	}
}
