package kyu6;

/**
 * Developed skills: ALGORITHMS ARRAYS STRINGS LOOPS CONTROL FLOW BASIC LANGUAGE FEATURES FUNDAMENTALS FORMATTING REGULAR EXPRESSIONS DECLARATIVE PROGRAMMING ADVANCED LANGUAGE FEATURES
 * 
 * Write a function that accepts an array of 10 integers (between 0 and 9), that
 * returns a string of those numbers in the form of a phone number.
 * 
 * Example: Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) 
 * // returns "(123) 456-7890"
 */
public class CreatePhoneNumber {
	public static String createPhoneNumber(int[] numbers) {
		
		String pn = "(" + numbers[0] + numbers[1] + numbers[2] + ") " + numbers[3] + numbers[4] + numbers[5] + "-"
				+ numbers[6] + numbers[7] + numbers[8] + numbers[9];

		return pn;
	}
}
