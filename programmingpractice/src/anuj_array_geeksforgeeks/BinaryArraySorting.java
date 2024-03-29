package anuj_array_geeksforgeeks;

public class BinaryArraySorting {

	public static void binaryArraySorting(int[] array) {

		int zero = 0;
		int one = array.length - 1;

		while (zero < one) {

			if (array[zero] == 1) {
				int x = array[zero];
				array[zero] = array[one];
				array[one] = x;
				one--;
			} else {
				zero++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

	public static void main(String[] args) {
		int[] array = { 1, 0, 1, 1, 1, 1, 1, 0, 0, 0 };
		binaryArraySorting(array);
	}
}
