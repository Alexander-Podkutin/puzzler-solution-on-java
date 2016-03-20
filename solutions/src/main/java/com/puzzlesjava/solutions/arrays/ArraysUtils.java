package com.puzzlesjava.solutions.arrays;

import java.util.Random;

/**
 * Utility class for working with arrays.
 *
 * @author apodkutin
 */
public class ArraysUtils {


	public static void fillTwoDimensionalArray(int[][] twoDimArray) {

		Random randomInt = new Random();

		for (int i = 0; i < twoDimArray.length; i++) {
			for (int j = 0; j < twoDimArray[i].length; j++) {
				twoDimArray[i][j] = randomInt.nextInt(20);
			}
		}
	}

	public static String twoDimensionalArrayToString(int[][] twoDimArray) {

		StringBuilder resultString = new StringBuilder();
		StringBuilder numbersString = null;

		for (int i = 0; i < twoDimArray.length; i++) {

			resultString.append("{");
			numbersString = new StringBuilder((twoDimArray[i].length * 3) - 2);

			for (int j = 0; j < twoDimArray[i].length; j++) {

				numbersString.append(twoDimArray[i][j]);
				if (j != twoDimArray[i].length - 1) {
					numbersString.append(", ");
				}
			}

			resultString.append(numbersString);
			resultString.append("} \n");
		}
		return resultString.toString();
	}
}
