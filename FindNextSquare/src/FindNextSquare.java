/*
 * Developed skills: fundamentals, numbers, algebra, mathematics, algorithms.
 * 
 * You might know some pretty large perfect squares. But what about the NEXT one?
 * Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter. Recall that 
 * an integral perfect square is an integer n such that sqrt(n) is also an integer.
 * If the parameter is itself not a perfect square then -1 should be returned. You may assume the parameter is non-negative.
 */

public class FindNextSquare {

	public static long numberFun(long sq) {
		// Converting long to int.
		double input = (double) sq;
		// Finding the square root of input and converting to int.
		int sqrt = (int) Math.sqrt(input);
		// Checking if input is itself a perfect square.
		boolean perfectSq = (Math.sqrt(input) % 1) == 0;

		if (perfectSq == true) {
			long result = (long) ((sqrt + 1) * (sqrt + 1));

			return result;
		}

		return -1;
	}
}