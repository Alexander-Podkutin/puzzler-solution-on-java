package com.puzzlesjava.solutions.cs;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author apodkutin
 */
public class IsEqualsTwoNumbersWithDifferentBaseTest {

	@Test
	public void isEqualsBinToHex() throws Exception {
		assertEquals("1011 is equals B",
			true, IsEqualsTwoNumbersWithDifferentBase.isEqualsBinToHex("1011", "B"));
	}

	@Test
	public void isNotEqualsBinToHex() {
		assertNotEquals("1011 is not equals C",
			true, IsEqualsTwoNumbersWithDifferentBase.isEqualsBinToHex("1011", "C"));
	}

}