package com.puzzlesjava.solutions.strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author apodkutin
 */
public class IsAllCharactersUniqueTest {

	String TEST_STRING = "abfghte";

	@Test
	public void isAllCharactersUnique() throws Exception {
		assertEquals("String " + TEST_STRING + " has only unique characters", true,
			IsAllCharactersUnique.isAllCharactersUnique(TEST_STRING));

	}
}