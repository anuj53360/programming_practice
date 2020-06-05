package hackerrank;

import java.math.BigInteger;

public class ExtraLongFactorial {

	static void extraLongFactorials(int n) {
		 BigInteger fact = new BigInteger("1");
	       for (int i = 1; i <= n; i++) {
	           fact = fact.multiply(new BigInteger(i + ""));
	       }
	       System.out.println(fact.toString());
	       
		
		
       
    }
	public static void main(String[] args) {
		int n=25;
		extraLongFactorials(n);
	}
}
