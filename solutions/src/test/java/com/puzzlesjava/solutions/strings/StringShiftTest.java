package com.puzzlesjava.solutions.strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author apodkutin
 */
public class StringShiftTest {

	@Test
	public void isStringRotation() throws Exception {

		String sourceString = "cucumber";
		String rotateString = "mbercucu";

		assertEquals(true, StringShift.isStringRotation(sourceString, rotateString));
	}
}