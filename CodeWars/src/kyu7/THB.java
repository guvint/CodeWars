package kyu7;
/*
 * Developed skills: fundamentals, strings.
 * 
 * Help! THB has gone missing, and we need you to find him! You will be given a string, and must return a string 
 * including only the t's, h's, and b's from the original string. Include both uppercase and lowercase.
 * Remember, you should return an empty string if you are given an empty string or a null string. Good luck! 
 */

public class THB {
	
	public String testing(String initial) {
		String newString = "";

		//Return empty String in empty and null Strings.
		if (initial == "") {
			return newString;
		} else if (initial == null) {
			return newString;
		}

		//Replace all characters but thbTBH with "".
		newString = initial.replaceAll("[^tbhTBH]", "");

		return newString;
	}
}