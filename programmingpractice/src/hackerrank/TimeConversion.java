package hackerrank;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConversion {

	static String timeConversion(String s) {
		String s1="";
		String s2="";
		if(s.endsWith("PM")){
			s1=s.substring(0, s.length()-2);
			LocalTime lt=LocalTime.now();
	         LocalTime lt1=lt.parse(s1);
	                    LocalTime lt2=lt1.plusHours(12);
	                    s2=lt2.toString();
		}else if (s.endsWith("AM")) {
			s1=s.substring(0, s.length()-2);
			LocalTime lt=LocalTime.now();
	         LocalTime lt1=lt.parse(s1);
	       DateTimeFormatter dt=DateTimeFormatter.ofPattern("HH:mm:ss");
	         lt1.format(dt);
	                    s2=lt1.toString();
		}
		         
		System.out.println(s2);
		return s2;
    }
	
	public static void main(String[] args) {
		String s="12:00:00AM";
		timeConversion(s);
	}
}
