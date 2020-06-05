package leetcode_mayChallenge;

public class CountingBits {

	public static int[] countBits(int num) {
		int[] bitcount = new int[num + 1];
		for (int i = 1; i <= num; i++) {
			bitcount[i] = bitcount[i >> 1] + i % 2;
		}

		return bitcount;
	}

	public static void main(String[] args) {
		int num = 5;
		countBits(num);
	}
}
