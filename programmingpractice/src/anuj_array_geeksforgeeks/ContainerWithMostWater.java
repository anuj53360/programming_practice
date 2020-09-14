package anuj_array_geeksforgeeks;

public class ContainerWithMostWater {

	public static  int maxArea(int[] height) {
		
		int i=0;
		int j=height.length-1;
		int max=0;
		
		while(i<j) {
			max=Math.max(max, (j-1)*Math.min(height[i], height[j]));
		
		if(height[i]<height[j]) {
			i++;
		}else {
			j--;
		}
		}
		
		return max;
	}

	public static void main(String[] args) {

		int []height= {1,8,6,2,5,4,8,3,7};
		maxArea(height);
	}

}
