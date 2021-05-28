package kyu7;

/**
 * Developed skills: FUNDAMENTALS, MATHEMATICS, ALGORITHMS, NUMBERS
 * 
 * Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
 * For example, if we run 9119 through the function, 811181 will come out, because 9^2 is 81 and 1^2 is 1.
 * Note: The function accepts an integer and returns an integer
 */

public class SquareDigit {

	public int squareDigits(int n) {
		String newN = "";

		for (int i = 0; i < String.valueOf(n).length(); i++) {
			int digit = Integer.parseInt(Integer.toString(n).substring(i, i+1));
			int square = digit * digit;
			
			newN += square;
		}

		int newNumber = Integer.parseInt(newN);
		
		return newNumber;
	}
}
