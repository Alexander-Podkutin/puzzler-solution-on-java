package com.puzzlesjava.solutions.arrays;

import com.puzzlesjava.solutions.arrays.ReplaceSpacesWith20;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author apodkutin
 */
public class ReplaceSpacesWith20Test {

	@Test
	public void replaceAllSpacesWith20() throws Exception {
		assertEquals(false,
			ReplaceSpacesWith20.replaceAllSpacesWith20(
				"Test string for example!").contains(
					String.valueOf(ReplaceSpacesWith20.SPACE_CHARACTER)));
	}
}