package codechef;

import java.util.List;

public class CountingPrettyNumbersNUM239 {

	public static int countingPrettyNumber(int l,int r) {
		int count=0;
		for(int i=l;i<=r;i++) {
			int x=i%10;
			switch (x) {
			case 2:
				count++;
				break;
			case 3:
				count++;
				break;
			case 9:
				count++;
				break;
			default:
				break;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		int l=1;
		int r=10;
		int count=countingPrettyNumber(l,r);
	System.out.println(count);
	}
}
