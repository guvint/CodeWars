/**
 * 
 */
package kyu6;

/**
 * Developed skills: ALGORITHM MATHEMATICS NUMBERS ARITHMETIC
 *
 * Digital root is the recursive sum of all the digits in a number.
 * 
 * Given n, take the sum of the digits of n. If that value has more than one
 * digit, continue reducing in this way until a single-digit number is produced.
 * The input will be a non-negative integer.
 * 
 * Examples 
 * 16 --> 1 + 6 = 7 
 * 942 --> 9 + 4 + 2 = 15 --> 1 + 5 = 6 
 * 132189 --> 1 + 3 + 2 + 1 + 8 + 9 = 24 --> 2 + 4 = 6 
 * 493193 --> 4 + 9 + 3 + 1 + 9 + 3 = 29 --> 2 + 9 = 11 --> 1 + 1 = 2
 */
public class DRoot {
	public static int digital_root(int n) {

		char[] characters = Integer.toString(n).toCharArray();
		int sum = 0;

		for (char character : characters) {
			int x = Integer.parseInt(Character.toString(character));
			sum += x;
		}
		if (sum >= 10) {
			return digital_root(sum);
		} else {
			return sum;
		}
	}

	public static void main(String[] args) {
		System.out.println(DRoot.digital_root(16));
		System.out.println(DRoot.digital_root(456));
	}
}
