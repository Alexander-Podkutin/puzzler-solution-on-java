package com.puzzlesjava.solutions.cs;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author apodkutin
 */
public class IsAllCharactersUniqueTest {

	String TEST_STRING = "abfghtea";

	@Test
	public void isAllCharactersUnique() throws Exception {
		assertEquals("String " + TEST_STRING + " has not unique characters", false,
			IsAllCharactersUnique.isAllCharactersUnique(TEST_STRING));

	}
}