package com.puzzlesjava.solutions.cs;

/**
 * Is equals two positive numbers with different base. For example binary to hex.
 * @author apodkutin
 * TODO: comments
 */
public class IsEqualsTwoNumbersWithDifferentBase {

	public static boolean isEqualsBinToHex(String binary, String hex) {
		int binaryNumber = convertToDecimal(binary.toLowerCase(), 2);
		int hexNumber = convertToDecimal(hex.toLowerCase(), 16);

		if (binaryNumber < 0 || hexNumber < 0) {
			return false;
		} else {
			return binaryNumber == hexNumber;
		}
	}

	private static int convertToDecimal(String number, int base) {
		if (base < 2 || (base > 10  && base != 16)) {
			return -1;
		}

		int value = 0;

		for (int i = number.length() -1; i >= 0; i--) {
			int digit = digitToDecimalPresentation(number.charAt(i));
			if(digit < 0 || digit >= base) {
				return -1;
			}
			int exp = number.length() - 1 - i;
			value += digit * Math.pow(base, exp);
		}
		return value;
	}

	private static int digitToDecimalPresentation(char character) {
		if (character >= '0' && character <= '9') {
			return character - '0';
		} else if (character >= 'a' && character <= 'f') {
			return character + 10 - 'a';
		} else {
			return -1;
		}
	}
}
