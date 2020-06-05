package hackerrank;

public class DayofProgrammer {

	public static String dayofProgrammer(int year) {
		int tweentyfifth=256;
		StringBuilder sb=new StringBuilder();
		int []months= {31,0,31,30,31,30,31,31};
		boolean b=false;
		if((((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))) {
			b=true;
		}else {
			b=false;
		}
		if(b) {
			months[1]=29;
		}else {
			months[1]=28;
		}
		System.out.println(months);
int sum=0;
		for (int i = 0; i < months.length; i++) {
			sum=sum+months[i];
		}
		String month="09";
		int diff=tweentyfifth-sum;
		sb.append(diff).append(".").append(month).append(".").append(year);
		
		String s=sb.toString();
		System.out.println(s);
		return s;
	}
	
	public static void main(String[] args) {
		int year=1800;
		dayofProgrammer(year);
	}
}
