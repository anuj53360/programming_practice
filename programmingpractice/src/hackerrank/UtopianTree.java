package hackerrank;

public class UtopianTree {

	static int utopianTree(int n) {
         
		int height=0;
		boolean flag=true;
		for (int i = 0; i <=n; i++) {
			
			if(flag) {
				height=height+1;
			}else {
				height=height*2;
			}
			//System.out.println(i+""+height);
			flag=!flag;
			
		}
		
		
    return height;
    }    
	
	
	public static void main(String[] args) {
	int n=5;
	utopianTree(n);
	}
}
