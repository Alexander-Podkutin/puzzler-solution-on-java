package com.puzzlesjava.solutions.strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author apodkutin
 */
public class SimpleStringCompressionTest {

	@Test
	public void compressString() throws Exception {
		assertEquals(true,
			SimpleStringCompression.compressString("aaabbcccccccccc").equals("a3b2c10"));
	}
}