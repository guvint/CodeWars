package kyu7;

import java.util.Arrays;
import java.util.Collections;

/**
 * Developed skills: FUNDAMENTALS, FUNCTIONS, CONTROL FLOW, BASIC LANGUAGE, FEATURES
 *
 * Your task is to make a function that can take any non-negative integer as an 
 * argument and return it with its digits in descending order. Essentially,
 * rearrange the digits to create the highest possible number.
 * 
 * Examples: Input: 42145 Output: 54421
 * 
 * Input: 145263 Output: 654321
 * 
 * Input: 123456789 Output: 987654321
 */
public class DescendingOrder {
	public static int sortDesc(final int num) {
		
		//num is put into an array and split into single int's
		String[] array = String.valueOf(num).split("");
		
		//array is sorted in reverse order
        Arrays.sort(array, Collections.reverseOrder());
        
        //the int's in array is put into a string and converted to an int.
        int i = Integer.valueOf(String.join("", array));
        
        return i;
        
		/*
		
		Old solution:
		
		List<String> stringList = new ArrayList<>();

		//num is put into stringList
		for (int i = 0; i < String.valueOf(num).length(); i++) {
			stringList.add(i, String.valueOf(num).substring(i, i + 1));
		}

		//stringList is sorted in reverse order
		Collections.sort(stringList, Collections.reverseOrder());
		
		String s = "";
		
		//stringList is converted to a String s
		for (String digit : stringList) {
			s = s.concat(digit);
		}
		
		//s is converted to an int and returned
		return Integer.parseInt(s);
		*/
	}
}
