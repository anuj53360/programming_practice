package leetcode;

public class PlusOne {

	 public static int[] plusOne(int[] digits) {
//	             StringBuffer sb=new StringBuffer();
//	         for(int i=0;i<digits.length;i++){
//	             if(i==digits.length-1){
//	                 sb.append(digits[i]+1);
//	             }
//	    else{         
//	             sb.append(digits[i]);
//	         }
//	             }
//	  //  System.out.println(sb);
//	    int []array=new int[sb.length()+1];
//	    for (int i = sb.length()-1; i >= 0; i--) {
//	    	if(sb.charAt(i)=='9') {
//	    		array[0]=1;
//	    		array[i]=0;
//	    	}else {
//	    	array[i] = sb.charAt(i) - '0';
//	    	}
//	    	}
//	    
//	    for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
	    
		 for (int i =digits.length-1; i >= 0; i--) {
			if(digits[i]<9) {
				digits[i]++;
				return digits;
			}
			digits[i]=0;
		}
		 int []array=new int[digits.length+1];
        array[0]=1;
		 return array;
	    }
	
	public static void main(String[] args) {
		//int[] digits= {4,3,2,1};
		int[] digits= {9,9};
		plusOne(digits);
	}
}
