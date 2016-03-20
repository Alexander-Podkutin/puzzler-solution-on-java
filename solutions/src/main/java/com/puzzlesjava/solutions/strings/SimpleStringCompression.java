package com.puzzlesjava.solutions.strings;

/**
 * Simple string compression using counts of repeated characters/
 * @author apodkutin
 */
public class SimpleStringCompression {

	/**
	 * Compress string with counts of repeated characters.
	 * If compressed string longer than input string, return input string
	 *
	 * @param str string before compression
	 * @return string after compression or input string
	 */
	public static String compressString(String str) {
		int resultSize = sizeAfterCompression(str);
		if (resultSize >= str.length()) {
			return str;
		}

		char[] resultCharArray = new char[resultSize];
		int index = 0;
		char lastChar = str.charAt(0);
		int count = 1;

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == lastChar) {
				count++;
			} else {
				index = setResultChar(str, resultCharArray, lastChar, index, count);
				lastChar = str.charAt(i);
				count = 1;
			}
		}

		setResultChar(str, resultCharArray, lastChar, index, count);
		return String.valueOf(resultCharArray);

	}

	private static int setResultChar(String str, char[] resultCharArray,
	    char lastChar, int index, int count) {

		resultCharArray[index] = lastChar;
		index++;

		char[] countInChars = String.valueOf(count).toCharArray();

		for (char charNum : countInChars) {
			resultCharArray[index] = charNum;
			index++;
		}

		return index;
	}

	private static int sizeAfterCompression(String inputStr) {
		char lastChar = inputStr.charAt(0);
		int size = 0;
		int count = 1;

		for (int i = 1; i < inputStr.length(); i++) {
			if (inputStr.charAt(i) == lastChar) {
				count++;
			} else {
				lastChar = inputStr.charAt(i);
				size += 1 + String.valueOf(count).length();
				count = 1;
			}
		}

		size += 1 + String.valueOf(count).length();
		return size;
	}
}
