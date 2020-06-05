package hackerrank;

public class BirthdayCake {

	
	public static int birthdayCake(int []array) {
        int count=0;
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
			if(array[i]>max) {
				max=array[i];
			    count=0;
			}
			if(array[i]==max) {
				count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		int []array= {3,2,1,3,4,4,5,5,5};
		int count=birthdayCake(array);
	System.out.println(count);
	}
}
