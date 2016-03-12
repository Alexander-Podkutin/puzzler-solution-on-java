package com.puzzlesjava.solutions.cs;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author apodkutin
 */
public class IsEqualsTwoNumbersWithDifferentBaseTest {

	@Test
	public void isEqualsBinToHex() throws Exception {
		assertEquals(true,
			IsEqualsTwoNumbersWithDifferentBase.isEqualsBinToHex("1011", "B"));
	}

	@Test
	public void isNotEqualsBinToHex() {
		assertNotEquals(true,
			IsEqualsTwoNumbersWithDifferentBase.isEqualsBinToHex("1011", "C"));
	}

}