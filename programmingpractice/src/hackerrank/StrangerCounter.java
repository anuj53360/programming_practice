package hackerrank;

public class StrangerCounter {

	public static void strangerCounter(int t) {
		int x=3;
		int count=x;
			for(int i=2;i<=t;i++) {
			System.out.println(x+"XXXX");
			if(x!=1) {
				x--;
			}else {
				
				x=2*count;
			}
		
		}
		System.out.println(x);
	
	}
	public static void main(String[] args) {
		int t=15;
		strangerCounter(t);
	}
}
