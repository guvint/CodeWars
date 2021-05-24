package kyu7;
/*
 * Developed skills: fundamentals, strings.
 * 
 * Description:
 * The aim of this kata is to split a given string into different strings of equal size (note size of strings is 
 * passed to the method)
 * 
 * Example:
 * Split the below string into other strings of size #3
 * 'supercalifragilisticexpialidocious'
 * Will return a new string
 * 'sup erc ali fra gil ist ice xpi ali doc iou s'
 * 
 * Assumptions:
 * String length is always greater than 0
 * String has no spaces
 * Size is always positive
 */

public class InParts {
	public static String splitInParts(String s, int partLength) {
		//initializing strings
		String remaining = s;
		String result = "";

		//split string into size, partLength, and storing in result.
		while (remaining.length() >= partLength) {
			result += remaining.substring(0, partLength);
			remaining = remaining.substring(partLength);
			if (remaining.length() > 0) {
				result += " ";
			}
		}

		//adding remainder to string, result.
		if (remaining.length() > 0) {
			return result + remaining;
		}

		return result;
	}
}