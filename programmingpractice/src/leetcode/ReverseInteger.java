package leetcode;

public class ReverseInteger {

public static int reverse(int x) {
       boolean negative=false;
       int num=0;
	if(x<0) {
		num=Math.abs(x);
		negative=true;
	}else {
		num=x;
	}
	
	StringBuffer sb=new StringBuffer();
	while(num!=0) {
		int y=num%10;
		num=num/10;
		sb.append(y);
	}
System.out.println(sb);
	int newnu=0;
	 newnu=Integer.valueOf(sb.toString());
	if(negative) {
return newnu*-1;
}else {
	return newnu;
}
    }
	
	public static void main(String[] args) {
		int x=-123;
		reverse(x);
	}
}
