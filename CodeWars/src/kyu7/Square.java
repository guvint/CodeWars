package kyu7;

/**
 * Developed skills: fundamentals
 * 
 * Task: 
 * Given an integral number, determine if it's a square number: 
 * "In mathematics, a square number or perfect square is an integer that is the
 * square of an integer; in other words, it is the product of some integer with
 * itself.
 * 
 * Examples 
 * -1 => false 
 *  0 => true 
 *  3 => false 
 *  4 => true 
 * 25 => true 
 * 26 => false
 */
public class Square {
	public static boolean isSquare(int n) {
		System.out.println("n = " + n + " squareRoot = " + Math.sqrt(n) + " Boolean: " + (Math.sqrt(n) % 1 == 0));
		
		return Math.sqrt(n) % 1 == 0;
	}
}
