package com.puzzlesjava.solutions.arrays;

/**
 * Rotate image by 90 degrees. Image represented by N x N matrix.
 * @author apodkutin
 */
public class RotateMatrixImage {

	public static void rotateImageMatrix(int[][] imageMatrix) {
		int matrixSize = imageMatrix.length;

		//Go through matrix from outside layer to inside layer
		for (int layer = 0; layer < matrixSize / 2; layer++) {
			int first = layer;
			int last = matrixSize - 1 - layer;

			//Rotate layer
			for (int i = first; i < last; i++) {
				//Change offset after each cycle iterate
				int offset = i - first;

				int top = imageMatrix[first][first + offset];
				//Left bottom > top left
				imageMatrix[first][first + offset] = imageMatrix[last - offset][first];
				//Bottom right > left bottom
				imageMatrix[last - offset][first] = imageMatrix[last][last - offset];
				//Right top > bottom right
				imageMatrix[last][last - offset] = imageMatrix[first + offset][last];
				//Top left > right top
				imageMatrix[first + offset][last] = top;
			}
		}
	}

	public static void main(String[] args) {

		int[][] twoDimArray = new int[4][4];
		ArraysUtils.fillTwoDimensionalArray(twoDimArray);

		System.out.println(
			ArraysUtils.twoDimensionalArrayToString(twoDimArray));

		rotateImageMatrix(twoDimArray);

		System.out.println(
			ArraysUtils.twoDimensionalArrayToString(twoDimArray));
	}
}
