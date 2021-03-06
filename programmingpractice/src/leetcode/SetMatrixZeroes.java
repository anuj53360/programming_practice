package leetcode;

import java.util.HashSet;

public class SetMatrixZeroes {

	public void setZeroes1(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {

				if (matrix[i][j] == 0) {
					setMatrixUtil(i, j, matrix);
				}
			}
		}

	}

	private void setMatrixUtil(int i, int j, int[][] matrix) {
		if (i < 0 || j < 0 || i > matrix.length || j > matrix[0].length) {
			return;
		}
		if (matrix[i][j] != 0) {
			matrix[i][j] = 0;
		}

		setMatrixUtil(i - 1, j, matrix);
		setMatrixUtil(i + 1, j, matrix);
		setMatrixUtil(i, j - 1, matrix);
		setMatrixUtil(i, j + 1, matrix);
	}

	public void setZeroes(int[][] matrix) {
		HashSet<Integer> row = new HashSet<>();
		HashSet<Integer> column = new HashSet<>();

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {

				if (matrix[i][j] == 0) {
					row.add(i);
					column.add(j);
				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; i++) {
				if (row.contains(i) || column.contains(j)) {
					System.out.println(i+" SSSSS "+j);
					matrix[i][j] = 0;
				}
			}
		}

	}	

	public static void main(String[] args) {

		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		SetMatrixZeroes set = new SetMatrixZeroes();
		set.setZeroes(matrix);

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {
				System.out.println(matrix[i][j]);
			}
		}

	}

}
