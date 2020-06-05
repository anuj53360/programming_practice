package leetcode_mayChallenge;

public class NumberComplement {

    public static int findComplement(int num) {
    	if(num==0) {return 1;}
  int numbits= (int) (Math.log(num)/Math.log(2))+1;
  int x=(1<<numbits)-1;
    	return num^x;
    }
	
	public static void main(String[] args) {
		int num=5;
	int 	x=findComplement(num);
	System.out.println(x);
	}
}
