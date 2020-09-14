package anuj_array_geeksforgeeks;

public class TrappingRainWater {

	public static int trappingRainWater(int[] array, int n) {

		int result = 0;
		int leftmax = 0;
		int rightmax = 0;
		int start = 0;
		int end = n - 1;

		while (start <= end) {
			if (array[start] < array[end]) {
				if (array[start] > leftmax) {
					leftmax = array[start];
				} else {
					result += leftmax - array[start];
				}
				start++;
			}

			else {
				if (array[end] > rightmax) {
					rightmax = array[end];
				} else {
					result += rightmax - array[end];
				}
				end--;

			}
		}
		System.out.println(result);
		return result;
	}

	public int trap(int[] height) {
		
		int result=0;
		int n=height.length;
		
		int []left=new int[height.length];
		int []right=new int[height.length];
		
		left[0]=height[0];
		
		for (int i = 1; i < height.length; i++) {
			left[i]=Math.max(left[i-1], height[i]);
		}
		
		right[n-1]=height[n-1];
		for (int i = n-2; i>= 0; i--) {
			right[i]=Math.max(right[i+1], height[i]);
		}
		
		for (int i = 0; i < height.length; i++) {
			result+=Math.min(left[i], right[i])-height[i];
		}
		
		return result;
		
	}

	public static void main(String[] args) {

		int[] array = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

		trappingRainWater(array, array.length);

	}
}
