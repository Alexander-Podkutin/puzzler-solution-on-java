package com.puzzlesjava.solutions.arrays;

/**
 * Swap min and max element of array.
 * @author apodkutin
 */
public class SwapMinMax {

	public static void swapMinMax(int[] array) {
		int minElement = getMinElementIndex(array);
		int maxElement = getMaxElementIndex(array);
		swap(array, minElement, maxElement);
	}

	private static void swap(int[] array, int minElementIndex, int maxElementIndex) {
		int temp = array[minElementIndex];
		array[minElementIndex] = array[maxElementIndex];
		array[maxElementIndex] = temp;
		/*
		Another way without third variable
		array[minElementIndex] = array[minElementIndex] + array[maxElementIndex];
		array[maxElementIndex] = array[minElementIndex] - array[maxElementIndex];
		array[minElementIndex] = array[minElementIndex] - array[maxElementIndex];
		*/

		/* Another way without third variable XOR swap
		https://en.wikipedia.org/wiki/XOR_swap_algorithm
		array[minElementIndex] = array[minElementIndex] ^ array[maxElementIndex];
		array[maxElementIndex] = array[maxElementIndex] ^ array[minElementIndex];
		array[minElementIndex] = array[minElementIndex] ^ array[maxElementIndex];
		 */
	}

	private static int getMaxElementIndex(int[] array) {
		int maxElementIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > array[maxElementIndex]) {
				maxElementIndex = i;
			}
		}

		return maxElementIndex;
	}

	private static int getMinElementIndex(int[] array) {
		int minElementIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < array[minElementIndex]) {
				minElementIndex = i;
			}
		}

		return minElementIndex;
	}
}
