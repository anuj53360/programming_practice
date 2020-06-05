package hackerrank;

public class BeautifulDays {

	
	static int beautifulDays(int i, int j, int k) {
	      int count=0;
	      for(int m=i;m<=j;m++){
	       int reverse_num=reverse(m); 
	      int diff=Math.abs(reverse_num-m);

	      int divider=diff/k;
	      System.out.println(diff/k+" "+divider);
	     if(divider%1==0){
	    	 
	         count++;
	     }
	       

	
	      }
	      System.out.println(count);
		return count;
		}


	      static int reverse(int x){

	       int rev_number=0;
	       while(x>0){
	      rev_number=rev_number*10+x%10;
	        x=x/10;
	       }
	     return rev_number;
	      }
	
	public static void main(String[] args) {
	
		beautifulDays(20,23,6);
		
		
		
	}
}
