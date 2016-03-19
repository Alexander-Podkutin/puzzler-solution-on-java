package com.puzzlesjava.solutions.arrays;

/**
 * Replace all spaces with '%20'.
 * @author apodkutin
 */
public class ReplaceSpacesWith20 {

	public static char SPACE_CHARACTER = ' ';

	public static String replaceAllSpacesWith20(String str) {
		int spaceCount = 0;
		int newLength = 0;
		char[] strChars = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			if (strChars[i] == SPACE_CHARACTER) {
				spaceCount++;
			}
		}

		newLength = str.length() + (spaceCount * 2);
		char[] resultStrChars = new char[newLength];

		for (int i = str.length() - 1; i >= 0; i--) {
			if (strChars[i] == SPACE_CHARACTER) {
				resultStrChars[newLength - 1] = '0';
				resultStrChars[newLength - 2] = '2';
				resultStrChars[newLength - 3] = '%';
				newLength -= 3;
			} else {
				resultStrChars[newLength - 1] = strChars[i];
				newLength -= 1;
			}
		}

		return String.valueOf(resultStrChars);
	}
}
