package com.puzzlesjava.solutions.strings;

/**
 * Check is one string rotation of another, invoking isSubstring method only once.
 * @author apodkutin
 */
public class StringShift {

	public static boolean isStringRotation(String sourceString, String rotationString) {

		if (sourceString.length() == rotationString.length() &&
			sourceString.length() > 0) {

			String doubleSourceString = sourceString + sourceString;
			return doubleSourceString.contains(rotationString);
		}

		return false;
	}
}
