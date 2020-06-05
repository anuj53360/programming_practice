package leetcode;

public class ReverseString {

    public static void reverseString(char[] s) {
        
    	int length=s.length;
    	int i=0;
    	int j=length-1;
    while(i<length/2) {
    	char temp=s[i];
    	s[i]=s[j];
    	s[j]=temp;
    	i++;
    	j--;
    }
    
    for (int j2 = 0; j2 < s.length; j2++) {
		System.out.println(s[j2]);
	}
    
    }
    
    

	
    
	public static void main(String[] args) {
		char[] s= {'H','a','n','n','a','h'};
		reverseString(s);
	}
}
