package com.puzzlesjava.solutions.strings;

import com.puzzlesjava.solutions.strings.ReplaceSpacesWith20;
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