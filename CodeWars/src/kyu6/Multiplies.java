package kyu6;

/**
 * Developed skills: ALGORITHMS, MATHEMATICS, NUMBERS.
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * If a number is negative, return 0.
 * 
 * Finish the solution so that it returns the sum of all the multiples of 3 or 5
 * below the number passed in.
 */
public class Multiplies {

	public int solution(int number) {
		int n = 0;

		for (int i = 0; i < number; i++) {
			if (i < 0) {
				n += 0;
			} else if (i % 3 == 0 || i % 5 == 0) {
				n += i;
			} 
		}

		return n;
	}
}