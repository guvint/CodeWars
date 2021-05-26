package kyu8;

/**
 * Developed skills: FUNDAMENTALS,MATHEMATICS, ALGORITHMS, NUMBERS
 * 
 * Create a function that takes an integer as an argument and returns "Even" for
 * even numbers or "Odd" for odd numbers.
 */

public class EvenOrOdd {
	public static String even_or_odd(int number) {

		if (number % 2 == 0) {
			return "Even";
		} else {
			return "Odd";
		}
	}
}