package com.puzzlesjava.solutions.strings;

/**
 * Are all characters in string unique?
 * Using only ASCII chars.
 * @author apodkutin
 */
public class IsAllCharactersUnique {

	private static int ALL_ASCII_CHARS_QUANTITY = 256;

	public static boolean isAllCharactersUnique(String str) {
		if (str.length() > ALL_ASCII_CHARS_QUANTITY) {
			return false;
		}

		boolean[] charSet = new boolean[ALL_ASCII_CHARS_QUANTITY];
		for (int i = 0; i < str.length(); i++) {
			int charCode = str.charAt(i);
			if (charSet[charCode]) {
				return false;
			} else {
				charSet[charCode] = true;
			}
		}
		return true;
	}
}
