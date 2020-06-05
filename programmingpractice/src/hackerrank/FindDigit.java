package hackerrank;

public class FindDigit {

	public static int findDigit(int n) {
     int x=n;
     int count=0;
	while(n>0) {
		int p=n%10;
		n=n/10;
		if(p==0) {
		}
		else if (x%p==0) {
			count++;
		}
	}
	//System.out.println(count);
	return count;
	}
	
	public static void main(String[] args) {
		int n=1012;
	    findDigit(n);
	}
}
