package com.puzzlesjava.solutions.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author apodkutin
 */
public class ArraysUtilsTest {

	@Test
	public void twoDimensionalArrayToString() throws Exception {
		String twoDimArrayStr = "{1, 2} \n{3, 2} \n";
		assertEquals(true, twoDimArrayStr.equals(
			ArraysUtils.twoDimensionalArrayToString(new int[][] {{1,2}, {3,2}})));
	}
}