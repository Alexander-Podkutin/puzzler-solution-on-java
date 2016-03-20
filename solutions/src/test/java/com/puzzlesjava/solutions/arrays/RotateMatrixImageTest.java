package com.puzzlesjava.solutions.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author apodkutin
 */
public class RotateMatrixImageTest {

	@Test
	public void rotateImageMatrix() throws Exception {
		int[][] twoDimArray = new int[][] {{1, 2, 6}, {3, 5, 8}, {11, 7, 4}};

		RotateMatrixImage.rotateImageMatrix(twoDimArray);

		assertEquals(true, twoDimArray[0][0] == 11);
	}
}