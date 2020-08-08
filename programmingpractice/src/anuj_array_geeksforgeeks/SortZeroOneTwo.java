package anuj_array_geeksforgeeks;

public class SortZeroOneTwo {

	public static void sortZeroOne(int[] array) {

		int zero = 0;
		int one = 0;
		int two = array.length-1;
		int temp = 0;
		while (one <= two) {
			switch (array[one]) {
			case 0:
				temp = array[zero];
				array[zero] = array[one];
				array[one] = temp;
				zero++;
				one++;
				break;

			case 1:
				one++;
				break;

			case 2:
				temp = array[one];
				array[one] = array[two];
				array[two] = temp;
				two--;
                break;
			}
		}
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

	public static void main(String[] args) {
		int[] array = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		sortZeroOne(array);

	}
}
