package kyu7;

import java.util.Arrays;

/**
 * Developed skills: fundamentals, strings.
 *  
 * In this little assignment you are given a string of space separated numbers,
 * and have to return the highest and lowest number.
 * 
 * Example: 
 * highAndLow("1 2 3 4 5") // return "5 1" 
 * highAndLow("1 2 -3 4 5") // return "5 -3" 
 * highAndLow("1 9 3 4 -5") // return "9 -5"
 * 
 * Notes: All numbers are valid Int32, no need to validate them. There will
 * always be at least one number in the input string. Output string must be two
 * numbers separated by a single space, and highest number is first.
 */

public class HighestAndLowest {
	public static String highAndLow(String numbers) {
		String[] noSpaces = numbers.split(" ");
		int[] numbersList  = new int[noSpaces.length];

		
		for (int i = 0; i < numbersList.length; i++) {
			numbersList[i] = Integer.parseInt(noSpaces[i]);
		}
		
		Arrays.sort(numbersList);
		
		// Test
		// System.out.println(Integer.toString(numbersList[numbersList.length-1]) + " " + Integer.toString(numbersList[0]));
		
		return Integer.toString(numbersList[numbersList.length-1]) + " " + Integer.toString(numbersList[0]);
	}
}
