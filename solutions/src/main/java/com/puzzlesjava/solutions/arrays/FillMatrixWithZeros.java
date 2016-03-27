package com.puzzlesjava.solutions.arrays;

import java.util.Arrays;

/**
 * Fill row and column with zeros if element is zero.
 * @author apodkutin
 */
public class FillMatrixWithZeros {

	public static void fillMatrixWithZeros(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (row[i] || column[j]) {
					matrix[i][j] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[][] twoDimArray = new int[][] {{1, 5, 8}, {0, 6, 7}, {1, 6, 2}};
		fillMatrixWithZeros(twoDimArray);
		System.out.println(ArraysUtils.twoDimensionalArrayToString(twoDimArray));
	}
}
