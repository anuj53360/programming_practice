package leetcode_mayChallenge;

import java.util.Arrays;

public class CountSquareSubMatrices {

	public static int countSquares(int[][] matrix) {

		int n = matrix.length;
		int m = matrix[0].length;
		int[][] squarematrix = new int[n + 1][m + 1];
	//	System.out.println(n + " " + m);
		int count = 0;
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < m + 1; j++) {
				if (matrix[i - 1][j - 1] == 1) {
					squarematrix[i][j] = Math.min(squarematrix[i][j - 1], squarematrix[i - 1][j]);
					squarematrix[i][j] = 1 + Math.min(squarematrix[i][j], squarematrix[i - 1][j - 1]);
					count += squarematrix[i][j];
				}

			}
		}

//		for (int i = 0; i < squarematrix.length; i++) {
//			for (int j = 0; j < squarematrix[0].length; j++) {
//				System.out.print(squarematrix[i][j]);
//			}
//			System.out.println(" ");
		return count;
	}

	

	

	public static void main(String[] args) {
		int[][] matrix = { { 1, 0, 1 }, { 1, 1, 0 }, { 1, 1, 0 } };
		int count = countSquares(matrix);
		System.out.println(count);
	}
}
