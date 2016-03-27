package com.puzzlesjava.solutions.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author apodkutin
 */
public class FillMatrixWithZerosTest {

	@Test
	public void fillMatrixWithZeros() throws Exception {
		int[][] twoDimArray = new int[][] {
			{1, 5, 8},
			{0, 6, 7},
			{1, 6, 2}};
		FillMatrixWithZeros.fillMatrixWithZeros(twoDimArray);

		assertEquals(true, twoDimArray[0][0] == 0 &&
			twoDimArray[1][0] == 0 &&
			twoDimArray[2][0] == 0 &&
			twoDimArray[1][1] == 0 &&
			twoDimArray[1][2] == 0);
	}
}