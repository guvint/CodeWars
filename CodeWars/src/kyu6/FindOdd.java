package kyu6;

/**
 * Developed skills: fundamentals.
 * 
 * Given an array of integers, find the one that appears an odd number of times.
 * There will always be only one integer that appears an odd number of times.
 */
public class FindOdd {
	public static int findIt(int[] a) {
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			int number = a[i];

			for (int j = 0; j < a.length; j++) {
				if (a[j] == number) {
					count++;
				}
			}

			if (!(count % 2 == 0)) {
				return number;
			}
		}

		return 0;
	}
}