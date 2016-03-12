package com.puzzlesjava.solutions.cs;

/**
 * Check that one string is permutation of another.
 * @author apodkutin
 */
public class StringPermutation {

	public static boolean isOneStringPermutationOfAnother(String firstStr,
		String secondStr) {

		int firstStrCharCodesSum = summarizeCharsOfString(firstStr);
		int secondStrCharCodesSum = summarizeCharsOfString(secondStr);

		return firstStrCharCodesSum == secondStrCharCodesSum;
	}

	private static int summarizeCharsOfString(String str) {
		int resultSumOfCharCodes = 0;
		for (int i = 0; i < str.length(); i++) {
			 resultSumOfCharCodes += str.charAt(i);
		}

		return resultSumOfCharCodes;
	}

}