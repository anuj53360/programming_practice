package hackerrank;

public class CountingValleys {

	
	static int countingValleys(int n, String s) {

     int count=0;
     int newcount=0;
     for(int i=0;i<s.length();i++) {
    	 
    	if( String.valueOf(s.charAt(i)).equals("U")) {
    		++count;
    		System.out.println(count);
    	}
    	
    	if( String.valueOf(s.charAt(i)).equals("D")) {
    		--count;
    		System.out.println(count);
    	}
    	if(count==0 && String.valueOf(s.charAt(i)).equals("D")) {
    		newcount++;
    	}
    	
     }
System.out.println(newcount);
		
		return 0;
    }
	
	
	public static void main(String[] args) {
		
		String s="DDUUDDUDUUUD";
		int n=s.length();
		countingValleys(n, s);
	}
}
