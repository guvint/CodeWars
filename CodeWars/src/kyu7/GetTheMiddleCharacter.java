package kyu7;

/**
 * Developed skills: fundamentals, strings.
 * 
 * You are going to be given a word. Your job is to return the middle character
 * of the word. If the word's length is odd, return the middle character. If the
 * word's length is even, return the middle 2 characters.
 * 
 * #Examples: 
 * Kata.getMiddle("test") should return "es"
 * Kata.getMiddle("testing") should return "t" 
 * Kata.getMiddle("middle") should return "dd" 
 * Kata.getMiddle("A") should return "A"
 * 
 * #Input
 * A word (string) of length 0 < str < 1000. You do not need to test for this.
 * This is only here to tell you that you do not need to worry about your
 * solution timing out.
 * 
 * #Output
 * The middle character(s) of the word represented as a string.
 */
public class GetTheMiddleCharacter {
	public static String getMiddle(String word) {
		String middle = "";
		int midLength1 = word.length() / 2 - 1;
		int midLength2 = word.length() / 2;

		if ((word.length() % 2) == 0) {
			// even
			middle = Character.toString(word.charAt(midLength1)) + Character.toString(word.charAt(midLength2));
		} else {
			// odd
			middle = Character.toString(word.charAt(midLength2));
		}

		return middle;
	}
}
